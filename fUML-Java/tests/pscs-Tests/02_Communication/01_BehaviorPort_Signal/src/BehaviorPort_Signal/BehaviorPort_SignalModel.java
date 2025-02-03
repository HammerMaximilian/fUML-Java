/*
 * BehaviorPort_SignalModel.java
 * 
 * Auto-generated file
 */
package BehaviorPort_Signal;

import uml.commonbehavior.SignalEvent;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.classification.Generalization;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.Signal;
import uml.simpleclassifiers.InterfaceRealization;
import uml.actions.OutputPin;
import uml.activities.Activity;
import uml.actions.ReadStructuralFeatureAction;
import uml.actions.CallOperationAction;
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
import uml.actions.StartObjectBehaviorAction;
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

public class BehaviorPort_SignalModel extends InMemoryModel
{
	private static BehaviorPort_SignalModel instance;

	/*
	 * Model BehaviorPort_Signal
	 */
	public Package BehaviorPort_Signal = new Package();
		public Signal BehaviorPort_Signal_S = new Signal();
			public Property BehaviorPort_Signal_S_t = new Property();
			public Property BehaviorPort_Signal_S_v = new Property();
		public Interface BehaviorPort_Signal_I = new Interface();
			public Reception BehaviorPort_Signal_I_S = new Reception();
		public Class_ BehaviorPort_Signal_Tester = new Class_();
			public Property BehaviorPort_Signal_Tester_a = new Property();
			public Operation BehaviorPort_Signal_Tester_test = new Operation();
			public Activity BehaviorPort_Signal_Tester_testActivity = new Activity();
				public ObjectFlow BehaviorPort_Signal_Tester_testActivity_ObjectFlow0 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Signal_Tester_testActivity_ObjectFlow0_LiteralBoolean1 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Signal_Tester_testActivity_ObjectFlow0_LiteralInteger2 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Signal_Tester_testActivity_ObjectFlow3 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Signal_Tester_testActivity_ObjectFlow3_LiteralInteger4 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Signal_Tester_testActivity_ObjectFlow3_LiteralBoolean5 = new LiteralBoolean();
				public OpaqueBehavior BehaviorPort_Signal_Tester_testActivity_testP = new OpaqueBehavior();
					public Parameter BehaviorPort_Signal_Tester_testActivity_testP_p = new Parameter();
				public ObjectFlow BehaviorPort_Signal_Tester_testActivity_ObjectFlow6 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Signal_Tester_testActivity_ObjectFlow6_LiteralInteger7 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Signal_Tester_testActivity_ObjectFlow6_LiteralBoolean8 = new LiteralBoolean();
				public ReadSelfAction BehaviorPort_Signal_Tester_testActivity_this = new ReadSelfAction();
					public OutputPin BehaviorPort_Signal_Tester_testActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural9 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_Tester_testActivity_this_result_LiteralInteger10 = new LiteralInteger();
				public ReadStructuralFeatureAction BehaviorPort_Signal_Tester_testActivity_this_a = new ReadStructuralFeatureAction();
					public InputPin BehaviorPort_Signal_Tester_testActivity_this_a_object = new InputPin();
						public LiteralInteger BehaviorPort_Signal_Tester_testActivity_this_a_object_LiteralInteger11 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_testActivity_this_a_object_LiteralUnlimitedNatural12 = new LiteralUnlimitedNatural();
					public OutputPin BehaviorPort_Signal_Tester_testActivity_this_a_result = new OutputPin();
						public LiteralInteger BehaviorPort_Signal_Tester_testActivity_this_a_result_LiteralInteger13 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_testActivity_this_a_result_LiteralUnlimitedNatural14 = new LiteralUnlimitedNatural();
				public CallBehaviorAction BehaviorPort_Signal_Tester_testActivity_Call_testP = new CallBehaviorAction();
					public InputPin BehaviorPort_Signal_Tester_testActivity_Call_testP_p = new InputPin();
						public LiteralInteger BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralInteger15 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural16 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralInteger17 = new LiteralInteger();
				public ReadStructuralFeatureAction BehaviorPort_Signal_Tester_testActivity_this_a_p = new ReadStructuralFeatureAction();
					public InputPin BehaviorPort_Signal_Tester_testActivity_this_a_p_object = new InputPin();
						public LiteralInteger BehaviorPort_Signal_Tester_testActivity_this_a_p_object_LiteralInteger18 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_testActivity_this_a_p_object_LiteralUnlimitedNatural19 = new LiteralUnlimitedNatural();
					public OutputPin BehaviorPort_Signal_Tester_testActivity_this_a_p_result = new OutputPin();
						public LiteralInteger BehaviorPort_Signal_Tester_testActivity_this_a_p_result_LiteralInteger20 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_testActivity_this_a_p_result_LiteralUnlimitedNatural21 = new LiteralUnlimitedNatural();
			public Generalization BehaviorPort_Signal_Tester_Generalization22 = new Generalization();
			public Activity BehaviorPort_Signal_Tester_TesterClassifierBehavior = new Activity();
				public ReadSelfAction BehaviorPort_Signal_Tester_TesterClassifierBehavior_this = new ReadSelfAction();
					public OutputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger23 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural24 = new LiteralUnlimitedNatural();
				public ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25_LiteralBoolean26 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25_LiteralInteger27 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28_LiteralInteger29 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28_LiteralBoolean30 = new LiteralBoolean();
				public CallOperationAction BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test_ = new CallOperationAction();
					public InputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target = new InputPin();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger31 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural32 = new LiteralUnlimitedNatural();
				public ControlFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow33 = new ControlFlow();
				public ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralBoolean35 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralInteger36 = new LiteralInteger();
				public InitialNode BehaviorPort_Signal_Tester_TesterClassifierBehavior_Initial = new InitialNode();
				public SendSignalAction BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S = new SendSignalAction();
					public InputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target = new InputPin();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural37 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger38 = new LiteralInteger();
					public InputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v = new InputPin();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger39 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural40 = new LiteralUnlimitedNatural();
					public InputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t = new InputPin();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger41 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural42 = new LiteralUnlimitedNatural();
				public ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43_LiteralInteger44 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43_LiteralBoolean45 = new LiteralBoolean();
				public ReadStructuralFeatureAction BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a = new ReadStructuralFeatureAction();
					public InputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object = new InputPin();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger47 = new LiteralInteger();
					public OutputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result = new OutputPin();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger48 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural49 = new LiteralUnlimitedNatural();
				public ReadStructuralFeatureAction BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q = new ReadStructuralFeatureAction();
					public InputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object = new InputPin();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object_LiteralInteger50 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object_LiteralUnlimitedNatural51 = new LiteralUnlimitedNatural();
					public OutputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result = new OutputPin();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result_LiteralUnlimitedNatural52 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result_LiteralInteger53 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralInteger55 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralBoolean56 = new LiteralBoolean();
				public ControlFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow57 = new ControlFlow();
				public AcceptEventAction BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start = new AcceptEventAction();
					public Trigger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger58 = new Trigger();
					public OutputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result = new OutputPin();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger59 = new LiteralInteger();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger60 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural61 = new LiteralUnlimitedNatural();
				public ForkNode BehaviorPort_Signal_Tester_TesterClassifierBehavior_Fork_this = new ForkNode();
				public ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralBoolean63 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralInteger64 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65_LiteralInteger66 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65_LiteralBoolean67 = new LiteralBoolean();
				public ControlFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow68 = new ControlFlow();
				public AcceptEventAction BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue = new AcceptEventAction();
					public OutputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result = new OutputPin();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural69 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger70 = new LiteralInteger();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger71 = new LiteralInteger();
					public Trigger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_Trigger72 = new Trigger();
				public ValueSpecificationAction BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4 = new ValueSpecificationAction();
					public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger73 = new LiteralInteger();
					public OutputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result = new OutputPin();
						public LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural74 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger75 = new LiteralInteger();
			public Operation BehaviorPort_Signal_Tester_Tester_Tester = new Operation();
				public Parameter BehaviorPort_Signal_Tester_Tester_Tester_result = new Parameter();
		public Activity BehaviorPort_Signal_main = new Activity();
			public ObjectFlow BehaviorPort_Signal_main_ObjectFlow76 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Signal_main_ObjectFlow76_LiteralInteger77 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Signal_main_ObjectFlow76_LiteralBoolean78 = new LiteralBoolean();
			public ObjectFlow BehaviorPort_Signal_main_ObjectFlow79 = new ObjectFlow();
				public LiteralBoolean BehaviorPort_Signal_main_ObjectFlow79_LiteralBoolean80 = new LiteralBoolean();
				public LiteralInteger BehaviorPort_Signal_main_ObjectFlow79_LiteralInteger81 = new LiteralInteger();
			public ObjectFlow BehaviorPort_Signal_main_ObjectFlow82 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Signal_main_ObjectFlow82_LiteralInteger83 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Signal_main_ObjectFlow82_LiteralBoolean84 = new LiteralBoolean();
			public ObjectFlow BehaviorPort_Signal_main_ObjectFlow85 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Signal_main_ObjectFlow85_LiteralInteger86 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Signal_main_ObjectFlow85_LiteralBoolean87 = new LiteralBoolean();
			public CreateObjectAction BehaviorPort_Signal_main_Create_Tester = new CreateObjectAction();
				public OutputPin BehaviorPort_Signal_main_Create_Tester_result = new OutputPin();
					public LiteralUnlimitedNatural BehaviorPort_Signal_main_Create_Tester_result_LiteralUnlimitedNatural88 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Signal_main_Create_Tester_result_LiteralInteger89 = new LiteralInteger();
			public ForkNode BehaviorPort_Signal_main_Fork_Tester = new ForkNode();
			public ControlFlow BehaviorPort_Signal_main_ControlFlow90 = new ControlFlow();
			public SendSignalAction BehaviorPort_Signal_main_Send_Start = new SendSignalAction();
				public InputPin BehaviorPort_Signal_main_Send_Start_target = new InputPin();
					public LiteralUnlimitedNatural BehaviorPort_Signal_main_Send_Start_target_LiteralUnlimitedNatural91 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Signal_main_Send_Start_target_LiteralInteger92 = new LiteralInteger();
			public CallOperationAction BehaviorPort_Signal_main_Tester_ = new CallOperationAction();
				public OutputPin BehaviorPort_Signal_main_Tester__result = new OutputPin();
					public LiteralInteger BehaviorPort_Signal_main_Tester__result_LiteralInteger93 = new LiteralInteger();
					public LiteralUnlimitedNatural BehaviorPort_Signal_main_Tester__result_LiteralUnlimitedNatural94 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Signal_main_Tester__result_LiteralInteger95 = new LiteralInteger();
				public InputPin BehaviorPort_Signal_main_Tester__target = new InputPin();
					public LiteralUnlimitedNatural BehaviorPort_Signal_main_Tester__target_LiteralUnlimitedNatural96 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Signal_main_Tester__target_LiteralInteger97 = new LiteralInteger();
			public StartObjectBehaviorAction BehaviorPort_Signal_main_Start_Tester = new StartObjectBehaviorAction();
				public InputPin BehaviorPort_Signal_main_Start_Tester_object = new InputPin();
					public LiteralInteger BehaviorPort_Signal_main_Start_Tester_object_LiteralInteger98 = new LiteralInteger();
					public LiteralUnlimitedNatural BehaviorPort_Signal_main_Start_Tester_object_LiteralUnlimitedNatural99 = new LiteralUnlimitedNatural();
		public Signal BehaviorPort_Signal_Start = new Signal();
		public Signal BehaviorPort_Signal_Continue = new Signal();
		public Class_ BehaviorPort_Signal_AbstractTester = new Class_();
			public Operation BehaviorPort_Signal_AbstractTester_test = new Operation();
			public Reception BehaviorPort_Signal_AbstractTester_Continue = new Reception();
			public Reception BehaviorPort_Signal_AbstractTester_Start = new Reception();
		public Class_ BehaviorPort_Signal_A = new Class_();
			public Property BehaviorPort_Signal_A_p = new Property();
			public Port BehaviorPort_Signal_A_q = new Port();
			public Reception BehaviorPort_Signal_A_S = new Reception();
			public Operation BehaviorPort_Signal_A_A_A = new Operation();
				public Parameter BehaviorPort_Signal_A_A_A_result = new Parameter();
			public Activity BehaviorPort_Signal_A_AClassifierBehavior = new Activity();
				public SendSignalAction BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue = new SendSignalAction();
					public InputPin BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target = new InputPin();
						public LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural100 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target_LiteralInteger101 = new LiteralInteger();
				public InitialNode BehaviorPort_Signal_A_AClassifierBehavior_Initial = new InitialNode();
				public AddStructuralFeatureValueAction BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p = new AddStructuralFeatureValueAction();
					public OutputPin BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural102 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralInteger103 = new LiteralInteger();
					public InputPin BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value = new InputPin();
						public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralInteger104 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural105 = new LiteralUnlimitedNatural();
					public InputPin BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object = new InputPin();
						public LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural106 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralInteger107 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108_LiteralBoolean109 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108_LiteralInteger110 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111_LiteralBoolean112 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111_LiteralInteger113 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114_LiteralInteger115 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114_LiteralBoolean116 = new LiteralBoolean();
				public ForkNode BehaviorPort_Signal_A_AClassifierBehavior_Fork_S = new ForkNode();
				public ObjectFlow BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117_LiteralInteger118 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117_LiteralBoolean119 = new LiteralBoolean();
				public ReadStructuralFeatureAction BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t = new ReadStructuralFeatureAction();
					public OutputPin BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result = new OutputPin();
						public LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result_LiteralUnlimitedNatural120 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result_LiteralInteger121 = new LiteralInteger();
					public InputPin BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object = new InputPin();
						public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object_LiteralInteger122 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object_LiteralUnlimitedNatural123 = new LiteralUnlimitedNatural();
				public ControlFlow BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow124 = new ControlFlow();
				public ControlFlow BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow125 = new ControlFlow();
				public ReadSelfAction BehaviorPort_Signal_A_AClassifierBehavior_this = new ReadSelfAction();
					public OutputPin BehaviorPort_Signal_A_AClassifierBehavior_this_result = new OutputPin();
						public LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural126 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_this_result_LiteralInteger127 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128_LiteralInteger129 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128_LiteralBoolean130 = new LiteralBoolean();
				public ObjectFlow BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131_LiteralInteger132 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131_LiteralBoolean133 = new LiteralBoolean();
				public AcceptEventAction BehaviorPort_Signal_A_AClassifierBehavior_Accept_S = new AcceptEventAction();
					public OutputPin BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result = new OutputPin();
						public LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural134 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger135 = new LiteralInteger();
						public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger136 = new LiteralInteger();
					public Trigger BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_Trigger137 = new Trigger();
				public ReadStructuralFeatureAction BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v = new ReadStructuralFeatureAction();
					public OutputPin BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result = new OutputPin();
						public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result_LiteralInteger138 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result_LiteralUnlimitedNatural139 = new LiteralUnlimitedNatural();
					public InputPin BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object = new InputPin();
						public LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object_LiteralInteger140 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object_LiteralUnlimitedNatural141 = new LiteralUnlimitedNatural();
			public InterfaceRealization BehaviorPort_Signal_A_IRealization = new InterfaceRealization();
		public Comment BehaviorPort_Signal_Comment142 = new Comment();
		public PackageImport BehaviorPort_Signal_PackageImport143 = new PackageImport();
		public Comment BehaviorPort_Signal_Comment144 = new Comment();
		public SignalEvent BehaviorPort_Signal_SignalEventStart = new SignalEvent();
		public Class_ BehaviorPort_Signal_IImpl = new Class_();
			public Reception BehaviorPort_Signal_IImpl_S = new Reception();
			public InterfaceRealization BehaviorPort_Signal_IImpl_IRealization = new InterfaceRealization();
		public SignalEvent BehaviorPort_Signal_SignalEventS = new SignalEvent();
		public SignalEvent BehaviorPort_Signal_SignalEventContinue = new SignalEvent();

	public static BehaviorPort_SignalModel instance()
	{
		if (instance == null)
        {
            instance = new BehaviorPort_SignalModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public BehaviorPort_SignalModel()
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
		this.initializeGeneralization_Instances();
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
		this.initializeStartObjectBehaviorAction_Instances();
		this.initializeTrigger_Instances();
		this.initializeValueSpecificationAction_Instances();
	}

	private void initializeAcceptEventAction_Instances()
	{
		// AcceptEventAction BehaviorPort_Signal_Tester_TesterClassifierBehavior::Accept Start
		addToElementRepository("Accept Start", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start.setName("Accept Start");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start.addResult(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start.addTrigger(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger58);
		// AcceptEventAction BehaviorPort_Signal_Tester_TesterClassifierBehavior::Accept Continue
		addToElementRepository("Accept Continue", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue.setName("Accept Continue");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue.addResult(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue.addTrigger(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_Trigger72);
		// AcceptEventAction BehaviorPort_Signal_A_AClassifierBehavior::Accept S
		addToElementRepository("Accept S", BehaviorPort_Signal_A_AClassifierBehavior_Accept_S);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S.setName("Accept S");
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S.addResult(BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S.addTrigger(BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_Trigger137);
	}

	private void initializeActivity_Instances()
	{
		// Activity BehaviorPort_Signal::main
		addToElementRepository("main", BehaviorPort_Signal_main);
		BehaviorPort_Signal_main.setName("main");
		BehaviorPort_Signal_main.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main.addNode(BehaviorPort_Signal_main_Create_Tester);
		BehaviorPort_Signal_main.addNode(BehaviorPort_Signal_main_Fork_Tester);
		BehaviorPort_Signal_main.addNode(BehaviorPort_Signal_main_Send_Start);
		BehaviorPort_Signal_main.addNode(BehaviorPort_Signal_main_Tester_);
		BehaviorPort_Signal_main.addNode(BehaviorPort_Signal_main_Start_Tester);
		BehaviorPort_Signal_main.addEdge(BehaviorPort_Signal_main_ObjectFlow76);
		BehaviorPort_Signal_main.addEdge(BehaviorPort_Signal_main_ObjectFlow79);
		BehaviorPort_Signal_main.addEdge(BehaviorPort_Signal_main_ObjectFlow82);
		BehaviorPort_Signal_main.addEdge(BehaviorPort_Signal_main_ObjectFlow85);
		BehaviorPort_Signal_main.addEdge(BehaviorPort_Signal_main_ControlFlow90);
		// Activity BehaviorPort_Signal_Tester::testActivity
		addToElementRepository("testActivity", BehaviorPort_Signal_Tester_testActivity);
		BehaviorPort_Signal_Tester_testActivity.setName("testActivity");
		BehaviorPort_Signal_Tester_testActivity.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity.addOwnedBehavior(BehaviorPort_Signal_Tester_testActivity_testP);
		BehaviorPort_Signal_Tester_testActivity.addNode(BehaviorPort_Signal_Tester_testActivity_this);
		BehaviorPort_Signal_Tester_testActivity.addNode(BehaviorPort_Signal_Tester_testActivity_this_a);
		BehaviorPort_Signal_Tester_testActivity.addNode(BehaviorPort_Signal_Tester_testActivity_Call_testP);
		BehaviorPort_Signal_Tester_testActivity.addNode(BehaviorPort_Signal_Tester_testActivity_this_a_p);
		BehaviorPort_Signal_Tester_testActivity.addEdge(BehaviorPort_Signal_Tester_testActivity_ObjectFlow0);
		BehaviorPort_Signal_Tester_testActivity.addEdge(BehaviorPort_Signal_Tester_testActivity_ObjectFlow3);
		BehaviorPort_Signal_Tester_testActivity.addEdge(BehaviorPort_Signal_Tester_testActivity_ObjectFlow6);
		// Activity BehaviorPort_Signal_Tester::TesterClassifierBehavior
		addToElementRepository("TesterClassifierBehavior", BehaviorPort_Signal_Tester_TesterClassifierBehavior);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.setName("TesterClassifierBehavior");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addNode(BehaviorPort_Signal_Tester_TesterClassifierBehavior_this);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addNode(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addNode(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addNode(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addNode(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Fork_this);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addNode(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addNode(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addNode(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addNode(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Initial);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addNode(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addEdge(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addEdge(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addEdge(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addEdge(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow57);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addEdge(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addEdge(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addEdge(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow68);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addEdge(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addEdge(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow33);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior.addEdge(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34);
		// Activity BehaviorPort_Signal_A::AClassifierBehavior
		addToElementRepository("AClassifierBehavior", BehaviorPort_Signal_A_AClassifierBehavior);
		BehaviorPort_Signal_A_AClassifierBehavior.setName("AClassifierBehavior");
		BehaviorPort_Signal_A_AClassifierBehavior.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior.addNode(BehaviorPort_Signal_A_AClassifierBehavior_Fork_S);
		BehaviorPort_Signal_A_AClassifierBehavior.addNode(BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue);
		BehaviorPort_Signal_A_AClassifierBehavior.addNode(BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t);
		BehaviorPort_Signal_A_AClassifierBehavior.addNode(BehaviorPort_Signal_A_AClassifierBehavior_Initial);
		BehaviorPort_Signal_A_AClassifierBehavior.addNode(BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p);
		BehaviorPort_Signal_A_AClassifierBehavior.addNode(BehaviorPort_Signal_A_AClassifierBehavior_this);
		BehaviorPort_Signal_A_AClassifierBehavior.addNode(BehaviorPort_Signal_A_AClassifierBehavior_Accept_S);
		BehaviorPort_Signal_A_AClassifierBehavior.addNode(BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v);
		BehaviorPort_Signal_A_AClassifierBehavior.addEdge(BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114);
		BehaviorPort_Signal_A_AClassifierBehavior.addEdge(BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117);
		BehaviorPort_Signal_A_AClassifierBehavior.addEdge(BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow124);
		BehaviorPort_Signal_A_AClassifierBehavior.addEdge(BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow125);
		BehaviorPort_Signal_A_AClassifierBehavior.addEdge(BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128);
		BehaviorPort_Signal_A_AClassifierBehavior.addEdge(BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108);
		BehaviorPort_Signal_A_AClassifierBehavior.addEdge(BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131);
		BehaviorPort_Signal_A_AClassifierBehavior.addEdge(BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction BehaviorPort_Signal_A_AClassifierBehavior::Set this.p
		addToElementRepository("Set this.p", BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p.setName("Set this.p");
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p.setStructuralFeature(BehaviorPort_Signal_A_p);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p.setObject(BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p.setValue(BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p.setResult(BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction BehaviorPort_Signal_Tester_testActivity::Call testP
		addToElementRepository("Call testP", BehaviorPort_Signal_Tester_testActivity_Call_testP);
		BehaviorPort_Signal_Tester_testActivity_Call_testP.setName("Call testP");
		BehaviorPort_Signal_Tester_testActivity_Call_testP.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_Call_testP.setBehavior(BehaviorPort_Signal_Tester_testActivity_testP);
		BehaviorPort_Signal_Tester_testActivity_Call_testP.addArgument(BehaviorPort_Signal_Tester_testActivity_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction BehaviorPort_Signal_Tester_TesterClassifierBehavior::Call test()
		addToElementRepository("Call test()", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test_.setName("Call test()");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test_.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test_.setOperation(BehaviorPort_Signal_Tester_test);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test_.setTarget(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		// CallOperationAction BehaviorPort_Signal_main::Tester()
		addToElementRepository("Tester()", BehaviorPort_Signal_main_Tester_);
		BehaviorPort_Signal_main_Tester_.setName("Tester()");
		BehaviorPort_Signal_main_Tester_.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_main_Tester_.addResult(BehaviorPort_Signal_main_Tester__result);
		BehaviorPort_Signal_main_Tester_.setOperation(BehaviorPort_Signal_Tester_Tester_Tester);
		BehaviorPort_Signal_main_Tester_.setTarget(BehaviorPort_Signal_main_Tester__target);
	}

	private void initializeClass_Instances()
	{
		// Class BehaviorPort_Signal::Tester
		addToElementRepository("Tester", BehaviorPort_Signal_Tester);
		BehaviorPort_Signal_Tester.setName("Tester");
		BehaviorPort_Signal_Tester.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester.addGeneralization(BehaviorPort_Signal_Tester_Generalization22);
		BehaviorPort_Signal_Tester.addOwnedAttribute(BehaviorPort_Signal_Tester_a);
		BehaviorPort_Signal_Tester.setClassifierBehavior(BehaviorPort_Signal_Tester_TesterClassifierBehavior);
		BehaviorPort_Signal_Tester.addOwnedBehavior(BehaviorPort_Signal_Tester_testActivity);
		BehaviorPort_Signal_Tester.addOwnedBehavior(BehaviorPort_Signal_Tester_TesterClassifierBehavior);
		
		BehaviorPort_Signal_Tester.setIsActive(true);
		BehaviorPort_Signal_Tester.addOwnedOperation(BehaviorPort_Signal_Tester_Tester_Tester);
		BehaviorPort_Signal_Tester.addOwnedOperation(BehaviorPort_Signal_Tester_test);
		// Class BehaviorPort_Signal::IImpl
		addToElementRepository("IImpl", BehaviorPort_Signal_IImpl);
		BehaviorPort_Signal_IImpl.setName("IImpl");
		BehaviorPort_Signal_IImpl.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_IImpl.addInterfaceRealization(BehaviorPort_Signal_IImpl_IRealization);
		
		BehaviorPort_Signal_IImpl.addOwnedReception(BehaviorPort_Signal_IImpl_S);
		// Class BehaviorPort_Signal::AbstractTester
		addToElementRepository("AbstractTester", BehaviorPort_Signal_AbstractTester);
		BehaviorPort_Signal_AbstractTester.setName("AbstractTester");
		BehaviorPort_Signal_AbstractTester.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_AbstractTester.setIsAbstract(true);
		
		
		BehaviorPort_Signal_AbstractTester.setIsActive(true);
		BehaviorPort_Signal_AbstractTester.addOwnedOperation(BehaviorPort_Signal_AbstractTester_test);
		BehaviorPort_Signal_AbstractTester.addOwnedReception(BehaviorPort_Signal_AbstractTester_Continue);
		BehaviorPort_Signal_AbstractTester.addOwnedReception(BehaviorPort_Signal_AbstractTester_Start);
		// Class BehaviorPort_Signal::A
		addToElementRepository("A", BehaviorPort_Signal_A);
		BehaviorPort_Signal_A.setName("A");
		BehaviorPort_Signal_A.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_A.addOwnedAttribute(BehaviorPort_Signal_A_p);
		BehaviorPort_Signal_A.addOwnedAttribute(BehaviorPort_Signal_A_q);
		BehaviorPort_Signal_A.setClassifierBehavior(BehaviorPort_Signal_A_AClassifierBehavior);
		BehaviorPort_Signal_A.addOwnedBehavior(BehaviorPort_Signal_A_AClassifierBehavior);
		BehaviorPort_Signal_A.addInterfaceRealization(BehaviorPort_Signal_A_IRealization);
		
		BehaviorPort_Signal_A.setIsActive(true);
		BehaviorPort_Signal_A.addOwnedOperation(BehaviorPort_Signal_A_A_A);
		BehaviorPort_Signal_A.addOwnedReception(BehaviorPort_Signal_A_S);
	}

	private void initializeComment_Instances()
	{
		// Comment BehaviorPort_Signal::Comment142
		addToElementRepository("Comment142", BehaviorPort_Signal_Comment142);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment BehaviorPort_Signal::Comment144
		addToElementRepository("Comment144", BehaviorPort_Signal_Comment144);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow BehaviorPort_Signal_A_AClassifierBehavior::ControlFlow124
		addToElementRepository("ControlFlow124", BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow124);
		BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow124.setName("ControlFlow124");
		BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow124.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow124.setSource(BehaviorPort_Signal_A_AClassifierBehavior_Initial);
		BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow124.setTarget(BehaviorPort_Signal_A_AClassifierBehavior_Accept_S);
		// ControlFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior::ControlFlow57
		addToElementRepository("ControlFlow57", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow57);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow57.setName("ControlFlow57");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow57.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow57.setSource(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Initial);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow57.setTarget(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		// ControlFlow BehaviorPort_Signal_A_AClassifierBehavior::ControlFlow125
		addToElementRepository("ControlFlow125", BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow125);
		BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow125.setName("ControlFlow125");
		BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow125.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow125.setSource(BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p);
		BehaviorPort_Signal_A_AClassifierBehavior_ControlFlow125.setTarget(BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t);
		// ControlFlow BehaviorPort_Signal_main::ControlFlow90
		addToElementRepository("ControlFlow90", BehaviorPort_Signal_main_ControlFlow90);
		BehaviorPort_Signal_main_ControlFlow90.setName("ControlFlow90");
		BehaviorPort_Signal_main_ControlFlow90.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_main_ControlFlow90.setSource(BehaviorPort_Signal_main_Start_Tester);
		BehaviorPort_Signal_main_ControlFlow90.setTarget(BehaviorPort_Signal_main_Send_Start);
		// ControlFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior::ControlFlow68
		addToElementRepository("ControlFlow68", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow68);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow68.setName("ControlFlow68");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow68.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow68.setSource(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow68.setTarget(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test_);
		// ControlFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior::ControlFlow33
		addToElementRepository("ControlFlow33", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow33);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow33.setName("ControlFlow33");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow33.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow33.setSource(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ControlFlow33.setTarget(BehaviorPort_Signal_Tester_TesterClassifierBehavior_this);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction BehaviorPort_Signal_main::Create Tester
		addToElementRepository("Create Tester", BehaviorPort_Signal_main_Create_Tester);
		BehaviorPort_Signal_main_Create_Tester.setName("Create Tester");
		BehaviorPort_Signal_main_Create_Tester.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Create_Tester.setClassifier(BehaviorPort_Signal_Tester);
		BehaviorPort_Signal_main_Create_Tester.setResult(BehaviorPort_Signal_main_Create_Tester_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode BehaviorPort_Signal_A_AClassifierBehavior::Fork S
		addToElementRepository("Fork S", BehaviorPort_Signal_A_AClassifierBehavior_Fork_S);
		BehaviorPort_Signal_A_AClassifierBehavior_Fork_S.setName("Fork S");
		BehaviorPort_Signal_A_AClassifierBehavior_Fork_S.setVisibility(VisibilityKind.public_);
		// ForkNode BehaviorPort_Signal_main::Fork Tester
		addToElementRepository("Fork Tester", BehaviorPort_Signal_main_Fork_Tester);
		BehaviorPort_Signal_main_Fork_Tester.setName("Fork Tester");
		BehaviorPort_Signal_main_Fork_Tester.setVisibility(VisibilityKind.public_);
		// ForkNode BehaviorPort_Signal_Tester_TesterClassifierBehavior::Fork this
		addToElementRepository("Fork this", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Fork_this);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Fork_this.setName("Fork this");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Fork_this.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior BehaviorPort_Signal_Tester_testActivity::testP
		addToElementRepository("testP", BehaviorPort_Signal_Tester_testActivity_testP);
		BehaviorPort_Signal_Tester_testActivity_testP.setName("testP");
		BehaviorPort_Signal_Tester_testActivity_testP.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_testActivity_testP.addOwnedParameter(BehaviorPort_Signal_Tester_testActivity_testP_p);
		BehaviorPort_Signal_Tester_testActivity_testP.addLanguage("Java");
		BehaviorPort_Signal_Tester_testActivity_testP.addLanguage("Import");
		BehaviorPort_Signal_Tester_testActivity_testP.addBody("System.out.println(\"Asserting a.p == 4\");  	// Test parameter p 	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument p = \" + p); 	 	System.out.println(\"a.p == \" + p); 	System.out.print(\"Signal delegated to classifier behavior: \");  	if(p == 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		BehaviorPort_Signal_Tester_testActivity_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeGeneralization_Instances()
	{
		// Generalization BehaviorPort_Signal_Tester::Generalization22
		addToElementRepository("Generalization22", BehaviorPort_Signal_Tester_Generalization22);
		BehaviorPort_Signal_Tester_Generalization22.setGeneral(BehaviorPort_Signal_AbstractTester);
	}

	private void initializeInitialNode_Instances()
	{
		// InitialNode BehaviorPort_Signal_A_AClassifierBehavior::Initial
		addToElementRepository("Initial", BehaviorPort_Signal_A_AClassifierBehavior_Initial);
		BehaviorPort_Signal_A_AClassifierBehavior_Initial.setName("Initial");
		BehaviorPort_Signal_A_AClassifierBehavior_Initial.setVisibility(VisibilityKind.public_);
		// InitialNode BehaviorPort_Signal_Tester_TesterClassifierBehavior::Initial
		addToElementRepository("Initial", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Initial);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Initial.setName("Initial");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Initial.setVisibility(VisibilityKind.public_);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin BehaviorPort_Signal_Tester_testActivity_this.a.p::object
		addToElementRepository("object", BehaviorPort_Signal_Tester_testActivity_this_a_p_object);
		BehaviorPort_Signal_Tester_testActivity_this_a_p_object.setName("object");
		BehaviorPort_Signal_Tester_testActivity_this_a_p_object.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_p_object.setType(BehaviorPort_Signal_A);
		// InputPin BehaviorPort_Signal_main_Send Start::target
		addToElementRepository("target", BehaviorPort_Signal_main_Send_Start_target);
		BehaviorPort_Signal_main_Send_Start_target.setName("target");
		BehaviorPort_Signal_main_Send_Start_target.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Send_Start_target.setType(BehaviorPort_Signal_Tester);
		BehaviorPort_Signal_main_Send_Start_target.setIsOrdered(true);
		BehaviorPort_Signal_main_Send_Start_target.setIsUnique(false);
		// InputPin BehaviorPort_Signal_A_AClassifierBehavior_Send Continue::target
		addToElementRepository("target", BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target);
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target.setName("target");
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target.setType(BehaviorPort_Signal_AbstractTester);
		// InputPin BehaviorPort_Signal_A_AClassifierBehavior_Read S::t::object
		addToElementRepository("object", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object.setName("object");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object.setVisibility(VisibilityKind.public_);
		// InputPin BehaviorPort_Signal_A_AClassifierBehavior_Set this.p::value
		addToElementRepository("value", BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value.setName("value");
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin BehaviorPort_Signal_Tester_testActivity_this.a::object
		addToElementRepository("object", BehaviorPort_Signal_Tester_testActivity_this_a_object);
		BehaviorPort_Signal_Tester_testActivity_this_a_object.setName("object");
		BehaviorPort_Signal_Tester_testActivity_this_a_object.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_object.setType(BehaviorPort_Signal_Tester);
		// InputPin BehaviorPort_Signal_main_Tester()::target
		addToElementRepository("target", BehaviorPort_Signal_main_Tester__target);
		BehaviorPort_Signal_main_Tester__target.setName("target");
		BehaviorPort_Signal_main_Tester__target.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Tester__target.setType(BehaviorPort_Signal_Tester);
		// InputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send S::t
		addToElementRepository("t", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t.setName("t");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t.setType(BehaviorPort_Signal_AbstractTester);
		// InputPin BehaviorPort_Signal_A_AClassifierBehavior_Read S::v::object
		addToElementRepository("object", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object.setName("object");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object.setVisibility(VisibilityKind.public_);
		// InputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read this.a::object
		addToElementRepository("object", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object.setName("object");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object.setType(BehaviorPort_Signal_Tester);
		// InputPin BehaviorPort_Signal_main_Start Tester::object
		addToElementRepository("object", BehaviorPort_Signal_main_Start_Tester_object);
		BehaviorPort_Signal_main_Start_Tester_object.setName("object");
		BehaviorPort_Signal_main_Start_Tester_object.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Start_Tester_object.setType(BehaviorPort_Signal_Tester);
		BehaviorPort_Signal_main_Start_Tester_object.setIsOrdered(true);
		BehaviorPort_Signal_main_Start_Tester_object.setIsUnique(false);
		// InputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read this.a.q::object
		addToElementRepository("object", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object.setName("object");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object.setType(BehaviorPort_Signal_A);
		// InputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send S::target
		addToElementRepository("target", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target.setName("target");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target.setType(BehaviorPort_Signal_IImpl);
		// InputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call test()::target
		addToElementRepository("target", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target.setName("target");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target.setType(BehaviorPort_Signal_Tester);
		// InputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send S::v
		addToElementRepository("v", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v.setName("v");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin BehaviorPort_Signal_A_AClassifierBehavior_Set this.p::object
		addToElementRepository("object", BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object.setName("object");
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object.setType(BehaviorPort_Signal_A);
		// InputPin BehaviorPort_Signal_Tester_testActivity_Call testP::p
		addToElementRepository("p", BehaviorPort_Signal_Tester_testActivity_Call_testP_p);
		BehaviorPort_Signal_Tester_testActivity_Call_testP_p.setName("p");
		BehaviorPort_Signal_Tester_testActivity_Call_testP_p.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeInterface_Instances()
	{
		// Interface BehaviorPort_Signal::I
		addToElementRepository("I", BehaviorPort_Signal_I);
		BehaviorPort_Signal_I.setName("I");
		BehaviorPort_Signal_I.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_I.addOwnedReception(BehaviorPort_Signal_I_S);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization BehaviorPort_Signal_IImpl::IRealization
		addToElementRepository("IRealization", BehaviorPort_Signal_IImpl_IRealization);
		BehaviorPort_Signal_IImpl_IRealization.setName("IRealization");
		BehaviorPort_Signal_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_IImpl_IRealization.setContract(BehaviorPort_Signal_I);
		// InterfaceRealization BehaviorPort_Signal_A::IRealization
		addToElementRepository("IRealization", BehaviorPort_Signal_A_IRealization);
		BehaviorPort_Signal_A_IRealization.setName("IRealization");
		BehaviorPort_Signal_A_IRealization.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_IRealization.setContract(BehaviorPort_Signal_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean BehaviorPort_Signal_Tester_testActivity_ObjectFlow6::LiteralBoolean8
		addToElementRepository("LiteralBoolean8", BehaviorPort_Signal_Tester_testActivity_ObjectFlow6_LiteralBoolean8);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow6_LiteralBoolean8.setName("LiteralBoolean8");
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow6_LiteralBoolean8.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow6_LiteralBoolean8.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25::LiteralBoolean26
		addToElementRepository("LiteralBoolean26", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25_LiteralBoolean26);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25_LiteralBoolean26.setName("LiteralBoolean26");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25_LiteralBoolean26.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25_LiteralBoolean26.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108::LiteralBoolean109
		addToElementRepository("LiteralBoolean109", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108_LiteralBoolean109);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108_LiteralBoolean109.setName("LiteralBoolean109");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108_LiteralBoolean109.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108_LiteralBoolean109.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111::LiteralBoolean112
		addToElementRepository("LiteralBoolean112", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111_LiteralBoolean112);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111_LiteralBoolean112.setName("LiteralBoolean112");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111_LiteralBoolean112.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111_LiteralBoolean112.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34::LiteralBoolean35
		addToElementRepository("LiteralBoolean35", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralBoolean35);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralBoolean35.setName("LiteralBoolean35");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralBoolean35.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralBoolean35.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_main_ObjectFlow85::LiteralBoolean87
		addToElementRepository("LiteralBoolean87", BehaviorPort_Signal_main_ObjectFlow85_LiteralBoolean87);
		BehaviorPort_Signal_main_ObjectFlow85_LiteralBoolean87.setName("LiteralBoolean87");
		BehaviorPort_Signal_main_ObjectFlow85_LiteralBoolean87.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_ObjectFlow85_LiteralBoolean87.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117::LiteralBoolean119
		addToElementRepository("LiteralBoolean119", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117_LiteralBoolean119);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117_LiteralBoolean119.setName("LiteralBoolean119");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117_LiteralBoolean119.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117_LiteralBoolean119.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131::LiteralBoolean133
		addToElementRepository("LiteralBoolean133", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131_LiteralBoolean133);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131_LiteralBoolean133.setName("LiteralBoolean133");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131_LiteralBoolean133.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131_LiteralBoolean133.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_main_ObjectFlow76::LiteralBoolean78
		addToElementRepository("LiteralBoolean78", BehaviorPort_Signal_main_ObjectFlow76_LiteralBoolean78);
		BehaviorPort_Signal_main_ObjectFlow76_LiteralBoolean78.setName("LiteralBoolean78");
		BehaviorPort_Signal_main_ObjectFlow76_LiteralBoolean78.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_ObjectFlow76_LiteralBoolean78.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_Tester_testActivity_ObjectFlow0::LiteralBoolean1
		addToElementRepository("LiteralBoolean1", BehaviorPort_Signal_Tester_testActivity_ObjectFlow0_LiteralBoolean1);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow0_LiteralBoolean1.setName("LiteralBoolean1");
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow0_LiteralBoolean1.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow0_LiteralBoolean1.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62::LiteralBoolean63
		addToElementRepository("LiteralBoolean63", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralBoolean63);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralBoolean63.setName("LiteralBoolean63");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralBoolean63.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralBoolean63.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_Tester_testActivity_ObjectFlow3::LiteralBoolean5
		addToElementRepository("LiteralBoolean5", BehaviorPort_Signal_Tester_testActivity_ObjectFlow3_LiteralBoolean5);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow3_LiteralBoolean5.setName("LiteralBoolean5");
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow3_LiteralBoolean5.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow3_LiteralBoolean5.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114::LiteralBoolean116
		addToElementRepository("LiteralBoolean116", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114_LiteralBoolean116);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114_LiteralBoolean116.setName("LiteralBoolean116");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114_LiteralBoolean116.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114_LiteralBoolean116.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28::LiteralBoolean30
		addToElementRepository("LiteralBoolean30", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28_LiteralBoolean30);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28_LiteralBoolean30.setName("LiteralBoolean30");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28_LiteralBoolean30.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28_LiteralBoolean30.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_main_ObjectFlow79::LiteralBoolean80
		addToElementRepository("LiteralBoolean80", BehaviorPort_Signal_main_ObjectFlow79_LiteralBoolean80);
		BehaviorPort_Signal_main_ObjectFlow79_LiteralBoolean80.setName("LiteralBoolean80");
		BehaviorPort_Signal_main_ObjectFlow79_LiteralBoolean80.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_ObjectFlow79_LiteralBoolean80.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54::LiteralBoolean56
		addToElementRepository("LiteralBoolean56", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralBoolean56);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralBoolean56.setName("LiteralBoolean56");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralBoolean56.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralBoolean56.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_main_ObjectFlow82::LiteralBoolean84
		addToElementRepository("LiteralBoolean84", BehaviorPort_Signal_main_ObjectFlow82_LiteralBoolean84);
		BehaviorPort_Signal_main_ObjectFlow82_LiteralBoolean84.setName("LiteralBoolean84");
		BehaviorPort_Signal_main_ObjectFlow82_LiteralBoolean84.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_ObjectFlow82_LiteralBoolean84.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43::LiteralBoolean45
		addToElementRepository("LiteralBoolean45", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43_LiteralBoolean45);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43_LiteralBoolean45.setName("LiteralBoolean45");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43_LiteralBoolean45.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43_LiteralBoolean45.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128::LiteralBoolean130
		addToElementRepository("LiteralBoolean130", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128_LiteralBoolean130);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128_LiteralBoolean130.setName("LiteralBoolean130");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128_LiteralBoolean130.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128_LiteralBoolean130.setValue(true);
		// LiteralBoolean BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65::LiteralBoolean67
		addToElementRepository("LiteralBoolean67", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65_LiteralBoolean67);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65_LiteralBoolean67.setName("LiteralBoolean67");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65_LiteralBoolean67.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65_LiteralBoolean67.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger BehaviorPort_Signal_main_ObjectFlow85::LiteralInteger86
		addToElementRepository("LiteralInteger86", BehaviorPort_Signal_main_ObjectFlow85_LiteralInteger86);
		BehaviorPort_Signal_main_ObjectFlow85_LiteralInteger86.setName("LiteralInteger86");
		BehaviorPort_Signal_main_ObjectFlow85_LiteralInteger86.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_ObjectFlow85_LiteralInteger86.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34::LiteralInteger36
		addToElementRepository("LiteralInteger36", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralInteger36);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralInteger36.setName("LiteralInteger36");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralInteger36.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralInteger36.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_testActivity_Call testP_p::LiteralInteger17
		addToElementRepository("LiteralInteger17", BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralInteger17);
		BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralInteger17.setName("LiteralInteger17");
		BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralInteger17.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralInteger17.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send S_v::LiteralInteger39
		addToElementRepository("LiteralInteger39", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger39);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger39.setName("LiteralInteger39");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger39.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger39.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128::LiteralInteger129
		addToElementRepository("LiteralInteger129", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128_LiteralInteger129);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128_LiteralInteger129.setName("LiteralInteger129");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128_LiteralInteger129.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128_LiteralInteger129.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_testActivity_this.a.p_result::LiteralInteger20
		addToElementRepository("LiteralInteger20", BehaviorPort_Signal_Tester_testActivity_this_a_p_result_LiteralInteger20);
		BehaviorPort_Signal_Tester_testActivity_this_a_p_result_LiteralInteger20.setName("LiteralInteger20");
		BehaviorPort_Signal_Tester_testActivity_this_a_p_result_LiteralInteger20.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_p_result_LiteralInteger20.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Read S::t_result::LiteralInteger121
		addToElementRepository("LiteralInteger121", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result_LiteralInteger121);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result_LiteralInteger121.setName("LiteralInteger121");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result_LiteralInteger121.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result_LiteralInteger121.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send S_target::LiteralInteger38
		addToElementRepository("LiteralInteger38", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger38);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger38.setName("LiteralInteger38");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger38.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger38.setValue(1);
		// LiteralInteger BehaviorPort_Signal_main_Start Tester_object::LiteralInteger98
		addToElementRepository("LiteralInteger98", BehaviorPort_Signal_main_Start_Tester_object_LiteralInteger98);
		BehaviorPort_Signal_main_Start_Tester_object_LiteralInteger98.setName("LiteralInteger98");
		BehaviorPort_Signal_main_Start_Tester_object_LiteralInteger98.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Start_Tester_object_LiteralInteger98.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Send Continue_target::LiteralInteger101
		addToElementRepository("LiteralInteger101", BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target_LiteralInteger101);
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target_LiteralInteger101.setName("LiteralInteger101");
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target_LiteralInteger101.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target_LiteralInteger101.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Accept S_result::LiteralInteger135
		addToElementRepository("LiteralInteger135", BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger135);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger135.setName("LiteralInteger135");
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger135.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger135.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_testActivity_this_result::LiteralInteger10
		addToElementRepository("LiteralInteger10", BehaviorPort_Signal_Tester_testActivity_this_result_LiteralInteger10);
		BehaviorPort_Signal_Tester_testActivity_this_result_LiteralInteger10.setName("LiteralInteger10");
		BehaviorPort_Signal_Tester_testActivity_this_result_LiteralInteger10.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_result_LiteralInteger10.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Set this.p_value::LiteralInteger104
		addToElementRepository("LiteralInteger104", BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralInteger104);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralInteger104.setName("LiteralInteger104");
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralInteger104.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralInteger104.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_testActivity_this.a_object::LiteralInteger11
		addToElementRepository("LiteralInteger11", BehaviorPort_Signal_Tester_testActivity_this_a_object_LiteralInteger11);
		BehaviorPort_Signal_Tester_testActivity_this_a_object_LiteralInteger11.setName("LiteralInteger11");
		BehaviorPort_Signal_Tester_testActivity_this_a_object_LiteralInteger11.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_object_LiteralInteger11.setValue(1);
		// LiteralInteger BehaviorPort_Signal_main_Create Tester_result::LiteralInteger89
		addToElementRepository("LiteralInteger89", BehaviorPort_Signal_main_Create_Tester_result_LiteralInteger89);
		BehaviorPort_Signal_main_Create_Tester_result_LiteralInteger89.setName("LiteralInteger89");
		BehaviorPort_Signal_main_Create_Tester_result_LiteralInteger89.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Create_Tester_result_LiteralInteger89.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Read S::t_object::LiteralInteger122
		addToElementRepository("LiteralInteger122", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object_LiteralInteger122);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object_LiteralInteger122.setName("LiteralInteger122");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object_LiteralInteger122.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object_LiteralInteger122.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read this.a_result::LiteralInteger48
		addToElementRepository("LiteralInteger48", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger48);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger48.setName("LiteralInteger48");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger48.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger48.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111::LiteralInteger113
		addToElementRepository("LiteralInteger113", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111_LiteralInteger113);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111_LiteralInteger113.setName("LiteralInteger113");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111_LiteralInteger113.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111_LiteralInteger113.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43::LiteralInteger44
		addToElementRepository("LiteralInteger44", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43_LiteralInteger44);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43_LiteralInteger44.setName("LiteralInteger44");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43_LiteralInteger44.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43_LiteralInteger44.setValue(1);
		// LiteralInteger BehaviorPort_Signal_main_Tester()_target::LiteralInteger97
		addToElementRepository("LiteralInteger97", BehaviorPort_Signal_main_Tester__target_LiteralInteger97);
		BehaviorPort_Signal_main_Tester__target_LiteralInteger97.setName("LiteralInteger97");
		BehaviorPort_Signal_main_Tester__target_LiteralInteger97.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Tester__target_LiteralInteger97.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Set this.p_object::LiteralInteger107
		addToElementRepository("LiteralInteger107", BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralInteger107);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralInteger107.setName("LiteralInteger107");
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralInteger107.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralInteger107.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_testActivity_ObjectFlow6::LiteralInteger7
		addToElementRepository("LiteralInteger7", BehaviorPort_Signal_Tester_testActivity_ObjectFlow6_LiteralInteger7);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow6_LiteralInteger7.setName("LiteralInteger7");
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow6_LiteralInteger7.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow6_LiteralInteger7.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value 4::LiteralInteger73
		addToElementRepository("LiteralInteger73", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger73);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger73.setName("LiteralInteger73");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger73.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger73.setValue(4);
		// LiteralInteger BehaviorPort_Signal_Tester_testActivity_this.a_result::LiteralInteger13
		addToElementRepository("LiteralInteger13", BehaviorPort_Signal_Tester_testActivity_this_a_result_LiteralInteger13);
		BehaviorPort_Signal_Tester_testActivity_this_a_result_LiteralInteger13.setName("LiteralInteger13");
		BehaviorPort_Signal_Tester_testActivity_this_a_result_LiteralInteger13.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_result_LiteralInteger13.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralInteger59
		addToElementRepository("LiteralInteger59", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger59);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger59.setName("LiteralInteger59");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger59.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger59.setValue(1);
		// LiteralInteger BehaviorPort_Signal_main_Tester()_result::LiteralInteger93
		addToElementRepository("LiteralInteger93", BehaviorPort_Signal_main_Tester__result_LiteralInteger93);
		BehaviorPort_Signal_main_Tester__result_LiteralInteger93.setName("LiteralInteger93");
		BehaviorPort_Signal_main_Tester__result_LiteralInteger93.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Tester__result_LiteralInteger93.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108::LiteralInteger110
		addToElementRepository("LiteralInteger110", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108_LiteralInteger110);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108_LiteralInteger110.setName("LiteralInteger110");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108_LiteralInteger110.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108_LiteralInteger110.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Read S::v_result::LiteralInteger138
		addToElementRepository("LiteralInteger138", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result_LiteralInteger138);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result_LiteralInteger138.setName("LiteralInteger138");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result_LiteralInteger138.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result_LiteralInteger138.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_testActivity_this.a.p_object::LiteralInteger18
		addToElementRepository("LiteralInteger18", BehaviorPort_Signal_Tester_testActivity_this_a_p_object_LiteralInteger18);
		BehaviorPort_Signal_Tester_testActivity_this_a_p_object_LiteralInteger18.setName("LiteralInteger18");
		BehaviorPort_Signal_Tester_testActivity_this_a_p_object_LiteralInteger18.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_p_object_LiteralInteger18.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114::LiteralInteger115
		addToElementRepository("LiteralInteger115", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114_LiteralInteger115);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114_LiteralInteger115.setName("LiteralInteger115");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114_LiteralInteger115.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114_LiteralInteger115.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25::LiteralInteger27
		addToElementRepository("LiteralInteger27", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25_LiteralInteger27);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25_LiteralInteger27.setName("LiteralInteger27");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25_LiteralInteger27.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25_LiteralInteger27.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read this.a.q_object::LiteralInteger50
		addToElementRepository("LiteralInteger50", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object_LiteralInteger50);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object_LiteralInteger50.setName("LiteralInteger50");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object_LiteralInteger50.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object_LiteralInteger50.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Set this.p_result::LiteralInteger103
		addToElementRepository("LiteralInteger103", BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralInteger103);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralInteger103.setName("LiteralInteger103");
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralInteger103.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralInteger103.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send S_t::LiteralInteger41
		addToElementRepository("LiteralInteger41", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger41);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger41.setName("LiteralInteger41");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger41.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger41.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value 4_result::LiteralInteger75
		addToElementRepository("LiteralInteger75", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger75);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger75.setName("LiteralInteger75");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger75.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger75.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_testActivity_ObjectFlow0::LiteralInteger2
		addToElementRepository("LiteralInteger2", BehaviorPort_Signal_Tester_testActivity_ObjectFlow0_LiteralInteger2);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow0_LiteralInteger2.setName("LiteralInteger2");
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow0_LiteralInteger2.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow0_LiteralInteger2.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept Continue_result::LiteralInteger71
		addToElementRepository("LiteralInteger71", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger71);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger71.setName("LiteralInteger71");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger71.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger71.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read this.a_object::LiteralInteger47
		addToElementRepository("LiteralInteger47", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger47);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger47.setName("LiteralInteger47");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger47.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger47.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65::LiteralInteger66
		addToElementRepository("LiteralInteger66", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65_LiteralInteger66);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65_LiteralInteger66.setName("LiteralInteger66");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65_LiteralInteger66.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65_LiteralInteger66.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_testActivity_ObjectFlow3::LiteralInteger4
		addToElementRepository("LiteralInteger4", BehaviorPort_Signal_Tester_testActivity_ObjectFlow3_LiteralInteger4);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow3_LiteralInteger4.setName("LiteralInteger4");
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow3_LiteralInteger4.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow3_LiteralInteger4.setValue(1);
		// LiteralInteger BehaviorPort_Signal_main_ObjectFlow82::LiteralInteger83
		addToElementRepository("LiteralInteger83", BehaviorPort_Signal_main_ObjectFlow82_LiteralInteger83);
		BehaviorPort_Signal_main_ObjectFlow82_LiteralInteger83.setName("LiteralInteger83");
		BehaviorPort_Signal_main_ObjectFlow82_LiteralInteger83.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_ObjectFlow82_LiteralInteger83.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralInteger60
		addToElementRepository("LiteralInteger60", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger60);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger60.setName("LiteralInteger60");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger60.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger60.setValue(1);
		// LiteralInteger BehaviorPort_Signal_main_ObjectFlow79::LiteralInteger81
		addToElementRepository("LiteralInteger81", BehaviorPort_Signal_main_ObjectFlow79_LiteralInteger81);
		BehaviorPort_Signal_main_ObjectFlow79_LiteralInteger81.setName("LiteralInteger81");
		BehaviorPort_Signal_main_ObjectFlow79_LiteralInteger81.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_ObjectFlow79_LiteralInteger81.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_this_result::LiteralInteger127
		addToElementRepository("LiteralInteger127", BehaviorPort_Signal_A_AClassifierBehavior_this_result_LiteralInteger127);
		BehaviorPort_Signal_A_AClassifierBehavior_this_result_LiteralInteger127.setName("LiteralInteger127");
		BehaviorPort_Signal_A_AClassifierBehavior_this_result_LiteralInteger127.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_this_result_LiteralInteger127.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_testActivity_Call testP_p::LiteralInteger15
		addToElementRepository("LiteralInteger15", BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralInteger15);
		BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralInteger15.setName("LiteralInteger15");
		BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralInteger15.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralInteger15.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Read S::v_object::LiteralInteger140
		addToElementRepository("LiteralInteger140", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object_LiteralInteger140);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object_LiteralInteger140.setName("LiteralInteger140");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object_LiteralInteger140.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object_LiteralInteger140.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call test()_target::LiteralInteger31
		addToElementRepository("LiteralInteger31", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger31);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger31.setName("LiteralInteger31");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger31.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger31.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131::LiteralInteger132
		addToElementRepository("LiteralInteger132", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131_LiteralInteger132);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131_LiteralInteger132.setName("LiteralInteger132");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131_LiteralInteger132.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131_LiteralInteger132.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62::LiteralInteger64
		addToElementRepository("LiteralInteger64", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralInteger64);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralInteger64.setName("LiteralInteger64");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralInteger64.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralInteger64.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54::LiteralInteger55
		addToElementRepository("LiteralInteger55", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralInteger55);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralInteger55.setName("LiteralInteger55");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralInteger55.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralInteger55.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read this.a.q_result::LiteralInteger53
		addToElementRepository("LiteralInteger53", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result_LiteralInteger53);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result_LiteralInteger53.setName("LiteralInteger53");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result_LiteralInteger53.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result_LiteralInteger53.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result::LiteralInteger23
		addToElementRepository("LiteralInteger23", BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger23);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger23.setName("LiteralInteger23");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger23.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger23.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117::LiteralInteger118
		addToElementRepository("LiteralInteger118", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117_LiteralInteger118);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117_LiteralInteger118.setName("LiteralInteger118");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117_LiteralInteger118.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117_LiteralInteger118.setValue(1);
		// LiteralInteger BehaviorPort_Signal_main_ObjectFlow76::LiteralInteger77
		addToElementRepository("LiteralInteger77", BehaviorPort_Signal_main_ObjectFlow76_LiteralInteger77);
		BehaviorPort_Signal_main_ObjectFlow76_LiteralInteger77.setName("LiteralInteger77");
		BehaviorPort_Signal_main_ObjectFlow76_LiteralInteger77.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_ObjectFlow76_LiteralInteger77.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28::LiteralInteger29
		addToElementRepository("LiteralInteger29", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28_LiteralInteger29);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28_LiteralInteger29.setName("LiteralInteger29");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28_LiteralInteger29.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28_LiteralInteger29.setValue(1);
		// LiteralInteger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept Continue_result::LiteralInteger70
		addToElementRepository("LiteralInteger70", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger70);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger70.setName("LiteralInteger70");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger70.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger70.setValue(1);
		// LiteralInteger BehaviorPort_Signal_A_AClassifierBehavior_Accept S_result::LiteralInteger136
		addToElementRepository("LiteralInteger136", BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger136);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger136.setName("LiteralInteger136");
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger136.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralInteger136.setValue(1);
		// LiteralInteger BehaviorPort_Signal_main_Tester()_result::LiteralInteger95
		addToElementRepository("LiteralInteger95", BehaviorPort_Signal_main_Tester__result_LiteralInteger95);
		BehaviorPort_Signal_main_Tester__result_LiteralInteger95.setName("LiteralInteger95");
		BehaviorPort_Signal_main_Tester__result_LiteralInteger95.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Tester__result_LiteralInteger95.setValue(1);
		// LiteralInteger BehaviorPort_Signal_main_Send Start_target::LiteralInteger92
		addToElementRepository("LiteralInteger92", BehaviorPort_Signal_main_Send_Start_target_LiteralInteger92);
		BehaviorPort_Signal_main_Send_Start_target_LiteralInteger92.setName("LiteralInteger92");
		BehaviorPort_Signal_main_Send_Start_target_LiteralInteger92.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Send_Start_target_LiteralInteger92.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Accept S_result::LiteralUnlimitedNatural134
		addToElementRepository("LiteralUnlimitedNatural134", BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural134);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural134.setName("LiteralUnlimitedNatural134");
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural134.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural134.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send S_target::LiteralUnlimitedNatural37
		addToElementRepository("LiteralUnlimitedNatural37", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural37);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural37.setName("LiteralUnlimitedNatural37");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural37.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural37.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value 4_result::LiteralUnlimitedNatural74
		addToElementRepository("LiteralUnlimitedNatural74", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural74);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural74.setName("LiteralUnlimitedNatural74");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural74.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural74.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Set this.p_result::LiteralUnlimitedNatural102
		addToElementRepository("LiteralUnlimitedNatural102", BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural102);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural102.setName("LiteralUnlimitedNatural102");
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural102.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural102.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send S_t::LiteralUnlimitedNatural42
		addToElementRepository("LiteralUnlimitedNatural42", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural42);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural42.setName("LiteralUnlimitedNatural42");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural42.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural42.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call test()_target::LiteralUnlimitedNatural32
		addToElementRepository("LiteralUnlimitedNatural32", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural32);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural32.setName("LiteralUnlimitedNatural32");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural32.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural32.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_testActivity_this.a_result::LiteralUnlimitedNatural14
		addToElementRepository("LiteralUnlimitedNatural14", BehaviorPort_Signal_Tester_testActivity_this_a_result_LiteralUnlimitedNatural14);
		BehaviorPort_Signal_Tester_testActivity_this_a_result_LiteralUnlimitedNatural14.setName("LiteralUnlimitedNatural14");
		BehaviorPort_Signal_Tester_testActivity_this_a_result_LiteralUnlimitedNatural14.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_result_LiteralUnlimitedNatural14.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Send Continue_target::LiteralUnlimitedNatural100
		addToElementRepository("LiteralUnlimitedNatural100", BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural100);
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural100.setName("LiteralUnlimitedNatural100");
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural100.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural100.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_main_Create Tester_result::LiteralUnlimitedNatural88
		addToElementRepository("LiteralUnlimitedNatural88", BehaviorPort_Signal_main_Create_Tester_result_LiteralUnlimitedNatural88);
		BehaviorPort_Signal_main_Create_Tester_result_LiteralUnlimitedNatural88.setName("LiteralUnlimitedNatural88");
		BehaviorPort_Signal_main_Create_Tester_result_LiteralUnlimitedNatural88.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Create_Tester_result_LiteralUnlimitedNatural88.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept Continue_result::LiteralUnlimitedNatural69
		addToElementRepository("LiteralUnlimitedNatural69", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural69);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural69.setName("LiteralUnlimitedNatural69");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural69.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural69.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Read S::v_object::LiteralUnlimitedNatural141
		addToElementRepository("LiteralUnlimitedNatural141", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object_LiteralUnlimitedNatural141);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object_LiteralUnlimitedNatural141.setName("LiteralUnlimitedNatural141");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object_LiteralUnlimitedNatural141.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object_LiteralUnlimitedNatural141.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read this.a_object::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural46);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural46.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_testActivity_this.a_object::LiteralUnlimitedNatural12
		addToElementRepository("LiteralUnlimitedNatural12", BehaviorPort_Signal_Tester_testActivity_this_a_object_LiteralUnlimitedNatural12);
		BehaviorPort_Signal_Tester_testActivity_this_a_object_LiteralUnlimitedNatural12.setName("LiteralUnlimitedNatural12");
		BehaviorPort_Signal_Tester_testActivity_this_a_object_LiteralUnlimitedNatural12.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_object_LiteralUnlimitedNatural12.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Read S::v_result::LiteralUnlimitedNatural139
		addToElementRepository("LiteralUnlimitedNatural139", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result_LiteralUnlimitedNatural139);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result_LiteralUnlimitedNatural139.setName("LiteralUnlimitedNatural139");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result_LiteralUnlimitedNatural139.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result_LiteralUnlimitedNatural139.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read this.a_result::LiteralUnlimitedNatural49
		addToElementRepository("LiteralUnlimitedNatural49", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural49);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural49.setName("LiteralUnlimitedNatural49");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural49.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural49.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_testActivity_this.a.p_result::LiteralUnlimitedNatural21
		addToElementRepository("LiteralUnlimitedNatural21", BehaviorPort_Signal_Tester_testActivity_this_a_p_result_LiteralUnlimitedNatural21);
		BehaviorPort_Signal_Tester_testActivity_this_a_p_result_LiteralUnlimitedNatural21.setName("LiteralUnlimitedNatural21");
		BehaviorPort_Signal_Tester_testActivity_this_a_p_result_LiteralUnlimitedNatural21.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_p_result_LiteralUnlimitedNatural21.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Set this.p_object::LiteralUnlimitedNatural106
		addToElementRepository("LiteralUnlimitedNatural106", BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural106);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural106.setName("LiteralUnlimitedNatural106");
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural106.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural106.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send S_v::LiteralUnlimitedNatural40
		addToElementRepository("LiteralUnlimitedNatural40", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural40);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural40.setName("LiteralUnlimitedNatural40");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural40.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural40.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result::LiteralUnlimitedNatural24
		addToElementRepository("LiteralUnlimitedNatural24", BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural24);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural24.setName("LiteralUnlimitedNatural24");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural24.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural24.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_main_Tester()_target::LiteralUnlimitedNatural96
		addToElementRepository("LiteralUnlimitedNatural96", BehaviorPort_Signal_main_Tester__target_LiteralUnlimitedNatural96);
		BehaviorPort_Signal_main_Tester__target_LiteralUnlimitedNatural96.setName("LiteralUnlimitedNatural96");
		BehaviorPort_Signal_main_Tester__target_LiteralUnlimitedNatural96.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Tester__target_LiteralUnlimitedNatural96.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralUnlimitedNatural61
		addToElementRepository("LiteralUnlimitedNatural61", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural61);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural61.setName("LiteralUnlimitedNatural61");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural61.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural61.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_testActivity_this_result::LiteralUnlimitedNatural9
		addToElementRepository("LiteralUnlimitedNatural9", BehaviorPort_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural9);
		BehaviorPort_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural9.setName("LiteralUnlimitedNatural9");
		BehaviorPort_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural9.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural9.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_testActivity_Call testP_p::LiteralUnlimitedNatural16
		addToElementRepository("LiteralUnlimitedNatural16", BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural16);
		BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural16.setName("LiteralUnlimitedNatural16");
		BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural16.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural16.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Read S::t_result::LiteralUnlimitedNatural120
		addToElementRepository("LiteralUnlimitedNatural120", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result_LiteralUnlimitedNatural120);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result_LiteralUnlimitedNatural120.setName("LiteralUnlimitedNatural120");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result_LiteralUnlimitedNatural120.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result_LiteralUnlimitedNatural120.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_main_Send Start_target::LiteralUnlimitedNatural91
		addToElementRepository("LiteralUnlimitedNatural91", BehaviorPort_Signal_main_Send_Start_target_LiteralUnlimitedNatural91);
		BehaviorPort_Signal_main_Send_Start_target_LiteralUnlimitedNatural91.setName("LiteralUnlimitedNatural91");
		BehaviorPort_Signal_main_Send_Start_target_LiteralUnlimitedNatural91.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Send_Start_target_LiteralUnlimitedNatural91.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_this_result::LiteralUnlimitedNatural126
		addToElementRepository("LiteralUnlimitedNatural126", BehaviorPort_Signal_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural126);
		BehaviorPort_Signal_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural126.setName("LiteralUnlimitedNatural126");
		BehaviorPort_Signal_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural126.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural126.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read this.a.q_result::LiteralUnlimitedNatural52
		addToElementRepository("LiteralUnlimitedNatural52", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result_LiteralUnlimitedNatural52);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result_LiteralUnlimitedNatural52.setName("LiteralUnlimitedNatural52");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result_LiteralUnlimitedNatural52.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result_LiteralUnlimitedNatural52.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Set this.p_value::LiteralUnlimitedNatural105
		addToElementRepository("LiteralUnlimitedNatural105", BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural105);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural105.setName("LiteralUnlimitedNatural105");
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural105.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural105.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_main_Tester()_result::LiteralUnlimitedNatural94
		addToElementRepository("LiteralUnlimitedNatural94", BehaviorPort_Signal_main_Tester__result_LiteralUnlimitedNatural94);
		BehaviorPort_Signal_main_Tester__result_LiteralUnlimitedNatural94.setName("LiteralUnlimitedNatural94");
		BehaviorPort_Signal_main_Tester__result_LiteralUnlimitedNatural94.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Tester__result_LiteralUnlimitedNatural94.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_testActivity_this.a.p_object::LiteralUnlimitedNatural19
		addToElementRepository("LiteralUnlimitedNatural19", BehaviorPort_Signal_Tester_testActivity_this_a_p_object_LiteralUnlimitedNatural19);
		BehaviorPort_Signal_Tester_testActivity_this_a_p_object_LiteralUnlimitedNatural19.setName("LiteralUnlimitedNatural19");
		BehaviorPort_Signal_Tester_testActivity_this_a_p_object_LiteralUnlimitedNatural19.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_p_object_LiteralUnlimitedNatural19.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_main_Start Tester_object::LiteralUnlimitedNatural99
		addToElementRepository("LiteralUnlimitedNatural99", BehaviorPort_Signal_main_Start_Tester_object_LiteralUnlimitedNatural99);
		BehaviorPort_Signal_main_Start_Tester_object_LiteralUnlimitedNatural99.setName("LiteralUnlimitedNatural99");
		BehaviorPort_Signal_main_Start_Tester_object_LiteralUnlimitedNatural99.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Start_Tester_object_LiteralUnlimitedNatural99.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_A_AClassifierBehavior_Read S::t_object::LiteralUnlimitedNatural123
		addToElementRepository("LiteralUnlimitedNatural123", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object_LiteralUnlimitedNatural123);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object_LiteralUnlimitedNatural123.setName("LiteralUnlimitedNatural123");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object_LiteralUnlimitedNatural123.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object_LiteralUnlimitedNatural123.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read this.a.q_object::LiteralUnlimitedNatural51
		addToElementRepository("LiteralUnlimitedNatural51", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object_LiteralUnlimitedNatural51);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object_LiteralUnlimitedNatural51.setName("LiteralUnlimitedNatural51");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object_LiteralUnlimitedNatural51.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object_LiteralUnlimitedNatural51.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow BehaviorPort_Signal_Tester_testActivity::ObjectFlow3
		addToElementRepository("ObjectFlow3", BehaviorPort_Signal_Tester_testActivity_ObjectFlow3);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow3.setName("ObjectFlow3");
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow3.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow3.setSource(BehaviorPort_Signal_Tester_testActivity_this_a_p_result);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow3.setTarget(BehaviorPort_Signal_Tester_testActivity_Call_testP_p);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow3.setGuard(BehaviorPort_Signal_Tester_testActivity_ObjectFlow3_LiteralBoolean5);
		// ObjectFlow BehaviorPort_Signal_Tester_testActivity::ObjectFlow0
		addToElementRepository("ObjectFlow0", BehaviorPort_Signal_Tester_testActivity_ObjectFlow0);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow0.setName("ObjectFlow0");
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow0.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow0.setSource(BehaviorPort_Signal_Tester_testActivity_this_result);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow0.setTarget(BehaviorPort_Signal_Tester_testActivity_this_a_object);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow0.setGuard(BehaviorPort_Signal_Tester_testActivity_ObjectFlow0_LiteralBoolean1);
		// ObjectFlow BehaviorPort_Signal_main::ObjectFlow85
		addToElementRepository("ObjectFlow85", BehaviorPort_Signal_main_ObjectFlow85);
		BehaviorPort_Signal_main_ObjectFlow85.setName("ObjectFlow85");
		BehaviorPort_Signal_main_ObjectFlow85.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_main_ObjectFlow85.setSource(BehaviorPort_Signal_main_Tester__result);
		BehaviorPort_Signal_main_ObjectFlow85.setTarget(BehaviorPort_Signal_main_Fork_Tester);
		BehaviorPort_Signal_main_ObjectFlow85.setGuard(BehaviorPort_Signal_main_ObjectFlow85_LiteralBoolean87);
		// ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior::ObjectFlow25
		addToElementRepository("ObjectFlow25", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25.setName("ObjectFlow25");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25.setSource(BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25.setTarget(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Fork_this);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25.setGuard(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow25_LiteralBoolean26);
		// ObjectFlow BehaviorPort_Signal_Tester_testActivity::ObjectFlow6
		addToElementRepository("ObjectFlow6", BehaviorPort_Signal_Tester_testActivity_ObjectFlow6);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow6.setName("ObjectFlow6");
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow6.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow6.setSource(BehaviorPort_Signal_Tester_testActivity_this_a_result);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow6.setTarget(BehaviorPort_Signal_Tester_testActivity_this_a_p_object);
		BehaviorPort_Signal_Tester_testActivity_ObjectFlow6.setGuard(BehaviorPort_Signal_Tester_testActivity_ObjectFlow6_LiteralBoolean8);
		// ObjectFlow BehaviorPort_Signal_A_AClassifierBehavior::ObjectFlow108
		addToElementRepository("ObjectFlow108", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108.setName("ObjectFlow108");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108.setSource(BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108.setTarget(BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108.setGuard(BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow108_LiteralBoolean109);
		// ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior::ObjectFlow28
		addToElementRepository("ObjectFlow28", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28.setName("ObjectFlow28");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28.setSource(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28.setTarget(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28.setGuard(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow28_LiteralBoolean30);
		// ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior::ObjectFlow34
		addToElementRepository("ObjectFlow34", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34.setName("ObjectFlow34");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34.setSource(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34.setTarget(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34.setGuard(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralBoolean35);
		// ObjectFlow BehaviorPort_Signal_A_AClassifierBehavior::ObjectFlow111
		addToElementRepository("ObjectFlow111", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111.setName("ObjectFlow111");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111.setSource(BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111.setTarget(BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_value);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111.setGuard(BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow111_LiteralBoolean112);
		// ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior::ObjectFlow43
		addToElementRepository("ObjectFlow43", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43.setName("ObjectFlow43");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43.setSource(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43.setTarget(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43.setGuard(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow43_LiteralBoolean45);
		// ObjectFlow BehaviorPort_Signal_A_AClassifierBehavior::ObjectFlow114
		addToElementRepository("ObjectFlow114", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114.setName("ObjectFlow114");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114.setSource(BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114.setTarget(BehaviorPort_Signal_A_AClassifierBehavior_Fork_S);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114.setGuard(BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow114_LiteralBoolean116);
		// ObjectFlow BehaviorPort_Signal_main::ObjectFlow76
		addToElementRepository("ObjectFlow76", BehaviorPort_Signal_main_ObjectFlow76);
		BehaviorPort_Signal_main_ObjectFlow76.setName("ObjectFlow76");
		BehaviorPort_Signal_main_ObjectFlow76.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_main_ObjectFlow76.setSource(BehaviorPort_Signal_main_Fork_Tester);
		BehaviorPort_Signal_main_ObjectFlow76.setTarget(BehaviorPort_Signal_main_Send_Start_target);
		BehaviorPort_Signal_main_ObjectFlow76.setGuard(BehaviorPort_Signal_main_ObjectFlow76_LiteralBoolean78);
		// ObjectFlow BehaviorPort_Signal_main::ObjectFlow82
		addToElementRepository("ObjectFlow82", BehaviorPort_Signal_main_ObjectFlow82);
		BehaviorPort_Signal_main_ObjectFlow82.setName("ObjectFlow82");
		BehaviorPort_Signal_main_ObjectFlow82.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_main_ObjectFlow82.setSource(BehaviorPort_Signal_main_Fork_Tester);
		BehaviorPort_Signal_main_ObjectFlow82.setTarget(BehaviorPort_Signal_main_Start_Tester_object);
		BehaviorPort_Signal_main_ObjectFlow82.setGuard(BehaviorPort_Signal_main_ObjectFlow82_LiteralBoolean84);
		// ObjectFlow BehaviorPort_Signal_main::ObjectFlow79
		addToElementRepository("ObjectFlow79", BehaviorPort_Signal_main_ObjectFlow79);
		BehaviorPort_Signal_main_ObjectFlow79.setName("ObjectFlow79");
		BehaviorPort_Signal_main_ObjectFlow79.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_main_ObjectFlow79.setSource(BehaviorPort_Signal_main_Create_Tester_result);
		BehaviorPort_Signal_main_ObjectFlow79.setTarget(BehaviorPort_Signal_main_Tester__target);
		BehaviorPort_Signal_main_ObjectFlow79.setGuard(BehaviorPort_Signal_main_ObjectFlow79_LiteralBoolean80);
		// ObjectFlow BehaviorPort_Signal_A_AClassifierBehavior::ObjectFlow117
		addToElementRepository("ObjectFlow117", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117.setName("ObjectFlow117");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117.setSource(BehaviorPort_Signal_A_AClassifierBehavior_this_result);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117.setTarget(BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_object);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117.setGuard(BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow117_LiteralBoolean119);
		// ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior::ObjectFlow54
		addToElementRepository("ObjectFlow54", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54.setName("ObjectFlow54");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54.setSource(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Fork_this);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54.setTarget(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54.setGuard(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralBoolean56);
		// ObjectFlow BehaviorPort_Signal_A_AClassifierBehavior::ObjectFlow128
		addToElementRepository("ObjectFlow128", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128.setName("ObjectFlow128");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128.setSource(BehaviorPort_Signal_A_AClassifierBehavior_Fork_S);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128.setTarget(BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128.setGuard(BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow128_LiteralBoolean130);
		// ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior::ObjectFlow65
		addToElementRepository("ObjectFlow65", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65.setName("ObjectFlow65");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65.setSource(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Fork_this);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65.setTarget(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65.setGuard(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow65_LiteralBoolean67);
		// ObjectFlow BehaviorPort_Signal_Tester_TesterClassifierBehavior::ObjectFlow62
		addToElementRepository("ObjectFlow62", BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62.setName("ObjectFlow62");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62.setSource(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Fork_this);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62.setTarget(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62.setGuard(BehaviorPort_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralBoolean63);
		// ObjectFlow BehaviorPort_Signal_A_AClassifierBehavior::ObjectFlow131
		addToElementRepository("ObjectFlow131", BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131.setName("ObjectFlow131");
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131.setSource(BehaviorPort_Signal_A_AClassifierBehavior_Fork_S);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131.setTarget(BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object);
		BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131.setGuard(BehaviorPort_Signal_A_AClassifierBehavior_ObjectFlow131_LiteralBoolean133);
	}

	private void initializeOperation_Instances()
	{
		// Operation BehaviorPort_Signal_AbstractTester::test
		addToElementRepository("test", BehaviorPort_Signal_AbstractTester_test);
		BehaviorPort_Signal_AbstractTester_test.setName("test");
		BehaviorPort_Signal_AbstractTester_test.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_AbstractTester_test.setIsAbstract(true);
		// Operation BehaviorPort_Signal_Tester::test
		addToElementRepository("test", BehaviorPort_Signal_Tester_test);
		BehaviorPort_Signal_Tester_test.setName("test");
		BehaviorPort_Signal_Tester_test.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_test.addMethod(BehaviorPort_Signal_Tester_testActivity);
		BehaviorPort_Signal_Tester_test.addRedefinedOperation(BehaviorPort_Signal_AbstractTester_test);
		// Operation BehaviorPort_Signal_A::A_A
		addToElementRepository("A_A", BehaviorPort_Signal_A_A_A);
		BehaviorPort_Signal_A_A_A.setName("A");
		BehaviorPort_Signal_A_A_A.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_A_A.addOwnedParameter(BehaviorPort_Signal_A_A_A_result);
		BehaviorPort_Signal_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation BehaviorPort_Signal_Tester::Tester_Tester
		addToElementRepository("Tester_Tester", BehaviorPort_Signal_Tester_Tester_Tester);
		BehaviorPort_Signal_Tester_Tester_Tester.setName("Tester");
		BehaviorPort_Signal_Tester_Tester_Tester.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_Tester_Tester.addOwnedParameter(BehaviorPort_Signal_Tester_Tester_Tester_result);
		BehaviorPort_Signal_Tester_Tester_Tester.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin BehaviorPort_Signal_main_Tester()::result
		addToElementRepository("result", BehaviorPort_Signal_main_Tester__result);
		BehaviorPort_Signal_main_Tester__result.setName("result");
		BehaviorPort_Signal_main_Tester__result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Tester__result.setType(BehaviorPort_Signal_Tester);
		// OutputPin BehaviorPort_Signal_A_AClassifierBehavior_Read S::t::result
		addToElementRepository("result", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result.setName("result");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result.setType(BehaviorPort_Signal_AbstractTester);
		// OutputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read this.a.q::result
		addToElementRepository("result", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result.setName("result");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result.setType(BehaviorPort_Signal_IImpl);
		// OutputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept Continue::result
		addToElementRepository("result", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result.setName("result");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result.setType(BehaviorPort_Signal_Continue);
		// OutputPin BehaviorPort_Signal_Tester_testActivity_this::result
		addToElementRepository("result", BehaviorPort_Signal_Tester_testActivity_this_result);
		BehaviorPort_Signal_Tester_testActivity_this_result.setName("result");
		BehaviorPort_Signal_Tester_testActivity_this_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_result.setType(BehaviorPort_Signal_Tester);
		// OutputPin BehaviorPort_Signal_A_AClassifierBehavior_this::result
		addToElementRepository("result", BehaviorPort_Signal_A_AClassifierBehavior_this_result);
		BehaviorPort_Signal_A_AClassifierBehavior_this_result.setName("result");
		BehaviorPort_Signal_A_AClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_this_result.setType(BehaviorPort_Signal_A);
		// OutputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read this.a::result
		addToElementRepository("result", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result.setName("result");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result.setType(BehaviorPort_Signal_A);
		// OutputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value 4::result
		addToElementRepository("result", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result.setName("result");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin BehaviorPort_Signal_Tester_testActivity_this.a::result
		addToElementRepository("result", BehaviorPort_Signal_Tester_testActivity_this_a_result);
		BehaviorPort_Signal_Tester_testActivity_this_a_result.setName("result");
		BehaviorPort_Signal_Tester_testActivity_this_a_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_result.setType(BehaviorPort_Signal_A);
		// OutputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept Start::result
		addToElementRepository("result", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setName("result");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setType(BehaviorPort_Signal_Start);
		// OutputPin BehaviorPort_Signal_A_AClassifierBehavior_Accept S::result
		addToElementRepository("result", BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result.setName("result");
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result.setType(BehaviorPort_Signal_S);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result.setIsOrdered(true);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_result.setIsUnique(false);
		// OutputPin BehaviorPort_Signal_A_AClassifierBehavior_Read S::v::result
		addToElementRepository("result", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result.setName("result");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin BehaviorPort_Signal_A_AClassifierBehavior_Set this.p::result
		addToElementRepository("result", BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result.setName("result");
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Set_this_p_result.setType(BehaviorPort_Signal_A);
		// OutputPin BehaviorPort_Signal_Tester_testActivity_this.a.p::result
		addToElementRepository("result", BehaviorPort_Signal_Tester_testActivity_this_a_p_result);
		BehaviorPort_Signal_Tester_testActivity_this_a_p_result.setName("result");
		BehaviorPort_Signal_Tester_testActivity_this_a_p_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin BehaviorPort_Signal_Tester_TesterClassifierBehavior_this::result
		addToElementRepository("result", BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result.setName("result");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result.setType(BehaviorPort_Signal_Tester);
		// OutputPin BehaviorPort_Signal_main_Create Tester::result
		addToElementRepository("result", BehaviorPort_Signal_main_Create_Tester_result);
		BehaviorPort_Signal_main_Create_Tester_result.setName("result");
		BehaviorPort_Signal_main_Create_Tester_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Create_Tester_result.setType(BehaviorPort_Signal_Tester);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport BehaviorPort_Signal::PackageImport143
		addToElementRepository("PackageImport143", BehaviorPort_Signal_PackageImport143);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter BehaviorPort_Signal_A_A_A::result
		addToElementRepository("result", BehaviorPort_Signal_A_A_A_result);
		BehaviorPort_Signal_A_A_A_result.setName("result");
		BehaviorPort_Signal_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_A_A_A_result.setType(BehaviorPort_Signal_A);
		BehaviorPort_Signal_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter BehaviorPort_Signal_Tester_testActivity_testP::p
		addToElementRepository("p", BehaviorPort_Signal_Tester_testActivity_testP_p);
		BehaviorPort_Signal_Tester_testActivity_testP_p.setName("p");
		BehaviorPort_Signal_Tester_testActivity_testP_p.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_testActivity_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter BehaviorPort_Signal_Tester_Tester_Tester::result
		addToElementRepository("result", BehaviorPort_Signal_Tester_Tester_Tester_result);
		BehaviorPort_Signal_Tester_Tester_Tester_result.setName("result");
		BehaviorPort_Signal_Tester_Tester_Tester_result.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_Tester_Tester_result.setType(BehaviorPort_Signal_Tester);
		BehaviorPort_Signal_Tester_Tester_Tester_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port BehaviorPort_Signal_A::q
		addToElementRepository("q", BehaviorPort_Signal_A_q);
		BehaviorPort_Signal_A_q.setName("q");
		BehaviorPort_Signal_A_q.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_A_q.setType(BehaviorPort_Signal_IImpl);
		BehaviorPort_Signal_A_q.setAggregation(AggregationKind.composite);
		BehaviorPort_Signal_A_q.isBehavior = true;
		BehaviorPort_Signal_A_q.isService = true;
		BehaviorPort_Signal_A_q.addProvided(BehaviorPort_Signal_I);
	}

	private void initializeProperty_Instances()
	{
		// Property BehaviorPort_Signal_S::t
		addToElementRepository("t", BehaviorPort_Signal_S_t);
		BehaviorPort_Signal_S_t.setName("t");
		BehaviorPort_Signal_S_t.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_S_t.setType(BehaviorPort_Signal_AbstractTester);
		// Property BehaviorPort_Signal_S::v
		addToElementRepository("v", BehaviorPort_Signal_S_v);
		BehaviorPort_Signal_S_v.setName("v");
		BehaviorPort_Signal_S_v.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property BehaviorPort_Signal_A::p
		addToElementRepository("p", BehaviorPort_Signal_A_p);
		BehaviorPort_Signal_A_p.setName("p");
		BehaviorPort_Signal_A_p.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_A_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property BehaviorPort_Signal_Tester::a
		addToElementRepository("a", BehaviorPort_Signal_Tester_a);
		BehaviorPort_Signal_Tester_a.setName("a");
		BehaviorPort_Signal_Tester_a.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_Tester_a.setType(BehaviorPort_Signal_A);
		BehaviorPort_Signal_Tester_a.setAggregation(AggregationKind.composite);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction BehaviorPort_Signal_Tester_TesterClassifierBehavior::this
		addToElementRepository("this", BehaviorPort_Signal_Tester_TesterClassifierBehavior_this);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_this.setName("this");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_this.setResult(BehaviorPort_Signal_Tester_TesterClassifierBehavior_this_result);
		// ReadSelfAction BehaviorPort_Signal_A_AClassifierBehavior::this
		addToElementRepository("this", BehaviorPort_Signal_A_AClassifierBehavior_this);
		BehaviorPort_Signal_A_AClassifierBehavior_this.setName("this");
		BehaviorPort_Signal_A_AClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_this.setResult(BehaviorPort_Signal_A_AClassifierBehavior_this_result);
		// ReadSelfAction BehaviorPort_Signal_Tester_testActivity::this
		addToElementRepository("this", BehaviorPort_Signal_Tester_testActivity_this);
		BehaviorPort_Signal_Tester_testActivity_this.setName("this");
		BehaviorPort_Signal_Tester_testActivity_this.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this.setResult(BehaviorPort_Signal_Tester_testActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction BehaviorPort_Signal_Tester_TesterClassifierBehavior::Read this.a
		addToElementRepository("Read this.a", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a.setName("Read this.a");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a.setStructuralFeature(BehaviorPort_Signal_Tester_a);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a.setObject(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_object);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a.setResult(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_result);
		// ReadStructuralFeatureAction BehaviorPort_Signal_Tester_TesterClassifierBehavior::Read this.a.q
		addToElementRepository("Read this.a.q", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q.setName("Read this.a.q");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q.setStructuralFeature(BehaviorPort_Signal_A_q);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q.setObject(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_object);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q.setResult(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Read_this_a_q_result);
		// ReadStructuralFeatureAction BehaviorPort_Signal_A_AClassifierBehavior::Read S::t
		addToElementRepository("Read S::t", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t.setName("Read S::t");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t.setStructuralFeature(BehaviorPort_Signal_S_t);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t.setObject(BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_object);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t.setResult(BehaviorPort_Signal_A_AClassifierBehavior_Read_S_t_result);
		// ReadStructuralFeatureAction BehaviorPort_Signal_Tester_testActivity::this.a
		addToElementRepository("this.a", BehaviorPort_Signal_Tester_testActivity_this_a);
		BehaviorPort_Signal_Tester_testActivity_this_a.setName("this.a");
		BehaviorPort_Signal_Tester_testActivity_this_a.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a.setStructuralFeature(BehaviorPort_Signal_Tester_a);
		BehaviorPort_Signal_Tester_testActivity_this_a.setObject(BehaviorPort_Signal_Tester_testActivity_this_a_object);
		BehaviorPort_Signal_Tester_testActivity_this_a.setResult(BehaviorPort_Signal_Tester_testActivity_this_a_result);
		// ReadStructuralFeatureAction BehaviorPort_Signal_Tester_testActivity::this.a.p
		addToElementRepository("this.a.p", BehaviorPort_Signal_Tester_testActivity_this_a_p);
		BehaviorPort_Signal_Tester_testActivity_this_a_p.setName("this.a.p");
		BehaviorPort_Signal_Tester_testActivity_this_a_p.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_testActivity_this_a_p.setStructuralFeature(BehaviorPort_Signal_A_p);
		BehaviorPort_Signal_Tester_testActivity_this_a_p.setObject(BehaviorPort_Signal_Tester_testActivity_this_a_p_object);
		BehaviorPort_Signal_Tester_testActivity_this_a_p.setResult(BehaviorPort_Signal_Tester_testActivity_this_a_p_result);
		// ReadStructuralFeatureAction BehaviorPort_Signal_A_AClassifierBehavior::Read S::v
		addToElementRepository("Read S::v", BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v.setName("Read S::v");
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v.setStructuralFeature(BehaviorPort_Signal_S_v);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v.setObject(BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_object);
		BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v.setResult(BehaviorPort_Signal_A_AClassifierBehavior_Read_S_v_result);
	}

	private void initializeReception_Instances()
	{
		// Reception BehaviorPort_Signal_I::S
		addToElementRepository("S", BehaviorPort_Signal_I_S);
		BehaviorPort_Signal_I_S.setName("S");
		BehaviorPort_Signal_I_S.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_I_S.setSignal(BehaviorPort_Signal_S);
		// Reception BehaviorPort_Signal_AbstractTester::Continue
		addToElementRepository("Continue", BehaviorPort_Signal_AbstractTester_Continue);
		BehaviorPort_Signal_AbstractTester_Continue.setName("Continue");
		BehaviorPort_Signal_AbstractTester_Continue.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_AbstractTester_Continue.setSignal(BehaviorPort_Signal_Continue);
		// Reception BehaviorPort_Signal_IImpl::S
		addToElementRepository("S", BehaviorPort_Signal_IImpl_S);
		BehaviorPort_Signal_IImpl_S.setName("S");
		BehaviorPort_Signal_IImpl_S.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_IImpl_S.setSignal(BehaviorPort_Signal_S);
		// Reception BehaviorPort_Signal_A::S
		addToElementRepository("S", BehaviorPort_Signal_A_S);
		BehaviorPort_Signal_A_S.setName("S");
		BehaviorPort_Signal_A_S.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_S.setSignal(BehaviorPort_Signal_S);
		// Reception BehaviorPort_Signal_AbstractTester::Start
		addToElementRepository("Start", BehaviorPort_Signal_AbstractTester_Start);
		BehaviorPort_Signal_AbstractTester_Start.setName("Start");
		BehaviorPort_Signal_AbstractTester_Start.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_AbstractTester_Start.setSignal(BehaviorPort_Signal_Start);
	}

	private void initializeSendSignalAction_Instances()
	{
		// SendSignalAction BehaviorPort_Signal_A_AClassifierBehavior::Send Continue
		addToElementRepository("Send Continue", BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue);
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue.setName("Send Continue");
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue.setSignal(BehaviorPort_Signal_Continue);
		BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue.setTarget(BehaviorPort_Signal_A_AClassifierBehavior_Send_Continue_target);
		// SendSignalAction BehaviorPort_Signal_main::Send Start
		addToElementRepository("Send Start", BehaviorPort_Signal_main_Send_Start);
		BehaviorPort_Signal_main_Send_Start.setName("Send Start");
		BehaviorPort_Signal_main_Send_Start.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Send_Start.setSignal(BehaviorPort_Signal_Start);
		BehaviorPort_Signal_main_Send_Start.setTarget(BehaviorPort_Signal_main_Send_Start_target);
		// SendSignalAction BehaviorPort_Signal_Tester_TesterClassifierBehavior::Send S
		addToElementRepository("Send S", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S.setName("Send S");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S.setSignal(BehaviorPort_Signal_S);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S.setTarget(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S.addArgument(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S.addArgument(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Send_S_t);
	}

	private void initializeSignal_Instances()
	{
		// Signal BehaviorPort_Signal::S
		addToElementRepository("S", BehaviorPort_Signal_S);
		BehaviorPort_Signal_S.setName("S");
		BehaviorPort_Signal_S.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Signal_S.addOwnedAttribute(BehaviorPort_Signal_S_v);
		BehaviorPort_Signal_S.addOwnedAttribute(BehaviorPort_Signal_S_t);
		// Signal BehaviorPort_Signal::Start
		addToElementRepository("Start", BehaviorPort_Signal_Start);
		BehaviorPort_Signal_Start.setName("Start");
		BehaviorPort_Signal_Start.setVisibility(VisibilityKind.public_);
		// Signal BehaviorPort_Signal::Continue
		addToElementRepository("Continue", BehaviorPort_Signal_Continue);
		BehaviorPort_Signal_Continue.setName("Continue");
		BehaviorPort_Signal_Continue.setVisibility(VisibilityKind.public_);
	}

	private void initializeSignalEvent_Instances()
	{
		// SignalEvent BehaviorPort_Signal::SignalEventStart
		addToElementRepository("SignalEventStart", BehaviorPort_Signal_SignalEventStart);
		BehaviorPort_Signal_SignalEventStart.setName("SignalEventStart");
		BehaviorPort_Signal_SignalEventStart.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_SignalEventStart.setSignal(BehaviorPort_Signal_Start);
		// SignalEvent BehaviorPort_Signal::SignalEventS
		addToElementRepository("SignalEventS", BehaviorPort_Signal_SignalEventS);
		BehaviorPort_Signal_SignalEventS.setName("SignalEventS");
		BehaviorPort_Signal_SignalEventS.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_SignalEventS.setSignal(BehaviorPort_Signal_S);
		// SignalEvent BehaviorPort_Signal::SignalEventContinue
		addToElementRepository("SignalEventContinue", BehaviorPort_Signal_SignalEventContinue);
		BehaviorPort_Signal_SignalEventContinue.setName("SignalEventContinue");
		BehaviorPort_Signal_SignalEventContinue.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_SignalEventContinue.setSignal(BehaviorPort_Signal_Continue);
	}

	private void initializeStartObjectBehaviorAction_Instances()
	{
		// StartObjectBehaviorAction BehaviorPort_Signal_main::Start Tester
		addToElementRepository("Start Tester", BehaviorPort_Signal_main_Start_Tester);
		BehaviorPort_Signal_main_Start_Tester.setName("Start Tester");
		BehaviorPort_Signal_main_Start_Tester.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_main_Start_Tester.setObject(BehaviorPort_Signal_main_Start_Tester_object);
	}

	private void initializeTrigger_Instances()
	{
		// Trigger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept Start::Trigger58
		addToElementRepository("Trigger58", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger58);
		// Trigger Trigger58
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger58.setName("Trigger58");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger58.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger58.setEvent(BehaviorPort_Signal_SignalEventStart);
		// Trigger BehaviorPort_Signal_A_AClassifierBehavior_Accept S::Trigger137
		addToElementRepository("Trigger137", BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_Trigger137);
		// Trigger Trigger137
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_Trigger137.setName("Trigger137");
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_Trigger137.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_A_AClassifierBehavior_Accept_S_Trigger137.setEvent(BehaviorPort_Signal_SignalEventS);
		// Trigger BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept Continue::Trigger72
		addToElementRepository("Trigger72", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_Trigger72);
		// Trigger Trigger72
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_Trigger72.setName("Trigger72");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_Trigger72.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Accept_Continue_Trigger72.setEvent(BehaviorPort_Signal_SignalEventContinue);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction BehaviorPort_Signal_Tester_TesterClassifierBehavior::Value 4
		addToElementRepository("Value 4", BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4.setName("Value 4");
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4.setVisibility(VisibilityKind.public_);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4.setValue(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger73);
		BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4.setResult(BehaviorPort_Signal_Tester_TesterClassifierBehavior_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // BehaviorPort_SignalModel
