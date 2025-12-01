package fuml.extensions.actions;

import UMLPrimitiveTypes.intList;
import fuml.extensions.activities.VariableValue;
import fuml.semantics.loci.ChoiceStrategy;
import fuml.semantics.simpleclassifiers.UnlimitedNaturalValue;
import fuml.semantics.values.Value;
import uml.actions.RemoveVariableValueAction;
import uml.activities.Variable;

public class RemoveVariableValueActionActivation extends 
		WriteVariableActionActivation {

	@Override
	public void doAction() {
		// Get the values of the value input pin.
		// Remove values from the given variable.
		// If isRemoveDuplicates is true, then remove all values equal to the input value.
		// If isRemoveDuplicates is false and there is no removeAt input pin,
		// remove any one variable value equal to the input value (if there are any that are equal).
		// If isRemoveDuplicates is false, and there is a removeAt input pin
		// remove the variable value at that position.
		
		RemoveVariableValueAction action = (RemoveVariableValueAction) (this.node);
		Variable variable = action.variable;
		
		Value inputValue = null;
		if (action.value != null) {
			// NOTE: Multiplicity of the value input pin is required to be 1..1.
			inputValue = this.takeTokens(action.value).getValue(0);
		}
		
		int removeAt = 0;
		if (action.removeAt != null) {
			removeAt = ((UnlimitedNaturalValue) this
					.takeTokens(action.removeAt).getValue(0)).value.naturalValue;
		}
		
		VariableValue variableValue = this.getVariableValue(variable);
		
		if(variableValue != null)
		{
			if (action.isRemoveDuplicates) {
				int j = this.position(inputValue, variableValue.values, 1);
				while (j > 0) {
					variableValue.values.remove(j - 1);
					j = this.position(inputValue, variableValue.values, j);
				}

			} else if (action.removeAt == null) {
				intList positions = new intList();
				int j = this.position(inputValue, variableValue.values, 1);
				while (j > 0) {
					positions.addValue(j);
					j = this.position(inputValue, variableValue.values, j + 1);
				}

				if (positions.size() > 0) {
					// *** Nondeterministically choose which value to remove.
					// ***
					int k = ((ChoiceStrategy) this.getExecutionLocus().factory
							.getStrategy("choice")).choose(positions.size());
					variableValue.values.remove(positions.getValue(k - 1) - 1);
				}

			} else {
				if (variableValue.values.size() >= removeAt) {
					variableValue.values.remove(removeAt - 1);
				}
			}
		}

	} // doAction

} // RemoveVariableValueActionActivation
