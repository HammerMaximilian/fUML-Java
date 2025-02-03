/*
 * testPExecution.java
 * 
 * Auto-generated file
 */
package MultipleDelegation_MultipleConnector_P_PWP_Operation;

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
		types.add(MultipleDelegation_MultipleConnector_P_PWP_OperationModel.instance().MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP);
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
		if(index == 1)
	{
		System.out.println("Asserting c.a1.b.p == 4 || c.a2.b.p == 4 || c.a3.b.p == 4 || c.a4.b.c == 4");
	}

	// For some reason, during the first execution of the expansion region, its body is actually executed twice.
	// Because of that, the body is actually executaed 5 times in total. This if-statement covers that up until solved.
	if (index <= MAX_INDEX)
	{
		// Test parameter p
                int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value;
		Debug.println("[doBody] argument p = " + p);
	
		System.out.println( "c.a" + index + ".b.p == " + p);
		success = success || (p == 4);

		if (index == MAX_INDEX)
		{

			System.out.print("Operation call delegated: ");

			if (success)
			{
				System.out.println("\u001B[32m" + "Assertion successful." + "\u001B[0m");
			}
			else
			{
				System.out.println("\u001B[31m" + "Assertion failed!" + "\u001B[0m");
			}
		}
	}

	index++;
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
	private static int index = 1;
    private static final int MAX_INDEX = 4;
    private static boolean success = false;
	/*
	 * End of user code
	 */
} // testPExecution
