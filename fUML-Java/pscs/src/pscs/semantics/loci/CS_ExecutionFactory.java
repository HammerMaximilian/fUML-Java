package pscs.semantics.loci;

import fuml.semantics.commonbehavior.CallEventBehavior;
import fuml.semantics.loci.ExecutionFactory;
import fuml.semantics.loci.SemanticVisitor;
import pscs.semantics.actions.CS_AcceptCallActionActivation;
import pscs.semantics.actions.CS_AcceptEventActionActivation;
import pscs.semantics.actions.CS_AddStructuralFeatureValueActionActivation;
import pscs.semantics.actions.CS_CallOperationActionActivation;
import pscs.semantics.actions.CS_ClearStructuralFeatureValueActionActivation;
import pscs.semantics.actions.CS_CreateLinkActionActivation;
import pscs.semantics.actions.CS_CreateObjectActionActivation;
import pscs.semantics.actions.CS_ReadExtentActionActivation;
import pscs.semantics.actions.CS_ReadSelfActionActivation;
import pscs.semantics.actions.CS_RemoveStructuralFeatureValueActionActivation;
import pscs.semantics.actions.CS_SendSignalActionActivation;
import pscs.semantics.classification.CS_InstanceValueEvaluation;
import pscs.semantics.commonbehavior.CS_CallEventExecution;
import pscs.semantics.values.CS_OpaqueExpressionEvaluation;
import uml.actions.AcceptCallAction;
import uml.actions.AcceptEventAction;
import uml.actions.AddStructuralFeatureValueAction;
import uml.actions.CallOperationAction;
import uml.actions.ClearStructuralFeatureAction;
import uml.actions.CreateLinkAction;
import uml.actions.CreateObjectAction;
import uml.actions.ReadExtentAction;
import uml.actions.ReadSelfAction;
import uml.actions.RemoveStructuralFeatureValueAction;
import uml.actions.SendSignalAction;
import uml.classification.InstanceValue;
import uml.commonstructure.Element;
import uml.values.OpaqueExpression;

public class CS_ExecutionFactory extends ExecutionFactory {

	@Override
    public SemanticVisitor instantiateVisitor(Element element)
    {
        // Extends fUML semantics in the sense that newly introduced
        // semantic visitors are instantiated instead of fUML visitors
        SemanticVisitor visitor;
        if (element instanceof ReadExtentAction)
        {
            visitor = new CS_ReadExtentActionActivation();
        }
        else if (element instanceof AcceptCallAction)
        {
            visitor = new CS_AcceptCallActionActivation();
        }
        else if (element instanceof AcceptEventAction)
        {
            visitor = new CS_AcceptEventActionActivation();
        }
        else if (element instanceof AddStructuralFeatureValueAction)
        {
            visitor = new CS_AddStructuralFeatureValueActionActivation();
        }
        else if (element instanceof ClearStructuralFeatureAction)
        {
            visitor = new CS_ClearStructuralFeatureValueActionActivation();
        }
        else if (element instanceof CreateLinkAction)
        {
            visitor = new CS_CreateLinkActionActivation();
        }
        else if (element instanceof CreateObjectAction)
        {
            visitor = new CS_CreateObjectActionActivation();
        }
        else if (element instanceof ReadSelfAction)
        {
            visitor = new CS_ReadSelfActionActivation();
        }
        else if (element instanceof InstanceValue)
        {
            visitor = new CS_InstanceValueEvaluation();
        }
        else if (element instanceof CallOperationAction)
        {
            visitor = new CS_CallOperationActionActivation();
        }
        else if (element instanceof SendSignalAction)
        {
            visitor = new CS_SendSignalActionActivation();
        }
        else if (element instanceof OpaqueExpression)
        {
            visitor = new CS_OpaqueExpressionEvaluation();
        }
        else if (element instanceof CallEventBehavior)
        {
            visitor = new CS_CallEventExecution();
        }
        else if (element instanceof RemoveStructuralFeatureValueAction)
        {
            visitor = new CS_RemoveStructuralFeatureValueActionActivation();
        }
        else
        {
            visitor = super.instantiateVisitor(element);
        }
        return visitor;
    }
} // CS_ExecutionFactory
