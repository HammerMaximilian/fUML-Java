package uml.actions;

public abstract class WriteVariableAction 
		extends VariableAction {

	public InputPin value = null;
	
	public void setValue(InputPin value) {
		super.addInput(value);
		this.value = value;
	} // setValue
	
} // WriteVariableAction
