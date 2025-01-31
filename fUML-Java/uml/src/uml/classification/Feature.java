
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

package uml.classification;

public abstract class Feature extends
		uml.classification.RedefinableElement {

	public boolean isStatic = false;
	public uml.classification.ClassifierList featuringClassifier = new uml.classification.ClassifierList();

	public void _addFeaturingClassifier(
			uml.classification.Classifier featuringClassifier) {
		this.featuringClassifier.add(featuringClassifier);
	} // _addFeaturingClassifier

} // Feature
