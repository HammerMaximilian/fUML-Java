package uml.actions;

public class AddVariableValueAction 
		extends WriteVariableAction {
	
	public boolean isReplaceAll = false;
	public InputPin insertAt = null;
	
	public void setIsReplaceAll(boolean isReplaceAll) {
		this.isReplaceAll = isReplaceAll;
	} // setIsReplaceAll

	public void setInsertAt(uml.actions.InputPin insertAt) {
		if (insertAt != null) {
			super.addInput(insertAt);
		}

		this.insertAt = insertAt;
	} // setInsertAt

} // AddVariableValueAction
