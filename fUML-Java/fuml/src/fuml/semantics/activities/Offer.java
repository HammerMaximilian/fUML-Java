
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

package fuml.semantics.activities;

public class Offer {

	public fuml.semantics.activities.TokenList offeredTokens = new fuml.semantics.activities.TokenList();

	public int countOfferedValues() {
		// Return the number of values being offered on object tokens.
		// Remove any tokens that have already been withdrawn and don't include
		// them in the count.

		this.removeWithdrawnTokens();

		int count = 0;
		for (int i = 0; i < this.offeredTokens.size(); i++) {
			if (this.offeredTokens.getValue(i).getValue() != null) {
				count = count + 1;
			}
		}

		return count;
	} // countOfferedValues

	public fuml.semantics.activities.TokenList getOfferedTokens() {
		// Get the offered tokens, removing any that have been withdrawn.

		this.removeWithdrawnTokens();

		TokenList tokens = new TokenList();
		TokenList offeredTokens = this.offeredTokens;
		for (int i = 0; i < this.offeredTokens.size(); i++) {
			Token offeredToken = offeredTokens.getValue(i);
			// Debug.println("[getOfferedTokens] token value = " +
			// offeredToken.getValue());
			tokens.addValue(offeredToken);
		}

		return tokens;

	} // getOfferedTokens

	public void removeOfferedValues(int count) {
		// Remove the given number of non-null object tokens from those in this
		// offer.

		int n = count;
		int i = 1;
		while (n > 0) {
			if (this.offeredTokens.getValue(i - 1).getValue() != null) {
				this.offeredTokens.removeValue(i - 1);
			} else {
				i = i + 1;
			}
			n = n - 1;
		}
	} // removeOfferedValues

	public void removeWithdrawnTokens() {
		// Remove any tokens that have already been consumed.

		TokenList offeredTokens = this.offeredTokens;
		int i = 1;
		while (i <= this.offeredTokens.size()) {
			if (this.offeredTokens.getValue(i - 1).isWithdrawn()) {
				this.offeredTokens.remove(i - 1);
				i = i - 1;
			}
			i = i + 1;
		}
	} // removeWithdrawnTokens

	public boolean hasTokens() {
		// Check whether this offer has any tokens that have not been withdrawn.

		this.removeWithdrawnTokens();
		return this.offeredTokens.size() > 0;
	} // hasTokens

} // Offer
