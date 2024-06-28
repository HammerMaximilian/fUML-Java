
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

public abstract class Element
{

	public uml.commonstructure.ElementList ownedElement = new uml.commonstructure.ElementList();
	public uml.commonstructure.Element owner = null;
	public uml.commonstructure.CommentList ownedComment = new uml.commonstructure.CommentList();

	protected void addOwnedElement(
			uml.commonstructure.Element ownedElement) {
		this.ownedElement.add(ownedElement);
		ownedElement.owner = this;

	} // addOwnedElement

} // Element
