
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

public class TestIdentityAction extends uml.actions.Action {

	public uml.actions.InputPin second = null;
	public uml.actions.OutputPin result = null;
	public uml.actions.InputPin first = null;

	public void setFirst(uml.actions.InputPin first) {
		super.addInput(first);
		this.first = first;
	} // setFirst

	public void setSecond(uml.actions.InputPin second) {
		super.addInput(second);
		this.second = second;
	} // setSecond

	public void setResult(uml.actions.OutputPin result) {
		super.addOutput(result);
		this.result = result;
	} // setResult

} // TestIdentityAction
