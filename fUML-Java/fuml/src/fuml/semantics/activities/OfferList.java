
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

package fuml.semantics.activities;

import java.util.ArrayList;

public class OfferList extends
		ArrayList<fuml.semantics.activities.Offer> {
	public OfferList() {
		super();
	}

	public Offer getValue(int i) {
		return (Offer) get(i);
	}

	public void addValue(Offer v) {
		add(v);
	}

	public void addValue(int i, Offer v) {
		add(i, v);
	}

	public void setValue(int i, Offer v) {
		set(i, v);
	}

	public void removeValue(int i) {
		remove(i);
	}
} // OfferList
