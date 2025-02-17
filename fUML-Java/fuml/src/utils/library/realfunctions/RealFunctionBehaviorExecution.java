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
import fuml.semantics.simpleclassifiers.RealValue;

public abstract class RealFunctionBehaviorExecution extends
        fuml.semantics.commonbehavior.OpaqueBehaviorExecution {

	@Override
    public void doBody(
            fuml.semantics.commonbehavior.ParameterValueList inputParameters,
            fuml.semantics.commonbehavior.ParameterValueList outputParameters) {
        // Extract real arguments and perform a real function on them.

        List<Float> realArguments = new ArrayList<Float>();
        
        for (int i = 0; i < inputParameters.size(); i++) {
            float value = ((RealValue) (inputParameters.getValue(i)).values.getValue(0)).value;
            Debug.println("[doBody] argument = " + value);
            realArguments.add(value);
        }

        // Call the method specific to the real function
        Float value = this.doRealFunction(realArguments);
        
        if (value == null) {
        	// if null, then there is an invalid input argument, so return
        	// an empty list
        	LibraryFunctions.addEmptyValueListToOutputList(outputParameters);     
        } else {
    		// Add output to the outputParameters list
        	RealValue result = new RealValue();
        	result.value = value;
        	result.type = this.locus.factory.getBuiltInType("Real");
    		LibraryFunctions.addValueToOutputList(result, outputParameters);
        }             
    }

    public abstract Float doRealFunction(List<Float> arguments);
    
} // RealFunctionBehaviorExecution
