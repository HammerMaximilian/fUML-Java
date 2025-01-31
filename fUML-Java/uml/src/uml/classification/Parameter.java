
/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * Modifications: 
 * Copyright 2009-2012 Data Access Technologies, Inc.
 * Copyright 2019 Model Driven Solutions, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package uml.classification;

public class Parameter extends uml.commonstructure.TypedElement {

	public uml.commonstructure.MultiplicityElement multiplicityElement = new uml.commonstructure.MultiplicityElement();
	public uml.classification.ParameterDirectionKind direction = uml.classification.ParameterDirectionKind.in;
	public uml.classification.Operation operation = null;
	public boolean isStream = false;

	public void setDirection(
			uml.classification.ParameterDirectionKind direction) {
		this.direction = direction;
	} // setDirection

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
	
	public void setIsStream(boolean isStream) {
		this.isStream = isStream;
	}

	public void _setOperation(uml.classification.Operation operation) {
		this.operation = operation;
	} // _setOperation

} // Parameter
