
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

import uml.commonstructure.NamedElement;
import uml.commonstructure.NamedElementList;
import uml.commonstructure.VisibilityKind;

public abstract class Classifier extends uml.commonstructure.Type {

	public boolean isAbstract = false;
	public uml.classification.GeneralizationList generalization = new uml.classification.GeneralizationList();
	public uml.classification.FeatureList feature = new uml.classification.FeatureList();
	public uml.commonstructure.NamedElementList inheritedMember = new uml.commonstructure.NamedElementList();
	public uml.classification.PropertyList attribute = new uml.classification.PropertyList();
	public uml.classification.ClassifierList general = new uml.classification.ClassifierList();
	public boolean isFinalSpecialization = false;

	protected void addFeature(uml.classification.Feature feature) {
		// Note: This operation should not be used directly to add Properties.
		// The addAttribute operation should be used instead.

		this.feature.addValue(feature);
		feature._addFeaturingClassifier(this);
	} // addFeature

	protected void addAttribute(uml.classification.Property attribute) {
		this.addFeature(attribute);
		this.attribute.addValue(attribute);
	} // addAttribute

	public void addGeneralization(
			uml.classification.Generalization generalization) {
		this.addOwnedElement(generalization);
		this.generalization.addValue(generalization);
		generalization._setSpecific(this);
		this.general.addValue(generalization.general);

		NamedElementList inheritedMembers = this.inherit(generalization.general
				.inheritableMembers(this));

		for (int i = 0; i < inheritedMembers.size(); i++) {
			NamedElement inheritedMember = inheritedMembers.getValue(i);
			this.addMember(inheritedMember);
			this.inheritedMember.addValue(inheritedMember);
		}
	} // addGeneralization

	public void setIsAbstract(boolean isAbstract) {
		this.isAbstract = isAbstract;
	} // setIsAbstract

	public uml.commonstructure.NamedElementList inherit(
			uml.commonstructure.NamedElementList inhs) {
		NamedElementList inheritedElements = new NamedElementList();

		for (int i = 0; i < inhs.size(); i++) {
			inheritedElements.addValue(inhs.getValue(i));
		}

		return inheritedElements;

	} // inherit

	public uml.commonstructure.NamedElementList inheritableMembers(
			uml.classification.Classifier c) {
		NamedElementList inheritable = new NamedElementList();

		for (int i = 0; i < this.member.size(); i++) {
			NamedElement m = this.member.getValue(i);
			if (c.hasVisibilityOf(m)) {
				inheritable.addValue(m);
			}
		}

		return inheritable;
	} // inheritableMembers

	public boolean hasVisibilityOf(uml.commonstructure.NamedElement n) {
		for (int i = 0; i < this.inheritedMember.size(); i++) {
			if (this.inheritedMember.getValue(i) == n) {
				return n.visibility != VisibilityKind.private_;
			}
		}

		return true;
	} // hasVisibilityOf

	public void setIsFinalSpecialization(boolean isFinalSpecialization) {
		this.isFinalSpecialization = isFinalSpecialization;
	} // setIsFinalSpecialization

} // Classifier
