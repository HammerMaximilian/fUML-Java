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

package utils.library.integerfunctions;

import fuml.Debug;
import utils.library.FoundationalModelLibraryModel;

public class IntegerNegateFunctionBehaviorExecution extends
        IntegerFunctionBehaviorExecution {

    public IntegerNegateFunctionBehaviorExecution()
    {
        types.add(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg);
    }
	
    public Integer doIntegerFunction(UMLPrimitiveTypes.intList arguments) {

    	int i1 = arguments.getValue(0);

        // Compute the negate  function.
        int i = -i1;
        
    	Debug.println("[doBody] Integer Negate result = " + i);
    	return i;
    }

    public fuml.semantics.values.Value new_() {
        // Create a new instance of this kind of function behavior execution.
        return new IntegerNegateFunctionBehaviorExecution();
    }

} // IntegerNegateFunctionBehaviorExecution
