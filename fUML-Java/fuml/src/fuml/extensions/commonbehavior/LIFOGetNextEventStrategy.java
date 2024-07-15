package fuml.extensions.commonbehavior;

import fuml.semantics.commonbehavior.EventOccurrence;
import fuml.semantics.commonbehavior.GetNextEventStrategy;
import fuml.semantics.commonbehavior.ObjectActivation;

public class LIFOGetNextEventStrategy extends GetNextEventStrategy {

	@Override
    public EventOccurrence getNextEvent(ObjectActivation objectActivation)
    {
        // Get the last event from the given event pool. The event is removed
        // from the pool.

        EventOccurrence eventOccurrence = objectActivation.eventPool.getValue(objectActivation.eventPool.size() - 1);
        objectActivation.eventPool.remove(objectActivation.eventPool.size() - 1);
        return eventOccurrence;
    } // getNextEvent
} // LIFOGetNextEventStrategy
