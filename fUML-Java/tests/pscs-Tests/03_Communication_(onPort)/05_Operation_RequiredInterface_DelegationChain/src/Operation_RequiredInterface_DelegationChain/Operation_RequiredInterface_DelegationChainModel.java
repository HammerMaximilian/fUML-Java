/*
 * Operation_RequiredInterface_DelegationChainModel.java
 * 
 * Auto-generated file
 */
package Operation_RequiredInterface_DelegationChain;

import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
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
import uml.activities.ObjectFlow;
import uml.commonbehavior.OpaqueBehavior;
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

public class Operation_RequiredInterface_DelegationChainModel extends InMemoryModel
{
	private static Operation_RequiredInterface_DelegationChainModel instance;

	/*
	 * Model Operation_RequiredInterface_DelegationChain
	 */
	public Package Operation_RequiredInterface_DelegationChain = new Package();
		public Class_ Operation_RequiredInterface_DelegationChain_IImpl = new Class_();
			public Operation Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer = new Operation();
				public Parameter Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer_v = new Parameter();
			public InterfaceRealization Operation_RequiredInterface_DelegationChain_IImpl_IRealization = new InterfaceRealization();
		public Class_ Operation_RequiredInterface_DelegationChain_B = new Class_();
			public InterfaceRealization Operation_RequiredInterface_DelegationChain_B_IRealization = new InterfaceRealization();
			public Activity Operation_RequiredInterface_DelegationChain_B_setPActivity = new Activity();
				public ObjectFlow Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0 = new ObjectFlow();
					public LiteralBoolean Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0_LiteralBoolean1 = new LiteralBoolean();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0_LiteralInteger2 = new LiteralInteger();
				public Parameter Operation_RequiredInterface_DelegationChain_B_setPActivity_v = new Parameter();
				public ObjectFlow Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3 = new ObjectFlow();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3_LiteralInteger4 = new LiteralInteger();
					public LiteralBoolean Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3_LiteralBoolean5 = new LiteralBoolean();
				public ActivityParameterNode Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode_LiteralInteger6 = new LiteralInteger();
				public AddStructuralFeatureValueAction Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural7 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value_LiteralInteger8 = new LiteralInteger();
					public InputPin Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object_LiteralInteger9 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10 = new LiteralUnlimitedNatural();
					public OutputPin Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural11 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result_LiteralInteger12 = new LiteralInteger();
				public ReadSelfAction Operation_RequiredInterface_DelegationChain_B_setPActivity_this = new ReadSelfAction();
					public OutputPin Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result_LiteralUnlimitedNatural13 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result_LiteralInteger14 = new LiteralInteger();
			public Operation Operation_RequiredInterface_DelegationChain_B_setP_Integer = new Operation();
				public Parameter Operation_RequiredInterface_DelegationChain_B_setP_Integer_v = new Parameter();
			public Property Operation_RequiredInterface_DelegationChain_B_p = new Property();
		public Association Operation_RequiredInterface_DelegationChain_S = new Association();
			public Property Operation_RequiredInterface_DelegationChain_S_y = new Property();
			public Property Operation_RequiredInterface_DelegationChain_S_x = new Property();
		public Class_ Operation_RequiredInterface_DelegationChain_C = new Class_();
			public Port Operation_RequiredInterface_DelegationChain_C_q = new Port();
			public Operation Operation_RequiredInterface_DelegationChain_C_setP_Integer = new Operation();
				public Parameter Operation_RequiredInterface_DelegationChain_C_setP_Integer_v = new Parameter();
			public Activity Operation_RequiredInterface_DelegationChain_C_setPActivity = new Activity();
				public ObjectFlow Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15 = new ObjectFlow();
					public LiteralBoolean Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15_LiteralBoolean16 = new LiteralBoolean();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15_LiteralInteger17 = new LiteralInteger();
				public ReadSelfAction Operation_RequiredInterface_DelegationChain_C_setPActivity_this = new ReadSelfAction();
					public OutputPin Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result = new OutputPin();
						public LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result_LiteralInteger18 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result_LiteralUnlimitedNatural19 = new LiteralUnlimitedNatural();
				public Parameter Operation_RequiredInterface_DelegationChain_C_setPActivity_v = new Parameter();
				public CallOperationAction Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q = new CallOperationAction();
					public InputPin Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target = new InputPin();
						public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural20 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger21 = new LiteralInteger();
					public InputPin Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v = new InputPin();
						public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural22 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger23 = new LiteralInteger();
						public LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger24 = new LiteralInteger();
				public ObjectFlow Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25 = new ObjectFlow();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25_LiteralInteger26 = new LiteralInteger();
					public LiteralBoolean Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25_LiteralBoolean27 = new LiteralBoolean();
				public ActivityParameterNode Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode_LiteralInteger28 = new LiteralInteger();
			public InterfaceRealization Operation_RequiredInterface_DelegationChain_C_IRealization = new InterfaceRealization();
		public Comment Operation_RequiredInterface_DelegationChain_Comment29 = new Comment();
		public PackageImport Operation_RequiredInterface_DelegationChain_PackageImport30 = new PackageImport();
		public Comment Operation_RequiredInterface_DelegationChain_Comment31 = new Comment();
		public Class_ Operation_RequiredInterface_DelegationChain_D = new Class_();
			public Property Operation_RequiredInterface_DelegationChain_D_e = new Property();
			public Operation Operation_RequiredInterface_DelegationChain_D_D_D = new Operation();
				public Parameter Operation_RequiredInterface_DelegationChain_D_D_D_result = new Parameter();
			public Connector Operation_RequiredInterface_DelegationChain_D_s = new Connector();
				public ConnectorEnd Operation_RequiredInterface_DelegationChain_D_s_ConnectorEnd32 = new ConnectorEnd();
				public ConnectorEnd Operation_RequiredInterface_DelegationChain_D_s_ConnectorEnd33 = new ConnectorEnd();
			public Property Operation_RequiredInterface_DelegationChain_D_a = new Property();
		public Class_ Operation_RequiredInterface_DelegationChain_E = new Class_();
			public Property Operation_RequiredInterface_DelegationChain_E_c = new Property();
			public Port Operation_RequiredInterface_DelegationChain_E_q = new Port();
			public Connector Operation_RequiredInterface_DelegationChain_E_s = new Connector();
				public ConnectorEnd Operation_RequiredInterface_DelegationChain_E_s_ConnectorEnd34 = new ConnectorEnd();
				public ConnectorEnd Operation_RequiredInterface_DelegationChain_E_s_ConnectorEnd35 = new ConnectorEnd();
		public Class_ Operation_RequiredInterface_DelegationChain_A = new Class_();
			public Property Operation_RequiredInterface_DelegationChain_A_b = new Property();
			public Connector Operation_RequiredInterface_DelegationChain_A_r = new Connector();
				public ConnectorEnd Operation_RequiredInterface_DelegationChain_A_r_ConnectorEnd36 = new ConnectorEnd();
				public ConnectorEnd Operation_RequiredInterface_DelegationChain_A_r_ConnectorEnd37 = new ConnectorEnd();
			public Port Operation_RequiredInterface_DelegationChain_A_q = new Port();
			public Activity Operation_RequiredInterface_DelegationChain_A_setPActivity = new Activity();
				public ObjectFlow Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38 = new ObjectFlow();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38_LiteralInteger39 = new LiteralInteger();
					public LiteralBoolean Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38_LiteralBoolean40 = new LiteralBoolean();
				public ObjectFlow Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41 = new ObjectFlow();
					public LiteralBoolean Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41_LiteralBoolean42 = new LiteralBoolean();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41_LiteralInteger43 = new LiteralInteger();
				public ActivityParameterNode Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode_LiteralInteger44 = new LiteralInteger();
				public Parameter Operation_RequiredInterface_DelegationChain_A_setPActivity_v = new Parameter();
				public ReadSelfAction Operation_RequiredInterface_DelegationChain_A_setPActivity_this = new ReadSelfAction();
					public OutputPin Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result_LiteralUnlimitedNatural45 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result_LiteralInteger46 = new LiteralInteger();
				public CallOperationAction Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q = new CallOperationAction();
					public InputPin Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target = new InputPin();
						public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural47 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger48 = new LiteralInteger();
					public InputPin Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v = new InputPin();
						public LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger49 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural50 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger51 = new LiteralInteger();
			public Operation Operation_RequiredInterface_DelegationChain_A_setP_Integer = new Operation();
				public Parameter Operation_RequiredInterface_DelegationChain_A_setP_Integer_v = new Parameter();
		public Association Operation_RequiredInterface_DelegationChain_R = new Association();
			public Property Operation_RequiredInterface_DelegationChain_R_x = new Property();
			public Property Operation_RequiredInterface_DelegationChain_R_y = new Property();
		public Interface Operation_RequiredInterface_DelegationChain_I = new Interface();
			public Operation Operation_RequiredInterface_DelegationChain_I_setP_Integer = new Operation();
				public Parameter Operation_RequiredInterface_DelegationChain_I_setP_Integer_v = new Parameter();
		public Activity Operation_RequiredInterface_DelegationChain_main = new Activity();
			public CallOperationAction Operation_RequiredInterface_DelegationChain_main_Call_setP_ = new CallOperationAction();
				public InputPin Operation_RequiredInterface_DelegationChain_main_Call_setP__target = new InputPin();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Call_setP__target_LiteralInteger52 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Call_setP__target_LiteralUnlimitedNatural53 = new LiteralUnlimitedNatural();
				public InputPin Operation_RequiredInterface_DelegationChain_main_Call_setP__v = new InputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralUnlimitedNatural54 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralInteger55 = new LiteralInteger();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralInteger56 = new LiteralInteger();
			public ReadStructuralFeatureAction Operation_RequiredInterface_DelegationChain_main_Read_e_c = new ReadStructuralFeatureAction();
				public InputPin Operation_RequiredInterface_DelegationChain_main_Read_e_c_object = new InputPin();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read_e_c_object_LiteralInteger57 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read_e_c_object_LiteralUnlimitedNatural58 = new LiteralUnlimitedNatural();
				public OutputPin Operation_RequiredInterface_DelegationChain_main_Read_e_c_result = new OutputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read_e_c_result_LiteralUnlimitedNatural59 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read_e_c_result_LiteralInteger60 = new LiteralInteger();
			public ForkNode Operation_RequiredInterface_DelegationChain_main_Fork_d = new ForkNode();
			public ReadStructuralFeatureAction Operation_RequiredInterface_DelegationChain_main_Read_a_b = new ReadStructuralFeatureAction();
				public InputPin Operation_RequiredInterface_DelegationChain_main_Read_a_b_object = new InputPin();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read_a_b_object_LiteralInteger61 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read_a_b_object_LiteralUnlimitedNatural62 = new LiteralUnlimitedNatural();
				public OutputPin Operation_RequiredInterface_DelegationChain_main_Read_a_b_result = new OutputPin();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read_a_b_result_LiteralInteger63 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read_a_b_result_LiteralUnlimitedNatural64 = new LiteralUnlimitedNatural();
			public ObjectFlow Operation_RequiredInterface_DelegationChain_main_ObjectFlow65 = new ObjectFlow();
				public LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow65_LiteralInteger66 = new LiteralInteger();
				public LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow65_LiteralBoolean67 = new LiteralBoolean();
			public ObjectFlow Operation_RequiredInterface_DelegationChain_main_ObjectFlow68 = new ObjectFlow();
				public LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow68_LiteralInteger69 = new LiteralInteger();
				public LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow68_LiteralBoolean70 = new LiteralBoolean();
			public ObjectFlow Operation_RequiredInterface_DelegationChain_main_ObjectFlow71 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow71_LiteralBoolean72 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow71_LiteralInteger73 = new LiteralInteger();
			public ValueSpecificationAction Operation_RequiredInterface_DelegationChain_main_Value_4 = new ValueSpecificationAction();
				public OutputPin Operation_RequiredInterface_DelegationChain_main_Value_4_result = new OutputPin();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Value_4_result_LiteralInteger74 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Value_4_result_LiteralUnlimitedNatural75 = new LiteralUnlimitedNatural();
				public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Value_4_LiteralInteger76 = new LiteralInteger();
			public ControlFlow Operation_RequiredInterface_DelegationChain_main_ControlFlow77 = new ControlFlow();
			public CreateObjectAction Operation_RequiredInterface_DelegationChain_main_Create_D = new CreateObjectAction();
				public OutputPin Operation_RequiredInterface_DelegationChain_main_Create_D_result = new OutputPin();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Create_D_result_LiteralInteger78 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Create_D_result_LiteralUnlimitedNatural79 = new LiteralUnlimitedNatural();
			public ObjectFlow Operation_RequiredInterface_DelegationChain_main_ObjectFlow80 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow80_LiteralBoolean81 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow80_LiteralInteger82 = new LiteralInteger();
			public CallBehaviorAction Operation_RequiredInterface_DelegationChain_main_Call_testP = new CallBehaviorAction();
				public InputPin Operation_RequiredInterface_DelegationChain_main_Call_testP_p = new InputPin();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralInteger83 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralUnlimitedNatural84 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralInteger85 = new LiteralInteger();
			public ReadStructuralFeatureAction Operation_RequiredInterface_DelegationChain_main_Read_b_p = new ReadStructuralFeatureAction();
				public OutputPin Operation_RequiredInterface_DelegationChain_main_Read_b_p_result = new OutputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read_b_p_result_LiteralUnlimitedNatural86 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read_b_p_result_LiteralInteger87 = new LiteralInteger();
				public InputPin Operation_RequiredInterface_DelegationChain_main_Read_b_p_object = new InputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read_b_p_object_LiteralUnlimitedNatural88 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read_b_p_object_LiteralInteger89 = new LiteralInteger();
			public ObjectFlow Operation_RequiredInterface_DelegationChain_main_ObjectFlow90 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow90_LiteralBoolean91 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow90_LiteralInteger92 = new LiteralInteger();
			public ReadStructuralFeatureAction Operation_RequiredInterface_DelegationChain_main_Read_d_e = new ReadStructuralFeatureAction();
				public InputPin Operation_RequiredInterface_DelegationChain_main_Read_d_e_object = new InputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read_d_e_object_LiteralUnlimitedNatural93 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read_d_e_object_LiteralInteger94 = new LiteralInteger();
				public OutputPin Operation_RequiredInterface_DelegationChain_main_Read_d_e_result = new OutputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read_d_e_result_LiteralUnlimitedNatural95 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read_d_e_result_LiteralInteger96 = new LiteralInteger();
			public ObjectFlow Operation_RequiredInterface_DelegationChain_main_ObjectFlow97 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow97_LiteralBoolean98 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow97_LiteralInteger99 = new LiteralInteger();
			public CallOperationAction Operation_RequiredInterface_DelegationChain_main_D_ = new CallOperationAction();
				public OutputPin Operation_RequiredInterface_DelegationChain_main_D__result = new OutputPin();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_D__result_LiteralInteger100 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_D__result_LiteralUnlimitedNatural101 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_D__result_LiteralInteger102 = new LiteralInteger();
				public InputPin Operation_RequiredInterface_DelegationChain_main_D__target = new InputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_D__target_LiteralUnlimitedNatural103 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_D__target_LiteralInteger104 = new LiteralInteger();
			public ObjectFlow Operation_RequiredInterface_DelegationChain_main_ObjectFlow105 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow105_LiteralBoolean106 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow105_LiteralInteger107 = new LiteralInteger();
			public ReadStructuralFeatureAction Operation_RequiredInterface_DelegationChain_main_Read_d_a = new ReadStructuralFeatureAction();
				public OutputPin Operation_RequiredInterface_DelegationChain_main_Read_d_a_result = new OutputPin();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read_d_a_result_LiteralInteger108 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read_d_a_result_LiteralUnlimitedNatural109 = new LiteralUnlimitedNatural();
				public InputPin Operation_RequiredInterface_DelegationChain_main_Read_d_a_object = new InputPin();
					public LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read_d_a_object_LiteralInteger110 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read_d_a_object_LiteralUnlimitedNatural111 = new LiteralUnlimitedNatural();
			public ObjectFlow Operation_RequiredInterface_DelegationChain_main_ObjectFlow112 = new ObjectFlow();
				public LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow112_LiteralInteger113 = new LiteralInteger();
				public LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow112_LiteralBoolean114 = new LiteralBoolean();
			public ObjectFlow Operation_RequiredInterface_DelegationChain_main_ObjectFlow115 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow115_LiteralBoolean116 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow115_LiteralInteger117 = new LiteralInteger();
			public OpaqueBehavior Operation_RequiredInterface_DelegationChain_main_testP = new OpaqueBehavior();
				public Parameter Operation_RequiredInterface_DelegationChain_main_testP_p = new Parameter();
			public ObjectFlow Operation_RequiredInterface_DelegationChain_main_ObjectFlow118 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow118_LiteralBoolean119 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow118_LiteralInteger120 = new LiteralInteger();

	public static Operation_RequiredInterface_DelegationChainModel instance()
	{
		if (instance == null)
        {
            instance = new Operation_RequiredInterface_DelegationChainModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public Operation_RequiredInterface_DelegationChainModel()
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
		this.initializeValueSpecificationAction_Instances();
	}

	private void initializeActivity_Instances()
	{
		// Activity Operation_RequiredInterface_DelegationChain_C::setPActivity
		addToElementRepository("setPActivity", Operation_RequiredInterface_DelegationChain_C_setPActivity);
		Operation_RequiredInterface_DelegationChain_C_setPActivity.setName("setPActivity");
		Operation_RequiredInterface_DelegationChain_C_setPActivity.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_C_setPActivity.addOwnedParameter(Operation_RequiredInterface_DelegationChain_C_setPActivity_v);
		Operation_RequiredInterface_DelegationChain_C_setPActivity.addNode(Operation_RequiredInterface_DelegationChain_C_setPActivity_this);
		Operation_RequiredInterface_DelegationChain_C_setPActivity.addNode(Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q);
		Operation_RequiredInterface_DelegationChain_C_setPActivity.addNode(Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode);
		Operation_RequiredInterface_DelegationChain_C_setPActivity.addEdge(Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15);
		Operation_RequiredInterface_DelegationChain_C_setPActivity.addEdge(Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25);
		// Activity Operation_RequiredInterface_DelegationChain_B::setPActivity
		addToElementRepository("setPActivity", Operation_RequiredInterface_DelegationChain_B_setPActivity);
		Operation_RequiredInterface_DelegationChain_B_setPActivity.setName("setPActivity");
		Operation_RequiredInterface_DelegationChain_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_B_setPActivity.addOwnedParameter(Operation_RequiredInterface_DelegationChain_B_setPActivity_v);
		Operation_RequiredInterface_DelegationChain_B_setPActivity.addNode(Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode);
		Operation_RequiredInterface_DelegationChain_B_setPActivity.addNode(Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p);
		Operation_RequiredInterface_DelegationChain_B_setPActivity.addNode(Operation_RequiredInterface_DelegationChain_B_setPActivity_this);
		Operation_RequiredInterface_DelegationChain_B_setPActivity.addEdge(Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0);
		Operation_RequiredInterface_DelegationChain_B_setPActivity.addEdge(Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3);
		// Activity Operation_RequiredInterface_DelegationChain_A::setPActivity
		addToElementRepository("setPActivity", Operation_RequiredInterface_DelegationChain_A_setPActivity);
		Operation_RequiredInterface_DelegationChain_A_setPActivity.setName("setPActivity");
		Operation_RequiredInterface_DelegationChain_A_setPActivity.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_A_setPActivity.addOwnedParameter(Operation_RequiredInterface_DelegationChain_A_setPActivity_v);
		Operation_RequiredInterface_DelegationChain_A_setPActivity.addNode(Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode);
		Operation_RequiredInterface_DelegationChain_A_setPActivity.addNode(Operation_RequiredInterface_DelegationChain_A_setPActivity_this);
		Operation_RequiredInterface_DelegationChain_A_setPActivity.addNode(Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q);
		Operation_RequiredInterface_DelegationChain_A_setPActivity.addEdge(Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38);
		Operation_RequiredInterface_DelegationChain_A_setPActivity.addEdge(Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41);
		// Activity Operation_RequiredInterface_DelegationChain::main
		addToElementRepository("main", Operation_RequiredInterface_DelegationChain_main);
		Operation_RequiredInterface_DelegationChain_main.setName("main");
		Operation_RequiredInterface_DelegationChain_main.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main.addOwnedBehavior(Operation_RequiredInterface_DelegationChain_main_testP);
		Operation_RequiredInterface_DelegationChain_main.addNode(Operation_RequiredInterface_DelegationChain_main_Call_setP_);
		Operation_RequiredInterface_DelegationChain_main.addNode(Operation_RequiredInterface_DelegationChain_main_Read_e_c);
		Operation_RequiredInterface_DelegationChain_main.addNode(Operation_RequiredInterface_DelegationChain_main_Read_b_p);
		Operation_RequiredInterface_DelegationChain_main.addNode(Operation_RequiredInterface_DelegationChain_main_Fork_d);
		Operation_RequiredInterface_DelegationChain_main.addNode(Operation_RequiredInterface_DelegationChain_main_Read_a_b);
		Operation_RequiredInterface_DelegationChain_main.addNode(Operation_RequiredInterface_DelegationChain_main_Read_d_e);
		Operation_RequiredInterface_DelegationChain_main.addNode(Operation_RequiredInterface_DelegationChain_main_D_);
		Operation_RequiredInterface_DelegationChain_main.addNode(Operation_RequiredInterface_DelegationChain_main_Value_4);
		Operation_RequiredInterface_DelegationChain_main.addNode(Operation_RequiredInterface_DelegationChain_main_Create_D);
		Operation_RequiredInterface_DelegationChain_main.addNode(Operation_RequiredInterface_DelegationChain_main_Read_d_a);
		Operation_RequiredInterface_DelegationChain_main.addNode(Operation_RequiredInterface_DelegationChain_main_Call_testP);
		Operation_RequiredInterface_DelegationChain_main.addEdge(Operation_RequiredInterface_DelegationChain_main_ObjectFlow90);
		Operation_RequiredInterface_DelegationChain_main.addEdge(Operation_RequiredInterface_DelegationChain_main_ObjectFlow65);
		Operation_RequiredInterface_DelegationChain_main.addEdge(Operation_RequiredInterface_DelegationChain_main_ObjectFlow97);
		Operation_RequiredInterface_DelegationChain_main.addEdge(Operation_RequiredInterface_DelegationChain_main_ObjectFlow68);
		Operation_RequiredInterface_DelegationChain_main.addEdge(Operation_RequiredInterface_DelegationChain_main_ObjectFlow71);
		Operation_RequiredInterface_DelegationChain_main.addEdge(Operation_RequiredInterface_DelegationChain_main_ObjectFlow105);
		Operation_RequiredInterface_DelegationChain_main.addEdge(Operation_RequiredInterface_DelegationChain_main_ControlFlow77);
		Operation_RequiredInterface_DelegationChain_main.addEdge(Operation_RequiredInterface_DelegationChain_main_ObjectFlow80);
		Operation_RequiredInterface_DelegationChain_main.addEdge(Operation_RequiredInterface_DelegationChain_main_ObjectFlow112);
		Operation_RequiredInterface_DelegationChain_main.addEdge(Operation_RequiredInterface_DelegationChain_main_ObjectFlow115);
		Operation_RequiredInterface_DelegationChain_main.addEdge(Operation_RequiredInterface_DelegationChain_main_ObjectFlow118);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode Operation_RequiredInterface_DelegationChain_C_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode.setName("vParameterNode");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode.setParameter(Operation_RequiredInterface_DelegationChain_C_setPActivity_v);
		// ActivityParameterNode Operation_RequiredInterface_DelegationChain_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode.setName("vParameterNode");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode.setParameter(Operation_RequiredInterface_DelegationChain_B_setPActivity_v);
		// ActivityParameterNode Operation_RequiredInterface_DelegationChain_A_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode.setName("vParameterNode");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode.setParameter(Operation_RequiredInterface_DelegationChain_A_setPActivity_v);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction Operation_RequiredInterface_DelegationChain_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p.setName("Set this.p");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p.setStructuralFeature(Operation_RequiredInterface_DelegationChain_B_p);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p.setObject(Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p.setValue(Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p.setResult(Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p.setIsReplaceAll(true);
	}

	private void initializeAssociation_Instances()
	{
		// Association Operation_RequiredInterface_DelegationChain::R
		addToElementRepository("R", Operation_RequiredInterface_DelegationChain_R);
		Operation_RequiredInterface_DelegationChain_R.setName("R");
		Operation_RequiredInterface_DelegationChain_R.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_R.addOwnedEnd(Operation_RequiredInterface_DelegationChain_R_x);
		Operation_RequiredInterface_DelegationChain_R.addOwnedEnd(Operation_RequiredInterface_DelegationChain_R_y);
		// Association Operation_RequiredInterface_DelegationChain::S
		addToElementRepository("S", Operation_RequiredInterface_DelegationChain_S);
		Operation_RequiredInterface_DelegationChain_S.setName("S");
		Operation_RequiredInterface_DelegationChain_S.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_S.addOwnedEnd(Operation_RequiredInterface_DelegationChain_S_x);
		Operation_RequiredInterface_DelegationChain_S.addOwnedEnd(Operation_RequiredInterface_DelegationChain_S_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction Operation_RequiredInterface_DelegationChain_main::Call testP
		addToElementRepository("Call testP", Operation_RequiredInterface_DelegationChain_main_Call_testP);
		Operation_RequiredInterface_DelegationChain_main_Call_testP.setName("Call testP");
		Operation_RequiredInterface_DelegationChain_main_Call_testP.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_testP.setBehavior(Operation_RequiredInterface_DelegationChain_main_testP);
		Operation_RequiredInterface_DelegationChain_main_Call_testP.addArgument(Operation_RequiredInterface_DelegationChain_main_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction Operation_RequiredInterface_DelegationChain_main::Call setP()
		addToElementRepository("Call setP()", Operation_RequiredInterface_DelegationChain_main_Call_setP_);
		Operation_RequiredInterface_DelegationChain_main_Call_setP_.setName("Call setP()");
		Operation_RequiredInterface_DelegationChain_main_Call_setP_.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_setP_.setOperation(Operation_RequiredInterface_DelegationChain_C_setP_Integer);
		Operation_RequiredInterface_DelegationChain_main_Call_setP_.setTarget(Operation_RequiredInterface_DelegationChain_main_Call_setP__target);
		Operation_RequiredInterface_DelegationChain_main_Call_setP_.addArgument(Operation_RequiredInterface_DelegationChain_main_Call_setP__v);
		// CallOperationAction Operation_RequiredInterface_DelegationChain_C_setPActivity::Call I::setP on q
		addToElementRepository("Call I::setP on q", Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q.setName("Call I::setP on q");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q.setOnPort(Operation_RequiredInterface_DelegationChain_C_q);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q.setOperation(Operation_RequiredInterface_DelegationChain_I_setP_Integer);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q.setTarget(Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q.addArgument(Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v);
		// CallOperationAction Operation_RequiredInterface_DelegationChain_main::D()
		addToElementRepository("D()", Operation_RequiredInterface_DelegationChain_main_D_);
		Operation_RequiredInterface_DelegationChain_main_D_.setName("D()");
		Operation_RequiredInterface_DelegationChain_main_D_.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_D_.addResult(Operation_RequiredInterface_DelegationChain_main_D__result);
		Operation_RequiredInterface_DelegationChain_main_D_.setOperation(Operation_RequiredInterface_DelegationChain_D_D_D);
		Operation_RequiredInterface_DelegationChain_main_D_.setTarget(Operation_RequiredInterface_DelegationChain_main_D__target);
		// CallOperationAction Operation_RequiredInterface_DelegationChain_A_setPActivity::Call I::setP on q
		addToElementRepository("Call I::setP on q", Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q.setName("Call I::setP on q");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q.setOnPort(Operation_RequiredInterface_DelegationChain_A_q);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q.setOperation(Operation_RequiredInterface_DelegationChain_I_setP_Integer);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q.setTarget(Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q.addArgument(Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v);
	}

	private void initializeClass_Instances()
	{
		// Class Operation_RequiredInterface_DelegationChain::D
		addToElementRepository("D", Operation_RequiredInterface_DelegationChain_D);
		Operation_RequiredInterface_DelegationChain_D.setName("D");
		Operation_RequiredInterface_DelegationChain_D.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_D.addOwnedAttribute(Operation_RequiredInterface_DelegationChain_D_e);
		Operation_RequiredInterface_DelegationChain_D.addOwnedAttribute(Operation_RequiredInterface_DelegationChain_D_a);
		
		Operation_RequiredInterface_DelegationChain_D.addOwnedConnector(Operation_RequiredInterface_DelegationChain_D_s);
		Operation_RequiredInterface_DelegationChain_D.addOwnedOperation(Operation_RequiredInterface_DelegationChain_D_D_D);
		// Class Operation_RequiredInterface_DelegationChain::IImpl
		addToElementRepository("IImpl", Operation_RequiredInterface_DelegationChain_IImpl);
		Operation_RequiredInterface_DelegationChain_IImpl.setName("IImpl");
		Operation_RequiredInterface_DelegationChain_IImpl.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_IImpl.addInterfaceRealization(Operation_RequiredInterface_DelegationChain_IImpl_IRealization);
		
		Operation_RequiredInterface_DelegationChain_IImpl.addOwnedOperation(Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer);
		// Class Operation_RequiredInterface_DelegationChain::B
		addToElementRepository("B", Operation_RequiredInterface_DelegationChain_B);
		Operation_RequiredInterface_DelegationChain_B.setName("B");
		Operation_RequiredInterface_DelegationChain_B.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_B.addOwnedAttribute(Operation_RequiredInterface_DelegationChain_B_p);
		Operation_RequiredInterface_DelegationChain_B.addOwnedBehavior(Operation_RequiredInterface_DelegationChain_B_setPActivity);
		Operation_RequiredInterface_DelegationChain_B.addInterfaceRealization(Operation_RequiredInterface_DelegationChain_B_IRealization);
		
		Operation_RequiredInterface_DelegationChain_B.addOwnedOperation(Operation_RequiredInterface_DelegationChain_B_setP_Integer);
		// Class Operation_RequiredInterface_DelegationChain::E
		addToElementRepository("E", Operation_RequiredInterface_DelegationChain_E);
		Operation_RequiredInterface_DelegationChain_E.setName("E");
		Operation_RequiredInterface_DelegationChain_E.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_E.addOwnedAttribute(Operation_RequiredInterface_DelegationChain_E_q);
		Operation_RequiredInterface_DelegationChain_E.addOwnedAttribute(Operation_RequiredInterface_DelegationChain_E_c);
		
		Operation_RequiredInterface_DelegationChain_E.addOwnedConnector(Operation_RequiredInterface_DelegationChain_E_s);
		// Class Operation_RequiredInterface_DelegationChain::A
		addToElementRepository("A", Operation_RequiredInterface_DelegationChain_A);
		Operation_RequiredInterface_DelegationChain_A.setName("A");
		Operation_RequiredInterface_DelegationChain_A.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_A.addOwnedAttribute(Operation_RequiredInterface_DelegationChain_A_q);
		Operation_RequiredInterface_DelegationChain_A.addOwnedAttribute(Operation_RequiredInterface_DelegationChain_A_b);
		Operation_RequiredInterface_DelegationChain_A.addOwnedBehavior(Operation_RequiredInterface_DelegationChain_A_setPActivity);
		Operation_RequiredInterface_DelegationChain_A.addOwnedConnector(Operation_RequiredInterface_DelegationChain_A_r);
		Operation_RequiredInterface_DelegationChain_A.addOwnedOperation(Operation_RequiredInterface_DelegationChain_A_setP_Integer);
		// Class Operation_RequiredInterface_DelegationChain::C
		addToElementRepository("C", Operation_RequiredInterface_DelegationChain_C);
		Operation_RequiredInterface_DelegationChain_C.setName("C");
		Operation_RequiredInterface_DelegationChain_C.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_C.addOwnedAttribute(Operation_RequiredInterface_DelegationChain_C_q);
		Operation_RequiredInterface_DelegationChain_C.addOwnedBehavior(Operation_RequiredInterface_DelegationChain_C_setPActivity);
		Operation_RequiredInterface_DelegationChain_C.addInterfaceRealization(Operation_RequiredInterface_DelegationChain_C_IRealization);
		
		Operation_RequiredInterface_DelegationChain_C.addOwnedOperation(Operation_RequiredInterface_DelegationChain_C_setP_Integer);
	}

	private void initializeComment_Instances()
	{
		// Comment Operation_RequiredInterface_DelegationChain::Comment29
		addToElementRepository("Comment29", Operation_RequiredInterface_DelegationChain_Comment29);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment Operation_RequiredInterface_DelegationChain::Comment31
		addToElementRepository("Comment31", Operation_RequiredInterface_DelegationChain_Comment31);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector Operation_RequiredInterface_DelegationChain_A::r
		addToElementRepository("r", Operation_RequiredInterface_DelegationChain_A_r);
		Operation_RequiredInterface_DelegationChain_A_r.setName("r");
		Operation_RequiredInterface_DelegationChain_A_r.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_r.addEnd(Operation_RequiredInterface_DelegationChain_A_r_ConnectorEnd36);
		Operation_RequiredInterface_DelegationChain_A_r.addEnd(Operation_RequiredInterface_DelegationChain_A_r_ConnectorEnd37);
		Operation_RequiredInterface_DelegationChain_A_r.setType(Operation_RequiredInterface_DelegationChain_R);
		// Connector Operation_RequiredInterface_DelegationChain_D::s
		addToElementRepository("s", Operation_RequiredInterface_DelegationChain_D_s);
		Operation_RequiredInterface_DelegationChain_D_s.setName("s");
		Operation_RequiredInterface_DelegationChain_D_s.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_D_s.addEnd(Operation_RequiredInterface_DelegationChain_D_s_ConnectorEnd32);
		Operation_RequiredInterface_DelegationChain_D_s.addEnd(Operation_RequiredInterface_DelegationChain_D_s_ConnectorEnd33);
		Operation_RequiredInterface_DelegationChain_D_s.setType(Operation_RequiredInterface_DelegationChain_S);
		// Connector Operation_RequiredInterface_DelegationChain_E::s
		addToElementRepository("s", Operation_RequiredInterface_DelegationChain_E_s);
		Operation_RequiredInterface_DelegationChain_E_s.setName("s");
		Operation_RequiredInterface_DelegationChain_E_s.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_E_s.addEnd(Operation_RequiredInterface_DelegationChain_E_s_ConnectorEnd34);
		Operation_RequiredInterface_DelegationChain_E_s.addEnd(Operation_RequiredInterface_DelegationChain_E_s_ConnectorEnd35);
		Operation_RequiredInterface_DelegationChain_E_s.setType(Operation_RequiredInterface_DelegationChain_S);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd Operation_RequiredInterface_DelegationChain_D_s::ConnectorEnd32
		addToElementRepository("ConnectorEnd32", Operation_RequiredInterface_DelegationChain_D_s_ConnectorEnd32);
		Operation_RequiredInterface_DelegationChain_D_s_ConnectorEnd32.setRole(Operation_RequiredInterface_DelegationChain_E_q);
		Operation_RequiredInterface_DelegationChain_D_s_ConnectorEnd32.setPartWithPort(Operation_RequiredInterface_DelegationChain_D_e);
		// ConnectorEnd Operation_RequiredInterface_DelegationChain_A_r::ConnectorEnd36
		addToElementRepository("ConnectorEnd36", Operation_RequiredInterface_DelegationChain_A_r_ConnectorEnd36);
		Operation_RequiredInterface_DelegationChain_A_r_ConnectorEnd36.setRole(Operation_RequiredInterface_DelegationChain_A_q);
		// ConnectorEnd Operation_RequiredInterface_DelegationChain_D_s::ConnectorEnd33
		addToElementRepository("ConnectorEnd33", Operation_RequiredInterface_DelegationChain_D_s_ConnectorEnd33);
		Operation_RequiredInterface_DelegationChain_D_s_ConnectorEnd33.setRole(Operation_RequiredInterface_DelegationChain_A_q);
		Operation_RequiredInterface_DelegationChain_D_s_ConnectorEnd33.setPartWithPort(Operation_RequiredInterface_DelegationChain_D_a);
		// ConnectorEnd Operation_RequiredInterface_DelegationChain_A_r::ConnectorEnd37
		addToElementRepository("ConnectorEnd37", Operation_RequiredInterface_DelegationChain_A_r_ConnectorEnd37);
		Operation_RequiredInterface_DelegationChain_A_r_ConnectorEnd37.setRole(Operation_RequiredInterface_DelegationChain_A_b);
		// ConnectorEnd Operation_RequiredInterface_DelegationChain_E_s::ConnectorEnd34
		addToElementRepository("ConnectorEnd34", Operation_RequiredInterface_DelegationChain_E_s_ConnectorEnd34);
		Operation_RequiredInterface_DelegationChain_E_s_ConnectorEnd34.setRole(Operation_RequiredInterface_DelegationChain_C_q);
		Operation_RequiredInterface_DelegationChain_E_s_ConnectorEnd34.setPartWithPort(Operation_RequiredInterface_DelegationChain_E_c);
		// ConnectorEnd Operation_RequiredInterface_DelegationChain_E_s::ConnectorEnd35
		addToElementRepository("ConnectorEnd35", Operation_RequiredInterface_DelegationChain_E_s_ConnectorEnd35);
		Operation_RequiredInterface_DelegationChain_E_s_ConnectorEnd35.setRole(Operation_RequiredInterface_DelegationChain_E_q);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow Operation_RequiredInterface_DelegationChain_main::ControlFlow77
		addToElementRepository("ControlFlow77", Operation_RequiredInterface_DelegationChain_main_ControlFlow77);
		Operation_RequiredInterface_DelegationChain_main_ControlFlow77.setName("ControlFlow77");
		Operation_RequiredInterface_DelegationChain_main_ControlFlow77.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_ControlFlow77.setSource(Operation_RequiredInterface_DelegationChain_main_Call_setP_);
		Operation_RequiredInterface_DelegationChain_main_ControlFlow77.setTarget(Operation_RequiredInterface_DelegationChain_main_Read_d_a);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction Operation_RequiredInterface_DelegationChain_main::Create D
		addToElementRepository("Create D", Operation_RequiredInterface_DelegationChain_main_Create_D);
		Operation_RequiredInterface_DelegationChain_main_Create_D.setName("Create D");
		Operation_RequiredInterface_DelegationChain_main_Create_D.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Create_D.setClassifier(Operation_RequiredInterface_DelegationChain_D);
		Operation_RequiredInterface_DelegationChain_main_Create_D.setResult(Operation_RequiredInterface_DelegationChain_main_Create_D_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode Operation_RequiredInterface_DelegationChain_main::Fork d
		addToElementRepository("Fork d", Operation_RequiredInterface_DelegationChain_main_Fork_d);
		Operation_RequiredInterface_DelegationChain_main_Fork_d.setName("Fork d");
		Operation_RequiredInterface_DelegationChain_main_Fork_d.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior Operation_RequiredInterface_DelegationChain_main::testP
		addToElementRepository("testP", Operation_RequiredInterface_DelegationChain_main_testP);
		Operation_RequiredInterface_DelegationChain_main_testP.setName("testP");
		Operation_RequiredInterface_DelegationChain_main_testP.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_testP.addOwnedParameter(Operation_RequiredInterface_DelegationChain_main_testP_p);
		Operation_RequiredInterface_DelegationChain_main_testP.addLanguage("Java");
		Operation_RequiredInterface_DelegationChain_main_testP.addLanguage("Import");
		Operation_RequiredInterface_DelegationChain_main_testP.addBody("System.out.println(\"Asserting d.a.b.p == 4\");  	// Test parameter p 	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument p = \" + p); 	 	System.out.println(\"d.a.b.p == \" + p); 	System.out.print(\"Invocation forwarded out of e through q: \");  	if(p == 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		Operation_RequiredInterface_DelegationChain_main_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin Operation_RequiredInterface_DelegationChain_main_Read e.c::object
		addToElementRepository("object", Operation_RequiredInterface_DelegationChain_main_Read_e_c_object);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_object.setName("object");
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_object.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_object.setType(Operation_RequiredInterface_DelegationChain_E);
		// InputPin Operation_RequiredInterface_DelegationChain_A_setPActivity_Call I::setP on q::v
		addToElementRepository("v", Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v.setName("v");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_RequiredInterface_DelegationChain_main_D()::target
		addToElementRepository("target", Operation_RequiredInterface_DelegationChain_main_D__target);
		Operation_RequiredInterface_DelegationChain_main_D__target.setName("target");
		Operation_RequiredInterface_DelegationChain_main_D__target.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_D__target.setType(Operation_RequiredInterface_DelegationChain_D);
		// InputPin Operation_RequiredInterface_DelegationChain_main_Read b.p::object
		addToElementRepository("object", Operation_RequiredInterface_DelegationChain_main_Read_b_p_object);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_object.setName("object");
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_object.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_object.setType(Operation_RequiredInterface_DelegationChain_B);
		// InputPin Operation_RequiredInterface_DelegationChain_C_setPActivity_Call I::setP on q::target
		addToElementRepository("target", Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target.setName("target");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target.setType(Operation_RequiredInterface_DelegationChain_C);
		// InputPin Operation_RequiredInterface_DelegationChain_main_Call setP()::target
		addToElementRepository("target", Operation_RequiredInterface_DelegationChain_main_Call_setP__target);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__target.setName("target");
		Operation_RequiredInterface_DelegationChain_main_Call_setP__target.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__target.setType(Operation_RequiredInterface_DelegationChain_C);
		// InputPin Operation_RequiredInterface_DelegationChain_main_Read d.e::object
		addToElementRepository("object", Operation_RequiredInterface_DelegationChain_main_Read_d_e_object);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_object.setName("object");
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_object.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_object.setType(Operation_RequiredInterface_DelegationChain_D);
		// InputPin Operation_RequiredInterface_DelegationChain_main_Read a.b::object
		addToElementRepository("object", Operation_RequiredInterface_DelegationChain_main_Read_a_b_object);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_object.setName("object");
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_object.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_object.setType(Operation_RequiredInterface_DelegationChain_A);
		// InputPin Operation_RequiredInterface_DelegationChain_B_setPActivity_Set this.p::value
		addToElementRepository("value", Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value.setName("value");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_RequiredInterface_DelegationChain_main_Call setP()::v
		addToElementRepository("v", Operation_RequiredInterface_DelegationChain_main_Call_setP__v);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__v.setName("v");
		Operation_RequiredInterface_DelegationChain_main_Call_setP__v.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_RequiredInterface_DelegationChain_A_setPActivity_Call I::setP on q::target
		addToElementRepository("target", Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target.setName("target");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target.setVisibility(VisibilityKind.public_);
		// InputPin Operation_RequiredInterface_DelegationChain_main_Call testP::p
		addToElementRepository("p", Operation_RequiredInterface_DelegationChain_main_Call_testP_p);
		Operation_RequiredInterface_DelegationChain_main_Call_testP_p.setName("p");
		Operation_RequiredInterface_DelegationChain_main_Call_testP_p.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_RequiredInterface_DelegationChain_B_setPActivity_Set this.p::object
		addToElementRepository("object", Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object.setName("object");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object.setType(Operation_RequiredInterface_DelegationChain_B);
		// InputPin Operation_RequiredInterface_DelegationChain_main_Read d.a::object
		addToElementRepository("object", Operation_RequiredInterface_DelegationChain_main_Read_d_a_object);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_object.setName("object");
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_object.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_object.setType(Operation_RequiredInterface_DelegationChain_D);
		// InputPin Operation_RequiredInterface_DelegationChain_C_setPActivity_Call I::setP on q::v
		addToElementRepository("v", Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v.setName("v");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeInterface_Instances()
	{
		// Interface Operation_RequiredInterface_DelegationChain::I
		addToElementRepository("I", Operation_RequiredInterface_DelegationChain_I);
		Operation_RequiredInterface_DelegationChain_I.setName("I");
		Operation_RequiredInterface_DelegationChain_I.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_I.addOwnedOperation(Operation_RequiredInterface_DelegationChain_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization Operation_RequiredInterface_DelegationChain_B::IRealization
		addToElementRepository("IRealization", Operation_RequiredInterface_DelegationChain_B_IRealization);
		Operation_RequiredInterface_DelegationChain_B_IRealization.setName("IRealization");
		Operation_RequiredInterface_DelegationChain_B_IRealization.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_IRealization.setContract(Operation_RequiredInterface_DelegationChain_I);
		// InterfaceRealization Operation_RequiredInterface_DelegationChain_C::IRealization
		addToElementRepository("IRealization", Operation_RequiredInterface_DelegationChain_C_IRealization);
		Operation_RequiredInterface_DelegationChain_C_IRealization.setName("IRealization");
		Operation_RequiredInterface_DelegationChain_C_IRealization.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_IRealization.setContract(Operation_RequiredInterface_DelegationChain_I);
		// InterfaceRealization Operation_RequiredInterface_DelegationChain_IImpl::IRealization
		addToElementRepository("IRealization", Operation_RequiredInterface_DelegationChain_IImpl_IRealization);
		Operation_RequiredInterface_DelegationChain_IImpl_IRealization.setName("IRealization");
		Operation_RequiredInterface_DelegationChain_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_IImpl_IRealization.setContract(Operation_RequiredInterface_DelegationChain_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow118::LiteralBoolean119
		addToElementRepository("LiteralBoolean119", Operation_RequiredInterface_DelegationChain_main_ObjectFlow118_LiteralBoolean119);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow118_LiteralBoolean119.setName("LiteralBoolean119");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow118_LiteralBoolean119.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow118_LiteralBoolean119.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41::LiteralBoolean42
		addToElementRepository("LiteralBoolean42", Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41_LiteralBoolean42);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41_LiteralBoolean42.setName("LiteralBoolean42");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41_LiteralBoolean42.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41_LiteralBoolean42.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25::LiteralBoolean27
		addToElementRepository("LiteralBoolean27", Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25_LiteralBoolean27);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25_LiteralBoolean27.setName("LiteralBoolean27");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25_LiteralBoolean27.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25_LiteralBoolean27.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38::LiteralBoolean40
		addToElementRepository("LiteralBoolean40", Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38_LiteralBoolean40);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38_LiteralBoolean40.setName("LiteralBoolean40");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38_LiteralBoolean40.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38_LiteralBoolean40.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow112::LiteralBoolean114
		addToElementRepository("LiteralBoolean114", Operation_RequiredInterface_DelegationChain_main_ObjectFlow112_LiteralBoolean114);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow112_LiteralBoolean114.setName("LiteralBoolean114");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow112_LiteralBoolean114.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow112_LiteralBoolean114.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow65::LiteralBoolean67
		addToElementRepository("LiteralBoolean67", Operation_RequiredInterface_DelegationChain_main_ObjectFlow65_LiteralBoolean67);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow65_LiteralBoolean67.setName("LiteralBoolean67");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow65_LiteralBoolean67.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow65_LiteralBoolean67.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow115::LiteralBoolean116
		addToElementRepository("LiteralBoolean116", Operation_RequiredInterface_DelegationChain_main_ObjectFlow115_LiteralBoolean116);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow115_LiteralBoolean116.setName("LiteralBoolean116");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow115_LiteralBoolean116.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow115_LiteralBoolean116.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow97::LiteralBoolean98
		addToElementRepository("LiteralBoolean98", Operation_RequiredInterface_DelegationChain_main_ObjectFlow97_LiteralBoolean98);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow97_LiteralBoolean98.setName("LiteralBoolean98");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow97_LiteralBoolean98.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow97_LiteralBoolean98.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0::LiteralBoolean1
		addToElementRepository("LiteralBoolean1", Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0_LiteralBoolean1);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0_LiteralBoolean1.setName("LiteralBoolean1");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0_LiteralBoolean1.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0_LiteralBoolean1.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow105::LiteralBoolean106
		addToElementRepository("LiteralBoolean106", Operation_RequiredInterface_DelegationChain_main_ObjectFlow105_LiteralBoolean106);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow105_LiteralBoolean106.setName("LiteralBoolean106");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow105_LiteralBoolean106.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow105_LiteralBoolean106.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow80::LiteralBoolean81
		addToElementRepository("LiteralBoolean81", Operation_RequiredInterface_DelegationChain_main_ObjectFlow80_LiteralBoolean81);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow80_LiteralBoolean81.setName("LiteralBoolean81");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow80_LiteralBoolean81.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow80_LiteralBoolean81.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow71::LiteralBoolean72
		addToElementRepository("LiteralBoolean72", Operation_RequiredInterface_DelegationChain_main_ObjectFlow71_LiteralBoolean72);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow71_LiteralBoolean72.setName("LiteralBoolean72");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow71_LiteralBoolean72.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow71_LiteralBoolean72.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow68::LiteralBoolean70
		addToElementRepository("LiteralBoolean70", Operation_RequiredInterface_DelegationChain_main_ObjectFlow68_LiteralBoolean70);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow68_LiteralBoolean70.setName("LiteralBoolean70");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow68_LiteralBoolean70.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow68_LiteralBoolean70.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3::LiteralBoolean5
		addToElementRepository("LiteralBoolean5", Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3_LiteralBoolean5);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3_LiteralBoolean5.setName("LiteralBoolean5");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3_LiteralBoolean5.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3_LiteralBoolean5.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_main_ObjectFlow90::LiteralBoolean91
		addToElementRepository("LiteralBoolean91", Operation_RequiredInterface_DelegationChain_main_ObjectFlow90_LiteralBoolean91);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow90_LiteralBoolean91.setName("LiteralBoolean91");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow90_LiteralBoolean91.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow90_LiteralBoolean91.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15::LiteralBoolean16
		addToElementRepository("LiteralBoolean16", Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15_LiteralBoolean16);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15_LiteralBoolean16.setName("LiteralBoolean16");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15_LiteralBoolean16.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15_LiteralBoolean16.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Call setP()_target::LiteralInteger52
		addToElementRepository("LiteralInteger52", Operation_RequiredInterface_DelegationChain_main_Call_setP__target_LiteralInteger52);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__target_LiteralInteger52.setName("LiteralInteger52");
		Operation_RequiredInterface_DelegationChain_main_Call_setP__target_LiteralInteger52.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__target_LiteralInteger52.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_Set this.p_object::LiteralInteger9
		addToElementRepository("LiteralInteger9", Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object_LiteralInteger9);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object_LiteralInteger9.setName("LiteralInteger9");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object_LiteralInteger9.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object_LiteralInteger9.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read e.c_result::LiteralInteger60
		addToElementRepository("LiteralInteger60", Operation_RequiredInterface_DelegationChain_main_Read_e_c_result_LiteralInteger60);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_result_LiteralInteger60.setName("LiteralInteger60");
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_result_LiteralInteger60.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_result_LiteralInteger60.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow71::LiteralInteger73
		addToElementRepository("LiteralInteger73", Operation_RequiredInterface_DelegationChain_main_ObjectFlow71_LiteralInteger73);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow71_LiteralInteger73.setName("LiteralInteger73");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow71_LiteralInteger73.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow71_LiteralInteger73.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow80::LiteralInteger82
		addToElementRepository("LiteralInteger82", Operation_RequiredInterface_DelegationChain_main_ObjectFlow80_LiteralInteger82);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow80_LiteralInteger82.setName("LiteralInteger82");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow80_LiteralInteger82.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow80_LiteralInteger82.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_D()_result::LiteralInteger102
		addToElementRepository("LiteralInteger102", Operation_RequiredInterface_DelegationChain_main_D__result_LiteralInteger102);
		Operation_RequiredInterface_DelegationChain_main_D__result_LiteralInteger102.setName("LiteralInteger102");
		Operation_RequiredInterface_DelegationChain_main_D__result_LiteralInteger102.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_D__result_LiteralInteger102.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow118::LiteralInteger120
		addToElementRepository("LiteralInteger120", Operation_RequiredInterface_DelegationChain_main_ObjectFlow118_LiteralInteger120);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow118_LiteralInteger120.setName("LiteralInteger120");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow118_LiteralInteger120.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow118_LiteralInteger120.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow97::LiteralInteger99
		addToElementRepository("LiteralInteger99", Operation_RequiredInterface_DelegationChain_main_ObjectFlow97_LiteralInteger99);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow97_LiteralInteger99.setName("LiteralInteger99");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow97_LiteralInteger99.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow97_LiteralInteger99.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Value(4)_result::LiteralInteger74
		addToElementRepository("LiteralInteger74", Operation_RequiredInterface_DelegationChain_main_Value_4_result_LiteralInteger74);
		Operation_RequiredInterface_DelegationChain_main_Value_4_result_LiteralInteger74.setName("LiteralInteger74");
		Operation_RequiredInterface_DelegationChain_main_Value_4_result_LiteralInteger74.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Value_4_result_LiteralInteger74.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode::LiteralInteger28
		addToElementRepository("LiteralInteger28", Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode_LiteralInteger28);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode_LiteralInteger28.setName("LiteralInteger28");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode_LiteralInteger28.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode_LiteralInteger28.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read d.e_result::LiteralInteger96
		addToElementRepository("LiteralInteger96", Operation_RequiredInterface_DelegationChain_main_Read_d_e_result_LiteralInteger96);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_result_LiteralInteger96.setName("LiteralInteger96");
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_result_LiteralInteger96.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_result_LiteralInteger96.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0::LiteralInteger2
		addToElementRepository("LiteralInteger2", Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0_LiteralInteger2);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0_LiteralInteger2.setName("LiteralInteger2");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0_LiteralInteger2.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0_LiteralInteger2.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_D()_target::LiteralInteger104
		addToElementRepository("LiteralInteger104", Operation_RequiredInterface_DelegationChain_main_D__target_LiteralInteger104);
		Operation_RequiredInterface_DelegationChain_main_D__target_LiteralInteger104.setName("LiteralInteger104");
		Operation_RequiredInterface_DelegationChain_main_D__target_LiteralInteger104.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_D__target_LiteralInteger104.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow115::LiteralInteger117
		addToElementRepository("LiteralInteger117", Operation_RequiredInterface_DelegationChain_main_ObjectFlow115_LiteralInteger117);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow115_LiteralInteger117.setName("LiteralInteger117");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow115_LiteralInteger117.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow115_LiteralInteger117.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result::LiteralInteger14
		addToElementRepository("LiteralInteger14", Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result_LiteralInteger14);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result_LiteralInteger14.setName("LiteralInteger14");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result_LiteralInteger14.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result_LiteralInteger14.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read d.a_object::LiteralInteger110
		addToElementRepository("LiteralInteger110", Operation_RequiredInterface_DelegationChain_main_Read_d_a_object_LiteralInteger110);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_object_LiteralInteger110.setName("LiteralInteger110");
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_object_LiteralInteger110.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_object_LiteralInteger110.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_Call I::setP on q_v::LiteralInteger49
		addToElementRepository("LiteralInteger49", Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger49);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger49.setName("LiteralInteger49");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger49.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger49.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41::LiteralInteger43
		addToElementRepository("LiteralInteger43", Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41_LiteralInteger43);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41_LiteralInteger43.setName("LiteralInteger43");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41_LiteralInteger43.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41_LiteralInteger43.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_Call I::setP on q_target::LiteralInteger48
		addToElementRepository("LiteralInteger48", Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger48);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger48.setName("LiteralInteger48");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger48.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger48.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_Call I::setP on q_v::LiteralInteger51
		addToElementRepository("LiteralInteger51", Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger51);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger51.setName("LiteralInteger51");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger51.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger51.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read e.c_object::LiteralInteger57
		addToElementRepository("LiteralInteger57", Operation_RequiredInterface_DelegationChain_main_Read_e_c_object_LiteralInteger57);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_object_LiteralInteger57.setName("LiteralInteger57");
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_object_LiteralInteger57.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_object_LiteralInteger57.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read d.a_result::LiteralInteger108
		addToElementRepository("LiteralInteger108", Operation_RequiredInterface_DelegationChain_main_Read_d_a_result_LiteralInteger108);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_result_LiteralInteger108.setName("LiteralInteger108");
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_result_LiteralInteger108.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_result_LiteralInteger108.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow68::LiteralInteger69
		addToElementRepository("LiteralInteger69", Operation_RequiredInterface_DelegationChain_main_ObjectFlow68_LiteralInteger69);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow68_LiteralInteger69.setName("LiteralInteger69");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow68_LiteralInteger69.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow68_LiteralInteger69.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_Call I::setP on q_v::LiteralInteger23
		addToElementRepository("LiteralInteger23", Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger23);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger23.setName("LiteralInteger23");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger23.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger23.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38::LiteralInteger39
		addToElementRepository("LiteralInteger39", Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38_LiteralInteger39);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38_LiteralInteger39.setName("LiteralInteger39");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38_LiteralInteger39.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38_LiteralInteger39.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow112::LiteralInteger113
		addToElementRepository("LiteralInteger113", Operation_RequiredInterface_DelegationChain_main_ObjectFlow112_LiteralInteger113);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow112_LiteralInteger113.setName("LiteralInteger113");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow112_LiteralInteger113.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow112_LiteralInteger113.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Call setP()_v::LiteralInteger56
		addToElementRepository("LiteralInteger56", Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralInteger56);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralInteger56.setName("LiteralInteger56");
		Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralInteger56.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralInteger56.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Call testP_p::LiteralInteger83
		addToElementRepository("LiteralInteger83", Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralInteger83);
		Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralInteger83.setName("LiteralInteger83");
		Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralInteger83.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralInteger83.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3::LiteralInteger4
		addToElementRepository("LiteralInteger4", Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3_LiteralInteger4);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3_LiteralInteger4.setName("LiteralInteger4");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3_LiteralInteger4.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3_LiteralInteger4.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read d.e_object::LiteralInteger94
		addToElementRepository("LiteralInteger94", Operation_RequiredInterface_DelegationChain_main_Read_d_e_object_LiteralInteger94);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_object_LiteralInteger94.setName("LiteralInteger94");
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_object_LiteralInteger94.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_object_LiteralInteger94.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow105::LiteralInteger107
		addToElementRepository("LiteralInteger107", Operation_RequiredInterface_DelegationChain_main_ObjectFlow105_LiteralInteger107);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow105_LiteralInteger107.setName("LiteralInteger107");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow105_LiteralInteger107.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow105_LiteralInteger107.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode::LiteralInteger6
		addToElementRepository("LiteralInteger6", Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode_LiteralInteger6);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode_LiteralInteger6.setName("LiteralInteger6");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode_LiteralInteger6.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode_LiteralInteger6.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Value(4)::LiteralInteger76
		addToElementRepository("LiteralInteger76", Operation_RequiredInterface_DelegationChain_main_Value_4_LiteralInteger76);
		Operation_RequiredInterface_DelegationChain_main_Value_4_LiteralInteger76.setName("LiteralInteger76");
		Operation_RequiredInterface_DelegationChain_main_Value_4_LiteralInteger76.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Value_4_LiteralInteger76.setValue(4);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result::LiteralInteger18
		addToElementRepository("LiteralInteger18", Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result_LiteralInteger18);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result_LiteralInteger18.setName("LiteralInteger18");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result_LiteralInteger18.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result_LiteralInteger18.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read a.b_result::LiteralInteger63
		addToElementRepository("LiteralInteger63", Operation_RequiredInterface_DelegationChain_main_Read_a_b_result_LiteralInteger63);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_result_LiteralInteger63.setName("LiteralInteger63");
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_result_LiteralInteger63.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_result_LiteralInteger63.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_D()_result::LiteralInteger100
		addToElementRepository("LiteralInteger100", Operation_RequiredInterface_DelegationChain_main_D__result_LiteralInteger100);
		Operation_RequiredInterface_DelegationChain_main_D__result_LiteralInteger100.setName("LiteralInteger100");
		Operation_RequiredInterface_DelegationChain_main_D__result_LiteralInteger100.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_D__result_LiteralInteger100.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result::LiteralInteger46
		addToElementRepository("LiteralInteger46", Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result_LiteralInteger46);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result_LiteralInteger46.setName("LiteralInteger46");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result_LiteralInteger46.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result_LiteralInteger46.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Call testP_p::LiteralInteger85
		addToElementRepository("LiteralInteger85", Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralInteger85);
		Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralInteger85.setName("LiteralInteger85");
		Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralInteger85.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralInteger85.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read b.p_object::LiteralInteger89
		addToElementRepository("LiteralInteger89", Operation_RequiredInterface_DelegationChain_main_Read_b_p_object_LiteralInteger89);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_object_LiteralInteger89.setName("LiteralInteger89");
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_object_LiteralInteger89.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_object_LiteralInteger89.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Create D_result::LiteralInteger78
		addToElementRepository("LiteralInteger78", Operation_RequiredInterface_DelegationChain_main_Create_D_result_LiteralInteger78);
		Operation_RequiredInterface_DelegationChain_main_Create_D_result_LiteralInteger78.setName("LiteralInteger78");
		Operation_RequiredInterface_DelegationChain_main_Create_D_result_LiteralInteger78.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Create_D_result_LiteralInteger78.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode::LiteralInteger44
		addToElementRepository("LiteralInteger44", Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode_LiteralInteger44);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode_LiteralInteger44.setName("LiteralInteger44");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode_LiteralInteger44.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode_LiteralInteger44.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Call setP()_v::LiteralInteger55
		addToElementRepository("LiteralInteger55", Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralInteger55);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralInteger55.setName("LiteralInteger55");
		Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralInteger55.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralInteger55.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15::LiteralInteger17
		addToElementRepository("LiteralInteger17", Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15_LiteralInteger17);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15_LiteralInteger17.setName("LiteralInteger17");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15_LiteralInteger17.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15_LiteralInteger17.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_Call I::setP on q_target::LiteralInteger21
		addToElementRepository("LiteralInteger21", Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger21);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger21.setName("LiteralInteger21");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger21.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger21.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25::LiteralInteger26
		addToElementRepository("LiteralInteger26", Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25_LiteralInteger26);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25_LiteralInteger26.setName("LiteralInteger26");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25_LiteralInteger26.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25_LiteralInteger26.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read a.b_object::LiteralInteger61
		addToElementRepository("LiteralInteger61", Operation_RequiredInterface_DelegationChain_main_Read_a_b_object_LiteralInteger61);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_object_LiteralInteger61.setName("LiteralInteger61");
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_object_LiteralInteger61.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_object_LiteralInteger61.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow65::LiteralInteger66
		addToElementRepository("LiteralInteger66", Operation_RequiredInterface_DelegationChain_main_ObjectFlow65_LiteralInteger66);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow65_LiteralInteger66.setName("LiteralInteger66");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow65_LiteralInteger66.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow65_LiteralInteger66.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_Set this.p_result::LiteralInteger12
		addToElementRepository("LiteralInteger12", Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result_LiteralInteger12);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result_LiteralInteger12.setName("LiteralInteger12");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result_LiteralInteger12.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result_LiteralInteger12.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_Read b.p_result::LiteralInteger87
		addToElementRepository("LiteralInteger87", Operation_RequiredInterface_DelegationChain_main_Read_b_p_result_LiteralInteger87);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_result_LiteralInteger87.setName("LiteralInteger87");
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_result_LiteralInteger87.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_result_LiteralInteger87.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_B_setPActivity_Set this.p_value::LiteralInteger8
		addToElementRepository("LiteralInteger8", Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value_LiteralInteger8);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value_LiteralInteger8.setName("LiteralInteger8");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value_LiteralInteger8.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value_LiteralInteger8.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_main_ObjectFlow90::LiteralInteger92
		addToElementRepository("LiteralInteger92", Operation_RequiredInterface_DelegationChain_main_ObjectFlow90_LiteralInteger92);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow90_LiteralInteger92.setName("LiteralInteger92");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow90_LiteralInteger92.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow90_LiteralInteger92.setValue(1);
		// LiteralInteger Operation_RequiredInterface_DelegationChain_C_setPActivity_Call I::setP on q_v::LiteralInteger24
		addToElementRepository("LiteralInteger24", Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger24);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger24.setName("LiteralInteger24");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger24.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger24.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural11
		addToElementRepository("LiteralUnlimitedNatural11", Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural11);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural11.setName("LiteralUnlimitedNatural11");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural11.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural11.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Create D_result::LiteralUnlimitedNatural79
		addToElementRepository("LiteralUnlimitedNatural79", Operation_RequiredInterface_DelegationChain_main_Create_D_result_LiteralUnlimitedNatural79);
		Operation_RequiredInterface_DelegationChain_main_Create_D_result_LiteralUnlimitedNatural79.setName("LiteralUnlimitedNatural79");
		Operation_RequiredInterface_DelegationChain_main_Create_D_result_LiteralUnlimitedNatural79.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Create_D_result_LiteralUnlimitedNatural79.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read d.e_result::LiteralUnlimitedNatural95
		addToElementRepository("LiteralUnlimitedNatural95", Operation_RequiredInterface_DelegationChain_main_Read_d_e_result_LiteralUnlimitedNatural95);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_result_LiteralUnlimitedNatural95.setName("LiteralUnlimitedNatural95");
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_result_LiteralUnlimitedNatural95.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_result_LiteralUnlimitedNatural95.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read d.a_object::LiteralUnlimitedNatural111
		addToElementRepository("LiteralUnlimitedNatural111", Operation_RequiredInterface_DelegationChain_main_Read_d_a_object_LiteralUnlimitedNatural111);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_object_LiteralUnlimitedNatural111.setName("LiteralUnlimitedNatural111");
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_object_LiteralUnlimitedNatural111.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_object_LiteralUnlimitedNatural111.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Call testP_p::LiteralUnlimitedNatural84
		addToElementRepository("LiteralUnlimitedNatural84", Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralUnlimitedNatural84);
		Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralUnlimitedNatural84.setName("LiteralUnlimitedNatural84");
		Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralUnlimitedNatural84.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_testP_p_LiteralUnlimitedNatural84.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read a.b_object::LiteralUnlimitedNatural62
		addToElementRepository("LiteralUnlimitedNatural62", Operation_RequiredInterface_DelegationChain_main_Read_a_b_object_LiteralUnlimitedNatural62);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_object_LiteralUnlimitedNatural62.setName("LiteralUnlimitedNatural62");
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_object_LiteralUnlimitedNatural62.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_object_LiteralUnlimitedNatural62.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural10
		addToElementRepository("LiteralUnlimitedNatural10", Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10.setName("LiteralUnlimitedNatural10");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read e.c_result::LiteralUnlimitedNatural59
		addToElementRepository("LiteralUnlimitedNatural59", Operation_RequiredInterface_DelegationChain_main_Read_e_c_result_LiteralUnlimitedNatural59);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_result_LiteralUnlimitedNatural59.setName("LiteralUnlimitedNatural59");
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_result_LiteralUnlimitedNatural59.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_result_LiteralUnlimitedNatural59.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read b.p_result::LiteralUnlimitedNatural86
		addToElementRepository("LiteralUnlimitedNatural86", Operation_RequiredInterface_DelegationChain_main_Read_b_p_result_LiteralUnlimitedNatural86);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_result_LiteralUnlimitedNatural86.setName("LiteralUnlimitedNatural86");
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_result_LiteralUnlimitedNatural86.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_result_LiteralUnlimitedNatural86.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Call setP()_target::LiteralUnlimitedNatural53
		addToElementRepository("LiteralUnlimitedNatural53", Operation_RequiredInterface_DelegationChain_main_Call_setP__target_LiteralUnlimitedNatural53);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__target_LiteralUnlimitedNatural53.setName("LiteralUnlimitedNatural53");
		Operation_RequiredInterface_DelegationChain_main_Call_setP__target_LiteralUnlimitedNatural53.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__target_LiteralUnlimitedNatural53.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Value(4)_result::LiteralUnlimitedNatural75
		addToElementRepository("LiteralUnlimitedNatural75", Operation_RequiredInterface_DelegationChain_main_Value_4_result_LiteralUnlimitedNatural75);
		Operation_RequiredInterface_DelegationChain_main_Value_4_result_LiteralUnlimitedNatural75.setName("LiteralUnlimitedNatural75");
		Operation_RequiredInterface_DelegationChain_main_Value_4_result_LiteralUnlimitedNatural75.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Value_4_result_LiteralUnlimitedNatural75.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_C_setPActivity_Call I::setP on q_v::LiteralUnlimitedNatural22
		addToElementRepository("LiteralUnlimitedNatural22", Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural22);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural22.setName("LiteralUnlimitedNatural22");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural22.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural22.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read d.a_result::LiteralUnlimitedNatural109
		addToElementRepository("LiteralUnlimitedNatural109", Operation_RequiredInterface_DelegationChain_main_Read_d_a_result_LiteralUnlimitedNatural109);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_result_LiteralUnlimitedNatural109.setName("LiteralUnlimitedNatural109");
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_result_LiteralUnlimitedNatural109.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_result_LiteralUnlimitedNatural109.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read b.p_object::LiteralUnlimitedNatural88
		addToElementRepository("LiteralUnlimitedNatural88", Operation_RequiredInterface_DelegationChain_main_Read_b_p_object_LiteralUnlimitedNatural88);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_object_LiteralUnlimitedNatural88.setName("LiteralUnlimitedNatural88");
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_object_LiteralUnlimitedNatural88.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_object_LiteralUnlimitedNatural88.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_C_setPActivity_Call I::setP on q_target::LiteralUnlimitedNatural20
		addToElementRepository("LiteralUnlimitedNatural20", Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural20);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural20.setName("LiteralUnlimitedNatural20");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural20.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural20.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Call setP()_v::LiteralUnlimitedNatural54
		addToElementRepository("LiteralUnlimitedNatural54", Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralUnlimitedNatural54);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralUnlimitedNatural54.setName("LiteralUnlimitedNatural54");
		Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralUnlimitedNatural54.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Call_setP__v_LiteralUnlimitedNatural54.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_A_setPActivity_Call I::setP on q_target::LiteralUnlimitedNatural47
		addToElementRepository("LiteralUnlimitedNatural47", Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural47);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural47.setName("LiteralUnlimitedNatural47");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural47.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural47.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read e.c_object::LiteralUnlimitedNatural58
		addToElementRepository("LiteralUnlimitedNatural58", Operation_RequiredInterface_DelegationChain_main_Read_e_c_object_LiteralUnlimitedNatural58);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_object_LiteralUnlimitedNatural58.setName("LiteralUnlimitedNatural58");
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_object_LiteralUnlimitedNatural58.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_object_LiteralUnlimitedNatural58.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result::LiteralUnlimitedNatural13
		addToElementRepository("LiteralUnlimitedNatural13", Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result_LiteralUnlimitedNatural13);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result_LiteralUnlimitedNatural13.setName("LiteralUnlimitedNatural13");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result_LiteralUnlimitedNatural13.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result_LiteralUnlimitedNatural13.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read a.b_result::LiteralUnlimitedNatural64
		addToElementRepository("LiteralUnlimitedNatural64", Operation_RequiredInterface_DelegationChain_main_Read_a_b_result_LiteralUnlimitedNatural64);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_result_LiteralUnlimitedNatural64.setName("LiteralUnlimitedNatural64");
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_result_LiteralUnlimitedNatural64.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_result_LiteralUnlimitedNatural64.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result::LiteralUnlimitedNatural45
		addToElementRepository("LiteralUnlimitedNatural45", Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result_LiteralUnlimitedNatural45);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result_LiteralUnlimitedNatural45.setName("LiteralUnlimitedNatural45");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result_LiteralUnlimitedNatural45.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result_LiteralUnlimitedNatural45.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_Read d.e_object::LiteralUnlimitedNatural93
		addToElementRepository("LiteralUnlimitedNatural93", Operation_RequiredInterface_DelegationChain_main_Read_d_e_object_LiteralUnlimitedNatural93);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_object_LiteralUnlimitedNatural93.setName("LiteralUnlimitedNatural93");
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_object_LiteralUnlimitedNatural93.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_object_LiteralUnlimitedNatural93.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural7
		addToElementRepository("LiteralUnlimitedNatural7", Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural7);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural7.setName("LiteralUnlimitedNatural7");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural7.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural7.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_A_setPActivity_Call I::setP on q_v::LiteralUnlimitedNatural50
		addToElementRepository("LiteralUnlimitedNatural50", Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural50);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural50.setName("LiteralUnlimitedNatural50");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural50.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural50.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result::LiteralUnlimitedNatural19
		addToElementRepository("LiteralUnlimitedNatural19", Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result_LiteralUnlimitedNatural19);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result_LiteralUnlimitedNatural19.setName("LiteralUnlimitedNatural19");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result_LiteralUnlimitedNatural19.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result_LiteralUnlimitedNatural19.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_D()_target::LiteralUnlimitedNatural103
		addToElementRepository("LiteralUnlimitedNatural103", Operation_RequiredInterface_DelegationChain_main_D__target_LiteralUnlimitedNatural103);
		Operation_RequiredInterface_DelegationChain_main_D__target_LiteralUnlimitedNatural103.setName("LiteralUnlimitedNatural103");
		Operation_RequiredInterface_DelegationChain_main_D__target_LiteralUnlimitedNatural103.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_D__target_LiteralUnlimitedNatural103.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_DelegationChain_main_D()_result::LiteralUnlimitedNatural101
		addToElementRepository("LiteralUnlimitedNatural101", Operation_RequiredInterface_DelegationChain_main_D__result_LiteralUnlimitedNatural101);
		Operation_RequiredInterface_DelegationChain_main_D__result_LiteralUnlimitedNatural101.setName("LiteralUnlimitedNatural101");
		Operation_RequiredInterface_DelegationChain_main_D__result_LiteralUnlimitedNatural101.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_D__result_LiteralUnlimitedNatural101.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow Operation_RequiredInterface_DelegationChain_C_setPActivity::ObjectFlow15
		addToElementRepository("ObjectFlow15", Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15.setName("ObjectFlow15");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15.setSource(Operation_RequiredInterface_DelegationChain_C_setPActivity_vParameterNode);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15.setTarget(Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_v);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15.setGuard(Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow15_LiteralBoolean16);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_main::ObjectFlow65
		addToElementRepository("ObjectFlow65", Operation_RequiredInterface_DelegationChain_main_ObjectFlow65);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow65.setName("ObjectFlow65");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow65.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow65.setSource(Operation_RequiredInterface_DelegationChain_main_Read_e_c_result);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow65.setTarget(Operation_RequiredInterface_DelegationChain_main_Call_setP__target);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow65.setGuard(Operation_RequiredInterface_DelegationChain_main_ObjectFlow65_LiteralBoolean67);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_main::ObjectFlow68
		addToElementRepository("ObjectFlow68", Operation_RequiredInterface_DelegationChain_main_ObjectFlow68);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow68.setName("ObjectFlow68");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow68.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow68.setSource(Operation_RequiredInterface_DelegationChain_main_Read_b_p_result);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow68.setTarget(Operation_RequiredInterface_DelegationChain_main_Call_testP_p);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow68.setGuard(Operation_RequiredInterface_DelegationChain_main_ObjectFlow68_LiteralBoolean70);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_main::ObjectFlow71
		addToElementRepository("ObjectFlow71", Operation_RequiredInterface_DelegationChain_main_ObjectFlow71);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow71.setName("ObjectFlow71");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow71.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow71.setSource(Operation_RequiredInterface_DelegationChain_main_Fork_d);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow71.setTarget(Operation_RequiredInterface_DelegationChain_main_Read_d_e_object);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow71.setGuard(Operation_RequiredInterface_DelegationChain_main_ObjectFlow71_LiteralBoolean72);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_main::ObjectFlow80
		addToElementRepository("ObjectFlow80", Operation_RequiredInterface_DelegationChain_main_ObjectFlow80);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow80.setName("ObjectFlow80");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow80.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow80.setSource(Operation_RequiredInterface_DelegationChain_main_Read_a_b_result);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow80.setTarget(Operation_RequiredInterface_DelegationChain_main_Read_b_p_object);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow80.setGuard(Operation_RequiredInterface_DelegationChain_main_ObjectFlow80_LiteralBoolean81);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_B_setPActivity::ObjectFlow0
		addToElementRepository("ObjectFlow0", Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0.setName("ObjectFlow0");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0.setSource(Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0.setTarget(Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_object);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0.setGuard(Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow0_LiteralBoolean1);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_main::ObjectFlow90
		addToElementRepository("ObjectFlow90", Operation_RequiredInterface_DelegationChain_main_ObjectFlow90);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow90.setName("ObjectFlow90");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow90.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow90.setSource(Operation_RequiredInterface_DelegationChain_main_D__result);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow90.setTarget(Operation_RequiredInterface_DelegationChain_main_Fork_d);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow90.setGuard(Operation_RequiredInterface_DelegationChain_main_ObjectFlow90_LiteralBoolean91);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_main::ObjectFlow97
		addToElementRepository("ObjectFlow97", Operation_RequiredInterface_DelegationChain_main_ObjectFlow97);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow97.setName("ObjectFlow97");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow97.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow97.setSource(Operation_RequiredInterface_DelegationChain_main_Value_4_result);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow97.setTarget(Operation_RequiredInterface_DelegationChain_main_Call_setP__v);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow97.setGuard(Operation_RequiredInterface_DelegationChain_main_ObjectFlow97_LiteralBoolean98);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_B_setPActivity::ObjectFlow3
		addToElementRepository("ObjectFlow3", Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3.setName("ObjectFlow3");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3.setSource(Operation_RequiredInterface_DelegationChain_B_setPActivity_vParameterNode);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3.setTarget(Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_value);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3.setGuard(Operation_RequiredInterface_DelegationChain_B_setPActivity_ObjectFlow3_LiteralBoolean5);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_A_setPActivity::ObjectFlow38
		addToElementRepository("ObjectFlow38", Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38.setName("ObjectFlow38");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38.setSource(Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38.setTarget(Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_target);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38.setGuard(Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow38_LiteralBoolean40);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_A_setPActivity::ObjectFlow41
		addToElementRepository("ObjectFlow41", Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41.setName("ObjectFlow41");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41.setSource(Operation_RequiredInterface_DelegationChain_A_setPActivity_vParameterNode);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41.setTarget(Operation_RequiredInterface_DelegationChain_A_setPActivity_Call_I_setP_on_q_v);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41.setGuard(Operation_RequiredInterface_DelegationChain_A_setPActivity_ObjectFlow41_LiteralBoolean42);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_main::ObjectFlow105
		addToElementRepository("ObjectFlow105", Operation_RequiredInterface_DelegationChain_main_ObjectFlow105);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow105.setName("ObjectFlow105");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow105.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow105.setSource(Operation_RequiredInterface_DelegationChain_main_Read_d_e_result);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow105.setTarget(Operation_RequiredInterface_DelegationChain_main_Read_e_c_object);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow105.setGuard(Operation_RequiredInterface_DelegationChain_main_ObjectFlow105_LiteralBoolean106);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_C_setPActivity::ObjectFlow25
		addToElementRepository("ObjectFlow25", Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25.setName("ObjectFlow25");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25.setSource(Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25.setTarget(Operation_RequiredInterface_DelegationChain_C_setPActivity_Call_I_setP_on_q_target);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25.setGuard(Operation_RequiredInterface_DelegationChain_C_setPActivity_ObjectFlow25_LiteralBoolean27);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_main::ObjectFlow112
		addToElementRepository("ObjectFlow112", Operation_RequiredInterface_DelegationChain_main_ObjectFlow112);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow112.setName("ObjectFlow112");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow112.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow112.setSource(Operation_RequiredInterface_DelegationChain_main_Fork_d);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow112.setTarget(Operation_RequiredInterface_DelegationChain_main_Read_d_a_object);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow112.setGuard(Operation_RequiredInterface_DelegationChain_main_ObjectFlow112_LiteralBoolean114);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_main::ObjectFlow115
		addToElementRepository("ObjectFlow115", Operation_RequiredInterface_DelegationChain_main_ObjectFlow115);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow115.setName("ObjectFlow115");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow115.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow115.setSource(Operation_RequiredInterface_DelegationChain_main_Create_D_result);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow115.setTarget(Operation_RequiredInterface_DelegationChain_main_D__target);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow115.setGuard(Operation_RequiredInterface_DelegationChain_main_ObjectFlow115_LiteralBoolean116);
		// ObjectFlow Operation_RequiredInterface_DelegationChain_main::ObjectFlow118
		addToElementRepository("ObjectFlow118", Operation_RequiredInterface_DelegationChain_main_ObjectFlow118);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow118.setName("ObjectFlow118");
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow118.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow118.setSource(Operation_RequiredInterface_DelegationChain_main_Read_d_a_result);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow118.setTarget(Operation_RequiredInterface_DelegationChain_main_Read_a_b_object);
		Operation_RequiredInterface_DelegationChain_main_ObjectFlow118.setGuard(Operation_RequiredInterface_DelegationChain_main_ObjectFlow118_LiteralBoolean119);
	}

	private void initializeOperation_Instances()
	{
		// Operation Operation_RequiredInterface_DelegationChain_D::D_D
		addToElementRepository("D_D", Operation_RequiredInterface_DelegationChain_D_D_D);
		Operation_RequiredInterface_DelegationChain_D_D_D.setName("D");
		Operation_RequiredInterface_DelegationChain_D_D_D.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_D_D_D.addOwnedParameter(Operation_RequiredInterface_DelegationChain_D_D_D_result);
		Operation_RequiredInterface_DelegationChain_D_D_D.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation Operation_RequiredInterface_DelegationChain_C::setP_Integer
		addToElementRepository("setP_Integer", Operation_RequiredInterface_DelegationChain_C_setP_Integer);
		Operation_RequiredInterface_DelegationChain_C_setP_Integer.setName("setP");
		Operation_RequiredInterface_DelegationChain_C_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setP_Integer.addOwnedParameter(Operation_RequiredInterface_DelegationChain_C_setP_Integer_v);
		Operation_RequiredInterface_DelegationChain_C_setP_Integer.addMethod(Operation_RequiredInterface_DelegationChain_C_setPActivity);
		// Operation Operation_RequiredInterface_DelegationChain_I::setP_Integer
		addToElementRepository("setP_Integer", Operation_RequiredInterface_DelegationChain_I_setP_Integer);
		Operation_RequiredInterface_DelegationChain_I_setP_Integer.setName("setP");
		Operation_RequiredInterface_DelegationChain_I_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_I_setP_Integer.addOwnedParameter(Operation_RequiredInterface_DelegationChain_I_setP_Integer_v);
		// Operation Operation_RequiredInterface_DelegationChain_IImpl::setP_Integer
		addToElementRepository("setP_Integer", Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer);
		Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer.setName("setP");
		Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer.addOwnedParameter(Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer_v);
		// Operation Operation_RequiredInterface_DelegationChain_B::setP_Integer
		addToElementRepository("setP_Integer", Operation_RequiredInterface_DelegationChain_B_setP_Integer);
		Operation_RequiredInterface_DelegationChain_B_setP_Integer.setName("setP");
		Operation_RequiredInterface_DelegationChain_B_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setP_Integer.addOwnedParameter(Operation_RequiredInterface_DelegationChain_B_setP_Integer_v);
		Operation_RequiredInterface_DelegationChain_B_setP_Integer.addMethod(Operation_RequiredInterface_DelegationChain_B_setPActivity);
		// Operation Operation_RequiredInterface_DelegationChain_A::setP_Integer
		addToElementRepository("setP_Integer", Operation_RequiredInterface_DelegationChain_A_setP_Integer);
		Operation_RequiredInterface_DelegationChain_A_setP_Integer.setName("setP");
		Operation_RequiredInterface_DelegationChain_A_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setP_Integer.addOwnedParameter(Operation_RequiredInterface_DelegationChain_A_setP_Integer_v);
		Operation_RequiredInterface_DelegationChain_A_setP_Integer.addMethod(Operation_RequiredInterface_DelegationChain_A_setPActivity);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin Operation_RequiredInterface_DelegationChain_main_Read d.a::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_main_Read_d_a_result);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_result.setName("result");
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a_result.setType(Operation_RequiredInterface_DelegationChain_A);
		// OutputPin Operation_RequiredInterface_DelegationChain_main_Value(4)::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_main_Value_4_result);
		Operation_RequiredInterface_DelegationChain_main_Value_4_result.setName("result");
		Operation_RequiredInterface_DelegationChain_main_Value_4_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Operation_RequiredInterface_DelegationChain_B_setPActivity_this::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result.setName("result");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result.setType(Operation_RequiredInterface_DelegationChain_B);
		// OutputPin Operation_RequiredInterface_DelegationChain_C_setPActivity_this::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result.setName("result");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result.setType(Operation_RequiredInterface_DelegationChain_C);
		// OutputPin Operation_RequiredInterface_DelegationChain_main_Read a.b::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_main_Read_a_b_result);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_result.setName("result");
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b_result.setType(Operation_RequiredInterface_DelegationChain_B);
		// OutputPin Operation_RequiredInterface_DelegationChain_main_Read d.e::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_main_Read_d_e_result);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_result.setName("result");
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e_result.setType(Operation_RequiredInterface_DelegationChain_E);
		// OutputPin Operation_RequiredInterface_DelegationChain_main_D()::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_main_D__result);
		Operation_RequiredInterface_DelegationChain_main_D__result.setName("result");
		Operation_RequiredInterface_DelegationChain_main_D__result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_D__result.setType(Operation_RequiredInterface_DelegationChain_D);
		// OutputPin Operation_RequiredInterface_DelegationChain_main_Read b.p::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_main_Read_b_p_result);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_result.setName("result");
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Operation_RequiredInterface_DelegationChain_main_Read e.c::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_main_Read_e_c_result);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_result.setName("result");
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c_result.setType(Operation_RequiredInterface_DelegationChain_C);
		// OutputPin Operation_RequiredInterface_DelegationChain_B_setPActivity_Set this.p::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result.setName("result");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_Set_this_p_result.setType(Operation_RequiredInterface_DelegationChain_B);
		// OutputPin Operation_RequiredInterface_DelegationChain_main_Create D::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_main_Create_D_result);
		Operation_RequiredInterface_DelegationChain_main_Create_D_result.setName("result");
		Operation_RequiredInterface_DelegationChain_main_Create_D_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Create_D_result.setType(Operation_RequiredInterface_DelegationChain_D);
		// OutputPin Operation_RequiredInterface_DelegationChain_A_setPActivity_this::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result.setName("result");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result.setType(Operation_RequiredInterface_DelegationChain_A);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport Operation_RequiredInterface_DelegationChain::PackageImport30
		addToElementRepository("PackageImport30", Operation_RequiredInterface_DelegationChain_PackageImport30);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter Operation_RequiredInterface_DelegationChain_B_setPActivity::v
		addToElementRepository("v", Operation_RequiredInterface_DelegationChain_B_setPActivity_v);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_v.setName("v");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_DelegationChain_I_setP_Integer::v
		addToElementRepository("v", Operation_RequiredInterface_DelegationChain_I_setP_Integer_v);
		Operation_RequiredInterface_DelegationChain_I_setP_Integer_v.setName("v");
		Operation_RequiredInterface_DelegationChain_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_DelegationChain_A_setP_Integer::v
		addToElementRepository("v", Operation_RequiredInterface_DelegationChain_A_setP_Integer_v);
		Operation_RequiredInterface_DelegationChain_A_setP_Integer_v.setName("v");
		Operation_RequiredInterface_DelegationChain_A_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_A_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_DelegationChain_B_setP_Integer::v
		addToElementRepository("v", Operation_RequiredInterface_DelegationChain_B_setP_Integer_v);
		Operation_RequiredInterface_DelegationChain_B_setP_Integer_v.setName("v");
		Operation_RequiredInterface_DelegationChain_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_DelegationChain_C_setP_Integer::v
		addToElementRepository("v", Operation_RequiredInterface_DelegationChain_C_setP_Integer_v);
		Operation_RequiredInterface_DelegationChain_C_setP_Integer_v.setName("v");
		Operation_RequiredInterface_DelegationChain_C_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_C_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_DelegationChain_C_setPActivity::v
		addToElementRepository("v", Operation_RequiredInterface_DelegationChain_C_setPActivity_v);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_v.setName("v");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_C_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer::v
		addToElementRepository("v", Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer_v);
		Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer_v.setName("v");
		Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_DelegationChain_A_setPActivity::v
		addToElementRepository("v", Operation_RequiredInterface_DelegationChain_A_setPActivity_v);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_v.setName("v");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_A_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_DelegationChain_main_testP::p
		addToElementRepository("p", Operation_RequiredInterface_DelegationChain_main_testP_p);
		Operation_RequiredInterface_DelegationChain_main_testP_p.setName("p");
		Operation_RequiredInterface_DelegationChain_main_testP_p.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_main_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_DelegationChain_D_D_D::result
		addToElementRepository("result", Operation_RequiredInterface_DelegationChain_D_D_D_result);
		Operation_RequiredInterface_DelegationChain_D_D_D_result.setName("result");
		Operation_RequiredInterface_DelegationChain_D_D_D_result.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_D_D_D_result.setType(Operation_RequiredInterface_DelegationChain_D);
		Operation_RequiredInterface_DelegationChain_D_D_D_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port Operation_RequiredInterface_DelegationChain_C::q
		addToElementRepository("q", Operation_RequiredInterface_DelegationChain_C_q);
		Operation_RequiredInterface_DelegationChain_C_q.setName("q");
		Operation_RequiredInterface_DelegationChain_C_q.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_C_q.setType(Operation_RequiredInterface_DelegationChain_IImpl);
		Operation_RequiredInterface_DelegationChain_C_q.setAggregation(AggregationKind.composite);
		Operation_RequiredInterface_DelegationChain_C_q.isConjugated = true;;
		Operation_RequiredInterface_DelegationChain_C_q.isService = true;
		Operation_RequiredInterface_DelegationChain_C_q.addRequired(Operation_RequiredInterface_DelegationChain_I);
		// Port Operation_RequiredInterface_DelegationChain_E::q
		addToElementRepository("q", Operation_RequiredInterface_DelegationChain_E_q);
		Operation_RequiredInterface_DelegationChain_E_q.setName("q");
		Operation_RequiredInterface_DelegationChain_E_q.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_E_q.setType(Operation_RequiredInterface_DelegationChain_IImpl);
		Operation_RequiredInterface_DelegationChain_E_q.setAggregation(AggregationKind.composite);
		Operation_RequiredInterface_DelegationChain_E_q.isConjugated = true;;
		Operation_RequiredInterface_DelegationChain_E_q.isService = true;
		Operation_RequiredInterface_DelegationChain_E_q.addRequired(Operation_RequiredInterface_DelegationChain_I);
		// Port Operation_RequiredInterface_DelegationChain_A::q
		addToElementRepository("q", Operation_RequiredInterface_DelegationChain_A_q);
		Operation_RequiredInterface_DelegationChain_A_q.setName("q");
		Operation_RequiredInterface_DelegationChain_A_q.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_A_q.setType(Operation_RequiredInterface_DelegationChain_IImpl);
		Operation_RequiredInterface_DelegationChain_A_q.setAggregation(AggregationKind.composite);
		Operation_RequiredInterface_DelegationChain_A_q.isService = true;
		Operation_RequiredInterface_DelegationChain_A_q.addProvided(Operation_RequiredInterface_DelegationChain_I);
	}

	private void initializeProperty_Instances()
	{
		// Property Operation_RequiredInterface_DelegationChain_D::e
		addToElementRepository("e", Operation_RequiredInterface_DelegationChain_D_e);
		Operation_RequiredInterface_DelegationChain_D_e.setName("e");
		Operation_RequiredInterface_DelegationChain_D_e.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_D_e.setType(Operation_RequiredInterface_DelegationChain_E);
		Operation_RequiredInterface_DelegationChain_D_e.setAggregation(AggregationKind.composite);
		// Property Operation_RequiredInterface_DelegationChain_E::c
		addToElementRepository("c", Operation_RequiredInterface_DelegationChain_E_c);
		Operation_RequiredInterface_DelegationChain_E_c.setName("c");
		Operation_RequiredInterface_DelegationChain_E_c.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_E_c.setType(Operation_RequiredInterface_DelegationChain_C);
		Operation_RequiredInterface_DelegationChain_E_c.setAggregation(AggregationKind.composite);
		// Property Operation_RequiredInterface_DelegationChain_A::b
		addToElementRepository("b", Operation_RequiredInterface_DelegationChain_A_b);
		Operation_RequiredInterface_DelegationChain_A_b.setName("b");
		Operation_RequiredInterface_DelegationChain_A_b.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_A_b.setType(Operation_RequiredInterface_DelegationChain_B);
		Operation_RequiredInterface_DelegationChain_A_b.setAggregation(AggregationKind.composite);
		// Property Operation_RequiredInterface_DelegationChain_R::x
		addToElementRepository("x", Operation_RequiredInterface_DelegationChain_R_x);
		Operation_RequiredInterface_DelegationChain_R_x.setName("x");
		Operation_RequiredInterface_DelegationChain_R_x.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_R_x.setType(Operation_RequiredInterface_DelegationChain_IImpl);
		// Property Operation_RequiredInterface_DelegationChain_S::y
		addToElementRepository("y", Operation_RequiredInterface_DelegationChain_S_y);
		Operation_RequiredInterface_DelegationChain_S_y.setName("y");
		Operation_RequiredInterface_DelegationChain_S_y.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_S_y.setType(Operation_RequiredInterface_DelegationChain_IImpl);
		// Property Operation_RequiredInterface_DelegationChain_S::x
		addToElementRepository("x", Operation_RequiredInterface_DelegationChain_S_x);
		Operation_RequiredInterface_DelegationChain_S_x.setName("x");
		Operation_RequiredInterface_DelegationChain_S_x.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_S_x.setType(Operation_RequiredInterface_DelegationChain_IImpl);
		// Property Operation_RequiredInterface_DelegationChain_D::a
		addToElementRepository("a", Operation_RequiredInterface_DelegationChain_D_a);
		Operation_RequiredInterface_DelegationChain_D_a.setName("a");
		Operation_RequiredInterface_DelegationChain_D_a.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_D_a.setType(Operation_RequiredInterface_DelegationChain_A);
		Operation_RequiredInterface_DelegationChain_D_a.setAggregation(AggregationKind.composite);
		// Property Operation_RequiredInterface_DelegationChain_B::p
		addToElementRepository("p", Operation_RequiredInterface_DelegationChain_B_p);
		Operation_RequiredInterface_DelegationChain_B_p.setName("p");
		Operation_RequiredInterface_DelegationChain_B_p.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property Operation_RequiredInterface_DelegationChain_R::y
		addToElementRepository("y", Operation_RequiredInterface_DelegationChain_R_y);
		Operation_RequiredInterface_DelegationChain_R_y.setName("y");
		Operation_RequiredInterface_DelegationChain_R_y.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_DelegationChain_R_y.setType(Operation_RequiredInterface_DelegationChain_B);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction Operation_RequiredInterface_DelegationChain_C_setPActivity::this
		addToElementRepository("this", Operation_RequiredInterface_DelegationChain_C_setPActivity_this);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_this.setName("this");
		Operation_RequiredInterface_DelegationChain_C_setPActivity_this.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_C_setPActivity_this.setResult(Operation_RequiredInterface_DelegationChain_C_setPActivity_this_result);
		// ReadSelfAction Operation_RequiredInterface_DelegationChain_B_setPActivity::this
		addToElementRepository("this", Operation_RequiredInterface_DelegationChain_B_setPActivity_this);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_this.setName("this");
		Operation_RequiredInterface_DelegationChain_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_B_setPActivity_this.setResult(Operation_RequiredInterface_DelegationChain_B_setPActivity_this_result);
		// ReadSelfAction Operation_RequiredInterface_DelegationChain_A_setPActivity::this
		addToElementRepository("this", Operation_RequiredInterface_DelegationChain_A_setPActivity_this);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_this.setName("this");
		Operation_RequiredInterface_DelegationChain_A_setPActivity_this.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_A_setPActivity_this.setResult(Operation_RequiredInterface_DelegationChain_A_setPActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction Operation_RequiredInterface_DelegationChain_main::Read e.c
		addToElementRepository("Read e.c", Operation_RequiredInterface_DelegationChain_main_Read_e_c);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c.setName("Read e.c");
		Operation_RequiredInterface_DelegationChain_main_Read_e_c.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c.setStructuralFeature(Operation_RequiredInterface_DelegationChain_E_c);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c.setObject(Operation_RequiredInterface_DelegationChain_main_Read_e_c_object);
		Operation_RequiredInterface_DelegationChain_main_Read_e_c.setResult(Operation_RequiredInterface_DelegationChain_main_Read_e_c_result);
		// ReadStructuralFeatureAction Operation_RequiredInterface_DelegationChain_main::Read b.p
		addToElementRepository("Read b.p", Operation_RequiredInterface_DelegationChain_main_Read_b_p);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p.setName("Read b.p");
		Operation_RequiredInterface_DelegationChain_main_Read_b_p.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p.setStructuralFeature(Operation_RequiredInterface_DelegationChain_B_p);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p.setObject(Operation_RequiredInterface_DelegationChain_main_Read_b_p_object);
		Operation_RequiredInterface_DelegationChain_main_Read_b_p.setResult(Operation_RequiredInterface_DelegationChain_main_Read_b_p_result);
		// ReadStructuralFeatureAction Operation_RequiredInterface_DelegationChain_main::Read a.b
		addToElementRepository("Read a.b", Operation_RequiredInterface_DelegationChain_main_Read_a_b);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b.setName("Read a.b");
		Operation_RequiredInterface_DelegationChain_main_Read_a_b.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b.setStructuralFeature(Operation_RequiredInterface_DelegationChain_A_b);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b.setObject(Operation_RequiredInterface_DelegationChain_main_Read_a_b_object);
		Operation_RequiredInterface_DelegationChain_main_Read_a_b.setResult(Operation_RequiredInterface_DelegationChain_main_Read_a_b_result);
		// ReadStructuralFeatureAction Operation_RequiredInterface_DelegationChain_main::Read d.e
		addToElementRepository("Read d.e", Operation_RequiredInterface_DelegationChain_main_Read_d_e);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e.setName("Read d.e");
		Operation_RequiredInterface_DelegationChain_main_Read_d_e.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e.setStructuralFeature(Operation_RequiredInterface_DelegationChain_D_e);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e.setObject(Operation_RequiredInterface_DelegationChain_main_Read_d_e_object);
		Operation_RequiredInterface_DelegationChain_main_Read_d_e.setResult(Operation_RequiredInterface_DelegationChain_main_Read_d_e_result);
		// ReadStructuralFeatureAction Operation_RequiredInterface_DelegationChain_main::Read d.a
		addToElementRepository("Read d.a", Operation_RequiredInterface_DelegationChain_main_Read_d_a);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a.setName("Read d.a");
		Operation_RequiredInterface_DelegationChain_main_Read_d_a.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a.setStructuralFeature(Operation_RequiredInterface_DelegationChain_D_a);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a.setObject(Operation_RequiredInterface_DelegationChain_main_Read_d_a_object);
		Operation_RequiredInterface_DelegationChain_main_Read_d_a.setResult(Operation_RequiredInterface_DelegationChain_main_Read_d_a_result);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction Operation_RequiredInterface_DelegationChain_main::Value(4)
		addToElementRepository("Value(4)", Operation_RequiredInterface_DelegationChain_main_Value_4);
		Operation_RequiredInterface_DelegationChain_main_Value_4.setName("Value(4)");
		Operation_RequiredInterface_DelegationChain_main_Value_4.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_DelegationChain_main_Value_4.setValue(Operation_RequiredInterface_DelegationChain_main_Value_4_LiteralInteger76);
		Operation_RequiredInterface_DelegationChain_main_Value_4.setResult(Operation_RequiredInterface_DelegationChain_main_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // Operation_RequiredInterface_DelegationChainModel
