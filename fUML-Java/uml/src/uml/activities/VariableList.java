package uml.activities;

import java.util.ArrayList;

public class VariableList extends
		ArrayList<uml.activities.Variable> {
	public VariableList() {
		super();
	}
	
	public Variable getValue(int i) {
		return (Variable) get(i);
	}
	
	public void addValue(Variable v) {
		add(v);
	}
	
	public void addValue(int i, Variable v) {
		add(i, v);
	}
	
	public void setValue(int i, Variable v) {
		set(i, v);
	}
	
	public void removeValue(int i) {
		remove(i);
	}

} // VariableList
