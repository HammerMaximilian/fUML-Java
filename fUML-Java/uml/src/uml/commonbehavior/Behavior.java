
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

package uml.commonbehavior;

public abstract class Behavior extends uml.structuredclassifiers.Class_ {

	public boolean isReentrant = true;
	public uml.classification.BehavioralFeature specification = null;
	public uml.classification.ParameterList ownedParameter = new uml.classification.ParameterList();
	public uml.commonbehavior.BehavioredClassifier context = null;

	public void addOwnedParameter(
			uml.classification.Parameter ownedParameter) {
		super.addOwnedMember(ownedParameter);
		this.ownedParameter.addValue(ownedParameter);
	} // addOwnedParameter

	public void _setContext(
			uml.commonbehavior.BehavioredClassifier context) {
		// Note: This is a helper operation intended to be called by certain
		// operations outside the Behavior class in order to allow the setting
		// of the context to be overriden in subclasses.
		// It should _not_ be called otherwise in order to set the context
		// directly, rather than via these other operations.

		// Debug.println("[_setContext] behavior = " + this.name +
		// ", context = " + context.name);

		this.context = context;
	} // _setContext

	public void _setSpecification(
			uml.classification.BehavioralFeature specification) {
		this.specification = specification;
	} // _setSpecification

} // Behavior
