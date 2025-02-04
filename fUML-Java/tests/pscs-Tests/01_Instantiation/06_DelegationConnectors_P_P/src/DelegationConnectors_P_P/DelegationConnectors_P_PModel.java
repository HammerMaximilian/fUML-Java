/*
 * DelegationConnectors_P_PModel.java
 * 
 * Auto-generated file
 */
package DelegationConnectors_P_P;

import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.structuredclassifiers.Connector;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.InterfaceRealization;
import uml.activities.Activity;
import uml.actions.OutputPin;
import uml.actions.CallOperationAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.values.LiteralString;
import uml.commonstructure.Comment;
import uml.simpleclassifiers.Interface;
import uml.classification.Operation;
import uml.classification.Parameter;
import uml.activities.ActivityParameterNode;
import uml.commonstructure.PackageImport;
import uml.classification.AggregationKind;
import uml.activities.ControlFlow;
import uml.actions.CreateObjectAction;
import uml.actions.ValueSpecificationAction;
import uml.commonbehavior.FunctionBehavior;
import uml.actions.CallBehaviorAction;
import uml.structuredclassifiers.Association;
import uml.classification.Property;
import utils.primitivetypes.PrimitiveTypesModel;
import uml.classification.ParameterDirectionKind;
import uml.simpleclassifiers.PrimitiveType;
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

public class DelegationConnectors_P_PModel extends InMemoryModel
{
	private static DelegationConnectors_P_PModel instance;

	/*
	 * Model DelegationConnectors_P_P
	 */
	public Package DelegationConnectors_P_P = new Package();
		public Association DelegationConnectors_P_P_R = new Association();
			public Property DelegationConnectors_P_P_R_y = new Property();
				public LiteralUnlimitedNatural DelegationConnectors_P_P_R_y_LiteralUnlimitedNatural0 = new LiteralUnlimitedNatural();
				public LiteralInteger DelegationConnectors_P_P_R_y_LiteralInteger1 = new LiteralInteger();
			public Property DelegationConnectors_P_P_R_x = new Property();
				public LiteralUnlimitedNatural DelegationConnectors_P_P_R_x_LiteralUnlimitedNatural2 = new LiteralUnlimitedNatural();
				public LiteralInteger DelegationConnectors_P_P_R_x_LiteralInteger3 = new LiteralInteger();
		public Class_ DelegationConnectors_P_P_IImpl = new Class_();
			public InterfaceRealization DelegationConnectors_P_P_IImpl_I_Realization = new InterfaceRealization();
		public Activity DelegationConnectors_P_P_main = new Activity();
			public CallBehaviorAction DelegationConnectors_P_P_main_instantiate_A_Array_Pattern = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger4 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger5 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural6 = new LiteralUnlimitedNatural();
			public ControlFlow DelegationConnectors_P_P_main_ControlFlow7 = new ControlFlow();
			public CallBehaviorAction DelegationConnectors_P_P_main_instantiate_A_Star_Pattern = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger8 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural9 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger10 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_P_main_ObjectFlow11 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_P_main_ObjectFlow11_LiteralBoolean12 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_P_main_ObjectFlow11_LiteralInteger13 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_P_main_ObjectFlow14 = new ObjectFlow();
				public LiteralInteger DelegationConnectors_P_P_main_ObjectFlow14_LiteralInteger15 = new LiteralInteger();
				public LiteralBoolean DelegationConnectors_P_P_main_ObjectFlow14_LiteralBoolean16 = new LiteralBoolean();
			public ObjectFlow DelegationConnectors_P_P_main_ObjectFlow17 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_P_main_ObjectFlow17_LiteralBoolean18 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_P_main_ObjectFlow17_LiteralInteger19 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_P_main_assert_A_Array_Pattern = new CallBehaviorAction();
				public InputPin DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern = new InputPin();
					public LiteralInteger DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger20 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger21 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural22 = new LiteralUnlimitedNatural();
			public ControlFlow DelegationConnectors_P_P_main_ControlFlow23 = new ControlFlow();
			public CallBehaviorAction DelegationConnectors_P_P_main_assert_A_Empty_Pattern = new CallBehaviorAction();
				public InputPin DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern = new InputPin();
					public LiteralInteger DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger24 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger25 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural26 = new LiteralUnlimitedNatural();
			public ObjectFlow DelegationConnectors_P_P_main_ObjectFlow27 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_P_main_ObjectFlow27_LiteralBoolean28 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_P_main_ObjectFlow27_LiteralInteger29 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger30 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger31 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural32 = new LiteralUnlimitedNatural();
			public CallBehaviorAction DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern = new CallBehaviorAction();
				public InputPin DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern = new InputPin();
					public LiteralInteger DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger33 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger34 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural35 = new LiteralUnlimitedNatural();
			public CallBehaviorAction DelegationConnectors_P_P_main_assert_A_Star_Pattern = new CallBehaviorAction();
				public InputPin DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern = new InputPin();
					public LiteralInteger DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger36 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural37 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger38 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger39 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger40 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural41 = new LiteralUnlimitedNatural();
			public ControlFlow DelegationConnectors_P_P_main_ControlFlow42 = new ControlFlow();
		public Class_ DelegationConnectors_P_P_A_Array_Pattern = new Class_();
			public Connector DelegationConnectors_P_P_A_Array_Pattern_r = new Connector();
				public ConnectorEnd DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd43 = new ConnectorEnd();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd43_LiteralUnlimitedNatural44 = new LiteralUnlimitedNatural();
				public ConnectorEnd DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd45 = new ConnectorEnd();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd45_LiteralUnlimitedNatural46 = new LiteralUnlimitedNatural();
			public Property DelegationConnectors_P_P_A_Array_Pattern_b = new Property();
				public LiteralInteger DelegationConnectors_P_P_A_Array_Pattern_b_LiteralInteger47 = new LiteralInteger();
				public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Array_Pattern_b_LiteralUnlimitedNatural48 = new LiteralUnlimitedNatural();
			public Port DelegationConnectors_P_P_A_Array_Pattern_p = new Port();
				public LiteralInteger DelegationConnectors_P_P_A_Array_Pattern_p_LiteralInteger49 = new LiteralInteger();
				public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Array_Pattern_p_LiteralUnlimitedNatural50 = new LiteralUnlimitedNatural();
			public Comment DelegationConnectors_P_P_A_Array_Pattern_Comment51 = new Comment();
			public Operation DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern = new Operation();
				public Parameter DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result = new Parameter();
		public Class_ DelegationConnectors_P_P_A_Empty_Pattern = new Class_();
			public Property DelegationConnectors_P_P_A_Empty_Pattern_b = new Property();
				public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Empty_Pattern_b_LiteralUnlimitedNatural52 = new LiteralUnlimitedNatural();
				public LiteralInteger DelegationConnectors_P_P_A_Empty_Pattern_b_LiteralInteger53 = new LiteralInteger();
			public Port DelegationConnectors_P_P_A_Empty_Pattern_p = new Port();
				public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Empty_Pattern_p_LiteralUnlimitedNatural54 = new LiteralUnlimitedNatural();
				public LiteralInteger DelegationConnectors_P_P_A_Empty_Pattern_p_LiteralInteger55 = new LiteralInteger();
			public Operation DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern = new Operation();
				public Parameter DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result = new Parameter();
			public Comment DelegationConnectors_P_P_A_Empty_Pattern_Comment56 = new Comment();
			public Connector DelegationConnectors_P_P_A_Empty_Pattern_r = new Connector();
				public ConnectorEnd DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd57 = new ConnectorEnd();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd57_LiteralUnlimitedNatural58 = new LiteralUnlimitedNatural();
				public ConnectorEnd DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd59 = new ConnectorEnd();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd59_LiteralUnlimitedNatural60 = new LiteralUnlimitedNatural();
		public PackageImport DelegationConnectors_P_P_PackageImport61 = new PackageImport();
		public Activity DelegationConnectors_P_P_assert_A_Empty_Pattern = new Activity();
			public ObjectFlow DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62_LiteralBoolean63 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62_LiteralInteger64 = new LiteralInteger();
			public ValueSpecificationAction DelegationConnectors_P_P_assert_A_Empty_Pattern_message = new ValueSpecificationAction();
				public LiteralString DelegationConnectors_P_P_assert_A_Empty_Pattern_message_LiteralString65 = new LiteralString();
				public OutputPin DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralInteger66 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural67 = new LiteralUnlimitedNatural();
			public ActivityParameterNode DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node = new ActivityParameterNode();
				public LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger68 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger69 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural70 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger71 = new LiteralInteger();
				public InputPin DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value = new InputPin();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger72 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger73 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural74 = new LiteralUnlimitedNatural();
			public Parameter DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern = new Parameter();
		public Comment DelegationConnectors_P_P_Comment75 = new Comment();
		public Class_ DelegationConnectors_P_P_A_Star_Pattern = new Class_();
			public Operation DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern = new Operation();
				public Parameter DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result = new Parameter();
			public Port DelegationConnectors_P_P_A_Star_Pattern_p = new Port();
				public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Star_Pattern_p_LiteralUnlimitedNatural76 = new LiteralUnlimitedNatural();
				public LiteralInteger DelegationConnectors_P_P_A_Star_Pattern_p_LiteralInteger77 = new LiteralInteger();
			public Property DelegationConnectors_P_P_A_Star_Pattern_b = new Property();
				public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Star_Pattern_b_LiteralUnlimitedNatural78 = new LiteralUnlimitedNatural();
				public LiteralInteger DelegationConnectors_P_P_A_Star_Pattern_b_LiteralInteger79 = new LiteralInteger();
			public Connector DelegationConnectors_P_P_A_Star_Pattern_r = new Connector();
				public ConnectorEnd DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80 = new ConnectorEnd();
					public LiteralInteger DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80_LiteralInteger81 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80_LiteralUnlimitedNatural82 = new LiteralUnlimitedNatural();
				public ConnectorEnd DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83 = new ConnectorEnd();
					public LiteralInteger DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83_LiteralInteger84 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83_LiteralUnlimitedNatural85 = new LiteralUnlimitedNatural();
			public Comment DelegationConnectors_P_P_A_Star_Pattern_Comment86 = new Comment();
		public Interface DelegationConnectors_P_P_I = new Interface();
		public Activity DelegationConnectors_P_P_assert_A_Array_Pattern = new Activity();
			public Parameter DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern = new Parameter();
			public ValueSpecificationAction DelegationConnectors_P_P_assert_A_Array_Pattern_message = new ValueSpecificationAction();
				public LiteralString DelegationConnectors_P_P_assert_A_Array_Pattern_message_LiteralString87 = new LiteralString();
				public OutputPin DelegationConnectors_P_P_assert_A_Array_Pattern_message_result = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural88 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralInteger89 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine = new CallBehaviorAction();
				public InputPin DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value = new InputPin();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger90 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural91 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger92 = new LiteralInteger();
				public OutputPin DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger93 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural94 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger95 = new LiteralInteger();
			public ActivityParameterNode DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node = new ActivityParameterNode();
				public LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger96 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97_LiteralBoolean98 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97_LiteralInteger99 = new LiteralInteger();
		public Activity DelegationConnectors_P_P_instantiate_A_Empty_Pattern = new Activity();
			public ObjectFlow DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100_LiteralBoolean101 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100_LiteralInteger102 = new LiteralInteger();
			public CreateObjectAction DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern = new CreateObjectAction();
				public OutputPin DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural103 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger104 = new LiteralInteger();
			public ActivityParameterNode DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node = new ActivityParameterNode();
			public CallOperationAction DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_ = new CallOperationAction();
				public InputPin DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target = new InputPin();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger105 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural106 = new LiteralUnlimitedNatural();
				public OutputPin DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger107 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural108 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger109 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110_LiteralBoolean111 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110_LiteralInteger112 = new LiteralInteger();
			public Parameter DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern = new Parameter();
		public Class_ DelegationConnectors_P_P_A_Unconnected_Pattern = new Class_();
			public Port DelegationConnectors_P_P_A_Unconnected_Pattern_p = new Port();
				public LiteralInteger DelegationConnectors_P_P_A_Unconnected_Pattern_p_LiteralInteger113 = new LiteralInteger();
				public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Unconnected_Pattern_p_LiteralUnlimitedNatural114 = new LiteralUnlimitedNatural();
			public Connector DelegationConnectors_P_P_A_Unconnected_Pattern_r = new Connector();
				public ConnectorEnd DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115 = new ConnectorEnd();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115_LiteralUnlimitedNatural116 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115_LiteralInteger117 = new LiteralInteger();
				public ConnectorEnd DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118 = new ConnectorEnd();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralUnlimitedNatural119 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralInteger120 = new LiteralInteger();
			public Operation DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern = new Operation();
				public Parameter DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result = new Parameter();
			public Property DelegationConnectors_P_P_A_Unconnected_Pattern_b = new Property();
				public LiteralInteger DelegationConnectors_P_P_A_Unconnected_Pattern_b_LiteralInteger121 = new LiteralInteger();
				public LiteralUnlimitedNatural DelegationConnectors_P_P_A_Unconnected_Pattern_b_LiteralUnlimitedNatural122 = new LiteralUnlimitedNatural();
			public Comment DelegationConnectors_P_P_A_Unconnected_Pattern_Comment123 = new Comment();
		public Activity DelegationConnectors_P_P_assert_A_Unconnected_Pattern = new Activity();
			public ActivityParameterNode DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node = new ActivityParameterNode();
				public LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger124 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125 = new ObjectFlow();
				public LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125_LiteralInteger126 = new LiteralInteger();
				public LiteralBoolean DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125_LiteralBoolean127 = new LiteralBoolean();
			public Parameter DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern = new Parameter();
			public ValueSpecificationAction DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message = new ValueSpecificationAction();
				public OutputPin DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural128 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger129 = new LiteralInteger();
				public LiteralString DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_LiteralString130 = new LiteralString();
			public CallBehaviorAction DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger131 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger132 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural133 = new LiteralUnlimitedNatural();
				public InputPin DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value = new InputPin();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger134 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger135 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural136 = new LiteralUnlimitedNatural();
		public Activity DelegationConnectors_P_P_assert_A_Star_Pattern = new Activity();
			public ValueSpecificationAction DelegationConnectors_P_P_assert_A_Star_Pattern_message = new ValueSpecificationAction();
				public LiteralString DelegationConnectors_P_P_assert_A_Star_Pattern_message_LiteralString137 = new LiteralString();
				public OutputPin DelegationConnectors_P_P_assert_A_Star_Pattern_message_result = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural138 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralInteger139 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140 = new ObjectFlow();
				public LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140_LiteralInteger141 = new LiteralInteger();
				public LiteralBoolean DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140_LiteralBoolean142 = new LiteralBoolean();
			public ActivityParameterNode DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node = new ActivityParameterNode();
				public LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger143 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine = new CallBehaviorAction();
				public InputPin DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value = new InputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural144 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger145 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger146 = new LiteralInteger();
				public OutputPin DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger147 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural148 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger149 = new LiteralInteger();
			public Parameter DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern = new Parameter();
		public Activity DelegationConnectors_P_P_instantiate_A_Star_Pattern = new Activity();
			public ObjectFlow DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150_LiteralBoolean151 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150_LiteralInteger152 = new LiteralInteger();
			public ActivityParameterNode DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node = new ActivityParameterNode();
			public Parameter DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern = new Parameter();
			public CallOperationAction DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_ = new CallOperationAction();
				public OutputPin DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural153 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger154 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger155 = new LiteralInteger();
				public InputPin DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target = new InputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural156 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger157 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158 = new ObjectFlow();
				public LiteralInteger DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158_LiteralInteger159 = new LiteralInteger();
				public LiteralBoolean DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158_LiteralBoolean160 = new LiteralBoolean();
			public CreateObjectAction DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern = new CreateObjectAction();
				public OutputPin DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger161 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural162 = new LiteralUnlimitedNatural();
		public Activity DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern = new Activity();
			public ObjectFlow DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163 = new ObjectFlow();
				public LiteralInteger DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralInteger164 = new LiteralInteger();
				public LiteralBoolean DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralBoolean165 = new LiteralBoolean();
			public ActivityParameterNode DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node = new ActivityParameterNode();
			public Parameter DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern = new Parameter();
			public ObjectFlow DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralBoolean167 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralInteger168 = new LiteralInteger();
			public CreateObjectAction DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern = new CreateObjectAction();
				public OutputPin DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural169 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger170 = new LiteralInteger();
			public CallOperationAction DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_ = new CallOperationAction();
				public InputPin DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target = new InputPin();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger171 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural172 = new LiteralUnlimitedNatural();
				public OutputPin DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural173 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger174 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger175 = new LiteralInteger();
		public Class_ DelegationConnectors_P_P_B = new Class_();
			public InterfaceRealization DelegationConnectors_P_P_B_I_Realization = new InterfaceRealization();
		public Activity DelegationConnectors_P_P_instantiate_A_Array_Pattern = new Activity();
			public ObjectFlow DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176 = new ObjectFlow();
				public LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176_LiteralInteger177 = new LiteralInteger();
				public LiteralBoolean DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176_LiteralBoolean178 = new LiteralBoolean();
			public CallOperationAction DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_ = new CallOperationAction();
				public InputPin DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target = new InputPin();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger179 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural180 = new LiteralUnlimitedNatural();
				public OutputPin DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger181 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger182 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural183 = new LiteralUnlimitedNatural();
			public CreateObjectAction DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern = new CreateObjectAction();
				public OutputPin DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result = new OutputPin();
					public LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger184 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural185 = new LiteralUnlimitedNatural();
			public Parameter DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern = new Parameter();
			public ActivityParameterNode DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node = new ActivityParameterNode();
				public LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger186 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187_LiteralBoolean188 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187_LiteralInteger189 = new LiteralInteger();

	public static DelegationConnectors_P_PModel instance()
	{
		if (instance == null)
        {
            instance = new DelegationConnectors_P_PModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public DelegationConnectors_P_PModel()
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
		this.initializeAssociation_Instances();
		this.initializeCallBehaviorAction_Instances();
		this.initializeCallOperationAction_Instances();
		this.initializeClass_Instances();
		this.initializeComment_Instances();
		this.initializeConnector_Instances();
		this.initializeConnectorEnd_Instances();
		this.initializeControlFlow_Instances();
		this.initializeCreateObjectAction_Instances();
		this.initializeInputPin_Instances();
		this.initializeInterface_Instances();
		this.initializeInterfaceRealization_Instances();
		this.initializeLiteralBoolean_Instances();
		this.initializeLiteralInteger_Instances();
		this.initializeLiteralString_Instances();
		this.initializeLiteralUnlimitedNatural_Instances();
		this.initializeObjectFlow_Instances();
		this.initializeOperation_Instances();
		this.initializeOutputPin_Instances();
		this.initializePackageImport_Instances();
		this.initializeParameter_Instances();
		this.initializePort_Instances();
		this.initializeProperty_Instances();
		this.initializeValueSpecificationAction_Instances();
	}

	private void initializeActivity_Instances()
	{
		// Activity DelegationConnectors_P_P::main
		addToElementRepository("main", DelegationConnectors_P_P_main);
		DelegationConnectors_P_P_main.setName("main");
		DelegationConnectors_P_P_main.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main.addNode(DelegationConnectors_P_P_main_instantiate_A_Array_Pattern);
		DelegationConnectors_P_P_main.addNode(DelegationConnectors_P_P_main_assert_A_Empty_Pattern);
		DelegationConnectors_P_P_main.addNode(DelegationConnectors_P_P_main_instantiate_A_Star_Pattern);
		DelegationConnectors_P_P_main.addNode(DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern);
		DelegationConnectors_P_P_main.addNode(DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern);
		DelegationConnectors_P_P_main.addNode(DelegationConnectors_P_P_main_assert_A_Array_Pattern);
		DelegationConnectors_P_P_main.addNode(DelegationConnectors_P_P_main_assert_A_Star_Pattern);
		DelegationConnectors_P_P_main.addNode(DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern);
		DelegationConnectors_P_P_main.addEdge(DelegationConnectors_P_P_main_ControlFlow23);
		DelegationConnectors_P_P_main.addEdge(DelegationConnectors_P_P_main_ControlFlow7);
		DelegationConnectors_P_P_main.addEdge(DelegationConnectors_P_P_main_ObjectFlow11);
		DelegationConnectors_P_P_main.addEdge(DelegationConnectors_P_P_main_ObjectFlow27);
		DelegationConnectors_P_P_main.addEdge(DelegationConnectors_P_P_main_ObjectFlow14);
		DelegationConnectors_P_P_main.addEdge(DelegationConnectors_P_P_main_ObjectFlow17);
		DelegationConnectors_P_P_main.addEdge(DelegationConnectors_P_P_main_ControlFlow42);
		// Activity DelegationConnectors_P_P::assert_A_Array_Pattern
		addToElementRepository("assert_A_Array_Pattern", DelegationConnectors_P_P_assert_A_Array_Pattern);
		DelegationConnectors_P_P_assert_A_Array_Pattern.setName("assert_A_Array_Pattern");
		DelegationConnectors_P_P_assert_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Array_Pattern.addOwnedParameter(DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_P_assert_A_Array_Pattern.addNode(DelegationConnectors_P_P_assert_A_Array_Pattern_message);
		DelegationConnectors_P_P_assert_A_Array_Pattern.addNode(DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine);
		DelegationConnectors_P_P_assert_A_Array_Pattern.addNode(DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node);
		DelegationConnectors_P_P_assert_A_Array_Pattern.addEdge(DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97);
		// Activity DelegationConnectors_P_P::instantiate_A_Empty_Pattern
		addToElementRepository("instantiate_A_Empty_Pattern", DelegationConnectors_P_P_instantiate_A_Empty_Pattern);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern.setName("instantiate_A_Empty_Pattern");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern.addOwnedParameter(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern.addNode(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern.addNode(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern.addNode(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern.addEdge(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern.addEdge(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110);
		// Activity DelegationConnectors_P_P::assert_A_Unconnected_Pattern
		addToElementRepository("assert_A_Unconnected_Pattern", DelegationConnectors_P_P_assert_A_Unconnected_Pattern);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern.setName("assert_A_Unconnected_Pattern");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern.addOwnedParameter(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern.addNode(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern.addNode(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern.addNode(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern.addEdge(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125);
		// Activity DelegationConnectors_P_P::assert_A_Star_Pattern
		addToElementRepository("assert_A_Star_Pattern", DelegationConnectors_P_P_assert_A_Star_Pattern);
		DelegationConnectors_P_P_assert_A_Star_Pattern.setName("assert_A_Star_Pattern");
		DelegationConnectors_P_P_assert_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Star_Pattern.addOwnedParameter(DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_P_assert_A_Star_Pattern.addNode(DelegationConnectors_P_P_assert_A_Star_Pattern_message);
		DelegationConnectors_P_P_assert_A_Star_Pattern.addNode(DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node);
		DelegationConnectors_P_P_assert_A_Star_Pattern.addNode(DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine);
		DelegationConnectors_P_P_assert_A_Star_Pattern.addEdge(DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140);
		// Activity DelegationConnectors_P_P::instantiate_A_Star_Pattern
		addToElementRepository("instantiate_A_Star_Pattern", DelegationConnectors_P_P_instantiate_A_Star_Pattern);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern.setName("instantiate_A_Star_Pattern");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Star_Pattern.addOwnedParameter(DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern.addNode(DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern.addNode(DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern.addNode(DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern.addEdge(DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern.addEdge(DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158);
		// Activity DelegationConnectors_P_P::assert_A_Empty_Pattern
		addToElementRepository("assert_A_Empty_Pattern", DelegationConnectors_P_P_assert_A_Empty_Pattern);
		DelegationConnectors_P_P_assert_A_Empty_Pattern.setName("assert_A_Empty_Pattern");
		DelegationConnectors_P_P_assert_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Empty_Pattern.addOwnedParameter(DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_P_assert_A_Empty_Pattern.addNode(DelegationConnectors_P_P_assert_A_Empty_Pattern_message);
		DelegationConnectors_P_P_assert_A_Empty_Pattern.addNode(DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node);
		DelegationConnectors_P_P_assert_A_Empty_Pattern.addNode(DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine);
		DelegationConnectors_P_P_assert_A_Empty_Pattern.addEdge(DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62);
		// Activity DelegationConnectors_P_P::instantiate_A_Unconnected_Pattern
		addToElementRepository("instantiate_A_Unconnected_Pattern", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern.setName("instantiate_A_Unconnected_Pattern");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern.addOwnedParameter(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern.addNode(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern.addNode(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern.addNode(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern.addEdge(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern.addEdge(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166);
		// Activity DelegationConnectors_P_P::instantiate_A_Array_Pattern
		addToElementRepository("instantiate_A_Array_Pattern", DelegationConnectors_P_P_instantiate_A_Array_Pattern);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern.setName("instantiate_A_Array_Pattern");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Array_Pattern.addOwnedParameter(DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern.addNode(DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern.addNode(DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern.addNode(DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern.addEdge(DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern.addEdge(DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode DelegationConnectors_P_P_instantiate_A_Star_Pattern::a_Star_Pattern_node
		addToElementRepository("a_Star_Pattern_node", DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node.setName("a_Star_Pattern_node");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node.setParameter(DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern);
		// ActivityParameterNode DelegationConnectors_P_P_assert_A_Unconnected_Pattern::a_Unconnected_Pattern_node
		addToElementRepository("a_Unconnected_Pattern_node", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setName("a_Unconnected_Pattern_node");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setParameter(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// ActivityParameterNode DelegationConnectors_P_P_instantiate_A_Empty_Pattern::a_Empty_Pattern_node
		addToElementRepository("a_Empty_Pattern_node", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setName("a_Empty_Pattern_node");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setParameter(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		// ActivityParameterNode DelegationConnectors_P_P_assert_A_Empty_Pattern::a_Empty_Pattern_node
		addToElementRepository("a_Empty_Pattern_node", DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node.setName("a_Empty_Pattern_node");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node.setParameter(DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern);
		// ActivityParameterNode DelegationConnectors_P_P_assert_A_Star_Pattern::a_Star_Pattern_node
		addToElementRepository("a_Star_Pattern_node", DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node);
		DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node.setName("a_Star_Pattern_node");
		DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node.setParameter(DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern);
		// ActivityParameterNode DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern_node
		addToElementRepository("a_Unconnected_Pattern_node", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setName("a_Unconnected_Pattern_node");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setParameter(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// ActivityParameterNode DelegationConnectors_P_P_assert_A_Array_Pattern::a_Array_Pattern_node
		addToElementRepository("a_Array_Pattern_node", DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node);
		DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node.setName("a_Array_Pattern_node");
		DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node.setParameter(DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern);
		// ActivityParameterNode DelegationConnectors_P_P_instantiate_A_Array_Pattern::a_Array_Pattern_node
		addToElementRepository("a_Array_Pattern_node", DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node.setName("a_Array_Pattern_node");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node.setParameter(DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern);
	}

	private void initializeAssociation_Instances()
	{
		// Association DelegationConnectors_P_P::R
		addToElementRepository("R", DelegationConnectors_P_P_R);
		DelegationConnectors_P_P_R.setName("R");
		DelegationConnectors_P_P_R.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_R.addOwnedEnd(DelegationConnectors_P_P_R_x);
		DelegationConnectors_P_P_R.addOwnedEnd(DelegationConnectors_P_P_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction DelegationConnectors_P_P_main::instantiate_A_Array_Pattern
		addToElementRepository("instantiate_A_Array_Pattern", DelegationConnectors_P_P_main_instantiate_A_Array_Pattern);
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern.setName("instantiate_A_Array_Pattern");
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern.addResult(DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern.setBehavior(DelegationConnectors_P_P_instantiate_A_Array_Pattern);
		// CallBehaviorAction DelegationConnectors_P_P_main::assert_A_Empty_Pattern
		addToElementRepository("assert_A_Empty_Pattern", DelegationConnectors_P_P_main_assert_A_Empty_Pattern);
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern.setName("assert_A_Empty_Pattern");
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern.setBehavior(DelegationConnectors_P_P_assert_A_Empty_Pattern);
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern.addArgument(DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		// CallBehaviorAction DelegationConnectors_P_P_main::instantiate_A_Star_Pattern
		addToElementRepository("instantiate_A_Star_Pattern", DelegationConnectors_P_P_main_instantiate_A_Star_Pattern);
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern.setName("instantiate_A_Star_Pattern");
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern.addResult(DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern.setBehavior(DelegationConnectors_P_P_instantiate_A_Star_Pattern);
		// CallBehaviorAction DelegationConnectors_P_P_main::instantiate_A_Unconnected_Pattern
		addToElementRepository("instantiate_A_Unconnected_Pattern", DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern);
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern.setName("instantiate_A_Unconnected_Pattern");
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern.addResult(DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern.setBehavior(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern);
		// CallBehaviorAction DelegationConnectors_P_P_assert_A_Star_Pattern::writeLine
		addToElementRepository("writeLine", DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine.setName("writeLine");
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine.addResult(DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine.addArgument(DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value);
		// CallBehaviorAction DelegationConnectors_P_P_main::assert_A_Unconnected_Pattern
		addToElementRepository("assert_A_Unconnected_Pattern", DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern);
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern.setName("assert_A_Unconnected_Pattern");
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern.setBehavior(DelegationConnectors_P_P_assert_A_Unconnected_Pattern);
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern.addArgument(DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// CallBehaviorAction DelegationConnectors_P_P_main::assert_A_Star_Pattern
		addToElementRepository("assert_A_Star_Pattern", DelegationConnectors_P_P_main_assert_A_Star_Pattern);
		DelegationConnectors_P_P_main_assert_A_Star_Pattern.setName("assert_A_Star_Pattern");
		DelegationConnectors_P_P_main_assert_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Star_Pattern.setBehavior(DelegationConnectors_P_P_assert_A_Star_Pattern);
		DelegationConnectors_P_P_main_assert_A_Star_Pattern.addArgument(DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern);
		// CallBehaviorAction DelegationConnectors_P_P_main::assert_A_Array_Pattern
		addToElementRepository("assert_A_Array_Pattern", DelegationConnectors_P_P_main_assert_A_Array_Pattern);
		DelegationConnectors_P_P_main_assert_A_Array_Pattern.setName("assert_A_Array_Pattern");
		DelegationConnectors_P_P_main_assert_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Array_Pattern.setBehavior(DelegationConnectors_P_P_assert_A_Array_Pattern);
		DelegationConnectors_P_P_main_assert_A_Array_Pattern.addArgument(DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern);
		// CallBehaviorAction DelegationConnectors_P_P_assert_A_Empty_Pattern::writeLine
		addToElementRepository("writeLine", DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine.setName("writeLine");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine.addResult(DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine.addArgument(DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value);
		// CallBehaviorAction DelegationConnectors_P_P_assert_A_Array_Pattern::writeLine
		addToElementRepository("writeLine", DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine.setName("writeLine");
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine.addResult(DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine.addArgument(DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value);
		// CallBehaviorAction DelegationConnectors_P_P_main::instantiate_A_Empty_Pattern
		addToElementRepository("instantiate_A_Empty_Pattern", DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern);
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern.setName("instantiate_A_Empty_Pattern");
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern.addResult(DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern.setBehavior(DelegationConnectors_P_P_instantiate_A_Empty_Pattern);
		// CallBehaviorAction DelegationConnectors_P_P_assert_A_Unconnected_Pattern::writeLine
		addToElementRepository("writeLine", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine.setName("writeLine");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine.addResult(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine.addArgument(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction DelegationConnectors_P_P_instantiate_A_Empty_Pattern::A_Empty_Pattern()
		addToElementRepository("A_Empty_Pattern()", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setName("A_Empty_Pattern()");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.addResult(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setOperation(DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setTarget(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		// CallOperationAction DelegationConnectors_P_P_instantiate_A_Star_Pattern::A_Star_Pattern()
		addToElementRepository("A_Star_Pattern()", DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_.setName("A_Star_Pattern()");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_.addResult(DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_.setOperation(DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_.setTarget(DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		// CallOperationAction DelegationConnectors_P_P_instantiate_A_Array_Pattern::A_Array_Pattern()
		addToElementRepository("A_Array_Pattern()", DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_.setName("A_Array_Pattern()");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_.addResult(DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_.setOperation(DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_.setTarget(DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		// CallOperationAction DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern::A_Unconnected_Pattern()
		addToElementRepository("A_Unconnected_Pattern()", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setName("A_Unconnected_Pattern()");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.addResult(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setOperation(DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setTarget(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
	}

	private void initializeClass_Instances()
	{
		// Class DelegationConnectors_P_P::A_Star_Pattern
		addToElementRepository("A_Star_Pattern", DelegationConnectors_P_P_A_Star_Pattern);
		DelegationConnectors_P_P_A_Star_Pattern.setName("A_Star_Pattern");
		DelegationConnectors_P_P_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_A_Star_Pattern.addOwnedAttribute(DelegationConnectors_P_P_A_Star_Pattern_b);
		DelegationConnectors_P_P_A_Star_Pattern.addOwnedAttribute(DelegationConnectors_P_P_A_Star_Pattern_p);
		
		DelegationConnectors_P_P_A_Star_Pattern.addOwnedConnector(DelegationConnectors_P_P_A_Star_Pattern_r);
		DelegationConnectors_P_P_A_Star_Pattern.addOwnedOperation(DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		// Class DelegationConnectors_P_P::IImpl
		addToElementRepository("IImpl", DelegationConnectors_P_P_IImpl);
		DelegationConnectors_P_P_IImpl.setName("IImpl");
		DelegationConnectors_P_P_IImpl.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_IImpl.addInterfaceRealization(DelegationConnectors_P_P_IImpl_I_Realization);
		// Class DelegationConnectors_P_P::A_Unconnected_Pattern
		addToElementRepository("A_Unconnected_Pattern", DelegationConnectors_P_P_A_Unconnected_Pattern);
		DelegationConnectors_P_P_A_Unconnected_Pattern.setName("A_Unconnected_Pattern");
		DelegationConnectors_P_P_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_A_Unconnected_Pattern.addOwnedAttribute(DelegationConnectors_P_P_A_Unconnected_Pattern_b);
		DelegationConnectors_P_P_A_Unconnected_Pattern.addOwnedAttribute(DelegationConnectors_P_P_A_Unconnected_Pattern_p);
		
		DelegationConnectors_P_P_A_Unconnected_Pattern.addOwnedConnector(DelegationConnectors_P_P_A_Unconnected_Pattern_r);
		DelegationConnectors_P_P_A_Unconnected_Pattern.addOwnedOperation(DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		// Class DelegationConnectors_P_P::A_Array_Pattern
		addToElementRepository("A_Array_Pattern", DelegationConnectors_P_P_A_Array_Pattern);
		DelegationConnectors_P_P_A_Array_Pattern.setName("A_Array_Pattern");
		DelegationConnectors_P_P_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_A_Array_Pattern.addOwnedAttribute(DelegationConnectors_P_P_A_Array_Pattern_b);
		DelegationConnectors_P_P_A_Array_Pattern.addOwnedAttribute(DelegationConnectors_P_P_A_Array_Pattern_p);
		
		DelegationConnectors_P_P_A_Array_Pattern.addOwnedConnector(DelegationConnectors_P_P_A_Array_Pattern_r);
		DelegationConnectors_P_P_A_Array_Pattern.addOwnedOperation(DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		// Class DelegationConnectors_P_P::A_Empty_Pattern
		addToElementRepository("A_Empty_Pattern", DelegationConnectors_P_P_A_Empty_Pattern);
		DelegationConnectors_P_P_A_Empty_Pattern.setName("A_Empty_Pattern");
		DelegationConnectors_P_P_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_A_Empty_Pattern.addOwnedAttribute(DelegationConnectors_P_P_A_Empty_Pattern_b);
		DelegationConnectors_P_P_A_Empty_Pattern.addOwnedAttribute(DelegationConnectors_P_P_A_Empty_Pattern_p);
		
		DelegationConnectors_P_P_A_Empty_Pattern.addOwnedConnector(DelegationConnectors_P_P_A_Empty_Pattern_r);
		DelegationConnectors_P_P_A_Empty_Pattern.addOwnedOperation(DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		// Class DelegationConnectors_P_P::B
		addToElementRepository("B", DelegationConnectors_P_P_B);
		DelegationConnectors_P_P_B.setName("B");
		DelegationConnectors_P_P_B.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_B.addInterfaceRealization(DelegationConnectors_P_P_B_I_Realization);
	}

	private void initializeComment_Instances()
	{
		// Comment DelegationConnectors_P_P::Comment75
		addToElementRepository("Comment75", DelegationConnectors_P_P_Comment75);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment DelegationConnectors_P_P_A_Empty_Pattern::Comment56
		addToElementRepository("Comment56", DelegationConnectors_P_P_A_Empty_Pattern_Comment56);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment DelegationConnectors_P_P_A_Unconnected_Pattern::Comment123
		addToElementRepository("Comment123", DelegationConnectors_P_P_A_Unconnected_Pattern_Comment123);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment DelegationConnectors_P_P_A_Star_Pattern::Comment86
		addToElementRepository("Comment86", DelegationConnectors_P_P_A_Star_Pattern_Comment86);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment DelegationConnectors_P_P_A_Array_Pattern::Comment51
		addToElementRepository("Comment51", DelegationConnectors_P_P_A_Array_Pattern_Comment51);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector DelegationConnectors_P_P_A_Array_Pattern::r
		addToElementRepository("r", DelegationConnectors_P_P_A_Array_Pattern_r);
		DelegationConnectors_P_P_A_Array_Pattern_r.setName("r");
		DelegationConnectors_P_P_A_Array_Pattern_r.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Array_Pattern_r.addEnd(DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd45);
		DelegationConnectors_P_P_A_Array_Pattern_r.addEnd(DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd43);
		DelegationConnectors_P_P_A_Array_Pattern_r.setType(DelegationConnectors_P_P_R);
		// Connector DelegationConnectors_P_P_A_Unconnected_Pattern::r
		addToElementRepository("r", DelegationConnectors_P_P_A_Unconnected_Pattern_r);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r.setName("r");
		DelegationConnectors_P_P_A_Unconnected_Pattern_r.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r.addEnd(DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r.addEnd(DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r.setType(DelegationConnectors_P_P_R);
		// Connector DelegationConnectors_P_P_A_Star_Pattern::r
		addToElementRepository("r", DelegationConnectors_P_P_A_Star_Pattern_r);
		DelegationConnectors_P_P_A_Star_Pattern_r.setName("r");
		DelegationConnectors_P_P_A_Star_Pattern_r.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Star_Pattern_r.addEnd(DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83);
		DelegationConnectors_P_P_A_Star_Pattern_r.addEnd(DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80);
		DelegationConnectors_P_P_A_Star_Pattern_r.setType(DelegationConnectors_P_P_R);
		// Connector DelegationConnectors_P_P_A_Empty_Pattern::r
		addToElementRepository("r", DelegationConnectors_P_P_A_Empty_Pattern_r);
		DelegationConnectors_P_P_A_Empty_Pattern_r.setName("r");
		DelegationConnectors_P_P_A_Empty_Pattern_r.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Empty_Pattern_r.addEnd(DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd57);
		DelegationConnectors_P_P_A_Empty_Pattern_r.addEnd(DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd59);
		DelegationConnectors_P_P_A_Empty_Pattern_r.setType(DelegationConnectors_P_P_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd DelegationConnectors_P_P_A_Unconnected_Pattern_r::ConnectorEnd115
		addToElementRepository("ConnectorEnd115", DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115.setUpper(-1);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115.setLower(0);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115.setRole(DelegationConnectors_P_P_A_Unconnected_Pattern_p);
		// ConnectorEnd DelegationConnectors_P_P_A_Array_Pattern_r::ConnectorEnd43
		addToElementRepository("ConnectorEnd43", DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd43);
		DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd43.setUpper(-1);
		DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd43.setRole(DelegationConnectors_P_P_A_Array_Pattern_b);
		// ConnectorEnd DelegationConnectors_P_P_A_Star_Pattern_r::ConnectorEnd80
		addToElementRepository("ConnectorEnd80", DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80.setUpper(-1);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80.setLower(4);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80.setRole(DelegationConnectors_P_P_A_Star_Pattern_b);
		// ConnectorEnd DelegationConnectors_P_P_A_Empty_Pattern_r::ConnectorEnd57
		addToElementRepository("ConnectorEnd57", DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd57);
		DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd57.setUpper(-1);
		DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd57.setRole(DelegationConnectors_P_P_A_Empty_Pattern_p);
		// ConnectorEnd DelegationConnectors_P_P_A_Unconnected_Pattern_r::ConnectorEnd118
		addToElementRepository("ConnectorEnd118", DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118.setUpper(-1);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118.setLower(0);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118.setRole(DelegationConnectors_P_P_A_Unconnected_Pattern_b);
		// ConnectorEnd DelegationConnectors_P_P_A_Star_Pattern_r::ConnectorEnd83
		addToElementRepository("ConnectorEnd83", DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83.setUpper(-1);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83.setLower(3);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83.setRole(DelegationConnectors_P_P_A_Star_Pattern_p);
		// ConnectorEnd DelegationConnectors_P_P_A_Empty_Pattern_r::ConnectorEnd59
		addToElementRepository("ConnectorEnd59", DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd59);
		DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd59.setUpper(-1);
		DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd59.setRole(DelegationConnectors_P_P_A_Empty_Pattern_b);
		// ConnectorEnd DelegationConnectors_P_P_A_Array_Pattern_r::ConnectorEnd45
		addToElementRepository("ConnectorEnd45", DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd45);
		DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd45.setUpper(-1);
		DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd45.setRole(DelegationConnectors_P_P_A_Array_Pattern_p);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow DelegationConnectors_P_P_main::ControlFlow23
		addToElementRepository("ControlFlow23", DelegationConnectors_P_P_main_ControlFlow23);
		DelegationConnectors_P_P_main_ControlFlow23.setName("ControlFlow23");
		DelegationConnectors_P_P_main_ControlFlow23.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_main_ControlFlow23.setSource(DelegationConnectors_P_P_main_assert_A_Empty_Pattern);
		DelegationConnectors_P_P_main_ControlFlow23.setTarget(DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern);
		// ControlFlow DelegationConnectors_P_P_main::ControlFlow7
		addToElementRepository("ControlFlow7", DelegationConnectors_P_P_main_ControlFlow7);
		DelegationConnectors_P_P_main_ControlFlow7.setName("ControlFlow7");
		DelegationConnectors_P_P_main_ControlFlow7.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_main_ControlFlow7.setSource(DelegationConnectors_P_P_main_assert_A_Array_Pattern);
		DelegationConnectors_P_P_main_ControlFlow7.setTarget(DelegationConnectors_P_P_main_instantiate_A_Star_Pattern);
		// ControlFlow DelegationConnectors_P_P_main::ControlFlow42
		addToElementRepository("ControlFlow42", DelegationConnectors_P_P_main_ControlFlow42);
		DelegationConnectors_P_P_main_ControlFlow42.setName("ControlFlow42");
		DelegationConnectors_P_P_main_ControlFlow42.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_main_ControlFlow42.setSource(DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern);
		DelegationConnectors_P_P_main_ControlFlow42.setTarget(DelegationConnectors_P_P_main_instantiate_A_Array_Pattern);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction DelegationConnectors_P_P_instantiate_A_Empty_Pattern::Create A_Empty_Pattern
		addToElementRepository("Create A_Empty_Pattern", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setName("Create A_Empty_Pattern");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setClassifier(DelegationConnectors_P_P_A_Empty_Pattern);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setResult(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		// CreateObjectAction DelegationConnectors_P_P_instantiate_A_Array_Pattern::Create A_Array_Pattern
		addToElementRepository("Create A_Array_Pattern", DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setName("Create A_Array_Pattern");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setClassifier(DelegationConnectors_P_P_A_Array_Pattern);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setResult(DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		// CreateObjectAction DelegationConnectors_P_P_instantiate_A_Star_Pattern::Create A_Star_Pattern
		addToElementRepository("Create A_Star_Pattern", DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setName("Create A_Star_Pattern");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setClassifier(DelegationConnectors_P_P_A_Star_Pattern);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setResult(DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		// CreateObjectAction DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern::Create A_Unconnected_Pattern
		addToElementRepository("Create A_Unconnected_Pattern", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setName("Create A_Unconnected_Pattern");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setClassifier(DelegationConnectors_P_P_A_Unconnected_Pattern);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setResult(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine::value
		addToElementRepository("value", DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value.setName("value");
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine::value
		addToElementRepository("value", DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value.setName("value");
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine::value
		addToElementRepository("value", DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value.setName("value");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(DelegationConnectors_P_P_A_Unconnected_Pattern);
		// InputPin DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()::target
		addToElementRepository("target", DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target.setName("target");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target.setType(DelegationConnectors_P_P_A_Star_Pattern);
		// InputPin DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()::target
		addToElementRepository("target", DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target.setName("target");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target.setType(DelegationConnectors_P_P_A_Array_Pattern);
		// InputPin DelegationConnectors_P_P_main_assert_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern.setType(DelegationConnectors_P_P_A_Star_Pattern);
		// InputPin DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine::value
		addToElementRepository("value", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value.setName("value");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()::target
		addToElementRepository("target", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setName("target");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setType(DelegationConnectors_P_P_A_Unconnected_Pattern);
		// InputPin DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()::target
		addToElementRepository("target", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setName("target");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setType(DelegationConnectors_P_P_A_Empty_Pattern);
		// InputPin DelegationConnectors_P_P_main_assert_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern.setType(DelegationConnectors_P_P_A_Empty_Pattern);
		// InputPin DelegationConnectors_P_P_main_assert_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern.setType(DelegationConnectors_P_P_A_Array_Pattern);
	}

	private void initializeInterface_Instances()
	{
		// Interface DelegationConnectors_P_P::I
		addToElementRepository("I", DelegationConnectors_P_P_I);
		DelegationConnectors_P_P_I.setName("I");
		DelegationConnectors_P_P_I.setVisibility(VisibilityKind.public_);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization DelegationConnectors_P_P_B::I_Realization
		addToElementRepository("I_Realization", DelegationConnectors_P_P_B_I_Realization);
		DelegationConnectors_P_P_B_I_Realization.setName("I_Realization");
		DelegationConnectors_P_P_B_I_Realization.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_B_I_Realization.setContract(DelegationConnectors_P_P_I);
		// InterfaceRealization DelegationConnectors_P_P_IImpl::I_Realization
		addToElementRepository("I_Realization", DelegationConnectors_P_P_IImpl_I_Realization);
		DelegationConnectors_P_P_IImpl_I_Realization.setName("I_Realization");
		DelegationConnectors_P_P_IImpl_I_Realization.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_IImpl_I_Realization.setContract(DelegationConnectors_P_P_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187::LiteralBoolean188
		addToElementRepository("LiteralBoolean188", DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187_LiteralBoolean188);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187_LiteralBoolean188.setName("LiteralBoolean188");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187_LiteralBoolean188.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187_LiteralBoolean188.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_main_ObjectFlow17::LiteralBoolean18
		addToElementRepository("LiteralBoolean18", DelegationConnectors_P_P_main_ObjectFlow17_LiteralBoolean18);
		DelegationConnectors_P_P_main_ObjectFlow17_LiteralBoolean18.setName("LiteralBoolean18");
		DelegationConnectors_P_P_main_ObjectFlow17_LiteralBoolean18.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_ObjectFlow17_LiteralBoolean18.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158::LiteralBoolean160
		addToElementRepository("LiteralBoolean160", DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158_LiteralBoolean160);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158_LiteralBoolean160.setName("LiteralBoolean160");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158_LiteralBoolean160.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158_LiteralBoolean160.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_main_ObjectFlow27::LiteralBoolean28
		addToElementRepository("LiteralBoolean28", DelegationConnectors_P_P_main_ObjectFlow27_LiteralBoolean28);
		DelegationConnectors_P_P_main_ObjectFlow27_LiteralBoolean28.setName("LiteralBoolean28");
		DelegationConnectors_P_P_main_ObjectFlow27_LiteralBoolean28.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_ObjectFlow27_LiteralBoolean28.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_main_ObjectFlow11::LiteralBoolean12
		addToElementRepository("LiteralBoolean12", DelegationConnectors_P_P_main_ObjectFlow11_LiteralBoolean12);
		DelegationConnectors_P_P_main_ObjectFlow11_LiteralBoolean12.setName("LiteralBoolean12");
		DelegationConnectors_P_P_main_ObjectFlow11_LiteralBoolean12.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_ObjectFlow11_LiteralBoolean12.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163::LiteralBoolean165
		addToElementRepository("LiteralBoolean165", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralBoolean165);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralBoolean165.setName("LiteralBoolean165");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralBoolean165.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralBoolean165.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140::LiteralBoolean142
		addToElementRepository("LiteralBoolean142", DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140_LiteralBoolean142);
		DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140_LiteralBoolean142.setName("LiteralBoolean142");
		DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140_LiteralBoolean142.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140_LiteralBoolean142.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166::LiteralBoolean167
		addToElementRepository("LiteralBoolean167", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralBoolean167);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralBoolean167.setName("LiteralBoolean167");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralBoolean167.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralBoolean167.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176::LiteralBoolean178
		addToElementRepository("LiteralBoolean178", DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176_LiteralBoolean178);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176_LiteralBoolean178.setName("LiteralBoolean178");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176_LiteralBoolean178.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176_LiteralBoolean178.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125::LiteralBoolean127
		addToElementRepository("LiteralBoolean127", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125_LiteralBoolean127);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125_LiteralBoolean127.setName("LiteralBoolean127");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125_LiteralBoolean127.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125_LiteralBoolean127.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100::LiteralBoolean101
		addToElementRepository("LiteralBoolean101", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100_LiteralBoolean101);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100_LiteralBoolean101.setName("LiteralBoolean101");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100_LiteralBoolean101.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100_LiteralBoolean101.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110::LiteralBoolean111
		addToElementRepository("LiteralBoolean111", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110_LiteralBoolean111);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110_LiteralBoolean111.setName("LiteralBoolean111");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110_LiteralBoolean111.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110_LiteralBoolean111.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150::LiteralBoolean151
		addToElementRepository("LiteralBoolean151", DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150_LiteralBoolean151);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150_LiteralBoolean151.setName("LiteralBoolean151");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150_LiteralBoolean151.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150_LiteralBoolean151.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97::LiteralBoolean98
		addToElementRepository("LiteralBoolean98", DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97_LiteralBoolean98);
		DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97_LiteralBoolean98.setName("LiteralBoolean98");
		DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97_LiteralBoolean98.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97_LiteralBoolean98.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62::LiteralBoolean63
		addToElementRepository("LiteralBoolean63", DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62_LiteralBoolean63);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62_LiteralBoolean63.setName("LiteralBoolean63");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62_LiteralBoolean63.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62_LiteralBoolean63.setValue(true);
		// LiteralBoolean DelegationConnectors_P_P_main_ObjectFlow14::LiteralBoolean16
		addToElementRepository("LiteralBoolean16", DelegationConnectors_P_P_main_ObjectFlow14_LiteralBoolean16);
		DelegationConnectors_P_P_main_ObjectFlow14_LiteralBoolean16.setName("LiteralBoolean16");
		DelegationConnectors_P_P_main_ObjectFlow14_LiteralBoolean16.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_ObjectFlow14_LiteralBoolean16.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralInteger69
		addToElementRepository("LiteralInteger69", DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger69);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger69.setName("LiteralInteger69");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger69.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger69.setValue(0);
		// LiteralInteger DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralInteger20
		addToElementRepository("LiteralInteger20", DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger20);
		DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger20.setName("LiteralInteger20");
		DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger20.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger20.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80::LiteralInteger81
		addToElementRepository("LiteralInteger81", DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80_LiteralInteger81);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80_LiteralInteger81.setName("LiteralInteger81");
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80_LiteralInteger81.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80_LiteralInteger81.setValue(4);
		// LiteralInteger DelegationConnectors_P_P_A_Empty_Pattern_p::LiteralInteger55
		addToElementRepository("LiteralInteger55", DelegationConnectors_P_P_A_Empty_Pattern_p_LiteralInteger55);
		DelegationConnectors_P_P_A_Empty_Pattern_p_LiteralInteger55.setName("LiteralInteger55");
		DelegationConnectors_P_P_A_Empty_Pattern_p_LiteralInteger55.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Empty_Pattern_p_LiteralInteger55.setValue(0);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node::LiteralInteger96
		addToElementRepository("LiteralInteger96", DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger96);
		DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger96.setName("LiteralInteger96");
		DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger96.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger96.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralInteger109
		addToElementRepository("LiteralInteger109", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger109);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger109.setName("LiteralInteger109");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger109.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger109.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus::LiteralInteger149
		addToElementRepository("LiteralInteger149", DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger149);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger149.setName("LiteralInteger149");
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger149.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger149.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node::LiteralInteger143
		addToElementRepository("LiteralInteger143", DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger143);
		DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger143.setName("LiteralInteger143");
		DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger143.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger143.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_ObjectFlow11::LiteralInteger13
		addToElementRepository("LiteralInteger13", DelegationConnectors_P_P_main_ObjectFlow11_LiteralInteger13);
		DelegationConnectors_P_P_main_ObjectFlow11_LiteralInteger13.setName("LiteralInteger13");
		DelegationConnectors_P_P_main_ObjectFlow11_LiteralInteger13.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_ObjectFlow11_LiteralInteger13.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187::LiteralInteger189
		addToElementRepository("LiteralInteger189", DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187_LiteralInteger189);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187_LiteralInteger189.setName("LiteralInteger189");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187_LiteralInteger189.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187_LiteralInteger189.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralInteger181
		addToElementRepository("LiteralInteger181", DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger181);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger181.setName("LiteralInteger181");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger181.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger181.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger39
		addToElementRepository("LiteralInteger39", DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger39);
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger39.setName("LiteralInteger39");
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger39.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger39.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralInteger107
		addToElementRepository("LiteralInteger107", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger107);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger107.setName("LiteralInteger107");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger107.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger107.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus::LiteralInteger147
		addToElementRepository("LiteralInteger147", DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger147);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger147.setName("LiteralInteger147");
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger147.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger147.setValue(0);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node::LiteralInteger68
		addToElementRepository("LiteralInteger68", DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger68);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger68.setName("LiteralInteger68");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger68.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger68.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_ObjectFlow27::LiteralInteger29
		addToElementRepository("LiteralInteger29", DelegationConnectors_P_P_main_ObjectFlow27_LiteralInteger29);
		DelegationConnectors_P_P_main_ObjectFlow27_LiteralInteger29.setName("LiteralInteger29");
		DelegationConnectors_P_P_main_ObjectFlow27_LiteralInteger29.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_ObjectFlow27_LiteralInteger29.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralInteger21
		addToElementRepository("LiteralInteger21", DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger21);
		DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger21.setName("LiteralInteger21");
		DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger21.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger21.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163::LiteralInteger164
		addToElementRepository("LiteralInteger164", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralInteger164);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralInteger164.setName("LiteralInteger164");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralInteger164.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralInteger164.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97::LiteralInteger99
		addToElementRepository("LiteralInteger99", DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97_LiteralInteger99);
		DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97_LiteralInteger99.setName("LiteralInteger99");
		DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97_LiteralInteger99.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97_LiteralInteger99.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralInteger132
		addToElementRepository("LiteralInteger132", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger132);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger132.setName("LiteralInteger132");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger132.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger132.setValue(0);
		// LiteralInteger DelegationConnectors_P_P_R_x::LiteralInteger3
		addToElementRepository("LiteralInteger3", DelegationConnectors_P_P_R_x_LiteralInteger3);
		DelegationConnectors_P_P_R_x_LiteralInteger3.setName("LiteralInteger3");
		DelegationConnectors_P_P_R_x_LiteralInteger3.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_R_x_LiteralInteger3.setValue(0);
		// LiteralInteger DelegationConnectors_P_P_A_Star_Pattern_b::LiteralInteger79
		addToElementRepository("LiteralInteger79", DelegationConnectors_P_P_A_Star_Pattern_b_LiteralInteger79);
		DelegationConnectors_P_P_A_Star_Pattern_b_LiteralInteger79.setName("LiteralInteger79");
		DelegationConnectors_P_P_A_Star_Pattern_b_LiteralInteger79.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Star_Pattern_b_LiteralInteger79.setValue(4);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166::LiteralInteger168
		addToElementRepository("LiteralInteger168", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralInteger168);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralInteger168.setName("LiteralInteger168");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralInteger168.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralInteger168.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus::LiteralInteger93
		addToElementRepository("LiteralInteger93", DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger93);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger93.setName("LiteralInteger93");
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger93.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger93.setValue(0);
		// LiteralInteger DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118::LiteralInteger120
		addToElementRepository("LiteralInteger120", DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralInteger120);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralInteger120.setName("LiteralInteger120");
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralInteger120.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralInteger120.setValue(0);
		// LiteralInteger DelegationConnectors_P_P_A_Unconnected_Pattern_b::LiteralInteger121
		addToElementRepository("LiteralInteger121", DelegationConnectors_P_P_A_Unconnected_Pattern_b_LiteralInteger121);
		DelegationConnectors_P_P_A_Unconnected_Pattern_b_LiteralInteger121.setName("LiteralInteger121");
		DelegationConnectors_P_P_A_Unconnected_Pattern_b_LiteralInteger121.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Unconnected_Pattern_b_LiteralInteger121.setValue(2);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus::LiteralInteger95
		addToElementRepository("LiteralInteger95", DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger95);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger95.setName("LiteralInteger95");
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger95.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger95.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralInteger175
		addToElementRepository("LiteralInteger175", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger175);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger175.setName("LiteralInteger175");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger175.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger175.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110::LiteralInteger112
		addToElementRepository("LiteralInteger112", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110_LiteralInteger112);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110_LiteralInteger112.setName("LiteralInteger112");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110_LiteralInteger112.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110_LiteralInteger112.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158::LiteralInteger159
		addToElementRepository("LiteralInteger159", DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158_LiteralInteger159);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158_LiteralInteger159.setName("LiteralInteger159");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158_LiteralInteger159.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158_LiteralInteger159.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_target::LiteralInteger171
		addToElementRepository("LiteralInteger171", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger171);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger171.setName("LiteralInteger171");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger171.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger171.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create A_Array_Pattern_result::LiteralInteger184
		addToElementRepository("LiteralInteger184", DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger184);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger184.setName("LiteralInteger184");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger184.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger184.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_target::LiteralInteger105
		addToElementRepository("LiteralInteger105", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger105);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger105.setName("LiteralInteger105");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger105.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger105.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value::LiteralInteger90
		addToElementRepository("LiteralInteger90", DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger90);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger90.setName("LiteralInteger90");
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger90.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger90.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralInteger131
		addToElementRepository("LiteralInteger131", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger131);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger131.setName("LiteralInteger131");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger131.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger131.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_ObjectFlow14::LiteralInteger15
		addToElementRepository("LiteralInteger15", DelegationConnectors_P_P_main_ObjectFlow14_LiteralInteger15);
		DelegationConnectors_P_P_main_ObjectFlow14_LiteralInteger15.setName("LiteralInteger15");
		DelegationConnectors_P_P_main_ObjectFlow14_LiteralInteger15.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_ObjectFlow14_LiteralInteger15.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115::LiteralInteger117
		addToElementRepository("LiteralInteger117", DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115_LiteralInteger117);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115_LiteralInteger117.setName("LiteralInteger117");
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115_LiteralInteger117.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115_LiteralInteger117.setValue(0);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140::LiteralInteger141
		addToElementRepository("LiteralInteger141", DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140_LiteralInteger141);
		DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140_LiteralInteger141.setName("LiteralInteger141");
		DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140_LiteralInteger141.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140_LiteralInteger141.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node::LiteralInteger124
		addToElementRepository("LiteralInteger124", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger124);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger124.setName("LiteralInteger124");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger124.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger124.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100::LiteralInteger102
		addToElementRepository("LiteralInteger102", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100_LiteralInteger102);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100_LiteralInteger102.setName("LiteralInteger102");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100_LiteralInteger102.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100_LiteralInteger102.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralInteger38
		addToElementRepository("LiteralInteger38", DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger38);
		DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger38.setName("LiteralInteger38");
		DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger38.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger38.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_A_Empty_Pattern_b::LiteralInteger53
		addToElementRepository("LiteralInteger53", DelegationConnectors_P_P_A_Empty_Pattern_b_LiteralInteger53);
		DelegationConnectors_P_P_A_Empty_Pattern_b_LiteralInteger53.setName("LiteralInteger53");
		DelegationConnectors_P_P_A_Empty_Pattern_b_LiteralInteger53.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Empty_Pattern_b_LiteralInteger53.setValue(0);
		// LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger40
		addToElementRepository("LiteralInteger40", DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger40);
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger40.setName("LiteralInteger40");
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger40.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger40.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150::LiteralInteger152
		addToElementRepository("LiteralInteger152", DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150_LiteralInteger152);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150_LiteralInteger152.setName("LiteralInteger152");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150_LiteralInteger152.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150_LiteralInteger152.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result::LiteralInteger66
		addToElementRepository("LiteralInteger66", DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralInteger66);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralInteger66.setName("LiteralInteger66");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralInteger66.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralInteger66.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralInteger4
		addToElementRepository("LiteralInteger4", DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger4);
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger4.setName("LiteralInteger4");
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger4.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger4.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralInteger71
		addToElementRepository("LiteralInteger71", DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger71);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger71.setName("LiteralInteger71");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger71.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger71.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger31
		addToElementRepository("LiteralInteger31", DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger31);
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger31.setName("LiteralInteger31");
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger31.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger31.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_A_Unconnected_Pattern_p::LiteralInteger113
		addToElementRepository("LiteralInteger113", DelegationConnectors_P_P_A_Unconnected_Pattern_p_LiteralInteger113);
		DelegationConnectors_P_P_A_Unconnected_Pattern_p_LiteralInteger113.setName("LiteralInteger113");
		DelegationConnectors_P_P_A_Unconnected_Pattern_p_LiteralInteger113.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Unconnected_Pattern_p_LiteralInteger113.setValue(3);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralInteger155
		addToElementRepository("LiteralInteger155", DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger155);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger155.setName("LiteralInteger155");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger155.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger155.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralInteger8
		addToElementRepository("LiteralInteger8", DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger8);
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger8.setName("LiteralInteger8");
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger8.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger8.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value::LiteralInteger72
		addToElementRepository("LiteralInteger72", DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger72);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger72.setName("LiteralInteger72");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger72.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger72.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralInteger36
		addToElementRepository("LiteralInteger36", DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger36);
		DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger36.setName("LiteralInteger36");
		DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger36.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger36.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_message_result::LiteralInteger139
		addToElementRepository("LiteralInteger139", DelegationConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralInteger139);
		DelegationConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralInteger139.setName("LiteralInteger139");
		DelegationConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralInteger139.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralInteger139.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()_target::LiteralInteger179
		addToElementRepository("LiteralInteger179", DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger179);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger179.setName("LiteralInteger179");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger179.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger179.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_ObjectFlow17::LiteralInteger19
		addToElementRepository("LiteralInteger19", DelegationConnectors_P_P_main_ObjectFlow17_LiteralInteger19);
		DelegationConnectors_P_P_main_ObjectFlow17_LiteralInteger19.setName("LiteralInteger19");
		DelegationConnectors_P_P_main_ObjectFlow17_LiteralInteger19.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_ObjectFlow17_LiteralInteger19.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value::LiteralInteger145
		addToElementRepository("LiteralInteger145", DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger145);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger145.setName("LiteralInteger145");
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger145.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger145.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create A_Empty_Pattern_result::LiteralInteger104
		addToElementRepository("LiteralInteger104", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger104);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger104.setName("LiteralInteger104");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger104.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger104.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value::LiteralInteger146
		addToElementRepository("LiteralInteger146", DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger146);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger146.setName("LiteralInteger146");
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger146.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger146.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value::LiteralInteger134
		addToElementRepository("LiteralInteger134", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger134);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger134.setName("LiteralInteger134");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger134.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger134.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger24
		addToElementRepository("LiteralInteger24", DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger24);
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger24.setName("LiteralInteger24");
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger24.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger24.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_A_Array_Pattern_b::LiteralInteger47
		addToElementRepository("LiteralInteger47", DelegationConnectors_P_P_A_Array_Pattern_b_LiteralInteger47);
		DelegationConnectors_P_P_A_Array_Pattern_b_LiteralInteger47.setName("LiteralInteger47");
		DelegationConnectors_P_P_A_Array_Pattern_b_LiteralInteger47.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Array_Pattern_b_LiteralInteger47.setValue(4);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value::LiteralInteger135
		addToElementRepository("LiteralInteger135", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger135);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger135.setName("LiteralInteger135");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger135.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger135.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger25
		addToElementRepository("LiteralInteger25", DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger25);
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger25.setName("LiteralInteger25");
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger25.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger25.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83::LiteralInteger84
		addToElementRepository("LiteralInteger84", DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83_LiteralInteger84);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83_LiteralInteger84.setName("LiteralInteger84");
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83_LiteralInteger84.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83_LiteralInteger84.setValue(3);
		// LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger30
		addToElementRepository("LiteralInteger30", DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger30);
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger30.setName("LiteralInteger30");
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger30.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger30.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger33
		addToElementRepository("LiteralInteger33", DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger33);
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger33.setName("LiteralInteger33");
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger33.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger33.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_A_Star_Pattern_p::LiteralInteger77
		addToElementRepository("LiteralInteger77", DelegationConnectors_P_P_A_Star_Pattern_p_LiteralInteger77);
		DelegationConnectors_P_P_A_Star_Pattern_p_LiteralInteger77.setName("LiteralInteger77");
		DelegationConnectors_P_P_A_Star_Pattern_p_LiteralInteger77.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Star_Pattern_p_LiteralInteger77.setValue(3);
		// LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralInteger5
		addToElementRepository("LiteralInteger5", DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger5);
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger5.setName("LiteralInteger5");
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger5.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger5.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node::LiteralInteger186
		addToElementRepository("LiteralInteger186", DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger186);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger186.setName("LiteralInteger186");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger186.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger186.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()_target::LiteralInteger157
		addToElementRepository("LiteralInteger157", DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger157);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger157.setName("LiteralInteger157");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger157.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger157.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_R_y::LiteralInteger1
		addToElementRepository("LiteralInteger1", DelegationConnectors_P_P_R_y_LiteralInteger1);
		DelegationConnectors_P_P_R_y_LiteralInteger1.setName("LiteralInteger1");
		DelegationConnectors_P_P_R_y_LiteralInteger1.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_R_y_LiteralInteger1.setValue(0);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125::LiteralInteger126
		addToElementRepository("LiteralInteger126", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125_LiteralInteger126);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125_LiteralInteger126.setName("LiteralInteger126");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125_LiteralInteger126.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125_LiteralInteger126.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralInteger174
		addToElementRepository("LiteralInteger174", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger174);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger174.setName("LiteralInteger174");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger174.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger174.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create A_Star_Pattern_result::LiteralInteger161
		addToElementRepository("LiteralInteger161", DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger161);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger161.setName("LiteralInteger161");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger161.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger161.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralInteger154
		addToElementRepository("LiteralInteger154", DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger154);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger154.setName("LiteralInteger154");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger154.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger154.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176::LiteralInteger177
		addToElementRepository("LiteralInteger177", DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176_LiteralInteger177);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176_LiteralInteger177.setName("LiteralInteger177");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176_LiteralInteger177.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176_LiteralInteger177.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_A_Array_Pattern_p::LiteralInteger49
		addToElementRepository("LiteralInteger49", DelegationConnectors_P_P_A_Array_Pattern_p_LiteralInteger49);
		DelegationConnectors_P_P_A_Array_Pattern_p_LiteralInteger49.setName("LiteralInteger49");
		DelegationConnectors_P_P_A_Array_Pattern_p_LiteralInteger49.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Array_Pattern_p_LiteralInteger49.setValue(4);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralInteger182
		addToElementRepository("LiteralInteger182", DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger182);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger182.setName("LiteralInteger182");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger182.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger182.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62::LiteralInteger64
		addToElementRepository("LiteralInteger64", DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62_LiteralInteger64);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62_LiteralInteger64.setName("LiteralInteger64");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62_LiteralInteger64.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62_LiteralInteger64.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value::LiteralInteger73
		addToElementRepository("LiteralInteger73", DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger73);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger73.setName("LiteralInteger73");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger73.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger73.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger34
		addToElementRepository("LiteralInteger34", DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger34);
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger34.setName("LiteralInteger34");
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger34.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger34.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value::LiteralInteger92
		addToElementRepository("LiteralInteger92", DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger92);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger92.setName("LiteralInteger92");
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger92.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger92.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern_result::LiteralInteger170
		addToElementRepository("LiteralInteger170", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger170);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger170.setName("LiteralInteger170");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger170.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger170.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralInteger10
		addToElementRepository("LiteralInteger10", DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger10);
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger10.setName("LiteralInteger10");
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger10.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger10.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result::LiteralInteger129
		addToElementRepository("LiteralInteger129", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger129);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger129.setName("LiteralInteger129");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger129.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger129.setValue(1);
		// LiteralInteger DelegationConnectors_P_P_assert_A_Array_Pattern_message_result::LiteralInteger89
		addToElementRepository("LiteralInteger89", DelegationConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralInteger89);
		DelegationConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralInteger89.setName("LiteralInteger89");
		DelegationConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralInteger89.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralInteger89.setValue(1);
	}

	private void initializeLiteralString_Instances()
	{
		// LiteralString DelegationConnectors_P_P_assert_A_Array_Pattern_message::LiteralString87
		addToElementRepository("LiteralString87", DelegationConnectors_P_P_assert_A_Array_Pattern_message_LiteralString87);
		DelegationConnectors_P_P_assert_A_Array_Pattern_message_LiteralString87.setName("LiteralString87");
		DelegationConnectors_P_P_assert_A_Array_Pattern_message_LiteralString87.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_message_LiteralString87.setValue("Assertion currently not implemented for A_Array_Pattern.");
		// LiteralString DelegationConnectors_P_P_assert_A_Star_Pattern_message::LiteralString137
		addToElementRepository("LiteralString137", DelegationConnectors_P_P_assert_A_Star_Pattern_message_LiteralString137);
		DelegationConnectors_P_P_assert_A_Star_Pattern_message_LiteralString137.setName("LiteralString137");
		DelegationConnectors_P_P_assert_A_Star_Pattern_message_LiteralString137.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_message_LiteralString137.setValue("Assertion currently not implemented for A_Star_Pattern.");
		// LiteralString DelegationConnectors_P_P_assert_A_Empty_Pattern_message::LiteralString65
		addToElementRepository("LiteralString65", DelegationConnectors_P_P_assert_A_Empty_Pattern_message_LiteralString65);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message_LiteralString65.setName("LiteralString65");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message_LiteralString65.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message_LiteralString65.setValue("Assertion currently not implemented for A_Empty_Pattern.");
		// LiteralString DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message::LiteralString130
		addToElementRepository("LiteralString130", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_LiteralString130);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_LiteralString130.setName("LiteralString130");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_LiteralString130.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_LiteralString130.setValue("Assertion currently not implemented for A_Unconnected_Pattern.");
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value::LiteralUnlimitedNatural136
		addToElementRepository("LiteralUnlimitedNatural136", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural136);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural136.setName("LiteralUnlimitedNatural136");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural136.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural136.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd45::LiteralUnlimitedNatural46
		addToElementRepository("LiteralUnlimitedNatural46", DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd45_LiteralUnlimitedNatural46);
		DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd45_LiteralUnlimitedNatural46.setName("LiteralUnlimitedNatural46");
		DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd45_LiteralUnlimitedNatural46.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd45_LiteralUnlimitedNatural46.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create A_Star_Pattern_result::LiteralUnlimitedNatural162
		addToElementRepository("LiteralUnlimitedNatural162", DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural162);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural162.setName("LiteralUnlimitedNatural162");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural162.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural162.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()_target::LiteralUnlimitedNatural180
		addToElementRepository("LiteralUnlimitedNatural180", DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural180);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural180.setName("LiteralUnlimitedNatural180");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural180.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural180.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Unconnected_Pattern_b::LiteralUnlimitedNatural122
		addToElementRepository("LiteralUnlimitedNatural122", DelegationConnectors_P_P_A_Unconnected_Pattern_b_LiteralUnlimitedNatural122);
		DelegationConnectors_P_P_A_Unconnected_Pattern_b_LiteralUnlimitedNatural122.setName("LiteralUnlimitedNatural122");
		DelegationConnectors_P_P_A_Unconnected_Pattern_b_LiteralUnlimitedNatural122.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Unconnected_Pattern_b_LiteralUnlimitedNatural122.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralUnlimitedNatural37
		addToElementRepository("LiteralUnlimitedNatural37", DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural37);
		DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural37.setName("LiteralUnlimitedNatural37");
		DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural37.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural37.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115::LiteralUnlimitedNatural116
		addToElementRepository("LiteralUnlimitedNatural116", DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115_LiteralUnlimitedNatural116);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115_LiteralUnlimitedNatural116.setName("LiteralUnlimitedNatural116");
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115_LiteralUnlimitedNatural116.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd115_LiteralUnlimitedNatural116.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83::LiteralUnlimitedNatural85
		addToElementRepository("LiteralUnlimitedNatural85", DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83_LiteralUnlimitedNatural85);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83_LiteralUnlimitedNatural85.setName("LiteralUnlimitedNatural85");
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83_LiteralUnlimitedNatural85.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd83_LiteralUnlimitedNatural85.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Star_Pattern_b::LiteralUnlimitedNatural78
		addToElementRepository("LiteralUnlimitedNatural78", DelegationConnectors_P_P_A_Star_Pattern_b_LiteralUnlimitedNatural78);
		DelegationConnectors_P_P_A_Star_Pattern_b_LiteralUnlimitedNatural78.setName("LiteralUnlimitedNatural78");
		DelegationConnectors_P_P_A_Star_Pattern_b_LiteralUnlimitedNatural78.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Star_Pattern_b_LiteralUnlimitedNatural78.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_target::LiteralUnlimitedNatural172
		addToElementRepository("LiteralUnlimitedNatural172", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural172);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural172.setName("LiteralUnlimitedNatural172");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural172.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural172.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural133
		addToElementRepository("LiteralUnlimitedNatural133", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural133);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural133.setName("LiteralUnlimitedNatural133");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural133.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural133.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralUnlimitedNatural153
		addToElementRepository("LiteralUnlimitedNatural153", DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural153);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural153.setName("LiteralUnlimitedNatural153");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural153.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural153.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural94
		addToElementRepository("LiteralUnlimitedNatural94", DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural94);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural94.setName("LiteralUnlimitedNatural94");
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural94.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural94.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Array_Pattern_message_result::LiteralUnlimitedNatural88
		addToElementRepository("LiteralUnlimitedNatural88", DelegationConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural88);
		DelegationConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural88.setName("LiteralUnlimitedNatural88");
		DelegationConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural88.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural88.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralUnlimitedNatural108
		addToElementRepository("LiteralUnlimitedNatural108", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural108);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural108.setName("LiteralUnlimitedNatural108");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural108.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural108.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralUnlimitedNatural9
		addToElementRepository("LiteralUnlimitedNatural9", DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural9);
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural9.setName("LiteralUnlimitedNatural9");
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural9.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural9.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralUnlimitedNatural173
		addToElementRepository("LiteralUnlimitedNatural173", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural173);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural173.setName("LiteralUnlimitedNatural173");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural173.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural173.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural70
		addToElementRepository("LiteralUnlimitedNatural70", DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural70);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural70.setName("LiteralUnlimitedNatural70");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural70.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural70.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()_target::LiteralUnlimitedNatural156
		addToElementRepository("LiteralUnlimitedNatural156", DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural156);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural156.setName("LiteralUnlimitedNatural156");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural156.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural156.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Empty_Pattern_b::LiteralUnlimitedNatural52
		addToElementRepository("LiteralUnlimitedNatural52", DelegationConnectors_P_P_A_Empty_Pattern_b_LiteralUnlimitedNatural52);
		DelegationConnectors_P_P_A_Empty_Pattern_b_LiteralUnlimitedNatural52.setName("LiteralUnlimitedNatural52");
		DelegationConnectors_P_P_A_Empty_Pattern_b_LiteralUnlimitedNatural52.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Empty_Pattern_b_LiteralUnlimitedNatural52.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Empty_Pattern_p::LiteralUnlimitedNatural54
		addToElementRepository("LiteralUnlimitedNatural54", DelegationConnectors_P_P_A_Empty_Pattern_p_LiteralUnlimitedNatural54);
		DelegationConnectors_P_P_A_Empty_Pattern_p_LiteralUnlimitedNatural54.setName("LiteralUnlimitedNatural54");
		DelegationConnectors_P_P_A_Empty_Pattern_p_LiteralUnlimitedNatural54.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Empty_Pattern_p_LiteralUnlimitedNatural54.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80::LiteralUnlimitedNatural82
		addToElementRepository("LiteralUnlimitedNatural82", DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80_LiteralUnlimitedNatural82);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80_LiteralUnlimitedNatural82.setName("LiteralUnlimitedNatural82");
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80_LiteralUnlimitedNatural82.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Star_Pattern_r_ConnectorEnd80_LiteralUnlimitedNatural82.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value::LiteralUnlimitedNatural91
		addToElementRepository("LiteralUnlimitedNatural91", DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural91);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural91.setName("LiteralUnlimitedNatural91");
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural91.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural91.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralUnlimitedNatural26
		addToElementRepository("LiteralUnlimitedNatural26", DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural26);
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural26.setName("LiteralUnlimitedNatural26");
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural26.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural26.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Star_Pattern_message_result::LiteralUnlimitedNatural138
		addToElementRepository("LiteralUnlimitedNatural138", DelegationConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural138);
		DelegationConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural138.setName("LiteralUnlimitedNatural138");
		DelegationConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural138.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural138.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural148
		addToElementRepository("LiteralUnlimitedNatural148", DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural148);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural148.setName("LiteralUnlimitedNatural148");
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural148.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural148.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_R_y::LiteralUnlimitedNatural0
		addToElementRepository("LiteralUnlimitedNatural0", DelegationConnectors_P_P_R_y_LiteralUnlimitedNatural0);
		DelegationConnectors_P_P_R_y_LiteralUnlimitedNatural0.setName("LiteralUnlimitedNatural0");
		DelegationConnectors_P_P_R_y_LiteralUnlimitedNatural0.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_R_y_LiteralUnlimitedNatural0.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern_result::LiteralUnlimitedNatural169
		addToElementRepository("LiteralUnlimitedNatural169", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural169);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural169.setName("LiteralUnlimitedNatural169");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural169.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural169.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Array_Pattern_b::LiteralUnlimitedNatural48
		addToElementRepository("LiteralUnlimitedNatural48", DelegationConnectors_P_P_A_Array_Pattern_b_LiteralUnlimitedNatural48);
		DelegationConnectors_P_P_A_Array_Pattern_b_LiteralUnlimitedNatural48.setName("LiteralUnlimitedNatural48");
		DelegationConnectors_P_P_A_Array_Pattern_b_LiteralUnlimitedNatural48.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Array_Pattern_b_LiteralUnlimitedNatural48.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result::LiteralUnlimitedNatural67
		addToElementRepository("LiteralUnlimitedNatural67", DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural67);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural67.setName("LiteralUnlimitedNatural67");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural67.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural67.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralUnlimitedNatural22
		addToElementRepository("LiteralUnlimitedNatural22", DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural22);
		DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural22.setName("LiteralUnlimitedNatural22");
		DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural22.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural22.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Unconnected_Pattern_p::LiteralUnlimitedNatural114
		addToElementRepository("LiteralUnlimitedNatural114", DelegationConnectors_P_P_A_Unconnected_Pattern_p_LiteralUnlimitedNatural114);
		DelegationConnectors_P_P_A_Unconnected_Pattern_p_LiteralUnlimitedNatural114.setName("LiteralUnlimitedNatural114");
		DelegationConnectors_P_P_A_Unconnected_Pattern_p_LiteralUnlimitedNatural114.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Unconnected_Pattern_p_LiteralUnlimitedNatural114.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Array_Pattern_p::LiteralUnlimitedNatural50
		addToElementRepository("LiteralUnlimitedNatural50", DelegationConnectors_P_P_A_Array_Pattern_p_LiteralUnlimitedNatural50);
		DelegationConnectors_P_P_A_Array_Pattern_p_LiteralUnlimitedNatural50.setName("LiteralUnlimitedNatural50");
		DelegationConnectors_P_P_A_Array_Pattern_p_LiteralUnlimitedNatural50.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Array_Pattern_p_LiteralUnlimitedNatural50.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralUnlimitedNatural183
		addToElementRepository("LiteralUnlimitedNatural183", DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural183);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural183.setName("LiteralUnlimitedNatural183");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural183.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural183.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Star_Pattern_p::LiteralUnlimitedNatural76
		addToElementRepository("LiteralUnlimitedNatural76", DelegationConnectors_P_P_A_Star_Pattern_p_LiteralUnlimitedNatural76);
		DelegationConnectors_P_P_A_Star_Pattern_p_LiteralUnlimitedNatural76.setName("LiteralUnlimitedNatural76");
		DelegationConnectors_P_P_A_Star_Pattern_p_LiteralUnlimitedNatural76.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Star_Pattern_p_LiteralUnlimitedNatural76.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118::LiteralUnlimitedNatural119
		addToElementRepository("LiteralUnlimitedNatural119", DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralUnlimitedNatural119);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralUnlimitedNatural119.setName("LiteralUnlimitedNatural119");
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralUnlimitedNatural119.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralUnlimitedNatural119.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd43::LiteralUnlimitedNatural44
		addToElementRepository("LiteralUnlimitedNatural44", DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd43_LiteralUnlimitedNatural44);
		DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd43_LiteralUnlimitedNatural44.setName("LiteralUnlimitedNatural44");
		DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd43_LiteralUnlimitedNatural44.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Array_Pattern_r_ConnectorEnd43_LiteralUnlimitedNatural44.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value::LiteralUnlimitedNatural144
		addToElementRepository("LiteralUnlimitedNatural144", DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural144);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural144.setName("LiteralUnlimitedNatural144");
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural144.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural144.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value::LiteralUnlimitedNatural74
		addToElementRepository("LiteralUnlimitedNatural74", DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural74);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural74.setName("LiteralUnlimitedNatural74");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural74.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural74.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralUnlimitedNatural6
		addToElementRepository("LiteralUnlimitedNatural6", DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural6);
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural6.setName("LiteralUnlimitedNatural6");
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural6.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural6.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_R_x::LiteralUnlimitedNatural2
		addToElementRepository("LiteralUnlimitedNatural2", DelegationConnectors_P_P_R_x_LiteralUnlimitedNatural2);
		DelegationConnectors_P_P_R_x_LiteralUnlimitedNatural2.setName("LiteralUnlimitedNatural2");
		DelegationConnectors_P_P_R_x_LiteralUnlimitedNatural2.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_R_x_LiteralUnlimitedNatural2.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create A_Empty_Pattern_result::LiteralUnlimitedNatural103
		addToElementRepository("LiteralUnlimitedNatural103", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural103);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural103.setName("LiteralUnlimitedNatural103");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural103.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural103.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd57::LiteralUnlimitedNatural58
		addToElementRepository("LiteralUnlimitedNatural58", DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd57_LiteralUnlimitedNatural58);
		DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd57_LiteralUnlimitedNatural58.setName("LiteralUnlimitedNatural58");
		DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd57_LiteralUnlimitedNatural58.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd57_LiteralUnlimitedNatural58.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralUnlimitedNatural35
		addToElementRepository("LiteralUnlimitedNatural35", DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural35);
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural35.setName("LiteralUnlimitedNatural35");
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural35.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural35.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd59::LiteralUnlimitedNatural60
		addToElementRepository("LiteralUnlimitedNatural60", DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd59_LiteralUnlimitedNatural60);
		DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd59_LiteralUnlimitedNatural60.setName("LiteralUnlimitedNatural60");
		DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd59_LiteralUnlimitedNatural60.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd59_LiteralUnlimitedNatural60.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_target::LiteralUnlimitedNatural106
		addToElementRepository("LiteralUnlimitedNatural106", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural106);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural106.setName("LiteralUnlimitedNatural106");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural106.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural106.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result::LiteralUnlimitedNatural128
		addToElementRepository("LiteralUnlimitedNatural128", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural128);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural128.setName("LiteralUnlimitedNatural128");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural128.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural128.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create A_Array_Pattern_result::LiteralUnlimitedNatural185
		addToElementRepository("LiteralUnlimitedNatural185", DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural185);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural185.setName("LiteralUnlimitedNatural185");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural185.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural185.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralUnlimitedNatural32
		addToElementRepository("LiteralUnlimitedNatural32", DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural32);
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural32.setName("LiteralUnlimitedNatural32");
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural32.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural32.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralUnlimitedNatural41
		addToElementRepository("LiteralUnlimitedNatural41", DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural41);
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural41.setName("LiteralUnlimitedNatural41");
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural41.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural41.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow DelegationConnectors_P_P_instantiate_A_Empty_Pattern::ObjectFlow100
		addToElementRepository("ObjectFlow100", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100.setName("ObjectFlow100");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100.setSource(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100.setTarget(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100.setGuard(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow100_LiteralBoolean101);
		// ObjectFlow DelegationConnectors_P_P_instantiate_A_Star_Pattern::ObjectFlow150
		addToElementRepository("ObjectFlow150", DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150.setName("ObjectFlow150");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150.setSource(DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150.setTarget(DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150.setGuard(DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow150_LiteralBoolean151);
		// ObjectFlow DelegationConnectors_P_P_assert_A_Empty_Pattern::ObjectFlow62
		addToElementRepository("ObjectFlow62", DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62.setName("ObjectFlow62");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62.setSource(DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62.setTarget(DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_value);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62.setGuard(DelegationConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow62_LiteralBoolean63);
		// ObjectFlow DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern::ObjectFlow163
		addToElementRepository("ObjectFlow163", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163.setName("ObjectFlow163");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163.setSource(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163.setTarget(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163.setGuard(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralBoolean165);
		// ObjectFlow DelegationConnectors_P_P_instantiate_A_Array_Pattern::ObjectFlow176
		addToElementRepository("ObjectFlow176", DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176.setName("ObjectFlow176");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176.setSource(DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176.setTarget(DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176.setGuard(DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow176_LiteralBoolean178);
		// ObjectFlow DelegationConnectors_P_P_instantiate_A_Star_Pattern::ObjectFlow158
		addToElementRepository("ObjectFlow158", DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158.setName("ObjectFlow158");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158.setSource(DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158.setTarget(DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158.setGuard(DelegationConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow158_LiteralBoolean160);
		// ObjectFlow DelegationConnectors_P_P_main::ObjectFlow11
		addToElementRepository("ObjectFlow11", DelegationConnectors_P_P_main_ObjectFlow11);
		DelegationConnectors_P_P_main_ObjectFlow11.setName("ObjectFlow11");
		DelegationConnectors_P_P_main_ObjectFlow11.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_main_ObjectFlow11.setSource(DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_P_main_ObjectFlow11.setTarget(DelegationConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_P_main_ObjectFlow11.setGuard(DelegationConnectors_P_P_main_ObjectFlow11_LiteralBoolean12);
		// ObjectFlow DelegationConnectors_P_P_main::ObjectFlow14
		addToElementRepository("ObjectFlow14", DelegationConnectors_P_P_main_ObjectFlow14);
		DelegationConnectors_P_P_main_ObjectFlow14.setName("ObjectFlow14");
		DelegationConnectors_P_P_main_ObjectFlow14.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_main_ObjectFlow14.setSource(DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_P_main_ObjectFlow14.setTarget(DelegationConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_P_main_ObjectFlow14.setGuard(DelegationConnectors_P_P_main_ObjectFlow14_LiteralBoolean16);
		// ObjectFlow DelegationConnectors_P_P_main::ObjectFlow17
		addToElementRepository("ObjectFlow17", DelegationConnectors_P_P_main_ObjectFlow17);
		DelegationConnectors_P_P_main_ObjectFlow17.setName("ObjectFlow17");
		DelegationConnectors_P_P_main_ObjectFlow17.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_main_ObjectFlow17.setSource(DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_P_main_ObjectFlow17.setTarget(DelegationConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_P_main_ObjectFlow17.setGuard(DelegationConnectors_P_P_main_ObjectFlow17_LiteralBoolean18);
		// ObjectFlow DelegationConnectors_P_P_assert_A_Array_Pattern::ObjectFlow97
		addToElementRepository("ObjectFlow97", DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97);
		DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97.setName("ObjectFlow97");
		DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97.setSource(DelegationConnectors_P_P_assert_A_Array_Pattern_message_result);
		DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97.setTarget(DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_value);
		DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97.setGuard(DelegationConnectors_P_P_assert_A_Array_Pattern_ObjectFlow97_LiteralBoolean98);
		// ObjectFlow DelegationConnectors_P_P_assert_A_Unconnected_Pattern::ObjectFlow125
		addToElementRepository("ObjectFlow125", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125.setName("ObjectFlow125");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125.setSource(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125.setTarget(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125.setGuard(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow125_LiteralBoolean127);
		// ObjectFlow DelegationConnectors_P_P_assert_A_Star_Pattern::ObjectFlow140
		addToElementRepository("ObjectFlow140", DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140);
		DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140.setName("ObjectFlow140");
		DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140.setSource(DelegationConnectors_P_P_assert_A_Star_Pattern_message_result);
		DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140.setTarget(DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_value);
		DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140.setGuard(DelegationConnectors_P_P_assert_A_Star_Pattern_ObjectFlow140_LiteralBoolean142);
		// ObjectFlow DelegationConnectors_P_P_main::ObjectFlow27
		addToElementRepository("ObjectFlow27", DelegationConnectors_P_P_main_ObjectFlow27);
		DelegationConnectors_P_P_main_ObjectFlow27.setName("ObjectFlow27");
		DelegationConnectors_P_P_main_ObjectFlow27.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_main_ObjectFlow27.setSource(DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_P_main_ObjectFlow27.setTarget(DelegationConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_P_main_ObjectFlow27.setGuard(DelegationConnectors_P_P_main_ObjectFlow27_LiteralBoolean28);
		// ObjectFlow DelegationConnectors_P_P_instantiate_A_Empty_Pattern::ObjectFlow110
		addToElementRepository("ObjectFlow110", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110.setName("ObjectFlow110");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110.setSource(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110.setTarget(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110.setGuard(DelegationConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow110_LiteralBoolean111);
		// ObjectFlow DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern::ObjectFlow166
		addToElementRepository("ObjectFlow166", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166.setName("ObjectFlow166");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166.setSource(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166.setTarget(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166.setGuard(DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralBoolean167);
		// ObjectFlow DelegationConnectors_P_P_instantiate_A_Array_Pattern::ObjectFlow187
		addToElementRepository("ObjectFlow187", DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187.setName("ObjectFlow187");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187.setSource(DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187.setTarget(DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187.setGuard(DelegationConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow187_LiteralBoolean188);
	}

	private void initializeOperation_Instances()
	{
		// Operation DelegationConnectors_P_P_A_Empty_Pattern::A_Empty_Pattern_A_Empty_Pattern
		addToElementRepository("A_Empty_Pattern_A_Empty_Pattern", DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.setName("A_Empty_Pattern");
		DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.addOwnedParameter(DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result);
		DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation DelegationConnectors_P_P_A_Unconnected_Pattern::A_Unconnected_Pattern_A_Unconnected_Pattern
		addToElementRepository("A_Unconnected_Pattern_A_Unconnected_Pattern", DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.setName("A_Unconnected_Pattern");
		DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.addOwnedParameter(DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result);
		DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation DelegationConnectors_P_P_A_Star_Pattern::A_Star_Pattern_A_Star_Pattern
		addToElementRepository("A_Star_Pattern_A_Star_Pattern", DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.setName("A_Star_Pattern");
		DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.addOwnedParameter(DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result);
		DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation DelegationConnectors_P_P_A_Array_Pattern::A_Array_Pattern_A_Array_Pattern
		addToElementRepository("A_Array_Pattern_A_Array_Pattern", DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.setName("A_Array_Pattern");
		DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.addOwnedParameter(DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result);
		DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create A_Empty_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setName("result");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setType(DelegationConnectors_P_P_A_Empty_Pattern);
		// OutputPin DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus.setName("errorStatus");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create A_Array_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setName("result");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setType(DelegationConnectors_P_P_A_Array_Pattern);
		// OutputPin DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message::result
		addToElementRepository("result", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result.setName("result");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin DelegationConnectors_P_P_assert_A_Array_Pattern_message::result
		addToElementRepository("result", DelegationConnectors_P_P_assert_A_Array_Pattern_message_result);
		DelegationConnectors_P_P_assert_A_Array_Pattern_message_result.setName("result");
		DelegationConnectors_P_P_assert_A_Array_Pattern_message_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin DelegationConnectors_P_P_main_instantiate_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern.setType(DelegationConnectors_P_P_A_Star_Pattern);
		// OutputPin DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()::result
		addToElementRepository("result", DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result.setName("result");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result.setType(DelegationConnectors_P_P_A_Array_Pattern);
		// OutputPin DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()::result
		addToElementRepository("result", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setName("result");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setType(DelegationConnectors_P_P_A_Empty_Pattern);
		// OutputPin DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus.setName("errorStatus");
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin DelegationConnectors_P_P_main_instantiate_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern.setType(DelegationConnectors_P_P_A_Array_Pattern);
		// OutputPin DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()::result
		addToElementRepository("result", DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result.setName("result");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result.setType(DelegationConnectors_P_P_A_Star_Pattern);
		// OutputPin DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create A_Star_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setName("result");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setType(DelegationConnectors_P_P_A_Star_Pattern);
		// OutputPin DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus.setName("errorStatus");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(DelegationConnectors_P_P_A_Unconnected_Pattern);
		// OutputPin DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setName("result");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setType(DelegationConnectors_P_P_A_Unconnected_Pattern);
		// OutputPin DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setType(DelegationConnectors_P_P_A_Empty_Pattern);
		// OutputPin DelegationConnectors_P_P_assert_A_Empty_Pattern_message::result
		addToElementRepository("result", DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result.setName("result");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()::result
		addToElementRepository("result", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setName("result");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setType(DelegationConnectors_P_P_A_Unconnected_Pattern);
		// OutputPin DelegationConnectors_P_P_assert_A_Star_Pattern_message::result
		addToElementRepository("result", DelegationConnectors_P_P_assert_A_Star_Pattern_message_result);
		DelegationConnectors_P_P_assert_A_Star_Pattern_message_result.setName("result");
		DelegationConnectors_P_P_assert_A_Star_Pattern_message_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus.setName("errorStatus");
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus.setLower(0);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport DelegationConnectors_P_P::PackageImport61
		addToElementRepository("PackageImport61", DelegationConnectors_P_P_PackageImport61);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result);
		DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setName("result");
		DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setType(DelegationConnectors_P_P_A_Star_Pattern);
		DelegationConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_P_assert_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern.setType(DelegationConnectors_P_P_A_Array_Pattern);
		// Parameter DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result);
		DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setName("result");
		DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setType(DelegationConnectors_P_P_A_Array_Pattern);
		DelegationConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_P_instantiate_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern.setType(DelegationConnectors_P_P_A_Star_Pattern);
		DelegationConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result);
		DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setName("result");
		DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setType(DelegationConnectors_P_P_A_Unconnected_Pattern);
		DelegationConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result);
		DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setName("result");
		DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setType(DelegationConnectors_P_P_A_Empty_Pattern);
		DelegationConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_P_assert_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(DelegationConnectors_P_P_A_Unconnected_Pattern);
		// Parameter DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(DelegationConnectors_P_P_A_Unconnected_Pattern);
		DelegationConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_P_assert_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern.setType(DelegationConnectors_P_P_A_Empty_Pattern);
		// Parameter DelegationConnectors_P_P_instantiate_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern.setType(DelegationConnectors_P_P_A_Array_Pattern);
		DelegationConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_P_instantiate_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern.setType(DelegationConnectors_P_P_A_Empty_Pattern);
		DelegationConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_P_assert_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern.setType(DelegationConnectors_P_P_A_Star_Pattern);
	}

	private void initializePort_Instances()
	{
		// Port DelegationConnectors_P_P_A_Unconnected_Pattern::p
		addToElementRepository("p", DelegationConnectors_P_P_A_Unconnected_Pattern_p);
		DelegationConnectors_P_P_A_Unconnected_Pattern_p.setName("p");
		DelegationConnectors_P_P_A_Unconnected_Pattern_p.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Unconnected_Pattern_p.setUpper(-1);
		DelegationConnectors_P_P_A_Unconnected_Pattern_p.setLower(3);
		DelegationConnectors_P_P_A_Unconnected_Pattern_p.setType(DelegationConnectors_P_P_IImpl);
		DelegationConnectors_P_P_A_Unconnected_Pattern_p.setAggregation(AggregationKind.composite);
		DelegationConnectors_P_P_A_Unconnected_Pattern_p.isService = true;
		DelegationConnectors_P_P_A_Unconnected_Pattern_p.addProvided(DelegationConnectors_P_P_I);
		// Port DelegationConnectors_P_P_A_Empty_Pattern::p
		addToElementRepository("p", DelegationConnectors_P_P_A_Empty_Pattern_p);
		DelegationConnectors_P_P_A_Empty_Pattern_p.setName("p");
		DelegationConnectors_P_P_A_Empty_Pattern_p.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Empty_Pattern_p.setUpper(-1);
		DelegationConnectors_P_P_A_Empty_Pattern_p.setLower(0);
		DelegationConnectors_P_P_A_Empty_Pattern_p.setType(DelegationConnectors_P_P_IImpl);
		DelegationConnectors_P_P_A_Empty_Pattern_p.setAggregation(AggregationKind.composite);
		DelegationConnectors_P_P_A_Empty_Pattern_p.isService = true;
		DelegationConnectors_P_P_A_Empty_Pattern_p.addProvided(DelegationConnectors_P_P_I);
		// Port DelegationConnectors_P_P_A_Star_Pattern::p
		addToElementRepository("p", DelegationConnectors_P_P_A_Star_Pattern_p);
		DelegationConnectors_P_P_A_Star_Pattern_p.setName("p");
		DelegationConnectors_P_P_A_Star_Pattern_p.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Star_Pattern_p.setUpper(-1);
		DelegationConnectors_P_P_A_Star_Pattern_p.setLower(3);
		DelegationConnectors_P_P_A_Star_Pattern_p.setType(DelegationConnectors_P_P_IImpl);
		DelegationConnectors_P_P_A_Star_Pattern_p.setAggregation(AggregationKind.composite);
		DelegationConnectors_P_P_A_Star_Pattern_p.isService = true;
		DelegationConnectors_P_P_A_Star_Pattern_p.addProvided(DelegationConnectors_P_P_I);
		// Port DelegationConnectors_P_P_A_Array_Pattern::p
		addToElementRepository("p", DelegationConnectors_P_P_A_Array_Pattern_p);
		DelegationConnectors_P_P_A_Array_Pattern_p.setName("p");
		DelegationConnectors_P_P_A_Array_Pattern_p.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Array_Pattern_p.setUpper(-1);
		DelegationConnectors_P_P_A_Array_Pattern_p.setLower(4);
		DelegationConnectors_P_P_A_Array_Pattern_p.setType(DelegationConnectors_P_P_IImpl);
		DelegationConnectors_P_P_A_Array_Pattern_p.setAggregation(AggregationKind.composite);
		DelegationConnectors_P_P_A_Array_Pattern_p.isService = true;
		DelegationConnectors_P_P_A_Array_Pattern_p.addProvided(DelegationConnectors_P_P_I);
	}

	private void initializeProperty_Instances()
	{
		// Property DelegationConnectors_P_P_A_Empty_Pattern::b
		addToElementRepository("b", DelegationConnectors_P_P_A_Empty_Pattern_b);
		DelegationConnectors_P_P_A_Empty_Pattern_b.setName("b");
		DelegationConnectors_P_P_A_Empty_Pattern_b.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Empty_Pattern_b.setUpper(-1);
		DelegationConnectors_P_P_A_Empty_Pattern_b.setLower(0);
		DelegationConnectors_P_P_A_Empty_Pattern_b.setType(DelegationConnectors_P_P_B);
		DelegationConnectors_P_P_A_Empty_Pattern_b.setAggregation(AggregationKind.composite);
		// Property DelegationConnectors_P_P_R::y
		addToElementRepository("y", DelegationConnectors_P_P_R_y);
		DelegationConnectors_P_P_R_y.setName("y");
		DelegationConnectors_P_P_R_y.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_R_y.setUpper(-1);
		DelegationConnectors_P_P_R_y.setLower(0);
		DelegationConnectors_P_P_R_y.setType(DelegationConnectors_P_P_B);
		// Property DelegationConnectors_P_P_A_Array_Pattern::b
		addToElementRepository("b", DelegationConnectors_P_P_A_Array_Pattern_b);
		DelegationConnectors_P_P_A_Array_Pattern_b.setName("b");
		DelegationConnectors_P_P_A_Array_Pattern_b.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Array_Pattern_b.setUpper(-1);
		DelegationConnectors_P_P_A_Array_Pattern_b.setLower(4);
		DelegationConnectors_P_P_A_Array_Pattern_b.setType(DelegationConnectors_P_P_B);
		DelegationConnectors_P_P_A_Array_Pattern_b.setAggregation(AggregationKind.composite);
		// Property DelegationConnectors_P_P_A_Unconnected_Pattern::b
		addToElementRepository("b", DelegationConnectors_P_P_A_Unconnected_Pattern_b);
		DelegationConnectors_P_P_A_Unconnected_Pattern_b.setName("b");
		DelegationConnectors_P_P_A_Unconnected_Pattern_b.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Unconnected_Pattern_b.setUpper(-1);
		DelegationConnectors_P_P_A_Unconnected_Pattern_b.setLower(2);
		DelegationConnectors_P_P_A_Unconnected_Pattern_b.setType(DelegationConnectors_P_P_B);
		DelegationConnectors_P_P_A_Unconnected_Pattern_b.setAggregation(AggregationKind.composite);
		// Property DelegationConnectors_P_P_A_Star_Pattern::b
		addToElementRepository("b", DelegationConnectors_P_P_A_Star_Pattern_b);
		DelegationConnectors_P_P_A_Star_Pattern_b.setName("b");
		DelegationConnectors_P_P_A_Star_Pattern_b.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_A_Star_Pattern_b.setUpper(-1);
		DelegationConnectors_P_P_A_Star_Pattern_b.setLower(4);
		DelegationConnectors_P_P_A_Star_Pattern_b.setType(DelegationConnectors_P_P_B);
		DelegationConnectors_P_P_A_Star_Pattern_b.setAggregation(AggregationKind.composite);
		// Property DelegationConnectors_P_P_R::x
		addToElementRepository("x", DelegationConnectors_P_P_R_x);
		DelegationConnectors_P_P_R_x.setName("x");
		DelegationConnectors_P_P_R_x.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_R_x.setUpper(-1);
		DelegationConnectors_P_P_R_x.setLower(0);
		DelegationConnectors_P_P_R_x.setType(DelegationConnectors_P_P_IImpl);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction DelegationConnectors_P_P_assert_A_Empty_Pattern::message
		addToElementRepository("message", DelegationConnectors_P_P_assert_A_Empty_Pattern_message);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message.setName("message");
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message.setValue(DelegationConnectors_P_P_assert_A_Empty_Pattern_message_LiteralString65);
		DelegationConnectors_P_P_assert_A_Empty_Pattern_message.setResult(DelegationConnectors_P_P_assert_A_Empty_Pattern_message_result);
		// ValueSpecificationAction DelegationConnectors_P_P_assert_A_Star_Pattern::message
		addToElementRepository("message", DelegationConnectors_P_P_assert_A_Star_Pattern_message);
		DelegationConnectors_P_P_assert_A_Star_Pattern_message.setName("message");
		DelegationConnectors_P_P_assert_A_Star_Pattern_message.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Star_Pattern_message.setValue(DelegationConnectors_P_P_assert_A_Star_Pattern_message_LiteralString137);
		DelegationConnectors_P_P_assert_A_Star_Pattern_message.setResult(DelegationConnectors_P_P_assert_A_Star_Pattern_message_result);
		// ValueSpecificationAction DelegationConnectors_P_P_assert_A_Array_Pattern::message
		addToElementRepository("message", DelegationConnectors_P_P_assert_A_Array_Pattern_message);
		DelegationConnectors_P_P_assert_A_Array_Pattern_message.setName("message");
		DelegationConnectors_P_P_assert_A_Array_Pattern_message.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Array_Pattern_message.setValue(DelegationConnectors_P_P_assert_A_Array_Pattern_message_LiteralString87);
		DelegationConnectors_P_P_assert_A_Array_Pattern_message.setResult(DelegationConnectors_P_P_assert_A_Array_Pattern_message_result);
		// ValueSpecificationAction DelegationConnectors_P_P_assert_A_Unconnected_Pattern::message
		addToElementRepository("message", DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message.setName("message");
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message.setValue(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_LiteralString130);
		DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message.setResult(DelegationConnectors_P_P_assert_A_Unconnected_Pattern_message_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // DelegationConnectors_P_PModel
