/*
 * assertExtentOfBExecution.java
 * 
 * Auto-generated file
 */
package RecursiveDestruction;

import fuml.semantics.commonbehavior.ParameterValueList;

import fuml.semantics.commonbehavior.OpaqueBehaviorExecution;

import fuml.semantics.values.Value;


/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class assertExtentOfBExecution extends OpaqueBehaviorExecution
{
	public assertExtentOfBExecution()
	{
		types.add(RecursiveDestructionModel.instance().RecursiveDestruction_main_assertExtentOfB);
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
		System.out.println("Asserting B.allInstances()->size() == 0");	

	int extentSize = inputParameters.get(0).values.size();
	
	System.out.println("B.allInstances()->size() == " + extentSize);
	System.out.print("All instances of B recursively destroyed: ");

	if(extentSize == 0)
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
		return new assertExtentOfBExecution();
	}	

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // assertExtentOfBExecution
