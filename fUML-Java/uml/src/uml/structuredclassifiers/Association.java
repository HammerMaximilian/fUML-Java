
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

package uml.structuredclassifiers;

import uml.classification.Property;

public class Association extends uml.classification.Classifier {

	public boolean isDerived = false;
	public uml.classification.PropertyList ownedEnd = new uml.classification.PropertyList();
	public uml.commonstructure.TypeList endType = new uml.commonstructure.TypeList();
	public uml.classification.PropertyList memberEnd = new uml.classification.PropertyList();
	public uml.classification.PropertyList navigableOwnedEnd = new uml.classification.PropertyList();

	public void addOwnedEnd(uml.classification.Property ownedEnd) {
		super.addFeature(ownedEnd);
		super.addOwnedMember(ownedEnd);

		this.ownedEnd.addValue(ownedEnd);
		ownedEnd._setOwningAssociation(this);

		this.addMemberEnd(ownedEnd);
	} // addOwnedEnd

	public void addNavigableOwnedEnd(
			uml.classification.Property navigableOwnedEnd) {
		// Note: A navigable end must also be set as an owned end using
		// setOwnedEnd.

		this.navigableOwnedEnd.addValue(navigableOwnedEnd);
	} // addNavigableOwnedEnd
	
	public void addMemberEnd(uml.classification.Property memberEnd) {
		// Note: This operation should not be used for owned ends. The
		// operation addOwnedEnd should be used instead.

		this.addMember(memberEnd);
		this._addMemberEnd(memberEnd);
	}
	
	protected void _addMemberEnd(uml.classification.Property memberEnd) {
		this.memberEnd.addValue(memberEnd);
		memberEnd._setAssociation(this);

		if (memberEnd.typedElement.type != null) {
			this.endType.addValue(memberEnd.typedElement.type);
		}

		if (this.memberEnd.size() == 2) {
			Property opposite = this.memberEnd.get(0);
			memberEnd._setOpposite(opposite);
			opposite._setOpposite(memberEnd);
		} else if (this.memberEnd.size() > 2) {
			for (Property end : this.memberEnd) {
				end._setOpposite(null);
			}
		}
		
	}

} // Association
