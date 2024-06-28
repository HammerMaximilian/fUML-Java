
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

public class ExpansionNode extends
		uml.activities.ObjectNode {

	public uml.actions.ExpansionRegion regionAsOutput = null;
	public uml.actions.ExpansionRegion regionAsInput = null;

	public void _setRegionAsInput(
			uml.actions.ExpansionRegion regionAsInput) {
		this.regionAsInput = regionAsInput;
	} // _setRegionAsInput

	public void _setRegionAsOutput(
			uml.actions.ExpansionRegion regionAsOutput) {
		this.regionAsOutput = regionAsOutput;
	} // _setRegionAsOutput

} // ExpansionNode
