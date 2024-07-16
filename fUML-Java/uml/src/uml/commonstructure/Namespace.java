/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * All modifications copyright 2009-2012 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 *
 * Contributors:
 *   MDS - initial API and implementation
 *
 */

package uml.commonstructure;

public abstract class Namespace extends
		uml.commonstructure.PackageableElement {

	// Property "member" is encapsulated here an can be accessed via method "member()"
	// See Classifier.java for further information
	protected uml.commonstructure.NamedElementList member = new uml.commonstructure.NamedElementList();
	
	public uml.commonstructure.NamedElementList ownedMember = new uml.commonstructure.NamedElementList();
	public uml.commonstructure.ElementImportList elementImport = new uml.commonstructure.ElementImportList();
	public uml.commonstructure.PackageImportList packageImport = new uml.commonstructure.PackageImportList();
	public uml.commonstructure.PackageableElementList importedMember = new uml.commonstructure.PackageableElementList();

	protected void addOwnedMember(
			uml.commonstructure.NamedElement ownedMember) {
		this.addOwnedElement(ownedMember);

		this.ownedMember.addValue(ownedMember);
		ownedMember.namespace = this;

		this.addMember(ownedMember);
	} // addOwnedMember

	protected void addMember(uml.commonstructure.NamedElement member) {
		// Note: This operation should not be used for owned members. The
		// operation addOwnedMember should be used instead.

		// Debug.println("[addMember] member is a " +
		// member.getClass().getName() + "; name = " + member.name);

		this.member.addValue(member);

	} // addMember

	public void addElementImport(
			uml.commonstructure.ElementImport elementImport) {
		this.addOwnedElement(elementImport);

		this.elementImport.addValue(elementImport);
		elementImport.importingNamespace = this;

		this.addImportedMember(elementImport.importedElement);
	} // addElementImport

	public void addPackageImport(
			uml.commonstructure.PackageImport packageImport) {
		this.addOwnedElement(packageImport);

		this.packageImport.addValue(packageImport);
		packageImport.importingNamespace = this;

		PackageableElementList importedElements = packageImport.importedPackage
				.visibleMembers();
		for (int i = 0; i < importedElements.size(); i++) {
			PackageableElement importedElement = importedElements.getValue(i);
			this.addImportedMember(importedElement);
		}
	} // addPackageImport

	private void addImportedMember(
			uml.commonstructure.PackageableElement importedMember) {
		this.addMember(importedMember);
		this.importedMember.addValue(importedMember);
	} // addImportedMember

    public NamedElementList member()
    {
        return member;
    }
} // Namespace
