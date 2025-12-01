package uml.actions;

public abstract class VariableAction extends 
		Action {

	public uml.activities.Variable variable = null;
	
	public void setVariable(uml.activities.Variable variable)
	{
		this.variable = variable;
	} // setVariable
	
} // VariableAction
