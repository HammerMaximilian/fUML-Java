package pscs.semantics.structuredclassifiers;

import fuml.semantics.commonbehavior.EventOccurrence;
import fuml.semantics.commonbehavior.Execution;
import fuml.semantics.commonbehavior.ParameterValueList;
import fuml.semantics.structuredclassifiers.Reference;
import fuml.semantics.values.Value;
import pscs.semantics.commonbehavior.CS_EventOccurrence;
import uml.classification.Classifier;
import uml.classification.Operation;
import uml.classification.ParameterList;
import uml.structuredclassifiers.Class_;
import uml.structuredclassifiers.Port;

public class CS_InteractionPoint extends Reference {

	public CS_Reference owner = null;
	public Port definingPort = null;
	
	@Override
    public void startBehavior(Class_ classifier, ParameterValueList inputs)
    {
        // Overridden to do nothing
    }

	@Override
    public Execution dispatch(Operation operation)
    {
        // Delegates dispatching to the owning object
        return owner.dispatchIn(operation, this);
    }

	@Override
    public void send(EventOccurrence eventOccurrence)
    {
        // An event occurrence that passes through a CS_InteractionPoint is
        // (if necessary) wrapped in a CS_EventOccurrence. This event occurrence
        // is then sent to the owning object.
        CS_EventOccurrence wrappingEventOccurrence;
        if (eventOccurrence instanceof CS_EventOccurrence)
        {
            wrappingEventOccurrence = (CS_EventOccurrence)eventOccurrence;
        }
        else
        {
            wrappingEventOccurrence = new CS_EventOccurrence();
            wrappingEventOccurrence.wrappedEventOccurrence = eventOccurrence;
        }
        wrappingEventOccurrence.interactionPoint = this;
        owner.sendIn(wrappingEventOccurrence, this);
    }

	@Override
    public Value copy()
    {
        // Create a new interaction point with the same referent as this interaction
        // point.
        CS_InteractionPoint newValue = (CS_InteractionPoint)super.copy();
        newValue.referent = referent;
        return newValue;
    }

	@Override
    protected Value new_()
    {
        return new CS_InteractionPoint();
    }

	@Override
    public boolean checkAllParents(Classifier type, Classifier classifier)
    {
        // Delegates the type checking to the reference
        return referent.checkAllParents(type, classifier);
    }
} // CS_InteractionPoint
