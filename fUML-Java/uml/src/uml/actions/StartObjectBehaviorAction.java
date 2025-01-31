
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

public class StartObjectBehaviorAction extends
		uml.actions.CallAction {

	public uml.actions.InputPin object = null;

	public void setObject(uml.actions.InputPin object) {
		super.addInput(object);
		this.object = object;

	} // setObject

} // StartObjectBehaviorAction
