package uml.commonstructure;

import java.util.ArrayList;

public class DependencyList extends
	ArrayList<uml.commonstructure.Dependency> 
{
	public DependencyList() {
		super();
	}

	public Dependency getValue(int i) {
		return (Dependency) get(i);
	}

	public void addValue(Dependency v) {
		add(v);
	}

	public void addValue(int i, Dependency v) {
		add(i, v);
	}

	public void setValue(int i, Dependency v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // DependencyList
