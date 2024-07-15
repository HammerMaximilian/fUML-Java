package fuml.extensions.loci;

import java.util.Random;

import fuml.semantics.loci.ChoiceStrategy;

public class RandomChoiceStrategy extends ChoiceStrategy {

    private static Random random = new Random();
    
    @Override
    public int choose(int size)
    {
        // Randomely choose a value between 1 and size.

        return random.nextInt(1, size + 1);
    } // choose
} // RandomChoiceStrategy
