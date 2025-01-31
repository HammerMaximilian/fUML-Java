package fuml.extensions.structuredclassifiers;

import fuml.semantics.structuredclassifiers.DispatchStrategy;
import fuml.semantics.structuredclassifiers.Object_;
import uml.classification.Classifier;
import uml.classification.ClassifierList;
import uml.classification.Operation;
import uml.classification.OperationList;
import uml.classification.Parameter;
import uml.classification.ParameterDirectionKind;
import uml.classification.ParameterList;
import uml.commonbehavior.Behavior;
import uml.structuredclassifiers.Class_;

public class SignatureBasedDispatchStrategy extends DispatchStrategy {

	@Override
    public Behavior getMethod(
    Object_ object_,
    Operation operation,
    boolean isExplicitBaseClassCall)
    {
        // Find the member operation of a type of the given object_ that
        // is the same as or overrides the given operation. Then
        // return the method of that operation, if it has one, otherwise
        // return a CallEventBehavior as the effective method for the
        // matching operation.
        // [If there is more than one type with a matching operation, then
        // the first one is arbitrarily chosen.]

        Behavior method = null;
        Class_ operationClass = operation.class_;

        int i = 1;
        while (method == null & i <= object_.types.size())
        {
            Class_ type = object_.types.getValue(i - 1);

            if(isExplicitBaseClassCall)
            {
                // The operation call shall explicitely invoke a base class operation.
                // even if the operation is overriden by type (or a direct or indirect base class of type).
                // This behaves as if object_'s actual type was the type that owns operation,
                // if operationClass is a direct or indirect base class of type.

                if(operationClass != null && isSpecializationOf(type, operationClass))
                {
                    method = getMethod(operationClass, operation);
                }
            }
            else
            {
                method = getMethod(type, operation);
            }
            
            i++;
        }

        return method;
    } // getMethod

    public Behavior getMethod(Class_ type, Operation operation)
    {
        Behavior method = null;
        OperationList ownedOperations = type.ownedOperation;

        // First, check if type owns or overrides the given operation.
        int i = 1;
        while (method == null & i <= ownedOperations.size())
        {
            Operation ownedOperation = ownedOperations.getValue(i - 1);

            if (operationsMatch(ownedOperation, operation))
            {
                if (ownedOperation.method.size() == 0)
                {
                    method = super.getMethod(null, ownedOperation);
                }
                else
                {
                    method = ownedOperation.method.getValue(0);
                }
            }
            i++;
        }

        // If type does not own or override the given operation directly,
        // check all of it's base classes.
        if (method == null)
        {
            ClassifierList general = type.general();

            i = 1;
            while (method == null & i <= general.size())
            {
                if (general.getValue(i - 1) instanceof Class_)
                {
                	Class_ baseClass = (Class_)general.getValue(i - 1);
                    method = getMethod(baseClass, operation);
                }
                i++;
            }
        }

        return method;
    }

    public boolean operationsMatch(
    Operation ownedOperation,
    Operation baseOperation)
    {
        // Check if the owned operation is equal to or overrides the base operation.
        // In this context, an owned operation overrides a base operation
        // if it has the same name and signature.

        boolean matches;
        if (ownedOperation == baseOperation)
        {
            matches = true;
        }
        else
        {
            matches = isSpecializationOf(ownedOperation.class_, baseOperation.class_);
            matches = matches && baseOperation.name.equals(ownedOperation.name);
            matches = matches && (baseOperation.ownedParameter.size() == ownedOperation.ownedParameter.size());
            ParameterList ownedOperationParameters = ownedOperation.ownedParameter;
            ParameterList baseOperationParameters = baseOperation.ownedParameter;
            for (int i = 0; matches == true && i < ownedOperationParameters.size(); i++)
            {
                Parameter ownedParameter = ownedOperationParameters.getValue(i);
                Parameter baseParameter = baseOperationParameters.getValue(i);

                if (ownedParameter.direction == ParameterDirectionKind.return_)
                {
                    // NOTE: In this implementation, return types may be covariant classifiers.
                    if (ownedParameter.type != baseParameter.type)
                    {

                        matches = ownedParameter.type instanceof Classifier ownedOperationReturnType &&
                                baseParameter.type instanceof Classifier baseOperationReturnType &&
                                isSpecializationOf(ownedOperationReturnType, baseOperationReturnType);
                    }
                    else
                    {
                        matches = true;
                    }
                }
                else
                {
                    matches = ownedParameter.type == baseParameter.type;
                }
                matches = matches && (ownedParameter.multiplicityElement.lower == baseParameter.multiplicityElement.lower);
                matches = matches && (ownedParameter.multiplicityElement.upper.equals(baseParameter.multiplicityElement.upper));
                matches = matches && (ownedParameter.direction == baseParameter.direction);
            }
        }

        return matches;
    } // operationsMatch

    public boolean isSpecializationOf(Classifier specializedType, Classifier generalType)
    {
        boolean isSpecialized = false;

        int i = 1;
        while (isSpecialized == false && i <= specializedType.general().size())
        {
            Classifier directBase = specializedType.general().getValue(i - 1);
            isSpecialized = generalType == directBase;

            if (!isSpecialized)
            {
                isSpecialized = isSpecializationOf(directBase, generalType);
            }

            i++;
        }

        return isSpecialized;
    } // IsSpecializationOf
	
} // SignatureBasedDispatchStrategy
