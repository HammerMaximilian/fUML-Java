
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

public abstract class InvocationAction extends
		uml.actions.Action {

	public uml.actions.InputPinList argument = new uml.actions.InputPinList();
	public uml.structuredclassifiers.Port onPort = null; // PSCS-specific

	public void addArgument(uml.actions.InputPin argument) {
		super.addInput(argument);
		this.argument.addValue(argument);
	} // addArgument
	
	public void setOnPort(uml.structuredclassifiers.Port onPort) // PSCS-specific
	{ 
	    this.onPort = onPort; 
	}
} // InvocationAction
