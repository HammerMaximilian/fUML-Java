
/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * All modifications copyright 2009-2012 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package uml.actions;

public class LoopNode
		extends
		uml.actions.StructuredActivityNode {

	public boolean isTestedFirst = false;
	public uml.actions.OutputPin decider = null;
	public uml.activities.ExecutableNodeList test = new uml.activities.ExecutableNodeList();
	public uml.actions.OutputPinList bodyOutput = new uml.actions.OutputPinList();
	public uml.actions.InputPinList loopVariableInput = new uml.actions.InputPinList();
	public uml.activities.ExecutableNodeList bodyPart = new uml.activities.ExecutableNodeList();
	public uml.actions.OutputPinList result = new uml.actions.OutputPinList();
	public uml.actions.OutputPinList loopVariable = new uml.actions.OutputPinList();
	public uml.activities.ExecutableNodeList setupPart = new uml.activities.ExecutableNodeList();

	public void setIsTestedFirst(boolean isTestedFirst) {
		this.isTestedFirst = isTestedFirst;
	} // setIsTestedFirst

	public void addTest(
			uml.activities.ExecutableNode test) {
		this.test.addValue(test);
	} // addTest

	public void addBodyPart(
			uml.activities.ExecutableNode bodyPart) {
		this.bodyPart.addValue(bodyPart);
	} // addBodyPart

	public void addLoopVariableInput(
			uml.actions.InputPin loopVariableInput) {
		super.addStructuredNodeInput(loopVariableInput);
		this.loopVariableInput.addValue(loopVariableInput);
	} // addLoopVariableInput

	public void addLoopVariable(
			uml.actions.OutputPin loopVariable) {
		this.loopVariable.addValue(loopVariable);
	} // addLoopVariable

	public void setDecider(uml.actions.OutputPin decider) {
		this.decider = decider;
	} // setDecider

	public void addBodyOutput(
			uml.actions.OutputPin bodyOutput) {
		this.bodyOutput.addValue(bodyOutput);
	} // addBodyOutput

	public void addResult(uml.actions.OutputPin result) {
		super.addOutput(result);
		this.result.addValue(result);
	} // addResult

} // LoopNode
