/*
 * testDefaultValuesExecution.java
 * 
 * Auto-generated file
 */
package DefaultValue_Structures;

import fuml.Debug;
import fuml.semantics.commonbehavior.ParameterValueList;

import fuml.semantics.simpleclassifiers.IntegerValue;
import fuml.semantics.commonbehavior.OpaqueBehaviorExecution;

import fuml.semantics.values.Value;

import fuml.semantics.values.ValueList;

/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class testDefaultValuesExecution extends OpaqueBehaviorExecution
{
	public testDefaultValuesExecution()
	{
		types.add(DefaultValue_StructuresModel.instance().DefaultValue_Structures_assert_A_testDefaultValues);
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
				ValueList values = inputParameters.get(0).values;
		int index = 1;

		for(Value value : values)
		{
		System.out.println("Asserting a.b[" + index + "].p == " + index);	
	
		// Test parameter p[i]
		int p =((IntegerValue)value).value;
		Debug.println("[doBody] argument p[" + index + "] = " + p);

		System.out.println("a.b[" + index + "].p == " + p);
		System.out.print("Default value correctly evaluated: ");

		if(p == index)
		{
			System.out.println("\u001B[32m" + "Assertion successful." + "\u001B[0m");
		}
		else
		{
			System.out.println("\u001B[31m" + "Assertion failed!" + "\u001B[0m");
		}

		index++;
		}
	}

	@Override
	public Value new_()
	{
		return new testDefaultValuesExecution();
	}	

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // testDefaultValuesExecution
