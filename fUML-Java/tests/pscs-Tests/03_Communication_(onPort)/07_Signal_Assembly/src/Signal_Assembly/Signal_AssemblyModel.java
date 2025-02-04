/*
 * Signal_AssemblyModel.java
 * 
 * Auto-generated file
 */
package Signal_Assembly;

import uml.commonbehavior.SignalEvent;
import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.classification.Generalization;
import uml.structuredclassifiers.Connector;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.Signal;
import uml.activities.ActivityFinalNode;
import uml.actions.OutputPin;
import uml.activities.Activity;
import uml.actions.CallOperationAction;
import uml.actions.ReadStructuralFeatureAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.commonstructure.Comment;
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
import uml.structuredclassifiers.Association;
import uml.classification.Property;
import utils.primitivetypes.PrimitiveTypesModel;
import uml.classification.ParameterDirectionKind;
import uml.simpleclassifiers.PrimitiveType;
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

public class Signal_AssemblyModel extends InMemoryModel
{
	private static Signal_AssemblyModel instance;

	/*
	 * Model Signal_Assembly
	 */
	public Package Signal_Assembly = new Package();
		public Signal Signal_Assembly_Continue = new Signal();
		public SignalEvent Signal_Assembly_StartEvent = new SignalEvent();
		public Class_ Signal_Assembly_A = new Class_();
			public Operation Signal_Assembly_A_A_A = new Operation();
				public Parameter Signal_Assembly_A_A_A_result = new Parameter();
			public Activity Signal_Assembly_A_AClassifierBehavior = new Activity();
				public ControlFlow Signal_Assembly_A_AClassifierBehavior_ControlFlow0 = new ControlFlow();
				public ControlFlow Signal_Assembly_A_AClassifierBehavior_ControlFlow1 = new ControlFlow();
				public ObjectFlow Signal_Assembly_A_AClassifierBehavior_ObjectFlow2 = new ObjectFlow();
					public LiteralInteger Signal_Assembly_A_AClassifierBehavior_ObjectFlow2_LiteralInteger3 = new LiteralInteger();
					public LiteralBoolean Signal_Assembly_A_AClassifierBehavior_ObjectFlow2_LiteralBoolean4 = new LiteralBoolean();
				public ObjectFlow Signal_Assembly_A_AClassifierBehavior_ObjectFlow5 = new ObjectFlow();
					public LiteralBoolean Signal_Assembly_A_AClassifierBehavior_ObjectFlow5_LiteralBoolean6 = new LiteralBoolean();
					public LiteralInteger Signal_Assembly_A_AClassifierBehavior_ObjectFlow5_LiteralInteger7 = new LiteralInteger();
				public SendSignalAction Signal_Assembly_A_AClassifierBehavior_Send_Continue = new SendSignalAction();
					public InputPin Signal_Assembly_A_AClassifierBehavior_Send_Continue_target = new InputPin();
						public LiteralUnlimitedNatural Signal_Assembly_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural8 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_Assembly_A_AClassifierBehavior_Send_Continue_target_LiteralInteger9 = new LiteralInteger();
				public AcceptEventAction Signal_Assembly_A_AClassifierBehavior_Accept_S = new AcceptEventAction();
					public Trigger Signal_Assembly_A_AClassifierBehavior_Accept_S_Trigger10 = new Trigger();
					public OutputPin Signal_Assembly_A_AClassifierBehavior_Accept_S_value = new OutputPin();
						public LiteralInteger Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralInteger11 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural12 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralInteger13 = new LiteralInteger();
				public ReadSelfAction Signal_Assembly_A_AClassifierBehavior_this = new ReadSelfAction();
					public OutputPin Signal_Assembly_A_AClassifierBehavior_this_result = new OutputPin();
						public LiteralUnlimitedNatural Signal_Assembly_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural14 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_Assembly_A_AClassifierBehavior_this_result_LiteralInteger15 = new LiteralInteger();
				public ObjectFlow Signal_Assembly_A_AClassifierBehavior_ObjectFlow16 = new ObjectFlow();
					public LiteralBoolean Signal_Assembly_A_AClassifierBehavior_ObjectFlow16_LiteralBoolean17 = new LiteralBoolean();
					public LiteralInteger Signal_Assembly_A_AClassifierBehavior_ObjectFlow16_LiteralInteger18 = new LiteralInteger();
				public AddStructuralFeatureValueAction Signal_Assembly_A_AClassifierBehavior_Set_v = new AddStructuralFeatureValueAction();
					public OutputPin Signal_Assembly_A_AClassifierBehavior_Set_v_result = new OutputPin();
						public LiteralUnlimitedNatural Signal_Assembly_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural19 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_Assembly_A_AClassifierBehavior_Set_v_result_LiteralInteger20 = new LiteralInteger();
					public InputPin Signal_Assembly_A_AClassifierBehavior_Set_v_object = new InputPin();
						public LiteralUnlimitedNatural Signal_Assembly_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural21 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_Assembly_A_AClassifierBehavior_Set_v_object_LiteralInteger22 = new LiteralInteger();
					public InputPin Signal_Assembly_A_AClassifierBehavior_Set_v_value = new InputPin();
						public LiteralInteger Signal_Assembly_A_AClassifierBehavior_Set_v_value_LiteralInteger23 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_Assembly_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural24 = new LiteralUnlimitedNatural();
				public ActivityFinalNode Signal_Assembly_A_AClassifierBehavior_ActivityFinalNode25 = new ActivityFinalNode();
			public Property Signal_Assembly_A_v = new Property();
			public Port Signal_Assembly_A_p = new Port();
		public Association Signal_Assembly_R = new Association();
			public Property Signal_Assembly_R_x = new Property();
			public Property Signal_Assembly_R_y = new Property();
		public SignalEvent Signal_Assembly_SEvent = new SignalEvent();
		public Comment Signal_Assembly_Comment26 = new Comment();
		public Signal Signal_Assembly_S = new Signal();
			public Property Signal_Assembly_S_value = new Property();
		public PackageImport Signal_Assembly_PackageImport27 = new PackageImport();
		public Comment Signal_Assembly_Comment28 = new Comment();
		public SignalEvent Signal_Assembly_ContinueEvent = new SignalEvent();
		public Class_ Signal_Assembly_Tester = new Class_();
			public Operation Signal_Assembly_Tester_Tester_Tester = new Operation();
				public Parameter Signal_Assembly_Tester_Tester_Tester_result = new Parameter();
			public Activity Signal_Assembly_Tester_TesterClassifierBehavior = new Activity();
				public ObjectFlow Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29 = new ObjectFlow();
					public LiteralBoolean Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralBoolean30 = new LiteralBoolean();
					public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralInteger31 = new LiteralInteger();
				public ReadSelfAction Signal_Assembly_Tester_TesterClassifierBehavior_this = new ReadSelfAction();
					public OutputPin Signal_Assembly_Tester_TesterClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_this_result_LiteralInteger32 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural33 = new LiteralUnlimitedNatural();
				public ControlFlow Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow34 = new ControlFlow();
				public ValueSpecificationAction Signal_Assembly_Tester_TesterClassifierBehavior_Value_4 = new ValueSpecificationAction();
					public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_LiteralInteger35 = new LiteralInteger();
					public OutputPin Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result = new OutputPin();
						public LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural36 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger37 = new LiteralInteger();
				public CallOperationAction Signal_Assembly_Tester_TesterClassifierBehavior_Call_test_ = new CallOperationAction();
					public InputPin Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target = new InputPin();
						public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger38 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural39 = new LiteralUnlimitedNatural();
				public ControlFlow Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow40 = new ControlFlow();
				public AcceptEventAction Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start = new AcceptEventAction();
					public OutputPin Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase = new OutputPin();
						public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger41 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural42 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger43 = new LiteralInteger();
					public Trigger Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_Trigger44 = new Trigger();
				public ActivityFinalNode Signal_Assembly_Tester_TesterClassifierBehavior_ActivityFinalNode45 = new ActivityFinalNode();
				public AcceptEventAction Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue = new AcceptEventAction();
					public OutputPin Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result = new OutputPin();
						public LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger47 = new LiteralInteger();
						public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger48 = new LiteralInteger();
					public Trigger Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_Trigger49 = new Trigger();
				public SendSignalAction Signal_Assembly_Tester_TesterClassifierBehavior_Send_S = new SendSignalAction();
					public InputPin Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value = new InputPin();
						public LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural50 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger51 = new LiteralInteger();
						public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger52 = new LiteralInteger();
					public InputPin Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target = new InputPin();
						public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger53 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural54 = new LiteralUnlimitedNatural();
				public ObjectFlow Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55 = new ObjectFlow();
					public LiteralBoolean Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55_LiteralBoolean56 = new LiteralBoolean();
					public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55_LiteralInteger57 = new LiteralInteger();
				public ControlFlow Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow58 = new ControlFlow();
				public ObjectFlow Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59 = new ObjectFlow();
					public LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59_LiteralInteger60 = new LiteralInteger();
					public LiteralBoolean Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59_LiteralBoolean61 = new LiteralBoolean();
				public ControlFlow Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow62 = new ControlFlow();
			public Port Signal_Assembly_Tester_q = new Port();
			public Reception Signal_Assembly_Tester_Start = new Reception();
		public Class_ Signal_Assembly_TestCaseAssembly = new Class_();
			public Property Signal_Assembly_TestCaseAssembly_a = new Property();
			public Connector Signal_Assembly_TestCaseAssembly_r = new Connector();
				public ConnectorEnd Signal_Assembly_TestCaseAssembly_r_ConnectorEnd63 = new ConnectorEnd();
				public ConnectorEnd Signal_Assembly_TestCaseAssembly_r_ConnectorEnd64 = new ConnectorEnd();
			public Operation Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly = new Operation();
				public Parameter Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly_result = new Parameter();
			public Property Signal_Assembly_TestCaseAssembly_tester = new Property();
			public Activity Signal_Assembly_TestCaseAssembly_testActivity = new Activity();
				public OpaqueBehavior Signal_Assembly_TestCaseAssembly_testActivity_testV = new OpaqueBehavior();
					public Parameter Signal_Assembly_TestCaseAssembly_testActivity_testV_v = new Parameter();
				public ReadSelfAction Signal_Assembly_TestCaseAssembly_testActivity_this = new ReadSelfAction();
					public OutputPin Signal_Assembly_TestCaseAssembly_testActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural Signal_Assembly_TestCaseAssembly_testActivity_this_result_LiteralUnlimitedNatural65 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_this_result_LiteralInteger66 = new LiteralInteger();
				public ReadStructuralFeatureAction Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a = new ReadStructuralFeatureAction();
					public OutputPin Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result = new OutputPin();
						public LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result_LiteralInteger67 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result_LiteralUnlimitedNatural68 = new LiteralUnlimitedNatural();
					public InputPin Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object = new InputPin();
						public LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object_LiteralInteger69 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object_LiteralUnlimitedNatural70 = new LiteralUnlimitedNatural();
				public ObjectFlow Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71 = new ObjectFlow();
					public LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71_LiteralInteger72 = new LiteralInteger();
					public LiteralBoolean Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71_LiteralBoolean73 = new LiteralBoolean();
				public ObjectFlow Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74 = new ObjectFlow();
					public LiteralBoolean Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74_LiteralBoolean75 = new LiteralBoolean();
					public LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74_LiteralInteger76 = new LiteralInteger();
				public ObjectFlow Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77 = new ObjectFlow();
					public LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77_LiteralInteger78 = new LiteralInteger();
					public LiteralBoolean Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77_LiteralBoolean79 = new LiteralBoolean();
				public ReadStructuralFeatureAction Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v = new ReadStructuralFeatureAction();
					public InputPin Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object = new InputPin();
						public LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object_LiteralInteger80 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object_LiteralUnlimitedNatural81 = new LiteralUnlimitedNatural();
					public OutputPin Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result = new OutputPin();
						public LiteralUnlimitedNatural Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result_LiteralUnlimitedNatural82 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result_LiteralInteger83 = new LiteralInteger();
				public CallBehaviorAction Signal_Assembly_TestCaseAssembly_testActivity_Call_testV = new CallBehaviorAction();
					public InputPin Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v = new InputPin();
						public LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralInteger84 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralUnlimitedNatural85 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralInteger86 = new LiteralInteger();
			public Operation Signal_Assembly_TestCaseAssembly_test = new Operation();
			public Generalization Signal_Assembly_TestCaseAssembly_Generalization87 = new Generalization();
		public Class_ Signal_Assembly_I = new Class_();
		public Activity Signal_Assembly_main = new Activity();
			public SendSignalAction Signal_Assembly_main_Send_Start = new SendSignalAction();
				public InputPin Signal_Assembly_main_Send_Start_target = new InputPin();
					public LiteralUnlimitedNatural Signal_Assembly_main_Send_Start_target_LiteralUnlimitedNatural88 = new LiteralUnlimitedNatural();
					public LiteralInteger Signal_Assembly_main_Send_Start_target_LiteralInteger89 = new LiteralInteger();
				public InputPin Signal_Assembly_main_Send_Start_testCase = new InputPin();
					public LiteralInteger Signal_Assembly_main_Send_Start_testCase_LiteralInteger90 = new LiteralInteger();
					public LiteralInteger Signal_Assembly_main_Send_Start_testCase_LiteralInteger91 = new LiteralInteger();
					public LiteralUnlimitedNatural Signal_Assembly_main_Send_Start_testCase_LiteralUnlimitedNatural92 = new LiteralUnlimitedNatural();
			public CreateObjectAction Signal_Assembly_main_Create_TestCaseAssembly = new CreateObjectAction();
				public OutputPin Signal_Assembly_main_Create_TestCaseAssembly_result = new OutputPin();
					public LiteralInteger Signal_Assembly_main_Create_TestCaseAssembly_result_LiteralInteger93 = new LiteralInteger();
					public LiteralUnlimitedNatural Signal_Assembly_main_Create_TestCaseAssembly_result_LiteralUnlimitedNatural94 = new LiteralUnlimitedNatural();
			public ForkNode Signal_Assembly_main_Fork_testCase = new ForkNode();
			public ReadStructuralFeatureAction Signal_Assembly_main_Read_TestCaseAssembly_tester = new ReadStructuralFeatureAction();
				public InputPin Signal_Assembly_main_Read_TestCaseAssembly_tester_object = new InputPin();
					public LiteralUnlimitedNatural Signal_Assembly_main_Read_TestCaseAssembly_tester_object_LiteralUnlimitedNatural95 = new LiteralUnlimitedNatural();
					public LiteralInteger Signal_Assembly_main_Read_TestCaseAssembly_tester_object_LiteralInteger96 = new LiteralInteger();
				public OutputPin Signal_Assembly_main_Read_TestCaseAssembly_tester_result = new OutputPin();
					public LiteralUnlimitedNatural Signal_Assembly_main_Read_TestCaseAssembly_tester_result_LiteralUnlimitedNatural97 = new LiteralUnlimitedNatural();
					public LiteralInteger Signal_Assembly_main_Read_TestCaseAssembly_tester_result_LiteralInteger98 = new LiteralInteger();
			public ObjectFlow Signal_Assembly_main_ObjectFlow99 = new ObjectFlow();
				public LiteralBoolean Signal_Assembly_main_ObjectFlow99_LiteralBoolean100 = new LiteralBoolean();
				public LiteralInteger Signal_Assembly_main_ObjectFlow99_LiteralInteger101 = new LiteralInteger();
			public ObjectFlow Signal_Assembly_main_ObjectFlow102 = new ObjectFlow();
				public LiteralInteger Signal_Assembly_main_ObjectFlow102_LiteralInteger103 = new LiteralInteger();
				public LiteralBoolean Signal_Assembly_main_ObjectFlow102_LiteralBoolean104 = new LiteralBoolean();
			public ObjectFlow Signal_Assembly_main_ObjectFlow105 = new ObjectFlow();
				public LiteralBoolean Signal_Assembly_main_ObjectFlow105_LiteralBoolean106 = new LiteralBoolean();
				public LiteralInteger Signal_Assembly_main_ObjectFlow105_LiteralInteger107 = new LiteralInteger();
			public ObjectFlow Signal_Assembly_main_ObjectFlow108 = new ObjectFlow();
				public LiteralBoolean Signal_Assembly_main_ObjectFlow108_LiteralBoolean109 = new LiteralBoolean();
				public LiteralInteger Signal_Assembly_main_ObjectFlow108_LiteralInteger110 = new LiteralInteger();
			public ObjectFlow Signal_Assembly_main_ObjectFlow111 = new ObjectFlow();
				public LiteralBoolean Signal_Assembly_main_ObjectFlow111_LiteralBoolean112 = new LiteralBoolean();
				public LiteralInteger Signal_Assembly_main_ObjectFlow111_LiteralInteger113 = new LiteralInteger();
			public CallOperationAction Signal_Assembly_main_TestCaseAssembly_ = new CallOperationAction();
				public InputPin Signal_Assembly_main_TestCaseAssembly__target = new InputPin();
					public LiteralUnlimitedNatural Signal_Assembly_main_TestCaseAssembly__target_LiteralUnlimitedNatural114 = new LiteralUnlimitedNatural();
					public LiteralInteger Signal_Assembly_main_TestCaseAssembly__target_LiteralInteger115 = new LiteralInteger();
				public OutputPin Signal_Assembly_main_TestCaseAssembly__result = new OutputPin();
					public LiteralInteger Signal_Assembly_main_TestCaseAssembly__result_LiteralInteger116 = new LiteralInteger();
					public LiteralUnlimitedNatural Signal_Assembly_main_TestCaseAssembly__result_LiteralUnlimitedNatural117 = new LiteralUnlimitedNatural();
					public LiteralInteger Signal_Assembly_main_TestCaseAssembly__result_LiteralInteger118 = new LiteralInteger();
		public Signal Signal_Assembly_Start = new Signal();
			public Property Signal_Assembly_Start_testCase = new Property();
		public Class_ Signal_Assembly_TestCase = new Class_();
			public Operation Signal_Assembly_TestCase_test = new Operation();

	public static Signal_AssemblyModel instance()
	{
		if (instance == null)
        {
            instance = new Signal_AssemblyModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public Signal_AssemblyModel()
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
		this.initializeActivityFinalNode_Instances();
		this.initializeAddStructuralFeatureValueAction_Instances();
		this.initializeAssociation_Instances();
		this.initializeCallBehaviorAction_Instances();
		this.initializeCallOperationAction_Instances();
		this.initializeClass_Instances();
		this.initializeComment_Instances();
		this.initializeConnector_Instances();
		this.initializeConnectorEnd_Instances();
		this.initializeControlFlow_Instances();
		this.initializeCreateObjectAction_Instances();
		this.initializeForkNode_Instances();
		this.initializeFunctionBehavior_Instances();
		this.initializeGeneralization_Instances();
		this.initializeInputPin_Instances();
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
		// AcceptEventAction Signal_Assembly_Tester_TesterClassifierBehavior::Accept Start
		addToElementRepository("Accept Start", Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start.setName("Accept Start");
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start.setIsUnmarshall(true);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start.addResult(Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start.addTrigger(Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_Trigger44);
		// AcceptEventAction Signal_Assembly_A_AClassifierBehavior::Accept S
		addToElementRepository("Accept S", Signal_Assembly_A_AClassifierBehavior_Accept_S);
		Signal_Assembly_A_AClassifierBehavior_Accept_S.setName("Accept S");
		Signal_Assembly_A_AClassifierBehavior_Accept_S.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Accept_S.setIsUnmarshall(true);
		Signal_Assembly_A_AClassifierBehavior_Accept_S.addResult(Signal_Assembly_A_AClassifierBehavior_Accept_S_value);
		Signal_Assembly_A_AClassifierBehavior_Accept_S.addTrigger(Signal_Assembly_A_AClassifierBehavior_Accept_S_Trigger10);
		// AcceptEventAction Signal_Assembly_Tester_TesterClassifierBehavior::Accept Continue
		addToElementRepository("Accept Continue", Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue.setName("Accept Continue");
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue.addResult(Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue.addTrigger(Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_Trigger49);
	}

	private void initializeActivity_Instances()
	{
		// Activity Signal_Assembly_A::AClassifierBehavior
		addToElementRepository("AClassifierBehavior", Signal_Assembly_A_AClassifierBehavior);
		Signal_Assembly_A_AClassifierBehavior.setName("AClassifierBehavior");
		Signal_Assembly_A_AClassifierBehavior.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_A_AClassifierBehavior.isReentrant = false;
		Signal_Assembly_A_AClassifierBehavior.addNode(Signal_Assembly_A_AClassifierBehavior_Send_Continue);
		Signal_Assembly_A_AClassifierBehavior.addNode(Signal_Assembly_A_AClassifierBehavior_Accept_S);
		Signal_Assembly_A_AClassifierBehavior.addNode(Signal_Assembly_A_AClassifierBehavior_this);
		Signal_Assembly_A_AClassifierBehavior.addNode(Signal_Assembly_A_AClassifierBehavior_Set_v);
		Signal_Assembly_A_AClassifierBehavior.addNode(Signal_Assembly_A_AClassifierBehavior_ActivityFinalNode25);
		Signal_Assembly_A_AClassifierBehavior.addEdge(Signal_Assembly_A_AClassifierBehavior_ControlFlow0);
		Signal_Assembly_A_AClassifierBehavior.addEdge(Signal_Assembly_A_AClassifierBehavior_ControlFlow1);
		Signal_Assembly_A_AClassifierBehavior.addEdge(Signal_Assembly_A_AClassifierBehavior_ObjectFlow2);
		Signal_Assembly_A_AClassifierBehavior.addEdge(Signal_Assembly_A_AClassifierBehavior_ObjectFlow5);
		Signal_Assembly_A_AClassifierBehavior.addEdge(Signal_Assembly_A_AClassifierBehavior_ObjectFlow16);
		// Activity Signal_Assembly::main
		addToElementRepository("main", Signal_Assembly_main);
		Signal_Assembly_main.setName("main");
		Signal_Assembly_main.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main.addNode(Signal_Assembly_main_Send_Start);
		Signal_Assembly_main.addNode(Signal_Assembly_main_Create_TestCaseAssembly);
		Signal_Assembly_main.addNode(Signal_Assembly_main_Fork_testCase);
		Signal_Assembly_main.addNode(Signal_Assembly_main_Read_TestCaseAssembly_tester);
		Signal_Assembly_main.addNode(Signal_Assembly_main_TestCaseAssembly_);
		Signal_Assembly_main.addEdge(Signal_Assembly_main_ObjectFlow99);
		Signal_Assembly_main.addEdge(Signal_Assembly_main_ObjectFlow102);
		Signal_Assembly_main.addEdge(Signal_Assembly_main_ObjectFlow105);
		Signal_Assembly_main.addEdge(Signal_Assembly_main_ObjectFlow108);
		Signal_Assembly_main.addEdge(Signal_Assembly_main_ObjectFlow111);
		// Activity Signal_Assembly_Tester::TesterClassifierBehavior
		addToElementRepository("TesterClassifierBehavior", Signal_Assembly_Tester_TesterClassifierBehavior);
		Signal_Assembly_Tester_TesterClassifierBehavior.setName("TesterClassifierBehavior");
		Signal_Assembly_Tester_TesterClassifierBehavior.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Tester_TesterClassifierBehavior.isReentrant = false;
		Signal_Assembly_Tester_TesterClassifierBehavior.addNode(Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start);
		Signal_Assembly_Tester_TesterClassifierBehavior.addNode(Signal_Assembly_Tester_TesterClassifierBehavior_this);
		Signal_Assembly_Tester_TesterClassifierBehavior.addNode(Signal_Assembly_Tester_TesterClassifierBehavior_ActivityFinalNode45);
		Signal_Assembly_Tester_TesterClassifierBehavior.addNode(Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue);
		Signal_Assembly_Tester_TesterClassifierBehavior.addNode(Signal_Assembly_Tester_TesterClassifierBehavior_Value_4);
		Signal_Assembly_Tester_TesterClassifierBehavior.addNode(Signal_Assembly_Tester_TesterClassifierBehavior_Call_test_);
		Signal_Assembly_Tester_TesterClassifierBehavior.addNode(Signal_Assembly_Tester_TesterClassifierBehavior_Send_S);
		Signal_Assembly_Tester_TesterClassifierBehavior.addEdge(Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29);
		Signal_Assembly_Tester_TesterClassifierBehavior.addEdge(Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow34);
		Signal_Assembly_Tester_TesterClassifierBehavior.addEdge(Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55);
		Signal_Assembly_Tester_TesterClassifierBehavior.addEdge(Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow58);
		Signal_Assembly_Tester_TesterClassifierBehavior.addEdge(Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow40);
		Signal_Assembly_Tester_TesterClassifierBehavior.addEdge(Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59);
		Signal_Assembly_Tester_TesterClassifierBehavior.addEdge(Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow62);
		// Activity Signal_Assembly_TestCaseAssembly::testActivity
		addToElementRepository("testActivity", Signal_Assembly_TestCaseAssembly_testActivity);
		Signal_Assembly_TestCaseAssembly_testActivity.setName("testActivity");
		Signal_Assembly_TestCaseAssembly_testActivity.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity.addOwnedBehavior(Signal_Assembly_TestCaseAssembly_testActivity_testV);
		Signal_Assembly_TestCaseAssembly_testActivity.addNode(Signal_Assembly_TestCaseAssembly_testActivity_this);
		Signal_Assembly_TestCaseAssembly_testActivity.addNode(Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a);
		Signal_Assembly_TestCaseAssembly_testActivity.addNode(Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v);
		Signal_Assembly_TestCaseAssembly_testActivity.addNode(Signal_Assembly_TestCaseAssembly_testActivity_Call_testV);
		Signal_Assembly_TestCaseAssembly_testActivity.addEdge(Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71);
		Signal_Assembly_TestCaseAssembly_testActivity.addEdge(Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74);
		Signal_Assembly_TestCaseAssembly_testActivity.addEdge(Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77);
	}

	private void initializeActivityFinalNode_Instances()
	{
		// ActivityFinalNode Signal_Assembly_Tester_TesterClassifierBehavior::ActivityFinalNode45
		addToElementRepository("ActivityFinalNode45", Signal_Assembly_Tester_TesterClassifierBehavior_ActivityFinalNode45);
		Signal_Assembly_Tester_TesterClassifierBehavior_ActivityFinalNode45.setName("ActivityFinalNode45");
		Signal_Assembly_Tester_TesterClassifierBehavior_ActivityFinalNode45.setVisibility(VisibilityKind.public_);
		// ActivityFinalNode Signal_Assembly_A_AClassifierBehavior::ActivityFinalNode25
		addToElementRepository("ActivityFinalNode25", Signal_Assembly_A_AClassifierBehavior_ActivityFinalNode25);
		Signal_Assembly_A_AClassifierBehavior_ActivityFinalNode25.setName("ActivityFinalNode25");
		Signal_Assembly_A_AClassifierBehavior_ActivityFinalNode25.setVisibility(VisibilityKind.public_);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction Signal_Assembly_A_AClassifierBehavior::Set v
		addToElementRepository("Set v", Signal_Assembly_A_AClassifierBehavior_Set_v);
		Signal_Assembly_A_AClassifierBehavior_Set_v.setName("Set v");
		Signal_Assembly_A_AClassifierBehavior_Set_v.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Set_v.setStructuralFeature(Signal_Assembly_A_v);
		Signal_Assembly_A_AClassifierBehavior_Set_v.setObject(Signal_Assembly_A_AClassifierBehavior_Set_v_object);
		Signal_Assembly_A_AClassifierBehavior_Set_v.setValue(Signal_Assembly_A_AClassifierBehavior_Set_v_value);
		Signal_Assembly_A_AClassifierBehavior_Set_v.setResult(Signal_Assembly_A_AClassifierBehavior_Set_v_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association Signal_Assembly::R
		addToElementRepository("R", Signal_Assembly_R);
		Signal_Assembly_R.setName("R");
		Signal_Assembly_R.setVisibility(VisibilityKind.public_);
		Signal_Assembly_R.addOwnedEnd(Signal_Assembly_R_x);
		Signal_Assembly_R.addOwnedEnd(Signal_Assembly_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction Signal_Assembly_TestCaseAssembly_testActivity::Call testV
		addToElementRepository("Call testV", Signal_Assembly_TestCaseAssembly_testActivity_Call_testV);
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV.setName("Call testV");
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV.setBehavior(Signal_Assembly_TestCaseAssembly_testActivity_testV);
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV.addArgument(Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction Signal_Assembly_Tester_TesterClassifierBehavior::Call test()
		addToElementRepository("Call test()", Signal_Assembly_Tester_TesterClassifierBehavior_Call_test_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test_.setName("Call test()");
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test_.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test_.setOperation(Signal_Assembly_TestCase_test);
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test_.setTarget(Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target);
		// CallOperationAction Signal_Assembly_main::TestCaseAssembly()
		addToElementRepository("TestCaseAssembly()", Signal_Assembly_main_TestCaseAssembly_);
		Signal_Assembly_main_TestCaseAssembly_.setName("TestCaseAssembly()");
		Signal_Assembly_main_TestCaseAssembly_.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_main_TestCaseAssembly_.addResult(Signal_Assembly_main_TestCaseAssembly__result);
		Signal_Assembly_main_TestCaseAssembly_.setOperation(Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly);
		Signal_Assembly_main_TestCaseAssembly_.setTarget(Signal_Assembly_main_TestCaseAssembly__target);
	}

	private void initializeClass_Instances()
	{
		// Class Signal_Assembly::A
		addToElementRepository("A", Signal_Assembly_A);
		Signal_Assembly_A.setName("A");
		Signal_Assembly_A.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_A.addOwnedAttribute(Signal_Assembly_A_v);
		Signal_Assembly_A.addOwnedAttribute(Signal_Assembly_A_p);
		Signal_Assembly_A.setClassifierBehavior(Signal_Assembly_A_AClassifierBehavior);
		Signal_Assembly_A.addOwnedBehavior(Signal_Assembly_A_AClassifierBehavior);
		
		Signal_Assembly_A.setIsActive(true);
		Signal_Assembly_A.addOwnedOperation(Signal_Assembly_A_A_A);
		// Class Signal_Assembly::Tester
		addToElementRepository("Tester", Signal_Assembly_Tester);
		Signal_Assembly_Tester.setName("Tester");
		Signal_Assembly_Tester.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Tester.addOwnedAttribute(Signal_Assembly_Tester_q);
		Signal_Assembly_Tester.setClassifierBehavior(Signal_Assembly_Tester_TesterClassifierBehavior);
		Signal_Assembly_Tester.addOwnedBehavior(Signal_Assembly_Tester_TesterClassifierBehavior);
		
		Signal_Assembly_Tester.setIsActive(true);
		Signal_Assembly_Tester.addOwnedOperation(Signal_Assembly_Tester_Tester_Tester);
		Signal_Assembly_Tester.addOwnedReception(Signal_Assembly_Tester_Start);
		// Class Signal_Assembly::TestCaseAssembly
		addToElementRepository("TestCaseAssembly", Signal_Assembly_TestCaseAssembly);
		Signal_Assembly_TestCaseAssembly.setName("TestCaseAssembly");
		Signal_Assembly_TestCaseAssembly.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_TestCaseAssembly.addGeneralization(Signal_Assembly_TestCaseAssembly_Generalization87);
		Signal_Assembly_TestCaseAssembly.addOwnedAttribute(Signal_Assembly_TestCaseAssembly_a);
		Signal_Assembly_TestCaseAssembly.addOwnedAttribute(Signal_Assembly_TestCaseAssembly_tester);
		Signal_Assembly_TestCaseAssembly.addOwnedBehavior(Signal_Assembly_TestCaseAssembly_testActivity);
		Signal_Assembly_TestCaseAssembly.addOwnedConnector(Signal_Assembly_TestCaseAssembly_r);
		Signal_Assembly_TestCaseAssembly.addOwnedOperation(Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly);
		Signal_Assembly_TestCaseAssembly.addOwnedOperation(Signal_Assembly_TestCaseAssembly_test);
		// Class Signal_Assembly::I
		addToElementRepository("I", Signal_Assembly_I);
		Signal_Assembly_I.setName("I");
		Signal_Assembly_I.setVisibility(VisibilityKind.public_);
		// Class Signal_Assembly::TestCase
		addToElementRepository("TestCase", Signal_Assembly_TestCase);
		Signal_Assembly_TestCase.setName("TestCase");
		Signal_Assembly_TestCase.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_TestCase.setIsAbstract(true);
		
		
		Signal_Assembly_TestCase.addOwnedOperation(Signal_Assembly_TestCase_test);
	}

	private void initializeComment_Instances()
	{
		// Comment Signal_Assembly::Comment26
		addToElementRepository("Comment26", Signal_Assembly_Comment26);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment Signal_Assembly::Comment28
		addToElementRepository("Comment28", Signal_Assembly_Comment28);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector Signal_Assembly_TestCaseAssembly::r
		addToElementRepository("r", Signal_Assembly_TestCaseAssembly_r);
		Signal_Assembly_TestCaseAssembly_r.setName("r");
		Signal_Assembly_TestCaseAssembly_r.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_r.addEnd(Signal_Assembly_TestCaseAssembly_r_ConnectorEnd64);
		Signal_Assembly_TestCaseAssembly_r.addEnd(Signal_Assembly_TestCaseAssembly_r_ConnectorEnd63);
		Signal_Assembly_TestCaseAssembly_r.setType(Signal_Assembly_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd Signal_Assembly_TestCaseAssembly_r::ConnectorEnd63
		addToElementRepository("ConnectorEnd63", Signal_Assembly_TestCaseAssembly_r_ConnectorEnd63);
		Signal_Assembly_TestCaseAssembly_r_ConnectorEnd63.setRole(Signal_Assembly_Tester_q);
		Signal_Assembly_TestCaseAssembly_r_ConnectorEnd63.setPartWithPort(Signal_Assembly_TestCaseAssembly_tester);
		// ConnectorEnd Signal_Assembly_TestCaseAssembly_r::ConnectorEnd64
		addToElementRepository("ConnectorEnd64", Signal_Assembly_TestCaseAssembly_r_ConnectorEnd64);
		Signal_Assembly_TestCaseAssembly_r_ConnectorEnd64.setRole(Signal_Assembly_A_p);
		Signal_Assembly_TestCaseAssembly_r_ConnectorEnd64.setPartWithPort(Signal_Assembly_TestCaseAssembly_a);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow Signal_Assembly_A_AClassifierBehavior::ControlFlow0
		addToElementRepository("ControlFlow0", Signal_Assembly_A_AClassifierBehavior_ControlFlow0);
		Signal_Assembly_A_AClassifierBehavior_ControlFlow0.setName("ControlFlow0");
		Signal_Assembly_A_AClassifierBehavior_ControlFlow0.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_A_AClassifierBehavior_ControlFlow0.setSource(Signal_Assembly_A_AClassifierBehavior_Accept_S);
		Signal_Assembly_A_AClassifierBehavior_ControlFlow0.setTarget(Signal_Assembly_A_AClassifierBehavior_this);
		// ControlFlow Signal_Assembly_A_AClassifierBehavior::ControlFlow1
		addToElementRepository("ControlFlow1", Signal_Assembly_A_AClassifierBehavior_ControlFlow1);
		Signal_Assembly_A_AClassifierBehavior_ControlFlow1.setName("ControlFlow1");
		Signal_Assembly_A_AClassifierBehavior_ControlFlow1.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_A_AClassifierBehavior_ControlFlow1.setSource(Signal_Assembly_A_AClassifierBehavior_Send_Continue);
		Signal_Assembly_A_AClassifierBehavior_ControlFlow1.setTarget(Signal_Assembly_A_AClassifierBehavior_ActivityFinalNode25);
		// ControlFlow Signal_Assembly_Tester_TesterClassifierBehavior::ControlFlow34
		addToElementRepository("ControlFlow34", Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow34);
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow34.setName("ControlFlow34");
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow34.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow34.setSource(Signal_Assembly_Tester_TesterClassifierBehavior_Send_S);
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow34.setTarget(Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue);
		// ControlFlow Signal_Assembly_Tester_TesterClassifierBehavior::ControlFlow58
		addToElementRepository("ControlFlow58", Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow58);
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow58.setName("ControlFlow58");
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow58.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow58.setSource(Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start);
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow58.setTarget(Signal_Assembly_Tester_TesterClassifierBehavior_this);
		// ControlFlow Signal_Assembly_Tester_TesterClassifierBehavior::ControlFlow40
		addToElementRepository("ControlFlow40", Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow40);
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow40.setName("ControlFlow40");
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow40.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow40.setSource(Signal_Assembly_Tester_TesterClassifierBehavior_Call_test_);
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow40.setTarget(Signal_Assembly_Tester_TesterClassifierBehavior_ActivityFinalNode45);
		// ControlFlow Signal_Assembly_Tester_TesterClassifierBehavior::ControlFlow62
		addToElementRepository("ControlFlow62", Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow62);
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow62.setName("ControlFlow62");
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow62.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow62.setSource(Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue);
		Signal_Assembly_Tester_TesterClassifierBehavior_ControlFlow62.setTarget(Signal_Assembly_Tester_TesterClassifierBehavior_Call_test_);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction Signal_Assembly_main::Create TestCaseAssembly
		addToElementRepository("Create TestCaseAssembly", Signal_Assembly_main_Create_TestCaseAssembly);
		Signal_Assembly_main_Create_TestCaseAssembly.setName("Create TestCaseAssembly");
		Signal_Assembly_main_Create_TestCaseAssembly.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Create_TestCaseAssembly.setClassifier(Signal_Assembly_TestCaseAssembly);
		Signal_Assembly_main_Create_TestCaseAssembly.setResult(Signal_Assembly_main_Create_TestCaseAssembly_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode Signal_Assembly_main::Fork testCase
		addToElementRepository("Fork testCase", Signal_Assembly_main_Fork_testCase);
		Signal_Assembly_main_Fork_testCase.setName("Fork testCase");
		Signal_Assembly_main_Fork_testCase.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior Signal_Assembly_TestCaseAssembly_testActivity::testV
		addToElementRepository("testV", Signal_Assembly_TestCaseAssembly_testActivity_testV);
		Signal_Assembly_TestCaseAssembly_testActivity_testV.setName("testV");
		Signal_Assembly_TestCaseAssembly_testActivity_testV.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_TestCaseAssembly_testActivity_testV.addOwnedParameter(Signal_Assembly_TestCaseAssembly_testActivity_testV_v);
		Signal_Assembly_TestCaseAssembly_testActivity_testV.addLanguage("Java");
		Signal_Assembly_TestCaseAssembly_testActivity_testV.addLanguage("Import");
		Signal_Assembly_TestCaseAssembly_testActivity_testV.addBody("System.out.println(\"Asserting a.v == 4\");  	// Test parameter v 	int v = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument v = \" + v); 	 	System.out.println(\"a.v == \" + v); 	System.out.print(\"Signal correctly sent and received: \");  	if(v == 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		Signal_Assembly_TestCaseAssembly_testActivity_testV.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeGeneralization_Instances()
	{
		// Generalization Signal_Assembly_TestCaseAssembly::Generalization87
		addToElementRepository("Generalization87", Signal_Assembly_TestCaseAssembly_Generalization87);
		Signal_Assembly_TestCaseAssembly_Generalization87.setGeneral(Signal_Assembly_TestCase);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin Signal_Assembly_main_TestCaseAssembly()::target
		addToElementRepository("target", Signal_Assembly_main_TestCaseAssembly__target);
		Signal_Assembly_main_TestCaseAssembly__target.setName("target");
		Signal_Assembly_main_TestCaseAssembly__target.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_TestCaseAssembly__target.setType(Signal_Assembly_TestCaseAssembly);
		// InputPin Signal_Assembly_TestCaseAssembly_testActivity_Read this.a::object
		addToElementRepository("object", Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object.setName("object");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object.setType(Signal_Assembly_TestCaseAssembly);
		// InputPin Signal_Assembly_TestCaseAssembly_testActivity_Read a.v::object
		addToElementRepository("object", Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object.setName("object");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object.setType(Signal_Assembly_A);
		// InputPin Signal_Assembly_main_Send Start::target
		addToElementRepository("target", Signal_Assembly_main_Send_Start_target);
		Signal_Assembly_main_Send_Start_target.setName("target");
		Signal_Assembly_main_Send_Start_target.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Send_Start_target.setType(Signal_Assembly_Tester);
		// InputPin Signal_Assembly_Tester_TesterClassifierBehavior_Send S::value
		addToElementRepository("value", Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value.setName("value");
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Signal_Assembly_A_AClassifierBehavior_Send Continue::target
		addToElementRepository("target", Signal_Assembly_A_AClassifierBehavior_Send_Continue_target);
		Signal_Assembly_A_AClassifierBehavior_Send_Continue_target.setName("target");
		Signal_Assembly_A_AClassifierBehavior_Send_Continue_target.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Send_Continue_target.setType(Signal_Assembly_A);
		// InputPin Signal_Assembly_main_Read TestCaseAssembly.tester::object
		addToElementRepository("object", Signal_Assembly_main_Read_TestCaseAssembly_tester_object);
		Signal_Assembly_main_Read_TestCaseAssembly_tester_object.setName("object");
		Signal_Assembly_main_Read_TestCaseAssembly_tester_object.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Read_TestCaseAssembly_tester_object.setType(Signal_Assembly_TestCaseAssembly);
		// InputPin Signal_Assembly_A_AClassifierBehavior_Set v::value
		addToElementRepository("value", Signal_Assembly_A_AClassifierBehavior_Set_v_value);
		Signal_Assembly_A_AClassifierBehavior_Set_v_value.setName("value");
		Signal_Assembly_A_AClassifierBehavior_Set_v_value.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Set_v_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Signal_Assembly_main_Send Start::testCase
		addToElementRepository("testCase", Signal_Assembly_main_Send_Start_testCase);
		Signal_Assembly_main_Send_Start_testCase.setName("testCase");
		Signal_Assembly_main_Send_Start_testCase.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Send_Start_testCase.setType(Signal_Assembly_TestCase);
		// InputPin Signal_Assembly_TestCaseAssembly_testActivity_Call testV::v
		addToElementRepository("v", Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v);
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v.setName("v");
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Signal_Assembly_Tester_TesterClassifierBehavior_Send S::target
		addToElementRepository("target", Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target.setName("target");
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target.setType(Signal_Assembly_Tester);
		// InputPin Signal_Assembly_A_AClassifierBehavior_Set v::object
		addToElementRepository("object", Signal_Assembly_A_AClassifierBehavior_Set_v_object);
		Signal_Assembly_A_AClassifierBehavior_Set_v_object.setName("object");
		Signal_Assembly_A_AClassifierBehavior_Set_v_object.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Set_v_object.setType(Signal_Assembly_A);
		// InputPin Signal_Assembly_Tester_TesterClassifierBehavior_Call test()::target
		addToElementRepository("target", Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target);
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target.setName("target");
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target.setType(Signal_Assembly_TestCase);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean Signal_Assembly_main_ObjectFlow108::LiteralBoolean109
		addToElementRepository("LiteralBoolean109", Signal_Assembly_main_ObjectFlow108_LiteralBoolean109);
		Signal_Assembly_main_ObjectFlow108_LiteralBoolean109.setName("LiteralBoolean109");
		Signal_Assembly_main_ObjectFlow108_LiteralBoolean109.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_ObjectFlow108_LiteralBoolean109.setValue(true);
		// LiteralBoolean Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59::LiteralBoolean61
		addToElementRepository("LiteralBoolean61", Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59_LiteralBoolean61);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59_LiteralBoolean61.setName("LiteralBoolean61");
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59_LiteralBoolean61.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59_LiteralBoolean61.setValue(true);
		// LiteralBoolean Signal_Assembly_A_AClassifierBehavior_ObjectFlow16::LiteralBoolean17
		addToElementRepository("LiteralBoolean17", Signal_Assembly_A_AClassifierBehavior_ObjectFlow16_LiteralBoolean17);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow16_LiteralBoolean17.setName("LiteralBoolean17");
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow16_LiteralBoolean17.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow16_LiteralBoolean17.setValue(true);
		// LiteralBoolean Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29::LiteralBoolean30
		addToElementRepository("LiteralBoolean30", Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralBoolean30);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralBoolean30.setName("LiteralBoolean30");
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralBoolean30.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralBoolean30.setValue(true);
		// LiteralBoolean Signal_Assembly_main_ObjectFlow105::LiteralBoolean106
		addToElementRepository("LiteralBoolean106", Signal_Assembly_main_ObjectFlow105_LiteralBoolean106);
		Signal_Assembly_main_ObjectFlow105_LiteralBoolean106.setName("LiteralBoolean106");
		Signal_Assembly_main_ObjectFlow105_LiteralBoolean106.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_ObjectFlow105_LiteralBoolean106.setValue(true);
		// LiteralBoolean Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55::LiteralBoolean56
		addToElementRepository("LiteralBoolean56", Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55_LiteralBoolean56);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55_LiteralBoolean56.setName("LiteralBoolean56");
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55_LiteralBoolean56.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55_LiteralBoolean56.setValue(true);
		// LiteralBoolean Signal_Assembly_A_AClassifierBehavior_ObjectFlow5::LiteralBoolean6
		addToElementRepository("LiteralBoolean6", Signal_Assembly_A_AClassifierBehavior_ObjectFlow5_LiteralBoolean6);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow5_LiteralBoolean6.setName("LiteralBoolean6");
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow5_LiteralBoolean6.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow5_LiteralBoolean6.setValue(true);
		// LiteralBoolean Signal_Assembly_main_ObjectFlow111::LiteralBoolean112
		addToElementRepository("LiteralBoolean112", Signal_Assembly_main_ObjectFlow111_LiteralBoolean112);
		Signal_Assembly_main_ObjectFlow111_LiteralBoolean112.setName("LiteralBoolean112");
		Signal_Assembly_main_ObjectFlow111_LiteralBoolean112.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_ObjectFlow111_LiteralBoolean112.setValue(true);
		// LiteralBoolean Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74::LiteralBoolean75
		addToElementRepository("LiteralBoolean75", Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74_LiteralBoolean75);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74_LiteralBoolean75.setName("LiteralBoolean75");
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74_LiteralBoolean75.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74_LiteralBoolean75.setValue(true);
		// LiteralBoolean Signal_Assembly_main_ObjectFlow99::LiteralBoolean100
		addToElementRepository("LiteralBoolean100", Signal_Assembly_main_ObjectFlow99_LiteralBoolean100);
		Signal_Assembly_main_ObjectFlow99_LiteralBoolean100.setName("LiteralBoolean100");
		Signal_Assembly_main_ObjectFlow99_LiteralBoolean100.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_ObjectFlow99_LiteralBoolean100.setValue(true);
		// LiteralBoolean Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77::LiteralBoolean79
		addToElementRepository("LiteralBoolean79", Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77_LiteralBoolean79);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77_LiteralBoolean79.setName("LiteralBoolean79");
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77_LiteralBoolean79.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77_LiteralBoolean79.setValue(true);
		// LiteralBoolean Signal_Assembly_A_AClassifierBehavior_ObjectFlow2::LiteralBoolean4
		addToElementRepository("LiteralBoolean4", Signal_Assembly_A_AClassifierBehavior_ObjectFlow2_LiteralBoolean4);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow2_LiteralBoolean4.setName("LiteralBoolean4");
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow2_LiteralBoolean4.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow2_LiteralBoolean4.setValue(true);
		// LiteralBoolean Signal_Assembly_main_ObjectFlow102::LiteralBoolean104
		addToElementRepository("LiteralBoolean104", Signal_Assembly_main_ObjectFlow102_LiteralBoolean104);
		Signal_Assembly_main_ObjectFlow102_LiteralBoolean104.setName("LiteralBoolean104");
		Signal_Assembly_main_ObjectFlow102_LiteralBoolean104.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_ObjectFlow102_LiteralBoolean104.setValue(true);
		// LiteralBoolean Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71::LiteralBoolean73
		addToElementRepository("LiteralBoolean73", Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71_LiteralBoolean73);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71_LiteralBoolean73.setName("LiteralBoolean73");
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71_LiteralBoolean73.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71_LiteralBoolean73.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59::LiteralInteger60
		addToElementRepository("LiteralInteger60", Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59_LiteralInteger60);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59_LiteralInteger60.setName("LiteralInteger60");
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59_LiteralInteger60.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59_LiteralInteger60.setValue(1);
		// LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_Read this.a_result::LiteralInteger67
		addToElementRepository("LiteralInteger67", Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result_LiteralInteger67);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result_LiteralInteger67.setName("LiteralInteger67");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result_LiteralInteger67.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result_LiteralInteger67.setValue(1);
		// LiteralInteger Signal_Assembly_main_TestCaseAssembly()_target::LiteralInteger115
		addToElementRepository("LiteralInteger115", Signal_Assembly_main_TestCaseAssembly__target_LiteralInteger115);
		Signal_Assembly_main_TestCaseAssembly__target_LiteralInteger115.setName("LiteralInteger115");
		Signal_Assembly_main_TestCaseAssembly__target_LiteralInteger115.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_TestCaseAssembly__target_LiteralInteger115.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Send S_value::LiteralInteger51
		addToElementRepository("LiteralInteger51", Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger51);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger51.setName("LiteralInteger51");
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger51.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger51.setValue(1);
		// LiteralInteger Signal_Assembly_main_Read TestCaseAssembly.tester_object::LiteralInteger96
		addToElementRepository("LiteralInteger96", Signal_Assembly_main_Read_TestCaseAssembly_tester_object_LiteralInteger96);
		Signal_Assembly_main_Read_TestCaseAssembly_tester_object_LiteralInteger96.setName("LiteralInteger96");
		Signal_Assembly_main_Read_TestCaseAssembly_tester_object_LiteralInteger96.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Read_TestCaseAssembly_tester_object_LiteralInteger96.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Send S_value::LiteralInteger52
		addToElementRepository("LiteralInteger52", Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger52);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger52.setName("LiteralInteger52");
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger52.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger52.setValue(1);
		// LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_Read a.v_result::LiteralInteger83
		addToElementRepository("LiteralInteger83", Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result_LiteralInteger83);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result_LiteralInteger83.setName("LiteralInteger83");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result_LiteralInteger83.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result_LiteralInteger83.setValue(1);
		// LiteralInteger Signal_Assembly_main_TestCaseAssembly()_result::LiteralInteger116
		addToElementRepository("LiteralInteger116", Signal_Assembly_main_TestCaseAssembly__result_LiteralInteger116);
		Signal_Assembly_main_TestCaseAssembly__result_LiteralInteger116.setName("LiteralInteger116");
		Signal_Assembly_main_TestCaseAssembly__result_LiteralInteger116.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_TestCaseAssembly__result_LiteralInteger116.setValue(1);
		// LiteralInteger Signal_Assembly_main_ObjectFlow111::LiteralInteger113
		addToElementRepository("LiteralInteger113", Signal_Assembly_main_ObjectFlow111_LiteralInteger113);
		Signal_Assembly_main_ObjectFlow111_LiteralInteger113.setName("LiteralInteger113");
		Signal_Assembly_main_ObjectFlow111_LiteralInteger113.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_ObjectFlow111_LiteralInteger113.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Accept Start_testCase::LiteralInteger43
		addToElementRepository("LiteralInteger43", Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger43);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger43.setName("LiteralInteger43");
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger43.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger43.setValue(1);
		// LiteralInteger Signal_Assembly_A_AClassifierBehavior_Accept S_value::LiteralInteger13
		addToElementRepository("LiteralInteger13", Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralInteger13);
		Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralInteger13.setName("LiteralInteger13");
		Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralInteger13.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralInteger13.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Accept Continue_result::LiteralInteger48
		addToElementRepository("LiteralInteger48", Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger48);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger48.setName("LiteralInteger48");
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger48.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger48.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Value(4)::LiteralInteger35
		addToElementRepository("LiteralInteger35", Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_LiteralInteger35);
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_LiteralInteger35.setName("LiteralInteger35");
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_LiteralInteger35.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_LiteralInteger35.setValue(4);
		// LiteralInteger Signal_Assembly_A_AClassifierBehavior_Accept S_value::LiteralInteger11
		addToElementRepository("LiteralInteger11", Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralInteger11);
		Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralInteger11.setName("LiteralInteger11");
		Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralInteger11.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralInteger11.setValue(1);
		// LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_Read this.a_object::LiteralInteger69
		addToElementRepository("LiteralInteger69", Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object_LiteralInteger69);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object_LiteralInteger69.setName("LiteralInteger69");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object_LiteralInteger69.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object_LiteralInteger69.setValue(1);
		// LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_Read a.v_object::LiteralInteger80
		addToElementRepository("LiteralInteger80", Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object_LiteralInteger80);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object_LiteralInteger80.setName("LiteralInteger80");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object_LiteralInteger80.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object_LiteralInteger80.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Accept Start_testCase::LiteralInteger41
		addToElementRepository("LiteralInteger41", Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger41);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger41.setName("LiteralInteger41");
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger41.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger41.setValue(1);
		// LiteralInteger Signal_Assembly_main_ObjectFlow105::LiteralInteger107
		addToElementRepository("LiteralInteger107", Signal_Assembly_main_ObjectFlow105_LiteralInteger107);
		Signal_Assembly_main_ObjectFlow105_LiteralInteger107.setName("LiteralInteger107");
		Signal_Assembly_main_ObjectFlow105_LiteralInteger107.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_ObjectFlow105_LiteralInteger107.setValue(1);
		// LiteralInteger Signal_Assembly_main_ObjectFlow99::LiteralInteger101
		addToElementRepository("LiteralInteger101", Signal_Assembly_main_ObjectFlow99_LiteralInteger101);
		Signal_Assembly_main_ObjectFlow99_LiteralInteger101.setName("LiteralInteger101");
		Signal_Assembly_main_ObjectFlow99_LiteralInteger101.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_ObjectFlow99_LiteralInteger101.setValue(1);
		// LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77::LiteralInteger78
		addToElementRepository("LiteralInteger78", Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77_LiteralInteger78);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77_LiteralInteger78.setName("LiteralInteger78");
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77_LiteralInteger78.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77_LiteralInteger78.setValue(1);
		// LiteralInteger Signal_Assembly_main_Send Start_testCase::LiteralInteger91
		addToElementRepository("LiteralInteger91", Signal_Assembly_main_Send_Start_testCase_LiteralInteger91);
		Signal_Assembly_main_Send_Start_testCase_LiteralInteger91.setName("LiteralInteger91");
		Signal_Assembly_main_Send_Start_testCase_LiteralInteger91.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Send_Start_testCase_LiteralInteger91.setValue(1);
		// LiteralInteger Signal_Assembly_main_Send Start_target::LiteralInteger89
		addToElementRepository("LiteralInteger89", Signal_Assembly_main_Send_Start_target_LiteralInteger89);
		Signal_Assembly_main_Send_Start_target_LiteralInteger89.setName("LiteralInteger89");
		Signal_Assembly_main_Send_Start_target_LiteralInteger89.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Send_Start_target_LiteralInteger89.setValue(1);
		// LiteralInteger Signal_Assembly_main_Read TestCaseAssembly.tester_result::LiteralInteger98
		addToElementRepository("LiteralInteger98", Signal_Assembly_main_Read_TestCaseAssembly_tester_result_LiteralInteger98);
		Signal_Assembly_main_Read_TestCaseAssembly_tester_result_LiteralInteger98.setName("LiteralInteger98");
		Signal_Assembly_main_Read_TestCaseAssembly_tester_result_LiteralInteger98.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Read_TestCaseAssembly_tester_result_LiteralInteger98.setValue(1);
		// LiteralInteger Signal_Assembly_A_AClassifierBehavior_ObjectFlow16::LiteralInteger18
		addToElementRepository("LiteralInteger18", Signal_Assembly_A_AClassifierBehavior_ObjectFlow16_LiteralInteger18);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow16_LiteralInteger18.setName("LiteralInteger18");
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow16_LiteralInteger18.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow16_LiteralInteger18.setValue(1);
		// LiteralInteger Signal_Assembly_A_AClassifierBehavior_this_result::LiteralInteger15
		addToElementRepository("LiteralInteger15", Signal_Assembly_A_AClassifierBehavior_this_result_LiteralInteger15);
		Signal_Assembly_A_AClassifierBehavior_this_result_LiteralInteger15.setName("LiteralInteger15");
		Signal_Assembly_A_AClassifierBehavior_this_result_LiteralInteger15.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_this_result_LiteralInteger15.setValue(1);
		// LiteralInteger Signal_Assembly_main_TestCaseAssembly()_result::LiteralInteger118
		addToElementRepository("LiteralInteger118", Signal_Assembly_main_TestCaseAssembly__result_LiteralInteger118);
		Signal_Assembly_main_TestCaseAssembly__result_LiteralInteger118.setName("LiteralInteger118");
		Signal_Assembly_main_TestCaseAssembly__result_LiteralInteger118.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_TestCaseAssembly__result_LiteralInteger118.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29::LiteralInteger31
		addToElementRepository("LiteralInteger31", Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralInteger31);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralInteger31.setName("LiteralInteger31");
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralInteger31.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralInteger31.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55::LiteralInteger57
		addToElementRepository("LiteralInteger57", Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55_LiteralInteger57);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55_LiteralInteger57.setName("LiteralInteger57");
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55_LiteralInteger57.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55_LiteralInteger57.setValue(1);
		// LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_Call testV_v::LiteralInteger84
		addToElementRepository("LiteralInteger84", Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralInteger84);
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralInteger84.setName("LiteralInteger84");
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralInteger84.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralInteger84.setValue(1);
		// LiteralInteger Signal_Assembly_A_AClassifierBehavior_Set v_value::LiteralInteger23
		addToElementRepository("LiteralInteger23", Signal_Assembly_A_AClassifierBehavior_Set_v_value_LiteralInteger23);
		Signal_Assembly_A_AClassifierBehavior_Set_v_value_LiteralInteger23.setName("LiteralInteger23");
		Signal_Assembly_A_AClassifierBehavior_Set_v_value_LiteralInteger23.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Set_v_value_LiteralInteger23.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Call test()_target::LiteralInteger38
		addToElementRepository("LiteralInteger38", Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger38);
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger38.setName("LiteralInteger38");
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger38.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger38.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Send S_target::LiteralInteger53
		addToElementRepository("LiteralInteger53", Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger53);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger53.setName("LiteralInteger53");
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger53.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger53.setValue(1);
		// LiteralInteger Signal_Assembly_main_ObjectFlow102::LiteralInteger103
		addToElementRepository("LiteralInteger103", Signal_Assembly_main_ObjectFlow102_LiteralInteger103);
		Signal_Assembly_main_ObjectFlow102_LiteralInteger103.setName("LiteralInteger103");
		Signal_Assembly_main_ObjectFlow102_LiteralInteger103.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_ObjectFlow102_LiteralInteger103.setValue(1);
		// LiteralInteger Signal_Assembly_A_AClassifierBehavior_ObjectFlow5::LiteralInteger7
		addToElementRepository("LiteralInteger7", Signal_Assembly_A_AClassifierBehavior_ObjectFlow5_LiteralInteger7);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow5_LiteralInteger7.setName("LiteralInteger7");
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow5_LiteralInteger7.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow5_LiteralInteger7.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Accept Continue_result::LiteralInteger47
		addToElementRepository("LiteralInteger47", Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger47);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger47.setName("LiteralInteger47");
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger47.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger47.setValue(1);
		// LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_Call testV_v::LiteralInteger86
		addToElementRepository("LiteralInteger86", Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralInteger86);
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralInteger86.setName("LiteralInteger86");
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralInteger86.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralInteger86.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_this_result::LiteralInteger32
		addToElementRepository("LiteralInteger32", Signal_Assembly_Tester_TesterClassifierBehavior_this_result_LiteralInteger32);
		Signal_Assembly_Tester_TesterClassifierBehavior_this_result_LiteralInteger32.setName("LiteralInteger32");
		Signal_Assembly_Tester_TesterClassifierBehavior_this_result_LiteralInteger32.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_this_result_LiteralInteger32.setValue(1);
		// LiteralInteger Signal_Assembly_main_Create TestCaseAssembly_result::LiteralInteger93
		addToElementRepository("LiteralInteger93", Signal_Assembly_main_Create_TestCaseAssembly_result_LiteralInteger93);
		Signal_Assembly_main_Create_TestCaseAssembly_result_LiteralInteger93.setName("LiteralInteger93");
		Signal_Assembly_main_Create_TestCaseAssembly_result_LiteralInteger93.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Create_TestCaseAssembly_result_LiteralInteger93.setValue(1);
		// LiteralInteger Signal_Assembly_main_Send Start_testCase::LiteralInteger90
		addToElementRepository("LiteralInteger90", Signal_Assembly_main_Send_Start_testCase_LiteralInteger90);
		Signal_Assembly_main_Send_Start_testCase_LiteralInteger90.setName("LiteralInteger90");
		Signal_Assembly_main_Send_Start_testCase_LiteralInteger90.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Send_Start_testCase_LiteralInteger90.setValue(1);
		// LiteralInteger Signal_Assembly_A_AClassifierBehavior_Set v_object::LiteralInteger22
		addToElementRepository("LiteralInteger22", Signal_Assembly_A_AClassifierBehavior_Set_v_object_LiteralInteger22);
		Signal_Assembly_A_AClassifierBehavior_Set_v_object_LiteralInteger22.setName("LiteralInteger22");
		Signal_Assembly_A_AClassifierBehavior_Set_v_object_LiteralInteger22.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Set_v_object_LiteralInteger22.setValue(1);
		// LiteralInteger Signal_Assembly_main_ObjectFlow108::LiteralInteger110
		addToElementRepository("LiteralInteger110", Signal_Assembly_main_ObjectFlow108_LiteralInteger110);
		Signal_Assembly_main_ObjectFlow108_LiteralInteger110.setName("LiteralInteger110");
		Signal_Assembly_main_ObjectFlow108_LiteralInteger110.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_ObjectFlow108_LiteralInteger110.setValue(1);
		// LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71::LiteralInteger72
		addToElementRepository("LiteralInteger72", Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71_LiteralInteger72);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71_LiteralInteger72.setName("LiteralInteger72");
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71_LiteralInteger72.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71_LiteralInteger72.setValue(1);
		// LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74::LiteralInteger76
		addToElementRepository("LiteralInteger76", Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74_LiteralInteger76);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74_LiteralInteger76.setName("LiteralInteger76");
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74_LiteralInteger76.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74_LiteralInteger76.setValue(1);
		// LiteralInteger Signal_Assembly_A_AClassifierBehavior_Send Continue_target::LiteralInteger9
		addToElementRepository("LiteralInteger9", Signal_Assembly_A_AClassifierBehavior_Send_Continue_target_LiteralInteger9);
		Signal_Assembly_A_AClassifierBehavior_Send_Continue_target_LiteralInteger9.setName("LiteralInteger9");
		Signal_Assembly_A_AClassifierBehavior_Send_Continue_target_LiteralInteger9.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Send_Continue_target_LiteralInteger9.setValue(1);
		// LiteralInteger Signal_Assembly_A_AClassifierBehavior_ObjectFlow2::LiteralInteger3
		addToElementRepository("LiteralInteger3", Signal_Assembly_A_AClassifierBehavior_ObjectFlow2_LiteralInteger3);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow2_LiteralInteger3.setName("LiteralInteger3");
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow2_LiteralInteger3.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow2_LiteralInteger3.setValue(1);
		// LiteralInteger Signal_Assembly_A_AClassifierBehavior_Set v_result::LiteralInteger20
		addToElementRepository("LiteralInteger20", Signal_Assembly_A_AClassifierBehavior_Set_v_result_LiteralInteger20);
		Signal_Assembly_A_AClassifierBehavior_Set_v_result_LiteralInteger20.setName("LiteralInteger20");
		Signal_Assembly_A_AClassifierBehavior_Set_v_result_LiteralInteger20.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Set_v_result_LiteralInteger20.setValue(1);
		// LiteralInteger Signal_Assembly_TestCaseAssembly_testActivity_this_result::LiteralInteger66
		addToElementRepository("LiteralInteger66", Signal_Assembly_TestCaseAssembly_testActivity_this_result_LiteralInteger66);
		Signal_Assembly_TestCaseAssembly_testActivity_this_result_LiteralInteger66.setName("LiteralInteger66");
		Signal_Assembly_TestCaseAssembly_testActivity_this_result_LiteralInteger66.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_this_result_LiteralInteger66.setValue(1);
		// LiteralInteger Signal_Assembly_Tester_TesterClassifierBehavior_Value(4)_result::LiteralInteger37
		addToElementRepository("LiteralInteger37", Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger37);
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger37.setName("LiteralInteger37");
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger37.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger37.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_Value(4)_result::LiteralUnlimitedNatural36
		addToElementRepository("LiteralUnlimitedNatural36", Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural36);
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural36.setName("LiteralUnlimitedNatural36");
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural36.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural36.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_A_AClassifierBehavior_Set v_object::LiteralUnlimitedNatural21
		addToElementRepository("LiteralUnlimitedNatural21", Signal_Assembly_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural21);
		Signal_Assembly_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural21.setName("LiteralUnlimitedNatural21");
		Signal_Assembly_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural21.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural21.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_Call test()_target::LiteralUnlimitedNatural39
		addToElementRepository("LiteralUnlimitedNatural39", Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural39);
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural39.setName("LiteralUnlimitedNatural39");
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural39.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural39.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_Send S_target::LiteralUnlimitedNatural54
		addToElementRepository("LiteralUnlimitedNatural54", Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural54);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural54.setName("LiteralUnlimitedNatural54");
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural54.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural54.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_main_TestCaseAssembly()_result::LiteralUnlimitedNatural117
		addToElementRepository("LiteralUnlimitedNatural117", Signal_Assembly_main_TestCaseAssembly__result_LiteralUnlimitedNatural117);
		Signal_Assembly_main_TestCaseAssembly__result_LiteralUnlimitedNatural117.setName("LiteralUnlimitedNatural117");
		Signal_Assembly_main_TestCaseAssembly__result_LiteralUnlimitedNatural117.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_TestCaseAssembly__result_LiteralUnlimitedNatural117.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_main_Read TestCaseAssembly.tester_object::LiteralUnlimitedNatural95
		addToElementRepository("LiteralUnlimitedNatural95", Signal_Assembly_main_Read_TestCaseAssembly_tester_object_LiteralUnlimitedNatural95);
		Signal_Assembly_main_Read_TestCaseAssembly_tester_object_LiteralUnlimitedNatural95.setName("LiteralUnlimitedNatural95");
		Signal_Assembly_main_Read_TestCaseAssembly_tester_object_LiteralUnlimitedNatural95.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Read_TestCaseAssembly_tester_object_LiteralUnlimitedNatural95.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_TestCaseAssembly_testActivity_Call testV_v::LiteralUnlimitedNatural85
		addToElementRepository("LiteralUnlimitedNatural85", Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralUnlimitedNatural85);
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralUnlimitedNatural85.setName("LiteralUnlimitedNatural85");
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralUnlimitedNatural85.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v_LiteralUnlimitedNatural85.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_Accept Start_testCase::LiteralUnlimitedNatural42
		addToElementRepository("LiteralUnlimitedNatural42", Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural42);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural42.setName("LiteralUnlimitedNatural42");
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural42.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural42.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_Accept Continue_result::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural46);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural46.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_TestCaseAssembly_testActivity_this_result::LiteralUnlimitedNatural65
		addToElementRepository("LiteralUnlimitedNatural65", Signal_Assembly_TestCaseAssembly_testActivity_this_result_LiteralUnlimitedNatural65);
		Signal_Assembly_TestCaseAssembly_testActivity_this_result_LiteralUnlimitedNatural65.setName("LiteralUnlimitedNatural65");
		Signal_Assembly_TestCaseAssembly_testActivity_this_result_LiteralUnlimitedNatural65.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_this_result_LiteralUnlimitedNatural65.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_main_Send Start_testCase::LiteralUnlimitedNatural92
		addToElementRepository("LiteralUnlimitedNatural92", Signal_Assembly_main_Send_Start_testCase_LiteralUnlimitedNatural92);
		Signal_Assembly_main_Send_Start_testCase_LiteralUnlimitedNatural92.setName("LiteralUnlimitedNatural92");
		Signal_Assembly_main_Send_Start_testCase_LiteralUnlimitedNatural92.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Send_Start_testCase_LiteralUnlimitedNatural92.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_main_Read TestCaseAssembly.tester_result::LiteralUnlimitedNatural97
		addToElementRepository("LiteralUnlimitedNatural97", Signal_Assembly_main_Read_TestCaseAssembly_tester_result_LiteralUnlimitedNatural97);
		Signal_Assembly_main_Read_TestCaseAssembly_tester_result_LiteralUnlimitedNatural97.setName("LiteralUnlimitedNatural97");
		Signal_Assembly_main_Read_TestCaseAssembly_tester_result_LiteralUnlimitedNatural97.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Read_TestCaseAssembly_tester_result_LiteralUnlimitedNatural97.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_A_AClassifierBehavior_Accept S_value::LiteralUnlimitedNatural12
		addToElementRepository("LiteralUnlimitedNatural12", Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural12);
		Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural12.setName("LiteralUnlimitedNatural12");
		Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural12.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural12.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_A_AClassifierBehavior_Set v_value::LiteralUnlimitedNatural24
		addToElementRepository("LiteralUnlimitedNatural24", Signal_Assembly_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural24);
		Signal_Assembly_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural24.setName("LiteralUnlimitedNatural24");
		Signal_Assembly_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural24.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural24.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_TestCaseAssembly_testActivity_Read a.v_result::LiteralUnlimitedNatural82
		addToElementRepository("LiteralUnlimitedNatural82", Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result_LiteralUnlimitedNatural82);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result_LiteralUnlimitedNatural82.setName("LiteralUnlimitedNatural82");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result_LiteralUnlimitedNatural82.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result_LiteralUnlimitedNatural82.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_main_Send Start_target::LiteralUnlimitedNatural88
		addToElementRepository("LiteralUnlimitedNatural88", Signal_Assembly_main_Send_Start_target_LiteralUnlimitedNatural88);
		Signal_Assembly_main_Send_Start_target_LiteralUnlimitedNatural88.setName("LiteralUnlimitedNatural88");
		Signal_Assembly_main_Send_Start_target_LiteralUnlimitedNatural88.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Send_Start_target_LiteralUnlimitedNatural88.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_A_AClassifierBehavior_this_result::LiteralUnlimitedNatural14
		addToElementRepository("LiteralUnlimitedNatural14", Signal_Assembly_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural14);
		Signal_Assembly_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural14.setName("LiteralUnlimitedNatural14");
		Signal_Assembly_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural14.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural14.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_TestCaseAssembly_testActivity_Read a.v_object::LiteralUnlimitedNatural81
		addToElementRepository("LiteralUnlimitedNatural81", Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object_LiteralUnlimitedNatural81);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object_LiteralUnlimitedNatural81.setName("LiteralUnlimitedNatural81");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object_LiteralUnlimitedNatural81.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object_LiteralUnlimitedNatural81.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_main_TestCaseAssembly()_target::LiteralUnlimitedNatural114
		addToElementRepository("LiteralUnlimitedNatural114", Signal_Assembly_main_TestCaseAssembly__target_LiteralUnlimitedNatural114);
		Signal_Assembly_main_TestCaseAssembly__target_LiteralUnlimitedNatural114.setName("LiteralUnlimitedNatural114");
		Signal_Assembly_main_TestCaseAssembly__target_LiteralUnlimitedNatural114.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_TestCaseAssembly__target_LiteralUnlimitedNatural114.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_Send S_value::LiteralUnlimitedNatural50
		addToElementRepository("LiteralUnlimitedNatural50", Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural50);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural50.setName("LiteralUnlimitedNatural50");
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural50.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural50.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_Tester_TesterClassifierBehavior_this_result::LiteralUnlimitedNatural33
		addToElementRepository("LiteralUnlimitedNatural33", Signal_Assembly_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural33);
		Signal_Assembly_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural33.setName("LiteralUnlimitedNatural33");
		Signal_Assembly_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural33.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural33.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_A_AClassifierBehavior_Set v_result::LiteralUnlimitedNatural19
		addToElementRepository("LiteralUnlimitedNatural19", Signal_Assembly_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural19);
		Signal_Assembly_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural19.setName("LiteralUnlimitedNatural19");
		Signal_Assembly_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural19.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural19.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_A_AClassifierBehavior_Send Continue_target::LiteralUnlimitedNatural8
		addToElementRepository("LiteralUnlimitedNatural8", Signal_Assembly_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural8);
		Signal_Assembly_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural8.setName("LiteralUnlimitedNatural8");
		Signal_Assembly_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural8.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural8.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_TestCaseAssembly_testActivity_Read this.a_result::LiteralUnlimitedNatural68
		addToElementRepository("LiteralUnlimitedNatural68", Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result_LiteralUnlimitedNatural68);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result_LiteralUnlimitedNatural68.setName("LiteralUnlimitedNatural68");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result_LiteralUnlimitedNatural68.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result_LiteralUnlimitedNatural68.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_TestCaseAssembly_testActivity_Read this.a_object::LiteralUnlimitedNatural70
		addToElementRepository("LiteralUnlimitedNatural70", Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object_LiteralUnlimitedNatural70);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object_LiteralUnlimitedNatural70.setName("LiteralUnlimitedNatural70");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object_LiteralUnlimitedNatural70.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object_LiteralUnlimitedNatural70.setValue(1);
		// LiteralUnlimitedNatural Signal_Assembly_main_Create TestCaseAssembly_result::LiteralUnlimitedNatural94
		addToElementRepository("LiteralUnlimitedNatural94", Signal_Assembly_main_Create_TestCaseAssembly_result_LiteralUnlimitedNatural94);
		Signal_Assembly_main_Create_TestCaseAssembly_result_LiteralUnlimitedNatural94.setName("LiteralUnlimitedNatural94");
		Signal_Assembly_main_Create_TestCaseAssembly_result_LiteralUnlimitedNatural94.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Create_TestCaseAssembly_result_LiteralUnlimitedNatural94.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow Signal_Assembly_Tester_TesterClassifierBehavior::ObjectFlow29
		addToElementRepository("ObjectFlow29", Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29.setName("ObjectFlow29");
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29.setSource(Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29.setTarget(Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29.setGuard(Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralBoolean30);
		// ObjectFlow Signal_Assembly_TestCaseAssembly_testActivity::ObjectFlow71
		addToElementRepository("ObjectFlow71", Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71.setName("ObjectFlow71");
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71.setSource(Signal_Assembly_TestCaseAssembly_testActivity_this_result);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71.setTarget(Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71.setGuard(Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow71_LiteralBoolean73);
		// ObjectFlow Signal_Assembly_TestCaseAssembly_testActivity::ObjectFlow74
		addToElementRepository("ObjectFlow74", Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74.setName("ObjectFlow74");
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74.setSource(Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74.setTarget(Signal_Assembly_TestCaseAssembly_testActivity_Call_testV_v);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74.setGuard(Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow74_LiteralBoolean75);
		// ObjectFlow Signal_Assembly_main::ObjectFlow105
		addToElementRepository("ObjectFlow105", Signal_Assembly_main_ObjectFlow105);
		Signal_Assembly_main_ObjectFlow105.setName("ObjectFlow105");
		Signal_Assembly_main_ObjectFlow105.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_main_ObjectFlow105.setSource(Signal_Assembly_main_Create_TestCaseAssembly_result);
		Signal_Assembly_main_ObjectFlow105.setTarget(Signal_Assembly_main_TestCaseAssembly__target);
		Signal_Assembly_main_ObjectFlow105.setGuard(Signal_Assembly_main_ObjectFlow105_LiteralBoolean106);
		// ObjectFlow Signal_Assembly_main::ObjectFlow111
		addToElementRepository("ObjectFlow111", Signal_Assembly_main_ObjectFlow111);
		Signal_Assembly_main_ObjectFlow111.setName("ObjectFlow111");
		Signal_Assembly_main_ObjectFlow111.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_main_ObjectFlow111.setSource(Signal_Assembly_main_TestCaseAssembly__result);
		Signal_Assembly_main_ObjectFlow111.setTarget(Signal_Assembly_main_Fork_testCase);
		Signal_Assembly_main_ObjectFlow111.setGuard(Signal_Assembly_main_ObjectFlow111_LiteralBoolean112);
		// ObjectFlow Signal_Assembly_A_AClassifierBehavior::ObjectFlow2
		addToElementRepository("ObjectFlow2", Signal_Assembly_A_AClassifierBehavior_ObjectFlow2);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow2.setName("ObjectFlow2");
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow2.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow2.setSource(Signal_Assembly_A_AClassifierBehavior_Set_v_result);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow2.setTarget(Signal_Assembly_A_AClassifierBehavior_Send_Continue_target);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow2.setGuard(Signal_Assembly_A_AClassifierBehavior_ObjectFlow2_LiteralBoolean4);
		// ObjectFlow Signal_Assembly_A_AClassifierBehavior::ObjectFlow5
		addToElementRepository("ObjectFlow5", Signal_Assembly_A_AClassifierBehavior_ObjectFlow5);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow5.setName("ObjectFlow5");
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow5.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow5.setSource(Signal_Assembly_A_AClassifierBehavior_Accept_S_value);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow5.setTarget(Signal_Assembly_A_AClassifierBehavior_Set_v_value);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow5.setGuard(Signal_Assembly_A_AClassifierBehavior_ObjectFlow5_LiteralBoolean6);
		// ObjectFlow Signal_Assembly_main::ObjectFlow99
		addToElementRepository("ObjectFlow99", Signal_Assembly_main_ObjectFlow99);
		Signal_Assembly_main_ObjectFlow99.setName("ObjectFlow99");
		Signal_Assembly_main_ObjectFlow99.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_main_ObjectFlow99.setSource(Signal_Assembly_main_Read_TestCaseAssembly_tester_result);
		Signal_Assembly_main_ObjectFlow99.setTarget(Signal_Assembly_main_Send_Start_target);
		Signal_Assembly_main_ObjectFlow99.setGuard(Signal_Assembly_main_ObjectFlow99_LiteralBoolean100);
		// ObjectFlow Signal_Assembly_main::ObjectFlow102
		addToElementRepository("ObjectFlow102", Signal_Assembly_main_ObjectFlow102);
		Signal_Assembly_main_ObjectFlow102.setName("ObjectFlow102");
		Signal_Assembly_main_ObjectFlow102.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_main_ObjectFlow102.setSource(Signal_Assembly_main_Fork_testCase);
		Signal_Assembly_main_ObjectFlow102.setTarget(Signal_Assembly_main_Send_Start_testCase);
		Signal_Assembly_main_ObjectFlow102.setGuard(Signal_Assembly_main_ObjectFlow102_LiteralBoolean104);
		// ObjectFlow Signal_Assembly_TestCaseAssembly_testActivity::ObjectFlow77
		addToElementRepository("ObjectFlow77", Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77.setName("ObjectFlow77");
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77.setSource(Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77.setTarget(Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object);
		Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77.setGuard(Signal_Assembly_TestCaseAssembly_testActivity_ObjectFlow77_LiteralBoolean79);
		// ObjectFlow Signal_Assembly_A_AClassifierBehavior::ObjectFlow16
		addToElementRepository("ObjectFlow16", Signal_Assembly_A_AClassifierBehavior_ObjectFlow16);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow16.setName("ObjectFlow16");
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow16.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow16.setSource(Signal_Assembly_A_AClassifierBehavior_this_result);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow16.setTarget(Signal_Assembly_A_AClassifierBehavior_Set_v_object);
		Signal_Assembly_A_AClassifierBehavior_ObjectFlow16.setGuard(Signal_Assembly_A_AClassifierBehavior_ObjectFlow16_LiteralBoolean17);
		// ObjectFlow Signal_Assembly_main::ObjectFlow108
		addToElementRepository("ObjectFlow108", Signal_Assembly_main_ObjectFlow108);
		Signal_Assembly_main_ObjectFlow108.setName("ObjectFlow108");
		Signal_Assembly_main_ObjectFlow108.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_main_ObjectFlow108.setSource(Signal_Assembly_main_Fork_testCase);
		Signal_Assembly_main_ObjectFlow108.setTarget(Signal_Assembly_main_Read_TestCaseAssembly_tester_object);
		Signal_Assembly_main_ObjectFlow108.setGuard(Signal_Assembly_main_ObjectFlow108_LiteralBoolean109);
		// ObjectFlow Signal_Assembly_Tester_TesterClassifierBehavior::ObjectFlow55
		addToElementRepository("ObjectFlow55", Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55.setName("ObjectFlow55");
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55.setSource(Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55.setTarget(Signal_Assembly_Tester_TesterClassifierBehavior_Call_test__target);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55.setGuard(Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow55_LiteralBoolean56);
		// ObjectFlow Signal_Assembly_Tester_TesterClassifierBehavior::ObjectFlow59
		addToElementRepository("ObjectFlow59", Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59.setName("ObjectFlow59");
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59.setSource(Signal_Assembly_Tester_TesterClassifierBehavior_this_result);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59.setTarget(Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target);
		Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59.setGuard(Signal_Assembly_Tester_TesterClassifierBehavior_ObjectFlow59_LiteralBoolean61);
	}

	private void initializeOperation_Instances()
	{
		// Operation Signal_Assembly_A::A_A
		addToElementRepository("A_A", Signal_Assembly_A_A_A);
		Signal_Assembly_A_A_A.setName("A");
		Signal_Assembly_A_A_A.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_A_A.addOwnedParameter(Signal_Assembly_A_A_A_result);
		Signal_Assembly_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation Signal_Assembly_TestCase::test
		addToElementRepository("test", Signal_Assembly_TestCase_test);
		Signal_Assembly_TestCase_test.setName("test");
		Signal_Assembly_TestCase_test.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCase_test.setIsAbstract(true);
		// Operation Signal_Assembly_TestCaseAssembly::TestCaseAssembly_TestCaseAssembly
		addToElementRepository("TestCaseAssembly_TestCaseAssembly", Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly);
		Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly.setName("TestCaseAssembly");
		Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly.addOwnedParameter(Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly_result);
		Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation Signal_Assembly_Tester::Tester_Tester
		addToElementRepository("Tester_Tester", Signal_Assembly_Tester_Tester_Tester);
		Signal_Assembly_Tester_Tester_Tester.setName("Tester");
		Signal_Assembly_Tester_Tester_Tester.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_Tester_Tester.addOwnedParameter(Signal_Assembly_Tester_Tester_Tester_result);
		Signal_Assembly_Tester_Tester_Tester.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation Signal_Assembly_TestCaseAssembly::test
		addToElementRepository("test", Signal_Assembly_TestCaseAssembly_test);
		Signal_Assembly_TestCaseAssembly_test.setName("test");
		Signal_Assembly_TestCaseAssembly_test.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_test.addMethod(Signal_Assembly_TestCaseAssembly_testActivity);
		Signal_Assembly_TestCaseAssembly_test.addRedefinedOperation(Signal_Assembly_TestCase_test);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin Signal_Assembly_TestCaseAssembly_testActivity_Read a.v::result
		addToElementRepository("result", Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result.setName("result");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Signal_Assembly_A_AClassifierBehavior_this::result
		addToElementRepository("result", Signal_Assembly_A_AClassifierBehavior_this_result);
		Signal_Assembly_A_AClassifierBehavior_this_result.setName("result");
		Signal_Assembly_A_AClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_this_result.setType(Signal_Assembly_A);
		// OutputPin Signal_Assembly_A_AClassifierBehavior_Accept S::value
		addToElementRepository("value", Signal_Assembly_A_AClassifierBehavior_Accept_S_value);
		Signal_Assembly_A_AClassifierBehavior_Accept_S_value.setName("value");
		Signal_Assembly_A_AClassifierBehavior_Accept_S_value.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Accept_S_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Signal_Assembly_main_Create TestCaseAssembly::result
		addToElementRepository("result", Signal_Assembly_main_Create_TestCaseAssembly_result);
		Signal_Assembly_main_Create_TestCaseAssembly_result.setName("result");
		Signal_Assembly_main_Create_TestCaseAssembly_result.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Create_TestCaseAssembly_result.setType(Signal_Assembly_TestCaseAssembly);
		// OutputPin Signal_Assembly_Tester_TesterClassifierBehavior_Accept Start::testCase
		addToElementRepository("testCase", Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase.setName("testCase");
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_testCase.setType(Signal_Assembly_TestCase);
		// OutputPin Signal_Assembly_Tester_TesterClassifierBehavior_Accept Continue::result
		addToElementRepository("result", Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result.setName("result");
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_result.setType(Signal_Assembly_Continue);
		// OutputPin Signal_Assembly_TestCaseAssembly_testActivity_Read this.a::result
		addToElementRepository("result", Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result.setName("result");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result.setType(Signal_Assembly_A);
		// OutputPin Signal_Assembly_A_AClassifierBehavior_Set v::result
		addToElementRepository("result", Signal_Assembly_A_AClassifierBehavior_Set_v_result);
		Signal_Assembly_A_AClassifierBehavior_Set_v_result.setName("result");
		Signal_Assembly_A_AClassifierBehavior_Set_v_result.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Set_v_result.setType(Signal_Assembly_A);
		// OutputPin Signal_Assembly_main_TestCaseAssembly()::result
		addToElementRepository("result", Signal_Assembly_main_TestCaseAssembly__result);
		Signal_Assembly_main_TestCaseAssembly__result.setName("result");
		Signal_Assembly_main_TestCaseAssembly__result.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_TestCaseAssembly__result.setType(Signal_Assembly_TestCaseAssembly);
		// OutputPin Signal_Assembly_TestCaseAssembly_testActivity_this::result
		addToElementRepository("result", Signal_Assembly_TestCaseAssembly_testActivity_this_result);
		Signal_Assembly_TestCaseAssembly_testActivity_this_result.setName("result");
		Signal_Assembly_TestCaseAssembly_testActivity_this_result.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_this_result.setType(Signal_Assembly_TestCaseAssembly);
		// OutputPin Signal_Assembly_Tester_TesterClassifierBehavior_Value(4)::result
		addToElementRepository("result", Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result);
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result.setName("result");
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Signal_Assembly_Tester_TesterClassifierBehavior_this::result
		addToElementRepository("result", Signal_Assembly_Tester_TesterClassifierBehavior_this_result);
		Signal_Assembly_Tester_TesterClassifierBehavior_this_result.setName("result");
		Signal_Assembly_Tester_TesterClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_this_result.setType(Signal_Assembly_Tester);
		// OutputPin Signal_Assembly_main_Read TestCaseAssembly.tester::result
		addToElementRepository("result", Signal_Assembly_main_Read_TestCaseAssembly_tester_result);
		Signal_Assembly_main_Read_TestCaseAssembly_tester_result.setName("result");
		Signal_Assembly_main_Read_TestCaseAssembly_tester_result.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Read_TestCaseAssembly_tester_result.setType(Signal_Assembly_Tester);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport Signal_Assembly::PackageImport27
		addToElementRepository("PackageImport27", Signal_Assembly_PackageImport27);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter Signal_Assembly_TestCaseAssembly_testActivity_testV::v
		addToElementRepository("v", Signal_Assembly_TestCaseAssembly_testActivity_testV_v);
		Signal_Assembly_TestCaseAssembly_testActivity_testV_v.setName("v");
		Signal_Assembly_TestCaseAssembly_testActivity_testV_v.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_TestCaseAssembly_testActivity_testV_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly::result
		addToElementRepository("result", Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly_result);
		Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly_result.setName("result");
		Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly_result.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly_result.setType(Signal_Assembly_TestCaseAssembly);
		Signal_Assembly_TestCaseAssembly_TestCaseAssembly_TestCaseAssembly_result.setDirection(ParameterDirectionKind.return_);
		// Parameter Signal_Assembly_A_A_A::result
		addToElementRepository("result", Signal_Assembly_A_A_A_result);
		Signal_Assembly_A_A_A_result.setName("result");
		Signal_Assembly_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_A_A_A_result.setType(Signal_Assembly_A);
		Signal_Assembly_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter Signal_Assembly_Tester_Tester_Tester::result
		addToElementRepository("result", Signal_Assembly_Tester_Tester_Tester_result);
		Signal_Assembly_Tester_Tester_Tester_result.setName("result");
		Signal_Assembly_Tester_Tester_Tester_result.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Tester_Tester_Tester_result.setType(Signal_Assembly_Tester);
		Signal_Assembly_Tester_Tester_Tester_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port Signal_Assembly_A::p
		addToElementRepository("p", Signal_Assembly_A_p);
		Signal_Assembly_A_p.setName("p");
		Signal_Assembly_A_p.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_A_p.setType(Signal_Assembly_I);
		Signal_Assembly_A_p.setAggregation(AggregationKind.composite);
		Signal_Assembly_A_p.isBehavior = true;
		Signal_Assembly_A_p.isService = true;
		// Port Signal_Assembly_Tester::q
		addToElementRepository("q", Signal_Assembly_Tester_q);
		Signal_Assembly_Tester_q.setName("q");
		Signal_Assembly_Tester_q.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Tester_q.setType(Signal_Assembly_I);
		Signal_Assembly_Tester_q.setAggregation(AggregationKind.composite);
		Signal_Assembly_Tester_q.isBehavior = true;
		Signal_Assembly_Tester_q.isService = true;
	}

	private void initializeProperty_Instances()
	{
		// Property Signal_Assembly_TestCaseAssembly::a
		addToElementRepository("a", Signal_Assembly_TestCaseAssembly_a);
		Signal_Assembly_TestCaseAssembly_a.setName("a");
		Signal_Assembly_TestCaseAssembly_a.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_TestCaseAssembly_a.setType(Signal_Assembly_A);
		Signal_Assembly_TestCaseAssembly_a.setAggregation(AggregationKind.composite);
		// Property Signal_Assembly_Start::testCase
		addToElementRepository("testCase", Signal_Assembly_Start_testCase);
		Signal_Assembly_Start_testCase.setName("testCase");
		Signal_Assembly_Start_testCase.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Start_testCase.setType(Signal_Assembly_TestCase);
		// Property Signal_Assembly_R::x
		addToElementRepository("x", Signal_Assembly_R_x);
		Signal_Assembly_R_x.setName("x");
		Signal_Assembly_R_x.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_R_x.setType(Signal_Assembly_I);
		// Property Signal_Assembly_TestCaseAssembly::tester
		addToElementRepository("tester", Signal_Assembly_TestCaseAssembly_tester);
		Signal_Assembly_TestCaseAssembly_tester.setName("tester");
		Signal_Assembly_TestCaseAssembly_tester.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_TestCaseAssembly_tester.setType(Signal_Assembly_Tester);
		Signal_Assembly_TestCaseAssembly_tester.setAggregation(AggregationKind.composite);
		// Property Signal_Assembly_S::value
		addToElementRepository("value", Signal_Assembly_S_value);
		Signal_Assembly_S_value.setName("value");
		Signal_Assembly_S_value.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_S_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property Signal_Assembly_A::v
		addToElementRepository("v", Signal_Assembly_A_v);
		Signal_Assembly_A_v.setName("v");
		Signal_Assembly_A_v.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_A_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		Signal_Assembly_A_v.setAggregation(AggregationKind.shared);
		// Property Signal_Assembly_R::y
		addToElementRepository("y", Signal_Assembly_R_y);
		Signal_Assembly_R_y.setName("y");
		Signal_Assembly_R_y.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_R_y.setType(Signal_Assembly_I);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction Signal_Assembly_TestCaseAssembly_testActivity::this
		addToElementRepository("this", Signal_Assembly_TestCaseAssembly_testActivity_this);
		Signal_Assembly_TestCaseAssembly_testActivity_this.setName("this");
		Signal_Assembly_TestCaseAssembly_testActivity_this.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_this.setResult(Signal_Assembly_TestCaseAssembly_testActivity_this_result);
		// ReadSelfAction Signal_Assembly_Tester_TesterClassifierBehavior::this
		addToElementRepository("this", Signal_Assembly_Tester_TesterClassifierBehavior_this);
		Signal_Assembly_Tester_TesterClassifierBehavior_this.setName("this");
		Signal_Assembly_Tester_TesterClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_this.setResult(Signal_Assembly_Tester_TesterClassifierBehavior_this_result);
		// ReadSelfAction Signal_Assembly_A_AClassifierBehavior::this
		addToElementRepository("this", Signal_Assembly_A_AClassifierBehavior_this);
		Signal_Assembly_A_AClassifierBehavior_this.setName("this");
		Signal_Assembly_A_AClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_this.setResult(Signal_Assembly_A_AClassifierBehavior_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction Signal_Assembly_TestCaseAssembly_testActivity::Read this.a
		addToElementRepository("Read this.a", Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a.setName("Read this.a");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a.setStructuralFeature(Signal_Assembly_TestCaseAssembly_a);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a.setObject(Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_object);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a.setResult(Signal_Assembly_TestCaseAssembly_testActivity_Read_this_a_result);
		// ReadStructuralFeatureAction Signal_Assembly_main::Read TestCaseAssembly.tester
		addToElementRepository("Read TestCaseAssembly.tester", Signal_Assembly_main_Read_TestCaseAssembly_tester);
		Signal_Assembly_main_Read_TestCaseAssembly_tester.setName("Read TestCaseAssembly.tester");
		Signal_Assembly_main_Read_TestCaseAssembly_tester.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Read_TestCaseAssembly_tester.setStructuralFeature(Signal_Assembly_TestCaseAssembly_tester);
		Signal_Assembly_main_Read_TestCaseAssembly_tester.setObject(Signal_Assembly_main_Read_TestCaseAssembly_tester_object);
		Signal_Assembly_main_Read_TestCaseAssembly_tester.setResult(Signal_Assembly_main_Read_TestCaseAssembly_tester_result);
		// ReadStructuralFeatureAction Signal_Assembly_TestCaseAssembly_testActivity::Read a.v
		addToElementRepository("Read a.v", Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v.setName("Read a.v");
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v.setVisibility(VisibilityKind.public_);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v.setStructuralFeature(Signal_Assembly_A_v);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v.setObject(Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_object);
		Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v.setResult(Signal_Assembly_TestCaseAssembly_testActivity_Read_a_v_result);
	}

	private void initializeReception_Instances()
	{
		// Reception Signal_Assembly_Tester::Start
		addToElementRepository("Start", Signal_Assembly_Tester_Start);
		Signal_Assembly_Tester_Start.setName("Start");
		Signal_Assembly_Tester_Start.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_Start.setSignal(Signal_Assembly_Start);
	}

	private void initializeSendSignalAction_Instances()
	{
		// SendSignalAction Signal_Assembly_main::Send Start
		addToElementRepository("Send Start", Signal_Assembly_main_Send_Start);
		Signal_Assembly_main_Send_Start.setName("Send Start");
		Signal_Assembly_main_Send_Start.setVisibility(VisibilityKind.public_);
		Signal_Assembly_main_Send_Start.setSignal(Signal_Assembly_Start);
		Signal_Assembly_main_Send_Start.setTarget(Signal_Assembly_main_Send_Start_target);
		Signal_Assembly_main_Send_Start.addArgument(Signal_Assembly_main_Send_Start_testCase);
		// SendSignalAction Signal_Assembly_A_AClassifierBehavior::Send Continue
		addToElementRepository("Send Continue", Signal_Assembly_A_AClassifierBehavior_Send_Continue);
		Signal_Assembly_A_AClassifierBehavior_Send_Continue.setName("Send Continue");
		Signal_Assembly_A_AClassifierBehavior_Send_Continue.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Send_Continue.setSignal(Signal_Assembly_Continue);
		Signal_Assembly_A_AClassifierBehavior_Send_Continue.setTarget(Signal_Assembly_A_AClassifierBehavior_Send_Continue_target);
		Signal_Assembly_A_AClassifierBehavior_Send_Continue.setOnPort(Signal_Assembly_A_p);
		// SendSignalAction Signal_Assembly_Tester_TesterClassifierBehavior::Send S
		addToElementRepository("Send S", Signal_Assembly_Tester_TesterClassifierBehavior_Send_S);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S.setName("Send S");
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S.setSignal(Signal_Assembly_S);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S.setTarget(Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_target);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S.addArgument(Signal_Assembly_Tester_TesterClassifierBehavior_Send_S_value);
		Signal_Assembly_Tester_TesterClassifierBehavior_Send_S.setOnPort(Signal_Assembly_Tester_q);
	}

	private void initializeSignal_Instances()
	{
		// Signal Signal_Assembly::Continue
		addToElementRepository("Continue", Signal_Assembly_Continue);
		Signal_Assembly_Continue.setName("Continue");
		Signal_Assembly_Continue.setVisibility(VisibilityKind.public_);
		// Signal Signal_Assembly::S
		addToElementRepository("S", Signal_Assembly_S);
		Signal_Assembly_S.setName("S");
		Signal_Assembly_S.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_S.addOwnedAttribute(Signal_Assembly_S_value);
		// Signal Signal_Assembly::Start
		addToElementRepository("Start", Signal_Assembly_Start);
		Signal_Assembly_Start.setName("Start");
		Signal_Assembly_Start.setVisibility(VisibilityKind.public_);
		
		Signal_Assembly_Start.addOwnedAttribute(Signal_Assembly_Start_testCase);
	}

	private void initializeSignalEvent_Instances()
	{
		// SignalEvent Signal_Assembly::ContinueEvent
		addToElementRepository("ContinueEvent", Signal_Assembly_ContinueEvent);
		Signal_Assembly_ContinueEvent.setName("ContinueEvent");
		Signal_Assembly_ContinueEvent.setVisibility(VisibilityKind.public_);
		Signal_Assembly_ContinueEvent.setSignal(Signal_Assembly_Continue);
		// SignalEvent Signal_Assembly::StartEvent
		addToElementRepository("StartEvent", Signal_Assembly_StartEvent);
		Signal_Assembly_StartEvent.setName("StartEvent");
		Signal_Assembly_StartEvent.setVisibility(VisibilityKind.public_);
		Signal_Assembly_StartEvent.setSignal(Signal_Assembly_Start);
		// SignalEvent Signal_Assembly::SEvent
		addToElementRepository("SEvent", Signal_Assembly_SEvent);
		Signal_Assembly_SEvent.setName("SEvent");
		Signal_Assembly_SEvent.setVisibility(VisibilityKind.public_);
		Signal_Assembly_SEvent.setSignal(Signal_Assembly_S);
	}

	private void initializeTrigger_Instances()
	{
		// Trigger Signal_Assembly_A_AClassifierBehavior_Accept S::Trigger10
		addToElementRepository("Trigger10", Signal_Assembly_A_AClassifierBehavior_Accept_S_Trigger10);
		// Trigger Trigger10
		Signal_Assembly_A_AClassifierBehavior_Accept_S_Trigger10.setName("Trigger10");
		Signal_Assembly_A_AClassifierBehavior_Accept_S_Trigger10.setVisibility(VisibilityKind.public_);
		Signal_Assembly_A_AClassifierBehavior_Accept_S_Trigger10.setEvent(Signal_Assembly_SEvent);
		// Trigger Signal_Assembly_Tester_TesterClassifierBehavior_Accept Continue::Trigger49
		addToElementRepository("Trigger49", Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_Trigger49);
		// Trigger Trigger49
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_Trigger49.setName("Trigger49");
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_Trigger49.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Continue_Trigger49.setEvent(Signal_Assembly_ContinueEvent);
		// Trigger Signal_Assembly_Tester_TesterClassifierBehavior_Accept Start::Trigger44
		addToElementRepository("Trigger44", Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_Trigger44);
		// Trigger Trigger44
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_Trigger44.setName("Trigger44");
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_Trigger44.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Accept_Start_Trigger44.setEvent(Signal_Assembly_StartEvent);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction Signal_Assembly_Tester_TesterClassifierBehavior::Value(4)
		addToElementRepository("Value(4)", Signal_Assembly_Tester_TesterClassifierBehavior_Value_4);
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4.setName("Value(4)");
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4.setVisibility(VisibilityKind.public_);
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4.setValue(Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_LiteralInteger35);
		Signal_Assembly_Tester_TesterClassifierBehavior_Value_4.setResult(Signal_Assembly_Tester_TesterClassifierBehavior_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // Signal_AssemblyModel
