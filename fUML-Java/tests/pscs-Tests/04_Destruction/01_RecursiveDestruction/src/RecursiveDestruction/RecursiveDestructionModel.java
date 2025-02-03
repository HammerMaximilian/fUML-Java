/*
 * RecursiveDestructionModel.java
 * 
 * Auto-generated file
 */
package RecursiveDestruction;

import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.actions.ReadExtentAction;
import uml.structuredclassifiers.Connector;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.InterfaceRealization;
import uml.activities.Activity;
import uml.actions.OutputPin;
import uml.actions.CallOperationAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.commonstructure.Comment;
import uml.simpleclassifiers.Interface;
import uml.classification.Parameter;
import uml.classification.Operation;
import uml.commonstructure.PackageImport;
import uml.classification.AggregationKind;
import uml.activities.ControlFlow;
import uml.actions.CreateObjectAction;
import uml.commonbehavior.FunctionBehavior;
import uml.actions.CallBehaviorAction;
import uml.structuredclassifiers.Association;
import uml.classification.Property;
import utils.primitivetypes.PrimitiveTypesModel;
import uml.actions.DestroyObjectAction;
import uml.classification.ParameterDirectionKind;
import uml.simpleclassifiers.PrimitiveType;
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

public class RecursiveDestructionModel extends InMemoryModel
{
	private static RecursiveDestructionModel instance;

	/*
	 * Model RecursiveDestruction
	 */
	public Package RecursiveDestruction = new Package();
		public Comment RecursiveDestruction_Comment0 = new Comment();
		public Association RecursiveDestruction_R = new Association();
			public Property RecursiveDestruction_R_y = new Property();
				public LiteralInteger RecursiveDestruction_R_y_LiteralInteger1 = new LiteralInteger();
				public LiteralUnlimitedNatural RecursiveDestruction_R_y_LiteralUnlimitedNatural2 = new LiteralUnlimitedNatural();
			public Property RecursiveDestruction_R_x = new Property();
				public LiteralUnlimitedNatural RecursiveDestruction_R_x_LiteralUnlimitedNatural3 = new LiteralUnlimitedNatural();
				public LiteralInteger RecursiveDestruction_R_x_LiteralInteger4 = new LiteralInteger();
		public PackageImport RecursiveDestruction_PackageImport5 = new PackageImport();
		public Class_ RecursiveDestruction_IImpl = new Class_();
			public InterfaceRealization RecursiveDestruction_IImpl_I_Realization = new InterfaceRealization();
		public Comment RecursiveDestruction_Comment6 = new Comment();
		public Interface RecursiveDestruction_I = new Interface();
		public Activity RecursiveDestruction_main = new Activity();
			public CallBehaviorAction RecursiveDestruction_main_Call_assertExtentOfIImpl = new CallBehaviorAction();
				public InputPin RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList = new InputPin();
					public LiteralUnlimitedNatural RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralUnlimitedNatural7 = new LiteralUnlimitedNatural();
					public LiteralInteger RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralInteger8 = new LiteralInteger();
					public LiteralInteger RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralInteger9 = new LiteralInteger();
			public OpaqueBehavior RecursiveDestruction_main_assertExtentOfIImpl = new OpaqueBehavior();
				public Parameter RecursiveDestruction_main_assertExtentOfIImpl_iImplList = new Parameter();
					public LiteralUnlimitedNatural RecursiveDestruction_main_assertExtentOfIImpl_iImplList_LiteralUnlimitedNatural10 = new LiteralUnlimitedNatural();
					public LiteralInteger RecursiveDestruction_main_assertExtentOfIImpl_iImplList_LiteralInteger11 = new LiteralInteger();
			public ControlFlow RecursiveDestruction_main_ControlFlow12 = new ControlFlow();
			public ObjectFlow RecursiveDestruction_main_ObjectFlow13 = new ObjectFlow();
				public LiteralBoolean RecursiveDestruction_main_ObjectFlow13_LiteralBoolean14 = new LiteralBoolean();
				public LiteralInteger RecursiveDestruction_main_ObjectFlow13_LiteralInteger15 = new LiteralInteger();
			public ReadExtentAction RecursiveDestruction_main_Extent_of_B_before_destruction = new ReadExtentAction();
				public OutputPin RecursiveDestruction_main_Extent_of_B_before_destruction_bExtent = new OutputPin();
			public OpaqueBehavior RecursiveDestruction_main_assertExtentOfB = new OpaqueBehavior();
				public Parameter RecursiveDestruction_main_assertExtentOfB_bList = new Parameter();
					public LiteralUnlimitedNatural RecursiveDestruction_main_assertExtentOfB_bList_LiteralUnlimitedNatural16 = new LiteralUnlimitedNatural();
					public LiteralInteger RecursiveDestruction_main_assertExtentOfB_bList_LiteralInteger17 = new LiteralInteger();
			public ObjectFlow RecursiveDestruction_main_ObjectFlow18 = new ObjectFlow();
				public LiteralBoolean RecursiveDestruction_main_ObjectFlow18_LiteralBoolean19 = new LiteralBoolean();
				public LiteralInteger RecursiveDestruction_main_ObjectFlow18_LiteralInteger20 = new LiteralInteger();
			public ControlFlow RecursiveDestruction_main_ControlFlow21 = new ControlFlow();
			public CallBehaviorAction RecursiveDestruction_main_Call_numberOfIImplInstances = new CallBehaviorAction();
				public InputPin RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList = new InputPin();
					public LiteralInteger RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralInteger22 = new LiteralInteger();
					public LiteralInteger RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralInteger23 = new LiteralInteger();
					public LiteralUnlimitedNatural RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralUnlimitedNatural24 = new LiteralUnlimitedNatural();
			public ReadExtentAction RecursiveDestruction_main_Extent_of_C_after_destruction = new ReadExtentAction();
				public OutputPin RecursiveDestruction_main_Extent_of_C_after_destruction_cExtent = new OutputPin();
			public ReadExtentAction RecursiveDestruction_main_Extent_of_B_after_destruction = new ReadExtentAction();
				public OutputPin RecursiveDestruction_main_Extent_of_B_after_destruction_bExtent = new OutputPin();
			public OpaqueBehavior RecursiveDestruction_main_assertExtentOfC = new OpaqueBehavior();
				public Parameter RecursiveDestruction_main_assertExtentOfC_cList = new Parameter();
					public LiteralUnlimitedNatural RecursiveDestruction_main_assertExtentOfC_cList_LiteralUnlimitedNatural25 = new LiteralUnlimitedNatural();
					public LiteralInteger RecursiveDestruction_main_assertExtentOfC_cList_LiteralInteger26 = new LiteralInteger();
			public CallBehaviorAction RecursiveDestruction_main_Call_numberOfBInstances = new CallBehaviorAction();
				public InputPin RecursiveDestruction_main_Call_numberOfBInstances_bList = new InputPin();
					public LiteralInteger RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralInteger27 = new LiteralInteger();
					public LiteralInteger RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralInteger28 = new LiteralInteger();
					public LiteralUnlimitedNatural RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralUnlimitedNatural29 = new LiteralUnlimitedNatural();
			public OpaqueBehavior RecursiveDestruction_main_numberOfIImplInstances = new OpaqueBehavior();
				public Parameter RecursiveDestruction_main_numberOfIImplInstances_iImplList = new Parameter();
					public LiteralInteger RecursiveDestruction_main_numberOfIImplInstances_iImplList_LiteralInteger30 = new LiteralInteger();
					public LiteralUnlimitedNatural RecursiveDestruction_main_numberOfIImplInstances_iImplList_LiteralUnlimitedNatural31 = new LiteralUnlimitedNatural();
			public ObjectFlow RecursiveDestruction_main_ObjectFlow32 = new ObjectFlow();
				public LiteralBoolean RecursiveDestruction_main_ObjectFlow32_LiteralBoolean33 = new LiteralBoolean();
				public LiteralInteger RecursiveDestruction_main_ObjectFlow32_LiteralInteger34 = new LiteralInteger();
			public OpaqueBehavior RecursiveDestruction_main_numberOfBInstances = new OpaqueBehavior();
				public Parameter RecursiveDestruction_main_numberOfBInstances_bList = new Parameter();
					public LiteralInteger RecursiveDestruction_main_numberOfBInstances_bList_LiteralInteger35 = new LiteralInteger();
					public LiteralUnlimitedNatural RecursiveDestruction_main_numberOfBInstances_bList_LiteralUnlimitedNatural36 = new LiteralUnlimitedNatural();
			public CallBehaviorAction RecursiveDestruction_main_Call_numberOfCInstances = new CallBehaviorAction();
				public InputPin RecursiveDestruction_main_Call_numberOfCInstances_cList = new InputPin();
					public LiteralInteger RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralInteger37 = new LiteralInteger();
					public LiteralInteger RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralInteger38 = new LiteralInteger();
					public LiteralUnlimitedNatural RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralUnlimitedNatural39 = new LiteralUnlimitedNatural();
			public CreateObjectAction RecursiveDestruction_main_Create_A_Star_Pattern = new CreateObjectAction();
				public OutputPin RecursiveDestruction_main_Create_A_Star_Pattern_result = new OutputPin();
					public LiteralUnlimitedNatural RecursiveDestruction_main_Create_A_Star_Pattern_result_LiteralUnlimitedNatural40 = new LiteralUnlimitedNatural();
					public LiteralInteger RecursiveDestruction_main_Create_A_Star_Pattern_result_LiteralInteger41 = new LiteralInteger();
			public CallOperationAction RecursiveDestruction_main_A_Star_Pattern_ = new CallOperationAction();
				public OutputPin RecursiveDestruction_main_A_Star_Pattern__result = new OutputPin();
					public LiteralUnlimitedNatural RecursiveDestruction_main_A_Star_Pattern__result_LiteralUnlimitedNatural42 = new LiteralUnlimitedNatural();
					public LiteralInteger RecursiveDestruction_main_A_Star_Pattern__result_LiteralInteger43 = new LiteralInteger();
					public LiteralInteger RecursiveDestruction_main_A_Star_Pattern__result_LiteralInteger44 = new LiteralInteger();
				public InputPin RecursiveDestruction_main_A_Star_Pattern__target = new InputPin();
					public LiteralInteger RecursiveDestruction_main_A_Star_Pattern__target_LiteralInteger45 = new LiteralInteger();
					public LiteralUnlimitedNatural RecursiveDestruction_main_A_Star_Pattern__target_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
			public ObjectFlow RecursiveDestruction_main_ObjectFlow47 = new ObjectFlow();
				public LiteralInteger RecursiveDestruction_main_ObjectFlow47_LiteralInteger48 = new LiteralInteger();
				public LiteralBoolean RecursiveDestruction_main_ObjectFlow47_LiteralBoolean49 = new LiteralBoolean();
			public ObjectFlow RecursiveDestruction_main_ObjectFlow50 = new ObjectFlow();
				public LiteralInteger RecursiveDestruction_main_ObjectFlow50_LiteralInteger51 = new LiteralInteger();
				public LiteralBoolean RecursiveDestruction_main_ObjectFlow50_LiteralBoolean52 = new LiteralBoolean();
			public ControlFlow RecursiveDestruction_main_ControlFlow53 = new ControlFlow();
			public CallBehaviorAction RecursiveDestruction_main_Call_assertExtentOfB = new CallBehaviorAction();
				public InputPin RecursiveDestruction_main_Call_assertExtentOfB_bList = new InputPin();
					public LiteralInteger RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralInteger54 = new LiteralInteger();
					public LiteralInteger RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralInteger55 = new LiteralInteger();
					public LiteralUnlimitedNatural RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralUnlimitedNatural56 = new LiteralUnlimitedNatural();
			public ObjectFlow RecursiveDestruction_main_ObjectFlow57 = new ObjectFlow();
				public LiteralInteger RecursiveDestruction_main_ObjectFlow57_LiteralInteger58 = new LiteralInteger();
				public LiteralBoolean RecursiveDestruction_main_ObjectFlow57_LiteralBoolean59 = new LiteralBoolean();
			public DestroyObjectAction RecursiveDestruction_main_Destroy_A_Star_Pattern = new DestroyObjectAction();
				public InputPin RecursiveDestruction_main_Destroy_A_Star_Pattern_target = new InputPin();
			public ControlFlow RecursiveDestruction_main_ControlFlow60 = new ControlFlow();
			public ControlFlow RecursiveDestruction_main_ControlFlow61 = new ControlFlow();
			public ControlFlow RecursiveDestruction_main_ControlFlow62 = new ControlFlow();
			public ReadExtentAction RecursiveDestruction_main_Extent_of_IImpl_after_destruction = new ReadExtentAction();
				public OutputPin RecursiveDestruction_main_Extent_of_IImpl_after_destruction_iImplExtent = new OutputPin();
			public ObjectFlow RecursiveDestruction_main_ObjectFlow63 = new ObjectFlow();
				public LiteralBoolean RecursiveDestruction_main_ObjectFlow63_LiteralBoolean64 = new LiteralBoolean();
				public LiteralInteger RecursiveDestruction_main_ObjectFlow63_LiteralInteger65 = new LiteralInteger();
			public ReadExtentAction RecursiveDestruction_main_Extent_of_IImpl_before_destruction = new ReadExtentAction();
				public OutputPin RecursiveDestruction_main_Extent_of_IImpl_before_destruction_iImplExtent = new OutputPin();
			public OpaqueBehavior RecursiveDestruction_main_numberOfCInstances = new OpaqueBehavior();
				public Parameter RecursiveDestruction_main_numberOfCInstances_cList = new Parameter();
					public LiteralInteger RecursiveDestruction_main_numberOfCInstances_cList_LiteralInteger66 = new LiteralInteger();
					public LiteralUnlimitedNatural RecursiveDestruction_main_numberOfCInstances_cList_LiteralUnlimitedNatural67 = new LiteralUnlimitedNatural();
			public ObjectFlow RecursiveDestruction_main_ObjectFlow68 = new ObjectFlow();
				public LiteralInteger RecursiveDestruction_main_ObjectFlow68_LiteralInteger69 = new LiteralInteger();
				public LiteralBoolean RecursiveDestruction_main_ObjectFlow68_LiteralBoolean70 = new LiteralBoolean();
			public CallBehaviorAction RecursiveDestruction_main_Call_assertExtentOfC = new CallBehaviorAction();
				public InputPin RecursiveDestruction_main_Call_assertExtentOfC_cList = new InputPin();
					public LiteralInteger RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralInteger71 = new LiteralInteger();
					public LiteralInteger RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralInteger72 = new LiteralInteger();
					public LiteralUnlimitedNatural RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralUnlimitedNatural73 = new LiteralUnlimitedNatural();
			public ReadExtentAction RecursiveDestruction_main_Extent_of_C_before_destruction = new ReadExtentAction();
				public OutputPin RecursiveDestruction_main_Extent_of_C_before_destruction_cExtent = new OutputPin();
			public ControlFlow RecursiveDestruction_main_ControlFlow74 = new ControlFlow();
		public Class_ RecursiveDestruction_A_Star_Pattern = new Class_();
			public Operation RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern = new Operation();
				public Parameter RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result = new Parameter();
			public Connector RecursiveDestruction_A_Star_Pattern_r = new Connector();
				public ConnectorEnd RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75 = new ConnectorEnd();
					public LiteralUnlimitedNatural RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
					public LiteralInteger RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75_connectorEnd_1_Lower = new LiteralInteger();
				public ConnectorEnd RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76 = new ConnectorEnd();
					public LiteralUnlimitedNatural RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
					public LiteralInteger RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76_connectorEnd_2_Lower = new LiteralInteger();
			public Comment RecursiveDestruction_A_Star_Pattern_Comment77 = new Comment();
			public Property RecursiveDestruction_A_Star_Pattern_partB = new Property();
				public LiteralUnlimitedNatural RecursiveDestruction_A_Star_Pattern_partB_LiteralUnlimitedNatural78 = new LiteralUnlimitedNatural();
				public LiteralInteger RecursiveDestruction_A_Star_Pattern_partB_LiteralInteger79 = new LiteralInteger();
			public Property RecursiveDestruction_A_Star_Pattern_partC = new Property();
				public LiteralUnlimitedNatural RecursiveDestruction_A_Star_Pattern_partC_LiteralUnlimitedNatural80 = new LiteralUnlimitedNatural();
				public LiteralInteger RecursiveDestruction_A_Star_Pattern_partC_LiteralInteger81 = new LiteralInteger();
		public Class_ RecursiveDestruction_B = new Class_();
			public Port RecursiveDestruction_B_p = new Port();
				public LiteralInteger RecursiveDestruction_B_p_LiteralInteger82 = new LiteralInteger();
				public LiteralUnlimitedNatural RecursiveDestruction_B_p_LiteralUnlimitedNatural83 = new LiteralUnlimitedNatural();
		public Class_ RecursiveDestruction_C = new Class_();
			public Port RecursiveDestruction_C_q = new Port();
				public LiteralInteger RecursiveDestruction_C_q_LiteralInteger84 = new LiteralInteger();
				public LiteralUnlimitedNatural RecursiveDestruction_C_q_LiteralUnlimitedNatural85 = new LiteralUnlimitedNatural();

	public static RecursiveDestructionModel instance()
	{
		if (instance == null)
        {
            instance = new RecursiveDestructionModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public RecursiveDestructionModel()
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
		this.initializeAssociation_Instances();
		this.initializeCallBehaviorAction_Instances();
		this.initializeCallOperationAction_Instances();
		this.initializeClass_Instances();
		this.initializeComment_Instances();
		this.initializeConnector_Instances();
		this.initializeConnectorEnd_Instances();
		this.initializeControlFlow_Instances();
		this.initializeCreateObjectAction_Instances();
		this.initializeDestroyObjectAction_Instances();
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
		this.initializeReadExtentAction_Instances();
	}

	private void initializeActivity_Instances()
	{
		// Activity RecursiveDestruction::main
		addToElementRepository("main", RecursiveDestruction_main);
		RecursiveDestruction_main.setName("main");
		RecursiveDestruction_main.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main.addOwnedBehavior(RecursiveDestruction_main_assertExtentOfIImpl);
		RecursiveDestruction_main.addOwnedBehavior(RecursiveDestruction_main_assertExtentOfC);
		RecursiveDestruction_main.addOwnedBehavior(RecursiveDestruction_main_assertExtentOfB);
		RecursiveDestruction_main.addOwnedBehavior(RecursiveDestruction_main_numberOfIImplInstances);
		RecursiveDestruction_main.addOwnedBehavior(RecursiveDestruction_main_numberOfBInstances);
		RecursiveDestruction_main.addOwnedBehavior(RecursiveDestruction_main_numberOfCInstances);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Call_numberOfCInstances);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Call_assertExtentOfIImpl);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Create_A_Star_Pattern);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_A_Star_Pattern_);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Call_assertExtentOfB);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Extent_of_B_before_destruction);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Destroy_A_Star_Pattern);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Call_numberOfIImplInstances);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Extent_of_C_after_destruction);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Extent_of_B_after_destruction);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Call_numberOfBInstances);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Extent_of_IImpl_after_destruction);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Extent_of_IImpl_before_destruction);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Call_assertExtentOfC);
		RecursiveDestruction_main.addNode(RecursiveDestruction_main_Extent_of_C_before_destruction);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ControlFlow12);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ObjectFlow47);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ObjectFlow13);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ObjectFlow50);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ControlFlow53);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ObjectFlow57);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ObjectFlow18);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ControlFlow60);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ControlFlow61);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ControlFlow21);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ControlFlow62);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ObjectFlow63);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ObjectFlow32);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ObjectFlow68);
		RecursiveDestruction_main.addEdge(RecursiveDestruction_main_ControlFlow74);
	}

	private void initializeAssociation_Instances()
	{
		// Association RecursiveDestruction::R
		addToElementRepository("R", RecursiveDestruction_R);
		RecursiveDestruction_R.setName("R");
		RecursiveDestruction_R.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_R.addOwnedEnd(RecursiveDestruction_R_x);
		RecursiveDestruction_R.addOwnedEnd(RecursiveDestruction_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction RecursiveDestruction_main::Call numberOfCInstances
		addToElementRepository("Call numberOfCInstances", RecursiveDestruction_main_Call_numberOfCInstances);
		RecursiveDestruction_main_Call_numberOfCInstances.setName("Call numberOfCInstances");
		RecursiveDestruction_main_Call_numberOfCInstances.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfCInstances.setBehavior(RecursiveDestruction_main_numberOfCInstances);
		RecursiveDestruction_main_Call_numberOfCInstances.addArgument(RecursiveDestruction_main_Call_numberOfCInstances_cList);
		// CallBehaviorAction RecursiveDestruction_main::Call assertExtentOfIImpl
		addToElementRepository("Call assertExtentOfIImpl", RecursiveDestruction_main_Call_assertExtentOfIImpl);
		RecursiveDestruction_main_Call_assertExtentOfIImpl.setName("Call assertExtentOfIImpl");
		RecursiveDestruction_main_Call_assertExtentOfIImpl.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfIImpl.setBehavior(RecursiveDestruction_main_assertExtentOfIImpl);
		RecursiveDestruction_main_Call_assertExtentOfIImpl.addArgument(RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList);
		// CallBehaviorAction RecursiveDestruction_main::Call numberOfBInstances
		addToElementRepository("Call numberOfBInstances", RecursiveDestruction_main_Call_numberOfBInstances);
		RecursiveDestruction_main_Call_numberOfBInstances.setName("Call numberOfBInstances");
		RecursiveDestruction_main_Call_numberOfBInstances.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfBInstances.setBehavior(RecursiveDestruction_main_numberOfBInstances);
		RecursiveDestruction_main_Call_numberOfBInstances.addArgument(RecursiveDestruction_main_Call_numberOfBInstances_bList);
		// CallBehaviorAction RecursiveDestruction_main::Call assertExtentOfB
		addToElementRepository("Call assertExtentOfB", RecursiveDestruction_main_Call_assertExtentOfB);
		RecursiveDestruction_main_Call_assertExtentOfB.setName("Call assertExtentOfB");
		RecursiveDestruction_main_Call_assertExtentOfB.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfB.setBehavior(RecursiveDestruction_main_assertExtentOfB);
		RecursiveDestruction_main_Call_assertExtentOfB.addArgument(RecursiveDestruction_main_Call_assertExtentOfB_bList);
		// CallBehaviorAction RecursiveDestruction_main::Call assertExtentOfC
		addToElementRepository("Call assertExtentOfC", RecursiveDestruction_main_Call_assertExtentOfC);
		RecursiveDestruction_main_Call_assertExtentOfC.setName("Call assertExtentOfC");
		RecursiveDestruction_main_Call_assertExtentOfC.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfC.setBehavior(RecursiveDestruction_main_assertExtentOfC);
		RecursiveDestruction_main_Call_assertExtentOfC.addArgument(RecursiveDestruction_main_Call_assertExtentOfC_cList);
		// CallBehaviorAction RecursiveDestruction_main::Call numberOfIImplInstances
		addToElementRepository("Call numberOfIImplInstances", RecursiveDestruction_main_Call_numberOfIImplInstances);
		RecursiveDestruction_main_Call_numberOfIImplInstances.setName("Call numberOfIImplInstances");
		RecursiveDestruction_main_Call_numberOfIImplInstances.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfIImplInstances.setBehavior(RecursiveDestruction_main_numberOfIImplInstances);
		RecursiveDestruction_main_Call_numberOfIImplInstances.addArgument(RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction RecursiveDestruction_main::A_Star_Pattern()
		addToElementRepository("A_Star_Pattern()", RecursiveDestruction_main_A_Star_Pattern_);
		RecursiveDestruction_main_A_Star_Pattern_.setName("A_Star_Pattern()");
		RecursiveDestruction_main_A_Star_Pattern_.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_A_Star_Pattern_.addResult(RecursiveDestruction_main_A_Star_Pattern__result);
		RecursiveDestruction_main_A_Star_Pattern_.setOperation(RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		RecursiveDestruction_main_A_Star_Pattern_.setTarget(RecursiveDestruction_main_A_Star_Pattern__target);
	}

	private void initializeClass_Instances()
	{
		// Class RecursiveDestruction::IImpl
		addToElementRepository("IImpl", RecursiveDestruction_IImpl);
		RecursiveDestruction_IImpl.setName("IImpl");
		RecursiveDestruction_IImpl.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_IImpl.addInterfaceRealization(RecursiveDestruction_IImpl_I_Realization);
		// Class RecursiveDestruction::A_Star_Pattern
		addToElementRepository("A_Star_Pattern", RecursiveDestruction_A_Star_Pattern);
		RecursiveDestruction_A_Star_Pattern.setName("A_Star_Pattern");
		RecursiveDestruction_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_A_Star_Pattern.addOwnedAttribute(RecursiveDestruction_A_Star_Pattern_partB);
		RecursiveDestruction_A_Star_Pattern.addOwnedAttribute(RecursiveDestruction_A_Star_Pattern_partC);
		
		RecursiveDestruction_A_Star_Pattern.addOwnedConnector(RecursiveDestruction_A_Star_Pattern_r);
		RecursiveDestruction_A_Star_Pattern.addOwnedOperation(RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		// Class RecursiveDestruction::B
		addToElementRepository("B", RecursiveDestruction_B);
		RecursiveDestruction_B.setName("B");
		RecursiveDestruction_B.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_B.addOwnedAttribute(RecursiveDestruction_B_p);
		// Class RecursiveDestruction::C
		addToElementRepository("C", RecursiveDestruction_C);
		RecursiveDestruction_C.setName("C");
		RecursiveDestruction_C.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_C.addOwnedAttribute(RecursiveDestruction_C_q);
	}

	private void initializeComment_Instances()
	{
		// Comment RecursiveDestruction::Comment0
		addToElementRepository("Comment0", RecursiveDestruction_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment RecursiveDestruction::Comment6
		addToElementRepository("Comment6", RecursiveDestruction_Comment6);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment RecursiveDestruction_A_Star_Pattern::Comment77
		addToElementRepository("Comment77", RecursiveDestruction_A_Star_Pattern_Comment77);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector RecursiveDestruction_A_Star_Pattern::r
		addToElementRepository("r", RecursiveDestruction_A_Star_Pattern_r);
		RecursiveDestruction_A_Star_Pattern_r.setName("r");
		RecursiveDestruction_A_Star_Pattern_r.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_A_Star_Pattern_r.addEnd(RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75);
		RecursiveDestruction_A_Star_Pattern_r.addEnd(RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76);
		RecursiveDestruction_A_Star_Pattern_r.setType(RecursiveDestruction_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd RecursiveDestruction_A_Star_Pattern_r::ConnectorEnd75
		addToElementRepository("ConnectorEnd75", RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75.setUpper(-1);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75.setLower(4);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75.setRole(RecursiveDestruction_B_p);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75.setPartWithPort(RecursiveDestruction_A_Star_Pattern_partB);
		// ConnectorEnd RecursiveDestruction_A_Star_Pattern_r::ConnectorEnd76
		addToElementRepository("ConnectorEnd76", RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76.setUpper(-1);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76.setLower(5);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76.setRole(RecursiveDestruction_C_q);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76.setPartWithPort(RecursiveDestruction_A_Star_Pattern_partC);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow RecursiveDestruction_main::ControlFlow12
		addToElementRepository("ControlFlow12", RecursiveDestruction_main_ControlFlow12);
		RecursiveDestruction_main_ControlFlow12.setName("ControlFlow12");
		RecursiveDestruction_main_ControlFlow12.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ControlFlow12.setSource(RecursiveDestruction_main_Call_numberOfCInstances);
		RecursiveDestruction_main_ControlFlow12.setTarget(RecursiveDestruction_main_Extent_of_IImpl_before_destruction);
		// ControlFlow RecursiveDestruction_main::ControlFlow62
		addToElementRepository("ControlFlow62", RecursiveDestruction_main_ControlFlow62);
		RecursiveDestruction_main_ControlFlow62.setName("ControlFlow62");
		RecursiveDestruction_main_ControlFlow62.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ControlFlow62.setSource(RecursiveDestruction_main_A_Star_Pattern_);
		RecursiveDestruction_main_ControlFlow62.setTarget(RecursiveDestruction_main_Extent_of_B_before_destruction);
		// ControlFlow RecursiveDestruction_main::ControlFlow53
		addToElementRepository("ControlFlow53", RecursiveDestruction_main_ControlFlow53);
		RecursiveDestruction_main_ControlFlow53.setName("ControlFlow53");
		RecursiveDestruction_main_ControlFlow53.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ControlFlow53.setSource(RecursiveDestruction_main_Call_assertExtentOfB);
		RecursiveDestruction_main_ControlFlow53.setTarget(RecursiveDestruction_main_Extent_of_C_after_destruction);
		// ControlFlow RecursiveDestruction_main::ControlFlow61
		addToElementRepository("ControlFlow61", RecursiveDestruction_main_ControlFlow61);
		RecursiveDestruction_main_ControlFlow61.setName("ControlFlow61");
		RecursiveDestruction_main_ControlFlow61.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ControlFlow61.setSource(RecursiveDestruction_main_Destroy_A_Star_Pattern);
		RecursiveDestruction_main_ControlFlow61.setTarget(RecursiveDestruction_main_Extent_of_B_after_destruction);
		// ControlFlow RecursiveDestruction_main::ControlFlow60
		addToElementRepository("ControlFlow60", RecursiveDestruction_main_ControlFlow60);
		RecursiveDestruction_main_ControlFlow60.setName("ControlFlow60");
		RecursiveDestruction_main_ControlFlow60.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ControlFlow60.setSource(RecursiveDestruction_main_Call_numberOfIImplInstances);
		RecursiveDestruction_main_ControlFlow60.setTarget(RecursiveDestruction_main_Destroy_A_Star_Pattern);
		// ControlFlow RecursiveDestruction_main::ControlFlow21
		addToElementRepository("ControlFlow21", RecursiveDestruction_main_ControlFlow21);
		RecursiveDestruction_main_ControlFlow21.setName("ControlFlow21");
		RecursiveDestruction_main_ControlFlow21.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ControlFlow21.setSource(RecursiveDestruction_main_Call_assertExtentOfC);
		RecursiveDestruction_main_ControlFlow21.setTarget(RecursiveDestruction_main_Extent_of_IImpl_after_destruction);
		// ControlFlow RecursiveDestruction_main::ControlFlow74
		addToElementRepository("ControlFlow74", RecursiveDestruction_main_ControlFlow74);
		RecursiveDestruction_main_ControlFlow74.setName("ControlFlow74");
		RecursiveDestruction_main_ControlFlow74.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ControlFlow74.setSource(RecursiveDestruction_main_Call_numberOfBInstances);
		RecursiveDestruction_main_ControlFlow74.setTarget(RecursiveDestruction_main_Extent_of_C_before_destruction);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction RecursiveDestruction_main::Create A_Star_Pattern
		addToElementRepository("Create A_Star_Pattern", RecursiveDestruction_main_Create_A_Star_Pattern);
		RecursiveDestruction_main_Create_A_Star_Pattern.setName("Create A_Star_Pattern");
		RecursiveDestruction_main_Create_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Create_A_Star_Pattern.setClassifier(RecursiveDestruction_A_Star_Pattern);
		RecursiveDestruction_main_Create_A_Star_Pattern.setResult(RecursiveDestruction_main_Create_A_Star_Pattern_result);
	}

	private void initializeDestroyObjectAction_Instances()
	{
		// DestroyObjectAction RecursiveDestruction_main::Destroy A_Star_Pattern
		addToElementRepository("Destroy A_Star_Pattern", RecursiveDestruction_main_Destroy_A_Star_Pattern);
		RecursiveDestruction_main_Destroy_A_Star_Pattern.setName("Destroy A_Star_Pattern");
		RecursiveDestruction_main_Destroy_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Destroy_A_Star_Pattern.setIsDestroyLinks(true);
		RecursiveDestruction_main_Destroy_A_Star_Pattern.setIsDestroyOwnedObjects(true);
		RecursiveDestruction_main_Destroy_A_Star_Pattern.setTarget(RecursiveDestruction_main_Destroy_A_Star_Pattern_target);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior RecursiveDestruction_main::assertExtentOfIImpl
		addToElementRepository("assertExtentOfIImpl", RecursiveDestruction_main_assertExtentOfIImpl);
		RecursiveDestruction_main_assertExtentOfIImpl.setName("assertExtentOfIImpl");
		RecursiveDestruction_main_assertExtentOfIImpl.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_assertExtentOfIImpl.addOwnedParameter(RecursiveDestruction_main_assertExtentOfIImpl_iImplList);
		RecursiveDestruction_main_assertExtentOfIImpl.addLanguage("Java");
		RecursiveDestruction_main_assertExtentOfIImpl.addBody("System.out.println(\"Asserting IImpl.allInstances()->size() == 0\");	  	int extentSize = inputParameters.get(0).values.size(); 	 	System.out.println(\"IImpl.allInstances()->size() == \" + extentSize); 	System.out.print(\"All instances of IImpl recursively destroyed: \");  	if(extentSize == 0) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		// FunctionBehavior RecursiveDestruction_main::assertExtentOfC
		addToElementRepository("assertExtentOfC", RecursiveDestruction_main_assertExtentOfC);
		RecursiveDestruction_main_assertExtentOfC.setName("assertExtentOfC");
		RecursiveDestruction_main_assertExtentOfC.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_assertExtentOfC.addOwnedParameter(RecursiveDestruction_main_assertExtentOfC_cList);
		RecursiveDestruction_main_assertExtentOfC.addLanguage("Java");
		RecursiveDestruction_main_assertExtentOfC.addBody("System.out.println(\"Asserting C.allInstances()->size() == 0\");	  	int extentSize = inputParameters.get(0).values.size(); 	 	System.out.println(\"C.allInstances()->size() == \" + extentSize); 	System.out.print(\"All instances of C recursively destroyed: \");  	if(extentSize == 0) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		// FunctionBehavior RecursiveDestruction_main::assertExtentOfB
		addToElementRepository("assertExtentOfB", RecursiveDestruction_main_assertExtentOfB);
		RecursiveDestruction_main_assertExtentOfB.setName("assertExtentOfB");
		RecursiveDestruction_main_assertExtentOfB.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_assertExtentOfB.addOwnedParameter(RecursiveDestruction_main_assertExtentOfB_bList);
		RecursiveDestruction_main_assertExtentOfB.addLanguage("Java");
		RecursiveDestruction_main_assertExtentOfB.addBody("System.out.println(\"Asserting B.allInstances()->size() == 0\");	  	int extentSize = inputParameters.get(0).values.size(); 	 	System.out.println(\"B.allInstances()->size() == \" + extentSize); 	System.out.print(\"All instances of B recursively destroyed: \");  	if(extentSize == 0) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		// FunctionBehavior RecursiveDestruction_main::numberOfIImplInstances
		addToElementRepository("numberOfIImplInstances", RecursiveDestruction_main_numberOfIImplInstances);
		RecursiveDestruction_main_numberOfIImplInstances.setName("numberOfIImplInstances");
		RecursiveDestruction_main_numberOfIImplInstances.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_numberOfIImplInstances.addOwnedParameter(RecursiveDestruction_main_numberOfIImplInstances_iImplList);
		RecursiveDestruction_main_numberOfIImplInstances.addLanguage("Java");
		RecursiveDestruction_main_numberOfIImplInstances.addBody("System.out.println(\"# Instances of IImpl: \" + inputParameters.get(0).values.size());");
		// FunctionBehavior RecursiveDestruction_main::numberOfBInstances
		addToElementRepository("numberOfBInstances", RecursiveDestruction_main_numberOfBInstances);
		RecursiveDestruction_main_numberOfBInstances.setName("numberOfBInstances");
		RecursiveDestruction_main_numberOfBInstances.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_numberOfBInstances.addOwnedParameter(RecursiveDestruction_main_numberOfBInstances_bList);
		RecursiveDestruction_main_numberOfBInstances.addLanguage("Java");
		RecursiveDestruction_main_numberOfBInstances.addBody("System.out.println(\"# Instances of B: \" + inputParameters.get(0).values.size());");
		// FunctionBehavior RecursiveDestruction_main::numberOfCInstances
		addToElementRepository("numberOfCInstances", RecursiveDestruction_main_numberOfCInstances);
		RecursiveDestruction_main_numberOfCInstances.setName("numberOfCInstances");
		RecursiveDestruction_main_numberOfCInstances.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_numberOfCInstances.addOwnedParameter(RecursiveDestruction_main_numberOfCInstances_cList);
		RecursiveDestruction_main_numberOfCInstances.addLanguage("Java");
		RecursiveDestruction_main_numberOfCInstances.addBody("System.out.println(\"# Instances of C: \" + inputParameters.get(0).values.size());");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin RecursiveDestruction_main_Call assertExtentOfIImpl::iImplList
		addToElementRepository("iImplList", RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList);
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList.setName("iImplList");
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList.setType(RecursiveDestruction_IImpl);
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList.setUpper(-1);
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList.setLower(0);
		// InputPin RecursiveDestruction_main_Call numberOfIImplInstances::iImplList
		addToElementRepository("iImplList", RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList);
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList.setName("iImplList");
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList.setType(RecursiveDestruction_IImpl);
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList.setUpper(-1);
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList.setLower(0);
		// InputPin RecursiveDestruction_main_Call assertExtentOfC::cList
		addToElementRepository("cList", RecursiveDestruction_main_Call_assertExtentOfC_cList);
		RecursiveDestruction_main_Call_assertExtentOfC_cList.setName("cList");
		RecursiveDestruction_main_Call_assertExtentOfC_cList.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfC_cList.setType(RecursiveDestruction_C);
		RecursiveDestruction_main_Call_assertExtentOfC_cList.setUpper(-1);
		RecursiveDestruction_main_Call_assertExtentOfC_cList.setLower(0);
		// InputPin RecursiveDestruction_main_A_Star_Pattern()::target
		addToElementRepository("target", RecursiveDestruction_main_A_Star_Pattern__target);
		RecursiveDestruction_main_A_Star_Pattern__target.setName("target");
		RecursiveDestruction_main_A_Star_Pattern__target.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_A_Star_Pattern__target.setType(RecursiveDestruction_A_Star_Pattern);
		// InputPin RecursiveDestruction_main_Call assertExtentOfB::bList
		addToElementRepository("bList", RecursiveDestruction_main_Call_assertExtentOfB_bList);
		RecursiveDestruction_main_Call_assertExtentOfB_bList.setName("bList");
		RecursiveDestruction_main_Call_assertExtentOfB_bList.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfB_bList.setType(RecursiveDestruction_B);
		RecursiveDestruction_main_Call_assertExtentOfB_bList.setUpper(-1);
		RecursiveDestruction_main_Call_assertExtentOfB_bList.setLower(0);
		// InputPin RecursiveDestruction_main_Call numberOfBInstances::bList
		addToElementRepository("bList", RecursiveDestruction_main_Call_numberOfBInstances_bList);
		RecursiveDestruction_main_Call_numberOfBInstances_bList.setName("bList");
		RecursiveDestruction_main_Call_numberOfBInstances_bList.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfBInstances_bList.setType(RecursiveDestruction_B);
		RecursiveDestruction_main_Call_numberOfBInstances_bList.setUpper(-1);
		RecursiveDestruction_main_Call_numberOfBInstances_bList.setLower(0);
		// InputPin RecursiveDestruction_main_Call numberOfCInstances::cList
		addToElementRepository("cList", RecursiveDestruction_main_Call_numberOfCInstances_cList);
		RecursiveDestruction_main_Call_numberOfCInstances_cList.setName("cList");
		RecursiveDestruction_main_Call_numberOfCInstances_cList.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfCInstances_cList.setType(RecursiveDestruction_C);
		RecursiveDestruction_main_Call_numberOfCInstances_cList.setUpper(-1);
		RecursiveDestruction_main_Call_numberOfCInstances_cList.setLower(0);
		// InputPin RecursiveDestruction_main_Destroy A_Star_Pattern::target
		addToElementRepository("target", RecursiveDestruction_main_Destroy_A_Star_Pattern_target);
		RecursiveDestruction_main_Destroy_A_Star_Pattern_target.setName("target");
		RecursiveDestruction_main_Destroy_A_Star_Pattern_target.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Destroy_A_Star_Pattern_target.setType(RecursiveDestruction_A_Star_Pattern);
		RecursiveDestruction_main_Destroy_A_Star_Pattern_target.setIsOrdered(true);
		RecursiveDestruction_main_Destroy_A_Star_Pattern_target.setIsUnique(false);
	}

	private void initializeInterface_Instances()
	{
		// Interface RecursiveDestruction::I
		addToElementRepository("I", RecursiveDestruction_I);
		RecursiveDestruction_I.setName("I");
		RecursiveDestruction_I.setVisibility(VisibilityKind.public_);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization RecursiveDestruction_IImpl::I_Realization
		addToElementRepository("I_Realization", RecursiveDestruction_IImpl_I_Realization);
		RecursiveDestruction_IImpl_I_Realization.setName("I_Realization");
		RecursiveDestruction_IImpl_I_Realization.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_IImpl_I_Realization.setContract(RecursiveDestruction_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean RecursiveDestruction_main_ObjectFlow18::LiteralBoolean19
		addToElementRepository("LiteralBoolean19", RecursiveDestruction_main_ObjectFlow18_LiteralBoolean19);
		RecursiveDestruction_main_ObjectFlow18_LiteralBoolean19.setName("LiteralBoolean19");
		RecursiveDestruction_main_ObjectFlow18_LiteralBoolean19.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow18_LiteralBoolean19.setValue(true);
		// LiteralBoolean RecursiveDestruction_main_ObjectFlow32::LiteralBoolean33
		addToElementRepository("LiteralBoolean33", RecursiveDestruction_main_ObjectFlow32_LiteralBoolean33);
		RecursiveDestruction_main_ObjectFlow32_LiteralBoolean33.setName("LiteralBoolean33");
		RecursiveDestruction_main_ObjectFlow32_LiteralBoolean33.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow32_LiteralBoolean33.setValue(true);
		// LiteralBoolean RecursiveDestruction_main_ObjectFlow63::LiteralBoolean64
		addToElementRepository("LiteralBoolean64", RecursiveDestruction_main_ObjectFlow63_LiteralBoolean64);
		RecursiveDestruction_main_ObjectFlow63_LiteralBoolean64.setName("LiteralBoolean64");
		RecursiveDestruction_main_ObjectFlow63_LiteralBoolean64.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow63_LiteralBoolean64.setValue(true);
		// LiteralBoolean RecursiveDestruction_main_ObjectFlow68::LiteralBoolean70
		addToElementRepository("LiteralBoolean70", RecursiveDestruction_main_ObjectFlow68_LiteralBoolean70);
		RecursiveDestruction_main_ObjectFlow68_LiteralBoolean70.setName("LiteralBoolean70");
		RecursiveDestruction_main_ObjectFlow68_LiteralBoolean70.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow68_LiteralBoolean70.setValue(true);
		// LiteralBoolean RecursiveDestruction_main_ObjectFlow13::LiteralBoolean14
		addToElementRepository("LiteralBoolean14", RecursiveDestruction_main_ObjectFlow13_LiteralBoolean14);
		RecursiveDestruction_main_ObjectFlow13_LiteralBoolean14.setName("LiteralBoolean14");
		RecursiveDestruction_main_ObjectFlow13_LiteralBoolean14.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow13_LiteralBoolean14.setValue(true);
		// LiteralBoolean RecursiveDestruction_main_ObjectFlow47::LiteralBoolean49
		addToElementRepository("LiteralBoolean49", RecursiveDestruction_main_ObjectFlow47_LiteralBoolean49);
		RecursiveDestruction_main_ObjectFlow47_LiteralBoolean49.setName("LiteralBoolean49");
		RecursiveDestruction_main_ObjectFlow47_LiteralBoolean49.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow47_LiteralBoolean49.setValue(true);
		// LiteralBoolean RecursiveDestruction_main_ObjectFlow50::LiteralBoolean52
		addToElementRepository("LiteralBoolean52", RecursiveDestruction_main_ObjectFlow50_LiteralBoolean52);
		RecursiveDestruction_main_ObjectFlow50_LiteralBoolean52.setName("LiteralBoolean52");
		RecursiveDestruction_main_ObjectFlow50_LiteralBoolean52.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow50_LiteralBoolean52.setValue(true);
		// LiteralBoolean RecursiveDestruction_main_ObjectFlow57::LiteralBoolean59
		addToElementRepository("LiteralBoolean59", RecursiveDestruction_main_ObjectFlow57_LiteralBoolean59);
		RecursiveDestruction_main_ObjectFlow57_LiteralBoolean59.setName("LiteralBoolean59");
		RecursiveDestruction_main_ObjectFlow57_LiteralBoolean59.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow57_LiteralBoolean59.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger RecursiveDestruction_B_p::LiteralInteger82
		addToElementRepository("LiteralInteger82", RecursiveDestruction_B_p_LiteralInteger82);
		RecursiveDestruction_B_p_LiteralInteger82.setName("LiteralInteger82");
		RecursiveDestruction_B_p_LiteralInteger82.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_B_p_LiteralInteger82.setValue(2);
		// LiteralInteger RecursiveDestruction_main_numberOfCInstances_cList::LiteralInteger66
		addToElementRepository("LiteralInteger66", RecursiveDestruction_main_numberOfCInstances_cList_LiteralInteger66);
		RecursiveDestruction_main_numberOfCInstances_cList_LiteralInteger66.setName("LiteralInteger66");
		RecursiveDestruction_main_numberOfCInstances_cList_LiteralInteger66.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_numberOfCInstances_cList_LiteralInteger66.setValue(0);
		// LiteralInteger RecursiveDestruction_main_Call numberOfIImplInstances_iImplList::LiteralInteger22
		addToElementRepository("LiteralInteger22", RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralInteger22);
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralInteger22.setName("LiteralInteger22");
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralInteger22.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralInteger22.setValue(1);
		// LiteralInteger RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76_connectorEnd_2_Lower);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76_connectorEnd_2_Lower.setValue(5);
		// LiteralInteger RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75_connectorEnd_1_Lower);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75_connectorEnd_1_Lower.setValue(4);
		// LiteralInteger RecursiveDestruction_main_ObjectFlow13::LiteralInteger15
		addToElementRepository("LiteralInteger15", RecursiveDestruction_main_ObjectFlow13_LiteralInteger15);
		RecursiveDestruction_main_ObjectFlow13_LiteralInteger15.setName("LiteralInteger15");
		RecursiveDestruction_main_ObjectFlow13_LiteralInteger15.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow13_LiteralInteger15.setValue(1);
		// LiteralInteger RecursiveDestruction_main_Call numberOfCInstances_cList::LiteralInteger38
		addToElementRepository("LiteralInteger38", RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralInteger38);
		RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralInteger38.setName("LiteralInteger38");
		RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralInteger38.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralInteger38.setValue(0);
		// LiteralInteger RecursiveDestruction_main_numberOfIImplInstances_iImplList::LiteralInteger30
		addToElementRepository("LiteralInteger30", RecursiveDestruction_main_numberOfIImplInstances_iImplList_LiteralInteger30);
		RecursiveDestruction_main_numberOfIImplInstances_iImplList_LiteralInteger30.setName("LiteralInteger30");
		RecursiveDestruction_main_numberOfIImplInstances_iImplList_LiteralInteger30.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_numberOfIImplInstances_iImplList_LiteralInteger30.setValue(0);
		// LiteralInteger RecursiveDestruction_main_ObjectFlow63::LiteralInteger65
		addToElementRepository("LiteralInteger65", RecursiveDestruction_main_ObjectFlow63_LiteralInteger65);
		RecursiveDestruction_main_ObjectFlow63_LiteralInteger65.setName("LiteralInteger65");
		RecursiveDestruction_main_ObjectFlow63_LiteralInteger65.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow63_LiteralInteger65.setValue(1);
		// LiteralInteger RecursiveDestruction_main_A_Star_Pattern()_result::LiteralInteger43
		addToElementRepository("LiteralInteger43", RecursiveDestruction_main_A_Star_Pattern__result_LiteralInteger43);
		RecursiveDestruction_main_A_Star_Pattern__result_LiteralInteger43.setName("LiteralInteger43");
		RecursiveDestruction_main_A_Star_Pattern__result_LiteralInteger43.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_A_Star_Pattern__result_LiteralInteger43.setValue(1);
		// LiteralInteger RecursiveDestruction_main_ObjectFlow18::LiteralInteger20
		addToElementRepository("LiteralInteger20", RecursiveDestruction_main_ObjectFlow18_LiteralInteger20);
		RecursiveDestruction_main_ObjectFlow18_LiteralInteger20.setName("LiteralInteger20");
		RecursiveDestruction_main_ObjectFlow18_LiteralInteger20.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow18_LiteralInteger20.setValue(1);
		// LiteralInteger RecursiveDestruction_main_Call numberOfBInstances_bList::LiteralInteger28
		addToElementRepository("LiteralInteger28", RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralInteger28);
		RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralInteger28.setName("LiteralInteger28");
		RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralInteger28.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralInteger28.setValue(1);
		// LiteralInteger RecursiveDestruction_main_Call numberOfIImplInstances_iImplList::LiteralInteger23
		addToElementRepository("LiteralInteger23", RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralInteger23);
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralInteger23.setName("LiteralInteger23");
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralInteger23.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralInteger23.setValue(0);
		// LiteralInteger RecursiveDestruction_R_y::LiteralInteger1
		addToElementRepository("LiteralInteger1", RecursiveDestruction_R_y_LiteralInteger1);
		RecursiveDestruction_R_y_LiteralInteger1.setName("LiteralInteger1");
		RecursiveDestruction_R_y_LiteralInteger1.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_R_y_LiteralInteger1.setValue(0);
		// LiteralInteger RecursiveDestruction_main_numberOfBInstances_bList::LiteralInteger35
		addToElementRepository("LiteralInteger35", RecursiveDestruction_main_numberOfBInstances_bList_LiteralInteger35);
		RecursiveDestruction_main_numberOfBInstances_bList_LiteralInteger35.setName("LiteralInteger35");
		RecursiveDestruction_main_numberOfBInstances_bList_LiteralInteger35.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_numberOfBInstances_bList_LiteralInteger35.setValue(0);
		// LiteralInteger RecursiveDestruction_main_ObjectFlow50::LiteralInteger51
		addToElementRepository("LiteralInteger51", RecursiveDestruction_main_ObjectFlow50_LiteralInteger51);
		RecursiveDestruction_main_ObjectFlow50_LiteralInteger51.setName("LiteralInteger51");
		RecursiveDestruction_main_ObjectFlow50_LiteralInteger51.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow50_LiteralInteger51.setValue(1);
		// LiteralInteger RecursiveDestruction_main_assertExtentOfB_bList::LiteralInteger17
		addToElementRepository("LiteralInteger17", RecursiveDestruction_main_assertExtentOfB_bList_LiteralInteger17);
		RecursiveDestruction_main_assertExtentOfB_bList_LiteralInteger17.setName("LiteralInteger17");
		RecursiveDestruction_main_assertExtentOfB_bList_LiteralInteger17.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_assertExtentOfB_bList_LiteralInteger17.setValue(0);
		// LiteralInteger RecursiveDestruction_A_Star_Pattern_partB::LiteralInteger79
		addToElementRepository("LiteralInteger79", RecursiveDestruction_A_Star_Pattern_partB_LiteralInteger79);
		RecursiveDestruction_A_Star_Pattern_partB_LiteralInteger79.setName("LiteralInteger79");
		RecursiveDestruction_A_Star_Pattern_partB_LiteralInteger79.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_A_Star_Pattern_partB_LiteralInteger79.setValue(2);
		// LiteralInteger RecursiveDestruction_A_Star_Pattern_partC::LiteralInteger81
		addToElementRepository("LiteralInteger81", RecursiveDestruction_A_Star_Pattern_partC_LiteralInteger81);
		RecursiveDestruction_A_Star_Pattern_partC_LiteralInteger81.setName("LiteralInteger81");
		RecursiveDestruction_A_Star_Pattern_partC_LiteralInteger81.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_A_Star_Pattern_partC_LiteralInteger81.setValue(5);
		// LiteralInteger RecursiveDestruction_main_Call assertExtentOfIImpl_iImplList::LiteralInteger8
		addToElementRepository("LiteralInteger8", RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralInteger8);
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralInteger8.setName("LiteralInteger8");
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralInteger8.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralInteger8.setValue(0);
		// LiteralInteger RecursiveDestruction_main_Call assertExtentOfC_cList::LiteralInteger72
		addToElementRepository("LiteralInteger72", RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralInteger72);
		RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralInteger72.setName("LiteralInteger72");
		RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralInteger72.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralInteger72.setValue(1);
		// LiteralInteger RecursiveDestruction_main_Create A_Star_Pattern_result::LiteralInteger41
		addToElementRepository("LiteralInteger41", RecursiveDestruction_main_Create_A_Star_Pattern_result_LiteralInteger41);
		RecursiveDestruction_main_Create_A_Star_Pattern_result_LiteralInteger41.setName("LiteralInteger41");
		RecursiveDestruction_main_Create_A_Star_Pattern_result_LiteralInteger41.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Create_A_Star_Pattern_result_LiteralInteger41.setValue(1);
		// LiteralInteger RecursiveDestruction_main_ObjectFlow68::LiteralInteger69
		addToElementRepository("LiteralInteger69", RecursiveDestruction_main_ObjectFlow68_LiteralInteger69);
		RecursiveDestruction_main_ObjectFlow68_LiteralInteger69.setName("LiteralInteger69");
		RecursiveDestruction_main_ObjectFlow68_LiteralInteger69.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow68_LiteralInteger69.setValue(1);
		// LiteralInteger RecursiveDestruction_main_Call assertExtentOfB_bList::LiteralInteger54
		addToElementRepository("LiteralInteger54", RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralInteger54);
		RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralInteger54.setName("LiteralInteger54");
		RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralInteger54.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralInteger54.setValue(1);
		// LiteralInteger RecursiveDestruction_main_ObjectFlow47::LiteralInteger48
		addToElementRepository("LiteralInteger48", RecursiveDestruction_main_ObjectFlow47_LiteralInteger48);
		RecursiveDestruction_main_ObjectFlow47_LiteralInteger48.setName("LiteralInteger48");
		RecursiveDestruction_main_ObjectFlow47_LiteralInteger48.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow47_LiteralInteger48.setValue(1);
		// LiteralInteger RecursiveDestruction_main_Call numberOfBInstances_bList::LiteralInteger27
		addToElementRepository("LiteralInteger27", RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralInteger27);
		RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralInteger27.setName("LiteralInteger27");
		RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralInteger27.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralInteger27.setValue(0);
		// LiteralInteger RecursiveDestruction_main_Call assertExtentOfB_bList::LiteralInteger55
		addToElementRepository("LiteralInteger55", RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralInteger55);
		RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralInteger55.setName("LiteralInteger55");
		RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralInteger55.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralInteger55.setValue(0);
		// LiteralInteger RecursiveDestruction_main_A_Star_Pattern()_target::LiteralInteger45
		addToElementRepository("LiteralInteger45", RecursiveDestruction_main_A_Star_Pattern__target_LiteralInteger45);
		RecursiveDestruction_main_A_Star_Pattern__target_LiteralInteger45.setName("LiteralInteger45");
		RecursiveDestruction_main_A_Star_Pattern__target_LiteralInteger45.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_A_Star_Pattern__target_LiteralInteger45.setValue(1);
		// LiteralInteger RecursiveDestruction_C_q::LiteralInteger84
		addToElementRepository("LiteralInteger84", RecursiveDestruction_C_q_LiteralInteger84);
		RecursiveDestruction_C_q_LiteralInteger84.setName("LiteralInteger84");
		RecursiveDestruction_C_q_LiteralInteger84.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_C_q_LiteralInteger84.setValue(1);
		// LiteralInteger RecursiveDestruction_R_x::LiteralInteger4
		addToElementRepository("LiteralInteger4", RecursiveDestruction_R_x_LiteralInteger4);
		RecursiveDestruction_R_x_LiteralInteger4.setName("LiteralInteger4");
		RecursiveDestruction_R_x_LiteralInteger4.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_R_x_LiteralInteger4.setValue(0);
		// LiteralInteger RecursiveDestruction_main_ObjectFlow57::LiteralInteger58
		addToElementRepository("LiteralInteger58", RecursiveDestruction_main_ObjectFlow57_LiteralInteger58);
		RecursiveDestruction_main_ObjectFlow57_LiteralInteger58.setName("LiteralInteger58");
		RecursiveDestruction_main_ObjectFlow57_LiteralInteger58.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow57_LiteralInteger58.setValue(1);
		// LiteralInteger RecursiveDestruction_main_Call assertExtentOfC_cList::LiteralInteger71
		addToElementRepository("LiteralInteger71", RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralInteger71);
		RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralInteger71.setName("LiteralInteger71");
		RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralInteger71.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralInteger71.setValue(0);
		// LiteralInteger RecursiveDestruction_main_A_Star_Pattern()_result::LiteralInteger44
		addToElementRepository("LiteralInteger44", RecursiveDestruction_main_A_Star_Pattern__result_LiteralInteger44);
		RecursiveDestruction_main_A_Star_Pattern__result_LiteralInteger44.setName("LiteralInteger44");
		RecursiveDestruction_main_A_Star_Pattern__result_LiteralInteger44.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_A_Star_Pattern__result_LiteralInteger44.setValue(1);
		// LiteralInteger RecursiveDestruction_main_Call assertExtentOfIImpl_iImplList::LiteralInteger9
		addToElementRepository("LiteralInteger9", RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralInteger9);
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralInteger9.setName("LiteralInteger9");
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralInteger9.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralInteger9.setValue(1);
		// LiteralInteger RecursiveDestruction_main_Call numberOfCInstances_cList::LiteralInteger37
		addToElementRepository("LiteralInteger37", RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralInteger37);
		RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralInteger37.setName("LiteralInteger37");
		RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralInteger37.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralInteger37.setValue(1);
		// LiteralInteger RecursiveDestruction_main_ObjectFlow32::LiteralInteger34
		addToElementRepository("LiteralInteger34", RecursiveDestruction_main_ObjectFlow32_LiteralInteger34);
		RecursiveDestruction_main_ObjectFlow32_LiteralInteger34.setName("LiteralInteger34");
		RecursiveDestruction_main_ObjectFlow32_LiteralInteger34.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_ObjectFlow32_LiteralInteger34.setValue(1);
		// LiteralInteger RecursiveDestruction_main_assertExtentOfC_cList::LiteralInteger26
		addToElementRepository("LiteralInteger26", RecursiveDestruction_main_assertExtentOfC_cList_LiteralInteger26);
		RecursiveDestruction_main_assertExtentOfC_cList_LiteralInteger26.setName("LiteralInteger26");
		RecursiveDestruction_main_assertExtentOfC_cList_LiteralInteger26.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_assertExtentOfC_cList_LiteralInteger26.setValue(0);
		// LiteralInteger RecursiveDestruction_main_assertExtentOfIImpl_iImplList::LiteralInteger11
		addToElementRepository("LiteralInteger11", RecursiveDestruction_main_assertExtentOfIImpl_iImplList_LiteralInteger11);
		RecursiveDestruction_main_assertExtentOfIImpl_iImplList_LiteralInteger11.setName("LiteralInteger11");
		RecursiveDestruction_main_assertExtentOfIImpl_iImplList_LiteralInteger11.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_assertExtentOfIImpl_iImplList_LiteralInteger11.setValue(0);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural RecursiveDestruction_main_assertExtentOfC_cList::LiteralUnlimitedNatural25
		addToElementRepository("LiteralUnlimitedNatural25", RecursiveDestruction_main_assertExtentOfC_cList_LiteralUnlimitedNatural25);
		RecursiveDestruction_main_assertExtentOfC_cList_LiteralUnlimitedNatural25.setName("LiteralUnlimitedNatural25");
		RecursiveDestruction_main_assertExtentOfC_cList_LiteralUnlimitedNatural25.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_assertExtentOfC_cList_LiteralUnlimitedNatural25.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_Call assertExtentOfIImpl_iImplList::LiteralUnlimitedNatural7
		addToElementRepository("LiteralUnlimitedNatural7", RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralUnlimitedNatural7);
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralUnlimitedNatural7.setName("LiteralUnlimitedNatural7");
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralUnlimitedNatural7.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList_LiteralUnlimitedNatural7.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_B_p::LiteralUnlimitedNatural83
		addToElementRepository("LiteralUnlimitedNatural83", RecursiveDestruction_B_p_LiteralUnlimitedNatural83);
		RecursiveDestruction_B_p_LiteralUnlimitedNatural83.setName("LiteralUnlimitedNatural83");
		RecursiveDestruction_B_p_LiteralUnlimitedNatural83.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_B_p_LiteralUnlimitedNatural83.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_Call numberOfBInstances_bList::LiteralUnlimitedNatural29
		addToElementRepository("LiteralUnlimitedNatural29", RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralUnlimitedNatural29);
		RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralUnlimitedNatural29.setName("LiteralUnlimitedNatural29");
		RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralUnlimitedNatural29.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfBInstances_bList_LiteralUnlimitedNatural29.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_numberOfIImplInstances_iImplList::LiteralUnlimitedNatural31
		addToElementRepository("LiteralUnlimitedNatural31", RecursiveDestruction_main_numberOfIImplInstances_iImplList_LiteralUnlimitedNatural31);
		RecursiveDestruction_main_numberOfIImplInstances_iImplList_LiteralUnlimitedNatural31.setName("LiteralUnlimitedNatural31");
		RecursiveDestruction_main_numberOfIImplInstances_iImplList_LiteralUnlimitedNatural31.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_numberOfIImplInstances_iImplList_LiteralUnlimitedNatural31.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_A_Star_Pattern_partB::LiteralUnlimitedNatural78
		addToElementRepository("LiteralUnlimitedNatural78", RecursiveDestruction_A_Star_Pattern_partB_LiteralUnlimitedNatural78);
		RecursiveDestruction_A_Star_Pattern_partB_LiteralUnlimitedNatural78.setName("LiteralUnlimitedNatural78");
		RecursiveDestruction_A_Star_Pattern_partB_LiteralUnlimitedNatural78.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_A_Star_Pattern_partB_LiteralUnlimitedNatural78.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_A_Star_Pattern_partC::LiteralUnlimitedNatural80
		addToElementRepository("LiteralUnlimitedNatural80", RecursiveDestruction_A_Star_Pattern_partC_LiteralUnlimitedNatural80);
		RecursiveDestruction_A_Star_Pattern_partC_LiteralUnlimitedNatural80.setName("LiteralUnlimitedNatural80");
		RecursiveDestruction_A_Star_Pattern_partC_LiteralUnlimitedNatural80.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_A_Star_Pattern_partC_LiteralUnlimitedNatural80.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_assertExtentOfB_bList::LiteralUnlimitedNatural16
		addToElementRepository("LiteralUnlimitedNatural16", RecursiveDestruction_main_assertExtentOfB_bList_LiteralUnlimitedNatural16);
		RecursiveDestruction_main_assertExtentOfB_bList_LiteralUnlimitedNatural16.setName("LiteralUnlimitedNatural16");
		RecursiveDestruction_main_assertExtentOfB_bList_LiteralUnlimitedNatural16.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_assertExtentOfB_bList_LiteralUnlimitedNatural16.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76_connectorEnd_2_Upper);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd76_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_numberOfBInstances_bList::LiteralUnlimitedNatural36
		addToElementRepository("LiteralUnlimitedNatural36", RecursiveDestruction_main_numberOfBInstances_bList_LiteralUnlimitedNatural36);
		RecursiveDestruction_main_numberOfBInstances_bList_LiteralUnlimitedNatural36.setName("LiteralUnlimitedNatural36");
		RecursiveDestruction_main_numberOfBInstances_bList_LiteralUnlimitedNatural36.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_numberOfBInstances_bList_LiteralUnlimitedNatural36.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_R_x::LiteralUnlimitedNatural3
		addToElementRepository("LiteralUnlimitedNatural3", RecursiveDestruction_R_x_LiteralUnlimitedNatural3);
		RecursiveDestruction_R_x_LiteralUnlimitedNatural3.setName("LiteralUnlimitedNatural3");
		RecursiveDestruction_R_x_LiteralUnlimitedNatural3.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_R_x_LiteralUnlimitedNatural3.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_A_Star_Pattern()_result::LiteralUnlimitedNatural42
		addToElementRepository("LiteralUnlimitedNatural42", RecursiveDestruction_main_A_Star_Pattern__result_LiteralUnlimitedNatural42);
		RecursiveDestruction_main_A_Star_Pattern__result_LiteralUnlimitedNatural42.setName("LiteralUnlimitedNatural42");
		RecursiveDestruction_main_A_Star_Pattern__result_LiteralUnlimitedNatural42.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_A_Star_Pattern__result_LiteralUnlimitedNatural42.setValue(1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_Create A_Star_Pattern_result::LiteralUnlimitedNatural40
		addToElementRepository("LiteralUnlimitedNatural40", RecursiveDestruction_main_Create_A_Star_Pattern_result_LiteralUnlimitedNatural40);
		RecursiveDestruction_main_Create_A_Star_Pattern_result_LiteralUnlimitedNatural40.setName("LiteralUnlimitedNatural40");
		RecursiveDestruction_main_Create_A_Star_Pattern_result_LiteralUnlimitedNatural40.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Create_A_Star_Pattern_result_LiteralUnlimitedNatural40.setValue(1);
		// LiteralUnlimitedNatural RecursiveDestruction_C_q::LiteralUnlimitedNatural85
		addToElementRepository("LiteralUnlimitedNatural85", RecursiveDestruction_C_q_LiteralUnlimitedNatural85);
		RecursiveDestruction_C_q_LiteralUnlimitedNatural85.setName("LiteralUnlimitedNatural85");
		RecursiveDestruction_C_q_LiteralUnlimitedNatural85.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_C_q_LiteralUnlimitedNatural85.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_numberOfCInstances_cList::LiteralUnlimitedNatural67
		addToElementRepository("LiteralUnlimitedNatural67", RecursiveDestruction_main_numberOfCInstances_cList_LiteralUnlimitedNatural67);
		RecursiveDestruction_main_numberOfCInstances_cList_LiteralUnlimitedNatural67.setName("LiteralUnlimitedNatural67");
		RecursiveDestruction_main_numberOfCInstances_cList_LiteralUnlimitedNatural67.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_numberOfCInstances_cList_LiteralUnlimitedNatural67.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75_connectorEnd_1_Upper);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_A_Star_Pattern_r_ConnectorEnd75_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_A_Star_Pattern()_target::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", RecursiveDestruction_main_A_Star_Pattern__target_LiteralUnlimitedNatural46);
		RecursiveDestruction_main_A_Star_Pattern__target_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		RecursiveDestruction_main_A_Star_Pattern__target_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_A_Star_Pattern__target_LiteralUnlimitedNatural46.setValue(1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_Call assertExtentOfB_bList::LiteralUnlimitedNatural56
		addToElementRepository("LiteralUnlimitedNatural56", RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralUnlimitedNatural56);
		RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralUnlimitedNatural56.setName("LiteralUnlimitedNatural56");
		RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralUnlimitedNatural56.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfB_bList_LiteralUnlimitedNatural56.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_assertExtentOfIImpl_iImplList::LiteralUnlimitedNatural10
		addToElementRepository("LiteralUnlimitedNatural10", RecursiveDestruction_main_assertExtentOfIImpl_iImplList_LiteralUnlimitedNatural10);
		RecursiveDestruction_main_assertExtentOfIImpl_iImplList_LiteralUnlimitedNatural10.setName("LiteralUnlimitedNatural10");
		RecursiveDestruction_main_assertExtentOfIImpl_iImplList_LiteralUnlimitedNatural10.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_assertExtentOfIImpl_iImplList_LiteralUnlimitedNatural10.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_R_y::LiteralUnlimitedNatural2
		addToElementRepository("LiteralUnlimitedNatural2", RecursiveDestruction_R_y_LiteralUnlimitedNatural2);
		RecursiveDestruction_R_y_LiteralUnlimitedNatural2.setName("LiteralUnlimitedNatural2");
		RecursiveDestruction_R_y_LiteralUnlimitedNatural2.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_R_y_LiteralUnlimitedNatural2.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_Call numberOfIImplInstances_iImplList::LiteralUnlimitedNatural24
		addToElementRepository("LiteralUnlimitedNatural24", RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralUnlimitedNatural24);
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralUnlimitedNatural24.setName("LiteralUnlimitedNatural24");
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralUnlimitedNatural24.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList_LiteralUnlimitedNatural24.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_Call assertExtentOfC_cList::LiteralUnlimitedNatural73
		addToElementRepository("LiteralUnlimitedNatural73", RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralUnlimitedNatural73);
		RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralUnlimitedNatural73.setName("LiteralUnlimitedNatural73");
		RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralUnlimitedNatural73.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_assertExtentOfC_cList_LiteralUnlimitedNatural73.setValue(-1);
		// LiteralUnlimitedNatural RecursiveDestruction_main_Call numberOfCInstances_cList::LiteralUnlimitedNatural39
		addToElementRepository("LiteralUnlimitedNatural39", RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralUnlimitedNatural39);
		RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralUnlimitedNatural39.setName("LiteralUnlimitedNatural39");
		RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralUnlimitedNatural39.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Call_numberOfCInstances_cList_LiteralUnlimitedNatural39.setValue(-1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow RecursiveDestruction_main::ObjectFlow47
		addToElementRepository("ObjectFlow47", RecursiveDestruction_main_ObjectFlow47);
		RecursiveDestruction_main_ObjectFlow47.setName("ObjectFlow47");
		RecursiveDestruction_main_ObjectFlow47.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ObjectFlow47.setSource(RecursiveDestruction_main_A_Star_Pattern__result);
		RecursiveDestruction_main_ObjectFlow47.setTarget(RecursiveDestruction_main_Destroy_A_Star_Pattern_target);
		RecursiveDestruction_main_ObjectFlow47.setGuard(RecursiveDestruction_main_ObjectFlow47_LiteralBoolean49);
		// ObjectFlow RecursiveDestruction_main::ObjectFlow50
		addToElementRepository("ObjectFlow50", RecursiveDestruction_main_ObjectFlow50);
		RecursiveDestruction_main_ObjectFlow50.setName("ObjectFlow50");
		RecursiveDestruction_main_ObjectFlow50.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ObjectFlow50.setSource(RecursiveDestruction_main_Extent_of_B_after_destruction_bExtent);
		RecursiveDestruction_main_ObjectFlow50.setTarget(RecursiveDestruction_main_Call_assertExtentOfB_bList);
		RecursiveDestruction_main_ObjectFlow50.setGuard(RecursiveDestruction_main_ObjectFlow50_LiteralBoolean52);
		// ObjectFlow RecursiveDestruction_main::ObjectFlow13
		addToElementRepository("ObjectFlow13", RecursiveDestruction_main_ObjectFlow13);
		RecursiveDestruction_main_ObjectFlow13.setName("ObjectFlow13");
		RecursiveDestruction_main_ObjectFlow13.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ObjectFlow13.setSource(RecursiveDestruction_main_Extent_of_IImpl_before_destruction_iImplExtent);
		RecursiveDestruction_main_ObjectFlow13.setTarget(RecursiveDestruction_main_Call_numberOfIImplInstances_iImplList);
		RecursiveDestruction_main_ObjectFlow13.setGuard(RecursiveDestruction_main_ObjectFlow13_LiteralBoolean14);
		// ObjectFlow RecursiveDestruction_main::ObjectFlow63
		addToElementRepository("ObjectFlow63", RecursiveDestruction_main_ObjectFlow63);
		RecursiveDestruction_main_ObjectFlow63.setName("ObjectFlow63");
		RecursiveDestruction_main_ObjectFlow63.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ObjectFlow63.setSource(RecursiveDestruction_main_Create_A_Star_Pattern_result);
		RecursiveDestruction_main_ObjectFlow63.setTarget(RecursiveDestruction_main_A_Star_Pattern__target);
		RecursiveDestruction_main_ObjectFlow63.setGuard(RecursiveDestruction_main_ObjectFlow63_LiteralBoolean64);
		// ObjectFlow RecursiveDestruction_main::ObjectFlow57
		addToElementRepository("ObjectFlow57", RecursiveDestruction_main_ObjectFlow57);
		RecursiveDestruction_main_ObjectFlow57.setName("ObjectFlow57");
		RecursiveDestruction_main_ObjectFlow57.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ObjectFlow57.setSource(RecursiveDestruction_main_Extent_of_B_before_destruction_bExtent);
		RecursiveDestruction_main_ObjectFlow57.setTarget(RecursiveDestruction_main_Call_numberOfBInstances_bList);
		RecursiveDestruction_main_ObjectFlow57.setGuard(RecursiveDestruction_main_ObjectFlow57_LiteralBoolean59);
		// ObjectFlow RecursiveDestruction_main::ObjectFlow18
		addToElementRepository("ObjectFlow18", RecursiveDestruction_main_ObjectFlow18);
		RecursiveDestruction_main_ObjectFlow18.setName("ObjectFlow18");
		RecursiveDestruction_main_ObjectFlow18.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ObjectFlow18.setSource(RecursiveDestruction_main_Extent_of_C_before_destruction_cExtent);
		RecursiveDestruction_main_ObjectFlow18.setTarget(RecursiveDestruction_main_Call_numberOfCInstances_cList);
		RecursiveDestruction_main_ObjectFlow18.setGuard(RecursiveDestruction_main_ObjectFlow18_LiteralBoolean19);
		// ObjectFlow RecursiveDestruction_main::ObjectFlow32
		addToElementRepository("ObjectFlow32", RecursiveDestruction_main_ObjectFlow32);
		RecursiveDestruction_main_ObjectFlow32.setName("ObjectFlow32");
		RecursiveDestruction_main_ObjectFlow32.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ObjectFlow32.setSource(RecursiveDestruction_main_Extent_of_C_after_destruction_cExtent);
		RecursiveDestruction_main_ObjectFlow32.setTarget(RecursiveDestruction_main_Call_assertExtentOfC_cList);
		RecursiveDestruction_main_ObjectFlow32.setGuard(RecursiveDestruction_main_ObjectFlow32_LiteralBoolean33);
		// ObjectFlow RecursiveDestruction_main::ObjectFlow68
		addToElementRepository("ObjectFlow68", RecursiveDestruction_main_ObjectFlow68);
		RecursiveDestruction_main_ObjectFlow68.setName("ObjectFlow68");
		RecursiveDestruction_main_ObjectFlow68.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_main_ObjectFlow68.setSource(RecursiveDestruction_main_Extent_of_IImpl_after_destruction_iImplExtent);
		RecursiveDestruction_main_ObjectFlow68.setTarget(RecursiveDestruction_main_Call_assertExtentOfIImpl_iImplList);
		RecursiveDestruction_main_ObjectFlow68.setGuard(RecursiveDestruction_main_ObjectFlow68_LiteralBoolean70);
	}

	private void initializeOperation_Instances()
	{
		// Operation RecursiveDestruction_A_Star_Pattern::A_Star_Pattern_A_Star_Pattern
		addToElementRepository("A_Star_Pattern_A_Star_Pattern", RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.setName("A_Star_Pattern");
		RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.addOwnedParameter(RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result);
		RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin RecursiveDestruction_main_Extent of IImpl after destruction::iImplExtent
		addToElementRepository("iImplExtent", RecursiveDestruction_main_Extent_of_IImpl_after_destruction_iImplExtent);
		RecursiveDestruction_main_Extent_of_IImpl_after_destruction_iImplExtent.setName("iImplExtent");
		RecursiveDestruction_main_Extent_of_IImpl_after_destruction_iImplExtent.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Extent_of_IImpl_after_destruction_iImplExtent.setType(RecursiveDestruction_IImpl);
		// OutputPin RecursiveDestruction_main_Extent of B before destruction::bExtent
		addToElementRepository("bExtent", RecursiveDestruction_main_Extent_of_B_before_destruction_bExtent);
		RecursiveDestruction_main_Extent_of_B_before_destruction_bExtent.setName("bExtent");
		RecursiveDestruction_main_Extent_of_B_before_destruction_bExtent.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Extent_of_B_before_destruction_bExtent.setType(RecursiveDestruction_B);
		// OutputPin RecursiveDestruction_main_Create A_Star_Pattern::result
		addToElementRepository("result", RecursiveDestruction_main_Create_A_Star_Pattern_result);
		RecursiveDestruction_main_Create_A_Star_Pattern_result.setName("result");
		RecursiveDestruction_main_Create_A_Star_Pattern_result.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Create_A_Star_Pattern_result.setType(RecursiveDestruction_A_Star_Pattern);
		// OutputPin RecursiveDestruction_main_A_Star_Pattern()::result
		addToElementRepository("result", RecursiveDestruction_main_A_Star_Pattern__result);
		RecursiveDestruction_main_A_Star_Pattern__result.setName("result");
		RecursiveDestruction_main_A_Star_Pattern__result.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_A_Star_Pattern__result.setType(RecursiveDestruction_A_Star_Pattern);
		// OutputPin RecursiveDestruction_main_Extent of IImpl before destruction::iImplExtent
		addToElementRepository("iImplExtent", RecursiveDestruction_main_Extent_of_IImpl_before_destruction_iImplExtent);
		RecursiveDestruction_main_Extent_of_IImpl_before_destruction_iImplExtent.setName("iImplExtent");
		RecursiveDestruction_main_Extent_of_IImpl_before_destruction_iImplExtent.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Extent_of_IImpl_before_destruction_iImplExtent.setType(RecursiveDestruction_IImpl);
		// OutputPin RecursiveDestruction_main_Extent of C before destruction::cExtent
		addToElementRepository("cExtent", RecursiveDestruction_main_Extent_of_C_before_destruction_cExtent);
		RecursiveDestruction_main_Extent_of_C_before_destruction_cExtent.setName("cExtent");
		RecursiveDestruction_main_Extent_of_C_before_destruction_cExtent.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Extent_of_C_before_destruction_cExtent.setType(RecursiveDestruction_C);
		// OutputPin RecursiveDestruction_main_Extent of B after destruction::bExtent
		addToElementRepository("bExtent", RecursiveDestruction_main_Extent_of_B_after_destruction_bExtent);
		RecursiveDestruction_main_Extent_of_B_after_destruction_bExtent.setName("bExtent");
		RecursiveDestruction_main_Extent_of_B_after_destruction_bExtent.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Extent_of_B_after_destruction_bExtent.setType(RecursiveDestruction_B);
		// OutputPin RecursiveDestruction_main_Extent of C after destruction::cExtent
		addToElementRepository("cExtent", RecursiveDestruction_main_Extent_of_C_after_destruction_cExtent);
		RecursiveDestruction_main_Extent_of_C_after_destruction_cExtent.setName("cExtent");
		RecursiveDestruction_main_Extent_of_C_after_destruction_cExtent.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Extent_of_C_after_destruction_cExtent.setType(RecursiveDestruction_C);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport RecursiveDestruction::PackageImport5
		addToElementRepository("PackageImport5", RecursiveDestruction_PackageImport5);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter RecursiveDestruction_main_numberOfCInstances::cList
		addToElementRepository("cList", RecursiveDestruction_main_numberOfCInstances_cList);
		RecursiveDestruction_main_numberOfCInstances_cList.setName("cList");
		RecursiveDestruction_main_numberOfCInstances_cList.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_numberOfCInstances_cList.setUpper(-1);
		RecursiveDestruction_main_numberOfCInstances_cList.setLower(0);
		RecursiveDestruction_main_numberOfCInstances_cList.setType(RecursiveDestruction_C);
		// Parameter RecursiveDestruction_main_assertExtentOfC::cList
		addToElementRepository("cList", RecursiveDestruction_main_assertExtentOfC_cList);
		RecursiveDestruction_main_assertExtentOfC_cList.setName("cList");
		RecursiveDestruction_main_assertExtentOfC_cList.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_assertExtentOfC_cList.setUpper(-1);
		RecursiveDestruction_main_assertExtentOfC_cList.setLower(0);
		RecursiveDestruction_main_assertExtentOfC_cList.setType(RecursiveDestruction_C);
		// Parameter RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern::result
		addToElementRepository("result", RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result);
		RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setName("result");
		RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setVisibility(VisibilityKind.public_);
		
		RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setType(RecursiveDestruction_A_Star_Pattern);
		RecursiveDestruction_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter RecursiveDestruction_main_assertExtentOfB::bList
		addToElementRepository("bList", RecursiveDestruction_main_assertExtentOfB_bList);
		RecursiveDestruction_main_assertExtentOfB_bList.setName("bList");
		RecursiveDestruction_main_assertExtentOfB_bList.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_assertExtentOfB_bList.setUpper(-1);
		RecursiveDestruction_main_assertExtentOfB_bList.setLower(0);
		RecursiveDestruction_main_assertExtentOfB_bList.setType(RecursiveDestruction_B);
		// Parameter RecursiveDestruction_main_numberOfIImplInstances::iImplList
		addToElementRepository("iImplList", RecursiveDestruction_main_numberOfIImplInstances_iImplList);
		RecursiveDestruction_main_numberOfIImplInstances_iImplList.setName("iImplList");
		RecursiveDestruction_main_numberOfIImplInstances_iImplList.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_numberOfIImplInstances_iImplList.setUpper(-1);
		RecursiveDestruction_main_numberOfIImplInstances_iImplList.setLower(0);
		RecursiveDestruction_main_numberOfIImplInstances_iImplList.setType(RecursiveDestruction_IImpl);
		// Parameter RecursiveDestruction_main_assertExtentOfIImpl::iImplList
		addToElementRepository("iImplList", RecursiveDestruction_main_assertExtentOfIImpl_iImplList);
		RecursiveDestruction_main_assertExtentOfIImpl_iImplList.setName("iImplList");
		RecursiveDestruction_main_assertExtentOfIImpl_iImplList.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_assertExtentOfIImpl_iImplList.setUpper(-1);
		RecursiveDestruction_main_assertExtentOfIImpl_iImplList.setLower(0);
		RecursiveDestruction_main_assertExtentOfIImpl_iImplList.setType(RecursiveDestruction_IImpl);
		// Parameter RecursiveDestruction_main_numberOfBInstances::bList
		addToElementRepository("bList", RecursiveDestruction_main_numberOfBInstances_bList);
		RecursiveDestruction_main_numberOfBInstances_bList.setName("bList");
		RecursiveDestruction_main_numberOfBInstances_bList.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_numberOfBInstances_bList.setUpper(-1);
		RecursiveDestruction_main_numberOfBInstances_bList.setLower(0);
		RecursiveDestruction_main_numberOfBInstances_bList.setType(RecursiveDestruction_B);
	}

	private void initializePort_Instances()
	{
		// Port RecursiveDestruction_C::q
		addToElementRepository("q", RecursiveDestruction_C_q);
		RecursiveDestruction_C_q.setName("q");
		RecursiveDestruction_C_q.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_C_q.setUpper(-1);
		RecursiveDestruction_C_q.setType(RecursiveDestruction_IImpl);
		RecursiveDestruction_C_q.setAggregation(AggregationKind.composite);
		RecursiveDestruction_C_q.isService = true;
		RecursiveDestruction_C_q.addProvided(RecursiveDestruction_I);
		// Port RecursiveDestruction_B::p
		addToElementRepository("p", RecursiveDestruction_B_p);
		RecursiveDestruction_B_p.setName("p");
		RecursiveDestruction_B_p.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_B_p.setUpper(-1);
		RecursiveDestruction_B_p.setLower(2);
		RecursiveDestruction_B_p.setType(RecursiveDestruction_IImpl);
		RecursiveDestruction_B_p.setAggregation(AggregationKind.composite);
		RecursiveDestruction_B_p.isService = true;
		RecursiveDestruction_B_p.addProvided(RecursiveDestruction_I);
	}

	private void initializeProperty_Instances()
	{
		// Property RecursiveDestruction_R::y
		addToElementRepository("y", RecursiveDestruction_R_y);
		RecursiveDestruction_R_y.setName("y");
		RecursiveDestruction_R_y.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_R_y.setUpper(-1);
		RecursiveDestruction_R_y.setLower(0);
		RecursiveDestruction_R_y.setType(RecursiveDestruction_IImpl);
		// Property RecursiveDestruction_A_Star_Pattern::partB
		addToElementRepository("partB", RecursiveDestruction_A_Star_Pattern_partB);
		RecursiveDestruction_A_Star_Pattern_partB.setName("partB");
		RecursiveDestruction_A_Star_Pattern_partB.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_A_Star_Pattern_partB.setUpper(-1);
		RecursiveDestruction_A_Star_Pattern_partB.setLower(2);
		RecursiveDestruction_A_Star_Pattern_partB.setType(RecursiveDestruction_B);
		RecursiveDestruction_A_Star_Pattern_partB.setAggregation(AggregationKind.composite);
		// Property RecursiveDestruction_A_Star_Pattern::partC
		addToElementRepository("partC", RecursiveDestruction_A_Star_Pattern_partC);
		RecursiveDestruction_A_Star_Pattern_partC.setName("partC");
		RecursiveDestruction_A_Star_Pattern_partC.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_A_Star_Pattern_partC.setUpper(-1);
		RecursiveDestruction_A_Star_Pattern_partC.setLower(5);
		RecursiveDestruction_A_Star_Pattern_partC.setType(RecursiveDestruction_C);
		RecursiveDestruction_A_Star_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property RecursiveDestruction_R::x
		addToElementRepository("x", RecursiveDestruction_R_x);
		RecursiveDestruction_R_x.setName("x");
		RecursiveDestruction_R_x.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_R_x.setUpper(-1);
		RecursiveDestruction_R_x.setLower(0);
		RecursiveDestruction_R_x.setType(RecursiveDestruction_IImpl);
	}

	private void initializeReadExtentAction_Instances()
	{
		// ReadExtentAction RecursiveDestruction_main::Extent of C after destruction
		addToElementRepository("Extent of C after destruction", RecursiveDestruction_main_Extent_of_C_after_destruction);
		RecursiveDestruction_main_Extent_of_C_after_destruction.setName("Extent of C after destruction");
		RecursiveDestruction_main_Extent_of_C_after_destruction.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Extent_of_C_after_destruction.setClassifier(RecursiveDestruction_C);
		RecursiveDestruction_main_Extent_of_C_after_destruction.setResult(RecursiveDestruction_main_Extent_of_C_after_destruction_cExtent);
		// ReadExtentAction RecursiveDestruction_main::Extent of B after destruction
		addToElementRepository("Extent of B after destruction", RecursiveDestruction_main_Extent_of_B_after_destruction);
		RecursiveDestruction_main_Extent_of_B_after_destruction.setName("Extent of B after destruction");
		RecursiveDestruction_main_Extent_of_B_after_destruction.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Extent_of_B_after_destruction.setClassifier(RecursiveDestruction_B);
		RecursiveDestruction_main_Extent_of_B_after_destruction.setResult(RecursiveDestruction_main_Extent_of_B_after_destruction_bExtent);
		// ReadExtentAction RecursiveDestruction_main::Extent of IImpl after destruction
		addToElementRepository("Extent of IImpl after destruction", RecursiveDestruction_main_Extent_of_IImpl_after_destruction);
		RecursiveDestruction_main_Extent_of_IImpl_after_destruction.setName("Extent of IImpl after destruction");
		RecursiveDestruction_main_Extent_of_IImpl_after_destruction.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Extent_of_IImpl_after_destruction.setClassifier(RecursiveDestruction_IImpl);
		RecursiveDestruction_main_Extent_of_IImpl_after_destruction.setResult(RecursiveDestruction_main_Extent_of_IImpl_after_destruction_iImplExtent);
		// ReadExtentAction RecursiveDestruction_main::Extent of B before destruction
		addToElementRepository("Extent of B before destruction", RecursiveDestruction_main_Extent_of_B_before_destruction);
		RecursiveDestruction_main_Extent_of_B_before_destruction.setName("Extent of B before destruction");
		RecursiveDestruction_main_Extent_of_B_before_destruction.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Extent_of_B_before_destruction.setClassifier(RecursiveDestruction_B);
		RecursiveDestruction_main_Extent_of_B_before_destruction.setResult(RecursiveDestruction_main_Extent_of_B_before_destruction_bExtent);
		// ReadExtentAction RecursiveDestruction_main::Extent of IImpl before destruction
		addToElementRepository("Extent of IImpl before destruction", RecursiveDestruction_main_Extent_of_IImpl_before_destruction);
		RecursiveDestruction_main_Extent_of_IImpl_before_destruction.setName("Extent of IImpl before destruction");
		RecursiveDestruction_main_Extent_of_IImpl_before_destruction.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Extent_of_IImpl_before_destruction.setClassifier(RecursiveDestruction_IImpl);
		RecursiveDestruction_main_Extent_of_IImpl_before_destruction.setResult(RecursiveDestruction_main_Extent_of_IImpl_before_destruction_iImplExtent);
		// ReadExtentAction RecursiveDestruction_main::Extent of C before destruction
		addToElementRepository("Extent of C before destruction", RecursiveDestruction_main_Extent_of_C_before_destruction);
		RecursiveDestruction_main_Extent_of_C_before_destruction.setName("Extent of C before destruction");
		RecursiveDestruction_main_Extent_of_C_before_destruction.setVisibility(VisibilityKind.public_);
		RecursiveDestruction_main_Extent_of_C_before_destruction.setClassifier(RecursiveDestruction_C);
		RecursiveDestruction_main_Extent_of_C_before_destruction.setResult(RecursiveDestruction_main_Extent_of_C_before_destruction_cExtent);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // RecursiveDestructionModel
