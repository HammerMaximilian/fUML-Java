/*
 * testDefaultValuesExecution.java
 * 
 * Auto-generated file
 */
package DefaultValue_BasicTypes;

import UMLPrimitiveTypes.UnlimitedNatural;
import fuml.Debug;
import fuml.semantics.commonbehavior.ParameterValueList;

import fuml.semantics.simpleclassifiers.IntegerValue;
import fuml.semantics.simpleclassifiers.StringValue;
import fuml.semantics.simpleclassifiers.RealValue;
import fuml.semantics.simpleclassifiers.EnumerationValue;
import uml.simpleclassifiers.EnumerationLiteral;
import fuml.semantics.simpleclassifiers.BooleanValue;
import fuml.semantics.commonbehavior.OpaqueBehaviorExecution;

import fuml.semantics.values.Value;

import fuml.semantics.simpleclassifiers.UnlimitedNaturalValue;

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
		types.add(DefaultValue_BasicTypesModel.instance().DefaultValue_BasicTypes_assert_A_testDefaultValues);
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
		System.out.println("Asserting a.pInteger == 4");	
	// Test parameter pInteger
	int pInteger = ((IntegerValue)inputParameters.get(0).values.get(0)).value;
	Debug.println("[doBody] argument pInteger = " + pInteger);
	System.out.println("a.pInteger == " + pInteger);
	if(pInteger == 4)
	{
		System.out.println("\u001B[32m" + "Assertion successful." + "\u001B[0m");
	}
	else
	{
		System.out.println("\u001B[31m" + "Assertion failed!" + "\u001B[0m");
	}

	System.out.println("Asserting a.pString == 'Hello'");
	// Test parameter pString
	String pString = ((StringValue)inputParameters.get(1).values.get(0)).value;
	Debug.println("[doBody] argument " + inputParameters.get(1).parameter.name +  " = " + pString);
	System.out.println("a.pString == " + pString);
	if(pString == "Hello")
	{
		System.out.println("\u001B[32m" + "Assertion successful." + "\u001B[0m");
	}
	else
	{
		System.out.println("\u001B[31m" + "Assertion failed!" + "\u001B[0m");
	}

	System.out.println("Asserting a.pBoolean == true");
	// Test parameter pBoolean
	boolean pBoolean = ((BooleanValue)inputParameters.get(2).values.get(0)).value;
	Debug.println("[doBody] argument " + inputParameters.get(2).parameter.name +  " = " + pBoolean);
	System.out.println("a.pBoolean == " + pBoolean);
	if(pBoolean)
	{
		System.out.println("\u001B[32m" + "Assertion successful." + "\u001B[0m");
	}
	else
	{
		System.out.println("\u001B[31m" + "Assertion failed!" + "\u001B[0m");
	}

	System.out.println("Asserting a.pUnlimitedNatural == *");
	// Test parameter pUnlimitedNatural
	UnlimitedNatural pUnlimitedNatural = ((UnlimitedNaturalValue)inputParameters.get(3).values.get(0)).value;
	Debug.println("[doBody] argument " + inputParameters.get(3).parameter.name +  " = " + pUnlimitedNatural.toString());
	System.out.println("a.pUnlimitedNatural == " + pUnlimitedNatural.toString());
	if(pUnlimitedNatural.naturalValue == -1)
	{
		System.out.println("\u001B[32m" + "Assertion successful." + "\u001B[0m");
	}
	else
	{
		System.out.println("\u001B[31m" + "Assertion failed!" + "\u001B[0m");
	}

	System.out.println("Asserting a.pReal == 4.0");
	// Test parameter pReal
	float pReal = ((RealValue)inputParameters.get(4).values.get(0)).value;
	Debug.println("[doBody] argument " + inputParameters.get(4).parameter.name +  " = " + pReal);
	System.out.println("a.pReal == " + String.valueOf(pReal));
	if(pReal == 4.0)
	{
		System.out.println("\u001B[32m" + "Assertion successful." + "\u001B[0m");
	}
	else
	{
		System.out.println("\u001B[31m" + "Assertion failed!" + "\u001B[0m");
	}

	System.out.println("Asserting a.pEnum == E::e2");
	// Test parameter pEnum
	EnumerationLiteral pEnum = ((EnumerationValue)inputParameters.get(5).values.get(0)).literal;
	Debug.println("[doBody] argument " + inputParameters.get(5).parameter.name +  " = " + pEnum.qualifiedName);
	System.out.println("a.pEnum == " + pEnum.qualifiedName);
	if(pEnum == DefaultValue_BasicTypesModel.instance().DefaultValue_BasicTypes_E_e2)
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
