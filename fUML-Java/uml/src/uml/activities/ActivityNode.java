
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

public abstract class ActivityNode extends
		uml.classification.RedefinableElement {

	public uml.actions.StructuredActivityNode inStructuredNode = null;
	public uml.activities.Activity activity = null;
	public uml.activities.ActivityEdgeList outgoing = new uml.activities.ActivityEdgeList();
	public uml.activities.ActivityEdgeList incoming = new uml.activities.ActivityEdgeList();

	public void _setActivity(
			uml.activities.Activity activity) {
		this.activity = activity;
	} // _setActivity

	public void _setInStructuredNode(
			uml.actions.StructuredActivityNode inStructuredNode) {
		this.inStructuredNode = inStructuredNode;
	} // _setInStructuredNode

	public void _addIncoming(
			uml.activities.ActivityEdge incoming) {
		this.incoming.addValue(incoming);
	} // _addIncoming

	public void _addOutgoing(
			uml.activities.ActivityEdge outgoing) {
		this.outgoing.addValue(outgoing);
	} // _addOutgoing

} // ActivityNode
