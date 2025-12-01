package fuml.extensions.actions;

import fuml.extensions.activities.VariableValue;
import fuml.extensions.activities.VariableValueList;
import fuml.semantics.activities.ActivityNodeActivationGroup;
import uml.activities.Variable;

public abstract class VariableActionActivation extends 
		fuml.semantics.actions.ActionActivation {
	
	public VariableValueList getAccessibleVariableValues()
	{
		// Get either the ActivityExecution or the StructuredActivityNodeActivation
		// owning the ActivityNodeActivationGroup which contains this Activation.
		// Get all VariableValues accessible within the context of this Activation's action's owner.
		
		VariableValueList accessibleVariableValues = null;
		
		ActivityNodeActivationGroup group = this.group;
		
		if(group.containingNodeActivation != null)
		{
			fuml.extensions.actions.StructuredActivityNodeActivation containingNodeActivation = (fuml.extensions.actions.StructuredActivityNodeActivation) group.containingNodeActivation;
			accessibleVariableValues = containingNodeActivation.getVariableValues();
		}
		else
		{
			fuml.extensions.activities.ActivityExecution activityExecution = (fuml.extensions.activities.ActivityExecution) group.activityExecution;
			accessibleVariableValues = activityExecution.getVariableValues();
		}
		
		return accessibleVariableValues;
	} // getAccessibleVariableValues
	
	public VariableValue getVariableValue(Variable variable)
	{
		// Find the appropriate VariableValue matching the give Variable
		// from all VariableValues accessible within the context of this Activation's action's owner.
		
		VariableValueList accessibleVariableValues = this.getAccessibleVariableValues();
		
		VariableValue variableValue = null;
		int i = 0;
		while (variableValue == null && i < accessibleVariableValues.size()) {
			if(accessibleVariableValues.getValue(i).variable == variable)
			{
				variableValue = accessibleVariableValues.getValue(i);
			}
		}
		
		return variableValue;
	} // getVariableValue
	
} // VariableActionActivation
