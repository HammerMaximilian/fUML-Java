
/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * All modifications copyright 2009-2012 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package uml.classification;

import UMLPrimitiveTypes.*;
import uml.simpleclassifiers.Interface;

public class Operation extends uml.classification.BehavioralFeature {

	private boolean typeConstructed = false;
	
	public boolean isQuery = false;
	public boolean isOrdered = false;
	public boolean isUnique = true;
	public int lower = 0;
	public UnlimitedNatural upper = null;
	public uml.structuredclassifiers.Class_ class_ = null;
	public uml.classification.OperationList redefinedOperation = new uml.classification.OperationList();
	protected uml.commonstructure.Type type = null;
	public uml.classification.ParameterList ownedParameter = new uml.classification.ParameterList();
	public Interface interface_ = null; // PSCS-specific
	
	public void setIsQuery(boolean isQuery) {
		this.isQuery = isQuery;
	} // setIsQuery

	public void addOwnedParameter(
			uml.classification.Parameter ownedParameter) {
		super.addOwnedParameter(ownedParameter);
		this.ownedParameter.addValue(ownedParameter);
		ownedParameter._setOperation(this);

		if (ownedParameter.direction == ParameterDirectionKind.return_) {
			this.isOrdered = ownedParameter.multiplicityElement.isOrdered;
			this.isUnique = ownedParameter.multiplicityElement.isUnique;
			this.lower = ownedParameter.multiplicityElement.lower;
			this.upper = ownedParameter.multiplicityElement.upper;
			this.type = ownedParameter.type;
		}
	} // addOwnedParameter

	public void addRedefinedOperation(
			uml.classification.Operation redefinedOperation) {
		super.addRedefinedElement(redefinedOperation);
		this.redefinedOperation.addValue(redefinedOperation);
	} // addRedefinedOperation

	public void addMethod(
			uml.commonbehavior.Behavior method) {
		// Note: To have a method, an operation must be owned by a class. The
		// method must be an owned behavior of the class.

		this.method.addValue(method);
		method._setSpecification(this);

	} // addMethod

	public void _setClass(uml.structuredclassifiers.Class_ class_) {
		this.class_ = class_;
		_setNamespace(class_);
	} // _setClass

    public void _setInterface(Interface interface_) // PSCS-specific
    {
        this.interface_ = interface_;
        _setNamespace(interface_);
    }
    
    // When using the generator to create an executable model within this implementation
    // the order in which operations and their parameters are initialized is arbitrary.
    // This can lead to operations having no type, because the return parameter was
    // not yet initialized when it was added to ownedParameter.
    // Because of that, in this implementation, "Operation.type" is encapsulated.
    // Instead, method "Operation::type()" should be used, which will iterate over all owned parameters
    // the first time it is called and determine the Operation's type (if existing).
    // This first invocation happens during model execution, i.e. after all model elements have been completely created.
    public uml.commonstructure.Type type()
    {
    	if(!typeConstructed)
    	{
    		if(type == null)
    		{
    			for(Parameter parameter : ownedParameter)
    			{
    				if(parameter.direction == ParameterDirectionKind.return_)
    				{
    					this.type = parameter.type;
    				}
    			}
    		}
    		
    		typeConstructed = true;
    	}
    	return type;
    }
	
} // Operation
