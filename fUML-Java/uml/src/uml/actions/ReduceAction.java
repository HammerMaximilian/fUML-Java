
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

package uml.actions;

public class ReduceAction extends uml.actions.Action {

	public uml.commonbehavior.Behavior reducer = null;
	public uml.actions.OutputPin result = null;
	public uml.actions.InputPin collection = null;
	public boolean isOrdered = false;

	public void setIsOrdered(boolean isOrdered) {
		this.isOrdered = isOrdered;
	} // setIsOrdered

	public void setReducer(
			uml.commonbehavior.Behavior reducer) {
		this.reducer = reducer;
	} // setReducer

	public void setCollection(
			uml.actions.InputPin collection) {
		super.addInput(collection);
		this.collection = collection;
	} // setCollection

	public void setResult(uml.actions.OutputPin result) {
		super.addOutput(result);
		this.result = result;
	} // setResult

} // ReduceAction
