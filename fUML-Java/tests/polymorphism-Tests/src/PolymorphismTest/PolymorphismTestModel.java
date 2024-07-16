/*
 * PolymorphismTestModel.java
 * 
 * Auto-generated file
 */
package PolymorphismTest;

import uml.values.LiteralBoolean;
import uml.classification.Generalization;
import uml.values.LiteralUnlimitedNatural;
import uml.activities.Activity;
import uml.actions.OutputPin;
import uml.actions.CallOperationAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.values.LiteralString;
import uml.structuredclassifiers.Class_;
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
import utils.primitivetypes.PrimitiveTypesModel;
import uml.classification.ParameterDirectionKind;
import uml.simpleclassifiers.PrimitiveType;
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

public class PolymorphismTestModel extends InMemoryModel
{
	private static PolymorphismTestModel instance;

	/*
	 * Model PolymorphismTest
	 */
	public Package PolymorphismTest = new Package();
		public Class_ PolymorphismTest_S = new Class_();
			public Activity PolymorphismTest_S_o5_method = new Activity();
				public CallBehaviorAction PolymorphismTest_S_o5_method_Call_WriteLine = new CallBehaviorAction();
					public InputPin PolymorphismTest_S_o5_method_Call_WriteLine_value = new InputPin();
						public LiteralUnlimitedNatural PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralUnlimitedNatural0 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralInteger1 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralInteger2 = new LiteralInteger();
					public OutputPin PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralUnlimitedNatural PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural3 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralInteger4 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralInteger5 = new LiteralInteger();
				public ObjectFlow PolymorphismTest_S_o5_method_ObjectFlow6 = new ObjectFlow();
					public LiteralBoolean PolymorphismTest_S_o5_method_ObjectFlow6_LiteralBoolean7 = new LiteralBoolean();
					public LiteralInteger PolymorphismTest_S_o5_method_ObjectFlow6_LiteralInteger8 = new LiteralInteger();
				public ValueSpecificationAction PolymorphismTest_S_o5_method_Message = new ValueSpecificationAction();
					public LiteralString PolymorphismTest_S_o5_method_Message_LiteralString9 = new LiteralString();
					public OutputPin PolymorphismTest_S_o5_method_Message_result = new OutputPin();
						public LiteralInteger PolymorphismTest_S_o5_method_Message_result_LiteralInteger10 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_S_o5_method_Message_result_LiteralUnlimitedNatural11 = new LiteralUnlimitedNatural();
			public Activity PolymorphismTest_S_o2_method = new Activity();
				public Parameter PolymorphismTest_S_o2_method_a = new Parameter();
				public ObjectFlow PolymorphismTest_S_o2_method_ObjectFlow12 = new ObjectFlow();
					public LiteralInteger PolymorphismTest_S_o2_method_ObjectFlow12_LiteralInteger13 = new LiteralInteger();
					public LiteralBoolean PolymorphismTest_S_o2_method_ObjectFlow12_LiteralBoolean14 = new LiteralBoolean();
				public Parameter PolymorphismTest_S_o2_method_b = new Parameter();
				public CallBehaviorAction PolymorphismTest_S_o2_method_Call_WriteLine = new CallBehaviorAction();
					public OutputPin PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralInteger PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralInteger15 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralInteger16 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural17 = new LiteralUnlimitedNatural();
					public InputPin PolymorphismTest_S_o2_method_Call_WriteLine_value = new InputPin();
						public LiteralInteger PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralInteger18 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural19 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralInteger20 = new LiteralInteger();
				public ActivityParameterNode PolymorphismTest_S_o2_method_a_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_S_o2_method_a_node_LiteralInteger21 = new LiteralInteger();
				public ActivityParameterNode PolymorphismTest_S_o2_method_b_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_S_o2_method_b_node_LiteralInteger22 = new LiteralInteger();
				public ValueSpecificationAction PolymorphismTest_S_o2_method_Message = new ValueSpecificationAction();
					public LiteralString PolymorphismTest_S_o2_method_Message_LiteralString23 = new LiteralString();
					public OutputPin PolymorphismTest_S_o2_method_Message_result = new OutputPin();
						public LiteralUnlimitedNatural PolymorphismTest_S_o2_method_Message_result_LiteralUnlimitedNatural24 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_S_o2_method_Message_result_LiteralInteger25 = new LiteralInteger();
			public Operation PolymorphismTest_S_o5 = new Operation();
			public Operation PolymorphismTest_S_o3 = new Operation();
			public Operation PolymorphismTest_S_B_o2_A = new Operation();
				public Parameter PolymorphismTest_S_B_o2_A_a = new Parameter();
				public Parameter PolymorphismTest_S_B_o2_A_b = new Parameter();
			public Activity PolymorphismTest_S_o1_method = new Activity();
				public ActivityParameterNode PolymorphismTest_S_o1_method_a_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_S_o1_method_a_node_LiteralInteger26 = new LiteralInteger();
				public CallBehaviorAction PolymorphismTest_S_o1_method_Call_WriteLine = new CallBehaviorAction();
					public InputPin PolymorphismTest_S_o1_method_Call_WriteLine_value = new InputPin();
						public LiteralInteger PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralInteger27 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural28 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralInteger29 = new LiteralInteger();
					public OutputPin PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralInteger PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralInteger30 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural31 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralInteger32 = new LiteralInteger();
				public Parameter PolymorphismTest_S_o1_method_b = new Parameter();
				public ObjectFlow PolymorphismTest_S_o1_method_ObjectFlow33 = new ObjectFlow();
					public LiteralBoolean PolymorphismTest_S_o1_method_ObjectFlow33_LiteralBoolean34 = new LiteralBoolean();
					public LiteralInteger PolymorphismTest_S_o1_method_ObjectFlow33_LiteralInteger35 = new LiteralInteger();
				public ValueSpecificationAction PolymorphismTest_S_o1_method_Message = new ValueSpecificationAction();
					public LiteralString PolymorphismTest_S_o1_method_Message_LiteralString36 = new LiteralString();
					public OutputPin PolymorphismTest_S_o1_method_Message_result = new OutputPin();
						public LiteralInteger PolymorphismTest_S_o1_method_Message_result_LiteralInteger37 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_S_o1_method_Message_result_LiteralUnlimitedNatural38 = new LiteralUnlimitedNatural();
				public ActivityParameterNode PolymorphismTest_S_o1_method_b_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_S_o1_method_b_node_LiteralInteger39 = new LiteralInteger();
				public Parameter PolymorphismTest_S_o1_method_a = new Parameter();
			public Generalization PolymorphismTest_S_Generalization40 = new Generalization();
			public Operation PolymorphismTest_S_A_o1_B = new Operation();
				public Parameter PolymorphismTest_S_A_o1_B_a = new Parameter();
				public Parameter PolymorphismTest_S_A_o1_B_b = new Parameter();
			public Activity PolymorphismTest_S_o3_method = new Activity();
				public ValueSpecificationAction PolymorphismTest_S_o3_method_Message = new ValueSpecificationAction();
					public OutputPin PolymorphismTest_S_o3_method_Message_result = new OutputPin();
						public LiteralUnlimitedNatural PolymorphismTest_S_o3_method_Message_result_LiteralUnlimitedNatural41 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_S_o3_method_Message_result_LiteralInteger42 = new LiteralInteger();
					public LiteralString PolymorphismTest_S_o3_method_Message_LiteralString43 = new LiteralString();
				public ObjectFlow PolymorphismTest_S_o3_method_ObjectFlow44 = new ObjectFlow();
					public LiteralBoolean PolymorphismTest_S_o3_method_ObjectFlow44_LiteralBoolean45 = new LiteralBoolean();
					public LiteralInteger PolymorphismTest_S_o3_method_ObjectFlow44_LiteralInteger46 = new LiteralInteger();
				public CallBehaviorAction PolymorphismTest_S_o3_method_Call_WriteLine = new CallBehaviorAction();
					public OutputPin PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralInteger PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralInteger47 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralInteger48 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural49 = new LiteralUnlimitedNatural();
					public InputPin PolymorphismTest_S_o3_method_Call_WriteLine_value = new InputPin();
						public LiteralInteger PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralInteger50 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralInteger51 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural52 = new LiteralUnlimitedNatural();
		public Activity PolymorphismTest_main = new Activity();
			public CallBehaviorAction PolymorphismTest_main_Call_runTests = new CallBehaviorAction();
				public InputPin PolymorphismTest_main_Call_runTests_u = new InputPin();
					public LiteralUnlimitedNatural PolymorphismTest_main_Call_runTests_u_LiteralUnlimitedNatural53 = new LiteralUnlimitedNatural();
					public LiteralInteger PolymorphismTest_main_Call_runTests_u_LiteralInteger54 = new LiteralInteger();
					public LiteralInteger PolymorphismTest_main_Call_runTests_u_LiteralInteger55 = new LiteralInteger();
			public Activity PolymorphismTest_main_runTests = new Activity();
				public CallOperationAction PolymorphismTest_main_runTests_Call_o4_ = new CallOperationAction();
					public InputPin PolymorphismTest_main_runTests_Call_o4__target = new InputPin();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o4__target_LiteralInteger56 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call_o4__target_LiteralUnlimitedNatural57 = new LiteralUnlimitedNatural();
				public ControlFlow PolymorphismTest_main_runTests_ControlFlow58 = new ControlFlow();
				public ObjectFlow PolymorphismTest_main_runTests_ObjectFlow59 = new ObjectFlow();
					public LiteralInteger PolymorphismTest_main_runTests_ObjectFlow59_LiteralInteger60 = new LiteralInteger();
					public LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow59_LiteralBoolean61 = new LiteralBoolean();
				public CallOperationAction PolymorphismTest_main_runTests_Call_A_x_ = new CallOperationAction();
					public InputPin PolymorphismTest_main_runTests_Call_A_x__target = new InputPin();
						public LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call_A_x__target_LiteralUnlimitedNatural62 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_main_runTests_Call_A_x__target_LiteralInteger63 = new LiteralInteger();
				public ObjectFlow PolymorphismTest_main_runTests_ObjectFlow64 = new ObjectFlow();
					public LiteralInteger PolymorphismTest_main_runTests_ObjectFlow64_LiteralInteger65 = new LiteralInteger();
					public LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow64_LiteralBoolean66 = new LiteralBoolean();
				public ObjectFlow PolymorphismTest_main_runTests_ObjectFlow67 = new ObjectFlow();
					public LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow67_LiteralBoolean68 = new LiteralBoolean();
					public LiteralInteger PolymorphismTest_main_runTests_ObjectFlow67_LiteralInteger69 = new LiteralInteger();
				public ControlFlow PolymorphismTest_main_runTests_ControlFlow70 = new ControlFlow();
				public ControlFlow PolymorphismTest_main_runTests_ControlFlow71 = new ControlFlow();
				public ForkNode PolymorphismTest_main_runTests_Fork_u = new ForkNode();
				public ActivityParameterNode PolymorphismTest_main_runTests_u_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_main_runTests_u_node_LiteralInteger72 = new LiteralInteger();
				public ControlFlow PolymorphismTest_main_runTests_ControlFlow73 = new ControlFlow();
				public ObjectFlow PolymorphismTest_main_runTests_ObjectFlow74 = new ObjectFlow();
					public LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow74_LiteralBoolean75 = new LiteralBoolean();
					public LiteralInteger PolymorphismTest_main_runTests_ObjectFlow74_LiteralInteger76 = new LiteralInteger();
				public ControlFlow PolymorphismTest_main_runTests_ControlFlow77 = new ControlFlow();
				public ObjectFlow PolymorphismTest_main_runTests_ObjectFlow78 = new ObjectFlow();
					public LiteralInteger PolymorphismTest_main_runTests_ObjectFlow78_LiteralInteger79 = new LiteralInteger();
					public LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow78_LiteralBoolean80 = new LiteralBoolean();
				public CallOperationAction PolymorphismTest_main_runTests_Call_o1_ = new CallOperationAction();
					public InputPin PolymorphismTest_main_runTests_Call_o1__target = new InputPin();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o1__target_LiteralInteger81 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call_o1__target_LiteralUnlimitedNatural82 = new LiteralUnlimitedNatural();
					public InputPin PolymorphismTest_main_runTests_Call_o1__b = new InputPin();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o1__b_LiteralInteger83 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o1__b_LiteralInteger84 = new LiteralInteger();
					public OutputPin PolymorphismTest_main_runTests_Call_o1__a = new OutputPin();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o1__a_LiteralInteger85 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o1__a_LiteralInteger86 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call_o1__a_LiteralUnlimitedNatural87 = new LiteralUnlimitedNatural();
				public ObjectFlow PolymorphismTest_main_runTests_ObjectFlow88 = new ObjectFlow();
					public LiteralInteger PolymorphismTest_main_runTests_ObjectFlow88_LiteralInteger89 = new LiteralInteger();
					public LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow88_LiteralBoolean90 = new LiteralBoolean();
				public ObjectFlow PolymorphismTest_main_runTests_ObjectFlow91 = new ObjectFlow();
					public LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow91_LiteralBoolean92 = new LiteralBoolean();
					public LiteralInteger PolymorphismTest_main_runTests_ObjectFlow91_LiteralInteger93 = new LiteralInteger();
				public Parameter PolymorphismTest_main_runTests_u = new Parameter();
				public CallOperationAction PolymorphismTest_main_runTests_Call_o2_ = new CallOperationAction();
					public InputPin PolymorphismTest_main_runTests_Call_o2__target = new InputPin();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o2__target_LiteralInteger94 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call_o2__target_LiteralUnlimitedNatural95 = new LiteralUnlimitedNatural();
					public OutputPin PolymorphismTest_main_runTests_Call_o2__a = new OutputPin();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o2__a_LiteralInteger96 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call_o2__a_LiteralUnlimitedNatural97 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o2__a_LiteralInteger98 = new LiteralInteger();
					public InputPin PolymorphismTest_main_runTests_Call_o2__b = new InputPin();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o2__b_LiteralInteger99 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o2__b_LiteralInteger100 = new LiteralInteger();
				public CallOperationAction PolymorphismTest_main_runTests_Call_U_o1_ = new CallOperationAction();
					public InputPin PolymorphismTest_main_runTests_Call_U_o1__target = new InputPin();
					public OutputPin PolymorphismTest_main_runTests_Call_U_o1__a = new OutputPin();
						public LiteralInteger PolymorphismTest_main_runTests_Call_U_o1__a_LiteralInteger101 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_main_runTests_Call_U_o1__a_LiteralInteger102 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call_U_o1__a_LiteralUnlimitedNatural103 = new LiteralUnlimitedNatural();
					public InputPin PolymorphismTest_main_runTests_Call_U_o1__b = new InputPin();
						public LiteralInteger PolymorphismTest_main_runTests_Call_U_o1__b_LiteralInteger104 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_main_runTests_Call_U_o1__b_LiteralInteger105 = new LiteralInteger();
				public CallOperationAction PolymorphismTest_main_runTests_Call_o3_ = new CallOperationAction();
					public InputPin PolymorphismTest_main_runTests_Call_o3__i = new InputPin();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o3__i_LiteralInteger106 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o3__i_LiteralInteger107 = new LiteralInteger();
					public InputPin PolymorphismTest_main_runTests_Call_o3__target = new InputPin();
						public LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call_o3__target_LiteralUnlimitedNatural108 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_main_runTests_Call_o3__target_LiteralInteger109 = new LiteralInteger();
			public CreateObjectAction PolymorphismTest_main_Create_S = new CreateObjectAction();
				public OutputPin PolymorphismTest_main_Create_S_result = new OutputPin();
					public LiteralInteger PolymorphismTest_main_Create_S_result_LiteralInteger110 = new LiteralInteger();
					public LiteralUnlimitedNatural PolymorphismTest_main_Create_S_result_LiteralUnlimitedNatural111 = new LiteralUnlimitedNatural();
			public ObjectFlow PolymorphismTest_main_ObjectFlow112 = new ObjectFlow();
				public LiteralInteger PolymorphismTest_main_ObjectFlow112_LiteralInteger113 = new LiteralInteger();
				public LiteralBoolean PolymorphismTest_main_ObjectFlow112_LiteralBoolean114 = new LiteralBoolean();
		public Class_ PolymorphismTest_A = new Class_();
			public Operation PolymorphismTest_A_x = new Operation();
			public Activity PolymorphismTest_A_x_method = new Activity();
				public CallBehaviorAction PolymorphismTest_A_x_method_Call_WriteLine = new CallBehaviorAction();
					public OutputPin PolymorphismTest_A_x_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralInteger PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralInteger115 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural116 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralInteger117 = new LiteralInteger();
					public InputPin PolymorphismTest_A_x_method_Call_WriteLine_value = new InputPin();
						public LiteralUnlimitedNatural PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralUnlimitedNatural118 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralInteger119 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralInteger120 = new LiteralInteger();
				public ObjectFlow PolymorphismTest_A_x_method_ObjectFlow121 = new ObjectFlow();
					public LiteralInteger PolymorphismTest_A_x_method_ObjectFlow121_LiteralInteger122 = new LiteralInteger();
					public LiteralBoolean PolymorphismTest_A_x_method_ObjectFlow121_LiteralBoolean123 = new LiteralBoolean();
				public ValueSpecificationAction PolymorphismTest_A_x_method_Message = new ValueSpecificationAction();
					public OutputPin PolymorphismTest_A_x_method_Message_result = new OutputPin();
						public LiteralUnlimitedNatural PolymorphismTest_A_x_method_Message_result_LiteralUnlimitedNatural124 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_A_x_method_Message_result_LiteralInteger125 = new LiteralInteger();
					public LiteralString PolymorphismTest_A_x_method_Message_LiteralString126 = new LiteralString();
		public Class_ PolymorphismTest_B = new Class_();
			public Generalization PolymorphismTest_B_Generalization127 = new Generalization();
		public PackageImport PolymorphismTest_PackageImport128 = new PackageImport();
		public Class_ PolymorphismTest_U = new Class_();
			public Activity PolymorphismTest_U_o4_method = new Activity();
				public ObjectFlow PolymorphismTest_U_o4_method_ObjectFlow129 = new ObjectFlow();
					public LiteralInteger PolymorphismTest_U_o4_method_ObjectFlow129_LiteralInteger130 = new LiteralInteger();
					public LiteralBoolean PolymorphismTest_U_o4_method_ObjectFlow129_LiteralBoolean131 = new LiteralBoolean();
				public ValueSpecificationAction PolymorphismTest_U_o4_method_Message = new ValueSpecificationAction();
					public LiteralString PolymorphismTest_U_o4_method_Message_LiteralString132 = new LiteralString();
					public OutputPin PolymorphismTest_U_o4_method_Message_result = new OutputPin();
						public LiteralInteger PolymorphismTest_U_o4_method_Message_result_LiteralInteger133 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_U_o4_method_Message_result_LiteralUnlimitedNatural134 = new LiteralUnlimitedNatural();
				public CallBehaviorAction PolymorphismTest_U_o4_method_Call_WriteLine = new CallBehaviorAction();
					public InputPin PolymorphismTest_U_o4_method_Call_WriteLine_value = new InputPin();
						public LiteralInteger PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralInteger135 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralUnlimitedNatural136 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralInteger137 = new LiteralInteger();
					public OutputPin PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralInteger PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralInteger138 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural139 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralInteger140 = new LiteralInteger();
			public Activity PolymorphismTest_U_o1_method = new Activity();
				public Parameter PolymorphismTest_U_o1_method_a = new Parameter();
				public ActivityParameterNode PolymorphismTest_U_o1_method_b_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_U_o1_method_b_node_LiteralInteger141 = new LiteralInteger();
				public ActivityParameterNode PolymorphismTest_U_o1_method_a_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_U_o1_method_a_node_LiteralInteger142 = new LiteralInteger();
				public ValueSpecificationAction PolymorphismTest_U_o1_method_Message = new ValueSpecificationAction();
					public OutputPin PolymorphismTest_U_o1_method_Message_result = new OutputPin();
						public LiteralUnlimitedNatural PolymorphismTest_U_o1_method_Message_result_LiteralUnlimitedNatural143 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_U_o1_method_Message_result_LiteralInteger144 = new LiteralInteger();
					public LiteralString PolymorphismTest_U_o1_method_Message_LiteralString145 = new LiteralString();
				public Parameter PolymorphismTest_U_o1_method_b = new Parameter();
				public ObjectFlow PolymorphismTest_U_o1_method_ObjectFlow146 = new ObjectFlow();
					public LiteralBoolean PolymorphismTest_U_o1_method_ObjectFlow146_LiteralBoolean147 = new LiteralBoolean();
					public LiteralInteger PolymorphismTest_U_o1_method_ObjectFlow146_LiteralInteger148 = new LiteralInteger();
				public CallBehaviorAction PolymorphismTest_U_o1_method_Call_WriteLine = new CallBehaviorAction();
					public InputPin PolymorphismTest_U_o1_method_Call_WriteLine_value = new InputPin();
						public LiteralUnlimitedNatural PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural149 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralInteger150 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralInteger151 = new LiteralInteger();
					public OutputPin PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralInteger PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralInteger152 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralInteger153 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural154 = new LiteralUnlimitedNatural();
			public Activity PolymorphismTest_U_x_method = new Activity();
				public CallBehaviorAction PolymorphismTest_U_x_method_Call_WriteLine = new CallBehaviorAction();
					public InputPin PolymorphismTest_U_x_method_Call_WriteLine_value = new InputPin();
						public LiteralInteger PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralInteger155 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralUnlimitedNatural156 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralInteger157 = new LiteralInteger();
					public OutputPin PolymorphismTest_U_x_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralInteger PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralInteger158 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural159 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralInteger160 = new LiteralInteger();
				public ValueSpecificationAction PolymorphismTest_U_x_method_Message = new ValueSpecificationAction();
					public LiteralString PolymorphismTest_U_x_method_Message_LiteralString161 = new LiteralString();
					public OutputPin PolymorphismTest_U_x_method_Message_result = new OutputPin();
						public LiteralInteger PolymorphismTest_U_x_method_Message_result_LiteralInteger162 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_U_x_method_Message_result_LiteralUnlimitedNatural163 = new LiteralUnlimitedNatural();
				public ObjectFlow PolymorphismTest_U_x_method_ObjectFlow164 = new ObjectFlow();
					public LiteralInteger PolymorphismTest_U_x_method_ObjectFlow164_LiteralInteger165 = new LiteralInteger();
					public LiteralBoolean PolymorphismTest_U_x_method_ObjectFlow164_LiteralBoolean166 = new LiteralBoolean();
			public Activity PolymorphismTest_U_o2_method = new Activity();
				public Parameter PolymorphismTest_U_o2_method_a = new Parameter();
				public ObjectFlow PolymorphismTest_U_o2_method_ObjectFlow167 = new ObjectFlow();
					public LiteralInteger PolymorphismTest_U_o2_method_ObjectFlow167_LiteralInteger168 = new LiteralInteger();
					public LiteralBoolean PolymorphismTest_U_o2_method_ObjectFlow167_LiteralBoolean169 = new LiteralBoolean();
				public ActivityParameterNode PolymorphismTest_U_o2_method_b_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_U_o2_method_b_node_LiteralInteger170 = new LiteralInteger();
				public CallBehaviorAction PolymorphismTest_U_o2_method_Call_WriteLine = new CallBehaviorAction();
					public InputPin PolymorphismTest_U_o2_method_Call_WriteLine_value = new InputPin();
						public LiteralInteger PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralInteger171 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralInteger172 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural173 = new LiteralUnlimitedNatural();
					public OutputPin PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralInteger PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralInteger174 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralInteger175 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural176 = new LiteralUnlimitedNatural();
				public ValueSpecificationAction PolymorphismTest_U_o2_method_Message = new ValueSpecificationAction();
					public LiteralString PolymorphismTest_U_o2_method_Message_LiteralString177 = new LiteralString();
					public OutputPin PolymorphismTest_U_o2_method_Message_result = new OutputPin();
						public LiteralInteger PolymorphismTest_U_o2_method_Message_result_LiteralInteger178 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_U_o2_method_Message_result_LiteralUnlimitedNatural179 = new LiteralUnlimitedNatural();
				public ActivityParameterNode PolymorphismTest_U_o2_method_a_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_U_o2_method_a_node_LiteralInteger180 = new LiteralInteger();
				public Parameter PolymorphismTest_U_o2_method_b = new Parameter();
			public Operation PolymorphismTest_U_A_o2_B = new Operation();
				public Parameter PolymorphismTest_U_A_o2_B_b = new Parameter();
				public Parameter PolymorphismTest_U_A_o2_B_a = new Parameter();
			public Operation PolymorphismTest_U_A_o1_B = new Operation();
				public Parameter PolymorphismTest_U_A_o1_B_b = new Parameter();
				public Parameter PolymorphismTest_U_A_o1_B_a = new Parameter();
			public Operation PolymorphismTest_U_x = new Operation();
			public Operation PolymorphismTest_U_o3_Integer = new Operation();
				public Parameter PolymorphismTest_U_o3_Integer_i = new Parameter();
			public Activity PolymorphismTest_U_o3_method = new Activity();
				public ActivityParameterNode PolymorphismTest_U_o3_method_i_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_U_o3_method_i_node_LiteralInteger181 = new LiteralInteger();
				public ValueSpecificationAction PolymorphismTest_U_o3_method_Message = new ValueSpecificationAction();
					public LiteralString PolymorphismTest_U_o3_method_Message_LiteralString182 = new LiteralString();
					public OutputPin PolymorphismTest_U_o3_method_Message_result = new OutputPin();
						public LiteralInteger PolymorphismTest_U_o3_method_Message_result_LiteralInteger183 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_U_o3_method_Message_result_LiteralUnlimitedNatural184 = new LiteralUnlimitedNatural();
				public Parameter PolymorphismTest_U_o3_method_i = new Parameter();
				public ObjectFlow PolymorphismTest_U_o3_method_ObjectFlow185 = new ObjectFlow();
					public LiteralBoolean PolymorphismTest_U_o3_method_ObjectFlow185_LiteralBoolean186 = new LiteralBoolean();
					public LiteralInteger PolymorphismTest_U_o3_method_ObjectFlow185_LiteralInteger187 = new LiteralInteger();
				public CallBehaviorAction PolymorphismTest_U_o3_method_Call_WriteLine = new CallBehaviorAction();
					public OutputPin PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralUnlimitedNatural PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural188 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralInteger189 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralInteger190 = new LiteralInteger();
					public InputPin PolymorphismTest_U_o3_method_Call_WriteLine_value = new InputPin();
						public LiteralUnlimitedNatural PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural191 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralInteger192 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralInteger193 = new LiteralInteger();
			public Operation PolymorphismTest_U_o4 = new Operation();
		public Class_ PolymorphismTest_T = new Class_();
			public Operation PolymorphismTest_T_o4 = new Operation();
			public Activity PolymorphismTest_T_o2_method = new Activity();
				public ObjectFlow PolymorphismTest_T_o2_method_ObjectFlow194 = new ObjectFlow();
					public LiteralBoolean PolymorphismTest_T_o2_method_ObjectFlow194_LiteralBoolean195 = new LiteralBoolean();
					public LiteralInteger PolymorphismTest_T_o2_method_ObjectFlow194_LiteralInteger196 = new LiteralInteger();
				public Parameter PolymorphismTest_T_o2_method_result = new Parameter();
				public ActivityParameterNode PolymorphismTest_T_o2_method_b_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_T_o2_method_b_node_LiteralInteger197 = new LiteralInteger();
				public ValueSpecificationAction PolymorphismTest_T_o2_method_Message = new ValueSpecificationAction();
					public LiteralString PolymorphismTest_T_o2_method_Message_LiteralString198 = new LiteralString();
					public OutputPin PolymorphismTest_T_o2_method_Message_result = new OutputPin();
						public LiteralInteger PolymorphismTest_T_o2_method_Message_result_LiteralInteger199 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_T_o2_method_Message_result_LiteralUnlimitedNatural200 = new LiteralUnlimitedNatural();
				public Parameter PolymorphismTest_T_o2_method_b = new Parameter();
				public CallBehaviorAction PolymorphismTest_T_o2_method_Call_WriteLine = new CallBehaviorAction();
					public OutputPin PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralInteger PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralInteger201 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralInteger202 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural203 = new LiteralUnlimitedNatural();
					public InputPin PolymorphismTest_T_o2_method_Call_WriteLine_value = new InputPin();
						public LiteralInteger PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralInteger204 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralInteger205 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural206 = new LiteralUnlimitedNatural();
				public ActivityParameterNode PolymorphismTest_T_o2_method_result_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_T_o2_method_result_node_LiteralInteger207 = new LiteralInteger();
			public Operation PolymorphismTest_T_B_o2_B = new Operation();
				public Parameter PolymorphismTest_T_B_o2_B_b = new Parameter();
				public Parameter PolymorphismTest_T_B_o2_B_result = new Parameter();
			public Operation PolymorphismTest_T_o3_Integer = new Operation();
				public Parameter PolymorphismTest_T_o3_Integer_i = new Parameter();
			public Generalization PolymorphismTest_T_Generalization208 = new Generalization();
			public Activity PolymorphismTest_T_o1_method = new Activity();
				public ValueSpecificationAction PolymorphismTest_T_o1_method_Message = new ValueSpecificationAction();
					public OutputPin PolymorphismTest_T_o1_method_Message_result = new OutputPin();
						public LiteralInteger PolymorphismTest_T_o1_method_Message_result_LiteralInteger209 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_T_o1_method_Message_result_LiteralUnlimitedNatural210 = new LiteralUnlimitedNatural();
					public LiteralString PolymorphismTest_T_o1_method_Message_LiteralString211 = new LiteralString();
				public Parameter PolymorphismTest_T_o1_method_a = new Parameter();
				public CallBehaviorAction PolymorphismTest_T_o1_method_Call_WriteLine = new CallBehaviorAction();
					public InputPin PolymorphismTest_T_o1_method_Call_WriteLine_value = new InputPin();
						public LiteralUnlimitedNatural PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural212 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralInteger213 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralInteger214 = new LiteralInteger();
					public OutputPin PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralInteger PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralInteger215 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural216 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralInteger217 = new LiteralInteger();
				public ActivityParameterNode PolymorphismTest_T_o1_method_b_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_T_o1_method_b_node_LiteralInteger218 = new LiteralInteger();
				public ObjectFlow PolymorphismTest_T_o1_method_ObjectFlow219 = new ObjectFlow();
					public LiteralBoolean PolymorphismTest_T_o1_method_ObjectFlow219_LiteralBoolean220 = new LiteralBoolean();
					public LiteralInteger PolymorphismTest_T_o1_method_ObjectFlow219_LiteralInteger221 = new LiteralInteger();
				public ActivityParameterNode PolymorphismTest_T_o1_method_a_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_T_o1_method_a_node_LiteralInteger222 = new LiteralInteger();
				public Parameter PolymorphismTest_T_o1_method_b = new Parameter();
			public Activity PolymorphismTest_T_o3_method = new Activity();
				public Parameter PolymorphismTest_T_o3_method_i = new Parameter();
				public CallBehaviorAction PolymorphismTest_T_o3_method_Call_WriteLine = new CallBehaviorAction();
					public InputPin PolymorphismTest_T_o3_method_Call_WriteLine_value = new InputPin();
						public LiteralInteger PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralInteger223 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralInteger224 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural225 = new LiteralUnlimitedNatural();
					public OutputPin PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralInteger PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralInteger226 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralInteger227 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural228 = new LiteralUnlimitedNatural();
				public ValueSpecificationAction PolymorphismTest_T_o3_method_Message = new ValueSpecificationAction();
					public LiteralString PolymorphismTest_T_o3_method_Message_LiteralString229 = new LiteralString();
					public OutputPin PolymorphismTest_T_o3_method_Message_result = new OutputPin();
						public LiteralUnlimitedNatural PolymorphismTest_T_o3_method_Message_result_LiteralUnlimitedNatural230 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_T_o3_method_Message_result_LiteralInteger231 = new LiteralInteger();
				public ActivityParameterNode PolymorphismTest_T_o3_method_i_node = new ActivityParameterNode();
					public LiteralInteger PolymorphismTest_T_o3_method_i_node_LiteralInteger232 = new LiteralInteger();
				public ObjectFlow PolymorphismTest_T_o3_method_ObjectFlow233 = new ObjectFlow();
					public LiteralInteger PolymorphismTest_T_o3_method_ObjectFlow233_LiteralInteger234 = new LiteralInteger();
					public LiteralBoolean PolymorphismTest_T_o3_method_ObjectFlow233_LiteralBoolean235 = new LiteralBoolean();
			public Activity PolymorphismTest_T_o4_method = new Activity();
				public ObjectFlow PolymorphismTest_T_o4_method_ObjectFlow236 = new ObjectFlow();
					public LiteralBoolean PolymorphismTest_T_o4_method_ObjectFlow236_LiteralBoolean237 = new LiteralBoolean();
					public LiteralInteger PolymorphismTest_T_o4_method_ObjectFlow236_LiteralInteger238 = new LiteralInteger();
				public CallBehaviorAction PolymorphismTest_T_o4_method_Call_WriteLine = new CallBehaviorAction();
					public OutputPin PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus = new OutputPin();
						public LiteralUnlimitedNatural PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural239 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralInteger240 = new LiteralInteger();
						public LiteralInteger PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralInteger241 = new LiteralInteger();
					public InputPin PolymorphismTest_T_o4_method_Call_WriteLine_value = new InputPin();
						public LiteralInteger PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralInteger242 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralUnlimitedNatural243 = new LiteralUnlimitedNatural();
						public LiteralInteger PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralInteger244 = new LiteralInteger();
				public ValueSpecificationAction PolymorphismTest_T_o4_method_Message = new ValueSpecificationAction();
					public OutputPin PolymorphismTest_T_o4_method_Message_result = new OutputPin();
						public LiteralInteger PolymorphismTest_T_o4_method_Message_result_LiteralInteger245 = new LiteralInteger();
						public LiteralUnlimitedNatural PolymorphismTest_T_o4_method_Message_result_LiteralUnlimitedNatural246 = new LiteralUnlimitedNatural();
					public LiteralString PolymorphismTest_T_o4_method_Message_LiteralString247 = new LiteralString();
			public Operation PolymorphismTest_T_A_o1_B = new Operation();
				public Parameter PolymorphismTest_T_A_o1_B_a = new Parameter();
				public Parameter PolymorphismTest_T_A_o1_B_b = new Parameter();

	public static PolymorphismTestModel instance()
	{
		if (instance == null)
        {
            instance = new PolymorphismTestModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public PolymorphismTestModel()
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
		this.initializeControlFlow_Instances();
		this.initializeCreateObjectAction_Instances();
		this.initializeForkNode_Instances();
		this.initializeGeneralization_Instances();
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
		this.initializeValueSpecificationAction_Instances();
	}

	private void initializeActivity_Instances()
	{
		// Activity PolymorphismTest_S::o5_method
		addToElementRepository("o5_method", PolymorphismTest_S_o5_method);
		PolymorphismTest_S_o5_method.setName("o5_method");
		PolymorphismTest_S_o5_method.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method.addNode(PolymorphismTest_S_o5_method_Call_WriteLine);
		PolymorphismTest_S_o5_method.addNode(PolymorphismTest_S_o5_method_Message);
		PolymorphismTest_S_o5_method.addEdge(PolymorphismTest_S_o5_method_ObjectFlow6);
		// Activity PolymorphismTest::main
		addToElementRepository("main", PolymorphismTest_main);
		PolymorphismTest_main.setName("main");
		PolymorphismTest_main.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main.addOwnedBehavior(PolymorphismTest_main_runTests);
		PolymorphismTest_main.addNode(PolymorphismTest_main_Call_runTests);
		PolymorphismTest_main.addNode(PolymorphismTest_main_Create_S);
		PolymorphismTest_main.addEdge(PolymorphismTest_main_ObjectFlow112);
		// Activity PolymorphismTest_S::o2_method
		addToElementRepository("o2_method", PolymorphismTest_S_o2_method);
		PolymorphismTest_S_o2_method.setName("o2_method");
		PolymorphismTest_S_o2_method.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o2_method.addOwnedParameter(PolymorphismTest_S_o2_method_a);
		PolymorphismTest_S_o2_method.addOwnedParameter(PolymorphismTest_S_o2_method_b);
		PolymorphismTest_S_o2_method.addNode(PolymorphismTest_S_o2_method_Call_WriteLine);
		PolymorphismTest_S_o2_method.addNode(PolymorphismTest_S_o2_method_a_node);
		PolymorphismTest_S_o2_method.addNode(PolymorphismTest_S_o2_method_b_node);
		PolymorphismTest_S_o2_method.addNode(PolymorphismTest_S_o2_method_Message);
		PolymorphismTest_S_o2_method.addEdge(PolymorphismTest_S_o2_method_ObjectFlow12);
		// Activity PolymorphismTest_U::x_method
		addToElementRepository("x_method", PolymorphismTest_U_x_method);
		PolymorphismTest_U_x_method.setName("x_method");
		PolymorphismTest_U_x_method.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method.addNode(PolymorphismTest_U_x_method_Call_WriteLine);
		PolymorphismTest_U_x_method.addNode(PolymorphismTest_U_x_method_Message);
		PolymorphismTest_U_x_method.addEdge(PolymorphismTest_U_x_method_ObjectFlow164);
		// Activity PolymorphismTest_T::o3_method
		addToElementRepository("o3_method", PolymorphismTest_T_o3_method);
		PolymorphismTest_T_o3_method.setName("o3_method");
		PolymorphismTest_T_o3_method.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o3_method.addOwnedParameter(PolymorphismTest_T_o3_method_i);
		PolymorphismTest_T_o3_method.addNode(PolymorphismTest_T_o3_method_Call_WriteLine);
		PolymorphismTest_T_o3_method.addNode(PolymorphismTest_T_o3_method_Message);
		PolymorphismTest_T_o3_method.addNode(PolymorphismTest_T_o3_method_i_node);
		PolymorphismTest_T_o3_method.addEdge(PolymorphismTest_T_o3_method_ObjectFlow233);
		// Activity PolymorphismTest_U::o3_method
		addToElementRepository("o3_method", PolymorphismTest_U_o3_method);
		PolymorphismTest_U_o3_method.setName("o3_method");
		PolymorphismTest_U_o3_method.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o3_method.addOwnedParameter(PolymorphismTest_U_o3_method_i);
		PolymorphismTest_U_o3_method.addNode(PolymorphismTest_U_o3_method_i_node);
		PolymorphismTest_U_o3_method.addNode(PolymorphismTest_U_o3_method_Message);
		PolymorphismTest_U_o3_method.addNode(PolymorphismTest_U_o3_method_Call_WriteLine);
		PolymorphismTest_U_o3_method.addEdge(PolymorphismTest_U_o3_method_ObjectFlow185);
		// Activity PolymorphismTest_U::o4_method
		addToElementRepository("o4_method", PolymorphismTest_U_o4_method);
		PolymorphismTest_U_o4_method.setName("o4_method");
		PolymorphismTest_U_o4_method.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method.addNode(PolymorphismTest_U_o4_method_Message);
		PolymorphismTest_U_o4_method.addNode(PolymorphismTest_U_o4_method_Call_WriteLine);
		PolymorphismTest_U_o4_method.addEdge(PolymorphismTest_U_o4_method_ObjectFlow129);
		// Activity PolymorphismTest_U::o1_method
		addToElementRepository("o1_method", PolymorphismTest_U_o1_method);
		PolymorphismTest_U_o1_method.setName("o1_method");
		PolymorphismTest_U_o1_method.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o1_method.addOwnedParameter(PolymorphismTest_U_o1_method_b);
		PolymorphismTest_U_o1_method.addOwnedParameter(PolymorphismTest_U_o1_method_a);
		PolymorphismTest_U_o1_method.addNode(PolymorphismTest_U_o1_method_b_node);
		PolymorphismTest_U_o1_method.addNode(PolymorphismTest_U_o1_method_a_node);
		PolymorphismTest_U_o1_method.addNode(PolymorphismTest_U_o1_method_Message);
		PolymorphismTest_U_o1_method.addNode(PolymorphismTest_U_o1_method_Call_WriteLine);
		PolymorphismTest_U_o1_method.addEdge(PolymorphismTest_U_o1_method_ObjectFlow146);
		// Activity PolymorphismTest_U::o2_method
		addToElementRepository("o2_method", PolymorphismTest_U_o2_method);
		PolymorphismTest_U_o2_method.setName("o2_method");
		PolymorphismTest_U_o2_method.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o2_method.addOwnedParameter(PolymorphismTest_U_o2_method_b);
		PolymorphismTest_U_o2_method.addOwnedParameter(PolymorphismTest_U_o2_method_a);
		PolymorphismTest_U_o2_method.addNode(PolymorphismTest_U_o2_method_b_node);
		PolymorphismTest_U_o2_method.addNode(PolymorphismTest_U_o2_method_Call_WriteLine);
		PolymorphismTest_U_o2_method.addNode(PolymorphismTest_U_o2_method_Message);
		PolymorphismTest_U_o2_method.addNode(PolymorphismTest_U_o2_method_a_node);
		PolymorphismTest_U_o2_method.addEdge(PolymorphismTest_U_o2_method_ObjectFlow167);
		// Activity PolymorphismTest_main::runTests
		addToElementRepository("runTests", PolymorphismTest_main_runTests);
		PolymorphismTest_main_runTests.setName("runTests");
		PolymorphismTest_main_runTests.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests.addOwnedParameter(PolymorphismTest_main_runTests_u);
		PolymorphismTest_main_runTests.addNode(PolymorphismTest_main_runTests_Call_o1_);
		PolymorphismTest_main_runTests.addNode(PolymorphismTest_main_runTests_Call_o4_);
		PolymorphismTest_main_runTests.addNode(PolymorphismTest_main_runTests_Call_A_x_);
		PolymorphismTest_main_runTests.addNode(PolymorphismTest_main_runTests_Fork_u);
		PolymorphismTest_main_runTests.addNode(PolymorphismTest_main_runTests_u_node);
		PolymorphismTest_main_runTests.addNode(PolymorphismTest_main_runTests_Call_o2_);
		PolymorphismTest_main_runTests.addNode(PolymorphismTest_main_runTests_Call_U_o1_);
		PolymorphismTest_main_runTests.addNode(PolymorphismTest_main_runTests_Call_o3_);
		PolymorphismTest_main_runTests.addEdge(PolymorphismTest_main_runTests_ControlFlow58);
		PolymorphismTest_main_runTests.addEdge(PolymorphismTest_main_runTests_ObjectFlow59);
		PolymorphismTest_main_runTests.addEdge(PolymorphismTest_main_runTests_ObjectFlow64);
		PolymorphismTest_main_runTests.addEdge(PolymorphismTest_main_runTests_ObjectFlow67);
		PolymorphismTest_main_runTests.addEdge(PolymorphismTest_main_runTests_ControlFlow70);
		PolymorphismTest_main_runTests.addEdge(PolymorphismTest_main_runTests_ControlFlow71);
		PolymorphismTest_main_runTests.addEdge(PolymorphismTest_main_runTests_ControlFlow73);
		PolymorphismTest_main_runTests.addEdge(PolymorphismTest_main_runTests_ObjectFlow74);
		PolymorphismTest_main_runTests.addEdge(PolymorphismTest_main_runTests_ControlFlow77);
		PolymorphismTest_main_runTests.addEdge(PolymorphismTest_main_runTests_ObjectFlow78);
		PolymorphismTest_main_runTests.addEdge(PolymorphismTest_main_runTests_ObjectFlow88);
		PolymorphismTest_main_runTests.addEdge(PolymorphismTest_main_runTests_ObjectFlow91);
		// Activity PolymorphismTest_T::o2_method
		addToElementRepository("o2_method", PolymorphismTest_T_o2_method);
		PolymorphismTest_T_o2_method.setName("o2_method");
		PolymorphismTest_T_o2_method.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o2_method.addOwnedParameter(PolymorphismTest_T_o2_method_b);
		PolymorphismTest_T_o2_method.addOwnedParameter(PolymorphismTest_T_o2_method_result);
		PolymorphismTest_T_o2_method.addNode(PolymorphismTest_T_o2_method_b_node);
		PolymorphismTest_T_o2_method.addNode(PolymorphismTest_T_o2_method_Message);
		PolymorphismTest_T_o2_method.addNode(PolymorphismTest_T_o2_method_Call_WriteLine);
		PolymorphismTest_T_o2_method.addNode(PolymorphismTest_T_o2_method_result_node);
		PolymorphismTest_T_o2_method.addEdge(PolymorphismTest_T_o2_method_ObjectFlow194);
		// Activity PolymorphismTest_T::o1_method
		addToElementRepository("o1_method", PolymorphismTest_T_o1_method);
		PolymorphismTest_T_o1_method.setName("o1_method");
		PolymorphismTest_T_o1_method.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o1_method.addOwnedParameter(PolymorphismTest_T_o1_method_b);
		PolymorphismTest_T_o1_method.addOwnedParameter(PolymorphismTest_T_o1_method_a);
		PolymorphismTest_T_o1_method.addNode(PolymorphismTest_T_o1_method_Message);
		PolymorphismTest_T_o1_method.addNode(PolymorphismTest_T_o1_method_Call_WriteLine);
		PolymorphismTest_T_o1_method.addNode(PolymorphismTest_T_o1_method_b_node);
		PolymorphismTest_T_o1_method.addNode(PolymorphismTest_T_o1_method_a_node);
		PolymorphismTest_T_o1_method.addEdge(PolymorphismTest_T_o1_method_ObjectFlow219);
		// Activity PolymorphismTest_S::o1_method
		addToElementRepository("o1_method", PolymorphismTest_S_o1_method);
		PolymorphismTest_S_o1_method.setName("o1_method");
		PolymorphismTest_S_o1_method.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o1_method.addOwnedParameter(PolymorphismTest_S_o1_method_b);
		PolymorphismTest_S_o1_method.addOwnedParameter(PolymorphismTest_S_o1_method_a);
		PolymorphismTest_S_o1_method.addNode(PolymorphismTest_S_o1_method_a_node);
		PolymorphismTest_S_o1_method.addNode(PolymorphismTest_S_o1_method_Call_WriteLine);
		PolymorphismTest_S_o1_method.addNode(PolymorphismTest_S_o1_method_Message);
		PolymorphismTest_S_o1_method.addNode(PolymorphismTest_S_o1_method_b_node);
		PolymorphismTest_S_o1_method.addEdge(PolymorphismTest_S_o1_method_ObjectFlow33);
		// Activity PolymorphismTest_T::o4_method
		addToElementRepository("o4_method", PolymorphismTest_T_o4_method);
		PolymorphismTest_T_o4_method.setName("o4_method");
		PolymorphismTest_T_o4_method.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method.addNode(PolymorphismTest_T_o4_method_Call_WriteLine);
		PolymorphismTest_T_o4_method.addNode(PolymorphismTest_T_o4_method_Message);
		PolymorphismTest_T_o4_method.addEdge(PolymorphismTest_T_o4_method_ObjectFlow236);
		// Activity PolymorphismTest_A::x_method
		addToElementRepository("x_method", PolymorphismTest_A_x_method);
		PolymorphismTest_A_x_method.setName("x_method");
		PolymorphismTest_A_x_method.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method.addNode(PolymorphismTest_A_x_method_Call_WriteLine);
		PolymorphismTest_A_x_method.addNode(PolymorphismTest_A_x_method_Message);
		PolymorphismTest_A_x_method.addEdge(PolymorphismTest_A_x_method_ObjectFlow121);
		// Activity PolymorphismTest_S::o3_method
		addToElementRepository("o3_method", PolymorphismTest_S_o3_method);
		PolymorphismTest_S_o3_method.setName("o3_method");
		PolymorphismTest_S_o3_method.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method.addNode(PolymorphismTest_S_o3_method_Message);
		PolymorphismTest_S_o3_method.addNode(PolymorphismTest_S_o3_method_Call_WriteLine);
		PolymorphismTest_S_o3_method.addEdge(PolymorphismTest_S_o3_method_ObjectFlow44);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode PolymorphismTest_U_o3_method::i_node
		addToElementRepository("i_node", PolymorphismTest_U_o3_method_i_node);
		PolymorphismTest_U_o3_method_i_node.setName("i_node");
		PolymorphismTest_U_o3_method_i_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o3_method_i_node.setParameter(PolymorphismTest_U_o3_method_i);
		// ActivityParameterNode PolymorphismTest_S_o1_method::a_node
		addToElementRepository("a_node", PolymorphismTest_S_o1_method_a_node);
		PolymorphismTest_S_o1_method_a_node.setName("a_node");
		PolymorphismTest_S_o1_method_a_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o1_method_a_node.setParameter(PolymorphismTest_S_o1_method_a);
		// ActivityParameterNode PolymorphismTest_T_o2_method::b_node
		addToElementRepository("b_node", PolymorphismTest_T_o2_method_b_node);
		PolymorphismTest_T_o2_method_b_node.setName("b_node");
		PolymorphismTest_T_o2_method_b_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o2_method_b_node.setParameter(PolymorphismTest_T_o2_method_b);
		// ActivityParameterNode PolymorphismTest_main_runTests::u_node
		addToElementRepository("u_node", PolymorphismTest_main_runTests_u_node);
		PolymorphismTest_main_runTests_u_node.setName("u_node");
		PolymorphismTest_main_runTests_u_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_u_node.setParameter(PolymorphismTest_main_runTests_u);
		// ActivityParameterNode PolymorphismTest_U_o1_method::a_node
		addToElementRepository("a_node", PolymorphismTest_U_o1_method_a_node);
		PolymorphismTest_U_o1_method_a_node.setName("a_node");
		PolymorphismTest_U_o1_method_a_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o1_method_a_node.setParameter(PolymorphismTest_U_o1_method_a);
		// ActivityParameterNode PolymorphismTest_S_o2_method::b_node
		addToElementRepository("b_node", PolymorphismTest_S_o2_method_b_node);
		PolymorphismTest_S_o2_method_b_node.setName("b_node");
		PolymorphismTest_S_o2_method_b_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o2_method_b_node.setParameter(PolymorphismTest_S_o2_method_b);
		// ActivityParameterNode PolymorphismTest_U_o2_method::a_node
		addToElementRepository("a_node", PolymorphismTest_U_o2_method_a_node);
		PolymorphismTest_U_o2_method_a_node.setName("a_node");
		PolymorphismTest_U_o2_method_a_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o2_method_a_node.setParameter(PolymorphismTest_U_o2_method_a);
		// ActivityParameterNode PolymorphismTest_T_o1_method::a_node
		addToElementRepository("a_node", PolymorphismTest_T_o1_method_a_node);
		PolymorphismTest_T_o1_method_a_node.setName("a_node");
		PolymorphismTest_T_o1_method_a_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o1_method_a_node.setParameter(PolymorphismTest_T_o1_method_a);
		// ActivityParameterNode PolymorphismTest_T_o2_method::result_node
		addToElementRepository("result_node", PolymorphismTest_T_o2_method_result_node);
		PolymorphismTest_T_o2_method_result_node.setName("result_node");
		PolymorphismTest_T_o2_method_result_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o2_method_result_node.setParameter(PolymorphismTest_T_o2_method_result);
		// ActivityParameterNode PolymorphismTest_U_o2_method::b_node
		addToElementRepository("b_node", PolymorphismTest_U_o2_method_b_node);
		PolymorphismTest_U_o2_method_b_node.setName("b_node");
		PolymorphismTest_U_o2_method_b_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o2_method_b_node.setParameter(PolymorphismTest_U_o2_method_b);
		// ActivityParameterNode PolymorphismTest_U_o1_method::b_node
		addToElementRepository("b_node", PolymorphismTest_U_o1_method_b_node);
		PolymorphismTest_U_o1_method_b_node.setName("b_node");
		PolymorphismTest_U_o1_method_b_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o1_method_b_node.setParameter(PolymorphismTest_U_o1_method_b);
		// ActivityParameterNode PolymorphismTest_S_o1_method::b_node
		addToElementRepository("b_node", PolymorphismTest_S_o1_method_b_node);
		PolymorphismTest_S_o1_method_b_node.setName("b_node");
		PolymorphismTest_S_o1_method_b_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o1_method_b_node.setParameter(PolymorphismTest_S_o1_method_b);
		// ActivityParameterNode PolymorphismTest_S_o2_method::a_node
		addToElementRepository("a_node", PolymorphismTest_S_o2_method_a_node);
		PolymorphismTest_S_o2_method_a_node.setName("a_node");
		PolymorphismTest_S_o2_method_a_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o2_method_a_node.setParameter(PolymorphismTest_S_o2_method_a);
		// ActivityParameterNode PolymorphismTest_T_o3_method::i_node
		addToElementRepository("i_node", PolymorphismTest_T_o3_method_i_node);
		PolymorphismTest_T_o3_method_i_node.setName("i_node");
		PolymorphismTest_T_o3_method_i_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o3_method_i_node.setParameter(PolymorphismTest_T_o3_method_i);
		// ActivityParameterNode PolymorphismTest_T_o1_method::b_node
		addToElementRepository("b_node", PolymorphismTest_T_o1_method_b_node);
		PolymorphismTest_T_o1_method_b_node.setName("b_node");
		PolymorphismTest_T_o1_method_b_node.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o1_method_b_node.setParameter(PolymorphismTest_T_o1_method_b);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction PolymorphismTest_main::Call runTests
		addToElementRepository("Call runTests", PolymorphismTest_main_Call_runTests);
		PolymorphismTest_main_Call_runTests.setName("Call runTests");
		PolymorphismTest_main_Call_runTests.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_Call_runTests.setBehavior(PolymorphismTest_main_runTests);
		PolymorphismTest_main_Call_runTests.addArgument(PolymorphismTest_main_Call_runTests_u);
		// CallBehaviorAction PolymorphismTest_A_x_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_A_x_method_Call_WriteLine);
		PolymorphismTest_A_x_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_A_x_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_A_x_method_Call_WriteLine.addResult(PolymorphismTest_A_x_method_Call_WriteLine_errorStatus);
		PolymorphismTest_A_x_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_A_x_method_Call_WriteLine.addArgument(PolymorphismTest_A_x_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_U_x_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_U_x_method_Call_WriteLine);
		PolymorphismTest_U_x_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_U_x_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_x_method_Call_WriteLine.addResult(PolymorphismTest_U_x_method_Call_WriteLine_errorStatus);
		PolymorphismTest_U_x_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_U_x_method_Call_WriteLine.addArgument(PolymorphismTest_U_x_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_S_o2_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_S_o2_method_Call_WriteLine);
		PolymorphismTest_S_o2_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_S_o2_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o2_method_Call_WriteLine.addResult(PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus);
		PolymorphismTest_S_o2_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_S_o2_method_Call_WriteLine.addArgument(PolymorphismTest_S_o2_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_T_o1_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_T_o1_method_Call_WriteLine);
		PolymorphismTest_T_o1_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_T_o1_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o1_method_Call_WriteLine.addResult(PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus);
		PolymorphismTest_T_o1_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_T_o1_method_Call_WriteLine.addArgument(PolymorphismTest_T_o1_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_U_o4_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_U_o4_method_Call_WriteLine);
		PolymorphismTest_U_o4_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_U_o4_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o4_method_Call_WriteLine.addResult(PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus);
		PolymorphismTest_U_o4_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_U_o4_method_Call_WriteLine.addArgument(PolymorphismTest_U_o4_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_T_o2_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_T_o2_method_Call_WriteLine);
		PolymorphismTest_T_o2_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_T_o2_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o2_method_Call_WriteLine.addResult(PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus);
		PolymorphismTest_T_o2_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_T_o2_method_Call_WriteLine.addArgument(PolymorphismTest_T_o2_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_T_o3_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_T_o3_method_Call_WriteLine);
		PolymorphismTest_T_o3_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_T_o3_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o3_method_Call_WriteLine.addResult(PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus);
		PolymorphismTest_T_o3_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_T_o3_method_Call_WriteLine.addArgument(PolymorphismTest_T_o3_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_S_o3_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_S_o3_method_Call_WriteLine);
		PolymorphismTest_S_o3_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_S_o3_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o3_method_Call_WriteLine.addResult(PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus);
		PolymorphismTest_S_o3_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_S_o3_method_Call_WriteLine.addArgument(PolymorphismTest_S_o3_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_S_o1_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_S_o1_method_Call_WriteLine);
		PolymorphismTest_S_o1_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_S_o1_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o1_method_Call_WriteLine.addResult(PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus);
		PolymorphismTest_S_o1_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_S_o1_method_Call_WriteLine.addArgument(PolymorphismTest_S_o1_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_T_o4_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_T_o4_method_Call_WriteLine);
		PolymorphismTest_T_o4_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_T_o4_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o4_method_Call_WriteLine.addResult(PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus);
		PolymorphismTest_T_o4_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_T_o4_method_Call_WriteLine.addArgument(PolymorphismTest_T_o4_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_S_o5_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_S_o5_method_Call_WriteLine);
		PolymorphismTest_S_o5_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_S_o5_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o5_method_Call_WriteLine.addResult(PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus);
		PolymorphismTest_S_o5_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_S_o5_method_Call_WriteLine.addArgument(PolymorphismTest_S_o5_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_U_o2_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_U_o2_method_Call_WriteLine);
		PolymorphismTest_U_o2_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_U_o2_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o2_method_Call_WriteLine.addResult(PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus);
		PolymorphismTest_U_o2_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_U_o2_method_Call_WriteLine.addArgument(PolymorphismTest_U_o2_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_U_o1_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_U_o1_method_Call_WriteLine);
		PolymorphismTest_U_o1_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_U_o1_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o1_method_Call_WriteLine.addResult(PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus);
		PolymorphismTest_U_o1_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_U_o1_method_Call_WriteLine.addArgument(PolymorphismTest_U_o1_method_Call_WriteLine_value);
		// CallBehaviorAction PolymorphismTest_U_o3_method::Call WriteLine
		addToElementRepository("Call WriteLine", PolymorphismTest_U_o3_method_Call_WriteLine);
		PolymorphismTest_U_o3_method_Call_WriteLine.setName("Call WriteLine");
		PolymorphismTest_U_o3_method_Call_WriteLine.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o3_method_Call_WriteLine.addResult(PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus);
		PolymorphismTest_U_o3_method_Call_WriteLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		PolymorphismTest_U_o3_method_Call_WriteLine.addArgument(PolymorphismTest_U_o3_method_Call_WriteLine_value);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction PolymorphismTest_main_runTests::Call o1()
		addToElementRepository("Call o1()", PolymorphismTest_main_runTests_Call_o1_);
		PolymorphismTest_main_runTests_Call_o1_.setName("Call o1()");
		PolymorphismTest_main_runTests_Call_o1_.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_Call_o1_.addResult(PolymorphismTest_main_runTests_Call_o1__a);
		PolymorphismTest_main_runTests_Call_o1_.setOperation(PolymorphismTest_U_A_o1_B);
		PolymorphismTest_main_runTests_Call_o1_.setTarget(PolymorphismTest_main_runTests_Call_o1__target);
		PolymorphismTest_main_runTests_Call_o1_.addArgument(PolymorphismTest_main_runTests_Call_o1__b);
		// CallOperationAction PolymorphismTest_main_runTests::Call o4()
		addToElementRepository("Call o4()", PolymorphismTest_main_runTests_Call_o4_);
		PolymorphismTest_main_runTests_Call_o4_.setName("Call o4()");
		PolymorphismTest_main_runTests_Call_o4_.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o4_.setOperation(PolymorphismTest_U_o4);
		PolymorphismTest_main_runTests_Call_o4_.setTarget(PolymorphismTest_main_runTests_Call_o4__target);
		// CallOperationAction PolymorphismTest_main_runTests::Call A::x()
		addToElementRepository("Call A::x()", PolymorphismTest_main_runTests_Call_A_x_);
		PolymorphismTest_main_runTests_Call_A_x_.setName("Call A::x()");
		PolymorphismTest_main_runTests_Call_A_x_.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_A_x_.setOperation(PolymorphismTest_A_x);
		PolymorphismTest_main_runTests_Call_A_x_.setTarget(PolymorphismTest_main_runTests_Call_A_x__target);
		// CallOperationAction PolymorphismTest_main_runTests::Call o2()
		addToElementRepository("Call o2()", PolymorphismTest_main_runTests_Call_o2_);
		PolymorphismTest_main_runTests_Call_o2_.setName("Call o2()");
		PolymorphismTest_main_runTests_Call_o2_.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_Call_o2_.addResult(PolymorphismTest_main_runTests_Call_o2__a);
		PolymorphismTest_main_runTests_Call_o2_.setOperation(PolymorphismTest_U_A_o2_B);
		PolymorphismTest_main_runTests_Call_o2_.setTarget(PolymorphismTest_main_runTests_Call_o2__target);
		PolymorphismTest_main_runTests_Call_o2_.addArgument(PolymorphismTest_main_runTests_Call_o2__b);
		// CallOperationAction PolymorphismTest_main_runTests::Call U::o1()
		addToElementRepository("Call U::o1()", PolymorphismTest_main_runTests_Call_U_o1_);
		PolymorphismTest_main_runTests_Call_U_o1_.setName("Call U::o1()");
		PolymorphismTest_main_runTests_Call_U_o1_.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_Call_U_o1_.addResult(PolymorphismTest_main_runTests_Call_U_o1__a);
		PolymorphismTest_main_runTests_Call_U_o1_.setOperation(PolymorphismTest_U_A_o1_B);
		PolymorphismTest_main_runTests_Call_U_o1_.setTarget(PolymorphismTest_main_runTests_Call_U_o1__target);
		PolymorphismTest_main_runTests_Call_U_o1_.addArgument(PolymorphismTest_main_runTests_Call_U_o1__b);
		PolymorphismTest_main_runTests_Call_U_o1_.applyStereotype(utils.extensionsprofile.ExtensionsProfileModel.instance().Stereotype_ExplicitBaseClassCall);
		// CallOperationAction PolymorphismTest_main_runTests::Call o3()
		addToElementRepository("Call o3()", PolymorphismTest_main_runTests_Call_o3_);
		PolymorphismTest_main_runTests_Call_o3_.setName("Call o3()");
		PolymorphismTest_main_runTests_Call_o3_.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o3_.setOperation(PolymorphismTest_U_o3_Integer);
		PolymorphismTest_main_runTests_Call_o3_.setTarget(PolymorphismTest_main_runTests_Call_o3__target);
		PolymorphismTest_main_runTests_Call_o3_.addArgument(PolymorphismTest_main_runTests_Call_o3__i);
	}

	private void initializeClass_Instances()
	{
		// Class PolymorphismTest::S
		addToElementRepository("S", PolymorphismTest_S);
		PolymorphismTest_S.setName("S");
		PolymorphismTest_S.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S.addGeneralization(PolymorphismTest_S_Generalization40);
		PolymorphismTest_S.addOwnedBehavior(PolymorphismTest_S_o5_method);
		PolymorphismTest_S.addOwnedBehavior(PolymorphismTest_S_o2_method);
		PolymorphismTest_S.addOwnedBehavior(PolymorphismTest_S_o1_method);
		PolymorphismTest_S.addOwnedBehavior(PolymorphismTest_S_o3_method);
		
		PolymorphismTest_S.addOwnedOperation(PolymorphismTest_S_A_o1_B);
		PolymorphismTest_S.addOwnedOperation(PolymorphismTest_S_B_o2_A);
		PolymorphismTest_S.addOwnedOperation(PolymorphismTest_S_o3);
		PolymorphismTest_S.addOwnedOperation(PolymorphismTest_S_o5);
		// Class PolymorphismTest::B
		addToElementRepository("B", PolymorphismTest_B);
		PolymorphismTest_B.setName("B");
		PolymorphismTest_B.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_B.addGeneralization(PolymorphismTest_B_Generalization127);
		// Class PolymorphismTest::A
		addToElementRepository("A", PolymorphismTest_A);
		PolymorphismTest_A.setName("A");
		PolymorphismTest_A.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A.addOwnedBehavior(PolymorphismTest_A_x_method);
		
		PolymorphismTest_A.addOwnedOperation(PolymorphismTest_A_x);
		// Class PolymorphismTest::T
		addToElementRepository("T", PolymorphismTest_T);
		PolymorphismTest_T.setName("T");
		PolymorphismTest_T.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T.addGeneralization(PolymorphismTest_T_Generalization208);
		PolymorphismTest_T.addOwnedBehavior(PolymorphismTest_T_o2_method);
		PolymorphismTest_T.addOwnedBehavior(PolymorphismTest_T_o1_method);
		PolymorphismTest_T.addOwnedBehavior(PolymorphismTest_T_o3_method);
		PolymorphismTest_T.addOwnedBehavior(PolymorphismTest_T_o4_method);
		
		PolymorphismTest_T.addOwnedOperation(PolymorphismTest_T_A_o1_B);
		PolymorphismTest_T.addOwnedOperation(PolymorphismTest_T_B_o2_B);
		PolymorphismTest_T.addOwnedOperation(PolymorphismTest_T_o3_Integer);
		PolymorphismTest_T.addOwnedOperation(PolymorphismTest_T_o4);
		// Class PolymorphismTest::U
		addToElementRepository("U", PolymorphismTest_U);
		PolymorphismTest_U.setName("U");
		PolymorphismTest_U.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U.addOwnedBehavior(PolymorphismTest_U_o4_method);
		PolymorphismTest_U.addOwnedBehavior(PolymorphismTest_U_o1_method);
		PolymorphismTest_U.addOwnedBehavior(PolymorphismTest_U_x_method);
		PolymorphismTest_U.addOwnedBehavior(PolymorphismTest_U_o2_method);
		PolymorphismTest_U.addOwnedBehavior(PolymorphismTest_U_o3_method);
		
		PolymorphismTest_U.addOwnedOperation(PolymorphismTest_U_x);
		PolymorphismTest_U.addOwnedOperation(PolymorphismTest_U_A_o1_B);
		PolymorphismTest_U.addOwnedOperation(PolymorphismTest_U_A_o2_B);
		PolymorphismTest_U.addOwnedOperation(PolymorphismTest_U_o3_Integer);
		PolymorphismTest_U.addOwnedOperation(PolymorphismTest_U_o4);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow PolymorphismTest_main_runTests::ControlFlow58
		addToElementRepository("ControlFlow58", PolymorphismTest_main_runTests_ControlFlow58);
		PolymorphismTest_main_runTests_ControlFlow58.setName("ControlFlow58");
		PolymorphismTest_main_runTests_ControlFlow58.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_ControlFlow58.setSource(PolymorphismTest_main_runTests_Call_o3_);
		PolymorphismTest_main_runTests_ControlFlow58.setTarget(PolymorphismTest_main_runTests_Call_o4_);
		// ControlFlow PolymorphismTest_main_runTests::ControlFlow70
		addToElementRepository("ControlFlow70", PolymorphismTest_main_runTests_ControlFlow70);
		PolymorphismTest_main_runTests_ControlFlow70.setName("ControlFlow70");
		PolymorphismTest_main_runTests_ControlFlow70.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_ControlFlow70.setSource(PolymorphismTest_main_runTests_Call_A_x_);
		PolymorphismTest_main_runTests_ControlFlow70.setTarget(PolymorphismTest_main_runTests_Call_o1_);
		// ControlFlow PolymorphismTest_main_runTests::ControlFlow71
		addToElementRepository("ControlFlow71", PolymorphismTest_main_runTests_ControlFlow71);
		PolymorphismTest_main_runTests_ControlFlow71.setName("ControlFlow71");
		PolymorphismTest_main_runTests_ControlFlow71.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_ControlFlow71.setSource(PolymorphismTest_main_runTests_Call_U_o1_);
		PolymorphismTest_main_runTests_ControlFlow71.setTarget(PolymorphismTest_main_runTests_Call_o2_);
		// ControlFlow PolymorphismTest_main_runTests::ControlFlow73
		addToElementRepository("ControlFlow73", PolymorphismTest_main_runTests_ControlFlow73);
		PolymorphismTest_main_runTests_ControlFlow73.setName("ControlFlow73");
		PolymorphismTest_main_runTests_ControlFlow73.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_ControlFlow73.setSource(PolymorphismTest_main_runTests_Call_o1_);
		PolymorphismTest_main_runTests_ControlFlow73.setTarget(PolymorphismTest_main_runTests_Call_U_o1_);
		// ControlFlow PolymorphismTest_main_runTests::ControlFlow77
		addToElementRepository("ControlFlow77", PolymorphismTest_main_runTests_ControlFlow77);
		PolymorphismTest_main_runTests_ControlFlow77.setName("ControlFlow77");
		PolymorphismTest_main_runTests_ControlFlow77.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_ControlFlow77.setSource(PolymorphismTest_main_runTests_Call_o2_);
		PolymorphismTest_main_runTests_ControlFlow77.setTarget(PolymorphismTest_main_runTests_Call_o3_);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction PolymorphismTest_main::Create S
		addToElementRepository("Create S", PolymorphismTest_main_Create_S);
		PolymorphismTest_main_Create_S.setName("Create S");
		PolymorphismTest_main_Create_S.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_Create_S.setClassifier(PolymorphismTest_S);
		PolymorphismTest_main_Create_S.setResult(PolymorphismTest_main_Create_S_result);
	}

	private void initializeForkNode_Instances()
	{
		// ForkNode PolymorphismTest_main_runTests::Fork u
		addToElementRepository("Fork u", PolymorphismTest_main_runTests_Fork_u);
		PolymorphismTest_main_runTests_Fork_u.setName("Fork u");
		PolymorphismTest_main_runTests_Fork_u.setVisibility(VisibilityKind.public_);
	}

	private void initializeGeneralization_Instances()
	{
		// Generalization PolymorphismTest_T::Generalization208
		addToElementRepository("Generalization208", PolymorphismTest_T_Generalization208);
		PolymorphismTest_T_Generalization208.setGeneral(PolymorphismTest_U);
		// Generalization PolymorphismTest_S::Generalization40
		addToElementRepository("Generalization40", PolymorphismTest_S_Generalization40);
		PolymorphismTest_S_Generalization40.setGeneral(PolymorphismTest_T);
		// Generalization PolymorphismTest_B::Generalization127
		addToElementRepository("Generalization127", PolymorphismTest_B_Generalization127);
		PolymorphismTest_B_Generalization127.setGeneral(PolymorphismTest_A);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin PolymorphismTest_T_o3_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_T_o3_method_Call_WriteLine_value);
		PolymorphismTest_T_o3_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_T_o3_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_main_runTests_Call o1()::b
		addToElementRepository("b", PolymorphismTest_main_runTests_Call_o1__b);
		PolymorphismTest_main_runTests_Call_o1__b.setName("b");
		PolymorphismTest_main_runTests_Call_o1__b.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o1__b.setType(PolymorphismTest_B);
		PolymorphismTest_main_runTests_Call_o1__b.setLower(0);
		// InputPin PolymorphismTest_main_runTests_Call o3()::target
		addToElementRepository("target", PolymorphismTest_main_runTests_Call_o3__target);
		PolymorphismTest_main_runTests_Call_o3__target.setName("target");
		PolymorphismTest_main_runTests_Call_o3__target.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o3__target.setType(PolymorphismTest_U);
		// InputPin PolymorphismTest_main_runTests_Call o4()::target
		addToElementRepository("target", PolymorphismTest_main_runTests_Call_o4__target);
		PolymorphismTest_main_runTests_Call_o4__target.setName("target");
		PolymorphismTest_main_runTests_Call_o4__target.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o4__target.setType(PolymorphismTest_U);
		// InputPin PolymorphismTest_U_o3_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_U_o3_method_Call_WriteLine_value);
		PolymorphismTest_U_o3_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_U_o3_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_main_runTests_Call o2()::b
		addToElementRepository("b", PolymorphismTest_main_runTests_Call_o2__b);
		PolymorphismTest_main_runTests_Call_o2__b.setName("b");
		PolymorphismTest_main_runTests_Call_o2__b.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o2__b.setType(PolymorphismTest_B);
		PolymorphismTest_main_runTests_Call_o2__b.setLower(0);
		// InputPin PolymorphismTest_S_o5_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_S_o5_method_Call_WriteLine_value);
		PolymorphismTest_S_o5_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_S_o5_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_main_Call runTests::u
		addToElementRepository("u", PolymorphismTest_main_Call_runTests_u);
		PolymorphismTest_main_Call_runTests_u.setName("u");
		PolymorphismTest_main_Call_runTests_u.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_Call_runTests_u.setType(PolymorphismTest_U);
		// InputPin PolymorphismTest_U_x_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_U_x_method_Call_WriteLine_value);
		PolymorphismTest_U_x_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_U_x_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_T_o4_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_T_o4_method_Call_WriteLine_value);
		PolymorphismTest_T_o4_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_T_o4_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_T_o2_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_T_o2_method_Call_WriteLine_value);
		PolymorphismTest_T_o2_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_T_o2_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_S_o2_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_S_o2_method_Call_WriteLine_value);
		PolymorphismTest_S_o2_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_S_o2_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_main_runTests_Call o2()::target
		addToElementRepository("target", PolymorphismTest_main_runTests_Call_o2__target);
		PolymorphismTest_main_runTests_Call_o2__target.setName("target");
		PolymorphismTest_main_runTests_Call_o2__target.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o2__target.setType(PolymorphismTest_U);
		// InputPin PolymorphismTest_main_runTests_Call A::x()::target
		addToElementRepository("target", PolymorphismTest_main_runTests_Call_A_x__target);
		PolymorphismTest_main_runTests_Call_A_x__target.setName("target");
		PolymorphismTest_main_runTests_Call_A_x__target.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_A_x__target.setType(PolymorphismTest_A);
		// InputPin PolymorphismTest_U_o4_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_U_o4_method_Call_WriteLine_value);
		PolymorphismTest_U_o4_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_U_o4_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_U_o1_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_U_o1_method_Call_WriteLine_value);
		PolymorphismTest_U_o1_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_U_o1_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_main_runTests_Call U::o1()::target
		addToElementRepository("target", PolymorphismTest_main_runTests_Call_U_o1__target);
		PolymorphismTest_main_runTests_Call_U_o1__target.setName("target");
		PolymorphismTest_main_runTests_Call_U_o1__target.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_U_o1__target.setType(PolymorphismTest_U);
		// InputPin PolymorphismTest_S_o3_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_S_o3_method_Call_WriteLine_value);
		PolymorphismTest_S_o3_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_S_o3_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_T_o1_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_T_o1_method_Call_WriteLine_value);
		PolymorphismTest_T_o1_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_T_o1_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_main_runTests_Call o1()::target
		addToElementRepository("target", PolymorphismTest_main_runTests_Call_o1__target);
		PolymorphismTest_main_runTests_Call_o1__target.setName("target");
		PolymorphismTest_main_runTests_Call_o1__target.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o1__target.setType(PolymorphismTest_U);
		// InputPin PolymorphismTest_U_o2_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_U_o2_method_Call_WriteLine_value);
		PolymorphismTest_U_o2_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_U_o2_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_S_o1_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_S_o1_method_Call_WriteLine_value);
		PolymorphismTest_S_o1_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_S_o1_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_main_runTests_Call o3()::i
		addToElementRepository("i", PolymorphismTest_main_runTests_Call_o3__i);
		PolymorphismTest_main_runTests_Call_o3__i.setName("i");
		PolymorphismTest_main_runTests_Call_o3__i.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o3__i.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		PolymorphismTest_main_runTests_Call_o3__i.setLower(0);
		// InputPin PolymorphismTest_A_x_method_Call WriteLine::value
		addToElementRepository("value", PolymorphismTest_A_x_method_Call_WriteLine_value);
		PolymorphismTest_A_x_method_Call_WriteLine_value.setName("value");
		PolymorphismTest_A_x_method_Call_WriteLine_value.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Call_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin PolymorphismTest_main_runTests_Call U::o1()::b
		addToElementRepository("b", PolymorphismTest_main_runTests_Call_U_o1__b);
		PolymorphismTest_main_runTests_Call_U_o1__b.setName("b");
		PolymorphismTest_main_runTests_Call_U_o1__b.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_U_o1__b.setType(PolymorphismTest_B);
		PolymorphismTest_main_runTests_Call_U_o1__b.setLower(0);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean PolymorphismTest_S_o3_method_ObjectFlow44::LiteralBoolean45
		addToElementRepository("LiteralBoolean45", PolymorphismTest_S_o3_method_ObjectFlow44_LiteralBoolean45);
		PolymorphismTest_S_o3_method_ObjectFlow44_LiteralBoolean45.setName("LiteralBoolean45");
		PolymorphismTest_S_o3_method_ObjectFlow44_LiteralBoolean45.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_ObjectFlow44_LiteralBoolean45.setValue(true);
		// LiteralBoolean PolymorphismTest_U_x_method_ObjectFlow164::LiteralBoolean166
		addToElementRepository("LiteralBoolean166", PolymorphismTest_U_x_method_ObjectFlow164_LiteralBoolean166);
		PolymorphismTest_U_x_method_ObjectFlow164_LiteralBoolean166.setName("LiteralBoolean166");
		PolymorphismTest_U_x_method_ObjectFlow164_LiteralBoolean166.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_ObjectFlow164_LiteralBoolean166.setValue(true);
		// LiteralBoolean PolymorphismTest_S_o5_method_ObjectFlow6::LiteralBoolean7
		addToElementRepository("LiteralBoolean7", PolymorphismTest_S_o5_method_ObjectFlow6_LiteralBoolean7);
		PolymorphismTest_S_o5_method_ObjectFlow6_LiteralBoolean7.setName("LiteralBoolean7");
		PolymorphismTest_S_o5_method_ObjectFlow6_LiteralBoolean7.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_ObjectFlow6_LiteralBoolean7.setValue(true);
		// LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow91::LiteralBoolean92
		addToElementRepository("LiteralBoolean92", PolymorphismTest_main_runTests_ObjectFlow91_LiteralBoolean92);
		PolymorphismTest_main_runTests_ObjectFlow91_LiteralBoolean92.setName("LiteralBoolean92");
		PolymorphismTest_main_runTests_ObjectFlow91_LiteralBoolean92.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow91_LiteralBoolean92.setValue(true);
		// LiteralBoolean PolymorphismTest_T_o1_method_ObjectFlow219::LiteralBoolean220
		addToElementRepository("LiteralBoolean220", PolymorphismTest_T_o1_method_ObjectFlow219_LiteralBoolean220);
		PolymorphismTest_T_o1_method_ObjectFlow219_LiteralBoolean220.setName("LiteralBoolean220");
		PolymorphismTest_T_o1_method_ObjectFlow219_LiteralBoolean220.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_ObjectFlow219_LiteralBoolean220.setValue(true);
		// LiteralBoolean PolymorphismTest_main_ObjectFlow112::LiteralBoolean114
		addToElementRepository("LiteralBoolean114", PolymorphismTest_main_ObjectFlow112_LiteralBoolean114);
		PolymorphismTest_main_ObjectFlow112_LiteralBoolean114.setName("LiteralBoolean114");
		PolymorphismTest_main_ObjectFlow112_LiteralBoolean114.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_ObjectFlow112_LiteralBoolean114.setValue(true);
		// LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow78::LiteralBoolean80
		addToElementRepository("LiteralBoolean80", PolymorphismTest_main_runTests_ObjectFlow78_LiteralBoolean80);
		PolymorphismTest_main_runTests_ObjectFlow78_LiteralBoolean80.setName("LiteralBoolean80");
		PolymorphismTest_main_runTests_ObjectFlow78_LiteralBoolean80.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow78_LiteralBoolean80.setValue(true);
		// LiteralBoolean PolymorphismTest_A_x_method_ObjectFlow121::LiteralBoolean123
		addToElementRepository("LiteralBoolean123", PolymorphismTest_A_x_method_ObjectFlow121_LiteralBoolean123);
		PolymorphismTest_A_x_method_ObjectFlow121_LiteralBoolean123.setName("LiteralBoolean123");
		PolymorphismTest_A_x_method_ObjectFlow121_LiteralBoolean123.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_ObjectFlow121_LiteralBoolean123.setValue(true);
		// LiteralBoolean PolymorphismTest_U_o4_method_ObjectFlow129::LiteralBoolean131
		addToElementRepository("LiteralBoolean131", PolymorphismTest_U_o4_method_ObjectFlow129_LiteralBoolean131);
		PolymorphismTest_U_o4_method_ObjectFlow129_LiteralBoolean131.setName("LiteralBoolean131");
		PolymorphismTest_U_o4_method_ObjectFlow129_LiteralBoolean131.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_ObjectFlow129_LiteralBoolean131.setValue(true);
		// LiteralBoolean PolymorphismTest_S_o1_method_ObjectFlow33::LiteralBoolean34
		addToElementRepository("LiteralBoolean34", PolymorphismTest_S_o1_method_ObjectFlow33_LiteralBoolean34);
		PolymorphismTest_S_o1_method_ObjectFlow33_LiteralBoolean34.setName("LiteralBoolean34");
		PolymorphismTest_S_o1_method_ObjectFlow33_LiteralBoolean34.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_ObjectFlow33_LiteralBoolean34.setValue(true);
		// LiteralBoolean PolymorphismTest_T_o3_method_ObjectFlow233::LiteralBoolean235
		addToElementRepository("LiteralBoolean235", PolymorphismTest_T_o3_method_ObjectFlow233_LiteralBoolean235);
		PolymorphismTest_T_o3_method_ObjectFlow233_LiteralBoolean235.setName("LiteralBoolean235");
		PolymorphismTest_T_o3_method_ObjectFlow233_LiteralBoolean235.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_ObjectFlow233_LiteralBoolean235.setValue(true);
		// LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow74::LiteralBoolean75
		addToElementRepository("LiteralBoolean75", PolymorphismTest_main_runTests_ObjectFlow74_LiteralBoolean75);
		PolymorphismTest_main_runTests_ObjectFlow74_LiteralBoolean75.setName("LiteralBoolean75");
		PolymorphismTest_main_runTests_ObjectFlow74_LiteralBoolean75.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow74_LiteralBoolean75.setValue(true);
		// LiteralBoolean PolymorphismTest_T_o4_method_ObjectFlow236::LiteralBoolean237
		addToElementRepository("LiteralBoolean237", PolymorphismTest_T_o4_method_ObjectFlow236_LiteralBoolean237);
		PolymorphismTest_T_o4_method_ObjectFlow236_LiteralBoolean237.setName("LiteralBoolean237");
		PolymorphismTest_T_o4_method_ObjectFlow236_LiteralBoolean237.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_ObjectFlow236_LiteralBoolean237.setValue(true);
		// LiteralBoolean PolymorphismTest_U_o1_method_ObjectFlow146::LiteralBoolean147
		addToElementRepository("LiteralBoolean147", PolymorphismTest_U_o1_method_ObjectFlow146_LiteralBoolean147);
		PolymorphismTest_U_o1_method_ObjectFlow146_LiteralBoolean147.setName("LiteralBoolean147");
		PolymorphismTest_U_o1_method_ObjectFlow146_LiteralBoolean147.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_ObjectFlow146_LiteralBoolean147.setValue(true);
		// LiteralBoolean PolymorphismTest_U_o3_method_ObjectFlow185::LiteralBoolean186
		addToElementRepository("LiteralBoolean186", PolymorphismTest_U_o3_method_ObjectFlow185_LiteralBoolean186);
		PolymorphismTest_U_o3_method_ObjectFlow185_LiteralBoolean186.setName("LiteralBoolean186");
		PolymorphismTest_U_o3_method_ObjectFlow185_LiteralBoolean186.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_ObjectFlow185_LiteralBoolean186.setValue(true);
		// LiteralBoolean PolymorphismTest_T_o2_method_ObjectFlow194::LiteralBoolean195
		addToElementRepository("LiteralBoolean195", PolymorphismTest_T_o2_method_ObjectFlow194_LiteralBoolean195);
		PolymorphismTest_T_o2_method_ObjectFlow194_LiteralBoolean195.setName("LiteralBoolean195");
		PolymorphismTest_T_o2_method_ObjectFlow194_LiteralBoolean195.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_ObjectFlow194_LiteralBoolean195.setValue(true);
		// LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow64::LiteralBoolean66
		addToElementRepository("LiteralBoolean66", PolymorphismTest_main_runTests_ObjectFlow64_LiteralBoolean66);
		PolymorphismTest_main_runTests_ObjectFlow64_LiteralBoolean66.setName("LiteralBoolean66");
		PolymorphismTest_main_runTests_ObjectFlow64_LiteralBoolean66.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow64_LiteralBoolean66.setValue(true);
		// LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow67::LiteralBoolean68
		addToElementRepository("LiteralBoolean68", PolymorphismTest_main_runTests_ObjectFlow67_LiteralBoolean68);
		PolymorphismTest_main_runTests_ObjectFlow67_LiteralBoolean68.setName("LiteralBoolean68");
		PolymorphismTest_main_runTests_ObjectFlow67_LiteralBoolean68.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow67_LiteralBoolean68.setValue(true);
		// LiteralBoolean PolymorphismTest_U_o2_method_ObjectFlow167::LiteralBoolean169
		addToElementRepository("LiteralBoolean169", PolymorphismTest_U_o2_method_ObjectFlow167_LiteralBoolean169);
		PolymorphismTest_U_o2_method_ObjectFlow167_LiteralBoolean169.setName("LiteralBoolean169");
		PolymorphismTest_U_o2_method_ObjectFlow167_LiteralBoolean169.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_ObjectFlow167_LiteralBoolean169.setValue(true);
		// LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow59::LiteralBoolean61
		addToElementRepository("LiteralBoolean61", PolymorphismTest_main_runTests_ObjectFlow59_LiteralBoolean61);
		PolymorphismTest_main_runTests_ObjectFlow59_LiteralBoolean61.setName("LiteralBoolean61");
		PolymorphismTest_main_runTests_ObjectFlow59_LiteralBoolean61.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow59_LiteralBoolean61.setValue(true);
		// LiteralBoolean PolymorphismTest_main_runTests_ObjectFlow88::LiteralBoolean90
		addToElementRepository("LiteralBoolean90", PolymorphismTest_main_runTests_ObjectFlow88_LiteralBoolean90);
		PolymorphismTest_main_runTests_ObjectFlow88_LiteralBoolean90.setName("LiteralBoolean90");
		PolymorphismTest_main_runTests_ObjectFlow88_LiteralBoolean90.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow88_LiteralBoolean90.setValue(true);
		// LiteralBoolean PolymorphismTest_S_o2_method_ObjectFlow12::LiteralBoolean14
		addToElementRepository("LiteralBoolean14", PolymorphismTest_S_o2_method_ObjectFlow12_LiteralBoolean14);
		PolymorphismTest_S_o2_method_ObjectFlow12_LiteralBoolean14.setName("LiteralBoolean14");
		PolymorphismTest_S_o2_method_ObjectFlow12_LiteralBoolean14.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_ObjectFlow12_LiteralBoolean14.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger PolymorphismTest_S_o5_method_Message_result::LiteralInteger10
		addToElementRepository("LiteralInteger10", PolymorphismTest_S_o5_method_Message_result_LiteralInteger10);
		PolymorphismTest_S_o5_method_Message_result_LiteralInteger10.setName("LiteralInteger10");
		PolymorphismTest_S_o5_method_Message_result_LiteralInteger10.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Message_result_LiteralInteger10.setValue(1);
		// LiteralInteger PolymorphismTest_T_o1_method_Message_result::LiteralInteger209
		addToElementRepository("LiteralInteger209", PolymorphismTest_T_o1_method_Message_result_LiteralInteger209);
		PolymorphismTest_T_o1_method_Message_result_LiteralInteger209.setName("LiteralInteger209");
		PolymorphismTest_T_o1_method_Message_result_LiteralInteger209.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Message_result_LiteralInteger209.setValue(1);
		// LiteralInteger PolymorphismTest_main_Create S_result::LiteralInteger110
		addToElementRepository("LiteralInteger110", PolymorphismTest_main_Create_S_result_LiteralInteger110);
		PolymorphismTest_main_Create_S_result_LiteralInteger110.setName("LiteralInteger110");
		PolymorphismTest_main_Create_S_result_LiteralInteger110.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_Create_S_result_LiteralInteger110.setValue(1);
		// LiteralInteger PolymorphismTest_U_o1_method_Call WriteLine_errorStatus::LiteralInteger152
		addToElementRepository("LiteralInteger152", PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralInteger152);
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralInteger152.setName("LiteralInteger152");
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralInteger152.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralInteger152.setValue(0);
		// LiteralInteger PolymorphismTest_S_o1_method_a_node::LiteralInteger26
		addToElementRepository("LiteralInteger26", PolymorphismTest_S_o1_method_a_node_LiteralInteger26);
		PolymorphismTest_S_o1_method_a_node_LiteralInteger26.setName("LiteralInteger26");
		PolymorphismTest_S_o1_method_a_node_LiteralInteger26.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_a_node_LiteralInteger26.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_ObjectFlow64::LiteralInteger65
		addToElementRepository("LiteralInteger65", PolymorphismTest_main_runTests_ObjectFlow64_LiteralInteger65);
		PolymorphismTest_main_runTests_ObjectFlow64_LiteralInteger65.setName("LiteralInteger65");
		PolymorphismTest_main_runTests_ObjectFlow64_LiteralInteger65.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow64_LiteralInteger65.setValue(1);
		// LiteralInteger PolymorphismTest_A_x_method_ObjectFlow121::LiteralInteger122
		addToElementRepository("LiteralInteger122", PolymorphismTest_A_x_method_ObjectFlow121_LiteralInteger122);
		PolymorphismTest_A_x_method_ObjectFlow121_LiteralInteger122.setName("LiteralInteger122");
		PolymorphismTest_A_x_method_ObjectFlow121_LiteralInteger122.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_ObjectFlow121_LiteralInteger122.setValue(1);
		// LiteralInteger PolymorphismTest_T_o4_method_Call WriteLine_value::LiteralInteger242
		addToElementRepository("LiteralInteger242", PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralInteger242);
		PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralInteger242.setName("LiteralInteger242");
		PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralInteger242.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralInteger242.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o3()_i::LiteralInteger107
		addToElementRepository("LiteralInteger107", PolymorphismTest_main_runTests_Call_o3__i_LiteralInteger107);
		PolymorphismTest_main_runTests_Call_o3__i_LiteralInteger107.setName("LiteralInteger107");
		PolymorphismTest_main_runTests_Call_o3__i_LiteralInteger107.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o3__i_LiteralInteger107.setValue(1);
		// LiteralInteger PolymorphismTest_U_x_method_ObjectFlow164::LiteralInteger165
		addToElementRepository("LiteralInteger165", PolymorphismTest_U_x_method_ObjectFlow164_LiteralInteger165);
		PolymorphismTest_U_x_method_ObjectFlow164_LiteralInteger165.setName("LiteralInteger165");
		PolymorphismTest_U_x_method_ObjectFlow164_LiteralInteger165.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_ObjectFlow164_LiteralInteger165.setValue(1);
		// LiteralInteger PolymorphismTest_A_x_method_Call WriteLine_errorStatus::LiteralInteger115
		addToElementRepository("LiteralInteger115", PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralInteger115);
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralInteger115.setName("LiteralInteger115");
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralInteger115.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralInteger115.setValue(0);
		// LiteralInteger PolymorphismTest_main_runTests_Call U::o1()_a::LiteralInteger101
		addToElementRepository("LiteralInteger101", PolymorphismTest_main_runTests_Call_U_o1__a_LiteralInteger101);
		PolymorphismTest_main_runTests_Call_U_o1__a_LiteralInteger101.setName("LiteralInteger101");
		PolymorphismTest_main_runTests_Call_U_o1__a_LiteralInteger101.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_U_o1__a_LiteralInteger101.setValue(1);
		// LiteralInteger PolymorphismTest_S_o1_method_Call WriteLine_errorStatus::LiteralInteger30
		addToElementRepository("LiteralInteger30", PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralInteger30);
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralInteger30.setName("LiteralInteger30");
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralInteger30.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralInteger30.setValue(1);
		// LiteralInteger PolymorphismTest_T_o1_method_Call WriteLine_value::LiteralInteger213
		addToElementRepository("LiteralInteger213", PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralInteger213);
		PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralInteger213.setName("LiteralInteger213");
		PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralInteger213.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralInteger213.setValue(1);
		// LiteralInteger PolymorphismTest_U_o4_method_Call WriteLine_value::LiteralInteger137
		addToElementRepository("LiteralInteger137", PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralInteger137);
		PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralInteger137.setName("LiteralInteger137");
		PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralInteger137.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralInteger137.setValue(1);
		// LiteralInteger PolymorphismTest_T_o4_method_Call WriteLine_value::LiteralInteger244
		addToElementRepository("LiteralInteger244", PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralInteger244);
		PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralInteger244.setName("LiteralInteger244");
		PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralInteger244.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralInteger244.setValue(1);
		// LiteralInteger PolymorphismTest_S_o3_method_Message_result::LiteralInteger42
		addToElementRepository("LiteralInteger42", PolymorphismTest_S_o3_method_Message_result_LiteralInteger42);
		PolymorphismTest_S_o3_method_Message_result_LiteralInteger42.setName("LiteralInteger42");
		PolymorphismTest_S_o3_method_Message_result_LiteralInteger42.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Message_result_LiteralInteger42.setValue(1);
		// LiteralInteger PolymorphismTest_S_o1_method_Call WriteLine_value::LiteralInteger29
		addToElementRepository("LiteralInteger29", PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralInteger29);
		PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralInteger29.setName("LiteralInteger29");
		PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralInteger29.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralInteger29.setValue(1);
		// LiteralInteger PolymorphismTest_S_o1_method_ObjectFlow33::LiteralInteger35
		addToElementRepository("LiteralInteger35", PolymorphismTest_S_o1_method_ObjectFlow33_LiteralInteger35);
		PolymorphismTest_S_o1_method_ObjectFlow33_LiteralInteger35.setName("LiteralInteger35");
		PolymorphismTest_S_o1_method_ObjectFlow33_LiteralInteger35.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_ObjectFlow33_LiteralInteger35.setValue(1);
		// LiteralInteger PolymorphismTest_T_o1_method_ObjectFlow219::LiteralInteger221
		addToElementRepository("LiteralInteger221", PolymorphismTest_T_o1_method_ObjectFlow219_LiteralInteger221);
		PolymorphismTest_T_o1_method_ObjectFlow219_LiteralInteger221.setName("LiteralInteger221");
		PolymorphismTest_T_o1_method_ObjectFlow219_LiteralInteger221.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_ObjectFlow219_LiteralInteger221.setValue(1);
		// LiteralInteger PolymorphismTest_U_o3_method_Call WriteLine_errorStatus::LiteralInteger190
		addToElementRepository("LiteralInteger190", PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralInteger190);
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralInteger190.setName("LiteralInteger190");
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralInteger190.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralInteger190.setValue(0);
		// LiteralInteger PolymorphismTest_S_o3_method_Call WriteLine_value::LiteralInteger50
		addToElementRepository("LiteralInteger50", PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralInteger50);
		PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralInteger50.setName("LiteralInteger50");
		PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralInteger50.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralInteger50.setValue(1);
		// LiteralInteger PolymorphismTest_S_o5_method_ObjectFlow6::LiteralInteger8
		addToElementRepository("LiteralInteger8", PolymorphismTest_S_o5_method_ObjectFlow6_LiteralInteger8);
		PolymorphismTest_S_o5_method_ObjectFlow6_LiteralInteger8.setName("LiteralInteger8");
		PolymorphismTest_S_o5_method_ObjectFlow6_LiteralInteger8.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_ObjectFlow6_LiteralInteger8.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o2()_b::LiteralInteger99
		addToElementRepository("LiteralInteger99", PolymorphismTest_main_runTests_Call_o2__b_LiteralInteger99);
		PolymorphismTest_main_runTests_Call_o2__b_LiteralInteger99.setName("LiteralInteger99");
		PolymorphismTest_main_runTests_Call_o2__b_LiteralInteger99.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o2__b_LiteralInteger99.setValue(1);
		// LiteralInteger PolymorphismTest_T_o3_method_Call WriteLine_value::LiteralInteger223
		addToElementRepository("LiteralInteger223", PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralInteger223);
		PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralInteger223.setName("LiteralInteger223");
		PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralInteger223.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralInteger223.setValue(1);
		// LiteralInteger PolymorphismTest_T_o1_method_Call WriteLine_errorStatus::LiteralInteger215
		addToElementRepository("LiteralInteger215", PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralInteger215);
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralInteger215.setName("LiteralInteger215");
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralInteger215.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralInteger215.setValue(1);
		// LiteralInteger PolymorphismTest_T_o4_method_Message_result::LiteralInteger245
		addToElementRepository("LiteralInteger245", PolymorphismTest_T_o4_method_Message_result_LiteralInteger245);
		PolymorphismTest_T_o4_method_Message_result_LiteralInteger245.setName("LiteralInteger245");
		PolymorphismTest_T_o4_method_Message_result_LiteralInteger245.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Message_result_LiteralInteger245.setValue(1);
		// LiteralInteger PolymorphismTest_U_x_method_Call WriteLine_value::LiteralInteger155
		addToElementRepository("LiteralInteger155", PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralInteger155);
		PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralInteger155.setName("LiteralInteger155");
		PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralInteger155.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralInteger155.setValue(1);
		// LiteralInteger PolymorphismTest_T_o2_method_Call WriteLine_value::LiteralInteger205
		addToElementRepository("LiteralInteger205", PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralInteger205);
		PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralInteger205.setName("LiteralInteger205");
		PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralInteger205.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralInteger205.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call A::x()_target::LiteralInteger63
		addToElementRepository("LiteralInteger63", PolymorphismTest_main_runTests_Call_A_x__target_LiteralInteger63);
		PolymorphismTest_main_runTests_Call_A_x__target_LiteralInteger63.setName("LiteralInteger63");
		PolymorphismTest_main_runTests_Call_A_x__target_LiteralInteger63.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_A_x__target_LiteralInteger63.setValue(1);
		// LiteralInteger PolymorphismTest_S_o2_method_a_node::LiteralInteger21
		addToElementRepository("LiteralInteger21", PolymorphismTest_S_o2_method_a_node_LiteralInteger21);
		PolymorphismTest_S_o2_method_a_node_LiteralInteger21.setName("LiteralInteger21");
		PolymorphismTest_S_o2_method_a_node_LiteralInteger21.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_a_node_LiteralInteger21.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o1()_a::LiteralInteger85
		addToElementRepository("LiteralInteger85", PolymorphismTest_main_runTests_Call_o1__a_LiteralInteger85);
		PolymorphismTest_main_runTests_Call_o1__a_LiteralInteger85.setName("LiteralInteger85");
		PolymorphismTest_main_runTests_Call_o1__a_LiteralInteger85.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o1__a_LiteralInteger85.setValue(1);
		// LiteralInteger PolymorphismTest_U_x_method_Call WriteLine_errorStatus::LiteralInteger158
		addToElementRepository("LiteralInteger158", PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralInteger158);
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralInteger158.setName("LiteralInteger158");
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralInteger158.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralInteger158.setValue(0);
		// LiteralInteger PolymorphismTest_S_o1_method_Message_result::LiteralInteger37
		addToElementRepository("LiteralInteger37", PolymorphismTest_S_o1_method_Message_result_LiteralInteger37);
		PolymorphismTest_S_o1_method_Message_result_LiteralInteger37.setName("LiteralInteger37");
		PolymorphismTest_S_o1_method_Message_result_LiteralInteger37.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Message_result_LiteralInteger37.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o2()_target::LiteralInteger94
		addToElementRepository("LiteralInteger94", PolymorphismTest_main_runTests_Call_o2__target_LiteralInteger94);
		PolymorphismTest_main_runTests_Call_o2__target_LiteralInteger94.setName("LiteralInteger94");
		PolymorphismTest_main_runTests_Call_o2__target_LiteralInteger94.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o2__target_LiteralInteger94.setValue(1);
		// LiteralInteger PolymorphismTest_T_o1_method_Call WriteLine_errorStatus::LiteralInteger217
		addToElementRepository("LiteralInteger217", PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralInteger217);
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralInteger217.setName("LiteralInteger217");
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralInteger217.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralInteger217.setValue(0);
		// LiteralInteger PolymorphismTest_T_o3_method_i_node::LiteralInteger232
		addToElementRepository("LiteralInteger232", PolymorphismTest_T_o3_method_i_node_LiteralInteger232);
		PolymorphismTest_T_o3_method_i_node_LiteralInteger232.setName("LiteralInteger232");
		PolymorphismTest_T_o3_method_i_node_LiteralInteger232.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_i_node_LiteralInteger232.setValue(1);
		// LiteralInteger PolymorphismTest_U_x_method_Call WriteLine_value::LiteralInteger157
		addToElementRepository("LiteralInteger157", PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralInteger157);
		PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralInteger157.setName("LiteralInteger157");
		PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralInteger157.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralInteger157.setValue(1);
		// LiteralInteger PolymorphismTest_T_o2_method_ObjectFlow194::LiteralInteger196
		addToElementRepository("LiteralInteger196", PolymorphismTest_T_o2_method_ObjectFlow194_LiteralInteger196);
		PolymorphismTest_T_o2_method_ObjectFlow194_LiteralInteger196.setName("LiteralInteger196");
		PolymorphismTest_T_o2_method_ObjectFlow194_LiteralInteger196.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_ObjectFlow194_LiteralInteger196.setValue(1);
		// LiteralInteger PolymorphismTest_T_o4_method_ObjectFlow236::LiteralInteger238
		addToElementRepository("LiteralInteger238", PolymorphismTest_T_o4_method_ObjectFlow236_LiteralInteger238);
		PolymorphismTest_T_o4_method_ObjectFlow236_LiteralInteger238.setName("LiteralInteger238");
		PolymorphismTest_T_o4_method_ObjectFlow236_LiteralInteger238.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_ObjectFlow236_LiteralInteger238.setValue(1);
		// LiteralInteger PolymorphismTest_U_o3_method_Call WriteLine_value::LiteralInteger193
		addToElementRepository("LiteralInteger193", PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralInteger193);
		PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralInteger193.setName("LiteralInteger193");
		PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralInteger193.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralInteger193.setValue(1);
		// LiteralInteger PolymorphismTest_U_o2_method_Call WriteLine_errorStatus::LiteralInteger174
		addToElementRepository("LiteralInteger174", PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralInteger174);
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralInteger174.setName("LiteralInteger174");
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralInteger174.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralInteger174.setValue(0);
		// LiteralInteger PolymorphismTest_main_runTests_Call o3()_i::LiteralInteger106
		addToElementRepository("LiteralInteger106", PolymorphismTest_main_runTests_Call_o3__i_LiteralInteger106);
		PolymorphismTest_main_runTests_Call_o3__i_LiteralInteger106.setName("LiteralInteger106");
		PolymorphismTest_main_runTests_Call_o3__i_LiteralInteger106.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o3__i_LiteralInteger106.setValue(0);
		// LiteralInteger PolymorphismTest_T_o2_method_b_node::LiteralInteger197
		addToElementRepository("LiteralInteger197", PolymorphismTest_T_o2_method_b_node_LiteralInteger197);
		PolymorphismTest_T_o2_method_b_node_LiteralInteger197.setName("LiteralInteger197");
		PolymorphismTest_T_o2_method_b_node_LiteralInteger197.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_b_node_LiteralInteger197.setValue(1);
		// LiteralInteger PolymorphismTest_U_o1_method_Call WriteLine_value::LiteralInteger150
		addToElementRepository("LiteralInteger150", PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralInteger150);
		PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralInteger150.setName("LiteralInteger150");
		PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralInteger150.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralInteger150.setValue(1);
		// LiteralInteger PolymorphismTest_U_o2_method_Message_result::LiteralInteger178
		addToElementRepository("LiteralInteger178", PolymorphismTest_U_o2_method_Message_result_LiteralInteger178);
		PolymorphismTest_U_o2_method_Message_result_LiteralInteger178.setName("LiteralInteger178");
		PolymorphismTest_U_o2_method_Message_result_LiteralInteger178.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Message_result_LiteralInteger178.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_ObjectFlow59::LiteralInteger60
		addToElementRepository("LiteralInteger60", PolymorphismTest_main_runTests_ObjectFlow59_LiteralInteger60);
		PolymorphismTest_main_runTests_ObjectFlow59_LiteralInteger60.setName("LiteralInteger60");
		PolymorphismTest_main_runTests_ObjectFlow59_LiteralInteger60.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow59_LiteralInteger60.setValue(1);
		// LiteralInteger PolymorphismTest_A_x_method_Call WriteLine_errorStatus::LiteralInteger117
		addToElementRepository("LiteralInteger117", PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralInteger117);
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralInteger117.setName("LiteralInteger117");
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralInteger117.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralInteger117.setValue(1);
		// LiteralInteger PolymorphismTest_main_Call runTests_u::LiteralInteger54
		addToElementRepository("LiteralInteger54", PolymorphismTest_main_Call_runTests_u_LiteralInteger54);
		PolymorphismTest_main_Call_runTests_u_LiteralInteger54.setName("LiteralInteger54");
		PolymorphismTest_main_Call_runTests_u_LiteralInteger54.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_Call_runTests_u_LiteralInteger54.setValue(1);
		// LiteralInteger PolymorphismTest_S_o2_method_ObjectFlow12::LiteralInteger13
		addToElementRepository("LiteralInteger13", PolymorphismTest_S_o2_method_ObjectFlow12_LiteralInteger13);
		PolymorphismTest_S_o2_method_ObjectFlow12_LiteralInteger13.setName("LiteralInteger13");
		PolymorphismTest_S_o2_method_ObjectFlow12_LiteralInteger13.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_ObjectFlow12_LiteralInteger13.setValue(1);
		// LiteralInteger PolymorphismTest_U_o3_method_Call WriteLine_errorStatus::LiteralInteger189
		addToElementRepository("LiteralInteger189", PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralInteger189);
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralInteger189.setName("LiteralInteger189");
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralInteger189.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralInteger189.setValue(1);
		// LiteralInteger PolymorphismTest_U_o3_method_Call WriteLine_value::LiteralInteger192
		addToElementRepository("LiteralInteger192", PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralInteger192);
		PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralInteger192.setName("LiteralInteger192");
		PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralInteger192.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralInteger192.setValue(1);
		// LiteralInteger PolymorphismTest_S_o1_method_b_node::LiteralInteger39
		addToElementRepository("LiteralInteger39", PolymorphismTest_S_o1_method_b_node_LiteralInteger39);
		PolymorphismTest_S_o1_method_b_node_LiteralInteger39.setName("LiteralInteger39");
		PolymorphismTest_S_o1_method_b_node_LiteralInteger39.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_b_node_LiteralInteger39.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o1()_a::LiteralInteger86
		addToElementRepository("LiteralInteger86", PolymorphismTest_main_runTests_Call_o1__a_LiteralInteger86);
		PolymorphismTest_main_runTests_Call_o1__a_LiteralInteger86.setName("LiteralInteger86");
		PolymorphismTest_main_runTests_Call_o1__a_LiteralInteger86.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o1__a_LiteralInteger86.setValue(1);
		// LiteralInteger PolymorphismTest_U_o4_method_Call WriteLine_errorStatus::LiteralInteger138
		addToElementRepository("LiteralInteger138", PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralInteger138);
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralInteger138.setName("LiteralInteger138");
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralInteger138.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralInteger138.setValue(0);
		// LiteralInteger PolymorphismTest_U_o2_method_Call WriteLine_value::LiteralInteger171
		addToElementRepository("LiteralInteger171", PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralInteger171);
		PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralInteger171.setName("LiteralInteger171");
		PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralInteger171.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralInteger171.setValue(1);
		// LiteralInteger PolymorphismTest_U_o2_method_b_node::LiteralInteger170
		addToElementRepository("LiteralInteger170", PolymorphismTest_U_o2_method_b_node_LiteralInteger170);
		PolymorphismTest_U_o2_method_b_node_LiteralInteger170.setName("LiteralInteger170");
		PolymorphismTest_U_o2_method_b_node_LiteralInteger170.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_b_node_LiteralInteger170.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o3()_target::LiteralInteger109
		addToElementRepository("LiteralInteger109", PolymorphismTest_main_runTests_Call_o3__target_LiteralInteger109);
		PolymorphismTest_main_runTests_Call_o3__target_LiteralInteger109.setName("LiteralInteger109");
		PolymorphismTest_main_runTests_Call_o3__target_LiteralInteger109.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o3__target_LiteralInteger109.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o2()_a::LiteralInteger98
		addToElementRepository("LiteralInteger98", PolymorphismTest_main_runTests_Call_o2__a_LiteralInteger98);
		PolymorphismTest_main_runTests_Call_o2__a_LiteralInteger98.setName("LiteralInteger98");
		PolymorphismTest_main_runTests_Call_o2__a_LiteralInteger98.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o2__a_LiteralInteger98.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_ObjectFlow67::LiteralInteger69
		addToElementRepository("LiteralInteger69", PolymorphismTest_main_runTests_ObjectFlow67_LiteralInteger69);
		PolymorphismTest_main_runTests_ObjectFlow67_LiteralInteger69.setName("LiteralInteger69");
		PolymorphismTest_main_runTests_ObjectFlow67_LiteralInteger69.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow67_LiteralInteger69.setValue(1);
		// LiteralInteger PolymorphismTest_T_o1_method_b_node::LiteralInteger218
		addToElementRepository("LiteralInteger218", PolymorphismTest_T_o1_method_b_node_LiteralInteger218);
		PolymorphismTest_T_o1_method_b_node_LiteralInteger218.setName("LiteralInteger218");
		PolymorphismTest_T_o1_method_b_node_LiteralInteger218.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_b_node_LiteralInteger218.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_ObjectFlow88::LiteralInteger89
		addToElementRepository("LiteralInteger89", PolymorphismTest_main_runTests_ObjectFlow88_LiteralInteger89);
		PolymorphismTest_main_runTests_ObjectFlow88_LiteralInteger89.setName("LiteralInteger89");
		PolymorphismTest_main_runTests_ObjectFlow88_LiteralInteger89.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow88_LiteralInteger89.setValue(1);
		// LiteralInteger PolymorphismTest_U_o2_method_a_node::LiteralInteger180
		addToElementRepository("LiteralInteger180", PolymorphismTest_U_o2_method_a_node_LiteralInteger180);
		PolymorphismTest_U_o2_method_a_node_LiteralInteger180.setName("LiteralInteger180");
		PolymorphismTest_U_o2_method_a_node_LiteralInteger180.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_a_node_LiteralInteger180.setValue(1);
		// LiteralInteger PolymorphismTest_U_o2_method_Call WriteLine_value::LiteralInteger172
		addToElementRepository("LiteralInteger172", PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralInteger172);
		PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralInteger172.setName("LiteralInteger172");
		PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralInteger172.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralInteger172.setValue(1);
		// LiteralInteger PolymorphismTest_S_o2_method_Call WriteLine_value::LiteralInteger20
		addToElementRepository("LiteralInteger20", PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralInteger20);
		PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralInteger20.setName("LiteralInteger20");
		PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralInteger20.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralInteger20.setValue(1);
		// LiteralInteger PolymorphismTest_A_x_method_Call WriteLine_value::LiteralInteger120
		addToElementRepository("LiteralInteger120", PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralInteger120);
		PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralInteger120.setName("LiteralInteger120");
		PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralInteger120.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralInteger120.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o4()_target::LiteralInteger56
		addToElementRepository("LiteralInteger56", PolymorphismTest_main_runTests_Call_o4__target_LiteralInteger56);
		PolymorphismTest_main_runTests_Call_o4__target_LiteralInteger56.setName("LiteralInteger56");
		PolymorphismTest_main_runTests_Call_o4__target_LiteralInteger56.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o4__target_LiteralInteger56.setValue(1);
		// LiteralInteger PolymorphismTest_T_o3_method_Call WriteLine_value::LiteralInteger224
		addToElementRepository("LiteralInteger224", PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralInteger224);
		PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralInteger224.setName("LiteralInteger224");
		PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralInteger224.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralInteger224.setValue(1);
		// LiteralInteger PolymorphismTest_T_o3_method_Call WriteLine_errorStatus::LiteralInteger227
		addToElementRepository("LiteralInteger227", PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralInteger227);
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralInteger227.setName("LiteralInteger227");
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralInteger227.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralInteger227.setValue(1);
		// LiteralInteger PolymorphismTest_U_o2_method_Call WriteLine_errorStatus::LiteralInteger175
		addToElementRepository("LiteralInteger175", PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralInteger175);
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralInteger175.setName("LiteralInteger175");
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralInteger175.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralInteger175.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o1()_b::LiteralInteger83
		addToElementRepository("LiteralInteger83", PolymorphismTest_main_runTests_Call_o1__b_LiteralInteger83);
		PolymorphismTest_main_runTests_Call_o1__b_LiteralInteger83.setName("LiteralInteger83");
		PolymorphismTest_main_runTests_Call_o1__b_LiteralInteger83.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o1__b_LiteralInteger83.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call U::o1()_b::LiteralInteger104
		addToElementRepository("LiteralInteger104", PolymorphismTest_main_runTests_Call_U_o1__b_LiteralInteger104);
		PolymorphismTest_main_runTests_Call_U_o1__b_LiteralInteger104.setName("LiteralInteger104");
		PolymorphismTest_main_runTests_Call_U_o1__b_LiteralInteger104.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_U_o1__b_LiteralInteger104.setValue(1);
		// LiteralInteger PolymorphismTest_U_o4_method_ObjectFlow129::LiteralInteger130
		addToElementRepository("LiteralInteger130", PolymorphismTest_U_o4_method_ObjectFlow129_LiteralInteger130);
		PolymorphismTest_U_o4_method_ObjectFlow129_LiteralInteger130.setName("LiteralInteger130");
		PolymorphismTest_U_o4_method_ObjectFlow129_LiteralInteger130.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_ObjectFlow129_LiteralInteger130.setValue(1);
		// LiteralInteger PolymorphismTest_S_o2_method_b_node::LiteralInteger22
		addToElementRepository("LiteralInteger22", PolymorphismTest_S_o2_method_b_node_LiteralInteger22);
		PolymorphismTest_S_o2_method_b_node_LiteralInteger22.setName("LiteralInteger22");
		PolymorphismTest_S_o2_method_b_node_LiteralInteger22.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_b_node_LiteralInteger22.setValue(1);
		// LiteralInteger PolymorphismTest_T_o2_method_Call WriteLine_errorStatus::LiteralInteger201
		addToElementRepository("LiteralInteger201", PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralInteger201);
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralInteger201.setName("LiteralInteger201");
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralInteger201.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralInteger201.setValue(1);
		// LiteralInteger PolymorphismTest_U_o1_method_Call WriteLine_errorStatus::LiteralInteger153
		addToElementRepository("LiteralInteger153", PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralInteger153);
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralInteger153.setName("LiteralInteger153");
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralInteger153.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralInteger153.setValue(1);
		// LiteralInteger PolymorphismTest_S_o3_method_Call WriteLine_value::LiteralInteger51
		addToElementRepository("LiteralInteger51", PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralInteger51);
		PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralInteger51.setName("LiteralInteger51");
		PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralInteger51.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralInteger51.setValue(1);
		// LiteralInteger PolymorphismTest_S_o3_method_Call WriteLine_errorStatus::LiteralInteger48
		addToElementRepository("LiteralInteger48", PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralInteger48);
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralInteger48.setName("LiteralInteger48");
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralInteger48.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralInteger48.setValue(0);
		// LiteralInteger PolymorphismTest_S_o1_method_Call WriteLine_value::LiteralInteger27
		addToElementRepository("LiteralInteger27", PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralInteger27);
		PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralInteger27.setName("LiteralInteger27");
		PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralInteger27.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralInteger27.setValue(1);
		// LiteralInteger PolymorphismTest_U_o2_method_ObjectFlow167::LiteralInteger168
		addToElementRepository("LiteralInteger168", PolymorphismTest_U_o2_method_ObjectFlow167_LiteralInteger168);
		PolymorphismTest_U_o2_method_ObjectFlow167_LiteralInteger168.setName("LiteralInteger168");
		PolymorphismTest_U_o2_method_ObjectFlow167_LiteralInteger168.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_ObjectFlow167_LiteralInteger168.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o2()_a::LiteralInteger96
		addToElementRepository("LiteralInteger96", PolymorphismTest_main_runTests_Call_o2__a_LiteralInteger96);
		PolymorphismTest_main_runTests_Call_o2__a_LiteralInteger96.setName("LiteralInteger96");
		PolymorphismTest_main_runTests_Call_o2__a_LiteralInteger96.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o2__a_LiteralInteger96.setValue(1);
		// LiteralInteger PolymorphismTest_S_o3_method_ObjectFlow44::LiteralInteger46
		addToElementRepository("LiteralInteger46", PolymorphismTest_S_o3_method_ObjectFlow44_LiteralInteger46);
		PolymorphismTest_S_o3_method_ObjectFlow44_LiteralInteger46.setName("LiteralInteger46");
		PolymorphismTest_S_o3_method_ObjectFlow44_LiteralInteger46.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_ObjectFlow44_LiteralInteger46.setValue(1);
		// LiteralInteger PolymorphismTest_S_o5_method_Call WriteLine_value::LiteralInteger2
		addToElementRepository("LiteralInteger2", PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralInteger2);
		PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralInteger2.setName("LiteralInteger2");
		PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralInteger2.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralInteger2.setValue(1);
		// LiteralInteger PolymorphismTest_S_o2_method_Message_result::LiteralInteger25
		addToElementRepository("LiteralInteger25", PolymorphismTest_S_o2_method_Message_result_LiteralInteger25);
		PolymorphismTest_S_o2_method_Message_result_LiteralInteger25.setName("LiteralInteger25");
		PolymorphismTest_S_o2_method_Message_result_LiteralInteger25.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Message_result_LiteralInteger25.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call U::o1()_b::LiteralInteger105
		addToElementRepository("LiteralInteger105", PolymorphismTest_main_runTests_Call_U_o1__b_LiteralInteger105);
		PolymorphismTest_main_runTests_Call_U_o1__b_LiteralInteger105.setName("LiteralInteger105");
		PolymorphismTest_main_runTests_Call_U_o1__b_LiteralInteger105.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_U_o1__b_LiteralInteger105.setValue(0);
		// LiteralInteger PolymorphismTest_T_o2_method_Call WriteLine_value::LiteralInteger204
		addToElementRepository("LiteralInteger204", PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralInteger204);
		PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralInteger204.setName("LiteralInteger204");
		PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralInteger204.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralInteger204.setValue(1);
		// LiteralInteger PolymorphismTest_main_ObjectFlow112::LiteralInteger113
		addToElementRepository("LiteralInteger113", PolymorphismTest_main_ObjectFlow112_LiteralInteger113);
		PolymorphismTest_main_ObjectFlow112_LiteralInteger113.setName("LiteralInteger113");
		PolymorphismTest_main_ObjectFlow112_LiteralInteger113.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_ObjectFlow112_LiteralInteger113.setValue(1);
		// LiteralInteger PolymorphismTest_S_o3_method_Call WriteLine_errorStatus::LiteralInteger47
		addToElementRepository("LiteralInteger47", PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralInteger47);
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralInteger47.setName("LiteralInteger47");
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralInteger47.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralInteger47.setValue(1);
		// LiteralInteger PolymorphismTest_T_o4_method_Call WriteLine_errorStatus::LiteralInteger240
		addToElementRepository("LiteralInteger240", PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralInteger240);
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralInteger240.setName("LiteralInteger240");
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralInteger240.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralInteger240.setValue(0);
		// LiteralInteger PolymorphismTest_A_x_method_Message_result::LiteralInteger125
		addToElementRepository("LiteralInteger125", PolymorphismTest_A_x_method_Message_result_LiteralInteger125);
		PolymorphismTest_A_x_method_Message_result_LiteralInteger125.setName("LiteralInteger125");
		PolymorphismTest_A_x_method_Message_result_LiteralInteger125.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Message_result_LiteralInteger125.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o2()_b::LiteralInteger100
		addToElementRepository("LiteralInteger100", PolymorphismTest_main_runTests_Call_o2__b_LiteralInteger100);
		PolymorphismTest_main_runTests_Call_o2__b_LiteralInteger100.setName("LiteralInteger100");
		PolymorphismTest_main_runTests_Call_o2__b_LiteralInteger100.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o2__b_LiteralInteger100.setValue(0);
		// LiteralInteger PolymorphismTest_U_o3_method_ObjectFlow185::LiteralInteger187
		addToElementRepository("LiteralInteger187", PolymorphismTest_U_o3_method_ObjectFlow185_LiteralInteger187);
		PolymorphismTest_U_o3_method_ObjectFlow185_LiteralInteger187.setName("LiteralInteger187");
		PolymorphismTest_U_o3_method_ObjectFlow185_LiteralInteger187.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_ObjectFlow185_LiteralInteger187.setValue(1);
		// LiteralInteger PolymorphismTest_T_o1_method_a_node::LiteralInteger222
		addToElementRepository("LiteralInteger222", PolymorphismTest_T_o1_method_a_node_LiteralInteger222);
		PolymorphismTest_T_o1_method_a_node_LiteralInteger222.setName("LiteralInteger222");
		PolymorphismTest_T_o1_method_a_node_LiteralInteger222.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_a_node_LiteralInteger222.setValue(1);
		// LiteralInteger PolymorphismTest_T_o2_method_result_node::LiteralInteger207
		addToElementRepository("LiteralInteger207", PolymorphismTest_T_o2_method_result_node_LiteralInteger207);
		PolymorphismTest_T_o2_method_result_node_LiteralInteger207.setName("LiteralInteger207");
		PolymorphismTest_T_o2_method_result_node_LiteralInteger207.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_result_node_LiteralInteger207.setValue(1);
		// LiteralInteger PolymorphismTest_U_o4_method_Call WriteLine_value::LiteralInteger135
		addToElementRepository("LiteralInteger135", PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralInteger135);
		PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralInteger135.setName("LiteralInteger135");
		PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralInteger135.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralInteger135.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_ObjectFlow91::LiteralInteger93
		addToElementRepository("LiteralInteger93", PolymorphismTest_main_runTests_ObjectFlow91_LiteralInteger93);
		PolymorphismTest_main_runTests_ObjectFlow91_LiteralInteger93.setName("LiteralInteger93");
		PolymorphismTest_main_runTests_ObjectFlow91_LiteralInteger93.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow91_LiteralInteger93.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o1()_b::LiteralInteger84
		addToElementRepository("LiteralInteger84", PolymorphismTest_main_runTests_Call_o1__b_LiteralInteger84);
		PolymorphismTest_main_runTests_Call_o1__b_LiteralInteger84.setName("LiteralInteger84");
		PolymorphismTest_main_runTests_Call_o1__b_LiteralInteger84.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o1__b_LiteralInteger84.setValue(0);
		// LiteralInteger PolymorphismTest_S_o5_method_Call WriteLine_errorStatus::LiteralInteger5
		addToElementRepository("LiteralInteger5", PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralInteger5);
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralInteger5.setName("LiteralInteger5");
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralInteger5.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralInteger5.setValue(1);
		// LiteralInteger PolymorphismTest_U_x_method_Call WriteLine_errorStatus::LiteralInteger160
		addToElementRepository("LiteralInteger160", PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralInteger160);
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralInteger160.setName("LiteralInteger160");
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralInteger160.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralInteger160.setValue(1);
		// LiteralInteger PolymorphismTest_U_o4_method_Message_result::LiteralInteger133
		addToElementRepository("LiteralInteger133", PolymorphismTest_U_o4_method_Message_result_LiteralInteger133);
		PolymorphismTest_U_o4_method_Message_result_LiteralInteger133.setName("LiteralInteger133");
		PolymorphismTest_U_o4_method_Message_result_LiteralInteger133.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Message_result_LiteralInteger133.setValue(1);
		// LiteralInteger PolymorphismTest_S_o2_method_Call WriteLine_value::LiteralInteger18
		addToElementRepository("LiteralInteger18", PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralInteger18);
		PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralInteger18.setName("LiteralInteger18");
		PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralInteger18.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralInteger18.setValue(1);
		// LiteralInteger PolymorphismTest_S_o2_method_Call WriteLine_errorStatus::LiteralInteger16
		addToElementRepository("LiteralInteger16", PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralInteger16);
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralInteger16.setName("LiteralInteger16");
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralInteger16.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralInteger16.setValue(1);
		// LiteralInteger PolymorphismTest_A_x_method_Call WriteLine_value::LiteralInteger119
		addToElementRepository("LiteralInteger119", PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralInteger119);
		PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralInteger119.setName("LiteralInteger119");
		PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralInteger119.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralInteger119.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_u_node::LiteralInteger72
		addToElementRepository("LiteralInteger72", PolymorphismTest_main_runTests_u_node_LiteralInteger72);
		PolymorphismTest_main_runTests_u_node_LiteralInteger72.setName("LiteralInteger72");
		PolymorphismTest_main_runTests_u_node_LiteralInteger72.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_u_node_LiteralInteger72.setValue(1);
		// LiteralInteger PolymorphismTest_U_o1_method_Message_result::LiteralInteger144
		addToElementRepository("LiteralInteger144", PolymorphismTest_U_o1_method_Message_result_LiteralInteger144);
		PolymorphismTest_U_o1_method_Message_result_LiteralInteger144.setName("LiteralInteger144");
		PolymorphismTest_U_o1_method_Message_result_LiteralInteger144.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Message_result_LiteralInteger144.setValue(1);
		// LiteralInteger PolymorphismTest_T_o3_method_Message_result::LiteralInteger231
		addToElementRepository("LiteralInteger231", PolymorphismTest_T_o3_method_Message_result_LiteralInteger231);
		PolymorphismTest_T_o3_method_Message_result_LiteralInteger231.setName("LiteralInteger231");
		PolymorphismTest_T_o3_method_Message_result_LiteralInteger231.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Message_result_LiteralInteger231.setValue(1);
		// LiteralInteger PolymorphismTest_S_o1_method_Call WriteLine_errorStatus::LiteralInteger32
		addToElementRepository("LiteralInteger32", PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralInteger32);
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralInteger32.setName("LiteralInteger32");
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralInteger32.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralInteger32.setValue(0);
		// LiteralInteger PolymorphismTest_U_o1_method_ObjectFlow146::LiteralInteger148
		addToElementRepository("LiteralInteger148", PolymorphismTest_U_o1_method_ObjectFlow146_LiteralInteger148);
		PolymorphismTest_U_o1_method_ObjectFlow146_LiteralInteger148.setName("LiteralInteger148");
		PolymorphismTest_U_o1_method_ObjectFlow146_LiteralInteger148.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_ObjectFlow146_LiteralInteger148.setValue(1);
		// LiteralInteger PolymorphismTest_T_o3_method_Call WriteLine_errorStatus::LiteralInteger226
		addToElementRepository("LiteralInteger226", PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralInteger226);
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralInteger226.setName("LiteralInteger226");
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralInteger226.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralInteger226.setValue(0);
		// LiteralInteger PolymorphismTest_T_o3_method_ObjectFlow233::LiteralInteger234
		addToElementRepository("LiteralInteger234", PolymorphismTest_T_o3_method_ObjectFlow233_LiteralInteger234);
		PolymorphismTest_T_o3_method_ObjectFlow233_LiteralInteger234.setName("LiteralInteger234");
		PolymorphismTest_T_o3_method_ObjectFlow233_LiteralInteger234.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_ObjectFlow233_LiteralInteger234.setValue(1);
		// LiteralInteger PolymorphismTest_T_o1_method_Call WriteLine_value::LiteralInteger214
		addToElementRepository("LiteralInteger214", PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralInteger214);
		PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralInteger214.setName("LiteralInteger214");
		PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralInteger214.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralInteger214.setValue(1);
		// LiteralInteger PolymorphismTest_T_o2_method_Call WriteLine_errorStatus::LiteralInteger202
		addToElementRepository("LiteralInteger202", PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralInteger202);
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralInteger202.setName("LiteralInteger202");
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralInteger202.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralInteger202.setValue(0);
		// LiteralInteger PolymorphismTest_T_o2_method_Message_result::LiteralInteger199
		addToElementRepository("LiteralInteger199", PolymorphismTest_T_o2_method_Message_result_LiteralInteger199);
		PolymorphismTest_T_o2_method_Message_result_LiteralInteger199.setName("LiteralInteger199");
		PolymorphismTest_T_o2_method_Message_result_LiteralInteger199.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Message_result_LiteralInteger199.setValue(1);
		// LiteralInteger PolymorphismTest_U_x_method_Message_result::LiteralInteger162
		addToElementRepository("LiteralInteger162", PolymorphismTest_U_x_method_Message_result_LiteralInteger162);
		PolymorphismTest_U_x_method_Message_result_LiteralInteger162.setName("LiteralInteger162");
		PolymorphismTest_U_x_method_Message_result_LiteralInteger162.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Message_result_LiteralInteger162.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call o1()_target::LiteralInteger81
		addToElementRepository("LiteralInteger81", PolymorphismTest_main_runTests_Call_o1__target_LiteralInteger81);
		PolymorphismTest_main_runTests_Call_o1__target_LiteralInteger81.setName("LiteralInteger81");
		PolymorphismTest_main_runTests_Call_o1__target_LiteralInteger81.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o1__target_LiteralInteger81.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_ObjectFlow74::LiteralInteger76
		addToElementRepository("LiteralInteger76", PolymorphismTest_main_runTests_ObjectFlow74_LiteralInteger76);
		PolymorphismTest_main_runTests_ObjectFlow74_LiteralInteger76.setName("LiteralInteger76");
		PolymorphismTest_main_runTests_ObjectFlow74_LiteralInteger76.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow74_LiteralInteger76.setValue(1);
		// LiteralInteger PolymorphismTest_U_o1_method_a_node::LiteralInteger142
		addToElementRepository("LiteralInteger142", PolymorphismTest_U_o1_method_a_node_LiteralInteger142);
		PolymorphismTest_U_o1_method_a_node_LiteralInteger142.setName("LiteralInteger142");
		PolymorphismTest_U_o1_method_a_node_LiteralInteger142.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_a_node_LiteralInteger142.setValue(1);
		// LiteralInteger PolymorphismTest_S_o5_method_Call WriteLine_errorStatus::LiteralInteger4
		addToElementRepository("LiteralInteger4", PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralInteger4);
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralInteger4.setName("LiteralInteger4");
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralInteger4.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralInteger4.setValue(0);
		// LiteralInteger PolymorphismTest_U_o3_method_Message_result::LiteralInteger183
		addToElementRepository("LiteralInteger183", PolymorphismTest_U_o3_method_Message_result_LiteralInteger183);
		PolymorphismTest_U_o3_method_Message_result_LiteralInteger183.setName("LiteralInteger183");
		PolymorphismTest_U_o3_method_Message_result_LiteralInteger183.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Message_result_LiteralInteger183.setValue(1);
		// LiteralInteger PolymorphismTest_U_o1_method_Call WriteLine_value::LiteralInteger151
		addToElementRepository("LiteralInteger151", PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralInteger151);
		PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralInteger151.setName("LiteralInteger151");
		PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralInteger151.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralInteger151.setValue(1);
		// LiteralInteger PolymorphismTest_U_o3_method_i_node::LiteralInteger181
		addToElementRepository("LiteralInteger181", PolymorphismTest_U_o3_method_i_node_LiteralInteger181);
		PolymorphismTest_U_o3_method_i_node_LiteralInteger181.setName("LiteralInteger181");
		PolymorphismTest_U_o3_method_i_node_LiteralInteger181.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_i_node_LiteralInteger181.setValue(1);
		// LiteralInteger PolymorphismTest_S_o2_method_Call WriteLine_errorStatus::LiteralInteger15
		addToElementRepository("LiteralInteger15", PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralInteger15);
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralInteger15.setName("LiteralInteger15");
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralInteger15.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralInteger15.setValue(0);
		// LiteralInteger PolymorphismTest_U_o1_method_b_node::LiteralInteger141
		addToElementRepository("LiteralInteger141", PolymorphismTest_U_o1_method_b_node_LiteralInteger141);
		PolymorphismTest_U_o1_method_b_node_LiteralInteger141.setName("LiteralInteger141");
		PolymorphismTest_U_o1_method_b_node_LiteralInteger141.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_b_node_LiteralInteger141.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_Call U::o1()_a::LiteralInteger102
		addToElementRepository("LiteralInteger102", PolymorphismTest_main_runTests_Call_U_o1__a_LiteralInteger102);
		PolymorphismTest_main_runTests_Call_U_o1__a_LiteralInteger102.setName("LiteralInteger102");
		PolymorphismTest_main_runTests_Call_U_o1__a_LiteralInteger102.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_U_o1__a_LiteralInteger102.setValue(1);
		// LiteralInteger PolymorphismTest_main_runTests_ObjectFlow78::LiteralInteger79
		addToElementRepository("LiteralInteger79", PolymorphismTest_main_runTests_ObjectFlow78_LiteralInteger79);
		PolymorphismTest_main_runTests_ObjectFlow78_LiteralInteger79.setName("LiteralInteger79");
		PolymorphismTest_main_runTests_ObjectFlow78_LiteralInteger79.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_ObjectFlow78_LiteralInteger79.setValue(1);
		// LiteralInteger PolymorphismTest_main_Call runTests_u::LiteralInteger55
		addToElementRepository("LiteralInteger55", PolymorphismTest_main_Call_runTests_u_LiteralInteger55);
		PolymorphismTest_main_Call_runTests_u_LiteralInteger55.setName("LiteralInteger55");
		PolymorphismTest_main_Call_runTests_u_LiteralInteger55.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_Call_runTests_u_LiteralInteger55.setValue(1);
		// LiteralInteger PolymorphismTest_S_o5_method_Call WriteLine_value::LiteralInteger1
		addToElementRepository("LiteralInteger1", PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralInteger1);
		PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralInteger1.setName("LiteralInteger1");
		PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralInteger1.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralInteger1.setValue(1);
		// LiteralInteger PolymorphismTest_U_o4_method_Call WriteLine_errorStatus::LiteralInteger140
		addToElementRepository("LiteralInteger140", PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralInteger140);
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralInteger140.setName("LiteralInteger140");
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralInteger140.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralInteger140.setValue(1);
		// LiteralInteger PolymorphismTest_T_o4_method_Call WriteLine_errorStatus::LiteralInteger241
		addToElementRepository("LiteralInteger241", PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralInteger241);
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralInteger241.setName("LiteralInteger241");
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralInteger241.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralInteger241.setValue(1);
	}

	private void initializeLiteralString_Instances()
	{
		// LiteralString PolymorphismTest_T_o2_method_Message::LiteralString198
		addToElementRepository("LiteralString198", PolymorphismTest_T_o2_method_Message_LiteralString198);
		PolymorphismTest_T_o2_method_Message_LiteralString198.setName("LiteralString198");
		PolymorphismTest_T_o2_method_Message_LiteralString198.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Message_LiteralString198.setValue("T::o2(b : B) : B");
		// LiteralString PolymorphismTest_S_o5_method_Message::LiteralString9
		addToElementRepository("LiteralString9", PolymorphismTest_S_o5_method_Message_LiteralString9);
		PolymorphismTest_S_o5_method_Message_LiteralString9.setName("LiteralString9");
		PolymorphismTest_S_o5_method_Message_LiteralString9.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Message_LiteralString9.setValue("S::o5()");
		// LiteralString PolymorphismTest_T_o3_method_Message::LiteralString229
		addToElementRepository("LiteralString229", PolymorphismTest_T_o3_method_Message_LiteralString229);
		PolymorphismTest_T_o3_method_Message_LiteralString229.setName("LiteralString229");
		PolymorphismTest_T_o3_method_Message_LiteralString229.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Message_LiteralString229.setValue("T::o3(i : int)");
		// LiteralString PolymorphismTest_U_o2_method_Message::LiteralString177
		addToElementRepository("LiteralString177", PolymorphismTest_U_o2_method_Message_LiteralString177);
		PolymorphismTest_U_o2_method_Message_LiteralString177.setName("LiteralString177");
		PolymorphismTest_U_o2_method_Message_LiteralString177.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Message_LiteralString177.setValue("U::o2(b : B) : A");
		// LiteralString PolymorphismTest_S_o1_method_Message::LiteralString36
		addToElementRepository("LiteralString36", PolymorphismTest_S_o1_method_Message_LiteralString36);
		PolymorphismTest_S_o1_method_Message_LiteralString36.setName("LiteralString36");
		PolymorphismTest_S_o1_method_Message_LiteralString36.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Message_LiteralString36.setValue("S::o1(b : B) : A");
		// LiteralString PolymorphismTest_T_o1_method_Message::LiteralString211
		addToElementRepository("LiteralString211", PolymorphismTest_T_o1_method_Message_LiteralString211);
		PolymorphismTest_T_o1_method_Message_LiteralString211.setName("LiteralString211");
		PolymorphismTest_T_o1_method_Message_LiteralString211.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Message_LiteralString211.setValue("T::o1(b : B) : A");
		// LiteralString PolymorphismTest_U_x_method_Message::LiteralString161
		addToElementRepository("LiteralString161", PolymorphismTest_U_x_method_Message_LiteralString161);
		PolymorphismTest_U_x_method_Message_LiteralString161.setName("LiteralString161");
		PolymorphismTest_U_x_method_Message_LiteralString161.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Message_LiteralString161.setValue("U::x()");
		// LiteralString PolymorphismTest_U_o3_method_Message::LiteralString182
		addToElementRepository("LiteralString182", PolymorphismTest_U_o3_method_Message_LiteralString182);
		PolymorphismTest_U_o3_method_Message_LiteralString182.setName("LiteralString182");
		PolymorphismTest_U_o3_method_Message_LiteralString182.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Message_LiteralString182.setValue("U::o3(i : int)");
		// LiteralString PolymorphismTest_T_o4_method_Message::LiteralString247
		addToElementRepository("LiteralString247", PolymorphismTest_T_o4_method_Message_LiteralString247);
		PolymorphismTest_T_o4_method_Message_LiteralString247.setName("LiteralString247");
		PolymorphismTest_T_o4_method_Message_LiteralString247.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Message_LiteralString247.setValue("T::o4()");
		// LiteralString PolymorphismTest_S_o2_method_Message::LiteralString23
		addToElementRepository("LiteralString23", PolymorphismTest_S_o2_method_Message_LiteralString23);
		PolymorphismTest_S_o2_method_Message_LiteralString23.setName("LiteralString23");
		PolymorphismTest_S_o2_method_Message_LiteralString23.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Message_LiteralString23.setValue("S::o2(a : A) : B");
		// LiteralString PolymorphismTest_A_x_method_Message::LiteralString126
		addToElementRepository("LiteralString126", PolymorphismTest_A_x_method_Message_LiteralString126);
		PolymorphismTest_A_x_method_Message_LiteralString126.setName("LiteralString126");
		PolymorphismTest_A_x_method_Message_LiteralString126.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Message_LiteralString126.setValue("A::x()");
		// LiteralString PolymorphismTest_S_o3_method_Message::LiteralString43
		addToElementRepository("LiteralString43", PolymorphismTest_S_o3_method_Message_LiteralString43);
		PolymorphismTest_S_o3_method_Message_LiteralString43.setName("LiteralString43");
		PolymorphismTest_S_o3_method_Message_LiteralString43.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Message_LiteralString43.setValue("S::o3()");
		// LiteralString PolymorphismTest_U_o1_method_Message::LiteralString145
		addToElementRepository("LiteralString145", PolymorphismTest_U_o1_method_Message_LiteralString145);
		PolymorphismTest_U_o1_method_Message_LiteralString145.setName("LiteralString145");
		PolymorphismTest_U_o1_method_Message_LiteralString145.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Message_LiteralString145.setValue("U::o1(b : B) : A");
		// LiteralString PolymorphismTest_U_o4_method_Message::LiteralString132
		addToElementRepository("LiteralString132", PolymorphismTest_U_o4_method_Message_LiteralString132);
		PolymorphismTest_U_o4_method_Message_LiteralString132.setName("LiteralString132");
		PolymorphismTest_U_o4_method_Message_LiteralString132.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Message_LiteralString132.setValue("U::o4()");
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural PolymorphismTest_T_o3_method_Message_result::LiteralUnlimitedNatural230
		addToElementRepository("LiteralUnlimitedNatural230", PolymorphismTest_T_o3_method_Message_result_LiteralUnlimitedNatural230);
		PolymorphismTest_T_o3_method_Message_result_LiteralUnlimitedNatural230.setName("LiteralUnlimitedNatural230");
		PolymorphismTest_T_o3_method_Message_result_LiteralUnlimitedNatural230.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Message_result_LiteralUnlimitedNatural230.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call o3()_target::LiteralUnlimitedNatural108
		addToElementRepository("LiteralUnlimitedNatural108", PolymorphismTest_main_runTests_Call_o3__target_LiteralUnlimitedNatural108);
		PolymorphismTest_main_runTests_Call_o3__target_LiteralUnlimitedNatural108.setName("LiteralUnlimitedNatural108");
		PolymorphismTest_main_runTests_Call_o3__target_LiteralUnlimitedNatural108.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o3__target_LiteralUnlimitedNatural108.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_o3_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural188
		addToElementRepository("LiteralUnlimitedNatural188", PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural188);
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural188.setName("LiteralUnlimitedNatural188");
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural188.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural188.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_S_o3_method_Message_result::LiteralUnlimitedNatural41
		addToElementRepository("LiteralUnlimitedNatural41", PolymorphismTest_S_o3_method_Message_result_LiteralUnlimitedNatural41);
		PolymorphismTest_S_o3_method_Message_result_LiteralUnlimitedNatural41.setName("LiteralUnlimitedNatural41");
		PolymorphismTest_S_o3_method_Message_result_LiteralUnlimitedNatural41.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Message_result_LiteralUnlimitedNatural41.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_S_o2_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural17
		addToElementRepository("LiteralUnlimitedNatural17", PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural17);
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural17.setName("LiteralUnlimitedNatural17");
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural17.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural17.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call o1()_target::LiteralUnlimitedNatural82
		addToElementRepository("LiteralUnlimitedNatural82", PolymorphismTest_main_runTests_Call_o1__target_LiteralUnlimitedNatural82);
		PolymorphismTest_main_runTests_Call_o1__target_LiteralUnlimitedNatural82.setName("LiteralUnlimitedNatural82");
		PolymorphismTest_main_runTests_Call_o1__target_LiteralUnlimitedNatural82.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o1__target_LiteralUnlimitedNatural82.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_T_o4_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural239
		addToElementRepository("LiteralUnlimitedNatural239", PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural239);
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural239.setName("LiteralUnlimitedNatural239");
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural239.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural239.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_o4_method_Message_result::LiteralUnlimitedNatural134
		addToElementRepository("LiteralUnlimitedNatural134", PolymorphismTest_U_o4_method_Message_result_LiteralUnlimitedNatural134);
		PolymorphismTest_U_o4_method_Message_result_LiteralUnlimitedNatural134.setName("LiteralUnlimitedNatural134");
		PolymorphismTest_U_o4_method_Message_result_LiteralUnlimitedNatural134.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Message_result_LiteralUnlimitedNatural134.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_o1_method_Message_result::LiteralUnlimitedNatural143
		addToElementRepository("LiteralUnlimitedNatural143", PolymorphismTest_U_o1_method_Message_result_LiteralUnlimitedNatural143);
		PolymorphismTest_U_o1_method_Message_result_LiteralUnlimitedNatural143.setName("LiteralUnlimitedNatural143");
		PolymorphismTest_U_o1_method_Message_result_LiteralUnlimitedNatural143.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Message_result_LiteralUnlimitedNatural143.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call A::x()_target::LiteralUnlimitedNatural62
		addToElementRepository("LiteralUnlimitedNatural62", PolymorphismTest_main_runTests_Call_A_x__target_LiteralUnlimitedNatural62);
		PolymorphismTest_main_runTests_Call_A_x__target_LiteralUnlimitedNatural62.setName("LiteralUnlimitedNatural62");
		PolymorphismTest_main_runTests_Call_A_x__target_LiteralUnlimitedNatural62.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_A_x__target_LiteralUnlimitedNatural62.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_T_o4_method_Call WriteLine_value::LiteralUnlimitedNatural243
		addToElementRepository("LiteralUnlimitedNatural243", PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralUnlimitedNatural243);
		PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralUnlimitedNatural243.setName("LiteralUnlimitedNatural243");
		PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralUnlimitedNatural243.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Call_WriteLine_value_LiteralUnlimitedNatural243.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call o2()_target::LiteralUnlimitedNatural95
		addToElementRepository("LiteralUnlimitedNatural95", PolymorphismTest_main_runTests_Call_o2__target_LiteralUnlimitedNatural95);
		PolymorphismTest_main_runTests_Call_o2__target_LiteralUnlimitedNatural95.setName("LiteralUnlimitedNatural95");
		PolymorphismTest_main_runTests_Call_o2__target_LiteralUnlimitedNatural95.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o2__target_LiteralUnlimitedNatural95.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_T_o1_method_Message_result::LiteralUnlimitedNatural210
		addToElementRepository("LiteralUnlimitedNatural210", PolymorphismTest_T_o1_method_Message_result_LiteralUnlimitedNatural210);
		PolymorphismTest_T_o1_method_Message_result_LiteralUnlimitedNatural210.setName("LiteralUnlimitedNatural210");
		PolymorphismTest_T_o1_method_Message_result_LiteralUnlimitedNatural210.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Message_result_LiteralUnlimitedNatural210.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call o2()_a::LiteralUnlimitedNatural97
		addToElementRepository("LiteralUnlimitedNatural97", PolymorphismTest_main_runTests_Call_o2__a_LiteralUnlimitedNatural97);
		PolymorphismTest_main_runTests_Call_o2__a_LiteralUnlimitedNatural97.setName("LiteralUnlimitedNatural97");
		PolymorphismTest_main_runTests_Call_o2__a_LiteralUnlimitedNatural97.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o2__a_LiteralUnlimitedNatural97.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_x_method_Message_result::LiteralUnlimitedNatural163
		addToElementRepository("LiteralUnlimitedNatural163", PolymorphismTest_U_x_method_Message_result_LiteralUnlimitedNatural163);
		PolymorphismTest_U_x_method_Message_result_LiteralUnlimitedNatural163.setName("LiteralUnlimitedNatural163");
		PolymorphismTest_U_x_method_Message_result_LiteralUnlimitedNatural163.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Message_result_LiteralUnlimitedNatural163.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call o4()_target::LiteralUnlimitedNatural57
		addToElementRepository("LiteralUnlimitedNatural57", PolymorphismTest_main_runTests_Call_o4__target_LiteralUnlimitedNatural57);
		PolymorphismTest_main_runTests_Call_o4__target_LiteralUnlimitedNatural57.setName("LiteralUnlimitedNatural57");
		PolymorphismTest_main_runTests_Call_o4__target_LiteralUnlimitedNatural57.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o4__target_LiteralUnlimitedNatural57.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_S_o1_method_Message_result::LiteralUnlimitedNatural38
		addToElementRepository("LiteralUnlimitedNatural38", PolymorphismTest_S_o1_method_Message_result_LiteralUnlimitedNatural38);
		PolymorphismTest_S_o1_method_Message_result_LiteralUnlimitedNatural38.setName("LiteralUnlimitedNatural38");
		PolymorphismTest_S_o1_method_Message_result_LiteralUnlimitedNatural38.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Message_result_LiteralUnlimitedNatural38.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_o3_method_Message_result::LiteralUnlimitedNatural184
		addToElementRepository("LiteralUnlimitedNatural184", PolymorphismTest_U_o3_method_Message_result_LiteralUnlimitedNatural184);
		PolymorphismTest_U_o3_method_Message_result_LiteralUnlimitedNatural184.setName("LiteralUnlimitedNatural184");
		PolymorphismTest_U_o3_method_Message_result_LiteralUnlimitedNatural184.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Message_result_LiteralUnlimitedNatural184.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_S_o5_method_Message_result::LiteralUnlimitedNatural11
		addToElementRepository("LiteralUnlimitedNatural11", PolymorphismTest_S_o5_method_Message_result_LiteralUnlimitedNatural11);
		PolymorphismTest_S_o5_method_Message_result_LiteralUnlimitedNatural11.setName("LiteralUnlimitedNatural11");
		PolymorphismTest_S_o5_method_Message_result_LiteralUnlimitedNatural11.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Message_result_LiteralUnlimitedNatural11.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_x_method_Call WriteLine_value::LiteralUnlimitedNatural156
		addToElementRepository("LiteralUnlimitedNatural156", PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralUnlimitedNatural156);
		PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralUnlimitedNatural156.setName("LiteralUnlimitedNatural156");
		PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralUnlimitedNatural156.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Call_WriteLine_value_LiteralUnlimitedNatural156.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_x_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural159
		addToElementRepository("LiteralUnlimitedNatural159", PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural159);
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural159.setName("LiteralUnlimitedNatural159");
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural159.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural159.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_o1_method_Call WriteLine_value::LiteralUnlimitedNatural149
		addToElementRepository("LiteralUnlimitedNatural149", PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural149);
		PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural149.setName("LiteralUnlimitedNatural149");
		PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural149.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural149.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call U::o1()_a::LiteralUnlimitedNatural103
		addToElementRepository("LiteralUnlimitedNatural103", PolymorphismTest_main_runTests_Call_U_o1__a_LiteralUnlimitedNatural103);
		PolymorphismTest_main_runTests_Call_U_o1__a_LiteralUnlimitedNatural103.setName("LiteralUnlimitedNatural103");
		PolymorphismTest_main_runTests_Call_U_o1__a_LiteralUnlimitedNatural103.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_U_o1__a_LiteralUnlimitedNatural103.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_S_o1_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural31
		addToElementRepository("LiteralUnlimitedNatural31", PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural31);
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural31.setName("LiteralUnlimitedNatural31");
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural31.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural31.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_S_o1_method_Call WriteLine_value::LiteralUnlimitedNatural28
		addToElementRepository("LiteralUnlimitedNatural28", PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural28);
		PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural28.setName("LiteralUnlimitedNatural28");
		PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural28.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural28.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_main_runTests_Call o1()_a::LiteralUnlimitedNatural87
		addToElementRepository("LiteralUnlimitedNatural87", PolymorphismTest_main_runTests_Call_o1__a_LiteralUnlimitedNatural87);
		PolymorphismTest_main_runTests_Call_o1__a_LiteralUnlimitedNatural87.setName("LiteralUnlimitedNatural87");
		PolymorphismTest_main_runTests_Call_o1__a_LiteralUnlimitedNatural87.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o1__a_LiteralUnlimitedNatural87.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_o2_method_Message_result::LiteralUnlimitedNatural179
		addToElementRepository("LiteralUnlimitedNatural179", PolymorphismTest_U_o2_method_Message_result_LiteralUnlimitedNatural179);
		PolymorphismTest_U_o2_method_Message_result_LiteralUnlimitedNatural179.setName("LiteralUnlimitedNatural179");
		PolymorphismTest_U_o2_method_Message_result_LiteralUnlimitedNatural179.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Message_result_LiteralUnlimitedNatural179.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_S_o5_method_Call WriteLine_value::LiteralUnlimitedNatural0
		addToElementRepository("LiteralUnlimitedNatural0", PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralUnlimitedNatural0);
		PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralUnlimitedNatural0.setName("LiteralUnlimitedNatural0");
		PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralUnlimitedNatural0.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Call_WriteLine_value_LiteralUnlimitedNatural0.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_o3_method_Call WriteLine_value::LiteralUnlimitedNatural191
		addToElementRepository("LiteralUnlimitedNatural191", PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural191);
		PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural191.setName("LiteralUnlimitedNatural191");
		PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural191.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural191.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_main_Call runTests_u::LiteralUnlimitedNatural53
		addToElementRepository("LiteralUnlimitedNatural53", PolymorphismTest_main_Call_runTests_u_LiteralUnlimitedNatural53);
		PolymorphismTest_main_Call_runTests_u_LiteralUnlimitedNatural53.setName("LiteralUnlimitedNatural53");
		PolymorphismTest_main_Call_runTests_u_LiteralUnlimitedNatural53.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_Call_runTests_u_LiteralUnlimitedNatural53.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_o1_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural154
		addToElementRepository("LiteralUnlimitedNatural154", PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural154);
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural154.setName("LiteralUnlimitedNatural154");
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural154.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural154.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_S_o2_method_Message_result::LiteralUnlimitedNatural24
		addToElementRepository("LiteralUnlimitedNatural24", PolymorphismTest_S_o2_method_Message_result_LiteralUnlimitedNatural24);
		PolymorphismTest_S_o2_method_Message_result_LiteralUnlimitedNatural24.setName("LiteralUnlimitedNatural24");
		PolymorphismTest_S_o2_method_Message_result_LiteralUnlimitedNatural24.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Message_result_LiteralUnlimitedNatural24.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_T_o1_method_Call WriteLine_value::LiteralUnlimitedNatural212
		addToElementRepository("LiteralUnlimitedNatural212", PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural212);
		PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural212.setName("LiteralUnlimitedNatural212");
		PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural212.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Call_WriteLine_value_LiteralUnlimitedNatural212.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_A_x_method_Message_result::LiteralUnlimitedNatural124
		addToElementRepository("LiteralUnlimitedNatural124", PolymorphismTest_A_x_method_Message_result_LiteralUnlimitedNatural124);
		PolymorphismTest_A_x_method_Message_result_LiteralUnlimitedNatural124.setName("LiteralUnlimitedNatural124");
		PolymorphismTest_A_x_method_Message_result_LiteralUnlimitedNatural124.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Message_result_LiteralUnlimitedNatural124.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_S_o3_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural49
		addToElementRepository("LiteralUnlimitedNatural49", PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural49);
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural49.setName("LiteralUnlimitedNatural49");
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural49.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural49.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_A_x_method_Call WriteLine_value::LiteralUnlimitedNatural118
		addToElementRepository("LiteralUnlimitedNatural118", PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralUnlimitedNatural118);
		PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralUnlimitedNatural118.setName("LiteralUnlimitedNatural118");
		PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralUnlimitedNatural118.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Call_WriteLine_value_LiteralUnlimitedNatural118.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_T_o1_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural216
		addToElementRepository("LiteralUnlimitedNatural216", PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural216);
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural216.setName("LiteralUnlimitedNatural216");
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural216.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural216.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_main_Create S_result::LiteralUnlimitedNatural111
		addToElementRepository("LiteralUnlimitedNatural111", PolymorphismTest_main_Create_S_result_LiteralUnlimitedNatural111);
		PolymorphismTest_main_Create_S_result_LiteralUnlimitedNatural111.setName("LiteralUnlimitedNatural111");
		PolymorphismTest_main_Create_S_result_LiteralUnlimitedNatural111.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_Create_S_result_LiteralUnlimitedNatural111.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_T_o3_method_Call WriteLine_value::LiteralUnlimitedNatural225
		addToElementRepository("LiteralUnlimitedNatural225", PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural225);
		PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural225.setName("LiteralUnlimitedNatural225");
		PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural225.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural225.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_o4_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural139
		addToElementRepository("LiteralUnlimitedNatural139", PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural139);
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural139.setName("LiteralUnlimitedNatural139");
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural139.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural139.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_o2_method_Call WriteLine_value::LiteralUnlimitedNatural173
		addToElementRepository("LiteralUnlimitedNatural173", PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural173);
		PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural173.setName("LiteralUnlimitedNatural173");
		PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural173.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural173.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_S_o5_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural3
		addToElementRepository("LiteralUnlimitedNatural3", PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural3);
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural3.setName("LiteralUnlimitedNatural3");
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural3.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural3.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_o4_method_Call WriteLine_value::LiteralUnlimitedNatural136
		addToElementRepository("LiteralUnlimitedNatural136", PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralUnlimitedNatural136);
		PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralUnlimitedNatural136.setName("LiteralUnlimitedNatural136");
		PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralUnlimitedNatural136.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Call_WriteLine_value_LiteralUnlimitedNatural136.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_S_o3_method_Call WriteLine_value::LiteralUnlimitedNatural52
		addToElementRepository("LiteralUnlimitedNatural52", PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural52);
		PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural52.setName("LiteralUnlimitedNatural52");
		PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural52.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Call_WriteLine_value_LiteralUnlimitedNatural52.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_A_x_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural116
		addToElementRepository("LiteralUnlimitedNatural116", PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural116);
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural116.setName("LiteralUnlimitedNatural116");
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural116.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural116.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_T_o2_method_Call WriteLine_value::LiteralUnlimitedNatural206
		addToElementRepository("LiteralUnlimitedNatural206", PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural206);
		PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural206.setName("LiteralUnlimitedNatural206");
		PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural206.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural206.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_S_o2_method_Call WriteLine_value::LiteralUnlimitedNatural19
		addToElementRepository("LiteralUnlimitedNatural19", PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural19);
		PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural19.setName("LiteralUnlimitedNatural19");
		PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural19.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Call_WriteLine_value_LiteralUnlimitedNatural19.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_T_o3_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural228
		addToElementRepository("LiteralUnlimitedNatural228", PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural228);
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural228.setName("LiteralUnlimitedNatural228");
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural228.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural228.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_T_o4_method_Message_result::LiteralUnlimitedNatural246
		addToElementRepository("LiteralUnlimitedNatural246", PolymorphismTest_T_o4_method_Message_result_LiteralUnlimitedNatural246);
		PolymorphismTest_T_o4_method_Message_result_LiteralUnlimitedNatural246.setName("LiteralUnlimitedNatural246");
		PolymorphismTest_T_o4_method_Message_result_LiteralUnlimitedNatural246.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Message_result_LiteralUnlimitedNatural246.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_U_o2_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural176
		addToElementRepository("LiteralUnlimitedNatural176", PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural176);
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural176.setName("LiteralUnlimitedNatural176");
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural176.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural176.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_T_o2_method_Message_result::LiteralUnlimitedNatural200
		addToElementRepository("LiteralUnlimitedNatural200", PolymorphismTest_T_o2_method_Message_result_LiteralUnlimitedNatural200);
		PolymorphismTest_T_o2_method_Message_result_LiteralUnlimitedNatural200.setName("LiteralUnlimitedNatural200");
		PolymorphismTest_T_o2_method_Message_result_LiteralUnlimitedNatural200.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Message_result_LiteralUnlimitedNatural200.setValue(1);
		// LiteralUnlimitedNatural PolymorphismTest_T_o2_method_Call WriteLine_errorStatus::LiteralUnlimitedNatural203
		addToElementRepository("LiteralUnlimitedNatural203", PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural203);
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural203.setName("LiteralUnlimitedNatural203");
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural203.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus_LiteralUnlimitedNatural203.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow PolymorphismTest_S_o2_method::ObjectFlow12
		addToElementRepository("ObjectFlow12", PolymorphismTest_S_o2_method_ObjectFlow12);
		PolymorphismTest_S_o2_method_ObjectFlow12.setName("ObjectFlow12");
		PolymorphismTest_S_o2_method_ObjectFlow12.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o2_method_ObjectFlow12.setSource(PolymorphismTest_S_o2_method_Message_result);
		PolymorphismTest_S_o2_method_ObjectFlow12.setTarget(PolymorphismTest_S_o2_method_Call_WriteLine_value);
		PolymorphismTest_S_o2_method_ObjectFlow12.setGuard(PolymorphismTest_S_o2_method_ObjectFlow12_LiteralBoolean14);
		// ObjectFlow PolymorphismTest_S_o3_method::ObjectFlow44
		addToElementRepository("ObjectFlow44", PolymorphismTest_S_o3_method_ObjectFlow44);
		PolymorphismTest_S_o3_method_ObjectFlow44.setName("ObjectFlow44");
		PolymorphismTest_S_o3_method_ObjectFlow44.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o3_method_ObjectFlow44.setSource(PolymorphismTest_S_o3_method_Message_result);
		PolymorphismTest_S_o3_method_ObjectFlow44.setTarget(PolymorphismTest_S_o3_method_Call_WriteLine_value);
		PolymorphismTest_S_o3_method_ObjectFlow44.setGuard(PolymorphismTest_S_o3_method_ObjectFlow44_LiteralBoolean45);
		// ObjectFlow PolymorphismTest_main_runTests::ObjectFlow59
		addToElementRepository("ObjectFlow59", PolymorphismTest_main_runTests_ObjectFlow59);
		PolymorphismTest_main_runTests_ObjectFlow59.setName("ObjectFlow59");
		PolymorphismTest_main_runTests_ObjectFlow59.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_ObjectFlow59.setSource(PolymorphismTest_main_runTests_Fork_u);
		PolymorphismTest_main_runTests_ObjectFlow59.setTarget(PolymorphismTest_main_runTests_Call_o4__target);
		PolymorphismTest_main_runTests_ObjectFlow59.setGuard(PolymorphismTest_main_runTests_ObjectFlow59_LiteralBoolean61);
		// ObjectFlow PolymorphismTest_U_o2_method::ObjectFlow167
		addToElementRepository("ObjectFlow167", PolymorphismTest_U_o2_method_ObjectFlow167);
		PolymorphismTest_U_o2_method_ObjectFlow167.setName("ObjectFlow167");
		PolymorphismTest_U_o2_method_ObjectFlow167.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o2_method_ObjectFlow167.setSource(PolymorphismTest_U_o2_method_Message_result);
		PolymorphismTest_U_o2_method_ObjectFlow167.setTarget(PolymorphismTest_U_o2_method_Call_WriteLine_value);
		PolymorphismTest_U_o2_method_ObjectFlow167.setGuard(PolymorphismTest_U_o2_method_ObjectFlow167_LiteralBoolean169);
		// ObjectFlow PolymorphismTest_main_runTests::ObjectFlow64
		addToElementRepository("ObjectFlow64", PolymorphismTest_main_runTests_ObjectFlow64);
		PolymorphismTest_main_runTests_ObjectFlow64.setName("ObjectFlow64");
		PolymorphismTest_main_runTests_ObjectFlow64.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_ObjectFlow64.setSource(PolymorphismTest_main_runTests_Fork_u);
		PolymorphismTest_main_runTests_ObjectFlow64.setTarget(PolymorphismTest_main_runTests_Call_o2__target);
		PolymorphismTest_main_runTests_ObjectFlow64.setGuard(PolymorphismTest_main_runTests_ObjectFlow64_LiteralBoolean66);
		// ObjectFlow PolymorphismTest_main_runTests::ObjectFlow67
		addToElementRepository("ObjectFlow67", PolymorphismTest_main_runTests_ObjectFlow67);
		PolymorphismTest_main_runTests_ObjectFlow67.setName("ObjectFlow67");
		PolymorphismTest_main_runTests_ObjectFlow67.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_ObjectFlow67.setSource(PolymorphismTest_main_runTests_u_node);
		PolymorphismTest_main_runTests_ObjectFlow67.setTarget(PolymorphismTest_main_runTests_Fork_u);
		PolymorphismTest_main_runTests_ObjectFlow67.setGuard(PolymorphismTest_main_runTests_ObjectFlow67_LiteralBoolean68);
		// ObjectFlow PolymorphismTest_S_o5_method::ObjectFlow6
		addToElementRepository("ObjectFlow6", PolymorphismTest_S_o5_method_ObjectFlow6);
		PolymorphismTest_S_o5_method_ObjectFlow6.setName("ObjectFlow6");
		PolymorphismTest_S_o5_method_ObjectFlow6.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o5_method_ObjectFlow6.setSource(PolymorphismTest_S_o5_method_Message_result);
		PolymorphismTest_S_o5_method_ObjectFlow6.setTarget(PolymorphismTest_S_o5_method_Call_WriteLine_value);
		PolymorphismTest_S_o5_method_ObjectFlow6.setGuard(PolymorphismTest_S_o5_method_ObjectFlow6_LiteralBoolean7);
		// ObjectFlow PolymorphismTest_U_x_method::ObjectFlow164
		addToElementRepository("ObjectFlow164", PolymorphismTest_U_x_method_ObjectFlow164);
		PolymorphismTest_U_x_method_ObjectFlow164.setName("ObjectFlow164");
		PolymorphismTest_U_x_method_ObjectFlow164.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_x_method_ObjectFlow164.setSource(PolymorphismTest_U_x_method_Message_result);
		PolymorphismTest_U_x_method_ObjectFlow164.setTarget(PolymorphismTest_U_x_method_Call_WriteLine_value);
		PolymorphismTest_U_x_method_ObjectFlow164.setGuard(PolymorphismTest_U_x_method_ObjectFlow164_LiteralBoolean166);
		// ObjectFlow PolymorphismTest_U_o1_method::ObjectFlow146
		addToElementRepository("ObjectFlow146", PolymorphismTest_U_o1_method_ObjectFlow146);
		PolymorphismTest_U_o1_method_ObjectFlow146.setName("ObjectFlow146");
		PolymorphismTest_U_o1_method_ObjectFlow146.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o1_method_ObjectFlow146.setSource(PolymorphismTest_U_o1_method_Message_result);
		PolymorphismTest_U_o1_method_ObjectFlow146.setTarget(PolymorphismTest_U_o1_method_Call_WriteLine_value);
		PolymorphismTest_U_o1_method_ObjectFlow146.setGuard(PolymorphismTest_U_o1_method_ObjectFlow146_LiteralBoolean147);
		// ObjectFlow PolymorphismTest_main::ObjectFlow112
		addToElementRepository("ObjectFlow112", PolymorphismTest_main_ObjectFlow112);
		PolymorphismTest_main_ObjectFlow112.setName("ObjectFlow112");
		PolymorphismTest_main_ObjectFlow112.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_ObjectFlow112.setSource(PolymorphismTest_main_Create_S_result);
		PolymorphismTest_main_ObjectFlow112.setTarget(PolymorphismTest_main_Call_runTests_u);
		PolymorphismTest_main_ObjectFlow112.setGuard(PolymorphismTest_main_ObjectFlow112_LiteralBoolean114);
		// ObjectFlow PolymorphismTest_main_runTests::ObjectFlow74
		addToElementRepository("ObjectFlow74", PolymorphismTest_main_runTests_ObjectFlow74);
		PolymorphismTest_main_runTests_ObjectFlow74.setName("ObjectFlow74");
		PolymorphismTest_main_runTests_ObjectFlow74.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_ObjectFlow74.setSource(PolymorphismTest_main_runTests_Fork_u);
		PolymorphismTest_main_runTests_ObjectFlow74.setTarget(PolymorphismTest_main_runTests_Call_A_x__target);
		PolymorphismTest_main_runTests_ObjectFlow74.setGuard(PolymorphismTest_main_runTests_ObjectFlow74_LiteralBoolean75);
		// ObjectFlow PolymorphismTest_main_runTests::ObjectFlow78
		addToElementRepository("ObjectFlow78", PolymorphismTest_main_runTests_ObjectFlow78);
		PolymorphismTest_main_runTests_ObjectFlow78.setName("ObjectFlow78");
		PolymorphismTest_main_runTests_ObjectFlow78.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_ObjectFlow78.setSource(PolymorphismTest_main_runTests_Fork_u);
		PolymorphismTest_main_runTests_ObjectFlow78.setTarget(PolymorphismTest_main_runTests_Call_U_o1__target);
		PolymorphismTest_main_runTests_ObjectFlow78.setGuard(PolymorphismTest_main_runTests_ObjectFlow78_LiteralBoolean80);
		// ObjectFlow PolymorphismTest_main_runTests::ObjectFlow88
		addToElementRepository("ObjectFlow88", PolymorphismTest_main_runTests_ObjectFlow88);
		PolymorphismTest_main_runTests_ObjectFlow88.setName("ObjectFlow88");
		PolymorphismTest_main_runTests_ObjectFlow88.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_ObjectFlow88.setSource(PolymorphismTest_main_runTests_Fork_u);
		PolymorphismTest_main_runTests_ObjectFlow88.setTarget(PolymorphismTest_main_runTests_Call_o3__target);
		PolymorphismTest_main_runTests_ObjectFlow88.setGuard(PolymorphismTest_main_runTests_ObjectFlow88_LiteralBoolean90);
		// ObjectFlow PolymorphismTest_T_o2_method::ObjectFlow194
		addToElementRepository("ObjectFlow194", PolymorphismTest_T_o2_method_ObjectFlow194);
		PolymorphismTest_T_o2_method_ObjectFlow194.setName("ObjectFlow194");
		PolymorphismTest_T_o2_method_ObjectFlow194.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o2_method_ObjectFlow194.setSource(PolymorphismTest_T_o2_method_Message_result);
		PolymorphismTest_T_o2_method_ObjectFlow194.setTarget(PolymorphismTest_T_o2_method_Call_WriteLine_value);
		PolymorphismTest_T_o2_method_ObjectFlow194.setGuard(PolymorphismTest_T_o2_method_ObjectFlow194_LiteralBoolean195);
		// ObjectFlow PolymorphismTest_U_o4_method::ObjectFlow129
		addToElementRepository("ObjectFlow129", PolymorphismTest_U_o4_method_ObjectFlow129);
		PolymorphismTest_U_o4_method_ObjectFlow129.setName("ObjectFlow129");
		PolymorphismTest_U_o4_method_ObjectFlow129.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o4_method_ObjectFlow129.setSource(PolymorphismTest_U_o4_method_Message_result);
		PolymorphismTest_U_o4_method_ObjectFlow129.setTarget(PolymorphismTest_U_o4_method_Call_WriteLine_value);
		PolymorphismTest_U_o4_method_ObjectFlow129.setGuard(PolymorphismTest_U_o4_method_ObjectFlow129_LiteralBoolean131);
		// ObjectFlow PolymorphismTest_main_runTests::ObjectFlow91
		addToElementRepository("ObjectFlow91", PolymorphismTest_main_runTests_ObjectFlow91);
		PolymorphismTest_main_runTests_ObjectFlow91.setName("ObjectFlow91");
		PolymorphismTest_main_runTests_ObjectFlow91.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_ObjectFlow91.setSource(PolymorphismTest_main_runTests_Fork_u);
		PolymorphismTest_main_runTests_ObjectFlow91.setTarget(PolymorphismTest_main_runTests_Call_o1__target);
		PolymorphismTest_main_runTests_ObjectFlow91.setGuard(PolymorphismTest_main_runTests_ObjectFlow91_LiteralBoolean92);
		// ObjectFlow PolymorphismTest_T_o4_method::ObjectFlow236
		addToElementRepository("ObjectFlow236", PolymorphismTest_T_o4_method_ObjectFlow236);
		PolymorphismTest_T_o4_method_ObjectFlow236.setName("ObjectFlow236");
		PolymorphismTest_T_o4_method_ObjectFlow236.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o4_method_ObjectFlow236.setSource(PolymorphismTest_T_o4_method_Message_result);
		PolymorphismTest_T_o4_method_ObjectFlow236.setTarget(PolymorphismTest_T_o4_method_Call_WriteLine_value);
		PolymorphismTest_T_o4_method_ObjectFlow236.setGuard(PolymorphismTest_T_o4_method_ObjectFlow236_LiteralBoolean237);
		// ObjectFlow PolymorphismTest_S_o1_method::ObjectFlow33
		addToElementRepository("ObjectFlow33", PolymorphismTest_S_o1_method_ObjectFlow33);
		PolymorphismTest_S_o1_method_ObjectFlow33.setName("ObjectFlow33");
		PolymorphismTest_S_o1_method_ObjectFlow33.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o1_method_ObjectFlow33.setSource(PolymorphismTest_S_o1_method_Message_result);
		PolymorphismTest_S_o1_method_ObjectFlow33.setTarget(PolymorphismTest_S_o1_method_Call_WriteLine_value);
		PolymorphismTest_S_o1_method_ObjectFlow33.setGuard(PolymorphismTest_S_o1_method_ObjectFlow33_LiteralBoolean34);
		// ObjectFlow PolymorphismTest_A_x_method::ObjectFlow121
		addToElementRepository("ObjectFlow121", PolymorphismTest_A_x_method_ObjectFlow121);
		PolymorphismTest_A_x_method_ObjectFlow121.setName("ObjectFlow121");
		PolymorphismTest_A_x_method_ObjectFlow121.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_A_x_method_ObjectFlow121.setSource(PolymorphismTest_A_x_method_Message_result);
		PolymorphismTest_A_x_method_ObjectFlow121.setTarget(PolymorphismTest_A_x_method_Call_WriteLine_value);
		PolymorphismTest_A_x_method_ObjectFlow121.setGuard(PolymorphismTest_A_x_method_ObjectFlow121_LiteralBoolean123);
		// ObjectFlow PolymorphismTest_U_o3_method::ObjectFlow185
		addToElementRepository("ObjectFlow185", PolymorphismTest_U_o3_method_ObjectFlow185);
		PolymorphismTest_U_o3_method_ObjectFlow185.setName("ObjectFlow185");
		PolymorphismTest_U_o3_method_ObjectFlow185.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o3_method_ObjectFlow185.setSource(PolymorphismTest_U_o3_method_Message_result);
		PolymorphismTest_U_o3_method_ObjectFlow185.setTarget(PolymorphismTest_U_o3_method_Call_WriteLine_value);
		PolymorphismTest_U_o3_method_ObjectFlow185.setGuard(PolymorphismTest_U_o3_method_ObjectFlow185_LiteralBoolean186);
		// ObjectFlow PolymorphismTest_T_o3_method::ObjectFlow233
		addToElementRepository("ObjectFlow233", PolymorphismTest_T_o3_method_ObjectFlow233);
		PolymorphismTest_T_o3_method_ObjectFlow233.setName("ObjectFlow233");
		PolymorphismTest_T_o3_method_ObjectFlow233.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o3_method_ObjectFlow233.setSource(PolymorphismTest_T_o3_method_Message_result);
		PolymorphismTest_T_o3_method_ObjectFlow233.setTarget(PolymorphismTest_T_o3_method_Call_WriteLine_value);
		PolymorphismTest_T_o3_method_ObjectFlow233.setGuard(PolymorphismTest_T_o3_method_ObjectFlow233_LiteralBoolean235);
		// ObjectFlow PolymorphismTest_T_o1_method::ObjectFlow219
		addToElementRepository("ObjectFlow219", PolymorphismTest_T_o1_method_ObjectFlow219);
		PolymorphismTest_T_o1_method_ObjectFlow219.setName("ObjectFlow219");
		PolymorphismTest_T_o1_method_ObjectFlow219.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o1_method_ObjectFlow219.setSource(PolymorphismTest_T_o1_method_Message_result);
		PolymorphismTest_T_o1_method_ObjectFlow219.setTarget(PolymorphismTest_T_o1_method_Call_WriteLine_value);
		PolymorphismTest_T_o1_method_ObjectFlow219.setGuard(PolymorphismTest_T_o1_method_ObjectFlow219_LiteralBoolean220);
	}

	private void initializeOperation_Instances()
	{
		// Operation PolymorphismTest_A::x
		addToElementRepository("x", PolymorphismTest_A_x);
		PolymorphismTest_A_x.setName("x");
		PolymorphismTest_A_x.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x.addMethod(PolymorphismTest_A_x_method);
		// Operation PolymorphismTest_S::o5
		addToElementRepository("o5", PolymorphismTest_S_o5);
		PolymorphismTest_S_o5.setName("o5");
		PolymorphismTest_S_o5.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5.addMethod(PolymorphismTest_S_o5_method);
		PolymorphismTest_S_o5.addRedefinedOperation(PolymorphismTest_T_o4);
		// Operation PolymorphismTest_T::B_o2_B
		addToElementRepository("B_o2_B", PolymorphismTest_T_B_o2_B);
		PolymorphismTest_T_B_o2_B.setName("o2");
		PolymorphismTest_T_B_o2_B.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_B_o2_B.addOwnedParameter(PolymorphismTest_T_B_o2_B_b);
		PolymorphismTest_T_B_o2_B.addOwnedParameter(PolymorphismTest_T_B_o2_B_result);
		PolymorphismTest_T_B_o2_B.addMethod(PolymorphismTest_T_o2_method);
		PolymorphismTest_T_B_o2_B.addRedefinedOperation(PolymorphismTest_U_A_o2_B);
		// Operation PolymorphismTest_U::A_o2_B
		addToElementRepository("A_o2_B", PolymorphismTest_U_A_o2_B);
		PolymorphismTest_U_A_o2_B.setName("o2");
		PolymorphismTest_U_A_o2_B.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_A_o2_B.addOwnedParameter(PolymorphismTest_U_A_o2_B_b);
		PolymorphismTest_U_A_o2_B.addOwnedParameter(PolymorphismTest_U_A_o2_B_a);
		PolymorphismTest_U_A_o2_B.addMethod(PolymorphismTest_U_o2_method);
		// Operation PolymorphismTest_U::x
		addToElementRepository("x", PolymorphismTest_U_x);
		PolymorphismTest_U_x.setName("x");
		PolymorphismTest_U_x.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x.addMethod(PolymorphismTest_U_x_method);
		PolymorphismTest_U_x.addRedefinedOperation(PolymorphismTest_A_x);
		// Operation PolymorphismTest_T::A_o1_B
		addToElementRepository("A_o1_B", PolymorphismTest_T_A_o1_B);
		PolymorphismTest_T_A_o1_B.setName("o1");
		PolymorphismTest_T_A_o1_B.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_A_o1_B.addOwnedParameter(PolymorphismTest_T_A_o1_B_b);
		PolymorphismTest_T_A_o1_B.addOwnedParameter(PolymorphismTest_T_A_o1_B_a);
		PolymorphismTest_T_A_o1_B.addMethod(PolymorphismTest_T_o1_method);
		PolymorphismTest_T_A_o1_B.addRedefinedOperation(PolymorphismTest_U_A_o1_B);
		// Operation PolymorphismTest_T::o4
		addToElementRepository("o4", PolymorphismTest_T_o4);
		PolymorphismTest_T_o4.setName("o4");
		PolymorphismTest_T_o4.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4.addMethod(PolymorphismTest_T_o4_method);
		PolymorphismTest_T_o4.addRedefinedOperation(PolymorphismTest_U_o4);
		// Operation PolymorphismTest_S::o3
		addToElementRepository("o3", PolymorphismTest_S_o3);
		PolymorphismTest_S_o3.setName("o3");
		PolymorphismTest_S_o3.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3.addMethod(PolymorphismTest_S_o3_method);
		PolymorphismTest_S_o3.addRedefinedOperation(PolymorphismTest_T_o3_Integer);
		// Operation PolymorphismTest_T::o3_Integer
		addToElementRepository("o3_Integer", PolymorphismTest_T_o3_Integer);
		PolymorphismTest_T_o3_Integer.setName("o3");
		PolymorphismTest_T_o3_Integer.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_Integer.addOwnedParameter(PolymorphismTest_T_o3_Integer_i);
		PolymorphismTest_T_o3_Integer.addMethod(PolymorphismTest_T_o3_method);
		PolymorphismTest_T_o3_Integer.addRedefinedOperation(PolymorphismTest_U_o3_Integer);
		// Operation PolymorphismTest_U::A_o1_B
		addToElementRepository("A_o1_B", PolymorphismTest_U_A_o1_B);
		PolymorphismTest_U_A_o1_B.setName("o1");
		PolymorphismTest_U_A_o1_B.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_A_o1_B.addOwnedParameter(PolymorphismTest_U_A_o1_B_b);
		PolymorphismTest_U_A_o1_B.addOwnedParameter(PolymorphismTest_U_A_o1_B_a);
		PolymorphismTest_U_A_o1_B.addMethod(PolymorphismTest_U_o1_method);
		// Operation PolymorphismTest_S::B_o2_A
		addToElementRepository("B_o2_A", PolymorphismTest_S_B_o2_A);
		PolymorphismTest_S_B_o2_A.setName("o2");
		PolymorphismTest_S_B_o2_A.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_B_o2_A.addOwnedParameter(PolymorphismTest_S_B_o2_A_a);
		PolymorphismTest_S_B_o2_A.addOwnedParameter(PolymorphismTest_S_B_o2_A_b);
		PolymorphismTest_S_B_o2_A.addMethod(PolymorphismTest_S_o2_method);
		PolymorphismTest_S_B_o2_A.addRedefinedOperation(PolymorphismTest_T_B_o2_B);
		// Operation PolymorphismTest_U::o3_Integer
		addToElementRepository("o3_Integer", PolymorphismTest_U_o3_Integer);
		PolymorphismTest_U_o3_Integer.setName("o3");
		PolymorphismTest_U_o3_Integer.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_Integer.addOwnedParameter(PolymorphismTest_U_o3_Integer_i);
		PolymorphismTest_U_o3_Integer.addMethod(PolymorphismTest_U_o3_method);
		// Operation PolymorphismTest_S::A_o1_B
		addToElementRepository("A_o1_B", PolymorphismTest_S_A_o1_B);
		PolymorphismTest_S_A_o1_B.setName("o1");
		PolymorphismTest_S_A_o1_B.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_A_o1_B.addOwnedParameter(PolymorphismTest_S_A_o1_B_b);
		PolymorphismTest_S_A_o1_B.addOwnedParameter(PolymorphismTest_S_A_o1_B_a);
		PolymorphismTest_S_A_o1_B.addMethod(PolymorphismTest_S_o1_method);
		PolymorphismTest_S_A_o1_B.addRedefinedOperation(PolymorphismTest_T_A_o1_B);
		// Operation PolymorphismTest_U::o4
		addToElementRepository("o4", PolymorphismTest_U_o4);
		PolymorphismTest_U_o4.setName("o4");
		PolymorphismTest_U_o4.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4.addMethod(PolymorphismTest_U_o4_method);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin PolymorphismTest_T_o2_method_Message::result
		addToElementRepository("result", PolymorphismTest_T_o2_method_Message_result);
		PolymorphismTest_T_o2_method_Message_result.setName("result");
		PolymorphismTest_T_o2_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_U_o3_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus);
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_U_o3_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_S_o3_method_Message::result
		addToElementRepository("result", PolymorphismTest_S_o3_method_Message_result);
		PolymorphismTest_S_o3_method_Message_result.setName("result");
		PolymorphismTest_S_o3_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_main_runTests_Call o1()::a
		addToElementRepository("a", PolymorphismTest_main_runTests_Call_o1__a);
		PolymorphismTest_main_runTests_Call_o1__a.setName("a");
		PolymorphismTest_main_runTests_Call_o1__a.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o1__a.setType(PolymorphismTest_A);
		// OutputPin PolymorphismTest_T_o3_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus);
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_T_o3_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_S_o1_method_Message::result
		addToElementRepository("result", PolymorphismTest_S_o1_method_Message_result);
		PolymorphismTest_S_o1_method_Message_result.setName("result");
		PolymorphismTest_S_o1_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_S_o5_method_Message::result
		addToElementRepository("result", PolymorphismTest_S_o5_method_Message_result);
		PolymorphismTest_S_o5_method_Message_result.setName("result");
		PolymorphismTest_S_o5_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_S_o2_method_Message::result
		addToElementRepository("result", PolymorphismTest_S_o2_method_Message_result);
		PolymorphismTest_S_o2_method_Message_result.setName("result");
		PolymorphismTest_S_o2_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_A_x_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_A_x_method_Call_WriteLine_errorStatus);
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_A_x_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_A_x_method_Message::result
		addToElementRepository("result", PolymorphismTest_A_x_method_Message_result);
		PolymorphismTest_A_x_method_Message_result.setName("result");
		PolymorphismTest_A_x_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_main_Create S::result
		addToElementRepository("result", PolymorphismTest_main_Create_S_result);
		PolymorphismTest_main_Create_S_result.setName("result");
		PolymorphismTest_main_Create_S_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_Create_S_result.setType(PolymorphismTest_S);
		// OutputPin PolymorphismTest_T_o2_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus);
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_T_o2_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_main_runTests_Call U::o1()::a
		addToElementRepository("a", PolymorphismTest_main_runTests_Call_U_o1__a);
		PolymorphismTest_main_runTests_Call_U_o1__a.setName("a");
		PolymorphismTest_main_runTests_Call_U_o1__a.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_U_o1__a.setType(PolymorphismTest_A);
		// OutputPin PolymorphismTest_U_x_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_U_x_method_Call_WriteLine_errorStatus);
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_U_x_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_U_o3_method_Message::result
		addToElementRepository("result", PolymorphismTest_U_o3_method_Message_result);
		PolymorphismTest_U_o3_method_Message_result.setName("result");
		PolymorphismTest_U_o3_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_T_o1_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus);
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_T_o1_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_T_o4_method_Message::result
		addToElementRepository("result", PolymorphismTest_T_o4_method_Message_result);
		PolymorphismTest_T_o4_method_Message_result.setName("result");
		PolymorphismTest_T_o4_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_T_o3_method_Message::result
		addToElementRepository("result", PolymorphismTest_T_o3_method_Message_result);
		PolymorphismTest_T_o3_method_Message_result.setName("result");
		PolymorphismTest_T_o3_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_S_o3_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus);
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_S_o3_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_U_o2_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus);
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_U_o2_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_main_runTests_Call o2()::a
		addToElementRepository("a", PolymorphismTest_main_runTests_Call_o2__a);
		PolymorphismTest_main_runTests_Call_o2__a.setName("a");
		PolymorphismTest_main_runTests_Call_o2__a.setVisibility(VisibilityKind.public_);
		PolymorphismTest_main_runTests_Call_o2__a.setType(PolymorphismTest_A);
		// OutputPin PolymorphismTest_T_o4_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus);
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_T_o4_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_U_o1_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus);
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_U_o1_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_T_o1_method_Message::result
		addToElementRepository("result", PolymorphismTest_T_o1_method_Message_result);
		PolymorphismTest_T_o1_method_Message_result.setName("result");
		PolymorphismTest_T_o1_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_S_o2_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus);
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_S_o2_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_S_o5_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus);
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_S_o5_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_U_o1_method_Message::result
		addToElementRepository("result", PolymorphismTest_U_o1_method_Message_result);
		PolymorphismTest_U_o1_method_Message_result.setName("result");
		PolymorphismTest_U_o1_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_U_o2_method_Message::result
		addToElementRepository("result", PolymorphismTest_U_o2_method_Message_result);
		PolymorphismTest_U_o2_method_Message_result.setName("result");
		PolymorphismTest_U_o2_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_U_o4_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus);
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_U_o4_method_Call_WriteLine_errorStatus.setLower(0);
		// OutputPin PolymorphismTest_U_x_method_Message::result
		addToElementRepository("result", PolymorphismTest_U_x_method_Message_result);
		PolymorphismTest_U_x_method_Message_result.setName("result");
		PolymorphismTest_U_x_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_U_o4_method_Message::result
		addToElementRepository("result", PolymorphismTest_U_o4_method_Message_result);
		PolymorphismTest_U_o4_method_Message_result.setName("result");
		PolymorphismTest_U_o4_method_Message_result.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin PolymorphismTest_S_o1_method_Call WriteLine::errorStatus
		addToElementRepository("errorStatus", PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus);
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus.setName("errorStatus");
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus.setType(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_Common_Status);
		PolymorphismTest_S_o1_method_Call_WriteLine_errorStatus.setLower(0);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport PolymorphismTest::PackageImport128
		addToElementRepository("PackageImport128", PolymorphismTest_PackageImport128);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter PolymorphismTest_S_o2_method::a
		addToElementRepository("a", PolymorphismTest_S_o2_method_a);
		PolymorphismTest_S_o2_method_a.setName("a");
		PolymorphismTest_S_o2_method_a.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o2_method_a.setType(PolymorphismTest_A);
		// Parameter PolymorphismTest_T_o2_method::b
		addToElementRepository("b", PolymorphismTest_T_o2_method_b);
		PolymorphismTest_T_o2_method_b.setName("b");
		PolymorphismTest_T_o2_method_b.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o2_method_b.setType(PolymorphismTest_B);
		// Parameter PolymorphismTest_U_o1_method::a
		addToElementRepository("a", PolymorphismTest_U_o1_method_a);
		PolymorphismTest_U_o1_method_a.setName("a");
		PolymorphismTest_U_o1_method_a.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o1_method_a.setType(PolymorphismTest_A);
		PolymorphismTest_U_o1_method_a.setDirection(ParameterDirectionKind.return_);
		// Parameter PolymorphismTest_U_A_o2_B::a
		addToElementRepository("a", PolymorphismTest_U_A_o2_B_a);
		PolymorphismTest_U_A_o2_B_a.setName("a");
		PolymorphismTest_U_A_o2_B_a.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_A_o2_B_a.setType(PolymorphismTest_A);
		PolymorphismTest_U_A_o2_B_a.setDirection(ParameterDirectionKind.return_);
		// Parameter PolymorphismTest_U_o2_method::b
		addToElementRepository("b", PolymorphismTest_U_o2_method_b);
		PolymorphismTest_U_o2_method_b.setName("b");
		PolymorphismTest_U_o2_method_b.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o2_method_b.setType(PolymorphismTest_B);
		// Parameter PolymorphismTest_T_o3_Integer::i
		addToElementRepository("i", PolymorphismTest_T_o3_Integer_i);
		PolymorphismTest_T_o3_Integer_i.setName("i");
		PolymorphismTest_T_o3_Integer_i.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o3_Integer_i.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter PolymorphismTest_U_A_o1_B::a
		addToElementRepository("a", PolymorphismTest_U_A_o1_B_a);
		PolymorphismTest_U_A_o1_B_a.setName("a");
		PolymorphismTest_U_A_o1_B_a.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_A_o1_B_a.setType(PolymorphismTest_A);
		PolymorphismTest_U_A_o1_B_a.setDirection(ParameterDirectionKind.return_);
		// Parameter PolymorphismTest_T_o1_method::b
		addToElementRepository("b", PolymorphismTest_T_o1_method_b);
		PolymorphismTest_T_o1_method_b.setName("b");
		PolymorphismTest_T_o1_method_b.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o1_method_b.setType(PolymorphismTest_B);
		// Parameter PolymorphismTest_U_A_o1_B::b
		addToElementRepository("b", PolymorphismTest_U_A_o1_B_b);
		PolymorphismTest_U_A_o1_B_b.setName("b");
		PolymorphismTest_U_A_o1_B_b.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_A_o1_B_b.setType(PolymorphismTest_B);
		// Parameter PolymorphismTest_S_A_o1_B::a
		addToElementRepository("a", PolymorphismTest_S_A_o1_B_a);
		PolymorphismTest_S_A_o1_B_a.setName("a");
		PolymorphismTest_S_A_o1_B_a.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_A_o1_B_a.setType(PolymorphismTest_A);
		PolymorphismTest_S_A_o1_B_a.setDirection(ParameterDirectionKind.return_);
		// Parameter PolymorphismTest_U_o3_method::i
		addToElementRepository("i", PolymorphismTest_U_o3_method_i);
		PolymorphismTest_U_o3_method_i.setName("i");
		PolymorphismTest_U_o3_method_i.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o3_method_i.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter PolymorphismTest_main_runTests::u
		addToElementRepository("u", PolymorphismTest_main_runTests_u);
		PolymorphismTest_main_runTests_u.setName("u");
		PolymorphismTest_main_runTests_u.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_main_runTests_u.setType(PolymorphismTest_U);
		// Parameter PolymorphismTest_U_A_o2_B::b
		addToElementRepository("b", PolymorphismTest_U_A_o2_B_b);
		PolymorphismTest_U_A_o2_B_b.setName("b");
		PolymorphismTest_U_A_o2_B_b.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_A_o2_B_b.setType(PolymorphismTest_B);
		// Parameter PolymorphismTest_T_B_o2_B::result
		addToElementRepository("result", PolymorphismTest_T_B_o2_B_result);
		PolymorphismTest_T_B_o2_B_result.setName("result");
		PolymorphismTest_T_B_o2_B_result.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_B_o2_B_result.setType(PolymorphismTest_B);
		PolymorphismTest_T_B_o2_B_result.setDirection(ParameterDirectionKind.return_);
		// Parameter PolymorphismTest_T_o1_method::a
		addToElementRepository("a", PolymorphismTest_T_o1_method_a);
		PolymorphismTest_T_o1_method_a.setName("a");
		PolymorphismTest_T_o1_method_a.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o1_method_a.setType(PolymorphismTest_A);
		PolymorphismTest_T_o1_method_a.setDirection(ParameterDirectionKind.return_);
		// Parameter PolymorphismTest_U_o1_method::b
		addToElementRepository("b", PolymorphismTest_U_o1_method_b);
		PolymorphismTest_U_o1_method_b.setName("b");
		PolymorphismTest_U_o1_method_b.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o1_method_b.setType(PolymorphismTest_B);
		// Parameter PolymorphismTest_S_B_o2_A::b
		addToElementRepository("b", PolymorphismTest_S_B_o2_A_b);
		PolymorphismTest_S_B_o2_A_b.setName("b");
		PolymorphismTest_S_B_o2_A_b.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_B_o2_A_b.setType(PolymorphismTest_B);
		PolymorphismTest_S_B_o2_A_b.setDirection(ParameterDirectionKind.return_);
		// Parameter PolymorphismTest_S_A_o1_B::b
		addToElementRepository("b", PolymorphismTest_S_A_o1_B_b);
		PolymorphismTest_S_A_o1_B_b.setName("b");
		PolymorphismTest_S_A_o1_B_b.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_A_o1_B_b.setType(PolymorphismTest_B);
		// Parameter PolymorphismTest_U_o2_method::a
		addToElementRepository("a", PolymorphismTest_U_o2_method_a);
		PolymorphismTest_U_o2_method_a.setName("a");
		PolymorphismTest_U_o2_method_a.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o2_method_a.setType(PolymorphismTest_A);
		PolymorphismTest_U_o2_method_a.setDirection(ParameterDirectionKind.return_);
		// Parameter PolymorphismTest_T_o2_method::result
		addToElementRepository("result", PolymorphismTest_T_o2_method_result);
		PolymorphismTest_T_o2_method_result.setName("result");
		PolymorphismTest_T_o2_method_result.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o2_method_result.setType(PolymorphismTest_B);
		PolymorphismTest_T_o2_method_result.setDirection(ParameterDirectionKind.return_);
		// Parameter PolymorphismTest_T_A_o1_B::a
		addToElementRepository("a", PolymorphismTest_T_A_o1_B_a);
		PolymorphismTest_T_A_o1_B_a.setName("a");
		PolymorphismTest_T_A_o1_B_a.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_A_o1_B_a.setType(PolymorphismTest_A);
		PolymorphismTest_T_A_o1_B_a.setDirection(ParameterDirectionKind.return_);
		// Parameter PolymorphismTest_S_o1_method::b
		addToElementRepository("b", PolymorphismTest_S_o1_method_b);
		PolymorphismTest_S_o1_method_b.setName("b");
		PolymorphismTest_S_o1_method_b.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o1_method_b.setType(PolymorphismTest_B);
		// Parameter PolymorphismTest_S_o2_method::b
		addToElementRepository("b", PolymorphismTest_S_o2_method_b);
		PolymorphismTest_S_o2_method_b.setName("b");
		PolymorphismTest_S_o2_method_b.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o2_method_b.setType(PolymorphismTest_B);
		PolymorphismTest_S_o2_method_b.setDirection(ParameterDirectionKind.return_);
		// Parameter PolymorphismTest_T_A_o1_B::b
		addToElementRepository("b", PolymorphismTest_T_A_o1_B_b);
		PolymorphismTest_T_A_o1_B_b.setName("b");
		PolymorphismTest_T_A_o1_B_b.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_A_o1_B_b.setType(PolymorphismTest_B);
		// Parameter PolymorphismTest_S_B_o2_A::a
		addToElementRepository("a", PolymorphismTest_S_B_o2_A_a);
		PolymorphismTest_S_B_o2_A_a.setName("a");
		PolymorphismTest_S_B_o2_A_a.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_B_o2_A_a.setType(PolymorphismTest_A);
		// Parameter PolymorphismTest_T_o3_method::i
		addToElementRepository("i", PolymorphismTest_T_o3_method_i);
		PolymorphismTest_T_o3_method_i.setName("i");
		PolymorphismTest_T_o3_method_i.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_o3_method_i.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter PolymorphismTest_T_B_o2_B::b
		addToElementRepository("b", PolymorphismTest_T_B_o2_B_b);
		PolymorphismTest_T_B_o2_B_b.setName("b");
		PolymorphismTest_T_B_o2_B_b.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_T_B_o2_B_b.setType(PolymorphismTest_B);
		// Parameter PolymorphismTest_U_o3_Integer::i
		addToElementRepository("i", PolymorphismTest_U_o3_Integer_i);
		PolymorphismTest_U_o3_Integer_i.setName("i");
		PolymorphismTest_U_o3_Integer_i.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_U_o3_Integer_i.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Parameter PolymorphismTest_S_o1_method::a
		addToElementRepository("a", PolymorphismTest_S_o1_method_a);
		PolymorphismTest_S_o1_method_a.setName("a");
		PolymorphismTest_S_o1_method_a.setVisibility(VisibilityKind.public_);
		
		PolymorphismTest_S_o1_method_a.setType(PolymorphismTest_A);
		PolymorphismTest_S_o1_method_a.setDirection(ParameterDirectionKind.return_);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction PolymorphismTest_U_o3_method::Message
		addToElementRepository("Message", PolymorphismTest_U_o3_method_Message);
		PolymorphismTest_U_o3_method_Message.setName("Message");
		PolymorphismTest_U_o3_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o3_method_Message.setValue(PolymorphismTest_U_o3_method_Message_LiteralString182);
		PolymorphismTest_U_o3_method_Message.setResult(PolymorphismTest_U_o3_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_S_o3_method::Message
		addToElementRepository("Message", PolymorphismTest_S_o3_method_Message);
		PolymorphismTest_S_o3_method_Message.setName("Message");
		PolymorphismTest_S_o3_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o3_method_Message.setValue(PolymorphismTest_S_o3_method_Message_LiteralString43);
		PolymorphismTest_S_o3_method_Message.setResult(PolymorphismTest_S_o3_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_T_o1_method::Message
		addToElementRepository("Message", PolymorphismTest_T_o1_method_Message);
		PolymorphismTest_T_o1_method_Message.setName("Message");
		PolymorphismTest_T_o1_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o1_method_Message.setValue(PolymorphismTest_T_o1_method_Message_LiteralString211);
		PolymorphismTest_T_o1_method_Message.setResult(PolymorphismTest_T_o1_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_T_o2_method::Message
		addToElementRepository("Message", PolymorphismTest_T_o2_method_Message);
		PolymorphismTest_T_o2_method_Message.setName("Message");
		PolymorphismTest_T_o2_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o2_method_Message.setValue(PolymorphismTest_T_o2_method_Message_LiteralString198);
		PolymorphismTest_T_o2_method_Message.setResult(PolymorphismTest_T_o2_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_U_x_method::Message
		addToElementRepository("Message", PolymorphismTest_U_x_method_Message);
		PolymorphismTest_U_x_method_Message.setName("Message");
		PolymorphismTest_U_x_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_x_method_Message.setValue(PolymorphismTest_U_x_method_Message_LiteralString161);
		PolymorphismTest_U_x_method_Message.setResult(PolymorphismTest_U_x_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_S_o1_method::Message
		addToElementRepository("Message", PolymorphismTest_S_o1_method_Message);
		PolymorphismTest_S_o1_method_Message.setName("Message");
		PolymorphismTest_S_o1_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o1_method_Message.setValue(PolymorphismTest_S_o1_method_Message_LiteralString36);
		PolymorphismTest_S_o1_method_Message.setResult(PolymorphismTest_S_o1_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_A_x_method::Message
		addToElementRepository("Message", PolymorphismTest_A_x_method_Message);
		PolymorphismTest_A_x_method_Message.setName("Message");
		PolymorphismTest_A_x_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_A_x_method_Message.setValue(PolymorphismTest_A_x_method_Message_LiteralString126);
		PolymorphismTest_A_x_method_Message.setResult(PolymorphismTest_A_x_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_U_o2_method::Message
		addToElementRepository("Message", PolymorphismTest_U_o2_method_Message);
		PolymorphismTest_U_o2_method_Message.setName("Message");
		PolymorphismTest_U_o2_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o2_method_Message.setValue(PolymorphismTest_U_o2_method_Message_LiteralString177);
		PolymorphismTest_U_o2_method_Message.setResult(PolymorphismTest_U_o2_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_S_o5_method::Message
		addToElementRepository("Message", PolymorphismTest_S_o5_method_Message);
		PolymorphismTest_S_o5_method_Message.setName("Message");
		PolymorphismTest_S_o5_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o5_method_Message.setValue(PolymorphismTest_S_o5_method_Message_LiteralString9);
		PolymorphismTest_S_o5_method_Message.setResult(PolymorphismTest_S_o5_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_T_o4_method::Message
		addToElementRepository("Message", PolymorphismTest_T_o4_method_Message);
		PolymorphismTest_T_o4_method_Message.setName("Message");
		PolymorphismTest_T_o4_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o4_method_Message.setValue(PolymorphismTest_T_o4_method_Message_LiteralString247);
		PolymorphismTest_T_o4_method_Message.setResult(PolymorphismTest_T_o4_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_U_o4_method::Message
		addToElementRepository("Message", PolymorphismTest_U_o4_method_Message);
		PolymorphismTest_U_o4_method_Message.setName("Message");
		PolymorphismTest_U_o4_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o4_method_Message.setValue(PolymorphismTest_U_o4_method_Message_LiteralString132);
		PolymorphismTest_U_o4_method_Message.setResult(PolymorphismTest_U_o4_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_T_o3_method::Message
		addToElementRepository("Message", PolymorphismTest_T_o3_method_Message);
		PolymorphismTest_T_o3_method_Message.setName("Message");
		PolymorphismTest_T_o3_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_T_o3_method_Message.setValue(PolymorphismTest_T_o3_method_Message_LiteralString229);
		PolymorphismTest_T_o3_method_Message.setResult(PolymorphismTest_T_o3_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_U_o1_method::Message
		addToElementRepository("Message", PolymorphismTest_U_o1_method_Message);
		PolymorphismTest_U_o1_method_Message.setName("Message");
		PolymorphismTest_U_o1_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_U_o1_method_Message.setValue(PolymorphismTest_U_o1_method_Message_LiteralString145);
		PolymorphismTest_U_o1_method_Message.setResult(PolymorphismTest_U_o1_method_Message_result);
		// ValueSpecificationAction PolymorphismTest_S_o2_method::Message
		addToElementRepository("Message", PolymorphismTest_S_o2_method_Message);
		PolymorphismTest_S_o2_method_Message.setName("Message");
		PolymorphismTest_S_o2_method_Message.setVisibility(VisibilityKind.public_);
		PolymorphismTest_S_o2_method_Message.setValue(PolymorphismTest_S_o2_method_Message_LiteralString23);
		PolymorphismTest_S_o2_method_Message.setResult(PolymorphismTest_S_o2_method_Message_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // PolymorphismTestModel
