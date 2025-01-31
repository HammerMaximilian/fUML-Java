
/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * Modifications:
 * Copyright 2009-2012 Data Access Technologies, Inc.
 * Copyright 2020 Model Driven Solutions, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package uml.classification;

public abstract class BehavioralFeature extends
		uml.classification.Feature {

	public uml.classification.ParameterList ownedParameter = new uml.classification.ParameterList();
	public boolean isAbstract = false;
	public uml.commonbehavior.BehaviorList method = new uml.commonbehavior.BehaviorList();
	public uml.commonbehavior.CallConcurrencyKind concurrency = uml.commonbehavior.CallConcurrencyKind.sequential;
	public uml.commonstructure.TypeList raisedException = new uml.commonstructure.TypeList();

	public void setIsAbstract(boolean isAbstract) {
		this.isAbstract = isAbstract;
	} // setIsAbstract

	public void addOwnedParameter(
			uml.classification.Parameter ownedParameter) {
		// this.addOwnedMember(ownedParameter); [Note: BehavioralFeature is not
		// a Namespace in fUML, to avoid multiple inheritance.]

		this.ownedParameter.addValue(ownedParameter);
	} // addOwnedParameter

	public void addMethod(
			uml.commonbehavior.Behavior method) {
		method._setSpecification(this);
		this.method.addValue(method);
	} // addMethod

	public void addRaisedException(uml.commonstructure.Type raisedException) {
		this.raisedException.addValue(raisedException);
	} // addRaisedException

} // BehavioralFeature
