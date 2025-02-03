/*
 * assertionNotImplementedExecution.java
 * 
 * Auto-generated file
 */
package RemovingInstanceFromPart;

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

public class assertionNotImplementedExecution extends OpaqueBehaviorExecution
{
	public assertionNotImplementedExecution()
	{
		types.add(RemovingInstanceFromPartModel.instance().RemovingInstanceFromPart_assertA_assertionNotImplemented);
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
		System.out.println("Assertion currenlty not implemented! Model was validated by manual debugging.");
	}

	@Override
	public Value new_()
	{
		return new assertionNotImplementedExecution();
	}	

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // assertionNotImplementedExecution
