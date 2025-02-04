package pscs.semantics.actions;

import fuml.semantics.commonbehavior.ParameterValueList;
import fuml.semantics.loci.Locus;
import fuml.semantics.simpleclassifiers.FeatureValue;
import fuml.semantics.structuredclassifiers.Object_;
import fuml.semantics.structuredclassifiers.Reference;
import fuml.semantics.structuredclassifiers.ReferenceList;
import fuml.semantics.values.Evaluation;
import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;
import pscs.semantics.structuredclassifiers.CS_InteractionPoint;
import pscs.semantics.structuredclassifiers.CS_Link;
import pscs.semantics.structuredclassifiers.CS_Object;
import pscs.semantics.structuredclassifiers.CS_Reference;
import pscs.semantics.values.CS_OpaqueExpressionEvaluation;
import uml.classification.Operation;
import uml.classification.Property;
import uml.classification.PropertyList;
import uml.commonstructure.NamedElement;
import uml.commonstructure.NamedElementList;
import uml.simpleclassifiers.Interface;
import uml.simpleclassifiers.InterfaceRealization;
import uml.structuredclassifiers.Association;
import uml.structuredclassifiers.Class_;
import uml.structuredclassifiers.Class_List;
import uml.structuredclassifiers.Connector;
import uml.structuredclassifiers.ConnectorEnd;
import uml.structuredclassifiers.Port;
import uml.values.ValueSpecification;

public class CS_DefaultConstructStrategy extends CS_ConstructStrategy {

    public Locus locus = null;
    public Association defaultAssociation = null;
    public Class_List generatedRealizingClasses = new Class_List();

    @Override
    public Object_ construct(Operation constructor, CS_Object context)
    {
        locus = context.locus;
        return constructObject(context, (Class_)constructor.type());
    }

    public Object_ constructObject(CS_Object context, Class_ type)
    {
        CS_Reference referenceToContext = new CS_Reference();
        referenceToContext.referent = context;
        referenceToContext.compositeReferent = context;
        // FIXME detect infinite recursive instantiation
        PropertyList allAttributes = type.attribute;
        int i = 1;
        // Instantiate ports and parts
        while (i <= allAttributes.size())
        {
            Property p = allAttributes.get(i - 1);
            if (p.defaultValue != null)
            {
                ValueSpecification defaultValueSpecification = p.defaultValue;
                Evaluation evaluation = (Evaluation)context.locus.factory.instantiateVisitor(defaultValueSpecification);
                evaluation.specification = defaultValueSpecification;
                evaluation.locus = context.locus;
                if (evaluation instanceof CS_OpaqueExpressionEvaluation cS_OpaqueExpressionEvaluation)
                {
                    ValueList evaluations = cS_OpaqueExpressionEvaluation.executeExpressionBehavior();
                    for (Value _evaluation : evaluations)
                    {
                        addStructuralFeatureValue(referenceToContext, p, _evaluation);
                    }
                }
                else
                {
                    Value defaultValue = evaluation.evaluate();
                    addStructuralFeatureValue(referenceToContext, p, defaultValue);
                }
            }
            else if (canInstantiate(p))
            {
                int j = 1;
                while (j <= p.multiplicityElement.lower)
                {
                    Object_ value;
                    // if p is a Port typed by an Interface
                    // creates an Object without type, but with FeatureValues corresponding to
                    // structural features of the interface.
                    if (p instanceof Port && p.typedElement.type instanceof Interface)
                    {
                        value = instantiateInterface((Interface)p.typedElement.type, locus);
                        addStructuralFeatureValue(referenceToContext, p, value);
                    }
                    else
                    {
                        value = context.locus.instantiate((Class_)p.typedElement.type);
                        // TODO account for existing constructors
                        value = constructObject((CS_Object)value, (Class_)p.typedElement.type);
                        addStructuralFeatureValue(referenceToContext, p, value);
                        if (((Class_)p.typedElement.type).isActive)
                        {
                            value.startBehavior((Class_)p.typedElement.type, new ParameterValueList());
                        }
                    }
                    j++;
                }
            }
            i++;
        }
        // Instantiate connectors
        NamedElementList allMembers = type.member();
        i = 1;
        while (i <= allMembers.size())
        {
            NamedElement member = allMembers.get(i - 1);
            if (member instanceof Connector connector)
            {
                if (isArrayPattern(connector))
                {
                    generateArrayPattern(referenceToContext, connector);
                }
                else if (isStarPattern(connector))
                {
                    generateStarPattern(referenceToContext, connector);
                }
            }
            i++;
        }
        return referenceToContext.referent;
    }

    public void addStructuralFeatureValue(CS_Reference context, Property feature, Value value)
    {
        FeatureValue featureValue = context.getFeatureValue(feature);
        if (featureValue != null)
        {
            ValueList values = featureValue.values;
            if (feature instanceof Port)
            {
                // insert an interaction point
                CS_InteractionPoint interactionPoint = new CS_InteractionPoint();
                interactionPoint.definingPort = (Port)feature;
                interactionPoint.referent = (CS_Object)value;
                interactionPoint.owner = context;
                values.add(interactionPoint);
            }
            else if (value instanceof CS_Object cS_Object)
            {
                // insert a reference
                CS_Reference reference = new CS_Reference();
                reference.compositeReferent = cS_Object;
                reference.referent = cS_Object;
                values.add(reference);
            }
            else
            {
                values.add(value);
            }
        }
    }

    public void generateArrayPattern(CS_Reference context, Connector connector)
    {
        ConnectorEnd end1 = connector.end.get(0);
        ConnectorEnd end2 = connector.end.get(1);
        ReferenceList end1Values = getValuesFromConnectorEnd(context, end1);
        ReferenceList end2Values = getValuesFromConnectorEnd(context, end2);
        for (int i = 0; i < end1Values.size(); i++)
        {
            CS_Link link = new CS_Link();
            if (connector.type == null)
            {
                link.type = getDefaultAssociation();
            }
            else
            {
                link.type = connector.type;
            }
            ValueList valuesForEnd1 = new ValueList();
            valuesForEnd1.add(end1Values.get(i));
            ValueList valuesForEnd2 = new ValueList();
            valuesForEnd2.add(end2Values.get(i));
            link.setFeatureValue(link.type.ownedEnd.get(0), valuesForEnd1, -1);
            link.setFeatureValue(link.type.ownedEnd.get(1), valuesForEnd2, -1);
            link.addTo(context.referent.locus);
        }
    }

    public ReferenceList getValuesFromConnectorEnd(CS_Reference context, ConnectorEnd end)
    {
        ReferenceList endValues = new ReferenceList();
        if (end.partWithPort != null)
        {
            FeatureValue valueForPart = context.getFeatureValue(end.partWithPort);
            if (valueForPart != null)
            {
                for (int i = 0; i < valueForPart.values.size(); i++)
                {
                    Reference reference = (Reference)valueForPart.values.get(i);
                    FeatureValue valueForPort = reference.getFeatureValue((Port)end.role);
                    if (valueForPort != null)
                    {
                        for (int j = 0; j < valueForPort.values.size(); j++)
                        {
                            endValues.add((Reference)valueForPort.values.get(j));
                        }
                    }
                }
            }
        }
        else
        {
            FeatureValue valueForRole = context.getFeatureValue(end.role);
            if (valueForRole != null)
            {
                for (int i = 0; i < valueForRole.values.size(); i++)
                {
                    endValues.add((Reference)valueForRole.values.get(i));
                }
            }
        }
        return endValues;
    }

    public void generateStarPattern(CS_Reference context, Connector connector)
    {
        ConnectorEnd end1 = connector.end.get(0);
        ConnectorEnd end2 = connector.end.get(1);
        ReferenceList end1Values = getValuesFromConnectorEnd(context, end1);
        ReferenceList end2Values = getValuesFromConnectorEnd(context, end2);
        for (int i = 0; i < end1Values.size(); i++)
        {
            for (int j = 0; j < end2Values.size(); j++)
            {
                CS_Link link = new CS_Link();
                if (connector.type == null)
                {
                    link.type = getDefaultAssociation();
                }
                else
                {
                    link.type = connector.type;
                }
                ValueList valuesForEnd1 = new ValueList();
                valuesForEnd1.add(end1Values.get(i));
                ValueList valuesForEnd2 = new ValueList();
                valuesForEnd2.add(end2Values.get(j));
                link.setFeatureValue(link.type.ownedEnd.get(0), valuesForEnd1, -1);
                link.setFeatureValue(link.type.ownedEnd.get(1), valuesForEnd2, -1);
                link.addTo(context.referent.locus);
            }
        }
    }

    public boolean canInstantiate(Property p)
    {
        // Instantiate is possible if:
        // - p is composite
        // - p is typed
        // - This type is a Class and it is not abstract
        // - Or p is a Port and the type is an Interface
        if (p.isComposite)
        {
            if (p.typedElement.type != null)
            {
                if (p.typedElement.type instanceof Class_ class_)
                {
                    return !class_.isAbstract;
                }
                else if (p.typedElement.type instanceof Interface)
                {
                    return p instanceof Port;
                }
            }
        }
        return false;
    }

    public int getCardinality(ConnectorEnd end)
    {
        int lowerOfRole = end.role.multiplicityElement.lower;
        if (lowerOfRole == 0)
        {
            return 0;
        }
        else if (end.partWithPort == null)
        {
            return lowerOfRole;
        }
        else
        {
            int lowerOfPart = end.partWithPort.multiplicityElement.lower;
            return lowerOfRole * lowerOfPart;
        }
    }

    public boolean isArrayPattern(Connector c)
    {
        // This is an array pattern if:
        // - c is binary
        // - lower bound of the two connector ends is 1
        // - Cardinality of ends are equals
        if (c.end.size() == 2)
        {
            if (c.end.get(0).lower == 1)
            {
                if (c.end.get(1).lower == 1)
                {
                    if (canInstantiate(c.end.get(0).role) && canInstantiate(c.end.get(1).role));
                    {
                        int cardinality1 = getCardinality(c.end.get(0));
                        int cardinality2 = getCardinality(c.end.get(1));
                        return cardinality1 == cardinality2;
                    }
                }
            }
        }
        return false;
    }

    public boolean isStarPattern(Connector c)
    {
        // This is an array pattern if:
        // - c is binary
        // - lower bound of end1 equals cardinality of end1
        // - lower bound of end2 equals cardinality of end2
        if (c.end.size() == 2)
        {
            if (canInstantiate(c.end.get(0).role) && canInstantiate(c.end.get(1).role))
            {
                int cardinalityOfEnd1 = getCardinality(c.end.get(0));
                int lowerBoundofEnd1 = c.end.get(0).lower;
                if (cardinalityOfEnd1 == lowerBoundofEnd1)
                {
                    int cardinalityOfEnd2 = getCardinality(c.end.get(1));
                    int lowerBoundofEnd2 = c.end.get(1).lower;
                    return cardinalityOfEnd2 == lowerBoundofEnd2;
                }
            }
        }
        return false;
    }

    public Association getDefaultAssociation()
    {
        // Computes an returns an Association with two untyped owned ends,
        // with multiplicity [*].
        // This association can be used to type links instantiated from untyped connectors
        if (defaultAssociation == null)
        {
            defaultAssociation = new Association();
            defaultAssociation.setName("DefaultGeneratedAssociation");
            Property end1 = new Property();
            end1.setName("x");
            end1.setLower(0);
            end1.setUpper(-1);
            end1.setIsOrdered(true);
            end1.setIsUnique(true);
            defaultAssociation.addOwnedEnd(end1);
            Property end2 = new Property();
            end2.setName("y");
            end2.setLower(0);
            end2.setUpper(-1);
            end2.setIsOrdered(true);
            end2.setIsUnique(true);
            defaultAssociation.addOwnedEnd(end2);
        }
        return defaultAssociation;
    }

    public Object_ instantiateInterface(Interface interface_, Locus locus)
    {
        Class_ realizingClass = getRealizingClass(interface_);
        Object_ object_ = locus.instantiate(realizingClass);
        return object_;
    }

    public Class_ getRealizingClass(Interface interface_)
    {
        Class_ realizingClass = null;
        // TODO For cached RealizingClasses, search based on InterfaceRealizations rather than name
        String realizingClassName = interface_.qualifiedName + "GeneratedRealizingClass";
        int i = 1;
        while (i <= generatedRealizingClasses.size() && realizingClass == null)
        {
            Class_ cddRealizingClass = generatedRealizingClasses.get(i - 1);
            if (cddRealizingClass.name.equals(realizingClassName))
            {
                realizingClass = cddRealizingClass;
            }
            i++;
        }
        if (realizingClass == null)
        {
            realizingClass = generateRealizingClass(interface_, realizingClassName);
            generatedRealizingClasses.add(realizingClass);
        }
        return realizingClass;
    }

    public Class_ generateRealizingClass(Interface interface_, String className)
    {
        Class_ realizingClass = new Class_();
        realizingClass.setName(className);

        InterfaceRealization realization = new InterfaceRealization();
        realization.contract = interface_;
        realization.implementingClassifier = realizingClass;
        realizingClass.addInterfaceRealization(realization);
        // TODO Deal with structural features of the interface
        // TODO Make a test case for reading/writing structural features of an interface
        return realizingClass;
    }
	
} // CS_DefaultConstructStrategy
