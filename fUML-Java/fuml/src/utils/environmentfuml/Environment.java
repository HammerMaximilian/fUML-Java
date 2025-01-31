package utils.environmentfuml;

import fuml.Debug;
import fuml.semantics.commonbehavior.FIFOGetNextEventStrategy;
import fuml.semantics.commonbehavior.OpaqueBehaviorExecution;
import fuml.semantics.commonbehavior.ParameterValueList;
import fuml.semantics.loci.ExecutionFactory;
import fuml.semantics.loci.Executor;
import fuml.semantics.loci.FirstChoiceStrategy;
import fuml.semantics.loci.Locus;
import fuml.semantics.structuredclassifiers.ExtensionalValue;
import fuml.semantics.structuredclassifiers.Object_;
import fuml.semantics.structuredclassifiers.RedefinitionBasedDispatchStrategy;
import uml.commonbehavior.Behavior;
import uml.simpleclassifiers.PrimitiveType;
import uml.structuredclassifiers.Class_;
import utils.environment.InMemoryModel;
import utils.library.booleanfunctions.BooleanAndFunctionBehaviorExecution;
import utils.library.booleanfunctions.BooleanImpliesFunctionBehaviorExecution;
import utils.library.booleanfunctions.BooleanNotFunctionBehaviorExecution;
import utils.library.booleanfunctions.BooleanOrFunctionBehaviorExecution;
import utils.library.booleanfunctions.BooleanToBooleanFunctionBehaviorExecution;
import utils.library.booleanfunctions.BooleanToStringFunctionBehaviorExecution;
import utils.library.booleanfunctions.BooleanXorFunctionBehaviorExecution;
import utils.library.channel.StandardInputChannelObject;
import utils.library.channel.StandardOutputChannelObject;
import utils.library.integerfunctions.IntegerAbsFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerDivFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerDivideFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerGreaterThanEqualFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerGreaterThanFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerLessThanEqualFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerLessThanFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerMaxFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerMinFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerMinusFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerModFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerNegateFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerPlusFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerTimesFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerToIntegerFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerToStringFunctionBehaviorExecution;
import utils.library.integerfunctions.IntegerToUnlimitedNaturalFunctionBehaviorExecution;
import utils.library.listfunctions.ListConcatFunctionBehaviorExecution;
import utils.library.listfunctions.ListGetFunctionBehaviorExecution;
import utils.library.listfunctions.ListSizeFunctionBehaviorExecution;
import utils.library.realfunctions.RealAbsFunctionBehaviorExecution;
import utils.library.realfunctions.RealDivideFunctionBehaviorExecution;
import utils.library.realfunctions.RealFloorFunctionBehaviorExecution;
import utils.library.realfunctions.RealGreaterThanEqualFunctionBehaviorExecution;
import utils.library.realfunctions.RealGreaterThanFunctionBehaviorExecution;
import utils.library.realfunctions.RealInverseFunctionBehaviorExecution;
import utils.library.realfunctions.RealLessThanEqualFunctionBehaviorExecution;
import utils.library.realfunctions.RealLessThanFunctionBehaviorExecution;
import utils.library.realfunctions.RealMaxFunctionBehaviorExecution;
import utils.library.realfunctions.RealMinFunctionBehaviorExecution;
import utils.library.realfunctions.RealMinusFunctionBehaviorExecution;
import utils.library.realfunctions.RealNegateFunctionBehaviorExecution;
import utils.library.realfunctions.RealPlusFunctionBehaviorExecution;
import utils.library.realfunctions.RealRoundFunctionBehaviorExecution;
import utils.library.realfunctions.RealTimesFunctionBehaviorExecution;
import utils.library.realfunctions.RealToIntegerFunctionBehaviorExecution;
import utils.library.realfunctions.RealToRealFunctionBehaviorExecution;
import utils.library.realfunctions.RealToStringFunctionBehaviorExecution;
import utils.library.stringfunctions.StringConcatFunctionBehaviorExecution;
import utils.library.stringfunctions.StringSizeFunctionBehaviorExecution;
import utils.library.stringfunctions.StringSubstringFunctionBehaviorExecution;
import utils.library.unlimitednaturalfunctions.UnlimitedNaturalGreaterThanEqualFunctionBehaviorExecution;
import utils.library.unlimitednaturalfunctions.UnlimitedNaturalGreaterThanFunctionBehaviorExecution;
import utils.library.unlimitednaturalfunctions.UnlimitedNaturalLessThanEqualFunctionBehaviorExecution;
import utils.library.unlimitednaturalfunctions.UnlimitedNaturalLessThanFunctionBehaviorExecution;
import utils.library.unlimitednaturalfunctions.UnlimitedNaturalMaxFunctionBehaviorExecution;
import utils.library.unlimitednaturalfunctions.UnlimitedNaturalMinFunctionBehaviorExecution;
import utils.library.unlimitednaturalfunctions.UnlimitedNaturalToIntegerFunctionBehaviorExecution;
import utils.library.unlimitednaturalfunctions.UnlimitedNaturalToStringFunctionBehaviorExecution;
import utils.library.unlimitednaturalfunctions.UnlimitedNaturalToUnlimitedNaturalFunctionBehaviorExecution;

public abstract class Environment
{
    protected Locus locus;
    protected Object_ context = null;
    protected ParameterValueList inputs = new ParameterValueList();
    protected ParameterValueList outputs = new ParameterValueList();
    protected InMemoryModel inMemoryModel;

    public void execute(String behaviorName)
    {
        Object object = (inMemoryModel.findElementByName(behaviorName));
        
        if(object == null)
        {
        	System.out.println("[ERROR] Element with specified name does not exist: " + behaviorName);
        }
        
        Behavior behavior = (Behavior)object;
        if(behavior == null)
    	{
    		System.out.println("[ERROR] Specified behavior name does not name a behavior: " + behaviorName);
    	}
        
        Class_ contextType = (Class_)behavior.context;
        if(contextType != null)
        {
            context = locus.instantiate(contextType);
        }

        outputs = locus.executor.execute(behavior, context, inputs);
    }

    protected Environment()
    {
        this.initializeEnvironment();
    }

    protected void add(ExtensionalValue extensionalValue)
    {
        locus.add(extensionalValue);
    }

    protected void addBuiltInType(String name)
    {
        PrimitiveType builtInType = new PrimitiveType();
        builtInType.setName(name);
        locus.factory.addBuiltInType(builtInType);
    }

    protected void addBuiltInType(PrimitiveType builtInType)
    {
        locus.factory.addBuiltInType(builtInType);
    }

    protected void addPrimitiveBehaviorPrototype(OpaqueBehaviorExecution prototype)
    {
        locus.factory.addPrimitiveBehaviorPrototype(prototype);
    }

    protected void initializeLoci()
    {
        locus = new Locus();
        locus.setExecutor(new Executor());
        locus.setFactory(new ExecutionFactory());
    }

    protected void initializeLociContents()
    {
        if(locus == null)
        {
            Debug.println("[error] Locus is not set for execution environment");
            throw new NullPointerException();
        }

        locus.factory.setStrategy(new FirstChoiceStrategy());
        locus.factory.setStrategy(new RedefinitionBasedDispatchStrategy());
        locus.factory.setStrategy(new FIFOGetNextEventStrategy());

        addBooleanFunctionsPrototypes();
        addIntegerFunctionsPrototypes();
        addListFunctionsPrototypes();
        addRealFunctionsPrototypes();
        addStringFunctionsPrototypes();
        addUnlimitedNaturalFunctionsPrototypes();

        add(new StandardInputChannelObject());
        add(new StandardOutputChannelObject());
    }

    private void addBooleanFunctionsPrototypes()
    {
        addPrimitiveBehaviorPrototype(new BooleanAndFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new BooleanImpliesFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new BooleanNotFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new BooleanOrFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new BooleanToBooleanFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new BooleanToStringFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new BooleanXorFunctionBehaviorExecution());
    }

    private void addIntegerFunctionsPrototypes()
    {
        addPrimitiveBehaviorPrototype(new IntegerAbsFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerDivFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerDivideFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerGreaterThanEqualFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerGreaterThanFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerLessThanEqualFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerLessThanFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerMaxFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerMinFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerMinusFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerModFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerNegateFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerPlusFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerTimesFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerToIntegerFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerToStringFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new IntegerToUnlimitedNaturalFunctionBehaviorExecution());
    }

    private void addListFunctionsPrototypes()
    {
        addPrimitiveBehaviorPrototype(new ListConcatFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new ListGetFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new ListSizeFunctionBehaviorExecution());
    }

    private void addRealFunctionsPrototypes()
    {
        addPrimitiveBehaviorPrototype(new RealAbsFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealDivideFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealFloorFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealGreaterThanEqualFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealGreaterThanFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealInverseFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealLessThanEqualFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealLessThanFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealMaxFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealMinFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealMinusFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealNegateFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealPlusFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealRoundFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealTimesFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealToIntegerFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealToRealFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new RealToStringFunctionBehaviorExecution());
    }

    private void addStringFunctionsPrototypes()
    {
        addPrimitiveBehaviorPrototype(new StringConcatFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new StringSizeFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new StringSubstringFunctionBehaviorExecution());
    }

    private void addUnlimitedNaturalFunctionsPrototypes()
    {
        addPrimitiveBehaviorPrototype(new UnlimitedNaturalGreaterThanEqualFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new UnlimitedNaturalGreaterThanFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new UnlimitedNaturalLessThanEqualFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new UnlimitedNaturalLessThanFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new UnlimitedNaturalMaxFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new UnlimitedNaturalMinFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new UnlimitedNaturalToIntegerFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new UnlimitedNaturalToStringFunctionBehaviorExecution());
        addPrimitiveBehaviorPrototype(new UnlimitedNaturalToUnlimitedNaturalFunctionBehaviorExecution());
    }

    private void initializeEnvironment()
    {
        initializeLoci();
        initializeLociContents();
    }
} // Environment
