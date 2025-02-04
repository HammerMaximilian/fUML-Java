package pscs.semantics.structuredclassifiers;

import fuml.semantics.loci.SemanticStrategy;
import fuml.semantics.loci.SemanticVisitor;
import fuml.semantics.structuredclassifiers.ReferenceList;

public abstract class CS_RequestPropagationStrategy extends SemanticStrategy {

	@Override
    public String getName()
    {
        // a CS_RequestPropagationStrategy are always named "requestPropagation"
        return "requestPropagation";
    }

    public abstract ReferenceList select(ReferenceList potentialTargets, SemanticVisitor context);
} // CS_RequestPropagationStrategy
