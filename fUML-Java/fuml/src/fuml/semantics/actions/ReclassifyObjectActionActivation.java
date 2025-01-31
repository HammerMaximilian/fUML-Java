
/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * Modifications:
 * Copyright 2009-2015 Data Access Technologies, Inc.
 * Copyright 2020 Model Driven Solutions, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package fuml.semantics.actions;

import fuml.semantics.simpleclassifiers.FeatureValueList;
import fuml.semantics.structuredclassifiers.Link;
import fuml.semantics.structuredclassifiers.LinkList;
import fuml.semantics.structuredclassifiers.Object_;
import fuml.semantics.structuredclassifiers.Reference;
import fuml.semantics.values.Value;
import uml.actions.ReclassifyObjectAction;
import uml.classification.Classifier;
import uml.classification.ClassifierList;
import uml.classification.StructuralFeature;
import uml.classification.StructuralFeatureList;
import uml.structuredclassifiers.Association;
import uml.structuredclassifiers.Class_;

public class ReclassifyObjectActionActivation extends
		fuml.semantics.actions.ActionActivation {

	public void doAction() {
		// Get the value of the object input pin. If it is not a reference, then
		// do nothing. Otherwise, do the following.
		// Remove all types from the referent object that are in the set of old
		// classifiers but not the set of new classifiers (or just all types
		// that are not new classifiers, if isReplaceAll is true).
		// Remove the feature values from the referent object for all
		// classifiers that are removed.
		// Add all new classifiers as types of the referent object that are not
		// already types.
		// Add feature values to the referent object for the structural
		// features of all added classifiers.
		// Any features that previously had values maintain those values,
		// while new features are initialized as being empty.

		ReclassifyObjectAction action = (ReclassifyObjectAction) (this.node);
		ClassifierList newClassifiers = action.newClassifier;
		ClassifierList oldClassifiers = action.oldClassifier;

		Value input = this.takeTokens(action.object).getValue(0);
		
		if (input instanceof Reference) {
			Object_ object = ((Reference) input).referent;
			StructuralFeatureList oldFeatures = object.getStructuralFeatures();

			int i = 1;
			while (i <= object.types.size()) {
				Class_ type = object.types.getValue(i - 1);

				boolean toBeRemoved = true;
				int j = 1;
				while (toBeRemoved & j <= newClassifiers.size()) {
					toBeRemoved = (type != newClassifiers.getValue(j - 1));
					j = j + 1;
				}

				if (toBeRemoved & !action.isReplaceAll) {
					boolean notInOld = true;
					int k = 1;
					while (notInOld & k <= oldClassifiers.size()) {
						notInOld = (type != oldClassifiers.getValue(k - 1));
						k = k + 1;
					}
					toBeRemoved = !notInOld;
				}

				if (toBeRemoved) {
					object.types.removeValue(i - 1);
				} else {
					i = i + 1;
				}
			}

			for (int n = 0; n < newClassifiers.size(); n++) {
				Classifier classifier = newClassifiers.getValue(n);

				boolean toBeAdded = true;
				int j = 1;
				while (toBeAdded & j <= object.types.size()) {
					toBeAdded = (classifier != object.types.getValue(j - 1));
					j = j + 1;
				}

				if (toBeAdded) {
					object.types.addValue((Class_) classifier);
				}
			}
			
			FeatureValueList oldFeatureValues = object.getFeatureValues();
			object.featureValues = new FeatureValueList();
			object.addFeatureValues(oldFeatureValues);
			
			// Destroy links involving association ends that were previously features
			// but no longer have feature values after the reclassification.
			StructuralFeatureList newFeatures = object.getStructuralFeatures();
			for (int j = 0; j < oldFeatures.size(); j++) {
				StructuralFeature feature = oldFeatures.getValue(j);
				Association association = this.getAssociation(feature);
				if (association != null) {
					if (this.checkForMissingFeature(newFeatures, feature)) {
						LinkList links = this.getMatchingLinks(association, feature, input);
						for (int k = 0; k < links.size(); k++) {
							Link link = links.getValue(k);
							link.destroy();
						}
					}
				}
			}
		}
		
	} // doAction
	
	public boolean checkForMissingFeature(StructuralFeatureList features, StructuralFeature feature) {
		boolean isMissing = true;
		
		int i = 1;
		while (isMissing & i <= features.size()) {
			StructuralFeature containedFeature = features.getValue(i-1);
			isMissing = containedFeature != feature;
			i = i + 1;
		}
		
		return isMissing;
	}
} // ReclassifyObjectActionActivation
