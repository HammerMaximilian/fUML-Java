/*
 * DefaultValue_BasicTypesModel.java
 * 
 * Auto-generated file
 */
package DefaultValue_BasicTypes;

import uml.values.LiteralBoolean;
import uml.values.LiteralUnlimitedNatural;
import uml.values.LiteralReal;
import uml.actions.OutputPin;
import uml.activities.Activity;
import uml.actions.ReadStructuralFeatureAction;
import uml.actions.CallOperationAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.values.LiteralString;
import uml.structuredclassifiers.Class_;
import uml.commonstructure.Comment;
import uml.classification.Parameter;
import uml.classification.Operation;
import uml.activities.ActivityParameterNode;
import uml.commonstructure.PackageImport;
import uml.classification.AggregationKind;
import uml.activities.ForkNode;
import uml.actions.CreateObjectAction;
import uml.commonbehavior.FunctionBehavior;
import uml.actions.CallBehaviorAction;
import uml.simpleclassifiers.EnumerationLiteral;
import uml.classification.Property;
import utils.primitivetypes.PrimitiveTypesModel;
import uml.classification.ParameterDirectionKind;
import uml.simpleclassifiers.PrimitiveType;
import uml.classification.InstanceValue;
import uml.activities.ObjectFlow;
import uml.commonbehavior.OpaqueBehavior;
import utils.library.FoundationalModelLibraryModel;
import utils.environment.InMemoryModel;
import uml.values.LiteralInteger;
import uml.simpleclassifiers.Enumeration;
import uml.packages.Package;


/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class DefaultValue_BasicTypesModel extends InMemoryModel
{
	private static DefaultValue_BasicTypesModel instance;

	/*
	 * Model DefaultValue_BasicTypes
	 */
	public Package DefaultValue_BasicTypes = new Package();
		public Comment DefaultValue_BasicTypes_Comment0 = new Comment();
		public Enumeration DefaultValue_BasicTypes_E = new Enumeration();
			public EnumerationLiteral DefaultValue_BasicTypes_E_e2 = new EnumerationLiteral();
			public EnumerationLiteral DefaultValue_BasicTypes_E_e1 = new EnumerationLiteral();
		public Activity DefaultValue_BasicTypes_instantiate_A = new Activity();
			public CreateObjectAction DefaultValue_BasicTypes_instantiate_A_Create_A = new CreateObjectAction();
				public OutputPin DefaultValue_BasicTypes_instantiate_A_Create_A_result = new OutputPin();
					public LiteralInteger DefaultValue_BasicTypes_instantiate_A_Create_A_result_LiteralInteger1 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_instantiate_A_Create_A_result_LiteralUnlimitedNatural2 = new LiteralUnlimitedNatural();
			public ActivityParameterNode DefaultValue_BasicTypes_instantiate_A_a_node = new ActivityParameterNode();
				public LiteralInteger DefaultValue_BasicTypes_instantiate_A_a_node_LiteralInteger3 = new LiteralInteger();
			public Parameter DefaultValue_BasicTypes_instantiate_A_a = new Parameter();
			public CallOperationAction DefaultValue_BasicTypes_instantiate_A_A_ = new CallOperationAction();
				public OutputPin DefaultValue_BasicTypes_instantiate_A_A__result = new OutputPin();
					public LiteralInteger DefaultValue_BasicTypes_instantiate_A_A__result_LiteralInteger4 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_instantiate_A_A__result_LiteralUnlimitedNatural5 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_BasicTypes_instantiate_A_A__result_LiteralInteger6 = new LiteralInteger();
				public InputPin DefaultValue_BasicTypes_instantiate_A_A__target = new InputPin();
					public LiteralInteger DefaultValue_BasicTypes_instantiate_A_A__target_LiteralInteger7 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_instantiate_A_A__target_LiteralUnlimitedNatural8 = new LiteralUnlimitedNatural();
			public ObjectFlow DefaultValue_BasicTypes_instantiate_A_ObjectFlow9 = new ObjectFlow();
				public LiteralInteger DefaultValue_BasicTypes_instantiate_A_ObjectFlow9_LiteralInteger10 = new LiteralInteger();
				public LiteralBoolean DefaultValue_BasicTypes_instantiate_A_ObjectFlow9_LiteralBoolean11 = new LiteralBoolean();
			public ObjectFlow DefaultValue_BasicTypes_instantiate_A_ObjectFlow12 = new ObjectFlow();
				public LiteralInteger DefaultValue_BasicTypes_instantiate_A_ObjectFlow12_LiteralInteger13 = new LiteralInteger();
				public LiteralBoolean DefaultValue_BasicTypes_instantiate_A_ObjectFlow12_LiteralBoolean14 = new LiteralBoolean();
		public Class_ DefaultValue_BasicTypes_A = new Class_();
			public Property DefaultValue_BasicTypes_A_pInteger = new Property();
				public LiteralInteger DefaultValue_BasicTypes_A_pInteger_LiteralInteger15 = new LiteralInteger();
			public Property DefaultValue_BasicTypes_A_pString = new Property();
				public LiteralString DefaultValue_BasicTypes_A_pString_LiteralString16 = new LiteralString();
			public Property DefaultValue_BasicTypes_A_pBoolean = new Property();
				public LiteralBoolean DefaultValue_BasicTypes_A_pBoolean_LiteralBoolean17 = new LiteralBoolean();
			public Property DefaultValue_BasicTypes_A_pUnlimitedNatural = new Property();
				public LiteralUnlimitedNatural DefaultValue_BasicTypes_A_pUnlimitedNatural_LiteralUnlimitedNatural18 = new LiteralUnlimitedNatural();
			public Operation DefaultValue_BasicTypes_A_A_A = new Operation();
				public Parameter DefaultValue_BasicTypes_A_A_A_result = new Parameter();
			public Property DefaultValue_BasicTypes_A_pReal = new Property();
				public LiteralReal DefaultValue_BasicTypes_A_pReal_LiteralReal19 = new LiteralReal();
			public Property DefaultValue_BasicTypes_A_pEnum = new Property();
				public InstanceValue DefaultValue_BasicTypes_A_pEnum_InstanceValue20 = new InstanceValue();
		public PackageImport DefaultValue_BasicTypes_PackageImport21 = new PackageImport();
			public Comment DefaultValue_BasicTypes_PackageImport21_Comment22 = new Comment();
		public Activity DefaultValue_BasicTypes_main = new Activity();
			public CallBehaviorAction DefaultValue_BasicTypes_main_instantiate_A = new CallBehaviorAction();
				public OutputPin DefaultValue_BasicTypes_main_instantiate_A_a = new OutputPin();
					public LiteralInteger DefaultValue_BasicTypes_main_instantiate_A_a_LiteralInteger23 = new LiteralInteger();
					public LiteralInteger DefaultValue_BasicTypes_main_instantiate_A_a_LiteralInteger24 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_main_instantiate_A_a_LiteralUnlimitedNatural25 = new LiteralUnlimitedNatural();
			public CallBehaviorAction DefaultValue_BasicTypes_main_assert_A = new CallBehaviorAction();
				public InputPin DefaultValue_BasicTypes_main_assert_A_a = new InputPin();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_main_assert_A_a_LiteralUnlimitedNatural26 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_BasicTypes_main_assert_A_a_LiteralInteger27 = new LiteralInteger();
					public LiteralInteger DefaultValue_BasicTypes_main_assert_A_a_LiteralInteger28 = new LiteralInteger();
			public ObjectFlow DefaultValue_BasicTypes_main_ObjectFlow29 = new ObjectFlow();
				public LiteralBoolean DefaultValue_BasicTypes_main_ObjectFlow29_LiteralBoolean30 = new LiteralBoolean();
				public LiteralInteger DefaultValue_BasicTypes_main_ObjectFlow29_LiteralInteger31 = new LiteralInteger();
		public Activity DefaultValue_BasicTypes_assert_A = new Activity();
			public ReadStructuralFeatureAction DefaultValue_BasicTypes_assert_A_Read_a_pBoolean = new ReadStructuralFeatureAction();
				public OutputPin DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result = new OutputPin();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result_LiteralInteger32 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result_LiteralUnlimitedNatural33 = new LiteralUnlimitedNatural();
				public InputPin DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object = new InputPin();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object_LiteralInteger34 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object_LiteralUnlimitedNatural35 = new LiteralUnlimitedNatural();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow36 = new ObjectFlow();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow36_LiteralInteger37 = new LiteralInteger();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow36_LiteralBoolean38 = new LiteralBoolean();
			public OpaqueBehavior DefaultValue_BasicTypes_assert_A_testDefaultValues = new OpaqueBehavior();
				public Parameter DefaultValue_BasicTypes_assert_A_testDefaultValues_pEnum = new Parameter();
				public Parameter DefaultValue_BasicTypes_assert_A_testDefaultValues_pString = new Parameter();
				public Parameter DefaultValue_BasicTypes_assert_A_testDefaultValues_pReal = new Parameter();
				public Parameter DefaultValue_BasicTypes_assert_A_testDefaultValues_pInteger = new Parameter();
				public Parameter DefaultValue_BasicTypes_assert_A_testDefaultValues_pUnlimitedNatural = new Parameter();
				public Parameter DefaultValue_BasicTypes_assert_A_testDefaultValues_pBoolean = new Parameter();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow39 = new ObjectFlow();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow39_LiteralBoolean40 = new LiteralBoolean();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow39_LiteralInteger41 = new LiteralInteger();
			public CallBehaviorAction DefaultValue_BasicTypes_assert_A_Test_Default_Values = new CallBehaviorAction();
				public InputPin DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal = new InputPin();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal_LiteralUnlimitedNatural42 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal_LiteralInteger43 = new LiteralInteger();
				public InputPin DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean = new InputPin();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean_LiteralInteger44 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean_LiteralUnlimitedNatural45 = new LiteralUnlimitedNatural();
				public InputPin DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum = new InputPin();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum_LiteralInteger47 = new LiteralInteger();
				public InputPin DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger = new InputPin();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger_LiteralUnlimitedNatural48 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger_LiteralInteger49 = new LiteralInteger();
				public InputPin DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString = new InputPin();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString_LiteralUnlimitedNatural50 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString_LiteralInteger51 = new LiteralInteger();
				public InputPin DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural = new InputPin();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural_LiteralInteger52 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural_LiteralUnlimitedNatural53 = new LiteralUnlimitedNatural();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow54 = new ObjectFlow();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow54_LiteralInteger55 = new LiteralInteger();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow54_LiteralBoolean56 = new LiteralBoolean();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow57 = new ObjectFlow();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow57_LiteralBoolean58 = new LiteralBoolean();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow57_LiteralInteger59 = new LiteralInteger();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow60 = new ObjectFlow();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow60_LiteralInteger61 = new LiteralInteger();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow60_LiteralBoolean62 = new LiteralBoolean();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow63 = new ObjectFlow();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow63_LiteralBoolean64 = new LiteralBoolean();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow63_LiteralInteger65 = new LiteralInteger();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow66 = new ObjectFlow();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow66_LiteralInteger67 = new LiteralInteger();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow66_LiteralBoolean68 = new LiteralBoolean();
			public ReadStructuralFeatureAction DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural = new ReadStructuralFeatureAction();
				public InputPin DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object = new InputPin();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object_LiteralUnlimitedNatural69 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object_LiteralInteger70 = new LiteralInteger();
				public OutputPin DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result = new OutputPin();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result_LiteralInteger71 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result_LiteralUnlimitedNatural72 = new LiteralUnlimitedNatural();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow73 = new ObjectFlow();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow73_LiteralBoolean74 = new LiteralBoolean();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow73_LiteralInteger75 = new LiteralInteger();
			public ReadStructuralFeatureAction DefaultValue_BasicTypes_assert_A_Read_a_pEnum = new ReadStructuralFeatureAction();
				public OutputPin DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result = new OutputPin();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result_LiteralInteger76 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result_LiteralUnlimitedNatural77 = new LiteralUnlimitedNatural();
				public InputPin DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object = new InputPin();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object_LiteralUnlimitedNatural78 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object_LiteralInteger79 = new LiteralInteger();
			public Parameter DefaultValue_BasicTypes_assert_A_a = new Parameter();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow80 = new ObjectFlow();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow80_LiteralInteger81 = new LiteralInteger();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow80_LiteralBoolean82 = new LiteralBoolean();
			public ActivityParameterNode DefaultValue_BasicTypes_assert_A_a_node = new ActivityParameterNode();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_a_node_LiteralInteger83 = new LiteralInteger();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow84 = new ObjectFlow();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow84_LiteralBoolean85 = new LiteralBoolean();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow84_LiteralInteger86 = new LiteralInteger();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow87 = new ObjectFlow();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow87_LiteralInteger88 = new LiteralInteger();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow87_LiteralBoolean89 = new LiteralBoolean();
			public ReadStructuralFeatureAction DefaultValue_BasicTypes_assert_A_Read_a_pInteger = new ReadStructuralFeatureAction();
				public InputPin DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object = new InputPin();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object_LiteralUnlimitedNatural90 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object_LiteralInteger91 = new LiteralInteger();
				public OutputPin DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result = new OutputPin();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result_LiteralInteger92 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result_LiteralUnlimitedNatural93 = new LiteralUnlimitedNatural();
			public ForkNode DefaultValue_BasicTypes_assert_A_Fork_a = new ForkNode();
			public ReadStructuralFeatureAction DefaultValue_BasicTypes_assert_A_Read_a_pReal = new ReadStructuralFeatureAction();
				public OutputPin DefaultValue_BasicTypes_assert_A_Read_a_pReal_result = new OutputPin();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read_a_pReal_result_LiteralUnlimitedNatural94 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Read_a_pReal_result_LiteralInteger95 = new LiteralInteger();
				public InputPin DefaultValue_BasicTypes_assert_A_Read_a_pReal_object = new InputPin();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Read_a_pReal_object_LiteralInteger96 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read_a_pReal_object_LiteralUnlimitedNatural97 = new LiteralUnlimitedNatural();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow98 = new ObjectFlow();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow98_LiteralBoolean99 = new LiteralBoolean();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow98_LiteralInteger100 = new LiteralInteger();
			public ObjectFlow DefaultValue_BasicTypes_assert_A_ObjectFlow101 = new ObjectFlow();
				public LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow101_LiteralBoolean102 = new LiteralBoolean();
				public LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow101_LiteralInteger103 = new LiteralInteger();
			public ReadStructuralFeatureAction DefaultValue_BasicTypes_assert_A_Read_a_pString = new ReadStructuralFeatureAction();
				public OutputPin DefaultValue_BasicTypes_assert_A_Read_a_pString_result = new OutputPin();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read_a_pString_result_LiteralUnlimitedNatural104 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Read_a_pString_result_LiteralInteger105 = new LiteralInteger();
				public InputPin DefaultValue_BasicTypes_assert_A_Read_a_pString_object = new InputPin();
					public LiteralInteger DefaultValue_BasicTypes_assert_A_Read_a_pString_object_LiteralInteger106 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read_a_pString_object_LiteralUnlimitedNatural107 = new LiteralUnlimitedNatural();

	public static DefaultValue_BasicTypesModel instance()
	{
		if (instance == null)
        {
            instance = new DefaultValue_BasicTypesModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public DefaultValue_BasicTypesModel()
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
		this.initializeCallBehaviorAction_Instances();
		this.initializeCallOperationAction_Instances();
		this.initializeClass_Instances();
		this.initializeComment_Instances();
		this.initializeCreateObjectAction_Instances();
		this.initializeEnumeration_Instances();
		this.initializeEnumerationLiteral_Instances();
		this.initializeForkNode_Instances();
		this.initializeFunctionBehavior_Instances();
		this.initializeInputPin_Instances();
		this.initializeInstanceValue_Instances();
		this.initializeLiteralBoolean_Instances();
		this.initializeLiteralInteger_Instances();
		this.initializeLiteralReal_Instances();
		this.initializeLiteralString_Instances();
		this.initializeLiteralUnlimitedNatural_Instances();
		this.initializeObjectFlow_Instances();
		this.initializeOperation_Instances();
		this.initializeOutputPin_Instances();
		this.initializePackageImport_Instances();
		this.initializeParameter_Instances();
		this.initializeProperty_Instances();
		this.initializeReadStructuralFeatureAction_Instances();
	}

	private void initializeActivity_Instances()
	{
		// Activity DefaultValue_BasicTypes::instantiate_A
		addToElementRepository("instantiate_A", DefaultValue_BasicTypes_instantiate_A);
		DefaultValue_BasicTypes_instantiate_A.setName("instantiate_A");
		DefaultValue_BasicTypes_instantiate_A.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_instantiate_A.addOwnedParameter(DefaultValue_BasicTypes_instantiate_A_a);
		DefaultValue_BasicTypes_instantiate_A.addNode(DefaultValue_BasicTypes_instantiate_A_Create_A);
		DefaultValue_BasicTypes_instantiate_A.addNode(DefaultValue_BasicTypes_instantiate_A_a_node);
		DefaultValue_BasicTypes_instantiate_A.addNode(DefaultValue_BasicTypes_instantiate_A_A_);
		DefaultValue_BasicTypes_instantiate_A.addEdge(DefaultValue_BasicTypes_instantiate_A_ObjectFlow9);
		DefaultValue_BasicTypes_instantiate_A.addEdge(DefaultValue_BasicTypes_instantiate_A_ObjectFlow12);
		// Activity DefaultValue_BasicTypes::main
		addToElementRepository("main", DefaultValue_BasicTypes_main);
		DefaultValue_BasicTypes_main.setName("main");
		DefaultValue_BasicTypes_main.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_main.addNode(DefaultValue_BasicTypes_main_instantiate_A);
		DefaultValue_BasicTypes_main.addNode(DefaultValue_BasicTypes_main_assert_A);
		DefaultValue_BasicTypes_main.addEdge(DefaultValue_BasicTypes_main_ObjectFlow29);
		// Activity DefaultValue_BasicTypes::assert_A
		addToElementRepository("assert_A", DefaultValue_BasicTypes_assert_A);
		DefaultValue_BasicTypes_assert_A.setName("assert_A");
		DefaultValue_BasicTypes_assert_A.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A.addOwnedBehavior(DefaultValue_BasicTypes_assert_A_testDefaultValues);
		DefaultValue_BasicTypes_assert_A.addOwnedParameter(DefaultValue_BasicTypes_assert_A_a);
		DefaultValue_BasicTypes_assert_A.addNode(DefaultValue_BasicTypes_assert_A_Read_a_pBoolean);
		DefaultValue_BasicTypes_assert_A.addNode(DefaultValue_BasicTypes_assert_A_Read_a_pEnum);
		DefaultValue_BasicTypes_assert_A.addNode(DefaultValue_BasicTypes_assert_A_a_node);
		DefaultValue_BasicTypes_assert_A.addNode(DefaultValue_BasicTypes_assert_A_Test_Default_Values);
		DefaultValue_BasicTypes_assert_A.addNode(DefaultValue_BasicTypes_assert_A_Fork_a);
		DefaultValue_BasicTypes_assert_A.addNode(DefaultValue_BasicTypes_assert_A_Read_a_pInteger);
		DefaultValue_BasicTypes_assert_A.addNode(DefaultValue_BasicTypes_assert_A_Read_a_pReal);
		DefaultValue_BasicTypes_assert_A.addNode(DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural);
		DefaultValue_BasicTypes_assert_A.addNode(DefaultValue_BasicTypes_assert_A_Read_a_pString);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow36);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow39);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow54);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow60);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow57);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow63);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow66);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow73);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow80);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow84);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow87);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow98);
		DefaultValue_BasicTypes_assert_A.addEdge(DefaultValue_BasicTypes_assert_A_ObjectFlow101);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode DefaultValue_BasicTypes_instantiate_A::a_node
		addToElementRepository("a_node", DefaultValue_BasicTypes_instantiate_A_a_node);
		DefaultValue_BasicTypes_instantiate_A_a_node.setName("a_node");
		DefaultValue_BasicTypes_instantiate_A_a_node.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_instantiate_A_a_node.setParameter(DefaultValue_BasicTypes_instantiate_A_a);
		// ActivityParameterNode DefaultValue_BasicTypes_assert_A::a_node
		addToElementRepository("a_node", DefaultValue_BasicTypes_assert_A_a_node);
		DefaultValue_BasicTypes_assert_A_a_node.setName("a_node");
		DefaultValue_BasicTypes_assert_A_a_node.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_a_node.setParameter(DefaultValue_BasicTypes_assert_A_a);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction DefaultValue_BasicTypes_assert_A::Test Default Values
		addToElementRepository("Test Default Values", DefaultValue_BasicTypes_assert_A_Test_Default_Values);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values.setName("Test Default Values");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values.setBehavior(DefaultValue_BasicTypes_assert_A_testDefaultValues);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values.addArgument(DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values.addArgument(DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values.addArgument(DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values.addArgument(DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values.addArgument(DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values.addArgument(DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum);
		// CallBehaviorAction DefaultValue_BasicTypes_main::instantiate_A
		addToElementRepository("instantiate_A", DefaultValue_BasicTypes_main_instantiate_A);
		DefaultValue_BasicTypes_main_instantiate_A.setName("instantiate_A");
		DefaultValue_BasicTypes_main_instantiate_A.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_main_instantiate_A.addResult(DefaultValue_BasicTypes_main_instantiate_A_a);
		DefaultValue_BasicTypes_main_instantiate_A.setBehavior(DefaultValue_BasicTypes_instantiate_A);
		// CallBehaviorAction DefaultValue_BasicTypes_main::assert_A
		addToElementRepository("assert_A", DefaultValue_BasicTypes_main_assert_A);
		DefaultValue_BasicTypes_main_assert_A.setName("assert_A");
		DefaultValue_BasicTypes_main_assert_A.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_main_assert_A.setBehavior(DefaultValue_BasicTypes_assert_A);
		DefaultValue_BasicTypes_main_assert_A.addArgument(DefaultValue_BasicTypes_main_assert_A_a);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction DefaultValue_BasicTypes_instantiate_A::A()
		addToElementRepository("A()", DefaultValue_BasicTypes_instantiate_A_A_);
		DefaultValue_BasicTypes_instantiate_A_A_.setName("A()");
		DefaultValue_BasicTypes_instantiate_A_A_.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_instantiate_A_A_.addResult(DefaultValue_BasicTypes_instantiate_A_A__result);
		DefaultValue_BasicTypes_instantiate_A_A_.setOperation(DefaultValue_BasicTypes_A_A_A);
		DefaultValue_BasicTypes_instantiate_A_A_.setTarget(DefaultValue_BasicTypes_instantiate_A_A__target);
	}

	private void initializeClass_Instances()
	{
		// Class DefaultValue_BasicTypes::A
		addToElementRepository("A", DefaultValue_BasicTypes_A);
		DefaultValue_BasicTypes_A.setName("A");
		DefaultValue_BasicTypes_A.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_A.addOwnedAttribute(DefaultValue_BasicTypes_A_pInteger);
		DefaultValue_BasicTypes_A.addOwnedAttribute(DefaultValue_BasicTypes_A_pString);
		DefaultValue_BasicTypes_A.addOwnedAttribute(DefaultValue_BasicTypes_A_pBoolean);
		DefaultValue_BasicTypes_A.addOwnedAttribute(DefaultValue_BasicTypes_A_pUnlimitedNatural);
		DefaultValue_BasicTypes_A.addOwnedAttribute(DefaultValue_BasicTypes_A_pReal);
		DefaultValue_BasicTypes_A.addOwnedAttribute(DefaultValue_BasicTypes_A_pEnum);
		
		
		DefaultValue_BasicTypes_A.addOwnedOperation(DefaultValue_BasicTypes_A_A_A);
	}

	private void initializeComment_Instances()
	{
		// Comment DefaultValue_BasicTypes::Comment0
		addToElementRepository("Comment0", DefaultValue_BasicTypes_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment DefaultValue_BasicTypes_PackageImport21::Comment22
		addToElementRepository("Comment22", DefaultValue_BasicTypes_PackageImport21_Comment22);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction DefaultValue_BasicTypes_instantiate_A::Create_A
		addToElementRepository("Create_A", DefaultValue_BasicTypes_instantiate_A_Create_A);
		DefaultValue_BasicTypes_instantiate_A_Create_A.setName("Create_A");
		DefaultValue_BasicTypes_instantiate_A_Create_A.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_Create_A.setClassifier(DefaultValue_BasicTypes_A);
		DefaultValue_BasicTypes_instantiate_A_Create_A.setResult(DefaultValue_BasicTypes_instantiate_A_Create_A_result);
	}

	private void initializeEnumeration_Instances()
	{
		// Enumeration DefaultValue_BasicTypes::E
		addToElementRepository("E", DefaultValue_BasicTypes_E);
		DefaultValue_BasicTypes_E.setName("E");
		DefaultValue_BasicTypes_E.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_E.addOwnedLiteral(DefaultValue_BasicTypes_E_e1);
		DefaultValue_BasicTypes_E.addOwnedLiteral(DefaultValue_BasicTypes_E_e2);
	}

	private void initializeEnumerationLiteral_Instances()
	{
		// EnumerationLiteral DefaultValue_BasicTypes_E::e2
		addToElementRepository("e2", DefaultValue_BasicTypes_E_e2);
		DefaultValue_BasicTypes_E_e2.setName("e2");
		DefaultValue_BasicTypes_E_e2.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_E_e2.addClassifier(DefaultValue_BasicTypes_E);
		// EnumerationLiteral DefaultValue_BasicTypes_E::e1
		addToElementRepository("e1", DefaultValue_BasicTypes_E_e1);
		DefaultValue_BasicTypes_E_e1.setName("e1");
		DefaultValue_BasicTypes_E_e1.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_E_e1.addClassifier(DefaultValue_BasicTypes_E);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode DefaultValue_BasicTypes_assert_A::Fork_a
		addToElementRepository("Fork_a", DefaultValue_BasicTypes_assert_A_Fork_a);
		DefaultValue_BasicTypes_assert_A_Fork_a.setName("Fork_a");
		DefaultValue_BasicTypes_assert_A_Fork_a.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior DefaultValue_BasicTypes_assert_A::testDefaultValues
		addToElementRepository("testDefaultValues", DefaultValue_BasicTypes_assert_A_testDefaultValues);
		DefaultValue_BasicTypes_assert_A_testDefaultValues.setName("testDefaultValues");
		DefaultValue_BasicTypes_assert_A_testDefaultValues.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_testDefaultValues.addOwnedParameter(DefaultValue_BasicTypes_assert_A_testDefaultValues_pInteger);
		DefaultValue_BasicTypes_assert_A_testDefaultValues.addOwnedParameter(DefaultValue_BasicTypes_assert_A_testDefaultValues_pString);
		DefaultValue_BasicTypes_assert_A_testDefaultValues.addOwnedParameter(DefaultValue_BasicTypes_assert_A_testDefaultValues_pBoolean);
		DefaultValue_BasicTypes_assert_A_testDefaultValues.addOwnedParameter(DefaultValue_BasicTypes_assert_A_testDefaultValues_pUnlimitedNatural);
		DefaultValue_BasicTypes_assert_A_testDefaultValues.addOwnedParameter(DefaultValue_BasicTypes_assert_A_testDefaultValues_pReal);
		DefaultValue_BasicTypes_assert_A_testDefaultValues.addOwnedParameter(DefaultValue_BasicTypes_assert_A_testDefaultValues_pEnum);
		DefaultValue_BasicTypes_assert_A_testDefaultValues.addLanguage("Java");
		DefaultValue_BasicTypes_assert_A_testDefaultValues.addLanguage("Import");
		DefaultValue_BasicTypes_assert_A_testDefaultValues.addBody("System.out.println(\"Asserting a.pInteger == 4\");	 	// Test parameter pInteger 	int pInteger = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument pInteger = \" + pInteger); 	System.out.println(\"a.pInteger == \" + pInteger); 	if(pInteger == 4) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}  	System.out.println(\"Asserting a.pString == 'Hello'\"); 	// Test parameter pString 	String pString = ((StringValue)inputParameters.get(1).values.get(0)).value; 	Debug.println(\"[doBody] argument \" + inputParameters.get(1).parameter.name +  \" = \" + pString); 	System.out.println(\"a.pString == \" + pString); 	if(pString == \"Hello\") 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}  	System.out.println(\"Asserting a.pBoolean == true\"); 	// Test parameter pBoolean 	boolean pBoolean = ((BooleanValue)inputParameters.get(2).values.get(0)).value; 	Debug.println(\"[doBody] argument \" + inputParameters.get(2).parameter.name +  \" = \" + pBoolean); 	System.out.println(\"a.pBoolean == \" + pBoolean); 	if(pBoolean) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}  	System.out.println(\"Asserting a.pUnlimitedNatural == *\"); 	// Test parameter pUnlimitedNatural 	UnlimitedNatural pUnlimitedNatural = ((UnlimitedNaturalValue)inputParameters.get(3).values.get(0)).value; 	Debug.println(\"[doBody] argument \" + inputParameters.get(3).parameter.name +  \" = \" + pUnlimitedNatural.toString()); 	System.out.println(\"a.pUnlimitedNatural == \" + pUnlimitedNatural.toString()); 	if(pUnlimitedNatural.naturalValue == -1) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}  	System.out.println(\"Asserting a.pReal == 4.0\"); 	// Test parameter pReal 	float pReal = ((RealValue)inputParameters.get(4).values.get(0)).value; 	Debug.println(\"[doBody] argument \" + inputParameters.get(4).parameter.name +  \" = \" + pReal); 	System.out.println(\"a.pReal == \" + String.valueOf(pReal)); 	if(pReal == 4.0) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}  	System.out.println(\"Asserting a.pEnum == E::e2\"); 	// Test parameter pEnum 	EnumerationLiteral pEnum = ((EnumerationValue)inputParameters.get(5).values.get(0)).literal; 	Debug.println(\"[doBody] argument \" + inputParameters.get(5).parameter.name +  \" = \" + pEnum.qualifiedName); 	System.out.println(\"a.pEnum == \" + pEnum.qualifiedName); 	if(pEnum == DefaultValue_BasicTypesModel.instance().DefaultValue_BasicTypes_E_e2) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		DefaultValue_BasicTypes_assert_A_testDefaultValues.addBody("import UMLPrimitiveTypes.UnlimitedNatural; import fuml.Debug; import fuml.semantics.simpleclassifiers.BooleanValue; import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.semantics.simpleclassifiers.EnumerationValue; import fuml.semantics.simpleclassifiers.RealValue; import fuml.semantics.simpleclassifiers.StringValue; import fuml.semantics.simpleclassifiers.UnlimitedNaturalValue; import uml.simpleclassifiers.EnumerationLiteral; ");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin DefaultValue_BasicTypes_assert_A_Test Default Values::pReal
		addToElementRepository("pReal", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal.setName("pReal");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
		// InputPin DefaultValue_BasicTypes_assert_A_Test Default Values::pBoolean
		addToElementRepository("pBoolean", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean.setName("pBoolean");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// InputPin DefaultValue_BasicTypes_main_assert_A::a
		addToElementRepository("a", DefaultValue_BasicTypes_main_assert_A_a);
		DefaultValue_BasicTypes_main_assert_A_a.setName("a");
		DefaultValue_BasicTypes_main_assert_A_a.setVisibility(VisibilityKind.public_);
		// InputPin DefaultValue_BasicTypes_assert_A_Test Default Values::pInteger
		addToElementRepository("pInteger", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger.setName("pInteger");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin DefaultValue_BasicTypes_instantiate_A_A()::target
		addToElementRepository("target", DefaultValue_BasicTypes_instantiate_A_A__target);
		DefaultValue_BasicTypes_instantiate_A_A__target.setName("target");
		DefaultValue_BasicTypes_instantiate_A_A__target.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_A__target.setType(DefaultValue_BasicTypes_A);
		// InputPin DefaultValue_BasicTypes_assert_A_Read a.pString::object
		addToElementRepository("object", DefaultValue_BasicTypes_assert_A_Read_a_pString_object);
		DefaultValue_BasicTypes_assert_A_Read_a_pString_object.setName("object");
		DefaultValue_BasicTypes_assert_A_Read_a_pString_object.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pString_object.setType(DefaultValue_BasicTypes_A);
		// InputPin DefaultValue_BasicTypes_assert_A_Test Default Values::pString
		addToElementRepository("pString", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString.setName("pString");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin DefaultValue_BasicTypes_assert_A_Read a.pUnlimitedNatural::object
		addToElementRepository("object", DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object.setName("object");
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object.setType(DefaultValue_BasicTypes_A);
		// InputPin DefaultValue_BasicTypes_assert_A_Read a.pInteger::object
		addToElementRepository("object", DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object.setName("object");
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object.setType(DefaultValue_BasicTypes_A);
		// InputPin DefaultValue_BasicTypes_assert_A_Test Default Values::pEnum
		addToElementRepository("pEnum", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum.setName("pEnum");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum.setType(DefaultValue_BasicTypes_E);
		// InputPin DefaultValue_BasicTypes_assert_A_Read a.pReal::object
		addToElementRepository("object", DefaultValue_BasicTypes_assert_A_Read_a_pReal_object);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_object.setName("object");
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_object.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_object.setType(DefaultValue_BasicTypes_A);
		// InputPin DefaultValue_BasicTypes_assert_A_Read a.pEnum::object
		addToElementRepository("object", DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object.setName("object");
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object.setType(DefaultValue_BasicTypes_A);
		// InputPin DefaultValue_BasicTypes_assert_A_Read a.pBoolean::object
		addToElementRepository("object", DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object.setName("object");
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object.setType(DefaultValue_BasicTypes_A);
		// InputPin DefaultValue_BasicTypes_assert_A_Test Default Values::pUnlimitedNatural
		addToElementRepository("pUnlimitedNatural", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural.setName("pUnlimitedNatural");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
	}

	private void initializeInstanceValue_Instances()
	{
		// InstanceValue DefaultValue_BasicTypes_A_pEnum::InstanceValue20
		addToElementRepository("InstanceValue20", DefaultValue_BasicTypes_A_pEnum_InstanceValue20);
		DefaultValue_BasicTypes_A_pEnum_InstanceValue20.setName("InstanceValue20");
		DefaultValue_BasicTypes_A_pEnum_InstanceValue20.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_A_pEnum_InstanceValue20.setType(DefaultValue_BasicTypes_E);
		DefaultValue_BasicTypes_A_pEnum_InstanceValue20.setInstance(DefaultValue_BasicTypes_E_e2);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow73::LiteralBoolean74
		addToElementRepository("LiteralBoolean74", DefaultValue_BasicTypes_assert_A_ObjectFlow73_LiteralBoolean74);
		DefaultValue_BasicTypes_assert_A_ObjectFlow73_LiteralBoolean74.setName("LiteralBoolean74");
		DefaultValue_BasicTypes_assert_A_ObjectFlow73_LiteralBoolean74.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow73_LiteralBoolean74.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow39::LiteralBoolean40
		addToElementRepository("LiteralBoolean40", DefaultValue_BasicTypes_assert_A_ObjectFlow39_LiteralBoolean40);
		DefaultValue_BasicTypes_assert_A_ObjectFlow39_LiteralBoolean40.setName("LiteralBoolean40");
		DefaultValue_BasicTypes_assert_A_ObjectFlow39_LiteralBoolean40.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow39_LiteralBoolean40.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_instantiate_A_ObjectFlow12::LiteralBoolean14
		addToElementRepository("LiteralBoolean14", DefaultValue_BasicTypes_instantiate_A_ObjectFlow12_LiteralBoolean14);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow12_LiteralBoolean14.setName("LiteralBoolean14");
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow12_LiteralBoolean14.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow12_LiteralBoolean14.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_main_ObjectFlow29::LiteralBoolean30
		addToElementRepository("LiteralBoolean30", DefaultValue_BasicTypes_main_ObjectFlow29_LiteralBoolean30);
		DefaultValue_BasicTypes_main_ObjectFlow29_LiteralBoolean30.setName("LiteralBoolean30");
		DefaultValue_BasicTypes_main_ObjectFlow29_LiteralBoolean30.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_main_ObjectFlow29_LiteralBoolean30.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow87::LiteralBoolean89
		addToElementRepository("LiteralBoolean89", DefaultValue_BasicTypes_assert_A_ObjectFlow87_LiteralBoolean89);
		DefaultValue_BasicTypes_assert_A_ObjectFlow87_LiteralBoolean89.setName("LiteralBoolean89");
		DefaultValue_BasicTypes_assert_A_ObjectFlow87_LiteralBoolean89.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow87_LiteralBoolean89.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow57::LiteralBoolean58
		addToElementRepository("LiteralBoolean58", DefaultValue_BasicTypes_assert_A_ObjectFlow57_LiteralBoolean58);
		DefaultValue_BasicTypes_assert_A_ObjectFlow57_LiteralBoolean58.setName("LiteralBoolean58");
		DefaultValue_BasicTypes_assert_A_ObjectFlow57_LiteralBoolean58.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow57_LiteralBoolean58.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow54::LiteralBoolean56
		addToElementRepository("LiteralBoolean56", DefaultValue_BasicTypes_assert_A_ObjectFlow54_LiteralBoolean56);
		DefaultValue_BasicTypes_assert_A_ObjectFlow54_LiteralBoolean56.setName("LiteralBoolean56");
		DefaultValue_BasicTypes_assert_A_ObjectFlow54_LiteralBoolean56.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow54_LiteralBoolean56.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_A_pBoolean::LiteralBoolean17
		addToElementRepository("LiteralBoolean17", DefaultValue_BasicTypes_A_pBoolean_LiteralBoolean17);
		DefaultValue_BasicTypes_A_pBoolean_LiteralBoolean17.setName("LiteralBoolean17");
		DefaultValue_BasicTypes_A_pBoolean_LiteralBoolean17.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_A_pBoolean_LiteralBoolean17.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow36::LiteralBoolean38
		addToElementRepository("LiteralBoolean38", DefaultValue_BasicTypes_assert_A_ObjectFlow36_LiteralBoolean38);
		DefaultValue_BasicTypes_assert_A_ObjectFlow36_LiteralBoolean38.setName("LiteralBoolean38");
		DefaultValue_BasicTypes_assert_A_ObjectFlow36_LiteralBoolean38.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow36_LiteralBoolean38.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow80::LiteralBoolean82
		addToElementRepository("LiteralBoolean82", DefaultValue_BasicTypes_assert_A_ObjectFlow80_LiteralBoolean82);
		DefaultValue_BasicTypes_assert_A_ObjectFlow80_LiteralBoolean82.setName("LiteralBoolean82");
		DefaultValue_BasicTypes_assert_A_ObjectFlow80_LiteralBoolean82.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow80_LiteralBoolean82.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow101::LiteralBoolean102
		addToElementRepository("LiteralBoolean102", DefaultValue_BasicTypes_assert_A_ObjectFlow101_LiteralBoolean102);
		DefaultValue_BasicTypes_assert_A_ObjectFlow101_LiteralBoolean102.setName("LiteralBoolean102");
		DefaultValue_BasicTypes_assert_A_ObjectFlow101_LiteralBoolean102.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow101_LiteralBoolean102.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow84::LiteralBoolean85
		addToElementRepository("LiteralBoolean85", DefaultValue_BasicTypes_assert_A_ObjectFlow84_LiteralBoolean85);
		DefaultValue_BasicTypes_assert_A_ObjectFlow84_LiteralBoolean85.setName("LiteralBoolean85");
		DefaultValue_BasicTypes_assert_A_ObjectFlow84_LiteralBoolean85.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow84_LiteralBoolean85.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow98::LiteralBoolean99
		addToElementRepository("LiteralBoolean99", DefaultValue_BasicTypes_assert_A_ObjectFlow98_LiteralBoolean99);
		DefaultValue_BasicTypes_assert_A_ObjectFlow98_LiteralBoolean99.setName("LiteralBoolean99");
		DefaultValue_BasicTypes_assert_A_ObjectFlow98_LiteralBoolean99.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow98_LiteralBoolean99.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow63::LiteralBoolean64
		addToElementRepository("LiteralBoolean64", DefaultValue_BasicTypes_assert_A_ObjectFlow63_LiteralBoolean64);
		DefaultValue_BasicTypes_assert_A_ObjectFlow63_LiteralBoolean64.setName("LiteralBoolean64");
		DefaultValue_BasicTypes_assert_A_ObjectFlow63_LiteralBoolean64.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow63_LiteralBoolean64.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow60::LiteralBoolean62
		addToElementRepository("LiteralBoolean62", DefaultValue_BasicTypes_assert_A_ObjectFlow60_LiteralBoolean62);
		DefaultValue_BasicTypes_assert_A_ObjectFlow60_LiteralBoolean62.setName("LiteralBoolean62");
		DefaultValue_BasicTypes_assert_A_ObjectFlow60_LiteralBoolean62.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow60_LiteralBoolean62.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_assert_A_ObjectFlow66::LiteralBoolean68
		addToElementRepository("LiteralBoolean68", DefaultValue_BasicTypes_assert_A_ObjectFlow66_LiteralBoolean68);
		DefaultValue_BasicTypes_assert_A_ObjectFlow66_LiteralBoolean68.setName("LiteralBoolean68");
		DefaultValue_BasicTypes_assert_A_ObjectFlow66_LiteralBoolean68.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow66_LiteralBoolean68.setValue(true);
		// LiteralBoolean DefaultValue_BasicTypes_instantiate_A_ObjectFlow9::LiteralBoolean11
		addToElementRepository("LiteralBoolean11", DefaultValue_BasicTypes_instantiate_A_ObjectFlow9_LiteralBoolean11);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow9_LiteralBoolean11.setName("LiteralBoolean11");
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow9_LiteralBoolean11.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow9_LiteralBoolean11.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger DefaultValue_BasicTypes_main_instantiate_A_a::LiteralInteger23
		addToElementRepository("LiteralInteger23", DefaultValue_BasicTypes_main_instantiate_A_a_LiteralInteger23);
		DefaultValue_BasicTypes_main_instantiate_A_a_LiteralInteger23.setName("LiteralInteger23");
		DefaultValue_BasicTypes_main_instantiate_A_a_LiteralInteger23.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_main_instantiate_A_a_LiteralInteger23.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_instantiate_A_ObjectFlow12::LiteralInteger13
		addToElementRepository("LiteralInteger13", DefaultValue_BasicTypes_instantiate_A_ObjectFlow12_LiteralInteger13);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow12_LiteralInteger13.setName("LiteralInteger13");
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow12_LiteralInteger13.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow12_LiteralInteger13.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Read a.pString_object::LiteralInteger106
		addToElementRepository("LiteralInteger106", DefaultValue_BasicTypes_assert_A_Read_a_pString_object_LiteralInteger106);
		DefaultValue_BasicTypes_assert_A_Read_a_pString_object_LiteralInteger106.setName("LiteralInteger106");
		DefaultValue_BasicTypes_assert_A_Read_a_pString_object_LiteralInteger106.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pString_object_LiteralInteger106.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_instantiate_A_A()_result::LiteralInteger4
		addToElementRepository("LiteralInteger4", DefaultValue_BasicTypes_instantiate_A_A__result_LiteralInteger4);
		DefaultValue_BasicTypes_instantiate_A_A__result_LiteralInteger4.setName("LiteralInteger4");
		DefaultValue_BasicTypes_instantiate_A_A__result_LiteralInteger4.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_A__result_LiteralInteger4.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_main_assert_A_a::LiteralInteger28
		addToElementRepository("LiteralInteger28", DefaultValue_BasicTypes_main_assert_A_a_LiteralInteger28);
		DefaultValue_BasicTypes_main_assert_A_a_LiteralInteger28.setName("LiteralInteger28");
		DefaultValue_BasicTypes_main_assert_A_a_LiteralInteger28.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_main_assert_A_a_LiteralInteger28.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Test Default Values_pReal::LiteralInteger43
		addToElementRepository("LiteralInteger43", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal_LiteralInteger43);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal_LiteralInteger43.setName("LiteralInteger43");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal_LiteralInteger43.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal_LiteralInteger43.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Read a.pUnlimitedNatural_object::LiteralInteger70
		addToElementRepository("LiteralInteger70", DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object_LiteralInteger70);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object_LiteralInteger70.setName("LiteralInteger70");
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object_LiteralInteger70.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object_LiteralInteger70.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow101::LiteralInteger103
		addToElementRepository("LiteralInteger103", DefaultValue_BasicTypes_assert_A_ObjectFlow101_LiteralInteger103);
		DefaultValue_BasicTypes_assert_A_ObjectFlow101_LiteralInteger103.setName("LiteralInteger103");
		DefaultValue_BasicTypes_assert_A_ObjectFlow101_LiteralInteger103.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow101_LiteralInteger103.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Test Default Values_pEnum::LiteralInteger47
		addToElementRepository("LiteralInteger47", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum_LiteralInteger47);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum_LiteralInteger47.setName("LiteralInteger47");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum_LiteralInteger47.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum_LiteralInteger47.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Read a.pBoolean_result::LiteralInteger32
		addToElementRepository("LiteralInteger32", DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result_LiteralInteger32);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result_LiteralInteger32.setName("LiteralInteger32");
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result_LiteralInteger32.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result_LiteralInteger32.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow54::LiteralInteger55
		addToElementRepository("LiteralInteger55", DefaultValue_BasicTypes_assert_A_ObjectFlow54_LiteralInteger55);
		DefaultValue_BasicTypes_assert_A_ObjectFlow54_LiteralInteger55.setName("LiteralInteger55");
		DefaultValue_BasicTypes_assert_A_ObjectFlow54_LiteralInteger55.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow54_LiteralInteger55.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_main_instantiate_A_a::LiteralInteger24
		addToElementRepository("LiteralInteger24", DefaultValue_BasicTypes_main_instantiate_A_a_LiteralInteger24);
		DefaultValue_BasicTypes_main_instantiate_A_a_LiteralInteger24.setName("LiteralInteger24");
		DefaultValue_BasicTypes_main_instantiate_A_a_LiteralInteger24.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_main_instantiate_A_a_LiteralInteger24.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow87::LiteralInteger88
		addToElementRepository("LiteralInteger88", DefaultValue_BasicTypes_assert_A_ObjectFlow87_LiteralInteger88);
		DefaultValue_BasicTypes_assert_A_ObjectFlow87_LiteralInteger88.setName("LiteralInteger88");
		DefaultValue_BasicTypes_assert_A_ObjectFlow87_LiteralInteger88.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow87_LiteralInteger88.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_instantiate_A_Create_A_result::LiteralInteger1
		addToElementRepository("LiteralInteger1", DefaultValue_BasicTypes_instantiate_A_Create_A_result_LiteralInteger1);
		DefaultValue_BasicTypes_instantiate_A_Create_A_result_LiteralInteger1.setName("LiteralInteger1");
		DefaultValue_BasicTypes_instantiate_A_Create_A_result_LiteralInteger1.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_Create_A_result_LiteralInteger1.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_main_ObjectFlow29::LiteralInteger31
		addToElementRepository("LiteralInteger31", DefaultValue_BasicTypes_main_ObjectFlow29_LiteralInteger31);
		DefaultValue_BasicTypes_main_ObjectFlow29_LiteralInteger31.setName("LiteralInteger31");
		DefaultValue_BasicTypes_main_ObjectFlow29_LiteralInteger31.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_main_ObjectFlow29_LiteralInteger31.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_instantiate_A_a_node::LiteralInteger3
		addToElementRepository("LiteralInteger3", DefaultValue_BasicTypes_instantiate_A_a_node_LiteralInteger3);
		DefaultValue_BasicTypes_instantiate_A_a_node_LiteralInteger3.setName("LiteralInteger3");
		DefaultValue_BasicTypes_instantiate_A_a_node_LiteralInteger3.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_a_node_LiteralInteger3.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow80::LiteralInteger81
		addToElementRepository("LiteralInteger81", DefaultValue_BasicTypes_assert_A_ObjectFlow80_LiteralInteger81);
		DefaultValue_BasicTypes_assert_A_ObjectFlow80_LiteralInteger81.setName("LiteralInteger81");
		DefaultValue_BasicTypes_assert_A_ObjectFlow80_LiteralInteger81.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow80_LiteralInteger81.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_instantiate_A_A()_result::LiteralInteger6
		addToElementRepository("LiteralInteger6", DefaultValue_BasicTypes_instantiate_A_A__result_LiteralInteger6);
		DefaultValue_BasicTypes_instantiate_A_A__result_LiteralInteger6.setName("LiteralInteger6");
		DefaultValue_BasicTypes_instantiate_A_A__result_LiteralInteger6.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_A__result_LiteralInteger6.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow36::LiteralInteger37
		addToElementRepository("LiteralInteger37", DefaultValue_BasicTypes_assert_A_ObjectFlow36_LiteralInteger37);
		DefaultValue_BasicTypes_assert_A_ObjectFlow36_LiteralInteger37.setName("LiteralInteger37");
		DefaultValue_BasicTypes_assert_A_ObjectFlow36_LiteralInteger37.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow36_LiteralInteger37.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow98::LiteralInteger100
		addToElementRepository("LiteralInteger100", DefaultValue_BasicTypes_assert_A_ObjectFlow98_LiteralInteger100);
		DefaultValue_BasicTypes_assert_A_ObjectFlow98_LiteralInteger100.setName("LiteralInteger100");
		DefaultValue_BasicTypes_assert_A_ObjectFlow98_LiteralInteger100.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow98_LiteralInteger100.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow57::LiteralInteger59
		addToElementRepository("LiteralInteger59", DefaultValue_BasicTypes_assert_A_ObjectFlow57_LiteralInteger59);
		DefaultValue_BasicTypes_assert_A_ObjectFlow57_LiteralInteger59.setName("LiteralInteger59");
		DefaultValue_BasicTypes_assert_A_ObjectFlow57_LiteralInteger59.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow57_LiteralInteger59.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow73::LiteralInteger75
		addToElementRepository("LiteralInteger75", DefaultValue_BasicTypes_assert_A_ObjectFlow73_LiteralInteger75);
		DefaultValue_BasicTypes_assert_A_ObjectFlow73_LiteralInteger75.setName("LiteralInteger75");
		DefaultValue_BasicTypes_assert_A_ObjectFlow73_LiteralInteger75.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow73_LiteralInteger75.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Read a.pString_result::LiteralInteger105
		addToElementRepository("LiteralInteger105", DefaultValue_BasicTypes_assert_A_Read_a_pString_result_LiteralInteger105);
		DefaultValue_BasicTypes_assert_A_Read_a_pString_result_LiteralInteger105.setName("LiteralInteger105");
		DefaultValue_BasicTypes_assert_A_Read_a_pString_result_LiteralInteger105.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pString_result_LiteralInteger105.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Read a.pReal_object::LiteralInteger96
		addToElementRepository("LiteralInteger96", DefaultValue_BasicTypes_assert_A_Read_a_pReal_object_LiteralInteger96);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_object_LiteralInteger96.setName("LiteralInteger96");
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_object_LiteralInteger96.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_object_LiteralInteger96.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_instantiate_A_A()_target::LiteralInteger7
		addToElementRepository("LiteralInteger7", DefaultValue_BasicTypes_instantiate_A_A__target_LiteralInteger7);
		DefaultValue_BasicTypes_instantiate_A_A__target_LiteralInteger7.setName("LiteralInteger7");
		DefaultValue_BasicTypes_instantiate_A_A__target_LiteralInteger7.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_A__target_LiteralInteger7.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_main_assert_A_a::LiteralInteger27
		addToElementRepository("LiteralInteger27", DefaultValue_BasicTypes_main_assert_A_a_LiteralInteger27);
		DefaultValue_BasicTypes_main_assert_A_a_LiteralInteger27.setName("LiteralInteger27");
		DefaultValue_BasicTypes_main_assert_A_a_LiteralInteger27.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_main_assert_A_a_LiteralInteger27.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow84::LiteralInteger86
		addToElementRepository("LiteralInteger86", DefaultValue_BasicTypes_assert_A_ObjectFlow84_LiteralInteger86);
		DefaultValue_BasicTypes_assert_A_ObjectFlow84_LiteralInteger86.setName("LiteralInteger86");
		DefaultValue_BasicTypes_assert_A_ObjectFlow84_LiteralInteger86.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow84_LiteralInteger86.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Test Default Values_pString::LiteralInteger51
		addToElementRepository("LiteralInteger51", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString_LiteralInteger51);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString_LiteralInteger51.setName("LiteralInteger51");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString_LiteralInteger51.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString_LiteralInteger51.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Read a.pEnum_object::LiteralInteger79
		addToElementRepository("LiteralInteger79", DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object_LiteralInteger79);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object_LiteralInteger79.setName("LiteralInteger79");
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object_LiteralInteger79.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object_LiteralInteger79.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Test Default Values_pUnlimitedNatural::LiteralInteger52
		addToElementRepository("LiteralInteger52", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural_LiteralInteger52);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural_LiteralInteger52.setName("LiteralInteger52");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural_LiteralInteger52.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural_LiteralInteger52.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Read a.pBoolean_object::LiteralInteger34
		addToElementRepository("LiteralInteger34", DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object_LiteralInteger34);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object_LiteralInteger34.setName("LiteralInteger34");
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object_LiteralInteger34.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object_LiteralInteger34.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow63::LiteralInteger65
		addToElementRepository("LiteralInteger65", DefaultValue_BasicTypes_assert_A_ObjectFlow63_LiteralInteger65);
		DefaultValue_BasicTypes_assert_A_ObjectFlow63_LiteralInteger65.setName("LiteralInteger65");
		DefaultValue_BasicTypes_assert_A_ObjectFlow63_LiteralInteger65.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow63_LiteralInteger65.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Read a.pInteger_object::LiteralInteger91
		addToElementRepository("LiteralInteger91", DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object_LiteralInteger91);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object_LiteralInteger91.setName("LiteralInteger91");
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object_LiteralInteger91.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object_LiteralInteger91.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_A_pInteger::LiteralInteger15
		addToElementRepository("LiteralInteger15", DefaultValue_BasicTypes_A_pInteger_LiteralInteger15);
		DefaultValue_BasicTypes_A_pInteger_LiteralInteger15.setName("LiteralInteger15");
		DefaultValue_BasicTypes_A_pInteger_LiteralInteger15.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_A_pInteger_LiteralInteger15.setValue(4);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Read a.pEnum_result::LiteralInteger76
		addToElementRepository("LiteralInteger76", DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result_LiteralInteger76);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result_LiteralInteger76.setName("LiteralInteger76");
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result_LiteralInteger76.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result_LiteralInteger76.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow60::LiteralInteger61
		addToElementRepository("LiteralInteger61", DefaultValue_BasicTypes_assert_A_ObjectFlow60_LiteralInteger61);
		DefaultValue_BasicTypes_assert_A_ObjectFlow60_LiteralInteger61.setName("LiteralInteger61");
		DefaultValue_BasicTypes_assert_A_ObjectFlow60_LiteralInteger61.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow60_LiteralInteger61.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Read a.pUnlimitedNatural_result::LiteralInteger71
		addToElementRepository("LiteralInteger71", DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result_LiteralInteger71);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result_LiteralInteger71.setName("LiteralInteger71");
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result_LiteralInteger71.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result_LiteralInteger71.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow66::LiteralInteger67
		addToElementRepository("LiteralInteger67", DefaultValue_BasicTypes_assert_A_ObjectFlow66_LiteralInteger67);
		DefaultValue_BasicTypes_assert_A_ObjectFlow66_LiteralInteger67.setName("LiteralInteger67");
		DefaultValue_BasicTypes_assert_A_ObjectFlow66_LiteralInteger67.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow66_LiteralInteger67.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Test Default Values_pInteger::LiteralInteger49
		addToElementRepository("LiteralInteger49", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger_LiteralInteger49);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger_LiteralInteger49.setName("LiteralInteger49");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger_LiteralInteger49.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger_LiteralInteger49.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Test Default Values_pBoolean::LiteralInteger44
		addToElementRepository("LiteralInteger44", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean_LiteralInteger44);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean_LiteralInteger44.setName("LiteralInteger44");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean_LiteralInteger44.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean_LiteralInteger44.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_ObjectFlow39::LiteralInteger41
		addToElementRepository("LiteralInteger41", DefaultValue_BasicTypes_assert_A_ObjectFlow39_LiteralInteger41);
		DefaultValue_BasicTypes_assert_A_ObjectFlow39_LiteralInteger41.setName("LiteralInteger41");
		DefaultValue_BasicTypes_assert_A_ObjectFlow39_LiteralInteger41.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_ObjectFlow39_LiteralInteger41.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_a_node::LiteralInteger83
		addToElementRepository("LiteralInteger83", DefaultValue_BasicTypes_assert_A_a_node_LiteralInteger83);
		DefaultValue_BasicTypes_assert_A_a_node_LiteralInteger83.setName("LiteralInteger83");
		DefaultValue_BasicTypes_assert_A_a_node_LiteralInteger83.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_a_node_LiteralInteger83.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_instantiate_A_ObjectFlow9::LiteralInteger10
		addToElementRepository("LiteralInteger10", DefaultValue_BasicTypes_instantiate_A_ObjectFlow9_LiteralInteger10);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow9_LiteralInteger10.setName("LiteralInteger10");
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow9_LiteralInteger10.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow9_LiteralInteger10.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Read a.pInteger_result::LiteralInteger92
		addToElementRepository("LiteralInteger92", DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result_LiteralInteger92);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result_LiteralInteger92.setName("LiteralInteger92");
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result_LiteralInteger92.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result_LiteralInteger92.setValue(1);
		// LiteralInteger DefaultValue_BasicTypes_assert_A_Read a.pReal_result::LiteralInteger95
		addToElementRepository("LiteralInteger95", DefaultValue_BasicTypes_assert_A_Read_a_pReal_result_LiteralInteger95);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_result_LiteralInteger95.setName("LiteralInteger95");
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_result_LiteralInteger95.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_result_LiteralInteger95.setValue(1);
	}

	private void initializeLiteralReal_Instances()
	{
		// LiteralReal DefaultValue_BasicTypes_A_pReal::LiteralReal19
		addToElementRepository("LiteralReal19", DefaultValue_BasicTypes_A_pReal_LiteralReal19);
		DefaultValue_BasicTypes_A_pReal_LiteralReal19.setName("LiteralReal19");
		DefaultValue_BasicTypes_A_pReal_LiteralReal19.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_A_pReal_LiteralReal19.setValue(4.0f);
	}

	private void initializeLiteralString_Instances()
	{
		// LiteralString DefaultValue_BasicTypes_A_pString::LiteralString16
		addToElementRepository("LiteralString16", DefaultValue_BasicTypes_A_pString_LiteralString16);
		DefaultValue_BasicTypes_A_pString_LiteralString16.setName("LiteralString16");
		DefaultValue_BasicTypes_A_pString_LiteralString16.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_A_pString_LiteralString16.setValue("Hello");
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read a.pInteger_object::LiteralUnlimitedNatural90
		addToElementRepository("LiteralUnlimitedNatural90", DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object_LiteralUnlimitedNatural90);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object_LiteralUnlimitedNatural90.setName("LiteralUnlimitedNatural90");
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object_LiteralUnlimitedNatural90.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object_LiteralUnlimitedNatural90.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read a.pReal_result::LiteralUnlimitedNatural94
		addToElementRepository("LiteralUnlimitedNatural94", DefaultValue_BasicTypes_assert_A_Read_a_pReal_result_LiteralUnlimitedNatural94);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_result_LiteralUnlimitedNatural94.setName("LiteralUnlimitedNatural94");
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_result_LiteralUnlimitedNatural94.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_result_LiteralUnlimitedNatural94.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read a.pString_result::LiteralUnlimitedNatural104
		addToElementRepository("LiteralUnlimitedNatural104", DefaultValue_BasicTypes_assert_A_Read_a_pString_result_LiteralUnlimitedNatural104);
		DefaultValue_BasicTypes_assert_A_Read_a_pString_result_LiteralUnlimitedNatural104.setName("LiteralUnlimitedNatural104");
		DefaultValue_BasicTypes_assert_A_Read_a_pString_result_LiteralUnlimitedNatural104.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pString_result_LiteralUnlimitedNatural104.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read a.pString_object::LiteralUnlimitedNatural107
		addToElementRepository("LiteralUnlimitedNatural107", DefaultValue_BasicTypes_assert_A_Read_a_pString_object_LiteralUnlimitedNatural107);
		DefaultValue_BasicTypes_assert_A_Read_a_pString_object_LiteralUnlimitedNatural107.setName("LiteralUnlimitedNatural107");
		DefaultValue_BasicTypes_assert_A_Read_a_pString_object_LiteralUnlimitedNatural107.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pString_object_LiteralUnlimitedNatural107.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read a.pUnlimitedNatural_object::LiteralUnlimitedNatural69
		addToElementRepository("LiteralUnlimitedNatural69", DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object_LiteralUnlimitedNatural69);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object_LiteralUnlimitedNatural69.setName("LiteralUnlimitedNatural69");
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object_LiteralUnlimitedNatural69.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object_LiteralUnlimitedNatural69.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read a.pEnum_object::LiteralUnlimitedNatural78
		addToElementRepository("LiteralUnlimitedNatural78", DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object_LiteralUnlimitedNatural78);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object_LiteralUnlimitedNatural78.setName("LiteralUnlimitedNatural78");
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object_LiteralUnlimitedNatural78.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object_LiteralUnlimitedNatural78.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_instantiate_A_A()_result::LiteralUnlimitedNatural5
		addToElementRepository("LiteralUnlimitedNatural5", DefaultValue_BasicTypes_instantiate_A_A__result_LiteralUnlimitedNatural5);
		DefaultValue_BasicTypes_instantiate_A_A__result_LiteralUnlimitedNatural5.setName("LiteralUnlimitedNatural5");
		DefaultValue_BasicTypes_instantiate_A_A__result_LiteralUnlimitedNatural5.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_A__result_LiteralUnlimitedNatural5.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read a.pReal_object::LiteralUnlimitedNatural97
		addToElementRepository("LiteralUnlimitedNatural97", DefaultValue_BasicTypes_assert_A_Read_a_pReal_object_LiteralUnlimitedNatural97);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_object_LiteralUnlimitedNatural97.setName("LiteralUnlimitedNatural97");
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_object_LiteralUnlimitedNatural97.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_object_LiteralUnlimitedNatural97.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read a.pInteger_result::LiteralUnlimitedNatural93
		addToElementRepository("LiteralUnlimitedNatural93", DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result_LiteralUnlimitedNatural93);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result_LiteralUnlimitedNatural93.setName("LiteralUnlimitedNatural93");
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result_LiteralUnlimitedNatural93.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result_LiteralUnlimitedNatural93.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_main_assert_A_a::LiteralUnlimitedNatural26
		addToElementRepository("LiteralUnlimitedNatural26", DefaultValue_BasicTypes_main_assert_A_a_LiteralUnlimitedNatural26);
		DefaultValue_BasicTypes_main_assert_A_a_LiteralUnlimitedNatural26.setName("LiteralUnlimitedNatural26");
		DefaultValue_BasicTypes_main_assert_A_a_LiteralUnlimitedNatural26.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_main_assert_A_a_LiteralUnlimitedNatural26.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Test Default Values_pInteger::LiteralUnlimitedNatural48
		addToElementRepository("LiteralUnlimitedNatural48", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger_LiteralUnlimitedNatural48);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger_LiteralUnlimitedNatural48.setName("LiteralUnlimitedNatural48");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger_LiteralUnlimitedNatural48.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger_LiteralUnlimitedNatural48.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read a.pBoolean_result::LiteralUnlimitedNatural33
		addToElementRepository("LiteralUnlimitedNatural33", DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result_LiteralUnlimitedNatural33);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result_LiteralUnlimitedNatural33.setName("LiteralUnlimitedNatural33");
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result_LiteralUnlimitedNatural33.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result_LiteralUnlimitedNatural33.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read a.pUnlimitedNatural_result::LiteralUnlimitedNatural72
		addToElementRepository("LiteralUnlimitedNatural72", DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result_LiteralUnlimitedNatural72);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result_LiteralUnlimitedNatural72.setName("LiteralUnlimitedNatural72");
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result_LiteralUnlimitedNatural72.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result_LiteralUnlimitedNatural72.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Test Default Values_pReal::LiteralUnlimitedNatural42
		addToElementRepository("LiteralUnlimitedNatural42", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal_LiteralUnlimitedNatural42);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal_LiteralUnlimitedNatural42.setName("LiteralUnlimitedNatural42");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal_LiteralUnlimitedNatural42.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal_LiteralUnlimitedNatural42.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Test Default Values_pString::LiteralUnlimitedNatural50
		addToElementRepository("LiteralUnlimitedNatural50", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString_LiteralUnlimitedNatural50);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString_LiteralUnlimitedNatural50.setName("LiteralUnlimitedNatural50");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString_LiteralUnlimitedNatural50.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString_LiteralUnlimitedNatural50.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_instantiate_A_Create_A_result::LiteralUnlimitedNatural2
		addToElementRepository("LiteralUnlimitedNatural2", DefaultValue_BasicTypes_instantiate_A_Create_A_result_LiteralUnlimitedNatural2);
		DefaultValue_BasicTypes_instantiate_A_Create_A_result_LiteralUnlimitedNatural2.setName("LiteralUnlimitedNatural2");
		DefaultValue_BasicTypes_instantiate_A_Create_A_result_LiteralUnlimitedNatural2.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_Create_A_result_LiteralUnlimitedNatural2.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Test Default Values_pEnum::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum_LiteralUnlimitedNatural46);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum_LiteralUnlimitedNatural46.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_main_instantiate_A_a::LiteralUnlimitedNatural25
		addToElementRepository("LiteralUnlimitedNatural25", DefaultValue_BasicTypes_main_instantiate_A_a_LiteralUnlimitedNatural25);
		DefaultValue_BasicTypes_main_instantiate_A_a_LiteralUnlimitedNatural25.setName("LiteralUnlimitedNatural25");
		DefaultValue_BasicTypes_main_instantiate_A_a_LiteralUnlimitedNatural25.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_main_instantiate_A_a_LiteralUnlimitedNatural25.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read a.pEnum_result::LiteralUnlimitedNatural77
		addToElementRepository("LiteralUnlimitedNatural77", DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result_LiteralUnlimitedNatural77);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result_LiteralUnlimitedNatural77.setName("LiteralUnlimitedNatural77");
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result_LiteralUnlimitedNatural77.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result_LiteralUnlimitedNatural77.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Test Default Values_pBoolean::LiteralUnlimitedNatural45
		addToElementRepository("LiteralUnlimitedNatural45", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean_LiteralUnlimitedNatural45);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean_LiteralUnlimitedNatural45.setName("LiteralUnlimitedNatural45");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean_LiteralUnlimitedNatural45.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean_LiteralUnlimitedNatural45.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Test Default Values_pUnlimitedNatural::LiteralUnlimitedNatural53
		addToElementRepository("LiteralUnlimitedNatural53", DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural_LiteralUnlimitedNatural53);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural_LiteralUnlimitedNatural53.setName("LiteralUnlimitedNatural53");
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural_LiteralUnlimitedNatural53.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural_LiteralUnlimitedNatural53.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_assert_A_Read a.pBoolean_object::LiteralUnlimitedNatural35
		addToElementRepository("LiteralUnlimitedNatural35", DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object_LiteralUnlimitedNatural35);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object_LiteralUnlimitedNatural35.setName("LiteralUnlimitedNatural35");
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object_LiteralUnlimitedNatural35.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object_LiteralUnlimitedNatural35.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_A_pUnlimitedNatural::LiteralUnlimitedNatural18
		addToElementRepository("LiteralUnlimitedNatural18", DefaultValue_BasicTypes_A_pUnlimitedNatural_LiteralUnlimitedNatural18);
		DefaultValue_BasicTypes_A_pUnlimitedNatural_LiteralUnlimitedNatural18.setName("LiteralUnlimitedNatural18");
		DefaultValue_BasicTypes_A_pUnlimitedNatural_LiteralUnlimitedNatural18.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_A_pUnlimitedNatural_LiteralUnlimitedNatural18.setValue(-1);
		// LiteralUnlimitedNatural DefaultValue_BasicTypes_instantiate_A_A()_target::LiteralUnlimitedNatural8
		addToElementRepository("LiteralUnlimitedNatural8", DefaultValue_BasicTypes_instantiate_A_A__target_LiteralUnlimitedNatural8);
		DefaultValue_BasicTypes_instantiate_A_A__target_LiteralUnlimitedNatural8.setName("LiteralUnlimitedNatural8");
		DefaultValue_BasicTypes_instantiate_A_A__target_LiteralUnlimitedNatural8.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_A__target_LiteralUnlimitedNatural8.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow36
		addToElementRepository("ObjectFlow36", DefaultValue_BasicTypes_assert_A_ObjectFlow36);
		DefaultValue_BasicTypes_assert_A_ObjectFlow36.setName("ObjectFlow36");
		DefaultValue_BasicTypes_assert_A_ObjectFlow36.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow36.setSource(DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result);
		DefaultValue_BasicTypes_assert_A_ObjectFlow36.setTarget(DefaultValue_BasicTypes_assert_A_Test_Default_Values_pInteger);
		DefaultValue_BasicTypes_assert_A_ObjectFlow36.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow36_LiteralBoolean38);
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow39
		addToElementRepository("ObjectFlow39", DefaultValue_BasicTypes_assert_A_ObjectFlow39);
		DefaultValue_BasicTypes_assert_A_ObjectFlow39.setName("ObjectFlow39");
		DefaultValue_BasicTypes_assert_A_ObjectFlow39.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow39.setSource(DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result);
		DefaultValue_BasicTypes_assert_A_ObjectFlow39.setTarget(DefaultValue_BasicTypes_assert_A_Test_Default_Values_pUnlimitedNatural);
		DefaultValue_BasicTypes_assert_A_ObjectFlow39.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow39_LiteralBoolean40);
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow60
		addToElementRepository("ObjectFlow60", DefaultValue_BasicTypes_assert_A_ObjectFlow60);
		DefaultValue_BasicTypes_assert_A_ObjectFlow60.setName("ObjectFlow60");
		DefaultValue_BasicTypes_assert_A_ObjectFlow60.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow60.setSource(DefaultValue_BasicTypes_assert_A_Fork_a);
		DefaultValue_BasicTypes_assert_A_ObjectFlow60.setTarget(DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object);
		DefaultValue_BasicTypes_assert_A_ObjectFlow60.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow60_LiteralBoolean62);
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow54
		addToElementRepository("ObjectFlow54", DefaultValue_BasicTypes_assert_A_ObjectFlow54);
		DefaultValue_BasicTypes_assert_A_ObjectFlow54.setName("ObjectFlow54");
		DefaultValue_BasicTypes_assert_A_ObjectFlow54.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow54.setSource(DefaultValue_BasicTypes_assert_A_Fork_a);
		DefaultValue_BasicTypes_assert_A_ObjectFlow54.setTarget(DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object);
		DefaultValue_BasicTypes_assert_A_ObjectFlow54.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow54_LiteralBoolean56);
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow57
		addToElementRepository("ObjectFlow57", DefaultValue_BasicTypes_assert_A_ObjectFlow57);
		DefaultValue_BasicTypes_assert_A_ObjectFlow57.setName("ObjectFlow57");
		DefaultValue_BasicTypes_assert_A_ObjectFlow57.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow57.setSource(DefaultValue_BasicTypes_assert_A_Fork_a);
		DefaultValue_BasicTypes_assert_A_ObjectFlow57.setTarget(DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object);
		DefaultValue_BasicTypes_assert_A_ObjectFlow57.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow57_LiteralBoolean58);
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow63
		addToElementRepository("ObjectFlow63", DefaultValue_BasicTypes_assert_A_ObjectFlow63);
		DefaultValue_BasicTypes_assert_A_ObjectFlow63.setName("ObjectFlow63");
		DefaultValue_BasicTypes_assert_A_ObjectFlow63.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow63.setSource(DefaultValue_BasicTypes_assert_A_Fork_a);
		DefaultValue_BasicTypes_assert_A_ObjectFlow63.setTarget(DefaultValue_BasicTypes_assert_A_Read_a_pReal_object);
		DefaultValue_BasicTypes_assert_A_ObjectFlow63.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow63_LiteralBoolean64);
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow66
		addToElementRepository("ObjectFlow66", DefaultValue_BasicTypes_assert_A_ObjectFlow66);
		DefaultValue_BasicTypes_assert_A_ObjectFlow66.setName("ObjectFlow66");
		DefaultValue_BasicTypes_assert_A_ObjectFlow66.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow66.setSource(DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result);
		DefaultValue_BasicTypes_assert_A_ObjectFlow66.setTarget(DefaultValue_BasicTypes_assert_A_Test_Default_Values_pEnum);
		DefaultValue_BasicTypes_assert_A_ObjectFlow66.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow66_LiteralBoolean68);
		// ObjectFlow DefaultValue_BasicTypes_main::ObjectFlow29
		addToElementRepository("ObjectFlow29", DefaultValue_BasicTypes_main_ObjectFlow29);
		DefaultValue_BasicTypes_main_ObjectFlow29.setName("ObjectFlow29");
		DefaultValue_BasicTypes_main_ObjectFlow29.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_main_ObjectFlow29.setSource(DefaultValue_BasicTypes_main_instantiate_A_a);
		DefaultValue_BasicTypes_main_ObjectFlow29.setTarget(DefaultValue_BasicTypes_main_assert_A_a);
		DefaultValue_BasicTypes_main_ObjectFlow29.setGuard(DefaultValue_BasicTypes_main_ObjectFlow29_LiteralBoolean30);
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow73
		addToElementRepository("ObjectFlow73", DefaultValue_BasicTypes_assert_A_ObjectFlow73);
		DefaultValue_BasicTypes_assert_A_ObjectFlow73.setName("ObjectFlow73");
		DefaultValue_BasicTypes_assert_A_ObjectFlow73.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow73.setSource(DefaultValue_BasicTypes_assert_A_Fork_a);
		DefaultValue_BasicTypes_assert_A_ObjectFlow73.setTarget(DefaultValue_BasicTypes_assert_A_Read_a_pString_object);
		DefaultValue_BasicTypes_assert_A_ObjectFlow73.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow73_LiteralBoolean74);
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow80
		addToElementRepository("ObjectFlow80", DefaultValue_BasicTypes_assert_A_ObjectFlow80);
		DefaultValue_BasicTypes_assert_A_ObjectFlow80.setName("ObjectFlow80");
		DefaultValue_BasicTypes_assert_A_ObjectFlow80.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow80.setSource(DefaultValue_BasicTypes_assert_A_Fork_a);
		DefaultValue_BasicTypes_assert_A_ObjectFlow80.setTarget(DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object);
		DefaultValue_BasicTypes_assert_A_ObjectFlow80.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow80_LiteralBoolean82);
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow84
		addToElementRepository("ObjectFlow84", DefaultValue_BasicTypes_assert_A_ObjectFlow84);
		DefaultValue_BasicTypes_assert_A_ObjectFlow84.setName("ObjectFlow84");
		DefaultValue_BasicTypes_assert_A_ObjectFlow84.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow84.setSource(DefaultValue_BasicTypes_assert_A_Read_a_pReal_result);
		DefaultValue_BasicTypes_assert_A_ObjectFlow84.setTarget(DefaultValue_BasicTypes_assert_A_Test_Default_Values_pReal);
		DefaultValue_BasicTypes_assert_A_ObjectFlow84.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow84_LiteralBoolean85);
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow87
		addToElementRepository("ObjectFlow87", DefaultValue_BasicTypes_assert_A_ObjectFlow87);
		DefaultValue_BasicTypes_assert_A_ObjectFlow87.setName("ObjectFlow87");
		DefaultValue_BasicTypes_assert_A_ObjectFlow87.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow87.setSource(DefaultValue_BasicTypes_assert_A_Read_a_pString_result);
		DefaultValue_BasicTypes_assert_A_ObjectFlow87.setTarget(DefaultValue_BasicTypes_assert_A_Test_Default_Values_pString);
		DefaultValue_BasicTypes_assert_A_ObjectFlow87.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow87_LiteralBoolean89);
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow98
		addToElementRepository("ObjectFlow98", DefaultValue_BasicTypes_assert_A_ObjectFlow98);
		DefaultValue_BasicTypes_assert_A_ObjectFlow98.setName("ObjectFlow98");
		DefaultValue_BasicTypes_assert_A_ObjectFlow98.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow98.setSource(DefaultValue_BasicTypes_assert_A_a_node);
		DefaultValue_BasicTypes_assert_A_ObjectFlow98.setTarget(DefaultValue_BasicTypes_assert_A_Fork_a);
		DefaultValue_BasicTypes_assert_A_ObjectFlow98.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow98_LiteralBoolean99);
		// ObjectFlow DefaultValue_BasicTypes_instantiate_A::ObjectFlow9
		addToElementRepository("ObjectFlow9", DefaultValue_BasicTypes_instantiate_A_ObjectFlow9);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow9.setName("ObjectFlow9");
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow9.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow9.setSource(DefaultValue_BasicTypes_instantiate_A_A__result);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow9.setTarget(DefaultValue_BasicTypes_instantiate_A_a_node);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow9.setGuard(DefaultValue_BasicTypes_instantiate_A_ObjectFlow9_LiteralBoolean11);
		// ObjectFlow DefaultValue_BasicTypes_assert_A::ObjectFlow101
		addToElementRepository("ObjectFlow101", DefaultValue_BasicTypes_assert_A_ObjectFlow101);
		DefaultValue_BasicTypes_assert_A_ObjectFlow101.setName("ObjectFlow101");
		DefaultValue_BasicTypes_assert_A_ObjectFlow101.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_ObjectFlow101.setSource(DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result);
		DefaultValue_BasicTypes_assert_A_ObjectFlow101.setTarget(DefaultValue_BasicTypes_assert_A_Test_Default_Values_pBoolean);
		DefaultValue_BasicTypes_assert_A_ObjectFlow101.setGuard(DefaultValue_BasicTypes_assert_A_ObjectFlow101_LiteralBoolean102);
		// ObjectFlow DefaultValue_BasicTypes_instantiate_A::ObjectFlow12
		addToElementRepository("ObjectFlow12", DefaultValue_BasicTypes_instantiate_A_ObjectFlow12);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow12.setName("ObjectFlow12");
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow12.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow12.setSource(DefaultValue_BasicTypes_instantiate_A_Create_A_result);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow12.setTarget(DefaultValue_BasicTypes_instantiate_A_A__target);
		DefaultValue_BasicTypes_instantiate_A_ObjectFlow12.setGuard(DefaultValue_BasicTypes_instantiate_A_ObjectFlow12_LiteralBoolean14);
	}

	private void initializeOperation_Instances()
	{
		// Operation DefaultValue_BasicTypes_A::A_A
		addToElementRepository("A_A", DefaultValue_BasicTypes_A_A_A);
		DefaultValue_BasicTypes_A_A_A.setName("A");
		DefaultValue_BasicTypes_A_A_A.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_A_A_A.addOwnedParameter(DefaultValue_BasicTypes_A_A_A_result);
		DefaultValue_BasicTypes_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin DefaultValue_BasicTypes_instantiate_A_A()::result
		addToElementRepository("result", DefaultValue_BasicTypes_instantiate_A_A__result);
		DefaultValue_BasicTypes_instantiate_A_A__result.setName("result");
		DefaultValue_BasicTypes_instantiate_A_A__result.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_A__result.setType(DefaultValue_BasicTypes_A);
		// OutputPin DefaultValue_BasicTypes_assert_A_Read a.pEnum::result
		addToElementRepository("result", DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result.setName("result");
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result.setType(DefaultValue_BasicTypes_E);
		// OutputPin DefaultValue_BasicTypes_instantiate_A_Create_A::result
		addToElementRepository("result", DefaultValue_BasicTypes_instantiate_A_Create_A_result);
		DefaultValue_BasicTypes_instantiate_A_Create_A_result.setName("result");
		DefaultValue_BasicTypes_instantiate_A_Create_A_result.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_instantiate_A_Create_A_result.setType(DefaultValue_BasicTypes_A);
		// OutputPin DefaultValue_BasicTypes_assert_A_Read a.pBoolean::result
		addToElementRepository("result", DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result.setName("result");
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		// OutputPin DefaultValue_BasicTypes_assert_A_Read a.pReal::result
		addToElementRepository("result", DefaultValue_BasicTypes_assert_A_Read_a_pReal_result);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_result.setName("result");
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_result.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
		// OutputPin DefaultValue_BasicTypes_assert_A_Read a.pUnlimitedNatural::result
		addToElementRepository("result", DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result.setName("result");
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
		// OutputPin DefaultValue_BasicTypes_main_instantiate_A::a
		addToElementRepository("a", DefaultValue_BasicTypes_main_instantiate_A_a);
		DefaultValue_BasicTypes_main_instantiate_A_a.setName("a");
		DefaultValue_BasicTypes_main_instantiate_A_a.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_main_instantiate_A_a.setType(DefaultValue_BasicTypes_A);
		// OutputPin DefaultValue_BasicTypes_assert_A_Read a.pString::result
		addToElementRepository("result", DefaultValue_BasicTypes_assert_A_Read_a_pString_result);
		DefaultValue_BasicTypes_assert_A_Read_a_pString_result.setName("result");
		DefaultValue_BasicTypes_assert_A_Read_a_pString_result.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pString_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin DefaultValue_BasicTypes_assert_A_Read a.pInteger::result
		addToElementRepository("result", DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result.setName("result");
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport DefaultValue_BasicTypes::PackageImport21
		addToElementRepository("PackageImport21", DefaultValue_BasicTypes_PackageImport21);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter DefaultValue_BasicTypes_assert_A::a
		addToElementRepository("a", DefaultValue_BasicTypes_assert_A_a);
		DefaultValue_BasicTypes_assert_A_a.setName("a");
		DefaultValue_BasicTypes_assert_A_a.setVisibility(VisibilityKind.public_);
		// Parameter DefaultValue_BasicTypes_assert_A_testDefaultValues::pEnum
		addToElementRepository("pEnum", DefaultValue_BasicTypes_assert_A_testDefaultValues_pEnum);
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pEnum.setName("pEnum");
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pEnum.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pEnum.setType(DefaultValue_BasicTypes_E);
		// Parameter DefaultValue_BasicTypes_assert_A_testDefaultValues::pString
		addToElementRepository("pString", DefaultValue_BasicTypes_assert_A_testDefaultValues_pString);
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pString.setName("pString");
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pString.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pString.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// Parameter DefaultValue_BasicTypes_instantiate_A::a
		addToElementRepository("a", DefaultValue_BasicTypes_instantiate_A_a);
		DefaultValue_BasicTypes_instantiate_A_a.setName("a");
		DefaultValue_BasicTypes_instantiate_A_a.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_instantiate_A_a.setType(DefaultValue_BasicTypes_A);
		DefaultValue_BasicTypes_instantiate_A_a.setDirection(ParameterDirectionKind.return_);
		// Parameter DefaultValue_BasicTypes_assert_A_testDefaultValues::pReal
		addToElementRepository("pReal", DefaultValue_BasicTypes_assert_A_testDefaultValues_pReal);
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pReal.setName("pReal");
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pReal.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pReal.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
		// Parameter DefaultValue_BasicTypes_assert_A_testDefaultValues::pInteger
		addToElementRepository("pInteger", DefaultValue_BasicTypes_assert_A_testDefaultValues_pInteger);
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pInteger.setName("pInteger");
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pInteger.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pInteger.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter DefaultValue_BasicTypes_A_A_A::result
		addToElementRepository("result", DefaultValue_BasicTypes_A_A_A_result);
		DefaultValue_BasicTypes_A_A_A_result.setName("result");
		DefaultValue_BasicTypes_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_A_A_A_result.setType(DefaultValue_BasicTypes_A);
		DefaultValue_BasicTypes_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter DefaultValue_BasicTypes_assert_A_testDefaultValues::pUnlimitedNatural
		addToElementRepository("pUnlimitedNatural", DefaultValue_BasicTypes_assert_A_testDefaultValues_pUnlimitedNatural);
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pUnlimitedNatural.setName("pUnlimitedNatural");
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pUnlimitedNatural.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pUnlimitedNatural.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
		// Parameter DefaultValue_BasicTypes_assert_A_testDefaultValues::pBoolean
		addToElementRepository("pBoolean", DefaultValue_BasicTypes_assert_A_testDefaultValues_pBoolean);
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pBoolean.setName("pBoolean");
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pBoolean.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_assert_A_testDefaultValues_pBoolean.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
	}

	private void initializeProperty_Instances()
	{
		// Property DefaultValue_BasicTypes_A::pInteger
		addToElementRepository("pInteger", DefaultValue_BasicTypes_A_pInteger);
		DefaultValue_BasicTypes_A_pInteger.setName("pInteger");
		DefaultValue_BasicTypes_A_pInteger.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_A_pInteger.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		DefaultValue_BasicTypes_A_pInteger.setDefaultValue(DefaultValue_BasicTypes_A_pInteger_LiteralInteger15);
		// Property DefaultValue_BasicTypes_A::pString
		addToElementRepository("pString", DefaultValue_BasicTypes_A_pString);
		DefaultValue_BasicTypes_A_pString.setName("pString");
		DefaultValue_BasicTypes_A_pString.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_A_pString.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		DefaultValue_BasicTypes_A_pString.setDefaultValue(DefaultValue_BasicTypes_A_pString_LiteralString16);
		// Property DefaultValue_BasicTypes_A::pBoolean
		addToElementRepository("pBoolean", DefaultValue_BasicTypes_A_pBoolean);
		DefaultValue_BasicTypes_A_pBoolean.setName("pBoolean");
		DefaultValue_BasicTypes_A_pBoolean.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_A_pBoolean.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
		DefaultValue_BasicTypes_A_pBoolean.setDefaultValue(DefaultValue_BasicTypes_A_pBoolean_LiteralBoolean17);
		// Property DefaultValue_BasicTypes_A::pUnlimitedNatural
		addToElementRepository("pUnlimitedNatural", DefaultValue_BasicTypes_A_pUnlimitedNatural);
		DefaultValue_BasicTypes_A_pUnlimitedNatural.setName("pUnlimitedNatural");
		DefaultValue_BasicTypes_A_pUnlimitedNatural.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_A_pUnlimitedNatural.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
		DefaultValue_BasicTypes_A_pUnlimitedNatural.setDefaultValue(DefaultValue_BasicTypes_A_pUnlimitedNatural_LiteralUnlimitedNatural18);
		// Property DefaultValue_BasicTypes_A::pEnum
		addToElementRepository("pEnum", DefaultValue_BasicTypes_A_pEnum);
		DefaultValue_BasicTypes_A_pEnum.setName("pEnum");
		DefaultValue_BasicTypes_A_pEnum.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_A_pEnum.setType(DefaultValue_BasicTypes_E);
		DefaultValue_BasicTypes_A_pEnum.setDefaultValue(DefaultValue_BasicTypes_A_pEnum_InstanceValue20);
		// Property DefaultValue_BasicTypes_A::pReal
		addToElementRepository("pReal", DefaultValue_BasicTypes_A_pReal);
		DefaultValue_BasicTypes_A_pReal.setName("pReal");
		DefaultValue_BasicTypes_A_pReal.setVisibility(VisibilityKind.public_);
		
		DefaultValue_BasicTypes_A_pReal.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
		DefaultValue_BasicTypes_A_pReal.setDefaultValue(DefaultValue_BasicTypes_A_pReal_LiteralReal19);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction DefaultValue_BasicTypes_assert_A::Read a.pEnum
		addToElementRepository("Read a.pEnum", DefaultValue_BasicTypes_assert_A_Read_a_pEnum);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum.setName("Read a.pEnum");
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum.setStructuralFeature(DefaultValue_BasicTypes_A_pEnum);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum.setObject(DefaultValue_BasicTypes_assert_A_Read_a_pEnum_object);
		DefaultValue_BasicTypes_assert_A_Read_a_pEnum.setResult(DefaultValue_BasicTypes_assert_A_Read_a_pEnum_result);
		// ReadStructuralFeatureAction DefaultValue_BasicTypes_assert_A::Read a.pBoolean
		addToElementRepository("Read a.pBoolean", DefaultValue_BasicTypes_assert_A_Read_a_pBoolean);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean.setName("Read a.pBoolean");
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean.setStructuralFeature(DefaultValue_BasicTypes_A_pBoolean);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean.setObject(DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_object);
		DefaultValue_BasicTypes_assert_A_Read_a_pBoolean.setResult(DefaultValue_BasicTypes_assert_A_Read_a_pBoolean_result);
		// ReadStructuralFeatureAction DefaultValue_BasicTypes_assert_A::Read a.pInteger
		addToElementRepository("Read a.pInteger", DefaultValue_BasicTypes_assert_A_Read_a_pInteger);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger.setName("Read a.pInteger");
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger.setStructuralFeature(DefaultValue_BasicTypes_A_pInteger);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger.setObject(DefaultValue_BasicTypes_assert_A_Read_a_pInteger_object);
		DefaultValue_BasicTypes_assert_A_Read_a_pInteger.setResult(DefaultValue_BasicTypes_assert_A_Read_a_pInteger_result);
		// ReadStructuralFeatureAction DefaultValue_BasicTypes_assert_A::Read a.pReal
		addToElementRepository("Read a.pReal", DefaultValue_BasicTypes_assert_A_Read_a_pReal);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal.setName("Read a.pReal");
		DefaultValue_BasicTypes_assert_A_Read_a_pReal.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal.setStructuralFeature(DefaultValue_BasicTypes_A_pReal);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal.setObject(DefaultValue_BasicTypes_assert_A_Read_a_pReal_object);
		DefaultValue_BasicTypes_assert_A_Read_a_pReal.setResult(DefaultValue_BasicTypes_assert_A_Read_a_pReal_result);
		// ReadStructuralFeatureAction DefaultValue_BasicTypes_assert_A::Read a.pUnlimitedNatural
		addToElementRepository("Read a.pUnlimitedNatural", DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural.setName("Read a.pUnlimitedNatural");
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural.setStructuralFeature(DefaultValue_BasicTypes_A_pUnlimitedNatural);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural.setObject(DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_object);
		DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural.setResult(DefaultValue_BasicTypes_assert_A_Read_a_pUnlimitedNatural_result);
		// ReadStructuralFeatureAction DefaultValue_BasicTypes_assert_A::Read a.pString
		addToElementRepository("Read a.pString", DefaultValue_BasicTypes_assert_A_Read_a_pString);
		DefaultValue_BasicTypes_assert_A_Read_a_pString.setName("Read a.pString");
		DefaultValue_BasicTypes_assert_A_Read_a_pString.setVisibility(VisibilityKind.public_);
		DefaultValue_BasicTypes_assert_A_Read_a_pString.setStructuralFeature(DefaultValue_BasicTypes_A_pString);
		DefaultValue_BasicTypes_assert_A_Read_a_pString.setObject(DefaultValue_BasicTypes_assert_A_Read_a_pString_object);
		DefaultValue_BasicTypes_assert_A_Read_a_pString.setResult(DefaultValue_BasicTypes_assert_A_Read_a_pString_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // DefaultValue_BasicTypesModel
