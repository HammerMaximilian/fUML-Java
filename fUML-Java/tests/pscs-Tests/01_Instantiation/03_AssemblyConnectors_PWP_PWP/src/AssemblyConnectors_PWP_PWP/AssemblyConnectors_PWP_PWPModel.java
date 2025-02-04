/*
 * AssemblyConnectors_PWP_PWPModel.java
 * 
 * Auto-generated file
 */
package AssemblyConnectors_PWP_PWP;

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
import uml.classification.Parameter;
import uml.classification.Operation;
import uml.activities.ActivityParameterNode;
import uml.commonstructure.PackageImport;
import uml.classification.AggregationKind;
import uml.activities.ControlFlow;
import uml.actions.ValueSpecificationAction;
import uml.actions.CreateObjectAction;
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

public class AssemblyConnectors_PWP_PWPModel extends InMemoryModel
{
	private static AssemblyConnectors_PWP_PWPModel instance;

	/*
	 * Model AssemblyConnectors_PWP_PWP
	 */
	public Package AssemblyConnectors_PWP_PWP = new Package();
		public Activity AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern = new Activity();
			public CallBehaviorAction AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger0 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger1 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural2 = new LiteralUnlimitedNatural();
				public InputPin AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger3 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural4 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger5 = new LiteralInteger();
			public Parameter AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern = new Parameter();
			public ObjectFlow AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6_LiteralBoolean7 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6_LiteralInteger8 = new LiteralInteger();
			public ActivityParameterNode AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger9 = new LiteralInteger();
			public ValueSpecificationAction AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message = new ValueSpecificationAction();
				public OutputPin AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result_LiteralInteger10 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural11 = new LiteralUnlimitedNatural();
				public LiteralString AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_LiteralString12 = new LiteralString();
		public Activity AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern = new Activity();
			public ActivityParameterNode AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger13 = new LiteralInteger();
			public CallBehaviorAction AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger14 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural15 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger16 = new LiteralInteger();
				public OutputPin AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural17 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger18 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger19 = new LiteralInteger();
			public ValueSpecificationAction AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message = new ValueSpecificationAction();
				public OutputPin AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural20 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result_LiteralInteger21 = new LiteralInteger();
				public LiteralString AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_LiteralString22 = new LiteralString();
			public Parameter AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern = new Parameter();
			public ObjectFlow AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23_LiteralBoolean24 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23_LiteralInteger25 = new LiteralInteger();
		public Class_ AssemblyConnectors_PWP_PWP_C = new Class_();
			public Port AssemblyConnectors_PWP_PWP_C_q = new Port();
				public LiteralInteger AssemblyConnectors_PWP_PWP_C_q_LiteralInteger26 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_C_q_LiteralUnlimitedNatural27 = new LiteralUnlimitedNatural();
		public Class_ AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern = new Class_();
			public Operation AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern = new Operation();
				public Parameter AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result = new Parameter();
			public Comment AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_Comment28 = new Comment();
			public Property AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural29 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB_LiteralInteger30 = new LiteralInteger();
			public Property AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC = new Property();
				public LiteralInteger AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC_LiteralInteger31 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural32 = new LiteralUnlimitedNatural();
			public Connector AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r = new Connector();
				public ConnectorEnd AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33_connectorEnd_1_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
				public ConnectorEnd AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34 = new ConnectorEnd();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34_connectorEnd_2_Lower = new LiteralInteger();
		public Activity AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern = new Activity();
			public ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35_LiteralInteger36 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35_LiteralBoolean37 = new LiteralBoolean();
			public Parameter AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern = new Parameter();
			public CreateObjectAction AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern = new CreateObjectAction();
				public OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger38 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural39 = new LiteralUnlimitedNatural();
			public ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40_LiteralInteger41 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40_LiteralBoolean42 = new LiteralBoolean();
			public ActivityParameterNode AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger43 = new LiteralInteger();
			public CallOperationAction AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_ = new CallOperationAction();
				public InputPin AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger44 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural45 = new LiteralUnlimitedNatural();
				public OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger46 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural47 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger48 = new LiteralInteger();
		public Activity AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern = new Activity();
			public Parameter AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern = new Parameter();
			public CallBehaviorAction AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural49 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger50 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger51 = new LiteralInteger();
				public OutputPin AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger52 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger53 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural54 = new LiteralUnlimitedNatural();
			public ObjectFlow AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55_LiteralBoolean56 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55_LiteralInteger57 = new LiteralInteger();
			public ActivityParameterNode AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger58 = new LiteralInteger();
			public ValueSpecificationAction AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message = new ValueSpecificationAction();
				public LiteralString AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_LiteralString59 = new LiteralString();
				public OutputPin AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result_LiteralInteger60 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural61 = new LiteralUnlimitedNatural();
		public Class_ AssemblyConnectors_PWP_PWP_A_Empty_Pattern = new Class_();
			public Property AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB_LiteralUnlimitedNatural62 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB_LiteralInteger63 = new LiteralInteger();
			public Property AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC_LiteralUnlimitedNatural64 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC_LiteralInteger65 = new LiteralInteger();
			public Operation AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern = new Operation();
				public Parameter AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result = new Parameter();
			public Comment AssemblyConnectors_PWP_PWP_A_Empty_Pattern_Comment66 = new Comment();
			public Connector AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r = new Connector();
				public ConnectorEnd AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67_connectorEnd_1_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
				public ConnectorEnd AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_2_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
		public PackageImport AssemblyConnectors_PWP_PWP_PackageImport69 = new PackageImport();
		public Activity AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern = new Activity();
			public ActivityParameterNode AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node = new ActivityParameterNode();
			public ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70_LiteralBoolean71 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70_LiteralInteger72 = new LiteralInteger();
			public Parameter AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern = new Parameter();
			public CallOperationAction AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_ = new CallOperationAction();
				public InputPin AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural73 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger74 = new LiteralInteger();
				public OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural75 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger76 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger77 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralBoolean79 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralInteger80 = new LiteralInteger();
			public CreateObjectAction AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern = new CreateObjectAction();
				public OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural81 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger82 = new LiteralInteger();
		public Comment AssemblyConnectors_PWP_PWP_Comment83 = new Comment();
		public Class_ AssemblyConnectors_PWP_PWP_A_Array_Pattern = new Class_();
			public Operation AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern = new Operation();
				public Parameter AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result = new Parameter();
			public Comment AssemblyConnectors_PWP_PWP_A_Array_Pattern_Comment84 = new Comment();
			public Property AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC = new Property();
				public LiteralInteger AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC_LiteralInteger85 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC_LiteralUnlimitedNatural86 = new LiteralUnlimitedNatural();
			public Connector AssemblyConnectors_PWP_PWP_A_Array_Pattern_r = new Connector();
				public ConnectorEnd AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87 = new ConnectorEnd();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87_connectorEnd_1_Lower = new LiteralInteger();
				public ConnectorEnd AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_2_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
			public Property AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB_LiteralUnlimitedNatural89 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB_LiteralInteger90 = new LiteralInteger();
		public Activity AssemblyConnectors_PWP_PWP_main = new Activity();
			public ObjectFlow AssemblyConnectors_PWP_PWP_main_ObjectFlow91 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_PWP_main_ObjectFlow91_LiteralInteger92 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_main_ObjectFlow91_LiteralBoolean93 = new LiteralBoolean();
			public CallBehaviorAction AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger94 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger95 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural96 = new LiteralUnlimitedNatural();
			public ControlFlow AssemblyConnectors_PWP_PWP_main_ControlFlow97 = new ControlFlow();
			public CallBehaviorAction AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural98 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger99 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger100 = new LiteralInteger();
			public CallBehaviorAction AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger101 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural102 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger103 = new LiteralInteger();
			public CallBehaviorAction AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger104 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger105 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural106 = new LiteralUnlimitedNatural();
			public ObjectFlow AssemblyConnectors_PWP_PWP_main_ObjectFlow107 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_main_ObjectFlow107_LiteralBoolean108 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_PWP_PWP_main_ObjectFlow107_LiteralInteger109 = new LiteralInteger();
			public ControlFlow AssemblyConnectors_PWP_PWP_main_ControlFlow110 = new ControlFlow();
			public ObjectFlow AssemblyConnectors_PWP_PWP_main_ObjectFlow111 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_PWP_main_ObjectFlow111_LiteralInteger112 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_main_ObjectFlow111_LiteralBoolean113 = new LiteralBoolean();
			public CallBehaviorAction AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger114 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger115 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural116 = new LiteralUnlimitedNatural();
			public CallBehaviorAction AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger117 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger118 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural119 = new LiteralUnlimitedNatural();
			public CallBehaviorAction AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger120 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger121 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural122 = new LiteralUnlimitedNatural();
			public CallBehaviorAction AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger123 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural124 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger125 = new LiteralInteger();
			public ControlFlow AssemblyConnectors_PWP_PWP_main_ControlFlow126 = new ControlFlow();
			public ObjectFlow AssemblyConnectors_PWP_PWP_main_ObjectFlow127 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_PWP_main_ObjectFlow127_LiteralInteger128 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_main_ObjectFlow127_LiteralBoolean129 = new LiteralBoolean();
		public Activity AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern = new Activity();
			public CallOperationAction AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_ = new CallOperationAction();
				public OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger130 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural131 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger132 = new LiteralInteger();
				public InputPin AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural133 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger134 = new LiteralInteger();
			public ActivityParameterNode AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node = new ActivityParameterNode();
			public Parameter AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern = new Parameter();
			public ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135_LiteralInteger136 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135_LiteralBoolean137 = new LiteralBoolean();
			public ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138_LiteralInteger139 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138_LiteralBoolean140 = new LiteralBoolean();
			public CreateObjectAction AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern = new CreateObjectAction();
				public OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger141 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural142 = new LiteralUnlimitedNatural();
		public Activity AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern = new Activity();
			public ActivityParameterNode AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger143 = new LiteralInteger();
			public ValueSpecificationAction AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message = new ValueSpecificationAction();
				public OutputPin AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result_LiteralInteger144 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural145 = new LiteralUnlimitedNatural();
				public LiteralString AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_LiteralString146 = new LiteralString();
			public Parameter AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern = new Parameter();
			public ObjectFlow AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147_LiteralInteger148 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147_LiteralBoolean149 = new LiteralBoolean();
			public CallBehaviorAction AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural150 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger151 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger152 = new LiteralInteger();
				public OutputPin AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural153 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger154 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger155 = new LiteralInteger();
		public Interface AssemblyConnectors_PWP_PWP_I = new Interface();
		public Activity AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern = new Activity();
			public CreateObjectAction AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern = new CreateObjectAction();
				public OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural156 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger157 = new LiteralInteger();
			public CallOperationAction AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_ = new CallOperationAction();
				public InputPin AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger158 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural159 = new LiteralUnlimitedNatural();
				public OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural160 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger161 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger162 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralInteger164 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralBoolean165 = new LiteralBoolean();
			public ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralInteger167 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralBoolean168 = new LiteralBoolean();
			public ActivityParameterNode AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node = new ActivityParameterNode();
			public Parameter AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern = new Parameter();
		public Class_ AssemblyConnectors_PWP_PWP_A_Star_Pattern = new Class_();
			public Operation AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern = new Operation();
				public Parameter AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result = new Parameter();
			public Property AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC = new Property();
				public LiteralInteger AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC_LiteralInteger169 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC_LiteralUnlimitedNatural170 = new LiteralUnlimitedNatural();
			public Comment AssemblyConnectors_PWP_PWP_A_Star_Pattern_Comment171 = new Comment();
			public Property AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB_LiteralUnlimitedNatural172 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB_LiteralInteger173 = new LiteralInteger();
			public Connector AssemblyConnectors_PWP_PWP_A_Star_Pattern_r = new Connector();
				public ConnectorEnd AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174_connectorEnd_1_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
				public ConnectorEnd AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175 = new ConnectorEnd();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175_connectorEnd_2_Lower = new LiteralInteger();
		public Association AssemblyConnectors_PWP_PWP_R = new Association();
			public Property AssemblyConnectors_PWP_PWP_R_x = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_R_x_LiteralUnlimitedNatural176 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_PWP_PWP_R_x_LiteralInteger177 = new LiteralInteger();
			public Property AssemblyConnectors_PWP_PWP_R_y = new Property();
				public LiteralInteger AssemblyConnectors_PWP_PWP_R_y_LiteralInteger178 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_R_y_LiteralUnlimitedNatural179 = new LiteralUnlimitedNatural();
		public Class_ AssemblyConnectors_PWP_PWP_B = new Class_();
			public Port AssemblyConnectors_PWP_PWP_B_p = new Port();
				public LiteralInteger AssemblyConnectors_PWP_PWP_B_p_LiteralInteger180 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_B_p_LiteralUnlimitedNatural181 = new LiteralUnlimitedNatural();
		public Class_ AssemblyConnectors_PWP_PWP_IImpl = new Class_();
			public InterfaceRealization AssemblyConnectors_PWP_PWP_IImpl_I_Realization = new InterfaceRealization();

	public static AssemblyConnectors_PWP_PWPModel instance()
	{
		if (instance == null)
        {
            instance = new AssemblyConnectors_PWP_PWPModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public AssemblyConnectors_PWP_PWPModel()
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
		// Activity AssemblyConnectors_PWP_PWP::assert_A_Star_Pattern
		addToElementRepository("assert_A_Star_Pattern", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern.setName("assert_A_Star_Pattern");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern.addOwnedParameter(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern.addNode(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern.addNode(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern.addNode(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern.addEdge(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6);
		// Activity AssemblyConnectors_PWP_PWP::main
		addToElementRepository("main", AssemblyConnectors_PWP_PWP_main);
		AssemblyConnectors_PWP_PWP_main.setName("main");
		AssemblyConnectors_PWP_PWP_main.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main.addNode(AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_main.addNode(AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_main.addNode(AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_main.addNode(AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_main.addNode(AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_main.addNode(AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_main.addNode(AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_main.addNode(AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_main.addEdge(AssemblyConnectors_PWP_PWP_main_ObjectFlow91);
		AssemblyConnectors_PWP_PWP_main.addEdge(AssemblyConnectors_PWP_PWP_main_ControlFlow97);
		AssemblyConnectors_PWP_PWP_main.addEdge(AssemblyConnectors_PWP_PWP_main_ControlFlow110);
		AssemblyConnectors_PWP_PWP_main.addEdge(AssemblyConnectors_PWP_PWP_main_ObjectFlow111);
		AssemblyConnectors_PWP_PWP_main.addEdge(AssemblyConnectors_PWP_PWP_main_ControlFlow126);
		AssemblyConnectors_PWP_PWP_main.addEdge(AssemblyConnectors_PWP_PWP_main_ObjectFlow107);
		AssemblyConnectors_PWP_PWP_main.addEdge(AssemblyConnectors_PWP_PWP_main_ObjectFlow127);
		// Activity AssemblyConnectors_PWP_PWP::assert_A_Empty_Pattern
		addToElementRepository("assert_A_Empty_Pattern", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern.setName("assert_A_Empty_Pattern");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern.addOwnedParameter(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern.addNode(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern.addNode(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern.addNode(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern.addEdge(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23);
		// Activity AssemblyConnectors_PWP_PWP::instantiate_A_Star_Pattern
		addToElementRepository("instantiate_A_Star_Pattern", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern.setName("instantiate_A_Star_Pattern");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern.addOwnedParameter(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern.addNode(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern.addNode(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern.addNode(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern.addEdge(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern.addEdge(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138);
		// Activity AssemblyConnectors_PWP_PWP::assert_A_Unconnected_Pattern
		addToElementRepository("assert_A_Unconnected_Pattern", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern.setName("assert_A_Unconnected_Pattern");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern.addOwnedParameter(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern.addNode(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern.addNode(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern.addNode(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern.addEdge(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147);
		// Activity AssemblyConnectors_PWP_PWP::instantiate_A_Array_Pattern
		addToElementRepository("instantiate_A_Array_Pattern", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern.setName("instantiate_A_Array_Pattern");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern.addOwnedParameter(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern.addNode(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern.addNode(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern.addNode(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern.addEdge(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern.addEdge(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40);
		// Activity AssemblyConnectors_PWP_PWP::assert_A_Array_Pattern
		addToElementRepository("assert_A_Array_Pattern", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern.setName("assert_A_Array_Pattern");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern.addOwnedParameter(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern.addNode(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern.addNode(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern.addNode(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern.addEdge(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55);
		// Activity AssemblyConnectors_PWP_PWP::instantiate_A_Unconnected_Pattern
		addToElementRepository("instantiate_A_Unconnected_Pattern", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern.setName("instantiate_A_Unconnected_Pattern");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern.addOwnedParameter(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern.addNode(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern.addNode(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern.addNode(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern.addEdge(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern.addEdge(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166);
		// Activity AssemblyConnectors_PWP_PWP::instantiate_A_Empty_Pattern
		addToElementRepository("instantiate_A_Empty_Pattern", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern.setName("instantiate_A_Empty_Pattern");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern.addOwnedParameter(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern.addNode(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern.addNode(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern.addNode(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern.addEdge(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern.addEdge(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern::a_Empty_Pattern_node
		addToElementRepository("a_Empty_Pattern_node", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setName("a_Empty_Pattern_node");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setParameter(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern::a_Unconnected_Pattern_node
		addToElementRepository("a_Unconnected_Pattern_node", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setName("a_Unconnected_Pattern_node");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setParameter(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern::a_Empty_Pattern_node
		addToElementRepository("a_Empty_Pattern_node", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node.setName("a_Empty_Pattern_node");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node.setParameter(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern::a_Star_Pattern_node
		addToElementRepository("a_Star_Pattern_node", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node.setName("a_Star_Pattern_node");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node.setParameter(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern_node
		addToElementRepository("a_Unconnected_Pattern_node", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setName("a_Unconnected_Pattern_node");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setParameter(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern::a_Star_Pattern_node
		addToElementRepository("a_Star_Pattern_node", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern_node.setName("a_Star_Pattern_node");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern_node.setParameter(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern::a_Array_Pattern_node
		addToElementRepository("a_Array_Pattern_node", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern_node.setName("a_Array_Pattern_node");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern_node.setParameter(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern::a_Array_Pattern_node
		addToElementRepository("a_Array_Pattern_node", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node.setName("a_Array_Pattern_node");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node.setParameter(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern);
	}

	private void initializeAssociation_Instances()
	{
		// Association AssemblyConnectors_PWP_PWP::R
		addToElementRepository("R", AssemblyConnectors_PWP_PWP_R);
		AssemblyConnectors_PWP_PWP_R.setName("R");
		AssemblyConnectors_PWP_PWP_R.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_R.addOwnedEnd(AssemblyConnectors_PWP_PWP_R_x);
		AssemblyConnectors_PWP_PWP_R.addOwnedEnd(AssemblyConnectors_PWP_PWP_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction AssemblyConnectors_PWP_PWP_main::assert_A_Star_Pattern
		addToElementRepository("assert_A_Star_Pattern", AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern.setName("assert_A_Star_Pattern");
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern.setBehavior(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern.addArgument(AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern::writeLine
		addToElementRepository("writeLine", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine.setName("writeLine");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine.addResult(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine.addArgument(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value);
		// CallBehaviorAction AssemblyConnectors_PWP_PWP_main::instantiate_A_Array_Pattern
		addToElementRepository("instantiate_A_Array_Pattern", AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern.setName("instantiate_A_Array_Pattern");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern.addResult(AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern.setBehavior(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern::writeLine
		addToElementRepository("writeLine", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine.setName("writeLine");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine.addResult(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine.addArgument(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value);
		// CallBehaviorAction AssemblyConnectors_PWP_PWP_main::instantiate_A_Star_Pattern
		addToElementRepository("instantiate_A_Star_Pattern", AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern.setName("instantiate_A_Star_Pattern");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern.addResult(AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern.setBehavior(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_PWP_main::instantiate_A_Unconnected_Pattern
		addToElementRepository("instantiate_A_Unconnected_Pattern", AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern.setName("instantiate_A_Unconnected_Pattern");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern.addResult(AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern.setBehavior(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_PWP_main::assert_A_Array_Pattern
		addToElementRepository("assert_A_Array_Pattern", AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern.setName("assert_A_Array_Pattern");
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern.setBehavior(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern.addArgument(AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern::writeLine
		addToElementRepository("writeLine", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine.setName("writeLine");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine.addResult(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine.addArgument(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value);
		// CallBehaviorAction AssemblyConnectors_PWP_PWP_main::instantiate_A_Empty_Pattern
		addToElementRepository("instantiate_A_Empty_Pattern", AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern.setName("instantiate_A_Empty_Pattern");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern.addResult(AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern.setBehavior(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_PWP_main::assert_A_Empty_Pattern
		addToElementRepository("assert_A_Empty_Pattern", AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern.setName("assert_A_Empty_Pattern");
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern.setBehavior(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern.addArgument(AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_PWP_main::assert_A_Unconnected_Pattern
		addToElementRepository("assert_A_Unconnected_Pattern", AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern.setName("assert_A_Unconnected_Pattern");
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern.setBehavior(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern.addArgument(AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern::writeLine
		addToElementRepository("writeLine", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine.setName("writeLine");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine.addResult(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine.addArgument(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern::A_Unconnected_Pattern()
		addToElementRepository("A_Unconnected_Pattern()", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setName("A_Unconnected_Pattern()");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.addResult(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setOperation(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setTarget(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
		// CallOperationAction AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern::A_Star_Pattern()
		addToElementRepository("A_Star_Pattern()", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_.setName("A_Star_Pattern()");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_.addResult(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_.setOperation(AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern_.setTarget(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		// CallOperationAction AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern::A_Empty_Pattern()
		addToElementRepository("A_Empty_Pattern()", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setName("A_Empty_Pattern()");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_.addResult(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setOperation(AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setTarget(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		// CallOperationAction AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern::A_Array_Pattern()
		addToElementRepository("A_Array_Pattern()", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_.setName("A_Array_Pattern()");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_.addResult(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_.setOperation(AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern_.setTarget(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target);
	}

	private void initializeClass_Instances()
	{
		// Class AssemblyConnectors_PWP_PWP::A_Array_Pattern
		addToElementRepository("A_Array_Pattern", AssemblyConnectors_PWP_PWP_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern.setName("A_Array_Pattern");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_A_Array_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC);
		
		AssemblyConnectors_PWP_PWP_A_Array_Pattern.addOwnedConnector(AssemblyConnectors_PWP_PWP_A_Array_Pattern_r);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern.addOwnedOperation(AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		// Class AssemblyConnectors_PWP_PWP::C
		addToElementRepository("C", AssemblyConnectors_PWP_PWP_C);
		AssemblyConnectors_PWP_PWP_C.setName("C");
		AssemblyConnectors_PWP_PWP_C.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_C.addOwnedAttribute(AssemblyConnectors_PWP_PWP_C_q);
		// Class AssemblyConnectors_PWP_PWP::A_Unconnected_Pattern
		addToElementRepository("A_Unconnected_Pattern", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern.setName("A_Unconnected_Pattern");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC);
		
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern.addOwnedConnector(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern.addOwnedOperation(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		// Class AssemblyConnectors_PWP_PWP::A_Empty_Pattern
		addToElementRepository("A_Empty_Pattern", AssemblyConnectors_PWP_PWP_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern.setName("A_Empty_Pattern");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC);
		
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern.addOwnedConnector(AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern.addOwnedOperation(AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		// Class AssemblyConnectors_PWP_PWP::A_Star_Pattern
		addToElementRepository("A_Star_Pattern", AssemblyConnectors_PWP_PWP_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern.setName("A_Star_Pattern");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_A_Star_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC);
		
		AssemblyConnectors_PWP_PWP_A_Star_Pattern.addOwnedConnector(AssemblyConnectors_PWP_PWP_A_Star_Pattern_r);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern.addOwnedOperation(AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		// Class AssemblyConnectors_PWP_PWP::B
		addToElementRepository("B", AssemblyConnectors_PWP_PWP_B);
		AssemblyConnectors_PWP_PWP_B.setName("B");
		AssemblyConnectors_PWP_PWP_B.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_B.addOwnedAttribute(AssemblyConnectors_PWP_PWP_B_p);
		// Class AssemblyConnectors_PWP_PWP::IImpl
		addToElementRepository("IImpl", AssemblyConnectors_PWP_PWP_IImpl);
		AssemblyConnectors_PWP_PWP_IImpl.setName("IImpl");
		AssemblyConnectors_PWP_PWP_IImpl.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_IImpl.addInterfaceRealization(AssemblyConnectors_PWP_PWP_IImpl_I_Realization);
	}

	private void initializeComment_Instances()
	{
		// Comment AssemblyConnectors_PWP_PWP::Comment83
		addToElementRepository("Comment83", AssemblyConnectors_PWP_PWP_Comment83);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment AssemblyConnectors_PWP_PWP_A_Empty_Pattern::Comment66
		addToElementRepository("Comment66", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_Comment66);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern::Comment28
		addToElementRepository("Comment28", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_Comment28);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment AssemblyConnectors_PWP_PWP_A_Array_Pattern::Comment84
		addToElementRepository("Comment84", AssemblyConnectors_PWP_PWP_A_Array_Pattern_Comment84);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment AssemblyConnectors_PWP_PWP_A_Star_Pattern::Comment171
		addToElementRepository("Comment171", AssemblyConnectors_PWP_PWP_A_Star_Pattern_Comment171);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector AssemblyConnectors_PWP_PWP_A_Star_Pattern::r
		addToElementRepository("r", AssemblyConnectors_PWP_PWP_A_Star_Pattern_r);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r.setName("r");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r.addEnd(AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r.addEnd(AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r.setType(AssemblyConnectors_PWP_PWP_R);
		// Connector AssemblyConnectors_PWP_PWP_A_Empty_Pattern::r
		addToElementRepository("r", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r.setName("r");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r.addEnd(AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r.addEnd(AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r.setType(AssemblyConnectors_PWP_PWP_R);
		// Connector AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern::r
		addToElementRepository("r", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r.setName("r");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r.addEnd(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r.addEnd(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r.setType(AssemblyConnectors_PWP_PWP_R);
		// Connector AssemblyConnectors_PWP_PWP_A_Array_Pattern::r
		addToElementRepository("r", AssemblyConnectors_PWP_PWP_A_Array_Pattern_r);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r.setName("r");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r.addEnd(AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r.addEnd(AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r.setType(AssemblyConnectors_PWP_PWP_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd AssemblyConnectors_PWP_PWP_A_Array_Pattern_r::ConnectorEnd87
		addToElementRepository("ConnectorEnd87", AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87.setRole(AssemblyConnectors_PWP_PWP_B_p);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87.setPartWithPort(AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB);
		// ConnectorEnd AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r::ConnectorEnd67
		addToElementRepository("ConnectorEnd67", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67.setRole(AssemblyConnectors_PWP_PWP_B_p);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67.setPartWithPort(AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB);
		// ConnectorEnd AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r::ConnectorEnd33
		addToElementRepository("ConnectorEnd33", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33.setLower(0);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33.setRole(AssemblyConnectors_PWP_PWP_B_p);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33.setPartWithPort(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB);
		// ConnectorEnd AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r::ConnectorEnd34
		addToElementRepository("ConnectorEnd34", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34.setLower(0);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34.setRole(AssemblyConnectors_PWP_PWP_C_q);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34.setPartWithPort(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC);
		// ConnectorEnd AssemblyConnectors_PWP_PWP_A_Star_Pattern_r::ConnectorEnd175
		addToElementRepository("ConnectorEnd175", AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175.setLower(5);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175.setRole(AssemblyConnectors_PWP_PWP_C_q);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175.setPartWithPort(AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC);
		// ConnectorEnd AssemblyConnectors_PWP_PWP_A_Star_Pattern_r::ConnectorEnd174
		addToElementRepository("ConnectorEnd174", AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174.setLower(4);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174.setRole(AssemblyConnectors_PWP_PWP_B_p);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174.setPartWithPort(AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB);
		// ConnectorEnd AssemblyConnectors_PWP_PWP_A_Array_Pattern_r::ConnectorEnd88
		addToElementRepository("ConnectorEnd88", AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88.setRole(AssemblyConnectors_PWP_PWP_C_q);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88.setPartWithPort(AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC);
		// ConnectorEnd AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r::ConnectorEnd68
		addToElementRepository("ConnectorEnd68", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68.setRole(AssemblyConnectors_PWP_PWP_C_q);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68.setPartWithPort(AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow AssemblyConnectors_PWP_PWP_main::ControlFlow97
		addToElementRepository("ControlFlow97", AssemblyConnectors_PWP_PWP_main_ControlFlow97);
		AssemblyConnectors_PWP_PWP_main_ControlFlow97.setName("ControlFlow97");
		AssemblyConnectors_PWP_PWP_main_ControlFlow97.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_main_ControlFlow97.setSource(AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_main_ControlFlow97.setTarget(AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern);
		// ControlFlow AssemblyConnectors_PWP_PWP_main::ControlFlow110
		addToElementRepository("ControlFlow110", AssemblyConnectors_PWP_PWP_main_ControlFlow110);
		AssemblyConnectors_PWP_PWP_main_ControlFlow110.setName("ControlFlow110");
		AssemblyConnectors_PWP_PWP_main_ControlFlow110.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_main_ControlFlow110.setSource(AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_main_ControlFlow110.setTarget(AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern);
		// ControlFlow AssemblyConnectors_PWP_PWP_main::ControlFlow126
		addToElementRepository("ControlFlow126", AssemblyConnectors_PWP_PWP_main_ControlFlow126);
		AssemblyConnectors_PWP_PWP_main_ControlFlow126.setName("ControlFlow126");
		AssemblyConnectors_PWP_PWP_main_ControlFlow126.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_main_ControlFlow126.setSource(AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_main_ControlFlow126.setTarget(AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern::Create A_Unconnected_Pattern
		addToElementRepository("Create A_Unconnected_Pattern", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setName("Create A_Unconnected_Pattern");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setClassifier(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setResult(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		// CreateObjectAction AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern::Create A_Array_Pattern
		addToElementRepository("Create A_Array_Pattern", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setName("Create A_Array_Pattern");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setClassifier(AssemblyConnectors_PWP_PWP_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setResult(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		// CreateObjectAction AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern::Create A_Empty_Pattern
		addToElementRepository("Create A_Empty_Pattern", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setName("Create A_Empty_Pattern");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setClassifier(AssemblyConnectors_PWP_PWP_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setResult(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		// CreateObjectAction AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern::Create A_Star_Pattern
		addToElementRepository("Create A_Star_Pattern", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setName("Create A_Star_Pattern");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setClassifier(AssemblyConnectors_PWP_PWP_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setResult(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()::target
		addToElementRepository("target", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setName("target");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setType(AssemblyConnectors_PWP_PWP_A_Empty_Pattern);
		// InputPin AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()::target
		addToElementRepository("target", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setName("target");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setType(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern);
		// InputPin AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine::value
		addToElementRepository("value", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value.setName("value");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Empty_Pattern);
		// InputPin AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()::target
		addToElementRepository("target", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target.setName("target");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target.setType(AssemblyConnectors_PWP_PWP_A_Array_Pattern);
		// InputPin AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine::value
		addToElementRepository("value", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value.setName("value");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine::value
		addToElementRepository("value", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value.setName("value");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern);
		// InputPin AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()::target
		addToElementRepository("target", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target.setName("target");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target.setType(AssemblyConnectors_PWP_PWP_A_Star_Pattern);
		// InputPin AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine::value
		addToElementRepository("value", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value.setName("value");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Array_Pattern);
		// InputPin AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Star_Pattern);
	}

	private void initializeInterface_Instances()
	{
		// Interface AssemblyConnectors_PWP_PWP::I
		addToElementRepository("I", AssemblyConnectors_PWP_PWP_I);
		AssemblyConnectors_PWP_PWP_I.setName("I");
		AssemblyConnectors_PWP_PWP_I.setVisibility(VisibilityKind.public_);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization AssemblyConnectors_PWP_PWP_IImpl::I_Realization
		addToElementRepository("I_Realization", AssemblyConnectors_PWP_PWP_IImpl_I_Realization);
		AssemblyConnectors_PWP_PWP_IImpl_I_Realization.setName("I_Realization");
		AssemblyConnectors_PWP_PWP_IImpl_I_Realization.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_IImpl_I_Realization.setContract(AssemblyConnectors_PWP_PWP_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70::LiteralBoolean71
		addToElementRepository("LiteralBoolean71", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70_LiteralBoolean71);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70_LiteralBoolean71.setName("LiteralBoolean71");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70_LiteralBoolean71.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70_LiteralBoolean71.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23::LiteralBoolean24
		addToElementRepository("LiteralBoolean24", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23_LiteralBoolean24);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23_LiteralBoolean24.setName("LiteralBoolean24");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23_LiteralBoolean24.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23_LiteralBoolean24.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55::LiteralBoolean56
		addToElementRepository("LiteralBoolean56", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55_LiteralBoolean56);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55_LiteralBoolean56.setName("LiteralBoolean56");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55_LiteralBoolean56.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55_LiteralBoolean56.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6::LiteralBoolean7
		addToElementRepository("LiteralBoolean7", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6_LiteralBoolean7);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6_LiteralBoolean7.setName("LiteralBoolean7");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6_LiteralBoolean7.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6_LiteralBoolean7.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135::LiteralBoolean137
		addToElementRepository("LiteralBoolean137", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135_LiteralBoolean137);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135_LiteralBoolean137.setName("LiteralBoolean137");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135_LiteralBoolean137.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135_LiteralBoolean137.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_main_ObjectFlow107::LiteralBoolean108
		addToElementRepository("LiteralBoolean108", AssemblyConnectors_PWP_PWP_main_ObjectFlow107_LiteralBoolean108);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow107_LiteralBoolean108.setName("LiteralBoolean108");
		AssemblyConnectors_PWP_PWP_main_ObjectFlow107_LiteralBoolean108.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow107_LiteralBoolean108.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138::LiteralBoolean140
		addToElementRepository("LiteralBoolean140", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138_LiteralBoolean140);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138_LiteralBoolean140.setName("LiteralBoolean140");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138_LiteralBoolean140.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138_LiteralBoolean140.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_main_ObjectFlow91::LiteralBoolean93
		addToElementRepository("LiteralBoolean93", AssemblyConnectors_PWP_PWP_main_ObjectFlow91_LiteralBoolean93);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow91_LiteralBoolean93.setName("LiteralBoolean93");
		AssemblyConnectors_PWP_PWP_main_ObjectFlow91_LiteralBoolean93.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow91_LiteralBoolean93.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_main_ObjectFlow127::LiteralBoolean129
		addToElementRepository("LiteralBoolean129", AssemblyConnectors_PWP_PWP_main_ObjectFlow127_LiteralBoolean129);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow127_LiteralBoolean129.setName("LiteralBoolean129");
		AssemblyConnectors_PWP_PWP_main_ObjectFlow127_LiteralBoolean129.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow127_LiteralBoolean129.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163::LiteralBoolean165
		addToElementRepository("LiteralBoolean165", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralBoolean165);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralBoolean165.setName("LiteralBoolean165");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralBoolean165.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralBoolean165.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147::LiteralBoolean149
		addToElementRepository("LiteralBoolean149", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147_LiteralBoolean149);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147_LiteralBoolean149.setName("LiteralBoolean149");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147_LiteralBoolean149.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147_LiteralBoolean149.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40::LiteralBoolean42
		addToElementRepository("LiteralBoolean42", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40_LiteralBoolean42);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40_LiteralBoolean42.setName("LiteralBoolean42");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40_LiteralBoolean42.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40_LiteralBoolean42.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35::LiteralBoolean37
		addToElementRepository("LiteralBoolean37", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35_LiteralBoolean37);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35_LiteralBoolean37.setName("LiteralBoolean37");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35_LiteralBoolean37.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35_LiteralBoolean37.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78::LiteralBoolean79
		addToElementRepository("LiteralBoolean79", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralBoolean79);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralBoolean79.setName("LiteralBoolean79");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralBoolean79.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralBoolean79.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166::LiteralBoolean168
		addToElementRepository("LiteralBoolean168", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralBoolean168);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralBoolean168.setName("LiteralBoolean168");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralBoolean168.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralBoolean168.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_PWP_main_ObjectFlow111::LiteralBoolean113
		addToElementRepository("LiteralBoolean113", AssemblyConnectors_PWP_PWP_main_ObjectFlow111_LiteralBoolean113);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow111_LiteralBoolean113.setName("LiteralBoolean113");
		AssemblyConnectors_PWP_PWP_main_ObjectFlow111_LiteralBoolean113.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow111_LiteralBoolean113.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC::LiteralInteger31
		addToElementRepository("LiteralInteger31", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC_LiteralInteger31);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC_LiteralInteger31.setName("LiteralInteger31");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC_LiteralInteger31.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC_LiteralInteger31.setValue(3);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_target::LiteralInteger158
		addToElementRepository("LiteralInteger158", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger158);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger158.setName("LiteralInteger158");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger158.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger158.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node::LiteralInteger143
		addToElementRepository("LiteralInteger143", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger143);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger143.setName("LiteralInteger143");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger143.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger143.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB::LiteralInteger90
		addToElementRepository("LiteralInteger90", AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB_LiteralInteger90);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB_LiteralInteger90.setName("LiteralInteger90");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB_LiteralInteger90.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB_LiteralInteger90.setValue(2);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralInteger18
		addToElementRepository("LiteralInteger18", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger18);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger18.setName("LiteralInteger18");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger18.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger18.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus::LiteralInteger0
		addToElementRepository("LiteralInteger0", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger0);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger0.setName("LiteralInteger0");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger0.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger0.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create A_Star_Pattern_result::LiteralInteger141
		addToElementRepository("LiteralInteger141", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger141);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger141.setName("LiteralInteger141");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger141.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger141.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23::LiteralInteger25
		addToElementRepository("LiteralInteger25", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23_LiteralInteger25);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23_LiteralInteger25.setName("LiteralInteger25");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23_LiteralInteger25.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23_LiteralInteger25.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralInteger95
		addToElementRepository("LiteralInteger95", AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger95);
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger95.setName("LiteralInteger95");
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger95.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger95.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87_connectorEnd_1_Lower);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87_connectorEnd_1_Lower.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40::LiteralInteger41
		addToElementRepository("LiteralInteger41", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40_LiteralInteger41);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40_LiteralInteger41.setName("LiteralInteger41");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40_LiteralInteger41.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40_LiteralInteger41.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result::LiteralInteger10
		addToElementRepository("LiteralInteger10", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result_LiteralInteger10);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result_LiteralInteger10.setName("LiteralInteger10");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result_LiteralInteger10.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result_LiteralInteger10.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174_connectorEnd_1_Lower);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174_connectorEnd_1_Lower.setValue(4);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralInteger130
		addToElementRepository("LiteralInteger130", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger130);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger130.setName("LiteralInteger130");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger130.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger130.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB::LiteralInteger173
		addToElementRepository("LiteralInteger173", AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB_LiteralInteger173);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB_LiteralInteger173.setName("LiteralInteger173");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB_LiteralInteger173.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB_LiteralInteger173.setValue(2);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result::LiteralInteger144
		addToElementRepository("LiteralInteger144", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result_LiteralInteger144);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result_LiteralInteger144.setName("LiteralInteger144");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result_LiteralInteger144.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result_LiteralInteger144.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralInteger19
		addToElementRepository("LiteralInteger19", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger19);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger19.setName("LiteralInteger19");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger19.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger19.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create A_Empty_Pattern_result::LiteralInteger82
		addToElementRepository("LiteralInteger82", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger82);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger82.setName("LiteralInteger82");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger82.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger82.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralInteger99
		addToElementRepository("LiteralInteger99", AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger99);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger99.setName("LiteralInteger99");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger99.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger99.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_R_y::LiteralInteger178
		addToElementRepository("LiteralInteger178", AssemblyConnectors_PWP_PWP_R_y_LiteralInteger178);
		AssemblyConnectors_PWP_PWP_R_y_LiteralInteger178.setName("LiteralInteger178");
		AssemblyConnectors_PWP_PWP_R_y_LiteralInteger178.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_R_y_LiteralInteger178.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralInteger48
		addToElementRepository("LiteralInteger48", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger48);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger48.setName("LiteralInteger48");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger48.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger48.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralInteger155
		addToElementRepository("LiteralInteger155", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger155);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger155.setName("LiteralInteger155");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger155.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger155.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78::LiteralInteger80
		addToElementRepository("LiteralInteger80", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralInteger80);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralInteger80.setName("LiteralInteger80");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralInteger80.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralInteger80.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35::LiteralInteger36
		addToElementRepository("LiteralInteger36", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35_LiteralInteger36);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35_LiteralInteger36.setName("LiteralInteger36");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35_LiteralInteger36.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35_LiteralInteger36.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result::LiteralInteger60
		addToElementRepository("LiteralInteger60", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result_LiteralInteger60);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result_LiteralInteger60.setName("LiteralInteger60");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result_LiteralInteger60.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result_LiteralInteger60.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138::LiteralInteger139
		addToElementRepository("LiteralInteger139", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138_LiteralInteger139);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138_LiteralInteger139.setName("LiteralInteger139");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138_LiteralInteger139.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138_LiteralInteger139.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node::LiteralInteger43
		addToElementRepository("LiteralInteger43", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger43);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger43.setName("LiteralInteger43");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger43.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger43.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC::LiteralInteger65
		addToElementRepository("LiteralInteger65", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC_LiteralInteger65);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC_LiteralInteger65.setName("LiteralInteger65");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC_LiteralInteger65.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC_LiteralInteger65.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34_connectorEnd_2_Lower);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34_connectorEnd_2_Lower.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163::LiteralInteger164
		addToElementRepository("LiteralInteger164", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralInteger164);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralInteger164.setName("LiteralInteger164");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralInteger164.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralInteger164.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralInteger114
		addToElementRepository("LiteralInteger114", AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger114);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger114.setName("LiteralInteger114");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger114.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger114.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55::LiteralInteger57
		addToElementRepository("LiteralInteger57", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55_LiteralInteger57);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55_LiteralInteger57.setName("LiteralInteger57");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55_LiteralInteger57.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55_LiteralInteger57.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value::LiteralInteger3
		addToElementRepository("LiteralInteger3", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger3);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger3.setName("LiteralInteger3");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger3.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger3.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175_connectorEnd_2_Lower);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175_connectorEnd_2_Lower.setValue(5);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value::LiteralInteger151
		addToElementRepository("LiteralInteger151", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger151);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger151.setName("LiteralInteger151");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger151.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger151.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern_node::LiteralInteger58
		addToElementRepository("LiteralInteger58", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger58);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger58.setName("LiteralInteger58");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger58.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger58.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67_connectorEnd_1_Lower);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67_connectorEnd_1_Lower.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create A_Array_Pattern_result::LiteralInteger38
		addToElementRepository("LiteralInteger38", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger38);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger38.setName("LiteralInteger38");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger38.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger38.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166::LiteralInteger167
		addToElementRepository("LiteralInteger167", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralInteger167);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralInteger167.setName("LiteralInteger167");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralInteger167.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralInteger167.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus::LiteralInteger1
		addToElementRepository("LiteralInteger1", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger1);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger1.setName("LiteralInteger1");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger1.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger1.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralInteger94
		addToElementRepository("LiteralInteger94", AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger94);
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger94.setName("LiteralInteger94");
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger94.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger94.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node::LiteralInteger13
		addToElementRepository("LiteralInteger13", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger13);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger13.setName("LiteralInteger13");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger13.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger13.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger125
		addToElementRepository("LiteralInteger125", AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger125);
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger125.setName("LiteralInteger125");
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger125.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger125.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralInteger77
		addToElementRepository("LiteralInteger77", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger77);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger77.setName("LiteralInteger77");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger77.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger77.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB::LiteralInteger63
		addToElementRepository("LiteralInteger63", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB_LiteralInteger63);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB_LiteralInteger63.setName("LiteralInteger63");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB_LiteralInteger63.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB_LiteralInteger63.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_ObjectFlow111::LiteralInteger112
		addToElementRepository("LiteralInteger112", AssemblyConnectors_PWP_PWP_main_ObjectFlow111_LiteralInteger112);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow111_LiteralInteger112.setName("LiteralInteger112");
		AssemblyConnectors_PWP_PWP_main_ObjectFlow111_LiteralInteger112.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow111_LiteralInteger112.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralInteger154
		addToElementRepository("LiteralInteger154", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger154);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger154.setName("LiteralInteger154");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger154.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger154.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralInteger162
		addToElementRepository("LiteralInteger162", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger162);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger162.setName("LiteralInteger162");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger162.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger162.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_C_q::LiteralInteger26
		addToElementRepository("LiteralInteger26", AssemblyConnectors_PWP_PWP_C_q_LiteralInteger26);
		AssemblyConnectors_PWP_PWP_C_q_LiteralInteger26.setName("LiteralInteger26");
		AssemblyConnectors_PWP_PWP_C_q_LiteralInteger26.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_C_q_LiteralInteger26.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value::LiteralInteger152
		addToElementRepository("LiteralInteger152", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger152);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger152.setName("LiteralInteger152");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger152.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger152.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger118
		addToElementRepository("LiteralInteger118", AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger118);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger118.setName("LiteralInteger118");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger118.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger118.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value::LiteralInteger51
		addToElementRepository("LiteralInteger51", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger51);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger51.setName("LiteralInteger51");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger51.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger51.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralInteger100
		addToElementRepository("LiteralInteger100", AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger100);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger100.setName("LiteralInteger100");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger100.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger100.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value::LiteralInteger16
		addToElementRepository("LiteralInteger16", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger16);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger16.setName("LiteralInteger16");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger16.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger16.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger101
		addToElementRepository("LiteralInteger101", AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger101);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger101.setName("LiteralInteger101");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger101.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger101.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger123
		addToElementRepository("LiteralInteger123", AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger123);
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger123.setName("LiteralInteger123");
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger123.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger123.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC::LiteralInteger169
		addToElementRepository("LiteralInteger169", AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC_LiteralInteger169);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC_LiteralInteger169.setName("LiteralInteger169");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC_LiteralInteger169.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC_LiteralInteger169.setValue(5);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_2_Lower);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_2_Lower.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralInteger115
		addToElementRepository("LiteralInteger115", AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger115);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger115.setName("LiteralInteger115");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger115.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger115.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus::LiteralInteger53
		addToElementRepository("LiteralInteger53", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger53);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger53.setName("LiteralInteger53");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger53.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger53.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern_node::LiteralInteger9
		addToElementRepository("LiteralInteger9", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger9);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger9.setName("LiteralInteger9");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger9.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger9.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern_result::LiteralInteger157
		addToElementRepository("LiteralInteger157", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger157);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger157.setName("LiteralInteger157");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger157.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger157.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result::LiteralInteger21
		addToElementRepository("LiteralInteger21", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result_LiteralInteger21);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result_LiteralInteger21.setName("LiteralInteger21");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result_LiteralInteger21.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result_LiteralInteger21.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_ObjectFlow127::LiteralInteger128
		addToElementRepository("LiteralInteger128", AssemblyConnectors_PWP_PWP_main_ObjectFlow127_LiteralInteger128);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow127_LiteralInteger128.setName("LiteralInteger128");
		AssemblyConnectors_PWP_PWP_main_ObjectFlow127_LiteralInteger128.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow127_LiteralInteger128.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70::LiteralInteger72
		addToElementRepository("LiteralInteger72", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70_LiteralInteger72);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70_LiteralInteger72.setName("LiteralInteger72");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70_LiteralInteger72.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70_LiteralInteger72.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6::LiteralInteger8
		addToElementRepository("LiteralInteger8", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6_LiteralInteger8);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6_LiteralInteger8.setName("LiteralInteger8");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6_LiteralInteger8.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6_LiteralInteger8.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_B_p::LiteralInteger180
		addToElementRepository("LiteralInteger180", AssemblyConnectors_PWP_PWP_B_p_LiteralInteger180);
		AssemblyConnectors_PWP_PWP_B_p_LiteralInteger180.setName("LiteralInteger180");
		AssemblyConnectors_PWP_PWP_B_p_LiteralInteger180.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_B_p_LiteralInteger180.setValue(2);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralInteger104
		addToElementRepository("LiteralInteger104", AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger104);
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger104.setName("LiteralInteger104");
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger104.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger104.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147::LiteralInteger148
		addToElementRepository("LiteralInteger148", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147_LiteralInteger148);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147_LiteralInteger148.setName("LiteralInteger148");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147_LiteralInteger148.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147_LiteralInteger148.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralInteger105
		addToElementRepository("LiteralInteger105", AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger105);
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger105.setName("LiteralInteger105");
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger105.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger105.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralInteger46
		addToElementRepository("LiteralInteger46", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger46);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger46.setName("LiteralInteger46");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger46.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger46.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_ObjectFlow91::LiteralInteger92
		addToElementRepository("LiteralInteger92", AssemblyConnectors_PWP_PWP_main_ObjectFlow91_LiteralInteger92);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow91_LiteralInteger92.setName("LiteralInteger92");
		AssemblyConnectors_PWP_PWP_main_ObjectFlow91_LiteralInteger92.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow91_LiteralInteger92.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus::LiteralInteger52
		addToElementRepository("LiteralInteger52", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger52);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger52.setName("LiteralInteger52");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger52.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger52.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger117
		addToElementRepository("LiteralInteger117", AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger117);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger117.setName("LiteralInteger117");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger117.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger117.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger120
		addToElementRepository("LiteralInteger120", AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger120);
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger120.setName("LiteralInteger120");
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger120.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger120.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralInteger161
		addToElementRepository("LiteralInteger161", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger161);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger161.setName("LiteralInteger161");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger161.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger161.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC::LiteralInteger85
		addToElementRepository("LiteralInteger85", AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC_LiteralInteger85);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC_LiteralInteger85.setName("LiteralInteger85");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC_LiteralInteger85.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC_LiteralInteger85.setValue(4);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_2_Lower);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_2_Lower.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135::LiteralInteger136
		addToElementRepository("LiteralInteger136", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135_LiteralInteger136);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135_LiteralInteger136.setName("LiteralInteger136");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135_LiteralInteger136.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135_LiteralInteger136.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value::LiteralInteger50
		addToElementRepository("LiteralInteger50", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger50);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger50.setName("LiteralInteger50");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger50.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralInteger50.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33_connectorEnd_1_Lower);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33_connectorEnd_1_Lower.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value::LiteralInteger14
		addToElementRepository("LiteralInteger14", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger14);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger14.setName("LiteralInteger14");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger14.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralInteger14.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralInteger76
		addToElementRepository("LiteralInteger76", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger76);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger76.setName("LiteralInteger76");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger76.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger76.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_ObjectFlow107::LiteralInteger109
		addToElementRepository("LiteralInteger109", AssemblyConnectors_PWP_PWP_main_ObjectFlow107_LiteralInteger109);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow107_LiteralInteger109.setName("LiteralInteger109");
		AssemblyConnectors_PWP_PWP_main_ObjectFlow107_LiteralInteger109.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow107_LiteralInteger109.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()_target::LiteralInteger44
		addToElementRepository("LiteralInteger44", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger44);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger44.setName("LiteralInteger44");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger44.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger44.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB::LiteralInteger30
		addToElementRepository("LiteralInteger30", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB_LiteralInteger30);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB_LiteralInteger30.setName("LiteralInteger30");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB_LiteralInteger30.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB_LiteralInteger30.setValue(2);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralInteger132
		addToElementRepository("LiteralInteger132", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger132);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger132.setName("LiteralInteger132");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger132.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger132.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value::LiteralInteger5
		addToElementRepository("LiteralInteger5", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger5);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger5.setName("LiteralInteger5");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger5.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralInteger5.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger121
		addToElementRepository("LiteralInteger121", AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger121);
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger121.setName("LiteralInteger121");
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger121.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger121.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()_target::LiteralInteger74
		addToElementRepository("LiteralInteger74", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger74);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger74.setName("LiteralInteger74");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger74.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger74.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_R_x::LiteralInteger177
		addToElementRepository("LiteralInteger177", AssemblyConnectors_PWP_PWP_R_x_LiteralInteger177);
		AssemblyConnectors_PWP_PWP_R_x_LiteralInteger177.setName("LiteralInteger177");
		AssemblyConnectors_PWP_PWP_R_x_LiteralInteger177.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_R_x_LiteralInteger177.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger103
		addToElementRepository("LiteralInteger103", AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger103);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger103.setName("LiteralInteger103");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger103.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger103.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()_target::LiteralInteger134
		addToElementRepository("LiteralInteger134", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger134);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger134.setName("LiteralInteger134");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger134.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger134.setValue(1);
	}

	private void initializeLiteralString_Instances()
	{
		// LiteralString AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message::LiteralString59
		addToElementRepository("LiteralString59", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_LiteralString59);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_LiteralString59.setName("LiteralString59");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_LiteralString59.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_LiteralString59.setValue("Assertion currently not implemented for A_Array_Pattern.");
		// LiteralString AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message::LiteralString146
		addToElementRepository("LiteralString146", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_LiteralString146);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_LiteralString146.setName("LiteralString146");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_LiteralString146.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_LiteralString146.setValue("Assertion currently not implemented for A_Unconnected_Pattern.");
		// LiteralString AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message::LiteralString22
		addToElementRepository("LiteralString22", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_LiteralString22);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_LiteralString22.setName("LiteralString22");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_LiteralString22.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_LiteralString22.setValue("Assertion currently not implemented for A_Empty_Pattern.");
		// LiteralString AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message::LiteralString12
		addToElementRepository("LiteralString12", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_LiteralString12);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_LiteralString12.setName("LiteralString12");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_LiteralString12.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_LiteralString12.setValue("Assertion currently not implemented for A_Star_Pattern.");
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87_connectorEnd_1_Upper);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd87_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralUnlimitedNatural47
		addToElementRepository("LiteralUnlimitedNatural47", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural47);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural47.setName("LiteralUnlimitedNatural47");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural47.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural47.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_2_Upper);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralUnlimitedNatural124
		addToElementRepository("LiteralUnlimitedNatural124", AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural124);
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural124.setName("LiteralUnlimitedNatural124");
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural124.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural124.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()_target::LiteralUnlimitedNatural45
		addToElementRepository("LiteralUnlimitedNatural45", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural45);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural45.setName("LiteralUnlimitedNatural45");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural45.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural45.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural2
		addToElementRepository("LiteralUnlimitedNatural2", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural2);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural2.setName("LiteralUnlimitedNatural2");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural2.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural2.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175_connectorEnd_2_Upper);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd175_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralUnlimitedNatural131
		addToElementRepository("LiteralUnlimitedNatural131", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural131);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural131.setName("LiteralUnlimitedNatural131");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural131.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural131.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value::LiteralUnlimitedNatural15
		addToElementRepository("LiteralUnlimitedNatural15", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural15);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural15.setName("LiteralUnlimitedNatural15");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural15.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural15.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_target::LiteralUnlimitedNatural159
		addToElementRepository("LiteralUnlimitedNatural159", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural159);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural159.setName("LiteralUnlimitedNatural159");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural159.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural159.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result::LiteralUnlimitedNatural145
		addToElementRepository("LiteralUnlimitedNatural145", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural145);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural145.setName("LiteralUnlimitedNatural145");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural145.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural145.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value::LiteralUnlimitedNatural49
		addToElementRepository("LiteralUnlimitedNatural49", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural49);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural49.setName("LiteralUnlimitedNatural49");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural49.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural49.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result::LiteralUnlimitedNatural20
		addToElementRepository("LiteralUnlimitedNatural20", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural20);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural20.setName("LiteralUnlimitedNatural20");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural20.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural20.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result::LiteralUnlimitedNatural61
		addToElementRepository("LiteralUnlimitedNatural61", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural61);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural61.setName("LiteralUnlimitedNatural61");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural61.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural61.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34_connectorEnd_2_Upper);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd34_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB::LiteralUnlimitedNatural29
		addToElementRepository("LiteralUnlimitedNatural29", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural29);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural29.setName("LiteralUnlimitedNatural29");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural29.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural29.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralUnlimitedNatural102
		addToElementRepository("LiteralUnlimitedNatural102", AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural102);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural102.setName("LiteralUnlimitedNatural102");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural102.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural102.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralUnlimitedNatural116
		addToElementRepository("LiteralUnlimitedNatural116", AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural116);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural116.setName("LiteralUnlimitedNatural116");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural116.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural116.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create A_Empty_Pattern_result::LiteralUnlimitedNatural81
		addToElementRepository("LiteralUnlimitedNatural81", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural81);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural81.setName("LiteralUnlimitedNatural81");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural81.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural81.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB::LiteralUnlimitedNatural62
		addToElementRepository("LiteralUnlimitedNatural62", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB_LiteralUnlimitedNatural62);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB_LiteralUnlimitedNatural62.setName("LiteralUnlimitedNatural62");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB_LiteralUnlimitedNatural62.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB_LiteralUnlimitedNatural62.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33_connectorEnd_1_Upper);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_r_ConnectorEnd33_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_C_q::LiteralUnlimitedNatural27
		addToElementRepository("LiteralUnlimitedNatural27", AssemblyConnectors_PWP_PWP_C_q_LiteralUnlimitedNatural27);
		AssemblyConnectors_PWP_PWP_C_q_LiteralUnlimitedNatural27.setName("LiteralUnlimitedNatural27");
		AssemblyConnectors_PWP_PWP_C_q_LiteralUnlimitedNatural27.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_C_q_LiteralUnlimitedNatural27.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC::LiteralUnlimitedNatural170
		addToElementRepository("LiteralUnlimitedNatural170", AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC_LiteralUnlimitedNatural170);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC_LiteralUnlimitedNatural170.setName("LiteralUnlimitedNatural170");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC_LiteralUnlimitedNatural170.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC_LiteralUnlimitedNatural170.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralUnlimitedNatural106
		addToElementRepository("LiteralUnlimitedNatural106", AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural106);
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural106.setName("LiteralUnlimitedNatural106");
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural106.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural106.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralUnlimitedNatural75
		addToElementRepository("LiteralUnlimitedNatural75", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural75);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural75.setName("LiteralUnlimitedNatural75");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural75.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural75.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_R_x::LiteralUnlimitedNatural176
		addToElementRepository("LiteralUnlimitedNatural176", AssemblyConnectors_PWP_PWP_R_x_LiteralUnlimitedNatural176);
		AssemblyConnectors_PWP_PWP_R_x_LiteralUnlimitedNatural176.setName("LiteralUnlimitedNatural176");
		AssemblyConnectors_PWP_PWP_R_x_LiteralUnlimitedNatural176.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_R_x_LiteralUnlimitedNatural176.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value::LiteralUnlimitedNatural4
		addToElementRepository("LiteralUnlimitedNatural4", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural4);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural4.setName("LiteralUnlimitedNatural4");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural4.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural4.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result::LiteralUnlimitedNatural11
		addToElementRepository("LiteralUnlimitedNatural11", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural11);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural11.setName("LiteralUnlimitedNatural11");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural11.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural11.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174_connectorEnd_1_Upper);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_r_ConnectorEnd174_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67_connectorEnd_1_Upper);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_r_ConnectorEnd67_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC::LiteralUnlimitedNatural32
		addToElementRepository("LiteralUnlimitedNatural32", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural32);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural32.setName("LiteralUnlimitedNatural32");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural32.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural32.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern_result::LiteralUnlimitedNatural156
		addToElementRepository("LiteralUnlimitedNatural156", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural156);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural156.setName("LiteralUnlimitedNatural156");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural156.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural156.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural153
		addToElementRepository("LiteralUnlimitedNatural153", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural153);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural153.setName("LiteralUnlimitedNatural153");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural153.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural153.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB::LiteralUnlimitedNatural172
		addToElementRepository("LiteralUnlimitedNatural172", AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB_LiteralUnlimitedNatural172);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB_LiteralUnlimitedNatural172.setName("LiteralUnlimitedNatural172");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB_LiteralUnlimitedNatural172.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB_LiteralUnlimitedNatural172.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create A_Star_Pattern_result::LiteralUnlimitedNatural142
		addToElementRepository("LiteralUnlimitedNatural142", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural142);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural142.setName("LiteralUnlimitedNatural142");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural142.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural142.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralUnlimitedNatural96
		addToElementRepository("LiteralUnlimitedNatural96", AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural96);
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural96.setName("LiteralUnlimitedNatural96");
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural96.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural96.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_2_Upper);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB::LiteralUnlimitedNatural89
		addToElementRepository("LiteralUnlimitedNatural89", AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB_LiteralUnlimitedNatural89);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB_LiteralUnlimitedNatural89.setName("LiteralUnlimitedNatural89");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB_LiteralUnlimitedNatural89.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB_LiteralUnlimitedNatural89.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralUnlimitedNatural160
		addToElementRepository("LiteralUnlimitedNatural160", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural160);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural160.setName("LiteralUnlimitedNatural160");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural160.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural160.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()_target::LiteralUnlimitedNatural133
		addToElementRepository("LiteralUnlimitedNatural133", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural133);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural133.setName("LiteralUnlimitedNatural133");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural133.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural133.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural17
		addToElementRepository("LiteralUnlimitedNatural17", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural17);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural17.setName("LiteralUnlimitedNatural17");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural17.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural17.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value::LiteralUnlimitedNatural150
		addToElementRepository("LiteralUnlimitedNatural150", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural150);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural150.setName("LiteralUnlimitedNatural150");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural150.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural150.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC::LiteralUnlimitedNatural64
		addToElementRepository("LiteralUnlimitedNatural64", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC_LiteralUnlimitedNatural64);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC_LiteralUnlimitedNatural64.setName("LiteralUnlimitedNatural64");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC_LiteralUnlimitedNatural64.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC_LiteralUnlimitedNatural64.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()_target::LiteralUnlimitedNatural73
		addToElementRepository("LiteralUnlimitedNatural73", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural73);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural73.setName("LiteralUnlimitedNatural73");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural73.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural73.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralUnlimitedNatural122
		addToElementRepository("LiteralUnlimitedNatural122", AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural122);
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural122.setName("LiteralUnlimitedNatural122");
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural122.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural122.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_B_p::LiteralUnlimitedNatural181
		addToElementRepository("LiteralUnlimitedNatural181", AssemblyConnectors_PWP_PWP_B_p_LiteralUnlimitedNatural181);
		AssemblyConnectors_PWP_PWP_B_p_LiteralUnlimitedNatural181.setName("LiteralUnlimitedNatural181");
		AssemblyConnectors_PWP_PWP_B_p_LiteralUnlimitedNatural181.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_B_p_LiteralUnlimitedNatural181.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC::LiteralUnlimitedNatural86
		addToElementRepository("LiteralUnlimitedNatural86", AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC_LiteralUnlimitedNatural86);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC_LiteralUnlimitedNatural86.setName("LiteralUnlimitedNatural86");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC_LiteralUnlimitedNatural86.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC_LiteralUnlimitedNatural86.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralUnlimitedNatural98
		addToElementRepository("LiteralUnlimitedNatural98", AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural98);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural98.setName("LiteralUnlimitedNatural98");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural98.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural98.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralUnlimitedNatural119
		addToElementRepository("LiteralUnlimitedNatural119", AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural119);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural119.setName("LiteralUnlimitedNatural119");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural119.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural119.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create A_Array_Pattern_result::LiteralUnlimitedNatural39
		addToElementRepository("LiteralUnlimitedNatural39", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural39);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural39.setName("LiteralUnlimitedNatural39");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural39.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural39.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural54
		addToElementRepository("LiteralUnlimitedNatural54", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural54);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural54.setName("LiteralUnlimitedNatural54");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural54.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural54.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_PWP_R_y::LiteralUnlimitedNatural179
		addToElementRepository("LiteralUnlimitedNatural179", AssemblyConnectors_PWP_PWP_R_y_LiteralUnlimitedNatural179);
		AssemblyConnectors_PWP_PWP_R_y_LiteralUnlimitedNatural179.setName("LiteralUnlimitedNatural179");
		AssemblyConnectors_PWP_PWP_R_y_LiteralUnlimitedNatural179.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_R_y_LiteralUnlimitedNatural179.setValue(-1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow AssemblyConnectors_PWP_PWP_main::ObjectFlow91
		addToElementRepository("ObjectFlow91", AssemblyConnectors_PWP_PWP_main_ObjectFlow91);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow91.setName("ObjectFlow91");
		AssemblyConnectors_PWP_PWP_main_ObjectFlow91.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_main_ObjectFlow91.setSource(AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow91.setTarget(AssemblyConnectors_PWP_PWP_main_assert_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow91.setGuard(AssemblyConnectors_PWP_PWP_main_ObjectFlow91_LiteralBoolean93);
		// ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern::ObjectFlow70
		addToElementRepository("ObjectFlow70", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70.setName("ObjectFlow70");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70.setSource(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70.setTarget(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70.setGuard(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow70_LiteralBoolean71);
		// ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern::ObjectFlow78
		addToElementRepository("ObjectFlow78", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78.setName("ObjectFlow78");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78.setSource(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78.setTarget(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78.setGuard(AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralBoolean79);
		// ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern::ObjectFlow135
		addToElementRepository("ObjectFlow135", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135.setName("ObjectFlow135");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135.setSource(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135.setTarget(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135.setGuard(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow135_LiteralBoolean137);
		// ObjectFlow AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern::ObjectFlow6
		addToElementRepository("ObjectFlow6", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6.setName("ObjectFlow6");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6.setSource(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6.setTarget(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_value);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6.setGuard(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_ObjectFlow6_LiteralBoolean7);
		// ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern::ObjectFlow166
		addToElementRepository("ObjectFlow166", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166.setName("ObjectFlow166");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166.setSource(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166.setTarget(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166.setGuard(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow166_LiteralBoolean168);
		// ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern::ObjectFlow40
		addToElementRepository("ObjectFlow40", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40.setName("ObjectFlow40");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40.setSource(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40.setTarget(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40.setGuard(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow40_LiteralBoolean42);
		// ObjectFlow AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern::ObjectFlow55
		addToElementRepository("ObjectFlow55", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55.setName("ObjectFlow55");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55.setSource(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55.setTarget(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_value);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55.setGuard(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_ObjectFlow55_LiteralBoolean56);
		// ObjectFlow AssemblyConnectors_PWP_PWP_main::ObjectFlow107
		addToElementRepository("ObjectFlow107", AssemblyConnectors_PWP_PWP_main_ObjectFlow107);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow107.setName("ObjectFlow107");
		AssemblyConnectors_PWP_PWP_main_ObjectFlow107.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_main_ObjectFlow107.setSource(AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow107.setTarget(AssemblyConnectors_PWP_PWP_main_assert_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow107.setGuard(AssemblyConnectors_PWP_PWP_main_ObjectFlow107_LiteralBoolean108);
		// ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern::ObjectFlow35
		addToElementRepository("ObjectFlow35", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35.setName("ObjectFlow35");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35.setSource(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35.setTarget(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35.setGuard(AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_ObjectFlow35_LiteralBoolean37);
		// ObjectFlow AssemblyConnectors_PWP_PWP_main::ObjectFlow111
		addToElementRepository("ObjectFlow111", AssemblyConnectors_PWP_PWP_main_ObjectFlow111);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow111.setName("ObjectFlow111");
		AssemblyConnectors_PWP_PWP_main_ObjectFlow111.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_main_ObjectFlow111.setSource(AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow111.setTarget(AssemblyConnectors_PWP_PWP_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow111.setGuard(AssemblyConnectors_PWP_PWP_main_ObjectFlow111_LiteralBoolean113);
		// ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern::ObjectFlow163
		addToElementRepository("ObjectFlow163", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163.setName("ObjectFlow163");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163.setSource(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163.setTarget(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163.setGuard(AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_ObjectFlow163_LiteralBoolean165);
		// ObjectFlow AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern::ObjectFlow138
		addToElementRepository("ObjectFlow138", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138.setName("ObjectFlow138");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138.setSource(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138.setTarget(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138.setGuard(AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_ObjectFlow138_LiteralBoolean140);
		// ObjectFlow AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern::ObjectFlow147
		addToElementRepository("ObjectFlow147", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147.setName("ObjectFlow147");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147.setSource(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147.setTarget(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_value);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147.setGuard(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_ObjectFlow147_LiteralBoolean149);
		// ObjectFlow AssemblyConnectors_PWP_PWP_main::ObjectFlow127
		addToElementRepository("ObjectFlow127", AssemblyConnectors_PWP_PWP_main_ObjectFlow127);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow127.setName("ObjectFlow127");
		AssemblyConnectors_PWP_PWP_main_ObjectFlow127.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_main_ObjectFlow127.setSource(AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow127.setTarget(AssemblyConnectors_PWP_PWP_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_main_ObjectFlow127.setGuard(AssemblyConnectors_PWP_PWP_main_ObjectFlow127_LiteralBoolean129);
		// ObjectFlow AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern::ObjectFlow23
		addToElementRepository("ObjectFlow23", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23.setName("ObjectFlow23");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23.setSource(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23.setTarget(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_value);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23.setGuard(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_ObjectFlow23_LiteralBoolean24);
	}

	private void initializeOperation_Instances()
	{
		// Operation AssemblyConnectors_PWP_PWP_A_Star_Pattern::A_Star_Pattern_A_Star_Pattern
		addToElementRepository("A_Star_Pattern_A_Star_Pattern", AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.setName("A_Star_Pattern");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.addOwnedParameter(AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation AssemblyConnectors_PWP_PWP_A_Array_Pattern::A_Array_Pattern_A_Array_Pattern
		addToElementRepository("A_Array_Pattern_A_Array_Pattern", AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.setName("A_Array_Pattern");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.addOwnedParameter(AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern::A_Unconnected_Pattern_A_Unconnected_Pattern
		addToElementRepository("A_Unconnected_Pattern_A_Unconnected_Pattern", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.setName("A_Unconnected_Pattern");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.addOwnedParameter(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation AssemblyConnectors_PWP_PWP_A_Empty_Pattern::A_Empty_Pattern_A_Empty_Pattern
		addToElementRepository("A_Empty_Pattern_A_Empty_Pattern", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.setName("A_Empty_Pattern");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.addOwnedParameter(AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Array_Pattern_a_Array_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Array_Pattern);
		// OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create A_Empty_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setName("result");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setType(AssemblyConnectors_PWP_PWP_A_Empty_Pattern);
		// OutputPin AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern);
		// OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create A_Array_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setName("result");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setType(AssemblyConnectors_PWP_PWP_A_Array_Pattern);
		// OutputPin AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result.setName("result");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern()::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result.setName("result");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_A_Array_Pattern__result.setType(AssemblyConnectors_PWP_PWP_A_Array_Pattern);
		// OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern()::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setName("result");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setType(AssemblyConnectors_PWP_PWP_A_Empty_Pattern);
		// OutputPin AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result.setName("result");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus.setName("errorStatus");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result.setName("result");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Star_Pattern_a_Star_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Star_Pattern);
		// OutputPin AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus.setName("errorStatus");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create A_Star_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setName("result");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setType(AssemblyConnectors_PWP_PWP_A_Star_Pattern);
		// OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setName("result");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setType(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern);
		// OutputPin AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result.setName("result");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Empty_Pattern);
		// OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setName("result");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setType(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern);
		// OutputPin AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern()::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result.setName("result");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_A_Star_Pattern__result.setType(AssemblyConnectors_PWP_PWP_A_Star_Pattern);
		// OutputPin AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus.setName("errorStatus");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus.setName("errorStatus");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_writeLine_errorStatus.setLower(0);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport AssemblyConnectors_PWP_PWP::PackageImport69
		addToElementRepository("PackageImport69", AssemblyConnectors_PWP_PWP_PackageImport69);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setName("result");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setType(AssemblyConnectors_PWP_PWP_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_a_Array_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Array_Pattern);
		// Parameter AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setName("result");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setType(AssemblyConnectors_PWP_PWP_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_a_Star_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Star_Pattern);
		// Parameter AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setName("result");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setType(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Empty_Pattern_a_Empty_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Array_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Array_Pattern_a_Array_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Star_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Star_Pattern_a_Star_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setName("result");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setType(AssemblyConnectors_PWP_PWP_A_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_a_Empty_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Empty_Pattern);
		// Parameter AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern);
	}

	private void initializePort_Instances()
	{
		// Port AssemblyConnectors_PWP_PWP_B::p
		addToElementRepository("p", AssemblyConnectors_PWP_PWP_B_p);
		AssemblyConnectors_PWP_PWP_B_p.setName("p");
		AssemblyConnectors_PWP_PWP_B_p.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_B_p.setUpper(-1);
		AssemblyConnectors_PWP_PWP_B_p.setLower(2);
		AssemblyConnectors_PWP_PWP_B_p.setType(AssemblyConnectors_PWP_PWP_IImpl);
		AssemblyConnectors_PWP_PWP_B_p.setAggregation(AggregationKind.composite);
		AssemblyConnectors_PWP_PWP_B_p.isService = true;
		AssemblyConnectors_PWP_PWP_B_p.addProvided(AssemblyConnectors_PWP_PWP_I);
		// Port AssemblyConnectors_PWP_PWP_C::q
		addToElementRepository("q", AssemblyConnectors_PWP_PWP_C_q);
		AssemblyConnectors_PWP_PWP_C_q.setName("q");
		AssemblyConnectors_PWP_PWP_C_q.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_C_q.setUpper(-1);
		AssemblyConnectors_PWP_PWP_C_q.setType(AssemblyConnectors_PWP_PWP_IImpl);
		AssemblyConnectors_PWP_PWP_C_q.setAggregation(AggregationKind.composite);
		AssemblyConnectors_PWP_PWP_C_q.isService = true;
		AssemblyConnectors_PWP_PWP_C_q.addProvided(AssemblyConnectors_PWP_PWP_I);
	}

	private void initializeProperty_Instances()
	{
		// Property AssemblyConnectors_PWP_PWP_A_Empty_Pattern::partC
		addToElementRepository("partC", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC.setName("partC");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC.setLower(0);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC.setType(AssemblyConnectors_PWP_PWP_C);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_PWP_A_Empty_Pattern::partB
		addToElementRepository("partB", AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB.setName("partB");
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB.setLower(0);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB.setType(AssemblyConnectors_PWP_PWP_B);
		AssemblyConnectors_PWP_PWP_A_Empty_Pattern_partB.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_PWP_R::y
		addToElementRepository("y", AssemblyConnectors_PWP_PWP_R_y);
		AssemblyConnectors_PWP_PWP_R_y.setName("y");
		AssemblyConnectors_PWP_PWP_R_y.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_R_y.setUpper(-1);
		AssemblyConnectors_PWP_PWP_R_y.setLower(0);
		AssemblyConnectors_PWP_PWP_R_y.setType(AssemblyConnectors_PWP_PWP_IImpl);
		// Property AssemblyConnectors_PWP_PWP_R::x
		addToElementRepository("x", AssemblyConnectors_PWP_PWP_R_x);
		AssemblyConnectors_PWP_PWP_R_x.setName("x");
		AssemblyConnectors_PWP_PWP_R_x.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_R_x.setUpper(-1);
		AssemblyConnectors_PWP_PWP_R_x.setLower(0);
		AssemblyConnectors_PWP_PWP_R_x.setType(AssemblyConnectors_PWP_PWP_IImpl);
		// Property AssemblyConnectors_PWP_PWP_A_Star_Pattern::partC
		addToElementRepository("partC", AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC.setName("partC");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC.setLower(5);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC.setType(AssemblyConnectors_PWP_PWP_C);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern::partB
		addToElementRepository("partB", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB.setName("partB");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB.setLower(2);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB.setType(AssemblyConnectors_PWP_PWP_B);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partB.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_PWP_A_Array_Pattern::partC
		addToElementRepository("partC", AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC.setName("partC");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC.setLower(4);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC.setType(AssemblyConnectors_PWP_PWP_C);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_PWP_A_Star_Pattern::partB
		addToElementRepository("partB", AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB.setName("partB");
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB.setLower(2);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB.setType(AssemblyConnectors_PWP_PWP_B);
		AssemblyConnectors_PWP_PWP_A_Star_Pattern_partB.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern::partC
		addToElementRepository("partC", AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC.setName("partC");
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC.setLower(3);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC.setType(AssemblyConnectors_PWP_PWP_C);
		AssemblyConnectors_PWP_PWP_A_Unconnected_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_PWP_A_Array_Pattern::partB
		addToElementRepository("partB", AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB.setName("partB");
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB.setUpper(-1);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB.setLower(2);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB.setType(AssemblyConnectors_PWP_PWP_B);
		AssemblyConnectors_PWP_PWP_A_Array_Pattern_partB.setAggregation(AggregationKind.composite);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern::message
		addToElementRepository("message", AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message.setName("message");
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message.setValue(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_LiteralString146);
		AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message.setResult(AssemblyConnectors_PWP_PWP_assert_A_Unconnected_Pattern_message_result);
		// ValueSpecificationAction AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern::message
		addToElementRepository("message", AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message.setName("message");
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message.setValue(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_LiteralString22);
		AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message.setResult(AssemblyConnectors_PWP_PWP_assert_A_Empty_Pattern_message_result);
		// ValueSpecificationAction AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern::message
		addToElementRepository("message", AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message.setName("message");
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message.setValue(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_LiteralString59);
		AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message.setResult(AssemblyConnectors_PWP_PWP_assert_A_Array_Pattern_message_result);
		// ValueSpecificationAction AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern::message
		addToElementRepository("message", AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message.setName("message");
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message.setValue(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_LiteralString12);
		AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message.setResult(AssemblyConnectors_PWP_PWP_assert_A_Star_Pattern_message_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // AssemblyConnectors_PWP_PWPModel
