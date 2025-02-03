/*
 * OperationCommonModel.java
 * 
 * Auto-generated file
 */
package OperationCommon;

import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.InterfaceRealization;
import uml.actions.OutputPin;
import uml.activities.Activity;
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
import uml.commonbehavior.FunctionBehavior;
import uml.structuredclassifiers.Association;
import uml.classification.Property;
import utils.primitivetypes.PrimitiveTypesModel;
import uml.classification.ParameterDirectionKind;
import uml.simpleclassifiers.PrimitiveType;
import uml.actions.AddStructuralFeatureValueAction;
import uml.activities.ObjectFlow;
import utils.library.FoundationalModelLibraryModel;
import utils.environment.InMemoryModel;
import uml.values.LiteralInteger;
import uml.packages.Package;


/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class OperationCommonModel extends InMemoryModel
{
	private static OperationCommonModel instance;

	/*
	 * Model OperationCommon
	 */
	public Package OperationCommon = new Package();
		public Comment OperationCommon_Comment0 = new Comment();
		public Association OperationCommon_S = new Association();
			public Property OperationCommon_S_x = new Property();
			public Property OperationCommon_S_y = new Property();
		public Interface OperationCommon_I = new Interface();
			public Operation OperationCommon_I_setP_Integer = new Operation();
				public Parameter OperationCommon_I_setP_Integer_v = new Parameter();
		public Class_ OperationCommon_B = new Class_();
			public InterfaceRealization OperationCommon_B_IRealization = new InterfaceRealization();
			public Activity OperationCommon_B_setPActivity = new Activity();
				public AddStructuralFeatureValueAction OperationCommon_B_setPActivity_Set_this_p = new AddStructuralFeatureValueAction();
					public InputPin OperationCommon_B_setPActivity_Set_this_p_value = new InputPin();
						public LiteralInteger OperationCommon_B_setPActivity_Set_this_p_value_LiteralInteger1 = new LiteralInteger();
						public LiteralUnlimitedNatural OperationCommon_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural2 = new LiteralUnlimitedNatural();
					public InputPin OperationCommon_B_setPActivity_Set_this_p_object = new InputPin();
						public LiteralUnlimitedNatural OperationCommon_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural3 = new LiteralUnlimitedNatural();
						public LiteralInteger OperationCommon_B_setPActivity_Set_this_p_object_LiteralInteger4 = new LiteralInteger();
					public OutputPin OperationCommon_B_setPActivity_Set_this_p_result = new OutputPin();
						public LiteralUnlimitedNatural OperationCommon_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural5 = new LiteralUnlimitedNatural();
						public LiteralInteger OperationCommon_B_setPActivity_Set_this_p_result_LiteralInteger6 = new LiteralInteger();
				public ObjectFlow OperationCommon_B_setPActivity_ObjectFlow7 = new ObjectFlow();
					public LiteralInteger OperationCommon_B_setPActivity_ObjectFlow7_LiteralInteger8 = new LiteralInteger();
					public LiteralBoolean OperationCommon_B_setPActivity_ObjectFlow7_LiteralBoolean9 = new LiteralBoolean();
				public ObjectFlow OperationCommon_B_setPActivity_ObjectFlow10 = new ObjectFlow();
					public LiteralBoolean OperationCommon_B_setPActivity_ObjectFlow10_LiteralBoolean11 = new LiteralBoolean();
					public LiteralInteger OperationCommon_B_setPActivity_ObjectFlow10_LiteralInteger12 = new LiteralInteger();
				public ActivityParameterNode OperationCommon_B_setPActivity_vParameterNode = new ActivityParameterNode();
					public LiteralInteger OperationCommon_B_setPActivity_vParameterNode_LiteralInteger13 = new LiteralInteger();
				public Parameter OperationCommon_B_setPActivity_v = new Parameter();
				public ReadSelfAction OperationCommon_B_setPActivity_this = new ReadSelfAction();
					public OutputPin OperationCommon_B_setPActivity_this_result = new OutputPin();
						public LiteralUnlimitedNatural OperationCommon_B_setPActivity_this_result_LiteralUnlimitedNatural14 = new LiteralUnlimitedNatural();
						public LiteralInteger OperationCommon_B_setPActivity_this_result_LiteralInteger15 = new LiteralInteger();
			public Operation OperationCommon_B_setP_Integer = new Operation();
				public Parameter OperationCommon_B_setP_Integer_v = new Parameter();
			public Property OperationCommon_B_p = new Property();
		public PackageImport OperationCommon_PackageImport16 = new PackageImport();
		public Class_ OperationCommon_IImpl = new Class_();
			public Operation OperationCommon_IImpl_setP_Integer = new Operation();
				public Parameter OperationCommon_IImpl_setP_Integer_v = new Parameter();
			public InterfaceRealization OperationCommon_IImpl_IRealization = new InterfaceRealization();
		public Association OperationCommon_R = new Association();
			public Property OperationCommon_R_x = new Property();
			public Property OperationCommon_R_y = new Property();

	public static OperationCommonModel instance()
	{
		if (instance == null)
        {
            instance = new OperationCommonModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public OperationCommonModel()
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
		this.initializeClass_Instances();
		this.initializeComment_Instances();
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
		this.initializeProperty_Instances();
		this.initializeReadSelfAction_Instances();
	}

	private void initializeActivity_Instances()
	{
		// Activity OperationCommon_B::setPActivity
		addToElementRepository("setPActivity", OperationCommon_B_setPActivity);
		OperationCommon_B_setPActivity.setName("setPActivity");
		OperationCommon_B_setPActivity.setVisibility(VisibilityKind.public_);
		
		OperationCommon_B_setPActivity.addOwnedParameter(OperationCommon_B_setPActivity_v);
		OperationCommon_B_setPActivity.addNode(OperationCommon_B_setPActivity_Set_this_p);
		OperationCommon_B_setPActivity.addNode(OperationCommon_B_setPActivity_vParameterNode);
		OperationCommon_B_setPActivity.addNode(OperationCommon_B_setPActivity_this);
		OperationCommon_B_setPActivity.addEdge(OperationCommon_B_setPActivity_ObjectFlow7);
		OperationCommon_B_setPActivity.addEdge(OperationCommon_B_setPActivity_ObjectFlow10);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode OperationCommon_B_setPActivity::vParameterNode
		addToElementRepository("vParameterNode", OperationCommon_B_setPActivity_vParameterNode);
		OperationCommon_B_setPActivity_vParameterNode.setName("vParameterNode");
		OperationCommon_B_setPActivity_vParameterNode.setVisibility(VisibilityKind.public_);
		
		OperationCommon_B_setPActivity_vParameterNode.setParameter(OperationCommon_B_setPActivity_v);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction OperationCommon_B_setPActivity::Set this.p
		addToElementRepository("Set this.p", OperationCommon_B_setPActivity_Set_this_p);
		OperationCommon_B_setPActivity_Set_this_p.setName("Set this.p");
		OperationCommon_B_setPActivity_Set_this_p.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_Set_this_p.setStructuralFeature(OperationCommon_B_p);
		OperationCommon_B_setPActivity_Set_this_p.setObject(OperationCommon_B_setPActivity_Set_this_p_object);
		OperationCommon_B_setPActivity_Set_this_p.setValue(OperationCommon_B_setPActivity_Set_this_p_value);
		OperationCommon_B_setPActivity_Set_this_p.setResult(OperationCommon_B_setPActivity_Set_this_p_result);
		OperationCommon_B_setPActivity_Set_this_p.setIsReplaceAll(true);
	}

	private void initializeAssociation_Instances()
	{
		// Association OperationCommon::S
		addToElementRepository("S", OperationCommon_S);
		OperationCommon_S.setName("S");
		OperationCommon_S.setVisibility(VisibilityKind.public_);
		OperationCommon_S.addOwnedEnd(OperationCommon_S_x);
		OperationCommon_S.addOwnedEnd(OperationCommon_S_y);
		// Association OperationCommon::R
		addToElementRepository("R", OperationCommon_R);
		OperationCommon_R.setName("R");
		OperationCommon_R.setVisibility(VisibilityKind.public_);
		OperationCommon_R.addOwnedEnd(OperationCommon_R_x);
		OperationCommon_R.addOwnedEnd(OperationCommon_R_y);
	}

	private void initializeClass_Instances()
	{
		// Class OperationCommon::B
		addToElementRepository("B", OperationCommon_B);
		OperationCommon_B.setName("B");
		OperationCommon_B.setVisibility(VisibilityKind.public_);
		
		OperationCommon_B.addOwnedAttribute(OperationCommon_B_p);
		OperationCommon_B.addOwnedBehavior(OperationCommon_B_setPActivity);
		OperationCommon_B.addInterfaceRealization(OperationCommon_B_IRealization);
		
		OperationCommon_B.addOwnedOperation(OperationCommon_B_setP_Integer);
		// Class OperationCommon::IImpl
		addToElementRepository("IImpl", OperationCommon_IImpl);
		OperationCommon_IImpl.setName("IImpl");
		OperationCommon_IImpl.setVisibility(VisibilityKind.public_);
		OperationCommon_IImpl.addInterfaceRealization(OperationCommon_IImpl_IRealization);
		
		OperationCommon_IImpl.addOwnedOperation(OperationCommon_IImpl_setP_Integer);
	}

	private void initializeComment_Instances()
	{
		// Comment OperationCommon::Comment0
		addToElementRepository("Comment0", OperationCommon_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeInputPin_Instances()
	{
		// InputPin OperationCommon_B_setPActivity_Set this.p::value
		addToElementRepository("value", OperationCommon_B_setPActivity_Set_this_p_value);
		OperationCommon_B_setPActivity_Set_this_p_value.setName("value");
		OperationCommon_B_setPActivity_Set_this_p_value.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_Set_this_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin OperationCommon_B_setPActivity_Set this.p::object
		addToElementRepository("object", OperationCommon_B_setPActivity_Set_this_p_object);
		OperationCommon_B_setPActivity_Set_this_p_object.setName("object");
		OperationCommon_B_setPActivity_Set_this_p_object.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_Set_this_p_object.setType(OperationCommon_B);
	}

	private void initializeInterface_Instances()
	{
		// Interface OperationCommon::I
		addToElementRepository("I", OperationCommon_I);
		OperationCommon_I.setName("I");
		OperationCommon_I.setVisibility(VisibilityKind.public_);
		OperationCommon_I.addOwnedOperation(OperationCommon_I_setP_Integer);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization OperationCommon_B::IRealization
		addToElementRepository("IRealization", OperationCommon_B_IRealization);
		OperationCommon_B_IRealization.setName("IRealization");
		OperationCommon_B_IRealization.setVisibility(VisibilityKind.public_);
		OperationCommon_B_IRealization.setContract(OperationCommon_I);
		// InterfaceRealization OperationCommon_IImpl::IRealization
		addToElementRepository("IRealization", OperationCommon_IImpl_IRealization);
		OperationCommon_IImpl_IRealization.setName("IRealization");
		OperationCommon_IImpl_IRealization.setVisibility(VisibilityKind.public_);
		OperationCommon_IImpl_IRealization.setContract(OperationCommon_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean OperationCommon_B_setPActivity_ObjectFlow10::LiteralBoolean11
		addToElementRepository("LiteralBoolean11", OperationCommon_B_setPActivity_ObjectFlow10_LiteralBoolean11);
		OperationCommon_B_setPActivity_ObjectFlow10_LiteralBoolean11.setName("LiteralBoolean11");
		OperationCommon_B_setPActivity_ObjectFlow10_LiteralBoolean11.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_ObjectFlow10_LiteralBoolean11.setValue(true);
		// LiteralBoolean OperationCommon_B_setPActivity_ObjectFlow7::LiteralBoolean9
		addToElementRepository("LiteralBoolean9", OperationCommon_B_setPActivity_ObjectFlow7_LiteralBoolean9);
		OperationCommon_B_setPActivity_ObjectFlow7_LiteralBoolean9.setName("LiteralBoolean9");
		OperationCommon_B_setPActivity_ObjectFlow7_LiteralBoolean9.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_ObjectFlow7_LiteralBoolean9.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger OperationCommon_B_setPActivity_ObjectFlow7::LiteralInteger8
		addToElementRepository("LiteralInteger8", OperationCommon_B_setPActivity_ObjectFlow7_LiteralInteger8);
		OperationCommon_B_setPActivity_ObjectFlow7_LiteralInteger8.setName("LiteralInteger8");
		OperationCommon_B_setPActivity_ObjectFlow7_LiteralInteger8.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_ObjectFlow7_LiteralInteger8.setValue(1);
		// LiteralInteger OperationCommon_B_setPActivity_this_result::LiteralInteger15
		addToElementRepository("LiteralInteger15", OperationCommon_B_setPActivity_this_result_LiteralInteger15);
		OperationCommon_B_setPActivity_this_result_LiteralInteger15.setName("LiteralInteger15");
		OperationCommon_B_setPActivity_this_result_LiteralInteger15.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_this_result_LiteralInteger15.setValue(1);
		// LiteralInteger OperationCommon_B_setPActivity_Set this.p_object::LiteralInteger4
		addToElementRepository("LiteralInteger4", OperationCommon_B_setPActivity_Set_this_p_object_LiteralInteger4);
		OperationCommon_B_setPActivity_Set_this_p_object_LiteralInteger4.setName("LiteralInteger4");
		OperationCommon_B_setPActivity_Set_this_p_object_LiteralInteger4.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_Set_this_p_object_LiteralInteger4.setValue(1);
		// LiteralInteger OperationCommon_B_setPActivity_Set this.p_value::LiteralInteger1
		addToElementRepository("LiteralInteger1", OperationCommon_B_setPActivity_Set_this_p_value_LiteralInteger1);
		OperationCommon_B_setPActivity_Set_this_p_value_LiteralInteger1.setName("LiteralInteger1");
		OperationCommon_B_setPActivity_Set_this_p_value_LiteralInteger1.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_Set_this_p_value_LiteralInteger1.setValue(1);
		// LiteralInteger OperationCommon_B_setPActivity_vParameterNode::LiteralInteger13
		addToElementRepository("LiteralInteger13", OperationCommon_B_setPActivity_vParameterNode_LiteralInteger13);
		OperationCommon_B_setPActivity_vParameterNode_LiteralInteger13.setName("LiteralInteger13");
		OperationCommon_B_setPActivity_vParameterNode_LiteralInteger13.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_vParameterNode_LiteralInteger13.setValue(1);
		// LiteralInteger OperationCommon_B_setPActivity_Set this.p_result::LiteralInteger6
		addToElementRepository("LiteralInteger6", OperationCommon_B_setPActivity_Set_this_p_result_LiteralInteger6);
		OperationCommon_B_setPActivity_Set_this_p_result_LiteralInteger6.setName("LiteralInteger6");
		OperationCommon_B_setPActivity_Set_this_p_result_LiteralInteger6.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_Set_this_p_result_LiteralInteger6.setValue(1);
		// LiteralInteger OperationCommon_B_setPActivity_ObjectFlow10::LiteralInteger12
		addToElementRepository("LiteralInteger12", OperationCommon_B_setPActivity_ObjectFlow10_LiteralInteger12);
		OperationCommon_B_setPActivity_ObjectFlow10_LiteralInteger12.setName("LiteralInteger12");
		OperationCommon_B_setPActivity_ObjectFlow10_LiteralInteger12.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_ObjectFlow10_LiteralInteger12.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural OperationCommon_B_setPActivity_Set this.p_result::LiteralUnlimitedNatural5
		addToElementRepository("LiteralUnlimitedNatural5", OperationCommon_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural5);
		OperationCommon_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural5.setName("LiteralUnlimitedNatural5");
		OperationCommon_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural5.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_Set_this_p_result_LiteralUnlimitedNatural5.setValue(1);
		// LiteralUnlimitedNatural OperationCommon_B_setPActivity_Set this.p_object::LiteralUnlimitedNatural3
		addToElementRepository("LiteralUnlimitedNatural3", OperationCommon_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural3);
		OperationCommon_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural3.setName("LiteralUnlimitedNatural3");
		OperationCommon_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural3.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_Set_this_p_object_LiteralUnlimitedNatural3.setValue(1);
		// LiteralUnlimitedNatural OperationCommon_B_setPActivity_this_result::LiteralUnlimitedNatural14
		addToElementRepository("LiteralUnlimitedNatural14", OperationCommon_B_setPActivity_this_result_LiteralUnlimitedNatural14);
		OperationCommon_B_setPActivity_this_result_LiteralUnlimitedNatural14.setName("LiteralUnlimitedNatural14");
		OperationCommon_B_setPActivity_this_result_LiteralUnlimitedNatural14.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_this_result_LiteralUnlimitedNatural14.setValue(1);
		// LiteralUnlimitedNatural OperationCommon_B_setPActivity_Set this.p_value::LiteralUnlimitedNatural2
		addToElementRepository("LiteralUnlimitedNatural2", OperationCommon_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural2);
		OperationCommon_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural2.setName("LiteralUnlimitedNatural2");
		OperationCommon_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural2.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_Set_this_p_value_LiteralUnlimitedNatural2.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow OperationCommon_B_setPActivity::ObjectFlow7
		addToElementRepository("ObjectFlow7", OperationCommon_B_setPActivity_ObjectFlow7);
		OperationCommon_B_setPActivity_ObjectFlow7.setName("ObjectFlow7");
		OperationCommon_B_setPActivity_ObjectFlow7.setVisibility(VisibilityKind.public_);
		
		OperationCommon_B_setPActivity_ObjectFlow7.setSource(OperationCommon_B_setPActivity_this_result);
		OperationCommon_B_setPActivity_ObjectFlow7.setTarget(OperationCommon_B_setPActivity_Set_this_p_object);
		OperationCommon_B_setPActivity_ObjectFlow7.setGuard(OperationCommon_B_setPActivity_ObjectFlow7_LiteralBoolean9);
		// ObjectFlow OperationCommon_B_setPActivity::ObjectFlow10
		addToElementRepository("ObjectFlow10", OperationCommon_B_setPActivity_ObjectFlow10);
		OperationCommon_B_setPActivity_ObjectFlow10.setName("ObjectFlow10");
		OperationCommon_B_setPActivity_ObjectFlow10.setVisibility(VisibilityKind.public_);
		
		OperationCommon_B_setPActivity_ObjectFlow10.setSource(OperationCommon_B_setPActivity_vParameterNode);
		OperationCommon_B_setPActivity_ObjectFlow10.setTarget(OperationCommon_B_setPActivity_Set_this_p_value);
		OperationCommon_B_setPActivity_ObjectFlow10.setGuard(OperationCommon_B_setPActivity_ObjectFlow10_LiteralBoolean11);
	}

	private void initializeOperation_Instances()
	{
		// Operation OperationCommon_I::setP_Integer
		addToElementRepository("setP_Integer", OperationCommon_I_setP_Integer);
		OperationCommon_I_setP_Integer.setName("setP");
		OperationCommon_I_setP_Integer.setVisibility(VisibilityKind.public_);
		OperationCommon_I_setP_Integer.addOwnedParameter(OperationCommon_I_setP_Integer_v);
		// Operation OperationCommon_IImpl::setP_Integer
		addToElementRepository("setP_Integer", OperationCommon_IImpl_setP_Integer);
		OperationCommon_IImpl_setP_Integer.setName("setP");
		OperationCommon_IImpl_setP_Integer.setVisibility(VisibilityKind.public_);
		OperationCommon_IImpl_setP_Integer.addOwnedParameter(OperationCommon_IImpl_setP_Integer_v);
		// Operation OperationCommon_B::setP_Integer
		addToElementRepository("setP_Integer", OperationCommon_B_setP_Integer);
		OperationCommon_B_setP_Integer.setName("setP");
		OperationCommon_B_setP_Integer.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setP_Integer.addOwnedParameter(OperationCommon_B_setP_Integer_v);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin OperationCommon_B_setPActivity_Set this.p::result
		addToElementRepository("result", OperationCommon_B_setPActivity_Set_this_p_result);
		OperationCommon_B_setPActivity_Set_this_p_result.setName("result");
		OperationCommon_B_setPActivity_Set_this_p_result.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_Set_this_p_result.setType(OperationCommon_B);
		// OutputPin OperationCommon_B_setPActivity_this::result
		addToElementRepository("result", OperationCommon_B_setPActivity_this_result);
		OperationCommon_B_setPActivity_this_result.setName("result");
		OperationCommon_B_setPActivity_this_result.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_this_result.setType(OperationCommon_B);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport OperationCommon::PackageImport16
		addToElementRepository("PackageImport16", OperationCommon_PackageImport16);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter OperationCommon_B_setP_Integer::v
		addToElementRepository("v", OperationCommon_B_setP_Integer_v);
		OperationCommon_B_setP_Integer_v.setName("v");
		OperationCommon_B_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		OperationCommon_B_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter OperationCommon_IImpl_setP_Integer::v
		addToElementRepository("v", OperationCommon_IImpl_setP_Integer_v);
		OperationCommon_IImpl_setP_Integer_v.setName("v");
		OperationCommon_IImpl_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		OperationCommon_IImpl_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter OperationCommon_B_setPActivity::v
		addToElementRepository("v", OperationCommon_B_setPActivity_v);
		OperationCommon_B_setPActivity_v.setName("v");
		OperationCommon_B_setPActivity_v.setVisibility(VisibilityKind.public_);
		
		OperationCommon_B_setPActivity_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter OperationCommon_I_setP_Integer::v
		addToElementRepository("v", OperationCommon_I_setP_Integer_v);
		OperationCommon_I_setP_Integer_v.setName("v");
		OperationCommon_I_setP_Integer_v.setVisibility(VisibilityKind.public_);
		
		OperationCommon_I_setP_Integer_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeProperty_Instances()
	{
		// Property OperationCommon_S::x
		addToElementRepository("x", OperationCommon_S_x);
		OperationCommon_S_x.setName("x");
		OperationCommon_S_x.setVisibility(VisibilityKind.public_);
		
		OperationCommon_S_x.setType(OperationCommon_IImpl);
		// Property OperationCommon_R::x
		addToElementRepository("x", OperationCommon_R_x);
		OperationCommon_R_x.setName("x");
		OperationCommon_R_x.setVisibility(VisibilityKind.public_);
		
		OperationCommon_R_x.setType(OperationCommon_IImpl);
		// Property OperationCommon_S::y
		addToElementRepository("y", OperationCommon_S_y);
		OperationCommon_S_y.setName("y");
		OperationCommon_S_y.setVisibility(VisibilityKind.public_);
		
		OperationCommon_S_y.setType(OperationCommon_IImpl);
		// Property OperationCommon_B::p
		addToElementRepository("p", OperationCommon_B_p);
		OperationCommon_B_p.setName("p");
		OperationCommon_B_p.setVisibility(VisibilityKind.public_);
		
		OperationCommon_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property OperationCommon_R::y
		addToElementRepository("y", OperationCommon_R_y);
		OperationCommon_R_y.setName("y");
		OperationCommon_R_y.setVisibility(VisibilityKind.public_);
		
		OperationCommon_R_y.setType(OperationCommon_B);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction OperationCommon_B_setPActivity::this
		addToElementRepository("this", OperationCommon_B_setPActivity_this);
		OperationCommon_B_setPActivity_this.setName("this");
		OperationCommon_B_setPActivity_this.setVisibility(VisibilityKind.public_);
		OperationCommon_B_setPActivity_this.setResult(OperationCommon_B_setPActivity_this_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // OperationCommonModel
