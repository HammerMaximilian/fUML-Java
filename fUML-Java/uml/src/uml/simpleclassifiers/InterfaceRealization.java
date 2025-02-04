package uml.simpleclassifiers;

import uml.commonbehavior.BehavioredClassifier;
import uml.commonstructure.Realization;

public class InterfaceRealization extends Realization // PSCS-specific
{
    public Interface contract = null;
    public BehavioredClassifier implementingClassifier = null;

    public void setContract(Interface contract)
    { 
        this.contract = contract;
        addSupplier(contract);
    }

    public void _setImplementingClassifier(BehavioredClassifier implementingClassifier)
    {
        this.implementingClassifier = implementingClassifier;
    }
} // InterfaceRealization
