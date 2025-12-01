package fuml.extensions.actions;

import fuml.extensions.activities.VariableValue;
import fuml.extensions.activities.VariableValueList;
import fuml.semantics.activities.ActivityNodeActivationGroup;
import uml.actions.StructuredActivityNode;
import uml.activities.ActivityNode;

public class StructuredActivityNodeActivation 
		extends fuml.semantics.actions.StructuredActivityNodeActivation {

	public VariableValueList variableValues = new VariableValueList();
	
	public void initialize(ActivityNode node, ActivityNodeActivationGroup group)
	{
		super.initialize(node, group);
		this.createVariableValues();
	} // initialize
	
	public void createVariableValues() {
		
		StructuredActivityNode node = (StructuredActivityNode) (this.node);
		uml.activities.VariableList variables = node.variable;
		
		for(int i = 0; i < variables.size(); i++)
		{
			VariableValue variableValue = new VariableValue();
			variableValue.variable = variables.getValue(i);
			this.variableValues.add(variableValue);
		}
		
	} // createVariableValues
	
	public VariableValueList getVariableValues() {
		
		// Retrieve the VariableValues for all Variables that are accessible 
		// within the scope of this StructuredActivityNodeActivation.
		// That is, all VariableValues directly owned by this StructuredActivityNodeActivation,
		// as well as all VariableValues owned by direct or indirect containing StructuredActivityNodeActivations,
		// as well as all VariableValues owned by the containing ActivityExecution.
		
		VariableValueList allVariableValues = new VariableValueList();
		VariableValueList directlyAccessibleVariableValues = this.variableValues;
		VariableValueList indirectlyAccessibleVariableValues = new VariableValueList();
		
		for(int i = 0; i < directlyAccessibleVariableValues.size(); i++)
		{
			allVariableValues.addValue(directlyAccessibleVariableValues.getValue(i));
		}
		
		fuml.semantics.activities.ActivityNodeActivationGroup group = this.group;
		
		if(group.containingNodeActivation != null)
		{
			// If this StructuredActivityNodeActivation is nested inside another StructuredActivityNodeActivation,
			// (recursively) collect all accessible VariableValues of the containing StructuredActivityNodeActivation.
			fuml.extensions.actions.StructuredActivityNodeActivation containingNodeActivation = (fuml.extensions.actions.StructuredActivityNodeActivation) group.containingNodeActivation;
			indirectlyAccessibleVariableValues = containingNodeActivation.getVariableValues();
		}
		else
		{
			// This StructuredActivityNodeActivation is directly nested inside an ActivityExecution.
			// Collect all accessible VariableValues of that ActivityExecution.
			fuml.extensions.activities.ActivityExecution activityExecution = (fuml.extensions.activities.ActivityExecution) group.activityExecution;
			indirectlyAccessibleVariableValues = activityExecution.getVariableValues();
		}
		
		for(int i = 0; i < indirectlyAccessibleVariableValues.size(); i++)
		{
			allVariableValues.addValue(indirectlyAccessibleVariableValues.getValue(i));
		}
		
		return allVariableValues;
	} // getVariableValues
	
} // StructuredActivityNodeActivation
