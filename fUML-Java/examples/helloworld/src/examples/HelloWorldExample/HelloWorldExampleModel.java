package examples.HelloWorldExample;

import uml.actions.CallBehaviorAction;
import uml.actions.InputPin;
import uml.actions.OutputPin;
import uml.actions.ValueSpecificationAction;
import uml.activities.Activity;
import uml.activities.ActivityFinalNode;
import uml.activities.ControlFlow;
import uml.activities.InitialNode;
import uml.activities.ObjectFlow;
import uml.values.LiteralString;
import utils.environment.InMemoryModel;
import utils.library.FoundationalModelLibraryModel;
import utils.primitivetypes.PrimitiveTypesModel;

public class HelloWorldExampleModel extends InMemoryModel {
	
    private static HelloWorldExampleModel instance;

    public ActivityFinalNode HelloWorldModel_main_ActivityFinalNode = new ActivityFinalNode();
    public Activity HelloWorldModel_main = new Activity();
    public CallBehaviorAction HelloWorldModel_main_callWriteLine = new CallBehaviorAction();
    public ControlFlow HelloWorldModel_main_From_callPrintln_To_ActivityFinalNode = new ControlFlow();
    public ControlFlow HelloWorldModel_main_From_InitialNode_To_SpecifyString = new ControlFlow();
    public InitialNode HelloWorldModel_main_InitialNode = new InitialNode();
    public InputPin HelloWorldModel_main_callWriteLine_value = new InputPin();
    public OutputPin HelloWorldModel_main_callWriteLine_errorStatus = new OutputPin();
    public LiteralString HelloWorldModel_main_SpecifyString_value = new LiteralString();
    public ObjectFlow HelloWorldModel_main_From_SpecifyString_result_To_callPrintln_input = new ObjectFlow();
    public OutputPin HelloWorldModel_main_SpecifyString_result = new OutputPin();
    public ValueSpecificationAction HelloWorldModel_main_SpecifyString = new ValueSpecificationAction();

    public static HelloWorldExampleModel instance()
    {
        if (instance == null)
        {
            instance = new HelloWorldExampleModel();
            instance.initializeInMemoryModel();
        }

        return instance;
    }

    private void initializeInMemoryModel()
    {
        /*
		 * Create in-memory model elements
		 */
        // Activity main
        HelloWorldModel_main.setName("main");
        addToElementRepository("main", HelloWorldModel_main);
        //InitialNode InitialNode
        HelloWorldModel_main_InitialNode.setName("InitialNode");
        HelloWorldModel_main.node.add(HelloWorldModel_main_InitialNode);
        //ValueSpecificationAction SpecifyString
        HelloWorldModel_main_SpecifyString.setName("SpecifyString");
        //ValueSpecification value
        HelloWorldModel_main_SpecifyString_value.name = "value";
        HelloWorldModel_main_SpecifyString_value.value = "Hello World from activity! :)";
        HelloWorldModel_main_SpecifyString.setValue(HelloWorldModel_main_SpecifyString_value);
        //OutputPin result
        HelloWorldModel_main_SpecifyString_result.setName("result");
        HelloWorldModel_main_SpecifyString.setResult(HelloWorldModel_main_SpecifyString_result);
        HelloWorldModel_main.node.add(HelloWorldModel_main_SpecifyString);
        //CallBehaviorAction callWriteLine
        HelloWorldModel_main_callWriteLine.setName("callWriteLine");
        HelloWorldModel_main_callWriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
        HelloWorldModel_main_callWriteLine.isSynchronous = true; //imposed by the fUML specification
        //InputPin value
        HelloWorldModel_main_callWriteLine_value.setName("value");
        HelloWorldModel_main_callWriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        HelloWorldModel_main_callWriteLine.addArgument(HelloWorldModel_main_callWriteLine_value);
        //OutputPin errorStatus
        HelloWorldModel_main_callWriteLine_errorStatus.setName("errorStatus");
        HelloWorldModel_main_callWriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
        HelloWorldModel_main_callWriteLine.addResult(HelloWorldModel_main_callWriteLine_errorStatus);
        HelloWorldModel_main.node.add(HelloWorldModel_main_callWriteLine);
        //ActivityFinalNode ActivityFinalNode
        HelloWorldModel_main_ActivityFinalNode.setName("ActivityFinalNode");
        HelloWorldModel_main.node.add(HelloWorldModel_main_ActivityFinalNode);
        //ControlFlow from InitialNode to SpecifyString
        HelloWorldModel_main_From_InitialNode_To_SpecifyString.setName("From_InitialNode_To_SpecifyString");
        HelloWorldModel_main_From_InitialNode_To_SpecifyString.setSource(HelloWorldModel_main_InitialNode);
        HelloWorldModel_main_InitialNode.outgoing.add(HelloWorldModel_main_From_InitialNode_To_SpecifyString);
        HelloWorldModel_main_From_InitialNode_To_SpecifyString.setTarget(HelloWorldModel_main_SpecifyString);
        HelloWorldModel_main_SpecifyString.incoming.add(HelloWorldModel_main_From_InitialNode_To_SpecifyString);
        HelloWorldModel_main.edge.add(HelloWorldModel_main_From_InitialNode_To_SpecifyString);
        //ObjectFlow from SpecifyString_result to callPrintln_input
        HelloWorldModel_main_From_SpecifyString_result_To_callPrintln_input.setName("From_SpecifyString_result_To_callPrintln_input");
        HelloWorldModel_main_From_SpecifyString_result_To_callPrintln_input.setSource(HelloWorldModel_main_SpecifyString_result);
        HelloWorldModel_main_SpecifyString_result.outgoing.add(HelloWorldModel_main_From_SpecifyString_result_To_callPrintln_input);
        HelloWorldModel_main_From_SpecifyString_result_To_callPrintln_input.setTarget(HelloWorldModel_main_callWriteLine_value);
        HelloWorldModel_main_callWriteLine_value.incoming.add(HelloWorldModel_main_From_SpecifyString_result_To_callPrintln_input);
        HelloWorldModel_main.edge.add(HelloWorldModel_main_From_SpecifyString_result_To_callPrintln_input);
        //ControlFlow from callPrintln to ActivityFinalNode
        HelloWorldModel_main_From_callPrintln_To_ActivityFinalNode.setName("From_callPrintln_To_ActivityFinalNode");
        HelloWorldModel_main_From_callPrintln_To_ActivityFinalNode.setSource(HelloWorldModel_main_callWriteLine);
        HelloWorldModel_main_callWriteLine.outgoing.add(HelloWorldModel_main_From_callPrintln_To_ActivityFinalNode);
        HelloWorldModel_main_From_callPrintln_To_ActivityFinalNode.setTarget(HelloWorldModel_main_ActivityFinalNode);
        HelloWorldModel_main_ActivityFinalNode.incoming.add(HelloWorldModel_main_From_callPrintln_To_ActivityFinalNode);
        HelloWorldModel_main.edge.add(HelloWorldModel_main_From_callPrintln_To_ActivityFinalNode);
    }
} // HelloWorldExampleModel
