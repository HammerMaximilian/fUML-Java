/*
 * BehaviorPort_OperationModel.java
 * 
 * Auto-generated file
 */
package BehaviorPort_Operation;

import uml.commonbehavior.SignalEvent;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.simpleclassifiers.Signal;
import uml.activities.Activity;
import uml.commonstructure.VisibilityKind;
import uml.simpleclassifiers.Interface;
import uml.commonbehavior.CallEvent;
import uml.classification.Operation;
import uml.commonstructure.PackageImport;
import uml.activities.ControlFlow;
import uml.actions.ValueSpecificationAction;
import uml.actions.CreateObjectAction;
import uml.commonbehavior.FunctionBehavior;
import uml.classification.Property;
import utils.primitivetypes.PrimitiveTypesModel;
import uml.classification.ParameterDirectionKind;
import uml.activities.InitialNode;
import uml.actions.AddStructuralFeatureValueAction;
import uml.actions.StartObjectBehaviorAction;
import utils.library.FoundationalModelLibraryModel;
import uml.simpleclassifiers.Reception;
import utils.environment.InMemoryModel;
import uml.values.LiteralInteger;
import uml.packages.Package;
import uml.structuredclassifiers.ConnectorEnd;
import uml.structuredclassifiers.Connector;
import uml.actions.AcceptCallAction;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.InterfaceRealization;
import uml.actions.OutputPin;
import uml.actions.CallOperationAction;
import uml.actions.ReadStructuralFeatureAction;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.values.LiteralString;
import uml.commonstructure.Comment;
import uml.classification.Parameter;
import uml.activities.ActivityParameterNode;
import uml.classification.AggregationKind;
import uml.activities.ForkNode;
import uml.commonstructure.Usage;
import uml.actions.CallBehaviorAction;
import uml.simpleclassifiers.PrimitiveType;
import uml.actions.AcceptEventAction;
import uml.activities.ObjectFlow;
import uml.commonbehavior.OpaqueBehavior;
import uml.actions.ReplyAction;
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

public class BehaviorPort_OperationModel extends InMemoryModel
{
	private static BehaviorPort_OperationModel instance;

	/*
	 * Model BehaviorPort_Operation
	 */
	public Package BehaviorPort_Operation = new Package();
		public Interface BehaviorPort_Operation_I = new Interface();
			public Operation BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean = new Operation();
				public Parameter BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_b = new Parameter();
				public Parameter BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_result = new Parameter();
				public Parameter BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_c = new Parameter();
				public Parameter BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_a = new Parameter();
		public Activity BehaviorPort_Operation_main = new Activity();
			public ObjectFlow BehaviorPort_Operation_main_ObjectFlow0 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Operation_main_ObjectFlow0_LiteralInteger1 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Operation_main_ObjectFlow0_LiteralBoolean2 = new LiteralBoolean();
			public CallBehaviorAction BehaviorPort_Operation_main_assertP = new CallBehaviorAction();
				public InputPin BehaviorPort_Operation_main_assertP_p = new InputPin();
					public LiteralInteger BehaviorPort_Operation_main_assertP_p_LiteralInteger3 = new LiteralInteger();
					public LiteralInteger BehaviorPort_Operation_main_assertP_p_LiteralInteger4 = new LiteralInteger();
					public LiteralUnlimitedNatural BehaviorPort_Operation_main_assertP_p_LiteralUnlimitedNatural5 = new LiteralUnlimitedNatural();
			public ObjectFlow BehaviorPort_Operation_main_ObjectFlow6 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Operation_main_ObjectFlow6_LiteralInteger7 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Operation_main_ObjectFlow6_LiteralBoolean8 = new LiteralBoolean();
			public ForkNode BehaviorPort_Operation_main_Fork_s_p = new ForkNode();
			public CallOperationAction BehaviorPort_Operation_main_S_ = new CallOperationAction();
				public InputPin BehaviorPort_Operation_main_S__target = new InputPin();
					public LiteralUnlimitedNatural BehaviorPort_Operation_main_S__target_LiteralUnlimitedNatural9 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_main_S__target_LiteralInteger10 = new LiteralInteger();
				public OutputPin BehaviorPort_Operation_main_S__result = new OutputPin();
					public LiteralUnlimitedNatural BehaviorPort_Operation_main_S__result_LiteralUnlimitedNatural11 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_main_S__result_LiteralInteger12 = new LiteralInteger();
					public LiteralInteger BehaviorPort_Operation_main_S__result_LiteralInteger13 = new LiteralInteger();
			public CreateObjectAction BehaviorPort_Operation_main_Create_S = new CreateObjectAction();
				public OutputPin BehaviorPort_Operation_main_Create_S_result = new OutputPin();
					public LiteralUnlimitedNatural BehaviorPort_Operation_main_Create_S_result_LiteralUnlimitedNatural14 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_main_Create_S_result_LiteralInteger15 = new LiteralInteger();
			public ReadStructuralFeatureAction BehaviorPort_Operation_main_s_p = new ReadStructuralFeatureAction();
				public InputPin BehaviorPort_Operation_main_s_p_s = new InputPin();
					public LiteralInteger BehaviorPort_Operation_main_s_p_s_LiteralInteger16 = new LiteralInteger();
					public LiteralUnlimitedNatural BehaviorPort_Operation_main_s_p_s_LiteralUnlimitedNatural17 = new LiteralUnlimitedNatural();
				public OutputPin BehaviorPort_Operation_main_s_p_result = new OutputPin();
					public LiteralInteger BehaviorPort_Operation_main_s_p_result_LiteralInteger18 = new LiteralInteger();
					public LiteralUnlimitedNatural BehaviorPort_Operation_main_s_p_result_LiteralUnlimitedNatural19 = new LiteralUnlimitedNatural();
			public ControlFlow BehaviorPort_Operation_main_ControlFlow20 = new ControlFlow();
			public ObjectFlow BehaviorPort_Operation_main_ObjectFlow21 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Operation_main_ObjectFlow21_LiteralInteger22 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Operation_main_ObjectFlow21_LiteralBoolean23 = new LiteralBoolean();
			public SendSignalAction BehaviorPort_Operation_main_Send_Start = new SendSignalAction();
				public InputPin BehaviorPort_Operation_main_Send_Start_target = new InputPin();
					public LiteralUnlimitedNatural BehaviorPort_Operation_main_Send_Start_target_LiteralUnlimitedNatural24 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_main_Send_Start_target_LiteralInteger25 = new LiteralInteger();
			public ObjectFlow BehaviorPort_Operation_main_ObjectFlow26 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Operation_main_ObjectFlow26_LiteralInteger27 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Operation_main_ObjectFlow26_LiteralBoolean28 = new LiteralBoolean();
			public ObjectFlow BehaviorPort_Operation_main_ObjectFlow29 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Operation_main_ObjectFlow29_LiteralInteger30 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Operation_main_ObjectFlow29_LiteralBoolean31 = new LiteralBoolean();
		public Class_ BehaviorPort_Operation_P = new Class_();
			public Reception BehaviorPort_Operation_P_Start = new Reception();
			public Port BehaviorPort_Operation_P_pp = new Port();
			public Activity BehaviorPort_Operation_P_P_Factory = new Activity();
				public ActivityParameterNode BehaviorPort_Operation_P_P_Factory_resultParameterNode = new ActivityParameterNode();
					public LiteralInteger BehaviorPort_Operation_P_P_Factory_resultParameterNode_LiteralInteger32 = new LiteralInteger();
				public ForkNode BehaviorPort_Operation_P_P_Factory_Fork_object = new ForkNode();
				public ObjectFlow BehaviorPort_Operation_P_P_Factory_ObjectFlow33 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Operation_P_P_Factory_ObjectFlow33_LiteralBoolean34 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Operation_P_P_Factory_ObjectFlow33_LiteralInteger35 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Operation_P_P_Factory_ObjectFlow36 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Operation_P_P_Factory_ObjectFlow36_LiteralInteger37 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Operation_P_P_Factory_ObjectFlow36_LiteralBoolean38 = new LiteralBoolean();
				public StartObjectBehaviorAction BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior = new StartObjectBehaviorAction();
					public InputPin BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object = new InputPin();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object_LiteralUnlimitedNatural39 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object_LiteralInteger40 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Operation_P_P_Factory_ObjectFlow41 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Operation_P_P_Factory_ObjectFlow41_LiteralBoolean42 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Operation_P_P_Factory_ObjectFlow41_LiteralInteger43 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Operation_P_P_Factory_ObjectFlow44 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Operation_P_P_Factory_ObjectFlow44_LiteralInteger45 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Operation_P_P_Factory_ObjectFlow44_LiteralBoolean46 = new LiteralBoolean();
				public Parameter BehaviorPort_Operation_P_P_Factory_result = new Parameter();
				public CallOperationAction BehaviorPort_Operation_P_P_Factory_P_ = new CallOperationAction();
					public OutputPin BehaviorPort_Operation_P_P_Factory_P__result = new OutputPin();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_Factory_P__result_LiteralUnlimitedNatural47 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_P_P_Factory_P__result_LiteralInteger48 = new LiteralInteger();
						public LiteralInteger BehaviorPort_Operation_P_P_Factory_P__result_LiteralInteger49 = new LiteralInteger();
					public InputPin BehaviorPort_Operation_P_P_Factory_P__target = new InputPin();
						public LiteralInteger BehaviorPort_Operation_P_P_Factory_P__target_LiteralInteger50 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_Factory_P__target_LiteralUnlimitedNatural51 = new LiteralUnlimitedNatural();
				public CreateObjectAction BehaviorPort_Operation_P_P_Factory_Create_P = new CreateObjectAction();
					public OutputPin BehaviorPort_Operation_P_P_Factory_Create_P_result = new OutputPin();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_Factory_Create_P_result_LiteralUnlimitedNatural52 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_P_P_Factory_Create_P_result_LiteralInteger53 = new LiteralInteger();
			public Activity BehaviorPort_Operation_P_P_ClassifierBehavior = new Activity();
				public ObjectFlow BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54_LiteralInteger55 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54_LiteralBoolean56 = new LiteralBoolean();
				public ForkNode BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode1 = new ForkNode();
				public ValueSpecificationAction BehaviorPort_Operation_P_P_ClassifierBehavior_true = new ValueSpecificationAction();
					public LiteralBoolean BehaviorPort_Operation_P_P_ClassifierBehavior_true_LiteralBoolean57 = new LiteralBoolean();
					public OutputPin BehaviorPort_Operation_P_P_ClassifierBehavior_true_result = new OutputPin();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_true_result_LiteralInteger58 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_true_result_LiteralUnlimitedNatural59 = new LiteralUnlimitedNatural();
				public ObjectFlow BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60_LiteralBoolean61 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60_LiteralInteger62 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63_LiteralBoolean64 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63_LiteralInteger65 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66_LiteralBoolean67 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66_LiteralInteger68 = new LiteralInteger();
				public CallOperationAction BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp = new CallOperationAction();
					public InputPin BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b = new InputPin();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b_LiteralUnlimitedNatural69 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b_LiteralInteger70 = new LiteralInteger();
					public OutputPin BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result = new OutputPin();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result_LiteralUnlimitedNatural71 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result_LiteralInteger72 = new LiteralInteger();
					public OutputPin BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c = new OutputPin();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c_LiteralInteger73 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c_LiteralUnlimitedNatural74 = new LiteralUnlimitedNatural();
					public InputPin BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a = new InputPin();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a_LiteralInteger75 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a_LiteralUnlimitedNatural76 = new LiteralUnlimitedNatural();
					public InputPin BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target = new InputPin();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target_LiteralInteger77 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target_LiteralUnlimitedNatural78 = new LiteralUnlimitedNatural();
				public ControlFlow BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow79 = new ControlFlow();
				public ReadSelfAction BehaviorPort_Operation_P_P_ClassifierBehavior_this = new ReadSelfAction();
					public OutputPin BehaviorPort_Operation_P_P_ClassifierBehavior_this_p = new OutputPin();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_this_p_LiteralInteger80 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_this_p_LiteralUnlimitedNatural81 = new LiteralUnlimitedNatural();
				public ControlFlow BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow82 = new ControlFlow();
				public ForkNode BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode2 = new ForkNode();
				public AddStructuralFeatureValueAction BehaviorPort_Operation_P_P_ClassifierBehavior_set_return = new AddStructuralFeatureValueAction();
					public InputPin BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value = new InputPin();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value_LiteralInteger83 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value_LiteralUnlimitedNatural84 = new LiteralUnlimitedNatural();
					public InputPin BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object = new InputPin();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object_LiteralUnlimitedNatural85 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object_LiteralInteger86 = new LiteralInteger();
					public OutputPin BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result = new OutputPin();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result_LiteralUnlimitedNatural87 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result_LiteralInteger88 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89_LiteralBoolean90 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89_LiteralInteger91 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92_LiteralBoolean93 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92_LiteralInteger94 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95_LiteralInteger96 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95_LiteralBoolean97 = new LiteralBoolean();
				public AcceptEventAction BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start = new AcceptEventAction();
					public OutputPin BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result = new OutputPin();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralInteger98 = new LiteralInteger();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralInteger99 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural100 = new LiteralUnlimitedNatural();
					public Trigger BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_SignalEventStartTrigger = new Trigger();
				public ObjectFlow BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101_LiteralInteger102 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101_LiteralBoolean103 = new LiteralBoolean();
				public InitialNode BehaviorPort_Operation_P_P_ClassifierBehavior_InitialNode1 = new InitialNode();
				public ObjectFlow BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104_LiteralInteger105 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104_LiteralBoolean106 = new LiteralBoolean();
				public AddStructuralFeatureValueAction BehaviorPort_Operation_P_P_ClassifierBehavior_set_out = new AddStructuralFeatureValueAction();
					public InputPin BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object = new InputPin();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object_LiteralUnlimitedNatural107 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object_LiteralInteger108 = new LiteralInteger();
					public OutputPin BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result = new OutputPin();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result_LiteralInteger109 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result_LiteralUnlimitedNatural110 = new LiteralUnlimitedNatural();
					public InputPin BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value = new InputPin();
						public LiteralInteger BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value_LiteralInteger111 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value_LiteralUnlimitedNatural112 = new LiteralUnlimitedNatural();
			public Property BehaviorPort_Operation_P_out = new Property();
				public LiteralInteger BehaviorPort_Operation_P_out_LiteralInteger113 = new LiteralInteger();
			public Operation BehaviorPort_Operation_P_P_P = new Operation();
				public Parameter BehaviorPort_Operation_P_P_P_result = new Parameter();
			public Property BehaviorPort_Operation_P_return = new Property();
				public LiteralInteger BehaviorPort_Operation_P_return_LiteralInteger114 = new LiteralInteger();
		public SignalEvent BehaviorPort_Operation_SignalEventStart = new SignalEvent();
		public Comment BehaviorPort_Operation_Comment115 = new Comment();
		public PackageImport BehaviorPort_Operation_PackageImport116 = new PackageImport();
		public Comment BehaviorPort_Operation_Comment117 = new Comment();
		public Class_ BehaviorPort_Operation_S = new Class_();
			public Operation BehaviorPort_Operation_S_S_S = new Operation();
				public Parameter BehaviorPort_Operation_S_S_S_result = new Parameter();
			public Connector BehaviorPort_Operation_S_Connector1 = new Connector();
				public ConnectorEnd BehaviorPort_Operation_S_Connector1_ConnectorEnd118 = new ConnectorEnd();
				public ConnectorEnd BehaviorPort_Operation_S_Connector1_ConnectorEnd119 = new ConnectorEnd();
			public Property BehaviorPort_Operation_S_c = new Property();
			public Property BehaviorPort_Operation_S_p = new Property();
		public Signal BehaviorPort_Operation_Start = new Signal();
		public CallEvent BehaviorPort_Operation_CallEventOr = new CallEvent();
		public Usage BehaviorPort_Operation_I_Usage_P = new Usage();
		public Class_ BehaviorPort_Operation_C = new Class_();
			public InterfaceRealization BehaviorPort_Operation_C_I_Realization = new InterfaceRealization();
			public Port BehaviorPort_Operation_C_pc = new Port();
			public Activity BehaviorPort_Operation_C_C_Factory = new Activity();
				public ActivityParameterNode BehaviorPort_Operation_C_C_Factory_resultParameterNode = new ActivityParameterNode();
					public LiteralInteger BehaviorPort_Operation_C_C_Factory_resultParameterNode_LiteralInteger120 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Operation_C_C_Factory_ObjectFlow121 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Operation_C_C_Factory_ObjectFlow121_LiteralBoolean122 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Operation_C_C_Factory_ObjectFlow121_LiteralInteger123 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Operation_C_C_Factory_ObjectFlow124 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Operation_C_C_Factory_ObjectFlow124_LiteralInteger125 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Operation_C_C_Factory_ObjectFlow124_LiteralBoolean126 = new LiteralBoolean();
				public ForkNode BehaviorPort_Operation_C_C_Factory_Fork_object = new ForkNode();
				public Parameter BehaviorPort_Operation_C_C_Factory_result = new Parameter();
				public ObjectFlow BehaviorPort_Operation_C_C_Factory_ObjectFlow127 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Operation_C_C_Factory_ObjectFlow127_LiteralBoolean128 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Operation_C_C_Factory_ObjectFlow127_LiteralInteger129 = new LiteralInteger();
				public CreateObjectAction BehaviorPort_Operation_C_C_Factory_Create_C = new CreateObjectAction();
					public OutputPin BehaviorPort_Operation_C_C_Factory_Create_C_result = new OutputPin();
						public LiteralInteger BehaviorPort_Operation_C_C_Factory_Create_C_result_LiteralInteger130 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_C_C_Factory_Create_C_result_LiteralUnlimitedNatural131 = new LiteralUnlimitedNatural();
				public CallOperationAction BehaviorPort_Operation_C_C_Factory_C_ = new CallOperationAction();
					public OutputPin BehaviorPort_Operation_C_C_Factory_C__result = new OutputPin();
						public LiteralInteger BehaviorPort_Operation_C_C_Factory_C__result_LiteralInteger132 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_C_C_Factory_C__result_LiteralUnlimitedNatural133 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_C_C_Factory_C__result_LiteralInteger134 = new LiteralInteger();
					public InputPin BehaviorPort_Operation_C_C_Factory_C__target = new InputPin();
						public LiteralUnlimitedNatural BehaviorPort_Operation_C_C_Factory_C__target_LiteralUnlimitedNatural135 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_C_C_Factory_C__target_LiteralInteger136 = new LiteralInteger();
				public StartObjectBehaviorAction BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior = new StartObjectBehaviorAction();
					public InputPin BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object = new InputPin();
						public LiteralInteger BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object_LiteralInteger137 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object_LiteralUnlimitedNatural138 = new LiteralUnlimitedNatural();
				public ObjectFlow BehaviorPort_Operation_C_C_Factory_ObjectFlow139 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Operation_C_C_Factory_ObjectFlow139_LiteralBoolean140 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Operation_C_C_Factory_ObjectFlow139_LiteralInteger141 = new LiteralInteger();
			public Operation BehaviorPort_Operation_C_C_C = new Operation();
				public Parameter BehaviorPort_Operation_C_C_C_result = new Parameter();
			public Activity BehaviorPort_Operation_C_C_ClassifierBehavior = new Activity();
				public ObjectFlow BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142_LiteralInteger143 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142_LiteralBoolean144 = new LiteralBoolean();
				public ControlFlow BehaviorPort_Operation_C_C_ClassifierBehavior_ControlFlow145 = new ControlFlow();
				public ForkNode BehaviorPort_Operation_C_C_ClassifierBehavior_Fork_result = new ForkNode();
				public AcceptCallAction BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or_ = new AcceptCallAction();
					public OutputPin BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__b = new OutputPin();
						public LiteralInteger BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__b_LiteralInteger146 = new LiteralInteger();
					public Trigger BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__CallEventOrTrigger = new Trigger();
					public OutputPin BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__returnInformation = new OutputPin();
					public OutputPin BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__a = new OutputPin();
						public LiteralInteger BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__a_LiteralInteger147 = new LiteralInteger();
				public CallBehaviorAction BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor = new CallBehaviorAction();
					public OutputPin BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result = new OutputPin();
						public LiteralInteger BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralInteger148 = new LiteralInteger();
						public LiteralUnlimitedNatural BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralUnlimitedNatural149 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralInteger150 = new LiteralInteger();
					public InputPin BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x = new InputPin();
						public LiteralUnlimitedNatural BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x_LiteralUnlimitedNatural151 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x_LiteralInteger152 = new LiteralInteger();
					public InputPin BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y = new InputPin();
						public LiteralUnlimitedNatural BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y_LiteralUnlimitedNatural153 = new LiteralUnlimitedNatural();
						public LiteralInteger BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y_LiteralInteger154 = new LiteralInteger();
				public ReplyAction BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or_ = new ReplyAction();
					public InputPin BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__returnInformation = new InputPin();
					public InputPin BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__r = new InputPin();
					public InputPin BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__cr = new InputPin();
				public ObjectFlow BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155_LiteralBoolean156 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155_LiteralInteger157 = new LiteralInteger();
				public ObjectFlow BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158_LiteralInteger159 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158_LiteralBoolean160 = new LiteralBoolean();
				public ObjectFlow BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161_LiteralInteger162 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161_LiteralBoolean163 = new LiteralBoolean();
				public InitialNode BehaviorPort_Operation_C_C_ClassifierBehavior_InitialNode1 = new InitialNode();
				public ObjectFlow BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164 = new ObjectFlow();
					public LiteralInteger BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164_LiteralInteger165 = new LiteralInteger();
					public LiteralBoolean BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164_LiteralBoolean166 = new LiteralBoolean();
				public ObjectFlow BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167 = new ObjectFlow();
					public LiteralBoolean BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167_LiteralBoolean168 = new LiteralBoolean();
					public LiteralInteger BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167_LiteralInteger169 = new LiteralInteger();
			public Operation BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean = new Operation();
				public Parameter BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_b = new Parameter();
				public Parameter BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_result = new Parameter();
				public Parameter BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_a = new Parameter();
				public Parameter BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_c = new Parameter();
		public Activity BehaviorPort_Operation_assertP = new Activity();
			public OpaqueBehavior BehaviorPort_Operation_assertP_testFalse = new OpaqueBehavior();
				public Parameter BehaviorPort_Operation_assertP_testFalse_input = new Parameter();
			public ValueSpecificationAction BehaviorPort_Operation_assertP_p_out_message = new ValueSpecificationAction();
				public OutputPin BehaviorPort_Operation_assertP_p_out_message_result = new OutputPin();
					public LiteralUnlimitedNatural BehaviorPort_Operation_assertP_p_out_message_result_LiteralUnlimitedNatural170 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_assertP_p_out_message_result_LiteralInteger171 = new LiteralInteger();
				public LiteralString BehaviorPort_Operation_assertP_p_out_message_LiteralString172 = new LiteralString();
			public Parameter BehaviorPort_Operation_assertP_p = new Parameter();
			public ForkNode BehaviorPort_Operation_assertP_Fork_p = new ForkNode();
			public CallBehaviorAction BehaviorPort_Operation_assertP_writeLine_p_out = new CallBehaviorAction();
				public InputPin BehaviorPort_Operation_assertP_writeLine_p_out_value = new InputPin();
					public LiteralInteger BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralInteger173 = new LiteralInteger();
					public LiteralUnlimitedNatural BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralUnlimitedNatural174 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralInteger175 = new LiteralInteger();
				public OutputPin BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus = new OutputPin();
					public LiteralInteger BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralInteger176 = new LiteralInteger();
					public LiteralUnlimitedNatural BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralUnlimitedNatural177 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralInteger178 = new LiteralInteger();
			public ObjectFlow BehaviorPort_Operation_assertP_ObjectFlow179 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow179_LiteralInteger180 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow179_LiteralBoolean181 = new LiteralBoolean();
			public ObjectFlow BehaviorPort_Operation_assertP_ObjectFlow182 = new ObjectFlow();
				public LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow182_LiteralBoolean183 = new LiteralBoolean();
				public LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow182_LiteralInteger184 = new LiteralInteger();
			public ObjectFlow BehaviorPort_Operation_assertP_ObjectFlow185 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow185_LiteralInteger186 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow185_LiteralBoolean187 = new LiteralBoolean();
			public ControlFlow BehaviorPort_Operation_assertP_ControlFlow188 = new ControlFlow();
			public ObjectFlow BehaviorPort_Operation_assertP_ObjectFlow189 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow189_LiteralInteger190 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow189_LiteralBoolean191 = new LiteralBoolean();
			public ControlFlow BehaviorPort_Operation_assertP_ControlFlow192 = new ControlFlow();
			public ObjectFlow BehaviorPort_Operation_assertP_ObjectFlow193 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow193_LiteralInteger194 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow193_LiteralBoolean195 = new LiteralBoolean();
			public ControlFlow BehaviorPort_Operation_assertP_ControlFlow196 = new ControlFlow();
			public ActivityParameterNode BehaviorPort_Operation_assertP_pParameterNode = new ActivityParameterNode();
				public LiteralInteger BehaviorPort_Operation_assertP_pParameterNode_LiteralInteger197 = new LiteralInteger();
			public CallBehaviorAction BehaviorPort_Operation_assertP_writeLine_p_return = new CallBehaviorAction();
				public InputPin BehaviorPort_Operation_assertP_writeLine_p_return_value = new InputPin();
					public LiteralInteger BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralInteger198 = new LiteralInteger();
					public LiteralInteger BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralInteger199 = new LiteralInteger();
					public LiteralUnlimitedNatural BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralUnlimitedNatural200 = new LiteralUnlimitedNatural();
				public OutputPin BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus = new OutputPin();
					public LiteralInteger BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralInteger201 = new LiteralInteger();
					public LiteralUnlimitedNatural BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralUnlimitedNatural202 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralInteger203 = new LiteralInteger();
			public ControlFlow BehaviorPort_Operation_assertP_ControlFlow204 = new ControlFlow();
			public ObjectFlow BehaviorPort_Operation_assertP_ObjectFlow205 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow205_LiteralInteger206 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow205_LiteralBoolean207 = new LiteralBoolean();
			public ReadStructuralFeatureAction BehaviorPort_Operation_assertP_p_out = new ReadStructuralFeatureAction();
				public OutputPin BehaviorPort_Operation_assertP_p_out_result = new OutputPin();
					public LiteralUnlimitedNatural BehaviorPort_Operation_assertP_p_out_result_LiteralUnlimitedNatural208 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_assertP_p_out_result_LiteralInteger209 = new LiteralInteger();
				public InputPin BehaviorPort_Operation_assertP_p_out_object = new InputPin();
					public LiteralInteger BehaviorPort_Operation_assertP_p_out_object_LiteralInteger210 = new LiteralInteger();
					public LiteralUnlimitedNatural BehaviorPort_Operation_assertP_p_out_object_LiteralUnlimitedNatural211 = new LiteralUnlimitedNatural();
			public CallBehaviorAction BehaviorPort_Operation_assertP_test_return = new CallBehaviorAction();
				public InputPin BehaviorPort_Operation_assertP_test_return_input = new InputPin();
					public LiteralUnlimitedNatural BehaviorPort_Operation_assertP_test_return_input_LiteralUnlimitedNatural212 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_assertP_test_return_input_LiteralInteger213 = new LiteralInteger();
					public LiteralInteger BehaviorPort_Operation_assertP_test_return_input_LiteralInteger214 = new LiteralInteger();
			public ValueSpecificationAction BehaviorPort_Operation_assertP_p_return_message = new ValueSpecificationAction();
				public OutputPin BehaviorPort_Operation_assertP_p_return_message_result = new OutputPin();
					public LiteralUnlimitedNatural BehaviorPort_Operation_assertP_p_return_message_result_LiteralUnlimitedNatural215 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_assertP_p_return_message_result_LiteralInteger216 = new LiteralInteger();
				public LiteralString BehaviorPort_Operation_assertP_p_return_message_LiteralString217 = new LiteralString();
			public ReadStructuralFeatureAction BehaviorPort_Operation_assertP_p_return = new ReadStructuralFeatureAction();
				public InputPin BehaviorPort_Operation_assertP_p_return_object = new InputPin();
					public LiteralInteger BehaviorPort_Operation_assertP_p_return_object_LiteralInteger218 = new LiteralInteger();
					public LiteralUnlimitedNatural BehaviorPort_Operation_assertP_p_return_object_LiteralUnlimitedNatural219 = new LiteralUnlimitedNatural();
				public OutputPin BehaviorPort_Operation_assertP_p_return_result = new OutputPin();
					public LiteralUnlimitedNatural BehaviorPort_Operation_assertP_p_return_result_LiteralUnlimitedNatural220 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_assertP_p_return_result_LiteralInteger221 = new LiteralInteger();
			public ControlFlow BehaviorPort_Operation_assertP_ControlFlow222 = new ControlFlow();
			public CallBehaviorAction BehaviorPort_Operation_assertP_test_out = new CallBehaviorAction();
				public InputPin BehaviorPort_Operation_assertP_test_out_input = new InputPin();
					public LiteralUnlimitedNatural BehaviorPort_Operation_assertP_test_out_input_LiteralUnlimitedNatural223 = new LiteralUnlimitedNatural();
					public LiteralInteger BehaviorPort_Operation_assertP_test_out_input_LiteralInteger224 = new LiteralInteger();
					public LiteralInteger BehaviorPort_Operation_assertP_test_out_input_LiteralInteger225 = new LiteralInteger();
			public ObjectFlow BehaviorPort_Operation_assertP_ObjectFlow226 = new ObjectFlow();
				public LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow226_LiteralInteger227 = new LiteralInteger();
				public LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow226_LiteralBoolean228 = new LiteralBoolean();

	public static BehaviorPort_OperationModel instance()
	{
		if (instance == null)
        {
            instance = new BehaviorPort_OperationModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public BehaviorPort_OperationModel()
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
		this.initializeAcceptCallAction_Instances();
		this.initializeAcceptEventAction_Instances();
		this.initializeActivity_Instances();
		this.initializeActivityParameterNode_Instances();
		this.initializeAddStructuralFeatureValueAction_Instances();
		this.initializeCallBehaviorAction_Instances();
		this.initializeCallEvent_Instances();
		this.initializeCallOperationAction_Instances();
		this.initializeClass_Instances();
		this.initializeComment_Instances();
		this.initializeConnector_Instances();
		this.initializeConnectorEnd_Instances();
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
		this.initializeReplyAction_Instances();
		this.initializeSendSignalAction_Instances();
		this.initializeSignal_Instances();
		this.initializeSignalEvent_Instances();
		this.initializeStartObjectBehaviorAction_Instances();
		this.initializeTrigger_Instances();
		this.initializeUsage_Instances();
		this.initializeValueSpecificationAction_Instances();
	}

	private void initializeAcceptCallAction_Instances()
	{
		// AcceptCallAction BehaviorPort_Operation_C_C$ClassifierBehavior::Accept or()
		addToElementRepository("Accept or()", BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or_.setName("Accept or()");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or_.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or_.setIsUnmarshall(true);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or_.addResult(BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__a);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or_.addResult(BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__b);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or_.addTrigger(BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__CallEventOrTrigger);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or_.setReturnInformation(BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__returnInformation);
	}

	private void initializeAcceptEventAction_Instances()
	{
		// AcceptEventAction BehaviorPort_Operation_P_P$ClassifierBehavior::Accept Start
		addToElementRepository("Accept Start", BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start.setName("Accept Start");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start.setVisibility(VisibilityKind.package_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start.addResult(BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start.addTrigger(BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_SignalEventStartTrigger);
	}

	private void initializeActivity_Instances()
	{
		// Activity BehaviorPort_Operation_C::C_Factory
		addToElementRepository("C_Factory", BehaviorPort_Operation_C_C_Factory);
		BehaviorPort_Operation_C_C_Factory.setName("C_Factory");
		BehaviorPort_Operation_C_C_Factory.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_Factory.addOwnedParameter(BehaviorPort_Operation_C_C_Factory_result);
		BehaviorPort_Operation_C_C_Factory.addNode(BehaviorPort_Operation_C_C_Factory_resultParameterNode);
		BehaviorPort_Operation_C_C_Factory.addNode(BehaviorPort_Operation_C_C_Factory_Fork_object);
		BehaviorPort_Operation_C_C_Factory.addNode(BehaviorPort_Operation_C_C_Factory_Create_C);
		BehaviorPort_Operation_C_C_Factory.addNode(BehaviorPort_Operation_C_C_Factory_C_);
		BehaviorPort_Operation_C_C_Factory.addNode(BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior);
		BehaviorPort_Operation_C_C_Factory.addEdge(BehaviorPort_Operation_C_C_Factory_ObjectFlow121);
		BehaviorPort_Operation_C_C_Factory.addEdge(BehaviorPort_Operation_C_C_Factory_ObjectFlow124);
		BehaviorPort_Operation_C_C_Factory.addEdge(BehaviorPort_Operation_C_C_Factory_ObjectFlow127);
		BehaviorPort_Operation_C_C_Factory.addEdge(BehaviorPort_Operation_C_C_Factory_ObjectFlow139);
		// Activity BehaviorPort_Operation::main
		addToElementRepository("main", BehaviorPort_Operation_main);
		BehaviorPort_Operation_main.setName("main");
		BehaviorPort_Operation_main.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main.addNode(BehaviorPort_Operation_main_assertP);
		BehaviorPort_Operation_main.addNode(BehaviorPort_Operation_main_Fork_s_p);
		BehaviorPort_Operation_main.addNode(BehaviorPort_Operation_main_Create_S);
		BehaviorPort_Operation_main.addNode(BehaviorPort_Operation_main_S_);
		BehaviorPort_Operation_main.addNode(BehaviorPort_Operation_main_s_p);
		BehaviorPort_Operation_main.addNode(BehaviorPort_Operation_main_Send_Start);
		BehaviorPort_Operation_main.addEdge(BehaviorPort_Operation_main_ObjectFlow0);
		BehaviorPort_Operation_main.addEdge(BehaviorPort_Operation_main_ObjectFlow6);
		BehaviorPort_Operation_main.addEdge(BehaviorPort_Operation_main_ControlFlow20);
		BehaviorPort_Operation_main.addEdge(BehaviorPort_Operation_main_ObjectFlow21);
		BehaviorPort_Operation_main.addEdge(BehaviorPort_Operation_main_ObjectFlow26);
		BehaviorPort_Operation_main.addEdge(BehaviorPort_Operation_main_ObjectFlow29);
		// Activity BehaviorPort_Operation_P::P_Factory
		addToElementRepository("P_Factory", BehaviorPort_Operation_P_P_Factory);
		BehaviorPort_Operation_P_P_Factory.setName("P_Factory");
		BehaviorPort_Operation_P_P_Factory.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_Factory.addOwnedParameter(BehaviorPort_Operation_P_P_Factory_result);
		BehaviorPort_Operation_P_P_Factory.addNode(BehaviorPort_Operation_P_P_Factory_resultParameterNode);
		BehaviorPort_Operation_P_P_Factory.addNode(BehaviorPort_Operation_P_P_Factory_Fork_object);
		BehaviorPort_Operation_P_P_Factory.addNode(BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior);
		BehaviorPort_Operation_P_P_Factory.addNode(BehaviorPort_Operation_P_P_Factory_P_);
		BehaviorPort_Operation_P_P_Factory.addNode(BehaviorPort_Operation_P_P_Factory_Create_P);
		BehaviorPort_Operation_P_P_Factory.addEdge(BehaviorPort_Operation_P_P_Factory_ObjectFlow33);
		BehaviorPort_Operation_P_P_Factory.addEdge(BehaviorPort_Operation_P_P_Factory_ObjectFlow36);
		BehaviorPort_Operation_P_P_Factory.addEdge(BehaviorPort_Operation_P_P_Factory_ObjectFlow41);
		BehaviorPort_Operation_P_P_Factory.addEdge(BehaviorPort_Operation_P_P_Factory_ObjectFlow44);
		// Activity BehaviorPort_Operation_P::P$ClassifierBehavior
		addToElementRepository("P$ClassifierBehavior", BehaviorPort_Operation_P_P_ClassifierBehavior);
		BehaviorPort_Operation_P_P_ClassifierBehavior.setName("P$ClassifierBehavior");
		BehaviorPort_Operation_P_P_ClassifierBehavior.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior.isReentrant = false;
		BehaviorPort_Operation_P_P_ClassifierBehavior.addNode(BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode2);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addNode(BehaviorPort_Operation_P_P_ClassifierBehavior_set_return);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addNode(BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode1);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addNode(BehaviorPort_Operation_P_P_ClassifierBehavior_true);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addNode(BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addNode(BehaviorPort_Operation_P_P_ClassifierBehavior_InitialNode1);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addNode(BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addNode(BehaviorPort_Operation_P_P_ClassifierBehavior_this);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addNode(BehaviorPort_Operation_P_P_ClassifierBehavior_set_out);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addEdge(BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow82);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addEdge(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addEdge(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addEdge(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addEdge(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addEdge(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addEdge(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addEdge(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addEdge(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addEdge(BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow79);
		BehaviorPort_Operation_P_P_ClassifierBehavior.addEdge(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104);
		// Activity BehaviorPort_Operation_C::C$ClassifierBehavior
		addToElementRepository("C$ClassifierBehavior", BehaviorPort_Operation_C_C_ClassifierBehavior);
		BehaviorPort_Operation_C_C_ClassifierBehavior.setName("C$ClassifierBehavior");
		BehaviorPort_Operation_C_C_ClassifierBehavior.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior.addNode(BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or_);
		BehaviorPort_Operation_C_C_ClassifierBehavior.addNode(BehaviorPort_Operation_C_C_ClassifierBehavior_Fork_result);
		BehaviorPort_Operation_C_C_ClassifierBehavior.addNode(BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor);
		BehaviorPort_Operation_C_C_ClassifierBehavior.addNode(BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or_);
		BehaviorPort_Operation_C_C_ClassifierBehavior.addNode(BehaviorPort_Operation_C_C_ClassifierBehavior_InitialNode1);
		BehaviorPort_Operation_C_C_ClassifierBehavior.addEdge(BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142);
		BehaviorPort_Operation_C_C_ClassifierBehavior.addEdge(BehaviorPort_Operation_C_C_ClassifierBehavior_ControlFlow145);
		BehaviorPort_Operation_C_C_ClassifierBehavior.addEdge(BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155);
		BehaviorPort_Operation_C_C_ClassifierBehavior.addEdge(BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158);
		BehaviorPort_Operation_C_C_ClassifierBehavior.addEdge(BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161);
		BehaviorPort_Operation_C_C_ClassifierBehavior.addEdge(BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164);
		BehaviorPort_Operation_C_C_ClassifierBehavior.addEdge(BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167);
		// Activity BehaviorPort_Operation::assertP
		addToElementRepository("assertP", BehaviorPort_Operation_assertP);
		BehaviorPort_Operation_assertP.setName("assertP");
		BehaviorPort_Operation_assertP.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP.addOwnedBehavior(BehaviorPort_Operation_assertP_testFalse);
		BehaviorPort_Operation_assertP.addOwnedParameter(BehaviorPort_Operation_assertP_p);
		BehaviorPort_Operation_assertP.addNode(BehaviorPort_Operation_assertP_p_out_message);
		BehaviorPort_Operation_assertP.addNode(BehaviorPort_Operation_assertP_Fork_p);
		BehaviorPort_Operation_assertP.addNode(BehaviorPort_Operation_assertP_writeLine_p_out);
		BehaviorPort_Operation_assertP.addNode(BehaviorPort_Operation_assertP_pParameterNode);
		BehaviorPort_Operation_assertP.addNode(BehaviorPort_Operation_assertP_writeLine_p_return);
		BehaviorPort_Operation_assertP.addNode(BehaviorPort_Operation_assertP_p_out);
		BehaviorPort_Operation_assertP.addNode(BehaviorPort_Operation_assertP_test_return);
		BehaviorPort_Operation_assertP.addNode(BehaviorPort_Operation_assertP_p_return_message);
		BehaviorPort_Operation_assertP.addNode(BehaviorPort_Operation_assertP_p_return);
		BehaviorPort_Operation_assertP.addNode(BehaviorPort_Operation_assertP_test_out);
		BehaviorPort_Operation_assertP.addEdge(BehaviorPort_Operation_assertP_ObjectFlow179);
		BehaviorPort_Operation_assertP.addEdge(BehaviorPort_Operation_assertP_ObjectFlow182);
		BehaviorPort_Operation_assertP.addEdge(BehaviorPort_Operation_assertP_ObjectFlow185);
		BehaviorPort_Operation_assertP.addEdge(BehaviorPort_Operation_assertP_ControlFlow188);
		BehaviorPort_Operation_assertP.addEdge(BehaviorPort_Operation_assertP_ObjectFlow189);
		BehaviorPort_Operation_assertP.addEdge(BehaviorPort_Operation_assertP_ControlFlow192);
		BehaviorPort_Operation_assertP.addEdge(BehaviorPort_Operation_assertP_ObjectFlow193);
		BehaviorPort_Operation_assertP.addEdge(BehaviorPort_Operation_assertP_ControlFlow196);
		BehaviorPort_Operation_assertP.addEdge(BehaviorPort_Operation_assertP_ControlFlow204);
		BehaviorPort_Operation_assertP.addEdge(BehaviorPort_Operation_assertP_ObjectFlow205);
		BehaviorPort_Operation_assertP.addEdge(BehaviorPort_Operation_assertP_ControlFlow222);
		BehaviorPort_Operation_assertP.addEdge(BehaviorPort_Operation_assertP_ObjectFlow226);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode BehaviorPort_Operation_P_P_Factory::resultParameterNode
		addToElementRepository("resultParameterNode", BehaviorPort_Operation_P_P_Factory_resultParameterNode);
		BehaviorPort_Operation_P_P_Factory_resultParameterNode.setName("resultParameterNode");
		BehaviorPort_Operation_P_P_Factory_resultParameterNode.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_Factory_resultParameterNode.setParameter(BehaviorPort_Operation_P_P_Factory_result);
		// ActivityParameterNode BehaviorPort_Operation_C_C_Factory::resultParameterNode
		addToElementRepository("resultParameterNode", BehaviorPort_Operation_C_C_Factory_resultParameterNode);
		BehaviorPort_Operation_C_C_Factory_resultParameterNode.setName("resultParameterNode");
		BehaviorPort_Operation_C_C_Factory_resultParameterNode.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_Factory_resultParameterNode.setParameter(BehaviorPort_Operation_C_C_Factory_result);
		// ActivityParameterNode BehaviorPort_Operation_assertP::pParameterNode
		addToElementRepository("pParameterNode", BehaviorPort_Operation_assertP_pParameterNode);
		BehaviorPort_Operation_assertP_pParameterNode.setName("pParameterNode");
		BehaviorPort_Operation_assertP_pParameterNode.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_pParameterNode.setParameter(BehaviorPort_Operation_assertP_p);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction BehaviorPort_Operation_P_P$ClassifierBehavior::set return
		addToElementRepository("set return", BehaviorPort_Operation_P_P_ClassifierBehavior_set_return);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return.setName("set return");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return.setStructuralFeature(BehaviorPort_Operation_P_return);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return.setObject(BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return.setValue(BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return.setResult(BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result);
		// AddStructuralFeatureValueAction BehaviorPort_Operation_P_P$ClassifierBehavior::set out
		addToElementRepository("set out", BehaviorPort_Operation_P_P_ClassifierBehavior_set_out);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out.setName("set out");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out.setStructuralFeature(BehaviorPort_Operation_P_out);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out.setObject(BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out.setValue(BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out.setResult(BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out.setIsReplaceAll(true);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction BehaviorPort_Operation_assertP::writeLine p.out
		addToElementRepository("writeLine p.out", BehaviorPort_Operation_assertP_writeLine_p_out);
		BehaviorPort_Operation_assertP_writeLine_p_out.setName("writeLine p.out");
		BehaviorPort_Operation_assertP_writeLine_p_out.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_writeLine_p_out.addResult(BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus);
		BehaviorPort_Operation_assertP_writeLine_p_out.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		BehaviorPort_Operation_assertP_writeLine_p_out.addArgument(BehaviorPort_Operation_assertP_writeLine_p_out_value);
		// CallBehaviorAction BehaviorPort_Operation_main::assertP
		addToElementRepository("assertP", BehaviorPort_Operation_main_assertP);
		BehaviorPort_Operation_main_assertP.setName("assertP");
		BehaviorPort_Operation_main_assertP.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_assertP.setBehavior(BehaviorPort_Operation_assertP);
		BehaviorPort_Operation_main_assertP.addArgument(BehaviorPort_Operation_main_assertP_p);
		// CallBehaviorAction BehaviorPort_Operation_assertP::writeLine p.return
		addToElementRepository("writeLine p.return", BehaviorPort_Operation_assertP_writeLine_p_return);
		BehaviorPort_Operation_assertP_writeLine_p_return.setName("writeLine p.return");
		BehaviorPort_Operation_assertP_writeLine_p_return.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_writeLine_p_return.addResult(BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus);
		BehaviorPort_Operation_assertP_writeLine_p_return.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		BehaviorPort_Operation_assertP_writeLine_p_return.addArgument(BehaviorPort_Operation_assertP_writeLine_p_return_value);
		// CallBehaviorAction BehaviorPort_Operation_C_C$ClassifierBehavior::Call Xor
		addToElementRepository("Call Xor", BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor.setName("Call Xor");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor.addResult(BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor.addArgument(BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor.addArgument(BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y);
		// CallBehaviorAction BehaviorPort_Operation_assertP::test return
		addToElementRepository("test return", BehaviorPort_Operation_assertP_test_return);
		BehaviorPort_Operation_assertP_test_return.setName("test return");
		BehaviorPort_Operation_assertP_test_return.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_test_return.setBehavior(BehaviorPort_Operation_assertP_testFalse);
		BehaviorPort_Operation_assertP_test_return.addArgument(BehaviorPort_Operation_assertP_test_return_input);
		// CallBehaviorAction BehaviorPort_Operation_assertP::test out
		addToElementRepository("test out", BehaviorPort_Operation_assertP_test_out);
		BehaviorPort_Operation_assertP_test_out.setName("test out");
		BehaviorPort_Operation_assertP_test_out.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_test_out.setBehavior(BehaviorPort_Operation_assertP_testFalse);
		BehaviorPort_Operation_assertP_test_out.addArgument(BehaviorPort_Operation_assertP_test_out_input);
	}

	private void initializeCallEvent_Instances()
	{
		// CallEvent BehaviorPort_Operation::CallEventOr
		addToElementRepository("CallEventOr", BehaviorPort_Operation_CallEventOr);
		BehaviorPort_Operation_CallEventOr.setName("CallEventOr");
		BehaviorPort_Operation_CallEventOr.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_CallEventOr.setOperation(BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction BehaviorPort_Operation_main::S()
		addToElementRepository("S()", BehaviorPort_Operation_main_S_);
		BehaviorPort_Operation_main_S_.setName("S()");
		BehaviorPort_Operation_main_S_.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_main_S_.addResult(BehaviorPort_Operation_main_S__result);
		BehaviorPort_Operation_main_S_.setOperation(BehaviorPort_Operation_S_S_S);
		BehaviorPort_Operation_main_S_.setTarget(BehaviorPort_Operation_main_S__target);
		// CallOperationAction BehaviorPort_Operation_C_C_Factory::C()
		addToElementRepository("C()", BehaviorPort_Operation_C_C_Factory_C_);
		BehaviorPort_Operation_C_C_Factory_C_.setName("C()");
		BehaviorPort_Operation_C_C_Factory_C_.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_Factory_C_.addResult(BehaviorPort_Operation_C_C_Factory_C__result);
		BehaviorPort_Operation_C_C_Factory_C_.setOperation(BehaviorPort_Operation_C_C_C);
		BehaviorPort_Operation_C_C_Factory_C_.setTarget(BehaviorPort_Operation_C_C_Factory_C__target);
		// CallOperationAction BehaviorPort_Operation_P_P$ClassifierBehavior::Call or() via pp
		addToElementRepository("Call or() via pp", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp.setName("Call or() via pp");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp.setOnPort(BehaviorPort_Operation_P_pp);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp.addResult(BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp.addResult(BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp.setOperation(BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp.setTarget(BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp.addArgument(BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp.addArgument(BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b);
		// CallOperationAction BehaviorPort_Operation_P_P_Factory::P()
		addToElementRepository("P()", BehaviorPort_Operation_P_P_Factory_P_);
		BehaviorPort_Operation_P_P_Factory_P_.setName("P()");
		BehaviorPort_Operation_P_P_Factory_P_.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_Factory_P_.addResult(BehaviorPort_Operation_P_P_Factory_P__result);
		BehaviorPort_Operation_P_P_Factory_P_.setOperation(BehaviorPort_Operation_P_P_P);
		BehaviorPort_Operation_P_P_Factory_P_.setTarget(BehaviorPort_Operation_P_P_Factory_P__target);
	}

	private void initializeClass_Instances()
	{
		// Class BehaviorPort_Operation::S
		addToElementRepository("S", BehaviorPort_Operation_S);
		BehaviorPort_Operation_S.setName("S");
		BehaviorPort_Operation_S.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_S.addOwnedAttribute(BehaviorPort_Operation_S_p);
		BehaviorPort_Operation_S.addOwnedAttribute(BehaviorPort_Operation_S_c);
		
		BehaviorPort_Operation_S.addOwnedConnector(BehaviorPort_Operation_S_Connector1);
		BehaviorPort_Operation_S.addOwnedOperation(BehaviorPort_Operation_S_S_S);
		// Class BehaviorPort_Operation::P
		addToElementRepository("P", BehaviorPort_Operation_P);
		BehaviorPort_Operation_P.setName("P");
		BehaviorPort_Operation_P.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P.addOwnedAttribute(BehaviorPort_Operation_P_out);
		BehaviorPort_Operation_P.addOwnedAttribute(BehaviorPort_Operation_P_return);
		BehaviorPort_Operation_P.addOwnedAttribute(BehaviorPort_Operation_P_pp);
		BehaviorPort_Operation_P.setClassifierBehavior(BehaviorPort_Operation_P_P_ClassifierBehavior);
		BehaviorPort_Operation_P.addOwnedBehavior(BehaviorPort_Operation_P_P_Factory);
		BehaviorPort_Operation_P.addOwnedBehavior(BehaviorPort_Operation_P_P_ClassifierBehavior);
		
		BehaviorPort_Operation_P.setIsActive(true);
		BehaviorPort_Operation_P.addOwnedOperation(BehaviorPort_Operation_P_P_P);
		BehaviorPort_Operation_P.addOwnedReception(BehaviorPort_Operation_P_Start);
		// Class BehaviorPort_Operation::C
		addToElementRepository("C", BehaviorPort_Operation_C);
		BehaviorPort_Operation_C.setName("C");
		BehaviorPort_Operation_C.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C.addOwnedAttribute(BehaviorPort_Operation_C_pc);
		BehaviorPort_Operation_C.setClassifierBehavior(BehaviorPort_Operation_C_C_ClassifierBehavior);
		BehaviorPort_Operation_C.addOwnedBehavior(BehaviorPort_Operation_C_C_Factory);
		BehaviorPort_Operation_C.addOwnedBehavior(BehaviorPort_Operation_C_C_ClassifierBehavior);
		BehaviorPort_Operation_C.addInterfaceRealization(BehaviorPort_Operation_C_I_Realization);
		
		BehaviorPort_Operation_C.setIsActive(true);
		BehaviorPort_Operation_C.addOwnedOperation(BehaviorPort_Operation_C_C_C);
		BehaviorPort_Operation_C.addOwnedOperation(BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean);
	}

	private void initializeComment_Instances()
	{
		// Comment BehaviorPort_Operation::Comment115
		addToElementRepository("Comment115", BehaviorPort_Operation_Comment115);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment BehaviorPort_Operation::Comment117
		addToElementRepository("Comment117", BehaviorPort_Operation_Comment117);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector BehaviorPort_Operation_S::Connector1
		addToElementRepository("Connector1", BehaviorPort_Operation_S_Connector1);
		BehaviorPort_Operation_S_Connector1.setName("Connector1");
		BehaviorPort_Operation_S_Connector1.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_S_Connector1.addEnd(BehaviorPort_Operation_S_Connector1_ConnectorEnd119);
		BehaviorPort_Operation_S_Connector1.addEnd(BehaviorPort_Operation_S_Connector1_ConnectorEnd118);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd BehaviorPort_Operation_S_Connector1::ConnectorEnd118
		addToElementRepository("ConnectorEnd118", BehaviorPort_Operation_S_Connector1_ConnectorEnd118);
		BehaviorPort_Operation_S_Connector1_ConnectorEnd118.setRole(BehaviorPort_Operation_C_pc);
		BehaviorPort_Operation_S_Connector1_ConnectorEnd118.setPartWithPort(BehaviorPort_Operation_S_c);
		// ConnectorEnd BehaviorPort_Operation_S_Connector1::ConnectorEnd119
		addToElementRepository("ConnectorEnd119", BehaviorPort_Operation_S_Connector1_ConnectorEnd119);
		BehaviorPort_Operation_S_Connector1_ConnectorEnd119.setRole(BehaviorPort_Operation_P_pp);
		BehaviorPort_Operation_S_Connector1_ConnectorEnd119.setPartWithPort(BehaviorPort_Operation_S_p);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow BehaviorPort_Operation_P_P$ClassifierBehavior::ControlFlow82
		addToElementRepository("ControlFlow82", BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow82);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow82.setName("ControlFlow82");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow82.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow82.setSource(BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow82.setTarget(BehaviorPort_Operation_P_P_ClassifierBehavior_this);
		// ControlFlow BehaviorPort_Operation_assertP::ControlFlow192
		addToElementRepository("ControlFlow192", BehaviorPort_Operation_assertP_ControlFlow192);
		BehaviorPort_Operation_assertP_ControlFlow192.setName("ControlFlow192");
		BehaviorPort_Operation_assertP_ControlFlow192.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_ControlFlow192.setSource(BehaviorPort_Operation_assertP_writeLine_p_out);
		BehaviorPort_Operation_assertP_ControlFlow192.setTarget(BehaviorPort_Operation_assertP_test_out);
		// ControlFlow BehaviorPort_Operation_assertP::ControlFlow196
		addToElementRepository("ControlFlow196", BehaviorPort_Operation_assertP_ControlFlow196);
		BehaviorPort_Operation_assertP_ControlFlow196.setName("ControlFlow196");
		BehaviorPort_Operation_assertP_ControlFlow196.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_ControlFlow196.setSource(BehaviorPort_Operation_assertP_p_return);
		BehaviorPort_Operation_assertP_ControlFlow196.setTarget(BehaviorPort_Operation_assertP_p_return_message);
		// ControlFlow BehaviorPort_Operation_C_C$ClassifierBehavior::ControlFlow145
		addToElementRepository("ControlFlow145", BehaviorPort_Operation_C_C_ClassifierBehavior_ControlFlow145);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ControlFlow145.setName("ControlFlow145");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ControlFlow145.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_ClassifierBehavior_ControlFlow145.setSource(BehaviorPort_Operation_C_C_ClassifierBehavior_InitialNode1);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ControlFlow145.setTarget(BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or_);
		// ControlFlow BehaviorPort_Operation_assertP::ControlFlow204
		addToElementRepository("ControlFlow204", BehaviorPort_Operation_assertP_ControlFlow204);
		BehaviorPort_Operation_assertP_ControlFlow204.setName("ControlFlow204");
		BehaviorPort_Operation_assertP_ControlFlow204.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_ControlFlow204.setSource(BehaviorPort_Operation_assertP_test_out);
		BehaviorPort_Operation_assertP_ControlFlow204.setTarget(BehaviorPort_Operation_assertP_test_return);
		// ControlFlow BehaviorPort_Operation_assertP::ControlFlow222
		addToElementRepository("ControlFlow222", BehaviorPort_Operation_assertP_ControlFlow222);
		BehaviorPort_Operation_assertP_ControlFlow222.setName("ControlFlow222");
		BehaviorPort_Operation_assertP_ControlFlow222.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_ControlFlow222.setSource(BehaviorPort_Operation_assertP_p_out);
		BehaviorPort_Operation_assertP_ControlFlow222.setTarget(BehaviorPort_Operation_assertP_p_out_message);
		// ControlFlow BehaviorPort_Operation_assertP::ControlFlow188
		addToElementRepository("ControlFlow188", BehaviorPort_Operation_assertP_ControlFlow188);
		BehaviorPort_Operation_assertP_ControlFlow188.setName("ControlFlow188");
		BehaviorPort_Operation_assertP_ControlFlow188.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_ControlFlow188.setSource(BehaviorPort_Operation_assertP_writeLine_p_return);
		BehaviorPort_Operation_assertP_ControlFlow188.setTarget(BehaviorPort_Operation_assertP_test_return);
		// ControlFlow BehaviorPort_Operation_main::ControlFlow20
		addToElementRepository("ControlFlow20", BehaviorPort_Operation_main_ControlFlow20);
		BehaviorPort_Operation_main_ControlFlow20.setName("ControlFlow20");
		BehaviorPort_Operation_main_ControlFlow20.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_main_ControlFlow20.setSource(BehaviorPort_Operation_main_Send_Start);
		BehaviorPort_Operation_main_ControlFlow20.setTarget(BehaviorPort_Operation_main_assertP);
		// ControlFlow BehaviorPort_Operation_P_P$ClassifierBehavior::ControlFlow79
		addToElementRepository("ControlFlow79", BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow79);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow79.setName("ControlFlow79");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow79.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow79.setSource(BehaviorPort_Operation_P_P_ClassifierBehavior_InitialNode1);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ControlFlow79.setTarget(BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction BehaviorPort_Operation_main::Create S
		addToElementRepository("Create S", BehaviorPort_Operation_main_Create_S);
		BehaviorPort_Operation_main_Create_S.setName("Create S");
		BehaviorPort_Operation_main_Create_S.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_Create_S.setClassifier(BehaviorPort_Operation_S);
		BehaviorPort_Operation_main_Create_S.setResult(BehaviorPort_Operation_main_Create_S_result);
		// CreateObjectAction BehaviorPort_Operation_C_C_Factory::Create C
		addToElementRepository("Create C", BehaviorPort_Operation_C_C_Factory_Create_C);
		BehaviorPort_Operation_C_C_Factory_Create_C.setName("Create C");
		BehaviorPort_Operation_C_C_Factory_Create_C.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_Create_C.setClassifier(BehaviorPort_Operation_C);
		BehaviorPort_Operation_C_C_Factory_Create_C.setResult(BehaviorPort_Operation_C_C_Factory_Create_C_result);
		// CreateObjectAction BehaviorPort_Operation_P_P_Factory::Create P
		addToElementRepository("Create P", BehaviorPort_Operation_P_P_Factory_Create_P);
		BehaviorPort_Operation_P_P_Factory_Create_P.setName("Create P");
		BehaviorPort_Operation_P_P_Factory_Create_P.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_Create_P.setClassifier(BehaviorPort_Operation_P);
		BehaviorPort_Operation_P_P_Factory_Create_P.setResult(BehaviorPort_Operation_P_P_Factory_Create_P_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode BehaviorPort_Operation_P_P_Factory::Fork object
		addToElementRepository("Fork object", BehaviorPort_Operation_P_P_Factory_Fork_object);
		BehaviorPort_Operation_P_P_Factory_Fork_object.setName("Fork object");
		BehaviorPort_Operation_P_P_Factory_Fork_object.setVisibility(VisibilityKind.public_);
		// ForkNode BehaviorPort_Operation_P_P$ClassifierBehavior::ForkNode2
		addToElementRepository("ForkNode2", BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode2);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode2.setName("ForkNode2");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode2.setVisibility(VisibilityKind.public_);
		// ForkNode BehaviorPort_Operation_assertP::Fork p
		addToElementRepository("Fork p", BehaviorPort_Operation_assertP_Fork_p);
		BehaviorPort_Operation_assertP_Fork_p.setName("Fork p");
		BehaviorPort_Operation_assertP_Fork_p.setVisibility(VisibilityKind.public_);
		// ForkNode BehaviorPort_Operation_P_P$ClassifierBehavior::ForkNode1
		addToElementRepository("ForkNode1", BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode1);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode1.setName("ForkNode1");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode1.setVisibility(VisibilityKind.public_);
		// ForkNode BehaviorPort_Operation_C_C$ClassifierBehavior::Fork result
		addToElementRepository("Fork result", BehaviorPort_Operation_C_C_ClassifierBehavior_Fork_result);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Fork_result.setName("Fork result");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Fork_result.setVisibility(VisibilityKind.public_);
		// ForkNode BehaviorPort_Operation_C_C_Factory::Fork object
		addToElementRepository("Fork object", BehaviorPort_Operation_C_C_Factory_Fork_object);
		BehaviorPort_Operation_C_C_Factory_Fork_object.setName("Fork object");
		BehaviorPort_Operation_C_C_Factory_Fork_object.setVisibility(VisibilityKind.public_);
		// ForkNode BehaviorPort_Operation_main::Fork s.p
		addToElementRepository("Fork s.p", BehaviorPort_Operation_main_Fork_s_p);
		BehaviorPort_Operation_main_Fork_s_p.setName("Fork s.p");
		BehaviorPort_Operation_main_Fork_s_p.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior BehaviorPort_Operation_assertP::testFalse
		addToElementRepository("testFalse", BehaviorPort_Operation_assertP_testFalse);
		BehaviorPort_Operation_assertP_testFalse.setName("testFalse");
		BehaviorPort_Operation_assertP_testFalse.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_testFalse.addOwnedParameter(BehaviorPort_Operation_assertP_testFalse_input);
		BehaviorPort_Operation_assertP_testFalse.addLanguage("Java");
		BehaviorPort_Operation_assertP_testFalse.addLanguage("Import");
		BehaviorPort_Operation_assertP_testFalse.addBody("// Test parameter input 	boolean input = ((BooleanValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument input = \" + input);  	if(input == false) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		BehaviorPort_Operation_assertP_testFalse.addBody("import fuml.semantics.simpleclassifiers.BooleanValue; import fuml.Debug;");
	}

	private void initializeInitialNode_Instances()
	{
		// InitialNode BehaviorPort_Operation_P_P$ClassifierBehavior::InitialNode1
		addToElementRepository("InitialNode1", BehaviorPort_Operation_P_P_ClassifierBehavior_InitialNode1);
		BehaviorPort_Operation_P_P_ClassifierBehavior_InitialNode1.setName("InitialNode1");
		BehaviorPort_Operation_P_P_ClassifierBehavior_InitialNode1.setVisibility(VisibilityKind.public_);
		// InitialNode BehaviorPort_Operation_C_C$ClassifierBehavior::InitialNode1
		addToElementRepository("InitialNode1", BehaviorPort_Operation_C_C_ClassifierBehavior_InitialNode1);
		BehaviorPort_Operation_C_C_ClassifierBehavior_InitialNode1.setName("InitialNode1");
		BehaviorPort_Operation_C_C_ClassifierBehavior_InitialNode1.setVisibility(VisibilityKind.public_);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin BehaviorPort_Operation_main_Send Start::target
		addToElementRepository("target", BehaviorPort_Operation_main_Send_Start_target);
		BehaviorPort_Operation_main_Send_Start_target.setName("target");
		BehaviorPort_Operation_main_Send_Start_target.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_Send_Start_target.setType(BehaviorPort_Operation_P);
		// InputPin BehaviorPort_Operation_assertP_test return::input
		addToElementRepository("input", BehaviorPort_Operation_assertP_test_return_input);
		BehaviorPort_Operation_assertP_test_return_input.setName("input");
		BehaviorPort_Operation_assertP_test_return_input.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_test_return_input.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// InputPin BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp::b
		addToElementRepository("b", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b.setName("b");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// InputPin BehaviorPort_Operation_P_P$ClassifierBehavior_set return::value
		addToElementRepository("value", BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value.setName("value");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// InputPin BehaviorPort_Operation_C_C$ClassifierBehavior_Call Xor::x
		addToElementRepository("x", BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x.setName("x");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// InputPin BehaviorPort_Operation_assertP_test out::input
		addToElementRepository("input", BehaviorPort_Operation_assertP_test_out_input);
		BehaviorPort_Operation_assertP_test_out_input.setName("input");
		BehaviorPort_Operation_assertP_test_out_input.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_test_out_input.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// InputPin BehaviorPort_Operation_assertP_p.return::object
		addToElementRepository("object", BehaviorPort_Operation_assertP_p_return_object);
		BehaviorPort_Operation_assertP_p_return_object.setName("object");
		BehaviorPort_Operation_assertP_p_return_object.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_return_object.setType(BehaviorPort_Operation_P);
		// InputPin BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp::target
		addToElementRepository("target", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target.setName("target");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target.setVisibility(VisibilityKind.public_);
		// InputPin BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp::a
		addToElementRepository("a", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a.setName("a");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// InputPin BehaviorPort_Operation_main_S()::target
		addToElementRepository("target", BehaviorPort_Operation_main_S__target);
		BehaviorPort_Operation_main_S__target.setName("target");
		BehaviorPort_Operation_main_S__target.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_S__target.setType(BehaviorPort_Operation_S);
		// InputPin BehaviorPort_Operation_P_P_Factory_Start classifierBehavior::object
		addToElementRepository("object", BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object);
		BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object.setName("object");
		BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object.setType(BehaviorPort_Operation_P);
		// InputPin BehaviorPort_Operation_C_C_Factory_C()::target
		addToElementRepository("target", BehaviorPort_Operation_C_C_Factory_C__target);
		BehaviorPort_Operation_C_C_Factory_C__target.setName("target");
		BehaviorPort_Operation_C_C_Factory_C__target.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_C__target.setType(BehaviorPort_Operation_C);
		// InputPin BehaviorPort_Operation_main_s.p::s
		addToElementRepository("s", BehaviorPort_Operation_main_s_p_s);
		BehaviorPort_Operation_main_s_p_s.setName("s");
		BehaviorPort_Operation_main_s_p_s.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_s_p_s.setType(BehaviorPort_Operation_S);
		// InputPin BehaviorPort_Operation_C_C$ClassifierBehavior_Reply or()::r
		addToElementRepository("r", BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__r);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__r.setName("r");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__r.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__r.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// InputPin BehaviorPort_Operation_C_C$ClassifierBehavior_Reply or()::cr
		addToElementRepository("cr", BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__cr);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__cr.setName("cr");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__cr.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__cr.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// InputPin BehaviorPort_Operation_assertP_writeLine p.out::value
		addToElementRepository("value", BehaviorPort_Operation_assertP_writeLine_p_out_value);
		BehaviorPort_Operation_assertP_writeLine_p_out_value.setName("value");
		BehaviorPort_Operation_assertP_writeLine_p_out_value.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_out_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin BehaviorPort_Operation_P_P$ClassifierBehavior_set out::object
		addToElementRepository("object", BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object.setName("object");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object.setType(BehaviorPort_Operation_P);
		// InputPin BehaviorPort_Operation_P_P$ClassifierBehavior_set out::value
		addToElementRepository("value", BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value.setName("value");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// InputPin BehaviorPort_Operation_main_assertP::p
		addToElementRepository("p", BehaviorPort_Operation_main_assertP_p);
		BehaviorPort_Operation_main_assertP_p.setName("p");
		BehaviorPort_Operation_main_assertP_p.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_assertP_p.setType(BehaviorPort_Operation_P);
		// InputPin BehaviorPort_Operation_P_P$ClassifierBehavior_set return::object
		addToElementRepository("object", BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object.setName("object");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object.setType(BehaviorPort_Operation_P);
		// InputPin BehaviorPort_Operation_P_P_Factory_P()::target
		addToElementRepository("target", BehaviorPort_Operation_P_P_Factory_P__target);
		BehaviorPort_Operation_P_P_Factory_P__target.setName("target");
		BehaviorPort_Operation_P_P_Factory_P__target.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_P__target.setType(BehaviorPort_Operation_P);
		// InputPin BehaviorPort_Operation_assertP_p.out::object
		addToElementRepository("object", BehaviorPort_Operation_assertP_p_out_object);
		BehaviorPort_Operation_assertP_p_out_object.setName("object");
		BehaviorPort_Operation_assertP_p_out_object.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_out_object.setType(BehaviorPort_Operation_P);
		// InputPin BehaviorPort_Operation_assertP_writeLine p.return::value
		addToElementRepository("value", BehaviorPort_Operation_assertP_writeLine_p_return_value);
		BehaviorPort_Operation_assertP_writeLine_p_return_value.setName("value");
		BehaviorPort_Operation_assertP_writeLine_p_return_value.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_return_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin BehaviorPort_Operation_C_C$ClassifierBehavior_Reply or()::returnInformation
		addToElementRepository("returnInformation", BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__returnInformation);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__returnInformation.setName("returnInformation");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__returnInformation.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__returnInformation.setType(BehaviorPort_Operation_P);
		// InputPin BehaviorPort_Operation_C_C_Factory_Start classifierBehavior::object
		addToElementRepository("object", BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object);
		BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object.setName("object");
		BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object.setType(BehaviorPort_Operation_C);
		// InputPin BehaviorPort_Operation_C_C$ClassifierBehavior_Call Xor::y
		addToElementRepository("y", BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y.setName("y");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
	}

	private void initializeInterface_Instances()
	{
		// Interface BehaviorPort_Operation::I
		addToElementRepository("I", BehaviorPort_Operation_I);
		BehaviorPort_Operation_I.setName("I");
		BehaviorPort_Operation_I.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_I.addOwnedOperation(BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization BehaviorPort_Operation_C::I_Realization
		addToElementRepository("I_Realization", BehaviorPort_Operation_C_I_Realization);
		BehaviorPort_Operation_C_I_Realization.setName("I_Realization");
		BehaviorPort_Operation_C_I_Realization.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_I_Realization.setContract(BehaviorPort_Operation_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean BehaviorPort_Operation_C_C_Factory_ObjectFlow127::LiteralBoolean128
		addToElementRepository("LiteralBoolean128", BehaviorPort_Operation_C_C_Factory_ObjectFlow127_LiteralBoolean128);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow127_LiteralBoolean128.setName("LiteralBoolean128");
		BehaviorPort_Operation_C_C_Factory_ObjectFlow127_LiteralBoolean128.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow127_LiteralBoolean128.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow54::LiteralBoolean56
		addToElementRepository("LiteralBoolean56", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54_LiteralBoolean56);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54_LiteralBoolean56.setName("LiteralBoolean56");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54_LiteralBoolean56.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54_LiteralBoolean56.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow63::LiteralBoolean64
		addToElementRepository("LiteralBoolean64", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63_LiteralBoolean64);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63_LiteralBoolean64.setName("LiteralBoolean64");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63_LiteralBoolean64.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63_LiteralBoolean64.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow92::LiteralBoolean93
		addToElementRepository("LiteralBoolean93", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92_LiteralBoolean93);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92_LiteralBoolean93.setName("LiteralBoolean93");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92_LiteralBoolean93.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92_LiteralBoolean93.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow189::LiteralBoolean191
		addToElementRepository("LiteralBoolean191", BehaviorPort_Operation_assertP_ObjectFlow189_LiteralBoolean191);
		BehaviorPort_Operation_assertP_ObjectFlow189_LiteralBoolean191.setName("LiteralBoolean191");
		BehaviorPort_Operation_assertP_ObjectFlow189_LiteralBoolean191.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow189_LiteralBoolean191.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_C_C$ClassifierBehavior_ObjectFlow142::LiteralBoolean144
		addToElementRepository("LiteralBoolean144", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142_LiteralBoolean144);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142_LiteralBoolean144.setName("LiteralBoolean144");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142_LiteralBoolean144.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142_LiteralBoolean144.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow205::LiteralBoolean207
		addToElementRepository("LiteralBoolean207", BehaviorPort_Operation_assertP_ObjectFlow205_LiteralBoolean207);
		BehaviorPort_Operation_assertP_ObjectFlow205_LiteralBoolean207.setName("LiteralBoolean207");
		BehaviorPort_Operation_assertP_ObjectFlow205_LiteralBoolean207.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow205_LiteralBoolean207.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_main_ObjectFlow29::LiteralBoolean31
		addToElementRepository("LiteralBoolean31", BehaviorPort_Operation_main_ObjectFlow29_LiteralBoolean31);
		BehaviorPort_Operation_main_ObjectFlow29_LiteralBoolean31.setName("LiteralBoolean31");
		BehaviorPort_Operation_main_ObjectFlow29_LiteralBoolean31.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_ObjectFlow29_LiteralBoolean31.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_C_C$ClassifierBehavior_ObjectFlow158::LiteralBoolean160
		addToElementRepository("LiteralBoolean160", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158_LiteralBoolean160);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158_LiteralBoolean160.setName("LiteralBoolean160");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158_LiteralBoolean160.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158_LiteralBoolean160.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_main_ObjectFlow21::LiteralBoolean23
		addToElementRepository("LiteralBoolean23", BehaviorPort_Operation_main_ObjectFlow21_LiteralBoolean23);
		BehaviorPort_Operation_main_ObjectFlow21_LiteralBoolean23.setName("LiteralBoolean23");
		BehaviorPort_Operation_main_ObjectFlow21_LiteralBoolean23.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_ObjectFlow21_LiteralBoolean23.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow60::LiteralBoolean61
		addToElementRepository("LiteralBoolean61", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60_LiteralBoolean61);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60_LiteralBoolean61.setName("LiteralBoolean61");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60_LiteralBoolean61.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60_LiteralBoolean61.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow101::LiteralBoolean103
		addToElementRepository("LiteralBoolean103", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101_LiteralBoolean103);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101_LiteralBoolean103.setName("LiteralBoolean103");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101_LiteralBoolean103.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101_LiteralBoolean103.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow193::LiteralBoolean195
		addToElementRepository("LiteralBoolean195", BehaviorPort_Operation_assertP_ObjectFlow193_LiteralBoolean195);
		BehaviorPort_Operation_assertP_ObjectFlow193_LiteralBoolean195.setName("LiteralBoolean195");
		BehaviorPort_Operation_assertP_ObjectFlow193_LiteralBoolean195.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow193_LiteralBoolean195.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow95::LiteralBoolean97
		addToElementRepository("LiteralBoolean97", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95_LiteralBoolean97);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95_LiteralBoolean97.setName("LiteralBoolean97");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95_LiteralBoolean97.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95_LiteralBoolean97.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_main_ObjectFlow26::LiteralBoolean28
		addToElementRepository("LiteralBoolean28", BehaviorPort_Operation_main_ObjectFlow26_LiteralBoolean28);
		BehaviorPort_Operation_main_ObjectFlow26_LiteralBoolean28.setName("LiteralBoolean28");
		BehaviorPort_Operation_main_ObjectFlow26_LiteralBoolean28.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_ObjectFlow26_LiteralBoolean28.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_C_C_Factory_ObjectFlow124::LiteralBoolean126
		addToElementRepository("LiteralBoolean126", BehaviorPort_Operation_C_C_Factory_ObjectFlow124_LiteralBoolean126);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow124_LiteralBoolean126.setName("LiteralBoolean126");
		BehaviorPort_Operation_C_C_Factory_ObjectFlow124_LiteralBoolean126.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow124_LiteralBoolean126.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_main_ObjectFlow6::LiteralBoolean8
		addToElementRepository("LiteralBoolean8", BehaviorPort_Operation_main_ObjectFlow6_LiteralBoolean8);
		BehaviorPort_Operation_main_ObjectFlow6_LiteralBoolean8.setName("LiteralBoolean8");
		BehaviorPort_Operation_main_ObjectFlow6_LiteralBoolean8.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_ObjectFlow6_LiteralBoolean8.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow182::LiteralBoolean183
		addToElementRepository("LiteralBoolean183", BehaviorPort_Operation_assertP_ObjectFlow182_LiteralBoolean183);
		BehaviorPort_Operation_assertP_ObjectFlow182_LiteralBoolean183.setName("LiteralBoolean183");
		BehaviorPort_Operation_assertP_ObjectFlow182_LiteralBoolean183.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow182_LiteralBoolean183.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow185::LiteralBoolean187
		addToElementRepository("LiteralBoolean187", BehaviorPort_Operation_assertP_ObjectFlow185_LiteralBoolean187);
		BehaviorPort_Operation_assertP_ObjectFlow185_LiteralBoolean187.setName("LiteralBoolean187");
		BehaviorPort_Operation_assertP_ObjectFlow185_LiteralBoolean187.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow185_LiteralBoolean187.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P$ClassifierBehavior_true::LiteralBoolean57
		addToElementRepository("LiteralBoolean57", BehaviorPort_Operation_P_P_ClassifierBehavior_true_LiteralBoolean57);
		BehaviorPort_Operation_P_P_ClassifierBehavior_true_LiteralBoolean57.setName("LiteralBoolean57");
		BehaviorPort_Operation_P_P_ClassifierBehavior_true_LiteralBoolean57.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_true_LiteralBoolean57.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_C_C_Factory_ObjectFlow139::LiteralBoolean140
		addToElementRepository("LiteralBoolean140", BehaviorPort_Operation_C_C_Factory_ObjectFlow139_LiteralBoolean140);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow139_LiteralBoolean140.setName("LiteralBoolean140");
		BehaviorPort_Operation_C_C_Factory_ObjectFlow139_LiteralBoolean140.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow139_LiteralBoolean140.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P_Factory_ObjectFlow33::LiteralBoolean34
		addToElementRepository("LiteralBoolean34", BehaviorPort_Operation_P_P_Factory_ObjectFlow33_LiteralBoolean34);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow33_LiteralBoolean34.setName("LiteralBoolean34");
		BehaviorPort_Operation_P_P_Factory_ObjectFlow33_LiteralBoolean34.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow33_LiteralBoolean34.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow66::LiteralBoolean67
		addToElementRepository("LiteralBoolean67", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66_LiteralBoolean67);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66_LiteralBoolean67.setName("LiteralBoolean67");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66_LiteralBoolean67.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66_LiteralBoolean67.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_C_C$ClassifierBehavior_ObjectFlow164::LiteralBoolean166
		addToElementRepository("LiteralBoolean166", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164_LiteralBoolean166);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164_LiteralBoolean166.setName("LiteralBoolean166");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164_LiteralBoolean166.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164_LiteralBoolean166.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_main_ObjectFlow0::LiteralBoolean2
		addToElementRepository("LiteralBoolean2", BehaviorPort_Operation_main_ObjectFlow0_LiteralBoolean2);
		BehaviorPort_Operation_main_ObjectFlow0_LiteralBoolean2.setName("LiteralBoolean2");
		BehaviorPort_Operation_main_ObjectFlow0_LiteralBoolean2.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_ObjectFlow0_LiteralBoolean2.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_C_C$ClassifierBehavior_ObjectFlow167::LiteralBoolean168
		addToElementRepository("LiteralBoolean168", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167_LiteralBoolean168);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167_LiteralBoolean168.setName("LiteralBoolean168");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167_LiteralBoolean168.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167_LiteralBoolean168.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow104::LiteralBoolean106
		addToElementRepository("LiteralBoolean106", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104_LiteralBoolean106);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104_LiteralBoolean106.setName("LiteralBoolean106");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104_LiteralBoolean106.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104_LiteralBoolean106.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow89::LiteralBoolean90
		addToElementRepository("LiteralBoolean90", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89_LiteralBoolean90);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89_LiteralBoolean90.setName("LiteralBoolean90");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89_LiteralBoolean90.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89_LiteralBoolean90.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow226::LiteralBoolean228
		addToElementRepository("LiteralBoolean228", BehaviorPort_Operation_assertP_ObjectFlow226_LiteralBoolean228);
		BehaviorPort_Operation_assertP_ObjectFlow226_LiteralBoolean228.setName("LiteralBoolean228");
		BehaviorPort_Operation_assertP_ObjectFlow226_LiteralBoolean228.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow226_LiteralBoolean228.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P_Factory_ObjectFlow41::LiteralBoolean42
		addToElementRepository("LiteralBoolean42", BehaviorPort_Operation_P_P_Factory_ObjectFlow41_LiteralBoolean42);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow41_LiteralBoolean42.setName("LiteralBoolean42");
		BehaviorPort_Operation_P_P_Factory_ObjectFlow41_LiteralBoolean42.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow41_LiteralBoolean42.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_C_C$ClassifierBehavior_ObjectFlow161::LiteralBoolean163
		addToElementRepository("LiteralBoolean163", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161_LiteralBoolean163);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161_LiteralBoolean163.setName("LiteralBoolean163");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161_LiteralBoolean163.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161_LiteralBoolean163.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P_Factory_ObjectFlow44::LiteralBoolean46
		addToElementRepository("LiteralBoolean46", BehaviorPort_Operation_P_P_Factory_ObjectFlow44_LiteralBoolean46);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow44_LiteralBoolean46.setName("LiteralBoolean46");
		BehaviorPort_Operation_P_P_Factory_ObjectFlow44_LiteralBoolean46.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow44_LiteralBoolean46.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_C_C$ClassifierBehavior_ObjectFlow155::LiteralBoolean156
		addToElementRepository("LiteralBoolean156", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155_LiteralBoolean156);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155_LiteralBoolean156.setName("LiteralBoolean156");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155_LiteralBoolean156.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155_LiteralBoolean156.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_P_P_Factory_ObjectFlow36::LiteralBoolean38
		addToElementRepository("LiteralBoolean38", BehaviorPort_Operation_P_P_Factory_ObjectFlow36_LiteralBoolean38);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow36_LiteralBoolean38.setName("LiteralBoolean38");
		BehaviorPort_Operation_P_P_Factory_ObjectFlow36_LiteralBoolean38.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow36_LiteralBoolean38.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_assertP_ObjectFlow179::LiteralBoolean181
		addToElementRepository("LiteralBoolean181", BehaviorPort_Operation_assertP_ObjectFlow179_LiteralBoolean181);
		BehaviorPort_Operation_assertP_ObjectFlow179_LiteralBoolean181.setName("LiteralBoolean181");
		BehaviorPort_Operation_assertP_ObjectFlow179_LiteralBoolean181.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow179_LiteralBoolean181.setValue(true);
		// LiteralBoolean BehaviorPort_Operation_C_C_Factory_ObjectFlow121::LiteralBoolean122
		addToElementRepository("LiteralBoolean122", BehaviorPort_Operation_C_C_Factory_ObjectFlow121_LiteralBoolean122);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow121_LiteralBoolean122.setName("LiteralBoolean122");
		BehaviorPort_Operation_C_C_Factory_ObjectFlow121_LiteralBoolean122.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow121_LiteralBoolean122.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_Accept Start_result::LiteralInteger99
		addToElementRepository("LiteralInteger99", BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralInteger99);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralInteger99.setName("LiteralInteger99");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralInteger99.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralInteger99.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C_Factory_ObjectFlow139::LiteralInteger141
		addToElementRepository("LiteralInteger141", BehaviorPort_Operation_C_C_Factory_ObjectFlow139_LiteralInteger141);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow139_LiteralInteger141.setName("LiteralInteger141");
		BehaviorPort_Operation_C_C_Factory_ObjectFlow139_LiteralInteger141.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow139_LiteralInteger141.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P_Factory_Create P_result::LiteralInteger53
		addToElementRepository("LiteralInteger53", BehaviorPort_Operation_P_P_Factory_Create_P_result_LiteralInteger53);
		BehaviorPort_Operation_P_P_Factory_Create_P_result_LiteralInteger53.setName("LiteralInteger53");
		BehaviorPort_Operation_P_P_Factory_Create_P_result_LiteralInteger53.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_Create_P_result_LiteralInteger53.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C_Factory_ObjectFlow121::LiteralInteger123
		addToElementRepository("LiteralInteger123", BehaviorPort_Operation_C_C_Factory_ObjectFlow121_LiteralInteger123);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow121_LiteralInteger123.setName("LiteralInteger123");
		BehaviorPort_Operation_C_C_Factory_ObjectFlow121_LiteralInteger123.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow121_LiteralInteger123.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C$ClassifierBehavior_ObjectFlow161::LiteralInteger162
		addToElementRepository("LiteralInteger162", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161_LiteralInteger162);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161_LiteralInteger162.setName("LiteralInteger162");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161_LiteralInteger162.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161_LiteralInteger162.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_assertP_p::LiteralInteger3
		addToElementRepository("LiteralInteger3", BehaviorPort_Operation_main_assertP_p_LiteralInteger3);
		BehaviorPort_Operation_main_assertP_p_LiteralInteger3.setName("LiteralInteger3");
		BehaviorPort_Operation_main_assertP_p_LiteralInteger3.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_assertP_p_LiteralInteger3.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C$ClassifierBehavior_ObjectFlow142::LiteralInteger143
		addToElementRepository("LiteralInteger143", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142_LiteralInteger143);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142_LiteralInteger143.setName("LiteralInteger143");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142_LiteralInteger143.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142_LiteralInteger143.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P_Factory_Start classifierBehavior_object::LiteralInteger40
		addToElementRepository("LiteralInteger40", BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object_LiteralInteger40);
		BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object_LiteralInteger40.setName("LiteralInteger40");
		BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object_LiteralInteger40.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object_LiteralInteger40.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow89::LiteralInteger91
		addToElementRepository("LiteralInteger91", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89_LiteralInteger91);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89_LiteralInteger91.setName("LiteralInteger91");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89_LiteralInteger91.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89_LiteralInteger91.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_p.out_object::LiteralInteger210
		addToElementRepository("LiteralInteger210", BehaviorPort_Operation_assertP_p_out_object_LiteralInteger210);
		BehaviorPort_Operation_assertP_p_out_object_LiteralInteger210.setName("LiteralInteger210");
		BehaviorPort_Operation_assertP_p_out_object_LiteralInteger210.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_out_object_LiteralInteger210.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_return::LiteralInteger114
		addToElementRepository("LiteralInteger114", BehaviorPort_Operation_P_return_LiteralInteger114);
		BehaviorPort_Operation_P_return_LiteralInteger114.setName("LiteralInteger114");
		BehaviorPort_Operation_P_return_LiteralInteger114.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_return_LiteralInteger114.setValue(0);
		// LiteralInteger BehaviorPort_Operation_assertP_test return_input::LiteralInteger213
		addToElementRepository("LiteralInteger213", BehaviorPort_Operation_assertP_test_return_input_LiteralInteger213);
		BehaviorPort_Operation_assertP_test_return_input_LiteralInteger213.setName("LiteralInteger213");
		BehaviorPort_Operation_assertP_test_return_input_LiteralInteger213.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_test_return_input_LiteralInteger213.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow185::LiteralInteger186
		addToElementRepository("LiteralInteger186", BehaviorPort_Operation_assertP_ObjectFlow185_LiteralInteger186);
		BehaviorPort_Operation_assertP_ObjectFlow185_LiteralInteger186.setName("LiteralInteger186");
		BehaviorPort_Operation_assertP_ObjectFlow185_LiteralInteger186.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow185_LiteralInteger186.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow63::LiteralInteger65
		addToElementRepository("LiteralInteger65", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63_LiteralInteger65);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63_LiteralInteger65.setName("LiteralInteger65");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63_LiteralInteger65.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63_LiteralInteger65.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow95::LiteralInteger96
		addToElementRepository("LiteralInteger96", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95_LiteralInteger96);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95_LiteralInteger96.setName("LiteralInteger96");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95_LiteralInteger96.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95_LiteralInteger96.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P_Factory_ObjectFlow33::LiteralInteger35
		addToElementRepository("LiteralInteger35", BehaviorPort_Operation_P_P_Factory_ObjectFlow33_LiteralInteger35);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow33_LiteralInteger35.setName("LiteralInteger35");
		BehaviorPort_Operation_P_P_Factory_ObjectFlow33_LiteralInteger35.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow33_LiteralInteger35.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_pParameterNode::LiteralInteger197
		addToElementRepository("LiteralInteger197", BehaviorPort_Operation_assertP_pParameterNode_LiteralInteger197);
		BehaviorPort_Operation_assertP_pParameterNode_LiteralInteger197.setName("LiteralInteger197");
		BehaviorPort_Operation_assertP_pParameterNode_LiteralInteger197.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_pParameterNode_LiteralInteger197.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp_result::LiteralInteger72
		addToElementRepository("LiteralInteger72", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result_LiteralInteger72);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result_LiteralInteger72.setName("LiteralInteger72");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result_LiteralInteger72.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result_LiteralInteger72.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_p.return message_result::LiteralInteger216
		addToElementRepository("LiteralInteger216", BehaviorPort_Operation_assertP_p_return_message_result_LiteralInteger216);
		BehaviorPort_Operation_assertP_p_return_message_result_LiteralInteger216.setName("LiteralInteger216");
		BehaviorPort_Operation_assertP_p_return_message_result_LiteralInteger216.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_return_message_result_LiteralInteger216.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P_Factory_P()_target::LiteralInteger50
		addToElementRepository("LiteralInteger50", BehaviorPort_Operation_P_P_Factory_P__target_LiteralInteger50);
		BehaviorPort_Operation_P_P_Factory_P__target_LiteralInteger50.setName("LiteralInteger50");
		BehaviorPort_Operation_P_P_Factory_P__target_LiteralInteger50.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_P__target_LiteralInteger50.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_writeLine p.out_errorStatus::LiteralInteger178
		addToElementRepository("LiteralInteger178", BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralInteger178);
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralInteger178.setName("LiteralInteger178");
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralInteger178.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralInteger178.setValue(0);
		// LiteralInteger BehaviorPort_Operation_assertP_p.return_object::LiteralInteger218
		addToElementRepository("LiteralInteger218", BehaviorPort_Operation_assertP_p_return_object_LiteralInteger218);
		BehaviorPort_Operation_assertP_p_return_object_LiteralInteger218.setName("LiteralInteger218");
		BehaviorPort_Operation_assertP_p_return_object_LiteralInteger218.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_return_object_LiteralInteger218.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C_Factory_ObjectFlow124::LiteralInteger125
		addToElementRepository("LiteralInteger125", BehaviorPort_Operation_C_C_Factory_ObjectFlow124_LiteralInteger125);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow124_LiteralInteger125.setName("LiteralInteger125");
		BehaviorPort_Operation_C_C_Factory_ObjectFlow124_LiteralInteger125.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow124_LiteralInteger125.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C$ClassifierBehavior_Call Xor_y::LiteralInteger154
		addToElementRepository("LiteralInteger154", BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y_LiteralInteger154);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y_LiteralInteger154.setName("LiteralInteger154");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y_LiteralInteger154.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y_LiteralInteger154.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_p.out_result::LiteralInteger209
		addToElementRepository("LiteralInteger209", BehaviorPort_Operation_assertP_p_out_result_LiteralInteger209);
		BehaviorPort_Operation_assertP_p_out_result_LiteralInteger209.setName("LiteralInteger209");
		BehaviorPort_Operation_assertP_p_out_result_LiteralInteger209.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_out_result_LiteralInteger209.setValue(0);
		// LiteralInteger BehaviorPort_Operation_assertP_test return_input::LiteralInteger214
		addToElementRepository("LiteralInteger214", BehaviorPort_Operation_assertP_test_return_input_LiteralInteger214);
		BehaviorPort_Operation_assertP_test_return_input_LiteralInteger214.setName("LiteralInteger214");
		BehaviorPort_Operation_assertP_test_return_input_LiteralInteger214.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_test_return_input_LiteralInteger214.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow101::LiteralInteger102
		addToElementRepository("LiteralInteger102", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101_LiteralInteger102);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101_LiteralInteger102.setName("LiteralInteger102");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101_LiteralInteger102.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101_LiteralInteger102.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow92::LiteralInteger94
		addToElementRepository("LiteralInteger94", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92_LiteralInteger94);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92_LiteralInteger94.setName("LiteralInteger94");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92_LiteralInteger94.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92_LiteralInteger94.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_assertP_p::LiteralInteger4
		addToElementRepository("LiteralInteger4", BehaviorPort_Operation_main_assertP_p_LiteralInteger4);
		BehaviorPort_Operation_main_assertP_p_LiteralInteger4.setName("LiteralInteger4");
		BehaviorPort_Operation_main_assertP_p_LiteralInteger4.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_assertP_p_LiteralInteger4.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_set out_value::LiteralInteger111
		addToElementRepository("LiteralInteger111", BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value_LiteralInteger111);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value_LiteralInteger111.setName("LiteralInteger111");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value_LiteralInteger111.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value_LiteralInteger111.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_ObjectFlow26::LiteralInteger27
		addToElementRepository("LiteralInteger27", BehaviorPort_Operation_main_ObjectFlow26_LiteralInteger27);
		BehaviorPort_Operation_main_ObjectFlow26_LiteralInteger27.setName("LiteralInteger27");
		BehaviorPort_Operation_main_ObjectFlow26_LiteralInteger27.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_ObjectFlow26_LiteralInteger27.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_S()_target::LiteralInteger10
		addToElementRepository("LiteralInteger10", BehaviorPort_Operation_main_S__target_LiteralInteger10);
		BehaviorPort_Operation_main_S__target_LiteralInteger10.setName("LiteralInteger10");
		BehaviorPort_Operation_main_S__target_LiteralInteger10.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_S__target_LiteralInteger10.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_true_result::LiteralInteger58
		addToElementRepository("LiteralInteger58", BehaviorPort_Operation_P_P_ClassifierBehavior_true_result_LiteralInteger58);
		BehaviorPort_Operation_P_P_ClassifierBehavior_true_result_LiteralInteger58.setName("LiteralInteger58");
		BehaviorPort_Operation_P_P_ClassifierBehavior_true_result_LiteralInteger58.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_true_result_LiteralInteger58.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_writeLine p.out_errorStatus::LiteralInteger176
		addToElementRepository("LiteralInteger176", BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralInteger176);
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralInteger176.setName("LiteralInteger176");
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralInteger176.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralInteger176.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow179::LiteralInteger180
		addToElementRepository("LiteralInteger180", BehaviorPort_Operation_assertP_ObjectFlow179_LiteralInteger180);
		BehaviorPort_Operation_assertP_ObjectFlow179_LiteralInteger180.setName("LiteralInteger180");
		BehaviorPort_Operation_assertP_ObjectFlow179_LiteralInteger180.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow179_LiteralInteger180.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P_Factory_ObjectFlow41::LiteralInteger43
		addToElementRepository("LiteralInteger43", BehaviorPort_Operation_P_P_Factory_ObjectFlow41_LiteralInteger43);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow41_LiteralInteger43.setName("LiteralInteger43");
		BehaviorPort_Operation_P_P_Factory_ObjectFlow41_LiteralInteger43.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow41_LiteralInteger43.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P_Factory_ObjectFlow36::LiteralInteger37
		addToElementRepository("LiteralInteger37", BehaviorPort_Operation_P_P_Factory_ObjectFlow36_LiteralInteger37);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow36_LiteralInteger37.setName("LiteralInteger37");
		BehaviorPort_Operation_P_P_Factory_ObjectFlow36_LiteralInteger37.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow36_LiteralInteger37.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C_Factory_resultParameterNode::LiteralInteger120
		addToElementRepository("LiteralInteger120", BehaviorPort_Operation_C_C_Factory_resultParameterNode_LiteralInteger120);
		BehaviorPort_Operation_C_C_Factory_resultParameterNode_LiteralInteger120.setName("LiteralInteger120");
		BehaviorPort_Operation_C_C_Factory_resultParameterNode_LiteralInteger120.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_resultParameterNode_LiteralInteger120.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_p.out message_result::LiteralInteger171
		addToElementRepository("LiteralInteger171", BehaviorPort_Operation_assertP_p_out_message_result_LiteralInteger171);
		BehaviorPort_Operation_assertP_p_out_message_result_LiteralInteger171.setName("LiteralInteger171");
		BehaviorPort_Operation_assertP_p_out_message_result_LiteralInteger171.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_out_message_result_LiteralInteger171.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow193::LiteralInteger194
		addToElementRepository("LiteralInteger194", BehaviorPort_Operation_assertP_ObjectFlow193_LiteralInteger194);
		BehaviorPort_Operation_assertP_ObjectFlow193_LiteralInteger194.setName("LiteralInteger194");
		BehaviorPort_Operation_assertP_ObjectFlow193_LiteralInteger194.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow193_LiteralInteger194.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_writeLine p.return_errorStatus::LiteralInteger201
		addToElementRepository("LiteralInteger201", BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralInteger201);
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralInteger201.setName("LiteralInteger201");
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralInteger201.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralInteger201.setValue(0);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp_target::LiteralInteger77
		addToElementRepository("LiteralInteger77", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target_LiteralInteger77);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target_LiteralInteger77.setName("LiteralInteger77");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target_LiteralInteger77.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target_LiteralInteger77.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp_a::LiteralInteger75
		addToElementRepository("LiteralInteger75", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a_LiteralInteger75);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a_LiteralInteger75.setName("LiteralInteger75");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a_LiteralInteger75.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a_LiteralInteger75.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P_Factory_ObjectFlow44::LiteralInteger45
		addToElementRepository("LiteralInteger45", BehaviorPort_Operation_P_P_Factory_ObjectFlow44_LiteralInteger45);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow44_LiteralInteger45.setName("LiteralInteger45");
		BehaviorPort_Operation_P_P_Factory_ObjectFlow44_LiteralInteger45.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow44_LiteralInteger45.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C$ClassifierBehavior_ObjectFlow155::LiteralInteger157
		addToElementRepository("LiteralInteger157", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155_LiteralInteger157);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155_LiteralInteger157.setName("LiteralInteger157");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155_LiteralInteger157.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155_LiteralInteger157.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C_Factory_C()_result::LiteralInteger132
		addToElementRepository("LiteralInteger132", BehaviorPort_Operation_C_C_Factory_C__result_LiteralInteger132);
		BehaviorPort_Operation_C_C_Factory_C__result_LiteralInteger132.setName("LiteralInteger132");
		BehaviorPort_Operation_C_C_Factory_C__result_LiteralInteger132.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_C__result_LiteralInteger132.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C_Factory_ObjectFlow127::LiteralInteger129
		addToElementRepository("LiteralInteger129", BehaviorPort_Operation_C_C_Factory_ObjectFlow127_LiteralInteger129);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow127_LiteralInteger129.setName("LiteralInteger129");
		BehaviorPort_Operation_C_C_Factory_ObjectFlow127_LiteralInteger129.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow127_LiteralInteger129.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_ObjectFlow0::LiteralInteger1
		addToElementRepository("LiteralInteger1", BehaviorPort_Operation_main_ObjectFlow0_LiteralInteger1);
		BehaviorPort_Operation_main_ObjectFlow0_LiteralInteger1.setName("LiteralInteger1");
		BehaviorPort_Operation_main_ObjectFlow0_LiteralInteger1.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_ObjectFlow0_LiteralInteger1.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_out::LiteralInteger113
		addToElementRepository("LiteralInteger113", BehaviorPort_Operation_P_out_LiteralInteger113);
		BehaviorPort_Operation_P_out_LiteralInteger113.setName("LiteralInteger113");
		BehaviorPort_Operation_P_out_LiteralInteger113.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_out_LiteralInteger113.setValue(0);
		// LiteralInteger BehaviorPort_Operation_assertP_writeLine p.return_errorStatus::LiteralInteger203
		addToElementRepository("LiteralInteger203", BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralInteger203);
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralInteger203.setName("LiteralInteger203");
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralInteger203.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralInteger203.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_S()_result::LiteralInteger13
		addToElementRepository("LiteralInteger13", BehaviorPort_Operation_main_S__result_LiteralInteger13);
		BehaviorPort_Operation_main_S__result_LiteralInteger13.setName("LiteralInteger13");
		BehaviorPort_Operation_main_S__result_LiteralInteger13.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_S__result_LiteralInteger13.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_this_p::LiteralInteger80
		addToElementRepository("LiteralInteger80", BehaviorPort_Operation_P_P_ClassifierBehavior_this_p_LiteralInteger80);
		BehaviorPort_Operation_P_P_ClassifierBehavior_this_p_LiteralInteger80.setName("LiteralInteger80");
		BehaviorPort_Operation_P_P_ClassifierBehavior_this_p_LiteralInteger80.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_this_p_LiteralInteger80.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_set return_value::LiteralInteger83
		addToElementRepository("LiteralInteger83", BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value_LiteralInteger83);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value_LiteralInteger83.setName("LiteralInteger83");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value_LiteralInteger83.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value_LiteralInteger83.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_ObjectFlow29::LiteralInteger30
		addToElementRepository("LiteralInteger30", BehaviorPort_Operation_main_ObjectFlow29_LiteralInteger30);
		BehaviorPort_Operation_main_ObjectFlow29_LiteralInteger30.setName("LiteralInteger30");
		BehaviorPort_Operation_main_ObjectFlow29_LiteralInteger30.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_ObjectFlow29_LiteralInteger30.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow66::LiteralInteger68
		addToElementRepository("LiteralInteger68", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66_LiteralInteger68);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66_LiteralInteger68.setName("LiteralInteger68");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66_LiteralInteger68.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66_LiteralInteger68.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_set return_object::LiteralInteger86
		addToElementRepository("LiteralInteger86", BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object_LiteralInteger86);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object_LiteralInteger86.setName("LiteralInteger86");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object_LiteralInteger86.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object_LiteralInteger86.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_s.p_s::LiteralInteger16
		addToElementRepository("LiteralInteger16", BehaviorPort_Operation_main_s_p_s_LiteralInteger16);
		BehaviorPort_Operation_main_s_p_s_LiteralInteger16.setName("LiteralInteger16");
		BehaviorPort_Operation_main_s_p_s_LiteralInteger16.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_s_p_s_LiteralInteger16.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C_Factory_Start classifierBehavior_object::LiteralInteger137
		addToElementRepository("LiteralInteger137", BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object_LiteralInteger137);
		BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object_LiteralInteger137.setName("LiteralInteger137");
		BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object_LiteralInteger137.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object_LiteralInteger137.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_set return_result::LiteralInteger88
		addToElementRepository("LiteralInteger88", BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result_LiteralInteger88);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result_LiteralInteger88.setName("LiteralInteger88");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result_LiteralInteger88.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result_LiteralInteger88.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C$ClassifierBehavior_ObjectFlow167::LiteralInteger169
		addToElementRepository("LiteralInteger169", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167_LiteralInteger169);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167_LiteralInteger169.setName("LiteralInteger169");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167_LiteralInteger169.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167_LiteralInteger169.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_S()_result::LiteralInteger12
		addToElementRepository("LiteralInteger12", BehaviorPort_Operation_main_S__result_LiteralInteger12);
		BehaviorPort_Operation_main_S__result_LiteralInteger12.setName("LiteralInteger12");
		BehaviorPort_Operation_main_S__result_LiteralInteger12.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_S__result_LiteralInteger12.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C$ClassifierBehavior_Call Xor_x::LiteralInteger152
		addToElementRepository("LiteralInteger152", BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x_LiteralInteger152);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x_LiteralInteger152.setName("LiteralInteger152");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x_LiteralInteger152.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x_LiteralInteger152.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_s.p_result::LiteralInteger18
		addToElementRepository("LiteralInteger18", BehaviorPort_Operation_main_s_p_result_LiteralInteger18);
		BehaviorPort_Operation_main_s_p_result_LiteralInteger18.setName("LiteralInteger18");
		BehaviorPort_Operation_main_s_p_result_LiteralInteger18.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_s_p_result_LiteralInteger18.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_writeLine p.return_value::LiteralInteger198
		addToElementRepository("LiteralInteger198", BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralInteger198);
		BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralInteger198.setName("LiteralInteger198");
		BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralInteger198.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralInteger198.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_test out_input::LiteralInteger225
		addToElementRepository("LiteralInteger225", BehaviorPort_Operation_assertP_test_out_input_LiteralInteger225);
		BehaviorPort_Operation_assertP_test_out_input_LiteralInteger225.setName("LiteralInteger225");
		BehaviorPort_Operation_assertP_test_out_input_LiteralInteger225.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_test_out_input_LiteralInteger225.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp_b::LiteralInteger70
		addToElementRepository("LiteralInteger70", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b_LiteralInteger70);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b_LiteralInteger70.setName("LiteralInteger70");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b_LiteralInteger70.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b_LiteralInteger70.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P_Factory_P()_result::LiteralInteger49
		addToElementRepository("LiteralInteger49", BehaviorPort_Operation_P_P_Factory_P__result_LiteralInteger49);
		BehaviorPort_Operation_P_P_Factory_P__result_LiteralInteger49.setName("LiteralInteger49");
		BehaviorPort_Operation_P_P_Factory_P__result_LiteralInteger49.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_P__result_LiteralInteger49.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C$ClassifierBehavior_Accept or()_a::LiteralInteger147
		addToElementRepository("LiteralInteger147", BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__a_LiteralInteger147);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__a_LiteralInteger147.setName("LiteralInteger147");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__a_LiteralInteger147.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__a_LiteralInteger147.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C$ClassifierBehavior_Accept or()_b::LiteralInteger146
		addToElementRepository("LiteralInteger146", BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__b_LiteralInteger146);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__b_LiteralInteger146.setName("LiteralInteger146");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__b_LiteralInteger146.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__b_LiteralInteger146.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C$ClassifierBehavior_Call Xor_result::LiteralInteger148
		addToElementRepository("LiteralInteger148", BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralInteger148);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralInteger148.setName("LiteralInteger148");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralInteger148.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralInteger148.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P_Factory_P()_result::LiteralInteger48
		addToElementRepository("LiteralInteger48", BehaviorPort_Operation_P_P_Factory_P__result_LiteralInteger48);
		BehaviorPort_Operation_P_P_Factory_P__result_LiteralInteger48.setName("LiteralInteger48");
		BehaviorPort_Operation_P_P_Factory_P__result_LiteralInteger48.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_P__result_LiteralInteger48.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp_c::LiteralInteger73
		addToElementRepository("LiteralInteger73", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c_LiteralInteger73);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c_LiteralInteger73.setName("LiteralInteger73");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c_LiteralInteger73.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c_LiteralInteger73.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_set out_object::LiteralInteger108
		addToElementRepository("LiteralInteger108", BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object_LiteralInteger108);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object_LiteralInteger108.setName("LiteralInteger108");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object_LiteralInteger108.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object_LiteralInteger108.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow60::LiteralInteger62
		addToElementRepository("LiteralInteger62", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60_LiteralInteger62);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60_LiteralInteger62.setName("LiteralInteger62");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60_LiteralInteger62.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60_LiteralInteger62.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_Send Start_target::LiteralInteger25
		addToElementRepository("LiteralInteger25", BehaviorPort_Operation_main_Send_Start_target_LiteralInteger25);
		BehaviorPort_Operation_main_Send_Start_target_LiteralInteger25.setName("LiteralInteger25");
		BehaviorPort_Operation_main_Send_Start_target_LiteralInteger25.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_Send_Start_target_LiteralInteger25.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_ObjectFlow6::LiteralInteger7
		addToElementRepository("LiteralInteger7", BehaviorPort_Operation_main_ObjectFlow6_LiteralInteger7);
		BehaviorPort_Operation_main_ObjectFlow6_LiteralInteger7.setName("LiteralInteger7");
		BehaviorPort_Operation_main_ObjectFlow6_LiteralInteger7.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_ObjectFlow6_LiteralInteger7.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_ObjectFlow21::LiteralInteger22
		addToElementRepository("LiteralInteger22", BehaviorPort_Operation_main_ObjectFlow21_LiteralInteger22);
		BehaviorPort_Operation_main_ObjectFlow21_LiteralInteger22.setName("LiteralInteger22");
		BehaviorPort_Operation_main_ObjectFlow21_LiteralInteger22.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_ObjectFlow21_LiteralInteger22.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow226::LiteralInteger227
		addToElementRepository("LiteralInteger227", BehaviorPort_Operation_assertP_ObjectFlow226_LiteralInteger227);
		BehaviorPort_Operation_assertP_ObjectFlow226_LiteralInteger227.setName("LiteralInteger227");
		BehaviorPort_Operation_assertP_ObjectFlow226_LiteralInteger227.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow226_LiteralInteger227.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow189::LiteralInteger190
		addToElementRepository("LiteralInteger190", BehaviorPort_Operation_assertP_ObjectFlow189_LiteralInteger190);
		BehaviorPort_Operation_assertP_ObjectFlow189_LiteralInteger190.setName("LiteralInteger190");
		BehaviorPort_Operation_assertP_ObjectFlow189_LiteralInteger190.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow189_LiteralInteger190.setValue(1);
		// LiteralInteger BehaviorPort_Operation_main_Create S_result::LiteralInteger15
		addToElementRepository("LiteralInteger15", BehaviorPort_Operation_main_Create_S_result_LiteralInteger15);
		BehaviorPort_Operation_main_Create_S_result_LiteralInteger15.setName("LiteralInteger15");
		BehaviorPort_Operation_main_Create_S_result_LiteralInteger15.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_Create_S_result_LiteralInteger15.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_writeLine p.out_value::LiteralInteger173
		addToElementRepository("LiteralInteger173", BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralInteger173);
		BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralInteger173.setName("LiteralInteger173");
		BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralInteger173.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralInteger173.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C_Factory_C()_result::LiteralInteger134
		addToElementRepository("LiteralInteger134", BehaviorPort_Operation_C_C_Factory_C__result_LiteralInteger134);
		BehaviorPort_Operation_C_C_Factory_C__result_LiteralInteger134.setName("LiteralInteger134");
		BehaviorPort_Operation_C_C_Factory_C__result_LiteralInteger134.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_C__result_LiteralInteger134.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C_Factory_Create C_result::LiteralInteger130
		addToElementRepository("LiteralInteger130", BehaviorPort_Operation_C_C_Factory_Create_C_result_LiteralInteger130);
		BehaviorPort_Operation_C_C_Factory_Create_C_result_LiteralInteger130.setName("LiteralInteger130");
		BehaviorPort_Operation_C_C_Factory_Create_C_result_LiteralInteger130.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_Create_C_result_LiteralInteger130.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow205::LiteralInteger206
		addToElementRepository("LiteralInteger206", BehaviorPort_Operation_assertP_ObjectFlow205_LiteralInteger206);
		BehaviorPort_Operation_assertP_ObjectFlow205_LiteralInteger206.setName("LiteralInteger206");
		BehaviorPort_Operation_assertP_ObjectFlow205_LiteralInteger206.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow205_LiteralInteger206.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_p.return_result::LiteralInteger221
		addToElementRepository("LiteralInteger221", BehaviorPort_Operation_assertP_p_return_result_LiteralInteger221);
		BehaviorPort_Operation_assertP_p_return_result_LiteralInteger221.setName("LiteralInteger221");
		BehaviorPort_Operation_assertP_p_return_result_LiteralInteger221.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_return_result_LiteralInteger221.setValue(0);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow104::LiteralInteger105
		addToElementRepository("LiteralInteger105", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104_LiteralInteger105);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104_LiteralInteger105.setName("LiteralInteger105");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104_LiteralInteger105.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104_LiteralInteger105.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C_Factory_C()_target::LiteralInteger136
		addToElementRepository("LiteralInteger136", BehaviorPort_Operation_C_C_Factory_C__target_LiteralInteger136);
		BehaviorPort_Operation_C_C_Factory_C__target_LiteralInteger136.setName("LiteralInteger136");
		BehaviorPort_Operation_C_C_Factory_C__target_LiteralInteger136.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_C__target_LiteralInteger136.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C$ClassifierBehavior_ObjectFlow164::LiteralInteger165
		addToElementRepository("LiteralInteger165", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164_LiteralInteger165);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164_LiteralInteger165.setName("LiteralInteger165");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164_LiteralInteger165.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164_LiteralInteger165.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C$ClassifierBehavior_ObjectFlow158::LiteralInteger159
		addToElementRepository("LiteralInteger159", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158_LiteralInteger159);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158_LiteralInteger159.setName("LiteralInteger159");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158_LiteralInteger159.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158_LiteralInteger159.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_ObjectFlow182::LiteralInteger184
		addToElementRepository("LiteralInteger184", BehaviorPort_Operation_assertP_ObjectFlow182_LiteralInteger184);
		BehaviorPort_Operation_assertP_ObjectFlow182_LiteralInteger184.setName("LiteralInteger184");
		BehaviorPort_Operation_assertP_ObjectFlow182_LiteralInteger184.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_ObjectFlow182_LiteralInteger184.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_writeLine p.out_value::LiteralInteger175
		addToElementRepository("LiteralInteger175", BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralInteger175);
		BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralInteger175.setName("LiteralInteger175");
		BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralInteger175.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralInteger175.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_ObjectFlow54::LiteralInteger55
		addToElementRepository("LiteralInteger55", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54_LiteralInteger55);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54_LiteralInteger55.setName("LiteralInteger55");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54_LiteralInteger55.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54_LiteralInteger55.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_Accept Start_result::LiteralInteger98
		addToElementRepository("LiteralInteger98", BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralInteger98);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralInteger98.setName("LiteralInteger98");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralInteger98.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralInteger98.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P$ClassifierBehavior_set out_result::LiteralInteger109
		addToElementRepository("LiteralInteger109", BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result_LiteralInteger109);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result_LiteralInteger109.setName("LiteralInteger109");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result_LiteralInteger109.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result_LiteralInteger109.setValue(1);
		// LiteralInteger BehaviorPort_Operation_C_C$ClassifierBehavior_Call Xor_result::LiteralInteger150
		addToElementRepository("LiteralInteger150", BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralInteger150);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralInteger150.setName("LiteralInteger150");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralInteger150.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralInteger150.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_test out_input::LiteralInteger224
		addToElementRepository("LiteralInteger224", BehaviorPort_Operation_assertP_test_out_input_LiteralInteger224);
		BehaviorPort_Operation_assertP_test_out_input_LiteralInteger224.setName("LiteralInteger224");
		BehaviorPort_Operation_assertP_test_out_input_LiteralInteger224.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_test_out_input_LiteralInteger224.setValue(1);
		// LiteralInteger BehaviorPort_Operation_assertP_writeLine p.return_value::LiteralInteger199
		addToElementRepository("LiteralInteger199", BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralInteger199);
		BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralInteger199.setName("LiteralInteger199");
		BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralInteger199.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralInteger199.setValue(1);
		// LiteralInteger BehaviorPort_Operation_P_P_Factory_resultParameterNode::LiteralInteger32
		addToElementRepository("LiteralInteger32", BehaviorPort_Operation_P_P_Factory_resultParameterNode_LiteralInteger32);
		BehaviorPort_Operation_P_P_Factory_resultParameterNode_LiteralInteger32.setName("LiteralInteger32");
		BehaviorPort_Operation_P_P_Factory_resultParameterNode_LiteralInteger32.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_resultParameterNode_LiteralInteger32.setValue(1);
	}

	private void initializeLiteralString_Instances()
	{
		// LiteralString BehaviorPort_Operation_assertP_p.return message::LiteralString217
		addToElementRepository("LiteralString217", BehaviorPort_Operation_assertP_p_return_message_LiteralString217);
		BehaviorPort_Operation_assertP_p_return_message_LiteralString217.setName("LiteralString217");
		BehaviorPort_Operation_assertP_p_return_message_LiteralString217.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_return_message_LiteralString217.setValue("Asserting p.return == false");
		// LiteralString BehaviorPort_Operation_assertP_p.out message::LiteralString172
		addToElementRepository("LiteralString172", BehaviorPort_Operation_assertP_p_out_message_LiteralString172);
		BehaviorPort_Operation_assertP_p_out_message_LiteralString172.setName("LiteralString172");
		BehaviorPort_Operation_assertP_p_out_message_LiteralString172.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_out_message_LiteralString172.setValue("Asserting p.out == false");
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P_Factory_Start classifierBehavior_object::LiteralUnlimitedNatural39
		addToElementRepository("LiteralUnlimitedNatural39", BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object_LiteralUnlimitedNatural39);
		BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object_LiteralUnlimitedNatural39.setName("LiteralUnlimitedNatural39");
		BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object_LiteralUnlimitedNatural39.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object_LiteralUnlimitedNatural39.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_main_Send Start_target::LiteralUnlimitedNatural24
		addToElementRepository("LiteralUnlimitedNatural24", BehaviorPort_Operation_main_Send_Start_target_LiteralUnlimitedNatural24);
		BehaviorPort_Operation_main_Send_Start_target_LiteralUnlimitedNatural24.setName("LiteralUnlimitedNatural24");
		BehaviorPort_Operation_main_Send_Start_target_LiteralUnlimitedNatural24.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_Send_Start_target_LiteralUnlimitedNatural24.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_set return_object::LiteralUnlimitedNatural85
		addToElementRepository("LiteralUnlimitedNatural85", BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object_LiteralUnlimitedNatural85);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object_LiteralUnlimitedNatural85.setName("LiteralUnlimitedNatural85");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object_LiteralUnlimitedNatural85.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object_LiteralUnlimitedNatural85.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_assertP_test out_input::LiteralUnlimitedNatural223
		addToElementRepository("LiteralUnlimitedNatural223", BehaviorPort_Operation_assertP_test_out_input_LiteralUnlimitedNatural223);
		BehaviorPort_Operation_assertP_test_out_input_LiteralUnlimitedNatural223.setName("LiteralUnlimitedNatural223");
		BehaviorPort_Operation_assertP_test_out_input_LiteralUnlimitedNatural223.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_test_out_input_LiteralUnlimitedNatural223.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_assertP_writeLine p.return_errorStatus::LiteralUnlimitedNatural202
		addToElementRepository("LiteralUnlimitedNatural202", BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralUnlimitedNatural202);
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralUnlimitedNatural202.setName("LiteralUnlimitedNatural202");
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralUnlimitedNatural202.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus_LiteralUnlimitedNatural202.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_C_C$ClassifierBehavior_Call Xor_result::LiteralUnlimitedNatural149
		addToElementRepository("LiteralUnlimitedNatural149", BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralUnlimitedNatural149);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralUnlimitedNatural149.setName("LiteralUnlimitedNatural149");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralUnlimitedNatural149.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result_LiteralUnlimitedNatural149.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_main_S()_result::LiteralUnlimitedNatural11
		addToElementRepository("LiteralUnlimitedNatural11", BehaviorPort_Operation_main_S__result_LiteralUnlimitedNatural11);
		BehaviorPort_Operation_main_S__result_LiteralUnlimitedNatural11.setName("LiteralUnlimitedNatural11");
		BehaviorPort_Operation_main_S__result_LiteralUnlimitedNatural11.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_S__result_LiteralUnlimitedNatural11.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_assertP_writeLine p.return_value::LiteralUnlimitedNatural200
		addToElementRepository("LiteralUnlimitedNatural200", BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralUnlimitedNatural200);
		BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralUnlimitedNatural200.setName("LiteralUnlimitedNatural200");
		BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralUnlimitedNatural200.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_return_value_LiteralUnlimitedNatural200.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P_Factory_P()_target::LiteralUnlimitedNatural51
		addToElementRepository("LiteralUnlimitedNatural51", BehaviorPort_Operation_P_P_Factory_P__target_LiteralUnlimitedNatural51);
		BehaviorPort_Operation_P_P_Factory_P__target_LiteralUnlimitedNatural51.setName("LiteralUnlimitedNatural51");
		BehaviorPort_Operation_P_P_Factory_P__target_LiteralUnlimitedNatural51.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_P__target_LiteralUnlimitedNatural51.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_C_C_Factory_C()_target::LiteralUnlimitedNatural135
		addToElementRepository("LiteralUnlimitedNatural135", BehaviorPort_Operation_C_C_Factory_C__target_LiteralUnlimitedNatural135);
		BehaviorPort_Operation_C_C_Factory_C__target_LiteralUnlimitedNatural135.setName("LiteralUnlimitedNatural135");
		BehaviorPort_Operation_C_C_Factory_C__target_LiteralUnlimitedNatural135.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_C__target_LiteralUnlimitedNatural135.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_this_p::LiteralUnlimitedNatural81
		addToElementRepository("LiteralUnlimitedNatural81", BehaviorPort_Operation_P_P_ClassifierBehavior_this_p_LiteralUnlimitedNatural81);
		BehaviorPort_Operation_P_P_ClassifierBehavior_this_p_LiteralUnlimitedNatural81.setName("LiteralUnlimitedNatural81");
		BehaviorPort_Operation_P_P_ClassifierBehavior_this_p_LiteralUnlimitedNatural81.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_this_p_LiteralUnlimitedNatural81.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P_Factory_Create P_result::LiteralUnlimitedNatural52
		addToElementRepository("LiteralUnlimitedNatural52", BehaviorPort_Operation_P_P_Factory_Create_P_result_LiteralUnlimitedNatural52);
		BehaviorPort_Operation_P_P_Factory_Create_P_result_LiteralUnlimitedNatural52.setName("LiteralUnlimitedNatural52");
		BehaviorPort_Operation_P_P_Factory_Create_P_result_LiteralUnlimitedNatural52.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_Create_P_result_LiteralUnlimitedNatural52.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_assertP_writeLine p.out_errorStatus::LiteralUnlimitedNatural177
		addToElementRepository("LiteralUnlimitedNatural177", BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralUnlimitedNatural177);
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralUnlimitedNatural177.setName("LiteralUnlimitedNatural177");
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralUnlimitedNatural177.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus_LiteralUnlimitedNatural177.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_main_s.p_result::LiteralUnlimitedNatural19
		addToElementRepository("LiteralUnlimitedNatural19", BehaviorPort_Operation_main_s_p_result_LiteralUnlimitedNatural19);
		BehaviorPort_Operation_main_s_p_result_LiteralUnlimitedNatural19.setName("LiteralUnlimitedNatural19");
		BehaviorPort_Operation_main_s_p_result_LiteralUnlimitedNatural19.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_s_p_result_LiteralUnlimitedNatural19.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_assertP_p.return message_result::LiteralUnlimitedNatural215
		addToElementRepository("LiteralUnlimitedNatural215", BehaviorPort_Operation_assertP_p_return_message_result_LiteralUnlimitedNatural215);
		BehaviorPort_Operation_assertP_p_return_message_result_LiteralUnlimitedNatural215.setName("LiteralUnlimitedNatural215");
		BehaviorPort_Operation_assertP_p_return_message_result_LiteralUnlimitedNatural215.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_return_message_result_LiteralUnlimitedNatural215.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_set out_result::LiteralUnlimitedNatural110
		addToElementRepository("LiteralUnlimitedNatural110", BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result_LiteralUnlimitedNatural110);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result_LiteralUnlimitedNatural110.setName("LiteralUnlimitedNatural110");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result_LiteralUnlimitedNatural110.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result_LiteralUnlimitedNatural110.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_C_C_Factory_Start classifierBehavior_object::LiteralUnlimitedNatural138
		addToElementRepository("LiteralUnlimitedNatural138", BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object_LiteralUnlimitedNatural138);
		BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object_LiteralUnlimitedNatural138.setName("LiteralUnlimitedNatural138");
		BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object_LiteralUnlimitedNatural138.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object_LiteralUnlimitedNatural138.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P_Factory_P()_result::LiteralUnlimitedNatural47
		addToElementRepository("LiteralUnlimitedNatural47", BehaviorPort_Operation_P_P_Factory_P__result_LiteralUnlimitedNatural47);
		BehaviorPort_Operation_P_P_Factory_P__result_LiteralUnlimitedNatural47.setName("LiteralUnlimitedNatural47");
		BehaviorPort_Operation_P_P_Factory_P__result_LiteralUnlimitedNatural47.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_P__result_LiteralUnlimitedNatural47.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp_result::LiteralUnlimitedNatural71
		addToElementRepository("LiteralUnlimitedNatural71", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result_LiteralUnlimitedNatural71);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result_LiteralUnlimitedNatural71.setName("LiteralUnlimitedNatural71");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result_LiteralUnlimitedNatural71.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result_LiteralUnlimitedNatural71.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_main_S()_target::LiteralUnlimitedNatural9
		addToElementRepository("LiteralUnlimitedNatural9", BehaviorPort_Operation_main_S__target_LiteralUnlimitedNatural9);
		BehaviorPort_Operation_main_S__target_LiteralUnlimitedNatural9.setName("LiteralUnlimitedNatural9");
		BehaviorPort_Operation_main_S__target_LiteralUnlimitedNatural9.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_S__target_LiteralUnlimitedNatural9.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_assertP_p.return_result::LiteralUnlimitedNatural220
		addToElementRepository("LiteralUnlimitedNatural220", BehaviorPort_Operation_assertP_p_return_result_LiteralUnlimitedNatural220);
		BehaviorPort_Operation_assertP_p_return_result_LiteralUnlimitedNatural220.setName("LiteralUnlimitedNatural220");
		BehaviorPort_Operation_assertP_p_return_result_LiteralUnlimitedNatural220.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_return_result_LiteralUnlimitedNatural220.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp_b::LiteralUnlimitedNatural69
		addToElementRepository("LiteralUnlimitedNatural69", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b_LiteralUnlimitedNatural69);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b_LiteralUnlimitedNatural69.setName("LiteralUnlimitedNatural69");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b_LiteralUnlimitedNatural69.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b_LiteralUnlimitedNatural69.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_C_C$ClassifierBehavior_Call Xor_y::LiteralUnlimitedNatural153
		addToElementRepository("LiteralUnlimitedNatural153", BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y_LiteralUnlimitedNatural153);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y_LiteralUnlimitedNatural153.setName("LiteralUnlimitedNatural153");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y_LiteralUnlimitedNatural153.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y_LiteralUnlimitedNatural153.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_true_result::LiteralUnlimitedNatural59
		addToElementRepository("LiteralUnlimitedNatural59", BehaviorPort_Operation_P_P_ClassifierBehavior_true_result_LiteralUnlimitedNatural59);
		BehaviorPort_Operation_P_P_ClassifierBehavior_true_result_LiteralUnlimitedNatural59.setName("LiteralUnlimitedNatural59");
		BehaviorPort_Operation_P_P_ClassifierBehavior_true_result_LiteralUnlimitedNatural59.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_true_result_LiteralUnlimitedNatural59.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_assertP_writeLine p.out_value::LiteralUnlimitedNatural174
		addToElementRepository("LiteralUnlimitedNatural174", BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralUnlimitedNatural174);
		BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralUnlimitedNatural174.setName("LiteralUnlimitedNatural174");
		BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralUnlimitedNatural174.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_out_value_LiteralUnlimitedNatural174.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp_c::LiteralUnlimitedNatural74
		addToElementRepository("LiteralUnlimitedNatural74", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c_LiteralUnlimitedNatural74);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c_LiteralUnlimitedNatural74.setName("LiteralUnlimitedNatural74");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c_LiteralUnlimitedNatural74.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c_LiteralUnlimitedNatural74.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_set out_value::LiteralUnlimitedNatural112
		addToElementRepository("LiteralUnlimitedNatural112", BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value_LiteralUnlimitedNatural112);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value_LiteralUnlimitedNatural112.setName("LiteralUnlimitedNatural112");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value_LiteralUnlimitedNatural112.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value_LiteralUnlimitedNatural112.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_assertP_test return_input::LiteralUnlimitedNatural212
		addToElementRepository("LiteralUnlimitedNatural212", BehaviorPort_Operation_assertP_test_return_input_LiteralUnlimitedNatural212);
		BehaviorPort_Operation_assertP_test_return_input_LiteralUnlimitedNatural212.setName("LiteralUnlimitedNatural212");
		BehaviorPort_Operation_assertP_test_return_input_LiteralUnlimitedNatural212.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_test_return_input_LiteralUnlimitedNatural212.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_assertP_p.out message_result::LiteralUnlimitedNatural170
		addToElementRepository("LiteralUnlimitedNatural170", BehaviorPort_Operation_assertP_p_out_message_result_LiteralUnlimitedNatural170);
		BehaviorPort_Operation_assertP_p_out_message_result_LiteralUnlimitedNatural170.setName("LiteralUnlimitedNatural170");
		BehaviorPort_Operation_assertP_p_out_message_result_LiteralUnlimitedNatural170.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_out_message_result_LiteralUnlimitedNatural170.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_main_Create S_result::LiteralUnlimitedNatural14
		addToElementRepository("LiteralUnlimitedNatural14", BehaviorPort_Operation_main_Create_S_result_LiteralUnlimitedNatural14);
		BehaviorPort_Operation_main_Create_S_result_LiteralUnlimitedNatural14.setName("LiteralUnlimitedNatural14");
		BehaviorPort_Operation_main_Create_S_result_LiteralUnlimitedNatural14.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_Create_S_result_LiteralUnlimitedNatural14.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_C_C_Factory_C()_result::LiteralUnlimitedNatural133
		addToElementRepository("LiteralUnlimitedNatural133", BehaviorPort_Operation_C_C_Factory_C__result_LiteralUnlimitedNatural133);
		BehaviorPort_Operation_C_C_Factory_C__result_LiteralUnlimitedNatural133.setName("LiteralUnlimitedNatural133");
		BehaviorPort_Operation_C_C_Factory_C__result_LiteralUnlimitedNatural133.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_C__result_LiteralUnlimitedNatural133.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_set out_object::LiteralUnlimitedNatural107
		addToElementRepository("LiteralUnlimitedNatural107", BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object_LiteralUnlimitedNatural107);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object_LiteralUnlimitedNatural107.setName("LiteralUnlimitedNatural107");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object_LiteralUnlimitedNatural107.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object_LiteralUnlimitedNatural107.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_C_C$ClassifierBehavior_Call Xor_x::LiteralUnlimitedNatural151
		addToElementRepository("LiteralUnlimitedNatural151", BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x_LiteralUnlimitedNatural151);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x_LiteralUnlimitedNatural151.setName("LiteralUnlimitedNatural151");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x_LiteralUnlimitedNatural151.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x_LiteralUnlimitedNatural151.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_assertP_p.out_object::LiteralUnlimitedNatural211
		addToElementRepository("LiteralUnlimitedNatural211", BehaviorPort_Operation_assertP_p_out_object_LiteralUnlimitedNatural211);
		BehaviorPort_Operation_assertP_p_out_object_LiteralUnlimitedNatural211.setName("LiteralUnlimitedNatural211");
		BehaviorPort_Operation_assertP_p_out_object_LiteralUnlimitedNatural211.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_out_object_LiteralUnlimitedNatural211.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_main_s.p_s::LiteralUnlimitedNatural17
		addToElementRepository("LiteralUnlimitedNatural17", BehaviorPort_Operation_main_s_p_s_LiteralUnlimitedNatural17);
		BehaviorPort_Operation_main_s_p_s_LiteralUnlimitedNatural17.setName("LiteralUnlimitedNatural17");
		BehaviorPort_Operation_main_s_p_s_LiteralUnlimitedNatural17.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_s_p_s_LiteralUnlimitedNatural17.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_set return_result::LiteralUnlimitedNatural87
		addToElementRepository("LiteralUnlimitedNatural87", BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result_LiteralUnlimitedNatural87);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result_LiteralUnlimitedNatural87.setName("LiteralUnlimitedNatural87");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result_LiteralUnlimitedNatural87.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result_LiteralUnlimitedNatural87.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_assertP_p.return_object::LiteralUnlimitedNatural219
		addToElementRepository("LiteralUnlimitedNatural219", BehaviorPort_Operation_assertP_p_return_object_LiteralUnlimitedNatural219);
		BehaviorPort_Operation_assertP_p_return_object_LiteralUnlimitedNatural219.setName("LiteralUnlimitedNatural219");
		BehaviorPort_Operation_assertP_p_return_object_LiteralUnlimitedNatural219.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_return_object_LiteralUnlimitedNatural219.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_C_C_Factory_Create C_result::LiteralUnlimitedNatural131
		addToElementRepository("LiteralUnlimitedNatural131", BehaviorPort_Operation_C_C_Factory_Create_C_result_LiteralUnlimitedNatural131);
		BehaviorPort_Operation_C_C_Factory_Create_C_result_LiteralUnlimitedNatural131.setName("LiteralUnlimitedNatural131");
		BehaviorPort_Operation_C_C_Factory_Create_C_result_LiteralUnlimitedNatural131.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_Create_C_result_LiteralUnlimitedNatural131.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_assertP_p.out_result::LiteralUnlimitedNatural208
		addToElementRepository("LiteralUnlimitedNatural208", BehaviorPort_Operation_assertP_p_out_result_LiteralUnlimitedNatural208);
		BehaviorPort_Operation_assertP_p_out_result_LiteralUnlimitedNatural208.setName("LiteralUnlimitedNatural208");
		BehaviorPort_Operation_assertP_p_out_result_LiteralUnlimitedNatural208.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_out_result_LiteralUnlimitedNatural208.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_main_assertP_p::LiteralUnlimitedNatural5
		addToElementRepository("LiteralUnlimitedNatural5", BehaviorPort_Operation_main_assertP_p_LiteralUnlimitedNatural5);
		BehaviorPort_Operation_main_assertP_p_LiteralUnlimitedNatural5.setName("LiteralUnlimitedNatural5");
		BehaviorPort_Operation_main_assertP_p_LiteralUnlimitedNatural5.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_assertP_p_LiteralUnlimitedNatural5.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_set return_value::LiteralUnlimitedNatural84
		addToElementRepository("LiteralUnlimitedNatural84", BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value_LiteralUnlimitedNatural84);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value_LiteralUnlimitedNatural84.setName("LiteralUnlimitedNatural84");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value_LiteralUnlimitedNatural84.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value_LiteralUnlimitedNatural84.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp_target::LiteralUnlimitedNatural78
		addToElementRepository("LiteralUnlimitedNatural78", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target_LiteralUnlimitedNatural78);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target_LiteralUnlimitedNatural78.setName("LiteralUnlimitedNatural78");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target_LiteralUnlimitedNatural78.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target_LiteralUnlimitedNatural78.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_Accept Start_result::LiteralUnlimitedNatural100
		addToElementRepository("LiteralUnlimitedNatural100", BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural100);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural100.setName("LiteralUnlimitedNatural100");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural100.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result_LiteralUnlimitedNatural100.setValue(1);
		// LiteralUnlimitedNatural BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp_a::LiteralUnlimitedNatural76
		addToElementRepository("LiteralUnlimitedNatural76", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a_LiteralUnlimitedNatural76);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a_LiteralUnlimitedNatural76.setName("LiteralUnlimitedNatural76");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a_LiteralUnlimitedNatural76.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a_LiteralUnlimitedNatural76.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow BehaviorPort_Operation_main::ObjectFlow0
		addToElementRepository("ObjectFlow0", BehaviorPort_Operation_main_ObjectFlow0);
		BehaviorPort_Operation_main_ObjectFlow0.setName("ObjectFlow0");
		BehaviorPort_Operation_main_ObjectFlow0.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_main_ObjectFlow0.setSource(BehaviorPort_Operation_main_S__result);
		BehaviorPort_Operation_main_ObjectFlow0.setTarget(BehaviorPort_Operation_main_s_p_s);
		BehaviorPort_Operation_main_ObjectFlow0.setGuard(BehaviorPort_Operation_main_ObjectFlow0_LiteralBoolean2);
		// ObjectFlow BehaviorPort_Operation_assertP::ObjectFlow179
		addToElementRepository("ObjectFlow179", BehaviorPort_Operation_assertP_ObjectFlow179);
		BehaviorPort_Operation_assertP_ObjectFlow179.setName("ObjectFlow179");
		BehaviorPort_Operation_assertP_ObjectFlow179.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_ObjectFlow179.setSource(BehaviorPort_Operation_assertP_p_out_message_result);
		BehaviorPort_Operation_assertP_ObjectFlow179.setTarget(BehaviorPort_Operation_assertP_writeLine_p_out_value);
		BehaviorPort_Operation_assertP_ObjectFlow179.setGuard(BehaviorPort_Operation_assertP_ObjectFlow179_LiteralBoolean181);
		// ObjectFlow BehaviorPort_Operation_main::ObjectFlow6
		addToElementRepository("ObjectFlow6", BehaviorPort_Operation_main_ObjectFlow6);
		BehaviorPort_Operation_main_ObjectFlow6.setName("ObjectFlow6");
		BehaviorPort_Operation_main_ObjectFlow6.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_main_ObjectFlow6.setSource(BehaviorPort_Operation_main_Fork_s_p);
		BehaviorPort_Operation_main_ObjectFlow6.setTarget(BehaviorPort_Operation_main_assertP_p);
		BehaviorPort_Operation_main_ObjectFlow6.setGuard(BehaviorPort_Operation_main_ObjectFlow6_LiteralBoolean8);
		// ObjectFlow BehaviorPort_Operation_C_C$ClassifierBehavior::ObjectFlow155
		addToElementRepository("ObjectFlow155", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155.setName("ObjectFlow155");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155.setSource(BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155.setTarget(BehaviorPort_Operation_C_C_ClassifierBehavior_Fork_result);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155.setGuard(BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow155_LiteralBoolean156);
		// ObjectFlow BehaviorPort_Operation_P_P$ClassifierBehavior::ObjectFlow63
		addToElementRepository("ObjectFlow63", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63.setName("ObjectFlow63");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63.setSource(BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode2);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63.setTarget(BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_b);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63.setGuard(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow63_LiteralBoolean64);
		// ObjectFlow BehaviorPort_Operation_P_P_Factory::ObjectFlow44
		addToElementRepository("ObjectFlow44", BehaviorPort_Operation_P_P_Factory_ObjectFlow44);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow44.setName("ObjectFlow44");
		BehaviorPort_Operation_P_P_Factory_ObjectFlow44.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_Factory_ObjectFlow44.setSource(BehaviorPort_Operation_P_P_Factory_Fork_object);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow44.setTarget(BehaviorPort_Operation_P_P_Factory_resultParameterNode);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow44.setGuard(BehaviorPort_Operation_P_P_Factory_ObjectFlow44_LiteralBoolean46);
		// ObjectFlow BehaviorPort_Operation_C_C$ClassifierBehavior::ObjectFlow161
		addToElementRepository("ObjectFlow161", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161.setName("ObjectFlow161");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161.setSource(BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__a);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161.setTarget(BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_x);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161.setGuard(BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow161_LiteralBoolean163);
		// ObjectFlow BehaviorPort_Operation_C_C_Factory::ObjectFlow127
		addToElementRepository("ObjectFlow127", BehaviorPort_Operation_C_C_Factory_ObjectFlow127);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow127.setName("ObjectFlow127");
		BehaviorPort_Operation_C_C_Factory_ObjectFlow127.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_Factory_ObjectFlow127.setSource(BehaviorPort_Operation_C_C_Factory_Fork_object);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow127.setTarget(BehaviorPort_Operation_C_C_Factory_resultParameterNode);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow127.setGuard(BehaviorPort_Operation_C_C_Factory_ObjectFlow127_LiteralBoolean128);
		// ObjectFlow BehaviorPort_Operation_P_P$ClassifierBehavior::ObjectFlow66
		addToElementRepository("ObjectFlow66", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66.setName("ObjectFlow66");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66.setSource(BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode2);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66.setTarget(BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_a);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66.setGuard(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow66_LiteralBoolean67);
		// ObjectFlow BehaviorPort_Operation_assertP::ObjectFlow189
		addToElementRepository("ObjectFlow189", BehaviorPort_Operation_assertP_ObjectFlow189);
		BehaviorPort_Operation_assertP_ObjectFlow189.setName("ObjectFlow189");
		BehaviorPort_Operation_assertP_ObjectFlow189.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_ObjectFlow189.setSource(BehaviorPort_Operation_assertP_p_return_result);
		BehaviorPort_Operation_assertP_ObjectFlow189.setTarget(BehaviorPort_Operation_assertP_test_return_input);
		BehaviorPort_Operation_assertP_ObjectFlow189.setGuard(BehaviorPort_Operation_assertP_ObjectFlow189_LiteralBoolean191);
		// ObjectFlow BehaviorPort_Operation_C_C$ClassifierBehavior::ObjectFlow164
		addToElementRepository("ObjectFlow164", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164.setName("ObjectFlow164");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164.setSource(BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__b);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164.setTarget(BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_y);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164.setGuard(BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow164_LiteralBoolean166);
		// ObjectFlow BehaviorPort_Operation_assertP::ObjectFlow193
		addToElementRepository("ObjectFlow193", BehaviorPort_Operation_assertP_ObjectFlow193);
		BehaviorPort_Operation_assertP_ObjectFlow193.setName("ObjectFlow193");
		BehaviorPort_Operation_assertP_ObjectFlow193.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_ObjectFlow193.setSource(BehaviorPort_Operation_assertP_Fork_p);
		BehaviorPort_Operation_assertP_ObjectFlow193.setTarget(BehaviorPort_Operation_assertP_p_out_object);
		BehaviorPort_Operation_assertP_ObjectFlow193.setGuard(BehaviorPort_Operation_assertP_ObjectFlow193_LiteralBoolean195);
		// ObjectFlow BehaviorPort_Operation_C_C_Factory::ObjectFlow124
		addToElementRepository("ObjectFlow124", BehaviorPort_Operation_C_C_Factory_ObjectFlow124);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow124.setName("ObjectFlow124");
		BehaviorPort_Operation_C_C_Factory_ObjectFlow124.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_Factory_ObjectFlow124.setSource(BehaviorPort_Operation_C_C_Factory_Fork_object);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow124.setTarget(BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow124.setGuard(BehaviorPort_Operation_C_C_Factory_ObjectFlow124_LiteralBoolean126);
		// ObjectFlow BehaviorPort_Operation_P_P$ClassifierBehavior::ObjectFlow89
		addToElementRepository("ObjectFlow89", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89.setName("ObjectFlow89");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89.setSource(BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89.setTarget(BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_value);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89.setGuard(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow89_LiteralBoolean90);
		// ObjectFlow BehaviorPort_Operation_P_P$ClassifierBehavior::ObjectFlow95
		addToElementRepository("ObjectFlow95", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95.setName("ObjectFlow95");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95.setSource(BehaviorPort_Operation_P_P_ClassifierBehavior_this_p);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95.setTarget(BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode1);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95.setGuard(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow95_LiteralBoolean97);
		// ObjectFlow BehaviorPort_Operation_P_P_Factory::ObjectFlow41
		addToElementRepository("ObjectFlow41", BehaviorPort_Operation_P_P_Factory_ObjectFlow41);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow41.setName("ObjectFlow41");
		BehaviorPort_Operation_P_P_Factory_ObjectFlow41.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_Factory_ObjectFlow41.setSource(BehaviorPort_Operation_P_P_Factory_Fork_object);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow41.setTarget(BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow41.setGuard(BehaviorPort_Operation_P_P_Factory_ObjectFlow41_LiteralBoolean42);
		// ObjectFlow BehaviorPort_Operation_P_P$ClassifierBehavior::ObjectFlow101
		addToElementRepository("ObjectFlow101", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101.setName("ObjectFlow101");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101.setSource(BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode1);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101.setTarget(BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_target);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101.setGuard(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow101_LiteralBoolean103);
		// ObjectFlow BehaviorPort_Operation_assertP::ObjectFlow226
		addToElementRepository("ObjectFlow226", BehaviorPort_Operation_assertP_ObjectFlow226);
		BehaviorPort_Operation_assertP_ObjectFlow226.setName("ObjectFlow226");
		BehaviorPort_Operation_assertP_ObjectFlow226.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_ObjectFlow226.setSource(BehaviorPort_Operation_assertP_Fork_p);
		BehaviorPort_Operation_assertP_ObjectFlow226.setTarget(BehaviorPort_Operation_assertP_p_return_object);
		BehaviorPort_Operation_assertP_ObjectFlow226.setGuard(BehaviorPort_Operation_assertP_ObjectFlow226_LiteralBoolean228);
		// ObjectFlow BehaviorPort_Operation_main::ObjectFlow21
		addToElementRepository("ObjectFlow21", BehaviorPort_Operation_main_ObjectFlow21);
		BehaviorPort_Operation_main_ObjectFlow21.setName("ObjectFlow21");
		BehaviorPort_Operation_main_ObjectFlow21.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_main_ObjectFlow21.setSource(BehaviorPort_Operation_main_Create_S_result);
		BehaviorPort_Operation_main_ObjectFlow21.setTarget(BehaviorPort_Operation_main_S__target);
		BehaviorPort_Operation_main_ObjectFlow21.setGuard(BehaviorPort_Operation_main_ObjectFlow21_LiteralBoolean23);
		// ObjectFlow BehaviorPort_Operation_P_P$ClassifierBehavior::ObjectFlow104
		addToElementRepository("ObjectFlow104", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104.setName("ObjectFlow104");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104.setSource(BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode1);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104.setTarget(BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_object);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104.setGuard(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow104_LiteralBoolean106);
		// ObjectFlow BehaviorPort_Operation_C_C$ClassifierBehavior::ObjectFlow167
		addToElementRepository("ObjectFlow167", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167.setName("ObjectFlow167");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167.setSource(BehaviorPort_Operation_C_C_ClassifierBehavior_Fork_result);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167.setTarget(BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__cr);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167.setGuard(BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow167_LiteralBoolean168);
		// ObjectFlow BehaviorPort_Operation_main::ObjectFlow26
		addToElementRepository("ObjectFlow26", BehaviorPort_Operation_main_ObjectFlow26);
		BehaviorPort_Operation_main_ObjectFlow26.setName("ObjectFlow26");
		BehaviorPort_Operation_main_ObjectFlow26.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_main_ObjectFlow26.setSource(BehaviorPort_Operation_main_s_p_result);
		BehaviorPort_Operation_main_ObjectFlow26.setTarget(BehaviorPort_Operation_main_Fork_s_p);
		BehaviorPort_Operation_main_ObjectFlow26.setGuard(BehaviorPort_Operation_main_ObjectFlow26_LiteralBoolean28);
		// ObjectFlow BehaviorPort_Operation_P_P$ClassifierBehavior::ObjectFlow54
		addToElementRepository("ObjectFlow54", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54.setName("ObjectFlow54");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54.setSource(BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54.setTarget(BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_value);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54.setGuard(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow54_LiteralBoolean56);
		// ObjectFlow BehaviorPort_Operation_P_P_Factory::ObjectFlow33
		addToElementRepository("ObjectFlow33", BehaviorPort_Operation_P_P_Factory_ObjectFlow33);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow33.setName("ObjectFlow33");
		BehaviorPort_Operation_P_P_Factory_ObjectFlow33.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_Factory_ObjectFlow33.setSource(BehaviorPort_Operation_P_P_Factory_Create_P_result);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow33.setTarget(BehaviorPort_Operation_P_P_Factory_P__target);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow33.setGuard(BehaviorPort_Operation_P_P_Factory_ObjectFlow33_LiteralBoolean34);
		// ObjectFlow BehaviorPort_Operation_C_C$ClassifierBehavior::ObjectFlow142
		addToElementRepository("ObjectFlow142", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142.setName("ObjectFlow142");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142.setSource(BehaviorPort_Operation_C_C_ClassifierBehavior_Fork_result);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142.setTarget(BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__r);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142.setGuard(BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow142_LiteralBoolean144);
		// ObjectFlow BehaviorPort_Operation_assertP::ObjectFlow182
		addToElementRepository("ObjectFlow182", BehaviorPort_Operation_assertP_ObjectFlow182);
		BehaviorPort_Operation_assertP_ObjectFlow182.setName("ObjectFlow182");
		BehaviorPort_Operation_assertP_ObjectFlow182.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_ObjectFlow182.setSource(BehaviorPort_Operation_assertP_pParameterNode);
		BehaviorPort_Operation_assertP_ObjectFlow182.setTarget(BehaviorPort_Operation_assertP_Fork_p);
		BehaviorPort_Operation_assertP_ObjectFlow182.setGuard(BehaviorPort_Operation_assertP_ObjectFlow182_LiteralBoolean183);
		// ObjectFlow BehaviorPort_Operation_P_P$ClassifierBehavior::ObjectFlow60
		addToElementRepository("ObjectFlow60", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60.setName("ObjectFlow60");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60.setSource(BehaviorPort_Operation_P_P_ClassifierBehavior_true_result);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60.setTarget(BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode2);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60.setGuard(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow60_LiteralBoolean61);
		// ObjectFlow BehaviorPort_Operation_assertP::ObjectFlow185
		addToElementRepository("ObjectFlow185", BehaviorPort_Operation_assertP_ObjectFlow185);
		BehaviorPort_Operation_assertP_ObjectFlow185.setName("ObjectFlow185");
		BehaviorPort_Operation_assertP_ObjectFlow185.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_ObjectFlow185.setSource(BehaviorPort_Operation_assertP_p_out_result);
		BehaviorPort_Operation_assertP_ObjectFlow185.setTarget(BehaviorPort_Operation_assertP_test_out_input);
		BehaviorPort_Operation_assertP_ObjectFlow185.setGuard(BehaviorPort_Operation_assertP_ObjectFlow185_LiteralBoolean187);
		// ObjectFlow BehaviorPort_Operation_C_C_Factory::ObjectFlow121
		addToElementRepository("ObjectFlow121", BehaviorPort_Operation_C_C_Factory_ObjectFlow121);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow121.setName("ObjectFlow121");
		BehaviorPort_Operation_C_C_Factory_ObjectFlow121.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_Factory_ObjectFlow121.setSource(BehaviorPort_Operation_C_C_Factory_C__result);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow121.setTarget(BehaviorPort_Operation_C_C_Factory_Fork_object);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow121.setGuard(BehaviorPort_Operation_C_C_Factory_ObjectFlow121_LiteralBoolean122);
		// ObjectFlow BehaviorPort_Operation_P_P_Factory::ObjectFlow36
		addToElementRepository("ObjectFlow36", BehaviorPort_Operation_P_P_Factory_ObjectFlow36);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow36.setName("ObjectFlow36");
		BehaviorPort_Operation_P_P_Factory_ObjectFlow36.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_Factory_ObjectFlow36.setSource(BehaviorPort_Operation_P_P_Factory_P__result);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow36.setTarget(BehaviorPort_Operation_P_P_Factory_Fork_object);
		BehaviorPort_Operation_P_P_Factory_ObjectFlow36.setGuard(BehaviorPort_Operation_P_P_Factory_ObjectFlow36_LiteralBoolean38);
		// ObjectFlow BehaviorPort_Operation_P_P$ClassifierBehavior::ObjectFlow92
		addToElementRepository("ObjectFlow92", BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92.setName("ObjectFlow92");
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92.setSource(BehaviorPort_Operation_P_P_ClassifierBehavior_ForkNode1);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92.setTarget(BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_object);
		BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92.setGuard(BehaviorPort_Operation_P_P_ClassifierBehavior_ObjectFlow92_LiteralBoolean93);
		// ObjectFlow BehaviorPort_Operation_assertP::ObjectFlow205
		addToElementRepository("ObjectFlow205", BehaviorPort_Operation_assertP_ObjectFlow205);
		BehaviorPort_Operation_assertP_ObjectFlow205.setName("ObjectFlow205");
		BehaviorPort_Operation_assertP_ObjectFlow205.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_ObjectFlow205.setSource(BehaviorPort_Operation_assertP_p_return_message_result);
		BehaviorPort_Operation_assertP_ObjectFlow205.setTarget(BehaviorPort_Operation_assertP_writeLine_p_return_value);
		BehaviorPort_Operation_assertP_ObjectFlow205.setGuard(BehaviorPort_Operation_assertP_ObjectFlow205_LiteralBoolean207);
		// ObjectFlow BehaviorPort_Operation_C_C$ClassifierBehavior::ObjectFlow158
		addToElementRepository("ObjectFlow158", BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158.setName("ObjectFlow158");
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158.setSource(BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__returnInformation);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158.setTarget(BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__returnInformation);
		BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158.setGuard(BehaviorPort_Operation_C_C_ClassifierBehavior_ObjectFlow158_LiteralBoolean160);
		// ObjectFlow BehaviorPort_Operation_main::ObjectFlow29
		addToElementRepository("ObjectFlow29", BehaviorPort_Operation_main_ObjectFlow29);
		BehaviorPort_Operation_main_ObjectFlow29.setName("ObjectFlow29");
		BehaviorPort_Operation_main_ObjectFlow29.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_main_ObjectFlow29.setSource(BehaviorPort_Operation_main_Fork_s_p);
		BehaviorPort_Operation_main_ObjectFlow29.setTarget(BehaviorPort_Operation_main_Send_Start_target);
		BehaviorPort_Operation_main_ObjectFlow29.setGuard(BehaviorPort_Operation_main_ObjectFlow29_LiteralBoolean31);
		// ObjectFlow BehaviorPort_Operation_C_C_Factory::ObjectFlow139
		addToElementRepository("ObjectFlow139", BehaviorPort_Operation_C_C_Factory_ObjectFlow139);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow139.setName("ObjectFlow139");
		BehaviorPort_Operation_C_C_Factory_ObjectFlow139.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_Factory_ObjectFlow139.setSource(BehaviorPort_Operation_C_C_Factory_Create_C_result);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow139.setTarget(BehaviorPort_Operation_C_C_Factory_C__target);
		BehaviorPort_Operation_C_C_Factory_ObjectFlow139.setGuard(BehaviorPort_Operation_C_C_Factory_ObjectFlow139_LiteralBoolean140);
	}

	private void initializeOperation_Instances()
	{
		// Operation BehaviorPort_Operation_I::Boolean_or_Boolean_Boolean_Boolean
		addToElementRepository("Boolean_or_Boolean_Boolean_Boolean", BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean);
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean.setName("or");
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean.addOwnedParameter(BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_a);
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean.addOwnedParameter(BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_b);
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean.addOwnedParameter(BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_c);
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean.addOwnedParameter(BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_result);
		// Operation BehaviorPort_Operation_S::S_S
		addToElementRepository("S_S", BehaviorPort_Operation_S_S_S);
		BehaviorPort_Operation_S_S_S.setName("S");
		BehaviorPort_Operation_S_S_S.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_S_S_S.addOwnedParameter(BehaviorPort_Operation_S_S_S_result);
		BehaviorPort_Operation_S_S_S.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation BehaviorPort_Operation_C::C_C
		addToElementRepository("C_C", BehaviorPort_Operation_C_C_C);
		BehaviorPort_Operation_C_C_C.setName("C");
		BehaviorPort_Operation_C_C_C.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_C.addOwnedParameter(BehaviorPort_Operation_C_C_C_result);
		BehaviorPort_Operation_C_C_C.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation BehaviorPort_Operation_P::P_P
		addToElementRepository("P_P", BehaviorPort_Operation_P_P_P);
		BehaviorPort_Operation_P_P_P.setName("P");
		BehaviorPort_Operation_P_P_P.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_P.addOwnedParameter(BehaviorPort_Operation_P_P_P_result);
		BehaviorPort_Operation_P_P_P.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation BehaviorPort_Operation_C::Boolean_or_Boolean_Boolean_Boolean
		addToElementRepository("Boolean_or_Boolean_Boolean_Boolean", BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean);
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean.setName("or");
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean.addOwnedParameter(BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_a);
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean.addOwnedParameter(BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_b);
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean.addOwnedParameter(BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_c);
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean.addOwnedParameter(BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_result);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin BehaviorPort_Operation_P_P$ClassifierBehavior_this::p
		addToElementRepository("p", BehaviorPort_Operation_P_P_ClassifierBehavior_this_p);
		BehaviorPort_Operation_P_P_ClassifierBehavior_this_p.setName("p");
		BehaviorPort_Operation_P_P_ClassifierBehavior_this_p.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_this_p.setType(BehaviorPort_Operation_P);
		// OutputPin BehaviorPort_Operation_C_C_Factory_C()::result
		addToElementRepository("result", BehaviorPort_Operation_C_C_Factory_C__result);
		BehaviorPort_Operation_C_C_Factory_C__result.setName("result");
		BehaviorPort_Operation_C_C_Factory_C__result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_C__result.setType(BehaviorPort_Operation_C);
		// OutputPin BehaviorPort_Operation_main_s.p::result
		addToElementRepository("result", BehaviorPort_Operation_main_s_p_result);
		BehaviorPort_Operation_main_s_p_result.setName("result");
		BehaviorPort_Operation_main_s_p_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_s_p_result.setType(BehaviorPort_Operation_P);
		// OutputPin BehaviorPort_Operation_assertP_p.return message::result
		addToElementRepository("result", BehaviorPort_Operation_assertP_p_return_message_result);
		BehaviorPort_Operation_assertP_p_return_message_result.setName("result");
		BehaviorPort_Operation_assertP_p_return_message_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_return_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin BehaviorPort_Operation_C_C_Factory_Create C::result
		addToElementRepository("result", BehaviorPort_Operation_C_C_Factory_Create_C_result);
		BehaviorPort_Operation_C_C_Factory_Create_C_result.setName("result");
		BehaviorPort_Operation_C_C_Factory_Create_C_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_Create_C_result.setType(BehaviorPort_Operation_C);
		// OutputPin BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp::result
		addToElementRepository("result", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result.setName("result");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// OutputPin BehaviorPort_Operation_P_P$ClassifierBehavior_Accept Start::result
		addToElementRepository("result", BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result.setName("result");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_result.setType(BehaviorPort_Operation_Start);
		// OutputPin BehaviorPort_Operation_P_P$ClassifierBehavior_set out::result
		addToElementRepository("result", BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result.setName("result");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_out_result.setType(BehaviorPort_Operation_P);
		// OutputPin BehaviorPort_Operation_assertP_p.out message::result
		addToElementRepository("result", BehaviorPort_Operation_assertP_p_out_message_result);
		BehaviorPort_Operation_assertP_p_out_message_result.setName("result");
		BehaviorPort_Operation_assertP_p_out_message_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_out_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin BehaviorPort_Operation_C_C$ClassifierBehavior_Accept or()::b
		addToElementRepository("b", BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__b);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__b.setName("b");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__b.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__b.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// OutputPin BehaviorPort_Operation_P_P$ClassifierBehavior_true::result
		addToElementRepository("result", BehaviorPort_Operation_P_P_ClassifierBehavior_true_result);
		BehaviorPort_Operation_P_P_ClassifierBehavior_true_result.setName("result");
		BehaviorPort_Operation_P_P_ClassifierBehavior_true_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_true_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// OutputPin BehaviorPort_Operation_P_P$ClassifierBehavior_set return::result
		addToElementRepository("result", BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result.setName("result");
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_set_return_result.setType(BehaviorPort_Operation_P);
		// OutputPin BehaviorPort_Operation_assertP_p.return::result
		addToElementRepository("result", BehaviorPort_Operation_assertP_p_return_result);
		BehaviorPort_Operation_assertP_p_return_result.setName("result");
		BehaviorPort_Operation_assertP_p_return_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_return_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		BehaviorPort_Operation_assertP_p_return_result.setLower(0);
		// OutputPin BehaviorPort_Operation_C_C$ClassifierBehavior_Accept or()::a
		addToElementRepository("a", BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__a);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__a.setName("a");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__a.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__a.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// OutputPin BehaviorPort_Operation_P_P_Factory_Create P::result
		addToElementRepository("result", BehaviorPort_Operation_P_P_Factory_Create_P_result);
		BehaviorPort_Operation_P_P_Factory_Create_P_result.setName("result");
		BehaviorPort_Operation_P_P_Factory_Create_P_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_Create_P_result.setType(BehaviorPort_Operation_P);
		// OutputPin BehaviorPort_Operation_main_Create S::result
		addToElementRepository("result", BehaviorPort_Operation_main_Create_S_result);
		BehaviorPort_Operation_main_Create_S_result.setName("result");
		BehaviorPort_Operation_main_Create_S_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_Create_S_result.setType(BehaviorPort_Operation_S);
		// OutputPin BehaviorPort_Operation_C_C$ClassifierBehavior_Call Xor::result
		addToElementRepository("result", BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result.setName("result");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Call_Xor_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// OutputPin BehaviorPort_Operation_P_P$ClassifierBehavior_Call or() via pp::c
		addToElementRepository("c", BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c.setName("c");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Call_or_via_pp_c.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// OutputPin BehaviorPort_Operation_P_P_Factory_P()::result
		addToElementRepository("result", BehaviorPort_Operation_P_P_Factory_P__result);
		BehaviorPort_Operation_P_P_Factory_P__result.setName("result");
		BehaviorPort_Operation_P_P_Factory_P__result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_P__result.setType(BehaviorPort_Operation_P);
		// OutputPin BehaviorPort_Operation_C_C$ClassifierBehavior_Accept or()::returnInformation
		addToElementRepository("returnInformation", BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__returnInformation);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__returnInformation.setName("returnInformation");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__returnInformation.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__returnInformation.setType(BehaviorPort_Operation_P);
		// OutputPin BehaviorPort_Operation_assertP_writeLine p.out::errorStatus
		addToElementRepository("errorStatus", BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus);
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus.setName("errorStatus");
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		BehaviorPort_Operation_assertP_writeLine_p_out_errorStatus.setLower(0);
		// OutputPin BehaviorPort_Operation_assertP_p.out::result
		addToElementRepository("result", BehaviorPort_Operation_assertP_p_out_result);
		BehaviorPort_Operation_assertP_p_out_result.setName("result");
		BehaviorPort_Operation_assertP_p_out_result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_out_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		BehaviorPort_Operation_assertP_p_out_result.setLower(0);
		// OutputPin BehaviorPort_Operation_main_S()::result
		addToElementRepository("result", BehaviorPort_Operation_main_S__result);
		BehaviorPort_Operation_main_S__result.setName("result");
		BehaviorPort_Operation_main_S__result.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_S__result.setType(BehaviorPort_Operation_S);
		// OutputPin BehaviorPort_Operation_assertP_writeLine p.return::errorStatus
		addToElementRepository("errorStatus", BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus);
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus.setName("errorStatus");
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		BehaviorPort_Operation_assertP_writeLine_p_return_errorStatus.setLower(0);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport BehaviorPort_Operation::PackageImport116
		addToElementRepository("PackageImport116", BehaviorPort_Operation_PackageImport116);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean::result
		addToElementRepository("result", BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_result);
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_result.setName("result");
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_result.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_result.setDirection(ParameterDirectionKind.return_);
		// Parameter BehaviorPort_Operation_assertP::p
		addToElementRepository("p", BehaviorPort_Operation_assertP_p);
		BehaviorPort_Operation_assertP_p.setName("p");
		BehaviorPort_Operation_assertP_p.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_p.setType(BehaviorPort_Operation_P);
		// Parameter BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean::result
		addToElementRepository("result", BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_result);
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_result.setName("result");
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_result.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_result.setDirection(ParameterDirectionKind.return_);
		// Parameter BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean::a
		addToElementRepository("a", BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_a);
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_a.setName("a");
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_a.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_a.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// Parameter BehaviorPort_Operation_C_C_C::result
		addToElementRepository("result", BehaviorPort_Operation_C_C_C_result);
		BehaviorPort_Operation_C_C_C_result.setName("result");
		BehaviorPort_Operation_C_C_C_result.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_C_result.setType(BehaviorPort_Operation_C);
		BehaviorPort_Operation_C_C_C_result.setDirection(ParameterDirectionKind.return_);
		// Parameter BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean::c
		addToElementRepository("c", BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_c);
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_c.setName("c");
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_c.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_c.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_c.setDirection(ParameterDirectionKind.out);
		// Parameter BehaviorPort_Operation_P_P_P::result
		addToElementRepository("result", BehaviorPort_Operation_P_P_P_result);
		BehaviorPort_Operation_P_P_P_result.setName("result");
		BehaviorPort_Operation_P_P_P_result.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_P_result.setType(BehaviorPort_Operation_P);
		BehaviorPort_Operation_P_P_P_result.setDirection(ParameterDirectionKind.return_);
		// Parameter BehaviorPort_Operation_P_P_Factory::result
		addToElementRepository("result", BehaviorPort_Operation_P_P_Factory_result);
		BehaviorPort_Operation_P_P_Factory_result.setName("result");
		BehaviorPort_Operation_P_P_Factory_result.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_P_Factory_result.setType(BehaviorPort_Operation_P);
		BehaviorPort_Operation_P_P_Factory_result.setDirection(ParameterDirectionKind.return_);
		// Parameter BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean::a
		addToElementRepository("a", BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_a);
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_a.setName("a");
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_a.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_a.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// Parameter BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean::b
		addToElementRepository("b", BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_b);
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_b.setName("b");
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_b.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_Boolean_or_Boolean_Boolean_Boolean_b.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// Parameter BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean::b
		addToElementRepository("b", BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_b);
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_b.setName("b");
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_b.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_b.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// Parameter BehaviorPort_Operation_assertP_testFalse::input
		addToElementRepository("input", BehaviorPort_Operation_assertP_testFalse_input);
		BehaviorPort_Operation_assertP_testFalse_input.setName("input");
		BehaviorPort_Operation_assertP_testFalse_input.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_assertP_testFalse_input.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// Parameter BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean::c
		addToElementRepository("c", BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_c);
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_c.setName("c");
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_c.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_c.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		BehaviorPort_Operation_I_Boolean_or_Boolean_Boolean_Boolean_c.setDirection(ParameterDirectionKind.out);
		// Parameter BehaviorPort_Operation_C_C_Factory::result
		addToElementRepository("result", BehaviorPort_Operation_C_C_Factory_result);
		BehaviorPort_Operation_C_C_Factory_result.setName("result");
		BehaviorPort_Operation_C_C_Factory_result.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_C_Factory_result.setType(BehaviorPort_Operation_C);
		BehaviorPort_Operation_C_C_Factory_result.setDirection(ParameterDirectionKind.return_);
		// Parameter BehaviorPort_Operation_S_S_S::result
		addToElementRepository("result", BehaviorPort_Operation_S_S_S_result);
		BehaviorPort_Operation_S_S_S_result.setName("result");
		BehaviorPort_Operation_S_S_S_result.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_S_S_S_result.setType(BehaviorPort_Operation_S);
		BehaviorPort_Operation_S_S_S_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port BehaviorPort_Operation_C::pc
		addToElementRepository("pc", BehaviorPort_Operation_C_pc);
		BehaviorPort_Operation_C_pc.setName("pc");
		BehaviorPort_Operation_C_pc.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_C_pc.setType(BehaviorPort_Operation_I);
		BehaviorPort_Operation_C_pc.setAggregation(AggregationKind.composite);
		BehaviorPort_Operation_C_pc.isBehavior = true;
		BehaviorPort_Operation_C_pc.isService = true;
		BehaviorPort_Operation_C_pc.addProvided(BehaviorPort_Operation_I);
		// Port BehaviorPort_Operation_P::pp
		addToElementRepository("pp", BehaviorPort_Operation_P_pp);
		BehaviorPort_Operation_P_pp.setName("pp");
		BehaviorPort_Operation_P_pp.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_P_pp.setType(BehaviorPort_Operation_I);
		BehaviorPort_Operation_P_pp.setAggregation(AggregationKind.composite);
		BehaviorPort_Operation_P_pp.isConjugated = true;;
		BehaviorPort_Operation_P_pp.isService = true;
		BehaviorPort_Operation_P_pp.addRequired(BehaviorPort_Operation_I);
	}

	private void initializeProperty_Instances()
	{
		// Property BehaviorPort_Operation_S::c
		addToElementRepository("c", BehaviorPort_Operation_S_c);
		BehaviorPort_Operation_S_c.setName("c");
		BehaviorPort_Operation_S_c.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_S_c.setType(BehaviorPort_Operation_C);
		BehaviorPort_Operation_S_c.setAggregation(AggregationKind.composite);
		// Property BehaviorPort_Operation_P::out
		addToElementRepository("out", BehaviorPort_Operation_P_out);
		BehaviorPort_Operation_P_out.setName("out");
		BehaviorPort_Operation_P_out.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_out.setLower(0);
		BehaviorPort_Operation_P_out.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// Property BehaviorPort_Operation_S::p
		addToElementRepository("p", BehaviorPort_Operation_S_p);
		BehaviorPort_Operation_S_p.setName("p");
		BehaviorPort_Operation_S_p.setVisibility(VisibilityKind.public_);
		
		BehaviorPort_Operation_S_p.setType(BehaviorPort_Operation_P);
		BehaviorPort_Operation_S_p.setAggregation(AggregationKind.composite);
		// Property BehaviorPort_Operation_P::return
		addToElementRepository("return", BehaviorPort_Operation_P_return);
		BehaviorPort_Operation_P_return.setName("return");
		BehaviorPort_Operation_P_return.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_return.setLower(0);
		BehaviorPort_Operation_P_return.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction BehaviorPort_Operation_P_P$ClassifierBehavior::this
		addToElementRepository("this", BehaviorPort_Operation_P_P_ClassifierBehavior_this);
		BehaviorPort_Operation_P_P_ClassifierBehavior_this.setName("this");
		BehaviorPort_Operation_P_P_ClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_this.setResult(BehaviorPort_Operation_P_P_ClassifierBehavior_this_p);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction BehaviorPort_Operation_assertP::p.out
		addToElementRepository("p.out", BehaviorPort_Operation_assertP_p_out);
		BehaviorPort_Operation_assertP_p_out.setName("p.out");
		BehaviorPort_Operation_assertP_p_out.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_out.setStructuralFeature(BehaviorPort_Operation_P_out);
		BehaviorPort_Operation_assertP_p_out.setObject(BehaviorPort_Operation_assertP_p_out_object);
		BehaviorPort_Operation_assertP_p_out.setResult(BehaviorPort_Operation_assertP_p_out_result);
		// ReadStructuralFeatureAction BehaviorPort_Operation_assertP::p.return
		addToElementRepository("p.return", BehaviorPort_Operation_assertP_p_return);
		BehaviorPort_Operation_assertP_p_return.setName("p.return");
		BehaviorPort_Operation_assertP_p_return.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_return.setStructuralFeature(BehaviorPort_Operation_P_return);
		BehaviorPort_Operation_assertP_p_return.setObject(BehaviorPort_Operation_assertP_p_return_object);
		BehaviorPort_Operation_assertP_p_return.setResult(BehaviorPort_Operation_assertP_p_return_result);
		// ReadStructuralFeatureAction BehaviorPort_Operation_main::s.p
		addToElementRepository("s.p", BehaviorPort_Operation_main_s_p);
		BehaviorPort_Operation_main_s_p.setName("s.p");
		BehaviorPort_Operation_main_s_p.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_s_p.setStructuralFeature(BehaviorPort_Operation_S_p);
		BehaviorPort_Operation_main_s_p.setObject(BehaviorPort_Operation_main_s_p_s);
		BehaviorPort_Operation_main_s_p.setResult(BehaviorPort_Operation_main_s_p_result);
	}

	private void initializeReception_Instances()
	{
		// Reception BehaviorPort_Operation_P::Start
		addToElementRepository("Start", BehaviorPort_Operation_P_Start);
		BehaviorPort_Operation_P_Start.setName("Start");
		BehaviorPort_Operation_P_Start.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_Start.setSignal(BehaviorPort_Operation_Start);
	}

	private void initializeReplyAction_Instances()
	{
		// ReplyAction BehaviorPort_Operation_C_C$ClassifierBehavior::Reply or()
		addToElementRepository("Reply or()", BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or_.setName("Reply or()");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or_.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or_.setReplyToCall(BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__CallEventOrTrigger);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or_.setReturnInformation(BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__returnInformation);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or_.addReplyValue(BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__cr);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or_.addReplyValue(BehaviorPort_Operation_C_C_ClassifierBehavior_Reply_or__r);
	}

	private void initializeSendSignalAction_Instances()
	{
		// SendSignalAction BehaviorPort_Operation_main::Send Start
		addToElementRepository("Send Start", BehaviorPort_Operation_main_Send_Start);
		BehaviorPort_Operation_main_Send_Start.setName("Send Start");
		BehaviorPort_Operation_main_Send_Start.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_main_Send_Start.setSignal(BehaviorPort_Operation_Start);
		BehaviorPort_Operation_main_Send_Start.setTarget(BehaviorPort_Operation_main_Send_Start_target);
	}

	private void initializeSignal_Instances()
	{
		// Signal BehaviorPort_Operation::Start
		addToElementRepository("Start", BehaviorPort_Operation_Start);
		BehaviorPort_Operation_Start.setName("Start");
		BehaviorPort_Operation_Start.setVisibility(VisibilityKind.public_);
	}

	private void initializeSignalEvent_Instances()
	{
		// SignalEvent BehaviorPort_Operation::SignalEventStart
		addToElementRepository("SignalEventStart", BehaviorPort_Operation_SignalEventStart);
		BehaviorPort_Operation_SignalEventStart.setName("SignalEventStart");
		BehaviorPort_Operation_SignalEventStart.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_SignalEventStart.setSignal(BehaviorPort_Operation_Start);
	}

	private void initializeStartObjectBehaviorAction_Instances()
	{
		// StartObjectBehaviorAction BehaviorPort_Operation_P_P_Factory::Start classifierBehavior
		addToElementRepository("Start classifierBehavior", BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior);
		BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior.setName("Start classifierBehavior");
		BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior.setObject(BehaviorPort_Operation_P_P_Factory_Start_classifierBehavior_object);
		// StartObjectBehaviorAction BehaviorPort_Operation_C_C_Factory::Start classifierBehavior
		addToElementRepository("Start classifierBehavior", BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior);
		BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior.setName("Start classifierBehavior");
		BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior.setObject(BehaviorPort_Operation_C_C_Factory_Start_classifierBehavior_object);
	}

	private void initializeTrigger_Instances()
	{
		// Trigger BehaviorPort_Operation_C_C$ClassifierBehavior_Accept or()::CallEventOrTrigger
		addToElementRepository("CallEventOrTrigger", BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__CallEventOrTrigger);
		// Trigger CallEventOrTrigger
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__CallEventOrTrigger.setName("CallEventOrTrigger");
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__CallEventOrTrigger.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_C_C_ClassifierBehavior_Accept_or__CallEventOrTrigger.setEvent(BehaviorPort_Operation_CallEventOr);
		// Trigger BehaviorPort_Operation_P_P$ClassifierBehavior_Accept Start::SignalEventStartTrigger
		addToElementRepository("SignalEventStartTrigger", BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_SignalEventStartTrigger);
		// Trigger SignalEventStartTrigger
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_SignalEventStartTrigger.setName("SignalEventStartTrigger");
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_SignalEventStartTrigger.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_Accept_Start_SignalEventStartTrigger.setEvent(BehaviorPort_Operation_SignalEventStart);
	}

	private void initializeUsage_Instances()
	{
		// Usage BehaviorPort_Operation::I_Usage_P
		addToElementRepository("I_Usage_P", BehaviorPort_Operation_I_Usage_P);
		BehaviorPort_Operation_I_Usage_P.setName("I_Usage_P");
		BehaviorPort_Operation_I_Usage_P.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_I_Usage_P.addClient(BehaviorPort_Operation_P);
		BehaviorPort_Operation_I_Usage_P.addSupplier(BehaviorPort_Operation_I);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction BehaviorPort_Operation_assertP::p.out message
		addToElementRepository("p.out message", BehaviorPort_Operation_assertP_p_out_message);
		BehaviorPort_Operation_assertP_p_out_message.setName("p.out message");
		BehaviorPort_Operation_assertP_p_out_message.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_out_message.setValue(BehaviorPort_Operation_assertP_p_out_message_LiteralString172);
		BehaviorPort_Operation_assertP_p_out_message.setResult(BehaviorPort_Operation_assertP_p_out_message_result);
		// ValueSpecificationAction BehaviorPort_Operation_P_P$ClassifierBehavior::true
		addToElementRepository("true", BehaviorPort_Operation_P_P_ClassifierBehavior_true);
		BehaviorPort_Operation_P_P_ClassifierBehavior_true.setName("true");
		BehaviorPort_Operation_P_P_ClassifierBehavior_true.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_P_P_ClassifierBehavior_true.setValue(BehaviorPort_Operation_P_P_ClassifierBehavior_true_LiteralBoolean57);
		BehaviorPort_Operation_P_P_ClassifierBehavior_true.setResult(BehaviorPort_Operation_P_P_ClassifierBehavior_true_result);
		// ValueSpecificationAction BehaviorPort_Operation_assertP::p.return message
		addToElementRepository("p.return message", BehaviorPort_Operation_assertP_p_return_message);
		BehaviorPort_Operation_assertP_p_return_message.setName("p.return message");
		BehaviorPort_Operation_assertP_p_return_message.setVisibility(VisibilityKind.public_);
		BehaviorPort_Operation_assertP_p_return_message.setValue(BehaviorPort_Operation_assertP_p_return_message_LiteralString217);
		BehaviorPort_Operation_assertP_p_return_message.setResult(BehaviorPort_Operation_assertP_p_return_message_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // BehaviorPort_OperationModel
