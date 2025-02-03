/*
 * AssemblyConnectors_P_PModel.java
 * 
 * Auto-generated file
 */
package AssemblyConnectors_P_P;

import uml.structuredclassifiers.ConnectorEnd;
import uml.values.LiteralBoolean;
import uml.structuredclassifiers.Connector;
import uml.values.LiteralUnlimitedNatural;
import uml.actions.OutputPin;
import uml.activities.Activity;
import uml.actions.CallOperationAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.values.LiteralString;
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


/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class AssemblyConnectors_P_PModel extends InMemoryModel
{
	private static AssemblyConnectors_P_PModel instance;

	/*
	 * Model AssemblyConnectors_P_P
	 */
	public Package AssemblyConnectors_P_P = new Package();
		public Association AssemblyConnectors_P_P_R = new Association();
			public Property AssemblyConnectors_P_P_R_y = new Property();
				public LiteralInteger AssemblyConnectors_P_P_R_y_LiteralInteger0 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_P_P_R_y_LiteralUnlimitedNatural1 = new LiteralUnlimitedNatural();
			public Property AssemblyConnectors_P_P_R_x = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_P_P_R_x_LiteralUnlimitedNatural2 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_P_P_R_x_LiteralInteger3 = new LiteralInteger();
		public Activity AssemblyConnectors_P_P_main = new Activity();
			public CallBehaviorAction AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern = new CallBehaviorAction();
				public InputPin AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural4 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger5 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger6 = new LiteralInteger();
			public CallBehaviorAction AssemblyConnectors_P_P_main_assert_A_Star_Pattern = new CallBehaviorAction();
				public InputPin AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern = new InputPin();
					public LiteralInteger AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger7 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural8 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger9 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_P_P_main_ObjectFlow10 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_P_P_main_ObjectFlow10_LiteralBoolean11 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_P_P_main_ObjectFlow10_LiteralInteger12 = new LiteralInteger();
			public ControlFlow AssemblyConnectors_P_P_main_ControlFlow13 = new ControlFlow();
			public CallBehaviorAction AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger14 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural15 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger16 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_P_P_main_ObjectFlow17 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_P_P_main_ObjectFlow17_LiteralBoolean18 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_P_P_main_ObjectFlow17_LiteralInteger19 = new LiteralInteger();
			public CallBehaviorAction AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger20 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural21 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger22 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_P_P_main_ObjectFlow23 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_P_P_main_ObjectFlow23_LiteralInteger24 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_P_P_main_ObjectFlow23_LiteralBoolean25 = new LiteralBoolean();
			public ControlFlow AssemblyConnectors_P_P_main_ControlFlow26 = new ControlFlow();
			public CallBehaviorAction AssemblyConnectors_P_P_main_assert_A_Array_Pattern = new CallBehaviorAction();
				public InputPin AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural27 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger28 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger29 = new LiteralInteger();
			public CallBehaviorAction AssemblyConnectors_P_P_main_assert_A_Empty_Pattern = new CallBehaviorAction();
				public InputPin AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern = new InputPin();
					public LiteralInteger AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger30 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural31 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger32 = new LiteralInteger();
			public CallBehaviorAction AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural33 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger34 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger35 = new LiteralInteger();
			public ControlFlow AssemblyConnectors_P_P_main_ControlFlow36 = new ControlFlow();
			public CallBehaviorAction AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger37 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural38 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger39 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_P_P_main_ObjectFlow40 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_P_P_main_ObjectFlow40_LiteralInteger41 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_P_P_main_ObjectFlow40_LiteralBoolean42 = new LiteralBoolean();
		public Class_ AssemblyConnectors_P_P_A_Unconnected_Pattern = new Class_();
			public Operation AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern = new Operation();
				public Parameter AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result = new Parameter();
			public Comment AssemblyConnectors_P_P_A_Unconnected_Pattern_Comment43 = new Comment();
			public Property AssemblyConnectors_P_P_A_Unconnected_Pattern_partB = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural44 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_P_P_A_Unconnected_Pattern_partB_LiteralInteger45 = new LiteralInteger();
			public Property AssemblyConnectors_P_P_A_Unconnected_Pattern_partC = new Property();
				public LiteralInteger AssemblyConnectors_P_P_A_Unconnected_Pattern_partC_LiteralInteger46 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural47 = new LiteralUnlimitedNatural();
			public Connector AssemblyConnectors_P_P_A_Unconnected_Pattern_r = new Connector();
				public ConnectorEnd AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48_connectorEnd_1_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
				public ConnectorEnd AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49 = new ConnectorEnd();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49_connectorEnd_2_Lower = new LiteralInteger();
		public Activity AssemblyConnectors_P_P_assert_A_Empty_Pattern = new Activity();
			public ObjectFlow AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50_LiteralBoolean51 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50_LiteralInteger52 = new LiteralInteger();
			public ValueSpecificationAction AssemblyConnectors_P_P_assert_A_Empty_Pattern_message = new ValueSpecificationAction();
				public OutputPin AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralInteger53 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural54 = new LiteralUnlimitedNatural();
				public LiteralString AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_LiteralString55 = new LiteralString();
			public CallBehaviorAction AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine = new CallBehaviorAction();
				public InputPin AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural56 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger57 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger58 = new LiteralInteger();
				public OutputPin AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger59 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger60 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural61 = new LiteralUnlimitedNatural();
			public Parameter AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern = new Parameter();
			public ActivityParameterNode AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger62 = new LiteralInteger();
		public Class_ AssemblyConnectors_P_P_A_Empty_Pattern = new Class_();
			public Property AssemblyConnectors_P_P_A_Empty_Pattern_partB = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Empty_Pattern_partB_LiteralUnlimitedNatural63 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_P_P_A_Empty_Pattern_partB_LiteralInteger64 = new LiteralInteger();
			public Property AssemblyConnectors_P_P_A_Empty_Pattern_partC = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Empty_Pattern_partC_LiteralUnlimitedNatural65 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_P_P_A_Empty_Pattern_partC_LiteralInteger66 = new LiteralInteger();
			public Operation AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern = new Operation();
				public Parameter AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result = new Parameter();
			public Comment AssemblyConnectors_P_P_A_Empty_Pattern_Comment67 = new Comment();
			public Connector AssemblyConnectors_P_P_A_Empty_Pattern_r = new Connector();
				public ConnectorEnd AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_1_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
				public ConnectorEnd AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69_connectorEnd_2_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
		public PackageImport AssemblyConnectors_P_P_PackageImport70 = new PackageImport();
		public Activity AssemblyConnectors_P_P_instantiate_A_Empty_Pattern = new Activity();
			public CallOperationAction AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_ = new CallOperationAction();
				public OutputPin AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger71 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger72 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural73 = new LiteralUnlimitedNatural();
				public InputPin AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target = new InputPin();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger74 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural75 = new LiteralUnlimitedNatural();
			public CreateObjectAction AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern = new CreateObjectAction();
				public OutputPin AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger76 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural77 = new LiteralUnlimitedNatural();
			public ObjectFlow AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralInteger79 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralBoolean80 = new LiteralBoolean();
			public ObjectFlow AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81_LiteralBoolean82 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81_LiteralInteger83 = new LiteralInteger();
			public ActivityParameterNode AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node = new ActivityParameterNode();
			public Parameter AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern = new Parameter();
		public Class_ AssemblyConnectors_P_P_C = new Class_();
		public Comment AssemblyConnectors_P_P_Comment84 = new Comment();
		public Class_ AssemblyConnectors_P_P_A_Array_Pattern = new Class_();
			public Operation AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern = new Operation();
				public Parameter AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result = new Parameter();
			public Comment AssemblyConnectors_P_P_A_Array_Pattern_Comment85 = new Comment();
			public Property AssemblyConnectors_P_P_A_Array_Pattern_partC = new Property();
				public LiteralInteger AssemblyConnectors_P_P_A_Array_Pattern_partC_LiteralInteger86 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Array_Pattern_partC_LiteralUnlimitedNatural87 = new LiteralUnlimitedNatural();
			public Connector AssemblyConnectors_P_P_A_Array_Pattern_r = new Connector();
				public ConnectorEnd AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88 = new ConnectorEnd();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_1_Lower = new LiteralInteger();
				public ConnectorEnd AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89_connectorEnd_2_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
			public Property AssemblyConnectors_P_P_A_Array_Pattern_partB = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Array_Pattern_partB_LiteralUnlimitedNatural90 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_P_P_A_Array_Pattern_partB_LiteralInteger91 = new LiteralInteger();
		public Activity AssemblyConnectors_P_P_assert_A_Star_Pattern = new Activity();
			public Parameter AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern = new Parameter();
			public CallBehaviorAction AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine = new CallBehaviorAction();
				public InputPin AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value = new InputPin();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger92 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger93 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural94 = new LiteralUnlimitedNatural();
				public OutputPin AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger95 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural96 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger97 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98_LiteralInteger99 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98_LiteralBoolean100 = new LiteralBoolean();
			public ActivityParameterNode AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger101 = new LiteralInteger();
			public ValueSpecificationAction AssemblyConnectors_P_P_assert_A_Star_Pattern_message = new ValueSpecificationAction();
				public LiteralString AssemblyConnectors_P_P_assert_A_Star_Pattern_message_LiteralString102 = new LiteralString();
				public OutputPin AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural103 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralInteger104 = new LiteralInteger();
		public Activity AssemblyConnectors_P_P_assert_A_Unconnected_Pattern = new Activity();
			public ValueSpecificationAction AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message = new ValueSpecificationAction();
				public OutputPin AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger105 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural106 = new LiteralUnlimitedNatural();
				public LiteralString AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_LiteralString107 = new LiteralString();
			public ObjectFlow AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108_LiteralInteger109 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108_LiteralBoolean110 = new LiteralBoolean();
			public CallBehaviorAction AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger111 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger112 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural113 = new LiteralUnlimitedNatural();
				public InputPin AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value = new InputPin();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger114 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural115 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger116 = new LiteralInteger();
			public Parameter AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern = new Parameter();
			public ActivityParameterNode AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger117 = new LiteralInteger();
		public Class_ AssemblyConnectors_P_P_A_Star_Pattern = new Class_();
			public Operation AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern = new Operation();
				public Parameter AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result = new Parameter();
			public Property AssemblyConnectors_P_P_A_Star_Pattern_partC = new Property();
				public LiteralInteger AssemblyConnectors_P_P_A_Star_Pattern_partC_LiteralInteger118 = new LiteralInteger();
				public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Star_Pattern_partC_LiteralUnlimitedNatural119 = new LiteralUnlimitedNatural();
			public Comment AssemblyConnectors_P_P_A_Star_Pattern_Comment120 = new Comment();
			public Property AssemblyConnectors_P_P_A_Star_Pattern_partB = new Property();
				public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Star_Pattern_partB_LiteralUnlimitedNatural121 = new LiteralUnlimitedNatural();
				public LiteralInteger AssemblyConnectors_P_P_A_Star_Pattern_partB_LiteralInteger122 = new LiteralInteger();
			public Connector AssemblyConnectors_P_P_A_Star_Pattern_r = new Connector();
				public ConnectorEnd AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123 = new ConnectorEnd();
					public LiteralInteger AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123_connectorEnd_1_Lower = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123_connectorEnd_1_Upper = new LiteralUnlimitedNatural();
				public ConnectorEnd AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124 = new ConnectorEnd();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124_connectorEnd_2_Upper = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124_connectorEnd_2_Lower = new LiteralInteger();
		public Activity AssemblyConnectors_P_P_assert_A_Array_Pattern = new Activity();
			public ActivityParameterNode AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger125 = new LiteralInteger();
			public CallBehaviorAction AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine = new CallBehaviorAction();
				public OutputPin AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger126 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural127 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger128 = new LiteralInteger();
				public InputPin AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value = new InputPin();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger129 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger130 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural131 = new LiteralUnlimitedNatural();
			public Parameter AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern = new Parameter();
			public ObjectFlow AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132_LiteralBoolean133 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132_LiteralInteger134 = new LiteralInteger();
			public ValueSpecificationAction AssemblyConnectors_P_P_assert_A_Array_Pattern_message = new ValueSpecificationAction();
				public OutputPin AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralInteger135 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural136 = new LiteralUnlimitedNatural();
				public LiteralString AssemblyConnectors_P_P_assert_A_Array_Pattern_message_LiteralString137 = new LiteralString();
		public Activity AssemblyConnectors_P_P_instantiate_A_Array_Pattern = new Activity();
			public ActivityParameterNode AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node = new ActivityParameterNode();
				public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger138 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139_LiteralBoolean140 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139_LiteralInteger141 = new LiteralInteger();
			public CallOperationAction AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_ = new CallOperationAction();
				public OutputPin AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger142 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger143 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural144 = new LiteralUnlimitedNatural();
				public InputPin AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural145 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger146 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147_LiteralInteger148 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147_LiteralBoolean149 = new LiteralBoolean();
			public CreateObjectAction AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern = new CreateObjectAction();
				public OutputPin AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural150 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger151 = new LiteralInteger();
			public Parameter AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern = new Parameter();
		public Activity AssemblyConnectors_P_P_instantiate_A_Star_Pattern = new Activity();
			public CallOperationAction AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_ = new CallOperationAction();
				public InputPin AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target = new InputPin();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger152 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural153 = new LiteralUnlimitedNatural();
				public OutputPin AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger154 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger155 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural156 = new LiteralUnlimitedNatural();
			public Parameter AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern = new Parameter();
			public ObjectFlow AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157_LiteralBoolean158 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157_LiteralInteger159 = new LiteralInteger();
			public ActivityParameterNode AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node = new ActivityParameterNode();
			public ObjectFlow AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160 = new ObjectFlow();
				public LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160_LiteralBoolean161 = new LiteralBoolean();
				public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160_LiteralInteger162 = new LiteralInteger();
			public CreateObjectAction AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern = new CreateObjectAction();
				public OutputPin AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger163 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural164 = new LiteralUnlimitedNatural();
		public Class_ AssemblyConnectors_P_P_B = new Class_();
		public Activity AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern = new Activity();
			public Parameter AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern = new Parameter();
			public ObjectFlow AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165_LiteralInteger166 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165_LiteralBoolean167 = new LiteralBoolean();
			public CreateObjectAction AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern = new CreateObjectAction();
				public OutputPin AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result = new OutputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural168 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger169 = new LiteralInteger();
			public ObjectFlow AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170 = new ObjectFlow();
				public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170_LiteralInteger171 = new LiteralInteger();
				public LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170_LiteralBoolean172 = new LiteralBoolean();
			public ActivityParameterNode AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node = new ActivityParameterNode();
			public CallOperationAction AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_ = new CallOperationAction();
				public OutputPin AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result = new OutputPin();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger173 = new LiteralInteger();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger174 = new LiteralInteger();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural175 = new LiteralUnlimitedNatural();
				public InputPin AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target = new InputPin();
					public LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural176 = new LiteralUnlimitedNatural();
					public LiteralInteger AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger177 = new LiteralInteger();

	public static AssemblyConnectors_P_PModel instance()
	{
		if (instance == null)
        {
            instance = new AssemblyConnectors_P_PModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public AssemblyConnectors_P_PModel()
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
		this.initializeValueSpecificationAction_Instances();
	}

	private void initializeActivity_Instances()
	{
		// Activity AssemblyConnectors_P_P::main
		addToElementRepository("main", AssemblyConnectors_P_P_main);
		AssemblyConnectors_P_P_main.setName("main");
		AssemblyConnectors_P_P_main.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main.addNode(AssemblyConnectors_P_P_main_assert_A_Array_Pattern);
		AssemblyConnectors_P_P_main.addNode(AssemblyConnectors_P_P_main_assert_A_Empty_Pattern);
		AssemblyConnectors_P_P_main.addNode(AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_main.addNode(AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern);
		AssemblyConnectors_P_P_main.addNode(AssemblyConnectors_P_P_main_assert_A_Star_Pattern);
		AssemblyConnectors_P_P_main.addNode(AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern);
		AssemblyConnectors_P_P_main.addNode(AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_main.addNode(AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern);
		AssemblyConnectors_P_P_main.addEdge(AssemblyConnectors_P_P_main_ObjectFlow23);
		AssemblyConnectors_P_P_main.addEdge(AssemblyConnectors_P_P_main_ControlFlow26);
		AssemblyConnectors_P_P_main.addEdge(AssemblyConnectors_P_P_main_ObjectFlow10);
		AssemblyConnectors_P_P_main.addEdge(AssemblyConnectors_P_P_main_ControlFlow13);
		AssemblyConnectors_P_P_main.addEdge(AssemblyConnectors_P_P_main_ObjectFlow17);
		AssemblyConnectors_P_P_main.addEdge(AssemblyConnectors_P_P_main_ControlFlow36);
		AssemblyConnectors_P_P_main.addEdge(AssemblyConnectors_P_P_main_ObjectFlow40);
		// Activity AssemblyConnectors_P_P::assert_A_Star_Pattern
		addToElementRepository("assert_A_Star_Pattern", AssemblyConnectors_P_P_assert_A_Star_Pattern);
		AssemblyConnectors_P_P_assert_A_Star_Pattern.setName("assert_A_Star_Pattern");
		AssemblyConnectors_P_P_assert_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Star_Pattern.addOwnedParameter(AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_P_P_assert_A_Star_Pattern.addNode(AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine);
		AssemblyConnectors_P_P_assert_A_Star_Pattern.addNode(AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_P_P_assert_A_Star_Pattern.addNode(AssemblyConnectors_P_P_assert_A_Star_Pattern_message);
		AssemblyConnectors_P_P_assert_A_Star_Pattern.addEdge(AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98);
		// Activity AssemblyConnectors_P_P::assert_A_Empty_Pattern
		addToElementRepository("assert_A_Empty_Pattern", AssemblyConnectors_P_P_assert_A_Empty_Pattern);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern.setName("assert_A_Empty_Pattern");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Empty_Pattern.addOwnedParameter(AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern.addNode(AssemblyConnectors_P_P_assert_A_Empty_Pattern_message);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern.addNode(AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern.addNode(AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern.addEdge(AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50);
		// Activity AssemblyConnectors_P_P::assert_A_Unconnected_Pattern
		addToElementRepository("assert_A_Unconnected_Pattern", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern.setName("assert_A_Unconnected_Pattern");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern.addOwnedParameter(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern.addNode(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern.addNode(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern.addNode(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern.addEdge(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108);
		// Activity AssemblyConnectors_P_P::instantiate_A_Empty_Pattern
		addToElementRepository("instantiate_A_Empty_Pattern", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern.setName("instantiate_A_Empty_Pattern");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern.addOwnedParameter(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern.addNode(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern.addNode(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern.addNode(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern.addEdge(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern.addEdge(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81);
		// Activity AssemblyConnectors_P_P::assert_A_Array_Pattern
		addToElementRepository("assert_A_Array_Pattern", AssemblyConnectors_P_P_assert_A_Array_Pattern);
		AssemblyConnectors_P_P_assert_A_Array_Pattern.setName("assert_A_Array_Pattern");
		AssemblyConnectors_P_P_assert_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Array_Pattern.addOwnedParameter(AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_P_P_assert_A_Array_Pattern.addNode(AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_P_P_assert_A_Array_Pattern.addNode(AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine);
		AssemblyConnectors_P_P_assert_A_Array_Pattern.addNode(AssemblyConnectors_P_P_assert_A_Array_Pattern_message);
		AssemblyConnectors_P_P_assert_A_Array_Pattern.addEdge(AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132);
		// Activity AssemblyConnectors_P_P::instantiate_A_Array_Pattern
		addToElementRepository("instantiate_A_Array_Pattern", AssemblyConnectors_P_P_instantiate_A_Array_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern.setName("instantiate_A_Array_Pattern");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern.addOwnedParameter(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern.addNode(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern.addNode(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern.addNode(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern.addEdge(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern.addEdge(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147);
		// Activity AssemblyConnectors_P_P::instantiate_A_Star_Pattern
		addToElementRepository("instantiate_A_Star_Pattern", AssemblyConnectors_P_P_instantiate_A_Star_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern.setName("instantiate_A_Star_Pattern");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern.addOwnedParameter(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern.addNode(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern.addNode(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern.addNode(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern.addEdge(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern.addEdge(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160);
		// Activity AssemblyConnectors_P_P::instantiate_A_Unconnected_Pattern
		addToElementRepository("instantiate_A_Unconnected_Pattern", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern.setName("instantiate_A_Unconnected_Pattern");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern.addOwnedParameter(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern.addNode(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern.addNode(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern.addNode(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern.addEdge(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern.addEdge(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170);
	}

	private void initializeActivityParameterNode_Instances()
	{
		// ActivityParameterNode AssemblyConnectors_P_P_instantiate_A_Array_Pattern::a_Array_Pattern_node
		addToElementRepository("a_Array_Pattern_node", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node.setName("a_Array_Pattern_node");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node.setParameter(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern);
		// ActivityParameterNode AssemblyConnectors_P_P_assert_A_Array_Pattern::a_Array_Pattern_node
		addToElementRepository("a_Array_Pattern_node", AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node.setName("a_Array_Pattern_node");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node.setParameter(AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern);
		// ActivityParameterNode AssemblyConnectors_P_P_instantiate_A_Star_Pattern::a_Star_Pattern_node
		addToElementRepository("a_Star_Pattern_node", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node.setName("a_Star_Pattern_node");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node.setParameter(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern);
		// ActivityParameterNode AssemblyConnectors_P_P_instantiate_A_Empty_Pattern::a_Empty_Pattern_node
		addToElementRepository("a_Empty_Pattern_node", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setName("a_Empty_Pattern_node");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node.setParameter(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		// ActivityParameterNode AssemblyConnectors_P_P_assert_A_Empty_Pattern::a_Empty_Pattern_node
		addToElementRepository("a_Empty_Pattern_node", AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node.setName("a_Empty_Pattern_node");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node.setParameter(AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern);
		// ActivityParameterNode AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern_node
		addToElementRepository("a_Unconnected_Pattern_node", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setName("a_Unconnected_Pattern_node");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setParameter(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// ActivityParameterNode AssemblyConnectors_P_P_assert_A_Star_Pattern::a_Star_Pattern_node
		addToElementRepository("a_Star_Pattern_node", AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node.setName("a_Star_Pattern_node");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node.setParameter(AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern);
		// ActivityParameterNode AssemblyConnectors_P_P_assert_A_Unconnected_Pattern::a_Unconnected_Pattern_node
		addToElementRepository("a_Unconnected_Pattern_node", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setName("a_Unconnected_Pattern_node");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node.setParameter(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
	}

	private void initializeAssociation_Instances()
	{
		// Association AssemblyConnectors_P_P::R
		addToElementRepository("R", AssemblyConnectors_P_P_R);
		AssemblyConnectors_P_P_R.setName("R");
		AssemblyConnectors_P_P_R.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_R.addOwnedEnd(AssemblyConnectors_P_P_R_x);
		AssemblyConnectors_P_P_R.addOwnedEnd(AssemblyConnectors_P_P_R_y);
	}

	private void initializeCallBehaviorAction_Instances()
	{
		// CallBehaviorAction AssemblyConnectors_P_P_main::assert_A_Array_Pattern
		addToElementRepository("assert_A_Array_Pattern", AssemblyConnectors_P_P_main_assert_A_Array_Pattern);
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern.setName("assert_A_Array_Pattern");
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern.setBehavior(AssemblyConnectors_P_P_assert_A_Array_Pattern);
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern.addArgument(AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern);
		// CallBehaviorAction AssemblyConnectors_P_P_main::assert_A_Empty_Pattern
		addToElementRepository("assert_A_Empty_Pattern", AssemblyConnectors_P_P_main_assert_A_Empty_Pattern);
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern.setName("assert_A_Empty_Pattern");
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern.setBehavior(AssemblyConnectors_P_P_assert_A_Empty_Pattern);
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern.addArgument(AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		// CallBehaviorAction AssemblyConnectors_P_P_assert_A_Array_Pattern::writeLine
		addToElementRepository("writeLine", AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine.setName("writeLine");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine.addResult(AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine.addArgument(AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value);
		// CallBehaviorAction AssemblyConnectors_P_P_main::assert_A_Unconnected_Pattern
		addToElementRepository("assert_A_Unconnected_Pattern", AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern.setName("assert_A_Unconnected_Pattern");
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern.setBehavior(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern.addArgument(AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		// CallBehaviorAction AssemblyConnectors_P_P_main::instantiate_A_Star_Pattern
		addToElementRepository("instantiate_A_Star_Pattern", AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern);
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern.setName("instantiate_A_Star_Pattern");
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern.addResult(AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern.setBehavior(AssemblyConnectors_P_P_instantiate_A_Star_Pattern);
		// CallBehaviorAction AssemblyConnectors_P_P_main::assert_A_Star_Pattern
		addToElementRepository("assert_A_Star_Pattern", AssemblyConnectors_P_P_main_assert_A_Star_Pattern);
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern.setName("assert_A_Star_Pattern");
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern.setBehavior(AssemblyConnectors_P_P_assert_A_Star_Pattern);
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern.addArgument(AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern);
		// CallBehaviorAction AssemblyConnectors_P_P_assert_A_Star_Pattern::writeLine
		addToElementRepository("writeLine", AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine.setName("writeLine");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine.addResult(AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine.addArgument(AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value);
		// CallBehaviorAction AssemblyConnectors_P_P_main::instantiate_A_Array_Pattern
		addToElementRepository("instantiate_A_Array_Pattern", AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern);
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern.setName("instantiate_A_Array_Pattern");
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern.addResult(AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern.setBehavior(AssemblyConnectors_P_P_instantiate_A_Array_Pattern);
		// CallBehaviorAction AssemblyConnectors_P_P_assert_A_Empty_Pattern::writeLine
		addToElementRepository("writeLine", AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine.setName("writeLine");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine.addResult(AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine.addArgument(AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value);
		// CallBehaviorAction AssemblyConnectors_P_P_main::instantiate_A_Unconnected_Pattern
		addToElementRepository("instantiate_A_Unconnected_Pattern", AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern.setName("instantiate_A_Unconnected_Pattern");
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern.addResult(AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern.setBehavior(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern);
		// CallBehaviorAction AssemblyConnectors_P_P_assert_A_Unconnected_Pattern::writeLine
		addToElementRepository("writeLine", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine.setName("writeLine");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine.addResult(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine.setBehavior(FoundationalModelLibraryModel.instance().FoundationalModelLibrary_BasicInputOutput_WriteLine);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine.addArgument(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value);
		// CallBehaviorAction AssemblyConnectors_P_P_main::instantiate_A_Empty_Pattern
		addToElementRepository("instantiate_A_Empty_Pattern", AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern);
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern.setName("instantiate_A_Empty_Pattern");
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern.addResult(AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern.setBehavior(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction AssemblyConnectors_P_P_instantiate_A_Empty_Pattern::A_Empty_Pattern()
		addToElementRepository("A_Empty_Pattern()", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setName("A_Empty_Pattern()");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.addResult(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setOperation(AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern_.setTarget(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		// CallOperationAction AssemblyConnectors_P_P_instantiate_A_Star_Pattern::A_Star_Pattern()
		addToElementRepository("A_Star_Pattern()", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_.setName("A_Star_Pattern()");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_.addResult(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_.setOperation(AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern_.setTarget(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		// CallOperationAction AssemblyConnectors_P_P_instantiate_A_Array_Pattern::A_Array_Pattern()
		addToElementRepository("A_Array_Pattern()", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_.setName("A_Array_Pattern()");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_.addResult(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_.setOperation(AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern_.setTarget(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		// CallOperationAction AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern::A_Unconnected_Pattern()
		addToElementRepository("A_Unconnected_Pattern()", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setName("A_Unconnected_Pattern()");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.addResult(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setOperation(AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern_.setTarget(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
	}

	private void initializeClass_Instances()
	{
		// Class AssemblyConnectors_P_P::A_Array_Pattern
		addToElementRepository("A_Array_Pattern", AssemblyConnectors_P_P_A_Array_Pattern);
		AssemblyConnectors_P_P_A_Array_Pattern.setName("A_Array_Pattern");
		AssemblyConnectors_P_P_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_A_Array_Pattern.addOwnedAttribute(AssemblyConnectors_P_P_A_Array_Pattern_partB);
		AssemblyConnectors_P_P_A_Array_Pattern.addOwnedAttribute(AssemblyConnectors_P_P_A_Array_Pattern_partC);
		
		AssemblyConnectors_P_P_A_Array_Pattern.addOwnedConnector(AssemblyConnectors_P_P_A_Array_Pattern_r);
		AssemblyConnectors_P_P_A_Array_Pattern.addOwnedOperation(AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		// Class AssemblyConnectors_P_P::A_Unconnected_Pattern
		addToElementRepository("A_Unconnected_Pattern", AssemblyConnectors_P_P_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_A_Unconnected_Pattern.setName("A_Unconnected_Pattern");
		AssemblyConnectors_P_P_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_A_Unconnected_Pattern.addOwnedAttribute(AssemblyConnectors_P_P_A_Unconnected_Pattern_partB);
		AssemblyConnectors_P_P_A_Unconnected_Pattern.addOwnedAttribute(AssemblyConnectors_P_P_A_Unconnected_Pattern_partC);
		
		AssemblyConnectors_P_P_A_Unconnected_Pattern.addOwnedConnector(AssemblyConnectors_P_P_A_Unconnected_Pattern_r);
		AssemblyConnectors_P_P_A_Unconnected_Pattern.addOwnedOperation(AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		// Class AssemblyConnectors_P_P::A_Empty_Pattern
		addToElementRepository("A_Empty_Pattern", AssemblyConnectors_P_P_A_Empty_Pattern);
		AssemblyConnectors_P_P_A_Empty_Pattern.setName("A_Empty_Pattern");
		AssemblyConnectors_P_P_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_A_Empty_Pattern.addOwnedAttribute(AssemblyConnectors_P_P_A_Empty_Pattern_partB);
		AssemblyConnectors_P_P_A_Empty_Pattern.addOwnedAttribute(AssemblyConnectors_P_P_A_Empty_Pattern_partC);
		
		AssemblyConnectors_P_P_A_Empty_Pattern.addOwnedConnector(AssemblyConnectors_P_P_A_Empty_Pattern_r);
		AssemblyConnectors_P_P_A_Empty_Pattern.addOwnedOperation(AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		// Class AssemblyConnectors_P_P::A_Star_Pattern
		addToElementRepository("A_Star_Pattern", AssemblyConnectors_P_P_A_Star_Pattern);
		AssemblyConnectors_P_P_A_Star_Pattern.setName("A_Star_Pattern");
		AssemblyConnectors_P_P_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_A_Star_Pattern.addOwnedAttribute(AssemblyConnectors_P_P_A_Star_Pattern_partB);
		AssemblyConnectors_P_P_A_Star_Pattern.addOwnedAttribute(AssemblyConnectors_P_P_A_Star_Pattern_partC);
		
		AssemblyConnectors_P_P_A_Star_Pattern.addOwnedConnector(AssemblyConnectors_P_P_A_Star_Pattern_r);
		AssemblyConnectors_P_P_A_Star_Pattern.addOwnedOperation(AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		// Class AssemblyConnectors_P_P::B
		addToElementRepository("B", AssemblyConnectors_P_P_B);
		AssemblyConnectors_P_P_B.setName("B");
		AssemblyConnectors_P_P_B.setVisibility(VisibilityKind.public_);
		// Class AssemblyConnectors_P_P::C
		addToElementRepository("C", AssemblyConnectors_P_P_C);
		AssemblyConnectors_P_P_C.setName("C");
		AssemblyConnectors_P_P_C.setVisibility(VisibilityKind.public_);
	}

	private void initializeComment_Instances()
	{
		// Comment AssemblyConnectors_P_P::Comment84
		addToElementRepository("Comment84", AssemblyConnectors_P_P_Comment84);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment AssemblyConnectors_P_P_A_Empty_Pattern::Comment67
		addToElementRepository("Comment67", AssemblyConnectors_P_P_A_Empty_Pattern_Comment67);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment AssemblyConnectors_P_P_A_Unconnected_Pattern::Comment43
		addToElementRepository("Comment43", AssemblyConnectors_P_P_A_Unconnected_Pattern_Comment43);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment AssemblyConnectors_P_P_A_Array_Pattern::Comment85
		addToElementRepository("Comment85", AssemblyConnectors_P_P_A_Array_Pattern_Comment85);
		// Initialization is currently unimplemented for metaclass Comment
		// Comment AssemblyConnectors_P_P_A_Star_Pattern::Comment120
		addToElementRepository("Comment120", AssemblyConnectors_P_P_A_Star_Pattern_Comment120);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeConnector_Instances()
	{
		// Connector AssemblyConnectors_P_P_A_Star_Pattern::r
		addToElementRepository("r", AssemblyConnectors_P_P_A_Star_Pattern_r);
		AssemblyConnectors_P_P_A_Star_Pattern_r.setName("r");
		AssemblyConnectors_P_P_A_Star_Pattern_r.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Star_Pattern_r.addEnd(AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123);
		AssemblyConnectors_P_P_A_Star_Pattern_r.addEnd(AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124);
		AssemblyConnectors_P_P_A_Star_Pattern_r.setType(AssemblyConnectors_P_P_R);
		// Connector AssemblyConnectors_P_P_A_Empty_Pattern::r
		addToElementRepository("r", AssemblyConnectors_P_P_A_Empty_Pattern_r);
		AssemblyConnectors_P_P_A_Empty_Pattern_r.setName("r");
		AssemblyConnectors_P_P_A_Empty_Pattern_r.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Empty_Pattern_r.addEnd(AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68);
		AssemblyConnectors_P_P_A_Empty_Pattern_r.addEnd(AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69);
		AssemblyConnectors_P_P_A_Empty_Pattern_r.setType(AssemblyConnectors_P_P_R);
		// Connector AssemblyConnectors_P_P_A_Unconnected_Pattern::r
		addToElementRepository("r", AssemblyConnectors_P_P_A_Unconnected_Pattern_r);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r.setName("r");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r.addEnd(AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r.addEnd(AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r.setType(AssemblyConnectors_P_P_R);
		// Connector AssemblyConnectors_P_P_A_Array_Pattern::r
		addToElementRepository("r", AssemblyConnectors_P_P_A_Array_Pattern_r);
		AssemblyConnectors_P_P_A_Array_Pattern_r.setName("r");
		AssemblyConnectors_P_P_A_Array_Pattern_r.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Array_Pattern_r.addEnd(AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88);
		AssemblyConnectors_P_P_A_Array_Pattern_r.addEnd(AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89);
		AssemblyConnectors_P_P_A_Array_Pattern_r.setType(AssemblyConnectors_P_P_R);
	}

	private void initializeConnectorEnd_Instances()
	{
		// ConnectorEnd AssemblyConnectors_P_P_A_Array_Pattern_r::ConnectorEnd88
		addToElementRepository("ConnectorEnd88", AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88);
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88.setUpper(-1);
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88.setRole(AssemblyConnectors_P_P_A_Array_Pattern_partB);
		// ConnectorEnd AssemblyConnectors_P_P_A_Empty_Pattern_r::ConnectorEnd68
		addToElementRepository("ConnectorEnd68", AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68);
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68.setUpper(-1);
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68.setRole(AssemblyConnectors_P_P_A_Empty_Pattern_partB);
		// ConnectorEnd AssemblyConnectors_P_P_A_Unconnected_Pattern_r::ConnectorEnd48
		addToElementRepository("ConnectorEnd48", AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48.setUpper(-1);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48.setLower(0);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48.setRole(AssemblyConnectors_P_P_A_Unconnected_Pattern_partB);
		// ConnectorEnd AssemblyConnectors_P_P_A_Unconnected_Pattern_r::ConnectorEnd49
		addToElementRepository("ConnectorEnd49", AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49.setUpper(-1);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49.setLower(0);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49.setRole(AssemblyConnectors_P_P_A_Unconnected_Pattern_partC);
		// ConnectorEnd AssemblyConnectors_P_P_A_Star_Pattern_r::ConnectorEnd124
		addToElementRepository("ConnectorEnd124", AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124.setUpper(-1);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124.setLower(3);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124.setRole(AssemblyConnectors_P_P_A_Star_Pattern_partC);
		// ConnectorEnd AssemblyConnectors_P_P_A_Star_Pattern_r::ConnectorEnd123
		addToElementRepository("ConnectorEnd123", AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123.setUpper(-1);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123.setLower(4);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123.setRole(AssemblyConnectors_P_P_A_Star_Pattern_partB);
		// ConnectorEnd AssemblyConnectors_P_P_A_Array_Pattern_r::ConnectorEnd89
		addToElementRepository("ConnectorEnd89", AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89);
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89.setUpper(-1);
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89.setRole(AssemblyConnectors_P_P_A_Array_Pattern_partC);
		// ConnectorEnd AssemblyConnectors_P_P_A_Empty_Pattern_r::ConnectorEnd69
		addToElementRepository("ConnectorEnd69", AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69);
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69.setUpper(-1);
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69.setRole(AssemblyConnectors_P_P_A_Empty_Pattern_partC);
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow AssemblyConnectors_P_P_main::ControlFlow26
		addToElementRepository("ControlFlow26", AssemblyConnectors_P_P_main_ControlFlow26);
		AssemblyConnectors_P_P_main_ControlFlow26.setName("ControlFlow26");
		AssemblyConnectors_P_P_main_ControlFlow26.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_main_ControlFlow26.setSource(AssemblyConnectors_P_P_main_assert_A_Empty_Pattern);
		AssemblyConnectors_P_P_main_ControlFlow26.setTarget(AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern);
		// ControlFlow AssemblyConnectors_P_P_main::ControlFlow13
		addToElementRepository("ControlFlow13", AssemblyConnectors_P_P_main_ControlFlow13);
		AssemblyConnectors_P_P_main_ControlFlow13.setName("ControlFlow13");
		AssemblyConnectors_P_P_main_ControlFlow13.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_main_ControlFlow13.setSource(AssemblyConnectors_P_P_main_assert_A_Array_Pattern);
		AssemblyConnectors_P_P_main_ControlFlow13.setTarget(AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern);
		// ControlFlow AssemblyConnectors_P_P_main::ControlFlow36
		addToElementRepository("ControlFlow36", AssemblyConnectors_P_P_main_ControlFlow36);
		AssemblyConnectors_P_P_main_ControlFlow36.setName("ControlFlow36");
		AssemblyConnectors_P_P_main_ControlFlow36.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_main_ControlFlow36.setSource(AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_main_ControlFlow36.setTarget(AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern);
	}

	private void initializeCreateObjectAction_Instances()
	{
		// CreateObjectAction AssemblyConnectors_P_P_instantiate_A_Empty_Pattern::Create A_Empty_Pattern
		addToElementRepository("Create A_Empty_Pattern", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setName("Create A_Empty_Pattern");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setClassifier(AssemblyConnectors_P_P_A_Empty_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern.setResult(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		// CreateObjectAction AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern::Create A_Unconnected_Pattern
		addToElementRepository("Create A_Unconnected_Pattern", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setName("Create A_Unconnected_Pattern");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setClassifier(AssemblyConnectors_P_P_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern.setResult(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		// CreateObjectAction AssemblyConnectors_P_P_instantiate_A_Array_Pattern::Create A_Array_Pattern
		addToElementRepository("Create A_Array_Pattern", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setName("Create A_Array_Pattern");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setClassifier(AssemblyConnectors_P_P_A_Array_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern.setResult(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		// CreateObjectAction AssemblyConnectors_P_P_instantiate_A_Star_Pattern::Create A_Star_Pattern
		addToElementRepository("Create A_Star_Pattern", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setName("Create A_Star_Pattern");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setClassifier(AssemblyConnectors_P_P_A_Star_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern.setResult(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()::target
		addToElementRepository("target", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target.setName("target");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target.setType(AssemblyConnectors_P_P_A_Star_Pattern);
		// InputPin AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()::target
		addToElementRepository("target", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target.setName("target");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target.setType(AssemblyConnectors_P_P_A_Array_Pattern);
		// InputPin AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine::value
		addToElementRepository("value", AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value.setName("value");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine::value
		addToElementRepository("value", AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value.setName("value");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin AssemblyConnectors_P_P_main_assert_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern.setType(AssemblyConnectors_P_P_A_Empty_Pattern);
		// InputPin AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine::value
		addToElementRepository("value", AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value.setName("value");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin AssemblyConnectors_P_P_main_assert_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern.setType(AssemblyConnectors_P_P_A_Star_Pattern);
		// InputPin AssemblyConnectors_P_P_main_assert_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern.setType(AssemblyConnectors_P_P_A_Array_Pattern);
		// InputPin AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()::target
		addToElementRepository("target", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setName("target");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target.setType(AssemblyConnectors_P_P_A_Unconnected_Pattern);
		// InputPin AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(AssemblyConnectors_P_P_A_Unconnected_Pattern);
		// InputPin AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine::value
		addToElementRepository("value", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value.setName("value");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// InputPin AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()::target
		addToElementRepository("target", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setName("target");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target.setType(AssemblyConnectors_P_P_A_Empty_Pattern);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139::LiteralBoolean140
		addToElementRepository("LiteralBoolean140", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139_LiteralBoolean140);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139_LiteralBoolean140.setName("LiteralBoolean140");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139_LiteralBoolean140.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139_LiteralBoolean140.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132::LiteralBoolean133
		addToElementRepository("LiteralBoolean133", AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132_LiteralBoolean133);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132_LiteralBoolean133.setName("LiteralBoolean133");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132_LiteralBoolean133.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132_LiteralBoolean133.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_main_ObjectFlow10::LiteralBoolean11
		addToElementRepository("LiteralBoolean11", AssemblyConnectors_P_P_main_ObjectFlow10_LiteralBoolean11);
		AssemblyConnectors_P_P_main_ObjectFlow10_LiteralBoolean11.setName("LiteralBoolean11");
		AssemblyConnectors_P_P_main_ObjectFlow10_LiteralBoolean11.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_ObjectFlow10_LiteralBoolean11.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170::LiteralBoolean172
		addToElementRepository("LiteralBoolean172", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170_LiteralBoolean172);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170_LiteralBoolean172.setName("LiteralBoolean172");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170_LiteralBoolean172.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170_LiteralBoolean172.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_main_ObjectFlow17::LiteralBoolean18
		addToElementRepository("LiteralBoolean18", AssemblyConnectors_P_P_main_ObjectFlow17_LiteralBoolean18);
		AssemblyConnectors_P_P_main_ObjectFlow17_LiteralBoolean18.setName("LiteralBoolean18");
		AssemblyConnectors_P_P_main_ObjectFlow17_LiteralBoolean18.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_ObjectFlow17_LiteralBoolean18.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78::LiteralBoolean80
		addToElementRepository("LiteralBoolean80", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralBoolean80);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralBoolean80.setName("LiteralBoolean80");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralBoolean80.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralBoolean80.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_main_ObjectFlow23::LiteralBoolean25
		addToElementRepository("LiteralBoolean25", AssemblyConnectors_P_P_main_ObjectFlow23_LiteralBoolean25);
		AssemblyConnectors_P_P_main_ObjectFlow23_LiteralBoolean25.setName("LiteralBoolean25");
		AssemblyConnectors_P_P_main_ObjectFlow23_LiteralBoolean25.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_ObjectFlow23_LiteralBoolean25.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50::LiteralBoolean51
		addToElementRepository("LiteralBoolean51", AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50_LiteralBoolean51);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50_LiteralBoolean51.setName("LiteralBoolean51");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50_LiteralBoolean51.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50_LiteralBoolean51.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81::LiteralBoolean82
		addToElementRepository("LiteralBoolean82", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81_LiteralBoolean82);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81_LiteralBoolean82.setName("LiteralBoolean82");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81_LiteralBoolean82.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81_LiteralBoolean82.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157::LiteralBoolean158
		addToElementRepository("LiteralBoolean158", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157_LiteralBoolean158);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157_LiteralBoolean158.setName("LiteralBoolean158");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157_LiteralBoolean158.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157_LiteralBoolean158.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160::LiteralBoolean161
		addToElementRepository("LiteralBoolean161", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160_LiteralBoolean161);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160_LiteralBoolean161.setName("LiteralBoolean161");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160_LiteralBoolean161.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160_LiteralBoolean161.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108::LiteralBoolean110
		addToElementRepository("LiteralBoolean110", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108_LiteralBoolean110);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108_LiteralBoolean110.setName("LiteralBoolean110");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108_LiteralBoolean110.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108_LiteralBoolean110.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98::LiteralBoolean100
		addToElementRepository("LiteralBoolean100", AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98_LiteralBoolean100);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98_LiteralBoolean100.setName("LiteralBoolean100");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98_LiteralBoolean100.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98_LiteralBoolean100.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_main_ObjectFlow40::LiteralBoolean42
		addToElementRepository("LiteralBoolean42", AssemblyConnectors_P_P_main_ObjectFlow40_LiteralBoolean42);
		AssemblyConnectors_P_P_main_ObjectFlow40_LiteralBoolean42.setName("LiteralBoolean42");
		AssemblyConnectors_P_P_main_ObjectFlow40_LiteralBoolean42.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_ObjectFlow40_LiteralBoolean42.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165::LiteralBoolean167
		addToElementRepository("LiteralBoolean167", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165_LiteralBoolean167);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165_LiteralBoolean167.setName("LiteralBoolean167");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165_LiteralBoolean167.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165_LiteralBoolean167.setValue(true);
		// LiteralBoolean AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147::LiteralBoolean149
		addToElementRepository("LiteralBoolean149", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147_LiteralBoolean149);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147_LiteralBoolean149.setName("LiteralBoolean149");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147_LiteralBoolean149.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147_LiteralBoolean149.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger AssemblyConnectors_P_P_A_Unconnected_Pattern_partC::LiteralInteger46
		addToElementRepository("LiteralInteger46", AssemblyConnectors_P_P_A_Unconnected_Pattern_partC_LiteralInteger46);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partC_LiteralInteger46.setName("LiteralInteger46");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partC_LiteralInteger46.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partC_LiteralInteger46.setValue(3);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value::LiteralInteger129
		addToElementRepository("LiteralInteger129", AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger129);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger129.setName("LiteralInteger129");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger129.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger129.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50::LiteralInteger52
		addToElementRepository("LiteralInteger52", AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50_LiteralInteger52);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50_LiteralInteger52.setName("LiteralInteger52");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50_LiteralInteger52.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50_LiteralInteger52.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132::LiteralInteger134
		addToElementRepository("LiteralInteger134", AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132_LiteralInteger134);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132_LiteralInteger134.setName("LiteralInteger134");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132_LiteralInteger134.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132_LiteralInteger134.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_R_y::LiteralInteger0
		addToElementRepository("LiteralInteger0", AssemblyConnectors_P_P_R_y_LiteralInteger0);
		AssemblyConnectors_P_P_R_y_LiteralInteger0.setName("LiteralInteger0");
		AssemblyConnectors_P_P_R_y_LiteralInteger0.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_R_y_LiteralInteger0.setValue(0);
		// LiteralInteger AssemblyConnectors_P_P_A_Array_Pattern_partB::LiteralInteger91
		addToElementRepository("LiteralInteger91", AssemblyConnectors_P_P_A_Array_Pattern_partB_LiteralInteger91);
		AssemblyConnectors_P_P_A_Array_Pattern_partB_LiteralInteger91.setName("LiteralInteger91");
		AssemblyConnectors_P_P_A_Array_Pattern_partB_LiteralInteger91.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Array_Pattern_partB_LiteralInteger91.setValue(4);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralInteger174
		addToElementRepository("LiteralInteger174", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger174);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger174.setName("LiteralInteger174");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger174.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger174.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create A_Array_Pattern_result::LiteralInteger151
		addToElementRepository("LiteralInteger151", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger151);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger151.setName("LiteralInteger151");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger151.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralInteger151.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralInteger35
		addToElementRepository("LiteralInteger35", AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger35);
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger35.setName("LiteralInteger35");
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger35.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger35.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralInteger72
		addToElementRepository("LiteralInteger72", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger72);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger72.setName("LiteralInteger72");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger72.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger72.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_1_Lower);
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_1_Lower.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus::LiteralInteger126
		addToElementRepository("LiteralInteger126", AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger126);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger126.setName("LiteralInteger126");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger126.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger126.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node::LiteralInteger138
		addToElementRepository("LiteralInteger138", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger138);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger138.setName("LiteralInteger138");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger138.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger138.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123_connectorEnd_1_Lower);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123_connectorEnd_1_Lower.setValue(4);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create A_Empty_Pattern_result::LiteralInteger76
		addToElementRepository("LiteralInteger76", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger76);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger76.setName("LiteralInteger76");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger76.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralInteger76.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralInteger111
		addToElementRepository("LiteralInteger111", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger111);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger111.setName("LiteralInteger111");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger111.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger111.setValue(0);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus::LiteralInteger95
		addToElementRepository("LiteralInteger95", AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger95);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger95.setName("LiteralInteger95");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger95.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger95.setValue(0);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralInteger112
		addToElementRepository("LiteralInteger112", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger112);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger112.setName("LiteralInteger112");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger112.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralInteger112.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralInteger9
		addToElementRepository("LiteralInteger9", AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger9);
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger9.setName("LiteralInteger9");
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger9.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger9.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Star_Pattern_partB::LiteralInteger122
		addToElementRepository("LiteralInteger122", AssemblyConnectors_P_P_A_Star_Pattern_partB_LiteralInteger122);
		AssemblyConnectors_P_P_A_Star_Pattern_partB_LiteralInteger122.setName("LiteralInteger122");
		AssemblyConnectors_P_P_A_Star_Pattern_partB_LiteralInteger122.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Star_Pattern_partB_LiteralInteger122.setValue(4);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value::LiteralInteger93
		addToElementRepository("LiteralInteger93", AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger93);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger93.setName("LiteralInteger93");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger93.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger93.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralInteger155
		addToElementRepository("LiteralInteger155", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger155);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger155.setName("LiteralInteger155");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger155.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger155.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger6
		addToElementRepository("LiteralInteger6", AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger6);
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger6.setName("LiteralInteger6");
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger6.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger6.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_R_x::LiteralInteger3
		addToElementRepository("LiteralInteger3", AssemblyConnectors_P_P_R_x_LiteralInteger3);
		AssemblyConnectors_P_P_R_x_LiteralInteger3.setName("LiteralInteger3");
		AssemblyConnectors_P_P_R_x_LiteralInteger3.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_R_x_LiteralInteger3.setValue(0);
		// LiteralInteger AssemblyConnectors_P_P_main_ObjectFlow10::LiteralInteger12
		addToElementRepository("LiteralInteger12", AssemblyConnectors_P_P_main_ObjectFlow10_LiteralInteger12);
		AssemblyConnectors_P_P_main_ObjectFlow10_LiteralInteger12.setName("LiteralInteger12");
		AssemblyConnectors_P_P_main_ObjectFlow10_LiteralInteger12.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_ObjectFlow10_LiteralInteger12.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger22
		addToElementRepository("LiteralInteger22", AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger22);
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger22.setName("LiteralInteger22");
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger22.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger22.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()_target::LiteralInteger152
		addToElementRepository("LiteralInteger152", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger152);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger152.setName("LiteralInteger152");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger152.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralInteger152.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result::LiteralInteger105
		addToElementRepository("LiteralInteger105", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger105);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger105.setName("LiteralInteger105");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger105.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralInteger105.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value::LiteralInteger114
		addToElementRepository("LiteralInteger114", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger114);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger114.setName("LiteralInteger114");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger114.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger114.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78::LiteralInteger79
		addToElementRepository("LiteralInteger79", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralInteger79);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralInteger79.setName("LiteralInteger79");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralInteger79.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralInteger79.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node::LiteralInteger117
		addToElementRepository("LiteralInteger117", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger117);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger117.setName("LiteralInteger117");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger117.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_node_LiteralInteger117.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger20
		addToElementRepository("LiteralInteger20", AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger20);
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger20.setName("LiteralInteger20");
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger20.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger20.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Empty_Pattern_partC::LiteralInteger66
		addToElementRepository("LiteralInteger66", AssemblyConnectors_P_P_A_Empty_Pattern_partC_LiteralInteger66);
		AssemblyConnectors_P_P_A_Empty_Pattern_partC_LiteralInteger66.setName("LiteralInteger66");
		AssemblyConnectors_P_P_A_Empty_Pattern_partC_LiteralInteger66.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Empty_Pattern_partC_LiteralInteger66.setValue(0);
		// LiteralInteger AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49_connectorEnd_2_Lower);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49_connectorEnd_2_Lower.setValue(0);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value::LiteralInteger116
		addToElementRepository("LiteralInteger116", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger116);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger116.setName("LiteralInteger116");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger116.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralInteger116.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralInteger154
		addToElementRepository("LiteralInteger154", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger154);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger154.setName("LiteralInteger154");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger154.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralInteger154.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170::LiteralInteger171
		addToElementRepository("LiteralInteger171", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170_LiteralInteger171);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170_LiteralInteger171.setName("LiteralInteger171");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170_LiteralInteger171.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170_LiteralInteger171.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value::LiteralInteger130
		addToElementRepository("LiteralInteger130", AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger130);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger130.setName("LiteralInteger130");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger130.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralInteger130.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger37
		addToElementRepository("LiteralInteger37", AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger37);
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger37.setName("LiteralInteger37");
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger37.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger37.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value::LiteralInteger92
		addToElementRepository("LiteralInteger92", AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger92);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger92.setName("LiteralInteger92");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger92.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralInteger92.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralInteger34
		addToElementRepository("LiteralInteger34", AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger34);
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger34.setName("LiteralInteger34");
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger34.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralInteger34.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124_connectorEnd_2_Lower);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124_connectorEnd_2_Lower.setValue(3);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result::LiteralInteger53
		addToElementRepository("LiteralInteger53", AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralInteger53);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralInteger53.setName("LiteralInteger53");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralInteger53.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralInteger53.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_1_Lower);
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_1_Lower.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralInteger143
		addToElementRepository("LiteralInteger143", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger143);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger143.setName("LiteralInteger143");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger143.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger143.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralInteger71
		addToElementRepository("LiteralInteger71", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger71);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger71.setName("LiteralInteger71");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger71.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralInteger71.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralInteger60
		addToElementRepository("LiteralInteger60", AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger60);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger60.setName("LiteralInteger60");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger60.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger60.setValue(0);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus::LiteralInteger97
		addToElementRepository("LiteralInteger97", AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger97);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger97.setName("LiteralInteger97");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger97.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralInteger97.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_target::LiteralInteger74
		addToElementRepository("LiteralInteger74", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger74);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger74.setName("LiteralInteger74");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger74.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralInteger74.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Empty_Pattern_partB::LiteralInteger64
		addToElementRepository("LiteralInteger64", AssemblyConnectors_P_P_A_Empty_Pattern_partB_LiteralInteger64);
		AssemblyConnectors_P_P_A_Empty_Pattern_partB_LiteralInteger64.setName("LiteralInteger64");
		AssemblyConnectors_P_P_A_Empty_Pattern_partB_LiteralInteger64.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Empty_Pattern_partB_LiteralInteger64.setValue(0);
		// LiteralInteger AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralInteger28
		addToElementRepository("LiteralInteger28", AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger28);
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger28.setName("LiteralInteger28");
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger28.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger28.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralInteger29
		addToElementRepository("LiteralInteger29", AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger29);
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger29.setName("LiteralInteger29");
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger29.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralInteger29.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus::LiteralInteger128
		addToElementRepository("LiteralInteger128", AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger128);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger128.setName("LiteralInteger128");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger128.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralInteger128.setValue(0);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result::LiteralInteger135
		addToElementRepository("LiteralInteger135", AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralInteger135);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralInteger135.setName("LiteralInteger135");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralInteger135.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralInteger135.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Star_Pattern_partC::LiteralInteger118
		addToElementRepository("LiteralInteger118", AssemblyConnectors_P_P_A_Star_Pattern_partC_LiteralInteger118);
		AssemblyConnectors_P_P_A_Star_Pattern_partC_LiteralInteger118.setName("LiteralInteger118");
		AssemblyConnectors_P_P_A_Star_Pattern_partC_LiteralInteger118.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Star_Pattern_partC_LiteralInteger118.setValue(3);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node::LiteralInteger62
		addToElementRepository("LiteralInteger62", AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger62);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger62.setName("LiteralInteger62");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger62.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern_node_LiteralInteger62.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralInteger173
		addToElementRepository("LiteralInteger173", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger173);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger173.setName("LiteralInteger173");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger173.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralInteger173.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89_connectorEnd_2_Lower);
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89_connectorEnd_2_Lower.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value::LiteralInteger57
		addToElementRepository("LiteralInteger57", AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger57);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger57.setName("LiteralInteger57");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger57.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger57.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger32
		addToElementRepository("LiteralInteger32", AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger32);
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger32.setName("LiteralInteger32");
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger32.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger32.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_ObjectFlow40::LiteralInteger41
		addToElementRepository("LiteralInteger41", AssemblyConnectors_P_P_main_ObjectFlow40_LiteralInteger41);
		AssemblyConnectors_P_P_main_ObjectFlow40_LiteralInteger41.setName("LiteralInteger41");
		AssemblyConnectors_P_P_main_ObjectFlow40_LiteralInteger41.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_ObjectFlow40_LiteralInteger41.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139::LiteralInteger141
		addToElementRepository("LiteralInteger141", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139_LiteralInteger141);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139_LiteralInteger141.setName("LiteralInteger141");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139_LiteralInteger141.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139_LiteralInteger141.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_target::LiteralInteger177
		addToElementRepository("LiteralInteger177", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger177);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger177.setName("LiteralInteger177");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger177.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralInteger177.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralInteger14
		addToElementRepository("LiteralInteger14", AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger14);
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger14.setName("LiteralInteger14");
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger14.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger14.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_ObjectFlow23::LiteralInteger24
		addToElementRepository("LiteralInteger24", AssemblyConnectors_P_P_main_ObjectFlow23_LiteralInteger24);
		AssemblyConnectors_P_P_main_ObjectFlow23_LiteralInteger24.setName("LiteralInteger24");
		AssemblyConnectors_P_P_main_ObjectFlow23_LiteralInteger24.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_ObjectFlow23_LiteralInteger24.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98::LiteralInteger99
		addToElementRepository("LiteralInteger99", AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98_LiteralInteger99);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98_LiteralInteger99.setName("LiteralInteger99");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98_LiteralInteger99.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98_LiteralInteger99.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralInteger16
		addToElementRepository("LiteralInteger16", AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger16);
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger16.setName("LiteralInteger16");
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger16.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralInteger16.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108::LiteralInteger109
		addToElementRepository("LiteralInteger109", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108_LiteralInteger109);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108_LiteralInteger109.setName("LiteralInteger109");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108_LiteralInteger109.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108_LiteralInteger109.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Array_Pattern_partC::LiteralInteger86
		addToElementRepository("LiteralInteger86", AssemblyConnectors_P_P_A_Array_Pattern_partC_LiteralInteger86);
		AssemblyConnectors_P_P_A_Array_Pattern_partC_LiteralInteger86.setName("LiteralInteger86");
		AssemblyConnectors_P_P_A_Array_Pattern_partC_LiteralInteger86.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Array_Pattern_partC_LiteralInteger86.setValue(4);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node::LiteralInteger125
		addToElementRepository("LiteralInteger125", AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger125);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger125.setName("LiteralInteger125");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger125.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern_node_LiteralInteger125.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralInteger30
		addToElementRepository("LiteralInteger30", AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger30);
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger30.setName("LiteralInteger30");
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger30.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralInteger30.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165::LiteralInteger166
		addToElementRepository("LiteralInteger166", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165_LiteralInteger166);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165_LiteralInteger166.setName("LiteralInteger166");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165_LiteralInteger166.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165_LiteralInteger166.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()_target::LiteralInteger146
		addToElementRepository("LiteralInteger146", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger146);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger146.setName("LiteralInteger146");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger146.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralInteger146.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69::connectorEnd_2_Lower
		addToElementRepository("connectorEnd_2_Lower", AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69_connectorEnd_2_Lower);
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69_connectorEnd_2_Lower.setName("connectorEnd_2_Lower");
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69_connectorEnd_2_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69_connectorEnd_2_Lower.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger39
		addToElementRepository("LiteralInteger39", AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger39);
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger39.setName("LiteralInteger39");
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger39.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger39.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralInteger59
		addToElementRepository("LiteralInteger59", AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger59);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger59.setName("LiteralInteger59");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger59.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralInteger59.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralInteger142
		addToElementRepository("LiteralInteger142", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger142);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger142.setName("LiteralInteger142");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger142.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralInteger142.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48::connectorEnd_1_Lower
		addToElementRepository("connectorEnd_1_Lower", AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48_connectorEnd_1_Lower);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48_connectorEnd_1_Lower.setName("connectorEnd_1_Lower");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48_connectorEnd_1_Lower.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48_connectorEnd_1_Lower.setValue(0);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node::LiteralInteger101
		addToElementRepository("LiteralInteger101", AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger101);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger101.setName("LiteralInteger101");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger101.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern_node_LiteralInteger101.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create A_Star_Pattern_result::LiteralInteger163
		addToElementRepository("LiteralInteger163", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger163);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger163.setName("LiteralInteger163");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger163.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralInteger163.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralInteger7
		addToElementRepository("LiteralInteger7", AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger7);
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger7.setName("LiteralInteger7");
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger7.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralInteger7.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147::LiteralInteger148
		addToElementRepository("LiteralInteger148", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147_LiteralInteger148);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147_LiteralInteger148.setName("LiteralInteger148");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147_LiteralInteger148.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147_LiteralInteger148.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157::LiteralInteger159
		addToElementRepository("LiteralInteger159", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157_LiteralInteger159);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157_LiteralInteger159.setName("LiteralInteger159");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157_LiteralInteger159.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157_LiteralInteger159.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result::LiteralInteger104
		addToElementRepository("LiteralInteger104", AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralInteger104);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralInteger104.setName("LiteralInteger104");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralInteger104.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralInteger104.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralInteger5
		addToElementRepository("LiteralInteger5", AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger5);
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger5.setName("LiteralInteger5");
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger5.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralInteger5.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern_result::LiteralInteger169
		addToElementRepository("LiteralInteger169", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger169);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger169.setName("LiteralInteger169");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger169.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralInteger169.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_A_Unconnected_Pattern_partB::LiteralInteger45
		addToElementRepository("LiteralInteger45", AssemblyConnectors_P_P_A_Unconnected_Pattern_partB_LiteralInteger45);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partB_LiteralInteger45.setName("LiteralInteger45");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partB_LiteralInteger45.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partB_LiteralInteger45.setValue(2);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81::LiteralInteger83
		addToElementRepository("LiteralInteger83", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81_LiteralInteger83);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81_LiteralInteger83.setName("LiteralInteger83");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81_LiteralInteger83.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81_LiteralInteger83.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160::LiteralInteger162
		addToElementRepository("LiteralInteger162", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160_LiteralInteger162);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160_LiteralInteger162.setName("LiteralInteger162");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160_LiteralInteger162.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160_LiteralInteger162.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_main_ObjectFlow17::LiteralInteger19
		addToElementRepository("LiteralInteger19", AssemblyConnectors_P_P_main_ObjectFlow17_LiteralInteger19);
		AssemblyConnectors_P_P_main_ObjectFlow17_LiteralInteger19.setName("LiteralInteger19");
		AssemblyConnectors_P_P_main_ObjectFlow17_LiteralInteger19.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_ObjectFlow17_LiteralInteger19.setValue(1);
		// LiteralInteger AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value::LiteralInteger58
		addToElementRepository("LiteralInteger58", AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger58);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger58.setName("LiteralInteger58");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger58.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralInteger58.setValue(1);
	}

	private void initializeLiteralString_Instances()
	{
		// LiteralString AssemblyConnectors_P_P_assert_A_Star_Pattern_message::LiteralString102
		addToElementRepository("LiteralString102", AssemblyConnectors_P_P_assert_A_Star_Pattern_message_LiteralString102);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message_LiteralString102.setName("LiteralString102");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message_LiteralString102.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message_LiteralString102.setValue("Assertion currently not implemented for A_Star_Pattern.");
		// LiteralString AssemblyConnectors_P_P_assert_A_Array_Pattern_message::LiteralString137
		addToElementRepository("LiteralString137", AssemblyConnectors_P_P_assert_A_Array_Pattern_message_LiteralString137);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message_LiteralString137.setName("LiteralString137");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message_LiteralString137.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message_LiteralString137.setValue("Assertion currently not implemented for A_Array_Pattern.");
		// LiteralString AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message::LiteralString107
		addToElementRepository("LiteralString107", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_LiteralString107);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_LiteralString107.setName("LiteralString107");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_LiteralString107.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_LiteralString107.setValue("Assertion currently not implemented for A_Unconnected_Pattern.");
		// LiteralString AssemblyConnectors_P_P_assert_A_Empty_Pattern_message::LiteralString55
		addToElementRepository("LiteralString55", AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_LiteralString55);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_LiteralString55.setName("LiteralString55");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_LiteralString55.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_LiteralString55.setValue("Assertion currently not implemented for A_Empty_Pattern.");
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_1_Upper);
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd88_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69_connectorEnd_2_Upper);
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd69_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural61
		addToElementRepository("LiteralUnlimitedNatural61", AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural61);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural61.setName("LiteralUnlimitedNatural61");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural61.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural61.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern_result::LiteralUnlimitedNatural168
		addToElementRepository("LiteralUnlimitedNatural168", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural168);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural168.setName("LiteralUnlimitedNatural168");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural168.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result_LiteralUnlimitedNatural168.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124_connectorEnd_2_Upper);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd124_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralUnlimitedNatural38
		addToElementRepository("LiteralUnlimitedNatural38", AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural38);
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural38.setName("LiteralUnlimitedNatural38");
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural38.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural38.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value::LiteralUnlimitedNatural131
		addToElementRepository("LiteralUnlimitedNatural131", AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural131);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural131.setName("LiteralUnlimitedNatural131");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural131.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value_LiteralUnlimitedNatural131.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value::LiteralUnlimitedNatural94
		addToElementRepository("LiteralUnlimitedNatural94", AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural94);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural94.setName("LiteralUnlimitedNatural94");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural94.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value_LiteralUnlimitedNatural94.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern::LiteralUnlimitedNatural15
		addToElementRepository("LiteralUnlimitedNatural15", AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural15);
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural15.setName("LiteralUnlimitedNatural15");
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural15.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural15.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value::LiteralUnlimitedNatural115
		addToElementRepository("LiteralUnlimitedNatural115", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural115);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural115.setName("LiteralUnlimitedNatural115");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural115.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value_LiteralUnlimitedNatural115.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create A_Array_Pattern_result::LiteralUnlimitedNatural150
		addToElementRepository("LiteralUnlimitedNatural150", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural150);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural150.setName("LiteralUnlimitedNatural150");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural150.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result_LiteralUnlimitedNatural150.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49_connectorEnd_2_Upper);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd49_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Unconnected_Pattern_partB::LiteralUnlimitedNatural44
		addToElementRepository("LiteralUnlimitedNatural44", AssemblyConnectors_P_P_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural44);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural44.setName("LiteralUnlimitedNatural44");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural44.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partB_LiteralUnlimitedNatural44.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_target::LiteralUnlimitedNatural176
		addToElementRepository("LiteralUnlimitedNatural176", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural176);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural176.setName("LiteralUnlimitedNatural176");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural176.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target_LiteralUnlimitedNatural176.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create A_Star_Pattern_result::LiteralUnlimitedNatural164
		addToElementRepository("LiteralUnlimitedNatural164", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural164);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural164.setName("LiteralUnlimitedNatural164");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural164.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result_LiteralUnlimitedNatural164.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_R_y::LiteralUnlimitedNatural1
		addToElementRepository("LiteralUnlimitedNatural1", AssemblyConnectors_P_P_R_y_LiteralUnlimitedNatural1);
		AssemblyConnectors_P_P_R_y_LiteralUnlimitedNatural1.setName("LiteralUnlimitedNatural1");
		AssemblyConnectors_P_P_R_y_LiteralUnlimitedNatural1.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_R_y_LiteralUnlimitedNatural1.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Empty_Pattern_partB::LiteralUnlimitedNatural63
		addToElementRepository("LiteralUnlimitedNatural63", AssemblyConnectors_P_P_A_Empty_Pattern_partB_LiteralUnlimitedNatural63);
		AssemblyConnectors_P_P_A_Empty_Pattern_partB_LiteralUnlimitedNatural63.setName("LiteralUnlimitedNatural63");
		AssemblyConnectors_P_P_A_Empty_Pattern_partB_LiteralUnlimitedNatural63.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Empty_Pattern_partB_LiteralUnlimitedNatural63.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()_target::LiteralUnlimitedNatural153
		addToElementRepository("LiteralUnlimitedNatural153", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural153);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural153.setName("LiteralUnlimitedNatural153");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural153.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target_LiteralUnlimitedNatural153.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result::LiteralUnlimitedNatural106
		addToElementRepository("LiteralUnlimitedNatural106", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural106);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural106.setName("LiteralUnlimitedNatural106");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural106.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result_LiteralUnlimitedNatural106.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48_connectorEnd_1_Upper);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_r_ConnectorEnd48_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_R_x::LiteralUnlimitedNatural2
		addToElementRepository("LiteralUnlimitedNatural2", AssemblyConnectors_P_P_R_x_LiteralUnlimitedNatural2);
		AssemblyConnectors_P_P_R_x_LiteralUnlimitedNatural2.setName("LiteralUnlimitedNatural2");
		AssemblyConnectors_P_P_R_x_LiteralUnlimitedNatural2.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_R_x_LiteralUnlimitedNatural2.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern::LiteralUnlimitedNatural21
		addToElementRepository("LiteralUnlimitedNatural21", AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural21);
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural21.setName("LiteralUnlimitedNatural21");
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural21.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural21.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Star_Pattern_partC::LiteralUnlimitedNatural119
		addToElementRepository("LiteralUnlimitedNatural119", AssemblyConnectors_P_P_A_Star_Pattern_partC_LiteralUnlimitedNatural119);
		AssemblyConnectors_P_P_A_Star_Pattern_partC_LiteralUnlimitedNatural119.setName("LiteralUnlimitedNatural119");
		AssemblyConnectors_P_P_A_Star_Pattern_partC_LiteralUnlimitedNatural119.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Star_Pattern_partC_LiteralUnlimitedNatural119.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()_result::LiteralUnlimitedNatural175
		addToElementRepository("LiteralUnlimitedNatural175", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural175);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural175.setName("LiteralUnlimitedNatural175");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural175.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result_LiteralUnlimitedNatural175.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_target::LiteralUnlimitedNatural75
		addToElementRepository("LiteralUnlimitedNatural75", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural75);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural75.setName("LiteralUnlimitedNatural75");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural75.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target_LiteralUnlimitedNatural75.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern::LiteralUnlimitedNatural4
		addToElementRepository("LiteralUnlimitedNatural4", AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural4);
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural4.setName("LiteralUnlimitedNatural4");
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural4.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern_LiteralUnlimitedNatural4.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123_connectorEnd_1_Upper);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Star_Pattern_r_ConnectorEnd123_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural96
		addToElementRepository("LiteralUnlimitedNatural96", AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural96);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural96.setName("LiteralUnlimitedNatural96");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural96.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural96.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68::connectorEnd_1_Upper
		addToElementRepository("connectorEnd_1_Upper", AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_1_Upper);
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_1_Upper.setName("connectorEnd_1_Upper");
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_1_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Empty_Pattern_r_ConnectorEnd68_connectorEnd_1_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Unconnected_Pattern_partC::LiteralUnlimitedNatural47
		addToElementRepository("LiteralUnlimitedNatural47", AssemblyConnectors_P_P_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural47);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural47.setName("LiteralUnlimitedNatural47");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural47.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partC_LiteralUnlimitedNatural47.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural113
		addToElementRepository("LiteralUnlimitedNatural113", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural113);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural113.setName("LiteralUnlimitedNatural113");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural113.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural113.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern::LiteralUnlimitedNatural27
		addToElementRepository("LiteralUnlimitedNatural27", AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural27);
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural27.setName("LiteralUnlimitedNatural27");
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural27.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern_LiteralUnlimitedNatural27.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Star_Pattern_partB::LiteralUnlimitedNatural121
		addToElementRepository("LiteralUnlimitedNatural121", AssemblyConnectors_P_P_A_Star_Pattern_partB_LiteralUnlimitedNatural121);
		AssemblyConnectors_P_P_A_Star_Pattern_partB_LiteralUnlimitedNatural121.setName("LiteralUnlimitedNatural121");
		AssemblyConnectors_P_P_A_Star_Pattern_partB_LiteralUnlimitedNatural121.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Star_Pattern_partB_LiteralUnlimitedNatural121.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()_result::LiteralUnlimitedNatural156
		addToElementRepository("LiteralUnlimitedNatural156", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural156);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural156.setName("LiteralUnlimitedNatural156");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural156.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result_LiteralUnlimitedNatural156.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()_result::LiteralUnlimitedNatural73
		addToElementRepository("LiteralUnlimitedNatural73", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural73);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural73.setName("LiteralUnlimitedNatural73");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural73.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result_LiteralUnlimitedNatural73.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89::connectorEnd_2_Upper
		addToElementRepository("connectorEnd_2_Upper", AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89_connectorEnd_2_Upper);
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89_connectorEnd_2_Upper.setName("connectorEnd_2_Upper");
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89_connectorEnd_2_Upper.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Array_Pattern_r_ConnectorEnd89_connectorEnd_2_Upper.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value::LiteralUnlimitedNatural56
		addToElementRepository("LiteralUnlimitedNatural56", AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural56);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural56.setName("LiteralUnlimitedNatural56");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural56.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value_LiteralUnlimitedNatural56.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern::LiteralUnlimitedNatural33
		addToElementRepository("LiteralUnlimitedNatural33", AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural33);
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural33.setName("LiteralUnlimitedNatural33");
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural33.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural33.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Array_Pattern_partB::LiteralUnlimitedNatural90
		addToElementRepository("LiteralUnlimitedNatural90", AssemblyConnectors_P_P_A_Array_Pattern_partB_LiteralUnlimitedNatural90);
		AssemblyConnectors_P_P_A_Array_Pattern_partB_LiteralUnlimitedNatural90.setName("LiteralUnlimitedNatural90");
		AssemblyConnectors_P_P_A_Array_Pattern_partB_LiteralUnlimitedNatural90.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Array_Pattern_partB_LiteralUnlimitedNatural90.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result::LiteralUnlimitedNatural103
		addToElementRepository("LiteralUnlimitedNatural103", AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural103);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural103.setName("LiteralUnlimitedNatural103");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural103.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result_LiteralUnlimitedNatural103.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern::LiteralUnlimitedNatural8
		addToElementRepository("LiteralUnlimitedNatural8", AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural8);
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural8.setName("LiteralUnlimitedNatural8");
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural8.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern_LiteralUnlimitedNatural8.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Empty_Pattern_partC::LiteralUnlimitedNatural65
		addToElementRepository("LiteralUnlimitedNatural65", AssemblyConnectors_P_P_A_Empty_Pattern_partC_LiteralUnlimitedNatural65);
		AssemblyConnectors_P_P_A_Empty_Pattern_partC_LiteralUnlimitedNatural65.setName("LiteralUnlimitedNatural65");
		AssemblyConnectors_P_P_A_Empty_Pattern_partC_LiteralUnlimitedNatural65.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Empty_Pattern_partC_LiteralUnlimitedNatural65.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern::LiteralUnlimitedNatural31
		addToElementRepository("LiteralUnlimitedNatural31", AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural31);
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural31.setName("LiteralUnlimitedNatural31");
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural31.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern_LiteralUnlimitedNatural31.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create A_Empty_Pattern_result::LiteralUnlimitedNatural77
		addToElementRepository("LiteralUnlimitedNatural77", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural77);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural77.setName("LiteralUnlimitedNatural77");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural77.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result_LiteralUnlimitedNatural77.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus::LiteralUnlimitedNatural127
		addToElementRepository("LiteralUnlimitedNatural127", AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural127);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural127.setName("LiteralUnlimitedNatural127");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural127.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus_LiteralUnlimitedNatural127.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()_target::LiteralUnlimitedNatural145
		addToElementRepository("LiteralUnlimitedNatural145", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural145);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural145.setName("LiteralUnlimitedNatural145");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural145.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target_LiteralUnlimitedNatural145.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_A_Array_Pattern_partC::LiteralUnlimitedNatural87
		addToElementRepository("LiteralUnlimitedNatural87", AssemblyConnectors_P_P_A_Array_Pattern_partC_LiteralUnlimitedNatural87);
		AssemblyConnectors_P_P_A_Array_Pattern_partC_LiteralUnlimitedNatural87.setName("LiteralUnlimitedNatural87");
		AssemblyConnectors_P_P_A_Array_Pattern_partC_LiteralUnlimitedNatural87.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Array_Pattern_partC_LiteralUnlimitedNatural87.setValue(-1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result::LiteralUnlimitedNatural54
		addToElementRepository("LiteralUnlimitedNatural54", AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural54);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural54.setName("LiteralUnlimitedNatural54");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural54.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result_LiteralUnlimitedNatural54.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result::LiteralUnlimitedNatural136
		addToElementRepository("LiteralUnlimitedNatural136", AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural136);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural136.setName("LiteralUnlimitedNatural136");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural136.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result_LiteralUnlimitedNatural136.setValue(1);
		// LiteralUnlimitedNatural AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()_result::LiteralUnlimitedNatural144
		addToElementRepository("LiteralUnlimitedNatural144", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural144);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural144.setName("LiteralUnlimitedNatural144");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural144.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result_LiteralUnlimitedNatural144.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow AssemblyConnectors_P_P_instantiate_A_Array_Pattern::ObjectFlow139
		addToElementRepository("ObjectFlow139", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139.setName("ObjectFlow139");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139.setSource(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139.setTarget(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__target);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139.setGuard(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow139_LiteralBoolean140);
		// ObjectFlow AssemblyConnectors_P_P_assert_A_Empty_Pattern::ObjectFlow50
		addToElementRepository("ObjectFlow50", AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50.setName("ObjectFlow50");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50.setSource(AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50.setTarget(AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_value);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50.setGuard(AssemblyConnectors_P_P_assert_A_Empty_Pattern_ObjectFlow50_LiteralBoolean51);
		// ObjectFlow AssemblyConnectors_P_P_main::ObjectFlow10
		addToElementRepository("ObjectFlow10", AssemblyConnectors_P_P_main_ObjectFlow10);
		AssemblyConnectors_P_P_main_ObjectFlow10.setName("ObjectFlow10");
		AssemblyConnectors_P_P_main_ObjectFlow10.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_main_ObjectFlow10.setSource(AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_P_P_main_ObjectFlow10.setTarget(AssemblyConnectors_P_P_main_assert_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_P_P_main_ObjectFlow10.setGuard(AssemblyConnectors_P_P_main_ObjectFlow10_LiteralBoolean11);
		// ObjectFlow AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern::ObjectFlow170
		addToElementRepository("ObjectFlow170", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170.setName("ObjectFlow170");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170.setSource(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170.setTarget(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern_node);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170.setGuard(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow170_LiteralBoolean172);
		// ObjectFlow AssemblyConnectors_P_P_instantiate_A_Empty_Pattern::ObjectFlow78
		addToElementRepository("ObjectFlow78", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78.setName("ObjectFlow78");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78.setSource(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78.setTarget(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern_node);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78.setGuard(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow78_LiteralBoolean80);
		// ObjectFlow AssemblyConnectors_P_P_main::ObjectFlow17
		addToElementRepository("ObjectFlow17", AssemblyConnectors_P_P_main_ObjectFlow17);
		AssemblyConnectors_P_P_main_ObjectFlow17.setName("ObjectFlow17");
		AssemblyConnectors_P_P_main_ObjectFlow17.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_main_ObjectFlow17.setSource(AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_P_P_main_ObjectFlow17.setTarget(AssemblyConnectors_P_P_main_assert_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_P_P_main_ObjectFlow17.setGuard(AssemblyConnectors_P_P_main_ObjectFlow17_LiteralBoolean18);
		// ObjectFlow AssemblyConnectors_P_P_instantiate_A_Star_Pattern::ObjectFlow157
		addToElementRepository("ObjectFlow157", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157.setName("ObjectFlow157");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157.setSource(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157.setTarget(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__target);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157.setGuard(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow157_LiteralBoolean158);
		// ObjectFlow AssemblyConnectors_P_P_assert_A_Unconnected_Pattern::ObjectFlow108
		addToElementRepository("ObjectFlow108", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108.setName("ObjectFlow108");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108.setSource(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108.setTarget(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_value);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108.setGuard(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_ObjectFlow108_LiteralBoolean110);
		// ObjectFlow AssemblyConnectors_P_P_assert_A_Array_Pattern::ObjectFlow132
		addToElementRepository("ObjectFlow132", AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132.setName("ObjectFlow132");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132.setSource(AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132.setTarget(AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_value);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132.setGuard(AssemblyConnectors_P_P_assert_A_Array_Pattern_ObjectFlow132_LiteralBoolean133);
		// ObjectFlow AssemblyConnectors_P_P_instantiate_A_Array_Pattern::ObjectFlow147
		addToElementRepository("ObjectFlow147", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147.setName("ObjectFlow147");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147.setSource(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147.setTarget(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern_node);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147.setGuard(AssemblyConnectors_P_P_instantiate_A_Array_Pattern_ObjectFlow147_LiteralBoolean149);
		// ObjectFlow AssemblyConnectors_P_P_instantiate_A_Star_Pattern::ObjectFlow160
		addToElementRepository("ObjectFlow160", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160.setName("ObjectFlow160");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160.setSource(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160.setTarget(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern_node);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160.setGuard(AssemblyConnectors_P_P_instantiate_A_Star_Pattern_ObjectFlow160_LiteralBoolean161);
		// ObjectFlow AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern::ObjectFlow165
		addToElementRepository("ObjectFlow165", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165.setName("ObjectFlow165");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165.setSource(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165.setTarget(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__target);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165.setGuard(AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_ObjectFlow165_LiteralBoolean167);
		// ObjectFlow AssemblyConnectors_P_P_main::ObjectFlow23
		addToElementRepository("ObjectFlow23", AssemblyConnectors_P_P_main_ObjectFlow23);
		AssemblyConnectors_P_P_main_ObjectFlow23.setName("ObjectFlow23");
		AssemblyConnectors_P_P_main_ObjectFlow23.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_main_ObjectFlow23.setSource(AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_P_P_main_ObjectFlow23.setTarget(AssemblyConnectors_P_P_main_assert_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_P_P_main_ObjectFlow23.setGuard(AssemblyConnectors_P_P_main_ObjectFlow23_LiteralBoolean25);
		// ObjectFlow AssemblyConnectors_P_P_instantiate_A_Empty_Pattern::ObjectFlow81
		addToElementRepository("ObjectFlow81", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81.setName("ObjectFlow81");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81.setSource(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81.setTarget(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__target);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81.setGuard(AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_ObjectFlow81_LiteralBoolean82);
		// ObjectFlow AssemblyConnectors_P_P_assert_A_Star_Pattern::ObjectFlow98
		addToElementRepository("ObjectFlow98", AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98.setName("ObjectFlow98");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98.setSource(AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98.setTarget(AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_value);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98.setGuard(AssemblyConnectors_P_P_assert_A_Star_Pattern_ObjectFlow98_LiteralBoolean100);
		// ObjectFlow AssemblyConnectors_P_P_main::ObjectFlow40
		addToElementRepository("ObjectFlow40", AssemblyConnectors_P_P_main_ObjectFlow40);
		AssemblyConnectors_P_P_main_ObjectFlow40.setName("ObjectFlow40");
		AssemblyConnectors_P_P_main_ObjectFlow40.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_main_ObjectFlow40.setSource(AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_P_P_main_ObjectFlow40.setTarget(AssemblyConnectors_P_P_main_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_P_P_main_ObjectFlow40.setGuard(AssemblyConnectors_P_P_main_ObjectFlow40_LiteralBoolean42);
	}

	private void initializeOperation_Instances()
	{
		// Operation AssemblyConnectors_P_P_A_Star_Pattern::A_Star_Pattern_A_Star_Pattern
		addToElementRepository("A_Star_Pattern_A_Star_Pattern", AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern);
		AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.setName("A_Star_Pattern");
		AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.addOwnedParameter(AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result);
		AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation AssemblyConnectors_P_P_A_Array_Pattern::A_Array_Pattern_A_Array_Pattern
		addToElementRepository("A_Array_Pattern_A_Array_Pattern", AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern);
		AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.setName("A_Array_Pattern");
		AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.addOwnedParameter(AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result);
		AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation AssemblyConnectors_P_P_A_Unconnected_Pattern::A_Unconnected_Pattern_A_Unconnected_Pattern
		addToElementRepository("A_Unconnected_Pattern_A_Unconnected_Pattern", AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.setName("A_Unconnected_Pattern");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.addOwnedParameter(AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation AssemblyConnectors_P_P_A_Empty_Pattern::A_Empty_Pattern_A_Empty_Pattern
		addToElementRepository("A_Empty_Pattern_A_Empty_Pattern", AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern);
		AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.setName("A_Empty_Pattern");
		AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.addOwnedParameter(AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result);
		AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Empty_Pattern_a_Empty_Pattern.setType(AssemblyConnectors_P_P_A_Empty_Pattern);
		// OutputPin AssemblyConnectors_P_P_assert_A_Array_Pattern_message::result
		addToElementRepository("result", AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result.setName("result");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern()::result
		addToElementRepository("result", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setName("result");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_A_Unconnected_Pattern__result.setType(AssemblyConnectors_P_P_A_Unconnected_Pattern);
		// OutputPin AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern()::result
		addToElementRepository("result", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result.setName("result");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_A_Star_Pattern__result.setType(AssemblyConnectors_P_P_A_Star_Pattern);
		// OutputPin AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create A_Unconnected_Pattern::result
		addToElementRepository("result", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setName("result");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_Create_A_Unconnected_Pattern_result.setType(AssemblyConnectors_P_P_A_Unconnected_Pattern);
		// OutputPin AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message::result
		addToElementRepository("result", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result.setName("result");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus.setName("errorStatus");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Array_Pattern_a_Array_Pattern.setType(AssemblyConnectors_P_P_A_Array_Pattern);
		// OutputPin AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(AssemblyConnectors_P_P_A_Unconnected_Pattern);
		// OutputPin AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create A_Empty_Pattern::result
		addToElementRepository("result", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setName("result");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_Create_A_Empty_Pattern_result.setType(AssemblyConnectors_P_P_A_Empty_Pattern);
		// OutputPin AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern()::result
		addToElementRepository("result", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setName("result");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_A_Empty_Pattern__result.setType(AssemblyConnectors_P_P_A_Empty_Pattern);
		// OutputPin AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern()::result
		addToElementRepository("result", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result.setName("result");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_A_Array_Pattern__result.setType(AssemblyConnectors_P_P_A_Array_Pattern);
		// OutputPin AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create A_Array_Pattern::result
		addToElementRepository("result", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setName("result");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_Create_A_Array_Pattern_result.setType(AssemblyConnectors_P_P_A_Array_Pattern);
		// OutputPin AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus.setName("errorStatus");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Array_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus.setName("errorStatus");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin AssemblyConnectors_P_P_assert_A_Empty_Pattern_message::result
		addToElementRepository("result", AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result.setName("result");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
		// OutputPin AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine::errorStatus
		addToElementRepository("errorStatus", AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus.setName("errorStatus");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Star_Pattern_writeLine_errorStatus.setLower(0);
		// OutputPin AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create A_Star_Pattern::result
		addToElementRepository("result", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setName("result");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_Create_A_Star_Pattern_result.setType(AssemblyConnectors_P_P_A_Star_Pattern);
		// OutputPin AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_main_instantiate_A_Star_Pattern_a_Star_Pattern.setType(AssemblyConnectors_P_P_A_Star_Pattern);
		// OutputPin AssemblyConnectors_P_P_assert_A_Star_Pattern_message::result
		addToElementRepository("result", AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result.setName("result");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport AssemblyConnectors_P_P::PackageImport70
		addToElementRepository("PackageImport70", AssemblyConnectors_P_P_PackageImport70);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(AssemblyConnectors_P_P_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Unconnected_Pattern_a_Unconnected_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern::result
		addToElementRepository("result", AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result);
		AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setName("result");
		AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setType(AssemblyConnectors_P_P_A_Array_Pattern);
		AssemblyConnectors_P_P_A_Array_Pattern_A_Array_Pattern_A_Array_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_P_P_assert_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Star_Pattern_a_Star_Pattern.setType(AssemblyConnectors_P_P_A_Star_Pattern);
		// Parameter AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern::result
		addToElementRepository("result", AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result);
		AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setName("result");
		AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setType(AssemblyConnectors_P_P_A_Star_Pattern);
		AssemblyConnectors_P_P_A_Star_Pattern_A_Star_Pattern_A_Star_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern::result
		addToElementRepository("result", AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setName("result");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setType(AssemblyConnectors_P_P_A_Unconnected_Pattern);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_A_Unconnected_Pattern_A_Unconnected_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_P_P_instantiate_A_Star_Pattern::a_Star_Pattern
		addToElementRepository("a_Star_Pattern", AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern.setName("a_Star_Pattern");
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern.setType(AssemblyConnectors_P_P_A_Star_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Star_Pattern_a_Star_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_P_P_assert_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_a_Empty_Pattern.setType(AssemblyConnectors_P_P_A_Empty_Pattern);
		// Parameter AssemblyConnectors_P_P_assert_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Array_Pattern_a_Array_Pattern.setType(AssemblyConnectors_P_P_A_Array_Pattern);
		// Parameter AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern::result
		addToElementRepository("result", AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result);
		AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setName("result");
		AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setType(AssemblyConnectors_P_P_A_Empty_Pattern);
		AssemblyConnectors_P_P_A_Empty_Pattern_A_Empty_Pattern_A_Empty_Pattern_result.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_P_P_instantiate_A_Empty_Pattern::a_Empty_Pattern
		addToElementRepository("a_Empty_Pattern", AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern.setName("a_Empty_Pattern");
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern.setType(AssemblyConnectors_P_P_A_Empty_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Empty_Pattern_a_Empty_Pattern.setDirection(ParameterDirectionKind.return_);
		// Parameter AssemblyConnectors_P_P_assert_A_Unconnected_Pattern::a_Unconnected_Pattern
		addToElementRepository("a_Unconnected_Pattern", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setName("a_Unconnected_Pattern");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_a_Unconnected_Pattern.setType(AssemblyConnectors_P_P_A_Unconnected_Pattern);
		// Parameter AssemblyConnectors_P_P_instantiate_A_Array_Pattern::a_Array_Pattern
		addToElementRepository("a_Array_Pattern", AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern.setName("a_Array_Pattern");
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern.setVisibility(VisibilityKind.public_);
		
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern.setType(AssemblyConnectors_P_P_A_Array_Pattern);
		AssemblyConnectors_P_P_instantiate_A_Array_Pattern_a_Array_Pattern.setDirection(ParameterDirectionKind.return_);
	}

	private void initializeProperty_Instances()
	{
		// Property AssemblyConnectors_P_P_A_Empty_Pattern::partC
		addToElementRepository("partC", AssemblyConnectors_P_P_A_Empty_Pattern_partC);
		AssemblyConnectors_P_P_A_Empty_Pattern_partC.setName("partC");
		AssemblyConnectors_P_P_A_Empty_Pattern_partC.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Empty_Pattern_partC.setUpper(-1);
		AssemblyConnectors_P_P_A_Empty_Pattern_partC.setLower(0);
		AssemblyConnectors_P_P_A_Empty_Pattern_partC.setType(AssemblyConnectors_P_P_C);
		AssemblyConnectors_P_P_A_Empty_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_P_P_A_Empty_Pattern::partB
		addToElementRepository("partB", AssemblyConnectors_P_P_A_Empty_Pattern_partB);
		AssemblyConnectors_P_P_A_Empty_Pattern_partB.setName("partB");
		AssemblyConnectors_P_P_A_Empty_Pattern_partB.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Empty_Pattern_partB.setUpper(-1);
		AssemblyConnectors_P_P_A_Empty_Pattern_partB.setLower(0);
		AssemblyConnectors_P_P_A_Empty_Pattern_partB.setType(AssemblyConnectors_P_P_B);
		AssemblyConnectors_P_P_A_Empty_Pattern_partB.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_P_P_R::y
		addToElementRepository("y", AssemblyConnectors_P_P_R_y);
		AssemblyConnectors_P_P_R_y.setName("y");
		AssemblyConnectors_P_P_R_y.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_R_y.setUpper(-1);
		AssemblyConnectors_P_P_R_y.setLower(0);
		AssemblyConnectors_P_P_R_y.setType(AssemblyConnectors_P_P_C);
		// Property AssemblyConnectors_P_P_R::x
		addToElementRepository("x", AssemblyConnectors_P_P_R_x);
		AssemblyConnectors_P_P_R_x.setName("x");
		AssemblyConnectors_P_P_R_x.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_R_x.setUpper(-1);
		AssemblyConnectors_P_P_R_x.setLower(0);
		AssemblyConnectors_P_P_R_x.setType(AssemblyConnectors_P_P_B);
		// Property AssemblyConnectors_P_P_A_Star_Pattern::partC
		addToElementRepository("partC", AssemblyConnectors_P_P_A_Star_Pattern_partC);
		AssemblyConnectors_P_P_A_Star_Pattern_partC.setName("partC");
		AssemblyConnectors_P_P_A_Star_Pattern_partC.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Star_Pattern_partC.setUpper(-1);
		AssemblyConnectors_P_P_A_Star_Pattern_partC.setLower(3);
		AssemblyConnectors_P_P_A_Star_Pattern_partC.setType(AssemblyConnectors_P_P_C);
		AssemblyConnectors_P_P_A_Star_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_P_P_A_Unconnected_Pattern::partB
		addToElementRepository("partB", AssemblyConnectors_P_P_A_Unconnected_Pattern_partB);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partB.setName("partB");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partB.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partB.setUpper(-1);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partB.setLower(2);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partB.setType(AssemblyConnectors_P_P_B);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partB.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_P_P_A_Array_Pattern::partC
		addToElementRepository("partC", AssemblyConnectors_P_P_A_Array_Pattern_partC);
		AssemblyConnectors_P_P_A_Array_Pattern_partC.setName("partC");
		AssemblyConnectors_P_P_A_Array_Pattern_partC.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Array_Pattern_partC.setUpper(-1);
		AssemblyConnectors_P_P_A_Array_Pattern_partC.setLower(4);
		AssemblyConnectors_P_P_A_Array_Pattern_partC.setType(AssemblyConnectors_P_P_C);
		AssemblyConnectors_P_P_A_Array_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_P_P_A_Star_Pattern::partB
		addToElementRepository("partB", AssemblyConnectors_P_P_A_Star_Pattern_partB);
		AssemblyConnectors_P_P_A_Star_Pattern_partB.setName("partB");
		AssemblyConnectors_P_P_A_Star_Pattern_partB.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Star_Pattern_partB.setUpper(-1);
		AssemblyConnectors_P_P_A_Star_Pattern_partB.setLower(4);
		AssemblyConnectors_P_P_A_Star_Pattern_partB.setType(AssemblyConnectors_P_P_B);
		AssemblyConnectors_P_P_A_Star_Pattern_partB.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_P_P_A_Unconnected_Pattern::partC
		addToElementRepository("partC", AssemblyConnectors_P_P_A_Unconnected_Pattern_partC);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partC.setName("partC");
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partC.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partC.setUpper(-1);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partC.setLower(3);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partC.setType(AssemblyConnectors_P_P_C);
		AssemblyConnectors_P_P_A_Unconnected_Pattern_partC.setAggregation(AggregationKind.composite);
		// Property AssemblyConnectors_P_P_A_Array_Pattern::partB
		addToElementRepository("partB", AssemblyConnectors_P_P_A_Array_Pattern_partB);
		AssemblyConnectors_P_P_A_Array_Pattern_partB.setName("partB");
		AssemblyConnectors_P_P_A_Array_Pattern_partB.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_A_Array_Pattern_partB.setUpper(-1);
		AssemblyConnectors_P_P_A_Array_Pattern_partB.setLower(4);
		AssemblyConnectors_P_P_A_Array_Pattern_partB.setType(AssemblyConnectors_P_P_B);
		AssemblyConnectors_P_P_A_Array_Pattern_partB.setAggregation(AggregationKind.composite);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction AssemblyConnectors_P_P_assert_A_Unconnected_Pattern::message
		addToElementRepository("message", AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message.setName("message");
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message.setValue(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_LiteralString107);
		AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message.setResult(AssemblyConnectors_P_P_assert_A_Unconnected_Pattern_message_result);
		// ValueSpecificationAction AssemblyConnectors_P_P_assert_A_Empty_Pattern::message
		addToElementRepository("message", AssemblyConnectors_P_P_assert_A_Empty_Pattern_message);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message.setName("message");
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message.setValue(AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_LiteralString55);
		AssemblyConnectors_P_P_assert_A_Empty_Pattern_message.setResult(AssemblyConnectors_P_P_assert_A_Empty_Pattern_message_result);
		// ValueSpecificationAction AssemblyConnectors_P_P_assert_A_Array_Pattern::message
		addToElementRepository("message", AssemblyConnectors_P_P_assert_A_Array_Pattern_message);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message.setName("message");
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message.setValue(AssemblyConnectors_P_P_assert_A_Array_Pattern_message_LiteralString137);
		AssemblyConnectors_P_P_assert_A_Array_Pattern_message.setResult(AssemblyConnectors_P_P_assert_A_Array_Pattern_message_result);
		// ValueSpecificationAction AssemblyConnectors_P_P_assert_A_Star_Pattern::message
		addToElementRepository("message", AssemblyConnectors_P_P_assert_A_Star_Pattern_message);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message.setName("message");
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message.setVisibility(VisibilityKind.public_);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message.setValue(AssemblyConnectors_P_P_assert_A_Star_Pattern_message_LiteralString102);
		AssemblyConnectors_P_P_assert_A_Star_Pattern_message.setResult(AssemblyConnectors_P_P_assert_A_Star_Pattern_message_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // AssemblyConnectors_P_PModel
