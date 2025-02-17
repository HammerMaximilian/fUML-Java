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
import fuml.semantics.simpleclassifiers.StringValue;
import fuml.semantics.simpleclassifiers.UnlimitedNaturalValue;

public class UnlimitedNaturalToUnlimitedNaturalFunctionBehaviorExecution extends
		fuml.semantics.commonbehavior.OpaqueBehaviorExecution {

    public UnlimitedNaturalToUnlimitedNaturalFunctionBehaviorExecution()
    {
        types.add(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural);
    }
	
	@Override
	public void doBody(
			fuml.semantics.commonbehavior.ParameterValueList inputParameters,
			fuml.semantics.commonbehavior.ParameterValueList outputParameters) {

		// Get first StringValue input argument
		StringValue sv1 = (StringValue) inputParameters.getValue(0).values.getValue(0);
		String s = sv1.value;
		Debug.println("[doBody] argument = " + s);
		
		UnlimitedNatural un = new UnlimitedNatural();
		UnlimitedNaturalValue resultObj = new UnlimitedNaturalValue();
		resultObj.value = un;
		resultObj.type = this.locus.factory.getBuiltInType("UnlimitedNatural");
		
		// If the String is value "*", it specifies unbounded.
		if (s.equals("*")) {
			un.naturalValue = -1;
			Debug.println("[doBody] Unlimited Natural ToUnlimitedNatural result = -1");			
			// Add output to the outputParameters list
			LibraryFunctions.addValueToOutputList(resultObj, outputParameters);
			return;
		}
		
		// Convert String to integer.  This throws a NumberFormatException if the String
		// does not specify an integer
		int i = 0;
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			Debug.println("[doBody] Cannot be converted to an UnlimitedNatural: " + s);
			LibraryFunctions.addEmptyValueListToOutputList(outputParameters);
			return;
		}
		
		// If the integer is less than -1, it cannot be converted to an UnlimitedNatural.
		// Return an empty values list
		if (i < 0) {
			Debug.println("[doBody] Cannot be converted to an UnlimitedNatural: " + i);
			LibraryFunctions.addEmptyValueListToOutputList(outputParameters);
		} else {
			Debug.println("[doBody] Unlimited Natural ToUnlimitedNatural result = " + i);
			un.naturalValue = i;
			// Add output to the outputParameters list
			LibraryFunctions.addValueToOutputList(resultObj, outputParameters);
		}
		
		return;
	}
	
    @Override
    public fuml.semantics.values.Value new_() {
        return new UnlimitedNaturalToUnlimitedNaturalFunctionBehaviorExecution();
    }	

} // UnlimitedNaturalToUnlimitedNaturalFunctionBehaviorExecution
