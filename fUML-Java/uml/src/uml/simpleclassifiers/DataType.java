
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

package uml.simpleclassifiers;

public class DataType extends uml.classification.Classifier {

	public uml.classification.PropertyList ownedAttribute = new uml.classification.PropertyList();

	public void addOwnedAttribute(
			uml.classification.Property ownedAttribute) {
		super.addAttribute(ownedAttribute);
		super.addOwnedMember(ownedAttribute);

		this.ownedAttribute.addValue(ownedAttribute);
		ownedAttribute._setDatatype(this);
	} // addOwnedAttribute

} // DataType
