package pscs.semantics.values;

import fuml.semantics.commonbehavior.ParameterValue;
import fuml.semantics.commonbehavior.ParameterValueList;
import fuml.semantics.values.Evaluation;
import fuml.semantics.values.Value;
import fuml.semantics.values.ValueList;
import uml.commonbehavior.Behavior;
import uml.values.OpaqueExpression;

public class CS_OpaqueExpressionEvaluation extends Evaluation {

	@Override
    public Value evaluate()
    {
        // Execute the behavior associated with the context OpaqueExpression, if any.
        // If multiple return values are computed, then return the first one.
        // If no value are computed, return null
        ValueList evaluation = executeExpressionBehavior();
        if (!evaluation.isEmpty())
        {
            return evaluation.get(0);
        }
        else
        {
            return null;
        }
    }
	
    public ValueList executeExpressionBehavior()
    {
        // If a behavior is associated with the context OpaqueExpression,
        // then execute this behavior, and return computed values.
        // Otherwise, return an empty list of values.
        ValueList evaluation = new ValueList();
        OpaqueExpression expression = (OpaqueExpression)specification;
        Behavior behavior = expression.behavior;
        if (behavior != null)
        {
            ParameterValueList inputs = new ParameterValueList();
            ParameterValueList results = locus.executor.execute(behavior, null, inputs);

            if(results == null) results = new ParameterValueList();

            for (ParameterValue parameterValue : results)
            { // results.size should be 1
                ValueList values = parameterValue.values;
                for (Value value : values)
                {
                    evaluation.add(value);
                }
            }
        }
        return evaluation;
    }
}
