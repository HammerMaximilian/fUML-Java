/*
 * Copyright 2019 Model Driven Solutions, Inc. 
 * 
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 */

package uml.actions;

public class UnmarshallAction extends Action {
	
	public uml.actions.InputPin object = null;
	public uml.actions.OutputPinList result = new uml.actions.OutputPinList();
	public uml.classification.Classifier unmarshallType = null;
	
	public void setObject(uml.actions.InputPin object) {
		super.addInput(object);
		this.object = object;
	}
	
	public void addResult(uml.actions.OutputPin result) {
		super.addOutput(result);
		this.result.addValue(result);
	}

	public void setUnmarshallType(uml.classification.Classifier unmarshallType) {
		this.unmarshallType = unmarshallType;
	}

}
