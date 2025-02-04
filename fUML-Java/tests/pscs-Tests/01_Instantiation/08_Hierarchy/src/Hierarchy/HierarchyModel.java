/*
 * HierarchyModel.java
 * 
 * Auto-generated file
 */
package Hierarchy;

import uml.values.LiteralBoolean;
import uml.values.LiteralUnlimitedNatural;
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
import uml.activities.ControlFlow;
import uml.activities.ForkNode;
import uml.actions.CreateObjectAction;
import uml.actions.ValueSpecificationAction;
import uml.commonbehavior.FunctionBehavior;
import uml.actions.CallBehaviorAction;
import uml.classification.Property;
import utils.primitivetypes.PrimitiveTypesModel;
import uml.classification.ParameterDirectionKind;
import uml.simpleclassifiers.PrimitiveType;
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

public class HierarchyModel extends InMemoryModel
{
	private static HierarchyModel instance;

	/*
	 * Model Hierarchy
	 */
	public Package Hierarchy = new Package();
		public Comment Hierarchy_Comment0 = new Comment();
		public Class_ Hierarchy_B = new Class_();
			public Property Hierarchy_B_c = new Property();
		public Activity Hierarchy_main = new Activity();
			public CallBehaviorAction Hierarchy_main_instantiate_A = new CallBehaviorAction();
				public OutputPin Hierarchy_main_instantiate_A_a = new OutputPin();
					public LiteralUnlimitedNatural Hierarchy_main_instantiate_A_a_LiteralUnlimitedNatural1 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_main_instantiate_A_a_LiteralInteger2 = new LiteralInteger();
					public LiteralInteger Hierarchy_main_instantiate_A_a_LiteralInteger3 = new LiteralInteger();
			public ObjectFlow Hierarchy_main_ObjectFlow4 = new ObjectFlow();
				public LiteralBoolean Hierarchy_main_ObjectFlow4_LiteralBoolean5 = new LiteralBoolean();
				public LiteralInteger Hierarchy_main_ObjectFlow4_LiteralInteger6 = new LiteralInteger();
			public CallBehaviorAction Hierarchy_main_assert_A = new CallBehaviorAction();
				public InputPin Hierarchy_main_assert_A_a = new InputPin();
					public LiteralUnlimitedNatural Hierarchy_main_assert_A_a_LiteralUnlimitedNatural7 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_main_assert_A_a_LiteralInteger8 = new LiteralInteger();
					public LiteralInteger Hierarchy_main_assert_A_a_LiteralInteger9 = new LiteralInteger();
		public Activity Hierarchy_instantiate_A = new Activity();
			public Parameter Hierarchy_instantiate_A_a = new Parameter();
			public ActivityParameterNode Hierarchy_instantiate_A_a_node = new ActivityParameterNode();
				public LiteralInteger Hierarchy_instantiate_A_a_node_LiteralInteger10 = new LiteralInteger();
			public CallOperationAction Hierarchy_instantiate_A_A_ = new CallOperationAction();
				public OutputPin Hierarchy_instantiate_A_A__result = new OutputPin();
					public LiteralUnlimitedNatural Hierarchy_instantiate_A_A__result_LiteralUnlimitedNatural11 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_instantiate_A_A__result_LiteralInteger12 = new LiteralInteger();
					public LiteralInteger Hierarchy_instantiate_A_A__result_LiteralInteger13 = new LiteralInteger();
				public InputPin Hierarchy_instantiate_A_A__target = new InputPin();
					public LiteralUnlimitedNatural Hierarchy_instantiate_A_A__target_LiteralUnlimitedNatural14 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_instantiate_A_A__target_LiteralInteger15 = new LiteralInteger();
			public ObjectFlow Hierarchy_instantiate_A_ObjectFlow16 = new ObjectFlow();
				public LiteralBoolean Hierarchy_instantiate_A_ObjectFlow16_LiteralBoolean17 = new LiteralBoolean();
				public LiteralInteger Hierarchy_instantiate_A_ObjectFlow16_LiteralInteger18 = new LiteralInteger();
			public ObjectFlow Hierarchy_instantiate_A_ObjectFlow19 = new ObjectFlow();
				public LiteralBoolean Hierarchy_instantiate_A_ObjectFlow19_LiteralBoolean20 = new LiteralBoolean();
				public LiteralInteger Hierarchy_instantiate_A_ObjectFlow19_LiteralInteger21 = new LiteralInteger();
			public CreateObjectAction Hierarchy_instantiate_A_Create_A = new CreateObjectAction();
				public OutputPin Hierarchy_instantiate_A_Create_A_result = new OutputPin();
					public LiteralUnlimitedNatural Hierarchy_instantiate_A_Create_A_result_LiteralUnlimitedNatural22 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_instantiate_A_Create_A_result_LiteralInteger23 = new LiteralInteger();
		public Class_ Hierarchy_D = new Class_();
			public Property Hierarchy_D_e = new Property();
		public Class_ Hierarchy_A = new Class_();
			public Property Hierarchy_A_b = new Property();
			public Operation Hierarchy_A_A_A = new Operation();
				public Parameter Hierarchy_A_A_A_result = new Parameter();
		public Class_ Hierarchy_C = new Class_();
			public Property Hierarchy_C_d = new Property();
		public Activity Hierarchy_assert_A = new Activity();
			public ForkNode Hierarchy_assert_A_Fork_a_b = new ForkNode();
			public ReadStructuralFeatureAction Hierarchy_assert_A_Read_a_b_c_d_e = new ReadStructuralFeatureAction();
				public InputPin Hierarchy_assert_A_Read_a_b_c_d_e_object = new InputPin();
					public LiteralInteger Hierarchy_assert_A_Read_a_b_c_d_e_object_LiteralInteger24 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_Read_a_b_c_d_e_object_LiteralUnlimitedNatural25 = new LiteralUnlimitedNatural();
				public OutputPin Hierarchy_assert_A_Read_a_b_c_d_e_result = new OutputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_Read_a_b_c_d_e_result_LiteralUnlimitedNatural26 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_Read_a_b_c_d_e_result_LiteralInteger27 = new LiteralInteger();
			public ControlFlow Hierarchy_assert_A_ControlFlow28 = new ControlFlow();
			public ForkNode Hierarchy_assert_A_Fork_a_b_c = new ForkNode();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow29 = new ObjectFlow();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow29_LiteralBoolean30 = new LiteralBoolean();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow29_LiteralInteger31 = new LiteralInteger();
			public CallBehaviorAction Hierarchy_assert_A_a_b_size_ = new CallBehaviorAction();
				public InputPin Hierarchy_assert_A_a_b_size__list = new InputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_a_b_size__list_LiteralUnlimitedNatural32 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_a_b_size__list_LiteralInteger33 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_a_b_size__list_LiteralInteger34 = new LiteralInteger();
				public OutputPin Hierarchy_assert_A_a_b_size__result = new OutputPin();
					public LiteralInteger Hierarchy_assert_A_a_b_size__result_LiteralInteger35 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_a_b_size__result_LiteralInteger36 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_a_b_size__result_LiteralUnlimitedNatural37 = new LiteralUnlimitedNatural();
			public ValueSpecificationAction Hierarchy_assert_A_String_a_b_c_size = new ValueSpecificationAction();
				public OutputPin Hierarchy_assert_A_String_a_b_c_size_result = new OutputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_String_a_b_c_size_result_LiteralUnlimitedNatural38 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_String_a_b_c_size_result_LiteralInteger39 = new LiteralInteger();
				public LiteralString Hierarchy_assert_A_String_a_b_c_size_LiteralString40 = new LiteralString();
			public CallBehaviorAction Hierarchy_assert_A_Test_a_b_c_d_size = new CallBehaviorAction();
				public InputPin Hierarchy_assert_A_Test_a_b_c_d_size_listSize = new InputPin();
					public LiteralInteger Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralInteger41 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralUnlimitedNatural42 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralInteger43 = new LiteralInteger();
			public CallBehaviorAction Hierarchy_assert_A_WriteLine_a_b = new CallBehaviorAction();
				public InputPin Hierarchy_assert_A_WriteLine_a_b_value = new InputPin();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_value_LiteralInteger44 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a_b_value_LiteralUnlimitedNatural45 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_value_LiteralInteger46 = new LiteralInteger();
				public OutputPin Hierarchy_assert_A_WriteLine_a_b_errorStatus = new OutputPin();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralInteger47 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralUnlimitedNatural48 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralInteger49 = new LiteralInteger();
			public OpaqueBehavior Hierarchy_assert_A_testNonEmptyList = new OpaqueBehavior();
				public Parameter Hierarchy_assert_A_testNonEmptyList_listSize = new Parameter();
			public ControlFlow Hierarchy_assert_A_ControlFlow50 = new ControlFlow();
			public CallBehaviorAction Hierarchy_assert_A_a_b_c_d_e_size_ = new CallBehaviorAction();
				public InputPin Hierarchy_assert_A_a_b_c_d_e_size__list = new InputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralUnlimitedNatural51 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralInteger52 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralInteger53 = new LiteralInteger();
				public OutputPin Hierarchy_assert_A_a_b_c_d_e_size__result = new OutputPin();
					public LiteralInteger Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralInteger54 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralInteger55 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralUnlimitedNatural56 = new LiteralUnlimitedNatural();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow57 = new ObjectFlow();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow57_LiteralBoolean58 = new LiteralBoolean();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow57_LiteralInteger59 = new LiteralInteger();
			public CallBehaviorAction Hierarchy_assert_A_Test_a_b_c_size = new CallBehaviorAction();
				public InputPin Hierarchy_assert_A_Test_a_b_c_size_listSize = new InputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralUnlimitedNatural60 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralInteger61 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralInteger62 = new LiteralInteger();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow63 = new ObjectFlow();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow63_LiteralBoolean64 = new LiteralBoolean();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow63_LiteralInteger65 = new LiteralInteger();
			public ControlFlow Hierarchy_assert_A_ControlFlow66 = new ControlFlow();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow67 = new ObjectFlow();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow67_LiteralInteger68 = new LiteralInteger();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow67_LiteralBoolean69 = new LiteralBoolean();
			public ReadStructuralFeatureAction Hierarchy_assert_A_Read_a_b_c_d = new ReadStructuralFeatureAction();
				public InputPin Hierarchy_assert_A_Read_a_b_c_d_object = new InputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_Read_a_b_c_d_object_LiteralUnlimitedNatural70 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_Read_a_b_c_d_object_LiteralInteger71 = new LiteralInteger();
				public OutputPin Hierarchy_assert_A_Read_a_b_c_d_result = new OutputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_Read_a_b_c_d_result_LiteralUnlimitedNatural72 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_Read_a_b_c_d_result_LiteralInteger73 = new LiteralInteger();
			public CallBehaviorAction Hierarchy_assert_A_WriteLine_a_b_c_d_e = new CallBehaviorAction();
				public OutputPin Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus = new OutputPin();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralInteger74 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralUnlimitedNatural75 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralInteger76 = new LiteralInteger();
				public InputPin Hierarchy_assert_A_WriteLine_a_b_c_d_e_value = new InputPin();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralInteger77 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralInteger78 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralUnlimitedNatural79 = new LiteralUnlimitedNatural();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow80 = new ObjectFlow();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow80_LiteralInteger81 = new LiteralInteger();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow80_LiteralBoolean82 = new LiteralBoolean();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow83 = new ObjectFlow();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow83_LiteralInteger84 = new LiteralInteger();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow83_LiteralBoolean85 = new LiteralBoolean();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow86 = new ObjectFlow();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow86_LiteralBoolean87 = new LiteralBoolean();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow86_LiteralInteger88 = new LiteralInteger();
			public ValueSpecificationAction Hierarchy_assert_A_String_a_b_c_d_size = new ValueSpecificationAction();
				public OutputPin Hierarchy_assert_A_String_a_b_c_d_size_result = new OutputPin();
					public LiteralInteger Hierarchy_assert_A_String_a_b_c_d_size_result_LiteralInteger89 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_String_a_b_c_d_size_result_LiteralUnlimitedNatural90 = new LiteralUnlimitedNatural();
				public LiteralString Hierarchy_assert_A_String_a_b_c_d_size_LiteralString91 = new LiteralString();
			public CallBehaviorAction Hierarchy_assert_A_Test_a_b_c_d_e_size = new CallBehaviorAction();
				public InputPin Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize = new InputPin();
					public LiteralInteger Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralInteger92 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralUnlimitedNatural93 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralInteger94 = new LiteralInteger();
			public CallBehaviorAction Hierarchy_assert_A_a_b_c_size_ = new CallBehaviorAction();
				public OutputPin Hierarchy_assert_A_a_b_c_size__result = new OutputPin();
					public LiteralInteger Hierarchy_assert_A_a_b_c_size__result_LiteralInteger95 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_a_b_c_size__result_LiteralInteger96 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_a_b_c_size__result_LiteralUnlimitedNatural97 = new LiteralUnlimitedNatural();
				public InputPin Hierarchy_assert_A_a_b_c_size__list = new InputPin();
					public LiteralInteger Hierarchy_assert_A_a_b_c_size__list_LiteralInteger98 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_a_b_c_size__list_LiteralUnlimitedNatural99 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_a_b_c_size__list_LiteralInteger100 = new LiteralInteger();
			public CallBehaviorAction Hierarchy_assert_A_WriteLine_a_b_c = new CallBehaviorAction();
				public OutputPin Hierarchy_assert_A_WriteLine_a_b_c_errorStatus = new OutputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralUnlimitedNatural101 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralInteger102 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralInteger103 = new LiteralInteger();
				public InputPin Hierarchy_assert_A_WriteLine_a_b_c_value = new InputPin();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralInteger104 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralUnlimitedNatural105 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralInteger106 = new LiteralInteger();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow107 = new ObjectFlow();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow107_LiteralBoolean108 = new LiteralBoolean();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow107_LiteralInteger109 = new LiteralInteger();
			public ControlFlow Hierarchy_assert_A_ControlFlow110 = new ControlFlow();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow111 = new ObjectFlow();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow111_LiteralBoolean112 = new LiteralBoolean();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow111_LiteralInteger113 = new LiteralInteger();
			public OpaqueBehavior Hierarchy_assert_A_testEmptyList = new OpaqueBehavior();
				public Parameter Hierarchy_assert_A_testEmptyList_listSize = new Parameter();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow114 = new ObjectFlow();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow114_LiteralBoolean115 = new LiteralBoolean();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow114_LiteralInteger116 = new LiteralInteger();
			public ControlFlow Hierarchy_assert_A_ControlFlow117 = new ControlFlow();
			public ControlFlow Hierarchy_assert_A_ControlFlow118 = new ControlFlow();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow119 = new ObjectFlow();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow119_LiteralBoolean120 = new LiteralBoolean();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow119_LiteralInteger121 = new LiteralInteger();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow122 = new ObjectFlow();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow122_LiteralInteger123 = new LiteralInteger();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow122_LiteralBoolean124 = new LiteralBoolean();
			public ReadStructuralFeatureAction Hierarchy_assert_A_Read_a_b = new ReadStructuralFeatureAction();
				public OutputPin Hierarchy_assert_A_Read_a_b_result = new OutputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_Read_a_b_result_LiteralUnlimitedNatural125 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_Read_a_b_result_LiteralInteger126 = new LiteralInteger();
				public InputPin Hierarchy_assert_A_Read_a_b_object = new InputPin();
					public LiteralInteger Hierarchy_assert_A_Read_a_b_object_LiteralInteger127 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_Read_a_b_object_LiteralUnlimitedNatural128 = new LiteralUnlimitedNatural();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow129 = new ObjectFlow();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow129_LiteralBoolean130 = new LiteralBoolean();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow129_LiteralInteger131 = new LiteralInteger();
			public ControlFlow Hierarchy_assert_A_ControlFlow132 = new ControlFlow();
			public Parameter Hierarchy_assert_A_a = new Parameter();
			public ReadStructuralFeatureAction Hierarchy_assert_A_Read_a_b_c = new ReadStructuralFeatureAction();
				public OutputPin Hierarchy_assert_A_Read_a_b_c_result = new OutputPin();
					public LiteralInteger Hierarchy_assert_A_Read_a_b_c_result_LiteralInteger133 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_Read_a_b_c_result_LiteralUnlimitedNatural134 = new LiteralUnlimitedNatural();
				public InputPin Hierarchy_assert_A_Read_a_b_c_object = new InputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_Read_a_b_c_object_LiteralUnlimitedNatural135 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_Read_a_b_c_object_LiteralInteger136 = new LiteralInteger();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow137 = new ObjectFlow();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow137_LiteralInteger138 = new LiteralInteger();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow137_LiteralBoolean139 = new LiteralBoolean();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow140 = new ObjectFlow();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow140_LiteralInteger141 = new LiteralInteger();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow140_LiteralBoolean142 = new LiteralBoolean();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow143 = new ObjectFlow();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow143_LiteralInteger144 = new LiteralInteger();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow143_LiteralBoolean145 = new LiteralBoolean();
			public ControlFlow Hierarchy_assert_A_ControlFlow146 = new ControlFlow();
			public ControlFlow Hierarchy_assert_A_ControlFlow147 = new ControlFlow();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow148 = new ObjectFlow();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow148_LiteralInteger149 = new LiteralInteger();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow148_LiteralBoolean150 = new LiteralBoolean();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow151 = new ObjectFlow();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow151_LiteralBoolean152 = new LiteralBoolean();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow151_LiteralInteger153 = new LiteralInteger();
			public ForkNode Hierarchy_assert_A_Fork_a_b_c_d = new ForkNode();
			public ControlFlow Hierarchy_assert_A_ControlFlow154 = new ControlFlow();
			public ControlFlow Hierarchy_assert_A_ControlFlow155 = new ControlFlow();
			public CallBehaviorAction Hierarchy_assert_A_a_b_c_d_size_ = new CallBehaviorAction();
				public OutputPin Hierarchy_assert_A_a_b_c_d_size__result = new OutputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_a_b_c_d_size__result_LiteralUnlimitedNatural156 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_a_b_c_d_size__result_LiteralInteger157 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_a_b_c_d_size__result_LiteralInteger158 = new LiteralInteger();
				public InputPin Hierarchy_assert_A_a_b_c_d_size__list = new InputPin();
					public LiteralInteger Hierarchy_assert_A_a_b_c_d_size__list_LiteralInteger159 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_a_b_c_d_size__list_LiteralInteger160 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_a_b_c_d_size__list_LiteralUnlimitedNatural161 = new LiteralUnlimitedNatural();
			public CallBehaviorAction Hierarchy_assert_A_Test_a_b_size = new CallBehaviorAction();
				public InputPin Hierarchy_assert_A_Test_a_b_size_listSize = new InputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_Test_a_b_size_listSize_LiteralUnlimitedNatural162 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_Test_a_b_size_listSize_LiteralInteger163 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_Test_a_b_size_listSize_LiteralInteger164 = new LiteralInteger();
			public ActivityParameterNode Hierarchy_assert_A_a_node = new ActivityParameterNode();
				public LiteralInteger Hierarchy_assert_A_a_node_LiteralInteger165 = new LiteralInteger();
			public ValueSpecificationAction Hierarchy_assert_A_String_a_b_c_d_e_size = new ValueSpecificationAction();
				public LiteralString Hierarchy_assert_A_String_a_b_c_d_e_size_LiteralString166 = new LiteralString();
				public OutputPin Hierarchy_assert_A_String_a_b_c_d_e_size_result = new OutputPin();
					public LiteralInteger Hierarchy_assert_A_String_a_b_c_d_e_size_result_LiteralInteger167 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_String_a_b_c_d_e_size_result_LiteralUnlimitedNatural168 = new LiteralUnlimitedNatural();
			public ObjectFlow Hierarchy_assert_A_ObjectFlow169 = new ObjectFlow();
				public LiteralInteger Hierarchy_assert_A_ObjectFlow169_LiteralInteger170 = new LiteralInteger();
				public LiteralBoolean Hierarchy_assert_A_ObjectFlow169_LiteralBoolean171 = new LiteralBoolean();
			public ValueSpecificationAction Hierarchy_assert_A_String_a_b_size = new ValueSpecificationAction();
				public OutputPin Hierarchy_assert_A_String_a_b_size_result = new OutputPin();
					public LiteralUnlimitedNatural Hierarchy_assert_A_String_a_b_size_result_LiteralUnlimitedNatural172 = new LiteralUnlimitedNatural();
					public LiteralInteger Hierarchy_assert_A_String_a_b_size_result_LiteralInteger173 = new LiteralInteger();
				public LiteralString Hierarchy_assert_A_String_a_b_size_LiteralString174 = new LiteralString();
			public CallBehaviorAction Hierarchy_assert_A_WriteLine_a_b_c_d = new CallBehaviorAction();
				public OutputPin Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus = new OutputPin();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralInteger175 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralInteger176 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralUnlimitedNatural177 = new LiteralUnlimitedNatural();
				public InputPin Hierarchy_assert_A_WriteLine_a_b_c_d_value = new InputPin();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralInteger178 = new LiteralInteger();
					public LiteralInteger Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralInteger179 = new LiteralInteger();
					public LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralUnlimitedNatural180 = new LiteralUnlimitedNatural();
		public PackageImport Hierarchy_PackageImport181 = new PackageImport();
			public Comment Hierarchy_PackageImport181_Comment182 = new Comment();
		public Class_ Hierarchy_E = new Class_();

	public static HierarchyModel instance()
	{
		if (instance == null)
        {
            instance = new HierarchyModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public HierarchyModel()
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
		this.initializeControlFlow_Instances();
		this.initializeCreateObjectAction_Instances();
		this.initializeForkNode_Instances();
		this.initializeFunctionBehavior_Instances();
		this.initializeInputPin_Instances();
		this.initializeLiteralBoolean_Instances();
		this.initializeLiteralInteger_Instances();
		this.initializeLiteralString_Instances();
		this.initializeLiteralUnlimitedNatural_Instances();
		this.initializeObjectFlow_Instances();
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
		// Activity Hierarchy::main
		addToElementRepository("main", Hierarchy_main);
		Hierarchy_main.setName("main");
		Hierarchy_main.setVisibility(VisibilityKind.public_);
		Hierarchy_main.addNode(Hierarchy_main_instantiate_A);
		Hierarchy_main.addNode(Hierarchy_main_assert_A);
		Hierarchy_main.addEdge(Hierarchy_main_ObjectFlow4);
		// Activity Hierarchy::instantiate_A
		addToElementRepository("instantiate_A", Hierarchy_instantiate_A);
		Hierarchy_instantiate_A.setName("instantiate_A");
		Hierarchy_instantiate_A.setVisibility(VisibilityKind.public_);
		
		Hierarchy_instantiate_A.addOwnedParameter(Hierarchy_instantiate_A_a);
		Hierarchy_instantiate_A.addNode(Hierarchy_instantiate_A_a_node);
		Hierarchy_instantiate_A.addNode(Hierarchy_instantiate_A_A_);
		Hierarchy_instantiate_A.addNode(Hierarchy_instantiate_A_Create_A);
		Hierarchy_instantiate_A.addEdge(Hierarchy_instantiate_A_ObjectFlow16);
		Hierarchy_instantiate_A.addEdge(Hierarchy_instantiate_A_ObjectFlow19);
		// Activity Hierarchy::assert_A
		addToElementRepository("assert_A", Hierarchy_assert_A);
		Hierarchy_assert_A.setName("assert_A");
		Hierarchy_assert_A.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A.addOwnedBehavior(Hierarchy_assert_A_testEmptyList);
		Hierarchy_assert_A.addOwnedBehavior(Hierarchy_assert_A_testNonEmptyList);
		Hierarchy_assert_A.addOwnedParameter(Hierarchy_assert_A_a);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_Fork_a_b);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_Read_a_b_c_d_e);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_Fork_a_b_c);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_a_b_size_);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_String_a_b_c_size);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_Test_a_b_c_d_size);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_Read_a_b);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_WriteLine_a_b);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_a_b_c_d_e_size_);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_Read_a_b_c);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_Test_a_b_c_size);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_Read_a_b_c_d);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_WriteLine_a_b_c_d_e);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_Fork_a_b_c_d);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_a_b_c_d_size_);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_Test_a_b_size);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_String_a_b_c_d_size);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_Test_a_b_c_d_e_size);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_a_node);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_a_b_c_size_);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_String_a_b_c_d_e_size);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_WriteLine_a_b_c);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_String_a_b_size);
		Hierarchy_assert_A.addNode(Hierarchy_assert_A_WriteLine_a_b_c_d);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ControlFlow28);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow114);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ControlFlow117);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ControlFlow118);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow119);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow29);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow122);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ControlFlow50);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow129);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ControlFlow132);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow57);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow63);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow137);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow140);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ControlFlow66);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow143);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ControlFlow146);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ControlFlow147);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow148);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow151);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow67);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ControlFlow154);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow80);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ControlFlow155);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow83);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow86);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow107);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow169);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ControlFlow110);
		Hierarchy_assert_A.addEdge(Hierarchy_assert_A_ObjectFlow111);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode Hierarchy_instantiate_A::a_node
		addToElementRepository("a_node", Hierarchy_instantiate_A_a_node);
		Hierarchy_instantiate_A_a_node.setName("a_node");
		Hierarchy_instantiate_A_a_node.setVisibility(VisibilityKind.public_);
		
		Hierarchy_instantiate_A_a_node.setParameter(Hierarchy_instantiate_A_a);
		// ActivityParameterNode Hierarchy_assert_A::a_node
		addToElementRepository("a_node", Hierarchy_assert_A_a_node);
		Hierarchy_assert_A_a_node.setName("a_node");
		Hierarchy_assert_A_a_node.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_a_node.setParameter(Hierarchy_assert_A_a);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction Hierarchy_assert_A::Test a.b.c.size
		addToElementRepository("Test a.b.c.size", Hierarchy_assert_A_Test_a_b_c_size);
		Hierarchy_assert_A_Test_a_b_c_size.setName("Test a.b.c.size");
		Hierarchy_assert_A_Test_a_b_c_size.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_size.setBehavior(Hierarchy_assert_A_testNonEmptyList);
		Hierarchy_assert_A_Test_a_b_c_size.addArgument(Hierarchy_assert_A_Test_a_b_c_size_listSize);
		// CallBehaviorAction Hierarchy_main::instantiate_A
		addToElementRepository("instantiate_A", Hierarchy_main_instantiate_A);
		Hierarchy_main_instantiate_A.setName("instantiate_A");
		Hierarchy_main_instantiate_A.setVisibility(VisibilityKind.public_);
		
		Hierarchy_main_instantiate_A.addResult(Hierarchy_main_instantiate_A_a);
		Hierarchy_main_instantiate_A.setBehavior(Hierarchy_instantiate_A);
		// CallBehaviorAction Hierarchy_assert_A::a.b.size()
		addToElementRepository("a.b.size()", Hierarchy_assert_A_a_b_size_);
		Hierarchy_assert_A_a_b_size_.setName("a.b.size()");
		Hierarchy_assert_A_a_b_size_.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_a_b_size_.addResult(Hierarchy_assert_A_a_b_size__result);
		Hierarchy_assert_A_a_b_size_.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize);
		Hierarchy_assert_A_a_b_size_.addArgument(Hierarchy_assert_A_a_b_size__list);
		// CallBehaviorAction Hierarchy_assert_A::Test a.b.c.d.size
		addToElementRepository("Test a.b.c.d.size", Hierarchy_assert_A_Test_a_b_c_d_size);
		Hierarchy_assert_A_Test_a_b_c_d_size.setName("Test a.b.c.d.size");
		Hierarchy_assert_A_Test_a_b_c_d_size.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_d_size.setBehavior(Hierarchy_assert_A_testNonEmptyList);
		Hierarchy_assert_A_Test_a_b_c_d_size.addArgument(Hierarchy_assert_A_Test_a_b_c_d_size_listSize);
		// CallBehaviorAction Hierarchy_assert_A::WriteLine_a.b.c.d.e
		addToElementRepository("WriteLine_a.b.c.d.e", Hierarchy_assert_A_WriteLine_a_b_c_d_e);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e.setName("WriteLine_a.b.c.d.e");
		Hierarchy_assert_A_WriteLine_a_b_c_d_e.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_WriteLine_a_b_c_d_e.addResult(Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e.addArgument(Hierarchy_assert_A_WriteLine_a_b_c_d_e_value);
		// CallBehaviorAction Hierarchy_assert_A::WriteLine_a.b
		addToElementRepository("WriteLine_a.b", Hierarchy_assert_A_WriteLine_a_b);
		Hierarchy_assert_A_WriteLine_a_b.setName("WriteLine_a.b");
		Hierarchy_assert_A_WriteLine_a_b.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_WriteLine_a_b.addResult(Hierarchy_assert_A_WriteLine_a_b_errorStatus);
		Hierarchy_assert_A_WriteLine_a_b.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		Hierarchy_assert_A_WriteLine_a_b.addArgument(Hierarchy_assert_A_WriteLine_a_b_value);
		// CallBehaviorAction Hierarchy_assert_A::a.b.c.d.size()
		addToElementRepository("a.b.c.d.size()", Hierarchy_assert_A_a_b_c_d_size_);
		Hierarchy_assert_A_a_b_c_d_size_.setName("a.b.c.d.size()");
		Hierarchy_assert_A_a_b_c_d_size_.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_a_b_c_d_size_.addResult(Hierarchy_assert_A_a_b_c_d_size__result);
		Hierarchy_assert_A_a_b_c_d_size_.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize);
		Hierarchy_assert_A_a_b_c_d_size_.addArgument(Hierarchy_assert_A_a_b_c_d_size__list);
		// CallBehaviorAction Hierarchy_main::assert_A
		addToElementRepository("assert_A", Hierarchy_main_assert_A);
		Hierarchy_main_assert_A.setName("assert_A");
		Hierarchy_main_assert_A.setVisibility(VisibilityKind.public_);
		Hierarchy_main_assert_A.setBehavior(Hierarchy_assert_A);
		Hierarchy_main_assert_A.addArgument(Hierarchy_main_assert_A_a);
		// CallBehaviorAction Hierarchy_assert_A::Test a.b.size
		addToElementRepository("Test a.b.size", Hierarchy_assert_A_Test_a_b_size);
		Hierarchy_assert_A_Test_a_b_size.setName("Test a.b.size");
		Hierarchy_assert_A_Test_a_b_size.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_size.setBehavior(Hierarchy_assert_A_testNonEmptyList);
		Hierarchy_assert_A_Test_a_b_size.addArgument(Hierarchy_assert_A_Test_a_b_size_listSize);
		// CallBehaviorAction Hierarchy_assert_A::a.b.c.d.e.size()
		addToElementRepository("a.b.c.d.e.size()", Hierarchy_assert_A_a_b_c_d_e_size_);
		Hierarchy_assert_A_a_b_c_d_e_size_.setName("a.b.c.d.e.size()");
		Hierarchy_assert_A_a_b_c_d_e_size_.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_a_b_c_d_e_size_.addResult(Hierarchy_assert_A_a_b_c_d_e_size__result);
		Hierarchy_assert_A_a_b_c_d_e_size_.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize);
		Hierarchy_assert_A_a_b_c_d_e_size_.addArgument(Hierarchy_assert_A_a_b_c_d_e_size__list);
		// CallBehaviorAction Hierarchy_assert_A::Test a.b.c.d.e.size
		addToElementRepository("Test a.b.c.d.e.size", Hierarchy_assert_A_Test_a_b_c_d_e_size);
		Hierarchy_assert_A_Test_a_b_c_d_e_size.setName("Test a.b.c.d.e.size");
		Hierarchy_assert_A_Test_a_b_c_d_e_size.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_d_e_size.setBehavior(Hierarchy_assert_A_testEmptyList);
		Hierarchy_assert_A_Test_a_b_c_d_e_size.addArgument(Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize);
		// CallBehaviorAction Hierarchy_assert_A::a.b.c.size()
		addToElementRepository("a.b.c.size()", Hierarchy_assert_A_a_b_c_size_);
		Hierarchy_assert_A_a_b_c_size_.setName("a.b.c.size()");
		Hierarchy_assert_A_a_b_c_size_.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_a_b_c_size_.addResult(Hierarchy_assert_A_a_b_c_size__result);
		Hierarchy_assert_A_a_b_c_size_.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize);
		Hierarchy_assert_A_a_b_c_size_.addArgument(Hierarchy_assert_A_a_b_c_size__list);
		// CallBehaviorAction Hierarchy_assert_A::WriteLine_a.b.c
		addToElementRepository("WriteLine_a.b.c", Hierarchy_assert_A_WriteLine_a_b_c);
		Hierarchy_assert_A_WriteLine_a_b_c.setName("WriteLine_a.b.c");
		Hierarchy_assert_A_WriteLine_a_b_c.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_WriteLine_a_b_c.addResult(Hierarchy_assert_A_WriteLine_a_b_c_errorStatus);
		Hierarchy_assert_A_WriteLine_a_b_c.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		Hierarchy_assert_A_WriteLine_a_b_c.addArgument(Hierarchy_assert_A_WriteLine_a_b_c_value);
		// CallBehaviorAction Hierarchy_assert_A::WriteLine_a.b.c.d
		addToElementRepository("WriteLine_a.b.c.d", Hierarchy_assert_A_WriteLine_a_b_c_d);
		Hierarchy_assert_A_WriteLine_a_b_c_d.setName("WriteLine_a.b.c.d");
		Hierarchy_assert_A_WriteLine_a_b_c_d.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_WriteLine_a_b_c_d.addResult(Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus);
		Hierarchy_assert_A_WriteLine_a_b_c_d.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		Hierarchy_assert_A_WriteLine_a_b_c_d.addArgument(Hierarchy_assert_A_WriteLine_a_b_c_d_value);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction Hierarchy_instantiate_A::A()
		addToElementRepository("A()", Hierarchy_instantiate_A_A_);
		Hierarchy_instantiate_A_A_.setName("A()");
		Hierarchy_instantiate_A_A_.setVisibility(VisibilityKind.public_);
		
		Hierarchy_instantiate_A_A_.addResult(Hierarchy_instantiate_A_A__result);
		Hierarchy_instantiate_A_A_.setOperation(Hierarchy_A_A_A);
		Hierarchy_instantiate_A_A_.setTarget(Hierarchy_instantiate_A_A__target);
	}

	private void initializeClass_Instances()
	{
		// Class Hierarchy::B
		addToElementRepository("B", Hierarchy_B);
		Hierarchy_B.setName("B");
		Hierarchy_B.setVisibility(VisibilityKind.public_);
		
		Hierarchy_B.addOwnedAttribute(Hierarchy_B_c);
		// Class Hierarchy::D
		addToElementRepository("D", Hierarchy_D);
		Hierarchy_D.setName("D");
		Hierarchy_D.setVisibility(VisibilityKind.public_);
		
		Hierarchy_D.addOwnedAttribute(Hierarchy_D_e);
		// Class Hierarchy::A
		addToElementRepository("A", Hierarchy_A);
		Hierarchy_A.setName("A");
		Hierarchy_A.setVisibility(VisibilityKind.public_);
		
		Hierarchy_A.addOwnedAttribute(Hierarchy_A_b);
		
		
		Hierarchy_A.addOwnedOperation(Hierarchy_A_A_A);
		// Class Hierarchy::C
		addToElementRepository("C", Hierarchy_C);
		Hierarchy_C.setName("C");
		Hierarchy_C.setVisibility(VisibilityKind.public_);
		
		Hierarchy_C.addOwnedAttribute(Hierarchy_C_d);
		// Class Hierarchy::E
		addToElementRepository("E", Hierarchy_E);
		Hierarchy_E.setName("E");
		Hierarchy_E.setVisibility(VisibilityKind.public_);
	}

	private void initializeComment_Instances()
	{
		// Comment Hierarchy::Comment0
		addToElementRepository("Comment0", Hierarchy_Comment0);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment Hierarchy_PackageImport181::Comment182
		addToElementRepository("Comment182", Hierarchy_PackageImport181_Comment182);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow Hierarchy_assert_A::ControlFlow28
		addToElementRepository("ControlFlow28", Hierarchy_assert_A_ControlFlow28);
		Hierarchy_assert_A_ControlFlow28.setName("ControlFlow28");
		Hierarchy_assert_A_ControlFlow28.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ControlFlow28.setSource(Hierarchy_assert_A_Test_a_b_c_d_size);
		Hierarchy_assert_A_ControlFlow28.setTarget(Hierarchy_assert_A_Read_a_b_c_d_e);
		// ControlFlow Hierarchy_assert_A::ControlFlow154
		addToElementRepository("ControlFlow154", Hierarchy_assert_A_ControlFlow154);
		Hierarchy_assert_A_ControlFlow154.setName("ControlFlow154");
		Hierarchy_assert_A_ControlFlow154.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ControlFlow154.setSource(Hierarchy_assert_A_WriteLine_a_b);
		Hierarchy_assert_A_ControlFlow154.setTarget(Hierarchy_assert_A_Test_a_b_size);
		// ControlFlow Hierarchy_assert_A::ControlFlow155
		addToElementRepository("ControlFlow155", Hierarchy_assert_A_ControlFlow155);
		Hierarchy_assert_A_ControlFlow155.setName("ControlFlow155");
		Hierarchy_assert_A_ControlFlow155.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ControlFlow155.setSource(Hierarchy_assert_A_WriteLine_a_b_c_d_e);
		Hierarchy_assert_A_ControlFlow155.setTarget(Hierarchy_assert_A_Test_a_b_c_d_e_size);
		// ControlFlow Hierarchy_assert_A::ControlFlow147
		addToElementRepository("ControlFlow147", Hierarchy_assert_A_ControlFlow147);
		Hierarchy_assert_A_ControlFlow147.setName("ControlFlow147");
		Hierarchy_assert_A_ControlFlow147.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ControlFlow147.setSource(Hierarchy_assert_A_a_b_c_d_size_);
		Hierarchy_assert_A_ControlFlow147.setTarget(Hierarchy_assert_A_String_a_b_c_d_size);
		// ControlFlow Hierarchy_assert_A::ControlFlow50
		addToElementRepository("ControlFlow50", Hierarchy_assert_A_ControlFlow50);
		Hierarchy_assert_A_ControlFlow50.setName("ControlFlow50");
		Hierarchy_assert_A_ControlFlow50.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ControlFlow50.setSource(Hierarchy_assert_A_Test_a_b_c_size);
		Hierarchy_assert_A_ControlFlow50.setTarget(Hierarchy_assert_A_Read_a_b_c_d);
		// ControlFlow Hierarchy_assert_A::ControlFlow146
		addToElementRepository("ControlFlow146", Hierarchy_assert_A_ControlFlow146);
		Hierarchy_assert_A_ControlFlow146.setName("ControlFlow146");
		Hierarchy_assert_A_ControlFlow146.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ControlFlow146.setSource(Hierarchy_assert_A_a_b_c_size_);
		Hierarchy_assert_A_ControlFlow146.setTarget(Hierarchy_assert_A_String_a_b_c_size);
		// ControlFlow Hierarchy_assert_A::ControlFlow66
		addToElementRepository("ControlFlow66", Hierarchy_assert_A_ControlFlow66);
		Hierarchy_assert_A_ControlFlow66.setName("ControlFlow66");
		Hierarchy_assert_A_ControlFlow66.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ControlFlow66.setSource(Hierarchy_assert_A_a_b_size_);
		Hierarchy_assert_A_ControlFlow66.setTarget(Hierarchy_assert_A_String_a_b_size);
		// ControlFlow Hierarchy_assert_A::ControlFlow117
		addToElementRepository("ControlFlow117", Hierarchy_assert_A_ControlFlow117);
		Hierarchy_assert_A_ControlFlow117.setName("ControlFlow117");
		Hierarchy_assert_A_ControlFlow117.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ControlFlow117.setSource(Hierarchy_assert_A_WriteLine_a_b_c);
		Hierarchy_assert_A_ControlFlow117.setTarget(Hierarchy_assert_A_Test_a_b_c_size);
		// ControlFlow Hierarchy_assert_A::ControlFlow132
		addToElementRepository("ControlFlow132", Hierarchy_assert_A_ControlFlow132);
		Hierarchy_assert_A_ControlFlow132.setName("ControlFlow132");
		Hierarchy_assert_A_ControlFlow132.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ControlFlow132.setSource(Hierarchy_assert_A_WriteLine_a_b_c_d);
		Hierarchy_assert_A_ControlFlow132.setTarget(Hierarchy_assert_A_Test_a_b_c_d_size);
		// ControlFlow Hierarchy_assert_A::ControlFlow118
		addToElementRepository("ControlFlow118", Hierarchy_assert_A_ControlFlow118);
		Hierarchy_assert_A_ControlFlow118.setName("ControlFlow118");
		Hierarchy_assert_A_ControlFlow118.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ControlFlow118.setSource(Hierarchy_assert_A_a_b_c_d_e_size_);
		Hierarchy_assert_A_ControlFlow118.setTarget(Hierarchy_assert_A_String_a_b_c_d_e_size);
		// ControlFlow Hierarchy_assert_A::ControlFlow110
		addToElementRepository("ControlFlow110", Hierarchy_assert_A_ControlFlow110);
		Hierarchy_assert_A_ControlFlow110.setName("ControlFlow110");
		Hierarchy_assert_A_ControlFlow110.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ControlFlow110.setSource(Hierarchy_assert_A_Test_a_b_size);
		Hierarchy_assert_A_ControlFlow110.setTarget(Hierarchy_assert_A_Read_a_b_c);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction Hierarchy_instantiate_A::Create_A
		addToElementRepository("Create_A", Hierarchy_instantiate_A_Create_A);
		Hierarchy_instantiate_A_Create_A.setName("Create_A");
		Hierarchy_instantiate_A_Create_A.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_Create_A.setClassifier(Hierarchy_A);
		Hierarchy_instantiate_A_Create_A.setResult(Hierarchy_instantiate_A_Create_A_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode Hierarchy_assert_A::Fork a.b
		addToElementRepository("Fork a.b", Hierarchy_assert_A_Fork_a_b);
		Hierarchy_assert_A_Fork_a_b.setName("Fork a.b");
		Hierarchy_assert_A_Fork_a_b.setVisibility(VisibilityKind.public_);
		// ForkNode Hierarchy_assert_A::Fork a.b.c.d
		addToElementRepository("Fork a.b.c.d", Hierarchy_assert_A_Fork_a_b_c_d);
		Hierarchy_assert_A_Fork_a_b_c_d.setName("Fork a.b.c.d");
		Hierarchy_assert_A_Fork_a_b_c_d.setVisibility(VisibilityKind.public_);
		// ForkNode Hierarchy_assert_A::Fork a.b.c
		addToElementRepository("Fork a.b.c", Hierarchy_assert_A_Fork_a_b_c);
		Hierarchy_assert_A_Fork_a_b_c.setName("Fork a.b.c");
		Hierarchy_assert_A_Fork_a_b_c.setVisibility(VisibilityKind.public_);
	}

	private void initializeFunctionBehavior_Instances()
	{
		// FunctionBehavior Hierarchy_assert_A::testEmptyList
		addToElementRepository("testEmptyList", Hierarchy_assert_A_testEmptyList);
		Hierarchy_assert_A_testEmptyList.setName("testEmptyList");
		Hierarchy_assert_A_testEmptyList.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_testEmptyList.addOwnedParameter(Hierarchy_assert_A_testEmptyList_listSize);
		Hierarchy_assert_A_testEmptyList.addLanguage("Java");
		Hierarchy_assert_A_testEmptyList.addLanguage("Import");
		Hierarchy_assert_A_testEmptyList.addBody("String parameterName = inputParameters.get(0).parameter.name; 	// Test parameter listSize 	int listSize = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument \" + parameterName +  \" = \" + listSize);  	System.out.println(\"Part is empty: \");  	if(listSize == 0) 	{  		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		Hierarchy_assert_A_testEmptyList.addBody("import fuml.Debug; import fuml.semantics.simpleclassifiers.IntegerValue;");
		// FunctionBehavior Hierarchy_assert_A::testNonEmptyList
		addToElementRepository("testNonEmptyList", Hierarchy_assert_A_testNonEmptyList);
		Hierarchy_assert_A_testNonEmptyList.setName("testNonEmptyList");
		Hierarchy_assert_A_testNonEmptyList.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_testNonEmptyList.addOwnedParameter(Hierarchy_assert_A_testNonEmptyList_listSize);
		Hierarchy_assert_A_testNonEmptyList.addLanguage("Java");
		Hierarchy_assert_A_testNonEmptyList.addLanguage("Import");
		Hierarchy_assert_A_testNonEmptyList.addBody("String parameterName = inputParameters.get(0).parameter.name; 	// Test parameter listSize 	int listSize = ((IntegerValue)inputParameters.get(0).values.get(0)).value; 	Debug.println(\"[doBody] argument \" + parameterName +  \" = \" + listSize);  	System.out.println(\"Part is not empty: \");  	if(listSize > 0) 	{ 		System.out.println(\"\u001B[32m\" + \"Assertion successful.\" + \"\u001B[0m\"); 	} 	else 	{ 		System.out.println(\"\u001B[31m\" + \"Assertion failed!\" + \"\u001B[0m\"); 	}");
		Hierarchy_assert_A_testNonEmptyList.addBody("import fuml.Debug; import fuml.semantics.simpleclassifiers.IntegerValue;");
	}

	private void initializeInputPin_Instances()
	{
		// InputPin Hierarchy_assert_A_Read a.b.c.d::object
		addToElementRepository("object", Hierarchy_assert_A_Read_a_b_c_d_object);
		Hierarchy_assert_A_Read_a_b_c_d_object.setName("object");
		Hierarchy_assert_A_Read_a_b_c_d_object.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_object.setType(Hierarchy_C);
		// InputPin Hierarchy_assert_A_Read a.b.c.d.e::object
		addToElementRepository("object", Hierarchy_assert_A_Read_a_b_c_d_e_object);
		Hierarchy_assert_A_Read_a_b_c_d_e_object.setName("object");
		Hierarchy_assert_A_Read_a_b_c_d_e_object.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_e_object.setType(Hierarchy_D);
		// InputPin Hierarchy_assert_A_WriteLine_a.b.c.d::value
		addToElementRepository("value", Hierarchy_assert_A_WriteLine_a_b_c_d_value);
		Hierarchy_assert_A_WriteLine_a_b_c_d_value.setName("value");
		Hierarchy_assert_A_WriteLine_a_b_c_d_value.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin Hierarchy_assert_A_a.b.c.d.e.size()::list
		addToElementRepository("list", Hierarchy_assert_A_a_b_c_d_e_size__list);
		Hierarchy_assert_A_a_b_c_d_e_size__list.setName("list");
		Hierarchy_assert_A_a_b_c_d_e_size__list.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_a_b_c_d_e_size__list.setUpper(-1);
		Hierarchy_assert_A_a_b_c_d_e_size__list.setLower(0);
		// InputPin Hierarchy_assert_A_WriteLine_a.b::value
		addToElementRepository("value", Hierarchy_assert_A_WriteLine_a_b_value);
		Hierarchy_assert_A_WriteLine_a_b_value.setName("value");
		Hierarchy_assert_A_WriteLine_a_b_value.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin Hierarchy_assert_A_Read a.b.c::object
		addToElementRepository("object", Hierarchy_assert_A_Read_a_b_c_object);
		Hierarchy_assert_A_Read_a_b_c_object.setName("object");
		Hierarchy_assert_A_Read_a_b_c_object.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_object.setType(Hierarchy_B);
		// InputPin Hierarchy_assert_A_a.b.c.d.size()::list
		addToElementRepository("list", Hierarchy_assert_A_a_b_c_d_size__list);
		Hierarchy_assert_A_a_b_c_d_size__list.setName("list");
		Hierarchy_assert_A_a_b_c_d_size__list.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_a_b_c_d_size__list.setUpper(-1);
		Hierarchy_assert_A_a_b_c_d_size__list.setLower(0);
		// InputPin Hierarchy_assert_A_Test a.b.c.d.e.size::listSize
		addToElementRepository("listSize", Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize);
		Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize.setName("listSize");
		Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Hierarchy_assert_A_Test a.b.size::listSize
		addToElementRepository("listSize", Hierarchy_assert_A_Test_a_b_size_listSize);
		Hierarchy_assert_A_Test_a_b_size_listSize.setName("listSize");
		Hierarchy_assert_A_Test_a_b_size_listSize.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_size_listSize.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Hierarchy_assert_A_Test a.b.c.size::listSize
		addToElementRepository("listSize", Hierarchy_assert_A_Test_a_b_c_size_listSize);
		Hierarchy_assert_A_Test_a_b_c_size_listSize.setName("listSize");
		Hierarchy_assert_A_Test_a_b_c_size_listSize.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_size_listSize.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Hierarchy_assert_A_Test a.b.c.d.size::listSize
		addToElementRepository("listSize", Hierarchy_assert_A_Test_a_b_c_d_size_listSize);
		Hierarchy_assert_A_Test_a_b_c_d_size_listSize.setName("listSize");
		Hierarchy_assert_A_Test_a_b_c_d_size_listSize.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_d_size_listSize.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin Hierarchy_assert_A_WriteLine_a.b.c::value
		addToElementRepository("value", Hierarchy_assert_A_WriteLine_a_b_c_value);
		Hierarchy_assert_A_WriteLine_a_b_c_value.setName("value");
		Hierarchy_assert_A_WriteLine_a_b_c_value.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin Hierarchy_assert_A_a.b.size()::list
		addToElementRepository("list", Hierarchy_assert_A_a_b_size__list);
		Hierarchy_assert_A_a_b_size__list.setName("list");
		Hierarchy_assert_A_a_b_size__list.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_a_b_size__list.setUpper(-1);
		Hierarchy_assert_A_a_b_size__list.setLower(0);
		// InputPin Hierarchy_instantiate_A_A()::target
		addToElementRepository("target", Hierarchy_instantiate_A_A__target);
		Hierarchy_instantiate_A_A__target.setName("target");
		Hierarchy_instantiate_A_A__target.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_A__target.setType(Hierarchy_A);
		// InputPin Hierarchy_assert_A_a.b.c.size()::list
		addToElementRepository("list", Hierarchy_assert_A_a_b_c_size__list);
		Hierarchy_assert_A_a_b_c_size__list.setName("list");
		Hierarchy_assert_A_a_b_c_size__list.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_a_b_c_size__list.setUpper(-1);
		Hierarchy_assert_A_a_b_c_size__list.setLower(0);
		// InputPin Hierarchy_assert_A_WriteLine_a.b.c.d.e::value
		addToElementRepository("value", Hierarchy_assert_A_WriteLine_a_b_c_d_e_value);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_value.setName("value");
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_value.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin Hierarchy_main_assert_A::a
		addToElementRepository("a", Hierarchy_main_assert_A_a);
		Hierarchy_main_assert_A_a.setName("a");
		Hierarchy_main_assert_A_a.setVisibility(VisibilityKind.public_);
		// InputPin Hierarchy_assert_A_Read a.b::object
		addToElementRepository("object", Hierarchy_assert_A_Read_a_b_object);
		Hierarchy_assert_A_Read_a_b_object.setName("object");
		Hierarchy_assert_A_Read_a_b_object.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_object.setType(Hierarchy_A);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow107::LiteralBoolean108
		addToElementRepository("LiteralBoolean108", Hierarchy_assert_A_ObjectFlow107_LiteralBoolean108);
		Hierarchy_assert_A_ObjectFlow107_LiteralBoolean108.setName("LiteralBoolean108");
		Hierarchy_assert_A_ObjectFlow107_LiteralBoolean108.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow107_LiteralBoolean108.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow111::LiteralBoolean112
		addToElementRepository("LiteralBoolean112", Hierarchy_assert_A_ObjectFlow111_LiteralBoolean112);
		Hierarchy_assert_A_ObjectFlow111_LiteralBoolean112.setName("LiteralBoolean112");
		Hierarchy_assert_A_ObjectFlow111_LiteralBoolean112.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow111_LiteralBoolean112.setValue(true);
		// LiteralBoolean Hierarchy_instantiate_A_ObjectFlow16::LiteralBoolean17
		addToElementRepository("LiteralBoolean17", Hierarchy_instantiate_A_ObjectFlow16_LiteralBoolean17);
		Hierarchy_instantiate_A_ObjectFlow16_LiteralBoolean17.setName("LiteralBoolean17");
		Hierarchy_instantiate_A_ObjectFlow16_LiteralBoolean17.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_ObjectFlow16_LiteralBoolean17.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow29::LiteralBoolean30
		addToElementRepository("LiteralBoolean30", Hierarchy_assert_A_ObjectFlow29_LiteralBoolean30);
		Hierarchy_assert_A_ObjectFlow29_LiteralBoolean30.setName("LiteralBoolean30");
		Hierarchy_assert_A_ObjectFlow29_LiteralBoolean30.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow29_LiteralBoolean30.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow129::LiteralBoolean130
		addToElementRepository("LiteralBoolean130", Hierarchy_assert_A_ObjectFlow129_LiteralBoolean130);
		Hierarchy_assert_A_ObjectFlow129_LiteralBoolean130.setName("LiteralBoolean130");
		Hierarchy_assert_A_ObjectFlow129_LiteralBoolean130.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow129_LiteralBoolean130.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow83::LiteralBoolean85
		addToElementRepository("LiteralBoolean85", Hierarchy_assert_A_ObjectFlow83_LiteralBoolean85);
		Hierarchy_assert_A_ObjectFlow83_LiteralBoolean85.setName("LiteralBoolean85");
		Hierarchy_assert_A_ObjectFlow83_LiteralBoolean85.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow83_LiteralBoolean85.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow80::LiteralBoolean82
		addToElementRepository("LiteralBoolean82", Hierarchy_assert_A_ObjectFlow80_LiteralBoolean82);
		Hierarchy_assert_A_ObjectFlow80_LiteralBoolean82.setName("LiteralBoolean82");
		Hierarchy_assert_A_ObjectFlow80_LiteralBoolean82.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow80_LiteralBoolean82.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow143::LiteralBoolean145
		addToElementRepository("LiteralBoolean145", Hierarchy_assert_A_ObjectFlow143_LiteralBoolean145);
		Hierarchy_assert_A_ObjectFlow143_LiteralBoolean145.setName("LiteralBoolean145");
		Hierarchy_assert_A_ObjectFlow143_LiteralBoolean145.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow143_LiteralBoolean145.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow63::LiteralBoolean64
		addToElementRepository("LiteralBoolean64", Hierarchy_assert_A_ObjectFlow63_LiteralBoolean64);
		Hierarchy_assert_A_ObjectFlow63_LiteralBoolean64.setName("LiteralBoolean64");
		Hierarchy_assert_A_ObjectFlow63_LiteralBoolean64.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow63_LiteralBoolean64.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow119::LiteralBoolean120
		addToElementRepository("LiteralBoolean120", Hierarchy_assert_A_ObjectFlow119_LiteralBoolean120);
		Hierarchy_assert_A_ObjectFlow119_LiteralBoolean120.setName("LiteralBoolean120");
		Hierarchy_assert_A_ObjectFlow119_LiteralBoolean120.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow119_LiteralBoolean120.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow86::LiteralBoolean87
		addToElementRepository("LiteralBoolean87", Hierarchy_assert_A_ObjectFlow86_LiteralBoolean87);
		Hierarchy_assert_A_ObjectFlow86_LiteralBoolean87.setName("LiteralBoolean87");
		Hierarchy_assert_A_ObjectFlow86_LiteralBoolean87.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow86_LiteralBoolean87.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow151::LiteralBoolean152
		addToElementRepository("LiteralBoolean152", Hierarchy_assert_A_ObjectFlow151_LiteralBoolean152);
		Hierarchy_assert_A_ObjectFlow151_LiteralBoolean152.setName("LiteralBoolean152");
		Hierarchy_assert_A_ObjectFlow151_LiteralBoolean152.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow151_LiteralBoolean152.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow114::LiteralBoolean115
		addToElementRepository("LiteralBoolean115", Hierarchy_assert_A_ObjectFlow114_LiteralBoolean115);
		Hierarchy_assert_A_ObjectFlow114_LiteralBoolean115.setName("LiteralBoolean115");
		Hierarchy_assert_A_ObjectFlow114_LiteralBoolean115.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow114_LiteralBoolean115.setValue(true);
		// LiteralBoolean Hierarchy_main_ObjectFlow4::LiteralBoolean5
		addToElementRepository("LiteralBoolean5", Hierarchy_main_ObjectFlow4_LiteralBoolean5);
		Hierarchy_main_ObjectFlow4_LiteralBoolean5.setName("LiteralBoolean5");
		Hierarchy_main_ObjectFlow4_LiteralBoolean5.setVisibility(VisibilityKind.public_);
		Hierarchy_main_ObjectFlow4_LiteralBoolean5.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow169::LiteralBoolean171
		addToElementRepository("LiteralBoolean171", Hierarchy_assert_A_ObjectFlow169_LiteralBoolean171);
		Hierarchy_assert_A_ObjectFlow169_LiteralBoolean171.setName("LiteralBoolean171");
		Hierarchy_assert_A_ObjectFlow169_LiteralBoolean171.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow169_LiteralBoolean171.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow57::LiteralBoolean58
		addToElementRepository("LiteralBoolean58", Hierarchy_assert_A_ObjectFlow57_LiteralBoolean58);
		Hierarchy_assert_A_ObjectFlow57_LiteralBoolean58.setName("LiteralBoolean58");
		Hierarchy_assert_A_ObjectFlow57_LiteralBoolean58.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow57_LiteralBoolean58.setValue(true);
		// LiteralBoolean Hierarchy_instantiate_A_ObjectFlow19::LiteralBoolean20
		addToElementRepository("LiteralBoolean20", Hierarchy_instantiate_A_ObjectFlow19_LiteralBoolean20);
		Hierarchy_instantiate_A_ObjectFlow19_LiteralBoolean20.setName("LiteralBoolean20");
		Hierarchy_instantiate_A_ObjectFlow19_LiteralBoolean20.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_ObjectFlow19_LiteralBoolean20.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow67::LiteralBoolean69
		addToElementRepository("LiteralBoolean69", Hierarchy_assert_A_ObjectFlow67_LiteralBoolean69);
		Hierarchy_assert_A_ObjectFlow67_LiteralBoolean69.setName("LiteralBoolean69");
		Hierarchy_assert_A_ObjectFlow67_LiteralBoolean69.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow67_LiteralBoolean69.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow122::LiteralBoolean124
		addToElementRepository("LiteralBoolean124", Hierarchy_assert_A_ObjectFlow122_LiteralBoolean124);
		Hierarchy_assert_A_ObjectFlow122_LiteralBoolean124.setName("LiteralBoolean124");
		Hierarchy_assert_A_ObjectFlow122_LiteralBoolean124.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow122_LiteralBoolean124.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow140::LiteralBoolean142
		addToElementRepository("LiteralBoolean142", Hierarchy_assert_A_ObjectFlow140_LiteralBoolean142);
		Hierarchy_assert_A_ObjectFlow140_LiteralBoolean142.setName("LiteralBoolean142");
		Hierarchy_assert_A_ObjectFlow140_LiteralBoolean142.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow140_LiteralBoolean142.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow148::LiteralBoolean150
		addToElementRepository("LiteralBoolean150", Hierarchy_assert_A_ObjectFlow148_LiteralBoolean150);
		Hierarchy_assert_A_ObjectFlow148_LiteralBoolean150.setName("LiteralBoolean150");
		Hierarchy_assert_A_ObjectFlow148_LiteralBoolean150.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow148_LiteralBoolean150.setValue(true);
		// LiteralBoolean Hierarchy_assert_A_ObjectFlow137::LiteralBoolean139
		addToElementRepository("LiteralBoolean139", Hierarchy_assert_A_ObjectFlow137_LiteralBoolean139);
		Hierarchy_assert_A_ObjectFlow137_LiteralBoolean139.setName("LiteralBoolean139");
		Hierarchy_assert_A_ObjectFlow137_LiteralBoolean139.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow137_LiteralBoolean139.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger Hierarchy_assert_A_Read a.b.c.d.e_result::LiteralInteger27
		addToElementRepository("LiteralInteger27", Hierarchy_assert_A_Read_a_b_c_d_e_result_LiteralInteger27);
		Hierarchy_assert_A_Read_a_b_c_d_e_result_LiteralInteger27.setName("LiteralInteger27");
		Hierarchy_assert_A_Read_a_b_c_d_e_result_LiteralInteger27.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_e_result_LiteralInteger27.setValue(1);
		// LiteralInteger Hierarchy_assert_A_Read a.b.c.d_result::LiteralInteger73
		addToElementRepository("LiteralInteger73", Hierarchy_assert_A_Read_a_b_c_d_result_LiteralInteger73);
		Hierarchy_assert_A_Read_a_b_c_d_result_LiteralInteger73.setName("LiteralInteger73");
		Hierarchy_assert_A_Read_a_b_c_d_result_LiteralInteger73.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_result_LiteralInteger73.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.c.size()_result::LiteralInteger96
		addToElementRepository("LiteralInteger96", Hierarchy_assert_A_a_b_c_size__result_LiteralInteger96);
		Hierarchy_assert_A_a_b_c_size__result_LiteralInteger96.setName("LiteralInteger96");
		Hierarchy_assert_A_a_b_c_size__result_LiteralInteger96.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_size__result_LiteralInteger96.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.c.d.size()_result::LiteralInteger157
		addToElementRepository("LiteralInteger157", Hierarchy_assert_A_a_b_c_d_size__result_LiteralInteger157);
		Hierarchy_assert_A_a_b_c_d_size__result_LiteralInteger157.setName("LiteralInteger157");
		Hierarchy_assert_A_a_b_c_d_size__result_LiteralInteger157.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_size__result_LiteralInteger157.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b.c.d_errorStatus::LiteralInteger176
		addToElementRepository("LiteralInteger176", Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralInteger176);
		Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralInteger176.setName("LiteralInteger176");
		Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralInteger176.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralInteger176.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b.c.d.e_value::LiteralInteger77
		addToElementRepository("LiteralInteger77", Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralInteger77);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralInteger77.setName("LiteralInteger77");
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralInteger77.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralInteger77.setValue(1);
		// LiteralInteger Hierarchy_instantiate_A_A()_target::LiteralInteger15
		addToElementRepository("LiteralInteger15", Hierarchy_instantiate_A_A__target_LiteralInteger15);
		Hierarchy_instantiate_A_A__target_LiteralInteger15.setName("LiteralInteger15");
		Hierarchy_instantiate_A_A__target_LiteralInteger15.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_A__target_LiteralInteger15.setValue(1);
		// LiteralInteger Hierarchy_assert_A_Read a.b.c_result::LiteralInteger133
		addToElementRepository("LiteralInteger133", Hierarchy_assert_A_Read_a_b_c_result_LiteralInteger133);
		Hierarchy_assert_A_Read_a_b_c_result_LiteralInteger133.setName("LiteralInteger133");
		Hierarchy_assert_A_Read_a_b_c_result_LiteralInteger133.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_result_LiteralInteger133.setValue(1);
		// LiteralInteger Hierarchy_assert_A_String(a.b.c.d.size)_result::LiteralInteger89
		addToElementRepository("LiteralInteger89", Hierarchy_assert_A_String_a_b_c_d_size_result_LiteralInteger89);
		Hierarchy_assert_A_String_a_b_c_d_size_result_LiteralInteger89.setName("LiteralInteger89");
		Hierarchy_assert_A_String_a_b_c_d_size_result_LiteralInteger89.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_d_size_result_LiteralInteger89.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.c.size()_result::LiteralInteger95
		addToElementRepository("LiteralInteger95", Hierarchy_assert_A_a_b_c_size__result_LiteralInteger95);
		Hierarchy_assert_A_a_b_c_size__result_LiteralInteger95.setName("LiteralInteger95");
		Hierarchy_assert_A_a_b_c_size__result_LiteralInteger95.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_size__result_LiteralInteger95.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b.c.d.e_errorStatus::LiteralInteger74
		addToElementRepository("LiteralInteger74", Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralInteger74);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralInteger74.setName("LiteralInteger74");
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralInteger74.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralInteger74.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow140::LiteralInteger141
		addToElementRepository("LiteralInteger141", Hierarchy_assert_A_ObjectFlow140_LiteralInteger141);
		Hierarchy_assert_A_ObjectFlow140_LiteralInteger141.setName("LiteralInteger141");
		Hierarchy_assert_A_ObjectFlow140_LiteralInteger141.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow140_LiteralInteger141.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b.c_errorStatus::LiteralInteger102
		addToElementRepository("LiteralInteger102", Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralInteger102);
		Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralInteger102.setName("LiteralInteger102");
		Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralInteger102.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralInteger102.setValue(1);
		// LiteralInteger Hierarchy_assert_A_Read a.b.c.d_object::LiteralInteger71
		addToElementRepository("LiteralInteger71", Hierarchy_assert_A_Read_a_b_c_d_object_LiteralInteger71);
		Hierarchy_assert_A_Read_a_b_c_d_object_LiteralInteger71.setName("LiteralInteger71");
		Hierarchy_assert_A_Read_a_b_c_d_object_LiteralInteger71.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_object_LiteralInteger71.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b_value::LiteralInteger46
		addToElementRepository("LiteralInteger46", Hierarchy_assert_A_WriteLine_a_b_value_LiteralInteger46);
		Hierarchy_assert_A_WriteLine_a_b_value_LiteralInteger46.setName("LiteralInteger46");
		Hierarchy_assert_A_WriteLine_a_b_value_LiteralInteger46.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_value_LiteralInteger46.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow107::LiteralInteger109
		addToElementRepository("LiteralInteger109", Hierarchy_assert_A_ObjectFlow107_LiteralInteger109);
		Hierarchy_assert_A_ObjectFlow107_LiteralInteger109.setName("LiteralInteger109");
		Hierarchy_assert_A_ObjectFlow107_LiteralInteger109.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow107_LiteralInteger109.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b.c.d.e_errorStatus::LiteralInteger76
		addToElementRepository("LiteralInteger76", Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralInteger76);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralInteger76.setName("LiteralInteger76");
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralInteger76.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralInteger76.setValue(0);
		// LiteralInteger Hierarchy_assert_A_Read a.b.c_object::LiteralInteger136
		addToElementRepository("LiteralInteger136", Hierarchy_assert_A_Read_a_b_c_object_LiteralInteger136);
		Hierarchy_assert_A_Read_a_b_c_object_LiteralInteger136.setName("LiteralInteger136");
		Hierarchy_assert_A_Read_a_b_c_object_LiteralInteger136.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_object_LiteralInteger136.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.size()_result::LiteralInteger35
		addToElementRepository("LiteralInteger35", Hierarchy_assert_A_a_b_size__result_LiteralInteger35);
		Hierarchy_assert_A_a_b_size__result_LiteralInteger35.setName("LiteralInteger35");
		Hierarchy_assert_A_a_b_size__result_LiteralInteger35.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_size__result_LiteralInteger35.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.c.d.e.size()_result::LiteralInteger54
		addToElementRepository("LiteralInteger54", Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralInteger54);
		Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralInteger54.setName("LiteralInteger54");
		Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralInteger54.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralInteger54.setValue(1);
		// LiteralInteger Hierarchy_assert_A_String(a.b.c.d.e.size)_result::LiteralInteger167
		addToElementRepository("LiteralInteger167", Hierarchy_assert_A_String_a_b_c_d_e_size_result_LiteralInteger167);
		Hierarchy_assert_A_String_a_b_c_d_e_size_result_LiteralInteger167.setName("LiteralInteger167");
		Hierarchy_assert_A_String_a_b_c_d_e_size_result_LiteralInteger167.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_d_e_size_result_LiteralInteger167.setValue(1);
		// LiteralInteger Hierarchy_instantiate_A_A()_result::LiteralInteger12
		addToElementRepository("LiteralInteger12", Hierarchy_instantiate_A_A__result_LiteralInteger12);
		Hierarchy_instantiate_A_A__result_LiteralInteger12.setName("LiteralInteger12");
		Hierarchy_instantiate_A_A__result_LiteralInteger12.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_A__result_LiteralInteger12.setValue(1);
		// LiteralInteger Hierarchy_assert_A_Test a.b.c.d.e.size_listSize::LiteralInteger92
		addToElementRepository("LiteralInteger92", Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralInteger92);
		Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralInteger92.setName("LiteralInteger92");
		Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralInteger92.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralInteger92.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.c.d.size()_list::LiteralInteger159
		addToElementRepository("LiteralInteger159", Hierarchy_assert_A_a_b_c_d_size__list_LiteralInteger159);
		Hierarchy_assert_A_a_b_c_d_size__list_LiteralInteger159.setName("LiteralInteger159");
		Hierarchy_assert_A_a_b_c_d_size__list_LiteralInteger159.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_size__list_LiteralInteger159.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.c.d.e.size()_list::LiteralInteger52
		addToElementRepository("LiteralInteger52", Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralInteger52);
		Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralInteger52.setName("LiteralInteger52");
		Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralInteger52.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralInteger52.setValue(0);
		// LiteralInteger Hierarchy_assert_A_Test a.b.size_listSize::LiteralInteger163
		addToElementRepository("LiteralInteger163", Hierarchy_assert_A_Test_a_b_size_listSize_LiteralInteger163);
		Hierarchy_assert_A_Test_a_b_size_listSize_LiteralInteger163.setName("LiteralInteger163");
		Hierarchy_assert_A_Test_a_b_size_listSize_LiteralInteger163.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_size_listSize_LiteralInteger163.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow129::LiteralInteger131
		addToElementRepository("LiteralInteger131", Hierarchy_assert_A_ObjectFlow129_LiteralInteger131);
		Hierarchy_assert_A_ObjectFlow129_LiteralInteger131.setName("LiteralInteger131");
		Hierarchy_assert_A_ObjectFlow129_LiteralInteger131.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow129_LiteralInteger131.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow137::LiteralInteger138
		addToElementRepository("LiteralInteger138", Hierarchy_assert_A_ObjectFlow137_LiteralInteger138);
		Hierarchy_assert_A_ObjectFlow137_LiteralInteger138.setName("LiteralInteger138");
		Hierarchy_assert_A_ObjectFlow137_LiteralInteger138.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow137_LiteralInteger138.setValue(1);
		// LiteralInteger Hierarchy_assert_A_Read a.b_object::LiteralInteger127
		addToElementRepository("LiteralInteger127", Hierarchy_assert_A_Read_a_b_object_LiteralInteger127);
		Hierarchy_assert_A_Read_a_b_object_LiteralInteger127.setName("LiteralInteger127");
		Hierarchy_assert_A_Read_a_b_object_LiteralInteger127.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_object_LiteralInteger127.setValue(1);
		// LiteralInteger Hierarchy_instantiate_A_ObjectFlow19::LiteralInteger21
		addToElementRepository("LiteralInteger21", Hierarchy_instantiate_A_ObjectFlow19_LiteralInteger21);
		Hierarchy_instantiate_A_ObjectFlow19_LiteralInteger21.setName("LiteralInteger21");
		Hierarchy_instantiate_A_ObjectFlow19_LiteralInteger21.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_ObjectFlow19_LiteralInteger21.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.c.size()_list::LiteralInteger98
		addToElementRepository("LiteralInteger98", Hierarchy_assert_A_a_b_c_size__list_LiteralInteger98);
		Hierarchy_assert_A_a_b_c_size__list_LiteralInteger98.setName("LiteralInteger98");
		Hierarchy_assert_A_a_b_c_size__list_LiteralInteger98.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_size__list_LiteralInteger98.setValue(0);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow111::LiteralInteger113
		addToElementRepository("LiteralInteger113", Hierarchy_assert_A_ObjectFlow111_LiteralInteger113);
		Hierarchy_assert_A_ObjectFlow111_LiteralInteger113.setName("LiteralInteger113");
		Hierarchy_assert_A_ObjectFlow111_LiteralInteger113.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow111_LiteralInteger113.setValue(1);
		// LiteralInteger Hierarchy_assert_A_Test a.b.c.d.e.size_listSize::LiteralInteger94
		addToElementRepository("LiteralInteger94", Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralInteger94);
		Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralInteger94.setName("LiteralInteger94");
		Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralInteger94.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralInteger94.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b.c_value::LiteralInteger106
		addToElementRepository("LiteralInteger106", Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralInteger106);
		Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralInteger106.setName("LiteralInteger106");
		Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralInteger106.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralInteger106.setValue(1);
		// LiteralInteger Hierarchy_instantiate_A_a_node::LiteralInteger10
		addToElementRepository("LiteralInteger10", Hierarchy_instantiate_A_a_node_LiteralInteger10);
		Hierarchy_instantiate_A_a_node_LiteralInteger10.setName("LiteralInteger10");
		Hierarchy_instantiate_A_a_node_LiteralInteger10.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_a_node_LiteralInteger10.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b.c_value::LiteralInteger104
		addToElementRepository("LiteralInteger104", Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralInteger104);
		Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralInteger104.setName("LiteralInteger104");
		Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralInteger104.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralInteger104.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow63::LiteralInteger65
		addToElementRepository("LiteralInteger65", Hierarchy_assert_A_ObjectFlow63_LiteralInteger65);
		Hierarchy_assert_A_ObjectFlow63_LiteralInteger65.setName("LiteralInteger65");
		Hierarchy_assert_A_ObjectFlow63_LiteralInteger65.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow63_LiteralInteger65.setValue(1);
		// LiteralInteger Hierarchy_assert_A_Read a.b.c.d.e_object::LiteralInteger24
		addToElementRepository("LiteralInteger24", Hierarchy_assert_A_Read_a_b_c_d_e_object_LiteralInteger24);
		Hierarchy_assert_A_Read_a_b_c_d_e_object_LiteralInteger24.setName("LiteralInteger24");
		Hierarchy_assert_A_Read_a_b_c_d_e_object_LiteralInteger24.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_e_object_LiteralInteger24.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow169::LiteralInteger170
		addToElementRepository("LiteralInteger170", Hierarchy_assert_A_ObjectFlow169_LiteralInteger170);
		Hierarchy_assert_A_ObjectFlow169_LiteralInteger170.setName("LiteralInteger170");
		Hierarchy_assert_A_ObjectFlow169_LiteralInteger170.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow169_LiteralInteger170.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b_value::LiteralInteger44
		addToElementRepository("LiteralInteger44", Hierarchy_assert_A_WriteLine_a_b_value_LiteralInteger44);
		Hierarchy_assert_A_WriteLine_a_b_value_LiteralInteger44.setName("LiteralInteger44");
		Hierarchy_assert_A_WriteLine_a_b_value_LiteralInteger44.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_value_LiteralInteger44.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.c.d.e.size()_result::LiteralInteger55
		addToElementRepository("LiteralInteger55", Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralInteger55);
		Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralInteger55.setName("LiteralInteger55");
		Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralInteger55.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralInteger55.setValue(1);
		// LiteralInteger Hierarchy_main_instantiate_A_a::LiteralInteger2
		addToElementRepository("LiteralInteger2", Hierarchy_main_instantiate_A_a_LiteralInteger2);
		Hierarchy_main_instantiate_A_a_LiteralInteger2.setName("LiteralInteger2");
		Hierarchy_main_instantiate_A_a_LiteralInteger2.setVisibility(VisibilityKind.public_);
		Hierarchy_main_instantiate_A_a_LiteralInteger2.setValue(1);
		// LiteralInteger Hierarchy_assert_A_Read a.b_result::LiteralInteger126
		addToElementRepository("LiteralInteger126", Hierarchy_assert_A_Read_a_b_result_LiteralInteger126);
		Hierarchy_assert_A_Read_a_b_result_LiteralInteger126.setName("LiteralInteger126");
		Hierarchy_assert_A_Read_a_b_result_LiteralInteger126.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_result_LiteralInteger126.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow83::LiteralInteger84
		addToElementRepository("LiteralInteger84", Hierarchy_assert_A_ObjectFlow83_LiteralInteger84);
		Hierarchy_assert_A_ObjectFlow83_LiteralInteger84.setName("LiteralInteger84");
		Hierarchy_assert_A_ObjectFlow83_LiteralInteger84.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow83_LiteralInteger84.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b.c.d_value::LiteralInteger178
		addToElementRepository("LiteralInteger178", Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralInteger178);
		Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralInteger178.setName("LiteralInteger178");
		Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralInteger178.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralInteger178.setValue(1);
		// LiteralInteger Hierarchy_assert_A_String(a.b.size)_result::LiteralInteger173
		addToElementRepository("LiteralInteger173", Hierarchy_assert_A_String_a_b_size_result_LiteralInteger173);
		Hierarchy_assert_A_String_a_b_size_result_LiteralInteger173.setName("LiteralInteger173");
		Hierarchy_assert_A_String_a_b_size_result_LiteralInteger173.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_size_result_LiteralInteger173.setValue(1);
		// LiteralInteger Hierarchy_assert_A_Test a.b.c.size_listSize::LiteralInteger62
		addToElementRepository("LiteralInteger62", Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralInteger62);
		Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralInteger62.setName("LiteralInteger62");
		Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralInteger62.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralInteger62.setValue(1);
		// LiteralInteger Hierarchy_assert_A_Test a.b.c.d.size_listSize::LiteralInteger41
		addToElementRepository("LiteralInteger41", Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralInteger41);
		Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralInteger41.setName("LiteralInteger41");
		Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralInteger41.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralInteger41.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow86::LiteralInteger88
		addToElementRepository("LiteralInteger88", Hierarchy_assert_A_ObjectFlow86_LiteralInteger88);
		Hierarchy_assert_A_ObjectFlow86_LiteralInteger88.setName("LiteralInteger88");
		Hierarchy_assert_A_ObjectFlow86_LiteralInteger88.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow86_LiteralInteger88.setValue(1);
		// LiteralInteger Hierarchy_main_instantiate_A_a::LiteralInteger3
		addToElementRepository("LiteralInteger3", Hierarchy_main_instantiate_A_a_LiteralInteger3);
		Hierarchy_main_instantiate_A_a_LiteralInteger3.setName("LiteralInteger3");
		Hierarchy_main_instantiate_A_a_LiteralInteger3.setVisibility(VisibilityKind.public_);
		Hierarchy_main_instantiate_A_a_LiteralInteger3.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow119::LiteralInteger121
		addToElementRepository("LiteralInteger121", Hierarchy_assert_A_ObjectFlow119_LiteralInteger121);
		Hierarchy_assert_A_ObjectFlow119_LiteralInteger121.setName("LiteralInteger121");
		Hierarchy_assert_A_ObjectFlow119_LiteralInteger121.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow119_LiteralInteger121.setValue(1);
		// LiteralInteger Hierarchy_assert_A_Test a.b.size_listSize::LiteralInteger164
		addToElementRepository("LiteralInteger164", Hierarchy_assert_A_Test_a_b_size_listSize_LiteralInteger164);
		Hierarchy_assert_A_Test_a_b_size_listSize_LiteralInteger164.setName("LiteralInteger164");
		Hierarchy_assert_A_Test_a_b_size_listSize_LiteralInteger164.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_size_listSize_LiteralInteger164.setValue(1);
		// LiteralInteger Hierarchy_main_assert_A_a::LiteralInteger8
		addToElementRepository("LiteralInteger8", Hierarchy_main_assert_A_a_LiteralInteger8);
		Hierarchy_main_assert_A_a_LiteralInteger8.setName("LiteralInteger8");
		Hierarchy_main_assert_A_a_LiteralInteger8.setVisibility(VisibilityKind.public_);
		Hierarchy_main_assert_A_a_LiteralInteger8.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b.c.d.e_value::LiteralInteger78
		addToElementRepository("LiteralInteger78", Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralInteger78);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralInteger78.setName("LiteralInteger78");
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralInteger78.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralInteger78.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.c.d.size()_list::LiteralInteger160
		addToElementRepository("LiteralInteger160", Hierarchy_assert_A_a_b_c_d_size__list_LiteralInteger160);
		Hierarchy_assert_A_a_b_c_d_size__list_LiteralInteger160.setName("LiteralInteger160");
		Hierarchy_assert_A_a_b_c_d_size__list_LiteralInteger160.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_size__list_LiteralInteger160.setValue(0);
		// LiteralInteger Hierarchy_instantiate_A_ObjectFlow16::LiteralInteger18
		addToElementRepository("LiteralInteger18", Hierarchy_instantiate_A_ObjectFlow16_LiteralInteger18);
		Hierarchy_instantiate_A_ObjectFlow16_LiteralInteger18.setName("LiteralInteger18");
		Hierarchy_instantiate_A_ObjectFlow16_LiteralInteger18.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_ObjectFlow16_LiteralInteger18.setValue(1);
		// LiteralInteger Hierarchy_main_ObjectFlow4::LiteralInteger6
		addToElementRepository("LiteralInteger6", Hierarchy_main_ObjectFlow4_LiteralInteger6);
		Hierarchy_main_ObjectFlow4_LiteralInteger6.setName("LiteralInteger6");
		Hierarchy_main_ObjectFlow4_LiteralInteger6.setVisibility(VisibilityKind.public_);
		Hierarchy_main_ObjectFlow4_LiteralInteger6.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.size()_list::LiteralInteger33
		addToElementRepository("LiteralInteger33", Hierarchy_assert_A_a_b_size__list_LiteralInteger33);
		Hierarchy_assert_A_a_b_size__list_LiteralInteger33.setName("LiteralInteger33");
		Hierarchy_assert_A_a_b_size__list_LiteralInteger33.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_size__list_LiteralInteger33.setValue(0);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b.c_errorStatus::LiteralInteger103
		addToElementRepository("LiteralInteger103", Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralInteger103);
		Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralInteger103.setName("LiteralInteger103");
		Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralInteger103.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralInteger103.setValue(0);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b.c.d_value::LiteralInteger179
		addToElementRepository("LiteralInteger179", Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralInteger179);
		Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralInteger179.setName("LiteralInteger179");
		Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralInteger179.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralInteger179.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow57::LiteralInteger59
		addToElementRepository("LiteralInteger59", Hierarchy_assert_A_ObjectFlow57_LiteralInteger59);
		Hierarchy_assert_A_ObjectFlow57_LiteralInteger59.setName("LiteralInteger59");
		Hierarchy_assert_A_ObjectFlow57_LiteralInteger59.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow57_LiteralInteger59.setValue(1);
		// LiteralInteger Hierarchy_assert_A_Test a.b.c.d.size_listSize::LiteralInteger43
		addToElementRepository("LiteralInteger43", Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralInteger43);
		Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralInteger43.setName("LiteralInteger43");
		Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralInteger43.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralInteger43.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.c.d.size()_result::LiteralInteger158
		addToElementRepository("LiteralInteger158", Hierarchy_assert_A_a_b_c_d_size__result_LiteralInteger158);
		Hierarchy_assert_A_a_b_c_d_size__result_LiteralInteger158.setName("LiteralInteger158");
		Hierarchy_assert_A_a_b_c_d_size__result_LiteralInteger158.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_size__result_LiteralInteger158.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow29::LiteralInteger31
		addToElementRepository("LiteralInteger31", Hierarchy_assert_A_ObjectFlow29_LiteralInteger31);
		Hierarchy_assert_A_ObjectFlow29_LiteralInteger31.setName("LiteralInteger31");
		Hierarchy_assert_A_ObjectFlow29_LiteralInteger31.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow29_LiteralInteger31.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.c.size()_list::LiteralInteger100
		addToElementRepository("LiteralInteger100", Hierarchy_assert_A_a_b_c_size__list_LiteralInteger100);
		Hierarchy_assert_A_a_b_c_size__list_LiteralInteger100.setName("LiteralInteger100");
		Hierarchy_assert_A_a_b_c_size__list_LiteralInteger100.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_size__list_LiteralInteger100.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow143::LiteralInteger144
		addToElementRepository("LiteralInteger144", Hierarchy_assert_A_ObjectFlow143_LiteralInteger144);
		Hierarchy_assert_A_ObjectFlow143_LiteralInteger144.setName("LiteralInteger144");
		Hierarchy_assert_A_ObjectFlow143_LiteralInteger144.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow143_LiteralInteger144.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow80::LiteralInteger81
		addToElementRepository("LiteralInteger81", Hierarchy_assert_A_ObjectFlow80_LiteralInteger81);
		Hierarchy_assert_A_ObjectFlow80_LiteralInteger81.setName("LiteralInteger81");
		Hierarchy_assert_A_ObjectFlow80_LiteralInteger81.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow80_LiteralInteger81.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b_errorStatus::LiteralInteger47
		addToElementRepository("LiteralInteger47", Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralInteger47);
		Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralInteger47.setName("LiteralInteger47");
		Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralInteger47.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralInteger47.setValue(0);
		// LiteralInteger Hierarchy_assert_A_Test a.b.c.size_listSize::LiteralInteger61
		addToElementRepository("LiteralInteger61", Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralInteger61);
		Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralInteger61.setName("LiteralInteger61");
		Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralInteger61.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralInteger61.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow148::LiteralInteger149
		addToElementRepository("LiteralInteger149", Hierarchy_assert_A_ObjectFlow148_LiteralInteger149);
		Hierarchy_assert_A_ObjectFlow148_LiteralInteger149.setName("LiteralInteger149");
		Hierarchy_assert_A_ObjectFlow148_LiteralInteger149.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow148_LiteralInteger149.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow151::LiteralInteger153
		addToElementRepository("LiteralInteger153", Hierarchy_assert_A_ObjectFlow151_LiteralInteger153);
		Hierarchy_assert_A_ObjectFlow151_LiteralInteger153.setName("LiteralInteger153");
		Hierarchy_assert_A_ObjectFlow151_LiteralInteger153.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow151_LiteralInteger153.setValue(1);
		// LiteralInteger Hierarchy_main_assert_A_a::LiteralInteger9
		addToElementRepository("LiteralInteger9", Hierarchy_main_assert_A_a_LiteralInteger9);
		Hierarchy_main_assert_A_a_LiteralInteger9.setName("LiteralInteger9");
		Hierarchy_main_assert_A_a_LiteralInteger9.setVisibility(VisibilityKind.public_);
		Hierarchy_main_assert_A_a_LiteralInteger9.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.size()_list::LiteralInteger34
		addToElementRepository("LiteralInteger34", Hierarchy_assert_A_a_b_size__list_LiteralInteger34);
		Hierarchy_assert_A_a_b_size__list_LiteralInteger34.setName("LiteralInteger34");
		Hierarchy_assert_A_a_b_size__list_LiteralInteger34.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_size__list_LiteralInteger34.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.size()_result::LiteralInteger36
		addToElementRepository("LiteralInteger36", Hierarchy_assert_A_a_b_size__result_LiteralInteger36);
		Hierarchy_assert_A_a_b_size__result_LiteralInteger36.setName("LiteralInteger36");
		Hierarchy_assert_A_a_b_size__result_LiteralInteger36.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_size__result_LiteralInteger36.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b.c.d_errorStatus::LiteralInteger175
		addToElementRepository("LiteralInteger175", Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralInteger175);
		Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralInteger175.setName("LiteralInteger175");
		Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralInteger175.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralInteger175.setValue(0);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow67::LiteralInteger68
		addToElementRepository("LiteralInteger68", Hierarchy_assert_A_ObjectFlow67_LiteralInteger68);
		Hierarchy_assert_A_ObjectFlow67_LiteralInteger68.setName("LiteralInteger68");
		Hierarchy_assert_A_ObjectFlow67_LiteralInteger68.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow67_LiteralInteger68.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a_node::LiteralInteger165
		addToElementRepository("LiteralInteger165", Hierarchy_assert_A_a_node_LiteralInteger165);
		Hierarchy_assert_A_a_node_LiteralInteger165.setName("LiteralInteger165");
		Hierarchy_assert_A_a_node_LiteralInteger165.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_node_LiteralInteger165.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow122::LiteralInteger123
		addToElementRepository("LiteralInteger123", Hierarchy_assert_A_ObjectFlow122_LiteralInteger123);
		Hierarchy_assert_A_ObjectFlow122_LiteralInteger123.setName("LiteralInteger123");
		Hierarchy_assert_A_ObjectFlow122_LiteralInteger123.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow122_LiteralInteger123.setValue(1);
		// LiteralInteger Hierarchy_instantiate_A_A()_result::LiteralInteger13
		addToElementRepository("LiteralInteger13", Hierarchy_instantiate_A_A__result_LiteralInteger13);
		Hierarchy_instantiate_A_A__result_LiteralInteger13.setName("LiteralInteger13");
		Hierarchy_instantiate_A_A__result_LiteralInteger13.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_A__result_LiteralInteger13.setValue(1);
		// LiteralInteger Hierarchy_instantiate_A_Create_A_result::LiteralInteger23
		addToElementRepository("LiteralInteger23", Hierarchy_instantiate_A_Create_A_result_LiteralInteger23);
		Hierarchy_instantiate_A_Create_A_result_LiteralInteger23.setName("LiteralInteger23");
		Hierarchy_instantiate_A_Create_A_result_LiteralInteger23.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_Create_A_result_LiteralInteger23.setValue(1);
		// LiteralInteger Hierarchy_assert_A_ObjectFlow114::LiteralInteger116
		addToElementRepository("LiteralInteger116", Hierarchy_assert_A_ObjectFlow114_LiteralInteger116);
		Hierarchy_assert_A_ObjectFlow114_LiteralInteger116.setName("LiteralInteger116");
		Hierarchy_assert_A_ObjectFlow114_LiteralInteger116.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_ObjectFlow114_LiteralInteger116.setValue(1);
		// LiteralInteger Hierarchy_assert_A_WriteLine_a.b_errorStatus::LiteralInteger49
		addToElementRepository("LiteralInteger49", Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralInteger49);
		Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralInteger49.setName("LiteralInteger49");
		Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralInteger49.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralInteger49.setValue(1);
		// LiteralInteger Hierarchy_assert_A_String(a.b.c.size)_result::LiteralInteger39
		addToElementRepository("LiteralInteger39", Hierarchy_assert_A_String_a_b_c_size_result_LiteralInteger39);
		Hierarchy_assert_A_String_a_b_c_size_result_LiteralInteger39.setName("LiteralInteger39");
		Hierarchy_assert_A_String_a_b_c_size_result_LiteralInteger39.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_size_result_LiteralInteger39.setValue(1);
		// LiteralInteger Hierarchy_assert_A_a.b.c.d.e.size()_list::LiteralInteger53
		addToElementRepository("LiteralInteger53", Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralInteger53);
		Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralInteger53.setName("LiteralInteger53");
		Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralInteger53.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralInteger53.setValue(1);
	}

	private void initializeLiteralString_Instances()
	{
		// LiteralString Hierarchy_assert_A_String(a.b.c.d.e.size)::LiteralString166
		addToElementRepository("LiteralString166", Hierarchy_assert_A_String_a_b_c_d_e_size_LiteralString166);
		Hierarchy_assert_A_String_a_b_c_d_e_size_LiteralString166.setName("LiteralString166");
		Hierarchy_assert_A_String_a_b_c_d_e_size_LiteralString166.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_d_e_size_LiteralString166.setValue("Asserting a.b.c.d.e.size == 0");
		// LiteralString Hierarchy_assert_A_String(a.b.c.d.size)::LiteralString91
		addToElementRepository("LiteralString91", Hierarchy_assert_A_String_a_b_c_d_size_LiteralString91);
		Hierarchy_assert_A_String_a_b_c_d_size_LiteralString91.setName("LiteralString91");
		Hierarchy_assert_A_String_a_b_c_d_size_LiteralString91.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_d_size_LiteralString91.setValue("Asserting a.b.c.d.size > 0");
		// LiteralString Hierarchy_assert_A_String(a.b.size)::LiteralString174
		addToElementRepository("LiteralString174", Hierarchy_assert_A_String_a_b_size_LiteralString174);
		Hierarchy_assert_A_String_a_b_size_LiteralString174.setName("LiteralString174");
		Hierarchy_assert_A_String_a_b_size_LiteralString174.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_size_LiteralString174.setValue("Asserting a.b.size > 0");
		// LiteralString Hierarchy_assert_A_String(a.b.c.size)::LiteralString40
		addToElementRepository("LiteralString40", Hierarchy_assert_A_String_a_b_c_size_LiteralString40);
		Hierarchy_assert_A_String_a_b_c_size_LiteralString40.setName("LiteralString40");
		Hierarchy_assert_A_String_a_b_c_size_LiteralString40.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_size_LiteralString40.setValue("Asserting a.b.c.size > 0");
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural Hierarchy_instantiate_A_A()_target::LiteralUnlimitedNatural14
		addToElementRepository("LiteralUnlimitedNatural14", Hierarchy_instantiate_A_A__target_LiteralUnlimitedNatural14);
		Hierarchy_instantiate_A_A__target_LiteralUnlimitedNatural14.setName("LiteralUnlimitedNatural14");
		Hierarchy_instantiate_A_A__target_LiteralUnlimitedNatural14.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_A__target_LiteralUnlimitedNatural14.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_String(a.b.size)_result::LiteralUnlimitedNatural172
		addToElementRepository("LiteralUnlimitedNatural172", Hierarchy_assert_A_String_a_b_size_result_LiteralUnlimitedNatural172);
		Hierarchy_assert_A_String_a_b_size_result_LiteralUnlimitedNatural172.setName("LiteralUnlimitedNatural172");
		Hierarchy_assert_A_String_a_b_size_result_LiteralUnlimitedNatural172.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_size_result_LiteralUnlimitedNatural172.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_main_instantiate_A_a::LiteralUnlimitedNatural1
		addToElementRepository("LiteralUnlimitedNatural1", Hierarchy_main_instantiate_A_a_LiteralUnlimitedNatural1);
		Hierarchy_main_instantiate_A_a_LiteralUnlimitedNatural1.setName("LiteralUnlimitedNatural1");
		Hierarchy_main_instantiate_A_a_LiteralUnlimitedNatural1.setVisibility(VisibilityKind.public_);
		Hierarchy_main_instantiate_A_a_LiteralUnlimitedNatural1.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_String(a.b.c.size)_result::LiteralUnlimitedNatural38
		addToElementRepository("LiteralUnlimitedNatural38", Hierarchy_assert_A_String_a_b_c_size_result_LiteralUnlimitedNatural38);
		Hierarchy_assert_A_String_a_b_c_size_result_LiteralUnlimitedNatural38.setName("LiteralUnlimitedNatural38");
		Hierarchy_assert_A_String_a_b_c_size_result_LiteralUnlimitedNatural38.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_size_result_LiteralUnlimitedNatural38.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a.b.c.d.e_errorStatus::LiteralUnlimitedNatural75
		addToElementRepository("LiteralUnlimitedNatural75", Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralUnlimitedNatural75);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralUnlimitedNatural75.setName("LiteralUnlimitedNatural75");
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralUnlimitedNatural75.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus_LiteralUnlimitedNatural75.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a.b.c_value::LiteralUnlimitedNatural105
		addToElementRepository("LiteralUnlimitedNatural105", Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralUnlimitedNatural105);
		Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralUnlimitedNatural105.setName("LiteralUnlimitedNatural105");
		Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralUnlimitedNatural105.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_value_LiteralUnlimitedNatural105.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_String(a.b.c.d.e.size)_result::LiteralUnlimitedNatural168
		addToElementRepository("LiteralUnlimitedNatural168", Hierarchy_assert_A_String_a_b_c_d_e_size_result_LiteralUnlimitedNatural168);
		Hierarchy_assert_A_String_a_b_c_d_e_size_result_LiteralUnlimitedNatural168.setName("LiteralUnlimitedNatural168");
		Hierarchy_assert_A_String_a_b_c_d_e_size_result_LiteralUnlimitedNatural168.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_d_e_size_result_LiteralUnlimitedNatural168.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_Test a.b.c.d.size_listSize::LiteralUnlimitedNatural42
		addToElementRepository("LiteralUnlimitedNatural42", Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralUnlimitedNatural42);
		Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralUnlimitedNatural42.setName("LiteralUnlimitedNatural42");
		Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralUnlimitedNatural42.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_d_size_listSize_LiteralUnlimitedNatural42.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_Read a.b.c_result::LiteralUnlimitedNatural134
		addToElementRepository("LiteralUnlimitedNatural134", Hierarchy_assert_A_Read_a_b_c_result_LiteralUnlimitedNatural134);
		Hierarchy_assert_A_Read_a_b_c_result_LiteralUnlimitedNatural134.setName("LiteralUnlimitedNatural134");
		Hierarchy_assert_A_Read_a_b_c_result_LiteralUnlimitedNatural134.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_result_LiteralUnlimitedNatural134.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a.b.c.d.e_value::LiteralUnlimitedNatural79
		addToElementRepository("LiteralUnlimitedNatural79", Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralUnlimitedNatural79);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralUnlimitedNatural79.setName("LiteralUnlimitedNatural79");
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralUnlimitedNatural79.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_value_LiteralUnlimitedNatural79.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_a.b.c.d.e.size()_list::LiteralUnlimitedNatural51
		addToElementRepository("LiteralUnlimitedNatural51", Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralUnlimitedNatural51);
		Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralUnlimitedNatural51.setName("LiteralUnlimitedNatural51");
		Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralUnlimitedNatural51.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_e_size__list_LiteralUnlimitedNatural51.setValue(-1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_Read a.b.c.d.e_result::LiteralUnlimitedNatural26
		addToElementRepository("LiteralUnlimitedNatural26", Hierarchy_assert_A_Read_a_b_c_d_e_result_LiteralUnlimitedNatural26);
		Hierarchy_assert_A_Read_a_b_c_d_e_result_LiteralUnlimitedNatural26.setName("LiteralUnlimitedNatural26");
		Hierarchy_assert_A_Read_a_b_c_d_e_result_LiteralUnlimitedNatural26.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_e_result_LiteralUnlimitedNatural26.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a.b.c_errorStatus::LiteralUnlimitedNatural101
		addToElementRepository("LiteralUnlimitedNatural101", Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralUnlimitedNatural101);
		Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralUnlimitedNatural101.setName("LiteralUnlimitedNatural101");
		Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralUnlimitedNatural101.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_errorStatus_LiteralUnlimitedNatural101.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_instantiate_A_A()_result::LiteralUnlimitedNatural11
		addToElementRepository("LiteralUnlimitedNatural11", Hierarchy_instantiate_A_A__result_LiteralUnlimitedNatural11);
		Hierarchy_instantiate_A_A__result_LiteralUnlimitedNatural11.setName("LiteralUnlimitedNatural11");
		Hierarchy_instantiate_A_A__result_LiteralUnlimitedNatural11.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_A__result_LiteralUnlimitedNatural11.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_Read a.b_result::LiteralUnlimitedNatural125
		addToElementRepository("LiteralUnlimitedNatural125", Hierarchy_assert_A_Read_a_b_result_LiteralUnlimitedNatural125);
		Hierarchy_assert_A_Read_a_b_result_LiteralUnlimitedNatural125.setName("LiteralUnlimitedNatural125");
		Hierarchy_assert_A_Read_a_b_result_LiteralUnlimitedNatural125.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_result_LiteralUnlimitedNatural125.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_Read a.b.c.d_object::LiteralUnlimitedNatural70
		addToElementRepository("LiteralUnlimitedNatural70", Hierarchy_assert_A_Read_a_b_c_d_object_LiteralUnlimitedNatural70);
		Hierarchy_assert_A_Read_a_b_c_d_object_LiteralUnlimitedNatural70.setName("LiteralUnlimitedNatural70");
		Hierarchy_assert_A_Read_a_b_c_d_object_LiteralUnlimitedNatural70.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_object_LiteralUnlimitedNatural70.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_String(a.b.c.d.size)_result::LiteralUnlimitedNatural90
		addToElementRepository("LiteralUnlimitedNatural90", Hierarchy_assert_A_String_a_b_c_d_size_result_LiteralUnlimitedNatural90);
		Hierarchy_assert_A_String_a_b_c_d_size_result_LiteralUnlimitedNatural90.setName("LiteralUnlimitedNatural90");
		Hierarchy_assert_A_String_a_b_c_d_size_result_LiteralUnlimitedNatural90.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_d_size_result_LiteralUnlimitedNatural90.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_Test a.b.size_listSize::LiteralUnlimitedNatural162
		addToElementRepository("LiteralUnlimitedNatural162", Hierarchy_assert_A_Test_a_b_size_listSize_LiteralUnlimitedNatural162);
		Hierarchy_assert_A_Test_a_b_size_listSize_LiteralUnlimitedNatural162.setName("LiteralUnlimitedNatural162");
		Hierarchy_assert_A_Test_a_b_size_listSize_LiteralUnlimitedNatural162.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_size_listSize_LiteralUnlimitedNatural162.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_a.b.c.size()_list::LiteralUnlimitedNatural99
		addToElementRepository("LiteralUnlimitedNatural99", Hierarchy_assert_A_a_b_c_size__list_LiteralUnlimitedNatural99);
		Hierarchy_assert_A_a_b_c_size__list_LiteralUnlimitedNatural99.setName("LiteralUnlimitedNatural99");
		Hierarchy_assert_A_a_b_c_size__list_LiteralUnlimitedNatural99.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_size__list_LiteralUnlimitedNatural99.setValue(-1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_a.b.c.d.size()_result::LiteralUnlimitedNatural156
		addToElementRepository("LiteralUnlimitedNatural156", Hierarchy_assert_A_a_b_c_d_size__result_LiteralUnlimitedNatural156);
		Hierarchy_assert_A_a_b_c_d_size__result_LiteralUnlimitedNatural156.setName("LiteralUnlimitedNatural156");
		Hierarchy_assert_A_a_b_c_d_size__result_LiteralUnlimitedNatural156.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_size__result_LiteralUnlimitedNatural156.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_main_assert_A_a::LiteralUnlimitedNatural7
		addToElementRepository("LiteralUnlimitedNatural7", Hierarchy_main_assert_A_a_LiteralUnlimitedNatural7);
		Hierarchy_main_assert_A_a_LiteralUnlimitedNatural7.setName("LiteralUnlimitedNatural7");
		Hierarchy_main_assert_A_a_LiteralUnlimitedNatural7.setVisibility(VisibilityKind.public_);
		Hierarchy_main_assert_A_a_LiteralUnlimitedNatural7.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_Test a.b.c.size_listSize::LiteralUnlimitedNatural60
		addToElementRepository("LiteralUnlimitedNatural60", Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralUnlimitedNatural60);
		Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralUnlimitedNatural60.setName("LiteralUnlimitedNatural60");
		Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralUnlimitedNatural60.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_size_listSize_LiteralUnlimitedNatural60.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_Read a.b.c.d_result::LiteralUnlimitedNatural72
		addToElementRepository("LiteralUnlimitedNatural72", Hierarchy_assert_A_Read_a_b_c_d_result_LiteralUnlimitedNatural72);
		Hierarchy_assert_A_Read_a_b_c_d_result_LiteralUnlimitedNatural72.setName("LiteralUnlimitedNatural72");
		Hierarchy_assert_A_Read_a_b_c_d_result_LiteralUnlimitedNatural72.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_result_LiteralUnlimitedNatural72.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_Test a.b.c.d.e.size_listSize::LiteralUnlimitedNatural93
		addToElementRepository("LiteralUnlimitedNatural93", Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralUnlimitedNatural93);
		Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralUnlimitedNatural93.setName("LiteralUnlimitedNatural93");
		Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralUnlimitedNatural93.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize_LiteralUnlimitedNatural93.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_Read a.b.c.d.e_object::LiteralUnlimitedNatural25
		addToElementRepository("LiteralUnlimitedNatural25", Hierarchy_assert_A_Read_a_b_c_d_e_object_LiteralUnlimitedNatural25);
		Hierarchy_assert_A_Read_a_b_c_d_e_object_LiteralUnlimitedNatural25.setName("LiteralUnlimitedNatural25");
		Hierarchy_assert_A_Read_a_b_c_d_e_object_LiteralUnlimitedNatural25.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_e_object_LiteralUnlimitedNatural25.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_instantiate_A_Create_A_result::LiteralUnlimitedNatural22
		addToElementRepository("LiteralUnlimitedNatural22", Hierarchy_instantiate_A_Create_A_result_LiteralUnlimitedNatural22);
		Hierarchy_instantiate_A_Create_A_result_LiteralUnlimitedNatural22.setName("LiteralUnlimitedNatural22");
		Hierarchy_instantiate_A_Create_A_result_LiteralUnlimitedNatural22.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_Create_A_result_LiteralUnlimitedNatural22.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a.b_errorStatus::LiteralUnlimitedNatural48
		addToElementRepository("LiteralUnlimitedNatural48", Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralUnlimitedNatural48);
		Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralUnlimitedNatural48.setName("LiteralUnlimitedNatural48");
		Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralUnlimitedNatural48.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_errorStatus_LiteralUnlimitedNatural48.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_a.b.c.d.size()_list::LiteralUnlimitedNatural161
		addToElementRepository("LiteralUnlimitedNatural161", Hierarchy_assert_A_a_b_c_d_size__list_LiteralUnlimitedNatural161);
		Hierarchy_assert_A_a_b_c_d_size__list_LiteralUnlimitedNatural161.setName("LiteralUnlimitedNatural161");
		Hierarchy_assert_A_a_b_c_d_size__list_LiteralUnlimitedNatural161.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_size__list_LiteralUnlimitedNatural161.setValue(-1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_a.b.size()_list::LiteralUnlimitedNatural32
		addToElementRepository("LiteralUnlimitedNatural32", Hierarchy_assert_A_a_b_size__list_LiteralUnlimitedNatural32);
		Hierarchy_assert_A_a_b_size__list_LiteralUnlimitedNatural32.setName("LiteralUnlimitedNatural32");
		Hierarchy_assert_A_a_b_size__list_LiteralUnlimitedNatural32.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_size__list_LiteralUnlimitedNatural32.setValue(-1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a.b_value::LiteralUnlimitedNatural45
		addToElementRepository("LiteralUnlimitedNatural45", Hierarchy_assert_A_WriteLine_a_b_value_LiteralUnlimitedNatural45);
		Hierarchy_assert_A_WriteLine_a_b_value_LiteralUnlimitedNatural45.setName("LiteralUnlimitedNatural45");
		Hierarchy_assert_A_WriteLine_a_b_value_LiteralUnlimitedNatural45.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_value_LiteralUnlimitedNatural45.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_Read a.b.c_object::LiteralUnlimitedNatural135
		addToElementRepository("LiteralUnlimitedNatural135", Hierarchy_assert_A_Read_a_b_c_object_LiteralUnlimitedNatural135);
		Hierarchy_assert_A_Read_a_b_c_object_LiteralUnlimitedNatural135.setName("LiteralUnlimitedNatural135");
		Hierarchy_assert_A_Read_a_b_c_object_LiteralUnlimitedNatural135.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_object_LiteralUnlimitedNatural135.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_a.b.c.size()_result::LiteralUnlimitedNatural97
		addToElementRepository("LiteralUnlimitedNatural97", Hierarchy_assert_A_a_b_c_size__result_LiteralUnlimitedNatural97);
		Hierarchy_assert_A_a_b_c_size__result_LiteralUnlimitedNatural97.setName("LiteralUnlimitedNatural97");
		Hierarchy_assert_A_a_b_c_size__result_LiteralUnlimitedNatural97.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_size__result_LiteralUnlimitedNatural97.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_Read a.b_object::LiteralUnlimitedNatural128
		addToElementRepository("LiteralUnlimitedNatural128", Hierarchy_assert_A_Read_a_b_object_LiteralUnlimitedNatural128);
		Hierarchy_assert_A_Read_a_b_object_LiteralUnlimitedNatural128.setName("LiteralUnlimitedNatural128");
		Hierarchy_assert_A_Read_a_b_object_LiteralUnlimitedNatural128.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_object_LiteralUnlimitedNatural128.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_a.b.c.d.e.size()_result::LiteralUnlimitedNatural56
		addToElementRepository("LiteralUnlimitedNatural56", Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralUnlimitedNatural56);
		Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralUnlimitedNatural56.setName("LiteralUnlimitedNatural56");
		Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralUnlimitedNatural56.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_e_size__result_LiteralUnlimitedNatural56.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_a.b.size()_result::LiteralUnlimitedNatural37
		addToElementRepository("LiteralUnlimitedNatural37", Hierarchy_assert_A_a_b_size__result_LiteralUnlimitedNatural37);
		Hierarchy_assert_A_a_b_size__result_LiteralUnlimitedNatural37.setName("LiteralUnlimitedNatural37");
		Hierarchy_assert_A_a_b_size__result_LiteralUnlimitedNatural37.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_size__result_LiteralUnlimitedNatural37.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a.b.c.d_errorStatus::LiteralUnlimitedNatural177
		addToElementRepository("LiteralUnlimitedNatural177", Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralUnlimitedNatural177);
		Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralUnlimitedNatural177.setName("LiteralUnlimitedNatural177");
		Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralUnlimitedNatural177.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus_LiteralUnlimitedNatural177.setValue(1);
		// LiteralUnlimitedNatural Hierarchy_assert_A_WriteLine_a.b.c.d_value::LiteralUnlimitedNatural180
		addToElementRepository("LiteralUnlimitedNatural180", Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralUnlimitedNatural180);
		Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralUnlimitedNatural180.setName("LiteralUnlimitedNatural180");
		Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralUnlimitedNatural180.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_WriteLine_a_b_c_d_value_LiteralUnlimitedNatural180.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow Hierarchy_assert_A::ObjectFlow63
		addToElementRepository("ObjectFlow63", Hierarchy_assert_A_ObjectFlow63);
		Hierarchy_assert_A_ObjectFlow63.setName("ObjectFlow63");
		Hierarchy_assert_A_ObjectFlow63.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow63.setSource(Hierarchy_assert_A_String_a_b_c_size_result);
		Hierarchy_assert_A_ObjectFlow63.setTarget(Hierarchy_assert_A_WriteLine_a_b_c_value);
		Hierarchy_assert_A_ObjectFlow63.setGuard(Hierarchy_assert_A_ObjectFlow63_LiteralBoolean64);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow137
		addToElementRepository("ObjectFlow137", Hierarchy_assert_A_ObjectFlow137);
		Hierarchy_assert_A_ObjectFlow137.setName("ObjectFlow137");
		Hierarchy_assert_A_ObjectFlow137.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow137.setSource(Hierarchy_assert_A_Read_a_b_c_d_result);
		Hierarchy_assert_A_ObjectFlow137.setTarget(Hierarchy_assert_A_Fork_a_b_c_d);
		Hierarchy_assert_A_ObjectFlow137.setGuard(Hierarchy_assert_A_ObjectFlow137_LiteralBoolean139);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow140
		addToElementRepository("ObjectFlow140", Hierarchy_assert_A_ObjectFlow140);
		Hierarchy_assert_A_ObjectFlow140.setName("ObjectFlow140");
		Hierarchy_assert_A_ObjectFlow140.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow140.setSource(Hierarchy_assert_A_a_b_c_d_e_size__result);
		Hierarchy_assert_A_ObjectFlow140.setTarget(Hierarchy_assert_A_Test_a_b_c_d_e_size_listSize);
		Hierarchy_assert_A_ObjectFlow140.setGuard(Hierarchy_assert_A_ObjectFlow140_LiteralBoolean142);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow143
		addToElementRepository("ObjectFlow143", Hierarchy_assert_A_ObjectFlow143);
		Hierarchy_assert_A_ObjectFlow143.setName("ObjectFlow143");
		Hierarchy_assert_A_ObjectFlow143.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow143.setSource(Hierarchy_assert_A_Fork_a_b_c);
		Hierarchy_assert_A_ObjectFlow143.setTarget(Hierarchy_assert_A_a_b_c_size__list);
		Hierarchy_assert_A_ObjectFlow143.setGuard(Hierarchy_assert_A_ObjectFlow143_LiteralBoolean145);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow114
		addToElementRepository("ObjectFlow114", Hierarchy_assert_A_ObjectFlow114);
		Hierarchy_assert_A_ObjectFlow114.setName("ObjectFlow114");
		Hierarchy_assert_A_ObjectFlow114.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow114.setSource(Hierarchy_assert_A_String_a_b_c_d_e_size_result);
		Hierarchy_assert_A_ObjectFlow114.setTarget(Hierarchy_assert_A_WriteLine_a_b_c_d_e_value);
		Hierarchy_assert_A_ObjectFlow114.setGuard(Hierarchy_assert_A_ObjectFlow114_LiteralBoolean115);
		// ObjectFlow Hierarchy_main::ObjectFlow4
		addToElementRepository("ObjectFlow4", Hierarchy_main_ObjectFlow4);
		Hierarchy_main_ObjectFlow4.setName("ObjectFlow4");
		Hierarchy_main_ObjectFlow4.setVisibility(VisibilityKind.public_);
		
		Hierarchy_main_ObjectFlow4.setSource(Hierarchy_main_instantiate_A_a);
		Hierarchy_main_ObjectFlow4.setTarget(Hierarchy_main_assert_A_a);
		Hierarchy_main_ObjectFlow4.setGuard(Hierarchy_main_ObjectFlow4_LiteralBoolean5);
		// ObjectFlow Hierarchy_instantiate_A::ObjectFlow19
		addToElementRepository("ObjectFlow19", Hierarchy_instantiate_A_ObjectFlow19);
		Hierarchy_instantiate_A_ObjectFlow19.setName("ObjectFlow19");
		Hierarchy_instantiate_A_ObjectFlow19.setVisibility(VisibilityKind.public_);
		
		Hierarchy_instantiate_A_ObjectFlow19.setSource(Hierarchy_instantiate_A_A__result);
		Hierarchy_instantiate_A_ObjectFlow19.setTarget(Hierarchy_instantiate_A_a_node);
		Hierarchy_instantiate_A_ObjectFlow19.setGuard(Hierarchy_instantiate_A_ObjectFlow19_LiteralBoolean20);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow148
		addToElementRepository("ObjectFlow148", Hierarchy_assert_A_ObjectFlow148);
		Hierarchy_assert_A_ObjectFlow148.setName("ObjectFlow148");
		Hierarchy_assert_A_ObjectFlow148.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow148.setSource(Hierarchy_assert_A_String_a_b_c_d_size_result);
		Hierarchy_assert_A_ObjectFlow148.setTarget(Hierarchy_assert_A_WriteLine_a_b_c_d_value);
		Hierarchy_assert_A_ObjectFlow148.setGuard(Hierarchy_assert_A_ObjectFlow148_LiteralBoolean150);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow119
		addToElementRepository("ObjectFlow119", Hierarchy_assert_A_ObjectFlow119);
		Hierarchy_assert_A_ObjectFlow119.setName("ObjectFlow119");
		Hierarchy_assert_A_ObjectFlow119.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow119.setSource(Hierarchy_assert_A_Fork_a_b_c);
		Hierarchy_assert_A_ObjectFlow119.setTarget(Hierarchy_assert_A_Read_a_b_c_d_object);
		Hierarchy_assert_A_ObjectFlow119.setGuard(Hierarchy_assert_A_ObjectFlow119_LiteralBoolean120);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow122
		addToElementRepository("ObjectFlow122", Hierarchy_assert_A_ObjectFlow122);
		Hierarchy_assert_A_ObjectFlow122.setName("ObjectFlow122");
		Hierarchy_assert_A_ObjectFlow122.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow122.setSource(Hierarchy_assert_A_Fork_a_b_c_d);
		Hierarchy_assert_A_ObjectFlow122.setTarget(Hierarchy_assert_A_Read_a_b_c_d_e_object);
		Hierarchy_assert_A_ObjectFlow122.setGuard(Hierarchy_assert_A_ObjectFlow122_LiteralBoolean124);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow29
		addToElementRepository("ObjectFlow29", Hierarchy_assert_A_ObjectFlow29);
		Hierarchy_assert_A_ObjectFlow29.setName("ObjectFlow29");
		Hierarchy_assert_A_ObjectFlow29.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow29.setSource(Hierarchy_assert_A_Fork_a_b);
		Hierarchy_assert_A_ObjectFlow29.setTarget(Hierarchy_assert_A_a_b_size__list);
		Hierarchy_assert_A_ObjectFlow29.setGuard(Hierarchy_assert_A_ObjectFlow29_LiteralBoolean30);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow151
		addToElementRepository("ObjectFlow151", Hierarchy_assert_A_ObjectFlow151);
		Hierarchy_assert_A_ObjectFlow151.setName("ObjectFlow151");
		Hierarchy_assert_A_ObjectFlow151.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow151.setSource(Hierarchy_assert_A_a_b_c_d_size__result);
		Hierarchy_assert_A_ObjectFlow151.setTarget(Hierarchy_assert_A_Test_a_b_c_d_size_listSize);
		Hierarchy_assert_A_ObjectFlow151.setGuard(Hierarchy_assert_A_ObjectFlow151_LiteralBoolean152);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow67
		addToElementRepository("ObjectFlow67", Hierarchy_assert_A_ObjectFlow67);
		Hierarchy_assert_A_ObjectFlow67.setName("ObjectFlow67");
		Hierarchy_assert_A_ObjectFlow67.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow67.setSource(Hierarchy_assert_A_Fork_a_b);
		Hierarchy_assert_A_ObjectFlow67.setTarget(Hierarchy_assert_A_Read_a_b_c_object);
		Hierarchy_assert_A_ObjectFlow67.setGuard(Hierarchy_assert_A_ObjectFlow67_LiteralBoolean69);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow80
		addToElementRepository("ObjectFlow80", Hierarchy_assert_A_ObjectFlow80);
		Hierarchy_assert_A_ObjectFlow80.setName("ObjectFlow80");
		Hierarchy_assert_A_ObjectFlow80.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow80.setSource(Hierarchy_assert_A_Read_a_b_c_d_e_result);
		Hierarchy_assert_A_ObjectFlow80.setTarget(Hierarchy_assert_A_a_b_c_d_e_size__list);
		Hierarchy_assert_A_ObjectFlow80.setGuard(Hierarchy_assert_A_ObjectFlow80_LiteralBoolean82);
		// ObjectFlow Hierarchy_instantiate_A::ObjectFlow16
		addToElementRepository("ObjectFlow16", Hierarchy_instantiate_A_ObjectFlow16);
		Hierarchy_instantiate_A_ObjectFlow16.setName("ObjectFlow16");
		Hierarchy_instantiate_A_ObjectFlow16.setVisibility(VisibilityKind.public_);
		
		Hierarchy_instantiate_A_ObjectFlow16.setSource(Hierarchy_instantiate_A_Create_A_result);
		Hierarchy_instantiate_A_ObjectFlow16.setTarget(Hierarchy_instantiate_A_A__target);
		Hierarchy_instantiate_A_ObjectFlow16.setGuard(Hierarchy_instantiate_A_ObjectFlow16_LiteralBoolean17);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow83
		addToElementRepository("ObjectFlow83", Hierarchy_assert_A_ObjectFlow83);
		Hierarchy_assert_A_ObjectFlow83.setName("ObjectFlow83");
		Hierarchy_assert_A_ObjectFlow83.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow83.setSource(Hierarchy_assert_A_a_node);
		Hierarchy_assert_A_ObjectFlow83.setTarget(Hierarchy_assert_A_Read_a_b_object);
		Hierarchy_assert_A_ObjectFlow83.setGuard(Hierarchy_assert_A_ObjectFlow83_LiteralBoolean85);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow129
		addToElementRepository("ObjectFlow129", Hierarchy_assert_A_ObjectFlow129);
		Hierarchy_assert_A_ObjectFlow129.setName("ObjectFlow129");
		Hierarchy_assert_A_ObjectFlow129.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow129.setSource(Hierarchy_assert_A_Read_a_b_result);
		Hierarchy_assert_A_ObjectFlow129.setTarget(Hierarchy_assert_A_Fork_a_b);
		Hierarchy_assert_A_ObjectFlow129.setGuard(Hierarchy_assert_A_ObjectFlow129_LiteralBoolean130);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow86
		addToElementRepository("ObjectFlow86", Hierarchy_assert_A_ObjectFlow86);
		Hierarchy_assert_A_ObjectFlow86.setName("ObjectFlow86");
		Hierarchy_assert_A_ObjectFlow86.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow86.setSource(Hierarchy_assert_A_Fork_a_b_c_d);
		Hierarchy_assert_A_ObjectFlow86.setTarget(Hierarchy_assert_A_a_b_c_d_size__list);
		Hierarchy_assert_A_ObjectFlow86.setGuard(Hierarchy_assert_A_ObjectFlow86_LiteralBoolean87);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow57
		addToElementRepository("ObjectFlow57", Hierarchy_assert_A_ObjectFlow57);
		Hierarchy_assert_A_ObjectFlow57.setName("ObjectFlow57");
		Hierarchy_assert_A_ObjectFlow57.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow57.setSource(Hierarchy_assert_A_a_b_c_size__result);
		Hierarchy_assert_A_ObjectFlow57.setTarget(Hierarchy_assert_A_Test_a_b_c_size_listSize);
		Hierarchy_assert_A_ObjectFlow57.setGuard(Hierarchy_assert_A_ObjectFlow57_LiteralBoolean58);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow107
		addToElementRepository("ObjectFlow107", Hierarchy_assert_A_ObjectFlow107);
		Hierarchy_assert_A_ObjectFlow107.setName("ObjectFlow107");
		Hierarchy_assert_A_ObjectFlow107.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow107.setSource(Hierarchy_assert_A_a_b_size__result);
		Hierarchy_assert_A_ObjectFlow107.setTarget(Hierarchy_assert_A_Test_a_b_size_listSize);
		Hierarchy_assert_A_ObjectFlow107.setGuard(Hierarchy_assert_A_ObjectFlow107_LiteralBoolean108);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow169
		addToElementRepository("ObjectFlow169", Hierarchy_assert_A_ObjectFlow169);
		Hierarchy_assert_A_ObjectFlow169.setName("ObjectFlow169");
		Hierarchy_assert_A_ObjectFlow169.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow169.setSource(Hierarchy_assert_A_Read_a_b_c_result);
		Hierarchy_assert_A_ObjectFlow169.setTarget(Hierarchy_assert_A_Fork_a_b_c);
		Hierarchy_assert_A_ObjectFlow169.setGuard(Hierarchy_assert_A_ObjectFlow169_LiteralBoolean171);
		// ObjectFlow Hierarchy_assert_A::ObjectFlow111
		addToElementRepository("ObjectFlow111", Hierarchy_assert_A_ObjectFlow111);
		Hierarchy_assert_A_ObjectFlow111.setName("ObjectFlow111");
		Hierarchy_assert_A_ObjectFlow111.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_ObjectFlow111.setSource(Hierarchy_assert_A_String_a_b_size_result);
		Hierarchy_assert_A_ObjectFlow111.setTarget(Hierarchy_assert_A_WriteLine_a_b_value);
		Hierarchy_assert_A_ObjectFlow111.setGuard(Hierarchy_assert_A_ObjectFlow111_LiteralBoolean112);
	}

	private void initializeOperation_Instances()
	{
		// Operation Hierarchy_A::A_A
		addToElementRepository("A_A", Hierarchy_A_A_A);
		Hierarchy_A_A_A.setName("A");
		Hierarchy_A_A_A.setVisibility(VisibilityKind.public_);
		Hierarchy_A_A_A.addOwnedParameter(Hierarchy_A_A_A_result);
		Hierarchy_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin Hierarchy_assert_A_WriteLine_a.b.c.d::errorStatus
		addToElementRepository("errorStatus", Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus);
		Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus.setName("errorStatus");
		Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_WriteLine_a_b_c_d_errorStatus.setLower(0);
		// OutputPin Hierarchy_assert_A_a.b.c.size()::result
		addToElementRepository("result", Hierarchy_assert_A_a_b_c_size__result);
		Hierarchy_assert_A_a_b_c_size__result.setName("result");
		Hierarchy_assert_A_a_b_c_size__result.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_size__result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Hierarchy_instantiate_A_Create_A::result
		addToElementRepository("result", Hierarchy_instantiate_A_Create_A_result);
		Hierarchy_instantiate_A_Create_A_result.setName("result");
		Hierarchy_instantiate_A_Create_A_result.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_Create_A_result.setType(Hierarchy_A);
		// OutputPin Hierarchy_assert_A_String(a.b.size)::result
		addToElementRepository("result", Hierarchy_assert_A_String_a_b_size_result);
		Hierarchy_assert_A_String_a_b_size_result.setName("result");
		Hierarchy_assert_A_String_a_b_size_result.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_size_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin Hierarchy_assert_A_Read a.b.c.d.e::result
		addToElementRepository("result", Hierarchy_assert_A_Read_a_b_c_d_e_result);
		Hierarchy_assert_A_Read_a_b_c_d_e_result.setName("result");
		Hierarchy_assert_A_Read_a_b_c_d_e_result.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_e_result.setType(Hierarchy_E);
		// OutputPin Hierarchy_assert_A_a.b.c.d.e.size()::result
		addToElementRepository("result", Hierarchy_assert_A_a_b_c_d_e_size__result);
		Hierarchy_assert_A_a_b_c_d_e_size__result.setName("result");
		Hierarchy_assert_A_a_b_c_d_e_size__result.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_e_size__result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Hierarchy_assert_A_a.b.size()::result
		addToElementRepository("result", Hierarchy_assert_A_a_b_size__result);
		Hierarchy_assert_A_a_b_size__result.setName("result");
		Hierarchy_assert_A_a_b_size__result.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_size__result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Hierarchy_assert_A_Read a.b.c::result
		addToElementRepository("result", Hierarchy_assert_A_Read_a_b_c_result);
		Hierarchy_assert_A_Read_a_b_c_result.setName("result");
		Hierarchy_assert_A_Read_a_b_c_result.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_result.setType(Hierarchy_C);
		// OutputPin Hierarchy_assert_A_WriteLine_a.b.c::errorStatus
		addToElementRepository("errorStatus", Hierarchy_assert_A_WriteLine_a_b_c_errorStatus);
		Hierarchy_assert_A_WriteLine_a_b_c_errorStatus.setName("errorStatus");
		Hierarchy_assert_A_WriteLine_a_b_c_errorStatus.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_WriteLine_a_b_c_errorStatus.setLower(0);
		// OutputPin Hierarchy_instantiate_A_A()::result
		addToElementRepository("result", Hierarchy_instantiate_A_A__result);
		Hierarchy_instantiate_A_A__result.setName("result");
		Hierarchy_instantiate_A_A__result.setVisibility(VisibilityKind.public_);
		Hierarchy_instantiate_A_A__result.setType(Hierarchy_A);
		// OutputPin Hierarchy_assert_A_a.b.c.d.size()::result
		addToElementRepository("result", Hierarchy_assert_A_a_b_c_d_size__result);
		Hierarchy_assert_A_a_b_c_d_size__result.setName("result");
		Hierarchy_assert_A_a_b_c_d_size__result.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_a_b_c_d_size__result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin Hierarchy_main_instantiate_A::a
		addToElementRepository("a", Hierarchy_main_instantiate_A_a);
		Hierarchy_main_instantiate_A_a.setName("a");
		Hierarchy_main_instantiate_A_a.setVisibility(VisibilityKind.public_);
		Hierarchy_main_instantiate_A_a.setType(Hierarchy_A);
		// OutputPin Hierarchy_assert_A_WriteLine_a.b.c.d.e::errorStatus
		addToElementRepository("errorStatus", Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus);
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus.setName("errorStatus");
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_WriteLine_a_b_c_d_e_errorStatus.setLower(0);
		// OutputPin Hierarchy_assert_A_Read a.b.c.d::result
		addToElementRepository("result", Hierarchy_assert_A_Read_a_b_c_d_result);
		Hierarchy_assert_A_Read_a_b_c_d_result.setName("result");
		Hierarchy_assert_A_Read_a_b_c_d_result.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_result.setType(Hierarchy_D);
		// OutputPin Hierarchy_assert_A_Read a.b::result
		addToElementRepository("result", Hierarchy_assert_A_Read_a_b_result);
		Hierarchy_assert_A_Read_a_b_result.setName("result");
		Hierarchy_assert_A_Read_a_b_result.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_result.setType(Hierarchy_B);
		// OutputPin Hierarchy_assert_A_String(a.b.c.size)::result
		addToElementRepository("result", Hierarchy_assert_A_String_a_b_c_size_result);
		Hierarchy_assert_A_String_a_b_c_size_result.setName("result");
		Hierarchy_assert_A_String_a_b_c_size_result.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_size_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin Hierarchy_assert_A_String(a.b.c.d.size)::result
		addToElementRepository("result", Hierarchy_assert_A_String_a_b_c_d_size_result);
		Hierarchy_assert_A_String_a_b_c_d_size_result.setName("result");
		Hierarchy_assert_A_String_a_b_c_d_size_result.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_d_size_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin Hierarchy_assert_A_String(a.b.c.d.e.size)::result
		addToElementRepository("result", Hierarchy_assert_A_String_a_b_c_d_e_size_result);
		Hierarchy_assert_A_String_a_b_c_d_e_size_result.setName("result");
		Hierarchy_assert_A_String_a_b_c_d_e_size_result.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_d_e_size_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin Hierarchy_assert_A_WriteLine_a.b::errorStatus
		addToElementRepository("errorStatus", Hierarchy_assert_A_WriteLine_a_b_errorStatus);
		Hierarchy_assert_A_WriteLine_a_b_errorStatus.setName("errorStatus");
		Hierarchy_assert_A_WriteLine_a_b_errorStatus.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_WriteLine_a_b_errorStatus.setLower(0);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport Hierarchy::PackageImport181
		addToElementRepository("PackageImport181", Hierarchy_PackageImport181);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter Hierarchy_instantiate_A::a
		addToElementRepository("a", Hierarchy_instantiate_A_a);
		Hierarchy_instantiate_A_a.setName("a");
		Hierarchy_instantiate_A_a.setVisibility(VisibilityKind.public_);
		
		Hierarchy_instantiate_A_a.setType(Hierarchy_A);
		Hierarchy_instantiate_A_a.setDirection(ParameterDirectionKind.return_);
		// Parameter Hierarchy_assert_A_testEmptyList::listSize
		addToElementRepository("listSize", Hierarchy_assert_A_testEmptyList_listSize);
		Hierarchy_assert_A_testEmptyList_listSize.setName("listSize");
		Hierarchy_assert_A_testEmptyList_listSize.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_testEmptyList_listSize.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Hierarchy_A_A_A::result
		addToElementRepository("result", Hierarchy_A_A_A_result);
		Hierarchy_A_A_A_result.setName("result");
		Hierarchy_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		Hierarchy_A_A_A_result.setType(Hierarchy_A);
		Hierarchy_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter Hierarchy_assert_A_testNonEmptyList::listSize
		addToElementRepository("listSize", Hierarchy_assert_A_testNonEmptyList_listSize);
		Hierarchy_assert_A_testNonEmptyList_listSize.setName("listSize");
		Hierarchy_assert_A_testNonEmptyList_listSize.setVisibility(VisibilityKind.public_);
		
		Hierarchy_assert_A_testNonEmptyList_listSize.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter Hierarchy_assert_A::a
		addToElementRepository("a", Hierarchy_assert_A_a);
		Hierarchy_assert_A_a.setName("a");
		Hierarchy_assert_A_a.setVisibility(VisibilityKind.public_);
	}

	private void initializeProperty_Instances()
	{
		// Property Hierarchy_C::d
		addToElementRepository("d", Hierarchy_C_d);
		Hierarchy_C_d.setName("d");
		Hierarchy_C_d.setVisibility(VisibilityKind.public_);
		
		Hierarchy_C_d.setType(Hierarchy_D);
		Hierarchy_C_d.setAggregation(AggregationKind.composite);
		// Property Hierarchy_A::b
		addToElementRepository("b", Hierarchy_A_b);
		Hierarchy_A_b.setName("b");
		Hierarchy_A_b.setVisibility(VisibilityKind.public_);
		
		Hierarchy_A_b.setType(Hierarchy_B);
		Hierarchy_A_b.setAggregation(AggregationKind.composite);
		// Property Hierarchy_D::e
		addToElementRepository("e", Hierarchy_D_e);
		Hierarchy_D_e.setName("e");
		Hierarchy_D_e.setVisibility(VisibilityKind.public_);
		
		Hierarchy_D_e.setType(Hierarchy_E);
		Hierarchy_D_e.setAggregation(AggregationKind.shared);
		// Property Hierarchy_B::c
		addToElementRepository("c", Hierarchy_B_c);
		Hierarchy_B_c.setName("c");
		Hierarchy_B_c.setVisibility(VisibilityKind.public_);
		
		Hierarchy_B_c.setType(Hierarchy_C);
		Hierarchy_B_c.setAggregation(AggregationKind.composite);
	}

	private void initializeReadStructuralFeatureAction_Instances()
	{
		// ReadStructuralFeatureAction Hierarchy_assert_A::Read a.b
		addToElementRepository("Read a.b", Hierarchy_assert_A_Read_a_b);
		Hierarchy_assert_A_Read_a_b.setName("Read a.b");
		Hierarchy_assert_A_Read_a_b.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b.setStructuralFeature(Hierarchy_A_b);
		Hierarchy_assert_A_Read_a_b.setObject(Hierarchy_assert_A_Read_a_b_object);
		Hierarchy_assert_A_Read_a_b.setResult(Hierarchy_assert_A_Read_a_b_result);
		// ReadStructuralFeatureAction Hierarchy_assert_A::Read a.b.c.d
		addToElementRepository("Read a.b.c.d", Hierarchy_assert_A_Read_a_b_c_d);
		Hierarchy_assert_A_Read_a_b_c_d.setName("Read a.b.c.d");
		Hierarchy_assert_A_Read_a_b_c_d.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d.setStructuralFeature(Hierarchy_C_d);
		Hierarchy_assert_A_Read_a_b_c_d.setObject(Hierarchy_assert_A_Read_a_b_c_d_object);
		Hierarchy_assert_A_Read_a_b_c_d.setResult(Hierarchy_assert_A_Read_a_b_c_d_result);
		// ReadStructuralFeatureAction Hierarchy_assert_A::Read a.b.c.d.e
		addToElementRepository("Read a.b.c.d.e", Hierarchy_assert_A_Read_a_b_c_d_e);
		Hierarchy_assert_A_Read_a_b_c_d_e.setName("Read a.b.c.d.e");
		Hierarchy_assert_A_Read_a_b_c_d_e.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c_d_e.setStructuralFeature(Hierarchy_D_e);
		Hierarchy_assert_A_Read_a_b_c_d_e.setObject(Hierarchy_assert_A_Read_a_b_c_d_e_object);
		Hierarchy_assert_A_Read_a_b_c_d_e.setResult(Hierarchy_assert_A_Read_a_b_c_d_e_result);
		// ReadStructuralFeatureAction Hierarchy_assert_A::Read a.b.c
		addToElementRepository("Read a.b.c", Hierarchy_assert_A_Read_a_b_c);
		Hierarchy_assert_A_Read_a_b_c.setName("Read a.b.c");
		Hierarchy_assert_A_Read_a_b_c.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_Read_a_b_c.setStructuralFeature(Hierarchy_B_c);
		Hierarchy_assert_A_Read_a_b_c.setObject(Hierarchy_assert_A_Read_a_b_c_object);
		Hierarchy_assert_A_Read_a_b_c.setResult(Hierarchy_assert_A_Read_a_b_c_result);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction Hierarchy_assert_A::String(a.b.c.d.size)
		addToElementRepository("String(a.b.c.d.size)", Hierarchy_assert_A_String_a_b_c_d_size);
		Hierarchy_assert_A_String_a_b_c_d_size.setName("String(a.b.c.d.size)");
		Hierarchy_assert_A_String_a_b_c_d_size.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_d_size.setValue(Hierarchy_assert_A_String_a_b_c_d_size_LiteralString91);
		Hierarchy_assert_A_String_a_b_c_d_size.setResult(Hierarchy_assert_A_String_a_b_c_d_size_result);
		// ValueSpecificationAction Hierarchy_assert_A::String(a.b.c.d.e.size)
		addToElementRepository("String(a.b.c.d.e.size)", Hierarchy_assert_A_String_a_b_c_d_e_size);
		Hierarchy_assert_A_String_a_b_c_d_e_size.setName("String(a.b.c.d.e.size)");
		Hierarchy_assert_A_String_a_b_c_d_e_size.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_d_e_size.setValue(Hierarchy_assert_A_String_a_b_c_d_e_size_LiteralString166);
		Hierarchy_assert_A_String_a_b_c_d_e_size.setResult(Hierarchy_assert_A_String_a_b_c_d_e_size_result);
		// ValueSpecificationAction Hierarchy_assert_A::String(a.b.size)
		addToElementRepository("String(a.b.size)", Hierarchy_assert_A_String_a_b_size);
		Hierarchy_assert_A_String_a_b_size.setName("String(a.b.size)");
		Hierarchy_assert_A_String_a_b_size.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_size.setValue(Hierarchy_assert_A_String_a_b_size_LiteralString174);
		Hierarchy_assert_A_String_a_b_size.setResult(Hierarchy_assert_A_String_a_b_size_result);
		// ValueSpecificationAction Hierarchy_assert_A::String(a.b.c.size)
		addToElementRepository("String(a.b.c.size)", Hierarchy_assert_A_String_a_b_c_size);
		Hierarchy_assert_A_String_a_b_c_size.setName("String(a.b.c.size)");
		Hierarchy_assert_A_String_a_b_c_size.setVisibility(VisibilityKind.public_);
		Hierarchy_assert_A_String_a_b_c_size.setValue(Hierarchy_assert_A_String_a_b_c_size_LiteralString40);
		Hierarchy_assert_A_String_a_b_c_size.setResult(Hierarchy_assert_A_String_a_b_c_size_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // HierarchyModel
