/*
 * MultipleDelegation_SameConnector_P_PWP_OperationModel.java
 * 
 * Auto-generated file
 */
package MultipleDelegation_SameConnector_P_PWP_Operation;

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

public class MultipleDelegation_SameConnector_P_PWP_OperationModel extends InMemoryModel
{
	private static MultipleDelegation_SameConnector_P_PWP_OperationModel instance;

	/*
	 * Model MultipleDelegation_SameConnector_P_PWP_Operation
	 */
	public Package MultipleDelegation_SameConnector_P_PWP_Operation = new Package();
		public Comment MultipleDelegation_SameConnector_P_PWP_Operation_Comment0 = new Comment();
		public PackageImport MultipleDelegation_SameConnector_P_PWP_Operation_PackageImport1 = new PackageImport();
		public Interface MultipleDelegation_SameConnector_P_PWP_Operation_I = new Interface();
			public Operation MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer_v = new Parameter();
		public Comment MultipleDelegation_SameConnector_P_PWP_Operation_Comment2 = new Comment();
		public Activity MultipleDelegation_SameConnector_P_PWP_Operation_main = new Activity();
			public CallOperationAction MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP_ = new CallOperationAction();
				public InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural3 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralInteger4 = new LiteralInteger();
				public InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural5 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger6 = new LiteralInteger();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger7 = new LiteralInteger();
			public OpaqueBehavior MultipleDelegation_SameConnector_P_PWP_Operation_main_testP = new OpaqueBehavior();
				public Parameter MultipleDelegation_SameConnector_P_PWP_Operation_main_testP_p = new Parameter();
			public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result = new OutputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result_LiteralInteger8 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural9 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural10 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object_LiteralInteger11 = new LiteralInteger();
			public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result = new OutputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result_LiteralInteger12 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural13 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object = new InputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object_LiteralInteger14 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural15 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16_LiteralBoolean17 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16_LiteralInteger18 = new LiteralInteger();
			public CallOperationAction MultipleDelegation_SameConnector_P_PWP_Operation_main_C_ = new CallOperationAction();
				public InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target = new InputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target_LiteralInteger19 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural20 = new LiteralUnlimitedNatural();
				public OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result = new OutputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralInteger21 = new LiteralInteger();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralInteger22 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural23 = new LiteralUnlimitedNatural();
			public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a_ = new ReadStructuralFeatureAction();
				public InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object = new InputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object_LiteralInteger24 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object_LiteralUnlimitedNatural25 = new LiteralUnlimitedNatural();
				public OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result = new OutputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result_LiteralInteger26 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result_LiteralUnlimitedNatural27 = new LiteralUnlimitedNatural();
			public ForkNode MultipleDelegation_SameConnector_P_PWP_Operation_main_Fork_C = new ForkNode();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28_LiteralBoolean29 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28_LiteralInteger30 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31_LiteralInteger32 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31_LiteralBoolean33 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34_LiteralBoolean35 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34_LiteralInteger36 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37_LiteralBoolean38 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37_LiteralInteger39 = new LiteralInteger();
			public ControlFlow MultipleDelegation_SameConnector_P_PWP_Operation_main_ControlFlow40 = new ControlFlow();
			public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result = new OutputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result_LiteralInteger41 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural42 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object = new InputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object_LiteralInteger43 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural44 = new LiteralUnlimitedNatural();
			public CallBehaviorAction MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP = new CallBehaviorAction();
				public InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p = new InputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger45 = new LiteralInteger();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger46 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural47 = new LiteralUnlimitedNatural();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48_LiteralInteger49 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48_LiteralBoolean50 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51_LiteralInteger52 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51_LiteralBoolean53 = new LiteralBoolean();
			public ValueSpecificationAction MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4 = new ValueSpecificationAction();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_LiteralInteger54 = new LiteralInteger();
				public OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result = new OutputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural55 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result_LiteralInteger56 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57_LiteralInteger58 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57_LiteralBoolean59 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60_LiteralBoolean61 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60_LiteralInteger62 = new LiteralInteger();
			public CreateObjectAction MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C = new CreateObjectAction();
				public OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result = new OutputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural63 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result_LiteralInteger64 = new LiteralInteger();
		public Association MultipleDelegation_SameConnector_P_PWP_Operation_R = new Association();
			public Property MultipleDelegation_SameConnector_P_PWP_Operation_R_x = new Property();
			public Property MultipleDelegation_SameConnector_P_PWP_Operation_R_y = new Property();
		public Class_ MultipleDelegation_SameConnector_P_PWP_Operation_IImpl = new Class_();
			public InterfaceRealization MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_IRealization = new InterfaceRealization();
			public Operation MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer_v = new Parameter();
		public Class_ MultipleDelegation_SameConnector_P_PWP_Operation_A = new Class_();
			public Connector MultipleDelegation_SameConnector_P_PWP_Operation_A_r = new Connector();
				public ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Operation_A_r_ConnectorEnd65 = new ConnectorEnd();
				public ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Operation_A_r_ConnectorEnd66 = new ConnectorEnd();
			public Port MultipleDelegation_SameConnector_P_PWP_Operation_A_q = new Port();
			public Property MultipleDelegation_SameConnector_P_PWP_Operation_A_b = new Property();
		public Association MultipleDelegation_SameConnector_P_PWP_Operation_U = new Association();
			public Property MultipleDelegation_SameConnector_P_PWP_Operation_U_y = new Property();
			public Property MultipleDelegation_SameConnector_P_PWP_Operation_U_x = new Property();
		public Class_ MultipleDelegation_SameConnector_P_PWP_Operation_B = new Class_();
			public Activity MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity = new Activity();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67 = new ObjectFlow();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67_LiteralBoolean68 = new LiteralBoolean();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67_LiteralInteger69 = new LiteralInteger();
				public ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70_LiteralInteger71 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70_LiteralBoolean72 = new LiteralBoolean();
				public ReadSelfAction MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural73 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger74 = new LiteralInteger();
				public AddStructuralFeatureValueAction MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger75 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural76 = new LiteralUnlimitedNatural();
					public OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural77 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger78 = new LiteralInteger();
					public InputPin MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger79 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural80 = new LiteralUnlimitedNatural();
				public ActivityParameterNode MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger81 = new LiteralInteger();
				public Parameter MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_v = new Parameter();
			public Property MultipleDelegation_SameConnector_P_PWP_Operation_B_p = new Property();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_p_LiteralInteger82 = new LiteralInteger();
			public Operation MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer_v = new Parameter();
			public InterfaceRealization MultipleDelegation_SameConnector_P_PWP_Operation_B_IRealization = new InterfaceRealization();
		public Class_ MultipleDelegation_SameConnector_P_PWP_Operation_C = new Class_();
			public Connector MultipleDelegation_SameConnector_P_PWP_Operation_C_u = new Connector();
				public ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83 = new ConnectorEnd();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83_LiteralUnlimitedNatural84 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83_LiteralInteger85 = new LiteralInteger();
				public ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86 = new ConnectorEnd();
					public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86_LiteralInteger87 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86_LiteralUnlimitedNatural88 = new LiteralUnlimitedNatural();
			public Port MultipleDelegation_SameConnector_P_PWP_Operation_C_p = new Port();
			public Property MultipleDelegation_SameConnector_P_PWP_Operation_C_a = new Property();
				public LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_C_a_LiteralInteger89 = new LiteralInteger();
				public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_C_a_LiteralUnlimitedNatural90 = new LiteralUnlimitedNatural();
			public Operation MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C_result = new Parameter();

	public static MultipleDelegation_SameConnector_P_PWP_OperationModel instance()
	{
		if (instance == null)
        {
            instance = new MultipleDelegation_SameConnector_P_PWP_OperationModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public MultipleDelegation_SameConnector_P_PWP_OperationModel()
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
		// Activity MultipleDelegation_SameConnector_P_PWP_Operation_B::setPActivity
		addToElementRepository("setPActivity", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity.setName("setPActivity");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity.addOwnedParameter(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_v);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity.addEdge(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity.addEdge(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70);
		// Activity MultipleDelegation_SameConnector_P_PWP_Operation::main
		addToElementRepository("main", MultipleDelegation_SameConnector_P_PWP_Operation_main);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.setName("main");
		MultipleDelegation_SameConnector_P_PWP_Operation_main.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addOwnedBehavior(MultipleDelegation_SameConnector_P_PWP_Operation_main_testP);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_main_C_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addNode(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Operation_main_ControlFlow40);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60);
		MultipleDelegation_SameConnector_P_PWP_Operation_main.addEdge(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode.setName("vParameterNode");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode.setParameter(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_v);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p.setName("Set this.p");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Operation_B_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p.setObject(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p.setValue(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p.setResult(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association MultipleDelegation_SameConnector_P_PWP_Operation::R
		addToElementRepository("R", MultipleDelegation_SameConnector_P_PWP_Operation_R);
		MultipleDelegation_SameConnector_P_PWP_Operation_R.setName("R");
		MultipleDelegation_SameConnector_P_PWP_Operation_R.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_R.addOwnedEnd(MultipleDelegation_SameConnector_P_PWP_Operation_R_x);
		MultipleDelegation_SameConnector_P_PWP_Operation_R.addOwnedEnd(MultipleDelegation_SameConnector_P_PWP_Operation_R_y);
		// Association MultipleDelegation_SameConnector_P_PWP_Operation::U
		addToElementRepository("U", MultipleDelegation_SameConnector_P_PWP_Operation_U);
		MultipleDelegation_SameConnector_P_PWP_Operation_U.setName("U");
		MultipleDelegation_SameConnector_P_PWP_Operation_U.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_U.addOwnedEnd(MultipleDelegation_SameConnector_P_PWP_Operation_U_x);
		MultipleDelegation_SameConnector_P_PWP_Operation_U.addOwnedEnd(MultipleDelegation_SameConnector_P_PWP_Operation_U_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction MultipleDelegation_SameConnector_P_PWP_Operation_main::Call testP
		addToElementRepository("Call testP", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP.setName("Call testP");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP.setBehavior(MultipleDelegation_SameConnector_P_PWP_Operation_main_testP);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP.addArgument(MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction MultipleDelegation_SameConnector_P_PWP_Operation_main::Call p.setP()
		addToElementRepository("Call p.setP()", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP_.setName("Call p.setP()");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP_.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP_.setOperation(MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP_.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP_.addArgument(MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v);
		// CallOperationAction MultipleDelegation_SameConnector_P_PWP_Operation_main::C()
		addToElementRepository("C()", MultipleDelegation_SameConnector_P_PWP_Operation_main_C_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C_.setName("C()");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C_.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C_.addResult(MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C_.setOperation(MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C_.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target);
	}

	private void initializeClass_Instances()
	{
		// Class MultipleDelegation_SameConnector_P_PWP_Operation::IImpl
		addToElementRepository("IImpl", MultipleDelegation_SameConnector_P_PWP_Operation_IImpl);
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl.setName("IImpl");
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl.addInterfaceRealization(MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_IRealization);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl.addOwnedOperation(MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer);
		// Class MultipleDelegation_SameConnector_P_PWP_Operation::A
		addToElementRepository("A", MultipleDelegation_SameConnector_P_PWP_Operation_A);
		MultipleDelegation_SameConnector_P_PWP_Operation_A.setName("A");
		MultipleDelegation_SameConnector_P_PWP_Operation_A.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_A.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Operation_A_q);
		MultipleDelegation_SameConnector_P_PWP_Operation_A.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Operation_A_b);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_A.addOwnedConnector(MultipleDelegation_SameConnector_P_PWP_Operation_A_r);
		// Class MultipleDelegation_SameConnector_P_PWP_Operation::B
		addToElementRepository("B", MultipleDelegation_SameConnector_P_PWP_Operation_B);
		MultipleDelegation_SameConnector_P_PWP_Operation_B.setName("B");
		MultipleDelegation_SameConnector_P_PWP_Operation_B.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_B.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Operation_B_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_B.addOwnedBehavior(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity);
		MultipleDelegation_SameConnector_P_PWP_Operation_B.addInterfaceRealization(MultipleDelegation_SameConnector_P_PWP_Operation_B_IRealization);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_B.addOwnedOperation(MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer);
		// Class MultipleDelegation_SameConnector_P_PWP_Operation::C
		addToElementRepository("C", MultipleDelegation_SameConnector_P_PWP_Operation_C);
		MultipleDelegation_SameConnector_P_PWP_Operation_C.setName("C");
		MultipleDelegation_SameConnector_P_PWP_Operation_C.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_C.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Operation_C_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_C.addOwnedAttribute(MultipleDelegation_SameConnector_P_PWP_Operation_C_a);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_C.addOwnedConnector(MultipleDelegation_SameConnector_P_PWP_Operation_C_u);
		MultipleDelegation_SameConnector_P_PWP_Operation_C.addOwnedOperation(MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C);
	}

	private void initializeComment_Instances()
	{
		// Comment MultipleDelegation_SameConnector_P_PWP_Operation::Comment0
		addToElementRepository("Comment0", MultipleDelegation_SameConnector_P_PWP_Operation_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment MultipleDelegation_SameConnector_P_PWP_Operation::Comment2
		addToElementRepository("Comment2", MultipleDelegation_SameConnector_P_PWP_Operation_Comment2);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector MultipleDelegation_SameConnector_P_PWP_Operation_A::r
		addToElementRepository("r", MultipleDelegation_SameConnector_P_PWP_Operation_A_r);
		MultipleDelegation_SameConnector_P_PWP_Operation_A_r.setName("r");
		MultipleDelegation_SameConnector_P_PWP_Operation_A_r.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_A_r.addEnd(MultipleDelegation_SameConnector_P_PWP_Operation_A_r_ConnectorEnd65);
		MultipleDelegation_SameConnector_P_PWP_Operation_A_r.addEnd(MultipleDelegation_SameConnector_P_PWP_Operation_A_r_ConnectorEnd66);
		MultipleDelegation_SameConnector_P_PWP_Operation_A_r.setType(MultipleDelegation_SameConnector_P_PWP_Operation_R);
		// Connector MultipleDelegation_SameConnector_P_PWP_Operation_C::u
		addToElementRepository("u", MultipleDelegation_SameConnector_P_PWP_Operation_C_u);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u.setName("u");
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u.addEnd(MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u.addEnd(MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u.setType(MultipleDelegation_SameConnector_P_PWP_Operation_U);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Operation_A_r::ConnectorEnd65
		addToElementRepository("ConnectorEnd65", MultipleDelegation_SameConnector_P_PWP_Operation_A_r_ConnectorEnd65);
		MultipleDelegation_SameConnector_P_PWP_Operation_A_r_ConnectorEnd65.setRole(MultipleDelegation_SameConnector_P_PWP_Operation_A_q);
		// ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Operation_C_u::ConnectorEnd83
		addToElementRepository("ConnectorEnd83", MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83.setUpper(-1);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83.setLower(4);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83.setRole(MultipleDelegation_SameConnector_P_PWP_Operation_A_q);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83.setPartWithPort(MultipleDelegation_SameConnector_P_PWP_Operation_C_a);
		// ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Operation_A_r::ConnectorEnd66
		addToElementRepository("ConnectorEnd66", MultipleDelegation_SameConnector_P_PWP_Operation_A_r_ConnectorEnd66);
		MultipleDelegation_SameConnector_P_PWP_Operation_A_r_ConnectorEnd66.setRole(MultipleDelegation_SameConnector_P_PWP_Operation_A_b);
		// ConnectorEnd MultipleDelegation_SameConnector_P_PWP_Operation_C_u::ConnectorEnd86
		addToElementRepository("ConnectorEnd86", MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86.setUpper(-1);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86.setRole(MultipleDelegation_SameConnector_P_PWP_Operation_C_p);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow MultipleDelegation_SameConnector_P_PWP_Operation_main::ControlFlow40
		addToElementRepository("ControlFlow40", MultipleDelegation_SameConnector_P_PWP_Operation_main_ControlFlow40);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ControlFlow40.setName("ControlFlow40");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ControlFlow40.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ControlFlow40.setSource(MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ControlFlow40.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a_);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction MultipleDelegation_SameConnector_P_PWP_Operation_main::Create C
		addToElementRepository("Create C", MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C.setName("Create C");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C.setClassifier(MultipleDelegation_SameConnector_P_PWP_Operation_C);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C.setResult(MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode MultipleDelegation_SameConnector_P_PWP_Operation_main::Fork C
		addToElementRepository("Fork C", MultipleDelegation_SameConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Fork_C.setName("Fork C");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Fork_C.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior MultipleDelegation_SameConnector_P_PWP_Operation_main::testP
		addToElementRepository("testP", MultipleDelegation_SameConnector_P_PWP_Operation_main_testP);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_testP.setName("testP");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_testP.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_testP.addOwnedParameter(MultipleDelegation_SameConnector_P_PWP_Operation_main_testP_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_testP.addLanguage("Java");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_testP.addLanguage("Import");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_testP.addBody("if(index == 1) 	{ 		System.out.println(\"Asserting c.a[1].b.p == 4 || c.a[2].b.p == 4 || c.a[3].b.p == 4 || c.a[4].b.c == 4\"); 	}  	// For some reason, during the first execution of the expansion region, its body is actually executed twice. 	// Because of that, the body is actually executaed 5 times in total. This if-statement covers that up until solved. 	if (index <= MAX_INDEX) 	{ 		// Test parameter p                 int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 		Debug.println(\"[doBody] argument p = \" + p); 	 		System.out.println( \"c.a[\" + index + \"].b.p == \" + p); 		success = success || (p == 4);  		if (index == MAX_INDEX) 		{  			System.out.print(\"Operation call delegated: \");  			if (success) 			{ 				System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 			} 			else 			{ 				System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 			} 		} 	}  	index++;");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Call p.setP()::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target.setName("target");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target.setType(MultipleDelegation_SameConnector_P_PWP_Operation_I);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set this.p::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object.setType(MultipleDelegation_SameConnector_P_PWP_Operation_B);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_C()::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target.setName("target");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target.setType(MultipleDelegation_SameConnector_P_PWP_Operation_C);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read c.p::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object.setType(MultipleDelegation_SameConnector_P_PWP_Operation_C);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read c.a[]::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object.setType(MultipleDelegation_SameConnector_P_PWP_Operation_C);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Call testP::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p.setName("p");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Call p.setP()::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v.setName("v");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read a.b::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object.setType(MultipleDelegation_SameConnector_P_PWP_Operation_A);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read b.p::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object.setName("object");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object.setType(MultipleDelegation_SameConnector_P_PWP_Operation_B);
		// InputPin MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set this.p::value
		addToElementRepository("value", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value.setName("value");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeInterface_Instances()
	{
		// Interface MultipleDelegation_SameConnector_P_PWP_Operation::I
		addToElementRepository("I", MultipleDelegation_SameConnector_P_PWP_Operation_I);
		MultipleDelegation_SameConnector_P_PWP_Operation_I.setName("I");
		MultipleDelegation_SameConnector_P_PWP_Operation_I.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_I.addOwnedOperation(MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization MultipleDelegation_SameConnector_P_PWP_Operation_IImpl::IRealization
		addToElementRepository("IRealization", MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_IRealization);
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_IRealization.setName("IRealization");
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_IRealization.setContract(MultipleDelegation_SameConnector_P_PWP_Operation_I);
		// InterfaceRealization MultipleDelegation_SameConnector_P_PWP_Operation_B::IRealization
		addToElementRepository("IRealization", MultipleDelegation_SameConnector_P_PWP_Operation_B_IRealization);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_IRealization.setName("IRealization");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_IRealization.setContract(MultipleDelegation_SameConnector_P_PWP_Operation_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67::LiteralBoolean68
		addToElementRepository("LiteralBoolean68", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67_LiteralBoolean68);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67_LiteralBoolean68.setName("LiteralBoolean68");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67_LiteralBoolean68.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67_LiteralBoolean68.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37::LiteralBoolean38
		addToElementRepository("LiteralBoolean38", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37_LiteralBoolean38);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37_LiteralBoolean38.setName("LiteralBoolean38");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37_LiteralBoolean38.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37_LiteralBoolean38.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16::LiteralBoolean17
		addToElementRepository("LiteralBoolean17", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16_LiteralBoolean17);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16_LiteralBoolean17.setName("LiteralBoolean17");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16_LiteralBoolean17.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16_LiteralBoolean17.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34::LiteralBoolean35
		addToElementRepository("LiteralBoolean35", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34_LiteralBoolean35);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34_LiteralBoolean35.setName("LiteralBoolean35");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34_LiteralBoolean35.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34_LiteralBoolean35.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60::LiteralBoolean61
		addToElementRepository("LiteralBoolean61", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60_LiteralBoolean61);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60_LiteralBoolean61.setName("LiteralBoolean61");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60_LiteralBoolean61.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60_LiteralBoolean61.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70::LiteralBoolean72
		addToElementRepository("LiteralBoolean72", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70_LiteralBoolean72);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70_LiteralBoolean72.setName("LiteralBoolean72");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70_LiteralBoolean72.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70_LiteralBoolean72.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51::LiteralBoolean53
		addToElementRepository("LiteralBoolean53", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51_LiteralBoolean53);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51_LiteralBoolean53.setName("LiteralBoolean53");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51_LiteralBoolean53.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51_LiteralBoolean53.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28::LiteralBoolean29
		addToElementRepository("LiteralBoolean29", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28_LiteralBoolean29);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28_LiteralBoolean29.setName("LiteralBoolean29");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28_LiteralBoolean29.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28_LiteralBoolean29.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48::LiteralBoolean50
		addToElementRepository("LiteralBoolean50", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48_LiteralBoolean50);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48_LiteralBoolean50.setName("LiteralBoolean50");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48_LiteralBoolean50.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48_LiteralBoolean50.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57::LiteralBoolean59
		addToElementRepository("LiteralBoolean59", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57_LiteralBoolean59);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57_LiteralBoolean59.setName("LiteralBoolean59");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57_LiteralBoolean59.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57_LiteralBoolean59.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31::LiteralBoolean33
		addToElementRepository("LiteralBoolean33", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31_LiteralBoolean33);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31_LiteralBoolean33.setName("LiteralBoolean33");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31_LiteralBoolean33.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31_LiteralBoolean33.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_p::LiteralInteger82
		addToElementRepository("LiteralInteger82", MultipleDelegation_SameConnector_P_PWP_Operation_B_p_LiteralInteger82);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_p_LiteralInteger82.setName("LiteralInteger82");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_p_LiteralInteger82.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_p_LiteralInteger82.setValue(0);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_C()_target::LiteralInteger19
		addToElementRepository("LiteralInteger19", MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target_LiteralInteger19);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target_LiteralInteger19.setName("LiteralInteger19");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target_LiteralInteger19.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target_LiteralInteger19.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48::LiteralInteger49
		addToElementRepository("LiteralInteger49", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48_LiteralInteger49);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48_LiteralInteger49.setName("LiteralInteger49");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48_LiteralInteger49.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48_LiteralInteger49.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read b.p_object::LiteralInteger43
		addToElementRepository("LiteralInteger43", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object_LiteralInteger43);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object_LiteralInteger43.setName("LiteralInteger43");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object_LiteralInteger43.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object_LiteralInteger43.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34::LiteralInteger36
		addToElementRepository("LiteralInteger36", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34_LiteralInteger36);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34_LiteralInteger36.setName("LiteralInteger36");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34_LiteralInteger36.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34_LiteralInteger36.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Value(4)_result::LiteralInteger56
		addToElementRepository("LiteralInteger56", MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result_LiteralInteger56);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result_LiteralInteger56.setName("LiteralInteger56");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result_LiteralInteger56.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result_LiteralInteger56.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37::LiteralInteger39
		addToElementRepository("LiteralInteger39", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37_LiteralInteger39);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37_LiteralInteger39.setName("LiteralInteger39");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37_LiteralInteger39.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37_LiteralInteger39.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_C()_result::LiteralInteger21
		addToElementRepository("LiteralInteger21", MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralInteger21);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralInteger21.setName("LiteralInteger21");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralInteger21.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralInteger21.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Value(4)::LiteralInteger54
		addToElementRepository("LiteralInteger54", MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_LiteralInteger54);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_LiteralInteger54.setName("LiteralInteger54");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_LiteralInteger54.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_LiteralInteger54.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Call testP_p::LiteralInteger46
		addToElementRepository("LiteralInteger46", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger46);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger46.setName("LiteralInteger46");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger46.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger46.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70::LiteralInteger71
		addToElementRepository("LiteralInteger71", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70_LiteralInteger71);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70_LiteralInteger71.setName("LiteralInteger71");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70_LiteralInteger71.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70_LiteralInteger71.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read c.a[]_object::LiteralInteger24
		addToElementRepository("LiteralInteger24", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object_LiteralInteger24);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object_LiteralInteger24.setName("LiteralInteger24");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object_LiteralInteger24.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object_LiteralInteger24.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57::LiteralInteger58
		addToElementRepository("LiteralInteger58", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57_LiteralInteger58);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57_LiteralInteger58.setName("LiteralInteger58");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57_LiteralInteger58.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57_LiteralInteger58.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read c.p_object::LiteralInteger11
		addToElementRepository("LiteralInteger11", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object_LiteralInteger11);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object_LiteralInteger11.setName("LiteralInteger11");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object_LiteralInteger11.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object_LiteralInteger11.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83::LiteralInteger85
		addToElementRepository("LiteralInteger85", MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83_LiteralInteger85);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83_LiteralInteger85.setName("LiteralInteger85");
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83_LiteralInteger85.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83_LiteralInteger85.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set this.p_result::LiteralInteger78
		addToElementRepository("LiteralInteger78", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger78);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger78.setName("LiteralInteger78");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger78.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralInteger78.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set this.p_object::LiteralInteger75
		addToElementRepository("LiteralInteger75", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger75);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger75.setName("LiteralInteger75");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger75.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralInteger75.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67::LiteralInteger69
		addToElementRepository("LiteralInteger69", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67_LiteralInteger69);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67_LiteralInteger69.setName("LiteralInteger69");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67_LiteralInteger69.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67_LiteralInteger69.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_C()_result::LiteralInteger22
		addToElementRepository("LiteralInteger22", MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralInteger22);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralInteger22.setName("LiteralInteger22");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralInteger22.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralInteger22.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Call testP_p::LiteralInteger45
		addToElementRepository("LiteralInteger45", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger45);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger45.setName("LiteralInteger45");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger45.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralInteger45.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set this.p_value::LiteralInteger79
		addToElementRepository("LiteralInteger79", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger79);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger79.setName("LiteralInteger79");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger79.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralInteger79.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result::LiteralInteger74
		addToElementRepository("LiteralInteger74", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger74);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger74.setName("LiteralInteger74");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger74.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralInteger74.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read a.b_object::LiteralInteger14
		addToElementRepository("LiteralInteger14", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object_LiteralInteger14);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object_LiteralInteger14.setName("LiteralInteger14");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object_LiteralInteger14.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object_LiteralInteger14.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_C_a::LiteralInteger89
		addToElementRepository("LiteralInteger89", MultipleDelegation_SameConnector_P_PWP_Operation_C_a_LiteralInteger89);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_a_LiteralInteger89.setName("LiteralInteger89");
		MultipleDelegation_SameConnector_P_PWP_Operation_C_a_LiteralInteger89.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_a_LiteralInteger89.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86::LiteralInteger87
		addToElementRepository("LiteralInteger87", MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86_LiteralInteger87);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86_LiteralInteger87.setName("LiteralInteger87");
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86_LiteralInteger87.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86_LiteralInteger87.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode::LiteralInteger81
		addToElementRepository("LiteralInteger81", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger81);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger81.setName("LiteralInteger81");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger81.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode_LiteralInteger81.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28::LiteralInteger30
		addToElementRepository("LiteralInteger30", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28_LiteralInteger30);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28_LiteralInteger30.setName("LiteralInteger30");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28_LiteralInteger30.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28_LiteralInteger30.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16::LiteralInteger18
		addToElementRepository("LiteralInteger18", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16_LiteralInteger18);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16_LiteralInteger18.setName("LiteralInteger18");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16_LiteralInteger18.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16_LiteralInteger18.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60::LiteralInteger62
		addToElementRepository("LiteralInteger62", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60_LiteralInteger62);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60_LiteralInteger62.setName("LiteralInteger62");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60_LiteralInteger62.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60_LiteralInteger62.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51::LiteralInteger52
		addToElementRepository("LiteralInteger52", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51_LiteralInteger52);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51_LiteralInteger52.setName("LiteralInteger52");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51_LiteralInteger52.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51_LiteralInteger52.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read b.p_result::LiteralInteger41
		addToElementRepository("LiteralInteger41", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result_LiteralInteger41);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result_LiteralInteger41.setName("LiteralInteger41");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result_LiteralInteger41.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result_LiteralInteger41.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31::LiteralInteger32
		addToElementRepository("LiteralInteger32", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31_LiteralInteger32);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31_LiteralInteger32.setName("LiteralInteger32");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31_LiteralInteger32.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31_LiteralInteger32.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Call p.setP()_v::LiteralInteger6
		addToElementRepository("LiteralInteger6", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger6);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger6.setName("LiteralInteger6");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger6.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger6.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read a.b_result::LiteralInteger12
		addToElementRepository("LiteralInteger12", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result_LiteralInteger12);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result_LiteralInteger12.setName("LiteralInteger12");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result_LiteralInteger12.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result_LiteralInteger12.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Create C_result::LiteralInteger64
		addToElementRepository("LiteralInteger64", MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result_LiteralInteger64);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result_LiteralInteger64.setName("LiteralInteger64");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result_LiteralInteger64.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result_LiteralInteger64.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read c.a[]_result::LiteralInteger26
		addToElementRepository("LiteralInteger26", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result_LiteralInteger26);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result_LiteralInteger26.setName("LiteralInteger26");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result_LiteralInteger26.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result_LiteralInteger26.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Read c.p_result::LiteralInteger8
		addToElementRepository("LiteralInteger8", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result_LiteralInteger8);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result_LiteralInteger8.setName("LiteralInteger8");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result_LiteralInteger8.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result_LiteralInteger8.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Call p.setP()_target::LiteralInteger4
		addToElementRepository("LiteralInteger4", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralInteger4);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralInteger4.setName("LiteralInteger4");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralInteger4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralInteger4.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_PWP_Operation_main_Call p.setP()_v::LiteralInteger7
		addToElementRepository("LiteralInteger7", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger7);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger7.setName("LiteralInteger7");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger7.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralInteger7.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result::LiteralUnlimitedNatural73
		addToElementRepository("LiteralUnlimitedNatural73", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural73);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural73.setName("LiteralUnlimitedNatural73");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural73.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural73.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Call p.setP()_v::LiteralUnlimitedNatural5
		addToElementRepository("LiteralUnlimitedNatural5", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural5);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural5.setName("LiteralUnlimitedNatural5");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural5.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural5.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read a.b_object::LiteralUnlimitedNatural15
		addToElementRepository("LiteralUnlimitedNatural15", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural15);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural15.setName("LiteralUnlimitedNatural15");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural15.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object_LiteralUnlimitedNatural15.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read c.a[]_object::LiteralUnlimitedNatural25
		addToElementRepository("LiteralUnlimitedNatural25", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object_LiteralUnlimitedNatural25);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object_LiteralUnlimitedNatural25.setName("LiteralUnlimitedNatural25");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object_LiteralUnlimitedNatural25.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object_LiteralUnlimitedNatural25.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Call p.setP()_target::LiteralUnlimitedNatural3
		addToElementRepository("LiteralUnlimitedNatural3", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural3);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural3.setName("LiteralUnlimitedNatural3");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural3.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read b.p_result::LiteralUnlimitedNatural42
		addToElementRepository("LiteralUnlimitedNatural42", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural42);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural42.setName("LiteralUnlimitedNatural42");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural42.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result_LiteralUnlimitedNatural42.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read a.b_result::LiteralUnlimitedNatural13
		addToElementRepository("LiteralUnlimitedNatural13", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural13);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural13.setName("LiteralUnlimitedNatural13");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural13.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result_LiteralUnlimitedNatural13.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_C()_result::LiteralUnlimitedNatural23
		addToElementRepository("LiteralUnlimitedNatural23", MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural23);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural23.setName("LiteralUnlimitedNatural23");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural23.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result_LiteralUnlimitedNatural23.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural77
		addToElementRepository("LiteralUnlimitedNatural77", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural77);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural77.setName("LiteralUnlimitedNatural77");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural77.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural77.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural80
		addToElementRepository("LiteralUnlimitedNatural80", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural80);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural80.setName("LiteralUnlimitedNatural80");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural80.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural80.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read c.p_object::LiteralUnlimitedNatural10
		addToElementRepository("LiteralUnlimitedNatural10", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural10);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural10.setName("LiteralUnlimitedNatural10");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural10.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object_LiteralUnlimitedNatural10.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Call testP_p::LiteralUnlimitedNatural47
		addToElementRepository("LiteralUnlimitedNatural47", MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural47);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural47.setName("LiteralUnlimitedNatural47");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural47.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p_LiteralUnlimitedNatural47.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83::LiteralUnlimitedNatural84
		addToElementRepository("LiteralUnlimitedNatural84", MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83_LiteralUnlimitedNatural84);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83_LiteralUnlimitedNatural84.setName("LiteralUnlimitedNatural84");
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83_LiteralUnlimitedNatural84.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd83_LiteralUnlimitedNatural84.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Create C_result::LiteralUnlimitedNatural63
		addToElementRepository("LiteralUnlimitedNatural63", MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural63);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural63.setName("LiteralUnlimitedNatural63");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural63.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result_LiteralUnlimitedNatural63.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_C_a::LiteralUnlimitedNatural90
		addToElementRepository("LiteralUnlimitedNatural90", MultipleDelegation_SameConnector_P_PWP_Operation_C_a_LiteralUnlimitedNatural90);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_a_LiteralUnlimitedNatural90.setName("LiteralUnlimitedNatural90");
		MultipleDelegation_SameConnector_P_PWP_Operation_C_a_LiteralUnlimitedNatural90.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_a_LiteralUnlimitedNatural90.setValue(4);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Value(4)_result::LiteralUnlimitedNatural55
		addToElementRepository("LiteralUnlimitedNatural55", MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural55);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural55.setName("LiteralUnlimitedNatural55");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural55.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result_LiteralUnlimitedNatural55.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86::LiteralUnlimitedNatural88
		addToElementRepository("LiteralUnlimitedNatural88", MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86_LiteralUnlimitedNatural88);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86_LiteralUnlimitedNatural88.setName("LiteralUnlimitedNatural88");
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86_LiteralUnlimitedNatural88.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_u_ConnectorEnd86_LiteralUnlimitedNatural88.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_C()_target::LiteralUnlimitedNatural20
		addToElementRepository("LiteralUnlimitedNatural20", MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural20);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural20.setName("LiteralUnlimitedNatural20");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural20.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target_LiteralUnlimitedNatural20.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read c.p_result::LiteralUnlimitedNatural9
		addToElementRepository("LiteralUnlimitedNatural9", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural9);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural9.setName("LiteralUnlimitedNatural9");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural9.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result_LiteralUnlimitedNatural9.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural76
		addToElementRepository("LiteralUnlimitedNatural76", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural76);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural76.setName("LiteralUnlimitedNatural76");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural76.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural76.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read b.p_object::LiteralUnlimitedNatural44
		addToElementRepository("LiteralUnlimitedNatural44", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural44);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural44.setName("LiteralUnlimitedNatural44");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural44.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object_LiteralUnlimitedNatural44.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_PWP_Operation_main_Read c.a[]_result::LiteralUnlimitedNatural27
		addToElementRepository("LiteralUnlimitedNatural27", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result_LiteralUnlimitedNatural27);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result_LiteralUnlimitedNatural27.setName("LiteralUnlimitedNatural27");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result_LiteralUnlimitedNatural27.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result_LiteralUnlimitedNatural27.setValue(4);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity::ObjectFlow67
		addToElementRepository("ObjectFlow67", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67.setName("ObjectFlow67");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67.setSource(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_vParameterNode);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_value);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67.setGuard(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow67_LiteralBoolean68);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main::ObjectFlow28
		addToElementRepository("ObjectFlow28", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28.setName("ObjectFlow28");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28.setSource(MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_main_C__target);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28.setGuard(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow28_LiteralBoolean29);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main::ObjectFlow31
		addToElementRepository("ObjectFlow31", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31.setName("ObjectFlow31");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31.setSource(MultipleDelegation_SameConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31.setGuard(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow31_LiteralBoolean33);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity::ObjectFlow70
		addToElementRepository("ObjectFlow70", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70.setName("ObjectFlow70");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70.setSource(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_object);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70.setGuard(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_ObjectFlow70_LiteralBoolean72);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main::ObjectFlow34
		addToElementRepository("ObjectFlow34", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34.setName("ObjectFlow34");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34.setSource(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34.setGuard(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow34_LiteralBoolean35);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main::ObjectFlow37
		addToElementRepository("ObjectFlow37", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37.setName("ObjectFlow37");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37.setSource(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__target);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37.setGuard(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow37_LiteralBoolean38);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main::ObjectFlow51
		addToElementRepository("ObjectFlow51", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51.setName("ObjectFlow51");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51.setSource(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_testP_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51.setGuard(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow51_LiteralBoolean53);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main::ObjectFlow48
		addToElementRepository("ObjectFlow48", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48.setName("ObjectFlow48");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48.setSource(MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_main_Call_p_setP__v);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48.setGuard(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow48_LiteralBoolean50);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main::ObjectFlow57
		addToElementRepository("ObjectFlow57", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57.setName("ObjectFlow57");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57.setSource(MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57.setGuard(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow57_LiteralBoolean59);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main::ObjectFlow60
		addToElementRepository("ObjectFlow60", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60.setName("ObjectFlow60");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60.setSource(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60.setGuard(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow60_LiteralBoolean61);
		// ObjectFlow MultipleDelegation_SameConnector_P_PWP_Operation_main::ObjectFlow16
		addToElementRepository("ObjectFlow16", MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16.setName("ObjectFlow16");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16.setSource(MultipleDelegation_SameConnector_P_PWP_Operation_main_Fork_C);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16.setTarget(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16.setGuard(MultipleDelegation_SameConnector_P_PWP_Operation_main_ObjectFlow16_LiteralBoolean17);
	}

	private void initializeOperation_Instances()
	{
		// Operation MultipleDelegation_SameConnector_P_PWP_Operation_B::setP_Integer
		addToElementRepository("setP_Integer", MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer.setName("setP");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer.addOwnedParameter(MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer_v);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer.addMethod(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity);
		// Operation MultipleDelegation_SameConnector_P_PWP_Operation_I::setP_Integer
		addToElementRepository("setP_Integer", MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer);
		MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer.setName("setP");
		MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer.addOwnedParameter(MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer_v);
		// Operation MultipleDelegation_SameConnector_P_PWP_Operation_IImpl::setP_Integer
		addToElementRepository("setP_Integer", MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer);
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer.setName("setP");
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer.addOwnedParameter(MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer_v);
		// Operation MultipleDelegation_SameConnector_P_PWP_Operation_C::C_C
		addToElementRepository("C_C", MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C.setName("C");
		MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C.addOwnedParameter(MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read c.p::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result.setType(MultipleDelegation_SameConnector_P_PWP_Operation_IImpl);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Value(4)::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read a.b::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result.setType(MultipleDelegation_SameConnector_P_PWP_Operation_B);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Create C::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Create_C_result.setType(MultipleDelegation_SameConnector_P_PWP_Operation_C);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result.setType(MultipleDelegation_SameConnector_P_PWP_Operation_B);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read c.a[]::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result.setType(MultipleDelegation_SameConnector_P_PWP_Operation_A);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result.setUpper(4);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result.setLower(4);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_Read b.p::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set this.p::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_Set_this_p_result.setType(MultipleDelegation_SameConnector_P_PWP_Operation_B);
		// OutputPin MultipleDelegation_SameConnector_P_PWP_Operation_main_C()::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_C__result.setType(MultipleDelegation_SameConnector_P_PWP_Operation_C);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport MultipleDelegation_SameConnector_P_PWP_Operation::PackageImport1
		addToElementRepository("PackageImport1", MultipleDelegation_SameConnector_P_PWP_Operation_PackageImport1);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer_v);
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer_v.setName("v");
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer_v);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer_v.setName("v");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_v);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_v.setName("v");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_SameConnector_P_PWP_Operation_main_testP::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_PWP_Operation_main_testP_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_testP_p.setName("p");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_testP_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_main_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C_result);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C_result.setName("result");
		MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C_result.setType(MultipleDelegation_SameConnector_P_PWP_Operation_C);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_C_C_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer_v);
		MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer_v.setName("v");
		MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializePort_Instances()
	{
		// Port MultipleDelegation_SameConnector_P_PWP_Operation_C::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_PWP_Operation_C_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_p.setName("p");
		MultipleDelegation_SameConnector_P_PWP_Operation_C_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_C_p.setType(MultipleDelegation_SameConnector_P_PWP_Operation_IImpl);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_p.setAggregation(AggregationKind.composite);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_p.isService = true;
		MultipleDelegation_SameConnector_P_PWP_Operation_C_p.addProvided(MultipleDelegation_SameConnector_P_PWP_Operation_I);
		// Port MultipleDelegation_SameConnector_P_PWP_Operation_A::q
		addToElementRepository("q", MultipleDelegation_SameConnector_P_PWP_Operation_A_q);
		MultipleDelegation_SameConnector_P_PWP_Operation_A_q.setName("q");
		MultipleDelegation_SameConnector_P_PWP_Operation_A_q.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_A_q.setType(MultipleDelegation_SameConnector_P_PWP_Operation_IImpl);
		MultipleDelegation_SameConnector_P_PWP_Operation_A_q.setAggregation(AggregationKind.composite);
		MultipleDelegation_SameConnector_P_PWP_Operation_A_q.isService = true;
		MultipleDelegation_SameConnector_P_PWP_Operation_A_q.addProvided(MultipleDelegation_SameConnector_P_PWP_Operation_I);
	}

	private void initializeProperty_Instances()
	{
		// Property MultipleDelegation_SameConnector_P_PWP_Operation_B::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_PWP_Operation_B_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_p.setName("p");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_p.setDefaultValue(MultipleDelegation_SameConnector_P_PWP_Operation_B_p_LiteralInteger82);
		// Property MultipleDelegation_SameConnector_P_PWP_Operation_U::y
		addToElementRepository("y", MultipleDelegation_SameConnector_P_PWP_Operation_U_y);
		MultipleDelegation_SameConnector_P_PWP_Operation_U_y.setName("y");
		MultipleDelegation_SameConnector_P_PWP_Operation_U_y.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_U_y.setType(MultipleDelegation_SameConnector_P_PWP_Operation_IImpl);
		// Property MultipleDelegation_SameConnector_P_PWP_Operation_R::x
		addToElementRepository("x", MultipleDelegation_SameConnector_P_PWP_Operation_R_x);
		MultipleDelegation_SameConnector_P_PWP_Operation_R_x.setName("x");
		MultipleDelegation_SameConnector_P_PWP_Operation_R_x.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_R_x.setType(MultipleDelegation_SameConnector_P_PWP_Operation_B);
		// Property MultipleDelegation_SameConnector_P_PWP_Operation_U::x
		addToElementRepository("x", MultipleDelegation_SameConnector_P_PWP_Operation_U_x);
		MultipleDelegation_SameConnector_P_PWP_Operation_U_x.setName("x");
		MultipleDelegation_SameConnector_P_PWP_Operation_U_x.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_U_x.setType(MultipleDelegation_SameConnector_P_PWP_Operation_IImpl);
		// Property MultipleDelegation_SameConnector_P_PWP_Operation_C::a
		addToElementRepository("a", MultipleDelegation_SameConnector_P_PWP_Operation_C_a);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_a.setName("a");
		MultipleDelegation_SameConnector_P_PWP_Operation_C_a.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_a.setUpper(4);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_a.setLower(4);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_a.setType(MultipleDelegation_SameConnector_P_PWP_Operation_A);
		MultipleDelegation_SameConnector_P_PWP_Operation_C_a.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_SameConnector_P_PWP_Operation_A::b
		addToElementRepository("b", MultipleDelegation_SameConnector_P_PWP_Operation_A_b);
		MultipleDelegation_SameConnector_P_PWP_Operation_A_b.setName("b");
		MultipleDelegation_SameConnector_P_PWP_Operation_A_b.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_A_b.setType(MultipleDelegation_SameConnector_P_PWP_Operation_B);
		MultipleDelegation_SameConnector_P_PWP_Operation_A_b.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_SameConnector_P_PWP_Operation_R::y
		addToElementRepository("y", MultipleDelegation_SameConnector_P_PWP_Operation_R_y);
		MultipleDelegation_SameConnector_P_PWP_Operation_R_y.setName("y");
		MultipleDelegation_SameConnector_P_PWP_Operation_R_y.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_PWP_Operation_R_y.setType(MultipleDelegation_SameConnector_P_PWP_Operation_IImpl);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity::this
		addToElementRepository("this", MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this.setName("this");
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this.setResult(MultipleDelegation_SameConnector_P_PWP_Operation_B_setPActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Operation_main::Read b.p
		addToElementRepository("Read b.p", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p.setName("Read b.p");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Operation_B_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p.setObject(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_object);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p.setResult(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_b_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Operation_main::Read c.p
		addToElementRepository("Read c.p", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p.setName("Read c.p");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Operation_C_p);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p.setObject(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_object);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p.setResult(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Operation_main::Read a.b
		addToElementRepository("Read a.b", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b.setName("Read a.b");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Operation_A_b);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b.setObject(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_object);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b.setResult(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_a_b_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_PWP_Operation_main::Read c.a[]
		addToElementRepository("Read c.a[]", MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a_.setName("Read c.a[]");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a_.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a_.setStructuralFeature(MultipleDelegation_SameConnector_P_PWP_Operation_C_a);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a_.setObject(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__object);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a_.setResult(MultipleDelegation_SameConnector_P_PWP_Operation_main_Read_c_a__result);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction MultipleDelegation_SameConnector_P_PWP_Operation_main::Value(4)
		addToElementRepository("Value(4)", MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4.setName("Value(4)");
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4.setValue(MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_LiteralInteger54);
		MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4.setResult(MultipleDelegation_SameConnector_P_PWP_Operation_main_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // MultipleDelegation_SameConnector_P_PWP_OperationModel
