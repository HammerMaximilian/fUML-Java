/*
 * Operation_RequiredInterfaceModel.java
 * 
 * Auto-generated file
 */
package Operation_RequiredInterface;

import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
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

public class Operation_RequiredInterfaceModel extends InMemoryModel
{
	private static Operation_RequiredInterfaceModel instance;

	/*
	 * Model Operation_RequiredInterface
	 */
	public Package Operation_RequiredInterface = new Package();
		public Comment Operation_RequiredInterface_Comment0 = new Comment();
		public PackageImport Operation_RequiredInterface_PackageImport1 = new PackageImport();
		public Class_ Operation_RequiredInterface_C = new Class_();
			public InterfaceRealization Operation_RequiredInterface_C_IRealization = new InterfaceRealization();
			public Activity Operation_RequiredInterface_C_setPActivity = new Activity();
				public ActivityParameterNode Operation_RequiredInterface_C_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger Operation_RequiredInterface_C_setPActivity_vParameterNode_LiteralInteger2 = new LiteralInteger();
				public ObjectFlow Operation_RequiredInterface_C_setPActivity_ObjectFlow3 = new ObjectFlow();
					public LiteralInteger Operation_RequiredInterface_C_setPActivity_ObjectFlow3_LiteralInteger4 = new LiteralInteger();
					public LiteralBoolean Operation_RequiredInterface_C_setPActivity_ObjectFlow3_LiteralBoolean5 = new LiteralBoolean();
				public Parameter Operation_RequiredInterface_C_setPActivity_v = new Parameter();
				public ObjectFlow Operation_RequiredInterface_C_setPActivity_ObjectFlow6 = new ObjectFlow();
					public LiteralInteger Operation_RequiredInterface_C_setPActivity_ObjectFlow6_LiteralInteger7 = new LiteralInteger();
					public LiteralBoolean Operation_RequiredInterface_C_setPActivity_ObjectFlow6_LiteralBoolean8 = new LiteralBoolean();
				public ReadSelfAction Operation_RequiredInterface_C_setPActivity_this = new ReadSelfAction();
					public OutputPin Operation_RequiredInterface_C_setPActivity_this_result = new OutputPin();
						public LiteralInteger Operation_RequiredInterface_C_setPActivity_this_result_LiteralInteger9 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_RequiredInterface_C_setPActivity_this_result_LiteralUnlimitedNatural10 = new LiteralUnlimitedNatural();
				public CallOperationAction Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q = new CallOperationAction();
					public InputPin Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v = new InputPin();
						public LiteralInteger Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger11 = new LiteralInteger();
						public LiteralInteger Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger12 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural13 = new LiteralUnlimitedNatural();
					public InputPin Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target = new InputPin();
						public LiteralInteger Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger14 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural15 = new LiteralUnlimitedNatural();
			public Port Operation_RequiredInterface_C_q = new Port();
			public Operation Operation_RequiredInterface_C_setP_Integer = new Operation();
				public Parameter Operation_RequiredInterface_C_setP_Integer_v = new Parameter();
		public Comment Operation_RequiredInterface_Comment16 = new Comment();
		public Interface Operation_RequiredInterface_I = new Interface();
			public Operation Operation_RequiredInterface_I_setP_Integer = new Operation();
				public Parameter Operation_RequiredInterface_I_setP_Integer_v = new Parameter();
		public Association Operation_RequiredInterface_S = new Association();
			public Property Operation_RequiredInterface_S_y = new Property();
			public Property Operation_RequiredInterface_S_x = new Property();
		public Class_ Operation_RequiredInterface_D = new Class_();
			public Property Operation_RequiredInterface_D_c = new Property();
			public Connector Operation_RequiredInterface_D_s = new Connector();
				public ConnectorEnd Operation_RequiredInterface_D_s_ConnectorEnd17 = new ConnectorEnd();
				public ConnectorEnd Operation_RequiredInterface_D_s_ConnectorEnd18 = new ConnectorEnd();
			public Operation Operation_RequiredInterface_D_D_D = new Operation();
				public Parameter Operation_RequiredInterface_D_D_D_result = new Parameter();
			public Property Operation_RequiredInterface_D_a = new Property();
		public Class_ Operation_RequiredInterface_IImpl = new Class_();
			public InterfaceRealization Operation_RequiredInterface_IImpl_IRealization = new InterfaceRealization();
			public Operation Operation_RequiredInterface_IImpl_setP_Integer = new Operation();
				public Parameter Operation_RequiredInterface_IImpl_setP_Integer_v = new Parameter();
		public Activity Operation_RequiredInterface_main = new Activity();
			public ReadStructuralFeatureAction Operation_RequiredInterface_main_Read_d_c = new ReadStructuralFeatureAction();
				public InputPin Operation_RequiredInterface_main_Read_d_c_object = new InputPin();
					public LiteralInteger Operation_RequiredInterface_main_Read_d_c_object_LiteralInteger19 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Read_d_c_object_LiteralUnlimitedNatural20 = new LiteralUnlimitedNatural();
				public OutputPin Operation_RequiredInterface_main_Read_d_c_result = new OutputPin();
					public LiteralInteger Operation_RequiredInterface_main_Read_d_c_result_LiteralInteger21 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Read_d_c_result_LiteralUnlimitedNatural22 = new LiteralUnlimitedNatural();
			public ObjectFlow Operation_RequiredInterface_main_ObjectFlow23 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_main_ObjectFlow23_LiteralBoolean24 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_main_ObjectFlow23_LiteralInteger25 = new LiteralInteger();
			public ObjectFlow Operation_RequiredInterface_main_ObjectFlow26 = new ObjectFlow();
				public LiteralInteger Operation_RequiredInterface_main_ObjectFlow26_LiteralInteger27 = new LiteralInteger();
				public LiteralBoolean Operation_RequiredInterface_main_ObjectFlow26_LiteralBoolean28 = new LiteralBoolean();
			public ObjectFlow Operation_RequiredInterface_main_ObjectFlow29 = new ObjectFlow();
				public LiteralInteger Operation_RequiredInterface_main_ObjectFlow29_LiteralInteger30 = new LiteralInteger();
				public LiteralBoolean Operation_RequiredInterface_main_ObjectFlow29_LiteralBoolean31 = new LiteralBoolean();
			public ReadStructuralFeatureAction Operation_RequiredInterface_main_Read_a_b = new ReadStructuralFeatureAction();
				public OutputPin Operation_RequiredInterface_main_Read_a_b_result = new OutputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Read_a_b_result_LiteralUnlimitedNatural32 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_main_Read_a_b_result_LiteralInteger33 = new LiteralInteger();
				public InputPin Operation_RequiredInterface_main_Read_a_b_object = new InputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Read_a_b_object_LiteralUnlimitedNatural34 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_main_Read_a_b_object_LiteralInteger35 = new LiteralInteger();
			public ReadStructuralFeatureAction Operation_RequiredInterface_main_Read_d_a = new ReadStructuralFeatureAction();
				public OutputPin Operation_RequiredInterface_main_Read_d_a_result = new OutputPin();
					public LiteralInteger Operation_RequiredInterface_main_Read_d_a_result_LiteralInteger36 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Read_d_a_result_LiteralUnlimitedNatural37 = new LiteralUnlimitedNatural();
				public InputPin Operation_RequiredInterface_main_Read_d_a_object = new InputPin();
					public LiteralInteger Operation_RequiredInterface_main_Read_d_a_object_LiteralInteger38 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Read_d_a_object_LiteralUnlimitedNatural39 = new LiteralUnlimitedNatural();
			public ObjectFlow Operation_RequiredInterface_main_ObjectFlow40 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_main_ObjectFlow40_LiteralBoolean41 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_main_ObjectFlow40_LiteralInteger42 = new LiteralInteger();
			public ValueSpecificationAction Operation_RequiredInterface_main_Value_4 = new ValueSpecificationAction();
				public OutputPin Operation_RequiredInterface_main_Value_4_result = new OutputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Value_4_result_LiteralUnlimitedNatural43 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_main_Value_4_result_LiteralInteger44 = new LiteralInteger();
				public LiteralInteger Operation_RequiredInterface_main_Value_4_LiteralInteger45 = new LiteralInteger();
			public ControlFlow Operation_RequiredInterface_main_ControlFlow46 = new ControlFlow();
			public OpaqueBehavior Operation_RequiredInterface_main_testP = new OpaqueBehavior();
				public Parameter Operation_RequiredInterface_main_testP_p = new Parameter();
			public ObjectFlow Operation_RequiredInterface_main_ObjectFlow47 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_main_ObjectFlow47_LiteralBoolean48 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_main_ObjectFlow47_LiteralInteger49 = new LiteralInteger();
			public ObjectFlow Operation_RequiredInterface_main_ObjectFlow50 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_main_ObjectFlow50_LiteralBoolean51 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_main_ObjectFlow50_LiteralInteger52 = new LiteralInteger();
			public CallOperationAction Operation_RequiredInterface_main_D_ = new CallOperationAction();
				public OutputPin Operation_RequiredInterface_main_D__result = new OutputPin();
					public LiteralInteger Operation_RequiredInterface_main_D__result_LiteralInteger53 = new LiteralInteger();
					public LiteralInteger Operation_RequiredInterface_main_D__result_LiteralInteger54 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_D__result_LiteralUnlimitedNatural55 = new LiteralUnlimitedNatural();
				public InputPin Operation_RequiredInterface_main_D__target = new InputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_D__target_LiteralUnlimitedNatural56 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_main_D__target_LiteralInteger57 = new LiteralInteger();
			public ReadStructuralFeatureAction Operation_RequiredInterface_main_Read_b_p = new ReadStructuralFeatureAction();
				public InputPin Operation_RequiredInterface_main_Read_b_p_object = new InputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Read_b_p_object_LiteralUnlimitedNatural58 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_main_Read_b_p_object_LiteralInteger59 = new LiteralInteger();
				public OutputPin Operation_RequiredInterface_main_Read_b_p_result = new OutputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Read_b_p_result_LiteralUnlimitedNatural60 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_main_Read_b_p_result_LiteralInteger61 = new LiteralInteger();
			public CreateObjectAction Operation_RequiredInterface_main_Create_D = new CreateObjectAction();
				public OutputPin Operation_RequiredInterface_main_Create_D_result = new OutputPin();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Create_D_result_LiteralUnlimitedNatural62 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_main_Create_D_result_LiteralInteger63 = new LiteralInteger();
			public ForkNode Operation_RequiredInterface_main_Fork_d = new ForkNode();
			public CallOperationAction Operation_RequiredInterface_main_Call_setP_ = new CallOperationAction();
				public InputPin Operation_RequiredInterface_main_Call_setP__target = new InputPin();
					public LiteralInteger Operation_RequiredInterface_main_Call_setP__target_LiteralInteger64 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Call_setP__target_LiteralUnlimitedNatural65 = new LiteralUnlimitedNatural();
				public InputPin Operation_RequiredInterface_main_Call_setP__v = new InputPin();
					public LiteralInteger Operation_RequiredInterface_main_Call_setP__v_LiteralInteger66 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Call_setP__v_LiteralUnlimitedNatural67 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_RequiredInterface_main_Call_setP__v_LiteralInteger68 = new LiteralInteger();
			public ObjectFlow Operation_RequiredInterface_main_ObjectFlow69 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_main_ObjectFlow69_LiteralBoolean70 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_main_ObjectFlow69_LiteralInteger71 = new LiteralInteger();
			public ObjectFlow Operation_RequiredInterface_main_ObjectFlow72 = new ObjectFlow();
				public LiteralInteger Operation_RequiredInterface_main_ObjectFlow72_LiteralInteger73 = new LiteralInteger();
				public LiteralBoolean Operation_RequiredInterface_main_ObjectFlow72_LiteralBoolean74 = new LiteralBoolean();
			public ObjectFlow Operation_RequiredInterface_main_ObjectFlow75 = new ObjectFlow();
				public LiteralBoolean Operation_RequiredInterface_main_ObjectFlow75_LiteralBoolean76 = new LiteralBoolean();
				public LiteralInteger Operation_RequiredInterface_main_ObjectFlow75_LiteralInteger77 = new LiteralInteger();
			public CallBehaviorAction Operation_RequiredInterface_main_Call_testP = new CallBehaviorAction();
				public InputPin Operation_RequiredInterface_main_Call_testP_p = new InputPin();
					public LiteralInteger Operation_RequiredInterface_main_Call_testP_p_LiteralInteger78 = new LiteralInteger();
					public LiteralInteger Operation_RequiredInterface_main_Call_testP_p_LiteralInteger79 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_RequiredInterface_main_Call_testP_p_LiteralUnlimitedNatural80 = new LiteralUnlimitedNatural();
		public Class_ Operation_RequiredInterface_B = new Class_();
			public Property Operation_RequiredInterface_B_p = new Property();
			public Operation Operation_RequiredInterface_B_setP_Integer = new Operation();
				public Parameter Operation_RequiredInterface_B_setP_Integer_v = new Parameter();
			public Activity Operation_RequiredInterface_B_setPActivity = new Activity();
				public ObjectFlow Operation_RequiredInterface_B_setPActivity_ObjectFlow81 = new ObjectFlow();
					public LiteralInteger Operation_RequiredInterface_B_setPActivity_ObjectFlow81_LiteralInteger82 = new LiteralInteger();
					public LiteralBoolean Operation_RequiredInterface_B_setPActivity_ObjectFlow81_LiteralBoolean83 = new LiteralBoolean();
				public ActivityParameterNode Operation_RequiredInterface_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger Operation_RequiredInterface_B_setPActivity_vParameterNode_LiteralInteger84 = new LiteralInteger();
				public ObjectFlow Operation_RequiredInterface_B_setPActivity_ObjectFlow85 = new ObjectFlow();
					public LiteralBoolean Operation_RequiredInterface_B_setPActivity_ObjectFlow85_LiteralBoolean86 = new LiteralBoolean();
					public LiteralInteger Operation_RequiredInterface_B_setPActivity_ObjectFlow85_LiteralInteger87 = new LiteralInteger();
				public Parameter Operation_RequiredInterface_B_setPActivity_v = new Parameter();
				public AddStructuralFeatureValueAction Operation_RequiredInterface_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin Operation_RequiredInterface_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralInteger Operation_RequiredInterface_B_setPActivity_Set_this_p_value_LiteralInteger88 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_RequiredInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural89 = new LiteralUnlimitedNatural();
					public InputPin Operation_RequiredInterface_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralUnlimitedNatural Operation_RequiredInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural90 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_RequiredInterface_B_setPActivity_Set_this_p_object_LiteralInteger91 = new LiteralInteger();
					public OutputPin Operation_RequiredInterface_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralInteger Operation_RequiredInterface_B_setPActivity_Set_this_p_result_LiteralInteger92 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_RequiredInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural93 = new LiteralUnlimitedNatural();
				public ReadSelfAction Operation_RequiredInterface_B_setPActivity_this = new ReadSelfAction();
					public OutputPin Operation_RequiredInterface_B_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural Operation_RequiredInterface_B_setPActivity_this_result_LiteralUnlimitedNatural94 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_RequiredInterface_B_setPActivity_this_result_LiteralInteger95 = new LiteralInteger();
			public InterfaceRealization Operation_RequiredInterface_B_IRealization = new InterfaceRealization();
		public Class_ Operation_RequiredInterface_A = new Class_();
			public Port Operation_RequiredInterface_A_q = new Port();
			public Connector Operation_RequiredInterface_A_r = new Connector();
				public ConnectorEnd Operation_RequiredInterface_A_r_ConnectorEnd96 = new ConnectorEnd();
				public ConnectorEnd Operation_RequiredInterface_A_r_ConnectorEnd97 = new ConnectorEnd();
			public Activity Operation_RequiredInterface_A_setPActivity = new Activity();
				public ObjectFlow Operation_RequiredInterface_A_setPActivity_ObjectFlow98 = new ObjectFlow();
					public LiteralInteger Operation_RequiredInterface_A_setPActivity_ObjectFlow98_LiteralInteger99 = new LiteralInteger();
					public LiteralBoolean Operation_RequiredInterface_A_setPActivity_ObjectFlow98_LiteralBoolean100 = new LiteralBoolean();
				public ReadSelfAction Operation_RequiredInterface_A_setPActivity_this = new ReadSelfAction();
					public OutputPin Operation_RequiredInterface_A_setPActivity_this_result = new OutputPin();
						public LiteralInteger Operation_RequiredInterface_A_setPActivity_this_result_LiteralInteger101 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_RequiredInterface_A_setPActivity_this_result_LiteralUnlimitedNatural102 = new LiteralUnlimitedNatural();
				public ObjectFlow Operation_RequiredInterface_A_setPActivity_ObjectFlow103 = new ObjectFlow();
					public LiteralBoolean Operation_RequiredInterface_A_setPActivity_ObjectFlow103_LiteralBoolean104 = new LiteralBoolean();
					public LiteralInteger Operation_RequiredInterface_A_setPActivity_ObjectFlow103_LiteralInteger105 = new LiteralInteger();
				public ActivityParameterNode Operation_RequiredInterface_A_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger Operation_RequiredInterface_A_setPActivity_vParameterNode_LiteralInteger106 = new LiteralInteger();
				public Parameter Operation_RequiredInterface_A_setPActivity_v = new Parameter();
				public CallOperationAction Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q = new CallOperationAction();
					public InputPin Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target = new InputPin();
						public LiteralUnlimitedNatural Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural107 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger108 = new LiteralInteger();
					public InputPin Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v = new InputPin();
						public LiteralUnlimitedNatural Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural109 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger110 = new LiteralInteger();
						public LiteralInteger Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger111 = new LiteralInteger();
			public Operation Operation_RequiredInterface_A_setP_Integer = new Operation();
				public Parameter Operation_RequiredInterface_A_setP_Integer_v = new Parameter();
			public Property Operation_RequiredInterface_A_b = new Property();
		public Association Operation_RequiredInterface_R = new Association();
			public Property Operation_RequiredInterface_R_x = new Property();
			public Property Operation_RequiredInterface_R_y = new Property();

	public static Operation_RequiredInterfaceModel instance()
	{
		if (instance == null)
        {
            instance = new Operation_RequiredInterfaceModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public Operation_RequiredInterfaceModel()
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
		// Activity Operation_RequiredInterface::main
		addToElementRepository("main", Operation_RequiredInterface_main);
		Operation_RequiredInterface_main.setName("main");
		Operation_RequiredInterface_main.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main.addOwnedBehavior(Operation_RequiredInterface_main_testP);
		Operation_RequiredInterface_main.addNode(Operation_RequiredInterface_main_Read_d_c);
		Operation_RequiredInterface_main.addNode(Operation_RequiredInterface_main_D_);
		Operation_RequiredInterface_main.addNode(Operation_RequiredInterface_main_Read_b_p);
		Operation_RequiredInterface_main.addNode(Operation_RequiredInterface_main_Read_a_b);
		Operation_RequiredInterface_main.addNode(Operation_RequiredInterface_main_Read_d_a);
		Operation_RequiredInterface_main.addNode(Operation_RequiredInterface_main_Create_D);
		Operation_RequiredInterface_main.addNode(Operation_RequiredInterface_main_Fork_d);
		Operation_RequiredInterface_main.addNode(Operation_RequiredInterface_main_Call_setP_);
		Operation_RequiredInterface_main.addNode(Operation_RequiredInterface_main_Value_4);
		Operation_RequiredInterface_main.addNode(Operation_RequiredInterface_main_Call_testP);
		Operation_RequiredInterface_main.addEdge(Operation_RequiredInterface_main_ControlFlow46);
		Operation_RequiredInterface_main.addEdge(Operation_RequiredInterface_main_ObjectFlow23);
		Operation_RequiredInterface_main.addEdge(Operation_RequiredInterface_main_ObjectFlow47);
		Operation_RequiredInterface_main.addEdge(Operation_RequiredInterface_main_ObjectFlow26);
		Operation_RequiredInterface_main.addEdge(Operation_RequiredInterface_main_ObjectFlow50);
		Operation_RequiredInterface_main.addEdge(Operation_RequiredInterface_main_ObjectFlow29);
		Operation_RequiredInterface_main.addEdge(Operation_RequiredInterface_main_ObjectFlow40);
		Operation_RequiredInterface_main.addEdge(Operation_RequiredInterface_main_ObjectFlow69);
		Operation_RequiredInterface_main.addEdge(Operation_RequiredInterface_main_ObjectFlow72);
		Operation_RequiredInterface_main.addEdge(Operation_RequiredInterface_main_ObjectFlow75);
		// Activity Operation_RequiredInterface_A::setPActivity
		addToElementRepository("setPActivity", Operation_RequiredInterface_A_setPActivity);
		Operation_RequiredInterface_A_setPActivity.setName("setPActivity");
		Operation_RequiredInterface_A_setPActivity.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_A_setPActivity.addOwnedParameter(Operation_RequiredInterface_A_setPActivity_v);
		Operation_RequiredInterface_A_setPActivity.addNode(Operation_RequiredInterface_A_setPActivity_this);
		Operation_RequiredInterface_A_setPActivity.addNode(Operation_RequiredInterface_A_setPActivity_vParameterNode);
		Operation_RequiredInterface_A_setPActivity.addNode(Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q);
		Operation_RequiredInterface_A_setPActivity.addEdge(Operation_RequiredInterface_A_setPActivity_ObjectFlow98);
		Operation_RequiredInterface_A_setPActivity.addEdge(Operation_RequiredInterface_A_setPActivity_ObjectFlow103);
		// Activity Operation_RequiredInterface_C::setPActivity
		addToElementRepository("setPActivity", Operation_RequiredInterface_C_setPActivity);
		Operation_RequiredInterface_C_setPActivity.setName("setPActivity");
		Operation_RequiredInterface_C_setPActivity.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_C_setPActivity.addOwnedParameter(Operation_RequiredInterface_C_setPActivity_v);
		Operation_RequiredInterface_C_setPActivity.addNode(Operation_RequiredInterface_C_setPActivity_vParameterNode);
		Operation_RequiredInterface_C_setPActivity.addNode(Operation_RequiredInterface_C_setPActivity_this);
		Operation_RequiredInterface_C_setPActivity.addNode(Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q);
		Operation_RequiredInterface_C_setPActivity.addEdge(Operation_RequiredInterface_C_setPActivity_ObjectFlow3);
		Operation_RequiredInterface_C_setPActivity.addEdge(Operation_RequiredInterface_C_setPActivity_ObjectFlow6);
		// Activity Operation_RequiredInterface_B::setPActivity
		addToElementRepository("setPActivity", Operation_RequiredInterface_B_setPActivity);
		Operation_RequiredInterface_B_setPActivity.setName("setPActivity");
		Operation_RequiredInterface_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_B_setPActivity.addOwnedParameter(Operation_RequiredInterface_B_setPActivity_v);
		Operation_RequiredInterface_B_setPActivity.addNode(Operation_RequiredInterface_B_setPActivity_vParameterNode);
		Operation_RequiredInterface_B_setPActivity.addNode(Operation_RequiredInterface_B_setPActivity_Set_this_p);
		Operation_RequiredInterface_B_setPActivity.addNode(Operation_RequiredInterface_B_setPActivity_this);
		Operation_RequiredInterface_B_setPActivity.addEdge(Operation_RequiredInterface_B_setPActivity_ObjectFlow81);
		Operation_RequiredInterface_B_setPActivity.addEdge(Operation_RequiredInterface_B_setPActivity_ObjectFlow85);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode Operation_RequiredInterface_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", Operation_RequiredInterface_B_setPActivity_vParameterNode);
		Operation_RequiredInterface_B_setPActivity_vParameterNode.setName("vParameterNode");
		Operation_RequiredInterface_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_B_setPActivity_vParameterNode.setParameter(Operation_RequiredInterface_B_setPActivity_v);
		// ActivityParameterNode Operation_RequiredInterface_C_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", Operation_RequiredInterface_C_setPActivity_vParameterNode);
		Operation_RequiredInterface_C_setPActivity_vParameterNode.setName("vParameterNode");
		Operation_RequiredInterface_C_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_C_setPActivity_vParameterNode.setParameter(Operation_RequiredInterface_C_setPActivity_v);
		// ActivityParameterNode Operation_RequiredInterface_A_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", Operation_RequiredInterface_A_setPActivity_vParameterNode);
		Operation_RequiredInterface_A_setPActivity_vParameterNode.setName("vParameterNode");
		Operation_RequiredInterface_A_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_A_setPActivity_vParameterNode.setParameter(Operation_RequiredInterface_A_setPActivity_v);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction Operation_RequiredInterface_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", Operation_RequiredInterface_B_setPActivity_Set_this_p);
		Operation_RequiredInterface_B_setPActivity_Set_this_p.setName("Set this.p");
		Operation_RequiredInterface_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_Set_this_p.setStructuralFeature(Operation_RequiredInterface_B_p);
		Operation_RequiredInterface_B_setPActivity_Set_this_p.setObject(Operation_RequiredInterface_B_setPActivity_Set_this_p_object);
		Operation_RequiredInterface_B_setPActivity_Set_this_p.setValue(Operation_RequiredInterface_B_setPActivity_Set_this_p_value);
		Operation_RequiredInterface_B_setPActivity_Set_this_p.setResult(Operation_RequiredInterface_B_setPActivity_Set_this_p_result);
		Operation_RequiredInterface_B_setPActivity_Set_this_p.setIsReplaceAll(true);
	}

	private void initializeAssociation_Instances()
	{
		// Association Operation_RequiredInterface::S
		addToElementRepository("S", Operation_RequiredInterface_S);
		Operation_RequiredInterface_S.setName("S");
		Operation_RequiredInterface_S.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_S.addOwnedEnd(Operation_RequiredInterface_S_x);
		Operation_RequiredInterface_S.addOwnedEnd(Operation_RequiredInterface_S_y);
		// Association Operation_RequiredInterface::R
		addToElementRepository("R", Operation_RequiredInterface_R);
		Operation_RequiredInterface_R.setName("R");
		Operation_RequiredInterface_R.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_R.addOwnedEnd(Operation_RequiredInterface_R_x);
		Operation_RequiredInterface_R.addOwnedEnd(Operation_RequiredInterface_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction Operation_RequiredInterface_main::Call testP
		addToElementRepository("Call testP", Operation_RequiredInterface_main_Call_testP);
		Operation_RequiredInterface_main_Call_testP.setName("Call testP");
		Operation_RequiredInterface_main_Call_testP.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_testP.setBehavior(Operation_RequiredInterface_main_testP);
		Operation_RequiredInterface_main_Call_testP.addArgument(Operation_RequiredInterface_main_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction Operation_RequiredInterface_main::D()
		addToElementRepository("D()", Operation_RequiredInterface_main_D_);
		Operation_RequiredInterface_main_D_.setName("D()");
		Operation_RequiredInterface_main_D_.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_D_.addResult(Operation_RequiredInterface_main_D__result);
		Operation_RequiredInterface_main_D_.setOperation(Operation_RequiredInterface_D_D_D);
		Operation_RequiredInterface_main_D_.setTarget(Operation_RequiredInterface_main_D__target);
		// CallOperationAction Operation_RequiredInterface_main::Call setP()
		addToElementRepository("Call setP()", Operation_RequiredInterface_main_Call_setP_);
		Operation_RequiredInterface_main_Call_setP_.setName("Call setP()");
		Operation_RequiredInterface_main_Call_setP_.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_setP_.setOperation(Operation_RequiredInterface_C_setP_Integer);
		Operation_RequiredInterface_main_Call_setP_.setTarget(Operation_RequiredInterface_main_Call_setP__target);
		Operation_RequiredInterface_main_Call_setP_.addArgument(Operation_RequiredInterface_main_Call_setP__v);
		// CallOperationAction Operation_RequiredInterface_A_setPActivity::Call I::setP on q
		addToElementRepository("Call I::setP on q", Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q.setName("Call I::setP on q");
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q.setOnPort(Operation_RequiredInterface_A_q);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q.setOperation(Operation_RequiredInterface_I_setP_Integer);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q.setTarget(Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q.addArgument(Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v);
		// CallOperationAction Operation_RequiredInterface_C_setPActivity::Call I::setP on q
		addToElementRepository("Call I::setP on q", Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q.setName("Call I::setP on q");
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q.setOnPort(Operation_RequiredInterface_C_q);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q.setOperation(Operation_RequiredInterface_I_setP_Integer);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q.setTarget(Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q.addArgument(Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v);
	}

	private void initializeClass_Instances()
	{
		// Class Operation_RequiredInterface::C
		addToElementRepository("C", Operation_RequiredInterface_C);
		Operation_RequiredInterface_C.setName("C");
		Operation_RequiredInterface_C.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_C.addOwnedAttribute(Operation_RequiredInterface_C_q);
		Operation_RequiredInterface_C.addOwnedBehavior(Operation_RequiredInterface_C_setPActivity);
		Operation_RequiredInterface_C.addInterfaceRealization(Operation_RequiredInterface_C_IRealization);
		
		Operation_RequiredInterface_C.addOwnedOperation(Operation_RequiredInterface_C_setP_Integer);
		// Class Operation_RequiredInterface::D
		addToElementRepository("D", Operation_RequiredInterface_D);
		Operation_RequiredInterface_D.setName("D");
		Operation_RequiredInterface_D.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_D.addOwnedAttribute(Operation_RequiredInterface_D_c);
		Operation_RequiredInterface_D.addOwnedAttribute(Operation_RequiredInterface_D_a);
		
		Operation_RequiredInterface_D.addOwnedConnector(Operation_RequiredInterface_D_s);
		Operation_RequiredInterface_D.addOwnedOperation(Operation_RequiredInterface_D_D_D);
		// Class Operation_RequiredInterface::IImpl
		addToElementRepository("IImpl", Operation_RequiredInterface_IImpl);
		Operation_RequiredInterface_IImpl.setName("IImpl");
		Operation_RequiredInterface_IImpl.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_IImpl.addInterfaceRealization(Operation_RequiredInterface_IImpl_IRealization);
		
		Operation_RequiredInterface_IImpl.addOwnedOperation(Operation_RequiredInterface_IImpl_setP_Integer);
		// Class Operation_RequiredInterface::B
		addToElementRepository("B", Operation_RequiredInterface_B);
		Operation_RequiredInterface_B.setName("B");
		Operation_RequiredInterface_B.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_B.addOwnedAttribute(Operation_RequiredInterface_B_p);
		Operation_RequiredInterface_B.addOwnedBehavior(Operation_RequiredInterface_B_setPActivity);
		Operation_RequiredInterface_B.addInterfaceRealization(Operation_RequiredInterface_B_IRealization);
		
		Operation_RequiredInterface_B.addOwnedOperation(Operation_RequiredInterface_B_setP_Integer);
		// Class Operation_RequiredInterface::A
		addToElementRepository("A", Operation_RequiredInterface_A);
		Operation_RequiredInterface_A.setName("A");
		Operation_RequiredInterface_A.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_A.addOwnedAttribute(Operation_RequiredInterface_A_q);
		Operation_RequiredInterface_A.addOwnedAttribute(Operation_RequiredInterface_A_b);
		Operation_RequiredInterface_A.addOwnedBehavior(Operation_RequiredInterface_A_setPActivity);
		Operation_RequiredInterface_A.addOwnedConnector(Operation_RequiredInterface_A_r);
		Operation_RequiredInterface_A.addOwnedOperation(Operation_RequiredInterface_A_setP_Integer);
	}

	private void initializeComment_Instances()
	{
		// Comment Operation_RequiredInterface::Comment0
		addToElementRepository("Comment0", Operation_RequiredInterface_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment Operation_RequiredInterface::Comment16
		addToElementRepository("Comment16", Operation_RequiredInterface_Comment16);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector Operation_RequiredInterface_A::r
		addToElementRepository("r", Operation_RequiredInterface_A_r);
		Operation_RequiredInterface_A_r.setName("r");
		Operation_RequiredInterface_A_r.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_r.addEnd(Operation_RequiredInterface_A_r_ConnectorEnd96);
		Operation_RequiredInterface_A_r.addEnd(Operation_RequiredInterface_A_r_ConnectorEnd97);
		Operation_RequiredInterface_A_r.setType(Operation_RequiredInterface_R);
		// Connector Operation_RequiredInterface_D::s
		addToElementRepository("s", Operation_RequiredInterface_D_s);
		Operation_RequiredInterface_D_s.setName("s");
		Operation_RequiredInterface_D_s.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_D_s.addEnd(Operation_RequiredInterface_D_s_ConnectorEnd18);
		Operation_RequiredInterface_D_s.addEnd(Operation_RequiredInterface_D_s_ConnectorEnd17);
		Operation_RequiredInterface_D_s.setType(Operation_RequiredInterface_S);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd Operation_RequiredInterface_A_r::ConnectorEnd96
		addToElementRepository("ConnectorEnd96", Operation_RequiredInterface_A_r_ConnectorEnd96);
		Operation_RequiredInterface_A_r_ConnectorEnd96.setRole(Operation_RequiredInterface_A_q);
		// ConnectorEnd Operation_RequiredInterface_D_s::ConnectorEnd17
		addToElementRepository("ConnectorEnd17", Operation_RequiredInterface_D_s_ConnectorEnd17);
		Operation_RequiredInterface_D_s_ConnectorEnd17.setRole(Operation_RequiredInterface_A_q);
		Operation_RequiredInterface_D_s_ConnectorEnd17.setPartWithPort(Operation_RequiredInterface_D_a);
		// ConnectorEnd Operation_RequiredInterface_A_r::ConnectorEnd97
		addToElementRepository("ConnectorEnd97", Operation_RequiredInterface_A_r_ConnectorEnd97);
		Operation_RequiredInterface_A_r_ConnectorEnd97.setRole(Operation_RequiredInterface_A_b);
		// ConnectorEnd Operation_RequiredInterface_D_s::ConnectorEnd18
		addToElementRepository("ConnectorEnd18", Operation_RequiredInterface_D_s_ConnectorEnd18);
		Operation_RequiredInterface_D_s_ConnectorEnd18.setRole(Operation_RequiredInterface_C_q);
		Operation_RequiredInterface_D_s_ConnectorEnd18.setPartWithPort(Operation_RequiredInterface_D_c);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow Operation_RequiredInterface_main::ControlFlow46
		addToElementRepository("ControlFlow46", Operation_RequiredInterface_main_ControlFlow46);
		Operation_RequiredInterface_main_ControlFlow46.setName("ControlFlow46");
		Operation_RequiredInterface_main_ControlFlow46.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_ControlFlow46.setSource(Operation_RequiredInterface_main_Call_setP_);
		Operation_RequiredInterface_main_ControlFlow46.setTarget(Operation_RequiredInterface_main_Read_d_a);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction Operation_RequiredInterface_main::Create D
		addToElementRepository("Create D", Operation_RequiredInterface_main_Create_D);
		Operation_RequiredInterface_main_Create_D.setName("Create D");
		Operation_RequiredInterface_main_Create_D.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Create_D.setClassifier(Operation_RequiredInterface_D);
		Operation_RequiredInterface_main_Create_D.setResult(Operation_RequiredInterface_main_Create_D_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode Operation_RequiredInterface_main::Fork d
		addToElementRepository("Fork d", Operation_RequiredInterface_main_Fork_d);
		Operation_RequiredInterface_main_Fork_d.setName("Fork d");
		Operation_RequiredInterface_main_Fork_d.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior Operation_RequiredInterface_main::testP
		addToElementRepository("testP", Operation_RequiredInterface_main_testP);
		Operation_RequiredInterface_main_testP.setName("testP");
		Operation_RequiredInterface_main_testP.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_testP.addOwnedParameter(Operation_RequiredInterface_main_testP_p);
		Operation_RequiredInterface_main_testP.addLanguage("Java");
		Operation_RequiredInterface_main_testP.addLanguage("Import");
		Operation_RequiredInterface_main_testP.addBody("System.out.println(\"Asserting d.a.b.p == 4\");  	// Test parameter p 	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument p = \" + p); 	 	System.out.println(\"d.a.b.p == \" + p); 	System.out.print(\"Invocation forwarded out of c through q: \");  	if(p == 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		Operation_RequiredInterface_main_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin Operation_RequiredInterface_C_setPActivity_Call I::setP on q::target
		addToElementRepository("target", Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target.setName("target");
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target.setType(Operation_RequiredInterface_C);
		// InputPin Operation_RequiredInterface_A_setPActivity_Call I::setP on q::v
		addToElementRepository("v", Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v.setName("v");
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_RequiredInterface_main_Call testP::p
		addToElementRepository("p", Operation_RequiredInterface_main_Call_testP_p);
		Operation_RequiredInterface_main_Call_testP_p.setName("p");
		Operation_RequiredInterface_main_Call_testP_p.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_RequiredInterface_main_Read a.b::object
		addToElementRepository("object", Operation_RequiredInterface_main_Read_a_b_object);
		Operation_RequiredInterface_main_Read_a_b_object.setName("object");
		Operation_RequiredInterface_main_Read_a_b_object.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_a_b_object.setType(Operation_RequiredInterface_A);
		// InputPin Operation_RequiredInterface_main_Read b.p::object
		addToElementRepository("object", Operation_RequiredInterface_main_Read_b_p_object);
		Operation_RequiredInterface_main_Read_b_p_object.setName("object");
		Operation_RequiredInterface_main_Read_b_p_object.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_b_p_object.setType(Operation_RequiredInterface_B);
		// InputPin Operation_RequiredInterface_main_D()::target
		addToElementRepository("target", Operation_RequiredInterface_main_D__target);
		Operation_RequiredInterface_main_D__target.setName("target");
		Operation_RequiredInterface_main_D__target.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_D__target.setType(Operation_RequiredInterface_D);
		// InputPin Operation_RequiredInterface_main_Read d.a::object
		addToElementRepository("object", Operation_RequiredInterface_main_Read_d_a_object);
		Operation_RequiredInterface_main_Read_d_a_object.setName("object");
		Operation_RequiredInterface_main_Read_d_a_object.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_a_object.setType(Operation_RequiredInterface_D);
		// InputPin Operation_RequiredInterface_main_Read d.c::object
		addToElementRepository("object", Operation_RequiredInterface_main_Read_d_c_object);
		Operation_RequiredInterface_main_Read_d_c_object.setName("object");
		Operation_RequiredInterface_main_Read_d_c_object.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_c_object.setType(Operation_RequiredInterface_D);
		// InputPin Operation_RequiredInterface_C_setPActivity_Call I::setP on q::v
		addToElementRepository("v", Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v.setName("v");
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_RequiredInterface_main_Call setP()::target
		addToElementRepository("target", Operation_RequiredInterface_main_Call_setP__target);
		Operation_RequiredInterface_main_Call_setP__target.setName("target");
		Operation_RequiredInterface_main_Call_setP__target.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_setP__target.setType(Operation_RequiredInterface_C);
		// InputPin Operation_RequiredInterface_A_setPActivity_Call I::setP on q::target
		addToElementRepository("target", Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target.setName("target");
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target.setVisibility(VisibilityKind.public_);
		// InputPin Operation_RequiredInterface_main_Call setP()::v
		addToElementRepository("v", Operation_RequiredInterface_main_Call_setP__v);
		Operation_RequiredInterface_main_Call_setP__v.setName("v");
		Operation_RequiredInterface_main_Call_setP__v.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_setP__v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_RequiredInterface_B_setPActivity_Set this.p::value
		addToElementRepository("value", Operation_RequiredInterface_B_setPActivity_Set_this_p_value);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_value.setName("value");
		Operation_RequiredInterface_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_RequiredInterface_B_setPActivity_Set this.p::object
		addToElementRepository("object", Operation_RequiredInterface_B_setPActivity_Set_this_p_object);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_object.setName("object");
		Operation_RequiredInterface_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_object.setType(Operation_RequiredInterface_B);
	}

	private void initializeInterface_Instances()
	{
		// Interface Operation_RequiredInterface::I
		addToElementRepository("I", Operation_RequiredInterface_I);
		Operation_RequiredInterface_I.setName("I");
		Operation_RequiredInterface_I.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_I.addOwnedOperation(Operation_RequiredInterface_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization Operation_RequiredInterface_IImpl::IRealization
		addToElementRepository("IRealization", Operation_RequiredInterface_IImpl_IRealization);
		Operation_RequiredInterface_IImpl_IRealization.setName("IRealization");
		Operation_RequiredInterface_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_IImpl_IRealization.setContract(Operation_RequiredInterface_I);
		// InterfaceRealization Operation_RequiredInterface_C::IRealization
		addToElementRepository("IRealization", Operation_RequiredInterface_C_IRealization);
		Operation_RequiredInterface_C_IRealization.setName("IRealization");
		Operation_RequiredInterface_C_IRealization.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_IRealization.setContract(Operation_RequiredInterface_I);
		// InterfaceRealization Operation_RequiredInterface_B::IRealization
		addToElementRepository("IRealization", Operation_RequiredInterface_B_IRealization);
		Operation_RequiredInterface_B_IRealization.setName("IRealization");
		Operation_RequiredInterface_B_IRealization.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_IRealization.setContract(Operation_RequiredInterface_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean Operation_RequiredInterface_main_ObjectFlow75::LiteralBoolean76
		addToElementRepository("LiteralBoolean76", Operation_RequiredInterface_main_ObjectFlow75_LiteralBoolean76);
		Operation_RequiredInterface_main_ObjectFlow75_LiteralBoolean76.setName("LiteralBoolean76");
		Operation_RequiredInterface_main_ObjectFlow75_LiteralBoolean76.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow75_LiteralBoolean76.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_main_ObjectFlow72::LiteralBoolean74
		addToElementRepository("LiteralBoolean74", Operation_RequiredInterface_main_ObjectFlow72_LiteralBoolean74);
		Operation_RequiredInterface_main_ObjectFlow72_LiteralBoolean74.setName("LiteralBoolean74");
		Operation_RequiredInterface_main_ObjectFlow72_LiteralBoolean74.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow72_LiteralBoolean74.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_main_ObjectFlow23::LiteralBoolean24
		addToElementRepository("LiteralBoolean24", Operation_RequiredInterface_main_ObjectFlow23_LiteralBoolean24);
		Operation_RequiredInterface_main_ObjectFlow23_LiteralBoolean24.setName("LiteralBoolean24");
		Operation_RequiredInterface_main_ObjectFlow23_LiteralBoolean24.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow23_LiteralBoolean24.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_B_setPActivity_ObjectFlow85::LiteralBoolean86
		addToElementRepository("LiteralBoolean86", Operation_RequiredInterface_B_setPActivity_ObjectFlow85_LiteralBoolean86);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow85_LiteralBoolean86.setName("LiteralBoolean86");
		Operation_RequiredInterface_B_setPActivity_ObjectFlow85_LiteralBoolean86.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow85_LiteralBoolean86.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_B_setPActivity_ObjectFlow81::LiteralBoolean83
		addToElementRepository("LiteralBoolean83", Operation_RequiredInterface_B_setPActivity_ObjectFlow81_LiteralBoolean83);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow81_LiteralBoolean83.setName("LiteralBoolean83");
		Operation_RequiredInterface_B_setPActivity_ObjectFlow81_LiteralBoolean83.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow81_LiteralBoolean83.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_C_setPActivity_ObjectFlow6::LiteralBoolean8
		addToElementRepository("LiteralBoolean8", Operation_RequiredInterface_C_setPActivity_ObjectFlow6_LiteralBoolean8);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow6_LiteralBoolean8.setName("LiteralBoolean8");
		Operation_RequiredInterface_C_setPActivity_ObjectFlow6_LiteralBoolean8.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow6_LiteralBoolean8.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_A_setPActivity_ObjectFlow103::LiteralBoolean104
		addToElementRepository("LiteralBoolean104", Operation_RequiredInterface_A_setPActivity_ObjectFlow103_LiteralBoolean104);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow103_LiteralBoolean104.setName("LiteralBoolean104");
		Operation_RequiredInterface_A_setPActivity_ObjectFlow103_LiteralBoolean104.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow103_LiteralBoolean104.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_C_setPActivity_ObjectFlow3::LiteralBoolean5
		addToElementRepository("LiteralBoolean5", Operation_RequiredInterface_C_setPActivity_ObjectFlow3_LiteralBoolean5);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow3_LiteralBoolean5.setName("LiteralBoolean5");
		Operation_RequiredInterface_C_setPActivity_ObjectFlow3_LiteralBoolean5.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow3_LiteralBoolean5.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_main_ObjectFlow26::LiteralBoolean28
		addToElementRepository("LiteralBoolean28", Operation_RequiredInterface_main_ObjectFlow26_LiteralBoolean28);
		Operation_RequiredInterface_main_ObjectFlow26_LiteralBoolean28.setName("LiteralBoolean28");
		Operation_RequiredInterface_main_ObjectFlow26_LiteralBoolean28.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow26_LiteralBoolean28.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_main_ObjectFlow69::LiteralBoolean70
		addToElementRepository("LiteralBoolean70", Operation_RequiredInterface_main_ObjectFlow69_LiteralBoolean70);
		Operation_RequiredInterface_main_ObjectFlow69_LiteralBoolean70.setName("LiteralBoolean70");
		Operation_RequiredInterface_main_ObjectFlow69_LiteralBoolean70.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow69_LiteralBoolean70.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_main_ObjectFlow50::LiteralBoolean51
		addToElementRepository("LiteralBoolean51", Operation_RequiredInterface_main_ObjectFlow50_LiteralBoolean51);
		Operation_RequiredInterface_main_ObjectFlow50_LiteralBoolean51.setName("LiteralBoolean51");
		Operation_RequiredInterface_main_ObjectFlow50_LiteralBoolean51.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow50_LiteralBoolean51.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_main_ObjectFlow40::LiteralBoolean41
		addToElementRepository("LiteralBoolean41", Operation_RequiredInterface_main_ObjectFlow40_LiteralBoolean41);
		Operation_RequiredInterface_main_ObjectFlow40_LiteralBoolean41.setName("LiteralBoolean41");
		Operation_RequiredInterface_main_ObjectFlow40_LiteralBoolean41.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow40_LiteralBoolean41.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_A_setPActivity_ObjectFlow98::LiteralBoolean100
		addToElementRepository("LiteralBoolean100", Operation_RequiredInterface_A_setPActivity_ObjectFlow98_LiteralBoolean100);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow98_LiteralBoolean100.setName("LiteralBoolean100");
		Operation_RequiredInterface_A_setPActivity_ObjectFlow98_LiteralBoolean100.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow98_LiteralBoolean100.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_main_ObjectFlow29::LiteralBoolean31
		addToElementRepository("LiteralBoolean31", Operation_RequiredInterface_main_ObjectFlow29_LiteralBoolean31);
		Operation_RequiredInterface_main_ObjectFlow29_LiteralBoolean31.setName("LiteralBoolean31");
		Operation_RequiredInterface_main_ObjectFlow29_LiteralBoolean31.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow29_LiteralBoolean31.setValue(true);
		// LiteralBoolean Operation_RequiredInterface_main_ObjectFlow47::LiteralBoolean48
		addToElementRepository("LiteralBoolean48", Operation_RequiredInterface_main_ObjectFlow47_LiteralBoolean48);
		Operation_RequiredInterface_main_ObjectFlow47_LiteralBoolean48.setName("LiteralBoolean48");
		Operation_RequiredInterface_main_ObjectFlow47_LiteralBoolean48.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow47_LiteralBoolean48.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger Operation_RequiredInterface_main_ObjectFlow72::LiteralInteger73
		addToElementRepository("LiteralInteger73", Operation_RequiredInterface_main_ObjectFlow72_LiteralInteger73);
		Operation_RequiredInterface_main_ObjectFlow72_LiteralInteger73.setName("LiteralInteger73");
		Operation_RequiredInterface_main_ObjectFlow72_LiteralInteger73.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow72_LiteralInteger73.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Read d.a_object::LiteralInteger38
		addToElementRepository("LiteralInteger38", Operation_RequiredInterface_main_Read_d_a_object_LiteralInteger38);
		Operation_RequiredInterface_main_Read_d_a_object_LiteralInteger38.setName("LiteralInteger38");
		Operation_RequiredInterface_main_Read_d_a_object_LiteralInteger38.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_a_object_LiteralInteger38.setValue(1);
		// LiteralInteger Operation_RequiredInterface_C_setPActivity_Call I::setP on q_target::LiteralInteger14
		addToElementRepository("LiteralInteger14", Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger14);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger14.setName("LiteralInteger14");
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger14.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralInteger14.setValue(1);
		// LiteralInteger Operation_RequiredInterface_B_setPActivity_Set this.p_value::LiteralInteger88
		addToElementRepository("LiteralInteger88", Operation_RequiredInterface_B_setPActivity_Set_this_p_value_LiteralInteger88);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_value_LiteralInteger88.setName("LiteralInteger88");
		Operation_RequiredInterface_B_setPActivity_Set_this_p_value_LiteralInteger88.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_value_LiteralInteger88.setValue(1);
		// LiteralInteger Operation_RequiredInterface_A_setPActivity_ObjectFlow98::LiteralInteger99
		addToElementRepository("LiteralInteger99", Operation_RequiredInterface_A_setPActivity_ObjectFlow98_LiteralInteger99);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow98_LiteralInteger99.setName("LiteralInteger99");
		Operation_RequiredInterface_A_setPActivity_ObjectFlow98_LiteralInteger99.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow98_LiteralInteger99.setValue(1);
		// LiteralInteger Operation_RequiredInterface_C_setPActivity_ObjectFlow3::LiteralInteger4
		addToElementRepository("LiteralInteger4", Operation_RequiredInterface_C_setPActivity_ObjectFlow3_LiteralInteger4);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow3_LiteralInteger4.setName("LiteralInteger4");
		Operation_RequiredInterface_C_setPActivity_ObjectFlow3_LiteralInteger4.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow3_LiteralInteger4.setValue(1);
		// LiteralInteger Operation_RequiredInterface_C_setPActivity_Call I::setP on q_v::LiteralInteger12
		addToElementRepository("LiteralInteger12", Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger12);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger12.setName("LiteralInteger12");
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger12.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger12.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_ObjectFlow40::LiteralInteger42
		addToElementRepository("LiteralInteger42", Operation_RequiredInterface_main_ObjectFlow40_LiteralInteger42);
		Operation_RequiredInterface_main_ObjectFlow40_LiteralInteger42.setName("LiteralInteger42");
		Operation_RequiredInterface_main_ObjectFlow40_LiteralInteger42.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow40_LiteralInteger42.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_ObjectFlow75::LiteralInteger77
		addToElementRepository("LiteralInteger77", Operation_RequiredInterface_main_ObjectFlow75_LiteralInteger77);
		Operation_RequiredInterface_main_ObjectFlow75_LiteralInteger77.setName("LiteralInteger77");
		Operation_RequiredInterface_main_ObjectFlow75_LiteralInteger77.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow75_LiteralInteger77.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_ObjectFlow50::LiteralInteger52
		addToElementRepository("LiteralInteger52", Operation_RequiredInterface_main_ObjectFlow50_LiteralInteger52);
		Operation_RequiredInterface_main_ObjectFlow50_LiteralInteger52.setName("LiteralInteger52");
		Operation_RequiredInterface_main_ObjectFlow50_LiteralInteger52.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow50_LiteralInteger52.setValue(1);
		// LiteralInteger Operation_RequiredInterface_C_setPActivity_Call I::setP on q_v::LiteralInteger11
		addToElementRepository("LiteralInteger11", Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger11);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger11.setName("LiteralInteger11");
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger11.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralInteger11.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Call setP()_target::LiteralInteger64
		addToElementRepository("LiteralInteger64", Operation_RequiredInterface_main_Call_setP__target_LiteralInteger64);
		Operation_RequiredInterface_main_Call_setP__target_LiteralInteger64.setName("LiteralInteger64");
		Operation_RequiredInterface_main_Call_setP__target_LiteralInteger64.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_setP__target_LiteralInteger64.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Read a.b_result::LiteralInteger33
		addToElementRepository("LiteralInteger33", Operation_RequiredInterface_main_Read_a_b_result_LiteralInteger33);
		Operation_RequiredInterface_main_Read_a_b_result_LiteralInteger33.setName("LiteralInteger33");
		Operation_RequiredInterface_main_Read_a_b_result_LiteralInteger33.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_a_b_result_LiteralInteger33.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_D()_target::LiteralInteger57
		addToElementRepository("LiteralInteger57", Operation_RequiredInterface_main_D__target_LiteralInteger57);
		Operation_RequiredInterface_main_D__target_LiteralInteger57.setName("LiteralInteger57");
		Operation_RequiredInterface_main_D__target_LiteralInteger57.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_D__target_LiteralInteger57.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Value(4)::LiteralInteger45
		addToElementRepository("LiteralInteger45", Operation_RequiredInterface_main_Value_4_LiteralInteger45);
		Operation_RequiredInterface_main_Value_4_LiteralInteger45.setName("LiteralInteger45");
		Operation_RequiredInterface_main_Value_4_LiteralInteger45.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Value_4_LiteralInteger45.setValue(4);
		// LiteralInteger Operation_RequiredInterface_main_ObjectFlow69::LiteralInteger71
		addToElementRepository("LiteralInteger71", Operation_RequiredInterface_main_ObjectFlow69_LiteralInteger71);
		Operation_RequiredInterface_main_ObjectFlow69_LiteralInteger71.setName("LiteralInteger71");
		Operation_RequiredInterface_main_ObjectFlow69_LiteralInteger71.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow69_LiteralInteger71.setValue(1);
		// LiteralInteger Operation_RequiredInterface_B_setPActivity_ObjectFlow81::LiteralInteger82
		addToElementRepository("LiteralInteger82", Operation_RequiredInterface_B_setPActivity_ObjectFlow81_LiteralInteger82);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow81_LiteralInteger82.setName("LiteralInteger82");
		Operation_RequiredInterface_B_setPActivity_ObjectFlow81_LiteralInteger82.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow81_LiteralInteger82.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Read b.p_object::LiteralInteger59
		addToElementRepository("LiteralInteger59", Operation_RequiredInterface_main_Read_b_p_object_LiteralInteger59);
		Operation_RequiredInterface_main_Read_b_p_object_LiteralInteger59.setName("LiteralInteger59");
		Operation_RequiredInterface_main_Read_b_p_object_LiteralInteger59.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_b_p_object_LiteralInteger59.setValue(1);
		// LiteralInteger Operation_RequiredInterface_A_setPActivity_Call I::setP on q_v::LiteralInteger110
		addToElementRepository("LiteralInteger110", Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger110);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger110.setName("LiteralInteger110");
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger110.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger110.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Call setP()_v::LiteralInteger68
		addToElementRepository("LiteralInteger68", Operation_RequiredInterface_main_Call_setP__v_LiteralInteger68);
		Operation_RequiredInterface_main_Call_setP__v_LiteralInteger68.setName("LiteralInteger68");
		Operation_RequiredInterface_main_Call_setP__v_LiteralInteger68.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_setP__v_LiteralInteger68.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Call setP()_v::LiteralInteger66
		addToElementRepository("LiteralInteger66", Operation_RequiredInterface_main_Call_setP__v_LiteralInteger66);
		Operation_RequiredInterface_main_Call_setP__v_LiteralInteger66.setName("LiteralInteger66");
		Operation_RequiredInterface_main_Call_setP__v_LiteralInteger66.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_setP__v_LiteralInteger66.setValue(1);
		// LiteralInteger Operation_RequiredInterface_B_setPActivity_vParameterNode::LiteralInteger84
		addToElementRepository("LiteralInteger84", Operation_RequiredInterface_B_setPActivity_vParameterNode_LiteralInteger84);
		Operation_RequiredInterface_B_setPActivity_vParameterNode_LiteralInteger84.setName("LiteralInteger84");
		Operation_RequiredInterface_B_setPActivity_vParameterNode_LiteralInteger84.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_vParameterNode_LiteralInteger84.setValue(1);
		// LiteralInteger Operation_RequiredInterface_B_setPActivity_Set this.p_result::LiteralInteger92
		addToElementRepository("LiteralInteger92", Operation_RequiredInterface_B_setPActivity_Set_this_p_result_LiteralInteger92);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_result_LiteralInteger92.setName("LiteralInteger92");
		Operation_RequiredInterface_B_setPActivity_Set_this_p_result_LiteralInteger92.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_result_LiteralInteger92.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_ObjectFlow29::LiteralInteger30
		addToElementRepository("LiteralInteger30", Operation_RequiredInterface_main_ObjectFlow29_LiteralInteger30);
		Operation_RequiredInterface_main_ObjectFlow29_LiteralInteger30.setName("LiteralInteger30");
		Operation_RequiredInterface_main_ObjectFlow29_LiteralInteger30.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow29_LiteralInteger30.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_D()_result::LiteralInteger53
		addToElementRepository("LiteralInteger53", Operation_RequiredInterface_main_D__result_LiteralInteger53);
		Operation_RequiredInterface_main_D__result_LiteralInteger53.setName("LiteralInteger53");
		Operation_RequiredInterface_main_D__result_LiteralInteger53.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_D__result_LiteralInteger53.setValue(1);
		// LiteralInteger Operation_RequiredInterface_A_setPActivity_Call I::setP on q_target::LiteralInteger108
		addToElementRepository("LiteralInteger108", Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger108);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger108.setName("LiteralInteger108");
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger108.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger108.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Call testP_p::LiteralInteger78
		addToElementRepository("LiteralInteger78", Operation_RequiredInterface_main_Call_testP_p_LiteralInteger78);
		Operation_RequiredInterface_main_Call_testP_p_LiteralInteger78.setName("LiteralInteger78");
		Operation_RequiredInterface_main_Call_testP_p_LiteralInteger78.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_testP_p_LiteralInteger78.setValue(1);
		// LiteralInteger Operation_RequiredInterface_A_setPActivity_this_result::LiteralInteger101
		addToElementRepository("LiteralInteger101", Operation_RequiredInterface_A_setPActivity_this_result_LiteralInteger101);
		Operation_RequiredInterface_A_setPActivity_this_result_LiteralInteger101.setName("LiteralInteger101");
		Operation_RequiredInterface_A_setPActivity_this_result_LiteralInteger101.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_this_result_LiteralInteger101.setValue(1);
		// LiteralInteger Operation_RequiredInterface_A_setPActivity_vParameterNode::LiteralInteger106
		addToElementRepository("LiteralInteger106", Operation_RequiredInterface_A_setPActivity_vParameterNode_LiteralInteger106);
		Operation_RequiredInterface_A_setPActivity_vParameterNode_LiteralInteger106.setName("LiteralInteger106");
		Operation_RequiredInterface_A_setPActivity_vParameterNode_LiteralInteger106.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_vParameterNode_LiteralInteger106.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Read b.p_result::LiteralInteger61
		addToElementRepository("LiteralInteger61", Operation_RequiredInterface_main_Read_b_p_result_LiteralInteger61);
		Operation_RequiredInterface_main_Read_b_p_result_LiteralInteger61.setName("LiteralInteger61");
		Operation_RequiredInterface_main_Read_b_p_result_LiteralInteger61.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_b_p_result_LiteralInteger61.setValue(1);
		// LiteralInteger Operation_RequiredInterface_B_setPActivity_ObjectFlow85::LiteralInteger87
		addToElementRepository("LiteralInteger87", Operation_RequiredInterface_B_setPActivity_ObjectFlow85_LiteralInteger87);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow85_LiteralInteger87.setName("LiteralInteger87");
		Operation_RequiredInterface_B_setPActivity_ObjectFlow85_LiteralInteger87.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow85_LiteralInteger87.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Create D_result::LiteralInteger63
		addToElementRepository("LiteralInteger63", Operation_RequiredInterface_main_Create_D_result_LiteralInteger63);
		Operation_RequiredInterface_main_Create_D_result_LiteralInteger63.setName("LiteralInteger63");
		Operation_RequiredInterface_main_Create_D_result_LiteralInteger63.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Create_D_result_LiteralInteger63.setValue(1);
		// LiteralInteger Operation_RequiredInterface_C_setPActivity_this_result::LiteralInteger9
		addToElementRepository("LiteralInteger9", Operation_RequiredInterface_C_setPActivity_this_result_LiteralInteger9);
		Operation_RequiredInterface_C_setPActivity_this_result_LiteralInteger9.setName("LiteralInteger9");
		Operation_RequiredInterface_C_setPActivity_this_result_LiteralInteger9.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_this_result_LiteralInteger9.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Read d.c_result::LiteralInteger21
		addToElementRepository("LiteralInteger21", Operation_RequiredInterface_main_Read_d_c_result_LiteralInteger21);
		Operation_RequiredInterface_main_Read_d_c_result_LiteralInteger21.setName("LiteralInteger21");
		Operation_RequiredInterface_main_Read_d_c_result_LiteralInteger21.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_c_result_LiteralInteger21.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Call testP_p::LiteralInteger79
		addToElementRepository("LiteralInteger79", Operation_RequiredInterface_main_Call_testP_p_LiteralInteger79);
		Operation_RequiredInterface_main_Call_testP_p_LiteralInteger79.setName("LiteralInteger79");
		Operation_RequiredInterface_main_Call_testP_p_LiteralInteger79.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_testP_p_LiteralInteger79.setValue(1);
		// LiteralInteger Operation_RequiredInterface_B_setPActivity_this_result::LiteralInteger95
		addToElementRepository("LiteralInteger95", Operation_RequiredInterface_B_setPActivity_this_result_LiteralInteger95);
		Operation_RequiredInterface_B_setPActivity_this_result_LiteralInteger95.setName("LiteralInteger95");
		Operation_RequiredInterface_B_setPActivity_this_result_LiteralInteger95.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_this_result_LiteralInteger95.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_ObjectFlow23::LiteralInteger25
		addToElementRepository("LiteralInteger25", Operation_RequiredInterface_main_ObjectFlow23_LiteralInteger25);
		Operation_RequiredInterface_main_ObjectFlow23_LiteralInteger25.setName("LiteralInteger25");
		Operation_RequiredInterface_main_ObjectFlow23_LiteralInteger25.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow23_LiteralInteger25.setValue(1);
		// LiteralInteger Operation_RequiredInterface_A_setPActivity_ObjectFlow103::LiteralInteger105
		addToElementRepository("LiteralInteger105", Operation_RequiredInterface_A_setPActivity_ObjectFlow103_LiteralInteger105);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow103_LiteralInteger105.setName("LiteralInteger105");
		Operation_RequiredInterface_A_setPActivity_ObjectFlow103_LiteralInteger105.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow103_LiteralInteger105.setValue(1);
		// LiteralInteger Operation_RequiredInterface_A_setPActivity_Call I::setP on q_v::LiteralInteger111
		addToElementRepository("LiteralInteger111", Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger111);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger111.setName("LiteralInteger111");
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger111.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger111.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Read a.b_object::LiteralInteger35
		addToElementRepository("LiteralInteger35", Operation_RequiredInterface_main_Read_a_b_object_LiteralInteger35);
		Operation_RequiredInterface_main_Read_a_b_object_LiteralInteger35.setName("LiteralInteger35");
		Operation_RequiredInterface_main_Read_a_b_object_LiteralInteger35.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_a_b_object_LiteralInteger35.setValue(1);
		// LiteralInteger Operation_RequiredInterface_C_setPActivity_ObjectFlow6::LiteralInteger7
		addToElementRepository("LiteralInteger7", Operation_RequiredInterface_C_setPActivity_ObjectFlow6_LiteralInteger7);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow6_LiteralInteger7.setName("LiteralInteger7");
		Operation_RequiredInterface_C_setPActivity_ObjectFlow6_LiteralInteger7.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow6_LiteralInteger7.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Read d.a_result::LiteralInteger36
		addToElementRepository("LiteralInteger36", Operation_RequiredInterface_main_Read_d_a_result_LiteralInteger36);
		Operation_RequiredInterface_main_Read_d_a_result_LiteralInteger36.setName("LiteralInteger36");
		Operation_RequiredInterface_main_Read_d_a_result_LiteralInteger36.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_a_result_LiteralInteger36.setValue(1);
		// LiteralInteger Operation_RequiredInterface_B_setPActivity_Set this.p_object::LiteralInteger91
		addToElementRepository("LiteralInteger91", Operation_RequiredInterface_B_setPActivity_Set_this_p_object_LiteralInteger91);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_object_LiteralInteger91.setName("LiteralInteger91");
		Operation_RequiredInterface_B_setPActivity_Set_this_p_object_LiteralInteger91.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_object_LiteralInteger91.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Read d.c_object::LiteralInteger19
		addToElementRepository("LiteralInteger19", Operation_RequiredInterface_main_Read_d_c_object_LiteralInteger19);
		Operation_RequiredInterface_main_Read_d_c_object_LiteralInteger19.setName("LiteralInteger19");
		Operation_RequiredInterface_main_Read_d_c_object_LiteralInteger19.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_c_object_LiteralInteger19.setValue(1);
		// LiteralInteger Operation_RequiredInterface_C_setPActivity_vParameterNode::LiteralInteger2
		addToElementRepository("LiteralInteger2", Operation_RequiredInterface_C_setPActivity_vParameterNode_LiteralInteger2);
		Operation_RequiredInterface_C_setPActivity_vParameterNode_LiteralInteger2.setName("LiteralInteger2");
		Operation_RequiredInterface_C_setPActivity_vParameterNode_LiteralInteger2.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_vParameterNode_LiteralInteger2.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_ObjectFlow26::LiteralInteger27
		addToElementRepository("LiteralInteger27", Operation_RequiredInterface_main_ObjectFlow26_LiteralInteger27);
		Operation_RequiredInterface_main_ObjectFlow26_LiteralInteger27.setName("LiteralInteger27");
		Operation_RequiredInterface_main_ObjectFlow26_LiteralInteger27.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow26_LiteralInteger27.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_D()_result::LiteralInteger54
		addToElementRepository("LiteralInteger54", Operation_RequiredInterface_main_D__result_LiteralInteger54);
		Operation_RequiredInterface_main_D__result_LiteralInteger54.setName("LiteralInteger54");
		Operation_RequiredInterface_main_D__result_LiteralInteger54.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_D__result_LiteralInteger54.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_ObjectFlow47::LiteralInteger49
		addToElementRepository("LiteralInteger49", Operation_RequiredInterface_main_ObjectFlow47_LiteralInteger49);
		Operation_RequiredInterface_main_ObjectFlow47_LiteralInteger49.setName("LiteralInteger49");
		Operation_RequiredInterface_main_ObjectFlow47_LiteralInteger49.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_ObjectFlow47_LiteralInteger49.setValue(1);
		// LiteralInteger Operation_RequiredInterface_main_Value(4)_result::LiteralInteger44
		addToElementRepository("LiteralInteger44", Operation_RequiredInterface_main_Value_4_result_LiteralInteger44);
		Operation_RequiredInterface_main_Value_4_result_LiteralInteger44.setName("LiteralInteger44");
		Operation_RequiredInterface_main_Value_4_result_LiteralInteger44.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Value_4_result_LiteralInteger44.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Read d.a_object::LiteralUnlimitedNatural39
		addToElementRepository("LiteralUnlimitedNatural39", Operation_RequiredInterface_main_Read_d_a_object_LiteralUnlimitedNatural39);
		Operation_RequiredInterface_main_Read_d_a_object_LiteralUnlimitedNatural39.setName("LiteralUnlimitedNatural39");
		Operation_RequiredInterface_main_Read_d_a_object_LiteralUnlimitedNatural39.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_a_object_LiteralUnlimitedNatural39.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_A_setPActivity_Call I::setP on q_target::LiteralUnlimitedNatural107
		addToElementRepository("LiteralUnlimitedNatural107", Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural107);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural107.setName("LiteralUnlimitedNatural107");
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural107.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural107.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_B_setPActivity_this_result::LiteralUnlimitedNatural94
		addToElementRepository("LiteralUnlimitedNatural94", Operation_RequiredInterface_B_setPActivity_this_result_LiteralUnlimitedNatural94);
		Operation_RequiredInterface_B_setPActivity_this_result_LiteralUnlimitedNatural94.setName("LiteralUnlimitedNatural94");
		Operation_RequiredInterface_B_setPActivity_this_result_LiteralUnlimitedNatural94.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_this_result_LiteralUnlimitedNatural94.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Value(4)_result::LiteralUnlimitedNatural43
		addToElementRepository("LiteralUnlimitedNatural43", Operation_RequiredInterface_main_Value_4_result_LiteralUnlimitedNatural43);
		Operation_RequiredInterface_main_Value_4_result_LiteralUnlimitedNatural43.setName("LiteralUnlimitedNatural43");
		Operation_RequiredInterface_main_Value_4_result_LiteralUnlimitedNatural43.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Value_4_result_LiteralUnlimitedNatural43.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Call setP()_v::LiteralUnlimitedNatural67
		addToElementRepository("LiteralUnlimitedNatural67", Operation_RequiredInterface_main_Call_setP__v_LiteralUnlimitedNatural67);
		Operation_RequiredInterface_main_Call_setP__v_LiteralUnlimitedNatural67.setName("LiteralUnlimitedNatural67");
		Operation_RequiredInterface_main_Call_setP__v_LiteralUnlimitedNatural67.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_setP__v_LiteralUnlimitedNatural67.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Read d.a_result::LiteralUnlimitedNatural37
		addToElementRepository("LiteralUnlimitedNatural37", Operation_RequiredInterface_main_Read_d_a_result_LiteralUnlimitedNatural37);
		Operation_RequiredInterface_main_Read_d_a_result_LiteralUnlimitedNatural37.setName("LiteralUnlimitedNatural37");
		Operation_RequiredInterface_main_Read_d_a_result_LiteralUnlimitedNatural37.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_a_result_LiteralUnlimitedNatural37.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural89
		addToElementRepository("LiteralUnlimitedNatural89", Operation_RequiredInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural89);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural89.setName("LiteralUnlimitedNatural89");
		Operation_RequiredInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural89.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural89.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Read a.b_result::LiteralUnlimitedNatural32
		addToElementRepository("LiteralUnlimitedNatural32", Operation_RequiredInterface_main_Read_a_b_result_LiteralUnlimitedNatural32);
		Operation_RequiredInterface_main_Read_a_b_result_LiteralUnlimitedNatural32.setName("LiteralUnlimitedNatural32");
		Operation_RequiredInterface_main_Read_a_b_result_LiteralUnlimitedNatural32.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_a_b_result_LiteralUnlimitedNatural32.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural90
		addToElementRepository("LiteralUnlimitedNatural90", Operation_RequiredInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural90);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural90.setName("LiteralUnlimitedNatural90");
		Operation_RequiredInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural90.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural90.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Call setP()_target::LiteralUnlimitedNatural65
		addToElementRepository("LiteralUnlimitedNatural65", Operation_RequiredInterface_main_Call_setP__target_LiteralUnlimitedNatural65);
		Operation_RequiredInterface_main_Call_setP__target_LiteralUnlimitedNatural65.setName("LiteralUnlimitedNatural65");
		Operation_RequiredInterface_main_Call_setP__target_LiteralUnlimitedNatural65.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_setP__target_LiteralUnlimitedNatural65.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_A_setPActivity_Call I::setP on q_v::LiteralUnlimitedNatural109
		addToElementRepository("LiteralUnlimitedNatural109", Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural109);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural109.setName("LiteralUnlimitedNatural109");
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural109.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural109.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Read d.c_result::LiteralUnlimitedNatural22
		addToElementRepository("LiteralUnlimitedNatural22", Operation_RequiredInterface_main_Read_d_c_result_LiteralUnlimitedNatural22);
		Operation_RequiredInterface_main_Read_d_c_result_LiteralUnlimitedNatural22.setName("LiteralUnlimitedNatural22");
		Operation_RequiredInterface_main_Read_d_c_result_LiteralUnlimitedNatural22.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_c_result_LiteralUnlimitedNatural22.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_C_setPActivity_Call I::setP on q_target::LiteralUnlimitedNatural15
		addToElementRepository("LiteralUnlimitedNatural15", Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural15);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural15.setName("LiteralUnlimitedNatural15");
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural15.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural15.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_D()_result::LiteralUnlimitedNatural55
		addToElementRepository("LiteralUnlimitedNatural55", Operation_RequiredInterface_main_D__result_LiteralUnlimitedNatural55);
		Operation_RequiredInterface_main_D__result_LiteralUnlimitedNatural55.setName("LiteralUnlimitedNatural55");
		Operation_RequiredInterface_main_D__result_LiteralUnlimitedNatural55.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_D__result_LiteralUnlimitedNatural55.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_D()_target::LiteralUnlimitedNatural56
		addToElementRepository("LiteralUnlimitedNatural56", Operation_RequiredInterface_main_D__target_LiteralUnlimitedNatural56);
		Operation_RequiredInterface_main_D__target_LiteralUnlimitedNatural56.setName("LiteralUnlimitedNatural56");
		Operation_RequiredInterface_main_D__target_LiteralUnlimitedNatural56.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_D__target_LiteralUnlimitedNatural56.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Read b.p_result::LiteralUnlimitedNatural60
		addToElementRepository("LiteralUnlimitedNatural60", Operation_RequiredInterface_main_Read_b_p_result_LiteralUnlimitedNatural60);
		Operation_RequiredInterface_main_Read_b_p_result_LiteralUnlimitedNatural60.setName("LiteralUnlimitedNatural60");
		Operation_RequiredInterface_main_Read_b_p_result_LiteralUnlimitedNatural60.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_b_p_result_LiteralUnlimitedNatural60.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Create D_result::LiteralUnlimitedNatural62
		addToElementRepository("LiteralUnlimitedNatural62", Operation_RequiredInterface_main_Create_D_result_LiteralUnlimitedNatural62);
		Operation_RequiredInterface_main_Create_D_result_LiteralUnlimitedNatural62.setName("LiteralUnlimitedNatural62");
		Operation_RequiredInterface_main_Create_D_result_LiteralUnlimitedNatural62.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Create_D_result_LiteralUnlimitedNatural62.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_A_setPActivity_this_result::LiteralUnlimitedNatural102
		addToElementRepository("LiteralUnlimitedNatural102", Operation_RequiredInterface_A_setPActivity_this_result_LiteralUnlimitedNatural102);
		Operation_RequiredInterface_A_setPActivity_this_result_LiteralUnlimitedNatural102.setName("LiteralUnlimitedNatural102");
		Operation_RequiredInterface_A_setPActivity_this_result_LiteralUnlimitedNatural102.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_this_result_LiteralUnlimitedNatural102.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural93
		addToElementRepository("LiteralUnlimitedNatural93", Operation_RequiredInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural93);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural93.setName("LiteralUnlimitedNatural93");
		Operation_RequiredInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural93.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural93.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Read a.b_object::LiteralUnlimitedNatural34
		addToElementRepository("LiteralUnlimitedNatural34", Operation_RequiredInterface_main_Read_a_b_object_LiteralUnlimitedNatural34);
		Operation_RequiredInterface_main_Read_a_b_object_LiteralUnlimitedNatural34.setName("LiteralUnlimitedNatural34");
		Operation_RequiredInterface_main_Read_a_b_object_LiteralUnlimitedNatural34.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_a_b_object_LiteralUnlimitedNatural34.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Read b.p_object::LiteralUnlimitedNatural58
		addToElementRepository("LiteralUnlimitedNatural58", Operation_RequiredInterface_main_Read_b_p_object_LiteralUnlimitedNatural58);
		Operation_RequiredInterface_main_Read_b_p_object_LiteralUnlimitedNatural58.setName("LiteralUnlimitedNatural58");
		Operation_RequiredInterface_main_Read_b_p_object_LiteralUnlimitedNatural58.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_b_p_object_LiteralUnlimitedNatural58.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_C_setPActivity_this_result::LiteralUnlimitedNatural10
		addToElementRepository("LiteralUnlimitedNatural10", Operation_RequiredInterface_C_setPActivity_this_result_LiteralUnlimitedNatural10);
		Operation_RequiredInterface_C_setPActivity_this_result_LiteralUnlimitedNatural10.setName("LiteralUnlimitedNatural10");
		Operation_RequiredInterface_C_setPActivity_this_result_LiteralUnlimitedNatural10.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_this_result_LiteralUnlimitedNatural10.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_C_setPActivity_Call I::setP on q_v::LiteralUnlimitedNatural13
		addToElementRepository("LiteralUnlimitedNatural13", Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural13);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural13.setName("LiteralUnlimitedNatural13");
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural13.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural13.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Read d.c_object::LiteralUnlimitedNatural20
		addToElementRepository("LiteralUnlimitedNatural20", Operation_RequiredInterface_main_Read_d_c_object_LiteralUnlimitedNatural20);
		Operation_RequiredInterface_main_Read_d_c_object_LiteralUnlimitedNatural20.setName("LiteralUnlimitedNatural20");
		Operation_RequiredInterface_main_Read_d_c_object_LiteralUnlimitedNatural20.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_c_object_LiteralUnlimitedNatural20.setValue(1);
		// LiteralUnlimitedNatural Operation_RequiredInterface_main_Call testP_p::LiteralUnlimitedNatural80
		addToElementRepository("LiteralUnlimitedNatural80", Operation_RequiredInterface_main_Call_testP_p_LiteralUnlimitedNatural80);
		Operation_RequiredInterface_main_Call_testP_p_LiteralUnlimitedNatural80.setName("LiteralUnlimitedNatural80");
		Operation_RequiredInterface_main_Call_testP_p_LiteralUnlimitedNatural80.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Call_testP_p_LiteralUnlimitedNatural80.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow Operation_RequiredInterface_B_setPActivity::ObjectFlow81
		addToElementRepository("ObjectFlow81", Operation_RequiredInterface_B_setPActivity_ObjectFlow81);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow81.setName("ObjectFlow81");
		Operation_RequiredInterface_B_setPActivity_ObjectFlow81.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_B_setPActivity_ObjectFlow81.setSource(Operation_RequiredInterface_B_setPActivity_vParameterNode);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow81.setTarget(Operation_RequiredInterface_B_setPActivity_Set_this_p_value);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow81.setGuard(Operation_RequiredInterface_B_setPActivity_ObjectFlow81_LiteralBoolean83);
		// ObjectFlow Operation_RequiredInterface_main::ObjectFlow23
		addToElementRepository("ObjectFlow23", Operation_RequiredInterface_main_ObjectFlow23);
		Operation_RequiredInterface_main_ObjectFlow23.setName("ObjectFlow23");
		Operation_RequiredInterface_main_ObjectFlow23.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_ObjectFlow23.setSource(Operation_RequiredInterface_main_Create_D_result);
		Operation_RequiredInterface_main_ObjectFlow23.setTarget(Operation_RequiredInterface_main_D__target);
		Operation_RequiredInterface_main_ObjectFlow23.setGuard(Operation_RequiredInterface_main_ObjectFlow23_LiteralBoolean24);
		// ObjectFlow Operation_RequiredInterface_main::ObjectFlow26
		addToElementRepository("ObjectFlow26", Operation_RequiredInterface_main_ObjectFlow26);
		Operation_RequiredInterface_main_ObjectFlow26.setName("ObjectFlow26");
		Operation_RequiredInterface_main_ObjectFlow26.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_ObjectFlow26.setSource(Operation_RequiredInterface_main_Read_d_a_result);
		Operation_RequiredInterface_main_ObjectFlow26.setTarget(Operation_RequiredInterface_main_Read_a_b_object);
		Operation_RequiredInterface_main_ObjectFlow26.setGuard(Operation_RequiredInterface_main_ObjectFlow26_LiteralBoolean28);
		// ObjectFlow Operation_RequiredInterface_main::ObjectFlow29
		addToElementRepository("ObjectFlow29", Operation_RequiredInterface_main_ObjectFlow29);
		Operation_RequiredInterface_main_ObjectFlow29.setName("ObjectFlow29");
		Operation_RequiredInterface_main_ObjectFlow29.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_ObjectFlow29.setSource(Operation_RequiredInterface_main_Fork_d);
		Operation_RequiredInterface_main_ObjectFlow29.setTarget(Operation_RequiredInterface_main_Read_d_c_object);
		Operation_RequiredInterface_main_ObjectFlow29.setGuard(Operation_RequiredInterface_main_ObjectFlow29_LiteralBoolean31);
		// ObjectFlow Operation_RequiredInterface_C_setPActivity::ObjectFlow6
		addToElementRepository("ObjectFlow6", Operation_RequiredInterface_C_setPActivity_ObjectFlow6);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow6.setName("ObjectFlow6");
		Operation_RequiredInterface_C_setPActivity_ObjectFlow6.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_C_setPActivity_ObjectFlow6.setSource(Operation_RequiredInterface_C_setPActivity_this_result);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow6.setTarget(Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_target);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow6.setGuard(Operation_RequiredInterface_C_setPActivity_ObjectFlow6_LiteralBoolean8);
		// ObjectFlow Operation_RequiredInterface_main::ObjectFlow40
		addToElementRepository("ObjectFlow40", Operation_RequiredInterface_main_ObjectFlow40);
		Operation_RequiredInterface_main_ObjectFlow40.setName("ObjectFlow40");
		Operation_RequiredInterface_main_ObjectFlow40.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_ObjectFlow40.setSource(Operation_RequiredInterface_main_D__result);
		Operation_RequiredInterface_main_ObjectFlow40.setTarget(Operation_RequiredInterface_main_Fork_d);
		Operation_RequiredInterface_main_ObjectFlow40.setGuard(Operation_RequiredInterface_main_ObjectFlow40_LiteralBoolean41);
		// ObjectFlow Operation_RequiredInterface_A_setPActivity::ObjectFlow98
		addToElementRepository("ObjectFlow98", Operation_RequiredInterface_A_setPActivity_ObjectFlow98);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow98.setName("ObjectFlow98");
		Operation_RequiredInterface_A_setPActivity_ObjectFlow98.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_A_setPActivity_ObjectFlow98.setSource(Operation_RequiredInterface_A_setPActivity_this_result);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow98.setTarget(Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_target);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow98.setGuard(Operation_RequiredInterface_A_setPActivity_ObjectFlow98_LiteralBoolean100);
		// ObjectFlow Operation_RequiredInterface_B_setPActivity::ObjectFlow85
		addToElementRepository("ObjectFlow85", Operation_RequiredInterface_B_setPActivity_ObjectFlow85);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow85.setName("ObjectFlow85");
		Operation_RequiredInterface_B_setPActivity_ObjectFlow85.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_B_setPActivity_ObjectFlow85.setSource(Operation_RequiredInterface_B_setPActivity_this_result);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow85.setTarget(Operation_RequiredInterface_B_setPActivity_Set_this_p_object);
		Operation_RequiredInterface_B_setPActivity_ObjectFlow85.setGuard(Operation_RequiredInterface_B_setPActivity_ObjectFlow85_LiteralBoolean86);
		// ObjectFlow Operation_RequiredInterface_main::ObjectFlow47
		addToElementRepository("ObjectFlow47", Operation_RequiredInterface_main_ObjectFlow47);
		Operation_RequiredInterface_main_ObjectFlow47.setName("ObjectFlow47");
		Operation_RequiredInterface_main_ObjectFlow47.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_ObjectFlow47.setSource(Operation_RequiredInterface_main_Read_d_c_result);
		Operation_RequiredInterface_main_ObjectFlow47.setTarget(Operation_RequiredInterface_main_Call_setP__target);
		Operation_RequiredInterface_main_ObjectFlow47.setGuard(Operation_RequiredInterface_main_ObjectFlow47_LiteralBoolean48);
		// ObjectFlow Operation_RequiredInterface_C_setPActivity::ObjectFlow3
		addToElementRepository("ObjectFlow3", Operation_RequiredInterface_C_setPActivity_ObjectFlow3);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow3.setName("ObjectFlow3");
		Operation_RequiredInterface_C_setPActivity_ObjectFlow3.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_C_setPActivity_ObjectFlow3.setSource(Operation_RequiredInterface_C_setPActivity_vParameterNode);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow3.setTarget(Operation_RequiredInterface_C_setPActivity_Call_I_setP_on_q_v);
		Operation_RequiredInterface_C_setPActivity_ObjectFlow3.setGuard(Operation_RequiredInterface_C_setPActivity_ObjectFlow3_LiteralBoolean5);
		// ObjectFlow Operation_RequiredInterface_main::ObjectFlow50
		addToElementRepository("ObjectFlow50", Operation_RequiredInterface_main_ObjectFlow50);
		Operation_RequiredInterface_main_ObjectFlow50.setName("ObjectFlow50");
		Operation_RequiredInterface_main_ObjectFlow50.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_ObjectFlow50.setSource(Operation_RequiredInterface_main_Read_b_p_result);
		Operation_RequiredInterface_main_ObjectFlow50.setTarget(Operation_RequiredInterface_main_Call_testP_p);
		Operation_RequiredInterface_main_ObjectFlow50.setGuard(Operation_RequiredInterface_main_ObjectFlow50_LiteralBoolean51);
		// ObjectFlow Operation_RequiredInterface_A_setPActivity::ObjectFlow103
		addToElementRepository("ObjectFlow103", Operation_RequiredInterface_A_setPActivity_ObjectFlow103);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow103.setName("ObjectFlow103");
		Operation_RequiredInterface_A_setPActivity_ObjectFlow103.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_A_setPActivity_ObjectFlow103.setSource(Operation_RequiredInterface_A_setPActivity_vParameterNode);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow103.setTarget(Operation_RequiredInterface_A_setPActivity_Call_I_setP_on_q_v);
		Operation_RequiredInterface_A_setPActivity_ObjectFlow103.setGuard(Operation_RequiredInterface_A_setPActivity_ObjectFlow103_LiteralBoolean104);
		// ObjectFlow Operation_RequiredInterface_main::ObjectFlow69
		addToElementRepository("ObjectFlow69", Operation_RequiredInterface_main_ObjectFlow69);
		Operation_RequiredInterface_main_ObjectFlow69.setName("ObjectFlow69");
		Operation_RequiredInterface_main_ObjectFlow69.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_ObjectFlow69.setSource(Operation_RequiredInterface_main_Read_a_b_result);
		Operation_RequiredInterface_main_ObjectFlow69.setTarget(Operation_RequiredInterface_main_Read_b_p_object);
		Operation_RequiredInterface_main_ObjectFlow69.setGuard(Operation_RequiredInterface_main_ObjectFlow69_LiteralBoolean70);
		// ObjectFlow Operation_RequiredInterface_main::ObjectFlow72
		addToElementRepository("ObjectFlow72", Operation_RequiredInterface_main_ObjectFlow72);
		Operation_RequiredInterface_main_ObjectFlow72.setName("ObjectFlow72");
		Operation_RequiredInterface_main_ObjectFlow72.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_ObjectFlow72.setSource(Operation_RequiredInterface_main_Value_4_result);
		Operation_RequiredInterface_main_ObjectFlow72.setTarget(Operation_RequiredInterface_main_Call_setP__v);
		Operation_RequiredInterface_main_ObjectFlow72.setGuard(Operation_RequiredInterface_main_ObjectFlow72_LiteralBoolean74);
		// ObjectFlow Operation_RequiredInterface_main::ObjectFlow75
		addToElementRepository("ObjectFlow75", Operation_RequiredInterface_main_ObjectFlow75);
		Operation_RequiredInterface_main_ObjectFlow75.setName("ObjectFlow75");
		Operation_RequiredInterface_main_ObjectFlow75.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_ObjectFlow75.setSource(Operation_RequiredInterface_main_Fork_d);
		Operation_RequiredInterface_main_ObjectFlow75.setTarget(Operation_RequiredInterface_main_Read_d_a_object);
		Operation_RequiredInterface_main_ObjectFlow75.setGuard(Operation_RequiredInterface_main_ObjectFlow75_LiteralBoolean76);
	}

	private void initializeOperation_Instances()
	{
		// Operation Operation_RequiredInterface_D::D_D
		addToElementRepository("D_D", Operation_RequiredInterface_D_D_D);
		Operation_RequiredInterface_D_D_D.setName("D");
		Operation_RequiredInterface_D_D_D.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_D_D_D.addOwnedParameter(Operation_RequiredInterface_D_D_D_result);
		Operation_RequiredInterface_D_D_D.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation Operation_RequiredInterface_B::setP_Integer
		addToElementRepository("setP_Integer", Operation_RequiredInterface_B_setP_Integer);
		Operation_RequiredInterface_B_setP_Integer.setName("setP");
		Operation_RequiredInterface_B_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setP_Integer.addOwnedParameter(Operation_RequiredInterface_B_setP_Integer_v);
		Operation_RequiredInterface_B_setP_Integer.addMethod(Operation_RequiredInterface_B_setPActivity);
		// Operation Operation_RequiredInterface_A::setP_Integer
		addToElementRepository("setP_Integer", Operation_RequiredInterface_A_setP_Integer);
		Operation_RequiredInterface_A_setP_Integer.setName("setP");
		Operation_RequiredInterface_A_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setP_Integer.addOwnedParameter(Operation_RequiredInterface_A_setP_Integer_v);
		Operation_RequiredInterface_A_setP_Integer.addMethod(Operation_RequiredInterface_A_setPActivity);
		// Operation Operation_RequiredInterface_I::setP_Integer
		addToElementRepository("setP_Integer", Operation_RequiredInterface_I_setP_Integer);
		Operation_RequiredInterface_I_setP_Integer.setName("setP");
		Operation_RequiredInterface_I_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_I_setP_Integer.addOwnedParameter(Operation_RequiredInterface_I_setP_Integer_v);
		// Operation Operation_RequiredInterface_IImpl::setP_Integer
		addToElementRepository("setP_Integer", Operation_RequiredInterface_IImpl_setP_Integer);
		Operation_RequiredInterface_IImpl_setP_Integer.setName("setP");
		Operation_RequiredInterface_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_IImpl_setP_Integer.addOwnedParameter(Operation_RequiredInterface_IImpl_setP_Integer_v);
		// Operation Operation_RequiredInterface_C::setP_Integer
		addToElementRepository("setP_Integer", Operation_RequiredInterface_C_setP_Integer);
		Operation_RequiredInterface_C_setP_Integer.setName("setP");
		Operation_RequiredInterface_C_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setP_Integer.addOwnedParameter(Operation_RequiredInterface_C_setP_Integer_v);
		Operation_RequiredInterface_C_setP_Integer.addMethod(Operation_RequiredInterface_C_setPActivity);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin Operation_RequiredInterface_main_Read a.b::result
		addToElementRepository("result", Operation_RequiredInterface_main_Read_a_b_result);
		Operation_RequiredInterface_main_Read_a_b_result.setName("result");
		Operation_RequiredInterface_main_Read_a_b_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_a_b_result.setType(Operation_RequiredInterface_B);
		// OutputPin Operation_RequiredInterface_main_Read d.a::result
		addToElementRepository("result", Operation_RequiredInterface_main_Read_d_a_result);
		Operation_RequiredInterface_main_Read_d_a_result.setName("result");
		Operation_RequiredInterface_main_Read_d_a_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_a_result.setType(Operation_RequiredInterface_A);
		// OutputPin Operation_RequiredInterface_main_Create D::result
		addToElementRepository("result", Operation_RequiredInterface_main_Create_D_result);
		Operation_RequiredInterface_main_Create_D_result.setName("result");
		Operation_RequiredInterface_main_Create_D_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Create_D_result.setType(Operation_RequiredInterface_D);
		// OutputPin Operation_RequiredInterface_C_setPActivity_this::result
		addToElementRepository("result", Operation_RequiredInterface_C_setPActivity_this_result);
		Operation_RequiredInterface_C_setPActivity_this_result.setName("result");
		Operation_RequiredInterface_C_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_this_result.setType(Operation_RequiredInterface_C);
		// OutputPin Operation_RequiredInterface_B_setPActivity_this::result
		addToElementRepository("result", Operation_RequiredInterface_B_setPActivity_this_result);
		Operation_RequiredInterface_B_setPActivity_this_result.setName("result");
		Operation_RequiredInterface_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_this_result.setType(Operation_RequiredInterface_B);
		// OutputPin Operation_RequiredInterface_main_Read b.p::result
		addToElementRepository("result", Operation_RequiredInterface_main_Read_b_p_result);
		Operation_RequiredInterface_main_Read_b_p_result.setName("result");
		Operation_RequiredInterface_main_Read_b_p_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Operation_RequiredInterface_A_setPActivity_this::result
		addToElementRepository("result", Operation_RequiredInterface_A_setPActivity_this_result);
		Operation_RequiredInterface_A_setPActivity_this_result.setName("result");
		Operation_RequiredInterface_A_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_this_result.setType(Operation_RequiredInterface_A);
		// OutputPin Operation_RequiredInterface_main_D()::result
		addToElementRepository("result", Operation_RequiredInterface_main_D__result);
		Operation_RequiredInterface_main_D__result.setName("result");
		Operation_RequiredInterface_main_D__result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_D__result.setType(Operation_RequiredInterface_D);
		// OutputPin Operation_RequiredInterface_main_Value(4)::result
		addToElementRepository("result", Operation_RequiredInterface_main_Value_4_result);
		Operation_RequiredInterface_main_Value_4_result.setName("result");
		Operation_RequiredInterface_main_Value_4_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Operation_RequiredInterface_B_setPActivity_Set this.p::result
		addToElementRepository("result", Operation_RequiredInterface_B_setPActivity_Set_this_p_result);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_result.setName("result");
		Operation_RequiredInterface_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_Set_this_p_result.setType(Operation_RequiredInterface_B);
		// OutputPin Operation_RequiredInterface_main_Read d.c::result
		addToElementRepository("result", Operation_RequiredInterface_main_Read_d_c_result);
		Operation_RequiredInterface_main_Read_d_c_result.setName("result");
		Operation_RequiredInterface_main_Read_d_c_result.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_c_result.setType(Operation_RequiredInterface_C);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport Operation_RequiredInterface::PackageImport1
		addToElementRepository("PackageImport1", Operation_RequiredInterface_PackageImport1);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter Operation_RequiredInterface_I_setP_Integer::v
		addToElementRepository("v", Operation_RequiredInterface_I_setP_Integer_v);
		Operation_RequiredInterface_I_setP_Integer_v.setName("v");
		Operation_RequiredInterface_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_A_setP_Integer::v
		addToElementRepository("v", Operation_RequiredInterface_A_setP_Integer_v);
		Operation_RequiredInterface_A_setP_Integer_v.setName("v");
		Operation_RequiredInterface_A_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_A_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_IImpl_setP_Integer::v
		addToElementRepository("v", Operation_RequiredInterface_IImpl_setP_Integer_v);
		Operation_RequiredInterface_IImpl_setP_Integer_v.setName("v");
		Operation_RequiredInterface_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_B_setPActivity::v
		addToElementRepository("v", Operation_RequiredInterface_B_setPActivity_v);
		Operation_RequiredInterface_B_setPActivity_v.setName("v");
		Operation_RequiredInterface_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_C_setPActivity::v
		addToElementRepository("v", Operation_RequiredInterface_C_setPActivity_v);
		Operation_RequiredInterface_C_setPActivity_v.setName("v");
		Operation_RequiredInterface_C_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_C_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_D_D_D::result
		addToElementRepository("result", Operation_RequiredInterface_D_D_D_result);
		Operation_RequiredInterface_D_D_D_result.setName("result");
		Operation_RequiredInterface_D_D_D_result.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_D_D_D_result.setType(Operation_RequiredInterface_D);
		Operation_RequiredInterface_D_D_D_result.setDirection(ParameterDirectionKind.return_);
		// Parameter Operation_RequiredInterface_A_setPActivity::v
		addToElementRepository("v", Operation_RequiredInterface_A_setPActivity_v);
		Operation_RequiredInterface_A_setPActivity_v.setName("v");
		Operation_RequiredInterface_A_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_A_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_B_setP_Integer::v
		addToElementRepository("v", Operation_RequiredInterface_B_setP_Integer_v);
		Operation_RequiredInterface_B_setP_Integer_v.setName("v");
		Operation_RequiredInterface_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_C_setP_Integer::v
		addToElementRepository("v", Operation_RequiredInterface_C_setP_Integer_v);
		Operation_RequiredInterface_C_setP_Integer_v.setName("v");
		Operation_RequiredInterface_C_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_C_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_RequiredInterface_main_testP::p
		addToElementRepository("p", Operation_RequiredInterface_main_testP_p);
		Operation_RequiredInterface_main_testP_p.setName("p");
		Operation_RequiredInterface_main_testP_p.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_main_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializePort_Instances()
	{
		// Port Operation_RequiredInterface_A::q
		addToElementRepository("q", Operation_RequiredInterface_A_q);
		Operation_RequiredInterface_A_q.setName("q");
		Operation_RequiredInterface_A_q.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_A_q.setType(Operation_RequiredInterface_IImpl);
		Operation_RequiredInterface_A_q.setAggregation(AggregationKind.composite);
		Operation_RequiredInterface_A_q.isService = true;
		Operation_RequiredInterface_A_q.addProvided(Operation_RequiredInterface_I);
		// Port Operation_RequiredInterface_C::q
		addToElementRepository("q", Operation_RequiredInterface_C_q);
		Operation_RequiredInterface_C_q.setName("q");
		Operation_RequiredInterface_C_q.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_C_q.setType(Operation_RequiredInterface_IImpl);
		Operation_RequiredInterface_C_q.setAggregation(AggregationKind.composite);
		Operation_RequiredInterface_C_q.isConjugated = true;;
		Operation_RequiredInterface_C_q.isService = true;
		Operation_RequiredInterface_C_q.addRequired(Operation_RequiredInterface_I);
	}

	private void initializeProperty_Instances()
	{
		// Property Operation_RequiredInterface_D::c
		addToElementRepository("c", Operation_RequiredInterface_D_c);
		Operation_RequiredInterface_D_c.setName("c");
		Operation_RequiredInterface_D_c.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_D_c.setType(Operation_RequiredInterface_C);
		Operation_RequiredInterface_D_c.setAggregation(AggregationKind.composite);
		// Property Operation_RequiredInterface_B::p
		addToElementRepository("p", Operation_RequiredInterface_B_p);
		Operation_RequiredInterface_B_p.setName("p");
		Operation_RequiredInterface_B_p.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property Operation_RequiredInterface_S::y
		addToElementRepository("y", Operation_RequiredInterface_S_y);
		Operation_RequiredInterface_S_y.setName("y");
		Operation_RequiredInterface_S_y.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_S_y.setType(Operation_RequiredInterface_IImpl);
		// Property Operation_RequiredInterface_R::x
		addToElementRepository("x", Operation_RequiredInterface_R_x);
		Operation_RequiredInterface_R_x.setName("x");
		Operation_RequiredInterface_R_x.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_R_x.setType(Operation_RequiredInterface_IImpl);
		// Property Operation_RequiredInterface_D::a
		addToElementRepository("a", Operation_RequiredInterface_D_a);
		Operation_RequiredInterface_D_a.setName("a");
		Operation_RequiredInterface_D_a.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_D_a.setType(Operation_RequiredInterface_A);
		Operation_RequiredInterface_D_a.setAggregation(AggregationKind.composite);
		// Property Operation_RequiredInterface_R::y
		addToElementRepository("y", Operation_RequiredInterface_R_y);
		Operation_RequiredInterface_R_y.setName("y");
		Operation_RequiredInterface_R_y.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_R_y.setType(Operation_RequiredInterface_B);
		// Property Operation_RequiredInterface_S::x
		addToElementRepository("x", Operation_RequiredInterface_S_x);
		Operation_RequiredInterface_S_x.setName("x");
		Operation_RequiredInterface_S_x.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_S_x.setType(Operation_RequiredInterface_IImpl);
		// Property Operation_RequiredInterface_A::b
		addToElementRepository("b", Operation_RequiredInterface_A_b);
		Operation_RequiredInterface_A_b.setName("b");
		Operation_RequiredInterface_A_b.setVisibility(VisibilityKind.public_);
		
		Operation_RequiredInterface_A_b.setType(Operation_RequiredInterface_B);
		Operation_RequiredInterface_A_b.setAggregation(AggregationKind.composite);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction Operation_RequiredInterface_A_setPActivity::this
		addToElementRepository("this", Operation_RequiredInterface_A_setPActivity_this);
		Operation_RequiredInterface_A_setPActivity_this.setName("this");
		Operation_RequiredInterface_A_setPActivity_this.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_A_setPActivity_this.setResult(Operation_RequiredInterface_A_setPActivity_this_result);
		// ReadSelfAction Operation_RequiredInterface_C_setPActivity::this
		addToElementRepository("this", Operation_RequiredInterface_C_setPActivity_this);
		Operation_RequiredInterface_C_setPActivity_this.setName("this");
		Operation_RequiredInterface_C_setPActivity_this.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_C_setPActivity_this.setResult(Operation_RequiredInterface_C_setPActivity_this_result);
		// ReadSelfAction Operation_RequiredInterface_B_setPActivity::this
		addToElementRepository("this", Operation_RequiredInterface_B_setPActivity_this);
		Operation_RequiredInterface_B_setPActivity_this.setName("this");
		Operation_RequiredInterface_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_B_setPActivity_this.setResult(Operation_RequiredInterface_B_setPActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction Operation_RequiredInterface_main::Read d.c
		addToElementRepository("Read d.c", Operation_RequiredInterface_main_Read_d_c);
		Operation_RequiredInterface_main_Read_d_c.setName("Read d.c");
		Operation_RequiredInterface_main_Read_d_c.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_c.setStructuralFeature(Operation_RequiredInterface_D_c);
		Operation_RequiredInterface_main_Read_d_c.setObject(Operation_RequiredInterface_main_Read_d_c_object);
		Operation_RequiredInterface_main_Read_d_c.setResult(Operation_RequiredInterface_main_Read_d_c_result);
		// ReadStructuralFeatureAction Operation_RequiredInterface_main::Read b.p
		addToElementRepository("Read b.p", Operation_RequiredInterface_main_Read_b_p);
		Operation_RequiredInterface_main_Read_b_p.setName("Read b.p");
		Operation_RequiredInterface_main_Read_b_p.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_b_p.setStructuralFeature(Operation_RequiredInterface_B_p);
		Operation_RequiredInterface_main_Read_b_p.setObject(Operation_RequiredInterface_main_Read_b_p_object);
		Operation_RequiredInterface_main_Read_b_p.setResult(Operation_RequiredInterface_main_Read_b_p_result);
		// ReadStructuralFeatureAction Operation_RequiredInterface_main::Read a.b
		addToElementRepository("Read a.b", Operation_RequiredInterface_main_Read_a_b);
		Operation_RequiredInterface_main_Read_a_b.setName("Read a.b");
		Operation_RequiredInterface_main_Read_a_b.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_a_b.setStructuralFeature(Operation_RequiredInterface_A_b);
		Operation_RequiredInterface_main_Read_a_b.setObject(Operation_RequiredInterface_main_Read_a_b_object);
		Operation_RequiredInterface_main_Read_a_b.setResult(Operation_RequiredInterface_main_Read_a_b_result);
		// ReadStructuralFeatureAction Operation_RequiredInterface_main::Read d.a
		addToElementRepository("Read d.a", Operation_RequiredInterface_main_Read_d_a);
		Operation_RequiredInterface_main_Read_d_a.setName("Read d.a");
		Operation_RequiredInterface_main_Read_d_a.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Read_d_a.setStructuralFeature(Operation_RequiredInterface_D_a);
		Operation_RequiredInterface_main_Read_d_a.setObject(Operation_RequiredInterface_main_Read_d_a_object);
		Operation_RequiredInterface_main_Read_d_a.setResult(Operation_RequiredInterface_main_Read_d_a_result);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction Operation_RequiredInterface_main::Value(4)
		addToElementRepository("Value(4)", Operation_RequiredInterface_main_Value_4);
		Operation_RequiredInterface_main_Value_4.setName("Value(4)");
		Operation_RequiredInterface_main_Value_4.setVisibility(VisibilityKind.public_);
		Operation_RequiredInterface_main_Value_4.setValue(Operation_RequiredInterface_main_Value_4_LiteralInteger45);
		Operation_RequiredInterface_main_Value_4.setResult(Operation_RequiredInterface_main_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // Operation_RequiredInterfaceModel
