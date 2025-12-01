package uml.activities;

public class Variable extends 
		uml.commonstructure.ConnectableElement {

	public uml.commonstructure.MultiplicityElement multiplicityElement = new uml.commonstructure.MultiplicityElement();
	
	public uml.activities.Activity activityScope = null;
	public uml.actions.StructuredActivityNode scope = null;
	
	public void _setActivityScope(
			uml.activities.Activity activityScope) {
		this.activityScope = activityScope;
	} // _setActivityScope

	public void _setScope(
			uml.actions.StructuredActivityNode scope) {
		this.scope = scope;
	} // _setScope
	
} // Variable
