/*
 * MultipleDelegation_MultipleConnector_P_PWP_SignalEnvironment.java
 * 
 * Auto-generated file
 */

package MultipleDelegation_MultipleConnector_P_PWP_Signal;

import utils.environmentpscs.Environment;

/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class MultipleDelegation_MultipleConnector_P_PWP_SignalEnvironment extends utils.environmentpscs.Environment
{
	private static MultipleDelegation_MultipleConnector_P_PWP_SignalEnvironment instance;

	public static MultipleDelegation_MultipleConnector_P_PWP_SignalEnvironment instance()
	{
		if(instance == null)
		{
			instance = new MultipleDelegation_MultipleConnector_P_PWP_SignalEnvironment();
			instance.inMemoryModel = MultipleDelegation_MultipleConnector_P_PWP_SignalModel.instance();
		}

		return instance;
	}

	public MultipleDelegation_MultipleConnector_P_PWP_SignalEnvironment()
	{
		/*
		 * Create custom opaque behavior execution instances and add them to the execution environment.
		 */
		addPrimitiveBehaviorPrototype(new testPExecution());
	
		/* Start of user code : Additional environment initializations
	 	 * This section may be used to do any additional environment initialization,
		 * for example initializing user-defined members.
	 	 * It will not be overwritten by future generation processes.
	 	 */
	
		/*
	 	 * End of user code
	 	 */
	}

	@Override
	public void execute(String behaviorName)
	{
		/* Start of user code : Context and inputs initializations
	 	 * This section may be used to initialize the execution context 
		 * as well as input parameter values if required.
	 	 * It will not be overwritten by future generation processes.
	 	 */
	
		//context = ...;
		//inputs = ...;
	
		/*
	 	 * End of user code
	 	 */
	
		/*
		 * Start execution via base class call
		 */
		super.execute(behaviorName);
	
		/* Start of user code : Outputs evaluation
	 	 * This section may be used to evaluate output parameter values if required.
	 	 * It will not be overwritten by future generation processes.
	 	 */
	
		//ParameterValueList theOutputs = outputs;
		//...
	
		/*
	 	 * End of user code
	 	 */
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // MultipleDelegation_MultipleConnector_P_PWP_SignalEnvironment
