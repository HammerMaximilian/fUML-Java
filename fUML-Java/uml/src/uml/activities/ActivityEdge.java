
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

package uml.activities;

public abstract class ActivityEdge extends
		uml.classification.RedefinableElement {

	public uml.activities.Activity activity = null;
	public uml.activities.ActivityNode source = null;
	public uml.activities.ActivityNode target = null;
	public uml.values.ValueSpecification guard = null;
	public uml.actions.StructuredActivityNode inStructuredNode = null;

	public void setTarget(
			uml.activities.ActivityNode target) {
		this.target = target;
		target._addIncoming(this);
	} // setTarget

	public void setSource(
			uml.activities.ActivityNode source) {
		this.source = source;
		source._addOutgoing(this);
	} // setSource

	public void setGuard(uml.values.ValueSpecification guard) {
		if (guard != null) {
			super.addOwnedElement(guard);
		}

		this.guard = guard;
	} // setGuard

	public void _setActivity(
			uml.activities.Activity activity) {
		this.activity = activity;
	} // _setActivity

	public void _setInStructuredNode(
			uml.actions.StructuredActivityNode inStructuredNode) {
		this.inStructuredNode = inStructuredNode;
	} // _setInStructuredNode

} // ActivityEdge
