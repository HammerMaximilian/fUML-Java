/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * All modifications copyright 2009-2017 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package fuml.semantics.structuredclassifiers;

import fuml.semantics.commonbehavior.CallEventBehavior;

public abstract class DispatchStrategy extends
		fuml.semantics.loci.SemanticStrategy {

	public String getName() {
		// Dispatch strategies are always named "dispatch".

		return "dispatch";
	} // getName

	public fuml.semantics.commonbehavior.Execution dispatch(
			fuml.semantics.structuredclassifiers.Object_ object,
			uml.classification.Operation operation) {
		// Get the behavior for the given operation as determined by the type(s)
		// of the given object, compile the behavior at the locus of the object,
		// and return the resulting execution object.

		return object.locus.factory.createExecution(this.getMethod(object, operation), object);
	} // dispatch

	public uml.commonbehavior.Behavior getMethod(
			fuml.semantics.structuredclassifiers.Object_ object,
			uml.classification.Operation operation) {
		// Get the method that corresponds to the given operation for the given object.
		// By default, the operation is treated as being called via a call event occurrence,
		// with a call even behavior as its effective method. Concrete dispatch strategy
		// subclasses may override this default to provide other dispatching behavior.

		CallEventBehavior method = new CallEventBehavior();
		method.setOperation(operation);
		return method;
	}
	
	public fuml.semantics.commonbehavior.Execution dispatch(
			fuml.semantics.structuredclassifiers.Object_ object_,
			uml.classification.Operation operation,
			boolean isExplicitBaseClassCall)
	{
		// Extends DispatchStrategy.Dispatch(Object_, Operation) by flag "isExplicitBaseClassCall"
		// Propagate "isExplicitBaseClassCall" to DispatchStrategy.GetMethod

		uml.commonbehavior.Behavior method = getMethod(object_, operation, isExplicitBaseClassCall);

		if(method == null)
		{
            String message = "[error] Local variable 'method' was null in fuml.semantics.commonbehavior.Execution dispatch(fuml.semantics.structuredclassifiers.Object_, uml.classification.Operation, boolean)";
            System.out.println(message);
			throw new IllegalStateException(message);
		}

        return object_.locus.factory.createExecution(method, object_);
	} // Dispatch

	public uml.commonbehavior.Behavior getMethod(
			fuml.semantics.structuredclassifiers.Object_ object_,
			uml.classification.Operation operation,
			boolean isExplicitBaseClassCall)
	{
		return getMethod(object_, operation);
	} // GetMethod
	
} // DispatchStrategy
