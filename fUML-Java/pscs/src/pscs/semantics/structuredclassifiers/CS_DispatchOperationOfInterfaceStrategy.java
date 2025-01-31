package pscs.semantics.structuredclassifiers;

import fuml.semantics.structuredclassifiers.RedefinitionBasedDispatchStrategy;
import uml.classification.Operation;
import uml.classification.Parameter;
import uml.classification.ParameterList;
import uml.simpleclassifiers.Interface;

public class CS_DispatchOperationOfInterfaceStrategy extends RedefinitionBasedDispatchStrategy {

	@Override
    public boolean operationsMatch(Operation ownedOperation, Operation baseOperation)
    {
        // Override operationsMatch, in the case where baseOperation belongs
        // to an Interface.
        // In this case, ownedOperation matches baseOperation if it has the same name and signature
        // Otherwise, behaves like fUML RedefinitionBasedDispatchStrategy
        boolean matches;
        if (baseOperation.namespace instanceof Interface)
        {
            matches = baseOperation.name.equals(ownedOperation.name);
            matches = matches && (baseOperation.ownedParameter.size() == ownedOperation.ownedParameter.size());
            ParameterList ownedOperationParameters = ownedOperation.ownedParameter;
            ParameterList baseOperationParameters = baseOperation.ownedParameter;
            for (int i = 0; matches == true && i < ownedOperationParameters.size(); i++)
            {
                Parameter ownedParameter = ownedOperationParameters.get(i);
                Parameter baseParameter = baseOperationParameters.get(i);
                matches = ownedParameter.type == baseParameter.type;
                matches = matches && (ownedParameter.multiplicityElement.lower == baseParameter.multiplicityElement.lower);
                matches = matches && (ownedParameter.multiplicityElement.upper == baseParameter.multiplicityElement.upper);
                matches = matches && (ownedParameter.direction == baseParameter.direction);
            }
        }
        else
        {
            matches = super.operationsMatch(ownedOperation, baseOperation);
        }
        return matches;
    }
} // CS_DispatchOperationOfInterfaceStrategy
