/*
 * RemovingInstanceFromPortModel.java
 * 
 * Auto-generated file
 */
package RemovingInstanceFromPort;

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

public class RemovingInstanceFromPortModel extends InMemoryModel
{
	private static RemovingInstanceFromPortModel instance;

	/*
	 * Model RemovingInstanceFromPort
	 */
	public Package RemovingInstanceFromPort = new Package();
		public Comment RemovingInstanceFromPort_Comment0 = new Comment();
		public Association RemovingInstanceFromPort_R = new Association();
			public Property RemovingInstanceFromPort_R_x = new Property();
			public Property RemovingInstanceFromPort_R_y = new Property();
		public Class_ RemovingInstanceFromPort_B = new Class_();
			public Activity RemovingInstanceFromPort_B_setPActivity = new Activity();
				public ObjectFlow RemovingInstanceFromPort_B_setPActivity_ObjectFlow1 = new ObjectFlow();
					public LiteralBoolean RemovingInstanceFromPort_B_setPActivity_ObjectFlow1_LiteralBoolean2 = new LiteralBoolean();
					public LiteralInteger RemovingInstanceFromPort_B_setPActivity_ObjectFlow1_LiteralInteger3 = new LiteralInteger();
				public ReadSelfAction RemovingInstanceFromPort_B_setPActivity_this = new ReadSelfAction();
					public OutputPin RemovingInstanceFromPort_B_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural RemovingInstanceFromPort_B_setPActivity_this_result_LiteralUnlimitedNatural4 = new LiteralUnlimitedNatural();
						public LiteralInteger RemovingInstanceFromPort_B_setPActivity_this_result_LiteralInteger5 = new LiteralInteger();
				public AddStructuralFeatureValueAction RemovingInstanceFromPort_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin RemovingInstanceFromPort_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralInteger RemovingInstanceFromPort_B_setPActivity_Set_this_p_object_LiteralInteger6 = new LiteralInteger();
						public LiteralUnlimitedNatural RemovingInstanceFromPort_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural7 = new LiteralUnlimitedNatural();
					public OutputPin RemovingInstanceFromPort_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural RemovingInstanceFromPort_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural8 = new LiteralUnlimitedNatural();
						public LiteralInteger RemovingInstanceFromPort_B_setPActivity_Set_this_p_result_LiteralInteger9 = new LiteralInteger();
					public InputPin RemovingInstanceFromPort_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralInteger RemovingInstanceFromPort_B_setPActivity_Set_this_p_value_LiteralInteger10 = new LiteralInteger();
						public LiteralUnlimitedNatural RemovingInstanceFromPort_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11 = new LiteralUnlimitedNatural();
				public ActivityParameterNode RemovingInstanceFromPort_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger RemovingInstanceFromPort_B_setPActivity_vParameterNode_LiteralInteger12 = new LiteralInteger();
				public ObjectFlow RemovingInstanceFromPort_B_setPActivity_ObjectFlow13 = new ObjectFlow();
					public LiteralBoolean RemovingInstanceFromPort_B_setPActivity_ObjectFlow13_LiteralBoolean14 = new LiteralBoolean();
					public LiteralInteger RemovingInstanceFromPort_B_setPActivity_ObjectFlow13_LiteralInteger15 = new LiteralInteger();
				public Parameter RemovingInstanceFromPort_B_setPActivity_v = new Parameter();
			public Operation RemovingInstanceFromPort_B_B_B = new Operation();
				public Parameter RemovingInstanceFromPort_B_B_B_result = new Parameter();
			public InterfaceRealization RemovingInstanceFromPort_B_IRealization = new InterfaceRealization();
			public Operation RemovingInstanceFromPort_B_setP_Integer = new Operation();
				public Parameter RemovingInstanceFromPort_B_setP_Integer_v = new Parameter();
			public Property RemovingInstanceFromPort_B_p = new Property();
		public Activity RemovingInstanceFromPort_main = new Activity();
			public ObjectFlow RemovingInstanceFromPort_main_ObjectFlow16 = new ObjectFlow();
				public LiteralInteger RemovingInstanceFromPort_main_ObjectFlow16_LiteralInteger17 = new LiteralInteger();
				public LiteralBoolean RemovingInstanceFromPort_main_ObjectFlow16_LiteralBoolean18 = new LiteralBoolean();
			public ClearStructuralFeatureAction RemovingInstanceFromPort_main_Clear_a_q = new ClearStructuralFeatureAction();
				public OutputPin RemovingInstanceFromPort_main_Clear_a_q_result = new OutputPin();
				public InputPin RemovingInstanceFromPort_main_Clear_a_q_object = new InputPin();
			public ObjectFlow RemovingInstanceFromPort_main_ObjectFlow19 = new ObjectFlow();
				public LiteralBoolean RemovingInstanceFromPort_main_ObjectFlow19_LiteralBoolean20 = new LiteralBoolean();
				public LiteralInteger RemovingInstanceFromPort_main_ObjectFlow19_LiteralInteger21 = new LiteralInteger();
			public CallOperationAction RemovingInstanceFromPort_main_A_ = new CallOperationAction();
				public InputPin RemovingInstanceFromPort_main_A__target = new InputPin();
					public LiteralUnlimitedNatural RemovingInstanceFromPort_main_A__target_LiteralUnlimitedNatural22 = new LiteralUnlimitedNatural();
					public LiteralInteger RemovingInstanceFromPort_main_A__target_LiteralInteger23 = new LiteralInteger();
				public OutputPin RemovingInstanceFromPort_main_A__result = new OutputPin();
					public LiteralInteger RemovingInstanceFromPort_main_A__result_LiteralInteger24 = new LiteralInteger();
					public LiteralInteger RemovingInstanceFromPort_main_A__result_LiteralInteger25 = new LiteralInteger();
					public LiteralUnlimitedNatural RemovingInstanceFromPort_main_A__result_LiteralUnlimitedNatural26 = new LiteralUnlimitedNatural();
			public CallBehaviorAction RemovingInstanceFromPort_main_Call_assertA = new CallBehaviorAction();
				public InputPin RemovingInstanceFromPort_main_Call_assertA_a = new InputPin();
					public LiteralInteger RemovingInstanceFromPort_main_Call_assertA_a_LiteralInteger27 = new LiteralInteger();
					public LiteralUnlimitedNatural RemovingInstanceFromPort_main_Call_assertA_a_LiteralUnlimitedNatural28 = new LiteralUnlimitedNatural();
					public LiteralInteger RemovingInstanceFromPort_main_Call_assertA_a_LiteralInteger29 = new LiteralInteger();
			public CreateObjectAction RemovingInstanceFromPort_main_Create_A = new CreateObjectAction();
				public OutputPin RemovingInstanceFromPort_main_Create_A_result = new OutputPin();
					public LiteralUnlimitedNatural RemovingInstanceFromPort_main_Create_A_result_LiteralUnlimitedNatural30 = new LiteralUnlimitedNatural();
					public LiteralInteger RemovingInstanceFromPort_main_Create_A_result_LiteralInteger31 = new LiteralInteger();
			public ObjectFlow RemovingInstanceFromPort_main_ObjectFlow32 = new ObjectFlow();
				public LiteralBoolean RemovingInstanceFromPort_main_ObjectFlow32_LiteralBoolean33 = new LiteralBoolean();
				public LiteralInteger RemovingInstanceFromPort_main_ObjectFlow32_LiteralInteger34 = new LiteralInteger();
		public Class_ RemovingInstanceFromPort_IImpl = new Class_();
			public InterfaceRealization RemovingInstanceFromPort_IImpl_IRealization = new InterfaceRealization();
			public Operation RemovingInstanceFromPort_IImpl_setP_Integer = new Operation();
				public Parameter RemovingInstanceFromPort_IImpl_setP_Integer_v = new Parameter();
		public Class_ RemovingInstanceFromPort_A = new Class_();
			public Connector RemovingInstanceFromPort_A_r = new Connector();
				public ConnectorEnd RemovingInstanceFromPort_A_r_ConnectorEnd35 = new ConnectorEnd();
				public ConnectorEnd RemovingInstanceFromPort_A_r_ConnectorEnd36 = new ConnectorEnd();
			public Operation RemovingInstanceFromPort_A_A_A = new Operation();
				public Parameter RemovingInstanceFromPort_A_A_A_result = new Parameter();
			public Property RemovingInstanceFromPort_A_b = new Property();
			public Port RemovingInstanceFromPort_A_q = new Port();
		public Activity RemovingInstanceFromPort_assertA = new Activity();
			public Parameter RemovingInstanceFromPort_assertA_a = new Parameter();
			public OpaqueBehavior RemovingInstanceFromPort_assertA_assertionNotImplemented = new OpaqueBehavior();
			public ActivityParameterNode RemovingInstanceFromPort_assertA_aParameterNode = new ActivityParameterNode();
				public LiteralInteger RemovingInstanceFromPort_assertA_aParameterNode_LiteralInteger37 = new LiteralInteger();
			public CallBehaviorAction RemovingInstanceFromPort_assertA_Call_assertionNotImplemented = new CallBehaviorAction();
		public PackageImport RemovingInstanceFromPort_PackageImport38 = new PackageImport();
		public Interface RemovingInstanceFromPort_I = new Interface();
			public Operation RemovingInstanceFromPort_I_setP_Integer = new Operation();
				public Parameter RemovingInstanceFromPort_I_setP_Integer_v = new Parameter();

	public static RemovingInstanceFromPortModel instance()
	{
		if (instance == null)
        {
            instance = new RemovingInstanceFromPortModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public RemovingInstanceFromPortModel()
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
		// Activity RemovingInstanceFromPort_B::setPActivity
		addToElementRepository("setPActivity", RemovingInstanceFromPort_B_setPActivity);
		RemovingInstanceFromPort_B_setPActivity.setName("setPActivity");
		RemovingInstanceFromPort_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_B_setPActivity.addOwnedParameter(RemovingInstanceFromPort_B_setPActivity_v);
		RemovingInstanceFromPort_B_setPActivity.addNode(RemovingInstanceFromPort_B_setPActivity_this);
		RemovingInstanceFromPort_B_setPActivity.addNode(RemovingInstanceFromPort_B_setPActivity_Set_this_p);
		RemovingInstanceFromPort_B_setPActivity.addNode(RemovingInstanceFromPort_B_setPActivity_vParameterNode);
		RemovingInstanceFromPort_B_setPActivity.addEdge(RemovingInstanceFromPort_B_setPActivity_ObjectFlow1);
		RemovingInstanceFromPort_B_setPActivity.addEdge(RemovingInstanceFromPort_B_setPActivity_ObjectFlow13);
		// Activity RemovingInstanceFromPort::main
		addToElementRepository("main", RemovingInstanceFromPort_main);
		RemovingInstanceFromPort_main.setName("main");
		RemovingInstanceFromPort_main.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main.addNode(RemovingInstanceFromPort_main_Clear_a_q);
		RemovingInstanceFromPort_main.addNode(RemovingInstanceFromPort_main_A_);
		RemovingInstanceFromPort_main.addNode(RemovingInstanceFromPort_main_Call_assertA);
		RemovingInstanceFromPort_main.addNode(RemovingInstanceFromPort_main_Create_A);
		RemovingInstanceFromPort_main.addEdge(RemovingInstanceFromPort_main_ObjectFlow16);
		RemovingInstanceFromPort_main.addEdge(RemovingInstanceFromPort_main_ObjectFlow19);
		RemovingInstanceFromPort_main.addEdge(RemovingInstanceFromPort_main_ObjectFlow32);
		// Activity RemovingInstanceFromPort::assertA
		addToElementRepository("assertA", RemovingInstanceFromPort_assertA);
		RemovingInstanceFromPort_assertA.setName("assertA");
		RemovingInstanceFromPort_assertA.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_assertA.addOwnedBehavior(RemovingInstanceFromPort_assertA_assertionNotImplemented);
		RemovingInstanceFromPort_assertA.addOwnedParameter(RemovingInstanceFromPort_assertA_a);
		RemovingInstanceFromPort_assertA.addNode(RemovingInstanceFromPort_assertA_aParameterNode);
		RemovingInstanceFromPort_assertA.addNode(RemovingInstanceFromPort_assertA_Call_assertionNotImplemented);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode RemovingInstanceFromPort_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", RemovingInstanceFromPort_B_setPActivity_vParameterNode);
		RemovingInstanceFromPort_B_setPActivity_vParameterNode.setName("vParameterNode");
		RemovingInstanceFromPort_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_B_setPActivity_vParameterNode.setParameter(RemovingInstanceFromPort_B_setPActivity_v);
		// ActivityParameterNode RemovingInstanceFromPort_assertA::aParameterNode
		addToElementRepository("aParameterNode", RemovingInstanceFromPort_assertA_aParameterNode);
		RemovingInstanceFromPort_assertA_aParameterNode.setName("aParameterNode");
		RemovingInstanceFromPort_assertA_aParameterNode.setVisibility(VisibilityKind.public_);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction RemovingInstanceFromPort_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", RemovingInstanceFromPort_B_setPActivity_Set_this_p);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p.setName("Set this.p");
		RemovingInstanceFromPort_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p.setStructuralFeature(RemovingInstanceFromPort_B_p);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p.setObject(RemovingInstanceFromPort_B_setPActivity_Set_this_p_object);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p.setValue(RemovingInstanceFromPort_B_setPActivity_Set_this_p_value);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p.setResult(RemovingInstanceFromPort_B_setPActivity_Set_this_p_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association RemovingInstanceFromPort::R
		addToElementRepository("R", RemovingInstanceFromPort_R);
		RemovingInstanceFromPort_R.setName("R");
		RemovingInstanceFromPort_R.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_R.addOwnedEnd(RemovingInstanceFromPort_R_x);
		RemovingInstanceFromPort_R.addOwnedEnd(RemovingInstanceFromPort_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction RemovingInstanceFromPort_main::Call assertA
		addToElementRepository("Call assertA", RemovingInstanceFromPort_main_Call_assertA);
		RemovingInstanceFromPort_main_Call_assertA.setName("Call assertA");
		RemovingInstanceFromPort_main_Call_assertA.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_Call_assertA.setBehavior(RemovingInstanceFromPort_assertA);
		RemovingInstanceFromPort_main_Call_assertA.addArgument(RemovingInstanceFromPort_main_Call_assertA_a);
		// CallBehaviorAction RemovingInstanceFromPort_assertA::Call assertionNotImplemented
		addToElementRepository("Call assertionNotImplemented", RemovingInstanceFromPort_assertA_Call_assertionNotImplemented);
		RemovingInstanceFromPort_assertA_Call_assertionNotImplemented.setName("Call assertionNotImplemented");
		RemovingInstanceFromPort_assertA_Call_assertionNotImplemented.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_assertA_Call_assertionNotImplemented.setBehavior(RemovingInstanceFromPort_assertA_assertionNotImplemented);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction RemovingInstanceFromPort_main::A()
		addToElementRepository("A()", RemovingInstanceFromPort_main_A_);
		RemovingInstanceFromPort_main_A_.setName("A()");
		RemovingInstanceFromPort_main_A_.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_main_A_.addResult(RemovingInstanceFromPort_main_A__result);
		RemovingInstanceFromPort_main_A_.setOperation(RemovingInstanceFromPort_A_A_A);
		RemovingInstanceFromPort_main_A_.setTarget(RemovingInstanceFromPort_main_A__target);
	}

	private void initializeClass_Instances()
	{
		// Class RemovingInstanceFromPort::B
		addToElementRepository("B", RemovingInstanceFromPort_B);
		RemovingInstanceFromPort_B.setName("B");
		RemovingInstanceFromPort_B.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_B.addOwnedAttribute(RemovingInstanceFromPort_B_p);
		RemovingInstanceFromPort_B.addOwnedBehavior(RemovingInstanceFromPort_B_setPActivity);
		RemovingInstanceFromPort_B.addInterfaceRealization(RemovingInstanceFromPort_B_IRealization);
		
		RemovingInstanceFromPort_B.addOwnedOperation(RemovingInstanceFromPort_B_B_B);
		RemovingInstanceFromPort_B.addOwnedOperation(RemovingInstanceFromPort_B_setP_Integer);
		// Class RemovingInstanceFromPort::IImpl
		addToElementRepository("IImpl", RemovingInstanceFromPort_IImpl);
		RemovingInstanceFromPort_IImpl.setName("IImpl");
		RemovingInstanceFromPort_IImpl.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_IImpl.addInterfaceRealization(RemovingInstanceFromPort_IImpl_IRealization);
		
		RemovingInstanceFromPort_IImpl.addOwnedOperation(RemovingInstanceFromPort_IImpl_setP_Integer);
		// Class RemovingInstanceFromPort::A
		addToElementRepository("A", RemovingInstanceFromPort_A);
		RemovingInstanceFromPort_A.setName("A");
		RemovingInstanceFromPort_A.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_A.addOwnedAttribute(RemovingInstanceFromPort_A_q);
		RemovingInstanceFromPort_A.addOwnedAttribute(RemovingInstanceFromPort_A_b);
		
		RemovingInstanceFromPort_A.addOwnedConnector(RemovingInstanceFromPort_A_r);
		RemovingInstanceFromPort_A.addOwnedOperation(RemovingInstanceFromPort_A_A_A);
	}

	private void initializeClearStructuralFeatureAction_Instances()
	{
		// ClearStructuralFeatureAction RemovingInstanceFromPort_main::Clear a.q
		addToElementRepository("Clear a.q", RemovingInstanceFromPort_main_Clear_a_q);
		RemovingInstanceFromPort_main_Clear_a_q.setName("Clear a.q");
		RemovingInstanceFromPort_main_Clear_a_q.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_Clear_a_q.setStructuralFeature(RemovingInstanceFromPort_A_q);
		RemovingInstanceFromPort_main_Clear_a_q.setObject(RemovingInstanceFromPort_main_Clear_a_q_object);
		RemovingInstanceFromPort_main_Clear_a_q.setResult(RemovingInstanceFromPort_main_Clear_a_q_result);
	}

	private void initializeComment_Instances()
	{
		// Comment RemovingInstanceFromPort::Comment0
		addToElementRepository("Comment0", RemovingInstanceFromPort_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector RemovingInstanceFromPort_A::r
		addToElementRepository("r", RemovingInstanceFromPort_A_r);
		RemovingInstanceFromPort_A_r.setName("r");
		RemovingInstanceFromPort_A_r.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_A_r.addEnd(RemovingInstanceFromPort_A_r_ConnectorEnd35);
		RemovingInstanceFromPort_A_r.addEnd(RemovingInstanceFromPort_A_r_ConnectorEnd36);
		RemovingInstanceFromPort_A_r.setType(RemovingInstanceFromPort_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd RemovingInstanceFromPort_A_r::ConnectorEnd35
		addToElementRepository("ConnectorEnd35", RemovingInstanceFromPort_A_r_ConnectorEnd35);
		RemovingInstanceFromPort_A_r_ConnectorEnd35.setRole(RemovingInstanceFromPort_A_q);
		// ConnectorEnd RemovingInstanceFromPort_A_r::ConnectorEnd36
		addToElementRepository("ConnectorEnd36", RemovingInstanceFromPort_A_r_ConnectorEnd36);
		RemovingInstanceFromPort_A_r_ConnectorEnd36.setRole(RemovingInstanceFromPort_A_b);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction RemovingInstanceFromPort_main::Create A
		addToElementRepository("Create A", RemovingInstanceFromPort_main_Create_A);
		RemovingInstanceFromPort_main_Create_A.setName("Create A");
		RemovingInstanceFromPort_main_Create_A.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_Create_A.setClassifier(RemovingInstanceFromPort_A);
		RemovingInstanceFromPort_main_Create_A.setResult(RemovingInstanceFromPort_main_Create_A_result);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior RemovingInstanceFromPort_assertA::assertionNotImplemented
		addToElementRepository("assertionNotImplemented", RemovingInstanceFromPort_assertA_assertionNotImplemented);
		RemovingInstanceFromPort_assertA_assertionNotImplemented.setName("assertionNotImplemented");
		RemovingInstanceFromPort_assertA_assertionNotImplemented.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_assertA_assertionNotImplemented.addLanguage("Java");
		RemovingInstanceFromPort_assertA_assertionNotImplemented.addBody("System.out.println(\"Assertion currenlty not implemented! Model was validated by manual debugging.\");");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin RemovingInstanceFromPort_B_setPActivity_Set this.p::object
		addToElementRepository("object", RemovingInstanceFromPort_B_setPActivity_Set_this_p_object);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_object.setName("object");
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_object.setType(RemovingInstanceFromPort_B);
		// InputPin RemovingInstanceFromPort_main_A()::target
		addToElementRepository("target", RemovingInstanceFromPort_main_A__target);
		RemovingInstanceFromPort_main_A__target.setName("target");
		RemovingInstanceFromPort_main_A__target.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_A__target.setType(RemovingInstanceFromPort_A);
		// InputPin RemovingInstanceFromPort_main_Call assertA::a
		addToElementRepository("a", RemovingInstanceFromPort_main_Call_assertA_a);
		RemovingInstanceFromPort_main_Call_assertA_a.setName("a");
		RemovingInstanceFromPort_main_Call_assertA_a.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_Call_assertA_a.setType(RemovingInstanceFromPort_A);
		// InputPin RemovingInstanceFromPort_main_Clear a.q::object
		addToElementRepository("object", RemovingInstanceFromPort_main_Clear_a_q_object);
		RemovingInstanceFromPort_main_Clear_a_q_object.setName("object");
		RemovingInstanceFromPort_main_Clear_a_q_object.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_Clear_a_q_object.setType(RemovingInstanceFromPort_A);
		// InputPin RemovingInstanceFromPort_B_setPActivity_Set this.p::value
		addToElementRepository("value", RemovingInstanceFromPort_B_setPActivity_Set_this_p_value);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_value.setName("value");
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeInterface_Instances()
	{
		// Interface RemovingInstanceFromPort::I
		addToElementRepository("I", RemovingInstanceFromPort_I);
		RemovingInstanceFromPort_I.setName("I");
		RemovingInstanceFromPort_I.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_I.addOwnedOperation(RemovingInstanceFromPort_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization RemovingInstanceFromPort_IImpl::IRealization
		addToElementRepository("IRealization", RemovingInstanceFromPort_IImpl_IRealization);
		RemovingInstanceFromPort_IImpl_IRealization.setName("IRealization");
		RemovingInstanceFromPort_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_IImpl_IRealization.setContract(RemovingInstanceFromPort_I);
		// InterfaceRealization RemovingInstanceFromPort_B::IRealization
		addToElementRepository("IRealization", RemovingInstanceFromPort_B_IRealization);
		RemovingInstanceFromPort_B_IRealization.setName("IRealization");
		RemovingInstanceFromPort_B_IRealization.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_IRealization.setContract(RemovingInstanceFromPort_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean RemovingInstanceFromPort_B_setPActivity_ObjectFlow1::LiteralBoolean2
		addToElementRepository("LiteralBoolean2", RemovingInstanceFromPort_B_setPActivity_ObjectFlow1_LiteralBoolean2);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow1_LiteralBoolean2.setName("LiteralBoolean2");
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow1_LiteralBoolean2.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow1_LiteralBoolean2.setValue(true);
		// LiteralBoolean RemovingInstanceFromPort_main_ObjectFlow32::LiteralBoolean33
		addToElementRepository("LiteralBoolean33", RemovingInstanceFromPort_main_ObjectFlow32_LiteralBoolean33);
		RemovingInstanceFromPort_main_ObjectFlow32_LiteralBoolean33.setName("LiteralBoolean33");
		RemovingInstanceFromPort_main_ObjectFlow32_LiteralBoolean33.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_ObjectFlow32_LiteralBoolean33.setValue(true);
		// LiteralBoolean RemovingInstanceFromPort_B_setPActivity_ObjectFlow13::LiteralBoolean14
		addToElementRepository("LiteralBoolean14", RemovingInstanceFromPort_B_setPActivity_ObjectFlow13_LiteralBoolean14);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow13_LiteralBoolean14.setName("LiteralBoolean14");
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow13_LiteralBoolean14.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow13_LiteralBoolean14.setValue(true);
		// LiteralBoolean RemovingInstanceFromPort_main_ObjectFlow19::LiteralBoolean20
		addToElementRepository("LiteralBoolean20", RemovingInstanceFromPort_main_ObjectFlow19_LiteralBoolean20);
		RemovingInstanceFromPort_main_ObjectFlow19_LiteralBoolean20.setName("LiteralBoolean20");
		RemovingInstanceFromPort_main_ObjectFlow19_LiteralBoolean20.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_ObjectFlow19_LiteralBoolean20.setValue(true);
		// LiteralBoolean RemovingInstanceFromPort_main_ObjectFlow16::LiteralBoolean18
		addToElementRepository("LiteralBoolean18", RemovingInstanceFromPort_main_ObjectFlow16_LiteralBoolean18);
		RemovingInstanceFromPort_main_ObjectFlow16_LiteralBoolean18.setName("LiteralBoolean18");
		RemovingInstanceFromPort_main_ObjectFlow16_LiteralBoolean18.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_ObjectFlow16_LiteralBoolean18.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger RemovingInstanceFromPort_B_setPActivity_Set this.p_value::LiteralInteger10
		addToElementRepository("LiteralInteger10", RemovingInstanceFromPort_B_setPActivity_Set_this_p_value_LiteralInteger10);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_value_LiteralInteger10.setName("LiteralInteger10");
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_value_LiteralInteger10.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_value_LiteralInteger10.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_main_Call assertA_a::LiteralInteger27
		addToElementRepository("LiteralInteger27", RemovingInstanceFromPort_main_Call_assertA_a_LiteralInteger27);
		RemovingInstanceFromPort_main_Call_assertA_a_LiteralInteger27.setName("LiteralInteger27");
		RemovingInstanceFromPort_main_Call_assertA_a_LiteralInteger27.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_Call_assertA_a_LiteralInteger27.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_B_setPActivity_this_result::LiteralInteger5
		addToElementRepository("LiteralInteger5", RemovingInstanceFromPort_B_setPActivity_this_result_LiteralInteger5);
		RemovingInstanceFromPort_B_setPActivity_this_result_LiteralInteger5.setName("LiteralInteger5");
		RemovingInstanceFromPort_B_setPActivity_this_result_LiteralInteger5.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_this_result_LiteralInteger5.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_assertA_aParameterNode::LiteralInteger37
		addToElementRepository("LiteralInteger37", RemovingInstanceFromPort_assertA_aParameterNode_LiteralInteger37);
		RemovingInstanceFromPort_assertA_aParameterNode_LiteralInteger37.setName("LiteralInteger37");
		RemovingInstanceFromPort_assertA_aParameterNode_LiteralInteger37.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_assertA_aParameterNode_LiteralInteger37.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_B_setPActivity_vParameterNode::LiteralInteger12
		addToElementRepository("LiteralInteger12", RemovingInstanceFromPort_B_setPActivity_vParameterNode_LiteralInteger12);
		RemovingInstanceFromPort_B_setPActivity_vParameterNode_LiteralInteger12.setName("LiteralInteger12");
		RemovingInstanceFromPort_B_setPActivity_vParameterNode_LiteralInteger12.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_vParameterNode_LiteralInteger12.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_main_ObjectFlow32::LiteralInteger34
		addToElementRepository("LiteralInteger34", RemovingInstanceFromPort_main_ObjectFlow32_LiteralInteger34);
		RemovingInstanceFromPort_main_ObjectFlow32_LiteralInteger34.setName("LiteralInteger34");
		RemovingInstanceFromPort_main_ObjectFlow32_LiteralInteger34.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_ObjectFlow32_LiteralInteger34.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_main_A()_result::LiteralInteger25
		addToElementRepository("LiteralInteger25", RemovingInstanceFromPort_main_A__result_LiteralInteger25);
		RemovingInstanceFromPort_main_A__result_LiteralInteger25.setName("LiteralInteger25");
		RemovingInstanceFromPort_main_A__result_LiteralInteger25.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_A__result_LiteralInteger25.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_main_Call assertA_a::LiteralInteger29
		addToElementRepository("LiteralInteger29", RemovingInstanceFromPort_main_Call_assertA_a_LiteralInteger29);
		RemovingInstanceFromPort_main_Call_assertA_a_LiteralInteger29.setName("LiteralInteger29");
		RemovingInstanceFromPort_main_Call_assertA_a_LiteralInteger29.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_Call_assertA_a_LiteralInteger29.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_main_A()_result::LiteralInteger24
		addToElementRepository("LiteralInteger24", RemovingInstanceFromPort_main_A__result_LiteralInteger24);
		RemovingInstanceFromPort_main_A__result_LiteralInteger24.setName("LiteralInteger24");
		RemovingInstanceFromPort_main_A__result_LiteralInteger24.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_A__result_LiteralInteger24.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_main_ObjectFlow16::LiteralInteger17
		addToElementRepository("LiteralInteger17", RemovingInstanceFromPort_main_ObjectFlow16_LiteralInteger17);
		RemovingInstanceFromPort_main_ObjectFlow16_LiteralInteger17.setName("LiteralInteger17");
		RemovingInstanceFromPort_main_ObjectFlow16_LiteralInteger17.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_ObjectFlow16_LiteralInteger17.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_B_setPActivity_ObjectFlow13::LiteralInteger15
		addToElementRepository("LiteralInteger15", RemovingInstanceFromPort_B_setPActivity_ObjectFlow13_LiteralInteger15);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow13_LiteralInteger15.setName("LiteralInteger15");
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow13_LiteralInteger15.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow13_LiteralInteger15.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_main_Create A_result::LiteralInteger31
		addToElementRepository("LiteralInteger31", RemovingInstanceFromPort_main_Create_A_result_LiteralInteger31);
		RemovingInstanceFromPort_main_Create_A_result_LiteralInteger31.setName("LiteralInteger31");
		RemovingInstanceFromPort_main_Create_A_result_LiteralInteger31.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_Create_A_result_LiteralInteger31.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_B_setPActivity_Set this.p_result::LiteralInteger9
		addToElementRepository("LiteralInteger9", RemovingInstanceFromPort_B_setPActivity_Set_this_p_result_LiteralInteger9);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_result_LiteralInteger9.setName("LiteralInteger9");
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_result_LiteralInteger9.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_result_LiteralInteger9.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_B_setPActivity_Set this.p_object::LiteralInteger6
		addToElementRepository("LiteralInteger6", RemovingInstanceFromPort_B_setPActivity_Set_this_p_object_LiteralInteger6);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_object_LiteralInteger6.setName("LiteralInteger6");
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_object_LiteralInteger6.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_object_LiteralInteger6.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_main_ObjectFlow19::LiteralInteger21
		addToElementRepository("LiteralInteger21", RemovingInstanceFromPort_main_ObjectFlow19_LiteralInteger21);
		RemovingInstanceFromPort_main_ObjectFlow19_LiteralInteger21.setName("LiteralInteger21");
		RemovingInstanceFromPort_main_ObjectFlow19_LiteralInteger21.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_ObjectFlow19_LiteralInteger21.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_B_setPActivity_ObjectFlow1::LiteralInteger3
		addToElementRepository("LiteralInteger3", RemovingInstanceFromPort_B_setPActivity_ObjectFlow1_LiteralInteger3);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow1_LiteralInteger3.setName("LiteralInteger3");
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow1_LiteralInteger3.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow1_LiteralInteger3.setValue(1);
		// LiteralInteger RemovingInstanceFromPort_main_A()_target::LiteralInteger23
		addToElementRepository("LiteralInteger23", RemovingInstanceFromPort_main_A__target_LiteralInteger23);
		RemovingInstanceFromPort_main_A__target_LiteralInteger23.setName("LiteralInteger23");
		RemovingInstanceFromPort_main_A__target_LiteralInteger23.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_A__target_LiteralInteger23.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural RemovingInstanceFromPort_B_setPActivity_this_result::LiteralUnlimitedNatural4
		addToElementRepository("LiteralUnlimitedNatural4", RemovingInstanceFromPort_B_setPActivity_this_result_LiteralUnlimitedNatural4);
		RemovingInstanceFromPort_B_setPActivity_this_result_LiteralUnlimitedNatural4.setName("LiteralUnlimitedNatural4");
		RemovingInstanceFromPort_B_setPActivity_this_result_LiteralUnlimitedNatural4.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_this_result_LiteralUnlimitedNatural4.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPort_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural8
		addToElementRepository("LiteralUnlimitedNatural8", RemovingInstanceFromPort_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural8);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural8.setName("LiteralUnlimitedNatural8");
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural8.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural8.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPort_main_Create A_result::LiteralUnlimitedNatural30
		addToElementRepository("LiteralUnlimitedNatural30", RemovingInstanceFromPort_main_Create_A_result_LiteralUnlimitedNatural30);
		RemovingInstanceFromPort_main_Create_A_result_LiteralUnlimitedNatural30.setName("LiteralUnlimitedNatural30");
		RemovingInstanceFromPort_main_Create_A_result_LiteralUnlimitedNatural30.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_Create_A_result_LiteralUnlimitedNatural30.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPort_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural11
		addToElementRepository("LiteralUnlimitedNatural11", RemovingInstanceFromPort_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11.setName("LiteralUnlimitedNatural11");
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural11.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPort_main_A()_target::LiteralUnlimitedNatural22
		addToElementRepository("LiteralUnlimitedNatural22", RemovingInstanceFromPort_main_A__target_LiteralUnlimitedNatural22);
		RemovingInstanceFromPort_main_A__target_LiteralUnlimitedNatural22.setName("LiteralUnlimitedNatural22");
		RemovingInstanceFromPort_main_A__target_LiteralUnlimitedNatural22.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_A__target_LiteralUnlimitedNatural22.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPort_main_Call assertA_a::LiteralUnlimitedNatural28
		addToElementRepository("LiteralUnlimitedNatural28", RemovingInstanceFromPort_main_Call_assertA_a_LiteralUnlimitedNatural28);
		RemovingInstanceFromPort_main_Call_assertA_a_LiteralUnlimitedNatural28.setName("LiteralUnlimitedNatural28");
		RemovingInstanceFromPort_main_Call_assertA_a_LiteralUnlimitedNatural28.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_Call_assertA_a_LiteralUnlimitedNatural28.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPort_main_A()_result::LiteralUnlimitedNatural26
		addToElementRepository("LiteralUnlimitedNatural26", RemovingInstanceFromPort_main_A__result_LiteralUnlimitedNatural26);
		RemovingInstanceFromPort_main_A__result_LiteralUnlimitedNatural26.setName("LiteralUnlimitedNatural26");
		RemovingInstanceFromPort_main_A__result_LiteralUnlimitedNatural26.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_A__result_LiteralUnlimitedNatural26.setValue(1);
		// LiteralUnlimitedNatural RemovingInstanceFromPort_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural7
		addToElementRepository("LiteralUnlimitedNatural7", RemovingInstanceFromPort_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural7);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural7.setName("LiteralUnlimitedNatural7");
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural7.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural7.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow RemovingInstanceFromPort_B_setPActivity::ObjectFlow1
		addToElementRepository("ObjectFlow1", RemovingInstanceFromPort_B_setPActivity_ObjectFlow1);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow1.setName("ObjectFlow1");
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow1.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow1.setSource(RemovingInstanceFromPort_B_setPActivity_vParameterNode);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow1.setTarget(RemovingInstanceFromPort_B_setPActivity_Set_this_p_value);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow1.setGuard(RemovingInstanceFromPort_B_setPActivity_ObjectFlow1_LiteralBoolean2);
		// ObjectFlow RemovingInstanceFromPort_main::ObjectFlow16
		addToElementRepository("ObjectFlow16", RemovingInstanceFromPort_main_ObjectFlow16);
		RemovingInstanceFromPort_main_ObjectFlow16.setName("ObjectFlow16");
		RemovingInstanceFromPort_main_ObjectFlow16.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_main_ObjectFlow16.setSource(RemovingInstanceFromPort_main_A__result);
		RemovingInstanceFromPort_main_ObjectFlow16.setTarget(RemovingInstanceFromPort_main_Clear_a_q_object);
		RemovingInstanceFromPort_main_ObjectFlow16.setGuard(RemovingInstanceFromPort_main_ObjectFlow16_LiteralBoolean18);
		// ObjectFlow RemovingInstanceFromPort_B_setPActivity::ObjectFlow13
		addToElementRepository("ObjectFlow13", RemovingInstanceFromPort_B_setPActivity_ObjectFlow13);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow13.setName("ObjectFlow13");
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow13.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow13.setSource(RemovingInstanceFromPort_B_setPActivity_this_result);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow13.setTarget(RemovingInstanceFromPort_B_setPActivity_Set_this_p_object);
		RemovingInstanceFromPort_B_setPActivity_ObjectFlow13.setGuard(RemovingInstanceFromPort_B_setPActivity_ObjectFlow13_LiteralBoolean14);
		// ObjectFlow RemovingInstanceFromPort_main::ObjectFlow19
		addToElementRepository("ObjectFlow19", RemovingInstanceFromPort_main_ObjectFlow19);
		RemovingInstanceFromPort_main_ObjectFlow19.setName("ObjectFlow19");
		RemovingInstanceFromPort_main_ObjectFlow19.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_main_ObjectFlow19.setSource(RemovingInstanceFromPort_main_Clear_a_q_result);
		RemovingInstanceFromPort_main_ObjectFlow19.setTarget(RemovingInstanceFromPort_main_Call_assertA_a);
		RemovingInstanceFromPort_main_ObjectFlow19.setGuard(RemovingInstanceFromPort_main_ObjectFlow19_LiteralBoolean20);
		// ObjectFlow RemovingInstanceFromPort_main::ObjectFlow32
		addToElementRepository("ObjectFlow32", RemovingInstanceFromPort_main_ObjectFlow32);
		RemovingInstanceFromPort_main_ObjectFlow32.setName("ObjectFlow32");
		RemovingInstanceFromPort_main_ObjectFlow32.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_main_ObjectFlow32.setSource(RemovingInstanceFromPort_main_Create_A_result);
		RemovingInstanceFromPort_main_ObjectFlow32.setTarget(RemovingInstanceFromPort_main_A__target);
		RemovingInstanceFromPort_main_ObjectFlow32.setGuard(RemovingInstanceFromPort_main_ObjectFlow32_LiteralBoolean33);
	}

	private void initializeOperation_Instances()
	{
		// Operation RemovingInstanceFromPort_I::setP_Integer
		addToElementRepository("setP_Integer", RemovingInstanceFromPort_I_setP_Integer);
		RemovingInstanceFromPort_I_setP_Integer.setName("setP");
		RemovingInstanceFromPort_I_setP_Integer.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_I_setP_Integer.addOwnedParameter(RemovingInstanceFromPort_I_setP_Integer_v);
		// Operation RemovingInstanceFromPort_A::A_A
		addToElementRepository("A_A", RemovingInstanceFromPort_A_A_A);
		RemovingInstanceFromPort_A_A_A.setName("A");
		RemovingInstanceFromPort_A_A_A.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_A_A_A.addOwnedParameter(RemovingInstanceFromPort_A_A_A_result);
		RemovingInstanceFromPort_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation RemovingInstanceFromPort_B::B_B
		addToElementRepository("B_B", RemovingInstanceFromPort_B_B_B);
		RemovingInstanceFromPort_B_B_B.setName("B");
		RemovingInstanceFromPort_B_B_B.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_B_B.addOwnedParameter(RemovingInstanceFromPort_B_B_B_result);
		RemovingInstanceFromPort_B_B_B.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation RemovingInstanceFromPort_IImpl::setP_Integer
		addToElementRepository("setP_Integer", RemovingInstanceFromPort_IImpl_setP_Integer);
		RemovingInstanceFromPort_IImpl_setP_Integer.setName("setP");
		RemovingInstanceFromPort_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_IImpl_setP_Integer.addOwnedParameter(RemovingInstanceFromPort_IImpl_setP_Integer_v);
		// Operation RemovingInstanceFromPort_B::setP_Integer
		addToElementRepository("setP_Integer", RemovingInstanceFromPort_B_setP_Integer);
		RemovingInstanceFromPort_B_setP_Integer.setName("setP");
		RemovingInstanceFromPort_B_setP_Integer.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setP_Integer.addOwnedParameter(RemovingInstanceFromPort_B_setP_Integer_v);
		RemovingInstanceFromPort_B_setP_Integer.addMethod(RemovingInstanceFromPort_B_setPActivity);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin RemovingInstanceFromPort_main_A()::result
		addToElementRepository("result", RemovingInstanceFromPort_main_A__result);
		RemovingInstanceFromPort_main_A__result.setName("result");
		RemovingInstanceFromPort_main_A__result.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_A__result.setType(RemovingInstanceFromPort_A);
		// OutputPin RemovingInstanceFromPort_B_setPActivity_this::result
		addToElementRepository("result", RemovingInstanceFromPort_B_setPActivity_this_result);
		RemovingInstanceFromPort_B_setPActivity_this_result.setName("result");
		RemovingInstanceFromPort_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_this_result.setType(RemovingInstanceFromPort_B);
		// OutputPin RemovingInstanceFromPort_main_Clear a.q::result
		addToElementRepository("result", RemovingInstanceFromPort_main_Clear_a_q_result);
		RemovingInstanceFromPort_main_Clear_a_q_result.setName("result");
		RemovingInstanceFromPort_main_Clear_a_q_result.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_Clear_a_q_result.setType(RemovingInstanceFromPort_A);
		// OutputPin RemovingInstanceFromPort_B_setPActivity_Set this.p::result
		addToElementRepository("result", RemovingInstanceFromPort_B_setPActivity_Set_this_p_result);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_result.setName("result");
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_Set_this_p_result.setType(RemovingInstanceFromPort_B);
		// OutputPin RemovingInstanceFromPort_main_Create A::result
		addToElementRepository("result", RemovingInstanceFromPort_main_Create_A_result);
		RemovingInstanceFromPort_main_Create_A_result.setName("result");
		RemovingInstanceFromPort_main_Create_A_result.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_main_Create_A_result.setType(RemovingInstanceFromPort_A);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport RemovingInstanceFromPort::PackageImport38
		addToElementRepository("PackageImport38", RemovingInstanceFromPort_PackageImport38);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter RemovingInstanceFromPort_B_setP_Integer::v
		addToElementRepository("v", RemovingInstanceFromPort_B_setP_Integer_v);
		RemovingInstanceFromPort_B_setP_Integer_v.setName("v");
		RemovingInstanceFromPort_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter RemovingInstanceFromPort_assertA::a
		addToElementRepository("a", RemovingInstanceFromPort_assertA_a);
		RemovingInstanceFromPort_assertA_a.setName("a");
		RemovingInstanceFromPort_assertA_a.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_assertA_a.setType(RemovingInstanceFromPort_A);
		// Parameter RemovingInstanceFromPort_B_B_B::result
		addToElementRepository("result", RemovingInstanceFromPort_B_B_B_result);
		RemovingInstanceFromPort_B_B_B_result.setName("result");
		RemovingInstanceFromPort_B_B_B_result.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_B_B_B_result.setType(RemovingInstanceFromPort_B);
		RemovingInstanceFromPort_B_B_B_result.setDirection(ParameterDirectionKind.return_);
		// Parameter RemovingInstanceFromPort_I_setP_Integer::v
		addToElementRepository("v", RemovingInstanceFromPort_I_setP_Integer_v);
		RemovingInstanceFromPort_I_setP_Integer_v.setName("v");
		RemovingInstanceFromPort_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter RemovingInstanceFromPort_IImpl_setP_Integer::v
		addToElementRepository("v", RemovingInstanceFromPort_IImpl_setP_Integer_v);
		RemovingInstanceFromPort_IImpl_setP_Integer_v.setName("v");
		RemovingInstanceFromPort_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter RemovingInstanceFromPort_A_A_A::result
		addToElementRepository("result", RemovingInstanceFromPort_A_A_A_result);
		RemovingInstanceFromPort_A_A_A_result.setName("result");
		RemovingInstanceFromPort_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_A_A_A_result.setType(RemovingInstanceFromPort_A);
		RemovingInstanceFromPort_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter RemovingInstanceFromPort_B_setPActivity::v
		addToElementRepository("v", RemovingInstanceFromPort_B_setPActivity_v);
		RemovingInstanceFromPort_B_setPActivity_v.setName("v");
		RemovingInstanceFromPort_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializePort_Instances()
	{
		// Port RemovingInstanceFromPort_A::q
		addToElementRepository("q", RemovingInstanceFromPort_A_q);
		RemovingInstanceFromPort_A_q.setName("q");
		RemovingInstanceFromPort_A_q.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_A_q.setType(RemovingInstanceFromPort_IImpl);
		RemovingInstanceFromPort_A_q.setAggregation(AggregationKind.composite);
		RemovingInstanceFromPort_A_q.isService = true;
		RemovingInstanceFromPort_A_q.addProvided(RemovingInstanceFromPort_I);
	}

	private void initializeProperty_Instances()
	{
		// Property RemovingInstanceFromPort_A::b
		addToElementRepository("b", RemovingInstanceFromPort_A_b);
		RemovingInstanceFromPort_A_b.setName("b");
		RemovingInstanceFromPort_A_b.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_A_b.setType(RemovingInstanceFromPort_B);
		RemovingInstanceFromPort_A_b.setAggregation(AggregationKind.composite);
		// Property RemovingInstanceFromPort_R::x
		addToElementRepository("x", RemovingInstanceFromPort_R_x);
		RemovingInstanceFromPort_R_x.setName("x");
		RemovingInstanceFromPort_R_x.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_R_x.setType(RemovingInstanceFromPort_B);
		// Property RemovingInstanceFromPort_R::y
		addToElementRepository("y", RemovingInstanceFromPort_R_y);
		RemovingInstanceFromPort_R_y.setName("y");
		RemovingInstanceFromPort_R_y.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_R_y.setType(RemovingInstanceFromPort_IImpl);
		// Property RemovingInstanceFromPort_B::p
		addToElementRepository("p", RemovingInstanceFromPort_B_p);
		RemovingInstanceFromPort_B_p.setName("p");
		RemovingInstanceFromPort_B_p.setVisibility(VisibilityKind.public_);
		
		RemovingInstanceFromPort_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction RemovingInstanceFromPort_B_setPActivity::this
		addToElementRepository("this", RemovingInstanceFromPort_B_setPActivity_this);
		RemovingInstanceFromPort_B_setPActivity_this.setName("this");
		RemovingInstanceFromPort_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		RemovingInstanceFromPort_B_setPActivity_this.setResult(RemovingInstanceFromPort_B_setPActivity_this_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // RemovingInstanceFromPortModel
