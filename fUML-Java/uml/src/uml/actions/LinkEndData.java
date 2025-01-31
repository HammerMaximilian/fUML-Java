
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

public class LinkEndData extends uml.commonstructure.Element {

	public uml.actions.InputPin value = null;
	public uml.classification.Property end = null;

	public void setEnd(uml.classification.Property end) {
		this.end = end;
	} // setEnd

	public void setValue(uml.actions.InputPin value) {
		this.value = value;
	} // setValue

} // LinkEndData
