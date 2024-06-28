
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

package uml.structuredclassifiers;

import uml.classification.RedefinableElement;
import uml.classification.RedefinableElementList;
import uml.commonstructure.NamedElement;
import uml.commonstructure.NamedElementList;

public class Class_ extends
		uml.commonbehavior.BehavioredClassifier {

	public uml.classification.OperationList ownedOperation = new uml.classification.OperationList();
	public boolean isActive = false;
	public uml.simpleclassifiers.ReceptionList ownedReception = new uml.simpleclassifiers.ReceptionList();
	public uml.classification.PropertyList ownedAttribute = new uml.classification.PropertyList();
	public uml.classification.ClassifierList nestedClassifier = new uml.classification.ClassifierList();
	public boolean isID = false;
	public uml.structuredclassifiers.Class_List superClass = new uml.structuredclassifiers.Class_List();

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	} // setIsActive

	public void addGeneralization(
			uml.classification.Generalization generalization) {
		super.addGeneralization(generalization);

		if (generalization.general instanceof Class_) {
			this.superClass.addValue((Class_) generalization.general);
		}
	} // addGeneralization

	public void addOwnedAttribute(
			uml.classification.Property ownedAttribute) {
		super.addAttribute(ownedAttribute);
		super.addOwnedMember(ownedAttribute);

		this.ownedAttribute.addValue(ownedAttribute);
		ownedAttribute._setClass(this);
	} // addOwnedAttribute

	public void addOwnedOperation(
			uml.classification.Operation ownedOperation) {
		super.addFeature(ownedOperation);
		super.addOwnedMember(ownedOperation);

		this.ownedOperation.addValue(ownedOperation);
		ownedOperation._setClass(this);
	} // addOwnedOperation

	public void addOwnedReception(
			uml.simpleclassifiers.Reception ownedReception) {
		super.addOwnedMember(ownedReception);
		super.addFeature(ownedReception);

		this.ownedReception.addValue(ownedReception);
	} // addOwnedReception

	public uml.commonstructure.NamedElementList inherit(
			uml.commonstructure.NamedElementList inhs) {
		// "The inherit operation is overridden to exclude redefined properties."

		RedefinableElementList redefinableMembers = new RedefinableElementList();

		for (int i = 0; i < this.ownedMember.size(); i++) {
			if (this.ownedMember.getValue(i) instanceof RedefinableElement) {
				redefinableMembers
						.addValue((RedefinableElement) this.ownedMember
								.getValue(i));
			}
		}

		NamedElementList inherited = new NamedElementList();

		for (int i = 0; i < inhs.size(); i++) {
			NamedElement inh = inhs.getValue(i);
			boolean exclude = false;
			for (int j = 0; j < redefinableMembers.size(); j++) {
				RedefinableElementList redefinedElements = redefinableMembers
						.getValue(j).redefinedElement;
				for (int k = 0; k < redefinedElements.size(); k++) {
					if (redefinedElements.getValue(k) == inh) {
						exclude = true;
						break;
					}
				}
				if (exclude)
					break;
			}

			if (!exclude) {
				inherited.addValue(inh);
			}
		}

		return inherited;
	} // inherit

	public void addNestedClassifier(
			uml.classification.Classifier nestedClassifier) {
		this.addOwnedMember(nestedClassifier);
		this.nestedClassifier.addValue(nestedClassifier);
	} // addNestedClassifier

} // Class
