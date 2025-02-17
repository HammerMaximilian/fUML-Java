
/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * All modifications copyright 2009-2016 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package fuml.semantics.simpleclassifiers;

import uml.values.LiteralReal;

public class RealValue extends fuml.semantics.simpleclassifiers.PrimitiveValue {

	public float value = 0.0f;

	public uml.values.ValueSpecification specify() {
		// Return a literal real with the value of this real value.

		LiteralReal literal = new LiteralReal();

		literal.type = this.type;
		literal.value = this.value;

		return literal;
	} // specify

	public boolean equals(fuml.semantics.values.Value otherValue) {
		// Test if this real value is equal to the otherValue.
		// To be equal, the otherValue must have the same value as this real
		// value.

		boolean isEqual = false;
		if (otherValue instanceof RealValue) {
			isEqual = ((RealValue) otherValue).value == this.value;
		}

		return isEqual;
	} // equals

	public fuml.semantics.values.Value copy() {
		// Create a new real value with the same value as this real value.

		RealValue newValue = (RealValue) (super.copy());

		newValue.value = this.value;
		return newValue;
	} // copy

	protected fuml.semantics.values.Value new_() {
		return new RealValue();
	} // new_

	public String toString() {
		String stringValue = "";

		if (this.value == 0) {
			stringValue = "0";
		} else {
			float positiveValue = this.value;

			if (positiveValue < 0) {
				positiveValue = -positiveValue;
			}

			int exponent = 0;

			if (positiveValue < .1) {
				while (positiveValue < .1) {
					positiveValue = positiveValue * 10;
					exponent = exponent - 1;
				}
			} else if (positiveValue >= 1) {
				while (positiveValue >= 1) {
					positiveValue = positiveValue / 10;
					exponent = exponent + 1;
				}
			}

			// This gives 9 significant digits in the mantissa.
			for (int i = 0; i < 9; i++) {
				positiveValue = positiveValue * 10;
			}

			IntegerValue integerValue = new IntegerValue();
			integerValue.value = (int) positiveValue;
			stringValue = "0." + integerValue.toString();
			integerValue.value = exponent;
			stringValue = stringValue + "E" + integerValue.toString();

			if (this.value < 0) {
				stringValue = "-" + stringValue;
			}
		}

		return stringValue;
	} // toString

} // RealValue
