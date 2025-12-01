package fuml.extensions.actions;

import fuml.extensions.activities.VariableValue;
import fuml.extensions.activities.VariableValueList;
import fuml.semantics.activities.ActivityNodeActivationGroup;
import fuml.semantics.values.ValueList;
import uml.actions.ClearVariableAction;
import uml.activities.Variable;

public class ClearVariableActionActivation extends 
		VariableActionActivation {

	@Override
	public void doAction() {
		// Set the appropriate variable's value to be empty.
		
		ClearVariableAction action = (ClearVariableAction) (this.node);
		Variable variable = action.variable;
		
		VariableValue variableValue = this.getVariableValue(variable);
		
		if(variableValue != null)
		{
			variableValue.values = new ValueList();
			variableValue.position = 0;
		}

	} // doAction

} // ClearVariableActionActivation
