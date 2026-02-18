package pscs.semantics.actions;

import fuml.semantics.actions.RemoveStructuralFeatureValueActionActivation;
import fuml.semantics.loci.ChoiceStrategy;
import fuml.semantics.simpleclassifiers.FeatureValue;
import fuml.semantics.simpleclassifiers.StructuredValue;
import fuml.semantics.simpleclassifiers.UnlimitedNaturalValue;
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
import uml.actions.AddStructuralFeatureValueAction;
import uml.actions.RemoveStructuralFeatureValueAction;
import uml.classification.Property;
import uml.classification.StructuralFeature;
import uml.structuredclassifiers.Association;
import uml.structuredclassifiers.Port;
import UMLPrimitiveTypes.*;

public class CS_RemoveStructuralFeatureValueActionActivation extends RemoveStructuralFeatureValueActionActivation {

	@Override
    public void doAction()
    {
        // Get the values of the object and value input pins. 
        // If the given feature is an association end, then Destroy any
        // matching links. Otherwise, if the object input is a structural
        // value, remove values from the given feature and Destroy all links
        // in which the removed values are involved.
        // If isRemoveDuplicates is true, then Destroy all current matching
        // links or remove all values equal to the input value.
        // If isRemoveDuplicates is false and there is no removeAt input pin,
        // remove any one feature value equal to the input value (if there are
        // any that are equal).
        // If isRemoveDuplicates is false, and there is a removeAt input pin
        // remove the feature value at that position.
        RemoveStructuralFeatureValueAction action = (RemoveStructuralFeatureValueAction)node;
        StructuralFeature feature = action.structuralFeature;
        Association association = this.getAssociation(feature);
        Value value = this.takeTokens(action.object).get(0);
        Value inputValue = null;
        if (action.value != null)
        {
            // NOTE: Multiplicity of the value input pin is required to be 1..1.
            inputValue = this.takeTokens(action.value).get(0);
        }
        int removeAt = 0;
        if (action.removeAt != null)
        {
            removeAt = ((UnlimitedNaturalValue) this.takeTokens(action.removeAt).get(0)).value.naturalValue;
        }
        if (association != null)
        {
            LinkList links = this.getMatchingLinksForEndValue(association, feature, value, inputValue);
            if (action.isRemoveDuplicates)
            {
                for (Link link : links)
                {
                    link.destroy();
                }
            }
            else if (action.removeAt == null)
            {
                // *** If there is more than one matching link,
                // non-deterministically Choose one. ***
                if (links.size() > 0)
                {
                    int i = ((ChoiceStrategy)this.getExecutionLocus().factory.getStrategy("choice")).choose(links.size());
                    links.get(i - 1).destroy();
                }
            }
            else
            {
                boolean notFound = true;
                int i = 1;
                while (notFound & i <= links.size())
                {
                    Link link = links.get(i - 1);
                    if (link.getFeatureValue(feature).position == removeAt)
                    {
                        notFound = false;
                        link.destroy();
                    }
                }
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
            FeatureValue featureValue = ((StructuredValue)value).getFeatureValue(action.structuralFeature);
            ValueList removedValues = new ValueList();
            if (action.isRemoveDuplicates)
            {
                int j = this.position(inputValue, featureValue.values, 1);
                while (j > 0)
                {
                    removedValues.add(featureValue.values.get(j - 1));
                    featureValue.values.remove(j - 1);
                    j = this.position(inputValue, featureValue.values, j);
                }
            }
            else if (action.removeAt == null)
            {
                intList positions = new intList();
                int j = this.position(inputValue, featureValue.values, 1);
                while (j > 0)
                {
                    positions.add(j);
                    j = this.position(inputValue, featureValue.values, j + 1);
                }
                if (positions.size() > 0)
                {
                    // *** Nondeterministically Choose which value to remove.
                    // ***
                    int k = ((ChoiceStrategy)this.getExecutionLocus().factory.getStrategy("choice")).choose(positions.size());
                    removedValues.add(featureValue.values.get(positions.get(k - 1) - 1));
                    featureValue.values.remove(positions.get(k - 1) - 1);
                }
            }
            else
            {
                if (featureValue.values.size() >= removeAt)
                {
                    removedValues.add(featureValue.values.get(removeAt - 1));
                    featureValue.values.remove(removeAt - 1);
                }
            }
            // When values are removed from the list of values associated to the feature 
            // (in the context of the target), these latter may be involved in links representing
            // instance of connectors. If this is the case, links in which the removed values are
            // involved are Destroyed.
            for (int i = 0; i < removedValues.size(); i++)
            {
                CS_LinkList linkToDestroy = this.getLinksToDestroy((StructuredValue)value, feature, removedValues.get(i));
                for (int j = 0; j < linkToDestroy.size(); j++)
                {
                    linkToDestroy.get(j).destroy();
                }
            }
        }
        if (action.result != null)
        {
            this.putToken(action.result, value);
        }
    }
    
    public CS_LinkList getLinksToDestroy(StructuredValue value, StructuralFeature feature, Value removedValue)
    {
        // Get all links that are required to be Destroyed due to the removal of the removedValue
        CS_LinkList linksToDestroy = new CS_LinkList();
        if (value instanceof CS_Reference)
        {
            CS_Reference context = (CS_Reference)value;
            // Retrieves the feature values for the structural feature associated with this action,
            // in the context of this reference
            if (feature instanceof Port)
            {
                // The removed value is an interaction point.
                // All links in which this interaction is involved must be Destroyed.
                CS_InteractionPoint interactionPoint = (CS_InteractionPoint)removedValue;
                CS_LinkList connectorInstances = context.compositeReferent.getLinks(interactionPoint);
                for (CS_Link link : connectorInstances)
                {
                    linksToDestroy.add(link);
                }
            }
            else
            {
                // Feature is not a Port. Search for all potential link
                // ends existing in the context of this object.
                ValueList allValuesForFeature = new ValueList();
                for (int i = 0; i < context.referent.getFeatureValues().size(); i++)
                {
                    StructuralFeature currentFeature = context.referent.getFeatureValues().get(i).feature;
                    if (feature != currentFeature)
                    {
                        ValueList values = this.getPotentialLinkEnds(context, currentFeature);
                        for (int j = 0; j < values.size(); j++)
                        {
                            allValuesForFeature.add(values.get(j));
                        }
                    }
                }
                // Retrieves all links available at the locus
                ExtensionalValueList extensionalValues = this.getExecutionLocus().extensionalValues;
                CS_LinkList allLinks = new CS_LinkList();
                for (ExtensionalValue extensionalValue : extensionalValues)
                {
                    if (extensionalValue instanceof CS_Link)
                    {
                        allLinks.add((CS_Link)extensionalValue);
                    }
                }
                // In the set of links involving potential link ends. Search for all
                // links that involve the removed value in other end. Any link in that
                // fulfill this condition is registered in the set of link to be Destroyed.
                for (int i = 0; i < allLinks.size(); i++)
                {
                    CS_Link link = allLinks.get(i);
                    boolean linkHasToBeDestroyed = false;
                    for (int j = 0; j < allValuesForFeature.size() && !linkHasToBeDestroyed; j++)
                    {
                        Value v = allValuesForFeature.get(j);
                        StructuralFeature featureForV = link.getFeature(v);
                        if (featureForV != null)
                        {
                            for (int k = 0; k < link.getFeatureValues().size() && !linkHasToBeDestroyed; k++)
                            {
                                FeatureValue otherFeatureValue = link.getFeatureValues().get(k);
                                if (otherFeatureValue.feature != featureForV)
                                {
                                    for (int l = 0; l < otherFeatureValue.values.size() && !linkHasToBeDestroyed; l++)
                                    {
                                        if (otherFeatureValue.values.get(l) == removedValue)
                                        {
                                            linkHasToBeDestroyed = true;
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
        for (int i = 0; i < featureValue.values.size(); i++)
        {
            Value v = featureValue.values.get(i);
            potentialLinkEnds.add(v);
            if (v instanceof CS_Reference)
            {
                // Add all interaction points associated with v
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
} // CS_RemoveStructuralFeatureValueActionActivation
