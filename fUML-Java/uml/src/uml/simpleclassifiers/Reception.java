
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

package uml.simpleclassifiers;

public class Reception extends uml.classification.BehavioralFeature {

	public uml.simpleclassifiers.Signal signal = null;

	public void setSignal(
			uml.simpleclassifiers.Signal signal) {
		this.signal = signal;
	} // setSignal

} // Reception
