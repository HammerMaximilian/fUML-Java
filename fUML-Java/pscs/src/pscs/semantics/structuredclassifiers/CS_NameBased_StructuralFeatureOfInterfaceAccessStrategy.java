package pscs.semantics.structuredclassifiers;

import fuml.semantics.simpleclassifiers.FeatureValue;
import fuml.semantics.simpleclassifiers.FeatureValueList;
import fuml.semantics.values.ValueList;
import uml.classification.StructuralFeature;

public class CS_NameBased_StructuralFeatureOfInterfaceAccessStrategy
		extends CS_StructuralFeatureOfInterfaceAccessStrategy {

	@Override
    public FeatureValue read(CS_Object cs_Object, StructuralFeature feature)
    {
        // returns the a copy of the first feature value of cs_Object where the name of
        // the corresponding feature
        // matches the name of the feature given as a parameter
        // Otherwise, returns an empty feature value
        FeatureValueList featureValues = cs_Object.getFeatureValues();
        FeatureValue matchingFeatureValue = null;
        for (int i = 0; i < featureValues.size() && matchingFeatureValue == null; i++)
        {
            FeatureValue featureValue = featureValues.get(i);
            if (featureValue.feature.name.equals(feature.name))
            {
                matchingFeatureValue = featureValue;
            }
        }
        if (matchingFeatureValue != null)
        {
            matchingFeatureValue = matchingFeatureValue.copy();
            matchingFeatureValue.feature = feature;
        }
        else
        {
            matchingFeatureValue = new FeatureValue();
            matchingFeatureValue.feature = feature; ;
            matchingFeatureValue.values = new ValueList();
            matchingFeatureValue.position = 0;
        }
        return matchingFeatureValue;
    }

	@Override
    public void write(CS_Object cs_Object, StructuralFeature feature, ValueList values, int position) 
    {
        // Retrieves the first feature value of cs_Object where the name of the
        // corresponding feature
        // matches the name of the feature given as a parameter
        // Then updates the values for this feature value
        FeatureValueList featureValues = cs_Object.getFeatureValues();
        FeatureValue matchingFeatureValue = null;
        for (int i = 0; i < featureValues.size() && matchingFeatureValue == null; i++)
        {
            FeatureValue featureValue = featureValues.get(i);
            if (featureValue.feature.name.equals(feature.name))
            {
                matchingFeatureValue = featureValue;
            }
        }
        if (matchingFeatureValue != null)
        {
            cs_Object.setFeatureValue(matchingFeatureValue.feature, values, position);
        }
    }
} // CS_NameBased_StructuralFeatureOfInterfaceAccessStrategy
