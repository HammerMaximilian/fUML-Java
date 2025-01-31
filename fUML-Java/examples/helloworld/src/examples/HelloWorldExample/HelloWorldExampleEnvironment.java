package examples.HelloWorldExample;

import utils.environmentfuml.Environment;

public class HelloWorldExampleEnvironment extends Environment {

    private static HelloWorldExampleEnvironment instance;

    public static HelloWorldExampleEnvironment instance()
    {
        if(instance == null)
        {
            instance = new HelloWorldExampleEnvironment();
            instance.inMemoryModel = HelloWorldExampleModel.instance();
        }

        return instance;
    }

    @Override
    public void execute(String behaviorName)
    {
        /*
         * Initialize context object and input parameter values here if desired.
         */
        //context = ...;
        //inputs = ...;

        /*
         * Create custom opaque behavior execution instances and add them to the execution environment here if desired.
         */

        /*
         * Start execution via base class call
         */
        super.execute(behaviorName);

        /*
         * Evaluate output parameter values here if desired.
         */
        //List<ParameterValue> theOutputs = outputs;
        //...
    }
} // HelloWorldExampleEnvironment
