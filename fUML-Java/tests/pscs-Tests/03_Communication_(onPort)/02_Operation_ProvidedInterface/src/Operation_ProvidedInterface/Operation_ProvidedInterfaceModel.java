/*
 * Operation_ProvidedInterfaceModel.java
 * 
 * Auto-generated file
 */
package Operation_ProvidedInterface;

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
import uml.classification.Operation;
import uml.classification.Parameter;
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

public class Operation_ProvidedInterfaceModel extends InMemoryModel
{
	private static Operation_ProvidedInterfaceModel instance;

	/*
	 * Model Operation_ProvidedInterface
	 */
	public Package Operation_ProvidedInterface = new Package();
		public Comment Operation_ProvidedInterface_Comment0 = new Comment();
		public Class_ Operation_ProvidedInterface_B = new Class_();
			public InterfaceRealization Operation_ProvidedInterface_B_IRealization = new InterfaceRealization();
			public Property Operation_ProvidedInterface_B_p = new Property();
			public Activity Operation_ProvidedInterface_B_setPActivity = new Activity();
				public ObjectFlow Operation_ProvidedInterface_B_setPActivity_ObjectFlow1 = new ObjectFlow();
					public LiteralInteger Operation_ProvidedInterface_B_setPActivity_ObjectFlow1_LiteralInteger2 = new LiteralInteger();
					public LiteralBoolean Operation_ProvidedInterface_B_setPActivity_ObjectFlow1_LiteralBoolean3 = new LiteralBoolean();
				public ReadSelfAction Operation_ProvidedInterface_B_setPActivity_this = new ReadSelfAction();
					public OutputPin Operation_ProvidedInterface_B_setPActivity_this_result = new OutputPin();
						public LiteralInteger Operation_ProvidedInterface_B_setPActivity_this_result_LiteralInteger4 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_ProvidedInterface_B_setPActivity_this_result_LiteralUnlimitedNatural5 = new LiteralUnlimitedNatural();
				public AddStructuralFeatureValueAction Operation_ProvidedInterface_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public OutputPin Operation_ProvidedInterface_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural Operation_ProvidedInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural6 = new LiteralUnlimitedNatural();
						public LiteralInteger Operation_ProvidedInterface_B_setPActivity_Set_this_p_result_LiteralInteger7 = new LiteralInteger();
					public InputPin Operation_ProvidedInterface_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralInteger Operation_ProvidedInterface_B_setPActivity_Set_this_p_object_LiteralInteger8 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_ProvidedInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural9 = new LiteralUnlimitedNatural();
					public InputPin Operation_ProvidedInterface_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralInteger Operation_ProvidedInterface_B_setPActivity_Set_this_p_value_LiteralInteger10 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_ProvidedInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11 = new LiteralUnlimitedNatural();
				public ObjectFlow Operation_ProvidedInterface_B_setPActivity_ObjectFlow12 = new ObjectFlow();
					public LiteralBoolean Operation_ProvidedInterface_B_setPActivity_ObjectFlow12_LiteralBoolean13 = new LiteralBoolean();
					public LiteralInteger Operation_ProvidedInterface_B_setPActivity_ObjectFlow12_LiteralInteger14 = new LiteralInteger();
				public ActivityParameterNode Operation_ProvidedInterface_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger Operation_ProvidedInterface_B_setPActivity_vParameterNode_LiteralInteger15 = new LiteralInteger();
				public Parameter Operation_ProvidedInterface_B_setPActivity_v = new Parameter();
			public Operation Operation_ProvidedInterface_B_setP_Integer = new Operation();
				public Parameter Operation_ProvidedInterface_B_setP_Integer_v = new Parameter();
		public Association Operation_ProvidedInterface_R = new Association();
			public Property Operation_ProvidedInterface_R_y = new Property();
			public Property Operation_ProvidedInterface_R_x = new Property();
		public PackageImport Operation_ProvidedInterface_PackageImport16 = new PackageImport();
		public Class_ Operation_ProvidedInterface_IImpl = new Class_();
			public InterfaceRealization Operation_ProvidedInterface_IImpl_IRealization = new InterfaceRealization();
			public Operation Operation_ProvidedInterface_IImpl_setP_Integer = new Operation();
				public Parameter Operation_ProvidedInterface_IImpl_setP_Integer_v = new Parameter();
		public Activity Operation_ProvidedInterface_main = new Activity();
			public CallOperationAction Operation_ProvidedInterface_main_A_ = new CallOperationAction();
				public InputPin Operation_ProvidedInterface_main_A__target = new InputPin();
					public LiteralUnlimitedNatural Operation_ProvidedInterface_main_A__target_LiteralUnlimitedNatural17 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedInterface_main_A__target_LiteralInteger18 = new LiteralInteger();
				public OutputPin Operation_ProvidedInterface_main_A__result = new OutputPin();
					public LiteralUnlimitedNatural Operation_ProvidedInterface_main_A__result_LiteralUnlimitedNatural19 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedInterface_main_A__result_LiteralInteger20 = new LiteralInteger();
					public LiteralInteger Operation_ProvidedInterface_main_A__result_LiteralInteger21 = new LiteralInteger();
			public ObjectFlow Operation_ProvidedInterface_main_ObjectFlow22 = new ObjectFlow();
				public LiteralInteger Operation_ProvidedInterface_main_ObjectFlow22_LiteralInteger23 = new LiteralInteger();
				public LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow22_LiteralBoolean24 = new LiteralBoolean();
			public ObjectFlow Operation_ProvidedInterface_main_ObjectFlow25 = new ObjectFlow();
				public LiteralInteger Operation_ProvidedInterface_main_ObjectFlow25_LiteralInteger26 = new LiteralInteger();
				public LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow25_LiteralBoolean27 = new LiteralBoolean();
			public ReadStructuralFeatureAction Operation_ProvidedInterface_main_Read_b_p = new ReadStructuralFeatureAction();
				public OutputPin Operation_ProvidedInterface_main_Read_b_p_result = new OutputPin();
					public LiteralInteger Operation_ProvidedInterface_main_Read_b_p_result_LiteralInteger28 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedInterface_main_Read_b_p_result_LiteralUnlimitedNatural29 = new LiteralUnlimitedNatural();
				public InputPin Operation_ProvidedInterface_main_Read_b_p_object = new InputPin();
					public LiteralInteger Operation_ProvidedInterface_main_Read_b_p_object_LiteralInteger30 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedInterface_main_Read_b_p_object_LiteralUnlimitedNatural31 = new LiteralUnlimitedNatural();
			public ObjectFlow Operation_ProvidedInterface_main_ObjectFlow32 = new ObjectFlow();
				public LiteralInteger Operation_ProvidedInterface_main_ObjectFlow32_LiteralInteger33 = new LiteralInteger();
				public LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow32_LiteralBoolean34 = new LiteralBoolean();
			public ValueSpecificationAction Operation_ProvidedInterface_main_Value_4 = new ValueSpecificationAction();
				public LiteralInteger Operation_ProvidedInterface_main_Value_4_LiteralInteger35 = new LiteralInteger();
				public OutputPin Operation_ProvidedInterface_main_Value_4_result = new OutputPin();
					public LiteralInteger Operation_ProvidedInterface_main_Value_4_result_LiteralInteger36 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedInterface_main_Value_4_result_LiteralUnlimitedNatural37 = new LiteralUnlimitedNatural();
			public ObjectFlow Operation_ProvidedInterface_main_ObjectFlow38 = new ObjectFlow();
				public LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow38_LiteralBoolean39 = new LiteralBoolean();
				public LiteralInteger Operation_ProvidedInterface_main_ObjectFlow38_LiteralInteger40 = new LiteralInteger();
			public ControlFlow Operation_ProvidedInterface_main_ControlFlow41 = new ControlFlow();
			public ForkNode Operation_ProvidedInterface_main_Fork_a = new ForkNode();
			public CallOperationAction Operation_ProvidedInterface_main_Call_setP_ = new CallOperationAction();
				public InputPin Operation_ProvidedInterface_main_Call_setP__v = new InputPin();
					public LiteralInteger Operation_ProvidedInterface_main_Call_setP__v_LiteralInteger42 = new LiteralInteger();
					public LiteralInteger Operation_ProvidedInterface_main_Call_setP__v_LiteralInteger43 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedInterface_main_Call_setP__v_LiteralUnlimitedNatural44 = new LiteralUnlimitedNatural();
				public InputPin Operation_ProvidedInterface_main_Call_setP__target = new InputPin();
					public LiteralUnlimitedNatural Operation_ProvidedInterface_main_Call_setP__target_LiteralUnlimitedNatural45 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedInterface_main_Call_setP__target_LiteralInteger46 = new LiteralInteger();
			public OpaqueBehavior Operation_ProvidedInterface_main_testP = new OpaqueBehavior();
				public Parameter Operation_ProvidedInterface_main_testP_p = new Parameter();
			public ObjectFlow Operation_ProvidedInterface_main_ObjectFlow47 = new ObjectFlow();
				public LiteralInteger Operation_ProvidedInterface_main_ObjectFlow47_LiteralInteger48 = new LiteralInteger();
				public LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow47_LiteralBoolean49 = new LiteralBoolean();
			public ObjectFlow Operation_ProvidedInterface_main_ObjectFlow50 = new ObjectFlow();
				public LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow50_LiteralBoolean51 = new LiteralBoolean();
				public LiteralInteger Operation_ProvidedInterface_main_ObjectFlow50_LiteralInteger52 = new LiteralInteger();
			public ReadStructuralFeatureAction Operation_ProvidedInterface_main_Read_a_b = new ReadStructuralFeatureAction();
				public OutputPin Operation_ProvidedInterface_main_Read_a_b_result = new OutputPin();
					public LiteralUnlimitedNatural Operation_ProvidedInterface_main_Read_a_b_result_LiteralUnlimitedNatural53 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedInterface_main_Read_a_b_result_LiteralInteger54 = new LiteralInteger();
				public InputPin Operation_ProvidedInterface_main_Read_a_b_object = new InputPin();
					public LiteralUnlimitedNatural Operation_ProvidedInterface_main_Read_a_b_object_LiteralUnlimitedNatural55 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedInterface_main_Read_a_b_object_LiteralInteger56 = new LiteralInteger();
			public ObjectFlow Operation_ProvidedInterface_main_ObjectFlow57 = new ObjectFlow();
				public LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow57_LiteralBoolean58 = new LiteralBoolean();
				public LiteralInteger Operation_ProvidedInterface_main_ObjectFlow57_LiteralInteger59 = new LiteralInteger();
			public CreateObjectAction Operation_ProvidedInterface_main_Create_A = new CreateObjectAction();
				public OutputPin Operation_ProvidedInterface_main_Create_A_result = new OutputPin();
					public LiteralInteger Operation_ProvidedInterface_main_Create_A_result_LiteralInteger60 = new LiteralInteger();
					public LiteralUnlimitedNatural Operation_ProvidedInterface_main_Create_A_result_LiteralUnlimitedNatural61 = new LiteralUnlimitedNatural();
			public CallBehaviorAction Operation_ProvidedInterface_main_Call_testP = new CallBehaviorAction();
				public InputPin Operation_ProvidedInterface_main_Call_testP_p = new InputPin();
					public LiteralUnlimitedNatural Operation_ProvidedInterface_main_Call_testP_p_LiteralUnlimitedNatural62 = new LiteralUnlimitedNatural();
					public LiteralInteger Operation_ProvidedInterface_main_Call_testP_p_LiteralInteger63 = new LiteralInteger();
					public LiteralInteger Operation_ProvidedInterface_main_Call_testP_p_LiteralInteger64 = new LiteralInteger();
		public Comment Operation_ProvidedInterface_Comment65 = new Comment();
		public Class_ Operation_ProvidedInterface_A = new Class_();
			public Property Operation_ProvidedInterface_A_b = new Property();
			public Operation Operation_ProvidedInterface_A_setP_Integer = new Operation();
				public Parameter Operation_ProvidedInterface_A_setP_Integer_v = new Parameter();
			public Activity Operation_ProvidedInterface_A_setPActivity = new Activity();
				public ActivityParameterNode Operation_ProvidedInterface_A_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger Operation_ProvidedInterface_A_setPActivity_vParameterNode_LiteralInteger66 = new LiteralInteger();
				public Parameter Operation_ProvidedInterface_A_setPActivity_v = new Parameter();
				public ObjectFlow Operation_ProvidedInterface_A_setPActivity_ObjectFlow67 = new ObjectFlow();
					public LiteralInteger Operation_ProvidedInterface_A_setPActivity_ObjectFlow67_LiteralInteger68 = new LiteralInteger();
					public LiteralBoolean Operation_ProvidedInterface_A_setPActivity_ObjectFlow67_LiteralBoolean69 = new LiteralBoolean();
				public ReadSelfAction Operation_ProvidedInterface_A_setPActivity_this = new ReadSelfAction();
					public OutputPin Operation_ProvidedInterface_A_setPActivity_this_result = new OutputPin();
						public LiteralInteger Operation_ProvidedInterface_A_setPActivity_this_result_LiteralInteger70 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_ProvidedInterface_A_setPActivity_this_result_LiteralUnlimitedNatural71 = new LiteralUnlimitedNatural();
				public ObjectFlow Operation_ProvidedInterface_A_setPActivity_ObjectFlow72 = new ObjectFlow();
					public LiteralBoolean Operation_ProvidedInterface_A_setPActivity_ObjectFlow72_LiteralBoolean73 = new LiteralBoolean();
					public LiteralInteger Operation_ProvidedInterface_A_setPActivity_ObjectFlow72_LiteralInteger74 = new LiteralInteger();
				public CallOperationAction Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q = new CallOperationAction();
					public InputPin Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target = new InputPin();
						public LiteralInteger Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger75 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural76 = new LiteralUnlimitedNatural();
					public InputPin Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v = new InputPin();
						public LiteralInteger Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger77 = new LiteralInteger();
						public LiteralInteger Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger78 = new LiteralInteger();
						public LiteralUnlimitedNatural Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural79 = new LiteralUnlimitedNatural();
			public Port Operation_ProvidedInterface_A_q = new Port();
			public Operation Operation_ProvidedInterface_A_A_A = new Operation();
				public Parameter Operation_ProvidedInterface_A_A_A_result = new Parameter();
			public Connector Operation_ProvidedInterface_A_r = new Connector();
				public ConnectorEnd Operation_ProvidedInterface_A_r_ConnectorEnd80 = new ConnectorEnd();
				public ConnectorEnd Operation_ProvidedInterface_A_r_ConnectorEnd81 = new ConnectorEnd();
		public Interface Operation_ProvidedInterface_I = new Interface();
			public Operation Operation_ProvidedInterface_I_setP_Integer = new Operation();
				public Parameter Operation_ProvidedInterface_I_setP_Integer_v = new Parameter();
		public Association Operation_ProvidedInterface_S = new Association();
			public Property Operation_ProvidedInterface_S_x = new Property();
			public Property Operation_ProvidedInterface_S_y = new Property();

	public static Operation_ProvidedInterfaceModel instance()
	{
		if (instance == null)
        {
            instance = new Operation_ProvidedInterfaceModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public Operation_ProvidedInterfaceModel()
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
		// Activity Operation_ProvidedInterface::main
		addToElementRepository("main", Operation_ProvidedInterface_main);
		Operation_ProvidedInterface_main.setName("main");
		Operation_ProvidedInterface_main.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main.addOwnedBehavior(Operation_ProvidedInterface_main_testP);
		Operation_ProvidedInterface_main.addNode(Operation_ProvidedInterface_main_A_);
		Operation_ProvidedInterface_main.addNode(Operation_ProvidedInterface_main_Value_4);
		Operation_ProvidedInterface_main.addNode(Operation_ProvidedInterface_main_Fork_a);
		Operation_ProvidedInterface_main.addNode(Operation_ProvidedInterface_main_Call_setP_);
		Operation_ProvidedInterface_main.addNode(Operation_ProvidedInterface_main_Read_b_p);
		Operation_ProvidedInterface_main.addNode(Operation_ProvidedInterface_main_Read_a_b);
		Operation_ProvidedInterface_main.addNode(Operation_ProvidedInterface_main_Create_A);
		Operation_ProvidedInterface_main.addNode(Operation_ProvidedInterface_main_Call_testP);
		Operation_ProvidedInterface_main.addEdge(Operation_ProvidedInterface_main_ObjectFlow22);
		Operation_ProvidedInterface_main.addEdge(Operation_ProvidedInterface_main_ObjectFlow38);
		Operation_ProvidedInterface_main.addEdge(Operation_ProvidedInterface_main_ObjectFlow25);
		Operation_ProvidedInterface_main.addEdge(Operation_ProvidedInterface_main_ControlFlow41);
		Operation_ProvidedInterface_main.addEdge(Operation_ProvidedInterface_main_ObjectFlow47);
		Operation_ProvidedInterface_main.addEdge(Operation_ProvidedInterface_main_ObjectFlow50);
		Operation_ProvidedInterface_main.addEdge(Operation_ProvidedInterface_main_ObjectFlow57);
		Operation_ProvidedInterface_main.addEdge(Operation_ProvidedInterface_main_ObjectFlow32);
		// Activity Operation_ProvidedInterface_A::setPActivity
		addToElementRepository("setPActivity", Operation_ProvidedInterface_A_setPActivity);
		Operation_ProvidedInterface_A_setPActivity.setName("setPActivity");
		Operation_ProvidedInterface_A_setPActivity.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_A_setPActivity.addOwnedParameter(Operation_ProvidedInterface_A_setPActivity_v);
		Operation_ProvidedInterface_A_setPActivity.addNode(Operation_ProvidedInterface_A_setPActivity_vParameterNode);
		Operation_ProvidedInterface_A_setPActivity.addNode(Operation_ProvidedInterface_A_setPActivity_this);
		Operation_ProvidedInterface_A_setPActivity.addNode(Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q);
		Operation_ProvidedInterface_A_setPActivity.addEdge(Operation_ProvidedInterface_A_setPActivity_ObjectFlow67);
		Operation_ProvidedInterface_A_setPActivity.addEdge(Operation_ProvidedInterface_A_setPActivity_ObjectFlow72);
		// Activity Operation_ProvidedInterface_B::setPActivity
		addToElementRepository("setPActivity", Operation_ProvidedInterface_B_setPActivity);
		Operation_ProvidedInterface_B_setPActivity.setName("setPActivity");
		Operation_ProvidedInterface_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_B_setPActivity.addOwnedParameter(Operation_ProvidedInterface_B_setPActivity_v);
		Operation_ProvidedInterface_B_setPActivity.addNode(Operation_ProvidedInterface_B_setPActivity_this);
		Operation_ProvidedInterface_B_setPActivity.addNode(Operation_ProvidedInterface_B_setPActivity_Set_this_p);
		Operation_ProvidedInterface_B_setPActivity.addNode(Operation_ProvidedInterface_B_setPActivity_vParameterNode);
		Operation_ProvidedInterface_B_setPActivity.addEdge(Operation_ProvidedInterface_B_setPActivity_ObjectFlow1);
		Operation_ProvidedInterface_B_setPActivity.addEdge(Operation_ProvidedInterface_B_setPActivity_ObjectFlow12);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode Operation_ProvidedInterface_A_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", Operation_ProvidedInterface_A_setPActivity_vParameterNode);
		Operation_ProvidedInterface_A_setPActivity_vParameterNode.setName("vParameterNode");
		Operation_ProvidedInterface_A_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_A_setPActivity_vParameterNode.setParameter(Operation_ProvidedInterface_A_setPActivity_v);
		// ActivityParameterNode Operation_ProvidedInterface_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", Operation_ProvidedInterface_B_setPActivity_vParameterNode);
		Operation_ProvidedInterface_B_setPActivity_vParameterNode.setName("vParameterNode");
		Operation_ProvidedInterface_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_B_setPActivity_vParameterNode.setParameter(Operation_ProvidedInterface_B_setPActivity_v);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction Operation_ProvidedInterface_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", Operation_ProvidedInterface_B_setPActivity_Set_this_p);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p.setName("Set this.p");
		Operation_ProvidedInterface_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p.setStructuralFeature(Operation_ProvidedInterface_B_p);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p.setObject(Operation_ProvidedInterface_B_setPActivity_Set_this_p_object);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p.setValue(Operation_ProvidedInterface_B_setPActivity_Set_this_p_value);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p.setResult(Operation_ProvidedInterface_B_setPActivity_Set_this_p_result);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p.setIsReplaceAll(true);
	}

	private void initializeAssociation_Instances()
	{
		// Association Operation_ProvidedInterface::R
		addToElementRepository("R", Operation_ProvidedInterface_R);
		Operation_ProvidedInterface_R.setName("R");
		Operation_ProvidedInterface_R.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_R.addOwnedEnd(Operation_ProvidedInterface_R_x);
		Operation_ProvidedInterface_R.addOwnedEnd(Operation_ProvidedInterface_R_y);
		// Association Operation_ProvidedInterface::S
		addToElementRepository("S", Operation_ProvidedInterface_S);
		Operation_ProvidedInterface_S.setName("S");
		Operation_ProvidedInterface_S.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_S.addOwnedEnd(Operation_ProvidedInterface_S_x);
		Operation_ProvidedInterface_S.addOwnedEnd(Operation_ProvidedInterface_S_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction Operation_ProvidedInterface_main::Call testP
		addToElementRepository("Call testP", Operation_ProvidedInterface_main_Call_testP);
		Operation_ProvidedInterface_main_Call_testP.setName("Call testP");
		Operation_ProvidedInterface_main_Call_testP.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_testP.setBehavior(Operation_ProvidedInterface_main_testP);
		Operation_ProvidedInterface_main_Call_testP.addArgument(Operation_ProvidedInterface_main_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction Operation_ProvidedInterface_main::A()
		addToElementRepository("A()", Operation_ProvidedInterface_main_A_);
		Operation_ProvidedInterface_main_A_.setName("A()");
		Operation_ProvidedInterface_main_A_.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_main_A_.addResult(Operation_ProvidedInterface_main_A__result);
		Operation_ProvidedInterface_main_A_.setOperation(Operation_ProvidedInterface_A_A_A);
		Operation_ProvidedInterface_main_A_.setTarget(Operation_ProvidedInterface_main_A__target);
		// CallOperationAction Operation_ProvidedInterface_main::Call setP()
		addToElementRepository("Call setP()", Operation_ProvidedInterface_main_Call_setP_);
		Operation_ProvidedInterface_main_Call_setP_.setName("Call setP()");
		Operation_ProvidedInterface_main_Call_setP_.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_setP_.setOperation(Operation_ProvidedInterface_A_setP_Integer);
		Operation_ProvidedInterface_main_Call_setP_.setTarget(Operation_ProvidedInterface_main_Call_setP__target);
		Operation_ProvidedInterface_main_Call_setP_.addArgument(Operation_ProvidedInterface_main_Call_setP__v);
		// CallOperationAction Operation_ProvidedInterface_A_setPActivity::Call I::setP on q
		addToElementRepository("Call I::setP on q", Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q.setName("Call I::setP on q");
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q.setOnPort(Operation_ProvidedInterface_A_q);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q.setOperation(Operation_ProvidedInterface_I_setP_Integer);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q.setTarget(Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q.addArgument(Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v);
	}

	private void initializeClass_Instances()
	{
		// Class Operation_ProvidedInterface::B
		addToElementRepository("B", Operation_ProvidedInterface_B);
		Operation_ProvidedInterface_B.setName("B");
		Operation_ProvidedInterface_B.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_B.addOwnedAttribute(Operation_ProvidedInterface_B_p);
		Operation_ProvidedInterface_B.addOwnedBehavior(Operation_ProvidedInterface_B_setPActivity);
		Operation_ProvidedInterface_B.addInterfaceRealization(Operation_ProvidedInterface_B_IRealization);
		
		Operation_ProvidedInterface_B.addOwnedOperation(Operation_ProvidedInterface_B_setP_Integer);
		// Class Operation_ProvidedInterface::IImpl
		addToElementRepository("IImpl", Operation_ProvidedInterface_IImpl);
		Operation_ProvidedInterface_IImpl.setName("IImpl");
		Operation_ProvidedInterface_IImpl.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_IImpl.addInterfaceRealization(Operation_ProvidedInterface_IImpl_IRealization);
		
		Operation_ProvidedInterface_IImpl.addOwnedOperation(Operation_ProvidedInterface_IImpl_setP_Integer);
		// Class Operation_ProvidedInterface::A
		addToElementRepository("A", Operation_ProvidedInterface_A);
		Operation_ProvidedInterface_A.setName("A");
		Operation_ProvidedInterface_A.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_A.addOwnedAttribute(Operation_ProvidedInterface_A_q);
		Operation_ProvidedInterface_A.addOwnedAttribute(Operation_ProvidedInterface_A_b);
		Operation_ProvidedInterface_A.addOwnedBehavior(Operation_ProvidedInterface_A_setPActivity);
		Operation_ProvidedInterface_A.addOwnedConnector(Operation_ProvidedInterface_A_r);
		Operation_ProvidedInterface_A.addOwnedOperation(Operation_ProvidedInterface_A_setP_Integer);
		Operation_ProvidedInterface_A.addOwnedOperation(Operation_ProvidedInterface_A_A_A);
	}

	private void initializeComment_Instances()
	{
		// Comment Operation_ProvidedInterface::Comment0
		addToElementRepository("Comment0", Operation_ProvidedInterface_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment Operation_ProvidedInterface::Comment65
		addToElementRepository("Comment65", Operation_ProvidedInterface_Comment65);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector Operation_ProvidedInterface_A::r
		addToElementRepository("r", Operation_ProvidedInterface_A_r);
		Operation_ProvidedInterface_A_r.setName("r");
		Operation_ProvidedInterface_A_r.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_r.addEnd(Operation_ProvidedInterface_A_r_ConnectorEnd80);
		Operation_ProvidedInterface_A_r.addEnd(Operation_ProvidedInterface_A_r_ConnectorEnd81);
		Operation_ProvidedInterface_A_r.setType(Operation_ProvidedInterface_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd Operation_ProvidedInterface_A_r::ConnectorEnd80
		addToElementRepository("ConnectorEnd80", Operation_ProvidedInterface_A_r_ConnectorEnd80);
		Operation_ProvidedInterface_A_r_ConnectorEnd80.setRole(Operation_ProvidedInterface_A_q);
		// ConnectorEnd Operation_ProvidedInterface_A_r::ConnectorEnd81
		addToElementRepository("ConnectorEnd81", Operation_ProvidedInterface_A_r_ConnectorEnd81);
		Operation_ProvidedInterface_A_r_ConnectorEnd81.setRole(Operation_ProvidedInterface_A_b);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow Operation_ProvidedInterface_main::ControlFlow41
		addToElementRepository("ControlFlow41", Operation_ProvidedInterface_main_ControlFlow41);
		Operation_ProvidedInterface_main_ControlFlow41.setName("ControlFlow41");
		Operation_ProvidedInterface_main_ControlFlow41.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_main_ControlFlow41.setSource(Operation_ProvidedInterface_main_Call_setP_);
		Operation_ProvidedInterface_main_ControlFlow41.setTarget(Operation_ProvidedInterface_main_Read_a_b);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction Operation_ProvidedInterface_main::Create A
		addToElementRepository("Create A", Operation_ProvidedInterface_main_Create_A);
		Operation_ProvidedInterface_main_Create_A.setName("Create A");
		Operation_ProvidedInterface_main_Create_A.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Create_A.setClassifier(Operation_ProvidedInterface_A);
		Operation_ProvidedInterface_main_Create_A.setResult(Operation_ProvidedInterface_main_Create_A_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode Operation_ProvidedInterface_main::Fork a
		addToElementRepository("Fork a", Operation_ProvidedInterface_main_Fork_a);
		Operation_ProvidedInterface_main_Fork_a.setName("Fork a");
		Operation_ProvidedInterface_main_Fork_a.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior Operation_ProvidedInterface_main::testP
		addToElementRepository("testP", Operation_ProvidedInterface_main_testP);
		Operation_ProvidedInterface_main_testP.setName("testP");
		Operation_ProvidedInterface_main_testP.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_main_testP.addOwnedParameter(Operation_ProvidedInterface_main_testP_p);
		Operation_ProvidedInterface_main_testP.addLanguage("Java");
		Operation_ProvidedInterface_main_testP.addLanguage("Import");
		Operation_ProvidedInterface_main_testP.addBody("System.out.println(\"Asserting a.b.p == 4\");  	// Test parameter p 	int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument p = \" + p); 	 	System.out.println(\"a.b.p == \" + p); 	System.out.print(\"Invocation made into a through q: \");  	if(p == 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		Operation_ProvidedInterface_main_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin Operation_ProvidedInterface_main_A()::target
		addToElementRepository("target", Operation_ProvidedInterface_main_A__target);
		Operation_ProvidedInterface_main_A__target.setName("target");
		Operation_ProvidedInterface_main_A__target.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_A__target.setType(Operation_ProvidedInterface_A);
		// InputPin Operation_ProvidedInterface_A_setPActivity_Call I::setP on q::target
		addToElementRepository("target", Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target.setName("target");
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target.setVisibility(VisibilityKind.public_);
		// InputPin Operation_ProvidedInterface_main_Call setP()::v
		addToElementRepository("v", Operation_ProvidedInterface_main_Call_setP__v);
		Operation_ProvidedInterface_main_Call_setP__v.setName("v");
		Operation_ProvidedInterface_main_Call_setP__v.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_setP__v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_ProvidedInterface_main_Call setP()::target
		addToElementRepository("target", Operation_ProvidedInterface_main_Call_setP__target);
		Operation_ProvidedInterface_main_Call_setP__target.setName("target");
		Operation_ProvidedInterface_main_Call_setP__target.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_setP__target.setType(Operation_ProvidedInterface_A);
		// InputPin Operation_ProvidedInterface_A_setPActivity_Call I::setP on q::v
		addToElementRepository("v", Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v.setName("v");
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_ProvidedInterface_B_setPActivity_Set this.p::object
		addToElementRepository("object", Operation_ProvidedInterface_B_setPActivity_Set_this_p_object);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_object.setName("object");
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_object.setType(Operation_ProvidedInterface_B);
		// InputPin Operation_ProvidedInterface_main_Read b.p::object
		addToElementRepository("object", Operation_ProvidedInterface_main_Read_b_p_object);
		Operation_ProvidedInterface_main_Read_b_p_object.setName("object");
		Operation_ProvidedInterface_main_Read_b_p_object.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_b_p_object.setType(Operation_ProvidedInterface_B);
		// InputPin Operation_ProvidedInterface_main_Call testP::p
		addToElementRepository("p", Operation_ProvidedInterface_main_Call_testP_p);
		Operation_ProvidedInterface_main_Call_testP_p.setName("p");
		Operation_ProvidedInterface_main_Call_testP_p.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Operation_ProvidedInterface_main_Read a.b::object
		addToElementRepository("object", Operation_ProvidedInterface_main_Read_a_b_object);
		Operation_ProvidedInterface_main_Read_a_b_object.setName("object");
		Operation_ProvidedInterface_main_Read_a_b_object.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_a_b_object.setType(Operation_ProvidedInterface_A);
		// InputPin Operation_ProvidedInterface_B_setPActivity_Set this.p::value
		addToElementRepository("value", Operation_ProvidedInterface_B_setPActivity_Set_this_p_value);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_value.setName("value");
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeInterface_Instances()
	{
		// Interface Operation_ProvidedInterface::I
		addToElementRepository("I", Operation_ProvidedInterface_I);
		Operation_ProvidedInterface_I.setName("I");
		Operation_ProvidedInterface_I.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_I.addOwnedOperation(Operation_ProvidedInterface_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization Operation_ProvidedInterface_B::IRealization
		addToElementRepository("IRealization", Operation_ProvidedInterface_B_IRealization);
		Operation_ProvidedInterface_B_IRealization.setName("IRealization");
		Operation_ProvidedInterface_B_IRealization.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_IRealization.setContract(Operation_ProvidedInterface_I);
		// InterfaceRealization Operation_ProvidedInterface_IImpl::IRealization
		addToElementRepository("IRealization", Operation_ProvidedInterface_IImpl_IRealization);
		Operation_ProvidedInterface_IImpl_IRealization.setName("IRealization");
		Operation_ProvidedInterface_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_IImpl_IRealization.setContract(Operation_ProvidedInterface_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean Operation_ProvidedInterface_A_setPActivity_ObjectFlow72::LiteralBoolean73
		addToElementRepository("LiteralBoolean73", Operation_ProvidedInterface_A_setPActivity_ObjectFlow72_LiteralBoolean73);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow72_LiteralBoolean73.setName("LiteralBoolean73");
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow72_LiteralBoolean73.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow72_LiteralBoolean73.setValue(true);
		// LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow38::LiteralBoolean39
		addToElementRepository("LiteralBoolean39", Operation_ProvidedInterface_main_ObjectFlow38_LiteralBoolean39);
		Operation_ProvidedInterface_main_ObjectFlow38_LiteralBoolean39.setName("LiteralBoolean39");
		Operation_ProvidedInterface_main_ObjectFlow38_LiteralBoolean39.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow38_LiteralBoolean39.setValue(true);
		// LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow50::LiteralBoolean51
		addToElementRepository("LiteralBoolean51", Operation_ProvidedInterface_main_ObjectFlow50_LiteralBoolean51);
		Operation_ProvidedInterface_main_ObjectFlow50_LiteralBoolean51.setName("LiteralBoolean51");
		Operation_ProvidedInterface_main_ObjectFlow50_LiteralBoolean51.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow50_LiteralBoolean51.setValue(true);
		// LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow25::LiteralBoolean27
		addToElementRepository("LiteralBoolean27", Operation_ProvidedInterface_main_ObjectFlow25_LiteralBoolean27);
		Operation_ProvidedInterface_main_ObjectFlow25_LiteralBoolean27.setName("LiteralBoolean27");
		Operation_ProvidedInterface_main_ObjectFlow25_LiteralBoolean27.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow25_LiteralBoolean27.setValue(true);
		// LiteralBoolean Operation_ProvidedInterface_B_setPActivity_ObjectFlow1::LiteralBoolean3
		addToElementRepository("LiteralBoolean3", Operation_ProvidedInterface_B_setPActivity_ObjectFlow1_LiteralBoolean3);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow1_LiteralBoolean3.setName("LiteralBoolean3");
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow1_LiteralBoolean3.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow1_LiteralBoolean3.setValue(true);
		// LiteralBoolean Operation_ProvidedInterface_B_setPActivity_ObjectFlow12::LiteralBoolean13
		addToElementRepository("LiteralBoolean13", Operation_ProvidedInterface_B_setPActivity_ObjectFlow12_LiteralBoolean13);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow12_LiteralBoolean13.setName("LiteralBoolean13");
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow12_LiteralBoolean13.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow12_LiteralBoolean13.setValue(true);
		// LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow47::LiteralBoolean49
		addToElementRepository("LiteralBoolean49", Operation_ProvidedInterface_main_ObjectFlow47_LiteralBoolean49);
		Operation_ProvidedInterface_main_ObjectFlow47_LiteralBoolean49.setName("LiteralBoolean49");
		Operation_ProvidedInterface_main_ObjectFlow47_LiteralBoolean49.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow47_LiteralBoolean49.setValue(true);
		// LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow57::LiteralBoolean58
		addToElementRepository("LiteralBoolean58", Operation_ProvidedInterface_main_ObjectFlow57_LiteralBoolean58);
		Operation_ProvidedInterface_main_ObjectFlow57_LiteralBoolean58.setName("LiteralBoolean58");
		Operation_ProvidedInterface_main_ObjectFlow57_LiteralBoolean58.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow57_LiteralBoolean58.setValue(true);
		// LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow32::LiteralBoolean34
		addToElementRepository("LiteralBoolean34", Operation_ProvidedInterface_main_ObjectFlow32_LiteralBoolean34);
		Operation_ProvidedInterface_main_ObjectFlow32_LiteralBoolean34.setName("LiteralBoolean34");
		Operation_ProvidedInterface_main_ObjectFlow32_LiteralBoolean34.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow32_LiteralBoolean34.setValue(true);
		// LiteralBoolean Operation_ProvidedInterface_A_setPActivity_ObjectFlow67::LiteralBoolean69
		addToElementRepository("LiteralBoolean69", Operation_ProvidedInterface_A_setPActivity_ObjectFlow67_LiteralBoolean69);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow67_LiteralBoolean69.setName("LiteralBoolean69");
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow67_LiteralBoolean69.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow67_LiteralBoolean69.setValue(true);
		// LiteralBoolean Operation_ProvidedInterface_main_ObjectFlow22::LiteralBoolean24
		addToElementRepository("LiteralBoolean24", Operation_ProvidedInterface_main_ObjectFlow22_LiteralBoolean24);
		Operation_ProvidedInterface_main_ObjectFlow22_LiteralBoolean24.setName("LiteralBoolean24");
		Operation_ProvidedInterface_main_ObjectFlow22_LiteralBoolean24.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow22_LiteralBoolean24.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger Operation_ProvidedInterface_A_setPActivity_Call I::setP on q_v::LiteralInteger77
		addToElementRepository("LiteralInteger77", Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger77);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger77.setName("LiteralInteger77");
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger77.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger77.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_B_setPActivity_ObjectFlow1::LiteralInteger2
		addToElementRepository("LiteralInteger2", Operation_ProvidedInterface_B_setPActivity_ObjectFlow1_LiteralInteger2);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow1_LiteralInteger2.setName("LiteralInteger2");
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow1_LiteralInteger2.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow1_LiteralInteger2.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_A_setPActivity_ObjectFlow72::LiteralInteger74
		addToElementRepository("LiteralInteger74", Operation_ProvidedInterface_A_setPActivity_ObjectFlow72_LiteralInteger74);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow72_LiteralInteger74.setName("LiteralInteger74");
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow72_LiteralInteger74.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow72_LiteralInteger74.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_Read a.b_object::LiteralInteger56
		addToElementRepository("LiteralInteger56", Operation_ProvidedInterface_main_Read_a_b_object_LiteralInteger56);
		Operation_ProvidedInterface_main_Read_a_b_object_LiteralInteger56.setName("LiteralInteger56");
		Operation_ProvidedInterface_main_Read_a_b_object_LiteralInteger56.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_a_b_object_LiteralInteger56.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_B_setPActivity_this_result::LiteralInteger4
		addToElementRepository("LiteralInteger4", Operation_ProvidedInterface_B_setPActivity_this_result_LiteralInteger4);
		Operation_ProvidedInterface_B_setPActivity_this_result_LiteralInteger4.setName("LiteralInteger4");
		Operation_ProvidedInterface_B_setPActivity_this_result_LiteralInteger4.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_this_result_LiteralInteger4.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_B_setPActivity_vParameterNode::LiteralInteger15
		addToElementRepository("LiteralInteger15", Operation_ProvidedInterface_B_setPActivity_vParameterNode_LiteralInteger15);
		Operation_ProvidedInterface_B_setPActivity_vParameterNode_LiteralInteger15.setName("LiteralInteger15");
		Operation_ProvidedInterface_B_setPActivity_vParameterNode_LiteralInteger15.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_vParameterNode_LiteralInteger15.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_ObjectFlow38::LiteralInteger40
		addToElementRepository("LiteralInteger40", Operation_ProvidedInterface_main_ObjectFlow38_LiteralInteger40);
		Operation_ProvidedInterface_main_ObjectFlow38_LiteralInteger40.setName("LiteralInteger40");
		Operation_ProvidedInterface_main_ObjectFlow38_LiteralInteger40.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow38_LiteralInteger40.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_ObjectFlow25::LiteralInteger26
		addToElementRepository("LiteralInteger26", Operation_ProvidedInterface_main_ObjectFlow25_LiteralInteger26);
		Operation_ProvidedInterface_main_ObjectFlow25_LiteralInteger26.setName("LiteralInteger26");
		Operation_ProvidedInterface_main_ObjectFlow25_LiteralInteger26.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow25_LiteralInteger26.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_Read b.p_object::LiteralInteger30
		addToElementRepository("LiteralInteger30", Operation_ProvidedInterface_main_Read_b_p_object_LiteralInteger30);
		Operation_ProvidedInterface_main_Read_b_p_object_LiteralInteger30.setName("LiteralInteger30");
		Operation_ProvidedInterface_main_Read_b_p_object_LiteralInteger30.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_b_p_object_LiteralInteger30.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_Value(4)_result::LiteralInteger36
		addToElementRepository("LiteralInteger36", Operation_ProvidedInterface_main_Value_4_result_LiteralInteger36);
		Operation_ProvidedInterface_main_Value_4_result_LiteralInteger36.setName("LiteralInteger36");
		Operation_ProvidedInterface_main_Value_4_result_LiteralInteger36.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Value_4_result_LiteralInteger36.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_A_setPActivity_Call I::setP on q_target::LiteralInteger75
		addToElementRepository("LiteralInteger75", Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger75);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger75.setName("LiteralInteger75");
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger75.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralInteger75.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_A_setPActivity_this_result::LiteralInteger70
		addToElementRepository("LiteralInteger70", Operation_ProvidedInterface_A_setPActivity_this_result_LiteralInteger70);
		Operation_ProvidedInterface_A_setPActivity_this_result_LiteralInteger70.setName("LiteralInteger70");
		Operation_ProvidedInterface_A_setPActivity_this_result_LiteralInteger70.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_this_result_LiteralInteger70.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_Read b.p_result::LiteralInteger28
		addToElementRepository("LiteralInteger28", Operation_ProvidedInterface_main_Read_b_p_result_LiteralInteger28);
		Operation_ProvidedInterface_main_Read_b_p_result_LiteralInteger28.setName("LiteralInteger28");
		Operation_ProvidedInterface_main_Read_b_p_result_LiteralInteger28.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_b_p_result_LiteralInteger28.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_ObjectFlow22::LiteralInteger23
		addToElementRepository("LiteralInteger23", Operation_ProvidedInterface_main_ObjectFlow22_LiteralInteger23);
		Operation_ProvidedInterface_main_ObjectFlow22_LiteralInteger23.setName("LiteralInteger23");
		Operation_ProvidedInterface_main_ObjectFlow22_LiteralInteger23.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow22_LiteralInteger23.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_A_setPActivity_vParameterNode::LiteralInteger66
		addToElementRepository("LiteralInteger66", Operation_ProvidedInterface_A_setPActivity_vParameterNode_LiteralInteger66);
		Operation_ProvidedInterface_A_setPActivity_vParameterNode_LiteralInteger66.setName("LiteralInteger66");
		Operation_ProvidedInterface_A_setPActivity_vParameterNode_LiteralInteger66.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_vParameterNode_LiteralInteger66.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_A()_result::LiteralInteger20
		addToElementRepository("LiteralInteger20", Operation_ProvidedInterface_main_A__result_LiteralInteger20);
		Operation_ProvidedInterface_main_A__result_LiteralInteger20.setName("LiteralInteger20");
		Operation_ProvidedInterface_main_A__result_LiteralInteger20.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_A__result_LiteralInteger20.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_B_setPActivity_ObjectFlow12::LiteralInteger14
		addToElementRepository("LiteralInteger14", Operation_ProvidedInterface_B_setPActivity_ObjectFlow12_LiteralInteger14);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow12_LiteralInteger14.setName("LiteralInteger14");
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow12_LiteralInteger14.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow12_LiteralInteger14.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_A()_target::LiteralInteger18
		addToElementRepository("LiteralInteger18", Operation_ProvidedInterface_main_A__target_LiteralInteger18);
		Operation_ProvidedInterface_main_A__target_LiteralInteger18.setName("LiteralInteger18");
		Operation_ProvidedInterface_main_A__target_LiteralInteger18.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_A__target_LiteralInteger18.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_A()_result::LiteralInteger21
		addToElementRepository("LiteralInteger21", Operation_ProvidedInterface_main_A__result_LiteralInteger21);
		Operation_ProvidedInterface_main_A__result_LiteralInteger21.setName("LiteralInteger21");
		Operation_ProvidedInterface_main_A__result_LiteralInteger21.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_A__result_LiteralInteger21.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_Call testP_p::LiteralInteger64
		addToElementRepository("LiteralInteger64", Operation_ProvidedInterface_main_Call_testP_p_LiteralInteger64);
		Operation_ProvidedInterface_main_Call_testP_p_LiteralInteger64.setName("LiteralInteger64");
		Operation_ProvidedInterface_main_Call_testP_p_LiteralInteger64.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_testP_p_LiteralInteger64.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_Create A_result::LiteralInteger60
		addToElementRepository("LiteralInteger60", Operation_ProvidedInterface_main_Create_A_result_LiteralInteger60);
		Operation_ProvidedInterface_main_Create_A_result_LiteralInteger60.setName("LiteralInteger60");
		Operation_ProvidedInterface_main_Create_A_result_LiteralInteger60.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Create_A_result_LiteralInteger60.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_A_setPActivity_Call I::setP on q_v::LiteralInteger78
		addToElementRepository("LiteralInteger78", Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger78);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger78.setName("LiteralInteger78");
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger78.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralInteger78.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_Value(4)::LiteralInteger35
		addToElementRepository("LiteralInteger35", Operation_ProvidedInterface_main_Value_4_LiteralInteger35);
		Operation_ProvidedInterface_main_Value_4_LiteralInteger35.setName("LiteralInteger35");
		Operation_ProvidedInterface_main_Value_4_LiteralInteger35.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Value_4_LiteralInteger35.setValue(4);
		// LiteralInteger Operation_ProvidedInterface_A_setPActivity_ObjectFlow67::LiteralInteger68
		addToElementRepository("LiteralInteger68", Operation_ProvidedInterface_A_setPActivity_ObjectFlow67_LiteralInteger68);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow67_LiteralInteger68.setName("LiteralInteger68");
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow67_LiteralInteger68.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow67_LiteralInteger68.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_Call setP()_target::LiteralInteger46
		addToElementRepository("LiteralInteger46", Operation_ProvidedInterface_main_Call_setP__target_LiteralInteger46);
		Operation_ProvidedInterface_main_Call_setP__target_LiteralInteger46.setName("LiteralInteger46");
		Operation_ProvidedInterface_main_Call_setP__target_LiteralInteger46.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_setP__target_LiteralInteger46.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_ObjectFlow50::LiteralInteger52
		addToElementRepository("LiteralInteger52", Operation_ProvidedInterface_main_ObjectFlow50_LiteralInteger52);
		Operation_ProvidedInterface_main_ObjectFlow50_LiteralInteger52.setName("LiteralInteger52");
		Operation_ProvidedInterface_main_ObjectFlow50_LiteralInteger52.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow50_LiteralInteger52.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_B_setPActivity_Set this.p_value::LiteralInteger10
		addToElementRepository("LiteralInteger10", Operation_ProvidedInterface_B_setPActivity_Set_this_p_value_LiteralInteger10);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_value_LiteralInteger10.setName("LiteralInteger10");
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_value_LiteralInteger10.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_value_LiteralInteger10.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_B_setPActivity_Set this.p_object::LiteralInteger8
		addToElementRepository("LiteralInteger8", Operation_ProvidedInterface_B_setPActivity_Set_this_p_object_LiteralInteger8);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_object_LiteralInteger8.setName("LiteralInteger8");
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_object_LiteralInteger8.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_object_LiteralInteger8.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_ObjectFlow32::LiteralInteger33
		addToElementRepository("LiteralInteger33", Operation_ProvidedInterface_main_ObjectFlow32_LiteralInteger33);
		Operation_ProvidedInterface_main_ObjectFlow32_LiteralInteger33.setName("LiteralInteger33");
		Operation_ProvidedInterface_main_ObjectFlow32_LiteralInteger33.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow32_LiteralInteger33.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_Call setP()_v::LiteralInteger42
		addToElementRepository("LiteralInteger42", Operation_ProvidedInterface_main_Call_setP__v_LiteralInteger42);
		Operation_ProvidedInterface_main_Call_setP__v_LiteralInteger42.setName("LiteralInteger42");
		Operation_ProvidedInterface_main_Call_setP__v_LiteralInteger42.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_setP__v_LiteralInteger42.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_ObjectFlow47::LiteralInteger48
		addToElementRepository("LiteralInteger48", Operation_ProvidedInterface_main_ObjectFlow47_LiteralInteger48);
		Operation_ProvidedInterface_main_ObjectFlow47_LiteralInteger48.setName("LiteralInteger48");
		Operation_ProvidedInterface_main_ObjectFlow47_LiteralInteger48.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow47_LiteralInteger48.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_ObjectFlow57::LiteralInteger59
		addToElementRepository("LiteralInteger59", Operation_ProvidedInterface_main_ObjectFlow57_LiteralInteger59);
		Operation_ProvidedInterface_main_ObjectFlow57_LiteralInteger59.setName("LiteralInteger59");
		Operation_ProvidedInterface_main_ObjectFlow57_LiteralInteger59.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_ObjectFlow57_LiteralInteger59.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_Read a.b_result::LiteralInteger54
		addToElementRepository("LiteralInteger54", Operation_ProvidedInterface_main_Read_a_b_result_LiteralInteger54);
		Operation_ProvidedInterface_main_Read_a_b_result_LiteralInteger54.setName("LiteralInteger54");
		Operation_ProvidedInterface_main_Read_a_b_result_LiteralInteger54.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_a_b_result_LiteralInteger54.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_Call testP_p::LiteralInteger63
		addToElementRepository("LiteralInteger63", Operation_ProvidedInterface_main_Call_testP_p_LiteralInteger63);
		Operation_ProvidedInterface_main_Call_testP_p_LiteralInteger63.setName("LiteralInteger63");
		Operation_ProvidedInterface_main_Call_testP_p_LiteralInteger63.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_testP_p_LiteralInteger63.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_main_Call setP()_v::LiteralInteger43
		addToElementRepository("LiteralInteger43", Operation_ProvidedInterface_main_Call_setP__v_LiteralInteger43);
		Operation_ProvidedInterface_main_Call_setP__v_LiteralInteger43.setName("LiteralInteger43");
		Operation_ProvidedInterface_main_Call_setP__v_LiteralInteger43.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_setP__v_LiteralInteger43.setValue(1);
		// LiteralInteger Operation_ProvidedInterface_B_setPActivity_Set this.p_result::LiteralInteger7
		addToElementRepository("LiteralInteger7", Operation_ProvidedInterface_B_setPActivity_Set_this_p_result_LiteralInteger7);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_result_LiteralInteger7.setName("LiteralInteger7");
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_result_LiteralInteger7.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_result_LiteralInteger7.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural Operation_ProvidedInterface_main_A()_result::LiteralUnlimitedNatural19
		addToElementRepository("LiteralUnlimitedNatural19", Operation_ProvidedInterface_main_A__result_LiteralUnlimitedNatural19);
		Operation_ProvidedInterface_main_A__result_LiteralUnlimitedNatural19.setName("LiteralUnlimitedNatural19");
		Operation_ProvidedInterface_main_A__result_LiteralUnlimitedNatural19.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_A__result_LiteralUnlimitedNatural19.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_main_Read a.b_object::LiteralUnlimitedNatural55
		addToElementRepository("LiteralUnlimitedNatural55", Operation_ProvidedInterface_main_Read_a_b_object_LiteralUnlimitedNatural55);
		Operation_ProvidedInterface_main_Read_a_b_object_LiteralUnlimitedNatural55.setName("LiteralUnlimitedNatural55");
		Operation_ProvidedInterface_main_Read_a_b_object_LiteralUnlimitedNatural55.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_a_b_object_LiteralUnlimitedNatural55.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural6
		addToElementRepository("LiteralUnlimitedNatural6", Operation_ProvidedInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural6);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural6.setName("LiteralUnlimitedNatural6");
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural6.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural6.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_main_Read a.b_result::LiteralUnlimitedNatural53
		addToElementRepository("LiteralUnlimitedNatural53", Operation_ProvidedInterface_main_Read_a_b_result_LiteralUnlimitedNatural53);
		Operation_ProvidedInterface_main_Read_a_b_result_LiteralUnlimitedNatural53.setName("LiteralUnlimitedNatural53");
		Operation_ProvidedInterface_main_Read_a_b_result_LiteralUnlimitedNatural53.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_a_b_result_LiteralUnlimitedNatural53.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_B_setPActivity_this_result::LiteralUnlimitedNatural5
		addToElementRepository("LiteralUnlimitedNatural5", Operation_ProvidedInterface_B_setPActivity_this_result_LiteralUnlimitedNatural5);
		Operation_ProvidedInterface_B_setPActivity_this_result_LiteralUnlimitedNatural5.setName("LiteralUnlimitedNatural5");
		Operation_ProvidedInterface_B_setPActivity_this_result_LiteralUnlimitedNatural5.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_this_result_LiteralUnlimitedNatural5.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_main_Read b.p_result::LiteralUnlimitedNatural29
		addToElementRepository("LiteralUnlimitedNatural29", Operation_ProvidedInterface_main_Read_b_p_result_LiteralUnlimitedNatural29);
		Operation_ProvidedInterface_main_Read_b_p_result_LiteralUnlimitedNatural29.setName("LiteralUnlimitedNatural29");
		Operation_ProvidedInterface_main_Read_b_p_result_LiteralUnlimitedNatural29.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_b_p_result_LiteralUnlimitedNatural29.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_main_Value(4)_result::LiteralUnlimitedNatural37
		addToElementRepository("LiteralUnlimitedNatural37", Operation_ProvidedInterface_main_Value_4_result_LiteralUnlimitedNatural37);
		Operation_ProvidedInterface_main_Value_4_result_LiteralUnlimitedNatural37.setName("LiteralUnlimitedNatural37");
		Operation_ProvidedInterface_main_Value_4_result_LiteralUnlimitedNatural37.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Value_4_result_LiteralUnlimitedNatural37.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_main_A()_target::LiteralUnlimitedNatural17
		addToElementRepository("LiteralUnlimitedNatural17", Operation_ProvidedInterface_main_A__target_LiteralUnlimitedNatural17);
		Operation_ProvidedInterface_main_A__target_LiteralUnlimitedNatural17.setName("LiteralUnlimitedNatural17");
		Operation_ProvidedInterface_main_A__target_LiteralUnlimitedNatural17.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_A__target_LiteralUnlimitedNatural17.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural9
		addToElementRepository("LiteralUnlimitedNatural9", Operation_ProvidedInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural9);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural9.setName("LiteralUnlimitedNatural9");
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural9.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural9.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_main_Create A_result::LiteralUnlimitedNatural61
		addToElementRepository("LiteralUnlimitedNatural61", Operation_ProvidedInterface_main_Create_A_result_LiteralUnlimitedNatural61);
		Operation_ProvidedInterface_main_Create_A_result_LiteralUnlimitedNatural61.setName("LiteralUnlimitedNatural61");
		Operation_ProvidedInterface_main_Create_A_result_LiteralUnlimitedNatural61.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Create_A_result_LiteralUnlimitedNatural61.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_A_setPActivity_Call I::setP on q_v::LiteralUnlimitedNatural79
		addToElementRepository("LiteralUnlimitedNatural79", Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural79);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural79.setName("LiteralUnlimitedNatural79");
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural79.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v_LiteralUnlimitedNatural79.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_main_Read b.p_object::LiteralUnlimitedNatural31
		addToElementRepository("LiteralUnlimitedNatural31", Operation_ProvidedInterface_main_Read_b_p_object_LiteralUnlimitedNatural31);
		Operation_ProvidedInterface_main_Read_b_p_object_LiteralUnlimitedNatural31.setName("LiteralUnlimitedNatural31");
		Operation_ProvidedInterface_main_Read_b_p_object_LiteralUnlimitedNatural31.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_b_p_object_LiteralUnlimitedNatural31.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_A_setPActivity_Call I::setP on q_target::LiteralUnlimitedNatural76
		addToElementRepository("LiteralUnlimitedNatural76", Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural76);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural76.setName("LiteralUnlimitedNatural76");
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural76.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target_LiteralUnlimitedNatural76.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_main_Call testP_p::LiteralUnlimitedNatural62
		addToElementRepository("LiteralUnlimitedNatural62", Operation_ProvidedInterface_main_Call_testP_p_LiteralUnlimitedNatural62);
		Operation_ProvidedInterface_main_Call_testP_p_LiteralUnlimitedNatural62.setName("LiteralUnlimitedNatural62");
		Operation_ProvidedInterface_main_Call_testP_p_LiteralUnlimitedNatural62.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_testP_p_LiteralUnlimitedNatural62.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_A_setPActivity_this_result::LiteralUnlimitedNatural71
		addToElementRepository("LiteralUnlimitedNatural71", Operation_ProvidedInterface_A_setPActivity_this_result_LiteralUnlimitedNatural71);
		Operation_ProvidedInterface_A_setPActivity_this_result_LiteralUnlimitedNatural71.setName("LiteralUnlimitedNatural71");
		Operation_ProvidedInterface_A_setPActivity_this_result_LiteralUnlimitedNatural71.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_this_result_LiteralUnlimitedNatural71.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_main_Call setP()_target::LiteralUnlimitedNatural45
		addToElementRepository("LiteralUnlimitedNatural45", Operation_ProvidedInterface_main_Call_setP__target_LiteralUnlimitedNatural45);
		Operation_ProvidedInterface_main_Call_setP__target_LiteralUnlimitedNatural45.setName("LiteralUnlimitedNatural45");
		Operation_ProvidedInterface_main_Call_setP__target_LiteralUnlimitedNatural45.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_setP__target_LiteralUnlimitedNatural45.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_main_Call setP()_v::LiteralUnlimitedNatural44
		addToElementRepository("LiteralUnlimitedNatural44", Operation_ProvidedInterface_main_Call_setP__v_LiteralUnlimitedNatural44);
		Operation_ProvidedInterface_main_Call_setP__v_LiteralUnlimitedNatural44.setName("LiteralUnlimitedNatural44");
		Operation_ProvidedInterface_main_Call_setP__v_LiteralUnlimitedNatural44.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Call_setP__v_LiteralUnlimitedNatural44.setValue(1);
		// LiteralUnlimitedNatural Operation_ProvidedInterface_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural11
		addToElementRepository("LiteralUnlimitedNatural11", Operation_ProvidedInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11.setName("LiteralUnlimitedNatural11");
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow Operation_ProvidedInterface_B_setPActivity::ObjectFlow1
		addToElementRepository("ObjectFlow1", Operation_ProvidedInterface_B_setPActivity_ObjectFlow1);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow1.setName("ObjectFlow1");
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow1.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow1.setSource(Operation_ProvidedInterface_B_setPActivity_this_result);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow1.setTarget(Operation_ProvidedInterface_B_setPActivity_Set_this_p_object);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow1.setGuard(Operation_ProvidedInterface_B_setPActivity_ObjectFlow1_LiteralBoolean3);
		// ObjectFlow Operation_ProvidedInterface_A_setPActivity::ObjectFlow67
		addToElementRepository("ObjectFlow67", Operation_ProvidedInterface_A_setPActivity_ObjectFlow67);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow67.setName("ObjectFlow67");
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow67.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow67.setSource(Operation_ProvidedInterface_A_setPActivity_vParameterNode);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow67.setTarget(Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_v);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow67.setGuard(Operation_ProvidedInterface_A_setPActivity_ObjectFlow67_LiteralBoolean69);
		// ObjectFlow Operation_ProvidedInterface_main::ObjectFlow22
		addToElementRepository("ObjectFlow22", Operation_ProvidedInterface_main_ObjectFlow22);
		Operation_ProvidedInterface_main_ObjectFlow22.setName("ObjectFlow22");
		Operation_ProvidedInterface_main_ObjectFlow22.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_main_ObjectFlow22.setSource(Operation_ProvidedInterface_main_Create_A_result);
		Operation_ProvidedInterface_main_ObjectFlow22.setTarget(Operation_ProvidedInterface_main_A__target);
		Operation_ProvidedInterface_main_ObjectFlow22.setGuard(Operation_ProvidedInterface_main_ObjectFlow22_LiteralBoolean24);
		// ObjectFlow Operation_ProvidedInterface_main::ObjectFlow25
		addToElementRepository("ObjectFlow25", Operation_ProvidedInterface_main_ObjectFlow25);
		Operation_ProvidedInterface_main_ObjectFlow25.setName("ObjectFlow25");
		Operation_ProvidedInterface_main_ObjectFlow25.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_main_ObjectFlow25.setSource(Operation_ProvidedInterface_main_Fork_a);
		Operation_ProvidedInterface_main_ObjectFlow25.setTarget(Operation_ProvidedInterface_main_Read_a_b_object);
		Operation_ProvidedInterface_main_ObjectFlow25.setGuard(Operation_ProvidedInterface_main_ObjectFlow25_LiteralBoolean27);
		// ObjectFlow Operation_ProvidedInterface_main::ObjectFlow38
		addToElementRepository("ObjectFlow38", Operation_ProvidedInterface_main_ObjectFlow38);
		Operation_ProvidedInterface_main_ObjectFlow38.setName("ObjectFlow38");
		Operation_ProvidedInterface_main_ObjectFlow38.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_main_ObjectFlow38.setSource(Operation_ProvidedInterface_main_A__result);
		Operation_ProvidedInterface_main_ObjectFlow38.setTarget(Operation_ProvidedInterface_main_Fork_a);
		Operation_ProvidedInterface_main_ObjectFlow38.setGuard(Operation_ProvidedInterface_main_ObjectFlow38_LiteralBoolean39);
		// ObjectFlow Operation_ProvidedInterface_B_setPActivity::ObjectFlow12
		addToElementRepository("ObjectFlow12", Operation_ProvidedInterface_B_setPActivity_ObjectFlow12);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow12.setName("ObjectFlow12");
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow12.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow12.setSource(Operation_ProvidedInterface_B_setPActivity_vParameterNode);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow12.setTarget(Operation_ProvidedInterface_B_setPActivity_Set_this_p_value);
		Operation_ProvidedInterface_B_setPActivity_ObjectFlow12.setGuard(Operation_ProvidedInterface_B_setPActivity_ObjectFlow12_LiteralBoolean13);
		// ObjectFlow Operation_ProvidedInterface_A_setPActivity::ObjectFlow72
		addToElementRepository("ObjectFlow72", Operation_ProvidedInterface_A_setPActivity_ObjectFlow72);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow72.setName("ObjectFlow72");
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow72.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow72.setSource(Operation_ProvidedInterface_A_setPActivity_this_result);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow72.setTarget(Operation_ProvidedInterface_A_setPActivity_Call_I_setP_on_q_target);
		Operation_ProvidedInterface_A_setPActivity_ObjectFlow72.setGuard(Operation_ProvidedInterface_A_setPActivity_ObjectFlow72_LiteralBoolean73);
		// ObjectFlow Operation_ProvidedInterface_main::ObjectFlow47
		addToElementRepository("ObjectFlow47", Operation_ProvidedInterface_main_ObjectFlow47);
		Operation_ProvidedInterface_main_ObjectFlow47.setName("ObjectFlow47");
		Operation_ProvidedInterface_main_ObjectFlow47.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_main_ObjectFlow47.setSource(Operation_ProvidedInterface_main_Fork_a);
		Operation_ProvidedInterface_main_ObjectFlow47.setTarget(Operation_ProvidedInterface_main_Call_setP__target);
		Operation_ProvidedInterface_main_ObjectFlow47.setGuard(Operation_ProvidedInterface_main_ObjectFlow47_LiteralBoolean49);
		// ObjectFlow Operation_ProvidedInterface_main::ObjectFlow50
		addToElementRepository("ObjectFlow50", Operation_ProvidedInterface_main_ObjectFlow50);
		Operation_ProvidedInterface_main_ObjectFlow50.setName("ObjectFlow50");
		Operation_ProvidedInterface_main_ObjectFlow50.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_main_ObjectFlow50.setSource(Operation_ProvidedInterface_main_Value_4_result);
		Operation_ProvidedInterface_main_ObjectFlow50.setTarget(Operation_ProvidedInterface_main_Call_setP__v);
		Operation_ProvidedInterface_main_ObjectFlow50.setGuard(Operation_ProvidedInterface_main_ObjectFlow50_LiteralBoolean51);
		// ObjectFlow Operation_ProvidedInterface_main::ObjectFlow32
		addToElementRepository("ObjectFlow32", Operation_ProvidedInterface_main_ObjectFlow32);
		Operation_ProvidedInterface_main_ObjectFlow32.setName("ObjectFlow32");
		Operation_ProvidedInterface_main_ObjectFlow32.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_main_ObjectFlow32.setSource(Operation_ProvidedInterface_main_Read_b_p_result);
		Operation_ProvidedInterface_main_ObjectFlow32.setTarget(Operation_ProvidedInterface_main_Call_testP_p);
		Operation_ProvidedInterface_main_ObjectFlow32.setGuard(Operation_ProvidedInterface_main_ObjectFlow32_LiteralBoolean34);
		// ObjectFlow Operation_ProvidedInterface_main::ObjectFlow57
		addToElementRepository("ObjectFlow57", Operation_ProvidedInterface_main_ObjectFlow57);
		Operation_ProvidedInterface_main_ObjectFlow57.setName("ObjectFlow57");
		Operation_ProvidedInterface_main_ObjectFlow57.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_main_ObjectFlow57.setSource(Operation_ProvidedInterface_main_Read_a_b_result);
		Operation_ProvidedInterface_main_ObjectFlow57.setTarget(Operation_ProvidedInterface_main_Read_b_p_object);
		Operation_ProvidedInterface_main_ObjectFlow57.setGuard(Operation_ProvidedInterface_main_ObjectFlow57_LiteralBoolean58);
	}

	private void initializeOperation_Instances()
	{
		// Operation Operation_ProvidedInterface_A::setP_Integer
		addToElementRepository("setP_Integer", Operation_ProvidedInterface_A_setP_Integer);
		Operation_ProvidedInterface_A_setP_Integer.setName("setP");
		Operation_ProvidedInterface_A_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setP_Integer.addOwnedParameter(Operation_ProvidedInterface_A_setP_Integer_v);
		Operation_ProvidedInterface_A_setP_Integer.addMethod(Operation_ProvidedInterface_A_setPActivity);
		// Operation Operation_ProvidedInterface_I::setP_Integer
		addToElementRepository("setP_Integer", Operation_ProvidedInterface_I_setP_Integer);
		Operation_ProvidedInterface_I_setP_Integer.setName("setP");
		Operation_ProvidedInterface_I_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_I_setP_Integer.addOwnedParameter(Operation_ProvidedInterface_I_setP_Integer_v);
		// Operation Operation_ProvidedInterface_A::A_A
		addToElementRepository("A_A", Operation_ProvidedInterface_A_A_A);
		Operation_ProvidedInterface_A_A_A.setName("A");
		Operation_ProvidedInterface_A_A_A.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_A_A.addOwnedParameter(Operation_ProvidedInterface_A_A_A_result);
		Operation_ProvidedInterface_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation Operation_ProvidedInterface_IImpl::setP_Integer
		addToElementRepository("setP_Integer", Operation_ProvidedInterface_IImpl_setP_Integer);
		Operation_ProvidedInterface_IImpl_setP_Integer.setName("setP");
		Operation_ProvidedInterface_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_IImpl_setP_Integer.addOwnedParameter(Operation_ProvidedInterface_IImpl_setP_Integer_v);
		// Operation Operation_ProvidedInterface_B::setP_Integer
		addToElementRepository("setP_Integer", Operation_ProvidedInterface_B_setP_Integer);
		Operation_ProvidedInterface_B_setP_Integer.setName("setP");
		Operation_ProvidedInterface_B_setP_Integer.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setP_Integer.addOwnedParameter(Operation_ProvidedInterface_B_setP_Integer_v);
		Operation_ProvidedInterface_B_setP_Integer.addMethod(Operation_ProvidedInterface_B_setPActivity);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin Operation_ProvidedInterface_main_Read a.b::result
		addToElementRepository("result", Operation_ProvidedInterface_main_Read_a_b_result);
		Operation_ProvidedInterface_main_Read_a_b_result.setName("result");
		Operation_ProvidedInterface_main_Read_a_b_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_a_b_result.setType(Operation_ProvidedInterface_B);
		// OutputPin Operation_ProvidedInterface_main_A()::result
		addToElementRepository("result", Operation_ProvidedInterface_main_A__result);
		Operation_ProvidedInterface_main_A__result.setName("result");
		Operation_ProvidedInterface_main_A__result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_A__result.setType(Operation_ProvidedInterface_A);
		// OutputPin Operation_ProvidedInterface_B_setPActivity_Set this.p::result
		addToElementRepository("result", Operation_ProvidedInterface_B_setPActivity_Set_this_p_result);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_result.setName("result");
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_Set_this_p_result.setType(Operation_ProvidedInterface_B);
		// OutputPin Operation_ProvidedInterface_main_Read b.p::result
		addToElementRepository("result", Operation_ProvidedInterface_main_Read_b_p_result);
		Operation_ProvidedInterface_main_Read_b_p_result.setName("result");
		Operation_ProvidedInterface_main_Read_b_p_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Operation_ProvidedInterface_B_setPActivity_this::result
		addToElementRepository("result", Operation_ProvidedInterface_B_setPActivity_this_result);
		Operation_ProvidedInterface_B_setPActivity_this_result.setName("result");
		Operation_ProvidedInterface_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_this_result.setType(Operation_ProvidedInterface_B);
		// OutputPin Operation_ProvidedInterface_main_Value(4)::result
		addToElementRepository("result", Operation_ProvidedInterface_main_Value_4_result);
		Operation_ProvidedInterface_main_Value_4_result.setName("result");
		Operation_ProvidedInterface_main_Value_4_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Operation_ProvidedInterface_main_Create A::result
		addToElementRepository("result", Operation_ProvidedInterface_main_Create_A_result);
		Operation_ProvidedInterface_main_Create_A_result.setName("result");
		Operation_ProvidedInterface_main_Create_A_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Create_A_result.setType(Operation_ProvidedInterface_A);
		// OutputPin Operation_ProvidedInterface_A_setPActivity_this::result
		addToElementRepository("result", Operation_ProvidedInterface_A_setPActivity_this_result);
		Operation_ProvidedInterface_A_setPActivity_this_result.setName("result");
		Operation_ProvidedInterface_A_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_this_result.setType(Operation_ProvidedInterface_A);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport Operation_ProvidedInterface::PackageImport16
		addToElementRepository("PackageImport16", Operation_ProvidedInterface_PackageImport16);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter Operation_ProvidedInterface_IImpl_setP_Integer::v
		addToElementRepository("v", Operation_ProvidedInterface_IImpl_setP_Integer_v);
		Operation_ProvidedInterface_IImpl_setP_Integer_v.setName("v");
		Operation_ProvidedInterface_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedInterface_A_setP_Integer::v
		addToElementRepository("v", Operation_ProvidedInterface_A_setP_Integer_v);
		Operation_ProvidedInterface_A_setP_Integer_v.setName("v");
		Operation_ProvidedInterface_A_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_A_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedInterface_A_setPActivity::v
		addToElementRepository("v", Operation_ProvidedInterface_A_setPActivity_v);
		Operation_ProvidedInterface_A_setPActivity_v.setName("v");
		Operation_ProvidedInterface_A_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_A_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedInterface_I_setP_Integer::v
		addToElementRepository("v", Operation_ProvidedInterface_I_setP_Integer_v);
		Operation_ProvidedInterface_I_setP_Integer_v.setName("v");
		Operation_ProvidedInterface_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedInterface_B_setP_Integer::v
		addToElementRepository("v", Operation_ProvidedInterface_B_setP_Integer_v);
		Operation_ProvidedInterface_B_setP_Integer_v.setName("v");
		Operation_ProvidedInterface_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedInterface_B_setPActivity::v
		addToElementRepository("v", Operation_ProvidedInterface_B_setPActivity_v);
		Operation_ProvidedInterface_B_setPActivity_v.setName("v");
		Operation_ProvidedInterface_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedInterface_main_testP::p
		addToElementRepository("p", Operation_ProvidedInterface_main_testP_p);
		Operation_ProvidedInterface_main_testP_p.setName("p");
		Operation_ProvidedInterface_main_testP_p.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_main_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Operation_ProvidedInterface_A_A_A::result
		addToElementRepository("result", Operation_ProvidedInterface_A_A_A_result);
		Operation_ProvidedInterface_A_A_A_result.setName("result");
		Operation_ProvidedInterface_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_A_A_A_result.setType(Operation_ProvidedInterface_A);
		Operation_ProvidedInterface_A_A_A_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port Operation_ProvidedInterface_A::q
		addToElementRepository("q", Operation_ProvidedInterface_A_q);
		Operation_ProvidedInterface_A_q.setName("q");
		Operation_ProvidedInterface_A_q.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_A_q.setType(Operation_ProvidedInterface_IImpl);
		Operation_ProvidedInterface_A_q.setAggregation(AggregationKind.composite);
		Operation_ProvidedInterface_A_q.isService = true;
		Operation_ProvidedInterface_A_q.addProvided(Operation_ProvidedInterface_I);
	}

	private void initializeProperty_Instances()
	{
		// Property Operation_ProvidedInterface_A::b
		addToElementRepository("b", Operation_ProvidedInterface_A_b);
		Operation_ProvidedInterface_A_b.setName("b");
		Operation_ProvidedInterface_A_b.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_A_b.setType(Operation_ProvidedInterface_B);
		Operation_ProvidedInterface_A_b.setAggregation(AggregationKind.composite);
		// Property Operation_ProvidedInterface_R::y
		addToElementRepository("y", Operation_ProvidedInterface_R_y);
		Operation_ProvidedInterface_R_y.setName("y");
		Operation_ProvidedInterface_R_y.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_R_y.setType(Operation_ProvidedInterface_B);
		// Property Operation_ProvidedInterface_B::p
		addToElementRepository("p", Operation_ProvidedInterface_B_p);
		Operation_ProvidedInterface_B_p.setName("p");
		Operation_ProvidedInterface_B_p.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property Operation_ProvidedInterface_S::x
		addToElementRepository("x", Operation_ProvidedInterface_S_x);
		Operation_ProvidedInterface_S_x.setName("x");
		Operation_ProvidedInterface_S_x.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_S_x.setType(Operation_ProvidedInterface_IImpl);
		// Property Operation_ProvidedInterface_S::y
		addToElementRepository("y", Operation_ProvidedInterface_S_y);
		Operation_ProvidedInterface_S_y.setName("y");
		Operation_ProvidedInterface_S_y.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_S_y.setType(Operation_ProvidedInterface_IImpl);
		// Property Operation_ProvidedInterface_R::x
		addToElementRepository("x", Operation_ProvidedInterface_R_x);
		Operation_ProvidedInterface_R_x.setName("x");
		Operation_ProvidedInterface_R_x.setVisibility(VisibilityKind.public_);
		
		Operation_ProvidedInterface_R_x.setType(Operation_ProvidedInterface_IImpl);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction Operation_ProvidedInterface_B_setPActivity::this
		addToElementRepository("this", Operation_ProvidedInterface_B_setPActivity_this);
		Operation_ProvidedInterface_B_setPActivity_this.setName("this");
		Operation_ProvidedInterface_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_B_setPActivity_this.setResult(Operation_ProvidedInterface_B_setPActivity_this_result);
		// ReadSelfAction Operation_ProvidedInterface_A_setPActivity::this
		addToElementRepository("this", Operation_ProvidedInterface_A_setPActivity_this);
		Operation_ProvidedInterface_A_setPActivity_this.setName("this");
		Operation_ProvidedInterface_A_setPActivity_this.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_A_setPActivity_this.setResult(Operation_ProvidedInterface_A_setPActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction Operation_ProvidedInterface_main::Read b.p
		addToElementRepository("Read b.p", Operation_ProvidedInterface_main_Read_b_p);
		Operation_ProvidedInterface_main_Read_b_p.setName("Read b.p");
		Operation_ProvidedInterface_main_Read_b_p.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_b_p.setStructuralFeature(Operation_ProvidedInterface_B_p);
		Operation_ProvidedInterface_main_Read_b_p.setObject(Operation_ProvidedInterface_main_Read_b_p_object);
		Operation_ProvidedInterface_main_Read_b_p.setResult(Operation_ProvidedInterface_main_Read_b_p_result);
		// ReadStructuralFeatureAction Operation_ProvidedInterface_main::Read a.b
		addToElementRepository("Read a.b", Operation_ProvidedInterface_main_Read_a_b);
		Operation_ProvidedInterface_main_Read_a_b.setName("Read a.b");
		Operation_ProvidedInterface_main_Read_a_b.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Read_a_b.setStructuralFeature(Operation_ProvidedInterface_A_b);
		Operation_ProvidedInterface_main_Read_a_b.setObject(Operation_ProvidedInterface_main_Read_a_b_object);
		Operation_ProvidedInterface_main_Read_a_b.setResult(Operation_ProvidedInterface_main_Read_a_b_result);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction Operation_ProvidedInterface_main::Value(4)
		addToElementRepository("Value(4)", Operation_ProvidedInterface_main_Value_4);
		Operation_ProvidedInterface_main_Value_4.setName("Value(4)");
		Operation_ProvidedInterface_main_Value_4.setVisibility(VisibilityKind.public_);
		Operation_ProvidedInterface_main_Value_4.setValue(Operation_ProvidedInterface_main_Value_4_LiteralInteger35);
		Operation_ProvidedInterface_main_Value_4.setResult(Operation_ProvidedInterface_main_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // Operation_ProvidedInterfaceModel
