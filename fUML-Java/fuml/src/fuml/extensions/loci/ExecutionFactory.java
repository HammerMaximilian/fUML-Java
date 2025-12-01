package fuml.extensions.loci;

import fuml.extensions.actions.AddVariableValueActionActivation;
import fuml.extensions.actions.ClearVariableActionActivation;
import fuml.extensions.actions.ReadVariableActionActivation;
import fuml.extensions.actions.RemoveVariableValueActionActivation;
import fuml.semantics.loci.SemanticVisitor;
import uml.actions.AddVariableValueAction;
import uml.actions.ClearVariableAction;
import uml.actions.ReadVariableAction;
import uml.actions.RemoveVariableValueAction;
import uml.actions.StructuredActivityNode;
import uml.activities.Activity;

public class ExecutionFactory extends 
		fuml.semantics.loci.ExecutionFactory {

	@Override
	public fuml.semantics.loci.SemanticVisitor instantiateVisitor(
			uml.commonstructure.Element element) {
		// Extends fUML semantics in the sense that newly introduced
		// semantic visitors are instantiated instead of fUML visitors.
		
		SemanticVisitor visitor = null;
		
		if(element instanceof Activity)
		{
			visitor = new fuml.extensions.activities.ActivityExecution();
		}
		
		// Note: Currently, ConditionalNodeActivation and LoopNodeActivation
		// are made subclasses of extension class 'fuml.extensions.actions.StructuredActivityNodeActivation'.
		// Therefore they can safely be instantiated by the original ExecutionFactory class 'fuml.semantics.loci.ExecutionFactory'
		else if (element instanceof StructuredActivityNode) 
		{
			visitor = new fuml.extensions.actions.StructuredActivityNodeActivation();
		}
		
		else if(element instanceof AddVariableValueAction)
		{
			visitor = new AddVariableValueActionActivation();
		}
		else if(element instanceof ClearVariableAction)
		{
			visitor = new ClearVariableActionActivation();
		}
		else if(element instanceof ReadVariableAction)
		{
			visitor = new ReadVariableActionActivation();
		}
		else if(element instanceof RemoveVariableValueAction)
		{
			visitor = new RemoveVariableValueActionActivation();
		}
		else
		{
			visitor = super.instantiateVisitor(element);
		}
		return visitor;
	}
	
} // ExecutionFactory
