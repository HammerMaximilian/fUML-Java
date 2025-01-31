
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

public class RemoveStructuralFeatureValueAction extends
		uml.actions.WriteStructuralFeatureAction {

	public boolean isRemoveDuplicates = false;
	public uml.actions.InputPin removeAt = null;

	public void setIsRemoveDuplicates(boolean isRemoveDuplicates) {
		this.isRemoveDuplicates = isRemoveDuplicates;
	} // setIsRemoveDuplicates

	public void setRemoveAt(uml.actions.InputPin removeAt) {
		if (removeAt != null) {
			super.addInput(removeAt);
		}

		this.removeAt = removeAt;
	} // setRemoveAt

} // RemoveStructuralFeatureValueAction
