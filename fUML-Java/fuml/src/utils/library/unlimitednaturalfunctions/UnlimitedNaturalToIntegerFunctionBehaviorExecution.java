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

package utils.library.unlimitednaturalfunctions;

import utils.library.FoundationalModelLibraryModel;
import utils.library.LibraryFunctions;

import UMLPrimitiveTypes.UnlimitedNatural;
import fuml.Debug;
import fuml.semantics.simpleclassifiers.IntegerValue;
import fuml.semantics.simpleclassifiers.UnlimitedNaturalValue;

public class UnlimitedNaturalToIntegerFunctionBehaviorExecution extends
		fuml.semantics.commonbehavior.OpaqueBehaviorExecution {

    public UnlimitedNaturalToIntegerFunctionBehaviorExecution()
    {
        types.add(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger);
    }
	
	@Override
	public void doBody(
			fuml.semantics.commonbehavior.ParameterValueList inputParameters,
			fuml.semantics.commonbehavior.ParameterValueList outputParameters) {

		// Get first UnlimitedNatural input argument
		UnlimitedNaturalValue unv1 = (UnlimitedNaturalValue) inputParameters.getValue(0).values.getValue(0);
		UnlimitedNatural un1 = unv1.value;
		Debug.println("[doBody] argument = " + un1.naturalValue);
		
		// If the unlimited natural is unbounded (equal to -1), it cannot be
		// converted to an integer.  Return an empty values list.
		if (un1.naturalValue == -1) {
			Debug.println("[doBody] Unbounded input invalid for ToInteger function");
			LibraryFunctions.addEmptyValueListToOutputList(outputParameters);
		} else {
			IntegerValue resultObj = new IntegerValue();
			resultObj.value = un1.naturalValue;
			resultObj.type = this.locus.factory.getBuiltInType("Integer");
			Debug.println("[doBody] Unlimited Natural ToInteger result = " + resultObj.value);
			// Add output to the outputParameters list
			LibraryFunctions.addValueToOutputList(resultObj, outputParameters);
		}
	}
	
	@Override
    public fuml.semantics.values.Value new_() {
        return new UnlimitedNaturalToIntegerFunctionBehaviorExecution();
    }	

} // UnlimitedNaturalToIntegerFunctionBehaviorExecution
