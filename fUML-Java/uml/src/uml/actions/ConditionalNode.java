
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

public class ConditionalNode
		extends
		uml.actions.StructuredActivityNode {

	public boolean isDeterminate = false;
	public boolean isAssured = false;
	public uml.actions.ClauseList clause = new uml.actions.ClauseList();
	public uml.actions.OutputPinList result = new uml.actions.OutputPinList();

	public void setIsDeterminate(boolean isDeterminate) {
		this.isDeterminate = isDeterminate;
	} // setIsDeterminate

	public void setIsAssured(boolean isAssured) {
		this.isAssured = isAssured;
	} // setIsAssured

	public void addClause(
			uml.actions.Clause clause) {
		super.addOwnedElement(clause);
		this.clause.addValue(clause);
	} // addClause

	public void addResult(uml.actions.OutputPin result) {
		super.addStructuredNodeOutput(result);
		this.result.addValue(result);
	} // addResult

} // ConditionalNode
