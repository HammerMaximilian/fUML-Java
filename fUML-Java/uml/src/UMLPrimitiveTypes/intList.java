
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

package UMLPrimitiveTypes;

import java.util.ArrayList;

public class intList extends ArrayList<Integer> {
	public intList() {
		super();
	}

	public int getValue(int i) {
		return (int) get(i);
	}

	public void addValue(int v) {
		add(v);
	}

	public void addValue(int i, int v) {
		add(i, v);
	}

	public void setValue(int i, int v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // intList
