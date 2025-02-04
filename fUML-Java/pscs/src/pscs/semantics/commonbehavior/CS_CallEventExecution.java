package pscs.semantics.commonbehavior;

import fuml.semantics.commonbehavior.CallEventExecution;
import fuml.semantics.commonbehavior.EventOccurrence;
import fuml.semantics.values.Value;
import pscs.semantics.structuredclassifiers.CS_InteractionPoint;

public class CS_CallEventExecution extends CallEventExecution {

    public CS_InteractionPoint interactionPoint = null;

    @Override
    public EventOccurrence createEventOccurrence()
    {
        // Wrap the created event occurrence within a CS_EventOccurrence which
        // references the behavior port on which the call was dispatched.
        CS_EventOccurrence wrappingEventOccurrence = new CS_EventOccurrence();
        wrappingEventOccurrence.interactionPoint = interactionPoint;
        wrappingEventOccurrence.wrappedEventOccurrence = super.createEventOccurrence();
        return wrappingEventOccurrence;
    }

    @Override
	public Value new_()
    {
        // Create a new call event execution.
        return new CS_CallEventExecution();
    }

    @Override
    public Value copy()
    {
        // Create a new call event execution that is a copy of this execution, no
        // referenced interaction point.
        CS_CallEventExecution copy = (CS_CallEventExecution)super.copy();
        copy.interactionPoint = null;
        return copy;
    }
	
} // CS_CallEventExecution
