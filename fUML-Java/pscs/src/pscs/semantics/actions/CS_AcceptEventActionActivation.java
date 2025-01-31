package pscs.semantics.actions;

import fuml.semantics.actions.AcceptCallActionActivation;
import fuml.semantics.commonbehavior.EventOccurrence;
import pscs.semantics.commonbehavior.CS_EventOccurrence;

public class CS_AcceptEventActionActivation extends AcceptCallActionActivation {

	@Override
    public void accept(EventOccurrence eventOccurrence)
    {
        // If the accepted event occurrence is a CS_EventOccurrence then the wrapped
        // event occurrence is extracted. The acceptance process is the one define
        // by AcceptEventActionActivation defined in fUML.
        if (eventOccurrence instanceof CS_EventOccurrence cS_EventOccurrence)
        {
            super.accept(cS_EventOccurrence.wrappedEventOccurrence);
        }
        else
        {
            super.accept(eventOccurrence);
        }
    }
} // CS_AcceptEventActionActivation
