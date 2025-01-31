package pscs.semantics.loci;

import fuml.semantics.loci.Locus;
import fuml.semantics.structuredclassifiers.Object_;
import pscs.semantics.structuredclassifiers.CS_Object;
import uml.commonbehavior.Behavior;
import uml.structuredclassifiers.Class_;

public class CS_Locus extends Locus {

	@Override
    public Object_ instantiate(Class_ type)
    {
        // Extends fUML semantics by instantiating a CS_Object
        // in the case where type is not a Behavior.
        // Otherwise behaves like in fUML
        Object_ object_;
        if (type instanceof Behavior) {
            object_ = super.instantiate(type);
        } else
        {
            object_ = new CS_Object();
            object_.types.add(type);
            object_.createFeatureValues();
            add(object_);
        }
        return object_;
    }
	
} // CS_Locus
