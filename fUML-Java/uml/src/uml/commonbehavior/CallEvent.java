/*
 * Copyright 2017 Data Access Technologies. 
 * 
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package uml.commonbehavior;

import uml.classification.Operation;

public class CallEvent extends Event {
	
	public Operation operation = null;
	
	public void setOperation(Operation operation) {
		this.operation = operation;
	}

}
