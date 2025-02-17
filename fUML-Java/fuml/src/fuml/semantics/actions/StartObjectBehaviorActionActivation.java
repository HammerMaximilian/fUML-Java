
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

import fuml.semantics.commonbehavior.ParameterValue;
import fuml.semantics.commonbehavior.ParameterValueList;
import fuml.semantics.structuredclassifiers.Reference;
import fuml.semantics.values.Value;
import uml.actions.InputPinList;
import uml.actions.StartObjectBehaviorAction;
import uml.classification.Parameter;
import uml.classification.ParameterDirectionKind;
import uml.classification.ParameterList;
import uml.commonbehavior.Behavior;
import uml.structuredclassifiers.Class_;

public class StartObjectBehaviorActionActivation extends
		fuml.semantics.actions.InvocationActionActivation {

	public void doAction() {
		// Get the value on the object input pin. If it is not a reference, then
		// do nothing.
		// Start the behavior of the referent object for the classifier given as
		// the type of the object input pin, with parameter values taken from
		// the argument input pins.
		// If the object input pin has no type, then start the classifier
		// behaviors of all types of the referent object.

		StartObjectBehaviorAction action = (StartObjectBehaviorAction) (this.node);

		Value object = this.takeTokens(action.object).getValue(0);

		if (object instanceof Reference) {
			Class_ type = (Class_) (action.object.typedElement.type);
			InputPinList argumentPins = action.argument;

			ParameterValueList inputs = new ParameterValueList();

			if (type != null) {
				Behavior behavior;

				if (type instanceof Behavior) {
					behavior = (Behavior) type;
				} else {
					behavior = type.classifierBehavior;
				}

				if (behavior != null) {
					ParameterList parameters = behavior.ownedParameter;

					int pinNumber = 1;
					int i = 1;
					while (i <= parameters.size()) {
						Parameter parameter = parameters.getValue(i - 1);
						int j = pinNumber;
						if (parameter.direction == ParameterDirectionKind.in
								| parameter.direction == ParameterDirectionKind.inout) {
							ParameterValue parameterValue = new ParameterValue();
							parameterValue.parameter = parameter;
							parameterValue.values = this
									.takeTokens(argumentPins.getValue(j - 1));
							inputs.addValue(parameterValue);
							j = j + 1;
						}
						pinNumber = j;
						i = i + 1;
					}
				}
			}

			((Reference) object).startBehavior(type, inputs);
		}
	} // doAction

} // StartObjectBehaviorActionActivation
