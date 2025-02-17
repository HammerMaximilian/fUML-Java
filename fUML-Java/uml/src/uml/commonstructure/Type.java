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

public  abstract class Type extends uml.commonstructure.Namespace    {
    
  public   uml.packages.Package package_ =  null;
  
  public void _setPackage(uml.packages.Package package_) {
	  this.package_ = package_;
  }
    
} //Type
