
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

public class Clause extends uml.commonstructure.Element {

	public uml.activities.ExecutableNodeList test = new uml.activities.ExecutableNodeList();
	public uml.activities.ExecutableNodeList body = new uml.activities.ExecutableNodeList();
	public uml.actions.ClauseList predecessorClause = new uml.actions.ClauseList();
	public uml.actions.ClauseList successorClause = new uml.actions.ClauseList();
	public uml.actions.OutputPin decider = null;
	public uml.actions.OutputPinList bodyOutput = new uml.actions.OutputPinList();

	public void addPredecessorClause(
			uml.actions.Clause predecessorClause) {
		this.predecessorClause.addValue(predecessorClause);
		predecessorClause.successorClause.addValue(this);
	} // addPredecessorClause

	public void addTest(
			uml.activities.ExecutableNode test) {
		this.test.addValue(test);
	} // addTest

	public void addBody(
			uml.activities.ExecutableNode body) {
		this.body.addValue(body);
	} // addBody

	public void setDecider(uml.actions.OutputPin decider) {
		this.decider = decider;
	} // setDecider

	public void addBodyOutput(
			uml.actions.OutputPin bodyOutput) {
		this.bodyOutput.addValue(bodyOutput);
	} // addBodyOutput

} // Clause
