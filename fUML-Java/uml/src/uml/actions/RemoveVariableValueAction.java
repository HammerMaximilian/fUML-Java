package uml.actions;

public class RemoveVariableValueAction 
		extends WriteVariableAction {

	public boolean isRemoveDuplicates = false;
	public InputPin removeAt = null;

	public void setIsRemoveDuplicates(boolean isRemoveDuplicates) {
		this.isRemoveDuplicates = isRemoveDuplicates;
	} // setIsRemoveDuplicates

	public void setRemoveAt(InputPin removeAt) {
		if (removeAt != null) {
			super.addInput(removeAt);
		}

		this.removeAt = removeAt;
	} // setRemoveAt
	
} // RemoveVariableValueAction
