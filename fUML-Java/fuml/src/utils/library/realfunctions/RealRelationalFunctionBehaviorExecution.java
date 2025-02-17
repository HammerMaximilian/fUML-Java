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

package utils.library.realfunctions;

import java.util.ArrayList;
import java.util.List;

import utils.library.LibraryFunctions;

import fuml.Debug;
import fuml.semantics.simpleclassifiers.BooleanValue;
import fuml.semantics.simpleclassifiers.RealValue;

public abstract class RealRelationalFunctionBehaviorExecution extends
        fuml.semantics.commonbehavior.OpaqueBehaviorExecution {

    public void doBody(
            fuml.semantics.commonbehavior.ParameterValueList inputParameters,
            fuml.semantics.commonbehavior.ParameterValueList outputParameters) {
        // Extract real arguments and perform an integer function on them.

        List<Float> integerArguments = new ArrayList<Float>();

        for (int i = 0; i < inputParameters.size(); i++) {
            float value = ((RealValue) (inputParameters.getValue(i)).values.getValue(0)).value;
            Debug.println("[doBody] argument = " + value);
            integerArguments.add(value);
        }

        BooleanValue result = new BooleanValue();
        result.value = this.doRealFunction(integerArguments);
        result.type = this.locus.factory.getBuiltInType("Boolean");

        Debug.println("[doBody] result = " + result.value);

		// Add output to the outputParameters list
		LibraryFunctions.addValueToOutputList(result, outputParameters);
    }

    public abstract boolean doRealFunction(List<Float> arguments);
}
