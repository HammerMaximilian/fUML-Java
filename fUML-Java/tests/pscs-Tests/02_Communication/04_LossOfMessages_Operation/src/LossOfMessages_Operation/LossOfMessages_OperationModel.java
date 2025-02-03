/*
 * LossOfMessages_OperationModel.java
 * 
 * Auto-generated file
 */
package LossOfMessages_Operation;

import uml.actions.ReadSelfAction;
import uml.values.LiteralBoolean;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.InterfaceRealization;
import uml.activities.Activity;
import uml.actions.OutputPin;
import uml.actions.ReadStructuralFeatureAction;
import uml.actions.CallOperationAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.commonstructure.Comment;
import uml.simpleclassifiers.Interface;
import uml.classification.Operation;
import uml.classification.Parameter;
import uml.activities.ActivityParameterNode;
import uml.commonstructure.PackageImport;
import uml.classification.AggregationKind;
import uml.activities.ControlFlow;
import uml.activities.ForkNode;
import uml.actions.CreateObjectAction;
import uml.actions.ValueSpecificationAction;
import uml.commonbehavior.FunctionBehavior;
import uml.actions.CallBehaviorAction;
import uml.classification.Property;
import utils.primitivetypes.PrimitiveTypesModel;
import uml.classification.ParameterDirectionKind;
import uml.simpleclassifiers.PrimitiveType;
import uml.actions.AddStructuralFeatureValueAction;
import uml.activities.ObjectFlow;
import uml.commonbehavior.OpaqueBehavior;
import utils.library.FoundationalModelLibraryModel;
import utils.environment.InMemoryModel;
import uml.values.LiteralInteger;
import uml.packages.Package;
import uml.structuredclassifiers.Port;


/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class LossOfMessages_OperationModel extends InMemoryModel
{
	private static LossOfMessages_OperationModel instance;

	/*
	 * Model LossOfMessages_Operation
	 */
	public Package LossOfMessages_Operation = new Package();
		public Comment LossOfMessages_Operation_Comment0 = new Comment();
		public PackageImport LossOfMessages_Operation_PackageImport1 = new PackageImport();
		public Comment LossOfMessages_Operation_Comment2 = new Comment();
		public Interface LossOfMessages_Operation_I = new Interface();
			public Operation LossOfMessages_Operation_I_setP_Integer = new Operation();
				public Parameter LossOfMessages_Operation_I_setP_Integer_v = new Parameter();
		public Class_ LossOfMessages_Operation_IImpl = new Class_();
			public InterfaceRealization LossOfMessages_Operation_IImpl_IRealization = new InterfaceRealization();
			public Operation LossOfMessages_Operation_IImpl_setP_Integer = new Operation();
				public Parameter LossOfMessages_Operation_IImpl_setP_Integer_v = new Parameter();
		public Class_ LossOfMessages_Operation_A = new Class_();
			public Property LossOfMessages_Operation_A_p = new Property();
				public LiteralInteger LossOfMessages_Operation_A_p_LiteralInteger3 = new LiteralInteger();
			public Operation LossOfMessages_Operation_A_setP_Integer = new Operation();
				public Parameter LossOfMessages_Operation_A_setP_Integer_v = new Parameter();
			public Activity LossOfMessages_Operation_A_setPActivity = new Activity();
				public AddStructuralFeatureValueAction LossOfMessages_Operation_A_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin LossOfMessages_Operation_A_setPActivity_Set_this_p_object = new InputPin();
						public LiteralInteger LossOfMessages_Operation_A_setPActivity_Set_this_p_object_LiteralInteger4 = new LiteralInteger();
						public LiteralUnlimitedNatural LossOfMessages_Operation_A_setPActivity_Set_this_p_object_LiteralUnlimitedNatural5 = new LiteralUnlimitedNatural();
					public InputPin LossOfMessages_Operation_A_setPActivity_Set_this_p_value = new InputPin();
						public LiteralUnlimitedNatural LossOfMessages_Operation_A_setPActivity_Set_this_p_value_LiteralUnlimitedNatural6 = new LiteralUnlimitedNatural();
						public LiteralInteger LossOfMessages_Operation_A_setPActivity_Set_this_p_value_LiteralInteger7 = new LiteralInteger();
					public OutputPin LossOfMessages_Operation_A_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralInteger LossOfMessages_Operation_A_setPActivity_Set_this_p_result_LiteralInteger8 = new LiteralInteger();
						public LiteralUnlimitedNatural LossOfMessages_Operation_A_setPActivity_Set_this_p_result_LiteralUnlimitedNatural9 = new LiteralUnlimitedNatural();
				public ReadSelfAction LossOfMessages_Operation_A_setPActivity_this = new ReadSelfAction();
					public OutputPin LossOfMessages_Operation_A_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural LossOfMessages_Operation_A_setPActivity_this_result_LiteralUnlimitedNatural10 = new LiteralUnlimitedNatural();
						public LiteralInteger LossOfMessages_Operation_A_setPActivity_this_result_LiteralInteger11 = new LiteralInteger();
				public ActivityParameterNode LossOfMessages_Operation_A_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger LossOfMessages_Operation_A_setPActivity_vParameterNode_LiteralInteger12 = new LiteralInteger();
				public ObjectFlow LossOfMessages_Operation_A_setPActivity_ObjectFlow13 = new ObjectFlow();
					public LiteralBoolean LossOfMessages_Operation_A_setPActivity_ObjectFlow13_LiteralBoolean14 = new LiteralBoolean();
					public LiteralInteger LossOfMessages_Operation_A_setPActivity_ObjectFlow13_LiteralInteger15 = new LiteralInteger();
				public ObjectFlow LossOfMessages_Operation_A_setPActivity_ObjectFlow16 = new ObjectFlow();
					public LiteralInteger LossOfMessages_Operation_A_setPActivity_ObjectFlow16_LiteralInteger17 = new LiteralInteger();
					public LiteralBoolean LossOfMessages_Operation_A_setPActivity_ObjectFlow16_LiteralBoolean18 = new LiteralBoolean();
				public Parameter LossOfMessages_Operation_A_setPActivity_v = new Parameter();
			public Operation LossOfMessages_Operation_A_A_A = new Operation();
				public Parameter LossOfMessages_Operation_A_A_A_result = new Parameter();
			public InterfaceRealization LossOfMessages_Operation_A_IRealization = new InterfaceRealization();
			public Port LossOfMessages_Operation_A_q = new Port();
		public Activity LossOfMessages_Operation_main = new Activity();
			public ControlFlow LossOfMessages_Operation_main_ControlFlow19 = new ControlFlow();
			public ObjectFlow LossOfMessages_Operation_main_ObjectFlow20 = new ObjectFlow();
				public LiteralInteger LossOfMessages_Operation_main_ObjectFlow20_LiteralInteger21 = new LiteralInteger();
				public LiteralBoolean LossOfMessages_Operation_main_ObjectFlow20_LiteralBoolean22 = new LiteralBoolean();
			public CallOperationAction LossOfMessages_Operation_main_A_ = new CallOperationAction();
				public OutputPin LossOfMessages_Operation_main_A__result = new OutputPin();
					public LiteralUnlimitedNatural LossOfMessages_Operation_main_A__result_LiteralUnlimitedNatural23 = new LiteralUnlimitedNatural();
					public LiteralInteger LossOfMessages_Operation_main_A__result_LiteralInteger24 = new LiteralInteger();
					public LiteralInteger LossOfMessages_Operation_main_A__result_LiteralInteger25 = new LiteralInteger();
				public InputPin LossOfMessages_Operation_main_A__target = new InputPin();
					public LiteralInteger LossOfMessages_Operation_main_A__target_LiteralInteger26 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Operation_main_A__target_LiteralUnlimitedNatural27 = new LiteralUnlimitedNatural();
			public ObjectFlow LossOfMessages_Operation_main_ObjectFlow28 = new ObjectFlow();
				public LiteralBoolean LossOfMessages_Operation_main_ObjectFlow28_LiteralBoolean29 = new LiteralBoolean();
				public LiteralInteger LossOfMessages_Operation_main_ObjectFlow28_LiteralInteger30 = new LiteralInteger();
			public CallBehaviorAction LossOfMessages_Operation_main_Call_testP = new CallBehaviorAction();
				public InputPin LossOfMessages_Operation_main_Call_testP_p = new InputPin();
					public LiteralInteger LossOfMessages_Operation_main_Call_testP_p_LiteralInteger31 = new LiteralInteger();
					public LiteralInteger LossOfMessages_Operation_main_Call_testP_p_LiteralInteger32 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Operation_main_Call_testP_p_LiteralUnlimitedNatural33 = new LiteralUnlimitedNatural();
			public CreateObjectAction LossOfMessages_Operation_main_Create_A = new CreateObjectAction();
				public OutputPin LossOfMessages_Operation_main_Create_A_result = new OutputPin();
					public LiteralInteger LossOfMessages_Operation_main_Create_A_result_LiteralInteger34 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Operation_main_Create_A_result_LiteralUnlimitedNatural35 = new LiteralUnlimitedNatural();
			public ObjectFlow LossOfMessages_Operation_main_ObjectFlow36 = new ObjectFlow();
				public LiteralInteger LossOfMessages_Operation_main_ObjectFlow36_LiteralInteger37 = new LiteralInteger();
				public LiteralBoolean LossOfMessages_Operation_main_ObjectFlow36_LiteralBoolean38 = new LiteralBoolean();
			public ObjectFlow LossOfMessages_Operation_main_ObjectFlow39 = new ObjectFlow();
				public LiteralInteger LossOfMessages_Operation_main_ObjectFlow39_LiteralInteger40 = new LiteralInteger();
				public LiteralBoolean LossOfMessages_Operation_main_ObjectFlow39_LiteralBoolean41 = new LiteralBoolean();
			public ObjectFlow LossOfMessages_Operation_main_ObjectFlow42 = new ObjectFlow();
				public LiteralInteger LossOfMessages_Operation_main_ObjectFlow42_LiteralInteger43 = new LiteralInteger();
				public LiteralBoolean LossOfMessages_Operation_main_ObjectFlow42_LiteralBoolean44 = new LiteralBoolean();
			public ForkNode LossOfMessages_Operation_main_Fork_A = new ForkNode();
			public OpaqueBehavior LossOfMessages_Operation_main_testP = new OpaqueBehavior();
				public Parameter LossOfMessages_Operation_main_testP_p = new Parameter();
			public ValueSpecificationAction LossOfMessages_Operation_main_Value_4 = new ValueSpecificationAction();
				public OutputPin LossOfMessages_Operation_main_Value_4_result = new OutputPin();
					public LiteralInteger LossOfMessages_Operation_main_Value_4_result_LiteralInteger45 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Operation_main_Value_4_result_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
				public LiteralInteger LossOfMessages_Operation_main_Value_4_LiteralInteger47 = new LiteralInteger();
			public CallOperationAction LossOfMessages_Operation_main_Call_setP = new CallOperationAction();
				public InputPin LossOfMessages_Operation_main_Call_setP_v = new InputPin();
					public LiteralInteger LossOfMessages_Operation_main_Call_setP_v_LiteralInteger48 = new LiteralInteger();
					public LiteralInteger LossOfMessages_Operation_main_Call_setP_v_LiteralInteger49 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Operation_main_Call_setP_v_LiteralUnlimitedNatural50 = new LiteralUnlimitedNatural();
				public InputPin LossOfMessages_Operation_main_Call_setP_target = new InputPin();
					public LiteralUnlimitedNatural LossOfMessages_Operation_main_Call_setP_target_LiteralUnlimitedNatural51 = new LiteralUnlimitedNatural();
					public LiteralInteger LossOfMessages_Operation_main_Call_setP_target_LiteralInteger52 = new LiteralInteger();
			public ReadStructuralFeatureAction LossOfMessages_Operation_main_Read_a_q = new ReadStructuralFeatureAction();
				public InputPin LossOfMessages_Operation_main_Read_a_q_object = new InputPin();
					public LiteralUnlimitedNatural LossOfMessages_Operation_main_Read_a_q_object_LiteralUnlimitedNatural53 = new LiteralUnlimitedNatural();
					public LiteralInteger LossOfMessages_Operation_main_Read_a_q_object_LiteralInteger54 = new LiteralInteger();
				public OutputPin LossOfMessages_Operation_main_Read_a_q_result = new OutputPin();
					public LiteralInteger LossOfMessages_Operation_main_Read_a_q_result_LiteralInteger55 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Operation_main_Read_a_q_result_LiteralUnlimitedNatural56 = new LiteralUnlimitedNatural();
			public ObjectFlow LossOfMessages_Operation_main_ObjectFlow57 = new ObjectFlow();
				public LiteralBoolean LossOfMessages_Operation_main_ObjectFlow57_LiteralBoolean58 = new LiteralBoolean();
				public LiteralInteger LossOfMessages_Operation_main_ObjectFlow57_LiteralInteger59 = new LiteralInteger();
			public ObjectFlow LossOfMessages_Operation_main_ObjectFlow60 = new ObjectFlow();
				public LiteralInteger LossOfMessages_Operation_main_ObjectFlow60_LiteralInteger61 = new LiteralInteger();
				public LiteralBoolean LossOfMessages_Operation_main_ObjectFlow60_LiteralBoolean62 = new LiteralBoolean();
			public ReadStructuralFeatureAction LossOfMessages_Operation_main_Read_a_p = new ReadStructuralFeatureAction();
				public OutputPin LossOfMessages_Operation_main_Read_a_p_result = new OutputPin();
					public LiteralUnlimitedNatural LossOfMessages_Operation_main_Read_a_p_result_LiteralUnlimitedNatural63 = new LiteralUnlimitedNatural();
					public LiteralInteger LossOfMessages_Operation_main_Read_a_p_result_LiteralInteger64 = new LiteralInteger();
				public InputPin LossOfMessages_Operation_main_Read_a_p_object = new InputPin();
					public LiteralInteger LossOfMessages_Operation_main_Read_a_p_object_LiteralInteger65 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Operation_main_Read_a_p_object_LiteralUnlimitedNatural66 = new LiteralUnlimitedNatural();

	public static LossOfMessages_OperationModel instance()
	{
		if (instance == null)
        {
            instance = new LossOfMessages_OperationModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public LossOfMessages_OperationModel()
	{
		/* Start of user code : Additional model initializations
	 	 * This section may be used to do any additional model initialization,
		 * for example initializing user-defined members.
	 	 * It will not be overwritten by future generation processes.
	 	 */
	
		/*
	 	 * End of user code
	 	 */
	}

	private void initializeInMemoryModel()
	{
		this.initializeActivity_Instances();
		this.initializeActivityParameterNode_Instances();
		this.initializeAddStructuralFeatureValueAction_Instances();
		this.initializeCallBehaviorAction_Instances();
		this.initializeCallOperationAction_Instances();
		this.initializeClass_Instances();
		this.initializeComment_Instances();
		this.initializeControlFlow_Instances();
		this.initializeCreateObjectAction_Instances();
		this.initializeForkNode_Instances();
		this.initializeFunctionBehavior_Instances();
		this.initializeInputPin_Instances();
		this.initializeInterface_Instances();
		this.initializeInterfaceRealization_Instances();
		this.initializeLiteralBoolean_Instances();
		this.initializeLiteralInteger_Instances();
		this.initializeLiteralUnlimitedNatural_Instances();
		this.initializeObjectFlow_Instances();
		this.initializeOperation_Instances();
		this.initializeOutputPin_Instances();
		this.initializePackageImport_Instances();
		this.initializeParameter_Instances();
		this.initializePort_Instances();
		this.initializeProperty_Instances();
		this.initializeReadSelfAction_Instances();
		this.initializeReadStructuralFeatureAction_Instances();
		this.initializeValueSpecificationAction_Instances();
	}

	private void initializeActivity_Instances()
	{
		// Activity LossOfMessages_Operation_A::setPActivity
		addToElementRepository("setPActivity", LossOfMessages_Operation_A_setPActivity);
		LossOfMessages_Operation_A_setPActivity.setName("setPActivity");
		LossOfMessages_Operation_A_setPActivity.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_A_setPActivity.addOwnedParameter(LossOfMessages_Operation_A_setPActivity_v);
		LossOfMessages_Operation_A_setPActivity.addNode(LossOfMessages_Operation_A_setPActivity_Set_this_p);
		LossOfMessages_Operation_A_setPActivity.addNode(LossOfMessages_Operation_A_setPActivity_this);
		LossOfMessages_Operation_A_setPActivity.addNode(LossOfMessages_Operation_A_setPActivity_vParameterNode);
		LossOfMessages_Operation_A_setPActivity.addEdge(LossOfMessages_Operation_A_setPActivity_ObjectFlow13);
		LossOfMessages_Operation_A_setPActivity.addEdge(LossOfMessages_Operation_A_setPActivity_ObjectFlow16);
		// Activity LossOfMessages_Operation::main
		addToElementRepository("main", LossOfMessages_Operation_main);
		LossOfMessages_Operation_main.setName("main");
		LossOfMessages_Operation_main.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main.addOwnedBehavior(LossOfMessages_Operation_main_testP);
		LossOfMessages_Operation_main.addNode(LossOfMessages_Operation_main_Create_A);
		LossOfMessages_Operation_main.addNode(LossOfMessages_Operation_main_Fork_A);
		LossOfMessages_Operation_main.addNode(LossOfMessages_Operation_main_A_);
		LossOfMessages_Operation_main.addNode(LossOfMessages_Operation_main_Value_4);
		LossOfMessages_Operation_main.addNode(LossOfMessages_Operation_main_Call_setP);
		LossOfMessages_Operation_main.addNode(LossOfMessages_Operation_main_Read_a_q);
		LossOfMessages_Operation_main.addNode(LossOfMessages_Operation_main_Call_testP);
		LossOfMessages_Operation_main.addNode(LossOfMessages_Operation_main_Read_a_p);
		LossOfMessages_Operation_main.addEdge(LossOfMessages_Operation_main_ControlFlow19);
		LossOfMessages_Operation_main.addEdge(LossOfMessages_Operation_main_ObjectFlow36);
		LossOfMessages_Operation_main.addEdge(LossOfMessages_Operation_main_ObjectFlow39);
		LossOfMessages_Operation_main.addEdge(LossOfMessages_Operation_main_ObjectFlow42);
		LossOfMessages_Operation_main.addEdge(LossOfMessages_Operation_main_ObjectFlow20);
		LossOfMessages_Operation_main.addEdge(LossOfMessages_Operation_main_ObjectFlow28);
		LossOfMessages_Operation_main.addEdge(LossOfMessages_Operation_main_ObjectFlow57);
		LossOfMessages_Operation_main.addEdge(LossOfMessages_Operation_main_ObjectFlow60);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode LossOfMessages_Operation_A_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", LossOfMessages_Operation_A_setPActivity_vParameterNode);
		LossOfMessages_Operation_A_setPActivity_vParameterNode.setName("vParameterNode");
		LossOfMessages_Operation_A_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_A_setPActivity_vParameterNode.setParameter(LossOfMessages_Operation_A_setPActivity_v);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction LossOfMessages_Operation_A_setPActivity::Set this.p
		addToElementRepository("Set this.p", LossOfMessages_Operation_A_setPActivity_Set_this_p);
		LossOfMessages_Operation_A_setPActivity_Set_this_p.setName("Set this.p");
		LossOfMessages_Operation_A_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_Set_this_p.setStructuralFeature(LossOfMessages_Operation_A_p);
		LossOfMessages_Operation_A_setPActivity_Set_this_p.setObject(LossOfMessages_Operation_A_setPActivity_Set_this_p_object);
		LossOfMessages_Operation_A_setPActivity_Set_this_p.setValue(LossOfMessages_Operation_A_setPActivity_Set_this_p_value);
		LossOfMessages_Operation_A_setPActivity_Set_this_p.setResult(LossOfMessages_Operation_A_setPActivity_Set_this_p_result);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction LossOfMessages_Operation_main::Call testP
		addToElementRepository("Call testP", LossOfMessages_Operation_main_Call_testP);
		LossOfMessages_Operation_main_Call_testP.setName("Call testP");
		LossOfMessages_Operation_main_Call_testP.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Call_testP.setBehavior(LossOfMessages_Operation_main_testP);
		LossOfMessages_Operation_main_Call_testP.addArgument(LossOfMessages_Operation_main_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction LossOfMessages_Operation_main::Call setP
		addToElementRepository("Call setP", LossOfMessages_Operation_main_Call_setP);
		LossOfMessages_Operation_main_Call_setP.setName("Call setP");
		LossOfMessages_Operation_main_Call_setP.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Call_setP.setOperation(LossOfMessages_Operation_IImpl_setP_Integer);
		LossOfMessages_Operation_main_Call_setP.setTarget(LossOfMessages_Operation_main_Call_setP_target);
		LossOfMessages_Operation_main_Call_setP.addArgument(LossOfMessages_Operation_main_Call_setP_v);
		// CallOperationAction LossOfMessages_Operation_main::A()
		addToElementRepository("A()", LossOfMessages_Operation_main_A_);
		LossOfMessages_Operation_main_A_.setName("A()");
		LossOfMessages_Operation_main_A_.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_main_A_.addResult(LossOfMessages_Operation_main_A__result);
		LossOfMessages_Operation_main_A_.setOperation(LossOfMessages_Operation_A_A_A);
		LossOfMessages_Operation_main_A_.setTarget(LossOfMessages_Operation_main_A__target);
	}

	private void initializeClass_Instances()
	{
		// Class LossOfMessages_Operation::IImpl
		addToElementRepository("IImpl", LossOfMessages_Operation_IImpl);
		LossOfMessages_Operation_IImpl.setName("IImpl");
		LossOfMessages_Operation_IImpl.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_IImpl.addInterfaceRealization(LossOfMessages_Operation_IImpl_IRealization);
		
		LossOfMessages_Operation_IImpl.addOwnedOperation(LossOfMessages_Operation_IImpl_setP_Integer);
		// Class LossOfMessages_Operation::A
		addToElementRepository("A", LossOfMessages_Operation_A);
		LossOfMessages_Operation_A.setName("A");
		LossOfMessages_Operation_A.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_A.addOwnedAttribute(LossOfMessages_Operation_A_p);
		LossOfMessages_Operation_A.addOwnedAttribute(LossOfMessages_Operation_A_q);
		LossOfMessages_Operation_A.addOwnedBehavior(LossOfMessages_Operation_A_setPActivity);
		LossOfMessages_Operation_A.addInterfaceRealization(LossOfMessages_Operation_A_IRealization);
		
		LossOfMessages_Operation_A.addOwnedOperation(LossOfMessages_Operation_A_setP_Integer);
		LossOfMessages_Operation_A.addOwnedOperation(LossOfMessages_Operation_A_A_A);
	}

	private void initializeComment_Instances()
	{
		// Comment LossOfMessages_Operation::Comment0
		addToElementRepository("Comment0", LossOfMessages_Operation_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment LossOfMessages_Operation::Comment2
		addToElementRepository("Comment2", LossOfMessages_Operation_Comment2);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow LossOfMessages_Operation_main::ControlFlow19
		addToElementRepository("ControlFlow19", LossOfMessages_Operation_main_ControlFlow19);
		LossOfMessages_Operation_main_ControlFlow19.setName("ControlFlow19");
		LossOfMessages_Operation_main_ControlFlow19.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_main_ControlFlow19.setSource(LossOfMessages_Operation_main_Call_setP);
		LossOfMessages_Operation_main_ControlFlow19.setTarget(LossOfMessages_Operation_main_Read_a_p);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction LossOfMessages_Operation_main::Create A
		addToElementRepository("Create A", LossOfMessages_Operation_main_Create_A);
		LossOfMessages_Operation_main_Create_A.setName("Create A");
		LossOfMessages_Operation_main_Create_A.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Create_A.setClassifier(LossOfMessages_Operation_A);
		LossOfMessages_Operation_main_Create_A.setResult(LossOfMessages_Operation_main_Create_A_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode LossOfMessages_Operation_main::Fork A
		addToElementRepository("Fork A", LossOfMessages_Operation_main_Fork_A);
		LossOfMessages_Operation_main_Fork_A.setName("Fork A");
		LossOfMessages_Operation_main_Fork_A.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior LossOfMessages_Operation_main::testP
		addToElementRepository("testP", LossOfMessages_Operation_main_testP);
		LossOfMessages_Operation_main_testP.setName("testP");
		LossOfMessages_Operation_main_testP.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_main_testP.addOwnedParameter(LossOfMessages_Operation_main_testP_p);
		LossOfMessages_Operation_main_testP.addLanguage("Java");
		LossOfMessages_Operation_main_testP.addLanguage("Import");
		LossOfMessages_Operation_main_testP.addBody("System.out.println(\"Asserting a.p != 4\");  	// Test parameter p 	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument p = \" + p); 	 	System.out.println(\"a.p == \" + p); 	System.out.print(\"Operation call lost: \");  	if(p != 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		LossOfMessages_Operation_main_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin LossOfMessages_Operation_main_Call testP::p
		addToElementRepository("p", LossOfMessages_Operation_main_Call_testP_p);
		LossOfMessages_Operation_main_Call_testP_p.setName("p");
		LossOfMessages_Operation_main_Call_testP_p.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin LossOfMessages_Operation_A_setPActivity_Set this.p::object
		addToElementRepository("object", LossOfMessages_Operation_A_setPActivity_Set_this_p_object);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_object.setName("object");
		LossOfMessages_Operation_A_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_object.setType(LossOfMessages_Operation_A);
		// InputPin LossOfMessages_Operation_main_Call setP::v
		addToElementRepository("v", LossOfMessages_Operation_main_Call_setP_v);
		LossOfMessages_Operation_main_Call_setP_v.setName("v");
		LossOfMessages_Operation_main_Call_setP_v.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Call_setP_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin LossOfMessages_Operation_main_Call setP::target
		addToElementRepository("target", LossOfMessages_Operation_main_Call_setP_target);
		LossOfMessages_Operation_main_Call_setP_target.setName("target");
		LossOfMessages_Operation_main_Call_setP_target.setVisibility(VisibilityKind.public_);
		// InputPin LossOfMessages_Operation_A_setPActivity_Set this.p::value
		addToElementRepository("value", LossOfMessages_Operation_A_setPActivity_Set_this_p_value);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_value.setName("value");
		LossOfMessages_Operation_A_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin LossOfMessages_Operation_main_Read a.q::object
		addToElementRepository("object", LossOfMessages_Operation_main_Read_a_q_object);
		LossOfMessages_Operation_main_Read_a_q_object.setName("object");
		LossOfMessages_Operation_main_Read_a_q_object.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_q_object.setType(LossOfMessages_Operation_A);
		// InputPin LossOfMessages_Operation_main_A()::target
		addToElementRepository("target", LossOfMessages_Operation_main_A__target);
		LossOfMessages_Operation_main_A__target.setName("target");
		LossOfMessages_Operation_main_A__target.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_A__target.setType(LossOfMessages_Operation_A);
		// InputPin LossOfMessages_Operation_main_Read a.p::object
		addToElementRepository("object", LossOfMessages_Operation_main_Read_a_p_object);
		LossOfMessages_Operation_main_Read_a_p_object.setName("object");
		LossOfMessages_Operation_main_Read_a_p_object.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_p_object.setType(LossOfMessages_Operation_A);
	}

	private void initializeInterface_Instances()
	{
		// Interface LossOfMessages_Operation::I
		addToElementRepository("I", LossOfMessages_Operation_I);
		LossOfMessages_Operation_I.setName("I");
		LossOfMessages_Operation_I.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_I.addOwnedOperation(LossOfMessages_Operation_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization LossOfMessages_Operation_IImpl::IRealization
		addToElementRepository("IRealization", LossOfMessages_Operation_IImpl_IRealization);
		LossOfMessages_Operation_IImpl_IRealization.setName("IRealization");
		LossOfMessages_Operation_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_IImpl_IRealization.setContract(LossOfMessages_Operation_I);
		// InterfaceRealization LossOfMessages_Operation_A::IRealization
		addToElementRepository("IRealization", LossOfMessages_Operation_A_IRealization);
		LossOfMessages_Operation_A_IRealization.setName("IRealization");
		LossOfMessages_Operation_A_IRealization.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_IRealization.setContract(LossOfMessages_Operation_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean LossOfMessages_Operation_A_setPActivity_ObjectFlow13::LiteralBoolean14
		addToElementRepository("LiteralBoolean14", LossOfMessages_Operation_A_setPActivity_ObjectFlow13_LiteralBoolean14);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow13_LiteralBoolean14.setName("LiteralBoolean14");
		LossOfMessages_Operation_A_setPActivity_ObjectFlow13_LiteralBoolean14.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow13_LiteralBoolean14.setValue(true);
		// LiteralBoolean LossOfMessages_Operation_main_ObjectFlow57::LiteralBoolean58
		addToElementRepository("LiteralBoolean58", LossOfMessages_Operation_main_ObjectFlow57_LiteralBoolean58);
		LossOfMessages_Operation_main_ObjectFlow57_LiteralBoolean58.setName("LiteralBoolean58");
		LossOfMessages_Operation_main_ObjectFlow57_LiteralBoolean58.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow57_LiteralBoolean58.setValue(true);
		// LiteralBoolean LossOfMessages_Operation_main_ObjectFlow28::LiteralBoolean29
		addToElementRepository("LiteralBoolean29", LossOfMessages_Operation_main_ObjectFlow28_LiteralBoolean29);
		LossOfMessages_Operation_main_ObjectFlow28_LiteralBoolean29.setName("LiteralBoolean29");
		LossOfMessages_Operation_main_ObjectFlow28_LiteralBoolean29.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow28_LiteralBoolean29.setValue(true);
		// LiteralBoolean LossOfMessages_Operation_A_setPActivity_ObjectFlow16::LiteralBoolean18
		addToElementRepository("LiteralBoolean18", LossOfMessages_Operation_A_setPActivity_ObjectFlow16_LiteralBoolean18);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow16_LiteralBoolean18.setName("LiteralBoolean18");
		LossOfMessages_Operation_A_setPActivity_ObjectFlow16_LiteralBoolean18.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow16_LiteralBoolean18.setValue(true);
		// LiteralBoolean LossOfMessages_Operation_main_ObjectFlow36::LiteralBoolean38
		addToElementRepository("LiteralBoolean38", LossOfMessages_Operation_main_ObjectFlow36_LiteralBoolean38);
		LossOfMessages_Operation_main_ObjectFlow36_LiteralBoolean38.setName("LiteralBoolean38");
		LossOfMessages_Operation_main_ObjectFlow36_LiteralBoolean38.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow36_LiteralBoolean38.setValue(true);
		// LiteralBoolean LossOfMessages_Operation_main_ObjectFlow20::LiteralBoolean22
		addToElementRepository("LiteralBoolean22", LossOfMessages_Operation_main_ObjectFlow20_LiteralBoolean22);
		LossOfMessages_Operation_main_ObjectFlow20_LiteralBoolean22.setName("LiteralBoolean22");
		LossOfMessages_Operation_main_ObjectFlow20_LiteralBoolean22.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow20_LiteralBoolean22.setValue(true);
		// LiteralBoolean LossOfMessages_Operation_main_ObjectFlow60::LiteralBoolean62
		addToElementRepository("LiteralBoolean62", LossOfMessages_Operation_main_ObjectFlow60_LiteralBoolean62);
		LossOfMessages_Operation_main_ObjectFlow60_LiteralBoolean62.setName("LiteralBoolean62");
		LossOfMessages_Operation_main_ObjectFlow60_LiteralBoolean62.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow60_LiteralBoolean62.setValue(true);
		// LiteralBoolean LossOfMessages_Operation_main_ObjectFlow39::LiteralBoolean41
		addToElementRepository("LiteralBoolean41", LossOfMessages_Operation_main_ObjectFlow39_LiteralBoolean41);
		LossOfMessages_Operation_main_ObjectFlow39_LiteralBoolean41.setName("LiteralBoolean41");
		LossOfMessages_Operation_main_ObjectFlow39_LiteralBoolean41.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow39_LiteralBoolean41.setValue(true);
		// LiteralBoolean LossOfMessages_Operation_main_ObjectFlow42::LiteralBoolean44
		addToElementRepository("LiteralBoolean44", LossOfMessages_Operation_main_ObjectFlow42_LiteralBoolean44);
		LossOfMessages_Operation_main_ObjectFlow42_LiteralBoolean44.setName("LiteralBoolean44");
		LossOfMessages_Operation_main_ObjectFlow42_LiteralBoolean44.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow42_LiteralBoolean44.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger LossOfMessages_Operation_main_Read a.p_object::LiteralInteger65
		addToElementRepository("LiteralInteger65", LossOfMessages_Operation_main_Read_a_p_object_LiteralInteger65);
		LossOfMessages_Operation_main_Read_a_p_object_LiteralInteger65.setName("LiteralInteger65");
		LossOfMessages_Operation_main_Read_a_p_object_LiteralInteger65.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_p_object_LiteralInteger65.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_ObjectFlow42::LiteralInteger43
		addToElementRepository("LiteralInteger43", LossOfMessages_Operation_main_ObjectFlow42_LiteralInteger43);
		LossOfMessages_Operation_main_ObjectFlow42_LiteralInteger43.setName("LiteralInteger43");
		LossOfMessages_Operation_main_ObjectFlow42_LiteralInteger43.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow42_LiteralInteger43.setValue(1);
		// LiteralInteger LossOfMessages_Operation_A_setPActivity_Set this.p_value::LiteralInteger7
		addToElementRepository("LiteralInteger7", LossOfMessages_Operation_A_setPActivity_Set_this_p_value_LiteralInteger7);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_value_LiteralInteger7.setName("LiteralInteger7");
		LossOfMessages_Operation_A_setPActivity_Set_this_p_value_LiteralInteger7.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_value_LiteralInteger7.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_Call setP_target::LiteralInteger52
		addToElementRepository("LiteralInteger52", LossOfMessages_Operation_main_Call_setP_target_LiteralInteger52);
		LossOfMessages_Operation_main_Call_setP_target_LiteralInteger52.setName("LiteralInteger52");
		LossOfMessages_Operation_main_Call_setP_target_LiteralInteger52.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Call_setP_target_LiteralInteger52.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_Read a.q_object::LiteralInteger54
		addToElementRepository("LiteralInteger54", LossOfMessages_Operation_main_Read_a_q_object_LiteralInteger54);
		LossOfMessages_Operation_main_Read_a_q_object_LiteralInteger54.setName("LiteralInteger54");
		LossOfMessages_Operation_main_Read_a_q_object_LiteralInteger54.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_q_object_LiteralInteger54.setValue(1);
		// LiteralInteger LossOfMessages_Operation_A_setPActivity_this_result::LiteralInteger11
		addToElementRepository("LiteralInteger11", LossOfMessages_Operation_A_setPActivity_this_result_LiteralInteger11);
		LossOfMessages_Operation_A_setPActivity_this_result_LiteralInteger11.setName("LiteralInteger11");
		LossOfMessages_Operation_A_setPActivity_this_result_LiteralInteger11.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_this_result_LiteralInteger11.setValue(1);
		// LiteralInteger LossOfMessages_Operation_A_setPActivity_Set this.p_result::LiteralInteger8
		addToElementRepository("LiteralInteger8", LossOfMessages_Operation_A_setPActivity_Set_this_p_result_LiteralInteger8);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_result_LiteralInteger8.setName("LiteralInteger8");
		LossOfMessages_Operation_A_setPActivity_Set_this_p_result_LiteralInteger8.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_result_LiteralInteger8.setValue(1);
		// LiteralInteger LossOfMessages_Operation_A_setPActivity_vParameterNode::LiteralInteger12
		addToElementRepository("LiteralInteger12", LossOfMessages_Operation_A_setPActivity_vParameterNode_LiteralInteger12);
		LossOfMessages_Operation_A_setPActivity_vParameterNode_LiteralInteger12.setName("LiteralInteger12");
		LossOfMessages_Operation_A_setPActivity_vParameterNode_LiteralInteger12.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_vParameterNode_LiteralInteger12.setValue(1);
		// LiteralInteger LossOfMessages_Operation_A_setPActivity_ObjectFlow16::LiteralInteger17
		addToElementRepository("LiteralInteger17", LossOfMessages_Operation_A_setPActivity_ObjectFlow16_LiteralInteger17);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow16_LiteralInteger17.setName("LiteralInteger17");
		LossOfMessages_Operation_A_setPActivity_ObjectFlow16_LiteralInteger17.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow16_LiteralInteger17.setValue(1);
		// LiteralInteger LossOfMessages_Operation_A_setPActivity_ObjectFlow13::LiteralInteger15
		addToElementRepository("LiteralInteger15", LossOfMessages_Operation_A_setPActivity_ObjectFlow13_LiteralInteger15);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow13_LiteralInteger15.setName("LiteralInteger15");
		LossOfMessages_Operation_A_setPActivity_ObjectFlow13_LiteralInteger15.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow13_LiteralInteger15.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_ObjectFlow57::LiteralInteger59
		addToElementRepository("LiteralInteger59", LossOfMessages_Operation_main_ObjectFlow57_LiteralInteger59);
		LossOfMessages_Operation_main_ObjectFlow57_LiteralInteger59.setName("LiteralInteger59");
		LossOfMessages_Operation_main_ObjectFlow57_LiteralInteger59.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow57_LiteralInteger59.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_ObjectFlow60::LiteralInteger61
		addToElementRepository("LiteralInteger61", LossOfMessages_Operation_main_ObjectFlow60_LiteralInteger61);
		LossOfMessages_Operation_main_ObjectFlow60_LiteralInteger61.setName("LiteralInteger61");
		LossOfMessages_Operation_main_ObjectFlow60_LiteralInteger61.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow60_LiteralInteger61.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_A()_result::LiteralInteger25
		addToElementRepository("LiteralInteger25", LossOfMessages_Operation_main_A__result_LiteralInteger25);
		LossOfMessages_Operation_main_A__result_LiteralInteger25.setName("LiteralInteger25");
		LossOfMessages_Operation_main_A__result_LiteralInteger25.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_A__result_LiteralInteger25.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_Read a.p_result::LiteralInteger64
		addToElementRepository("LiteralInteger64", LossOfMessages_Operation_main_Read_a_p_result_LiteralInteger64);
		LossOfMessages_Operation_main_Read_a_p_result_LiteralInteger64.setName("LiteralInteger64");
		LossOfMessages_Operation_main_Read_a_p_result_LiteralInteger64.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_p_result_LiteralInteger64.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_ObjectFlow20::LiteralInteger21
		addToElementRepository("LiteralInteger21", LossOfMessages_Operation_main_ObjectFlow20_LiteralInteger21);
		LossOfMessages_Operation_main_ObjectFlow20_LiteralInteger21.setName("LiteralInteger21");
		LossOfMessages_Operation_main_ObjectFlow20_LiteralInteger21.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow20_LiteralInteger21.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_ObjectFlow36::LiteralInteger37
		addToElementRepository("LiteralInteger37", LossOfMessages_Operation_main_ObjectFlow36_LiteralInteger37);
		LossOfMessages_Operation_main_ObjectFlow36_LiteralInteger37.setName("LiteralInteger37");
		LossOfMessages_Operation_main_ObjectFlow36_LiteralInteger37.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow36_LiteralInteger37.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_Value 4_result::LiteralInteger45
		addToElementRepository("LiteralInteger45", LossOfMessages_Operation_main_Value_4_result_LiteralInteger45);
		LossOfMessages_Operation_main_Value_4_result_LiteralInteger45.setName("LiteralInteger45");
		LossOfMessages_Operation_main_Value_4_result_LiteralInteger45.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Value_4_result_LiteralInteger45.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_Call setP_v::LiteralInteger48
		addToElementRepository("LiteralInteger48", LossOfMessages_Operation_main_Call_setP_v_LiteralInteger48);
		LossOfMessages_Operation_main_Call_setP_v_LiteralInteger48.setName("LiteralInteger48");
		LossOfMessages_Operation_main_Call_setP_v_LiteralInteger48.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Call_setP_v_LiteralInteger48.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_A()_result::LiteralInteger24
		addToElementRepository("LiteralInteger24", LossOfMessages_Operation_main_A__result_LiteralInteger24);
		LossOfMessages_Operation_main_A__result_LiteralInteger24.setName("LiteralInteger24");
		LossOfMessages_Operation_main_A__result_LiteralInteger24.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_A__result_LiteralInteger24.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_Call testP_p::LiteralInteger31
		addToElementRepository("LiteralInteger31", LossOfMessages_Operation_main_Call_testP_p_LiteralInteger31);
		LossOfMessages_Operation_main_Call_testP_p_LiteralInteger31.setName("LiteralInteger31");
		LossOfMessages_Operation_main_Call_testP_p_LiteralInteger31.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Call_testP_p_LiteralInteger31.setValue(1);
		// LiteralInteger LossOfMessages_Operation_A_p::LiteralInteger3
		addToElementRepository("LiteralInteger3", LossOfMessages_Operation_A_p_LiteralInteger3);
		LossOfMessages_Operation_A_p_LiteralInteger3.setName("LiteralInteger3");
		LossOfMessages_Operation_A_p_LiteralInteger3.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_p_LiteralInteger3.setValue(0);
		// LiteralInteger LossOfMessages_Operation_main_A()_target::LiteralInteger26
		addToElementRepository("LiteralInteger26", LossOfMessages_Operation_main_A__target_LiteralInteger26);
		LossOfMessages_Operation_main_A__target_LiteralInteger26.setName("LiteralInteger26");
		LossOfMessages_Operation_main_A__target_LiteralInteger26.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_A__target_LiteralInteger26.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_Read a.q_result::LiteralInteger55
		addToElementRepository("LiteralInteger55", LossOfMessages_Operation_main_Read_a_q_result_LiteralInteger55);
		LossOfMessages_Operation_main_Read_a_q_result_LiteralInteger55.setName("LiteralInteger55");
		LossOfMessages_Operation_main_Read_a_q_result_LiteralInteger55.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_q_result_LiteralInteger55.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_Create A_result::LiteralInteger34
		addToElementRepository("LiteralInteger34", LossOfMessages_Operation_main_Create_A_result_LiteralInteger34);
		LossOfMessages_Operation_main_Create_A_result_LiteralInteger34.setName("LiteralInteger34");
		LossOfMessages_Operation_main_Create_A_result_LiteralInteger34.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Create_A_result_LiteralInteger34.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_ObjectFlow28::LiteralInteger30
		addToElementRepository("LiteralInteger30", LossOfMessages_Operation_main_ObjectFlow28_LiteralInteger30);
		LossOfMessages_Operation_main_ObjectFlow28_LiteralInteger30.setName("LiteralInteger30");
		LossOfMessages_Operation_main_ObjectFlow28_LiteralInteger30.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow28_LiteralInteger30.setValue(1);
		// LiteralInteger LossOfMessages_Operation_A_setPActivity_Set this.p_object::LiteralInteger4
		addToElementRepository("LiteralInteger4", LossOfMessages_Operation_A_setPActivity_Set_this_p_object_LiteralInteger4);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_object_LiteralInteger4.setName("LiteralInteger4");
		LossOfMessages_Operation_A_setPActivity_Set_this_p_object_LiteralInteger4.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_object_LiteralInteger4.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_Value 4::LiteralInteger47
		addToElementRepository("LiteralInteger47", LossOfMessages_Operation_main_Value_4_LiteralInteger47);
		LossOfMessages_Operation_main_Value_4_LiteralInteger47.setName("LiteralInteger47");
		LossOfMessages_Operation_main_Value_4_LiteralInteger47.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Value_4_LiteralInteger47.setValue(4);
		// LiteralInteger LossOfMessages_Operation_main_Call setP_v::LiteralInteger49
		addToElementRepository("LiteralInteger49", LossOfMessages_Operation_main_Call_setP_v_LiteralInteger49);
		LossOfMessages_Operation_main_Call_setP_v_LiteralInteger49.setName("LiteralInteger49");
		LossOfMessages_Operation_main_Call_setP_v_LiteralInteger49.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Call_setP_v_LiteralInteger49.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_ObjectFlow39::LiteralInteger40
		addToElementRepository("LiteralInteger40", LossOfMessages_Operation_main_ObjectFlow39_LiteralInteger40);
		LossOfMessages_Operation_main_ObjectFlow39_LiteralInteger40.setName("LiteralInteger40");
		LossOfMessages_Operation_main_ObjectFlow39_LiteralInteger40.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_ObjectFlow39_LiteralInteger40.setValue(1);
		// LiteralInteger LossOfMessages_Operation_main_Call testP_p::LiteralInteger32
		addToElementRepository("LiteralInteger32", LossOfMessages_Operation_main_Call_testP_p_LiteralInteger32);
		LossOfMessages_Operation_main_Call_testP_p_LiteralInteger32.setName("LiteralInteger32");
		LossOfMessages_Operation_main_Call_testP_p_LiteralInteger32.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Call_testP_p_LiteralInteger32.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural LossOfMessages_Operation_main_Read a.p_result::LiteralUnlimitedNatural63
		addToElementRepository("LiteralUnlimitedNatural63", LossOfMessages_Operation_main_Read_a_p_result_LiteralUnlimitedNatural63);
		LossOfMessages_Operation_main_Read_a_p_result_LiteralUnlimitedNatural63.setName("LiteralUnlimitedNatural63");
		LossOfMessages_Operation_main_Read_a_p_result_LiteralUnlimitedNatural63.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_p_result_LiteralUnlimitedNatural63.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_main_Read a.p_object::LiteralUnlimitedNatural66
		addToElementRepository("LiteralUnlimitedNatural66", LossOfMessages_Operation_main_Read_a_p_object_LiteralUnlimitedNatural66);
		LossOfMessages_Operation_main_Read_a_p_object_LiteralUnlimitedNatural66.setName("LiteralUnlimitedNatural66");
		LossOfMessages_Operation_main_Read_a_p_object_LiteralUnlimitedNatural66.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_p_object_LiteralUnlimitedNatural66.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_A_setPActivity_Set this.p_value::LiteralUnlimitedNatural6
		addToElementRepository("LiteralUnlimitedNatural6", LossOfMessages_Operation_A_setPActivity_Set_this_p_value_LiteralUnlimitedNatural6);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_value_LiteralUnlimitedNatural6.setName("LiteralUnlimitedNatural6");
		LossOfMessages_Operation_A_setPActivity_Set_this_p_value_LiteralUnlimitedNatural6.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_value_LiteralUnlimitedNatural6.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_main_Value 4_result::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", LossOfMessages_Operation_main_Value_4_result_LiteralUnlimitedNatural46);
		LossOfMessages_Operation_main_Value_4_result_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		LossOfMessages_Operation_main_Value_4_result_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Value_4_result_LiteralUnlimitedNatural46.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_main_Read a.q_result::LiteralUnlimitedNatural56
		addToElementRepository("LiteralUnlimitedNatural56", LossOfMessages_Operation_main_Read_a_q_result_LiteralUnlimitedNatural56);
		LossOfMessages_Operation_main_Read_a_q_result_LiteralUnlimitedNatural56.setName("LiteralUnlimitedNatural56");
		LossOfMessages_Operation_main_Read_a_q_result_LiteralUnlimitedNatural56.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_q_result_LiteralUnlimitedNatural56.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_main_A()_target::LiteralUnlimitedNatural27
		addToElementRepository("LiteralUnlimitedNatural27", LossOfMessages_Operation_main_A__target_LiteralUnlimitedNatural27);
		LossOfMessages_Operation_main_A__target_LiteralUnlimitedNatural27.setName("LiteralUnlimitedNatural27");
		LossOfMessages_Operation_main_A__target_LiteralUnlimitedNatural27.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_A__target_LiteralUnlimitedNatural27.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_main_Call setP_v::LiteralUnlimitedNatural50
		addToElementRepository("LiteralUnlimitedNatural50", LossOfMessages_Operation_main_Call_setP_v_LiteralUnlimitedNatural50);
		LossOfMessages_Operation_main_Call_setP_v_LiteralUnlimitedNatural50.setName("LiteralUnlimitedNatural50");
		LossOfMessages_Operation_main_Call_setP_v_LiteralUnlimitedNatural50.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Call_setP_v_LiteralUnlimitedNatural50.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_main_Call testP_p::LiteralUnlimitedNatural33
		addToElementRepository("LiteralUnlimitedNatural33", LossOfMessages_Operation_main_Call_testP_p_LiteralUnlimitedNatural33);
		LossOfMessages_Operation_main_Call_testP_p_LiteralUnlimitedNatural33.setName("LiteralUnlimitedNatural33");
		LossOfMessages_Operation_main_Call_testP_p_LiteralUnlimitedNatural33.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Call_testP_p_LiteralUnlimitedNatural33.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_A_setPActivity_Set this.p_result::LiteralUnlimitedNatural9
		addToElementRepository("LiteralUnlimitedNatural9", LossOfMessages_Operation_A_setPActivity_Set_this_p_result_LiteralUnlimitedNatural9);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_result_LiteralUnlimitedNatural9.setName("LiteralUnlimitedNatural9");
		LossOfMessages_Operation_A_setPActivity_Set_this_p_result_LiteralUnlimitedNatural9.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_result_LiteralUnlimitedNatural9.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_main_Call setP_target::LiteralUnlimitedNatural51
		addToElementRepository("LiteralUnlimitedNatural51", LossOfMessages_Operation_main_Call_setP_target_LiteralUnlimitedNatural51);
		LossOfMessages_Operation_main_Call_setP_target_LiteralUnlimitedNatural51.setName("LiteralUnlimitedNatural51");
		LossOfMessages_Operation_main_Call_setP_target_LiteralUnlimitedNatural51.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Call_setP_target_LiteralUnlimitedNatural51.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_main_Read a.q_object::LiteralUnlimitedNatural53
		addToElementRepository("LiteralUnlimitedNatural53", LossOfMessages_Operation_main_Read_a_q_object_LiteralUnlimitedNatural53);
		LossOfMessages_Operation_main_Read_a_q_object_LiteralUnlimitedNatural53.setName("LiteralUnlimitedNatural53");
		LossOfMessages_Operation_main_Read_a_q_object_LiteralUnlimitedNatural53.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_q_object_LiteralUnlimitedNatural53.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_A_setPActivity_this_result::LiteralUnlimitedNatural10
		addToElementRepository("LiteralUnlimitedNatural10", LossOfMessages_Operation_A_setPActivity_this_result_LiteralUnlimitedNatural10);
		LossOfMessages_Operation_A_setPActivity_this_result_LiteralUnlimitedNatural10.setName("LiteralUnlimitedNatural10");
		LossOfMessages_Operation_A_setPActivity_this_result_LiteralUnlimitedNatural10.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_this_result_LiteralUnlimitedNatural10.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_main_A()_result::LiteralUnlimitedNatural23
		addToElementRepository("LiteralUnlimitedNatural23", LossOfMessages_Operation_main_A__result_LiteralUnlimitedNatural23);
		LossOfMessages_Operation_main_A__result_LiteralUnlimitedNatural23.setName("LiteralUnlimitedNatural23");
		LossOfMessages_Operation_main_A__result_LiteralUnlimitedNatural23.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_A__result_LiteralUnlimitedNatural23.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_A_setPActivity_Set this.p_object::LiteralUnlimitedNatural5
		addToElementRepository("LiteralUnlimitedNatural5", LossOfMessages_Operation_A_setPActivity_Set_this_p_object_LiteralUnlimitedNatural5);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_object_LiteralUnlimitedNatural5.setName("LiteralUnlimitedNatural5");
		LossOfMessages_Operation_A_setPActivity_Set_this_p_object_LiteralUnlimitedNatural5.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_object_LiteralUnlimitedNatural5.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Operation_main_Create A_result::LiteralUnlimitedNatural35
		addToElementRepository("LiteralUnlimitedNatural35", LossOfMessages_Operation_main_Create_A_result_LiteralUnlimitedNatural35);
		LossOfMessages_Operation_main_Create_A_result_LiteralUnlimitedNatural35.setName("LiteralUnlimitedNatural35");
		LossOfMessages_Operation_main_Create_A_result_LiteralUnlimitedNatural35.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Create_A_result_LiteralUnlimitedNatural35.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow LossOfMessages_Operation_main::ObjectFlow39
		addToElementRepository("ObjectFlow39", LossOfMessages_Operation_main_ObjectFlow39);
		LossOfMessages_Operation_main_ObjectFlow39.setName("ObjectFlow39");
		LossOfMessages_Operation_main_ObjectFlow39.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_main_ObjectFlow39.setSource(LossOfMessages_Operation_main_Read_a_p_result);
		LossOfMessages_Operation_main_ObjectFlow39.setTarget(LossOfMessages_Operation_main_Call_testP_p);
		LossOfMessages_Operation_main_ObjectFlow39.setGuard(LossOfMessages_Operation_main_ObjectFlow39_LiteralBoolean41);
		// ObjectFlow LossOfMessages_Operation_main::ObjectFlow36
		addToElementRepository("ObjectFlow36", LossOfMessages_Operation_main_ObjectFlow36);
		LossOfMessages_Operation_main_ObjectFlow36.setName("ObjectFlow36");
		LossOfMessages_Operation_main_ObjectFlow36.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_main_ObjectFlow36.setSource(LossOfMessages_Operation_main_Fork_A);
		LossOfMessages_Operation_main_ObjectFlow36.setTarget(LossOfMessages_Operation_main_Read_a_q_object);
		LossOfMessages_Operation_main_ObjectFlow36.setGuard(LossOfMessages_Operation_main_ObjectFlow36_LiteralBoolean38);
		// ObjectFlow LossOfMessages_Operation_main::ObjectFlow42
		addToElementRepository("ObjectFlow42", LossOfMessages_Operation_main_ObjectFlow42);
		LossOfMessages_Operation_main_ObjectFlow42.setName("ObjectFlow42");
		LossOfMessages_Operation_main_ObjectFlow42.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_main_ObjectFlow42.setSource(LossOfMessages_Operation_main_Read_a_q_result);
		LossOfMessages_Operation_main_ObjectFlow42.setTarget(LossOfMessages_Operation_main_Call_setP_target);
		LossOfMessages_Operation_main_ObjectFlow42.setGuard(LossOfMessages_Operation_main_ObjectFlow42_LiteralBoolean44);
		// ObjectFlow LossOfMessages_Operation_main::ObjectFlow20
		addToElementRepository("ObjectFlow20", LossOfMessages_Operation_main_ObjectFlow20);
		LossOfMessages_Operation_main_ObjectFlow20.setName("ObjectFlow20");
		LossOfMessages_Operation_main_ObjectFlow20.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_main_ObjectFlow20.setSource(LossOfMessages_Operation_main_Create_A_result);
		LossOfMessages_Operation_main_ObjectFlow20.setTarget(LossOfMessages_Operation_main_A__target);
		LossOfMessages_Operation_main_ObjectFlow20.setGuard(LossOfMessages_Operation_main_ObjectFlow20_LiteralBoolean22);
		// ObjectFlow LossOfMessages_Operation_A_setPActivity::ObjectFlow13
		addToElementRepository("ObjectFlow13", LossOfMessages_Operation_A_setPActivity_ObjectFlow13);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow13.setName("ObjectFlow13");
		LossOfMessages_Operation_A_setPActivity_ObjectFlow13.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_A_setPActivity_ObjectFlow13.setSource(LossOfMessages_Operation_A_setPActivity_this_result);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow13.setTarget(LossOfMessages_Operation_A_setPActivity_Set_this_p_object);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow13.setGuard(LossOfMessages_Operation_A_setPActivity_ObjectFlow13_LiteralBoolean14);
		// ObjectFlow LossOfMessages_Operation_A_setPActivity::ObjectFlow16
		addToElementRepository("ObjectFlow16", LossOfMessages_Operation_A_setPActivity_ObjectFlow16);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow16.setName("ObjectFlow16");
		LossOfMessages_Operation_A_setPActivity_ObjectFlow16.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_A_setPActivity_ObjectFlow16.setSource(LossOfMessages_Operation_A_setPActivity_vParameterNode);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow16.setTarget(LossOfMessages_Operation_A_setPActivity_Set_this_p_value);
		LossOfMessages_Operation_A_setPActivity_ObjectFlow16.setGuard(LossOfMessages_Operation_A_setPActivity_ObjectFlow16_LiteralBoolean18);
		// ObjectFlow LossOfMessages_Operation_main::ObjectFlow28
		addToElementRepository("ObjectFlow28", LossOfMessages_Operation_main_ObjectFlow28);
		LossOfMessages_Operation_main_ObjectFlow28.setName("ObjectFlow28");
		LossOfMessages_Operation_main_ObjectFlow28.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_main_ObjectFlow28.setSource(LossOfMessages_Operation_main_A__result);
		LossOfMessages_Operation_main_ObjectFlow28.setTarget(LossOfMessages_Operation_main_Fork_A);
		LossOfMessages_Operation_main_ObjectFlow28.setGuard(LossOfMessages_Operation_main_ObjectFlow28_LiteralBoolean29);
		// ObjectFlow LossOfMessages_Operation_main::ObjectFlow57
		addToElementRepository("ObjectFlow57", LossOfMessages_Operation_main_ObjectFlow57);
		LossOfMessages_Operation_main_ObjectFlow57.setName("ObjectFlow57");
		LossOfMessages_Operation_main_ObjectFlow57.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_main_ObjectFlow57.setSource(LossOfMessages_Operation_main_Fork_A);
		LossOfMessages_Operation_main_ObjectFlow57.setTarget(LossOfMessages_Operation_main_Read_a_p_object);
		LossOfMessages_Operation_main_ObjectFlow57.setGuard(LossOfMessages_Operation_main_ObjectFlow57_LiteralBoolean58);
		// ObjectFlow LossOfMessages_Operation_main::ObjectFlow60
		addToElementRepository("ObjectFlow60", LossOfMessages_Operation_main_ObjectFlow60);
		LossOfMessages_Operation_main_ObjectFlow60.setName("ObjectFlow60");
		LossOfMessages_Operation_main_ObjectFlow60.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_main_ObjectFlow60.setSource(LossOfMessages_Operation_main_Value_4_result);
		LossOfMessages_Operation_main_ObjectFlow60.setTarget(LossOfMessages_Operation_main_Call_setP_v);
		LossOfMessages_Operation_main_ObjectFlow60.setGuard(LossOfMessages_Operation_main_ObjectFlow60_LiteralBoolean62);
	}

	private void initializeOperation_Instances()
	{
		// Operation LossOfMessages_Operation_A::setP_Integer
		addToElementRepository("setP_Integer", LossOfMessages_Operation_A_setP_Integer);
		LossOfMessages_Operation_A_setP_Integer.setName("setP");
		LossOfMessages_Operation_A_setP_Integer.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setP_Integer.addOwnedParameter(LossOfMessages_Operation_A_setP_Integer_v);
		LossOfMessages_Operation_A_setP_Integer.addMethod(LossOfMessages_Operation_A_setPActivity);
		LossOfMessages_Operation_A_setP_Integer.addRedefinedOperation(LossOfMessages_Operation_I_setP_Integer);
		// Operation LossOfMessages_Operation_I::setP_Integer
		addToElementRepository("setP_Integer", LossOfMessages_Operation_I_setP_Integer);
		LossOfMessages_Operation_I_setP_Integer.setName("setP");
		LossOfMessages_Operation_I_setP_Integer.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_I_setP_Integer.addOwnedParameter(LossOfMessages_Operation_I_setP_Integer_v);
		// Operation LossOfMessages_Operation_A::A_A
		addToElementRepository("A_A", LossOfMessages_Operation_A_A_A);
		LossOfMessages_Operation_A_A_A.setName("A");
		LossOfMessages_Operation_A_A_A.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_A_A.addOwnedParameter(LossOfMessages_Operation_A_A_A_result);
		LossOfMessages_Operation_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation LossOfMessages_Operation_IImpl::setP_Integer
		addToElementRepository("setP_Integer", LossOfMessages_Operation_IImpl_setP_Integer);
		LossOfMessages_Operation_IImpl_setP_Integer.setName("setP");
		LossOfMessages_Operation_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_IImpl_setP_Integer.addOwnedParameter(LossOfMessages_Operation_IImpl_setP_Integer_v);
		LossOfMessages_Operation_IImpl_setP_Integer.addRedefinedOperation(LossOfMessages_Operation_I_setP_Integer);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin LossOfMessages_Operation_main_Value 4::result
		addToElementRepository("result", LossOfMessages_Operation_main_Value_4_result);
		LossOfMessages_Operation_main_Value_4_result.setName("result");
		LossOfMessages_Operation_main_Value_4_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin LossOfMessages_Operation_A_setPActivity_Set this.p::result
		addToElementRepository("result", LossOfMessages_Operation_A_setPActivity_Set_this_p_result);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_result.setName("result");
		LossOfMessages_Operation_A_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_Set_this_p_result.setType(LossOfMessages_Operation_A);
		// OutputPin LossOfMessages_Operation_main_A()::result
		addToElementRepository("result", LossOfMessages_Operation_main_A__result);
		LossOfMessages_Operation_main_A__result.setName("result");
		LossOfMessages_Operation_main_A__result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_A__result.setType(LossOfMessages_Operation_A);
		// OutputPin LossOfMessages_Operation_main_Create A::result
		addToElementRepository("result", LossOfMessages_Operation_main_Create_A_result);
		LossOfMessages_Operation_main_Create_A_result.setName("result");
		LossOfMessages_Operation_main_Create_A_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Create_A_result.setType(LossOfMessages_Operation_A);
		// OutputPin LossOfMessages_Operation_main_Read a.p::result
		addToElementRepository("result", LossOfMessages_Operation_main_Read_a_p_result);
		LossOfMessages_Operation_main_Read_a_p_result.setName("result");
		LossOfMessages_Operation_main_Read_a_p_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin LossOfMessages_Operation_main_Read a.q::result
		addToElementRepository("result", LossOfMessages_Operation_main_Read_a_q_result);
		LossOfMessages_Operation_main_Read_a_q_result.setName("result");
		LossOfMessages_Operation_main_Read_a_q_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_q_result.setType(LossOfMessages_Operation_I);
		// OutputPin LossOfMessages_Operation_A_setPActivity_this::result
		addToElementRepository("result", LossOfMessages_Operation_A_setPActivity_this_result);
		LossOfMessages_Operation_A_setPActivity_this_result.setName("result");
		LossOfMessages_Operation_A_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_this_result.setType(LossOfMessages_Operation_A);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport LossOfMessages_Operation::PackageImport1
		addToElementRepository("PackageImport1", LossOfMessages_Operation_PackageImport1);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter LossOfMessages_Operation_A_setP_Integer::v
		addToElementRepository("v", LossOfMessages_Operation_A_setP_Integer_v);
		LossOfMessages_Operation_A_setP_Integer_v.setName("v");
		LossOfMessages_Operation_A_setP_Integer_v.setVisibility(VisibilityKind.package_);
		
		LossOfMessages_Operation_A_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter LossOfMessages_Operation_main_testP::p
		addToElementRepository("p", LossOfMessages_Operation_main_testP_p);
		LossOfMessages_Operation_main_testP_p.setName("p");
		LossOfMessages_Operation_main_testP_p.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_main_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter LossOfMessages_Operation_A_setPActivity::v
		addToElementRepository("v", LossOfMessages_Operation_A_setPActivity_v);
		LossOfMessages_Operation_A_setPActivity_v.setName("v");
		LossOfMessages_Operation_A_setPActivity_v.setVisibility(VisibilityKind.package_);
		
		LossOfMessages_Operation_A_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter LossOfMessages_Operation_A_A_A::result
		addToElementRepository("result", LossOfMessages_Operation_A_A_A_result);
		LossOfMessages_Operation_A_A_A_result.setName("result");
		LossOfMessages_Operation_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_A_A_A_result.setType(LossOfMessages_Operation_A);
		LossOfMessages_Operation_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter LossOfMessages_Operation_IImpl_setP_Integer::v
		addToElementRepository("v", LossOfMessages_Operation_IImpl_setP_Integer_v);
		LossOfMessages_Operation_IImpl_setP_Integer_v.setName("v");
		LossOfMessages_Operation_IImpl_setP_Integer_v.setVisibility(VisibilityKind.package_);
		
		LossOfMessages_Operation_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter LossOfMessages_Operation_I_setP_Integer::v
		addToElementRepository("v", LossOfMessages_Operation_I_setP_Integer_v);
		LossOfMessages_Operation_I_setP_Integer_v.setName("v");
		LossOfMessages_Operation_I_setP_Integer_v.setVisibility(VisibilityKind.package_);
		
		LossOfMessages_Operation_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializePort_Instances()
	{
		// Port LossOfMessages_Operation_A::q
		addToElementRepository("q", LossOfMessages_Operation_A_q);
		LossOfMessages_Operation_A_q.setName("q");
		LossOfMessages_Operation_A_q.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_A_q.setType(LossOfMessages_Operation_IImpl);
		LossOfMessages_Operation_A_q.setAggregation(AggregationKind.composite);
		LossOfMessages_Operation_A_q.isService = true;
		LossOfMessages_Operation_A_q.addProvided(LossOfMessages_Operation_I);
	}

	private void initializeProperty_Instances()
	{
		// Property LossOfMessages_Operation_A::p
		addToElementRepository("p", LossOfMessages_Operation_A_p);
		LossOfMessages_Operation_A_p.setName("p");
		LossOfMessages_Operation_A_p.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Operation_A_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		LossOfMessages_Operation_A_p.setAggregation(AggregationKind.composite);
		LossOfMessages_Operation_A_p.setDefaultValue(LossOfMessages_Operation_A_p_LiteralInteger3);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction LossOfMessages_Operation_A_setPActivity::this
		addToElementRepository("this", LossOfMessages_Operation_A_setPActivity_this);
		LossOfMessages_Operation_A_setPActivity_this.setName("this");
		LossOfMessages_Operation_A_setPActivity_this.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_A_setPActivity_this.setResult(LossOfMessages_Operation_A_setPActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction LossOfMessages_Operation_main::Read a.q
		addToElementRepository("Read a.q", LossOfMessages_Operation_main_Read_a_q);
		LossOfMessages_Operation_main_Read_a_q.setName("Read a.q");
		LossOfMessages_Operation_main_Read_a_q.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_q.setStructuralFeature(LossOfMessages_Operation_A_q);
		LossOfMessages_Operation_main_Read_a_q.setObject(LossOfMessages_Operation_main_Read_a_q_object);
		LossOfMessages_Operation_main_Read_a_q.setResult(LossOfMessages_Operation_main_Read_a_q_result);
		// ReadStructuralFeatureAction LossOfMessages_Operation_main::Read a.p
		addToElementRepository("Read a.p", LossOfMessages_Operation_main_Read_a_p);
		LossOfMessages_Operation_main_Read_a_p.setName("Read a.p");
		LossOfMessages_Operation_main_Read_a_p.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Read_a_p.setStructuralFeature(LossOfMessages_Operation_A_p);
		LossOfMessages_Operation_main_Read_a_p.setObject(LossOfMessages_Operation_main_Read_a_p_object);
		LossOfMessages_Operation_main_Read_a_p.setResult(LossOfMessages_Operation_main_Read_a_p_result);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction LossOfMessages_Operation_main::Value 4
		addToElementRepository("Value 4", LossOfMessages_Operation_main_Value_4);
		LossOfMessages_Operation_main_Value_4.setName("Value 4");
		LossOfMessages_Operation_main_Value_4.setVisibility(VisibilityKind.public_);
		LossOfMessages_Operation_main_Value_4.setValue(LossOfMessages_Operation_main_Value_4_LiteralInteger47);
		LossOfMessages_Operation_main_Value_4.setResult(LossOfMessages_Operation_main_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // LossOfMessages_OperationModel
