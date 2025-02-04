/*
 * testNonEmptyListExecution.java
 * 
 * Auto-generated file
 */
package Hierarchy;

import fuml.Debug;
import fuml.semantics.commonbehavior.ParameterValueList;

import fuml.semantics.simpleclassifiers.IntegerValue;
import fuml.semantics.commonbehavior.OpaqueBehaviorExecution;

import fuml.semantics.values.Value;


/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class testNonEmptyListExecution extends OpaqueBehaviorExecution
{
	public testNonEmptyListExecution()
	{
		types.add(HierarchyModel.instance().Hierarchy_assert_A_testNonEmptyList);
		/* Start of user code : Additional opaque behavior execution initializations
	 	 * This section may be used to do any additional opaque behavior execution initialization,
		 * for example initializing user-defined members.
	 	 * It will not be overwritten by future generation processes.
	 	 */
	
		/*
	 	 * End of user code
	 	 */
	}

	@Override
	public void doBody(ParameterValueList inputParameters, ParameterValueList outputParameters)
	{
		String parameterName = inputParameters.get(0).parameter.name;
	// Test parameter listSize
	int listSize = ((IntegerValue)inputParameters.get(0).values.get(0)).value;
	Debug.println("[doBody] argument " + parameterName +  " = " + listSize);

	System.out.println("Part is not empty: ");

	if(listSize > 0)
	{
		System.out.println("\u001B[32m" + "Assertion successful." + "\u001B[0m");
	}
	else
	{
		System.out.println("\u001B[31m" + "Assertion failed!" + "\u001B[0m");
	}
	}

	@Override
	public Value new_()
	{
		return new testNonEmptyListExecution();
	}	

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // testNonEmptyListExecution
