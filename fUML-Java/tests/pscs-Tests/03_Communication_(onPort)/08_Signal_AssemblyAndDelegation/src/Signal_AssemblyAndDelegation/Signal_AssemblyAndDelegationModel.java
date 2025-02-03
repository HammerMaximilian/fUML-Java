/*
 * Signal_AssemblyAndDelegationModel.java
 * 
 * Auto-generated file
 */
package Signal_AssemblyAndDelegation;

import uml.commonbehavior.SignalEvent;
import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.classification.Generalization;
import uml.structuredclassifiers.Connector;
import uml.values.LiteralUnlimitedNatural;
import uml.activities.ActivityFinalNode;
import uml.simpleclassifiers.Signal;
import uml.actions.OutputPin;
import uml.activities.Activity;
import uml.actions.ReadStructuralFeatureAction;
import uml.actions.CallOperationAction;
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
import uml.actions.ValueSpecificationAction;
import uml.actions.CreateObjectAction;
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
import uml.commonbehavior.Trigger;
import uml.structuredclassifiers.Port;
import uml.actions.SendSignalAction;


/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class Signal_AssemblyAndDelegationModel extends InMemoryModel
{
	private static Signal_AssemblyAndDelegationModel instance;

	/*
	 * Model Signal_AssemblyAndDelegation
	 */
	public Package Signal_AssemblyAndDelegation = new Package();
		public SignalEvent Signal_AssemblyAndDelegation_SEvent = new SignalEvent();
		public Class_ Signal_AssemblyAndDelegation_C = new Class_();
			public Property Signal_AssemblyAndDelegation_C_tester = new Property();
			public Connector Signal_AssemblyAndDelegation_C_r = new Connector();
				public ConnectorEnd Signal_AssemblyAndDelegation_C_r_ConnectorEnd0 = new ConnectorEnd();
				public ConnectorEnd Signal_AssemblyAndDelegation_C_r_ConnectorEnd1 = new ConnectorEnd();
			public Port Signal_AssemblyAndDelegation_C_q = new Port();
		public Class_ Signal_AssemblyAndDelegation_A = new Class_();
			public Port Signal_AssemblyAndDelegation_A_p = new Port();
			public Operation Signal_AssemblyAndDelegation_A_A_A = new Operation();
				public Parameter Signal_AssemblyAndDelegation_A_A_A_result = new Parameter();
			public Property Signal_AssemblyAndDelegation_A_v = new Property();
			public Activity Signal_AssemblyAndDelegation_A_AClassifierBehavior = new Activity();
				public ObjectFlow Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2 = new ObjectFlow();
					public LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2_LiteralInteger3 = new LiteralInteger();
					public LiteralBoolean Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2_LiteralBoolean4 = new LiteralBoolean();
				public ControlFlow Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow5 = new ControlFlow();
				public ReadSelfAction Signal_AssemblyAndDelegation_A_AClassifierBehavior_this = new ReadSelfAction();
					public OutputPin Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result_LiteralInteger6 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural7 = new LiteralUnlimitedNatural();
				public ControlFlow Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow8 = new ControlFlow();
				public AcceptEventAction Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S = new AcceptEventAction();
					public OutputPin Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value = new OutputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralInteger9 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural10 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralInteger11 = new LiteralInteger();
					public Trigger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_Trigger12 = new Trigger();
				public AddStructuralFeatureValueAction Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v = new AddStructuralFeatureValueAction();
					public InputPin Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object = new InputPin();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural13 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object_LiteralInteger14 = new LiteralInteger();
					public InputPin Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value = new InputPin();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural15 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value_LiteralInteger16 = new LiteralInteger();
					public OutputPin Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result = new OutputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result_LiteralInteger17 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural18 = new LiteralUnlimitedNatural();
				public ObjectFlow Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19 = new ObjectFlow();
					public LiteralBoolean Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19_LiteralBoolean20 = new LiteralBoolean();
					public LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19_LiteralInteger21 = new LiteralInteger();
				public ObjectFlow Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22 = new ObjectFlow();
					public LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22_LiteralInteger23 = new LiteralInteger();
					public LiteralBoolean Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22_LiteralBoolean24 = new LiteralBoolean();
				public SendSignalAction Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue = new SendSignalAction();
					public InputPin Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target = new InputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target_LiteralInteger25 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural26 = new LiteralUnlimitedNatural();
				public ActivityFinalNode Signal_AssemblyAndDelegation_A_AClassifierBehavior_ActivityFinalNode27 = new ActivityFinalNode();
		public SignalEvent Signal_AssemblyAndDelegation_StartEvent = new SignalEvent();
		public Association Signal_AssemblyAndDelegation_R = new Association();
			public Property Signal_AssemblyAndDelegation_R_x = new Property();
			public Property Signal_AssemblyAndDelegation_R_y = new Property();
		public Comment Signal_AssemblyAndDelegation_Comment28 = new Comment();
		public PackageImport Signal_AssemblyAndDelegation_PackageImport29 = new PackageImport();
		public Signal Signal_AssemblyAndDelegation_S = new Signal();
			public Property Signal_AssemblyAndDelegation_S_value = new Property();
		public Comment Signal_AssemblyAndDelegation_Comment30 = new Comment();
		public Class_ Signal_AssemblyAndDelegation_Tester = new Class_();
			public Reception Signal_AssemblyAndDelegation_Tester_Start = new Reception();
			public Activity Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior = new Activity();
				public ObjectFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31 = new ObjectFlow();
					public LiteralBoolean Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31_LiteralBoolean32 = new LiteralBoolean();
					public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31_LiteralInteger33 = new LiteralInteger();
				public ActivityFinalNode Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ActivityFinalNode34 = new ActivityFinalNode();
				public ControlFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow35 = new ControlFlow();
				public ControlFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow36 = new ControlFlow();
				public ControlFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow37 = new ControlFlow();
				public CallOperationAction Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test_ = new CallOperationAction();
					public InputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target = new InputPin();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural38 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger39 = new LiteralInteger();
				public ControlFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow40 = new ControlFlow();
				public ObjectFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41 = new ObjectFlow();
					public LiteralBoolean Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41_LiteralBoolean42 = new LiteralBoolean();
					public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41_LiteralInteger43 = new LiteralInteger();
				public ValueSpecificationAction Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4 = new ValueSpecificationAction();
					public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_LiteralInteger44 = new LiteralInteger();
					public OutputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result = new OutputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger45 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
				public AcceptEventAction Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue = new AcceptEventAction();
					public OutputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result = new OutputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger47 = new LiteralInteger();
						public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger48 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural49 = new LiteralUnlimitedNatural();
					public Trigger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_Trigger50 = new Trigger();
				public ReadSelfAction Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this = new ReadSelfAction();
					public OutputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result_LiteralInteger51 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural52 = new LiteralUnlimitedNatural();
				public AcceptEventAction Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start = new AcceptEventAction();
					public Trigger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_Trigger53 = new Trigger();
					public OutputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase = new OutputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger54 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural55 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger56 = new LiteralInteger();
				public ObjectFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57 = new ObjectFlow();
					public LiteralBoolean Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57_LiteralBoolean58 = new LiteralBoolean();
					public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57_LiteralInteger59 = new LiteralInteger();
				public SendSignalAction Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S = new SendSignalAction();
					public InputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value = new InputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger60 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural61 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger62 = new LiteralInteger();
					public InputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target = new InputPin();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural63 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger64 = new LiteralInteger();
			public Operation Signal_AssemblyAndDelegation_Tester_Tester_Tester = new Operation();
				public Parameter Signal_AssemblyAndDelegation_Tester_Tester_Tester_result = new Parameter();
			public Port Signal_AssemblyAndDelegation_Tester_q = new Port();
		public SignalEvent Signal_AssemblyAndDelegation_ContinueEvent = new SignalEvent();
		public Class_ Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation = new Class_();
			public Property Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_b = new Property();
			public Operation Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation = new Operation();
				public Parameter Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_result = new Parameter();
			public Connector Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r = new Connector();
				public ConnectorEnd Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r_ConnectorEnd65 = new ConnectorEnd();
				public ConnectorEnd Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r_ConnectorEnd66 = new ConnectorEnd();
			public Property Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_c = new Property();
			public Activity Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity = new Activity();
				public ReadStructuralFeatureAction Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a = new ReadStructuralFeatureAction();
					public InputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object = new InputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object_LiteralInteger67 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object_LiteralUnlimitedNatural68 = new LiteralUnlimitedNatural();
					public OutputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result = new OutputPin();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result_LiteralUnlimitedNatural69 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result_LiteralInteger70 = new LiteralInteger();
				public OpaqueBehavior Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV = new OpaqueBehavior();
					public Parameter Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV_v = new Parameter();
				public CallBehaviorAction Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV = new CallBehaviorAction();
					public InputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v = new InputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralInteger71 = new LiteralInteger();
						public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralInteger72 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralUnlimitedNatural73 = new LiteralUnlimitedNatural();
				public ReadSelfAction Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this = new ReadSelfAction();
					public OutputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result_LiteralUnlimitedNatural74 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result_LiteralInteger75 = new LiteralInteger();
				public ObjectFlow Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76 = new ObjectFlow();
					public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76_LiteralInteger77 = new LiteralInteger();
					public LiteralBoolean Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76_LiteralBoolean78 = new LiteralBoolean();
				public ObjectFlow Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79 = new ObjectFlow();
					public LiteralBoolean Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79_LiteralBoolean80 = new LiteralBoolean();
					public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79_LiteralInteger81 = new LiteralInteger();
				public ReadStructuralFeatureAction Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b = new ReadStructuralFeatureAction();
					public InputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object = new InputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object_LiteralInteger82 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object_LiteralUnlimitedNatural83 = new LiteralUnlimitedNatural();
					public OutputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result = new OutputPin();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result_LiteralUnlimitedNatural84 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result_LiteralInteger85 = new LiteralInteger();
				public ObjectFlow Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86 = new ObjectFlow();
					public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86_LiteralInteger87 = new LiteralInteger();
					public LiteralBoolean Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86_LiteralBoolean88 = new LiteralBoolean();
				public ObjectFlow Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89 = new ObjectFlow();
					public LiteralBoolean Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89_LiteralBoolean90 = new LiteralBoolean();
					public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89_LiteralInteger91 = new LiteralInteger();
				public ReadStructuralFeatureAction Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v = new ReadStructuralFeatureAction();
					public OutputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result = new OutputPin();
						public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result_LiteralInteger92 = new LiteralInteger();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result_LiteralUnlimitedNatural93 = new LiteralUnlimitedNatural();
					public InputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object = new InputPin();
						public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object_LiteralUnlimitedNatural94 = new LiteralUnlimitedNatural();
						public LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object_LiteralInteger95 = new LiteralInteger();
			public Operation Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_test = new Operation();
			public Generalization Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_Generalization96 = new Generalization();
		public Class_ Signal_AssemblyAndDelegation_TestCase = new Class_();
			public Operation Signal_AssemblyAndDelegation_TestCase_test = new Operation();
		public Signal Signal_AssemblyAndDelegation_Continue = new Signal();
		public Class_ Signal_AssemblyAndDelegation_B = new Class_();
			public Property Signal_AssemblyAndDelegation_B_a = new Property();
			public Connector Signal_AssemblyAndDelegation_B_r = new Connector();
				public ConnectorEnd Signal_AssemblyAndDelegation_B_r_ConnectorEnd97 = new ConnectorEnd();
				public ConnectorEnd Signal_AssemblyAndDelegation_B_r_ConnectorEnd98 = new ConnectorEnd();
			public Port Signal_AssemblyAndDelegation_B_p = new Port();
		public Class_ Signal_AssemblyAndDelegation_I = new Class_();
		public Signal Signal_AssemblyAndDelegation_Start = new Signal();
			public Property Signal_AssemblyAndDelegation_Start_testCase = new Property();
		public Activity Signal_AssemblyAndDelegation_main = new Activity();
			public SendSignalAction Signal_AssemblyAndDelegation_main_Send_Start = new SendSignalAction();
				public InputPin Signal_AssemblyAndDelegation_main_Send_Start_target = new InputPin();
					public LiteralInteger Signal_AssemblyAndDelegation_main_Send_Start_target_LiteralInteger99 = new LiteralInteger();
					public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Send_Start_target_LiteralUnlimitedNatural100 = new LiteralUnlimitedNatural();
				public InputPin Signal_AssemblyAndDelegation_main_Send_Start_testCase = new InputPin();
					public LiteralInteger Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralInteger101 = new LiteralInteger();
					public LiteralInteger Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralInteger102 = new LiteralInteger();
					public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralUnlimitedNatural103 = new LiteralUnlimitedNatural();
			public ObjectFlow Signal_AssemblyAndDelegation_main_ObjectFlow104 = new ObjectFlow();
				public LiteralBoolean Signal_AssemblyAndDelegation_main_ObjectFlow104_LiteralBoolean105 = new LiteralBoolean();
				public LiteralInteger Signal_AssemblyAndDelegation_main_ObjectFlow104_LiteralInteger106 = new LiteralInteger();
			public ForkNode Signal_AssemblyAndDelegation_main_Fork_testCase = new ForkNode();
			public ReadStructuralFeatureAction Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c = new ReadStructuralFeatureAction();
				public InputPin Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object = new InputPin();
					public LiteralInteger Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object_LiteralInteger107 = new LiteralInteger();
					public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object_LiteralUnlimitedNatural108 = new LiteralUnlimitedNatural();
				public OutputPin Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result = new OutputPin();
					public LiteralInteger Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result_LiteralInteger109 = new LiteralInteger();
					public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result_LiteralUnlimitedNatural110 = new LiteralUnlimitedNatural();
			public ObjectFlow Signal_AssemblyAndDelegation_main_ObjectFlow111 = new ObjectFlow();
				public LiteralInteger Signal_AssemblyAndDelegation_main_ObjectFlow111_LiteralInteger112 = new LiteralInteger();
				public LiteralBoolean Signal_AssemblyAndDelegation_main_ObjectFlow111_LiteralBoolean113 = new LiteralBoolean();
			public ReadStructuralFeatureAction Signal_AssemblyAndDelegation_main_Read_c_tester = new ReadStructuralFeatureAction();
				public InputPin Signal_AssemblyAndDelegation_main_Read_c_tester_object = new InputPin();
					public LiteralInteger Signal_AssemblyAndDelegation_main_Read_c_tester_object_LiteralInteger114 = new LiteralInteger();
					public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Read_c_tester_object_LiteralUnlimitedNatural115 = new LiteralUnlimitedNatural();
				public OutputPin Signal_AssemblyAndDelegation_main_Read_c_tester_result = new OutputPin();
					public LiteralInteger Signal_AssemblyAndDelegation_main_Read_c_tester_result_LiteralInteger116 = new LiteralInteger();
					public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Read_c_tester_result_LiteralUnlimitedNatural117 = new LiteralUnlimitedNatural();
			public ObjectFlow Signal_AssemblyAndDelegation_main_ObjectFlow118 = new ObjectFlow();
				public LiteralBoolean Signal_AssemblyAndDelegation_main_ObjectFlow118_LiteralBoolean119 = new LiteralBoolean();
				public LiteralInteger Signal_AssemblyAndDelegation_main_ObjectFlow118_LiteralInteger120 = new LiteralInteger();
			public CallOperationAction Signal_AssemblyAndDelegation_main_TestCaseAssembly_ = new CallOperationAction();
				public InputPin Signal_AssemblyAndDelegation_main_TestCaseAssembly__target = new InputPin();
					public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_TestCaseAssembly__target_LiteralUnlimitedNatural121 = new LiteralUnlimitedNatural();
					public LiteralInteger Signal_AssemblyAndDelegation_main_TestCaseAssembly__target_LiteralInteger122 = new LiteralInteger();
				public OutputPin Signal_AssemblyAndDelegation_main_TestCaseAssembly__result = new OutputPin();
					public LiteralInteger Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralInteger123 = new LiteralInteger();
					public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralUnlimitedNatural124 = new LiteralUnlimitedNatural();
					public LiteralInteger Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralInteger125 = new LiteralInteger();
			public ObjectFlow Signal_AssemblyAndDelegation_main_ObjectFlow126 = new ObjectFlow();
				public LiteralInteger Signal_AssemblyAndDelegation_main_ObjectFlow126_LiteralInteger127 = new LiteralInteger();
				public LiteralBoolean Signal_AssemblyAndDelegation_main_ObjectFlow126_LiteralBoolean128 = new LiteralBoolean();
			public ObjectFlow Signal_AssemblyAndDelegation_main_ObjectFlow129 = new ObjectFlow();
				public LiteralInteger Signal_AssemblyAndDelegation_main_ObjectFlow129_LiteralInteger130 = new LiteralInteger();
				public LiteralBoolean Signal_AssemblyAndDelegation_main_ObjectFlow129_LiteralBoolean131 = new LiteralBoolean();
			public CreateObjectAction Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly = new CreateObjectAction();
				public OutputPin Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result = new OutputPin();
					public LiteralInteger Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result_LiteralInteger132 = new LiteralInteger();
					public LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result_LiteralUnlimitedNatural133 = new LiteralUnlimitedNatural();
			public ObjectFlow Signal_AssemblyAndDelegation_main_ObjectFlow134 = new ObjectFlow();
				public LiteralBoolean Signal_AssemblyAndDelegation_main_ObjectFlow134_LiteralBoolean135 = new LiteralBoolean();
				public LiteralInteger Signal_AssemblyAndDelegation_main_ObjectFlow134_LiteralInteger136 = new LiteralInteger();

	public static Signal_AssemblyAndDelegationModel instance()
	{
		if (instance == null)
        {
            instance = new Signal_AssemblyAndDelegationModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public Signal_AssemblyAndDelegationModel()
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
		// AcceptEventAction Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::Accept Start
		addToElementRepository("Accept Start", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start.setName("Accept Start");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start.setIsUnmarshall(true);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start.addResult(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start.addTrigger(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_Trigger53);
		// AcceptEventAction Signal_AssemblyAndDelegation_A_AClassifierBehavior::Accept S
		addToElementRepository("Accept S", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S.setName("Accept S");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S.setIsUnmarshall(true);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S.addResult(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S.addTrigger(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_Trigger12);
		// AcceptEventAction Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::Accept Continue
		addToElementRepository("Accept Continue", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue.setName("Accept Continue");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue.addResult(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue.addTrigger(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_Trigger50);
	}

	private void initializeActivity_Instances()
	{
		// Activity Signal_AssemblyAndDelegation_Tester::TesterClassifierBehavior
		addToElementRepository("TesterClassifierBehavior", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.setName("TesterClassifierBehavior");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.isReentrant = false;
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addNode(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ActivityFinalNode34);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addNode(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addNode(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addNode(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addNode(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addNode(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addNode(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addEdge(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addEdge(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow35);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addEdge(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addEdge(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow36);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addEdge(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow37);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addEdge(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow40);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior.addEdge(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41);
		// Activity Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation::testActivity
		addToElementRepository("testActivity", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity.setName("testActivity");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity.addOwnedBehavior(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity.addNode(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity.addNode(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity.addNode(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity.addNode(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity.addNode(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity.addEdge(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity.addEdge(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity.addEdge(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity.addEdge(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89);
		// Activity Signal_AssemblyAndDelegation_A::AClassifierBehavior
		addToElementRepository("AClassifierBehavior", Signal_AssemblyAndDelegation_A_AClassifierBehavior);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.setName("AClassifierBehavior");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.isReentrant = false;
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.addNode(Signal_AssemblyAndDelegation_A_AClassifierBehavior_this);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.addNode(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.addNode(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.addNode(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.addNode(Signal_AssemblyAndDelegation_A_AClassifierBehavior_ActivityFinalNode27);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.addEdge(Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.addEdge(Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow5);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.addEdge(Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow8);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.addEdge(Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior.addEdge(Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22);
		// Activity Signal_AssemblyAndDelegation::main
		addToElementRepository("main", Signal_AssemblyAndDelegation_main);
		Signal_AssemblyAndDelegation_main.setName("main");
		Signal_AssemblyAndDelegation_main.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main.addNode(Signal_AssemblyAndDelegation_main_Send_Start);
		Signal_AssemblyAndDelegation_main.addNode(Signal_AssemblyAndDelegation_main_Fork_testCase);
		Signal_AssemblyAndDelegation_main.addNode(Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c);
		Signal_AssemblyAndDelegation_main.addNode(Signal_AssemblyAndDelegation_main_Read_c_tester);
		Signal_AssemblyAndDelegation_main.addNode(Signal_AssemblyAndDelegation_main_TestCaseAssembly_);
		Signal_AssemblyAndDelegation_main.addNode(Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly);
		Signal_AssemblyAndDelegation_main.addEdge(Signal_AssemblyAndDelegation_main_ObjectFlow104);
		Signal_AssemblyAndDelegation_main.addEdge(Signal_AssemblyAndDelegation_main_ObjectFlow111);
		Signal_AssemblyAndDelegation_main.addEdge(Signal_AssemblyAndDelegation_main_ObjectFlow118);
		Signal_AssemblyAndDelegation_main.addEdge(Signal_AssemblyAndDelegation_main_ObjectFlow126);
		Signal_AssemblyAndDelegation_main.addEdge(Signal_AssemblyAndDelegation_main_ObjectFlow129);
		Signal_AssemblyAndDelegation_main.addEdge(Signal_AssemblyAndDelegation_main_ObjectFlow134);
	}

	private void initializeActivityFinalNode_Instances()
	{
		// ActivityFinalNode Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::ActivityFinalNode34
		addToElementRepository("ActivityFinalNode34", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ActivityFinalNode34);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ActivityFinalNode34.setName("ActivityFinalNode34");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ActivityFinalNode34.setVisibility(VisibilityKind.public_);
		// ActivityFinalNode Signal_AssemblyAndDelegation_A_AClassifierBehavior::ActivityFinalNode27
		addToElementRepository("ActivityFinalNode27", Signal_AssemblyAndDelegation_A_AClassifierBehavior_ActivityFinalNode27);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ActivityFinalNode27.setName("ActivityFinalNode27");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ActivityFinalNode27.setVisibility(VisibilityKind.public_);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction Signal_AssemblyAndDelegation_A_AClassifierBehavior::Set v
		addToElementRepository("Set v", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v.setName("Set v");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v.setStructuralFeature(Signal_AssemblyAndDelegation_A_v);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v.setObject(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v.setValue(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v.setResult(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association Signal_AssemblyAndDelegation::R
		addToElementRepository("R", Signal_AssemblyAndDelegation_R);
		Signal_AssemblyAndDelegation_R.setName("R");
		Signal_AssemblyAndDelegation_R.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_R.addOwnedEnd(Signal_AssemblyAndDelegation_R_x);
		Signal_AssemblyAndDelegation_R.addOwnedEnd(Signal_AssemblyAndDelegation_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity::Call testV
		addToElementRepository("Call testV", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV.setName("Call testV");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV.setBehavior(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV.addArgument(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::Call test()
		addToElementRepository("Call test()", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test_.setName("Call test()");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test_.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test_.setOperation(Signal_AssemblyAndDelegation_TestCase_test);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test_.setTarget(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target);
		// CallOperationAction Signal_AssemblyAndDelegation_main::TestCaseAssembly()
		addToElementRepository("TestCaseAssembly()", Signal_AssemblyAndDelegation_main_TestCaseAssembly_);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly_.setName("TestCaseAssembly()");
		Signal_AssemblyAndDelegation_main_TestCaseAssembly_.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_main_TestCaseAssembly_.addResult(Signal_AssemblyAndDelegation_main_TestCaseAssembly__result);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly_.setOperation(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly_.setTarget(Signal_AssemblyAndDelegation_main_TestCaseAssembly__target);
	}

	private void initializeClass_Instances()
	{
		// Class Signal_AssemblyAndDelegation::Tester
		addToElementRepository("Tester", Signal_AssemblyAndDelegation_Tester);
		Signal_AssemblyAndDelegation_Tester.setName("Tester");
		Signal_AssemblyAndDelegation_Tester.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Tester.addOwnedAttribute(Signal_AssemblyAndDelegation_Tester_q);
		Signal_AssemblyAndDelegation_Tester.setClassifierBehavior(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior);
		Signal_AssemblyAndDelegation_Tester.addOwnedBehavior(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior);
		
		Signal_AssemblyAndDelegation_Tester.setIsActive(true);
		Signal_AssemblyAndDelegation_Tester.addOwnedOperation(Signal_AssemblyAndDelegation_Tester_Tester_Tester);
		Signal_AssemblyAndDelegation_Tester.addOwnedReception(Signal_AssemblyAndDelegation_Tester_Start);
		// Class Signal_AssemblyAndDelegation::C
		addToElementRepository("C", Signal_AssemblyAndDelegation_C);
		Signal_AssemblyAndDelegation_C.setName("C");
		Signal_AssemblyAndDelegation_C.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_C.addOwnedAttribute(Signal_AssemblyAndDelegation_C_q);
		Signal_AssemblyAndDelegation_C.addOwnedAttribute(Signal_AssemblyAndDelegation_C_tester);
		
		Signal_AssemblyAndDelegation_C.addOwnedConnector(Signal_AssemblyAndDelegation_C_r);
		// Class Signal_AssemblyAndDelegation::TestCaseAssemblyAndDelegation
		addToElementRepository("TestCaseAssemblyAndDelegation", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation.setName("TestCaseAssemblyAndDelegation");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation.addGeneralization(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_Generalization96);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation.addOwnedAttribute(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_b);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation.addOwnedAttribute(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_c);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation.addOwnedBehavior(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation.addOwnedConnector(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation.addOwnedOperation(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation.addOwnedOperation(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_test);
		// Class Signal_AssemblyAndDelegation::TestCase
		addToElementRepository("TestCase", Signal_AssemblyAndDelegation_TestCase);
		Signal_AssemblyAndDelegation_TestCase.setName("TestCase");
		Signal_AssemblyAndDelegation_TestCase.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_TestCase.setIsAbstract(true);
		
		
		Signal_AssemblyAndDelegation_TestCase.addOwnedOperation(Signal_AssemblyAndDelegation_TestCase_test);
		// Class Signal_AssemblyAndDelegation::A
		addToElementRepository("A", Signal_AssemblyAndDelegation_A);
		Signal_AssemblyAndDelegation_A.setName("A");
		Signal_AssemblyAndDelegation_A.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_A.addOwnedAttribute(Signal_AssemblyAndDelegation_A_v);
		Signal_AssemblyAndDelegation_A.addOwnedAttribute(Signal_AssemblyAndDelegation_A_p);
		Signal_AssemblyAndDelegation_A.setClassifierBehavior(Signal_AssemblyAndDelegation_A_AClassifierBehavior);
		Signal_AssemblyAndDelegation_A.addOwnedBehavior(Signal_AssemblyAndDelegation_A_AClassifierBehavior);
		
		Signal_AssemblyAndDelegation_A.setIsActive(true);
		Signal_AssemblyAndDelegation_A.addOwnedOperation(Signal_AssemblyAndDelegation_A_A_A);
		// Class Signal_AssemblyAndDelegation::B
		addToElementRepository("B", Signal_AssemblyAndDelegation_B);
		Signal_AssemblyAndDelegation_B.setName("B");
		Signal_AssemblyAndDelegation_B.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_B.addOwnedAttribute(Signal_AssemblyAndDelegation_B_p);
		Signal_AssemblyAndDelegation_B.addOwnedAttribute(Signal_AssemblyAndDelegation_B_a);
		
		Signal_AssemblyAndDelegation_B.addOwnedConnector(Signal_AssemblyAndDelegation_B_r);
		// Class Signal_AssemblyAndDelegation::I
		addToElementRepository("I", Signal_AssemblyAndDelegation_I);
		Signal_AssemblyAndDelegation_I.setName("I");
		Signal_AssemblyAndDelegation_I.setVisibility(VisibilityKind.public_);
	}

	private void initializeComment_Instances()
	{
		// Comment Signal_AssemblyAndDelegation::Comment28
		addToElementRepository("Comment28", Signal_AssemblyAndDelegation_Comment28);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment Signal_AssemblyAndDelegation::Comment30
		addToElementRepository("Comment30", Signal_AssemblyAndDelegation_Comment30);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation::r
		addToElementRepository("r", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r.setName("r");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r.addEnd(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r_ConnectorEnd66);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r.addEnd(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r_ConnectorEnd65);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r.setType(Signal_AssemblyAndDelegation_R);
		// Connector Signal_AssemblyAndDelegation_B::r
		addToElementRepository("r", Signal_AssemblyAndDelegation_B_r);
		Signal_AssemblyAndDelegation_B_r.setName("r");
		Signal_AssemblyAndDelegation_B_r.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_B_r.addEnd(Signal_AssemblyAndDelegation_B_r_ConnectorEnd97);
		Signal_AssemblyAndDelegation_B_r.addEnd(Signal_AssemblyAndDelegation_B_r_ConnectorEnd98);
		Signal_AssemblyAndDelegation_B_r.setType(Signal_AssemblyAndDelegation_R);
		// Connector Signal_AssemblyAndDelegation_C::r
		addToElementRepository("r", Signal_AssemblyAndDelegation_C_r);
		Signal_AssemblyAndDelegation_C_r.setName("r");
		Signal_AssemblyAndDelegation_C_r.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_C_r.addEnd(Signal_AssemblyAndDelegation_C_r_ConnectorEnd0);
		Signal_AssemblyAndDelegation_C_r.addEnd(Signal_AssemblyAndDelegation_C_r_ConnectorEnd1);
		Signal_AssemblyAndDelegation_C_r.setType(Signal_AssemblyAndDelegation_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r::ConnectorEnd65
		addToElementRepository("ConnectorEnd65", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r_ConnectorEnd65);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r_ConnectorEnd65.setRole(Signal_AssemblyAndDelegation_C_q);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r_ConnectorEnd65.setPartWithPort(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_c);
		// ConnectorEnd Signal_AssemblyAndDelegation_C_r::ConnectorEnd0
		addToElementRepository("ConnectorEnd0", Signal_AssemblyAndDelegation_C_r_ConnectorEnd0);
		Signal_AssemblyAndDelegation_C_r_ConnectorEnd0.setRole(Signal_AssemblyAndDelegation_C_q);
		// ConnectorEnd Signal_AssemblyAndDelegation_B_r::ConnectorEnd97
		addToElementRepository("ConnectorEnd97", Signal_AssemblyAndDelegation_B_r_ConnectorEnd97);
		Signal_AssemblyAndDelegation_B_r_ConnectorEnd97.setRole(Signal_AssemblyAndDelegation_A_p);
		Signal_AssemblyAndDelegation_B_r_ConnectorEnd97.setPartWithPort(Signal_AssemblyAndDelegation_B_a);
		// ConnectorEnd Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r::ConnectorEnd66
		addToElementRepository("ConnectorEnd66", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r_ConnectorEnd66);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r_ConnectorEnd66.setRole(Signal_AssemblyAndDelegation_B_p);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_r_ConnectorEnd66.setPartWithPort(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_b);
		// ConnectorEnd Signal_AssemblyAndDelegation_B_r::ConnectorEnd98
		addToElementRepository("ConnectorEnd98", Signal_AssemblyAndDelegation_B_r_ConnectorEnd98);
		Signal_AssemblyAndDelegation_B_r_ConnectorEnd98.setRole(Signal_AssemblyAndDelegation_B_p);
		// ConnectorEnd Signal_AssemblyAndDelegation_C_r::ConnectorEnd1
		addToElementRepository("ConnectorEnd1", Signal_AssemblyAndDelegation_C_r_ConnectorEnd1);
		Signal_AssemblyAndDelegation_C_r_ConnectorEnd1.setRole(Signal_AssemblyAndDelegation_Tester_q);
		Signal_AssemblyAndDelegation_C_r_ConnectorEnd1.setPartWithPort(Signal_AssemblyAndDelegation_C_tester);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow Signal_AssemblyAndDelegation_A_AClassifierBehavior::ControlFlow5
		addToElementRepository("ControlFlow5", Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow5);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow5.setName("ControlFlow5");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow5.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow5.setSource(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow5.setTarget(Signal_AssemblyAndDelegation_A_AClassifierBehavior_ActivityFinalNode27);
		// ControlFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::ControlFlow35
		addToElementRepository("ControlFlow35", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow35);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow35.setName("ControlFlow35");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow35.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow35.setSource(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow35.setTarget(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test_);
		// ControlFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::ControlFlow36
		addToElementRepository("ControlFlow36", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow36);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow36.setName("ControlFlow36");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow36.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow36.setSource(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow36.setTarget(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ActivityFinalNode34);
		// ControlFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::ControlFlow37
		addToElementRepository("ControlFlow37", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow37);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow37.setName("ControlFlow37");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow37.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow37.setSource(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow37.setTarget(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue);
		// ControlFlow Signal_AssemblyAndDelegation_A_AClassifierBehavior::ControlFlow8
		addToElementRepository("ControlFlow8", Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow8);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow8.setName("ControlFlow8");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow8.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow8.setSource(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ControlFlow8.setTarget(Signal_AssemblyAndDelegation_A_AClassifierBehavior_this);
		// ControlFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::ControlFlow40
		addToElementRepository("ControlFlow40", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow40);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow40.setName("ControlFlow40");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow40.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow40.setSource(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ControlFlow40.setTarget(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction Signal_AssemblyAndDelegation_main::Create TestCaseAssembly
		addToElementRepository("Create TestCaseAssembly", Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly);
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly.setName("Create TestCaseAssembly");
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly.setClassifier(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation);
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly.setResult(Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode Signal_AssemblyAndDelegation_main::Fork testCase
		addToElementRepository("Fork testCase", Signal_AssemblyAndDelegation_main_Fork_testCase);
		Signal_AssemblyAndDelegation_main_Fork_testCase.setName("Fork testCase");
		Signal_AssemblyAndDelegation_main_Fork_testCase.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity::testV
		addToElementRepository("testV", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV.setName("testV");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV.addOwnedParameter(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV_v);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV.addLanguage("Java");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV.addLanguage("Import");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV.addBody("System.out.println(\"Asserting b.a.v == 4\");  	// Test parameter v 	int v = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument v = \" + v); 	 	System.out.println(\"b.a.v == \" + v); 	System.out.print(\"Signal correctly sent and received: \");  	if(v == 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeGeneralization_Instances()
	{
		// Generalization Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation::Generalization96
		addToElementRepository("Generalization96", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_Generalization96);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_Generalization96.setGeneral(Signal_AssemblyAndDelegation_TestCase);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send Continue::target
		addToElementRepository("target", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target.setName("target");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target.setType(Signal_AssemblyAndDelegation_A);
		// InputPin Signal_AssemblyAndDelegation_main_Read c.tester::object
		addToElementRepository("object", Signal_AssemblyAndDelegation_main_Read_c_tester_object);
		Signal_AssemblyAndDelegation_main_Read_c_tester_object.setName("object");
		Signal_AssemblyAndDelegation_main_Read_c_tester_object.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_c_tester_object.setType(Signal_AssemblyAndDelegation_C);
		// InputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call test()::target
		addToElementRepository("target", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target.setName("target");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target.setType(Signal_AssemblyAndDelegation_TestCase);
		// InputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read a.v::object
		addToElementRepository("object", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object.setName("object");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object.setType(Signal_AssemblyAndDelegation_A);
		// InputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send S::value
		addToElementRepository("value", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value.setName("value");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set v::object
		addToElementRepository("object", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object.setName("object");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object.setType(Signal_AssemblyAndDelegation_A);
		// InputPin Signal_AssemblyAndDelegation_main_TestCaseAssembly()::target
		addToElementRepository("target", Signal_AssemblyAndDelegation_main_TestCaseAssembly__target);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__target.setName("target");
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__target.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__target.setType(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation);
		// InputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read this.b::object
		addToElementRepository("object", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object.setName("object");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object.setType(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation);
		// InputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call testV::v
		addToElementRepository("v", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v.setName("v");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set v::value
		addToElementRepository("value", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value.setName("value");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Signal_AssemblyAndDelegation_main_Send Start::target
		addToElementRepository("target", Signal_AssemblyAndDelegation_main_Send_Start_target);
		Signal_AssemblyAndDelegation_main_Send_Start_target.setName("target");
		Signal_AssemblyAndDelegation_main_Send_Start_target.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Send_Start_target.setType(Signal_AssemblyAndDelegation_Tester);
		// InputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read b.a::object
		addToElementRepository("object", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object.setName("object");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object.setType(Signal_AssemblyAndDelegation_B);
		// InputPin Signal_AssemblyAndDelegation_main_Send Start::testCase
		addToElementRepository("testCase", Signal_AssemblyAndDelegation_main_Send_Start_testCase);
		Signal_AssemblyAndDelegation_main_Send_Start_testCase.setName("testCase");
		Signal_AssemblyAndDelegation_main_Send_Start_testCase.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Send_Start_testCase.setType(Signal_AssemblyAndDelegation_TestCase);
		// InputPin Signal_AssemblyAndDelegation_main_Read TestCaseAssembly.c::object
		addToElementRepository("object", Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object.setName("object");
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object.setType(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation);
		// InputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send S::target
		addToElementRepository("target", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target.setName("target");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target.setType(Signal_AssemblyAndDelegation_Tester);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean Signal_AssemblyAndDelegation_main_ObjectFlow118::LiteralBoolean119
		addToElementRepository("LiteralBoolean119", Signal_AssemblyAndDelegation_main_ObjectFlow118_LiteralBoolean119);
		Signal_AssemblyAndDelegation_main_ObjectFlow118_LiteralBoolean119.setName("LiteralBoolean119");
		Signal_AssemblyAndDelegation_main_ObjectFlow118_LiteralBoolean119.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_ObjectFlow118_LiteralBoolean119.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_main_ObjectFlow126::LiteralBoolean128
		addToElementRepository("LiteralBoolean128", Signal_AssemblyAndDelegation_main_ObjectFlow126_LiteralBoolean128);
		Signal_AssemblyAndDelegation_main_ObjectFlow126_LiteralBoolean128.setName("LiteralBoolean128");
		Signal_AssemblyAndDelegation_main_ObjectFlow126_LiteralBoolean128.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_ObjectFlow126_LiteralBoolean128.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89::LiteralBoolean90
		addToElementRepository("LiteralBoolean90", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89_LiteralBoolean90);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89_LiteralBoolean90.setName("LiteralBoolean90");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89_LiteralBoolean90.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89_LiteralBoolean90.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_main_ObjectFlow111::LiteralBoolean113
		addToElementRepository("LiteralBoolean113", Signal_AssemblyAndDelegation_main_ObjectFlow111_LiteralBoolean113);
		Signal_AssemblyAndDelegation_main_ObjectFlow111_LiteralBoolean113.setName("LiteralBoolean113");
		Signal_AssemblyAndDelegation_main_ObjectFlow111_LiteralBoolean113.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_ObjectFlow111_LiteralBoolean113.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31::LiteralBoolean32
		addToElementRepository("LiteralBoolean32", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31_LiteralBoolean32);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31_LiteralBoolean32.setName("LiteralBoolean32");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31_LiteralBoolean32.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31_LiteralBoolean32.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_main_ObjectFlow104::LiteralBoolean105
		addToElementRepository("LiteralBoolean105", Signal_AssemblyAndDelegation_main_ObjectFlow104_LiteralBoolean105);
		Signal_AssemblyAndDelegation_main_ObjectFlow104_LiteralBoolean105.setName("LiteralBoolean105");
		Signal_AssemblyAndDelegation_main_ObjectFlow104_LiteralBoolean105.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_ObjectFlow104_LiteralBoolean105.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19::LiteralBoolean20
		addToElementRepository("LiteralBoolean20", Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19_LiteralBoolean20);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19_LiteralBoolean20.setName("LiteralBoolean20");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19_LiteralBoolean20.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19_LiteralBoolean20.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_main_ObjectFlow134::LiteralBoolean135
		addToElementRepository("LiteralBoolean135", Signal_AssemblyAndDelegation_main_ObjectFlow134_LiteralBoolean135);
		Signal_AssemblyAndDelegation_main_ObjectFlow134_LiteralBoolean135.setName("LiteralBoolean135");
		Signal_AssemblyAndDelegation_main_ObjectFlow134_LiteralBoolean135.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_ObjectFlow134_LiteralBoolean135.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79::LiteralBoolean80
		addToElementRepository("LiteralBoolean80", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79_LiteralBoolean80);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79_LiteralBoolean80.setName("LiteralBoolean80");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79_LiteralBoolean80.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79_LiteralBoolean80.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41::LiteralBoolean42
		addToElementRepository("LiteralBoolean42", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41_LiteralBoolean42);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41_LiteralBoolean42.setName("LiteralBoolean42");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41_LiteralBoolean42.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41_LiteralBoolean42.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86::LiteralBoolean88
		addToElementRepository("LiteralBoolean88", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86_LiteralBoolean88);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86_LiteralBoolean88.setName("LiteralBoolean88");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86_LiteralBoolean88.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86_LiteralBoolean88.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_main_ObjectFlow129::LiteralBoolean131
		addToElementRepository("LiteralBoolean131", Signal_AssemblyAndDelegation_main_ObjectFlow129_LiteralBoolean131);
		Signal_AssemblyAndDelegation_main_ObjectFlow129_LiteralBoolean131.setName("LiteralBoolean131");
		Signal_AssemblyAndDelegation_main_ObjectFlow129_LiteralBoolean131.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_ObjectFlow129_LiteralBoolean131.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22::LiteralBoolean24
		addToElementRepository("LiteralBoolean24", Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22_LiteralBoolean24);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22_LiteralBoolean24.setName("LiteralBoolean24");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22_LiteralBoolean24.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22_LiteralBoolean24.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57::LiteralBoolean58
		addToElementRepository("LiteralBoolean58", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57_LiteralBoolean58);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57_LiteralBoolean58.setName("LiteralBoolean58");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57_LiteralBoolean58.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57_LiteralBoolean58.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76::LiteralBoolean78
		addToElementRepository("LiteralBoolean78", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76_LiteralBoolean78);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76_LiteralBoolean78.setName("LiteralBoolean78");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76_LiteralBoolean78.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76_LiteralBoolean78.setValue(true);
		// LiteralBoolean Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2::LiteralBoolean4
		addToElementRepository("LiteralBoolean4", Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2_LiteralBoolean4);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2_LiteralBoolean4.setName("LiteralBoolean4");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2_LiteralBoolean4.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2_LiteralBoolean4.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read this.b_object::LiteralInteger82
		addToElementRepository("LiteralInteger82", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object_LiteralInteger82);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object_LiteralInteger82.setName("LiteralInteger82");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object_LiteralInteger82.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object_LiteralInteger82.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_ObjectFlow111::LiteralInteger112
		addToElementRepository("LiteralInteger112", Signal_AssemblyAndDelegation_main_ObjectFlow111_LiteralInteger112);
		Signal_AssemblyAndDelegation_main_ObjectFlow111_LiteralInteger112.setName("LiteralInteger112");
		Signal_AssemblyAndDelegation_main_ObjectFlow111_LiteralInteger112.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_ObjectFlow111_LiteralInteger112.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read b.a_object::LiteralInteger67
		addToElementRepository("LiteralInteger67", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object_LiteralInteger67);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object_LiteralInteger67.setName("LiteralInteger67");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object_LiteralInteger67.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object_LiteralInteger67.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read a.v_object::LiteralInteger95
		addToElementRepository("LiteralInteger95", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object_LiteralInteger95);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object_LiteralInteger95.setName("LiteralInteger95");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object_LiteralInteger95.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object_LiteralInteger95.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_TestCaseAssembly()_target::LiteralInteger122
		addToElementRepository("LiteralInteger122", Signal_AssemblyAndDelegation_main_TestCaseAssembly__target_LiteralInteger122);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__target_LiteralInteger122.setName("LiteralInteger122");
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__target_LiteralInteger122.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__target_LiteralInteger122.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set v_value::LiteralInteger16
		addToElementRepository("LiteralInteger16", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value_LiteralInteger16);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value_LiteralInteger16.setName("LiteralInteger16");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value_LiteralInteger16.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value_LiteralInteger16.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read a.v_result::LiteralInteger92
		addToElementRepository("LiteralInteger92", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result_LiteralInteger92);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result_LiteralInteger92.setName("LiteralInteger92");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result_LiteralInteger92.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result_LiteralInteger92.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89::LiteralInteger91
		addToElementRepository("LiteralInteger91", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89_LiteralInteger91);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89_LiteralInteger91.setName("LiteralInteger91");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89_LiteralInteger91.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89_LiteralInteger91.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value(4)::LiteralInteger44
		addToElementRepository("LiteralInteger44", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_LiteralInteger44);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_LiteralInteger44.setName("LiteralInteger44");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_LiteralInteger44.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_LiteralInteger44.setValue(4);
		// LiteralInteger Signal_AssemblyAndDelegation_main_Create TestCaseAssembly_result::LiteralInteger132
		addToElementRepository("LiteralInteger132", Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result_LiteralInteger132);
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result_LiteralInteger132.setName("LiteralInteger132");
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result_LiteralInteger132.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result_LiteralInteger132.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_ObjectFlow129::LiteralInteger130
		addToElementRepository("LiteralInteger130", Signal_AssemblyAndDelegation_main_ObjectFlow129_LiteralInteger130);
		Signal_AssemblyAndDelegation_main_ObjectFlow129_LiteralInteger130.setName("LiteralInteger130");
		Signal_AssemblyAndDelegation_main_ObjectFlow129_LiteralInteger130.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_ObjectFlow129_LiteralInteger130.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept Start_testCase::LiteralInteger54
		addToElementRepository("LiteralInteger54", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger54);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger54.setName("LiteralInteger54");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger54.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger54.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_Read TestCaseAssembly.c_result::LiteralInteger109
		addToElementRepository("LiteralInteger109", Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result_LiteralInteger109);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result_LiteralInteger109.setName("LiteralInteger109");
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result_LiteralInteger109.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result_LiteralInteger109.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2::LiteralInteger3
		addToElementRepository("LiteralInteger3", Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2_LiteralInteger3);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2_LiteralInteger3.setName("LiteralInteger3");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2_LiteralInteger3.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2_LiteralInteger3.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result::LiteralInteger75
		addToElementRepository("LiteralInteger75", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result_LiteralInteger75);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result_LiteralInteger75.setName("LiteralInteger75");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result_LiteralInteger75.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result_LiteralInteger75.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_Send Start_target::LiteralInteger99
		addToElementRepository("LiteralInteger99", Signal_AssemblyAndDelegation_main_Send_Start_target_LiteralInteger99);
		Signal_AssemblyAndDelegation_main_Send_Start_target_LiteralInteger99.setName("LiteralInteger99");
		Signal_AssemblyAndDelegation_main_Send_Start_target_LiteralInteger99.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Send_Start_target_LiteralInteger99.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept Continue_result::LiteralInteger47
		addToElementRepository("LiteralInteger47", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger47);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger47.setName("LiteralInteger47");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger47.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger47.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_ObjectFlow118::LiteralInteger120
		addToElementRepository("LiteralInteger120", Signal_AssemblyAndDelegation_main_ObjectFlow118_LiteralInteger120);
		Signal_AssemblyAndDelegation_main_ObjectFlow118_LiteralInteger120.setName("LiteralInteger120");
		Signal_AssemblyAndDelegation_main_ObjectFlow118_LiteralInteger120.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_ObjectFlow118_LiteralInteger120.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_Read c.tester_result::LiteralInteger116
		addToElementRepository("LiteralInteger116", Signal_AssemblyAndDelegation_main_Read_c_tester_result_LiteralInteger116);
		Signal_AssemblyAndDelegation_main_Read_c_tester_result_LiteralInteger116.setName("LiteralInteger116");
		Signal_AssemblyAndDelegation_main_Read_c_tester_result_LiteralInteger116.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_c_tester_result_LiteralInteger116.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept S_value::LiteralInteger9
		addToElementRepository("LiteralInteger9", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralInteger9);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralInteger9.setName("LiteralInteger9");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralInteger9.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralInteger9.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call testV_v::LiteralInteger72
		addToElementRepository("LiteralInteger72", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralInteger72);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralInteger72.setName("LiteralInteger72");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralInteger72.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralInteger72.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_Read TestCaseAssembly.c_object::LiteralInteger107
		addToElementRepository("LiteralInteger107", Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object_LiteralInteger107);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object_LiteralInteger107.setName("LiteralInteger107");
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object_LiteralInteger107.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object_LiteralInteger107.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76::LiteralInteger77
		addToElementRepository("LiteralInteger77", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76_LiteralInteger77);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76_LiteralInteger77.setName("LiteralInteger77");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76_LiteralInteger77.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76_LiteralInteger77.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79::LiteralInteger81
		addToElementRepository("LiteralInteger81", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79_LiteralInteger81);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79_LiteralInteger81.setName("LiteralInteger81");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79_LiteralInteger81.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79_LiteralInteger81.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send S_target::LiteralInteger64
		addToElementRepository("LiteralInteger64", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger64);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger64.setName("LiteralInteger64");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger64.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger64.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41::LiteralInteger43
		addToElementRepository("LiteralInteger43", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41_LiteralInteger43);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41_LiteralInteger43.setName("LiteralInteger43");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41_LiteralInteger43.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41_LiteralInteger43.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19::LiteralInteger21
		addToElementRepository("LiteralInteger21", Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19_LiteralInteger21);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19_LiteralInteger21.setName("LiteralInteger21");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19_LiteralInteger21.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19_LiteralInteger21.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept Continue_result::LiteralInteger48
		addToElementRepository("LiteralInteger48", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger48);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger48.setName("LiteralInteger48");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger48.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger48.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result::LiteralInteger6
		addToElementRepository("LiteralInteger6", Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result_LiteralInteger6);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result_LiteralInteger6.setName("LiteralInteger6");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result_LiteralInteger6.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result_LiteralInteger6.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept Start_testCase::LiteralInteger56
		addToElementRepository("LiteralInteger56", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger56);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger56.setName("LiteralInteger56");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger56.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger56.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_ObjectFlow126::LiteralInteger127
		addToElementRepository("LiteralInteger127", Signal_AssemblyAndDelegation_main_ObjectFlow126_LiteralInteger127);
		Signal_AssemblyAndDelegation_main_ObjectFlow126_LiteralInteger127.setName("LiteralInteger127");
		Signal_AssemblyAndDelegation_main_ObjectFlow126_LiteralInteger127.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_ObjectFlow126_LiteralInteger127.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call testV_v::LiteralInteger71
		addToElementRepository("LiteralInteger71", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralInteger71);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralInteger71.setName("LiteralInteger71");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralInteger71.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralInteger71.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86::LiteralInteger87
		addToElementRepository("LiteralInteger87", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86_LiteralInteger87);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86_LiteralInteger87.setName("LiteralInteger87");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86_LiteralInteger87.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86_LiteralInteger87.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result::LiteralInteger51
		addToElementRepository("LiteralInteger51", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result_LiteralInteger51);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result_LiteralInteger51.setName("LiteralInteger51");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result_LiteralInteger51.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result_LiteralInteger51.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set v_result::LiteralInteger17
		addToElementRepository("LiteralInteger17", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result_LiteralInteger17);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result_LiteralInteger17.setName("LiteralInteger17");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result_LiteralInteger17.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result_LiteralInteger17.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send S_value::LiteralInteger60
		addToElementRepository("LiteralInteger60", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger60);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger60.setName("LiteralInteger60");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger60.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger60.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_Send Start_testCase::LiteralInteger102
		addToElementRepository("LiteralInteger102", Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralInteger102);
		Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralInteger102.setName("LiteralInteger102");
		Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralInteger102.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralInteger102.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_ObjectFlow134::LiteralInteger136
		addToElementRepository("LiteralInteger136", Signal_AssemblyAndDelegation_main_ObjectFlow134_LiteralInteger136);
		Signal_AssemblyAndDelegation_main_ObjectFlow134_LiteralInteger136.setName("LiteralInteger136");
		Signal_AssemblyAndDelegation_main_ObjectFlow134_LiteralInteger136.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_ObjectFlow134_LiteralInteger136.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read b.a_result::LiteralInteger70
		addToElementRepository("LiteralInteger70", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result_LiteralInteger70);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result_LiteralInteger70.setName("LiteralInteger70");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result_LiteralInteger70.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result_LiteralInteger70.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_Read c.tester_object::LiteralInteger114
		addToElementRepository("LiteralInteger114", Signal_AssemblyAndDelegation_main_Read_c_tester_object_LiteralInteger114);
		Signal_AssemblyAndDelegation_main_Read_c_tester_object_LiteralInteger114.setName("LiteralInteger114");
		Signal_AssemblyAndDelegation_main_Read_c_tester_object_LiteralInteger114.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_c_tester_object_LiteralInteger114.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call test()_target::LiteralInteger39
		addToElementRepository("LiteralInteger39", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger39);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger39.setName("LiteralInteger39");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger39.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger39.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value(4)_result::LiteralInteger45
		addToElementRepository("LiteralInteger45", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger45);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger45.setName("LiteralInteger45");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger45.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger45.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_Send Start_testCase::LiteralInteger101
		addToElementRepository("LiteralInteger101", Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralInteger101);
		Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralInteger101.setName("LiteralInteger101");
		Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralInteger101.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralInteger101.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_TestCaseAssembly()_result::LiteralInteger123
		addToElementRepository("LiteralInteger123", Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralInteger123);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralInteger123.setName("LiteralInteger123");
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralInteger123.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralInteger123.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_ObjectFlow104::LiteralInteger106
		addToElementRepository("LiteralInteger106", Signal_AssemblyAndDelegation_main_ObjectFlow104_LiteralInteger106);
		Signal_AssemblyAndDelegation_main_ObjectFlow104_LiteralInteger106.setName("LiteralInteger106");
		Signal_AssemblyAndDelegation_main_ObjectFlow104_LiteralInteger106.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_ObjectFlow104_LiteralInteger106.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read this.b_result::LiteralInteger85
		addToElementRepository("LiteralInteger85", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result_LiteralInteger85);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result_LiteralInteger85.setName("LiteralInteger85");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result_LiteralInteger85.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result_LiteralInteger85.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22::LiteralInteger23
		addToElementRepository("LiteralInteger23", Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22_LiteralInteger23);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22_LiteralInteger23.setName("LiteralInteger23");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22_LiteralInteger23.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22_LiteralInteger23.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send Continue_target::LiteralInteger25
		addToElementRepository("LiteralInteger25", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target_LiteralInteger25);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target_LiteralInteger25.setName("LiteralInteger25");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target_LiteralInteger25.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target_LiteralInteger25.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept S_value::LiteralInteger11
		addToElementRepository("LiteralInteger11", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralInteger11);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralInteger11.setName("LiteralInteger11");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralInteger11.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralInteger11.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57::LiteralInteger59
		addToElementRepository("LiteralInteger59", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57_LiteralInteger59);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57_LiteralInteger59.setName("LiteralInteger59");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57_LiteralInteger59.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57_LiteralInteger59.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31::LiteralInteger33
		addToElementRepository("LiteralInteger33", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31_LiteralInteger33);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31_LiteralInteger33.setName("LiteralInteger33");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31_LiteralInteger33.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31_LiteralInteger33.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send S_value::LiteralInteger62
		addToElementRepository("LiteralInteger62", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger62);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger62.setName("LiteralInteger62");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger62.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger62.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set v_object::LiteralInteger14
		addToElementRepository("LiteralInteger14", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object_LiteralInteger14);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object_LiteralInteger14.setName("LiteralInteger14");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object_LiteralInteger14.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object_LiteralInteger14.setValue(1);
		// LiteralInteger Signal_AssemblyAndDelegation_main_TestCaseAssembly()_result::LiteralInteger125
		addToElementRepository("LiteralInteger125", Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralInteger125);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralInteger125.setName("LiteralInteger125");
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralInteger125.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralInteger125.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result::LiteralUnlimitedNatural74
		addToElementRepository("LiteralUnlimitedNatural74", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result_LiteralUnlimitedNatural74);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result_LiteralUnlimitedNatural74.setName("LiteralUnlimitedNatural74");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result_LiteralUnlimitedNatural74.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result_LiteralUnlimitedNatural74.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Read c.tester_object::LiteralUnlimitedNatural115
		addToElementRepository("LiteralUnlimitedNatural115", Signal_AssemblyAndDelegation_main_Read_c_tester_object_LiteralUnlimitedNatural115);
		Signal_AssemblyAndDelegation_main_Read_c_tester_object_LiteralUnlimitedNatural115.setName("LiteralUnlimitedNatural115");
		Signal_AssemblyAndDelegation_main_Read_c_tester_object_LiteralUnlimitedNatural115.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_c_tester_object_LiteralUnlimitedNatural115.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read a.v_result::LiteralUnlimitedNatural93
		addToElementRepository("LiteralUnlimitedNatural93", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result_LiteralUnlimitedNatural93);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result_LiteralUnlimitedNatural93.setName("LiteralUnlimitedNatural93");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result_LiteralUnlimitedNatural93.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result_LiteralUnlimitedNatural93.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value(4)_result::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural46);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural46.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result::LiteralUnlimitedNatural52
		addToElementRepository("LiteralUnlimitedNatural52", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural52);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural52.setName("LiteralUnlimitedNatural52");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural52.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural52.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send S_value::LiteralUnlimitedNatural61
		addToElementRepository("LiteralUnlimitedNatural61", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural61);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural61.setName("LiteralUnlimitedNatural61");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural61.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural61.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept S_value::LiteralUnlimitedNatural10
		addToElementRepository("LiteralUnlimitedNatural10", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural10);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural10.setName("LiteralUnlimitedNatural10");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural10.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural10.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read this.b_result::LiteralUnlimitedNatural84
		addToElementRepository("LiteralUnlimitedNatural84", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result_LiteralUnlimitedNatural84);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result_LiteralUnlimitedNatural84.setName("LiteralUnlimitedNatural84");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result_LiteralUnlimitedNatural84.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result_LiteralUnlimitedNatural84.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set v_value::LiteralUnlimitedNatural15
		addToElementRepository("LiteralUnlimitedNatural15", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural15);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural15.setName("LiteralUnlimitedNatural15");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural15.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural15.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read b.a_object::LiteralUnlimitedNatural68
		addToElementRepository("LiteralUnlimitedNatural68", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object_LiteralUnlimitedNatural68);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object_LiteralUnlimitedNatural68.setName("LiteralUnlimitedNatural68");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object_LiteralUnlimitedNatural68.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object_LiteralUnlimitedNatural68.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Read c.tester_result::LiteralUnlimitedNatural117
		addToElementRepository("LiteralUnlimitedNatural117", Signal_AssemblyAndDelegation_main_Read_c_tester_result_LiteralUnlimitedNatural117);
		Signal_AssemblyAndDelegation_main_Read_c_tester_result_LiteralUnlimitedNatural117.setName("LiteralUnlimitedNatural117");
		Signal_AssemblyAndDelegation_main_Read_c_tester_result_LiteralUnlimitedNatural117.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_c_tester_result_LiteralUnlimitedNatural117.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call testV_v::LiteralUnlimitedNatural73
		addToElementRepository("LiteralUnlimitedNatural73", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralUnlimitedNatural73);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralUnlimitedNatural73.setName("LiteralUnlimitedNatural73");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralUnlimitedNatural73.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v_LiteralUnlimitedNatural73.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept Continue_result::LiteralUnlimitedNatural49
		addToElementRepository("LiteralUnlimitedNatural49", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural49);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural49.setName("LiteralUnlimitedNatural49");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural49.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural49.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Create TestCaseAssembly_result::LiteralUnlimitedNatural133
		addToElementRepository("LiteralUnlimitedNatural133", Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result_LiteralUnlimitedNatural133);
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result_LiteralUnlimitedNatural133.setName("LiteralUnlimitedNatural133");
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result_LiteralUnlimitedNatural133.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result_LiteralUnlimitedNatural133.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Send Start_target::LiteralUnlimitedNatural100
		addToElementRepository("LiteralUnlimitedNatural100", Signal_AssemblyAndDelegation_main_Send_Start_target_LiteralUnlimitedNatural100);
		Signal_AssemblyAndDelegation_main_Send_Start_target_LiteralUnlimitedNatural100.setName("LiteralUnlimitedNatural100");
		Signal_AssemblyAndDelegation_main_Send_Start_target_LiteralUnlimitedNatural100.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Send_Start_target_LiteralUnlimitedNatural100.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_TestCaseAssembly()_target::LiteralUnlimitedNatural121
		addToElementRepository("LiteralUnlimitedNatural121", Signal_AssemblyAndDelegation_main_TestCaseAssembly__target_LiteralUnlimitedNatural121);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__target_LiteralUnlimitedNatural121.setName("LiteralUnlimitedNatural121");
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__target_LiteralUnlimitedNatural121.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__target_LiteralUnlimitedNatural121.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read a.v_object::LiteralUnlimitedNatural94
		addToElementRepository("LiteralUnlimitedNatural94", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object_LiteralUnlimitedNatural94);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object_LiteralUnlimitedNatural94.setName("LiteralUnlimitedNatural94");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object_LiteralUnlimitedNatural94.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object_LiteralUnlimitedNatural94.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Read TestCaseAssembly.c_result::LiteralUnlimitedNatural110
		addToElementRepository("LiteralUnlimitedNatural110", Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result_LiteralUnlimitedNatural110);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result_LiteralUnlimitedNatural110.setName("LiteralUnlimitedNatural110");
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result_LiteralUnlimitedNatural110.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result_LiteralUnlimitedNatural110.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_TestCaseAssembly()_result::LiteralUnlimitedNatural124
		addToElementRepository("LiteralUnlimitedNatural124", Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralUnlimitedNatural124);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralUnlimitedNatural124.setName("LiteralUnlimitedNatural124");
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralUnlimitedNatural124.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__result_LiteralUnlimitedNatural124.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set v_object::LiteralUnlimitedNatural13
		addToElementRepository("LiteralUnlimitedNatural13", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural13);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural13.setName("LiteralUnlimitedNatural13");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural13.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural13.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Read TestCaseAssembly.c_object::LiteralUnlimitedNatural108
		addToElementRepository("LiteralUnlimitedNatural108", Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object_LiteralUnlimitedNatural108);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object_LiteralUnlimitedNatural108.setName("LiteralUnlimitedNatural108");
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object_LiteralUnlimitedNatural108.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object_LiteralUnlimitedNatural108.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call test()_target::LiteralUnlimitedNatural38
		addToElementRepository("LiteralUnlimitedNatural38", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural38);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural38.setName("LiteralUnlimitedNatural38");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural38.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural38.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send S_target::LiteralUnlimitedNatural63
		addToElementRepository("LiteralUnlimitedNatural63", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural63);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural63.setName("LiteralUnlimitedNatural63");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural63.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural63.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read b.a_result::LiteralUnlimitedNatural69
		addToElementRepository("LiteralUnlimitedNatural69", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result_LiteralUnlimitedNatural69);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result_LiteralUnlimitedNatural69.setName("LiteralUnlimitedNatural69");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result_LiteralUnlimitedNatural69.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result_LiteralUnlimitedNatural69.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read this.b_object::LiteralUnlimitedNatural83
		addToElementRepository("LiteralUnlimitedNatural83", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object_LiteralUnlimitedNatural83);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object_LiteralUnlimitedNatural83.setName("LiteralUnlimitedNatural83");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object_LiteralUnlimitedNatural83.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object_LiteralUnlimitedNatural83.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept Start_testCase::LiteralUnlimitedNatural55
		addToElementRepository("LiteralUnlimitedNatural55", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural55);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural55.setName("LiteralUnlimitedNatural55");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural55.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural55.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result::LiteralUnlimitedNatural7
		addToElementRepository("LiteralUnlimitedNatural7", Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural7);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural7.setName("LiteralUnlimitedNatural7");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural7.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural7.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send Continue_target::LiteralUnlimitedNatural26
		addToElementRepository("LiteralUnlimitedNatural26", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural26);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural26.setName("LiteralUnlimitedNatural26");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural26.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural26.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_main_Send Start_testCase::LiteralUnlimitedNatural103
		addToElementRepository("LiteralUnlimitedNatural103", Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralUnlimitedNatural103);
		Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralUnlimitedNatural103.setName("LiteralUnlimitedNatural103");
		Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralUnlimitedNatural103.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Send_Start_testCase_LiteralUnlimitedNatural103.setValue(1);
		// LiteralUnlimitedNatural Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set v_result::LiteralUnlimitedNatural18
		addToElementRepository("LiteralUnlimitedNatural18", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural18);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural18.setName("LiteralUnlimitedNatural18");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural18.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural18.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::ObjectFlow31
		addToElementRepository("ObjectFlow31", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31.setName("ObjectFlow31");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31.setSource(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31.setTarget(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31.setGuard(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow31_LiteralBoolean32);
		// ObjectFlow Signal_AssemblyAndDelegation_main::ObjectFlow104
		addToElementRepository("ObjectFlow104", Signal_AssemblyAndDelegation_main_ObjectFlow104);
		Signal_AssemblyAndDelegation_main_ObjectFlow104.setName("ObjectFlow104");
		Signal_AssemblyAndDelegation_main_ObjectFlow104.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_main_ObjectFlow104.setSource(Signal_AssemblyAndDelegation_main_Fork_testCase);
		Signal_AssemblyAndDelegation_main_ObjectFlow104.setTarget(Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object);
		Signal_AssemblyAndDelegation_main_ObjectFlow104.setGuard(Signal_AssemblyAndDelegation_main_ObjectFlow104_LiteralBoolean105);
		// ObjectFlow Signal_AssemblyAndDelegation_A_AClassifierBehavior::ObjectFlow2
		addToElementRepository("ObjectFlow2", Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2.setName("ObjectFlow2");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2.setSource(Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2.setTarget(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_object);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2.setGuard(Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow2_LiteralBoolean4);
		// ObjectFlow Signal_AssemblyAndDelegation_main::ObjectFlow111
		addToElementRepository("ObjectFlow111", Signal_AssemblyAndDelegation_main_ObjectFlow111);
		Signal_AssemblyAndDelegation_main_ObjectFlow111.setName("ObjectFlow111");
		Signal_AssemblyAndDelegation_main_ObjectFlow111.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_main_ObjectFlow111.setSource(Signal_AssemblyAndDelegation_main_TestCaseAssembly__result);
		Signal_AssemblyAndDelegation_main_ObjectFlow111.setTarget(Signal_AssemblyAndDelegation_main_Fork_testCase);
		Signal_AssemblyAndDelegation_main_ObjectFlow111.setGuard(Signal_AssemblyAndDelegation_main_ObjectFlow111_LiteralBoolean113);
		// ObjectFlow Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity::ObjectFlow76
		addToElementRepository("ObjectFlow76", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76.setName("ObjectFlow76");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76.setSource(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76.setTarget(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Call_testV_v);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76.setGuard(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow76_LiteralBoolean78);
		// ObjectFlow Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity::ObjectFlow79
		addToElementRepository("ObjectFlow79", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79.setName("ObjectFlow79");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79.setSource(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79.setTarget(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79.setGuard(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow79_LiteralBoolean80);
		// ObjectFlow Signal_AssemblyAndDelegation_main::ObjectFlow118
		addToElementRepository("ObjectFlow118", Signal_AssemblyAndDelegation_main_ObjectFlow118);
		Signal_AssemblyAndDelegation_main_ObjectFlow118.setName("ObjectFlow118");
		Signal_AssemblyAndDelegation_main_ObjectFlow118.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_main_ObjectFlow118.setSource(Signal_AssemblyAndDelegation_main_Read_c_tester_result);
		Signal_AssemblyAndDelegation_main_ObjectFlow118.setTarget(Signal_AssemblyAndDelegation_main_Send_Start_target);
		Signal_AssemblyAndDelegation_main_ObjectFlow118.setGuard(Signal_AssemblyAndDelegation_main_ObjectFlow118_LiteralBoolean119);
		// ObjectFlow Signal_AssemblyAndDelegation_A_AClassifierBehavior::ObjectFlow22
		addToElementRepository("ObjectFlow22", Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22.setName("ObjectFlow22");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22.setSource(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22.setTarget(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_value);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22.setGuard(Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow22_LiteralBoolean24);
		// ObjectFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::ObjectFlow41
		addToElementRepository("ObjectFlow41", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41.setName("ObjectFlow41");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41.setSource(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41.setTarget(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41.setGuard(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow41_LiteralBoolean42);
		// ObjectFlow Signal_AssemblyAndDelegation_main::ObjectFlow126
		addToElementRepository("ObjectFlow126", Signal_AssemblyAndDelegation_main_ObjectFlow126);
		Signal_AssemblyAndDelegation_main_ObjectFlow126.setName("ObjectFlow126");
		Signal_AssemblyAndDelegation_main_ObjectFlow126.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_main_ObjectFlow126.setSource(Signal_AssemblyAndDelegation_main_Fork_testCase);
		Signal_AssemblyAndDelegation_main_ObjectFlow126.setTarget(Signal_AssemblyAndDelegation_main_Send_Start_testCase);
		Signal_AssemblyAndDelegation_main_ObjectFlow126.setGuard(Signal_AssemblyAndDelegation_main_ObjectFlow126_LiteralBoolean128);
		// ObjectFlow Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity::ObjectFlow89
		addToElementRepository("ObjectFlow89", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89.setName("ObjectFlow89");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89.setSource(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89.setTarget(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89.setGuard(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow89_LiteralBoolean90);
		// ObjectFlow Signal_AssemblyAndDelegation_main::ObjectFlow134
		addToElementRepository("ObjectFlow134", Signal_AssemblyAndDelegation_main_ObjectFlow134);
		Signal_AssemblyAndDelegation_main_ObjectFlow134.setName("ObjectFlow134");
		Signal_AssemblyAndDelegation_main_ObjectFlow134.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_main_ObjectFlow134.setSource(Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result);
		Signal_AssemblyAndDelegation_main_ObjectFlow134.setTarget(Signal_AssemblyAndDelegation_main_TestCaseAssembly__target);
		Signal_AssemblyAndDelegation_main_ObjectFlow134.setGuard(Signal_AssemblyAndDelegation_main_ObjectFlow134_LiteralBoolean135);
		// ObjectFlow Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::ObjectFlow57
		addToElementRepository("ObjectFlow57", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57.setName("ObjectFlow57");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57.setSource(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57.setTarget(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Call_test__target);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57.setGuard(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_ObjectFlow57_LiteralBoolean58);
		// ObjectFlow Signal_AssemblyAndDelegation_A_AClassifierBehavior::ObjectFlow19
		addToElementRepository("ObjectFlow19", Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19.setName("ObjectFlow19");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19.setSource(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19.setTarget(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19.setGuard(Signal_AssemblyAndDelegation_A_AClassifierBehavior_ObjectFlow19_LiteralBoolean20);
		// ObjectFlow Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity::ObjectFlow86
		addToElementRepository("ObjectFlow86", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86.setName("ObjectFlow86");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86.setSource(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86.setTarget(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86.setGuard(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_ObjectFlow86_LiteralBoolean88);
		// ObjectFlow Signal_AssemblyAndDelegation_main::ObjectFlow129
		addToElementRepository("ObjectFlow129", Signal_AssemblyAndDelegation_main_ObjectFlow129);
		Signal_AssemblyAndDelegation_main_ObjectFlow129.setName("ObjectFlow129");
		Signal_AssemblyAndDelegation_main_ObjectFlow129.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_main_ObjectFlow129.setSource(Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result);
		Signal_AssemblyAndDelegation_main_ObjectFlow129.setTarget(Signal_AssemblyAndDelegation_main_Read_c_tester_object);
		Signal_AssemblyAndDelegation_main_ObjectFlow129.setGuard(Signal_AssemblyAndDelegation_main_ObjectFlow129_LiteralBoolean131);
	}

	private void initializeOperation_Instances()
	{
		// Operation Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation::TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation
		addToElementRepository("TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation.setName("TestCaseAssemblyAndDelegation");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation.addOwnedParameter(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_result);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation Signal_AssemblyAndDelegation_A::A_A
		addToElementRepository("A_A", Signal_AssemblyAndDelegation_A_A_A);
		Signal_AssemblyAndDelegation_A_A_A.setName("A");
		Signal_AssemblyAndDelegation_A_A_A.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_A_A.addOwnedParameter(Signal_AssemblyAndDelegation_A_A_A_result);
		Signal_AssemblyAndDelegation_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation Signal_AssemblyAndDelegation_Tester::Tester_Tester
		addToElementRepository("Tester_Tester", Signal_AssemblyAndDelegation_Tester_Tester_Tester);
		Signal_AssemblyAndDelegation_Tester_Tester_Tester.setName("Tester");
		Signal_AssemblyAndDelegation_Tester_Tester_Tester.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_Tester_Tester.addOwnedParameter(Signal_AssemblyAndDelegation_Tester_Tester_Tester_result);
		Signal_AssemblyAndDelegation_Tester_Tester_Tester.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation Signal_AssemblyAndDelegation_TestCase::test
		addToElementRepository("test", Signal_AssemblyAndDelegation_TestCase_test);
		Signal_AssemblyAndDelegation_TestCase_test.setName("test");
		Signal_AssemblyAndDelegation_TestCase_test.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCase_test.setIsAbstract(true);
		// Operation Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation::test
		addToElementRepository("test", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_test);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_test.setName("test");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_test.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_test.addMethod(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_test.addRedefinedOperation(Signal_AssemblyAndDelegation_TestCase_test);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin Signal_AssemblyAndDelegation_A_AClassifierBehavior_this::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result.setName("result");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result.setType(Signal_AssemblyAndDelegation_A);
		// OutputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result.setName("result");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result.setType(Signal_AssemblyAndDelegation_Tester);
		// OutputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read b.a::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result.setName("result");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result.setType(Signal_AssemblyAndDelegation_A);
		// OutputPin Signal_AssemblyAndDelegation_main_Read TestCaseAssembly.c::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result.setName("result");
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result.setType(Signal_AssemblyAndDelegation_C);
		// OutputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read a.v::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result.setName("result");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept Continue::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result.setName("result");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_result.setType(Signal_AssemblyAndDelegation_Continue);
		// OutputPin Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept S::value
		addToElementRepository("value", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value.setName("value");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Signal_AssemblyAndDelegation_main_Create TestCaseAssembly::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result);
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result.setName("result");
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Create_TestCaseAssembly_result.setType(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation);
		// OutputPin Signal_AssemblyAndDelegation_main_Read c.tester::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_main_Read_c_tester_result);
		Signal_AssemblyAndDelegation_main_Read_c_tester_result.setName("result");
		Signal_AssemblyAndDelegation_main_Read_c_tester_result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_c_tester_result.setType(Signal_AssemblyAndDelegation_Tester);
		// OutputPin Signal_AssemblyAndDelegation_main_TestCaseAssembly()::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_main_TestCaseAssembly__result);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__result.setName("result");
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_TestCaseAssembly__result.setType(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation);
		// OutputPin Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set v::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result.setName("result");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Set_v_result.setType(Signal_AssemblyAndDelegation_A);
		// OutputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept Start::testCase
		addToElementRepository("testCase", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase.setName("testCase");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_testCase.setType(Signal_AssemblyAndDelegation_TestCase);
		// OutputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read this.b::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result.setName("result");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result.setType(Signal_AssemblyAndDelegation_B);
		// OutputPin Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result.setName("result");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result.setType(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation);
		// OutputPin Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value(4)::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result.setName("result");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport Signal_AssemblyAndDelegation::PackageImport29
		addToElementRepository("PackageImport29", Signal_AssemblyAndDelegation_PackageImport29);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter Signal_AssemblyAndDelegation_A_A_A::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_A_A_A_result);
		Signal_AssemblyAndDelegation_A_A_A_result.setName("result");
		Signal_AssemblyAndDelegation_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_A_A_A_result.setType(Signal_AssemblyAndDelegation_A);
		Signal_AssemblyAndDelegation_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter Signal_AssemblyAndDelegation_Tester_Tester_Tester::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_Tester_Tester_Tester_result);
		Signal_AssemblyAndDelegation_Tester_Tester_Tester_result.setName("result");
		Signal_AssemblyAndDelegation_Tester_Tester_Tester_result.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Tester_Tester_Tester_result.setType(Signal_AssemblyAndDelegation_Tester);
		Signal_AssemblyAndDelegation_Tester_Tester_Tester_result.setDirection(ParameterDirectionKind.return_);
		// Parameter Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV::v
		addToElementRepository("v", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV_v);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV_v.setName("v");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV_v.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_testV_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation::result
		addToElementRepository("result", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_result);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_result.setName("result");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_result.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_result.setType(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_TestCaseAssemblyAndDelegation_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port Signal_AssemblyAndDelegation_A::p
		addToElementRepository("p", Signal_AssemblyAndDelegation_A_p);
		Signal_AssemblyAndDelegation_A_p.setName("p");
		Signal_AssemblyAndDelegation_A_p.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_A_p.setType(Signal_AssemblyAndDelegation_I);
		Signal_AssemblyAndDelegation_A_p.setAggregation(AggregationKind.composite);
		Signal_AssemblyAndDelegation_A_p.isBehavior = true;
		Signal_AssemblyAndDelegation_A_p.isService = true;
		// Port Signal_AssemblyAndDelegation_B::p
		addToElementRepository("p", Signal_AssemblyAndDelegation_B_p);
		Signal_AssemblyAndDelegation_B_p.setName("p");
		Signal_AssemblyAndDelegation_B_p.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_B_p.setType(Signal_AssemblyAndDelegation_I);
		Signal_AssemblyAndDelegation_B_p.setAggregation(AggregationKind.composite);
		Signal_AssemblyAndDelegation_B_p.isService = true;
		// Port Signal_AssemblyAndDelegation_C::q
		addToElementRepository("q", Signal_AssemblyAndDelegation_C_q);
		Signal_AssemblyAndDelegation_C_q.setName("q");
		Signal_AssemblyAndDelegation_C_q.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_C_q.setType(Signal_AssemblyAndDelegation_I);
		Signal_AssemblyAndDelegation_C_q.setAggregation(AggregationKind.composite);
		Signal_AssemblyAndDelegation_C_q.isService = true;
		// Port Signal_AssemblyAndDelegation_Tester::q
		addToElementRepository("q", Signal_AssemblyAndDelegation_Tester_q);
		Signal_AssemblyAndDelegation_Tester_q.setName("q");
		Signal_AssemblyAndDelegation_Tester_q.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Tester_q.setType(Signal_AssemblyAndDelegation_I);
		Signal_AssemblyAndDelegation_Tester_q.setAggregation(AggregationKind.composite);
		Signal_AssemblyAndDelegation_Tester_q.isBehavior = true;
		Signal_AssemblyAndDelegation_Tester_q.isService = true;
	}

	private void initializeProperty_Instances()
	{
		// Property Signal_AssemblyAndDelegation_R::x
		addToElementRepository("x", Signal_AssemblyAndDelegation_R_x);
		Signal_AssemblyAndDelegation_R_x.setName("x");
		Signal_AssemblyAndDelegation_R_x.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_R_x.setType(Signal_AssemblyAndDelegation_I);
		// Property Signal_AssemblyAndDelegation_Start::testCase
		addToElementRepository("testCase", Signal_AssemblyAndDelegation_Start_testCase);
		Signal_AssemblyAndDelegation_Start_testCase.setName("testCase");
		Signal_AssemblyAndDelegation_Start_testCase.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Start_testCase.setType(Signal_AssemblyAndDelegation_TestCase);
		// Property Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation::b
		addToElementRepository("b", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_b);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_b.setName("b");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_b.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_b.setType(Signal_AssemblyAndDelegation_B);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_b.setAggregation(AggregationKind.composite);
		// Property Signal_AssemblyAndDelegation_C::tester
		addToElementRepository("tester", Signal_AssemblyAndDelegation_C_tester);
		Signal_AssemblyAndDelegation_C_tester.setName("tester");
		Signal_AssemblyAndDelegation_C_tester.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_C_tester.setType(Signal_AssemblyAndDelegation_Tester);
		Signal_AssemblyAndDelegation_C_tester.setAggregation(AggregationKind.composite);
		// Property Signal_AssemblyAndDelegation_B::a
		addToElementRepository("a", Signal_AssemblyAndDelegation_B_a);
		Signal_AssemblyAndDelegation_B_a.setName("a");
		Signal_AssemblyAndDelegation_B_a.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_B_a.setType(Signal_AssemblyAndDelegation_A);
		Signal_AssemblyAndDelegation_B_a.setAggregation(AggregationKind.composite);
		// Property Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation::c
		addToElementRepository("c", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_c);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_c.setName("c");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_c.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_c.setType(Signal_AssemblyAndDelegation_C);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_c.setAggregation(AggregationKind.composite);
		// Property Signal_AssemblyAndDelegation_S::value
		addToElementRepository("value", Signal_AssemblyAndDelegation_S_value);
		Signal_AssemblyAndDelegation_S_value.setName("value");
		Signal_AssemblyAndDelegation_S_value.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_S_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property Signal_AssemblyAndDelegation_A::v
		addToElementRepository("v", Signal_AssemblyAndDelegation_A_v);
		Signal_AssemblyAndDelegation_A_v.setName("v");
		Signal_AssemblyAndDelegation_A_v.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_A_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		Signal_AssemblyAndDelegation_A_v.setAggregation(AggregationKind.shared);
		// Property Signal_AssemblyAndDelegation_R::y
		addToElementRepository("y", Signal_AssemblyAndDelegation_R_y);
		Signal_AssemblyAndDelegation_R_y.setName("y");
		Signal_AssemblyAndDelegation_R_y.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_R_y.setType(Signal_AssemblyAndDelegation_I);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction Signal_AssemblyAndDelegation_A_AClassifierBehavior::this
		addToElementRepository("this", Signal_AssemblyAndDelegation_A_AClassifierBehavior_this);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_this.setName("this");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_this.setResult(Signal_AssemblyAndDelegation_A_AClassifierBehavior_this_result);
		// ReadSelfAction Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity::this
		addToElementRepository("this", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this.setName("this");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this.setResult(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_this_result);
		// ReadSelfAction Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::this
		addToElementRepository("this", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this.setName("this");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this.setResult(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity::Read b.a
		addToElementRepository("Read b.a", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a.setName("Read b.a");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a.setStructuralFeature(Signal_AssemblyAndDelegation_B_a);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a.setObject(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_object);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a.setResult(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_b_a_result);
		// ReadStructuralFeatureAction Signal_AssemblyAndDelegation_main::Read TestCaseAssembly.c
		addToElementRepository("Read TestCaseAssembly.c", Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c.setName("Read TestCaseAssembly.c");
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c.setStructuralFeature(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_c);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c.setObject(Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_object);
		Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c.setResult(Signal_AssemblyAndDelegation_main_Read_TestCaseAssembly_c_result);
		// ReadStructuralFeatureAction Signal_AssemblyAndDelegation_main::Read c.tester
		addToElementRepository("Read c.tester", Signal_AssemblyAndDelegation_main_Read_c_tester);
		Signal_AssemblyAndDelegation_main_Read_c_tester.setName("Read c.tester");
		Signal_AssemblyAndDelegation_main_Read_c_tester.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Read_c_tester.setStructuralFeature(Signal_AssemblyAndDelegation_C_tester);
		Signal_AssemblyAndDelegation_main_Read_c_tester.setObject(Signal_AssemblyAndDelegation_main_Read_c_tester_object);
		Signal_AssemblyAndDelegation_main_Read_c_tester.setResult(Signal_AssemblyAndDelegation_main_Read_c_tester_result);
		// ReadStructuralFeatureAction Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity::Read this.b
		addToElementRepository("Read this.b", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b.setName("Read this.b");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b.setStructuralFeature(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_b);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b.setObject(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_object);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b.setResult(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_this_b_result);
		// ReadStructuralFeatureAction Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity::Read a.v
		addToElementRepository("Read a.v", Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v.setName("Read a.v");
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v.setStructuralFeature(Signal_AssemblyAndDelegation_A_v);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v.setObject(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_object);
		Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v.setResult(Signal_AssemblyAndDelegation_TestCaseAssemblyAndDelegation_testActivity_Read_a_v_result);
	}

	private void initializeReception_Instances()
	{
		// Reception Signal_AssemblyAndDelegation_Tester::Start
		addToElementRepository("Start", Signal_AssemblyAndDelegation_Tester_Start);
		Signal_AssemblyAndDelegation_Tester_Start.setName("Start");
		Signal_AssemblyAndDelegation_Tester_Start.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_Start.setSignal(Signal_AssemblyAndDelegation_Start);
	}

	private void initializeSendSignalAction_Instances()
	{
		// SendSignalAction Signal_AssemblyAndDelegation_main::Send Start
		addToElementRepository("Send Start", Signal_AssemblyAndDelegation_main_Send_Start);
		Signal_AssemblyAndDelegation_main_Send_Start.setName("Send Start");
		Signal_AssemblyAndDelegation_main_Send_Start.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_main_Send_Start.setSignal(Signal_AssemblyAndDelegation_Start);
		Signal_AssemblyAndDelegation_main_Send_Start.setTarget(Signal_AssemblyAndDelegation_main_Send_Start_target);
		Signal_AssemblyAndDelegation_main_Send_Start.addArgument(Signal_AssemblyAndDelegation_main_Send_Start_testCase);
		// SendSignalAction Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::Send S
		addToElementRepository("Send S", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S.setName("Send S");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S.setSignal(Signal_AssemblyAndDelegation_S);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S.setTarget(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_target);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S.addArgument(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S_value);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Send_S.setOnPort(Signal_AssemblyAndDelegation_Tester_q);
		// SendSignalAction Signal_AssemblyAndDelegation_A_AClassifierBehavior::Send Continue
		addToElementRepository("Send Continue", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue.setName("Send Continue");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue.setSignal(Signal_AssemblyAndDelegation_Continue);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue.setTarget(Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue_target);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Send_Continue.setOnPort(Signal_AssemblyAndDelegation_A_p);
	}

	private void initializeSignal_Instances()
	{
		// Signal Signal_AssemblyAndDelegation::S
		addToElementRepository("S", Signal_AssemblyAndDelegation_S);
		Signal_AssemblyAndDelegation_S.setName("S");
		Signal_AssemblyAndDelegation_S.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_S.addOwnedAttribute(Signal_AssemblyAndDelegation_S_value);
		// Signal Signal_AssemblyAndDelegation::Continue
		addToElementRepository("Continue", Signal_AssemblyAndDelegation_Continue);
		Signal_AssemblyAndDelegation_Continue.setName("Continue");
		Signal_AssemblyAndDelegation_Continue.setVisibility(VisibilityKind.public_);
		// Signal Signal_AssemblyAndDelegation::Start
		addToElementRepository("Start", Signal_AssemblyAndDelegation_Start);
		Signal_AssemblyAndDelegation_Start.setName("Start");
		Signal_AssemblyAndDelegation_Start.setVisibility(VisibilityKind.public_);
		
		Signal_AssemblyAndDelegation_Start.addOwnedAttribute(Signal_AssemblyAndDelegation_Start_testCase);
	}

	private void initializeSignalEvent_Instances()
	{
		// SignalEvent Signal_AssemblyAndDelegation::SEvent
		addToElementRepository("SEvent", Signal_AssemblyAndDelegation_SEvent);
		Signal_AssemblyAndDelegation_SEvent.setName("SEvent");
		Signal_AssemblyAndDelegation_SEvent.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_SEvent.setSignal(Signal_AssemblyAndDelegation_S);
		// SignalEvent Signal_AssemblyAndDelegation::ContinueEvent
		addToElementRepository("ContinueEvent", Signal_AssemblyAndDelegation_ContinueEvent);
		Signal_AssemblyAndDelegation_ContinueEvent.setName("ContinueEvent");
		Signal_AssemblyAndDelegation_ContinueEvent.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_ContinueEvent.setSignal(Signal_AssemblyAndDelegation_Continue);
		// SignalEvent Signal_AssemblyAndDelegation::StartEvent
		addToElementRepository("StartEvent", Signal_AssemblyAndDelegation_StartEvent);
		Signal_AssemblyAndDelegation_StartEvent.setName("StartEvent");
		Signal_AssemblyAndDelegation_StartEvent.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_StartEvent.setSignal(Signal_AssemblyAndDelegation_Start);
	}

	private void initializeTrigger_Instances()
	{
		// Trigger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept Start::Trigger53
		addToElementRepository("Trigger53", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_Trigger53);
		// Trigger Trigger53
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_Trigger53.setName("Trigger53");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_Trigger53.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Start_Trigger53.setEvent(Signal_AssemblyAndDelegation_StartEvent);
		// Trigger Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept S::Trigger12
		addToElementRepository("Trigger12", Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_Trigger12);
		// Trigger Trigger12
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_Trigger12.setName("Trigger12");
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_Trigger12.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_A_AClassifierBehavior_Accept_S_Trigger12.setEvent(Signal_AssemblyAndDelegation_SEvent);
		// Trigger Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept Continue::Trigger50
		addToElementRepository("Trigger50", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_Trigger50);
		// Trigger Trigger50
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_Trigger50.setName("Trigger50");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_Trigger50.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Accept_Continue_Trigger50.setEvent(Signal_AssemblyAndDelegation_ContinueEvent);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior::Value(4)
		addToElementRepository("Value(4)", Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4.setName("Value(4)");
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4.setVisibility(VisibilityKind.public_);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4.setValue(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_LiteralInteger44);
		Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4.setResult(Signal_AssemblyAndDelegation_Tester_TesterClassifierBehavior_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // Signal_AssemblyAndDelegationModel
