package fuml.extensions.structuredclassifiers;

import fuml.semantics.structuredclassifiers.RedefinitionBasedDispatchStrategy;
import uml.classification.Classifier;
import uml.classification.Operation;
import uml.classification.Parameter;
import uml.classification.ParameterDirectionKind;
import uml.classification.ParameterList;
import uml.commonstructure.MultiplicityElement;

public class UMLConformingDispatchStrategy extends RedefinitionBasedDispatchStrategy{

	@Override
    public boolean operationsMatch(
    Operation ownedOperation,
    Operation baseOperation)
    {
        // Check if the owned operation is equal to or overrides the base operation.
        // In this context, an owned operation overrides a base operation if:
        //  - base operation is directly or indirectly redefined by owned operation
        //  - the class that owns base operation is equal to or a base class of the class that owns owned operation
        //  - they have the same number of owned parameters and for each parameter the following holds:
        //      - direction, ordering and uniqueness are the same
        //      - the corresponding types are covariant, contravariant or invariant
        //      - the multiplicities are compatible depending on the parameter direction

        boolean matches = super.operationsMatch(ownedOperation, baseOperation);
        if (matches)
        {
            matches = isConsistentWith(ownedOperation, baseOperation);
        }

        return matches;
    } // operationsMatch

    public boolean isConsistentWith(
    Operation ownedOperation,
    Operation baseOperation)
    {
        boolean isConsistentWith;

        isConsistentWith = this.conformsTo(ownedOperation.class_, baseOperation.class_);

        ParameterList ownedOperationParameters = ownedOperation.ownedParameter;
        ParameterList baseOperationParameters = baseOperation.ownedParameter;

        isConsistentWith = isConsistentWith && (baseOperationParameters.size() == ownedOperationParameters.size());

        for (int i = 0; isConsistentWith == true && i < ownedOperationParameters.size(); i++)
        {
            Parameter redefiningParameter = ownedOperationParameters.getValue(i);
            Parameter redefinedParameter = baseOperationParameters.getValue(i);

            isConsistentWith = isConsistentWith && (redefiningParameter.multiplicityElement.isUnique == redefinedParameter.multiplicityElement.isUnique);
            isConsistentWith = isConsistentWith && (redefiningParameter.multiplicityElement.isOrdered == redefinedParameter.multiplicityElement.isOrdered);
            isConsistentWith = isConsistentWith && (redefiningParameter.direction == redefinedParameter.direction);

            Classifier redefiningParameterType = (Classifier)redefiningParameter.type;
            Classifier redefinedParameterType = (Classifier)redefinedParameter.type;
            isConsistentWith = isConsistentWith && (conformsTo(redefiningParameterType, redefinedParameterType) || conformsTo(redefinedParameterType, redefiningParameterType));

            if (redefinedParameter.direction == ParameterDirectionKind.inout)
            {
                isConsistentWith = isConsistentWith &&
                                    (
                                        compatibleWith(redefiningParameter.multiplicityElement, redefinedParameter.multiplicityElement) &&
                                        compatibleWith(redefinedParameter.multiplicityElement, redefiningParameter.multiplicityElement)
                                    );
            }
            else if (redefinedParameter.direction == ParameterDirectionKind.in)
            {
                isConsistentWith = isConsistentWith && compatibleWith(redefinedParameter.multiplicityElement, redefiningParameter.multiplicityElement);
            }
            else // i.e. if((redefinedParameter.direction == ParameterDirectionKind.out_) || (redefinedParameter.direction == ParameterDirectionKind.return_))
            {
                isConsistentWith = isConsistentWith && compatibleWith(redefiningParameter.multiplicityElement, redefinedParameter.multiplicityElement);
            }
        }

        return isConsistentWith;
    }

    public boolean conformsTo(Classifier type, Classifier otherType)
    {
        boolean conformsTo = false;

        if (type == otherType)
        {
            conformsTo = true;
        }
        else
        {
            int i = 1;
            while (conformsTo == false && i <= type.general().size())
            {
                Classifier general = type.general().getValue(i - 1);
                conformsTo = conformsTo(general, otherType);
                i++;
            }
        }

        return conformsTo;
    }

    public boolean compatibleWith(MultiplicityElement self, MultiplicityElement other)
    {
        boolean compatibleWith = (other.lower <= self.lower) && ((other.upper.naturalValue == -1) || (self.upper.naturalValue <= other.upper.naturalValue));

        return compatibleWith;
    }
} // UMLConformingDispatchStrategy
