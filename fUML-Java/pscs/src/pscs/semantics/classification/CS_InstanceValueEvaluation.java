package pscs.semantics.classification;

import fuml.Debug;
import fuml.semantics.classification.InstanceValueEvaluation;
import fuml.semantics.simpleclassifiers.DataValue;
import fuml.semantics.simpleclassifiers.EnumerationValue;
import fuml.semantics.simpleclassifiers.StructuredValue;
import fuml.semantics.structuredclassifiers.Object_;
import fuml.semantics.structuredclassifiers.Reference;
import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;
import pscs.semantics.structuredclassifiers.CS_Object;
import pscs.semantics.structuredclassifiers.CS_Reference;
import uml.classification.Classifier;
import uml.classification.ClassifierList;
import uml.classification.InstanceSpecification;
import uml.classification.InstanceValue;
import uml.classification.Slot;
import uml.classification.SlotList;
import uml.commonbehavior.Behavior;
import uml.simpleclassifiers.DataType;
import uml.simpleclassifiers.Enumeration;
import uml.simpleclassifiers.EnumerationLiteral;
import uml.structuredclassifiers.Class_;
import uml.values.ValueSpecification;
import uml.values.ValueSpecificationList;

public class CS_InstanceValueEvaluation extends InstanceValueEvaluation {

	@Override
    public Value evaluate()
    {
        // If the instance specification is for an enumeration, then return the
        // identified enumeration literal.
        // If the instance specification is for a data type (but not a primitive
        // value or an enumeration), then create a data value of the given data
        // type.
        // If the instance specification is for an object, then create an object
        // at the current locus with the specified types.
        // Set each feature of the created value to the result of evaluating the
        // value specifications for the specified slot for the feature.
        // Extends fUML semantics in the sense that when the instance specification
        // is for an object which is not typed by a Behavior, A CS_Reference (to a
        // CS_Object) is produced instead of a Reference (to an Object)
        InstanceSpecification instance = ((InstanceValue)specification).instance;
        ClassifierList types = instance.classifier;
        Classifier myType = types.get(0);
        Debug.println("[evaluate] type = " + myType.name);
        Value value;
        if (instance instanceof EnumerationLiteral)
        {
            EnumerationValue enumerationValue = new EnumerationValue();
            enumerationValue.type = (Enumeration)myType;
            enumerationValue.literal = (EnumerationLiteral)instance;
            value = enumerationValue;
        }
        else
        {
            StructuredValue structuredValue;
            if (myType instanceof DataType)
            {
                DataValue dataValue = new DataValue();
                dataValue.type = (DataType)myType;
                structuredValue = dataValue;
            }
            else
            {
                Object_ object_;
                if (myType instanceof Behavior behavior)
                {
                    object_ = locus.factory.createExecution(behavior, null);
                }
                else
                {
                    object_ = new CS_Object();
                    for (Classifier type : types)
                    {
                        object_.types.add((Class_)type);
                    }
                }
                locus.add(object_);
                Reference reference;
                if (object_ instanceof CS_Object cS_Object)
                {
                    reference = new CS_Reference();
                    ((CS_Reference)reference).compositeReferent = cS_Object;
                }
                else
                {
                    reference = new Reference();
                }
                reference.referent = object_;
                structuredValue = reference;
            }
            structuredValue.createFeatureValues();

            SlotList instanceSlots = instance.slot;
            for (Slot slot : instanceSlots)
            {
                ValueList values = new ValueList();
                ValueSpecificationList slotValues = slot.value;
                for (ValueSpecification slotValue : slotValues)
                {
                    values.add(locus.executor.evaluate(slotValue));
                }
                structuredValue.setFeatureValue(slot.definingFeature, values, 0);
            }
            value = structuredValue;
        }
        return value;
    }	
} // CS_InstanceValueEvaluation
