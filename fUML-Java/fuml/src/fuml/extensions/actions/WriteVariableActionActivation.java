package fuml.extensions.actions;

public abstract class WriteVariableActionActivation extends 
		VariableActionActivation {
	
	public int position(fuml.semantics.values.Value value,
			fuml.semantics.values.ValueList list, int startAt) {
		// Return the position (counting from 1) of the first occurance of the
		// given value in the given list at or after the starting index, or 0 if
		// it is not found.

		boolean found = false;
		int i = startAt;
		while (!found & i <= list.size()) {
			found = list.getValue(i - 1).equals(value);
			i = i + 1;
		}

		if (!found) {
			i = 1;
		}

		return i - 1;
	} // position

} // WriteVariableActionActivation
