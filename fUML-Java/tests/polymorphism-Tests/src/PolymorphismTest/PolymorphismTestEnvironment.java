/*
 * PolymorphismTestEnvironment.java
 * 
 * Auto-generated file
 */

package PolymorphismTest;

import utils.environmentfuml.Environment;

/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class PolymorphismTestEnvironment extends utils.environmentfuml.Environment
{
	private static PolymorphismTestEnvironment instance;

	public static PolymorphismTestEnvironment instance()
	{
		if(instance == null)
		{
			instance = new PolymorphismTestEnvironment();
			instance.inMemoryModel = PolymorphismTestModel.instance();
		}

		return instance;
	}

	public PolymorphismTestEnvironment()
	{
		/*
		 * Create custom opaque behavior execution instances and add them to the execution environment.
		 */
	
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
	@Override
	protected void initializeLociContents()
	{
		super.initializeLociContents();
		
        /*
		 * Uncomment the following line to use custom dispatch strategy 'UMLConformingDispatchStrategy' instead of default
		 */
        //locus.factory.setStrategy(new fuml.extensions.structuredclassifiers.UMLConformingDispatchStrategy());

        /*
         * Uncomment the following line to use custom dispatch strategy 'SignatureBasedDispatchStrategy' instead of default
         */
        locus.factory.setStrategy(new fuml.extensions.structuredclassifiers.SignatureBasedDispatchStrategy());
	}
	/*
	 * End of user code
	 */
} // PolymorphismTestEnvironment
