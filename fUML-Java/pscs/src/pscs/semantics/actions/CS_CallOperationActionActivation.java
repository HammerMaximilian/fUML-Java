package pscs.semantics.actions;

import fuml.semantics.actions.CallOperationActionActivation;
import fuml.semantics.commonbehavior.Execution;
import fuml.semantics.loci.Locus;
import fuml.semantics.structuredclassifiers.Object_;
import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;
import pscs.semantics.structuredclassifiers.CS_Reference;
import uml.actions.CallOperationAction;
import uml.actions.OutputPin;
import uml.actions.OutputPinList;
import uml.classification.Operation;
import uml.classification.Parameter;
import uml.classification.ParameterDirectionKind;
import uml.classification.ParameterList;
import uml.commonstructure.NamedElement;
import uml.packages.Stereotype;
import uml.packages.StereotypeList;
import uml.simpleclassifiers.Interface;
import uml.simpleclassifiers.InterfaceList;
import uml.structuredclassifiers.Port;

public class CS_CallOperationActionActivation extends CallOperationActionActivation {

	@Override
    public void doAction()
    {
        CallOperationAction action = (CallOperationAction)node;
        // First determines if this is a call to a constructor and if a default
        // construction strategy needs to be applied.
        // This is a call to a constructor if the called operation has
        // stereotype <<Create>> applied.
        // The default construction strategy is used if no method is associated with the
        // <<Create>> operation.
        // Otherwise, behaves as in fUML.
        if (action.onPort == null && isCreate(action.operation)
                && action.operation.method.size() == 0)
        {
            Locus locus = getExecutionLocus();
            CS_ConstructStrategy strategy = ((CS_ConstructStrategy)locus.factory.getStrategy("constructStrategy"));
            Value target = takeTokens(action.target).get(0);
            if (target instanceof CS_Reference)
            {
                strategy.construct(action.operation, ((CS_Reference)target).compositeReferent);
                ParameterList parameters = action.operation.ownedParameter;
                OutputPinList resultPins = action.result;
                ValueList values = new ValueList();
                values.add(target);
                int i = 1;
                while (i <= parameters.size())
                {
                    Parameter parameter = parameters.get(i - 1);
                    if (parameter.direction == ParameterDirectionKind.return_)
                    {
                        OutputPin resultPin = resultPins.get(0);
                        putTokens(resultPin, values);
                    }
                    i++;
                }
            }
        }
        else
        {
            super.doAction();
        }
    }

	@Override
    public Execution getCallExecution()
    {
        // If onPort is not specified, behaves like in fUML
        // If onPort is specified, and if the value on the target input pin is a
        // reference, dispatch the operation
        // to it and return the resulting execution object.
        // As compared to fUML, instead of dispatching directly to target reference
        // by calling operation dispatch:
        // - If the invoked BehavioralFeature is on a provided Interface but not on any
        // required Interface,
        // then, when the InvocationAction is executed, the invocation is made into the
        // object given on
        // the target InputPin through the given Port
        // - If the invoked BehavioralFeature is on a required Interface but not on any
        // provided Interface,
        // then, if the InvocationAction is being executed inside the object given on
        // the target InputPin,
        // the invocation is forwarded out of the target object through the given Port.
        // - If the invoked BehavioralFeature is on both a provided and a required
        // Interface,
        // then, if the InvocationAction is being executed inside the object given on
        // the target InputPin,
        // the invocation is made out of the target object through the given Port.
        // Otherwise the invocation is made into the target object through the given
        // Port.
        CallOperationAction action = (CallOperationAction)node;
        Execution execution = null;
        if (action.onPort == null)
        {
            execution = super.getCallExecution();
        }
        else
        {
            Value target = takeTokens(action.target).get(0);
            if (target instanceof CS_Reference)
            {
                // Tries to determine if the operation call has to be
                // dispatched to the environment or to the internals of
                // target, through onPort
                CS_Reference targetReference = (CS_Reference)target;
                Object_ executionContext = group.getActivityExecution().context;
                boolean operationIsOnProvidedInterface = isOperationProvided(action.onPort,
                        action.operation);
                boolean operationIsOnRequiredInterface = isOperationRequired(action.onPort,
                        action.operation);
                // Operation on a provided interface only
                if (operationIsOnProvidedInterface && !operationIsOnRequiredInterface)
                {
                    execution = targetReference.dispatchIn(action.operation, action.onPort);
                }
                // Operation is on a required interface only
                else if (!operationIsOnProvidedInterface && operationIsOnRequiredInterface)
                {
                    // If not executing in the context of the target,
                    // Semantics are undefined.
                    // Otherwise, dispatch outside.
                    if (executionContext == targetReference.referent
                            || (targetReference.compositeReferent.contains(executionContext)))
                    {
                        execution = targetReference.dispatchOut(action.operation, action.onPort);
                    }
                }
                // Operation is both on a provided and a required interface
                else if (operationIsOnProvidedInterface && operationIsOnRequiredInterface)
                {
                    if (executionContext == targetReference.referent
                            || (targetReference.compositeReferent.contains(executionContext)))
                    {
                        execution = targetReference.dispatchOut(action.operation, action.onPort);
                    }
                    else
                    {
                        execution = targetReference.dispatchIn(action.operation, action.onPort);
                    }
                }
            }
        }
        return execution;
    }

    public boolean isOperationProvided(Port port, Operation operation)
    {
        boolean isProvided = false;
        if (operation.owner instanceof Interface)
        {
            // We have to look in provided interfaces of the port if
            // they define directly or indirectly the Operation
            int interfaceIndex = 1;
            // Iterates on provided interfaces of the port
            InterfaceList providedInterfaces = port.provided;
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
        return isProvided;
    }

    public boolean isOperationRequired(Port port, Operation operation)
    {
        boolean isRequired = false;
        int interfaceIndex = 1;
        // Iterates on provided interfaces of the port
        InterfaceList requiredInterfaces = port.required;
        while (interfaceIndex <= requiredInterfaces.size() && !isRequired)
        {
            Interface interface_ = requiredInterfaces.get(interfaceIndex - 1);
            // Iterates on members of the current Interface
            int memberIndex = 1;
            while (memberIndex <= interface_.member().size() && !isRequired)
            {
                NamedElement cddOperation = interface_.member().get(memberIndex - 1);
                if (cddOperation instanceof Operation)
                {
                    isRequired = operation == cddOperation;
                }
                memberIndex++;
            }
            interfaceIndex++;
        }
        return isRequired;
    }

    public boolean isCreate(Operation o)
    {
        // FIXME This code is Eclipse specific
        // How to handle this in the spec?
        StereotypeList appliedStereotypes = o.appliedStereotype;
        int i = 0;
        boolean isCreate = false;
        while (i < appliedStereotypes.size() && !isCreate)
        {
            Stereotype s = appliedStereotypes.get(i);
            if (s.name.equals("Create"))
            {
                isCreate = true;
            }
        }
        return isCreate;
    }
    
    @Override
    public OutputPinList getOfferingOutputPins()
    {
        // Additional override of fuml::semantics::actions::CallActionActivation::GetOfferingOutputPins()
        // Bypass behavior of CallActionActivation because when CS_CallOperationActionActivation::doAction()
        // is invoked instead of CallActionActivation's SoAction() method,
        // this.nonStreamingOutputPins is never set.

        // NOTE: Duplicate from ActionActivation::GetOfferingOutputPins()
        return ((uml.actions.Action)node).output;
    }
} // CS_CallOperationActionActivation
