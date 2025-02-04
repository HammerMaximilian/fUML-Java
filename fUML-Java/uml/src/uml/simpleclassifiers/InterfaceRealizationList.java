package uml.simpleclassifiers;

import java.util.ArrayList;

public class InterfaceRealizationList extends ArrayList<uml.simpleclassifiers.InterfaceRealization> {
	public InterfaceRealizationList() {
		super();
	}

	public InterfaceRealization getValue(int i) {
		return (InterfaceRealization) get(i);
	}

	public void addValue(InterfaceRealization v) {
		add(v);
	}

	public void addValue(int i, InterfaceRealization v) {
		add(i, v);
	}

	public void setValue(int i, InterfaceRealization v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // InterfaceRealizationList
