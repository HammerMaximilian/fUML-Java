
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

public abstract class StructuralFeature extends
		uml.classification.Feature {

	public uml.commonstructure.TypedElement typedElement = new uml.commonstructure.TypedElement();
	public uml.commonstructure.MultiplicityElement multiplicityElement = new uml.commonstructure.MultiplicityElement();
	public boolean isReadOnly = false;

	public void setIsReadOnly(boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	} // setIsReadOnly

	public void setIsOrdered(boolean isOrdered) {
		this.multiplicityElement.setIsOrdered(isOrdered);
	} // setIsOrdered

	public void setIsUnique(boolean isUnique) {
		this.multiplicityElement.setIsUnique(isUnique);
	} // setIsUnique

	public void setUpperValue(
			uml.values.ValueSpecification upperValue) {
		this.multiplicityElement.setUpperValue(upperValue);
	} // setUpperValue

	public void setLowerValue(
			uml.values.ValueSpecification lowerValue) {
		this.multiplicityElement.setLowerValue(lowerValue);
	} // setLowerValue

	public void setUpper(int upper) {
		// Note: This is a convenience operation that may be used _instead_ of
		// setUpperValue, not in addition to it.

		this.multiplicityElement.setUpper(upper);
	} // setUpper

	public void setLower(int lower) {
		// Note: This is a convenience operation that may be used _instead_ of
		// setLowerValue, not in addition to it.

		this.multiplicityElement.setLower(lower);

	} // setLower

	public void setType(uml.commonstructure.Type type) {
		this.typedElement.setType(type);
	} // setType

} // StructuralFeature
