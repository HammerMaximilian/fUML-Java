package fuml.extensions.actions;

import fuml.extensions.activities.VariableValue;
import fuml.semantics.loci.ChoiceStrategy;
import fuml.semantics.simpleclassifiers.UnlimitedNaturalValue;
import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;
import uml.actions.AddVariableValueAction;
import uml.activities.Variable;

public class AddVariableValueActionActivation extends 
		WriteVariableActionActivation {

	@Override
	public void doAction() {
		// Get the values of the value input pin.
		// Add a value to the values for the appropriate variable.
		// If isReplaceAll is true, first remove all current matching variable values.
		// If isReplaceAll is false and there is an insertAt pin, insert the
		// value at the appropriate position.
		
		AddVariableValueAction action = (AddVariableValueAction) (this.node);
		Variable variable = action.variable;
		
		ValueList inputValues = this.takeTokens(action.value);
		
		// NOTE: Multiplicity of the value input pin is required to be 1..1.
		Value inputValue = inputValues.getValue(0);
		
		int insertAt = 0;
		if (action.insertAt != null) {
			insertAt = ((UnlimitedNaturalValue) this
					.takeTokens(action.insertAt).getValue(0)).value.naturalValue;
		}
		
		VariableValue variableValue = this.getVariableValue(variable);
		
		if(variableValue != null)
		{
			if(action.isReplaceAll)
			{
				variableValue.values = inputValues;
				variableValue.position = 0;
			}
			else
			{
				if (variableValue.values.size() > 0 & insertAt == 0) {
					// *** If there is no insertAt pin, then the structural
					// feature must be unordered, and the insertion position is
					// immaterial. ***
					insertAt = ((ChoiceStrategy) this.getExecutionLocus().factory
							.getStrategy("choice")).choose(variableValue.values
							.size());
				}

				if (variable.multiplicityElement.isUnique) {
					// Remove any existing value that duplicates the input value
					int j = position(inputValue, variableValue.values, 1);
					if (j > 0) {
						variableValue.values.remove(j - 1);
					}
				}
				
				if (insertAt <= 0) { // Note: insertAt = -1 indicates an
									// unlimited value of "*"
					variableValue.values.addValue(inputValue);
				} 
				else {
					variableValue.values.addValue(insertAt - 1, inputValue);
				}
			}
		}
		
	} // doAction

} // AddVariableValueActionActivation
