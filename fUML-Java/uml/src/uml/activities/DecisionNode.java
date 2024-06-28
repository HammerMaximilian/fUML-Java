
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

package uml.activities;

public class DecisionNode extends
		uml.activities.ControlNode {

	public uml.commonbehavior.Behavior decisionInput = null;
	public uml.activities.ObjectFlow decisionInputFlow = null;

	public void setDecisionInput(
			uml.commonbehavior.Behavior decisionInput) {
		this.decisionInput = decisionInput;
	} // setDecisionInput

	public void setDecisionInputFlow(
			uml.activities.ObjectFlow decisionInputFlow) {
		this.decisionInputFlow = decisionInputFlow;
	} // setDecisionInputFlow

} // DecisionNode
