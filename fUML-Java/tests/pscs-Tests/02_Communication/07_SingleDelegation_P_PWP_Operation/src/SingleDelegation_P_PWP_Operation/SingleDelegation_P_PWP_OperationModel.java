/*
 * SingleDelegation_P_PWP_OperationModel.java
 * 
 * Auto-generated file
 */
package SingleDelegation_P_PWP_Operation;

import uml.structuredclassifiers.ConnectorEnd;
import uml.actions.ReadSelfAction;
import uml.values.LiteralBoolean;
import uml.structuredclassifiers.Connector;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.InterfaceRealization;
import uml.activities.Activity;
import uml.actions.OutputPin;
import uml.actions.ReadStructuralFeatureAction;
import uml.actions.CallOperationAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.values.LiteralString;
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

public class SingleDelegation_P_PWP_OperationModel extends InMemoryModel
{
	private static SingleDelegation_P_PWP_OperationModel instance;

	/*
	 * Model SingleDelegation_P_PWP_Operation
	 */
	public Package SingleDelegation_P_PWP_Operation = new Package();
		public Comment SingleDelegation_P_PWP_Operation_Comment0 = new Comment();
		public PackageImport SingleDelegation_P_PWP_Operation_PackageImport1 = new PackageImport();
		public Comment SingleDelegation_P_PWP_Operation_Comment2 = new Comment();
		public Association SingleDelegation_P_PWP_Operation_R = new Association();
			public Property SingleDelegation_P_PWP_Operation_R_y = new Property();
			public Property SingleDelegation_P_PWP_Operation_R_x = new Property();
		public Interface SingleDelegation_P_PWP_Operation_I = new Interface();
			public Operation SingleDelegation_P_PWP_Operation_I_setP_Integer = new Operation();
				public Parameter SingleDelegation_P_PWP_Operation_I_setP_Integer_v = new Parameter();
		public Class_ SingleDelegation_P_PWP_Operation_IImpl = new Class_();
			public InterfaceRealization SingleDelegation_P_PWP_Operation_IImpl_IRealization = new InterfaceRealization();
			public Operation SingleDelegation_P_PWP_Operation_IImpl_setP_Integer = new Operation();
				public Parameter SingleDelegation_P_PWP_Operation_IImpl_setP_Integer_v = new Parameter();
		public Class_ SingleDelegation_P_PWP_Operation_C = new Class_();
			public Property SingleDelegation_P_PWP_Operation_C_a = new Property();
			public Operation SingleDelegation_P_PWP_Operation_C_C_C = new Operation();
				public Parameter SingleDelegation_P_PWP_Operation_C_C_C_result = new Parameter();
			public Port SingleDelegation_P_PWP_Operation_C_p = new Port();
			public Connector SingleDelegation_P_PWP_Operation_C_u = new Connector();
				public ConnectorEnd SingleDelegation_P_PWP_Operation_C_u_ConnectorEnd3 = new ConnectorEnd();
				public ConnectorEnd SingleDelegation_P_PWP_Operation_C_u_ConnectorEnd4 = new ConnectorEnd();
		public Class_ SingleDelegation_P_PWP_Operation_A = new Class_();
			public Connector SingleDelegation_P_PWP_Operation_A_r = new Connector();
				public ConnectorEnd SingleDelegation_P_PWP_Operation_A_r_ConnectorEnd5 = new ConnectorEnd();
				public ConnectorEnd SingleDelegation_P_PWP_Operation_A_r_ConnectorEnd6 = new ConnectorEnd();
			public Port SingleDelegation_P_PWP_Operation_A_q = new Port();
			public Property SingleDelegation_P_PWP_Operation_A_b = new Property();
			public Operation SingleDelegation_P_PWP_Operation_A_A_A = new Operation();
				public Parameter SingleDelegation_P_PWP_Operation_A_A_A_result = new Parameter();
		public Class_ SingleDelegation_P_PWP_Operation_B = new Class_();
			public Activity SingleDelegation_P_PWP_Operation_B_setPActivity = new Activity();
				public AddStructuralFeatureValueAction SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public OutputPin SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural7 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger8 = new LiteralInteger();
					public InputPin SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger9 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10 = new LiteralUnlimitedNatural();
					public InputPin SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger11 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural12 = new LiteralUnlimitedNatural();
				public ReadSelfAction SingleDelegation_P_PWP_Operation_B_setPActivity_this = new ReadSelfAction();
					public OutputPin SingleDelegation_P_PWP_Operation_B_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural13 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger14 = new LiteralInteger();
				public ObjectFlow SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15_LiteralBoolean16 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15_LiteralInteger17 = new LiteralInteger();
				public ObjectFlow SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18_LiteralBoolean19 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18_LiteralInteger20 = new LiteralInteger();
				public Parameter SingleDelegation_P_PWP_Operation_B_setPActivity_v = new Parameter();
				public ActivityParameterNode SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger21 = new LiteralInteger();
			public Operation SingleDelegation_P_PWP_Operation_B_setP_Integer = new Operation();
				public Parameter SingleDelegation_P_PWP_Operation_B_setP_Integer_v = new Parameter();
			public Operation SingleDelegation_P_PWP_Operation_B_B_B = new Operation();
				public Parameter SingleDelegation_P_PWP_Operation_B_B_B_result = new Parameter();
			public Property SingleDelegation_P_PWP_Operation_B_p = new Property();
			public InterfaceRealization SingleDelegation_P_PWP_Operation_B_IRealization = new InterfaceRealization();
		public Association SingleDelegation_P_PWP_Operation_U = new Association();
			public Property SingleDelegation_P_PWP_Operation_U_x = new Property();
			public Property SingleDelegation_P_PWP_Operation_U_y = new Property();
		public Activity SingleDelegation_P_PWP_Operation_main = new Activity();
			public ObjectFlow SingleDelegation_P_PWP_Operation_main_ObjectFlow22 = new ObjectFlow();
				public LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow22_LiteralBoolean23 = new LiteralBoolean();
				public LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow22_LiteralInteger24 = new LiteralInteger();
			public ControlFlow SingleDelegation_P_PWP_Operation_main_ControlFlow25 = new ControlFlow();
			public ControlFlow SingleDelegation_P_PWP_Operation_main_ControlFlow26 = new ControlFlow();
			public ObjectFlow SingleDelegation_P_PWP_Operation_main_ObjectFlow27 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow27_LiteralInteger28 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow27_LiteralBoolean29 = new LiteralBoolean();
			public ObjectFlow SingleDelegation_P_PWP_Operation_main_ObjectFlow30 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow30_LiteralInteger31 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow30_LiteralBoolean32 = new LiteralBoolean();
			public ObjectFlow SingleDelegation_P_PWP_Operation_main_ObjectFlow33 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow33_LiteralInteger34 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow33_LiteralBoolean35 = new LiteralBoolean();
			public CreateObjectAction SingleDelegation_P_PWP_Operation_main_Create_C = new CreateObjectAction();
				public OutputPin SingleDelegation_P_PWP_Operation_main_Create_C_result = new OutputPin();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Create_C_result_LiteralInteger36 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural37 = new LiteralUnlimitedNatural();
			public ReadStructuralFeatureAction SingleDelegation_P_PWP_Operation_main_Read_a_b = new ReadStructuralFeatureAction();
				public InputPin SingleDelegation_P_PWP_Operation_main_Read_a_b_object = new InputPin();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Read_a_b_object_LiteralInteger38 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural39 = new LiteralUnlimitedNatural();
				public OutputPin SingleDelegation_P_PWP_Operation_main_Read_a_b_result = new OutputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural40 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Read_a_b_result_LiteralInteger41 = new LiteralInteger();
			public CallBehaviorAction SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage = new CallBehaviorAction();
				public OutputPin SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus = new OutputPin();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger42 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural43 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger44 = new LiteralInteger();
				public InputPin SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value = new InputPin();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralInteger45 = new LiteralInteger();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralInteger46 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralUnlimitedNatural47 = new LiteralUnlimitedNatural();
			public OpaqueBehavior SingleDelegation_P_PWP_Operation_main_testP = new OpaqueBehavior();
				public Parameter SingleDelegation_P_PWP_Operation_main_testP_p = new Parameter();
			public ObjectFlow SingleDelegation_P_PWP_Operation_main_ObjectFlow48 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow48_LiteralInteger49 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow48_LiteralBoolean50 = new LiteralBoolean();
			public ObjectFlow SingleDelegation_P_PWP_Operation_main_ObjectFlow51 = new ObjectFlow();
				public LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow51_LiteralBoolean52 = new LiteralBoolean();
				public LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow51_LiteralInteger53 = new LiteralInteger();
			public ObjectFlow SingleDelegation_P_PWP_Operation_main_ObjectFlow54 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow54_LiteralInteger55 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow54_LiteralBoolean56 = new LiteralBoolean();
			public ForkNode SingleDelegation_P_PWP_Operation_main_Fork_C = new ForkNode();
			public ObjectFlow SingleDelegation_P_PWP_Operation_main_ObjectFlow57 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow57_LiteralInteger58 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow57_LiteralBoolean59 = new LiteralBoolean();
			public ObjectFlow SingleDelegation_P_PWP_Operation_main_ObjectFlow60 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow60_LiteralInteger61 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow60_LiteralBoolean62 = new LiteralBoolean();
			public ValueSpecificationAction SingleDelegation_P_PWP_Operation_main_Value_4 = new ValueSpecificationAction();
				public OutputPin SingleDelegation_P_PWP_Operation_main_Value_4_result = new OutputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural63 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Value_4_result_LiteralInteger64 = new LiteralInteger();
				public LiteralInteger SingleDelegation_P_PWP_Operation_main_Value_4_LiteralInteger65 = new LiteralInteger();
			public ValueSpecificationAction SingleDelegation_P_PWP_Operation_main_EndMessage = new ValueSpecificationAction();
				public LiteralString SingleDelegation_P_PWP_Operation_main_EndMessage_LiteralString66 = new LiteralString();
				public OutputPin SingleDelegation_P_PWP_Operation_main_EndMessage_result = new OutputPin();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_EndMessage_result_LiteralInteger67 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_EndMessage_result_LiteralUnlimitedNatural68 = new LiteralUnlimitedNatural();
			public ReadStructuralFeatureAction SingleDelegation_P_PWP_Operation_main_Read_b_p = new ReadStructuralFeatureAction();
				public InputPin SingleDelegation_P_PWP_Operation_main_Read_b_p_object = new InputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural69 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Read_b_p_object_LiteralInteger70 = new LiteralInteger();
				public OutputPin SingleDelegation_P_PWP_Operation_main_Read_b_p_result = new OutputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural71 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Read_b_p_result_LiteralInteger72 = new LiteralInteger();
			public CallBehaviorAction SingleDelegation_P_PWP_Operation_main_Call_testP = new CallBehaviorAction();
				public InputPin SingleDelegation_P_PWP_Operation_main_Call_testP_p = new InputPin();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralInteger73 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural74 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralInteger75 = new LiteralInteger();
			public ObjectFlow SingleDelegation_P_PWP_Operation_main_ObjectFlow76 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow76_LiteralInteger77 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow76_LiteralBoolean78 = new LiteralBoolean();
			public ControlFlow SingleDelegation_P_PWP_Operation_main_ControlFlow79 = new ControlFlow();
			public CallOperationAction SingleDelegation_P_PWP_Operation_main_C_ = new CallOperationAction();
				public InputPin SingleDelegation_P_PWP_Operation_main_C__target = new InputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural80 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_C__target_LiteralInteger81 = new LiteralInteger();
				public OutputPin SingleDelegation_P_PWP_Operation_main_C__result = new OutputPin();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_C__result_LiteralInteger82 = new LiteralInteger();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_C__result_LiteralInteger83 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural84 = new LiteralUnlimitedNatural();
			public ObjectFlow SingleDelegation_P_PWP_Operation_main_ObjectFlow85 = new ObjectFlow();
				public LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow85_LiteralBoolean86 = new LiteralBoolean();
				public LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow85_LiteralInteger87 = new LiteralInteger();
			public CallOperationAction SingleDelegation_P_PWP_Operation_main_Call_c_p_setP = new CallOperationAction();
				public InputPin SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v = new InputPin();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralInteger88 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralUnlimitedNatural89 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralInteger90 = new LiteralInteger();
				public InputPin SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target = new InputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target_LiteralUnlimitedNatural91 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target_LiteralInteger92 = new LiteralInteger();
			public CallBehaviorAction SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage = new CallBehaviorAction();
				public InputPin SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value = new InputPin();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralInteger93 = new LiteralInteger();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralInteger94 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralUnlimitedNatural95 = new LiteralUnlimitedNatural();
				public OutputPin SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus = new OutputPin();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger96 = new LiteralInteger();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger97 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural98 = new LiteralUnlimitedNatural();
			public ValueSpecificationAction SingleDelegation_P_PWP_Operation_main_InitialMessage = new ValueSpecificationAction();
				public LiteralString SingleDelegation_P_PWP_Operation_main_InitialMessage_LiteralString99 = new LiteralString();
				public OutputPin SingleDelegation_P_PWP_Operation_main_InitialMessage_result = new OutputPin();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_InitialMessage_result_LiteralInteger100 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_InitialMessage_result_LiteralUnlimitedNatural101 = new LiteralUnlimitedNatural();
			public ReadStructuralFeatureAction SingleDelegation_P_PWP_Operation_main_Read_c_p = new ReadStructuralFeatureAction();
				public OutputPin SingleDelegation_P_PWP_Operation_main_Read_c_p_result = new OutputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural102 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Read_c_p_result_LiteralInteger103 = new LiteralInteger();
				public InputPin SingleDelegation_P_PWP_Operation_main_Read_c_p_object = new InputPin();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Read_c_p_object_LiteralInteger104 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural105 = new LiteralUnlimitedNatural();
			public ReadStructuralFeatureAction SingleDelegation_P_PWP_Operation_main_Read_c_a = new ReadStructuralFeatureAction();
				public InputPin SingleDelegation_P_PWP_Operation_main_Read_c_a_object = new InputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read_c_a_object_LiteralUnlimitedNatural106 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Read_c_a_object_LiteralInteger107 = new LiteralInteger();
				public OutputPin SingleDelegation_P_PWP_Operation_main_Read_c_a_result = new OutputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read_c_a_result_LiteralUnlimitedNatural108 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_PWP_Operation_main_Read_c_a_result_LiteralInteger109 = new LiteralInteger();

	public static SingleDelegation_P_PWP_OperationModel instance()
	{
		if (instance == null)
        {
            instance = new SingleDelegation_P_PWP_OperationModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public SingleDelegation_P_PWP_OperationModel()
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
		this.initializeValueSpecificationAction_Instances();
	}

	private void initializeActivity_Instances()
	{
		// Activity SingleDelegation_P_PWP_Operation_B::setPActivity
		addToElementRepository("setPActivity", SingleDelegation_P_PWP_Operation_B_setPActivity);
		SingleDelegation_P_PWP_Operation_B_setPActivity.setName("setPActivity");
		SingleDelegation_P_PWP_Operation_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_B_setPActivity.addOwnedParameter(SingleDelegation_P_PWP_Operation_B_setPActivity_v);
		SingleDelegation_P_PWP_Operation_B_setPActivity.addNode(SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p);
		SingleDelegation_P_PWP_Operation_B_setPActivity.addNode(SingleDelegation_P_PWP_Operation_B_setPActivity_this);
		SingleDelegation_P_PWP_Operation_B_setPActivity.addNode(SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode);
		SingleDelegation_P_PWP_Operation_B_setPActivity.addEdge(SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15);
		SingleDelegation_P_PWP_Operation_B_setPActivity.addEdge(SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18);
		// Activity SingleDelegation_P_PWP_Operation::main
		addToElementRepository("main", SingleDelegation_P_PWP_Operation_main);
		SingleDelegation_P_PWP_Operation_main.setName("main");
		SingleDelegation_P_PWP_Operation_main.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main.addOwnedBehavior(SingleDelegation_P_PWP_Operation_main_testP);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_Fork_C);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_Value_4);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_EndMessage);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_Read_b_p);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_Call_testP);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_C_);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_Call_c_p_setP);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_InitialMessage);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_Create_C);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_Read_a_b);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_Read_c_p);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage);
		SingleDelegation_P_PWP_Operation_main.addNode(SingleDelegation_P_PWP_Operation_main_Read_c_a);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ObjectFlow48);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ObjectFlow51);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ObjectFlow54);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ObjectFlow22);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ControlFlow25);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ControlFlow26);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ObjectFlow57);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ObjectFlow60);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ObjectFlow27);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ObjectFlow30);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ObjectFlow76);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ControlFlow79);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ObjectFlow33);
		SingleDelegation_P_PWP_Operation_main.addEdge(SingleDelegation_P_PWP_Operation_main_ObjectFlow85);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode SingleDelegation_P_PWP_Operation_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode);
		SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode.setName("vParameterNode");
		SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode.setParameter(SingleDelegation_P_PWP_Operation_B_setPActivity_v);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction SingleDelegation_P_PWP_Operation_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p.setName("Set this.p");
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p.setStructuralFeature(SingleDelegation_P_PWP_Operation_B_p);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p.setObject(SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p.setValue(SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p.setResult(SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association SingleDelegation_P_PWP_Operation::R
		addToElementRepository("R", SingleDelegation_P_PWP_Operation_R);
		SingleDelegation_P_PWP_Operation_R.setName("R");
		SingleDelegation_P_PWP_Operation_R.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_R.addOwnedEnd(SingleDelegation_P_PWP_Operation_R_x);
		SingleDelegation_P_PWP_Operation_R.addOwnedEnd(SingleDelegation_P_PWP_Operation_R_y);
		// Association SingleDelegation_P_PWP_Operation::U
		addToElementRepository("U", SingleDelegation_P_PWP_Operation_U);
		SingleDelegation_P_PWP_Operation_U.setName("U");
		SingleDelegation_P_PWP_Operation_U.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_U.addOwnedEnd(SingleDelegation_P_PWP_Operation_U_x);
		SingleDelegation_P_PWP_Operation_U.addOwnedEnd(SingleDelegation_P_PWP_Operation_U_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction SingleDelegation_P_PWP_Operation_main::Call testP
		addToElementRepository("Call testP", SingleDelegation_P_PWP_Operation_main_Call_testP);
		SingleDelegation_P_PWP_Operation_main_Call_testP.setName("Call testP");
		SingleDelegation_P_PWP_Operation_main_Call_testP.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Call_testP.setBehavior(SingleDelegation_P_PWP_Operation_main_testP);
		SingleDelegation_P_PWP_Operation_main_Call_testP.addArgument(SingleDelegation_P_PWP_Operation_main_Call_testP_p);
		// CallBehaviorAction SingleDelegation_P_PWP_Operation_main::WriteLine(EndMessage)
		addToElementRepository("WriteLine(EndMessage)", SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage.setName("WriteLine(EndMessage)");
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage.addResult(SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage.addArgument(SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value);
		// CallBehaviorAction SingleDelegation_P_PWP_Operation_main::WriteLine(InitialMessage)
		addToElementRepository("WriteLine(InitialMessage)", SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage.setName("WriteLine(InitialMessage)");
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage.addResult(SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage.addArgument(SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction SingleDelegation_P_PWP_Operation_main::C()
		addToElementRepository("C()", SingleDelegation_P_PWP_Operation_main_C_);
		SingleDelegation_P_PWP_Operation_main_C_.setName("C()");
		SingleDelegation_P_PWP_Operation_main_C_.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_C_.addResult(SingleDelegation_P_PWP_Operation_main_C__result);
		SingleDelegation_P_PWP_Operation_main_C_.setOperation(SingleDelegation_P_PWP_Operation_C_C_C);
		SingleDelegation_P_PWP_Operation_main_C_.setTarget(SingleDelegation_P_PWP_Operation_main_C__target);
		// CallOperationAction SingleDelegation_P_PWP_Operation_main::Call c.p.setP
		addToElementRepository("Call c.p.setP", SingleDelegation_P_PWP_Operation_main_Call_c_p_setP);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP.setName("Call c.p.setP");
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP.setOperation(SingleDelegation_P_PWP_Operation_I_setP_Integer);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP.setTarget(SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP.addArgument(SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v);
	}

	private void initializeClass_Instances()
	{
		// Class SingleDelegation_P_PWP_Operation::C
		addToElementRepository("C", SingleDelegation_P_PWP_Operation_C);
		SingleDelegation_P_PWP_Operation_C.setName("C");
		SingleDelegation_P_PWP_Operation_C.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_C.addOwnedAttribute(SingleDelegation_P_PWP_Operation_C_p);
		SingleDelegation_P_PWP_Operation_C.addOwnedAttribute(SingleDelegation_P_PWP_Operation_C_a);
		
		SingleDelegation_P_PWP_Operation_C.addOwnedConnector(SingleDelegation_P_PWP_Operation_C_u);
		SingleDelegation_P_PWP_Operation_C.addOwnedOperation(SingleDelegation_P_PWP_Operation_C_C_C);
		// Class SingleDelegation_P_PWP_Operation::IImpl
		addToElementRepository("IImpl", SingleDelegation_P_PWP_Operation_IImpl);
		SingleDelegation_P_PWP_Operation_IImpl.setName("IImpl");
		SingleDelegation_P_PWP_Operation_IImpl.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_IImpl.addInterfaceRealization(SingleDelegation_P_PWP_Operation_IImpl_IRealization);
		
		SingleDelegation_P_PWP_Operation_IImpl.addOwnedOperation(SingleDelegation_P_PWP_Operation_IImpl_setP_Integer);
		// Class SingleDelegation_P_PWP_Operation::A
		addToElementRepository("A", SingleDelegation_P_PWP_Operation_A);
		SingleDelegation_P_PWP_Operation_A.setName("A");
		SingleDelegation_P_PWP_Operation_A.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_A.addOwnedAttribute(SingleDelegation_P_PWP_Operation_A_q);
		SingleDelegation_P_PWP_Operation_A.addOwnedAttribute(SingleDelegation_P_PWP_Operation_A_b);
		
		SingleDelegation_P_PWP_Operation_A.addOwnedConnector(SingleDelegation_P_PWP_Operation_A_r);
		SingleDelegation_P_PWP_Operation_A.addOwnedOperation(SingleDelegation_P_PWP_Operation_A_A_A);
		// Class SingleDelegation_P_PWP_Operation::B
		addToElementRepository("B", SingleDelegation_P_PWP_Operation_B);
		SingleDelegation_P_PWP_Operation_B.setName("B");
		SingleDelegation_P_PWP_Operation_B.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_B.addOwnedAttribute(SingleDelegation_P_PWP_Operation_B_p);
		SingleDelegation_P_PWP_Operation_B.addOwnedBehavior(SingleDelegation_P_PWP_Operation_B_setPActivity);
		SingleDelegation_P_PWP_Operation_B.addInterfaceRealization(SingleDelegation_P_PWP_Operation_B_IRealization);
		
		SingleDelegation_P_PWP_Operation_B.addOwnedOperation(SingleDelegation_P_PWP_Operation_B_B_B);
		SingleDelegation_P_PWP_Operation_B.addOwnedOperation(SingleDelegation_P_PWP_Operation_B_setP_Integer);
	}

	private void initializeComment_Instances()
	{
		// Comment SingleDelegation_P_PWP_Operation::Comment0
		addToElementRepository("Comment0", SingleDelegation_P_PWP_Operation_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment SingleDelegation_P_PWP_Operation::Comment2
		addToElementRepository("Comment2", SingleDelegation_P_PWP_Operation_Comment2);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector SingleDelegation_P_PWP_Operation_A::r
		addToElementRepository("r", SingleDelegation_P_PWP_Operation_A_r);
		SingleDelegation_P_PWP_Operation_A_r.setName("r");
		SingleDelegation_P_PWP_Operation_A_r.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_A_r.addEnd(SingleDelegation_P_PWP_Operation_A_r_ConnectorEnd5);
		SingleDelegation_P_PWP_Operation_A_r.addEnd(SingleDelegation_P_PWP_Operation_A_r_ConnectorEnd6);
		SingleDelegation_P_PWP_Operation_A_r.setType(SingleDelegation_P_PWP_Operation_R);
		// Connector SingleDelegation_P_PWP_Operation_C::u
		addToElementRepository("u", SingleDelegation_P_PWP_Operation_C_u);
		SingleDelegation_P_PWP_Operation_C_u.setName("u");
		SingleDelegation_P_PWP_Operation_C_u.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_C_u.addEnd(SingleDelegation_P_PWP_Operation_C_u_ConnectorEnd3);
		SingleDelegation_P_PWP_Operation_C_u.addEnd(SingleDelegation_P_PWP_Operation_C_u_ConnectorEnd4);
		SingleDelegation_P_PWP_Operation_C_u.setType(SingleDelegation_P_PWP_Operation_U);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd SingleDelegation_P_PWP_Operation_A_r::ConnectorEnd5
		addToElementRepository("ConnectorEnd5", SingleDelegation_P_PWP_Operation_A_r_ConnectorEnd5);
		SingleDelegation_P_PWP_Operation_A_r_ConnectorEnd5.setRole(SingleDelegation_P_PWP_Operation_A_q);
		// ConnectorEnd SingleDelegation_P_PWP_Operation_C_u::ConnectorEnd3
		addToElementRepository("ConnectorEnd3", SingleDelegation_P_PWP_Operation_C_u_ConnectorEnd3);
		SingleDelegation_P_PWP_Operation_C_u_ConnectorEnd3.setRole(SingleDelegation_P_PWP_Operation_C_p);
		// ConnectorEnd SingleDelegation_P_PWP_Operation_C_u::ConnectorEnd4
		addToElementRepository("ConnectorEnd4", SingleDelegation_P_PWP_Operation_C_u_ConnectorEnd4);
		SingleDelegation_P_PWP_Operation_C_u_ConnectorEnd4.setRole(SingleDelegation_P_PWP_Operation_A_q);
		SingleDelegation_P_PWP_Operation_C_u_ConnectorEnd4.setPartWithPort(SingleDelegation_P_PWP_Operation_C_a);
		// ConnectorEnd SingleDelegation_P_PWP_Operation_A_r::ConnectorEnd6
		addToElementRepository("ConnectorEnd6", SingleDelegation_P_PWP_Operation_A_r_ConnectorEnd6);
		SingleDelegation_P_PWP_Operation_A_r_ConnectorEnd6.setRole(SingleDelegation_P_PWP_Operation_A_b);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow SingleDelegation_P_PWP_Operation_main::ControlFlow79
		addToElementRepository("ControlFlow79", SingleDelegation_P_PWP_Operation_main_ControlFlow79);
		SingleDelegation_P_PWP_Operation_main_ControlFlow79.setName("ControlFlow79");
		SingleDelegation_P_PWP_Operation_main_ControlFlow79.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ControlFlow79.setSource(SingleDelegation_P_PWP_Operation_main_Call_testP);
		SingleDelegation_P_PWP_Operation_main_ControlFlow79.setTarget(SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage);
		// ControlFlow SingleDelegation_P_PWP_Operation_main::ControlFlow25
		addToElementRepository("ControlFlow25", SingleDelegation_P_PWP_Operation_main_ControlFlow25);
		SingleDelegation_P_PWP_Operation_main_ControlFlow25.setName("ControlFlow25");
		SingleDelegation_P_PWP_Operation_main_ControlFlow25.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ControlFlow25.setSource(SingleDelegation_P_PWP_Operation_main_Call_c_p_setP);
		SingleDelegation_P_PWP_Operation_main_ControlFlow25.setTarget(SingleDelegation_P_PWP_Operation_main_Read_c_a);
		// ControlFlow SingleDelegation_P_PWP_Operation_main::ControlFlow26
		addToElementRepository("ControlFlow26", SingleDelegation_P_PWP_Operation_main_ControlFlow26);
		SingleDelegation_P_PWP_Operation_main_ControlFlow26.setName("ControlFlow26");
		SingleDelegation_P_PWP_Operation_main_ControlFlow26.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ControlFlow26.setSource(SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage);
		SingleDelegation_P_PWP_Operation_main_ControlFlow26.setTarget(SingleDelegation_P_PWP_Operation_main_Create_C);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction SingleDelegation_P_PWP_Operation_main::Create C
		addToElementRepository("Create C", SingleDelegation_P_PWP_Operation_main_Create_C);
		SingleDelegation_P_PWP_Operation_main_Create_C.setName("Create C");
		SingleDelegation_P_PWP_Operation_main_Create_C.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Create_C.setClassifier(SingleDelegation_P_PWP_Operation_C);
		SingleDelegation_P_PWP_Operation_main_Create_C.setResult(SingleDelegation_P_PWP_Operation_main_Create_C_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode SingleDelegation_P_PWP_Operation_main::Fork C
		addToElementRepository("Fork C", SingleDelegation_P_PWP_Operation_main_Fork_C);
		SingleDelegation_P_PWP_Operation_main_Fork_C.setName("Fork C");
		SingleDelegation_P_PWP_Operation_main_Fork_C.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior SingleDelegation_P_PWP_Operation_main::testP
		addToElementRepository("testP", SingleDelegation_P_PWP_Operation_main_testP);
		SingleDelegation_P_PWP_Operation_main_testP.setName("testP");
		SingleDelegation_P_PWP_Operation_main_testP.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_testP.addOwnedParameter(SingleDelegation_P_PWP_Operation_main_testP_p);
		SingleDelegation_P_PWP_Operation_main_testP.addLanguage("Java");
		SingleDelegation_P_PWP_Operation_main_testP.addLanguage("Import");
		SingleDelegation_P_PWP_Operation_main_testP.addBody("System.out.println(\"Asserting c.a.b.p == 4\");  	// Test parameter p 	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument p = \" + p); 	 	System.out.println(\"c.a.b.p == \" + p); 	System.out.print(\"Operation call delegated: \");  	if(p == 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		SingleDelegation_P_PWP_Operation_main_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin SingleDelegation_P_PWP_Operation_main_Read b.p::object
		addToElementRepository("object", SingleDelegation_P_PWP_Operation_main_Read_b_p_object);
		SingleDelegation_P_PWP_Operation_main_Read_b_p_object.setName("object");
		SingleDelegation_P_PWP_Operation_main_Read_b_p_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_b_p_object.setType(SingleDelegation_P_PWP_Operation_B);
		// InputPin SingleDelegation_P_PWP_Operation_main_Read a.b::object
		addToElementRepository("object", SingleDelegation_P_PWP_Operation_main_Read_a_b_object);
		SingleDelegation_P_PWP_Operation_main_Read_a_b_object.setName("object");
		SingleDelegation_P_PWP_Operation_main_Read_a_b_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_a_b_object.setType(SingleDelegation_P_PWP_Operation_A);
		// InputPin SingleDelegation_P_PWP_Operation_main_Read c.a::object
		addToElementRepository("object", SingleDelegation_P_PWP_Operation_main_Read_c_a_object);
		SingleDelegation_P_PWP_Operation_main_Read_c_a_object.setName("object");
		SingleDelegation_P_PWP_Operation_main_Read_c_a_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_a_object.setType(SingleDelegation_P_PWP_Operation_C);
		// InputPin SingleDelegation_P_PWP_Operation_B_setPActivity_Set this.p::object
		addToElementRepository("object", SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object.setName("object");
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object.setType(SingleDelegation_P_PWP_Operation_B);
		// InputPin SingleDelegation_P_PWP_Operation_B_setPActivity_Set this.p::value
		addToElementRepository("value", SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value.setName("value");
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin SingleDelegation_P_PWP_Operation_main_Call testP::p
		addToElementRepository("p", SingleDelegation_P_PWP_Operation_main_Call_testP_p);
		SingleDelegation_P_PWP_Operation_main_Call_testP_p.setName("p");
		SingleDelegation_P_PWP_Operation_main_Call_testP_p.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin SingleDelegation_P_PWP_Operation_main_WriteLine(EndMessage)::value
		addToElementRepository("value", SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value.setName("value");
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin SingleDelegation_P_PWP_Operation_main_C()::target
		addToElementRepository("target", SingleDelegation_P_PWP_Operation_main_C__target);
		SingleDelegation_P_PWP_Operation_main_C__target.setName("target");
		SingleDelegation_P_PWP_Operation_main_C__target.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_C__target.setType(SingleDelegation_P_PWP_Operation_C);
		// InputPin SingleDelegation_P_PWP_Operation_main_Call c.p.setP::v
		addToElementRepository("v", SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v.setName("v");
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin SingleDelegation_P_PWP_Operation_main_WriteLine(InitialMessage)::value
		addToElementRepository("value", SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value.setName("value");
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin SingleDelegation_P_PWP_Operation_main_Call c.p.setP::target
		addToElementRepository("target", SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target.setName("target");
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target.setVisibility(VisibilityKind.public_);
		// InputPin SingleDelegation_P_PWP_Operation_main_Read c.p::object
		addToElementRepository("object", SingleDelegation_P_PWP_Operation_main_Read_c_p_object);
		SingleDelegation_P_PWP_Operation_main_Read_c_p_object.setName("object");
		SingleDelegation_P_PWP_Operation_main_Read_c_p_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_p_object.setType(SingleDelegation_P_PWP_Operation_C);
	}

	private void initializeInterface_Instances()
	{
		// Interface SingleDelegation_P_PWP_Operation::I
		addToElementRepository("I", SingleDelegation_P_PWP_Operation_I);
		SingleDelegation_P_PWP_Operation_I.setName("I");
		SingleDelegation_P_PWP_Operation_I.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_I.addOwnedOperation(SingleDelegation_P_PWP_Operation_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization SingleDelegation_P_PWP_Operation_IImpl::IRealization
		addToElementRepository("IRealization", SingleDelegation_P_PWP_Operation_IImpl_IRealization);
		SingleDelegation_P_PWP_Operation_IImpl_IRealization.setName("IRealization");
		SingleDelegation_P_PWP_Operation_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_IImpl_IRealization.setContract(SingleDelegation_P_PWP_Operation_I);
		// InterfaceRealization SingleDelegation_P_PWP_Operation_B::IRealization
		addToElementRepository("IRealization", SingleDelegation_P_PWP_Operation_B_IRealization);
		SingleDelegation_P_PWP_Operation_B_IRealization.setName("IRealization");
		SingleDelegation_P_PWP_Operation_B_IRealization.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_IRealization.setContract(SingleDelegation_P_PWP_Operation_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow51::LiteralBoolean52
		addToElementRepository("LiteralBoolean52", SingleDelegation_P_PWP_Operation_main_ObjectFlow51_LiteralBoolean52);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow51_LiteralBoolean52.setName("LiteralBoolean52");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow51_LiteralBoolean52.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow51_LiteralBoolean52.setValue(true);
		// LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow76::LiteralBoolean78
		addToElementRepository("LiteralBoolean78", SingleDelegation_P_PWP_Operation_main_ObjectFlow76_LiteralBoolean78);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow76_LiteralBoolean78.setName("LiteralBoolean78");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow76_LiteralBoolean78.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow76_LiteralBoolean78.setValue(true);
		// LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow54::LiteralBoolean56
		addToElementRepository("LiteralBoolean56", SingleDelegation_P_PWP_Operation_main_ObjectFlow54_LiteralBoolean56);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow54_LiteralBoolean56.setName("LiteralBoolean56");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow54_LiteralBoolean56.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow54_LiteralBoolean56.setValue(true);
		// LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow33::LiteralBoolean35
		addToElementRepository("LiteralBoolean35", SingleDelegation_P_PWP_Operation_main_ObjectFlow33_LiteralBoolean35);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow33_LiteralBoolean35.setName("LiteralBoolean35");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow33_LiteralBoolean35.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow33_LiteralBoolean35.setValue(true);
		// LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow30::LiteralBoolean32
		addToElementRepository("LiteralBoolean32", SingleDelegation_P_PWP_Operation_main_ObjectFlow30_LiteralBoolean32);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow30_LiteralBoolean32.setName("LiteralBoolean32");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow30_LiteralBoolean32.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow30_LiteralBoolean32.setValue(true);
		// LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow22::LiteralBoolean23
		addToElementRepository("LiteralBoolean23", SingleDelegation_P_PWP_Operation_main_ObjectFlow22_LiteralBoolean23);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow22_LiteralBoolean23.setName("LiteralBoolean23");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow22_LiteralBoolean23.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow22_LiteralBoolean23.setValue(true);
		// LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow85::LiteralBoolean86
		addToElementRepository("LiteralBoolean86", SingleDelegation_P_PWP_Operation_main_ObjectFlow85_LiteralBoolean86);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow85_LiteralBoolean86.setName("LiteralBoolean86");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow85_LiteralBoolean86.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow85_LiteralBoolean86.setValue(true);
		// LiteralBoolean SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15::LiteralBoolean16
		addToElementRepository("LiteralBoolean16", SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15_LiteralBoolean16);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15_LiteralBoolean16.setName("LiteralBoolean16");
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15_LiteralBoolean16.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15_LiteralBoolean16.setValue(true);
		// LiteralBoolean SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18::LiteralBoolean19
		addToElementRepository("LiteralBoolean19", SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18_LiteralBoolean19);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18_LiteralBoolean19.setName("LiteralBoolean19");
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18_LiteralBoolean19.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18_LiteralBoolean19.setValue(true);
		// LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow60::LiteralBoolean62
		addToElementRepository("LiteralBoolean62", SingleDelegation_P_PWP_Operation_main_ObjectFlow60_LiteralBoolean62);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow60_LiteralBoolean62.setName("LiteralBoolean62");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow60_LiteralBoolean62.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow60_LiteralBoolean62.setValue(true);
		// LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow27::LiteralBoolean29
		addToElementRepository("LiteralBoolean29", SingleDelegation_P_PWP_Operation_main_ObjectFlow27_LiteralBoolean29);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow27_LiteralBoolean29.setName("LiteralBoolean29");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow27_LiteralBoolean29.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow27_LiteralBoolean29.setValue(true);
		// LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow48::LiteralBoolean50
		addToElementRepository("LiteralBoolean50", SingleDelegation_P_PWP_Operation_main_ObjectFlow48_LiteralBoolean50);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow48_LiteralBoolean50.setName("LiteralBoolean50");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow48_LiteralBoolean50.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow48_LiteralBoolean50.setValue(true);
		// LiteralBoolean SingleDelegation_P_PWP_Operation_main_ObjectFlow57::LiteralBoolean59
		addToElementRepository("LiteralBoolean59", SingleDelegation_P_PWP_Operation_main_ObjectFlow57_LiteralBoolean59);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow57_LiteralBoolean59.setName("LiteralBoolean59");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow57_LiteralBoolean59.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow57_LiteralBoolean59.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine(InitialMessage)_value::LiteralInteger45
		addToElementRepository("LiteralInteger45", SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralInteger45);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralInteger45.setName("LiteralInteger45");
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralInteger45.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralInteger45.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_C()_result::LiteralInteger82
		addToElementRepository("LiteralInteger82", SingleDelegation_P_PWP_Operation_main_C__result_LiteralInteger82);
		SingleDelegation_P_PWP_Operation_main_C__result_LiteralInteger82.setName("LiteralInteger82");
		SingleDelegation_P_PWP_Operation_main_C__result_LiteralInteger82.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_C__result_LiteralInteger82.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine(InitialMessage)_value::LiteralInteger46
		addToElementRepository("LiteralInteger46", SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralInteger46);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralInteger46.setName("LiteralInteger46");
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralInteger46.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralInteger46.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow60::LiteralInteger61
		addToElementRepository("LiteralInteger61", SingleDelegation_P_PWP_Operation_main_ObjectFlow60_LiteralInteger61);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow60_LiteralInteger61.setName("LiteralInteger61");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow60_LiteralInteger61.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow60_LiteralInteger61.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine(EndMessage)_errorStatus::LiteralInteger96
		addToElementRepository("LiteralInteger96", SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger96);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger96.setName("LiteralInteger96");
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger96.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger96.setValue(0);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_C()_target::LiteralInteger81
		addToElementRepository("LiteralInteger81", SingleDelegation_P_PWP_Operation_main_C__target_LiteralInteger81);
		SingleDelegation_P_PWP_Operation_main_C__target_LiteralInteger81.setName("LiteralInteger81");
		SingleDelegation_P_PWP_Operation_main_C__target_LiteralInteger81.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_C__target_LiteralInteger81.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Read b.p_result::LiteralInteger72
		addToElementRepository("LiteralInteger72", SingleDelegation_P_PWP_Operation_main_Read_b_p_result_LiteralInteger72);
		SingleDelegation_P_PWP_Operation_main_Read_b_p_result_LiteralInteger72.setName("LiteralInteger72");
		SingleDelegation_P_PWP_Operation_main_Read_b_p_result_LiteralInteger72.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_b_p_result_LiteralInteger72.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Read c.p_result::LiteralInteger103
		addToElementRepository("LiteralInteger103", SingleDelegation_P_PWP_Operation_main_Read_c_p_result_LiteralInteger103);
		SingleDelegation_P_PWP_Operation_main_Read_c_p_result_LiteralInteger103.setName("LiteralInteger103");
		SingleDelegation_P_PWP_Operation_main_Read_c_p_result_LiteralInteger103.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_p_result_LiteralInteger103.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18::LiteralInteger20
		addToElementRepository("LiteralInteger20", SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18_LiteralInteger20);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18_LiteralInteger20.setName("LiteralInteger20");
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18_LiteralInteger20.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18_LiteralInteger20.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Value(4)_result::LiteralInteger64
		addToElementRepository("LiteralInteger64", SingleDelegation_P_PWP_Operation_main_Value_4_result_LiteralInteger64);
		SingleDelegation_P_PWP_Operation_main_Value_4_result_LiteralInteger64.setName("LiteralInteger64");
		SingleDelegation_P_PWP_Operation_main_Value_4_result_LiteralInteger64.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Value_4_result_LiteralInteger64.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_EndMessage_result::LiteralInteger67
		addToElementRepository("LiteralInteger67", SingleDelegation_P_PWP_Operation_main_EndMessage_result_LiteralInteger67);
		SingleDelegation_P_PWP_Operation_main_EndMessage_result_LiteralInteger67.setName("LiteralInteger67");
		SingleDelegation_P_PWP_Operation_main_EndMessage_result_LiteralInteger67.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_EndMessage_result_LiteralInteger67.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Read c.a_object::LiteralInteger107
		addToElementRepository("LiteralInteger107", SingleDelegation_P_PWP_Operation_main_Read_c_a_object_LiteralInteger107);
		SingleDelegation_P_PWP_Operation_main_Read_c_a_object_LiteralInteger107.setName("LiteralInteger107");
		SingleDelegation_P_PWP_Operation_main_Read_c_a_object_LiteralInteger107.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_a_object_LiteralInteger107.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Call testP_p::LiteralInteger75
		addToElementRepository("LiteralInteger75", SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralInteger75);
		SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralInteger75.setName("LiteralInteger75");
		SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralInteger75.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralInteger75.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Read c.a_result::LiteralInteger109
		addToElementRepository("LiteralInteger109", SingleDelegation_P_PWP_Operation_main_Read_c_a_result_LiteralInteger109);
		SingleDelegation_P_PWP_Operation_main_Read_c_a_result_LiteralInteger109.setName("LiteralInteger109");
		SingleDelegation_P_PWP_Operation_main_Read_c_a_result_LiteralInteger109.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_a_result_LiteralInteger109.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine(InitialMessage)_errorStatus::LiteralInteger42
		addToElementRepository("LiteralInteger42", SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger42);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger42.setName("LiteralInteger42");
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger42.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger42.setValue(0);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_C()_result::LiteralInteger83
		addToElementRepository("LiteralInteger83", SingleDelegation_P_PWP_Operation_main_C__result_LiteralInteger83);
		SingleDelegation_P_PWP_Operation_main_C__result_LiteralInteger83.setName("LiteralInteger83");
		SingleDelegation_P_PWP_Operation_main_C__result_LiteralInteger83.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_C__result_LiteralInteger83.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_InitialMessage_result::LiteralInteger100
		addToElementRepository("LiteralInteger100", SingleDelegation_P_PWP_Operation_main_InitialMessage_result_LiteralInteger100);
		SingleDelegation_P_PWP_Operation_main_InitialMessage_result_LiteralInteger100.setName("LiteralInteger100");
		SingleDelegation_P_PWP_Operation_main_InitialMessage_result_LiteralInteger100.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_InitialMessage_result_LiteralInteger100.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine(EndMessage)_value::LiteralInteger93
		addToElementRepository("LiteralInteger93", SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralInteger93);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralInteger93.setName("LiteralInteger93");
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralInteger93.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralInteger93.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine(EndMessage)_value::LiteralInteger94
		addToElementRepository("LiteralInteger94", SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralInteger94);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralInteger94.setName("LiteralInteger94");
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralInteger94.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralInteger94.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow48::LiteralInteger49
		addToElementRepository("LiteralInteger49", SingleDelegation_P_PWP_Operation_main_ObjectFlow48_LiteralInteger49);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow48_LiteralInteger49.setName("LiteralInteger49");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow48_LiteralInteger49.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow48_LiteralInteger49.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Call c.p.setP_v::LiteralInteger88
		addToElementRepository("LiteralInteger88", SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralInteger88);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralInteger88.setName("LiteralInteger88");
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralInteger88.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralInteger88.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Value(4)::LiteralInteger65
		addToElementRepository("LiteralInteger65", SingleDelegation_P_PWP_Operation_main_Value_4_LiteralInteger65);
		SingleDelegation_P_PWP_Operation_main_Value_4_LiteralInteger65.setName("LiteralInteger65");
		SingleDelegation_P_PWP_Operation_main_Value_4_LiteralInteger65.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Value_4_LiteralInteger65.setValue(4);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Read b.p_object::LiteralInteger70
		addToElementRepository("LiteralInteger70", SingleDelegation_P_PWP_Operation_main_Read_b_p_object_LiteralInteger70);
		SingleDelegation_P_PWP_Operation_main_Read_b_p_object_LiteralInteger70.setName("LiteralInteger70");
		SingleDelegation_P_PWP_Operation_main_Read_b_p_object_LiteralInteger70.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_b_p_object_LiteralInteger70.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Read a.b_object::LiteralInteger38
		addToElementRepository("LiteralInteger38", SingleDelegation_P_PWP_Operation_main_Read_a_b_object_LiteralInteger38);
		SingleDelegation_P_PWP_Operation_main_Read_a_b_object_LiteralInteger38.setName("LiteralInteger38");
		SingleDelegation_P_PWP_Operation_main_Read_a_b_object_LiteralInteger38.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_a_b_object_LiteralInteger38.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow30::LiteralInteger31
		addToElementRepository("LiteralInteger31", SingleDelegation_P_PWP_Operation_main_ObjectFlow30_LiteralInteger31);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow30_LiteralInteger31.setName("LiteralInteger31");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow30_LiteralInteger31.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow30_LiteralInteger31.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow76::LiteralInteger77
		addToElementRepository("LiteralInteger77", SingleDelegation_P_PWP_Operation_main_ObjectFlow76_LiteralInteger77);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow76_LiteralInteger77.setName("LiteralInteger77");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow76_LiteralInteger77.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow76_LiteralInteger77.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine(EndMessage)_errorStatus::LiteralInteger97
		addToElementRepository("LiteralInteger97", SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger97);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger97.setName("LiteralInteger97");
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger97.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger97.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow54::LiteralInteger55
		addToElementRepository("LiteralInteger55", SingleDelegation_P_PWP_Operation_main_ObjectFlow54_LiteralInteger55);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow54_LiteralInteger55.setName("LiteralInteger55");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow54_LiteralInteger55.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow54_LiteralInteger55.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Call testP_p::LiteralInteger73
		addToElementRepository("LiteralInteger73", SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralInteger73);
		SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralInteger73.setName("LiteralInteger73");
		SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralInteger73.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralInteger73.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Read a.b_result::LiteralInteger41
		addToElementRepository("LiteralInteger41", SingleDelegation_P_PWP_Operation_main_Read_a_b_result_LiteralInteger41);
		SingleDelegation_P_PWP_Operation_main_Read_a_b_result_LiteralInteger41.setName("LiteralInteger41");
		SingleDelegation_P_PWP_Operation_main_Read_a_b_result_LiteralInteger41.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_a_b_result_LiteralInteger41.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_Set this.p_value::LiteralInteger11
		addToElementRepository("LiteralInteger11", SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger11);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger11.setName("LiteralInteger11");
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger11.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger11.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow57::LiteralInteger58
		addToElementRepository("LiteralInteger58", SingleDelegation_P_PWP_Operation_main_ObjectFlow57_LiteralInteger58);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow57_LiteralInteger58.setName("LiteralInteger58");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow57_LiteralInteger58.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow57_LiteralInteger58.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Read c.p_object::LiteralInteger104
		addToElementRepository("LiteralInteger104", SingleDelegation_P_PWP_Operation_main_Read_c_p_object_LiteralInteger104);
		SingleDelegation_P_PWP_Operation_main_Read_c_p_object_LiteralInteger104.setName("LiteralInteger104");
		SingleDelegation_P_PWP_Operation_main_Read_c_p_object_LiteralInteger104.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_p_object_LiteralInteger104.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_this_result::LiteralInteger14
		addToElementRepository("LiteralInteger14", SingleDelegation_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger14);
		SingleDelegation_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger14.setName("LiteralInteger14");
		SingleDelegation_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger14.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger14.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow33::LiteralInteger34
		addToElementRepository("LiteralInteger34", SingleDelegation_P_PWP_Operation_main_ObjectFlow33_LiteralInteger34);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow33_LiteralInteger34.setName("LiteralInteger34");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow33_LiteralInteger34.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow33_LiteralInteger34.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Create C_result::LiteralInteger36
		addToElementRepository("LiteralInteger36", SingleDelegation_P_PWP_Operation_main_Create_C_result_LiteralInteger36);
		SingleDelegation_P_PWP_Operation_main_Create_C_result_LiteralInteger36.setName("LiteralInteger36");
		SingleDelegation_P_PWP_Operation_main_Create_C_result_LiteralInteger36.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Create_C_result_LiteralInteger36.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_WriteLine(InitialMessage)_errorStatus::LiteralInteger44
		addToElementRepository("LiteralInteger44", SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger44);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger44.setName("LiteralInteger44");
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger44.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger44.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15::LiteralInteger17
		addToElementRepository("LiteralInteger17", SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15_LiteralInteger17);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15_LiteralInteger17.setName("LiteralInteger17");
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15_LiteralInteger17.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15_LiteralInteger17.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode::LiteralInteger21
		addToElementRepository("LiteralInteger21", SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger21);
		SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger21.setName("LiteralInteger21");
		SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger21.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger21.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_Set this.p_object::LiteralInteger9
		addToElementRepository("LiteralInteger9", SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger9);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger9.setName("LiteralInteger9");
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger9.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger9.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_B_setPActivity_Set this.p_result::LiteralInteger8
		addToElementRepository("LiteralInteger8", SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger8);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger8.setName("LiteralInteger8");
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger8.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger8.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow27::LiteralInteger28
		addToElementRepository("LiteralInteger28", SingleDelegation_P_PWP_Operation_main_ObjectFlow27_LiteralInteger28);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow27_LiteralInteger28.setName("LiteralInteger28");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow27_LiteralInteger28.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow27_LiteralInteger28.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow51::LiteralInteger53
		addToElementRepository("LiteralInteger53", SingleDelegation_P_PWP_Operation_main_ObjectFlow51_LiteralInteger53);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow51_LiteralInteger53.setName("LiteralInteger53");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow51_LiteralInteger53.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow51_LiteralInteger53.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Call c.p.setP_target::LiteralInteger92
		addToElementRepository("LiteralInteger92", SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target_LiteralInteger92);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target_LiteralInteger92.setName("LiteralInteger92");
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target_LiteralInteger92.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target_LiteralInteger92.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow85::LiteralInteger87
		addToElementRepository("LiteralInteger87", SingleDelegation_P_PWP_Operation_main_ObjectFlow85_LiteralInteger87);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow85_LiteralInteger87.setName("LiteralInteger87");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow85_LiteralInteger87.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow85_LiteralInteger87.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_ObjectFlow22::LiteralInteger24
		addToElementRepository("LiteralInteger24", SingleDelegation_P_PWP_Operation_main_ObjectFlow22_LiteralInteger24);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow22_LiteralInteger24.setName("LiteralInteger24");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow22_LiteralInteger24.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow22_LiteralInteger24.setValue(1);
		// LiteralInteger SingleDelegation_P_PWP_Operation_main_Call c.p.setP_v::LiteralInteger90
		addToElementRepository("LiteralInteger90", SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralInteger90);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralInteger90.setName("LiteralInteger90");
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralInteger90.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralInteger90.setValue(1);
	}

	private void initializeLiteralString_Instances()
	{
		// LiteralString SingleDelegation_P_PWP_Operation_main_EndMessage::LiteralString66
		addToElementRepository("LiteralString66", SingleDelegation_P_PWP_Operation_main_EndMessage_LiteralString66);
		SingleDelegation_P_PWP_Operation_main_EndMessage_LiteralString66.setName("LiteralString66");
		SingleDelegation_P_PWP_Operation_main_EndMessage_LiteralString66.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_EndMessage_LiteralString66.setValue("-- End of test case --");
		// LiteralString SingleDelegation_P_PWP_Operation_main_InitialMessage::LiteralString99
		addToElementRepository("LiteralString99", SingleDelegation_P_PWP_Operation_main_InitialMessage_LiteralString99);
		SingleDelegation_P_PWP_Operation_main_InitialMessage_LiteralString99.setName("LiteralString99");
		SingleDelegation_P_PWP_Operation_main_InitialMessage_LiteralString99.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_InitialMessage_LiteralString99.setValue("-- Running test case: Single delegation connector - Operation delegated from port to part with port --");
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_C()_target::LiteralUnlimitedNatural80
		addToElementRepository("LiteralUnlimitedNatural80", SingleDelegation_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural80);
		SingleDelegation_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural80.setName("LiteralUnlimitedNatural80");
		SingleDelegation_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural80.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural80.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural7
		addToElementRepository("LiteralUnlimitedNatural7", SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural7);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural7.setName("LiteralUnlimitedNatural7");
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural7.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural7.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Call c.p.setP_v::LiteralUnlimitedNatural89
		addToElementRepository("LiteralUnlimitedNatural89", SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralUnlimitedNatural89);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralUnlimitedNatural89.setName("LiteralUnlimitedNatural89");
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralUnlimitedNatural89.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v_LiteralUnlimitedNatural89.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_InitialMessage_result::LiteralUnlimitedNatural101
		addToElementRepository("LiteralUnlimitedNatural101", SingleDelegation_P_PWP_Operation_main_InitialMessage_result_LiteralUnlimitedNatural101);
		SingleDelegation_P_PWP_Operation_main_InitialMessage_result_LiteralUnlimitedNatural101.setName("LiteralUnlimitedNatural101");
		SingleDelegation_P_PWP_Operation_main_InitialMessage_result_LiteralUnlimitedNatural101.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_InitialMessage_result_LiteralUnlimitedNatural101.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_WriteLine(InitialMessage)_errorStatus::LiteralUnlimitedNatural43
		addToElementRepository("LiteralUnlimitedNatural43", SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural43);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural43.setName("LiteralUnlimitedNatural43");
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural43.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural43.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read c.a_result::LiteralUnlimitedNatural108
		addToElementRepository("LiteralUnlimitedNatural108", SingleDelegation_P_PWP_Operation_main_Read_c_a_result_LiteralUnlimitedNatural108);
		SingleDelegation_P_PWP_Operation_main_Read_c_a_result_LiteralUnlimitedNatural108.setName("LiteralUnlimitedNatural108");
		SingleDelegation_P_PWP_Operation_main_Read_c_a_result_LiteralUnlimitedNatural108.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_a_result_LiteralUnlimitedNatural108.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read b.p_object::LiteralUnlimitedNatural69
		addToElementRepository("LiteralUnlimitedNatural69", SingleDelegation_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural69);
		SingleDelegation_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural69.setName("LiteralUnlimitedNatural69");
		SingleDelegation_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural69.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural69.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Call testP_p::LiteralUnlimitedNatural74
		addToElementRepository("LiteralUnlimitedNatural74", SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural74);
		SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural74.setName("LiteralUnlimitedNatural74");
		SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural74.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural74.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read c.p_result::LiteralUnlimitedNatural102
		addToElementRepository("LiteralUnlimitedNatural102", SingleDelegation_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural102);
		SingleDelegation_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural102.setName("LiteralUnlimitedNatural102");
		SingleDelegation_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural102.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural102.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural10
		addToElementRepository("LiteralUnlimitedNatural10", SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10.setName("LiteralUnlimitedNatural10");
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural10.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_WriteLine(EndMessage)_value::LiteralUnlimitedNatural95
		addToElementRepository("LiteralUnlimitedNatural95", SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralUnlimitedNatural95);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralUnlimitedNatural95.setName("LiteralUnlimitedNatural95");
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralUnlimitedNatural95.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value_LiteralUnlimitedNatural95.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_WriteLine(EndMessage)_errorStatus::LiteralUnlimitedNatural98
		addToElementRepository("LiteralUnlimitedNatural98", SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural98);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural98.setName("LiteralUnlimitedNatural98");
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural98.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural98.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_EndMessage_result::LiteralUnlimitedNatural68
		addToElementRepository("LiteralUnlimitedNatural68", SingleDelegation_P_PWP_Operation_main_EndMessage_result_LiteralUnlimitedNatural68);
		SingleDelegation_P_PWP_Operation_main_EndMessage_result_LiteralUnlimitedNatural68.setName("LiteralUnlimitedNatural68");
		SingleDelegation_P_PWP_Operation_main_EndMessage_result_LiteralUnlimitedNatural68.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_EndMessage_result_LiteralUnlimitedNatural68.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read c.p_object::LiteralUnlimitedNatural105
		addToElementRepository("LiteralUnlimitedNatural105", SingleDelegation_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural105);
		SingleDelegation_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural105.setName("LiteralUnlimitedNatural105");
		SingleDelegation_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural105.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural105.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural12
		addToElementRepository("LiteralUnlimitedNatural12", SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural12);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural12.setName("LiteralUnlimitedNatural12");
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural12.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural12.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_WriteLine(InitialMessage)_value::LiteralUnlimitedNatural47
		addToElementRepository("LiteralUnlimitedNatural47", SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralUnlimitedNatural47);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralUnlimitedNatural47.setName("LiteralUnlimitedNatural47");
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralUnlimitedNatural47.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value_LiteralUnlimitedNatural47.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read a.b_result::LiteralUnlimitedNatural40
		addToElementRepository("LiteralUnlimitedNatural40", SingleDelegation_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural40);
		SingleDelegation_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural40.setName("LiteralUnlimitedNatural40");
		SingleDelegation_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural40.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural40.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read b.p_result::LiteralUnlimitedNatural71
		addToElementRepository("LiteralUnlimitedNatural71", SingleDelegation_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural71);
		SingleDelegation_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural71.setName("LiteralUnlimitedNatural71");
		SingleDelegation_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural71.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural71.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_B_setPActivity_this_result::LiteralUnlimitedNatural13
		addToElementRepository("LiteralUnlimitedNatural13", SingleDelegation_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural13);
		SingleDelegation_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural13.setName("LiteralUnlimitedNatural13");
		SingleDelegation_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural13.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural13.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Value(4)_result::LiteralUnlimitedNatural63
		addToElementRepository("LiteralUnlimitedNatural63", SingleDelegation_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural63);
		SingleDelegation_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural63.setName("LiteralUnlimitedNatural63");
		SingleDelegation_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural63.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural63.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read c.a_object::LiteralUnlimitedNatural106
		addToElementRepository("LiteralUnlimitedNatural106", SingleDelegation_P_PWP_Operation_main_Read_c_a_object_LiteralUnlimitedNatural106);
		SingleDelegation_P_PWP_Operation_main_Read_c_a_object_LiteralUnlimitedNatural106.setName("LiteralUnlimitedNatural106");
		SingleDelegation_P_PWP_Operation_main_Read_c_a_object_LiteralUnlimitedNatural106.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_a_object_LiteralUnlimitedNatural106.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Read a.b_object::LiteralUnlimitedNatural39
		addToElementRepository("LiteralUnlimitedNatural39", SingleDelegation_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural39);
		SingleDelegation_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural39.setName("LiteralUnlimitedNatural39");
		SingleDelegation_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural39.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural39.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Call c.p.setP_target::LiteralUnlimitedNatural91
		addToElementRepository("LiteralUnlimitedNatural91", SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target_LiteralUnlimitedNatural91);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target_LiteralUnlimitedNatural91.setName("LiteralUnlimitedNatural91");
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target_LiteralUnlimitedNatural91.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target_LiteralUnlimitedNatural91.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_Create C_result::LiteralUnlimitedNatural37
		addToElementRepository("LiteralUnlimitedNatural37", SingleDelegation_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural37);
		SingleDelegation_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural37.setName("LiteralUnlimitedNatural37");
		SingleDelegation_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural37.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural37.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_PWP_Operation_main_C()_result::LiteralUnlimitedNatural84
		addToElementRepository("LiteralUnlimitedNatural84", SingleDelegation_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural84);
		SingleDelegation_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural84.setName("LiteralUnlimitedNatural84");
		SingleDelegation_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural84.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural84.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow SingleDelegation_P_PWP_Operation_main::ObjectFlow48
		addToElementRepository("ObjectFlow48", SingleDelegation_P_PWP_Operation_main_ObjectFlow48);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow48.setName("ObjectFlow48");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow48.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ObjectFlow48.setSource(SingleDelegation_P_PWP_Operation_main_EndMessage_result);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow48.setTarget(SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_value);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow48.setGuard(SingleDelegation_P_PWP_Operation_main_ObjectFlow48_LiteralBoolean50);
		// ObjectFlow SingleDelegation_P_PWP_Operation_B_setPActivity::ObjectFlow15
		addToElementRepository("ObjectFlow15", SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15.setName("ObjectFlow15");
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15.setSource(SingleDelegation_P_PWP_Operation_B_setPActivity_this_result);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15.setTarget(SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_object);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15.setGuard(SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow15_LiteralBoolean16);
		// ObjectFlow SingleDelegation_P_PWP_Operation_B_setPActivity::ObjectFlow18
		addToElementRepository("ObjectFlow18", SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18.setName("ObjectFlow18");
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18.setSource(SingleDelegation_P_PWP_Operation_B_setPActivity_vParameterNode);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18.setTarget(SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_value);
		SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18.setGuard(SingleDelegation_P_PWP_Operation_B_setPActivity_ObjectFlow18_LiteralBoolean19);
		// ObjectFlow SingleDelegation_P_PWP_Operation_main::ObjectFlow51
		addToElementRepository("ObjectFlow51", SingleDelegation_P_PWP_Operation_main_ObjectFlow51);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow51.setName("ObjectFlow51");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow51.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ObjectFlow51.setSource(SingleDelegation_P_PWP_Operation_main_C__result);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow51.setTarget(SingleDelegation_P_PWP_Operation_main_Fork_C);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow51.setGuard(SingleDelegation_P_PWP_Operation_main_ObjectFlow51_LiteralBoolean52);
		// ObjectFlow SingleDelegation_P_PWP_Operation_main::ObjectFlow54
		addToElementRepository("ObjectFlow54", SingleDelegation_P_PWP_Operation_main_ObjectFlow54);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow54.setName("ObjectFlow54");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow54.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ObjectFlow54.setSource(SingleDelegation_P_PWP_Operation_main_Read_c_a_result);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow54.setTarget(SingleDelegation_P_PWP_Operation_main_Read_a_b_object);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow54.setGuard(SingleDelegation_P_PWP_Operation_main_ObjectFlow54_LiteralBoolean56);
		// ObjectFlow SingleDelegation_P_PWP_Operation_main::ObjectFlow22
		addToElementRepository("ObjectFlow22", SingleDelegation_P_PWP_Operation_main_ObjectFlow22);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow22.setName("ObjectFlow22");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow22.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ObjectFlow22.setSource(SingleDelegation_P_PWP_Operation_main_Read_a_b_result);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow22.setTarget(SingleDelegation_P_PWP_Operation_main_Read_b_p_object);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow22.setGuard(SingleDelegation_P_PWP_Operation_main_ObjectFlow22_LiteralBoolean23);
		// ObjectFlow SingleDelegation_P_PWP_Operation_main::ObjectFlow57
		addToElementRepository("ObjectFlow57", SingleDelegation_P_PWP_Operation_main_ObjectFlow57);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow57.setName("ObjectFlow57");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow57.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ObjectFlow57.setSource(SingleDelegation_P_PWP_Operation_main_Create_C_result);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow57.setTarget(SingleDelegation_P_PWP_Operation_main_C__target);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow57.setGuard(SingleDelegation_P_PWP_Operation_main_ObjectFlow57_LiteralBoolean59);
		// ObjectFlow SingleDelegation_P_PWP_Operation_main::ObjectFlow27
		addToElementRepository("ObjectFlow27", SingleDelegation_P_PWP_Operation_main_ObjectFlow27);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow27.setName("ObjectFlow27");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow27.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ObjectFlow27.setSource(SingleDelegation_P_PWP_Operation_main_Value_4_result);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow27.setTarget(SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_v);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow27.setGuard(SingleDelegation_P_PWP_Operation_main_ObjectFlow27_LiteralBoolean29);
		// ObjectFlow SingleDelegation_P_PWP_Operation_main::ObjectFlow60
		addToElementRepository("ObjectFlow60", SingleDelegation_P_PWP_Operation_main_ObjectFlow60);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow60.setName("ObjectFlow60");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow60.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ObjectFlow60.setSource(SingleDelegation_P_PWP_Operation_main_Read_c_p_result);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow60.setTarget(SingleDelegation_P_PWP_Operation_main_Call_c_p_setP_target);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow60.setGuard(SingleDelegation_P_PWP_Operation_main_ObjectFlow60_LiteralBoolean62);
		// ObjectFlow SingleDelegation_P_PWP_Operation_main::ObjectFlow30
		addToElementRepository("ObjectFlow30", SingleDelegation_P_PWP_Operation_main_ObjectFlow30);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow30.setName("ObjectFlow30");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow30.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ObjectFlow30.setSource(SingleDelegation_P_PWP_Operation_main_InitialMessage_result);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow30.setTarget(SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_value);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow30.setGuard(SingleDelegation_P_PWP_Operation_main_ObjectFlow30_LiteralBoolean32);
		// ObjectFlow SingleDelegation_P_PWP_Operation_main::ObjectFlow76
		addToElementRepository("ObjectFlow76", SingleDelegation_P_PWP_Operation_main_ObjectFlow76);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow76.setName("ObjectFlow76");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow76.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ObjectFlow76.setSource(SingleDelegation_P_PWP_Operation_main_Read_b_p_result);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow76.setTarget(SingleDelegation_P_PWP_Operation_main_Call_testP_p);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow76.setGuard(SingleDelegation_P_PWP_Operation_main_ObjectFlow76_LiteralBoolean78);
		// ObjectFlow SingleDelegation_P_PWP_Operation_main::ObjectFlow33
		addToElementRepository("ObjectFlow33", SingleDelegation_P_PWP_Operation_main_ObjectFlow33);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow33.setName("ObjectFlow33");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow33.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ObjectFlow33.setSource(SingleDelegation_P_PWP_Operation_main_Fork_C);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow33.setTarget(SingleDelegation_P_PWP_Operation_main_Read_c_p_object);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow33.setGuard(SingleDelegation_P_PWP_Operation_main_ObjectFlow33_LiteralBoolean35);
		// ObjectFlow SingleDelegation_P_PWP_Operation_main::ObjectFlow85
		addToElementRepository("ObjectFlow85", SingleDelegation_P_PWP_Operation_main_ObjectFlow85);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow85.setName("ObjectFlow85");
		SingleDelegation_P_PWP_Operation_main_ObjectFlow85.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_ObjectFlow85.setSource(SingleDelegation_P_PWP_Operation_main_Fork_C);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow85.setTarget(SingleDelegation_P_PWP_Operation_main_Read_c_a_object);
		SingleDelegation_P_PWP_Operation_main_ObjectFlow85.setGuard(SingleDelegation_P_PWP_Operation_main_ObjectFlow85_LiteralBoolean86);
	}

	private void initializeOperation_Instances()
	{
		// Operation SingleDelegation_P_PWP_Operation_B::setP_Integer
		addToElementRepository("setP_Integer", SingleDelegation_P_PWP_Operation_B_setP_Integer);
		SingleDelegation_P_PWP_Operation_B_setP_Integer.setName("setP");
		SingleDelegation_P_PWP_Operation_B_setP_Integer.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setP_Integer.addOwnedParameter(SingleDelegation_P_PWP_Operation_B_setP_Integer_v);
		SingleDelegation_P_PWP_Operation_B_setP_Integer.addMethod(SingleDelegation_P_PWP_Operation_B_setPActivity);
		// Operation SingleDelegation_P_PWP_Operation_C::C_C
		addToElementRepository("C_C", SingleDelegation_P_PWP_Operation_C_C_C);
		SingleDelegation_P_PWP_Operation_C_C_C.setName("C");
		SingleDelegation_P_PWP_Operation_C_C_C.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_C_C_C.addOwnedParameter(SingleDelegation_P_PWP_Operation_C_C_C_result);
		SingleDelegation_P_PWP_Operation_C_C_C.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation SingleDelegation_P_PWP_Operation_B::B_B
		addToElementRepository("B_B", SingleDelegation_P_PWP_Operation_B_B_B);
		SingleDelegation_P_PWP_Operation_B_B_B.setName("B");
		SingleDelegation_P_PWP_Operation_B_B_B.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_B_B.addOwnedParameter(SingleDelegation_P_PWP_Operation_B_B_B_result);
		SingleDelegation_P_PWP_Operation_B_B_B.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation SingleDelegation_P_PWP_Operation_IImpl::setP_Integer
		addToElementRepository("setP_Integer", SingleDelegation_P_PWP_Operation_IImpl_setP_Integer);
		SingleDelegation_P_PWP_Operation_IImpl_setP_Integer.setName("setP");
		SingleDelegation_P_PWP_Operation_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_IImpl_setP_Integer.addOwnedParameter(SingleDelegation_P_PWP_Operation_IImpl_setP_Integer_v);
		// Operation SingleDelegation_P_PWP_Operation_I::setP_Integer
		addToElementRepository("setP_Integer", SingleDelegation_P_PWP_Operation_I_setP_Integer);
		SingleDelegation_P_PWP_Operation_I_setP_Integer.setName("setP");
		SingleDelegation_P_PWP_Operation_I_setP_Integer.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_I_setP_Integer.addOwnedParameter(SingleDelegation_P_PWP_Operation_I_setP_Integer_v);
		// Operation SingleDelegation_P_PWP_Operation_A::A_A
		addToElementRepository("A_A", SingleDelegation_P_PWP_Operation_A_A_A);
		SingleDelegation_P_PWP_Operation_A_A_A.setName("A");
		SingleDelegation_P_PWP_Operation_A_A_A.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_A_A_A.addOwnedParameter(SingleDelegation_P_PWP_Operation_A_A_A_result);
		SingleDelegation_P_PWP_Operation_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin SingleDelegation_P_PWP_Operation_main_Read c.p::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_main_Read_c_p_result);
		SingleDelegation_P_PWP_Operation_main_Read_c_p_result.setName("result");
		SingleDelegation_P_PWP_Operation_main_Read_c_p_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_p_result.setType(SingleDelegation_P_PWP_Operation_IImpl);
		// OutputPin SingleDelegation_P_PWP_Operation_main_Read a.b::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_main_Read_a_b_result);
		SingleDelegation_P_PWP_Operation_main_Read_a_b_result.setName("result");
		SingleDelegation_P_PWP_Operation_main_Read_a_b_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_a_b_result.setType(SingleDelegation_P_PWP_Operation_B);
		// OutputPin SingleDelegation_P_PWP_Operation_main_WriteLine(InitialMessage)::errorStatus
		addToElementRepository("errorStatus", SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus.setName("errorStatus");
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		SingleDelegation_P_PWP_Operation_main_WriteLine_InitialMessage_errorStatus.setLower(0);
		// OutputPin SingleDelegation_P_PWP_Operation_main_Value(4)::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_main_Value_4_result);
		SingleDelegation_P_PWP_Operation_main_Value_4_result.setName("result");
		SingleDelegation_P_PWP_Operation_main_Value_4_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin SingleDelegation_P_PWP_Operation_B_setPActivity_Set this.p::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result.setName("result");
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_Set_this_p_result.setType(SingleDelegation_P_PWP_Operation_B);
		// OutputPin SingleDelegation_P_PWP_Operation_main_EndMessage::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_main_EndMessage_result);
		SingleDelegation_P_PWP_Operation_main_EndMessage_result.setName("result");
		SingleDelegation_P_PWP_Operation_main_EndMessage_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_EndMessage_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin SingleDelegation_P_PWP_Operation_B_setPActivity_this::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_B_setPActivity_this_result);
		SingleDelegation_P_PWP_Operation_B_setPActivity_this_result.setName("result");
		SingleDelegation_P_PWP_Operation_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_this_result.setType(SingleDelegation_P_PWP_Operation_B);
		// OutputPin SingleDelegation_P_PWP_Operation_main_Create C::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_main_Create_C_result);
		SingleDelegation_P_PWP_Operation_main_Create_C_result.setName("result");
		SingleDelegation_P_PWP_Operation_main_Create_C_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Create_C_result.setType(SingleDelegation_P_PWP_Operation_C);
		// OutputPin SingleDelegation_P_PWP_Operation_main_Read b.p::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_main_Read_b_p_result);
		SingleDelegation_P_PWP_Operation_main_Read_b_p_result.setName("result");
		SingleDelegation_P_PWP_Operation_main_Read_b_p_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin SingleDelegation_P_PWP_Operation_main_InitialMessage::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_main_InitialMessage_result);
		SingleDelegation_P_PWP_Operation_main_InitialMessage_result.setName("result");
		SingleDelegation_P_PWP_Operation_main_InitialMessage_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_InitialMessage_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin SingleDelegation_P_PWP_Operation_main_Read c.a::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_main_Read_c_a_result);
		SingleDelegation_P_PWP_Operation_main_Read_c_a_result.setName("result");
		SingleDelegation_P_PWP_Operation_main_Read_c_a_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_a_result.setType(SingleDelegation_P_PWP_Operation_A);
		// OutputPin SingleDelegation_P_PWP_Operation_main_C()::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_main_C__result);
		SingleDelegation_P_PWP_Operation_main_C__result.setName("result");
		SingleDelegation_P_PWP_Operation_main_C__result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_C__result.setType(SingleDelegation_P_PWP_Operation_C);
		// OutputPin SingleDelegation_P_PWP_Operation_main_WriteLine(EndMessage)::errorStatus
		addToElementRepository("errorStatus", SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus.setName("errorStatus");
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		SingleDelegation_P_PWP_Operation_main_WriteLine_EndMessage_errorStatus.setLower(0);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport SingleDelegation_P_PWP_Operation::PackageImport1
		addToElementRepository("PackageImport1", SingleDelegation_P_PWP_Operation_PackageImport1);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter SingleDelegation_P_PWP_Operation_main_testP::p
		addToElementRepository("p", SingleDelegation_P_PWP_Operation_main_testP_p);
		SingleDelegation_P_PWP_Operation_main_testP_p.setName("p");
		SingleDelegation_P_PWP_Operation_main_testP_p.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_main_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter SingleDelegation_P_PWP_Operation_A_A_A::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_A_A_A_result);
		SingleDelegation_P_PWP_Operation_A_A_A_result.setName("result");
		SingleDelegation_P_PWP_Operation_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_A_A_A_result.setType(SingleDelegation_P_PWP_Operation_A);
		SingleDelegation_P_PWP_Operation_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter SingleDelegation_P_PWP_Operation_I_setP_Integer::v
		addToElementRepository("v", SingleDelegation_P_PWP_Operation_I_setP_Integer_v);
		SingleDelegation_P_PWP_Operation_I_setP_Integer_v.setName("v");
		SingleDelegation_P_PWP_Operation_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter SingleDelegation_P_PWP_Operation_IImpl_setP_Integer::v
		addToElementRepository("v", SingleDelegation_P_PWP_Operation_IImpl_setP_Integer_v);
		SingleDelegation_P_PWP_Operation_IImpl_setP_Integer_v.setName("v");
		SingleDelegation_P_PWP_Operation_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter SingleDelegation_P_PWP_Operation_B_setP_Integer::v
		addToElementRepository("v", SingleDelegation_P_PWP_Operation_B_setP_Integer_v);
		SingleDelegation_P_PWP_Operation_B_setP_Integer_v.setName("v");
		SingleDelegation_P_PWP_Operation_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter SingleDelegation_P_PWP_Operation_B_B_B::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_B_B_B_result);
		SingleDelegation_P_PWP_Operation_B_B_B_result.setName("result");
		SingleDelegation_P_PWP_Operation_B_B_B_result.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_B_B_B_result.setType(SingleDelegation_P_PWP_Operation_B);
		SingleDelegation_P_PWP_Operation_B_B_B_result.setDirection(ParameterDirectionKind.return_);
		// Parameter SingleDelegation_P_PWP_Operation_B_setPActivity::v
		addToElementRepository("v", SingleDelegation_P_PWP_Operation_B_setPActivity_v);
		SingleDelegation_P_PWP_Operation_B_setPActivity_v.setName("v");
		SingleDelegation_P_PWP_Operation_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter SingleDelegation_P_PWP_Operation_C_C_C::result
		addToElementRepository("result", SingleDelegation_P_PWP_Operation_C_C_C_result);
		SingleDelegation_P_PWP_Operation_C_C_C_result.setName("result");
		SingleDelegation_P_PWP_Operation_C_C_C_result.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_C_C_C_result.setType(SingleDelegation_P_PWP_Operation_C);
		SingleDelegation_P_PWP_Operation_C_C_C_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port SingleDelegation_P_PWP_Operation_C::p
		addToElementRepository("p", SingleDelegation_P_PWP_Operation_C_p);
		SingleDelegation_P_PWP_Operation_C_p.setName("p");
		SingleDelegation_P_PWP_Operation_C_p.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_C_p.setType(SingleDelegation_P_PWP_Operation_IImpl);
		SingleDelegation_P_PWP_Operation_C_p.setAggregation(AggregationKind.composite);
		SingleDelegation_P_PWP_Operation_C_p.isService = true;
		SingleDelegation_P_PWP_Operation_C_p.addProvided(SingleDelegation_P_PWP_Operation_I);
		// Port SingleDelegation_P_PWP_Operation_A::q
		addToElementRepository("q", SingleDelegation_P_PWP_Operation_A_q);
		SingleDelegation_P_PWP_Operation_A_q.setName("q");
		SingleDelegation_P_PWP_Operation_A_q.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_A_q.setType(SingleDelegation_P_PWP_Operation_IImpl);
		SingleDelegation_P_PWP_Operation_A_q.setAggregation(AggregationKind.composite);
		SingleDelegation_P_PWP_Operation_A_q.isService = true;
		SingleDelegation_P_PWP_Operation_A_q.addProvided(SingleDelegation_P_PWP_Operation_I);
	}

	private void initializeProperty_Instances()
	{
		// Property SingleDelegation_P_PWP_Operation_C::a
		addToElementRepository("a", SingleDelegation_P_PWP_Operation_C_a);
		SingleDelegation_P_PWP_Operation_C_a.setName("a");
		SingleDelegation_P_PWP_Operation_C_a.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_C_a.setType(SingleDelegation_P_PWP_Operation_A);
		SingleDelegation_P_PWP_Operation_C_a.setAggregation(AggregationKind.composite);
		// Property SingleDelegation_P_PWP_Operation_R::y
		addToElementRepository("y", SingleDelegation_P_PWP_Operation_R_y);
		SingleDelegation_P_PWP_Operation_R_y.setName("y");
		SingleDelegation_P_PWP_Operation_R_y.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_R_y.setType(SingleDelegation_P_PWP_Operation_IImpl);
		// Property SingleDelegation_P_PWP_Operation_U::x
		addToElementRepository("x", SingleDelegation_P_PWP_Operation_U_x);
		SingleDelegation_P_PWP_Operation_U_x.setName("x");
		SingleDelegation_P_PWP_Operation_U_x.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_U_x.setType(SingleDelegation_P_PWP_Operation_IImpl);
		// Property SingleDelegation_P_PWP_Operation_B::p
		addToElementRepository("p", SingleDelegation_P_PWP_Operation_B_p);
		SingleDelegation_P_PWP_Operation_B_p.setName("p");
		SingleDelegation_P_PWP_Operation_B_p.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property SingleDelegation_P_PWP_Operation_U::y
		addToElementRepository("y", SingleDelegation_P_PWP_Operation_U_y);
		SingleDelegation_P_PWP_Operation_U_y.setName("y");
		SingleDelegation_P_PWP_Operation_U_y.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_U_y.setType(SingleDelegation_P_PWP_Operation_IImpl);
		// Property SingleDelegation_P_PWP_Operation_A::b
		addToElementRepository("b", SingleDelegation_P_PWP_Operation_A_b);
		SingleDelegation_P_PWP_Operation_A_b.setName("b");
		SingleDelegation_P_PWP_Operation_A_b.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_A_b.setType(SingleDelegation_P_PWP_Operation_B);
		SingleDelegation_P_PWP_Operation_A_b.setAggregation(AggregationKind.composite);
		// Property SingleDelegation_P_PWP_Operation_R::x
		addToElementRepository("x", SingleDelegation_P_PWP_Operation_R_x);
		SingleDelegation_P_PWP_Operation_R_x.setName("x");
		SingleDelegation_P_PWP_Operation_R_x.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_PWP_Operation_R_x.setType(SingleDelegation_P_PWP_Operation_B);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction SingleDelegation_P_PWP_Operation_B_setPActivity::this
		addToElementRepository("this", SingleDelegation_P_PWP_Operation_B_setPActivity_this);
		SingleDelegation_P_PWP_Operation_B_setPActivity_this.setName("this");
		SingleDelegation_P_PWP_Operation_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_B_setPActivity_this.setResult(SingleDelegation_P_PWP_Operation_B_setPActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction SingleDelegation_P_PWP_Operation_main::Read b.p
		addToElementRepository("Read b.p", SingleDelegation_P_PWP_Operation_main_Read_b_p);
		SingleDelegation_P_PWP_Operation_main_Read_b_p.setName("Read b.p");
		SingleDelegation_P_PWP_Operation_main_Read_b_p.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_b_p.setStructuralFeature(SingleDelegation_P_PWP_Operation_B_p);
		SingleDelegation_P_PWP_Operation_main_Read_b_p.setObject(SingleDelegation_P_PWP_Operation_main_Read_b_p_object);
		SingleDelegation_P_PWP_Operation_main_Read_b_p.setResult(SingleDelegation_P_PWP_Operation_main_Read_b_p_result);
		// ReadStructuralFeatureAction SingleDelegation_P_PWP_Operation_main::Read a.b
		addToElementRepository("Read a.b", SingleDelegation_P_PWP_Operation_main_Read_a_b);
		SingleDelegation_P_PWP_Operation_main_Read_a_b.setName("Read a.b");
		SingleDelegation_P_PWP_Operation_main_Read_a_b.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_a_b.setStructuralFeature(SingleDelegation_P_PWP_Operation_A_b);
		SingleDelegation_P_PWP_Operation_main_Read_a_b.setObject(SingleDelegation_P_PWP_Operation_main_Read_a_b_object);
		SingleDelegation_P_PWP_Operation_main_Read_a_b.setResult(SingleDelegation_P_PWP_Operation_main_Read_a_b_result);
		// ReadStructuralFeatureAction SingleDelegation_P_PWP_Operation_main::Read c.p
		addToElementRepository("Read c.p", SingleDelegation_P_PWP_Operation_main_Read_c_p);
		SingleDelegation_P_PWP_Operation_main_Read_c_p.setName("Read c.p");
		SingleDelegation_P_PWP_Operation_main_Read_c_p.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_p.setStructuralFeature(SingleDelegation_P_PWP_Operation_C_p);
		SingleDelegation_P_PWP_Operation_main_Read_c_p.setObject(SingleDelegation_P_PWP_Operation_main_Read_c_p_object);
		SingleDelegation_P_PWP_Operation_main_Read_c_p.setResult(SingleDelegation_P_PWP_Operation_main_Read_c_p_result);
		// ReadStructuralFeatureAction SingleDelegation_P_PWP_Operation_main::Read c.a
		addToElementRepository("Read c.a", SingleDelegation_P_PWP_Operation_main_Read_c_a);
		SingleDelegation_P_PWP_Operation_main_Read_c_a.setName("Read c.a");
		SingleDelegation_P_PWP_Operation_main_Read_c_a.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Read_c_a.setStructuralFeature(SingleDelegation_P_PWP_Operation_C_a);
		SingleDelegation_P_PWP_Operation_main_Read_c_a.setObject(SingleDelegation_P_PWP_Operation_main_Read_c_a_object);
		SingleDelegation_P_PWP_Operation_main_Read_c_a.setResult(SingleDelegation_P_PWP_Operation_main_Read_c_a_result);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction SingleDelegation_P_PWP_Operation_main::InitialMessage
		addToElementRepository("InitialMessage", SingleDelegation_P_PWP_Operation_main_InitialMessage);
		SingleDelegation_P_PWP_Operation_main_InitialMessage.setName("InitialMessage");
		SingleDelegation_P_PWP_Operation_main_InitialMessage.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_InitialMessage.setValue(SingleDelegation_P_PWP_Operation_main_InitialMessage_LiteralString99);
		SingleDelegation_P_PWP_Operation_main_InitialMessage.setResult(SingleDelegation_P_PWP_Operation_main_InitialMessage_result);
		// ValueSpecificationAction SingleDelegation_P_PWP_Operation_main::Value(4)
		addToElementRepository("Value(4)", SingleDelegation_P_PWP_Operation_main_Value_4);
		SingleDelegation_P_PWP_Operation_main_Value_4.setName("Value(4)");
		SingleDelegation_P_PWP_Operation_main_Value_4.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_Value_4.setValue(SingleDelegation_P_PWP_Operation_main_Value_4_LiteralInteger65);
		SingleDelegation_P_PWP_Operation_main_Value_4.setResult(SingleDelegation_P_PWP_Operation_main_Value_4_result);
		// ValueSpecificationAction SingleDelegation_P_PWP_Operation_main::EndMessage
		addToElementRepository("EndMessage", SingleDelegation_P_PWP_Operation_main_EndMessage);
		SingleDelegation_P_PWP_Operation_main_EndMessage.setName("EndMessage");
		SingleDelegation_P_PWP_Operation_main_EndMessage.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_PWP_Operation_main_EndMessage.setValue(SingleDelegation_P_PWP_Operation_main_EndMessage_LiteralString66);
		SingleDelegation_P_PWP_Operation_main_EndMessage.setResult(SingleDelegation_P_PWP_Operation_main_EndMessage_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // SingleDelegation_P_PWP_OperationModel
