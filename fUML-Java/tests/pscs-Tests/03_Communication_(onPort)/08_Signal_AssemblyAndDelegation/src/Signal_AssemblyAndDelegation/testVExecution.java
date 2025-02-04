/*
 * testVExecution.java
 * 
 * Auto-generated file
 */
package Signal_AssemblyAndDelegation;

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

public class testVExecution extends OpaqueBehaviorExecution
{
	public testVExecution()
	{
		types.add(Signal_AssemblyAndDelegationModel.instance().Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV);
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
		System.out.println("Asserting b.a.v == 4");

	// Test parameter v
	int v = ((IntegerValue)inputParameters.get(0).values.get(0)).value;
	Debug.println("[doBody] argument v = " + v);
	
	System.out.println("b.a.v == " + v);
	System.out.print("Signal correctly sent and received: ");

	if(v == 4)
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
		return new testVExecution();
	}	

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // testVExecution
