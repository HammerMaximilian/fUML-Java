
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

public class CreateObjectAction extends uml.actions.Action {

	public uml.actions.OutputPin result = null;
	public uml.classification.Classifier classifier = null;

	public void setClassifier(uml.classification.Classifier classifier) {
		this.classifier = classifier;
	} // setClassifier

	public void setResult(uml.actions.OutputPin result) {
		super.addOutput(result);
		this.result = result;
	} // setResult

} // CreateObjectAction
