/*
 * DelegationConnectors_P_PWPModel.java
 * 
 * Auto-generated file
 */
package DelegationConnectors_P_PWP;

import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.structuredclassifiers.Connector;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.InterfaceRealization;
import uml.actions.OutputPin;
import uml.activities.Activity;
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

public class DelegationConnectors_P_PWPModel extends InMemoryModel
{
	private static DelegationConnectors_P_PWPModel instance;

	/*
	 * Model DelegationConnectors_P_PWP
	 */
	public Package DelegationConnectors_P_PWP = new Package();
		public Activity DelegationConnectors_P_PWP_instantiate_A_Star_Pattern = new Activity();
			public ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0_LiteralBoolean1 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0_LiteralInteger2 = new LiteralInteger();
			public Parameter DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern = new Parameter();
			public ActivityParameterNode DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node = new ActivityParameterNode();
			public CreateObjectAction DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern = new CreateObjectAction();
				public OutputPin DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural3 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger4 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5 = new ObjectFlow();
				public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5_LiteralInteger6 = new LiteralInteger();
				public LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5_LiteralBoolean7 = new LiteralBoolean();
			public CallOperationAction DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_ = new CallOperationAction();
				public InputPin DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target = new InputPin();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger8 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural9 = new LiteralUnlimitedNatural();
				public OutputPin DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result = new OutputPin();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger10 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger11 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural12 = new LiteralUnlimitedNatural();
		public Activity DelegationConnectors_P_PWP_assert_A_Empty_Pattern = new Activity();
			public CallBehaviorAction DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger13 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural14 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger15 = new LiteralInteger();
				public InputPin DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value = new InputPin();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger16 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural17 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger18 = new LiteralInteger();
			public Parameter DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern = new Parameter();
			public ObjectFlow DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19_LiteralBoolean20 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19_LiteralInteger21 = new LiteralInteger();
			public ActivityParameterNode DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node = new ActivityParameterNode();
				public LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger22 = new LiteralInteger();
			public ValueSpecificationAction DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message = new ValueSpecificationAction();
				public OutputPin DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result = new OutputPin();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result_LiteralInteger23 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural24 = new LiteralUnlimitedNatural();
				public LiteralString DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_LiteralString25 = new LiteralString();
		public Class_ DelegationConnectors_P_PWP_B = new Class_();
			public Port DelegationConnectors_P_PWP_B_q = new Port();
				public LiteralUnlimitedNatural DelegationConnectors_P_PWP_B_q_LiteralUnlimitedNatural26 = new LiteralUnlimitedNatural();
				public LiteralInteger DelegationConnectors_P_PWP_B_q_LiteralInteger27 = new LiteralInteger();
		public Association DelegationConnectors_P_PWP_R = new Association();
			public Property DelegationConnectors_P_PWP_R_x = new Property();
				public LiteralInteger DelegationConnectors_P_PWP_R_x_LiteralInteger28 = new LiteralInteger();
				public LiteralUnlimitedNatural DelegationConnectors_P_PWP_R_x_LiteralUnlimitedNatural29 = new LiteralUnlimitedNatural();
			public Property DelegationConnectors_P_PWP_R_y = new Property();
				public LiteralUnlimitedNatural DelegationConnectors_P_PWP_R_y_LiteralUnlimitedNatural30 = new LiteralUnlimitedNatural();
				public LiteralInteger DelegationConnectors_P_PWP_R_y_LiteralInteger31 = new LiteralInteger();
		public Activity DelegationConnectors_P_PWP_instantiate_A_Array_Pattern = new Activity();
			public ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32 = new ObjectFlow();
				public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32_LiteralInteger33 = new LiteralInteger();
				public LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32_LiteralBoolean34 = new LiteralBoolean();
			public CreateObjectAction DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern = new CreateObjectAction();
				public OutputPin DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result = new OutputPin();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger35 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural36 = new LiteralUnlimitedNatural();
			public ActivityParameterNode DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node = new ActivityParameterNode();
				public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger37 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38 = new ObjectFlow();
				public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38_LiteralInteger39 = new LiteralInteger();
				public LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38_LiteralBoolean40 = new LiteralBoolean();
			public CallOperationAction DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_ = new CallOperationAction();
				public OutputPin DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural41 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger42 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger43 = new LiteralInteger();
				public InputPin DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target = new InputPin();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger44 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural45 = new LiteralUnlimitedNatural();
			public Parameter DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern = new Parameter();
		public Class_ DelegationConnectors_P_PWP_IImpl = new Class_();
			public InterfaceRealization DelegationConnectors_P_PWP_IImpl_I_Realization = new InterfaceRealization();
		public Class_ DelegationConnectors_P_PWP_A_Array_Pattern = new Class_();
			public Connector DelegationConnectors_P_PWP_A_Array_Pattern_r = new Connector();
				public ConnectorEnd DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd46 = new ConnectorEnd();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd46_LiteralUnlimitedNatural47 = new LiteralUnlimitedNatural();
				public ConnectorEnd DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd48 = new ConnectorEnd();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd48_LiteralUnlimitedNatural49 = new LiteralUnlimitedNatural();
			public Property DelegationConnectors_P_PWP_A_Array_Pattern_b = new Property();
				public LiteralInteger DelegationConnectors_P_PWP_A_Array_Pattern_b_LiteralInteger50 = new LiteralInteger();
				public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Array_Pattern_b_LiteralUnlimitedNatural51 = new LiteralUnlimitedNatural();
			public Port DelegationConnectors_P_PWP_A_Array_Pattern_p = new Port();
				public LiteralInteger DelegationConnectors_P_PWP_A_Array_Pattern_p_LiteralInteger52 = new LiteralInteger();
				public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Array_Pattern_p_LiteralUnlimitedNatural53 = new LiteralUnlimitedNatural();
			public Comment DelegationConnectors_P_PWP_A_Array_Pattern_Comment54 = new Comment();
			public Operation DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern = new Operation();
				public Parameter DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result = new Parameter();
		public Class_ DelegationConnectors_P_PWP_A_Empty_Pattern = new Class_();
			public Property DelegationConnectors_P_PWP_A_Empty_Pattern_b = new Property();
				public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Empty_Pattern_b_LiteralUnlimitedNatural55 = new LiteralUnlimitedNatural();
				public LiteralInteger DelegationConnectors_P_PWP_A_Empty_Pattern_b_LiteralInteger56 = new LiteralInteger();
			public Port DelegationConnectors_P_PWP_A_Empty_Pattern_p = new Port();
				public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Empty_Pattern_p_LiteralUnlimitedNatural57 = new LiteralUnlimitedNatural();
				public LiteralInteger DelegationConnectors_P_PWP_A_Empty_Pattern_p_LiteralInteger58 = new LiteralInteger();
			public Operation DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern = new Operation();
				public Parameter DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result = new Parameter();
			public Comment DelegationConnectors_P_PWP_A_Empty_Pattern_Comment59 = new Comment();
			public Connector DelegationConnectors_P_PWP_A_Empty_Pattern_r = new Connector();
				public ConnectorEnd DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd60 = new ConnectorEnd();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd60_LiteralUnlimitedNatural61 = new LiteralUnlimitedNatural();
				public ConnectorEnd DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd62 = new ConnectorEnd();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd62_LiteralUnlimitedNatural63 = new LiteralUnlimitedNatural();
		public PackageImport DelegationConnectors_P_PWP_PackageImport64 = new PackageImport();
		public Activity DelegationConnectors_P_PWP_assert_A_Array_Pattern = new Activity();
			public Parameter DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern = new Parameter();
			public CallBehaviorAction DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger65 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger66 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural67 = new LiteralUnlimitedNatural();
				public InputPin DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value = new InputPin();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger68 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger69 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural70 = new LiteralUnlimitedNatural();
			public ObjectFlow DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71 = new ObjectFlow();
				public LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71_LiteralInteger72 = new LiteralInteger();
				public LiteralBoolean DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71_LiteralBoolean73 = new LiteralBoolean();
			public ActivityParameterNode DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern_node = new ActivityParameterNode();
				public LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger74 = new LiteralInteger();
			public ValueSpecificationAction DelegationConnectors_P_PWP_assert_A_Array_Pattern_message = new ValueSpecificationAction();
				public LiteralString DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_LiteralString75 = new LiteralString();
				public OutputPin DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result = new OutputPin();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result_LiteralInteger76 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural77 = new LiteralUnlimitedNatural();
		public Comment DelegationConnectors_P_PWP_Comment78 = new Comment();
		public Class_ DelegationConnectors_P_PWP_A_Star_Pattern = new Class_();
			public Operation DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern = new Operation();
				public Parameter DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result = new Parameter();
			public Port DelegationConnectors_P_PWP_A_Star_Pattern_p = new Port();
				public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Star_Pattern_p_LiteralUnlimitedNatural79 = new LiteralUnlimitedNatural();
				public LiteralInteger DelegationConnectors_P_PWP_A_Star_Pattern_p_LiteralInteger80 = new LiteralInteger();
			public Property DelegationConnectors_P_PWP_A_Star_Pattern_b = new Property();
				public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Star_Pattern_b_LiteralUnlimitedNatural81 = new LiteralUnlimitedNatural();
				public LiteralInteger DelegationConnectors_P_PWP_A_Star_Pattern_b_LiteralInteger82 = new LiteralInteger();
			public Connector DelegationConnectors_P_PWP_A_Star_Pattern_r = new Connector();
				public ConnectorEnd DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83 = new ConnectorEnd();
					public LiteralInteger DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83_LiteralInteger84 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83_LiteralUnlimitedNatural85 = new LiteralUnlimitedNatural();
				public ConnectorEnd DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86 = new ConnectorEnd();
					public LiteralInteger DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86_LiteralInteger87 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86_LiteralUnlimitedNatural88 = new LiteralUnlimitedNatural();
			public Comment DelegationConnectors_P_PWP_A_Star_Pattern_Comment89 = new Comment();
		public Interface DelegationConnectors_P_PWP_I = new Interface();
		public Activity DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern = new Activity();
			public ObjectFlow DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90_LiteralBoolean91 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90_LiteralInteger92 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine = new CallBehaviorAction();
				public InputPin DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value = new InputPin();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger93 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger94 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural95 = new LiteralUnlimitedNatural();
				public OutputPin DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger96 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger97 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural98 = new LiteralUnlimitedNatural();
			public ActivityParameterNode DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node = new ActivityParameterNode();
				public LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger99 = new LiteralInteger();
			public Parameter DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern = new Parameter();
			public ValueSpecificationAction DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message = new ValueSpecificationAction();
				public OutputPin DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result = new OutputPin();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result_LiteralInteger100 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural101 = new LiteralUnlimitedNatural();
				public LiteralString DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_LiteralString102 = new LiteralString();
		public Activity DelegationConnectors_P_PWP_assert_A_Star_Pattern = new Activity();
			public ValueSpecificationAction DelegationConnectors_P_PWP_assert_A_Star_Pattern_message = new ValueSpecificationAction();
				public OutputPin DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result = new OutputPin();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result_LiteralInteger103 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural104 = new LiteralUnlimitedNatural();
				public LiteralString DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_LiteralString105 = new LiteralString();
			public ActivityParameterNode DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern_node = new ActivityParameterNode();
				public LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger106 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107_LiteralBoolean108 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107_LiteralInteger109 = new LiteralInteger();
			public Parameter DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern = new Parameter();
			public CallBehaviorAction DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural110 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger111 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger112 = new LiteralInteger();
				public InputPin DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value = new InputPin();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger113 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural114 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger115 = new LiteralInteger();
		public Class_ DelegationConnectors_P_PWP_A_Unconnected_Pattern = new Class_();
			public Port DelegationConnectors_P_PWP_A_Unconnected_Pattern_p = new Port();
				public LiteralInteger DelegationConnectors_P_PWP_A_Unconnected_Pattern_p_LiteralInteger116 = new LiteralInteger();
				public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Unconnected_Pattern_p_LiteralUnlimitedNatural117 = new LiteralUnlimitedNatural();
			public Connector DelegationConnectors_P_PWP_A_Unconnected_Pattern_r = new Connector();
				public ConnectorEnd DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118 = new ConnectorEnd();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralUnlimitedNatural119 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralInteger120 = new LiteralInteger();
				public ConnectorEnd DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121 = new ConnectorEnd();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121_LiteralUnlimitedNatural122 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121_LiteralInteger123 = new LiteralInteger();
			public Operation DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern = new Operation();
				public Parameter DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result = new Parameter();
			public Property DelegationConnectors_P_PWP_A_Unconnected_Pattern_b = new Property();
				public LiteralInteger DelegationConnectors_P_PWP_A_Unconnected_Pattern_b_LiteralInteger124 = new LiteralInteger();
				public LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Unconnected_Pattern_b_LiteralUnlimitedNatural125 = new LiteralUnlimitedNatural();
			public Comment DelegationConnectors_P_PWP_A_Unconnected_Pattern_Comment126 = new Comment();
		public Activity DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern = new Activity();
			public Parameter DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern = new Parameter();
			public CallOperationAction DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_ = new CallOperationAction();
				public InputPin DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target = new InputPin();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger127 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural128 = new LiteralUnlimitedNatural();
				public OutputPin DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural129 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger130 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger131 = new LiteralInteger();
			public ActivityParameterNode DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node = new ActivityParameterNode();
			public ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132_LiteralBoolean133 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132_LiteralInteger134 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135_LiteralBoolean136 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135_LiteralInteger137 = new LiteralInteger();
			public CreateObjectAction DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern = new CreateObjectAction();
				public OutputPin DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural138 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger139 = new LiteralInteger();
		public Activity DelegationConnectors_P_PWP_main = new Activity();
			public CallBehaviorAction DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern = new CallBehaviorAction();
				public InputPin DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern = new InputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural140 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger141 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger142 = new LiteralInteger();
			public ControlFlow DelegationConnectors_P_PWP_main_ControlFlow143 = new ControlFlow();
			public ControlFlow DelegationConnectors_P_PWP_main_ControlFlow144 = new ControlFlow();
			public CallBehaviorAction DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural145 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger146 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger147 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern = new OutputPin();
					public LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger148 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural149 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger150 = new LiteralInteger();
			public ControlFlow DelegationConnectors_P_PWP_main_ControlFlow151 = new ControlFlow();
			public ObjectFlow DelegationConnectors_P_PWP_main_ObjectFlow152 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_PWP_main_ObjectFlow152_LiteralBoolean153 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_PWP_main_ObjectFlow152_LiteralInteger154 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_PWP_main_assert_A_Array_Pattern = new CallBehaviorAction();
				public InputPin DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern = new InputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural155 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger156 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger157 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_PWP_main_ObjectFlow158 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_PWP_main_ObjectFlow158_LiteralBoolean159 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_PWP_main_ObjectFlow158_LiteralInteger160 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural161 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger162 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger163 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern = new CallBehaviorAction();
				public OutputPin DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural164 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger165 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger166 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_PWP_main_ObjectFlow167 = new ObjectFlow();
				public LiteralInteger DelegationConnectors_P_PWP_main_ObjectFlow167_LiteralInteger168 = new LiteralInteger();
				public LiteralBoolean DelegationConnectors_P_PWP_main_ObjectFlow167_LiteralBoolean169 = new LiteralBoolean();
			public ObjectFlow DelegationConnectors_P_PWP_main_ObjectFlow170 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_PWP_main_ObjectFlow170_LiteralBoolean171 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_PWP_main_ObjectFlow170_LiteralInteger172 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern = new CallBehaviorAction();
				public InputPin DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern = new InputPin();
					public LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger173 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural174 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger175 = new LiteralInteger();
			public CallBehaviorAction DelegationConnectors_P_PWP_main_assert_A_Star_Pattern = new CallBehaviorAction();
				public InputPin DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern = new InputPin();
					public LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger176 = new LiteralInteger();
					public LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger177 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural178 = new LiteralUnlimitedNatural();
		public Activity DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern = new Activity();
			public CallOperationAction DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_ = new CallOperationAction();
				public InputPin DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target = new InputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural179 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger180 = new LiteralInteger();
				public OutputPin DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result = new OutputPin();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger181 = new LiteralInteger();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural182 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger183 = new LiteralInteger();
			public ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184_LiteralBoolean185 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184_LiteralInteger186 = new LiteralInteger();
			public ActivityParameterNode DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node = new ActivityParameterNode();
			public Parameter DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern = new Parameter();
			public ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187 = new ObjectFlow();
				public LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187_LiteralBoolean188 = new LiteralBoolean();
				public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187_LiteralInteger189 = new LiteralInteger();
			public CreateObjectAction DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern = new CreateObjectAction();
				public OutputPin DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result = new OutputPin();
					public LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural190 = new LiteralUnlimitedNatural();
					public LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger191 = new LiteralInteger();

	public static DelegationConnectors_P_PWPModel instance()
	{
		if (instance == null)
        {
            instance = new DelegationConnectors_P_PWPModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public DelegationConnectors_P_PWPModel()
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
		// Activity DelegationConnectors_P_PWP::instantiate_A_Star_Pattern
		addToElementRepository("instantiate_A_Star_Pattern", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern.setName("instantiate_A_Star_Pattern");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern.addOwnedParameter(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern.addNode(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern.addNode(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern.addNode(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern.addEdge(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern.addEdge(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5);
		// Activity DelegationConnectors_P_PWP::assert_A_Empty_Pattern
		addToElementRepository("assert_A_Empty_Pattern", DelegationConnectors_P_PWP_assert_A_Empty_Pattern);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern.setName("assert_A_Empty_Pattern");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern.addOwnedParameter(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern.addNode(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern.addNode(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern.addNode(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern.addEdge(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19);
		// Activity DelegationConnectors_P_PWP::instantiate_A_Array_Pattern
		addToElementRepository("instantiate_A_Array_Pattern", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern.setName("instantiate_A_Array_Pattern");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern.addOwnedParameter(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern.addNode(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern.addNode(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern.addNode(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern.addEdge(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern.addEdge(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38);
		// Activity DelegationConnectors_P_PWP::assert_A_Unconnected_Pattern
		addToElementRepository("assert_A_Unconnected_Pattern", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern.setName("assert_A_Unconnected_Pattern");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern.addOwnedParameter(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern.addNode(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern.addNode(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern.addNode(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern.addEdge(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90);
		// Activity DelegationConnectors_P_PWP::assert_A_Star_Pattern
		addToElementRepository("assert_A_Star_Pattern", DelegationConnectors_P_PWP_assert_A_Star_Pattern);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern.setName("assert_A_Star_Pattern");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Star_Pattern.addOwnedParameter(DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern.addNode(DelegationConnectors_P_PWP_assert_A_Star_Pattern_message);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern.addNode(DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern_node);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern.addNode(DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern.addEdge(DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107);
		// Activity DelegationConnectors_P_PWP::instantiate_A_Empty_Pattern
		addToElementRepository("instantiate_A_Empty_Pattern", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern.setName("instantiate_A_Empty_Pattern");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern.addOwnedParameter(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern.addNode(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern.addNode(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern.addNode(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern.addEdge(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern.addEdge(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135);
		// Activity DelegationConnectors_P_PWP::main
		addToElementRepository("main", DelegationConnectors_P_PWP_main);
		DelegationConnectors_P_PWP_main.setName("main");
		DelegationConnectors_P_PWP_main.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main.addNode(DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern);
		DelegationConnectors_P_PWP_main.addNode(DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern);
		DelegationConnectors_P_PWP_main.addNode(DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern);
		DelegationConnectors_P_PWP_main.addNode(DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_main.addNode(DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern);
		DelegationConnectors_P_PWP_main.addNode(DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_main.addNode(DelegationConnectors_P_PWP_main_assert_A_Array_Pattern);
		DelegationConnectors_P_PWP_main.addNode(DelegationConnectors_P_PWP_main_assert_A_Star_Pattern);
		DelegationConnectors_P_PWP_main.addEdge(DelegationConnectors_P_PWP_main_ObjectFlow158);
		DelegationConnectors_P_PWP_main.addEdge(DelegationConnectors_P_PWP_main_ControlFlow143);
		DelegationConnectors_P_PWP_main.addEdge(DelegationConnectors_P_PWP_main_ControlFlow144);
		DelegationConnectors_P_PWP_main.addEdge(DelegationConnectors_P_PWP_main_ObjectFlow167);
		DelegationConnectors_P_PWP_main.addEdge(DelegationConnectors_P_PWP_main_ObjectFlow170);
		DelegationConnectors_P_PWP_main.addEdge(DelegationConnectors_P_PWP_main_ControlFlow151);
		DelegationConnectors_P_PWP_main.addEdge(DelegationConnectors_P_PWP_main_ObjectFlow152);
		// Activity DelegationConnectors_P_PWP::assert_A_Array_Pattern
		addToElementRepository("assert_A_Array_Pattern", DelegationConnectors_P_PWP_assert_A_Array_Pattern);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern.setName("assert_A_Array_Pattern");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Array_Pattern.addOwnedParameter(DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern.addNode(DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern.addNode(DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern_node);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern.addNode(DelegationConnectors_P_PWP_assert_A_Array_Pattern_message);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern.addEdge(DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71);
		// Activity DelegationConnectors_P_PWP::instantiate_A_Unconnected_Pattern
		addToElementRepository("instantiate_A_Unconnected_Pattern", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern.setName("instantiate_A_Unconnected_Pattern");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern.addOwnedParameter(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern.addNode(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern.addNode(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern.addNode(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern.addEdge(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern.addEdge(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode DelegationConnectors_P_PWP_assert_A_Star_Pattern::a_Star_Pattern_node
		addToElementRepository("a_Star_Pattern_node", DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern_node);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern_node.setName("a_Star_Pattern_node");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern_node.setParameter(DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern);
		// ActivityParameterNode DelegationConnectors_P_PWP_instantiate_A_Star_Pattern::a_Star_Pattern_node
		addToElementRepository("a_Star_Pattern_node", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node.setName("a_Star_Pattern_node");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node.setParameter(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern);
		// ActivityParameterNode DelegationConnectors_P_PWP_instantiate_A_Array_Pattern::a_Array_Pattern_node
		addToElementRepository("a_Array_Pattern_node", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node.setName("a_Array_Pattern_node");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node.setParameter(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern);
		// ActivityParameterNode DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern_node
		addToElementRepository("a_Unconnected_Pattern_node", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setName("a_Unconnected_Pattern_node");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setParameter(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// ActivityParameterNode DelegationConnectors_P_PWP_assert_A_Array_Pattern::a_Array_Pattern_node
		addToElementRepository("a_Array_Pattern_node", DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern_node);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern_node.setName("a_Array_Pattern_node");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern_node.setParameter(DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern);
		// ActivityParameterNode DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern::a_Unconnected_Pattern_node
		addToElementRepository("a_Unconnected_Pattern_node", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setName("a_Unconnected_Pattern_node");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setParameter(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// ActivityParameterNode DelegationConnectors_P_PWP_assert_A_Empty_Pattern::a_Empty_Pattern_node
		addToElementRepository("a_Empty_Pattern_node", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node.setName("a_Empty_Pattern_node");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node.setParameter(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern);
		// ActivityParameterNode DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern::a_Empty_Pattern_node
		addToElementRepository("a_Empty_Pattern_node", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setName("a_Empty_Pattern_node");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setParameter(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern);
	}

	private void initializeAssociation_Instances()
	{
		// Association DelegationConnectors_P_PWP::R
		addToElementRepository("R", DelegationConnectors_P_PWP_R);
		DelegationConnectors_P_PWP_R.setName("R");
		DelegationConnectors_P_PWP_R.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_R.addOwnedEnd(DelegationConnectors_P_PWP_R_x);
		DelegationConnectors_P_PWP_R.addOwnedEnd(DelegationConnectors_P_PWP_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction DelegationConnectors_P_PWP_main::instantiate_A_Star_Pattern
		addToElementRepository("instantiate_A_Star_Pattern", DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern);
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern.setName("instantiate_A_Star_Pattern");
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern.addResult(DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern.setBehavior(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern);
		// CallBehaviorAction DelegationConnectors_P_PWP_main::instantiate_A_Array_Pattern
		addToElementRepository("instantiate_A_Array_Pattern", DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern);
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern.setName("instantiate_A_Array_Pattern");
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern.addResult(DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern.setBehavior(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern);
		// CallBehaviorAction DelegationConnectors_P_PWP_assert_A_Empty_Pattern::writeLine
		addToElementRepository("writeLine", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine.setName("writeLine");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine.addResult(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine.addArgument(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value);
		// CallBehaviorAction DelegationConnectors_P_PWP_main::assert_A_Empty_Pattern
		addToElementRepository("assert_A_Empty_Pattern", DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern);
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern.setName("assert_A_Empty_Pattern");
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern.setBehavior(DelegationConnectors_P_PWP_assert_A_Empty_Pattern);
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern.addArgument(DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		// CallBehaviorAction DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern::writeLine
		addToElementRepository("writeLine", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine.setName("writeLine");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine.addResult(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine.addArgument(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value);
		// CallBehaviorAction DelegationConnectors_P_PWP_assert_A_Array_Pattern::writeLine
		addToElementRepository("writeLine", DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine.setName("writeLine");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine.addResult(DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine.addArgument(DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value);
		// CallBehaviorAction DelegationConnectors_P_PWP_main::instantiate_A_Unconnected_Pattern
		addToElementRepository("instantiate_A_Unconnected_Pattern", DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern.setName("instantiate_A_Unconnected_Pattern");
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern.addResult(DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern.setBehavior(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern);
		// CallBehaviorAction DelegationConnectors_P_PWP_main::instantiate_A_Empty_Pattern
		addToElementRepository("instantiate_A_Empty_Pattern", DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern);
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern.setName("instantiate_A_Empty_Pattern");
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern.addResult(DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern.setBehavior(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern);
		// CallBehaviorAction DelegationConnectors_P_PWP_main::assert_A_Unconnected_Pattern
		addToElementRepository("assert_A_Unconnected_Pattern", DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern.setName("assert_A_Unconnected_Pattern");
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern.setBehavior(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern.addArgument(DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// CallBehaviorAction DelegationConnectors_P_PWP_main::assert_A_Array_Pattern
		addToElementRepository("assert_A_Array_Pattern", DelegationConnectors_P_PWP_main_assert_A_Array_Pattern);
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern.setName("assert_A_Array_Pattern");
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern.setBehavior(DelegationConnectors_P_PWP_assert_A_Array_Pattern);
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern.addArgument(DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern);
		// CallBehaviorAction DelegationConnectors_P_PWP_assert_A_Star_Pattern::writeLine
		addToElementRepository("writeLine", DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine.setName("writeLine");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine.addResult(DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine.addArgument(DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value);
		// CallBehaviorAction DelegationConnectors_P_PWP_main::assert_A_Star_Pattern
		addToElementRepository("assert_A_Star_Pattern", DelegationConnectors_P_PWP_main_assert_A_Star_Pattern);
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern.setName("assert_A_Star_Pattern");
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern.setBehavior(DelegationConnectors_P_PWP_assert_A_Star_Pattern);
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern.addArgument(DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern::A_Empty_Pattern()
		addToElementRepository("A_Empty_Pattern()", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setName("A_Empty_Pattern()");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_.addResult(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setOperation(DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setTarget(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		// CallOperationAction DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern::A_Unconnected_Pattern()
		addToElementRepository("A_Unconnected_Pattern()", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setName("A_Unconnected_Pattern()");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.addResult(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setOperation(DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setTarget(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
		// CallOperationAction DelegationConnectors_P_PWP_instantiate_A_Star_Pattern::A_Star_Pattern()
		addToElementRepository("A_Star_Pattern()", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_.setName("A_Star_Pattern()");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_.addResult(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_.setOperation(DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_.setTarget(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		// CallOperationAction DelegationConnectors_P_PWP_instantiate_A_Array_Pattern::A_Array_Pattern()
		addToElementRepository("A_Array_Pattern()", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_.setName("A_Array_Pattern()");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_.addResult(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_.setOperation(DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_.setTarget(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target);
	}

	private void initializeClass_Instances()
	{
		// Class DelegationConnectors_P_PWP::A_Star_Pattern
		addToElementRepository("A_Star_Pattern", DelegationConnectors_P_PWP_A_Star_Pattern);
		DelegationConnectors_P_PWP_A_Star_Pattern.setName("A_Star_Pattern");
		DelegationConnectors_P_PWP_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_A_Star_Pattern.addOwnedAttribute(DelegationConnectors_P_PWP_A_Star_Pattern_b);
		DelegationConnectors_P_PWP_A_Star_Pattern.addOwnedAttribute(DelegationConnectors_P_PWP_A_Star_Pattern_p);
		
		DelegationConnectors_P_PWP_A_Star_Pattern.addOwnedConnector(DelegationConnectors_P_PWP_A_Star_Pattern_r);
		DelegationConnectors_P_PWP_A_Star_Pattern.addOwnedOperation(DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		// Class DelegationConnectors_P_PWP::B
		addToElementRepository("B", DelegationConnectors_P_PWP_B);
		DelegationConnectors_P_PWP_B.setName("B");
		DelegationConnectors_P_PWP_B.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_B.addOwnedAttribute(DelegationConnectors_P_PWP_B_q);
		// Class DelegationConnectors_P_PWP::IImpl
		addToElementRepository("IImpl", DelegationConnectors_P_PWP_IImpl);
		DelegationConnectors_P_PWP_IImpl.setName("IImpl");
		DelegationConnectors_P_PWP_IImpl.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_IImpl.addInterfaceRealization(DelegationConnectors_P_PWP_IImpl_I_Realization);
		// Class DelegationConnectors_P_PWP::A_Unconnected_Pattern
		addToElementRepository("A_Unconnected_Pattern", DelegationConnectors_P_PWP_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern.setName("A_Unconnected_Pattern");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_A_Unconnected_Pattern.addOwnedAttribute(DelegationConnectors_P_PWP_A_Unconnected_Pattern_b);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern.addOwnedAttribute(DelegationConnectors_P_PWP_A_Unconnected_Pattern_p);
		
		DelegationConnectors_P_PWP_A_Unconnected_Pattern.addOwnedConnector(DelegationConnectors_P_PWP_A_Unconnected_Pattern_r);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern.addOwnedOperation(DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		// Class DelegationConnectors_P_PWP::A_Array_Pattern
		addToElementRepository("A_Array_Pattern", DelegationConnectors_P_PWP_A_Array_Pattern);
		DelegationConnectors_P_PWP_A_Array_Pattern.setName("A_Array_Pattern");
		DelegationConnectors_P_PWP_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_A_Array_Pattern.addOwnedAttribute(DelegationConnectors_P_PWP_A_Array_Pattern_b);
		DelegationConnectors_P_PWP_A_Array_Pattern.addOwnedAttribute(DelegationConnectors_P_PWP_A_Array_Pattern_p);
		
		DelegationConnectors_P_PWP_A_Array_Pattern.addOwnedConnector(DelegationConnectors_P_PWP_A_Array_Pattern_r);
		DelegationConnectors_P_PWP_A_Array_Pattern.addOwnedOperation(DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		// Class DelegationConnectors_P_PWP::A_Empty_Pattern
		addToElementRepository("A_Empty_Pattern", DelegationConnectors_P_PWP_A_Empty_Pattern);
		DelegationConnectors_P_PWP_A_Empty_Pattern.setName("A_Empty_Pattern");
		DelegationConnectors_P_PWP_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_A_Empty_Pattern.addOwnedAttribute(DelegationConnectors_P_PWP_A_Empty_Pattern_b);
		DelegationConnectors_P_PWP_A_Empty_Pattern.addOwnedAttribute(DelegationConnectors_P_PWP_A_Empty_Pattern_p);
		
		DelegationConnectors_P_PWP_A_Empty_Pattern.addOwnedConnector(DelegationConnectors_P_PWP_A_Empty_Pattern_r);
		DelegationConnectors_P_PWP_A_Empty_Pattern.addOwnedOperation(DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
	}

	private void initializeComment_Instances()
	{
		// Comment DelegationConnectors_P_PWP::Comment78
		addToElementRepository("Comment78", DelegationConnectors_P_PWP_Comment78);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment DelegationConnectors_P_PWP_A_Empty_Pattern::Comment59
		addToElementRepository("Comment59", DelegationConnectors_P_PWP_A_Empty_Pattern_Comment59);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment DelegationConnectors_P_PWP_A_Unconnected_Pattern::Comment126
		addToElementRepository("Comment126", DelegationConnectors_P_PWP_A_Unconnected_Pattern_Comment126);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment DelegationConnectors_P_PWP_A_Star_Pattern::Comment89
		addToElementRepository("Comment89", DelegationConnectors_P_PWP_A_Star_Pattern_Comment89);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment DelegationConnectors_P_PWP_A_Array_Pattern::Comment54
		addToElementRepository("Comment54", DelegationConnectors_P_PWP_A_Array_Pattern_Comment54);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector DelegationConnectors_P_PWP_A_Array_Pattern::r
		addToElementRepository("r", DelegationConnectors_P_PWP_A_Array_Pattern_r);
		DelegationConnectors_P_PWP_A_Array_Pattern_r.setName("r");
		DelegationConnectors_P_PWP_A_Array_Pattern_r.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Array_Pattern_r.addEnd(DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd48);
		DelegationConnectors_P_PWP_A_Array_Pattern_r.addEnd(DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd46);
		DelegationConnectors_P_PWP_A_Array_Pattern_r.setType(DelegationConnectors_P_PWP_R);
		// Connector DelegationConnectors_P_PWP_A_Unconnected_Pattern::r
		addToElementRepository("r", DelegationConnectors_P_PWP_A_Unconnected_Pattern_r);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r.setName("r");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r.addEnd(DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r.addEnd(DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r.setType(DelegationConnectors_P_PWP_R);
		// Connector DelegationConnectors_P_PWP_A_Star_Pattern::r
		addToElementRepository("r", DelegationConnectors_P_PWP_A_Star_Pattern_r);
		DelegationConnectors_P_PWP_A_Star_Pattern_r.setName("r");
		DelegationConnectors_P_PWP_A_Star_Pattern_r.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Star_Pattern_r.addEnd(DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86);
		DelegationConnectors_P_PWP_A_Star_Pattern_r.addEnd(DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83);
		DelegationConnectors_P_PWP_A_Star_Pattern_r.setType(DelegationConnectors_P_PWP_R);
		// Connector DelegationConnectors_P_PWP_A_Empty_Pattern::r
		addToElementRepository("r", DelegationConnectors_P_PWP_A_Empty_Pattern_r);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r.setName("r");
		DelegationConnectors_P_PWP_A_Empty_Pattern_r.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r.addEnd(DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd60);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r.addEnd(DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd62);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r.setType(DelegationConnectors_P_PWP_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd DelegationConnectors_P_PWP_A_Unconnected_Pattern_r::ConnectorEnd118
		addToElementRepository("ConnectorEnd118", DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118.setUpper(-1);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118.setLower(0);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118.setRole(DelegationConnectors_P_PWP_A_Unconnected_Pattern_p);
		// ConnectorEnd DelegationConnectors_P_PWP_A_Array_Pattern_r::ConnectorEnd46
		addToElementRepository("ConnectorEnd46", DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd46);
		DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd46.setUpper(-1);
		DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd46.setRole(DelegationConnectors_P_PWP_B_q);
		DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd46.setPartWithPort(DelegationConnectors_P_PWP_A_Array_Pattern_b);
		// ConnectorEnd DelegationConnectors_P_PWP_A_Star_Pattern_r::ConnectorEnd83
		addToElementRepository("ConnectorEnd83", DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83.setUpper(-1);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83.setLower(4);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83.setRole(DelegationConnectors_P_PWP_B_q);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83.setPartWithPort(DelegationConnectors_P_PWP_A_Star_Pattern_b);
		// ConnectorEnd DelegationConnectors_P_PWP_A_Empty_Pattern_r::ConnectorEnd60
		addToElementRepository("ConnectorEnd60", DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd60);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd60.setUpper(-1);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd60.setRole(DelegationConnectors_P_PWP_A_Empty_Pattern_p);
		// ConnectorEnd DelegationConnectors_P_PWP_A_Unconnected_Pattern_r::ConnectorEnd121
		addToElementRepository("ConnectorEnd121", DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121.setUpper(-1);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121.setLower(0);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121.setRole(DelegationConnectors_P_PWP_B_q);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121.setPartWithPort(DelegationConnectors_P_PWP_A_Unconnected_Pattern_b);
		// ConnectorEnd DelegationConnectors_P_PWP_A_Star_Pattern_r::ConnectorEnd86
		addToElementRepository("ConnectorEnd86", DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86.setUpper(-1);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86.setLower(3);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86.setRole(DelegationConnectors_P_PWP_A_Star_Pattern_p);
		// ConnectorEnd DelegationConnectors_P_PWP_A_Empty_Pattern_r::ConnectorEnd62
		addToElementRepository("ConnectorEnd62", DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd62);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd62.setUpper(-1);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd62.setRole(DelegationConnectors_P_PWP_B_q);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd62.setPartWithPort(DelegationConnectors_P_PWP_A_Empty_Pattern_b);
		// ConnectorEnd DelegationConnectors_P_PWP_A_Array_Pattern_r::ConnectorEnd48
		addToElementRepository("ConnectorEnd48", DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd48);
		DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd48.setUpper(-1);
		DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd48.setRole(DelegationConnectors_P_PWP_A_Array_Pattern_p);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow DelegationConnectors_P_PWP_main::ControlFlow143
		addToElementRepository("ControlFlow143", DelegationConnectors_P_PWP_main_ControlFlow143);
		DelegationConnectors_P_PWP_main_ControlFlow143.setName("ControlFlow143");
		DelegationConnectors_P_PWP_main_ControlFlow143.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_main_ControlFlow143.setSource(DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern);
		DelegationConnectors_P_PWP_main_ControlFlow143.setTarget(DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern);
		// ControlFlow DelegationConnectors_P_PWP_main::ControlFlow144
		addToElementRepository("ControlFlow144", DelegationConnectors_P_PWP_main_ControlFlow144);
		DelegationConnectors_P_PWP_main_ControlFlow144.setName("ControlFlow144");
		DelegationConnectors_P_PWP_main_ControlFlow144.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_main_ControlFlow144.setSource(DelegationConnectors_P_PWP_main_assert_A_Array_Pattern);
		DelegationConnectors_P_PWP_main_ControlFlow144.setTarget(DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern);
		// ControlFlow DelegationConnectors_P_PWP_main::ControlFlow151
		addToElementRepository("ControlFlow151", DelegationConnectors_P_PWP_main_ControlFlow151);
		DelegationConnectors_P_PWP_main_ControlFlow151.setName("ControlFlow151");
		DelegationConnectors_P_PWP_main_ControlFlow151.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_main_ControlFlow151.setSource(DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_main_ControlFlow151.setTarget(DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction DelegationConnectors_P_PWP_instantiate_A_Array_Pattern::Create A_Array_Pattern
		addToElementRepository("Create A_Array_Pattern", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setName("Create A_Array_Pattern");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setClassifier(DelegationConnectors_P_PWP_A_Array_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setResult(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		// CreateObjectAction DelegationConnectors_P_PWP_instantiate_A_Star_Pattern::Create A_Star_Pattern
		addToElementRepository("Create A_Star_Pattern", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setName("Create A_Star_Pattern");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setClassifier(DelegationConnectors_P_PWP_A_Star_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setResult(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		// CreateObjectAction DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern::Create A_Unconnected_Pattern
		addToElementRepository("Create A_Unconnected_Pattern", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setName("Create A_Unconnected_Pattern");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setClassifier(DelegationConnectors_P_PWP_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setResult(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		// CreateObjectAction DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern::Create A_Empty_Pattern
		addToElementRepository("Create A_Empty_Pattern", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setName("Create A_Empty_Pattern");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setClassifier(DelegationConnectors_P_PWP_A_Empty_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setResult(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine::value
		addToElementRepository("value", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value.setName("value");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()::target
		addToElementRepository("target", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target.setName("target");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target.setType(DelegationConnectors_P_PWP_A_Star_Pattern);
		// InputPin DelegationConnectors_P_PWP_main_assert_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern.setType(DelegationConnectors_P_PWP_A_Array_Pattern);
		// InputPin DelegationConnectors_P_PWP_main_assert_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern.setType(DelegationConnectors_P_PWP_A_Star_Pattern);
		// InputPin DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern.setType(DelegationConnectors_P_PWP_A_Empty_Pattern);
		// InputPin DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()::target
		addToElementRepository("target", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setName("target");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setType(DelegationConnectors_P_PWP_A_Empty_Pattern);
		// InputPin DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(DelegationConnectors_P_PWP_A_Unconnected_Pattern);
		// InputPin DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()::target
		addToElementRepository("target", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target.setName("target");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target.setType(DelegationConnectors_P_PWP_A_Array_Pattern);
		// InputPin DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()::target
		addToElementRepository("target", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setName("target");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setType(DelegationConnectors_P_PWP_A_Unconnected_Pattern);
		// InputPin DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine::value
		addToElementRepository("value", DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value.setName("value");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine::value
		addToElementRepository("value", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value.setName("value");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine::value
		addToElementRepository("value", DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value.setName("value");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
	}

	private void initializeInterface_Instances()
	{
		// Interface DelegationConnectors_P_PWP::I
		addToElementRepository("I", DelegationConnectors_P_PWP_I);
		DelegationConnectors_P_PWP_I.setName("I");
		DelegationConnectors_P_PWP_I.setVisibility(VisibilityKind.public_);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization DelegationConnectors_P_PWP_IImpl::I_Realization
		addToElementRepository("I_Realization", DelegationConnectors_P_PWP_IImpl_I_Realization);
		DelegationConnectors_P_PWP_IImpl_I_Realization.setName("I_Realization");
		DelegationConnectors_P_PWP_IImpl_I_Realization.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_IImpl_I_Realization.setContract(DelegationConnectors_P_PWP_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132::LiteralBoolean133
		addToElementRepository("LiteralBoolean133", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132_LiteralBoolean133);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132_LiteralBoolean133.setName("LiteralBoolean133");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132_LiteralBoolean133.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132_LiteralBoolean133.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0::LiteralBoolean1
		addToElementRepository("LiteralBoolean1", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0_LiteralBoolean1);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0_LiteralBoolean1.setName("LiteralBoolean1");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0_LiteralBoolean1.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0_LiteralBoolean1.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90::LiteralBoolean91
		addToElementRepository("LiteralBoolean91", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90_LiteralBoolean91);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90_LiteralBoolean91.setName("LiteralBoolean91");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90_LiteralBoolean91.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90_LiteralBoolean91.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187::LiteralBoolean188
		addToElementRepository("LiteralBoolean188", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187_LiteralBoolean188);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187_LiteralBoolean188.setName("LiteralBoolean188");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187_LiteralBoolean188.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187_LiteralBoolean188.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_main_ObjectFlow152::LiteralBoolean153
		addToElementRepository("LiteralBoolean153", DelegationConnectors_P_PWP_main_ObjectFlow152_LiteralBoolean153);
		DelegationConnectors_P_PWP_main_ObjectFlow152_LiteralBoolean153.setName("LiteralBoolean153");
		DelegationConnectors_P_PWP_main_ObjectFlow152_LiteralBoolean153.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_ObjectFlow152_LiteralBoolean153.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5::LiteralBoolean7
		addToElementRepository("LiteralBoolean7", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5_LiteralBoolean7);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5_LiteralBoolean7.setName("LiteralBoolean7");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5_LiteralBoolean7.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5_LiteralBoolean7.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_main_ObjectFlow170::LiteralBoolean171
		addToElementRepository("LiteralBoolean171", DelegationConnectors_P_PWP_main_ObjectFlow170_LiteralBoolean171);
		DelegationConnectors_P_PWP_main_ObjectFlow170_LiteralBoolean171.setName("LiteralBoolean171");
		DelegationConnectors_P_PWP_main_ObjectFlow170_LiteralBoolean171.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_ObjectFlow170_LiteralBoolean171.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107::LiteralBoolean108
		addToElementRepository("LiteralBoolean108", DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107_LiteralBoolean108);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107_LiteralBoolean108.setName("LiteralBoolean108");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107_LiteralBoolean108.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107_LiteralBoolean108.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_main_ObjectFlow158::LiteralBoolean159
		addToElementRepository("LiteralBoolean159", DelegationConnectors_P_PWP_main_ObjectFlow158_LiteralBoolean159);
		DelegationConnectors_P_PWP_main_ObjectFlow158_LiteralBoolean159.setName("LiteralBoolean159");
		DelegationConnectors_P_PWP_main_ObjectFlow158_LiteralBoolean159.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_ObjectFlow158_LiteralBoolean159.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_main_ObjectFlow167::LiteralBoolean169
		addToElementRepository("LiteralBoolean169", DelegationConnectors_P_PWP_main_ObjectFlow167_LiteralBoolean169);
		DelegationConnectors_P_PWP_main_ObjectFlow167_LiteralBoolean169.setName("LiteralBoolean169");
		DelegationConnectors_P_PWP_main_ObjectFlow167_LiteralBoolean169.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_ObjectFlow167_LiteralBoolean169.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135::LiteralBoolean136
		addToElementRepository("LiteralBoolean136", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135_LiteralBoolean136);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135_LiteralBoolean136.setName("LiteralBoolean136");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135_LiteralBoolean136.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135_LiteralBoolean136.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19::LiteralBoolean20
		addToElementRepository("LiteralBoolean20", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19_LiteralBoolean20);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19_LiteralBoolean20.setName("LiteralBoolean20");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19_LiteralBoolean20.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19_LiteralBoolean20.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184::LiteralBoolean185
		addToElementRepository("LiteralBoolean185", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184_LiteralBoolean185);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184_LiteralBoolean185.setName("LiteralBoolean185");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184_LiteralBoolean185.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184_LiteralBoolean185.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71::LiteralBoolean73
		addToElementRepository("LiteralBoolean73", DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71_LiteralBoolean73);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71_LiteralBoolean73.setName("LiteralBoolean73");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71_LiteralBoolean73.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71_LiteralBoolean73.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32::LiteralBoolean34
		addToElementRepository("LiteralBoolean34", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32_LiteralBoolean34);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32_LiteralBoolean34.setName("LiteralBoolean34");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32_LiteralBoolean34.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32_LiteralBoolean34.setValue(true);
		// LiteralBoolean DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38::LiteralBoolean40
		addToElementRepository("LiteralBoolean40", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38_LiteralBoolean40);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38_LiteralBoolean40.setName("LiteralBoolean40");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38_LiteralBoolean40.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38_LiteralBoolean40.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result::LiteralInteger23
		addToElementRepository("LiteralInteger23", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result_LiteralInteger23);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result_LiteralInteger23.setName("LiteralInteger23");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result_LiteralInteger23.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result_LiteralInteger23.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result::LiteralInteger103
		addToElementRepository("LiteralInteger103", DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result_LiteralInteger103);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result_LiteralInteger103.setName("LiteralInteger103");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result_LiteralInteger103.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result_LiteralInteger103.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node::LiteralInteger37
		addToElementRepository("LiteralInteger37", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger37);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger37.setName("LiteralInteger37");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger37.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger37.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value::LiteralInteger93
		addToElementRepository("LiteralInteger93", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger93);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger93.setName("LiteralInteger93");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger93.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger93.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83::LiteralInteger84
		addToElementRepository("LiteralInteger84", DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83_LiteralInteger84);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83_LiteralInteger84.setName("LiteralInteger84");
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83_LiteralInteger84.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83_LiteralInteger84.setValue(4);
		// LiteralInteger DelegationConnectors_P_PWP_A_Empty_Pattern_p::LiteralInteger58
		addToElementRepository("LiteralInteger58", DelegationConnectors_P_PWP_A_Empty_Pattern_p_LiteralInteger58);
		DelegationConnectors_P_PWP_A_Empty_Pattern_p_LiteralInteger58.setName("LiteralInteger58");
		DelegationConnectors_P_PWP_A_Empty_Pattern_p_LiteralInteger58.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Empty_Pattern_p_LiteralInteger58.setValue(0);
		// LiteralInteger DelegationConnectors_P_PWP_R_y::LiteralInteger31
		addToElementRepository("LiteralInteger31", DelegationConnectors_P_PWP_R_y_LiteralInteger31);
		DelegationConnectors_P_PWP_R_y_LiteralInteger31.setName("LiteralInteger31");
		DelegationConnectors_P_PWP_R_y_LiteralInteger31.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_R_y_LiteralInteger31.setValue(0);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187::LiteralInteger189
		addToElementRepository("LiteralInteger189", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187_LiteralInteger189);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187_LiteralInteger189.setName("LiteralInteger189");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187_LiteralInteger189.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187_LiteralInteger189.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71::LiteralInteger72
		addToElementRepository("LiteralInteger72", DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71_LiteralInteger72);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71_LiteralInteger72.setName("LiteralInteger72");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71_LiteralInteger72.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71_LiteralInteger72.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()_target::LiteralInteger8
		addToElementRepository("LiteralInteger8", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger8);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger8.setName("LiteralInteger8");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger8.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger8.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107::LiteralInteger109
		addToElementRepository("LiteralInteger109", DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107_LiteralInteger109);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107_LiteralInteger109.setName("LiteralInteger109");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107_LiteralInteger109.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107_LiteralInteger109.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralInteger177
		addToElementRepository("LiteralInteger177", DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger177);
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger177.setName("LiteralInteger177");
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger177.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger177.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184::LiteralInteger186
		addToElementRepository("LiteralInteger186", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184_LiteralInteger186);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184_LiteralInteger186.setName("LiteralInteger186");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184_LiteralInteger186.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184_LiteralInteger186.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result::LiteralInteger76
		addToElementRepository("LiteralInteger76", DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result_LiteralInteger76);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result_LiteralInteger76.setName("LiteralInteger76");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result_LiteralInteger76.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result_LiteralInteger76.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_R_x::LiteralInteger28
		addToElementRepository("LiteralInteger28", DelegationConnectors_P_PWP_R_x_LiteralInteger28);
		DelegationConnectors_P_PWP_R_x_LiteralInteger28.setName("LiteralInteger28");
		DelegationConnectors_P_PWP_R_x_LiteralInteger28.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_R_x_LiteralInteger28.setValue(0);
		// LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralInteger176
		addToElementRepository("LiteralInteger176", DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger176);
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger176.setName("LiteralInteger176");
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger176.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger176.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19::LiteralInteger21
		addToElementRepository("LiteralInteger21", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19_LiteralInteger21);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19_LiteralInteger21.setName("LiteralInteger21");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19_LiteralInteger21.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19_LiteralInteger21.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger141
		addToElementRepository("LiteralInteger141", DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger141);
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger141.setName("LiteralInteger141");
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger141.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger141.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0::LiteralInteger2
		addToElementRepository("LiteralInteger2", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0_LiteralInteger2);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0_LiteralInteger2.setName("LiteralInteger2");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0_LiteralInteger2.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0_LiteralInteger2.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralInteger131
		addToElementRepository("LiteralInteger131", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger131);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger131.setName("LiteralInteger131");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger131.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger131.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_A_Star_Pattern_b::LiteralInteger82
		addToElementRepository("LiteralInteger82", DelegationConnectors_P_PWP_A_Star_Pattern_b_LiteralInteger82);
		DelegationConnectors_P_PWP_A_Star_Pattern_b_LiteralInteger82.setName("LiteralInteger82");
		DelegationConnectors_P_PWP_A_Star_Pattern_b_LiteralInteger82.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Star_Pattern_b_LiteralInteger82.setValue(2);
		// LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralInteger156
		addToElementRepository("LiteralInteger156", DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger156);
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger156.setName("LiteralInteger156");
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger156.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger156.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralInteger15
		addToElementRepository("LiteralInteger15", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger15);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger15.setName("LiteralInteger15");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger15.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger15.setValue(0);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern_node::LiteralInteger106
		addToElementRepository("LiteralInteger106", DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger106);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger106.setName("LiteralInteger106");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger106.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger106.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralInteger97
		addToElementRepository("LiteralInteger97", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger97);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger97.setName("LiteralInteger97");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger97.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger97.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern_result::LiteralInteger191
		addToElementRepository("LiteralInteger191", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger191);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger191.setName("LiteralInteger191");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger191.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger191.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create A_Empty_Pattern_result::LiteralInteger139
		addToElementRepository("LiteralInteger139", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger139);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger139.setName("LiteralInteger139");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger139.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger139.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value::LiteralInteger16
		addToElementRepository("LiteralInteger16", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger16);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger16.setName("LiteralInteger16");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger16.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger16.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create A_Star_Pattern_result::LiteralInteger4
		addToElementRepository("LiteralInteger4", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger4);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger4.setName("LiteralInteger4");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger4.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger4.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create A_Array_Pattern_result::LiteralInteger35
		addToElementRepository("LiteralInteger35", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger35);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger35.setName("LiteralInteger35");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger35.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger35.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralInteger10
		addToElementRepository("LiteralInteger10", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger10);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger10.setName("LiteralInteger10");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger10.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger10.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger173
		addToElementRepository("LiteralInteger173", DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger173);
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger173.setName("LiteralInteger173");
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger173.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger173.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus::LiteralInteger65
		addToElementRepository("LiteralInteger65", DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger65);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger65.setName("LiteralInteger65");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger65.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger65.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralInteger130
		addToElementRepository("LiteralInteger130", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger130);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger130.setName("LiteralInteger130");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger130.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger130.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121::LiteralInteger123
		addToElementRepository("LiteralInteger123", DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121_LiteralInteger123);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121_LiteralInteger123.setName("LiteralInteger123");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121_LiteralInteger123.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121_LiteralInteger123.setValue(0);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralInteger42
		addToElementRepository("LiteralInteger42", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger42);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger42.setName("LiteralInteger42");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger42.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger42.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_ObjectFlow170::LiteralInteger172
		addToElementRepository("LiteralInteger172", DelegationConnectors_P_PWP_main_ObjectFlow170_LiteralInteger172);
		DelegationConnectors_P_PWP_main_ObjectFlow170_LiteralInteger172.setName("LiteralInteger172");
		DelegationConnectors_P_PWP_main_ObjectFlow170_LiteralInteger172.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_ObjectFlow170_LiteralInteger172.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_A_Unconnected_Pattern_b::LiteralInteger124
		addToElementRepository("LiteralInteger124", DelegationConnectors_P_PWP_A_Unconnected_Pattern_b_LiteralInteger124);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_b_LiteralInteger124.setName("LiteralInteger124");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_b_LiteralInteger124.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_b_LiteralInteger124.setValue(2);
		// LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralInteger165
		addToElementRepository("LiteralInteger165", DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger165);
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger165.setName("LiteralInteger165");
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger165.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger165.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result::LiteralInteger100
		addToElementRepository("LiteralInteger100", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result_LiteralInteger100);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result_LiteralInteger100.setName("LiteralInteger100");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result_LiteralInteger100.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result_LiteralInteger100.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralInteger181
		addToElementRepository("LiteralInteger181", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger181);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger181.setName("LiteralInteger181");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger181.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger181.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralInteger13
		addToElementRepository("LiteralInteger13", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger13);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger13.setName("LiteralInteger13");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger13.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger13.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value::LiteralInteger94
		addToElementRepository("LiteralInteger94", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger94);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger94.setName("LiteralInteger94");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger94.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger94.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger148
		addToElementRepository("LiteralInteger148", DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger148);
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger148.setName("LiteralInteger148");
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger148.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger148.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118::LiteralInteger120
		addToElementRepository("LiteralInteger120", DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralInteger120);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralInteger120.setName("LiteralInteger120");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralInteger120.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralInteger120.setValue(0);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus::LiteralInteger66
		addToElementRepository("LiteralInteger66", DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger66);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger66.setName("LiteralInteger66");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger66.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger66.setValue(0);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralInteger96
		addToElementRepository("LiteralInteger96", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger96);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger96.setName("LiteralInteger96");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger96.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger96.setValue(0);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value::LiteralInteger68
		addToElementRepository("LiteralInteger68", DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger68);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger68.setName("LiteralInteger68");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger68.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger68.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralInteger166
		addToElementRepository("LiteralInteger166", DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger166);
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger166.setName("LiteralInteger166");
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger166.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger166.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90::LiteralInteger92
		addToElementRepository("LiteralInteger92", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90_LiteralInteger92);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90_LiteralInteger92.setName("LiteralInteger92");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90_LiteralInteger92.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90_LiteralInteger92.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()_target::LiteralInteger44
		addToElementRepository("LiteralInteger44", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger44);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger44.setName("LiteralInteger44");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger44.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger44.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger142
		addToElementRepository("LiteralInteger142", DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger142);
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger142.setName("LiteralInteger142");
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger142.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger142.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()_target::LiteralInteger127
		addToElementRepository("LiteralInteger127", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger127);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger127.setName("LiteralInteger127");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger127.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger127.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value::LiteralInteger115
		addToElementRepository("LiteralInteger115", DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger115);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger115.setName("LiteralInteger115");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger115.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger115.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38::LiteralInteger39
		addToElementRepository("LiteralInteger39", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38_LiteralInteger39);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38_LiteralInteger39.setName("LiteralInteger39");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38_LiteralInteger39.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38_LiteralInteger39.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_ObjectFlow167::LiteralInteger168
		addToElementRepository("LiteralInteger168", DelegationConnectors_P_PWP_main_ObjectFlow167_LiteralInteger168);
		DelegationConnectors_P_PWP_main_ObjectFlow167_LiteralInteger168.setName("LiteralInteger168");
		DelegationConnectors_P_PWP_main_ObjectFlow167_LiteralInteger168.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_ObjectFlow167_LiteralInteger168.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_A_Empty_Pattern_b::LiteralInteger56
		addToElementRepository("LiteralInteger56", DelegationConnectors_P_PWP_A_Empty_Pattern_b_LiteralInteger56);
		DelegationConnectors_P_PWP_A_Empty_Pattern_b_LiteralInteger56.setName("LiteralInteger56");
		DelegationConnectors_P_PWP_A_Empty_Pattern_b_LiteralInteger56.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Empty_Pattern_b_LiteralInteger56.setValue(0);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus::LiteralInteger111
		addToElementRepository("LiteralInteger111", DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger111);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger111.setName("LiteralInteger111");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger111.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger111.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralInteger183
		addToElementRepository("LiteralInteger183", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger183);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger183.setName("LiteralInteger183");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger183.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger183.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_A_Unconnected_Pattern_p::LiteralInteger116
		addToElementRepository("LiteralInteger116", DelegationConnectors_P_PWP_A_Unconnected_Pattern_p_LiteralInteger116);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p_LiteralInteger116.setName("LiteralInteger116");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p_LiteralInteger116.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p_LiteralInteger116.setValue(3);
		// LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralInteger157
		addToElementRepository("LiteralInteger157", DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger157);
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger157.setName("LiteralInteger157");
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger157.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger157.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralInteger43
		addToElementRepository("LiteralInteger43", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger43);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger43.setName("LiteralInteger43");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger43.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger43.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralInteger11
		addToElementRepository("LiteralInteger11", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger11);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger11.setName("LiteralInteger11");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger11.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger11.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value::LiteralInteger113
		addToElementRepository("LiteralInteger113", DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger113);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger113.setName("LiteralInteger113");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger113.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger113.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_target::LiteralInteger180
		addToElementRepository("LiteralInteger180", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger180);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger180.setName("LiteralInteger180");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger180.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger180.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value::LiteralInteger18
		addToElementRepository("LiteralInteger18", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger18);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger18.setName("LiteralInteger18");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger18.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger18.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralInteger163
		addToElementRepository("LiteralInteger163", DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger163);
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger163.setName("LiteralInteger163");
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger163.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger163.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus::LiteralInteger112
		addToElementRepository("LiteralInteger112", DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger112);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger112.setName("LiteralInteger112");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger112.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger112.setValue(0);
		// LiteralInteger DelegationConnectors_P_PWP_main_ObjectFlow158::LiteralInteger160
		addToElementRepository("LiteralInteger160", DelegationConnectors_P_PWP_main_ObjectFlow158_LiteralInteger160);
		DelegationConnectors_P_PWP_main_ObjectFlow158_LiteralInteger160.setName("LiteralInteger160");
		DelegationConnectors_P_PWP_main_ObjectFlow158_LiteralInteger160.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_ObjectFlow158_LiteralInteger160.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135::LiteralInteger137
		addToElementRepository("LiteralInteger137", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135_LiteralInteger137);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135_LiteralInteger137.setName("LiteralInteger137");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135_LiteralInteger137.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135_LiteralInteger137.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_ObjectFlow152::LiteralInteger154
		addToElementRepository("LiteralInteger154", DelegationConnectors_P_PWP_main_ObjectFlow152_LiteralInteger154);
		DelegationConnectors_P_PWP_main_ObjectFlow152_LiteralInteger154.setName("LiteralInteger154");
		DelegationConnectors_P_PWP_main_ObjectFlow152_LiteralInteger154.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_ObjectFlow152_LiteralInteger154.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_A_Array_Pattern_b::LiteralInteger50
		addToElementRepository("LiteralInteger50", DelegationConnectors_P_PWP_A_Array_Pattern_b_LiteralInteger50);
		DelegationConnectors_P_PWP_A_Array_Pattern_b_LiteralInteger50.setName("LiteralInteger50");
		DelegationConnectors_P_PWP_A_Array_Pattern_b_LiteralInteger50.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Array_Pattern_b_LiteralInteger50.setValue(2);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5::LiteralInteger6
		addToElementRepository("LiteralInteger6", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5_LiteralInteger6);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5_LiteralInteger6.setName("LiteralInteger6");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5_LiteralInteger6.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5_LiteralInteger6.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86::LiteralInteger87
		addToElementRepository("LiteralInteger87", DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86_LiteralInteger87);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86_LiteralInteger87.setName("LiteralInteger87");
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86_LiteralInteger87.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86_LiteralInteger87.setValue(3);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node::LiteralInteger99
		addToElementRepository("LiteralInteger99", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger99);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger99.setName("LiteralInteger99");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger99.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger99.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern_node::LiteralInteger74
		addToElementRepository("LiteralInteger74", DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger74);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger74.setName("LiteralInteger74");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger74.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger74.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_A_Star_Pattern_p::LiteralInteger80
		addToElementRepository("LiteralInteger80", DelegationConnectors_P_PWP_A_Star_Pattern_p_LiteralInteger80);
		DelegationConnectors_P_PWP_A_Star_Pattern_p_LiteralInteger80.setName("LiteralInteger80");
		DelegationConnectors_P_PWP_A_Star_Pattern_p_LiteralInteger80.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Star_Pattern_p_LiteralInteger80.setValue(3);
		// LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralInteger162
		addToElementRepository("LiteralInteger162", DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger162);
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger162.setName("LiteralInteger162");
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger162.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger162.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32::LiteralInteger33
		addToElementRepository("LiteralInteger33", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32_LiteralInteger33);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32_LiteralInteger33.setName("LiteralInteger33");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32_LiteralInteger33.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32_LiteralInteger33.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger175
		addToElementRepository("LiteralInteger175", DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger175);
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger175.setName("LiteralInteger175");
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger175.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger175.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value::LiteralInteger69
		addToElementRepository("LiteralInteger69", DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger69);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger69.setName("LiteralInteger69");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger69.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger69.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_B_q::LiteralInteger27
		addToElementRepository("LiteralInteger27", DelegationConnectors_P_PWP_B_q_LiteralInteger27);
		DelegationConnectors_P_PWP_B_q_LiteralInteger27.setName("LiteralInteger27");
		DelegationConnectors_P_PWP_B_q_LiteralInteger27.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_B_q_LiteralInteger27.setValue(2);
		// LiteralInteger DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132::LiteralInteger134
		addToElementRepository("LiteralInteger134", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132_LiteralInteger134);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132_LiteralInteger134.setName("LiteralInteger134");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132_LiteralInteger134.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132_LiteralInteger134.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_A_Array_Pattern_p::LiteralInteger52
		addToElementRepository("LiteralInteger52", DelegationConnectors_P_PWP_A_Array_Pattern_p_LiteralInteger52);
		DelegationConnectors_P_PWP_A_Array_Pattern_p_LiteralInteger52.setName("LiteralInteger52");
		DelegationConnectors_P_PWP_A_Array_Pattern_p_LiteralInteger52.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Array_Pattern_p_LiteralInteger52.setValue(4);
		// LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger146
		addToElementRepository("LiteralInteger146", DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger146);
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger146.setName("LiteralInteger146");
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger146.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger146.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger147
		addToElementRepository("LiteralInteger147", DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger147);
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger147.setName("LiteralInteger147");
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger147.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger147.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger150
		addToElementRepository("LiteralInteger150", DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger150);
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger150.setName("LiteralInteger150");
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger150.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger150.setValue(1);
		// LiteralInteger DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node::LiteralInteger22
		addToElementRepository("LiteralInteger22", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger22);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger22.setName("LiteralInteger22");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger22.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger22.setValue(1);
	}

	private void initializeLiteralString_Instances()
	{
		// LiteralString DelegationConnectors_P_PWP_assert_A_Array_Pattern_message::LiteralString75
		addToElementRepository("LiteralString75", DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_LiteralString75);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_LiteralString75.setName("LiteralString75");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_LiteralString75.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_LiteralString75.setValue("Assertion currently not implemented for A_Array_Pattern.");
		// LiteralString DelegationConnectors_P_PWP_assert_A_Star_Pattern_message::LiteralString105
		addToElementRepository("LiteralString105", DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_LiteralString105);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_LiteralString105.setName("LiteralString105");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_LiteralString105.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_LiteralString105.setValue("Assertion currently not implemented for A_Star_Pattern.");
		// LiteralString DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message::LiteralString25
		addToElementRepository("LiteralString25", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_LiteralString25);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_LiteralString25.setName("LiteralString25");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_LiteralString25.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_LiteralString25.setValue("Assertion currently not implemented for A_Empty_Pattern.");
		// LiteralString DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message::LiteralString102
		addToElementRepository("LiteralString102", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_LiteralString102);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_LiteralString102.setName("LiteralString102");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_LiteralString102.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_LiteralString102.setValue("Assertion currently not implemented for A_Unconnected_Pattern.");
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result::LiteralUnlimitedNatural24
		addToElementRepository("LiteralUnlimitedNatural24", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural24);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural24.setName("LiteralUnlimitedNatural24");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural24.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural24.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd48::LiteralUnlimitedNatural49
		addToElementRepository("LiteralUnlimitedNatural49", DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd48_LiteralUnlimitedNatural49);
		DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd48_LiteralUnlimitedNatural49.setName("LiteralUnlimitedNatural49");
		DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd48_LiteralUnlimitedNatural49.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd48_LiteralUnlimitedNatural49.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralUnlimitedNatural174
		addToElementRepository("LiteralUnlimitedNatural174", DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural174);
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural174.setName("LiteralUnlimitedNatural174");
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural174.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural174.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value::LiteralUnlimitedNatural114
		addToElementRepository("LiteralUnlimitedNatural114", DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural114);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural114.setName("LiteralUnlimitedNatural114");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural114.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural114.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result::LiteralUnlimitedNatural77
		addToElementRepository("LiteralUnlimitedNatural77", DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural77);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural77.setName("LiteralUnlimitedNatural77");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural77.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural77.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Unconnected_Pattern_b::LiteralUnlimitedNatural125
		addToElementRepository("LiteralUnlimitedNatural125", DelegationConnectors_P_PWP_A_Unconnected_Pattern_b_LiteralUnlimitedNatural125);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_b_LiteralUnlimitedNatural125.setName("LiteralUnlimitedNatural125");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_b_LiteralUnlimitedNatural125.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_b_LiteralUnlimitedNatural125.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralUnlimitedNatural149
		addToElementRepository("LiteralUnlimitedNatural149", DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural149);
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural149.setName("LiteralUnlimitedNatural149");
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural149.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural149.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118::LiteralUnlimitedNatural119
		addToElementRepository("LiteralUnlimitedNatural119", DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralUnlimitedNatural119);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralUnlimitedNatural119.setName("LiteralUnlimitedNatural119");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralUnlimitedNatural119.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd118_LiteralUnlimitedNatural119.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86::LiteralUnlimitedNatural88
		addToElementRepository("LiteralUnlimitedNatural88", DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86_LiteralUnlimitedNatural88);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86_LiteralUnlimitedNatural88.setName("LiteralUnlimitedNatural88");
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86_LiteralUnlimitedNatural88.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd86_LiteralUnlimitedNatural88.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural67
		addToElementRepository("LiteralUnlimitedNatural67", DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural67);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural67.setName("LiteralUnlimitedNatural67");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural67.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural67.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Star_Pattern_b::LiteralUnlimitedNatural81
		addToElementRepository("LiteralUnlimitedNatural81", DelegationConnectors_P_PWP_A_Star_Pattern_b_LiteralUnlimitedNatural81);
		DelegationConnectors_P_PWP_A_Star_Pattern_b_LiteralUnlimitedNatural81.setName("LiteralUnlimitedNatural81");
		DelegationConnectors_P_PWP_A_Star_Pattern_b_LiteralUnlimitedNatural81.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Star_Pattern_b_LiteralUnlimitedNatural81.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result::LiteralUnlimitedNatural101
		addToElementRepository("LiteralUnlimitedNatural101", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural101);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural101.setName("LiteralUnlimitedNatural101");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural101.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural101.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result::LiteralUnlimitedNatural104
		addToElementRepository("LiteralUnlimitedNatural104", DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural104);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural104.setName("LiteralUnlimitedNatural104");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural104.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural104.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value::LiteralUnlimitedNatural70
		addToElementRepository("LiteralUnlimitedNatural70", DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural70);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural70.setName("LiteralUnlimitedNatural70");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural70.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural70.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralUnlimitedNatural182
		addToElementRepository("LiteralUnlimitedNatural182", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural182);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural182.setName("LiteralUnlimitedNatural182");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural182.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural182.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralUnlimitedNatural129
		addToElementRepository("LiteralUnlimitedNatural129", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural129);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural129.setName("LiteralUnlimitedNatural129");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural129.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural129.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Empty_Pattern_b::LiteralUnlimitedNatural55
		addToElementRepository("LiteralUnlimitedNatural55", DelegationConnectors_P_PWP_A_Empty_Pattern_b_LiteralUnlimitedNatural55);
		DelegationConnectors_P_PWP_A_Empty_Pattern_b_LiteralUnlimitedNatural55.setName("LiteralUnlimitedNatural55");
		DelegationConnectors_P_PWP_A_Empty_Pattern_b_LiteralUnlimitedNatural55.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Empty_Pattern_b_LiteralUnlimitedNatural55.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Empty_Pattern_p::LiteralUnlimitedNatural57
		addToElementRepository("LiteralUnlimitedNatural57", DelegationConnectors_P_PWP_A_Empty_Pattern_p_LiteralUnlimitedNatural57);
		DelegationConnectors_P_PWP_A_Empty_Pattern_p_LiteralUnlimitedNatural57.setName("LiteralUnlimitedNatural57");
		DelegationConnectors_P_PWP_A_Empty_Pattern_p_LiteralUnlimitedNatural57.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Empty_Pattern_p_LiteralUnlimitedNatural57.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralUnlimitedNatural145
		addToElementRepository("LiteralUnlimitedNatural145", DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural145);
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural145.setName("LiteralUnlimitedNatural145");
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural145.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural145.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value::LiteralUnlimitedNatural95
		addToElementRepository("LiteralUnlimitedNatural95", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural95);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural95.setName("LiteralUnlimitedNatural95");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural95.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural95.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83::LiteralUnlimitedNatural85
		addToElementRepository("LiteralUnlimitedNatural85", DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83_LiteralUnlimitedNatural85);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83_LiteralUnlimitedNatural85.setName("LiteralUnlimitedNatural85");
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83_LiteralUnlimitedNatural85.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Star_Pattern_r_ConnectorEnd83_LiteralUnlimitedNatural85.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern_result::LiteralUnlimitedNatural190
		addToElementRepository("LiteralUnlimitedNatural190", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural190);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural190.setName("LiteralUnlimitedNatural190");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural190.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural190.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural98
		addToElementRepository("LiteralUnlimitedNatural98", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural98);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural98.setName("LiteralUnlimitedNatural98");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural98.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural98.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural110
		addToElementRepository("LiteralUnlimitedNatural110", DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural110);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural110.setName("LiteralUnlimitedNatural110");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural110.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural110.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value::LiteralUnlimitedNatural17
		addToElementRepository("LiteralUnlimitedNatural17", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural17);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural17.setName("LiteralUnlimitedNatural17");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural17.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural17.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Array_Pattern_b::LiteralUnlimitedNatural51
		addToElementRepository("LiteralUnlimitedNatural51", DelegationConnectors_P_PWP_A_Array_Pattern_b_LiteralUnlimitedNatural51);
		DelegationConnectors_P_PWP_A_Array_Pattern_b_LiteralUnlimitedNatural51.setName("LiteralUnlimitedNatural51");
		DelegationConnectors_P_PWP_A_Array_Pattern_b_LiteralUnlimitedNatural51.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Array_Pattern_b_LiteralUnlimitedNatural51.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create A_Array_Pattern_result::LiteralUnlimitedNatural36
		addToElementRepository("LiteralUnlimitedNatural36", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural36);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural36.setName("LiteralUnlimitedNatural36");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural36.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural36.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Unconnected_Pattern_p::LiteralUnlimitedNatural117
		addToElementRepository("LiteralUnlimitedNatural117", DelegationConnectors_P_PWP_A_Unconnected_Pattern_p_LiteralUnlimitedNatural117);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p_LiteralUnlimitedNatural117.setName("LiteralUnlimitedNatural117");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p_LiteralUnlimitedNatural117.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p_LiteralUnlimitedNatural117.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Array_Pattern_p::LiteralUnlimitedNatural53
		addToElementRepository("LiteralUnlimitedNatural53", DelegationConnectors_P_PWP_A_Array_Pattern_p_LiteralUnlimitedNatural53);
		DelegationConnectors_P_PWP_A_Array_Pattern_p_LiteralUnlimitedNatural53.setName("LiteralUnlimitedNatural53");
		DelegationConnectors_P_PWP_A_Array_Pattern_p_LiteralUnlimitedNatural53.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Array_Pattern_p_LiteralUnlimitedNatural53.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_target::LiteralUnlimitedNatural179
		addToElementRepository("LiteralUnlimitedNatural179", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural179);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural179.setName("LiteralUnlimitedNatural179");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural179.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural179.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Star_Pattern_p::LiteralUnlimitedNatural79
		addToElementRepository("LiteralUnlimitedNatural79", DelegationConnectors_P_PWP_A_Star_Pattern_p_LiteralUnlimitedNatural79);
		DelegationConnectors_P_PWP_A_Star_Pattern_p_LiteralUnlimitedNatural79.setName("LiteralUnlimitedNatural79");
		DelegationConnectors_P_PWP_A_Star_Pattern_p_LiteralUnlimitedNatural79.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Star_Pattern_p_LiteralUnlimitedNatural79.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121::LiteralUnlimitedNatural122
		addToElementRepository("LiteralUnlimitedNatural122", DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121_LiteralUnlimitedNatural122);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121_LiteralUnlimitedNatural122.setName("LiteralUnlimitedNatural122");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121_LiteralUnlimitedNatural122.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_r_ConnectorEnd121_LiteralUnlimitedNatural122.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_B_q::LiteralUnlimitedNatural26
		addToElementRepository("LiteralUnlimitedNatural26", DelegationConnectors_P_PWP_B_q_LiteralUnlimitedNatural26);
		DelegationConnectors_P_PWP_B_q_LiteralUnlimitedNatural26.setName("LiteralUnlimitedNatural26");
		DelegationConnectors_P_PWP_B_q_LiteralUnlimitedNatural26.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_B_q_LiteralUnlimitedNatural26.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural14
		addToElementRepository("LiteralUnlimitedNatural14", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural14);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural14.setName("LiteralUnlimitedNatural14");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural14.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural14.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralUnlimitedNatural41
		addToElementRepository("LiteralUnlimitedNatural41", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural41);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural41.setName("LiteralUnlimitedNatural41");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural41.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural41.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd46::LiteralUnlimitedNatural47
		addToElementRepository("LiteralUnlimitedNatural47", DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd46_LiteralUnlimitedNatural47);
		DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd46_LiteralUnlimitedNatural47.setName("LiteralUnlimitedNatural47");
		DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd46_LiteralUnlimitedNatural47.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Array_Pattern_r_ConnectorEnd46_LiteralUnlimitedNatural47.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralUnlimitedNatural164
		addToElementRepository("LiteralUnlimitedNatural164", DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural164);
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural164.setName("LiteralUnlimitedNatural164");
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural164.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural164.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralUnlimitedNatural161
		addToElementRepository("LiteralUnlimitedNatural161", DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural161);
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural161.setName("LiteralUnlimitedNatural161");
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural161.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural161.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()_target::LiteralUnlimitedNatural9
		addToElementRepository("LiteralUnlimitedNatural9", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural9);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural9.setName("LiteralUnlimitedNatural9");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural9.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural9.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_R_y::LiteralUnlimitedNatural30
		addToElementRepository("LiteralUnlimitedNatural30", DelegationConnectors_P_PWP_R_y_LiteralUnlimitedNatural30);
		DelegationConnectors_P_PWP_R_y_LiteralUnlimitedNatural30.setName("LiteralUnlimitedNatural30");
		DelegationConnectors_P_PWP_R_y_LiteralUnlimitedNatural30.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_R_y_LiteralUnlimitedNatural30.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd60::LiteralUnlimitedNatural61
		addToElementRepository("LiteralUnlimitedNatural61", DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd60_LiteralUnlimitedNatural61);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd60_LiteralUnlimitedNatural61.setName("LiteralUnlimitedNatural61");
		DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd60_LiteralUnlimitedNatural61.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd60_LiteralUnlimitedNatural61.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralUnlimitedNatural12
		addToElementRepository("LiteralUnlimitedNatural12", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural12);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural12.setName("LiteralUnlimitedNatural12");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural12.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural12.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_R_x::LiteralUnlimitedNatural29
		addToElementRepository("LiteralUnlimitedNatural29", DelegationConnectors_P_PWP_R_x_LiteralUnlimitedNatural29);
		DelegationConnectors_P_PWP_R_x_LiteralUnlimitedNatural29.setName("LiteralUnlimitedNatural29");
		DelegationConnectors_P_PWP_R_x_LiteralUnlimitedNatural29.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_R_x_LiteralUnlimitedNatural29.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralUnlimitedNatural178
		addToElementRepository("LiteralUnlimitedNatural178", DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural178);
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural178.setName("LiteralUnlimitedNatural178");
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural178.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural178.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd62::LiteralUnlimitedNatural63
		addToElementRepository("LiteralUnlimitedNatural63", DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd62_LiteralUnlimitedNatural63);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd62_LiteralUnlimitedNatural63.setName("LiteralUnlimitedNatural63");
		DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd62_LiteralUnlimitedNatural63.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Empty_Pattern_r_ConnectorEnd62_LiteralUnlimitedNatural63.setValue(-1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create A_Star_Pattern_result::LiteralUnlimitedNatural3
		addToElementRepository("LiteralUnlimitedNatural3", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural3);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural3.setName("LiteralUnlimitedNatural3");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural3.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural3.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralUnlimitedNatural140
		addToElementRepository("LiteralUnlimitedNatural140", DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural140);
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural140.setName("LiteralUnlimitedNatural140");
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural140.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural140.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create A_Empty_Pattern_result::LiteralUnlimitedNatural138
		addToElementRepository("LiteralUnlimitedNatural138", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural138);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural138.setName("LiteralUnlimitedNatural138");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural138.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural138.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralUnlimitedNatural155
		addToElementRepository("LiteralUnlimitedNatural155", DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural155);
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural155.setName("LiteralUnlimitedNatural155");
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural155.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural155.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()_target::LiteralUnlimitedNatural45
		addToElementRepository("LiteralUnlimitedNatural45", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural45);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural45.setName("LiteralUnlimitedNatural45");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural45.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural45.setValue(1);
		// LiteralUnlimitedNatural DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()_target::LiteralUnlimitedNatural128
		addToElementRepository("LiteralUnlimitedNatural128", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural128);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural128.setName("LiteralUnlimitedNatural128");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural128.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural128.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Star_Pattern::ObjectFlow5
		addToElementRepository("ObjectFlow5", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5.setName("ObjectFlow5");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5.setSource(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5.setTarget(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5.setGuard(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow5_LiteralBoolean7);
		// ObjectFlow DelegationConnectors_P_PWP_main::ObjectFlow152
		addToElementRepository("ObjectFlow152", DelegationConnectors_P_PWP_main_ObjectFlow152);
		DelegationConnectors_P_PWP_main_ObjectFlow152.setName("ObjectFlow152");
		DelegationConnectors_P_PWP_main_ObjectFlow152.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_main_ObjectFlow152.setSource(DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_PWP_main_ObjectFlow152.setTarget(DelegationConnectors_P_PWP_main_assert_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_PWP_main_ObjectFlow152.setGuard(DelegationConnectors_P_PWP_main_ObjectFlow152_LiteralBoolean153);
		// ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern::ObjectFlow132
		addToElementRepository("ObjectFlow132", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132.setName("ObjectFlow132");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132.setSource(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132.setTarget(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132.setGuard(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow132_LiteralBoolean133);
		// ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Array_Pattern::ObjectFlow32
		addToElementRepository("ObjectFlow32", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32.setName("ObjectFlow32");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32.setSource(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32.setTarget(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32.setGuard(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow32_LiteralBoolean34);
		// ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Star_Pattern::ObjectFlow0
		addToElementRepository("ObjectFlow0", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0.setName("ObjectFlow0");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0.setSource(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0.setTarget(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0.setGuard(DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_ObjectFlow0_LiteralBoolean1);
		// ObjectFlow DelegationConnectors_P_PWP_main::ObjectFlow158
		addToElementRepository("ObjectFlow158", DelegationConnectors_P_PWP_main_ObjectFlow158);
		DelegationConnectors_P_PWP_main_ObjectFlow158.setName("ObjectFlow158");
		DelegationConnectors_P_PWP_main_ObjectFlow158.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_main_ObjectFlow158.setSource(DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_PWP_main_ObjectFlow158.setTarget(DelegationConnectors_P_PWP_main_assert_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_PWP_main_ObjectFlow158.setGuard(DelegationConnectors_P_PWP_main_ObjectFlow158_LiteralBoolean159);
		// ObjectFlow DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern::ObjectFlow90
		addToElementRepository("ObjectFlow90", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90.setName("ObjectFlow90");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90.setSource(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90.setTarget(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_value);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90.setGuard(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_ObjectFlow90_LiteralBoolean91);
		// ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern::ObjectFlow184
		addToElementRepository("ObjectFlow184", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184.setName("ObjectFlow184");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184.setSource(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184.setTarget(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184.setGuard(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow184_LiteralBoolean185);
		// ObjectFlow DelegationConnectors_P_PWP_main::ObjectFlow167
		addToElementRepository("ObjectFlow167", DelegationConnectors_P_PWP_main_ObjectFlow167);
		DelegationConnectors_P_PWP_main_ObjectFlow167.setName("ObjectFlow167");
		DelegationConnectors_P_PWP_main_ObjectFlow167.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_main_ObjectFlow167.setSource(DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_PWP_main_ObjectFlow167.setTarget(DelegationConnectors_P_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_PWP_main_ObjectFlow167.setGuard(DelegationConnectors_P_PWP_main_ObjectFlow167_LiteralBoolean169);
		// ObjectFlow DelegationConnectors_P_PWP_assert_A_Array_Pattern::ObjectFlow71
		addToElementRepository("ObjectFlow71", DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71.setName("ObjectFlow71");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71.setSource(DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71.setTarget(DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_value);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71.setGuard(DelegationConnectors_P_PWP_assert_A_Array_Pattern_ObjectFlow71_LiteralBoolean73);
		// ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Array_Pattern::ObjectFlow38
		addToElementRepository("ObjectFlow38", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38.setName("ObjectFlow38");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38.setSource(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38.setTarget(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38.setGuard(DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_ObjectFlow38_LiteralBoolean40);
		// ObjectFlow DelegationConnectors_P_PWP_main::ObjectFlow170
		addToElementRepository("ObjectFlow170", DelegationConnectors_P_PWP_main_ObjectFlow170);
		DelegationConnectors_P_PWP_main_ObjectFlow170.setName("ObjectFlow170");
		DelegationConnectors_P_PWP_main_ObjectFlow170.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_main_ObjectFlow170.setSource(DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_PWP_main_ObjectFlow170.setTarget(DelegationConnectors_P_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_PWP_main_ObjectFlow170.setGuard(DelegationConnectors_P_PWP_main_ObjectFlow170_LiteralBoolean171);
		// ObjectFlow DelegationConnectors_P_PWP_assert_A_Star_Pattern::ObjectFlow107
		addToElementRepository("ObjectFlow107", DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107.setName("ObjectFlow107");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107.setSource(DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107.setTarget(DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_value);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107.setGuard(DelegationConnectors_P_PWP_assert_A_Star_Pattern_ObjectFlow107_LiteralBoolean108);
		// ObjectFlow DelegationConnectors_P_PWP_assert_A_Empty_Pattern::ObjectFlow19
		addToElementRepository("ObjectFlow19", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19.setName("ObjectFlow19");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19.setSource(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19.setTarget(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_value);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19.setGuard(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_ObjectFlow19_LiteralBoolean20);
		// ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern::ObjectFlow187
		addToElementRepository("ObjectFlow187", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187.setName("ObjectFlow187");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187.setSource(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187.setTarget(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187.setGuard(DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow187_LiteralBoolean188);
		// ObjectFlow DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern::ObjectFlow135
		addToElementRepository("ObjectFlow135", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135.setName("ObjectFlow135");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135.setSource(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135.setTarget(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135.setGuard(DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_ObjectFlow135_LiteralBoolean136);
	}

	private void initializeOperation_Instances()
	{
		// Operation DelegationConnectors_P_PWP_A_Empty_Pattern::A_Empty_Pattern_A_Empty_Pattern
		addToElementRepository("A_Empty_Pattern_A_Empty_Pattern", DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.setName("A_Empty_Pattern");
		DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.addOwnedParameter(DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result);
		DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation DelegationConnectors_P_PWP_A_Unconnected_Pattern::A_Unconnected_Pattern_A_Unconnected_Pattern
		addToElementRepository("A_Unconnected_Pattern_A_Unconnected_Pattern", DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.setName("A_Unconnected_Pattern");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.addOwnedParameter(DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation DelegationConnectors_P_PWP_A_Star_Pattern::A_Star_Pattern_A_Star_Pattern
		addToElementRepository("A_Star_Pattern_A_Star_Pattern", DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.setName("A_Star_Pattern");
		DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.addOwnedParameter(DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result);
		DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation DelegationConnectors_P_PWP_A_Array_Pattern::A_Array_Pattern_A_Array_Pattern
		addToElementRepository("A_Array_Pattern_A_Array_Pattern", DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.setName("A_Array_Pattern");
		DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.addOwnedParameter(DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result);
		DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus.setName("errorStatus");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message::result
		addToElementRepository("result", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result.setName("result");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin DelegationConnectors_P_PWP_assert_A_Star_Pattern_message::result
		addToElementRepository("result", DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result.setName("result");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus.setName("errorStatus");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin DelegationConnectors_P_PWP_assert_A_Array_Pattern_message::result
		addToElementRepository("result", DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result.setName("result");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create A_Star_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setName("result");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setType(DelegationConnectors_P_PWP_A_Star_Pattern);
		// OutputPin DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setName("result");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setType(DelegationConnectors_P_PWP_A_Unconnected_Pattern);
		// OutputPin DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern.setType(DelegationConnectors_P_PWP_A_Array_Pattern);
		// OutputPin DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()::result
		addToElementRepository("result", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setName("result");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setType(DelegationConnectors_P_PWP_A_Empty_Pattern);
		// OutputPin DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(DelegationConnectors_P_PWP_A_Unconnected_Pattern);
		// OutputPin DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create A_Empty_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setName("result");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setType(DelegationConnectors_P_PWP_A_Empty_Pattern);
		// OutputPin DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()::result
		addToElementRepository("result", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result.setName("result");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result.setType(DelegationConnectors_P_PWP_A_Star_Pattern);
		// OutputPin DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()::result
		addToElementRepository("result", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setName("result");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setType(DelegationConnectors_P_PWP_A_Unconnected_Pattern);
		// OutputPin DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()::result
		addToElementRepository("result", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result.setName("result");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result.setType(DelegationConnectors_P_PWP_A_Array_Pattern);
		// OutputPin DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setType(DelegationConnectors_P_PWP_A_Empty_Pattern);
		// OutputPin DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus.setName("errorStatus");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message::result
		addToElementRepository("result", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result.setName("result");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus.setName("errorStatus");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create A_Array_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setName("result");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setType(DelegationConnectors_P_PWP_A_Array_Pattern);
		// OutputPin DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern.setType(DelegationConnectors_P_PWP_A_Star_Pattern);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport DelegationConnectors_P_PWP::PackageImport64
		addToElementRepository("PackageImport64", DelegationConnectors_P_PWP_PackageImport64);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result);
		DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setName("result");
		DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setType(DelegationConnectors_P_PWP_A_Star_Pattern);
		DelegationConnectors_P_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result);
		DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setName("result");
		DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setType(DelegationConnectors_P_PWP_A_Array_Pattern);
		DelegationConnectors_P_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setName("result");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setType(DelegationConnectors_P_PWP_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern.setType(DelegationConnectors_P_PWP_A_Empty_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_PWP_instantiate_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern.setType(DelegationConnectors_P_PWP_A_Star_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Star_Pattern_a_Star_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_PWP_assert_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_a_Array_Pattern.setType(DelegationConnectors_P_PWP_A_Array_Pattern);
		// Parameter DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern::result
		addToElementRepository("result", DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result);
		DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setName("result");
		DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setType(DelegationConnectors_P_PWP_A_Empty_Pattern);
		DelegationConnectors_P_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_PWP_assert_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_a_Empty_Pattern.setType(DelegationConnectors_P_PWP_A_Empty_Pattern);
		// Parameter DelegationConnectors_P_PWP_assert_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_a_Star_Pattern.setType(DelegationConnectors_P_PWP_A_Star_Pattern);
		// Parameter DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(DelegationConnectors_P_PWP_A_Unconnected_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_PWP_instantiate_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern.setType(DelegationConnectors_P_PWP_A_Array_Pattern);
		DelegationConnectors_P_PWP_instantiate_A_Array_Pattern_a_Array_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(DelegationConnectors_P_PWP_A_Unconnected_Pattern);
	}

	private void initializePort_Instances()
	{
		// Port DelegationConnectors_P_PWP_A_Unconnected_Pattern::p
		addToElementRepository("p", DelegationConnectors_P_PWP_A_Unconnected_Pattern_p);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p.setName("p");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p.setUpper(-1);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p.setLower(3);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p.setType(DelegationConnectors_P_PWP_IImpl);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p.setAggregation(AggregationKind.composite);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p.isService = true;
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_p.addProvided(DelegationConnectors_P_PWP_I);
		// Port DelegationConnectors_P_PWP_A_Empty_Pattern::p
		addToElementRepository("p", DelegationConnectors_P_PWP_A_Empty_Pattern_p);
		DelegationConnectors_P_PWP_A_Empty_Pattern_p.setName("p");
		DelegationConnectors_P_PWP_A_Empty_Pattern_p.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Empty_Pattern_p.setUpper(-1);
		DelegationConnectors_P_PWP_A_Empty_Pattern_p.setLower(0);
		DelegationConnectors_P_PWP_A_Empty_Pattern_p.setType(DelegationConnectors_P_PWP_IImpl);
		DelegationConnectors_P_PWP_A_Empty_Pattern_p.setAggregation(AggregationKind.composite);
		DelegationConnectors_P_PWP_A_Empty_Pattern_p.isService = true;
		DelegationConnectors_P_PWP_A_Empty_Pattern_p.addProvided(DelegationConnectors_P_PWP_I);
		// Port DelegationConnectors_P_PWP_A_Star_Pattern::p
		addToElementRepository("p", DelegationConnectors_P_PWP_A_Star_Pattern_p);
		DelegationConnectors_P_PWP_A_Star_Pattern_p.setName("p");
		DelegationConnectors_P_PWP_A_Star_Pattern_p.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Star_Pattern_p.setUpper(-1);
		DelegationConnectors_P_PWP_A_Star_Pattern_p.setLower(3);
		DelegationConnectors_P_PWP_A_Star_Pattern_p.setType(DelegationConnectors_P_PWP_IImpl);
		DelegationConnectors_P_PWP_A_Star_Pattern_p.setAggregation(AggregationKind.composite);
		DelegationConnectors_P_PWP_A_Star_Pattern_p.isService = true;
		DelegationConnectors_P_PWP_A_Star_Pattern_p.addProvided(DelegationConnectors_P_PWP_I);
		// Port DelegationConnectors_P_PWP_A_Array_Pattern::p
		addToElementRepository("p", DelegationConnectors_P_PWP_A_Array_Pattern_p);
		DelegationConnectors_P_PWP_A_Array_Pattern_p.setName("p");
		DelegationConnectors_P_PWP_A_Array_Pattern_p.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Array_Pattern_p.setUpper(-1);
		DelegationConnectors_P_PWP_A_Array_Pattern_p.setLower(4);
		DelegationConnectors_P_PWP_A_Array_Pattern_p.setType(DelegationConnectors_P_PWP_IImpl);
		DelegationConnectors_P_PWP_A_Array_Pattern_p.setAggregation(AggregationKind.composite);
		DelegationConnectors_P_PWP_A_Array_Pattern_p.isService = true;
		DelegationConnectors_P_PWP_A_Array_Pattern_p.addProvided(DelegationConnectors_P_PWP_I);
		// Port DelegationConnectors_P_PWP_B::q
		addToElementRepository("q", DelegationConnectors_P_PWP_B_q);
		DelegationConnectors_P_PWP_B_q.setName("q");
		DelegationConnectors_P_PWP_B_q.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_B_q.setUpper(-1);
		DelegationConnectors_P_PWP_B_q.setLower(2);
		DelegationConnectors_P_PWP_B_q.setType(DelegationConnectors_P_PWP_IImpl);
		DelegationConnectors_P_PWP_B_q.setAggregation(AggregationKind.composite);
		DelegationConnectors_P_PWP_B_q.isService = true;
		DelegationConnectors_P_PWP_B_q.addProvided(DelegationConnectors_P_PWP_I);
	}

	private void initializeProperty_Instances()
	{
		// Property DelegationConnectors_P_PWP_A_Empty_Pattern::b
		addToElementRepository("b", DelegationConnectors_P_PWP_A_Empty_Pattern_b);
		DelegationConnectors_P_PWP_A_Empty_Pattern_b.setName("b");
		DelegationConnectors_P_PWP_A_Empty_Pattern_b.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Empty_Pattern_b.setUpper(-1);
		DelegationConnectors_P_PWP_A_Empty_Pattern_b.setLower(0);
		DelegationConnectors_P_PWP_A_Empty_Pattern_b.setType(DelegationConnectors_P_PWP_B);
		DelegationConnectors_P_PWP_A_Empty_Pattern_b.setAggregation(AggregationKind.composite);
		// Property DelegationConnectors_P_PWP_R::x
		addToElementRepository("x", DelegationConnectors_P_PWP_R_x);
		DelegationConnectors_P_PWP_R_x.setName("x");
		DelegationConnectors_P_PWP_R_x.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_R_x.setUpper(-1);
		DelegationConnectors_P_PWP_R_x.setLower(0);
		DelegationConnectors_P_PWP_R_x.setType(DelegationConnectors_P_PWP_IImpl);
		// Property DelegationConnectors_P_PWP_A_Array_Pattern::b
		addToElementRepository("b", DelegationConnectors_P_PWP_A_Array_Pattern_b);
		DelegationConnectors_P_PWP_A_Array_Pattern_b.setName("b");
		DelegationConnectors_P_PWP_A_Array_Pattern_b.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Array_Pattern_b.setUpper(-1);
		DelegationConnectors_P_PWP_A_Array_Pattern_b.setLower(2);
		DelegationConnectors_P_PWP_A_Array_Pattern_b.setType(DelegationConnectors_P_PWP_B);
		DelegationConnectors_P_PWP_A_Array_Pattern_b.setAggregation(AggregationKind.composite);
		// Property DelegationConnectors_P_PWP_R::y
		addToElementRepository("y", DelegationConnectors_P_PWP_R_y);
		DelegationConnectors_P_PWP_R_y.setName("y");
		DelegationConnectors_P_PWP_R_y.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_R_y.setUpper(-1);
		DelegationConnectors_P_PWP_R_y.setLower(0);
		DelegationConnectors_P_PWP_R_y.setType(DelegationConnectors_P_PWP_IImpl);
		// Property DelegationConnectors_P_PWP_A_Unconnected_Pattern::b
		addToElementRepository("b", DelegationConnectors_P_PWP_A_Unconnected_Pattern_b);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_b.setName("b");
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_b.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_b.setUpper(-1);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_b.setLower(2);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_b.setType(DelegationConnectors_P_PWP_B);
		DelegationConnectors_P_PWP_A_Unconnected_Pattern_b.setAggregation(AggregationKind.composite);
		// Property DelegationConnectors_P_PWP_A_Star_Pattern::b
		addToElementRepository("b", DelegationConnectors_P_PWP_A_Star_Pattern_b);
		DelegationConnectors_P_PWP_A_Star_Pattern_b.setName("b");
		DelegationConnectors_P_PWP_A_Star_Pattern_b.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_A_Star_Pattern_b.setUpper(-1);
		DelegationConnectors_P_PWP_A_Star_Pattern_b.setLower(2);
		DelegationConnectors_P_PWP_A_Star_Pattern_b.setType(DelegationConnectors_P_PWP_B);
		DelegationConnectors_P_PWP_A_Star_Pattern_b.setAggregation(AggregationKind.composite);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction DelegationConnectors_P_PWP_assert_A_Star_Pattern::message
		addToElementRepository("message", DelegationConnectors_P_PWP_assert_A_Star_Pattern_message);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message.setName("message");
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message.setValue(DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_LiteralString105);
		DelegationConnectors_P_PWP_assert_A_Star_Pattern_message.setResult(DelegationConnectors_P_PWP_assert_A_Star_Pattern_message_result);
		// ValueSpecificationAction DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern::message
		addToElementRepository("message", DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message.setName("message");
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message.setValue(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_LiteralString102);
		DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message.setResult(DelegationConnectors_P_PWP_assert_A_Unconnected_Pattern_message_result);
		// ValueSpecificationAction DelegationConnectors_P_PWP_assert_A_Array_Pattern::message
		addToElementRepository("message", DelegationConnectors_P_PWP_assert_A_Array_Pattern_message);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message.setName("message");
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message.setValue(DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_LiteralString75);
		DelegationConnectors_P_PWP_assert_A_Array_Pattern_message.setResult(DelegationConnectors_P_PWP_assert_A_Array_Pattern_message_result);
		// ValueSpecificationAction DelegationConnectors_P_PWP_assert_A_Empty_Pattern::message
		addToElementRepository("message", DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message.setName("message");
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message.setVisibility(VisibilityKind.public_);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message.setValue(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_LiteralString25);
		DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message.setResult(DelegationConnectors_P_PWP_assert_A_Empty_Pattern_message_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // DelegationConnectors_P_PWPModel
