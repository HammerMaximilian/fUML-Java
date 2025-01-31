package pscs.semantics.structuredclassifiers;

import fuml.semantics.simpleclassifiers.FeatureValue;
import fuml.semantics.simpleclassifiers.FeatureValueList;
import fuml.semantics.structuredclassifiers.Link;
import fuml.semantics.values.Value;
import uml.classification.StructuralFeature;

public class CS_Link extends Link {

    public boolean hasValueForAFeature(Value value)
    {
        // Returns true if the given value object is used as a value for a FeatureValue
        // of this link
        return (getFeature(value) != null);
    }

    public StructuralFeature getFeature(Value value)
    {
        FeatureValueList allFeatureValues = getFeatureValues();
        int i = 1;
        StructuralFeature feature = null;
        while (i <= allFeatureValues.size() && feature == null)
        {
            FeatureValue featureValue = allFeatureValues.get(i - 1);
            if (!featureValue.values.isEmpty() && featureValue.values.get(0).equals(value))
            {
                feature = featureValue.feature;
            }
            i++;
        }
        return feature;
    }
} // CS_Link
