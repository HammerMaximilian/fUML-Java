package fuml.semantics.structuredclassifiers;

import java.util.ArrayList;

public class ReferenceList extends ArrayList<fuml.semantics.structuredclassifiers.Reference> {
	public ReferenceList() {
		super();
	}

	public Reference getValue(int i) {
		return (Reference) get(i);
	}

	public void addValue(Reference v) {
		add(v);
	}

	public void addValue(int i, Reference v) {
		add(i, v);
	}

	public void setValue(int i, Reference v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // ReferenceList
