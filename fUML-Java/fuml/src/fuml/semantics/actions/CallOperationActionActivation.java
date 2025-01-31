
/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * Modifications:
 * Copyright 2009-2012 Data Access Technologies, Inc.
 * Copyright 2020 Model Driven Solutions, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package fuml.semantics.actions;

import fuml.Debug;
import fuml.semantics.commonbehavior.Execution;
import fuml.semantics.structuredclassifiers.Reference;
import fuml.semantics.values.Value;
import uml.actions.CallOperationAction;
import uml.classification.ParameterList;
import uml.packages.Stereotype;
import uml.packages.StereotypeList;

public class CallOperationActionActivation extends
		fuml.semantics.actions.CallActionActivation {
	
	public boolean isReady() {
		// Check that this call operation action activation is ready to fire as a
		// call action activation and, in addition, that the input pin activation
		// for its target pin is ready to fire.
		
		boolean ready = super.isReady();
		if (ready) {
			CallOperationAction action = (CallOperationAction) (this.node);
			ready = this.getPinActivation(action.target).isReady();
		}
		return ready;
	}

	public fuml.semantics.commonbehavior.Execution getCallExecution() {
		// If the value on the target input pin is a reference, dispatch the
		// operation to it and return the resulting execution object.

		CallOperationAction action = (CallOperationAction) (this.node);
		boolean isExplicitBaseClassCall = isExplicitBaseClassCall(action);
		Value target = this.takeTokens(action.target).getValue(0);

		Execution execution = null;
		if (target instanceof Reference) {
			
			Reference reference = (Reference)target;
			
			try
			{
				if(!isExplicitBaseClassCall)
				{
					execution = reference.dispatch(action.operation); 
				}
				else
				{
					execution = reference.dispatch(action.operation, isExplicitBaseClassCall);
				}
			}
			catch(IllegalStateException e)
			{
				Debug.println(e.getMessage());
			}
			
		} else {
			execution = null;
		}

		return execution;

	} // getCallExecution

	@Override
	public ParameterList getParameters() {
		// Get the owned parameters of the operation of the call operation
		// action for this call operation action activation.
		
		return ((CallOperationAction) (this.node)).operation.ownedParameter;
	}
	
    public boolean isExplicitBaseClassCall(CallOperationAction callOperationAction)
    {
        StereotypeList appliedStereotypes = callOperationAction.appliedStereotype;
        int i = 0;
        boolean isExplicitBaseClassCall = false;
        while (i < appliedStereotypes.size() && !isExplicitBaseClassCall)
        {
            Stereotype s = appliedStereotypes.getValue(i);
            if (s.name.equals("ExplicitBaseClassCall"))
            {
                isExplicitBaseClassCall = true;
            }
        }
        return isExplicitBaseClassCall;
    }

} // CallOperationActionActivation
