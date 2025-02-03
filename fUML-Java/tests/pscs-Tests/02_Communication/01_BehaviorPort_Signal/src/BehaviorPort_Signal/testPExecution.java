/*
 * testPExecution.java
 * 
 * Auto-generated file
 */
package BehaviorPort_Signal;

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

public class testPExecution extends OpaqueBehaviorExecution
{
	public testPExecution()
	{
		types.add(BehaviorPort_SignalModel.instance().BehaviorPort_Signal_Tester_testActivity_testP);
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
		System.out.println("Asserting a.p == 4");

	// Test parameter p
	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value;
	Debug.println("[doBody] argument p = " + p);
	
	System.out.println("a.p == " + p);
	System.out.print("Signal delegated to classifier behavior: ");

	if(p == 4)
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
		return new testPExecution();
	}	

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // testPExecution
