package fuml.extensions.activities;

import uml.activities.Activity;

public class ActivityExecution 
	extends fuml.semantics.activities.ActivityExecution {

	public VariableValueList variableValues = new VariableValueList();
	
	public void execute()
	{
		this.createVariableValues();
		super.execute();
	} // execute
	
	public void createVariableValues() {
		
		Activity activity = (Activity) (this.getTypes().getValue(0));
		uml.activities.VariableList variables = activity.variable;
		
		for(int i = 0; i < variables.size(); i++)
		{
			VariableValue variableValue = new VariableValue();
			variableValue.variable = variables.getValue(i);
			this.variableValues.add(variableValue);
		}
		
	} // createVariableValues
	
	public VariableValueList getVariableValues() {
		
		// Retrieve the VariableValues for all Variables that are accessible 
		// within the scope of this ActivityExecution.
		// That is, all VariableValues directly owned by this ActivityExecution.
		
		VariableValueList allVariableValues = new VariableValueList();
		VariableValueList directlyAccessibleVariableValues = this.variableValues;
		
		for(int i = 0; i < directlyAccessibleVariableValues.size(); i++)
		{
			allVariableValues.addValue(directlyAccessibleVariableValues.getValue(i));
		}
		
		return allVariableValues;
	} // getVariableValues
	
} // ActivityExecution
