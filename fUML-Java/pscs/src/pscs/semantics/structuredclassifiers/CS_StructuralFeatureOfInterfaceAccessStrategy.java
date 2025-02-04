package pscs.semantics.structuredclassifiers;

import fuml.semantics.loci.SemanticStrategy;
import fuml.semantics.simpleclassifiers.FeatureValue;
import fuml.semantics.values.ValueList;
import uml.classification.StructuralFeature;

public abstract class CS_StructuralFeatureOfInterfaceAccessStrategy extends SemanticStrategy {

	@Override
    public String getName()
    {
        // StructuralFeatureAccessStrategy are always named "structuralFeature"
        return "structuralFeature";
    }
    public abstract FeatureValue read(CS_Object cs_Object, StructuralFeature feature);
    public abstract void write(CS_Object cs_Object, StructuralFeature feature, ValueList values, int position);
} // CS_StructuralFeatureOfInterfaceAccessStrategy
