package pscs.semantics.actions;

import fuml.semantics.loci.SemanticStrategy;
import fuml.semantics.structuredclassifiers.Object_;
import pscs.semantics.structuredclassifiers.CS_Object;
import uml.classification.Operation;

public abstract class CS_ConstructStrategy extends SemanticStrategy {

	@Override
    public String getName()
    {
        // a CS_ConstructionStrategy is always named "constructStrategy"
        return "constructStrategy";
    }

    public abstract Object_ construct(Operation constructor, CS_Object context);

} // CS_ConstructStrategy
