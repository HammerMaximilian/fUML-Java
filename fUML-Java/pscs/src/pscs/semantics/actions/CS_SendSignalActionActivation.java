package pscs.semantics.actions;

import fuml.semantics.actions.SendSignalActionActivation;
import fuml.semantics.commonbehavior.SignalEventOccurrence;
import fuml.semantics.simpleclassifiers.SignalInstance;
import fuml.semantics.structuredclassifiers.Object_;
import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;
import pscs.semantics.commonbehavior.CS_EventOccurrence;
import pscs.semantics.structuredclassifiers.CS_Reference;
import uml.actions.InputPin;
import uml.actions.InputPinList;
import uml.actions.SendSignalAction;
import uml.classification.Property;
import uml.classification.PropertyList;
import uml.simpleclassifiers.Signal;

public class CS_SendSignalActionActivation extends SendSignalActionActivation {

	@Override
	public void doAction()
    {
        // If onPort is not specified, behaves like in fUML
        // If onPort is specified,
        // Get the value from the target pin. If the value is not a reference,
        // then do nothing.
        // Otherwise, construct a signal using the values from the argument pins
        // As compared to fUML, instead of sending directly to target reference
        // by calling operation send:
        // - if the target is to be the same as or a container of (directly or indirectly)
        // the object executing the Action, the Signal shall be related to a Reception belonging
        // to a required interface of onPort, and sendOut is called on the target reference
        // so that the signal will be sent to the environment
        // - if the target is NOT to be the same as or a container of (directly or indirectly)
        // the object executing the Action, the Signal shall be related to a Reception belonging
        // to a provided Interface of onPort, and operation sendIn is called so that the signal
        // will be sent to the internals of the target object
        SendSignalAction action = (SendSignalAction) (this.node);

        if (action.onPort == null)
        {
            // Behaves like in fUML
            super.doAction();
        }
        else
        {
            Value target = takeTokens(action.target).get(0);
            if (target instanceof CS_Reference reference)
            {
                // Constructs the signal instance
                Signal signal = action.signal;
                SignalInstance signalInstance = new SignalInstance();
                signalInstance.type = signal;
                PropertyList attributes = signal.attribute;
                InputPinList argumentPins = action.argument;
                int i = 0;
                while (i < attributes.size())
                {
                    Property attribute = attributes.get(i);
                    InputPin argumentPin = argumentPins.get(i);
                    ValueList values = takeTokens(argumentPin);
                    signalInstance.setFeatureValue(attribute, values, 0);
                    i++;
                }
                // Construct the signal event occurrence
                SignalEventOccurrence signalEventOccurrence = new SignalEventOccurrence();
                signalEventOccurrence.signalInstance = (SignalInstance)signalInstance.copy();

                CS_EventOccurrence wrappingEventOccurrence = new CS_EventOccurrence();
                wrappingEventOccurrence.wrappedEventOccurrence = signalEventOccurrence;
                		
                // Tries to determine if the signal has to be
                // sent to the environment or to the internals of
                // target, through onPort
                CS_Reference targetReference = reference;
                // Port onPort = action.onPort ;
                Object_ executionContext = group.getActivityExecution().context;
                if (executionContext == targetReference.referent || targetReference.compositeReferent.contains(executionContext))
                {
                    wrappingEventOccurrence.sendOutTo(targetReference, action.onPort);
                }
                else
                {
                    wrappingEventOccurrence.sendInTo(targetReference, action.onPort);
                }
            }
        }
    }
} // CS_SendSignalActionActivation
