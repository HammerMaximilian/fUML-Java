
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

public class Generalization extends uml.commonstructure.Element {

	public boolean isSubstitutable = true;
	public uml.classification.Classifier specific = null;
	public uml.classification.Classifier general = null;

	public void setIsSubstitutable(boolean isSubstitutable) {
		this.isSubstitutable = isSubstitutable;
	} // setIsSubstitutable

	public void setGeneral(uml.classification.Classifier general) {
		this.general = general;
	} // setGeneral

	public void _setSpecific(uml.classification.Classifier specific) {
		this.specific = specific;
	} // _setSpecific

} // Generalization
