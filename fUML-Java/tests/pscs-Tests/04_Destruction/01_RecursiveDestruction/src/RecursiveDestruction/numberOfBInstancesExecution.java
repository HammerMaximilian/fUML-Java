/*
 * numberOfBInstancesExecution.java
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

public class numberOfBInstancesExecution extends OpaqueBehaviorExecution
{
	public numberOfBInstancesExecution()
	{
		types.add(RecursiveDestructionModel.instance().RecursiveDestruction_main_numberOfBInstances);
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
		System.out.println("# Instances of B: " + inputParameters.get(0).values.size());
	}

	@Override
	public Value new_()
	{
		return new numberOfBInstancesExecution();
	}	

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // numberOfBInstancesExecution
