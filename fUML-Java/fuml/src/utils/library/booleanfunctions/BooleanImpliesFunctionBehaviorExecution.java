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

import java.util.List;

import fuml.Debug;
import utils.library.FoundationalModelLibraryModel;

public class BooleanImpliesFunctionBehaviorExecution extends
	BooleanFunctionBehaviorExecution {

    public BooleanImpliesFunctionBehaviorExecution()
    {
        types.add(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies);
    }
	
    public boolean doBooleanFunction(List<Boolean> arguments) {  
    	boolean b1 = arguments.get(0);
    	boolean b2 = arguments.get(1);
    	boolean result = (!b1) || (b1 && b2);
    	Debug.println("[doBody] Boolean Implies result = " + result);
    	return result;    	
    }
    
    @Override
	public fuml.semantics.values.Value new_() {
        // Create a new instance of this kind of function behavior execution.
        return new BooleanImpliesFunctionBehaviorExecution();
    }	    

} // BooleanImpliesFunctionBehaviorExecution
