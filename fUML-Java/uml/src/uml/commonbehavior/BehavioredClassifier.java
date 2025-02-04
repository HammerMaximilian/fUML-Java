
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

public abstract class BehavioredClassifier extends
		uml.classification.Classifier {

	public uml.commonbehavior.BehaviorList ownedBehavior = new uml.commonbehavior.BehaviorList();
	public uml.commonbehavior.Behavior classifierBehavior = null;
	public uml.simpleclassifiers.InterfaceRealizationList interfaceRealization = new uml.simpleclassifiers.InterfaceRealizationList(); // PSCS-specific

	public void addOwnedBehavior(
			uml.commonbehavior.Behavior ownedBehavior) {
		super.addOwnedMember(ownedBehavior);

		this.ownedBehavior.addValue(ownedBehavior);

		if (!(this instanceof Behavior) || ((Behavior) this).context == null) {
			ownedBehavior._setContext(this);
		} else {
			ownedBehavior._setContext(((Behavior) this).context);
		}

	} // addOwnedBehavior

	public void setClassifierBehavior(
			uml.commonbehavior.Behavior classifierBehavior) {
		// Note: The classifier behavior must also be added as an owned behavior
		// using addOwnedBehavior.

		this.classifierBehavior = classifierBehavior;
	} // setClassifierBehavior
	
    public void addInterfaceRealization(uml.simpleclassifiers.InterfaceRealization interfaceRealization) // PSCS-specific
    {
        this.interfaceRealization.add(interfaceRealization);
        interfaceRealization._setImplementingClassifier(this);

        addClientDependency(interfaceRealization);
        addOwnedElement(interfaceRealization);
    }

} // BehavioredClassifier
