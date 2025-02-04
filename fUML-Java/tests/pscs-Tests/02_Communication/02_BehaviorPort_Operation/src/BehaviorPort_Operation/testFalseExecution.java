/*
 * testFalseExecution.java
 * 
 * Auto-generated file
 */
package BehaviorPort_Operation;

import fuml.Debug;
import fuml.semantics.commonbehavior.ParameterValueList;

import fuml.semantics.simpleclassifiers.BooleanValue;
import fuml.semantics.commonbehavior.OpaqueBehaviorExecution;

import fuml.semantics.values.Value;


/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class testFalseExecution extends OpaqueBehaviorExecution
{
	public testFalseExecution()
	{
		types.add(BehaviorPort_OperationModel.instance().BehaviorPort_Operation_assertP_testFalse);
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
		// Test parameter input
	boolean input = ((BooleanValue)inputParameters.get(0).values.get(0)).value;
	Debug.println("[doBody] argument input = " + input);

	if(input == false)
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
		return new testFalseExecution();
	}	

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // testFalseExecution
