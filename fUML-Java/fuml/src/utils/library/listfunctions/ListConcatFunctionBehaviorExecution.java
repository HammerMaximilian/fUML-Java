/*
 * Copyright 2011 Data Access Technologies, Inc. 
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 *
 * Contributors:
 *   MDS - initial API and implementation
 *
 */

package utils.library.listfunctions;

import fuml.Debug;
import fuml.semantics.commonbehavior.OpaqueBehaviorExecution;
import fuml.semantics.commonbehavior.ParameterValueList;
import fuml.semantics.values.ValueList;
import utils.library.FoundationalModelLibraryModel;

public class ListConcatFunctionBehaviorExecution extends OpaqueBehaviorExecution {

    public ListConcatFunctionBehaviorExecution()
    {
        types.add(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat);
    }
	
	@Override
    public void doBody(
            ParameterValueList inputParameters,
            ParameterValueList outputParameters) {
    	
    	ValueList list1 = (ValueList) inputParameters.get(0).values;
    	ValueList list2 = (ValueList) inputParameters.get(1).values;
    	
    	ValueList result = new ValueList();
    	result.addAll(list1);
    	result.addAll(list2);

        Debug.println("[doBody] List Concat, result=" + result);

		outputParameters.get(0).values = result;
    }
    
    public fuml.semantics.values.Value new_() {
        // Create a new instance of this kind of function behavior execution.
        return new ListConcatFunctionBehaviorExecution();
    }   

} // ListSizeFunctionBehaviorExecution
