
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

public abstract class CallAction extends
		uml.actions.InvocationAction {

	public boolean isSynchronous = true;
	public uml.actions.OutputPinList result = new uml.actions.OutputPinList();

	public void addResult(uml.actions.OutputPin result) {
		super.addOutput(result);
		this.result.addValue(result);
	} // addResult

} // CallAction
