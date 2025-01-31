package pscs.semantics.structuredclassifiers;

import java.util.ArrayList;

public class CS_LinkList extends ArrayList<pscs.semantics.structuredclassifiers.CS_Link> {
	public CS_LinkList() {
		super();
	}

	public CS_Link getValue(int i) {
		return (CS_Link) get(i);
	}

	public void addValue(CS_Link v) {
		add(v);
	}

	public void addValue(int i, CS_Link v) {
		add(i, v);
	}

	public void setValue(int i, CS_Link v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // CS_LinkList
