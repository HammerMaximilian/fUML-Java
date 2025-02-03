/*
 * MultipleDelegation_SameConnector_P_PWP_SignalModel.java
 * 
 * Auto-generated file
 */
package MultipleDelegation_SameConnector_P_PWP_Signal;

import uml.commonbehavior.SignalEvent;
import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.classification.Generalization;
import uml.structuredclassifiers.Connector;
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
import uml.classification.Operation;
import uml.classification.Parameter;
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

public class MultipleDelegation_SameConnector_P_PWP_SignalModel extends InMemoryModel
{
	private static MultipleDelegation_SameConnector_P_PWP_SignalModel instance;

	/*
	 * Model MultipleDelegation_SameConnector_P_PWP_Signal
	 */
	public Package MultipleDelegation_SameConnector_P_PWP_Signal = new Package();
		public SignalEvent MultipleDelegation_SameConnector_P_PWP_Signal_StartEvent = new SignalEvent();
		public Interface MultipleDelegation_SameConnector_P_PWP_Signal_I = new Interface();
			public Reception MultipleDelegation_SameConnector_P_PWP_Signal_I_S = new Reception();
		public Class_ MultipleDelegation_SameConnector_P_PWP_Signal_A = new Class_();
			public Port MultipleDelegation_SameConnector_P_PWP_Signal_A_q = new Port();
			public Operation MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A_result = new Parameter();
			public Property MultipleDelegation_SameConnector_P_PWP_Signal_A_b = new Property();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_A_b_LiteralInteger0 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_A_b_LiteralUnlimitedNatural1 = new LiteralUnlimitedNatural();
			public Connector MultipleDelegation_SameConnector_P_PWP_Signal_A_r = new Connector();
				public ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd2 = new ConnectorEnd();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd2_LiteralUnlimitedNatural3 = new LiteralUnlimitedNatural();
				public ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4 = new ConnectorEnd();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralInteger5 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralUnlimitedNatural6 = new LiteralUnlimitedNatural();
		public Activity MultipleDelegation_SameConnector_P_PWP_Signal_main = new Activity();
			public CreateObjectAction MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester = new CreateObjectAction();
				public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result = new OutputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result_LiteralInteger7 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result_LiteralUnlimitedNatural8 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9_LiteralBoolean10 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9_LiteralInteger11 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12_LiteralInteger13 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12_LiteralBoolean14 = new LiteralBoolean();
			public SendSignalAction MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start = new SendSignalAction();
				public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target_LiteralUnlimitedNatural15 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target_LiteralInteger16 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17_LiteralBoolean18 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17_LiteralInteger19 = new LiteralInteger();
			public StartObjectBehaviorAction MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester = new StartObjectBehaviorAction();
				public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object = new InputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object_LiteralInteger20 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object_LiteralUnlimitedNatural21 = new LiteralUnlimitedNatural();
			public ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_main_ControlFlow22 = new ControlFlow();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23_LiteralBoolean24 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23_LiteralInteger25 = new LiteralInteger();
			public CallOperationAction MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester_ = new CallOperationAction();
				public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result = new OutputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralInteger26 = new LiteralInteger();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralInteger27 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralUnlimitedNatural28 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target = new InputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target_LiteralInteger29 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target_LiteralUnlimitedNatural30 = new LiteralUnlimitedNatural();
			public ForkNode MultipleDelegation_SameConnector_P_PWP_Signal_main_Fork_Tester = new ForkNode();
		public Signal MultipleDelegation_SameConnector_P_PWP_Signal_Continue = new Signal();
		public Class_ MultipleDelegation_SameConnector_P_PWP_Signal_IImpl = new Class_();
			public InterfaceRealization MultipleDelegation_SameConnector_P_PWP_Signal_IImpl_IRealization = new InterfaceRealization();
			public Reception MultipleDelegation_SameConnector_P_PWP_Signal_IImpl_S = new Reception();
		public Class_ MultipleDelegation_SameConnector_P_PWP_Signal_B = new Class_();
			public Operation MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B_result = new Parameter();
			public Property MultipleDelegation_SameConnector_P_PWP_Signal_B_p = new Property();
			public Activity MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior = new Activity();
				public AcceptEventAction MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S = new AcceptEventAction();
					public Trigger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_Trigger31 = new Trigger();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural32 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger33 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger34 = new LiteralInteger();
				public ForkNode MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s = new ForkNode();
				public AddStructuralFeatureValueAction MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger35 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural36 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural37 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger38 = new LiteralInteger();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural39 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger40 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41_LiteralBoolean42 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41_LiteralInteger43 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44_LiteralBoolean45 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44_LiteralInteger46 = new LiteralInteger();
				public ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow47 = new ControlFlow();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48_LiteralBoolean49 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48_LiteralInteger50 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51_LiteralInteger52 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51_LiteralBoolean53 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54_LiteralBoolean55 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54_LiteralInteger56 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger57 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural58 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger59 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural60 = new LiteralUnlimitedNatural();
				public ReadSelfAction MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralInteger61 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural62 = new LiteralUnlimitedNatural();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63_LiteralInteger64 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63_LiteralBoolean65 = new LiteralBoolean();
				public SendSignalAction MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue = new SendSignalAction();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural66 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger67 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural68 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger69 = new LiteralInteger();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger70 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural71 = new LiteralUnlimitedNatural();
			public Reception MultipleDelegation_SameConnector_P_PWP_Signal_B_S = new Reception();
			public InterfaceRealization MultipleDelegation_SameConnector_P_PWP_Signal_B_IRealization = new InterfaceRealization();
		public Comment MultipleDelegation_SameConnector_P_PWP_Signal_Comment72 = new Comment();
		public PackageImport MultipleDelegation_SameConnector_P_PWP_Signal_PackageImport73 = new PackageImport();
		public Comment MultipleDelegation_SameConnector_P_PWP_Signal_Comment74 = new Comment();
		public SignalEvent MultipleDelegation_SameConnector_P_PWP_Signal_SEvent = new SignalEvent();
		public Association MultipleDelegation_SameConnector_P_PWP_Signal_R = new Association();
			public Property MultipleDelegation_SameConnector_P_PWP_Signal_R_x = new Property();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_R_x_LiteralInteger75 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_R_x_LiteralUnlimitedNatural76 = new LiteralUnlimitedNatural();
			public Property MultipleDelegation_SameConnector_P_PWP_Signal_R_y = new Property();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_R_y_LiteralInteger77 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_R_y_LiteralUnlimitedNatural78 = new LiteralUnlimitedNatural();
		public Class_ MultipleDelegation_SameConnector_P_PWP_Signal_C = new Class_();
			public Port MultipleDelegation_SameConnector_P_PWP_Signal_C_p = new Port();
			public Property MultipleDelegation_SameConnector_P_PWP_Signal_C_a = new Property();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_C_a_LiteralInteger79 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_C_a_LiteralUnlimitedNatural80 = new LiteralUnlimitedNatural();
			public Connector MultipleDelegation_SameConnector_P_PWP_Signal_C_u = new Connector();
				public ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd81 = new ConnectorEnd();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd81_LiteralUnlimitedNatural82 = new LiteralUnlimitedNatural();
				public ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83 = new ConnectorEnd();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83_LiteralInteger84 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83_LiteralUnlimitedNatural85 = new LiteralUnlimitedNatural();
		public Association MultipleDelegation_SameConnector_P_PWP_Signal_U = new Association();
			public Property MultipleDelegation_SameConnector_P_PWP_Signal_U_x = new Property();
				public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_U_x_LiteralUnlimitedNatural86 = new LiteralUnlimitedNatural();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_U_x_LiteralInteger87 = new LiteralInteger();
			public Property MultipleDelegation_SameConnector_P_PWP_Signal_U_y = new Property();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_U_y_LiteralInteger88 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_U_y_LiteralUnlimitedNatural89 = new LiteralUnlimitedNatural();
		public Signal MultipleDelegation_SameConnector_P_PWP_Signal_S = new Signal();
			public Property MultipleDelegation_SameConnector_P_PWP_Signal_S_t = new Property();
			public Property MultipleDelegation_SameConnector_P_PWP_Signal_S_v = new Property();
		public Class_ MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester = new Class_();
			public Reception MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_Continue = new Reception();
			public Reception MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_Start = new Reception();
			public Operation MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_test = new Operation();
		public SignalEvent MultipleDelegation_SameConnector_P_PWP_Signal_ContinueEvent = new SignalEvent();
		public Class_ MultipleDelegation_SameConnector_P_PWP_Signal_Tester = new Class_();
			public Operation MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester_result = new Parameter();
			public Generalization MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Generalization90 = new Generalization();
			public Activity MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity = new Activity();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91_LiteralInteger92 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91_LiteralBoolean93 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94_LiteralInteger95 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94_LiteralBoolean96 = new LiteralBoolean();
				public ReadSelfAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralInteger97 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural98 = new LiteralUnlimitedNatural();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean100 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger101 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102_LiteralInteger103 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102_LiteralBoolean104 = new LiteralBoolean();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural105 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger106 = new LiteralInteger();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger107 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural108 = new LiteralUnlimitedNatural();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a_ = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result_LiteralInteger109 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result_LiteralUnlimitedNatural110 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object_LiteralInteger111 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object_LiteralUnlimitedNatural112 = new LiteralUnlimitedNatural();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural113 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger114 = new LiteralInteger();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger115 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural116 = new LiteralUnlimitedNatural();
				public OpaqueBehavior MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP = new OpaqueBehavior();
					public Parameter MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP_p = new Parameter();
				public CallBehaviorAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP = new CallBehaviorAction();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural117 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger118 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger119 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120_LiteralInteger121 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120_LiteralBoolean122 = new LiteralBoolean();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralInteger123 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralUnlimitedNatural124 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralUnlimitedNatural125 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralInteger126 = new LiteralInteger();
			public Property MultipleDelegation_SameConnector_P_PWP_Signal_Tester_c = new Property();
			public Operation MultipleDelegation_SameConnector_P_PWP_Signal_Tester_test = new Operation();
			public Activity MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior = new Activity();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127_LiteralBoolean128 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127_LiteralInteger129 = new LiteralInteger();
				public AcceptEventAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start = new AcceptEventAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural130 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger131 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger132 = new LiteralInteger();
					public Trigger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger133 = new Trigger();
				public AcceptEventAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1 = new AcceptEventAction();
					public Trigger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger134 = new Trigger();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger135 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger136 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural137 = new LiteralUnlimitedNatural();
				public ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138 = new ControlFlow();
				public ForkNode MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this = new ForkNode();
				public ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow139 = new ControlFlow();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140_LiteralInteger141 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140_LiteralBoolean142 = new LiteralBoolean();
				public AcceptEventAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4 = new AcceptEventAction();
					public Trigger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger143 = new Trigger();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural144 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger145 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger146 = new LiteralInteger();
				public AcceptEventAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2 = new AcceptEventAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural147 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger148 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger149 = new LiteralInteger();
					public Trigger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger150 = new Trigger();
				public ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow151 = new ControlFlow();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralInteger152 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralUnlimitedNatural153 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralInteger154 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralUnlimitedNatural155 = new LiteralUnlimitedNatural();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156_LiteralBoolean157 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156_LiteralInteger158 = new LiteralInteger();
				public CallOperationAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_ = new CallOperationAction();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural159 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger160 = new LiteralInteger();
				public ValueSpecificationAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4 = new ValueSpecificationAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger161 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural162 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger163 = new LiteralInteger();
				public ReadSelfAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger164 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural165 = new LiteralUnlimitedNatural();
				public ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow166 = new ControlFlow();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167_LiteralInteger168 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167_LiteralBoolean169 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170_LiteralBoolean171 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170_LiteralInteger172 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralInteger173 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralUnlimitedNatural174 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralUnlimitedNatural175 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralInteger176 = new LiteralInteger();
				public ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow177 = new ControlFlow();
				public SendSignalAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S = new SendSignalAction();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural178 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger179 = new LiteralInteger();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural180 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger181 = new LiteralInteger();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural182 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger183 = new LiteralInteger();
				public ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow184 = new ControlFlow();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185_LiteralBoolean186 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185_LiteralInteger187 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188_LiteralInteger189 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188_LiteralBoolean190 = new LiteralBoolean();
				public AcceptEventAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3 = new AcceptEventAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger191 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger192 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural193 = new LiteralUnlimitedNatural();
					public Trigger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger194 = new Trigger();
		public Signal MultipleDelegation_SameConnector_P_PWP_Signal_Start = new Signal();

	public static MultipleDelegation_SameConnector_P_PWP_SignalModel instance()
	{
		if (instance == null)
        {
            instance = new MultipleDelegation_SameConnector_P_PWP_SignalModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public MultipleDelegation_SameConnector_P_PWP_SignalModel()
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
		// AcceptEventAction MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::Accept S
		addToElementRepository("Accept S", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S.setName("Accept S");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S.addResult(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S.addTrigger(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_Trigger31);
		// AcceptEventAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Accept Continue_4
		addToElementRepository("Accept Continue_4", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.setName("Accept Continue_4");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.addResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.addTrigger(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger143);
		// AcceptEventAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Accept Continue_2
		addToElementRepository("Accept Continue_2", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.setName("Accept Continue_2");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.addResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.addTrigger(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger150);
		// AcceptEventAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Accept Start
		addToElementRepository("Accept Start", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start.setName("Accept Start");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start.addResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start.addTrigger(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger133);
		// AcceptEventAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Accept Continue_1
		addToElementRepository("Accept Continue_1", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.setName("Accept Continue_1");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.addResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.addTrigger(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger134);
		// AcceptEventAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Accept Continue_3
		addToElementRepository("Accept Continue_3", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.setName("Accept Continue_3");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.addResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.addTrigger(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger194);
	}

	private void initializeActivity_Instances()
	{
		// Activity MultipleDelegation_SameConnector_P_PWP_Signal_Tester::testActivity
		addToElementRepository("testActivity", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.setName("testActivity");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.addOwnedBehavior(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120);
		// Activity MultipleDelegation_SameConnector_P_PWP_Signal_B::BClassifierBehavior
		addToElementRepository("BClassifierBehavior", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.setName("BClassifierBehavior");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow47);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48);
		// Activity MultipleDelegation_SameConnector_P_PWP_Signal::main
		addToElementRepository("main", MultipleDelegation_SameConnector_P_PWP_Signal_main);
		MultipleDelegation_SameConnector_P_PWP_Signal_main.setName("main");
		MultipleDelegation_SameConnector_P_PWP_Signal_main.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_main.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start);
		MultipleDelegation_SameConnector_P_PWP_Signal_main.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_main.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_main_Fork_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9);
		MultipleDelegation_SameConnector_P_PWP_Signal_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12);
		MultipleDelegation_SameConnector_P_PWP_Signal_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17);
		MultipleDelegation_SameConnector_P_PWP_Signal_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_main_ControlFlow22);
		MultipleDelegation_SameConnector_P_PWP_Signal_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23);
		// Activity MultipleDelegation_SameConnector_P_PWP_Signal_Tester::TesterClassifierBehavior
		addToElementRepository("TesterClassifierBehavior", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.setName("TesterClassifierBehavior");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow166);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow177);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow139);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow151);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow184);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::Set this.p
		addToElementRepository("Set this.p", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p.setName("Set this.p");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Signal_B_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p.setObject(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p.setValue(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association MultipleDelegation_SameConnector_P_PWP_Signal::R
		addToElementRepository("R", MultipleDelegation_SameConnector_P_PWP_Signal_R);
		MultipleDelegation_SameConnector_P_PWP_Signal_R.setName("R");
		MultipleDelegation_SameConnector_P_PWP_Signal_R.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_R.addOwnedEnd(MultipleDelegation_SameConnector_P_PWP_Signal_R_x);
		MultipleDelegation_SameConnector_P_PWP_Signal_R.addOwnedEnd(MultipleDelegation_SameConnector_P_PWP_Signal_R_y);
		// Association MultipleDelegation_SameConnector_P_PWP_Signal::U
		addToElementRepository("U", MultipleDelegation_SameConnector_P_PWP_Signal_U);
		MultipleDelegation_SameConnector_P_PWP_Signal_U.setName("U");
		MultipleDelegation_SameConnector_P_PWP_Signal_U.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_U.addOwnedEnd(MultipleDelegation_SameConnector_P_PWP_Signal_U_x);
		MultipleDelegation_SameConnector_P_PWP_Signal_U.addOwnedEnd(MultipleDelegation_SameConnector_P_PWP_Signal_U_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity::Call testP
		addToElementRepository("Call testP", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP.setName("Call testP");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP.setBehavior(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP.addArgument(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Call test()
		addToElementRepository("Call test()", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_.setName("Call test()");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_.setOperation(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_test);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		// CallOperationAction MultipleDelegation_SameConnector_P_PWP_Signal_main::Tester()
		addToElementRepository("Tester()", MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester_.setName("Tester()");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester_.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester_.addResult(MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester_.setOperation(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester_.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target);
	}

	private void initializeClass_Instances()
	{
		// Class MultipleDelegation_SameConnector_P_PWP_Signal::A
		addToElementRepository("A", MultipleDelegation_SameConnector_P_PWP_Signal_A);
		MultipleDelegation_SameConnector_P_PWP_Signal_A.setName("A");
		MultipleDelegation_SameConnector_P_PWP_Signal_A.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_A.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Signal_A_q);
		MultipleDelegation_SameConnector_P_PWP_Signal_A.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Signal_A_b);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_A.addOwnedConnector(MultipleDelegation_SameConnector_P_PWP_Signal_A_r);
		MultipleDelegation_SameConnector_P_PWP_Signal_A.addOwnedOperation(MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A);
		// Class MultipleDelegation_SameConnector_P_PWP_Signal::C
		addToElementRepository("C", MultipleDelegation_SameConnector_P_PWP_Signal_C);
		MultipleDelegation_SameConnector_P_PWP_Signal_C.setName("C");
		MultipleDelegation_SameConnector_P_PWP_Signal_C.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_C.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Signal_C_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_C.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Signal_C_a);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_C.addOwnedConnector(MultipleDelegation_SameConnector_P_PWP_Signal_C_u);
		// Class MultipleDelegation_SameConnector_P_PWP_Signal::IImpl
		addToElementRepository("IImpl", MultipleDelegation_SameConnector_P_PWP_Signal_IImpl);
		MultipleDelegation_SameConnector_P_PWP_Signal_IImpl.setName("IImpl");
		MultipleDelegation_SameConnector_P_PWP_Signal_IImpl.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_IImpl.addInterfaceRealization(MultipleDelegation_SameConnector_P_PWP_Signal_IImpl_IRealization);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_IImpl.addOwnedReception(MultipleDelegation_SameConnector_P_PWP_Signal_IImpl_S);
		// Class MultipleDelegation_SameConnector_P_PWP_Signal::AbstractTester
		addToElementRepository("AbstractTester", MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester);
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester.setName("AbstractTester");
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester.setIsAbstract(true);
		
		
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester.setIsActive(true);
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester.addOwnedOperation(MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_test);
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester.addOwnedReception(MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_Continue);
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester.addOwnedReception(MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_Start);
		// Class MultipleDelegation_SameConnector_P_PWP_Signal::Tester
		addToElementRepository("Tester", MultipleDelegation_SameConnector_P_PWP_Signal_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester.setName("Tester");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester.addGeneralization(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Generalization90);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_c);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester.setClassifierBehavior(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester.addOwnedBehavior(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester.addOwnedBehavior(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester.setIsActive(true);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester.addOwnedOperation(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester.addOwnedOperation(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_test);
		// Class MultipleDelegation_SameConnector_P_PWP_Signal::B
		addToElementRepository("B", MultipleDelegation_SameConnector_P_PWP_Signal_B);
		MultipleDelegation_SameConnector_P_PWP_Signal_B.setName("B");
		MultipleDelegation_SameConnector_P_PWP_Signal_B.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_B.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Signal_B_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_B.setClassifierBehavior(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior);
		MultipleDelegation_SameConnector_P_PWP_Signal_B.addOwnedBehavior(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior);
		MultipleDelegation_SameConnector_P_PWP_Signal_B.addInterfaceRealization(MultipleDelegation_SameConnector_P_PWP_Signal_B_IRealization);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_B.setIsActive(true);
		MultipleDelegation_SameConnector_P_PWP_Signal_B.addOwnedOperation(MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B);
		MultipleDelegation_SameConnector_P_PWP_Signal_B.addOwnedReception(MultipleDelegation_SameConnector_P_PWP_Signal_B_S);
	}

	private void initializeComment_Instances()
	{
		// Comment MultipleDelegation_SameConnector_P_PWP_Signal::Comment72
		addToElementRepository("Comment72", MultipleDelegation_SameConnector_P_PWP_Signal_Comment72);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment MultipleDelegation_SameConnector_P_PWP_Signal::Comment74
		addToElementRepository("Comment74", MultipleDelegation_SameConnector_P_PWP_Signal_Comment74);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector MultipleDelegation_SameConnector_P_PWP_Signal_A::r
		addToElementRepository("r", MultipleDelegation_SameConnector_P_PWP_Signal_A_r);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r.setName("r");
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r.addEnd(MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd2);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r.addEnd(MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r.setType(MultipleDelegation_SameConnector_P_PWP_Signal_R);
		// Connector MultipleDelegation_SameConnector_P_PWP_Signal_C::u
		addToElementRepository("u", MultipleDelegation_SameConnector_P_PWP_Signal_C_u);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u.setName("u");
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u.addEnd(MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd81);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u.addEnd(MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u.setType(MultipleDelegation_SameConnector_P_PWP_Signal_U);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Signal_A_r::ConnectorEnd2
		addToElementRepository("ConnectorEnd2", MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd2);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd2.setRole(MultipleDelegation_SameConnector_P_PWP_Signal_A_q);
		// ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Signal_C_u::ConnectorEnd81
		addToElementRepository("ConnectorEnd81", MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd81);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd81.setUpper(-1);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd81.setRole(MultipleDelegation_SameConnector_P_PWP_Signal_C_p);
		// ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Signal_C_u::ConnectorEnd83
		addToElementRepository("ConnectorEnd83", MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83.setUpper(-1);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83.setLower(4);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83.setRole(MultipleDelegation_SameConnector_P_PWP_Signal_A_q);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83.setPartWithPort(MultipleDelegation_SameConnector_P_PWP_Signal_C_a);
		// ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Signal_A_r::ConnectorEnd4
		addToElementRepository("ConnectorEnd4", MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4.setRole(MultipleDelegation_SameConnector_P_PWP_Signal_A_b);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ControlFlow139
		addToElementRepository("ControlFlow139", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow139);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow139.setName("ControlFlow139");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow139.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow139.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow139.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		// ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ControlFlow177
		addToElementRepository("ControlFlow177", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow177);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow177.setName("ControlFlow177");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow177.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow177.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow177.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this);
		// ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ControlFlow151
		addToElementRepository("ControlFlow151", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow151);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow151.setName("ControlFlow151");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow151.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow151.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow151.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		// ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ControlFlow166
		addToElementRepository("ControlFlow166", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow166);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow166.setName("ControlFlow166");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow166.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow166.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow166.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		// ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ControlFlow184
		addToElementRepository("ControlFlow184", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow184);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow184.setName("ControlFlow184");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow184.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow184.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow184.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_);
		// ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_main::ControlFlow22
		addToElementRepository("ControlFlow22", MultipleDelegation_SameConnector_P_PWP_Signal_main_ControlFlow22);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ControlFlow22.setName("ControlFlow22");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ControlFlow22.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ControlFlow22.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ControlFlow22.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start);
		// ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::ControlFlow47
		addToElementRepository("ControlFlow47", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow47);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow47.setName("ControlFlow47");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow47.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow47.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow47.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue);
		// ControlFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ControlFlow138
		addToElementRepository("ControlFlow138", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138.setName("ControlFlow138");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction MultipleDelegation_SameConnector_P_PWP_Signal_main::Create Tester
		addToElementRepository("Create Tester", MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester.setName("Create Tester");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester.setClassifier(MultipleDelegation_SameConnector_P_PWP_Signal_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::Fork s
		addToElementRepository("Fork s", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s.setName("Fork s");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s.setVisibility(VisibilityKind.public_);
		// ForkNode MultipleDelegation_SameConnector_P_PWP_Signal_main::Fork Tester
		addToElementRepository("Fork Tester", MultipleDelegation_SameConnector_P_PWP_Signal_main_Fork_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Fork_Tester.setName("Fork Tester");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Fork_Tester.setVisibility(VisibilityKind.public_);
		// ForkNode MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Fork this
		addToElementRepository("Fork this", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this.setName("Fork this");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity::testP
		addToElementRepository("testP", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP.setName("testP");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP.addOwnedParameter(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP.addLanguage("Java");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP.addLanguage("Import");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP.addBody("if(index == 1) 	{ 		System.out.println(\"Asserting c.a[1].b.p == 4 && c.a[2].b.p == 4 && c.a[3].b.p == 4 && c.a[4].b.p == 4\"); 	}  	// Test parameter p 	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument p = \" + p); 	 	System.out.println( \"c.a[\" + index + \"].b.p == \" + p); 	success = success && (p == 4); 	if(index == MAX_INDEX) 	{  		System.out.print(\"Signal delegated on all links (shall be true for default strategy): \");  		if(success) 		{ 			System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 		} 		else 		{ 			System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 		} 	}  	index++;");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeGeneralization_Instances()
	{
		// Generalization MultipleDelegation_SameConnector_P_PWP_Signal_Tester::Generalization90
		addToElementRepository("Generalization90", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Generalization90);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Generalization90.setGeneral(MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call test()::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target.setName("target");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Tester);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send Continue::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target.setName("target");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target.setType(MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_main_Start Tester::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object.setVisibility(VisibilityKind.public_);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v.setName("v");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read c.p::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object.setType(MultipleDelegation_SameConnector_P_PWP_Signal_C);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read b.p::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object.setType(MultipleDelegation_SameConnector_P_PWP_Signal_B);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_main_Send Start::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target.setName("target");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Tester);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester()::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target.setName("target");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Tester);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target.setName("target");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target.setType(MultipleDelegation_SameConnector_P_PWP_Signal_IImpl);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.t::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object.setVisibility(VisibilityKind.public_);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S::t
		addToElementRepository("t", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t.setName("t");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t.setType(MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.v::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object.setVisibility(VisibilityKind.public_);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read this.c::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Tester);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call testP::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p.setName("p");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p::value
		addToElementRepository("value", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value.setName("value");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read c.a[]::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object.setType(MultipleDelegation_SameConnector_P_PWP_Signal_C);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read a.b::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object.setType(MultipleDelegation_SameConnector_P_PWP_Signal_A);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read this.c::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Tester);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object.setType(MultipleDelegation_SameConnector_P_PWP_Signal_B);
	}

	private void initializeInterface_Instances()
	{
		// Interface MultipleDelegation_SameConnector_P_PWP_Signal::I
		addToElementRepository("I", MultipleDelegation_SameConnector_P_PWP_Signal_I);
		MultipleDelegation_SameConnector_P_PWP_Signal_I.setName("I");
		MultipleDelegation_SameConnector_P_PWP_Signal_I.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_I.addOwnedReception(MultipleDelegation_SameConnector_P_PWP_Signal_I_S);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization MultipleDelegation_SameConnector_P_PWP_Signal_IImpl::IRealization
		addToElementRepository("IRealization", MultipleDelegation_SameConnector_P_PWP_Signal_IImpl_IRealization);
		MultipleDelegation_SameConnector_P_PWP_Signal_IImpl_IRealization.setName("IRealization");
		MultipleDelegation_SameConnector_P_PWP_Signal_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_IImpl_IRealization.setContract(MultipleDelegation_SameConnector_P_PWP_Signal_I);
		// InterfaceRealization MultipleDelegation_SameConnector_P_PWP_Signal_B::IRealization
		addToElementRepository("IRealization", MultipleDelegation_SameConnector_P_PWP_Signal_B_IRealization);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_IRealization.setName("IRealization");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_IRealization.setContract(MultipleDelegation_SameConnector_P_PWP_Signal_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23::LiteralBoolean24
		addToElementRepository("LiteralBoolean24", MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23_LiteralBoolean24);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23_LiteralBoolean24.setName("LiteralBoolean24");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23_LiteralBoolean24.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23_LiteralBoolean24.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185::LiteralBoolean186
		addToElementRepository("LiteralBoolean186", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185_LiteralBoolean186);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185_LiteralBoolean186.setName("LiteralBoolean186");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185_LiteralBoolean186.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185_LiteralBoolean186.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167::LiteralBoolean169
		addToElementRepository("LiteralBoolean169", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167_LiteralBoolean169);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167_LiteralBoolean169.setName("LiteralBoolean169");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167_LiteralBoolean169.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167_LiteralBoolean169.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48::LiteralBoolean49
		addToElementRepository("LiteralBoolean49", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48_LiteralBoolean49);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48_LiteralBoolean49.setName("LiteralBoolean49");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48_LiteralBoolean49.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48_LiteralBoolean49.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140::LiteralBoolean142
		addToElementRepository("LiteralBoolean142", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140_LiteralBoolean142);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140_LiteralBoolean142.setName("LiteralBoolean142");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140_LiteralBoolean142.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140_LiteralBoolean142.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12::LiteralBoolean14
		addToElementRepository("LiteralBoolean14", MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12_LiteralBoolean14);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12_LiteralBoolean14.setName("LiteralBoolean14");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12_LiteralBoolean14.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12_LiteralBoolean14.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102::LiteralBoolean104
		addToElementRepository("LiteralBoolean104", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102_LiteralBoolean104);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102_LiteralBoolean104.setName("LiteralBoolean104");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102_LiteralBoolean104.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102_LiteralBoolean104.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120::LiteralBoolean122
		addToElementRepository("LiteralBoolean122", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120_LiteralBoolean122);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120_LiteralBoolean122.setName("LiteralBoolean122");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120_LiteralBoolean122.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120_LiteralBoolean122.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51::LiteralBoolean53
		addToElementRepository("LiteralBoolean53", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51_LiteralBoolean53);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51_LiteralBoolean53.setName("LiteralBoolean53");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51_LiteralBoolean53.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51_LiteralBoolean53.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127::LiteralBoolean128
		addToElementRepository("LiteralBoolean128", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127_LiteralBoolean128);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127_LiteralBoolean128.setName("LiteralBoolean128");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127_LiteralBoolean128.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127_LiteralBoolean128.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54::LiteralBoolean55
		addToElementRepository("LiteralBoolean55", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54_LiteralBoolean55);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54_LiteralBoolean55.setName("LiteralBoolean55");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54_LiteralBoolean55.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54_LiteralBoolean55.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156::LiteralBoolean157
		addToElementRepository("LiteralBoolean157", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156_LiteralBoolean157);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156_LiteralBoolean157.setName("LiteralBoolean157");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156_LiteralBoolean157.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156_LiteralBoolean157.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99::LiteralBoolean100
		addToElementRepository("LiteralBoolean100", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean100);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean100.setName("LiteralBoolean100");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean100.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean100.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44::LiteralBoolean45
		addToElementRepository("LiteralBoolean45", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44_LiteralBoolean45);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44_LiteralBoolean45.setName("LiteralBoolean45");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44_LiteralBoolean45.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44_LiteralBoolean45.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170::LiteralBoolean171
		addToElementRepository("LiteralBoolean171", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170_LiteralBoolean171);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170_LiteralBoolean171.setName("LiteralBoolean171");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170_LiteralBoolean171.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170_LiteralBoolean171.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41::LiteralBoolean42
		addToElementRepository("LiteralBoolean42", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41_LiteralBoolean42);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41_LiteralBoolean42.setName("LiteralBoolean42");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41_LiteralBoolean42.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41_LiteralBoolean42.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9::LiteralBoolean10
		addToElementRepository("LiteralBoolean10", MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9_LiteralBoolean10);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9_LiteralBoolean10.setName("LiteralBoolean10");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9_LiteralBoolean10.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9_LiteralBoolean10.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63::LiteralBoolean65
		addToElementRepository("LiteralBoolean65", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63_LiteralBoolean65);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63_LiteralBoolean65.setName("LiteralBoolean65");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63_LiteralBoolean65.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63_LiteralBoolean65.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91::LiteralBoolean93
		addToElementRepository("LiteralBoolean93", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91_LiteralBoolean93);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91_LiteralBoolean93.setName("LiteralBoolean93");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91_LiteralBoolean93.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91_LiteralBoolean93.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17::LiteralBoolean18
		addToElementRepository("LiteralBoolean18", MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17_LiteralBoolean18);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17_LiteralBoolean18.setName("LiteralBoolean18");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17_LiteralBoolean18.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17_LiteralBoolean18.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188::LiteralBoolean190
		addToElementRepository("LiteralBoolean190", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188_LiteralBoolean190);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188_LiteralBoolean190.setName("LiteralBoolean190");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188_LiteralBoolean190.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188_LiteralBoolean190.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94::LiteralBoolean96
		addToElementRepository("LiteralBoolean96", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94_LiteralBoolean96);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94_LiteralBoolean96.setName("LiteralBoolean96");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94_LiteralBoolean96.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94_LiteralBoolean96.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value(4)_result::LiteralInteger161
		addToElementRepository("LiteralInteger161", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger161);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger161.setName("LiteralInteger161");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger161.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger161.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_R_y::LiteralInteger77
		addToElementRepository("LiteralInteger77", MultipleDelegation_SameConnector_P_PWP_Signal_R_y_LiteralInteger77);
		MultipleDelegation_SameConnector_P_PWP_Signal_R_y_LiteralInteger77.setName("LiteralInteger77");
		MultipleDelegation_SameConnector_P_PWP_Signal_R_y_LiteralInteger77.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_R_y_LiteralInteger77.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167::LiteralInteger168
		addToElementRepository("LiteralInteger168", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167_LiteralInteger168);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167_LiteralInteger168.setName("LiteralInteger168");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167_LiteralInteger168.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167_LiteralInteger168.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51::LiteralInteger52
		addToElementRepository("LiteralInteger52", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51_LiteralInteger52);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51_LiteralInteger52.setName("LiteralInteger52");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51_LiteralInteger52.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51_LiteralInteger52.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call testP_p::LiteralInteger118
		addToElementRepository("LiteralInteger118", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger118);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger118.setName("LiteralInteger118");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger118.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger118.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_3_result::LiteralInteger192
		addToElementRepository("LiteralInteger192", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger192);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger192.setName("LiteralInteger192");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger192.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger192.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.v_result::LiteralInteger57
		addToElementRepository("LiteralInteger57", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger57);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger57.setName("LiteralInteger57");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger57.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger57.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result::LiteralInteger164
		addToElementRepository("LiteralInteger164", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger164);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger164.setName("LiteralInteger164");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger164.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger164.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99::LiteralInteger101
		addToElementRepository("LiteralInteger101", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger101);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger101.setName("LiteralInteger101");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger101.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger101.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63::LiteralInteger64
		addToElementRepository("LiteralInteger64", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63_LiteralInteger64);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63_LiteralInteger64.setName("LiteralInteger64");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63_LiteralInteger64.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63_LiteralInteger64.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester()_result::LiteralInteger27
		addToElementRepository("LiteralInteger27", MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralInteger27);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralInteger27.setName("LiteralInteger27");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralInteger27.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralInteger27.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54::LiteralInteger56
		addToElementRepository("LiteralInteger56", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54_LiteralInteger56);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54_LiteralInteger56.setName("LiteralInteger56");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54_LiteralInteger56.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54_LiteralInteger56.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send Continue_target::LiteralInteger67
		addToElementRepository("LiteralInteger67", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger67);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger67.setName("LiteralInteger67");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger67.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger67.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17::LiteralInteger19
		addToElementRepository("LiteralInteger19", MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17_LiteralInteger19);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17_LiteralInteger19.setName("LiteralInteger19");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17_LiteralInteger19.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17_LiteralInteger19.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_C_a::LiteralInteger79
		addToElementRepository("LiteralInteger79", MultipleDelegation_SameConnector_P_PWP_Signal_C_a_LiteralInteger79);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_a_LiteralInteger79.setName("LiteralInteger79");
		MultipleDelegation_SameConnector_P_PWP_Signal_C_a_LiteralInteger79.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_a_LiteralInteger79.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_1_result::LiteralInteger135
		addToElementRepository("LiteralInteger135", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger135);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger135.setName("LiteralInteger135");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger135.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger135.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S_v::LiteralInteger181
		addToElementRepository("LiteralInteger181", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger181);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger181.setName("LiteralInteger181");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger181.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger181.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120::LiteralInteger121
		addToElementRepository("LiteralInteger121", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120_LiteralInteger121);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120_LiteralInteger121.setName("LiteralInteger121");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120_LiteralInteger121.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120_LiteralInteger121.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140::LiteralInteger141
		addToElementRepository("LiteralInteger141", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140_LiteralInteger141);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140_LiteralInteger141.setName("LiteralInteger141");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140_LiteralInteger141.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140_LiteralInteger141.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_Create Tester_result::LiteralInteger7
		addToElementRepository("LiteralInteger7", MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result_LiteralInteger7);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result_LiteralInteger7.setName("LiteralInteger7");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result_LiteralInteger7.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result_LiteralInteger7.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read c.p_object::LiteralInteger173
		addToElementRepository("LiteralInteger173", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralInteger173);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralInteger173.setName("LiteralInteger173");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralInteger173.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralInteger173.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_R_x::LiteralInteger75
		addToElementRepository("LiteralInteger75", MultipleDelegation_SameConnector_P_PWP_Signal_R_x_LiteralInteger75);
		MultipleDelegation_SameConnector_P_PWP_Signal_R_x_LiteralInteger75.setName("LiteralInteger75");
		MultipleDelegation_SameConnector_P_PWP_Signal_R_x_LiteralInteger75.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_R_x_LiteralInteger75.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read this.c_result::LiteralInteger123
		addToElementRepository("LiteralInteger123", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralInteger123);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralInteger123.setName("LiteralInteger123");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralInteger123.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralInteger123.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_U_y::LiteralInteger88
		addToElementRepository("LiteralInteger88", MultipleDelegation_SameConnector_P_PWP_Signal_U_y_LiteralInteger88);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_y_LiteralInteger88.setName("LiteralInteger88");
		MultipleDelegation_SameConnector_P_PWP_Signal_U_y_LiteralInteger88.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_y_LiteralInteger88.setValue(0);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read c.a[]_result::LiteralInteger109
		addToElementRepository("LiteralInteger109", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result_LiteralInteger109);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result_LiteralInteger109.setName("LiteralInteger109");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result_LiteralInteger109.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result_LiteralInteger109.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_1_result::LiteralInteger136
		addToElementRepository("LiteralInteger136", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger136);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger136.setName("LiteralInteger136");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger136.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger136.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read a.b_object::LiteralInteger115
		addToElementRepository("LiteralInteger115", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger115);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger115.setName("LiteralInteger115");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger115.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger115.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94::LiteralInteger95
		addToElementRepository("LiteralInteger95", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94_LiteralInteger95);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94_LiteralInteger95.setName("LiteralInteger95");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94_LiteralInteger95.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94_LiteralInteger95.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9::LiteralInteger11
		addToElementRepository("LiteralInteger11", MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9_LiteralInteger11);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9_LiteralInteger11.setName("LiteralInteger11");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9_LiteralInteger11.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9_LiteralInteger11.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call testP_p::LiteralInteger119
		addToElementRepository("LiteralInteger119", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger119);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger119.setName("LiteralInteger119");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger119.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger119.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170::LiteralInteger172
		addToElementRepository("LiteralInteger172", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170_LiteralInteger172);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170_LiteralInteger172.setName("LiteralInteger172");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170_LiteralInteger172.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170_LiteralInteger172.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read c.a[]_object::LiteralInteger111
		addToElementRepository("LiteralInteger111", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object_LiteralInteger111);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object_LiteralInteger111.setName("LiteralInteger111");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object_LiteralInteger111.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object_LiteralInteger111.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83::LiteralInteger84
		addToElementRepository("LiteralInteger84", MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83_LiteralInteger84);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83_LiteralInteger84.setName("LiteralInteger84");
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83_LiteralInteger84.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83_LiteralInteger84.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read b.p_result::LiteralInteger106
		addToElementRepository("LiteralInteger106", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger106);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger106.setName("LiteralInteger106");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger106.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger106.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester()_target::LiteralInteger29
		addToElementRepository("LiteralInteger29", MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target_LiteralInteger29);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target_LiteralInteger29.setName("LiteralInteger29");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target_LiteralInteger29.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target_LiteralInteger29.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p_object::LiteralInteger40
		addToElementRepository("LiteralInteger40", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger40);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger40.setName("LiteralInteger40");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger40.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger40.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read b.p_object::LiteralInteger107
		addToElementRepository("LiteralInteger107", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger107);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger107.setName("LiteralInteger107");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger107.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger107.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.t_result::LiteralInteger70
		addToElementRepository("LiteralInteger70", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger70);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger70.setName("LiteralInteger70");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger70.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger70.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_U_x::LiteralInteger87
		addToElementRepository("LiteralInteger87", MultipleDelegation_SameConnector_P_PWP_Signal_U_x_LiteralInteger87);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_x_LiteralInteger87.setName("LiteralInteger87");
		MultipleDelegation_SameConnector_P_PWP_Signal_U_x_LiteralInteger87.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_x_LiteralInteger87.setValue(0);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_4_result::LiteralInteger145
		addToElementRepository("LiteralInteger145", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger145);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger145.setName("LiteralInteger145");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger145.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger145.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.t_object::LiteralInteger69
		addToElementRepository("LiteralInteger69", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger69);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger69.setName("LiteralInteger69");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger69.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger69.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read this.c_object::LiteralInteger154
		addToElementRepository("LiteralInteger154", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralInteger154);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralInteger154.setName("LiteralInteger154");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralInteger154.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralInteger154.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call test()_target::LiteralInteger160
		addToElementRepository("LiteralInteger160", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger160);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger160.setName("LiteralInteger160");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger160.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger160.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23::LiteralInteger25
		addToElementRepository("LiteralInteger25", MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23_LiteralInteger25);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23_LiteralInteger25.setName("LiteralInteger25");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23_LiteralInteger25.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23_LiteralInteger25.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read a.b_result::LiteralInteger114
		addToElementRepository("LiteralInteger114", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger114);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger114.setName("LiteralInteger114");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger114.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger114.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept S_s::LiteralInteger33
		addToElementRepository("LiteralInteger33", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger33);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger33.setName("LiteralInteger33");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger33.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger33.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_A_b::LiteralInteger0
		addToElementRepository("LiteralInteger0", MultipleDelegation_SameConnector_P_PWP_Signal_A_b_LiteralInteger0);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_b_LiteralInteger0.setName("LiteralInteger0");
		MultipleDelegation_SameConnector_P_PWP_Signal_A_b_LiteralInteger0.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_b_LiteralInteger0.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48::LiteralInteger50
		addToElementRepository("LiteralInteger50", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48_LiteralInteger50);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48_LiteralInteger50.setName("LiteralInteger50");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48_LiteralInteger50.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48_LiteralInteger50.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185::LiteralInteger187
		addToElementRepository("LiteralInteger187", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185_LiteralInteger187);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185_LiteralInteger187.setName("LiteralInteger187");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185_LiteralInteger187.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185_LiteralInteger187.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_4_result::LiteralInteger146
		addToElementRepository("LiteralInteger146", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger146);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger146.setName("LiteralInteger146");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger146.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger146.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S_t::LiteralInteger183
		addToElementRepository("LiteralInteger183", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger183);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger183.setName("LiteralInteger183");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger183.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger183.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41::LiteralInteger43
		addToElementRepository("LiteralInteger43", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41_LiteralInteger43);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41_LiteralInteger43.setName("LiteralInteger43");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41_LiteralInteger43.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41_LiteralInteger43.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p_value::LiteralInteger35
		addToElementRepository("LiteralInteger35", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger35);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger35.setName("LiteralInteger35");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger35.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger35.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.v_object::LiteralInteger59
		addToElementRepository("LiteralInteger59", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger59);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger59.setName("LiteralInteger59");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger59.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger59.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read c.p_result::LiteralInteger176
		addToElementRepository("LiteralInteger176", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralInteger176);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralInteger176.setName("LiteralInteger176");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralInteger176.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralInteger176.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result::LiteralInteger61
		addToElementRepository("LiteralInteger61", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralInteger61);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralInteger61.setName("LiteralInteger61");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralInteger61.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralInteger61.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4::LiteralInteger5
		addToElementRepository("LiteralInteger5", MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralInteger5);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralInteger5.setName("LiteralInteger5");
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralInteger5.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralInteger5.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value(4)::LiteralInteger163
		addToElementRepository("LiteralInteger163", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger163);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger163.setName("LiteralInteger163");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger163.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger163.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12::LiteralInteger13
		addToElementRepository("LiteralInteger13", MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12_LiteralInteger13);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12_LiteralInteger13.setName("LiteralInteger13");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12_LiteralInteger13.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12_LiteralInteger13.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91::LiteralInteger92
		addToElementRepository("LiteralInteger92", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91_LiteralInteger92);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91_LiteralInteger92.setName("LiteralInteger92");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91_LiteralInteger92.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91_LiteralInteger92.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_Send Start_target::LiteralInteger16
		addToElementRepository("LiteralInteger16", MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target_LiteralInteger16);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target_LiteralInteger16.setName("LiteralInteger16");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target_LiteralInteger16.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target_LiteralInteger16.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44::LiteralInteger46
		addToElementRepository("LiteralInteger46", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44_LiteralInteger46);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44_LiteralInteger46.setName("LiteralInteger46");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44_LiteralInteger46.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44_LiteralInteger46.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralInteger132
		addToElementRepository("LiteralInteger132", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger132);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger132.setName("LiteralInteger132");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger132.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger132.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read this.c_object::LiteralInteger126
		addToElementRepository("LiteralInteger126", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralInteger126);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralInteger126.setName("LiteralInteger126");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralInteger126.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralInteger126.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188::LiteralInteger189
		addToElementRepository("LiteralInteger189", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188_LiteralInteger189);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188_LiteralInteger189.setName("LiteralInteger189");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188_LiteralInteger189.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188_LiteralInteger189.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_2_result::LiteralInteger148
		addToElementRepository("LiteralInteger148", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger148);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger148.setName("LiteralInteger148");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger148.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger148.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S_target::LiteralInteger179
		addToElementRepository("LiteralInteger179", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger179);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger179.setName("LiteralInteger179");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger179.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger179.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester()_result::LiteralInteger26
		addToElementRepository("LiteralInteger26", MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralInteger26);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralInteger26.setName("LiteralInteger26");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralInteger26.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralInteger26.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_3_result::LiteralInteger191
		addToElementRepository("LiteralInteger191", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger191);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger191.setName("LiteralInteger191");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger191.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger191.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102::LiteralInteger103
		addToElementRepository("LiteralInteger103", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102_LiteralInteger103);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102_LiteralInteger103.setName("LiteralInteger103");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102_LiteralInteger103.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102_LiteralInteger103.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156::LiteralInteger158
		addToElementRepository("LiteralInteger158", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156_LiteralInteger158);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156_LiteralInteger158.setName("LiteralInteger158");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156_LiteralInteger158.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156_LiteralInteger158.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result::LiteralInteger97
		addToElementRepository("LiteralInteger97", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralInteger97);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralInteger97.setName("LiteralInteger97");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralInteger97.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralInteger97.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read this.c_result::LiteralInteger152
		addToElementRepository("LiteralInteger152", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralInteger152);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralInteger152.setName("LiteralInteger152");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralInteger152.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralInteger152.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_main_Start Tester_object::LiteralInteger20
		addToElementRepository("LiteralInteger20", MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object_LiteralInteger20);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object_LiteralInteger20.setName("LiteralInteger20");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object_LiteralInteger20.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object_LiteralInteger20.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept S_s::LiteralInteger34
		addToElementRepository("LiteralInteger34", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger34);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger34.setName("LiteralInteger34");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger34.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger34.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralInteger131
		addToElementRepository("LiteralInteger131", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger131);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger131.setName("LiteralInteger131");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger131.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger131.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127::LiteralInteger129
		addToElementRepository("LiteralInteger129", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127_LiteralInteger129);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127_LiteralInteger129.setName("LiteralInteger129");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127_LiteralInteger129.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127_LiteralInteger129.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p_result::LiteralInteger38
		addToElementRepository("LiteralInteger38", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger38);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger38.setName("LiteralInteger38");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger38.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger38.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_2_result::LiteralInteger149
		addToElementRepository("LiteralInteger149", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger149);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger149.setName("LiteralInteger149");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger149.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger149.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call test()_target::LiteralUnlimitedNatural159
		addToElementRepository("LiteralUnlimitedNatural159", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural159);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural159.setName("LiteralUnlimitedNatural159");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural159.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural159.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_4_result::LiteralUnlimitedNatural144
		addToElementRepository("LiteralUnlimitedNatural144", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural144);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural144.setName("LiteralUnlimitedNatural144");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural144.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural144.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p_object::LiteralUnlimitedNatural39
		addToElementRepository("LiteralUnlimitedNatural39", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural39);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural39.setName("LiteralUnlimitedNatural39");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural39.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural39.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read b.p_result::LiteralUnlimitedNatural105
		addToElementRepository("LiteralUnlimitedNatural105", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural105);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural105.setName("LiteralUnlimitedNatural105");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural105.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural105.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_U_y::LiteralUnlimitedNatural89
		addToElementRepository("LiteralUnlimitedNatural89", MultipleDelegation_SameConnector_P_PWP_Signal_U_y_LiteralUnlimitedNatural89);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_y_LiteralUnlimitedNatural89.setName("LiteralUnlimitedNatural89");
		MultipleDelegation_SameConnector_P_PWP_Signal_U_y_LiteralUnlimitedNatural89.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_y_LiteralUnlimitedNatural89.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4::LiteralUnlimitedNatural6
		addToElementRepository("LiteralUnlimitedNatural6", MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralUnlimitedNatural6);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralUnlimitedNatural6.setName("LiteralUnlimitedNatural6");
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralUnlimitedNatural6.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralUnlimitedNatural6.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_main_Send Start_target::LiteralUnlimitedNatural15
		addToElementRepository("LiteralUnlimitedNatural15", MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target_LiteralUnlimitedNatural15);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target_LiteralUnlimitedNatural15.setName("LiteralUnlimitedNatural15");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target_LiteralUnlimitedNatural15.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target_LiteralUnlimitedNatural15.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_U_x::LiteralUnlimitedNatural86
		addToElementRepository("LiteralUnlimitedNatural86", MultipleDelegation_SameConnector_P_PWP_Signal_U_x_LiteralUnlimitedNatural86);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_x_LiteralUnlimitedNatural86.setName("LiteralUnlimitedNatural86");
		MultipleDelegation_SameConnector_P_PWP_Signal_U_x_LiteralUnlimitedNatural86.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_x_LiteralUnlimitedNatural86.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call testP_p::LiteralUnlimitedNatural117
		addToElementRepository("LiteralUnlimitedNatural117", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural117);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural117.setName("LiteralUnlimitedNatural117");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural117.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural117.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read c.p_object::LiteralUnlimitedNatural174
		addToElementRepository("LiteralUnlimitedNatural174", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralUnlimitedNatural174);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralUnlimitedNatural174.setName("LiteralUnlimitedNatural174");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralUnlimitedNatural174.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralUnlimitedNatural174.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value(4)_result::LiteralUnlimitedNatural162
		addToElementRepository("LiteralUnlimitedNatural162", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural162);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural162.setName("LiteralUnlimitedNatural162");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural162.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural162.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester()_result::LiteralUnlimitedNatural28
		addToElementRepository("LiteralUnlimitedNatural28", MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralUnlimitedNatural28);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralUnlimitedNatural28.setName("LiteralUnlimitedNatural28");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralUnlimitedNatural28.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result_LiteralUnlimitedNatural28.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read b.p_object::LiteralUnlimitedNatural108
		addToElementRepository("LiteralUnlimitedNatural108", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural108);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural108.setName("LiteralUnlimitedNatural108");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural108.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural108.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_main_Create Tester_result::LiteralUnlimitedNatural8
		addToElementRepository("LiteralUnlimitedNatural8", MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result_LiteralUnlimitedNatural8);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result_LiteralUnlimitedNatural8.setName("LiteralUnlimitedNatural8");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result_LiteralUnlimitedNatural8.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result_LiteralUnlimitedNatural8.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read this.c_object::LiteralUnlimitedNatural155
		addToElementRepository("LiteralUnlimitedNatural155", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralUnlimitedNatural155);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralUnlimitedNatural155.setName("LiteralUnlimitedNatural155");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralUnlimitedNatural155.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralUnlimitedNatural155.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read c.p_result::LiteralUnlimitedNatural175
		addToElementRepository("LiteralUnlimitedNatural175", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralUnlimitedNatural175);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralUnlimitedNatural175.setName("LiteralUnlimitedNatural175");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralUnlimitedNatural175.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralUnlimitedNatural175.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S_t::LiteralUnlimitedNatural182
		addToElementRepository("LiteralUnlimitedNatural182", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural182);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural182.setName("LiteralUnlimitedNatural182");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural182.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural182.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.t_result::LiteralUnlimitedNatural71
		addToElementRepository("LiteralUnlimitedNatural71", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural71);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural71.setName("LiteralUnlimitedNatural71");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural71.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural71.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester()_target::LiteralUnlimitedNatural30
		addToElementRepository("LiteralUnlimitedNatural30", MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target_LiteralUnlimitedNatural30);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target_LiteralUnlimitedNatural30.setName("LiteralUnlimitedNatural30");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target_LiteralUnlimitedNatural30.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target_LiteralUnlimitedNatural30.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralUnlimitedNatural130
		addToElementRepository("LiteralUnlimitedNatural130", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural130);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural130.setName("LiteralUnlimitedNatural130");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural130.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural130.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read this.c_result::LiteralUnlimitedNatural153
		addToElementRepository("LiteralUnlimitedNatural153", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralUnlimitedNatural153);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralUnlimitedNatural153.setName("LiteralUnlimitedNatural153");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralUnlimitedNatural153.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralUnlimitedNatural153.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result::LiteralUnlimitedNatural98
		addToElementRepository("LiteralUnlimitedNatural98", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural98);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural98.setName("LiteralUnlimitedNatural98");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural98.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural98.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S_target::LiteralUnlimitedNatural178
		addToElementRepository("LiteralUnlimitedNatural178", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural178);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural178.setName("LiteralUnlimitedNatural178");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural178.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural178.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read this.c_result::LiteralUnlimitedNatural124
		addToElementRepository("LiteralUnlimitedNatural124", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralUnlimitedNatural124);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralUnlimitedNatural124.setName("LiteralUnlimitedNatural124");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralUnlimitedNatural124.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralUnlimitedNatural124.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.v_object::LiteralUnlimitedNatural60
		addToElementRepository("LiteralUnlimitedNatural60", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural60);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural60.setName("LiteralUnlimitedNatural60");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural60.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural60.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read a.b_result::LiteralUnlimitedNatural113
		addToElementRepository("LiteralUnlimitedNatural113", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural113);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural113.setName("LiteralUnlimitedNatural113");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural113.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural113.setValue(4);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result::LiteralUnlimitedNatural62
		addToElementRepository("LiteralUnlimitedNatural62", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural62);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural62.setName("LiteralUnlimitedNatural62");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural62.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural62.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p_result::LiteralUnlimitedNatural37
		addToElementRepository("LiteralUnlimitedNatural37", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural37);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural37.setName("LiteralUnlimitedNatural37");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural37.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural37.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_3_result::LiteralUnlimitedNatural193
		addToElementRepository("LiteralUnlimitedNatural193", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural193);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural193.setName("LiteralUnlimitedNatural193");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural193.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural193.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read a.b_object::LiteralUnlimitedNatural116
		addToElementRepository("LiteralUnlimitedNatural116", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural116);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural116.setName("LiteralUnlimitedNatural116");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural116.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural116.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.t_object::LiteralUnlimitedNatural68
		addToElementRepository("LiteralUnlimitedNatural68", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural68);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural68.setName("LiteralUnlimitedNatural68");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural68.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural68.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_2_result::LiteralUnlimitedNatural147
		addToElementRepository("LiteralUnlimitedNatural147", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural147);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural147.setName("LiteralUnlimitedNatural147");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural147.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural147.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83::LiteralUnlimitedNatural85
		addToElementRepository("LiteralUnlimitedNatural85", MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83_LiteralUnlimitedNatural85);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83_LiteralUnlimitedNatural85.setName("LiteralUnlimitedNatural85");
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83_LiteralUnlimitedNatural85.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd83_LiteralUnlimitedNatural85.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read c.a[]_result::LiteralUnlimitedNatural110
		addToElementRepository("LiteralUnlimitedNatural110", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result_LiteralUnlimitedNatural110);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result_LiteralUnlimitedNatural110.setName("LiteralUnlimitedNatural110");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result_LiteralUnlimitedNatural110.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result_LiteralUnlimitedNatural110.setValue(4);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_main_Start Tester_object::LiteralUnlimitedNatural21
		addToElementRepository("LiteralUnlimitedNatural21", MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object_LiteralUnlimitedNatural21);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object_LiteralUnlimitedNatural21.setName("LiteralUnlimitedNatural21");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object_LiteralUnlimitedNatural21.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object_LiteralUnlimitedNatural21.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_R_y::LiteralUnlimitedNatural78
		addToElementRepository("LiteralUnlimitedNatural78", MultipleDelegation_SameConnector_P_PWP_Signal_R_y_LiteralUnlimitedNatural78);
		MultipleDelegation_SameConnector_P_PWP_Signal_R_y_LiteralUnlimitedNatural78.setName("LiteralUnlimitedNatural78");
		MultipleDelegation_SameConnector_P_PWP_Signal_R_y_LiteralUnlimitedNatural78.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_R_y_LiteralUnlimitedNatural78.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd2::LiteralUnlimitedNatural3
		addToElementRepository("LiteralUnlimitedNatural3", MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd2_LiteralUnlimitedNatural3);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd2_LiteralUnlimitedNatural3.setName("LiteralUnlimitedNatural3");
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd2_LiteralUnlimitedNatural3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_r_ConnectorEnd2_LiteralUnlimitedNatural3.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd81::LiteralUnlimitedNatural82
		addToElementRepository("LiteralUnlimitedNatural82", MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd81_LiteralUnlimitedNatural82);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd81_LiteralUnlimitedNatural82.setName("LiteralUnlimitedNatural82");
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd81_LiteralUnlimitedNatural82.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_u_ConnectorEnd81_LiteralUnlimitedNatural82.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read this.c_object::LiteralUnlimitedNatural125
		addToElementRepository("LiteralUnlimitedNatural125", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralUnlimitedNatural125);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralUnlimitedNatural125.setName("LiteralUnlimitedNatural125");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralUnlimitedNatural125.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralUnlimitedNatural125.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept S_s::LiteralUnlimitedNatural32
		addToElementRepository("LiteralUnlimitedNatural32", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural32);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural32.setName("LiteralUnlimitedNatural32");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural32.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural32.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.v_result::LiteralUnlimitedNatural58
		addToElementRepository("LiteralUnlimitedNatural58", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural58);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural58.setName("LiteralUnlimitedNatural58");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural58.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural58.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_R_x::LiteralUnlimitedNatural76
		addToElementRepository("LiteralUnlimitedNatural76", MultipleDelegation_SameConnector_P_PWP_Signal_R_x_LiteralUnlimitedNatural76);
		MultipleDelegation_SameConnector_P_PWP_Signal_R_x_LiteralUnlimitedNatural76.setName("LiteralUnlimitedNatural76");
		MultipleDelegation_SameConnector_P_PWP_Signal_R_x_LiteralUnlimitedNatural76.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_R_x_LiteralUnlimitedNatural76.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_C_a::LiteralUnlimitedNatural80
		addToElementRepository("LiteralUnlimitedNatural80", MultipleDelegation_SameConnector_P_PWP_Signal_C_a_LiteralUnlimitedNatural80);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_a_LiteralUnlimitedNatural80.setName("LiteralUnlimitedNatural80");
		MultipleDelegation_SameConnector_P_PWP_Signal_C_a_LiteralUnlimitedNatural80.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_a_LiteralUnlimitedNatural80.setValue(4);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p_value::LiteralUnlimitedNatural36
		addToElementRepository("LiteralUnlimitedNatural36", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural36);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural36.setName("LiteralUnlimitedNatural36");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural36.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural36.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S_v::LiteralUnlimitedNatural180
		addToElementRepository("LiteralUnlimitedNatural180", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural180);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural180.setName("LiteralUnlimitedNatural180");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural180.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural180.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send Continue_target::LiteralUnlimitedNatural66
		addToElementRepository("LiteralUnlimitedNatural66", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural66);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural66.setName("LiteralUnlimitedNatural66");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural66.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural66.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result::LiteralUnlimitedNatural165
		addToElementRepository("LiteralUnlimitedNatural165", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural165);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural165.setName("LiteralUnlimitedNatural165");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural165.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural165.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_1_result::LiteralUnlimitedNatural137
		addToElementRepository("LiteralUnlimitedNatural137", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural137);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural137.setName("LiteralUnlimitedNatural137");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural137.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural137.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_A_b::LiteralUnlimitedNatural1
		addToElementRepository("LiteralUnlimitedNatural1", MultipleDelegation_SameConnector_P_PWP_Signal_A_b_LiteralUnlimitedNatural1);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_b_LiteralUnlimitedNatural1.setName("LiteralUnlimitedNatural1");
		MultipleDelegation_SameConnector_P_PWP_Signal_A_b_LiteralUnlimitedNatural1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_b_LiteralUnlimitedNatural1.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read c.a[]_object::LiteralUnlimitedNatural112
		addToElementRepository("LiteralUnlimitedNatural112", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object_LiteralUnlimitedNatural112);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object_LiteralUnlimitedNatural112.setName("LiteralUnlimitedNatural112");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object_LiteralUnlimitedNatural112.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object_LiteralUnlimitedNatural112.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow127
		addToElementRepository("ObjectFlow127", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127.setName("ObjectFlow127");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow127_LiteralBoolean128);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow91
		addToElementRepository("ObjectFlow91", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91.setName("ObjectFlow91");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow91_LiteralBoolean93);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_main::ObjectFlow9
		addToElementRepository("ObjectFlow9", MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9.setName("ObjectFlow9");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_main_Fork_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow9_LiteralBoolean10);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_main::ObjectFlow12
		addToElementRepository("ObjectFlow12", MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12.setName("ObjectFlow12");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_main_Fork_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow12_LiteralBoolean14);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow99
		addToElementRepository("ObjectFlow99", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99.setName("ObjectFlow99");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean100);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::ObjectFlow41
		addToElementRepository("ObjectFlow41", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41.setName("ObjectFlow41");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow41_LiteralBoolean42);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::ObjectFlow44
		addToElementRepository("ObjectFlow44", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44.setName("ObjectFlow44");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow44_LiteralBoolean45);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow167
		addToElementRepository("ObjectFlow167", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167.setName("ObjectFlow167");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow167_LiteralBoolean169);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow170
		addToElementRepository("ObjectFlow170", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170.setName("ObjectFlow170");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow170_LiteralBoolean171);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow120
		addToElementRepository("ObjectFlow120", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120.setName("ObjectFlow120");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow120_LiteralBoolean122);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::ObjectFlow48
		addToElementRepository("ObjectFlow48", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48.setName("ObjectFlow48");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow48_LiteralBoolean49);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::ObjectFlow51
		addToElementRepository("ObjectFlow51", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51.setName("ObjectFlow51");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow51_LiteralBoolean53);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::ObjectFlow54
		addToElementRepository("ObjectFlow54", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54.setName("ObjectFlow54");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow54_LiteralBoolean55);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_main::ObjectFlow17
		addToElementRepository("ObjectFlow17", MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17.setName("ObjectFlow17");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_main_Fork_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow17_LiteralBoolean18);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow140
		addToElementRepository("ObjectFlow140", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140.setName("ObjectFlow140");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow140_LiteralBoolean142);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow94
		addToElementRepository("ObjectFlow94", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94.setName("ObjectFlow94");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow94_LiteralBoolean96);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow102
		addToElementRepository("ObjectFlow102", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102.setName("ObjectFlow102");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow102_LiteralBoolean104);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow156
		addToElementRepository("ObjectFlow156", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156.setName("ObjectFlow156");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow156_LiteralBoolean157);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::ObjectFlow63
		addToElementRepository("ObjectFlow63", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63.setName("ObjectFlow63");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow63_LiteralBoolean65);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow185
		addToElementRepository("ObjectFlow185", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185.setName("ObjectFlow185");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow185_LiteralBoolean186);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow188
		addToElementRepository("ObjectFlow188", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188.setName("ObjectFlow188");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow188_LiteralBoolean190);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Signal_main::ObjectFlow23
		addToElementRepository("ObjectFlow23", MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23.setName("ObjectFlow23");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23.setSource(MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__target);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23.setGuard(MultipleDelegation_SameConnector_P_PWP_Signal_main_ObjectFlow23_LiteralBoolean24);
	}

	private void initializeOperation_Instances()
	{
		// Operation MultipleDelegation_SameConnector_P_PWP_Signal_Tester::Tester_Tester
		addToElementRepository("Tester_Tester", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester.setName("Tester");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester.addOwnedParameter(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_SameConnector_P_PWP_Signal_B::B_B
		addToElementRepository("B_B", MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B.setName("B");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B.addOwnedParameter(MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_SameConnector_P_PWP_Signal_A::A_A
		addToElementRepository("A_A", MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A.setName("A");
		MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A.addOwnedParameter(MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_SameConnector_P_PWP_Signal_Tester::test
		addToElementRepository("test", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_test);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_test.setName("test");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_test.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_test.addMethod(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity);
		// Operation MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester::test
		addToElementRepository("test", MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_test);
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_test.setName("test");
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_test.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_test.setIsAbstract(true);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_3::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Continue);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_main_Create Tester::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Create_Tester_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Tester);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_B);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.v::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read this.c::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_C);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Tester);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value(4)::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester()::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Tester__result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Tester);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read b.p::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read a.b::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_B);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result.setUpper(4);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result.setLower(4);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.t::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read c.a[]::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_A);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result.setUpper(4);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result.setLower(4);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read c.p::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_IImpl);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_2::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Continue);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Start::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Start);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read this.c::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_C);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_4::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Continue);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_B);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_1::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Continue);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Tester);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept S::s
		addToElementRepository("s", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s.setName("s");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s.setType(MultipleDelegation_SameConnector_P_PWP_Signal_S);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport MultipleDelegation_SameConnector_P_PWP_Signal::PackageImport73
		addToElementRepository("PackageImport73", MultipleDelegation_SameConnector_P_PWP_Signal_PackageImport73);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP_p.setName("p");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_Tester_Tester_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_B);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_B_B_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A_result);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A_result.setType(MultipleDelegation_SameConnector_P_PWP_Signal_A);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_A_A_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port MultipleDelegation_SameConnector_P_PWP_Signal_C::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_PWP_Signal_C_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_p.setName("p");
		MultipleDelegation_SameConnector_P_PWP_Signal_C_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_C_p.setType(MultipleDelegation_SameConnector_P_PWP_Signal_IImpl);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_p.setAggregation(AggregationKind.composite);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_p.isService = true;
		MultipleDelegation_SameConnector_P_PWP_Signal_C_p.addProvided(MultipleDelegation_SameConnector_P_PWP_Signal_I);
		// Port MultipleDelegation_SameConnector_P_PWP_Signal_A::q
		addToElementRepository("q", MultipleDelegation_SameConnector_P_PWP_Signal_A_q);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_q.setName("q");
		MultipleDelegation_SameConnector_P_PWP_Signal_A_q.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_A_q.setType(MultipleDelegation_SameConnector_P_PWP_Signal_IImpl);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_q.setAggregation(AggregationKind.composite);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_q.isService = true;
		MultipleDelegation_SameConnector_P_PWP_Signal_A_q.addProvided(MultipleDelegation_SameConnector_P_PWP_Signal_I);
	}

	private void initializeProperty_Instances()
	{
		// Property MultipleDelegation_SameConnector_P_PWP_Signal_R::x
		addToElementRepository("x", MultipleDelegation_SameConnector_P_PWP_Signal_R_x);
		MultipleDelegation_SameConnector_P_PWP_Signal_R_x.setName("x");
		MultipleDelegation_SameConnector_P_PWP_Signal_R_x.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_R_x.setType(MultipleDelegation_SameConnector_P_PWP_Signal_B);
		// Property MultipleDelegation_SameConnector_P_PWP_Signal_B::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_PWP_Signal_B_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_p.setName("p");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property MultipleDelegation_SameConnector_P_PWP_Signal_S::t
		addToElementRepository("t", MultipleDelegation_SameConnector_P_PWP_Signal_S_t);
		MultipleDelegation_SameConnector_P_PWP_Signal_S_t.setName("t");
		MultipleDelegation_SameConnector_P_PWP_Signal_S_t.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_S_t.setType(MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester);
		// Property MultipleDelegation_SameConnector_P_PWP_Signal_Tester::c
		addToElementRepository("c", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_c);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_c.setName("c");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_c.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_c.setType(MultipleDelegation_SameConnector_P_PWP_Signal_C);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_c.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_SameConnector_P_PWP_Signal_A::b
		addToElementRepository("b", MultipleDelegation_SameConnector_P_PWP_Signal_A_b);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_b.setName("b");
		MultipleDelegation_SameConnector_P_PWP_Signal_A_b.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_A_b.setType(MultipleDelegation_SameConnector_P_PWP_Signal_B);
		MultipleDelegation_SameConnector_P_PWP_Signal_A_b.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_SameConnector_P_PWP_Signal_R::y
		addToElementRepository("y", MultipleDelegation_SameConnector_P_PWP_Signal_R_y);
		MultipleDelegation_SameConnector_P_PWP_Signal_R_y.setName("y");
		MultipleDelegation_SameConnector_P_PWP_Signal_R_y.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_R_y.setType(MultipleDelegation_SameConnector_P_PWP_Signal_IImpl);
		// Property MultipleDelegation_SameConnector_P_PWP_Signal_U::x
		addToElementRepository("x", MultipleDelegation_SameConnector_P_PWP_Signal_U_x);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_x.setName("x");
		MultipleDelegation_SameConnector_P_PWP_Signal_U_x.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_x.setUpper(-1);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_x.setLower(0);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_x.setType(MultipleDelegation_SameConnector_P_PWP_Signal_IImpl);
		// Property MultipleDelegation_SameConnector_P_PWP_Signal_U::y
		addToElementRepository("y", MultipleDelegation_SameConnector_P_PWP_Signal_U_y);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_y.setName("y");
		MultipleDelegation_SameConnector_P_PWP_Signal_U_y.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_y.setUpper(-1);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_y.setLower(0);
		MultipleDelegation_SameConnector_P_PWP_Signal_U_y.setType(MultipleDelegation_SameConnector_P_PWP_Signal_IImpl);
		// Property MultipleDelegation_SameConnector_P_PWP_Signal_C::a
		addToElementRepository("a", MultipleDelegation_SameConnector_P_PWP_Signal_C_a);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_a.setName("a");
		MultipleDelegation_SameConnector_P_PWP_Signal_C_a.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_a.setUpper(4);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_a.setLower(4);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_a.setType(MultipleDelegation_SameConnector_P_PWP_Signal_A);
		MultipleDelegation_SameConnector_P_PWP_Signal_C_a.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_SameConnector_P_PWP_Signal_S::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_PWP_Signal_S_v);
		MultipleDelegation_SameConnector_P_PWP_Signal_S_v.setName("v");
		MultipleDelegation_SameConnector_P_PWP_Signal_S_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::this
		addToElementRepository("this", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this.setName("this");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result);
		// ReadSelfAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity::this
		addToElementRepository("this", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this.setName("this");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_this_result);
		// ReadSelfAction MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::this
		addToElementRepository("this", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this.setName("this");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Read c.p
		addToElementRepository("Read c.p", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p.setName("Read c.p");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Signal_C_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p.setObject(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity::Read b.p
		addToElementRepository("Read b.p", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p.setName("Read b.p");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Signal_B_p);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p.setObject(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::Read s.v
		addToElementRepository("Read s.v", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v.setName("Read s.v");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Signal_S_v);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v.setObject(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity::Read c.a[]
		addToElementRepository("Read c.a[]", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a_.setName("Read c.a[]");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a_.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a_.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Signal_C_a);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a_.setObject(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a_.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_c_a__result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity::Read a.b
		addToElementRepository("Read a.b", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b.setName("Read a.b");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Signal_A_b);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b.setObject(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Read this.c
		addToElementRepository("Read this.c", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c.setName("Read this.c");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_c);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c.setObject(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::Read s.t
		addToElementRepository("Read s.t", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t.setName("Read s.t");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Signal_S_t);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t.setObject(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity::Read this.c
		addToElementRepository("Read this.c", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c.setName("Read this.c");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_c);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c.setObject(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result);
	}

	private void initializeReception_Instances()
	{
		// Reception MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester::Continue
		addToElementRepository("Continue", MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_Continue);
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_Continue.setName("Continue");
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_Continue.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_Continue.setSignal(MultipleDelegation_SameConnector_P_PWP_Signal_Continue);
		// Reception MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester::Start
		addToElementRepository("Start", MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_Start);
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_Start.setName("Start");
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_Start.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_AbstractTester_Start.setSignal(MultipleDelegation_SameConnector_P_PWP_Signal_Start);
		// Reception MultipleDelegation_SameConnector_P_PWP_Signal_I::S
		addToElementRepository("S", MultipleDelegation_SameConnector_P_PWP_Signal_I_S);
		MultipleDelegation_SameConnector_P_PWP_Signal_I_S.setName("S");
		MultipleDelegation_SameConnector_P_PWP_Signal_I_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_I_S.setSignal(MultipleDelegation_SameConnector_P_PWP_Signal_S);
		// Reception MultipleDelegation_SameConnector_P_PWP_Signal_B::S
		addToElementRepository("S", MultipleDelegation_SameConnector_P_PWP_Signal_B_S);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_S.setName("S");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_S.setSignal(MultipleDelegation_SameConnector_P_PWP_Signal_S);
		// Reception MultipleDelegation_SameConnector_P_PWP_Signal_IImpl::S
		addToElementRepository("S", MultipleDelegation_SameConnector_P_PWP_Signal_IImpl_S);
		MultipleDelegation_SameConnector_P_PWP_Signal_IImpl_S.setName("S");
		MultipleDelegation_SameConnector_P_PWP_Signal_IImpl_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_IImpl_S.setSignal(MultipleDelegation_SameConnector_P_PWP_Signal_S);
	}

	private void initializeSendSignalAction_Instances()
	{
		// SendSignalAction MultipleDelegation_SameConnector_P_PWP_Signal_main::Send Start
		addToElementRepository("Send Start", MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start.setName("Send Start");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start.setSignal(MultipleDelegation_SameConnector_P_PWP_Signal_Start);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_main_Send_Start_target);
		// SendSignalAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Send S
		addToElementRepository("Send S", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S.setName("Send S");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S.setSignal(MultipleDelegation_SameConnector_P_PWP_Signal_S);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S.addArgument(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S.addArgument(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		// SendSignalAction MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior::Send Continue
		addToElementRepository("Send Continue", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue.setName("Send Continue");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue.setSignal(MultipleDelegation_SameConnector_P_PWP_Signal_Continue);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue.setTarget(MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target);
	}

	private void initializeSignal_Instances()
	{
		// Signal MultipleDelegation_SameConnector_P_PWP_Signal::Continue
		addToElementRepository("Continue", MultipleDelegation_SameConnector_P_PWP_Signal_Continue);
		MultipleDelegation_SameConnector_P_PWP_Signal_Continue.setName("Continue");
		MultipleDelegation_SameConnector_P_PWP_Signal_Continue.setVisibility(VisibilityKind.public_);
		// Signal MultipleDelegation_SameConnector_P_PWP_Signal::S
		addToElementRepository("S", MultipleDelegation_SameConnector_P_PWP_Signal_S);
		MultipleDelegation_SameConnector_P_PWP_Signal_S.setName("S");
		MultipleDelegation_SameConnector_P_PWP_Signal_S.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Signal_S.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Signal_S_v);
		MultipleDelegation_SameConnector_P_PWP_Signal_S.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Signal_S_t);
		// Signal MultipleDelegation_SameConnector_P_PWP_Signal::Start
		addToElementRepository("Start", MultipleDelegation_SameConnector_P_PWP_Signal_Start);
		MultipleDelegation_SameConnector_P_PWP_Signal_Start.setName("Start");
		MultipleDelegation_SameConnector_P_PWP_Signal_Start.setVisibility(VisibilityKind.public_);
	}

	private void initializeSignalEvent_Instances()
	{
		// SignalEvent MultipleDelegation_SameConnector_P_PWP_Signal::StartEvent
		addToElementRepository("StartEvent", MultipleDelegation_SameConnector_P_PWP_Signal_StartEvent);
		MultipleDelegation_SameConnector_P_PWP_Signal_StartEvent.setName("StartEvent");
		MultipleDelegation_SameConnector_P_PWP_Signal_StartEvent.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_StartEvent.setSignal(MultipleDelegation_SameConnector_P_PWP_Signal_Start);
		// SignalEvent MultipleDelegation_SameConnector_P_PWP_Signal::SEvent
		addToElementRepository("SEvent", MultipleDelegation_SameConnector_P_PWP_Signal_SEvent);
		MultipleDelegation_SameConnector_P_PWP_Signal_SEvent.setName("SEvent");
		MultipleDelegation_SameConnector_P_PWP_Signal_SEvent.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_SEvent.setSignal(MultipleDelegation_SameConnector_P_PWP_Signal_S);
		// SignalEvent MultipleDelegation_SameConnector_P_PWP_Signal::ContinueEvent
		addToElementRepository("ContinueEvent", MultipleDelegation_SameConnector_P_PWP_Signal_ContinueEvent);
		MultipleDelegation_SameConnector_P_PWP_Signal_ContinueEvent.setName("ContinueEvent");
		MultipleDelegation_SameConnector_P_PWP_Signal_ContinueEvent.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_ContinueEvent.setSignal(MultipleDelegation_SameConnector_P_PWP_Signal_Continue);
	}

	private void initializeStartObjectBehaviorAction_Instances()
	{
		// StartObjectBehaviorAction MultipleDelegation_SameConnector_P_PWP_Signal_main::Start Tester
		addToElementRepository("Start Tester", MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester.setName("Start Tester");
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester.setObject(MultipleDelegation_SameConnector_P_PWP_Signal_main_Start_Tester_object);
	}

	private void initializeTrigger_Instances()
	{
		// Trigger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_4::Trigger143
		addToElementRepository("Trigger143", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger143);
		// Trigger Trigger143
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger143.setName("Trigger143");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger143.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger143.setEvent(MultipleDelegation_SameConnector_P_PWP_Signal_ContinueEvent);
		// Trigger MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept S::Trigger31
		addToElementRepository("Trigger31", MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_Trigger31);
		// Trigger Trigger31
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_Trigger31.setName("Trigger31");
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_Trigger31.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_Trigger31.setEvent(MultipleDelegation_SameConnector_P_PWP_Signal_SEvent);
		// Trigger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_1::Trigger134
		addToElementRepository("Trigger134", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger134);
		// Trigger Trigger134
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger134.setName("Trigger134");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger134.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger134.setEvent(MultipleDelegation_SameConnector_P_PWP_Signal_ContinueEvent);
		// Trigger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_2::Trigger150
		addToElementRepository("Trigger150", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger150);
		// Trigger Trigger150
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger150.setName("Trigger150");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger150.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger150.setEvent(MultipleDelegation_SameConnector_P_PWP_Signal_ContinueEvent);
		// Trigger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Start::Trigger133
		addToElementRepository("Trigger133", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger133);
		// Trigger Trigger133
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger133.setName("Trigger133");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger133.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger133.setEvent(MultipleDelegation_SameConnector_P_PWP_Signal_StartEvent);
		// Trigger MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_3::Trigger194
		addToElementRepository("Trigger194", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger194);
		// Trigger Trigger194
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger194.setName("Trigger194");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger194.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger194.setEvent(MultipleDelegation_SameConnector_P_PWP_Signal_ContinueEvent);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Value(4)
		addToElementRepository("Value(4)", MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4.setName("Value(4)");
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4.setValue(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger163);
		MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4.setResult(MultipleDelegation_SameConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // MultipleDelegation_SameConnector_P_PWP_SignalModel
