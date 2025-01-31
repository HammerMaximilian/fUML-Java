
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

public class InstanceSpecification extends
		uml.commonstructure.NamedElement {

	public uml.classification.ClassifierList classifier = new uml.classification.ClassifierList();
	public uml.classification.SlotList slot = new uml.classification.SlotList();

	public void addClassifier(uml.classification.Classifier classifier) {
		this.classifier.addValue(classifier);
	} // addClassifier

	public void addSlot(uml.classification.Slot slot) {
		this.addOwnedElement(slot);
		this.slot.addValue(slot);
		slot._setOwningInstance(this);
	} // addSlot

} // InstanceSpecification
