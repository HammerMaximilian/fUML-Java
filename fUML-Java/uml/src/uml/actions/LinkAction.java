
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

public abstract class LinkAction extends
		uml.actions.Action {

	public uml.actions.LinkEndDataList endData = new uml.actions.LinkEndDataList();
	public uml.actions.InputPinList inputValue = new uml.actions.InputPinList();

	public void addEndData(
			uml.actions.LinkEndData endData) {
		this.endData.addValue(endData);
	} // addEndData

	public void addInputValue(
			uml.actions.InputPin inputValue) {
		super.addInput(inputValue);
		this.inputValue.addValue(inputValue);
	} // addInputValue

} // LinkAction
