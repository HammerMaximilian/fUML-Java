
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

public abstract class WriteStructuralFeatureAction extends
		uml.actions.StructuralFeatureAction {

	public uml.actions.InputPin value = null;
	public uml.actions.OutputPin result = null;

	public void setResult(uml.actions.OutputPin result) {
		super.addOutput(result);
		this.result = result;
	} // setResult

	public void setValue(uml.actions.InputPin value) {
		super.addInput(value);
		this.value = value;
	} // setValue

} // WriteStructuralFeatureAction
