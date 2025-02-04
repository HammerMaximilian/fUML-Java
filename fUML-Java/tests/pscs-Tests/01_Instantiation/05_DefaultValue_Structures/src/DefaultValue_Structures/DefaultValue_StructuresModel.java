/*
 * DefaultValue_StructuresModel.java
 * 
 * Auto-generated file
 */
package DefaultValue_Structures;

import uml.values.LiteralBoolean;
import uml.values.LiteralUnlimitedNatural;
import uml.actions.OutputPin;
import uml.activities.Activity;
import uml.actions.ReadStructuralFeatureAction;
import uml.actions.CallOperationAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.commonstructure.Comment;
import uml.classification.Parameter;
import uml.classification.Operation;
import uml.activities.ActivityParameterNode;
import uml.commonstructure.PackageImport;
import uml.classification.AggregationKind;
import uml.activities.ControlFlow;
import uml.actions.CreateObjectAction;
import uml.actions.ValueSpecificationAction;
import uml.commonbehavior.FunctionBehavior;
import uml.actions.CallBehaviorAction;
import uml.values.OpaqueExpression;
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


/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class DefaultValue_StructuresModel extends InMemoryModel
{
	private static DefaultValue_StructuresModel instance;

	/*
	 * Model DefaultValue_Structures
	 */
	public Package DefaultValue_Structures = new Package();
		public Comment DefaultValue_Structures_Comment0 = new Comment();
		public Activity DefaultValue_Structures_assert_A = new Activity();
			public CallBehaviorAction DefaultValue_Structures_assert_A_Test_Default_Values = new CallBehaviorAction();
				public InputPin DefaultValue_Structures_assert_A_Test_Default_Values_pList = new InputPin();
					public LiteralInteger DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralInteger1 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralUnlimitedNatural2 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralInteger3 = new LiteralInteger();
			public ObjectFlow DefaultValue_Structures_assert_A_ObjectFlow4 = new ObjectFlow();
				public LiteralInteger DefaultValue_Structures_assert_A_ObjectFlow4_LiteralInteger5 = new LiteralInteger();
				public LiteralBoolean DefaultValue_Structures_assert_A_ObjectFlow4_LiteralBoolean6 = new LiteralBoolean();
			public OpaqueBehavior DefaultValue_Structures_assert_A_testDefaultValues = new OpaqueBehavior();
				public Parameter DefaultValue_Structures_assert_A_testDefaultValues_pList = new Parameter();
					public LiteralInteger DefaultValue_Structures_assert_A_testDefaultValues_pList_LiteralInteger7 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_Structures_assert_A_testDefaultValues_pList_LiteralUnlimitedNatural8 = new LiteralUnlimitedNatural();
			public Parameter DefaultValue_Structures_assert_A_a = new Parameter();
			public ObjectFlow DefaultValue_Structures_assert_A_ObjectFlow9 = new ObjectFlow();
				public LiteralBoolean DefaultValue_Structures_assert_A_ObjectFlow9_LiteralBoolean10 = new LiteralBoolean();
				public LiteralInteger DefaultValue_Structures_assert_A_ObjectFlow9_LiteralInteger11 = new LiteralInteger();
			public ActivityParameterNode DefaultValue_Structures_assert_A_a_node = new ActivityParameterNode();
				public LiteralInteger DefaultValue_Structures_assert_A_a_node_LiteralInteger12 = new LiteralInteger();
			public ReadStructuralFeatureAction DefaultValue_Structures_assert_A_Read_b_p = new ReadStructuralFeatureAction();
				public OutputPin DefaultValue_Structures_assert_A_Read_b_p_result = new OutputPin();
					public LiteralUnlimitedNatural DefaultValue_Structures_assert_A_Read_b_p_result_LiteralUnlimitedNatural13 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_Structures_assert_A_Read_b_p_result_LiteralInteger14 = new LiteralInteger();
				public InputPin DefaultValue_Structures_assert_A_Read_b_p_object = new InputPin();
					public LiteralUnlimitedNatural DefaultValue_Structures_assert_A_Read_b_p_object_LiteralUnlimitedNatural15 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_Structures_assert_A_Read_b_p_object_LiteralInteger16 = new LiteralInteger();
			public ObjectFlow DefaultValue_Structures_assert_A_ObjectFlow17 = new ObjectFlow();
				public LiteralBoolean DefaultValue_Structures_assert_A_ObjectFlow17_LiteralBoolean18 = new LiteralBoolean();
				public LiteralInteger DefaultValue_Structures_assert_A_ObjectFlow17_LiteralInteger19 = new LiteralInteger();
			public ReadStructuralFeatureAction DefaultValue_Structures_assert_A_Read_a_b = new ReadStructuralFeatureAction();
				public OutputPin DefaultValue_Structures_assert_A_Read_a_b_result = new OutputPin();
					public LiteralUnlimitedNatural DefaultValue_Structures_assert_A_Read_a_b_result_LiteralUnlimitedNatural20 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_Structures_assert_A_Read_a_b_result_LiteralInteger21 = new LiteralInteger();
				public InputPin DefaultValue_Structures_assert_A_Read_a_b_object = new InputPin();
					public LiteralInteger DefaultValue_Structures_assert_A_Read_a_b_object_LiteralInteger22 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_Structures_assert_A_Read_a_b_object_LiteralUnlimitedNatural23 = new LiteralUnlimitedNatural();
		public Class_ DefaultValue_Structures_A = new Class_();
			public Property DefaultValue_Structures_A_b = new Property();
				public OpaqueExpression DefaultValue_Structures_A_b_OpaqueExpression24 = new OpaqueExpression();
				public LiteralUnlimitedNatural DefaultValue_Structures_A_b_LiteralUnlimitedNatural25 = new LiteralUnlimitedNatural();
				public LiteralInteger DefaultValue_Structures_A_b_LiteralInteger26 = new LiteralInteger();
			public Operation DefaultValue_Structures_A_A_A = new Operation();
				public Parameter DefaultValue_Structures_A_A_A_result = new Parameter();
			public Activity DefaultValue_Structures_A_bDefaultValues = new Activity();
				public ObjectFlow DefaultValue_Structures_A_bDefaultValues_ObjectFlow27 = new ObjectFlow();
					public LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow27_LiteralBoolean28 = new LiteralBoolean();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow27_LiteralInteger29 = new LiteralInteger();
				public ObjectFlow DefaultValue_Structures_A_bDefaultValues_ObjectFlow30 = new ObjectFlow();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow30_LiteralInteger31 = new LiteralInteger();
					public LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow30_LiteralBoolean32 = new LiteralBoolean();
				public ObjectFlow DefaultValue_Structures_A_bDefaultValues_ObjectFlow33 = new ObjectFlow();
					public LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow33_LiteralBoolean34 = new LiteralBoolean();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow33_LiteralInteger35 = new LiteralInteger();
				public AddStructuralFeatureValueAction DefaultValue_Structures_A_bDefaultValues_B_3_p = new AddStructuralFeatureValueAction();
					public InputPin DefaultValue_Structures_A_bDefaultValues_B_3_p_value = new InputPin();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_3_p_value_LiteralInteger36 = new LiteralInteger();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_3_p_value_LiteralUnlimitedNatural37 = new LiteralUnlimitedNatural();
					public OutputPin DefaultValue_Structures_A_bDefaultValues_B_3_p_result = new OutputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_3_p_result_LiteralUnlimitedNatural38 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_3_p_result_LiteralInteger39 = new LiteralInteger();
					public InputPin DefaultValue_Structures_A_bDefaultValues_B_3_p_object = new InputPin();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_3_p_object_LiteralInteger40 = new LiteralInteger();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_3_p_object_LiteralUnlimitedNatural41 = new LiteralUnlimitedNatural();
				public CreateObjectAction DefaultValue_Structures_A_bDefaultValues_Create_B_2 = new CreateObjectAction();
					public OutputPin DefaultValue_Structures_A_bDefaultValues_Create_B_2_result = new OutputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Create_B_2_result_LiteralUnlimitedNatural42 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_Create_B_2_result_LiteralInteger43 = new LiteralInteger();
				public ObjectFlow DefaultValue_Structures_A_bDefaultValues_ObjectFlow44 = new ObjectFlow();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow44_LiteralInteger45 = new LiteralInteger();
					public LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow44_LiteralBoolean46 = new LiteralBoolean();
				public ObjectFlow DefaultValue_Structures_A_bDefaultValues_ObjectFlow47 = new ObjectFlow();
					public LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow47_LiteralBoolean48 = new LiteralBoolean();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow47_LiteralInteger49 = new LiteralInteger();
				public ObjectFlow DefaultValue_Structures_A_bDefaultValues_ObjectFlow50 = new ObjectFlow();
					public LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow50_LiteralBoolean51 = new LiteralBoolean();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow50_LiteralInteger52 = new LiteralInteger();
				public ControlFlow DefaultValue_Structures_A_bDefaultValues_ControlFlow53 = new ControlFlow();
				public ObjectFlow DefaultValue_Structures_A_bDefaultValues_ObjectFlow54 = new ObjectFlow();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow54_LiteralInteger55 = new LiteralInteger();
					public LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow54_LiteralBoolean56 = new LiteralBoolean();
				public ControlFlow DefaultValue_Structures_A_bDefaultValues_ControlFlow57 = new ControlFlow();
				public ValueSpecificationAction DefaultValue_Structures_A_bDefaultValues_Integer_2 = new ValueSpecificationAction();
					public OutputPin DefaultValue_Structures_A_bDefaultValues_Integer_2_result = new OutputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Integer_2_result_LiteralUnlimitedNatural58 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer_2_result_LiteralInteger59 = new LiteralInteger();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer_2_LiteralInteger60 = new LiteralInteger();
				public ValueSpecificationAction DefaultValue_Structures_A_bDefaultValues_Integer_4 = new ValueSpecificationAction();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer_4_LiteralInteger61 = new LiteralInteger();
					public OutputPin DefaultValue_Structures_A_bDefaultValues_Integer_4_result = new OutputPin();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer_4_result_LiteralInteger62 = new LiteralInteger();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Integer_4_result_LiteralUnlimitedNatural63 = new LiteralUnlimitedNatural();
				public AddStructuralFeatureValueAction DefaultValue_Structures_A_bDefaultValues_B_2_p = new AddStructuralFeatureValueAction();
					public OutputPin DefaultValue_Structures_A_bDefaultValues_B_2_p_result = new OutputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_2_p_result_LiteralUnlimitedNatural64 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_2_p_result_LiteralInteger65 = new LiteralInteger();
					public InputPin DefaultValue_Structures_A_bDefaultValues_B_2_p_object = new InputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_2_p_object_LiteralUnlimitedNatural66 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_2_p_object_LiteralInteger67 = new LiteralInteger();
					public InputPin DefaultValue_Structures_A_bDefaultValues_B_2_p_value = new InputPin();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_2_p_value_LiteralInteger68 = new LiteralInteger();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_2_p_value_LiteralUnlimitedNatural69 = new LiteralUnlimitedNatural();
				public ObjectFlow DefaultValue_Structures_A_bDefaultValues_ObjectFlow70 = new ObjectFlow();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow70_LiteralInteger71 = new LiteralInteger();
					public LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow70_LiteralBoolean72 = new LiteralBoolean();
				public ObjectFlow DefaultValue_Structures_A_bDefaultValues_ObjectFlow73 = new ObjectFlow();
					public LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow73_LiteralBoolean74 = new LiteralBoolean();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow73_LiteralInteger75 = new LiteralInteger();
				public ObjectFlow DefaultValue_Structures_A_bDefaultValues_ObjectFlow76 = new ObjectFlow();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow76_LiteralInteger77 = new LiteralInteger();
					public LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow76_LiteralBoolean78 = new LiteralBoolean();
				public ControlFlow DefaultValue_Structures_A_bDefaultValues_ControlFlow79 = new ControlFlow();
				public ValueSpecificationAction DefaultValue_Structures_A_bDefaultValues_Integer_3 = new ValueSpecificationAction();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer_3_LiteralInteger80 = new LiteralInteger();
					public OutputPin DefaultValue_Structures_A_bDefaultValues_Integer_3_result = new OutputPin();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer_3_result_LiteralInteger81 = new LiteralInteger();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Integer_3_result_LiteralUnlimitedNatural82 = new LiteralUnlimitedNatural();
				public AddStructuralFeatureValueAction DefaultValue_Structures_A_bDefaultValues_B_4_p = new AddStructuralFeatureValueAction();
					public InputPin DefaultValue_Structures_A_bDefaultValues_B_4_p_object = new InputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_4_p_object_LiteralUnlimitedNatural83 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_4_p_object_LiteralInteger84 = new LiteralInteger();
					public InputPin DefaultValue_Structures_A_bDefaultValues_B_4_p_value = new InputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_4_p_value_LiteralUnlimitedNatural85 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_4_p_value_LiteralInteger86 = new LiteralInteger();
					public OutputPin DefaultValue_Structures_A_bDefaultValues_B_4_p_result = new OutputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_4_p_result_LiteralUnlimitedNatural87 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_4_p_result_LiteralInteger88 = new LiteralInteger();
				public CreateObjectAction DefaultValue_Structures_A_bDefaultValues_Create_B_4 = new CreateObjectAction();
					public OutputPin DefaultValue_Structures_A_bDefaultValues_Create_B_4_result = new OutputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Create_B_4_result_LiteralUnlimitedNatural89 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_Create_B_4_result_LiteralInteger90 = new LiteralInteger();
				public ObjectFlow DefaultValue_Structures_A_bDefaultValues_ObjectFlow91 = new ObjectFlow();
					public LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow91_LiteralBoolean92 = new LiteralBoolean();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow91_LiteralInteger93 = new LiteralInteger();
				public AddStructuralFeatureValueAction DefaultValue_Structures_A_bDefaultValues_B_1_p = new AddStructuralFeatureValueAction();
					public InputPin DefaultValue_Structures_A_bDefaultValues_B_1_p_value = new InputPin();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_1_p_value_LiteralInteger94 = new LiteralInteger();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_1_p_value_LiteralUnlimitedNatural95 = new LiteralUnlimitedNatural();
					public InputPin DefaultValue_Structures_A_bDefaultValues_B_1_p_object = new InputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_1_p_object_LiteralUnlimitedNatural96 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_1_p_object_LiteralInteger97 = new LiteralInteger();
					public OutputPin DefaultValue_Structures_A_bDefaultValues_B_1_p_result = new OutputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_1_p_result_LiteralUnlimitedNatural98 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_1_p_result_LiteralInteger99 = new LiteralInteger();
				public Parameter DefaultValue_Structures_A_bDefaultValues_bList = new Parameter();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_bList_LiteralInteger100 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_bList_LiteralUnlimitedNatural101 = new LiteralUnlimitedNatural();
				public CreateObjectAction DefaultValue_Structures_A_bDefaultValues_Create_B_1 = new CreateObjectAction();
					public OutputPin DefaultValue_Structures_A_bDefaultValues_Create_B_1_result = new OutputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Create_B_1_result_LiteralUnlimitedNatural102 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_Create_B_1_result_LiteralInteger103 = new LiteralInteger();
				public ObjectFlow DefaultValue_Structures_A_bDefaultValues_ObjectFlow104 = new ObjectFlow();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow104_LiteralInteger105 = new LiteralInteger();
					public LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow104_LiteralBoolean106 = new LiteralBoolean();
				public ActivityParameterNode DefaultValue_Structures_A_bDefaultValues_bList_node = new ActivityParameterNode();
				public CreateObjectAction DefaultValue_Structures_A_bDefaultValues_Create_B_3 = new CreateObjectAction();
					public OutputPin DefaultValue_Structures_A_bDefaultValues_Create_B_3_result = new OutputPin();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Create_B_3_result_LiteralUnlimitedNatural107 = new LiteralUnlimitedNatural();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_Create_B_3_result_LiteralInteger108 = new LiteralInteger();
				public ValueSpecificationAction DefaultValue_Structures_A_bDefaultValues_Integer_1 = new ValueSpecificationAction();
					public OutputPin DefaultValue_Structures_A_bDefaultValues_Integer_1_result = new OutputPin();
						public LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer_1_result_LiteralInteger109 = new LiteralInteger();
						public LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Integer_1_result_LiteralUnlimitedNatural110 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer_1_LiteralInteger111 = new LiteralInteger();
		public Class_ DefaultValue_Structures_B = new Class_();
			public Property DefaultValue_Structures_B_p = new Property();
			public Operation DefaultValue_Structures_B_B_B = new Operation();
				public Parameter DefaultValue_Structures_B_B_B_result = new Parameter();
		public PackageImport DefaultValue_Structures_PackageImport112 = new PackageImport();
			public Comment DefaultValue_Structures_PackageImport112_Comment113 = new Comment();
		public Activity DefaultValue_Structures_main = new Activity();
			public ObjectFlow DefaultValue_Structures_main_ObjectFlow114 = new ObjectFlow();
				public LiteralBoolean DefaultValue_Structures_main_ObjectFlow114_LiteralBoolean115 = new LiteralBoolean();
				public LiteralInteger DefaultValue_Structures_main_ObjectFlow114_LiteralInteger116 = new LiteralInteger();
			public CallBehaviorAction DefaultValue_Structures_main_assert_A = new CallBehaviorAction();
				public InputPin DefaultValue_Structures_main_assert_A_a = new InputPin();
					public LiteralInteger DefaultValue_Structures_main_assert_A_a_LiteralInteger117 = new LiteralInteger();
					public LiteralInteger DefaultValue_Structures_main_assert_A_a_LiteralInteger118 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_Structures_main_assert_A_a_LiteralUnlimitedNatural119 = new LiteralUnlimitedNatural();
			public CallBehaviorAction DefaultValue_Structures_main_instantiate_A = new CallBehaviorAction();
				public OutputPin DefaultValue_Structures_main_instantiate_A_a = new OutputPin();
					public LiteralInteger DefaultValue_Structures_main_instantiate_A_a_LiteralInteger120 = new LiteralInteger();
					public LiteralInteger DefaultValue_Structures_main_instantiate_A_a_LiteralInteger121 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_Structures_main_instantiate_A_a_LiteralUnlimitedNatural122 = new LiteralUnlimitedNatural();
		public Activity DefaultValue_Structures_instantiate_A = new Activity();
			public CreateObjectAction DefaultValue_Structures_instantiate_A_Create_A = new CreateObjectAction();
				public OutputPin DefaultValue_Structures_instantiate_A_Create_A_result = new OutputPin();
					public LiteralUnlimitedNatural DefaultValue_Structures_instantiate_A_Create_A_result_LiteralUnlimitedNatural123 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_Structures_instantiate_A_Create_A_result_LiteralInteger124 = new LiteralInteger();
			public CallOperationAction DefaultValue_Structures_instantiate_A_A_ = new CallOperationAction();
				public InputPin DefaultValue_Structures_instantiate_A_A__target = new InputPin();
					public LiteralInteger DefaultValue_Structures_instantiate_A_A__target_LiteralInteger125 = new LiteralInteger();
					public LiteralUnlimitedNatural DefaultValue_Structures_instantiate_A_A__target_LiteralUnlimitedNatural126 = new LiteralUnlimitedNatural();
				public OutputPin DefaultValue_Structures_instantiate_A_A__result = new OutputPin();
					public LiteralUnlimitedNatural DefaultValue_Structures_instantiate_A_A__result_LiteralUnlimitedNatural127 = new LiteralUnlimitedNatural();
					public LiteralInteger DefaultValue_Structures_instantiate_A_A__result_LiteralInteger128 = new LiteralInteger();
					public LiteralInteger DefaultValue_Structures_instantiate_A_A__result_LiteralInteger129 = new LiteralInteger();
			public ObjectFlow DefaultValue_Structures_instantiate_A_ObjectFlow130 = new ObjectFlow();
				public LiteralBoolean DefaultValue_Structures_instantiate_A_ObjectFlow130_LiteralBoolean131 = new LiteralBoolean();
				public LiteralInteger DefaultValue_Structures_instantiate_A_ObjectFlow130_LiteralInteger132 = new LiteralInteger();
			public Parameter DefaultValue_Structures_instantiate_A_a = new Parameter();
			public ObjectFlow DefaultValue_Structures_instantiate_A_ObjectFlow133 = new ObjectFlow();
				public LiteralInteger DefaultValue_Structures_instantiate_A_ObjectFlow133_LiteralInteger134 = new LiteralInteger();
				public LiteralBoolean DefaultValue_Structures_instantiate_A_ObjectFlow133_LiteralBoolean135 = new LiteralBoolean();
			public ActivityParameterNode DefaultValue_Structures_instantiate_A_a_node = new ActivityParameterNode();
				public LiteralInteger DefaultValue_Structures_instantiate_A_a_node_LiteralInteger136 = new LiteralInteger();

	public static DefaultValue_StructuresModel instance()
	{
		if (instance == null)
        {
            instance = new DefaultValue_StructuresModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public DefaultValue_StructuresModel()
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
		this.initializeCallBehaviorAction_Instances();
		this.initializeCallOperationAction_Instances();
		this.initializeClass_Instances();
		this.initializeComment_Instances();
		this.initializeControlFlow_Instances();
		this.initializeCreateObjectAction_Instances();
		this.initializeFunctionBehavior_Instances();
		this.initializeInputPin_Instances();
		this.initializeLiteralBoolean_Instances();
		this.initializeLiteralInteger_Instances();
		this.initializeLiteralUnlimitedNatural_Instances();
		this.initializeObjectFlow_Instances();
		this.initializeOpaqueExpression_Instances();
		this.initializeOperation_Instances();
		this.initializeOutputPin_Instances();
		this.initializePackageImport_Instances();
		this.initializeParameter_Instances();
		this.initializeProperty_Instances();
		this.initializeReadStructuralFeatureAction_Instances();
		this.initializeValueSpecificationAction_Instances();
	}

	private void initializeActivity_Instances()
	{
		// Activity DefaultValue_Structures::assert_A
		addToElementRepository("assert_A", DefaultValue_Structures_assert_A);
		DefaultValue_Structures_assert_A.setName("assert_A");
		DefaultValue_Structures_assert_A.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A.addOwnedBehavior(DefaultValue_Structures_assert_A_testDefaultValues);
		DefaultValue_Structures_assert_A.addOwnedParameter(DefaultValue_Structures_assert_A_a);
		DefaultValue_Structures_assert_A.addNode(DefaultValue_Structures_assert_A_Test_Default_Values);
		DefaultValue_Structures_assert_A.addNode(DefaultValue_Structures_assert_A_a_node);
		DefaultValue_Structures_assert_A.addNode(DefaultValue_Structures_assert_A_Read_b_p);
		DefaultValue_Structures_assert_A.addNode(DefaultValue_Structures_assert_A_Read_a_b);
		DefaultValue_Structures_assert_A.addEdge(DefaultValue_Structures_assert_A_ObjectFlow4);
		DefaultValue_Structures_assert_A.addEdge(DefaultValue_Structures_assert_A_ObjectFlow9);
		DefaultValue_Structures_assert_A.addEdge(DefaultValue_Structures_assert_A_ObjectFlow17);
		// Activity DefaultValue_Structures_A::bDefaultValues
		addToElementRepository("bDefaultValues", DefaultValue_Structures_A_bDefaultValues);
		DefaultValue_Structures_A_bDefaultValues.setName("bDefaultValues");
		DefaultValue_Structures_A_bDefaultValues.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues.addOwnedParameter(DefaultValue_Structures_A_bDefaultValues_bList);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_B_2_p);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_Integer_3);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_B_4_p);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_Create_B_4);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_B_3_p);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_Create_B_2);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_B_1_p);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_Create_B_1);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_Integer_2);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_Integer_4);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_bList_node);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_Create_B_3);
		DefaultValue_Structures_A_bDefaultValues.addNode(DefaultValue_Structures_A_bDefaultValues_Integer_1);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ObjectFlow27);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ObjectFlow70);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ObjectFlow73);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ObjectFlow30);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ObjectFlow76);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ControlFlow79);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ObjectFlow33);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ObjectFlow91);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ObjectFlow44);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ObjectFlow47);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ObjectFlow50);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ControlFlow53);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ObjectFlow54);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ObjectFlow104);
		DefaultValue_Structures_A_bDefaultValues.addEdge(DefaultValue_Structures_A_bDefaultValues_ControlFlow57);
		// Activity DefaultValue_Structures::main
		addToElementRepository("main", DefaultValue_Structures_main);
		DefaultValue_Structures_main.setName("main");
		DefaultValue_Structures_main.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_main.addNode(DefaultValue_Structures_main_assert_A);
		DefaultValue_Structures_main.addNode(DefaultValue_Structures_main_instantiate_A);
		DefaultValue_Structures_main.addEdge(DefaultValue_Structures_main_ObjectFlow114);
		// Activity DefaultValue_Structures::instantiate_A
		addToElementRepository("instantiate_A", DefaultValue_Structures_instantiate_A);
		DefaultValue_Structures_instantiate_A.setName("instantiate_A");
		DefaultValue_Structures_instantiate_A.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_instantiate_A.addOwnedParameter(DefaultValue_Structures_instantiate_A_a);
		DefaultValue_Structures_instantiate_A.addNode(DefaultValue_Structures_instantiate_A_Create_A);
		DefaultValue_Structures_instantiate_A.addNode(DefaultValue_Structures_instantiate_A_A_);
		DefaultValue_Structures_instantiate_A.addNode(DefaultValue_Structures_instantiate_A_a_node);
		DefaultValue_Structures_instantiate_A.addEdge(DefaultValue_Structures_instantiate_A_ObjectFlow130);
		DefaultValue_Structures_instantiate_A.addEdge(DefaultValue_Structures_instantiate_A_ObjectFlow133);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode DefaultValue_Structures_assert_A::a_node
		addToElementRepository("a_node", DefaultValue_Structures_assert_A_a_node);
		DefaultValue_Structures_assert_A_a_node.setName("a_node");
		DefaultValue_Structures_assert_A_a_node.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_assert_A_a_node.setParameter(DefaultValue_Structures_assert_A_a);
		// ActivityParameterNode DefaultValue_Structures_A_bDefaultValues::bList_node
		addToElementRepository("bList_node", DefaultValue_Structures_A_bDefaultValues_bList_node);
		DefaultValue_Structures_A_bDefaultValues_bList_node.setName("bList_node");
		DefaultValue_Structures_A_bDefaultValues_bList_node.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_bList_node.setParameter(DefaultValue_Structures_A_bDefaultValues_bList);
		// ActivityParameterNode DefaultValue_Structures_instantiate_A::a_node
		addToElementRepository("a_node", DefaultValue_Structures_instantiate_A_a_node);
		DefaultValue_Structures_instantiate_A_a_node.setName("a_node");
		DefaultValue_Structures_instantiate_A_a_node.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_instantiate_A_a_node.setParameter(DefaultValue_Structures_instantiate_A_a);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction DefaultValue_Structures_A_bDefaultValues::B_2.p
		addToElementRepository("B_2.p", DefaultValue_Structures_A_bDefaultValues_B_2_p);
		DefaultValue_Structures_A_bDefaultValues_B_2_p.setName("B_2.p");
		DefaultValue_Structures_A_bDefaultValues_B_2_p.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_2_p.setStructuralFeature(DefaultValue_Structures_B_p);
		DefaultValue_Structures_A_bDefaultValues_B_2_p.setObject(DefaultValue_Structures_A_bDefaultValues_B_2_p_object);
		DefaultValue_Structures_A_bDefaultValues_B_2_p.setValue(DefaultValue_Structures_A_bDefaultValues_B_2_p_value);
		DefaultValue_Structures_A_bDefaultValues_B_2_p.setResult(DefaultValue_Structures_A_bDefaultValues_B_2_p_result);
		// AddStructuralFeatureValueAction DefaultValue_Structures_A_bDefaultValues::B_3.p
		addToElementRepository("B_3.p", DefaultValue_Structures_A_bDefaultValues_B_3_p);
		DefaultValue_Structures_A_bDefaultValues_B_3_p.setName("B_3.p");
		DefaultValue_Structures_A_bDefaultValues_B_3_p.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_3_p.setStructuralFeature(DefaultValue_Structures_B_p);
		DefaultValue_Structures_A_bDefaultValues_B_3_p.setObject(DefaultValue_Structures_A_bDefaultValues_B_3_p_object);
		DefaultValue_Structures_A_bDefaultValues_B_3_p.setValue(DefaultValue_Structures_A_bDefaultValues_B_3_p_value);
		DefaultValue_Structures_A_bDefaultValues_B_3_p.setResult(DefaultValue_Structures_A_bDefaultValues_B_3_p_result);
		// AddStructuralFeatureValueAction DefaultValue_Structures_A_bDefaultValues::B_1.p
		addToElementRepository("B_1.p", DefaultValue_Structures_A_bDefaultValues_B_1_p);
		DefaultValue_Structures_A_bDefaultValues_B_1_p.setName("B_1.p");
		DefaultValue_Structures_A_bDefaultValues_B_1_p.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_1_p.setStructuralFeature(DefaultValue_Structures_B_p);
		DefaultValue_Structures_A_bDefaultValues_B_1_p.setObject(DefaultValue_Structures_A_bDefaultValues_B_1_p_object);
		DefaultValue_Structures_A_bDefaultValues_B_1_p.setValue(DefaultValue_Structures_A_bDefaultValues_B_1_p_value);
		DefaultValue_Structures_A_bDefaultValues_B_1_p.setResult(DefaultValue_Structures_A_bDefaultValues_B_1_p_result);
		// AddStructuralFeatureValueAction DefaultValue_Structures_A_bDefaultValues::B_4.p
		addToElementRepository("B_4.p", DefaultValue_Structures_A_bDefaultValues_B_4_p);
		DefaultValue_Structures_A_bDefaultValues_B_4_p.setName("B_4.p");
		DefaultValue_Structures_A_bDefaultValues_B_4_p.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_4_p.setStructuralFeature(DefaultValue_Structures_B_p);
		DefaultValue_Structures_A_bDefaultValues_B_4_p.setObject(DefaultValue_Structures_A_bDefaultValues_B_4_p_object);
		DefaultValue_Structures_A_bDefaultValues_B_4_p.setValue(DefaultValue_Structures_A_bDefaultValues_B_4_p_value);
		DefaultValue_Structures_A_bDefaultValues_B_4_p.setResult(DefaultValue_Structures_A_bDefaultValues_B_4_p_result);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction DefaultValue_Structures_assert_A::Test Default Values
		addToElementRepository("Test Default Values", DefaultValue_Structures_assert_A_Test_Default_Values);
		DefaultValue_Structures_assert_A_Test_Default_Values.setName("Test Default Values");
		DefaultValue_Structures_assert_A_Test_Default_Values.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Test_Default_Values.setBehavior(DefaultValue_Structures_assert_A_testDefaultValues);
		DefaultValue_Structures_assert_A_Test_Default_Values.addArgument(DefaultValue_Structures_assert_A_Test_Default_Values_pList);
		// CallBehaviorAction DefaultValue_Structures_main::assert_A
		addToElementRepository("assert_A", DefaultValue_Structures_main_assert_A);
		DefaultValue_Structures_main_assert_A.setName("assert_A");
		DefaultValue_Structures_main_assert_A.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_main_assert_A.setBehavior(DefaultValue_Structures_assert_A);
		DefaultValue_Structures_main_assert_A.addArgument(DefaultValue_Structures_main_assert_A_a);
		// CallBehaviorAction DefaultValue_Structures_main::instantiate_A
		addToElementRepository("instantiate_A", DefaultValue_Structures_main_instantiate_A);
		DefaultValue_Structures_main_instantiate_A.setName("instantiate_A");
		DefaultValue_Structures_main_instantiate_A.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_main_instantiate_A.addResult(DefaultValue_Structures_main_instantiate_A_a);
		DefaultValue_Structures_main_instantiate_A.setBehavior(DefaultValue_Structures_instantiate_A);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction DefaultValue_Structures_instantiate_A::A()
		addToElementRepository("A()", DefaultValue_Structures_instantiate_A_A_);
		DefaultValue_Structures_instantiate_A_A_.setName("A()");
		DefaultValue_Structures_instantiate_A_A_.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_instantiate_A_A_.addResult(DefaultValue_Structures_instantiate_A_A__result);
		DefaultValue_Structures_instantiate_A_A_.setOperation(DefaultValue_Structures_A_A_A);
		DefaultValue_Structures_instantiate_A_A_.setTarget(DefaultValue_Structures_instantiate_A_A__target);
	}

	private void initializeClass_Instances()
	{
		// Class DefaultValue_Structures::A
		addToElementRepository("A", DefaultValue_Structures_A);
		DefaultValue_Structures_A.setName("A");
		DefaultValue_Structures_A.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A.addOwnedAttribute(DefaultValue_Structures_A_b);
		DefaultValue_Structures_A.addOwnedBehavior(DefaultValue_Structures_A_bDefaultValues);
		
		DefaultValue_Structures_A.addOwnedOperation(DefaultValue_Structures_A_A_A);
		// Class DefaultValue_Structures::B
		addToElementRepository("B", DefaultValue_Structures_B);
		DefaultValue_Structures_B.setName("B");
		DefaultValue_Structures_B.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_B.addOwnedAttribute(DefaultValue_Structures_B_p);
		
		
		DefaultValue_Structures_B.addOwnedOperation(DefaultValue_Structures_B_B_B);
	}

	private void initializeComment_Instances()
	{
		// Comment DefaultValue_Structures::Comment0
		addToElementRepository("Comment0", DefaultValue_Structures_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment DefaultValue_Structures_PackageImport112::Comment113
		addToElementRepository("Comment113", DefaultValue_Structures_PackageImport112_Comment113);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow DefaultValue_Structures_A_bDefaultValues::ControlFlow53
		addToElementRepository("ControlFlow53", DefaultValue_Structures_A_bDefaultValues_ControlFlow53);
		DefaultValue_Structures_A_bDefaultValues_ControlFlow53.setName("ControlFlow53");
		DefaultValue_Structures_A_bDefaultValues_ControlFlow53.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ControlFlow53.setSource(DefaultValue_Structures_A_bDefaultValues_B_2_p);
		DefaultValue_Structures_A_bDefaultValues_ControlFlow53.setTarget(DefaultValue_Structures_A_bDefaultValues_Create_B_3);
		// ControlFlow DefaultValue_Structures_A_bDefaultValues::ControlFlow79
		addToElementRepository("ControlFlow79", DefaultValue_Structures_A_bDefaultValues_ControlFlow79);
		DefaultValue_Structures_A_bDefaultValues_ControlFlow79.setName("ControlFlow79");
		DefaultValue_Structures_A_bDefaultValues_ControlFlow79.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ControlFlow79.setSource(DefaultValue_Structures_A_bDefaultValues_B_3_p);
		DefaultValue_Structures_A_bDefaultValues_ControlFlow79.setTarget(DefaultValue_Structures_A_bDefaultValues_Create_B_4);
		// ControlFlow DefaultValue_Structures_A_bDefaultValues::ControlFlow57
		addToElementRepository("ControlFlow57", DefaultValue_Structures_A_bDefaultValues_ControlFlow57);
		DefaultValue_Structures_A_bDefaultValues_ControlFlow57.setName("ControlFlow57");
		DefaultValue_Structures_A_bDefaultValues_ControlFlow57.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ControlFlow57.setSource(DefaultValue_Structures_A_bDefaultValues_B_1_p);
		DefaultValue_Structures_A_bDefaultValues_ControlFlow57.setTarget(DefaultValue_Structures_A_bDefaultValues_Create_B_2);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction DefaultValue_Structures_instantiate_A::Create_A
		addToElementRepository("Create_A", DefaultValue_Structures_instantiate_A_Create_A);
		DefaultValue_Structures_instantiate_A_Create_A.setName("Create_A");
		DefaultValue_Structures_instantiate_A_Create_A.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_Create_A.setClassifier(DefaultValue_Structures_A);
		DefaultValue_Structures_instantiate_A_Create_A.setResult(DefaultValue_Structures_instantiate_A_Create_A_result);
		// CreateObjectAction DefaultValue_Structures_A_bDefaultValues::Create B_2
		addToElementRepository("Create B_2", DefaultValue_Structures_A_bDefaultValues_Create_B_2);
		DefaultValue_Structures_A_bDefaultValues_Create_B_2.setName("Create B_2");
		DefaultValue_Structures_A_bDefaultValues_Create_B_2.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_2.setClassifier(DefaultValue_Structures_B);
		DefaultValue_Structures_A_bDefaultValues_Create_B_2.setResult(DefaultValue_Structures_A_bDefaultValues_Create_B_2_result);
		// CreateObjectAction DefaultValue_Structures_A_bDefaultValues::Create B_1
		addToElementRepository("Create B_1", DefaultValue_Structures_A_bDefaultValues_Create_B_1);
		DefaultValue_Structures_A_bDefaultValues_Create_B_1.setName("Create B_1");
		DefaultValue_Structures_A_bDefaultValues_Create_B_1.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_1.setClassifier(DefaultValue_Structures_B);
		DefaultValue_Structures_A_bDefaultValues_Create_B_1.setResult(DefaultValue_Structures_A_bDefaultValues_Create_B_1_result);
		// CreateObjectAction DefaultValue_Structures_A_bDefaultValues::Create B_3
		addToElementRepository("Create B_3", DefaultValue_Structures_A_bDefaultValues_Create_B_3);
		DefaultValue_Structures_A_bDefaultValues_Create_B_3.setName("Create B_3");
		DefaultValue_Structures_A_bDefaultValues_Create_B_3.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_3.setClassifier(DefaultValue_Structures_B);
		DefaultValue_Structures_A_bDefaultValues_Create_B_3.setResult(DefaultValue_Structures_A_bDefaultValues_Create_B_3_result);
		// CreateObjectAction DefaultValue_Structures_A_bDefaultValues::Create B_4
		addToElementRepository("Create B_4", DefaultValue_Structures_A_bDefaultValues_Create_B_4);
		DefaultValue_Structures_A_bDefaultValues_Create_B_4.setName("Create B_4");
		DefaultValue_Structures_A_bDefaultValues_Create_B_4.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_4.setClassifier(DefaultValue_Structures_B);
		DefaultValue_Structures_A_bDefaultValues_Create_B_4.setResult(DefaultValue_Structures_A_bDefaultValues_Create_B_4_result);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior DefaultValue_Structures_assert_A::testDefaultValues
		addToElementRepository("testDefaultValues", DefaultValue_Structures_assert_A_testDefaultValues);
		DefaultValue_Structures_assert_A_testDefaultValues.setName("testDefaultValues");
		DefaultValue_Structures_assert_A_testDefaultValues.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_assert_A_testDefaultValues.addOwnedParameter(DefaultValue_Structures_assert_A_testDefaultValues_pList);
		DefaultValue_Structures_assert_A_testDefaultValues.addLanguage("Java");
		DefaultValue_Structures_assert_A_testDefaultValues.addLanguage("Import");
		DefaultValue_Structures_assert_A_testDefaultValues.addBody("		ValueList values = inputParameters.get(0).values; 		int index = 1;  		for(Value value : values) 		{ 		System.out.println(\"Asserting a.b[\" + index + \"].p == \" + index);	 	 		// Test parameter p[i] 		int p =((IntegerValue)value).value; 		Debug.println(\"[doBody] argument p[\" + index + \"] = \" + p);  		System.out.println(\"a.b[\" + index + \"].p == \" + p); 		System.out.print(\"Default value correctly evaluated: \");  		if(p == index) 		{ 			System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 		} 		else 		{ 			System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 		}  		index++; 		}");
		DefaultValue_Structures_assert_A_testDefaultValues.addBody("import fuml.Debug; import fuml.semantics.simpleclassifiers.IntegerValue; import fuml.semantics.values.ValueList;");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin DefaultValue_Structures_A_bDefaultValues_B_1.p::object
		addToElementRepository("object", DefaultValue_Structures_A_bDefaultValues_B_1_p_object);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_object.setName("object");
		DefaultValue_Structures_A_bDefaultValues_B_1_p_object.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_object.setType(DefaultValue_Structures_B);
		// InputPin DefaultValue_Structures_A_bDefaultValues_B_2.p::object
		addToElementRepository("object", DefaultValue_Structures_A_bDefaultValues_B_2_p_object);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_object.setName("object");
		DefaultValue_Structures_A_bDefaultValues_B_2_p_object.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_object.setType(DefaultValue_Structures_B);
		// InputPin DefaultValue_Structures_A_bDefaultValues_B_3.p::value
		addToElementRepository("value", DefaultValue_Structures_A_bDefaultValues_B_3_p_value);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_value.setName("value");
		DefaultValue_Structures_A_bDefaultValues_B_3_p_value.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin DefaultValue_Structures_A_bDefaultValues_B_4.p::value
		addToElementRepository("value", DefaultValue_Structures_A_bDefaultValues_B_4_p_value);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_value.setName("value");
		DefaultValue_Structures_A_bDefaultValues_B_4_p_value.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin DefaultValue_Structures_A_bDefaultValues_B_3.p::object
		addToElementRepository("object", DefaultValue_Structures_A_bDefaultValues_B_3_p_object);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_object.setName("object");
		DefaultValue_Structures_A_bDefaultValues_B_3_p_object.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_object.setType(DefaultValue_Structures_B);
		// InputPin DefaultValue_Structures_assert_A_Test Default Values::pList
		addToElementRepository("pList", DefaultValue_Structures_assert_A_Test_Default_Values_pList);
		DefaultValue_Structures_assert_A_Test_Default_Values_pList.setName("pList");
		DefaultValue_Structures_assert_A_Test_Default_Values_pList.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Test_Default_Values_pList.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		DefaultValue_Structures_assert_A_Test_Default_Values_pList.setUpper(-1);
		DefaultValue_Structures_assert_A_Test_Default_Values_pList.setLower(4);
		// InputPin DefaultValue_Structures_A_bDefaultValues_B_1.p::value
		addToElementRepository("value", DefaultValue_Structures_A_bDefaultValues_B_1_p_value);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_value.setName("value");
		DefaultValue_Structures_A_bDefaultValues_B_1_p_value.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin DefaultValue_Structures_main_assert_A::a
		addToElementRepository("a", DefaultValue_Structures_main_assert_A_a);
		DefaultValue_Structures_main_assert_A_a.setName("a");
		DefaultValue_Structures_main_assert_A_a.setVisibility(VisibilityKind.public_);
		// InputPin DefaultValue_Structures_instantiate_A_A()::target
		addToElementRepository("target", DefaultValue_Structures_instantiate_A_A__target);
		DefaultValue_Structures_instantiate_A_A__target.setName("target");
		DefaultValue_Structures_instantiate_A_A__target.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_A__target.setType(DefaultValue_Structures_A);
		// InputPin DefaultValue_Structures_A_bDefaultValues_B_4.p::object
		addToElementRepository("object", DefaultValue_Structures_A_bDefaultValues_B_4_p_object);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_object.setName("object");
		DefaultValue_Structures_A_bDefaultValues_B_4_p_object.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_object.setType(DefaultValue_Structures_B);
		// InputPin DefaultValue_Structures_assert_A_Read b.p::object
		addToElementRepository("object", DefaultValue_Structures_assert_A_Read_b_p_object);
		DefaultValue_Structures_assert_A_Read_b_p_object.setName("object");
		DefaultValue_Structures_assert_A_Read_b_p_object.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_b_p_object.setType(DefaultValue_Structures_B);
		// InputPin DefaultValue_Structures_assert_A_Read a.b::object
		addToElementRepository("object", DefaultValue_Structures_assert_A_Read_a_b_object);
		DefaultValue_Structures_assert_A_Read_a_b_object.setName("object");
		DefaultValue_Structures_assert_A_Read_a_b_object.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_a_b_object.setType(DefaultValue_Structures_A);
		// InputPin DefaultValue_Structures_A_bDefaultValues_B_2.p::value
		addToElementRepository("value", DefaultValue_Structures_A_bDefaultValues_B_2_p_value);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_value.setName("value");
		DefaultValue_Structures_A_bDefaultValues_B_2_p_value.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow91::LiteralBoolean92
		addToElementRepository("LiteralBoolean92", DefaultValue_Structures_A_bDefaultValues_ObjectFlow91_LiteralBoolean92);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow91_LiteralBoolean92.setName("LiteralBoolean92");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow91_LiteralBoolean92.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow91_LiteralBoolean92.setValue(true);
		// LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow47::LiteralBoolean48
		addToElementRepository("LiteralBoolean48", DefaultValue_Structures_A_bDefaultValues_ObjectFlow47_LiteralBoolean48);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow47_LiteralBoolean48.setName("LiteralBoolean48");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow47_LiteralBoolean48.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow47_LiteralBoolean48.setValue(true);
		// LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow33::LiteralBoolean34
		addToElementRepository("LiteralBoolean34", DefaultValue_Structures_A_bDefaultValues_ObjectFlow33_LiteralBoolean34);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow33_LiteralBoolean34.setName("LiteralBoolean34");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow33_LiteralBoolean34.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow33_LiteralBoolean34.setValue(true);
		// LiteralBoolean DefaultValue_Structures_assert_A_ObjectFlow4::LiteralBoolean6
		addToElementRepository("LiteralBoolean6", DefaultValue_Structures_assert_A_ObjectFlow4_LiteralBoolean6);
		DefaultValue_Structures_assert_A_ObjectFlow4_LiteralBoolean6.setName("LiteralBoolean6");
		DefaultValue_Structures_assert_A_ObjectFlow4_LiteralBoolean6.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_ObjectFlow4_LiteralBoolean6.setValue(true);
		// LiteralBoolean DefaultValue_Structures_assert_A_ObjectFlow17::LiteralBoolean18
		addToElementRepository("LiteralBoolean18", DefaultValue_Structures_assert_A_ObjectFlow17_LiteralBoolean18);
		DefaultValue_Structures_assert_A_ObjectFlow17_LiteralBoolean18.setName("LiteralBoolean18");
		DefaultValue_Structures_assert_A_ObjectFlow17_LiteralBoolean18.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_ObjectFlow17_LiteralBoolean18.setValue(true);
		// LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow70::LiteralBoolean72
		addToElementRepository("LiteralBoolean72", DefaultValue_Structures_A_bDefaultValues_ObjectFlow70_LiteralBoolean72);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow70_LiteralBoolean72.setName("LiteralBoolean72");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow70_LiteralBoolean72.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow70_LiteralBoolean72.setValue(true);
		// LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow44::LiteralBoolean46
		addToElementRepository("LiteralBoolean46", DefaultValue_Structures_A_bDefaultValues_ObjectFlow44_LiteralBoolean46);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow44_LiteralBoolean46.setName("LiteralBoolean46");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow44_LiteralBoolean46.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow44_LiteralBoolean46.setValue(true);
		// LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow104::LiteralBoolean106
		addToElementRepository("LiteralBoolean106", DefaultValue_Structures_A_bDefaultValues_ObjectFlow104_LiteralBoolean106);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow104_LiteralBoolean106.setName("LiteralBoolean106");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow104_LiteralBoolean106.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow104_LiteralBoolean106.setValue(true);
		// LiteralBoolean DefaultValue_Structures_instantiate_A_ObjectFlow133::LiteralBoolean135
		addToElementRepository("LiteralBoolean135", DefaultValue_Structures_instantiate_A_ObjectFlow133_LiteralBoolean135);
		DefaultValue_Structures_instantiate_A_ObjectFlow133_LiteralBoolean135.setName("LiteralBoolean135");
		DefaultValue_Structures_instantiate_A_ObjectFlow133_LiteralBoolean135.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_ObjectFlow133_LiteralBoolean135.setValue(true);
		// LiteralBoolean DefaultValue_Structures_main_ObjectFlow114::LiteralBoolean115
		addToElementRepository("LiteralBoolean115", DefaultValue_Structures_main_ObjectFlow114_LiteralBoolean115);
		DefaultValue_Structures_main_ObjectFlow114_LiteralBoolean115.setName("LiteralBoolean115");
		DefaultValue_Structures_main_ObjectFlow114_LiteralBoolean115.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_main_ObjectFlow114_LiteralBoolean115.setValue(true);
		// LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow27::LiteralBoolean28
		addToElementRepository("LiteralBoolean28", DefaultValue_Structures_A_bDefaultValues_ObjectFlow27_LiteralBoolean28);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow27_LiteralBoolean28.setName("LiteralBoolean28");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow27_LiteralBoolean28.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow27_LiteralBoolean28.setValue(true);
		// LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow73::LiteralBoolean74
		addToElementRepository("LiteralBoolean74", DefaultValue_Structures_A_bDefaultValues_ObjectFlow73_LiteralBoolean74);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow73_LiteralBoolean74.setName("LiteralBoolean74");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow73_LiteralBoolean74.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow73_LiteralBoolean74.setValue(true);
		// LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow30::LiteralBoolean32
		addToElementRepository("LiteralBoolean32", DefaultValue_Structures_A_bDefaultValues_ObjectFlow30_LiteralBoolean32);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow30_LiteralBoolean32.setName("LiteralBoolean32");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow30_LiteralBoolean32.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow30_LiteralBoolean32.setValue(true);
		// LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow50::LiteralBoolean51
		addToElementRepository("LiteralBoolean51", DefaultValue_Structures_A_bDefaultValues_ObjectFlow50_LiteralBoolean51);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow50_LiteralBoolean51.setName("LiteralBoolean51");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow50_LiteralBoolean51.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow50_LiteralBoolean51.setValue(true);
		// LiteralBoolean DefaultValue_Structures_assert_A_ObjectFlow9::LiteralBoolean10
		addToElementRepository("LiteralBoolean10", DefaultValue_Structures_assert_A_ObjectFlow9_LiteralBoolean10);
		DefaultValue_Structures_assert_A_ObjectFlow9_LiteralBoolean10.setName("LiteralBoolean10");
		DefaultValue_Structures_assert_A_ObjectFlow9_LiteralBoolean10.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_ObjectFlow9_LiteralBoolean10.setValue(true);
		// LiteralBoolean DefaultValue_Structures_instantiate_A_ObjectFlow130::LiteralBoolean131
		addToElementRepository("LiteralBoolean131", DefaultValue_Structures_instantiate_A_ObjectFlow130_LiteralBoolean131);
		DefaultValue_Structures_instantiate_A_ObjectFlow130_LiteralBoolean131.setName("LiteralBoolean131");
		DefaultValue_Structures_instantiate_A_ObjectFlow130_LiteralBoolean131.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_ObjectFlow130_LiteralBoolean131.setValue(true);
		// LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow54::LiteralBoolean56
		addToElementRepository("LiteralBoolean56", DefaultValue_Structures_A_bDefaultValues_ObjectFlow54_LiteralBoolean56);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow54_LiteralBoolean56.setName("LiteralBoolean56");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow54_LiteralBoolean56.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow54_LiteralBoolean56.setValue(true);
		// LiteralBoolean DefaultValue_Structures_A_bDefaultValues_ObjectFlow76::LiteralBoolean78
		addToElementRepository("LiteralBoolean78", DefaultValue_Structures_A_bDefaultValues_ObjectFlow76_LiteralBoolean78);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow76_LiteralBoolean78.setName("LiteralBoolean78");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow76_LiteralBoolean78.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow76_LiteralBoolean78.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger DefaultValue_Structures_assert_A_Test Default Values_pList::LiteralInteger1
		addToElementRepository("LiteralInteger1", DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralInteger1);
		DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralInteger1.setName("LiteralInteger1");
		DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralInteger1.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralInteger1.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow76::LiteralInteger77
		addToElementRepository("LiteralInteger77", DefaultValue_Structures_A_bDefaultValues_ObjectFlow76_LiteralInteger77);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow76_LiteralInteger77.setName("LiteralInteger77");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow76_LiteralInteger77.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow76_LiteralInteger77.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_Create B_4_result::LiteralInteger90
		addToElementRepository("LiteralInteger90", DefaultValue_Structures_A_bDefaultValues_Create_B_4_result_LiteralInteger90);
		DefaultValue_Structures_A_bDefaultValues_Create_B_4_result_LiteralInteger90.setName("LiteralInteger90");
		DefaultValue_Structures_A_bDefaultValues_Create_B_4_result_LiteralInteger90.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_4_result_LiteralInteger90.setValue(1);
		// LiteralInteger DefaultValue_Structures_main_instantiate_A_a::LiteralInteger121
		addToElementRepository("LiteralInteger121", DefaultValue_Structures_main_instantiate_A_a_LiteralInteger121);
		DefaultValue_Structures_main_instantiate_A_a_LiteralInteger121.setName("LiteralInteger121");
		DefaultValue_Structures_main_instantiate_A_a_LiteralInteger121.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_main_instantiate_A_a_LiteralInteger121.setValue(1);
		// LiteralInteger DefaultValue_Structures_assert_A_a_node::LiteralInteger12
		addToElementRepository("LiteralInteger12", DefaultValue_Structures_assert_A_a_node_LiteralInteger12);
		DefaultValue_Structures_assert_A_a_node_LiteralInteger12.setName("LiteralInteger12");
		DefaultValue_Structures_assert_A_a_node_LiteralInteger12.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_a_node_LiteralInteger12.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow54::LiteralInteger55
		addToElementRepository("LiteralInteger55", DefaultValue_Structures_A_bDefaultValues_ObjectFlow54_LiteralInteger55);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow54_LiteralInteger55.setName("LiteralInteger55");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow54_LiteralInteger55.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow54_LiteralInteger55.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_Create B_2_result::LiteralInteger43
		addToElementRepository("LiteralInteger43", DefaultValue_Structures_A_bDefaultValues_Create_B_2_result_LiteralInteger43);
		DefaultValue_Structures_A_bDefaultValues_Create_B_2_result_LiteralInteger43.setName("LiteralInteger43");
		DefaultValue_Structures_A_bDefaultValues_Create_B_2_result_LiteralInteger43.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_2_result_LiteralInteger43.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer(1)_result::LiteralInteger109
		addToElementRepository("LiteralInteger109", DefaultValue_Structures_A_bDefaultValues_Integer_1_result_LiteralInteger109);
		DefaultValue_Structures_A_bDefaultValues_Integer_1_result_LiteralInteger109.setName("LiteralInteger109");
		DefaultValue_Structures_A_bDefaultValues_Integer_1_result_LiteralInteger109.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_1_result_LiteralInteger109.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow30::LiteralInteger31
		addToElementRepository("LiteralInteger31", DefaultValue_Structures_A_bDefaultValues_ObjectFlow30_LiteralInteger31);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow30_LiteralInteger31.setName("LiteralInteger31");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow30_LiteralInteger31.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow30_LiteralInteger31.setValue(1);
		// LiteralInteger DefaultValue_Structures_main_instantiate_A_a::LiteralInteger120
		addToElementRepository("LiteralInteger120", DefaultValue_Structures_main_instantiate_A_a_LiteralInteger120);
		DefaultValue_Structures_main_instantiate_A_a_LiteralInteger120.setName("LiteralInteger120");
		DefaultValue_Structures_main_instantiate_A_a_LiteralInteger120.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_main_instantiate_A_a_LiteralInteger120.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer(2)::LiteralInteger60
		addToElementRepository("LiteralInteger60", DefaultValue_Structures_A_bDefaultValues_Integer_2_LiteralInteger60);
		DefaultValue_Structures_A_bDefaultValues_Integer_2_LiteralInteger60.setName("LiteralInteger60");
		DefaultValue_Structures_A_bDefaultValues_Integer_2_LiteralInteger60.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_2_LiteralInteger60.setValue(2);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_4.p_result::LiteralInteger88
		addToElementRepository("LiteralInteger88", DefaultValue_Structures_A_bDefaultValues_B_4_p_result_LiteralInteger88);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_result_LiteralInteger88.setName("LiteralInteger88");
		DefaultValue_Structures_A_bDefaultValues_B_4_p_result_LiteralInteger88.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_result_LiteralInteger88.setValue(1);
		// LiteralInteger DefaultValue_Structures_assert_A_ObjectFlow4::LiteralInteger5
		addToElementRepository("LiteralInteger5", DefaultValue_Structures_assert_A_ObjectFlow4_LiteralInteger5);
		DefaultValue_Structures_assert_A_ObjectFlow4_LiteralInteger5.setName("LiteralInteger5");
		DefaultValue_Structures_assert_A_ObjectFlow4_LiteralInteger5.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_ObjectFlow4_LiteralInteger5.setValue(1);
		// LiteralInteger DefaultValue_Structures_assert_A_Test Default Values_pList::LiteralInteger3
		addToElementRepository("LiteralInteger3", DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralInteger3);
		DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralInteger3.setName("LiteralInteger3");
		DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralInteger3.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralInteger3.setValue(4);
		// LiteralInteger DefaultValue_Structures_instantiate_A_A()_result::LiteralInteger129
		addToElementRepository("LiteralInteger129", DefaultValue_Structures_instantiate_A_A__result_LiteralInteger129);
		DefaultValue_Structures_instantiate_A_A__result_LiteralInteger129.setName("LiteralInteger129");
		DefaultValue_Structures_instantiate_A_A__result_LiteralInteger129.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_A__result_LiteralInteger129.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_1.p_object::LiteralInteger97
		addToElementRepository("LiteralInteger97", DefaultValue_Structures_A_bDefaultValues_B_1_p_object_LiteralInteger97);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_object_LiteralInteger97.setName("LiteralInteger97");
		DefaultValue_Structures_A_bDefaultValues_B_1_p_object_LiteralInteger97.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_object_LiteralInteger97.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_4.p_value::LiteralInteger86
		addToElementRepository("LiteralInteger86", DefaultValue_Structures_A_bDefaultValues_B_4_p_value_LiteralInteger86);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_value_LiteralInteger86.setName("LiteralInteger86");
		DefaultValue_Structures_A_bDefaultValues_B_4_p_value_LiteralInteger86.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_value_LiteralInteger86.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_2.p_result::LiteralInteger65
		addToElementRepository("LiteralInteger65", DefaultValue_Structures_A_bDefaultValues_B_2_p_result_LiteralInteger65);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_result_LiteralInteger65.setName("LiteralInteger65");
		DefaultValue_Structures_A_bDefaultValues_B_2_p_result_LiteralInteger65.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_result_LiteralInteger65.setValue(1);
		// LiteralInteger DefaultValue_Structures_assert_A_ObjectFlow17::LiteralInteger19
		addToElementRepository("LiteralInteger19", DefaultValue_Structures_assert_A_ObjectFlow17_LiteralInteger19);
		DefaultValue_Structures_assert_A_ObjectFlow17_LiteralInteger19.setName("LiteralInteger19");
		DefaultValue_Structures_assert_A_ObjectFlow17_LiteralInteger19.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_ObjectFlow17_LiteralInteger19.setValue(1);
		// LiteralInteger DefaultValue_Structures_instantiate_A_ObjectFlow130::LiteralInteger132
		addToElementRepository("LiteralInteger132", DefaultValue_Structures_instantiate_A_ObjectFlow130_LiteralInteger132);
		DefaultValue_Structures_instantiate_A_ObjectFlow130_LiteralInteger132.setName("LiteralInteger132");
		DefaultValue_Structures_instantiate_A_ObjectFlow130_LiteralInteger132.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_ObjectFlow130_LiteralInteger132.setValue(1);
		// LiteralInteger DefaultValue_Structures_main_assert_A_a::LiteralInteger117
		addToElementRepository("LiteralInteger117", DefaultValue_Structures_main_assert_A_a_LiteralInteger117);
		DefaultValue_Structures_main_assert_A_a_LiteralInteger117.setName("LiteralInteger117");
		DefaultValue_Structures_main_assert_A_a_LiteralInteger117.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_main_assert_A_a_LiteralInteger117.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_2.p_object::LiteralInteger67
		addToElementRepository("LiteralInteger67", DefaultValue_Structures_A_bDefaultValues_B_2_p_object_LiteralInteger67);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_object_LiteralInteger67.setName("LiteralInteger67");
		DefaultValue_Structures_A_bDefaultValues_B_2_p_object_LiteralInteger67.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_object_LiteralInteger67.setValue(1);
		// LiteralInteger DefaultValue_Structures_instantiate_A_A()_result::LiteralInteger128
		addToElementRepository("LiteralInteger128", DefaultValue_Structures_instantiate_A_A__result_LiteralInteger128);
		DefaultValue_Structures_instantiate_A_A__result_LiteralInteger128.setName("LiteralInteger128");
		DefaultValue_Structures_instantiate_A_A__result_LiteralInteger128.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_A__result_LiteralInteger128.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow44::LiteralInteger45
		addToElementRepository("LiteralInteger45", DefaultValue_Structures_A_bDefaultValues_ObjectFlow44_LiteralInteger45);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow44_LiteralInteger45.setName("LiteralInteger45");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow44_LiteralInteger45.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow44_LiteralInteger45.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer(4)_result::LiteralInteger62
		addToElementRepository("LiteralInteger62", DefaultValue_Structures_A_bDefaultValues_Integer_4_result_LiteralInteger62);
		DefaultValue_Structures_A_bDefaultValues_Integer_4_result_LiteralInteger62.setName("LiteralInteger62");
		DefaultValue_Structures_A_bDefaultValues_Integer_4_result_LiteralInteger62.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_4_result_LiteralInteger62.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow33::LiteralInteger35
		addToElementRepository("LiteralInteger35", DefaultValue_Structures_A_bDefaultValues_ObjectFlow33_LiteralInteger35);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow33_LiteralInteger35.setName("LiteralInteger35");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow33_LiteralInteger35.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow33_LiteralInteger35.setValue(1);
		// LiteralInteger DefaultValue_Structures_main_assert_A_a::LiteralInteger118
		addToElementRepository("LiteralInteger118", DefaultValue_Structures_main_assert_A_a_LiteralInteger118);
		DefaultValue_Structures_main_assert_A_a_LiteralInteger118.setName("LiteralInteger118");
		DefaultValue_Structures_main_assert_A_a_LiteralInteger118.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_main_assert_A_a_LiteralInteger118.setValue(1);
		// LiteralInteger DefaultValue_Structures_assert_A_testDefaultValues_pList::LiteralInteger7
		addToElementRepository("LiteralInteger7", DefaultValue_Structures_assert_A_testDefaultValues_pList_LiteralInteger7);
		DefaultValue_Structures_assert_A_testDefaultValues_pList_LiteralInteger7.setName("LiteralInteger7");
		DefaultValue_Structures_assert_A_testDefaultValues_pList_LiteralInteger7.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_testDefaultValues_pList_LiteralInteger7.setValue(4);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer(3)_result::LiteralInteger81
		addToElementRepository("LiteralInteger81", DefaultValue_Structures_A_bDefaultValues_Integer_3_result_LiteralInteger81);
		DefaultValue_Structures_A_bDefaultValues_Integer_3_result_LiteralInteger81.setName("LiteralInteger81");
		DefaultValue_Structures_A_bDefaultValues_Integer_3_result_LiteralInteger81.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_3_result_LiteralInteger81.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow27::LiteralInteger29
		addToElementRepository("LiteralInteger29", DefaultValue_Structures_A_bDefaultValues_ObjectFlow27_LiteralInteger29);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow27_LiteralInteger29.setName("LiteralInteger29");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow27_LiteralInteger29.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow27_LiteralInteger29.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer(1)::LiteralInteger111
		addToElementRepository("LiteralInteger111", DefaultValue_Structures_A_bDefaultValues_Integer_1_LiteralInteger111);
		DefaultValue_Structures_A_bDefaultValues_Integer_1_LiteralInteger111.setName("LiteralInteger111");
		DefaultValue_Structures_A_bDefaultValues_Integer_1_LiteralInteger111.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_1_LiteralInteger111.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer(2)_result::LiteralInteger59
		addToElementRepository("LiteralInteger59", DefaultValue_Structures_A_bDefaultValues_Integer_2_result_LiteralInteger59);
		DefaultValue_Structures_A_bDefaultValues_Integer_2_result_LiteralInteger59.setName("LiteralInteger59");
		DefaultValue_Structures_A_bDefaultValues_Integer_2_result_LiteralInteger59.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_2_result_LiteralInteger59.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_3.p_result::LiteralInteger39
		addToElementRepository("LiteralInteger39", DefaultValue_Structures_A_bDefaultValues_B_3_p_result_LiteralInteger39);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_result_LiteralInteger39.setName("LiteralInteger39");
		DefaultValue_Structures_A_bDefaultValues_B_3_p_result_LiteralInteger39.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_result_LiteralInteger39.setValue(1);
		// LiteralInteger DefaultValue_Structures_instantiate_A_A()_target::LiteralInteger125
		addToElementRepository("LiteralInteger125", DefaultValue_Structures_instantiate_A_A__target_LiteralInteger125);
		DefaultValue_Structures_instantiate_A_A__target_LiteralInteger125.setName("LiteralInteger125");
		DefaultValue_Structures_instantiate_A_A__target_LiteralInteger125.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_A__target_LiteralInteger125.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer(3)::LiteralInteger80
		addToElementRepository("LiteralInteger80", DefaultValue_Structures_A_bDefaultValues_Integer_3_LiteralInteger80);
		DefaultValue_Structures_A_bDefaultValues_Integer_3_LiteralInteger80.setName("LiteralInteger80");
		DefaultValue_Structures_A_bDefaultValues_Integer_3_LiteralInteger80.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_3_LiteralInteger80.setValue(3);
		// LiteralInteger DefaultValue_Structures_instantiate_A_ObjectFlow133::LiteralInteger134
		addToElementRepository("LiteralInteger134", DefaultValue_Structures_instantiate_A_ObjectFlow133_LiteralInteger134);
		DefaultValue_Structures_instantiate_A_ObjectFlow133_LiteralInteger134.setName("LiteralInteger134");
		DefaultValue_Structures_instantiate_A_ObjectFlow133_LiteralInteger134.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_ObjectFlow133_LiteralInteger134.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_b::LiteralInteger26
		addToElementRepository("LiteralInteger26", DefaultValue_Structures_A_b_LiteralInteger26);
		DefaultValue_Structures_A_b_LiteralInteger26.setName("LiteralInteger26");
		DefaultValue_Structures_A_b_LiteralInteger26.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_b_LiteralInteger26.setValue(4);
		// LiteralInteger DefaultValue_Structures_assert_A_Read b.p_result::LiteralInteger14
		addToElementRepository("LiteralInteger14", DefaultValue_Structures_assert_A_Read_b_p_result_LiteralInteger14);
		DefaultValue_Structures_assert_A_Read_b_p_result_LiteralInteger14.setName("LiteralInteger14");
		DefaultValue_Structures_assert_A_Read_b_p_result_LiteralInteger14.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_b_p_result_LiteralInteger14.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_2.p_value::LiteralInteger68
		addToElementRepository("LiteralInteger68", DefaultValue_Structures_A_bDefaultValues_B_2_p_value_LiteralInteger68);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_value_LiteralInteger68.setName("LiteralInteger68");
		DefaultValue_Structures_A_bDefaultValues_B_2_p_value_LiteralInteger68.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_value_LiteralInteger68.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow73::LiteralInteger75
		addToElementRepository("LiteralInteger75", DefaultValue_Structures_A_bDefaultValues_ObjectFlow73_LiteralInteger75);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow73_LiteralInteger75.setName("LiteralInteger75");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow73_LiteralInteger75.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow73_LiteralInteger75.setValue(1);
		// LiteralInteger DefaultValue_Structures_assert_A_Read a.b_result::LiteralInteger21
		addToElementRepository("LiteralInteger21", DefaultValue_Structures_assert_A_Read_a_b_result_LiteralInteger21);
		DefaultValue_Structures_assert_A_Read_a_b_result_LiteralInteger21.setName("LiteralInteger21");
		DefaultValue_Structures_assert_A_Read_a_b_result_LiteralInteger21.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_a_b_result_LiteralInteger21.setValue(4);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow50::LiteralInteger52
		addToElementRepository("LiteralInteger52", DefaultValue_Structures_A_bDefaultValues_ObjectFlow50_LiteralInteger52);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow50_LiteralInteger52.setName("LiteralInteger52");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow50_LiteralInteger52.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow50_LiteralInteger52.setValue(1);
		// LiteralInteger DefaultValue_Structures_assert_A_Read b.p_object::LiteralInteger16
		addToElementRepository("LiteralInteger16", DefaultValue_Structures_assert_A_Read_b_p_object_LiteralInteger16);
		DefaultValue_Structures_assert_A_Read_b_p_object_LiteralInteger16.setName("LiteralInteger16");
		DefaultValue_Structures_assert_A_Read_b_p_object_LiteralInteger16.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_b_p_object_LiteralInteger16.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow47::LiteralInteger49
		addToElementRepository("LiteralInteger49", DefaultValue_Structures_A_bDefaultValues_ObjectFlow47_LiteralInteger49);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow47_LiteralInteger49.setName("LiteralInteger49");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow47_LiteralInteger49.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow47_LiteralInteger49.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_bList::LiteralInteger100
		addToElementRepository("LiteralInteger100", DefaultValue_Structures_A_bDefaultValues_bList_LiteralInteger100);
		DefaultValue_Structures_A_bDefaultValues_bList_LiteralInteger100.setName("LiteralInteger100");
		DefaultValue_Structures_A_bDefaultValues_bList_LiteralInteger100.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_bList_LiteralInteger100.setValue(0);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow91::LiteralInteger93
		addToElementRepository("LiteralInteger93", DefaultValue_Structures_A_bDefaultValues_ObjectFlow91_LiteralInteger93);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow91_LiteralInteger93.setName("LiteralInteger93");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow91_LiteralInteger93.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow91_LiteralInteger93.setValue(1);
		// LiteralInteger DefaultValue_Structures_instantiate_A_Create_A_result::LiteralInteger124
		addToElementRepository("LiteralInteger124", DefaultValue_Structures_instantiate_A_Create_A_result_LiteralInteger124);
		DefaultValue_Structures_instantiate_A_Create_A_result_LiteralInteger124.setName("LiteralInteger124");
		DefaultValue_Structures_instantiate_A_Create_A_result_LiteralInteger124.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_Create_A_result_LiteralInteger124.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_3.p_object::LiteralInteger40
		addToElementRepository("LiteralInteger40", DefaultValue_Structures_A_bDefaultValues_B_3_p_object_LiteralInteger40);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_object_LiteralInteger40.setName("LiteralInteger40");
		DefaultValue_Structures_A_bDefaultValues_B_3_p_object_LiteralInteger40.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_object_LiteralInteger40.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_Integer(4)::LiteralInteger61
		addToElementRepository("LiteralInteger61", DefaultValue_Structures_A_bDefaultValues_Integer_4_LiteralInteger61);
		DefaultValue_Structures_A_bDefaultValues_Integer_4_LiteralInteger61.setName("LiteralInteger61");
		DefaultValue_Structures_A_bDefaultValues_Integer_4_LiteralInteger61.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_4_LiteralInteger61.setValue(4);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_1.p_value::LiteralInteger94
		addToElementRepository("LiteralInteger94", DefaultValue_Structures_A_bDefaultValues_B_1_p_value_LiteralInteger94);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_value_LiteralInteger94.setName("LiteralInteger94");
		DefaultValue_Structures_A_bDefaultValues_B_1_p_value_LiteralInteger94.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_value_LiteralInteger94.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow70::LiteralInteger71
		addToElementRepository("LiteralInteger71", DefaultValue_Structures_A_bDefaultValues_ObjectFlow70_LiteralInteger71);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow70_LiteralInteger71.setName("LiteralInteger71");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow70_LiteralInteger71.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow70_LiteralInteger71.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_Create B_3_result::LiteralInteger108
		addToElementRepository("LiteralInteger108", DefaultValue_Structures_A_bDefaultValues_Create_B_3_result_LiteralInteger108);
		DefaultValue_Structures_A_bDefaultValues_Create_B_3_result_LiteralInteger108.setName("LiteralInteger108");
		DefaultValue_Structures_A_bDefaultValues_Create_B_3_result_LiteralInteger108.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_3_result_LiteralInteger108.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_3.p_value::LiteralInteger36
		addToElementRepository("LiteralInteger36", DefaultValue_Structures_A_bDefaultValues_B_3_p_value_LiteralInteger36);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_value_LiteralInteger36.setName("LiteralInteger36");
		DefaultValue_Structures_A_bDefaultValues_B_3_p_value_LiteralInteger36.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_value_LiteralInteger36.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_4.p_object::LiteralInteger84
		addToElementRepository("LiteralInteger84", DefaultValue_Structures_A_bDefaultValues_B_4_p_object_LiteralInteger84);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_object_LiteralInteger84.setName("LiteralInteger84");
		DefaultValue_Structures_A_bDefaultValues_B_4_p_object_LiteralInteger84.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_object_LiteralInteger84.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_ObjectFlow104::LiteralInteger105
		addToElementRepository("LiteralInteger105", DefaultValue_Structures_A_bDefaultValues_ObjectFlow104_LiteralInteger105);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow104_LiteralInteger105.setName("LiteralInteger105");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow104_LiteralInteger105.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow104_LiteralInteger105.setValue(1);
		// LiteralInteger DefaultValue_Structures_assert_A_Read a.b_object::LiteralInteger22
		addToElementRepository("LiteralInteger22", DefaultValue_Structures_assert_A_Read_a_b_object_LiteralInteger22);
		DefaultValue_Structures_assert_A_Read_a_b_object_LiteralInteger22.setName("LiteralInteger22");
		DefaultValue_Structures_assert_A_Read_a_b_object_LiteralInteger22.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_a_b_object_LiteralInteger22.setValue(1);
		// LiteralInteger DefaultValue_Structures_instantiate_A_a_node::LiteralInteger136
		addToElementRepository("LiteralInteger136", DefaultValue_Structures_instantiate_A_a_node_LiteralInteger136);
		DefaultValue_Structures_instantiate_A_a_node_LiteralInteger136.setName("LiteralInteger136");
		DefaultValue_Structures_instantiate_A_a_node_LiteralInteger136.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_a_node_LiteralInteger136.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_Create B_1_result::LiteralInteger103
		addToElementRepository("LiteralInteger103", DefaultValue_Structures_A_bDefaultValues_Create_B_1_result_LiteralInteger103);
		DefaultValue_Structures_A_bDefaultValues_Create_B_1_result_LiteralInteger103.setName("LiteralInteger103");
		DefaultValue_Structures_A_bDefaultValues_Create_B_1_result_LiteralInteger103.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_1_result_LiteralInteger103.setValue(1);
		// LiteralInteger DefaultValue_Structures_main_ObjectFlow114::LiteralInteger116
		addToElementRepository("LiteralInteger116", DefaultValue_Structures_main_ObjectFlow114_LiteralInteger116);
		DefaultValue_Structures_main_ObjectFlow114_LiteralInteger116.setName("LiteralInteger116");
		DefaultValue_Structures_main_ObjectFlow114_LiteralInteger116.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_main_ObjectFlow114_LiteralInteger116.setValue(1);
		// LiteralInteger DefaultValue_Structures_assert_A_ObjectFlow9::LiteralInteger11
		addToElementRepository("LiteralInteger11", DefaultValue_Structures_assert_A_ObjectFlow9_LiteralInteger11);
		DefaultValue_Structures_assert_A_ObjectFlow9_LiteralInteger11.setName("LiteralInteger11");
		DefaultValue_Structures_assert_A_ObjectFlow9_LiteralInteger11.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_ObjectFlow9_LiteralInteger11.setValue(1);
		// LiteralInteger DefaultValue_Structures_A_bDefaultValues_B_1.p_result::LiteralInteger99
		addToElementRepository("LiteralInteger99", DefaultValue_Structures_A_bDefaultValues_B_1_p_result_LiteralInteger99);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_result_LiteralInteger99.setName("LiteralInteger99");
		DefaultValue_Structures_A_bDefaultValues_B_1_p_result_LiteralInteger99.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_result_LiteralInteger99.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Create B_2_result::LiteralUnlimitedNatural42
		addToElementRepository("LiteralUnlimitedNatural42", DefaultValue_Structures_A_bDefaultValues_Create_B_2_result_LiteralUnlimitedNatural42);
		DefaultValue_Structures_A_bDefaultValues_Create_B_2_result_LiteralUnlimitedNatural42.setName("LiteralUnlimitedNatural42");
		DefaultValue_Structures_A_bDefaultValues_Create_B_2_result_LiteralUnlimitedNatural42.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_2_result_LiteralUnlimitedNatural42.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_4.p_result::LiteralUnlimitedNatural87
		addToElementRepository("LiteralUnlimitedNatural87", DefaultValue_Structures_A_bDefaultValues_B_4_p_result_LiteralUnlimitedNatural87);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_result_LiteralUnlimitedNatural87.setName("LiteralUnlimitedNatural87");
		DefaultValue_Structures_A_bDefaultValues_B_4_p_result_LiteralUnlimitedNatural87.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_result_LiteralUnlimitedNatural87.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Integer(2)_result::LiteralUnlimitedNatural58
		addToElementRepository("LiteralUnlimitedNatural58", DefaultValue_Structures_A_bDefaultValues_Integer_2_result_LiteralUnlimitedNatural58);
		DefaultValue_Structures_A_bDefaultValues_Integer_2_result_LiteralUnlimitedNatural58.setName("LiteralUnlimitedNatural58");
		DefaultValue_Structures_A_bDefaultValues_Integer_2_result_LiteralUnlimitedNatural58.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_2_result_LiteralUnlimitedNatural58.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Integer(3)_result::LiteralUnlimitedNatural82
		addToElementRepository("LiteralUnlimitedNatural82", DefaultValue_Structures_A_bDefaultValues_Integer_3_result_LiteralUnlimitedNatural82);
		DefaultValue_Structures_A_bDefaultValues_Integer_3_result_LiteralUnlimitedNatural82.setName("LiteralUnlimitedNatural82");
		DefaultValue_Structures_A_bDefaultValues_Integer_3_result_LiteralUnlimitedNatural82.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_3_result_LiteralUnlimitedNatural82.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_2.p_value::LiteralUnlimitedNatural69
		addToElementRepository("LiteralUnlimitedNatural69", DefaultValue_Structures_A_bDefaultValues_B_2_p_value_LiteralUnlimitedNatural69);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_value_LiteralUnlimitedNatural69.setName("LiteralUnlimitedNatural69");
		DefaultValue_Structures_A_bDefaultValues_B_2_p_value_LiteralUnlimitedNatural69.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_value_LiteralUnlimitedNatural69.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_1.p_value::LiteralUnlimitedNatural95
		addToElementRepository("LiteralUnlimitedNatural95", DefaultValue_Structures_A_bDefaultValues_B_1_p_value_LiteralUnlimitedNatural95);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_value_LiteralUnlimitedNatural95.setName("LiteralUnlimitedNatural95");
		DefaultValue_Structures_A_bDefaultValues_B_1_p_value_LiteralUnlimitedNatural95.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_value_LiteralUnlimitedNatural95.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Integer(4)_result::LiteralUnlimitedNatural63
		addToElementRepository("LiteralUnlimitedNatural63", DefaultValue_Structures_A_bDefaultValues_Integer_4_result_LiteralUnlimitedNatural63);
		DefaultValue_Structures_A_bDefaultValues_Integer_4_result_LiteralUnlimitedNatural63.setName("LiteralUnlimitedNatural63");
		DefaultValue_Structures_A_bDefaultValues_Integer_4_result_LiteralUnlimitedNatural63.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_4_result_LiteralUnlimitedNatural63.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_2.p_object::LiteralUnlimitedNatural66
		addToElementRepository("LiteralUnlimitedNatural66", DefaultValue_Structures_A_bDefaultValues_B_2_p_object_LiteralUnlimitedNatural66);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_object_LiteralUnlimitedNatural66.setName("LiteralUnlimitedNatural66");
		DefaultValue_Structures_A_bDefaultValues_B_2_p_object_LiteralUnlimitedNatural66.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_object_LiteralUnlimitedNatural66.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Create B_3_result::LiteralUnlimitedNatural107
		addToElementRepository("LiteralUnlimitedNatural107", DefaultValue_Structures_A_bDefaultValues_Create_B_3_result_LiteralUnlimitedNatural107);
		DefaultValue_Structures_A_bDefaultValues_Create_B_3_result_LiteralUnlimitedNatural107.setName("LiteralUnlimitedNatural107");
		DefaultValue_Structures_A_bDefaultValues_Create_B_3_result_LiteralUnlimitedNatural107.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_3_result_LiteralUnlimitedNatural107.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Integer(1)_result::LiteralUnlimitedNatural110
		addToElementRepository("LiteralUnlimitedNatural110", DefaultValue_Structures_A_bDefaultValues_Integer_1_result_LiteralUnlimitedNatural110);
		DefaultValue_Structures_A_bDefaultValues_Integer_1_result_LiteralUnlimitedNatural110.setName("LiteralUnlimitedNatural110");
		DefaultValue_Structures_A_bDefaultValues_Integer_1_result_LiteralUnlimitedNatural110.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_1_result_LiteralUnlimitedNatural110.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_assert_A_Test Default Values_pList::LiteralUnlimitedNatural2
		addToElementRepository("LiteralUnlimitedNatural2", DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralUnlimitedNatural2);
		DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralUnlimitedNatural2.setName("LiteralUnlimitedNatural2");
		DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralUnlimitedNatural2.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Test_Default_Values_pList_LiteralUnlimitedNatural2.setValue(-1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_3.p_value::LiteralUnlimitedNatural37
		addToElementRepository("LiteralUnlimitedNatural37", DefaultValue_Structures_A_bDefaultValues_B_3_p_value_LiteralUnlimitedNatural37);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_value_LiteralUnlimitedNatural37.setName("LiteralUnlimitedNatural37");
		DefaultValue_Structures_A_bDefaultValues_B_3_p_value_LiteralUnlimitedNatural37.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_value_LiteralUnlimitedNatural37.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_3.p_object::LiteralUnlimitedNatural41
		addToElementRepository("LiteralUnlimitedNatural41", DefaultValue_Structures_A_bDefaultValues_B_3_p_object_LiteralUnlimitedNatural41);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_object_LiteralUnlimitedNatural41.setName("LiteralUnlimitedNatural41");
		DefaultValue_Structures_A_bDefaultValues_B_3_p_object_LiteralUnlimitedNatural41.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_object_LiteralUnlimitedNatural41.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_assert_A_Read b.p_object::LiteralUnlimitedNatural15
		addToElementRepository("LiteralUnlimitedNatural15", DefaultValue_Structures_assert_A_Read_b_p_object_LiteralUnlimitedNatural15);
		DefaultValue_Structures_assert_A_Read_b_p_object_LiteralUnlimitedNatural15.setName("LiteralUnlimitedNatural15");
		DefaultValue_Structures_assert_A_Read_b_p_object_LiteralUnlimitedNatural15.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_b_p_object_LiteralUnlimitedNatural15.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Create B_1_result::LiteralUnlimitedNatural102
		addToElementRepository("LiteralUnlimitedNatural102", DefaultValue_Structures_A_bDefaultValues_Create_B_1_result_LiteralUnlimitedNatural102);
		DefaultValue_Structures_A_bDefaultValues_Create_B_1_result_LiteralUnlimitedNatural102.setName("LiteralUnlimitedNatural102");
		DefaultValue_Structures_A_bDefaultValues_Create_B_1_result_LiteralUnlimitedNatural102.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_1_result_LiteralUnlimitedNatural102.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_Create B_4_result::LiteralUnlimitedNatural89
		addToElementRepository("LiteralUnlimitedNatural89", DefaultValue_Structures_A_bDefaultValues_Create_B_4_result_LiteralUnlimitedNatural89);
		DefaultValue_Structures_A_bDefaultValues_Create_B_4_result_LiteralUnlimitedNatural89.setName("LiteralUnlimitedNatural89");
		DefaultValue_Structures_A_bDefaultValues_Create_B_4_result_LiteralUnlimitedNatural89.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_4_result_LiteralUnlimitedNatural89.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_assert_A_Read b.p_result::LiteralUnlimitedNatural13
		addToElementRepository("LiteralUnlimitedNatural13", DefaultValue_Structures_assert_A_Read_b_p_result_LiteralUnlimitedNatural13);
		DefaultValue_Structures_assert_A_Read_b_p_result_LiteralUnlimitedNatural13.setName("LiteralUnlimitedNatural13");
		DefaultValue_Structures_assert_A_Read_b_p_result_LiteralUnlimitedNatural13.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_b_p_result_LiteralUnlimitedNatural13.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_bList::LiteralUnlimitedNatural101
		addToElementRepository("LiteralUnlimitedNatural101", DefaultValue_Structures_A_bDefaultValues_bList_LiteralUnlimitedNatural101);
		DefaultValue_Structures_A_bDefaultValues_bList_LiteralUnlimitedNatural101.setName("LiteralUnlimitedNatural101");
		DefaultValue_Structures_A_bDefaultValues_bList_LiteralUnlimitedNatural101.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_bList_LiteralUnlimitedNatural101.setValue(-1);
		// LiteralUnlimitedNatural DefaultValue_Structures_instantiate_A_Create_A_result::LiteralUnlimitedNatural123
		addToElementRepository("LiteralUnlimitedNatural123", DefaultValue_Structures_instantiate_A_Create_A_result_LiteralUnlimitedNatural123);
		DefaultValue_Structures_instantiate_A_Create_A_result_LiteralUnlimitedNatural123.setName("LiteralUnlimitedNatural123");
		DefaultValue_Structures_instantiate_A_Create_A_result_LiteralUnlimitedNatural123.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_Create_A_result_LiteralUnlimitedNatural123.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_assert_A_Read a.b_object::LiteralUnlimitedNatural23
		addToElementRepository("LiteralUnlimitedNatural23", DefaultValue_Structures_assert_A_Read_a_b_object_LiteralUnlimitedNatural23);
		DefaultValue_Structures_assert_A_Read_a_b_object_LiteralUnlimitedNatural23.setName("LiteralUnlimitedNatural23");
		DefaultValue_Structures_assert_A_Read_a_b_object_LiteralUnlimitedNatural23.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_a_b_object_LiteralUnlimitedNatural23.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_main_instantiate_A_a::LiteralUnlimitedNatural122
		addToElementRepository("LiteralUnlimitedNatural122", DefaultValue_Structures_main_instantiate_A_a_LiteralUnlimitedNatural122);
		DefaultValue_Structures_main_instantiate_A_a_LiteralUnlimitedNatural122.setName("LiteralUnlimitedNatural122");
		DefaultValue_Structures_main_instantiate_A_a_LiteralUnlimitedNatural122.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_main_instantiate_A_a_LiteralUnlimitedNatural122.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_main_assert_A_a::LiteralUnlimitedNatural119
		addToElementRepository("LiteralUnlimitedNatural119", DefaultValue_Structures_main_assert_A_a_LiteralUnlimitedNatural119);
		DefaultValue_Structures_main_assert_A_a_LiteralUnlimitedNatural119.setName("LiteralUnlimitedNatural119");
		DefaultValue_Structures_main_assert_A_a_LiteralUnlimitedNatural119.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_main_assert_A_a_LiteralUnlimitedNatural119.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_assert_A_Read a.b_result::LiteralUnlimitedNatural20
		addToElementRepository("LiteralUnlimitedNatural20", DefaultValue_Structures_assert_A_Read_a_b_result_LiteralUnlimitedNatural20);
		DefaultValue_Structures_assert_A_Read_a_b_result_LiteralUnlimitedNatural20.setName("LiteralUnlimitedNatural20");
		DefaultValue_Structures_assert_A_Read_a_b_result_LiteralUnlimitedNatural20.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_a_b_result_LiteralUnlimitedNatural20.setValue(-1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_3.p_result::LiteralUnlimitedNatural38
		addToElementRepository("LiteralUnlimitedNatural38", DefaultValue_Structures_A_bDefaultValues_B_3_p_result_LiteralUnlimitedNatural38);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_result_LiteralUnlimitedNatural38.setName("LiteralUnlimitedNatural38");
		DefaultValue_Structures_A_bDefaultValues_B_3_p_result_LiteralUnlimitedNatural38.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_result_LiteralUnlimitedNatural38.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_4.p_object::LiteralUnlimitedNatural83
		addToElementRepository("LiteralUnlimitedNatural83", DefaultValue_Structures_A_bDefaultValues_B_4_p_object_LiteralUnlimitedNatural83);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_object_LiteralUnlimitedNatural83.setName("LiteralUnlimitedNatural83");
		DefaultValue_Structures_A_bDefaultValues_B_4_p_object_LiteralUnlimitedNatural83.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_object_LiteralUnlimitedNatural83.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_instantiate_A_A()_result::LiteralUnlimitedNatural127
		addToElementRepository("LiteralUnlimitedNatural127", DefaultValue_Structures_instantiate_A_A__result_LiteralUnlimitedNatural127);
		DefaultValue_Structures_instantiate_A_A__result_LiteralUnlimitedNatural127.setName("LiteralUnlimitedNatural127");
		DefaultValue_Structures_instantiate_A_A__result_LiteralUnlimitedNatural127.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_A__result_LiteralUnlimitedNatural127.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_b::LiteralUnlimitedNatural25
		addToElementRepository("LiteralUnlimitedNatural25", DefaultValue_Structures_A_b_LiteralUnlimitedNatural25);
		DefaultValue_Structures_A_b_LiteralUnlimitedNatural25.setName("LiteralUnlimitedNatural25");
		DefaultValue_Structures_A_b_LiteralUnlimitedNatural25.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_b_LiteralUnlimitedNatural25.setValue(-1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_1.p_object::LiteralUnlimitedNatural96
		addToElementRepository("LiteralUnlimitedNatural96", DefaultValue_Structures_A_bDefaultValues_B_1_p_object_LiteralUnlimitedNatural96);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_object_LiteralUnlimitedNatural96.setName("LiteralUnlimitedNatural96");
		DefaultValue_Structures_A_bDefaultValues_B_1_p_object_LiteralUnlimitedNatural96.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_object_LiteralUnlimitedNatural96.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_1.p_result::LiteralUnlimitedNatural98
		addToElementRepository("LiteralUnlimitedNatural98", DefaultValue_Structures_A_bDefaultValues_B_1_p_result_LiteralUnlimitedNatural98);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_result_LiteralUnlimitedNatural98.setName("LiteralUnlimitedNatural98");
		DefaultValue_Structures_A_bDefaultValues_B_1_p_result_LiteralUnlimitedNatural98.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_result_LiteralUnlimitedNatural98.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_2.p_result::LiteralUnlimitedNatural64
		addToElementRepository("LiteralUnlimitedNatural64", DefaultValue_Structures_A_bDefaultValues_B_2_p_result_LiteralUnlimitedNatural64);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_result_LiteralUnlimitedNatural64.setName("LiteralUnlimitedNatural64");
		DefaultValue_Structures_A_bDefaultValues_B_2_p_result_LiteralUnlimitedNatural64.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_result_LiteralUnlimitedNatural64.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_A_bDefaultValues_B_4.p_value::LiteralUnlimitedNatural85
		addToElementRepository("LiteralUnlimitedNatural85", DefaultValue_Structures_A_bDefaultValues_B_4_p_value_LiteralUnlimitedNatural85);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_value_LiteralUnlimitedNatural85.setName("LiteralUnlimitedNatural85");
		DefaultValue_Structures_A_bDefaultValues_B_4_p_value_LiteralUnlimitedNatural85.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_value_LiteralUnlimitedNatural85.setValue(1);
		// LiteralUnlimitedNatural DefaultValue_Structures_assert_A_testDefaultValues_pList::LiteralUnlimitedNatural8
		addToElementRepository("LiteralUnlimitedNatural8", DefaultValue_Structures_assert_A_testDefaultValues_pList_LiteralUnlimitedNatural8);
		DefaultValue_Structures_assert_A_testDefaultValues_pList_LiteralUnlimitedNatural8.setName("LiteralUnlimitedNatural8");
		DefaultValue_Structures_assert_A_testDefaultValues_pList_LiteralUnlimitedNatural8.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_testDefaultValues_pList_LiteralUnlimitedNatural8.setValue(-1);
		// LiteralUnlimitedNatural DefaultValue_Structures_instantiate_A_A()_target::LiteralUnlimitedNatural126
		addToElementRepository("LiteralUnlimitedNatural126", DefaultValue_Structures_instantiate_A_A__target_LiteralUnlimitedNatural126);
		DefaultValue_Structures_instantiate_A_A__target_LiteralUnlimitedNatural126.setName("LiteralUnlimitedNatural126");
		DefaultValue_Structures_instantiate_A_A__target_LiteralUnlimitedNatural126.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_A__target_LiteralUnlimitedNatural126.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow DefaultValue_Structures_A_bDefaultValues::ObjectFlow27
		addToElementRepository("ObjectFlow27", DefaultValue_Structures_A_bDefaultValues_ObjectFlow27);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow27.setName("ObjectFlow27");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow27.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow27.setSource(DefaultValue_Structures_A_bDefaultValues_Create_B_1_result);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow27.setTarget(DefaultValue_Structures_A_bDefaultValues_B_1_p_object);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow27.setGuard(DefaultValue_Structures_A_bDefaultValues_ObjectFlow27_LiteralBoolean28);
		// ObjectFlow DefaultValue_Structures_A_bDefaultValues::ObjectFlow70
		addToElementRepository("ObjectFlow70", DefaultValue_Structures_A_bDefaultValues_ObjectFlow70);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow70.setName("ObjectFlow70");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow70.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow70.setSource(DefaultValue_Structures_A_bDefaultValues_Integer_3_result);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow70.setTarget(DefaultValue_Structures_A_bDefaultValues_B_3_p_value);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow70.setGuard(DefaultValue_Structures_A_bDefaultValues_ObjectFlow70_LiteralBoolean72);
		// ObjectFlow DefaultValue_Structures_assert_A::ObjectFlow4
		addToElementRepository("ObjectFlow4", DefaultValue_Structures_assert_A_ObjectFlow4);
		DefaultValue_Structures_assert_A_ObjectFlow4.setName("ObjectFlow4");
		DefaultValue_Structures_assert_A_ObjectFlow4.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_assert_A_ObjectFlow4.setSource(DefaultValue_Structures_assert_A_Read_b_p_result);
		DefaultValue_Structures_assert_A_ObjectFlow4.setTarget(DefaultValue_Structures_assert_A_Test_Default_Values_pList);
		DefaultValue_Structures_assert_A_ObjectFlow4.setGuard(DefaultValue_Structures_assert_A_ObjectFlow4_LiteralBoolean6);
		// ObjectFlow DefaultValue_Structures_A_bDefaultValues::ObjectFlow30
		addToElementRepository("ObjectFlow30", DefaultValue_Structures_A_bDefaultValues_ObjectFlow30);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow30.setName("ObjectFlow30");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow30.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow30.setSource(DefaultValue_Structures_A_bDefaultValues_B_3_p_result);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow30.setTarget(DefaultValue_Structures_A_bDefaultValues_bList_node);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow30.setGuard(DefaultValue_Structures_A_bDefaultValues_ObjectFlow30_LiteralBoolean32);
		// ObjectFlow DefaultValue_Structures_A_bDefaultValues::ObjectFlow73
		addToElementRepository("ObjectFlow73", DefaultValue_Structures_A_bDefaultValues_ObjectFlow73);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow73.setName("ObjectFlow73");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow73.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow73.setSource(DefaultValue_Structures_A_bDefaultValues_B_2_p_result);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow73.setTarget(DefaultValue_Structures_A_bDefaultValues_bList_node);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow73.setGuard(DefaultValue_Structures_A_bDefaultValues_ObjectFlow73_LiteralBoolean74);
		// ObjectFlow DefaultValue_Structures_instantiate_A::ObjectFlow130
		addToElementRepository("ObjectFlow130", DefaultValue_Structures_instantiate_A_ObjectFlow130);
		DefaultValue_Structures_instantiate_A_ObjectFlow130.setName("ObjectFlow130");
		DefaultValue_Structures_instantiate_A_ObjectFlow130.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_instantiate_A_ObjectFlow130.setSource(DefaultValue_Structures_instantiate_A_A__result);
		DefaultValue_Structures_instantiate_A_ObjectFlow130.setTarget(DefaultValue_Structures_instantiate_A_a_node);
		DefaultValue_Structures_instantiate_A_ObjectFlow130.setGuard(DefaultValue_Structures_instantiate_A_ObjectFlow130_LiteralBoolean131);
		// ObjectFlow DefaultValue_Structures_A_bDefaultValues::ObjectFlow76
		addToElementRepository("ObjectFlow76", DefaultValue_Structures_A_bDefaultValues_ObjectFlow76);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow76.setName("ObjectFlow76");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow76.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow76.setSource(DefaultValue_Structures_A_bDefaultValues_Create_B_2_result);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow76.setTarget(DefaultValue_Structures_A_bDefaultValues_B_2_p_object);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow76.setGuard(DefaultValue_Structures_A_bDefaultValues_ObjectFlow76_LiteralBoolean78);
		// ObjectFlow DefaultValue_Structures_assert_A::ObjectFlow9
		addToElementRepository("ObjectFlow9", DefaultValue_Structures_assert_A_ObjectFlow9);
		DefaultValue_Structures_assert_A_ObjectFlow9.setName("ObjectFlow9");
		DefaultValue_Structures_assert_A_ObjectFlow9.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_assert_A_ObjectFlow9.setSource(DefaultValue_Structures_assert_A_a_node);
		DefaultValue_Structures_assert_A_ObjectFlow9.setTarget(DefaultValue_Structures_assert_A_Read_a_b_object);
		DefaultValue_Structures_assert_A_ObjectFlow9.setGuard(DefaultValue_Structures_assert_A_ObjectFlow9_LiteralBoolean10);
		// ObjectFlow DefaultValue_Structures_A_bDefaultValues::ObjectFlow33
		addToElementRepository("ObjectFlow33", DefaultValue_Structures_A_bDefaultValues_ObjectFlow33);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow33.setName("ObjectFlow33");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow33.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow33.setSource(DefaultValue_Structures_A_bDefaultValues_Integer_4_result);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow33.setTarget(DefaultValue_Structures_A_bDefaultValues_B_4_p_value);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow33.setGuard(DefaultValue_Structures_A_bDefaultValues_ObjectFlow33_LiteralBoolean34);
		// ObjectFlow DefaultValue_Structures_A_bDefaultValues::ObjectFlow91
		addToElementRepository("ObjectFlow91", DefaultValue_Structures_A_bDefaultValues_ObjectFlow91);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow91.setName("ObjectFlow91");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow91.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow91.setSource(DefaultValue_Structures_A_bDefaultValues_B_4_p_result);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow91.setTarget(DefaultValue_Structures_A_bDefaultValues_bList_node);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow91.setGuard(DefaultValue_Structures_A_bDefaultValues_ObjectFlow91_LiteralBoolean92);
		// ObjectFlow DefaultValue_Structures_A_bDefaultValues::ObjectFlow44
		addToElementRepository("ObjectFlow44", DefaultValue_Structures_A_bDefaultValues_ObjectFlow44);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow44.setName("ObjectFlow44");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow44.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow44.setSource(DefaultValue_Structures_A_bDefaultValues_Integer_1_result);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow44.setTarget(DefaultValue_Structures_A_bDefaultValues_B_1_p_value);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow44.setGuard(DefaultValue_Structures_A_bDefaultValues_ObjectFlow44_LiteralBoolean46);
		// ObjectFlow DefaultValue_Structures_A_bDefaultValues::ObjectFlow50
		addToElementRepository("ObjectFlow50", DefaultValue_Structures_A_bDefaultValues_ObjectFlow50);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow50.setName("ObjectFlow50");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow50.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow50.setSource(DefaultValue_Structures_A_bDefaultValues_B_1_p_result);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow50.setTarget(DefaultValue_Structures_A_bDefaultValues_bList_node);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow50.setGuard(DefaultValue_Structures_A_bDefaultValues_ObjectFlow50_LiteralBoolean51);
		// ObjectFlow DefaultValue_Structures_A_bDefaultValues::ObjectFlow47
		addToElementRepository("ObjectFlow47", DefaultValue_Structures_A_bDefaultValues_ObjectFlow47);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow47.setName("ObjectFlow47");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow47.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow47.setSource(DefaultValue_Structures_A_bDefaultValues_Integer_2_result);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow47.setTarget(DefaultValue_Structures_A_bDefaultValues_B_2_p_value);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow47.setGuard(DefaultValue_Structures_A_bDefaultValues_ObjectFlow47_LiteralBoolean48);
		// ObjectFlow DefaultValue_Structures_A_bDefaultValues::ObjectFlow54
		addToElementRepository("ObjectFlow54", DefaultValue_Structures_A_bDefaultValues_ObjectFlow54);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow54.setName("ObjectFlow54");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow54.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow54.setSource(DefaultValue_Structures_A_bDefaultValues_Create_B_4_result);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow54.setTarget(DefaultValue_Structures_A_bDefaultValues_B_4_p_object);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow54.setGuard(DefaultValue_Structures_A_bDefaultValues_ObjectFlow54_LiteralBoolean56);
		// ObjectFlow DefaultValue_Structures_A_bDefaultValues::ObjectFlow104
		addToElementRepository("ObjectFlow104", DefaultValue_Structures_A_bDefaultValues_ObjectFlow104);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow104.setName("ObjectFlow104");
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow104.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow104.setSource(DefaultValue_Structures_A_bDefaultValues_Create_B_3_result);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow104.setTarget(DefaultValue_Structures_A_bDefaultValues_B_3_p_object);
		DefaultValue_Structures_A_bDefaultValues_ObjectFlow104.setGuard(DefaultValue_Structures_A_bDefaultValues_ObjectFlow104_LiteralBoolean106);
		// ObjectFlow DefaultValue_Structures_main::ObjectFlow114
		addToElementRepository("ObjectFlow114", DefaultValue_Structures_main_ObjectFlow114);
		DefaultValue_Structures_main_ObjectFlow114.setName("ObjectFlow114");
		DefaultValue_Structures_main_ObjectFlow114.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_main_ObjectFlow114.setSource(DefaultValue_Structures_main_instantiate_A_a);
		DefaultValue_Structures_main_ObjectFlow114.setTarget(DefaultValue_Structures_main_assert_A_a);
		DefaultValue_Structures_main_ObjectFlow114.setGuard(DefaultValue_Structures_main_ObjectFlow114_LiteralBoolean115);
		// ObjectFlow DefaultValue_Structures_instantiate_A::ObjectFlow133
		addToElementRepository("ObjectFlow133", DefaultValue_Structures_instantiate_A_ObjectFlow133);
		DefaultValue_Structures_instantiate_A_ObjectFlow133.setName("ObjectFlow133");
		DefaultValue_Structures_instantiate_A_ObjectFlow133.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_instantiate_A_ObjectFlow133.setSource(DefaultValue_Structures_instantiate_A_Create_A_result);
		DefaultValue_Structures_instantiate_A_ObjectFlow133.setTarget(DefaultValue_Structures_instantiate_A_A__target);
		DefaultValue_Structures_instantiate_A_ObjectFlow133.setGuard(DefaultValue_Structures_instantiate_A_ObjectFlow133_LiteralBoolean135);
		// ObjectFlow DefaultValue_Structures_assert_A::ObjectFlow17
		addToElementRepository("ObjectFlow17", DefaultValue_Structures_assert_A_ObjectFlow17);
		DefaultValue_Structures_assert_A_ObjectFlow17.setName("ObjectFlow17");
		DefaultValue_Structures_assert_A_ObjectFlow17.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_assert_A_ObjectFlow17.setSource(DefaultValue_Structures_assert_A_Read_a_b_result);
		DefaultValue_Structures_assert_A_ObjectFlow17.setTarget(DefaultValue_Structures_assert_A_Read_b_p_object);
		DefaultValue_Structures_assert_A_ObjectFlow17.setGuard(DefaultValue_Structures_assert_A_ObjectFlow17_LiteralBoolean18);
	}

	private void initializeOpaqueExpression_Instances()
	{
		// OpaqueExpression DefaultValue_Structures_A_b::OpaqueExpression24
		addToElementRepository("OpaqueExpression24", DefaultValue_Structures_A_b_OpaqueExpression24);
		DefaultValue_Structures_A_b_OpaqueExpression24.setName("OpaqueExpression24");
		DefaultValue_Structures_A_b_OpaqueExpression24.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_b_OpaqueExpression24.setType(DefaultValue_Structures_B);
		DefaultValue_Structures_A_b_OpaqueExpression24.setBehavior(DefaultValue_Structures_A_bDefaultValues);
	}

	private void initializeOperation_Instances()
	{
		// Operation DefaultValue_Structures_A::A_A
		addToElementRepository("A_A", DefaultValue_Structures_A_A_A);
		DefaultValue_Structures_A_A_A.setName("A");
		DefaultValue_Structures_A_A_A.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_A_A.addOwnedParameter(DefaultValue_Structures_A_A_A_result);
		DefaultValue_Structures_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation DefaultValue_Structures_B::B_B
		addToElementRepository("B_B", DefaultValue_Structures_B_B_B);
		DefaultValue_Structures_B_B_B.setName("B");
		DefaultValue_Structures_B_B_B.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_B_B_B.addOwnedParameter(DefaultValue_Structures_B_B_B_result);
		DefaultValue_Structures_B_B_B.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin DefaultValue_Structures_instantiate_A_Create_A::result
		addToElementRepository("result", DefaultValue_Structures_instantiate_A_Create_A_result);
		DefaultValue_Structures_instantiate_A_Create_A_result.setName("result");
		DefaultValue_Structures_instantiate_A_Create_A_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_Create_A_result.setType(DefaultValue_Structures_A);
		// OutputPin DefaultValue_Structures_A_bDefaultValues_Integer(1)::result
		addToElementRepository("result", DefaultValue_Structures_A_bDefaultValues_Integer_1_result);
		DefaultValue_Structures_A_bDefaultValues_Integer_1_result.setName("result");
		DefaultValue_Structures_A_bDefaultValues_Integer_1_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_1_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin DefaultValue_Structures_A_bDefaultValues_Integer(4)::result
		addToElementRepository("result", DefaultValue_Structures_A_bDefaultValues_Integer_4_result);
		DefaultValue_Structures_A_bDefaultValues_Integer_4_result.setName("result");
		DefaultValue_Structures_A_bDefaultValues_Integer_4_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin DefaultValue_Structures_A_bDefaultValues_Create B_4::result
		addToElementRepository("result", DefaultValue_Structures_A_bDefaultValues_Create_B_4_result);
		DefaultValue_Structures_A_bDefaultValues_Create_B_4_result.setName("result");
		DefaultValue_Structures_A_bDefaultValues_Create_B_4_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_4_result.setType(DefaultValue_Structures_B);
		// OutputPin DefaultValue_Structures_A_bDefaultValues_B_3.p::result
		addToElementRepository("result", DefaultValue_Structures_A_bDefaultValues_B_3_p_result);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_result.setName("result");
		DefaultValue_Structures_A_bDefaultValues_B_3_p_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_3_p_result.setType(DefaultValue_Structures_B);
		// OutputPin DefaultValue_Structures_instantiate_A_A()::result
		addToElementRepository("result", DefaultValue_Structures_instantiate_A_A__result);
		DefaultValue_Structures_instantiate_A_A__result.setName("result");
		DefaultValue_Structures_instantiate_A_A__result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_instantiate_A_A__result.setType(DefaultValue_Structures_A);
		// OutputPin DefaultValue_Structures_A_bDefaultValues_B_4.p::result
		addToElementRepository("result", DefaultValue_Structures_A_bDefaultValues_B_4_p_result);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_result.setName("result");
		DefaultValue_Structures_A_bDefaultValues_B_4_p_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_4_p_result.setType(DefaultValue_Structures_B);
		// OutputPin DefaultValue_Structures_assert_A_Read a.b::result
		addToElementRepository("result", DefaultValue_Structures_assert_A_Read_a_b_result);
		DefaultValue_Structures_assert_A_Read_a_b_result.setName("result");
		DefaultValue_Structures_assert_A_Read_a_b_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_a_b_result.setType(DefaultValue_Structures_B);
		DefaultValue_Structures_assert_A_Read_a_b_result.setUpper(-1);
		DefaultValue_Structures_assert_A_Read_a_b_result.setLower(4);
		// OutputPin DefaultValue_Structures_A_bDefaultValues_B_2.p::result
		addToElementRepository("result", DefaultValue_Structures_A_bDefaultValues_B_2_p_result);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_result.setName("result");
		DefaultValue_Structures_A_bDefaultValues_B_2_p_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_2_p_result.setType(DefaultValue_Structures_B);
		// OutputPin DefaultValue_Structures_A_bDefaultValues_Integer(2)::result
		addToElementRepository("result", DefaultValue_Structures_A_bDefaultValues_Integer_2_result);
		DefaultValue_Structures_A_bDefaultValues_Integer_2_result.setName("result");
		DefaultValue_Structures_A_bDefaultValues_Integer_2_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_2_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin DefaultValue_Structures_A_bDefaultValues_Create B_1::result
		addToElementRepository("result", DefaultValue_Structures_A_bDefaultValues_Create_B_1_result);
		DefaultValue_Structures_A_bDefaultValues_Create_B_1_result.setName("result");
		DefaultValue_Structures_A_bDefaultValues_Create_B_1_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_1_result.setType(DefaultValue_Structures_B);
		// OutputPin DefaultValue_Structures_main_instantiate_A::a
		addToElementRepository("a", DefaultValue_Structures_main_instantiate_A_a);
		DefaultValue_Structures_main_instantiate_A_a.setName("a");
		DefaultValue_Structures_main_instantiate_A_a.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_main_instantiate_A_a.setType(DefaultValue_Structures_A);
		// OutputPin DefaultValue_Structures_assert_A_Read b.p::result
		addToElementRepository("result", DefaultValue_Structures_assert_A_Read_b_p_result);
		DefaultValue_Structures_assert_A_Read_b_p_result.setName("result");
		DefaultValue_Structures_assert_A_Read_b_p_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_b_p_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin DefaultValue_Structures_A_bDefaultValues_Create B_3::result
		addToElementRepository("result", DefaultValue_Structures_A_bDefaultValues_Create_B_3_result);
		DefaultValue_Structures_A_bDefaultValues_Create_B_3_result.setName("result");
		DefaultValue_Structures_A_bDefaultValues_Create_B_3_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_3_result.setType(DefaultValue_Structures_B);
		// OutputPin DefaultValue_Structures_A_bDefaultValues_Create B_2::result
		addToElementRepository("result", DefaultValue_Structures_A_bDefaultValues_Create_B_2_result);
		DefaultValue_Structures_A_bDefaultValues_Create_B_2_result.setName("result");
		DefaultValue_Structures_A_bDefaultValues_Create_B_2_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Create_B_2_result.setType(DefaultValue_Structures_B);
		// OutputPin DefaultValue_Structures_A_bDefaultValues_Integer(3)::result
		addToElementRepository("result", DefaultValue_Structures_A_bDefaultValues_Integer_3_result);
		DefaultValue_Structures_A_bDefaultValues_Integer_3_result.setName("result");
		DefaultValue_Structures_A_bDefaultValues_Integer_3_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_3_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin DefaultValue_Structures_A_bDefaultValues_B_1.p::result
		addToElementRepository("result", DefaultValue_Structures_A_bDefaultValues_B_1_p_result);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_result.setName("result");
		DefaultValue_Structures_A_bDefaultValues_B_1_p_result.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_B_1_p_result.setType(DefaultValue_Structures_B);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport DefaultValue_Structures::PackageImport112
		addToElementRepository("PackageImport112", DefaultValue_Structures_PackageImport112);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter DefaultValue_Structures_assert_A_testDefaultValues::pList
		addToElementRepository("pList", DefaultValue_Structures_assert_A_testDefaultValues_pList);
		DefaultValue_Structures_assert_A_testDefaultValues_pList.setName("pList");
		DefaultValue_Structures_assert_A_testDefaultValues_pList.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_testDefaultValues_pList.setUpper(-1);
		DefaultValue_Structures_assert_A_testDefaultValues_pList.setLower(4);
		DefaultValue_Structures_assert_A_testDefaultValues_pList.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter DefaultValue_Structures_A_bDefaultValues::bList
		addToElementRepository("bList", DefaultValue_Structures_A_bDefaultValues_bList);
		DefaultValue_Structures_A_bDefaultValues_bList.setName("bList");
		DefaultValue_Structures_A_bDefaultValues_bList.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_bList.setUpper(-1);
		DefaultValue_Structures_A_bDefaultValues_bList.setLower(0);
		DefaultValue_Structures_A_bDefaultValues_bList.setType(DefaultValue_Structures_B);
		DefaultValue_Structures_A_bDefaultValues_bList.setDirection(ParameterDirectionKind.return_);
		// Parameter DefaultValue_Structures_assert_A::a
		addToElementRepository("a", DefaultValue_Structures_assert_A_a);
		DefaultValue_Structures_assert_A_a.setName("a");
		DefaultValue_Structures_assert_A_a.setVisibility(VisibilityKind.public_);
		// Parameter DefaultValue_Structures_B_B_B::result
		addToElementRepository("result", DefaultValue_Structures_B_B_B_result);
		DefaultValue_Structures_B_B_B_result.setName("result");
		DefaultValue_Structures_B_B_B_result.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_B_B_B_result.setType(DefaultValue_Structures_B);
		DefaultValue_Structures_B_B_B_result.setDirection(ParameterDirectionKind.return_);
		// Parameter DefaultValue_Structures_A_A_A::result
		addToElementRepository("result", DefaultValue_Structures_A_A_A_result);
		DefaultValue_Structures_A_A_A_result.setName("result");
		DefaultValue_Structures_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_A_A_A_result.setType(DefaultValue_Structures_A);
		DefaultValue_Structures_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter DefaultValue_Structures_instantiate_A::a
		addToElementRepository("a", DefaultValue_Structures_instantiate_A_a);
		DefaultValue_Structures_instantiate_A_a.setName("a");
		DefaultValue_Structures_instantiate_A_a.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_instantiate_A_a.setType(DefaultValue_Structures_A);
		DefaultValue_Structures_instantiate_A_a.setDirection(ParameterDirectionKind.return_);
	}

	private void initializeProperty_Instances()
	{
		// Property DefaultValue_Structures_A::b
		addToElementRepository("b", DefaultValue_Structures_A_b);
		DefaultValue_Structures_A_b.setName("b");
		DefaultValue_Structures_A_b.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_b.setUpper(-1);
		DefaultValue_Structures_A_b.setLower(4);
		DefaultValue_Structures_A_b.setType(DefaultValue_Structures_B);
		DefaultValue_Structures_A_b.setDefaultValue(DefaultValue_Structures_A_b_OpaqueExpression24);
		// Property DefaultValue_Structures_B::p
		addToElementRepository("p", DefaultValue_Structures_B_p);
		DefaultValue_Structures_B_p.setName("p");
		DefaultValue_Structures_B_p.setVisibility(VisibilityKind.public_);
		
		DefaultValue_Structures_B_p.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction DefaultValue_Structures_assert_A::Read b.p
		addToElementRepository("Read b.p", DefaultValue_Structures_assert_A_Read_b_p);
		DefaultValue_Structures_assert_A_Read_b_p.setName("Read b.p");
		DefaultValue_Structures_assert_A_Read_b_p.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_b_p.setStructuralFeature(DefaultValue_Structures_B_p);
		DefaultValue_Structures_assert_A_Read_b_p.setObject(DefaultValue_Structures_assert_A_Read_b_p_object);
		DefaultValue_Structures_assert_A_Read_b_p.setResult(DefaultValue_Structures_assert_A_Read_b_p_result);
		// ReadStructuralFeatureAction DefaultValue_Structures_assert_A::Read a.b
		addToElementRepository("Read a.b", DefaultValue_Structures_assert_A_Read_a_b);
		DefaultValue_Structures_assert_A_Read_a_b.setName("Read a.b");
		DefaultValue_Structures_assert_A_Read_a_b.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_assert_A_Read_a_b.setStructuralFeature(DefaultValue_Structures_A_b);
		DefaultValue_Structures_assert_A_Read_a_b.setObject(DefaultValue_Structures_assert_A_Read_a_b_object);
		DefaultValue_Structures_assert_A_Read_a_b.setResult(DefaultValue_Structures_assert_A_Read_a_b_result);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction DefaultValue_Structures_A_bDefaultValues::Integer(4)
		addToElementRepository("Integer(4)", DefaultValue_Structures_A_bDefaultValues_Integer_4);
		DefaultValue_Structures_A_bDefaultValues_Integer_4.setName("Integer(4)");
		DefaultValue_Structures_A_bDefaultValues_Integer_4.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_4.setValue(DefaultValue_Structures_A_bDefaultValues_Integer_4_LiteralInteger61);
		DefaultValue_Structures_A_bDefaultValues_Integer_4.setResult(DefaultValue_Structures_A_bDefaultValues_Integer_4_result);
		// ValueSpecificationAction DefaultValue_Structures_A_bDefaultValues::Integer(3)
		addToElementRepository("Integer(3)", DefaultValue_Structures_A_bDefaultValues_Integer_3);
		DefaultValue_Structures_A_bDefaultValues_Integer_3.setName("Integer(3)");
		DefaultValue_Structures_A_bDefaultValues_Integer_3.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_3.setValue(DefaultValue_Structures_A_bDefaultValues_Integer_3_LiteralInteger80);
		DefaultValue_Structures_A_bDefaultValues_Integer_3.setResult(DefaultValue_Structures_A_bDefaultValues_Integer_3_result);
		// ValueSpecificationAction DefaultValue_Structures_A_bDefaultValues::Integer(2)
		addToElementRepository("Integer(2)", DefaultValue_Structures_A_bDefaultValues_Integer_2);
		DefaultValue_Structures_A_bDefaultValues_Integer_2.setName("Integer(2)");
		DefaultValue_Structures_A_bDefaultValues_Integer_2.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_2.setValue(DefaultValue_Structures_A_bDefaultValues_Integer_2_LiteralInteger60);
		DefaultValue_Structures_A_bDefaultValues_Integer_2.setResult(DefaultValue_Structures_A_bDefaultValues_Integer_2_result);
		// ValueSpecificationAction DefaultValue_Structures_A_bDefaultValues::Integer(1)
		addToElementRepository("Integer(1)", DefaultValue_Structures_A_bDefaultValues_Integer_1);
		DefaultValue_Structures_A_bDefaultValues_Integer_1.setName("Integer(1)");
		DefaultValue_Structures_A_bDefaultValues_Integer_1.setVisibility(VisibilityKind.public_);
		DefaultValue_Structures_A_bDefaultValues_Integer_1.setValue(DefaultValue_Structures_A_bDefaultValues_Integer_1_LiteralInteger111);
		DefaultValue_Structures_A_bDefaultValues_Integer_1.setResult(DefaultValue_Structures_A_bDefaultValues_Integer_1_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // DefaultValue_StructuresModel
