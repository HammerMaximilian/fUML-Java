package fuml.extensions.activities;

import java.util.ArrayList;

public class VariableValueList extends ArrayList<VariableValue> {
	public VariableValueList() {
		super();
	}

	public VariableValue getValue(int i) {
		return (VariableValue) get(i);
	}

	public void addValue(VariableValue v) {
		add(v);
	}

	public void addValue(int i, VariableValue v) {
		add(i, v);
	}

	public void setValue(int i, VariableValue v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // VariableValueList
