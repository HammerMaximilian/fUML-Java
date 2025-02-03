/*
 * Operation_ProvidedAndRequiredInterfaceModel.java
 * 
 * Auto-generated file
 */
package Operation_ProvidedAndRequiredInterface;

import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.classification.Generalization;
import uml.structuredclassifiers.Connector;
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
import uml.classification.Parameter;
import uml.classification.Operation;
import uml.activities.ActivityParameterNode;
import uml.commonstructure.PackageImport;
import uml.classification.AggregationKind;
import uml.activities.ControlFlow;
import uml.activities.ForkNode;
import uml.commonstructure.Usage;
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
import uml.commonbehavior.OpaqueBehavior;
import uml.activities.ObjectFlow;
import utils.library.FoundationalModelLibraryModel;
import utils.environment.InMemoryModel;
import uml.values.LiteralInteger;
import uml.packages.Package;
import uml.structuredclassifiers.Port;


/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class Operation_ProvidedAndRequiredInterfaceModel extends InMemoryModel
{
	private static Operation_ProvidedAndRequiredInterfaceModel instance;

	/*
	 * Model Operation_ProvidedAndRequiredInterface
	 */
	public Package Operation_ProvidedAndRequiredInterface = new Package();
		public Class_ Operation_ProvidedAndRequiredInterface_IImpl = new Class_();
			public Operation Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer = new Operation();
				public Parameter Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer_v = new Parameter();
			public InterfaceRealization Operation_ProvidedAndRequiredInterface_IImpl_IRealization = new InterfaceRealization();
		public Class_ Operation_ProvidedAndRequiredInterface_B = new Class_();
			public InterfaceRealization Operation_ProvidedAndRequiredInterface_B_IRealization = new InterfaceRealization();
			public Activity Operation_ProvidedAndRequiredInterface_B_setPActivity = new Activity();
				public ObjectFlow Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0 = new ObjectFlow();
					public LiteralBoolean Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0_LiteralBoolean1 = new LiteralBoolean();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0_LiteralInteger2 = new LiteralInteger();
				public Parameter Operation_ProvidedAndRequiredInterface_B_setPActivity_v = new Parameter();
				public ObjectFlow Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3 = new ObjectFlow();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3_LiteralInteger4 = new LiteralInteger();
					public LiteralBoolean Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3_LiteralBoolean5 = new LiteralBoolean();
				public ActivityParameterNode Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode_LiteralInteger6 = new LiteralInteger();
				public AddStructuralFeatureValueAction Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural7 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value_LiteralInteger8 = new LiteralInteger();
					public InputPin Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object_LiteralInteger9 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10 = new LiteralUnlimitedNatural();
					public OutputPin Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural11 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result_LiteralInteger12 = new LiteralInteger();
				public ReadSelfAction Operation_ProvidedAndRequiredInterface_B_setPActivity_this = new ReadSelfAction();
					public OutputPin Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result_LiteralUnlimitedNatural13 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result_LiteralInteger14 = new LiteralInteger();
			public Operation Operation_ProvidedAndRequiredInterface_B_setP_Integer = new Operation();
				public Parameter Operation_ProvidedAndRequiredInterface_B_setP_Integer_v = new Parameter();
			public Property Operation_ProvidedAndRequiredInterface_B_p = new Property();
		public Class_ Operation_ProvidedAndRequiredInterface_IProvReq = new Class_();
			public Generalization Operation_ProvidedAndRequiredInterface_IProvReq_Generalization15 = new Generalization();
			public Operation Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer = new Operation();
				public Parameter Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer_v = new Parameter();
		public Association Operation_ProvidedAndRequiredInterface_S = new Association();
			public Property Operation_ProvidedAndRequiredInterface_S_x = new Property();
			public Property Operation_ProvidedAndRequiredInterface_S_y = new Property();
		public Class_ Operation_ProvidedAndRequiredInterface_C = new Class_();
			public Port Operation_ProvidedAndRequiredInterface_C_q = new Port();
			public Operation Operation_ProvidedAndRequiredInterface_C_setP_Integer = new Operation();
				public Parameter Operation_ProvidedAndRequiredInterface_C_setP_Integer_v = new Parameter();
			public Activity Operation_ProvidedAndRequiredInterface_C_setPActivity = new Activity();
				public ObjectFlow Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16 = new ObjectFlow();
					public LiteralBoolean Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16_LiteralBoolean17 = new LiteralBoolean();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16_LiteralInteger18 = new LiteralInteger();
				public ReadSelfAction Operation_ProvidedAndRequiredInterface_C_setPActivity_this = new ReadSelfAction();
					public OutputPin Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result = new OutputPin();
						public LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result_LiteralInteger19 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result_LiteralUnlimitedNatural20 = new LiteralUnlimitedNatural();
				public Parameter Operation_ProvidedAndRequiredInterface_C_setPActivity_v = new Parameter();
				public CallOperationAction Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q = new CallOperationAction();
					public InputPin Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target = new InputPin();
						public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural21 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger22 = new LiteralInteger();
					public InputPin Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v = new InputPin();
						public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural23 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger24 = new LiteralInteger();
						public LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger25 = new LiteralInteger();
				public ObjectFlow Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26 = new ObjectFlow();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26_LiteralInteger27 = new LiteralInteger();
					public LiteralBoolean Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26_LiteralBoolean28 = new LiteralBoolean();
				public ActivityParameterNode Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode_LiteralInteger29 = new LiteralInteger();
			public InterfaceRealization Operation_ProvidedAndRequiredInterface_C_IRealization = new InterfaceRealization();
		public Comment Operation_ProvidedAndRequiredInterface_Comment30 = new Comment();
		public PackageImport Operation_ProvidedAndRequiredInterface_PackageImport31 = new PackageImport();
		public Comment Operation_ProvidedAndRequiredInterface_Comment32 = new Comment();
		public Class_ Operation_ProvidedAndRequiredInterface_D = new Class_();
			public Property Operation_ProvidedAndRequiredInterface_D_e = new Property();
			public Operation Operation_ProvidedAndRequiredInterface_D_D_D = new Operation();
				public Parameter Operation_ProvidedAndRequiredInterface_D_D_D_result = new Parameter();
			public Connector Operation_ProvidedAndRequiredInterface_D_s = new Connector();
				public ConnectorEnd Operation_ProvidedAndRequiredInterface_D_s_ConnectorEnd33 = new ConnectorEnd();
				public ConnectorEnd Operation_ProvidedAndRequiredInterface_D_s_ConnectorEnd34 = new ConnectorEnd();
			public Property Operation_ProvidedAndRequiredInterface_D_a = new Property();
		public Class_ Operation_ProvidedAndRequiredInterface_E = new Class_();
			public Property Operation_ProvidedAndRequiredInterface_E_c = new Property();
			public Port Operation_ProvidedAndRequiredInterface_E_q = new Port();
			public Connector Operation_ProvidedAndRequiredInterface_E_s = new Connector();
				public ConnectorEnd Operation_ProvidedAndRequiredInterface_E_s_ConnectorEnd35 = new ConnectorEnd();
				public ConnectorEnd Operation_ProvidedAndRequiredInterface_E_s_ConnectorEnd36 = new ConnectorEnd();
		public Class_ Operation_ProvidedAndRequiredInterface_A = new Class_();
			public Property Operation_ProvidedAndRequiredInterface_A_b = new Property();
			public Connector Operation_ProvidedAndRequiredInterface_A_r = new Connector();
				public ConnectorEnd Operation_ProvidedAndRequiredInterface_A_r_ConnectorEnd37 = new ConnectorEnd();
				public ConnectorEnd Operation_ProvidedAndRequiredInterface_A_r_ConnectorEnd38 = new ConnectorEnd();
			public Port Operation_ProvidedAndRequiredInterface_A_q = new Port();
			public Activity Operation_ProvidedAndRequiredInterface_A_setPActivity = new Activity();
				public ObjectFlow Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39 = new ObjectFlow();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39_LiteralInteger40 = new LiteralInteger();
					public LiteralBoolean Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39_LiteralBoolean41 = new LiteralBoolean();
				public ObjectFlow Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42 = new ObjectFlow();
					public LiteralBoolean Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42_LiteralBoolean43 = new LiteralBoolean();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42_LiteralInteger44 = new LiteralInteger();
				public ActivityParameterNode Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode_LiteralInteger45 = new LiteralInteger();
				public Parameter Operation_ProvidedAndRequiredInterface_A_setPActivity_v = new Parameter();
				public ReadSelfAction Operation_ProvidedAndRequiredInterface_A_setPActivity_this = new ReadSelfAction();
					public OutputPin Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result_LiteralInteger47 = new LiteralInteger();
				public CallOperationAction Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q = new CallOperationAction();
					public InputPin Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target = new InputPin();
						public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural48 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger49 = new LiteralInteger();
					public InputPin Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v = new InputPin();
						public LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger50 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural51 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger52 = new LiteralInteger();
			public Operation Operation_ProvidedAndRequiredInterface_A_setP_Integer = new Operation();
				public Parameter Operation_ProvidedAndRequiredInterface_A_setP_Integer_v = new Parameter();
		public Interface Operation_ProvidedAndRequiredInterface_I = new Interface();
			public Operation Operation_ProvidedAndRequiredInterface_I_setP_Integer = new Operation();
				public Parameter Operation_ProvidedAndRequiredInterface_I_setP_Integer_v = new Parameter();
		public Usage Operation_ProvidedAndRequiredInterface_IUsageIProvReq = new Usage();
		public Association Operation_ProvidedAndRequiredInterface_R = new Association();
			public Property Operation_ProvidedAndRequiredInterface_R_y = new Property();
			public Property Operation_ProvidedAndRequiredInterface_R_x = new Property();
		public Activity Operation_ProvidedAndRequiredInterface_main = new Activity();
			public ObjectFlow Operation_ProvidedAndRequiredInterface_main_ObjectFlow53 = new ObjectFlow();
				public LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow53_LiteralBoolean54 = new LiteralBoolean();
				public LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow53_LiteralInteger55 = new LiteralInteger();
			public ControlFlow Operation_ProvidedAndRequiredInterface_main_ControlFlow56 = new ControlFlow();
			public ObjectFlow Operation_ProvidedAndRequiredInterface_main_ObjectFlow57 = new ObjectFlow();
				public LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow57_LiteralInteger58 = new LiteralInteger();
				public LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow57_LiteralBoolean59 = new LiteralBoolean();
			public ObjectFlow Operation_ProvidedAndRequiredInterface_main_ObjectFlow60 = new ObjectFlow();
				public LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow60_LiteralInteger61 = new LiteralInteger();
				public LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow60_LiteralBoolean62 = new LiteralBoolean();
			public ForkNode Operation_ProvidedAndRequiredInterface_main_Fork_d = new ForkNode();
			public ObjectFlow Operation_ProvidedAndRequiredInterface_main_ObjectFlow63 = new ObjectFlow();
				public LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow63_LiteralBoolean64 = new LiteralBoolean();
				public LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow63_LiteralInteger65 = new LiteralInteger();
			public ReadStructuralFeatureAction Operation_ProvidedAndRequiredInterface_main_Read_d_e = new ReadStructuralFeatureAction();
				public InputPin Operation_ProvidedAndRequiredInterface_main_Read_d_e_object = new InputPin();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read_d_e_object_LiteralInteger66 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read_d_e_object_LiteralUnlimitedNatural67 = new LiteralUnlimitedNatural();
				public OutputPin Operation_ProvidedAndRequiredInterface_main_Read_d_e_result = new OutputPin();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read_d_e_result_LiteralInteger68 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read_d_e_result_LiteralUnlimitedNatural69 = new LiteralUnlimitedNatural();
			public ObjectFlow Operation_ProvidedAndRequiredInterface_main_ObjectFlow70 = new ObjectFlow();
				public LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow70_LiteralBoolean71 = new LiteralBoolean();
				public LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow70_LiteralInteger72 = new LiteralInteger();
			public OpaqueBehavior Operation_ProvidedAndRequiredInterface_main_testP = new OpaqueBehavior();
				public Parameter Operation_ProvidedAndRequiredInterface_main_testP_p = new Parameter();
			public CallOperationAction Operation_ProvidedAndRequiredInterface_main_D_ = new CallOperationAction();
				public InputPin Operation_ProvidedAndRequiredInterface_main_D__target = new InputPin();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_D__target_LiteralUnlimitedNatural73 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_D__target_LiteralInteger74 = new LiteralInteger();
				public OutputPin Operation_ProvidedAndRequiredInterface_main_D__result = new OutputPin();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_D__result_LiteralUnlimitedNatural75 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_D__result_LiteralInteger76 = new LiteralInteger();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_D__result_LiteralInteger77 = new LiteralInteger();
			public ObjectFlow Operation_ProvidedAndRequiredInterface_main_ObjectFlow78 = new ObjectFlow();
				public LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow78_LiteralInteger79 = new LiteralInteger();
				public LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow78_LiteralBoolean80 = new LiteralBoolean();
			public ReadStructuralFeatureAction Operation_ProvidedAndRequiredInterface_main_Read_e_c = new ReadStructuralFeatureAction();
				public InputPin Operation_ProvidedAndRequiredInterface_main_Read_e_c_object = new InputPin();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read_e_c_object_LiteralUnlimitedNatural81 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read_e_c_object_LiteralInteger82 = new LiteralInteger();
				public OutputPin Operation_ProvidedAndRequiredInterface_main_Read_e_c_result = new OutputPin();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read_e_c_result_LiteralInteger83 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read_e_c_result_LiteralUnlimitedNatural84 = new LiteralUnlimitedNatural();
			public CallOperationAction Operation_ProvidedAndRequiredInterface_main_Call_setP_ = new CallOperationAction();
				public InputPin Operation_ProvidedAndRequiredInterface_main_Call_setP__v = new InputPin();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralInteger85 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralUnlimitedNatural86 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralInteger87 = new LiteralInteger();
				public InputPin Operation_ProvidedAndRequiredInterface_main_Call_setP__target = new InputPin();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Call_setP__target_LiteralInteger88 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Call_setP__target_LiteralUnlimitedNatural89 = new LiteralUnlimitedNatural();
			public ObjectFlow Operation_ProvidedAndRequiredInterface_main_ObjectFlow90 = new ObjectFlow();
				public LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow90_LiteralBoolean91 = new LiteralBoolean();
				public LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow90_LiteralInteger92 = new LiteralInteger();
			public CreateObjectAction Operation_ProvidedAndRequiredInterface_main_Create_D = new CreateObjectAction();
				public OutputPin Operation_ProvidedAndRequiredInterface_main_Create_D_result = new OutputPin();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Create_D_result_LiteralInteger93 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Create_D_result_LiteralUnlimitedNatural94 = new LiteralUnlimitedNatural();
			public ObjectFlow Operation_ProvidedAndRequiredInterface_main_ObjectFlow95 = new ObjectFlow();
				public LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow95_LiteralBoolean96 = new LiteralBoolean();
				public LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow95_LiteralInteger97 = new LiteralInteger();
			public ValueSpecificationAction Operation_ProvidedAndRequiredInterface_main_Value_4 = new ValueSpecificationAction();
				public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Value_4_LiteralInteger98 = new LiteralInteger();
				public OutputPin Operation_ProvidedAndRequiredInterface_main_Value_4_result = new OutputPin();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Value_4_result_LiteralInteger99 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Value_4_result_LiteralUnlimitedNatural100 = new LiteralUnlimitedNatural();
			public ReadStructuralFeatureAction Operation_ProvidedAndRequiredInterface_main_Read_a_b = new ReadStructuralFeatureAction();
				public InputPin Operation_ProvidedAndRequiredInterface_main_Read_a_b_object = new InputPin();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read_a_b_object_LiteralInteger101 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read_a_b_object_LiteralUnlimitedNatural102 = new LiteralUnlimitedNatural();
				public OutputPin Operation_ProvidedAndRequiredInterface_main_Read_a_b_result = new OutputPin();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read_a_b_result_LiteralUnlimitedNatural103 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read_a_b_result_LiteralInteger104 = new LiteralInteger();
			public ReadStructuralFeatureAction Operation_ProvidedAndRequiredInterface_main_Read_b_p = new ReadStructuralFeatureAction();
				public OutputPin Operation_ProvidedAndRequiredInterface_main_Read_b_p_result = new OutputPin();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read_b_p_result_LiteralInteger105 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read_b_p_result_LiteralUnlimitedNatural106 = new LiteralUnlimitedNatural();
				public InputPin Operation_ProvidedAndRequiredInterface_main_Read_b_p_object = new InputPin();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read_b_p_object_LiteralInteger107 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read_b_p_object_LiteralUnlimitedNatural108 = new LiteralUnlimitedNatural();
			public CallBehaviorAction Operation_ProvidedAndRequiredInterface_main_Call_testP = new CallBehaviorAction();
				public InputPin Operation_ProvidedAndRequiredInterface_main_Call_testP_p = new InputPin();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralUnlimitedNatural109 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralInteger110 = new LiteralInteger();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralInteger111 = new LiteralInteger();
			public ReadStructuralFeatureAction Operation_ProvidedAndRequiredInterface_main_Read_d_a = new ReadStructuralFeatureAction();
				public InputPin Operation_ProvidedAndRequiredInterface_main_Read_d_a_object = new InputPin();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read_d_a_object_LiteralUnlimitedNatural112 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read_d_a_object_LiteralInteger113 = new LiteralInteger();
				public OutputPin Operation_ProvidedAndRequiredInterface_main_Read_d_a_result = new OutputPin();
					public LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read_d_a_result_LiteralUnlimitedNatural114 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read_d_a_result_LiteralInteger115 = new LiteralInteger();
			public ObjectFlow Operation_ProvidedAndRequiredInterface_main_ObjectFlow116 = new ObjectFlow();
				public LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow116_LiteralInteger117 = new LiteralInteger();
				public LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow116_LiteralBoolean118 = new LiteralBoolean();
			public ObjectFlow Operation_ProvidedAndRequiredInterface_main_ObjectFlow119 = new ObjectFlow();
				public LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow119_LiteralBoolean120 = new LiteralBoolean();
				public LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow119_LiteralInteger121 = new LiteralInteger();

	public static Operation_ProvidedAndRequiredInterfaceModel instance()
	{
		if (instance == null)
        {
            instance = new Operation_ProvidedAndRequiredInterfaceModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public Operation_ProvidedAndRequiredInterfaceModel()
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
		this.initializeActivity_Instances();
		this.initializeActivityParameterNode_Instances();
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
		this.initializeUsage_Instances();
		this.initializeValueSpecificationAction_Instances();
	}

	private void initializeActivity_Instances()
	{
		// Activity Operation_ProvidedAndRequiredInterface_C::setPActivity
		addToElementRepository("setPActivity", Operation_ProvidedAndRequiredInterface_C_setPActivity);
		Operation_ProvidedAndRequiredInterface_C_setPActivity.setName("setPActivity");
		Operation_ProvidedAndRequiredInterface_C_setPActivity.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_C_setPActivity.addOwnedParameter(Operation_ProvidedAndRequiredInterface_C_setPActivity_v);
		Operation_ProvidedAndRequiredInterface_C_setPActivity.addNode(Operation_ProvidedAndRequiredInterface_C_setPActivity_this);
		Operation_ProvidedAndRequiredInterface_C_setPActivity.addNode(Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q);
		Operation_ProvidedAndRequiredInterface_C_setPActivity.addNode(Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode);
		Operation_ProvidedAndRequiredInterface_C_setPActivity.addEdge(Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16);
		Operation_ProvidedAndRequiredInterface_C_setPActivity.addEdge(Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26);
		// Activity Operation_ProvidedAndRequiredInterface_B::setPActivity
		addToElementRepository("setPActivity", Operation_ProvidedAndRequiredInterface_B_setPActivity);
		Operation_ProvidedAndRequiredInterface_B_setPActivity.setName("setPActivity");
		Operation_ProvidedAndRequiredInterface_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_B_setPActivity.addOwnedParameter(Operation_ProvidedAndRequiredInterface_B_setPActivity_v);
		Operation_ProvidedAndRequiredInterface_B_setPActivity.addNode(Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode);
		Operation_ProvidedAndRequiredInterface_B_setPActivity.addNode(Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p);
		Operation_ProvidedAndRequiredInterface_B_setPActivity.addNode(Operation_ProvidedAndRequiredInterface_B_setPActivity_this);
		Operation_ProvidedAndRequiredInterface_B_setPActivity.addEdge(Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0);
		Operation_ProvidedAndRequiredInterface_B_setPActivity.addEdge(Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3);
		// Activity Operation_ProvidedAndRequiredInterface_A::setPActivity
		addToElementRepository("setPActivity", Operation_ProvidedAndRequiredInterface_A_setPActivity);
		Operation_ProvidedAndRequiredInterface_A_setPActivity.setName("setPActivity");
		Operation_ProvidedAndRequiredInterface_A_setPActivity.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_A_setPActivity.addOwnedParameter(Operation_ProvidedAndRequiredInterface_A_setPActivity_v);
		Operation_ProvidedAndRequiredInterface_A_setPActivity.addNode(Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode);
		Operation_ProvidedAndRequiredInterface_A_setPActivity.addNode(Operation_ProvidedAndRequiredInterface_A_setPActivity_this);
		Operation_ProvidedAndRequiredInterface_A_setPActivity.addNode(Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q);
		Operation_ProvidedAndRequiredInterface_A_setPActivity.addEdge(Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39);
		Operation_ProvidedAndRequiredInterface_A_setPActivity.addEdge(Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42);
		// Activity Operation_ProvidedAndRequiredInterface::main
		addToElementRepository("main", Operation_ProvidedAndRequiredInterface_main);
		Operation_ProvidedAndRequiredInterface_main.setName("main");
		Operation_ProvidedAndRequiredInterface_main.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main.addOwnedBehavior(Operation_ProvidedAndRequiredInterface_main_testP);
		Operation_ProvidedAndRequiredInterface_main.addNode(Operation_ProvidedAndRequiredInterface_main_D_);
		Operation_ProvidedAndRequiredInterface_main.addNode(Operation_ProvidedAndRequiredInterface_main_Read_e_c);
		Operation_ProvidedAndRequiredInterface_main.addNode(Operation_ProvidedAndRequiredInterface_main_Call_setP_);
		Operation_ProvidedAndRequiredInterface_main.addNode(Operation_ProvidedAndRequiredInterface_main_Create_D);
		Operation_ProvidedAndRequiredInterface_main.addNode(Operation_ProvidedAndRequiredInterface_main_Fork_d);
		Operation_ProvidedAndRequiredInterface_main.addNode(Operation_ProvidedAndRequiredInterface_main_Value_4);
		Operation_ProvidedAndRequiredInterface_main.addNode(Operation_ProvidedAndRequiredInterface_main_Read_a_b);
		Operation_ProvidedAndRequiredInterface_main.addNode(Operation_ProvidedAndRequiredInterface_main_Read_b_p);
		Operation_ProvidedAndRequiredInterface_main.addNode(Operation_ProvidedAndRequiredInterface_main_Call_testP);
		Operation_ProvidedAndRequiredInterface_main.addNode(Operation_ProvidedAndRequiredInterface_main_Read_d_e);
		Operation_ProvidedAndRequiredInterface_main.addNode(Operation_ProvidedAndRequiredInterface_main_Read_d_a);
		Operation_ProvidedAndRequiredInterface_main.addEdge(Operation_ProvidedAndRequiredInterface_main_ObjectFlow78);
		Operation_ProvidedAndRequiredInterface_main.addEdge(Operation_ProvidedAndRequiredInterface_main_ObjectFlow53);
		Operation_ProvidedAndRequiredInterface_main.addEdge(Operation_ProvidedAndRequiredInterface_main_ObjectFlow90);
		Operation_ProvidedAndRequiredInterface_main.addEdge(Operation_ProvidedAndRequiredInterface_main_ControlFlow56);
		Operation_ProvidedAndRequiredInterface_main.addEdge(Operation_ProvidedAndRequiredInterface_main_ObjectFlow57);
		Operation_ProvidedAndRequiredInterface_main.addEdge(Operation_ProvidedAndRequiredInterface_main_ObjectFlow60);
		Operation_ProvidedAndRequiredInterface_main.addEdge(Operation_ProvidedAndRequiredInterface_main_ObjectFlow95);
		Operation_ProvidedAndRequiredInterface_main.addEdge(Operation_ProvidedAndRequiredInterface_main_ObjectFlow63);
		Operation_ProvidedAndRequiredInterface_main.addEdge(Operation_ProvidedAndRequiredInterface_main_ObjectFlow116);
		Operation_ProvidedAndRequiredInterface_main.addEdge(Operation_ProvidedAndRequiredInterface_main_ObjectFlow119);
		Operation_ProvidedAndRequiredInterface_main.addEdge(Operation_ProvidedAndRequiredInterface_main_ObjectFlow70);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode Operation_ProvidedAndRequiredInterface_C_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode.setName("vParameterNode");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode.setParameter(Operation_ProvidedAndRequiredInterface_C_setPActivity_v);
		// ActivityParameterNode Operation_ProvidedAndRequiredInterface_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode.setName("vParameterNode");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode.setParameter(Operation_ProvidedAndRequiredInterface_B_setPActivity_v);
		// ActivityParameterNode Operation_ProvidedAndRequiredInterface_A_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode.setName("vParameterNode");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode.setParameter(Operation_ProvidedAndRequiredInterface_A_setPActivity_v);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction Operation_ProvidedAndRequiredInterface_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p.setName("Set this.p");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p.setStructuralFeature(Operation_ProvidedAndRequiredInterface_B_p);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p.setObject(Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p.setValue(Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p.setResult(Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p.setIsReplaceAll(true);
	}

	private void initializeAssociation_Instances()
	{
		// Association Operation_ProvidedAndRequiredInterface::S
		addToElementRepository("S", Operation_ProvidedAndRequiredInterface_S);
		Operation_ProvidedAndRequiredInterface_S.setName("S");
		Operation_ProvidedAndRequiredInterface_S.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_S.addOwnedEnd(Operation_ProvidedAndRequiredInterface_S_x);
		Operation_ProvidedAndRequiredInterface_S.addOwnedEnd(Operation_ProvidedAndRequiredInterface_S_y);
		// Association Operation_ProvidedAndRequiredInterface::R
		addToElementRepository("R", Operation_ProvidedAndRequiredInterface_R);
		Operation_ProvidedAndRequiredInterface_R.setName("R");
		Operation_ProvidedAndRequiredInterface_R.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_R.addOwnedEnd(Operation_ProvidedAndRequiredInterface_R_x);
		Operation_ProvidedAndRequiredInterface_R.addOwnedEnd(Operation_ProvidedAndRequiredInterface_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction Operation_ProvidedAndRequiredInterface_main::Call testP
		addToElementRepository("Call testP", Operation_ProvidedAndRequiredInterface_main_Call_testP);
		Operation_ProvidedAndRequiredInterface_main_Call_testP.setName("Call testP");
		Operation_ProvidedAndRequiredInterface_main_Call_testP.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_testP.setBehavior(Operation_ProvidedAndRequiredInterface_main_testP);
		Operation_ProvidedAndRequiredInterface_main_Call_testP.addArgument(Operation_ProvidedAndRequiredInterface_main_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction Operation_ProvidedAndRequiredInterface_main::D()
		addToElementRepository("D()", Operation_ProvidedAndRequiredInterface_main_D_);
		Operation_ProvidedAndRequiredInterface_main_D_.setName("D()");
		Operation_ProvidedAndRequiredInterface_main_D_.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_D_.addResult(Operation_ProvidedAndRequiredInterface_main_D__result);
		Operation_ProvidedAndRequiredInterface_main_D_.setOperation(Operation_ProvidedAndRequiredInterface_D_D_D);
		Operation_ProvidedAndRequiredInterface_main_D_.setTarget(Operation_ProvidedAndRequiredInterface_main_D__target);
		// CallOperationAction Operation_ProvidedAndRequiredInterface_main::Call setP()
		addToElementRepository("Call setP()", Operation_ProvidedAndRequiredInterface_main_Call_setP_);
		Operation_ProvidedAndRequiredInterface_main_Call_setP_.setName("Call setP()");
		Operation_ProvidedAndRequiredInterface_main_Call_setP_.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_setP_.setOperation(Operation_ProvidedAndRequiredInterface_C_setP_Integer);
		Operation_ProvidedAndRequiredInterface_main_Call_setP_.setTarget(Operation_ProvidedAndRequiredInterface_main_Call_setP__target);
		Operation_ProvidedAndRequiredInterface_main_Call_setP_.addArgument(Operation_ProvidedAndRequiredInterface_main_Call_setP__v);
		// CallOperationAction Operation_ProvidedAndRequiredInterface_C_setPActivity::Call I::setP on q
		addToElementRepository("Call I::setP on q", Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q.setName("Call I::setP on q");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q.setOnPort(Operation_ProvidedAndRequiredInterface_C_q);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q.setOperation(Operation_ProvidedAndRequiredInterface_I_setP_Integer);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q.setTarget(Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q.addArgument(Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v);
		// CallOperationAction Operation_ProvidedAndRequiredInterface_A_setPActivity::Call I::setP on q
		addToElementRepository("Call I::setP on q", Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q.setName("Call I::setP on q");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q.setOnPort(Operation_ProvidedAndRequiredInterface_A_q);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q.setOperation(Operation_ProvidedAndRequiredInterface_I_setP_Integer);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q.setTarget(Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q.addArgument(Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v);
	}

	private void initializeClass_Instances()
	{
		// Class Operation_ProvidedAndRequiredInterface::D
		addToElementRepository("D", Operation_ProvidedAndRequiredInterface_D);
		Operation_ProvidedAndRequiredInterface_D.setName("D");
		Operation_ProvidedAndRequiredInterface_D.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_D.addOwnedAttribute(Operation_ProvidedAndRequiredInterface_D_e);
		Operation_ProvidedAndRequiredInterface_D.addOwnedAttribute(Operation_ProvidedAndRequiredInterface_D_a);
		
		Operation_ProvidedAndRequiredInterface_D.addOwnedConnector(Operation_ProvidedAndRequiredInterface_D_s);
		Operation_ProvidedAndRequiredInterface_D.addOwnedOperation(Operation_ProvidedAndRequiredInterface_D_D_D);
		// Class Operation_ProvidedAndRequiredInterface::IImpl
		addToElementRepository("IImpl", Operation_ProvidedAndRequiredInterface_IImpl);
		Operation_ProvidedAndRequiredInterface_IImpl.setName("IImpl");
		Operation_ProvidedAndRequiredInterface_IImpl.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_IImpl.addInterfaceRealization(Operation_ProvidedAndRequiredInterface_IImpl_IRealization);
		
		Operation_ProvidedAndRequiredInterface_IImpl.addOwnedOperation(Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer);
		// Class Operation_ProvidedAndRequiredInterface::B
		addToElementRepository("B", Operation_ProvidedAndRequiredInterface_B);
		Operation_ProvidedAndRequiredInterface_B.setName("B");
		Operation_ProvidedAndRequiredInterface_B.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_B.addOwnedAttribute(Operation_ProvidedAndRequiredInterface_B_p);
		Operation_ProvidedAndRequiredInterface_B.addOwnedBehavior(Operation_ProvidedAndRequiredInterface_B_setPActivity);
		Operation_ProvidedAndRequiredInterface_B.addInterfaceRealization(Operation_ProvidedAndRequiredInterface_B_IRealization);
		
		Operation_ProvidedAndRequiredInterface_B.addOwnedOperation(Operation_ProvidedAndRequiredInterface_B_setP_Integer);
		// Class Operation_ProvidedAndRequiredInterface::IProvReq
		addToElementRepository("IProvReq", Operation_ProvidedAndRequiredInterface_IProvReq);
		Operation_ProvidedAndRequiredInterface_IProvReq.setName("IProvReq");
		Operation_ProvidedAndRequiredInterface_IProvReq.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_IProvReq.addGeneralization(Operation_ProvidedAndRequiredInterface_IProvReq_Generalization15);
		
		
		Operation_ProvidedAndRequiredInterface_IProvReq.addOwnedOperation(Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer);
		// Class Operation_ProvidedAndRequiredInterface::E
		addToElementRepository("E", Operation_ProvidedAndRequiredInterface_E);
		Operation_ProvidedAndRequiredInterface_E.setName("E");
		Operation_ProvidedAndRequiredInterface_E.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_E.addOwnedAttribute(Operation_ProvidedAndRequiredInterface_E_q);
		Operation_ProvidedAndRequiredInterface_E.addOwnedAttribute(Operation_ProvidedAndRequiredInterface_E_c);
		
		Operation_ProvidedAndRequiredInterface_E.addOwnedConnector(Operation_ProvidedAndRequiredInterface_E_s);
		// Class Operation_ProvidedAndRequiredInterface::A
		addToElementRepository("A", Operation_ProvidedAndRequiredInterface_A);
		Operation_ProvidedAndRequiredInterface_A.setName("A");
		Operation_ProvidedAndRequiredInterface_A.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_A.addOwnedAttribute(Operation_ProvidedAndRequiredInterface_A_q);
		Operation_ProvidedAndRequiredInterface_A.addOwnedAttribute(Operation_ProvidedAndRequiredInterface_A_b);
		Operation_ProvidedAndRequiredInterface_A.addOwnedBehavior(Operation_ProvidedAndRequiredInterface_A_setPActivity);
		Operation_ProvidedAndRequiredInterface_A.addOwnedConnector(Operation_ProvidedAndRequiredInterface_A_r);
		Operation_ProvidedAndRequiredInterface_A.addOwnedOperation(Operation_ProvidedAndRequiredInterface_A_setP_Integer);
		// Class Operation_ProvidedAndRequiredInterface::C
		addToElementRepository("C", Operation_ProvidedAndRequiredInterface_C);
		Operation_ProvidedAndRequiredInterface_C.setName("C");
		Operation_ProvidedAndRequiredInterface_C.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_C.addOwnedAttribute(Operation_ProvidedAndRequiredInterface_C_q);
		Operation_ProvidedAndRequiredInterface_C.addOwnedBehavior(Operation_ProvidedAndRequiredInterface_C_setPActivity);
		Operation_ProvidedAndRequiredInterface_C.addInterfaceRealization(Operation_ProvidedAndRequiredInterface_C_IRealization);
		
		Operation_ProvidedAndRequiredInterface_C.addOwnedOperation(Operation_ProvidedAndRequiredInterface_C_setP_Integer);
	}

	private void initializeComment_Instances()
	{
		// Comment Operation_ProvidedAndRequiredInterface::Comment30
		addToElementRepository("Comment30", Operation_ProvidedAndRequiredInterface_Comment30);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment Operation_ProvidedAndRequiredInterface::Comment32
		addToElementRepository("Comment32", Operation_ProvidedAndRequiredInterface_Comment32);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector Operation_ProvidedAndRequiredInterface_A::r
		addToElementRepository("r", Operation_ProvidedAndRequiredInterface_A_r);
		Operation_ProvidedAndRequiredInterface_A_r.setName("r");
		Operation_ProvidedAndRequiredInterface_A_r.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_r.addEnd(Operation_ProvidedAndRequiredInterface_A_r_ConnectorEnd37);
		Operation_ProvidedAndRequiredInterface_A_r.addEnd(Operation_ProvidedAndRequiredInterface_A_r_ConnectorEnd38);
		Operation_ProvidedAndRequiredInterface_A_r.setType(Operation_ProvidedAndRequiredInterface_R);
		// Connector Operation_ProvidedAndRequiredInterface_D::s
		addToElementRepository("s", Operation_ProvidedAndRequiredInterface_D_s);
		Operation_ProvidedAndRequiredInterface_D_s.setName("s");
		Operation_ProvidedAndRequiredInterface_D_s.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_D_s.addEnd(Operation_ProvidedAndRequiredInterface_D_s_ConnectorEnd33);
		Operation_ProvidedAndRequiredInterface_D_s.addEnd(Operation_ProvidedAndRequiredInterface_D_s_ConnectorEnd34);
		Operation_ProvidedAndRequiredInterface_D_s.setType(Operation_ProvidedAndRequiredInterface_S);
		// Connector Operation_ProvidedAndRequiredInterface_E::s
		addToElementRepository("s", Operation_ProvidedAndRequiredInterface_E_s);
		Operation_ProvidedAndRequiredInterface_E_s.setName("s");
		Operation_ProvidedAndRequiredInterface_E_s.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_E_s.addEnd(Operation_ProvidedAndRequiredInterface_E_s_ConnectorEnd35);
		Operation_ProvidedAndRequiredInterface_E_s.addEnd(Operation_ProvidedAndRequiredInterface_E_s_ConnectorEnd36);
		Operation_ProvidedAndRequiredInterface_E_s.setType(Operation_ProvidedAndRequiredInterface_S);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd Operation_ProvidedAndRequiredInterface_D_s::ConnectorEnd33
		addToElementRepository("ConnectorEnd33", Operation_ProvidedAndRequiredInterface_D_s_ConnectorEnd33);
		Operation_ProvidedAndRequiredInterface_D_s_ConnectorEnd33.setRole(Operation_ProvidedAndRequiredInterface_E_q);
		Operation_ProvidedAndRequiredInterface_D_s_ConnectorEnd33.setPartWithPort(Operation_ProvidedAndRequiredInterface_D_e);
		// ConnectorEnd Operation_ProvidedAndRequiredInterface_A_r::ConnectorEnd37
		addToElementRepository("ConnectorEnd37", Operation_ProvidedAndRequiredInterface_A_r_ConnectorEnd37);
		Operation_ProvidedAndRequiredInterface_A_r_ConnectorEnd37.setRole(Operation_ProvidedAndRequiredInterface_A_q);
		// ConnectorEnd Operation_ProvidedAndRequiredInterface_D_s::ConnectorEnd34
		addToElementRepository("ConnectorEnd34", Operation_ProvidedAndRequiredInterface_D_s_ConnectorEnd34);
		Operation_ProvidedAndRequiredInterface_D_s_ConnectorEnd34.setRole(Operation_ProvidedAndRequiredInterface_A_q);
		Operation_ProvidedAndRequiredInterface_D_s_ConnectorEnd34.setPartWithPort(Operation_ProvidedAndRequiredInterface_D_a);
		// ConnectorEnd Operation_ProvidedAndRequiredInterface_A_r::ConnectorEnd38
		addToElementRepository("ConnectorEnd38", Operation_ProvidedAndRequiredInterface_A_r_ConnectorEnd38);
		Operation_ProvidedAndRequiredInterface_A_r_ConnectorEnd38.setRole(Operation_ProvidedAndRequiredInterface_A_b);
		// ConnectorEnd Operation_ProvidedAndRequiredInterface_E_s::ConnectorEnd35
		addToElementRepository("ConnectorEnd35", Operation_ProvidedAndRequiredInterface_E_s_ConnectorEnd35);
		Operation_ProvidedAndRequiredInterface_E_s_ConnectorEnd35.setRole(Operation_ProvidedAndRequiredInterface_C_q);
		Operation_ProvidedAndRequiredInterface_E_s_ConnectorEnd35.setPartWithPort(Operation_ProvidedAndRequiredInterface_E_c);
		// ConnectorEnd Operation_ProvidedAndRequiredInterface_E_s::ConnectorEnd36
		addToElementRepository("ConnectorEnd36", Operation_ProvidedAndRequiredInterface_E_s_ConnectorEnd36);
		Operation_ProvidedAndRequiredInterface_E_s_ConnectorEnd36.setRole(Operation_ProvidedAndRequiredInterface_E_q);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow Operation_ProvidedAndRequiredInterface_main::ControlFlow56
		addToElementRepository("ControlFlow56", Operation_ProvidedAndRequiredInterface_main_ControlFlow56);
		Operation_ProvidedAndRequiredInterface_main_ControlFlow56.setName("ControlFlow56");
		Operation_ProvidedAndRequiredInterface_main_ControlFlow56.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_ControlFlow56.setSource(Operation_ProvidedAndRequiredInterface_main_Call_setP_);
		Operation_ProvidedAndRequiredInterface_main_ControlFlow56.setTarget(Operation_ProvidedAndRequiredInterface_main_Read_d_a);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction Operation_ProvidedAndRequiredInterface_main::Create D
		addToElementRepository("Create D", Operation_ProvidedAndRequiredInterface_main_Create_D);
		Operation_ProvidedAndRequiredInterface_main_Create_D.setName("Create D");
		Operation_ProvidedAndRequiredInterface_main_Create_D.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Create_D.setClassifier(Operation_ProvidedAndRequiredInterface_D);
		Operation_ProvidedAndRequiredInterface_main_Create_D.setResult(Operation_ProvidedAndRequiredInterface_main_Create_D_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode Operation_ProvidedAndRequiredInterface_main::Fork d
		addToElementRepository("Fork d", Operation_ProvidedAndRequiredInterface_main_Fork_d);
		Operation_ProvidedAndRequiredInterface_main_Fork_d.setName("Fork d");
		Operation_ProvidedAndRequiredInterface_main_Fork_d.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior Operation_ProvidedAndRequiredInterface_main::testP
		addToElementRepository("testP", Operation_ProvidedAndRequiredInterface_main_testP);
		Operation_ProvidedAndRequiredInterface_main_testP.setName("testP");
		Operation_ProvidedAndRequiredInterface_main_testP.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_testP.addOwnedParameter(Operation_ProvidedAndRequiredInterface_main_testP_p);
		Operation_ProvidedAndRequiredInterface_main_testP.addLanguage("Java");
		Operation_ProvidedAndRequiredInterface_main_testP.addLanguage("Import");
		Operation_ProvidedAndRequiredInterface_main_testP.addBody("System.out.println(\"Asserting d.a.b.p == 4\");  	// Test parameter p 	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument p = \" + p); 	 	System.out.println(\"d.a.b.p == \" + p); 	System.out.print(\"Invocation forwarded out of e through q: \");  	if(p == 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		Operation_ProvidedAndRequiredInterface_main_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeGeneralization_Instances()
	{
		// Generalization Operation_ProvidedAndRequiredInterface_IProvReq::Generalization15
		addToElementRepository("Generalization15", Operation_ProvidedAndRequiredInterface_IProvReq_Generalization15);
		Operation_ProvidedAndRequiredInterface_IProvReq_Generalization15.setGeneral(Operation_ProvidedAndRequiredInterface_IImpl);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin Operation_ProvidedAndRequiredInterface_main_Read d.e::object
		addToElementRepository("object", Operation_ProvidedAndRequiredInterface_main_Read_d_e_object);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_object.setName("object");
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_object.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_object.setType(Operation_ProvidedAndRequiredInterface_D);
		// InputPin Operation_ProvidedAndRequiredInterface_A_setPActivity_Call I::setP on q::v
		addToElementRepository("v", Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v.setName("v");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_ProvidedAndRequiredInterface_main_Read d.a::object
		addToElementRepository("object", Operation_ProvidedAndRequiredInterface_main_Read_d_a_object);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_object.setName("object");
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_object.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_object.setType(Operation_ProvidedAndRequiredInterface_D);
		// InputPin Operation_ProvidedAndRequiredInterface_main_Call setP()::target
		addToElementRepository("target", Operation_ProvidedAndRequiredInterface_main_Call_setP__target);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__target.setName("target");
		Operation_ProvidedAndRequiredInterface_main_Call_setP__target.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__target.setType(Operation_ProvidedAndRequiredInterface_C);
		// InputPin Operation_ProvidedAndRequiredInterface_C_setPActivity_Call I::setP on q::target
		addToElementRepository("target", Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target.setName("target");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target.setType(Operation_ProvidedAndRequiredInterface_C);
		// InputPin Operation_ProvidedAndRequiredInterface_B_setPActivity_Set this.p::value
		addToElementRepository("value", Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value.setName("value");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_ProvidedAndRequiredInterface_main_D()::target
		addToElementRepository("target", Operation_ProvidedAndRequiredInterface_main_D__target);
		Operation_ProvidedAndRequiredInterface_main_D__target.setName("target");
		Operation_ProvidedAndRequiredInterface_main_D__target.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_D__target.setType(Operation_ProvidedAndRequiredInterface_D);
		// InputPin Operation_ProvidedAndRequiredInterface_A_setPActivity_Call I::setP on q::target
		addToElementRepository("target", Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target.setName("target");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target.setVisibility(VisibilityKind.public_);
		// InputPin Operation_ProvidedAndRequiredInterface_main_Read a.b::object
		addToElementRepository("object", Operation_ProvidedAndRequiredInterface_main_Read_a_b_object);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_object.setName("object");
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_object.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_object.setType(Operation_ProvidedAndRequiredInterface_A);
		// InputPin Operation_ProvidedAndRequiredInterface_B_setPActivity_Set this.p::object
		addToElementRepository("object", Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object.setName("object");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object.setType(Operation_ProvidedAndRequiredInterface_B);
		// InputPin Operation_ProvidedAndRequiredInterface_main_Call setP()::v
		addToElementRepository("v", Operation_ProvidedAndRequiredInterface_main_Call_setP__v);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__v.setName("v");
		Operation_ProvidedAndRequiredInterface_main_Call_setP__v.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_ProvidedAndRequiredInterface_main_Call testP::p
		addToElementRepository("p", Operation_ProvidedAndRequiredInterface_main_Call_testP_p);
		Operation_ProvidedAndRequiredInterface_main_Call_testP_p.setName("p");
		Operation_ProvidedAndRequiredInterface_main_Call_testP_p.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_ProvidedAndRequiredInterface_C_setPActivity_Call I::setP on q::v
		addToElementRepository("v", Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v.setName("v");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_ProvidedAndRequiredInterface_main_Read e.c::object
		addToElementRepository("object", Operation_ProvidedAndRequiredInterface_main_Read_e_c_object);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_object.setName("object");
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_object.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_object.setType(Operation_ProvidedAndRequiredInterface_E);
		// InputPin Operation_ProvidedAndRequiredInterface_main_Read b.p::object
		addToElementRepository("object", Operation_ProvidedAndRequiredInterface_main_Read_b_p_object);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_object.setName("object");
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_object.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_object.setType(Operation_ProvidedAndRequiredInterface_B);
	}

	private void initializeInterface_Instances()
	{
		// Interface Operation_ProvidedAndRequiredInterface::I
		addToElementRepository("I", Operation_ProvidedAndRequiredInterface_I);
		Operation_ProvidedAndRequiredInterface_I.setName("I");
		Operation_ProvidedAndRequiredInterface_I.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_I.addOwnedOperation(Operation_ProvidedAndRequiredInterface_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization Operation_ProvidedAndRequiredInterface_B::IRealization
		addToElementRepository("IRealization", Operation_ProvidedAndRequiredInterface_B_IRealization);
		Operation_ProvidedAndRequiredInterface_B_IRealization.setName("IRealization");
		Operation_ProvidedAndRequiredInterface_B_IRealization.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_IRealization.setContract(Operation_ProvidedAndRequiredInterface_I);
		// InterfaceRealization Operation_ProvidedAndRequiredInterface_C::IRealization
		addToElementRepository("IRealization", Operation_ProvidedAndRequiredInterface_C_IRealization);
		Operation_ProvidedAndRequiredInterface_C_IRealization.setName("IRealization");
		Operation_ProvidedAndRequiredInterface_C_IRealization.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_IRealization.setContract(Operation_ProvidedAndRequiredInterface_I);
		// InterfaceRealization Operation_ProvidedAndRequiredInterface_IImpl::IRealization
		addToElementRepository("IRealization", Operation_ProvidedAndRequiredInterface_IImpl_IRealization);
		Operation_ProvidedAndRequiredInterface_IImpl_IRealization.setName("IRealization");
		Operation_ProvidedAndRequiredInterface_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_IImpl_IRealization.setContract(Operation_ProvidedAndRequiredInterface_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow119::LiteralBoolean120
		addToElementRepository("LiteralBoolean120", Operation_ProvidedAndRequiredInterface_main_ObjectFlow119_LiteralBoolean120);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow119_LiteralBoolean120.setName("LiteralBoolean120");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow119_LiteralBoolean120.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow119_LiteralBoolean120.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42::LiteralBoolean43
		addToElementRepository("LiteralBoolean43", Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42_LiteralBoolean43);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42_LiteralBoolean43.setName("LiteralBoolean43");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42_LiteralBoolean43.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42_LiteralBoolean43.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow95::LiteralBoolean96
		addToElementRepository("LiteralBoolean96", Operation_ProvidedAndRequiredInterface_main_ObjectFlow95_LiteralBoolean96);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow95_LiteralBoolean96.setName("LiteralBoolean96");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow95_LiteralBoolean96.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow95_LiteralBoolean96.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26::LiteralBoolean28
		addToElementRepository("LiteralBoolean28", Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26_LiteralBoolean28);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26_LiteralBoolean28.setName("LiteralBoolean28");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26_LiteralBoolean28.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26_LiteralBoolean28.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39::LiteralBoolean41
		addToElementRepository("LiteralBoolean41", Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39_LiteralBoolean41);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39_LiteralBoolean41.setName("LiteralBoolean41");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39_LiteralBoolean41.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39_LiteralBoolean41.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow116::LiteralBoolean118
		addToElementRepository("LiteralBoolean118", Operation_ProvidedAndRequiredInterface_main_ObjectFlow116_LiteralBoolean118);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow116_LiteralBoolean118.setName("LiteralBoolean118");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow116_LiteralBoolean118.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow116_LiteralBoolean118.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow57::LiteralBoolean59
		addToElementRepository("LiteralBoolean59", Operation_ProvidedAndRequiredInterface_main_ObjectFlow57_LiteralBoolean59);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow57_LiteralBoolean59.setName("LiteralBoolean59");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow57_LiteralBoolean59.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow57_LiteralBoolean59.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow60::LiteralBoolean62
		addToElementRepository("LiteralBoolean62", Operation_ProvidedAndRequiredInterface_main_ObjectFlow60_LiteralBoolean62);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow60_LiteralBoolean62.setName("LiteralBoolean62");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow60_LiteralBoolean62.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow60_LiteralBoolean62.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow78::LiteralBoolean80
		addToElementRepository("LiteralBoolean80", Operation_ProvidedAndRequiredInterface_main_ObjectFlow78_LiteralBoolean80);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow78_LiteralBoolean80.setName("LiteralBoolean80");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow78_LiteralBoolean80.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow78_LiteralBoolean80.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0::LiteralBoolean1
		addToElementRepository("LiteralBoolean1", Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0_LiteralBoolean1);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0_LiteralBoolean1.setName("LiteralBoolean1");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0_LiteralBoolean1.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0_LiteralBoolean1.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow53::LiteralBoolean54
		addToElementRepository("LiteralBoolean54", Operation_ProvidedAndRequiredInterface_main_ObjectFlow53_LiteralBoolean54);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow53_LiteralBoolean54.setName("LiteralBoolean54");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow53_LiteralBoolean54.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow53_LiteralBoolean54.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow63::LiteralBoolean64
		addToElementRepository("LiteralBoolean64", Operation_ProvidedAndRequiredInterface_main_ObjectFlow63_LiteralBoolean64);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow63_LiteralBoolean64.setName("LiteralBoolean64");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow63_LiteralBoolean64.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow63_LiteralBoolean64.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow70::LiteralBoolean71
		addToElementRepository("LiteralBoolean71", Operation_ProvidedAndRequiredInterface_main_ObjectFlow70_LiteralBoolean71);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow70_LiteralBoolean71.setName("LiteralBoolean71");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow70_LiteralBoolean71.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow70_LiteralBoolean71.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3::LiteralBoolean5
		addToElementRepository("LiteralBoolean5", Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3_LiteralBoolean5);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3_LiteralBoolean5.setName("LiteralBoolean5");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3_LiteralBoolean5.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3_LiteralBoolean5.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_main_ObjectFlow90::LiteralBoolean91
		addToElementRepository("LiteralBoolean91", Operation_ProvidedAndRequiredInterface_main_ObjectFlow90_LiteralBoolean91);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow90_LiteralBoolean91.setName("LiteralBoolean91");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow90_LiteralBoolean91.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow90_LiteralBoolean91.setValue(true);
		// LiteralBoolean Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16::LiteralBoolean17
		addToElementRepository("LiteralBoolean17", Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16_LiteralBoolean17);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16_LiteralBoolean17.setName("LiteralBoolean17");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16_LiteralBoolean17.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16_LiteralBoolean17.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_Set this.p_object::LiteralInteger9
		addToElementRepository("LiteralInteger9", Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object_LiteralInteger9);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object_LiteralInteger9.setName("LiteralInteger9");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object_LiteralInteger9.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object_LiteralInteger9.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow119::LiteralInteger121
		addToElementRepository("LiteralInteger121", Operation_ProvidedAndRequiredInterface_main_ObjectFlow119_LiteralInteger121);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow119_LiteralInteger121.setName("LiteralInteger121");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow119_LiteralInteger121.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow119_LiteralInteger121.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read a.b_object::LiteralInteger101
		addToElementRepository("LiteralInteger101", Operation_ProvidedAndRequiredInterface_main_Read_a_b_object_LiteralInteger101);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_object_LiteralInteger101.setName("LiteralInteger101");
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_object_LiteralInteger101.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_object_LiteralInteger101.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read d.a_object::LiteralInteger113
		addToElementRepository("LiteralInteger113", Operation_ProvidedAndRequiredInterface_main_Read_d_a_object_LiteralInteger113);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_object_LiteralInteger113.setName("LiteralInteger113");
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_object_LiteralInteger113.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_object_LiteralInteger113.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode::LiteralInteger29
		addToElementRepository("LiteralInteger29", Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode_LiteralInteger29);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode_LiteralInteger29.setName("LiteralInteger29");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode_LiteralInteger29.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode_LiteralInteger29.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0::LiteralInteger2
		addToElementRepository("LiteralInteger2", Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0_LiteralInteger2);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0_LiteralInteger2.setName("LiteralInteger2");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0_LiteralInteger2.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0_LiteralInteger2.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result::LiteralInteger14
		addToElementRepository("LiteralInteger14", Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result_LiteralInteger14);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result_LiteralInteger14.setName("LiteralInteger14");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result_LiteralInteger14.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result_LiteralInteger14.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Call testP_p::LiteralInteger110
		addToElementRepository("LiteralInteger110", Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralInteger110);
		Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralInteger110.setName("LiteralInteger110");
		Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralInteger110.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralInteger110.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Value(4)::LiteralInteger98
		addToElementRepository("LiteralInteger98", Operation_ProvidedAndRequiredInterface_main_Value_4_LiteralInteger98);
		Operation_ProvidedAndRequiredInterface_main_Value_4_LiteralInteger98.setName("LiteralInteger98");
		Operation_ProvidedAndRequiredInterface_main_Value_4_LiteralInteger98.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Value_4_LiteralInteger98.setValue(4);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_Call I::setP on q_v::LiteralInteger50
		addToElementRepository("LiteralInteger50", Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger50);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger50.setName("LiteralInteger50");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger50.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger50.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Call setP()_v::LiteralInteger85
		addToElementRepository("LiteralInteger85", Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralInteger85);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralInteger85.setName("LiteralInteger85");
		Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralInteger85.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralInteger85.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read d.a_result::LiteralInteger115
		addToElementRepository("LiteralInteger115", Operation_ProvidedAndRequiredInterface_main_Read_d_a_result_LiteralInteger115);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_result_LiteralInteger115.setName("LiteralInteger115");
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_result_LiteralInteger115.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_result_LiteralInteger115.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow78::LiteralInteger79
		addToElementRepository("LiteralInteger79", Operation_ProvidedAndRequiredInterface_main_ObjectFlow78_LiteralInteger79);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow78_LiteralInteger79.setName("LiteralInteger79");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow78_LiteralInteger79.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow78_LiteralInteger79.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42::LiteralInteger44
		addToElementRepository("LiteralInteger44", Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42_LiteralInteger44);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42_LiteralInteger44.setName("LiteralInteger44");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42_LiteralInteger44.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42_LiteralInteger44.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_Call I::setP on q_target::LiteralInteger49
		addToElementRepository("LiteralInteger49", Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger49);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger49.setName("LiteralInteger49");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger49.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger49.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_Call I::setP on q_v::LiteralInteger52
		addToElementRepository("LiteralInteger52", Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger52);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger52.setName("LiteralInteger52");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger52.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger52.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Create D_result::LiteralInteger93
		addToElementRepository("LiteralInteger93", Operation_ProvidedAndRequiredInterface_main_Create_D_result_LiteralInteger93);
		Operation_ProvidedAndRequiredInterface_main_Create_D_result_LiteralInteger93.setName("LiteralInteger93");
		Operation_ProvidedAndRequiredInterface_main_Create_D_result_LiteralInteger93.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Create_D_result_LiteralInteger93.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Call setP()_target::LiteralInteger88
		addToElementRepository("LiteralInteger88", Operation_ProvidedAndRequiredInterface_main_Call_setP__target_LiteralInteger88);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__target_LiteralInteger88.setName("LiteralInteger88");
		Operation_ProvidedAndRequiredInterface_main_Call_setP__target_LiteralInteger88.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__target_LiteralInteger88.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read d.e_object::LiteralInteger66
		addToElementRepository("LiteralInteger66", Operation_ProvidedAndRequiredInterface_main_Read_d_e_object_LiteralInteger66);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_object_LiteralInteger66.setName("LiteralInteger66");
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_object_LiteralInteger66.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_object_LiteralInteger66.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow95::LiteralInteger97
		addToElementRepository("LiteralInteger97", Operation_ProvidedAndRequiredInterface_main_ObjectFlow95_LiteralInteger97);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow95_LiteralInteger97.setName("LiteralInteger97");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow95_LiteralInteger97.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow95_LiteralInteger97.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_Call I::setP on q_v::LiteralInteger24
		addToElementRepository("LiteralInteger24", Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger24);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger24.setName("LiteralInteger24");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger24.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger24.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read b.p_result::LiteralInteger105
		addToElementRepository("LiteralInteger105", Operation_ProvidedAndRequiredInterface_main_Read_b_p_result_LiteralInteger105);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_result_LiteralInteger105.setName("LiteralInteger105");
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_result_LiteralInteger105.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_result_LiteralInteger105.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39::LiteralInteger40
		addToElementRepository("LiteralInteger40", Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39_LiteralInteger40);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39_LiteralInteger40.setName("LiteralInteger40");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39_LiteralInteger40.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39_LiteralInteger40.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow116::LiteralInteger117
		addToElementRepository("LiteralInteger117", Operation_ProvidedAndRequiredInterface_main_ObjectFlow116_LiteralInteger117);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow116_LiteralInteger117.setName("LiteralInteger117");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow116_LiteralInteger117.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow116_LiteralInteger117.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_D()_target::LiteralInteger74
		addToElementRepository("LiteralInteger74", Operation_ProvidedAndRequiredInterface_main_D__target_LiteralInteger74);
		Operation_ProvidedAndRequiredInterface_main_D__target_LiteralInteger74.setName("LiteralInteger74");
		Operation_ProvidedAndRequiredInterface_main_D__target_LiteralInteger74.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_D__target_LiteralInteger74.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3::LiteralInteger4
		addToElementRepository("LiteralInteger4", Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3_LiteralInteger4);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3_LiteralInteger4.setName("LiteralInteger4");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3_LiteralInteger4.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3_LiteralInteger4.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Call testP_p::LiteralInteger111
		addToElementRepository("LiteralInteger111", Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralInteger111);
		Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralInteger111.setName("LiteralInteger111");
		Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralInteger111.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralInteger111.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Call setP()_v::LiteralInteger87
		addToElementRepository("LiteralInteger87", Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralInteger87);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralInteger87.setName("LiteralInteger87");
		Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralInteger87.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralInteger87.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode::LiteralInteger6
		addToElementRepository("LiteralInteger6", Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode_LiteralInteger6);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode_LiteralInteger6.setName("LiteralInteger6");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode_LiteralInteger6.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode_LiteralInteger6.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_D()_result::LiteralInteger76
		addToElementRepository("LiteralInteger76", Operation_ProvidedAndRequiredInterface_main_D__result_LiteralInteger76);
		Operation_ProvidedAndRequiredInterface_main_D__result_LiteralInteger76.setName("LiteralInteger76");
		Operation_ProvidedAndRequiredInterface_main_D__result_LiteralInteger76.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_D__result_LiteralInteger76.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result::LiteralInteger19
		addToElementRepository("LiteralInteger19", Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result_LiteralInteger19);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result_LiteralInteger19.setName("LiteralInteger19");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result_LiteralInteger19.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result_LiteralInteger19.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read e.c_object::LiteralInteger82
		addToElementRepository("LiteralInteger82", Operation_ProvidedAndRequiredInterface_main_Read_e_c_object_LiteralInteger82);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_object_LiteralInteger82.setName("LiteralInteger82");
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_object_LiteralInteger82.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_object_LiteralInteger82.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_D()_result::LiteralInteger77
		addToElementRepository("LiteralInteger77", Operation_ProvidedAndRequiredInterface_main_D__result_LiteralInteger77);
		Operation_ProvidedAndRequiredInterface_main_D__result_LiteralInteger77.setName("LiteralInteger77");
		Operation_ProvidedAndRequiredInterface_main_D__result_LiteralInteger77.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_D__result_LiteralInteger77.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result::LiteralInteger47
		addToElementRepository("LiteralInteger47", Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result_LiteralInteger47);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result_LiteralInteger47.setName("LiteralInteger47");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result_LiteralInteger47.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result_LiteralInteger47.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read b.p_object::LiteralInteger107
		addToElementRepository("LiteralInteger107", Operation_ProvidedAndRequiredInterface_main_Read_b_p_object_LiteralInteger107);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_object_LiteralInteger107.setName("LiteralInteger107");
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_object_LiteralInteger107.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_object_LiteralInteger107.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode::LiteralInteger45
		addToElementRepository("LiteralInteger45", Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode_LiteralInteger45);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode_LiteralInteger45.setName("LiteralInteger45");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode_LiteralInteger45.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode_LiteralInteger45.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read a.b_result::LiteralInteger104
		addToElementRepository("LiteralInteger104", Operation_ProvidedAndRequiredInterface_main_Read_a_b_result_LiteralInteger104);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_result_LiteralInteger104.setName("LiteralInteger104");
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_result_LiteralInteger104.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_result_LiteralInteger104.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read d.e_result::LiteralInteger68
		addToElementRepository("LiteralInteger68", Operation_ProvidedAndRequiredInterface_main_Read_d_e_result_LiteralInteger68);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_result_LiteralInteger68.setName("LiteralInteger68");
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_result_LiteralInteger68.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_result_LiteralInteger68.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16::LiteralInteger18
		addToElementRepository("LiteralInteger18", Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16_LiteralInteger18);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16_LiteralInteger18.setName("LiteralInteger18");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16_LiteralInteger18.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16_LiteralInteger18.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_Call I::setP on q_target::LiteralInteger22
		addToElementRepository("LiteralInteger22", Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger22);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger22.setName("LiteralInteger22");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger22.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger22.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26::LiteralInteger27
		addToElementRepository("LiteralInteger27", Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26_LiteralInteger27);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26_LiteralInteger27.setName("LiteralInteger27");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26_LiteralInteger27.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26_LiteralInteger27.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Read e.c_result::LiteralInteger83
		addToElementRepository("LiteralInteger83", Operation_ProvidedAndRequiredInterface_main_Read_e_c_result_LiteralInteger83);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_result_LiteralInteger83.setName("LiteralInteger83");
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_result_LiteralInteger83.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_result_LiteralInteger83.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_Value(4)_result::LiteralInteger99
		addToElementRepository("LiteralInteger99", Operation_ProvidedAndRequiredInterface_main_Value_4_result_LiteralInteger99);
		Operation_ProvidedAndRequiredInterface_main_Value_4_result_LiteralInteger99.setName("LiteralInteger99");
		Operation_ProvidedAndRequiredInterface_main_Value_4_result_LiteralInteger99.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Value_4_result_LiteralInteger99.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow57::LiteralInteger58
		addToElementRepository("LiteralInteger58", Operation_ProvidedAndRequiredInterface_main_ObjectFlow57_LiteralInteger58);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow57_LiteralInteger58.setName("LiteralInteger58");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow57_LiteralInteger58.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow57_LiteralInteger58.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow63::LiteralInteger65
		addToElementRepository("LiteralInteger65", Operation_ProvidedAndRequiredInterface_main_ObjectFlow63_LiteralInteger65);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow63_LiteralInteger65.setName("LiteralInteger65");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow63_LiteralInteger65.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow63_LiteralInteger65.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_Set this.p_result::LiteralInteger12
		addToElementRepository("LiteralInteger12", Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result_LiteralInteger12);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result_LiteralInteger12.setName("LiteralInteger12");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result_LiteralInteger12.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result_LiteralInteger12.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow60::LiteralInteger61
		addToElementRepository("LiteralInteger61", Operation_ProvidedAndRequiredInterface_main_ObjectFlow60_LiteralInteger61);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow60_LiteralInteger61.setName("LiteralInteger61");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow60_LiteralInteger61.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow60_LiteralInteger61.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow53::LiteralInteger55
		addToElementRepository("LiteralInteger55", Operation_ProvidedAndRequiredInterface_main_ObjectFlow53_LiteralInteger55);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow53_LiteralInteger55.setName("LiteralInteger55");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow53_LiteralInteger55.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow53_LiteralInteger55.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_B_setPActivity_Set this.p_value::LiteralInteger8
		addToElementRepository("LiteralInteger8", Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value_LiteralInteger8);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value_LiteralInteger8.setName("LiteralInteger8");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value_LiteralInteger8.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value_LiteralInteger8.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow90::LiteralInteger92
		addToElementRepository("LiteralInteger92", Operation_ProvidedAndRequiredInterface_main_ObjectFlow90_LiteralInteger92);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow90_LiteralInteger92.setName("LiteralInteger92");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow90_LiteralInteger92.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow90_LiteralInteger92.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_main_ObjectFlow70::LiteralInteger72
		addToElementRepository("LiteralInteger72", Operation_ProvidedAndRequiredInterface_main_ObjectFlow70_LiteralInteger72);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow70_LiteralInteger72.setName("LiteralInteger72");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow70_LiteralInteger72.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow70_LiteralInteger72.setValue(1);
		// LiteralInteger Operation_ProvidedAndRequiredInterface_C_setPActivity_Call I::setP on q_v::LiteralInteger25
		addToElementRepository("LiteralInteger25", Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger25);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger25.setName("LiteralInteger25");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger25.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger25.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Call testP_p::LiteralUnlimitedNatural109
		addToElementRepository("LiteralUnlimitedNatural109", Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralUnlimitedNatural109);
		Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralUnlimitedNatural109.setName("LiteralUnlimitedNatural109");
		Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralUnlimitedNatural109.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_testP_p_LiteralUnlimitedNatural109.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read a.b_result::LiteralUnlimitedNatural103
		addToElementRepository("LiteralUnlimitedNatural103", Operation_ProvidedAndRequiredInterface_main_Read_a_b_result_LiteralUnlimitedNatural103);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_result_LiteralUnlimitedNatural103.setName("LiteralUnlimitedNatural103");
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_result_LiteralUnlimitedNatural103.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_result_LiteralUnlimitedNatural103.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural11
		addToElementRepository("LiteralUnlimitedNatural11", Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural11);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural11.setName("LiteralUnlimitedNatural11");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural11.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural11.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Value(4)_result::LiteralUnlimitedNatural100
		addToElementRepository("LiteralUnlimitedNatural100", Operation_ProvidedAndRequiredInterface_main_Value_4_result_LiteralUnlimitedNatural100);
		Operation_ProvidedAndRequiredInterface_main_Value_4_result_LiteralUnlimitedNatural100.setName("LiteralUnlimitedNatural100");
		Operation_ProvidedAndRequiredInterface_main_Value_4_result_LiteralUnlimitedNatural100.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Value_4_result_LiteralUnlimitedNatural100.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Create D_result::LiteralUnlimitedNatural94
		addToElementRepository("LiteralUnlimitedNatural94", Operation_ProvidedAndRequiredInterface_main_Create_D_result_LiteralUnlimitedNatural94);
		Operation_ProvidedAndRequiredInterface_main_Create_D_result_LiteralUnlimitedNatural94.setName("LiteralUnlimitedNatural94");
		Operation_ProvidedAndRequiredInterface_main_Create_D_result_LiteralUnlimitedNatural94.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Create_D_result_LiteralUnlimitedNatural94.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Call setP()_target::LiteralUnlimitedNatural89
		addToElementRepository("LiteralUnlimitedNatural89", Operation_ProvidedAndRequiredInterface_main_Call_setP__target_LiteralUnlimitedNatural89);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__target_LiteralUnlimitedNatural89.setName("LiteralUnlimitedNatural89");
		Operation_ProvidedAndRequiredInterface_main_Call_setP__target_LiteralUnlimitedNatural89.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__target_LiteralUnlimitedNatural89.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read b.p_object::LiteralUnlimitedNatural108
		addToElementRepository("LiteralUnlimitedNatural108", Operation_ProvidedAndRequiredInterface_main_Read_b_p_object_LiteralUnlimitedNatural108);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_object_LiteralUnlimitedNatural108.setName("LiteralUnlimitedNatural108");
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_object_LiteralUnlimitedNatural108.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_object_LiteralUnlimitedNatural108.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural10
		addToElementRepository("LiteralUnlimitedNatural10", Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10.setName("LiteralUnlimitedNatural10");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read b.p_result::LiteralUnlimitedNatural106
		addToElementRepository("LiteralUnlimitedNatural106", Operation_ProvidedAndRequiredInterface_main_Read_b_p_result_LiteralUnlimitedNatural106);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_result_LiteralUnlimitedNatural106.setName("LiteralUnlimitedNatural106");
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_result_LiteralUnlimitedNatural106.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_result_LiteralUnlimitedNatural106.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read e.c_object::LiteralUnlimitedNatural81
		addToElementRepository("LiteralUnlimitedNatural81", Operation_ProvidedAndRequiredInterface_main_Read_e_c_object_LiteralUnlimitedNatural81);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_object_LiteralUnlimitedNatural81.setName("LiteralUnlimitedNatural81");
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_object_LiteralUnlimitedNatural81.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_object_LiteralUnlimitedNatural81.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read d.a_result::LiteralUnlimitedNatural114
		addToElementRepository("LiteralUnlimitedNatural114", Operation_ProvidedAndRequiredInterface_main_Read_d_a_result_LiteralUnlimitedNatural114);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_result_LiteralUnlimitedNatural114.setName("LiteralUnlimitedNatural114");
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_result_LiteralUnlimitedNatural114.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_result_LiteralUnlimitedNatural114.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Call setP()_v::LiteralUnlimitedNatural86
		addToElementRepository("LiteralUnlimitedNatural86", Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralUnlimitedNatural86);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralUnlimitedNatural86.setName("LiteralUnlimitedNatural86");
		Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralUnlimitedNatural86.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Call_setP__v_LiteralUnlimitedNatural86.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read e.c_result::LiteralUnlimitedNatural84
		addToElementRepository("LiteralUnlimitedNatural84", Operation_ProvidedAndRequiredInterface_main_Read_e_c_result_LiteralUnlimitedNatural84);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_result_LiteralUnlimitedNatural84.setName("LiteralUnlimitedNatural84");
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_result_LiteralUnlimitedNatural84.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_result_LiteralUnlimitedNatural84.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read a.b_object::LiteralUnlimitedNatural102
		addToElementRepository("LiteralUnlimitedNatural102", Operation_ProvidedAndRequiredInterface_main_Read_a_b_object_LiteralUnlimitedNatural102);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_object_LiteralUnlimitedNatural102.setName("LiteralUnlimitedNatural102");
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_object_LiteralUnlimitedNatural102.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_object_LiteralUnlimitedNatural102.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_C_setPActivity_Call I::setP on q_v::LiteralUnlimitedNatural23
		addToElementRepository("LiteralUnlimitedNatural23", Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural23);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural23.setName("LiteralUnlimitedNatural23");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural23.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural23.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_D()_result::LiteralUnlimitedNatural75
		addToElementRepository("LiteralUnlimitedNatural75", Operation_ProvidedAndRequiredInterface_main_D__result_LiteralUnlimitedNatural75);
		Operation_ProvidedAndRequiredInterface_main_D__result_LiteralUnlimitedNatural75.setName("LiteralUnlimitedNatural75");
		Operation_ProvidedAndRequiredInterface_main_D__result_LiteralUnlimitedNatural75.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_D__result_LiteralUnlimitedNatural75.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_C_setPActivity_Call I::setP on q_target::LiteralUnlimitedNatural21
		addToElementRepository("LiteralUnlimitedNatural21", Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural21);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural21.setName("LiteralUnlimitedNatural21");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural21.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural21.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read d.a_object::LiteralUnlimitedNatural112
		addToElementRepository("LiteralUnlimitedNatural112", Operation_ProvidedAndRequiredInterface_main_Read_d_a_object_LiteralUnlimitedNatural112);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_object_LiteralUnlimitedNatural112.setName("LiteralUnlimitedNatural112");
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_object_LiteralUnlimitedNatural112.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_object_LiteralUnlimitedNatural112.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_A_setPActivity_Call I::setP on q_target::LiteralUnlimitedNatural48
		addToElementRepository("LiteralUnlimitedNatural48", Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural48);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural48.setName("LiteralUnlimitedNatural48");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural48.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural48.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_D()_target::LiteralUnlimitedNatural73
		addToElementRepository("LiteralUnlimitedNatural73", Operation_ProvidedAndRequiredInterface_main_D__target_LiteralUnlimitedNatural73);
		Operation_ProvidedAndRequiredInterface_main_D__target_LiteralUnlimitedNatural73.setName("LiteralUnlimitedNatural73");
		Operation_ProvidedAndRequiredInterface_main_D__target_LiteralUnlimitedNatural73.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_D__target_LiteralUnlimitedNatural73.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result::LiteralUnlimitedNatural13
		addToElementRepository("LiteralUnlimitedNatural13", Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result_LiteralUnlimitedNatural13);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result_LiteralUnlimitedNatural13.setName("LiteralUnlimitedNatural13");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result_LiteralUnlimitedNatural13.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result_LiteralUnlimitedNatural13.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read d.e_result::LiteralUnlimitedNatural69
		addToElementRepository("LiteralUnlimitedNatural69", Operation_ProvidedAndRequiredInterface_main_Read_d_e_result_LiteralUnlimitedNatural69);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_result_LiteralUnlimitedNatural69.setName("LiteralUnlimitedNatural69");
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_result_LiteralUnlimitedNatural69.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_result_LiteralUnlimitedNatural69.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result_LiteralUnlimitedNatural46);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result_LiteralUnlimitedNatural46.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural7
		addToElementRepository("LiteralUnlimitedNatural7", Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural7);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural7.setName("LiteralUnlimitedNatural7");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural7.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural7.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_A_setPActivity_Call I::setP on q_v::LiteralUnlimitedNatural51
		addToElementRepository("LiteralUnlimitedNatural51", Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural51);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural51.setName("LiteralUnlimitedNatural51");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural51.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural51.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result::LiteralUnlimitedNatural20
		addToElementRepository("LiteralUnlimitedNatural20", Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result_LiteralUnlimitedNatural20);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result_LiteralUnlimitedNatural20.setName("LiteralUnlimitedNatural20");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result_LiteralUnlimitedNatural20.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result_LiteralUnlimitedNatural20.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedAndRequiredInterface_main_Read d.e_object::LiteralUnlimitedNatural67
		addToElementRepository("LiteralUnlimitedNatural67", Operation_ProvidedAndRequiredInterface_main_Read_d_e_object_LiteralUnlimitedNatural67);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_object_LiteralUnlimitedNatural67.setName("LiteralUnlimitedNatural67");
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_object_LiteralUnlimitedNatural67.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_object_LiteralUnlimitedNatural67.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow Operation_ProvidedAndRequiredInterface_C_setPActivity::ObjectFlow16
		addToElementRepository("ObjectFlow16", Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16.setName("ObjectFlow16");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16.setSource(Operation_ProvidedAndRequiredInterface_C_setPActivity_vParameterNode);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16.setTarget(Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_v);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16.setGuard(Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow16_LiteralBoolean17);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_main::ObjectFlow53
		addToElementRepository("ObjectFlow53", Operation_ProvidedAndRequiredInterface_main_ObjectFlow53);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow53.setName("ObjectFlow53");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow53.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow53.setSource(Operation_ProvidedAndRequiredInterface_main_D__result);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow53.setTarget(Operation_ProvidedAndRequiredInterface_main_Fork_d);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow53.setGuard(Operation_ProvidedAndRequiredInterface_main_ObjectFlow53_LiteralBoolean54);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_main::ObjectFlow57
		addToElementRepository("ObjectFlow57", Operation_ProvidedAndRequiredInterface_main_ObjectFlow57);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow57.setName("ObjectFlow57");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow57.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow57.setSource(Operation_ProvidedAndRequiredInterface_main_Value_4_result);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow57.setTarget(Operation_ProvidedAndRequiredInterface_main_Call_setP__v);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow57.setGuard(Operation_ProvidedAndRequiredInterface_main_ObjectFlow57_LiteralBoolean59);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_main::ObjectFlow60
		addToElementRepository("ObjectFlow60", Operation_ProvidedAndRequiredInterface_main_ObjectFlow60);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow60.setName("ObjectFlow60");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow60.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow60.setSource(Operation_ProvidedAndRequiredInterface_main_Read_e_c_result);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow60.setTarget(Operation_ProvidedAndRequiredInterface_main_Call_setP__target);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow60.setGuard(Operation_ProvidedAndRequiredInterface_main_ObjectFlow60_LiteralBoolean62);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_main::ObjectFlow63
		addToElementRepository("ObjectFlow63", Operation_ProvidedAndRequiredInterface_main_ObjectFlow63);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow63.setName("ObjectFlow63");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow63.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow63.setSource(Operation_ProvidedAndRequiredInterface_main_Read_d_e_result);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow63.setTarget(Operation_ProvidedAndRequiredInterface_main_Read_e_c_object);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow63.setGuard(Operation_ProvidedAndRequiredInterface_main_ObjectFlow63_LiteralBoolean64);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_main::ObjectFlow70
		addToElementRepository("ObjectFlow70", Operation_ProvidedAndRequiredInterface_main_ObjectFlow70);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow70.setName("ObjectFlow70");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow70.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow70.setSource(Operation_ProvidedAndRequiredInterface_main_Fork_d);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow70.setTarget(Operation_ProvidedAndRequiredInterface_main_Read_d_e_object);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow70.setGuard(Operation_ProvidedAndRequiredInterface_main_ObjectFlow70_LiteralBoolean71);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_B_setPActivity::ObjectFlow0
		addToElementRepository("ObjectFlow0", Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0.setName("ObjectFlow0");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0.setSource(Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0.setTarget(Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_object);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0.setGuard(Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow0_LiteralBoolean1);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_main::ObjectFlow78
		addToElementRepository("ObjectFlow78", Operation_ProvidedAndRequiredInterface_main_ObjectFlow78);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow78.setName("ObjectFlow78");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow78.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow78.setSource(Operation_ProvidedAndRequiredInterface_main_Read_d_a_result);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow78.setTarget(Operation_ProvidedAndRequiredInterface_main_Read_a_b_object);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow78.setGuard(Operation_ProvidedAndRequiredInterface_main_ObjectFlow78_LiteralBoolean80);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_main::ObjectFlow90
		addToElementRepository("ObjectFlow90", Operation_ProvidedAndRequiredInterface_main_ObjectFlow90);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow90.setName("ObjectFlow90");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow90.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow90.setSource(Operation_ProvidedAndRequiredInterface_main_Create_D_result);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow90.setTarget(Operation_ProvidedAndRequiredInterface_main_D__target);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow90.setGuard(Operation_ProvidedAndRequiredInterface_main_ObjectFlow90_LiteralBoolean91);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_B_setPActivity::ObjectFlow3
		addToElementRepository("ObjectFlow3", Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3.setName("ObjectFlow3");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3.setSource(Operation_ProvidedAndRequiredInterface_B_setPActivity_vParameterNode);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3.setTarget(Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_value);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3.setGuard(Operation_ProvidedAndRequiredInterface_B_setPActivity_ObjectFlow3_LiteralBoolean5);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_main::ObjectFlow95
		addToElementRepository("ObjectFlow95", Operation_ProvidedAndRequiredInterface_main_ObjectFlow95);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow95.setName("ObjectFlow95");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow95.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow95.setSource(Operation_ProvidedAndRequiredInterface_main_Fork_d);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow95.setTarget(Operation_ProvidedAndRequiredInterface_main_Read_d_a_object);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow95.setGuard(Operation_ProvidedAndRequiredInterface_main_ObjectFlow95_LiteralBoolean96);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_A_setPActivity::ObjectFlow39
		addToElementRepository("ObjectFlow39", Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39.setName("ObjectFlow39");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39.setSource(Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39.setTarget(Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_target);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39.setGuard(Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow39_LiteralBoolean41);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_A_setPActivity::ObjectFlow42
		addToElementRepository("ObjectFlow42", Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42.setName("ObjectFlow42");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42.setSource(Operation_ProvidedAndRequiredInterface_A_setPActivity_vParameterNode);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42.setTarget(Operation_ProvidedAndRequiredInterface_A_setPActivity_Call_I_setP_on_q_v);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42.setGuard(Operation_ProvidedAndRequiredInterface_A_setPActivity_ObjectFlow42_LiteralBoolean43);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_C_setPActivity::ObjectFlow26
		addToElementRepository("ObjectFlow26", Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26.setName("ObjectFlow26");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26.setSource(Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26.setTarget(Operation_ProvidedAndRequiredInterface_C_setPActivity_Call_I_setP_on_q_target);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26.setGuard(Operation_ProvidedAndRequiredInterface_C_setPActivity_ObjectFlow26_LiteralBoolean28);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_main::ObjectFlow116
		addToElementRepository("ObjectFlow116", Operation_ProvidedAndRequiredInterface_main_ObjectFlow116);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow116.setName("ObjectFlow116");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow116.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow116.setSource(Operation_ProvidedAndRequiredInterface_main_Read_b_p_result);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow116.setTarget(Operation_ProvidedAndRequiredInterface_main_Call_testP_p);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow116.setGuard(Operation_ProvidedAndRequiredInterface_main_ObjectFlow116_LiteralBoolean118);
		// ObjectFlow Operation_ProvidedAndRequiredInterface_main::ObjectFlow119
		addToElementRepository("ObjectFlow119", Operation_ProvidedAndRequiredInterface_main_ObjectFlow119);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow119.setName("ObjectFlow119");
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow119.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow119.setSource(Operation_ProvidedAndRequiredInterface_main_Read_a_b_result);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow119.setTarget(Operation_ProvidedAndRequiredInterface_main_Read_b_p_object);
		Operation_ProvidedAndRequiredInterface_main_ObjectFlow119.setGuard(Operation_ProvidedAndRequiredInterface_main_ObjectFlow119_LiteralBoolean120);
	}

	private void initializeOperation_Instances()
	{
		// Operation Operation_ProvidedAndRequiredInterface_D::D_D
		addToElementRepository("D_D", Operation_ProvidedAndRequiredInterface_D_D_D);
		Operation_ProvidedAndRequiredInterface_D_D_D.setName("D");
		Operation_ProvidedAndRequiredInterface_D_D_D.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_D_D_D.addOwnedParameter(Operation_ProvidedAndRequiredInterface_D_D_D_result);
		Operation_ProvidedAndRequiredInterface_D_D_D.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation Operation_ProvidedAndRequiredInterface_C::setP_Integer
		addToElementRepository("setP_Integer", Operation_ProvidedAndRequiredInterface_C_setP_Integer);
		Operation_ProvidedAndRequiredInterface_C_setP_Integer.setName("setP");
		Operation_ProvidedAndRequiredInterface_C_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setP_Integer.addOwnedParameter(Operation_ProvidedAndRequiredInterface_C_setP_Integer_v);
		Operation_ProvidedAndRequiredInterface_C_setP_Integer.addMethod(Operation_ProvidedAndRequiredInterface_C_setPActivity);
		// Operation Operation_ProvidedAndRequiredInterface_I::setP_Integer
		addToElementRepository("setP_Integer", Operation_ProvidedAndRequiredInterface_I_setP_Integer);
		Operation_ProvidedAndRequiredInterface_I_setP_Integer.setName("setP");
		Operation_ProvidedAndRequiredInterface_I_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_I_setP_Integer.addOwnedParameter(Operation_ProvidedAndRequiredInterface_I_setP_Integer_v);
		// Operation Operation_ProvidedAndRequiredInterface_IImpl::setP_Integer
		addToElementRepository("setP_Integer", Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer);
		Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer.setName("setP");
		Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer.addOwnedParameter(Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer_v);
		// Operation Operation_ProvidedAndRequiredInterface_IProvReq::setP_Integer
		addToElementRepository("setP_Integer", Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer);
		Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer.setName("setP");
		Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer.addOwnedParameter(Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer_v);
		// Operation Operation_ProvidedAndRequiredInterface_B::setP_Integer
		addToElementRepository("setP_Integer", Operation_ProvidedAndRequiredInterface_B_setP_Integer);
		Operation_ProvidedAndRequiredInterface_B_setP_Integer.setName("setP");
		Operation_ProvidedAndRequiredInterface_B_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setP_Integer.addOwnedParameter(Operation_ProvidedAndRequiredInterface_B_setP_Integer_v);
		Operation_ProvidedAndRequiredInterface_B_setP_Integer.addMethod(Operation_ProvidedAndRequiredInterface_B_setPActivity);
		// Operation Operation_ProvidedAndRequiredInterface_A::setP_Integer
		addToElementRepository("setP_Integer", Operation_ProvidedAndRequiredInterface_A_setP_Integer);
		Operation_ProvidedAndRequiredInterface_A_setP_Integer.setName("setP");
		Operation_ProvidedAndRequiredInterface_A_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setP_Integer.addOwnedParameter(Operation_ProvidedAndRequiredInterface_A_setP_Integer_v);
		Operation_ProvidedAndRequiredInterface_A_setP_Integer.addMethod(Operation_ProvidedAndRequiredInterface_A_setPActivity);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin Operation_ProvidedAndRequiredInterface_main_Read b.p::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_main_Read_b_p_result);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_result.setName("result");
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Operation_ProvidedAndRequiredInterface_B_setPActivity_this::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result.setName("result");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result.setType(Operation_ProvidedAndRequiredInterface_B);
		// OutputPin Operation_ProvidedAndRequiredInterface_C_setPActivity_this::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result.setName("result");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result.setType(Operation_ProvidedAndRequiredInterface_C);
		// OutputPin Operation_ProvidedAndRequiredInterface_main_Value(4)::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_main_Value_4_result);
		Operation_ProvidedAndRequiredInterface_main_Value_4_result.setName("result");
		Operation_ProvidedAndRequiredInterface_main_Value_4_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Operation_ProvidedAndRequiredInterface_main_D()::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_main_D__result);
		Operation_ProvidedAndRequiredInterface_main_D__result.setName("result");
		Operation_ProvidedAndRequiredInterface_main_D__result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_D__result.setType(Operation_ProvidedAndRequiredInterface_D);
		// OutputPin Operation_ProvidedAndRequiredInterface_main_Read d.e::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_main_Read_d_e_result);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_result.setName("result");
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e_result.setType(Operation_ProvidedAndRequiredInterface_E);
		// OutputPin Operation_ProvidedAndRequiredInterface_B_setPActivity_Set this.p::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result.setName("result");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_Set_this_p_result.setType(Operation_ProvidedAndRequiredInterface_B);
		// OutputPin Operation_ProvidedAndRequiredInterface_main_Read e.c::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_main_Read_e_c_result);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_result.setName("result");
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c_result.setType(Operation_ProvidedAndRequiredInterface_C);
		// OutputPin Operation_ProvidedAndRequiredInterface_A_setPActivity_this::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result.setName("result");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result.setType(Operation_ProvidedAndRequiredInterface_A);
		// OutputPin Operation_ProvidedAndRequiredInterface_main_Create D::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_main_Create_D_result);
		Operation_ProvidedAndRequiredInterface_main_Create_D_result.setName("result");
		Operation_ProvidedAndRequiredInterface_main_Create_D_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Create_D_result.setType(Operation_ProvidedAndRequiredInterface_D);
		// OutputPin Operation_ProvidedAndRequiredInterface_main_Read d.a::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_main_Read_d_a_result);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_result.setName("result");
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a_result.setType(Operation_ProvidedAndRequiredInterface_A);
		// OutputPin Operation_ProvidedAndRequiredInterface_main_Read a.b::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_main_Read_a_b_result);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_result.setName("result");
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b_result.setType(Operation_ProvidedAndRequiredInterface_B);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport Operation_ProvidedAndRequiredInterface::PackageImport31
		addToElementRepository("PackageImport31", Operation_ProvidedAndRequiredInterface_PackageImport31);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter Operation_ProvidedAndRequiredInterface_B_setPActivity::v
		addToElementRepository("v", Operation_ProvidedAndRequiredInterface_B_setPActivity_v);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_v.setName("v");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedAndRequiredInterface_I_setP_Integer::v
		addToElementRepository("v", Operation_ProvidedAndRequiredInterface_I_setP_Integer_v);
		Operation_ProvidedAndRequiredInterface_I_setP_Integer_v.setName("v");
		Operation_ProvidedAndRequiredInterface_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedAndRequiredInterface_A_setP_Integer::v
		addToElementRepository("v", Operation_ProvidedAndRequiredInterface_A_setP_Integer_v);
		Operation_ProvidedAndRequiredInterface_A_setP_Integer_v.setName("v");
		Operation_ProvidedAndRequiredInterface_A_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_A_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedAndRequiredInterface_B_setP_Integer::v
		addToElementRepository("v", Operation_ProvidedAndRequiredInterface_B_setP_Integer_v);
		Operation_ProvidedAndRequiredInterface_B_setP_Integer_v.setName("v");
		Operation_ProvidedAndRequiredInterface_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedAndRequiredInterface_main_testP::p
		addToElementRepository("p", Operation_ProvidedAndRequiredInterface_main_testP_p);
		Operation_ProvidedAndRequiredInterface_main_testP_p.setName("p");
		Operation_ProvidedAndRequiredInterface_main_testP_p.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_main_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedAndRequiredInterface_C_setP_Integer::v
		addToElementRepository("v", Operation_ProvidedAndRequiredInterface_C_setP_Integer_v);
		Operation_ProvidedAndRequiredInterface_C_setP_Integer_v.setName("v");
		Operation_ProvidedAndRequiredInterface_C_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_C_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedAndRequiredInterface_C_setPActivity::v
		addToElementRepository("v", Operation_ProvidedAndRequiredInterface_C_setPActivity_v);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_v.setName("v");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_C_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer::v
		addToElementRepository("v", Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer_v);
		Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer_v.setName("v");
		Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer::v
		addToElementRepository("v", Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer_v);
		Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer_v.setName("v");
		Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_IProvReq_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedAndRequiredInterface_A_setPActivity::v
		addToElementRepository("v", Operation_ProvidedAndRequiredInterface_A_setPActivity_v);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_v.setName("v");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_A_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedAndRequiredInterface_D_D_D::result
		addToElementRepository("result", Operation_ProvidedAndRequiredInterface_D_D_D_result);
		Operation_ProvidedAndRequiredInterface_D_D_D_result.setName("result");
		Operation_ProvidedAndRequiredInterface_D_D_D_result.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_D_D_D_result.setType(Operation_ProvidedAndRequiredInterface_D);
		Operation_ProvidedAndRequiredInterface_D_D_D_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port Operation_ProvidedAndRequiredInterface_C::q
		addToElementRepository("q", Operation_ProvidedAndRequiredInterface_C_q);
		Operation_ProvidedAndRequiredInterface_C_q.setName("q");
		Operation_ProvidedAndRequiredInterface_C_q.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_C_q.setType(Operation_ProvidedAndRequiredInterface_IProvReq);
		Operation_ProvidedAndRequiredInterface_C_q.setAggregation(AggregationKind.composite);
		Operation_ProvidedAndRequiredInterface_C_q.isService = true;
		Operation_ProvidedAndRequiredInterface_C_q.addRequired(Operation_ProvidedAndRequiredInterface_I);
		Operation_ProvidedAndRequiredInterface_C_q.addProvided(Operation_ProvidedAndRequiredInterface_I);
		// Port Operation_ProvidedAndRequiredInterface_E::q
		addToElementRepository("q", Operation_ProvidedAndRequiredInterface_E_q);
		Operation_ProvidedAndRequiredInterface_E_q.setName("q");
		Operation_ProvidedAndRequiredInterface_E_q.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_E_q.setType(Operation_ProvidedAndRequiredInterface_IProvReq);
		Operation_ProvidedAndRequiredInterface_E_q.setAggregation(AggregationKind.composite);
		Operation_ProvidedAndRequiredInterface_E_q.isService = true;
		Operation_ProvidedAndRequiredInterface_E_q.addRequired(Operation_ProvidedAndRequiredInterface_I);
		Operation_ProvidedAndRequiredInterface_E_q.addProvided(Operation_ProvidedAndRequiredInterface_I);
		// Port Operation_ProvidedAndRequiredInterface_A::q
		addToElementRepository("q", Operation_ProvidedAndRequiredInterface_A_q);
		Operation_ProvidedAndRequiredInterface_A_q.setName("q");
		Operation_ProvidedAndRequiredInterface_A_q.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_A_q.setType(Operation_ProvidedAndRequiredInterface_IImpl);
		Operation_ProvidedAndRequiredInterface_A_q.setAggregation(AggregationKind.composite);
		Operation_ProvidedAndRequiredInterface_A_q.isService = true;
		Operation_ProvidedAndRequiredInterface_A_q.addProvided(Operation_ProvidedAndRequiredInterface_I);
	}

	private void initializeProperty_Instances()
	{
		// Property Operation_ProvidedAndRequiredInterface_R::y
		addToElementRepository("y", Operation_ProvidedAndRequiredInterface_R_y);
		Operation_ProvidedAndRequiredInterface_R_y.setName("y");
		Operation_ProvidedAndRequiredInterface_R_y.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_R_y.setType(Operation_ProvidedAndRequiredInterface_B);
		// Property Operation_ProvidedAndRequiredInterface_D::e
		addToElementRepository("e", Operation_ProvidedAndRequiredInterface_D_e);
		Operation_ProvidedAndRequiredInterface_D_e.setName("e");
		Operation_ProvidedAndRequiredInterface_D_e.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_D_e.setType(Operation_ProvidedAndRequiredInterface_E);
		Operation_ProvidedAndRequiredInterface_D_e.setAggregation(AggregationKind.composite);
		// Property Operation_ProvidedAndRequiredInterface_E::c
		addToElementRepository("c", Operation_ProvidedAndRequiredInterface_E_c);
		Operation_ProvidedAndRequiredInterface_E_c.setName("c");
		Operation_ProvidedAndRequiredInterface_E_c.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_E_c.setType(Operation_ProvidedAndRequiredInterface_C);
		Operation_ProvidedAndRequiredInterface_E_c.setAggregation(AggregationKind.composite);
		// Property Operation_ProvidedAndRequiredInterface_A::b
		addToElementRepository("b", Operation_ProvidedAndRequiredInterface_A_b);
		Operation_ProvidedAndRequiredInterface_A_b.setName("b");
		Operation_ProvidedAndRequiredInterface_A_b.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_A_b.setType(Operation_ProvidedAndRequiredInterface_B);
		Operation_ProvidedAndRequiredInterface_A_b.setAggregation(AggregationKind.composite);
		// Property Operation_ProvidedAndRequiredInterface_R::x
		addToElementRepository("x", Operation_ProvidedAndRequiredInterface_R_x);
		Operation_ProvidedAndRequiredInterface_R_x.setName("x");
		Operation_ProvidedAndRequiredInterface_R_x.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_R_x.setType(Operation_ProvidedAndRequiredInterface_IImpl);
		// Property Operation_ProvidedAndRequiredInterface_D::a
		addToElementRepository("a", Operation_ProvidedAndRequiredInterface_D_a);
		Operation_ProvidedAndRequiredInterface_D_a.setName("a");
		Operation_ProvidedAndRequiredInterface_D_a.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_D_a.setType(Operation_ProvidedAndRequiredInterface_A);
		Operation_ProvidedAndRequiredInterface_D_a.setAggregation(AggregationKind.composite);
		// Property Operation_ProvidedAndRequiredInterface_B::p
		addToElementRepository("p", Operation_ProvidedAndRequiredInterface_B_p);
		Operation_ProvidedAndRequiredInterface_B_p.setName("p");
		Operation_ProvidedAndRequiredInterface_B_p.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property Operation_ProvidedAndRequiredInterface_S::y
		addToElementRepository("y", Operation_ProvidedAndRequiredInterface_S_y);
		Operation_ProvidedAndRequiredInterface_S_y.setName("y");
		Operation_ProvidedAndRequiredInterface_S_y.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_S_y.setType(Operation_ProvidedAndRequiredInterface_IImpl);
		// Property Operation_ProvidedAndRequiredInterface_S::x
		addToElementRepository("x", Operation_ProvidedAndRequiredInterface_S_x);
		Operation_ProvidedAndRequiredInterface_S_x.setName("x");
		Operation_ProvidedAndRequiredInterface_S_x.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedAndRequiredInterface_S_x.setType(Operation_ProvidedAndRequiredInterface_IImpl);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction Operation_ProvidedAndRequiredInterface_C_setPActivity::this
		addToElementRepository("this", Operation_ProvidedAndRequiredInterface_C_setPActivity_this);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_this.setName("this");
		Operation_ProvidedAndRequiredInterface_C_setPActivity_this.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_C_setPActivity_this.setResult(Operation_ProvidedAndRequiredInterface_C_setPActivity_this_result);
		// ReadSelfAction Operation_ProvidedAndRequiredInterface_B_setPActivity::this
		addToElementRepository("this", Operation_ProvidedAndRequiredInterface_B_setPActivity_this);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_this.setName("this");
		Operation_ProvidedAndRequiredInterface_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_B_setPActivity_this.setResult(Operation_ProvidedAndRequiredInterface_B_setPActivity_this_result);
		// ReadSelfAction Operation_ProvidedAndRequiredInterface_A_setPActivity::this
		addToElementRepository("this", Operation_ProvidedAndRequiredInterface_A_setPActivity_this);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_this.setName("this");
		Operation_ProvidedAndRequiredInterface_A_setPActivity_this.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_A_setPActivity_this.setResult(Operation_ProvidedAndRequiredInterface_A_setPActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction Operation_ProvidedAndRequiredInterface_main::Read e.c
		addToElementRepository("Read e.c", Operation_ProvidedAndRequiredInterface_main_Read_e_c);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c.setName("Read e.c");
		Operation_ProvidedAndRequiredInterface_main_Read_e_c.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c.setStructuralFeature(Operation_ProvidedAndRequiredInterface_E_c);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c.setObject(Operation_ProvidedAndRequiredInterface_main_Read_e_c_object);
		Operation_ProvidedAndRequiredInterface_main_Read_e_c.setResult(Operation_ProvidedAndRequiredInterface_main_Read_e_c_result);
		// ReadStructuralFeatureAction Operation_ProvidedAndRequiredInterface_main::Read a.b
		addToElementRepository("Read a.b", Operation_ProvidedAndRequiredInterface_main_Read_a_b);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b.setName("Read a.b");
		Operation_ProvidedAndRequiredInterface_main_Read_a_b.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b.setStructuralFeature(Operation_ProvidedAndRequiredInterface_A_b);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b.setObject(Operation_ProvidedAndRequiredInterface_main_Read_a_b_object);
		Operation_ProvidedAndRequiredInterface_main_Read_a_b.setResult(Operation_ProvidedAndRequiredInterface_main_Read_a_b_result);
		// ReadStructuralFeatureAction Operation_ProvidedAndRequiredInterface_main::Read d.e
		addToElementRepository("Read d.e", Operation_ProvidedAndRequiredInterface_main_Read_d_e);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e.setName("Read d.e");
		Operation_ProvidedAndRequiredInterface_main_Read_d_e.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e.setStructuralFeature(Operation_ProvidedAndRequiredInterface_D_e);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e.setObject(Operation_ProvidedAndRequiredInterface_main_Read_d_e_object);
		Operation_ProvidedAndRequiredInterface_main_Read_d_e.setResult(Operation_ProvidedAndRequiredInterface_main_Read_d_e_result);
		// ReadStructuralFeatureAction Operation_ProvidedAndRequiredInterface_main::Read b.p
		addToElementRepository("Read b.p", Operation_ProvidedAndRequiredInterface_main_Read_b_p);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p.setName("Read b.p");
		Operation_ProvidedAndRequiredInterface_main_Read_b_p.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p.setStructuralFeature(Operation_ProvidedAndRequiredInterface_B_p);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p.setObject(Operation_ProvidedAndRequiredInterface_main_Read_b_p_object);
		Operation_ProvidedAndRequiredInterface_main_Read_b_p.setResult(Operation_ProvidedAndRequiredInterface_main_Read_b_p_result);
		// ReadStructuralFeatureAction Operation_ProvidedAndRequiredInterface_main::Read d.a
		addToElementRepository("Read d.a", Operation_ProvidedAndRequiredInterface_main_Read_d_a);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a.setName("Read d.a");
		Operation_ProvidedAndRequiredInterface_main_Read_d_a.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a.setStructuralFeature(Operation_ProvidedAndRequiredInterface_D_a);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a.setObject(Operation_ProvidedAndRequiredInterface_main_Read_d_a_object);
		Operation_ProvidedAndRequiredInterface_main_Read_d_a.setResult(Operation_ProvidedAndRequiredInterface_main_Read_d_a_result);
	}

	private void initializeUsage_Instances()
	{
		// Usage Operation_ProvidedAndRequiredInterface::IUsageIProvReq
		addToElementRepository("IUsageIProvReq", Operation_ProvidedAndRequiredInterface_IUsageIProvReq);
		Operation_ProvidedAndRequiredInterface_IUsageIProvReq.setName("IUsageIProvReq");
		Operation_ProvidedAndRequiredInterface_IUsageIProvReq.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_IUsageIProvReq.addClient(Operation_ProvidedAndRequiredInterface_IProvReq);
		Operation_ProvidedAndRequiredInterface_IUsageIProvReq.addSupplier(Operation_ProvidedAndRequiredInterface_I);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction Operation_ProvidedAndRequiredInterface_main::Value(4)
		addToElementRepository("Value(4)", Operation_ProvidedAndRequiredInterface_main_Value_4);
		Operation_ProvidedAndRequiredInterface_main_Value_4.setName("Value(4)");
		Operation_ProvidedAndRequiredInterface_main_Value_4.setVisibility(VisibilityKind.public_);
		Operation_ProvidedAndRequiredInterface_main_Value_4.setValue(Operation_ProvidedAndRequiredInterface_main_Value_4_LiteralInteger98);
		Operation_ProvidedAndRequiredInterface_main_Value_4.setResult(Operation_ProvidedAndRequiredInterface_main_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // Operation_ProvidedAndRequiredInterfaceModel
