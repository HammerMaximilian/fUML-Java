
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

package uml.packages;

import uml.commonstructure.ElementImport;
import uml.commonstructure.NamedElement;
import uml.commonstructure.NamedElementList;
import uml.commonstructure.PackageImport;
import uml.commonstructure.PackageableElement;
import uml.commonstructure.PackageableElementList;
import uml.commonstructure.Type;
import uml.commonstructure.VisibilityKind;

public class Package extends uml.commonstructure.Namespace {

	public uml.commonstructure.PackageableElementList packagedElement = new uml.commonstructure.PackageableElementList();
	public uml.commonstructure.TypeList ownedType = new uml.commonstructure.TypeList();
	public uml.packages.PackageList nestedPackage = new uml.packages.PackageList();
	public uml.packages.Package nestingPackage = null;
	public String URI = "";

	public void addPackagedElement(
			uml.commonstructure.PackageableElement packagedElement) {
		super.addOwnedMember(packagedElement);
		this.packagedElement.addValue(packagedElement);

		if (packagedElement instanceof Type) {
			this.ownedType.addValue((Type) packagedElement);
			((Type) packagedElement)._setPackage(this);
		}

		if (packagedElement instanceof Package) {
			this.nestedPackage.addValue((Package) packagedElement);
			((Package) packagedElement).nestingPackage = this;
		}

	} // addPackagedElement

	public uml.commonstructure.PackageableElementList visibleMembers() {
		PackageableElementList visibleMembers = new PackageableElementList();

		for (int i = 0; i < this.packagedElement.size(); i++) {
			PackageableElement member = this.packagedElement.getValue(i);
			if (this.makesVisible(member)) {
				visibleMembers.addValue(member);
			}
		}

		return visibleMembers;
	} // visibleMembers

	public boolean makesVisible(uml.commonstructure.NamedElement el) {
		for (int i = 0; i < this.ownedMember.size(); i++) {
			NamedElement member = this.ownedMember.getValue(i);
			if (member == el) {
				return member.visibility == null
						|| member.visibility == VisibilityKind.public_;
			}
		}

		for (int i = 0; i < this.elementImport.size(); i++) {
			ElementImport elementImport = this.elementImport.getValue(i);
			if (elementImport.importedElement == el) {
				return true;
			}
		}

		for (int i = 0; i < this.packageImport.size(); i++) {
			PackageImport packageImport = this.packageImport.getValue(i);
			if (packageImport.visibility == VisibilityKind.public_) {
				// NOTE: This won't work unless the imported package members
				// have already been loaded
				NamedElementList packageMembers = packageImport.importedPackage.member;
				for (int j = 0; j < packageMembers.size(); j++) {
					if (packageMembers.getValue(j) == el) {
						return true;
					}
				}
			}
		}

		return false;
	} // makesVisible

	public void setURI(String URI) {
		this.URI = URI;
	} // setURI

} // Package
