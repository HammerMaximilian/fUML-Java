package uml.structuredclassifiers;

import java.util.ArrayList;

public class PortList extends ArrayList<uml.structuredclassifiers.Port> {
	public PortList() {
		super();
	}

	public Port getValue(int i) {
		return (Port) get(i);
	}

	public void addValue(Port v) {
		add(v);
	}

	public void addValue(int i, Port v) {
		add(i, v);
	}

	public void setValue(int i, Port v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // PortList
