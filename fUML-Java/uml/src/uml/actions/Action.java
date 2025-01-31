
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

public abstract class Action extends
		uml.activities.ExecutableNode {

	public uml.actions.OutputPinList output = new uml.actions.OutputPinList();
	public uml.classification.Classifier context = null;
	public uml.actions.InputPinList input = new uml.actions.InputPinList();
	public boolean isLocallyReentrant = false;

	protected void addInput(uml.actions.InputPin input) {
		super.addOwnedElement(input);
		this.input.addValue(input);
	} // addInput

	protected void addOutput(uml.actions.OutputPin output) {
		super.addOwnedElement(output);
		this.output.addValue(output);
	} // addOutput

	public void setIsLocallyReentrant(boolean isLocallyReentrant) {
		this.isLocallyReentrant = isLocallyReentrant;
	} // setIsLocallyReentrant

	public void _setContext(uml.classification.Classifier context) {
		this.context = context;
	} // _setContext

	public void _setActivity(
			uml.activities.Activity activity) {
		super._setActivity(activity);
		this._setContext(activity);
	} // _setActivity

} // Action
