package uml.packages;

import java.util.ArrayList;

public class StereotypeList extends ArrayList<Stereotype> {
	public StereotypeList() {
		super();
	}

	public Stereotype getValue(int i) {
		return (Stereotype) get(i);
	}

	public void addValue(Stereotype v) {
		add(v);
	}

	public void addValue(int i, Stereotype v) {
		add(i, v);
	}

	public void setValue(int i, Stereotype v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // StereotypeList