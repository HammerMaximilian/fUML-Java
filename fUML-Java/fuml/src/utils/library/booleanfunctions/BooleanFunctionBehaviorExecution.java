/*
 * Copyright 2008 Lockheed Martin Corporation, except as stated in the file 
 * entitled Licensing-Information. 
 * 
 * All modifications copyright 2009-2012 Data Access Technologies, Inc.
 * 
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 *
 * Contributors:
 *   MDS - initial API and implementation
 *
 */

package utils.library.booleanfunctions;

import java.util.ArrayList;
import java.util.List;

import utils.library.LibraryFunctions;

import fuml.Debug;
import fuml.semantics.simpleclassifiers.BooleanValue;

public abstract class BooleanFunctionBehaviorExecution extends
		fuml.semantics.commonbehavior.OpaqueBehaviorExecution {

	@Override
	public void doBody(
			fuml.semantics.commonbehavior.ParameterValueList inputParameters,
			fuml.semantics.commonbehavior.ParameterValueList outputParameters) {

        List<Boolean> arguments = new ArrayList<Boolean>();
        
        for (int i = 0; i < inputParameters.size(); i++) {
            boolean value = ((BooleanValue) (inputParameters.getValue(i)).values.getValue(0)).value;
            Debug.println("[doBody] argument = " + value);
            arguments.add(value);
        }

		boolean value = doBooleanFunction(arguments);

		BooleanValue result = new BooleanValue();
		result.value = value;
		result.type = this.locus.factory.getBuiltInType("Boolean");

		LibraryFunctions.addValueToOutputList(result, outputParameters);
	}
	
    public abstract boolean doBooleanFunction(List<Boolean> arguments);

} // BooleanFunctionBehaviorExecution
