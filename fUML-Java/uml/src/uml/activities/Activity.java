
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

import uml.actions.StructuredActivityNode;

public class Activity extends
		uml.commonbehavior.Behavior {

	public uml.actions.StructuredActivityNodeList structuredNode = new uml.actions.StructuredActivityNodeList();
	public uml.activities.ActivityNodeList node = new uml.activities.ActivityNodeList();
	public boolean isReadOnly = false;
	public uml.activities.ActivityEdgeList edge = new uml.activities.ActivityEdgeList();
	public uml.activities.ActivityGroupList group = new uml.activities.ActivityGroupList();

	public void setIsReadOnly(boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	} // setIsReadOnly

	public void addNode(
			uml.activities.ActivityNode node) {
		if (!this.node.contains(node)) {
			super.addOwnedElement(node);
	
			this.node.add(node);
			node._setActivity(this);
		}
		
		if (node instanceof StructuredActivityNode &&
				!this.structuredNode.contains(node)) {
			this.structuredNode.add((StructuredActivityNode) node);
		}

	} // addNode
	
	public void addStructuredNode(uml.actions.StructuredActivityNode node) {
		this.addNode(node);
	}
	
	public void addGroup(uml.activities.ActivityGroup group) {
		this.group.add(group);
	}

	public void addEdge(
			uml.activities.ActivityEdge edge) {
		super.addOwnedElement(edge);

		this.edge.addValue(edge);
		edge._setActivity(this);
	} // addEdge

	public void _setContext(
			uml.commonbehavior.BehavioredClassifier context) {
		// Note: The context of an activity should be set only _after_ all nodes
		// have been added to the activity.

		super._setContext(context);

		for (int i = 0; i < this.node.size(); i++) {
			ActivityNode node = this.node.getValue(i);
			if (node instanceof uml.actions.Action) {
				((uml.actions.Action) node)
						._setContext(context);
			}
		}
	} // _setContext

} // Activity
