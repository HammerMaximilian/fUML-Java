/*
 * Copyright 2015-2017 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package fuml.semantics.commonbehavior;

import fuml.semantics.structuredclassifiers.Reference;
import uml.commonbehavior.Event;

public abstract class EventOccurrence {
	
	public Reference target = null;
	
	public void sendTo(Reference target) {
		// Set the target reference and start the SendingBehavior, which
		// will send this event occurrence to the target.
		
		this.target = target;
		_startObjectBehavior();
	}
	
	protected void doSend() {
		// Send this event occurrence to the target.
		
		this.target.send(this);
	}
	
	public abstract boolean match(uml.commonbehavior.Trigger trigger);

	public boolean matchAny(uml.commonbehavior.TriggerList triggers) {
		// Check that at least one of the given triggers is matched by this 
		// event occurrence.
		
		boolean matches = false;
		int i = 1;
		while(!matches & i <= triggers.size()) {
			if(this.match(triggers.get(i-1))) {
				matches = true;
			}
			i = i + 1;
		}
		return matches;
		
	}
	
	public abstract fuml.semantics.commonbehavior.ParameterValueList getParameterValues(Event event);
	
	private EventOccurrence_SendingBehaviorExecution behavior = new EventOccurrence_SendingBehaviorExecution(this);

	private void _startObjectBehavior() {
		this.behavior._startObjectBehavior();
	}

}
