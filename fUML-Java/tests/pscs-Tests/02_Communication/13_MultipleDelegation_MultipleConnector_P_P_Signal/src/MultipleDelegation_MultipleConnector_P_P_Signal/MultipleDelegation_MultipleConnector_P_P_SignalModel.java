/*
 * MultipleDelegation_MultipleConnector_P_P_SignalModel.java
 * 
 * Auto-generated file
 */
package MultipleDelegation_MultipleConnector_P_P_Signal;

import uml.commonbehavior.SignalEvent;
import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.classification.Generalization;
import uml.structuredclassifiers.Connector;
import uml.simpleclassifiers.Signal;
import uml.values.LiteralUnlimitedNatural;
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
import uml.actions.ValueSpecificationAction;
import uml.actions.CreateObjectAction;
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

public class MultipleDelegation_MultipleConnector_P_P_SignalModel extends InMemoryModel
{
	private static MultipleDelegation_MultipleConnector_P_P_SignalModel instance;

	/*
	 * Model MultipleDelegation_MultipleConnector_P_P_Signal
	 */
	public Package MultipleDelegation_MultipleConnector_P_P_Signal = new Package();
		public Signal MultipleDelegation_MultipleConnector_P_P_Signal_S = new Signal();
			public Property MultipleDelegation_MultipleConnector_P_P_Signal_S_v = new Property();
			public Property MultipleDelegation_MultipleConnector_P_P_Signal_S_t = new Property();
		public Interface MultipleDelegation_MultipleConnector_P_P_Signal_I = new Interface();
			public Reception MultipleDelegation_MultipleConnector_P_P_Signal_I_S = new Reception();
		public SignalEvent MultipleDelegation_MultipleConnector_P_P_Signal_ContinueEvent = new SignalEvent();
		public Signal MultipleDelegation_MultipleConnector_P_P_Signal_Continue = new Signal();
		public Class_ MultipleDelegation_MultipleConnector_P_P_Signal_IImpl = new Class_();
			public InterfaceRealization MultipleDelegation_MultipleConnector_P_P_Signal_IImpl_IRealization = new InterfaceRealization();
			public Reception MultipleDelegation_MultipleConnector_P_P_Signal_IImpl_S = new Reception();
		public SignalEvent MultipleDelegation_MultipleConnector_P_P_Signal_StartEvent = new SignalEvent();
		public Class_ MultipleDelegation_MultipleConnector_P_P_Signal_B = new Class_();
			public Operation MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B_result = new Parameter();
			public Property MultipleDelegation_MultipleConnector_P_P_Signal_B_p = new Property();
			public Activity MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior = new Activity();
				public AcceptEventAction MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S = new AcceptEventAction();
					public Trigger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger0 = new Trigger();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural1 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger2 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger3 = new LiteralInteger();
				public ForkNode MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Fork_s = new ForkNode();
				public AddStructuralFeatureValueAction MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger4 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural5 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural6 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger7 = new LiteralInteger();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural8 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger9 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralBoolean11 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralInteger12 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13_LiteralBoolean14 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13_LiteralInteger15 = new LiteralInteger();
				public ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow16 = new ControlFlow();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralBoolean18 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralInteger19 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralInteger21 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralBoolean22 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralBoolean24 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralInteger25 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger26 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural27 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger28 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural29 = new LiteralUnlimitedNatural();
				public ReadSelfAction MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger30 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural31 = new LiteralUnlimitedNatural();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32_LiteralInteger33 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32_LiteralBoolean34 = new LiteralBoolean();
				public SendSignalAction MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue = new SendSignalAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural35 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger36 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural37 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger38 = new LiteralInteger();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger39 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural40 = new LiteralUnlimitedNatural();
			public Reception MultipleDelegation_MultipleConnector_P_P_Signal_B_S = new Reception();
			public InterfaceRealization MultipleDelegation_MultipleConnector_P_P_Signal_B_IRealization = new InterfaceRealization();
		public Comment MultipleDelegation_MultipleConnector_P_P_Signal_Comment41 = new Comment();
		public PackageImport MultipleDelegation_MultipleConnector_P_P_Signal_PackageImport42 = new PackageImport();
		public Comment MultipleDelegation_MultipleConnector_P_P_Signal_Comment43 = new Comment();
		public Activity MultipleDelegation_MultipleConnector_P_P_Signal_main = new Activity();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44_LiteralInteger45 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44_LiteralBoolean46 = new LiteralBoolean();
			public SendSignalAction MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start = new SendSignalAction();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural47 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target_LiteralInteger48 = new LiteralInteger();
			public ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_main_ControlFlow49 = new ControlFlow();
			public StartObjectBehaviorAction MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester = new StartObjectBehaviorAction();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object_LiteralInteger50 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural51 = new LiteralUnlimitedNatural();
			public CreateObjectAction MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester = new CreateObjectAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result = new OutputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural52 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result_LiteralInteger53 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54_LiteralInteger55 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54_LiteralBoolean56 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57_LiteralInteger58 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57_LiteralBoolean59 = new LiteralBoolean();
			public CallOperationAction MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester_ = new CallOperationAction();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target_LiteralInteger60 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural61 = new LiteralUnlimitedNatural();
				public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralInteger62 = new LiteralInteger();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralInteger63 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural64 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65_LiteralBoolean66 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65_LiteralInteger67 = new LiteralInteger();
			public ForkNode MultipleDelegation_MultipleConnector_P_P_Signal_main_Fork_Tester = new ForkNode();
		public Signal MultipleDelegation_MultipleConnector_P_P_Signal_Start = new Signal();
		public Association MultipleDelegation_MultipleConnector_P_P_Signal_R = new Association();
			public Property MultipleDelegation_MultipleConnector_P_P_Signal_R_x = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_R_x_LiteralInteger68 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_R_x_LiteralUnlimitedNatural69 = new LiteralUnlimitedNatural();
			public Property MultipleDelegation_MultipleConnector_P_P_Signal_R_y = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_R_y_LiteralInteger70 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_R_y_LiteralUnlimitedNatural71 = new LiteralUnlimitedNatural();
		public Class_ MultipleDelegation_MultipleConnector_P_P_Signal_A = new Class_();
			public Connector MultipleDelegation_MultipleConnector_P_P_Signal_A_r3 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r3_ConnectorEnd72 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r3_ConnectorEnd73 = new ConnectorEnd();
			public Operation MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A_result = new Parameter();
			public Property MultipleDelegation_MultipleConnector_P_P_Signal_A_b2 = new Property();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_A_b2_LiteralUnlimitedNatural74 = new LiteralUnlimitedNatural();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_A_b2_LiteralInteger75 = new LiteralInteger();
			public Property MultipleDelegation_MultipleConnector_P_P_Signal_A_b1 = new Property();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_A_b1_LiteralUnlimitedNatural76 = new LiteralUnlimitedNatural();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_A_b1_LiteralInteger77 = new LiteralInteger();
			public Property MultipleDelegation_MultipleConnector_P_P_Signal_A_b3 = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_A_b3_LiteralInteger78 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_A_b3_LiteralUnlimitedNatural79 = new LiteralUnlimitedNatural();
			public Connector MultipleDelegation_MultipleConnector_P_P_Signal_A_r1 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80 = new ConnectorEnd();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80_LiteralInteger81 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80_LiteralUnlimitedNatural82 = new LiteralUnlimitedNatural();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd83 = new ConnectorEnd();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd83_LiteralUnlimitedNatural84 = new LiteralUnlimitedNatural();
			public Connector MultipleDelegation_MultipleConnector_P_P_Signal_A_r2 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r2_ConnectorEnd85 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r2_ConnectorEnd86 = new ConnectorEnd();
			public Property MultipleDelegation_MultipleConnector_P_P_Signal_A_b4 = new Property();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_A_b4_LiteralUnlimitedNatural87 = new LiteralUnlimitedNatural();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_A_b4_LiteralInteger88 = new LiteralInteger();
			public Port MultipleDelegation_MultipleConnector_P_P_Signal_A_q = new Port();
			public Connector MultipleDelegation_MultipleConnector_P_P_Signal_A_r4 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r4_ConnectorEnd89 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r4_ConnectorEnd90 = new ConnectorEnd();
		public Class_ MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester = new Class_();
			public Reception MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_Continue = new Reception();
			public Reception MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_Start = new Reception();
			public Operation MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_test = new Operation();
		public Class_ MultipleDelegation_MultipleConnector_P_P_Signal_Tester = new Class_();
			public Generalization MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Generalization91 = new Generalization();
			public Activity MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity = new Activity();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92_LiteralInteger93 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92_LiteralBoolean94 = new LiteralBoolean();
				public ForkNode MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Fork_a = new ForkNode();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95_LiteralBoolean96 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95_LiteralInteger97 = new LiteralInteger();
				public ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow98 = new ControlFlow();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger100 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean101 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102_LiteralBoolean103 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102_LiteralInteger104 = new LiteralInteger();
				public ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow105 = new ControlFlow();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural106 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger107 = new LiteralInteger();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural108 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger109 = new LiteralInteger();
				public OpaqueBehavior MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP = new OpaqueBehavior();
					public Parameter MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP_p = new Parameter();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4 = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object_LiteralUnlimitedNatural110 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object_LiteralInteger111 = new LiteralInteger();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result_LiteralInteger112 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result_LiteralUnlimitedNatural113 = new LiteralUnlimitedNatural();
				public ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow114 = new ControlFlow();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2 = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object_LiteralInteger115 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object_LiteralUnlimitedNatural116 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result_LiteralInteger117 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result_LiteralUnlimitedNatural118 = new LiteralUnlimitedNatural();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralInteger120 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralBoolean121 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122_LiteralInteger123 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122_LiteralBoolean124 = new LiteralBoolean();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1 = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object_LiteralUnlimitedNatural125 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object_LiteralInteger126 = new LiteralInteger();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_result = new OutputPin();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127_LiteralInteger128 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127_LiteralBoolean129 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130_LiteralBoolean131 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130_LiteralInteger132 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133_LiteralInteger134 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133_LiteralBoolean135 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136_LiteralInteger137 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136_LiteralBoolean138 = new LiteralBoolean();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural139 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger140 = new LiteralInteger();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger141 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural142 = new LiteralUnlimitedNatural();
				public ReadSelfAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural143 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result_LiteralInteger144 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145_LiteralBoolean146 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145_LiteralInteger147 = new LiteralInteger();
				public CallBehaviorAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP = new CallBehaviorAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger148 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger149 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural150 = new LiteralUnlimitedNatural();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3 = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object_LiteralInteger151 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object_LiteralUnlimitedNatural152 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result_LiteralUnlimitedNatural153 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result_LiteralInteger154 = new LiteralInteger();
			public Property MultipleDelegation_MultipleConnector_P_P_Signal_Tester_a = new Property();
			public Operation MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester_result = new Parameter();
			public Operation MultipleDelegation_MultipleConnector_P_P_Signal_Tester_test = new Operation();
			public Activity MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior = new Activity();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155_LiteralBoolean156 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155_LiteralInteger157 = new LiteralInteger();
				public AcceptEventAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start = new AcceptEventAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural158 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger159 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger160 = new LiteralInteger();
					public Trigger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger161 = new Trigger();
				public AcceptEventAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1 = new AcceptEventAction();
					public Trigger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger162 = new Trigger();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger163 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger164 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural165 = new LiteralUnlimitedNatural();
				public ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow166 = new ControlFlow();
				public ForkNode MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this = new ForkNode();
				public ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow167 = new ControlFlow();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168_LiteralInteger169 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168_LiteralBoolean170 = new LiteralBoolean();
				public AcceptEventAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4 = new AcceptEventAction();
					public Trigger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger171 = new Trigger();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural172 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger173 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger174 = new LiteralInteger();
				public AcceptEventAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2 = new AcceptEventAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural175 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger176 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger177 = new LiteralInteger();
					public Trigger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger178 = new Trigger();
				public ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow179 = new ControlFlow();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger180 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural181 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger182 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural183 = new LiteralUnlimitedNatural();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184_LiteralBoolean185 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184_LiteralInteger186 = new LiteralInteger();
				public CallOperationAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_ = new CallOperationAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural187 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger188 = new LiteralInteger();
				public ValueSpecificationAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4 = new ValueSpecificationAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger189 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural190 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger191 = new LiteralInteger();
				public ReadSelfAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger192 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural193 = new LiteralUnlimitedNatural();
				public ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow194 = new ControlFlow();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195_LiteralInteger196 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195_LiteralBoolean197 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198_LiteralBoolean199 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198_LiteralInteger200 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger201 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural202 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural203 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger204 = new LiteralInteger();
				public ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow205 = new ControlFlow();
				public SendSignalAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S = new SendSignalAction();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural206 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger207 = new LiteralInteger();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural208 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger209 = new LiteralInteger();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural210 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger211 = new LiteralInteger();
				public ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow212 = new ControlFlow();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213_LiteralBoolean214 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213_LiteralInteger215 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216_LiteralInteger217 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216_LiteralBoolean218 = new LiteralBoolean();
				public AcceptEventAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3 = new AcceptEventAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger219 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger220 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural221 = new LiteralUnlimitedNatural();
					public Trigger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger222 = new Trigger();
		public SignalEvent MultipleDelegation_MultipleConnector_P_P_Signal_SEvent = new SignalEvent();

	public static MultipleDelegation_MultipleConnector_P_P_SignalModel instance()
	{
		if (instance == null)
        {
            instance = new MultipleDelegation_MultipleConnector_P_P_SignalModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public MultipleDelegation_MultipleConnector_P_P_SignalModel()
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
		// AcceptEventAction MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::Accept S
		addToElementRepository("Accept S", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S.setName("Accept S");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S.addResult(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S.addTrigger(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger0);
		// AcceptEventAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::Accept Continue_4
		addToElementRepository("Accept Continue_4", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.setName("Accept Continue_4");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.addResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.addTrigger(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger171);
		// AcceptEventAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::Accept Continue_2
		addToElementRepository("Accept Continue_2", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.setName("Accept Continue_2");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.addResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.addTrigger(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger178);
		// AcceptEventAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::Accept Start
		addToElementRepository("Accept Start", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start.setName("Accept Start");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start.addResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start.addTrigger(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger161);
		// AcceptEventAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::Accept Continue_1
		addToElementRepository("Accept Continue_1", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.setName("Accept Continue_1");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.addResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.addTrigger(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger162);
		// AcceptEventAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::Accept Continue_3
		addToElementRepository("Accept Continue_3", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.setName("Accept Continue_3");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.addResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.addTrigger(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger222);
	}

	private void initializeActivity_Instances()
	{
		// Activity MultipleDelegation_MultipleConnector_P_P_Signal_Tester::testActivity
		addToElementRepository("testActivity", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.setName("testActivity");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addOwnedBehavior(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Fork_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow98);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow105);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow114);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145);
		// Activity MultipleDelegation_MultipleConnector_P_P_Signal_B::BClassifierBehavior
		addToElementRepository("BClassifierBehavior", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.setName("BClassifierBehavior");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow16);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17);
		// Activity MultipleDelegation_MultipleConnector_P_P_Signal::main
		addToElementRepository("main", MultipleDelegation_MultipleConnector_P_P_Signal_main);
		MultipleDelegation_MultipleConnector_P_P_Signal_main.setName("main");
		MultipleDelegation_MultipleConnector_P_P_Signal_main.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start);
		MultipleDelegation_MultipleConnector_P_P_Signal_main.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_main.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_main.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_main_Fork_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44);
		MultipleDelegation_MultipleConnector_P_P_Signal_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_main_ControlFlow49);
		MultipleDelegation_MultipleConnector_P_P_Signal_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54);
		MultipleDelegation_MultipleConnector_P_P_Signal_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57);
		MultipleDelegation_MultipleConnector_P_P_Signal_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65);
		// Activity MultipleDelegation_MultipleConnector_P_P_Signal_Tester::TesterClassifierBehavior
		addToElementRepository("TesterClassifierBehavior", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.setName("TesterClassifierBehavior");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow194);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow166);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow205);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow167);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow179);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow212);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::Set this.p
		addToElementRepository("Set this.p", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p.setName("Set this.p");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Signal_B_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p.setObject(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p.setValue(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association MultipleDelegation_MultipleConnector_P_P_Signal::R
		addToElementRepository("R", MultipleDelegation_MultipleConnector_P_P_Signal_R);
		MultipleDelegation_MultipleConnector_P_P_Signal_R.setName("R");
		MultipleDelegation_MultipleConnector_P_P_Signal_R.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_R.addOwnedEnd(MultipleDelegation_MultipleConnector_P_P_Signal_R_x);
		MultipleDelegation_MultipleConnector_P_P_Signal_R.addOwnedEnd(MultipleDelegation_MultipleConnector_P_P_Signal_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::Call testP
		addToElementRepository("Call testP", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP.setName("Call testP");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP.setBehavior(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP.addArgument(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction MultipleDelegation_MultipleConnector_P_P_Signal_main::Tester()
		addToElementRepository("Tester()", MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester_.setName("Tester()");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester_.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester_.addResult(MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester_.setOperation(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester_.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target);
		// CallOperationAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::Call test()
		addToElementRepository("Call test()", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_.setName("Call test()");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_.setOperation(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_test);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target);
	}

	private void initializeClass_Instances()
	{
		// Class MultipleDelegation_MultipleConnector_P_P_Signal::A
		addToElementRepository("A", MultipleDelegation_MultipleConnector_P_P_Signal_A);
		MultipleDelegation_MultipleConnector_P_P_Signal_A.setName("A");
		MultipleDelegation_MultipleConnector_P_P_Signal_A.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_A.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Signal_A_q);
		MultipleDelegation_MultipleConnector_P_P_Signal_A.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Signal_A_b1);
		MultipleDelegation_MultipleConnector_P_P_Signal_A.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Signal_A_b2);
		MultipleDelegation_MultipleConnector_P_P_Signal_A.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Signal_A_b3);
		MultipleDelegation_MultipleConnector_P_P_Signal_A.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Signal_A_b4);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_A.addOwnedConnector(MultipleDelegation_MultipleConnector_P_P_Signal_A_r3);
		MultipleDelegation_MultipleConnector_P_P_Signal_A.addOwnedConnector(MultipleDelegation_MultipleConnector_P_P_Signal_A_r1);
		MultipleDelegation_MultipleConnector_P_P_Signal_A.addOwnedConnector(MultipleDelegation_MultipleConnector_P_P_Signal_A_r2);
		MultipleDelegation_MultipleConnector_P_P_Signal_A.addOwnedConnector(MultipleDelegation_MultipleConnector_P_P_Signal_A_r4);
		MultipleDelegation_MultipleConnector_P_P_Signal_A.addOwnedOperation(MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A);
		// Class MultipleDelegation_MultipleConnector_P_P_Signal::IImpl
		addToElementRepository("IImpl", MultipleDelegation_MultipleConnector_P_P_Signal_IImpl);
		MultipleDelegation_MultipleConnector_P_P_Signal_IImpl.setName("IImpl");
		MultipleDelegation_MultipleConnector_P_P_Signal_IImpl.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_IImpl.addInterfaceRealization(MultipleDelegation_MultipleConnector_P_P_Signal_IImpl_IRealization);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_IImpl.addOwnedReception(MultipleDelegation_MultipleConnector_P_P_Signal_IImpl_S);
		// Class MultipleDelegation_MultipleConnector_P_P_Signal::AbstractTester
		addToElementRepository("AbstractTester", MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester);
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester.setName("AbstractTester");
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester.setIsAbstract(true);
		
		
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester.setIsActive(true);
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester.addOwnedOperation(MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_test);
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester.addOwnedReception(MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_Continue);
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester.addOwnedReception(MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_Start);
		// Class MultipleDelegation_MultipleConnector_P_P_Signal::Tester
		addToElementRepository("Tester", MultipleDelegation_MultipleConnector_P_P_Signal_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester.setName("Tester");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester.addGeneralization(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Generalization91);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester.setClassifierBehavior(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester.addOwnedBehavior(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester.addOwnedBehavior(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester.setIsActive(true);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester.addOwnedOperation(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester.addOwnedOperation(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_test);
		// Class MultipleDelegation_MultipleConnector_P_P_Signal::B
		addToElementRepository("B", MultipleDelegation_MultipleConnector_P_P_Signal_B);
		MultipleDelegation_MultipleConnector_P_P_Signal_B.setName("B");
		MultipleDelegation_MultipleConnector_P_P_Signal_B.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_B.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Signal_B_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_B.setClassifierBehavior(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior);
		MultipleDelegation_MultipleConnector_P_P_Signal_B.addOwnedBehavior(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior);
		MultipleDelegation_MultipleConnector_P_P_Signal_B.addInterfaceRealization(MultipleDelegation_MultipleConnector_P_P_Signal_B_IRealization);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_B.setIsActive(true);
		MultipleDelegation_MultipleConnector_P_P_Signal_B.addOwnedOperation(MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B);
		MultipleDelegation_MultipleConnector_P_P_Signal_B.addOwnedReception(MultipleDelegation_MultipleConnector_P_P_Signal_B_S);
	}

	private void initializeComment_Instances()
	{
		// Comment MultipleDelegation_MultipleConnector_P_P_Signal::Comment41
		addToElementRepository("Comment41", MultipleDelegation_MultipleConnector_P_P_Signal_Comment41);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment MultipleDelegation_MultipleConnector_P_P_Signal::Comment43
		addToElementRepository("Comment43", MultipleDelegation_MultipleConnector_P_P_Signal_Comment43);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector MultipleDelegation_MultipleConnector_P_P_Signal_A::r3
		addToElementRepository("r3", MultipleDelegation_MultipleConnector_P_P_Signal_A_r3);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r3.setName("r3");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r3.addEnd(MultipleDelegation_MultipleConnector_P_P_Signal_A_r3_ConnectorEnd72);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r3.addEnd(MultipleDelegation_MultipleConnector_P_P_Signal_A_r3_ConnectorEnd73);
		// Connector MultipleDelegation_MultipleConnector_P_P_Signal_A::r1
		addToElementRepository("r1", MultipleDelegation_MultipleConnector_P_P_Signal_A_r1);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1.setName("r1");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1.addEnd(MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd83);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1.addEnd(MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1.setType(MultipleDelegation_MultipleConnector_P_P_Signal_R);
		// Connector MultipleDelegation_MultipleConnector_P_P_Signal_A::r2
		addToElementRepository("r2", MultipleDelegation_MultipleConnector_P_P_Signal_A_r2);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r2.setName("r2");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r2.addEnd(MultipleDelegation_MultipleConnector_P_P_Signal_A_r2_ConnectorEnd85);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r2.addEnd(MultipleDelegation_MultipleConnector_P_P_Signal_A_r2_ConnectorEnd86);
		// Connector MultipleDelegation_MultipleConnector_P_P_Signal_A::r4
		addToElementRepository("r4", MultipleDelegation_MultipleConnector_P_P_Signal_A_r4);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r4.setName("r4");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r4.addEnd(MultipleDelegation_MultipleConnector_P_P_Signal_A_r4_ConnectorEnd89);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r4.addEnd(MultipleDelegation_MultipleConnector_P_P_Signal_A_r4_ConnectorEnd90);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r2::ConnectorEnd85
		addToElementRepository("ConnectorEnd85", MultipleDelegation_MultipleConnector_P_P_Signal_A_r2_ConnectorEnd85);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r2_ConnectorEnd85.setRole(MultipleDelegation_MultipleConnector_P_P_Signal_A_q);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r1::ConnectorEnd80
		addToElementRepository("ConnectorEnd80", MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80.setRole(MultipleDelegation_MultipleConnector_P_P_Signal_A_b1);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r3::ConnectorEnd73
		addToElementRepository("ConnectorEnd73", MultipleDelegation_MultipleConnector_P_P_Signal_A_r3_ConnectorEnd73);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r3_ConnectorEnd73.setRole(MultipleDelegation_MultipleConnector_P_P_Signal_A_b3);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r2::ConnectorEnd86
		addToElementRepository("ConnectorEnd86", MultipleDelegation_MultipleConnector_P_P_Signal_A_r2_ConnectorEnd86);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r2_ConnectorEnd86.setRole(MultipleDelegation_MultipleConnector_P_P_Signal_A_b2);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r3::ConnectorEnd72
		addToElementRepository("ConnectorEnd72", MultipleDelegation_MultipleConnector_P_P_Signal_A_r3_ConnectorEnd72);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r3_ConnectorEnd72.setRole(MultipleDelegation_MultipleConnector_P_P_Signal_A_q);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r4::ConnectorEnd90
		addToElementRepository("ConnectorEnd90", MultipleDelegation_MultipleConnector_P_P_Signal_A_r4_ConnectorEnd90);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r4_ConnectorEnd90.setRole(MultipleDelegation_MultipleConnector_P_P_Signal_A_b4);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r4::ConnectorEnd89
		addToElementRepository("ConnectorEnd89", MultipleDelegation_MultipleConnector_P_P_Signal_A_r4_ConnectorEnd89);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r4_ConnectorEnd89.setRole(MultipleDelegation_MultipleConnector_P_P_Signal_A_q);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Signal_A_r1::ConnectorEnd83
		addToElementRepository("ConnectorEnd83", MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd83);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd83.setRole(MultipleDelegation_MultipleConnector_P_P_Signal_A_q);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow167
		addToElementRepository("ControlFlow167", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow167);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow167.setName("ControlFlow167");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow167.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow167.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow167.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow205
		addToElementRepository("ControlFlow205", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow205);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow205.setName("ControlFlow205");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow205.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow205.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow205.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_main::ControlFlow49
		addToElementRepository("ControlFlow49", MultipleDelegation_MultipleConnector_P_P_Signal_main_ControlFlow49);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ControlFlow49.setName("ControlFlow49");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ControlFlow49.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ControlFlow49.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ControlFlow49.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ControlFlow98
		addToElementRepository("ControlFlow98", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow98);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow98.setName("ControlFlow98");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow98.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow98.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow98.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow179
		addToElementRepository("ControlFlow179", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow179);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow179.setName("ControlFlow179");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow179.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow179.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow179.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ControlFlow105
		addToElementRepository("ControlFlow105", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow105);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow105.setName("ControlFlow105");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow105.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow105.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow105.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow194
		addToElementRepository("ControlFlow194", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow194);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow194.setName("ControlFlow194");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow194.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow194.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow194.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow212
		addToElementRepository("ControlFlow212", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow212);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow212.setName("ControlFlow212");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow212.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow212.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow212.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ControlFlow114
		addToElementRepository("ControlFlow114", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow114);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow114.setName("ControlFlow114");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow114.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow114.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ControlFlow114.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::ControlFlow16
		addToElementRepository("ControlFlow16", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow16);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow16.setName("ControlFlow16");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow16.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow16.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow16.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow166
		addToElementRepository("ControlFlow166", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow166);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow166.setName("ControlFlow166");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow166.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow166.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow166.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction MultipleDelegation_MultipleConnector_P_P_Signal_main::Create Tester
		addToElementRepository("Create Tester", MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester.setName("Create Tester");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester.setClassifier(MultipleDelegation_MultipleConnector_P_P_Signal_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::Fork a
		addToElementRepository("Fork a", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Fork_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Fork_a.setName("Fork a");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Fork_a.setVisibility(VisibilityKind.public_);
		// ForkNode MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::Fork s
		addToElementRepository("Fork s", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Fork_s.setName("Fork s");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Fork_s.setVisibility(VisibilityKind.public_);
		// ForkNode MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::Fork this
		addToElementRepository("Fork this", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this.setName("Fork this");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this.setVisibility(VisibilityKind.public_);
		// ForkNode MultipleDelegation_MultipleConnector_P_P_Signal_main::Fork Tester
		addToElementRepository("Fork Tester", MultipleDelegation_MultipleConnector_P_P_Signal_main_Fork_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Fork_Tester.setName("Fork Tester");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Fork_Tester.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::testP
		addToElementRepository("testP", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP.setName("testP");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP.addOwnedParameter(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP.addLanguage("Java");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP.addLanguage("Import");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP.addBody("if(index == 1) 	{ 		System.out.println(\"Asserting a.b1.p == 4 && a.b2.p == 4 && a.b3.p == 4 && a.b4.p == 4\"); 	}  	// For some reason, during the first execution of the expansion region, its body is actually executed twice. 	// Because of that, the body is actually executaed 5 times in total. This if-statement covers that up until solved. 	if(index <= MAX_INDEX) 	{  		// Test parameter p 		int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 		Debug.println(\"[doBody] argument p = \" + p); 	 		System.out.println( \"a.b\" + index + \".p == \" + p); 		success = success && (p == 4);  		if(index == MAX_INDEX) 		{  			System.out.print(\"Signal delegated on all links (shall be true for default strategy): \");  			if(success) 			{ 				System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 			} 			else 			{ 				System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 			} 		} 	}  	index++;");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeGeneralization_Instances()
	{
		// Generalization MultipleDelegation_MultipleConnector_P_P_Signal_Tester::Generalization91
		addToElementRepository("Generalization91", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Generalization91);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Generalization91.setGeneral(MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_main_Send Start::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target.setName("target");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Tester);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b3::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object.setType(MultipleDelegation_MultipleConnector_P_P_Signal_A);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b2::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object.setType(MultipleDelegation_MultipleConnector_P_P_Signal_A);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read this.a::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Tester);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call test()::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target.setName("target");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Tester);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b4::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object.setType(MultipleDelegation_MultipleConnector_P_P_Signal_A);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send Continue::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target.setName("target");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target.setType(MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call testP::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p.setName("p");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v.setName("v");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b1::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object.setType(MultipleDelegation_MultipleConnector_P_P_Signal_A);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object.setType(MultipleDelegation_MultipleConnector_P_P_Signal_A);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester()::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target.setName("target");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Tester);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read b.p::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target.setName("target");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target.setType(MultipleDelegation_MultipleConnector_P_P_Signal_IImpl);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read s.t::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object.setVisibility(VisibilityKind.public_);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S::t
		addToElementRepository("t", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t.setName("t");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t.setType(MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read s.v::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object.setVisibility(VisibilityKind.public_);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_main_Start Tester::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object.setVisibility(VisibilityKind.public_);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set this.p::value
		addToElementRepository("value", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value.setName("value");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Tester);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set this.p::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
	}

	private void initializeInterface_Instances()
	{
		// Interface MultipleDelegation_MultipleConnector_P_P_Signal::I
		addToElementRepository("I", MultipleDelegation_MultipleConnector_P_P_Signal_I);
		MultipleDelegation_MultipleConnector_P_P_Signal_I.setName("I");
		MultipleDelegation_MultipleConnector_P_P_Signal_I.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_I.addOwnedReception(MultipleDelegation_MultipleConnector_P_P_Signal_I_S);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization MultipleDelegation_MultipleConnector_P_P_Signal_IImpl::IRealization
		addToElementRepository("IRealization", MultipleDelegation_MultipleConnector_P_P_Signal_IImpl_IRealization);
		MultipleDelegation_MultipleConnector_P_P_Signal_IImpl_IRealization.setName("IRealization");
		MultipleDelegation_MultipleConnector_P_P_Signal_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_IImpl_IRealization.setContract(MultipleDelegation_MultipleConnector_P_P_Signal_I);
		// InterfaceRealization MultipleDelegation_MultipleConnector_P_P_Signal_B::IRealization
		addToElementRepository("IRealization", MultipleDelegation_MultipleConnector_P_P_Signal_B_IRealization);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_IRealization.setName("IRealization");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_IRealization.setContract(MultipleDelegation_MultipleConnector_P_P_Signal_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195::LiteralBoolean197
		addToElementRepository("LiteralBoolean197", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195_LiteralBoolean197);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195_LiteralBoolean197.setName("LiteralBoolean197");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195_LiteralBoolean197.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195_LiteralBoolean197.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57::LiteralBoolean59
		addToElementRepository("LiteralBoolean59", MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57_LiteralBoolean59);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57_LiteralBoolean59.setName("LiteralBoolean59");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57_LiteralBoolean59.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57_LiteralBoolean59.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136::LiteralBoolean138
		addToElementRepository("LiteralBoolean138", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136_LiteralBoolean138);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136_LiteralBoolean138.setName("LiteralBoolean138");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136_LiteralBoolean138.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136_LiteralBoolean138.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168::LiteralBoolean170
		addToElementRepository("LiteralBoolean170", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168_LiteralBoolean170);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168_LiteralBoolean170.setName("LiteralBoolean170");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168_LiteralBoolean170.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168_LiteralBoolean170.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133::LiteralBoolean135
		addToElementRepository("LiteralBoolean135", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133_LiteralBoolean135);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133_LiteralBoolean135.setName("LiteralBoolean135");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133_LiteralBoolean135.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133_LiteralBoolean135.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20::LiteralBoolean22
		addToElementRepository("LiteralBoolean22", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralBoolean22);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralBoolean22.setName("LiteralBoolean22");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralBoolean22.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralBoolean22.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155::LiteralBoolean156
		addToElementRepository("LiteralBoolean156", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155_LiteralBoolean156);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155_LiteralBoolean156.setName("LiteralBoolean156");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155_LiteralBoolean156.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155_LiteralBoolean156.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23::LiteralBoolean24
		addToElementRepository("LiteralBoolean24", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralBoolean24);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralBoolean24.setName("LiteralBoolean24");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralBoolean24.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralBoolean24.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65::LiteralBoolean66
		addToElementRepository("LiteralBoolean66", MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65_LiteralBoolean66);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65_LiteralBoolean66.setName("LiteralBoolean66");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65_LiteralBoolean66.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65_LiteralBoolean66.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13::LiteralBoolean14
		addToElementRepository("LiteralBoolean14", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13_LiteralBoolean14);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13_LiteralBoolean14.setName("LiteralBoolean14");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13_LiteralBoolean14.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13_LiteralBoolean14.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44::LiteralBoolean46
		addToElementRepository("LiteralBoolean46", MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44_LiteralBoolean46);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44_LiteralBoolean46.setName("LiteralBoolean46");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44_LiteralBoolean46.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44_LiteralBoolean46.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32::LiteralBoolean34
		addToElementRepository("LiteralBoolean34", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32_LiteralBoolean34);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32_LiteralBoolean34.setName("LiteralBoolean34");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32_LiteralBoolean34.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32_LiteralBoolean34.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122::LiteralBoolean124
		addToElementRepository("LiteralBoolean124", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122_LiteralBoolean124);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122_LiteralBoolean124.setName("LiteralBoolean124");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122_LiteralBoolean124.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122_LiteralBoolean124.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95::LiteralBoolean96
		addToElementRepository("LiteralBoolean96", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95_LiteralBoolean96);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95_LiteralBoolean96.setName("LiteralBoolean96");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95_LiteralBoolean96.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95_LiteralBoolean96.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213::LiteralBoolean214
		addToElementRepository("LiteralBoolean214", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213_LiteralBoolean214);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213_LiteralBoolean214.setName("LiteralBoolean214");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213_LiteralBoolean214.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213_LiteralBoolean214.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17::LiteralBoolean18
		addToElementRepository("LiteralBoolean18", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralBoolean18);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralBoolean18.setName("LiteralBoolean18");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralBoolean18.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralBoolean18.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119::LiteralBoolean121
		addToElementRepository("LiteralBoolean121", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralBoolean121);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralBoolean121.setName("LiteralBoolean121");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralBoolean121.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralBoolean121.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184::LiteralBoolean185
		addToElementRepository("LiteralBoolean185", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184_LiteralBoolean185);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184_LiteralBoolean185.setName("LiteralBoolean185");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184_LiteralBoolean185.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184_LiteralBoolean185.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130::LiteralBoolean131
		addToElementRepository("LiteralBoolean131", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130_LiteralBoolean131);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130_LiteralBoolean131.setName("LiteralBoolean131");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130_LiteralBoolean131.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130_LiteralBoolean131.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102::LiteralBoolean103
		addToElementRepository("LiteralBoolean103", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102_LiteralBoolean103);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102_LiteralBoolean103.setName("LiteralBoolean103");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102_LiteralBoolean103.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102_LiteralBoolean103.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198::LiteralBoolean199
		addToElementRepository("LiteralBoolean199", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198_LiteralBoolean199);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198_LiteralBoolean199.setName("LiteralBoolean199");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198_LiteralBoolean199.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198_LiteralBoolean199.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10::LiteralBoolean11
		addToElementRepository("LiteralBoolean11", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralBoolean11);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralBoolean11.setName("LiteralBoolean11");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralBoolean11.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralBoolean11.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145::LiteralBoolean146
		addToElementRepository("LiteralBoolean146", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145_LiteralBoolean146);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145_LiteralBoolean146.setName("LiteralBoolean146");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145_LiteralBoolean146.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145_LiteralBoolean146.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92::LiteralBoolean94
		addToElementRepository("LiteralBoolean94", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92_LiteralBoolean94);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92_LiteralBoolean94.setName("LiteralBoolean94");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92_LiteralBoolean94.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92_LiteralBoolean94.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216::LiteralBoolean218
		addToElementRepository("LiteralBoolean218", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216_LiteralBoolean218);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216_LiteralBoolean218.setName("LiteralBoolean218");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216_LiteralBoolean218.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216_LiteralBoolean218.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127::LiteralBoolean129
		addToElementRepository("LiteralBoolean129", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127_LiteralBoolean129);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127_LiteralBoolean129.setName("LiteralBoolean129");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127_LiteralBoolean129.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127_LiteralBoolean129.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54::LiteralBoolean56
		addToElementRepository("LiteralBoolean56", MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54_LiteralBoolean56);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54_LiteralBoolean56.setName("LiteralBoolean56");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54_LiteralBoolean56.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54_LiteralBoolean56.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99::LiteralBoolean101
		addToElementRepository("LiteralBoolean101", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean101);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean101.setName("LiteralBoolean101");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean101.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean101.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value(4)_result::LiteralInteger189
		addToElementRepository("LiteralInteger189", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger189);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger189.setName("LiteralInteger189");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger189.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger189.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_R_y::LiteralInteger70
		addToElementRepository("LiteralInteger70", MultipleDelegation_MultipleConnector_P_P_Signal_R_y_LiteralInteger70);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_y_LiteralInteger70.setName("LiteralInteger70");
		MultipleDelegation_MultipleConnector_P_P_Signal_R_y_LiteralInteger70.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_y_LiteralInteger70.setValue(0);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195::LiteralInteger196
		addToElementRepository("LiteralInteger196", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195_LiteralInteger196);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195_LiteralInteger196.setName("LiteralInteger196");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195_LiteralInteger196.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195_LiteralInteger196.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95::LiteralInteger97
		addToElementRepository("LiteralInteger97", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95_LiteralInteger97);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95_LiteralInteger97.setName("LiteralInteger97");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95_LiteralInteger97.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95_LiteralInteger97.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_Start Tester_object::LiteralInteger50
		addToElementRepository("LiteralInteger50", MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object_LiteralInteger50);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object_LiteralInteger50.setName("LiteralInteger50");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object_LiteralInteger50.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object_LiteralInteger50.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20::LiteralInteger21
		addToElementRepository("LiteralInteger21", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralInteger21);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralInteger21.setName("LiteralInteger21");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralInteger21.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralInteger21.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_3_result::LiteralInteger220
		addToElementRepository("LiteralInteger220", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger220);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger220.setName("LiteralInteger220");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger220.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger220.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_A_b1::LiteralInteger77
		addToElementRepository("LiteralInteger77", MultipleDelegation_MultipleConnector_P_P_Signal_A_b1_LiteralInteger77);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b1_LiteralInteger77.setName("LiteralInteger77");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b1_LiteralInteger77.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b1_LiteralInteger77.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44::LiteralInteger45
		addToElementRepository("LiteralInteger45", MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44_LiteralInteger45);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44_LiteralInteger45.setName("LiteralInteger45");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44_LiteralInteger45.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44_LiteralInteger45.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80::LiteralInteger81
		addToElementRepository("LiteralInteger81", MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80_LiteralInteger81);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80_LiteralInteger81.setName("LiteralInteger81");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80_LiteralInteger81.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80_LiteralInteger81.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read s.v_result::LiteralInteger26
		addToElementRepository("LiteralInteger26", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger26);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger26.setName("LiteralInteger26");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger26.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger26.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b2_object::LiteralInteger115
		addToElementRepository("LiteralInteger115", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object_LiteralInteger115);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object_LiteralInteger115.setName("LiteralInteger115");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object_LiteralInteger115.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object_LiteralInteger115.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result::LiteralInteger192
		addToElementRepository("LiteralInteger192", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger192);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger192.setName("LiteralInteger192");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger192.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger192.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102::LiteralInteger104
		addToElementRepository("LiteralInteger104", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102_LiteralInteger104);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102_LiteralInteger104.setName("LiteralInteger104");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102_LiteralInteger104.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102_LiteralInteger104.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32::LiteralInteger33
		addToElementRepository("LiteralInteger33", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32_LiteralInteger33);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32_LiteralInteger33.setName("LiteralInteger33");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32_LiteralInteger33.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32_LiteralInteger33.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130::LiteralInteger132
		addToElementRepository("LiteralInteger132", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130_LiteralInteger132);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130_LiteralInteger132.setName("LiteralInteger132");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130_LiteralInteger132.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130_LiteralInteger132.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call testP_p::LiteralInteger149
		addToElementRepository("LiteralInteger149", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger149);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger149.setName("LiteralInteger149");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger149.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger149.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23::LiteralInteger25
		addToElementRepository("LiteralInteger25", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralInteger25);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralInteger25.setName("LiteralInteger25");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralInteger25.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralInteger25.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send Continue_target::LiteralInteger36
		addToElementRepository("LiteralInteger36", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger36);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger36.setName("LiteralInteger36");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger36.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger36.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_1_result::LiteralInteger163
		addToElementRepository("LiteralInteger163", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger163);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger163.setName("LiteralInteger163");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger163.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger163.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call testP_p::LiteralInteger148
		addToElementRepository("LiteralInteger148", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger148);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger148.setName("LiteralInteger148");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger148.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger148.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S_v::LiteralInteger209
		addToElementRepository("LiteralInteger209", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger209);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger209.setName("LiteralInteger209");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger209.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger209.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester()_target::LiteralInteger60
		addToElementRepository("LiteralInteger60", MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target_LiteralInteger60);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target_LiteralInteger60.setName("LiteralInteger60");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target_LiteralInteger60.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target_LiteralInteger60.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b2_result::LiteralInteger117
		addToElementRepository("LiteralInteger117", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result_LiteralInteger117);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result_LiteralInteger117.setName("LiteralInteger117");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result_LiteralInteger117.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result_LiteralInteger117.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119::LiteralInteger120
		addToElementRepository("LiteralInteger120", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralInteger120);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralInteger120.setName("LiteralInteger120");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralInteger120.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralInteger120.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168::LiteralInteger169
		addToElementRepository("LiteralInteger169", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168_LiteralInteger169);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168_LiteralInteger169.setName("LiteralInteger169");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168_LiteralInteger169.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168_LiteralInteger169.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b4_object::LiteralInteger111
		addToElementRepository("LiteralInteger111", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object_LiteralInteger111);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object_LiteralInteger111.setName("LiteralInteger111");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object_LiteralInteger111.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object_LiteralInteger111.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q_object::LiteralInteger201
		addToElementRepository("LiteralInteger201", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger201);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger201.setName("LiteralInteger201");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger201.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger201.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_R_x::LiteralInteger68
		addToElementRepository("LiteralInteger68", MultipleDelegation_MultipleConnector_P_P_Signal_R_x_LiteralInteger68);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_x_LiteralInteger68.setName("LiteralInteger68");
		MultipleDelegation_MultipleConnector_P_P_Signal_R_x_LiteralInteger68.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_x_LiteralInteger68.setValue(0);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136::LiteralInteger137
		addToElementRepository("LiteralInteger137", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136_LiteralInteger137);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136_LiteralInteger137.setName("LiteralInteger137");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136_LiteralInteger137.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136_LiteralInteger137.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester()_result::LiteralInteger63
		addToElementRepository("LiteralInteger63", MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralInteger63);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralInteger63.setName("LiteralInteger63");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralInteger63.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralInteger63.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_1_result::LiteralInteger164
		addToElementRepository("LiteralInteger164", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger164);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger164.setName("LiteralInteger164");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger164.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger164.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127::LiteralInteger128
		addToElementRepository("LiteralInteger128", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127_LiteralInteger128);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127_LiteralInteger128.setName("LiteralInteger128");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127_LiteralInteger128.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127_LiteralInteger128.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_A_b2::LiteralInteger75
		addToElementRepository("LiteralInteger75", MultipleDelegation_MultipleConnector_P_P_Signal_A_b2_LiteralInteger75);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b2_LiteralInteger75.setName("LiteralInteger75");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b2_LiteralInteger75.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b2_LiteralInteger75.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read b.p_result::LiteralInteger141
		addToElementRepository("LiteralInteger141", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger141);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger141.setName("LiteralInteger141");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger141.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger141.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65::LiteralInteger67
		addToElementRepository("LiteralInteger67", MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65_LiteralInteger67);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65_LiteralInteger67.setName("LiteralInteger67");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65_LiteralInteger67.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65_LiteralInteger67.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b3_result::LiteralInteger154
		addToElementRepository("LiteralInteger154", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result_LiteralInteger154);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result_LiteralInteger154.setName("LiteralInteger154");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result_LiteralInteger154.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result_LiteralInteger154.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read this.a_result::LiteralInteger109
		addToElementRepository("LiteralInteger109", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger109);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger109.setName("LiteralInteger109");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger109.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger109.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198::LiteralInteger200
		addToElementRepository("LiteralInteger200", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198_LiteralInteger200);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198_LiteralInteger200.setName("LiteralInteger200");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198_LiteralInteger200.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198_LiteralInteger200.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145::LiteralInteger147
		addToElementRepository("LiteralInteger147", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145_LiteralInteger147);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145_LiteralInteger147.setName("LiteralInteger147");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145_LiteralInteger147.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145_LiteralInteger147.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result::LiteralInteger144
		addToElementRepository("LiteralInteger144", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result_LiteralInteger144);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result_LiteralInteger144.setName("LiteralInteger144");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result_LiteralInteger144.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result_LiteralInteger144.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set this.p_object::LiteralInteger9
		addToElementRepository("LiteralInteger9", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger9);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger9.setName("LiteralInteger9");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger9.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger9.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester()_result::LiteralInteger62
		addToElementRepository("LiteralInteger62", MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralInteger62);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralInteger62.setName("LiteralInteger62");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralInteger62.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralInteger62.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read b.p_object::LiteralInteger140
		addToElementRepository("LiteralInteger140", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger140);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger140.setName("LiteralInteger140");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger140.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger140.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read s.t_result::LiteralInteger39
		addToElementRepository("LiteralInteger39", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger39);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger39.setName("LiteralInteger39");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger39.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger39.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b3_object::LiteralInteger151
		addToElementRepository("LiteralInteger151", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object_LiteralInteger151);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object_LiteralInteger151.setName("LiteralInteger151");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object_LiteralInteger151.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object_LiteralInteger151.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_4_result::LiteralInteger173
		addToElementRepository("LiteralInteger173", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger173);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger173.setName("LiteralInteger173");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger173.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger173.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read s.t_object::LiteralInteger38
		addToElementRepository("LiteralInteger38", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger38);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger38.setName("LiteralInteger38");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger38.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger38.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a_object::LiteralInteger182
		addToElementRepository("LiteralInteger182", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger182);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger182.setName("LiteralInteger182");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger182.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger182.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_Send Start_target::LiteralInteger48
		addToElementRepository("LiteralInteger48", MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target_LiteralInteger48);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target_LiteralInteger48.setName("LiteralInteger48");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target_LiteralInteger48.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target_LiteralInteger48.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call test()_target::LiteralInteger188
		addToElementRepository("LiteralInteger188", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger188);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger188.setName("LiteralInteger188");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger188.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger188.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept S_s::LiteralInteger2
		addToElementRepository("LiteralInteger2", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger2);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger2.setName("LiteralInteger2");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger2.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17::LiteralInteger19
		addToElementRepository("LiteralInteger19", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralInteger19);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralInteger19.setName("LiteralInteger19");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralInteger19.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralInteger19.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213::LiteralInteger215
		addToElementRepository("LiteralInteger215", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213_LiteralInteger215);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213_LiteralInteger215.setName("LiteralInteger215");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213_LiteralInteger215.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213_LiteralInteger215.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_4_result::LiteralInteger174
		addToElementRepository("LiteralInteger174", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger174);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger174.setName("LiteralInteger174");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger174.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger174.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S_t::LiteralInteger211
		addToElementRepository("LiteralInteger211", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger211);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger211.setName("LiteralInteger211");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger211.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger211.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10::LiteralInteger12
		addToElementRepository("LiteralInteger12", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralInteger12);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralInteger12.setName("LiteralInteger12");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralInteger12.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralInteger12.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_Create Tester_result::LiteralInteger53
		addToElementRepository("LiteralInteger53", MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result_LiteralInteger53);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result_LiteralInteger53.setName("LiteralInteger53");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result_LiteralInteger53.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result_LiteralInteger53.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set this.p_value::LiteralInteger4
		addToElementRepository("LiteralInteger4", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger4);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger4.setName("LiteralInteger4");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger4.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read s.v_object::LiteralInteger28
		addToElementRepository("LiteralInteger28", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger28);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger28.setName("LiteralInteger28");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger28.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger28.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q_result::LiteralInteger204
		addToElementRepository("LiteralInteger204", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger204);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger204.setName("LiteralInteger204");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger204.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger204.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result::LiteralInteger30
		addToElementRepository("LiteralInteger30", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger30);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger30.setName("LiteralInteger30");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger30.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger30.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57::LiteralInteger58
		addToElementRepository("LiteralInteger58", MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57_LiteralInteger58);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57_LiteralInteger58.setName("LiteralInteger58");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57_LiteralInteger58.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57_LiteralInteger58.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value(4)::LiteralInteger191
		addToElementRepository("LiteralInteger191", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger191);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger191.setName("LiteralInteger191");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger191.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger191.setValue(4);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92::LiteralInteger93
		addToElementRepository("LiteralInteger93", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92_LiteralInteger93);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92_LiteralInteger93.setName("LiteralInteger93");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92_LiteralInteger93.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92_LiteralInteger93.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b1_object::LiteralInteger126
		addToElementRepository("LiteralInteger126", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object_LiteralInteger126);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object_LiteralInteger126.setName("LiteralInteger126");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object_LiteralInteger126.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object_LiteralInteger126.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13::LiteralInteger15
		addToElementRepository("LiteralInteger15", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13_LiteralInteger15);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13_LiteralInteger15.setName("LiteralInteger15");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13_LiteralInteger15.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13_LiteralInteger15.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralInteger160
		addToElementRepository("LiteralInteger160", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger160);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger160.setName("LiteralInteger160");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger160.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger160.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read this.a_object::LiteralInteger107
		addToElementRepository("LiteralInteger107", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger107);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger107.setName("LiteralInteger107");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger107.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger107.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54::LiteralInteger55
		addToElementRepository("LiteralInteger55", MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54_LiteralInteger55);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54_LiteralInteger55.setName("LiteralInteger55");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54_LiteralInteger55.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54_LiteralInteger55.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216::LiteralInteger217
		addToElementRepository("LiteralInteger217", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216_LiteralInteger217);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216_LiteralInteger217.setName("LiteralInteger217");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216_LiteralInteger217.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216_LiteralInteger217.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_2_result::LiteralInteger176
		addToElementRepository("LiteralInteger176", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger176);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger176.setName("LiteralInteger176");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger176.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger176.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_A_b3::LiteralInteger78
		addToElementRepository("LiteralInteger78", MultipleDelegation_MultipleConnector_P_P_Signal_A_b3_LiteralInteger78);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b3_LiteralInteger78.setName("LiteralInteger78");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b3_LiteralInteger78.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b3_LiteralInteger78.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S_target::LiteralInteger207
		addToElementRepository("LiteralInteger207", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger207);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger207.setName("LiteralInteger207");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger207.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger207.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_3_result::LiteralInteger219
		addToElementRepository("LiteralInteger219", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger219);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger219.setName("LiteralInteger219");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger219.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger219.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133::LiteralInteger134
		addToElementRepository("LiteralInteger134", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133_LiteralInteger134);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133_LiteralInteger134.setName("LiteralInteger134");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133_LiteralInteger134.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133_LiteralInteger134.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184::LiteralInteger186
		addToElementRepository("LiteralInteger186", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184_LiteralInteger186);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184_LiteralInteger186.setName("LiteralInteger186");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184_LiteralInteger186.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184_LiteralInteger186.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99::LiteralInteger100
		addToElementRepository("LiteralInteger100", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger100);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger100.setName("LiteralInteger100");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger100.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralInteger100.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a_result::LiteralInteger180
		addToElementRepository("LiteralInteger180", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger180);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger180.setName("LiteralInteger180");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger180.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger180.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_A_b4::LiteralInteger88
		addToElementRepository("LiteralInteger88", MultipleDelegation_MultipleConnector_P_P_Signal_A_b4_LiteralInteger88);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b4_LiteralInteger88.setName("LiteralInteger88");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b4_LiteralInteger88.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b4_LiteralInteger88.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122::LiteralInteger123
		addToElementRepository("LiteralInteger123", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122_LiteralInteger123);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122_LiteralInteger123.setName("LiteralInteger123");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122_LiteralInteger123.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122_LiteralInteger123.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept S_s::LiteralInteger3
		addToElementRepository("LiteralInteger3", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger3);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger3.setName("LiteralInteger3");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger3.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralInteger159
		addToElementRepository("LiteralInteger159", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger159);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger159.setName("LiteralInteger159");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger159.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger159.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b4_result::LiteralInteger112
		addToElementRepository("LiteralInteger112", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result_LiteralInteger112);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result_LiteralInteger112.setName("LiteralInteger112");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result_LiteralInteger112.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result_LiteralInteger112.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155::LiteralInteger157
		addToElementRepository("LiteralInteger157", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155_LiteralInteger157);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155_LiteralInteger157.setName("LiteralInteger157");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155_LiteralInteger157.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155_LiteralInteger157.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set this.p_result::LiteralInteger7
		addToElementRepository("LiteralInteger7", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger7);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger7.setName("LiteralInteger7");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger7.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger7.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_2_result::LiteralInteger177
		addToElementRepository("LiteralInteger177", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger177);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger177.setName("LiteralInteger177");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger177.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger177.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call test()_target::LiteralUnlimitedNatural187
		addToElementRepository("LiteralUnlimitedNatural187", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural187);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural187.setName("LiteralUnlimitedNatural187");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural187.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural187.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_4_result::LiteralUnlimitedNatural172
		addToElementRepository("LiteralUnlimitedNatural172", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural172);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural172.setName("LiteralUnlimitedNatural172");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural172.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural172.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set this.p_object::LiteralUnlimitedNatural8
		addToElementRepository("LiteralUnlimitedNatural8", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural8);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural8.setName("LiteralUnlimitedNatural8");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural8.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural8.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b3_result::LiteralUnlimitedNatural153
		addToElementRepository("LiteralUnlimitedNatural153", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result_LiteralUnlimitedNatural153);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result_LiteralUnlimitedNatural153.setName("LiteralUnlimitedNatural153");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result_LiteralUnlimitedNatural153.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result_LiteralUnlimitedNatural153.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result::LiteralUnlimitedNatural143
		addToElementRepository("LiteralUnlimitedNatural143", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural143);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural143.setName("LiteralUnlimitedNatural143");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural143.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural143.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read this.a_result::LiteralUnlimitedNatural108
		addToElementRepository("LiteralUnlimitedNatural108", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural108);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural108.setName("LiteralUnlimitedNatural108");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural108.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural108.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read b.p_result::LiteralUnlimitedNatural142
		addToElementRepository("LiteralUnlimitedNatural142", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural142);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural142.setName("LiteralUnlimitedNatural142");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural142.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural142.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b2_result::LiteralUnlimitedNatural118
		addToElementRepository("LiteralUnlimitedNatural118", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result_LiteralUnlimitedNatural118);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result_LiteralUnlimitedNatural118.setName("LiteralUnlimitedNatural118");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result_LiteralUnlimitedNatural118.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result_LiteralUnlimitedNatural118.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_A_b2::LiteralUnlimitedNatural74
		addToElementRepository("LiteralUnlimitedNatural74", MultipleDelegation_MultipleConnector_P_P_Signal_A_b2_LiteralUnlimitedNatural74);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b2_LiteralUnlimitedNatural74.setName("LiteralUnlimitedNatural74");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b2_LiteralUnlimitedNatural74.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b2_LiteralUnlimitedNatural74.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q_object::LiteralUnlimitedNatural202
		addToElementRepository("LiteralUnlimitedNatural202", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural202);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural202.setName("LiteralUnlimitedNatural202");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural202.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural202.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value(4)_result::LiteralUnlimitedNatural190
		addToElementRepository("LiteralUnlimitedNatural190", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural190);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural190.setName("LiteralUnlimitedNatural190");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural190.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural190.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b4_result::LiteralUnlimitedNatural113
		addToElementRepository("LiteralUnlimitedNatural113", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result_LiteralUnlimitedNatural113);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result_LiteralUnlimitedNatural113.setName("LiteralUnlimitedNatural113");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result_LiteralUnlimitedNatural113.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result_LiteralUnlimitedNatural113.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b3_object::LiteralUnlimitedNatural152
		addToElementRepository("LiteralUnlimitedNatural152", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object_LiteralUnlimitedNatural152);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object_LiteralUnlimitedNatural152.setName("LiteralUnlimitedNatural152");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object_LiteralUnlimitedNatural152.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object_LiteralUnlimitedNatural152.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a_object::LiteralUnlimitedNatural183
		addToElementRepository("LiteralUnlimitedNatural183", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural183);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural183.setName("LiteralUnlimitedNatural183");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural183.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural183.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q_result::LiteralUnlimitedNatural203
		addToElementRepository("LiteralUnlimitedNatural203", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural203);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural203.setName("LiteralUnlimitedNatural203");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural203.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural203.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S_t::LiteralUnlimitedNatural210
		addToElementRepository("LiteralUnlimitedNatural210", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural210);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural210.setName("LiteralUnlimitedNatural210");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural210.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural210.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read s.t_result::LiteralUnlimitedNatural40
		addToElementRepository("LiteralUnlimitedNatural40", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural40);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural40.setName("LiteralUnlimitedNatural40");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural40.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural40.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_main_Start Tester_object::LiteralUnlimitedNatural51
		addToElementRepository("LiteralUnlimitedNatural51", MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural51);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural51.setName("LiteralUnlimitedNatural51");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural51.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural51.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralUnlimitedNatural158
		addToElementRepository("LiteralUnlimitedNatural158", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural158);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural158.setName("LiteralUnlimitedNatural158");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural158.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural158.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a_result::LiteralUnlimitedNatural181
		addToElementRepository("LiteralUnlimitedNatural181", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural181);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural181.setName("LiteralUnlimitedNatural181");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural181.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural181.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S_target::LiteralUnlimitedNatural206
		addToElementRepository("LiteralUnlimitedNatural206", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural206);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural206.setName("LiteralUnlimitedNatural206");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural206.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural206.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_A_b4::LiteralUnlimitedNatural87
		addToElementRepository("LiteralUnlimitedNatural87", MultipleDelegation_MultipleConnector_P_P_Signal_A_b4_LiteralUnlimitedNatural87);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b4_LiteralUnlimitedNatural87.setName("LiteralUnlimitedNatural87");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b4_LiteralUnlimitedNatural87.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b4_LiteralUnlimitedNatural87.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read s.v_object::LiteralUnlimitedNatural29
		addToElementRepository("LiteralUnlimitedNatural29", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural29);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural29.setName("LiteralUnlimitedNatural29");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural29.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural29.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester()_target::LiteralUnlimitedNatural61
		addToElementRepository("LiteralUnlimitedNatural61", MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural61);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural61.setName("LiteralUnlimitedNatural61");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural61.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural61.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result::LiteralUnlimitedNatural31
		addToElementRepository("LiteralUnlimitedNatural31", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural31);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural31.setName("LiteralUnlimitedNatural31");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural31.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural31.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set this.p_result::LiteralUnlimitedNatural6
		addToElementRepository("LiteralUnlimitedNatural6", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural6);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural6.setName("LiteralUnlimitedNatural6");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural6.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural6.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_3_result::LiteralUnlimitedNatural221
		addToElementRepository("LiteralUnlimitedNatural221", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural221);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural221.setName("LiteralUnlimitedNatural221");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural221.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural221.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b1_object::LiteralUnlimitedNatural125
		addToElementRepository("LiteralUnlimitedNatural125", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object_LiteralUnlimitedNatural125);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object_LiteralUnlimitedNatural125.setName("LiteralUnlimitedNatural125");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object_LiteralUnlimitedNatural125.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object_LiteralUnlimitedNatural125.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read s.t_object::LiteralUnlimitedNatural37
		addToElementRepository("LiteralUnlimitedNatural37", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural37);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural37.setName("LiteralUnlimitedNatural37");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural37.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural37.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_2_result::LiteralUnlimitedNatural175
		addToElementRepository("LiteralUnlimitedNatural175", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural175);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural175.setName("LiteralUnlimitedNatural175");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural175.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural175.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_A_b3::LiteralUnlimitedNatural79
		addToElementRepository("LiteralUnlimitedNatural79", MultipleDelegation_MultipleConnector_P_P_Signal_A_b3_LiteralUnlimitedNatural79);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b3_LiteralUnlimitedNatural79.setName("LiteralUnlimitedNatural79");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b3_LiteralUnlimitedNatural79.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b3_LiteralUnlimitedNatural79.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call testP_p::LiteralUnlimitedNatural150
		addToElementRepository("LiteralUnlimitedNatural150", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural150);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural150.setName("LiteralUnlimitedNatural150");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural150.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural150.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_R_y::LiteralUnlimitedNatural71
		addToElementRepository("LiteralUnlimitedNatural71", MultipleDelegation_MultipleConnector_P_P_Signal_R_y_LiteralUnlimitedNatural71);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_y_LiteralUnlimitedNatural71.setName("LiteralUnlimitedNatural71");
		MultipleDelegation_MultipleConnector_P_P_Signal_R_y_LiteralUnlimitedNatural71.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_y_LiteralUnlimitedNatural71.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd83::LiteralUnlimitedNatural84
		addToElementRepository("LiteralUnlimitedNatural84", MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd83_LiteralUnlimitedNatural84);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd83_LiteralUnlimitedNatural84.setName("LiteralUnlimitedNatural84");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd83_LiteralUnlimitedNatural84.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd83_LiteralUnlimitedNatural84.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b4_object::LiteralUnlimitedNatural110
		addToElementRepository("LiteralUnlimitedNatural110", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object_LiteralUnlimitedNatural110);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object_LiteralUnlimitedNatural110.setName("LiteralUnlimitedNatural110");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object_LiteralUnlimitedNatural110.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object_LiteralUnlimitedNatural110.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read this.a_object::LiteralUnlimitedNatural106
		addToElementRepository("LiteralUnlimitedNatural106", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural106);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural106.setName("LiteralUnlimitedNatural106");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural106.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural106.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_A_b1::LiteralUnlimitedNatural76
		addToElementRepository("LiteralUnlimitedNatural76", MultipleDelegation_MultipleConnector_P_P_Signal_A_b1_LiteralUnlimitedNatural76);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b1_LiteralUnlimitedNatural76.setName("LiteralUnlimitedNatural76");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b1_LiteralUnlimitedNatural76.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b1_LiteralUnlimitedNatural76.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept S_s::LiteralUnlimitedNatural1
		addToElementRepository("LiteralUnlimitedNatural1", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural1);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural1.setName("LiteralUnlimitedNatural1");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural1.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_main_Send Start_target::LiteralUnlimitedNatural47
		addToElementRepository("LiteralUnlimitedNatural47", MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural47);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural47.setName("LiteralUnlimitedNatural47");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural47.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural47.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read s.v_result::LiteralUnlimitedNatural27
		addToElementRepository("LiteralUnlimitedNatural27", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural27);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural27.setName("LiteralUnlimitedNatural27");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural27.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural27.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_R_x::LiteralUnlimitedNatural69
		addToElementRepository("LiteralUnlimitedNatural69", MultipleDelegation_MultipleConnector_P_P_Signal_R_x_LiteralUnlimitedNatural69);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_x_LiteralUnlimitedNatural69.setName("LiteralUnlimitedNatural69");
		MultipleDelegation_MultipleConnector_P_P_Signal_R_x_LiteralUnlimitedNatural69.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_x_LiteralUnlimitedNatural69.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester()_result::LiteralUnlimitedNatural64
		addToElementRepository("LiteralUnlimitedNatural64", MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural64);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural64.setName("LiteralUnlimitedNatural64");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural64.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural64.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80::LiteralUnlimitedNatural82
		addToElementRepository("LiteralUnlimitedNatural82", MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80_LiteralUnlimitedNatural82);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80_LiteralUnlimitedNatural82.setName("LiteralUnlimitedNatural82");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80_LiteralUnlimitedNatural82.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_r1_ConnectorEnd80_LiteralUnlimitedNatural82.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set this.p_value::LiteralUnlimitedNatural5
		addToElementRepository("LiteralUnlimitedNatural5", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural5);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural5.setName("LiteralUnlimitedNatural5");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural5.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural5.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read b.p_object::LiteralUnlimitedNatural139
		addToElementRepository("LiteralUnlimitedNatural139", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural139);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural139.setName("LiteralUnlimitedNatural139");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural139.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural139.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S_v::LiteralUnlimitedNatural208
		addToElementRepository("LiteralUnlimitedNatural208", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural208);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural208.setName("LiteralUnlimitedNatural208");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural208.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural208.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send Continue_target::LiteralUnlimitedNatural35
		addToElementRepository("LiteralUnlimitedNatural35", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural35);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural35.setName("LiteralUnlimitedNatural35");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural35.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural35.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b2_object::LiteralUnlimitedNatural116
		addToElementRepository("LiteralUnlimitedNatural116", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object_LiteralUnlimitedNatural116);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object_LiteralUnlimitedNatural116.setName("LiteralUnlimitedNatural116");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object_LiteralUnlimitedNatural116.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object_LiteralUnlimitedNatural116.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result::LiteralUnlimitedNatural193
		addToElementRepository("LiteralUnlimitedNatural193", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural193);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural193.setName("LiteralUnlimitedNatural193");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural193.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural193.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_1_result::LiteralUnlimitedNatural165
		addToElementRepository("LiteralUnlimitedNatural165", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural165);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural165.setName("LiteralUnlimitedNatural165");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural165.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural165.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Signal_main_Create Tester_result::LiteralUnlimitedNatural52
		addToElementRepository("LiteralUnlimitedNatural52", MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural52);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural52.setName("LiteralUnlimitedNatural52");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural52.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural52.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow155
		addToElementRepository("ObjectFlow155", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155.setName("ObjectFlow155");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow155_LiteralBoolean156);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_main::ObjectFlow54
		addToElementRepository("ObjectFlow54", MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54.setName("ObjectFlow54");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__target);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow54_LiteralBoolean56);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::ObjectFlow17
		addToElementRepository("ObjectFlow17", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17.setName("ObjectFlow17");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow17_LiteralBoolean18);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_main::ObjectFlow44
		addToElementRepository("ObjectFlow44", MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44.setName("ObjectFlow44");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_main_Fork_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow44_LiteralBoolean46);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::ObjectFlow23
		addToElementRepository("ObjectFlow23", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23.setName("ObjectFlow23");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow23_LiteralBoolean24);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow168
		addToElementRepository("ObjectFlow168", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168.setName("ObjectFlow168");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow168_LiteralBoolean170);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ObjectFlow133
		addToElementRepository("ObjectFlow133", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133.setName("ObjectFlow133");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Fork_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow133_LiteralBoolean135);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ObjectFlow136
		addToElementRepository("ObjectFlow136", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136.setName("ObjectFlow136");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow136_LiteralBoolean138);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow184
		addToElementRepository("ObjectFlow184", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184.setName("ObjectFlow184");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow184_LiteralBoolean185);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ObjectFlow145
		addToElementRepository("ObjectFlow145", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145.setName("ObjectFlow145");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow145_LiteralBoolean146);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ObjectFlow92
		addToElementRepository("ObjectFlow92", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92.setName("ObjectFlow92");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Fork_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow92_LiteralBoolean94);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ObjectFlow95
		addToElementRepository("ObjectFlow95", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95.setName("ObjectFlow95");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Fork_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow95_LiteralBoolean96);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ObjectFlow99
		addToElementRepository("ObjectFlow99", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99.setName("ObjectFlow99");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Fork_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow99_LiteralBoolean101);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ObjectFlow102
		addToElementRepository("ObjectFlow102", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102.setName("ObjectFlow102");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Call_testP_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow102_LiteralBoolean103);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::ObjectFlow10
		addToElementRepository("ObjectFlow10", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10.setName("ObjectFlow10");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow10_LiteralBoolean11);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::ObjectFlow13
		addToElementRepository("ObjectFlow13", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13.setName("ObjectFlow13");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow13_LiteralBoolean14);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow195
		addToElementRepository("ObjectFlow195", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195.setName("ObjectFlow195");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow195_LiteralBoolean197);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow198
		addToElementRepository("ObjectFlow198", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198.setName("ObjectFlow198");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow198_LiteralBoolean199);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_main::ObjectFlow65
		addToElementRepository("ObjectFlow65", MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65.setName("ObjectFlow65");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_main_Fork_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow65_LiteralBoolean66);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ObjectFlow119
		addToElementRepository("ObjectFlow119", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119.setName("ObjectFlow119");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralBoolean121);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ObjectFlow122
		addToElementRepository("ObjectFlow122", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122.setName("ObjectFlow122");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Fork_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow122_LiteralBoolean124);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::ObjectFlow20
		addToElementRepository("ObjectFlow20", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20.setName("ObjectFlow20");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow20_LiteralBoolean22);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ObjectFlow127
		addToElementRepository("ObjectFlow127", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127.setName("ObjectFlow127");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow127_LiteralBoolean129);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::ObjectFlow130
		addToElementRepository("ObjectFlow130", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130.setName("ObjectFlow130");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_ObjectFlow130_LiteralBoolean131);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_main::ObjectFlow57
		addToElementRepository("ObjectFlow57", MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57.setName("ObjectFlow57");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_main_Fork_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_main_ObjectFlow57_LiteralBoolean59);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::ObjectFlow32
		addToElementRepository("ObjectFlow32", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32.setName("ObjectFlow32");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow32_LiteralBoolean34);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow213
		addToElementRepository("ObjectFlow213", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213.setName("ObjectFlow213");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow213_LiteralBoolean214);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow216
		addToElementRepository("ObjectFlow216", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216.setName("ObjectFlow216");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216.setSource(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216.setGuard(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow216_LiteralBoolean218);
	}

	private void initializeOperation_Instances()
	{
		// Operation MultipleDelegation_MultipleConnector_P_P_Signal_B::B_B
		addToElementRepository("B_B", MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B.setName("B");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B.addOwnedParameter(MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_MultipleConnector_P_P_Signal_A::A_A
		addToElementRepository("A_A", MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A.setName("A");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A.addOwnedParameter(MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_MultipleConnector_P_P_Signal_Tester::Tester_Tester
		addToElementRepository("Tester_Tester", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester.setName("Tester");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester.addOwnedParameter(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_MultipleConnector_P_P_Signal_Tester::test
		addToElementRepository("test", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_test);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_test.setName("test");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_test.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_test.addMethod(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity);
		// Operation MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester::test
		addToElementRepository("test", MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_test);
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_test.setName("test");
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_test.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_test.setIsAbstract(true);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_3::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Continue);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b2::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read s.v::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b3::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Tester);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read b.p::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value(4)::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Tester);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b4::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester()::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Tester__result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Tester);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read s.t::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read this.a::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_A);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_IImpl);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_2::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Continue);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Start);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_main_Create Tester::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Create_Tester_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Tester);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_A);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_4::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Continue);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read a.b1::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set this.p::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_1::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Continue);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept S::s
		addToElementRepository("s", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s.setName("s");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s.setType(MultipleDelegation_MultipleConnector_P_P_Signal_S);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport MultipleDelegation_MultipleConnector_P_P_Signal::PackageImport42
		addToElementRepository("PackageImport42", MultipleDelegation_MultipleConnector_P_P_Signal_PackageImport42);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_A);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP_p.setName("p");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_B_B_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester_result);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester_result.setType(MultipleDelegation_MultipleConnector_P_P_Signal_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_Tester_Tester_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port MultipleDelegation_MultipleConnector_P_P_Signal_A::q
		addToElementRepository("q", MultipleDelegation_MultipleConnector_P_P_Signal_A_q);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_q.setName("q");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_q.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_A_q.setType(MultipleDelegation_MultipleConnector_P_P_Signal_IImpl);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_q.setAggregation(AggregationKind.composite);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_q.isService = true;
		MultipleDelegation_MultipleConnector_P_P_Signal_A_q.addProvided(MultipleDelegation_MultipleConnector_P_P_Signal_I);
	}

	private void initializeProperty_Instances()
	{
		// Property MultipleDelegation_MultipleConnector_P_P_Signal_R::x
		addToElementRepository("x", MultipleDelegation_MultipleConnector_P_P_Signal_R_x);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_x.setName("x");
		MultipleDelegation_MultipleConnector_P_P_Signal_R_x.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_x.setUpper(-1);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_x.setLower(0);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_x.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		// Property MultipleDelegation_MultipleConnector_P_P_Signal_B::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_P_Signal_B_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_p.setName("p");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property MultipleDelegation_MultipleConnector_P_P_Signal_Tester::a
		addToElementRepository("a", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_a.setName("a");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_a.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_a.setType(MultipleDelegation_MultipleConnector_P_P_Signal_A);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_a.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_P_Signal_S::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_P_Signal_S_v);
		MultipleDelegation_MultipleConnector_P_P_Signal_S_v.setName("v");
		MultipleDelegation_MultipleConnector_P_P_Signal_S_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property MultipleDelegation_MultipleConnector_P_P_Signal_A::b2
		addToElementRepository("b2", MultipleDelegation_MultipleConnector_P_P_Signal_A_b2);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b2.setName("b2");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b2.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b2.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b2.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_P_Signal_A::b1
		addToElementRepository("b1", MultipleDelegation_MultipleConnector_P_P_Signal_A_b1);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b1.setName("b1");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b1.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b1.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b1.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_P_Signal_A::b3
		addToElementRepository("b3", MultipleDelegation_MultipleConnector_P_P_Signal_A_b3);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b3.setName("b3");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b3.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b3.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b3.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_P_Signal_R::y
		addToElementRepository("y", MultipleDelegation_MultipleConnector_P_P_Signal_R_y);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_y.setName("y");
		MultipleDelegation_MultipleConnector_P_P_Signal_R_y.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_y.setUpper(-1);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_y.setLower(0);
		MultipleDelegation_MultipleConnector_P_P_Signal_R_y.setType(MultipleDelegation_MultipleConnector_P_P_Signal_IImpl);
		// Property MultipleDelegation_MultipleConnector_P_P_Signal_S::t
		addToElementRepository("t", MultipleDelegation_MultipleConnector_P_P_Signal_S_t);
		MultipleDelegation_MultipleConnector_P_P_Signal_S_t.setName("t");
		MultipleDelegation_MultipleConnector_P_P_Signal_S_t.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_S_t.setType(MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester);
		// Property MultipleDelegation_MultipleConnector_P_P_Signal_A::b4
		addToElementRepository("b4", MultipleDelegation_MultipleConnector_P_P_Signal_A_b4);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b4.setName("b4");
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b4.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b4.setType(MultipleDelegation_MultipleConnector_P_P_Signal_B);
		MultipleDelegation_MultipleConnector_P_P_Signal_A_b4.setAggregation(AggregationKind.composite);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::this
		addToElementRepository("this", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this.setName("this");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result);
		// ReadSelfAction MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::this
		addToElementRepository("this", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this.setName("this");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_this_result);
		// ReadSelfAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::this
		addToElementRepository("this", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this.setName("this");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::Read a.q
		addToElementRepository("Read a.q", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setName("Read a.q");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Signal_A_q);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setObject(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::Read a.b1
		addToElementRepository("Read a.b1", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1.setName("Read a.b1");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Signal_A_b1);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1.setObject(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b1_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::Read s.v
		addToElementRepository("Read s.v", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v.setName("Read s.v");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Signal_S_v);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v.setObject(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::Read this.a
		addToElementRepository("Read this.a", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a.setName("Read this.a");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a.setObject(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_this_a_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::Read this.a
		addToElementRepository("Read this.a", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setName("Read this.a");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_a);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setObject(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::Read a.b4
		addToElementRepository("Read a.b4", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4.setName("Read a.b4");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Signal_A_b4);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4.setObject(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b4_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::Read b.p
		addToElementRepository("Read b.p", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p.setName("Read b.p");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Signal_B_p);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p.setObject(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_b_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::Read a.b2
		addToElementRepository("Read a.b2", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2.setName("Read a.b2");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Signal_A_b2);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2.setObject(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b2_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::Read s.t
		addToElementRepository("Read s.t", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t.setName("Read s.t");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Signal_S_t);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t.setObject(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity::Read a.b3
		addToElementRepository("Read a.b3", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3.setName("Read a.b3");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Signal_A_b3);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3.setObject(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_object);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_testActivity_Read_a_b3_result);
	}

	private void initializeReception_Instances()
	{
		// Reception MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester::Continue
		addToElementRepository("Continue", MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_Continue);
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_Continue.setName("Continue");
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_Continue.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_Continue.setSignal(MultipleDelegation_MultipleConnector_P_P_Signal_Continue);
		// Reception MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester::Start
		addToElementRepository("Start", MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_Start);
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_Start.setName("Start");
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_Start.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_AbstractTester_Start.setSignal(MultipleDelegation_MultipleConnector_P_P_Signal_Start);
		// Reception MultipleDelegation_MultipleConnector_P_P_Signal_I::S
		addToElementRepository("S", MultipleDelegation_MultipleConnector_P_P_Signal_I_S);
		MultipleDelegation_MultipleConnector_P_P_Signal_I_S.setName("S");
		MultipleDelegation_MultipleConnector_P_P_Signal_I_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_I_S.setSignal(MultipleDelegation_MultipleConnector_P_P_Signal_S);
		// Reception MultipleDelegation_MultipleConnector_P_P_Signal_B::S
		addToElementRepository("S", MultipleDelegation_MultipleConnector_P_P_Signal_B_S);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_S.setName("S");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_S.setSignal(MultipleDelegation_MultipleConnector_P_P_Signal_S);
		// Reception MultipleDelegation_MultipleConnector_P_P_Signal_IImpl::S
		addToElementRepository("S", MultipleDelegation_MultipleConnector_P_P_Signal_IImpl_S);
		MultipleDelegation_MultipleConnector_P_P_Signal_IImpl_S.setName("S");
		MultipleDelegation_MultipleConnector_P_P_Signal_IImpl_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_IImpl_S.setSignal(MultipleDelegation_MultipleConnector_P_P_Signal_S);
	}

	private void initializeSendSignalAction_Instances()
	{
		// SendSignalAction MultipleDelegation_MultipleConnector_P_P_Signal_main::Send Start
		addToElementRepository("Send Start", MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start.setName("Send Start");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start.setSignal(MultipleDelegation_MultipleConnector_P_P_Signal_Start);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_main_Send_Start_target);
		// SendSignalAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::Send S
		addToElementRepository("Send S", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S.setName("Send S");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S.setSignal(MultipleDelegation_MultipleConnector_P_P_Signal_S);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S.addArgument(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S.addArgument(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		// SendSignalAction MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior::Send Continue
		addToElementRepository("Send Continue", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue.setName("Send Continue");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue.setSignal(MultipleDelegation_MultipleConnector_P_P_Signal_Continue);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue.setTarget(MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target);
	}

	private void initializeSignal_Instances()
	{
		// Signal MultipleDelegation_MultipleConnector_P_P_Signal::S
		addToElementRepository("S", MultipleDelegation_MultipleConnector_P_P_Signal_S);
		MultipleDelegation_MultipleConnector_P_P_Signal_S.setName("S");
		MultipleDelegation_MultipleConnector_P_P_Signal_S.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Signal_S.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Signal_S_v);
		MultipleDelegation_MultipleConnector_P_P_Signal_S.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Signal_S_t);
		// Signal MultipleDelegation_MultipleConnector_P_P_Signal::Start
		addToElementRepository("Start", MultipleDelegation_MultipleConnector_P_P_Signal_Start);
		MultipleDelegation_MultipleConnector_P_P_Signal_Start.setName("Start");
		MultipleDelegation_MultipleConnector_P_P_Signal_Start.setVisibility(VisibilityKind.public_);
		// Signal MultipleDelegation_MultipleConnector_P_P_Signal::Continue
		addToElementRepository("Continue", MultipleDelegation_MultipleConnector_P_P_Signal_Continue);
		MultipleDelegation_MultipleConnector_P_P_Signal_Continue.setName("Continue");
		MultipleDelegation_MultipleConnector_P_P_Signal_Continue.setVisibility(VisibilityKind.public_);
	}

	private void initializeSignalEvent_Instances()
	{
		// SignalEvent MultipleDelegation_MultipleConnector_P_P_Signal::ContinueEvent
		addToElementRepository("ContinueEvent", MultipleDelegation_MultipleConnector_P_P_Signal_ContinueEvent);
		MultipleDelegation_MultipleConnector_P_P_Signal_ContinueEvent.setName("ContinueEvent");
		MultipleDelegation_MultipleConnector_P_P_Signal_ContinueEvent.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_ContinueEvent.setSignal(MultipleDelegation_MultipleConnector_P_P_Signal_Continue);
		// SignalEvent MultipleDelegation_MultipleConnector_P_P_Signal::StartEvent
		addToElementRepository("StartEvent", MultipleDelegation_MultipleConnector_P_P_Signal_StartEvent);
		MultipleDelegation_MultipleConnector_P_P_Signal_StartEvent.setName("StartEvent");
		MultipleDelegation_MultipleConnector_P_P_Signal_StartEvent.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_StartEvent.setSignal(MultipleDelegation_MultipleConnector_P_P_Signal_Start);
		// SignalEvent MultipleDelegation_MultipleConnector_P_P_Signal::SEvent
		addToElementRepository("SEvent", MultipleDelegation_MultipleConnector_P_P_Signal_SEvent);
		MultipleDelegation_MultipleConnector_P_P_Signal_SEvent.setName("SEvent");
		MultipleDelegation_MultipleConnector_P_P_Signal_SEvent.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_SEvent.setSignal(MultipleDelegation_MultipleConnector_P_P_Signal_S);
	}

	private void initializeStartObjectBehaviorAction_Instances()
	{
		// StartObjectBehaviorAction MultipleDelegation_MultipleConnector_P_P_Signal_main::Start Tester
		addToElementRepository("Start Tester", MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester.setName("Start Tester");
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester.setObject(MultipleDelegation_MultipleConnector_P_P_Signal_main_Start_Tester_object);
	}

	private void initializeTrigger_Instances()
	{
		// Trigger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_4::Trigger171
		addToElementRepository("Trigger171", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger171);
		// Trigger Trigger171
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger171.setName("Trigger171");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger171.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger171.setEvent(MultipleDelegation_MultipleConnector_P_P_Signal_ContinueEvent);
		// Trigger MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept S::Trigger0
		addToElementRepository("Trigger0", MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger0);
		// Trigger Trigger0
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger0.setName("Trigger0");
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger0.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger0.setEvent(MultipleDelegation_MultipleConnector_P_P_Signal_SEvent);
		// Trigger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_1::Trigger162
		addToElementRepository("Trigger162", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger162);
		// Trigger Trigger162
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger162.setName("Trigger162");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger162.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger162.setEvent(MultipleDelegation_MultipleConnector_P_P_Signal_ContinueEvent);
		// Trigger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_2::Trigger178
		addToElementRepository("Trigger178", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger178);
		// Trigger Trigger178
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger178.setName("Trigger178");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger178.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger178.setEvent(MultipleDelegation_MultipleConnector_P_P_Signal_ContinueEvent);
		// Trigger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start::Trigger161
		addToElementRepository("Trigger161", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger161);
		// Trigger Trigger161
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger161.setName("Trigger161");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger161.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger161.setEvent(MultipleDelegation_MultipleConnector_P_P_Signal_StartEvent);
		// Trigger MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_3::Trigger222
		addToElementRepository("Trigger222", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger222);
		// Trigger Trigger222
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger222.setName("Trigger222");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger222.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger222.setEvent(MultipleDelegation_MultipleConnector_P_P_Signal_ContinueEvent);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior::Value(4)
		addToElementRepository("Value(4)", MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4.setName("Value(4)");
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4.setValue(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger191);
		MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4.setResult(MultipleDelegation_MultipleConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // MultipleDelegation_MultipleConnector_P_P_SignalModel
