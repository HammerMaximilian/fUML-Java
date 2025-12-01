package fuml.extensions.actions;

import fuml.extensions.activities.VariableValue;
import fuml.semantics.values.ValueList;
import uml.actions.ReadVariableAction;
import uml.activities.Variable;

public class ReadVariableActionActivation extends 
		VariableActionActivation {

	@Override
	public void doAction() {
		// Get the values of the appropriate variable and place them on the result output pin.
		
		ReadVariableAction action = (ReadVariableAction) (this.node);
		Variable variable = action.variable;
		VariableValue variableValue = this.getVariableValue(variable);
		ValueList values = new ValueList();
		
		if(variableValue != null)
		{
			values = variableValue.values;
		}
		
		this.putTokens(action.result, values);

	} // doAction

} // ReadVariableActionActivation
