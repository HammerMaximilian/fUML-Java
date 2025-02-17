
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

package fuml.semantics.values;

import uml.simpleclassifiers.PrimitiveType;

public abstract class LiteralEvaluation extends
		fuml.semantics.values.Evaluation {

	public uml.simpleclassifiers.PrimitiveType getType(
			String builtInTypeName) {
		// Get the type of the specification. If that is null, then use the
		// built-in type of the given name.

		PrimitiveType type = (PrimitiveType) (this.specification.type);

		if (type == null) {
			type = this.locus.factory.getBuiltInType(builtInTypeName);
		}

		return type;
	} // getType

} // LiteralEvaluation
