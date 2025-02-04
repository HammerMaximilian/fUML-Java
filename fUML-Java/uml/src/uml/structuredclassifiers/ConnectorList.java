package uml.structuredclassifiers;

import java.util.ArrayList;

public class ConnectorList extends ArrayList<uml.structuredclassifiers.Connector> {
	public ConnectorList() {
		super();
	}

	public Connector getValue(int i) {
		return (Connector) get(i);
	}

	public void addValue(Connector v) {
		add(v);
	}

	public void addValue(int i, Connector v) {
		add(i, v);
	}

	public void setValue(int i, Connector v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // ConnectorList
