
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

package fuml.semantics.actions;

import java.util.*;

import fuml.semantics.activities.ActivityNodeActivation;
import fuml.semantics.activities.ActivityNodeActivationGroup;
import fuml.semantics.activities.ObjectToken;
import fuml.semantics.activities.Token;
import fuml.semantics.activities.TokenList;
import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;
import uml.actions.Action;
import uml.actions.InputPin;
import uml.actions.InputPinList;
import uml.actions.OutputPin;
import uml.actions.OutputPinList;
import uml.actions.StructuredActivityNode;
import uml.activities.ActivityNode;
import uml.activities.ActivityNodeList;

public class StructuredActivityNodeActivation extends
		fuml.semantics.actions.ActionActivation {

	public fuml.semantics.activities.ActivityNodeActivationGroup activationGroup = null;

	public void doAction() {
		// If the structured activity node has mustIsolate=true, then carry out
		// its behavior with isolation.
		// Otherwise just activate it normally.

		if (((StructuredActivityNode) (this.node)).mustIsolate) {
			_beginIsolation();
			this.doStructuredActivity();
			_endIsolation();
		} else {
			this.doStructuredActivity();
		}

	} // doAction

	public void doStructuredActivity() {
		// Run all activations of contained nodes. When this is complete,
		// return.
		// (This is the default behavior for a structured activity node used
		// simply as a group. It is overridden for the execution of conditional
		// and loop nodes.)

		Action action = (Action) (this.node);

		// *** Concurrently send offers from all input pins. ***
		InputPinList inputPins = action.input;
		for (Iterator i = inputPins.iterator(); i.hasNext();) {
			InputPin inputPin = (InputPin) i.next();
			PinActivation pinActivation = this.getPinActivation(inputPin);
			pinActivation.sendUnofferedTokens();
		}

		this.activationGroup.run(this.activationGroup.nodeActivations);
	} // doStructuredActivity

	public void terminate() {
		// Terminate the execution of all contained node activations (which
		// completes the performance of the structured activity node
		// activation), and then terminate this node itself.

		this.terminateAll();
		super.terminate();
	} // terminate

	public fuml.semantics.activities.ActivityNodeActivation getNodeActivation(
			uml.activities.ActivityNode node) {
		// If this structured activity node activation is not for the given
		// node, then check if there is an activation for the node in the
		// activation group.

		ActivityNodeActivation thisActivation = super.getNodeActivation(node);

		ActivityNodeActivation activation = null;
		if (thisActivation != null) {
			activation = thisActivation;
		} else if (this.activationGroup != null) {
			activation = this.activationGroup.getNodeActivation(node);
		}

		return activation;
	} // getNodeActivation

	public uml.activities.ActivityNodeList makeActivityNodeList(
			uml.activities.ExecutableNodeList nodes) {
		// Return an activity node list containing the given list of executable
		// nodes
		// and any pins that they own.

		ActivityNodeList activityNodes = new ActivityNodeList();

		for (int i = 0; i < nodes.size(); i++) {
			ActivityNode node = nodes.getValue(i);
			activityNodes.addValue(node);

			if (node instanceof Action) {
				Action action = (Action) node;

				InputPinList inputPins = action.input;
				for (int j = 0; j < inputPins.size(); j++) {
					InputPin inputPin = inputPins.getValue(j);
					activityNodes.addValue(inputPin);
				}

				OutputPinList outputPins = action.output;
				for (int j = 0; j < outputPins.size(); j++) {
					OutputPin outputPin = outputPins.getValue(j);
					activityNodes.addValue(outputPin);
				}
			}
		}

		return activityNodes;
	} // makeActivityNodeList

	public fuml.semantics.values.ValueList getPinValues(
			uml.actions.OutputPin pin) {
		// Return the values of the tokens on the pin activation corresponding
		// to the given pin in the internal activation group for this node
		// activation.

		PinActivation pinActivation = (PinActivation) (this.activationGroup
				.getNodeActivation(pin));
		TokenList tokens = pinActivation.getTokens();

		ValueList values = new ValueList();
		for (int i = 0; i < tokens.size(); i++) {
			Token token = tokens.getValue(i);
			Value value = ((ObjectToken) token).value;
			if (value != null) {
				values.addValue(value);
			}
		}

		return values;
	} // getPinValues

	public void putPinValues(uml.actions.OutputPin pin,
			fuml.semantics.values.ValueList values) {
		// Place tokens for the given values on the pin activation corresponding
		// to the given output pin on the internal activation group for this
		// node activation.

		PinActivation pinActivation = (PinActivation) (this.activationGroup
				.getNodeActivation(pin));

		for (int i = 0; i < values.size(); i++) {
			Value value = values.getValue(i);
			ObjectToken token = new ObjectToken();
			token.value = value;
			pinActivation.addToken(token);
		}

	} // putPinValues

	public void createNodeActivations() {
		// Create an activation group and create node activations for all the
		// nodes within the structured activity node.

		super.createNodeActivations();

		this.activationGroup = new ActivityNodeActivationGroup();
		this.activationGroup.containingNodeActivation = this;
		this.activationGroup
				.createNodeActivations(((StructuredActivityNode) (this.node)).node);

	} // createNodeActivations

	public void createEdgeInstances() {
		// Create instances for all edges owned by this node.

		this.activationGroup
				.createEdgeInstances(((StructuredActivityNode) (this.node)).edge);
	} // createEdgeInstances

	public boolean isSourceFor(
			fuml.semantics.activities.ActivityEdgeInstance edgeInstance) {
		// Returns true if this node is either the source for the given
		// edgeInstance itself or if it contains the source in its
		// activation group.

		boolean isSource = super.isSourceFor(edgeInstance);
		if (!isSource) {
			isSource = this.activationGroup.hasSourceFor(edgeInstance);
		}
		return isSource;
	} // isSourceFor

	public void terminateAll() {
		// Terminate the execution of all contained node activations (which
		// completes the performance of the structured activity node
		// activation).

		this.activationGroup.terminateAll();
	} // terminateAll

	public boolean isSuspended() {
		// Check if the activation group for this node is suspended.

		return this.activationGroup.isSuspended();
	} // isSuspended

	public fuml.semantics.activities.TokenList completeAction() {
		// Only actually complete this structured activity node if it is not
		// suspended.

		TokenList incomingTokens = new TokenList();
		if (!this.isSuspended()) {
			incomingTokens = super.completeAction();
		}
		return incomingTokens;
	} // completeAction

	public void resume() {
		// When this structured activity node is resumed after being suspended,
		// then complete its prior firing and, if there are more incoming
		// tokens, fire it again. If, after that, the node is not suspended,
		// then finish its resumption.

		TokenList incomingTokens = super.completeAction();
		if (incomingTokens.size() > 0) {
			this.fire(incomingTokens);
		}
		if (!this.isSuspended()) {
			super.resume();
		}
	} // resume

} // StructuredActivityNodeActivation
