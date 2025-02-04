/*
 * MultipleDelegation_MultipleConnector_P_P_OperationModel.java
 * 
 * Auto-generated file
 */
package MultipleDelegation_MultipleConnector_P_P_Operation;

import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.structuredclassifiers.Connector;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.InterfaceRealization;
import uml.activities.Activity;
import uml.actions.OutputPin;
import uml.actions.ReadStructuralFeatureAction;
import uml.actions.CallOperationAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.commonstructure.Comment;
import uml.simpleclassifiers.Interface;
import uml.classification.Operation;
import uml.classification.Parameter;
import uml.activities.ActivityParameterNode;
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

public class MultipleDelegation_MultipleConnector_P_P_OperationModel extends InMemoryModel
{
	private static MultipleDelegation_MultipleConnector_P_P_OperationModel instance;

	/*
	 * Model MultipleDelegation_MultipleConnector_P_P_Operation
	 */
	public Package MultipleDelegation_MultipleConnector_P_P_Operation = new Package();
		public Comment MultipleDelegation_MultipleConnector_P_P_Operation_Comment0 = new Comment();
		public Class_ MultipleDelegation_MultipleConnector_P_P_Operation_IImpl = new Class_();
			public InterfaceRealization MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_IRealization = new InterfaceRealization();
			public Operation MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer_v = new Parameter();
		public PackageImport MultipleDelegation_MultipleConnector_P_P_Operation_PackageImport1 = new PackageImport();
		public Comment MultipleDelegation_MultipleConnector_P_P_Operation_Comment2 = new Comment();
		public Interface MultipleDelegation_MultipleConnector_P_P_Operation_I = new Interface();
			public Operation MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer_v = new Parameter();
		public Class_ MultipleDelegation_MultipleConnector_P_P_Operation_C = new Class_();
			public Connector MultipleDelegation_MultipleConnector_P_P_Operation_C_s4 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s4_ConnectorEnd3 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s4_ConnectorEnd4 = new ConnectorEnd();
			public Connector MultipleDelegation_MultipleConnector_P_P_Operation_C_s1 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5 = new ConnectorEnd();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5_LiteralUnlimitedNatural6 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5_LiteralInteger7 = new LiteralInteger();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8 = new ConnectorEnd();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8_LiteralInteger9 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8_LiteralUnlimitedNatural10 = new LiteralUnlimitedNatural();
			public Property MultipleDelegation_MultipleConnector_P_P_Operation_C_b4 = new Property();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_C_b4_LiteralUnlimitedNatural11 = new LiteralUnlimitedNatural();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_C_b4_LiteralInteger12 = new LiteralInteger();
			public Port MultipleDelegation_MultipleConnector_P_P_Operation_C_p = new Port();
			public Property MultipleDelegation_MultipleConnector_P_P_Operation_C_b3 = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_C_b3_LiteralInteger13 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_C_b3_LiteralUnlimitedNatural14 = new LiteralUnlimitedNatural();
			public Connector MultipleDelegation_MultipleConnector_P_P_Operation_C_s2 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s2_ConnectorEnd15 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s2_ConnectorEnd16 = new ConnectorEnd();
			public Property MultipleDelegation_MultipleConnector_P_P_Operation_C_b1 = new Property();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_C_b1_LiteralUnlimitedNatural17 = new LiteralUnlimitedNatural();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_C_b1_LiteralInteger18 = new LiteralInteger();
			public Property MultipleDelegation_MultipleConnector_P_P_Operation_C_b2 = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_C_b2_LiteralInteger19 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_C_b2_LiteralUnlimitedNatural20 = new LiteralUnlimitedNatural();
			public Connector MultipleDelegation_MultipleConnector_P_P_Operation_C_s3 = new Connector();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s3_ConnectorEnd21 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s3_ConnectorEnd22 = new ConnectorEnd();
			public Operation MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C_result = new Parameter();
		public Class_ MultipleDelegation_MultipleConnector_P_P_Operation_B = new Class_();
			public Property MultipleDelegation_MultipleConnector_P_P_Operation_B_p = new Property();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_p_LiteralInteger23 = new LiteralInteger();
			public Operation MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer_v = new Parameter();
			public InterfaceRealization MultipleDelegation_MultipleConnector_P_P_Operation_B_IRealization = new InterfaceRealization();
			public Activity MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity = new Activity();
				public ReadSelfAction MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural24 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result_LiteralInteger25 = new LiteralInteger();
				public ActivityParameterNode MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger26 = new LiteralInteger();
				public AddStructuralFeatureValueAction MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger27 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural28 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger29 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural30 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural31 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger32 = new LiteralInteger();
				public Parameter MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_v = new Parameter();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33_LiteralInteger34 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33_LiteralBoolean35 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36_LiteralInteger37 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36_LiteralBoolean38 = new LiteralBoolean();
			public Operation MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B = new Operation();
				public Parameter MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B_result = new Parameter();
		public Activity MultipleDelegation_MultipleConnector_P_P_Operation_main = new Activity();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39_LiteralInteger40 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39_LiteralBoolean41 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42_LiteralBoolean43 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42_LiteralInteger44 = new LiteralInteger();
			public ControlFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow45 = new ControlFlow();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1 = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_result = new OutputPin();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object_LiteralInteger47 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48_LiteralInteger49 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48_LiteralBoolean50 = new LiteralBoolean();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3 = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result_LiteralInteger51 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result_LiteralUnlimitedNatural52 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object_LiteralInteger53 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object_LiteralUnlimitedNatural54 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55_LiteralBoolean56 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55_LiteralInteger57 = new LiteralInteger();
			public CallOperationAction MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP_ = new CallOperationAction();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger58 = new LiteralInteger();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger59 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural60 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target_LiteralInteger61 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural62 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63_LiteralInteger64 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63_LiteralBoolean65 = new LiteralBoolean();
			public CreateObjectAction MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C = new CreateObjectAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result_LiteralInteger66 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result_LiteralUnlimitedNatural67 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68_LiteralInteger69 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68_LiteralBoolean70 = new LiteralBoolean();
			public ForkNode MultipleDelegation_MultipleConnector_P_P_Operation_main_Fork_C = new ForkNode();
			public ValueSpecificationAction MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4 = new ValueSpecificationAction();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_LiteralInteger71 = new LiteralInteger();
				public OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result = new OutputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural72 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result_LiteralInteger73 = new LiteralInteger();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2 = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result_LiteralInteger74 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result_LiteralUnlimitedNatural75 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object_LiteralInteger76 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object_LiteralUnlimitedNatural77 = new LiteralUnlimitedNatural();
			public ControlFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow78 = new ControlFlow();
			public OpaqueBehavior MultipleDelegation_MultipleConnector_P_P_Operation_main_testP = new OpaqueBehavior();
				public Parameter MultipleDelegation_MultipleConnector_P_P_Operation_main_testP_p = new Parameter();
			public CallBehaviorAction MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP = new CallBehaviorAction();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralInteger79 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural80 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralInteger81 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82_LiteralInteger83 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82_LiteralBoolean84 = new LiteralBoolean();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result_LiteralInteger85 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result_LiteralUnlimitedNatural86 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object_LiteralUnlimitedNatural87 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object_LiteralInteger88 = new LiteralInteger();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4 = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result_LiteralInteger89 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result_LiteralUnlimitedNatural90 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object_LiteralUnlimitedNatural91 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object_LiteralInteger92 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93_LiteralInteger94 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93_LiteralBoolean95 = new LiteralBoolean();
			public ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result = new OutputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result_LiteralUnlimitedNatural96 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result_LiteralInteger97 = new LiteralInteger();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object = new InputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object_LiteralInteger98 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object_LiteralUnlimitedNatural99 = new LiteralUnlimitedNatural();
			public ControlFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow100 = new ControlFlow();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101_LiteralBoolean102 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101_LiteralInteger103 = new LiteralInteger();
			public ControlFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow104 = new ControlFlow();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105_LiteralInteger106 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105_LiteralBoolean107 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108_LiteralBoolean109 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108_LiteralInteger110 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111_LiteralBoolean112 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111_LiteralInteger113 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114_LiteralInteger115 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114_LiteralBoolean116 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117_LiteralBoolean118 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117_LiteralInteger119 = new LiteralInteger();
			public CallOperationAction MultipleDelegation_MultipleConnector_P_P_Operation_main_C_ = new CallOperationAction();
				public OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result = new OutputPin();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralInteger120 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralUnlimitedNatural121 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralInteger122 = new LiteralInteger();
				public InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target_LiteralUnlimitedNatural123 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target_LiteralInteger124 = new LiteralInteger();
		public Association MultipleDelegation_MultipleConnector_P_P_Operation_S = new Association();
			public Property MultipleDelegation_MultipleConnector_P_P_Operation_S_y = new Property();
			public Property MultipleDelegation_MultipleConnector_P_P_Operation_S_x = new Property();

	public static MultipleDelegation_MultipleConnector_P_P_OperationModel instance()
	{
		if (instance == null)
        {
            instance = new MultipleDelegation_MultipleConnector_P_P_OperationModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public MultipleDelegation_MultipleConnector_P_P_OperationModel()
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
		// Activity MultipleDelegation_MultipleConnector_P_P_Operation::main
		addToElementRepository("main", MultipleDelegation_MultipleConnector_P_P_Operation_main);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.setName("main");
		MultipleDelegation_MultipleConnector_P_P_Operation_main.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addOwnedBehavior(MultipleDelegation_MultipleConnector_P_P_Operation_main_testP);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_main_C_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow45);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow100);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow104);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow78);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82);
		MultipleDelegation_MultipleConnector_P_P_Operation_main.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117);
		// Activity MultipleDelegation_MultipleConnector_P_P_Operation_B::setPActivity
		addToElementRepository("setPActivity", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity.setName("setPActivity");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity.addOwnedParameter(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_v);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity.addNode(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity.addEdge(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode.setName("vParameterNode");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode.setParameter(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_v);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p.setName("Set this.p");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Operation_B_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p.setObject(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p.setValue(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p.setResult(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association MultipleDelegation_MultipleConnector_P_P_Operation::S
		addToElementRepository("S", MultipleDelegation_MultipleConnector_P_P_Operation_S);
		MultipleDelegation_MultipleConnector_P_P_Operation_S.setName("S");
		MultipleDelegation_MultipleConnector_P_P_Operation_S.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_S.addOwnedEnd(MultipleDelegation_MultipleConnector_P_P_Operation_S_x);
		MultipleDelegation_MultipleConnector_P_P_Operation_S.addOwnedEnd(MultipleDelegation_MultipleConnector_P_P_Operation_S_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction MultipleDelegation_MultipleConnector_P_P_Operation_main::Call testP
		addToElementRepository("Call testP", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP.setName("Call testP");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP.setBehavior(MultipleDelegation_MultipleConnector_P_P_Operation_main_testP);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP.addArgument(MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction MultipleDelegation_MultipleConnector_P_P_Operation_main::Call p.setP()
		addToElementRepository("Call p.setP()", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP_.setName("Call p.setP()");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP_.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP_.setOperation(MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP_.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP_.addArgument(MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v);
		// CallOperationAction MultipleDelegation_MultipleConnector_P_P_Operation_main::C()
		addToElementRepository("C()", MultipleDelegation_MultipleConnector_P_P_Operation_main_C_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C_.setName("C()");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C_.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C_.addResult(MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C_.setOperation(MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C_.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target);
	}

	private void initializeClass_Instances()
	{
		// Class MultipleDelegation_MultipleConnector_P_P_Operation::IImpl
		addToElementRepository("IImpl", MultipleDelegation_MultipleConnector_P_P_Operation_IImpl);
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl.setName("IImpl");
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl.addInterfaceRealization(MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_IRealization);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl.addOwnedOperation(MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer);
		// Class MultipleDelegation_MultipleConnector_P_P_Operation::C
		addToElementRepository("C", MultipleDelegation_MultipleConnector_P_P_Operation_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_C.setName("C");
		MultipleDelegation_MultipleConnector_P_P_Operation_C.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Operation_C_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Operation_C_b1);
		MultipleDelegation_MultipleConnector_P_P_Operation_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Operation_C_b2);
		MultipleDelegation_MultipleConnector_P_P_Operation_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Operation_C_b3);
		MultipleDelegation_MultipleConnector_P_P_Operation_C.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Operation_C_b4);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_C.addOwnedConnector(MultipleDelegation_MultipleConnector_P_P_Operation_C_s4);
		MultipleDelegation_MultipleConnector_P_P_Operation_C.addOwnedConnector(MultipleDelegation_MultipleConnector_P_P_Operation_C_s1);
		MultipleDelegation_MultipleConnector_P_P_Operation_C.addOwnedConnector(MultipleDelegation_MultipleConnector_P_P_Operation_C_s2);
		MultipleDelegation_MultipleConnector_P_P_Operation_C.addOwnedConnector(MultipleDelegation_MultipleConnector_P_P_Operation_C_s3);
		MultipleDelegation_MultipleConnector_P_P_Operation_C.addOwnedOperation(MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C);
		// Class MultipleDelegation_MultipleConnector_P_P_Operation::B
		addToElementRepository("B", MultipleDelegation_MultipleConnector_P_P_Operation_B);
		MultipleDelegation_MultipleConnector_P_P_Operation_B.setName("B");
		MultipleDelegation_MultipleConnector_P_P_Operation_B.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_B.addOwnedAttribute(MultipleDelegation_MultipleConnector_P_P_Operation_B_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_B.addOwnedBehavior(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity);
		MultipleDelegation_MultipleConnector_P_P_Operation_B.addInterfaceRealization(MultipleDelegation_MultipleConnector_P_P_Operation_B_IRealization);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_B.addOwnedOperation(MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B);
		MultipleDelegation_MultipleConnector_P_P_Operation_B.addOwnedOperation(MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer);
	}

	private void initializeComment_Instances()
	{
		// Comment MultipleDelegation_MultipleConnector_P_P_Operation::Comment0
		addToElementRepository("Comment0", MultipleDelegation_MultipleConnector_P_P_Operation_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment MultipleDelegation_MultipleConnector_P_P_Operation::Comment2
		addToElementRepository("Comment2", MultipleDelegation_MultipleConnector_P_P_Operation_Comment2);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector MultipleDelegation_MultipleConnector_P_P_Operation_C::s4
		addToElementRepository("s4", MultipleDelegation_MultipleConnector_P_P_Operation_C_s4);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s4.setName("s4");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s4.addEnd(MultipleDelegation_MultipleConnector_P_P_Operation_C_s4_ConnectorEnd3);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s4.addEnd(MultipleDelegation_MultipleConnector_P_P_Operation_C_s4_ConnectorEnd4);
		// Connector MultipleDelegation_MultipleConnector_P_P_Operation_C::s1
		addToElementRepository("s1", MultipleDelegation_MultipleConnector_P_P_Operation_C_s1);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1.setName("s1");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1.addEnd(MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1.addEnd(MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1.setType(MultipleDelegation_MultipleConnector_P_P_Operation_S);
		// Connector MultipleDelegation_MultipleConnector_P_P_Operation_C::s2
		addToElementRepository("s2", MultipleDelegation_MultipleConnector_P_P_Operation_C_s2);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s2.setName("s2");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s2.addEnd(MultipleDelegation_MultipleConnector_P_P_Operation_C_s2_ConnectorEnd15);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s2.addEnd(MultipleDelegation_MultipleConnector_P_P_Operation_C_s2_ConnectorEnd16);
		// Connector MultipleDelegation_MultipleConnector_P_P_Operation_C::s3
		addToElementRepository("s3", MultipleDelegation_MultipleConnector_P_P_Operation_C_s3);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s3.setName("s3");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s3.addEnd(MultipleDelegation_MultipleConnector_P_P_Operation_C_s3_ConnectorEnd21);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s3.addEnd(MultipleDelegation_MultipleConnector_P_P_Operation_C_s3_ConnectorEnd22);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s3::ConnectorEnd21
		addToElementRepository("ConnectorEnd21", MultipleDelegation_MultipleConnector_P_P_Operation_C_s3_ConnectorEnd21);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s3_ConnectorEnd21.setRole(MultipleDelegation_MultipleConnector_P_P_Operation_C_p);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s4::ConnectorEnd3
		addToElementRepository("ConnectorEnd3", MultipleDelegation_MultipleConnector_P_P_Operation_C_s4_ConnectorEnd3);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s4_ConnectorEnd3.setRole(MultipleDelegation_MultipleConnector_P_P_Operation_C_p);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s4::ConnectorEnd4
		addToElementRepository("ConnectorEnd4", MultipleDelegation_MultipleConnector_P_P_Operation_C_s4_ConnectorEnd4);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s4_ConnectorEnd4.setRole(MultipleDelegation_MultipleConnector_P_P_Operation_C_b4);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s2::ConnectorEnd15
		addToElementRepository("ConnectorEnd15", MultipleDelegation_MultipleConnector_P_P_Operation_C_s2_ConnectorEnd15);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s2_ConnectorEnd15.setRole(MultipleDelegation_MultipleConnector_P_P_Operation_C_p);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s1::ConnectorEnd5
		addToElementRepository("ConnectorEnd5", MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5.setRole(MultipleDelegation_MultipleConnector_P_P_Operation_C_b1);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s2::ConnectorEnd16
		addToElementRepository("ConnectorEnd16", MultipleDelegation_MultipleConnector_P_P_Operation_C_s2_ConnectorEnd16);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s2_ConnectorEnd16.setRole(MultipleDelegation_MultipleConnector_P_P_Operation_C_b2);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s3::ConnectorEnd22
		addToElementRepository("ConnectorEnd22", MultipleDelegation_MultipleConnector_P_P_Operation_C_s3_ConnectorEnd22);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s3_ConnectorEnd22.setRole(MultipleDelegation_MultipleConnector_P_P_Operation_C_b3);
		// ConnectorEnd MultipleDelegation_MultipleConnector_P_P_Operation_C_s1::ConnectorEnd8
		addToElementRepository("ConnectorEnd8", MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8.setRole(MultipleDelegation_MultipleConnector_P_P_Operation_C_p);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ControlFlow104
		addToElementRepository("ControlFlow104", MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow104);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow104.setName("ControlFlow104");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow104.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow104.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow104.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ControlFlow45
		addToElementRepository("ControlFlow45", MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow45);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow45.setName("ControlFlow45");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow45.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow45.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow45.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ControlFlow78
		addToElementRepository("ControlFlow78", MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow78);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow78.setName("ControlFlow78");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow78.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow78.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow78.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3);
		// ControlFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ControlFlow100
		addToElementRepository("ControlFlow100", MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow100);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow100.setName("ControlFlow100");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow100.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow100.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ControlFlow100.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction MultipleDelegation_MultipleConnector_P_P_Operation_main::Create C
		addToElementRepository("Create C", MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C.setName("Create C");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C.setClassifier(MultipleDelegation_MultipleConnector_P_P_Operation_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C.setResult(MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode MultipleDelegation_MultipleConnector_P_P_Operation_main::Fork C
		addToElementRepository("Fork C", MultipleDelegation_MultipleConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Fork_C.setName("Fork C");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Fork_C.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior MultipleDelegation_MultipleConnector_P_P_Operation_main::testP
		addToElementRepository("testP", MultipleDelegation_MultipleConnector_P_P_Operation_main_testP);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_testP.setName("testP");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_testP.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_testP.addOwnedParameter(MultipleDelegation_MultipleConnector_P_P_Operation_main_testP_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_testP.addLanguage("Java");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_testP.addLanguage("Import");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_testP.addBody("if(index == 1) 	{ 		System.out.println(\"Asserting c.b1.p == 4 || c.b2.p == 4 || c.b3.p == 4 || c.b4.p == 4\"); 	}  	// For some reason, during the first execution of the expansion region, its body is actually executed twice. 	// Because of that, the body is actually executaed 5 times in total. This if-statement covers that up until solved. 	if (index <= MAX_INDEX) 	{ 		// Test parameter p 		int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 		Debug.println(\"[doBody] argument p = \" + p); 	 		System.out.println( \"c.b\" + index + \".p == \" + p); 		success = success || (p == 4);  		if(index == MAX_INDEX) 		{  			System.out.print(\"Operation call delegated: \");  			if(success) 			{ 				System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 			} 			else 			{ 				System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 			} 		} 	}  	index++;");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set this.p::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read b.p::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b2::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object.setType(MultipleDelegation_MultipleConnector_P_P_Operation_C);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b3::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object.setType(MultipleDelegation_MultipleConnector_P_P_Operation_C);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_C()::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target.setName("target");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target.setType(MultipleDelegation_MultipleConnector_P_P_Operation_C);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b1::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object.setType(MultipleDelegation_MultipleConnector_P_P_Operation_C);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Call testP::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p.setName("p");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Call p.setP()::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v.setName("v");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b4::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object.setType(MultipleDelegation_MultipleConnector_P_P_Operation_C);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set this.p::value
		addToElementRepository("value", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value.setName("value");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.p::object
		addToElementRepository("object", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object.setName("object");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object.setType(MultipleDelegation_MultipleConnector_P_P_Operation_C);
		// InputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Call p.setP()::target
		addToElementRepository("target", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target.setName("target");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target.setType(MultipleDelegation_MultipleConnector_P_P_Operation_I);
	}

	private void initializeInterface_Instances()
	{
		// Interface MultipleDelegation_MultipleConnector_P_P_Operation::I
		addToElementRepository("I", MultipleDelegation_MultipleConnector_P_P_Operation_I);
		MultipleDelegation_MultipleConnector_P_P_Operation_I.setName("I");
		MultipleDelegation_MultipleConnector_P_P_Operation_I.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_I.addOwnedOperation(MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization MultipleDelegation_MultipleConnector_P_P_Operation_IImpl::IRealization
		addToElementRepository("IRealization", MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_IRealization);
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_IRealization.setName("IRealization");
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_IRealization.setContract(MultipleDelegation_MultipleConnector_P_P_Operation_I);
		// InterfaceRealization MultipleDelegation_MultipleConnector_P_P_Operation_B::IRealization
		addToElementRepository("IRealization", MultipleDelegation_MultipleConnector_P_P_Operation_B_IRealization);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_IRealization.setName("IRealization");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_IRealization.setContract(MultipleDelegation_MultipleConnector_P_P_Operation_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101::LiteralBoolean102
		addToElementRepository("LiteralBoolean102", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101_LiteralBoolean102);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101_LiteralBoolean102.setName("LiteralBoolean102");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101_LiteralBoolean102.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101_LiteralBoolean102.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55::LiteralBoolean56
		addToElementRepository("LiteralBoolean56", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55_LiteralBoolean56);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55_LiteralBoolean56.setName("LiteralBoolean56");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55_LiteralBoolean56.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55_LiteralBoolean56.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108::LiteralBoolean109
		addToElementRepository("LiteralBoolean109", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108_LiteralBoolean109);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108_LiteralBoolean109.setName("LiteralBoolean109");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108_LiteralBoolean109.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108_LiteralBoolean109.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33::LiteralBoolean35
		addToElementRepository("LiteralBoolean35", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33_LiteralBoolean35);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33_LiteralBoolean35.setName("LiteralBoolean35");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33_LiteralBoolean35.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33_LiteralBoolean35.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105::LiteralBoolean107
		addToElementRepository("LiteralBoolean107", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105_LiteralBoolean107);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105_LiteralBoolean107.setName("LiteralBoolean107");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105_LiteralBoolean107.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105_LiteralBoolean107.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68::LiteralBoolean70
		addToElementRepository("LiteralBoolean70", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68_LiteralBoolean70);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68_LiteralBoolean70.setName("LiteralBoolean70");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68_LiteralBoolean70.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68_LiteralBoolean70.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117::LiteralBoolean118
		addToElementRepository("LiteralBoolean118", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117_LiteralBoolean118);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117_LiteralBoolean118.setName("LiteralBoolean118");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117_LiteralBoolean118.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117_LiteralBoolean118.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36::LiteralBoolean38
		addToElementRepository("LiteralBoolean38", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36_LiteralBoolean38);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36_LiteralBoolean38.setName("LiteralBoolean38");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36_LiteralBoolean38.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36_LiteralBoolean38.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42::LiteralBoolean43
		addToElementRepository("LiteralBoolean43", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42_LiteralBoolean43);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42_LiteralBoolean43.setName("LiteralBoolean43");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42_LiteralBoolean43.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42_LiteralBoolean43.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111::LiteralBoolean112
		addToElementRepository("LiteralBoolean112", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111_LiteralBoolean112);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111_LiteralBoolean112.setName("LiteralBoolean112");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111_LiteralBoolean112.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111_LiteralBoolean112.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114::LiteralBoolean116
		addToElementRepository("LiteralBoolean116", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114_LiteralBoolean116);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114_LiteralBoolean116.setName("LiteralBoolean116");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114_LiteralBoolean116.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114_LiteralBoolean116.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48::LiteralBoolean50
		addToElementRepository("LiteralBoolean50", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48_LiteralBoolean50);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48_LiteralBoolean50.setName("LiteralBoolean50");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48_LiteralBoolean50.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48_LiteralBoolean50.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93::LiteralBoolean95
		addToElementRepository("LiteralBoolean95", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93_LiteralBoolean95);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93_LiteralBoolean95.setName("LiteralBoolean95");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93_LiteralBoolean95.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93_LiteralBoolean95.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63::LiteralBoolean65
		addToElementRepository("LiteralBoolean65", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63_LiteralBoolean65);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63_LiteralBoolean65.setName("LiteralBoolean65");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63_LiteralBoolean65.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63_LiteralBoolean65.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39::LiteralBoolean41
		addToElementRepository("LiteralBoolean41", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39_LiteralBoolean41);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39_LiteralBoolean41.setName("LiteralBoolean41");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39_LiteralBoolean41.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39_LiteralBoolean41.setValue(true);
		// LiteralBoolean MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82::LiteralBoolean84
		addToElementRepository("LiteralBoolean84", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82_LiteralBoolean84);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82_LiteralBoolean84.setName("LiteralBoolean84");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82_LiteralBoolean84.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82_LiteralBoolean84.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set this.p_result::LiteralInteger27
		addToElementRepository("LiteralInteger27", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger27);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger27.setName("LiteralInteger27");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger27.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger27.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Call testP_p::LiteralInteger79
		addToElementRepository("LiteralInteger79", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralInteger79);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralInteger79.setName("LiteralInteger79");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralInteger79.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralInteger79.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82::LiteralInteger83
		addToElementRepository("LiteralInteger83", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82_LiteralInteger83);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82_LiteralInteger83.setName("LiteralInteger83");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82_LiteralInteger83.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82_LiteralInteger83.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_C()_target::LiteralInteger124
		addToElementRepository("LiteralInteger124", MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target_LiteralInteger124);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target_LiteralInteger124.setName("LiteralInteger124");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target_LiteralInteger124.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target_LiteralInteger124.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b3_result::LiteralInteger51
		addToElementRepository("LiteralInteger51", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result_LiteralInteger51);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result_LiteralInteger51.setName("LiteralInteger51");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result_LiteralInteger51.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result_LiteralInteger51.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read b.p_result::LiteralInteger97
		addToElementRepository("LiteralInteger97", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result_LiteralInteger97);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result_LiteralInteger97.setName("LiteralInteger97");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result_LiteralInteger97.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result_LiteralInteger97.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_C()_result::LiteralInteger120
		addToElementRepository("LiteralInteger120", MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralInteger120);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralInteger120.setName("LiteralInteger120");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralInteger120.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralInteger120.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36::LiteralInteger37
		addToElementRepository("LiteralInteger37", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36_LiteralInteger37);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36_LiteralInteger37.setName("LiteralInteger37");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36_LiteralInteger37.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36_LiteralInteger37.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Create C_result::LiteralInteger66
		addToElementRepository("LiteralInteger66", MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result_LiteralInteger66);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result_LiteralInteger66.setName("LiteralInteger66");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result_LiteralInteger66.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result_LiteralInteger66.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode::LiteralInteger26
		addToElementRepository("LiteralInteger26", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger26);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger26.setName("LiteralInteger26");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger26.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger26.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68::LiteralInteger69
		addToElementRepository("LiteralInteger69", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68_LiteralInteger69);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68_LiteralInteger69.setName("LiteralInteger69");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68_LiteralInteger69.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68_LiteralInteger69.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.p_result::LiteralInteger85
		addToElementRepository("LiteralInteger85", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result_LiteralInteger85);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result_LiteralInteger85.setName("LiteralInteger85");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result_LiteralInteger85.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result_LiteralInteger85.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93::LiteralInteger94
		addToElementRepository("LiteralInteger94", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93_LiteralInteger94);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93_LiteralInteger94.setName("LiteralInteger94");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93_LiteralInteger94.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93_LiteralInteger94.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result::LiteralInteger25
		addToElementRepository("LiteralInteger25", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result_LiteralInteger25);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result_LiteralInteger25.setName("LiteralInteger25");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result_LiteralInteger25.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result_LiteralInteger25.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.p_object::LiteralInteger88
		addToElementRepository("LiteralInteger88", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object_LiteralInteger88);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object_LiteralInteger88.setName("LiteralInteger88");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object_LiteralInteger88.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object_LiteralInteger88.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_C_b3::LiteralInteger13
		addToElementRepository("LiteralInteger13", MultipleDelegation_MultipleConnector_P_P_Operation_C_b3_LiteralInteger13);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b3_LiteralInteger13.setName("LiteralInteger13");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b3_LiteralInteger13.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b3_LiteralInteger13.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63::LiteralInteger64
		addToElementRepository("LiteralInteger64", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63_LiteralInteger64);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63_LiteralInteger64.setName("LiteralInteger64");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63_LiteralInteger64.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63_LiteralInteger64.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_p::LiteralInteger23
		addToElementRepository("LiteralInteger23", MultipleDelegation_MultipleConnector_P_P_Operation_B_p_LiteralInteger23);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_p_LiteralInteger23.setName("LiteralInteger23");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_p_LiteralInteger23.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_p_LiteralInteger23.setValue(0);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Value(4)::LiteralInteger71
		addToElementRepository("LiteralInteger71", MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_LiteralInteger71);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_LiteralInteger71.setName("LiteralInteger71");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_LiteralInteger71.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_LiteralInteger71.setValue(4);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114::LiteralInteger115
		addToElementRepository("LiteralInteger115", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114_LiteralInteger115);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114_LiteralInteger115.setName("LiteralInteger115");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114_LiteralInteger115.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114_LiteralInteger115.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5::LiteralInteger7
		addToElementRepository("LiteralInteger7", MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5_LiteralInteger7);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5_LiteralInteger7.setName("LiteralInteger7");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5_LiteralInteger7.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5_LiteralInteger7.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111::LiteralInteger113
		addToElementRepository("LiteralInteger113", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111_LiteralInteger113);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111_LiteralInteger113.setName("LiteralInteger113");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111_LiteralInteger113.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111_LiteralInteger113.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_C_b2::LiteralInteger19
		addToElementRepository("LiteralInteger19", MultipleDelegation_MultipleConnector_P_P_Operation_C_b2_LiteralInteger19);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b2_LiteralInteger19.setName("LiteralInteger19");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b2_LiteralInteger19.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b2_LiteralInteger19.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55::LiteralInteger57
		addToElementRepository("LiteralInteger57", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55_LiteralInteger57);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55_LiteralInteger57.setName("LiteralInteger57");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55_LiteralInteger57.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55_LiteralInteger57.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Call p.setP()_v::LiteralInteger58
		addToElementRepository("LiteralInteger58", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger58);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger58.setName("LiteralInteger58");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger58.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger58.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108::LiteralInteger110
		addToElementRepository("LiteralInteger110", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108_LiteralInteger110);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108_LiteralInteger110.setName("LiteralInteger110");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108_LiteralInteger110.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108_LiteralInteger110.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Call testP_p::LiteralInteger81
		addToElementRepository("LiteralInteger81", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralInteger81);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralInteger81.setName("LiteralInteger81");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralInteger81.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralInteger81.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Value(4)_result::LiteralInteger73
		addToElementRepository("LiteralInteger73", MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result_LiteralInteger73);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result_LiteralInteger73.setName("LiteralInteger73");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result_LiteralInteger73.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result_LiteralInteger73.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set this.p_object::LiteralInteger29
		addToElementRepository("LiteralInteger29", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger29);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger29.setName("LiteralInteger29");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger29.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger29.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b3_object::LiteralInteger53
		addToElementRepository("LiteralInteger53", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object_LiteralInteger53);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object_LiteralInteger53.setName("LiteralInteger53");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object_LiteralInteger53.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object_LiteralInteger53.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33::LiteralInteger34
		addToElementRepository("LiteralInteger34", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33_LiteralInteger34);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33_LiteralInteger34.setName("LiteralInteger34");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33_LiteralInteger34.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33_LiteralInteger34.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b4_result::LiteralInteger89
		addToElementRepository("LiteralInteger89", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result_LiteralInteger89);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result_LiteralInteger89.setName("LiteralInteger89");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result_LiteralInteger89.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result_LiteralInteger89.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read b.p_object::LiteralInteger98
		addToElementRepository("LiteralInteger98", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object_LiteralInteger98);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object_LiteralInteger98.setName("LiteralInteger98");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object_LiteralInteger98.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object_LiteralInteger98.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_C_b1::LiteralInteger18
		addToElementRepository("LiteralInteger18", MultipleDelegation_MultipleConnector_P_P_Operation_C_b1_LiteralInteger18);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b1_LiteralInteger18.setName("LiteralInteger18");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b1_LiteralInteger18.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b1_LiteralInteger18.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117::LiteralInteger119
		addToElementRepository("LiteralInteger119", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117_LiteralInteger119);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117_LiteralInteger119.setName("LiteralInteger119");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117_LiteralInteger119.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117_LiteralInteger119.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_C_b4::LiteralInteger12
		addToElementRepository("LiteralInteger12", MultipleDelegation_MultipleConnector_P_P_Operation_C_b4_LiteralInteger12);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b4_LiteralInteger12.setName("LiteralInteger12");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b4_LiteralInteger12.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b4_LiteralInteger12.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8::LiteralInteger9
		addToElementRepository("LiteralInteger9", MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8_LiteralInteger9);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8_LiteralInteger9.setName("LiteralInteger9");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8_LiteralInteger9.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8_LiteralInteger9.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105::LiteralInteger106
		addToElementRepository("LiteralInteger106", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105_LiteralInteger106);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105_LiteralInteger106.setName("LiteralInteger106");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105_LiteralInteger106.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105_LiteralInteger106.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b1_object::LiteralInteger47
		addToElementRepository("LiteralInteger47", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object_LiteralInteger47);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object_LiteralInteger47.setName("LiteralInteger47");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object_LiteralInteger47.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object_LiteralInteger47.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set this.p_value::LiteralInteger32
		addToElementRepository("LiteralInteger32", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger32);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger32.setName("LiteralInteger32");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger32.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger32.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39::LiteralInteger40
		addToElementRepository("LiteralInteger40", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39_LiteralInteger40);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39_LiteralInteger40.setName("LiteralInteger40");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39_LiteralInteger40.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39_LiteralInteger40.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101::LiteralInteger103
		addToElementRepository("LiteralInteger103", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101_LiteralInteger103);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101_LiteralInteger103.setName("LiteralInteger103");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101_LiteralInteger103.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101_LiteralInteger103.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b2_result::LiteralInteger74
		addToElementRepository("LiteralInteger74", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result_LiteralInteger74);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result_LiteralInteger74.setName("LiteralInteger74");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result_LiteralInteger74.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result_LiteralInteger74.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Call p.setP()_target::LiteralInteger61
		addToElementRepository("LiteralInteger61", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target_LiteralInteger61);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target_LiteralInteger61.setName("LiteralInteger61");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target_LiteralInteger61.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target_LiteralInteger61.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b2_object::LiteralInteger76
		addToElementRepository("LiteralInteger76", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object_LiteralInteger76);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object_LiteralInteger76.setName("LiteralInteger76");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object_LiteralInteger76.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object_LiteralInteger76.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48::LiteralInteger49
		addToElementRepository("LiteralInteger49", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48_LiteralInteger49);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48_LiteralInteger49.setName("LiteralInteger49");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48_LiteralInteger49.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48_LiteralInteger49.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b4_object::LiteralInteger92
		addToElementRepository("LiteralInteger92", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object_LiteralInteger92);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object_LiteralInteger92.setName("LiteralInteger92");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object_LiteralInteger92.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object_LiteralInteger92.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42::LiteralInteger44
		addToElementRepository("LiteralInteger44", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42_LiteralInteger44);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42_LiteralInteger44.setName("LiteralInteger44");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42_LiteralInteger44.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42_LiteralInteger44.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_C()_result::LiteralInteger122
		addToElementRepository("LiteralInteger122", MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralInteger122);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralInteger122.setName("LiteralInteger122");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralInteger122.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralInteger122.setValue(1);
		// LiteralInteger MultipleDelegation_MultipleConnector_P_P_Operation_main_Call p.setP()_v::LiteralInteger59
		addToElementRepository("LiteralInteger59", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger59);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger59.setName("LiteralInteger59");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger59.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger59.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Call testP_p::LiteralUnlimitedNatural80
		addToElementRepository("LiteralUnlimitedNatural80", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural80);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural80.setName("LiteralUnlimitedNatural80");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural80.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural80.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b2_object::LiteralUnlimitedNatural77
		addToElementRepository("LiteralUnlimitedNatural77", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object_LiteralUnlimitedNatural77);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object_LiteralUnlimitedNatural77.setName("LiteralUnlimitedNatural77");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object_LiteralUnlimitedNatural77.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object_LiteralUnlimitedNatural77.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Create C_result::LiteralUnlimitedNatural67
		addToElementRepository("LiteralUnlimitedNatural67", MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result_LiteralUnlimitedNatural67);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result_LiteralUnlimitedNatural67.setName("LiteralUnlimitedNatural67");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result_LiteralUnlimitedNatural67.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result_LiteralUnlimitedNatural67.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result::LiteralUnlimitedNatural24
		addToElementRepository("LiteralUnlimitedNatural24", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural24);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural24.setName("LiteralUnlimitedNatural24");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural24.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural24.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_C_b3::LiteralUnlimitedNatural14
		addToElementRepository("LiteralUnlimitedNatural14", MultipleDelegation_MultipleConnector_P_P_Operation_C_b3_LiteralUnlimitedNatural14);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b3_LiteralUnlimitedNatural14.setName("LiteralUnlimitedNatural14");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b3_LiteralUnlimitedNatural14.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b3_LiteralUnlimitedNatural14.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural31
		addToElementRepository("LiteralUnlimitedNatural31", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural31);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural31.setName("LiteralUnlimitedNatural31");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural31.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural31.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b4_object::LiteralUnlimitedNatural91
		addToElementRepository("LiteralUnlimitedNatural91", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object_LiteralUnlimitedNatural91);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object_LiteralUnlimitedNatural91.setName("LiteralUnlimitedNatural91");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object_LiteralUnlimitedNatural91.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object_LiteralUnlimitedNatural91.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_C_b2::LiteralUnlimitedNatural20
		addToElementRepository("LiteralUnlimitedNatural20", MultipleDelegation_MultipleConnector_P_P_Operation_C_b2_LiteralUnlimitedNatural20);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b2_LiteralUnlimitedNatural20.setName("LiteralUnlimitedNatural20");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b2_LiteralUnlimitedNatural20.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b2_LiteralUnlimitedNatural20.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8::LiteralUnlimitedNatural10
		addToElementRepository("LiteralUnlimitedNatural10", MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8_LiteralUnlimitedNatural10);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8_LiteralUnlimitedNatural10.setName("LiteralUnlimitedNatural10");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8_LiteralUnlimitedNatural10.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd8_LiteralUnlimitedNatural10.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b3_result::LiteralUnlimitedNatural52
		addToElementRepository("LiteralUnlimitedNatural52", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result_LiteralUnlimitedNatural52);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result_LiteralUnlimitedNatural52.setName("LiteralUnlimitedNatural52");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result_LiteralUnlimitedNatural52.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result_LiteralUnlimitedNatural52.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Call p.setP()_v::LiteralUnlimitedNatural60
		addToElementRepository("LiteralUnlimitedNatural60", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural60);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural60.setName("LiteralUnlimitedNatural60");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural60.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural60.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Value(4)_result::LiteralUnlimitedNatural72
		addToElementRepository("LiteralUnlimitedNatural72", MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural72);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural72.setName("LiteralUnlimitedNatural72");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural72.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural72.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.p_object::LiteralUnlimitedNatural87
		addToElementRepository("LiteralUnlimitedNatural87", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object_LiteralUnlimitedNatural87);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object_LiteralUnlimitedNatural87.setName("LiteralUnlimitedNatural87");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object_LiteralUnlimitedNatural87.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object_LiteralUnlimitedNatural87.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_C()_result::LiteralUnlimitedNatural121
		addToElementRepository("LiteralUnlimitedNatural121", MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralUnlimitedNatural121);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralUnlimitedNatural121.setName("LiteralUnlimitedNatural121");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralUnlimitedNatural121.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result_LiteralUnlimitedNatural121.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_C_b4::LiteralUnlimitedNatural11
		addToElementRepository("LiteralUnlimitedNatural11", MultipleDelegation_MultipleConnector_P_P_Operation_C_b4_LiteralUnlimitedNatural11);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b4_LiteralUnlimitedNatural11.setName("LiteralUnlimitedNatural11");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b4_LiteralUnlimitedNatural11.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b4_LiteralUnlimitedNatural11.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b3_object::LiteralUnlimitedNatural54
		addToElementRepository("LiteralUnlimitedNatural54", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object_LiteralUnlimitedNatural54);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object_LiteralUnlimitedNatural54.setName("LiteralUnlimitedNatural54");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object_LiteralUnlimitedNatural54.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object_LiteralUnlimitedNatural54.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Call p.setP()_target::LiteralUnlimitedNatural62
		addToElementRepository("LiteralUnlimitedNatural62", MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural62);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural62.setName("LiteralUnlimitedNatural62");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural62.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural62.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b1_object::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object_LiteralUnlimitedNatural46);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object_LiteralUnlimitedNatural46.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_C()_target::LiteralUnlimitedNatural123
		addToElementRepository("LiteralUnlimitedNatural123", MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target_LiteralUnlimitedNatural123);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target_LiteralUnlimitedNatural123.setName("LiteralUnlimitedNatural123");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target_LiteralUnlimitedNatural123.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target_LiteralUnlimitedNatural123.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read b.p_result::LiteralUnlimitedNatural96
		addToElementRepository("LiteralUnlimitedNatural96", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result_LiteralUnlimitedNatural96);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result_LiteralUnlimitedNatural96.setName("LiteralUnlimitedNatural96");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result_LiteralUnlimitedNatural96.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result_LiteralUnlimitedNatural96.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_C_b1::LiteralUnlimitedNatural17
		addToElementRepository("LiteralUnlimitedNatural17", MultipleDelegation_MultipleConnector_P_P_Operation_C_b1_LiteralUnlimitedNatural17);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b1_LiteralUnlimitedNatural17.setName("LiteralUnlimitedNatural17");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b1_LiteralUnlimitedNatural17.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b1_LiteralUnlimitedNatural17.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b2_result::LiteralUnlimitedNatural75
		addToElementRepository("LiteralUnlimitedNatural75", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result_LiteralUnlimitedNatural75);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result_LiteralUnlimitedNatural75.setName("LiteralUnlimitedNatural75");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result_LiteralUnlimitedNatural75.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result_LiteralUnlimitedNatural75.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.p_result::LiteralUnlimitedNatural86
		addToElementRepository("LiteralUnlimitedNatural86", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result_LiteralUnlimitedNatural86);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result_LiteralUnlimitedNatural86.setName("LiteralUnlimitedNatural86");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result_LiteralUnlimitedNatural86.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result_LiteralUnlimitedNatural86.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural28
		addToElementRepository("LiteralUnlimitedNatural28", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural28);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural28.setName("LiteralUnlimitedNatural28");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural28.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural28.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural30
		addToElementRepository("LiteralUnlimitedNatural30", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural30);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural30.setName("LiteralUnlimitedNatural30");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural30.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural30.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5::LiteralUnlimitedNatural6
		addToElementRepository("LiteralUnlimitedNatural6", MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5_LiteralUnlimitedNatural6);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5_LiteralUnlimitedNatural6.setName("LiteralUnlimitedNatural6");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5_LiteralUnlimitedNatural6.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_s1_ConnectorEnd5_LiteralUnlimitedNatural6.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b4_result::LiteralUnlimitedNatural90
		addToElementRepository("LiteralUnlimitedNatural90", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result_LiteralUnlimitedNatural90);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result_LiteralUnlimitedNatural90.setName("LiteralUnlimitedNatural90");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result_LiteralUnlimitedNatural90.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result_LiteralUnlimitedNatural90.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_MultipleConnector_P_P_Operation_main_Read b.p_object::LiteralUnlimitedNatural99
		addToElementRepository("LiteralUnlimitedNatural99", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object_LiteralUnlimitedNatural99);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object_LiteralUnlimitedNatural99.setName("LiteralUnlimitedNatural99");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object_LiteralUnlimitedNatural99.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object_LiteralUnlimitedNatural99.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow39
		addToElementRepository("ObjectFlow39", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39.setName("ObjectFlow39");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow39_LiteralBoolean41);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow93
		addToElementRepository("ObjectFlow93", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93.setName("ObjectFlow93");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__target);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow93_LiteralBoolean95);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow42
		addToElementRepository("ObjectFlow42", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42.setName("ObjectFlow42");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow42_LiteralBoolean43);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow48
		addToElementRepository("ObjectFlow48", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48.setName("ObjectFlow48");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_C__target);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow48_LiteralBoolean50);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity::ObjectFlow33
		addToElementRepository("ObjectFlow33", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33.setName("ObjectFlow33");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow33_LiteralBoolean35);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow101
		addToElementRepository("ObjectFlow101", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101.setName("ObjectFlow101");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow101_LiteralBoolean102);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow55
		addToElementRepository("ObjectFlow55", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55.setName("ObjectFlow55");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow55_LiteralBoolean56);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow63
		addToElementRepository("ObjectFlow63", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63.setName("ObjectFlow63");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow63_LiteralBoolean65);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow68
		addToElementRepository("ObjectFlow68", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68.setName("ObjectFlow68");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow68_LiteralBoolean70);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow105
		addToElementRepository("ObjectFlow105", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105.setName("ObjectFlow105");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow105_LiteralBoolean107);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow108
		addToElementRepository("ObjectFlow108", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108.setName("ObjectFlow108");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_p_setP__v);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow108_LiteralBoolean109);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow111
		addToElementRepository("ObjectFlow111", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111.setName("ObjectFlow111");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow111_LiteralBoolean112);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow114
		addToElementRepository("ObjectFlow114", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114.setName("ObjectFlow114");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow114_LiteralBoolean116);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow82
		addToElementRepository("ObjectFlow82", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82.setName("ObjectFlow82");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow82_LiteralBoolean84);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_main::ObjectFlow117
		addToElementRepository("ObjectFlow117", MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117.setName("ObjectFlow117");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_main_Call_testP_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_main_ObjectFlow117_LiteralBoolean118);
		// ObjectFlow MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity::ObjectFlow36
		addToElementRepository("ObjectFlow36", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36.setName("ObjectFlow36");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36.setSource(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_vParameterNode);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36.setTarget(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_value);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36.setGuard(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_ObjectFlow36_LiteralBoolean38);
	}

	private void initializeOperation_Instances()
	{
		// Operation MultipleDelegation_MultipleConnector_P_P_Operation_I::setP_Integer
		addToElementRepository("setP_Integer", MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer);
		MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer.setName("setP");
		MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer.addOwnedParameter(MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer_v);
		// Operation MultipleDelegation_MultipleConnector_P_P_Operation_IImpl::setP_Integer
		addToElementRepository("setP_Integer", MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer);
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer.setName("setP");
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer.addOwnedParameter(MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer_v);
		// Operation MultipleDelegation_MultipleConnector_P_P_Operation_B::setP_Integer
		addToElementRepository("setP_Integer", MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer.setName("setP");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer.addOwnedParameter(MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer_v);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer.addMethod(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity);
		// Operation MultipleDelegation_MultipleConnector_P_P_Operation_C::C_C
		addToElementRepository("C_C", MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C.setName("C");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C.addOwnedParameter(MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_MultipleConnector_P_P_Operation_B::B_B
		addToElementRepository("B_B", MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B.setName("B");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B.addOwnedParameter(MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B_result);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_C()::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_C__result.setType(MultipleDelegation_MultipleConnector_P_P_Operation_C);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b1::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_result.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read b.p::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set this.p::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_Set_this_p_result.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b3::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b2::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.b4::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Read c.p::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result.setType(MultipleDelegation_MultipleConnector_P_P_Operation_IImpl);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Value(4)::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		// OutputPin MultipleDelegation_MultipleConnector_P_P_Operation_main_Create C::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Create_C_result.setType(MultipleDelegation_MultipleConnector_P_P_Operation_C);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport MultipleDelegation_MultipleConnector_P_P_Operation::PackageImport1
		addToElementRepository("PackageImport1", MultipleDelegation_MultipleConnector_P_P_Operation_PackageImport1);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer_v);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer_v.setName("v");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C_result.setType(MultipleDelegation_MultipleConnector_P_P_Operation_C);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_C_C_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B::result
		addToElementRepository("result", MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B_result);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B_result.setName("result");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B_result.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_B_B_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_v);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_v.setName("v");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_MultipleConnector_P_P_Operation_main_testP::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_P_Operation_main_testP_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_testP_p.setName("p");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_testP_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_main_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer_v);
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer_v.setName("v");
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer::v
		addToElementRepository("v", MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer_v);
		MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer_v.setName("v");
		MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializePort_Instances()
	{
		// Port MultipleDelegation_MultipleConnector_P_P_Operation_C::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_P_Operation_C_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_p.setName("p");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_C_p.setType(MultipleDelegation_MultipleConnector_P_P_Operation_IImpl);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_p.setAggregation(AggregationKind.composite);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_p.isService = true;
		MultipleDelegation_MultipleConnector_P_P_Operation_C_p.addProvided(MultipleDelegation_MultipleConnector_P_P_Operation_I);
	}

	private void initializeProperty_Instances()
	{
		// Property MultipleDelegation_MultipleConnector_P_P_Operation_B::p
		addToElementRepository("p", MultipleDelegation_MultipleConnector_P_P_Operation_B_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_p.setName("p");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_p.setDefaultValue(MultipleDelegation_MultipleConnector_P_P_Operation_B_p_LiteralInteger23);
		// Property MultipleDelegation_MultipleConnector_P_P_Operation_C::b4
		addToElementRepository("b4", MultipleDelegation_MultipleConnector_P_P_Operation_C_b4);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b4.setName("b4");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b4.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b4.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b4.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_P_Operation_C::b3
		addToElementRepository("b3", MultipleDelegation_MultipleConnector_P_P_Operation_C_b3);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b3.setName("b3");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b3.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b3.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b3.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_P_Operation_S::y
		addToElementRepository("y", MultipleDelegation_MultipleConnector_P_P_Operation_S_y);
		MultipleDelegation_MultipleConnector_P_P_Operation_S_y.setName("y");
		MultipleDelegation_MultipleConnector_P_P_Operation_S_y.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_S_y.setType(MultipleDelegation_MultipleConnector_P_P_Operation_IImpl);
		// Property MultipleDelegation_MultipleConnector_P_P_Operation_C::b1
		addToElementRepository("b1", MultipleDelegation_MultipleConnector_P_P_Operation_C_b1);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b1.setName("b1");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b1.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b1.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b1.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_P_Operation_C::b2
		addToElementRepository("b2", MultipleDelegation_MultipleConnector_P_P_Operation_C_b2);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b2.setName("b2");
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b2.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b2.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
		MultipleDelegation_MultipleConnector_P_P_Operation_C_b2.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_MultipleConnector_P_P_Operation_S::x
		addToElementRepository("x", MultipleDelegation_MultipleConnector_P_P_Operation_S_x);
		MultipleDelegation_MultipleConnector_P_P_Operation_S_x.setName("x");
		MultipleDelegation_MultipleConnector_P_P_Operation_S_x.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_MultipleConnector_P_P_Operation_S_x.setType(MultipleDelegation_MultipleConnector_P_P_Operation_B);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity::this
		addToElementRepository("this", MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this.setName("this");
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this.setResult(MultipleDelegation_MultipleConnector_P_P_Operation_B_setPActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Operation_main::Read c.b4
		addToElementRepository("Read c.b4", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4.setName("Read c.b4");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Operation_C_b4);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4.setObject(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4.setResult(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b4_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Operation_main::Read b.p
		addToElementRepository("Read b.p", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p.setName("Read b.p");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Operation_B_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p.setObject(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p.setResult(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_b_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Operation_main::Read c.b1
		addToElementRepository("Read c.b1", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1.setName("Read c.b1");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Operation_C_b1);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1.setObject(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1.setResult(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b1_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Operation_main::Read c.b2
		addToElementRepository("Read c.b2", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2.setName("Read c.b2");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Operation_C_b2);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2.setObject(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2.setResult(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b2_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Operation_main::Read c.b3
		addToElementRepository("Read c.b3", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3.setName("Read c.b3");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Operation_C_b3);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3.setObject(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3.setResult(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_b3_result);
		// ReadStructuralFeatureAction MultipleDelegation_MultipleConnector_P_P_Operation_main::Read c.p
		addToElementRepository("Read c.p", MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p.setName("Read c.p");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p.setStructuralFeature(MultipleDelegation_MultipleConnector_P_P_Operation_C_p);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p.setObject(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_object);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p.setResult(MultipleDelegation_MultipleConnector_P_P_Operation_main_Read_c_p_result);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction MultipleDelegation_MultipleConnector_P_P_Operation_main::Value(4)
		addToElementRepository("Value(4)", MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4.setName("Value(4)");
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4.setValue(MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_LiteralInteger71);
		MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4.setResult(MultipleDelegation_MultipleConnector_P_P_Operation_main_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // MultipleDelegation_MultipleConnector_P_P_OperationModel
