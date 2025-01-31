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

public class IntegerMinusFunctionBehaviorExecution extends
        IntegerFunctionBehaviorExecution {

    public IntegerMinusFunctionBehaviorExecution()
    {
        types.add(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus);
    }
	
    public Integer doIntegerFunction(UMLPrimitiveTypes.intList arguments) {
    	    	
    	int i1 = arguments.getValue(0);
    	int i2 = arguments.getValue(1);
    	
    	int i = i1 - i2;
    	
    	Debug.println("[doBody] Integer Minus result = " + i);
    	return i;
    }

    public fuml.semantics.values.Value new_() {
        // Create a new instance of this kind of function behavior execution.
        return new IntegerMinusFunctionBehaviorExecution();
    }

} // IntegerMinusFunctionBehaviorExecution
