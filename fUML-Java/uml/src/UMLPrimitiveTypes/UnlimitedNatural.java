
/*
 * Initial version copyright 2008 Lockheed Martin Corporation, except  
 * as stated in the file entitled Licensing-Information. 
 * 
 * All modifications copyright 2009 Data Access Technologies, Inc.
 *
 * Licensed under the Academic Free License version 3.0 
 * (http://www.opensource.org/licenses/afl-3.0.php), except as stated 
 * in the file entitled Licensing-Information. 
 *
 * Contributors:
 *   MDS - initial API and implementation
 *
 */

package UMLPrimitiveTypes;

public class UnlimitedNatural {

	public int naturalValue = 0;

	/**
	 * operation UnlimitedNatural
	 */
	public UnlimitedNatural(int naturalValue) {
		this.naturalValue = naturalValue;
	} // UnlimitedNatural

	/**
	 * operation UnlimitedNatural
	 */
	public UnlimitedNatural() {
		this.naturalValue = 0;
	} // UnlimitedNatural
	
	@Override
	public boolean equals(Object o)
	{
		if(o == this){
			return true;
		}
		
		if(!(o instanceof UnlimitedNatural)) {
			return false;
		}
		
		UnlimitedNatural uN = (UnlimitedNatural) o;
		
		return naturalValue == uN.naturalValue;
	}
	
	@Override
    public String toString()
    {
        if (naturalValue >= 0) return String.valueOf(naturalValue);
        else return "*";
    }

} // UnlimitedNatural
