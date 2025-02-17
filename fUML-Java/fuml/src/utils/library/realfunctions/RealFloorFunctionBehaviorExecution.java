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

import utils.library.FoundationalModelLibraryModel;
import utils.library.LibraryFunctions;

import fuml.Debug;
import fuml.semantics.simpleclassifiers.IntegerValue;
import fuml.semantics.simpleclassifiers.RealValue;

public class RealFloorFunctionBehaviorExecution extends
	fuml.semantics.commonbehavior.OpaqueBehaviorExecution {

    public RealFloorFunctionBehaviorExecution()
    {
        types.add(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor);
    }
	
    public void doBody(
            fuml.semantics.commonbehavior.ParameterValueList inputParameters,
            fuml.semantics.commonbehavior.ParameterValueList outputParameters) {
    	
    	RealValue rv = (RealValue) inputParameters.getValue(0).values.getValue(0);
    	float x = rv.value;
        Debug.println("[doBody] argument = " + x);
    	
    	int resultInt;
        try {
        	resultInt = (int)Math.floor(x);
        } catch (Exception e) {
        	LibraryFunctions.addEmptyValueListToOutputList(outputParameters);
        	return;
        }
    	
    	IntegerValue result = new IntegerValue();
    	result.value = resultInt;
    	result.type = this.locus.factory.getBuiltInType("Integer");

        Debug.println("[doBody] Real Floor result = " + result.value);

		LibraryFunctions.addValueToOutputList(result, outputParameters);
    }

    public fuml.semantics.values.Value new_() {
        // Create a new instance of this kind of function behavior execution.
        return new RealFloorFunctionBehaviorExecution();
    }

} 
