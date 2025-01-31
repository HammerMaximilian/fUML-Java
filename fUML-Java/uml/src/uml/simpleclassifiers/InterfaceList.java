package uml.simpleclassifiers;

import java.util.ArrayList;

public class InterfaceList extends ArrayList<uml.simpleclassifiers.Interface> {
	public InterfaceList() {
		super();
	}

	public Interface getValue(int i) {
		return (Interface) get(i);
	}

	public void addValue(Interface v) {
		add(v);
	}

	public void addValue(int i, Interface v) {
		add(i, v);
	}

	public void setValue(int i, Interface v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // InterfaceList
