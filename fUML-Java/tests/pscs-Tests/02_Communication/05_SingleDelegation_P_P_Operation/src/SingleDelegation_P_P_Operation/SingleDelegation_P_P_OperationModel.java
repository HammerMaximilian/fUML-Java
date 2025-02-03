/*
 * SingleDelegation_P_P_OperationModel.java
 * 
 * Auto-generated file
 */
package SingleDelegation_P_P_Operation;

import uml.structuredclassifiers.ConnectorEnd;
import uml.actions.ReadSelfAction;
import uml.values.LiteralBoolean;
import uml.structuredclassifiers.Connector;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.InterfaceRealization;
import uml.actions.OutputPin;
import uml.activities.Activity;
import uml.actions.CallOperationAction;
import uml.actions.ReadStructuralFeatureAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.values.LiteralString;
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

public class SingleDelegation_P_P_OperationModel extends InMemoryModel
{
	private static SingleDelegation_P_P_OperationModel instance;

	/*
	 * Model SingleDelegation_P_P_Operation
	 */
	public Package SingleDelegation_P_P_Operation = new Package();
		public Comment SingleDelegation_P_P_Operation_Comment0 = new Comment();
		public PackageImport SingleDelegation_P_P_Operation_PackageImport1 = new PackageImport();
		public Interface SingleDelegation_P_P_Operation_I = new Interface();
			public Operation SingleDelegation_P_P_Operation_I_setP_Integer = new Operation();
				public Parameter SingleDelegation_P_P_Operation_I_setP_Integer_v = new Parameter();
		public Comment SingleDelegation_P_P_Operation_Comment2 = new Comment();
		public Class_ SingleDelegation_P_P_Operation_IImpl = new Class_();
			public InterfaceRealization SingleDelegation_P_P_Operation_IImpl_IRealization = new InterfaceRealization();
			public Operation SingleDelegation_P_P_Operation_IImpl_setP_Integer = new Operation();
				public Parameter SingleDelegation_P_P_Operation_IImpl_setP_Integer_v = new Parameter();
		public Class_ SingleDelegation_P_P_Operation_A = new Class_();
			public Property SingleDelegation_P_P_Operation_A_b = new Property();
			public Operation SingleDelegation_P_P_Operation_A_A_A = new Operation();
				public Parameter SingleDelegation_P_P_Operation_A_A_A_result = new Parameter();
			public Port SingleDelegation_P_P_Operation_A_q = new Port();
			public Connector SingleDelegation_P_P_Operation_A_r = new Connector();
				public ConnectorEnd SingleDelegation_P_P_Operation_A_r_ConnectorEnd3 = new ConnectorEnd();
				public ConnectorEnd SingleDelegation_P_P_Operation_A_r_ConnectorEnd4 = new ConnectorEnd();
		public Association SingleDelegation_P_P_Operation_R = new Association();
			public Property SingleDelegation_P_P_Operation_R_y = new Property();
			public Property SingleDelegation_P_P_Operation_R_x = new Property();
		public Class_ SingleDelegation_P_P_Operation_B = new Class_();
			public Operation SingleDelegation_P_P_Operation_B_setP_Integer = new Operation();
				public Parameter SingleDelegation_P_P_Operation_B_setP_Integer_v = new Parameter();
			public Property SingleDelegation_P_P_Operation_B_p = new Property();
			public Operation SingleDelegation_P_P_Operation_B_B_B = new Operation();
				public Parameter SingleDelegation_P_P_Operation_B_B_B_result = new Parameter();
			public InterfaceRealization SingleDelegation_P_P_Operation_B_IRealization = new InterfaceRealization();
			public Activity SingleDelegation_P_P_Operation_B_setPActivity = new Activity();
				public ObjectFlow SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5 = new ObjectFlow();
					public LiteralBoolean SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5_LiteralBoolean6 = new LiteralBoolean();
					public LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5_LiteralInteger7 = new LiteralInteger();
				public ReadSelfAction SingleDelegation_P_P_Operation_B_setPActivity_this = new ReadSelfAction();
					public OutputPin SingleDelegation_P_P_Operation_B_setPActivity_this_result = new OutputPin();
						public LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_this_result_LiteralInteger8 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural9 = new LiteralUnlimitedNatural();
				public Parameter SingleDelegation_P_P_Operation_B_setPActivity_v = new Parameter();
				public AddStructuralFeatureValueAction SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger10 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11 = new LiteralUnlimitedNatural();
					public OutputPin SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger12 = new LiteralInteger();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural13 = new LiteralUnlimitedNatural();
					public InputPin SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural14 = new LiteralUnlimitedNatural();
						public LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger15 = new LiteralInteger();
				public ObjectFlow SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16 = new ObjectFlow();
					public LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16_LiteralInteger17 = new LiteralInteger();
					public LiteralBoolean SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16_LiteralBoolean18 = new LiteralBoolean();
				public ActivityParameterNode SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger19 = new LiteralInteger();
		public Activity SingleDelegation_P_P_Operation_main = new Activity();
			public CreateObjectAction SingleDelegation_P_P_Operation_main_Create_A = new CreateObjectAction();
				public OutputPin SingleDelegation_P_P_Operation_main_Create_A_result = new OutputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Create_A_result_LiteralInteger20 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Create_A_result_LiteralUnlimitedNatural21 = new LiteralUnlimitedNatural();
			public ValueSpecificationAction SingleDelegation_P_P_Operation_main_EndMessage = new ValueSpecificationAction();
				public LiteralString SingleDelegation_P_P_Operation_main_EndMessage_LiteralString22 = new LiteralString();
				public OutputPin SingleDelegation_P_P_Operation_main_EndMessage_result = new OutputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_EndMessage_result_LiteralInteger23 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_EndMessage_result_LiteralUnlimitedNatural24 = new LiteralUnlimitedNatural();
			public ObjectFlow SingleDelegation_P_P_Operation_main_ObjectFlow25 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow25_LiteralInteger26 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow25_LiteralBoolean27 = new LiteralBoolean();
			public ControlFlow SingleDelegation_P_P_Operation_main_ControlFlow28 = new ControlFlow();
			public CallOperationAction SingleDelegation_P_P_Operation_main_A_ = new CallOperationAction();
				public InputPin SingleDelegation_P_P_Operation_main_A__target = new InputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_A__target_LiteralInteger29 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_A__target_LiteralUnlimitedNatural30 = new LiteralUnlimitedNatural();
				public OutputPin SingleDelegation_P_P_Operation_main_A__result = new OutputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_A__result_LiteralInteger31 = new LiteralInteger();
					public LiteralInteger SingleDelegation_P_P_Operation_main_A__result_LiteralInteger32 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_A__result_LiteralUnlimitedNatural33 = new LiteralUnlimitedNatural();
			public ObjectFlow SingleDelegation_P_P_Operation_main_ObjectFlow34 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow34_LiteralInteger35 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow34_LiteralBoolean36 = new LiteralBoolean();
			public ControlFlow SingleDelegation_P_P_Operation_main_ControlFlow37 = new ControlFlow();
			public ControlFlow SingleDelegation_P_P_Operation_main_ControlFlow38 = new ControlFlow();
			public ReadStructuralFeatureAction SingleDelegation_P_P_Operation_main_Read_a_b = new ReadStructuralFeatureAction();
				public OutputPin SingleDelegation_P_P_Operation_main_Read_a_b_result = new OutputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Read_a_b_result_LiteralInteger39 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Read_a_b_result_LiteralUnlimitedNatural40 = new LiteralUnlimitedNatural();
				public InputPin SingleDelegation_P_P_Operation_main_Read_a_b_object = new InputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Read_a_b_object_LiteralInteger41 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Read_a_b_object_LiteralUnlimitedNatural42 = new LiteralUnlimitedNatural();
			public CallBehaviorAction SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage = new CallBehaviorAction();
				public InputPin SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value = new InputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralInteger43 = new LiteralInteger();
					public LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralInteger44 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralUnlimitedNatural45 = new LiteralUnlimitedNatural();
				public OutputPin SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus = new OutputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger47 = new LiteralInteger();
					public LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger48 = new LiteralInteger();
			public ObjectFlow SingleDelegation_P_P_Operation_main_ObjectFlow49 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow49_LiteralInteger50 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow49_LiteralBoolean51 = new LiteralBoolean();
			public ObjectFlow SingleDelegation_P_P_Operation_main_ObjectFlow52 = new ObjectFlow();
				public LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow52_LiteralBoolean53 = new LiteralBoolean();
				public LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow52_LiteralInteger54 = new LiteralInteger();
			public ObjectFlow SingleDelegation_P_P_Operation_main_ObjectFlow55 = new ObjectFlow();
				public LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow55_LiteralBoolean56 = new LiteralBoolean();
				public LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow55_LiteralInteger57 = new LiteralInteger();
			public ObjectFlow SingleDelegation_P_P_Operation_main_ObjectFlow58 = new ObjectFlow();
				public LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow58_LiteralBoolean59 = new LiteralBoolean();
				public LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow58_LiteralInteger60 = new LiteralInteger();
			public ValueSpecificationAction SingleDelegation_P_P_Operation_main_Value_4 = new ValueSpecificationAction();
				public OutputPin SingleDelegation_P_P_Operation_main_Value_4_result = new OutputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Value_4_result_LiteralInteger61 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural62 = new LiteralUnlimitedNatural();
				public LiteralInteger SingleDelegation_P_P_Operation_main_Value_4_LiteralInteger63 = new LiteralInteger();
			public CallBehaviorAction SingleDelegation_P_P_Operation_main_WriteLine_EndMessage = new CallBehaviorAction();
				public InputPin SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value = new InputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralUnlimitedNatural64 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralInteger65 = new LiteralInteger();
					public LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralInteger66 = new LiteralInteger();
				public OutputPin SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus = new OutputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger67 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural68 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger69 = new LiteralInteger();
			public CallOperationAction SingleDelegation_P_P_Operation_main_Call_a_q_setP = new CallOperationAction();
				public InputPin SingleDelegation_P_P_Operation_main_Call_a_q_setP_v = new InputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralInteger70 = new LiteralInteger();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralInteger71 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralUnlimitedNatural72 = new LiteralUnlimitedNatural();
				public InputPin SingleDelegation_P_P_Operation_main_Call_a_q_setP_target = new InputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Call_a_q_setP_target_LiteralInteger73 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Call_a_q_setP_target_LiteralUnlimitedNatural74 = new LiteralUnlimitedNatural();
			public ObjectFlow SingleDelegation_P_P_Operation_main_ObjectFlow75 = new ObjectFlow();
				public LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow75_LiteralBoolean76 = new LiteralBoolean();
				public LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow75_LiteralInteger77 = new LiteralInteger();
			public ReadStructuralFeatureAction SingleDelegation_P_P_Operation_main_Read_a_b_p = new ReadStructuralFeatureAction();
				public InputPin SingleDelegation_P_P_Operation_main_Read_a_b_p_object = new InputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Read_a_b_p_object_LiteralInteger78 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Read_a_b_p_object_LiteralUnlimitedNatural79 = new LiteralUnlimitedNatural();
				public OutputPin SingleDelegation_P_P_Operation_main_Read_a_b_p_result = new OutputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Read_a_b_p_result_LiteralUnlimitedNatural80 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Read_a_b_p_result_LiteralInteger81 = new LiteralInteger();
			public ObjectFlow SingleDelegation_P_P_Operation_main_ObjectFlow82 = new ObjectFlow();
				public LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow82_LiteralBoolean83 = new LiteralBoolean();
				public LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow82_LiteralInteger84 = new LiteralInteger();
			public ReadStructuralFeatureAction SingleDelegation_P_P_Operation_main_Read_a_q = new ReadStructuralFeatureAction();
				public OutputPin SingleDelegation_P_P_Operation_main_Read_a_q_result = new OutputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Read_a_q_result_LiteralInteger85 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Read_a_q_result_LiteralUnlimitedNatural86 = new LiteralUnlimitedNatural();
				public InputPin SingleDelegation_P_P_Operation_main_Read_a_q_object = new InputPin();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Read_a_q_object_LiteralInteger87 = new LiteralInteger();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Read_a_q_object_LiteralUnlimitedNatural88 = new LiteralUnlimitedNatural();
			public CallBehaviorAction SingleDelegation_P_P_Operation_main_Call_testP = new CallBehaviorAction();
				public InputPin SingleDelegation_P_P_Operation_main_Call_testP_p = new InputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural89 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralInteger90 = new LiteralInteger();
					public LiteralInteger SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralInteger91 = new LiteralInteger();
			public ObjectFlow SingleDelegation_P_P_Operation_main_ObjectFlow92 = new ObjectFlow();
				public LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow92_LiteralInteger93 = new LiteralInteger();
				public LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow92_LiteralBoolean94 = new LiteralBoolean();
			public ValueSpecificationAction SingleDelegation_P_P_Operation_main_InitialMessage = new ValueSpecificationAction();
				public LiteralString SingleDelegation_P_P_Operation_main_InitialMessage_LiteralString95 = new LiteralString();
				public OutputPin SingleDelegation_P_P_Operation_main_InitialMessage_result = new OutputPin();
					public LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_InitialMessage_result_LiteralUnlimitedNatural96 = new LiteralUnlimitedNatural();
					public LiteralInteger SingleDelegation_P_P_Operation_main_InitialMessage_result_LiteralInteger97 = new LiteralInteger();
			public ObjectFlow SingleDelegation_P_P_Operation_main_ObjectFlow98 = new ObjectFlow();
				public LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow98_LiteralBoolean99 = new LiteralBoolean();
				public LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow98_LiteralInteger100 = new LiteralInteger();
			public ForkNode SingleDelegation_P_P_Operation_main_Fork_A = new ForkNode();
			public OpaqueBehavior SingleDelegation_P_P_Operation_main_testP = new OpaqueBehavior();
				public Parameter SingleDelegation_P_P_Operation_main_testP_p = new Parameter();

	public static SingleDelegation_P_P_OperationModel instance()
	{
		if (instance == null)
        {
            instance = new SingleDelegation_P_P_OperationModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public SingleDelegation_P_P_OperationModel()
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
		// Activity SingleDelegation_P_P_Operation_B::setPActivity
		addToElementRepository("setPActivity", SingleDelegation_P_P_Operation_B_setPActivity);
		SingleDelegation_P_P_Operation_B_setPActivity.setName("setPActivity");
		SingleDelegation_P_P_Operation_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_B_setPActivity.addOwnedParameter(SingleDelegation_P_P_Operation_B_setPActivity_v);
		SingleDelegation_P_P_Operation_B_setPActivity.addNode(SingleDelegation_P_P_Operation_B_setPActivity_this);
		SingleDelegation_P_P_Operation_B_setPActivity.addNode(SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p);
		SingleDelegation_P_P_Operation_B_setPActivity.addNode(SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode);
		SingleDelegation_P_P_Operation_B_setPActivity.addEdge(SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5);
		SingleDelegation_P_P_Operation_B_setPActivity.addEdge(SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16);
		// Activity SingleDelegation_P_P_Operation::main
		addToElementRepository("main", SingleDelegation_P_P_Operation_main);
		SingleDelegation_P_P_Operation_main.setName("main");
		SingleDelegation_P_P_Operation_main.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main.addOwnedBehavior(SingleDelegation_P_P_Operation_main_testP);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_Create_A);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_EndMessage);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_Value_4);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_WriteLine_EndMessage);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_Call_a_q_setP);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_A_);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_Read_a_b_p);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_Read_a_q);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_Call_testP);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_Read_a_b);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_InitialMessage);
		SingleDelegation_P_P_Operation_main.addNode(SingleDelegation_P_P_Operation_main_Fork_A);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ObjectFlow55);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ObjectFlow25);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ObjectFlow58);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ControlFlow28);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ObjectFlow75);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ObjectFlow34);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ObjectFlow82);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ControlFlow37);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ControlFlow38);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ObjectFlow92);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ObjectFlow49);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ObjectFlow98);
		SingleDelegation_P_P_Operation_main.addEdge(SingleDelegation_P_P_Operation_main_ObjectFlow52);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode SingleDelegation_P_P_Operation_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode);
		SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode.setName("vParameterNode");
		SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode.setParameter(SingleDelegation_P_P_Operation_B_setPActivity_v);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction SingleDelegation_P_P_Operation_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p.setName("Set this.p");
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p.setStructuralFeature(SingleDelegation_P_P_Operation_B_p);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p.setObject(SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p.setValue(SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p.setResult(SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association SingleDelegation_P_P_Operation::R
		addToElementRepository("R", SingleDelegation_P_P_Operation_R);
		SingleDelegation_P_P_Operation_R.setName("R");
		SingleDelegation_P_P_Operation_R.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_R.addOwnedEnd(SingleDelegation_P_P_Operation_R_x);
		SingleDelegation_P_P_Operation_R.addOwnedEnd(SingleDelegation_P_P_Operation_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction SingleDelegation_P_P_Operation_main::Call testP
		addToElementRepository("Call testP", SingleDelegation_P_P_Operation_main_Call_testP);
		SingleDelegation_P_P_Operation_main_Call_testP.setName("Call testP");
		SingleDelegation_P_P_Operation_main_Call_testP.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Call_testP.setBehavior(SingleDelegation_P_P_Operation_main_testP);
		SingleDelegation_P_P_Operation_main_Call_testP.addArgument(SingleDelegation_P_P_Operation_main_Call_testP_p);
		// CallBehaviorAction SingleDelegation_P_P_Operation_main::WriteLine(EndMessage)
		addToElementRepository("WriteLine(EndMessage)", SingleDelegation_P_P_Operation_main_WriteLine_EndMessage);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage.setName("WriteLine(EndMessage)");
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage.addResult(SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage.addArgument(SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value);
		// CallBehaviorAction SingleDelegation_P_P_Operation_main::WriteLine(InitialMessage)
		addToElementRepository("WriteLine(InitialMessage)", SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage.setName("WriteLine(InitialMessage)");
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage.addResult(SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage.addArgument(SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction SingleDelegation_P_P_Operation_main::Call a.q.setP
		addToElementRepository("Call a.q.setP", SingleDelegation_P_P_Operation_main_Call_a_q_setP);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP.setName("Call a.q.setP");
		SingleDelegation_P_P_Operation_main_Call_a_q_setP.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP.setOperation(SingleDelegation_P_P_Operation_I_setP_Integer);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP.setTarget(SingleDelegation_P_P_Operation_main_Call_a_q_setP_target);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP.addArgument(SingleDelegation_P_P_Operation_main_Call_a_q_setP_v);
		// CallOperationAction SingleDelegation_P_P_Operation_main::A()
		addToElementRepository("A()", SingleDelegation_P_P_Operation_main_A_);
		SingleDelegation_P_P_Operation_main_A_.setName("A()");
		SingleDelegation_P_P_Operation_main_A_.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_A_.addResult(SingleDelegation_P_P_Operation_main_A__result);
		SingleDelegation_P_P_Operation_main_A_.setOperation(SingleDelegation_P_P_Operation_A_A_A);
		SingleDelegation_P_P_Operation_main_A_.setTarget(SingleDelegation_P_P_Operation_main_A__target);
	}

	private void initializeClass_Instances()
	{
		// Class SingleDelegation_P_P_Operation::IImpl
		addToElementRepository("IImpl", SingleDelegation_P_P_Operation_IImpl);
		SingleDelegation_P_P_Operation_IImpl.setName("IImpl");
		SingleDelegation_P_P_Operation_IImpl.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_IImpl.addInterfaceRealization(SingleDelegation_P_P_Operation_IImpl_IRealization);
		
		SingleDelegation_P_P_Operation_IImpl.addOwnedOperation(SingleDelegation_P_P_Operation_IImpl_setP_Integer);
		// Class SingleDelegation_P_P_Operation::A
		addToElementRepository("A", SingleDelegation_P_P_Operation_A);
		SingleDelegation_P_P_Operation_A.setName("A");
		SingleDelegation_P_P_Operation_A.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_A.addOwnedAttribute(SingleDelegation_P_P_Operation_A_q);
		SingleDelegation_P_P_Operation_A.addOwnedAttribute(SingleDelegation_P_P_Operation_A_b);
		
		SingleDelegation_P_P_Operation_A.addOwnedConnector(SingleDelegation_P_P_Operation_A_r);
		SingleDelegation_P_P_Operation_A.addOwnedOperation(SingleDelegation_P_P_Operation_A_A_A);
		// Class SingleDelegation_P_P_Operation::B
		addToElementRepository("B", SingleDelegation_P_P_Operation_B);
		SingleDelegation_P_P_Operation_B.setName("B");
		SingleDelegation_P_P_Operation_B.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_B.addOwnedAttribute(SingleDelegation_P_P_Operation_B_p);
		SingleDelegation_P_P_Operation_B.addOwnedBehavior(SingleDelegation_P_P_Operation_B_setPActivity);
		SingleDelegation_P_P_Operation_B.addInterfaceRealization(SingleDelegation_P_P_Operation_B_IRealization);
		
		SingleDelegation_P_P_Operation_B.addOwnedOperation(SingleDelegation_P_P_Operation_B_B_B);
		SingleDelegation_P_P_Operation_B.addOwnedOperation(SingleDelegation_P_P_Operation_B_setP_Integer);
	}

	private void initializeComment_Instances()
	{
		// Comment SingleDelegation_P_P_Operation::Comment0
		addToElementRepository("Comment0", SingleDelegation_P_P_Operation_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment SingleDelegation_P_P_Operation::Comment2
		addToElementRepository("Comment2", SingleDelegation_P_P_Operation_Comment2);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector SingleDelegation_P_P_Operation_A::r
		addToElementRepository("r", SingleDelegation_P_P_Operation_A_r);
		SingleDelegation_P_P_Operation_A_r.setName("r");
		SingleDelegation_P_P_Operation_A_r.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_A_r.addEnd(SingleDelegation_P_P_Operation_A_r_ConnectorEnd3);
		SingleDelegation_P_P_Operation_A_r.addEnd(SingleDelegation_P_P_Operation_A_r_ConnectorEnd4);
		SingleDelegation_P_P_Operation_A_r.setType(SingleDelegation_P_P_Operation_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd SingleDelegation_P_P_Operation_A_r::ConnectorEnd3
		addToElementRepository("ConnectorEnd3", SingleDelegation_P_P_Operation_A_r_ConnectorEnd3);
		SingleDelegation_P_P_Operation_A_r_ConnectorEnd3.setRole(SingleDelegation_P_P_Operation_A_q);
		// ConnectorEnd SingleDelegation_P_P_Operation_A_r::ConnectorEnd4
		addToElementRepository("ConnectorEnd4", SingleDelegation_P_P_Operation_A_r_ConnectorEnd4);
		SingleDelegation_P_P_Operation_A_r_ConnectorEnd4.setRole(SingleDelegation_P_P_Operation_A_b);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow SingleDelegation_P_P_Operation_main::ControlFlow37
		addToElementRepository("ControlFlow37", SingleDelegation_P_P_Operation_main_ControlFlow37);
		SingleDelegation_P_P_Operation_main_ControlFlow37.setName("ControlFlow37");
		SingleDelegation_P_P_Operation_main_ControlFlow37.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ControlFlow37.setSource(SingleDelegation_P_P_Operation_main_Call_a_q_setP);
		SingleDelegation_P_P_Operation_main_ControlFlow37.setTarget(SingleDelegation_P_P_Operation_main_Read_a_b);
		// ControlFlow SingleDelegation_P_P_Operation_main::ControlFlow38
		addToElementRepository("ControlFlow38", SingleDelegation_P_P_Operation_main_ControlFlow38);
		SingleDelegation_P_P_Operation_main_ControlFlow38.setName("ControlFlow38");
		SingleDelegation_P_P_Operation_main_ControlFlow38.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ControlFlow38.setSource(SingleDelegation_P_P_Operation_main_Call_testP);
		SingleDelegation_P_P_Operation_main_ControlFlow38.setTarget(SingleDelegation_P_P_Operation_main_WriteLine_EndMessage);
		// ControlFlow SingleDelegation_P_P_Operation_main::ControlFlow28
		addToElementRepository("ControlFlow28", SingleDelegation_P_P_Operation_main_ControlFlow28);
		SingleDelegation_P_P_Operation_main_ControlFlow28.setName("ControlFlow28");
		SingleDelegation_P_P_Operation_main_ControlFlow28.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ControlFlow28.setSource(SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage);
		SingleDelegation_P_P_Operation_main_ControlFlow28.setTarget(SingleDelegation_P_P_Operation_main_Create_A);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction SingleDelegation_P_P_Operation_main::Create A
		addToElementRepository("Create A", SingleDelegation_P_P_Operation_main_Create_A);
		SingleDelegation_P_P_Operation_main_Create_A.setName("Create A");
		SingleDelegation_P_P_Operation_main_Create_A.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Create_A.setClassifier(SingleDelegation_P_P_Operation_A);
		SingleDelegation_P_P_Operation_main_Create_A.setResult(SingleDelegation_P_P_Operation_main_Create_A_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode SingleDelegation_P_P_Operation_main::Fork A
		addToElementRepository("Fork A", SingleDelegation_P_P_Operation_main_Fork_A);
		SingleDelegation_P_P_Operation_main_Fork_A.setName("Fork A");
		SingleDelegation_P_P_Operation_main_Fork_A.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior SingleDelegation_P_P_Operation_main::testP
		addToElementRepository("testP", SingleDelegation_P_P_Operation_main_testP);
		SingleDelegation_P_P_Operation_main_testP.setName("testP");
		SingleDelegation_P_P_Operation_main_testP.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_testP.addOwnedParameter(SingleDelegation_P_P_Operation_main_testP_p);
		SingleDelegation_P_P_Operation_main_testP.addLanguage("Java");
		SingleDelegation_P_P_Operation_main_testP.addLanguage("Import");
		SingleDelegation_P_P_Operation_main_testP.addBody("System.out.println(\"Asserting a.b.p == 4\");  	// Test parameter p 	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument p = \" + p); 	 	System.out.println(\"a.b.p == \" + p); 	System.out.print(\"Operation call delegated: \");  	if(p == 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		SingleDelegation_P_P_Operation_main_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin SingleDelegation_P_P_Operation_B_setPActivity_Set this.p::value
		addToElementRepository("value", SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value.setName("value");
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin SingleDelegation_P_P_Operation_main_A()::target
		addToElementRepository("target", SingleDelegation_P_P_Operation_main_A__target);
		SingleDelegation_P_P_Operation_main_A__target.setName("target");
		SingleDelegation_P_P_Operation_main_A__target.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_A__target.setType(SingleDelegation_P_P_Operation_A);
		// InputPin SingleDelegation_P_P_Operation_main_WriteLine(EndMessage)::value
		addToElementRepository("value", SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value.setName("value");
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin SingleDelegation_P_P_Operation_main_WriteLine(InitialMessage)::value
		addToElementRepository("value", SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value.setName("value");
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin SingleDelegation_P_P_Operation_main_Call a.q.setP::v
		addToElementRepository("v", SingleDelegation_P_P_Operation_main_Call_a_q_setP_v);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_v.setName("v");
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_v.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin SingleDelegation_P_P_Operation_main_Call testP::p
		addToElementRepository("p", SingleDelegation_P_P_Operation_main_Call_testP_p);
		SingleDelegation_P_P_Operation_main_Call_testP_p.setName("p");
		SingleDelegation_P_P_Operation_main_Call_testP_p.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin SingleDelegation_P_P_Operation_main_Read a.b.p::object
		addToElementRepository("object", SingleDelegation_P_P_Operation_main_Read_a_b_p_object);
		SingleDelegation_P_P_Operation_main_Read_a_b_p_object.setName("object");
		SingleDelegation_P_P_Operation_main_Read_a_b_p_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_p_object.setType(SingleDelegation_P_P_Operation_B);
		// InputPin SingleDelegation_P_P_Operation_main_Read a.q::object
		addToElementRepository("object", SingleDelegation_P_P_Operation_main_Read_a_q_object);
		SingleDelegation_P_P_Operation_main_Read_a_q_object.setName("object");
		SingleDelegation_P_P_Operation_main_Read_a_q_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_q_object.setType(SingleDelegation_P_P_Operation_A);
		// InputPin SingleDelegation_P_P_Operation_B_setPActivity_Set this.p::object
		addToElementRepository("object", SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object.setName("object");
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object.setType(SingleDelegation_P_P_Operation_B);
		// InputPin SingleDelegation_P_P_Operation_main_Read a.b::object
		addToElementRepository("object", SingleDelegation_P_P_Operation_main_Read_a_b_object);
		SingleDelegation_P_P_Operation_main_Read_a_b_object.setName("object");
		SingleDelegation_P_P_Operation_main_Read_a_b_object.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_object.setType(SingleDelegation_P_P_Operation_A);
		// InputPin SingleDelegation_P_P_Operation_main_Call a.q.setP::target
		addToElementRepository("target", SingleDelegation_P_P_Operation_main_Call_a_q_setP_target);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_target.setName("target");
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_target.setVisibility(VisibilityKind.public_);
	}

	private void initializeInterface_Instances()
	{
		// Interface SingleDelegation_P_P_Operation::I
		addToElementRepository("I", SingleDelegation_P_P_Operation_I);
		SingleDelegation_P_P_Operation_I.setName("I");
		SingleDelegation_P_P_Operation_I.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_I.addOwnedOperation(SingleDelegation_P_P_Operation_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization SingleDelegation_P_P_Operation_IImpl::IRealization
		addToElementRepository("IRealization", SingleDelegation_P_P_Operation_IImpl_IRealization);
		SingleDelegation_P_P_Operation_IImpl_IRealization.setName("IRealization");
		SingleDelegation_P_P_Operation_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_IImpl_IRealization.setContract(SingleDelegation_P_P_Operation_I);
		// InterfaceRealization SingleDelegation_P_P_Operation_B::IRealization
		addToElementRepository("IRealization", SingleDelegation_P_P_Operation_B_IRealization);
		SingleDelegation_P_P_Operation_B_IRealization.setName("IRealization");
		SingleDelegation_P_P_Operation_B_IRealization.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_IRealization.setContract(SingleDelegation_P_P_Operation_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow55::LiteralBoolean56
		addToElementRepository("LiteralBoolean56", SingleDelegation_P_P_Operation_main_ObjectFlow55_LiteralBoolean56);
		SingleDelegation_P_P_Operation_main_ObjectFlow55_LiteralBoolean56.setName("LiteralBoolean56");
		SingleDelegation_P_P_Operation_main_ObjectFlow55_LiteralBoolean56.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow55_LiteralBoolean56.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow75::LiteralBoolean76
		addToElementRepository("LiteralBoolean76", SingleDelegation_P_P_Operation_main_ObjectFlow75_LiteralBoolean76);
		SingleDelegation_P_P_Operation_main_ObjectFlow75_LiteralBoolean76.setName("LiteralBoolean76");
		SingleDelegation_P_P_Operation_main_ObjectFlow75_LiteralBoolean76.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow75_LiteralBoolean76.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow58::LiteralBoolean59
		addToElementRepository("LiteralBoolean59", SingleDelegation_P_P_Operation_main_ObjectFlow58_LiteralBoolean59);
		SingleDelegation_P_P_Operation_main_ObjectFlow58_LiteralBoolean59.setName("LiteralBoolean59");
		SingleDelegation_P_P_Operation_main_ObjectFlow58_LiteralBoolean59.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow58_LiteralBoolean59.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow98::LiteralBoolean99
		addToElementRepository("LiteralBoolean99", SingleDelegation_P_P_Operation_main_ObjectFlow98_LiteralBoolean99);
		SingleDelegation_P_P_Operation_main_ObjectFlow98_LiteralBoolean99.setName("LiteralBoolean99");
		SingleDelegation_P_P_Operation_main_ObjectFlow98_LiteralBoolean99.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow98_LiteralBoolean99.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow92::LiteralBoolean94
		addToElementRepository("LiteralBoolean94", SingleDelegation_P_P_Operation_main_ObjectFlow92_LiteralBoolean94);
		SingleDelegation_P_P_Operation_main_ObjectFlow92_LiteralBoolean94.setName("LiteralBoolean94");
		SingleDelegation_P_P_Operation_main_ObjectFlow92_LiteralBoolean94.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow92_LiteralBoolean94.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow52::LiteralBoolean53
		addToElementRepository("LiteralBoolean53", SingleDelegation_P_P_Operation_main_ObjectFlow52_LiteralBoolean53);
		SingleDelegation_P_P_Operation_main_ObjectFlow52_LiteralBoolean53.setName("LiteralBoolean53");
		SingleDelegation_P_P_Operation_main_ObjectFlow52_LiteralBoolean53.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow52_LiteralBoolean53.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16::LiteralBoolean18
		addToElementRepository("LiteralBoolean18", SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16_LiteralBoolean18);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16_LiteralBoolean18.setName("LiteralBoolean18");
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16_LiteralBoolean18.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16_LiteralBoolean18.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow82::LiteralBoolean83
		addToElementRepository("LiteralBoolean83", SingleDelegation_P_P_Operation_main_ObjectFlow82_LiteralBoolean83);
		SingleDelegation_P_P_Operation_main_ObjectFlow82_LiteralBoolean83.setName("LiteralBoolean83");
		SingleDelegation_P_P_Operation_main_ObjectFlow82_LiteralBoolean83.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow82_LiteralBoolean83.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow49::LiteralBoolean51
		addToElementRepository("LiteralBoolean51", SingleDelegation_P_P_Operation_main_ObjectFlow49_LiteralBoolean51);
		SingleDelegation_P_P_Operation_main_ObjectFlow49_LiteralBoolean51.setName("LiteralBoolean51");
		SingleDelegation_P_P_Operation_main_ObjectFlow49_LiteralBoolean51.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow49_LiteralBoolean51.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow25::LiteralBoolean27
		addToElementRepository("LiteralBoolean27", SingleDelegation_P_P_Operation_main_ObjectFlow25_LiteralBoolean27);
		SingleDelegation_P_P_Operation_main_ObjectFlow25_LiteralBoolean27.setName("LiteralBoolean27");
		SingleDelegation_P_P_Operation_main_ObjectFlow25_LiteralBoolean27.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow25_LiteralBoolean27.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5::LiteralBoolean6
		addToElementRepository("LiteralBoolean6", SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5_LiteralBoolean6);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5_LiteralBoolean6.setName("LiteralBoolean6");
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5_LiteralBoolean6.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5_LiteralBoolean6.setValue(true);
		// LiteralBoolean SingleDelegation_P_P_Operation_main_ObjectFlow34::LiteralBoolean36
		addToElementRepository("LiteralBoolean36", SingleDelegation_P_P_Operation_main_ObjectFlow34_LiteralBoolean36);
		SingleDelegation_P_P_Operation_main_ObjectFlow34_LiteralBoolean36.setName("LiteralBoolean36");
		SingleDelegation_P_P_Operation_main_ObjectFlow34_LiteralBoolean36.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow34_LiteralBoolean36.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger SingleDelegation_P_P_Operation_main_Call a.q.setP_v::LiteralInteger70
		addToElementRepository("LiteralInteger70", SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralInteger70);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralInteger70.setName("LiteralInteger70");
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralInteger70.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralInteger70.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Read a.b_object::LiteralInteger41
		addToElementRepository("LiteralInteger41", SingleDelegation_P_P_Operation_main_Read_a_b_object_LiteralInteger41);
		SingleDelegation_P_P_Operation_main_Read_a_b_object_LiteralInteger41.setName("LiteralInteger41");
		SingleDelegation_P_P_Operation_main_Read_a_b_object_LiteralInteger41.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_object_LiteralInteger41.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_A()_result::LiteralInteger32
		addToElementRepository("LiteralInteger32", SingleDelegation_P_P_Operation_main_A__result_LiteralInteger32);
		SingleDelegation_P_P_Operation_main_A__result_LiteralInteger32.setName("LiteralInteger32");
		SingleDelegation_P_P_Operation_main_A__result_LiteralInteger32.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_A__result_LiteralInteger32.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow98::LiteralInteger100
		addToElementRepository("LiteralInteger100", SingleDelegation_P_P_Operation_main_ObjectFlow98_LiteralInteger100);
		SingleDelegation_P_P_Operation_main_ObjectFlow98_LiteralInteger100.setName("LiteralInteger100");
		SingleDelegation_P_P_Operation_main_ObjectFlow98_LiteralInteger100.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow98_LiteralInteger100.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine(EndMessage)_value::LiteralInteger66
		addToElementRepository("LiteralInteger66", SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralInteger66);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralInteger66.setName("LiteralInteger66");
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralInteger66.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralInteger66.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Value(4)::LiteralInteger63
		addToElementRepository("LiteralInteger63", SingleDelegation_P_P_Operation_main_Value_4_LiteralInteger63);
		SingleDelegation_P_P_Operation_main_Value_4_LiteralInteger63.setName("LiteralInteger63");
		SingleDelegation_P_P_Operation_main_Value_4_LiteralInteger63.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Value_4_LiteralInteger63.setValue(4);
		// LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine(InitialMessage)_errorStatus::LiteralInteger48
		addToElementRepository("LiteralInteger48", SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger48);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger48.setName("LiteralInteger48");
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger48.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger48.setValue(0);
		// LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_Set this.p_result::LiteralInteger12
		addToElementRepository("LiteralInteger12", SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger12);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger12.setName("LiteralInteger12");
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger12.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger12.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Read a.q_result::LiteralInteger85
		addToElementRepository("LiteralInteger85", SingleDelegation_P_P_Operation_main_Read_a_q_result_LiteralInteger85);
		SingleDelegation_P_P_Operation_main_Read_a_q_result_LiteralInteger85.setName("LiteralInteger85");
		SingleDelegation_P_P_Operation_main_Read_a_q_result_LiteralInteger85.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_q_result_LiteralInteger85.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Read a.b.p_result::LiteralInteger81
		addToElementRepository("LiteralInteger81", SingleDelegation_P_P_Operation_main_Read_a_b_p_result_LiteralInteger81);
		SingleDelegation_P_P_Operation_main_Read_a_b_p_result_LiteralInteger81.setName("LiteralInteger81");
		SingleDelegation_P_P_Operation_main_Read_a_b_p_result_LiteralInteger81.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_p_result_LiteralInteger81.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_this_result::LiteralInteger8
		addToElementRepository("LiteralInteger8", SingleDelegation_P_P_Operation_B_setPActivity_this_result_LiteralInteger8);
		SingleDelegation_P_P_Operation_B_setPActivity_this_result_LiteralInteger8.setName("LiteralInteger8");
		SingleDelegation_P_P_Operation_B_setPActivity_this_result_LiteralInteger8.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_this_result_LiteralInteger8.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_Set this.p_value::LiteralInteger10
		addToElementRepository("LiteralInteger10", SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger10);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger10.setName("LiteralInteger10");
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger10.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger10.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow92::LiteralInteger93
		addToElementRepository("LiteralInteger93", SingleDelegation_P_P_Operation_main_ObjectFlow92_LiteralInteger93);
		SingleDelegation_P_P_Operation_main_ObjectFlow92_LiteralInteger93.setName("LiteralInteger93");
		SingleDelegation_P_P_Operation_main_ObjectFlow92_LiteralInteger93.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow92_LiteralInteger93.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_EndMessage_result::LiteralInteger23
		addToElementRepository("LiteralInteger23", SingleDelegation_P_P_Operation_main_EndMessage_result_LiteralInteger23);
		SingleDelegation_P_P_Operation_main_EndMessage_result_LiteralInteger23.setName("LiteralInteger23");
		SingleDelegation_P_P_Operation_main_EndMessage_result_LiteralInteger23.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_EndMessage_result_LiteralInteger23.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Value(4)_result::LiteralInteger61
		addToElementRepository("LiteralInteger61", SingleDelegation_P_P_Operation_main_Value_4_result_LiteralInteger61);
		SingleDelegation_P_P_Operation_main_Value_4_result_LiteralInteger61.setName("LiteralInteger61");
		SingleDelegation_P_P_Operation_main_Value_4_result_LiteralInteger61.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Value_4_result_LiteralInteger61.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow49::LiteralInteger50
		addToElementRepository("LiteralInteger50", SingleDelegation_P_P_Operation_main_ObjectFlow49_LiteralInteger50);
		SingleDelegation_P_P_Operation_main_ObjectFlow49_LiteralInteger50.setName("LiteralInteger50");
		SingleDelegation_P_P_Operation_main_ObjectFlow49_LiteralInteger50.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow49_LiteralInteger50.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode::LiteralInteger19
		addToElementRepository("LiteralInteger19", SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger19);
		SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger19.setName("LiteralInteger19");
		SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger19.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger19.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow25::LiteralInteger26
		addToElementRepository("LiteralInteger26", SingleDelegation_P_P_Operation_main_ObjectFlow25_LiteralInteger26);
		SingleDelegation_P_P_Operation_main_ObjectFlow25_LiteralInteger26.setName("LiteralInteger26");
		SingleDelegation_P_P_Operation_main_ObjectFlow25_LiteralInteger26.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow25_LiteralInteger26.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine(InitialMessage)_errorStatus::LiteralInteger47
		addToElementRepository("LiteralInteger47", SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger47);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger47.setName("LiteralInteger47");
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger47.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralInteger47.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine(InitialMessage)_value::LiteralInteger43
		addToElementRepository("LiteralInteger43", SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralInteger43);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralInteger43.setName("LiteralInteger43");
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralInteger43.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralInteger43.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow34::LiteralInteger35
		addToElementRepository("LiteralInteger35", SingleDelegation_P_P_Operation_main_ObjectFlow34_LiteralInteger35);
		SingleDelegation_P_P_Operation_main_ObjectFlow34_LiteralInteger35.setName("LiteralInteger35");
		SingleDelegation_P_P_Operation_main_ObjectFlow34_LiteralInteger35.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow34_LiteralInteger35.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Call testP_p::LiteralInteger90
		addToElementRepository("LiteralInteger90", SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralInteger90);
		SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralInteger90.setName("LiteralInteger90");
		SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralInteger90.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralInteger90.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Read a.q_object::LiteralInteger87
		addToElementRepository("LiteralInteger87", SingleDelegation_P_P_Operation_main_Read_a_q_object_LiteralInteger87);
		SingleDelegation_P_P_Operation_main_Read_a_q_object_LiteralInteger87.setName("LiteralInteger87");
		SingleDelegation_P_P_Operation_main_Read_a_q_object_LiteralInteger87.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_q_object_LiteralInteger87.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_A()_result::LiteralInteger31
		addToElementRepository("LiteralInteger31", SingleDelegation_P_P_Operation_main_A__result_LiteralInteger31);
		SingleDelegation_P_P_Operation_main_A__result_LiteralInteger31.setName("LiteralInteger31");
		SingleDelegation_P_P_Operation_main_A__result_LiteralInteger31.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_A__result_LiteralInteger31.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Call testP_p::LiteralInteger91
		addToElementRepository("LiteralInteger91", SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralInteger91);
		SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralInteger91.setName("LiteralInteger91");
		SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralInteger91.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralInteger91.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow82::LiteralInteger84
		addToElementRepository("LiteralInteger84", SingleDelegation_P_P_Operation_main_ObjectFlow82_LiteralInteger84);
		SingleDelegation_P_P_Operation_main_ObjectFlow82_LiteralInteger84.setName("LiteralInteger84");
		SingleDelegation_P_P_Operation_main_ObjectFlow82_LiteralInteger84.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow82_LiteralInteger84.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Call a.q.setP_target::LiteralInteger73
		addToElementRepository("LiteralInteger73", SingleDelegation_P_P_Operation_main_Call_a_q_setP_target_LiteralInteger73);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_target_LiteralInteger73.setName("LiteralInteger73");
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_target_LiteralInteger73.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_target_LiteralInteger73.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Create A_result::LiteralInteger20
		addToElementRepository("LiteralInteger20", SingleDelegation_P_P_Operation_main_Create_A_result_LiteralInteger20);
		SingleDelegation_P_P_Operation_main_Create_A_result_LiteralInteger20.setName("LiteralInteger20");
		SingleDelegation_P_P_Operation_main_Create_A_result_LiteralInteger20.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Create_A_result_LiteralInteger20.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow75::LiteralInteger77
		addToElementRepository("LiteralInteger77", SingleDelegation_P_P_Operation_main_ObjectFlow75_LiteralInteger77);
		SingleDelegation_P_P_Operation_main_ObjectFlow75_LiteralInteger77.setName("LiteralInteger77");
		SingleDelegation_P_P_Operation_main_ObjectFlow75_LiteralInteger77.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow75_LiteralInteger77.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine(InitialMessage)_value::LiteralInteger44
		addToElementRepository("LiteralInteger44", SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralInteger44);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralInteger44.setName("LiteralInteger44");
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralInteger44.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralInteger44.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5::LiteralInteger7
		addToElementRepository("LiteralInteger7", SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5_LiteralInteger7);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5_LiteralInteger7.setName("LiteralInteger7");
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5_LiteralInteger7.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5_LiteralInteger7.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine(EndMessage)_errorStatus::LiteralInteger69
		addToElementRepository("LiteralInteger69", SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger69);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger69.setName("LiteralInteger69");
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger69.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger69.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow55::LiteralInteger57
		addToElementRepository("LiteralInteger57", SingleDelegation_P_P_Operation_main_ObjectFlow55_LiteralInteger57);
		SingleDelegation_P_P_Operation_main_ObjectFlow55_LiteralInteger57.setName("LiteralInteger57");
		SingleDelegation_P_P_Operation_main_ObjectFlow55_LiteralInteger57.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow55_LiteralInteger57.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Read a.b.p_object::LiteralInteger78
		addToElementRepository("LiteralInteger78", SingleDelegation_P_P_Operation_main_Read_a_b_p_object_LiteralInteger78);
		SingleDelegation_P_P_Operation_main_Read_a_b_p_object_LiteralInteger78.setName("LiteralInteger78");
		SingleDelegation_P_P_Operation_main_Read_a_b_p_object_LiteralInteger78.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_p_object_LiteralInteger78.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16::LiteralInteger17
		addToElementRepository("LiteralInteger17", SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16_LiteralInteger17);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16_LiteralInteger17.setName("LiteralInteger17");
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16_LiteralInteger17.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16_LiteralInteger17.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine(EndMessage)_errorStatus::LiteralInteger67
		addToElementRepository("LiteralInteger67", SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger67);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger67.setName("LiteralInteger67");
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger67.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralInteger67.setValue(0);
		// LiteralInteger SingleDelegation_P_P_Operation_main_A()_target::LiteralInteger29
		addToElementRepository("LiteralInteger29", SingleDelegation_P_P_Operation_main_A__target_LiteralInteger29);
		SingleDelegation_P_P_Operation_main_A__target_LiteralInteger29.setName("LiteralInteger29");
		SingleDelegation_P_P_Operation_main_A__target_LiteralInteger29.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_A__target_LiteralInteger29.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Read a.b_result::LiteralInteger39
		addToElementRepository("LiteralInteger39", SingleDelegation_P_P_Operation_main_Read_a_b_result_LiteralInteger39);
		SingleDelegation_P_P_Operation_main_Read_a_b_result_LiteralInteger39.setName("LiteralInteger39");
		SingleDelegation_P_P_Operation_main_Read_a_b_result_LiteralInteger39.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_result_LiteralInteger39.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_WriteLine(EndMessage)_value::LiteralInteger65
		addToElementRepository("LiteralInteger65", SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralInteger65);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralInteger65.setName("LiteralInteger65");
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralInteger65.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralInteger65.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow52::LiteralInteger54
		addToElementRepository("LiteralInteger54", SingleDelegation_P_P_Operation_main_ObjectFlow52_LiteralInteger54);
		SingleDelegation_P_P_Operation_main_ObjectFlow52_LiteralInteger54.setName("LiteralInteger54");
		SingleDelegation_P_P_Operation_main_ObjectFlow52_LiteralInteger54.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow52_LiteralInteger54.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_Call a.q.setP_v::LiteralInteger71
		addToElementRepository("LiteralInteger71", SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralInteger71);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralInteger71.setName("LiteralInteger71");
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralInteger71.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralInteger71.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_ObjectFlow58::LiteralInteger60
		addToElementRepository("LiteralInteger60", SingleDelegation_P_P_Operation_main_ObjectFlow58_LiteralInteger60);
		SingleDelegation_P_P_Operation_main_ObjectFlow58_LiteralInteger60.setName("LiteralInteger60");
		SingleDelegation_P_P_Operation_main_ObjectFlow58_LiteralInteger60.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_ObjectFlow58_LiteralInteger60.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_main_InitialMessage_result::LiteralInteger97
		addToElementRepository("LiteralInteger97", SingleDelegation_P_P_Operation_main_InitialMessage_result_LiteralInteger97);
		SingleDelegation_P_P_Operation_main_InitialMessage_result_LiteralInteger97.setName("LiteralInteger97");
		SingleDelegation_P_P_Operation_main_InitialMessage_result_LiteralInteger97.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_InitialMessage_result_LiteralInteger97.setValue(1);
		// LiteralInteger SingleDelegation_P_P_Operation_B_setPActivity_Set this.p_object::LiteralInteger15
		addToElementRepository("LiteralInteger15", SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger15);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger15.setName("LiteralInteger15");
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger15.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger15.setValue(1);
	}

	private void initializeLiteralString_Instances()
	{
		// LiteralString SingleDelegation_P_P_Operation_main_InitialMessage::LiteralString95
		addToElementRepository("LiteralString95", SingleDelegation_P_P_Operation_main_InitialMessage_LiteralString95);
		SingleDelegation_P_P_Operation_main_InitialMessage_LiteralString95.setName("LiteralString95");
		SingleDelegation_P_P_Operation_main_InitialMessage_LiteralString95.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_InitialMessage_LiteralString95.setValue("-- Running test case: Single delegation connector - Operation delegated from port to part --");
		// LiteralString SingleDelegation_P_P_Operation_main_EndMessage::LiteralString22
		addToElementRepository("LiteralString22", SingleDelegation_P_P_Operation_main_EndMessage_LiteralString22);
		SingleDelegation_P_P_Operation_main_EndMessage_LiteralString22.setName("LiteralString22");
		SingleDelegation_P_P_Operation_main_EndMessage_LiteralString22.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_EndMessage_LiteralString22.setValue("-- End of test case --");
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Read a.b.p_result::LiteralUnlimitedNatural80
		addToElementRepository("LiteralUnlimitedNatural80", SingleDelegation_P_P_Operation_main_Read_a_b_p_result_LiteralUnlimitedNatural80);
		SingleDelegation_P_P_Operation_main_Read_a_b_p_result_LiteralUnlimitedNatural80.setName("LiteralUnlimitedNatural80");
		SingleDelegation_P_P_Operation_main_Read_a_b_p_result_LiteralUnlimitedNatural80.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_p_result_LiteralUnlimitedNatural80.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_WriteLine(InitialMessage)_errorStatus::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural46);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus_LiteralUnlimitedNatural46.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_WriteLine(EndMessage)_value::LiteralUnlimitedNatural64
		addToElementRepository("LiteralUnlimitedNatural64", SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralUnlimitedNatural64);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralUnlimitedNatural64.setName("LiteralUnlimitedNatural64");
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralUnlimitedNatural64.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value_LiteralUnlimitedNatural64.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_InitialMessage_result::LiteralUnlimitedNatural96
		addToElementRepository("LiteralUnlimitedNatural96", SingleDelegation_P_P_Operation_main_InitialMessage_result_LiteralUnlimitedNatural96);
		SingleDelegation_P_P_Operation_main_InitialMessage_result_LiteralUnlimitedNatural96.setName("LiteralUnlimitedNatural96");
		SingleDelegation_P_P_Operation_main_InitialMessage_result_LiteralUnlimitedNatural96.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_InitialMessage_result_LiteralUnlimitedNatural96.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_WriteLine(EndMessage)_errorStatus::LiteralUnlimitedNatural68
		addToElementRepository("LiteralUnlimitedNatural68", SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural68);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural68.setName("LiteralUnlimitedNatural68");
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural68.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus_LiteralUnlimitedNatural68.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Read a.q_object::LiteralUnlimitedNatural88
		addToElementRepository("LiteralUnlimitedNatural88", SingleDelegation_P_P_Operation_main_Read_a_q_object_LiteralUnlimitedNatural88);
		SingleDelegation_P_P_Operation_main_Read_a_q_object_LiteralUnlimitedNatural88.setName("LiteralUnlimitedNatural88");
		SingleDelegation_P_P_Operation_main_Read_a_q_object_LiteralUnlimitedNatural88.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_q_object_LiteralUnlimitedNatural88.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Read a.b_result::LiteralUnlimitedNatural40
		addToElementRepository("LiteralUnlimitedNatural40", SingleDelegation_P_P_Operation_main_Read_a_b_result_LiteralUnlimitedNatural40);
		SingleDelegation_P_P_Operation_main_Read_a_b_result_LiteralUnlimitedNatural40.setName("LiteralUnlimitedNatural40");
		SingleDelegation_P_P_Operation_main_Read_a_b_result_LiteralUnlimitedNatural40.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_result_LiteralUnlimitedNatural40.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_WriteLine(InitialMessage)_value::LiteralUnlimitedNatural45
		addToElementRepository("LiteralUnlimitedNatural45", SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralUnlimitedNatural45);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralUnlimitedNatural45.setName("LiteralUnlimitedNatural45");
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralUnlimitedNatural45.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value_LiteralUnlimitedNatural45.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Read a.q_result::LiteralUnlimitedNatural86
		addToElementRepository("LiteralUnlimitedNatural86", SingleDelegation_P_P_Operation_main_Read_a_q_result_LiteralUnlimitedNatural86);
		SingleDelegation_P_P_Operation_main_Read_a_q_result_LiteralUnlimitedNatural86.setName("LiteralUnlimitedNatural86");
		SingleDelegation_P_P_Operation_main_Read_a_q_result_LiteralUnlimitedNatural86.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_q_result_LiteralUnlimitedNatural86.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural13
		addToElementRepository("LiteralUnlimitedNatural13", SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural13);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural13.setName("LiteralUnlimitedNatural13");
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural13.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural13.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Call testP_p::LiteralUnlimitedNatural89
		addToElementRepository("LiteralUnlimitedNatural89", SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural89);
		SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural89.setName("LiteralUnlimitedNatural89");
		SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural89.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural89.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural11
		addToElementRepository("LiteralUnlimitedNatural11", SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11.setName("LiteralUnlimitedNatural11");
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_EndMessage_result::LiteralUnlimitedNatural24
		addToElementRepository("LiteralUnlimitedNatural24", SingleDelegation_P_P_Operation_main_EndMessage_result_LiteralUnlimitedNatural24);
		SingleDelegation_P_P_Operation_main_EndMessage_result_LiteralUnlimitedNatural24.setName("LiteralUnlimitedNatural24");
		SingleDelegation_P_P_Operation_main_EndMessage_result_LiteralUnlimitedNatural24.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_EndMessage_result_LiteralUnlimitedNatural24.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Value(4)_result::LiteralUnlimitedNatural62
		addToElementRepository("LiteralUnlimitedNatural62", SingleDelegation_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural62);
		SingleDelegation_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural62.setName("LiteralUnlimitedNatural62");
		SingleDelegation_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural62.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural62.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Read a.b.p_object::LiteralUnlimitedNatural79
		addToElementRepository("LiteralUnlimitedNatural79", SingleDelegation_P_P_Operation_main_Read_a_b_p_object_LiteralUnlimitedNatural79);
		SingleDelegation_P_P_Operation_main_Read_a_b_p_object_LiteralUnlimitedNatural79.setName("LiteralUnlimitedNatural79");
		SingleDelegation_P_P_Operation_main_Read_a_b_p_object_LiteralUnlimitedNatural79.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_p_object_LiteralUnlimitedNatural79.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_B_setPActivity_this_result::LiteralUnlimitedNatural9
		addToElementRepository("LiteralUnlimitedNatural9", SingleDelegation_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural9);
		SingleDelegation_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural9.setName("LiteralUnlimitedNatural9");
		SingleDelegation_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural9.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural9.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_A()_result::LiteralUnlimitedNatural33
		addToElementRepository("LiteralUnlimitedNatural33", SingleDelegation_P_P_Operation_main_A__result_LiteralUnlimitedNatural33);
		SingleDelegation_P_P_Operation_main_A__result_LiteralUnlimitedNatural33.setName("LiteralUnlimitedNatural33");
		SingleDelegation_P_P_Operation_main_A__result_LiteralUnlimitedNatural33.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_A__result_LiteralUnlimitedNatural33.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Call a.q.setP_v::LiteralUnlimitedNatural72
		addToElementRepository("LiteralUnlimitedNatural72", SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralUnlimitedNatural72);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralUnlimitedNatural72.setName("LiteralUnlimitedNatural72");
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralUnlimitedNatural72.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_v_LiteralUnlimitedNatural72.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_A()_target::LiteralUnlimitedNatural30
		addToElementRepository("LiteralUnlimitedNatural30", SingleDelegation_P_P_Operation_main_A__target_LiteralUnlimitedNatural30);
		SingleDelegation_P_P_Operation_main_A__target_LiteralUnlimitedNatural30.setName("LiteralUnlimitedNatural30");
		SingleDelegation_P_P_Operation_main_A__target_LiteralUnlimitedNatural30.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_A__target_LiteralUnlimitedNatural30.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Call a.q.setP_target::LiteralUnlimitedNatural74
		addToElementRepository("LiteralUnlimitedNatural74", SingleDelegation_P_P_Operation_main_Call_a_q_setP_target_LiteralUnlimitedNatural74);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_target_LiteralUnlimitedNatural74.setName("LiteralUnlimitedNatural74");
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_target_LiteralUnlimitedNatural74.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Call_a_q_setP_target_LiteralUnlimitedNatural74.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural14
		addToElementRepository("LiteralUnlimitedNatural14", SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural14);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural14.setName("LiteralUnlimitedNatural14");
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural14.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural14.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Read a.b_object::LiteralUnlimitedNatural42
		addToElementRepository("LiteralUnlimitedNatural42", SingleDelegation_P_P_Operation_main_Read_a_b_object_LiteralUnlimitedNatural42);
		SingleDelegation_P_P_Operation_main_Read_a_b_object_LiteralUnlimitedNatural42.setName("LiteralUnlimitedNatural42");
		SingleDelegation_P_P_Operation_main_Read_a_b_object_LiteralUnlimitedNatural42.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_object_LiteralUnlimitedNatural42.setValue(1);
		// LiteralUnlimitedNatural SingleDelegation_P_P_Operation_main_Create A_result::LiteralUnlimitedNatural21
		addToElementRepository("LiteralUnlimitedNatural21", SingleDelegation_P_P_Operation_main_Create_A_result_LiteralUnlimitedNatural21);
		SingleDelegation_P_P_Operation_main_Create_A_result_LiteralUnlimitedNatural21.setName("LiteralUnlimitedNatural21");
		SingleDelegation_P_P_Operation_main_Create_A_result_LiteralUnlimitedNatural21.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Create_A_result_LiteralUnlimitedNatural21.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow SingleDelegation_P_P_Operation_B_setPActivity::ObjectFlow5
		addToElementRepository("ObjectFlow5", SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5.setName("ObjectFlow5");
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5.setSource(SingleDelegation_P_P_Operation_B_setPActivity_vParameterNode);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5.setTarget(SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_value);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5.setGuard(SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow5_LiteralBoolean6);
		// ObjectFlow SingleDelegation_P_P_Operation_main::ObjectFlow55
		addToElementRepository("ObjectFlow55", SingleDelegation_P_P_Operation_main_ObjectFlow55);
		SingleDelegation_P_P_Operation_main_ObjectFlow55.setName("ObjectFlow55");
		SingleDelegation_P_P_Operation_main_ObjectFlow55.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ObjectFlow55.setSource(SingleDelegation_P_P_Operation_main_InitialMessage_result);
		SingleDelegation_P_P_Operation_main_ObjectFlow55.setTarget(SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_value);
		SingleDelegation_P_P_Operation_main_ObjectFlow55.setGuard(SingleDelegation_P_P_Operation_main_ObjectFlow55_LiteralBoolean56);
		// ObjectFlow SingleDelegation_P_P_Operation_main::ObjectFlow34
		addToElementRepository("ObjectFlow34", SingleDelegation_P_P_Operation_main_ObjectFlow34);
		SingleDelegation_P_P_Operation_main_ObjectFlow34.setName("ObjectFlow34");
		SingleDelegation_P_P_Operation_main_ObjectFlow34.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ObjectFlow34.setSource(SingleDelegation_P_P_Operation_main_Create_A_result);
		SingleDelegation_P_P_Operation_main_ObjectFlow34.setTarget(SingleDelegation_P_P_Operation_main_A__target);
		SingleDelegation_P_P_Operation_main_ObjectFlow34.setGuard(SingleDelegation_P_P_Operation_main_ObjectFlow34_LiteralBoolean36);
		// ObjectFlow SingleDelegation_P_P_Operation_main::ObjectFlow82
		addToElementRepository("ObjectFlow82", SingleDelegation_P_P_Operation_main_ObjectFlow82);
		SingleDelegation_P_P_Operation_main_ObjectFlow82.setName("ObjectFlow82");
		SingleDelegation_P_P_Operation_main_ObjectFlow82.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ObjectFlow82.setSource(SingleDelegation_P_P_Operation_main_Fork_A);
		SingleDelegation_P_P_Operation_main_ObjectFlow82.setTarget(SingleDelegation_P_P_Operation_main_Read_a_q_object);
		SingleDelegation_P_P_Operation_main_ObjectFlow82.setGuard(SingleDelegation_P_P_Operation_main_ObjectFlow82_LiteralBoolean83);
		// ObjectFlow SingleDelegation_P_P_Operation_main::ObjectFlow25
		addToElementRepository("ObjectFlow25", SingleDelegation_P_P_Operation_main_ObjectFlow25);
		SingleDelegation_P_P_Operation_main_ObjectFlow25.setName("ObjectFlow25");
		SingleDelegation_P_P_Operation_main_ObjectFlow25.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ObjectFlow25.setSource(SingleDelegation_P_P_Operation_main_Fork_A);
		SingleDelegation_P_P_Operation_main_ObjectFlow25.setTarget(SingleDelegation_P_P_Operation_main_Read_a_b_object);
		SingleDelegation_P_P_Operation_main_ObjectFlow25.setGuard(SingleDelegation_P_P_Operation_main_ObjectFlow25_LiteralBoolean27);
		// ObjectFlow SingleDelegation_P_P_Operation_main::ObjectFlow58
		addToElementRepository("ObjectFlow58", SingleDelegation_P_P_Operation_main_ObjectFlow58);
		SingleDelegation_P_P_Operation_main_ObjectFlow58.setName("ObjectFlow58");
		SingleDelegation_P_P_Operation_main_ObjectFlow58.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ObjectFlow58.setSource(SingleDelegation_P_P_Operation_main_EndMessage_result);
		SingleDelegation_P_P_Operation_main_ObjectFlow58.setTarget(SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_value);
		SingleDelegation_P_P_Operation_main_ObjectFlow58.setGuard(SingleDelegation_P_P_Operation_main_ObjectFlow58_LiteralBoolean59);
		// ObjectFlow SingleDelegation_P_P_Operation_main::ObjectFlow92
		addToElementRepository("ObjectFlow92", SingleDelegation_P_P_Operation_main_ObjectFlow92);
		SingleDelegation_P_P_Operation_main_ObjectFlow92.setName("ObjectFlow92");
		SingleDelegation_P_P_Operation_main_ObjectFlow92.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ObjectFlow92.setSource(SingleDelegation_P_P_Operation_main_Read_a_b_result);
		SingleDelegation_P_P_Operation_main_ObjectFlow92.setTarget(SingleDelegation_P_P_Operation_main_Read_a_b_p_object);
		SingleDelegation_P_P_Operation_main_ObjectFlow92.setGuard(SingleDelegation_P_P_Operation_main_ObjectFlow92_LiteralBoolean94);
		// ObjectFlow SingleDelegation_P_P_Operation_B_setPActivity::ObjectFlow16
		addToElementRepository("ObjectFlow16", SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16.setName("ObjectFlow16");
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16.setSource(SingleDelegation_P_P_Operation_B_setPActivity_this_result);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16.setTarget(SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_object);
		SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16.setGuard(SingleDelegation_P_P_Operation_B_setPActivity_ObjectFlow16_LiteralBoolean18);
		// ObjectFlow SingleDelegation_P_P_Operation_main::ObjectFlow49
		addToElementRepository("ObjectFlow49", SingleDelegation_P_P_Operation_main_ObjectFlow49);
		SingleDelegation_P_P_Operation_main_ObjectFlow49.setName("ObjectFlow49");
		SingleDelegation_P_P_Operation_main_ObjectFlow49.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ObjectFlow49.setSource(SingleDelegation_P_P_Operation_main_Read_a_q_result);
		SingleDelegation_P_P_Operation_main_ObjectFlow49.setTarget(SingleDelegation_P_P_Operation_main_Call_a_q_setP_target);
		SingleDelegation_P_P_Operation_main_ObjectFlow49.setGuard(SingleDelegation_P_P_Operation_main_ObjectFlow49_LiteralBoolean51);
		// ObjectFlow SingleDelegation_P_P_Operation_main::ObjectFlow75
		addToElementRepository("ObjectFlow75", SingleDelegation_P_P_Operation_main_ObjectFlow75);
		SingleDelegation_P_P_Operation_main_ObjectFlow75.setName("ObjectFlow75");
		SingleDelegation_P_P_Operation_main_ObjectFlow75.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ObjectFlow75.setSource(SingleDelegation_P_P_Operation_main_Value_4_result);
		SingleDelegation_P_P_Operation_main_ObjectFlow75.setTarget(SingleDelegation_P_P_Operation_main_Call_a_q_setP_v);
		SingleDelegation_P_P_Operation_main_ObjectFlow75.setGuard(SingleDelegation_P_P_Operation_main_ObjectFlow75_LiteralBoolean76);
		// ObjectFlow SingleDelegation_P_P_Operation_main::ObjectFlow98
		addToElementRepository("ObjectFlow98", SingleDelegation_P_P_Operation_main_ObjectFlow98);
		SingleDelegation_P_P_Operation_main_ObjectFlow98.setName("ObjectFlow98");
		SingleDelegation_P_P_Operation_main_ObjectFlow98.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ObjectFlow98.setSource(SingleDelegation_P_P_Operation_main_Read_a_b_p_result);
		SingleDelegation_P_P_Operation_main_ObjectFlow98.setTarget(SingleDelegation_P_P_Operation_main_Call_testP_p);
		SingleDelegation_P_P_Operation_main_ObjectFlow98.setGuard(SingleDelegation_P_P_Operation_main_ObjectFlow98_LiteralBoolean99);
		// ObjectFlow SingleDelegation_P_P_Operation_main::ObjectFlow52
		addToElementRepository("ObjectFlow52", SingleDelegation_P_P_Operation_main_ObjectFlow52);
		SingleDelegation_P_P_Operation_main_ObjectFlow52.setName("ObjectFlow52");
		SingleDelegation_P_P_Operation_main_ObjectFlow52.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_ObjectFlow52.setSource(SingleDelegation_P_P_Operation_main_A__result);
		SingleDelegation_P_P_Operation_main_ObjectFlow52.setTarget(SingleDelegation_P_P_Operation_main_Fork_A);
		SingleDelegation_P_P_Operation_main_ObjectFlow52.setGuard(SingleDelegation_P_P_Operation_main_ObjectFlow52_LiteralBoolean53);
	}

	private void initializeOperation_Instances()
	{
		// Operation SingleDelegation_P_P_Operation_B::setP_Integer
		addToElementRepository("setP_Integer", SingleDelegation_P_P_Operation_B_setP_Integer);
		SingleDelegation_P_P_Operation_B_setP_Integer.setName("setP");
		SingleDelegation_P_P_Operation_B_setP_Integer.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setP_Integer.addOwnedParameter(SingleDelegation_P_P_Operation_B_setP_Integer_v);
		SingleDelegation_P_P_Operation_B_setP_Integer.addMethod(SingleDelegation_P_P_Operation_B_setPActivity);
		// Operation SingleDelegation_P_P_Operation_A::A_A
		addToElementRepository("A_A", SingleDelegation_P_P_Operation_A_A_A);
		SingleDelegation_P_P_Operation_A_A_A.setName("A");
		SingleDelegation_P_P_Operation_A_A_A.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_A_A_A.addOwnedParameter(SingleDelegation_P_P_Operation_A_A_A_result);
		SingleDelegation_P_P_Operation_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation SingleDelegation_P_P_Operation_B::B_B
		addToElementRepository("B_B", SingleDelegation_P_P_Operation_B_B_B);
		SingleDelegation_P_P_Operation_B_B_B.setName("B");
		SingleDelegation_P_P_Operation_B_B_B.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_B_B.addOwnedParameter(SingleDelegation_P_P_Operation_B_B_B_result);
		SingleDelegation_P_P_Operation_B_B_B.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation SingleDelegation_P_P_Operation_I::setP_Integer
		addToElementRepository("setP_Integer", SingleDelegation_P_P_Operation_I_setP_Integer);
		SingleDelegation_P_P_Operation_I_setP_Integer.setName("setP");
		SingleDelegation_P_P_Operation_I_setP_Integer.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_I_setP_Integer.addOwnedParameter(SingleDelegation_P_P_Operation_I_setP_Integer_v);
		// Operation SingleDelegation_P_P_Operation_IImpl::setP_Integer
		addToElementRepository("setP_Integer", SingleDelegation_P_P_Operation_IImpl_setP_Integer);
		SingleDelegation_P_P_Operation_IImpl_setP_Integer.setName("setP");
		SingleDelegation_P_P_Operation_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_IImpl_setP_Integer.addOwnedParameter(SingleDelegation_P_P_Operation_IImpl_setP_Integer_v);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin SingleDelegation_P_P_Operation_B_setPActivity_this::result
		addToElementRepository("result", SingleDelegation_P_P_Operation_B_setPActivity_this_result);
		SingleDelegation_P_P_Operation_B_setPActivity_this_result.setName("result");
		SingleDelegation_P_P_Operation_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_this_result.setType(SingleDelegation_P_P_Operation_B);
		// OutputPin SingleDelegation_P_P_Operation_main_A()::result
		addToElementRepository("result", SingleDelegation_P_P_Operation_main_A__result);
		SingleDelegation_P_P_Operation_main_A__result.setName("result");
		SingleDelegation_P_P_Operation_main_A__result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_A__result.setType(SingleDelegation_P_P_Operation_A);
		// OutputPin SingleDelegation_P_P_Operation_main_WriteLine(EndMessage)::errorStatus
		addToElementRepository("errorStatus", SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus.setName("errorStatus");
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		SingleDelegation_P_P_Operation_main_WriteLine_EndMessage_errorStatus.setLower(0);
		// OutputPin SingleDelegation_P_P_Operation_main_Value(4)::result
		addToElementRepository("result", SingleDelegation_P_P_Operation_main_Value_4_result);
		SingleDelegation_P_P_Operation_main_Value_4_result.setName("result");
		SingleDelegation_P_P_Operation_main_Value_4_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin SingleDelegation_P_P_Operation_main_InitialMessage::result
		addToElementRepository("result", SingleDelegation_P_P_Operation_main_InitialMessage_result);
		SingleDelegation_P_P_Operation_main_InitialMessage_result.setName("result");
		SingleDelegation_P_P_Operation_main_InitialMessage_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_InitialMessage_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin SingleDelegation_P_P_Operation_main_Read a.q::result
		addToElementRepository("result", SingleDelegation_P_P_Operation_main_Read_a_q_result);
		SingleDelegation_P_P_Operation_main_Read_a_q_result.setName("result");
		SingleDelegation_P_P_Operation_main_Read_a_q_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_q_result.setType(SingleDelegation_P_P_Operation_IImpl);
		// OutputPin SingleDelegation_P_P_Operation_main_EndMessage::result
		addToElementRepository("result", SingleDelegation_P_P_Operation_main_EndMessage_result);
		SingleDelegation_P_P_Operation_main_EndMessage_result.setName("result");
		SingleDelegation_P_P_Operation_main_EndMessage_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_EndMessage_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin SingleDelegation_P_P_Operation_main_Read a.b.p::result
		addToElementRepository("result", SingleDelegation_P_P_Operation_main_Read_a_b_p_result);
		SingleDelegation_P_P_Operation_main_Read_a_b_p_result.setName("result");
		SingleDelegation_P_P_Operation_main_Read_a_b_p_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin SingleDelegation_P_P_Operation_main_Read a.b::result
		addToElementRepository("result", SingleDelegation_P_P_Operation_main_Read_a_b_result);
		SingleDelegation_P_P_Operation_main_Read_a_b_result.setName("result");
		SingleDelegation_P_P_Operation_main_Read_a_b_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_result.setType(SingleDelegation_P_P_Operation_B);
		// OutputPin SingleDelegation_P_P_Operation_B_setPActivity_Set this.p::result
		addToElementRepository("result", SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result.setName("result");
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_Set_this_p_result.setType(SingleDelegation_P_P_Operation_B);
		// OutputPin SingleDelegation_P_P_Operation_main_WriteLine(InitialMessage)::errorStatus
		addToElementRepository("errorStatus", SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus.setName("errorStatus");
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		SingleDelegation_P_P_Operation_main_WriteLine_InitialMessage_errorStatus.setLower(0);
		// OutputPin SingleDelegation_P_P_Operation_main_Create A::result
		addToElementRepository("result", SingleDelegation_P_P_Operation_main_Create_A_result);
		SingleDelegation_P_P_Operation_main_Create_A_result.setName("result");
		SingleDelegation_P_P_Operation_main_Create_A_result.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Create_A_result.setType(SingleDelegation_P_P_Operation_A);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport SingleDelegation_P_P_Operation::PackageImport1
		addToElementRepository("PackageImport1", SingleDelegation_P_P_Operation_PackageImport1);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter SingleDelegation_P_P_Operation_B_setPActivity::v
		addToElementRepository("v", SingleDelegation_P_P_Operation_B_setPActivity_v);
		SingleDelegation_P_P_Operation_B_setPActivity_v.setName("v");
		SingleDelegation_P_P_Operation_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter SingleDelegation_P_P_Operation_B_setP_Integer::v
		addToElementRepository("v", SingleDelegation_P_P_Operation_B_setP_Integer_v);
		SingleDelegation_P_P_Operation_B_setP_Integer_v.setName("v");
		SingleDelegation_P_P_Operation_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter SingleDelegation_P_P_Operation_B_B_B::result
		addToElementRepository("result", SingleDelegation_P_P_Operation_B_B_B_result);
		SingleDelegation_P_P_Operation_B_B_B_result.setName("result");
		SingleDelegation_P_P_Operation_B_B_B_result.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_B_B_B_result.setType(SingleDelegation_P_P_Operation_B);
		SingleDelegation_P_P_Operation_B_B_B_result.setDirection(ParameterDirectionKind.return_);
		// Parameter SingleDelegation_P_P_Operation_A_A_A::result
		addToElementRepository("result", SingleDelegation_P_P_Operation_A_A_A_result);
		SingleDelegation_P_P_Operation_A_A_A_result.setName("result");
		SingleDelegation_P_P_Operation_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_A_A_A_result.setType(SingleDelegation_P_P_Operation_A);
		SingleDelegation_P_P_Operation_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter SingleDelegation_P_P_Operation_main_testP::p
		addToElementRepository("p", SingleDelegation_P_P_Operation_main_testP_p);
		SingleDelegation_P_P_Operation_main_testP_p.setName("p");
		SingleDelegation_P_P_Operation_main_testP_p.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_main_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter SingleDelegation_P_P_Operation_IImpl_setP_Integer::v
		addToElementRepository("v", SingleDelegation_P_P_Operation_IImpl_setP_Integer_v);
		SingleDelegation_P_P_Operation_IImpl_setP_Integer_v.setName("v");
		SingleDelegation_P_P_Operation_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter SingleDelegation_P_P_Operation_I_setP_Integer::v
		addToElementRepository("v", SingleDelegation_P_P_Operation_I_setP_Integer_v);
		SingleDelegation_P_P_Operation_I_setP_Integer_v.setName("v");
		SingleDelegation_P_P_Operation_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializePort_Instances()
	{
		// Port SingleDelegation_P_P_Operation_A::q
		addToElementRepository("q", SingleDelegation_P_P_Operation_A_q);
		SingleDelegation_P_P_Operation_A_q.setName("q");
		SingleDelegation_P_P_Operation_A_q.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_A_q.setType(SingleDelegation_P_P_Operation_IImpl);
		SingleDelegation_P_P_Operation_A_q.setAggregation(AggregationKind.composite);
		SingleDelegation_P_P_Operation_A_q.isService = true;
		SingleDelegation_P_P_Operation_A_q.addProvided(SingleDelegation_P_P_Operation_I);
	}

	private void initializeProperty_Instances()
	{
		// Property SingleDelegation_P_P_Operation_A::b
		addToElementRepository("b", SingleDelegation_P_P_Operation_A_b);
		SingleDelegation_P_P_Operation_A_b.setName("b");
		SingleDelegation_P_P_Operation_A_b.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_A_b.setType(SingleDelegation_P_P_Operation_B);
		SingleDelegation_P_P_Operation_A_b.setAggregation(AggregationKind.composite);
		// Property SingleDelegation_P_P_Operation_B::p
		addToElementRepository("p", SingleDelegation_P_P_Operation_B_p);
		SingleDelegation_P_P_Operation_B_p.setName("p");
		SingleDelegation_P_P_Operation_B_p.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property SingleDelegation_P_P_Operation_R::y
		addToElementRepository("y", SingleDelegation_P_P_Operation_R_y);
		SingleDelegation_P_P_Operation_R_y.setName("y");
		SingleDelegation_P_P_Operation_R_y.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_R_y.setType(SingleDelegation_P_P_Operation_IImpl);
		// Property SingleDelegation_P_P_Operation_R::x
		addToElementRepository("x", SingleDelegation_P_P_Operation_R_x);
		SingleDelegation_P_P_Operation_R_x.setName("x");
		SingleDelegation_P_P_Operation_R_x.setVisibility(VisibilityKind.public_);
		
		SingleDelegation_P_P_Operation_R_x.setType(SingleDelegation_P_P_Operation_B);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction SingleDelegation_P_P_Operation_B_setPActivity::this
		addToElementRepository("this", SingleDelegation_P_P_Operation_B_setPActivity_this);
		SingleDelegation_P_P_Operation_B_setPActivity_this.setName("this");
		SingleDelegation_P_P_Operation_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_B_setPActivity_this.setResult(SingleDelegation_P_P_Operation_B_setPActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction SingleDelegation_P_P_Operation_main::Read a.b.p
		addToElementRepository("Read a.b.p", SingleDelegation_P_P_Operation_main_Read_a_b_p);
		SingleDelegation_P_P_Operation_main_Read_a_b_p.setName("Read a.b.p");
		SingleDelegation_P_P_Operation_main_Read_a_b_p.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b_p.setStructuralFeature(SingleDelegation_P_P_Operation_B_p);
		SingleDelegation_P_P_Operation_main_Read_a_b_p.setObject(SingleDelegation_P_P_Operation_main_Read_a_b_p_object);
		SingleDelegation_P_P_Operation_main_Read_a_b_p.setResult(SingleDelegation_P_P_Operation_main_Read_a_b_p_result);
		// ReadStructuralFeatureAction SingleDelegation_P_P_Operation_main::Read a.q
		addToElementRepository("Read a.q", SingleDelegation_P_P_Operation_main_Read_a_q);
		SingleDelegation_P_P_Operation_main_Read_a_q.setName("Read a.q");
		SingleDelegation_P_P_Operation_main_Read_a_q.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_q.setStructuralFeature(SingleDelegation_P_P_Operation_A_q);
		SingleDelegation_P_P_Operation_main_Read_a_q.setObject(SingleDelegation_P_P_Operation_main_Read_a_q_object);
		SingleDelegation_P_P_Operation_main_Read_a_q.setResult(SingleDelegation_P_P_Operation_main_Read_a_q_result);
		// ReadStructuralFeatureAction SingleDelegation_P_P_Operation_main::Read a.b
		addToElementRepository("Read a.b", SingleDelegation_P_P_Operation_main_Read_a_b);
		SingleDelegation_P_P_Operation_main_Read_a_b.setName("Read a.b");
		SingleDelegation_P_P_Operation_main_Read_a_b.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Read_a_b.setStructuralFeature(SingleDelegation_P_P_Operation_A_b);
		SingleDelegation_P_P_Operation_main_Read_a_b.setObject(SingleDelegation_P_P_Operation_main_Read_a_b_object);
		SingleDelegation_P_P_Operation_main_Read_a_b.setResult(SingleDelegation_P_P_Operation_main_Read_a_b_result);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction SingleDelegation_P_P_Operation_main::EndMessage
		addToElementRepository("EndMessage", SingleDelegation_P_P_Operation_main_EndMessage);
		SingleDelegation_P_P_Operation_main_EndMessage.setName("EndMessage");
		SingleDelegation_P_P_Operation_main_EndMessage.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_EndMessage.setValue(SingleDelegation_P_P_Operation_main_EndMessage_LiteralString22);
		SingleDelegation_P_P_Operation_main_EndMessage.setResult(SingleDelegation_P_P_Operation_main_EndMessage_result);
		// ValueSpecificationAction SingleDelegation_P_P_Operation_main::Value(4)
		addToElementRepository("Value(4)", SingleDelegation_P_P_Operation_main_Value_4);
		SingleDelegation_P_P_Operation_main_Value_4.setName("Value(4)");
		SingleDelegation_P_P_Operation_main_Value_4.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_Value_4.setValue(SingleDelegation_P_P_Operation_main_Value_4_LiteralInteger63);
		SingleDelegation_P_P_Operation_main_Value_4.setResult(SingleDelegation_P_P_Operation_main_Value_4_result);
		// ValueSpecificationAction SingleDelegation_P_P_Operation_main::InitialMessage
		addToElementRepository("InitialMessage", SingleDelegation_P_P_Operation_main_InitialMessage);
		SingleDelegation_P_P_Operation_main_InitialMessage.setName("InitialMessage");
		SingleDelegation_P_P_Operation_main_InitialMessage.setVisibility(VisibilityKind.public_);
		SingleDelegation_P_P_Operation_main_InitialMessage.setValue(SingleDelegation_P_P_Operation_main_InitialMessage_LiteralString95);
		SingleDelegation_P_P_Operation_main_InitialMessage.setResult(SingleDelegation_P_P_Operation_main_InitialMessage_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // SingleDelegation_P_P_OperationModel
