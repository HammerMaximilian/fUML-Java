/*
 * AssemblyConnectors_PWP_PModel.java
 * 
 * Auto-generated file
 */
package AssemblyConnectors_PWP_P;

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

public class AssemblyConnectors_PWP_PModel extends InMemoryModel
{
	private static AssemblyConnectors_PWP_PModel instance;

	/*
	 * Model AssemblyConnectors_PWP_P
	 */
	public Package AssemblyConnectors_PWP_P = new Package();
		public Activity AssemblyConnectors_PWP_P_assert_A_Star_Pattern = new Activity();
			public ObjectFlow AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0_LiteralInteger1 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0_LiteralBoolean2 = new LiteralBoolean();
			public CallBehaviorAction AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger3 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural4 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger5 = new LiteralInteger();
				public OutputPin AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural6 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger7 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger8 = new LiteralInteger();
			public ActivityParameterNode AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger9 = new LiteralInteger();
			public Parameter AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern = new Parameter();
			public ValueSpecificationAction AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message = new ValueSpecificationAction();
				public LiteralString AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_LiteralString10 = new LiteralString();
				public OutputPin AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result_LiteralInteger11 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural12 = new LiteralUnlimitedNatural();
		public Class_ AssemblyConnectors_PWP_P_C = new Class_();
		public Class_ AssemblyConnectors_PWP_P_A_Unconnected_Pattern = new Class_();
			public Operation AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern = new Operation();
				public Parameter AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result = new Parameter();
			public Comment AssemblyConnectors_PWP_P_A_Unconnected_Pattern_Comment13 = new Comment();
			public Property AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural14 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB_LiteralInteger15 = new LiteralInteger();
			public Property AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC = new Property();
				public LiteralInteger AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC_LiteralInteger16 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural17 = new LiteralUnlimitedNatural();
			public Connector AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r = new Connector();
				public ConnectorEnd AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18_connectorEnd_1_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
				public ConnectorEnd AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19 = new ConnectorEnd();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19_connectorEnd_2_Lower = new LiteralInteger();
		public Class_ AssemblyConnectors_PWP_P_A_Empty_Pattern = new Class_();
			public Property AssemblyConnectors_PWP_P_A_Empty_Pattern_partB = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Empty_Pattern_partB_LiteralUnlimitedNatural20 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_PWP_P_A_Empty_Pattern_partB_LiteralInteger21 = new LiteralInteger();
			public Property AssemblyConnectors_PWP_P_A_Empty_Pattern_partC = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Empty_Pattern_partC_LiteralUnlimitedNatural22 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_PWP_P_A_Empty_Pattern_partC_LiteralInteger23 = new LiteralInteger();
			public Operation AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern = new Operation();
				public Parameter AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result = new Parameter();
			public Comment AssemblyConnectors_PWP_P_A_Empty_Pattern_Comment24 = new Comment();
			public Connector AssemblyConnectors_PWP_P_A_Empty_Pattern_r = new Connector();
				public ConnectorEnd AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25_connectorEnd_1_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
				public ConnectorEnd AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26_connectorEnd_2_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
		public PackageImport AssemblyConnectors_PWP_P_PackageImport27 = new PackageImport();
		public Interface AssemblyConnectors_PWP_P_I = new Interface();
		public Activity AssemblyConnectors_PWP_P_main = new Activity();
			public CallBehaviorAction AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural28 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger29 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger30 = new LiteralInteger();
			public ControlFlow AssemblyConnectors_PWP_P_main_ControlFlow31 = new ControlFlow();
			public CallBehaviorAction AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural32 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger33 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger34 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_PWP_P_main_ObjectFlow35 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_P_main_ObjectFlow35_LiteralInteger36 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_P_main_ObjectFlow35_LiteralBoolean37 = new LiteralBoolean();
			public ControlFlow AssemblyConnectors_PWP_P_main_ControlFlow38 = new ControlFlow();
			public CallBehaviorAction AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural39 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger40 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger41 = new LiteralInteger();
			public CallBehaviorAction AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger42 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural43 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger44 = new LiteralInteger();
			public CallBehaviorAction AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural45 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger46 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger47 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_PWP_P_main_ObjectFlow48 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_P_main_ObjectFlow48_LiteralInteger49 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_P_main_ObjectFlow48_LiteralBoolean50 = new LiteralBoolean();
			public CallBehaviorAction AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger51 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger52 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural53 = new LiteralUnlimitedNatural();
			public CallBehaviorAction AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger54 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural55 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger56 = new LiteralInteger();
			public ControlFlow AssemblyConnectors_PWP_P_main_ControlFlow57 = new ControlFlow();
			public ObjectFlow AssemblyConnectors_PWP_P_main_ObjectFlow58 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_P_main_ObjectFlow58_LiteralInteger59 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_P_main_ObjectFlow58_LiteralBoolean60 = new LiteralBoolean();
			public ObjectFlow AssemblyConnectors_PWP_P_main_ObjectFlow61 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_P_main_ObjectFlow61_LiteralInteger62 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_P_main_ObjectFlow61_LiteralBoolean63 = new LiteralBoolean();
			public CallBehaviorAction AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger64 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger65 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural66 = new LiteralUnlimitedNatural();
		public Comment AssemblyConnectors_PWP_P_Comment67 = new Comment();
		public Activity AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern = new Activity();
			public ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68_LiteralInteger69 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68_LiteralBoolean70 = new LiteralBoolean();
			public CreateObjectAction AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern = new CreateObjectAction();
				public OutputPin AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural71 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger72 = new LiteralInteger();
			public CallOperationAction AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern_ = new CallOperationAction();
				public OutputPin AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural73 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger74 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger75 = new LiteralInteger();
				public InputPin AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger76 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural77 = new LiteralUnlimitedNatural();
			public ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78_LiteralInteger79 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78_LiteralBoolean80 = new LiteralBoolean();
			public ActivityParameterNode AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger81 = new LiteralInteger();
			public Parameter AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern = new Parameter();
		public Activity AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern = new Activity();
			public Parameter AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern = new Parameter();
			public CallOperationAction AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern_ = new CallOperationAction();
				public InputPin AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target = new InputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger82 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural83 = new LiteralUnlimitedNatural();
				public OutputPin AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger84 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural85 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger86 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87_LiteralInteger88 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87_LiteralBoolean89 = new LiteralBoolean();
			public ActivityParameterNode AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern_node = new ActivityParameterNode();
			public ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90_LiteralBoolean91 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90_LiteralInteger92 = new LiteralInteger();
			public CreateObjectAction AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern = new CreateObjectAction();
				public OutputPin AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger93 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural94 = new LiteralUnlimitedNatural();
		public Class_ AssemblyConnectors_PWP_P_A_Array_Pattern = new Class_();
			public Operation AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern = new Operation();
				public Parameter AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result = new Parameter();
			public Comment AssemblyConnectors_PWP_P_A_Array_Pattern_Comment95 = new Comment();
			public Property AssemblyConnectors_PWP_P_A_Array_Pattern_partC = new Property();
				public LiteralInteger AssemblyConnectors_PWP_P_A_Array_Pattern_partC_LiteralInteger96 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Array_Pattern_partC_LiteralUnlimitedNatural97 = new LiteralUnlimitedNatural();
			public Connector AssemblyConnectors_PWP_P_A_Array_Pattern_r = new Connector();
				public ConnectorEnd AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98 = new ConnectorEnd();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98_connectorEnd_1_Lower = new LiteralInteger();
				public ConnectorEnd AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99_connectorEnd_2_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
			public Property AssemblyConnectors_PWP_P_A_Array_Pattern_partB = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Array_Pattern_partB_LiteralUnlimitedNatural100 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_PWP_P_A_Array_Pattern_partB_LiteralInteger101 = new LiteralInteger();
		public Activity AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern = new Activity();
			public ActivityParameterNode AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node = new ActivityParameterNode();
			public Parameter AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern = new Parameter();
			public ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102_LiteralInteger103 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102_LiteralBoolean104 = new LiteralBoolean();
			public CallOperationAction AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_ = new CallOperationAction();
				public InputPin AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural105 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger106 = new LiteralInteger();
				public OutputPin AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger107 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger108 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural109 = new LiteralUnlimitedNatural();
			public CreateObjectAction AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern = new CreateObjectAction();
				public OutputPin AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural110 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger111 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112_LiteralBoolean113 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112_LiteralInteger114 = new LiteralInteger();
		public Association AssemblyConnectors_PWP_P_R = new Association();
			public Property AssemblyConnectors_PWP_P_R_x = new Property();
				public LiteralInteger AssemblyConnectors_PWP_P_R_x_LiteralInteger115 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_R_x_LiteralUnlimitedNatural116 = new LiteralUnlimitedNatural();
			public Property AssemblyConnectors_PWP_P_R_y = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_R_y_LiteralUnlimitedNatural117 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_PWP_P_R_y_LiteralInteger118 = new LiteralInteger();
		public Activity AssemblyConnectors_PWP_P_assert_A_Array_Pattern = new Activity();
			public ValueSpecificationAction AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message = new ValueSpecificationAction();
				public OutputPin AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result_LiteralInteger119 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural120 = new LiteralUnlimitedNatural();
				public LiteralString AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_LiteralString121 = new LiteralString();
			public CallBehaviorAction AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural122 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger123 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger124 = new LiteralInteger();
				public OutputPin AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger125 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger126 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural127 = new LiteralUnlimitedNatural();
			public Parameter AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern = new Parameter();
			public ActivityParameterNode AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger128 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129_LiteralInteger130 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129_LiteralBoolean131 = new LiteralBoolean();
		public Activity AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern = new Activity();
			public ValueSpecificationAction AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message = new ValueSpecificationAction();
				public OutputPin AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger132 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural133 = new LiteralUnlimitedNatural();
				public LiteralString AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_LiteralString134 = new LiteralString();
			public Parameter AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern = new Parameter();
			public CallBehaviorAction AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger135 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger136 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural137 = new LiteralUnlimitedNatural();
				public InputPin AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural138 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger139 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger140 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141_LiteralBoolean142 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141_LiteralInteger143 = new LiteralInteger();
			public ActivityParameterNode AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger144 = new LiteralInteger();
		public Class_ AssemblyConnectors_PWP_P_A_Star_Pattern = new Class_();
			public Operation AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern = new Operation();
				public Parameter AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result = new Parameter();
			public Property AssemblyConnectors_PWP_P_A_Star_Pattern_partC = new Property();
				public LiteralInteger AssemblyConnectors_PWP_P_A_Star_Pattern_partC_LiteralInteger145 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Star_Pattern_partC_LiteralUnlimitedNatural146 = new LiteralUnlimitedNatural();
			public Comment AssemblyConnectors_PWP_P_A_Star_Pattern_Comment147 = new Comment();
			public Property AssemblyConnectors_PWP_P_A_Star_Pattern_partB = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Star_Pattern_partB_LiteralUnlimitedNatural148 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_PWP_P_A_Star_Pattern_partB_LiteralInteger149 = new LiteralInteger();
			public Connector AssemblyConnectors_PWP_P_A_Star_Pattern_r = new Connector();
				public ConnectorEnd AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150_connectorEnd_1_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
				public ConnectorEnd AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151 = new ConnectorEnd();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151_connectorEnd_2_Lower = new LiteralInteger();
		public Class_ AssemblyConnectors_PWP_P_IImpl = new Class_();
			public InterfaceRealization AssemblyConnectors_PWP_P_IImpl_I_Realization = new InterfaceRealization();
		public Activity AssemblyConnectors_PWP_P_assert_A_Empty_Pattern = new Activity();
			public CallBehaviorAction AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine = new CallBehaviorAction();
				public InputPin AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural152 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger153 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger154 = new LiteralInteger();
				public OutputPin AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger155 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger156 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural157 = new LiteralUnlimitedNatural();
			public ObjectFlow AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158_LiteralBoolean159 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158_LiteralInteger160 = new LiteralInteger();
			public Parameter AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern = new Parameter();
			public ActivityParameterNode AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger161 = new LiteralInteger();
			public ValueSpecificationAction AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message = new ValueSpecificationAction();
				public OutputPin AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural162 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result_LiteralInteger163 = new LiteralInteger();
				public LiteralString AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_LiteralString164 = new LiteralString();
		public Class_ AssemblyConnectors_PWP_P_B = new Class_();
			public Port AssemblyConnectors_PWP_P_B_p = new Port();
				public LiteralInteger AssemblyConnectors_PWP_P_B_p_LiteralInteger165 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_B_p_LiteralUnlimitedNatural166 = new LiteralUnlimitedNatural();
		public Activity AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern = new Activity();
			public CreateObjectAction AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern = new CreateObjectAction();
				public OutputPin AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger167 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural168 = new LiteralUnlimitedNatural();
			public CallOperationAction AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_ = new CallOperationAction();
				public InputPin AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural169 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger170 = new LiteralInteger();
				public OutputPin AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result = new OutputPin();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger171 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural172 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger173 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174_LiteralBoolean175 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174_LiteralInteger176 = new LiteralInteger();
			public ActivityParameterNode AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node = new ActivityParameterNode();
			public Parameter AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern = new Parameter();
			public ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177_LiteralInteger178 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177_LiteralBoolean179 = new LiteralBoolean();

	public static AssemblyConnectors_PWP_PModel instance()
	{
		if (instance == null)
        {
            instance = new AssemblyConnectors_PWP_PModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public AssemblyConnectors_PWP_PModel()
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
		// Activity AssemblyConnectors_PWP_P::instantiate_A_Array_Pattern
		addToElementRepository("instantiate_A_Array_Pattern", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern.setName("instantiate_A_Array_Pattern");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern.addOwnedParameter(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern.addNode(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern.addNode(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern.addNode(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern.addEdge(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern.addEdge(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78);
		// Activity AssemblyConnectors_PWP_P::instantiate_A_Star_Pattern
		addToElementRepository("instantiate_A_Star_Pattern", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern.setName("instantiate_A_Star_Pattern");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern.addOwnedParameter(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern.addNode(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern.addNode(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern.addNode(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern.addEdge(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern.addEdge(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90);
		// Activity AssemblyConnectors_PWP_P::assert_A_Star_Pattern
		addToElementRepository("assert_A_Star_Pattern", AssemblyConnectors_PWP_P_assert_A_Star_Pattern);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern.setName("assert_A_Star_Pattern");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern.addOwnedParameter(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern.addNode(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern.addNode(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern.addNode(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern.addEdge(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0);
		// Activity AssemblyConnectors_PWP_P::instantiate_A_Unconnected_Pattern
		addToElementRepository("instantiate_A_Unconnected_Pattern", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern.setName("instantiate_A_Unconnected_Pattern");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern.addOwnedParameter(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern.addNode(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern.addNode(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern.addNode(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern.addEdge(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern.addEdge(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112);
		// Activity AssemblyConnectors_PWP_P::assert_A_Array_Pattern
		addToElementRepository("assert_A_Array_Pattern", AssemblyConnectors_PWP_P_assert_A_Array_Pattern);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern.setName("assert_A_Array_Pattern");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern.addOwnedParameter(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern.addNode(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern.addNode(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern.addNode(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern.addEdge(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129);
		// Activity AssemblyConnectors_PWP_P::assert_A_Unconnected_Pattern
		addToElementRepository("assert_A_Unconnected_Pattern", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern.setName("assert_A_Unconnected_Pattern");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern.addOwnedParameter(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern.addNode(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern.addNode(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern.addNode(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern.addEdge(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141);
		// Activity AssemblyConnectors_PWP_P::assert_A_Empty_Pattern
		addToElementRepository("assert_A_Empty_Pattern", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern.setName("assert_A_Empty_Pattern");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern.addOwnedParameter(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern.addNode(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern.addNode(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern.addNode(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern.addEdge(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158);
		// Activity AssemblyConnectors_PWP_P::instantiate_A_Empty_Pattern
		addToElementRepository("instantiate_A_Empty_Pattern", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern.setName("instantiate_A_Empty_Pattern");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern.addOwnedParameter(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern.addNode(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern.addNode(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern.addNode(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern.addEdge(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern.addEdge(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177);
		// Activity AssemblyConnectors_PWP_P::main
		addToElementRepository("main", AssemblyConnectors_PWP_P_main);
		AssemblyConnectors_PWP_P_main.setName("main");
		AssemblyConnectors_PWP_P_main.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main.addNode(AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_main.addNode(AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_main.addNode(AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_main.addNode(AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern);
		AssemblyConnectors_PWP_P_main.addNode(AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern);
		AssemblyConnectors_PWP_P_main.addNode(AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_main.addNode(AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern);
		AssemblyConnectors_PWP_P_main.addNode(AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern);
		AssemblyConnectors_PWP_P_main.addEdge(AssemblyConnectors_PWP_P_main_ObjectFlow48);
		AssemblyConnectors_PWP_P_main.addEdge(AssemblyConnectors_PWP_P_main_ControlFlow31);
		AssemblyConnectors_PWP_P_main.addEdge(AssemblyConnectors_PWP_P_main_ObjectFlow35);
		AssemblyConnectors_PWP_P_main.addEdge(AssemblyConnectors_PWP_P_main_ControlFlow38);
		AssemblyConnectors_PWP_P_main.addEdge(AssemblyConnectors_PWP_P_main_ControlFlow57);
		AssemblyConnectors_PWP_P_main.addEdge(AssemblyConnectors_PWP_P_main_ObjectFlow58);
		AssemblyConnectors_PWP_P_main.addEdge(AssemblyConnectors_PWP_P_main_ObjectFlow61);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern_node
		addToElementRepository("a_Unconnected_Pattern_node", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setName("a_Unconnected_Pattern_node");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setParameter(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern::a_Star_Pattern_node
		addToElementRepository("a_Star_Pattern_node", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern_node.setName("a_Star_Pattern_node");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern_node.setParameter(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_P_assert_A_Star_Pattern::a_Star_Pattern_node
		addToElementRepository("a_Star_Pattern_node", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern_node.setName("a_Star_Pattern_node");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern_node.setParameter(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern::a_Array_Pattern_node
		addToElementRepository("a_Array_Pattern_node", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node.setName("a_Array_Pattern_node");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node.setParameter(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_P_assert_A_Array_Pattern::a_Array_Pattern_node
		addToElementRepository("a_Array_Pattern_node", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern_node.setName("a_Array_Pattern_node");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern_node.setParameter(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern::a_Empty_Pattern_node
		addToElementRepository("a_Empty_Pattern_node", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setName("a_Empty_Pattern_node");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setParameter(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern::a_Unconnected_Pattern_node
		addToElementRepository("a_Unconnected_Pattern_node", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setName("a_Unconnected_Pattern_node");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setParameter(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// ActivityParameterNode AssemblyConnectors_PWP_P_assert_A_Empty_Pattern::a_Empty_Pattern_node
		addToElementRepository("a_Empty_Pattern_node", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern_node.setName("a_Empty_Pattern_node");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern_node.setParameter(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern);
	}

	private void initializeAssociation_Instances()
	{
		// Association AssemblyConnectors_PWP_P::R
		addToElementRepository("R", AssemblyConnectors_PWP_P_R);
		AssemblyConnectors_PWP_P_R.setName("R");
		AssemblyConnectors_PWP_P_R.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_R.addOwnedEnd(AssemblyConnectors_PWP_P_R_x);
		AssemblyConnectors_PWP_P_R.addOwnedEnd(AssemblyConnectors_PWP_P_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction AssemblyConnectors_PWP_P_main::assert_A_Unconnected_Pattern
		addToElementRepository("assert_A_Unconnected_Pattern", AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern.setName("assert_A_Unconnected_Pattern");
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern.setBehavior(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern.addArgument(AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_P_assert_A_Empty_Pattern::writeLine
		addToElementRepository("writeLine", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine.setName("writeLine");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine.addResult(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine.addArgument(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value);
		// CallBehaviorAction AssemblyConnectors_PWP_P_main::instantiate_A_Empty_Pattern
		addToElementRepository("instantiate_A_Empty_Pattern", AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern.setName("instantiate_A_Empty_Pattern");
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern.addResult(AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern.setBehavior(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_P_assert_A_Star_Pattern::writeLine
		addToElementRepository("writeLine", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine.setName("writeLine");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine.addResult(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine.addArgument(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value);
		// CallBehaviorAction AssemblyConnectors_PWP_P_assert_A_Array_Pattern::writeLine
		addToElementRepository("writeLine", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine.setName("writeLine");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine.addResult(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine.addArgument(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value);
		// CallBehaviorAction AssemblyConnectors_PWP_P_main::assert_A_Empty_Pattern
		addToElementRepository("assert_A_Empty_Pattern", AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern.setName("assert_A_Empty_Pattern");
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern.setBehavior(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern.addArgument(AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern::writeLine
		addToElementRepository("writeLine", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine.setName("writeLine");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine.addResult(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine.addArgument(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value);
		// CallBehaviorAction AssemblyConnectors_PWP_P_main::assert_A_Star_Pattern
		addToElementRepository("assert_A_Star_Pattern", AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern);
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern.setName("assert_A_Star_Pattern");
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern.setBehavior(AssemblyConnectors_PWP_P_assert_A_Star_Pattern);
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern.addArgument(AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_P_main::instantiate_A_Array_Pattern
		addToElementRepository("instantiate_A_Array_Pattern", AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern);
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern.setName("instantiate_A_Array_Pattern");
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern.addResult(AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern.setBehavior(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_P_main::instantiate_A_Unconnected_Pattern
		addToElementRepository("instantiate_A_Unconnected_Pattern", AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern.setName("instantiate_A_Unconnected_Pattern");
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern.addResult(AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern.setBehavior(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_P_main::assert_A_Array_Pattern
		addToElementRepository("assert_A_Array_Pattern", AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern);
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern.setName("assert_A_Array_Pattern");
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern.setBehavior(AssemblyConnectors_PWP_P_assert_A_Array_Pattern);
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern.addArgument(AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern);
		// CallBehaviorAction AssemblyConnectors_PWP_P_main::instantiate_A_Star_Pattern
		addToElementRepository("instantiate_A_Star_Pattern", AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern);
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern.setName("instantiate_A_Star_Pattern");
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern.addResult(AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern.setBehavior(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern::A_Star_Pattern()
		addToElementRepository("A_Star_Pattern()", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern_.setName("A_Star_Pattern()");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern_.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern_.addResult(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern_.setOperation(AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern_.setTarget(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		// CallOperationAction AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern::A_Empty_Pattern()
		addToElementRepository("A_Empty_Pattern()", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setName("A_Empty_Pattern()");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.addResult(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setOperation(AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setTarget(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		// CallOperationAction AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern::A_Array_Pattern()
		addToElementRepository("A_Array_Pattern()", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern_.setName("A_Array_Pattern()");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern_.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern_.addResult(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern_.setOperation(AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern_.setTarget(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		// CallOperationAction AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern::A_Unconnected_Pattern()
		addToElementRepository("A_Unconnected_Pattern()", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setName("A_Unconnected_Pattern()");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.addResult(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setOperation(AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setTarget(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
	}

	private void initializeClass_Instances()
	{
		// Class AssemblyConnectors_PWP_P::A_Array_Pattern
		addToElementRepository("A_Array_Pattern", AssemblyConnectors_PWP_P_A_Array_Pattern);
		AssemblyConnectors_PWP_P_A_Array_Pattern.setName("A_Array_Pattern");
		AssemblyConnectors_PWP_P_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_A_Array_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_P_A_Array_Pattern_partB);
		AssemblyConnectors_PWP_P_A_Array_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_P_A_Array_Pattern_partC);
		
		AssemblyConnectors_PWP_P_A_Array_Pattern.addOwnedConnector(AssemblyConnectors_PWP_P_A_Array_Pattern_r);
		AssemblyConnectors_PWP_P_A_Array_Pattern.addOwnedOperation(AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		// Class AssemblyConnectors_PWP_P::C
		addToElementRepository("C", AssemblyConnectors_PWP_P_C);
		AssemblyConnectors_PWP_P_C.setName("C");
		AssemblyConnectors_PWP_P_C.setVisibility(VisibilityKind.public_);
		// Class AssemblyConnectors_PWP_P::A_Unconnected_Pattern
		addToElementRepository("A_Unconnected_Pattern", AssemblyConnectors_PWP_P_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern.setName("A_Unconnected_Pattern");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC);
		
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern.addOwnedConnector(AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern.addOwnedOperation(AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		// Class AssemblyConnectors_PWP_P::A_Empty_Pattern
		addToElementRepository("A_Empty_Pattern", AssemblyConnectors_PWP_P_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_A_Empty_Pattern.setName("A_Empty_Pattern");
		AssemblyConnectors_PWP_P_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_A_Empty_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_P_A_Empty_Pattern_partB);
		AssemblyConnectors_PWP_P_A_Empty_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_P_A_Empty_Pattern_partC);
		
		AssemblyConnectors_PWP_P_A_Empty_Pattern.addOwnedConnector(AssemblyConnectors_PWP_P_A_Empty_Pattern_r);
		AssemblyConnectors_PWP_P_A_Empty_Pattern.addOwnedOperation(AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		// Class AssemblyConnectors_PWP_P::A_Star_Pattern
		addToElementRepository("A_Star_Pattern", AssemblyConnectors_PWP_P_A_Star_Pattern);
		AssemblyConnectors_PWP_P_A_Star_Pattern.setName("A_Star_Pattern");
		AssemblyConnectors_PWP_P_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_A_Star_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_P_A_Star_Pattern_partB);
		AssemblyConnectors_PWP_P_A_Star_Pattern.addOwnedAttribute(AssemblyConnectors_PWP_P_A_Star_Pattern_partC);
		
		AssemblyConnectors_PWP_P_A_Star_Pattern.addOwnedConnector(AssemblyConnectors_PWP_P_A_Star_Pattern_r);
		AssemblyConnectors_PWP_P_A_Star_Pattern.addOwnedOperation(AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		// Class AssemblyConnectors_PWP_P::IImpl
		addToElementRepository("IImpl", AssemblyConnectors_PWP_P_IImpl);
		AssemblyConnectors_PWP_P_IImpl.setName("IImpl");
		AssemblyConnectors_PWP_P_IImpl.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_IImpl.addInterfaceRealization(AssemblyConnectors_PWP_P_IImpl_I_Realization);
		// Class AssemblyConnectors_PWP_P::B
		addToElementRepository("B", AssemblyConnectors_PWP_P_B);
		AssemblyConnectors_PWP_P_B.setName("B");
		AssemblyConnectors_PWP_P_B.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_B.addOwnedAttribute(AssemblyConnectors_PWP_P_B_p);
	}

	private void initializeComment_Instances()
	{
		// Comment AssemblyConnectors_PWP_P::Comment67
		addToElementRepository("Comment67", AssemblyConnectors_PWP_P_Comment67);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment AssemblyConnectors_PWP_P_A_Empty_Pattern::Comment24
		addToElementRepository("Comment24", AssemblyConnectors_PWP_P_A_Empty_Pattern_Comment24);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment AssemblyConnectors_PWP_P_A_Unconnected_Pattern::Comment13
		addToElementRepository("Comment13", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_Comment13);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment AssemblyConnectors_PWP_P_A_Array_Pattern::Comment95
		addToElementRepository("Comment95", AssemblyConnectors_PWP_P_A_Array_Pattern_Comment95);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment AssemblyConnectors_PWP_P_A_Star_Pattern::Comment147
		addToElementRepository("Comment147", AssemblyConnectors_PWP_P_A_Star_Pattern_Comment147);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector AssemblyConnectors_PWP_P_A_Star_Pattern::r
		addToElementRepository("r", AssemblyConnectors_PWP_P_A_Star_Pattern_r);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r.setName("r");
		AssemblyConnectors_PWP_P_A_Star_Pattern_r.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r.addEnd(AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r.addEnd(AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r.setType(AssemblyConnectors_PWP_P_R);
		// Connector AssemblyConnectors_PWP_P_A_Empty_Pattern::r
		addToElementRepository("r", AssemblyConnectors_PWP_P_A_Empty_Pattern_r);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r.setName("r");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r.addEnd(AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r.addEnd(AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r.setType(AssemblyConnectors_PWP_P_R);
		// Connector AssemblyConnectors_PWP_P_A_Unconnected_Pattern::r
		addToElementRepository("r", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r.setName("r");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r.addEnd(AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r.addEnd(AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r.setType(AssemblyConnectors_PWP_P_R);
		// Connector AssemblyConnectors_PWP_P_A_Array_Pattern::r
		addToElementRepository("r", AssemblyConnectors_PWP_P_A_Array_Pattern_r);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r.setName("r");
		AssemblyConnectors_PWP_P_A_Array_Pattern_r.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r.addEnd(AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r.addEnd(AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r.setType(AssemblyConnectors_PWP_P_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd AssemblyConnectors_PWP_P_A_Array_Pattern_r::ConnectorEnd98
		addToElementRepository("ConnectorEnd98", AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98.setRole(AssemblyConnectors_PWP_P_B_p);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98.setPartWithPort(AssemblyConnectors_PWP_P_A_Array_Pattern_partB);
		// ConnectorEnd AssemblyConnectors_PWP_P_A_Empty_Pattern_r::ConnectorEnd25
		addToElementRepository("ConnectorEnd25", AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25.setRole(AssemblyConnectors_PWP_P_B_p);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25.setPartWithPort(AssemblyConnectors_PWP_P_A_Empty_Pattern_partB);
		// ConnectorEnd AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r::ConnectorEnd18
		addToElementRepository("ConnectorEnd18", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18.setLower(0);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18.setRole(AssemblyConnectors_PWP_P_B_p);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18.setPartWithPort(AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB);
		// ConnectorEnd AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r::ConnectorEnd19
		addToElementRepository("ConnectorEnd19", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19.setLower(0);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19.setRole(AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC);
		// ConnectorEnd AssemblyConnectors_PWP_P_A_Star_Pattern_r::ConnectorEnd151
		addToElementRepository("ConnectorEnd151", AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151.setLower(5);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151.setRole(AssemblyConnectors_PWP_P_A_Star_Pattern_partC);
		// ConnectorEnd AssemblyConnectors_PWP_P_A_Star_Pattern_r::ConnectorEnd150
		addToElementRepository("ConnectorEnd150", AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150.setLower(4);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150.setRole(AssemblyConnectors_PWP_P_B_p);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150.setPartWithPort(AssemblyConnectors_PWP_P_A_Star_Pattern_partB);
		// ConnectorEnd AssemblyConnectors_PWP_P_A_Array_Pattern_r::ConnectorEnd99
		addToElementRepository("ConnectorEnd99", AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99.setRole(AssemblyConnectors_PWP_P_A_Array_Pattern_partC);
		// ConnectorEnd AssemblyConnectors_PWP_P_A_Empty_Pattern_r::ConnectorEnd26
		addToElementRepository("ConnectorEnd26", AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26.setRole(AssemblyConnectors_PWP_P_A_Empty_Pattern_partC);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow AssemblyConnectors_PWP_P_main::ControlFlow31
		addToElementRepository("ControlFlow31", AssemblyConnectors_PWP_P_main_ControlFlow31);
		AssemblyConnectors_PWP_P_main_ControlFlow31.setName("ControlFlow31");
		AssemblyConnectors_PWP_P_main_ControlFlow31.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_main_ControlFlow31.setSource(AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_main_ControlFlow31.setTarget(AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern);
		// ControlFlow AssemblyConnectors_PWP_P_main::ControlFlow38
		addToElementRepository("ControlFlow38", AssemblyConnectors_PWP_P_main_ControlFlow38);
		AssemblyConnectors_PWP_P_main_ControlFlow38.setName("ControlFlow38");
		AssemblyConnectors_PWP_P_main_ControlFlow38.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_main_ControlFlow38.setSource(AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_main_ControlFlow38.setTarget(AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern);
		// ControlFlow AssemblyConnectors_PWP_P_main::ControlFlow57
		addToElementRepository("ControlFlow57", AssemblyConnectors_PWP_P_main_ControlFlow57);
		AssemblyConnectors_PWP_P_main_ControlFlow57.setName("ControlFlow57");
		AssemblyConnectors_PWP_P_main_ControlFlow57.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_main_ControlFlow57.setSource(AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern);
		AssemblyConnectors_PWP_P_main_ControlFlow57.setTarget(AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern::Create A_Array_Pattern
		addToElementRepository("Create A_Array_Pattern", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setName("Create A_Array_Pattern");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setClassifier(AssemblyConnectors_PWP_P_A_Array_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setResult(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		// CreateObjectAction AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern::Create A_Empty_Pattern
		addToElementRepository("Create A_Empty_Pattern", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setName("Create A_Empty_Pattern");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setClassifier(AssemblyConnectors_PWP_P_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setResult(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		// CreateObjectAction AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern::Create A_Star_Pattern
		addToElementRepository("Create A_Star_Pattern", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setName("Create A_Star_Pattern");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setClassifier(AssemblyConnectors_PWP_P_A_Star_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setResult(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		// CreateObjectAction AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern::Create A_Unconnected_Pattern
		addToElementRepository("Create A_Unconnected_Pattern", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setName("Create A_Unconnected_Pattern");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setClassifier(AssemblyConnectors_PWP_P_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setResult(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine::value
		addToElementRepository("value", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value.setName("value");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern.setType(AssemblyConnectors_PWP_P_A_Array_Pattern);
		// InputPin AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern.setType(AssemblyConnectors_PWP_P_A_Star_Pattern);
		// InputPin AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine::value
		addToElementRepository("value", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value.setName("value");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()::target
		addToElementRepository("target", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setName("target");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setType(AssemblyConnectors_PWP_P_A_Unconnected_Pattern);
		// InputPin AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()::target
		addToElementRepository("target", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setName("target");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setType(AssemblyConnectors_PWP_P_A_Empty_Pattern);
		// InputPin AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine::value
		addToElementRepository("value", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value.setName("value");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern()::target
		addToElementRepository("target", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target.setName("target");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target.setType(AssemblyConnectors_PWP_P_A_Star_Pattern);
		// InputPin AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern.setType(AssemblyConnectors_PWP_P_A_Empty_Pattern);
		// InputPin AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern()::target
		addToElementRepository("target", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target.setName("target");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target.setType(AssemblyConnectors_PWP_P_A_Array_Pattern);
		// InputPin AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine::value
		addToElementRepository("value", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value.setName("value");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(AssemblyConnectors_PWP_P_A_Unconnected_Pattern);
	}

	private void initializeInterface_Instances()
	{
		// Interface AssemblyConnectors_PWP_P::I
		addToElementRepository("I", AssemblyConnectors_PWP_P_I);
		AssemblyConnectors_PWP_P_I.setName("I");
		AssemblyConnectors_PWP_P_I.setVisibility(VisibilityKind.public_);
	}

	private void initializeInterfaceRealization_Instances()
	{
		// InterfaceRealization AssemblyConnectors_PWP_P_IImpl::I_Realization
		addToElementRepository("I_Realization", AssemblyConnectors_PWP_P_IImpl_I_Realization);
		AssemblyConnectors_PWP_P_IImpl_I_Realization.setName("I_Realization");
		AssemblyConnectors_PWP_P_IImpl_I_Realization.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_IImpl_I_Realization.setContract(AssemblyConnectors_PWP_P_I);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0::LiteralBoolean2
		addToElementRepository("LiteralBoolean2", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0_LiteralBoolean2);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0_LiteralBoolean2.setName("LiteralBoolean2");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0_LiteralBoolean2.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0_LiteralBoolean2.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87::LiteralBoolean89
		addToElementRepository("LiteralBoolean89", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87_LiteralBoolean89);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87_LiteralBoolean89.setName("LiteralBoolean89");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87_LiteralBoolean89.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87_LiteralBoolean89.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158::LiteralBoolean159
		addToElementRepository("LiteralBoolean159", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158_LiteralBoolean159);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158_LiteralBoolean159.setName("LiteralBoolean159");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158_LiteralBoolean159.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158_LiteralBoolean159.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78::LiteralBoolean80
		addToElementRepository("LiteralBoolean80", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78_LiteralBoolean80);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78_LiteralBoolean80.setName("LiteralBoolean80");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78_LiteralBoolean80.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78_LiteralBoolean80.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129::LiteralBoolean131
		addToElementRepository("LiteralBoolean131", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129_LiteralBoolean131);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129_LiteralBoolean131.setName("LiteralBoolean131");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129_LiteralBoolean131.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129_LiteralBoolean131.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_main_ObjectFlow35::LiteralBoolean37
		addToElementRepository("LiteralBoolean37", AssemblyConnectors_PWP_P_main_ObjectFlow35_LiteralBoolean37);
		AssemblyConnectors_PWP_P_main_ObjectFlow35_LiteralBoolean37.setName("LiteralBoolean37");
		AssemblyConnectors_PWP_P_main_ObjectFlow35_LiteralBoolean37.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_ObjectFlow35_LiteralBoolean37.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_main_ObjectFlow61::LiteralBoolean63
		addToElementRepository("LiteralBoolean63", AssemblyConnectors_PWP_P_main_ObjectFlow61_LiteralBoolean63);
		AssemblyConnectors_PWP_P_main_ObjectFlow61_LiteralBoolean63.setName("LiteralBoolean63");
		AssemblyConnectors_PWP_P_main_ObjectFlow61_LiteralBoolean63.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_ObjectFlow61_LiteralBoolean63.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177::LiteralBoolean179
		addToElementRepository("LiteralBoolean179", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177_LiteralBoolean179);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177_LiteralBoolean179.setName("LiteralBoolean179");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177_LiteralBoolean179.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177_LiteralBoolean179.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90::LiteralBoolean91
		addToElementRepository("LiteralBoolean91", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90_LiteralBoolean91);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90_LiteralBoolean91.setName("LiteralBoolean91");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90_LiteralBoolean91.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90_LiteralBoolean91.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141::LiteralBoolean142
		addToElementRepository("LiteralBoolean142", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141_LiteralBoolean142);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141_LiteralBoolean142.setName("LiteralBoolean142");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141_LiteralBoolean142.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141_LiteralBoolean142.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_main_ObjectFlow58::LiteralBoolean60
		addToElementRepository("LiteralBoolean60", AssemblyConnectors_PWP_P_main_ObjectFlow58_LiteralBoolean60);
		AssemblyConnectors_PWP_P_main_ObjectFlow58_LiteralBoolean60.setName("LiteralBoolean60");
		AssemblyConnectors_PWP_P_main_ObjectFlow58_LiteralBoolean60.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_ObjectFlow58_LiteralBoolean60.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112::LiteralBoolean113
		addToElementRepository("LiteralBoolean113", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112_LiteralBoolean113);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112_LiteralBoolean113.setName("LiteralBoolean113");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112_LiteralBoolean113.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112_LiteralBoolean113.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68::LiteralBoolean70
		addToElementRepository("LiteralBoolean70", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68_LiteralBoolean70);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68_LiteralBoolean70.setName("LiteralBoolean70");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68_LiteralBoolean70.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68_LiteralBoolean70.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174::LiteralBoolean175
		addToElementRepository("LiteralBoolean175", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174_LiteralBoolean175);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174_LiteralBoolean175.setName("LiteralBoolean175");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174_LiteralBoolean175.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174_LiteralBoolean175.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102::LiteralBoolean104
		addToElementRepository("LiteralBoolean104", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102_LiteralBoolean104);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102_LiteralBoolean104.setName("LiteralBoolean104");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102_LiteralBoolean104.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102_LiteralBoolean104.setValue(true);
		// LiteralBoolean AssemblyConnectors_PWP_P_main_ObjectFlow48::LiteralBoolean50
		addToElementRepository("LiteralBoolean50", AssemblyConnectors_PWP_P_main_ObjectFlow48_LiteralBoolean50);
		AssemblyConnectors_PWP_P_main_ObjectFlow48_LiteralBoolean50.setName("LiteralBoolean50");
		AssemblyConnectors_PWP_P_main_ObjectFlow48_LiteralBoolean50.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_ObjectFlow48_LiteralBoolean50.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC::LiteralInteger16
		addToElementRepository("LiteralInteger16", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC_LiteralInteger16);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC_LiteralInteger16.setName("LiteralInteger16");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC_LiteralInteger16.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC_LiteralInteger16.setValue(3);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0::LiteralInteger1
		addToElementRepository("LiteralInteger1", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0_LiteralInteger1);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0_LiteralInteger1.setName("LiteralInteger1");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0_LiteralInteger1.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0_LiteralInteger1.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern_node::LiteralInteger9
		addToElementRepository("LiteralInteger9", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger9);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger9.setName("LiteralInteger9");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger9.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger9.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78::LiteralInteger79
		addToElementRepository("LiteralInteger79", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78_LiteralInteger79);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78_LiteralInteger79.setName("LiteralInteger79");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78_LiteralInteger79.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78_LiteralInteger79.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result::LiteralInteger163
		addToElementRepository("LiteralInteger163", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result_LiteralInteger163);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result_LiteralInteger163.setName("LiteralInteger163");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result_LiteralInteger163.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result_LiteralInteger163.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result::LiteralInteger132
		addToElementRepository("LiteralInteger132", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger132);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger132.setName("LiteralInteger132");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger132.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger132.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Array_Pattern_partB::LiteralInteger101
		addToElementRepository("LiteralInteger101", AssemblyConnectors_PWP_P_A_Array_Pattern_partB_LiteralInteger101);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partB_LiteralInteger101.setName("LiteralInteger101");
		AssemblyConnectors_PWP_P_A_Array_Pattern_partB_LiteralInteger101.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partB_LiteralInteger101.setValue(2);
		// LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralInteger65
		addToElementRepository("LiteralInteger65", AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger65);
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger65.setName("LiteralInteger65");
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger65.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger65.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98_connectorEnd_1_Lower);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98_connectorEnd_1_Lower.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129::LiteralInteger130
		addToElementRepository("LiteralInteger130", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129_LiteralInteger130);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129_LiteralInteger130.setName("LiteralInteger130");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129_LiteralInteger130.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129_LiteralInteger130.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create A_Empty_Pattern_result::LiteralInteger167
		addToElementRepository("LiteralInteger167", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger167);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger167.setName("LiteralInteger167");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger167.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger167.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150_connectorEnd_1_Lower);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150_connectorEnd_1_Lower.setValue(4);
		// LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralInteger64
		addToElementRepository("LiteralInteger64", AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger64);
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger64.setName("LiteralInteger64");
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger64.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger64.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern()_target::LiteralInteger82
		addToElementRepository("LiteralInteger82", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger82);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger82.setName("LiteralInteger82");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger82.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger82.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralInteger40
		addToElementRepository("LiteralInteger40", AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger40);
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger40.setName("LiteralInteger40");
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger40.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger40.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value::LiteralInteger124
		addToElementRepository("LiteralInteger124", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger124);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger124.setName("LiteralInteger124");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger124.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger124.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralInteger156
		addToElementRepository("LiteralInteger156", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger156);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger156.setName("LiteralInteger156");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger156.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger156.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger29
		addToElementRepository("LiteralInteger29", AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger29);
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger29.setName("LiteralInteger29");
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger29.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger29.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Star_Pattern_partB::LiteralInteger149
		addToElementRepository("LiteralInteger149", AssemblyConnectors_PWP_P_A_Star_Pattern_partB_LiteralInteger149);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partB_LiteralInteger149.setName("LiteralInteger149");
		AssemblyConnectors_PWP_P_A_Star_Pattern_partB_LiteralInteger149.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partB_LiteralInteger149.setValue(2);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value::LiteralInteger154
		addToElementRepository("LiteralInteger154", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger154);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger154.setName("LiteralInteger154");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger154.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger154.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174::LiteralInteger176
		addToElementRepository("LiteralInteger176", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174_LiteralInteger176);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174_LiteralInteger176.setName("LiteralInteger176");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174_LiteralInteger176.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174_LiteralInteger176.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralInteger51
		addToElementRepository("LiteralInteger51", AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger51);
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger51.setName("LiteralInteger51");
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger51.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger51.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus::LiteralInteger125
		addToElementRepository("LiteralInteger125", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger125);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger125.setName("LiteralInteger125");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger125.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger125.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralInteger107
		addToElementRepository("LiteralInteger107", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger107);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger107.setName("LiteralInteger107");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger107.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger107.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralInteger84
		addToElementRepository("LiteralInteger84", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger84);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger84.setName("LiteralInteger84");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger84.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger84.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern_node::LiteralInteger128
		addToElementRepository("LiteralInteger128", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger128);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger128.setName("LiteralInteger128");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger128.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger128.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68::LiteralInteger69
		addToElementRepository("LiteralInteger69", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68_LiteralInteger69);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68_LiteralInteger69.setName("LiteralInteger69");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68_LiteralInteger69.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68_LiteralInteger69.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger54
		addToElementRepository("LiteralInteger54", AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger54);
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger54.setName("LiteralInteger54");
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger54.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger54.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create A_Array_Pattern_result::LiteralInteger72
		addToElementRepository("LiteralInteger72", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger72);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger72.setName("LiteralInteger72");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger72.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger72.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger46
		addToElementRepository("LiteralInteger46", AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger46);
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger46.setName("LiteralInteger46");
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger46.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger46.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Empty_Pattern_partC::LiteralInteger23
		addToElementRepository("LiteralInteger23", AssemblyConnectors_PWP_P_A_Empty_Pattern_partC_LiteralInteger23);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partC_LiteralInteger23.setName("LiteralInteger23");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partC_LiteralInteger23.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partC_LiteralInteger23.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19_connectorEnd_2_Lower);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19_connectorEnd_2_Lower.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141::LiteralInteger143
		addToElementRepository("LiteralInteger143", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141_LiteralInteger143);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141_LiteralInteger143.setName("LiteralInteger143");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141_LiteralInteger143.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141_LiteralInteger143.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralInteger52
		addToElementRepository("LiteralInteger52", AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger52);
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger52.setName("LiteralInteger52");
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger52.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger52.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralInteger42
		addToElementRepository("LiteralInteger42", AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger42);
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger42.setName("LiteralInteger42");
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger42.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger42.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus::LiteralInteger7
		addToElementRepository("LiteralInteger7", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger7);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger7.setName("LiteralInteger7");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger7.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger7.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value::LiteralInteger123
		addToElementRepository("LiteralInteger123", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger123);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger123.setName("LiteralInteger123");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger123.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger123.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151_connectorEnd_2_Lower);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151_connectorEnd_2_Lower.setValue(5);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralInteger136
		addToElementRepository("LiteralInteger136", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger136);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger136.setName("LiteralInteger136");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger136.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger136.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value::LiteralInteger139
		addToElementRepository("LiteralInteger139", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger139);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger139.setName("LiteralInteger139");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger139.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger139.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result::LiteralInteger119
		addToElementRepository("LiteralInteger119", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result_LiteralInteger119);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result_LiteralInteger119.setName("LiteralInteger119");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result_LiteralInteger119.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result_LiteralInteger119.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger47
		addToElementRepository("LiteralInteger47", AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger47);
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger47.setName("LiteralInteger47");
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger47.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger47.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25_connectorEnd_1_Lower);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25_connectorEnd_1_Lower.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger30
		addToElementRepository("LiteralInteger30", AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger30);
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger30.setName("LiteralInteger30");
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger30.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger30.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102::LiteralInteger103
		addToElementRepository("LiteralInteger103", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102_LiteralInteger103);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102_LiteralInteger103.setName("LiteralInteger103");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102_LiteralInteger103.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102_LiteralInteger103.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_target::LiteralInteger170
		addToElementRepository("LiteralInteger170", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger170);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger170.setName("LiteralInteger170");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger170.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger170.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value::LiteralInteger140
		addToElementRepository("LiteralInteger140", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger140);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger140.setName("LiteralInteger140");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger140.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger140.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value::LiteralInteger3
		addToElementRepository("LiteralInteger3", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger3);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger3.setName("LiteralInteger3");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger3.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger3.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177::LiteralInteger178
		addToElementRepository("LiteralInteger178", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177_LiteralInteger178);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177_LiteralInteger178.setName("LiteralInteger178");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177_LiteralInteger178.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177_LiteralInteger178.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Empty_Pattern_partB::LiteralInteger21
		addToElementRepository("LiteralInteger21", AssemblyConnectors_PWP_P_A_Empty_Pattern_partB_LiteralInteger21);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partB_LiteralInteger21.setName("LiteralInteger21");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partB_LiteralInteger21.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partB_LiteralInteger21.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_P_main_ObjectFlow48::LiteralInteger49
		addToElementRepository("LiteralInteger49", AssemblyConnectors_PWP_P_main_ObjectFlow48_LiteralInteger49);
		AssemblyConnectors_PWP_P_main_ObjectFlow48_LiteralInteger49.setName("LiteralInteger49");
		AssemblyConnectors_PWP_P_main_ObjectFlow48_LiteralInteger49.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_ObjectFlow48_LiteralInteger49.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus::LiteralInteger8
		addToElementRepository("LiteralInteger8", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger8);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger8.setName("LiteralInteger8");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger8.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger8.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_P_main_ObjectFlow58::LiteralInteger59
		addToElementRepository("LiteralInteger59", AssemblyConnectors_PWP_P_main_ObjectFlow58_LiteralInteger59);
		AssemblyConnectors_PWP_P_main_ObjectFlow58_LiteralInteger59.setName("LiteralInteger59");
		AssemblyConnectors_PWP_P_main_ObjectFlow58_LiteralInteger59.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_ObjectFlow58_LiteralInteger59.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern_result::LiteralInteger111
		addToElementRepository("LiteralInteger111", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger111);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger111.setName("LiteralInteger111");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger111.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger111.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralInteger108
		addToElementRepository("LiteralInteger108", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger108);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger108.setName("LiteralInteger108");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger108.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger108.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Star_Pattern_partC::LiteralInteger145
		addToElementRepository("LiteralInteger145", AssemblyConnectors_PWP_P_A_Star_Pattern_partC_LiteralInteger145);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partC_LiteralInteger145.setName("LiteralInteger145");
		AssemblyConnectors_PWP_P_A_Star_Pattern_partC_LiteralInteger145.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partC_LiteralInteger145.setValue(5);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value::LiteralInteger153
		addToElementRepository("LiteralInteger153", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger153);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger153.setName("LiteralInteger153");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger153.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger153.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create A_Star_Pattern_result::LiteralInteger93
		addToElementRepository("LiteralInteger93", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger93);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger93.setName("LiteralInteger93");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger93.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger93.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99_connectorEnd_2_Lower);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99_connectorEnd_2_Lower.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result::LiteralInteger11
		addToElementRepository("LiteralInteger11", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result_LiteralInteger11);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result_LiteralInteger11.setName("LiteralInteger11");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result_LiteralInteger11.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result_LiteralInteger11.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_ObjectFlow61::LiteralInteger62
		addToElementRepository("LiteralInteger62", AssemblyConnectors_PWP_P_main_ObjectFlow61_LiteralInteger62);
		AssemblyConnectors_PWP_P_main_ObjectFlow61_LiteralInteger62.setName("LiteralInteger62");
		AssemblyConnectors_PWP_P_main_ObjectFlow61_LiteralInteger62.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_ObjectFlow61_LiteralInteger62.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158::LiteralInteger160
		addToElementRepository("LiteralInteger160", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158_LiteralInteger160);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158_LiteralInteger160.setName("LiteralInteger160");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158_LiteralInteger160.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158_LiteralInteger160.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralInteger86
		addToElementRepository("LiteralInteger86", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger86);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger86.setName("LiteralInteger86");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger86.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger86.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value::LiteralInteger5
		addToElementRepository("LiteralInteger5", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger5);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger5.setName("LiteralInteger5");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger5.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger5.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralInteger75
		addToElementRepository("LiteralInteger75", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger75);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger75.setName("LiteralInteger75");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger75.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger75.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_B_p::LiteralInteger165
		addToElementRepository("LiteralInteger165", AssemblyConnectors_PWP_P_B_p_LiteralInteger165);
		AssemblyConnectors_PWP_P_B_p_LiteralInteger165.setName("LiteralInteger165");
		AssemblyConnectors_PWP_P_B_p_LiteralInteger165.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_B_p_LiteralInteger165.setValue(2);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern_node::LiteralInteger161
		addToElementRepository("LiteralInteger161", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger161);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger161.setName("LiteralInteger161");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger161.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger161.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern()_target::LiteralInteger76
		addToElementRepository("LiteralInteger76", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger76);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger76.setName("LiteralInteger76");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger76.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger76.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralInteger171
		addToElementRepository("LiteralInteger171", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger171);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger171.setName("LiteralInteger171");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger171.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger171.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_ObjectFlow35::LiteralInteger36
		addToElementRepository("LiteralInteger36", AssemblyConnectors_PWP_P_main_ObjectFlow35_LiteralInteger36);
		AssemblyConnectors_PWP_P_main_ObjectFlow35_LiteralInteger36.setName("LiteralInteger36");
		AssemblyConnectors_PWP_P_main_ObjectFlow35_LiteralInteger36.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_ObjectFlow35_LiteralInteger36.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_target::LiteralInteger106
		addToElementRepository("LiteralInteger106", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger106);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger106.setName("LiteralInteger106");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger106.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger106.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralInteger135
		addToElementRepository("LiteralInteger135", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger135);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger135.setName("LiteralInteger135");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger135.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger135.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Array_Pattern_partC::LiteralInteger96
		addToElementRepository("LiteralInteger96", AssemblyConnectors_PWP_P_A_Array_Pattern_partC_LiteralInteger96);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partC_LiteralInteger96.setName("LiteralInteger96");
		AssemblyConnectors_PWP_P_A_Array_Pattern_partC_LiteralInteger96.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partC_LiteralInteger96.setValue(4);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26_connectorEnd_2_Lower);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26_connectorEnd_2_Lower.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralInteger41
		addToElementRepository("LiteralInteger41", AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger41);
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger41.setName("LiteralInteger41");
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger41.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger41.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger56
		addToElementRepository("LiteralInteger56", AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger56);
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger56.setName("LiteralInteger56");
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger56.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger56.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_R_x::LiteralInteger115
		addToElementRepository("LiteralInteger115", AssemblyConnectors_PWP_P_R_x_LiteralInteger115);
		AssemblyConnectors_PWP_P_R_x_LiteralInteger115.setName("LiteralInteger115");
		AssemblyConnectors_PWP_P_R_x_LiteralInteger115.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_R_x_LiteralInteger115.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87::LiteralInteger88
		addToElementRepository("LiteralInteger88", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87_LiteralInteger88);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87_LiteralInteger88.setName("LiteralInteger88");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87_LiteralInteger88.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87_LiteralInteger88.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus::LiteralInteger126
		addToElementRepository("LiteralInteger126", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger126);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger126.setName("LiteralInteger126");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger126.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger126.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18_connectorEnd_1_Lower);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18_connectorEnd_1_Lower.setValue(0);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralInteger155
		addToElementRepository("LiteralInteger155", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger155);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger155.setName("LiteralInteger155");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger155.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger155.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90::LiteralInteger92
		addToElementRepository("LiteralInteger92", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90_LiteralInteger92);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90_LiteralInteger92.setName("LiteralInteger92");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90_LiteralInteger92.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90_LiteralInteger92.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger33
		addToElementRepository("LiteralInteger33", AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger33);
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger33.setName("LiteralInteger33");
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger33.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger33.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node::LiteralInteger144
		addToElementRepository("LiteralInteger144", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger144);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger144.setName("LiteralInteger144");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger144.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger144.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node::LiteralInteger81
		addToElementRepository("LiteralInteger81", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger81);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger81.setName("LiteralInteger81");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger81.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger81.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB::LiteralInteger15
		addToElementRepository("LiteralInteger15", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB_LiteralInteger15);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB_LiteralInteger15.setName("LiteralInteger15");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB_LiteralInteger15.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB_LiteralInteger15.setValue(2);
		// LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger34
		addToElementRepository("LiteralInteger34", AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger34);
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger34.setName("LiteralInteger34");
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger34.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger34.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralInteger74
		addToElementRepository("LiteralInteger74", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger74);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger74.setName("LiteralInteger74");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger74.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger74.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralInteger44
		addToElementRepository("LiteralInteger44", AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger44);
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger44.setName("LiteralInteger44");
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger44.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger44.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralInteger173
		addToElementRepository("LiteralInteger173", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger173);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger173.setName("LiteralInteger173");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger173.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger173.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112::LiteralInteger114
		addToElementRepository("LiteralInteger114", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112_LiteralInteger114);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112_LiteralInteger114.setName("LiteralInteger114");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112_LiteralInteger114.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112_LiteralInteger114.setValue(1);
		// LiteralInteger AssemblyConnectors_PWP_P_R_y::LiteralInteger118
		addToElementRepository("LiteralInteger118", AssemblyConnectors_PWP_P_R_y_LiteralInteger118);
		AssemblyConnectors_PWP_P_R_y_LiteralInteger118.setName("LiteralInteger118");
		AssemblyConnectors_PWP_P_R_y_LiteralInteger118.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_R_y_LiteralInteger118.setValue(0);
	}

	private void initializeLiteralString_Instances()
	{
		// LiteralString AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message::LiteralString134
		addToElementRepository("LiteralString134", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_LiteralString134);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_LiteralString134.setName("LiteralString134");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_LiteralString134.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_LiteralString134.setValue("Assertion currently not implemented for A_Unconnected_Pattern.");
		// LiteralString AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message::LiteralString164
		addToElementRepository("LiteralString164", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_LiteralString164);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_LiteralString164.setName("LiteralString164");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_LiteralString164.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_LiteralString164.setValue("Assertion currently not implemented for A_Empty_Pattern.");
		// LiteralString AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message::LiteralString10
		addToElementRepository("LiteralString10", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_LiteralString10);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_LiteralString10.setName("LiteralString10");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_LiteralString10.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_LiteralString10.setValue("Assertion currently not implemented for A_Star_Pattern.");
		// LiteralString AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message::LiteralString121
		addToElementRepository("LiteralString121", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_LiteralString121);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_LiteralString121.setName("LiteralString121");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_LiteralString121.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_LiteralString121.setValue("Assertion currently not implemented for A_Array_Pattern.");
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralUnlimitedNatural39
		addToElementRepository("LiteralUnlimitedNatural39", AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural39);
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural39.setName("LiteralUnlimitedNatural39");
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural39.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural39.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98_connectorEnd_1_Upper);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd98_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralUnlimitedNatural55
		addToElementRepository("LiteralUnlimitedNatural55", AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural55);
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural55.setName("LiteralUnlimitedNatural55");
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural55.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural55.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern()_target::LiteralUnlimitedNatural77
		addToElementRepository("LiteralUnlimitedNatural77", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural77);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural77.setName("LiteralUnlimitedNatural77");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural77.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural77.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create A_Empty_Pattern_result::LiteralUnlimitedNatural168
		addToElementRepository("LiteralUnlimitedNatural168", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural168);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural168.setName("LiteralUnlimitedNatural168");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural168.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural168.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural137
		addToElementRepository("LiteralUnlimitedNatural137", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural137);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural137.setName("LiteralUnlimitedNatural137");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural137.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural137.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralUnlimitedNatural43
		addToElementRepository("LiteralUnlimitedNatural43", AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural43);
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural43.setName("LiteralUnlimitedNatural43");
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural43.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural43.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26_connectorEnd_2_Upper);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd26_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value::LiteralUnlimitedNatural152
		addToElementRepository("LiteralUnlimitedNatural152", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural152);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural152.setName("LiteralUnlimitedNatural152");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural152.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural152.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_R_x::LiteralUnlimitedNatural116
		addToElementRepository("LiteralUnlimitedNatural116", AssemblyConnectors_PWP_P_R_x_LiteralUnlimitedNatural116);
		AssemblyConnectors_PWP_P_R_x_LiteralUnlimitedNatural116.setName("LiteralUnlimitedNatural116");
		AssemblyConnectors_PWP_P_R_x_LiteralUnlimitedNatural116.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_R_x_LiteralUnlimitedNatural116.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151_connectorEnd_2_Upper);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd151_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern()_target::LiteralUnlimitedNatural83
		addToElementRepository("LiteralUnlimitedNatural83", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural83);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural83.setName("LiteralUnlimitedNatural83");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural83.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural83.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value::LiteralUnlimitedNatural122
		addToElementRepository("LiteralUnlimitedNatural122", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural122);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural122.setName("LiteralUnlimitedNatural122");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural122.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural122.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value::LiteralUnlimitedNatural138
		addToElementRepository("LiteralUnlimitedNatural138", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural138);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural138.setName("LiteralUnlimitedNatural138");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural138.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural138.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural157
		addToElementRepository("LiteralUnlimitedNatural157", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural157);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural157.setName("LiteralUnlimitedNatural157");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural157.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural157.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19_connectorEnd_2_Upper);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd19_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB::LiteralUnlimitedNatural14
		addToElementRepository("LiteralUnlimitedNatural14", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural14);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural14.setName("LiteralUnlimitedNatural14");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural14.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural14.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralUnlimitedNatural73
		addToElementRepository("LiteralUnlimitedNatural73", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural73);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural73.setName("LiteralUnlimitedNatural73");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural73.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural73.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern_result::LiteralUnlimitedNatural110
		addToElementRepository("LiteralUnlimitedNatural110", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural110);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural110.setName("LiteralUnlimitedNatural110");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural110.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural110.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Empty_Pattern_partB::LiteralUnlimitedNatural20
		addToElementRepository("LiteralUnlimitedNatural20", AssemblyConnectors_PWP_P_A_Empty_Pattern_partB_LiteralUnlimitedNatural20);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partB_LiteralUnlimitedNatural20.setName("LiteralUnlimitedNatural20");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partB_LiteralUnlimitedNatural20.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partB_LiteralUnlimitedNatural20.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralUnlimitedNatural109
		addToElementRepository("LiteralUnlimitedNatural109", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural109);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural109.setName("LiteralUnlimitedNatural109");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural109.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural109.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralUnlimitedNatural32
		addToElementRepository("LiteralUnlimitedNatural32", AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural32);
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural32.setName("LiteralUnlimitedNatural32");
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural32.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural32.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result::LiteralUnlimitedNatural133
		addToElementRepository("LiteralUnlimitedNatural133", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural133);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural133.setName("LiteralUnlimitedNatural133");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural133.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural133.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18_connectorEnd_1_Upper);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_r_ConnectorEnd18_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralUnlimitedNatural85
		addToElementRepository("LiteralUnlimitedNatural85", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural85);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural85.setName("LiteralUnlimitedNatural85");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural85.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural85.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Star_Pattern_partC::LiteralUnlimitedNatural146
		addToElementRepository("LiteralUnlimitedNatural146", AssemblyConnectors_PWP_P_A_Star_Pattern_partC_LiteralUnlimitedNatural146);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partC_LiteralUnlimitedNatural146.setName("LiteralUnlimitedNatural146");
		AssemblyConnectors_PWP_P_A_Star_Pattern_partC_LiteralUnlimitedNatural146.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partC_LiteralUnlimitedNatural146.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural127
		addToElementRepository("LiteralUnlimitedNatural127", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural127);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural127.setName("LiteralUnlimitedNatural127");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural127.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural127.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result::LiteralUnlimitedNatural12
		addToElementRepository("LiteralUnlimitedNatural12", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural12);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural12.setName("LiteralUnlimitedNatural12");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural12.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural12.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_target::LiteralUnlimitedNatural169
		addToElementRepository("LiteralUnlimitedNatural169", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural169);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural169.setName("LiteralUnlimitedNatural169");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural169.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural169.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_R_y::LiteralUnlimitedNatural117
		addToElementRepository("LiteralUnlimitedNatural117", AssemblyConnectors_PWP_P_R_y_LiteralUnlimitedNatural117);
		AssemblyConnectors_PWP_P_R_y_LiteralUnlimitedNatural117.setName("LiteralUnlimitedNatural117");
		AssemblyConnectors_PWP_P_R_y_LiteralUnlimitedNatural117.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_R_y_LiteralUnlimitedNatural117.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150_connectorEnd_1_Upper);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Star_Pattern_r_ConnectorEnd150_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25_connectorEnd_1_Upper);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_r_ConnectorEnd25_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC::LiteralUnlimitedNatural17
		addToElementRepository("LiteralUnlimitedNatural17", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural17);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural17.setName("LiteralUnlimitedNatural17");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural17.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural17.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result::LiteralUnlimitedNatural162
		addToElementRepository("LiteralUnlimitedNatural162", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural162);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural162.setName("LiteralUnlimitedNatural162");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural162.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural162.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Star_Pattern_partB::LiteralUnlimitedNatural148
		addToElementRepository("LiteralUnlimitedNatural148", AssemblyConnectors_PWP_P_A_Star_Pattern_partB_LiteralUnlimitedNatural148);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partB_LiteralUnlimitedNatural148.setName("LiteralUnlimitedNatural148");
		AssemblyConnectors_PWP_P_A_Star_Pattern_partB_LiteralUnlimitedNatural148.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partB_LiteralUnlimitedNatural148.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create A_Array_Pattern_result::LiteralUnlimitedNatural71
		addToElementRepository("LiteralUnlimitedNatural71", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural71);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural71.setName("LiteralUnlimitedNatural71");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural71.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural71.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralUnlimitedNatural45
		addToElementRepository("LiteralUnlimitedNatural45", AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural45);
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural45.setName("LiteralUnlimitedNatural45");
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural45.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural45.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99_connectorEnd_2_Upper);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Array_Pattern_r_ConnectorEnd99_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Array_Pattern_partB::LiteralUnlimitedNatural100
		addToElementRepository("LiteralUnlimitedNatural100", AssemblyConnectors_PWP_P_A_Array_Pattern_partB_LiteralUnlimitedNatural100);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partB_LiteralUnlimitedNatural100.setName("LiteralUnlimitedNatural100");
		AssemblyConnectors_PWP_P_A_Array_Pattern_partB_LiteralUnlimitedNatural100.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partB_LiteralUnlimitedNatural100.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_target::LiteralUnlimitedNatural105
		addToElementRepository("LiteralUnlimitedNatural105", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural105);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural105.setName("LiteralUnlimitedNatural105");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural105.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural105.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Empty_Pattern_partC::LiteralUnlimitedNatural22
		addToElementRepository("LiteralUnlimitedNatural22", AssemblyConnectors_PWP_P_A_Empty_Pattern_partC_LiteralUnlimitedNatural22);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partC_LiteralUnlimitedNatural22.setName("LiteralUnlimitedNatural22");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partC_LiteralUnlimitedNatural22.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partC_LiteralUnlimitedNatural22.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralUnlimitedNatural172
		addToElementRepository("LiteralUnlimitedNatural172", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural172);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural172.setName("LiteralUnlimitedNatural172");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural172.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural172.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result::LiteralUnlimitedNatural120
		addToElementRepository("LiteralUnlimitedNatural120", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural120);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural120.setName("LiteralUnlimitedNatural120");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural120.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural120.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create A_Star_Pattern_result::LiteralUnlimitedNatural94
		addToElementRepository("LiteralUnlimitedNatural94", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural94);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural94.setName("LiteralUnlimitedNatural94");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural94.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural94.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralUnlimitedNatural66
		addToElementRepository("LiteralUnlimitedNatural66", AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural66);
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural66.setName("LiteralUnlimitedNatural66");
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural66.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural66.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralUnlimitedNatural53
		addToElementRepository("LiteralUnlimitedNatural53", AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural53);
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural53.setName("LiteralUnlimitedNatural53");
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural53.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural53.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural6
		addToElementRepository("LiteralUnlimitedNatural6", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural6);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural6.setName("LiteralUnlimitedNatural6");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural6.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural6.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralUnlimitedNatural28
		addToElementRepository("LiteralUnlimitedNatural28", AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural28);
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural28.setName("LiteralUnlimitedNatural28");
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural28.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural28.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_B_p::LiteralUnlimitedNatural166
		addToElementRepository("LiteralUnlimitedNatural166", AssemblyConnectors_PWP_P_B_p_LiteralUnlimitedNatural166);
		AssemblyConnectors_PWP_P_B_p_LiteralUnlimitedNatural166.setName("LiteralUnlimitedNatural166");
		AssemblyConnectors_PWP_P_B_p_LiteralUnlimitedNatural166.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_B_p_LiteralUnlimitedNatural166.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_A_Array_Pattern_partC::LiteralUnlimitedNatural97
		addToElementRepository("LiteralUnlimitedNatural97", AssemblyConnectors_PWP_P_A_Array_Pattern_partC_LiteralUnlimitedNatural97);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partC_LiteralUnlimitedNatural97.setName("LiteralUnlimitedNatural97");
		AssemblyConnectors_PWP_P_A_Array_Pattern_partC_LiteralUnlimitedNatural97.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partC_LiteralUnlimitedNatural97.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value::LiteralUnlimitedNatural4
		addToElementRepository("LiteralUnlimitedNatural4", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural4);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural4.setName("LiteralUnlimitedNatural4");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural4.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural4.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern::ObjectFlow174
		addToElementRepository("ObjectFlow174", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174.setName("ObjectFlow174");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174.setSource(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174.setTarget(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174.setGuard(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow174_LiteralBoolean175);
		// ObjectFlow AssemblyConnectors_PWP_P_assert_A_Empty_Pattern::ObjectFlow158
		addToElementRepository("ObjectFlow158", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158.setName("ObjectFlow158");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158.setSource(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158.setTarget(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_value);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158.setGuard(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_ObjectFlow158_LiteralBoolean159);
		// ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern::ObjectFlow87
		addToElementRepository("ObjectFlow87", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87.setName("ObjectFlow87");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87.setSource(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87.setTarget(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87.setGuard(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow87_LiteralBoolean89);
		// ObjectFlow AssemblyConnectors_PWP_P_main::ObjectFlow35
		addToElementRepository("ObjectFlow35", AssemblyConnectors_PWP_P_main_ObjectFlow35);
		AssemblyConnectors_PWP_P_main_ObjectFlow35.setName("ObjectFlow35");
		AssemblyConnectors_PWP_P_main_ObjectFlow35.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_main_ObjectFlow35.setSource(AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_P_main_ObjectFlow35.setTarget(AssemblyConnectors_PWP_P_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_P_main_ObjectFlow35.setGuard(AssemblyConnectors_PWP_P_main_ObjectFlow35_LiteralBoolean37);
		// ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern::ObjectFlow102
		addToElementRepository("ObjectFlow102", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102.setName("ObjectFlow102");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102.setSource(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102.setTarget(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102.setGuard(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow102_LiteralBoolean104);
		// ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern::ObjectFlow78
		addToElementRepository("ObjectFlow78", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78.setName("ObjectFlow78");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78.setSource(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78.setTarget(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78.setGuard(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow78_LiteralBoolean80);
		// ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern::ObjectFlow112
		addToElementRepository("ObjectFlow112", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112.setName("ObjectFlow112");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112.setSource(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112.setTarget(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112.setGuard(AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_ObjectFlow112_LiteralBoolean113);
		// ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern::ObjectFlow68
		addToElementRepository("ObjectFlow68", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68.setName("ObjectFlow68");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68.setSource(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68.setTarget(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68.setGuard(AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_ObjectFlow68_LiteralBoolean70);
		// ObjectFlow AssemblyConnectors_PWP_P_assert_A_Star_Pattern::ObjectFlow0
		addToElementRepository("ObjectFlow0", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0.setName("ObjectFlow0");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0.setSource(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0.setTarget(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_value);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0.setGuard(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_ObjectFlow0_LiteralBoolean2);
		// ObjectFlow AssemblyConnectors_PWP_P_main::ObjectFlow48
		addToElementRepository("ObjectFlow48", AssemblyConnectors_PWP_P_main_ObjectFlow48);
		AssemblyConnectors_PWP_P_main_ObjectFlow48.setName("ObjectFlow48");
		AssemblyConnectors_PWP_P_main_ObjectFlow48.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_main_ObjectFlow48.setSource(AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_P_main_ObjectFlow48.setTarget(AssemblyConnectors_PWP_P_main_assert_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_P_main_ObjectFlow48.setGuard(AssemblyConnectors_PWP_P_main_ObjectFlow48_LiteralBoolean50);
		// ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern::ObjectFlow90
		addToElementRepository("ObjectFlow90", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90.setName("ObjectFlow90");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90.setSource(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90.setTarget(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90.setGuard(AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_ObjectFlow90_LiteralBoolean91);
		// ObjectFlow AssemblyConnectors_PWP_P_main::ObjectFlow58
		addToElementRepository("ObjectFlow58", AssemblyConnectors_PWP_P_main_ObjectFlow58);
		AssemblyConnectors_PWP_P_main_ObjectFlow58.setName("ObjectFlow58");
		AssemblyConnectors_PWP_P_main_ObjectFlow58.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_main_ObjectFlow58.setSource(AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_P_main_ObjectFlow58.setTarget(AssemblyConnectors_PWP_P_main_assert_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_P_main_ObjectFlow58.setGuard(AssemblyConnectors_PWP_P_main_ObjectFlow58_LiteralBoolean60);
		// ObjectFlow AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern::ObjectFlow141
		addToElementRepository("ObjectFlow141", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141.setName("ObjectFlow141");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141.setSource(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141.setTarget(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_value);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141.setGuard(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_ObjectFlow141_LiteralBoolean142);
		// ObjectFlow AssemblyConnectors_PWP_P_assert_A_Array_Pattern::ObjectFlow129
		addToElementRepository("ObjectFlow129", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129.setName("ObjectFlow129");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129.setSource(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129.setTarget(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_value);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129.setGuard(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_ObjectFlow129_LiteralBoolean131);
		// ObjectFlow AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern::ObjectFlow177
		addToElementRepository("ObjectFlow177", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177.setName("ObjectFlow177");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177.setSource(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177.setTarget(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177.setGuard(AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_ObjectFlow177_LiteralBoolean179);
		// ObjectFlow AssemblyConnectors_PWP_P_main::ObjectFlow61
		addToElementRepository("ObjectFlow61", AssemblyConnectors_PWP_P_main_ObjectFlow61);
		AssemblyConnectors_PWP_P_main_ObjectFlow61.setName("ObjectFlow61");
		AssemblyConnectors_PWP_P_main_ObjectFlow61.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_main_ObjectFlow61.setSource(AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_main_ObjectFlow61.setTarget(AssemblyConnectors_PWP_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_main_ObjectFlow61.setGuard(AssemblyConnectors_PWP_P_main_ObjectFlow61_LiteralBoolean63);
	}

	private void initializeOperation_Instances()
	{
		// Operation AssemblyConnectors_PWP_P_A_Star_Pattern::A_Star_Pattern_A_Star_Pattern
		addToElementRepository("A_Star_Pattern_A_Star_Pattern", AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.setName("A_Star_Pattern");
		AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.addOwnedParameter(AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result);
		AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation AssemblyConnectors_PWP_P_A_Array_Pattern::A_Array_Pattern_A_Array_Pattern
		addToElementRepository("A_Array_Pattern_A_Array_Pattern", AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.setName("A_Array_Pattern");
		AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.addOwnedParameter(AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result);
		AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation AssemblyConnectors_PWP_P_A_Unconnected_Pattern::A_Unconnected_Pattern_A_Unconnected_Pattern
		addToElementRepository("A_Unconnected_Pattern_A_Unconnected_Pattern", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.setName("A_Unconnected_Pattern");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.addOwnedParameter(AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation AssemblyConnectors_PWP_P_A_Empty_Pattern::A_Empty_Pattern_A_Empty_Pattern
		addToElementRepository("A_Empty_Pattern_A_Empty_Pattern", AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.setName("A_Empty_Pattern");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.addOwnedParameter(AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result.setName("result");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setType(AssemblyConnectors_PWP_P_A_Empty_Pattern);
		// OutputPin AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create A_Star_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setName("result");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setType(AssemblyConnectors_PWP_P_A_Star_Pattern);
		// OutputPin AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(AssemblyConnectors_PWP_P_A_Unconnected_Pattern);
		// OutputPin AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus.setName("errorStatus");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern()::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result.setName("result");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_A_Star_Pattern__result.setType(AssemblyConnectors_PWP_P_A_Star_Pattern);
		// OutputPin AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create A_Empty_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setName("result");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setType(AssemblyConnectors_PWP_P_A_Empty_Pattern);
		// OutputPin AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus.setName("errorStatus");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus.setName("errorStatus");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create A_Array_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setName("result");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setType(AssemblyConnectors_PWP_P_A_Array_Pattern);
		// OutputPin AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setName("result");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setType(AssemblyConnectors_PWP_P_A_Unconnected_Pattern);
		// OutputPin AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Array_Pattern_a_Array_Pattern.setType(AssemblyConnectors_PWP_P_A_Array_Pattern);
		// OutputPin AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_main_instantiate_A_Star_Pattern_a_Star_Pattern.setType(AssemblyConnectors_PWP_P_A_Star_Pattern);
		// OutputPin AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result.setName("result");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus.setName("errorStatus");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setName("result");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setType(AssemblyConnectors_PWP_P_A_Unconnected_Pattern);
		// OutputPin AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result.setName("result");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern()::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result.setName("result");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_A_Array_Pattern__result.setType(AssemblyConnectors_PWP_P_A_Array_Pattern);
		// OutputPin AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setName("result");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setType(AssemblyConnectors_PWP_P_A_Empty_Pattern);
		// OutputPin AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result.setName("result");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport AssemblyConnectors_PWP_P::PackageImport27
		addToElementRepository("PackageImport27", AssemblyConnectors_PWP_P_PackageImport27);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern.setType(AssemblyConnectors_PWP_P_A_Star_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Star_Pattern_a_Star_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result);
		AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setName("result");
		AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setType(AssemblyConnectors_PWP_P_A_Array_Pattern);
		AssemblyConnectors_PWP_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result);
		AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setName("result");
		AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setType(AssemblyConnectors_PWP_P_A_Star_Pattern);
		AssemblyConnectors_PWP_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setName("result");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setType(AssemblyConnectors_PWP_P_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(AssemblyConnectors_PWP_P_A_Unconnected_Pattern);
		// Parameter AssemblyConnectors_PWP_P_assert_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_a_Array_Pattern.setType(AssemblyConnectors_PWP_P_A_Array_Pattern);
		// Parameter AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(AssemblyConnectors_PWP_P_A_Unconnected_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern::result
		addToElementRepository("result", AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setName("result");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setType(AssemblyConnectors_PWP_P_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_P_assert_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_a_Star_Pattern.setType(AssemblyConnectors_PWP_P_A_Star_Pattern);
		// Parameter AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern.setType(AssemblyConnectors_PWP_P_A_Array_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Array_Pattern_a_Array_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern.setType(AssemblyConnectors_PWP_P_A_Empty_Pattern);
		AssemblyConnectors_PWP_P_instantiate_A_Empty_Pattern_a_Empty_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_PWP_P_assert_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_a_Empty_Pattern.setType(AssemblyConnectors_PWP_P_A_Empty_Pattern);
	}

	private void initializePort_Instances()
	{
		// Port AssemblyConnectors_PWP_P_B::p
		addToElementRepository("p", AssemblyConnectors_PWP_P_B_p);
		AssemblyConnectors_PWP_P_B_p.setName("p");
		AssemblyConnectors_PWP_P_B_p.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_B_p.setUpper(-1);
		AssemblyConnectors_PWP_P_B_p.setLower(2);
		AssemblyConnectors_PWP_P_B_p.setType(AssemblyConnectors_PWP_P_IImpl);
		AssemblyConnectors_PWP_P_B_p.setAggregation(AggregationKind.composite);
		AssemblyConnectors_PWP_P_B_p.isService = true;
		AssemblyConnectors_PWP_P_B_p.addProvided(AssemblyConnectors_PWP_P_I);
	}

	private void initializeProperty_Instances()
	{
		// Property AssemblyConnectors_PWP_P_A_Empty_Pattern::partC
		addToElementRepository("partC", AssemblyConnectors_PWP_P_A_Empty_Pattern_partC);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partC.setName("partC");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partC.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partC.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partC.setLower(0);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partC.setType(AssemblyConnectors_PWP_P_C);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_P_A_Empty_Pattern::partB
		addToElementRepository("partB", AssemblyConnectors_PWP_P_A_Empty_Pattern_partB);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partB.setName("partB");
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partB.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partB.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partB.setLower(0);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partB.setType(AssemblyConnectors_PWP_P_B);
		AssemblyConnectors_PWP_P_A_Empty_Pattern_partB.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_P_R::x
		addToElementRepository("x", AssemblyConnectors_PWP_P_R_x);
		AssemblyConnectors_PWP_P_R_x.setName("x");
		AssemblyConnectors_PWP_P_R_x.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_R_x.setUpper(-1);
		AssemblyConnectors_PWP_P_R_x.setLower(0);
		AssemblyConnectors_PWP_P_R_x.setType(AssemblyConnectors_PWP_P_IImpl);
		// Property AssemblyConnectors_PWP_P_R::y
		addToElementRepository("y", AssemblyConnectors_PWP_P_R_y);
		AssemblyConnectors_PWP_P_R_y.setName("y");
		AssemblyConnectors_PWP_P_R_y.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_R_y.setUpper(-1);
		AssemblyConnectors_PWP_P_R_y.setLower(0);
		AssemblyConnectors_PWP_P_R_y.setType(AssemblyConnectors_PWP_P_C);
		// Property AssemblyConnectors_PWP_P_A_Star_Pattern::partC
		addToElementRepository("partC", AssemblyConnectors_PWP_P_A_Star_Pattern_partC);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partC.setName("partC");
		AssemblyConnectors_PWP_P_A_Star_Pattern_partC.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partC.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partC.setLower(5);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partC.setType(AssemblyConnectors_PWP_P_C);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_P_A_Unconnected_Pattern::partB
		addToElementRepository("partB", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB.setName("partB");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB.setLower(2);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB.setType(AssemblyConnectors_PWP_P_B);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partB.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_P_A_Array_Pattern::partC
		addToElementRepository("partC", AssemblyConnectors_PWP_P_A_Array_Pattern_partC);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partC.setName("partC");
		AssemblyConnectors_PWP_P_A_Array_Pattern_partC.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partC.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partC.setLower(4);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partC.setType(AssemblyConnectors_PWP_P_C);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_P_A_Star_Pattern::partB
		addToElementRepository("partB", AssemblyConnectors_PWP_P_A_Star_Pattern_partB);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partB.setName("partB");
		AssemblyConnectors_PWP_P_A_Star_Pattern_partB.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partB.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partB.setLower(2);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partB.setType(AssemblyConnectors_PWP_P_B);
		AssemblyConnectors_PWP_P_A_Star_Pattern_partB.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_P_A_Unconnected_Pattern::partC
		addToElementRepository("partC", AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC.setName("partC");
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC.setLower(3);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC.setType(AssemblyConnectors_PWP_P_C);
		AssemblyConnectors_PWP_P_A_Unconnected_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_PWP_P_A_Array_Pattern::partB
		addToElementRepository("partB", AssemblyConnectors_PWP_P_A_Array_Pattern_partB);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partB.setName("partB");
		AssemblyConnectors_PWP_P_A_Array_Pattern_partB.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partB.setUpper(-1);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partB.setLower(2);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partB.setType(AssemblyConnectors_PWP_P_B);
		AssemblyConnectors_PWP_P_A_Array_Pattern_partB.setAggregation(AggregationKind.composite);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern::message
		addToElementRepository("message", AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message.setName("message");
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message.setValue(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_LiteralString134);
		AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message.setResult(AssemblyConnectors_PWP_P_assert_A_Unconnected_Pattern_message_result);
		// ValueSpecificationAction AssemblyConnectors_PWP_P_assert_A_Array_Pattern::message
		addToElementRepository("message", AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message.setName("message");
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message.setValue(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_LiteralString121);
		AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message.setResult(AssemblyConnectors_PWP_P_assert_A_Array_Pattern_message_result);
		// ValueSpecificationAction AssemblyConnectors_PWP_P_assert_A_Empty_Pattern::message
		addToElementRepository("message", AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message.setName("message");
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message.setValue(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_LiteralString164);
		AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message.setResult(AssemblyConnectors_PWP_P_assert_A_Empty_Pattern_message_result);
		// ValueSpecificationAction AssemblyConnectors_PWP_P_assert_A_Star_Pattern::message
		addToElementRepository("message", AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message.setName("message");
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message.setValue(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_LiteralString10);
		AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message.setResult(AssemblyConnectors_PWP_P_assert_A_Star_Pattern_message_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // AssemblyConnectors_PWP_PModel
