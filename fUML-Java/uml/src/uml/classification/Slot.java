
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

package uml.classification;

public class Slot extends uml.commonstructure.Element {

	public uml.classification.InstanceSpecification owningInstance = null;
	public uml.classification.StructuralFeature definingFeature = null;
	public uml.values.ValueSpecificationList value = new uml.values.ValueSpecificationList();

	public void setDefiningFeature(
			uml.classification.StructuralFeature definingFeature) {
		this.definingFeature = definingFeature;
	} // setDefiningFeature

	public void addValue(uml.values.ValueSpecification value) {
		this.addOwnedElement(value);
		this.value.addValue(value);
	} // addValue

	public void _setOwningInstance(
			uml.classification.InstanceSpecification owningInstance) {
		this.owningInstance = owningInstance;
	} // _setOwningInstance

} // Slot
