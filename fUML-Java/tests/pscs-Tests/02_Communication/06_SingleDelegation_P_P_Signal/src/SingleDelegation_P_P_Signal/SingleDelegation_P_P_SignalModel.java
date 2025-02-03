/*
 * SingleDelegation_P_P_SignalModel.java
 * 
 * Auto-generated file
 */
package SingleDelegation_P_P_Signal;

import uml.commonbehavior.SignalEvent;
import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.classification.Generalization;
import uml.structuredclassifiers.Connector;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.Signal;
import uml.simpleclassifiers.InterfaceRealization;
import uml.activities.Activity;
import uml.actions.OutputPin;
import uml.actions.ReadStructuralFeatureAction;
import uml.actions.CallOperationAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.values.LiteralString;
import uml.simpleclassifiers.Interface;
import uml.commonstructure.Comment;
import uml.classification.Operation;
import uml.classification.Parameter;
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

public class SingleDelegation_P_P_SignalModel extends InMemoryModel
{
	private static SingleDelegation_P_P_SignalModel instance;

	/*
	 * Model SingleDelegation_P_P_Signal
	 */
	public Package SingleDelegation_P_P_Signal = new Package();
		public Class_ SingleDelegation_P_P_Signal_IImpl = new Class_();
			public InterfaceRealization SingleDelegation_P_P_Signal_IImpl_IRealization = new InterfaceRealization();
			public Reception SingleDelegation_P_P_Signal_IImpl_S = new Reception();
		public Signal SingleDelegation_P_P_Signal_Start = new Signal();
		public Signal SingleDelegation_P_P_Signal_Continue = new Signal();
		public Signal SingleDelegation_P_P_Signal_S = new Signal();
			public Property SingleDelegation_P_P_Signal_S_t = new Property();
			public Property SingleDelegation_P_P_Signal_S_v = new Property();
		public Association SingleDelegation_P_P_Signal_R = new Association();
			public Property SingleDelegation_P_P_Signal_R_y = new Property();
			public Property SingleDelegation_P_P_Signal_R_x = new Property();
		public SignalEvent SingleDelegation_P_P_Signal_SignalEventContinue = new SignalEvent();
		public Comment SingleDelegation_P_P_Signal_Comment0 = new Comment();
		public Class_ SingleDelegation_P_P_Signal_AbstractTester = new Class_();
			public Reception SingleDelegation_P_P_Signal_AbstractTester_Start = new Reception();
			public Reception SingleDelegation_P_P_Signal_AbstractTester_Continue = new Reception();
			public Operation SingleDelegation_P_P_Signal_AbstractTester_test = new Operation();
		public PackageImport SingleDelegation_P_P_Signal_PackageImport1 = new PackageImport();
		public Interface SingleDelegation_P_P_Signal_I = new Interface();
			public Reception SingleDelegation_P_P_Signal_I_S = new Reception();
		public Comment SingleDelegation_P_P_Signal_Comment2 = new Comment();
		public Class_ SingleDelegation_P_P_Signal_B = new Class_();
			public Property SingleDelegation_P_P_Signal_B_p = new Property();
			public Activity SingleDelegation_P_P_Signal_B_BClassifierBehavior = new Activity();
				public ObjectFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3_LiteralBoolean4 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3_LiteralInteger5 = new LiteralInteger();
				public ControlFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow6 = new ControlFlow();
				public ObjectFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7_LiteralBoolean8 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7_LiteralInteger9 = new LiteralInteger();
				public ObjectFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralBoolean11 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralInteger12 = new LiteralInteger();
				public AcceptEventAction SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S = new AcceptEventAction();
					public OutputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result = new OutputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralInteger13 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural14 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralInteger15 = new LiteralInteger();
					public Trigger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger16 = new Trigger();
				public ReadSelfAction SingleDelegation_P_P_Signal_B_BClassifierBehavior_this = new ReadSelfAction();
					public OutputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result = new OutputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural17 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger18 = new LiteralInteger();
				public ReadStructuralFeatureAction SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v = new ReadStructuralFeatureAction();
					public OutputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result = new OutputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural19 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger20 = new LiteralInteger();
					public InputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object = new InputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger21 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural22 = new LiteralUnlimitedNatural();
				public ObjectFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23 = new ObjectFlow();
					public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralInteger24 = new LiteralInteger();
					public LiteralBoolean SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralBoolean25 = new LiteralBoolean();
				public ObjectFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26_LiteralBoolean27 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26_LiteralInteger28 = new LiteralInteger();
				public ReadStructuralFeatureAction SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t = new ReadStructuralFeatureAction();
					public InputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object = new InputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger29 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural30 = new LiteralUnlimitedNatural();
					public OutputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result = new OutputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural31 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger32 = new LiteralInteger();
				public ObjectFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33_LiteralBoolean34 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33_LiteralInteger35 = new LiteralInteger();
				public InitialNode SingleDelegation_P_P_Signal_B_BClassifierBehavior_Initial = new InitialNode();
				public AddStructuralFeatureValueAction SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value = new InputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger36 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural37 = new LiteralUnlimitedNatural();
					public InputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object = new InputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger38 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural39 = new LiteralUnlimitedNatural();
					public OutputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result = new OutputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger40 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural41 = new LiteralUnlimitedNatural();
				public SendSignalAction SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue = new SendSignalAction();
					public InputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target = new InputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural42 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger43 = new LiteralInteger();
				public ControlFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow44 = new ControlFlow();
				public ForkNode SingleDelegation_P_P_Signal_B_BClassifierBehavior_Fork_S = new ForkNode();
			public InterfaceRealization SingleDelegation_P_P_Signal_B_IRealization = new InterfaceRealization();
			public Reception SingleDelegation_P_P_Signal_B_S = new Reception();
			public Operation SingleDelegation_P_P_Signal_B_B_B = new Operation();
				public Parameter SingleDelegation_P_P_Signal_B_B_B_result = new Parameter();
		public Class_ SingleDelegation_P_P_Signal_A = new Class_();
			public Property SingleDelegation_P_P_Signal_A_b = new Property();
			public Operation SingleDelegation_P_P_Signal_A_A_A = new Operation();
				public Parameter SingleDelegation_P_P_Signal_A_A_A_result = new Parameter();
			public Port SingleDelegation_P_P_Signal_A_q = new Port();
			public Connector SingleDelegation_P_P_Signal_A_r = new Connector();
				public ConnectorEnd SingleDelegation_P_P_Signal_A_r_ConnectorEnd45 = new ConnectorEnd();
				public ConnectorEnd SingleDelegation_P_P_Signal_A_r_ConnectorEnd46 = new ConnectorEnd();
		public SignalEvent SingleDelegation_P_P_Signal_SignalEventStart = new SignalEvent();
		public Class_ SingleDelegation_P_P_Signal_Tester = new Class_();
			public Activity SingleDelegation_P_P_Signal_Tester_testActivity = new Activity();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47_LiteralBoolean48 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47_LiteralInteger49 = new LiteralInteger();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50_LiteralBoolean51 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50_LiteralInteger52 = new LiteralInteger();
				public ReadStructuralFeatureAction SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a = new ReadStructuralFeatureAction();
					public InputPin SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object = new InputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural53 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger54 = new LiteralInteger();
					public OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result = new OutputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural55 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger56 = new LiteralInteger();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57 = new ObjectFlow();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57_LiteralInteger58 = new LiteralInteger();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57_LiteralBoolean59 = new LiteralBoolean();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60 = new ObjectFlow();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60_LiteralInteger61 = new LiteralInteger();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60_LiteralBoolean62 = new LiteralBoolean();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63_LiteralBoolean64 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63_LiteralInteger65 = new LiteralInteger();
				public ControlFlow SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow66 = new ControlFlow();
				public CallBehaviorAction SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage = new CallBehaviorAction();
					public InputPin SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value = new InputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralInteger67 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralUnlimitedNatural68 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralInteger69 = new LiteralInteger();
					public OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus = new OutputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralInteger70 = new LiteralInteger();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralInteger71 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural72 = new LiteralUnlimitedNatural();
				public ReadStructuralFeatureAction SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p = new ReadStructuralFeatureAction();
					public InputPin SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object = new InputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger73 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural74 = new LiteralUnlimitedNatural();
					public OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result = new OutputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger75 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural76 = new LiteralUnlimitedNatural();
				public ReadSelfAction SingleDelegation_P_P_Signal_Tester_testActivity_this = new ReadSelfAction();
					public OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural77 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_this_result_LiteralInteger78 = new LiteralInteger();
				public CallBehaviorAction SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP = new CallBehaviorAction();
					public InputPin SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p = new InputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger79 = new LiteralInteger();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger80 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural81 = new LiteralUnlimitedNatural();
				public ValueSpecificationAction SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage = new ValueSpecificationAction();
					public LiteralString SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_LiteralString82 = new LiteralString();
					public OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result = new OutputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result_LiteralUnlimitedNatural83 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result_LiteralInteger84 = new LiteralInteger();
				public ReadStructuralFeatureAction SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b = new ReadStructuralFeatureAction();
					public OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result = new OutputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger85 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural86 = new LiteralUnlimitedNatural();
					public InputPin SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object = new InputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger87 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural88 = new LiteralUnlimitedNatural();
				public CallBehaviorAction SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage = new CallBehaviorAction();
					public OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus = new OutputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralInteger89 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural90 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralInteger91 = new LiteralInteger();
					public InputPin SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value = new InputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralInteger92 = new LiteralInteger();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralInteger93 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralUnlimitedNatural94 = new LiteralUnlimitedNatural();
				public OpaqueBehavior SingleDelegation_P_P_Signal_Tester_testActivity_testP = new OpaqueBehavior();
					public Parameter SingleDelegation_P_P_Signal_Tester_testActivity_testP_p = new Parameter();
				public ControlFlow SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow95 = new ControlFlow();
				public ValueSpecificationAction SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage = new ValueSpecificationAction();
					public OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result = new OutputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result_LiteralUnlimitedNatural96 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result_LiteralInteger97 = new LiteralInteger();
					public LiteralString SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_LiteralString98 = new LiteralString();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean100 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger101 = new LiteralInteger();
			public Generalization SingleDelegation_P_P_Signal_Tester_Generalization102 = new Generalization();
			public Operation SingleDelegation_P_P_Signal_Tester_test = new Operation();
			public Activity SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior = new Activity();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103 = new ObjectFlow();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103_LiteralInteger104 = new LiteralInteger();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103_LiteralBoolean105 = new LiteralBoolean();
				public ControlFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow106 = new ControlFlow();
				public ReadStructuralFeatureAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a = new ReadStructuralFeatureAction();
					public InputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object = new InputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural107 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger108 = new LiteralInteger();
					public OutputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result = new OutputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger109 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural110 = new LiteralUnlimitedNatural();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralBoolean112 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralInteger113 = new LiteralInteger();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralBoolean115 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralInteger116 = new LiteralInteger();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117_LiteralBoolean118 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117_LiteralInteger119 = new LiteralInteger();
				public AcceptEventAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue = new AcceptEventAction();
					public Trigger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_Trigger120 = new Trigger();
					public OutputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result = new OutputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural121 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger122 = new LiteralInteger();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger123 = new LiteralInteger();
				public ControlFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow124 = new ControlFlow();
				public AcceptEventAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start = new AcceptEventAction();
					public OutputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result = new OutputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural125 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger126 = new LiteralInteger();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger127 = new LiteralInteger();
					public Trigger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger128 = new Trigger();
				public ControlFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow129 = new ControlFlow();
				public CallOperationAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_ = new CallOperationAction();
					public InputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target = new InputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural130 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger131 = new LiteralInteger();
				public ReadSelfAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this = new ReadSelfAction();
					public OutputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger132 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural133 = new LiteralUnlimitedNatural();
				public ReadStructuralFeatureAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q = new ReadStructuralFeatureAction();
					public InputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object = new InputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural134 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger135 = new LiteralInteger();
					public OutputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result = new OutputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger136 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural137 = new LiteralUnlimitedNatural();
				public InitialNode SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Initial = new InitialNode();
				public SendSignalAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S = new SendSignalAction();
					public InputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t = new InputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t_LiteralUnlimitedNatural138 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t_LiteralInteger139 = new LiteralInteger();
					public InputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target = new InputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target_LiteralUnlimitedNatural140 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target_LiteralInteger141 = new LiteralInteger();
					public InputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v = new InputPin();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v_LiteralInteger142 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v_LiteralUnlimitedNatural143 = new LiteralUnlimitedNatural();
				public ValueSpecificationAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4 = new ValueSpecificationAction();
					public OutputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result = new OutputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result_LiteralUnlimitedNatural144 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result_LiteralInteger145 = new LiteralInteger();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_LiteralInteger146 = new LiteralInteger();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147 = new ObjectFlow();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147_LiteralInteger148 = new LiteralInteger();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147_LiteralBoolean149 = new LiteralBoolean();
				public ForkNode SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this = new ForkNode();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150_LiteralBoolean151 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150_LiteralInteger152 = new LiteralInteger();
				public ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153 = new ObjectFlow();
					public LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153_LiteralInteger154 = new LiteralInteger();
					public LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153_LiteralBoolean155 = new LiteralBoolean();
			public Operation SingleDelegation_P_P_Signal_Tester_Tester_Tester = new Operation();
				public Parameter SingleDelegation_P_P_Signal_Tester_Tester_Tester_result = new Parameter();
			public Property SingleDelegation_P_P_Signal_Tester_a = new Property();
		public Activity SingleDelegation_P_P_Signal_main = new Activity();
			public ObjectFlow SingleDelegation_P_P_Signal_main_ObjectFlow156 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_P_Signal_main_ObjectFlow156_LiteralInteger157 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_P_Signal_main_ObjectFlow156_LiteralBoolean158 = new LiteralBoolean();
			public StartObjectBehaviorAction SingleDelegation_P_P_Signal_main_Start_Tester = new StartObjectBehaviorAction();
				public InputPin SingleDelegation_P_P_Signal_main_Start_Tester_object = new InputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural159 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_P_Signal_main_Start_Tester_object_LiteralInteger160 = new LiteralInteger();
			public SendSignalAction SingleDelegation_P_P_Signal_main_Send_Start = new SendSignalAction();
				public InputPin SingleDelegation_P_P_Signal_main_Send_Start_target = new InputPin();
					public LiteralInteger SingleDelegation_P_P_Signal_main_Send_Start_target_LiteralInteger161 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural162 = new LiteralUnlimitedNatural();
			public ObjectFlow SingleDelegation_P_P_Signal_main_ObjectFlow163 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_P_Signal_main_ObjectFlow163_LiteralInteger164 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_P_Signal_main_ObjectFlow163_LiteralBoolean165 = new LiteralBoolean();
			public CallOperationAction SingleDelegation_P_P_Signal_main_Tester_ = new CallOperationAction();
				public InputPin SingleDelegation_P_P_Signal_main_Tester__target = new InputPin();
					public LiteralInteger SingleDelegation_P_P_Signal_main_Tester__target_LiteralInteger166 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural167 = new LiteralUnlimitedNatural();
				public OutputPin SingleDelegation_P_P_Signal_main_Tester__result = new OutputPin();
					public LiteralInteger SingleDelegation_P_P_Signal_main_Tester__result_LiteralInteger168 = new LiteralInteger();
					public LiteralInteger SingleDelegation_P_P_Signal_main_Tester__result_LiteralInteger169 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural170 = new LiteralUnlimitedNatural();
			public ForkNode SingleDelegation_P_P_Signal_main_Fork_Tester = new ForkNode();
			public ObjectFlow SingleDelegation_P_P_Signal_main_ObjectFlow171 = new ObjectFlow();
				public LiteralBoolean SingleDelegation_P_P_Signal_main_ObjectFlow171_LiteralBoolean172 = new LiteralBoolean();
				public LiteralInteger SingleDelegation_P_P_Signal_main_ObjectFlow171_LiteralInteger173 = new LiteralInteger();
			public ObjectFlow SingleDelegation_P_P_Signal_main_ObjectFlow174 = new ObjectFlow();
				public LiteralBoolean SingleDelegation_P_P_Signal_main_ObjectFlow174_LiteralBoolean175 = new LiteralBoolean();
				public LiteralInteger SingleDelegation_P_P_Signal_main_ObjectFlow174_LiteralInteger176 = new LiteralInteger();
			public CreateObjectAction SingleDelegation_P_P_Signal_main_Create_Tester = new CreateObjectAction();
				public OutputPin SingleDelegation_P_P_Signal_main_Create_Tester_result = new OutputPin();
					public LiteralInteger SingleDelegation_P_P_Signal_main_Create_Tester_result_LiteralInteger177 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural178 = new LiteralUnlimitedNatural();
			public ControlFlow SingleDelegation_P_P_Signal_main_ControlFlow179 = new ControlFlow();
		public SignalEvent SingleDelegation_P_P_Signal_SignalEventS = new SignalEvent();

	public static SingleDelegation_P_P_SignalModel instance()
	{
		if (instance == null)
        {
            instance = new SingleDelegation_P_P_SignalModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public SingleDelegation_P_P_SignalModel()
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
		this.initializeInitialNode_Instances();
		this.initializeInputPin_Instances();
		this.initializeInterface_Instances();
		this.initializeInterfaceRealization_Instances();
		this.initializeLiteralBoolean_Instances();
		this.initializeLiteralInteger_Instances();
		this.initializeLiteralString_Instances();
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
		// AcceptEventAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::Accept Continue
		addToElementRepository("Accept Continue", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue.setName("Accept Continue");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue.setVisibility(VisibilityKind.package_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue.addResult(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue.addTrigger(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_Trigger120);
		// AcceptEventAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::Accept Start
		addToElementRepository("Accept Start", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start.setName("Accept Start");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start.addResult(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start.addTrigger(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger128);
		// AcceptEventAction SingleDelegation_P_P_Signal_B_BClassifierBehavior::Accept S
		addToElementRepository("Accept S", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S.setName("Accept S");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S.addResult(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S.addTrigger(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger16);
	}

	private void initializeActivity_Instances()
	{
		// Activity SingleDelegation_P_P_Signal_Tester::testActivity
		addToElementRepository("testActivity", SingleDelegation_P_P_Signal_Tester_testActivity);
		SingleDelegation_P_P_Signal_Tester_testActivity.setName("testActivity");
		SingleDelegation_P_P_Signal_Tester_testActivity.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity.addOwnedBehavior(SingleDelegation_P_P_Signal_Tester_testActivity_testP);
		SingleDelegation_P_P_Signal_Tester_testActivity.addNode(SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage);
		SingleDelegation_P_P_Signal_Tester_testActivity.addNode(SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a);
		SingleDelegation_P_P_Signal_Tester_testActivity.addNode(SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p);
		SingleDelegation_P_P_Signal_Tester_testActivity.addNode(SingleDelegation_P_P_Signal_Tester_testActivity_this);
		SingleDelegation_P_P_Signal_Tester_testActivity.addNode(SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP);
		SingleDelegation_P_P_Signal_Tester_testActivity.addNode(SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage);
		SingleDelegation_P_P_Signal_Tester_testActivity.addNode(SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b);
		SingleDelegation_P_P_Signal_Tester_testActivity.addNode(SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage);
		SingleDelegation_P_P_Signal_Tester_testActivity.addNode(SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage);
		SingleDelegation_P_P_Signal_Tester_testActivity.addEdge(SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47);
		SingleDelegation_P_P_Signal_Tester_testActivity.addEdge(SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow66);
		SingleDelegation_P_P_Signal_Tester_testActivity.addEdge(SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50);
		SingleDelegation_P_P_Signal_Tester_testActivity.addEdge(SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57);
		SingleDelegation_P_P_Signal_Tester_testActivity.addEdge(SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60);
		SingleDelegation_P_P_Signal_Tester_testActivity.addEdge(SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow95);
		SingleDelegation_P_P_Signal_Tester_testActivity.addEdge(SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99);
		SingleDelegation_P_P_Signal_Tester_testActivity.addEdge(SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63);
		// Activity SingleDelegation_P_P_Signal_B::BClassifierBehavior
		addToElementRepository("BClassifierBehavior", SingleDelegation_P_P_Signal_B_BClassifierBehavior);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.setName("BClassifierBehavior");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addNode(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addNode(SingleDelegation_P_P_Signal_B_BClassifierBehavior_this);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addNode(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addNode(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addNode(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Initial);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addNode(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addNode(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addNode(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Fork_S);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow6);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow44);
		// Activity SingleDelegation_P_P_Signal_Tester::TesterClassifierBehavior
		addToElementRepository("TesterClassifierBehavior", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.setName("TesterClassifierBehavior");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addNode(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addNode(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addNode(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addNode(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addNode(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addNode(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Initial);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addNode(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addNode(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addNode(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addNode(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow124);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow129);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow106);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153);
		// Activity SingleDelegation_P_P_Signal::main
		addToElementRepository("main", SingleDelegation_P_P_Signal_main);
		SingleDelegation_P_P_Signal_main.setName("main");
		SingleDelegation_P_P_Signal_main.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main.addNode(SingleDelegation_P_P_Signal_main_Start_Tester);
		SingleDelegation_P_P_Signal_main.addNode(SingleDelegation_P_P_Signal_main_Send_Start);
		SingleDelegation_P_P_Signal_main.addNode(SingleDelegation_P_P_Signal_main_Tester_);
		SingleDelegation_P_P_Signal_main.addNode(SingleDelegation_P_P_Signal_main_Fork_Tester);
		SingleDelegation_P_P_Signal_main.addNode(SingleDelegation_P_P_Signal_main_Create_Tester);
		SingleDelegation_P_P_Signal_main.addEdge(SingleDelegation_P_P_Signal_main_ObjectFlow156);
		SingleDelegation_P_P_Signal_main.addEdge(SingleDelegation_P_P_Signal_main_ObjectFlow163);
		SingleDelegation_P_P_Signal_main.addEdge(SingleDelegation_P_P_Signal_main_ObjectFlow171);
		SingleDelegation_P_P_Signal_main.addEdge(SingleDelegation_P_P_Signal_main_ObjectFlow174);
		SingleDelegation_P_P_Signal_main.addEdge(SingleDelegation_P_P_Signal_main_ControlFlow179);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction SingleDelegation_P_P_Signal_B_BClassifierBehavior::Set this.p
		addToElementRepository("Set this.p", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p.setName("Set this.p");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p.setStructuralFeature(SingleDelegation_P_P_Signal_B_p);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p.setObject(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p.setValue(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p.setResult(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association SingleDelegation_P_P_Signal::R
		addToElementRepository("R", SingleDelegation_P_P_Signal_R);
		SingleDelegation_P_P_Signal_R.setName("R");
		SingleDelegation_P_P_Signal_R.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_R.addOwnedEnd(SingleDelegation_P_P_Signal_R_x);
		SingleDelegation_P_P_Signal_R.addOwnedEnd(SingleDelegation_P_P_Signal_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction SingleDelegation_P_P_Signal_Tester_testActivity::WriteLine(EndMessage)
		addToElementRepository("WriteLine(EndMessage)", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage.setName("WriteLine(EndMessage)");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage.addResult(SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage.addArgument(SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value);
		// CallBehaviorAction SingleDelegation_P_P_Signal_Tester_testActivity::Call testP
		addToElementRepository("Call testP", SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP);
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP.setName("Call testP");
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP.setBehavior(SingleDelegation_P_P_Signal_Tester_testActivity_testP);
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP.addArgument(SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p);
		// CallBehaviorAction SingleDelegation_P_P_Signal_Tester_testActivity::WriteLine(InitialMessage)
		addToElementRepository("WriteLine(InitialMessage)", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage.setName("WriteLine(InitialMessage)");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage.addResult(SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage.addArgument(SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::Call test()
		addToElementRepository("Call test()", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_.setName("Call test()");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_.setOperation(SingleDelegation_P_P_Signal_Tester_test);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_.setTarget(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		// CallOperationAction SingleDelegation_P_P_Signal_main::Tester()
		addToElementRepository("Tester()", SingleDelegation_P_P_Signal_main_Tester_);
		SingleDelegation_P_P_Signal_main_Tester_.setName("Tester()");
		SingleDelegation_P_P_Signal_main_Tester_.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_main_Tester_.addResult(SingleDelegation_P_P_Signal_main_Tester__result);
		SingleDelegation_P_P_Signal_main_Tester_.setOperation(SingleDelegation_P_P_Signal_Tester_Tester_Tester);
		SingleDelegation_P_P_Signal_main_Tester_.setTarget(SingleDelegation_P_P_Signal_main_Tester__target);
	}

	private void initializeClass_Instances()
	{
		// Class SingleDelegation_P_P_Signal::AbstractTester
		addToElementRepository("AbstractTester", SingleDelegation_P_P_Signal_AbstractTester);
		SingleDelegation_P_P_Signal_AbstractTester.setName("AbstractTester");
		SingleDelegation_P_P_Signal_AbstractTester.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_AbstractTester.setIsAbstract(true);
		
		
		SingleDelegation_P_P_Signal_AbstractTester.setIsActive(true);
		SingleDelegation_P_P_Signal_AbstractTester.addOwnedOperation(SingleDelegation_P_P_Signal_AbstractTester_test);
		SingleDelegation_P_P_Signal_AbstractTester.addOwnedReception(SingleDelegation_P_P_Signal_AbstractTester_Start);
		SingleDelegation_P_P_Signal_AbstractTester.addOwnedReception(SingleDelegation_P_P_Signal_AbstractTester_Continue);
		// Class SingleDelegation_P_P_Signal::B
		addToElementRepository("B", SingleDelegation_P_P_Signal_B);
		SingleDelegation_P_P_Signal_B.setName("B");
		SingleDelegation_P_P_Signal_B.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_B.addOwnedAttribute(SingleDelegation_P_P_Signal_B_p);
		SingleDelegation_P_P_Signal_B.setClassifierBehavior(SingleDelegation_P_P_Signal_B_BClassifierBehavior);
		SingleDelegation_P_P_Signal_B.addOwnedBehavior(SingleDelegation_P_P_Signal_B_BClassifierBehavior);
		SingleDelegation_P_P_Signal_B.addInterfaceRealization(SingleDelegation_P_P_Signal_B_IRealization);
		
		SingleDelegation_P_P_Signal_B.setIsActive(true);
		SingleDelegation_P_P_Signal_B.addOwnedOperation(SingleDelegation_P_P_Signal_B_B_B);
		SingleDelegation_P_P_Signal_B.addOwnedReception(SingleDelegation_P_P_Signal_B_S);
		// Class SingleDelegation_P_P_Signal::IImpl
		addToElementRepository("IImpl", SingleDelegation_P_P_Signal_IImpl);
		SingleDelegation_P_P_Signal_IImpl.setName("IImpl");
		SingleDelegation_P_P_Signal_IImpl.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_IImpl.addInterfaceRealization(SingleDelegation_P_P_Signal_IImpl_IRealization);
		
		SingleDelegation_P_P_Signal_IImpl.addOwnedReception(SingleDelegation_P_P_Signal_IImpl_S);
		// Class SingleDelegation_P_P_Signal::A
		addToElementRepository("A", SingleDelegation_P_P_Signal_A);
		SingleDelegation_P_P_Signal_A.setName("A");
		SingleDelegation_P_P_Signal_A.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_A.addOwnedAttribute(SingleDelegation_P_P_Signal_A_q);
		SingleDelegation_P_P_Signal_A.addOwnedAttribute(SingleDelegation_P_P_Signal_A_b);
		
		SingleDelegation_P_P_Signal_A.addOwnedConnector(SingleDelegation_P_P_Signal_A_r);
		SingleDelegation_P_P_Signal_A.addOwnedOperation(SingleDelegation_P_P_Signal_A_A_A);
		// Class SingleDelegation_P_P_Signal::Tester
		addToElementRepository("Tester", SingleDelegation_P_P_Signal_Tester);
		SingleDelegation_P_P_Signal_Tester.setName("Tester");
		SingleDelegation_P_P_Signal_Tester.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester.addGeneralization(SingleDelegation_P_P_Signal_Tester_Generalization102);
		SingleDelegation_P_P_Signal_Tester.addOwnedAttribute(SingleDelegation_P_P_Signal_Tester_a);
		SingleDelegation_P_P_Signal_Tester.setClassifierBehavior(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior);
		SingleDelegation_P_P_Signal_Tester.addOwnedBehavior(SingleDelegation_P_P_Signal_Tester_testActivity);
		SingleDelegation_P_P_Signal_Tester.addOwnedBehavior(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior);
		
		SingleDelegation_P_P_Signal_Tester.setIsActive(true);
		SingleDelegation_P_P_Signal_Tester.addOwnedOperation(SingleDelegation_P_P_Signal_Tester_Tester_Tester);
		SingleDelegation_P_P_Signal_Tester.addOwnedOperation(SingleDelegation_P_P_Signal_Tester_test);
	}

	private void initializeComment_Instances()
	{
		// Comment SingleDelegation_P_P_Signal::Comment0
		addToElementRepository("Comment0", SingleDelegation_P_P_Signal_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment SingleDelegation_P_P_Signal::Comment2
		addToElementRepository("Comment2", SingleDelegation_P_P_Signal_Comment2);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector SingleDelegation_P_P_Signal_A::r
		addToElementRepository("r", SingleDelegation_P_P_Signal_A_r);
		SingleDelegation_P_P_Signal_A_r.setName("r");
		SingleDelegation_P_P_Signal_A_r.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_A_r.addEnd(SingleDelegation_P_P_Signal_A_r_ConnectorEnd45);
		SingleDelegation_P_P_Signal_A_r.addEnd(SingleDelegation_P_P_Signal_A_r_ConnectorEnd46);
		SingleDelegation_P_P_Signal_A_r.setType(SingleDelegation_P_P_Signal_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd SingleDelegation_P_P_Signal_A_r::ConnectorEnd45
		addToElementRepository("ConnectorEnd45", SingleDelegation_P_P_Signal_A_r_ConnectorEnd45);
		SingleDelegation_P_P_Signal_A_r_ConnectorEnd45.setRole(SingleDelegation_P_P_Signal_A_q);
		// ConnectorEnd SingleDelegation_P_P_Signal_A_r::ConnectorEnd46
		addToElementRepository("ConnectorEnd46", SingleDelegation_P_P_Signal_A_r_ConnectorEnd46);
		SingleDelegation_P_P_Signal_A_r_ConnectorEnd46.setRole(SingleDelegation_P_P_Signal_A_b);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior::ControlFlow6
		addToElementRepository("ControlFlow6", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow6);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow6.setName("ControlFlow6");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow6.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow6.setSource(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow6.setTarget(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue);
		// ControlFlow SingleDelegation_P_P_Signal_Tester_testActivity::ControlFlow66
		addToElementRepository("ControlFlow66", SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow66);
		SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow66.setName("ControlFlow66");
		SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow66.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow66.setSource(SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage);
		SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow66.setTarget(SingleDelegation_P_P_Signal_Tester_testActivity_this);
		// ControlFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow124
		addToElementRepository("ControlFlow124", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow124);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow124.setName("ControlFlow124");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow124.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow124.setSource(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Initial);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow124.setTarget(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		// ControlFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow129
		addToElementRepository("ControlFlow129", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow129);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow129.setName("ControlFlow129");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow129.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow129.setSource(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow129.setTarget(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this);
		// ControlFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow106
		addToElementRepository("ControlFlow106", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow106);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow106.setName("ControlFlow106");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow106.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow106.setSource(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow106.setTarget(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_);
		// ControlFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior::ControlFlow44
		addToElementRepository("ControlFlow44", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow44);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow44.setName("ControlFlow44");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow44.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow44.setSource(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Initial);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ControlFlow44.setTarget(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S);
		// ControlFlow SingleDelegation_P_P_Signal_main::ControlFlow179
		addToElementRepository("ControlFlow179", SingleDelegation_P_P_Signal_main_ControlFlow179);
		SingleDelegation_P_P_Signal_main_ControlFlow179.setName("ControlFlow179");
		SingleDelegation_P_P_Signal_main_ControlFlow179.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_main_ControlFlow179.setSource(SingleDelegation_P_P_Signal_main_Start_Tester);
		SingleDelegation_P_P_Signal_main_ControlFlow179.setTarget(SingleDelegation_P_P_Signal_main_Send_Start);
		// ControlFlow SingleDelegation_P_P_Signal_Tester_testActivity::ControlFlow95
		addToElementRepository("ControlFlow95", SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow95);
		SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow95.setName("ControlFlow95");
		SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow95.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow95.setSource(SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP);
		SingleDelegation_P_P_Signal_Tester_testActivity_ControlFlow95.setTarget(SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction SingleDelegation_P_P_Signal_main::Create Tester
		addToElementRepository("Create Tester", SingleDelegation_P_P_Signal_main_Create_Tester);
		SingleDelegation_P_P_Signal_main_Create_Tester.setName("Create Tester");
		SingleDelegation_P_P_Signal_main_Create_Tester.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Create_Tester.setClassifier(SingleDelegation_P_P_Signal_Tester);
		SingleDelegation_P_P_Signal_main_Create_Tester.setResult(SingleDelegation_P_P_Signal_main_Create_Tester_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode SingleDelegation_P_P_Signal_main::Fork Tester
		addToElementRepository("Fork Tester", SingleDelegation_P_P_Signal_main_Fork_Tester);
		SingleDelegation_P_P_Signal_main_Fork_Tester.setName("Fork Tester");
		SingleDelegation_P_P_Signal_main_Fork_Tester.setVisibility(VisibilityKind.public_);
		// ForkNode SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::Fork this
		addToElementRepository("Fork this", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this.setName("Fork this");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this.setVisibility(VisibilityKind.public_);
		// ForkNode SingleDelegation_P_P_Signal_B_BClassifierBehavior::Fork S
		addToElementRepository("Fork S", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Fork_S);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Fork_S.setName("Fork S");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Fork_S.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior SingleDelegation_P_P_Signal_Tester_testActivity::testP
		addToElementRepository("testP", SingleDelegation_P_P_Signal_Tester_testActivity_testP);
		SingleDelegation_P_P_Signal_Tester_testActivity_testP.setName("testP");
		SingleDelegation_P_P_Signal_Tester_testActivity_testP.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_testActivity_testP.addOwnedParameter(SingleDelegation_P_P_Signal_Tester_testActivity_testP_p);
		SingleDelegation_P_P_Signal_Tester_testActivity_testP.addLanguage("Java");
		SingleDelegation_P_P_Signal_Tester_testActivity_testP.addLanguage("Import");
		SingleDelegation_P_P_Signal_Tester_testActivity_testP.addBody("System.out.println(\"Asserting a.b.p == 4\");  	// Test parameter p 	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument p = \" + p); 	 	System.out.println(\"a.b.p == \" + p); 	System.out.print(\"Signal delegated to classifier behavior: \");  	if(p == 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		SingleDelegation_P_P_Signal_Tester_testActivity_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeGeneralization_Instances()
	{
		// Generalization SingleDelegation_P_P_Signal_Tester::Generalization102
		addToElementRepository("Generalization102", SingleDelegation_P_P_Signal_Tester_Generalization102);
		SingleDelegation_P_P_Signal_Tester_Generalization102.setGeneral(SingleDelegation_P_P_Signal_AbstractTester);
	}

	private void initializeInitialNode_Instances()
	{
		// InitialNode SingleDelegation_P_P_Signal_B_BClassifierBehavior::Initial
		addToElementRepository("Initial", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Initial);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Initial.setName("Initial");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Initial.setVisibility(VisibilityKind.public_);
		// InitialNode SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::Initial
		addToElementRepository("Initial", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Initial);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Initial.setName("Initial");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Initial.setVisibility(VisibilityKind.public_);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set this.p::value
		addToElementRepository("value", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value.setName("value");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin SingleDelegation_P_P_Signal_main_Tester()::target
		addToElementRepository("target", SingleDelegation_P_P_Signal_main_Tester__target);
		SingleDelegation_P_P_Signal_main_Tester__target.setName("target");
		SingleDelegation_P_P_Signal_main_Tester__target.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Tester__target.setType(SingleDelegation_P_P_Signal_Tester);
		// InputPin SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(EndMessage)::value
		addToElementRepository("value", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value.setName("value");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin SingleDelegation_P_P_Signal_Tester_testActivity_Read b.p::object
		addToElementRepository("object", SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object.setName("object");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object.setType(SingleDelegation_P_P_Signal_B);
		// InputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ Send S::t
		addToElementRepository("t", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t.setName("t");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t.setType(SingleDelegation_P_P_Signal_AbstractTester);
		// InputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a::object
		addToElementRepository("object", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object.setName("object");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object.setType(SingleDelegation_P_P_Signal_Tester);
		// InputPin SingleDelegation_P_P_Signal_Tester_testActivity_Call testP::p
		addToElementRepository("p", SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p);
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p.setName("p");
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(InitialMessage)::value
		addToElementRepository("value", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value.setName("value");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read s.v::object
		addToElementRepository("object", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object.setName("object");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object.setType(SingleDelegation_P_P_Signal_S);
		// InputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q::object
		addToElementRepository("object", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object.setName("object");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object.setType(SingleDelegation_P_P_Signal_A);
		// InputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read s.t::object
		addToElementRepository("object", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object.setName("object");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object.setType(SingleDelegation_P_P_Signal_S);
		// InputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set this.p::object
		addToElementRepository("object", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object.setName("object");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object.setType(SingleDelegation_P_P_Signal_B);
		// InputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call test()::target
		addToElementRepository("target", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target.setName("target");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target.setType(SingleDelegation_P_P_Signal_Tester);
		// InputPin SingleDelegation_P_P_Signal_Tester_testActivity_Read this.a::object
		addToElementRepository("object", SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object.setName("object");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object.setType(SingleDelegation_P_P_Signal_Tester);
		// InputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ Send S::target
		addToElementRepository("target", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target.setName("target");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target.setType(SingleDelegation_P_P_Signal_IImpl);
		// InputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send Continue::target
		addToElementRepository("target", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target.setName("target");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target.setType(SingleDelegation_P_P_Signal_AbstractTester);
		// InputPin SingleDelegation_P_P_Signal_Tester_testActivity_Read a.b::object
		addToElementRepository("object", SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object.setName("object");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object.setType(SingleDelegation_P_P_Signal_A);
		// InputPin SingleDelegation_P_P_Signal_main_Send Start::target
		addToElementRepository("target", SingleDelegation_P_P_Signal_main_Send_Start_target);
		SingleDelegation_P_P_Signal_main_Send_Start_target.setName("target");
		SingleDelegation_P_P_Signal_main_Send_Start_target.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Send_Start_target.setType(SingleDelegation_P_P_Signal_Tester);
		// InputPin SingleDelegation_P_P_Signal_main_Start Tester::object
		addToElementRepository("object", SingleDelegation_P_P_Signal_main_Start_Tester_object);
		SingleDelegation_P_P_Signal_main_Start_Tester_object.setName("object");
		SingleDelegation_P_P_Signal_main_Start_Tester_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Start_Tester_object.setType(SingleDelegation_P_P_Signal_Tester);
		// InputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ Send S::v
		addToElementRepository("v", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v.setName("v");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeInterface_Instances()
	{
		// Interface SingleDelegation_P_P_Signal::I
		addToElementRepository("I", SingleDelegation_P_P_Signal_I);
		SingleDelegation_P_P_Signal_I.setName("I");
		SingleDelegation_P_P_Signal_I.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_I.addOwnedReception(SingleDelegation_P_P_Signal_I_S);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization SingleDelegation_P_P_Signal_IImpl::IRealization
		addToElementRepository("IRealization", SingleDelegation_P_P_Signal_IImpl_IRealization);
		SingleDelegation_P_P_Signal_IImpl_IRealization.setName("IRealization");
		SingleDelegation_P_P_Signal_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_IImpl_IRealization.setContract(SingleDelegation_P_P_Signal_I);
		// InterfaceRealization SingleDelegation_P_P_Signal_B::IRealization
		addToElementRepository("IRealization", SingleDelegation_P_P_Signal_B_IRealization);
		SingleDelegation_P_P_Signal_B_IRealization.setName("IRealization");
		SingleDelegation_P_P_Signal_B_IRealization.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_IRealization.setContract(SingleDelegation_P_P_Signal_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114::LiteralBoolean115
		addToElementRepository("LiteralBoolean115", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralBoolean115);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralBoolean115.setName("LiteralBoolean115");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralBoolean115.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralBoolean115.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3::LiteralBoolean4
		addToElementRepository("LiteralBoolean4", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3_LiteralBoolean4);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3_LiteralBoolean4.setName("LiteralBoolean4");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3_LiteralBoolean4.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3_LiteralBoolean4.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26::LiteralBoolean27
		addToElementRepository("LiteralBoolean27", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26_LiteralBoolean27);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26_LiteralBoolean27.setName("LiteralBoolean27");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26_LiteralBoolean27.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26_LiteralBoolean27.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99::LiteralBoolean100
		addToElementRepository("LiteralBoolean100", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean100);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean100.setName("LiteralBoolean100");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean100.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean100.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10::LiteralBoolean11
		addToElementRepository("LiteralBoolean11", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralBoolean11);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralBoolean11.setName("LiteralBoolean11");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralBoolean11.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralBoolean11.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117::LiteralBoolean118
		addToElementRepository("LiteralBoolean118", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117_LiteralBoolean118);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117_LiteralBoolean118.setName("LiteralBoolean118");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117_LiteralBoolean118.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117_LiteralBoolean118.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60::LiteralBoolean62
		addToElementRepository("LiteralBoolean62", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60_LiteralBoolean62);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60_LiteralBoolean62.setName("LiteralBoolean62");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60_LiteralBoolean62.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60_LiteralBoolean62.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50::LiteralBoolean51
		addToElementRepository("LiteralBoolean51", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50_LiteralBoolean51);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50_LiteralBoolean51.setName("LiteralBoolean51");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50_LiteralBoolean51.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50_LiteralBoolean51.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_main_ObjectFlow163::LiteralBoolean165
		addToElementRepository("LiteralBoolean165", SingleDelegation_P_P_Signal_main_ObjectFlow163_LiteralBoolean165);
		SingleDelegation_P_P_Signal_main_ObjectFlow163_LiteralBoolean165.setName("LiteralBoolean165");
		SingleDelegation_P_P_Signal_main_ObjectFlow163_LiteralBoolean165.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_ObjectFlow163_LiteralBoolean165.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33::LiteralBoolean34
		addToElementRepository("LiteralBoolean34", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33_LiteralBoolean34);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33_LiteralBoolean34.setName("LiteralBoolean34");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33_LiteralBoolean34.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33_LiteralBoolean34.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57::LiteralBoolean59
		addToElementRepository("LiteralBoolean59", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57_LiteralBoolean59);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57_LiteralBoolean59.setName("LiteralBoolean59");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57_LiteralBoolean59.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57_LiteralBoolean59.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150::LiteralBoolean151
		addToElementRepository("LiteralBoolean151", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150_LiteralBoolean151);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150_LiteralBoolean151.setName("LiteralBoolean151");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150_LiteralBoolean151.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150_LiteralBoolean151.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47::LiteralBoolean48
		addToElementRepository("LiteralBoolean48", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47_LiteralBoolean48);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47_LiteralBoolean48.setName("LiteralBoolean48");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47_LiteralBoolean48.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47_LiteralBoolean48.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111::LiteralBoolean112
		addToElementRepository("LiteralBoolean112", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralBoolean112);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralBoolean112.setName("LiteralBoolean112");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralBoolean112.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralBoolean112.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63::LiteralBoolean64
		addToElementRepository("LiteralBoolean64", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63_LiteralBoolean64);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63_LiteralBoolean64.setName("LiteralBoolean64");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63_LiteralBoolean64.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63_LiteralBoolean64.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153::LiteralBoolean155
		addToElementRepository("LiteralBoolean155", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153_LiteralBoolean155);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153_LiteralBoolean155.setName("LiteralBoolean155");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153_LiteralBoolean155.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153_LiteralBoolean155.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7::LiteralBoolean8
		addToElementRepository("LiteralBoolean8", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7_LiteralBoolean8);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7_LiteralBoolean8.setName("LiteralBoolean8");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7_LiteralBoolean8.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7_LiteralBoolean8.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23::LiteralBoolean25
		addToElementRepository("LiteralBoolean25", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralBoolean25);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralBoolean25.setName("LiteralBoolean25");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralBoolean25.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralBoolean25.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_main_ObjectFlow171::LiteralBoolean172
		addToElementRepository("LiteralBoolean172", SingleDelegation_P_P_Signal_main_ObjectFlow171_LiteralBoolean172);
		SingleDelegation_P_P_Signal_main_ObjectFlow171_LiteralBoolean172.setName("LiteralBoolean172");
		SingleDelegation_P_P_Signal_main_ObjectFlow171_LiteralBoolean172.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_ObjectFlow171_LiteralBoolean172.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_main_ObjectFlow174::LiteralBoolean175
		addToElementRepository("LiteralBoolean175", SingleDelegation_P_P_Signal_main_ObjectFlow174_LiteralBoolean175);
		SingleDelegation_P_P_Signal_main_ObjectFlow174_LiteralBoolean175.setName("LiteralBoolean175");
		SingleDelegation_P_P_Signal_main_ObjectFlow174_LiteralBoolean175.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_ObjectFlow174_LiteralBoolean175.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_main_ObjectFlow156::LiteralBoolean158
		addToElementRepository("LiteralBoolean158", SingleDelegation_P_P_Signal_main_ObjectFlow156_LiteralBoolean158);
		SingleDelegation_P_P_Signal_main_ObjectFlow156_LiteralBoolean158.setName("LiteralBoolean158");
		SingleDelegation_P_P_Signal_main_ObjectFlow156_LiteralBoolean158.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_ObjectFlow156_LiteralBoolean158.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103::LiteralBoolean105
		addToElementRepository("LiteralBoolean105", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103_LiteralBoolean105);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103_LiteralBoolean105.setName("LiteralBoolean105");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103_LiteralBoolean105.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103_LiteralBoolean105.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147::LiteralBoolean149
		addToElementRepository("LiteralBoolean149", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147_LiteralBoolean149);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147_LiteralBoolean149.setName("LiteralBoolean149");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147_LiteralBoolean149.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147_LiteralBoolean149.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57::LiteralInteger58
		addToElementRepository("LiteralInteger58", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57_LiteralInteger58);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57_LiteralInteger58.setName("LiteralInteger58");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57_LiteralInteger58.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57_LiteralInteger58.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147::LiteralInteger148
		addToElementRepository("LiteralInteger148", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147_LiteralInteger148);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147_LiteralInteger148.setName("LiteralInteger148");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147_LiteralInteger148.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147_LiteralInteger148.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_main_Send Start_target::LiteralInteger161
		addToElementRepository("LiteralInteger161", SingleDelegation_P_P_Signal_main_Send_Start_target_LiteralInteger161);
		SingleDelegation_P_P_Signal_main_Send_Start_target_LiteralInteger161.setName("LiteralInteger161");
		SingleDelegation_P_P_Signal_main_Send_Start_target_LiteralInteger161.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Send_Start_target_LiteralInteger161.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(EndMessage)_value::LiteralInteger67
		addToElementRepository("LiteralInteger67", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralInteger67);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralInteger67.setName("LiteralInteger67");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralInteger67.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralInteger67.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a_object::LiteralInteger108
		addToElementRepository("LiteralInteger108", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger108);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger108.setName("LiteralInteger108");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger108.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger108.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call test()_target::LiteralInteger131
		addToElementRepository("LiteralInteger131", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger131);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger131.setName("LiteralInteger131");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger131.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger131.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ Send S_t::LiteralInteger139
		addToElementRepository("LiteralInteger139", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t_LiteralInteger139);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t_LiteralInteger139.setName("LiteralInteger139");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t_LiteralInteger139.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t_LiteralInteger139.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q_result::LiteralInteger136
		addToElementRepository("LiteralInteger136", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger136);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger136.setName("LiteralInteger136");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger136.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger136.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111::LiteralInteger113
		addToElementRepository("LiteralInteger113", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralInteger113);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralInteger113.setName("LiteralInteger113");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralInteger113.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralInteger113.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(InitialMessage)_errorStatus::LiteralInteger91
		addToElementRepository("LiteralInteger91", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralInteger91);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralInteger91.setName("LiteralInteger91");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralInteger91.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralInteger91.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Call testP_p::LiteralInteger80
		addToElementRepository("LiteralInteger80", SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger80);
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger80.setName("LiteralInteger80");
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger80.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger80.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99::LiteralInteger101
		addToElementRepository("LiteralInteger101", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger101);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger101.setName("LiteralInteger101");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger101.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger101.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result::LiteralInteger18
		addToElementRepository("LiteralInteger18", SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger18);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger18.setName("LiteralInteger18");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger18.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger18.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ Send S_target::LiteralInteger141
		addToElementRepository("LiteralInteger141", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target_LiteralInteger141);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target_LiteralInteger141.setName("LiteralInteger141");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target_LiteralInteger141.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target_LiteralInteger141.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_main_ObjectFlow171::LiteralInteger173
		addToElementRepository("LiteralInteger173", SingleDelegation_P_P_Signal_main_ObjectFlow171_LiteralInteger173);
		SingleDelegation_P_P_Signal_main_ObjectFlow171_LiteralInteger173.setName("LiteralInteger173");
		SingleDelegation_P_P_Signal_main_ObjectFlow171_LiteralInteger173.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_ObjectFlow171_LiteralInteger173.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153::LiteralInteger154
		addToElementRepository("LiteralInteger154", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153_LiteralInteger154);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153_LiteralInteger154.setName("LiteralInteger154");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153_LiteralInteger154.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153_LiteralInteger154.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_main_Tester()_result::LiteralInteger169
		addToElementRepository("LiteralInteger169", SingleDelegation_P_P_Signal_main_Tester__result_LiteralInteger169);
		SingleDelegation_P_P_Signal_main_Tester__result_LiteralInteger169.setName("LiteralInteger169");
		SingleDelegation_P_P_Signal_main_Tester__result_LiteralInteger169.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Tester__result_LiteralInteger169.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Read this.a_object::LiteralInteger54
		addToElementRepository("LiteralInteger54", SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger54);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger54.setName("LiteralInteger54");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger54.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger54.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(InitialMessage)_value::LiteralInteger93
		addToElementRepository("LiteralInteger93", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralInteger93);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralInteger93.setName("LiteralInteger93");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralInteger93.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralInteger93.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33::LiteralInteger35
		addToElementRepository("LiteralInteger35", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33_LiteralInteger35);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33_LiteralInteger35.setName("LiteralInteger35");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33_LiteralInteger35.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33_LiteralInteger35.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_main_Start Tester_object::LiteralInteger160
		addToElementRepository("LiteralInteger160", SingleDelegation_P_P_Signal_main_Start_Tester_object_LiteralInteger160);
		SingleDelegation_P_P_Signal_main_Start_Tester_object_LiteralInteger160.setName("LiteralInteger160");
		SingleDelegation_P_P_Signal_main_Start_Tester_object_LiteralInteger160.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Start_Tester_object_LiteralInteger160.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read s.v_result::LiteralInteger20
		addToElementRepository("LiteralInteger20", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger20);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger20.setName("LiteralInteger20");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger20.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger20.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(InitialMessage)_errorStatus::LiteralInteger89
		addToElementRepository("LiteralInteger89", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralInteger89);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralInteger89.setName("LiteralInteger89");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralInteger89.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralInteger89.setValue(0);
		// LiteralInteger SingleDelegation_P_P_Signal_main_Create Tester_result::LiteralInteger177
		addToElementRepository("LiteralInteger177", SingleDelegation_P_P_Signal_main_Create_Tester_result_LiteralInteger177);
		SingleDelegation_P_P_Signal_main_Create_Tester_result_LiteralInteger177.setName("LiteralInteger177");
		SingleDelegation_P_P_Signal_main_Create_Tester_result_LiteralInteger177.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Create_Tester_result_LiteralInteger177.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a_result::LiteralInteger109
		addToElementRepository("LiteralInteger109", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger109);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger109.setName("LiteralInteger109");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger109.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger109.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_main_Tester()_result::LiteralInteger168
		addToElementRepository("LiteralInteger168", SingleDelegation_P_P_Signal_main_Tester__result_LiteralInteger168);
		SingleDelegation_P_P_Signal_main_Tester__result_LiteralInteger168.setName("LiteralInteger168");
		SingleDelegation_P_P_Signal_main_Tester__result_LiteralInteger168.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Tester__result_LiteralInteger168.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(EndMessage)_value::LiteralInteger69
		addToElementRepository("LiteralInteger69", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralInteger69);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralInteger69.setName("LiteralInteger69");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralInteger69.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralInteger69.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ Send S_v::LiteralInteger142
		addToElementRepository("LiteralInteger142", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v_LiteralInteger142);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v_LiteralInteger142.setName("LiteralInteger142");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v_LiteralInteger142.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v_LiteralInteger142.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_this_result::LiteralInteger78
		addToElementRepository("LiteralInteger78", SingleDelegation_P_P_Signal_Tester_testActivity_this_result_LiteralInteger78);
		SingleDelegation_P_P_Signal_Tester_testActivity_this_result_LiteralInteger78.setName("LiteralInteger78");
		SingleDelegation_P_P_Signal_Tester_testActivity_this_result_LiteralInteger78.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_this_result_LiteralInteger78.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int(4)_result::LiteralInteger145
		addToElementRepository("LiteralInteger145", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result_LiteralInteger145);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result_LiteralInteger145.setName("LiteralInteger145");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result_LiteralInteger145.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result_LiteralInteger145.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Read a.b_result::LiteralInteger85
		addToElementRepository("LiteralInteger85", SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger85);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger85.setName("LiteralInteger85");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger85.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger85.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10::LiteralInteger12
		addToElementRepository("LiteralInteger12", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralInteger12);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralInteger12.setName("LiteralInteger12");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralInteger12.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralInteger12.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set this.p_object::LiteralInteger38
		addToElementRepository("LiteralInteger38", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger38);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger38.setName("LiteralInteger38");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger38.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger38.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Read b.p_result::LiteralInteger75
		addToElementRepository("LiteralInteger75", SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger75);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger75.setName("LiteralInteger75");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger75.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger75.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23::LiteralInteger24
		addToElementRepository("LiteralInteger24", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralInteger24);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralInteger24.setName("LiteralInteger24");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralInteger24.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralInteger24.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept S_result::LiteralInteger15
		addToElementRepository("LiteralInteger15", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralInteger15);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralInteger15.setName("LiteralInteger15");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralInteger15.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralInteger15.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralInteger126
		addToElementRepository("LiteralInteger126", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger126);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger126.setName("LiteralInteger126");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger126.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger126.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result::LiteralInteger97
		addToElementRepository("LiteralInteger97", SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result_LiteralInteger97);
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result_LiteralInteger97.setName("LiteralInteger97");
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result_LiteralInteger97.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result_LiteralInteger97.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result::LiteralInteger132
		addToElementRepository("LiteralInteger132", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger132);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger132.setName("LiteralInteger132");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger132.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger132.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Call testP_p::LiteralInteger79
		addToElementRepository("LiteralInteger79", SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger79);
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger79.setName("LiteralInteger79");
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger79.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger79.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117::LiteralInteger119
		addToElementRepository("LiteralInteger119", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117_LiteralInteger119);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117_LiteralInteger119.setName("LiteralInteger119");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117_LiteralInteger119.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117_LiteralInteger119.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_main_Tester()_target::LiteralInteger166
		addToElementRepository("LiteralInteger166", SingleDelegation_P_P_Signal_main_Tester__target_LiteralInteger166);
		SingleDelegation_P_P_Signal_main_Tester__target_LiteralInteger166.setName("LiteralInteger166");
		SingleDelegation_P_P_Signal_main_Tester__target_LiteralInteger166.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Tester__target_LiteralInteger166.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send Continue_target::LiteralInteger43
		addToElementRepository("LiteralInteger43", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger43);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger43.setName("LiteralInteger43");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger43.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger43.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7::LiteralInteger9
		addToElementRepository("LiteralInteger9", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7_LiteralInteger9);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7_LiteralInteger9.setName("LiteralInteger9");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7_LiteralInteger9.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7_LiteralInteger9.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read s.t_object::LiteralInteger29
		addToElementRepository("LiteralInteger29", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger29);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger29.setName("LiteralInteger29");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger29.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger29.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int(4)::LiteralInteger146
		addToElementRepository("LiteralInteger146", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_LiteralInteger146);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_LiteralInteger146.setName("LiteralInteger146");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_LiteralInteger146.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_LiteralInteger146.setValue(4);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result::LiteralInteger84
		addToElementRepository("LiteralInteger84", SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result_LiteralInteger84);
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result_LiteralInteger84.setName("LiteralInteger84");
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result_LiteralInteger84.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result_LiteralInteger84.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q_object::LiteralInteger135
		addToElementRepository("LiteralInteger135", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger135);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger135.setName("LiteralInteger135");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger135.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger135.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set this.p_value::LiteralInteger36
		addToElementRepository("LiteralInteger36", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger36);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger36.setName("LiteralInteger36");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger36.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger36.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read s.v_object::LiteralInteger21
		addToElementRepository("LiteralInteger21", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger21);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger21.setName("LiteralInteger21");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger21.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger21.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60::LiteralInteger61
		addToElementRepository("LiteralInteger61", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60_LiteralInteger61);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60_LiteralInteger61.setName("LiteralInteger61");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60_LiteralInteger61.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60_LiteralInteger61.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_result::LiteralInteger122
		addToElementRepository("LiteralInteger122", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger122);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger122.setName("LiteralInteger122");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger122.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger122.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept S_result::LiteralInteger13
		addToElementRepository("LiteralInteger13", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralInteger13);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralInteger13.setName("LiteralInteger13");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralInteger13.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralInteger13.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(EndMessage)_errorStatus::LiteralInteger70
		addToElementRepository("LiteralInteger70", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralInteger70);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralInteger70.setName("LiteralInteger70");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralInteger70.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralInteger70.setValue(0);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_result::LiteralInteger123
		addToElementRepository("LiteralInteger123", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger123);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger123.setName("LiteralInteger123");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger123.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralInteger123.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(EndMessage)_errorStatus::LiteralInteger71
		addToElementRepository("LiteralInteger71", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralInteger71);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralInteger71.setName("LiteralInteger71");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralInteger71.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralInteger71.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50::LiteralInteger52
		addToElementRepository("LiteralInteger52", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50_LiteralInteger52);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50_LiteralInteger52.setName("LiteralInteger52");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50_LiteralInteger52.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50_LiteralInteger52.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63::LiteralInteger65
		addToElementRepository("LiteralInteger65", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63_LiteralInteger65);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63_LiteralInteger65.setName("LiteralInteger65");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63_LiteralInteger65.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63_LiteralInteger65.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150::LiteralInteger152
		addToElementRepository("LiteralInteger152", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150_LiteralInteger152);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150_LiteralInteger152.setName("LiteralInteger152");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150_LiteralInteger152.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150_LiteralInteger152.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_main_ObjectFlow174::LiteralInteger176
		addToElementRepository("LiteralInteger176", SingleDelegation_P_P_Signal_main_ObjectFlow174_LiteralInteger176);
		SingleDelegation_P_P_Signal_main_ObjectFlow174_LiteralInteger176.setName("LiteralInteger176");
		SingleDelegation_P_P_Signal_main_ObjectFlow174_LiteralInteger176.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_ObjectFlow174_LiteralInteger176.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set this.p_result::LiteralInteger40
		addToElementRepository("LiteralInteger40", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger40);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger40.setName("LiteralInteger40");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger40.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger40.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Read b.p_object::LiteralInteger73
		addToElementRepository("LiteralInteger73", SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger73);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger73.setName("LiteralInteger73");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger73.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger73.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26::LiteralInteger28
		addToElementRepository("LiteralInteger28", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26_LiteralInteger28);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26_LiteralInteger28.setName("LiteralInteger28");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26_LiteralInteger28.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26_LiteralInteger28.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Read a.b_object::LiteralInteger87
		addToElementRepository("LiteralInteger87", SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger87);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger87.setName("LiteralInteger87");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger87.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger87.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(InitialMessage)_value::LiteralInteger92
		addToElementRepository("LiteralInteger92", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralInteger92);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralInteger92.setName("LiteralInteger92");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralInteger92.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralInteger92.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47::LiteralInteger49
		addToElementRepository("LiteralInteger49", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47_LiteralInteger49);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47_LiteralInteger49.setName("LiteralInteger49");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47_LiteralInteger49.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47_LiteralInteger49.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read s.t_result::LiteralInteger32
		addToElementRepository("LiteralInteger32", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger32);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger32.setName("LiteralInteger32");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger32.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger32.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103::LiteralInteger104
		addToElementRepository("LiteralInteger104", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103_LiteralInteger104);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103_LiteralInteger104.setName("LiteralInteger104");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103_LiteralInteger104.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103_LiteralInteger104.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114::LiteralInteger116
		addToElementRepository("LiteralInteger116", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralInteger116);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralInteger116.setName("LiteralInteger116");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralInteger116.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralInteger116.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_main_ObjectFlow163::LiteralInteger164
		addToElementRepository("LiteralInteger164", SingleDelegation_P_P_Signal_main_ObjectFlow163_LiteralInteger164);
		SingleDelegation_P_P_Signal_main_ObjectFlow163_LiteralInteger164.setName("LiteralInteger164");
		SingleDelegation_P_P_Signal_main_ObjectFlow163_LiteralInteger164.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_ObjectFlow163_LiteralInteger164.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_testActivity_Read this.a_result::LiteralInteger56
		addToElementRepository("LiteralInteger56", SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger56);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger56.setName("LiteralInteger56");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger56.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger56.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3::LiteralInteger5
		addToElementRepository("LiteralInteger5", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3_LiteralInteger5);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3_LiteralInteger5.setName("LiteralInteger5");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3_LiteralInteger5.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3_LiteralInteger5.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_main_ObjectFlow156::LiteralInteger157
		addToElementRepository("LiteralInteger157", SingleDelegation_P_P_Signal_main_ObjectFlow156_LiteralInteger157);
		SingleDelegation_P_P_Signal_main_ObjectFlow156_LiteralInteger157.setName("LiteralInteger157");
		SingleDelegation_P_P_Signal_main_ObjectFlow156_LiteralInteger157.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_ObjectFlow156_LiteralInteger157.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralInteger127
		addToElementRepository("LiteralInteger127", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger127);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger127.setName("LiteralInteger127");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger127.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger127.setValue(1);
	}

	private void initializeLiteralString_Instances()
	{
		// LiteralString SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage::LiteralString82
		addToElementRepository("LiteralString82", SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_LiteralString82);
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_LiteralString82.setName("LiteralString82");
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_LiteralString82.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_LiteralString82.setValue("-- Running test case: Single delegation connector - Signal delegated from port to part --");
		// LiteralString SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage::LiteralString98
		addToElementRepository("LiteralString98", SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_LiteralString98);
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_LiteralString98.setName("LiteralString98");
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_LiteralString98.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_LiteralString98.setValue("-- End of test case --");
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result::LiteralUnlimitedNatural83
		addToElementRepository("LiteralUnlimitedNatural83", SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result_LiteralUnlimitedNatural83);
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result_LiteralUnlimitedNatural83.setName("LiteralUnlimitedNatural83");
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result_LiteralUnlimitedNatural83.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result_LiteralUnlimitedNatural83.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_main_Start Tester_object::LiteralUnlimitedNatural159
		addToElementRepository("LiteralUnlimitedNatural159", SingleDelegation_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural159);
		SingleDelegation_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural159.setName("LiteralUnlimitedNatural159");
		SingleDelegation_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural159.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural159.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(EndMessage)_value::LiteralUnlimitedNatural68
		addToElementRepository("LiteralUnlimitedNatural68", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralUnlimitedNatural68);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralUnlimitedNatural68.setName("LiteralUnlimitedNatural68");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralUnlimitedNatural68.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value_LiteralUnlimitedNatural68.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept S_result::LiteralUnlimitedNatural14
		addToElementRepository("LiteralUnlimitedNatural14", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural14);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural14.setName("LiteralUnlimitedNatural14");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural14.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result_LiteralUnlimitedNatural14.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Read b.p_object::LiteralUnlimitedNatural74
		addToElementRepository("LiteralUnlimitedNatural74", SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural74);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural74.setName("LiteralUnlimitedNatural74");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural74.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural74.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_main_Send Start_target::LiteralUnlimitedNatural162
		addToElementRepository("LiteralUnlimitedNatural162", SingleDelegation_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural162);
		SingleDelegation_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural162.setName("LiteralUnlimitedNatural162");
		SingleDelegation_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural162.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural162.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a_result::LiteralUnlimitedNatural110
		addToElementRepository("LiteralUnlimitedNatural110", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural110);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural110.setName("LiteralUnlimitedNatural110");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural110.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural110.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read s.v_object::LiteralUnlimitedNatural22
		addToElementRepository("LiteralUnlimitedNatural22", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural22);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural22.setName("LiteralUnlimitedNatural22");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural22.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural22.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result::LiteralUnlimitedNatural133
		addToElementRepository("LiteralUnlimitedNatural133", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural133);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural133.setName("LiteralUnlimitedNatural133");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural133.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural133.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send Continue_target::LiteralUnlimitedNatural42
		addToElementRepository("LiteralUnlimitedNatural42", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural42);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural42.setName("LiteralUnlimitedNatural42");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural42.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural42.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_main_Create Tester_result::LiteralUnlimitedNatural178
		addToElementRepository("LiteralUnlimitedNatural178", SingleDelegation_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural178);
		SingleDelegation_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural178.setName("LiteralUnlimitedNatural178");
		SingleDelegation_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural178.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural178.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ Send S_t::LiteralUnlimitedNatural138
		addToElementRepository("LiteralUnlimitedNatural138", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t_LiteralUnlimitedNatural138);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t_LiteralUnlimitedNatural138.setName("LiteralUnlimitedNatural138");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t_LiteralUnlimitedNatural138.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t_LiteralUnlimitedNatural138.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Read this.a_object::LiteralUnlimitedNatural53
		addToElementRepository("LiteralUnlimitedNatural53", SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural53);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural53.setName("LiteralUnlimitedNatural53");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural53.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural53.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result::LiteralUnlimitedNatural96
		addToElementRepository("LiteralUnlimitedNatural96", SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result_LiteralUnlimitedNatural96);
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result_LiteralUnlimitedNatural96.setName("LiteralUnlimitedNatural96");
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result_LiteralUnlimitedNatural96.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result_LiteralUnlimitedNatural96.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read s.t_result::LiteralUnlimitedNatural31
		addToElementRepository("LiteralUnlimitedNatural31", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural31);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural31.setName("LiteralUnlimitedNatural31");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural31.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural31.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Read b.p_result::LiteralUnlimitedNatural76
		addToElementRepository("LiteralUnlimitedNatural76", SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural76);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural76.setName("LiteralUnlimitedNatural76");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural76.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural76.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ Send S_target::LiteralUnlimitedNatural140
		addToElementRepository("LiteralUnlimitedNatural140", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target_LiteralUnlimitedNatural140);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target_LiteralUnlimitedNatural140.setName("LiteralUnlimitedNatural140");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target_LiteralUnlimitedNatural140.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target_LiteralUnlimitedNatural140.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ Send S_v::LiteralUnlimitedNatural143
		addToElementRepository("LiteralUnlimitedNatural143", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v_LiteralUnlimitedNatural143);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v_LiteralUnlimitedNatural143.setName("LiteralUnlimitedNatural143");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v_LiteralUnlimitedNatural143.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v_LiteralUnlimitedNatural143.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_main_Tester()_target::LiteralUnlimitedNatural167
		addToElementRepository("LiteralUnlimitedNatural167", SingleDelegation_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural167);
		SingleDelegation_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural167.setName("LiteralUnlimitedNatural167");
		SingleDelegation_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural167.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural167.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Call testP_p::LiteralUnlimitedNatural81
		addToElementRepository("LiteralUnlimitedNatural81", SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural81);
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural81.setName("LiteralUnlimitedNatural81");
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural81.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural81.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Read a.b_result::LiteralUnlimitedNatural86
		addToElementRepository("LiteralUnlimitedNatural86", SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural86);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural86.setName("LiteralUnlimitedNatural86");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural86.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural86.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_main_Tester()_result::LiteralUnlimitedNatural170
		addToElementRepository("LiteralUnlimitedNatural170", SingleDelegation_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural170);
		SingleDelegation_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural170.setName("LiteralUnlimitedNatural170");
		SingleDelegation_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural170.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural170.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Read this.a_result::LiteralUnlimitedNatural55
		addToElementRepository("LiteralUnlimitedNatural55", SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural55);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural55.setName("LiteralUnlimitedNatural55");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural55.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural55.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_result::LiteralUnlimitedNatural121
		addToElementRepository("LiteralUnlimitedNatural121", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural121);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural121.setName("LiteralUnlimitedNatural121");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural121.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result_LiteralUnlimitedNatural121.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call test()_target::LiteralUnlimitedNatural130
		addToElementRepository("LiteralUnlimitedNatural130", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural130);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural130.setName("LiteralUnlimitedNatural130");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural130.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural130.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralUnlimitedNatural125
		addToElementRepository("LiteralUnlimitedNatural125", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural125);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural125.setName("LiteralUnlimitedNatural125");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural125.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural125.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_this_result::LiteralUnlimitedNatural77
		addToElementRepository("LiteralUnlimitedNatural77", SingleDelegation_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural77);
		SingleDelegation_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural77.setName("LiteralUnlimitedNatural77");
		SingleDelegation_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural77.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural77.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result::LiteralUnlimitedNatural17
		addToElementRepository("LiteralUnlimitedNatural17", SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural17);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural17.setName("LiteralUnlimitedNatural17");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural17.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural17.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set this.p_object::LiteralUnlimitedNatural39
		addToElementRepository("LiteralUnlimitedNatural39", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural39);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural39.setName("LiteralUnlimitedNatural39");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural39.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural39.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set this.p_result::LiteralUnlimitedNatural41
		addToElementRepository("LiteralUnlimitedNatural41", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural41);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural41.setName("LiteralUnlimitedNatural41");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural41.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural41.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q_object::LiteralUnlimitedNatural134
		addToElementRepository("LiteralUnlimitedNatural134", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural134);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural134.setName("LiteralUnlimitedNatural134");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural134.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural134.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read s.v_result::LiteralUnlimitedNatural19
		addToElementRepository("LiteralUnlimitedNatural19", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural19);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural19.setName("LiteralUnlimitedNatural19");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural19.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural19.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read s.t_object::LiteralUnlimitedNatural30
		addToElementRepository("LiteralUnlimitedNatural30", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural30);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural30.setName("LiteralUnlimitedNatural30");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural30.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural30.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int(4)_result::LiteralUnlimitedNatural144
		addToElementRepository("LiteralUnlimitedNatural144", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result_LiteralUnlimitedNatural144);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result_LiteralUnlimitedNatural144.setName("LiteralUnlimitedNatural144");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result_LiteralUnlimitedNatural144.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result_LiteralUnlimitedNatural144.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set this.p_value::LiteralUnlimitedNatural37
		addToElementRepository("LiteralUnlimitedNatural37", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural37);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural37.setName("LiteralUnlimitedNatural37");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural37.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural37.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a_object::LiteralUnlimitedNatural107
		addToElementRepository("LiteralUnlimitedNatural107", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural107);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural107.setName("LiteralUnlimitedNatural107");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural107.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural107.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(InitialMessage)_errorStatus::LiteralUnlimitedNatural90
		addToElementRepository("LiteralUnlimitedNatural90", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural90);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural90.setName("LiteralUnlimitedNatural90");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural90.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural90.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q_result::LiteralUnlimitedNatural137
		addToElementRepository("LiteralUnlimitedNatural137", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural137);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural137.setName("LiteralUnlimitedNatural137");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural137.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural137.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_Read a.b_object::LiteralUnlimitedNatural88
		addToElementRepository("LiteralUnlimitedNatural88", SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural88);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural88.setName("LiteralUnlimitedNatural88");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural88.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural88.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(InitialMessage)_value::LiteralUnlimitedNatural94
		addToElementRepository("LiteralUnlimitedNatural94", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralUnlimitedNatural94);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralUnlimitedNatural94.setName("LiteralUnlimitedNatural94");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralUnlimitedNatural94.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value_LiteralUnlimitedNatural94.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(EndMessage)_errorStatus::LiteralUnlimitedNatural72
		addToElementRepository("LiteralUnlimitedNatural72", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural72);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural72.setName("LiteralUnlimitedNatural72");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural72.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural72.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow103
		addToElementRepository("ObjectFlow103", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103.setName("ObjectFlow103");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103.setSource(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103.setTarget(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103.setGuard(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow103_LiteralBoolean105);
		// ObjectFlow SingleDelegation_P_P_Signal_main::ObjectFlow156
		addToElementRepository("ObjectFlow156", SingleDelegation_P_P_Signal_main_ObjectFlow156);
		SingleDelegation_P_P_Signal_main_ObjectFlow156.setName("ObjectFlow156");
		SingleDelegation_P_P_Signal_main_ObjectFlow156.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_main_ObjectFlow156.setSource(SingleDelegation_P_P_Signal_main_Create_Tester_result);
		SingleDelegation_P_P_Signal_main_ObjectFlow156.setTarget(SingleDelegation_P_P_Signal_main_Tester__target);
		SingleDelegation_P_P_Signal_main_ObjectFlow156.setGuard(SingleDelegation_P_P_Signal_main_ObjectFlow156_LiteralBoolean158);
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_testActivity::ObjectFlow47
		addToElementRepository("ObjectFlow47", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47.setName("ObjectFlow47");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47.setSource(SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47.setTarget(SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47.setGuard(SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow47_LiteralBoolean48);
		// ObjectFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior::ObjectFlow3
		addToElementRepository("ObjectFlow3", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3.setName("ObjectFlow3");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3.setSource(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Fork_S);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3.setTarget(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3.setGuard(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow3_LiteralBoolean4);
		// ObjectFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior::ObjectFlow10
		addToElementRepository("ObjectFlow10", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10.setName("ObjectFlow10");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10.setSource(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Fork_S);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10.setTarget(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10.setGuard(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralBoolean11);
		// ObjectFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior::ObjectFlow7
		addToElementRepository("ObjectFlow7", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7.setName("ObjectFlow7");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7.setSource(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7.setTarget(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_value);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7.setGuard(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow7_LiteralBoolean8);
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_testActivity::ObjectFlow50
		addToElementRepository("ObjectFlow50", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50.setName("ObjectFlow50");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50.setSource(SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50.setTarget(SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_value);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50.setGuard(SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow50_LiteralBoolean51);
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_testActivity::ObjectFlow57
		addToElementRepository("ObjectFlow57", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57.setName("ObjectFlow57");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57.setSource(SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57.setTarget(SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57.setGuard(SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow57_LiteralBoolean59);
		// ObjectFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior::ObjectFlow23
		addToElementRepository("ObjectFlow23", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23.setName("ObjectFlow23");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23.setSource(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23.setTarget(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23.setGuard(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralBoolean25);
		// ObjectFlow SingleDelegation_P_P_Signal_main::ObjectFlow171
		addToElementRepository("ObjectFlow171", SingleDelegation_P_P_Signal_main_ObjectFlow171);
		SingleDelegation_P_P_Signal_main_ObjectFlow171.setName("ObjectFlow171");
		SingleDelegation_P_P_Signal_main_ObjectFlow171.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_main_ObjectFlow171.setSource(SingleDelegation_P_P_Signal_main_Fork_Tester);
		SingleDelegation_P_P_Signal_main_ObjectFlow171.setTarget(SingleDelegation_P_P_Signal_main_Send_Start_target);
		SingleDelegation_P_P_Signal_main_ObjectFlow171.setGuard(SingleDelegation_P_P_Signal_main_ObjectFlow171_LiteralBoolean172);
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_testActivity::ObjectFlow60
		addToElementRepository("ObjectFlow60", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60.setName("ObjectFlow60");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60.setSource(SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60.setTarget(SingleDelegation_P_P_Signal_Tester_testActivity_Call_testP_p);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60.setGuard(SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow60_LiteralBoolean62);
		// ObjectFlow SingleDelegation_P_P_Signal_main::ObjectFlow174
		addToElementRepository("ObjectFlow174", SingleDelegation_P_P_Signal_main_ObjectFlow174);
		SingleDelegation_P_P_Signal_main_ObjectFlow174.setName("ObjectFlow174");
		SingleDelegation_P_P_Signal_main_ObjectFlow174.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_main_ObjectFlow174.setSource(SingleDelegation_P_P_Signal_main_Tester__result);
		SingleDelegation_P_P_Signal_main_ObjectFlow174.setTarget(SingleDelegation_P_P_Signal_main_Fork_Tester);
		SingleDelegation_P_P_Signal_main_ObjectFlow174.setGuard(SingleDelegation_P_P_Signal_main_ObjectFlow174_LiteralBoolean175);
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow111
		addToElementRepository("ObjectFlow111", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111.setName("ObjectFlow111");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111.setSource(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111.setTarget(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111.setGuard(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralBoolean112);
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow114
		addToElementRepository("ObjectFlow114", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114.setName("ObjectFlow114");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114.setSource(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114.setTarget(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114.setGuard(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralBoolean115);
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_testActivity::ObjectFlow63
		addToElementRepository("ObjectFlow63", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63.setName("ObjectFlow63");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63.setSource(SingleDelegation_P_P_Signal_Tester_testActivity_this_result);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63.setTarget(SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63.setGuard(SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow63_LiteralBoolean64);
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow117
		addToElementRepository("ObjectFlow117", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117.setName("ObjectFlow117");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117.setSource(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117.setTarget(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117.setGuard(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow117_LiteralBoolean118);
		// ObjectFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior::ObjectFlow26
		addToElementRepository("ObjectFlow26", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26.setName("ObjectFlow26");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26.setSource(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26.setTarget(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Fork_S);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26.setGuard(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow26_LiteralBoolean27);
		// ObjectFlow SingleDelegation_P_P_Signal_main::ObjectFlow163
		addToElementRepository("ObjectFlow163", SingleDelegation_P_P_Signal_main_ObjectFlow163);
		SingleDelegation_P_P_Signal_main_ObjectFlow163.setName("ObjectFlow163");
		SingleDelegation_P_P_Signal_main_ObjectFlow163.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_main_ObjectFlow163.setSource(SingleDelegation_P_P_Signal_main_Fork_Tester);
		SingleDelegation_P_P_Signal_main_ObjectFlow163.setTarget(SingleDelegation_P_P_Signal_main_Start_Tester_object);
		SingleDelegation_P_P_Signal_main_ObjectFlow163.setGuard(SingleDelegation_P_P_Signal_main_ObjectFlow163_LiteralBoolean165);
		// ObjectFlow SingleDelegation_P_P_Signal_B_BClassifierBehavior::ObjectFlow33
		addToElementRepository("ObjectFlow33", SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33.setName("ObjectFlow33");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33.setSource(SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33.setTarget(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_object);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33.setGuard(SingleDelegation_P_P_Signal_B_BClassifierBehavior_ObjectFlow33_LiteralBoolean34);
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow147
		addToElementRepository("ObjectFlow147", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147.setName("ObjectFlow147");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147.setSource(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147.setTarget(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147.setGuard(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow147_LiteralBoolean149);
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow150
		addToElementRepository("ObjectFlow150", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150.setName("ObjectFlow150");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150.setSource(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150.setTarget(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150.setGuard(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow150_LiteralBoolean151);
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow153
		addToElementRepository("ObjectFlow153", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153.setName("ObjectFlow153");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153.setSource(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153.setTarget(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153.setGuard(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow153_LiteralBoolean155);
		// ObjectFlow SingleDelegation_P_P_Signal_Tester_testActivity::ObjectFlow99
		addToElementRepository("ObjectFlow99", SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99.setName("ObjectFlow99");
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99.setSource(SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99.setTarget(SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_value);
		SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99.setGuard(SingleDelegation_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean100);
	}

	private void initializeOperation_Instances()
	{
		// Operation SingleDelegation_P_P_Signal_A::A_A
		addToElementRepository("A_A", SingleDelegation_P_P_Signal_A_A_A);
		SingleDelegation_P_P_Signal_A_A_A.setName("A");
		SingleDelegation_P_P_Signal_A_A_A.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_A_A_A.addOwnedParameter(SingleDelegation_P_P_Signal_A_A_A_result);
		SingleDelegation_P_P_Signal_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation SingleDelegation_P_P_Signal_Tester::test
		addToElementRepository("test", SingleDelegation_P_P_Signal_Tester_test);
		SingleDelegation_P_P_Signal_Tester_test.setName("test");
		SingleDelegation_P_P_Signal_Tester_test.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_test.addMethod(SingleDelegation_P_P_Signal_Tester_testActivity);
		SingleDelegation_P_P_Signal_Tester_test.addRedefinedOperation(SingleDelegation_P_P_Signal_AbstractTester_test);
		// Operation SingleDelegation_P_P_Signal_Tester::Tester_Tester
		addToElementRepository("Tester_Tester", SingleDelegation_P_P_Signal_Tester_Tester_Tester);
		SingleDelegation_P_P_Signal_Tester_Tester_Tester.setName("Tester");
		SingleDelegation_P_P_Signal_Tester_Tester_Tester.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_Tester_Tester.addOwnedParameter(SingleDelegation_P_P_Signal_Tester_Tester_Tester_result);
		SingleDelegation_P_P_Signal_Tester_Tester_Tester.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation SingleDelegation_P_P_Signal_B::B_B
		addToElementRepository("B_B", SingleDelegation_P_P_Signal_B_B_B);
		SingleDelegation_P_P_Signal_B_B_B.setName("B");
		SingleDelegation_P_P_Signal_B_B_B.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_B_B.addOwnedParameter(SingleDelegation_P_P_Signal_B_B_B_result);
		SingleDelegation_P_P_Signal_B_B_B.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation SingleDelegation_P_P_Signal_AbstractTester::test
		addToElementRepository("test", SingleDelegation_P_P_Signal_AbstractTester_test);
		SingleDelegation_P_P_Signal_AbstractTester_test.setName("test");
		SingleDelegation_P_P_Signal_AbstractTester_test.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_AbstractTester_test.setIsAbstract(true);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read s.v::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result.setName("result");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin SingleDelegation_P_P_Signal_main_Tester()::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_main_Tester__result);
		SingleDelegation_P_P_Signal_main_Tester__result.setName("result");
		SingleDelegation_P_P_Signal_main_Tester__result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Tester__result.setType(SingleDelegation_P_P_Signal_Tester);
		// OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(InitialMessage)::errorStatus
		addToElementRepository("errorStatus", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus.setName("errorStatus");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_InitialMessage_errorStatus.setLower(0);
		// OutputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_this::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result.setName("result");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result.setType(SingleDelegation_P_P_Signal_B);
		// OutputPin SingleDelegation_P_P_Signal_main_Create Tester::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_main_Create_Tester_result);
		SingleDelegation_P_P_Signal_main_Create_Tester_result.setName("result");
		SingleDelegation_P_P_Signal_main_Create_Tester_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Create_Tester_result.setType(SingleDelegation_P_P_Signal_Tester);
		// OutputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set this.p::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result.setName("result");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Set_this_p_result.setType(SingleDelegation_P_P_Signal_B);
		// OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_Read this.a::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result.setType(SingleDelegation_P_P_Signal_A);
		// OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_this::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_testActivity_this_result);
		SingleDelegation_P_P_Signal_Tester_testActivity_this_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_testActivity_this_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_this_result.setType(SingleDelegation_P_P_Signal_Tester);
		// OutputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept S::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result.setName("result");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_result.setType(SingleDelegation_P_P_Signal_S);
		// OutputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setType(SingleDelegation_P_P_Signal_Start);
		// OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_Read b.p::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_Read a.b::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result.setType(SingleDelegation_P_P_Signal_B);
		// OutputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int(4)::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result.setType(SingleDelegation_P_P_Signal_IImpl);
		// OutputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_result.setType(SingleDelegation_P_P_Signal_Continue);
		// OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result);
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result.setType(SingleDelegation_P_P_Signal_A);
		// OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result);
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read s.t::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result.setName("result");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result.setType(SingleDelegation_P_P_Signal_AbstractTester);
		// OutputPin SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine(EndMessage)::errorStatus
		addToElementRepository("errorStatus", SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus.setName("errorStatus");
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		SingleDelegation_P_P_Signal_Tester_testActivity_WriteLine_EndMessage_errorStatus.setLower(0);
		// OutputPin SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result.setType(SingleDelegation_P_P_Signal_Tester);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport SingleDelegation_P_P_Signal::PackageImport1
		addToElementRepository("PackageImport1", SingleDelegation_P_P_Signal_PackageImport1);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter SingleDelegation_P_P_Signal_Tester_testActivity_testP::p
		addToElementRepository("p", SingleDelegation_P_P_Signal_Tester_testActivity_testP_p);
		SingleDelegation_P_P_Signal_Tester_testActivity_testP_p.setName("p");
		SingleDelegation_P_P_Signal_Tester_testActivity_testP_p.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_testActivity_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter SingleDelegation_P_P_Signal_Tester_Tester_Tester::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_Tester_Tester_Tester_result);
		SingleDelegation_P_P_Signal_Tester_Tester_Tester_result.setName("result");
		SingleDelegation_P_P_Signal_Tester_Tester_Tester_result.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_Tester_Tester_result.setType(SingleDelegation_P_P_Signal_Tester);
		SingleDelegation_P_P_Signal_Tester_Tester_Tester_result.setDirection(ParameterDirectionKind.return_);
		// Parameter SingleDelegation_P_P_Signal_B_B_B::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_B_B_B_result);
		SingleDelegation_P_P_Signal_B_B_B_result.setName("result");
		SingleDelegation_P_P_Signal_B_B_B_result.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_B_B_B_result.setType(SingleDelegation_P_P_Signal_B);
		SingleDelegation_P_P_Signal_B_B_B_result.setDirection(ParameterDirectionKind.return_);
		// Parameter SingleDelegation_P_P_Signal_A_A_A::result
		addToElementRepository("result", SingleDelegation_P_P_Signal_A_A_A_result);
		SingleDelegation_P_P_Signal_A_A_A_result.setName("result");
		SingleDelegation_P_P_Signal_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_A_A_A_result.setType(SingleDelegation_P_P_Signal_A);
		SingleDelegation_P_P_Signal_A_A_A_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port SingleDelegation_P_P_Signal_A::q
		addToElementRepository("q", SingleDelegation_P_P_Signal_A_q);
		SingleDelegation_P_P_Signal_A_q.setName("q");
		SingleDelegation_P_P_Signal_A_q.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_A_q.setType(SingleDelegation_P_P_Signal_IImpl);
		SingleDelegation_P_P_Signal_A_q.setAggregation(AggregationKind.composite);
		SingleDelegation_P_P_Signal_A_q.isService = true;
		SingleDelegation_P_P_Signal_A_q.addProvided(SingleDelegation_P_P_Signal_I);
	}

	private void initializeProperty_Instances()
	{
		// Property SingleDelegation_P_P_Signal_S::t
		addToElementRepository("t", SingleDelegation_P_P_Signal_S_t);
		SingleDelegation_P_P_Signal_S_t.setName("t");
		SingleDelegation_P_P_Signal_S_t.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_S_t.setType(SingleDelegation_P_P_Signal_AbstractTester);
		// Property SingleDelegation_P_P_Signal_A::b
		addToElementRepository("b", SingleDelegation_P_P_Signal_A_b);
		SingleDelegation_P_P_Signal_A_b.setName("b");
		SingleDelegation_P_P_Signal_A_b.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_A_b.setType(SingleDelegation_P_P_Signal_B);
		SingleDelegation_P_P_Signal_A_b.setAggregation(AggregationKind.composite);
		// Property SingleDelegation_P_P_Signal_B::p
		addToElementRepository("p", SingleDelegation_P_P_Signal_B_p);
		SingleDelegation_P_P_Signal_B_p.setName("p");
		SingleDelegation_P_P_Signal_B_p.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property SingleDelegation_P_P_Signal_R::y
		addToElementRepository("y", SingleDelegation_P_P_Signal_R_y);
		SingleDelegation_P_P_Signal_R_y.setName("y");
		SingleDelegation_P_P_Signal_R_y.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_R_y.setType(SingleDelegation_P_P_Signal_IImpl);
		// Property SingleDelegation_P_P_Signal_R::x
		addToElementRepository("x", SingleDelegation_P_P_Signal_R_x);
		SingleDelegation_P_P_Signal_R_x.setName("x");
		SingleDelegation_P_P_Signal_R_x.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_R_x.setType(SingleDelegation_P_P_Signal_B);
		// Property SingleDelegation_P_P_Signal_S::v
		addToElementRepository("v", SingleDelegation_P_P_Signal_S_v);
		SingleDelegation_P_P_Signal_S_v.setName("v");
		SingleDelegation_P_P_Signal_S_v.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property SingleDelegation_P_P_Signal_Tester::a
		addToElementRepository("a", SingleDelegation_P_P_Signal_Tester_a);
		SingleDelegation_P_P_Signal_Tester_a.setName("a");
		SingleDelegation_P_P_Signal_Tester_a.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_Tester_a.setType(SingleDelegation_P_P_Signal_A);
		SingleDelegation_P_P_Signal_Tester_a.setAggregation(AggregationKind.composite);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction SingleDelegation_P_P_Signal_B_BClassifierBehavior::this
		addToElementRepository("this", SingleDelegation_P_P_Signal_B_BClassifierBehavior_this);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_this.setName("this");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_this.setResult(SingleDelegation_P_P_Signal_B_BClassifierBehavior_this_result);
		// ReadSelfAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::this
		addToElementRepository("this", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this.setName("this");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this.setResult(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_this_result);
		// ReadSelfAction SingleDelegation_P_P_Signal_Tester_testActivity::this
		addToElementRepository("this", SingleDelegation_P_P_Signal_Tester_testActivity_this);
		SingleDelegation_P_P_Signal_Tester_testActivity_this.setName("this");
		SingleDelegation_P_P_Signal_Tester_testActivity_this.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_this.setResult(SingleDelegation_P_P_Signal_Tester_testActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction SingleDelegation_P_P_Signal_Tester_testActivity::Read this.a
		addToElementRepository("Read this.a", SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a.setName("Read this.a");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a.setStructuralFeature(SingleDelegation_P_P_Signal_Tester_a);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a.setObject(SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_object);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a.setResult(SingleDelegation_P_P_Signal_Tester_testActivity_Read_this_a_result);
		// ReadStructuralFeatureAction SingleDelegation_P_P_Signal_B_BClassifierBehavior::Read s.v
		addToElementRepository("Read s.v", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v.setName("Read s.v");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v.setStructuralFeature(SingleDelegation_P_P_Signal_S_v);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v.setObject(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_object);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v.setResult(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_v_result);
		// ReadStructuralFeatureAction SingleDelegation_P_P_Signal_B_BClassifierBehavior::Read s.t
		addToElementRepository("Read s.t", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t.setName("Read s.t");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t.setStructuralFeature(SingleDelegation_P_P_Signal_S_t);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t.setObject(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_object);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t.setResult(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Read_s_t_result);
		// ReadStructuralFeatureAction SingleDelegation_P_P_Signal_Tester_testActivity::Read b.p
		addToElementRepository("Read b.p", SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p.setName("Read b.p");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p.setStructuralFeature(SingleDelegation_P_P_Signal_B_p);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p.setObject(SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_object);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p.setResult(SingleDelegation_P_P_Signal_Tester_testActivity_Read_b_p_result);
		// ReadStructuralFeatureAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::Read a.q
		addToElementRepository("Read a.q", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setName("Read a.q");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setStructuralFeature(SingleDelegation_P_P_Signal_A_q);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setObject(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setResult(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result);
		// ReadStructuralFeatureAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::Read this.a
		addToElementRepository("Read this.a", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setName("Read this.a");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setStructuralFeature(SingleDelegation_P_P_Signal_Tester_a);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setObject(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setResult(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result);
		// ReadStructuralFeatureAction SingleDelegation_P_P_Signal_Tester_testActivity::Read a.b
		addToElementRepository("Read a.b", SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b.setName("Read a.b");
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b.setStructuralFeature(SingleDelegation_P_P_Signal_A_b);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b.setObject(SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_object);
		SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b.setResult(SingleDelegation_P_P_Signal_Tester_testActivity_Read_a_b_result);
	}

	private void initializeReception_Instances()
	{
		// Reception SingleDelegation_P_P_Signal_I::S
		addToElementRepository("S", SingleDelegation_P_P_Signal_I_S);
		SingleDelegation_P_P_Signal_I_S.setName("S");
		SingleDelegation_P_P_Signal_I_S.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_I_S.setSignal(SingleDelegation_P_P_Signal_S);
		// Reception SingleDelegation_P_P_Signal_AbstractTester::Start
		addToElementRepository("Start", SingleDelegation_P_P_Signal_AbstractTester_Start);
		SingleDelegation_P_P_Signal_AbstractTester_Start.setName("Start");
		SingleDelegation_P_P_Signal_AbstractTester_Start.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_AbstractTester_Start.setSignal(SingleDelegation_P_P_Signal_Start);
		// Reception SingleDelegation_P_P_Signal_AbstractTester::Continue
		addToElementRepository("Continue", SingleDelegation_P_P_Signal_AbstractTester_Continue);
		SingleDelegation_P_P_Signal_AbstractTester_Continue.setName("Continue");
		SingleDelegation_P_P_Signal_AbstractTester_Continue.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_AbstractTester_Continue.setSignal(SingleDelegation_P_P_Signal_Continue);
		// Reception SingleDelegation_P_P_Signal_IImpl::S
		addToElementRepository("S", SingleDelegation_P_P_Signal_IImpl_S);
		SingleDelegation_P_P_Signal_IImpl_S.setName("S");
		SingleDelegation_P_P_Signal_IImpl_S.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_IImpl_S.setSignal(SingleDelegation_P_P_Signal_S);
		// Reception SingleDelegation_P_P_Signal_B::S
		addToElementRepository("S", SingleDelegation_P_P_Signal_B_S);
		SingleDelegation_P_P_Signal_B_S.setName("S");
		SingleDelegation_P_P_Signal_B_S.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_S.setSignal(SingleDelegation_P_P_Signal_S);
	}

	private void initializeSendSignalAction_Instances()
	{
		// SendSignalAction SingleDelegation_P_P_Signal_main::Send Start
		addToElementRepository("Send Start", SingleDelegation_P_P_Signal_main_Send_Start);
		SingleDelegation_P_P_Signal_main_Send_Start.setName("Send Start");
		SingleDelegation_P_P_Signal_main_Send_Start.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Send_Start.setSignal(SingleDelegation_P_P_Signal_Start);
		SingleDelegation_P_P_Signal_main_Send_Start.setTarget(SingleDelegation_P_P_Signal_main_Send_Start_target);
		// SendSignalAction SingleDelegation_P_P_Signal_B_BClassifierBehavior::Send Continue
		addToElementRepository("Send Continue", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue.setName("Send Continue");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue.setSignal(SingleDelegation_P_P_Signal_Continue);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue.setTarget(SingleDelegation_P_P_Signal_B_BClassifierBehavior_Send_Continue_target);
		// SendSignalAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior:: Send S
		addToElementRepository(" Send S", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S.setName(" Send S");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S.setSignal(SingleDelegation_P_P_Signal_S);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S.setTarget(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_target);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S.addArgument(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_v);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S.addArgument(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior__Send_S_t);
	}

	private void initializeSignal_Instances()
	{
		// Signal SingleDelegation_P_P_Signal::Start
		addToElementRepository("Start", SingleDelegation_P_P_Signal_Start);
		SingleDelegation_P_P_Signal_Start.setName("Start");
		SingleDelegation_P_P_Signal_Start.setVisibility(VisibilityKind.public_);
		// Signal SingleDelegation_P_P_Signal::Continue
		addToElementRepository("Continue", SingleDelegation_P_P_Signal_Continue);
		SingleDelegation_P_P_Signal_Continue.setName("Continue");
		SingleDelegation_P_P_Signal_Continue.setVisibility(VisibilityKind.public_);
		// Signal SingleDelegation_P_P_Signal::S
		addToElementRepository("S", SingleDelegation_P_P_Signal_S);
		SingleDelegation_P_P_Signal_S.setName("S");
		SingleDelegation_P_P_Signal_S.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Signal_S.addOwnedAttribute(SingleDelegation_P_P_Signal_S_v);
		SingleDelegation_P_P_Signal_S.addOwnedAttribute(SingleDelegation_P_P_Signal_S_t);
	}

	private void initializeSignalEvent_Instances()
	{
		// SignalEvent SingleDelegation_P_P_Signal::SignalEventStart
		addToElementRepository("SignalEventStart", SingleDelegation_P_P_Signal_SignalEventStart);
		SingleDelegation_P_P_Signal_SignalEventStart.setName("SignalEventStart");
		SingleDelegation_P_P_Signal_SignalEventStart.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_SignalEventStart.setSignal(SingleDelegation_P_P_Signal_Start);
		// SignalEvent SingleDelegation_P_P_Signal::SignalEventContinue
		addToElementRepository("SignalEventContinue", SingleDelegation_P_P_Signal_SignalEventContinue);
		SingleDelegation_P_P_Signal_SignalEventContinue.setName("SignalEventContinue");
		SingleDelegation_P_P_Signal_SignalEventContinue.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_SignalEventContinue.setSignal(SingleDelegation_P_P_Signal_Continue);
		// SignalEvent SingleDelegation_P_P_Signal::SignalEventS
		addToElementRepository("SignalEventS", SingleDelegation_P_P_Signal_SignalEventS);
		SingleDelegation_P_P_Signal_SignalEventS.setName("SignalEventS");
		SingleDelegation_P_P_Signal_SignalEventS.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_SignalEventS.setSignal(SingleDelegation_P_P_Signal_S);
	}

	private void initializeStartObjectBehaviorAction_Instances()
	{
		// StartObjectBehaviorAction SingleDelegation_P_P_Signal_main::Start Tester
		addToElementRepository("Start Tester", SingleDelegation_P_P_Signal_main_Start_Tester);
		SingleDelegation_P_P_Signal_main_Start_Tester.setName("Start Tester");
		SingleDelegation_P_P_Signal_main_Start_Tester.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_main_Start_Tester.setObject(SingleDelegation_P_P_Signal_main_Start_Tester_object);
	}

	private void initializeTrigger_Instances()
	{
		// Trigger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue::Trigger120
		addToElementRepository("Trigger120", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_Trigger120);
		// Trigger Trigger120
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_Trigger120.setName("Trigger120");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_Trigger120.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_Trigger120.setEvent(SingleDelegation_P_P_Signal_SignalEventContinue);
		// Trigger SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept S::Trigger16
		addToElementRepository("Trigger16", SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger16);
		// Trigger Trigger16
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger16.setName("Trigger16");
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger16.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger16.setEvent(SingleDelegation_P_P_Signal_SignalEventS);
		// Trigger SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start::Trigger128
		addToElementRepository("Trigger128", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger128);
		// Trigger Trigger128
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger128.setName("Trigger128");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger128.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger128.setEvent(SingleDelegation_P_P_Signal_SignalEventStart);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction SingleDelegation_P_P_Signal_Tester_testActivity::InitialMessage
		addToElementRepository("InitialMessage", SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage);
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage.setName("InitialMessage");
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage.setValue(SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_LiteralString82);
		SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage.setResult(SingleDelegation_P_P_Signal_Tester_testActivity_InitialMessage_result);
		// ValueSpecificationAction SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior::Int(4)
		addToElementRepository("Int(4)", SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4.setName("Int(4)");
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4.setValue(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_LiteralInteger146);
		SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4.setResult(SingleDelegation_P_P_Signal_Tester_TesterClassifierBehavior_Int_4_result);
		// ValueSpecificationAction SingleDelegation_P_P_Signal_Tester_testActivity::EndMessage
		addToElementRepository("EndMessage", SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage);
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage.setName("EndMessage");
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage.setValue(SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_LiteralString98);
		SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage.setResult(SingleDelegation_P_P_Signal_Tester_testActivity_EndMessage_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // SingleDelegation_P_P_SignalModel
