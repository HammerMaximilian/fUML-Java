
/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * All modifications copyright 2009-2012 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package uml.commonstructure;

import java.util.ArrayList;

public class ElementList extends ArrayList<uml.commonstructure.Element> {
	public ElementList() {
		super();
	}

	public Element getValue(int i) {
		return (Element) get(i);
	}

	public void addValue(Element v) {
		add(v);
	}

	public void addValue(int i, Element v) {
		add(i, v);
	}

	public void setValue(int i, Element v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // ElementList
