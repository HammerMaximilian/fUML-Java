package pscs.semantics.structuredclassifiers;

import fuml.semantics.actions.CallOperationActionActivation;
import fuml.semantics.actions.SendSignalActionActivation;
import fuml.semantics.commonbehavior.EventOccurrence;
import fuml.semantics.commonbehavior.Execution;
import fuml.semantics.loci.ChoiceStrategy;
import fuml.semantics.simpleclassifiers.FeatureValue;
import fuml.semantics.simpleclassifiers.FeatureValueList;
import fuml.semantics.structuredclassifiers.ExtensionalValue;
import fuml.semantics.structuredclassifiers.ExtensionalValueList;
import fuml.semantics.structuredclassifiers.Object_;
import fuml.semantics.structuredclassifiers.Reference;
import fuml.semantics.structuredclassifiers.ReferenceList;
import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;
import pscs.semantics.commonbehavior.CS_CallEventExecution;
import uml.classification.Classifier;
import uml.classification.ClassifierList;
import uml.classification.Operation;
import uml.classification.StructuralFeature;
import uml.commonstructure.NamedElement;
import uml.commonstructure.NamedElementList;
import uml.simpleclassifiers.Interface;
import uml.simpleclassifiers.InterfaceList;
import uml.simpleclassifiers.InterfaceRealization;
import uml.simpleclassifiers.InterfaceRealizationList;
import uml.structuredclassifiers.Class_;
import uml.structuredclassifiers.ConnectorKind;
import uml.structuredclassifiers.Port;

public class CS_Object extends Object_ {

    public Execution dispatchIn(Operation operation, CS_InteractionPoint interactionPoint)
    {
        // If the interaction point refers to a behavior port, the operation call is
        // dispatched
        // to the object owning the behavior port. This may result in the method being
        // handled
        // by the method defined for the operation at the object or through a call event
        // handled
        // by the classifier behavior of the owning object. The latter case only occurs
        // if the
        // dispatched operation has no implementation
        // If it does not refer to a behavior port, select appropriate delegation links
        // from interactionPoint, and propagates the operation call through
        // these links
        Execution execution = null;
        if ((interactionPoint.definingPort.isBehavior))
        {
            execution = dispatch(operation);
            if (execution instanceof CS_CallEventExecution cS_CallEventExecution)
            {
                cS_CallEventExecution.interactionPoint = interactionPoint;
            }
        }
        else
        {
            boolean operationIsProvided = true;
            ReferenceList potentialTargets = new ReferenceList();
            CS_LinkList cddLinks = getLinks(interactionPoint);
            int linkIndex = 1;
            while (linkIndex <= cddLinks.size())
            {
                ReferenceList validTargets = selectTargetsForDispatching(cddLinks.get(linkIndex - 1),
                        interactionPoint, ConnectorKind.delegation, operation, operationIsProvided);
                int targetIndex = 1;
                while (targetIndex <= validTargets.size())
                {
                    potentialTargets.add(validTargets.get(targetIndex - 1));
                    targetIndex++;
                }
                linkIndex++;
            }
            // If potentialTargets is empty, no delegation target have been found,
            // and the operation call will be lost
            if (!(potentialTargets.size() == 0))
            {
                CS_RequestPropagationStrategy strategy = (CS_RequestPropagationStrategy)locus.factory.getStrategy("requestPropagation");
                // Choose one target non-deterministically
                ReferenceList targets = strategy.select(potentialTargets, new CallOperationActionActivation());
                Reference target = targets.get(0);
                execution = target.dispatch(operation);
            }
        }
        return execution;
    }

    public void sendIn(EventOccurrence eventOccurrence, CS_InteractionPoint interactionPoint)
    {
        // 1] If the interaction is a behavior port then sends the event occurrence to
        // the target
        // object using operation send.
        // 2] If this is not a behavior port, select appropriate delegation targets from
        // interactionPoint,
        // and propagates the event occurrence to these targets
        if ((interactionPoint.definingPort.isBehavior))
        {
            send(eventOccurrence);
        }
        else
        {
            boolean toInternal = true;
            ReferenceList potentialTargets = new ReferenceList();
            CS_LinkList cddLinks = getLinks(interactionPoint);
            int linkIndex = 1;
            while (linkIndex <= cddLinks.size())
            {
                ReferenceList validTargets = selectTargetsForSending(cddLinks.get(linkIndex - 1),
                        interactionPoint, ConnectorKind.delegation, toInternal);
                int targetIndex = 1;
                while (targetIndex <= validTargets.size())
                {
                    potentialTargets.add(validTargets.get(targetIndex - 1));
                    targetIndex++;
                }
                linkIndex++;
            }
            // If potential targets is empty, no delegation target has been found,
            // and the signal is lost
            // Otherwise, do the following concurrently
            for (Reference target : potentialTargets)
            {
                target.send(eventOccurrence);
            }
        }
    }

    public ReferenceList selectTargetsForSending(CS_Link link, CS_InteractionPoint interactionPoint,
        ConnectorKind connectorKind, boolean toInternal)
    {
        // From the given link, signal and interaction point, retrieves potential
        // targets (i.e. end values of link)
        // through which request can be propagated
        // These targets are attached to interaction point through the given link, and
        // respect the following rules:
        // - if toInternal is true, connectorKind must be Delegation, the given link has
        // to target the internals of this CS_Object
        // - if toInternal is false, the given link has to target the environment of
        // this CS_Object.
        ReferenceList potentialTargets = new ReferenceList();
        if (toInternal && connectorKind == ConnectorKind.delegation)
        {
            if (getLinkKind(link, interactionPoint) == CS_LinkKind.ToInternal)
            {
                int i = 1;
                while (i <= link.getFeatureValues().size())
                {
                    ValueList values = link.getFeatureValues().get(i - 1).values;
                    if (!values.isEmpty())
                    {
                        int j = 1;
                        while (j <= values.size())
                        {
                            Reference cddTarget = (Reference)values.get(j - 1);
                            if (!cddTarget.equals(interactionPoint))
                            {
                                potentialTargets.add(cddTarget);
                            }
                            j++;
                        }
                    }
                    i++;
                }
            }
        }
        else
        { // to Environment
            if (getLinkKind(link, interactionPoint) == CS_LinkKind.ToEnvironment)
            {
                int i = 1;
                while (i <= link.getFeatureValues().size())
                {
                    ValueList values = link.getFeatureValues().get(i - 1).values;
                    if (!values.isEmpty() && values.get(0) instanceof Reference reference)
                    {
                        Reference cddTarget = reference;
                        if (connectorKind == ConnectorKind.assembly)
                        {
                            if (!(cddTarget instanceof CS_InteractionPoint))
                            { // This is an assembly link
                                potentialTargets.add(cddTarget);
                            }
                            else
                            {
                                // This is an assembly if the interaction point is not a feature value
                                // for a container of this CS_Object
                                CS_ObjectList directContainers = getDirectContainers();
                                boolean isAssembly = true;
                                int j = 1;
                                if (!hasValueForAFeature(cddTarget))
                                {
                                    while (isAssembly && j <= directContainers.size())
                                    {
                                        CS_Object container = directContainers.get(j - 1);
                                        if (container.hasValueForAFeature(cddTarget))
                                        {
                                            isAssembly = false;
                                        }
                                        j++;
                                    }
                                }
                                else
                                {
                                    isAssembly = false;
                                }
                                if (isAssembly)
                                {
                                    potentialTargets.add(cddTarget);
                                }
                            }
                        }
                        else
                        { // delegation
                          // This is a delegation if the target is an interaction point
                          // and if this interaction is a feature value for a container of this CS_Object
                            if (cddTarget instanceof CS_InteractionPoint)
                            {
                                CS_ObjectList directContainers = getDirectContainers();
                                boolean isDelegation = false;
                                int j = 1;
                                while (!isDelegation && j <= directContainers.size())
                                {
                                    CS_Object container = directContainers.get(j - 1);
                                    if (container.hasValueForAFeature(cddTarget))
                                    {
                                        isDelegation = true;
                                    }
                                    j++;
                                }
                                if (isDelegation)
                                {
                                    potentialTargets.add(cddTarget);
                                }
                            }
                        }
                    }
                    i++;
                }
            }
        }
        return potentialTargets;
    }

    public ReferenceList selectTargetsForDispatching(CS_Link link, CS_InteractionPoint interactionPoint,
        ConnectorKind connectorKind, Operation operation, boolean toInternal)
    {
        // From the given link, operation and interaction point, retrieves potential
        // targets (i.e. end values of link)
        // through which request can be propagated
        // These targets are attached to interaction point through the given link, and
        // respect the following rules:
        // - if isProvided is true, connectorKind must be Delegation, the given link has
        // to target the internals of this CS_Object,
        // and a valid target must provide the Operation
        // - if isProvided is false, the given link has to target the environment of
        // this CS_Object.
        // - if connectorKind is assembly, a valid target has to provide the operation
        // - if connectorKind is delegation, a valid target has to require the operation
        ReferenceList potentialTargets = new ReferenceList();
        if (toInternal && connectorKind == ConnectorKind.delegation)
        {
            if (getLinkKind(link, interactionPoint) == CS_LinkKind.ToInternal)
            {
                int i = 1;
                while (i <= link.getFeatureValues().size())
                {
                    ValueList values = link.getFeatureValues().get(i - 1).values;
                    if (!values.isEmpty() && values.get(0) instanceof Reference reference)
                    {
                        Reference cddTarget = reference;
                        if (cddTarget != interactionPoint && isOperationProvided(cddTarget, operation))
                        {
                            potentialTargets.add(cddTarget);
                        }
                    }
                    i++;
                }
            }
        }
        else
        { // to environment
            if (getLinkKind(link, interactionPoint) == CS_LinkKind.ToEnvironment)
            {
                int i = 1;
                while (i <= link.getFeatureValues().size())
                {
                    ValueList values = link.getFeatureValues().get(i - 1).values;
                    if (!values.isEmpty() && values.get(0) instanceof Reference reference)
                    {
                        Reference cddTarget = reference;
                        if (connectorKind == ConnectorKind.assembly)
                        {
                            if (!(cddTarget instanceof CS_InteractionPoint))
                            { // This is an assembly link
                                if (isOperationProvided(cddTarget, operation))
                                {
                                    potentialTargets.add(cddTarget);
                                }
                            }
                            else
                            {
                                // This is an assembly if the interaction point is not a feature value
                                // for a container of this CS_Object
                                CS_ObjectList directContainers = getDirectContainers();
                                boolean isAssembly = true;
                                int j = 1;
                                if (!hasValueForAFeature(cddTarget))
                                {
                                    while (isAssembly && j <= directContainers.size())
                                    {
                                        CS_Object container = directContainers.get(j - 1);
                                        if (container.hasValueForAFeature(cddTarget))
                                        {
                                            isAssembly = false;
                                        }
                                        j++;
                                    }
                                }
                                else
                                {
                                    isAssembly = false;
                                }
                                if (isAssembly)
                                {
                                    if (isOperationProvided(cddTarget, operation))
                                    {
                                        potentialTargets.add(cddTarget);
                                    }
                                }
                            }
                        }
                        else
                        { // delegation
                          // This is a delegation if the target is an interaction point
                          // and if this interaction is a feature value for a container of this CS_Object
                            if (cddTarget instanceof CS_InteractionPoint)
                            {
                                CS_ObjectList directContainers = getDirectContainers();
                                boolean isDelegation = false;
                                int j = 1;
                                while (!isDelegation && j <= directContainers.size())
                                {
                                    CS_Object container = directContainers.get(j - 1);
                                    if (container.hasValueForAFeature(cddTarget))
                                    {
                                        isDelegation = true;
                                    }
                                    j++;
                                }
                                if (isDelegation)
                                {
                                    if (isOperationRequired(cddTarget, operation))
                                    {
                                        potentialTargets.add(cddTarget);
                                    }
                                }
                            }
                        }
                    }
                    i++;
                }
            }
        }
        return potentialTargets;
    }

    public void sendOut(EventOccurrence eventOccurrence, CS_InteractionPoint interactionPoint)
    {
        // Select appropriate delegation links from interactionPoint,
        // and propagates the event occurrence through these links
        // Appropriate links are links which target elements
        // in the environment of this CS_Object.
        // These can be delegation links (i.e, the targeted elements must
        // require a reception for the signal) or assembly links (i.e., the target
        // elements
        // must provide a reception for the signal)
        boolean notToInternal = false; // i.e. to environment
        ReferenceList allPotentialTargets = new ReferenceList();
        ReferenceList targetsForSendingIn = new ReferenceList();
        ReferenceList targetsForSendingOut = new ReferenceList();
        CS_LinkList cddLinks = getLinks(interactionPoint);
        int linkIndex = 1;
        while (linkIndex <= cddLinks.size())
        {
            ReferenceList validAssemblyTargets = selectTargetsForSending(cddLinks.get(linkIndex - 1),
                    interactionPoint, ConnectorKind.assembly, notToInternal);
            int targetIndex = 1;
            while (targetIndex <= validAssemblyTargets.size())
            {
                allPotentialTargets.add(validAssemblyTargets.get(targetIndex - 1));
                targetsForSendingIn.add(validAssemblyTargets.get(targetIndex - 1));
                targetIndex++;
            }
            ReferenceList validDelegationTargets = selectTargetsForSending(cddLinks.get(linkIndex - 1),
                    interactionPoint, ConnectorKind.delegation, notToInternal);
            targetIndex = 1;
            while (targetIndex <= validDelegationTargets.size())
            {
                allPotentialTargets.add(validDelegationTargets.get(targetIndex - 1));
                targetsForSendingOut.add(validDelegationTargets.get(targetIndex - 1));
                targetIndex++;
            }
            linkIndex++;
        }
        CS_RequestPropagationStrategy strategy = (CS_RequestPropagationStrategy)locus.factory.getStrategy("requestPropagation");
        ReferenceList selectedTargets = strategy.select(allPotentialTargets, new SendSignalActionActivation());
        for (int j = 0; j < selectedTargets.size(); j++)
        {
            Reference target = selectedTargets.get(j);
            for (int k = 0; k < targetsForSendingIn.size(); k++)
            {
                Reference cddTarget = targetsForSendingIn.get(k);
                if (cddTarget == target)
                {
                    target.send(eventOccurrence);
                }
            }
            for (int k = 0; k < targetsForSendingOut.size(); k++)
            {
                // The target must be an interaction point
                // i.e. a delegation connector for a required reception can only target a port
                CS_InteractionPoint cddTarget = (CS_InteractionPoint)targetsForSendingOut.get(k);
                if (cddTarget == target)
                {
                    CS_Reference owner = cddTarget.owner;
                    owner.sendOut(eventOccurrence, cddTarget);
                }
            }
        }
    }

    public Execution dispatchOut(Operation operation, CS_InteractionPoint interactionPoint)
    {
        // Select appropriate delegation links from interactionPoint,
        // and propagates the operation call through these links
        // Appropriate links are links which target elements
        // in the environment of this CS_Object.
        // These can be delegation links (i.e, the targeted elements must
        // require the operation) or assembly links (i.e., the target elements
        // must provide the operation)
        Execution execution = null;
        boolean notToInternal = false; // i.e. to environment
        ReferenceList allPotentialTargets = new ReferenceList();
        ReferenceList targetsForDispatchingIn = new ReferenceList();
        ReferenceList targetsForDispatchingOut = new ReferenceList();
        CS_LinkList cddLinks = getLinks(interactionPoint);
        int linkIndex = 1;
        while (linkIndex <= cddLinks.size())
        {
            ReferenceList validAssemblyTargets = selectTargetsForDispatching(cddLinks.get(linkIndex - 1),
                    interactionPoint, ConnectorKind.assembly, operation, notToInternal);
            int targetIndex = 1;
            while (targetIndex <= validAssemblyTargets.size())
            {
                allPotentialTargets.add(validAssemblyTargets.get(targetIndex - 1));
                targetsForDispatchingIn.add(validAssemblyTargets.get(targetIndex - 1));
                targetIndex++;
            }
            ReferenceList validDelegationTargets = selectTargetsForDispatching(cddLinks.get(linkIndex - 1),
                    interactionPoint, ConnectorKind.delegation, operation, notToInternal);
            targetIndex = 1;
            while (targetIndex <= validDelegationTargets.size())
            {
                allPotentialTargets.add(validDelegationTargets.get(targetIndex - 1));
                targetsForDispatchingOut.add(validDelegationTargets.get(targetIndex - 1));
                targetIndex++;
            }
            linkIndex++;
        }
        CS_RequestPropagationStrategy strategy = (CS_RequestPropagationStrategy)locus.factory.getStrategy("requestPropagation");
        ReferenceList selectedTargets = strategy.select(allPotentialTargets, new SendSignalActionActivation());
        for (int j = 0; j < selectedTargets.size(); j++)
        {
            Reference target = selectedTargets.get(j);
            for (int k = 0; k < targetsForDispatchingIn.size() && execution == null; k++)
            {
                Reference cddTarget = targetsForDispatchingIn.get(k);
                if (cddTarget == target)
                {
                    execution = target.dispatch(operation);
                }
            }
            for (int k = 0; k < targetsForDispatchingOut.size() && execution == null; k++)
            {
                // The target must be an interaction point
                // i.e. a delegation connector for a required operation can only target a port
                CS_InteractionPoint cddTarget = (CS_InteractionPoint)targetsForDispatchingOut.get(k);
                if (cddTarget == target)
                {
                    CS_Reference owner = cddTarget.owner;
                    execution = owner.dispatchOut(operation, cddTarget);
                }
            }
        }
        return execution;
    }

    @Override
    public FeatureValue getFeatureValue(StructuralFeature feature)
    {
        // In the case where the feature belongs to an Interface,
        // fUML semantics is extended in the sense that reading is
        // delegated to a CS_StructuralFeatureOfInterfaceAccessStrategy
        if (feature.namespace instanceof Interface)
        {
            CS_StructuralFeatureOfInterfaceAccessStrategy readStrategy = (CS_StructuralFeatureOfInterfaceAccessStrategy)locus.factory.getStrategy("structuralFeature");
            return readStrategy.read(this, feature);
        }
        else
        {
            return super.getFeatureValue(feature);
        }
    }

    @Override
    public void setFeatureValue(StructuralFeature feature, ValueList values, int position)
    {
        // In the case where the feature belongs to an Interface,
        // fUML semantics is extended in the sense that writing is
        // delegated to a CS_StructuralFeatureOfInterfaceAccessStrategy
        if (feature.namespace instanceof Interface)
        {
            CS_StructuralFeatureOfInterfaceAccessStrategy writeStrategy = (CS_StructuralFeatureOfInterfaceAccessStrategy)locus.factory.getStrategy("structuralFeature");
            writeStrategy.write(this, feature, values, position);
        }
        else
        {
            super.setFeatureValue(feature, values, position);
        }
    }

    public boolean contains(Object_ object_)
    {
        // Determines if the object given as a parameter is directly
        // or indirectly contained by this CS_Object
        boolean objectIsContained = directlyContains(object_);
        // if object is not directly contained, restart the research
        // recursively on the objects owned by this CS_Object
        for (int i = 0; i < featureValues.size() && !objectIsContained; i++)
        {
            FeatureValue featureValue = featureValues.get(i);
            ValueList values = featureValue.values;
            for (int j = 0; j < values.size() && !objectIsContained; j++)
            {
                Value value = values.get(j);
                if (value instanceof CS_Object cS_Object_)
                {
                    objectIsContained = cS_Object_.contains(object_);
                }
                else if (value instanceof CS_Reference reference)
                {
                    CS_Object referent = reference.compositeReferent;
                    objectIsContained = referent.contains(object_);
                }
            }
        }
        return objectIsContained;
    }

    public boolean directlyContains(Object_ object_)
    {
        // Determines if the object given as a parameter is directly
        // contained by this CS_Object
        boolean objectIsContained = false;
        for (int i = 0; i < featureValues.size() && !objectIsContained; i++)
        {
            FeatureValue featureValue = featureValues.get(i);
            ValueList values = featureValue.values;
            for (int j = 0; j < values.size() && !objectIsContained; j++)
            {
                Value value = values.get(j);
                if (value == object_)
                {
                    objectIsContained = true;
                }
                else if (value instanceof CS_Reference reference)
                {
                    objectIsContained = reference.referent == object_;
                }
            }
        }
        return objectIsContained;
    }

    public CS_ObjectList getDirectContainers()
    {
        // Retrieves all the extensional values at this locus which are direct
        // containers for this CS_Object
        // An extensional value is a direct container for an object if:
        // - it is a CS_Object
        // - it directly contains this object (i.e.
        // CS_Object.directlyContains(Object)==true)
        CS_ObjectList containers = new CS_ObjectList();
        ExtensionalValueList extensionalValues = locus.extensionalValues;
        for (ExtensionalValue extensionalValue : extensionalValues)
        {
            if (extensionalValue != this && extensionalValue instanceof CS_Object cS_object)
            {
                CS_Object cddContainer = cS_object;
                if (cddContainer.directlyContains(this))
                {
                    containers.add(cddContainer);
                }
            }
        }
        return containers;
    }

    public boolean isOperationProvided(Reference reference, Operation operation)
    {
        // Determines if the given reference provides the operation
        // If the reference is an interaction point, it provides the operation if this
        // operation
        // is a member of one of its provided interfaces
        // If the reference is NOT an interactionPoint, it provides this operation if
        // this operation is
        // an operation of one of its type, or one of its type provides a realization
        // for this operation (in the case
        // where the namespace of this Operation is an interface)
        boolean isProvided = false;
        if (reference instanceof CS_InteractionPoint)
        {
            if (operation.owner instanceof Interface)
            {
                // We have to look in provided interfaces of the port if
                // they define directly or indirectly the Operation
                int interfaceIndex = 1;
                // Iterates on provided interfaces of the port
                InterfaceList providedInterfaces = ((CS_InteractionPoint)reference).definingPort.provided;
                while (interfaceIndex <= providedInterfaces.size() && !isProvided)
                {
                    Interface interface_ = providedInterfaces.get(interfaceIndex - 1);
                    // Iterates on members of the current Interface
                    int memberIndex = 1;
                    while (memberIndex <= interface_.member().size() && !isProvided)
                    {
                        NamedElement cddOperation = interface_.member().get(memberIndex - 1);
                        if (cddOperation instanceof Operation)
                        {
                            isProvided = operation == cddOperation;
                        }
                        memberIndex++;
                    }
                    interfaceIndex++;
                }
            }
        }
        else
        {
            // We have to look if one of the Classifiers typing this reference
            // directly or indirectly provides this operation
            ClassifierList types = reference.getTypes();
            int typeIndex = 1;
            while (typeIndex <= types.size() && !isProvided)
            {
                if (types.get(typeIndex - 1) instanceof Class_)
                {
                	Class_ class_ = (Class_)types.get(typeIndex - 1);
                    int memberIndex = 1;
                    NamedElementList members = class_.member();
                    while (memberIndex <= members.size() && !isProvided)
                    {
                        NamedElement member = members.get(memberIndex - 1);
                        if (member instanceof Operation cddOperation)
                        {
                            CS_DispatchOperationOfInterfaceStrategy strategy = new CS_DispatchOperationOfInterfaceStrategy();
                            isProvided = strategy.operationsMatch(cddOperation, operation);
                        }
                        memberIndex++;
                    }
                }
                typeIndex++;
            }
        }
        return isProvided;
    }

    public boolean isOperationRequired(Reference reference, Operation operation)
    {
        // Determines if the given reference requires the operation
        // If the reference is an interaction point, it requires the operation if this
        // operation
        // is a member of one of its required interfaces
        // If the reference is not a interaction point, it cannot require an operation
        boolean matches = false;
        if (reference instanceof CS_InteractionPoint interactionPoint)
        {
            int interfaceIndex = 1;
            // Iterates on provided interfaces of the port
            InterfaceList requiredInterfaces = interactionPoint.definingPort.required;
            while (interfaceIndex <= requiredInterfaces.size() && !matches)
            {
                Interface interface_ = requiredInterfaces.get(interfaceIndex - 1);
                // Iterates on members of the current Interface
                int memberIndex = 1;
                while (memberIndex <= interface_.member().size() && !matches)
                {
                    NamedElement cddOperation = interface_.member().get(memberIndex - 1);
                    if (cddOperation instanceof Operation)
                    {
                        matches = operation == cddOperation;
                    }
                    memberIndex++;
                }
                interfaceIndex++;
            }
        }
        return matches;
    }

    public CS_LinkKind getLinkKind(CS_Link link, CS_InteractionPoint interactionPoint)
    {
        // If the given interaction point belongs to this object, and if the given
        // interaction point is used as an end of the link,
        // then the links targets the environment of the object (enumeration literal
        // ToEnvironment) if all the feature values of the link
        // (but one for the interaction point) refer to values which are not themselves
        // values for features of this object.
        // If all the feature values of the link refer to values which are themselves
        // values for features of this object,
        // the link targets the internals of the object (enumeration literal
        // ToInternal). Otherwise, the link has no particular meaning
        // in the context defined by the object and the interaction point (enumeration
        // literal None).
        if (!link.hasValueForAFeature(interactionPoint))
        {
            return CS_LinkKind.None;
        }
        CS_LinkKind kind = CS_LinkKind.ToInternal;
        FeatureValueList featureValues = link.getFeatureValues();
        int i = 1;
        while (i <= featureValues.size() && kind != CS_LinkKind.None)
        {
            FeatureValue value = featureValues.get(i - 1);
            if (value.values.isEmpty())
            {
                kind = CS_LinkKind.None;
            }
            else
            {
                Value v = value.values.get(0);
                boolean vIsAValueForAFeatureOfContext;
                if (v.equals(interactionPoint))
                {
                    vIsAValueForAFeatureOfContext = true;
                }
                else if (v instanceof CS_InteractionPoint vAsInteractionPoint)
                {
                    v = vAsInteractionPoint.owner;
                    vIsAValueForAFeatureOfContext = hasValueForAFeature(v);
                }
                else
                {
                    vIsAValueForAFeatureOfContext = hasValueForAFeature(v);
                }
                if (!vIsAValueForAFeatureOfContext)
                {
                    kind = CS_LinkKind.ToEnvironment;
                }
            }
            i++;
        }
        return kind;
    }

    public CS_LinkList getLinks(CS_InteractionPoint interactionPoint)
    {
        // Get all links (available at the locus of this object) where the given
        // interaction point is used as a feature value
        // (i.e. the interaction is an end such links)
        ExtensionalValueList extensionalValues = locus.extensionalValues;
        int i = 1;
        CS_LinkList connectorInstances = new CS_LinkList();
        while (i <= extensionalValues.size())
        {
            ExtensionalValue value = extensionalValues.get(i - 1);
            if (value instanceof CS_Link link)
            {
                if (getLinkKind(link, interactionPoint) != CS_LinkKind.None)
                {
                    connectorInstances.add(link);
                }
            }
            i++;
        }
        return connectorInstances;
    }

    public boolean hasValueForAFeature(Value value)
    {
        // Returns true if the given value object is used as a value for a feature value
        // of this object
        FeatureValueList allFeatureValues = getFeatureValues();
        int i = 1;
        boolean isAValue = false;
        while (i <= allFeatureValues.size() && !isAValue)
        {
            FeatureValue featureValue = allFeatureValues.get(i - 1);
            if (!featureValue.values.isEmpty())
            {
                ValueList valuesForCurrentFeature = featureValue.values;
                int j = 1;
                while (j <= valuesForCurrentFeature.size() && !isAValue)
                {
                    isAValue = featureValue.values.get(j - 1).equals(value);
                    j++;
                }
            }
            i++;
        }
        return isAValue;
    }

    public void sendOut(EventOccurrence eventOccurrence, Port onPort)
    {
        // Select a CS_InteractionPoint value playing onPort,
        // and send the event occurrence to this interaction point
        FeatureValue featureValue = getFeatureValue(onPort);
        ValueList values = featureValue.values;
        ReferenceList potentialTargets = new ReferenceList();
        for (int i = 0; i < values.size(); i++)
        {
            potentialTargets.add((Reference)values.get(i));
        }
        CS_RequestPropagationStrategy strategy = (CS_RequestPropagationStrategy)locus.factory.getStrategy("requestPropagation");
        ReferenceList targets = strategy.select(potentialTargets, new SendSignalActionActivation());
        for (int i = 0; i < targets.size(); i++)
        {
            CS_InteractionPoint target = (CS_InteractionPoint)targets.get(i);
            sendOut(eventOccurrence, target);
        }
    }

    public Execution dispatchOut(Operation operation, Port onPort)
    {
        // Select a CS_InteractionPoint value playing onPort,
        // and dispatches the operation to this interaction point
        Execution execution = null;
        FeatureValue featureValue = getFeatureValue(onPort);
        ValueList values = featureValue.values;
        ReferenceList potentialTargets = new ReferenceList();
        for (int i = 0; i < values.size(); i++)
        {
            potentialTargets.add((Reference)values.get(i));
        }
        CS_RequestPropagationStrategy strategy = (CS_RequestPropagationStrategy)locus.factory.getStrategy("requestPropagation");
        ReferenceList targets = strategy.select(potentialTargets, new CallOperationActionActivation());
        // if targets is empty, no dispatch target has been found,
        // and the operation call is lost
        if (targets.size() >= 1)
        {
            CS_InteractionPoint target = (CS_InteractionPoint)targets.get(0);
            execution = dispatchOut(operation, target);
        }
        return execution;
    }

    public Execution dispatchIn(Operation operation, Port onPort)
    {
        // delegates dispatching to composite referent
        // Select a CS_InteractionPoint value playing onPort,
        // and dispatches the operation call to this interaction point
        FeatureValue featureValue = getFeatureValue(onPort);
        ValueList values = featureValue.values;
        int choice = ((ChoiceStrategy)locus.factory.getStrategy("choice")).choose(featureValue.values.size()) - 1;
        CS_InteractionPoint interactionPoint = (CS_InteractionPoint)values.get(choice);
        return interactionPoint.dispatch(operation);
    }

    public void sendIn(EventOccurrence eventOccurrence, Port onPort)
    {
        // Select a Reference value playing onPort,
        // and send the signal instance to this interaction point
        FeatureValue featureValue = getFeatureValue(onPort);
        ValueList values = featureValue.values;
        ReferenceList potentialTargets = new ReferenceList();
        for (int i = 0; i < values.size(); i++)
        {
            potentialTargets.add((Reference)values.get(i));
        }
        CS_RequestPropagationStrategy strategy = (CS_RequestPropagationStrategy)locus.factory.getStrategy("requestPropagation");
        ReferenceList targets = strategy.select(potentialTargets, new SendSignalActionActivation());
        for (int i = 0; i < targets.size(); i++)
        {
            Reference target = targets.get(i);
            target.send(eventOccurrence);
        }
    }

    @Override
    public boolean checkAllParents(Classifier type, Classifier classifier)
    {
        // If the given classifier is not an Interface, behaves like in fUML.
        // Otherwise, check if the given type (or one of its direct or indirect
        // ancestors)
        // has an InterfaceRealization relationships with the given classifier.
        boolean matched = false;
        if (!(classifier instanceof Interface))
        {
            matched = super.checkAllParents(type, classifier);
        }
        else if (!(type instanceof Class_))
        {
            matched = false;
        }
        else if (realizesInterface((Class_)type, (Interface)classifier))
        {
            matched = true;
        }
        else
        {
            ClassifierList directParents = type.general();
            int i = 1;
            while (!matched & i <= directParents.size())
            {
                Classifier directParent = directParents.get(i - 1);
                matched = checkAllParents(directParent, classifier);
                i++;
            }
        }
        return matched;
    }

    public boolean realizesInterface(Class_ type, Interface interface_)
    {
        // Checks if the given type has an InterfaceRealization relationship
        // with the given interface or a descendant of the interface.
        InterfaceRealizationList realizations = type.interfaceRealization;
        boolean realized = false;
        int i = 1;
        while (i <= realizations.size() && !realized)
        {
            InterfaceRealization realization = realizations.get(i - 1);
            Interface contract = realization.contract;
            if (contract == interface_)
            {
                realized = true;
            }
            else if (isDescendant(contract, interface_))
            {
                realized = true;
            }
            i++;
        }
        return realized;
    }

    public boolean isDescendant(Interface contract, Interface interface_)
    {
        // Checks if the given contract is a descendant of the given interface_
        boolean matched = false;
        ClassifierList descendants = contract.general();
        int i = 1;
        while (i <= descendants.size() && !matched)
        {
            if (descendants.get(i - 1) instanceof Interface descendant)
            {
                if (descendant == interface_)
                {
                    matched = true;
                }
                else
                {
                    matched = isDescendant(descendant, interface_);
                }
            }
            i++;
        }
        return matched;
    }
} // CS_Object
