package pscs.semantics.actions;

import fuml.semantics.actions.ReadExtentActionActivation;
import fuml.semantics.structuredclassifiers.ExtensionalValueList;
import fuml.semantics.structuredclassifiers.Object_;
import fuml.semantics.structuredclassifiers.Reference;
import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;
import pscs.semantics.structuredclassifiers.CS_Object;
import pscs.semantics.structuredclassifiers.CS_Reference;
import uml.actions.ReadExtentAction;

public class CS_ReadExtentActionActivation extends ReadExtentActionActivation {

	@Override
    public void doAction()
    {
        // Get the extent, at the current execution locus, of the classifier
        // (which must be a class) identified in the action.
        // Place references to the resulting set of objects on the result pin.
        // Extends default fUML semantics in the sense that produced tokens contain
        // CS_References instead of References, in the case where the object is a
        // CS_Object
        ReadExtentAction action = (ReadExtentAction)node;
        ExtensionalValueList objects = getExecutionLocus().getExtent(action.classifier);

        ValueList references = new ValueList();
        for (Value object_ : objects)
        {
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
            reference.referent = (Object_)object_;
            references.add(reference);
        }
        putTokens(action.result, references);
    }
} // CS_ReadExtentActionActivation
