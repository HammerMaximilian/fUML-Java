
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

import java.util.Iterator;

import fuml.Debug;
import fuml.semantics.activities.ActivityNodeActivation;
import fuml.semantics.activities.ActivityNodeActivationList;
import fuml.semantics.loci.ChoiceStrategy;
import uml.actions.Clause;
import uml.actions.ClauseList;
import uml.actions.ConditionalNode;
import uml.actions.OutputPin;
import uml.actions.OutputPinList;
import uml.actions.Pin;
import uml.activities.ExecutableNode;
import uml.activities.ExecutableNodeList;

public class ConditionalNodeActivation
		extends
		fuml.semantics.actions.StructuredActivityNodeActivation {

	public fuml.semantics.actions.ClauseActivationList clauseActivations = new fuml.semantics.actions.ClauseActivationList();
	public uml.actions.ClauseList selectedClauses = new uml.actions.ClauseList();
	public uml.actions.Clause selectedClause = null;

	public void doStructuredActivity() {
		// Run all the non-executable, non-pin nodes in the conditional node.
		// Activate all clauses in the conditional node and pass control to
		// those that are ready (i.e., have no predecessors).
		// If one or more clauses have succeeded in being selected, choose one
		// non-deterministically and run its body, then copy the outputs of that
		// clause to the output pins of the node.

		ConditionalNode node = (ConditionalNode) (this.node);

		ActivityNodeActivationList nodeActivations = this.activationGroup.nodeActivations;
		ActivityNodeActivationList nonExecutableNodeActivations = new ActivityNodeActivationList();
		for (int i = 0; i < nodeActivations.size(); i++) {
			ActivityNodeActivation nodeActivation = nodeActivations.getValue(i);
			if (!(nodeActivation.node instanceof ExecutableNode | nodeActivation.node instanceof Pin)) {
				nonExecutableNodeActivations.addValue(nodeActivation);
			}
		}

		this.activationGroup.run(nonExecutableNodeActivations);

		this.clauseActivations.clear();
		ClauseList clauses = node.clause;
		for (int i = 0; i < clauses.size(); i++) {
			Clause clause = clauses.getValue(i);
			ClauseActivation clauseActivation = new ClauseActivation();
			clauseActivation.clause = clause;
			clauseActivation.conditionalNodeActivation = this;
			this.clauseActivations.addValue(clauseActivation);
		}

		this.selectedClauses.clear();

		ClauseActivationList readyClauseActivations = new ClauseActivationList();
		for (int i = 0; i < this.clauseActivations.size(); i++) {
			ClauseActivation clauseActivation = this.clauseActivations
					.getValue(i);
			Debug.println("[doStructuredActivity] clauseActivations[" + i + "] = " + clauseActivation);
			if (clauseActivation.isReady()) {
				Debug
						.println("[doStructuredActivity] Clause activation is ready.");
				readyClauseActivations.addValue(clauseActivation);
			}
		}

		// *** Give control to all ready clauses concurrently. ***
		for (Iterator i = readyClauseActivations.iterator(); i.hasNext();) {
			ClauseActivation clauseActivation = (ClauseActivation) i.next();
			Debug.println("[doStructuredActivity] Giving control to " + clauseActivation + "...");
			clauseActivation.receiveControl();
		}

		this.selectedClause = null;
		if (this.selectedClauses.size() > 0 & this.isRunning()) {
			Debug.println("[doStructuredActivity] " + this.selectedClauses.size() + " clause(s) selected.");

			// *** If multiple clauses are selected, choose one
			// non-deterministically. ***
			int i = ((ChoiceStrategy) this.getExecutionLocus().factory
					.getStrategy("choice")).choose(this.selectedClauses.size());
			this.selectedClause = this.selectedClauses.getValue(i - 1);

			Debug.println("[doStructuredActivity] Running selectedClauses[" + i + "] = " + this.selectedClause);

			for (int j = 0; j < clauses.size(); j++) {
				Clause clause = clauses.getValue(j);
				if (clause != selectedClause) {
					ExecutableNodeList testNodes = clause.test;
					for (int k = 0; k < testNodes.size(); k++) {
						ExecutableNode testNode = testNodes.getValue(k);
						this.activationGroup.getNodeActivation(testNode)
								.terminate();
					}
				}
			}

			this.activationGroup.runNodes(this
					.makeActivityNodeList(this.selectedClause.body));
		}
	} // doStructuredActivity

	public void completeBody() {
		// Complete the activation of the body of a conditional note by
		// copying the outputs of the selected clause (if any) to the output
		// pins of the node and terminating the activation of all nested nodes.

		if (this.selectedClause != null) {
			ConditionalNode node = (ConditionalNode) (this.node);
			OutputPinList resultPins = node.result;
			OutputPinList bodyOutputPins = this.selectedClause.bodyOutput;
			for (int k = 0; k < resultPins.size(); k++) {
				OutputPin resultPin = resultPins.getValue(k);
				OutputPin bodyOutputPin = bodyOutputPins.getValue(k);
				this.putTokens(resultPin, this.getPinValues(bodyOutputPin));
			}
		}
		this.activationGroup.terminateAll();
	} // completeBody

	public fuml.semantics.activities.TokenList completeAction() {
		// Only complete the conditional node if it is not suspended.

		if (!this.isSuspended()) {
			completeBody();
		}
		return super.completeAction();
	} // completeAction

	public fuml.semantics.actions.ClauseActivation getClauseActivation(
			uml.actions.Clause clause) {
		// Get the clause activation corresponding to the given clause.

		// Debug.println("[getClauseActivation] clause = " + clause);

		ClauseActivation selectedClauseActivation = null;
		int i = 1;
		while ((selectedClauseActivation == null)
				& i <= this.clauseActivations.size()) {
			ClauseActivation clauseActivation = this.clauseActivations
					.getValue(i - 1);
			// Debug.println("[getClauseActivations] clauseActivations[" + i +
			// "].clause = " + clauseActivation.clause);
			if (clauseActivation.clause == clause) {
				selectedClauseActivation = clauseActivation;
			}
			i = i + 1;
		}

		return selectedClauseActivation;
	} // getClauseActivation

	public void runTest(
			uml.actions.Clause clause) {
		// Run the test for the given clause.

		if (this.isRunning()) {
			this.activationGroup.runNodes(this
					.makeActivityNodeList(clause.test));
		}
	} // runTest

	public void selectBody(
			uml.actions.Clause clause) {
		// Add the clause to the list of selected clauses.

		this.selectedClauses.addValue(clause);

	} // selectBody

	public void resume() {
		// When this conditional node is resumed after being suspended, complete
		// its body and then resume it as a structured activity node.
		// [Note that this presumes that accept event actions are not allowed
		// in the test part of a clause of a conditional node.]

		completeBody();
		super.resume();
	} // resume

} // ConditionalNodeActivation
