package uml.structuredclassifiers;

import java.util.ArrayList;

public class ConnectorEndList extends ArrayList<uml.structuredclassifiers.ConnectorEnd> {
	public ConnectorEndList() {
		super();
	}

	public ConnectorEnd getValue(int i) {
		return (ConnectorEnd) get(i);
	}

	public void addValue(ConnectorEnd v) {
		add(v);
	}

	public void addValue(int i, ConnectorEnd v) {
		add(i, v);
	}

	public void setValue(int i, ConnectorEnd v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // ConnectorEndList
