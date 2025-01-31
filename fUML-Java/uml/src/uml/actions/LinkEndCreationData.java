
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

public class LinkEndCreationData extends
		uml.actions.LinkEndData {

	public boolean isReplaceAll = false;
	public uml.actions.InputPin insertAt = null;

	public void setIsReplaceAll(boolean isReplaceAll) {
		this.isReplaceAll = isReplaceAll;
	} // setIsReplaceAll

	public void setInsertAt(uml.actions.InputPin insertAt) {
		this.insertAt = insertAt;
	} // setInsertAt

} // LinkEndCreationData
