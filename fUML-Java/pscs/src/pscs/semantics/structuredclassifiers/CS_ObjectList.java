package pscs.semantics.structuredclassifiers;

import java.util.ArrayList;

public class CS_ObjectList extends ArrayList<pscs.semantics.structuredclassifiers.CS_Object> {
	public CS_ObjectList() {
		super();
	}

	public CS_Object getValue(int i) {
		return (CS_Object) get(i);
	}

	public void addValue(CS_Object v) {
		add(v);
	}

	public void addValue(int i, CS_Object v) {
		add(i, v);
	}

	public void setValue(int i, CS_Object v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // CS_ObjectList
