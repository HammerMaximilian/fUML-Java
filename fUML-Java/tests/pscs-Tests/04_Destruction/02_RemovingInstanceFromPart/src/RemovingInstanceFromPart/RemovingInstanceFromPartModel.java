/*
 * RemovingInstanceFromPartModel.java
 * 
 * Auto-generated file
 */
package RemovingInstanceFromPart;

import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.structuredclassifiers.Connector;
import uml.values.LiteralUnlimitedNatural;
import uml.actions.ClearStructuralFeatureAction;
import uml.simpleclassifiers.InterfaceRealization;
import uml.actions.OutputPin;
import uml.activities.Activity;
import uml.actions.CallOperationAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.simpleclassifiers.Interface;
import uml.commonstructure.Comment;
import uml.classification.Operation;
import uml.classification.Parameter;
import uml.activities.ActivityParameterNode;
import uml.commonstructure.PackageImport;
import uml.classification.AggregationKind;
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

public class RemovingInstanceFromPartModel extends InMemoryModel
{
	private static RemovingInstanceFromPartModel instance;

	/*
	 * Model RemovingInstanceFromPart
	 */
	public Package RemovingInstanceFromPart = new Package();
		public Comment RemovingInstanceFromPart_Comment0 = new Comment();
		public Association RemovingInstanceFromPart_R = new Association();
			public Property RemovingInstanceFromPart_R_x = new Property();
			public Property RemovingInstanceFromPart_R_y = new Property();
		public Class_ RemovingInstanceFromPart_B = new Class_();
			public Activity RemovingInstanceFromPart_B_setPActivity = new Activity();
				public ObjectFlow RemovingInstanceFromPart_B_setPActivity_ObjectFlow1 = new ObjectFlow();
					public LiteralBoolean RemovingInstanceFromPart_B_setPActivity_ObjectFlow1_LiteralBoolean2 = new LiteralBoolean();
					public LiteralInteger RemovingInstanceFromPart_B_setPActivity_ObjectFlow1_LiteralInteger3 = new LiteralInteger();
				public ReadSelfAction RemovingInstanceFromPart_B_setPActivity_this = new ReadSelfAction();
					public OutputPin RemovingInstanceFromPart_B_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural RemovingInstanceFromPart_B_setPActivity_this_result_LiteralUnlimitedNatural4 = new LiteralUnlimitedNatural();
						public LiteralInteger RemovingInstanceFromPart_B_setPActivity_this_result_LiteralInteger5 = new LiteralInteger();
				public AddStructuralFeatureValueAction RemovingInstanceFromPart_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin RemovingInstanceFromPart_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralInteger RemovingInstanceFromPart_B_setPActivity_Set_this_p_object_LiteralInteger6 = new LiteralInteger();
						public LiteralUnlimitedNatural RemovingInstanceFromPart_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural7 = new LiteralUnlimitedNatural();
					public OutputPin RemovingInstanceFromPart_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural RemovingInstanceFromPart_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural8 = new LiteralUnlimitedNatural();
						public LiteralInteger RemovingInstanceFromPart_B_setPActivity_Set_this_p_result_LiteralInteger9 = new LiteralInteger();
					public InputPin RemovingInstanceFromPart_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralInteger RemovingInstanceFromPart_B_setPActivity_Set_this_p_value_LiteralInteger10 = new LiteralInteger();
						public LiteralUnlimitedNatural RemovingInstanceFromPart_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11 = new LiteralUnlimitedNatural();
				public ActivityParameterNode RemovingInstanceFromPart_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger RemovingInstanceFromPart_B_setPActivity_vParameterNode_LiteralInteger12 = new LiteralInteger();
				public ObjectFlow RemovingInstanceFromPart_B_setPActivity_ObjectFlow13 = new ObjectFlow();
					public LiteralBoolean RemovingInstanceFromPart_B_setPActivity_ObjectFlow13_LiteralBoolean14 = new LiteralBoolean();
					public LiteralInteger RemovingInstanceFromPart_B_setPActivity_ObjectFlow13_LiteralInteger15 = new LiteralInteger();
				public Parameter RemovingInstanceFromPart_B_setPActivity_v = new Parameter();
			public Operation RemovingInstanceFromPart_B_B_B = new Operation();
				public Parameter RemovingInstanceFromPart_B_B_B_result = new Parameter();
			public InterfaceRealization RemovingInstanceFromPart_B_IRealization = new InterfaceRealization();
			public Operation RemovingInstanceFromPart_B_setP_Integer = new Operation();
				public Parameter RemovingInstanceFromPart_B_setP_Integer_v = new Parameter();
			public Property RemovingInstanceFromPart_B_p = new Property();
		public Activity RemovingInstanceFromPart_main = new Activity();
			public ObjectFlow RemovingInstanceFromPart_main_ObjectFlow16 = new ObjectFlow();
				public LiteralInteger RemovingInstanceFromPart_main_ObjectFlow16_LiteralInteger17 = new LiteralInteger();
				public LiteralBoolean RemovingInstanceFromPart_main_ObjectFlow16_LiteralBoolean18 = new LiteralBoolean();
			public ClearStructuralFeatureAction RemovingInstanceFromPart_main_Clear_a_b = new ClearStructuralFeatureAction();
				public OutputPin RemovingInstanceFromPart_main_Clear_a_b_result = new OutputPin();
				public InputPin RemovingInstanceFromPart_main_Clear_a_b_object = new InputPin();
			public ObjectFlow RemovingInstanceFromPart_main_ObjectFlow19 = new ObjectFlow();
				public LiteralBoolean RemovingInstanceFromPart_main_ObjectFlow19_LiteralBoolean20 = new LiteralBoolean();
				public LiteralInteger RemovingInstanceFromPart_main_ObjectFlow19_LiteralInteger21 = new LiteralInteger();
			public CallOperationAction RemovingInstanceFromPart_main_A_ = new CallOperationAction();
				public InputPin RemovingInstanceFromPart_main_A__target = new InputPin();
					public LiteralUnlimitedNatural RemovingInstanceFromPart_main_A__target_LiteralUnlimitedNatural22 = new LiteralUnlimitedNatural();
					public LiteralInteger RemovingInstanceFromPart_main_A__target_LiteralInteger23 = new LiteralInteger();
				public OutputPin RemovingInstanceFromPart_main_A__result = new OutputPin();
					public LiteralInteger RemovingInstanceFromPart_main_A__result_LiteralInteger24 = new LiteralInteger();
					public LiteralInteger RemovingInstanceFromPart_main_A__result_LiteralInteger25 = new LiteralInteger();
					public LiteralUnlimitedNatural RemovingInstanceFromPart_main_A__result_LiteralUnlimitedNatural26 = new LiteralUnlimitedNatural();
			public CallBehaviorAction RemovingInstanceFromPart_main_Call_assertA = new CallBehaviorAction();
				public InputPin RemovingInstanceFromPart_main_Call_assertA_a = new InputPin();
					public LiteralInteger RemovingInstanceFromPart_main_Call_assertA_a_LiteralInteger27 = new LiteralInteger();
					public LiteralUnlimitedNatural RemovingInstanceFromPart_main_Call_assertA_a_LiteralUnlimitedNatural28 = new LiteralUnlimitedNatural();
					public LiteralInteger RemovingInstanceFromPart_main_Call_assertA_a_LiteralInteger29 = new LiteralInteger();
			public CreateObjectAction RemovingInstanceFromPart_main_Create_A = new CreateObjectAction();
				public OutputPin RemovingInstanceFromPart_main_Create_A_result = new OutputPin();
					public LiteralUnlimitedNatural RemovingInstanceFromPart_main_Create_A_result_LiteralUnlimitedNatural30 = new LiteralUnlimitedNatural();
					public LiteralInteger RemovingInstanceFromPart_main_Create_A_result_LiteralInteger31 = new LiteralInteger();
			public ObjectFlow RemovingInstanceFromPart_main_ObjectFlow32 = new ObjectFlow();
				public LiteralBoolean RemovingInstanceFromPart_main_ObjectFlow32_LiteralBoolean33 = new LiteralBoolean();
				public LiteralInteger RemovingInstanceFromPart_main_ObjectFlow32_LiteralInteger34 = new LiteralInteger();
		public Class_ RemovingInstanceFromPart_IImpl = new Class_();
			public InterfaceRealization RemovingInstanceFromPart_IImpl_IRealization = new InterfaceRealization();
			public Operation RemovingInstanceFromPart_IImpl_setP_Integer = new Operation();
				public Parameter RemovingInstanceFromPart_IImpl_setP_Integer_v = new Parameter();
		public Class_ RemovingInstanceFromPart_A = new Class_();
			public Connector RemovingInstanceFromPart_A_r = new Connector();
				public ConnectorEnd RemovingInstanceFromPart_A_r_ConnectorEnd35 = new ConnectorEnd();
				public ConnectorEnd RemovingInstanceFromPart_A_r_ConnectorEnd36 = new ConnectorEnd();
			public Operation RemovingInstanceFromPart_A_A_A = new Operation();
				public Parameter RemovingInstanceFromPart_A_A_A_result = new Parameter();
			public Property RemovingInstanceFromPart_A_b = new Property();
			public Port RemovingInstanceFromPart_A_q = new Port();
		public Activity RemovingInstanceFromPart_assertA = new Activity();
			public Parameter RemovingInstanceFromPart_assertA_a = new Parameter();
			public OpaqueBehavior RemovingInstanceFromPart_assertA_assertionNotImplemented = new OpaqueBehavior();
			public ActivityParameterNode RemovingInstanceFromPart_assertA_aParameterNode = new ActivityParameterNode();
				public LiteralInteger RemovingInstanceFromPart_assertA_aParameterNode_LiteralInteger37 = new LiteralInteger();
			public CallBehaviorAction RemovingInstanceFromPart_assertA_Call_assertionNotImplemented = new CallBehaviorAction();
		public PackageImport RemovingInstanceFromPart_PackageImport38 = new PackageImport();
		public Interface RemovingInstanceFromPart_I = new Interface();
			public Operation RemovingInstanceFromPart_I_setP_Integer = new Operation();
				public Parameter RemovingInstanceFromPart_I_setP_Integer_v = new Parameter();

	public static RemovingInstanceFromPartModel instance()
	{
		if (instance == null)
        {
            instance = new RemovingInstanceFromPartModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public RemovingInstanceFromPartModel()
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
		this.initializeClearStructuralFeatureAction_Instances();
		this.initializeComment_Instances();
		this.initializeConnector_Instances();
		this.initializeConnectorEnd_Instances();
		this.initializeCreateObjectAction_Instances();
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
	}

	private void initializeActivity_Instances()
	{
		// Activity RemovingInstanceFromPart_B::setPActivity
		addToElementRepository("setPActivity", RemovingInstanceFromPart_B_setPActivity);
		RemovingInstanceFromPart_B_setPActivity.setName("setPActivity");
		RemovingInstanceFromPart_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_B_setPActivity.addOwnedParameter(RemovingInstanceFromPart_B_setPActivity_v);
		RemovingInstanceFromPart_B_setPActivity.addNode(RemovingInstanceFromPart_B_setPActivity_this);
		RemovingInstanceFromPart_B_setPActivity.addNode(RemovingInstanceFromPart_B_setPActivity_Set_this_p);
		RemovingInstanceFromPart_B_setPActivity.addNode(RemovingInstanceFromPart_B_setPActivity_vParameterNode);
		RemovingInstanceFromPart_B_setPActivity.addEdge(RemovingInstanceFromPart_B_setPActivity_ObjectFlow1);
		RemovingInstanceFromPart_B_setPActivity.addEdge(RemovingInstanceFromPart_B_setPActivity_ObjectFlow13);
		// Activity RemovingInstanceFromPart::main
		addToElementRepository("main", RemovingInstanceFromPart_main);
		RemovingInstanceFromPart_main.setName("main");
		RemovingInstanceFromPart_main.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main.addNode(RemovingInstanceFromPart_main_Clear_a_b);
		RemovingInstanceFromPart_main.addNode(RemovingInstanceFromPart_main_A_);
		RemovingInstanceFromPart_main.addNode(RemovingInstanceFromPart_main_Call_assertA);
		RemovingInstanceFromPart_main.addNode(RemovingInstanceFromPart_main_Create_A);
		RemovingInstanceFromPart_main.addEdge(RemovingInstanceFromPart_main_ObjectFlow16);
		RemovingInstanceFromPart_main.addEdge(RemovingInstanceFromPart_main_ObjectFlow19);
		RemovingInstanceFromPart_main.addEdge(RemovingInstanceFromPart_main_ObjectFlow32);
		// Activity RemovingInstanceFromPart::assertA
		addToElementRepository("assertA", RemovingInstanceFromPart_assertA);
		RemovingInstanceFromPart_assertA.setName("assertA");
		RemovingInstanceFromPart_assertA.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_assertA.addOwnedBehavior(RemovingInstanceFromPart_assertA_assertionNotImplemented);
		RemovingInstanceFromPart_assertA.addOwnedParameter(RemovingInstanceFromPart_assertA_a);
		RemovingInstanceFromPart_assertA.addNode(RemovingInstanceFromPart_assertA_aParameterNode);
		RemovingInstanceFromPart_assertA.addNode(RemovingInstanceFromPart_assertA_Call_assertionNotImplemented);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode RemovingInstanceFromPart_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", RemovingInstanceFromPart_B_setPActivity_vParameterNode);
		RemovingInstanceFromPart_B_setPActivity_vParameterNode.setName("vParameterNode");
		RemovingInstanceFromPart_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_B_setPActivity_vParameterNode.setParameter(RemovingInstanceFromPart_B_setPActivity_v);
		// ActivityParameterNode RemovingInstanceFromPart_assertA::aParameterNode
		addToElementRepository("aParameterNode", RemovingInstanceFromPart_assertA_aParameterNode);
		RemovingInstanceFromPart_assertA_aParameterNode.setName("aParameterNode");
		RemovingInstanceFromPart_assertA_aParameterNode.setVisibility(VisibilityKind.public_);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction RemovingInstanceFromPart_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", RemovingInstanceFromPart_B_setPActivity_Set_this_p);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p.setName("Set this.p");
		RemovingInstanceFromPart_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p.setStructuralFeature(RemovingInstanceFromPart_B_p);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p.setObject(RemovingInstanceFromPart_B_setPActivity_Set_this_p_object);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p.setValue(RemovingInstanceFromPart_B_setPActivity_Set_this_p_value);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p.setResult(RemovingInstanceFromPart_B_setPActivity_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association RemovingInstanceFromPart::R
		addToElementRepository("R", RemovingInstanceFromPart_R);
		RemovingInstanceFromPart_R.setName("R");
		RemovingInstanceFromPart_R.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_R.addOwnedEnd(RemovingInstanceFromPart_R_x);
		RemovingInstanceFromPart_R.addOwnedEnd(RemovingInstanceFromPart_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction RemovingInstanceFromPart_main::Call assertA
		addToElementRepository("Call assertA", RemovingInstanceFromPart_main_Call_assertA);
		RemovingInstanceFromPart_main_Call_assertA.setName("Call assertA");
		RemovingInstanceFromPart_main_Call_assertA.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_Call_assertA.setBehavior(RemovingInstanceFromPart_assertA);
		RemovingInstanceFromPart_main_Call_assertA.addArgument(RemovingInstanceFromPart_main_Call_assertA_a);
		// CallBehaviorAction RemovingInstanceFromPart_assertA::Call assertionNotImplemented
		addToElementRepository("Call assertionNotImplemented", RemovingInstanceFromPart_assertA_Call_assertionNotImplemented);
		RemovingInstanceFromPart_assertA_Call_assertionNotImplemented.setName("Call assertionNotImplemented");
		RemovingInstanceFromPart_assertA_Call_assertionNotImplemented.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_assertA_Call_assertionNotImplemented.setBehavior(RemovingInstanceFromPart_assertA_assertionNotImplemented);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction RemovingInstanceFromPart_main::A()
		addToElementRepository("A()", RemovingInstanceFromPart_main_A_);
		RemovingInstanceFromPart_main_A_.setName("A()");
		RemovingInstanceFromPart_main_A_.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_main_A_.addResult(RemovingInstanceFromPart_main_A__result);
		RemovingInstanceFromPart_main_A_.setOperation(RemovingInstanceFromPart_A_A_A);
		RemovingInstanceFromPart_main_A_.setTarget(RemovingInstanceFromPart_main_A__target);
	}

	private void initializeClass_Instances()
	{
		// Class RemovingInstanceFromPart::B
		addToElementRepository("B", RemovingInstanceFromPart_B);
		RemovingInstanceFromPart_B.setName("B");
		RemovingInstanceFromPart_B.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_B.addOwnedAttribute(RemovingInstanceFromPart_B_p);
		RemovingInstanceFromPart_B.addOwnedBehavior(RemovingInstanceFromPart_B_setPActivity);
		RemovingInstanceFromPart_B.addInterfaceRealization(RemovingInstanceFromPart_B_IRealization);
		
		RemovingInstanceFromPart_B.addOwnedOperation(RemovingInstanceFromPart_B_B_B);
		RemovingInstanceFromPart_B.addOwnedOperation(RemovingInstanceFromPart_B_setP_Integer);
		// Class RemovingInstanceFromPart::IImpl
		addToElementRepository("IImpl", RemovingInstanceFromPart_IImpl);
		RemovingInstanceFromPart_IImpl.setName("IImpl");
		RemovingInstanceFromPart_IImpl.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_IImpl.addInterfaceRealization(RemovingInstanceFromPart_IImpl_IRealization);
		
		RemovingInstanceFromPart_IImpl.addOwnedOperation(RemovingInstanceFromPart_IImpl_setP_Integer);
		// Class RemovingInstanceFromPart::A
		addToElementRepository("A", RemovingInstanceFromPart_A);
		RemovingInstanceFromPart_A.setName("A");
		RemovingInstanceFromPart_A.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_A.addOwnedAttribute(RemovingInstanceFromPart_A_q);
		RemovingInstanceFromPart_A.addOwnedAttribute(RemovingInstanceFromPart_A_b);
		
		RemovingInstanceFromPart_A.addOwnedConnector(RemovingInstanceFromPart_A_r);
		RemovingInstanceFromPart_A.addOwnedOperation(RemovingInstanceFromPart_A_A_A);
	}

	private void initializeClearStructuralFeatureAction_Instances()
	{
		// ClearStructuralFeatureAction RemovingInstanceFromPart_main::Clear a.b
		addToElementRepository("Clear a.b", RemovingInstanceFromPart_main_Clear_a_b);
		RemovingInstanceFromPart_main_Clear_a_b.setName("Clear a.b");
		RemovingInstanceFromPart_main_Clear_a_b.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_Clear_a_b.setStructuralFeature(RemovingInstanceFromPart_A_b);
		RemovingInstanceFromPart_main_Clear_a_b.setObject(RemovingInstanceFromPart_main_Clear_a_b_object);
		RemovingInstanceFromPart_main_Clear_a_b.setResult(RemovingInstanceFromPart_main_Clear_a_b_result);
	}

	private void initializeComment_Instances()
	{
		// Comment RemovingInstanceFromPart::Comment0
		addToElementRepository("Comment0", RemovingInstanceFromPart_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector RemovingInstanceFromPart_A::r
		addToElementRepository("r", RemovingInstanceFromPart_A_r);
		RemovingInstanceFromPart_A_r.setName("r");
		RemovingInstanceFromPart_A_r.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_A_r.addEnd(RemovingInstanceFromPart_A_r_ConnectorEnd35);
		RemovingInstanceFromPart_A_r.addEnd(RemovingInstanceFromPart_A_r_ConnectorEnd36);
		RemovingInstanceFromPart_A_r.setType(RemovingInstanceFromPart_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd RemovingInstanceFromPart_A_r::ConnectorEnd35
		addToElementRepository("ConnectorEnd35", RemovingInstanceFromPart_A_r_ConnectorEnd35);
		RemovingInstanceFromPart_A_r_ConnectorEnd35.setRole(RemovingInstanceFromPart_A_q);
		// ConnectorEnd RemovingInstanceFromPart_A_r::ConnectorEnd36
		addToElementRepository("ConnectorEnd36", RemovingInstanceFromPart_A_r_ConnectorEnd36);
		RemovingInstanceFromPart_A_r_ConnectorEnd36.setRole(RemovingInstanceFromPart_A_b);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction RemovingInstanceFromPart_main::Create A
		addToElementRepository("Create A", RemovingInstanceFromPart_main_Create_A);
		RemovingInstanceFromPart_main_Create_A.setName("Create A");
		RemovingInstanceFromPart_main_Create_A.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_Create_A.setClassifier(RemovingInstanceFromPart_A);
		RemovingInstanceFromPart_main_Create_A.setResult(RemovingInstanceFromPart_main_Create_A_result);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior RemovingInstanceFromPart_assertA::assertionNotImplemented
		addToElementRepository("assertionNotImplemented", RemovingInstanceFromPart_assertA_assertionNotImplemented);
		RemovingInstanceFromPart_assertA_assertionNotImplemented.setName("assertionNotImplemented");
		RemovingInstanceFromPart_assertA_assertionNotImplemented.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_assertA_assertionNotImplemented.addLanguage("Java");
		RemovingInstanceFromPart_assertA_assertionNotImplemented.addBody("System.out.println(\"Assertion currenlty not implemented! Model was validated by manual debugging.\");");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin RemovingInstanceFromPart_B_setPActivity_Set this.p::object
		addToElementRepository("object", RemovingInstanceFromPart_B_setPActivity_Set_this_p_object);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_object.setName("object");
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_object.setType(RemovingInstanceFromPart_B);
		// InputPin RemovingInstanceFromPart_main_A()::target
		addToElementRepository("target", RemovingInstanceFromPart_main_A__target);
		RemovingInstanceFromPart_main_A__target.setName("target");
		RemovingInstanceFromPart_main_A__target.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_A__target.setType(RemovingInstanceFromPart_A);
		// InputPin RemovingInstanceFromPart_main_Call assertA::a
		addToElementRepository("a", RemovingInstanceFromPart_main_Call_assertA_a);
		RemovingInstanceFromPart_main_Call_assertA_a.setName("a");
		RemovingInstanceFromPart_main_Call_assertA_a.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_Call_assertA_a.setType(RemovingInstanceFromPart_A);
		// InputPin RemovingInstanceFromPart_main_Clear a.b::object
		addToElementRepository("object", RemovingInstanceFromPart_main_Clear_a_b_object);
		RemovingInstanceFromPart_main_Clear_a_b_object.setName("object");
		RemovingInstanceFromPart_main_Clear_a_b_object.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_Clear_a_b_object.setType(RemovingInstanceFromPart_A);
		// InputPin RemovingInstanceFromPart_B_setPActivity_Set this.p::value
		addToElementRepository("value", RemovingInstanceFromPart_B_setPActivity_Set_this_p_value);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_value.setName("value");
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeInterface_Instances()
	{
		// Interface RemovingInstanceFromPart::I
		addToElementRepository("I", RemovingInstanceFromPart_I);
		RemovingInstanceFromPart_I.setName("I");
		RemovingInstanceFromPart_I.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_I.addOwnedOperation(RemovingInstanceFromPart_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization RemovingInstanceFromPart_IImpl::IRealization
		addToElementRepository("IRealization", RemovingInstanceFromPart_IImpl_IRealization);
		RemovingInstanceFromPart_IImpl_IRealization.setName("IRealization");
		RemovingInstanceFromPart_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_IImpl_IRealization.setContract(RemovingInstanceFromPart_I);
		// InterfaceRealization RemovingInstanceFromPart_B::IRealization
		addToElementRepository("IRealization", RemovingInstanceFromPart_B_IRealization);
		RemovingInstanceFromPart_B_IRealization.setName("IRealization");
		RemovingInstanceFromPart_B_IRealization.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_IRealization.setContract(RemovingInstanceFromPart_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean RemovingInstanceFromPart_B_setPActivity_ObjectFlow1::LiteralBoolean2
		addToElementRepository("LiteralBoolean2", RemovingInstanceFromPart_B_setPActivity_ObjectFlow1_LiteralBoolean2);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow1_LiteralBoolean2.setName("LiteralBoolean2");
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow1_LiteralBoolean2.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow1_LiteralBoolean2.setValue(true);
		// LiteralBoolean RemovingInstanceFromPart_main_ObjectFlow32::LiteralBoolean33
		addToElementRepository("LiteralBoolean33", RemovingInstanceFromPart_main_ObjectFlow32_LiteralBoolean33);
		RemovingInstanceFromPart_main_ObjectFlow32_LiteralBoolean33.setName("LiteralBoolean33");
		RemovingInstanceFromPart_main_ObjectFlow32_LiteralBoolean33.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_ObjectFlow32_LiteralBoolean33.setValue(true);
		// LiteralBoolean RemovingInstanceFromPart_B_setPActivity_ObjectFlow13::LiteralBoolean14
		addToElementRepository("LiteralBoolean14", RemovingInstanceFromPart_B_setPActivity_ObjectFlow13_LiteralBoolean14);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow13_LiteralBoolean14.setName("LiteralBoolean14");
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow13_LiteralBoolean14.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow13_LiteralBoolean14.setValue(true);
		// LiteralBoolean RemovingInstanceFromPart_main_ObjectFlow19::LiteralBoolean20
		addToElementRepository("LiteralBoolean20", RemovingInstanceFromPart_main_ObjectFlow19_LiteralBoolean20);
		RemovingInstanceFromPart_main_ObjectFlow19_LiteralBoolean20.setName("LiteralBoolean20");
		RemovingInstanceFromPart_main_ObjectFlow19_LiteralBoolean20.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_ObjectFlow19_LiteralBoolean20.setValue(true);
		// LiteralBoolean RemovingInstanceFromPart_main_ObjectFlow16::LiteralBoolean18
		addToElementRepository("LiteralBoolean18", RemovingInstanceFromPart_main_ObjectFlow16_LiteralBoolean18);
		RemovingInstanceFromPart_main_ObjectFlow16_LiteralBoolean18.setName("LiteralBoolean18");
		RemovingInstanceFromPart_main_ObjectFlow16_LiteralBoolean18.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_ObjectFlow16_LiteralBoolean18.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger RemovingInstanceFromPart_B_setPActivity_Set this.p_value::LiteralInteger10
		addToElementRepository("LiteralInteger10", RemovingInstanceFromPart_B_setPActivity_Set_this_p_value_LiteralInteger10);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_value_LiteralInteger10.setName("LiteralInteger10");
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_value_LiteralInteger10.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_value_LiteralInteger10.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_main_Call assertA_a::LiteralInteger27
		addToElementRepository("LiteralInteger27", RemovingInstanceFromPart_main_Call_assertA_a_LiteralInteger27);
		RemovingInstanceFromPart_main_Call_assertA_a_LiteralInteger27.setName("LiteralInteger27");
		RemovingInstanceFromPart_main_Call_assertA_a_LiteralInteger27.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_Call_assertA_a_LiteralInteger27.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_B_setPActivity_this_result::LiteralInteger5
		addToElementRepository("LiteralInteger5", RemovingInstanceFromPart_B_setPActivity_this_result_LiteralInteger5);
		RemovingInstanceFromPart_B_setPActivity_this_result_LiteralInteger5.setName("LiteralInteger5");
		RemovingInstanceFromPart_B_setPActivity_this_result_LiteralInteger5.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_this_result_LiteralInteger5.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_assertA_aParameterNode::LiteralInteger37
		addToElementRepository("LiteralInteger37", RemovingInstanceFromPart_assertA_aParameterNode_LiteralInteger37);
		RemovingInstanceFromPart_assertA_aParameterNode_LiteralInteger37.setName("LiteralInteger37");
		RemovingInstanceFromPart_assertA_aParameterNode_LiteralInteger37.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_assertA_aParameterNode_LiteralInteger37.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_B_setPActivity_vParameterNode::LiteralInteger12
		addToElementRepository("LiteralInteger12", RemovingInstanceFromPart_B_setPActivity_vParameterNode_LiteralInteger12);
		RemovingInstanceFromPart_B_setPActivity_vParameterNode_LiteralInteger12.setName("LiteralInteger12");
		RemovingInstanceFromPart_B_setPActivity_vParameterNode_LiteralInteger12.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_vParameterNode_LiteralInteger12.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_main_ObjectFlow32::LiteralInteger34
		addToElementRepository("LiteralInteger34", RemovingInstanceFromPart_main_ObjectFlow32_LiteralInteger34);
		RemovingInstanceFromPart_main_ObjectFlow32_LiteralInteger34.setName("LiteralInteger34");
		RemovingInstanceFromPart_main_ObjectFlow32_LiteralInteger34.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_ObjectFlow32_LiteralInteger34.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_main_A()_result::LiteralInteger25
		addToElementRepository("LiteralInteger25", RemovingInstanceFromPart_main_A__result_LiteralInteger25);
		RemovingInstanceFromPart_main_A__result_LiteralInteger25.setName("LiteralInteger25");
		RemovingInstanceFromPart_main_A__result_LiteralInteger25.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_A__result_LiteralInteger25.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_main_Call assertA_a::LiteralInteger29
		addToElementRepository("LiteralInteger29", RemovingInstanceFromPart_main_Call_assertA_a_LiteralInteger29);
		RemovingInstanceFromPart_main_Call_assertA_a_LiteralInteger29.setName("LiteralInteger29");
		RemovingInstanceFromPart_main_Call_assertA_a_LiteralInteger29.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_Call_assertA_a_LiteralInteger29.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_main_A()_result::LiteralInteger24
		addToElementRepository("LiteralInteger24", RemovingInstanceFromPart_main_A__result_LiteralInteger24);
		RemovingInstanceFromPart_main_A__result_LiteralInteger24.setName("LiteralInteger24");
		RemovingInstanceFromPart_main_A__result_LiteralInteger24.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_A__result_LiteralInteger24.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_main_ObjectFlow16::LiteralInteger17
		addToElementRepository("LiteralInteger17", RemovingInstanceFromPart_main_ObjectFlow16_LiteralInteger17);
		RemovingInstanceFromPart_main_ObjectFlow16_LiteralInteger17.setName("LiteralInteger17");
		RemovingInstanceFromPart_main_ObjectFlow16_LiteralInteger17.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_ObjectFlow16_LiteralInteger17.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_B_setPActivity_ObjectFlow13::LiteralInteger15
		addToElementRepository("LiteralInteger15", RemovingInstanceFromPart_B_setPActivity_ObjectFlow13_LiteralInteger15);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow13_LiteralInteger15.setName("LiteralInteger15");
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow13_LiteralInteger15.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow13_LiteralInteger15.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_main_Create A_result::LiteralInteger31
		addToElementRepository("LiteralInteger31", RemovingInstanceFromPart_main_Create_A_result_LiteralInteger31);
		RemovingInstanceFromPart_main_Create_A_result_LiteralInteger31.setName("LiteralInteger31");
		RemovingInstanceFromPart_main_Create_A_result_LiteralInteger31.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_Create_A_result_LiteralInteger31.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_B_setPActivity_Set this.p_result::LiteralInteger9
		addToElementRepository("LiteralInteger9", RemovingInstanceFromPart_B_setPActivity_Set_this_p_result_LiteralInteger9);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_result_LiteralInteger9.setName("LiteralInteger9");
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_result_LiteralInteger9.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_result_LiteralInteger9.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_B_setPActivity_Set this.p_object::LiteralInteger6
		addToElementRepository("LiteralInteger6", RemovingInstanceFromPart_B_setPActivity_Set_this_p_object_LiteralInteger6);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_object_LiteralInteger6.setName("LiteralInteger6");
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_object_LiteralInteger6.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_object_LiteralInteger6.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_main_ObjectFlow19::LiteralInteger21
		addToElementRepository("LiteralInteger21", RemovingInstanceFromPart_main_ObjectFlow19_LiteralInteger21);
		RemovingInstanceFromPart_main_ObjectFlow19_LiteralInteger21.setName("LiteralInteger21");
		RemovingInstanceFromPart_main_ObjectFlow19_LiteralInteger21.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_ObjectFlow19_LiteralInteger21.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_B_setPActivity_ObjectFlow1::LiteralInteger3
		addToElementRepository("LiteralInteger3", RemovingInstanceFromPart_B_setPActivity_ObjectFlow1_LiteralInteger3);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow1_LiteralInteger3.setName("LiteralInteger3");
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow1_LiteralInteger3.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow1_LiteralInteger3.setValue(1);
		// LiteralInteger RemovingInstanceFromPart_main_A()_target::LiteralInteger23
		addToElementRepository("LiteralInteger23", RemovingInstanceFromPart_main_A__target_LiteralInteger23);
		RemovingInstanceFromPart_main_A__target_LiteralInteger23.setName("LiteralInteger23");
		RemovingInstanceFromPart_main_A__target_LiteralInteger23.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_A__target_LiteralInteger23.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural RemovingInstanceFromPart_B_setPActivity_this_result::LiteralUnlimitedNatural4
		addToElementRepository("LiteralUnlimitedNatural4", RemovingInstanceFromPart_B_setPActivity_this_result_LiteralUnlimitedNatural4);
		RemovingInstanceFromPart_B_setPActivity_this_result_LiteralUnlimitedNatural4.setName("LiteralUnlimitedNatural4");
		RemovingInstanceFromPart_B_setPActivity_this_result_LiteralUnlimitedNatural4.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_this_result_LiteralUnlimitedNatural4.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPart_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural8
		addToElementRepository("LiteralUnlimitedNatural8", RemovingInstanceFromPart_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural8);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural8.setName("LiteralUnlimitedNatural8");
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural8.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural8.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPart_main_Create A_result::LiteralUnlimitedNatural30
		addToElementRepository("LiteralUnlimitedNatural30", RemovingInstanceFromPart_main_Create_A_result_LiteralUnlimitedNatural30);
		RemovingInstanceFromPart_main_Create_A_result_LiteralUnlimitedNatural30.setName("LiteralUnlimitedNatural30");
		RemovingInstanceFromPart_main_Create_A_result_LiteralUnlimitedNatural30.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_Create_A_result_LiteralUnlimitedNatural30.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPart_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural11
		addToElementRepository("LiteralUnlimitedNatural11", RemovingInstanceFromPart_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11.setName("LiteralUnlimitedNatural11");
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPart_main_A()_target::LiteralUnlimitedNatural22
		addToElementRepository("LiteralUnlimitedNatural22", RemovingInstanceFromPart_main_A__target_LiteralUnlimitedNatural22);
		RemovingInstanceFromPart_main_A__target_LiteralUnlimitedNatural22.setName("LiteralUnlimitedNatural22");
		RemovingInstanceFromPart_main_A__target_LiteralUnlimitedNatural22.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_A__target_LiteralUnlimitedNatural22.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPart_main_Call assertA_a::LiteralUnlimitedNatural28
		addToElementRepository("LiteralUnlimitedNatural28", RemovingInstanceFromPart_main_Call_assertA_a_LiteralUnlimitedNatural28);
		RemovingInstanceFromPart_main_Call_assertA_a_LiteralUnlimitedNatural28.setName("LiteralUnlimitedNatural28");
		RemovingInstanceFromPart_main_Call_assertA_a_LiteralUnlimitedNatural28.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_Call_assertA_a_LiteralUnlimitedNatural28.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPart_main_A()_result::LiteralUnlimitedNatural26
		addToElementRepository("LiteralUnlimitedNatural26", RemovingInstanceFromPart_main_A__result_LiteralUnlimitedNatural26);
		RemovingInstanceFromPart_main_A__result_LiteralUnlimitedNatural26.setName("LiteralUnlimitedNatural26");
		RemovingInstanceFromPart_main_A__result_LiteralUnlimitedNatural26.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_A__result_LiteralUnlimitedNatural26.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPart_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural7
		addToElementRepository("LiteralUnlimitedNatural7", RemovingInstanceFromPart_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural7);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural7.setName("LiteralUnlimitedNatural7");
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural7.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural7.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow RemovingInstanceFromPart_B_setPActivity::ObjectFlow1
		addToElementRepository("ObjectFlow1", RemovingInstanceFromPart_B_setPActivity_ObjectFlow1);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow1.setName("ObjectFlow1");
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow1.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow1.setSource(RemovingInstanceFromPart_B_setPActivity_vParameterNode);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow1.setTarget(RemovingInstanceFromPart_B_setPActivity_Set_this_p_value);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow1.setGuard(RemovingInstanceFromPart_B_setPActivity_ObjectFlow1_LiteralBoolean2);
		// ObjectFlow RemovingInstanceFromPart_main::ObjectFlow16
		addToElementRepository("ObjectFlow16", RemovingInstanceFromPart_main_ObjectFlow16);
		RemovingInstanceFromPart_main_ObjectFlow16.setName("ObjectFlow16");
		RemovingInstanceFromPart_main_ObjectFlow16.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_main_ObjectFlow16.setSource(RemovingInstanceFromPart_main_A__result);
		RemovingInstanceFromPart_main_ObjectFlow16.setTarget(RemovingInstanceFromPart_main_Clear_a_b_object);
		RemovingInstanceFromPart_main_ObjectFlow16.setGuard(RemovingInstanceFromPart_main_ObjectFlow16_LiteralBoolean18);
		// ObjectFlow RemovingInstanceFromPart_B_setPActivity::ObjectFlow13
		addToElementRepository("ObjectFlow13", RemovingInstanceFromPart_B_setPActivity_ObjectFlow13);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow13.setName("ObjectFlow13");
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow13.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow13.setSource(RemovingInstanceFromPart_B_setPActivity_this_result);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow13.setTarget(RemovingInstanceFromPart_B_setPActivity_Set_this_p_object);
		RemovingInstanceFromPart_B_setPActivity_ObjectFlow13.setGuard(RemovingInstanceFromPart_B_setPActivity_ObjectFlow13_LiteralBoolean14);
		// ObjectFlow RemovingInstanceFromPart_main::ObjectFlow19
		addToElementRepository("ObjectFlow19", RemovingInstanceFromPart_main_ObjectFlow19);
		RemovingInstanceFromPart_main_ObjectFlow19.setName("ObjectFlow19");
		RemovingInstanceFromPart_main_ObjectFlow19.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_main_ObjectFlow19.setSource(RemovingInstanceFromPart_main_Clear_a_b_result);
		RemovingInstanceFromPart_main_ObjectFlow19.setTarget(RemovingInstanceFromPart_main_Call_assertA_a);
		RemovingInstanceFromPart_main_ObjectFlow19.setGuard(RemovingInstanceFromPart_main_ObjectFlow19_LiteralBoolean20);
		// ObjectFlow RemovingInstanceFromPart_main::ObjectFlow32
		addToElementRepository("ObjectFlow32", RemovingInstanceFromPart_main_ObjectFlow32);
		RemovingInstanceFromPart_main_ObjectFlow32.setName("ObjectFlow32");
		RemovingInstanceFromPart_main_ObjectFlow32.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_main_ObjectFlow32.setSource(RemovingInstanceFromPart_main_Create_A_result);
		RemovingInstanceFromPart_main_ObjectFlow32.setTarget(RemovingInstanceFromPart_main_A__target);
		RemovingInstanceFromPart_main_ObjectFlow32.setGuard(RemovingInstanceFromPart_main_ObjectFlow32_LiteralBoolean33);
	}

	private void initializeOperation_Instances()
	{
		// Operation RemovingInstanceFromPart_I::setP_Integer
		addToElementRepository("setP_Integer", RemovingInstanceFromPart_I_setP_Integer);
		RemovingInstanceFromPart_I_setP_Integer.setName("setP");
		RemovingInstanceFromPart_I_setP_Integer.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_I_setP_Integer.addOwnedParameter(RemovingInstanceFromPart_I_setP_Integer_v);
		// Operation RemovingInstanceFromPart_A::A_A
		addToElementRepository("A_A", RemovingInstanceFromPart_A_A_A);
		RemovingInstanceFromPart_A_A_A.setName("A");
		RemovingInstanceFromPart_A_A_A.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_A_A_A.addOwnedParameter(RemovingInstanceFromPart_A_A_A_result);
		RemovingInstanceFromPart_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation RemovingInstanceFromPart_B::B_B
		addToElementRepository("B_B", RemovingInstanceFromPart_B_B_B);
		RemovingInstanceFromPart_B_B_B.setName("B");
		RemovingInstanceFromPart_B_B_B.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_B_B.addOwnedParameter(RemovingInstanceFromPart_B_B_B_result);
		RemovingInstanceFromPart_B_B_B.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation RemovingInstanceFromPart_IImpl::setP_Integer
		addToElementRepository("setP_Integer", RemovingInstanceFromPart_IImpl_setP_Integer);
		RemovingInstanceFromPart_IImpl_setP_Integer.setName("setP");
		RemovingInstanceFromPart_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_IImpl_setP_Integer.addOwnedParameter(RemovingInstanceFromPart_IImpl_setP_Integer_v);
		// Operation RemovingInstanceFromPart_B::setP_Integer
		addToElementRepository("setP_Integer", RemovingInstanceFromPart_B_setP_Integer);
		RemovingInstanceFromPart_B_setP_Integer.setName("setP");
		RemovingInstanceFromPart_B_setP_Integer.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setP_Integer.addOwnedParameter(RemovingInstanceFromPart_B_setP_Integer_v);
		RemovingInstanceFromPart_B_setP_Integer.addMethod(RemovingInstanceFromPart_B_setPActivity);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin RemovingInstanceFromPart_main_A()::result
		addToElementRepository("result", RemovingInstanceFromPart_main_A__result);
		RemovingInstanceFromPart_main_A__result.setName("result");
		RemovingInstanceFromPart_main_A__result.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_A__result.setType(RemovingInstanceFromPart_A);
		// OutputPin RemovingInstanceFromPart_B_setPActivity_this::result
		addToElementRepository("result", RemovingInstanceFromPart_B_setPActivity_this_result);
		RemovingInstanceFromPart_B_setPActivity_this_result.setName("result");
		RemovingInstanceFromPart_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_this_result.setType(RemovingInstanceFromPart_B);
		// OutputPin RemovingInstanceFromPart_main_Clear a.b::result
		addToElementRepository("result", RemovingInstanceFromPart_main_Clear_a_b_result);
		RemovingInstanceFromPart_main_Clear_a_b_result.setName("result");
		RemovingInstanceFromPart_main_Clear_a_b_result.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_Clear_a_b_result.setType(RemovingInstanceFromPart_A);
		// OutputPin RemovingInstanceFromPart_B_setPActivity_Set this.p::result
		addToElementRepository("result", RemovingInstanceFromPart_B_setPActivity_Set_this_p_result);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_result.setName("result");
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_Set_this_p_result.setType(RemovingInstanceFromPart_B);
		// OutputPin RemovingInstanceFromPart_main_Create A::result
		addToElementRepository("result", RemovingInstanceFromPart_main_Create_A_result);
		RemovingInstanceFromPart_main_Create_A_result.setName("result");
		RemovingInstanceFromPart_main_Create_A_result.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_main_Create_A_result.setType(RemovingInstanceFromPart_A);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport RemovingInstanceFromPart::PackageImport38
		addToElementRepository("PackageImport38", RemovingInstanceFromPart_PackageImport38);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter RemovingInstanceFromPart_B_setP_Integer::v
		addToElementRepository("v", RemovingInstanceFromPart_B_setP_Integer_v);
		RemovingInstanceFromPart_B_setP_Integer_v.setName("v");
		RemovingInstanceFromPart_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter RemovingInstanceFromPart_assertA::a
		addToElementRepository("a", RemovingInstanceFromPart_assertA_a);
		RemovingInstanceFromPart_assertA_a.setName("a");
		RemovingInstanceFromPart_assertA_a.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_assertA_a.setType(RemovingInstanceFromPart_A);
		// Parameter RemovingInstanceFromPart_B_B_B::result
		addToElementRepository("result", RemovingInstanceFromPart_B_B_B_result);
		RemovingInstanceFromPart_B_B_B_result.setName("result");
		RemovingInstanceFromPart_B_B_B_result.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_B_B_B_result.setType(RemovingInstanceFromPart_B);
		RemovingInstanceFromPart_B_B_B_result.setDirection(ParameterDirectionKind.return_);
		// Parameter RemovingInstanceFromPart_I_setP_Integer::v
		addToElementRepository("v", RemovingInstanceFromPart_I_setP_Integer_v);
		RemovingInstanceFromPart_I_setP_Integer_v.setName("v");
		RemovingInstanceFromPart_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter RemovingInstanceFromPart_IImpl_setP_Integer::v
		addToElementRepository("v", RemovingInstanceFromPart_IImpl_setP_Integer_v);
		RemovingInstanceFromPart_IImpl_setP_Integer_v.setName("v");
		RemovingInstanceFromPart_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter RemovingInstanceFromPart_A_A_A::result
		addToElementRepository("result", RemovingInstanceFromPart_A_A_A_result);
		RemovingInstanceFromPart_A_A_A_result.setName("result");
		RemovingInstanceFromPart_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_A_A_A_result.setType(RemovingInstanceFromPart_A);
		RemovingInstanceFromPart_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter RemovingInstanceFromPart_B_setPActivity::v
		addToElementRepository("v", RemovingInstanceFromPart_B_setPActivity_v);
		RemovingInstanceFromPart_B_setPActivity_v.setName("v");
		RemovingInstanceFromPart_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializePort_Instances()
	{
		// Port RemovingInstanceFromPart_A::q
		addToElementRepository("q", RemovingInstanceFromPart_A_q);
		RemovingInstanceFromPart_A_q.setName("q");
		RemovingInstanceFromPart_A_q.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_A_q.setType(RemovingInstanceFromPart_IImpl);
		RemovingInstanceFromPart_A_q.setAggregation(AggregationKind.composite);
		RemovingInstanceFromPart_A_q.isService = true;
		RemovingInstanceFromPart_A_q.addProvided(RemovingInstanceFromPart_I);
	}

	private void initializeProperty_Instances()
	{
		// Property RemovingInstanceFromPart_A::b
		addToElementRepository("b", RemovingInstanceFromPart_A_b);
		RemovingInstanceFromPart_A_b.setName("b");
		RemovingInstanceFromPart_A_b.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_A_b.setType(RemovingInstanceFromPart_B);
		RemovingInstanceFromPart_A_b.setAggregation(AggregationKind.composite);
		// Property RemovingInstanceFromPart_R::x
		addToElementRepository("x", RemovingInstanceFromPart_R_x);
		RemovingInstanceFromPart_R_x.setName("x");
		RemovingInstanceFromPart_R_x.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_R_x.setType(RemovingInstanceFromPart_B);
		// Property RemovingInstanceFromPart_R::y
		addToElementRepository("y", RemovingInstanceFromPart_R_y);
		RemovingInstanceFromPart_R_y.setName("y");
		RemovingInstanceFromPart_R_y.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_R_y.setType(RemovingInstanceFromPart_IImpl);
		// Property RemovingInstanceFromPart_B::p
		addToElementRepository("p", RemovingInstanceFromPart_B_p);
		RemovingInstanceFromPart_B_p.setName("p");
		RemovingInstanceFromPart_B_p.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPart_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction RemovingInstanceFromPart_B_setPActivity::this
		addToElementRepository("this", RemovingInstanceFromPart_B_setPActivity_this);
		RemovingInstanceFromPart_B_setPActivity_this.setName("this");
		RemovingInstanceFromPart_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPart_B_setPActivity_this.setResult(RemovingInstanceFromPart_B_setPActivity_this_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // RemovingInstanceFromPartModel
