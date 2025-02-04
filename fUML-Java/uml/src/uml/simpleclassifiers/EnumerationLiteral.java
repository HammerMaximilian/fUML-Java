
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

public class EnumerationLiteral extends
		uml.classification.InstanceSpecification {

	public uml.simpleclassifiers.Enumeration enumeration = null;
	public uml.simpleclassifiers.Enumeration classifier = null;

	public void _setEnumeration(
			uml.simpleclassifiers.Enumeration enumeration) {
		this.classifier = enumeration;
		this.enumeration = enumeration;
	} // _setEnumeration

} // EnumerationLiteral
