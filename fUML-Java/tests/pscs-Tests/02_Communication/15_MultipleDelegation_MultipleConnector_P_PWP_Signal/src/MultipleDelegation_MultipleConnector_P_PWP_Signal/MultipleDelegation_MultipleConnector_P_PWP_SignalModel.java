/*
 * MultipleDelegation_MultipleConnector_P_PWP_SignalModel.java
 * 
 * Auto-generated file
 */
package MultipleDelegation_MultipleConnector_P_PWP_Signal;

import uml.commonbehavior.SignalEvent;
import uml.structuredclassifiers.ConnectorEnd;
import uml.actions.ReadSelfAction;
import uml.values.LiteralBoolean;
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

public class MultipleDelegation_MultipleConnector_P_PWP_SignalModel extends InMemoryModel
{
	private static MultipleDelegation_MultipleConnector_P_PWP_SignalModel instance;

	/*
	 * Model MultipleDelegation_MultipleConnector_P_PWP_Signal
	 */
	public Package MultipleDelegation_MultipleConnector_P_PWP_Signal = new Package();
		public Interface MultipleDelegation_MultipleConnector_P_PWP_Signal_I = new Interface();
			public Reception MultipleDelegation_MultipleConnector_P_PWP_Signal_I_S = new Reception();
		public Class_ MultipleDelegation_MultipleConnector_P_PWP_Signal_A = new Class_();
			public Port MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q = new Port();
			public Operation MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A_result = new Parameter();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b_LiteralInteger0 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b_LiteralUnlimitedNatural1 = new LiteralUnlimitedNatural();
			public Connector MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd2 = new ConnectorEnd();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd2_LiteralUnlimitedNatural3 = new LiteralUnlimitedNatural();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4 = new ConnectorEnd();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralInteger5 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralUnlimitedNatural6 = new LiteralUnlimitedNatural();
		public SignalEvent MultipleDelegation_MultipleConnector_P_PWP_Signal_ContinueEvent = new SignalEvent();
		public SignalEvent MultipleDelegation_MultipleConnector_P_PWP_Signal_SEvent = new SignalEvent();
		public Class_ MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl = new Class_();
			public InterfaceRealization MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl_IRealization = new InterfaceRealization();
			public Reception MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl_S = new Reception();
		public SignalEvent MultipleDelegation_MultipleConnector_P_PWP_Signal_StartEvent = new SignalEvent();
		public Class_ MultipleDelegation_MultipleConnector_P_PWP_Signal_B = new Class_();
			public Operation MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B_result = new Parameter();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_B_p = new Property();
			public Activity MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior = new Activity();
				public AcceptEventAction MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S = new AcceptEventAction();
					public Trigger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_Trigger7 = new Trigger();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural8 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger9 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger10 = new LiteralInteger();
				public ForkNode MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s = new ForkNode();
				public AddStructuralFeatureValueAction MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger11 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural12 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural13 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger14 = new LiteralInteger();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural15 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger16 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralBoolean18 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralInteger19 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralBoolean21 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralInteger22 = new LiteralInteger();
				public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow23 = new ControlFlow();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24_LiteralBoolean25 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24_LiteralInteger26 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27_LiteralInteger28 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27_LiteralBoolean29 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30_LiteralBoolean31 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30_LiteralInteger32 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger33 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural34 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger35 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural36 = new LiteralUnlimitedNatural();
				public ReadSelfAction MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralInteger37 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural38 = new LiteralUnlimitedNatural();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39_LiteralInteger40 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39_LiteralBoolean41 = new LiteralBoolean();
				public SendSignalAction MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue = new SendSignalAction();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural42 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger43 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural44 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger45 = new LiteralInteger();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger46 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural47 = new LiteralUnlimitedNatural();
			public Reception MultipleDelegation_MultipleConnector_P_PWP_Signal_B_S = new Reception();
			public InterfaceRealization MultipleDelegation_MultipleConnector_P_PWP_Signal_B_IRealization = new InterfaceRealization();
		public Comment MultipleDelegation_MultipleConnector_P_PWP_Signal_Comment48 = new Comment();
		public PackageImport MultipleDelegation_MultipleConnector_P_PWP_Signal_PackageImport49 = new PackageImport();
		public Comment MultipleDelegation_MultipleConnector_P_PWP_Signal_Comment50 = new Comment();
		public Signal MultipleDelegation_MultipleConnector_P_PWP_Signal_S = new Signal();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_S_t = new Property();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_S_v = new Property();
		public Signal MultipleDelegation_MultipleConnector_P_PWP_Signal_Continue = new Signal();
		public Association MultipleDelegation_MultipleConnector_P_PWP_Signal_R = new Association();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x_LiteralInteger51 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x_LiteralUnlimitedNatural52 = new LiteralUnlimitedNatural();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y_LiteralInteger53 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y_LiteralUnlimitedNatural54 = new LiteralUnlimitedNatural();
		public Signal MultipleDelegation_MultipleConnector_P_PWP_Signal_Start = new Signal();
		public Class_ MultipleDelegation_MultipleConnector_P_PWP_Signal_C = new Class_();
			public Connector MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd55 = new ConnectorEnd();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd55_LiteralUnlimitedNatural56 = new LiteralUnlimitedNatural();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57 = new ConnectorEnd();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57_LiteralUnlimitedNatural58 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57_LiteralInteger59 = new LiteralInteger();
			public Connector MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2_ConnectorEnd60 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2_ConnectorEnd61 = new ConnectorEnd();
			public Connector MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4_ConnectorEnd62 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4_ConnectorEnd63 = new ConnectorEnd();
			public Port MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p = new Port();
			public Connector MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3_ConnectorEnd64 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3_ConnectorEnd65 = new ConnectorEnd();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4 = new Property();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4_LiteralUnlimitedNatural66 = new LiteralUnlimitedNatural();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4_LiteralInteger67 = new LiteralInteger();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1 = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1_LiteralInteger68 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1_LiteralUnlimitedNatural69 = new LiteralUnlimitedNatural();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2 = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2_LiteralInteger70 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2_LiteralUnlimitedNatural71 = new LiteralUnlimitedNatural();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3 = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3_LiteralInteger72 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3_LiteralUnlimitedNatural73 = new LiteralUnlimitedNatural();
		public Association MultipleDelegation_MultipleConnector_P_PWP_Signal_U = new Association();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x = new Property();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x_LiteralUnlimitedNatural74 = new LiteralUnlimitedNatural();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x_LiteralInteger75 = new LiteralInteger();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y_LiteralInteger76 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y_LiteralUnlimitedNatural77 = new LiteralUnlimitedNatural();
		public Activity MultipleDelegation_MultipleConnector_P_PWP_Signal_main = new Activity();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78_LiteralInteger79 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78_LiteralBoolean80 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81_LiteralInteger82 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81_LiteralBoolean83 = new LiteralBoolean();
			public CreateObjectAction MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester = new CreateObjectAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result = new OutputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result_LiteralUnlimitedNatural84 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result_LiteralInteger85 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86_LiteralInteger87 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86_LiteralBoolean88 = new LiteralBoolean();
			public SendSignalAction MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start = new SendSignalAction();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target_LiteralInteger89 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target_LiteralUnlimitedNatural90 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91_LiteralInteger92 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91_LiteralBoolean93 = new LiteralBoolean();
			public CallOperationAction MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester_ = new CallOperationAction();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target_LiteralUnlimitedNatural94 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target_LiteralInteger95 = new LiteralInteger();
				public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralInteger96 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralUnlimitedNatural97 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralInteger98 = new LiteralInteger();
			public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ControlFlow99 = new ControlFlow();
			public StartObjectBehaviorAction MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester = new StartObjectBehaviorAction();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object_LiteralInteger100 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object_LiteralUnlimitedNatural101 = new LiteralUnlimitedNatural();
			public ForkNode MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Fork_Tester = new ForkNode();
		public Class_ MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester = new Class_();
			public Operation MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_test = new Operation();
			public Reception MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_Continue = new Reception();
			public Reception MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_Start = new Reception();
		public Class_ MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester = new Class_();
			public Activity MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior = new Activity();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102_LiteralBoolean103 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102_LiteralInteger104 = new LiteralInteger();
				public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow105 = new ControlFlow();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106_LiteralInteger107 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106_LiteralBoolean108 = new LiteralBoolean();
				public CallOperationAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_ = new CallOperationAction();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger109 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural110 = new LiteralUnlimitedNatural();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralInteger112 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralBoolean113 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralBoolean115 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralInteger116 = new LiteralInteger();
				public AcceptEventAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1 = new AcceptEventAction();
					public Trigger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger117 = new Trigger();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural118 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger119 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger120 = new LiteralInteger();
				public AcceptEventAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4 = new AcceptEventAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger121 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural122 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger123 = new LiteralInteger();
					public Trigger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger124 = new Trigger();
				public AcceptEventAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3 = new AcceptEventAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger125 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural126 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger127 = new LiteralInteger();
					public Trigger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger128 = new Trigger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129_LiteralBoolean130 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129_LiteralInteger131 = new LiteralInteger();
				public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow132 = new ControlFlow();
				public ReadSelfAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural133 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger134 = new LiteralInteger();
				public ForkNode MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this = new ForkNode();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135_LiteralInteger136 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135_LiteralBoolean137 = new LiteralBoolean();
				public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138 = new ControlFlow();
				public AcceptEventAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start = new AcceptEventAction();
					public Trigger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger139 = new Trigger();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger140 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger141 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural142 = new LiteralUnlimitedNatural();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralUnlimitedNatural143 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralInteger144 = new LiteralInteger();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralUnlimitedNatural145 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralInteger146 = new LiteralInteger();
				public AcceptEventAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2 = new AcceptEventAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural147 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger148 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger149 = new LiteralInteger();
					public Trigger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger150 = new Trigger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151_LiteralInteger152 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151_LiteralBoolean153 = new LiteralBoolean();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralUnlimitedNatural154 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralInteger155 = new LiteralInteger();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralUnlimitedNatural156 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralInteger157 = new LiteralInteger();
				public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow158 = new ControlFlow();
				public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow159 = new ControlFlow();
				public ValueSpecificationAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4 = new ValueSpecificationAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger160 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural161 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger162 = new LiteralInteger();
				public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow163 = new ControlFlow();
				public SendSignalAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S = new SendSignalAction();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger164 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural165 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger166 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural167 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger168 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural169 = new LiteralUnlimitedNatural();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_c = new Property();
			public Operation MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_test = new Operation();
			public Activity MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity = new Activity();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2 = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object_LiteralInteger170 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object_LiteralUnlimitedNatural171 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result_LiteralInteger172 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result_LiteralUnlimitedNatural173 = new LiteralUnlimitedNatural();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174_LiteralInteger175 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174_LiteralBoolean176 = new LiteralBoolean();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural177 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger178 = new LiteralInteger();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger179 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural180 = new LiteralUnlimitedNatural();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181_LiteralBoolean182 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181_LiteralInteger183 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184_LiteralInteger185 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184_LiteralBoolean186 = new LiteralBoolean();
				public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow187 = new ControlFlow();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4 = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result_LiteralUnlimitedNatural188 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result_LiteralInteger189 = new LiteralInteger();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object_LiteralInteger190 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object_LiteralUnlimitedNatural191 = new LiteralUnlimitedNatural();
				public OpaqueBehavior MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP = new OpaqueBehavior();
					public Parameter MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP_p = new Parameter();
				public ForkNode MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Fork_c = new ForkNode();
				public CallBehaviorAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP = new CallBehaviorAction();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger192 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural193 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger194 = new LiteralInteger();
				public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow195 = new ControlFlow();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196_LiteralInteger197 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196_LiteralBoolean198 = new LiteralBoolean();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralUnlimitedNatural199 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralInteger200 = new LiteralInteger();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralUnlimitedNatural201 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralInteger202 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203_LiteralInteger204 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203_LiteralBoolean205 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206_LiteralBoolean207 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206_LiteralInteger208 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209_LiteralInteger210 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209_LiteralBoolean211 = new LiteralBoolean();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger212 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural213 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural214 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger215 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216_LiteralBoolean217 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216_LiteralInteger218 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219_LiteralInteger220 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219_LiteralBoolean221 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222_LiteralInteger223 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222_LiteralBoolean224 = new LiteralBoolean();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3 = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result_LiteralUnlimitedNatural225 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result_LiteralInteger226 = new LiteralInteger();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object_LiteralUnlimitedNatural227 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object_LiteralInteger228 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229_LiteralBoolean230 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229_LiteralInteger231 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232_LiteralInteger233 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232_LiteralBoolean234 = new LiteralBoolean();
				public ReadSelfAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural235 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralInteger236 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1 = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object_LiteralInteger237 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object_LiteralUnlimitedNatural238 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_result = new OutputPin();
				public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow239 = new ControlFlow();
			public Operation MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester_result = new Parameter();
			public Generalization MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Generalization240 = new Generalization();

	public static MultipleDelegation_MultipleConnector_P_PWP_SignalModel instance()
	{
		if (instance == null)
        {
            instance = new MultipleDelegation_MultipleConnector_P_PWP_SignalModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public MultipleDelegation_MultipleConnector_P_PWP_SignalModel()
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
		// AcceptEventAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Accept Start
		addToElementRepository("Accept Start", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start.setName("Accept Start");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start.addResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start.addTrigger(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger139);
		// AcceptEventAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Accept Continue_2
		addToElementRepository("Accept Continue_2", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.setName("Accept Continue_2");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.addResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.addTrigger(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger150);
		// AcceptEventAction MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::Accept S
		addToElementRepository("Accept S", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S.setName("Accept S");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S.addResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S.addTrigger(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_Trigger7);
		// AcceptEventAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Accept Continue_1
		addToElementRepository("Accept Continue_1", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.setName("Accept Continue_1");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.addResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.addTrigger(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger117);
		// AcceptEventAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Accept Continue_4
		addToElementRepository("Accept Continue_4", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.setName("Accept Continue_4");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.addResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.addTrigger(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger124);
		// AcceptEventAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Accept Continue_3
		addToElementRepository("Accept Continue_3", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.setName("Accept Continue_3");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.addResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.addTrigger(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger128);
	}

	private void initializeActivity_Instances()
	{
		// Activity MultipleDelegation_MultipleConnector_P_PWP_Signal_B::BClassifierBehavior
		addToElementRepository("BClassifierBehavior", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.setName("BClassifierBehavior");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow23);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24);
		// Activity MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester::TesterClassifierBehavior
		addToElementRepository("TesterClassifierBehavior", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.setName("TesterClassifierBehavior");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow105);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow158);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow159);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow163);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow132);
		// Activity MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester::testActivity
		addToElementRepository("testActivity", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.setName("testActivity");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addOwnedBehavior(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Fork_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow187);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow195);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow239);
		// Activity MultipleDelegation_MultipleConnector_P_PWP_Signal::main
		addToElementRepository("main", MultipleDelegation_MultipleConnector_P_PWP_Signal_main);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main.setName("main");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Fork_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ControlFlow99);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::Set this.p
		addToElementRepository("Set this.p", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p.setName("Set this.p");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p.setValue(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association MultipleDelegation_MultipleConnector_P_PWP_Signal::R
		addToElementRepository("R", MultipleDelegation_MultipleConnector_P_PWP_Signal_R);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R.setName("R");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R.addOwnedEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R.addOwnedEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y);
		// Association MultipleDelegation_MultipleConnector_P_PWP_Signal::U
		addToElementRepository("U", MultipleDelegation_MultipleConnector_P_PWP_Signal_U);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U.setName("U");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U.addOwnedEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U.addOwnedEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::Call testP
		addToElementRepository("Call testP", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP.setName("Call testP");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP.setBehavior(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP.addArgument(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Call test()
		addToElementRepository("Call test()", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_.setName("Call test()");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_.setOperation(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_test);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		// CallOperationAction MultipleDelegation_MultipleConnector_P_PWP_Signal_main::Tester()
		addToElementRepository("Tester()", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester_.setName("Tester()");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester_.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester_.addResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester_.setOperation(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester_.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target);
	}

	private void initializeClass_Instances()
	{
		// Class MultipleDelegation_MultipleConnector_P_PWP_Signal::A
		addToElementRepository("A", MultipleDelegation_MultipleConnector_P_PWP_Signal_A);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A.setName("A");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A.addOwnedConnector(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A.addOwnedOperation(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A);
		// Class MultipleDelegation_MultipleConnector_P_PWP_Signal::C
		addToElementRepository("C", MultipleDelegation_MultipleConnector_P_PWP_Signal_C);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C.setName("C");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C.addOwnedConnector(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C.addOwnedConnector(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C.addOwnedConnector(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C.addOwnedConnector(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3);
		// Class MultipleDelegation_MultipleConnector_P_PWP_Signal::IImpl
		addToElementRepository("IImpl", MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl.setName("IImpl");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl.addInterfaceRealization(MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl_IRealization);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl.addOwnedReception(MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl_S);
		// Class MultipleDelegation_MultipleConnector_P_PWP_Signal::AbstractTester
		addToElementRepository("AbstractTester", MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester.setName("AbstractTester");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester.setIsAbstract(true);
		
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester.setIsActive(true);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester.addOwnedOperation(MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_test);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester.addOwnedReception(MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_Continue);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester.addOwnedReception(MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_Start);
		// Class MultipleDelegation_MultipleConnector_P_PWP_Signal::Tester
		addToElementRepository("Tester", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester.setName("Tester");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester.addGeneralization(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Generalization240);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester.setClassifierBehavior(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester.addOwnedBehavior(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester.addOwnedBehavior(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester.setIsActive(true);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester.addOwnedOperation(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester.addOwnedOperation(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_test);
		// Class MultipleDelegation_MultipleConnector_P_PWP_Signal::B
		addToElementRepository("B", MultipleDelegation_MultipleConnector_P_PWP_Signal_B);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B.setName("B");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B.setClassifierBehavior(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B.addOwnedBehavior(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B.addInterfaceRealization(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_IRealization);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B.setIsActive(true);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B.addOwnedOperation(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B.addOwnedReception(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_S);
	}

	private void initializeComment_Instances()
	{
		// Comment MultipleDelegation_MultipleConnector_P_PWP_Signal::Comment48
		addToElementRepository("Comment48", MultipleDelegation_MultipleConnector_P_PWP_Signal_Comment48);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment MultipleDelegation_MultipleConnector_P_PWP_Signal::Comment50
		addToElementRepository("Comment50", MultipleDelegation_MultipleConnector_P_PWP_Signal_Comment50);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector MultipleDelegation_MultipleConnector_P_PWP_Signal_C::u1
		addToElementRepository("u1", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1.setName("u1");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd55);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_U);
		// Connector MultipleDelegation_MultipleConnector_P_PWP_Signal_C::u4
		addToElementRepository("u4", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4.setName("u4");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4_ConnectorEnd62);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4_ConnectorEnd63);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_U);
		// Connector MultipleDelegation_MultipleConnector_P_PWP_Signal_C::u2
		addToElementRepository("u2", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2.setName("u2");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2_ConnectorEnd61);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2_ConnectorEnd60);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_U);
		// Connector MultipleDelegation_MultipleConnector_P_PWP_Signal_A::r
		addToElementRepository("r", MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r.setName("r");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_R);
		// Connector MultipleDelegation_MultipleConnector_P_PWP_Signal_C::u3
		addToElementRepository("u3", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3.setName("u3");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3_ConnectorEnd64);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3_ConnectorEnd65);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_U);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2::ConnectorEnd60
		addToElementRepository("ConnectorEnd60", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2_ConnectorEnd60);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2_ConnectorEnd60.setRole(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2_ConnectorEnd60.setPartWithPort(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4::ConnectorEnd62
		addToElementRepository("ConnectorEnd62", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4_ConnectorEnd62);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4_ConnectorEnd62.setRole(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3::ConnectorEnd64
		addToElementRepository("ConnectorEnd64", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3_ConnectorEnd64);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3_ConnectorEnd64.setRole(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r::ConnectorEnd2
		addToElementRepository("ConnectorEnd2", MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd2.setRole(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3::ConnectorEnd65
		addToElementRepository("ConnectorEnd65", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3_ConnectorEnd65);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3_ConnectorEnd65.setRole(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u3_ConnectorEnd65.setPartWithPort(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4::ConnectorEnd63
		addToElementRepository("ConnectorEnd63", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4_ConnectorEnd63);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4_ConnectorEnd63.setRole(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u4_ConnectorEnd63.setPartWithPort(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2::ConnectorEnd61
		addToElementRepository("ConnectorEnd61", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2_ConnectorEnd61);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u2_ConnectorEnd61.setRole(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1::ConnectorEnd55
		addToElementRepository("ConnectorEnd55", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd55);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd55.setRole(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1::ConnectorEnd57
		addToElementRepository("ConnectorEnd57", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57.setRole(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57.setPartWithPort(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r::ConnectorEnd4
		addToElementRepository("ConnectorEnd4", MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4.setRole(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ControlFlow195
		addToElementRepository("ControlFlow195", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow195);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow195.setName("ControlFlow195");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow195.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow195.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow195.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ControlFlow158
		addToElementRepository("ControlFlow158", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow158);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow158.setName("ControlFlow158");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow158.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow158.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow158.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ControlFlow159
		addToElementRepository("ControlFlow159", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow159);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow159.setName("ControlFlow159");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow159.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow159.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow159.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ControlFlow105
		addToElementRepository("ControlFlow105", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow105);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow105.setName("ControlFlow105");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow105.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow105.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow105.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test_);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ControlFlow187
		addToElementRepository("ControlFlow187", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow187);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow187.setName("ControlFlow187");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow187.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow187.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow187.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ControlFlow163
		addToElementRepository("ControlFlow163", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow163);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow163.setName("ControlFlow163");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow163.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow163.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow163.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::ControlFlow23
		addToElementRepository("ControlFlow23", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow23);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow23.setName("ControlFlow23");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow23.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow23.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ControlFlow23.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_main::ControlFlow99
		addToElementRepository("ControlFlow99", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ControlFlow99);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ControlFlow99.setName("ControlFlow99");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ControlFlow99.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ControlFlow99.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ControlFlow99.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ControlFlow138
		addToElementRepository("ControlFlow138", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138.setName("ControlFlow138");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow138.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ControlFlow132
		addToElementRepository("ControlFlow132", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow132);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow132.setName("ControlFlow132");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow132.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow132.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ControlFlow132.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ControlFlow239
		addToElementRepository("ControlFlow239", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow239);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow239.setName("ControlFlow239");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow239.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow239.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ControlFlow239.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction MultipleDelegation_MultipleConnector_P_PWP_Signal_main::Create Tester
		addToElementRepository("Create Tester", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester.setName("Create Tester");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester.setClassifier(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::Fork c
		addToElementRepository("Fork c", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Fork_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Fork_c.setName("Fork c");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Fork_c.setVisibility(VisibilityKind.public_);
		// ForkNode MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Fork this
		addToElementRepository("Fork this", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this.setName("Fork this");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this.setVisibility(VisibilityKind.public_);
		// ForkNode MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::Fork s
		addToElementRepository("Fork s", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s.setName("Fork s");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s.setVisibility(VisibilityKind.public_);
		// ForkNode MultipleDelegation_MultipleConnector_P_PWP_Signal_main::Fork Tester
		addToElementRepository("Fork Tester", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Fork_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Fork_Tester.setName("Fork Tester");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Fork_Tester.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::testP
		addToElementRepository("testP", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP.setName("testP");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP.addOwnedParameter(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP.addLanguage("Java");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP.addLanguage("Import");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP.addBody("if(index == 1) 	{ 		System.out.println(\"Asserting c.a1.b.p == 4 && c.a2.b.p == 4 && c.a3.b.p == 4 && c.a4.b.p == 4\"); 	}  	// Test parameter p 	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument p = \" + p); 	 	System.out.println( \"c.a\" + index + \".b.p == \" + p); 	success = success && (p == 4); 	if(index == MAX_INDEX) 	{  		System.out.print(\"Signal delegated on all links (shall be true for default strategy): \");  		if(success) 		{ 			System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 		} 		else 		{ 			System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 		} 	}  	index++;");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeGeneralization_Instances()
	{
		// Generalization MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester::Generalization240
		addToElementRepository("Generalization240", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Generalization240);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Generalization240.setGeneral(MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read this.c::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call test()::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target.setName("target");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send Continue::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target.setName("target");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a2::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_C);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v.setName("v");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read b.p::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_B);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester()::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target.setName("target");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a4::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_C);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a1::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_C);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target.setName("target");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read a.b::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_A);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start Tester::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object.setVisibility(VisibilityKind.public_);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.t::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object.setVisibility(VisibilityKind.public_);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read c.p::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_C);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.v::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object.setVisibility(VisibilityKind.public_);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a3::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_C);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p::value
		addToElementRepository("value", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value.setName("value");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call testP::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p.setName("p");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send Start::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target.setName("target");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_B);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S::t
		addToElementRepository("t", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t.setName("t");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read this.c::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester);
	}

	private void initializeInterface_Instances()
	{
		// Interface MultipleDelegation_MultipleConnector_P_PWP_Signal::I
		addToElementRepository("I", MultipleDelegation_MultipleConnector_P_PWP_Signal_I);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_I.setName("I");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_I.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_I.addOwnedReception(MultipleDelegation_MultipleConnector_P_PWP_Signal_I_S);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl::IRealization
		addToElementRepository("IRealization", MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl_IRealization);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl_IRealization.setName("IRealization");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl_IRealization.setContract(MultipleDelegation_MultipleConnector_P_PWP_Signal_I);
		// InterfaceRealization MultipleDelegation_MultipleConnector_P_PWP_Signal_B::IRealization
		addToElementRepository("IRealization", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_IRealization);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_IRealization.setName("IRealization");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_IRealization.setContract(MultipleDelegation_MultipleConnector_P_PWP_Signal_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135::LiteralBoolean137
		addToElementRepository("LiteralBoolean137", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135_LiteralBoolean137);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135_LiteralBoolean137.setName("LiteralBoolean137");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135_LiteralBoolean137.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135_LiteralBoolean137.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81::LiteralBoolean83
		addToElementRepository("LiteralBoolean83", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81_LiteralBoolean83);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81_LiteralBoolean83.setName("LiteralBoolean83");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81_LiteralBoolean83.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81_LiteralBoolean83.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196::LiteralBoolean198
		addToElementRepository("LiteralBoolean198", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196_LiteralBoolean198);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196_LiteralBoolean198.setName("LiteralBoolean198");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196_LiteralBoolean198.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196_LiteralBoolean198.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219::LiteralBoolean221
		addToElementRepository("LiteralBoolean221", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219_LiteralBoolean221);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219_LiteralBoolean221.setName("LiteralBoolean221");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219_LiteralBoolean221.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219_LiteralBoolean221.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27::LiteralBoolean29
		addToElementRepository("LiteralBoolean29", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27_LiteralBoolean29);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27_LiteralBoolean29.setName("LiteralBoolean29");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27_LiteralBoolean29.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27_LiteralBoolean29.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91::LiteralBoolean93
		addToElementRepository("LiteralBoolean93", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91_LiteralBoolean93);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91_LiteralBoolean93.setName("LiteralBoolean93");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91_LiteralBoolean93.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91_LiteralBoolean93.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30::LiteralBoolean31
		addToElementRepository("LiteralBoolean31", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30_LiteralBoolean31);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30_LiteralBoolean31.setName("LiteralBoolean31");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30_LiteralBoolean31.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30_LiteralBoolean31.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203::LiteralBoolean205
		addToElementRepository("LiteralBoolean205", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203_LiteralBoolean205);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203_LiteralBoolean205.setName("LiteralBoolean205");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203_LiteralBoolean205.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203_LiteralBoolean205.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20::LiteralBoolean21
		addToElementRepository("LiteralBoolean21", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralBoolean21);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralBoolean21.setName("LiteralBoolean21");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralBoolean21.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralBoolean21.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114::LiteralBoolean115
		addToElementRepository("LiteralBoolean115", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralBoolean115);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralBoolean115.setName("LiteralBoolean115");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralBoolean115.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralBoolean115.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39::LiteralBoolean41
		addToElementRepository("LiteralBoolean41", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39_LiteralBoolean41);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39_LiteralBoolean41.setName("LiteralBoolean41");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39_LiteralBoolean41.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39_LiteralBoolean41.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209::LiteralBoolean211
		addToElementRepository("LiteralBoolean211", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209_LiteralBoolean211);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209_LiteralBoolean211.setName("LiteralBoolean211");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209_LiteralBoolean211.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209_LiteralBoolean211.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184::LiteralBoolean186
		addToElementRepository("LiteralBoolean186", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184_LiteralBoolean186);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184_LiteralBoolean186.setName("LiteralBoolean186");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184_LiteralBoolean186.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184_LiteralBoolean186.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222::LiteralBoolean224
		addToElementRepository("LiteralBoolean224", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222_LiteralBoolean224);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222_LiteralBoolean224.setName("LiteralBoolean224");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222_LiteralBoolean224.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222_LiteralBoolean224.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216::LiteralBoolean217
		addToElementRepository("LiteralBoolean217", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216_LiteralBoolean217);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216_LiteralBoolean217.setName("LiteralBoolean217");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216_LiteralBoolean217.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216_LiteralBoolean217.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111::LiteralBoolean113
		addToElementRepository("LiteralBoolean113", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralBoolean113);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralBoolean113.setName("LiteralBoolean113");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralBoolean113.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralBoolean113.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24::LiteralBoolean25
		addToElementRepository("LiteralBoolean25", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24_LiteralBoolean25);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24_LiteralBoolean25.setName("LiteralBoolean25");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24_LiteralBoolean25.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24_LiteralBoolean25.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174::LiteralBoolean176
		addToElementRepository("LiteralBoolean176", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174_LiteralBoolean176);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174_LiteralBoolean176.setName("LiteralBoolean176");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174_LiteralBoolean176.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174_LiteralBoolean176.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129::LiteralBoolean130
		addToElementRepository("LiteralBoolean130", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129_LiteralBoolean130);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129_LiteralBoolean130.setName("LiteralBoolean130");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129_LiteralBoolean130.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129_LiteralBoolean130.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78::LiteralBoolean80
		addToElementRepository("LiteralBoolean80", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78_LiteralBoolean80);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78_LiteralBoolean80.setName("LiteralBoolean80");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78_LiteralBoolean80.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78_LiteralBoolean80.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181::LiteralBoolean182
		addToElementRepository("LiteralBoolean182", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181_LiteralBoolean182);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181_LiteralBoolean182.setName("LiteralBoolean182");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181_LiteralBoolean182.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181_LiteralBoolean182.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229::LiteralBoolean230
		addToElementRepository("LiteralBoolean230", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229_LiteralBoolean230);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229_LiteralBoolean230.setName("LiteralBoolean230");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229_LiteralBoolean230.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229_LiteralBoolean230.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17::LiteralBoolean18
		addToElementRepository("LiteralBoolean18", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralBoolean18);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralBoolean18.setName("LiteralBoolean18");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralBoolean18.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralBoolean18.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86::LiteralBoolean88
		addToElementRepository("LiteralBoolean88", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86_LiteralBoolean88);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86_LiteralBoolean88.setName("LiteralBoolean88");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86_LiteralBoolean88.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86_LiteralBoolean88.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106::LiteralBoolean108
		addToElementRepository("LiteralBoolean108", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106_LiteralBoolean108);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106_LiteralBoolean108.setName("LiteralBoolean108");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106_LiteralBoolean108.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106_LiteralBoolean108.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206::LiteralBoolean207
		addToElementRepository("LiteralBoolean207", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206_LiteralBoolean207);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206_LiteralBoolean207.setName("LiteralBoolean207");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206_LiteralBoolean207.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206_LiteralBoolean207.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232::LiteralBoolean234
		addToElementRepository("LiteralBoolean234", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232_LiteralBoolean234);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232_LiteralBoolean234.setName("LiteralBoolean234");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232_LiteralBoolean234.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232_LiteralBoolean234.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151::LiteralBoolean153
		addToElementRepository("LiteralBoolean153", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151_LiteralBoolean153);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151_LiteralBoolean153.setName("LiteralBoolean153");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151_LiteralBoolean153.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151_LiteralBoolean153.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102::LiteralBoolean103
		addToElementRepository("LiteralBoolean103", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102_LiteralBoolean103);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102_LiteralBoolean103.setName("LiteralBoolean103");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102_LiteralBoolean103.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102_LiteralBoolean103.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_3_result::LiteralInteger125
		addToElementRepository("LiteralInteger125", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger125);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger125.setName("LiteralInteger125");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger125.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger125.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read b.p_result::LiteralInteger179
		addToElementRepository("LiteralInteger179", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger179);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger179.setName("LiteralInteger179");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger179.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger179.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174::LiteralInteger175
		addToElementRepository("LiteralInteger175", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174_LiteralInteger175);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174_LiteralInteger175.setName("LiteralInteger175");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174_LiteralInteger175.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174_LiteralInteger175.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y::LiteralInteger53
		addToElementRepository("LiteralInteger53", MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y_LiteralInteger53);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y_LiteralInteger53.setName("LiteralInteger53");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y_LiteralInteger53.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y_LiteralInteger53.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_2_result::LiteralInteger148
		addToElementRepository("LiteralInteger148", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger148);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger148.setName("LiteralInteger148");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger148.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger148.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216::LiteralInteger218
		addToElementRepository("LiteralInteger218", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216_LiteralInteger218);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216_LiteralInteger218.setName("LiteralInteger218");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216_LiteralInteger218.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216_LiteralInteger218.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86::LiteralInteger87
		addToElementRepository("LiteralInteger87", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86_LiteralInteger87);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86_LiteralInteger87.setName("LiteralInteger87");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86_LiteralInteger87.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86_LiteralInteger87.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27::LiteralInteger28
		addToElementRepository("LiteralInteger28", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27_LiteralInteger28);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27_LiteralInteger28.setName("LiteralInteger28");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27_LiteralInteger28.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27_LiteralInteger28.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read this.c_result::LiteralInteger146
		addToElementRepository("LiteralInteger146", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralInteger146);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralInteger146.setName("LiteralInteger146");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralInteger146.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralInteger146.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181::LiteralInteger183
		addToElementRepository("LiteralInteger183", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181_LiteralInteger183);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181_LiteralInteger183.setName("LiteralInteger183");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181_LiteralInteger183.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181_LiteralInteger183.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_2_result::LiteralInteger149
		addToElementRepository("LiteralInteger149", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger149);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger149.setName("LiteralInteger149");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger149.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger149.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2::LiteralInteger70
		addToElementRepository("LiteralInteger70", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2_LiteralInteger70);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2_LiteralInteger70.setName("LiteralInteger70");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2_LiteralInteger70.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2_LiteralInteger70.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106::LiteralInteger107
		addToElementRepository("LiteralInteger107", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106_LiteralInteger107);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106_LiteralInteger107.setName("LiteralInteger107");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106_LiteralInteger107.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106_LiteralInteger107.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a2_result::LiteralInteger172
		addToElementRepository("LiteralInteger172", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result_LiteralInteger172);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result_LiteralInteger172.setName("LiteralInteger172");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result_LiteralInteger172.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result_LiteralInteger172.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value(4)_result::LiteralInteger160
		addToElementRepository("LiteralInteger160", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger160);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger160.setName("LiteralInteger160");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger160.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger160.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.v_result::LiteralInteger33
		addToElementRepository("LiteralInteger33", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger33);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger33.setName("LiteralInteger33");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger33.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger33.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135::LiteralInteger136
		addToElementRepository("LiteralInteger136", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135_LiteralInteger136);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135_LiteralInteger136.setName("LiteralInteger136");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135_LiteralInteger136.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135_LiteralInteger136.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read a.b_result::LiteralInteger212
		addToElementRepository("LiteralInteger212", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger212);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger212.setName("LiteralInteger212");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger212.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger212.setValue(4);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39::LiteralInteger40
		addToElementRepository("LiteralInteger40", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39_LiteralInteger40);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39_LiteralInteger40.setName("LiteralInteger40");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39_LiteralInteger40.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39_LiteralInteger40.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229::LiteralInteger231
		addToElementRepository("LiteralInteger231", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229_LiteralInteger231);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229_LiteralInteger231.setName("LiteralInteger231");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229_LiteralInteger231.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229_LiteralInteger231.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralInteger141
		addToElementRepository("LiteralInteger141", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger141);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger141.setName("LiteralInteger141");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger141.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger141.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read this.c_object::LiteralInteger144
		addToElementRepository("LiteralInteger144", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralInteger144);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralInteger144.setName("LiteralInteger144");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralInteger144.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralInteger144.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30::LiteralInteger32
		addToElementRepository("LiteralInteger32", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30_LiteralInteger32);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30_LiteralInteger32.setName("LiteralInteger32");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30_LiteralInteger32.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30_LiteralInteger32.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send Continue_target::LiteralInteger43
		addToElementRepository("LiteralInteger43", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger43);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger43.setName("LiteralInteger43");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger43.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger43.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129::LiteralInteger131
		addToElementRepository("LiteralInteger131", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129_LiteralInteger131);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129_LiteralInteger131.setName("LiteralInteger131");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129_LiteralInteger131.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129_LiteralInteger131.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call testP_p::LiteralInteger194
		addToElementRepository("LiteralInteger194", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger194);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger194.setName("LiteralInteger194");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger194.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger194.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read b.p_object::LiteralInteger178
		addToElementRepository("LiteralInteger178", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger178);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger178.setName("LiteralInteger178");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger178.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger178.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result::LiteralInteger236
		addToElementRepository("LiteralInteger236", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralInteger236);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralInteger236.setName("LiteralInteger236");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralInteger236.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralInteger236.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4::LiteralInteger67
		addToElementRepository("LiteralInteger67", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4_LiteralInteger67);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4_LiteralInteger67.setName("LiteralInteger67");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4_LiteralInteger67.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4_LiteralInteger67.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1::LiteralInteger68
		addToElementRepository("LiteralInteger68", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1_LiteralInteger68);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1_LiteralInteger68.setName("LiteralInteger68");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1_LiteralInteger68.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1_LiteralInteger68.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151::LiteralInteger152
		addToElementRepository("LiteralInteger152", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151_LiteralInteger152);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151_LiteralInteger152.setName("LiteralInteger152");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151_LiteralInteger152.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151_LiteralInteger152.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a2_object::LiteralInteger170
		addToElementRepository("LiteralInteger170", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object_LiteralInteger170);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object_LiteralInteger170.setName("LiteralInteger170");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object_LiteralInteger170.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object_LiteralInteger170.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91::LiteralInteger92
		addToElementRepository("LiteralInteger92", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91_LiteralInteger92);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91_LiteralInteger92.setName("LiteralInteger92");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91_LiteralInteger92.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91_LiteralInteger92.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralInteger140
		addToElementRepository("LiteralInteger140", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger140);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger140.setName("LiteralInteger140");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger140.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger140.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x::LiteralInteger51
		addToElementRepository("LiteralInteger51", MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x_LiteralInteger51);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x_LiteralInteger51.setName("LiteralInteger51");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x_LiteralInteger51.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x_LiteralInteger51.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call test()_target::LiteralInteger109
		addToElementRepository("LiteralInteger109", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger109);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger109.setName("LiteralInteger109");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger109.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger109.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y::LiteralInteger76
		addToElementRepository("LiteralInteger76", MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y_LiteralInteger76);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y_LiteralInteger76.setName("LiteralInteger76");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y_LiteralInteger76.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y_LiteralInteger76.setValue(0);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232::LiteralInteger233
		addToElementRepository("LiteralInteger233", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232_LiteralInteger233);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232_LiteralInteger233.setName("LiteralInteger233");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232_LiteralInteger233.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232_LiteralInteger233.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196::LiteralInteger197
		addToElementRepository("LiteralInteger197", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196_LiteralInteger197);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196_LiteralInteger197.setName("LiteralInteger197");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196_LiteralInteger197.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196_LiteralInteger197.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S_target::LiteralInteger164
		addToElementRepository("LiteralInteger164", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger164);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger164.setName("LiteralInteger164");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger164.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger164.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206::LiteralInteger208
		addToElementRepository("LiteralInteger208", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206_LiteralInteger208);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206_LiteralInteger208.setName("LiteralInteger208");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206_LiteralInteger208.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206_LiteralInteger208.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184::LiteralInteger185
		addToElementRepository("LiteralInteger185", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184_LiteralInteger185);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184_LiteralInteger185.setName("LiteralInteger185");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184_LiteralInteger185.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184_LiteralInteger185.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call testP_p::LiteralInteger192
		addToElementRepository("LiteralInteger192", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger192);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger192.setName("LiteralInteger192");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger192.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralInteger192.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start Tester_object::LiteralInteger100
		addToElementRepository("LiteralInteger100", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object_LiteralInteger100);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object_LiteralInteger100.setName("LiteralInteger100");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object_LiteralInteger100.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object_LiteralInteger100.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3::LiteralInteger72
		addToElementRepository("LiteralInteger72", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3_LiteralInteger72);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3_LiteralInteger72.setName("LiteralInteger72");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3_LiteralInteger72.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3_LiteralInteger72.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203::LiteralInteger204
		addToElementRepository("LiteralInteger204", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203_LiteralInteger204);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203_LiteralInteger204.setName("LiteralInteger204");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203_LiteralInteger204.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203_LiteralInteger204.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a4_object::LiteralInteger190
		addToElementRepository("LiteralInteger190", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object_LiteralInteger190);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object_LiteralInteger190.setName("LiteralInteger190");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object_LiteralInteger190.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object_LiteralInteger190.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p_object::LiteralInteger16
		addToElementRepository("LiteralInteger16", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger16);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger16.setName("LiteralInteger16");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger16.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger16.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S_v::LiteralInteger166
		addToElementRepository("LiteralInteger166", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger166);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger166.setName("LiteralInteger166");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger166.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger166.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219::LiteralInteger220
		addToElementRepository("LiteralInteger220", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219_LiteralInteger220);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219_LiteralInteger220.setName("LiteralInteger220");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219_LiteralInteger220.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219_LiteralInteger220.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.t_result::LiteralInteger46
		addToElementRepository("LiteralInteger46", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger46);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger46.setName("LiteralInteger46");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger46.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger46.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x::LiteralInteger75
		addToElementRepository("LiteralInteger75", MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x_LiteralInteger75);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x_LiteralInteger75.setName("LiteralInteger75");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x_LiteralInteger75.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x_LiteralInteger75.setValue(0);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result::LiteralInteger134
		addToElementRepository("LiteralInteger134", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger134);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger134.setName("LiteralInteger134");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger134.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger134.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_1_result::LiteralInteger119
		addToElementRepository("LiteralInteger119", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger119);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger119.setName("LiteralInteger119");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger119.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger119.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.t_object::LiteralInteger45
		addToElementRepository("LiteralInteger45", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger45);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger45.setName("LiteralInteger45");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger45.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger45.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_3_result::LiteralInteger127
		addToElementRepository("LiteralInteger127", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger127);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger127.setName("LiteralInteger127");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger127.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger127.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept S_s::LiteralInteger9
		addToElementRepository("LiteralInteger9", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger9);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger9.setName("LiteralInteger9");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger9.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger9.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b::LiteralInteger0
		addToElementRepository("LiteralInteger0", MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b_LiteralInteger0);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b_LiteralInteger0.setName("LiteralInteger0");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b_LiteralInteger0.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b_LiteralInteger0.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24::LiteralInteger26
		addToElementRepository("LiteralInteger26", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24_LiteralInteger26);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24_LiteralInteger26.setName("LiteralInteger26");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24_LiteralInteger26.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24_LiteralInteger26.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_1_result::LiteralInteger120
		addToElementRepository("LiteralInteger120", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger120);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger120.setName("LiteralInteger120");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger120.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger120.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read c.p_object::LiteralInteger157
		addToElementRepository("LiteralInteger157", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralInteger157);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralInteger157.setName("LiteralInteger157");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralInteger157.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralInteger157.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read this.c_result::LiteralInteger200
		addToElementRepository("LiteralInteger200", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralInteger200);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralInteger200.setName("LiteralInteger200");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralInteger200.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralInteger200.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send Start_target::LiteralInteger89
		addToElementRepository("LiteralInteger89", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target_LiteralInteger89);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target_LiteralInteger89.setName("LiteralInteger89");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target_LiteralInteger89.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target_LiteralInteger89.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_4_result::LiteralInteger123
		addToElementRepository("LiteralInteger123", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger123);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger123.setName("LiteralInteger123");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger123.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger123.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17::LiteralInteger19
		addToElementRepository("LiteralInteger19", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralInteger19);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralInteger19.setName("LiteralInteger19");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralInteger19.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralInteger19.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester()_result::LiteralInteger98
		addToElementRepository("LiteralInteger98", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralInteger98);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralInteger98.setName("LiteralInteger98");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralInteger98.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralInteger98.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p_value::LiteralInteger11
		addToElementRepository("LiteralInteger11", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger11);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger11.setName("LiteralInteger11");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger11.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger11.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.v_object::LiteralInteger35
		addToElementRepository("LiteralInteger35", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger35);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger35.setName("LiteralInteger35");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger35.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger35.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result::LiteralInteger37
		addToElementRepository("LiteralInteger37", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralInteger37);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralInteger37.setName("LiteralInteger37");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralInteger37.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralInteger37.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4::LiteralInteger5
		addToElementRepository("LiteralInteger5", MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralInteger5);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralInteger5.setName("LiteralInteger5");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralInteger5.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralInteger5.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111::LiteralInteger112
		addToElementRepository("LiteralInteger112", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralInteger112);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralInteger112.setName("LiteralInteger112");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralInteger112.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralInteger112.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209::LiteralInteger210
		addToElementRepository("LiteralInteger210", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209_LiteralInteger210);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209_LiteralInteger210.setName("LiteralInteger210");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209_LiteralInteger210.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209_LiteralInteger210.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value(4)::LiteralInteger162
		addToElementRepository("LiteralInteger162", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger162);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger162.setName("LiteralInteger162");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger162.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger162.setValue(4);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester()_target::LiteralInteger95
		addToElementRepository("LiteralInteger95", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target_LiteralInteger95);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target_LiteralInteger95.setName("LiteralInteger95");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target_LiteralInteger95.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target_LiteralInteger95.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20::LiteralInteger22
		addToElementRepository("LiteralInteger22", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralInteger22);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralInteger22.setName("LiteralInteger22");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralInteger22.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralInteger22.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a3_result::LiteralInteger226
		addToElementRepository("LiteralInteger226", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result_LiteralInteger226);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result_LiteralInteger226.setName("LiteralInteger226");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result_LiteralInteger226.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result_LiteralInteger226.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S_t::LiteralInteger168
		addToElementRepository("LiteralInteger168", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger168);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger168.setName("LiteralInteger168");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger168.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger168.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester()_result::LiteralInteger96
		addToElementRepository("LiteralInteger96", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralInteger96);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralInteger96.setName("LiteralInteger96");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralInteger96.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralInteger96.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read this.c_object::LiteralInteger202
		addToElementRepository("LiteralInteger202", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralInteger202);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralInteger202.setName("LiteralInteger202");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralInteger202.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralInteger202.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81::LiteralInteger82
		addToElementRepository("LiteralInteger82", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81_LiteralInteger82);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81_LiteralInteger82.setName("LiteralInteger82");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81_LiteralInteger82.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81_LiteralInteger82.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read c.p_result::LiteralInteger155
		addToElementRepository("LiteralInteger155", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralInteger155);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralInteger155.setName("LiteralInteger155");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralInteger155.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralInteger155.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a1_object::LiteralInteger237
		addToElementRepository("LiteralInteger237", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object_LiteralInteger237);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object_LiteralInteger237.setName("LiteralInteger237");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object_LiteralInteger237.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object_LiteralInteger237.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_4_result::LiteralInteger121
		addToElementRepository("LiteralInteger121", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger121);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger121.setName("LiteralInteger121");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger121.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger121.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a3_object::LiteralInteger228
		addToElementRepository("LiteralInteger228", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object_LiteralInteger228);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object_LiteralInteger228.setName("LiteralInteger228");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object_LiteralInteger228.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object_LiteralInteger228.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57::LiteralInteger59
		addToElementRepository("LiteralInteger59", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57_LiteralInteger59);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57_LiteralInteger59.setName("LiteralInteger59");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57_LiteralInteger59.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57_LiteralInteger59.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read a.b_object::LiteralInteger215
		addToElementRepository("LiteralInteger215", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger215);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger215.setName("LiteralInteger215");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger215.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger215.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78::LiteralInteger79
		addToElementRepository("LiteralInteger79", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78_LiteralInteger79);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78_LiteralInteger79.setName("LiteralInteger79");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78_LiteralInteger79.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78_LiteralInteger79.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create Tester_result::LiteralInteger85
		addToElementRepository("LiteralInteger85", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result_LiteralInteger85);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result_LiteralInteger85.setName("LiteralInteger85");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result_LiteralInteger85.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result_LiteralInteger85.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222::LiteralInteger223
		addToElementRepository("LiteralInteger223", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222_LiteralInteger223);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222_LiteralInteger223.setName("LiteralInteger223");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222_LiteralInteger223.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222_LiteralInteger223.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept S_s::LiteralInteger10
		addToElementRepository("LiteralInteger10", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger10);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger10.setName("LiteralInteger10");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger10.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger10.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102::LiteralInteger104
		addToElementRepository("LiteralInteger104", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102_LiteralInteger104);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102_LiteralInteger104.setName("LiteralInteger104");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102_LiteralInteger104.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102_LiteralInteger104.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114::LiteralInteger116
		addToElementRepository("LiteralInteger116", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralInteger116);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralInteger116.setName("LiteralInteger116");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralInteger116.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralInteger116.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a4_result::LiteralInteger189
		addToElementRepository("LiteralInteger189", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result_LiteralInteger189);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result_LiteralInteger189.setName("LiteralInteger189");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result_LiteralInteger189.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result_LiteralInteger189.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p_result::LiteralInteger14
		addToElementRepository("LiteralInteger14", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger14);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger14.setName("LiteralInteger14");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger14.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger14.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_1_result::LiteralUnlimitedNatural118
		addToElementRepository("LiteralUnlimitedNatural118", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural118);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural118.setName("LiteralUnlimitedNatural118");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural118.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural118.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4::LiteralUnlimitedNatural66
		addToElementRepository("LiteralUnlimitedNatural66", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4_LiteralUnlimitedNatural66);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4_LiteralUnlimitedNatural66.setName("LiteralUnlimitedNatural66");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4_LiteralUnlimitedNatural66.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4_LiteralUnlimitedNatural66.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p_object::LiteralUnlimitedNatural15
		addToElementRepository("LiteralUnlimitedNatural15", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural15);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural15.setName("LiteralUnlimitedNatural15");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural15.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural15.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read b.p_object::LiteralUnlimitedNatural177
		addToElementRepository("LiteralUnlimitedNatural177", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural177);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural177.setName("LiteralUnlimitedNatural177");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural177.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural177.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S_t::LiteralUnlimitedNatural169
		addToElementRepository("LiteralUnlimitedNatural169", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural169);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural169.setName("LiteralUnlimitedNatural169");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural169.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural169.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y::LiteralUnlimitedNatural77
		addToElementRepository("LiteralUnlimitedNatural77", MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y_LiteralUnlimitedNatural77);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y_LiteralUnlimitedNatural77.setName("LiteralUnlimitedNatural77");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y_LiteralUnlimitedNatural77.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y_LiteralUnlimitedNatural77.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4::LiteralUnlimitedNatural6
		addToElementRepository("LiteralUnlimitedNatural6", MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralUnlimitedNatural6);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralUnlimitedNatural6.setName("LiteralUnlimitedNatural6");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralUnlimitedNatural6.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd4_LiteralUnlimitedNatural6.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S_target::LiteralUnlimitedNatural165
		addToElementRepository("LiteralUnlimitedNatural165", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural165);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural165.setName("LiteralUnlimitedNatural165");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural165.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural165.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57::LiteralUnlimitedNatural58
		addToElementRepository("LiteralUnlimitedNatural58", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57_LiteralUnlimitedNatural58);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57_LiteralUnlimitedNatural58.setName("LiteralUnlimitedNatural58");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57_LiteralUnlimitedNatural58.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd57_LiteralUnlimitedNatural58.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x::LiteralUnlimitedNatural74
		addToElementRepository("LiteralUnlimitedNatural74", MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x_LiteralUnlimitedNatural74);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x_LiteralUnlimitedNatural74.setName("LiteralUnlimitedNatural74");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x_LiteralUnlimitedNatural74.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x_LiteralUnlimitedNatural74.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value(4)_result::LiteralUnlimitedNatural161
		addToElementRepository("LiteralUnlimitedNatural161", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural161);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural161.setName("LiteralUnlimitedNatural161");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural161.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural161.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_4_result::LiteralUnlimitedNatural122
		addToElementRepository("LiteralUnlimitedNatural122", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural122);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural122.setName("LiteralUnlimitedNatural122");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural122.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural122.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a2_result::LiteralUnlimitedNatural173
		addToElementRepository("LiteralUnlimitedNatural173", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result_LiteralUnlimitedNatural173);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result_LiteralUnlimitedNatural173.setName("LiteralUnlimitedNatural173");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result_LiteralUnlimitedNatural173.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result_LiteralUnlimitedNatural173.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a2_object::LiteralUnlimitedNatural171
		addToElementRepository("LiteralUnlimitedNatural171", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object_LiteralUnlimitedNatural171);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object_LiteralUnlimitedNatural171.setName("LiteralUnlimitedNatural171");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object_LiteralUnlimitedNatural171.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object_LiteralUnlimitedNatural171.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send Start_target::LiteralUnlimitedNatural90
		addToElementRepository("LiteralUnlimitedNatural90", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target_LiteralUnlimitedNatural90);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target_LiteralUnlimitedNatural90.setName("LiteralUnlimitedNatural90");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target_LiteralUnlimitedNatural90.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target_LiteralUnlimitedNatural90.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read this.c_object::LiteralUnlimitedNatural201
		addToElementRepository("LiteralUnlimitedNatural201", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralUnlimitedNatural201);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralUnlimitedNatural201.setName("LiteralUnlimitedNatural201");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralUnlimitedNatural201.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object_LiteralUnlimitedNatural201.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read this.c_result::LiteralUnlimitedNatural145
		addToElementRepository("LiteralUnlimitedNatural145", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralUnlimitedNatural145);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralUnlimitedNatural145.setName("LiteralUnlimitedNatural145");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralUnlimitedNatural145.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result_LiteralUnlimitedNatural145.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read c.p_object::LiteralUnlimitedNatural156
		addToElementRepository("LiteralUnlimitedNatural156", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralUnlimitedNatural156);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralUnlimitedNatural156.setName("LiteralUnlimitedNatural156");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralUnlimitedNatural156.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object_LiteralUnlimitedNatural156.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.t_result::LiteralUnlimitedNatural47
		addToElementRepository("LiteralUnlimitedNatural47", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural47);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural47.setName("LiteralUnlimitedNatural47");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural47.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural47.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester()_target::LiteralUnlimitedNatural94
		addToElementRepository("LiteralUnlimitedNatural94", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target_LiteralUnlimitedNatural94);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target_LiteralUnlimitedNatural94.setName("LiteralUnlimitedNatural94");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target_LiteralUnlimitedNatural94.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target_LiteralUnlimitedNatural94.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_3_result::LiteralUnlimitedNatural126
		addToElementRepository("LiteralUnlimitedNatural126", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural126);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural126.setName("LiteralUnlimitedNatural126");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural126.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural126.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read c.p_result::LiteralUnlimitedNatural154
		addToElementRepository("LiteralUnlimitedNatural154", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralUnlimitedNatural154);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralUnlimitedNatural154.setName("LiteralUnlimitedNatural154");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralUnlimitedNatural154.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result_LiteralUnlimitedNatural154.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a3_result::LiteralUnlimitedNatural225
		addToElementRepository("LiteralUnlimitedNatural225", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result_LiteralUnlimitedNatural225);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result_LiteralUnlimitedNatural225.setName("LiteralUnlimitedNatural225");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result_LiteralUnlimitedNatural225.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result_LiteralUnlimitedNatural225.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.v_object::LiteralUnlimitedNatural36
		addToElementRepository("LiteralUnlimitedNatural36", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural36);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural36.setName("LiteralUnlimitedNatural36");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural36.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural36.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call testP_p::LiteralUnlimitedNatural193
		addToElementRepository("LiteralUnlimitedNatural193", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural193);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural193.setName("LiteralUnlimitedNatural193");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural193.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural193.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result::LiteralUnlimitedNatural38
		addToElementRepository("LiteralUnlimitedNatural38", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural38);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural38.setName("LiteralUnlimitedNatural38");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural38.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural38.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p_result::LiteralUnlimitedNatural13
		addToElementRepository("LiteralUnlimitedNatural13", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural13);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural13.setName("LiteralUnlimitedNatural13");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural13.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural13.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.t_object::LiteralUnlimitedNatural44
		addToElementRepository("LiteralUnlimitedNatural44", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural44);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural44.setName("LiteralUnlimitedNatural44");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural44.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural44.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a3_object::LiteralUnlimitedNatural227
		addToElementRepository("LiteralUnlimitedNatural227", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object_LiteralUnlimitedNatural227);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object_LiteralUnlimitedNatural227.setName("LiteralUnlimitedNatural227");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object_LiteralUnlimitedNatural227.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object_LiteralUnlimitedNatural227.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3::LiteralUnlimitedNatural73
		addToElementRepository("LiteralUnlimitedNatural73", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3_LiteralUnlimitedNatural73);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3_LiteralUnlimitedNatural73.setName("LiteralUnlimitedNatural73");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3_LiteralUnlimitedNatural73.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3_LiteralUnlimitedNatural73.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read b.p_result::LiteralUnlimitedNatural180
		addToElementRepository("LiteralUnlimitedNatural180", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural180);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural180.setName("LiteralUnlimitedNatural180");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural180.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural180.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result::LiteralUnlimitedNatural235
		addToElementRepository("LiteralUnlimitedNatural235", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural235);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural235.setName("LiteralUnlimitedNatural235");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural235.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural235.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y::LiteralUnlimitedNatural54
		addToElementRepository("LiteralUnlimitedNatural54", MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y_LiteralUnlimitedNatural54);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y_LiteralUnlimitedNatural54.setName("LiteralUnlimitedNatural54");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y_LiteralUnlimitedNatural54.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y_LiteralUnlimitedNatural54.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_2_result::LiteralUnlimitedNatural147
		addToElementRepository("LiteralUnlimitedNatural147", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural147);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural147.setName("LiteralUnlimitedNatural147");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural147.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural147.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read this.c_object::LiteralUnlimitedNatural143
		addToElementRepository("LiteralUnlimitedNatural143", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralUnlimitedNatural143);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralUnlimitedNatural143.setName("LiteralUnlimitedNatural143");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralUnlimitedNatural143.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object_LiteralUnlimitedNatural143.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd2::LiteralUnlimitedNatural3
		addToElementRepository("LiteralUnlimitedNatural3", MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd2_LiteralUnlimitedNatural3);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd2_LiteralUnlimitedNatural3.setName("LiteralUnlimitedNatural3");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd2_LiteralUnlimitedNatural3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_r_ConnectorEnd2_LiteralUnlimitedNatural3.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralUnlimitedNatural142
		addToElementRepository("LiteralUnlimitedNatural142", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural142);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural142.setName("LiteralUnlimitedNatural142");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural142.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural142.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send S_v::LiteralUnlimitedNatural167
		addToElementRepository("LiteralUnlimitedNatural167", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural167);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural167.setName("LiteralUnlimitedNatural167");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural167.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural167.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2::LiteralUnlimitedNatural71
		addToElementRepository("LiteralUnlimitedNatural71", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2_LiteralUnlimitedNatural71);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2_LiteralUnlimitedNatural71.setName("LiteralUnlimitedNatural71");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2_LiteralUnlimitedNatural71.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2_LiteralUnlimitedNatural71.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read a.b_result::LiteralUnlimitedNatural213
		addToElementRepository("LiteralUnlimitedNatural213", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural213);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural213.setName("LiteralUnlimitedNatural213");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural213.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural213.setValue(4);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a4_result::LiteralUnlimitedNatural188
		addToElementRepository("LiteralUnlimitedNatural188", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result_LiteralUnlimitedNatural188);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result_LiteralUnlimitedNatural188.setName("LiteralUnlimitedNatural188");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result_LiteralUnlimitedNatural188.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result_LiteralUnlimitedNatural188.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read a.b_object::LiteralUnlimitedNatural214
		addToElementRepository("LiteralUnlimitedNatural214", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural214);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural214.setName("LiteralUnlimitedNatural214");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural214.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural214.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create Tester_result::LiteralUnlimitedNatural84
		addToElementRepository("LiteralUnlimitedNatural84", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result_LiteralUnlimitedNatural84);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result_LiteralUnlimitedNatural84.setName("LiteralUnlimitedNatural84");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result_LiteralUnlimitedNatural84.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result_LiteralUnlimitedNatural84.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept S_s::LiteralUnlimitedNatural8
		addToElementRepository("LiteralUnlimitedNatural8", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural8);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural8.setName("LiteralUnlimitedNatural8");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural8.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural8.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result::LiteralUnlimitedNatural133
		addToElementRepository("LiteralUnlimitedNatural133", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural133);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural133.setName("LiteralUnlimitedNatural133");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural133.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural133.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester()_result::LiteralUnlimitedNatural97
		addToElementRepository("LiteralUnlimitedNatural97", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralUnlimitedNatural97);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralUnlimitedNatural97.setName("LiteralUnlimitedNatural97");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralUnlimitedNatural97.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result_LiteralUnlimitedNatural97.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.v_result::LiteralUnlimitedNatural34
		addToElementRepository("LiteralUnlimitedNatural34", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural34);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural34.setName("LiteralUnlimitedNatural34");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural34.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural34.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a1_object::LiteralUnlimitedNatural238
		addToElementRepository("LiteralUnlimitedNatural238", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object_LiteralUnlimitedNatural238);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object_LiteralUnlimitedNatural238.setName("LiteralUnlimitedNatural238");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object_LiteralUnlimitedNatural238.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object_LiteralUnlimitedNatural238.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read this.c_result::LiteralUnlimitedNatural199
		addToElementRepository("LiteralUnlimitedNatural199", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralUnlimitedNatural199);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralUnlimitedNatural199.setName("LiteralUnlimitedNatural199");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralUnlimitedNatural199.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result_LiteralUnlimitedNatural199.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd55::LiteralUnlimitedNatural56
		addToElementRepository("LiteralUnlimitedNatural56", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd55_LiteralUnlimitedNatural56);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd55_LiteralUnlimitedNatural56.setName("LiteralUnlimitedNatural56");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd55_LiteralUnlimitedNatural56.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_u1_ConnectorEnd55_LiteralUnlimitedNatural56.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x::LiteralUnlimitedNatural52
		addToElementRepository("LiteralUnlimitedNatural52", MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x_LiteralUnlimitedNatural52);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x_LiteralUnlimitedNatural52.setName("LiteralUnlimitedNatural52");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x_LiteralUnlimitedNatural52.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x_LiteralUnlimitedNatural52.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1::LiteralUnlimitedNatural69
		addToElementRepository("LiteralUnlimitedNatural69", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1_LiteralUnlimitedNatural69);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1_LiteralUnlimitedNatural69.setName("LiteralUnlimitedNatural69");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1_LiteralUnlimitedNatural69.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1_LiteralUnlimitedNatural69.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p_value::LiteralUnlimitedNatural12
		addToElementRepository("LiteralUnlimitedNatural12", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural12);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural12.setName("LiteralUnlimitedNatural12");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural12.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural12.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send Continue_target::LiteralUnlimitedNatural42
		addToElementRepository("LiteralUnlimitedNatural42", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural42);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural42.setName("LiteralUnlimitedNatural42");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural42.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural42.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start Tester_object::LiteralUnlimitedNatural101
		addToElementRepository("LiteralUnlimitedNatural101", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object_LiteralUnlimitedNatural101);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object_LiteralUnlimitedNatural101.setName("LiteralUnlimitedNatural101");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object_LiteralUnlimitedNatural101.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object_LiteralUnlimitedNatural101.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a4_object::LiteralUnlimitedNatural191
		addToElementRepository("LiteralUnlimitedNatural191", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object_LiteralUnlimitedNatural191);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object_LiteralUnlimitedNatural191.setName("LiteralUnlimitedNatural191");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object_LiteralUnlimitedNatural191.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object_LiteralUnlimitedNatural191.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b::LiteralUnlimitedNatural1
		addToElementRepository("LiteralUnlimitedNatural1", MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b_LiteralUnlimitedNatural1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b_LiteralUnlimitedNatural1.setName("LiteralUnlimitedNatural1");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b_LiteralUnlimitedNatural1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b_LiteralUnlimitedNatural1.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call test()_target::LiteralUnlimitedNatural110
		addToElementRepository("LiteralUnlimitedNatural110", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural110);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural110.setName("LiteralUnlimitedNatural110");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural110.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural110.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow174
		addToElementRepository("ObjectFlow174", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174.setName("ObjectFlow174");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Fork_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow174_LiteralBoolean176);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_main::ObjectFlow86
		addToElementRepository("ObjectFlow86", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86.setName("ObjectFlow86");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Fork_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow86_LiteralBoolean88);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow181
		addToElementRepository("ObjectFlow181", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181.setName("ObjectFlow181");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow181_LiteralBoolean182);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow184
		addToElementRepository("ObjectFlow184", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184.setName("ObjectFlow184");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow184_LiteralBoolean186);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow102
		addToElementRepository("ObjectFlow102", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102.setName("ObjectFlow102");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow102_LiteralBoolean103);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow106
		addToElementRepository("ObjectFlow106", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106.setName("ObjectFlow106");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow106_LiteralBoolean108);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::ObjectFlow24
		addToElementRepository("ObjectFlow24", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24.setName("ObjectFlow24");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow24_LiteralBoolean25);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow111
		addToElementRepository("ObjectFlow111", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111.setName("ObjectFlow111");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow111_LiteralBoolean113);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow114
		addToElementRepository("ObjectFlow114", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114.setName("ObjectFlow114");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow114_LiteralBoolean115);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_main::ObjectFlow78
		addToElementRepository("ObjectFlow78", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78.setName("ObjectFlow78");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__target);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow78_LiteralBoolean80);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::ObjectFlow30
		addToElementRepository("ObjectFlow30", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30.setName("ObjectFlow30");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow30_LiteralBoolean31);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow196
		addToElementRepository("ObjectFlow196", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196.setName("ObjectFlow196");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Fork_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow196_LiteralBoolean198);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow203
		addToElementRepository("ObjectFlow203", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203.setName("ObjectFlow203");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Fork_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow203_LiteralBoolean205);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow206
		addToElementRepository("ObjectFlow206", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206.setName("ObjectFlow206");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow206_LiteralBoolean207);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow129
		addToElementRepository("ObjectFlow129", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129.setName("ObjectFlow129");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow129_LiteralBoolean130);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow209
		addToElementRepository("ObjectFlow209", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209.setName("ObjectFlow209");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Fork_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow209_LiteralBoolean211);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_main::ObjectFlow81
		addToElementRepository("ObjectFlow81", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81.setName("ObjectFlow81");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Fork_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow81_LiteralBoolean83);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow216
		addToElementRepository("ObjectFlow216", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216.setName("ObjectFlow216");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow216_LiteralBoolean217);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow135
		addToElementRepository("ObjectFlow135", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135.setName("ObjectFlow135");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow135_LiteralBoolean137);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow219
		addToElementRepository("ObjectFlow219", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219.setName("ObjectFlow219");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Fork_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow219_LiteralBoolean221);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::ObjectFlow17
		addToElementRepository("ObjectFlow17", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17.setName("ObjectFlow17");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralBoolean18);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::ObjectFlow20
		addToElementRepository("ObjectFlow20", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20.setName("ObjectFlow20");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_value);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralBoolean21);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_main::ObjectFlow91
		addToElementRepository("ObjectFlow91", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91.setName("ObjectFlow91");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Fork_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_ObjectFlow91_LiteralBoolean93);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow222
		addToElementRepository("ObjectFlow222", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222.setName("ObjectFlow222");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow222_LiteralBoolean224);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::ObjectFlow27
		addToElementRepository("ObjectFlow27", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27.setName("ObjectFlow27");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow27_LiteralBoolean29);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::ObjectFlow151
		addToElementRepository("ObjectFlow151", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151.setName("ObjectFlow151");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_ObjectFlow151_LiteralBoolean153);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow229
		addToElementRepository("ObjectFlow229", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229.setName("ObjectFlow229");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Call_testP_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow229_LiteralBoolean230);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::ObjectFlow39
		addToElementRepository("ObjectFlow39", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39.setName("ObjectFlow39");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_ObjectFlow39_LiteralBoolean41);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::ObjectFlow232
		addToElementRepository("ObjectFlow232", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232.setName("ObjectFlow232");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232.setSource(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_ObjectFlow232_LiteralBoolean234);
	}

	private void initializeOperation_Instances()
	{
		// Operation MultipleDelegation_MultipleConnector_P_PWP_Signal_B::B_B
		addToElementRepository("B_B", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B.setName("B");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B.addOwnedParameter(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester::test
		addToElementRepository("test", MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_test);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_test.setName("test");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_test.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_test.setIsAbstract(true);
		// Operation MultipleDelegation_MultipleConnector_P_PWP_Signal_A::A_A
		addToElementRepository("A_A", MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A.setName("A");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A.addOwnedParameter(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester::test
		addToElementRepository("test", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_test);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_test.setName("test");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_test.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_test.addMethod(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity);
		// Operation MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester::Tester_Tester
		addToElementRepository("Tester_Tester", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester.setName("Tester");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester.addOwnedParameter(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_3::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Continue);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.v::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read a.b::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_B);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result.setUpper(4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result.setLower(4);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a4::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_A);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_2::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Continue);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a3::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_A);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Start::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Start);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a1::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_A);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_4::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Continue);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read c.p::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read this.c::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_C);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read s.t::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester()::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Tester__result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value(4)::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read this.c::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_C);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_1::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Continue);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set this.p::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Set_this_p_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read b.p::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read c.a2::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_A);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create Tester::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Create_Tester_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept S::s
		addToElementRepository("s", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s.setName("s");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_s.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_S);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport MultipleDelegation_MultipleConnector_P_PWP_Signal::PackageImport49
		addToElementRepository("PackageImport49", MultipleDelegation_MultipleConnector_P_PWP_Signal_PackageImport49);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_Tester_Tester_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP_p.setName("p");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_B);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_B_B_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A_result);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_A);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_A_A_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port MultipleDelegation_MultipleConnector_P_PWP_Signal_C::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p.setName("p");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p.setAggregation(AggregationKind.composite);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p.isService = true;
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p.addProvided(MultipleDelegation_MultipleConnector_P_PWP_Signal_I);
		// Port MultipleDelegation_MultipleConnector_P_PWP_Signal_A::q
		addToElementRepository("q", MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q.setName("q");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q.setAggregation(AggregationKind.composite);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q.isService = true;
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_q.addProvided(MultipleDelegation_MultipleConnector_P_PWP_Signal_I);
	}

	private void initializeProperty_Instances()
	{
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_S::t
		addToElementRepository("t", MultipleDelegation_MultipleConnector_P_PWP_Signal_S_t);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_S_t.setName("t");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_S_t.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_S_t.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester::c
		addToElementRepository("c", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_c.setName("c");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_c.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_c.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_C);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_c.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_A::b
		addToElementRepository("b", MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b.setName("b");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_B);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_C::a1
		addToElementRepository("a1", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1.setName("a1");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_A);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_C::a3
		addToElementRepository("a3", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3.setName("a3");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_A);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_R::x
		addToElementRepository("x", MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x.setName("x");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_x.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_B);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_B::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_p.setName("p");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_R::y
		addToElementRepository("y", MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y.setName("y");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_R_y.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_U::x
		addToElementRepository("x", MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x.setName("x");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x.setUpper(-1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x.setLower(0);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_x.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_S::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_PWP_Signal_S_v);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_S_v.setName("v");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_S_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_C::a4
		addToElementRepository("a4", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4.setName("a4");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_A);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_U::y
		addToElementRepository("y", MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y.setName("y");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y.setUpper(-1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y.setLower(0);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_U_y.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Signal_C::a2
		addToElementRepository("a2", MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2.setName("a2");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2.setType(MultipleDelegation_MultipleConnector_P_PWP_Signal_A);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2.setAggregation(AggregationKind.composite);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::this
		addToElementRepository("this", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this.setName("this");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_this_result);
		// ReadSelfAction MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::this
		addToElementRepository("this", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this.setName("this");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_this_result);
		// ReadSelfAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::this
		addToElementRepository("this", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this.setName("this");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::Read c.a3
		addToElementRepository("Read c.a3", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3.setName("Read c.a3");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a3);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a3_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::Read c.a2
		addToElementRepository("Read c.a2", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2.setName("Read c.a2");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a2);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a2_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Read this.c
		addToElementRepository("Read this.c", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c.setName("Read this.c");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_this_c_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::Read b.p
		addToElementRepository("Read b.p", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p.setName("Read b.p");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_b_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::Read a.b
		addToElementRepository("Read a.b", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b.setName("Read a.b");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Signal_A_b);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_a_b_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Read c.p
		addToElementRepository("Read c.p", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p.setName("Read c.p");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_p);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Read_c_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::Read s.v
		addToElementRepository("Read s.v", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v.setName("Read s.v");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Signal_S_v);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_v_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::Read this.c
		addToElementRepository("Read this.c", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c.setName("Read this.c");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_c);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_this_c_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::Read c.a4
		addToElementRepository("Read c.a4", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4.setName("Read c.a4");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a4_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity::Read c.a1
		addToElementRepository("Read c.a1", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1.setName("Read c.a1");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Signal_C_a1);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_testActivity_Read_c_a1_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::Read s.t
		addToElementRepository("Read s.t", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t.setName("Read s.t");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Signal_S_t);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_object);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Read_s_t_result);
	}

	private void initializeReception_Instances()
	{
		// Reception MultipleDelegation_MultipleConnector_P_PWP_Signal_I::S
		addToElementRepository("S", MultipleDelegation_MultipleConnector_P_PWP_Signal_I_S);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_I_S.setName("S");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_I_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_I_S.setSignal(MultipleDelegation_MultipleConnector_P_PWP_Signal_S);
		// Reception MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester::Continue
		addToElementRepository("Continue", MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_Continue);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_Continue.setName("Continue");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_Continue.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_Continue.setSignal(MultipleDelegation_MultipleConnector_P_PWP_Signal_Continue);
		// Reception MultipleDelegation_MultipleConnector_P_PWP_Signal_B::S
		addToElementRepository("S", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_S);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_S.setName("S");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_S.setSignal(MultipleDelegation_MultipleConnector_P_PWP_Signal_S);
		// Reception MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester::Start
		addToElementRepository("Start", MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_Start);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_Start.setName("Start");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_Start.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_AbstractTester_Start.setSignal(MultipleDelegation_MultipleConnector_P_PWP_Signal_Start);
		// Reception MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl::S
		addToElementRepository("S", MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl_S);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl_S.setName("S");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_IImpl_S.setSignal(MultipleDelegation_MultipleConnector_P_PWP_Signal_S);
	}

	private void initializeSendSignalAction_Instances()
	{
		// SendSignalAction MultipleDelegation_MultipleConnector_P_PWP_Signal_main::Send Start
		addToElementRepository("Send Start", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start.setName("Send Start");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start.setSignal(MultipleDelegation_MultipleConnector_P_PWP_Signal_Start);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Send_Start_target);
		// SendSignalAction MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior::Send Continue
		addToElementRepository("Send Continue", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue.setName("Send Continue");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue.setSignal(MultipleDelegation_MultipleConnector_P_PWP_Signal_Continue);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Send_Continue_target);
		// SendSignalAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Send S
		addToElementRepository("Send S", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S.setName("Send S");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S.setSignal(MultipleDelegation_MultipleConnector_P_PWP_Signal_S);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S.addArgument(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S.addArgument(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Send_S_t);
	}

	private void initializeSignal_Instances()
	{
		// Signal MultipleDelegation_MultipleConnector_P_PWP_Signal::Continue
		addToElementRepository("Continue", MultipleDelegation_MultipleConnector_P_PWP_Signal_Continue);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Continue.setName("Continue");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Continue.setVisibility(VisibilityKind.public_);
		// Signal MultipleDelegation_MultipleConnector_P_PWP_Signal::S
		addToElementRepository("S", MultipleDelegation_MultipleConnector_P_PWP_Signal_S);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_S.setName("S");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_S.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Signal_S.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Signal_S_v);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_S.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Signal_S_t);
		// Signal MultipleDelegation_MultipleConnector_P_PWP_Signal::Start
		addToElementRepository("Start", MultipleDelegation_MultipleConnector_P_PWP_Signal_Start);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Start.setName("Start");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Start.setVisibility(VisibilityKind.public_);
	}

	private void initializeSignalEvent_Instances()
	{
		// SignalEvent MultipleDelegation_MultipleConnector_P_PWP_Signal::ContinueEvent
		addToElementRepository("ContinueEvent", MultipleDelegation_MultipleConnector_P_PWP_Signal_ContinueEvent);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_ContinueEvent.setName("ContinueEvent");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_ContinueEvent.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_ContinueEvent.setSignal(MultipleDelegation_MultipleConnector_P_PWP_Signal_Continue);
		// SignalEvent MultipleDelegation_MultipleConnector_P_PWP_Signal::SEvent
		addToElementRepository("SEvent", MultipleDelegation_MultipleConnector_P_PWP_Signal_SEvent);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_SEvent.setName("SEvent");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_SEvent.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_SEvent.setSignal(MultipleDelegation_MultipleConnector_P_PWP_Signal_S);
		// SignalEvent MultipleDelegation_MultipleConnector_P_PWP_Signal::StartEvent
		addToElementRepository("StartEvent", MultipleDelegation_MultipleConnector_P_PWP_Signal_StartEvent);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_StartEvent.setName("StartEvent");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_StartEvent.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_StartEvent.setSignal(MultipleDelegation_MultipleConnector_P_PWP_Signal_Start);
	}

	private void initializeStartObjectBehaviorAction_Instances()
	{
		// StartObjectBehaviorAction MultipleDelegation_MultipleConnector_P_PWP_Signal_main::Start Tester
		addToElementRepository("Start Tester", MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester.setName("Start Tester");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester.setObject(MultipleDelegation_MultipleConnector_P_PWP_Signal_main_Start_Tester_object);
	}

	private void initializeTrigger_Instances()
	{
		// Trigger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_1::Trigger117
		addToElementRepository("Trigger117", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger117);
		// Trigger Trigger117
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger117.setName("Trigger117");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger117.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger117.setEvent(MultipleDelegation_MultipleConnector_P_PWP_Signal_ContinueEvent);
		// Trigger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Start::Trigger139
		addToElementRepository("Trigger139", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger139);
		// Trigger Trigger139
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger139.setName("Trigger139");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger139.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger139.setEvent(MultipleDelegation_MultipleConnector_P_PWP_Signal_StartEvent);
		// Trigger MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept S::Trigger7
		addToElementRepository("Trigger7", MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_Trigger7);
		// Trigger Trigger7
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_Trigger7.setName("Trigger7");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_Trigger7.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_B_BClassifierBehavior_Accept_S_Trigger7.setEvent(MultipleDelegation_MultipleConnector_P_PWP_Signal_SEvent);
		// Trigger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_2::Trigger150
		addToElementRepository("Trigger150", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger150);
		// Trigger Trigger150
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger150.setName("Trigger150");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger150.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger150.setEvent(MultipleDelegation_MultipleConnector_P_PWP_Signal_ContinueEvent);
		// Trigger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_4::Trigger124
		addToElementRepository("Trigger124", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger124);
		// Trigger Trigger124
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger124.setName("Trigger124");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger124.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger124.setEvent(MultipleDelegation_MultipleConnector_P_PWP_Signal_ContinueEvent);
		// Trigger MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept Continue_3::Trigger128
		addToElementRepository("Trigger128", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger128);
		// Trigger Trigger128
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger128.setName("Trigger128");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger128.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger128.setEvent(MultipleDelegation_MultipleConnector_P_PWP_Signal_ContinueEvent);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior::Value(4)
		addToElementRepository("Value(4)", MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4.setName("Value(4)");
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4.setValue(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger162);
		MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4.setResult(MultipleDelegation_MultipleConnector_P_PWP_Signal_Tester_TesterClassifierBehavior_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // MultipleDelegation_MultipleConnector_P_PWP_SignalModel
