package pscs.semantics.structuredclassifiers;

import fuml.semantics.actions.SendSignalActionActivation;
import fuml.semantics.loci.SemanticVisitor;
import fuml.semantics.structuredclassifiers.Reference;
import fuml.semantics.structuredclassifiers.ReferenceList;

public class CS_DefaultRequestPropagationStrategy extends CS_RequestPropagationStrategy {

	@Override
    public ReferenceList select(ReferenceList potentialTargets, SemanticVisitor context)
    {
        // returns all potential targets in the case where the context is a SendSignalActionActivation
        // returns the first potential target in the case where the context is anything else
        ReferenceList selectedTargets = new ReferenceList();
        if (context instanceof SendSignalActionActivation)
        {
            for (Reference potentialTarget : potentialTargets)
            {
                selectedTargets.add(potentialTarget);
            }
        }
        else
        {
            if (potentialTargets.size() >= 1)
            {
                selectedTargets.add(potentialTargets.get(0));
            }
        }
        return selectedTargets;
    }
} // CS_DefaultRequestPropagationStrategy
