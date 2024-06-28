
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

package uml.commonstructure;

public class PackageImport extends uml.commonstructure.Element {

	public uml.commonstructure.VisibilityKind visibility = null;
	public uml.commonstructure.Namespace importingNamespace = null;
	public uml.packages.Package importedPackage = null;

	public void setVisibility(
			uml.commonstructure.VisibilityKind visibility) {
		this.visibility = visibility;
	} // setVisibility

	public void setImportedPackage(
			uml.packages.Package importedPackage) {
		this.importedPackage = importedPackage;
	} // setImportedPackage

	public void _setImportingNamespace(
			uml.commonstructure.Namespace importingNamespace) {
		this.importingNamespace = importingNamespace;
	} // _setImportingNamespace

} // PackageImport
