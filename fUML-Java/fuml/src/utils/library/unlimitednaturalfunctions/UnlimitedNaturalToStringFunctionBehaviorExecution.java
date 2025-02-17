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

import fuml.Debug;
import fuml.semantics.simpleclassifiers.StringValue;
import fuml.semantics.simpleclassifiers.UnlimitedNaturalValue;

public class UnlimitedNaturalToStringFunctionBehaviorExecution extends
		fuml.semantics.commonbehavior.OpaqueBehaviorExecution {

    public UnlimitedNaturalToStringFunctionBehaviorExecution()
    {
        types.add(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString);
    }
	
	public void doBody(
			fuml.semantics.commonbehavior.ParameterValueList inputParameters,
			fuml.semantics.commonbehavior.ParameterValueList outputParameters) {

		UnlimitedNaturalValue unv1 = (UnlimitedNaturalValue) inputParameters.getValue(0).values.getValue(0);
		Debug.println("[doBody] argument = " + unv1.value.naturalValue);
		
		// Perform the toString operation.  If value is -1, return "*"
		StringValue resultObj = new StringValue();
		resultObj.value = unv1.toString();
		resultObj.type = this.locus.factory.getBuiltInType("String");

		Debug.println("[doBody] Unlimited Natural ToString result = " + resultObj.value);
				
		// Add output to the outputParameters list
		LibraryFunctions.addValueToOutputList(resultObj, outputParameters);
	}
	
    @Override
    public fuml.semantics.values.Value new_() {
        return new UnlimitedNaturalToStringFunctionBehaviorExecution();
    }	

} // UnlimitedNaturalToStringFunctionBehaviorExecution
