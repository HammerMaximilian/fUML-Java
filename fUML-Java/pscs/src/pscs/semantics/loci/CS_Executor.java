package pscs.semantics.loci;

import fuml.Debug;
import fuml.semantics.commonbehavior.ParameterValueList;
import fuml.semantics.loci.Executor;
import fuml.semantics.structuredclassifiers.Object_;
import fuml.semantics.structuredclassifiers.Reference;
import pscs.semantics.structuredclassifiers.CS_Object;
import pscs.semantics.structuredclassifiers.CS_Reference;
import uml.structuredclassifiers.Class_;

public class CS_Executor extends Executor {

	@Override
    public Reference start(Class_ type, ParameterValueList inputs)
    {
        // Instantiate the given class and start any behavior of the resulting
        // object.
        // (The behavior of an object includes any classifier behaviors for an
        // active object or the class of the object itself, if that is a
        // behavior.)
        // fUML semantics is extended in the sense that when the instantiated object
        // is a CS_Object, a CS_Reference is returned (instead of a Reference)
        Debug.println("[start] Starting " + type.name + "...");
        Object_ object_ = locus.instantiate(type);
        Debug.println("[start] Object = " + object_);
        object_.startBehavior(type, inputs);
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
        return reference;
    }
	
} // CS_Executor
