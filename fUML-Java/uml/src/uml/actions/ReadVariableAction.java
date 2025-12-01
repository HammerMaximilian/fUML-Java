package uml.actions;

public class ReadVariableAction 
		extends VariableAction {

		public OutputPin result = null;
		
		public void setResult(OutputPin result) {
			super.addOutput(result);
			this.result = result;
		} // setResult
		
} // ReadVariableAction
