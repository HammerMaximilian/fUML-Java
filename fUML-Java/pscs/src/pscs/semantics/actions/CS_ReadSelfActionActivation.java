package pscs.semantics.actions;

import fuml.semantics.actions.ReadSelfActionActivation;
import pscs.semantics.structuredclassifiers.CS_Object;
import pscs.semantics.structuredclassifiers.CS_Reference;
import uml.actions.OutputPin;
import uml.actions.ReadSelfAction;

public class CS_ReadSelfActionActivation extends ReadSelfActionActivation {
    
	@Override
	public void doAction()
    {
        // Get the context object of the activity execution containing this
        // action activation and place a reference to it on the result output
        // pin.
        // Extends fUML semantics in the sense that the reference placed on
        // the result pin is a CS_Reference, not a Reference
        // Debug.println("[ReadSelfActionActivation] Start...");
        CS_Reference context = new CS_Reference();
        context.referent = this.getExecutionContext();
        if (context.referent instanceof CS_Object cS_Object)
        {// i.e. alternatively, it can be an execution
            context.compositeReferent = cS_Object;
        }

        OutputPin resultPin = ((ReadSelfAction)node).result;
        putToken(resultPin, context);
    }
} // CS_ReadSelfActionActivation
