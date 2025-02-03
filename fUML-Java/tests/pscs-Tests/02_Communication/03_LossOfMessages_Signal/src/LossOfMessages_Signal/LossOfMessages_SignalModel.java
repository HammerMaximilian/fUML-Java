/*
 * LossOfMessages_SignalModel.java
 * 
 * Auto-generated file
 */
package LossOfMessages_Signal;

import uml.commonbehavior.SignalEvent;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.Signal;
import uml.simpleclassifiers.InterfaceRealization;
import uml.actions.OutputPin;
import uml.activities.Activity;
import uml.actions.CallOperationAction;
import uml.actions.ReadStructuralFeatureAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.commonstructure.Comment;
import uml.simpleclassifiers.Interface;
import uml.classification.Parameter;
import uml.classification.Operation;
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
import uml.activities.InitialNode;
import uml.actions.AddStructuralFeatureValueAction;
import uml.actions.AcceptEventAction;
import uml.activities.ObjectFlow;
import uml.commonbehavior.OpaqueBehavior;
import utils.library.FoundationalModelLibraryModel;
import uml.simpleclassifiers.Reception;
import utils.environment.InMemoryModel;
import uml.values.LiteralInteger;
import uml.packages.Package;
import uml.structuredclassifiers.Port;
import uml.commonbehavior.Trigger;
import uml.actions.SendSignalAction;


/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class LossOfMessages_SignalModel extends InMemoryModel
{
	private static LossOfMessages_SignalModel instance;

	/*
	 * Model LossOfMessages_Signal
	 */
	public Package LossOfMessages_Signal = new Package();
		public Comment LossOfMessages_Signal_Comment0 = new Comment();
		public PackageImport LossOfMessages_Signal_PackageImport1 = new PackageImport();
		public Comment LossOfMessages_Signal_Comment2 = new Comment();
		public Interface LossOfMessages_Signal_I = new Interface();
			public Reception LossOfMessages_Signal_I_S = new Reception();
		public Activity LossOfMessages_Signal_main = new Activity();
			public ObjectFlow LossOfMessages_Signal_main_ObjectFlow3 = new ObjectFlow();
				public LiteralInteger LossOfMessages_Signal_main_ObjectFlow3_LiteralInteger4 = new LiteralInteger();
				public LiteralBoolean LossOfMessages_Signal_main_ObjectFlow3_LiteralBoolean5 = new LiteralBoolean();
			public ObjectFlow LossOfMessages_Signal_main_ObjectFlow6 = new ObjectFlow();
				public LiteralBoolean LossOfMessages_Signal_main_ObjectFlow6_LiteralBoolean7 = new LiteralBoolean();
				public LiteralInteger LossOfMessages_Signal_main_ObjectFlow6_LiteralInteger8 = new LiteralInteger();
			public ObjectFlow LossOfMessages_Signal_main_ObjectFlow9 = new ObjectFlow();
				public LiteralInteger LossOfMessages_Signal_main_ObjectFlow9_LiteralInteger10 = new LiteralInteger();
				public LiteralBoolean LossOfMessages_Signal_main_ObjectFlow9_LiteralBoolean11 = new LiteralBoolean();
			public ObjectFlow LossOfMessages_Signal_main_ObjectFlow12 = new ObjectFlow();
				public LiteralInteger LossOfMessages_Signal_main_ObjectFlow12_LiteralInteger13 = new LiteralInteger();
				public LiteralBoolean LossOfMessages_Signal_main_ObjectFlow12_LiteralBoolean14 = new LiteralBoolean();
			public ObjectFlow LossOfMessages_Signal_main_ObjectFlow15 = new ObjectFlow();
				public LiteralInteger LossOfMessages_Signal_main_ObjectFlow15_LiteralInteger16 = new LiteralInteger();
				public LiteralBoolean LossOfMessages_Signal_main_ObjectFlow15_LiteralBoolean17 = new LiteralBoolean();
			public CallBehaviorAction LossOfMessages_Signal_main_Call_testP = new CallBehaviorAction();
				public InputPin LossOfMessages_Signal_main_Call_testP_p = new InputPin();
					public LiteralInteger LossOfMessages_Signal_main_Call_testP_p_LiteralInteger18 = new LiteralInteger();
					public LiteralInteger LossOfMessages_Signal_main_Call_testP_p_LiteralInteger19 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Signal_main_Call_testP_p_LiteralUnlimitedNatural20 = new LiteralUnlimitedNatural();
			public ValueSpecificationAction LossOfMessages_Signal_main_Value_4 = new ValueSpecificationAction();
				public OutputPin LossOfMessages_Signal_main_Value_4_result = new OutputPin();
					public LiteralInteger LossOfMessages_Signal_main_Value_4_result_LiteralInteger21 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Signal_main_Value_4_result_LiteralUnlimitedNatural22 = new LiteralUnlimitedNatural();
				public LiteralInteger LossOfMessages_Signal_main_Value_4_LiteralInteger23 = new LiteralInteger();
			public OpaqueBehavior LossOfMessages_Signal_main_testP = new OpaqueBehavior();
				public Parameter LossOfMessages_Signal_main_testP_p = new Parameter();
			public CallOperationAction LossOfMessages_Signal_main_A_ = new CallOperationAction();
				public OutputPin LossOfMessages_Signal_main_A__result = new OutputPin();
					public LiteralUnlimitedNatural LossOfMessages_Signal_main_A__result_LiteralUnlimitedNatural24 = new LiteralUnlimitedNatural();
					public LiteralInteger LossOfMessages_Signal_main_A__result_LiteralInteger25 = new LiteralInteger();
					public LiteralInteger LossOfMessages_Signal_main_A__result_LiteralInteger26 = new LiteralInteger();
				public InputPin LossOfMessages_Signal_main_A__target = new InputPin();
					public LiteralInteger LossOfMessages_Signal_main_A__target_LiteralInteger27 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Signal_main_A__target_LiteralUnlimitedNatural28 = new LiteralUnlimitedNatural();
			public ReadStructuralFeatureAction LossOfMessages_Signal_main_Read_a_p = new ReadStructuralFeatureAction();
				public InputPin LossOfMessages_Signal_main_Read_a_p_object = new InputPin();
					public LiteralInteger LossOfMessages_Signal_main_Read_a_p_object_LiteralInteger29 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Signal_main_Read_a_p_object_LiteralUnlimitedNatural30 = new LiteralUnlimitedNatural();
				public OutputPin LossOfMessages_Signal_main_Read_a_p_result = new OutputPin();
					public LiteralUnlimitedNatural LossOfMessages_Signal_main_Read_a_p_result_LiteralUnlimitedNatural31 = new LiteralUnlimitedNatural();
					public LiteralInteger LossOfMessages_Signal_main_Read_a_p_result_LiteralInteger32 = new LiteralInteger();
			public ControlFlow LossOfMessages_Signal_main_ControlFlow33 = new ControlFlow();
			public ReadStructuralFeatureAction LossOfMessages_Signal_main_Read_a_q = new ReadStructuralFeatureAction();
				public InputPin LossOfMessages_Signal_main_Read_a_q_object = new InputPin();
					public LiteralUnlimitedNatural LossOfMessages_Signal_main_Read_a_q_object_LiteralUnlimitedNatural34 = new LiteralUnlimitedNatural();
					public LiteralInteger LossOfMessages_Signal_main_Read_a_q_object_LiteralInteger35 = new LiteralInteger();
				public OutputPin LossOfMessages_Signal_main_Read_a_q_result = new OutputPin();
					public LiteralInteger LossOfMessages_Signal_main_Read_a_q_result_LiteralInteger36 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Signal_main_Read_a_q_result_LiteralUnlimitedNatural37 = new LiteralUnlimitedNatural();
			public ObjectFlow LossOfMessages_Signal_main_ObjectFlow38 = new ObjectFlow();
				public LiteralBoolean LossOfMessages_Signal_main_ObjectFlow38_LiteralBoolean39 = new LiteralBoolean();
				public LiteralInteger LossOfMessages_Signal_main_ObjectFlow38_LiteralInteger40 = new LiteralInteger();
			public ObjectFlow LossOfMessages_Signal_main_ObjectFlow41 = new ObjectFlow();
				public LiteralInteger LossOfMessages_Signal_main_ObjectFlow41_LiteralInteger42 = new LiteralInteger();
				public LiteralBoolean LossOfMessages_Signal_main_ObjectFlow41_LiteralBoolean43 = new LiteralBoolean();
			public CreateObjectAction LossOfMessages_Signal_main_Create_A = new CreateObjectAction();
				public OutputPin LossOfMessages_Signal_main_Create_A_result = new OutputPin();
					public LiteralInteger LossOfMessages_Signal_main_Create_A_result_LiteralInteger44 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Signal_main_Create_A_result_LiteralUnlimitedNatural45 = new LiteralUnlimitedNatural();
			public SendSignalAction LossOfMessages_Signal_main_Send_S = new SendSignalAction();
				public InputPin LossOfMessages_Signal_main_Send_S_v = new InputPin();
					public LiteralUnlimitedNatural LossOfMessages_Signal_main_Send_S_v_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
					public LiteralInteger LossOfMessages_Signal_main_Send_S_v_LiteralInteger47 = new LiteralInteger();
					public LiteralInteger LossOfMessages_Signal_main_Send_S_v_LiteralInteger48 = new LiteralInteger();
				public InputPin LossOfMessages_Signal_main_Send_S_target = new InputPin();
					public LiteralInteger LossOfMessages_Signal_main_Send_S_target_LiteralInteger49 = new LiteralInteger();
					public LiteralUnlimitedNatural LossOfMessages_Signal_main_Send_S_target_LiteralUnlimitedNatural50 = new LiteralUnlimitedNatural();
			public ForkNode LossOfMessages_Signal_main_Fork_A = new ForkNode();
		public SignalEvent LossOfMessages_Signal_SignalEventS = new SignalEvent();
		public Class_ LossOfMessages_Signal_IImpl = new Class_();
			public InterfaceRealization LossOfMessages_Signal_IImpl_IRealization = new InterfaceRealization();
			public Reception LossOfMessages_Signal_IImpl_S = new Reception();
		public Signal LossOfMessages_Signal_S = new Signal();
			public Property LossOfMessages_Signal_S_v = new Property();
		public Class_ LossOfMessages_Signal_A = new Class_();
			public Operation LossOfMessages_Signal_A_A_A = new Operation();
				public Parameter LossOfMessages_Signal_A_A_A_result = new Parameter();
			public Property LossOfMessages_Signal_A_p = new Property();
				public LiteralInteger LossOfMessages_Signal_A_p_LiteralInteger51 = new LiteralInteger();
			public InterfaceRealization LossOfMessages_Signal_A_IRealization = new InterfaceRealization();
			public Reception LossOfMessages_Signal_A_S = new Reception();
			public Activity LossOfMessages_Signal_A_AClassifierBehavior = new Activity();
				public AddStructuralFeatureValueAction LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object = new InputPin();
						public LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural52 = new LiteralUnlimitedNatural();
						public LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralInteger53 = new LiteralInteger();
					public OutputPin LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural54 = new LiteralUnlimitedNatural();
						public LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralInteger55 = new LiteralInteger();
					public InputPin LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value = new InputPin();
						public LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural56 = new LiteralUnlimitedNatural();
						public LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralInteger57 = new LiteralInteger();
				public InitialNode LossOfMessages_Signal_A_AClassifierBehavior_Initial = new InitialNode();
				public ReadSelfAction LossOfMessages_Signal_A_AClassifierBehavior_this = new ReadSelfAction();
					public OutputPin LossOfMessages_Signal_A_AClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_this_result_LiteralInteger58 = new LiteralInteger();
						public LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural59 = new LiteralUnlimitedNatural();
				public ReadStructuralFeatureAction LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v = new ReadStructuralFeatureAction();
					public OutputPin LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result = new OutputPin();
						public LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result_LiteralInteger60 = new LiteralInteger();
						public LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural61 = new LiteralUnlimitedNatural();
					public InputPin LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object = new InputPin();
						public LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object_LiteralInteger62 = new LiteralInteger();
						public LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural63 = new LiteralUnlimitedNatural();
				public ObjectFlow LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64 = new ObjectFlow();
					public LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64_LiteralInteger65 = new LiteralInteger();
					public LiteralBoolean LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64_LiteralBoolean66 = new LiteralBoolean();
				public ObjectFlow LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67 = new ObjectFlow();
					public LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67_LiteralInteger68 = new LiteralInteger();
					public LiteralBoolean LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67_LiteralBoolean69 = new LiteralBoolean();
				public ControlFlow LossOfMessages_Signal_A_AClassifierBehavior_ControlFlow70 = new ControlFlow();
				public ObjectFlow LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71 = new ObjectFlow();
					public LiteralBoolean LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71_LiteralBoolean72 = new LiteralBoolean();
					public LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71_LiteralInteger73 = new LiteralInteger();
				public AcceptEventAction LossOfMessages_Signal_A_AClassifierBehavior_Accept_S = new AcceptEventAction();
					public OutputPin LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result = new OutputPin();
						public LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger74 = new LiteralInteger();
						public LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger75 = new LiteralInteger();
						public LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural76 = new LiteralUnlimitedNatural();
					public Trigger LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_Trigger77 = new Trigger();
			public Port LossOfMessages_Signal_A_q = new Port();

	public static LossOfMessages_SignalModel instance()
	{
		if (instance == null)
        {
            instance = new LossOfMessages_SignalModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public LossOfMessages_SignalModel()
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
		this.initializeAcceptEventAction_Instances();
		this.initializeActivity_Instances();
		this.initializeAddStructuralFeatureValueAction_Instances();
		this.initializeCallBehaviorAction_Instances();
		this.initializeCallOperationAction_Instances();
		this.initializeClass_Instances();
		this.initializeComment_Instances();
		this.initializeControlFlow_Instances();
		this.initializeCreateObjectAction_Instances();
		this.initializeForkNode_Instances();
		this.initializeFunctionBehavior_Instances();
		this.initializeInitialNode_Instances();
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
		this.initializeReception_Instances();
		this.initializeSendSignalAction_Instances();
		this.initializeSignal_Instances();
		this.initializeSignalEvent_Instances();
		this.initializeTrigger_Instances();
		this.initializeValueSpecificationAction_Instances();
	}

	private void initializeAcceptEventAction_Instances()
	{
		// AcceptEventAction LossOfMessages_Signal_A_AClassifierBehavior::Accept S
		addToElementRepository("Accept S", LossOfMessages_Signal_A_AClassifierBehavior_Accept_S);
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S.setName("Accept S");
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S.addResult(LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result);
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S.addTrigger(LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_Trigger77);
	}

	private void initializeActivity_Instances()
	{
		// Activity LossOfMessages_Signal_A::AClassifierBehavior
		addToElementRepository("AClassifierBehavior", LossOfMessages_Signal_A_AClassifierBehavior);
		LossOfMessages_Signal_A_AClassifierBehavior.setName("AClassifierBehavior");
		LossOfMessages_Signal_A_AClassifierBehavior.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior.addNode(LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p);
		LossOfMessages_Signal_A_AClassifierBehavior.addNode(LossOfMessages_Signal_A_AClassifierBehavior_Initial);
		LossOfMessages_Signal_A_AClassifierBehavior.addNode(LossOfMessages_Signal_A_AClassifierBehavior_this);
		LossOfMessages_Signal_A_AClassifierBehavior.addNode(LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v);
		LossOfMessages_Signal_A_AClassifierBehavior.addNode(LossOfMessages_Signal_A_AClassifierBehavior_Accept_S);
		LossOfMessages_Signal_A_AClassifierBehavior.addEdge(LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64);
		LossOfMessages_Signal_A_AClassifierBehavior.addEdge(LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67);
		LossOfMessages_Signal_A_AClassifierBehavior.addEdge(LossOfMessages_Signal_A_AClassifierBehavior_ControlFlow70);
		LossOfMessages_Signal_A_AClassifierBehavior.addEdge(LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71);
		// Activity LossOfMessages_Signal::main
		addToElementRepository("main", LossOfMessages_Signal_main);
		LossOfMessages_Signal_main.setName("main");
		LossOfMessages_Signal_main.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main.addOwnedBehavior(LossOfMessages_Signal_main_testP);
		LossOfMessages_Signal_main.addNode(LossOfMessages_Signal_main_A_);
		LossOfMessages_Signal_main.addNode(LossOfMessages_Signal_main_Read_a_p);
		LossOfMessages_Signal_main.addNode(LossOfMessages_Signal_main_Read_a_q);
		LossOfMessages_Signal_main.addNode(LossOfMessages_Signal_main_Create_A);
		LossOfMessages_Signal_main.addNode(LossOfMessages_Signal_main_Call_testP);
		LossOfMessages_Signal_main.addNode(LossOfMessages_Signal_main_Send_S);
		LossOfMessages_Signal_main.addNode(LossOfMessages_Signal_main_Value_4);
		LossOfMessages_Signal_main.addNode(LossOfMessages_Signal_main_Fork_A);
		LossOfMessages_Signal_main.addEdge(LossOfMessages_Signal_main_ObjectFlow3);
		LossOfMessages_Signal_main.addEdge(LossOfMessages_Signal_main_ControlFlow33);
		LossOfMessages_Signal_main.addEdge(LossOfMessages_Signal_main_ObjectFlow6);
		LossOfMessages_Signal_main.addEdge(LossOfMessages_Signal_main_ObjectFlow38);
		LossOfMessages_Signal_main.addEdge(LossOfMessages_Signal_main_ObjectFlow41);
		LossOfMessages_Signal_main.addEdge(LossOfMessages_Signal_main_ObjectFlow9);
		LossOfMessages_Signal_main.addEdge(LossOfMessages_Signal_main_ObjectFlow12);
		LossOfMessages_Signal_main.addEdge(LossOfMessages_Signal_main_ObjectFlow15);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction LossOfMessages_Signal_A_AClassifierBehavior::Set this.p
		addToElementRepository("Set this.p", LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p.setName("Set this.p");
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p.setStructuralFeature(LossOfMessages_Signal_A_p);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p.setObject(LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p.setValue(LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p.setResult(LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction LossOfMessages_Signal_main::Call testP
		addToElementRepository("Call testP", LossOfMessages_Signal_main_Call_testP);
		LossOfMessages_Signal_main_Call_testP.setName("Call testP");
		LossOfMessages_Signal_main_Call_testP.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Call_testP.setBehavior(LossOfMessages_Signal_main_testP);
		LossOfMessages_Signal_main_Call_testP.addArgument(LossOfMessages_Signal_main_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction LossOfMessages_Signal_main::A()
		addToElementRepository("A()", LossOfMessages_Signal_main_A_);
		LossOfMessages_Signal_main_A_.setName("A()");
		LossOfMessages_Signal_main_A_.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_main_A_.addResult(LossOfMessages_Signal_main_A__result);
		LossOfMessages_Signal_main_A_.setOperation(LossOfMessages_Signal_A_A_A);
		LossOfMessages_Signal_main_A_.setTarget(LossOfMessages_Signal_main_A__target);
	}

	private void initializeClass_Instances()
	{
		// Class LossOfMessages_Signal::IImpl
		addToElementRepository("IImpl", LossOfMessages_Signal_IImpl);
		LossOfMessages_Signal_IImpl.setName("IImpl");
		LossOfMessages_Signal_IImpl.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_IImpl.addInterfaceRealization(LossOfMessages_Signal_IImpl_IRealization);
		
		LossOfMessages_Signal_IImpl.addOwnedReception(LossOfMessages_Signal_IImpl_S);
		// Class LossOfMessages_Signal::A
		addToElementRepository("A", LossOfMessages_Signal_A);
		LossOfMessages_Signal_A.setName("A");
		LossOfMessages_Signal_A.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_A.addOwnedAttribute(LossOfMessages_Signal_A_p);
		LossOfMessages_Signal_A.addOwnedAttribute(LossOfMessages_Signal_A_q);
		LossOfMessages_Signal_A.setClassifierBehavior(LossOfMessages_Signal_A_AClassifierBehavior);
		LossOfMessages_Signal_A.addOwnedBehavior(LossOfMessages_Signal_A_AClassifierBehavior);
		LossOfMessages_Signal_A.addInterfaceRealization(LossOfMessages_Signal_A_IRealization);
		
		LossOfMessages_Signal_A.setIsActive(true);
		LossOfMessages_Signal_A.addOwnedOperation(LossOfMessages_Signal_A_A_A);
		LossOfMessages_Signal_A.addOwnedReception(LossOfMessages_Signal_A_S);
	}

	private void initializeComment_Instances()
	{
		// Comment LossOfMessages_Signal::Comment0
		addToElementRepository("Comment0", LossOfMessages_Signal_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment LossOfMessages_Signal::Comment2
		addToElementRepository("Comment2", LossOfMessages_Signal_Comment2);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow LossOfMessages_Signal_main::ControlFlow33
		addToElementRepository("ControlFlow33", LossOfMessages_Signal_main_ControlFlow33);
		LossOfMessages_Signal_main_ControlFlow33.setName("ControlFlow33");
		LossOfMessages_Signal_main_ControlFlow33.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_main_ControlFlow33.setSource(LossOfMessages_Signal_main_Send_S);
		LossOfMessages_Signal_main_ControlFlow33.setTarget(LossOfMessages_Signal_main_Read_a_p);
		// ControlFlow LossOfMessages_Signal_A_AClassifierBehavior::ControlFlow70
		addToElementRepository("ControlFlow70", LossOfMessages_Signal_A_AClassifierBehavior_ControlFlow70);
		LossOfMessages_Signal_A_AClassifierBehavior_ControlFlow70.setName("ControlFlow70");
		LossOfMessages_Signal_A_AClassifierBehavior_ControlFlow70.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_A_AClassifierBehavior_ControlFlow70.setSource(LossOfMessages_Signal_A_AClassifierBehavior_Initial);
		LossOfMessages_Signal_A_AClassifierBehavior_ControlFlow70.setTarget(LossOfMessages_Signal_A_AClassifierBehavior_Accept_S);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction LossOfMessages_Signal_main::Create A
		addToElementRepository("Create A", LossOfMessages_Signal_main_Create_A);
		LossOfMessages_Signal_main_Create_A.setName("Create A");
		LossOfMessages_Signal_main_Create_A.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Create_A.setClassifier(LossOfMessages_Signal_A);
		LossOfMessages_Signal_main_Create_A.setResult(LossOfMessages_Signal_main_Create_A_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode LossOfMessages_Signal_main::Fork A
		addToElementRepository("Fork A", LossOfMessages_Signal_main_Fork_A);
		LossOfMessages_Signal_main_Fork_A.setName("Fork A");
		LossOfMessages_Signal_main_Fork_A.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior LossOfMessages_Signal_main::testP
		addToElementRepository("testP", LossOfMessages_Signal_main_testP);
		LossOfMessages_Signal_main_testP.setName("testP");
		LossOfMessages_Signal_main_testP.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_main_testP.addOwnedParameter(LossOfMessages_Signal_main_testP_p);
		LossOfMessages_Signal_main_testP.addLanguage("Java");
		LossOfMessages_Signal_main_testP.addLanguage("Import");
		LossOfMessages_Signal_main_testP.addBody("System.out.println(\"Asserting a.p != 4\");  	// Test parameter p 	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument p = \" + p); 	 	System.out.println(\"a.p == \" + p); 	System.out.print(\"Signal lost: \");  	if(p != 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		LossOfMessages_Signal_main_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeInitialNode_Instances()
	{
		// InitialNode LossOfMessages_Signal_A_AClassifierBehavior::Initial
		addToElementRepository("Initial", LossOfMessages_Signal_A_AClassifierBehavior_Initial);
		LossOfMessages_Signal_A_AClassifierBehavior_Initial.setName("Initial");
		LossOfMessages_Signal_A_AClassifierBehavior_Initial.setVisibility(VisibilityKind.public_);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin LossOfMessages_Signal_main_Call testP::p
		addToElementRepository("p", LossOfMessages_Signal_main_Call_testP_p);
		LossOfMessages_Signal_main_Call_testP_p.setName("p");
		LossOfMessages_Signal_main_Call_testP_p.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin LossOfMessages_Signal_main_Read a.p::object
		addToElementRepository("object", LossOfMessages_Signal_main_Read_a_p_object);
		LossOfMessages_Signal_main_Read_a_p_object.setName("object");
		LossOfMessages_Signal_main_Read_a_p_object.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_p_object.setType(LossOfMessages_Signal_A);
		// InputPin LossOfMessages_Signal_A_AClassifierBehavior_Set this.p::object
		addToElementRepository("object", LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object.setName("object");
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object.setType(LossOfMessages_Signal_A);
		// InputPin LossOfMessages_Signal_A_AClassifierBehavior_Read s.v::object
		addToElementRepository("object", LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object.setName("object");
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object.setVisibility(VisibilityKind.public_);
		// InputPin LossOfMessages_Signal_main_Send S::v
		addToElementRepository("v", LossOfMessages_Signal_main_Send_S_v);
		LossOfMessages_Signal_main_Send_S_v.setName("v");
		LossOfMessages_Signal_main_Send_S_v.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Send_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin LossOfMessages_Signal_main_Send S::target
		addToElementRepository("target", LossOfMessages_Signal_main_Send_S_target);
		LossOfMessages_Signal_main_Send_S_target.setName("target");
		LossOfMessages_Signal_main_Send_S_target.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Send_S_target.setType(LossOfMessages_Signal_IImpl);
		// InputPin LossOfMessages_Signal_A_AClassifierBehavior_Set this.p::value
		addToElementRepository("value", LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value.setName("value");
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin LossOfMessages_Signal_main_Read a.q::object
		addToElementRepository("object", LossOfMessages_Signal_main_Read_a_q_object);
		LossOfMessages_Signal_main_Read_a_q_object.setName("object");
		LossOfMessages_Signal_main_Read_a_q_object.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_q_object.setType(LossOfMessages_Signal_A);
		// InputPin LossOfMessages_Signal_main_A()::target
		addToElementRepository("target", LossOfMessages_Signal_main_A__target);
		LossOfMessages_Signal_main_A__target.setName("target");
		LossOfMessages_Signal_main_A__target.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_A__target.setType(LossOfMessages_Signal_A);
	}

	private void initializeInterface_Instances()
	{
		// Interface LossOfMessages_Signal::I
		addToElementRepository("I", LossOfMessages_Signal_I);
		LossOfMessages_Signal_I.setName("I");
		LossOfMessages_Signal_I.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_I.addOwnedReception(LossOfMessages_Signal_I_S);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization LossOfMessages_Signal_A::IRealization
		addToElementRepository("IRealization", LossOfMessages_Signal_A_IRealization);
		LossOfMessages_Signal_A_IRealization.setName("IRealization");
		LossOfMessages_Signal_A_IRealization.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_IRealization.setContract(LossOfMessages_Signal_I);
		// InterfaceRealization LossOfMessages_Signal_IImpl::IRealization
		addToElementRepository("IRealization", LossOfMessages_Signal_IImpl_IRealization);
		LossOfMessages_Signal_IImpl_IRealization.setName("IRealization");
		LossOfMessages_Signal_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_IImpl_IRealization.setContract(LossOfMessages_Signal_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean LossOfMessages_Signal_main_ObjectFlow38::LiteralBoolean39
		addToElementRepository("LiteralBoolean39", LossOfMessages_Signal_main_ObjectFlow38_LiteralBoolean39);
		LossOfMessages_Signal_main_ObjectFlow38_LiteralBoolean39.setName("LiteralBoolean39");
		LossOfMessages_Signal_main_ObjectFlow38_LiteralBoolean39.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow38_LiteralBoolean39.setValue(true);
		// LiteralBoolean LossOfMessages_Signal_main_ObjectFlow6::LiteralBoolean7
		addToElementRepository("LiteralBoolean7", LossOfMessages_Signal_main_ObjectFlow6_LiteralBoolean7);
		LossOfMessages_Signal_main_ObjectFlow6_LiteralBoolean7.setName("LiteralBoolean7");
		LossOfMessages_Signal_main_ObjectFlow6_LiteralBoolean7.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow6_LiteralBoolean7.setValue(true);
		// LiteralBoolean LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71::LiteralBoolean72
		addToElementRepository("LiteralBoolean72", LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71_LiteralBoolean72);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71_LiteralBoolean72.setName("LiteralBoolean72");
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71_LiteralBoolean72.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71_LiteralBoolean72.setValue(true);
		// LiteralBoolean LossOfMessages_Signal_main_ObjectFlow12::LiteralBoolean14
		addToElementRepository("LiteralBoolean14", LossOfMessages_Signal_main_ObjectFlow12_LiteralBoolean14);
		LossOfMessages_Signal_main_ObjectFlow12_LiteralBoolean14.setName("LiteralBoolean14");
		LossOfMessages_Signal_main_ObjectFlow12_LiteralBoolean14.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow12_LiteralBoolean14.setValue(true);
		// LiteralBoolean LossOfMessages_Signal_main_ObjectFlow15::LiteralBoolean17
		addToElementRepository("LiteralBoolean17", LossOfMessages_Signal_main_ObjectFlow15_LiteralBoolean17);
		LossOfMessages_Signal_main_ObjectFlow15_LiteralBoolean17.setName("LiteralBoolean17");
		LossOfMessages_Signal_main_ObjectFlow15_LiteralBoolean17.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow15_LiteralBoolean17.setValue(true);
		// LiteralBoolean LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64::LiteralBoolean66
		addToElementRepository("LiteralBoolean66", LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64_LiteralBoolean66);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64_LiteralBoolean66.setName("LiteralBoolean66");
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64_LiteralBoolean66.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64_LiteralBoolean66.setValue(true);
		// LiteralBoolean LossOfMessages_Signal_main_ObjectFlow9::LiteralBoolean11
		addToElementRepository("LiteralBoolean11", LossOfMessages_Signal_main_ObjectFlow9_LiteralBoolean11);
		LossOfMessages_Signal_main_ObjectFlow9_LiteralBoolean11.setName("LiteralBoolean11");
		LossOfMessages_Signal_main_ObjectFlow9_LiteralBoolean11.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow9_LiteralBoolean11.setValue(true);
		// LiteralBoolean LossOfMessages_Signal_main_ObjectFlow41::LiteralBoolean43
		addToElementRepository("LiteralBoolean43", LossOfMessages_Signal_main_ObjectFlow41_LiteralBoolean43);
		LossOfMessages_Signal_main_ObjectFlow41_LiteralBoolean43.setName("LiteralBoolean43");
		LossOfMessages_Signal_main_ObjectFlow41_LiteralBoolean43.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow41_LiteralBoolean43.setValue(true);
		// LiteralBoolean LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67::LiteralBoolean69
		addToElementRepository("LiteralBoolean69", LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67_LiteralBoolean69);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67_LiteralBoolean69.setName("LiteralBoolean69");
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67_LiteralBoolean69.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67_LiteralBoolean69.setValue(true);
		// LiteralBoolean LossOfMessages_Signal_main_ObjectFlow3::LiteralBoolean5
		addToElementRepository("LiteralBoolean5", LossOfMessages_Signal_main_ObjectFlow3_LiteralBoolean5);
		LossOfMessages_Signal_main_ObjectFlow3_LiteralBoolean5.setName("LiteralBoolean5");
		LossOfMessages_Signal_main_ObjectFlow3_LiteralBoolean5.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow3_LiteralBoolean5.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Accept S_result::LiteralInteger74
		addToElementRepository("LiteralInteger74", LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger74);
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger74.setName("LiteralInteger74");
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger74.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger74.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_ObjectFlow12::LiteralInteger13
		addToElementRepository("LiteralInteger13", LossOfMessages_Signal_main_ObjectFlow12_LiteralInteger13);
		LossOfMessages_Signal_main_ObjectFlow12_LiteralInteger13.setName("LiteralInteger13");
		LossOfMessages_Signal_main_ObjectFlow12_LiteralInteger13.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow12_LiteralInteger13.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_Send S_v::LiteralInteger47
		addToElementRepository("LiteralInteger47", LossOfMessages_Signal_main_Send_S_v_LiteralInteger47);
		LossOfMessages_Signal_main_Send_S_v_LiteralInteger47.setName("LiteralInteger47");
		LossOfMessages_Signal_main_Send_S_v_LiteralInteger47.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Send_S_v_LiteralInteger47.setValue(1);
		// LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Set this.p_object::LiteralInteger53
		addToElementRepository("LiteralInteger53", LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralInteger53);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralInteger53.setName("LiteralInteger53");
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralInteger53.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralInteger53.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_Value 4_result::LiteralInteger21
		addToElementRepository("LiteralInteger21", LossOfMessages_Signal_main_Value_4_result_LiteralInteger21);
		LossOfMessages_Signal_main_Value_4_result_LiteralInteger21.setName("LiteralInteger21");
		LossOfMessages_Signal_main_Value_4_result_LiteralInteger21.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Value_4_result_LiteralInteger21.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_Send S_v::LiteralInteger48
		addToElementRepository("LiteralInteger48", LossOfMessages_Signal_main_Send_S_v_LiteralInteger48);
		LossOfMessages_Signal_main_Send_S_v_LiteralInteger48.setName("LiteralInteger48");
		LossOfMessages_Signal_main_Send_S_v_LiteralInteger48.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Send_S_v_LiteralInteger48.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_ObjectFlow38::LiteralInteger40
		addToElementRepository("LiteralInteger40", LossOfMessages_Signal_main_ObjectFlow38_LiteralInteger40);
		LossOfMessages_Signal_main_ObjectFlow38_LiteralInteger40.setName("LiteralInteger40");
		LossOfMessages_Signal_main_ObjectFlow38_LiteralInteger40.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow38_LiteralInteger40.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_Call testP_p::LiteralInteger19
		addToElementRepository("LiteralInteger19", LossOfMessages_Signal_main_Call_testP_p_LiteralInteger19);
		LossOfMessages_Signal_main_Call_testP_p_LiteralInteger19.setName("LiteralInteger19");
		LossOfMessages_Signal_main_Call_testP_p_LiteralInteger19.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Call_testP_p_LiteralInteger19.setValue(1);
		// LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Read s.v_object::LiteralInteger62
		addToElementRepository("LiteralInteger62", LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object_LiteralInteger62);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object_LiteralInteger62.setName("LiteralInteger62");
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object_LiteralInteger62.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object_LiteralInteger62.setValue(1);
		// LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Set this.p_value::LiteralInteger57
		addToElementRepository("LiteralInteger57", LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralInteger57);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralInteger57.setName("LiteralInteger57");
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralInteger57.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralInteger57.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_A()_target::LiteralInteger27
		addToElementRepository("LiteralInteger27", LossOfMessages_Signal_main_A__target_LiteralInteger27);
		LossOfMessages_Signal_main_A__target_LiteralInteger27.setName("LiteralInteger27");
		LossOfMessages_Signal_main_A__target_LiteralInteger27.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_A__target_LiteralInteger27.setValue(1);
		// LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_this_result::LiteralInteger58
		addToElementRepository("LiteralInteger58", LossOfMessages_Signal_A_AClassifierBehavior_this_result_LiteralInteger58);
		LossOfMessages_Signal_A_AClassifierBehavior_this_result_LiteralInteger58.setName("LiteralInteger58");
		LossOfMessages_Signal_A_AClassifierBehavior_this_result_LiteralInteger58.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_this_result_LiteralInteger58.setValue(1);
		// LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Read s.v_result::LiteralInteger60
		addToElementRepository("LiteralInteger60", LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result_LiteralInteger60);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result_LiteralInteger60.setName("LiteralInteger60");
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result_LiteralInteger60.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result_LiteralInteger60.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_Read a.q_object::LiteralInteger35
		addToElementRepository("LiteralInteger35", LossOfMessages_Signal_main_Read_a_q_object_LiteralInteger35);
		LossOfMessages_Signal_main_Read_a_q_object_LiteralInteger35.setName("LiteralInteger35");
		LossOfMessages_Signal_main_Read_a_q_object_LiteralInteger35.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_q_object_LiteralInteger35.setValue(1);
		// LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Accept S_result::LiteralInteger75
		addToElementRepository("LiteralInteger75", LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger75);
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger75.setName("LiteralInteger75");
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger75.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger75.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_Value 4::LiteralInteger23
		addToElementRepository("LiteralInteger23", LossOfMessages_Signal_main_Value_4_LiteralInteger23);
		LossOfMessages_Signal_main_Value_4_LiteralInteger23.setName("LiteralInteger23");
		LossOfMessages_Signal_main_Value_4_LiteralInteger23.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Value_4_LiteralInteger23.setValue(4);
		// LiteralInteger LossOfMessages_Signal_main_Read a.q_result::LiteralInteger36
		addToElementRepository("LiteralInteger36", LossOfMessages_Signal_main_Read_a_q_result_LiteralInteger36);
		LossOfMessages_Signal_main_Read_a_q_result_LiteralInteger36.setName("LiteralInteger36");
		LossOfMessages_Signal_main_Read_a_q_result_LiteralInteger36.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_q_result_LiteralInteger36.setValue(1);
		// LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_Set this.p_result::LiteralInteger55
		addToElementRepository("LiteralInteger55", LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralInteger55);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralInteger55.setName("LiteralInteger55");
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralInteger55.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralInteger55.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_Send S_target::LiteralInteger49
		addToElementRepository("LiteralInteger49", LossOfMessages_Signal_main_Send_S_target_LiteralInteger49);
		LossOfMessages_Signal_main_Send_S_target_LiteralInteger49.setName("LiteralInteger49");
		LossOfMessages_Signal_main_Send_S_target_LiteralInteger49.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Send_S_target_LiteralInteger49.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_Call testP_p::LiteralInteger18
		addToElementRepository("LiteralInteger18", LossOfMessages_Signal_main_Call_testP_p_LiteralInteger18);
		LossOfMessages_Signal_main_Call_testP_p_LiteralInteger18.setName("LiteralInteger18");
		LossOfMessages_Signal_main_Call_testP_p_LiteralInteger18.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Call_testP_p_LiteralInteger18.setValue(1);
		// LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64::LiteralInteger65
		addToElementRepository("LiteralInteger65", LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64_LiteralInteger65);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64_LiteralInteger65.setName("LiteralInteger65");
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64_LiteralInteger65.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64_LiteralInteger65.setValue(1);
		// LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71::LiteralInteger73
		addToElementRepository("LiteralInteger73", LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71_LiteralInteger73);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71_LiteralInteger73.setName("LiteralInteger73");
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71_LiteralInteger73.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71_LiteralInteger73.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_ObjectFlow3::LiteralInteger4
		addToElementRepository("LiteralInteger4", LossOfMessages_Signal_main_ObjectFlow3_LiteralInteger4);
		LossOfMessages_Signal_main_ObjectFlow3_LiteralInteger4.setName("LiteralInteger4");
		LossOfMessages_Signal_main_ObjectFlow3_LiteralInteger4.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow3_LiteralInteger4.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_A()_result::LiteralInteger25
		addToElementRepository("LiteralInteger25", LossOfMessages_Signal_main_A__result_LiteralInteger25);
		LossOfMessages_Signal_main_A__result_LiteralInteger25.setName("LiteralInteger25");
		LossOfMessages_Signal_main_A__result_LiteralInteger25.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_A__result_LiteralInteger25.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_ObjectFlow9::LiteralInteger10
		addToElementRepository("LiteralInteger10", LossOfMessages_Signal_main_ObjectFlow9_LiteralInteger10);
		LossOfMessages_Signal_main_ObjectFlow9_LiteralInteger10.setName("LiteralInteger10");
		LossOfMessages_Signal_main_ObjectFlow9_LiteralInteger10.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow9_LiteralInteger10.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_Read a.p_result::LiteralInteger32
		addToElementRepository("LiteralInteger32", LossOfMessages_Signal_main_Read_a_p_result_LiteralInteger32);
		LossOfMessages_Signal_main_Read_a_p_result_LiteralInteger32.setName("LiteralInteger32");
		LossOfMessages_Signal_main_Read_a_p_result_LiteralInteger32.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_p_result_LiteralInteger32.setValue(1);
		// LiteralInteger LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67::LiteralInteger68
		addToElementRepository("LiteralInteger68", LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67_LiteralInteger68);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67_LiteralInteger68.setName("LiteralInteger68");
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67_LiteralInteger68.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67_LiteralInteger68.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_ObjectFlow41::LiteralInteger42
		addToElementRepository("LiteralInteger42", LossOfMessages_Signal_main_ObjectFlow41_LiteralInteger42);
		LossOfMessages_Signal_main_ObjectFlow41_LiteralInteger42.setName("LiteralInteger42");
		LossOfMessages_Signal_main_ObjectFlow41_LiteralInteger42.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow41_LiteralInteger42.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_Create A_result::LiteralInteger44
		addToElementRepository("LiteralInteger44", LossOfMessages_Signal_main_Create_A_result_LiteralInteger44);
		LossOfMessages_Signal_main_Create_A_result_LiteralInteger44.setName("LiteralInteger44");
		LossOfMessages_Signal_main_Create_A_result_LiteralInteger44.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Create_A_result_LiteralInteger44.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_ObjectFlow15::LiteralInteger16
		addToElementRepository("LiteralInteger16", LossOfMessages_Signal_main_ObjectFlow15_LiteralInteger16);
		LossOfMessages_Signal_main_ObjectFlow15_LiteralInteger16.setName("LiteralInteger16");
		LossOfMessages_Signal_main_ObjectFlow15_LiteralInteger16.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow15_LiteralInteger16.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_A()_result::LiteralInteger26
		addToElementRepository("LiteralInteger26", LossOfMessages_Signal_main_A__result_LiteralInteger26);
		LossOfMessages_Signal_main_A__result_LiteralInteger26.setName("LiteralInteger26");
		LossOfMessages_Signal_main_A__result_LiteralInteger26.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_A__result_LiteralInteger26.setValue(1);
		// LiteralInteger LossOfMessages_Signal_A_p::LiteralInteger51
		addToElementRepository("LiteralInteger51", LossOfMessages_Signal_A_p_LiteralInteger51);
		LossOfMessages_Signal_A_p_LiteralInteger51.setName("LiteralInteger51");
		LossOfMessages_Signal_A_p_LiteralInteger51.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_p_LiteralInteger51.setValue(0);
		// LiteralInteger LossOfMessages_Signal_main_Read a.p_object::LiteralInteger29
		addToElementRepository("LiteralInteger29", LossOfMessages_Signal_main_Read_a_p_object_LiteralInteger29);
		LossOfMessages_Signal_main_Read_a_p_object_LiteralInteger29.setName("LiteralInteger29");
		LossOfMessages_Signal_main_Read_a_p_object_LiteralInteger29.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_p_object_LiteralInteger29.setValue(1);
		// LiteralInteger LossOfMessages_Signal_main_ObjectFlow6::LiteralInteger8
		addToElementRepository("LiteralInteger8", LossOfMessages_Signal_main_ObjectFlow6_LiteralInteger8);
		LossOfMessages_Signal_main_ObjectFlow6_LiteralInteger8.setName("LiteralInteger8");
		LossOfMessages_Signal_main_ObjectFlow6_LiteralInteger8.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_ObjectFlow6_LiteralInteger8.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_Set this.p_value::LiteralUnlimitedNatural56
		addToElementRepository("LiteralUnlimitedNatural56", LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural56);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural56.setName("LiteralUnlimitedNatural56");
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural56.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural56.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_main_Create A_result::LiteralUnlimitedNatural45
		addToElementRepository("LiteralUnlimitedNatural45", LossOfMessages_Signal_main_Create_A_result_LiteralUnlimitedNatural45);
		LossOfMessages_Signal_main_Create_A_result_LiteralUnlimitedNatural45.setName("LiteralUnlimitedNatural45");
		LossOfMessages_Signal_main_Create_A_result_LiteralUnlimitedNatural45.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Create_A_result_LiteralUnlimitedNatural45.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_Read s.v_result::LiteralUnlimitedNatural61
		addToElementRepository("LiteralUnlimitedNatural61", LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural61);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural61.setName("LiteralUnlimitedNatural61");
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural61.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural61.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_main_Send S_target::LiteralUnlimitedNatural50
		addToElementRepository("LiteralUnlimitedNatural50", LossOfMessages_Signal_main_Send_S_target_LiteralUnlimitedNatural50);
		LossOfMessages_Signal_main_Send_S_target_LiteralUnlimitedNatural50.setName("LiteralUnlimitedNatural50");
		LossOfMessages_Signal_main_Send_S_target_LiteralUnlimitedNatural50.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Send_S_target_LiteralUnlimitedNatural50.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_main_A()_target::LiteralUnlimitedNatural28
		addToElementRepository("LiteralUnlimitedNatural28", LossOfMessages_Signal_main_A__target_LiteralUnlimitedNatural28);
		LossOfMessages_Signal_main_A__target_LiteralUnlimitedNatural28.setName("LiteralUnlimitedNatural28");
		LossOfMessages_Signal_main_A__target_LiteralUnlimitedNatural28.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_A__target_LiteralUnlimitedNatural28.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_main_Read a.q_result::LiteralUnlimitedNatural37
		addToElementRepository("LiteralUnlimitedNatural37", LossOfMessages_Signal_main_Read_a_q_result_LiteralUnlimitedNatural37);
		LossOfMessages_Signal_main_Read_a_q_result_LiteralUnlimitedNatural37.setName("LiteralUnlimitedNatural37");
		LossOfMessages_Signal_main_Read_a_q_result_LiteralUnlimitedNatural37.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_q_result_LiteralUnlimitedNatural37.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_Set this.p_object::LiteralUnlimitedNatural52
		addToElementRepository("LiteralUnlimitedNatural52", LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural52);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural52.setName("LiteralUnlimitedNatural52");
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural52.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural52.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_main_Send S_v::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", LossOfMessages_Signal_main_Send_S_v_LiteralUnlimitedNatural46);
		LossOfMessages_Signal_main_Send_S_v_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		LossOfMessages_Signal_main_Send_S_v_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Send_S_v_LiteralUnlimitedNatural46.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_Set this.p_result::LiteralUnlimitedNatural54
		addToElementRepository("LiteralUnlimitedNatural54", LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural54);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural54.setName("LiteralUnlimitedNatural54");
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural54.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural54.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_main_Read a.q_object::LiteralUnlimitedNatural34
		addToElementRepository("LiteralUnlimitedNatural34", LossOfMessages_Signal_main_Read_a_q_object_LiteralUnlimitedNatural34);
		LossOfMessages_Signal_main_Read_a_q_object_LiteralUnlimitedNatural34.setName("LiteralUnlimitedNatural34");
		LossOfMessages_Signal_main_Read_a_q_object_LiteralUnlimitedNatural34.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_q_object_LiteralUnlimitedNatural34.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_Read s.v_object::LiteralUnlimitedNatural63
		addToElementRepository("LiteralUnlimitedNatural63", LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural63);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural63.setName("LiteralUnlimitedNatural63");
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural63.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural63.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_main_Read a.p_result::LiteralUnlimitedNatural31
		addToElementRepository("LiteralUnlimitedNatural31", LossOfMessages_Signal_main_Read_a_p_result_LiteralUnlimitedNatural31);
		LossOfMessages_Signal_main_Read_a_p_result_LiteralUnlimitedNatural31.setName("LiteralUnlimitedNatural31");
		LossOfMessages_Signal_main_Read_a_p_result_LiteralUnlimitedNatural31.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_p_result_LiteralUnlimitedNatural31.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_main_A()_result::LiteralUnlimitedNatural24
		addToElementRepository("LiteralUnlimitedNatural24", LossOfMessages_Signal_main_A__result_LiteralUnlimitedNatural24);
		LossOfMessages_Signal_main_A__result_LiteralUnlimitedNatural24.setName("LiteralUnlimitedNatural24");
		LossOfMessages_Signal_main_A__result_LiteralUnlimitedNatural24.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_A__result_LiteralUnlimitedNatural24.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_main_Call testP_p::LiteralUnlimitedNatural20
		addToElementRepository("LiteralUnlimitedNatural20", LossOfMessages_Signal_main_Call_testP_p_LiteralUnlimitedNatural20);
		LossOfMessages_Signal_main_Call_testP_p_LiteralUnlimitedNatural20.setName("LiteralUnlimitedNatural20");
		LossOfMessages_Signal_main_Call_testP_p_LiteralUnlimitedNatural20.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Call_testP_p_LiteralUnlimitedNatural20.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_this_result::LiteralUnlimitedNatural59
		addToElementRepository("LiteralUnlimitedNatural59", LossOfMessages_Signal_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural59);
		LossOfMessages_Signal_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural59.setName("LiteralUnlimitedNatural59");
		LossOfMessages_Signal_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural59.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural59.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_main_Value 4_result::LiteralUnlimitedNatural22
		addToElementRepository("LiteralUnlimitedNatural22", LossOfMessages_Signal_main_Value_4_result_LiteralUnlimitedNatural22);
		LossOfMessages_Signal_main_Value_4_result_LiteralUnlimitedNatural22.setName("LiteralUnlimitedNatural22");
		LossOfMessages_Signal_main_Value_4_result_LiteralUnlimitedNatural22.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Value_4_result_LiteralUnlimitedNatural22.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_main_Read a.p_object::LiteralUnlimitedNatural30
		addToElementRepository("LiteralUnlimitedNatural30", LossOfMessages_Signal_main_Read_a_p_object_LiteralUnlimitedNatural30);
		LossOfMessages_Signal_main_Read_a_p_object_LiteralUnlimitedNatural30.setName("LiteralUnlimitedNatural30");
		LossOfMessages_Signal_main_Read_a_p_object_LiteralUnlimitedNatural30.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_p_object_LiteralUnlimitedNatural30.setValue(1);
		// LiteralUnlimitedNatural LossOfMessages_Signal_A_AClassifierBehavior_Accept S_result::LiteralUnlimitedNatural76
		addToElementRepository("LiteralUnlimitedNatural76", LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural76);
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural76.setName("LiteralUnlimitedNatural76");
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural76.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural76.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow LossOfMessages_Signal_main::ObjectFlow3
		addToElementRepository("ObjectFlow3", LossOfMessages_Signal_main_ObjectFlow3);
		LossOfMessages_Signal_main_ObjectFlow3.setName("ObjectFlow3");
		LossOfMessages_Signal_main_ObjectFlow3.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_main_ObjectFlow3.setSource(LossOfMessages_Signal_main_Create_A_result);
		LossOfMessages_Signal_main_ObjectFlow3.setTarget(LossOfMessages_Signal_main_A__target);
		LossOfMessages_Signal_main_ObjectFlow3.setGuard(LossOfMessages_Signal_main_ObjectFlow3_LiteralBoolean5);
		// ObjectFlow LossOfMessages_Signal_main::ObjectFlow6
		addToElementRepository("ObjectFlow6", LossOfMessages_Signal_main_ObjectFlow6);
		LossOfMessages_Signal_main_ObjectFlow6.setName("ObjectFlow6");
		LossOfMessages_Signal_main_ObjectFlow6.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_main_ObjectFlow6.setSource(LossOfMessages_Signal_main_Value_4_result);
		LossOfMessages_Signal_main_ObjectFlow6.setTarget(LossOfMessages_Signal_main_Send_S_v);
		LossOfMessages_Signal_main_ObjectFlow6.setGuard(LossOfMessages_Signal_main_ObjectFlow6_LiteralBoolean7);
		// ObjectFlow LossOfMessages_Signal_main::ObjectFlow41
		addToElementRepository("ObjectFlow41", LossOfMessages_Signal_main_ObjectFlow41);
		LossOfMessages_Signal_main_ObjectFlow41.setName("ObjectFlow41");
		LossOfMessages_Signal_main_ObjectFlow41.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_main_ObjectFlow41.setSource(LossOfMessages_Signal_main_Fork_A);
		LossOfMessages_Signal_main_ObjectFlow41.setTarget(LossOfMessages_Signal_main_Read_a_p_object);
		LossOfMessages_Signal_main_ObjectFlow41.setGuard(LossOfMessages_Signal_main_ObjectFlow41_LiteralBoolean43);
		// ObjectFlow LossOfMessages_Signal_main::ObjectFlow38
		addToElementRepository("ObjectFlow38", LossOfMessages_Signal_main_ObjectFlow38);
		LossOfMessages_Signal_main_ObjectFlow38.setName("ObjectFlow38");
		LossOfMessages_Signal_main_ObjectFlow38.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_main_ObjectFlow38.setSource(LossOfMessages_Signal_main_A__result);
		LossOfMessages_Signal_main_ObjectFlow38.setTarget(LossOfMessages_Signal_main_Fork_A);
		LossOfMessages_Signal_main_ObjectFlow38.setGuard(LossOfMessages_Signal_main_ObjectFlow38_LiteralBoolean39);
		// ObjectFlow LossOfMessages_Signal_A_AClassifierBehavior::ObjectFlow64
		addToElementRepository("ObjectFlow64", LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64.setName("ObjectFlow64");
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64.setSource(LossOfMessages_Signal_A_AClassifierBehavior_this_result);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64.setTarget(LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_object);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64.setGuard(LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow64_LiteralBoolean66);
		// ObjectFlow LossOfMessages_Signal_A_AClassifierBehavior::ObjectFlow67
		addToElementRepository("ObjectFlow67", LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67.setName("ObjectFlow67");
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67.setSource(LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67.setTarget(LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67.setGuard(LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow67_LiteralBoolean69);
		// ObjectFlow LossOfMessages_Signal_main::ObjectFlow9
		addToElementRepository("ObjectFlow9", LossOfMessages_Signal_main_ObjectFlow9);
		LossOfMessages_Signal_main_ObjectFlow9.setName("ObjectFlow9");
		LossOfMessages_Signal_main_ObjectFlow9.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_main_ObjectFlow9.setSource(LossOfMessages_Signal_main_Fork_A);
		LossOfMessages_Signal_main_ObjectFlow9.setTarget(LossOfMessages_Signal_main_Read_a_q_object);
		LossOfMessages_Signal_main_ObjectFlow9.setGuard(LossOfMessages_Signal_main_ObjectFlow9_LiteralBoolean11);
		// ObjectFlow LossOfMessages_Signal_main::ObjectFlow15
		addToElementRepository("ObjectFlow15", LossOfMessages_Signal_main_ObjectFlow15);
		LossOfMessages_Signal_main_ObjectFlow15.setName("ObjectFlow15");
		LossOfMessages_Signal_main_ObjectFlow15.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_main_ObjectFlow15.setSource(LossOfMessages_Signal_main_Read_a_q_result);
		LossOfMessages_Signal_main_ObjectFlow15.setTarget(LossOfMessages_Signal_main_Send_S_target);
		LossOfMessages_Signal_main_ObjectFlow15.setGuard(LossOfMessages_Signal_main_ObjectFlow15_LiteralBoolean17);
		// ObjectFlow LossOfMessages_Signal_main::ObjectFlow12
		addToElementRepository("ObjectFlow12", LossOfMessages_Signal_main_ObjectFlow12);
		LossOfMessages_Signal_main_ObjectFlow12.setName("ObjectFlow12");
		LossOfMessages_Signal_main_ObjectFlow12.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_main_ObjectFlow12.setSource(LossOfMessages_Signal_main_Read_a_p_result);
		LossOfMessages_Signal_main_ObjectFlow12.setTarget(LossOfMessages_Signal_main_Call_testP_p);
		LossOfMessages_Signal_main_ObjectFlow12.setGuard(LossOfMessages_Signal_main_ObjectFlow12_LiteralBoolean14);
		// ObjectFlow LossOfMessages_Signal_A_AClassifierBehavior::ObjectFlow71
		addToElementRepository("ObjectFlow71", LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71.setName("ObjectFlow71");
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71.setSource(LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71.setTarget(LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_value);
		LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71.setGuard(LossOfMessages_Signal_A_AClassifierBehavior_ObjectFlow71_LiteralBoolean72);
	}

	private void initializeOperation_Instances()
	{
		// Operation LossOfMessages_Signal_A::A_A
		addToElementRepository("A_A", LossOfMessages_Signal_A_A_A);
		LossOfMessages_Signal_A_A_A.setName("A");
		LossOfMessages_Signal_A_A_A.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_A_A.addOwnedParameter(LossOfMessages_Signal_A_A_A_result);
		LossOfMessages_Signal_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin LossOfMessages_Signal_main_Value 4::result
		addToElementRepository("result", LossOfMessages_Signal_main_Value_4_result);
		LossOfMessages_Signal_main_Value_4_result.setName("result");
		LossOfMessages_Signal_main_Value_4_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin LossOfMessages_Signal_A_AClassifierBehavior_Read s.v::result
		addToElementRepository("result", LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result.setName("result");
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin LossOfMessages_Signal_A_AClassifierBehavior_Accept S::result
		addToElementRepository("result", LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result);
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result.setName("result");
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_result.setType(LossOfMessages_Signal_S);
		// OutputPin LossOfMessages_Signal_main_Read a.p::result
		addToElementRepository("result", LossOfMessages_Signal_main_Read_a_p_result);
		LossOfMessages_Signal_main_Read_a_p_result.setName("result");
		LossOfMessages_Signal_main_Read_a_p_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin LossOfMessages_Signal_A_AClassifierBehavior_this::result
		addToElementRepository("result", LossOfMessages_Signal_A_AClassifierBehavior_this_result);
		LossOfMessages_Signal_A_AClassifierBehavior_this_result.setName("result");
		LossOfMessages_Signal_A_AClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_this_result.setType(LossOfMessages_Signal_A);
		// OutputPin LossOfMessages_Signal_main_Create A::result
		addToElementRepository("result", LossOfMessages_Signal_main_Create_A_result);
		LossOfMessages_Signal_main_Create_A_result.setName("result");
		LossOfMessages_Signal_main_Create_A_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Create_A_result.setType(LossOfMessages_Signal_A);
		// OutputPin LossOfMessages_Signal_A_AClassifierBehavior_Set this.p::result
		addToElementRepository("result", LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result.setName("result");
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Set_this_p_result.setType(LossOfMessages_Signal_A);
		// OutputPin LossOfMessages_Signal_main_Read a.q::result
		addToElementRepository("result", LossOfMessages_Signal_main_Read_a_q_result);
		LossOfMessages_Signal_main_Read_a_q_result.setName("result");
		LossOfMessages_Signal_main_Read_a_q_result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_q_result.setType(LossOfMessages_Signal_I);
		// OutputPin LossOfMessages_Signal_main_A()::result
		addToElementRepository("result", LossOfMessages_Signal_main_A__result);
		LossOfMessages_Signal_main_A__result.setName("result");
		LossOfMessages_Signal_main_A__result.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_A__result.setType(LossOfMessages_Signal_A);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport LossOfMessages_Signal::PackageImport1
		addToElementRepository("PackageImport1", LossOfMessages_Signal_PackageImport1);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter LossOfMessages_Signal_main_testP::p
		addToElementRepository("p", LossOfMessages_Signal_main_testP_p);
		LossOfMessages_Signal_main_testP_p.setName("p");
		LossOfMessages_Signal_main_testP_p.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_main_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter LossOfMessages_Signal_A_A_A::result
		addToElementRepository("result", LossOfMessages_Signal_A_A_A_result);
		LossOfMessages_Signal_A_A_A_result.setName("result");
		LossOfMessages_Signal_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_A_A_A_result.setType(LossOfMessages_Signal_A);
		LossOfMessages_Signal_A_A_A_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port LossOfMessages_Signal_A::q
		addToElementRepository("q", LossOfMessages_Signal_A_q);
		LossOfMessages_Signal_A_q.setName("q");
		LossOfMessages_Signal_A_q.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_A_q.setType(LossOfMessages_Signal_IImpl);
		LossOfMessages_Signal_A_q.setAggregation(AggregationKind.composite);
		LossOfMessages_Signal_A_q.isService = true;
		LossOfMessages_Signal_A_q.addProvided(LossOfMessages_Signal_I);
	}

	private void initializeProperty_Instances()
	{
		// Property LossOfMessages_Signal_A::p
		addToElementRepository("p", LossOfMessages_Signal_A_p);
		LossOfMessages_Signal_A_p.setName("p");
		LossOfMessages_Signal_A_p.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_A_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		LossOfMessages_Signal_A_p.setAggregation(AggregationKind.composite);
		LossOfMessages_Signal_A_p.setDefaultValue(LossOfMessages_Signal_A_p_LiteralInteger51);
		// Property LossOfMessages_Signal_S::v
		addToElementRepository("v", LossOfMessages_Signal_S_v);
		LossOfMessages_Signal_S_v.setName("v");
		LossOfMessages_Signal_S_v.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction LossOfMessages_Signal_A_AClassifierBehavior::this
		addToElementRepository("this", LossOfMessages_Signal_A_AClassifierBehavior_this);
		LossOfMessages_Signal_A_AClassifierBehavior_this.setName("this");
		LossOfMessages_Signal_A_AClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_this.setResult(LossOfMessages_Signal_A_AClassifierBehavior_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction LossOfMessages_Signal_main::Read a.p
		addToElementRepository("Read a.p", LossOfMessages_Signal_main_Read_a_p);
		LossOfMessages_Signal_main_Read_a_p.setName("Read a.p");
		LossOfMessages_Signal_main_Read_a_p.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_p.setStructuralFeature(LossOfMessages_Signal_A_p);
		LossOfMessages_Signal_main_Read_a_p.setObject(LossOfMessages_Signal_main_Read_a_p_object);
		LossOfMessages_Signal_main_Read_a_p.setResult(LossOfMessages_Signal_main_Read_a_p_result);
		// ReadStructuralFeatureAction LossOfMessages_Signal_main::Read a.q
		addToElementRepository("Read a.q", LossOfMessages_Signal_main_Read_a_q);
		LossOfMessages_Signal_main_Read_a_q.setName("Read a.q");
		LossOfMessages_Signal_main_Read_a_q.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Read_a_q.setStructuralFeature(LossOfMessages_Signal_A_q);
		LossOfMessages_Signal_main_Read_a_q.setObject(LossOfMessages_Signal_main_Read_a_q_object);
		LossOfMessages_Signal_main_Read_a_q.setResult(LossOfMessages_Signal_main_Read_a_q_result);
		// ReadStructuralFeatureAction LossOfMessages_Signal_A_AClassifierBehavior::Read s.v
		addToElementRepository("Read s.v", LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v.setName("Read s.v");
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v.setStructuralFeature(LossOfMessages_Signal_S_v);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v.setObject(LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_object);
		LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v.setResult(LossOfMessages_Signal_A_AClassifierBehavior_Read_s_v_result);
	}

	private void initializeReception_Instances()
	{
		// Reception LossOfMessages_Signal_A::S
		addToElementRepository("S", LossOfMessages_Signal_A_S);
		LossOfMessages_Signal_A_S.setName("S");
		LossOfMessages_Signal_A_S.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_S.setSignal(LossOfMessages_Signal_S);
		// Reception LossOfMessages_Signal_I::S
		addToElementRepository("S", LossOfMessages_Signal_I_S);
		LossOfMessages_Signal_I_S.setName("S");
		LossOfMessages_Signal_I_S.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_I_S.setSignal(LossOfMessages_Signal_S);
		// Reception LossOfMessages_Signal_IImpl::S
		addToElementRepository("S", LossOfMessages_Signal_IImpl_S);
		LossOfMessages_Signal_IImpl_S.setName("S");
		LossOfMessages_Signal_IImpl_S.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_IImpl_S.setSignal(LossOfMessages_Signal_S);
	}

	private void initializeSendSignalAction_Instances()
	{
		// SendSignalAction LossOfMessages_Signal_main::Send S
		addToElementRepository("Send S", LossOfMessages_Signal_main_Send_S);
		LossOfMessages_Signal_main_Send_S.setName("Send S");
		LossOfMessages_Signal_main_Send_S.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Send_S.setSignal(LossOfMessages_Signal_S);
		LossOfMessages_Signal_main_Send_S.setTarget(LossOfMessages_Signal_main_Send_S_target);
		LossOfMessages_Signal_main_Send_S.addArgument(LossOfMessages_Signal_main_Send_S_v);
	}

	private void initializeSignal_Instances()
	{
		// Signal LossOfMessages_Signal::S
		addToElementRepository("S", LossOfMessages_Signal_S);
		LossOfMessages_Signal_S.setName("S");
		LossOfMessages_Signal_S.setVisibility(VisibilityKind.public_);
		
		LossOfMessages_Signal_S.addOwnedAttribute(LossOfMessages_Signal_S_v);
	}

	private void initializeSignalEvent_Instances()
	{
		// SignalEvent LossOfMessages_Signal::SignalEventS
		addToElementRepository("SignalEventS", LossOfMessages_Signal_SignalEventS);
		LossOfMessages_Signal_SignalEventS.setName("SignalEventS");
		LossOfMessages_Signal_SignalEventS.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_SignalEventS.setSignal(LossOfMessages_Signal_S);
	}

	private void initializeTrigger_Instances()
	{
		// Trigger LossOfMessages_Signal_A_AClassifierBehavior_Accept S::Trigger77
		addToElementRepository("Trigger77", LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_Trigger77);
		// Trigger Trigger77
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_Trigger77.setName("Trigger77");
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_Trigger77.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_A_AClassifierBehavior_Accept_S_Trigger77.setEvent(LossOfMessages_Signal_SignalEventS);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction LossOfMessages_Signal_main::Value 4
		addToElementRepository("Value 4", LossOfMessages_Signal_main_Value_4);
		LossOfMessages_Signal_main_Value_4.setName("Value 4");
		LossOfMessages_Signal_main_Value_4.setVisibility(VisibilityKind.public_);
		LossOfMessages_Signal_main_Value_4.setValue(LossOfMessages_Signal_main_Value_4_LiteralInteger23);
		LossOfMessages_Signal_main_Value_4.setResult(LossOfMessages_Signal_main_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // LossOfMessages_SignalModel
