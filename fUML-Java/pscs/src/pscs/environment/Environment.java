package pscs.environment;

import fuml.Debug;
import pscs.semantics.actions.CS_DefaultConstructStrategy;
import pscs.semantics.loci.CS_ExecutionFactory;
import pscs.semantics.loci.CS_Executor;
import pscs.semantics.loci.CS_Locus;
import pscs.semantics.structuredclassifiers.CS_DefaultRequestPropagationStrategy;
import pscs.semantics.structuredclassifiers.CS_DispatchOperationOfInterfaceStrategy;
import pscs.semantics.structuredclassifiers.CS_NameBased_StructuralFeatureOfInterfaceAccessStrategy;

public abstract class Environment extends utils.environmentfuml.Environment {
    
	@Override
	protected void initializeLoci()
    {
        locus = new CS_Locus();
        locus.setExecutor(new CS_Executor());
        locus.setFactory(new CS_ExecutionFactory());
    }

	@Override
    protected void initializeLociContents()
    {
        super.initializeLociContents();

        if (locus == null)
        {
            Debug.println("[error] Locus is not set for execution environment");
            throw new NullPointerException();
        }

        locus.factory.setStrategy(new CS_DefaultConstructStrategy());
        locus.factory.setStrategy(new CS_DefaultRequestPropagationStrategy());
        locus.factory.setStrategy(new CS_DispatchOperationOfInterfaceStrategy());
        locus.factory.setStrategy(new CS_NameBased_StructuralFeatureOfInterfaceAccessStrategy());
    }
}
