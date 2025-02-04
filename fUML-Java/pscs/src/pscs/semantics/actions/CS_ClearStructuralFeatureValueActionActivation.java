package pscs.semantics.actions;

import fuml.semantics.actions.ClearStructuralFeatureActionActivation;
import fuml.semantics.simpleclassifiers.FeatureValue;
import fuml.semantics.simpleclassifiers.StructuredValue;
import fuml.semantics.structuredclassifiers.ExtensionalValue;
import fuml.semantics.structuredclassifiers.ExtensionalValueList;
import fuml.semantics.structuredclassifiers.Link;
import fuml.semantics.structuredclassifiers.LinkList;
import fuml.semantics.structuredclassifiers.Reference;
import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;
import pscs.semantics.structuredclassifiers.CS_InteractionPoint;
import pscs.semantics.structuredclassifiers.CS_Link;
import pscs.semantics.structuredclassifiers.CS_LinkList;
import pscs.semantics.structuredclassifiers.CS_Reference;
import uml.actions.ClearStructuralFeatureAction;
import uml.classification.StructuralFeature;
import uml.structuredclassifiers.Association;
import uml.structuredclassifiers.Port;

public class CS_ClearStructuralFeatureValueActionActivation extends ClearStructuralFeatureActionActivation {

	@Override
    public void doAction()
    {
        // Get the value of the object input pin.
        // If the given feature is an association end, then
        // destroy all links that have the object input on the opposite end.
        // Otherwise, if the object input is a structured value, then
        // set the appropriate feature of the input value to be empty.
        ClearStructuralFeatureAction action = (ClearStructuralFeatureAction)node;
        StructuralFeature feature = action.structuralFeature;
        Association association = getAssociation(feature);
        Value value = takeTokens(action.object).get(0);
        if (association != null)
        {
            LinkList links = getMatchingLinks(association, feature, value);
            for (Link link : links)
            {
                link.destroy();
            }
        }
        else if (value instanceof StructuredValue)
        {
            // If the value is a data value, then it must be copied before
            // any change is made.
            if (!(value instanceof Reference))
            {
                value = value.copy();
            }
            else
            {
                // extension to fUML
                CS_LinkList linksToDestroy = getLinksToDestroy((StructuredValue)value, feature);
                for (CS_Link cS_Link : linksToDestroy)
                {
                    cS_Link.destroy();
                }
                //
            }
            ((StructuredValue)value).setFeatureValue(action.structuralFeature, new ValueList(), 0);
        }
        if (action.result != null)
        {
            putToken(action.result, value);
        }
    }

    public CS_LinkList getLinksToDestroy(StructuredValue value, StructuralFeature feature)
    {
        CS_LinkList linksToDestroy = new CS_LinkList();
        if (value instanceof CS_Reference)
        {
            CS_Reference context = (CS_Reference)value;
            // Retrieves the feature values for the structural feature associated with this
            // action,
            // in the context of this reference
            FeatureValue featureValue = context.getFeatureValue(feature);
            if (feature instanceof Port)
            {
                // all values are interaction points
                // any link targeting this interaction point must be destroyed
                for (int i = 0; i < featureValue.values.size(); i++)
                {
                    CS_InteractionPoint interactionPoint = (CS_InteractionPoint)featureValue.values.get(i);
                    CS_LinkList connectorInstances = context.compositeReferent.getLinks(interactionPoint);
                    for (CS_Link link : connectorInstances)
                    {
                        linksToDestroy.add(link);
                    }
                }
            }
            else
            { // feature is an attribute
              // Retrieve all potential link ends,
              // separating potential link ends corresponding to the given feature,
              // and potential link ends corresponding to other features.
              // By "potential link ends", we refer to the values of a given feature,
              // as well as interaction points associated with this value, if any.
                ValueList allValuesForFeature = new ValueList();
                ValueList allOtherValues = new ValueList();
                for (int i = 0; i < context.referent.getFeatureValues().size(); i++)
                {
                    StructuralFeature currentFeature = context.referent.getFeatureValues().get(i).feature;
                    ValueList values = getPotentialLinkEnds(context, currentFeature);
                    for (int j = 0; j < values.size(); j++)
                    {
                        Value v = values.get(j);
                        if (currentFeature != feature)
                        {
                            allOtherValues.add(v);
                        }
                        else
                        {
                            allValuesForFeature.add(v);
                        }
                    }
                }
                // Retrieves all links available at the locus
                ExtensionalValueList extensionalValues = getExecutionLocus().extensionalValues;
                CS_LinkList allLinks = new CS_LinkList();
                for (ExtensionalValue extensionalValue : extensionalValues)
                {
                    if (extensionalValue instanceof CS_Link)
                    {
                        allLinks.add((CS_Link)extensionalValue);
                    }
                }
                // Retrieves links representing connector instances in the context object
                for (CS_Link link : allLinks)
                {
                    boolean linkHasToBeDestroyed = false;
                    for (int j = 0; j < allValuesForFeature.size() && !linkHasToBeDestroyed; j++)
                    {
                        Value v = allValuesForFeature.get(j);
                        StructuralFeature featureForV = link.getFeature(v);
                        if (featureForV != null)
                        {
                            // Check if feature values of this link for other features
                            // contains elements identified in allOtherValue
                            for (int k = 0; k < link.getFeatureValues().size() && !linkHasToBeDestroyed; k++)
                            {
                                FeatureValue otherFeatureValue = link.getFeatureValues().get(k);
                                if (otherFeatureValue.feature != featureForV)
                                {
                                    for (int l = 0; l < otherFeatureValue.values.size()
                                            && !linkHasToBeDestroyed; l++)
                                    {
                                        for (int m = 0; m < allOtherValues.size() && !linkHasToBeDestroyed; m++)
                                        {
                                            if (otherFeatureValue.values.get(l) == allOtherValues.get(m))
                                            {
                                                linkHasToBeDestroyed = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (linkHasToBeDestroyed)
                    {
                        linksToDestroy.add(link);
                    }
                }
            }
        }
        return linksToDestroy;
    }

    public ValueList getPotentialLinkEnds(CS_Reference context, StructuralFeature feature)
    {
        // Retrieves all feature values for the context object for the given feature,
        // as well as all interaction point for these values
        ValueList potentialLinkEnds = new ValueList();
        FeatureValue featureValue = context.getFeatureValue(feature);
        for (Value v : featureValue.values)
        {
            potentialLinkEnds.add(v);
            if (v instanceof CS_Reference)
            {
                // add all interaction points associated with v
                for (int j = 0; j < ((CS_Reference)v).referent.getFeatureValues().size(); j++)
                {
                    if (((CS_Reference)v).referent.getFeatureValues().get(j).feature instanceof Port)
                    {
                        ValueList interactionPoints = ((CS_Reference)v).referent.getFeatureValues().get(j).values;
                        for (Value interactionPoint : interactionPoints)
                        {
                            potentialLinkEnds.add(interactionPoint);
                        }
                    }
                }
            }
        }
        return potentialLinkEnds;
    }
} // CS_ClearStructuralFeatureValueActionActivation
