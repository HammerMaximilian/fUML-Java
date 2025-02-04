/*
 * MultipleDelegation_SameConnector_P_P_SignalModel.java
 * 
 * Auto-generated file
 */
package MultipleDelegation_SameConnector_P_P_Signal;

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

public class MultipleDelegation_SameConnector_P_P_SignalModel extends InMemoryModel
{
	private static MultipleDelegation_SameConnector_P_P_SignalModel instance;

	/*
	 * Model MultipleDelegation_SameConnector_P_P_Signal
	 */
	public Package MultipleDelegation_SameConnector_P_P_Signal = new Package();
		public Activity MultipleDelegation_SameConnector_P_P_Signal_main = new Activity();
			public ControlFlow MultipleDelegation_SameConnector_P_P_Signal_main_ControlFlow0 = new ControlFlow();
			public CallOperationAction MultipleDelegation_SameConnector_P_P_Signal_main_Tester_ = new CallOperationAction();
				public OutputPin MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result = new OutputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural1 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralInteger2 = new LiteralInteger();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralInteger3 = new LiteralInteger();
				public InputPin MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural4 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target_LiteralInteger5 = new LiteralInteger();
			public StartObjectBehaviorAction MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester = new StartObjectBehaviorAction();
				public InputPin MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural6 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object_LiteralInteger7 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8_LiteralBoolean9 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8_LiteralInteger10 = new LiteralInteger();
			public CreateObjectAction MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester = new CreateObjectAction();
				public OutputPin MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result = new OutputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result_LiteralInteger11 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural12 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13_LiteralInteger14 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13_LiteralBoolean15 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16_LiteralInteger17 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16_LiteralBoolean18 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19_LiteralBoolean20 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19_LiteralInteger21 = new LiteralInteger();
			public ForkNode MultipleDelegation_SameConnector_P_P_Signal_main_Fork_Tester = new ForkNode();
			public SendSignalAction MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start = new SendSignalAction();
				public InputPin MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target = new InputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target_LiteralInteger22 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural23 = new LiteralUnlimitedNatural();
		public Interface MultipleDelegation_SameConnector_P_P_Signal_I = new Interface();
			public Reception MultipleDelegation_SameConnector_P_P_Signal_I_S = new Reception();
		public Signal MultipleDelegation_SameConnector_P_P_Signal_S = new Signal();
			public Property MultipleDelegation_SameConnector_P_P_Signal_S_t = new Property();
			public Property MultipleDelegation_SameConnector_P_P_Signal_S_v = new Property();
		public Signal MultipleDelegation_SameConnector_P_P_Signal_Continue = new Signal();
		public Signal MultipleDelegation_SameConnector_P_P_Signal_Start = new Signal();
		public Class_ MultipleDelegation_SameConnector_P_P_Signal_IImpl = new Class_();
			public InterfaceRealization MultipleDelegation_SameConnector_P_P_Signal_IImpl_IRealization = new InterfaceRealization();
			public Reception MultipleDelegation_SameConnector_P_P_Signal_IImpl_S = new Reception();
		public Class_ MultipleDelegation_SameConnector_P_P_Signal_Tester = new Class_();
			public Activity MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior = new Activity();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24_LiteralBoolean25 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24_LiteralInteger26 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27_LiteralBoolean28 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27_LiteralInteger29 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger30 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural31 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural32 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger33 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralBoolean35 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralInteger36 = new LiteralInteger();
				public AcceptEventAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4 = new AcceptEventAction();
					public Trigger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger37 = new Trigger();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger38 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger39 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural40 = new LiteralUnlimitedNatural();
				public ValueSpecificationAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4 = new ValueSpecificationAction();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural41 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger42 = new LiteralInteger();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger43 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44_LiteralBoolean45 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44_LiteralInteger46 = new LiteralInteger();
				public ControlFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow47 = new ControlFlow();
				public AcceptEventAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2 = new AcceptEventAction();
					public Trigger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger48 = new Trigger();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural49 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger50 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger51 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52_LiteralInteger53 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52_LiteralBoolean54 = new LiteralBoolean();
				public ControlFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow55 = new ControlFlow();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural56 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger57 = new LiteralInteger();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural58 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger59 = new LiteralInteger();
				public ReadSelfAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural60 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger61 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralInteger63 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralBoolean64 = new LiteralBoolean();
				public AcceptEventAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start = new AcceptEventAction();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger65 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural66 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger67 = new LiteralInteger();
					public Trigger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger68 = new Trigger();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69_LiteralBoolean70 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69_LiteralInteger71 = new LiteralInteger();
				public ControlFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow72 = new ControlFlow();
				public ControlFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow73 = new ControlFlow();
				public AcceptEventAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1 = new AcceptEventAction();
					public Trigger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger74 = new Trigger();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural75 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger76 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger77 = new LiteralInteger();
				public AcceptEventAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3 = new AcceptEventAction();
					public Trigger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger78 = new Trigger();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger79 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger80 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural81 = new LiteralUnlimitedNatural();
				public ForkNode MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this = new ForkNode();
				public ControlFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow82 = new ControlFlow();
				public SendSignalAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S = new SendSignalAction();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural83 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger84 = new LiteralInteger();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger85 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural86 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural87 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger88 = new LiteralInteger();
				public ControlFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow89 = new ControlFlow();
				public CallOperationAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_ = new CallOperationAction();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural90 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger91 = new LiteralInteger();
			public Generalization MultipleDelegation_SameConnector_P_P_Signal_Tester_Generalization92 = new Generalization();
			public Property MultipleDelegation_SameConnector_P_P_Signal_Tester_a = new Property();
			public Activity MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity = new Activity();
				public OpaqueBehavior MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP = new OpaqueBehavior();
					public Parameter MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP_p = new Parameter();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural93 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger94 = new LiteralInteger();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger95 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural96 = new LiteralUnlimitedNatural();
				public CallBehaviorAction MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP = new CallBehaviorAction();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger97 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger98 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural99 = new LiteralUnlimitedNatural();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger100 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural101 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural102 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger103 = new LiteralInteger();
				public ReadSelfAction MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural104 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result_LiteralInteger105 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106_LiteralBoolean107 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106_LiteralInteger108 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger109 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural110 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger111 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural112 = new LiteralUnlimitedNatural();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113_LiteralBoolean114 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113_LiteralInteger115 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116_LiteralInteger117 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116_LiteralBoolean118 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralBoolean120 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralInteger121 = new LiteralInteger();
			public Operation MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester_result = new Parameter();
			public Operation MultipleDelegation_SameConnector_P_P_Signal_Tester_test = new Operation();
		public Class_ MultipleDelegation_SameConnector_P_P_Signal_B = new Class_();
			public Operation MultipleDelegation_SameConnector_P_P_Signal_B_B_B = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_P_Signal_B_B_B_result = new Parameter();
			public Property MultipleDelegation_SameConnector_P_P_Signal_B_p = new Property();
			public Activity MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior = new Activity();
				public AcceptEventAction MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S = new AcceptEventAction();
					public Trigger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger122 = new Trigger();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural123 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger124 = new LiteralInteger();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger125 = new LiteralInteger();
				public ForkNode MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Fork_s = new ForkNode();
				public AddStructuralFeatureValueAction MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger126 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural127 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural128 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger129 = new LiteralInteger();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural130 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger131 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132_LiteralBoolean133 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132_LiteralInteger134 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135_LiteralBoolean136 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135_LiteralInteger137 = new LiteralInteger();
				public ControlFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow138 = new ControlFlow();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139_LiteralBoolean140 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139_LiteralInteger141 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142_LiteralInteger143 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142_LiteralBoolean144 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145_LiteralBoolean146 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145_LiteralInteger147 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v = new ReadStructuralFeatureAction();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger148 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural149 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger150 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural151 = new LiteralUnlimitedNatural();
				public ReadSelfAction MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger152 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural153 = new LiteralUnlimitedNatural();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154_LiteralInteger155 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154_LiteralBoolean156 = new LiteralBoolean();
				public SendSignalAction MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue = new SendSignalAction();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural157 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger158 = new LiteralInteger();
				public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t = new ReadStructuralFeatureAction();
					public InputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural159 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger160 = new LiteralInteger();
					public OutputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger161 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural162 = new LiteralUnlimitedNatural();
			public Reception MultipleDelegation_SameConnector_P_P_Signal_B_S = new Reception();
			public InterfaceRealization MultipleDelegation_SameConnector_P_P_Signal_B_IRealization = new InterfaceRealization();
		public Comment MultipleDelegation_SameConnector_P_P_Signal_Comment163 = new Comment();
		public PackageImport MultipleDelegation_SameConnector_P_P_Signal_PackageImport164 = new PackageImport();
		public Comment MultipleDelegation_SameConnector_P_P_Signal_Comment165 = new Comment();
		public SignalEvent MultipleDelegation_SameConnector_P_P_Signal_StartEvent = new SignalEvent();
		public Association MultipleDelegation_SameConnector_P_P_Signal_R = new Association();
			public Property MultipleDelegation_SameConnector_P_P_Signal_R_x = new Property();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_R_x_LiteralInteger166 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_R_x_LiteralUnlimitedNatural167 = new LiteralUnlimitedNatural();
			public Property MultipleDelegation_SameConnector_P_P_Signal_R_y = new Property();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_R_y_LiteralInteger168 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_R_y_LiteralUnlimitedNatural169 = new LiteralUnlimitedNatural();
		public Class_ MultipleDelegation_SameConnector_P_P_Signal_AbstractTester = new Class_();
			public Reception MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_Continue = new Reception();
			public Operation MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_test = new Operation();
			public Reception MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_Start = new Reception();
		public Class_ MultipleDelegation_SameConnector_P_P_Signal_A = new Class_();
			public Property MultipleDelegation_SameConnector_P_P_Signal_A_b = new Property();
				public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_A_b_LiteralUnlimitedNatural170 = new LiteralUnlimitedNatural();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_A_b_LiteralInteger171 = new LiteralInteger();
			public Connector MultipleDelegation_SameConnector_P_P_Signal_A_r = new Connector();
				public ConnectorEnd MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172 = new ConnectorEnd();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172_LiteralUnlimitedNatural173 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172_LiteralInteger174 = new LiteralInteger();
				public ConnectorEnd MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd175 = new ConnectorEnd();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd175_LiteralUnlimitedNatural176 = new LiteralUnlimitedNatural();
			public Port MultipleDelegation_SameConnector_P_P_Signal_A_q = new Port();
			public Operation MultipleDelegation_SameConnector_P_P_Signal_A_A_A = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_P_Signal_A_A_A_result = new Parameter();
		public SignalEvent MultipleDelegation_SameConnector_P_P_Signal_ContinueEvent = new SignalEvent();
		public SignalEvent MultipleDelegation_SameConnector_P_P_Signal_SEvent = new SignalEvent();

	public static MultipleDelegation_SameConnector_P_P_SignalModel instance()
	{
		if (instance == null)
        {
            instance = new MultipleDelegation_SameConnector_P_P_SignalModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public MultipleDelegation_SameConnector_P_P_SignalModel()
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
		// AcceptEventAction MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::Accept S
		addToElementRepository("Accept S", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S.setName("Accept S");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S.addResult(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S.addTrigger(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger122);
		// AcceptEventAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::Accept Continue_1
		addToElementRepository("Accept Continue_1", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.setName("Accept Continue_1");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.addResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1.addTrigger(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger74);
		// AcceptEventAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::Accept Continue_3
		addToElementRepository("Accept Continue_3", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.setName("Accept Continue_3");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.addResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3.addTrigger(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger78);
		// AcceptEventAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::Accept Continue_2
		addToElementRepository("Accept Continue_2", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.setName("Accept Continue_2");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.addResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2.addTrigger(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger48);
		// AcceptEventAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::Accept Continue_4
		addToElementRepository("Accept Continue_4", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.setName("Accept Continue_4");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.addResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4.addTrigger(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger37);
		// AcceptEventAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::Accept Start
		addToElementRepository("Accept Start", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start.setName("Accept Start");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start.addResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start.addTrigger(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger68);
	}

	private void initializeActivity_Instances()
	{
		// Activity MultipleDelegation_SameConnector_P_P_Signal_Tester::TesterClassifierBehavior
		addToElementRepository("TesterClassifierBehavior", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.setName("TesterClassifierBehavior");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow55);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow72);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow47);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow73);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow82);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow89);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52);
		// Activity MultipleDelegation_SameConnector_P_P_Signal::main
		addToElementRepository("main", MultipleDelegation_SameConnector_P_P_Signal_main);
		MultipleDelegation_SameConnector_P_P_Signal_main.setName("main");
		MultipleDelegation_SameConnector_P_P_Signal_main.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main.addNode(MultipleDelegation_SameConnector_P_P_Signal_main_Tester_);
		MultipleDelegation_SameConnector_P_P_Signal_main.addNode(MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_main.addNode(MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_main.addNode(MultipleDelegation_SameConnector_P_P_Signal_main_Fork_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_main.addNode(MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start);
		MultipleDelegation_SameConnector_P_P_Signal_main.addEdge(MultipleDelegation_SameConnector_P_P_Signal_main_ControlFlow0);
		MultipleDelegation_SameConnector_P_P_Signal_main.addEdge(MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8);
		MultipleDelegation_SameConnector_P_P_Signal_main.addEdge(MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13);
		MultipleDelegation_SameConnector_P_P_Signal_main.addEdge(MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16);
		MultipleDelegation_SameConnector_P_P_Signal_main.addEdge(MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19);
		// Activity MultipleDelegation_SameConnector_P_P_Signal_B::BClassifierBehavior
		addToElementRepository("BClassifierBehavior", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.setName("BClassifierBehavior");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addNode(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow138);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior.addEdge(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139);
		// Activity MultipleDelegation_SameConnector_P_P_Signal_Tester::testActivity
		addToElementRepository("testActivity", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity.setName("testActivity");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity.addOwnedBehavior(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity.addNode(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity.addEdge(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::Set this.p
		addToElementRepository("Set this.p", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p.setName("Set this.p");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p.setStructuralFeature(MultipleDelegation_SameConnector_P_P_Signal_B_p);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p.setObject(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p.setValue(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p.setResult(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association MultipleDelegation_SameConnector_P_P_Signal::R
		addToElementRepository("R", MultipleDelegation_SameConnector_P_P_Signal_R);
		MultipleDelegation_SameConnector_P_P_Signal_R.setName("R");
		MultipleDelegation_SameConnector_P_P_Signal_R.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_R.addOwnedEnd(MultipleDelegation_SameConnector_P_P_Signal_R_x);
		MultipleDelegation_SameConnector_P_P_Signal_R.addOwnedEnd(MultipleDelegation_SameConnector_P_P_Signal_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity::Call testP
		addToElementRepository("Call testP", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP.setName("Call testP");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP.setBehavior(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP.addArgument(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction MultipleDelegation_SameConnector_P_P_Signal_main::Tester()
		addToElementRepository("Tester()", MultipleDelegation_SameConnector_P_P_Signal_main_Tester_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester_.setName("Tester()");
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester_.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester_.addResult(MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester_.setOperation(MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester_.setTarget(MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target);
		// CallOperationAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::Call test()
		addToElementRepository("Call test()", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_.setName("Call test()");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_.setOperation(MultipleDelegation_SameConnector_P_P_Signal_Tester_test);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target);
	}

	private void initializeClass_Instances()
	{
		// Class MultipleDelegation_SameConnector_P_P_Signal::AbstractTester
		addToElementRepository("AbstractTester", MultipleDelegation_SameConnector_P_P_Signal_AbstractTester);
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester.setName("AbstractTester");
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester.setIsAbstract(true);
		
		
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester.setIsActive(true);
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester.addOwnedOperation(MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_test);
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester.addOwnedReception(MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_Continue);
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester.addOwnedReception(MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_Start);
		// Class MultipleDelegation_SameConnector_P_P_Signal::A
		addToElementRepository("A", MultipleDelegation_SameConnector_P_P_Signal_A);
		MultipleDelegation_SameConnector_P_P_Signal_A.setName("A");
		MultipleDelegation_SameConnector_P_P_Signal_A.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_A.addOwnedAttribute(MultipleDelegation_SameConnector_P_P_Signal_A_q);
		MultipleDelegation_SameConnector_P_P_Signal_A.addOwnedAttribute(MultipleDelegation_SameConnector_P_P_Signal_A_b);
		
		MultipleDelegation_SameConnector_P_P_Signal_A.addOwnedConnector(MultipleDelegation_SameConnector_P_P_Signal_A_r);
		MultipleDelegation_SameConnector_P_P_Signal_A.addOwnedOperation(MultipleDelegation_SameConnector_P_P_Signal_A_A_A);
		// Class MultipleDelegation_SameConnector_P_P_Signal::IImpl
		addToElementRepository("IImpl", MultipleDelegation_SameConnector_P_P_Signal_IImpl);
		MultipleDelegation_SameConnector_P_P_Signal_IImpl.setName("IImpl");
		MultipleDelegation_SameConnector_P_P_Signal_IImpl.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_IImpl.addInterfaceRealization(MultipleDelegation_SameConnector_P_P_Signal_IImpl_IRealization);
		
		MultipleDelegation_SameConnector_P_P_Signal_IImpl.addOwnedReception(MultipleDelegation_SameConnector_P_P_Signal_IImpl_S);
		// Class MultipleDelegation_SameConnector_P_P_Signal::Tester
		addToElementRepository("Tester", MultipleDelegation_SameConnector_P_P_Signal_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_Tester.setName("Tester");
		MultipleDelegation_SameConnector_P_P_Signal_Tester.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester.addGeneralization(MultipleDelegation_SameConnector_P_P_Signal_Tester_Generalization92);
		MultipleDelegation_SameConnector_P_P_Signal_Tester.addOwnedAttribute(MultipleDelegation_SameConnector_P_P_Signal_Tester_a);
		MultipleDelegation_SameConnector_P_P_Signal_Tester.setClassifierBehavior(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior);
		MultipleDelegation_SameConnector_P_P_Signal_Tester.addOwnedBehavior(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior);
		MultipleDelegation_SameConnector_P_P_Signal_Tester.addOwnedBehavior(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester.setIsActive(true);
		MultipleDelegation_SameConnector_P_P_Signal_Tester.addOwnedOperation(MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_Tester.addOwnedOperation(MultipleDelegation_SameConnector_P_P_Signal_Tester_test);
		// Class MultipleDelegation_SameConnector_P_P_Signal::B
		addToElementRepository("B", MultipleDelegation_SameConnector_P_P_Signal_B);
		MultipleDelegation_SameConnector_P_P_Signal_B.setName("B");
		MultipleDelegation_SameConnector_P_P_Signal_B.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_B.addOwnedAttribute(MultipleDelegation_SameConnector_P_P_Signal_B_p);
		MultipleDelegation_SameConnector_P_P_Signal_B.setClassifierBehavior(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior);
		MultipleDelegation_SameConnector_P_P_Signal_B.addOwnedBehavior(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior);
		MultipleDelegation_SameConnector_P_P_Signal_B.addInterfaceRealization(MultipleDelegation_SameConnector_P_P_Signal_B_IRealization);
		
		MultipleDelegation_SameConnector_P_P_Signal_B.setIsActive(true);
		MultipleDelegation_SameConnector_P_P_Signal_B.addOwnedOperation(MultipleDelegation_SameConnector_P_P_Signal_B_B_B);
		MultipleDelegation_SameConnector_P_P_Signal_B.addOwnedReception(MultipleDelegation_SameConnector_P_P_Signal_B_S);
	}

	private void initializeComment_Instances()
	{
		// Comment MultipleDelegation_SameConnector_P_P_Signal::Comment163
		addToElementRepository("Comment163", MultipleDelegation_SameConnector_P_P_Signal_Comment163);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment MultipleDelegation_SameConnector_P_P_Signal::Comment165
		addToElementRepository("Comment165", MultipleDelegation_SameConnector_P_P_Signal_Comment165);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector MultipleDelegation_SameConnector_P_P_Signal_A::r
		addToElementRepository("r", MultipleDelegation_SameConnector_P_P_Signal_A_r);
		MultipleDelegation_SameConnector_P_P_Signal_A_r.setName("r");
		MultipleDelegation_SameConnector_P_P_Signal_A_r.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_A_r.addEnd(MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd175);
		MultipleDelegation_SameConnector_P_P_Signal_A_r.addEnd(MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172);
		MultipleDelegation_SameConnector_P_P_Signal_A_r.setType(MultipleDelegation_SameConnector_P_P_Signal_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd MultipleDelegation_SameConnector_P_P_Signal_A_r::ConnectorEnd172
		addToElementRepository("ConnectorEnd172", MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172);
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172.setUpper(-1);
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172.setLower(4);
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172.setRole(MultipleDelegation_SameConnector_P_P_Signal_A_b);
		// ConnectorEnd MultipleDelegation_SameConnector_P_P_Signal_A_r::ConnectorEnd175
		addToElementRepository("ConnectorEnd175", MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd175);
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd175.setUpper(-1);
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd175.setRole(MultipleDelegation_SameConnector_P_P_Signal_A_q);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow72
		addToElementRepository("ControlFlow72", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow72);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow72.setName("ControlFlow72");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow72.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow72.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow72.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test_);
		// ControlFlow MultipleDelegation_SameConnector_P_P_Signal_main::ControlFlow0
		addToElementRepository("ControlFlow0", MultipleDelegation_SameConnector_P_P_Signal_main_ControlFlow0);
		MultipleDelegation_SameConnector_P_P_Signal_main_ControlFlow0.setName("ControlFlow0");
		MultipleDelegation_SameConnector_P_P_Signal_main_ControlFlow0.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_main_ControlFlow0.setSource(MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_main_ControlFlow0.setTarget(MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start);
		// ControlFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow47
		addToElementRepository("ControlFlow47", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow47);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow47.setName("ControlFlow47");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow47.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow47.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow47.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this);
		// ControlFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow73
		addToElementRepository("ControlFlow73", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow73);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow73.setName("ControlFlow73");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow73.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow73.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow73.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		// ControlFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow55
		addToElementRepository("ControlFlow55", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow55);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow55.setName("ControlFlow55");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow55.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow55.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow55.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4);
		// ControlFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::ControlFlow138
		addToElementRepository("ControlFlow138", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow138);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow138.setName("ControlFlow138");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow138.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow138.setSource(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ControlFlow138.setTarget(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue);
		// ControlFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow82
		addToElementRepository("ControlFlow82", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow82);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow82.setName("ControlFlow82");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow82.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow82.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow82.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		// ControlFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ControlFlow89
		addToElementRepository("ControlFlow89", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow89);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow89.setName("ControlFlow89");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow89.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow89.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ControlFlow89.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction MultipleDelegation_SameConnector_P_P_Signal_main::Create Tester
		addToElementRepository("Create Tester", MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester.setName("Create Tester");
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester.setClassifier(MultipleDelegation_SameConnector_P_P_Signal_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester.setResult(MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::Fork s
		addToElementRepository("Fork s", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Fork_s.setName("Fork s");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Fork_s.setVisibility(VisibilityKind.public_);
		// ForkNode MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::Fork this
		addToElementRepository("Fork this", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this.setName("Fork this");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this.setVisibility(VisibilityKind.public_);
		// ForkNode MultipleDelegation_SameConnector_P_P_Signal_main::Fork Tester
		addToElementRepository("Fork Tester", MultipleDelegation_SameConnector_P_P_Signal_main_Fork_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_main_Fork_Tester.setName("Fork Tester");
		MultipleDelegation_SameConnector_P_P_Signal_main_Fork_Tester.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity::testP
		addToElementRepository("testP", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP.setName("testP");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP.addOwnedParameter(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP_p);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP.addLanguage("Java");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP.addLanguage("Import");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP.addBody("if(index == 1) 	{ 		System.out.println(\"Asserting c.b[1] == 4 || c.b[2] == 4 || c.b[3] == 4 || c.b[4] == 4\"); 	}  	// For some reason, during the first execution of the expansion region, its body is actually executed twice. 	// Because of that, the body is actually executaed 5 times in total. This if-statement covers that up until solved. 	if(index <= MAX_INDEX) 	{  		// Test parameter p 		int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 		Debug.println(\"[doBody] argument p = \" + p); 	 		System.out.println( \"c.b[\" + index + \"] == \" + p); 		success = success || (p == 4);  		if(index == MAX_INDEX) 		{  			System.out.print(\"Signal delegated on all links (shall be true for default strategy): \");  			if(success) 			{ 				System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 			} 			else 			{ 				System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 			} 		} 	}  	index++;");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeGeneralization_Instances()
	{
		// Generalization MultipleDelegation_SameConnector_P_P_Signal_Tester::Generalization92
		addToElementRepository("Generalization92", MultipleDelegation_SameConnector_P_P_Signal_Tester_Generalization92);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_Generalization92.setGeneral(MultipleDelegation_SameConnector_P_P_Signal_AbstractTester);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call test()::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target.setName("target");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target.setType(MultipleDelegation_SameConnector_P_P_Signal_Tester);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_main_Send Start::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target);
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target.setName("target");
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target.setType(MultipleDelegation_SameConnector_P_P_Signal_Tester);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read this.a::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object.setName("object");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object.setType(MultipleDelegation_SameConnector_P_P_Signal_Tester);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send Continue::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target.setName("target");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target.setType(MultipleDelegation_SameConnector_P_P_Signal_AbstractTester);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call testP::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p.setName("p");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read a.b::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object.setName("object");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object.setType(MultipleDelegation_SameConnector_P_P_Signal_A);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_main_Tester()::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target.setName("target");
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target.setType(MultipleDelegation_SameConnector_P_P_Signal_Tester);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S::t
		addToElementRepository("t", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t.setName("t");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t.setType(MultipleDelegation_SameConnector_P_P_Signal_AbstractTester);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object.setName("object");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object.setType(MultipleDelegation_SameConnector_P_P_Signal_Tester);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_main_Start Tester::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object);
		MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object.setName("object");
		MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object.setVisibility(VisibilityKind.public_);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v.setName("v");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read s.t::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object.setName("object");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object.setVisibility(VisibilityKind.public_);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read s.v::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object.setName("object");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object.setVisibility(VisibilityKind.public_);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target.setName("target");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target.setType(MultipleDelegation_SameConnector_P_P_Signal_IImpl);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read b.p::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object.setName("object");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object.setType(MultipleDelegation_SameConnector_P_P_Signal_B);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object.setName("object");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object.setType(MultipleDelegation_SameConnector_P_P_Signal_A);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set this.p::value
		addToElementRepository("value", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value.setName("value");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set this.p::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object.setName("object");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object.setType(MultipleDelegation_SameConnector_P_P_Signal_B);
	}

	private void initializeInterface_Instances()
	{
		// Interface MultipleDelegation_SameConnector_P_P_Signal::I
		addToElementRepository("I", MultipleDelegation_SameConnector_P_P_Signal_I);
		MultipleDelegation_SameConnector_P_P_Signal_I.setName("I");
		MultipleDelegation_SameConnector_P_P_Signal_I.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_I.addOwnedReception(MultipleDelegation_SameConnector_P_P_Signal_I_S);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization MultipleDelegation_SameConnector_P_P_Signal_IImpl::IRealization
		addToElementRepository("IRealization", MultipleDelegation_SameConnector_P_P_Signal_IImpl_IRealization);
		MultipleDelegation_SameConnector_P_P_Signal_IImpl_IRealization.setName("IRealization");
		MultipleDelegation_SameConnector_P_P_Signal_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_IImpl_IRealization.setContract(MultipleDelegation_SameConnector_P_P_Signal_I);
		// InterfaceRealization MultipleDelegation_SameConnector_P_P_Signal_B::IRealization
		addToElementRepository("IRealization", MultipleDelegation_SameConnector_P_P_Signal_B_IRealization);
		MultipleDelegation_SameConnector_P_P_Signal_B_IRealization.setName("IRealization");
		MultipleDelegation_SameConnector_P_P_Signal_B_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_IRealization.setContract(MultipleDelegation_SameConnector_P_P_Signal_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24::LiteralBoolean25
		addToElementRepository("LiteralBoolean25", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24_LiteralBoolean25);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24_LiteralBoolean25.setName("LiteralBoolean25");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24_LiteralBoolean25.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24_LiteralBoolean25.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106::LiteralBoolean107
		addToElementRepository("LiteralBoolean107", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106_LiteralBoolean107);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106_LiteralBoolean107.setName("LiteralBoolean107");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106_LiteralBoolean107.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106_LiteralBoolean107.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34::LiteralBoolean35
		addToElementRepository("LiteralBoolean35", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralBoolean35);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralBoolean35.setName("LiteralBoolean35");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralBoolean35.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralBoolean35.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139::LiteralBoolean140
		addToElementRepository("LiteralBoolean140", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139_LiteralBoolean140);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139_LiteralBoolean140.setName("LiteralBoolean140");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139_LiteralBoolean140.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139_LiteralBoolean140.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113::LiteralBoolean114
		addToElementRepository("LiteralBoolean114", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113_LiteralBoolean114);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113_LiteralBoolean114.setName("LiteralBoolean114");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113_LiteralBoolean114.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113_LiteralBoolean114.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142::LiteralBoolean144
		addToElementRepository("LiteralBoolean144", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142_LiteralBoolean144);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142_LiteralBoolean144.setName("LiteralBoolean144");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142_LiteralBoolean144.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142_LiteralBoolean144.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52::LiteralBoolean54
		addToElementRepository("LiteralBoolean54", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52_LiteralBoolean54);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52_LiteralBoolean54.setName("LiteralBoolean54");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52_LiteralBoolean54.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52_LiteralBoolean54.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16::LiteralBoolean18
		addToElementRepository("LiteralBoolean18", MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16_LiteralBoolean18);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16_LiteralBoolean18.setName("LiteralBoolean18");
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16_LiteralBoolean18.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16_LiteralBoolean18.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8::LiteralBoolean9
		addToElementRepository("LiteralBoolean9", MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8_LiteralBoolean9);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8_LiteralBoolean9.setName("LiteralBoolean9");
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8_LiteralBoolean9.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8_LiteralBoolean9.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145::LiteralBoolean146
		addToElementRepository("LiteralBoolean146", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145_LiteralBoolean146);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145_LiteralBoolean146.setName("LiteralBoolean146");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145_LiteralBoolean146.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145_LiteralBoolean146.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44::LiteralBoolean45
		addToElementRepository("LiteralBoolean45", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44_LiteralBoolean45);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44_LiteralBoolean45.setName("LiteralBoolean45");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44_LiteralBoolean45.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44_LiteralBoolean45.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119::LiteralBoolean120
		addToElementRepository("LiteralBoolean120", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralBoolean120);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralBoolean120.setName("LiteralBoolean120");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralBoolean120.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralBoolean120.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116::LiteralBoolean118
		addToElementRepository("LiteralBoolean118", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116_LiteralBoolean118);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116_LiteralBoolean118.setName("LiteralBoolean118");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116_LiteralBoolean118.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116_LiteralBoolean118.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135::LiteralBoolean136
		addToElementRepository("LiteralBoolean136", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135_LiteralBoolean136);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135_LiteralBoolean136.setName("LiteralBoolean136");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135_LiteralBoolean136.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135_LiteralBoolean136.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132::LiteralBoolean133
		addToElementRepository("LiteralBoolean133", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132_LiteralBoolean133);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132_LiteralBoolean133.setName("LiteralBoolean133");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132_LiteralBoolean133.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132_LiteralBoolean133.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13::LiteralBoolean15
		addToElementRepository("LiteralBoolean15", MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13_LiteralBoolean15);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13_LiteralBoolean15.setName("LiteralBoolean15");
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13_LiteralBoolean15.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13_LiteralBoolean15.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154::LiteralBoolean156
		addToElementRepository("LiteralBoolean156", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154_LiteralBoolean156);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154_LiteralBoolean156.setName("LiteralBoolean156");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154_LiteralBoolean156.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154_LiteralBoolean156.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19::LiteralBoolean20
		addToElementRepository("LiteralBoolean20", MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19_LiteralBoolean20);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19_LiteralBoolean20.setName("LiteralBoolean20");
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19_LiteralBoolean20.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19_LiteralBoolean20.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27::LiteralBoolean28
		addToElementRepository("LiteralBoolean28", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27_LiteralBoolean28);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27_LiteralBoolean28.setName("LiteralBoolean28");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27_LiteralBoolean28.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27_LiteralBoolean28.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69::LiteralBoolean70
		addToElementRepository("LiteralBoolean70", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69_LiteralBoolean70);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69_LiteralBoolean70.setName("LiteralBoolean70");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69_LiteralBoolean70.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69_LiteralBoolean70.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62::LiteralBoolean64
		addToElementRepository("LiteralBoolean64", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralBoolean64);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralBoolean64.setName("LiteralBoolean64");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralBoolean64.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralBoolean64.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_R_y::LiteralInteger168
		addToElementRepository("LiteralInteger168", MultipleDelegation_SameConnector_P_P_Signal_R_y_LiteralInteger168);
		MultipleDelegation_SameConnector_P_P_Signal_R_y_LiteralInteger168.setName("LiteralInteger168");
		MultipleDelegation_SameConnector_P_P_Signal_R_y_LiteralInteger168.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_R_y_LiteralInteger168.setValue(0);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result::LiteralInteger61
		addToElementRepository("LiteralInteger61", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger61);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger61.setName("LiteralInteger61");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger61.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralInteger61.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142::LiteralInteger143
		addToElementRepository("LiteralInteger143", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142_LiteralInteger143);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142_LiteralInteger143.setName("LiteralInteger143");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142_LiteralInteger143.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142_LiteralInteger143.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172::LiteralInteger174
		addToElementRepository("LiteralInteger174", MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172_LiteralInteger174);
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172_LiteralInteger174.setName("LiteralInteger174");
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172_LiteralInteger174.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172_LiteralInteger174.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_2_result::LiteralInteger51
		addToElementRepository("LiteralInteger51", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger51);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger51.setName("LiteralInteger51");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger51.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger51.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8::LiteralInteger10
		addToElementRepository("LiteralInteger10", MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8_LiteralInteger10);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8_LiteralInteger10.setName("LiteralInteger10");
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8_LiteralInteger10.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8_LiteralInteger10.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call test()_target::LiteralInteger91
		addToElementRepository("LiteralInteger91", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger91);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger91.setName("LiteralInteger91");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger91.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger91.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_A_b::LiteralInteger171
		addToElementRepository("LiteralInteger171", MultipleDelegation_SameConnector_P_P_Signal_A_b_LiteralInteger171);
		MultipleDelegation_SameConnector_P_P_Signal_A_b_LiteralInteger171.setName("LiteralInteger171");
		MultipleDelegation_SameConnector_P_P_Signal_A_b_LiteralInteger171.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_A_b_LiteralInteger171.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69::LiteralInteger71
		addToElementRepository("LiteralInteger71", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69_LiteralInteger71);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69_LiteralInteger71.setName("LiteralInteger71");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69_LiteralInteger71.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69_LiteralInteger71.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116::LiteralInteger117
		addToElementRepository("LiteralInteger117", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116_LiteralInteger117);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116_LiteralInteger117.setName("LiteralInteger117");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116_LiteralInteger117.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116_LiteralInteger117.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read s.v_result::LiteralInteger148
		addToElementRepository("LiteralInteger148", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger148);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger148.setName("LiteralInteger148");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger148.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralInteger148.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_Create Tester_result::LiteralInteger11
		addToElementRepository("LiteralInteger11", MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result_LiteralInteger11);
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result_LiteralInteger11.setName("LiteralInteger11");
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result_LiteralInteger11.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result_LiteralInteger11.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_Tester()_result::LiteralInteger2
		addToElementRepository("LiteralInteger2", MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralInteger2);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralInteger2.setName("LiteralInteger2");
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralInteger2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralInteger2.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119::LiteralInteger121
		addToElementRepository("LiteralInteger121", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralInteger121);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralInteger121.setName("LiteralInteger121");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralInteger121.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralInteger121.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154::LiteralInteger155
		addToElementRepository("LiteralInteger155", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154_LiteralInteger155);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154_LiteralInteger155.setName("LiteralInteger155");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154_LiteralInteger155.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154_LiteralInteger155.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113::LiteralInteger115
		addToElementRepository("LiteralInteger115", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113_LiteralInteger115);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113_LiteralInteger115.setName("LiteralInteger115");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113_LiteralInteger115.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113_LiteralInteger115.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34::LiteralInteger36
		addToElementRepository("LiteralInteger36", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralInteger36);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralInteger36.setName("LiteralInteger36");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralInteger36.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralInteger36.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145::LiteralInteger147
		addToElementRepository("LiteralInteger147", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145_LiteralInteger147);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145_LiteralInteger147.setName("LiteralInteger147");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145_LiteralInteger147.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145_LiteralInteger147.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send Continue_target::LiteralInteger158
		addToElementRepository("LiteralInteger158", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger158);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger158.setName("LiteralInteger158");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger158.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralInteger158.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q_result::LiteralInteger33
		addToElementRepository("LiteralInteger33", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger33);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger33.setName("LiteralInteger33");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger33.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralInteger33.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_Tester()_target::LiteralInteger5
		addToElementRepository("LiteralInteger5", MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target_LiteralInteger5);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target_LiteralInteger5.setName("LiteralInteger5");
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target_LiteralInteger5.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target_LiteralInteger5.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16::LiteralInteger17
		addToElementRepository("LiteralInteger17", MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16_LiteralInteger17);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16_LiteralInteger17.setName("LiteralInteger17");
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16_LiteralInteger17.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16_LiteralInteger17.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value(4)::LiteralInteger43
		addToElementRepository("LiteralInteger43", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger43);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger43.setName("LiteralInteger43");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger43.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger43.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27::LiteralInteger29
		addToElementRepository("LiteralInteger29", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27_LiteralInteger29);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27_LiteralInteger29.setName("LiteralInteger29");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27_LiteralInteger29.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27_LiteralInteger29.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_4_result::LiteralInteger38
		addToElementRepository("LiteralInteger38", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger38);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger38.setName("LiteralInteger38");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger38.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger38.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_3_result::LiteralInteger79
		addToElementRepository("LiteralInteger79", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger79);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger79.setName("LiteralInteger79");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger79.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger79.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result::LiteralInteger105
		addToElementRepository("LiteralInteger105", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result_LiteralInteger105);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result_LiteralInteger105.setName("LiteralInteger105");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result_LiteralInteger105.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result_LiteralInteger105.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a_result::LiteralInteger59
		addToElementRepository("LiteralInteger59", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger59);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger59.setName("LiteralInteger59");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger59.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralInteger59.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S_v::LiteralInteger84
		addToElementRepository("LiteralInteger84", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger84);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger84.setName("LiteralInteger84");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger84.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralInteger84.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S_t::LiteralInteger85
		addToElementRepository("LiteralInteger85", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger85);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger85.setName("LiteralInteger85");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger85.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralInteger85.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106::LiteralInteger108
		addToElementRepository("LiteralInteger108", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106_LiteralInteger108);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106_LiteralInteger108.setName("LiteralInteger108");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106_LiteralInteger108.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106_LiteralInteger108.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_R_x::LiteralInteger166
		addToElementRepository("LiteralInteger166", MultipleDelegation_SameConnector_P_P_Signal_R_x_LiteralInteger166);
		MultipleDelegation_SameConnector_P_P_Signal_R_x_LiteralInteger166.setName("LiteralInteger166");
		MultipleDelegation_SameConnector_P_P_Signal_R_x_LiteralInteger166.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_R_x_LiteralInteger166.setValue(0);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read this.a_object::LiteralInteger109
		addToElementRepository("LiteralInteger109", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger109);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger109.setName("LiteralInteger109");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger109.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralInteger109.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call testP_p::LiteralInteger98
		addToElementRepository("LiteralInteger98", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger98);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger98.setName("LiteralInteger98");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger98.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger98.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call testP_p::LiteralInteger97
		addToElementRepository("LiteralInteger97", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger97);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger97.setName("LiteralInteger97");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger97.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralInteger97.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13::LiteralInteger14
		addToElementRepository("LiteralInteger14", MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13_LiteralInteger14);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13_LiteralInteger14.setName("LiteralInteger14");
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13_LiteralInteger14.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13_LiteralInteger14.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read a.b_object::LiteralInteger100
		addToElementRepository("LiteralInteger100", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger100);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger100.setName("LiteralInteger100");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger100.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralInteger100.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_Send Start_target::LiteralInteger22
		addToElementRepository("LiteralInteger22", MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target_LiteralInteger22);
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target_LiteralInteger22.setName("LiteralInteger22");
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target_LiteralInteger22.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target_LiteralInteger22.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_4_result::LiteralInteger39
		addToElementRepository("LiteralInteger39", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger39);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger39.setName("LiteralInteger39");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger39.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralInteger39.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralInteger67
		addToElementRepository("LiteralInteger67", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger67);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger67.setName("LiteralInteger67");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger67.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger67.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralInteger65
		addToElementRepository("LiteralInteger65", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger65);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger65.setName("LiteralInteger65");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger65.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralInteger65.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52::LiteralInteger53
		addToElementRepository("LiteralInteger53", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52_LiteralInteger53);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52_LiteralInteger53.setName("LiteralInteger53");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52_LiteralInteger53.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52_LiteralInteger53.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set this.p_object::LiteralInteger131
		addToElementRepository("LiteralInteger131", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger131);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger131.setName("LiteralInteger131");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger131.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralInteger131.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read s.t_result::LiteralInteger161
		addToElementRepository("LiteralInteger161", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger161);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger161.setName("LiteralInteger161");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger161.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralInteger161.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read s.t_object::LiteralInteger160
		addToElementRepository("LiteralInteger160", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger160);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger160.setName("LiteralInteger160");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger160.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralInteger160.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept S_s::LiteralInteger124
		addToElementRepository("LiteralInteger124", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger124);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger124.setName("LiteralInteger124");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger124.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger124.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139::LiteralInteger141
		addToElementRepository("LiteralInteger141", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139_LiteralInteger141);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139_LiteralInteger141.setName("LiteralInteger141");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139_LiteralInteger141.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139_LiteralInteger141.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44::LiteralInteger46
		addToElementRepository("LiteralInteger46", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44_LiteralInteger46);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44_LiteralInteger46.setName("LiteralInteger46");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44_LiteralInteger46.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44_LiteralInteger46.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read a.b_result::LiteralInteger103
		addToElementRepository("LiteralInteger103", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger103);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger103.setName("LiteralInteger103");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger103.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralInteger103.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132::LiteralInteger134
		addToElementRepository("LiteralInteger134", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132_LiteralInteger134);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132_LiteralInteger134.setName("LiteralInteger134");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132_LiteralInteger134.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132_LiteralInteger134.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set this.p_value::LiteralInteger126
		addToElementRepository("LiteralInteger126", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger126);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger126.setName("LiteralInteger126");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger126.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralInteger126.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read s.v_object::LiteralInteger150
		addToElementRepository("LiteralInteger150", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger150);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger150.setName("LiteralInteger150");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger150.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralInteger150.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S_target::LiteralInteger88
		addToElementRepository("LiteralInteger88", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger88);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger88.setName("LiteralInteger88");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger88.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger88.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result::LiteralInteger152
		addToElementRepository("LiteralInteger152", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger152);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger152.setName("LiteralInteger152");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger152.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralInteger152.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_3_result::LiteralInteger80
		addToElementRepository("LiteralInteger80", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger80);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger80.setName("LiteralInteger80");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger80.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralInteger80.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_Start Tester_object::LiteralInteger7
		addToElementRepository("LiteralInteger7", MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object_LiteralInteger7);
		MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object_LiteralInteger7.setName("LiteralInteger7");
		MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object_LiteralInteger7.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object_LiteralInteger7.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read b.p_object::LiteralInteger94
		addToElementRepository("LiteralInteger94", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger94);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger94.setName("LiteralInteger94");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger94.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralInteger94.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24::LiteralInteger26
		addToElementRepository("LiteralInteger26", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24_LiteralInteger26);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24_LiteralInteger26.setName("LiteralInteger26");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24_LiteralInteger26.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24_LiteralInteger26.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135::LiteralInteger137
		addToElementRepository("LiteralInteger137", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135_LiteralInteger137);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135_LiteralInteger137.setName("LiteralInteger137");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135_LiteralInteger137.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135_LiteralInteger137.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19::LiteralInteger21
		addToElementRepository("LiteralInteger21", MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19_LiteralInteger21);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19_LiteralInteger21.setName("LiteralInteger21");
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19_LiteralInteger21.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19_LiteralInteger21.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_main_Tester()_result::LiteralInteger3
		addToElementRepository("LiteralInteger3", MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralInteger3);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralInteger3.setName("LiteralInteger3");
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralInteger3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralInteger3.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_1_result::LiteralInteger76
		addToElementRepository("LiteralInteger76", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger76);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger76.setName("LiteralInteger76");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger76.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger76.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_1_result::LiteralInteger77
		addToElementRepository("LiteralInteger77", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger77);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger77.setName("LiteralInteger77");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger77.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralInteger77.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read this.a_result::LiteralInteger111
		addToElementRepository("LiteralInteger111", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger111);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger111.setName("LiteralInteger111");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger111.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralInteger111.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read b.p_result::LiteralInteger95
		addToElementRepository("LiteralInteger95", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger95);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger95.setName("LiteralInteger95");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger95.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralInteger95.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62::LiteralInteger63
		addToElementRepository("LiteralInteger63", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralInteger63);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralInteger63.setName("LiteralInteger63");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralInteger63.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralInteger63.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_2_result::LiteralInteger50
		addToElementRepository("LiteralInteger50", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger50);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger50.setName("LiteralInteger50");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger50.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralInteger50.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a_object::LiteralInteger57
		addToElementRepository("LiteralInteger57", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger57);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger57.setName("LiteralInteger57");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger57.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralInteger57.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept S_s::LiteralInteger125
		addToElementRepository("LiteralInteger125", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger125);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger125.setName("LiteralInteger125");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger125.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralInteger125.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q_object::LiteralInteger30
		addToElementRepository("LiteralInteger30", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger30);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger30.setName("LiteralInteger30");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger30.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralInteger30.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value(4)_result::LiteralInteger42
		addToElementRepository("LiteralInteger42", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger42);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger42.setName("LiteralInteger42");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger42.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger42.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set this.p_result::LiteralInteger129
		addToElementRepository("LiteralInteger129", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger129);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger129.setName("LiteralInteger129");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger129.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralInteger129.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read s.t_object::LiteralUnlimitedNatural159
		addToElementRepository("LiteralUnlimitedNatural159", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural159);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural159.setName("LiteralUnlimitedNatural159");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural159.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object_LiteralUnlimitedNatural159.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set this.p_object::LiteralUnlimitedNatural130
		addToElementRepository("LiteralUnlimitedNatural130", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural130);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural130.setName("LiteralUnlimitedNatural130");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural130.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object_LiteralUnlimitedNatural130.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_main_Tester()_result::LiteralUnlimitedNatural1
		addToElementRepository("LiteralUnlimitedNatural1", MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural1);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural1.setName("LiteralUnlimitedNatural1");
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result_LiteralUnlimitedNatural1.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_main_Tester()_target::LiteralUnlimitedNatural4
		addToElementRepository("LiteralUnlimitedNatural4", MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural4);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural4.setName("LiteralUnlimitedNatural4");
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target_LiteralUnlimitedNatural4.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value(4)_result::LiteralUnlimitedNatural41
		addToElementRepository("LiteralUnlimitedNatural41", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural41);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural41.setName("LiteralUnlimitedNatural41");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural41.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural41.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_R_y::LiteralUnlimitedNatural169
		addToElementRepository("LiteralUnlimitedNatural169", MultipleDelegation_SameConnector_P_P_Signal_R_y_LiteralUnlimitedNatural169);
		MultipleDelegation_SameConnector_P_P_Signal_R_y_LiteralUnlimitedNatural169.setName("LiteralUnlimitedNatural169");
		MultipleDelegation_SameConnector_P_P_Signal_R_y_LiteralUnlimitedNatural169.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_R_y_LiteralUnlimitedNatural169.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start_result::LiteralUnlimitedNatural66
		addToElementRepository("LiteralUnlimitedNatural66", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural66);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural66.setName("LiteralUnlimitedNatural66");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural66.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural66.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172::LiteralUnlimitedNatural173
		addToElementRepository("LiteralUnlimitedNatural173", MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172_LiteralUnlimitedNatural173);
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172_LiteralUnlimitedNatural173.setName("LiteralUnlimitedNatural173");
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172_LiteralUnlimitedNatural173.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd172_LiteralUnlimitedNatural173.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result::LiteralUnlimitedNatural104
		addToElementRepository("LiteralUnlimitedNatural104", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural104);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural104.setName("LiteralUnlimitedNatural104");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural104.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result_LiteralUnlimitedNatural104.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a_object::LiteralUnlimitedNatural56
		addToElementRepository("LiteralUnlimitedNatural56", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural56);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural56.setName("LiteralUnlimitedNatural56");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural56.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object_LiteralUnlimitedNatural56.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_main_Start Tester_object::LiteralUnlimitedNatural6
		addToElementRepository("LiteralUnlimitedNatural6", MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural6);
		MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural6.setName("LiteralUnlimitedNatural6");
		MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural6.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object_LiteralUnlimitedNatural6.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a_result::LiteralUnlimitedNatural58
		addToElementRepository("LiteralUnlimitedNatural58", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural58);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural58.setName("LiteralUnlimitedNatural58");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural58.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result_LiteralUnlimitedNatural58.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read a.b_object::LiteralUnlimitedNatural101
		addToElementRepository("LiteralUnlimitedNatural101", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural101);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural101.setName("LiteralUnlimitedNatural101");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural101.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object_LiteralUnlimitedNatural101.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call testP_p::LiteralUnlimitedNatural99
		addToElementRepository("LiteralUnlimitedNatural99", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural99);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural99.setName("LiteralUnlimitedNatural99");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural99.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p_LiteralUnlimitedNatural99.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S_t::LiteralUnlimitedNatural86
		addToElementRepository("LiteralUnlimitedNatural86", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural86);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural86.setName("LiteralUnlimitedNatural86");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural86.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t_LiteralUnlimitedNatural86.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q_object::LiteralUnlimitedNatural31
		addToElementRepository("LiteralUnlimitedNatural31", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural31);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural31.setName("LiteralUnlimitedNatural31");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural31.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object_LiteralUnlimitedNatural31.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S_target::LiteralUnlimitedNatural87
		addToElementRepository("LiteralUnlimitedNatural87", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural87);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural87.setName("LiteralUnlimitedNatural87");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural87.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural87.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_A_b::LiteralUnlimitedNatural170
		addToElementRepository("LiteralUnlimitedNatural170", MultipleDelegation_SameConnector_P_P_Signal_A_b_LiteralUnlimitedNatural170);
		MultipleDelegation_SameConnector_P_P_Signal_A_b_LiteralUnlimitedNatural170.setName("LiteralUnlimitedNatural170");
		MultipleDelegation_SameConnector_P_P_Signal_A_b_LiteralUnlimitedNatural170.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_A_b_LiteralUnlimitedNatural170.setValue(4);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_2_result::LiteralUnlimitedNatural49
		addToElementRepository("LiteralUnlimitedNatural49", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural49);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural49.setName("LiteralUnlimitedNatural49");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural49.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result_LiteralUnlimitedNatural49.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q_result::LiteralUnlimitedNatural32
		addToElementRepository("LiteralUnlimitedNatural32", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural32);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural32.setName("LiteralUnlimitedNatural32");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural32.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result_LiteralUnlimitedNatural32.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept S_s::LiteralUnlimitedNatural123
		addToElementRepository("LiteralUnlimitedNatural123", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural123);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural123.setName("LiteralUnlimitedNatural123");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural123.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s_LiteralUnlimitedNatural123.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read b.p_object::LiteralUnlimitedNatural93
		addToElementRepository("LiteralUnlimitedNatural93", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural93);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural93.setName("LiteralUnlimitedNatural93");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural93.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object_LiteralUnlimitedNatural93.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read s.t_result::LiteralUnlimitedNatural162
		addToElementRepository("LiteralUnlimitedNatural162", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural162);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural162.setName("LiteralUnlimitedNatural162");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural162.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result_LiteralUnlimitedNatural162.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read s.v_result::LiteralUnlimitedNatural149
		addToElementRepository("LiteralUnlimitedNatural149", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural149);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural149.setName("LiteralUnlimitedNatural149");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural149.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result_LiteralUnlimitedNatural149.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_R_x::LiteralUnlimitedNatural167
		addToElementRepository("LiteralUnlimitedNatural167", MultipleDelegation_SameConnector_P_P_Signal_R_x_LiteralUnlimitedNatural167);
		MultipleDelegation_SameConnector_P_P_Signal_R_x_LiteralUnlimitedNatural167.setName("LiteralUnlimitedNatural167");
		MultipleDelegation_SameConnector_P_P_Signal_R_x_LiteralUnlimitedNatural167.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_R_x_LiteralUnlimitedNatural167.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd175::LiteralUnlimitedNatural176
		addToElementRepository("LiteralUnlimitedNatural176", MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd175_LiteralUnlimitedNatural176);
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd175_LiteralUnlimitedNatural176.setName("LiteralUnlimitedNatural176");
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd175_LiteralUnlimitedNatural176.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_A_r_ConnectorEnd175_LiteralUnlimitedNatural176.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read this.a_result::LiteralUnlimitedNatural112
		addToElementRepository("LiteralUnlimitedNatural112", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural112);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural112.setName("LiteralUnlimitedNatural112");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural112.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result_LiteralUnlimitedNatural112.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_3_result::LiteralUnlimitedNatural81
		addToElementRepository("LiteralUnlimitedNatural81", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural81);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural81.setName("LiteralUnlimitedNatural81");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural81.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result_LiteralUnlimitedNatural81.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read b.p_result::LiteralUnlimitedNatural96
		addToElementRepository("LiteralUnlimitedNatural96", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural96);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural96.setName("LiteralUnlimitedNatural96");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural96.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result_LiteralUnlimitedNatural96.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set this.p_value::LiteralUnlimitedNatural127
		addToElementRepository("LiteralUnlimitedNatural127", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural127);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural127.setName("LiteralUnlimitedNatural127");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural127.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value_LiteralUnlimitedNatural127.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send S_v::LiteralUnlimitedNatural83
		addToElementRepository("LiteralUnlimitedNatural83", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural83);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural83.setName("LiteralUnlimitedNatural83");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural83.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v_LiteralUnlimitedNatural83.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_1_result::LiteralUnlimitedNatural75
		addToElementRepository("LiteralUnlimitedNatural75", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural75);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural75.setName("LiteralUnlimitedNatural75");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural75.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result_LiteralUnlimitedNatural75.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result::LiteralUnlimitedNatural60
		addToElementRepository("LiteralUnlimitedNatural60", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural60);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural60.setName("LiteralUnlimitedNatural60");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural60.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural60.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call test()_target::LiteralUnlimitedNatural90
		addToElementRepository("LiteralUnlimitedNatural90", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural90);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural90.setName("LiteralUnlimitedNatural90");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural90.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural90.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send Continue_target::LiteralUnlimitedNatural157
		addToElementRepository("LiteralUnlimitedNatural157", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural157);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural157.setName("LiteralUnlimitedNatural157");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural157.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural157.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read a.b_result::LiteralUnlimitedNatural102
		addToElementRepository("LiteralUnlimitedNatural102", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural102);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural102.setName("LiteralUnlimitedNatural102");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural102.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result_LiteralUnlimitedNatural102.setValue(4);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_main_Create Tester_result::LiteralUnlimitedNatural12
		addToElementRepository("LiteralUnlimitedNatural12", MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural12);
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural12.setName("LiteralUnlimitedNatural12");
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural12.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result_LiteralUnlimitedNatural12.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read s.v_object::LiteralUnlimitedNatural151
		addToElementRepository("LiteralUnlimitedNatural151", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural151);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural151.setName("LiteralUnlimitedNatural151");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural151.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object_LiteralUnlimitedNatural151.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_4_result::LiteralUnlimitedNatural40
		addToElementRepository("LiteralUnlimitedNatural40", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural40);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural40.setName("LiteralUnlimitedNatural40");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural40.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result_LiteralUnlimitedNatural40.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result::LiteralUnlimitedNatural153
		addToElementRepository("LiteralUnlimitedNatural153", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural153);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural153.setName("LiteralUnlimitedNatural153");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural153.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result_LiteralUnlimitedNatural153.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set this.p_result::LiteralUnlimitedNatural128
		addToElementRepository("LiteralUnlimitedNatural128", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural128);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural128.setName("LiteralUnlimitedNatural128");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural128.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result_LiteralUnlimitedNatural128.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_main_Send Start_target::LiteralUnlimitedNatural23
		addToElementRepository("LiteralUnlimitedNatural23", MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural23);
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural23.setName("LiteralUnlimitedNatural23");
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural23.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target_LiteralUnlimitedNatural23.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read this.a_object::LiteralUnlimitedNatural110
		addToElementRepository("LiteralUnlimitedNatural110", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural110);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural110.setName("LiteralUnlimitedNatural110");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural110.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object_LiteralUnlimitedNatural110.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow24
		addToElementRepository("ObjectFlow24", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24.setName("ObjectFlow24");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24.setGuard(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow24_LiteralBoolean25);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow27
		addToElementRepository("ObjectFlow27", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27.setName("ObjectFlow27");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27.setGuard(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow27_LiteralBoolean28);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_main::ObjectFlow8
		addToElementRepository("ObjectFlow8", MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8.setName("ObjectFlow8");
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8.setSource(MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8.setTarget(MultipleDelegation_SameConnector_P_P_Signal_main_Fork_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8.setGuard(MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow8_LiteralBoolean9);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::ObjectFlow132
		addToElementRepository("ObjectFlow132", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132.setName("ObjectFlow132");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132.setSource(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132.setTarget(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132.setGuard(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow132_LiteralBoolean133);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::ObjectFlow135
		addToElementRepository("ObjectFlow135", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135.setName("ObjectFlow135");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135.setSource(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135.setTarget(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_value);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135.setGuard(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow135_LiteralBoolean136);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity::ObjectFlow106
		addToElementRepository("ObjectFlow106", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106.setName("ObjectFlow106");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106.setGuard(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow106_LiteralBoolean107);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow34
		addToElementRepository("ObjectFlow34", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34.setName("ObjectFlow34");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Call_test__target);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34.setGuard(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow34_LiteralBoolean35);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow62
		addToElementRepository("ObjectFlow62", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62.setName("ObjectFlow62");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62.setGuard(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow62_LiteralBoolean64);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_main::ObjectFlow19
		addToElementRepository("ObjectFlow19", MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19.setName("ObjectFlow19");
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19.setSource(MultipleDelegation_SameConnector_P_P_Signal_main_Fork_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19.setTarget(MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19.setGuard(MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow19_LiteralBoolean20);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity::ObjectFlow119
		addToElementRepository("ObjectFlow119", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119.setName("ObjectFlow119");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119.setGuard(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow119_LiteralBoolean120);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::ObjectFlow139
		addToElementRepository("ObjectFlow139", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139.setName("ObjectFlow139");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139.setSource(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139.setTarget(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139.setGuard(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow139_LiteralBoolean140);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow69
		addToElementRepository("ObjectFlow69", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69.setName("ObjectFlow69");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69.setGuard(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow69_LiteralBoolean70);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow44
		addToElementRepository("ObjectFlow44", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44.setName("ObjectFlow44");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44.setGuard(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow44_LiteralBoolean45);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::ObjectFlow142
		addToElementRepository("ObjectFlow142", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142.setName("ObjectFlow142");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142.setSource(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Fork_s);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142.setTarget(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142.setGuard(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow142_LiteralBoolean144);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::ObjectFlow145
		addToElementRepository("ObjectFlow145", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145.setName("ObjectFlow145");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145.setSource(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145.setTarget(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_object);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145.setGuard(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow145_LiteralBoolean146);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::ObjectFlow154
		addToElementRepository("ObjectFlow154", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154.setName("ObjectFlow154");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154.setSource(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154.setTarget(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154.setGuard(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_ObjectFlow154_LiteralBoolean156);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_main::ObjectFlow16
		addToElementRepository("ObjectFlow16", MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16.setName("ObjectFlow16");
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16.setSource(MultipleDelegation_SameConnector_P_P_Signal_main_Fork_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16.setTarget(MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16.setGuard(MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow16_LiteralBoolean18);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity::ObjectFlow113
		addToElementRepository("ObjectFlow113", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113.setName("ObjectFlow113");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Call_testP_p);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113.setGuard(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow113_LiteralBoolean114);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_main::ObjectFlow13
		addToElementRepository("ObjectFlow13", MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13.setName("ObjectFlow13");
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13.setSource(MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13.setTarget(MultipleDelegation_SameConnector_P_P_Signal_main_Tester__target);
		MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13.setGuard(MultipleDelegation_SameConnector_P_P_Signal_main_ObjectFlow13_LiteralBoolean15);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity::ObjectFlow116
		addToElementRepository("ObjectFlow116", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116.setName("ObjectFlow116");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116.setGuard(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_ObjectFlow116_LiteralBoolean118);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::ObjectFlow52
		addToElementRepository("ObjectFlow52", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52.setName("ObjectFlow52");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52.setSource(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Fork_this);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52.setGuard(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_ObjectFlow52_LiteralBoolean54);
	}

	private void initializeOperation_Instances()
	{
		// Operation MultipleDelegation_SameConnector_P_P_Signal_B::B_B
		addToElementRepository("B_B", MultipleDelegation_SameConnector_P_P_Signal_B_B_B);
		MultipleDelegation_SameConnector_P_P_Signal_B_B_B.setName("B");
		MultipleDelegation_SameConnector_P_P_Signal_B_B_B.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_B_B.addOwnedParameter(MultipleDelegation_SameConnector_P_P_Signal_B_B_B_result);
		MultipleDelegation_SameConnector_P_P_Signal_B_B_B.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_SameConnector_P_P_Signal_AbstractTester::test
		addToElementRepository("test", MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_test);
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_test.setName("test");
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_test.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_test.setIsAbstract(true);
		// Operation MultipleDelegation_SameConnector_P_P_Signal_Tester::Tester_Tester
		addToElementRepository("Tester_Tester", MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester.setName("Tester");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester.addOwnedParameter(MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_SameConnector_P_P_Signal_A::A_A
		addToElementRepository("A_A", MultipleDelegation_SameConnector_P_P_Signal_A_A_A);
		MultipleDelegation_SameConnector_P_P_Signal_A_A_A.setName("A");
		MultipleDelegation_SameConnector_P_P_Signal_A_A_A.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_A_A_A.addOwnedParameter(MultipleDelegation_SameConnector_P_P_Signal_A_A_A_result);
		MultipleDelegation_SameConnector_P_P_Signal_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_SameConnector_P_P_Signal_Tester::test
		addToElementRepository("test", MultipleDelegation_SameConnector_P_P_Signal_Tester_test);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_test.setName("test");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_test.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_test.addMethod(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_main_Create Tester::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result);
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Create_Tester_result.setType(MultipleDelegation_SameConnector_P_P_Signal_Tester);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result.setType(MultipleDelegation_SameConnector_P_P_Signal_B);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read s.v::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_main_Tester()::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Tester__result.setType(MultipleDelegation_SameConnector_P_P_Signal_Tester);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result.setType(MultipleDelegation_SameConnector_P_P_Signal_Tester);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_1::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_result.setType(MultipleDelegation_SameConnector_P_P_Signal_Continue);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read a.q::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result.setType(MultipleDelegation_SameConnector_P_P_Signal_IImpl);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_3::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_result.setType(MultipleDelegation_SameConnector_P_P_Signal_Continue);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read this.a::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result.setType(MultipleDelegation_SameConnector_P_P_Signal_A);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_2::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_result.setType(MultipleDelegation_SameConnector_P_P_Signal_Continue);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read a.b::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result.setType(MultipleDelegation_SameConnector_P_P_Signal_B);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result.setUpper(4);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result.setLower(4);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_result.setType(MultipleDelegation_SameConnector_P_P_Signal_Start);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read s.t::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result.setType(MultipleDelegation_SameConnector_P_P_Signal_AbstractTester);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value(4)::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read this.a::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result.setType(MultipleDelegation_SameConnector_P_P_Signal_A);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set this.p::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Set_this_p_result.setType(MultipleDelegation_SameConnector_P_P_Signal_B);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_4::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_result.setType(MultipleDelegation_SameConnector_P_P_Signal_Continue);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read b.p::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result.setType(MultipleDelegation_SameConnector_P_P_Signal_Tester);
		// OutputPin MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept S::s
		addToElementRepository("s", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s.setName("s");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_s.setType(MultipleDelegation_SameConnector_P_P_Signal_S);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport MultipleDelegation_SameConnector_P_P_Signal::PackageImport164
		addToElementRepository("PackageImport164", MultipleDelegation_SameConnector_P_P_Signal_PackageImport164);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP_p);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP_p.setName("p");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_SameConnector_P_P_Signal_A_A_A::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_A_A_A_result);
		MultipleDelegation_SameConnector_P_P_Signal_A_A_A_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_A_A_A_result.setType(MultipleDelegation_SameConnector_P_P_Signal_A);
		MultipleDelegation_SameConnector_P_P_Signal_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester_result);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester_result.setType(MultipleDelegation_SameConnector_P_P_Signal_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_Tester_Tester_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_SameConnector_P_P_Signal_B_B_B::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Signal_B_B_B_result);
		MultipleDelegation_SameConnector_P_P_Signal_B_B_B_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Signal_B_B_B_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_B_B_B_result.setType(MultipleDelegation_SameConnector_P_P_Signal_B);
		MultipleDelegation_SameConnector_P_P_Signal_B_B_B_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port MultipleDelegation_SameConnector_P_P_Signal_A::q
		addToElementRepository("q", MultipleDelegation_SameConnector_P_P_Signal_A_q);
		MultipleDelegation_SameConnector_P_P_Signal_A_q.setName("q");
		MultipleDelegation_SameConnector_P_P_Signal_A_q.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_A_q.setType(MultipleDelegation_SameConnector_P_P_Signal_IImpl);
		MultipleDelegation_SameConnector_P_P_Signal_A_q.setAggregation(AggregationKind.composite);
		MultipleDelegation_SameConnector_P_P_Signal_A_q.isService = true;
		MultipleDelegation_SameConnector_P_P_Signal_A_q.addProvided(MultipleDelegation_SameConnector_P_P_Signal_I);
	}

	private void initializeProperty_Instances()
	{
		// Property MultipleDelegation_SameConnector_P_P_Signal_R::x
		addToElementRepository("x", MultipleDelegation_SameConnector_P_P_Signal_R_x);
		MultipleDelegation_SameConnector_P_P_Signal_R_x.setName("x");
		MultipleDelegation_SameConnector_P_P_Signal_R_x.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_R_x.setUpper(-1);
		MultipleDelegation_SameConnector_P_P_Signal_R_x.setLower(0);
		MultipleDelegation_SameConnector_P_P_Signal_R_x.setType(MultipleDelegation_SameConnector_P_P_Signal_B);
		// Property MultipleDelegation_SameConnector_P_P_Signal_B::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_P_Signal_B_p);
		MultipleDelegation_SameConnector_P_P_Signal_B_p.setName("p");
		MultipleDelegation_SameConnector_P_P_Signal_B_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property MultipleDelegation_SameConnector_P_P_Signal_S::t
		addToElementRepository("t", MultipleDelegation_SameConnector_P_P_Signal_S_t);
		MultipleDelegation_SameConnector_P_P_Signal_S_t.setName("t");
		MultipleDelegation_SameConnector_P_P_Signal_S_t.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_S_t.setType(MultipleDelegation_SameConnector_P_P_Signal_AbstractTester);
		// Property MultipleDelegation_SameConnector_P_P_Signal_A::b
		addToElementRepository("b", MultipleDelegation_SameConnector_P_P_Signal_A_b);
		MultipleDelegation_SameConnector_P_P_Signal_A_b.setName("b");
		MultipleDelegation_SameConnector_P_P_Signal_A_b.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_A_b.setUpper(4);
		MultipleDelegation_SameConnector_P_P_Signal_A_b.setLower(4);
		MultipleDelegation_SameConnector_P_P_Signal_A_b.setType(MultipleDelegation_SameConnector_P_P_Signal_B);
		MultipleDelegation_SameConnector_P_P_Signal_A_b.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_SameConnector_P_P_Signal_R::y
		addToElementRepository("y", MultipleDelegation_SameConnector_P_P_Signal_R_y);
		MultipleDelegation_SameConnector_P_P_Signal_R_y.setName("y");
		MultipleDelegation_SameConnector_P_P_Signal_R_y.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_R_y.setUpper(-1);
		MultipleDelegation_SameConnector_P_P_Signal_R_y.setLower(0);
		MultipleDelegation_SameConnector_P_P_Signal_R_y.setType(MultipleDelegation_SameConnector_P_P_Signal_IImpl);
		// Property MultipleDelegation_SameConnector_P_P_Signal_S::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_P_Signal_S_v);
		MultipleDelegation_SameConnector_P_P_Signal_S_v.setName("v");
		MultipleDelegation_SameConnector_P_P_Signal_S_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_S_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property MultipleDelegation_SameConnector_P_P_Signal_Tester::a
		addToElementRepository("a", MultipleDelegation_SameConnector_P_P_Signal_Tester_a);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_a.setName("a");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_a.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_Tester_a.setType(MultipleDelegation_SameConnector_P_P_Signal_A);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_a.setAggregation(AggregationKind.composite);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity::this
		addToElementRepository("this", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this.setName("this");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this.setResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_this_result);
		// ReadSelfAction MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::this
		addToElementRepository("this", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this.setName("this");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this.setResult(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_this_result);
		// ReadSelfAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::this
		addToElementRepository("this", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this.setName("this");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this.setResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity::Read b.p
		addToElementRepository("Read b.p", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p.setName("Read b.p");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p.setStructuralFeature(MultipleDelegation_SameConnector_P_P_Signal_B_p);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p.setObject(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p.setResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_b_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::Read this.a
		addToElementRepository("Read this.a", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setName("Read this.a");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setStructuralFeature(MultipleDelegation_SameConnector_P_P_Signal_Tester_a);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setObject(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a.setResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_this_a_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity::Read a.b
		addToElementRepository("Read a.b", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b.setName("Read a.b");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b.setStructuralFeature(MultipleDelegation_SameConnector_P_P_Signal_A_b);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b.setObject(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b.setResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_a_b_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::Read s.v
		addToElementRepository("Read s.v", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v.setName("Read s.v");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v.setStructuralFeature(MultipleDelegation_SameConnector_P_P_Signal_S_v);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v.setObject(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_object);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v.setResult(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_v_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::Read a.q
		addToElementRepository("Read a.q", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setName("Read a.q");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setStructuralFeature(MultipleDelegation_SameConnector_P_P_Signal_A_q);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setObject(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q.setResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Read_a_q_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity::Read this.a
		addToElementRepository("Read this.a", MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a.setName("Read this.a");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a.setStructuralFeature(MultipleDelegation_SameConnector_P_P_Signal_Tester_a);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a.setObject(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_object);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a.setResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_testActivity_Read_this_a_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::Read s.t
		addToElementRepository("Read s.t", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t.setName("Read s.t");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t.setStructuralFeature(MultipleDelegation_SameConnector_P_P_Signal_S_t);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t.setObject(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_object);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t.setResult(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Read_s_t_result);
	}

	private void initializeReception_Instances()
	{
		// Reception MultipleDelegation_SameConnector_P_P_Signal_AbstractTester::Continue
		addToElementRepository("Continue", MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_Continue);
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_Continue.setName("Continue");
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_Continue.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_Continue.setSignal(MultipleDelegation_SameConnector_P_P_Signal_Continue);
		// Reception MultipleDelegation_SameConnector_P_P_Signal_I::S
		addToElementRepository("S", MultipleDelegation_SameConnector_P_P_Signal_I_S);
		MultipleDelegation_SameConnector_P_P_Signal_I_S.setName("S");
		MultipleDelegation_SameConnector_P_P_Signal_I_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_I_S.setSignal(MultipleDelegation_SameConnector_P_P_Signal_S);
		// Reception MultipleDelegation_SameConnector_P_P_Signal_B::S
		addToElementRepository("S", MultipleDelegation_SameConnector_P_P_Signal_B_S);
		MultipleDelegation_SameConnector_P_P_Signal_B_S.setName("S");
		MultipleDelegation_SameConnector_P_P_Signal_B_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_S.setSignal(MultipleDelegation_SameConnector_P_P_Signal_S);
		// Reception MultipleDelegation_SameConnector_P_P_Signal_IImpl::S
		addToElementRepository("S", MultipleDelegation_SameConnector_P_P_Signal_IImpl_S);
		MultipleDelegation_SameConnector_P_P_Signal_IImpl_S.setName("S");
		MultipleDelegation_SameConnector_P_P_Signal_IImpl_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_IImpl_S.setSignal(MultipleDelegation_SameConnector_P_P_Signal_S);
		// Reception MultipleDelegation_SameConnector_P_P_Signal_AbstractTester::Start
		addToElementRepository("Start", MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_Start);
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_Start.setName("Start");
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_Start.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_AbstractTester_Start.setSignal(MultipleDelegation_SameConnector_P_P_Signal_Start);
	}

	private void initializeSendSignalAction_Instances()
	{
		// SendSignalAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::Send S
		addToElementRepository("Send S", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S.setName("Send S");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S.setSignal(MultipleDelegation_SameConnector_P_P_Signal_S);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S.setTarget(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_target);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S.addArgument(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_v);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S.addArgument(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Send_S_t);
		// SendSignalAction MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior::Send Continue
		addToElementRepository("Send Continue", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue.setName("Send Continue");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue.setSignal(MultipleDelegation_SameConnector_P_P_Signal_Continue);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue.setTarget(MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Send_Continue_target);
		// SendSignalAction MultipleDelegation_SameConnector_P_P_Signal_main::Send Start
		addToElementRepository("Send Start", MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start);
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start.setName("Send Start");
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start.setSignal(MultipleDelegation_SameConnector_P_P_Signal_Start);
		MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start.setTarget(MultipleDelegation_SameConnector_P_P_Signal_main_Send_Start_target);
	}

	private void initializeSignal_Instances()
	{
		// Signal MultipleDelegation_SameConnector_P_P_Signal::S
		addToElementRepository("S", MultipleDelegation_SameConnector_P_P_Signal_S);
		MultipleDelegation_SameConnector_P_P_Signal_S.setName("S");
		MultipleDelegation_SameConnector_P_P_Signal_S.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Signal_S.addOwnedAttribute(MultipleDelegation_SameConnector_P_P_Signal_S_v);
		MultipleDelegation_SameConnector_P_P_Signal_S.addOwnedAttribute(MultipleDelegation_SameConnector_P_P_Signal_S_t);
		// Signal MultipleDelegation_SameConnector_P_P_Signal::Continue
		addToElementRepository("Continue", MultipleDelegation_SameConnector_P_P_Signal_Continue);
		MultipleDelegation_SameConnector_P_P_Signal_Continue.setName("Continue");
		MultipleDelegation_SameConnector_P_P_Signal_Continue.setVisibility(VisibilityKind.public_);
		// Signal MultipleDelegation_SameConnector_P_P_Signal::Start
		addToElementRepository("Start", MultipleDelegation_SameConnector_P_P_Signal_Start);
		MultipleDelegation_SameConnector_P_P_Signal_Start.setName("Start");
		MultipleDelegation_SameConnector_P_P_Signal_Start.setVisibility(VisibilityKind.public_);
	}

	private void initializeSignalEvent_Instances()
	{
		// SignalEvent MultipleDelegation_SameConnector_P_P_Signal::StartEvent
		addToElementRepository("StartEvent", MultipleDelegation_SameConnector_P_P_Signal_StartEvent);
		MultipleDelegation_SameConnector_P_P_Signal_StartEvent.setName("StartEvent");
		MultipleDelegation_SameConnector_P_P_Signal_StartEvent.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_StartEvent.setSignal(MultipleDelegation_SameConnector_P_P_Signal_Start);
		// SignalEvent MultipleDelegation_SameConnector_P_P_Signal::ContinueEvent
		addToElementRepository("ContinueEvent", MultipleDelegation_SameConnector_P_P_Signal_ContinueEvent);
		MultipleDelegation_SameConnector_P_P_Signal_ContinueEvent.setName("ContinueEvent");
		MultipleDelegation_SameConnector_P_P_Signal_ContinueEvent.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_ContinueEvent.setSignal(MultipleDelegation_SameConnector_P_P_Signal_Continue);
		// SignalEvent MultipleDelegation_SameConnector_P_P_Signal::SEvent
		addToElementRepository("SEvent", MultipleDelegation_SameConnector_P_P_Signal_SEvent);
		MultipleDelegation_SameConnector_P_P_Signal_SEvent.setName("SEvent");
		MultipleDelegation_SameConnector_P_P_Signal_SEvent.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_SEvent.setSignal(MultipleDelegation_SameConnector_P_P_Signal_S);
	}

	private void initializeStartObjectBehaviorAction_Instances()
	{
		// StartObjectBehaviorAction MultipleDelegation_SameConnector_P_P_Signal_main::Start Tester
		addToElementRepository("Start Tester", MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester);
		MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester.setName("Start Tester");
		MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester.setObject(MultipleDelegation_SameConnector_P_P_Signal_main_Start_Tester_object);
	}

	private void initializeTrigger_Instances()
	{
		// Trigger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_1::Trigger74
		addToElementRepository("Trigger74", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger74);
		// Trigger Trigger74
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger74.setName("Trigger74");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger74.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_1_Trigger74.setEvent(MultipleDelegation_SameConnector_P_P_Signal_ContinueEvent);
		// Trigger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_3::Trigger78
		addToElementRepository("Trigger78", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger78);
		// Trigger Trigger78
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger78.setName("Trigger78");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger78.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_3_Trigger78.setEvent(MultipleDelegation_SameConnector_P_P_Signal_ContinueEvent);
		// Trigger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_2::Trigger48
		addToElementRepository("Trigger48", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger48);
		// Trigger Trigger48
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger48.setName("Trigger48");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger48.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_2_Trigger48.setEvent(MultipleDelegation_SameConnector_P_P_Signal_ContinueEvent);
		// Trigger MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept S::Trigger122
		addToElementRepository("Trigger122", MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger122);
		// Trigger Trigger122
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger122.setName("Trigger122");
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger122.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_B_BClassifierBehavior_Accept_S_Trigger122.setEvent(MultipleDelegation_SameConnector_P_P_Signal_SEvent);
		// Trigger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Continue_4::Trigger37
		addToElementRepository("Trigger37", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger37);
		// Trigger Trigger37
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger37.setName("Trigger37");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger37.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Continue_4_Trigger37.setEvent(MultipleDelegation_SameConnector_P_P_Signal_ContinueEvent);
		// Trigger MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept Start::Trigger68
		addToElementRepository("Trigger68", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger68);
		// Trigger Trigger68
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger68.setName("Trigger68");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger68.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Accept_Start_Trigger68.setEvent(MultipleDelegation_SameConnector_P_P_Signal_StartEvent);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior::Value(4)
		addToElementRepository("Value(4)", MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4.setName("Value(4)");
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4.setValue(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_LiteralInteger43);
		MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4.setResult(MultipleDelegation_SameConnector_P_P_Signal_Tester_TesterClassifierBehavior_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // MultipleDelegation_SameConnector_P_P_SignalModel
