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

import java.util.List;

import fuml.Debug;
import utils.library.FoundationalModelLibraryModel;

public class RealGreaterThanEqualFunctionBehaviorExecution extends
        RealRelationalFunctionBehaviorExecution {

    public RealGreaterThanEqualFunctionBehaviorExecution()
    {
        types.add(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual);
    }
	
    public boolean doRealFunction(List<Float> arguments) {

    	float x1 = arguments.get(0);
    	float x2 = arguments.get(1);
    	
    	boolean b = (x1 >= x2);
    	
    	Debug.println("[doBody] Real Greater Than or Equal result = " + b);
    	return b;
    }

    public fuml.semantics.values.Value new_() {
        // Create a new instance of this kind of function behavior execution.
        return new RealGreaterThanEqualFunctionBehaviorExecution();
    }

} // RealGreaterThanEqualFunctionBehaviorExecution
