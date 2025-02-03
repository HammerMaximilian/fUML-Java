/*
 * SignalCommonModel.java
 * 
 * Auto-generated file
 */
package SignalCommon;

import uml.commonbehavior.SignalEvent;
import uml.values.LiteralBoolean;
import uml.actions.ReadSelfAction;
import uml.values.LiteralUnlimitedNatural;
import uml.simpleclassifiers.Signal;
import uml.activities.ActivityFinalNode;
import uml.actions.OutputPin;
import uml.activities.Activity;
import uml.actions.CallOperationAction;
import uml.commonstructure.VisibilityKind;
import uml.actions.InputPin;
import uml.structuredclassifiers.Class_;
import uml.commonstructure.Comment;
import uml.classification.Parameter;
import uml.classification.Operation;
import uml.commonstructure.PackageImport;
import uml.classification.AggregationKind;
import uml.activities.ControlFlow;
import uml.actions.ValueSpecificationAction;
import uml.commonbehavior.FunctionBehavior;
import uml.structuredclassifiers.Association;
import uml.classification.Property;
import utils.primitivetypes.PrimitiveTypesModel;
import uml.classification.ParameterDirectionKind;
import uml.simpleclassifiers.PrimitiveType;
import uml.actions.AddStructuralFeatureValueAction;
import uml.actions.AcceptEventAction;
import uml.activities.ObjectFlow;
import utils.library.FoundationalModelLibraryModel;
import uml.simpleclassifiers.Reception;
import utils.environment.InMemoryModel;
import uml.values.LiteralInteger;
import uml.packages.Package;
import uml.structuredclassifiers.Port;
import uml.commonbehavior.Trigger;
import uml.actions.SendSignalAction;


/* Start of user code : User-defined imports
 * This section may be used for imports.
 * It will not be overwritten by future generation processes.
 */

/*
 * End of user code
 */

public class SignalCommonModel extends InMemoryModel
{
	private static SignalCommonModel instance;

	/*
	 * Model SignalCommon
	 */
	public Package SignalCommon = new Package();
		public SignalEvent SignalCommon_ContinueEvent = new SignalEvent();
		public Association SignalCommon_R = new Association();
			public Property SignalCommon_R_x = new Property();
			public Property SignalCommon_R_y = new Property();
		public Signal SignalCommon_Start = new Signal();
			public Property SignalCommon_Start_testCase = new Property();
		public Class_ SignalCommon_I = new Class_();
		public PackageImport SignalCommon_PackageImport0 = new PackageImport();
		public Signal SignalCommon_S = new Signal();
			public Property SignalCommon_S_value = new Property();
		public SignalEvent SignalCommon_StartEvent = new SignalEvent();
		public Comment SignalCommon_Comment1 = new Comment();
		public Class_ SignalCommon_A = new Class_();
			public Property SignalCommon_A_v = new Property();
			public Activity SignalCommon_A_AClassifierBehavior = new Activity();
				public AddStructuralFeatureValueAction SignalCommon_A_AClassifierBehavior_Set_v = new AddStructuralFeatureValueAction();
					public InputPin SignalCommon_A_AClassifierBehavior_Set_v_object = new InputPin();
						public LiteralUnlimitedNatural SignalCommon_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural2 = new LiteralUnlimitedNatural();
						public LiteralInteger SignalCommon_A_AClassifierBehavior_Set_v_object_LiteralInteger3 = new LiteralInteger();
					public OutputPin SignalCommon_A_AClassifierBehavior_Set_v_result = new OutputPin();
						public LiteralUnlimitedNatural SignalCommon_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural4 = new LiteralUnlimitedNatural();
						public LiteralInteger SignalCommon_A_AClassifierBehavior_Set_v_result_LiteralInteger5 = new LiteralInteger();
					public InputPin SignalCommon_A_AClassifierBehavior_Set_v_value = new InputPin();
						public LiteralUnlimitedNatural SignalCommon_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural6 = new LiteralUnlimitedNatural();
						public LiteralInteger SignalCommon_A_AClassifierBehavior_Set_v_value_LiteralInteger7 = new LiteralInteger();
				public ControlFlow SignalCommon_A_AClassifierBehavior_ControlFlow8 = new ControlFlow();
				public ActivityFinalNode SignalCommon_A_AClassifierBehavior_ActivityFinalNode9 = new ActivityFinalNode();
				public ObjectFlow SignalCommon_A_AClassifierBehavior_ObjectFlow10 = new ObjectFlow();
					public LiteralBoolean SignalCommon_A_AClassifierBehavior_ObjectFlow10_LiteralBoolean11 = new LiteralBoolean();
					public LiteralInteger SignalCommon_A_AClassifierBehavior_ObjectFlow10_LiteralInteger12 = new LiteralInteger();
				public ObjectFlow SignalCommon_A_AClassifierBehavior_ObjectFlow13 = new ObjectFlow();
					public LiteralBoolean SignalCommon_A_AClassifierBehavior_ObjectFlow13_LiteralBoolean14 = new LiteralBoolean();
					public LiteralInteger SignalCommon_A_AClassifierBehavior_ObjectFlow13_LiteralInteger15 = new LiteralInteger();
				public ObjectFlow SignalCommon_A_AClassifierBehavior_ObjectFlow16 = new ObjectFlow();
					public LiteralInteger SignalCommon_A_AClassifierBehavior_ObjectFlow16_LiteralInteger17 = new LiteralInteger();
					public LiteralBoolean SignalCommon_A_AClassifierBehavior_ObjectFlow16_LiteralBoolean18 = new LiteralBoolean();
				public SendSignalAction SignalCommon_A_AClassifierBehavior_Send_Continue = new SendSignalAction();
					public InputPin SignalCommon_A_AClassifierBehavior_Send_Continue_target = new InputPin();
						public LiteralInteger SignalCommon_A_AClassifierBehavior_Send_Continue_target_LiteralInteger19 = new LiteralInteger();
						public LiteralUnlimitedNatural SignalCommon_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural20 = new LiteralUnlimitedNatural();
				public ReadSelfAction SignalCommon_A_AClassifierBehavior_this = new ReadSelfAction();
					public OutputPin SignalCommon_A_AClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger SignalCommon_A_AClassifierBehavior_this_result_LiteralInteger21 = new LiteralInteger();
						public LiteralUnlimitedNatural SignalCommon_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural22 = new LiteralUnlimitedNatural();
				public AcceptEventAction SignalCommon_A_AClassifierBehavior_Accept_S = new AcceptEventAction();
					public Trigger SignalCommon_A_AClassifierBehavior_Accept_S_Trigger23 = new Trigger();
					public OutputPin SignalCommon_A_AClassifierBehavior_Accept_S_value = new OutputPin();
						public LiteralInteger SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralInteger24 = new LiteralInteger();
						public LiteralInteger SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralInteger25 = new LiteralInteger();
						public LiteralUnlimitedNatural SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural26 = new LiteralUnlimitedNatural();
				public ControlFlow SignalCommon_A_AClassifierBehavior_ControlFlow27 = new ControlFlow();
			public Operation SignalCommon_A_A_A = new Operation();
				public Parameter SignalCommon_A_A_A_result = new Parameter();
			public Port SignalCommon_A_p = new Port();
		public SignalEvent SignalCommon_SEvent = new SignalEvent();
		public Class_ SignalCommon_TestCase = new Class_();
			public Operation SignalCommon_TestCase_test = new Operation();
		public Signal SignalCommon_Continue = new Signal();
		public Class_ SignalCommon_Tester = new Class_();
			public Operation SignalCommon_Tester_Tester_Tester = new Operation();
				public Parameter SignalCommon_Tester_Tester_Tester_result = new Parameter();
			public Activity SignalCommon_Tester_TesterClassifierBehavior = new Activity();
				public ActivityFinalNode SignalCommon_Tester_TesterClassifierBehavior_ActivityFinalNode28 = new ActivityFinalNode();
				public ObjectFlow SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29 = new ObjectFlow();
					public LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralInteger30 = new LiteralInteger();
					public LiteralBoolean SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralBoolean31 = new LiteralBoolean();
				public ObjectFlow SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32 = new ObjectFlow();
					public LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32_LiteralInteger33 = new LiteralInteger();
					public LiteralBoolean SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32_LiteralBoolean34 = new LiteralBoolean();
				public AcceptEventAction SignalCommon_Tester_TesterClassifierBehavior_Accept_Start = new AcceptEventAction();
					public Trigger SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_Trigger35 = new Trigger();
					public OutputPin SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase = new OutputPin();
						public LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger36 = new LiteralInteger();
						public LiteralUnlimitedNatural SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural37 = new LiteralUnlimitedNatural();
						public LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger38 = new LiteralInteger();
				public ControlFlow SignalCommon_Tester_TesterClassifierBehavior_ControlFlow39 = new ControlFlow();
				public AcceptEventAction SignalCommon_Tester_TesterClassifierBehavior_Accept_Continue = new AcceptEventAction();
				public ValueSpecificationAction SignalCommon_Tester_TesterClassifierBehavior_Value_4 = new ValueSpecificationAction();
					public OutputPin SignalCommon_Tester_TesterClassifierBehavior_Value_4_result = new OutputPin();
						public LiteralUnlimitedNatural SignalCommon_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural40 = new LiteralUnlimitedNatural();
						public LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger41 = new LiteralInteger();
					public LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Value_4_LiteralInteger42 = new LiteralInteger();
				public ReadSelfAction SignalCommon_Tester_TesterClassifierBehavior_this = new ReadSelfAction();
					public OutputPin SignalCommon_Tester_TesterClassifierBehavior_this_result = new OutputPin();
						public LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_this_result_LiteralInteger43 = new LiteralInteger();
						public LiteralUnlimitedNatural SignalCommon_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural44 = new LiteralUnlimitedNatural();
				public ControlFlow SignalCommon_Tester_TesterClassifierBehavior_ControlFlow45 = new ControlFlow();
				public SendSignalAction SignalCommon_Tester_TesterClassifierBehavior_Send_S = new SendSignalAction();
					public InputPin SignalCommon_Tester_TesterClassifierBehavior_Send_S_value = new InputPin();
						public LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger46 = new LiteralInteger();
						public LiteralUnlimitedNatural SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural47 = new LiteralUnlimitedNatural();
						public LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger48 = new LiteralInteger();
					public InputPin SignalCommon_Tester_TesterClassifierBehavior_Send_S_target = new InputPin();
						public LiteralUnlimitedNatural SignalCommon_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural49 = new LiteralUnlimitedNatural();
						public LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger50 = new LiteralInteger();
				public CallOperationAction SignalCommon_Tester_TesterClassifierBehavior_Call_test_ = new CallOperationAction();
					public InputPin SignalCommon_Tester_TesterClassifierBehavior_Call_test__target = new InputPin();
						public LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger51 = new LiteralInteger();
						public LiteralUnlimitedNatural SignalCommon_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural52 = new LiteralUnlimitedNatural();
				public ControlFlow SignalCommon_Tester_TesterClassifierBehavior_ControlFlow53 = new ControlFlow();
				public ObjectFlow SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54 = new ObjectFlow();
					public LiteralBoolean SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralBoolean55 = new LiteralBoolean();
					public LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralInteger56 = new LiteralInteger();
				public ControlFlow SignalCommon_Tester_TesterClassifierBehavior_ControlFlow57 = new ControlFlow();
			public Reception SignalCommon_Tester_Start = new Reception();
			public Port SignalCommon_Tester_q = new Port();

	public static SignalCommonModel instance()
	{
		if (instance == null)
        {
            instance = new SignalCommonModel();
            instance.initializeInMemoryModel();
        }

        return instance;
	}

	public SignalCommonModel()
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
		this.initializeAcceptEventAction_Instances();
		this.initializeActivity_Instances();
		this.initializeActivityFinalNode_Instances();
		this.initializeAddStructuralFeatureValueAction_Instances();
		this.initializeAssociation_Instances();
		this.initializeCallOperationAction_Instances();
		this.initializeClass_Instances();
		this.initializeComment_Instances();
		this.initializeControlFlow_Instances();
		this.initializeInputPin_Instances();
		this.initializeLiteralBoolean_Instances();
		this.initializeLiteralInteger_Instances();
		this.initializeLiteralUnlimitedNatural_Instances();
		this.initializeObjectFlow_Instances();
		this.initializeOperation_Instances();
		this.initializeOutputPin_Instances();
		this.initializePackageImport_Instances();
		this.initializeParameter_Instances();
		this.initializePort_Instances();
		this.initializeProperty_Instances();
		this.initializeReadSelfAction_Instances();
		this.initializeReception_Instances();
		this.initializeSendSignalAction_Instances();
		this.initializeSignal_Instances();
		this.initializeSignalEvent_Instances();
		this.initializeTrigger_Instances();
		this.initializeValueSpecificationAction_Instances();
	}

	private void initializeAcceptEventAction_Instances()
	{
		// AcceptEventAction SignalCommon_Tester_TesterClassifierBehavior::Accept Start
		addToElementRepository("Accept Start", SignalCommon_Tester_TesterClassifierBehavior_Accept_Start);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start.setName("Accept Start");
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start.setIsUnmarshall(true);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start.addResult(SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start.addTrigger(SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_Trigger35);
		// AcceptEventAction SignalCommon_A_AClassifierBehavior::Accept S
		addToElementRepository("Accept S", SignalCommon_A_AClassifierBehavior_Accept_S);
		SignalCommon_A_AClassifierBehavior_Accept_S.setName("Accept S");
		SignalCommon_A_AClassifierBehavior_Accept_S.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Accept_S.setIsUnmarshall(true);
		SignalCommon_A_AClassifierBehavior_Accept_S.addResult(SignalCommon_A_AClassifierBehavior_Accept_S_value);
		SignalCommon_A_AClassifierBehavior_Accept_S.addTrigger(SignalCommon_A_AClassifierBehavior_Accept_S_Trigger23);
		// AcceptEventAction SignalCommon_Tester_TesterClassifierBehavior::Accept Continue
		addToElementRepository("Accept Continue", SignalCommon_Tester_TesterClassifierBehavior_Accept_Continue);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Continue.setName("Accept Continue");
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Continue.setVisibility(VisibilityKind.public_);
	}

	private void initializeActivity_Instances()
	{
		// Activity SignalCommon_A::AClassifierBehavior
		addToElementRepository("AClassifierBehavior", SignalCommon_A_AClassifierBehavior);
		SignalCommon_A_AClassifierBehavior.setName("AClassifierBehavior");
		SignalCommon_A_AClassifierBehavior.setVisibility(VisibilityKind.public_);
		
		SignalCommon_A_AClassifierBehavior.isReentrant = false;
		SignalCommon_A_AClassifierBehavior.addNode(SignalCommon_A_AClassifierBehavior_Set_v);
		SignalCommon_A_AClassifierBehavior.addNode(SignalCommon_A_AClassifierBehavior_ActivityFinalNode9);
		SignalCommon_A_AClassifierBehavior.addNode(SignalCommon_A_AClassifierBehavior_Send_Continue);
		SignalCommon_A_AClassifierBehavior.addNode(SignalCommon_A_AClassifierBehavior_this);
		SignalCommon_A_AClassifierBehavior.addNode(SignalCommon_A_AClassifierBehavior_Accept_S);
		SignalCommon_A_AClassifierBehavior.addEdge(SignalCommon_A_AClassifierBehavior_ControlFlow8);
		SignalCommon_A_AClassifierBehavior.addEdge(SignalCommon_A_AClassifierBehavior_ObjectFlow10);
		SignalCommon_A_AClassifierBehavior.addEdge(SignalCommon_A_AClassifierBehavior_ObjectFlow13);
		SignalCommon_A_AClassifierBehavior.addEdge(SignalCommon_A_AClassifierBehavior_ObjectFlow16);
		SignalCommon_A_AClassifierBehavior.addEdge(SignalCommon_A_AClassifierBehavior_ControlFlow27);
		// Activity SignalCommon_Tester::TesterClassifierBehavior
		addToElementRepository("TesterClassifierBehavior", SignalCommon_Tester_TesterClassifierBehavior);
		SignalCommon_Tester_TesterClassifierBehavior.setName("TesterClassifierBehavior");
		SignalCommon_Tester_TesterClassifierBehavior.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Tester_TesterClassifierBehavior.isReentrant = false;
		SignalCommon_Tester_TesterClassifierBehavior.addNode(SignalCommon_Tester_TesterClassifierBehavior_this);
		SignalCommon_Tester_TesterClassifierBehavior.addNode(SignalCommon_Tester_TesterClassifierBehavior_Send_S);
		SignalCommon_Tester_TesterClassifierBehavior.addNode(SignalCommon_Tester_TesterClassifierBehavior_Call_test_);
		SignalCommon_Tester_TesterClassifierBehavior.addNode(SignalCommon_Tester_TesterClassifierBehavior_ActivityFinalNode28);
		SignalCommon_Tester_TesterClassifierBehavior.addNode(SignalCommon_Tester_TesterClassifierBehavior_Accept_Start);
		SignalCommon_Tester_TesterClassifierBehavior.addNode(SignalCommon_Tester_TesterClassifierBehavior_Accept_Continue);
		SignalCommon_Tester_TesterClassifierBehavior.addNode(SignalCommon_Tester_TesterClassifierBehavior_Value_4);
		SignalCommon_Tester_TesterClassifierBehavior.addEdge(SignalCommon_Tester_TesterClassifierBehavior_ControlFlow45);
		SignalCommon_Tester_TesterClassifierBehavior.addEdge(SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29);
		SignalCommon_Tester_TesterClassifierBehavior.addEdge(SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32);
		SignalCommon_Tester_TesterClassifierBehavior.addEdge(SignalCommon_Tester_TesterClassifierBehavior_ControlFlow53);
		SignalCommon_Tester_TesterClassifierBehavior.addEdge(SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54);
		SignalCommon_Tester_TesterClassifierBehavior.addEdge(SignalCommon_Tester_TesterClassifierBehavior_ControlFlow39);
		SignalCommon_Tester_TesterClassifierBehavior.addEdge(SignalCommon_Tester_TesterClassifierBehavior_ControlFlow57);
	}

	private void initializeActivityFinalNode_Instances()
	{
		// ActivityFinalNode SignalCommon_A_AClassifierBehavior::ActivityFinalNode9
		addToElementRepository("ActivityFinalNode9", SignalCommon_A_AClassifierBehavior_ActivityFinalNode9);
		SignalCommon_A_AClassifierBehavior_ActivityFinalNode9.setName("ActivityFinalNode9");
		SignalCommon_A_AClassifierBehavior_ActivityFinalNode9.setVisibility(VisibilityKind.public_);
		// ActivityFinalNode SignalCommon_Tester_TesterClassifierBehavior::ActivityFinalNode28
		addToElementRepository("ActivityFinalNode28", SignalCommon_Tester_TesterClassifierBehavior_ActivityFinalNode28);
		SignalCommon_Tester_TesterClassifierBehavior_ActivityFinalNode28.setName("ActivityFinalNode28");
		SignalCommon_Tester_TesterClassifierBehavior_ActivityFinalNode28.setVisibility(VisibilityKind.public_);
	}

	private void initializeAddStructuralFeatureValueAction_Instances()
	{
		// AddStructuralFeatureValueAction SignalCommon_A_AClassifierBehavior::Set v
		addToElementRepository("Set v", SignalCommon_A_AClassifierBehavior_Set_v);
		SignalCommon_A_AClassifierBehavior_Set_v.setName("Set v");
		SignalCommon_A_AClassifierBehavior_Set_v.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Set_v.setStructuralFeature(SignalCommon_A_v);
		SignalCommon_A_AClassifierBehavior_Set_v.setObject(SignalCommon_A_AClassifierBehavior_Set_v_object);
		SignalCommon_A_AClassifierBehavior_Set_v.setValue(SignalCommon_A_AClassifierBehavior_Set_v_value);
		SignalCommon_A_AClassifierBehavior_Set_v.setResult(SignalCommon_A_AClassifierBehavior_Set_v_result);
	}

	private void initializeAssociation_Instances()
	{
		// Association SignalCommon::R
		addToElementRepository("R", SignalCommon_R);
		SignalCommon_R.setName("R");
		SignalCommon_R.setVisibility(VisibilityKind.public_);
		SignalCommon_R.addOwnedEnd(SignalCommon_R_x);
		SignalCommon_R.addOwnedEnd(SignalCommon_R_y);
	}

	private void initializeCallOperationAction_Instances()
	{
		// CallOperationAction SignalCommon_Tester_TesterClassifierBehavior::Call test()
		addToElementRepository("Call test()", SignalCommon_Tester_TesterClassifierBehavior_Call_test_);
		SignalCommon_Tester_TesterClassifierBehavior_Call_test_.setName("Call test()");
		SignalCommon_Tester_TesterClassifierBehavior_Call_test_.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Call_test_.setOperation(SignalCommon_TestCase_test);
		SignalCommon_Tester_TesterClassifierBehavior_Call_test_.setTarget(SignalCommon_Tester_TesterClassifierBehavior_Call_test__target);
	}

	private void initializeClass_Instances()
	{
		// Class SignalCommon::A
		addToElementRepository("A", SignalCommon_A);
		SignalCommon_A.setName("A");
		SignalCommon_A.setVisibility(VisibilityKind.public_);
		
		SignalCommon_A.addOwnedAttribute(SignalCommon_A_v);
		SignalCommon_A.addOwnedAttribute(SignalCommon_A_p);
		SignalCommon_A.setClassifierBehavior(SignalCommon_A_AClassifierBehavior);
		SignalCommon_A.addOwnedBehavior(SignalCommon_A_AClassifierBehavior);
		
		SignalCommon_A.setIsActive(true);
		SignalCommon_A.addOwnedOperation(SignalCommon_A_A_A);
		// Class SignalCommon::I
		addToElementRepository("I", SignalCommon_I);
		SignalCommon_I.setName("I");
		SignalCommon_I.setVisibility(VisibilityKind.public_);
		// Class SignalCommon::TestCase
		addToElementRepository("TestCase", SignalCommon_TestCase);
		SignalCommon_TestCase.setName("TestCase");
		SignalCommon_TestCase.setVisibility(VisibilityKind.public_);
		
		SignalCommon_TestCase.setIsAbstract(true);
		
		
		SignalCommon_TestCase.addOwnedOperation(SignalCommon_TestCase_test);
		// Class SignalCommon::Tester
		addToElementRepository("Tester", SignalCommon_Tester);
		SignalCommon_Tester.setName("Tester");
		SignalCommon_Tester.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Tester.addOwnedAttribute(SignalCommon_Tester_q);
		SignalCommon_Tester.setClassifierBehavior(SignalCommon_Tester_TesterClassifierBehavior);
		SignalCommon_Tester.addOwnedBehavior(SignalCommon_Tester_TesterClassifierBehavior);
		
		SignalCommon_Tester.setIsActive(true);
		SignalCommon_Tester.addOwnedOperation(SignalCommon_Tester_Tester_Tester);
		SignalCommon_Tester.addOwnedReception(SignalCommon_Tester_Start);
	}

	private void initializeComment_Instances()
	{
		// Comment SignalCommon::Comment1
		addToElementRepository("Comment1", SignalCommon_Comment1);
		// Initialization is currently unimplemented for metaclass Comment
	}

	private void initializeControlFlow_Instances()
	{
		// ControlFlow SignalCommon_Tester_TesterClassifierBehavior::ControlFlow45
		addToElementRepository("ControlFlow45", SignalCommon_Tester_TesterClassifierBehavior_ControlFlow45);
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow45.setName("ControlFlow45");
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow45.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow45.setSource(SignalCommon_Tester_TesterClassifierBehavior_Accept_Continue);
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow45.setTarget(SignalCommon_Tester_TesterClassifierBehavior_Call_test_);
		// ControlFlow SignalCommon_A_AClassifierBehavior::ControlFlow8
		addToElementRepository("ControlFlow8", SignalCommon_A_AClassifierBehavior_ControlFlow8);
		SignalCommon_A_AClassifierBehavior_ControlFlow8.setName("ControlFlow8");
		SignalCommon_A_AClassifierBehavior_ControlFlow8.setVisibility(VisibilityKind.public_);
		
		SignalCommon_A_AClassifierBehavior_ControlFlow8.setSource(SignalCommon_A_AClassifierBehavior_Accept_S);
		SignalCommon_A_AClassifierBehavior_ControlFlow8.setTarget(SignalCommon_A_AClassifierBehavior_this);
		// ControlFlow SignalCommon_Tester_TesterClassifierBehavior::ControlFlow53
		addToElementRepository("ControlFlow53", SignalCommon_Tester_TesterClassifierBehavior_ControlFlow53);
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow53.setName("ControlFlow53");
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow53.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow53.setSource(SignalCommon_Tester_TesterClassifierBehavior_Send_S);
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow53.setTarget(SignalCommon_Tester_TesterClassifierBehavior_Accept_Continue);
		// ControlFlow SignalCommon_A_AClassifierBehavior::ControlFlow27
		addToElementRepository("ControlFlow27", SignalCommon_A_AClassifierBehavior_ControlFlow27);
		SignalCommon_A_AClassifierBehavior_ControlFlow27.setName("ControlFlow27");
		SignalCommon_A_AClassifierBehavior_ControlFlow27.setVisibility(VisibilityKind.public_);
		
		SignalCommon_A_AClassifierBehavior_ControlFlow27.setSource(SignalCommon_A_AClassifierBehavior_Send_Continue);
		SignalCommon_A_AClassifierBehavior_ControlFlow27.setTarget(SignalCommon_A_AClassifierBehavior_ActivityFinalNode9);
		// ControlFlow SignalCommon_Tester_TesterClassifierBehavior::ControlFlow39
		addToElementRepository("ControlFlow39", SignalCommon_Tester_TesterClassifierBehavior_ControlFlow39);
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow39.setName("ControlFlow39");
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow39.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow39.setSource(SignalCommon_Tester_TesterClassifierBehavior_Call_test_);
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow39.setTarget(SignalCommon_Tester_TesterClassifierBehavior_ActivityFinalNode28);
		// ControlFlow SignalCommon_Tester_TesterClassifierBehavior::ControlFlow57
		addToElementRepository("ControlFlow57", SignalCommon_Tester_TesterClassifierBehavior_ControlFlow57);
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow57.setName("ControlFlow57");
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow57.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow57.setSource(SignalCommon_Tester_TesterClassifierBehavior_Accept_Start);
		SignalCommon_Tester_TesterClassifierBehavior_ControlFlow57.setTarget(SignalCommon_Tester_TesterClassifierBehavior_this);
	}

	private void initializeInputPin_Instances()
	{
		// InputPin SignalCommon_A_AClassifierBehavior_Set v::object
		addToElementRepository("object", SignalCommon_A_AClassifierBehavior_Set_v_object);
		SignalCommon_A_AClassifierBehavior_Set_v_object.setName("object");
		SignalCommon_A_AClassifierBehavior_Set_v_object.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Set_v_object.setType(SignalCommon_A);
		// InputPin SignalCommon_A_AClassifierBehavior_Send Continue::target
		addToElementRepository("target", SignalCommon_A_AClassifierBehavior_Send_Continue_target);
		SignalCommon_A_AClassifierBehavior_Send_Continue_target.setName("target");
		SignalCommon_A_AClassifierBehavior_Send_Continue_target.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Send_Continue_target.setType(SignalCommon_A);
		// InputPin SignalCommon_Tester_TesterClassifierBehavior_Send S::target
		addToElementRepository("target", SignalCommon_Tester_TesterClassifierBehavior_Send_S_target);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_target.setName("target");
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_target.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_target.setType(SignalCommon_Tester);
		// InputPin SignalCommon_Tester_TesterClassifierBehavior_Send S::value
		addToElementRepository("value", SignalCommon_Tester_TesterClassifierBehavior_Send_S_value);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_value.setName("value");
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_value.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin SignalCommon_A_AClassifierBehavior_Set v::value
		addToElementRepository("value", SignalCommon_A_AClassifierBehavior_Set_v_value);
		SignalCommon_A_AClassifierBehavior_Set_v_value.setName("value");
		SignalCommon_A_AClassifierBehavior_Set_v_value.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Set_v_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// InputPin SignalCommon_Tester_TesterClassifierBehavior_Call test()::target
		addToElementRepository("target", SignalCommon_Tester_TesterClassifierBehavior_Call_test__target);
		SignalCommon_Tester_TesterClassifierBehavior_Call_test__target.setName("target");
		SignalCommon_Tester_TesterClassifierBehavior_Call_test__target.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Call_test__target.setType(SignalCommon_TestCase);
	}

	private void initializeLiteralBoolean_Instances()
	{
		// LiteralBoolean SignalCommon_A_AClassifierBehavior_ObjectFlow10::LiteralBoolean11
		addToElementRepository("LiteralBoolean11", SignalCommon_A_AClassifierBehavior_ObjectFlow10_LiteralBoolean11);
		SignalCommon_A_AClassifierBehavior_ObjectFlow10_LiteralBoolean11.setName("LiteralBoolean11");
		SignalCommon_A_AClassifierBehavior_ObjectFlow10_LiteralBoolean11.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_ObjectFlow10_LiteralBoolean11.setValue(true);
		// LiteralBoolean SignalCommon_A_AClassifierBehavior_ObjectFlow13::LiteralBoolean14
		addToElementRepository("LiteralBoolean14", SignalCommon_A_AClassifierBehavior_ObjectFlow13_LiteralBoolean14);
		SignalCommon_A_AClassifierBehavior_ObjectFlow13_LiteralBoolean14.setName("LiteralBoolean14");
		SignalCommon_A_AClassifierBehavior_ObjectFlow13_LiteralBoolean14.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_ObjectFlow13_LiteralBoolean14.setValue(true);
		// LiteralBoolean SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54::LiteralBoolean55
		addToElementRepository("LiteralBoolean55", SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralBoolean55);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralBoolean55.setName("LiteralBoolean55");
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralBoolean55.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralBoolean55.setValue(true);
		// LiteralBoolean SignalCommon_A_AClassifierBehavior_ObjectFlow16::LiteralBoolean18
		addToElementRepository("LiteralBoolean18", SignalCommon_A_AClassifierBehavior_ObjectFlow16_LiteralBoolean18);
		SignalCommon_A_AClassifierBehavior_ObjectFlow16_LiteralBoolean18.setName("LiteralBoolean18");
		SignalCommon_A_AClassifierBehavior_ObjectFlow16_LiteralBoolean18.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_ObjectFlow16_LiteralBoolean18.setValue(true);
		// LiteralBoolean SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29::LiteralBoolean31
		addToElementRepository("LiteralBoolean31", SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralBoolean31);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralBoolean31.setName("LiteralBoolean31");
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralBoolean31.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralBoolean31.setValue(true);
		// LiteralBoolean SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32::LiteralBoolean34
		addToElementRepository("LiteralBoolean34", SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32_LiteralBoolean34);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32_LiteralBoolean34.setName("LiteralBoolean34");
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32_LiteralBoolean34.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32_LiteralBoolean34.setValue(true);
	}

	private void initializeLiteralInteger_Instances()
	{
		// LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Accept Start_testCase::LiteralInteger36
		addToElementRepository("LiteralInteger36", SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger36);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger36.setName("LiteralInteger36");
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger36.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger36.setValue(1);
		// LiteralInteger SignalCommon_A_AClassifierBehavior_ObjectFlow16::LiteralInteger17
		addToElementRepository("LiteralInteger17", SignalCommon_A_AClassifierBehavior_ObjectFlow16_LiteralInteger17);
		SignalCommon_A_AClassifierBehavior_ObjectFlow16_LiteralInteger17.setName("LiteralInteger17");
		SignalCommon_A_AClassifierBehavior_ObjectFlow16_LiteralInteger17.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_ObjectFlow16_LiteralInteger17.setValue(1);
		// LiteralInteger SignalCommon_A_AClassifierBehavior_Set v_object::LiteralInteger3
		addToElementRepository("LiteralInteger3", SignalCommon_A_AClassifierBehavior_Set_v_object_LiteralInteger3);
		SignalCommon_A_AClassifierBehavior_Set_v_object_LiteralInteger3.setName("LiteralInteger3");
		SignalCommon_A_AClassifierBehavior_Set_v_object_LiteralInteger3.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Set_v_object_LiteralInteger3.setValue(1);
		// LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32::LiteralInteger33
		addToElementRepository("LiteralInteger33", SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32_LiteralInteger33);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32_LiteralInteger33.setName("LiteralInteger33");
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32_LiteralInteger33.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32_LiteralInteger33.setValue(1);
		// LiteralInteger SignalCommon_A_AClassifierBehavior_Set v_result::LiteralInteger5
		addToElementRepository("LiteralInteger5", SignalCommon_A_AClassifierBehavior_Set_v_result_LiteralInteger5);
		SignalCommon_A_AClassifierBehavior_Set_v_result_LiteralInteger5.setName("LiteralInteger5");
		SignalCommon_A_AClassifierBehavior_Set_v_result_LiteralInteger5.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Set_v_result_LiteralInteger5.setValue(1);
		// LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Accept Start_testCase::LiteralInteger38
		addToElementRepository("LiteralInteger38", SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger38);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger38.setName("LiteralInteger38");
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger38.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralInteger38.setValue(1);
		// LiteralInteger SignalCommon_A_AClassifierBehavior_this_result::LiteralInteger21
		addToElementRepository("LiteralInteger21", SignalCommon_A_AClassifierBehavior_this_result_LiteralInteger21);
		SignalCommon_A_AClassifierBehavior_this_result_LiteralInteger21.setName("LiteralInteger21");
		SignalCommon_A_AClassifierBehavior_this_result_LiteralInteger21.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_this_result_LiteralInteger21.setValue(1);
		// LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Send S_value::LiteralInteger46
		addToElementRepository("LiteralInteger46", SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger46);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger46.setName("LiteralInteger46");
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger46.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger46.setValue(1);
		// LiteralInteger SignalCommon_A_AClassifierBehavior_ObjectFlow13::LiteralInteger15
		addToElementRepository("LiteralInteger15", SignalCommon_A_AClassifierBehavior_ObjectFlow13_LiteralInteger15);
		SignalCommon_A_AClassifierBehavior_ObjectFlow13_LiteralInteger15.setName("LiteralInteger15");
		SignalCommon_A_AClassifierBehavior_ObjectFlow13_LiteralInteger15.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_ObjectFlow13_LiteralInteger15.setValue(1);
		// LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Send S_target::LiteralInteger50
		addToElementRepository("LiteralInteger50", SignalCommon_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger50);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger50.setName("LiteralInteger50");
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger50.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_target_LiteralInteger50.setValue(1);
		// LiteralInteger SignalCommon_A_AClassifierBehavior_Send Continue_target::LiteralInteger19
		addToElementRepository("LiteralInteger19", SignalCommon_A_AClassifierBehavior_Send_Continue_target_LiteralInteger19);
		SignalCommon_A_AClassifierBehavior_Send_Continue_target_LiteralInteger19.setName("LiteralInteger19");
		SignalCommon_A_AClassifierBehavior_Send_Continue_target_LiteralInteger19.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Send_Continue_target_LiteralInteger19.setValue(1);
		// LiteralInteger SignalCommon_A_AClassifierBehavior_Set v_value::LiteralInteger7
		addToElementRepository("LiteralInteger7", SignalCommon_A_AClassifierBehavior_Set_v_value_LiteralInteger7);
		SignalCommon_A_AClassifierBehavior_Set_v_value_LiteralInteger7.setName("LiteralInteger7");
		SignalCommon_A_AClassifierBehavior_Set_v_value_LiteralInteger7.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Set_v_value_LiteralInteger7.setValue(1);
		// LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29::LiteralInteger30
		addToElementRepository("LiteralInteger30", SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralInteger30);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralInteger30.setName("LiteralInteger30");
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralInteger30.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralInteger30.setValue(1);
		// LiteralInteger SignalCommon_A_AClassifierBehavior_ObjectFlow10::LiteralInteger12
		addToElementRepository("LiteralInteger12", SignalCommon_A_AClassifierBehavior_ObjectFlow10_LiteralInteger12);
		SignalCommon_A_AClassifierBehavior_ObjectFlow10_LiteralInteger12.setName("LiteralInteger12");
		SignalCommon_A_AClassifierBehavior_ObjectFlow10_LiteralInteger12.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_ObjectFlow10_LiteralInteger12.setValue(1);
		// LiteralInteger SignalCommon_A_AClassifierBehavior_Accept S_value::LiteralInteger24
		addToElementRepository("LiteralInteger24", SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralInteger24);
		SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralInteger24.setName("LiteralInteger24");
		SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralInteger24.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralInteger24.setValue(1);
		// LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Call test()_target::LiteralInteger51
		addToElementRepository("LiteralInteger51", SignalCommon_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger51);
		SignalCommon_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger51.setName("LiteralInteger51");
		SignalCommon_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger51.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Call_test__target_LiteralInteger51.setValue(1);
		// LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_this_result::LiteralInteger43
		addToElementRepository("LiteralInteger43", SignalCommon_Tester_TesterClassifierBehavior_this_result_LiteralInteger43);
		SignalCommon_Tester_TesterClassifierBehavior_this_result_LiteralInteger43.setName("LiteralInteger43");
		SignalCommon_Tester_TesterClassifierBehavior_this_result_LiteralInteger43.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_this_result_LiteralInteger43.setValue(1);
		// LiteralInteger SignalCommon_A_AClassifierBehavior_Accept S_value::LiteralInteger25
		addToElementRepository("LiteralInteger25", SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralInteger25);
		SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralInteger25.setName("LiteralInteger25");
		SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralInteger25.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralInteger25.setValue(1);
		// LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Value(4)::LiteralInteger42
		addToElementRepository("LiteralInteger42", SignalCommon_Tester_TesterClassifierBehavior_Value_4_LiteralInteger42);
		SignalCommon_Tester_TesterClassifierBehavior_Value_4_LiteralInteger42.setName("LiteralInteger42");
		SignalCommon_Tester_TesterClassifierBehavior_Value_4_LiteralInteger42.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Value_4_LiteralInteger42.setValue(4);
		// LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Send S_value::LiteralInteger48
		addToElementRepository("LiteralInteger48", SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger48);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger48.setName("LiteralInteger48");
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger48.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralInteger48.setValue(1);
		// LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54::LiteralInteger56
		addToElementRepository("LiteralInteger56", SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralInteger56);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralInteger56.setName("LiteralInteger56");
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralInteger56.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralInteger56.setValue(1);
		// LiteralInteger SignalCommon_Tester_TesterClassifierBehavior_Value(4)_result::LiteralInteger41
		addToElementRepository("LiteralInteger41", SignalCommon_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger41);
		SignalCommon_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger41.setName("LiteralInteger41");
		SignalCommon_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger41.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Value_4_result_LiteralInteger41.setValue(1);
	}

	private void initializeLiteralUnlimitedNatural_Instances()
	{
		// LiteralUnlimitedNatural SignalCommon_A_AClassifierBehavior_Set v_value::LiteralUnlimitedNatural6
		addToElementRepository("LiteralUnlimitedNatural6", SignalCommon_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural6);
		SignalCommon_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural6.setName("LiteralUnlimitedNatural6");
		SignalCommon_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural6.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Set_v_value_LiteralUnlimitedNatural6.setValue(1);
		// LiteralUnlimitedNatural SignalCommon_A_AClassifierBehavior_Set v_object::LiteralUnlimitedNatural2
		addToElementRepository("LiteralUnlimitedNatural2", SignalCommon_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural2);
		SignalCommon_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural2.setName("LiteralUnlimitedNatural2");
		SignalCommon_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural2.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Set_v_object_LiteralUnlimitedNatural2.setValue(1);
		// LiteralUnlimitedNatural SignalCommon_Tester_TesterClassifierBehavior_Accept Start_testCase::LiteralUnlimitedNatural37
		addToElementRepository("LiteralUnlimitedNatural37", SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural37);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural37.setName("LiteralUnlimitedNatural37");
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural37.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase_LiteralUnlimitedNatural37.setValue(1);
		// LiteralUnlimitedNatural SignalCommon_Tester_TesterClassifierBehavior_Send S_target::LiteralUnlimitedNatural49
		addToElementRepository("LiteralUnlimitedNatural49", SignalCommon_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural49);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural49.setName("LiteralUnlimitedNatural49");
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural49.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_target_LiteralUnlimitedNatural49.setValue(1);
		// LiteralUnlimitedNatural SignalCommon_A_AClassifierBehavior_Set v_result::LiteralUnlimitedNatural4
		addToElementRepository("LiteralUnlimitedNatural4", SignalCommon_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural4);
		SignalCommon_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural4.setName("LiteralUnlimitedNatural4");
		SignalCommon_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural4.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Set_v_result_LiteralUnlimitedNatural4.setValue(1);
		// LiteralUnlimitedNatural SignalCommon_A_AClassifierBehavior_Send Continue_target::LiteralUnlimitedNatural20
		addToElementRepository("LiteralUnlimitedNatural20", SignalCommon_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural20);
		SignalCommon_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural20.setName("LiteralUnlimitedNatural20");
		SignalCommon_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural20.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Send_Continue_target_LiteralUnlimitedNatural20.setValue(1);
		// LiteralUnlimitedNatural SignalCommon_Tester_TesterClassifierBehavior_Value(4)_result::LiteralUnlimitedNatural40
		addToElementRepository("LiteralUnlimitedNatural40", SignalCommon_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural40);
		SignalCommon_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural40.setName("LiteralUnlimitedNatural40");
		SignalCommon_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural40.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Value_4_result_LiteralUnlimitedNatural40.setValue(1);
		// LiteralUnlimitedNatural SignalCommon_Tester_TesterClassifierBehavior_Send S_value::LiteralUnlimitedNatural47
		addToElementRepository("LiteralUnlimitedNatural47", SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural47);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural47.setName("LiteralUnlimitedNatural47");
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural47.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S_value_LiteralUnlimitedNatural47.setValue(1);
		// LiteralUnlimitedNatural SignalCommon_A_AClassifierBehavior_this_result::LiteralUnlimitedNatural22
		addToElementRepository("LiteralUnlimitedNatural22", SignalCommon_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural22);
		SignalCommon_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural22.setName("LiteralUnlimitedNatural22");
		SignalCommon_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural22.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_this_result_LiteralUnlimitedNatural22.setValue(1);
		// LiteralUnlimitedNatural SignalCommon_Tester_TesterClassifierBehavior_this_result::LiteralUnlimitedNatural44
		addToElementRepository("LiteralUnlimitedNatural44", SignalCommon_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural44);
		SignalCommon_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural44.setName("LiteralUnlimitedNatural44");
		SignalCommon_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural44.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_this_result_LiteralUnlimitedNatural44.setValue(1);
		// LiteralUnlimitedNatural SignalCommon_Tester_TesterClassifierBehavior_Call test()_target::LiteralUnlimitedNatural52
		addToElementRepository("LiteralUnlimitedNatural52", SignalCommon_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural52);
		SignalCommon_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural52.setName("LiteralUnlimitedNatural52");
		SignalCommon_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural52.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Call_test__target_LiteralUnlimitedNatural52.setValue(1);
		// LiteralUnlimitedNatural SignalCommon_A_AClassifierBehavior_Accept S_value::LiteralUnlimitedNatural26
		addToElementRepository("LiteralUnlimitedNatural26", SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural26);
		SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural26.setName("LiteralUnlimitedNatural26");
		SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural26.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Accept_S_value_LiteralUnlimitedNatural26.setValue(1);
	}

	private void initializeObjectFlow_Instances()
	{
		// ObjectFlow SignalCommon_A_AClassifierBehavior::ObjectFlow10
		addToElementRepository("ObjectFlow10", SignalCommon_A_AClassifierBehavior_ObjectFlow10);
		SignalCommon_A_AClassifierBehavior_ObjectFlow10.setName("ObjectFlow10");
		SignalCommon_A_AClassifierBehavior_ObjectFlow10.setVisibility(VisibilityKind.public_);
		
		SignalCommon_A_AClassifierBehavior_ObjectFlow10.setSource(SignalCommon_A_AClassifierBehavior_this_result);
		SignalCommon_A_AClassifierBehavior_ObjectFlow10.setTarget(SignalCommon_A_AClassifierBehavior_Set_v_object);
		SignalCommon_A_AClassifierBehavior_ObjectFlow10.setGuard(SignalCommon_A_AClassifierBehavior_ObjectFlow10_LiteralBoolean11);
		// ObjectFlow SignalCommon_Tester_TesterClassifierBehavior::ObjectFlow29
		addToElementRepository("ObjectFlow29", SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29.setName("ObjectFlow29");
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29.setSource(SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29.setTarget(SignalCommon_Tester_TesterClassifierBehavior_Call_test__target);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29.setGuard(SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow29_LiteralBoolean31);
		// ObjectFlow SignalCommon_Tester_TesterClassifierBehavior::ObjectFlow32
		addToElementRepository("ObjectFlow32", SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32.setName("ObjectFlow32");
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32.setSource(SignalCommon_Tester_TesterClassifierBehavior_Value_4_result);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32.setTarget(SignalCommon_Tester_TesterClassifierBehavior_Send_S_value);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32.setGuard(SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow32_LiteralBoolean34);
		// ObjectFlow SignalCommon_A_AClassifierBehavior::ObjectFlow16
		addToElementRepository("ObjectFlow16", SignalCommon_A_AClassifierBehavior_ObjectFlow16);
		SignalCommon_A_AClassifierBehavior_ObjectFlow16.setName("ObjectFlow16");
		SignalCommon_A_AClassifierBehavior_ObjectFlow16.setVisibility(VisibilityKind.public_);
		
		SignalCommon_A_AClassifierBehavior_ObjectFlow16.setSource(SignalCommon_A_AClassifierBehavior_Accept_S_value);
		SignalCommon_A_AClassifierBehavior_ObjectFlow16.setTarget(SignalCommon_A_AClassifierBehavior_Set_v_value);
		SignalCommon_A_AClassifierBehavior_ObjectFlow16.setGuard(SignalCommon_A_AClassifierBehavior_ObjectFlow16_LiteralBoolean18);
		// ObjectFlow SignalCommon_A_AClassifierBehavior::ObjectFlow13
		addToElementRepository("ObjectFlow13", SignalCommon_A_AClassifierBehavior_ObjectFlow13);
		SignalCommon_A_AClassifierBehavior_ObjectFlow13.setName("ObjectFlow13");
		SignalCommon_A_AClassifierBehavior_ObjectFlow13.setVisibility(VisibilityKind.public_);
		
		SignalCommon_A_AClassifierBehavior_ObjectFlow13.setSource(SignalCommon_A_AClassifierBehavior_Set_v_result);
		SignalCommon_A_AClassifierBehavior_ObjectFlow13.setTarget(SignalCommon_A_AClassifierBehavior_Send_Continue_target);
		SignalCommon_A_AClassifierBehavior_ObjectFlow13.setGuard(SignalCommon_A_AClassifierBehavior_ObjectFlow13_LiteralBoolean14);
		// ObjectFlow SignalCommon_Tester_TesterClassifierBehavior::ObjectFlow54
		addToElementRepository("ObjectFlow54", SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54.setName("ObjectFlow54");
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54.setSource(SignalCommon_Tester_TesterClassifierBehavior_this_result);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54.setTarget(SignalCommon_Tester_TesterClassifierBehavior_Send_S_target);
		SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54.setGuard(SignalCommon_Tester_TesterClassifierBehavior_ObjectFlow54_LiteralBoolean55);
	}

	private void initializeOperation_Instances()
	{
		// Operation SignalCommon_Tester::Tester_Tester
		addToElementRepository("Tester_Tester", SignalCommon_Tester_Tester_Tester);
		SignalCommon_Tester_Tester_Tester.setName("Tester");
		SignalCommon_Tester_Tester_Tester.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_Tester_Tester.addOwnedParameter(SignalCommon_Tester_Tester_Tester_result);
		SignalCommon_Tester_Tester_Tester.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation SignalCommon_A::A_A
		addToElementRepository("A_A", SignalCommon_A_A_A);
		SignalCommon_A_A_A.setName("A");
		SignalCommon_A_A_A.setVisibility(VisibilityKind.public_);
		SignalCommon_A_A_A.addOwnedParameter(SignalCommon_A_A_A_result);
		SignalCommon_A_A_A.applyStereotype(utils.standardprofile.StandardProfileModel.Instance().Stereotype_Create);
		// Operation SignalCommon_TestCase::test
		addToElementRepository("test", SignalCommon_TestCase_test);
		SignalCommon_TestCase_test.setName("test");
		SignalCommon_TestCase_test.setVisibility(VisibilityKind.public_);
		SignalCommon_TestCase_test.setIsAbstract(true);
	}

	private void initializeOutputPin_Instances()
	{
		// OutputPin SignalCommon_Tester_TesterClassifierBehavior_Value(4)::result
		addToElementRepository("result", SignalCommon_Tester_TesterClassifierBehavior_Value_4_result);
		SignalCommon_Tester_TesterClassifierBehavior_Value_4_result.setName("result");
		SignalCommon_Tester_TesterClassifierBehavior_Value_4_result.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Value_4_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin SignalCommon_A_AClassifierBehavior_Accept S::value
		addToElementRepository("value", SignalCommon_A_AClassifierBehavior_Accept_S_value);
		SignalCommon_A_AClassifierBehavior_Accept_S_value.setName("value");
		SignalCommon_A_AClassifierBehavior_Accept_S_value.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Accept_S_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// OutputPin SignalCommon_A_AClassifierBehavior_this::result
		addToElementRepository("result", SignalCommon_A_AClassifierBehavior_this_result);
		SignalCommon_A_AClassifierBehavior_this_result.setName("result");
		SignalCommon_A_AClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_this_result.setType(SignalCommon_A);
		// OutputPin SignalCommon_A_AClassifierBehavior_Set v::result
		addToElementRepository("result", SignalCommon_A_AClassifierBehavior_Set_v_result);
		SignalCommon_A_AClassifierBehavior_Set_v_result.setName("result");
		SignalCommon_A_AClassifierBehavior_Set_v_result.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Set_v_result.setType(SignalCommon_A);
		// OutputPin SignalCommon_Tester_TesterClassifierBehavior_this::result
		addToElementRepository("result", SignalCommon_Tester_TesterClassifierBehavior_this_result);
		SignalCommon_Tester_TesterClassifierBehavior_this_result.setName("result");
		SignalCommon_Tester_TesterClassifierBehavior_this_result.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_this_result.setType(SignalCommon_Tester);
		// OutputPin SignalCommon_Tester_TesterClassifierBehavior_Accept Start::testCase
		addToElementRepository("testCase", SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase.setName("testCase");
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_testCase.setType(SignalCommon_TestCase);
	}

	private void initializePackageImport_Instances()
	{
		// PackageImport SignalCommon::PackageImport0
		addToElementRepository("PackageImport0", SignalCommon_PackageImport0);
		// Initialization is currently unimplemented for metaclass PackageImport
	}

	private void initializeParameter_Instances()
	{
		// Parameter SignalCommon_A_A_A::result
		addToElementRepository("result", SignalCommon_A_A_A_result);
		SignalCommon_A_A_A_result.setName("result");
		SignalCommon_A_A_A_result.setVisibility(VisibilityKind.public_);
		
		SignalCommon_A_A_A_result.setType(SignalCommon_A);
		SignalCommon_A_A_A_result.setDirection(ParameterDirectionKind.return_);
		// Parameter SignalCommon_Tester_Tester_Tester::result
		addToElementRepository("result", SignalCommon_Tester_Tester_Tester_result);
		SignalCommon_Tester_Tester_Tester_result.setName("result");
		SignalCommon_Tester_Tester_Tester_result.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Tester_Tester_Tester_result.setType(SignalCommon_Tester);
		SignalCommon_Tester_Tester_Tester_result.setDirection(ParameterDirectionKind.return_);
	}

	private void initializePort_Instances()
	{
		// Port SignalCommon_A::p
		addToElementRepository("p", SignalCommon_A_p);
		SignalCommon_A_p.setName("p");
		SignalCommon_A_p.setVisibility(VisibilityKind.public_);
		
		SignalCommon_A_p.setType(SignalCommon_I);
		SignalCommon_A_p.setAggregation(AggregationKind.composite);
		SignalCommon_A_p.isBehavior = true;
		SignalCommon_A_p.isService = true;
		// Port SignalCommon_Tester::q
		addToElementRepository("q", SignalCommon_Tester_q);
		SignalCommon_Tester_q.setName("q");
		SignalCommon_Tester_q.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Tester_q.setType(SignalCommon_I);
		SignalCommon_Tester_q.setAggregation(AggregationKind.composite);
		SignalCommon_Tester_q.isBehavior = true;
		SignalCommon_Tester_q.isService = true;
	}

	private void initializeProperty_Instances()
	{
		// Property SignalCommon_Start::testCase
		addToElementRepository("testCase", SignalCommon_Start_testCase);
		SignalCommon_Start_testCase.setName("testCase");
		SignalCommon_Start_testCase.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Start_testCase.setType(SignalCommon_TestCase);
		// Property SignalCommon_A::v
		addToElementRepository("v", SignalCommon_A_v);
		SignalCommon_A_v.setName("v");
		SignalCommon_A_v.setVisibility(VisibilityKind.public_);
		
		SignalCommon_A_v.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		SignalCommon_A_v.setAggregation(AggregationKind.shared);
		// Property SignalCommon_S::value
		addToElementRepository("value", SignalCommon_S_value);
		SignalCommon_S_value.setName("value");
		SignalCommon_S_value.setVisibility(VisibilityKind.public_);
		
		SignalCommon_S_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
		// Property SignalCommon_R::x
		addToElementRepository("x", SignalCommon_R_x);
		SignalCommon_R_x.setName("x");
		SignalCommon_R_x.setVisibility(VisibilityKind.public_);
		
		SignalCommon_R_x.setType(SignalCommon_I);
		// Property SignalCommon_R::y
		addToElementRepository("y", SignalCommon_R_y);
		SignalCommon_R_y.setName("y");
		SignalCommon_R_y.setVisibility(VisibilityKind.public_);
		
		SignalCommon_R_y.setType(SignalCommon_I);
	}

	private void initializeReadSelfAction_Instances()
	{
		// ReadSelfAction SignalCommon_Tester_TesterClassifierBehavior::this
		addToElementRepository("this", SignalCommon_Tester_TesterClassifierBehavior_this);
		SignalCommon_Tester_TesterClassifierBehavior_this.setName("this");
		SignalCommon_Tester_TesterClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_this.setResult(SignalCommon_Tester_TesterClassifierBehavior_this_result);
		// ReadSelfAction SignalCommon_A_AClassifierBehavior::this
		addToElementRepository("this", SignalCommon_A_AClassifierBehavior_this);
		SignalCommon_A_AClassifierBehavior_this.setName("this");
		SignalCommon_A_AClassifierBehavior_this.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_this.setResult(SignalCommon_A_AClassifierBehavior_this_result);
	}

	private void initializeReception_Instances()
	{
		// Reception SignalCommon_Tester::Start
		addToElementRepository("Start", SignalCommon_Tester_Start);
		SignalCommon_Tester_Start.setName("Start");
		SignalCommon_Tester_Start.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_Start.setSignal(SignalCommon_Start);
	}

	private void initializeSendSignalAction_Instances()
	{
		// SendSignalAction SignalCommon_Tester_TesterClassifierBehavior::Send S
		addToElementRepository("Send S", SignalCommon_Tester_TesterClassifierBehavior_Send_S);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S.setName("Send S");
		SignalCommon_Tester_TesterClassifierBehavior_Send_S.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S.setSignal(SignalCommon_S);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S.setTarget(SignalCommon_Tester_TesterClassifierBehavior_Send_S_target);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S.addArgument(SignalCommon_Tester_TesterClassifierBehavior_Send_S_value);
		SignalCommon_Tester_TesterClassifierBehavior_Send_S.setOnPort(SignalCommon_Tester_q);
		// SendSignalAction SignalCommon_A_AClassifierBehavior::Send Continue
		addToElementRepository("Send Continue", SignalCommon_A_AClassifierBehavior_Send_Continue);
		SignalCommon_A_AClassifierBehavior_Send_Continue.setName("Send Continue");
		SignalCommon_A_AClassifierBehavior_Send_Continue.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Send_Continue.setSignal(SignalCommon_Continue);
		SignalCommon_A_AClassifierBehavior_Send_Continue.setTarget(SignalCommon_A_AClassifierBehavior_Send_Continue_target);
		SignalCommon_A_AClassifierBehavior_Send_Continue.setOnPort(SignalCommon_A_p);
	}

	private void initializeSignal_Instances()
	{
		// Signal SignalCommon::Start
		addToElementRepository("Start", SignalCommon_Start);
		SignalCommon_Start.setName("Start");
		SignalCommon_Start.setVisibility(VisibilityKind.public_);
		
		SignalCommon_Start.addOwnedAttribute(SignalCommon_Start_testCase);
		// Signal SignalCommon::S
		addToElementRepository("S", SignalCommon_S);
		SignalCommon_S.setName("S");
		SignalCommon_S.setVisibility(VisibilityKind.public_);
		
		SignalCommon_S.addOwnedAttribute(SignalCommon_S_value);
		// Signal SignalCommon::Continue
		addToElementRepository("Continue", SignalCommon_Continue);
		SignalCommon_Continue.setName("Continue");
		SignalCommon_Continue.setVisibility(VisibilityKind.public_);
	}

	private void initializeSignalEvent_Instances()
	{
		// SignalEvent SignalCommon::ContinueEvent
		addToElementRepository("ContinueEvent", SignalCommon_ContinueEvent);
		SignalCommon_ContinueEvent.setName("ContinueEvent");
		SignalCommon_ContinueEvent.setVisibility(VisibilityKind.public_);
		SignalCommon_ContinueEvent.setSignal(SignalCommon_Continue);
		// SignalEvent SignalCommon::SEvent
		addToElementRepository("SEvent", SignalCommon_SEvent);
		SignalCommon_SEvent.setName("SEvent");
		SignalCommon_SEvent.setVisibility(VisibilityKind.public_);
		SignalCommon_SEvent.setSignal(SignalCommon_S);
		// SignalEvent SignalCommon::StartEvent
		addToElementRepository("StartEvent", SignalCommon_StartEvent);
		SignalCommon_StartEvent.setName("StartEvent");
		SignalCommon_StartEvent.setVisibility(VisibilityKind.public_);
		SignalCommon_StartEvent.setSignal(SignalCommon_Start);
	}

	private void initializeTrigger_Instances()
	{
		// Trigger SignalCommon_Tester_TesterClassifierBehavior_Accept Start::Trigger35
		addToElementRepository("Trigger35", SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_Trigger35);
		// Trigger Trigger35
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_Trigger35.setName("Trigger35");
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_Trigger35.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Accept_Start_Trigger35.setEvent(SignalCommon_StartEvent);
		// Trigger SignalCommon_A_AClassifierBehavior_Accept S::Trigger23
		addToElementRepository("Trigger23", SignalCommon_A_AClassifierBehavior_Accept_S_Trigger23);
		// Trigger Trigger23
		SignalCommon_A_AClassifierBehavior_Accept_S_Trigger23.setName("Trigger23");
		SignalCommon_A_AClassifierBehavior_Accept_S_Trigger23.setVisibility(VisibilityKind.public_);
		SignalCommon_A_AClassifierBehavior_Accept_S_Trigger23.setEvent(SignalCommon_SEvent);
	}

	private void initializeValueSpecificationAction_Instances()
	{
		// ValueSpecificationAction SignalCommon_Tester_TesterClassifierBehavior::Value(4)
		addToElementRepository("Value(4)", SignalCommon_Tester_TesterClassifierBehavior_Value_4);
		SignalCommon_Tester_TesterClassifierBehavior_Value_4.setName("Value(4)");
		SignalCommon_Tester_TesterClassifierBehavior_Value_4.setVisibility(VisibilityKind.public_);
		SignalCommon_Tester_TesterClassifierBehavior_Value_4.setValue(SignalCommon_Tester_TesterClassifierBehavior_Value_4_LiteralInteger42);
		SignalCommon_Tester_TesterClassifierBehavior_Value_4.setResult(SignalCommon_Tester_TesterClassifierBehavior_Value_4_result);
	}

	/* Start of user code : User-defined members
	 * This section may be used for user-defined members.
	 * It will not be overwritten by future generation processes.
	 */

	/*
	 * End of user code
	 */
} // SignalCommonModel
