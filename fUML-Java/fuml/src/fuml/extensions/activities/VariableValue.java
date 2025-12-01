package fuml.extensions.activities;

import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;

public class VariableValue {
	
	public uml.activities.Variable variable = null;
	public fuml.semantics.values.ValueList values = new fuml.semantics.values.ValueList();
	public int position = 0;
	
	public VariableValue copy() {
		// Create a copy of this feature value.

		VariableValue newValue = new VariableValue();

		newValue.variable = this.variable;
		newValue.position = this.position;

		ValueList values = this.values;
		for (int i = 0; i < values.size(); i++) {
			Value value = values.getValue(i);
			newValue.values.addValue(value.copy());
		}

		return newValue;
	} // copy
	
} // VariableValue
