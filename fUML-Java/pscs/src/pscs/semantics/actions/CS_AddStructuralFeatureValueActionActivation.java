package pscs.semantics.actions;

import fuml.semantics.actions.AddStructuralFeatureValueActionActivation;
import fuml.semantics.loci.ChoiceStrategy;
import fuml.semantics.structuredclassifiers.Link;
import fuml.semantics.structuredclassifiers.LinkList;
import fuml.semantics.structuredclassifiers.Reference;
import fuml.semantics.simpleclassifiers.FeatureValue;
import fuml.semantics.simpleclassifiers.StructuredValue;
import fuml.semantics.simpleclassifiers.UnlimitedNaturalValue;
import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;
import pscs.semantics.structuredclassifiers.CS_InteractionPoint;
import pscs.semantics.structuredclassifiers.CS_Link;
import pscs.semantics.structuredclassifiers.CS_Reference;
import uml.actions.AddStructuralFeatureValueAction;
import uml.classification.Property;
import uml.classification.StructuralFeature;
import uml.structuredclassifiers.Association;
import uml.structuredclassifiers.Port;

public class CS_AddStructuralFeatureValueActionActivation extends AddStructuralFeatureValueActionActivation {

	@Override
	public void doAction()
	{
	    // If the feature is a port and the input value to be added is a
	    // Reference,
	    // Replaces this Reference by an InteractionPoint, and then behaves
	    // as usual.
	    // If the feature is not a port, behaves as usual
	    AddStructuralFeatureValueAction action = (AddStructuralFeatureValueAction)node;
	    StructuralFeature feature = action.structuralFeature;
	    if (!(feature instanceof Port))
	    {
	        // Behaves as usual
	        DoActionDefault();
	    }
	    else
	    {
	        ValueList inputValues = takeTokens(action.value);
	        // NOTE: Multiplicity of the value input pin is required to be 1..1.
	        Value inputValue = inputValues.get(0);
	        if (inputValue instanceof Reference)
	        {
	            // First constructs an InteractionPoint from the inputValue
	        	Reference reference = (Reference)inputValue;
	            CS_InteractionPoint interactionPoint = new CS_InteractionPoint();
	            interactionPoint.referent = reference.referent;
	            interactionPoint.definingPort = (Port)feature;
	            // The value on action.object is necessarily instanceof
	            // ReferenceToCompositeStructure (otherwise, the feature cannot
	            // be a port)
	            CS_Reference owner = (CS_Reference)takeTokens(action.object).get(0);
	            interactionPoint.owner = owner;
	            // Then replaces the Reference by an InteractionPoint
	            // in the inputValues
	            inputValues.remove(0);
	            inputValues.add(0, interactionPoint);
	            // Finally concludes with usual fUML behavior of
	            // AddStructuralFeatureValueAction (i.e., the usual behavior
	            // when
	            // the value on action.object pin is a StructuredValue)
	            int insertAt = 0;
	            if (action.insertAt != null)
	            {
	                insertAt = ((UnlimitedNaturalValue)takeTokens(action.insertAt).get(0)).value.naturalValue;
	            }
	            if (action.isReplaceAll)
	            {
	                owner.setFeatureValue(feature, inputValues, 0);
	            }
	            else
	            {
	                FeatureValue featureValue = owner.getFeatureValue(feature);
	                if (featureValue.values.size() > 0 & insertAt == 0)
	                {
	                    // If there is no insertAt pin, then the structural
	                    // feature must
	                    // be unordered, and the insertion position is
	                    // immaterial.
	                    insertAt = ((ChoiceStrategy)getExecutionLocus().factory.getStrategy("choice")).choose(featureValue.values.size());
	                }
	                if (feature.multiplicityElement.isUnique)
	                {
	                    // Remove any existing value that duplicates the input
	                    // value
	                    int j = position(interactionPoint, featureValue.values, 1);
	                    if (j > 0)
	                    {
	                        featureValue.values.remove(j - 1);
	                        if (insertAt > 0 & j < insertAt)
	                        {
	                            insertAt--;
	                        }
	                    }
	                }
	                if (insertAt <= 0)
	                {
	                    // Note: insertAt = -1 indicates an unlimited value of
	                    // "*"
	                    featureValue.values.add(interactionPoint);
	                }
	                else
	                {
	                    featureValue.values.add(insertAt - 1, interactionPoint);
	                }
	            }
	            if (action.result != null)
	            {
	                putToken(action.result, owner);
	            }
	        }
	        else
	        {
	            // behaves as usual
	            DoActionDefault();
	        }
	    }
	}

	public void DoActionDefault()
	{
	    // Get the values of the object and value input pins.
	    // If the given feature is an association end, then create a link
	    // between the object and value inputs.
	    // Otherwise, if the object input is a structural value, then add a
	    // value to the values for the feature.
	    // If isReplaceAll is true, first remove all current matching links or
	    // feature values.
	    // If isReplaceAll is false and there is an insertAt pin, insert the
	    // value at the appropriate position.
	    // This operation captures same semantics as fUML
	    // AddStructuralFeatureValueActionActivation.doAction(), except that
	    // when the feature is an association end, a CS_Link will be created instead
	    // of a Link
	    AddStructuralFeatureValueAction action = (AddStructuralFeatureValueAction)node;
	    StructuralFeature feature = action.structuralFeature;
	    Association association = getAssociation(feature);
	    Value value = takeTokens(action.object).get(0);
	    ValueList inputValues = takeTokens(action.value);
	    // NOTE: Multiplicity of the value input pin is required to be 1..1.
	    Value inputValue = inputValues.get(0);
	    int insertAt = 0;
	    if (action.insertAt != null)
	    {
	        insertAt = ((UnlimitedNaturalValue)takeTokens(action.insertAt).get(0)).value.naturalValue;
	    }
	    if (association != null)
	    {
	        LinkList links = getMatchingLinks(association, feature, value);
	        Property oppositeEnd = getOppositeEnd(association, feature);
	        int position = 0;
	        if (oppositeEnd.multiplicityElement.isOrdered)
	        {
	            position = -1;
	        }
	        if (action.isReplaceAll)
	        {
	            for (Link link : links)
	            {
	                link.destroy();
	            }
	        }
	        else if (feature.multiplicityElement.isUnique)
	        {
	            for (Link link : links)
	            {
	                FeatureValue featureValue = link.getFeatureValue(feature);
	                if (featureValue.values.get(0).equals(inputValue))
	                {
	                    position = link.getFeatureValue(oppositeEnd).position;
	                    if (insertAt > 0 & featureValue.position < insertAt)
	                    {
	                        insertAt--;
	                    }
	                    link.destroy();
	                }
	            }
	        }
	        CS_Link newLink = new CS_Link();
	        newLink.type = association;
	        // This is necessary when setting a feature value with an insertAt
	        // position
	        newLink.locus = getExecutionLocus();
	        newLink.setFeatureValue(feature, inputValues, insertAt);
	        ValueList oppositeValues = new ValueList();
	        oppositeValues.add(value);
	        newLink.setFeatureValue(oppositeEnd, oppositeValues, position);
	        newLink.locus.add(newLink);
	    }
	    else if (value instanceof StructuredValue) {
	        StructuredValue structuredValue = (StructuredValue)value;
	        if (action.isReplaceAll)
	        {
	            structuredValue.setFeatureValue(feature, inputValues, 0);
	        }
	        else
	        {
	            FeatureValue featureValue = structuredValue.getFeatureValue(feature);
	            if (featureValue.values.size() > 0 & insertAt == 0)
	            {
	                // *** If there is no insertAt pin, then the structural
	                // feature must be unordered, and the insertion position is
	                // immaterial. ***
	                insertAt = ((ChoiceStrategy)getExecutionLocus().factory.getStrategy("choice")).choose(featureValue.values.size());
	            }
	            if (feature.multiplicityElement.isUnique)
	            {
	                // Remove any existing value that duplicates the input value
	                int j = position(inputValue, featureValue.values, 1);
	                if (j > 0)
	                {
	                    featureValue.values.remove(j - 1);
	                    if (insertAt > 0 & j < insertAt)
	                    {
	                        insertAt--;
	                    }
	                }
	            }
	            if (insertAt <= 0)
	            { // Note: insertAt = -1 indicates an
	              // unlimited value of "*"
	                featureValue.values.add(inputValue);
	            }
	            else
	            {
	                featureValue.values.add(insertAt - 1, inputValue);
	            }
	        }
	    }
	    if (action.result != null)
	    {
	        putToken(action.result, value);
	    }
	}
} // CS_AddStructuralFeatureValueActionActivation
