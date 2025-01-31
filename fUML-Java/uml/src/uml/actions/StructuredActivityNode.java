
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

package uml.actions;

import uml.activities.ActivityNode;

public class StructuredActivityNode extends
		uml.actions.Action {

	public uml.activities.ActivityNodeList node = new uml.activities.ActivityNodeList();
	public uml.activities.Activity activity = null;
	public boolean mustIsolate = false;
	public uml.activities.ActivityEdgeList edge = new uml.activities.ActivityEdgeList();
	public uml.actions.OutputPinList structuredNodeOutput = new uml.actions.OutputPinList();
	public uml.actions.InputPinList structuredNodeInput = new uml.actions.InputPinList();

	public void setMustIsolate(boolean mustIsolate) {
		this.mustIsolate = mustIsolate;
	} // setMustIsolate

	public void addNode(
			uml.activities.ActivityNode node) {
		this.node.addValue(node);
		node._setInStructuredNode(this);
	} // addNode

	public void addEdge(
			uml.activities.ActivityEdge edge) {
		this.edge.addValue(edge);
		edge._setInStructuredNode(this);
	} // addEdge

	public void addStructuredNodeOutput(
			uml.actions.OutputPin structuredNodeOutput) {
		this.addOutput(structuredNodeOutput);
		this.structuredNodeOutput.addValue(structuredNodeOutput);
	} // addStructuredNodeOutput

	public void addStructuredNodeInput(
			uml.actions.InputPin structuredNodeInput) {
		this.addInput(structuredNodeInput);
		this.structuredNodeInput.addValue(structuredNodeInput);
	} // addStructuredNodeInput

	public void _setContext(uml.classification.Classifier context) {
		super._setContext(context);
		for (ActivityNode node : this.node) {
			if (node instanceof Action) {
				((Action) node)._setContext(context);
			}
		}
	} // _setContext

	public void _setActivity(
			uml.activities.Activity activity) {
		super._setActivity(activity);
		this.activity = activity;
	} // _setActivity

} // StructuredActivityNode
