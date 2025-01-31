
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

public class ExpansionRegion
		extends
		uml.actions.StructuredActivityNode {

	public uml.actions.ExpansionKind mode = uml.actions.ExpansionKind.iterative;
	public uml.actions.ExpansionNodeList outputElement = new uml.actions.ExpansionNodeList();
	public uml.actions.ExpansionNodeList inputElement = new uml.actions.ExpansionNodeList();

	public void setMode(
			uml.actions.ExpansionKind mode) {
		this.mode = mode;
	} // setMode

	public void addInputElement(
			uml.actions.ExpansionNode inputElement) {
		this.inputElement.addValue(inputElement);
		inputElement._setRegionAsInput(this);
	} // addInputElement

	public void addOutputElement(
			uml.actions.ExpansionNode outputElement) {
		this.outputElement.addValue(outputElement);
		outputElement._setRegionAsOutput(this);
	} // addOutputElement

} // ExpansionRegion
