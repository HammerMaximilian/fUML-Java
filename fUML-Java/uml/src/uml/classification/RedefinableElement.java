
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

public abstract class RedefinableElement extends
		uml.commonstructure.NamedElement {

	public boolean isLeaf = false;
	public uml.classification.RedefinableElementList redefinedElement = new uml.classification.RedefinableElementList();
	public uml.classification.ClassifierList redefinitionContext = new uml.classification.ClassifierList();

	public void setIsLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	} // setIsLeaf

	protected void addRedefinedElement(
			uml.classification.RedefinableElement redefinedElement) {
		this.redefinedElement.addValue(redefinedElement);
	} // addRedefinedElement

	protected void addRedefinitionContext(
			uml.classification.Classifier redefinitionContext) {
		this.redefinitionContext.addValue(redefinitionContext);
	} // addRedefinitionContext

} // RedefinableElement
