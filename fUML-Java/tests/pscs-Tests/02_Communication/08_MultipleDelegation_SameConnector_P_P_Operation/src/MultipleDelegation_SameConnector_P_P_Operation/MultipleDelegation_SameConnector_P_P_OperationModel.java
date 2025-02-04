/*
 * MultipleDelegation_SameConnector_P_P_OperationModel.java
 * 
 * Auto-generated file
 */
package MultipleDelegation_SameConnector_P_P_Operation;

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

public class MultipleDelegation_SameConnector_P_P_OperationModel extends InMemoryModel
{
	private static MultipleDelegation_SameConnector_P_P_OperationModel instance;

	/*
	 * Model MultipleDelegation_SameConnector_P_P_Operation
	 */
	public Package MultipleDelegation_SameConnector_P_P_Operation = new Package();
		public Comment MultipleDelegation_SameConnector_P_P_Operation_Comment0 = new Comment();
		public Class_ MultipleDelegation_SameConnector_P_P_Operation_IImpl = new Class_();
			public InterfaceRealization MultipleDelegation_SameConnector_P_P_Operation_IImpl_IRealization = new InterfaceRealization();
			public Operation MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer_v = new Parameter();
		public PackageImport MultipleDelegation_SameConnector_P_P_Operation_PackageImport1 = new PackageImport();
		public Comment MultipleDelegation_SameConnector_P_P_Operation_Comment2 = new Comment();
		public Interface MultipleDelegation_SameConnector_P_P_Operation_I = new Interface();
			public Operation MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer_v = new Parameter();
		public Activity MultipleDelegation_SameConnector_P_P_Operation_main = new Activity();
			public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p = new ReadStructuralFeatureAction();
				public InputPin MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object_LiteralUnlimitedNatural3 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object_LiteralInteger4 = new LiteralInteger();
				public OutputPin MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result = new OutputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result_LiteralUnlimitedNatural5 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result_LiteralInteger6 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7_LiteralInteger8 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7_LiteralBoolean9 = new LiteralBoolean();
			public ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10_LiteralBoolean11 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10_LiteralInteger12 = new LiteralInteger();
			public ForkNode MultipleDelegation_SameConnector_P_P_Operation_main_Fork_C = new ForkNode();
			public OpaqueBehavior MultipleDelegation_SameConnector_P_P_Operation_main_testP = new OpaqueBehavior();
				public Parameter MultipleDelegation_SameConnector_P_P_Operation_main_testP_p = new Parameter();
			public ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13_LiteralInteger14 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13_LiteralBoolean15 = new LiteralBoolean();
			public CreateObjectAction MultipleDelegation_SameConnector_P_P_Operation_main_Create_C = new CreateObjectAction();
				public OutputPin MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result = new OutputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result_LiteralUnlimitedNatural16 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result_LiteralInteger17 = new LiteralInteger();
			public ValueSpecificationAction MultipleDelegation_SameConnector_P_P_Operation_main_Value_4 = new ValueSpecificationAction();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_LiteralInteger18 = new LiteralInteger();
				public OutputPin MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result = new OutputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural19 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result_LiteralInteger20 = new LiteralInteger();
			public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result = new OutputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result_LiteralInteger21 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result_LiteralUnlimitedNatural22 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object = new InputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object_LiteralInteger23 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object_LiteralUnlimitedNatural24 = new LiteralUnlimitedNatural();
			public CallBehaviorAction MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP = new CallBehaviorAction();
				public InputPin MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p = new InputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralInteger25 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural26 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralInteger27 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28_LiteralBoolean29 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28_LiteralInteger30 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31_LiteralInteger32 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31_LiteralBoolean33 = new LiteralBoolean();
			public ControlFlow MultipleDelegation_SameConnector_P_P_Operation_main_ControlFlow34 = new ControlFlow();
			public CallOperationAction MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP_ = new CallOperationAction();
				public InputPin MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target = new InputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target_LiteralInteger35 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural36 = new LiteralUnlimitedNatural();
				public InputPin MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v = new InputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger37 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural38 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger39 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40_LiteralBoolean41 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40_LiteralInteger42 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43 = new ObjectFlow();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43_LiteralInteger44 = new LiteralInteger();
				public LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43_LiteralBoolean45 = new LiteralBoolean();
			public CallOperationAction MultipleDelegation_SameConnector_P_P_Operation_main_C_ = new CallOperationAction();
				public InputPin MultipleDelegation_SameConnector_P_P_Operation_main_C__target = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_C__target_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_C__target_LiteralInteger47 = new LiteralInteger();
				public OutputPin MultipleDelegation_SameConnector_P_P_Operation_main_C__result = new OutputPin();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralInteger48 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralUnlimitedNatural49 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralInteger50 = new LiteralInteger();
			public ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51 = new ObjectFlow();
				public LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51_LiteralBoolean52 = new LiteralBoolean();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51_LiteralInteger53 = new LiteralInteger();
			public ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b_ = new ReadStructuralFeatureAction();
				public OutputPin MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result = new OutputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result_LiteralUnlimitedNatural54 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result_LiteralInteger55 = new LiteralInteger();
				public InputPin MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object = new InputPin();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object_LiteralUnlimitedNatural56 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object_LiteralInteger57 = new LiteralInteger();
		public Class_ MultipleDelegation_SameConnector_P_P_Operation_C = new Class_();
			public Operation MultipleDelegation_SameConnector_P_P_Operation_C_C_C = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_P_Operation_C_C_C_result = new Parameter();
			public Port MultipleDelegation_SameConnector_P_P_Operation_C_q = new Port();
			public Connector MultipleDelegation_SameConnector_P_P_Operation_C_r = new Connector();
				public ConnectorEnd MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58 = new ConnectorEnd();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58_LiteralUnlimitedNatural59 = new LiteralUnlimitedNatural();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58_LiteralInteger60 = new LiteralInteger();
				public ConnectorEnd MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61 = new ConnectorEnd();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61_LiteralInteger62 = new LiteralInteger();
					public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61_LiteralUnlimitedNatural63 = new LiteralUnlimitedNatural();
			public Property MultipleDelegation_SameConnector_P_P_Operation_C_b = new Property();
				public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_C_b_LiteralUnlimitedNatural64 = new LiteralUnlimitedNatural();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_C_b_LiteralInteger65 = new LiteralInteger();
		public Class_ MultipleDelegation_SameConnector_P_P_Operation_B = new Class_();
			public Property MultipleDelegation_SameConnector_P_P_Operation_B_p = new Property();
				public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_p_LiteralInteger66 = new LiteralInteger();
			public Operation MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer_v = new Parameter();
			public InterfaceRealization MultipleDelegation_SameConnector_P_P_Operation_B_IRealization = new InterfaceRealization();
			public Activity MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity = new Activity();
				public ReadSelfAction MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this = new ReadSelfAction();
					public OutputPin MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural67 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result_LiteralInteger68 = new LiteralInteger();
				public ActivityParameterNode MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger69 = new LiteralInteger();
				public AddStructuralFeatureValueAction MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public OutputPin MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger70 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural71 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger72 = new LiteralInteger();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural73 = new LiteralUnlimitedNatural();
					public InputPin MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural74 = new LiteralUnlimitedNatural();
						public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger75 = new LiteralInteger();
				public Parameter MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_v = new Parameter();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76_LiteralInteger77 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76_LiteralBoolean78 = new LiteralBoolean();
				public ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79 = new ObjectFlow();
					public LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79_LiteralInteger80 = new LiteralInteger();
					public LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79_LiteralBoolean81 = new LiteralBoolean();
			public Operation MultipleDelegation_SameConnector_P_P_Operation_B_B_B = new Operation();
				public Parameter MultipleDelegation_SameConnector_P_P_Operation_B_B_B_result = new Parameter();
		public Association MultipleDelegation_SameConnector_P_P_Operation_R = new Association();
			public Property MultipleDelegation_SameConnector_P_P_Operation_R_y = new Property();
			public Property MultipleDelegation_SameConnector_P_P_Operation_R_x = new Property();

	public static MultipleDelegation_SameConnector_P_P_OperationModel instance()
	{
		if (instance == null)
        {
            instance = new MultipleDelegation_SameConnector_P_P_OperationModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public MultipleDelegation_SameConnector_P_P_OperationModel()
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
		// Activity MultipleDelegation_SameConnector_P_P_Operation::main
		addToElementRepository("main", MultipleDelegation_SameConnector_P_P_Operation_main);
		MultipleDelegation_SameConnector_P_P_Operation_main.setName("main");
		MultipleDelegation_SameConnector_P_P_Operation_main.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main.addOwnedBehavior(MultipleDelegation_SameConnector_P_P_Operation_main_testP);
		MultipleDelegation_SameConnector_P_P_Operation_main.addNode(MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p);
		MultipleDelegation_SameConnector_P_P_Operation_main.addNode(MultipleDelegation_SameConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_SameConnector_P_P_Operation_main.addNode(MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP_);
		MultipleDelegation_SameConnector_P_P_Operation_main.addNode(MultipleDelegation_SameConnector_P_P_Operation_main_C_);
		MultipleDelegation_SameConnector_P_P_Operation_main.addNode(MultipleDelegation_SameConnector_P_P_Operation_main_Create_C);
		MultipleDelegation_SameConnector_P_P_Operation_main.addNode(MultipleDelegation_SameConnector_P_P_Operation_main_Value_4);
		MultipleDelegation_SameConnector_P_P_Operation_main.addNode(MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p);
		MultipleDelegation_SameConnector_P_P_Operation_main.addNode(MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP);
		MultipleDelegation_SameConnector_P_P_Operation_main.addNode(MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b_);
		MultipleDelegation_SameConnector_P_P_Operation_main.addEdge(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7);
		MultipleDelegation_SameConnector_P_P_Operation_main.addEdge(MultipleDelegation_SameConnector_P_P_Operation_main_ControlFlow34);
		MultipleDelegation_SameConnector_P_P_Operation_main.addEdge(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10);
		MultipleDelegation_SameConnector_P_P_Operation_main.addEdge(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40);
		MultipleDelegation_SameConnector_P_P_Operation_main.addEdge(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43);
		MultipleDelegation_SameConnector_P_P_Operation_main.addEdge(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13);
		MultipleDelegation_SameConnector_P_P_Operation_main.addEdge(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28);
		MultipleDelegation_SameConnector_P_P_Operation_main.addEdge(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31);
		MultipleDelegation_SameConnector_P_P_Operation_main.addEdge(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51);
		// Activity MultipleDelegation_SameConnector_P_P_Operation_B::setPActivity
		addToElementRepository("setPActivity", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity.setName("setPActivity");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity.addOwnedParameter(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_v);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity.addNode(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity.addNode(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity.addNode(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity.addEdge(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity.addEdge(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode.setName("vParameterNode");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode.setParameter(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_v);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p.setName("Set this.p");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p.setStructuralFeature(MultipleDelegation_SameConnector_P_P_Operation_B_p);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p.setObject(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p.setValue(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p.setResult(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association MultipleDelegation_SameConnector_P_P_Operation::R
		addToElementRepository("R", MultipleDelegation_SameConnector_P_P_Operation_R);
		MultipleDelegation_SameConnector_P_P_Operation_R.setName("R");
		MultipleDelegation_SameConnector_P_P_Operation_R.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_R.addOwnedEnd(MultipleDelegation_SameConnector_P_P_Operation_R_x);
		MultipleDelegation_SameConnector_P_P_Operation_R.addOwnedEnd(MultipleDelegation_SameConnector_P_P_Operation_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction MultipleDelegation_SameConnector_P_P_Operation_main::Call testP
		addToElementRepository("Call testP", MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP.setName("Call testP");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP.setBehavior(MultipleDelegation_SameConnector_P_P_Operation_main_testP);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP.addArgument(MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction MultipleDelegation_SameConnector_P_P_Operation_main::Call p.setP()
		addToElementRepository("Call p.setP()", MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP_.setName("Call p.setP()");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP_.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP_.setOperation(MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP_.setTarget(MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP_.addArgument(MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v);
		// CallOperationAction MultipleDelegation_SameConnector_P_P_Operation_main::C()
		addToElementRepository("C()", MultipleDelegation_SameConnector_P_P_Operation_main_C_);
		MultipleDelegation_SameConnector_P_P_Operation_main_C_.setName("C()");
		MultipleDelegation_SameConnector_P_P_Operation_main_C_.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_main_C_.addResult(MultipleDelegation_SameConnector_P_P_Operation_main_C__result);
		MultipleDelegation_SameConnector_P_P_Operation_main_C_.setOperation(MultipleDelegation_SameConnector_P_P_Operation_C_C_C);
		MultipleDelegation_SameConnector_P_P_Operation_main_C_.setTarget(MultipleDelegation_SameConnector_P_P_Operation_main_C__target);
	}

	private void initializeClass_Instances()
	{
		// Class MultipleDelegation_SameConnector_P_P_Operation::IImpl
		addToElementRepository("IImpl", MultipleDelegation_SameConnector_P_P_Operation_IImpl);
		MultipleDelegation_SameConnector_P_P_Operation_IImpl.setName("IImpl");
		MultipleDelegation_SameConnector_P_P_Operation_IImpl.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_IImpl.addInterfaceRealization(MultipleDelegation_SameConnector_P_P_Operation_IImpl_IRealization);
		
		MultipleDelegation_SameConnector_P_P_Operation_IImpl.addOwnedOperation(MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer);
		// Class MultipleDelegation_SameConnector_P_P_Operation::C
		addToElementRepository("C", MultipleDelegation_SameConnector_P_P_Operation_C);
		MultipleDelegation_SameConnector_P_P_Operation_C.setName("C");
		MultipleDelegation_SameConnector_P_P_Operation_C.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_C.addOwnedAttribute(MultipleDelegation_SameConnector_P_P_Operation_C_q);
		MultipleDelegation_SameConnector_P_P_Operation_C.addOwnedAttribute(MultipleDelegation_SameConnector_P_P_Operation_C_b);
		
		MultipleDelegation_SameConnector_P_P_Operation_C.addOwnedConnector(MultipleDelegation_SameConnector_P_P_Operation_C_r);
		MultipleDelegation_SameConnector_P_P_Operation_C.addOwnedOperation(MultipleDelegation_SameConnector_P_P_Operation_C_C_C);
		// Class MultipleDelegation_SameConnector_P_P_Operation::B
		addToElementRepository("B", MultipleDelegation_SameConnector_P_P_Operation_B);
		MultipleDelegation_SameConnector_P_P_Operation_B.setName("B");
		MultipleDelegation_SameConnector_P_P_Operation_B.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_B.addOwnedAttribute(MultipleDelegation_SameConnector_P_P_Operation_B_p);
		MultipleDelegation_SameConnector_P_P_Operation_B.addOwnedBehavior(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity);
		MultipleDelegation_SameConnector_P_P_Operation_B.addInterfaceRealization(MultipleDelegation_SameConnector_P_P_Operation_B_IRealization);
		
		MultipleDelegation_SameConnector_P_P_Operation_B.addOwnedOperation(MultipleDelegation_SameConnector_P_P_Operation_B_B_B);
		MultipleDelegation_SameConnector_P_P_Operation_B.addOwnedOperation(MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer);
	}

	private void initializeComment_Instances()
	{
		// Comment MultipleDelegation_SameConnector_P_P_Operation::Comment0
		addToElementRepository("Comment0", MultipleDelegation_SameConnector_P_P_Operation_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment MultipleDelegation_SameConnector_P_P_Operation::Comment2
		addToElementRepository("Comment2", MultipleDelegation_SameConnector_P_P_Operation_Comment2);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector MultipleDelegation_SameConnector_P_P_Operation_C::r
		addToElementRepository("r", MultipleDelegation_SameConnector_P_P_Operation_C_r);
		MultipleDelegation_SameConnector_P_P_Operation_C_r.setName("r");
		MultipleDelegation_SameConnector_P_P_Operation_C_r.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_C_r.addEnd(MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58);
		MultipleDelegation_SameConnector_P_P_Operation_C_r.addEnd(MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61);
		MultipleDelegation_SameConnector_P_P_Operation_C_r.setType(MultipleDelegation_SameConnector_P_P_Operation_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd MultipleDelegation_SameConnector_P_P_Operation_C_r::ConnectorEnd58
		addToElementRepository("ConnectorEnd58", MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58.setUpper(-1);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58.setRole(MultipleDelegation_SameConnector_P_P_Operation_C_q);
		// ConnectorEnd MultipleDelegation_SameConnector_P_P_Operation_C_r::ConnectorEnd61
		addToElementRepository("ConnectorEnd61", MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61.setUpper(-1);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61.setLower(4);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61.setRole(MultipleDelegation_SameConnector_P_P_Operation_C_b);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow MultipleDelegation_SameConnector_P_P_Operation_main::ControlFlow34
		addToElementRepository("ControlFlow34", MultipleDelegation_SameConnector_P_P_Operation_main_ControlFlow34);
		MultipleDelegation_SameConnector_P_P_Operation_main_ControlFlow34.setName("ControlFlow34");
		MultipleDelegation_SameConnector_P_P_Operation_main_ControlFlow34.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_main_ControlFlow34.setSource(MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ControlFlow34.setTarget(MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b_);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction MultipleDelegation_SameConnector_P_P_Operation_main::Create C
		addToElementRepository("Create C", MultipleDelegation_SameConnector_P_P_Operation_main_Create_C);
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C.setName("Create C");
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C.setClassifier(MultipleDelegation_SameConnector_P_P_Operation_C);
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C.setResult(MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode MultipleDelegation_SameConnector_P_P_Operation_main::Fork C
		addToElementRepository("Fork C", MultipleDelegation_SameConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_SameConnector_P_P_Operation_main_Fork_C.setName("Fork C");
		MultipleDelegation_SameConnector_P_P_Operation_main_Fork_C.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior MultipleDelegation_SameConnector_P_P_Operation_main::testP
		addToElementRepository("testP", MultipleDelegation_SameConnector_P_P_Operation_main_testP);
		MultipleDelegation_SameConnector_P_P_Operation_main_testP.setName("testP");
		MultipleDelegation_SameConnector_P_P_Operation_main_testP.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_main_testP.addOwnedParameter(MultipleDelegation_SameConnector_P_P_Operation_main_testP_p);
		MultipleDelegation_SameConnector_P_P_Operation_main_testP.addLanguage("Java");
		MultipleDelegation_SameConnector_P_P_Operation_main_testP.addLanguage("Import");
		MultipleDelegation_SameConnector_P_P_Operation_main_testP.addBody("if(index == 1) 	{ 		System.out.println(\"Asserting c.b[1] == 4 || c.b[2] == 4 || c.b[3] == 4 || c.b[4] == 4\"); 	}  	// For some reason, during the first execution of the expansion region, its body is actually executed twice. 	// Because of that, the body is actually executaed 5 times in total. This if-statement covers that up until solved. 	if(index <= MAX_INDEX) 	{  		// Test parameter p 		int p = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 		Debug.println(\"[doBody] argument p = \" + p); 	 		System.out.println( \"c.b[\" + index + \"] == \" + p); 		success = success || (p == 4);  		if(index == MAX_INDEX) 		{  			System.out.print(\"Operation call delegated: \");  			if(success) 			{ 				System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 			} 			else 			{ 				System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 			} 		} 	}  	index++;");
		MultipleDelegation_SameConnector_P_P_Operation_main_testP.addBody("import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.Debug;");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin MultipleDelegation_SameConnector_P_P_Operation_main_Read c.p::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object.setName("object");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object.setType(MultipleDelegation_SameConnector_P_P_Operation_C);
		// InputPin MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set this.p::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object.setName("object");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object.setType(MultipleDelegation_SameConnector_P_P_Operation_B);
		// InputPin MultipleDelegation_SameConnector_P_P_Operation_main_Read b.p::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object.setName("object");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object.setType(MultipleDelegation_SameConnector_P_P_Operation_B);
		// InputPin MultipleDelegation_SameConnector_P_P_Operation_main_Call p.setP()::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target.setName("target");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target.setType(MultipleDelegation_SameConnector_P_P_Operation_I);
		// InputPin MultipleDelegation_SameConnector_P_P_Operation_main_Read c.b[]::object
		addToElementRepository("object", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object.setName("object");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object.setType(MultipleDelegation_SameConnector_P_P_Operation_C);
		// InputPin MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set this.p::value
		addToElementRepository("value", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value.setName("value");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_SameConnector_P_P_Operation_main_Call testP::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p.setName("p");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_SameConnector_P_P_Operation_main_Call p.setP()::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v.setName("v");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin MultipleDelegation_SameConnector_P_P_Operation_main_C()::target
		addToElementRepository("target", MultipleDelegation_SameConnector_P_P_Operation_main_C__target);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__target.setName("target");
		MultipleDelegation_SameConnector_P_P_Operation_main_C__target.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__target.setType(MultipleDelegation_SameConnector_P_P_Operation_C);
	}

	private void initializeInterface_Instances()
	{
		// Interface MultipleDelegation_SameConnector_P_P_Operation::I
		addToElementRepository("I", MultipleDelegation_SameConnector_P_P_Operation_I);
		MultipleDelegation_SameConnector_P_P_Operation_I.setName("I");
		MultipleDelegation_SameConnector_P_P_Operation_I.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_I.addOwnedOperation(MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization MultipleDelegation_SameConnector_P_P_Operation_IImpl::IRealization
		addToElementRepository("IRealization", MultipleDelegation_SameConnector_P_P_Operation_IImpl_IRealization);
		MultipleDelegation_SameConnector_P_P_Operation_IImpl_IRealization.setName("IRealization");
		MultipleDelegation_SameConnector_P_P_Operation_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_IImpl_IRealization.setContract(MultipleDelegation_SameConnector_P_P_Operation_I);
		// InterfaceRealization MultipleDelegation_SameConnector_P_P_Operation_B::IRealization
		addToElementRepository("IRealization", MultipleDelegation_SameConnector_P_P_Operation_B_IRealization);
		MultipleDelegation_SameConnector_P_P_Operation_B_IRealization.setName("IRealization");
		MultipleDelegation_SameConnector_P_P_Operation_B_IRealization.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_IRealization.setContract(MultipleDelegation_SameConnector_P_P_Operation_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79::LiteralBoolean81
		addToElementRepository("LiteralBoolean81", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79_LiteralBoolean81);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79_LiteralBoolean81.setName("LiteralBoolean81");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79_LiteralBoolean81.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79_LiteralBoolean81.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28::LiteralBoolean29
		addToElementRepository("LiteralBoolean29", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28_LiteralBoolean29);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28_LiteralBoolean29.setName("LiteralBoolean29");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28_LiteralBoolean29.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28_LiteralBoolean29.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40::LiteralBoolean41
		addToElementRepository("LiteralBoolean41", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40_LiteralBoolean41);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40_LiteralBoolean41.setName("LiteralBoolean41");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40_LiteralBoolean41.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40_LiteralBoolean41.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10::LiteralBoolean11
		addToElementRepository("LiteralBoolean11", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10_LiteralBoolean11);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10_LiteralBoolean11.setName("LiteralBoolean11");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10_LiteralBoolean11.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10_LiteralBoolean11.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51::LiteralBoolean52
		addToElementRepository("LiteralBoolean52", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51_LiteralBoolean52);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51_LiteralBoolean52.setName("LiteralBoolean52");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51_LiteralBoolean52.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51_LiteralBoolean52.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31::LiteralBoolean33
		addToElementRepository("LiteralBoolean33", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31_LiteralBoolean33);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31_LiteralBoolean33.setName("LiteralBoolean33");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31_LiteralBoolean33.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31_LiteralBoolean33.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76::LiteralBoolean78
		addToElementRepository("LiteralBoolean78", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76_LiteralBoolean78);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76_LiteralBoolean78.setName("LiteralBoolean78");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76_LiteralBoolean78.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76_LiteralBoolean78.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13::LiteralBoolean15
		addToElementRepository("LiteralBoolean15", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13_LiteralBoolean15);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13_LiteralBoolean15.setName("LiteralBoolean15");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13_LiteralBoolean15.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13_LiteralBoolean15.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43::LiteralBoolean45
		addToElementRepository("LiteralBoolean45", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43_LiteralBoolean45);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43_LiteralBoolean45.setName("LiteralBoolean45");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43_LiteralBoolean45.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43_LiteralBoolean45.setValue(true);
		// LiteralBoolean MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7::LiteralBoolean9
		addToElementRepository("LiteralBoolean9", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7_LiteralBoolean9);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7_LiteralBoolean9.setName("LiteralBoolean9");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7_LiteralBoolean9.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7_LiteralBoolean9.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set this.p_result::LiteralInteger70
		addToElementRepository("LiteralInteger70", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger70);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger70.setName("LiteralInteger70");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger70.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralInteger70.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31::LiteralInteger32
		addToElementRepository("LiteralInteger32", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31_LiteralInteger32);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31_LiteralInteger32.setName("LiteralInteger32");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31_LiteralInteger32.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31_LiteralInteger32.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Read c.b[]_object::LiteralInteger57
		addToElementRepository("LiteralInteger57", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object_LiteralInteger57);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object_LiteralInteger57.setName("LiteralInteger57");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object_LiteralInteger57.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object_LiteralInteger57.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Call testP_p::LiteralInteger27
		addToElementRepository("LiteralInteger27", MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralInteger27);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralInteger27.setName("LiteralInteger27");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralInteger27.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralInteger27.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40::LiteralInteger42
		addToElementRepository("LiteralInteger42", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40_LiteralInteger42);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40_LiteralInteger42.setName("LiteralInteger42");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40_LiteralInteger42.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40_LiteralInteger42.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Call p.setP()_v::LiteralInteger39
		addToElementRepository("LiteralInteger39", MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger39);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger39.setName("LiteralInteger39");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger39.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger39.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51::LiteralInteger53
		addToElementRepository("LiteralInteger53", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51_LiteralInteger53);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51_LiteralInteger53.setName("LiteralInteger53");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51_LiteralInteger53.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51_LiteralInteger53.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_C()_result::LiteralInteger50
		addToElementRepository("LiteralInteger50", MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralInteger50);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralInteger50.setName("LiteralInteger50");
		MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralInteger50.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralInteger50.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28::LiteralInteger30
		addToElementRepository("LiteralInteger30", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28_LiteralInteger30);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28_LiteralInteger30.setName("LiteralInteger30");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28_LiteralInteger30.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28_LiteralInteger30.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79::LiteralInteger80
		addToElementRepository("LiteralInteger80", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79_LiteralInteger80);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79_LiteralInteger80.setName("LiteralInteger80");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79_LiteralInteger80.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79_LiteralInteger80.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Value(4)::LiteralInteger18
		addToElementRepository("LiteralInteger18", MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_LiteralInteger18);
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_LiteralInteger18.setName("LiteralInteger18");
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_LiteralInteger18.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_LiteralInteger18.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Read b.p_object::LiteralInteger23
		addToElementRepository("LiteralInteger23", MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object_LiteralInteger23);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object_LiteralInteger23.setName("LiteralInteger23");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object_LiteralInteger23.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object_LiteralInteger23.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set this.p_object::LiteralInteger72
		addToElementRepository("LiteralInteger72", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger72);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger72.setName("LiteralInteger72");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger72.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralInteger72.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Call p.setP()_v::LiteralInteger37
		addToElementRepository("LiteralInteger37", MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger37);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger37.setName("LiteralInteger37");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger37.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralInteger37.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_C()_result::LiteralInteger48
		addToElementRepository("LiteralInteger48", MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralInteger48);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralInteger48.setName("LiteralInteger48");
		MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralInteger48.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralInteger48.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode::LiteralInteger69
		addToElementRepository("LiteralInteger69", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger69);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger69.setName("LiteralInteger69");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger69.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode_LiteralInteger69.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Read b.p_result::LiteralInteger21
		addToElementRepository("LiteralInteger21", MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result_LiteralInteger21);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result_LiteralInteger21.setName("LiteralInteger21");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result_LiteralInteger21.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result_LiteralInteger21.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76::LiteralInteger77
		addToElementRepository("LiteralInteger77", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76_LiteralInteger77);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76_LiteralInteger77.setName("LiteralInteger77");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76_LiteralInteger77.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76_LiteralInteger77.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_C()_target::LiteralInteger47
		addToElementRepository("LiteralInteger47", MultipleDelegation_SameConnector_P_P_Operation_main_C__target_LiteralInteger47);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__target_LiteralInteger47.setName("LiteralInteger47");
		MultipleDelegation_SameConnector_P_P_Operation_main_C__target_LiteralInteger47.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__target_LiteralInteger47.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result::LiteralInteger68
		addToElementRepository("LiteralInteger68", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result_LiteralInteger68);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result_LiteralInteger68.setName("LiteralInteger68");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result_LiteralInteger68.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result_LiteralInteger68.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_C_b::LiteralInteger65
		addToElementRepository("LiteralInteger65", MultipleDelegation_SameConnector_P_P_Operation_C_b_LiteralInteger65);
		MultipleDelegation_SameConnector_P_P_Operation_C_b_LiteralInteger65.setName("LiteralInteger65");
		MultipleDelegation_SameConnector_P_P_Operation_C_b_LiteralInteger65.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_C_b_LiteralInteger65.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Read c.p_object::LiteralInteger4
		addToElementRepository("LiteralInteger4", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object_LiteralInteger4);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object_LiteralInteger4.setName("LiteralInteger4");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object_LiteralInteger4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object_LiteralInteger4.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Call testP_p::LiteralInteger25
		addToElementRepository("LiteralInteger25", MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralInteger25);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralInteger25.setName("LiteralInteger25");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralInteger25.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralInteger25.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61::LiteralInteger62
		addToElementRepository("LiteralInteger62", MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61_LiteralInteger62);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61_LiteralInteger62.setName("LiteralInteger62");
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61_LiteralInteger62.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61_LiteralInteger62.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7::LiteralInteger8
		addToElementRepository("LiteralInteger8", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7_LiteralInteger8);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7_LiteralInteger8.setName("LiteralInteger8");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7_LiteralInteger8.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7_LiteralInteger8.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set this.p_value::LiteralInteger75
		addToElementRepository("LiteralInteger75", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger75);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger75.setName("LiteralInteger75");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger75.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralInteger75.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13::LiteralInteger14
		addToElementRepository("LiteralInteger14", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13_LiteralInteger14);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13_LiteralInteger14.setName("LiteralInteger14");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13_LiteralInteger14.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13_LiteralInteger14.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_B_p::LiteralInteger66
		addToElementRepository("LiteralInteger66", MultipleDelegation_SameConnector_P_P_Operation_B_p_LiteralInteger66);
		MultipleDelegation_SameConnector_P_P_Operation_B_p_LiteralInteger66.setName("LiteralInteger66");
		MultipleDelegation_SameConnector_P_P_Operation_B_p_LiteralInteger66.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_p_LiteralInteger66.setValue(0);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43::LiteralInteger44
		addToElementRepository("LiteralInteger44", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43_LiteralInteger44);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43_LiteralInteger44.setName("LiteralInteger44");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43_LiteralInteger44.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43_LiteralInteger44.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Call p.setP()_target::LiteralInteger35
		addToElementRepository("LiteralInteger35", MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target_LiteralInteger35);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target_LiteralInteger35.setName("LiteralInteger35");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target_LiteralInteger35.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target_LiteralInteger35.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Read c.p_result::LiteralInteger6
		addToElementRepository("LiteralInteger6", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result_LiteralInteger6);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result_LiteralInteger6.setName("LiteralInteger6");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result_LiteralInteger6.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result_LiteralInteger6.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Create C_result::LiteralInteger17
		addToElementRepository("LiteralInteger17", MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result_LiteralInteger17);
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result_LiteralInteger17.setName("LiteralInteger17");
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result_LiteralInteger17.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result_LiteralInteger17.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Read c.b[]_result::LiteralInteger55
		addToElementRepository("LiteralInteger55", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result_LiteralInteger55);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result_LiteralInteger55.setName("LiteralInteger55");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result_LiteralInteger55.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result_LiteralInteger55.setValue(4);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10::LiteralInteger12
		addToElementRepository("LiteralInteger12", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10_LiteralInteger12);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10_LiteralInteger12.setName("LiteralInteger12");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10_LiteralInteger12.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10_LiteralInteger12.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_main_Value(4)_result::LiteralInteger20
		addToElementRepository("LiteralInteger20", MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result_LiteralInteger20);
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result_LiteralInteger20.setName("LiteralInteger20");
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result_LiteralInteger20.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result_LiteralInteger20.setValue(1);
		// LiteralInteger MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58::LiteralInteger60
		addToElementRepository("LiteralInteger60", MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58_LiteralInteger60);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58_LiteralInteger60.setName("LiteralInteger60");
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58_LiteralInteger60.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58_LiteralInteger60.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Value(4)_result::LiteralUnlimitedNatural19
		addToElementRepository("LiteralUnlimitedNatural19", MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural19);
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural19.setName("LiteralUnlimitedNatural19");
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural19.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result_LiteralUnlimitedNatural19.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Read c.b[]_object::LiteralUnlimitedNatural56
		addToElementRepository("LiteralUnlimitedNatural56", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object_LiteralUnlimitedNatural56);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object_LiteralUnlimitedNatural56.setName("LiteralUnlimitedNatural56");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object_LiteralUnlimitedNatural56.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object_LiteralUnlimitedNatural56.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58::LiteralUnlimitedNatural59
		addToElementRepository("LiteralUnlimitedNatural59", MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58_LiteralUnlimitedNatural59);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58_LiteralUnlimitedNatural59.setName("LiteralUnlimitedNatural59");
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58_LiteralUnlimitedNatural59.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd58_LiteralUnlimitedNatural59.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Read c.b[]_result::LiteralUnlimitedNatural54
		addToElementRepository("LiteralUnlimitedNatural54", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result_LiteralUnlimitedNatural54);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result_LiteralUnlimitedNatural54.setName("LiteralUnlimitedNatural54");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result_LiteralUnlimitedNatural54.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result_LiteralUnlimitedNatural54.setValue(4);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Call p.setP()_v::LiteralUnlimitedNatural38
		addToElementRepository("LiteralUnlimitedNatural38", MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural38);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural38.setName("LiteralUnlimitedNatural38");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural38.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v_LiteralUnlimitedNatural38.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Read b.p_result::LiteralUnlimitedNatural22
		addToElementRepository("LiteralUnlimitedNatural22", MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result_LiteralUnlimitedNatural22);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result_LiteralUnlimitedNatural22.setName("LiteralUnlimitedNatural22");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result_LiteralUnlimitedNatural22.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result_LiteralUnlimitedNatural22.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result::LiteralUnlimitedNatural67
		addToElementRepository("LiteralUnlimitedNatural67", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural67);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural67.setName("LiteralUnlimitedNatural67");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural67.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result_LiteralUnlimitedNatural67.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Read c.p_object::LiteralUnlimitedNatural3
		addToElementRepository("LiteralUnlimitedNatural3", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object_LiteralUnlimitedNatural3);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object_LiteralUnlimitedNatural3.setName("LiteralUnlimitedNatural3");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object_LiteralUnlimitedNatural3.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object_LiteralUnlimitedNatural3.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Read b.p_object::LiteralUnlimitedNatural24
		addToElementRepository("LiteralUnlimitedNatural24", MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object_LiteralUnlimitedNatural24);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object_LiteralUnlimitedNatural24.setName("LiteralUnlimitedNatural24");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object_LiteralUnlimitedNatural24.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object_LiteralUnlimitedNatural24.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Read c.p_result::LiteralUnlimitedNatural5
		addToElementRepository("LiteralUnlimitedNatural5", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result_LiteralUnlimitedNatural5);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result_LiteralUnlimitedNatural5.setName("LiteralUnlimitedNatural5");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result_LiteralUnlimitedNatural5.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result_LiteralUnlimitedNatural5.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural74
		addToElementRepository("LiteralUnlimitedNatural74", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural74);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural74.setName("LiteralUnlimitedNatural74");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural74.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural74.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_C()_target::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", MultipleDelegation_SameConnector_P_P_Operation_main_C__target_LiteralUnlimitedNatural46);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__target_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		MultipleDelegation_SameConnector_P_P_Operation_main_C__target_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__target_LiteralUnlimitedNatural46.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Call p.setP()_target::LiteralUnlimitedNatural36
		addToElementRepository("LiteralUnlimitedNatural36", MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural36);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural36.setName("LiteralUnlimitedNatural36");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural36.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target_LiteralUnlimitedNatural36.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Create C_result::LiteralUnlimitedNatural16
		addToElementRepository("LiteralUnlimitedNatural16", MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result_LiteralUnlimitedNatural16);
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result_LiteralUnlimitedNatural16.setName("LiteralUnlimitedNatural16");
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result_LiteralUnlimitedNatural16.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result_LiteralUnlimitedNatural16.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_C()_result::LiteralUnlimitedNatural49
		addToElementRepository("LiteralUnlimitedNatural49", MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralUnlimitedNatural49);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralUnlimitedNatural49.setName("LiteralUnlimitedNatural49");
		MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralUnlimitedNatural49.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__result_LiteralUnlimitedNatural49.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_main_Call testP_p::LiteralUnlimitedNatural26
		addToElementRepository("LiteralUnlimitedNatural26", MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural26);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural26.setName("LiteralUnlimitedNatural26");
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural26.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p_LiteralUnlimitedNatural26.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_C_b::LiteralUnlimitedNatural64
		addToElementRepository("LiteralUnlimitedNatural64", MultipleDelegation_SameConnector_P_P_Operation_C_b_LiteralUnlimitedNatural64);
		MultipleDelegation_SameConnector_P_P_Operation_C_b_LiteralUnlimitedNatural64.setName("LiteralUnlimitedNatural64");
		MultipleDelegation_SameConnector_P_P_Operation_C_b_LiteralUnlimitedNatural64.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_C_b_LiteralUnlimitedNatural64.setValue(4);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61::LiteralUnlimitedNatural63
		addToElementRepository("LiteralUnlimitedNatural63", MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61_LiteralUnlimitedNatural63);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61_LiteralUnlimitedNatural63.setName("LiteralUnlimitedNatural63");
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61_LiteralUnlimitedNatural63.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_C_r_ConnectorEnd61_LiteralUnlimitedNatural63.setValue(-1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural71
		addToElementRepository("LiteralUnlimitedNatural71", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural71);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural71.setName("LiteralUnlimitedNatural71");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural71.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural71.setValue(1);
		// LiteralUnlimitedNatural MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural73
		addToElementRepository("LiteralUnlimitedNatural73", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural73);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural73.setName("LiteralUnlimitedNatural73");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural73.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural73.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main::ObjectFlow7
		addToElementRepository("ObjectFlow7", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7.setName("ObjectFlow7");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7.setSource(MultipleDelegation_SameConnector_P_P_Operation_main_C__result);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7.setTarget(MultipleDelegation_SameConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7.setGuard(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow7_LiteralBoolean9);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main::ObjectFlow10
		addToElementRepository("ObjectFlow10", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10.setName("ObjectFlow10");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10.setSource(MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10.setTarget(MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10.setGuard(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow10_LiteralBoolean11);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main::ObjectFlow43
		addToElementRepository("ObjectFlow43", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43.setName("ObjectFlow43");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43.setSource(MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43.setTarget(MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__v);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43.setGuard(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow43_LiteralBoolean45);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main::ObjectFlow40
		addToElementRepository("ObjectFlow40", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40.setName("ObjectFlow40");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40.setSource(MultipleDelegation_SameConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40.setTarget(MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40.setGuard(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow40_LiteralBoolean41);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main::ObjectFlow13
		addToElementRepository("ObjectFlow13", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13.setName("ObjectFlow13");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13.setSource(MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13.setTarget(MultipleDelegation_SameConnector_P_P_Operation_main_Call_p_setP__target);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13.setGuard(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow13_LiteralBoolean15);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main::ObjectFlow28
		addToElementRepository("ObjectFlow28", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28.setName("ObjectFlow28");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28.setSource(MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28.setTarget(MultipleDelegation_SameConnector_P_P_Operation_main_C__target);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28.setGuard(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow28_LiteralBoolean29);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main::ObjectFlow31
		addToElementRepository("ObjectFlow31", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31.setName("ObjectFlow31");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31.setSource(MultipleDelegation_SameConnector_P_P_Operation_main_Fork_C);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31.setTarget(MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31.setGuard(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow31_LiteralBoolean33);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_main::ObjectFlow51
		addToElementRepository("ObjectFlow51", MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51.setName("ObjectFlow51");
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51.setSource(MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51.setTarget(MultipleDelegation_SameConnector_P_P_Operation_main_Call_testP_p);
		MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51.setGuard(MultipleDelegation_SameConnector_P_P_Operation_main_ObjectFlow51_LiteralBoolean52);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity::ObjectFlow76
		addToElementRepository("ObjectFlow76", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76.setName("ObjectFlow76");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76.setSource(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76.setTarget(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_object);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76.setGuard(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow76_LiteralBoolean78);
		// ObjectFlow MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity::ObjectFlow79
		addToElementRepository("ObjectFlow79", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79.setName("ObjectFlow79");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79.setSource(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_vParameterNode);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79.setTarget(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_value);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79.setGuard(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_ObjectFlow79_LiteralBoolean81);
	}

	private void initializeOperation_Instances()
	{
		// Operation MultipleDelegation_SameConnector_P_P_Operation_C::C_C
		addToElementRepository("C_C", MultipleDelegation_SameConnector_P_P_Operation_C_C_C);
		MultipleDelegation_SameConnector_P_P_Operation_C_C_C.setName("C");
		MultipleDelegation_SameConnector_P_P_Operation_C_C_C.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_C_C_C.addOwnedParameter(MultipleDelegation_SameConnector_P_P_Operation_C_C_C_result);
		MultipleDelegation_SameConnector_P_P_Operation_C_C_C.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation MultipleDelegation_SameConnector_P_P_Operation_I::setP_Integer
		addToElementRepository("setP_Integer", MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer);
		MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer.setName("setP");
		MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer.addOwnedParameter(MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer_v);
		// Operation MultipleDelegation_SameConnector_P_P_Operation_IImpl::setP_Integer
		addToElementRepository("setP_Integer", MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer);
		MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer.setName("setP");
		MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer.addOwnedParameter(MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer_v);
		// Operation MultipleDelegation_SameConnector_P_P_Operation_B::setP_Integer
		addToElementRepository("setP_Integer", MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer);
		MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer.setName("setP");
		MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer.addOwnedParameter(MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer_v);
		MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer.addMethod(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity);
		// Operation MultipleDelegation_SameConnector_P_P_Operation_B::B_B
		addToElementRepository("B_B", MultipleDelegation_SameConnector_P_P_Operation_B_B_B);
		MultipleDelegation_SameConnector_P_P_Operation_B_B_B.setName("B");
		MultipleDelegation_SameConnector_P_P_Operation_B_B_B.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_B_B.addOwnedParameter(MultipleDelegation_SameConnector_P_P_Operation_B_B_B_result);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin MultipleDelegation_SameConnector_P_P_Operation_main_Read c.b[]::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result.setName("result");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result.setType(MultipleDelegation_SameConnector_P_P_Operation_B);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result.setUpper(4);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result.setLower(4);
		// OutputPin MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set this.p::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_Set_this_p_result.setType(MultipleDelegation_SameConnector_P_P_Operation_B);
		// OutputPin MultipleDelegation_SameConnector_P_P_Operation_main_Read b.p::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_SameConnector_P_P_Operation_main_Value(4)::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result);
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result.setType(MultipleDelegation_SameConnector_P_P_Operation_B);
		// OutputPin MultipleDelegation_SameConnector_P_P_Operation_main_Create C::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result);
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Create_C_result.setType(MultipleDelegation_SameConnector_P_P_Operation_C);
		// OutputPin MultipleDelegation_SameConnector_P_P_Operation_main_C()::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Operation_main_C__result);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__result.setName("result");
		MultipleDelegation_SameConnector_P_P_Operation_main_C__result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_C__result.setType(MultipleDelegation_SameConnector_P_P_Operation_C);
		// OutputPin MultipleDelegation_SameConnector_P_P_Operation_main_Read c.p::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result.setType(MultipleDelegation_SameConnector_P_P_Operation_IImpl);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport MultipleDelegation_SameConnector_P_P_Operation::PackageImport1
		addToElementRepository("PackageImport1", MultipleDelegation_SameConnector_P_P_Operation_PackageImport1);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter MultipleDelegation_SameConnector_P_P_Operation_main_testP::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_P_Operation_main_testP_p);
		MultipleDelegation_SameConnector_P_P_Operation_main_testP_p.setName("p");
		MultipleDelegation_SameConnector_P_P_Operation_main_testP_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_main_testP_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer_v);
		MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer_v.setName("v");
		MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_SameConnector_P_P_Operation_B_B_B::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Operation_B_B_B_result);
		MultipleDelegation_SameConnector_P_P_Operation_B_B_B_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Operation_B_B_B_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_B_B_B_result.setType(MultipleDelegation_SameConnector_P_P_Operation_B);
		MultipleDelegation_SameConnector_P_P_Operation_B_B_B_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_v);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_v.setName("v");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_SameConnector_P_P_Operation_C_C_C::result
		addToElementRepository("result", MultipleDelegation_SameConnector_P_P_Operation_C_C_C_result);
		MultipleDelegation_SameConnector_P_P_Operation_C_C_C_result.setName("result");
		MultipleDelegation_SameConnector_P_P_Operation_C_C_C_result.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_C_C_C_result.setType(MultipleDelegation_SameConnector_P_P_Operation_C);
		MultipleDelegation_SameConnector_P_P_Operation_C_C_C_result.setDirection(ParameterDirectionKind.return_);
		// Parameter MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer_v);
		MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer_v.setName("v");
		MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer::v
		addToElementRepository("v", MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer_v);
		MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer_v.setName("v");
		MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializePort_Instances()
	{
		// Port MultipleDelegation_SameConnector_P_P_Operation_C::q
		addToElementRepository("q", MultipleDelegation_SameConnector_P_P_Operation_C_q);
		MultipleDelegation_SameConnector_P_P_Operation_C_q.setName("q");
		MultipleDelegation_SameConnector_P_P_Operation_C_q.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_C_q.setType(MultipleDelegation_SameConnector_P_P_Operation_IImpl);
		MultipleDelegation_SameConnector_P_P_Operation_C_q.setAggregation(AggregationKind.composite);
		MultipleDelegation_SameConnector_P_P_Operation_C_q.isService = true;
		MultipleDelegation_SameConnector_P_P_Operation_C_q.addProvided(MultipleDelegation_SameConnector_P_P_Operation_I);
	}

	private void initializeProperty_Instances()
	{
		// Property MultipleDelegation_SameConnector_P_P_Operation_B::p
		addToElementRepository("p", MultipleDelegation_SameConnector_P_P_Operation_B_p);
		MultipleDelegation_SameConnector_P_P_Operation_B_p.setName("p");
		MultipleDelegation_SameConnector_P_P_Operation_B_p.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		MultipleDelegation_SameConnector_P_P_Operation_B_p.setDefaultValue(MultipleDelegation_SameConnector_P_P_Operation_B_p_LiteralInteger66);
		// Property MultipleDelegation_SameConnector_P_P_Operation_R::y
		addToElementRepository("y", MultipleDelegation_SameConnector_P_P_Operation_R_y);
		MultipleDelegation_SameConnector_P_P_Operation_R_y.setName("y");
		MultipleDelegation_SameConnector_P_P_Operation_R_y.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_R_y.setType(MultipleDelegation_SameConnector_P_P_Operation_IImpl);
		// Property MultipleDelegation_SameConnector_P_P_Operation_C::b
		addToElementRepository("b", MultipleDelegation_SameConnector_P_P_Operation_C_b);
		MultipleDelegation_SameConnector_P_P_Operation_C_b.setName("b");
		MultipleDelegation_SameConnector_P_P_Operation_C_b.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_C_b.setUpper(4);
		MultipleDelegation_SameConnector_P_P_Operation_C_b.setLower(4);
		MultipleDelegation_SameConnector_P_P_Operation_C_b.setType(MultipleDelegation_SameConnector_P_P_Operation_B);
		MultipleDelegation_SameConnector_P_P_Operation_C_b.setAggregation(AggregationKind.composite);
		// Property MultipleDelegation_SameConnector_P_P_Operation_R::x
		addToElementRepository("x", MultipleDelegation_SameConnector_P_P_Operation_R_x);
		MultipleDelegation_SameConnector_P_P_Operation_R_x.setName("x");
		MultipleDelegation_SameConnector_P_P_Operation_R_x.setVisibility(VisibilityKind.public_);
		
		MultipleDelegation_SameConnector_P_P_Operation_R_x.setType(MultipleDelegation_SameConnector_P_P_Operation_B);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity::this
		addToElementRepository("this", MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this.setName("this");
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this.setResult(MultipleDelegation_SameConnector_P_P_Operation_B_setPActivity_this_result);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Operation_main::Read c.p
		addToElementRepository("Read c.p", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p.setName("Read c.p");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p.setStructuralFeature(MultipleDelegation_SameConnector_P_P_Operation_C_q);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p.setObject(MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_object);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p.setResult(MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Operation_main::Read b.p
		addToElementRepository("Read b.p", MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p.setName("Read b.p");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p.setStructuralFeature(MultipleDelegation_SameConnector_P_P_Operation_B_p);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p.setObject(MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_object);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p.setResult(MultipleDelegation_SameConnector_P_P_Operation_main_Read_b_p_result);
		// ReadStructuralFeatureAction MultipleDelegation_SameConnector_P_P_Operation_main::Read c.b[]
		addToElementRepository("Read c.b[]", MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b_.setName("Read c.b[]");
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b_.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b_.setStructuralFeature(MultipleDelegation_SameConnector_P_P_Operation_C_b);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b_.setObject(MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__object);
		MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b_.setResult(MultipleDelegation_SameConnector_P_P_Operation_main_Read_c_b__result);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction MultipleDelegation_SameConnector_P_P_Operation_main::Value(4)
		addToElementRepository("Value(4)", MultipleDelegation_SameConnector_P_P_Operation_main_Value_4);
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4.setName("Value(4)");
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4.setVisibility(VisibilityKind.public_);
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4.setValue(MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_LiteralInteger18);
		MultipleDelegation_SameConnector_P_P_Operation_main_Value_4.setResult(MultipleDelegation_SameConnector_P_P_Operation_main_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // MultipleDelegation_SameConnector_P_P_OperationModel
