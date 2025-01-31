package pscs.semantics.commonbehavior;

import fuml.semantics.commonbehavior.EventOccurrence;
import fuml.semantics.commonbehavior.ParameterValueList;
import pscs.semantics.structuredclassifiers.CS_InteractionPoint;
import pscs.semantics.structuredclassifiers.CS_Reference;
import uml.commonbehavior.Event;
import uml.commonbehavior.Trigger;
import uml.structuredclassifiers.Port;

public class CS_EventOccurrence extends EventOccurrence {

	public EventOccurrence wrappedEventOccurrence = null;
	public CS_InteractionPoint interactionPoint = null;
	public boolean propagationInward;
	public Port onPort = null;
	
	@Override
    public boolean match(Trigger trigger)
    {
        // If the trigger references ports then to match this latter it is required that
        // 1] the interaction point is instance of port referenced by the trigger
        // 2] the referenced event occurrence match operation returns true.
        // If the trigger does not reference ports then the behavior is the same than for fUML.
        boolean matches = false;
        if (!trigger.port.isEmpty())
        {
            int i = 1;
            while (!matches && i <= trigger.port.size())
            {
                if (interactionPoint.definingPort == trigger.port.get(i - 1))
                {
                    matches = true;
                }
                i++;
            }
            if (matches)
            {
                matches = wrappedEventOccurrence.match(trigger);
            }
        }
        else
        {
            matches = wrappedEventOccurrence.match(trigger);
        }
        return matches;
    }

	@Override
    public void doSend()
    {
        // If the specified target is a CS_Reference and the propagation must be done
        // to the environment, then the operation sendOut(EventOccurrence, Port) is called
        // and make the propagation to continue.
        // If the specified target is a CS_Reference but the propagation must be done to
        // the internals then the operation sendIn(EventOccurrence, Port) is called.
        // In the case were the target is not a CS_EventOccurrence then send(EventOccurence)
        // is called.
        if (target instanceof CS_Reference reference)
        {
            if (propagationInward == true)
            {
                reference.sendIn(this, onPort);
            }
            else
            {
                reference.sendOut(this, onPort);
            }
        }
        else
        {
            super.doSend();
        }
    }

    public void sendInTo(CS_Reference target, Port port)
    {
        // Propagate the sending of the event occurrence to the internals
        onPort = port;
        propagationInward = true;
        sendTo(target);
    }

    public void sendOutTo(CS_Reference target, Port port)
    {
        // Propagate the sending of the event occurrence to the environment
        onPort = port;
        propagationInward = false;
        sendTo(target);
    }

    @Override
    public ParameterValueList getParameterValues(Event event_)
    {
        // Return the parametric data of the referenced event occurrence
        return wrappedEventOccurrence.getParameterValues(event_);
    }
} // CS_EventOccurrence
