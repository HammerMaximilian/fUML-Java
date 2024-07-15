package fuml.extensions.loci;

import fuml.semantics.loci.ChoiceStrategy;

public class LastChoiceStrategy extends ChoiceStrategy {

	@Override
    public int choose(int size)
    {
        // Always choose size.

        return size;
    } // choose
} // LastChoiceStrategy
