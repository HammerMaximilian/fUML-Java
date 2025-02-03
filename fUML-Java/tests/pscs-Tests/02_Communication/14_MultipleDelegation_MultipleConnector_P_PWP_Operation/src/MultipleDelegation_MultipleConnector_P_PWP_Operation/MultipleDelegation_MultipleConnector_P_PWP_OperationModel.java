/*
 * MultipleDelegation_MultipleConnector_P_PWP_OperationModel.java
 * 
 * Auto-generated file
 */
package MultipleDelegation_MultipleConnector_P_PWP_Operation;

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

public class MultipleDelegation_MultipleConnector_P_PWP_OperationModel extends InMemoryModel
{
	private static MultipleDelegation_MultipleConnector_P_PWP_OperationModel instance;

	/*
	 * Model MultipleDelegation_MultipleConnector_P_PWP_Operation
	 */
	public Package MultipleDelegation_MultipleConnector_P_PWP_Operation = new Package();
		public Comment MultipleDelegation_MultipleConnector_P_PWP_Operation_Comment0 = new Comment();
		public Activity MultipleDelegation_MultipleConnector_P_PWP_Operation_main = new Activity();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1_LiteralBoolean2 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1_LiteralInteger3 = new LiteralInteger();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2 = new ReadStructuralFeatureAction();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object_LiteralUnlimitedNatural4 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object_LiteralInteger5 = new LiteralInteger();
				public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result_LiteralInteger6 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result_LiteralUnlimitedNatural7 = new LiteralUnlimitedNatural();
			public ValueSpecificationAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4 = new ValueSpecificationAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result_LiteralInteger8 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural9 = new LiteralUnlimitedNatural();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_LiteralInteger10 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11_LiteralBoolean12 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11_LiteralInteger13 = new LiteralInteger();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result_LiteralInteger14 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural15 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object_LiteralInteger16 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural17 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18_LiteralBoolean19 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18_LiteralInteger20 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21_LiteralBoolean22 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21_LiteralInteger23 = new LiteralInteger();
			public ForkNode MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Fork_C = new ForkNode();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3 = new ReadStructuralFeatureAction();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object_LiteralUnlimitedNatural24 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object_LiteralInteger25 = new LiteralInteger();
				public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result_LiteralInteger26 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result_LiteralUnlimitedNatural27 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28_LiteralInteger29 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28_LiteralBoolean30 = new LiteralBoolean();
			public CallBehaviorAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP = new CallBehaviorAction();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural31 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger32 = new LiteralInteger();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger33 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34_LiteralBoolean35 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34_LiteralInteger36 = new LiteralInteger();
			public CallOperationAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP_ = new CallOperationAction();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger37 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural38 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger39 = new LiteralInteger();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural40 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralInteger41 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42_LiteralInteger43 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42_LiteralBoolean44 = new LiteralBoolean();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result_LiteralInteger45 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object_LiteralInteger47 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural48 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49_LiteralBoolean50 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49_LiteralInteger51 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52_LiteralInteger53 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52_LiteralBoolean54 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55_LiteralInteger56 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55_LiteralBoolean57 = new LiteralBoolean();
			public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow58 = new ControlFlow();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1 = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result_LiteralInteger59 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result_LiteralUnlimitedNatural60 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object_LiteralUnlimitedNatural61 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object_LiteralInteger62 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63_LiteralInteger64 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63_LiteralBoolean65 = new LiteralBoolean();
			public OpaqueBehavior MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP = new OpaqueBehavior();
				public Parameter MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP_p = new Parameter();
			public CallOperationAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C_ = new CallOperationAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralInteger66 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural67 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralInteger68 = new LiteralInteger();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural69 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target_LiteralInteger70 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71_LiteralBoolean72 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71_LiteralInteger73 = new LiteralInteger();
			public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow74 = new ControlFlow();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4 = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result_LiteralInteger75 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result_LiteralUnlimitedNatural76 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object_LiteralUnlimitedNatural77 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object_LiteralInteger78 = new LiteralInteger();
			public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow79 = new ControlFlow();
			public CreateObjectAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C = new CreateObjectAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result_LiteralInteger80 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural81 = new LiteralUnlimitedNatural();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p = new ReadStructuralFeatureAction();
				public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural82 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object_LiteralInteger83 = new LiteralInteger();
				public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result_LiteralInteger84 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural85 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86_LiteralInteger87 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86_LiteralBoolean88 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89_LiteralBoolean90 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89_LiteralInteger91 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92_LiteralBoolean93 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92_LiteralInteger94 = new LiteralInteger();
			public ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow95 = new ControlFlow();
		public PackageImport MultipleDelegation_MultipleConnector_P_PWP_Operation_PackageImport96 = new PackageImport();
		public Interface MultipleDelegation_MultipleConnector_P_PWP_Operation_I = new Interface();
			public Operation MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer_v = new Parameter();
		public Comment MultipleDelegation_MultipleConnector_P_PWP_Operation_Comment97 = new Comment();
		public Association MultipleDelegation_MultipleConnector_P_PWP_Operation_R = new Association();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Operation_R_x = new Property();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Operation_R_y = new Property();
		public Class_ MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl = new Class_();
			public InterfaceRealization MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_IRealization = new InterfaceRealization();
			public Operation MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer_v = new Parameter();
		public Class_ MultipleDelegation_MultipleConnector_P_PWP_Operation_A = new Class_();
			public Connector MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r_ConnectorEnd98 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r_ConnectorEnd99 = new ConnectorEnd();
			public Port MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q = new Port();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Operation_A_b = new Property();
		public Association MultipleDelegation_MultipleConnector_P_PWP_Operation_U = new Association();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Operation_U_y = new Property();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Operation_U_x = new Property();
		public Class_ MultipleDelegation_MultipleConnector_P_PWP_Operation_B = new Class_();
			public Activity MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity = new Activity();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100_LiteralBoolean101 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100_LiteralInteger102 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103_LiteralInteger104 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103_LiteralBoolean105 = new LiteralBoolean();
				public ReadSelfAction MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural106 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger107 = new LiteralInteger();
				public AddStructuralFeatureValueAction MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger108 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural109 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural110 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger111 = new LiteralInteger();
					public InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger112 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural113 = new LiteralUnlimitedNatural();
				public ActivityParameterNode MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger114 = new LiteralInteger();
				public Parameter MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_v = new Parameter();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p_LiteralInteger115 = new LiteralInteger();
			public Operation MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer_v = new Parameter();
			public InterfaceRealization MultipleDelegation_MultipleConnector_P_PWP_Operation_B_IRealization = new InterfaceRealization();
		public Class_ MultipleDelegation_MultipleConnector_P_PWP_Operation_C = new Class_();
			public Operation MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C_result = new Parameter();
			public Connector MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4_ConnectorEnd116 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4_ConnectorEnd117 = new ConnectorEnd();
			public Connector MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2_ConnectorEnd118 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2_ConnectorEnd119 = new ConnectorEnd();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a4 = new Property();
			public Port MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p = new Port();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a2 = new Property();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a3 = new Property();
			public Property MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a1 = new Property();
			public Connector MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1_ConnectorEnd120 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1_ConnectorEnd121 = new ConnectorEnd();
			public Connector MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3_ConnectorEnd122 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3_ConnectorEnd123 = new ConnectorEnd();

	public static MultipleDelegation_MultipleConnector_P_PWP_OperationModel instance()
	{
		if (instance == null)
        {
            instance = new MultipleDelegation_MultipleConnector_P_PWP_OperationModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public MultipleDelegation_MultipleConnector_P_PWP_OperationModel()
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
		// Activity MultipleDelegation_MultipleConnector_P_PWP_Operation_B::setPActivity
		addToElementRepository("setPActivity", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity.setName("setPActivity");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity.addOwnedParameter(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_v);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103);
		// Activity MultipleDelegation_MultipleConnector_P_PWP_Operation::main
		addToElementRepository("main", MultipleDelegation_MultipleConnector_P_PWP_Operation_main);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.setName("main");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addOwnedBehavior(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow58);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow74);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow79);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow95);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode.setName("vParameterNode");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode.setParameter(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_v);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p.setName("Set this.p");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p.setObject(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p.setValue(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p.setResult(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association MultipleDelegation_MultipleConnector_P_PWP_Operation::R
		addToElementRepository("R", MultipleDelegation_MultipleConnector_P_PWP_Operation_R);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_R.setName("R");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_R.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_R.addOwnedEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_R_x);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_R.addOwnedEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_R_y);
		// Association MultipleDelegation_MultipleConnector_P_PWP_Operation::U
		addToElementRepository("U", MultipleDelegation_MultipleConnector_P_PWP_Operation_U);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_U.setName("U");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_U.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_U.addOwnedEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_U_x);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_U.addOwnedEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_U_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main::Call testP
		addToElementRepository("Call testP", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP.setName("Call testP");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP.setBehavior(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP.addArgument(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main::Call p.setP()
		addToElementRepository("Call p.setP()", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP_.setName("Call p.setP()");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP_.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP_.setOperation(MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP_.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP_.addArgument(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v);
		// CallOperationAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main::C()
		addToElementRepository("C()", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C_.setName("C()");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C_.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C_.addResult(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C_.setOperation(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C_.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target);
	}

	private void initializeClass_Instances()
	{
		// Class MultipleDelegation_MultipleConnector_P_PWP_Operation::IImpl
		addToElementRepository("IImpl", MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl.setName("IImpl");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl.addInterfaceRealization(MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_IRealization);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl.addOwnedOperation(MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer);
		// Class MultipleDelegation_MultipleConnector_P_PWP_Operation::A
		addToElementRepository("A", MultipleDelegation_MultipleConnector_P_PWP_Operation_A);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A.setName("A");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Operation_A_b);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A.addOwnedConnector(MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r);
		// Class MultipleDelegation_MultipleConnector_P_PWP_Operation::B
		addToElementRepository("B", MultipleDelegation_MultipleConnector_P_PWP_Operation_B);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B.setName("B");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B.addOwnedBehavior(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B.addInterfaceRealization(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_IRealization);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B.addOwnedOperation(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer);
		// Class MultipleDelegation_MultipleConnector_P_PWP_Operation::C
		addToElementRepository("C", MultipleDelegation_MultipleConnector_P_PWP_Operation_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C.setName("C");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a1);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a2);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a3);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a4);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C.addOwnedConnector(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C.addOwnedConnector(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C.addOwnedConnector(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C.addOwnedConnector(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C.addOwnedOperation(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C);
	}

	private void initializeComment_Instances()
	{
		// Comment MultipleDelegation_MultipleConnector_P_PWP_Operation::Comment0
		addToElementRepository("Comment0", MultipleDelegation_MultipleConnector_P_PWP_Operation_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment MultipleDelegation_MultipleConnector_P_PWP_Operation::Comment97
		addToElementRepository("Comment97", MultipleDelegation_MultipleConnector_P_PWP_Operation_Comment97);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector MultipleDelegation_MultipleConnector_P_PWP_Operation_A::r
		addToElementRepository("r", MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r.setName("r");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r_ConnectorEnd98);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r_ConnectorEnd99);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_R);
		// Connector MultipleDelegation_MultipleConnector_P_PWP_Operation_C::u4
		addToElementRepository("u4", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4.setName("u4");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4_ConnectorEnd116);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4_ConnectorEnd117);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_U);
		// Connector MultipleDelegation_MultipleConnector_P_PWP_Operation_C::u2
		addToElementRepository("u2", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2.setName("u2");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2_ConnectorEnd119);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2_ConnectorEnd118);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_U);
		// Connector MultipleDelegation_MultipleConnector_P_PWP_Operation_C::u1
		addToElementRepository("u1", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1.setName("u1");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1_ConnectorEnd120);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1_ConnectorEnd121);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_U);
		// Connector MultipleDelegation_MultipleConnector_P_PWP_Operation_C::u3
		addToElementRepository("u3", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3.setName("u3");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3_ConnectorEnd123);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3.addEnd(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3_ConnectorEnd122);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_U);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r::ConnectorEnd98
		addToElementRepository("ConnectorEnd98", MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r_ConnectorEnd98);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r_ConnectorEnd98.setRole(MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2::ConnectorEnd118
		addToElementRepository("ConnectorEnd118", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2_ConnectorEnd118);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2_ConnectorEnd118.setRole(MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2_ConnectorEnd118.setPartWithPort(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a2);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4::ConnectorEnd116
		addToElementRepository("ConnectorEnd116", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4_ConnectorEnd116);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4_ConnectorEnd116.setRole(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1::ConnectorEnd120
		addToElementRepository("ConnectorEnd120", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1_ConnectorEnd120);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1_ConnectorEnd120.setRole(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3::ConnectorEnd122
		addToElementRepository("ConnectorEnd122", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3_ConnectorEnd122);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3_ConnectorEnd122.setRole(MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3_ConnectorEnd122.setPartWithPort(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a3);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r::ConnectorEnd99
		addToElementRepository("ConnectorEnd99", MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r_ConnectorEnd99);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_r_ConnectorEnd99.setRole(MultipleDelegation_MultipleConnector_P_PWP_Operation_A_b);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2::ConnectorEnd119
		addToElementRepository("ConnectorEnd119", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2_ConnectorEnd119);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u2_ConnectorEnd119.setRole(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1::ConnectorEnd121
		addToElementRepository("ConnectorEnd121", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1_ConnectorEnd121);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1_ConnectorEnd121.setRole(MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u1_ConnectorEnd121.setPartWithPort(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a1);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4::ConnectorEnd117
		addToElementRepository("ConnectorEnd117", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4_ConnectorEnd117);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4_ConnectorEnd117.setRole(MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u4_ConnectorEnd117.setPartWithPort(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a4);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3::ConnectorEnd123
		addToElementRepository("ConnectorEnd123", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3_ConnectorEnd123);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_u3_ConnectorEnd123.setRole(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ControlFlow58
		addToElementRepository("ControlFlow58", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow58);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow58.setName("ControlFlow58");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow58.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow58.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow58.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ControlFlow79
		addToElementRepository("ControlFlow79", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow79);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow79.setName("ControlFlow79");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow79.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow79.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow79.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ControlFlow95
		addToElementRepository("ControlFlow95", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow95);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow95.setName("ControlFlow95");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow95.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow95.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow95.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4);
		// ControlFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ControlFlow74
		addToElementRepository("ControlFlow74", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow74);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow74.setName("ControlFlow74");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow74.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow74.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ControlFlow74.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main::Create C
		addToElementRepository("Create C", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C.setName("Create C");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C.setClassifier(MultipleDelegation_MultipleConnector_P_PWP_Operation_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C.setResult(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode MultipleDelegation_MultipleConnector_P_PWP_Operation_main::Fork C
		addToElementRepository("Fork C", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Fork_C.setName("Fork C");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Fork_C.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior MultipleDelegation_MultipleConnector_P_PWP_Operation_main::testP
		addToElementRepository("testP", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP.setName("testP");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP.addOwnedParameter(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP.addLanguage("Java");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP.addLanguage("Import");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP.addBody("if(index == 1) 	{ 		System.out.println(\"Asserting c.a1.b.p == 4 || c.a2.b.p == 4 || c.a3.b.p == 4 || c.a4.b.c == 4\"); 	}  	// For some reason, during the first execution of the expansion region, its body is actually executed twice. 	// Because of that, the body is actually executaed 5 times in total. This if-statement covers that up until solved. 	if (index <= MAX_INDEX) 	{ 		// Test parameter p                 int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 		Debug.println(\"[doBody] argument p = \" + p); 	 		System.out.println( \"c.a\" + index + \".b.p == \" + p); 		success = success || (p == 4);  		if (index == MAX_INDEX) 		{  			System.out.print(\"Operation call delegated: \");  			if (success) 			{ 				System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 			} 			else 			{ 				System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 			} 		} 	}  	index++;");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set this.p::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_B);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read b.p::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_B);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a4::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_C);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call p.setP()::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target.setName("target");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_I);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set this.p::value
		addToElementRepository("value", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value.setName("value");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a1::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_C);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a3::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_C);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read a.b::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_A);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call testP::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p.setName("p");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call p.setP()::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v.setName("v");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a2::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_C);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.p::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object.setName("object");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_C);
		// InputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C()::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target.setName("target");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_C);
	}

	private void initializeInterface_Instances()
	{
		// Interface MultipleDelegation_MultipleConnector_P_PWP_Operation::I
		addToElementRepository("I", MultipleDelegation_MultipleConnector_P_PWP_Operation_I);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_I.setName("I");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_I.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_I.addOwnedOperation(MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl::IRealization
		addToElementRepository("IRealization", MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_IRealization);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_IRealization.setName("IRealization");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_IRealization.setContract(MultipleDelegation_MultipleConnector_P_PWP_Operation_I);
		// InterfaceRealization MultipleDelegation_MultipleConnector_P_PWP_Operation_B::IRealization
		addToElementRepository("IRealization", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_IRealization);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_IRealization.setName("IRealization");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_IRealization.setContract(MultipleDelegation_MultipleConnector_P_PWP_Operation_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55::LiteralBoolean57
		addToElementRepository("LiteralBoolean57", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55_LiteralBoolean57);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55_LiteralBoolean57.setName("LiteralBoolean57");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55_LiteralBoolean57.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55_LiteralBoolean57.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100::LiteralBoolean101
		addToElementRepository("LiteralBoolean101", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100_LiteralBoolean101);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100_LiteralBoolean101.setName("LiteralBoolean101");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100_LiteralBoolean101.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100_LiteralBoolean101.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11::LiteralBoolean12
		addToElementRepository("LiteralBoolean12", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11_LiteralBoolean12);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11_LiteralBoolean12.setName("LiteralBoolean12");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11_LiteralBoolean12.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11_LiteralBoolean12.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34::LiteralBoolean35
		addToElementRepository("LiteralBoolean35", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34_LiteralBoolean35);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34_LiteralBoolean35.setName("LiteralBoolean35");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34_LiteralBoolean35.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34_LiteralBoolean35.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1::LiteralBoolean2
		addToElementRepository("LiteralBoolean2", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1_LiteralBoolean2);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1_LiteralBoolean2.setName("LiteralBoolean2");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1_LiteralBoolean2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1_LiteralBoolean2.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89::LiteralBoolean90
		addToElementRepository("LiteralBoolean90", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89_LiteralBoolean90);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89_LiteralBoolean90.setName("LiteralBoolean90");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89_LiteralBoolean90.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89_LiteralBoolean90.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63::LiteralBoolean65
		addToElementRepository("LiteralBoolean65", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63_LiteralBoolean65);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63_LiteralBoolean65.setName("LiteralBoolean65");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63_LiteralBoolean65.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63_LiteralBoolean65.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92::LiteralBoolean93
		addToElementRepository("LiteralBoolean93", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92_LiteralBoolean93);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92_LiteralBoolean93.setName("LiteralBoolean93");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92_LiteralBoolean93.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92_LiteralBoolean93.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71::LiteralBoolean72
		addToElementRepository("LiteralBoolean72", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71_LiteralBoolean72);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71_LiteralBoolean72.setName("LiteralBoolean72");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71_LiteralBoolean72.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71_LiteralBoolean72.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49::LiteralBoolean50
		addToElementRepository("LiteralBoolean50", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49_LiteralBoolean50);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49_LiteralBoolean50.setName("LiteralBoolean50");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49_LiteralBoolean50.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49_LiteralBoolean50.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18::LiteralBoolean19
		addToElementRepository("LiteralBoolean19", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18_LiteralBoolean19);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18_LiteralBoolean19.setName("LiteralBoolean19");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18_LiteralBoolean19.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18_LiteralBoolean19.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103::LiteralBoolean105
		addToElementRepository("LiteralBoolean105", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103_LiteralBoolean105);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103_LiteralBoolean105.setName("LiteralBoolean105");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103_LiteralBoolean105.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103_LiteralBoolean105.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86::LiteralBoolean88
		addToElementRepository("LiteralBoolean88", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86_LiteralBoolean88);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86_LiteralBoolean88.setName("LiteralBoolean88");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86_LiteralBoolean88.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86_LiteralBoolean88.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52::LiteralBoolean54
		addToElementRepository("LiteralBoolean54", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52_LiteralBoolean54);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52_LiteralBoolean54.setName("LiteralBoolean54");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52_LiteralBoolean54.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52_LiteralBoolean54.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28::LiteralBoolean30
		addToElementRepository("LiteralBoolean30", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28_LiteralBoolean30);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28_LiteralBoolean30.setName("LiteralBoolean30");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28_LiteralBoolean30.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28_LiteralBoolean30.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21::LiteralBoolean22
		addToElementRepository("LiteralBoolean22", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21_LiteralBoolean22);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21_LiteralBoolean22.setName("LiteralBoolean22");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21_LiteralBoolean22.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21_LiteralBoolean22.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42::LiteralBoolean44
		addToElementRepository("LiteralBoolean44", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42_LiteralBoolean44);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42_LiteralBoolean44.setName("LiteralBoolean44");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42_LiteralBoolean44.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42_LiteralBoolean44.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p::LiteralInteger115
		addToElementRepository("LiteralInteger115", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p_LiteralInteger115);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p_LiteralInteger115.setName("LiteralInteger115");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p_LiteralInteger115.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p_LiteralInteger115.setValue(0);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55::LiteralInteger56
		addToElementRepository("LiteralInteger56", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55_LiteralInteger56);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55_LiteralInteger56.setName("LiteralInteger56");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55_LiteralInteger56.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55_LiteralInteger56.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C()_result::LiteralInteger66
		addToElementRepository("LiteralInteger66", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralInteger66);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralInteger66.setName("LiteralInteger66");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralInteger66.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralInteger66.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a3_result::LiteralInteger26
		addToElementRepository("LiteralInteger26", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result_LiteralInteger26);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result_LiteralInteger26.setName("LiteralInteger26");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result_LiteralInteger26.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result_LiteralInteger26.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52::LiteralInteger53
		addToElementRepository("LiteralInteger53", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52_LiteralInteger53);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52_LiteralInteger53.setName("LiteralInteger53");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52_LiteralInteger53.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52_LiteralInteger53.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a1_object::LiteralInteger62
		addToElementRepository("LiteralInteger62", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object_LiteralInteger62);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object_LiteralInteger62.setName("LiteralInteger62");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object_LiteralInteger62.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object_LiteralInteger62.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read b.p_result::LiteralInteger14
		addToElementRepository("LiteralInteger14", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result_LiteralInteger14);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result_LiteralInteger14.setName("LiteralInteger14");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result_LiteralInteger14.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result_LiteralInteger14.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a4_object::LiteralInteger78
		addToElementRepository("LiteralInteger78", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object_LiteralInteger78);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object_LiteralInteger78.setName("LiteralInteger78");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object_LiteralInteger78.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object_LiteralInteger78.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34::LiteralInteger36
		addToElementRepository("LiteralInteger36", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34_LiteralInteger36);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34_LiteralInteger36.setName("LiteralInteger36");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34_LiteralInteger36.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34_LiteralInteger36.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21::LiteralInteger23
		addToElementRepository("LiteralInteger23", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21_LiteralInteger23);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21_LiteralInteger23.setName("LiteralInteger23");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21_LiteralInteger23.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21_LiteralInteger23.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call p.setP()_v::LiteralInteger39
		addToElementRepository("LiteralInteger39", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger39);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger39.setName("LiteralInteger39");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger39.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger39.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63::LiteralInteger64
		addToElementRepository("LiteralInteger64", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63_LiteralInteger64);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63_LiteralInteger64.setName("LiteralInteger64");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63_LiteralInteger64.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63_LiteralInteger64.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value(4)::LiteralInteger10
		addToElementRepository("LiteralInteger10", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_LiteralInteger10);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_LiteralInteger10.setName("LiteralInteger10");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_LiteralInteger10.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_LiteralInteger10.setValue(4);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create C_result::LiteralInteger80
		addToElementRepository("LiteralInteger80", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result_LiteralInteger80);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result_LiteralInteger80.setName("LiteralInteger80");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result_LiteralInteger80.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result_LiteralInteger80.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42::LiteralInteger43
		addToElementRepository("LiteralInteger43", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42_LiteralInteger43);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42_LiteralInteger43.setName("LiteralInteger43");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42_LiteralInteger43.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42_LiteralInteger43.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103::LiteralInteger104
		addToElementRepository("LiteralInteger104", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103_LiteralInteger104);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103_LiteralInteger104.setName("LiteralInteger104");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103_LiteralInteger104.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103_LiteralInteger104.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read b.p_object::LiteralInteger16
		addToElementRepository("LiteralInteger16", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object_LiteralInteger16);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object_LiteralInteger16.setName("LiteralInteger16");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object_LiteralInteger16.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object_LiteralInteger16.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call p.setP()_v::LiteralInteger37
		addToElementRepository("LiteralInteger37", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger37);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger37.setName("LiteralInteger37");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger37.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger37.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value(4)_result::LiteralInteger8
		addToElementRepository("LiteralInteger8", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result_LiteralInteger8);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result_LiteralInteger8.setName("LiteralInteger8");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result_LiteralInteger8.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result_LiteralInteger8.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call testP_p::LiteralInteger32
		addToElementRepository("LiteralInteger32", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger32);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger32.setName("LiteralInteger32");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger32.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger32.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a3_object::LiteralInteger25
		addToElementRepository("LiteralInteger25", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object_LiteralInteger25);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object_LiteralInteger25.setName("LiteralInteger25");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object_LiteralInteger25.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object_LiteralInteger25.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set this.p_result::LiteralInteger111
		addToElementRepository("LiteralInteger111", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger111);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger111.setName("LiteralInteger111");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger111.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger111.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1::LiteralInteger3
		addToElementRepository("LiteralInteger3", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1_LiteralInteger3);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1_LiteralInteger3.setName("LiteralInteger3");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1_LiteralInteger3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1_LiteralInteger3.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set this.p_object::LiteralInteger108
		addToElementRepository("LiteralInteger108", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger108);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger108.setName("LiteralInteger108");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger108.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger108.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100::LiteralInteger102
		addToElementRepository("LiteralInteger102", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100_LiteralInteger102);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100_LiteralInteger102.setName("LiteralInteger102");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100_LiteralInteger102.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100_LiteralInteger102.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call p.setP()_target::LiteralInteger41
		addToElementRepository("LiteralInteger41", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralInteger41);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralInteger41.setName("LiteralInteger41");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralInteger41.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralInteger41.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.p_object::LiteralInteger83
		addToElementRepository("LiteralInteger83", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object_LiteralInteger83);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object_LiteralInteger83.setName("LiteralInteger83");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object_LiteralInteger83.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object_LiteralInteger83.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set this.p_value::LiteralInteger112
		addToElementRepository("LiteralInteger112", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger112);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger112.setName("LiteralInteger112");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger112.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger112.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result::LiteralInteger107
		addToElementRepository("LiteralInteger107", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger107);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger107.setName("LiteralInteger107");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger107.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger107.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11::LiteralInteger13
		addToElementRepository("LiteralInteger13", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11_LiteralInteger13);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11_LiteralInteger13.setName("LiteralInteger13");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11_LiteralInteger13.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11_LiteralInteger13.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.p_result::LiteralInteger84
		addToElementRepository("LiteralInteger84", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result_LiteralInteger84);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result_LiteralInteger84.setName("LiteralInteger84");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result_LiteralInteger84.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result_LiteralInteger84.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode::LiteralInteger114
		addToElementRepository("LiteralInteger114", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger114);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger114.setName("LiteralInteger114");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger114.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger114.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C()_target::LiteralInteger70
		addToElementRepository("LiteralInteger70", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target_LiteralInteger70);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target_LiteralInteger70.setName("LiteralInteger70");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target_LiteralInteger70.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target_LiteralInteger70.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71::LiteralInteger73
		addToElementRepository("LiteralInteger73", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71_LiteralInteger73);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71_LiteralInteger73.setName("LiteralInteger73");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71_LiteralInteger73.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71_LiteralInteger73.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89::LiteralInteger91
		addToElementRepository("LiteralInteger91", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89_LiteralInteger91);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89_LiteralInteger91.setName("LiteralInteger91");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89_LiteralInteger91.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89_LiteralInteger91.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49::LiteralInteger51
		addToElementRepository("LiteralInteger51", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49_LiteralInteger51);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49_LiteralInteger51.setName("LiteralInteger51");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49_LiteralInteger51.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49_LiteralInteger51.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18::LiteralInteger20
		addToElementRepository("LiteralInteger20", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18_LiteralInteger20);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18_LiteralInteger20.setName("LiteralInteger20");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18_LiteralInteger20.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18_LiteralInteger20.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a1_result::LiteralInteger59
		addToElementRepository("LiteralInteger59", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result_LiteralInteger59);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result_LiteralInteger59.setName("LiteralInteger59");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result_LiteralInteger59.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result_LiteralInteger59.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read a.b_result::LiteralInteger45
		addToElementRepository("LiteralInteger45", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result_LiteralInteger45);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result_LiteralInteger45.setName("LiteralInteger45");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result_LiteralInteger45.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result_LiteralInteger45.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a2_result::LiteralInteger6
		addToElementRepository("LiteralInteger6", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result_LiteralInteger6);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result_LiteralInteger6.setName("LiteralInteger6");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result_LiteralInteger6.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result_LiteralInteger6.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28::LiteralInteger29
		addToElementRepository("LiteralInteger29", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28_LiteralInteger29);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28_LiteralInteger29.setName("LiteralInteger29");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28_LiteralInteger29.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28_LiteralInteger29.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86::LiteralInteger87
		addToElementRepository("LiteralInteger87", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86_LiteralInteger87);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86_LiteralInteger87.setName("LiteralInteger87");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86_LiteralInteger87.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86_LiteralInteger87.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read a.b_object::LiteralInteger47
		addToElementRepository("LiteralInteger47", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object_LiteralInteger47);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object_LiteralInteger47.setName("LiteralInteger47");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object_LiteralInteger47.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object_LiteralInteger47.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92::LiteralInteger94
		addToElementRepository("LiteralInteger94", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92_LiteralInteger94);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92_LiteralInteger94.setName("LiteralInteger94");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92_LiteralInteger94.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92_LiteralInteger94.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a4_result::LiteralInteger75
		addToElementRepository("LiteralInteger75", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result_LiteralInteger75);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result_LiteralInteger75.setName("LiteralInteger75");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result_LiteralInteger75.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result_LiteralInteger75.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call testP_p::LiteralInteger33
		addToElementRepository("LiteralInteger33", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger33);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger33.setName("LiteralInteger33");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger33.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger33.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a2_object::LiteralInteger5
		addToElementRepository("LiteralInteger5", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object_LiteralInteger5);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object_LiteralInteger5.setName("LiteralInteger5");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object_LiteralInteger5.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object_LiteralInteger5.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C()_result::LiteralInteger68
		addToElementRepository("LiteralInteger68", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralInteger68);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralInteger68.setName("LiteralInteger68");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralInteger68.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralInteger68.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a1_result::LiteralUnlimitedNatural60
		addToElementRepository("LiteralUnlimitedNatural60", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result_LiteralUnlimitedNatural60);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result_LiteralUnlimitedNatural60.setName("LiteralUnlimitedNatural60");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result_LiteralUnlimitedNatural60.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result_LiteralUnlimitedNatural60.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result::LiteralUnlimitedNatural106
		addToElementRepository("LiteralUnlimitedNatural106", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural106);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural106.setName("LiteralUnlimitedNatural106");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural106.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural106.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a3_result::LiteralUnlimitedNatural27
		addToElementRepository("LiteralUnlimitedNatural27", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result_LiteralUnlimitedNatural27);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result_LiteralUnlimitedNatural27.setName("LiteralUnlimitedNatural27");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result_LiteralUnlimitedNatural27.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result_LiteralUnlimitedNatural27.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a4_object::LiteralUnlimitedNatural77
		addToElementRepository("LiteralUnlimitedNatural77", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object_LiteralUnlimitedNatural77);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object_LiteralUnlimitedNatural77.setName("LiteralUnlimitedNatural77");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object_LiteralUnlimitedNatural77.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object_LiteralUnlimitedNatural77.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C()_target::LiteralUnlimitedNatural69
		addToElementRepository("LiteralUnlimitedNatural69", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural69);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural69.setName("LiteralUnlimitedNatural69");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural69.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural69.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read a.b_object::LiteralUnlimitedNatural48
		addToElementRepository("LiteralUnlimitedNatural48", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural48);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural48.setName("LiteralUnlimitedNatural48");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural48.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural48.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a3_object::LiteralUnlimitedNatural24
		addToElementRepository("LiteralUnlimitedNatural24", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object_LiteralUnlimitedNatural24);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object_LiteralUnlimitedNatural24.setName("LiteralUnlimitedNatural24");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object_LiteralUnlimitedNatural24.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object_LiteralUnlimitedNatural24.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.p_result::LiteralUnlimitedNatural85
		addToElementRepository("LiteralUnlimitedNatural85", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural85);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural85.setName("LiteralUnlimitedNatural85");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural85.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural85.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create C_result::LiteralUnlimitedNatural81
		addToElementRepository("LiteralUnlimitedNatural81", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural81);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural81.setName("LiteralUnlimitedNatural81");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural81.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural81.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C()_result::LiteralUnlimitedNatural67
		addToElementRepository("LiteralUnlimitedNatural67", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural67);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural67.setName("LiteralUnlimitedNatural67");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural67.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural67.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural110
		addToElementRepository("LiteralUnlimitedNatural110", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural110);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural110.setName("LiteralUnlimitedNatural110");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural110.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural110.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural113
		addToElementRepository("LiteralUnlimitedNatural113", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural113);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural113.setName("LiteralUnlimitedNatural113");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural113.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural113.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value(4)_result::LiteralUnlimitedNatural9
		addToElementRepository("LiteralUnlimitedNatural9", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural9);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural9.setName("LiteralUnlimitedNatural9");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural9.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural9.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a4_result::LiteralUnlimitedNatural76
		addToElementRepository("LiteralUnlimitedNatural76", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result_LiteralUnlimitedNatural76);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result_LiteralUnlimitedNatural76.setName("LiteralUnlimitedNatural76");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result_LiteralUnlimitedNatural76.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result_LiteralUnlimitedNatural76.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read b.p_result::LiteralUnlimitedNatural15
		addToElementRepository("LiteralUnlimitedNatural15", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural15);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural15.setName("LiteralUnlimitedNatural15");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural15.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural15.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a2_object::LiteralUnlimitedNatural4
		addToElementRepository("LiteralUnlimitedNatural4", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object_LiteralUnlimitedNatural4);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object_LiteralUnlimitedNatural4.setName("LiteralUnlimitedNatural4");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object_LiteralUnlimitedNatural4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object_LiteralUnlimitedNatural4.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call testP_p::LiteralUnlimitedNatural31
		addToElementRepository("LiteralUnlimitedNatural31", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural31);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural31.setName("LiteralUnlimitedNatural31");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural31.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural31.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a1_object::LiteralUnlimitedNatural61
		addToElementRepository("LiteralUnlimitedNatural61", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object_LiteralUnlimitedNatural61);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object_LiteralUnlimitedNatural61.setName("LiteralUnlimitedNatural61");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object_LiteralUnlimitedNatural61.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object_LiteralUnlimitedNatural61.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.p_object::LiteralUnlimitedNatural82
		addToElementRepository("LiteralUnlimitedNatural82", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural82);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural82.setName("LiteralUnlimitedNatural82");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural82.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural82.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read b.p_object::LiteralUnlimitedNatural17
		addToElementRepository("LiteralUnlimitedNatural17", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural17);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural17.setName("LiteralUnlimitedNatural17");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural17.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural17.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read a.b_result::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural46);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural46.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call p.setP()_target::LiteralUnlimitedNatural40
		addToElementRepository("LiteralUnlimitedNatural40", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural40);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural40.setName("LiteralUnlimitedNatural40");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural40.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural40.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call p.setP()_v::LiteralUnlimitedNatural38
		addToElementRepository("LiteralUnlimitedNatural38", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural38);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural38.setName("LiteralUnlimitedNatural38");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural38.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural38.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a2_result::LiteralUnlimitedNatural7
		addToElementRepository("LiteralUnlimitedNatural7", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result_LiteralUnlimitedNatural7);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result_LiteralUnlimitedNatural7.setName("LiteralUnlimitedNatural7");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result_LiteralUnlimitedNatural7.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result_LiteralUnlimitedNatural7.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural109
		addToElementRepository("LiteralUnlimitedNatural109", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural109);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural109.setName("LiteralUnlimitedNatural109");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural109.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural109.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow1
		addToElementRepository("ObjectFlow1", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1.setName("ObjectFlow1");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow1_LiteralBoolean2);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity::ObjectFlow103
		addToElementRepository("ObjectFlow103", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103.setName("ObjectFlow103");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow103_LiteralBoolean105);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow63
		addToElementRepository("ObjectFlow63", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63.setName("ObjectFlow63");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_testP_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow63_LiteralBoolean65);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow11
		addToElementRepository("ObjectFlow11", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11.setName("ObjectFlow11");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__v);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow11_LiteralBoolean12);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow71
		addToElementRepository("ObjectFlow71", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71.setName("ObjectFlow71");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__target);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow71_LiteralBoolean72);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow18
		addToElementRepository("ObjectFlow18", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18.setName("ObjectFlow18");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow18_LiteralBoolean19);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow21
		addToElementRepository("ObjectFlow21", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21.setName("ObjectFlow21");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow21_LiteralBoolean22);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity::ObjectFlow100
		addToElementRepository("ObjectFlow100", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100.setName("ObjectFlow100");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_vParameterNode);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_ObjectFlow100_LiteralBoolean101);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow28
		addToElementRepository("ObjectFlow28", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28.setName("ObjectFlow28");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Call_p_setP__target);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow28_LiteralBoolean30);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow34
		addToElementRepository("ObjectFlow34", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34.setName("ObjectFlow34");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow34_LiteralBoolean35);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow42
		addToElementRepository("ObjectFlow42", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42.setName("ObjectFlow42");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow42_LiteralBoolean44);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow49
		addToElementRepository("ObjectFlow49", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49.setName("ObjectFlow49");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow49_LiteralBoolean50);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow52
		addToElementRepository("ObjectFlow52", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52.setName("ObjectFlow52");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow52_LiteralBoolean54);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow86
		addToElementRepository("ObjectFlow86", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86.setName("ObjectFlow86");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow86_LiteralBoolean88);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow89
		addToElementRepository("ObjectFlow89", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89.setName("ObjectFlow89");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow89_LiteralBoolean90);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow92
		addToElementRepository("ObjectFlow92", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92.setName("ObjectFlow92");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow92_LiteralBoolean93);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_PWP_Operation_main::ObjectFlow55
		addToElementRepository("ObjectFlow55", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55.setName("ObjectFlow55");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55.setSource(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55.setTarget(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55.setGuard(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_ObjectFlow55_LiteralBoolean57);
	}

	private void initializeOperation_Instances()
	{
		// Operation MultipleDelegation_MultipleConnector_P_PWP_Operation_C::C_C
		addToElementRepository("C_C", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C.setName("C");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C.addOwnedParameter(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_MultipleConnector_P_PWP_Operation_B::setP_Integer
		addToElementRepository("setP_Integer", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer.setName("setP");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer.addOwnedParameter(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer_v);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer.addMethod(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity);
		// Operation MultipleDelegation_MultipleConnector_P_PWP_Operation_I::setP_Integer
		addToElementRepository("setP_Integer", MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer.setName("setP");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer.addOwnedParameter(MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer_v);
		// Operation MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl::setP_Integer
		addToElementRepository("setP_Integer", MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer.setName("setP");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer.addOwnedParameter(MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer_v);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create C::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Create_C_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_C);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value(4)::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a4::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_A);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read b.p::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a1::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_A);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read a.b::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C()::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_C__result.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_C);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a3::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_A);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.a2::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_A);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read c.p::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl);
		// OutputPin MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set this.p::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_B);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport MultipleDelegation_MultipleConnector_P_PWP_Operation::PackageImport96
		addToElementRepository("PackageImport96", MultipleDelegation_MultipleConnector_P_PWP_Operation_PackageImport96);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer_v);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer_v.setName("v");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C_result);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C_result.setName("result");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C_result.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_C);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_C_C_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer_v);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer_v.setName("v");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP_p.setName("p");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_v);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_v.setName("v");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer_v);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer_v.setName("v");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializePort_Instances()
	{
		// Port MultipleDelegation_MultipleConnector_P_PWP_Operation_C::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p.setName("p");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p.setAggregation(AggregationKind.composite);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p.isService = true;
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p.addProvided(MultipleDelegation_MultipleConnector_P_PWP_Operation_I);
		// Port MultipleDelegation_MultipleConnector_P_PWP_Operation_A::q
		addToElementRepository("q", MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q.setName("q");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q.setAggregation(AggregationKind.composite);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q.isService = true;
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_q.addProvided(MultipleDelegation_MultipleConnector_P_PWP_Operation_I);
	}

	private void initializeProperty_Instances()
	{
		// Property MultipleDelegation_MultipleConnector_P_PWP_Operation_B::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p.setName("p");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p.setDefaultValue(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p_LiteralInteger115);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Operation_C::a4
		addToElementRepository("a4", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a4);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a4.setName("a4");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a4.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a4.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_A);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a4.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Operation_U::y
		addToElementRepository("y", MultipleDelegation_MultipleConnector_P_PWP_Operation_U_y);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_U_y.setName("y");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_U_y.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_U_y.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Operation_C::a2
		addToElementRepository("a2", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a2);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a2.setName("a2");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a2.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a2.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_A);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a2.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Operation_C::a3
		addToElementRepository("a3", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a3);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a3.setName("a3");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a3.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a3.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_A);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a3.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Operation_R::x
		addToElementRepository("x", MultipleDelegation_MultipleConnector_P_PWP_Operation_R_x);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_R_x.setName("x");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_R_x.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_R_x.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_B);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Operation_U::x
		addToElementRepository("x", MultipleDelegation_MultipleConnector_P_PWP_Operation_U_x);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_U_x.setName("x");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_U_x.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_U_x.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Operation_C::a1
		addToElementRepository("a1", MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a1);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a1.setName("a1");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a1.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a1.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_A);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a1.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Operation_A::b
		addToElementRepository("b", MultipleDelegation_MultipleConnector_P_PWP_Operation_A_b);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_b.setName("b");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_b.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_b.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_B);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_A_b.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_PWP_Operation_R::y
		addToElementRepository("y", MultipleDelegation_MultipleConnector_P_PWP_Operation_R_y);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_R_y.setName("y");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_R_y.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_PWP_Operation_R_y.setType(MultipleDelegation_MultipleConnector_P_PWP_Operation_IImpl);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity::this
		addToElementRepository("this", MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this.setName("this");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this.setResult(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_setPActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main::Read c.a4
		addToElementRepository("Read c.a4", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4.setName("Read c.a4");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a4);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4.setObject(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4.setResult(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a4_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main::Read c.a1
		addToElementRepository("Read c.a1", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1.setName("Read c.a1");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a1);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1.setObject(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1.setResult(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a1_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main::Read c.a2
		addToElementRepository("Read c.a2", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2.setName("Read c.a2");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a2);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2.setObject(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2.setResult(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a2_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main::Read a.b
		addToElementRepository("Read a.b", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b.setName("Read a.b");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Operation_A_b);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b.setObject(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b.setResult(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_a_b_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main::Read c.p
		addToElementRepository("Read c.p", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p.setName("Read c.p");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p.setObject(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p.setResult(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main::Read b.p
		addToElementRepository("Read b.p", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p.setName("Read b.p");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Operation_B_p);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p.setObject(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p.setResult(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_b_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main::Read c.a3
		addToElementRepository("Read c.a3", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3.setName("Read c.a3");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3.setStructuralFeature(MultipleDelegation_MultipleConnector_P_PWP_Operation_C_a3);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3.setObject(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_object);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3.setResult(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Read_c_a3_result);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction MultipleDelegation_MultipleConnector_P_PWP_Operation_main::Value(4)
		addToElementRepository("Value(4)", MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4.setName("Value(4)");
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4.setValue(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_LiteralInteger10);
		MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4.setResult(MultipleDelegation_MultipleConnector_P_PWP_Operation_main_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // MultipleDelegation_MultipleConnector_P_PWP_OperationModel
