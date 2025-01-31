package pscs.semantics.actions;

import fuml.semantics.actions.CreateObjectActionActivation;
import fuml.semantics.structuredclassifiers.Object_;
import fuml.semantics.structuredclassifiers.Reference;
import pscs.semantics.structuredclassifiers.CS_Object;
import pscs.semantics.structuredclassifiers.CS_Reference;
import uml.actions.CreateObjectAction;
import uml.structuredclassifiers.Class_;

public class CS_CreateObjectActionActivation extends CreateObjectActionActivation {

	@Override
    public void doAction()
    {
        // Create an object with the given classifier (which must be a class) as
        // its type, at the same locus as the action activation.
        // Place a reference to the object on the result pin of the action.
        // Extends fUML semantics in the sense that the reference placed
        // on the result pin is a CS_Reference (in the case where the instantiated object
        // is a CS_Object) not a Reference
        // Note that Locus.instantiate(Class) is extended in this specification
        // to produce a CS_Object instead of an Object in the case where the class
        // to be instantiated is not a behavior
        CreateObjectAction action = (CreateObjectAction)node;
        Reference reference;
        Object_ referent = getExecutionLocus().instantiate((Class_)action.classifier);
        if (referent instanceof CS_Object cS_Object)
        {
            reference = new CS_Reference();
            ((CS_Reference)reference).compositeReferent = cS_Object;
        }
        else
        {
            reference = new Reference();
        }
        reference.referent = referent;
        putToken(action.result, reference);
    }
	
} // CS_CreateObjectActionActivation
