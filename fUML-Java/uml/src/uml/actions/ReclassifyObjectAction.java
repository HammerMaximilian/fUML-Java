
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

public class ReclassifyObjectAction extends
		uml.actions.Action {

	public boolean isReplaceAll = false;
	public uml.classification.ClassifierList oldClassifier = new uml.classification.ClassifierList();
	public uml.actions.InputPin object = null;
	public uml.classification.ClassifierList newClassifier = new uml.classification.ClassifierList();

	public void setIsReplaceAll(boolean isReplaceAll) {
		this.isReplaceAll = isReplaceAll;
	} // setIsReplaceAll

	public void addOldClassifier(
			uml.classification.Classifier oldClassifier) {
		this.oldClassifier.addValue(oldClassifier);
	} // addOldClassifier

	public void addNewClassifier(
			uml.classification.Classifier newClassifier) {
		this.newClassifier.addValue(newClassifier);
	} // addNewClassifier

	public void setObject(uml.actions.InputPin object) {
		super.addInput(object);
		this.object = object;

	} // setObject

} // ReclassifyObjectAction
