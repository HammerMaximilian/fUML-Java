/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * Modifications:
 * Copyright 2009-2017 Data Access Technologies, Inc.
 * Copyright 2020 Model Driven Solutions, Inc.
 * Copyright 2020 CEA LIST.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package fuml.semantics.actions;

import java.util.Iterator;

import fuml.Debug;
import fuml.semantics.activities.ActivityEdgeInstance;
import fuml.semantics.activities.ActivityEdgeInstanceList;
import fuml.semantics.activities.ActivityNodeActivation;
import fuml.semantics.activities.ActivityNodeActivationGroup;
import fuml.semantics.activities.ControlToken;
import fuml.semantics.activities.ForkNodeActivation;
import fuml.semantics.activities.ObjectToken;
import fuml.semantics.activities.Token;
import fuml.semantics.activities.TokenList;
import fuml.semantics.simpleclassifiers.BooleanValue;
import fuml.semantics.simpleclassifiers.FeatureValueList;
import fuml.semantics.simpleclassifiers.StructuredValue;
import fuml.semantics.structuredclassifiers.ExtensionalValue;
import fuml.semantics.structuredclassifiers.ExtensionalValueList;
import fuml.semantics.structuredclassifiers.Link;
import fuml.semantics.structuredclassifiers.LinkList;
import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;
import uml.actions.Action;
import uml.actions.InputPin;
import uml.actions.InputPinList;
import uml.actions.OutputPin;
import uml.actions.OutputPinList;
import uml.activities.ActivityNode;
import uml.activities.ActivityNodeList;
import uml.classification.Property;
import uml.structuredclassifiers.Association;
import uml.values.LiteralBoolean;

public abstract class ActionActivation extends fuml.semantics.activities.ExecutableNodeActivation {

	public boolean firing = false;
	public fuml.semantics.actions.PinActivationList pinActivations = new fuml.semantics.actions.PinActivationList();

	public void initialize(ActivityNode node, ActivityNodeActivationGroup group) {
		// Initialize this action activation to be not firing.

		super.initialize(node, group);
		this.firing = false;
	}

	public void run() {
		// Run this action activation and any outgoing fork node attached to it.

		super.run();

		if (this.outgoingEdges.size() > 0) {
			this.outgoingEdges.getValue(0).target.run();
		}

		this.firing = false;
	} // run

	public fuml.semantics.activities.TokenList takeOfferedTokens() {
		// If the action is not locally reentrant, then mark this activation as
		// firing.
		// Take any incoming offers of control tokens, then concurrently fire
		// all input pin activations.

		// Note: This is included here to happen in the same isolation scope as
		// the isReady test.
		this.firing = !((Action) this.node).isLocallyReentrant;

		TokenList offeredTokens = new TokenList();

		ActivityEdgeInstanceList incomingEdges = this.incomingEdges;
		for (int i = 0; i < incomingEdges.size(); i++) {
			ActivityEdgeInstance incomingEdge = incomingEdges.getValue(i);
			TokenList tokens = incomingEdge.takeOfferedTokens();
			for (int j = 0; j < tokens.size(); j++) {
				Token token = tokens.getValue(j);
				token.withdraw();
				offeredTokens.addValue(token);
			}
		}

		Action action = (Action) (this.node);

		// *** Fire all input pins concurrently. ***
		InputPinList inputPins = action.input;
		for (Iterator i = inputPins.iterator(); i.hasNext();) {
			InputPin pin = (InputPin) (i.next());
			PinActivation pinActivation = this.getPinActivation(pin);
			TokenList tokens = pinActivation.takeOfferedTokens();
			pinActivation.fire(tokens);
			for (int j = 0; j < tokens.size(); j++) {
				Token token = tokens.getValue(j);
				offeredTokens.addValue(token);
			}
		}

		return offeredTokens;
	} // takeOfferedTokens

	public void fire(fuml.semantics.activities.TokenList incomingTokens) {
		// Do the main action behavior then concurrently fire all output pin
		// activations
		// and offer a single control token. Then activate the action again,
		// if it is still ready to fire and has at least one token actually
		// being
		// offered to it.

		do {

			Debug.println("[fire] Action " + this.node.name + "...");
			Debug.println("[event] Fire activity="
					+ this.getActivityExecution().getBehavior().name
					+ " action=" + this.node.name);

			this.doAction();
			incomingTokens = this.completeAction();

		} while (incomingTokens.size() > 0);
	} // fire

	public void terminate() {
		// Terminate this action activation and any outgoing fork node attached
		// to it.

		super.terminate();

		if (this.outgoingEdges.size() > 0) {
			this.outgoingEdges.getValue(0).target.terminate();
		}
	} // terminate

	public fuml.semantics.activities.TokenList completeAction() {
		// Concurrently fire all output pin activations and offer a single
		// control token. Then check if the action should fire again
		// and, if so, return additional incoming tokens for this.

		this.sendOffers();

		Debug.println("[fire] Checking if " + this.node.name + " should fire again...");

		_beginIsolation();
		TokenList incomingTokens = new TokenList();
		this.firing = false;
		if (this.isReady()) {
			incomingTokens = this.takeOfferedTokens();
			this.firing = this.isFiring() & incomingTokens.size() > 0;
		}
		_endIsolation();

		return incomingTokens;
	} // completeAction

	public boolean isReady() {
		// Check that the action is ready to fire, including
		// that all input pin activations are ready.

		boolean ready = isControlReady();

		InputPinList inputPins = ((Action) (this.node)).input;
		int j = 1;
		while (ready && j <= inputPins.size()) {
			ready = this.getPinActivation(inputPins.getValue(j - 1)).isReady();
			j = j + 1;
		}

		return ready;
	} // isReady
	
	public boolean isControlReady() {
		// In addition to the default condition for being ready, check that, 
		// if the action has isLocallyReentrant=false, then the activation is 
		// not currently firing, and that the sources of all incoming edges
		// have offers. (This assumes that all edges directly incoming to the
		// action are control flows.)
		
		boolean ready = super.isReady()
				& (((Action) this.node).isLocallyReentrant | !this.isFiring());

		int i = 1;
		while (ready & i <= this.incomingEdges.size()) {
			ready = this.incomingEdges.getValue(i - 1).hasOffer();
			i = i + 1;
		}

		return ready;
	}

	public boolean isFiring() {
		// Indicate whether this action activation is currently firing or not.

		return firing;
	} // isFiring

	public abstract void doAction();

	public void sendOffers() {
		// Fire all output pins and send offers on all outgoing control flows.

		Action action = (Action) (this.node);

		// *** Send offers from all output pins concurrently. ***
		OutputPinList outputPins = this.getOfferingOutputPins();
		for (Iterator i = outputPins.iterator(); i.hasNext();) {
			OutputPin outputPin = (OutputPin) i.next();
			PinActivation pinActivation = this.getPinActivation(outputPin);
			pinActivation.sendUnofferedTokens();
		}

		// Send offers on all outgoing control flows.
		if (this.outgoingEdges.size() > 0) {
			TokenList tokens = new TokenList();
			tokens.addValue(new ControlToken());
			this.addTokens(tokens);
			this.outgoingEdges.getValue(0).sendOffer(tokens);
		}
	} // sendOffers
	
	public OutputPinList getOfferingOutputPins() {
		// Return the output pins of the action of this action activation from 
		// which offers are to be sent when the action activation finishes firing.
		// (This is normally all the output pins of the action, but it can be
		// overridden in subclasses to only return a subset of the output pins.)
		
		return ((Action)this.node).output;
	}

	public void createNodeActivations() {
		// Create node activations for the input and output pins of the action
		// for this activation.
		// [Note: Pins are owned by their actions, not by the enclosing activity
		// (or group), so they must be activated through the action activation.]

		Action action = (Action) (this.node);

		ActivityNodeList inputPinNodes = new ActivityNodeList();
		InputPinList inputPins = action.input;
		for (int i = 0; i < inputPins.size(); i++) {
			InputPin inputPin = inputPins.getValue(i);
			inputPinNodes.addValue(inputPin);
		}

		this.group.createNodeActivations(inputPinNodes);

		for (int i = 0; i < inputPinNodes.size(); i++) {
			ActivityNode node = inputPinNodes.getValue(i);
			this.addPinActivation((PinActivation) (this.group
					.getNodeActivation(node)));
		}

		ActivityNodeList outputPinNodes = new ActivityNodeList();
		OutputPinList outputPins = action.output;
		for (int i = 0; i < outputPins.size(); i++) {
			OutputPin outputPin = outputPins.getValue(i);
			outputPinNodes.addValue(outputPin);
		}

		this.group.createNodeActivations(outputPinNodes);

		for (int i = 0; i < outputPinNodes.size(); i++) {
			ActivityNode node = outputPinNodes.getValue(i);
			this.addPinActivation((PinActivation) (this.group
					.getNodeActivation(node)));
		}
	} // createNodeActivations

	public void addOutgoingEdge(fuml.semantics.activities.ActivityEdgeInstance edge) {
		// If there are no outgoing activity edge instances, create a single
		// activity edge instance with a fork node execution at the other end.
		// Add the give edge to the fork node execution that is the target of
		// the activity edge instance out of this action execution.
		// [This assumes that all edges directly outgoing from the action are
		// control flows, with an implicit fork for offers out of the action.]

		ActivityNodeActivation forkNodeActivation;

		if (this.outgoingEdges.size() == 0) {
			forkNodeActivation = new ForkNodeActivation();
			forkNodeActivation.running = false;
			ActivityEdgeInstance newEdge = new ActivityEdgeInstance();
			super.addOutgoingEdge(newEdge);
			forkNodeActivation.addIncomingEdge(newEdge);
		} else {
			forkNodeActivation = this.outgoingEdges.getValue(0).target;
		}

		forkNodeActivation.addOutgoingEdge(edge);
	} // addOutgoingEdge

	public void addPinActivation(fuml.semantics.actions.PinActivation pinActivation) {
		// Add a pin activation to this action activation.

		this.pinActivations.addValue(pinActivation);
		pinActivation.actionActivation = this;
	} // addPinActivation

	public fuml.semantics.actions.PinActivation getPinActivation(uml.actions.Pin pin) {
		// Precondition: The given pin is owned by the action of the action
		// activation.
		// Return the pin activation corresponding to the given pin.

		PinActivation pinActivation = null;
		int i = 1;
		while (pinActivation == null & i <= this.pinActivations.size()) {
			PinActivation thisPinActivation = this.pinActivations
					.getValue(i - 1);
			if (thisPinActivation.node == pin) {
				pinActivation = thisPinActivation;
			}
			i = i + 1;
		}

		return pinActivation;

	} // getPinActivation

	public void putToken(uml.actions.OutputPin pin, fuml.semantics.values.Value value) {
		// Precondition: The action execution has fired and the given pin is
		// owned by the action of the action execution.
		// Place a token for the given value on the pin activation corresponding
		// to the given output pin.

		Debug.println("[putToken] node = " + this.node.name);

		ObjectToken token = new ObjectToken();
		token.value = value;

		PinActivation pinActivation = this.getPinActivation(pin);
		pinActivation.addToken(token);
	} // putToken

	public void putTokens(uml.actions.OutputPin pin, fuml.semantics.values.ValueList values) {
		// Precondition: The action execution has fired and the given pin is
		// owned by the action of the action execution.
		// Place tokens for the given values on the pin activation corresponding
		// to the given output pin.

		// Debug.println("[putTokens] node = " + this.node.name);

		for (int i = 0; i < values.size(); i++) {
			Value value = values.getValue(i);
			this.putToken(pin, value);
		}

	} // putTokens

	public fuml.semantics.values.ValueList getTokens(uml.actions.InputPin pin) {
		// Precondition: The action execution has fired and the given pin is
		// owned by the action of the action execution.
		// Get any tokens held by the pin activation corresponding to the given
		// input pin and return them
		// (but leave the tokens on the pin).

		Debug.println("[getTokens] node = " + this.node.name + ", pin = " + pin.name);

		PinActivation pinActivation = this.getPinActivation(pin);
		TokenList tokens = pinActivation.getUnofferedTokens();

		ValueList values = new ValueList();
		for (int i = 0; i < tokens.size(); i++) {
			Token token = tokens.getValue(i);
			Value value = ((ObjectToken) token).value;
			if (value != null) {
				values.addValue(value);
			}
		}

		return values;
	} // getTokens

	public fuml.semantics.values.ValueList takeTokens(uml.actions.InputPin pin) {
		// Precondition: The action execution has fired and the given pin is
		// owned by the action of the action execution.
		// Take any tokens held by the pin activation corresponding to the given
		// input pin and return them.

		Debug.println("[takeTokens] node = " + this.node.name + ", pin = " + pin.name);

		PinActivation pinActivation = this.getPinActivation(pin);
		TokenList tokens = pinActivation.takeUnofferedTokens();

		ValueList values = new ValueList();
		for (int i = 0; i < tokens.size(); i++) {
			Token token = tokens.getValue(i);
			Value value = ((ObjectToken) token).value;
			if (value != null) {
				values.addValue(value);
			}
		}

		return values;
	} // takeTokens

	public boolean isSourceFor(fuml.semantics.activities.ActivityEdgeInstance edgeInstance) {
		// If this action has an outgoing fork node, check that the fork node is
		// the source of the given edge instance.

		boolean isSource = false;
		if (this.outgoingEdges.size() > 0) {
			isSource = this.outgoingEdges.getValue(0).target
					.isSourceFor(edgeInstance);
		}

		return isSource;
	} // isSourceFor

	public boolean valueParticipatesInLink(fuml.semantics.values.Value value,
			fuml.semantics.structuredclassifiers.Link link) {
		// Test if the given value participates in the given link.

		FeatureValueList linkFeatureValues = link.getFeatureValues();

		boolean participates = false;
		int i = 1;
		while (!participates & i <= linkFeatureValues.size()) {
			participates = linkFeatureValues.getValue(i - 1).values.getValue(0)
					.equals(value);
			i = i + 1;
		}

		return participates;
	} // valueParticipatesInLink
	
	public uml.structuredclassifiers.Association getAssociation(
			uml.classification.StructuralFeature feature) {
		// If the given structural feature is an association end, then get 
		// the associated association.

		Association association = null;
		if (feature instanceof Property) {
			association = ((Property) feature).association;
		}

		return association;
	} // getAssociation

	public fuml.semantics.values.ValueList getValues(
			fuml.semantics.values.Value sourceValue,
			uml.classification.StructuralFeature feature) {
		// Get the values of the feature for the given source value.
		// If the feature is an association end, then get the values of
		// the feature end of the links with the source value as the
		// opposite end.
		// Otherwise, if the source value is a structured value, get 
		// the values of the feature value for feature in the structured value.
		
		ValueList values = new ValueList();

		Association association = this.getAssociation(feature);
		if (association != null) {
			LinkList links = this.getMatchingLinks(association, feature, sourceValue);
			for (int j = 0; j < links.size(); j++) {
				Link link = links.getValue(j);
				values.addValue(link.getFeatureValue(feature).values.getValue(0));
			}
		} else {
			values = ((StructuredValue)sourceValue).getFeatureValue(feature).values;
		}
		
		return values;
	}

	public fuml.semantics.structuredclassifiers.LinkList getMatchingLinks(
			uml.structuredclassifiers.Association association,
			uml.classification.StructuralFeature end,
			fuml.semantics.values.Value oppositeValue) {
		// Get the links of the given binary association whose end opposite
		// to the given end has the given value
		
		return this.getMatchingLinksForEndValue(association, end, oppositeValue, null);
	}

	
	public fuml.semantics.structuredclassifiers.LinkList getMatchingLinksForEndValue(
			uml.structuredclassifiers.Association association,
			uml.classification.StructuralFeature end,
			fuml.semantics.values.Value oppositeValue,
			fuml.semantics.values.Value endValue) {
		// Get the links of the given binary association whose end opposite
		// to the given end has the given opposite value and, optionally, that
		// has a given end value for the given end.

		Property oppositeEnd = this.getOppositeEnd(association, end);

		ExtensionalValueList extent = this.getExecutionLocus().getExtent(
				association);

		LinkList links = new LinkList();
		for (int i = 0; i < extent.size(); i++) {
			ExtensionalValue link = extent.getValue(i);
			if (link.getFeatureValue(oppositeEnd).values.getValue(0).equals(oppositeValue)) {
				boolean matches = true;
				if (endValue != null) {
					matches = link.getFeatureValue(end).values.getValue(0).equals(endValue);
				}
				if (matches) {
					if (!end.multiplicityElement.isOrdered | links.size() == 0) {
						links.addValue((Link) link);
					} else {
						int n = link.getFeatureValue(end).position;
						boolean continueSearching = true;
						int j = 0;
						while (continueSearching & j < links.size()) {
							j = j + 1;
							continueSearching = links.getValue(j - 1).getFeatureValue(end).position < n;
						}
						if (continueSearching) {
							links.addValue((Link) link);
						} else {
							links.addValue(j - 1, (Link) link);
						}
					}
				}
			}
		}

		return links;
	} // getMatchingLinksForEndValue

	public uml.classification.Property getOppositeEnd(
			uml.structuredclassifiers.Association association,
			uml.classification.StructuralFeature end) {
		// Get the end of a binary association opposite to the given end.

		Property oppositeEnd = association.memberEnd.getValue(0);
		if (oppositeEnd == end) {
			oppositeEnd = association.memberEnd.getValue(1);
		}

		return oppositeEnd;
	} // getOppositeEnd

	public fuml.semantics.simpleclassifiers.BooleanValue makeBooleanValue(boolean value) {
		// Make a Boolean value using the built-in Boolean primitive type.
		// [This ensures that Boolean values created internally are the same as
		// the default used for evaluating Boolean literals.]

		LiteralBoolean booleanLiteral = new LiteralBoolean();
		booleanLiteral.value = value;
		return (BooleanValue) (this.getExecutionLocus().executor
				.evaluate(booleanLiteral));
	} // makeBooleanValue

	public void handle(fuml.semantics.values.Value exception, uml.activities.ExceptionHandler handler) {
		// Handle the given exception by firing the body of the given
		// exception handler. After the body fires, transfer its outputs
		// to the output pins of this action activation.
		
		super.handle(exception, handler);
		this.transferOutputs((Action)handler.handlerBody);
	}

	public void transferOutputs(uml.actions.Action handlerBody) {
		// Transfer the output values from activation of the given exception
		// handler body to the output pins of this action activation.
		
		ActionActivation handlerBodyActivation = 
				(ActionActivation)this.group.getNodeActivation(handlerBody);
		OutputPinList sourceOutputs = handlerBody.output;
		OutputPinList targetOutputs = ((Action) this.node).output;
		
		for (int i = 0; i < sourceOutputs.size(); i++) {
			OutputPin sourcePin = sourceOutputs.getValue(i);
			OutputPin targetPin = targetOutputs.getValue(i);
			
			PinActivation sourcePinActivation = handlerBodyActivation.getPinActivation(sourcePin);
			TokenList tokens = sourcePinActivation.takeTokens();
			ValueList values = new ValueList();
			for (int j = 0; j < tokens.size(); j++) {
				Token token = tokens.getValue(j);
				values.addValue(token.getValue());
			}
			
			this.putTokens(targetPin, values);
		}
	}

} // ActionActivation
