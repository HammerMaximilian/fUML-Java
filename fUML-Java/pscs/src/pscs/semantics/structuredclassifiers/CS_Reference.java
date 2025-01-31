package pscs.semantics.structuredclassifiers;

import fuml.semantics.commonbehavior.EventOccurrence;
import fuml.semantics.commonbehavior.Execution;
import fuml.semantics.structuredclassifiers.Reference;
import fuml.semantics.values.Value;
import uml.classification.Operation;
import uml.structuredclassifiers.Port;

public class CS_Reference extends Reference {

    /*
     * The composite object referenced by this ReferenceToCompositeStructure. This
     * property subsets Reference::referent.
     */
    public CS_Object compositeReferent = null;

    public Execution dispatchIn(Operation operation, CS_InteractionPoint interactionPoint)
    {
        // Delegates dispatching to composite referent
        return compositeReferent.dispatchIn(operation, interactionPoint);
    }

    public void sendIn(EventOccurrence eventOccurrence, CS_InteractionPoint interactionPoint)
    {
        // delegates sending to composite referent
        compositeReferent.sendIn(eventOccurrence, interactionPoint);
    }

    public void sendOut(EventOccurrence eventOccurrence, Port onPort)
    {
        // delegates sending to composite referent
        compositeReferent.sendOut(eventOccurrence, onPort);
    }

    public Execution dispatchOut(Operation operation, Port onPort)
    {
        // delegates dispatching to composite referent
        return compositeReferent.dispatchOut(operation, onPort);
    }

    public Execution dispatchIn(Operation operation, Port onPort)
    {
        // delegates dispatching to composite referent
        return compositeReferent.dispatchIn(operation, onPort);
    }

    public void sendIn(EventOccurrence eventOccurrence, Port onPort)
    {
        // delegates sending to composite referent
        compositeReferent.sendIn(eventOccurrence, onPort);
    }

    public Execution dispatchOut(Operation operation, CS_InteractionPoint interactionPoint)
    {
        // Delegates dispatching (through the interaction point, to the environment)
        // to compositeReferent
        return compositeReferent.dispatchOut(operation, interactionPoint);
    }

    public void sendOut(EventOccurrence eventOccurrence, CS_InteractionPoint interactionPoint)
    {
        // Delegates sending (through the interaction point, to the environment)
        // to compositeReferent
        compositeReferent.sendOut(eventOccurrence, interactionPoint);
    }

    @Override
    public Value copy()
    {
        // Create a new reference with the same referent and composite referent as this
        // reference.
        CS_Reference newValue = new CS_Reference();
        newValue.referent = referent;
        newValue.compositeReferent = compositeReferent;
        return newValue;
    }
} // CS_Reference
