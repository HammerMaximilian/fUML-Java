package utils.library;

import uml.actions.CallOperationAction;
import uml.actions.InputPin;
import uml.actions.OutputPin;
import uml.actions.ReadExtentAction;
import uml.activities.Activity;
import uml.activities.ActivityParameterNode;
import uml.activities.ObjectFlow;
import uml.classification.Generalization;
import uml.classification.Operation;
import uml.classification.Parameter;
import uml.classification.ParameterDirectionKind;
import uml.classification.Property;
import uml.commonbehavior.FunctionBehavior;
import uml.simpleclassifiers.DataType;
import uml.simpleclassifiers.Reception;
import uml.simpleclassifiers.Signal;
import uml.structuredclassifiers.Class_;
import utils.environment.InMemoryModel;
import utils.primitivetypes.PrimitiveTypesModel;

public class FoundationalModelLibraryModel extends InMemoryModel
{
    private static FoundationalModelLibraryModel instance;

    /*
	 * Primitive Behaviors
	 */
    /*
     * Boolean functions
     */
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_y = new Parameter();

    /*
     * Integer functions
     */
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_equals = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_equals_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_equals_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_equals_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_y = new Parameter();

    /*
     * Real Functions
     */
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_y = new Parameter();

    /*
     * String Functions
     */
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_lower = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_upper = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_x = new Parameter();

    /*
     * UnlimitedNatural Functions
     */
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural_x = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_y = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_result = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_x = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_y = new Parameter();

    /*
     * List Functions
     */
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize_list = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize_result = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_list = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_index = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_result = new Parameter();
    public FunctionBehavior FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat = new FunctionBehavior();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_list1 = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_list2 = new Parameter();
    public Parameter FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_result = new Parameter();

    /*
     * Common
     */
    /*
     * Signal Notification
     */
    public Signal FoundationalModelLibrary_Common_Notification = new Signal();
    public Property FoundationalModelLibrary_Common_Notification_content = new Property();

    /*
     * Class Listener
     */
    public Class_ FoundationalModelLibrary_Common_Listener = new Class_();
    public Reception FoundationalModelLibrary_Common_Listener_Notification = new Reception();

    /*
     * DataType Status
     */
    public DataType FoundationalModelLibrary_Common_Status = new DataType();
    public Property FoundationalModelLibrary_Common_Status_context = new Property();
    public Property FoundationalModelLibrary_Common_Status_code = new Property();
    public Property FoundationalModelLibrary_Common_Status_description = new Property();

    /*
     * BasicInputOutput
     */
    /*
     * Class Channel
     */
    public Class_ FoundationalModelLibrary_BasicInputOutput_Channel = new Class_();
    public Operation FoundationalModelLibrary_BasicInputOutput_Channel_getName = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_Channel_getName_ReturnResult = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_Channel_open = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_Channel_open_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_Channel_close = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_Channel_close_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_Channel_isOpen = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_Channel_isOpen_ReturnResult = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_Channel_getStatus = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_Channel_getStatus_ReturnResult = new Parameter();

    /*
     * Class InputChannel
     */
    public Class_ FoundationalModelLibrary_BasicInputOutput_InputChannel = new Class_();
    public Generalization FoundationalModelLibrary_BasicInputOutput_InputChannel_Generalization_Channel = new Generalization();
    public Operation FoundationalModelLibrary_BasicInputOutput_InputChannel_hasMore = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_InputChannel_hasMore_ReturnResult = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_InputChannel_read = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_InputChannel_read_value = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_InputChannel_read_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_InputChannel_peek = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_InputChannel_peek_value = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_InputChannel_peek_errorStatus = new Parameter();

    /*
     * Class OutputChannel
     */
    public Class_ FoundationalModelLibrary_BasicInputOutput_OutputChannel = new Class_();
    public Generalization FoundationalModelLibrary_BasicInputOutput_OutputChannel_Generalization_Channel = new Generalization();
    public Operation FoundationalModelLibrary_BasicInputOutput_OutputChannel_write = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_OutputChannel_write_value = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_OutputChannel_write_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_OutputChannel_isFull = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_OutputChannel_isFull_ReturnResult = new Parameter();

    /*
     * TextInputChannel
     */
    public Class_ FoundationalModelLibrary_BasicInputOutput_TextInputChannel = new Class_();
    public Generalization FoundationalModelLibrary_BasicInputOutput_TextInputChannel_Generalization_InputChannel = new Generalization();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter_ReturnResult = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter_OwnedParameter = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine_ReturnResult = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger_ReturnResult = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal_ReturnResult = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean_ReturnResult = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural_ReturnResult = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural_errorStatus = new Parameter();

    /*
     * TextOutputChannel
     */
    public Class_ FoundationalModelLibrary_BasicInputOutput_TextOutputChannel = new Class_();
    public Generalization FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_Generalization_OutputChannel = new Generalization();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString_value = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeNewLine = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeNewLine_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine_value = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger_value = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal_value = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean_value = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean_errorStatus = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural_value = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural_errorStatus = new Parameter();

    /*
     * StandardInputChannel
     */
    public Class_ FoundationalModelLibrary_BasicInputOutput_StandardInputChannel = new Class_();
    public Generalization FoundationalModelLibrary_BasicInputOutput_StandardInputChannel_Generalization_TextInputChannel = new Generalization();

    /*
     * StandardOutputChannel
     */
    public Class_ FoundationalModelLibrary_BasicInputOutput_StandardOutputChannel = new Class_();
    public Generalization FoundationalModelLibrary_BasicInputOutput_StandardOutputChannel_Generalization_TextOutputChannel = new Generalization();

    /*
     * Activity WriteLine
     */
    public Activity FoundationalModelLibrary_BasicInputOutput_WriteLine = new Activity();
    public Parameter FoundationalModelLibrary_BasicInputOutput_WriteLine_value = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_WriteLine_errorStatus = new Parameter();
    public ActivityParameterNode FoundationalModelLibrary_BasicInputOutput_WriteLine_ActivityParameterNode_value = new ActivityParameterNode();
    public ActivityParameterNode FoundationalModelLibrary_BasicInputOutput_WriteLine_ActivityParameterNode_errorStatus = new ActivityParameterNode();
    public ReadExtentAction FoundationalModelLibrary_BasicInputOutput_WriteLine_ReadExtentAction_StandardOutputChannel = new ReadExtentAction();
    public OutputPin FoundationalModelLibrary_BasicInputOutput_WriteLine_ReadExtentAction_StandardOutputChannel_result = new OutputPin();
    public CallOperationAction FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine = new CallOperationAction();
    public InputPin FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_target = new InputPin();
    public InputPin FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_value = new InputPin();
    public OutputPin FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_errorStatus = new OutputPin();
    public ObjectFlow FoundationalModelLibrary_BasicInputOutput_WriteLine_From_StandardOutputChannel_result_To_writeLine_target = new ObjectFlow();
    public ObjectFlow FoundationalModelLibrary_BasicInputOutput_WriteLine_From_value_To_writeLine_value = new ObjectFlow();
    public ObjectFlow FoundationalModelLibrary_BasicInputOutput_WriteLine_From_writeLine_errorStatus_To_errorStatus = new ObjectFlow();

    /*
     * Class ActiveChannel
     */
    public Class_ FoundationalModelLibrary_BasicInputOutput_ActiveChannel = new Class_();
    public Generalization FoundationalModelLibrary_BasicInputOutput_ActiveChannel_Generalization_Channel = new Generalization();
    public Operation FoundationalModelLibrary_BasicInputOutput_ActiveChannel_register = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_ActiveChannel_register_listener = new Parameter();
    public Operation FoundationalModelLibrary_BasicInputOutput_ActiveChannel_unregister = new Operation();
    public Parameter FoundationalModelLibrary_BasicInputOutput_ActiveChannel_unregister_listener = new Parameter();

    /*
     * Activity ReadLine
     */
    public Activity FoundationalModelLibrary_BasicInputOutput_ReadLine = new Activity();
    public Parameter FoundationalModelLibrary_BasicInputOutput_ReadLine_errorStatus = new Parameter();
    public Parameter FoundationalModelLibrary_BasicInputOutput_ReadLine_result = new Parameter();
    public ActivityParameterNode FoundationalModelLibrary_BasicInputOutput_ReadLine_ActivityParameterNode_errorStatus = new ActivityParameterNode();
    public ActivityParameterNode FoundationalModelLibrary_BasicInputOutput_ReadLine_ActivityParameterNode_result = new ActivityParameterNode();
    public ReadExtentAction FoundationalModelLibrary_BasicInputOutput_ReadLine_ReadExtentAction_StandardInputChannel = new ReadExtentAction();
    public OutputPin FoundationalModelLibrary_BasicInputOutput_ReadLine_ReadExtentAction_StandardInputChannel_result = new OutputPin();
    public CallOperationAction FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine = new CallOperationAction();
    public InputPin FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_target = new InputPin();
    public OutputPin FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_result = new OutputPin();
    public OutputPin FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_errorStatus = new OutputPin();
    public ObjectFlow FoundationalModelLibrary_BasicInputOutput_ReadLine_From_StandardInputChannel_result_To_readLine_target = new ObjectFlow();
    public ObjectFlow FoundationalModelLibrary_BasicInputOutput_ReadLine_From_readLine_result_To_result = new ObjectFlow();
    public ObjectFlow FoundationalModelLibrary_BasicInputOutput_ReadLine_From_readLine_errorStatus_To_errorStatus = new ObjectFlow();

    public static FoundationalModelLibraryModel instance()
    {
        if (instance == null)
        {
            instance = new FoundationalModelLibraryModel();
            instance.InitializeInMemoryModel();
        }
        return instance;
    }

    private void InitializeInMemoryModel()
    {
        /*
		 * Create in-memory model elements
		 */

        /*
		 * Boolean functions
		 */
        //FunctionBehavior And
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And.setName("And");
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_y);
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_And_result);

        //FunctionBehavior Implies
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies.setName("Implies");
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_y);
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Implies_result);

        //FunctionBehavior Not
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not.setName("Not");
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not_x);
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Not_result);

        //FunctionBehavior Or
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or.setName("Or");
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_y);
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Or_result);

        //FunctionBehavior ToBoolean
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean.setName("ToBoolean");
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean_x);
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean_result.setLower(0);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToBoolean_result);

        //FunctionBehavior ToString
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString.setName("ToString");
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString_x);
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_ToString_result);

        //FunctionBehavior Xor
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor.setName("Xor");
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_y);
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_BooleanFunctions_Xor_result);

        /*
		 * Integer functions
		 */
        //FunctionBehavior Abs
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs.setName("Abs");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Abs_x);

        //FunctionBehavior Div
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div.setName("Div");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Div_y);

        //FunctionBehavior Max
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max.setName("Max");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Max_y);

        //FunctionBehavior Min
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min.setName("Min");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Min_y);

        //FunctionBehavior Mod
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod.setName("Mod");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Mod_y);

        //FunctionBehavior Neg
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg.setName("Neg");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_Neg_x);

        //FunctionBehavior ToInteger
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger.setName("ToInteger");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToInteger_x);

        //FunctionBehavior ToString
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString.setName("ToString");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToString_x);

        //FunctionBehavior ToUnlimitedNatural
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural.setName("ToUnlimitedNatural");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_ToUnlimitedNatural_x);

        //FunctionBehavior divide
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide.setName("/");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_divide_y);
        /* NOT PRESENT IN FUML LIBRARY
			//FunctionBehavior equals
			FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_equals.setName("equals");
				//Parameter result
				FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_equals_result = nullptr;
				//Parameter x
				FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_equals_x = nullptr;
				//Parameter y
				FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_equals_y = nullptr;
		*/
        //FunctionBehavior greaterOrEqual
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual.setName(">=");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterOrEqual_y);

        //FunctionBehavior greaterThan
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan.setName(">");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_greaterThan_y);

        //FunctionBehavior lessOrEqual
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual.setName("<=");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessOrEqual_y);

        //FunctionBehavior lessThan
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan.setName("<");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_lessThan_y);

        //FunctionBehavior minus
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus.setName("-");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_minus_y);

        //FunctionBehavior plus
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus.setName("+");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_plus_y);

        //FunctionBehavior times
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times.setName("*");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_IntegerFunctions_times_y);

        /*
		 * Real functions
		 */
        //FunctionBehavior Abs
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs.setName("Abs");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Abs_x);

        //FunctionBehavior Floor
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor.setName("Floor");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Floor_x);

        //FunctionBehavior Inv
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv.setName("Inv");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Inv_x);

        //FunctionBehavior Max
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max.setName("Max");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Max_y);

        //FunctionBehavior Min
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min.setName("Min");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Min_y);

        //FunctionBehavior Neg
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg.setName("Neg");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Neg_x);

        //FunctionBehavior Round
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round.setName("Round");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_Round_x);

        //FunctionBehavior ToInteger
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger.setName("ToInteger");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToInteger_x);

        //FunctionBehavior ToReal
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal.setName("ToReal");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToReal_x);

        //FunctionBehavior ToString
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString.setName("ToString");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_ToString_x);

        //FunctionBehavior divide
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide.setName("/");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_divide_y);
        /* NOT PRESENT IN FUML LIBRARY
			//FunctionBehavior equals
			FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_equals.setName("equals");
				//Parameter result
				FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_equals_result = nullptr;
				//Parameter x
				FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_equals_x = nullptr;
				//Parameter y
				FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_equals_y = nullptr;
		*/
        //FunctionBehavior greaterOrEqual
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual.setName(">=");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterOrEqual_y);

        //FunctionBehavior greaterThan
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan.setName(">");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_greaterThan_y);

        //FunctionBehavior lessOrEqual
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual.setName("<=");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessOrEqual_y);

        //FunctionBehavior lessThan
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan.setName("<");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_lessThan_y);

        //FunctionBehavior minus
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus.setName("-");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_minus_y);

        //FunctionBehavior plus
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus.setName("+");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_plus_y);

        //FunctionBehavior times
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times.setName("*");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_RealFunctions_times_y);

        /*
		 * String functions
		 */
        //FunctionBehavior Concat
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat.setName("Concat");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Concat_y);

        //FunctionBehavior Size
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size.setName("Size");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Size_x);

        //FunctionBehavior Substring
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring.setName("Substring");
        //Parameter lower
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_lower.setName("lower");
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_lower.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_lower);
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_result);
        //Parameter upper
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_upper.setName("upper");
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_upper.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_upper);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_StringFunctions_Substring_x);

        /*
		 * UnlimitedNatural functions
		 */
        //FunctionBehavior Max
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max.setName("Max");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Max_y);

        //FunctionBehavior Min
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min.setName("Min");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_Min_y);

        //FunctionBehavior ToInteger
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger.setName("ToInteger");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToInteger_x);

        //FunctionBehavior ToString
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString.setName("ToString");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToString_x);

        //FunctionBehavior ToUnlimitedNatural
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural.setName("ToUnlimitedNatural");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_ToUnlimitedNatural_x);
        /* NOT PRESENT IN FUML LIBRARY
			//FunctionBehavior equals
			FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_equals.setName("equals");
				//Parameter result
				FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_equals_result = nullptr;
				//Parameter x
				FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_equals_x = nullptr;
				//Parameter y
				FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_equals_y = nullptr;
		*/
        //FunctionBehavior greaterOrEqual
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual.setName(">=");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterOrEqual_y);

        //FunctionBehavior greaterThan
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan.setName(">");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_greaterThan_y);

        //FunctionBehavior lessOrEqual
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual.setName("<=");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessOrEqual_y);

        //FunctionBehavior lessThan
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan.setName("<");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_result);
        //Parameter x
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_x.setName("x");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_x.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_x);
        //Parameter y
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_y.setName("y");
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_y.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_UnlimitedNaturalFunctions_lessThan_y);

        /*
		 * List functions
		 */
        //FunctionBehavior ListSize
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize.setName("ListSize");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize_result);
        //Parameter list
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize_list.setName("list");
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize_list.setLower(0);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize_list.setUpper(-1);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListSize_list);

        //FunctionBehavior ListGet
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet.setName("ListGet");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_result);
        //Parameter index
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_index.setName("index");
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_index.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_index);
        //Parameter list
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_list.setName("list");
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_list.setLower(0);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_list.setUpper(-1);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListGet_list);

        //FunctionBehavior ListConcat
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat.setName("ListConcat");
        //Parameter result
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_result.setName("result");
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_result.setLower(0);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_result.setUpper(-1);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_result);
        //Parameter index
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_list1.setName("list1");
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_list1.setLower(0);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_list1.setUpper(-1);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_list1);
        //Parameter list
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_list2.setName("list2");
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_list2.setLower(0);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_list2.setUpper(-1);
        FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat.addOwnedParameter(FoundationalModelLibrary_PrimitiveBehaviors_ListFunctions_ListConcat_list2);

        /*
		 * Common
		 */
        //Signal Notification
        FoundationalModelLibrary_Common_Notification.setName("Notification");
        //Property content
        FoundationalModelLibrary_Common_Notification_content.setName("content");
        FoundationalModelLibrary_Common_Notification_content.setLower(0);
        FoundationalModelLibrary_Common_Notification.addOwnedAttribute(FoundationalModelLibrary_Common_Notification_content);

        //Class Listener
        FoundationalModelLibrary_Common_Listener.setName("Listener");
        FoundationalModelLibrary_Common_Listener.setIsAbstract(true);
        FoundationalModelLibrary_Common_Listener.setIsActive(true);
        //Reception Notification
        FoundationalModelLibrary_Common_Listener_Notification.setName("Notification");
        FoundationalModelLibrary_Common_Listener_Notification.setSignal(FoundationalModelLibrary_Common_Notification);
        FoundationalModelLibrary_Common_Listener.addOwnedReception(FoundationalModelLibrary_Common_Listener_Notification);

        //DataType Status
        FoundationalModelLibrary_Common_Status.setName("Status");
        //Property context
        FoundationalModelLibrary_Common_Status_context.setName("context");
        FoundationalModelLibrary_Common_Status_context.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_Common_Status.addOwnedAttribute(FoundationalModelLibrary_Common_Status_context);
        //Property code
        FoundationalModelLibrary_Common_Status_code.setName("code");
        FoundationalModelLibrary_Common_Status_code.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_Common_Status.addOwnedAttribute(FoundationalModelLibrary_Common_Status_code);
        //Property description
        FoundationalModelLibrary_Common_Status_description.setName("description");
        FoundationalModelLibrary_Common_Status_description.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_Common_Status.addOwnedAttribute(FoundationalModelLibrary_Common_Status_description);

        /*
		 * BasicInputOutput
		 */
        // Class Channel
        FoundationalModelLibrary_BasicInputOutput_Channel.setName("Channel");
        FoundationalModelLibrary_BasicInputOutput_Channel.setIsAbstract(true);
        //Operation getName
        FoundationalModelLibrary_BasicInputOutput_Channel_getName.setName("getName");
        FoundationalModelLibrary_BasicInputOutput_Channel_getName.setIsAbstract(true);
        //Parameter ReturnResult
        FoundationalModelLibrary_BasicInputOutput_Channel_getName_ReturnResult.setName("ReturnResult");
        FoundationalModelLibrary_BasicInputOutput_Channel_getName_ReturnResult.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_BasicInputOutput_Channel_getName_ReturnResult.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_Channel_getName.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_Channel_getName_ReturnResult);
        FoundationalModelLibrary_BasicInputOutput_Channel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_Channel_getName);
        //Operation open
        FoundationalModelLibrary_BasicInputOutput_Channel_open.setName("open");
        FoundationalModelLibrary_BasicInputOutput_Channel_open.setIsAbstract(true);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_Channel_open_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_Channel_open_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_Channel_open_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_Channel_open.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_Channel_open_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_Channel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_Channel_open);
        //Operation close
        FoundationalModelLibrary_BasicInputOutput_Channel_close.setName("close");
        FoundationalModelLibrary_BasicInputOutput_Channel_close.setIsAbstract(true);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_Channel_close_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_Channel_close_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_Channel_close_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_Channel_close.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_Channel_close_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_Channel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_Channel_close);
        //Operation isOpen
        FoundationalModelLibrary_BasicInputOutput_Channel_isOpen.setName("isOpen");
        FoundationalModelLibrary_BasicInputOutput_Channel_isOpen.setIsAbstract(true);
        //Parameter ReturnResult
        FoundationalModelLibrary_BasicInputOutput_Channel_isOpen_ReturnResult.setName("ReturnResult");
        FoundationalModelLibrary_BasicInputOutput_Channel_isOpen_ReturnResult.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_BasicInputOutput_Channel_isOpen_ReturnResult.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_Channel_isOpen.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_Channel_isOpen_ReturnResult);
        FoundationalModelLibrary_BasicInputOutput_Channel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_Channel_isOpen);
        //Operation getStatus
        FoundationalModelLibrary_BasicInputOutput_Channel_getStatus.setName("getStatus");
        FoundationalModelLibrary_BasicInputOutput_Channel_getStatus.setIsAbstract(true);
        //Parameter ReturnResult
        FoundationalModelLibrary_BasicInputOutput_Channel_getStatus_ReturnResult.setName("ReturnResult");
        FoundationalModelLibrary_BasicInputOutput_Channel_getStatus_ReturnResult.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_Channel_getStatus_ReturnResult.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_Channel_getStatus.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_Channel_getStatus_ReturnResult);
        FoundationalModelLibrary_BasicInputOutput_Channel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_Channel_getStatus);

        //Class InputChannel
        FoundationalModelLibrary_BasicInputOutput_InputChannel.setName("InputChannel");
        FoundationalModelLibrary_BasicInputOutput_InputChannel.setIsAbstract(true);
        //Generalization to Channel
        FoundationalModelLibrary_BasicInputOutput_InputChannel_Generalization_Channel.setGeneral(FoundationalModelLibrary_BasicInputOutput_Channel);
        FoundationalModelLibrary_BasicInputOutput_InputChannel.addGeneralization(FoundationalModelLibrary_BasicInputOutput_InputChannel_Generalization_Channel);
        //Operation hasMore
        FoundationalModelLibrary_BasicInputOutput_InputChannel_hasMore.setName("hasMore");
        FoundationalModelLibrary_BasicInputOutput_InputChannel_hasMore.setIsAbstract(true);
        //Parameter ReturnResult
        FoundationalModelLibrary_BasicInputOutput_InputChannel_hasMore_ReturnResult.setName("ReturnResult");
        FoundationalModelLibrary_BasicInputOutput_InputChannel_hasMore_ReturnResult.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_BasicInputOutput_InputChannel_hasMore_ReturnResult.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_InputChannel_hasMore.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_InputChannel_hasMore_ReturnResult);
        FoundationalModelLibrary_BasicInputOutput_InputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_InputChannel_hasMore);
        //Operation read
        FoundationalModelLibrary_BasicInputOutput_InputChannel_read.setName("read");
        FoundationalModelLibrary_BasicInputOutput_InputChannel_read.setIsAbstract(true);
        //Parameter value
        FoundationalModelLibrary_BasicInputOutput_InputChannel_read_value.setName("value");
        FoundationalModelLibrary_BasicInputOutput_InputChannel_read_value.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_InputChannel_read.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_InputChannel_read_value);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_InputChannel_read_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_InputChannel_read_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_InputChannel_read_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_InputChannel_read.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_InputChannel_read_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_InputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_InputChannel_read);
        //Operation peek
        FoundationalModelLibrary_BasicInputOutput_InputChannel_peek.setName("peek");
        FoundationalModelLibrary_BasicInputOutput_InputChannel_peek.setIsAbstract(true);
        //Parameter value
        FoundationalModelLibrary_BasicInputOutput_InputChannel_peek_value.setName("value");
        FoundationalModelLibrary_BasicInputOutput_InputChannel_peek_value.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_InputChannel_peek.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_InputChannel_peek_value);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_InputChannel_peek_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_InputChannel_peek_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_InputChannel_peek_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_InputChannel_peek.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_InputChannel_peek_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_InputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_InputChannel_peek);

        //Class OutputChannel
        FoundationalModelLibrary_BasicInputOutput_OutputChannel.setName("OutputChannel");
        FoundationalModelLibrary_BasicInputOutput_OutputChannel.setIsAbstract(true);
        //Generalization to Channel
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_Generalization_Channel.setGeneral(FoundationalModelLibrary_BasicInputOutput_Channel);
        FoundationalModelLibrary_BasicInputOutput_OutputChannel.addGeneralization(FoundationalModelLibrary_BasicInputOutput_OutputChannel_Generalization_Channel);
        //Operation isFull
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_isFull.setName("isFull");
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_isFull.setIsAbstract(true);
        //Parameter ReturnResult
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_isFull_ReturnResult.setName("ReturnResult");
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_isFull_ReturnResult.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_isFull_ReturnResult.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_isFull.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_OutputChannel_isFull_ReturnResult);
        FoundationalModelLibrary_BasicInputOutput_OutputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_OutputChannel_isFull);
        //Operation write
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_write.setName("write");
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_write.setIsAbstract(true);
        //Parameter value
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_write_value.setName("value");
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_write.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_OutputChannel_write_value);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_write_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_write_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_write_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_OutputChannel_write.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_OutputChannel_write_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_OutputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_OutputChannel_write);

        //Class TextInputChannel
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel.setName("TextInputChannel");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel.setIsAbstract(true);
        //Generalization to Channel
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_Generalization_InputChannel.setGeneral(FoundationalModelLibrary_BasicInputOutput_InputChannel);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel.addGeneralization(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_Generalization_InputChannel);
        //Operation readCharacter
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter.setName("readCharacter");
        //Parameter ReturnResult
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter_ReturnResult.setName("ReturnResult");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter_ReturnResult.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter_ReturnResult.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter_ReturnResult);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readCharacter);
        //Operation peekCharacter
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter.setName("peekCharacter");
        //Parameter OwnedParameter
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter_OwnedParameter.setName("OwnedParameter");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter_OwnedParameter.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter_OwnedParameter.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter_OwnedParameter);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_peekCharacter);
        //Operation readLine
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine.setName("readLine");
        //Parameter ReturnResult
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine_ReturnResult.setName("ReturnResult");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine_ReturnResult.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine_ReturnResult.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine_ReturnResult);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine);
        //Operation readInteger
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger.setName("readInteger");
        //Parameter ReturnResult
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger_ReturnResult.setName("ReturnResult");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger_ReturnResult.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger_ReturnResult.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger_ReturnResult);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readInteger);
        //Operation readReal
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal.setName("readReal");
        //Parameter ReturnResult
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal_ReturnResult.setName("ReturnResult");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal_ReturnResult.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal_ReturnResult.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal_ReturnResult);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readReal);
        //Operation readBoolean
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean.setName("readBoolean");
        //Parameter ReturnResult
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean_ReturnResult.setName("ReturnResult");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean_ReturnResult.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean_ReturnResult.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean_ReturnResult);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readBoolean);
        //Operation readUnlimitedNatural
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural.setName("readUnlimitedNatural");
        //Parameter ReturnResult
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural_ReturnResult.setName("ReturnResult");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural_ReturnResult.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural_ReturnResult.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural_ReturnResult);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextInputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readUnlimitedNatural);

        //Class TextOutputChannel
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel.setName("TextOutputChannel");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel.setIsAbstract(true);
        //Generalization to Channel
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_Generalization_OutputChannel.setGeneral(FoundationalModelLibrary_BasicInputOutput_OutputChannel);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel.addGeneralization(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_Generalization_OutputChannel);

        //Class StandardInputChannel
        FoundationalModelLibrary_BasicInputOutput_StandardInputChannel.setName("StandardInputChannel");
        FoundationalModelLibrary_BasicInputOutput_StandardInputChannel.setIsAbstract(true);
        //Generalization to TextInputChannel
        FoundationalModelLibrary_BasicInputOutput_StandardInputChannel_Generalization_TextInputChannel.setGeneral(FoundationalModelLibrary_BasicInputOutput_TextInputChannel);
        FoundationalModelLibrary_BasicInputOutput_StandardInputChannel.addGeneralization(FoundationalModelLibrary_BasicInputOutput_StandardInputChannel_Generalization_TextInputChannel);

        //Class StandardOutputChannel
        FoundationalModelLibrary_BasicInputOutput_StandardOutputChannel.setName("StandardOutputChannel");
        FoundationalModelLibrary_BasicInputOutput_StandardOutputChannel.setIsAbstract(true);
        //Generalization to TextOutputChannel
        FoundationalModelLibrary_BasicInputOutput_StandardOutputChannel_Generalization_TextOutputChannel.setGeneral(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel);
        FoundationalModelLibrary_BasicInputOutput_StandardOutputChannel.addGeneralization(FoundationalModelLibrary_BasicInputOutput_StandardOutputChannel_Generalization_TextOutputChannel);
        //Operation writeString
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString.setName("writeString");
        //Parameter value
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString_value.setName("value");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString_value);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeString);
        //Operation writeNewLine
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeNewLine.setName("writeNewLine");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeNewLine.setIsAbstract(true);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeNewLine_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeNewLine_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeNewLine_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeNewLine.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeNewLine_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeNewLine);
        //Operation writeLine
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine.setName("writeLine");
        //Parameter value
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine_value.setName("value");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine_value);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine);
        //Operation writeInteger
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger.setName("writeInteger");
        //Parameter value
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger_value.setName("value");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Integer);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger_value);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeInteger);
        //Operation writeReal
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal.setName("writeReal");
        //Parameter value
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal_value.setName("value");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Real);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal_value);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeReal);
        //Operation writeBoolean
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean.setName("writeBoolean");
        //Parameter value
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean_value.setName("value");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_Boolean);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean_value);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeBoolean);
        //Operation writeUnlimitedNatural
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural.setName("writeUnlimitedNatural");
        //Parameter value
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural_value.setName("value");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_UnlimitedNatural);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural_value);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_TextOutputChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeUnlimitedNatural);

        //Activity WriteLine
        FoundationalModelLibrary_BasicInputOutput_WriteLine.setName("WriteLine");
        FoundationalModelLibrary_BasicInputOutput_WriteLine.isReentrant = false;
        //Parameter value
        FoundationalModelLibrary_BasicInputOutput_WriteLine_value.setName("value");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_BasicInputOutput_WriteLine.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_WriteLine_value);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_WriteLine_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_WriteLine_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_WriteLine.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_WriteLine_errorStatus);
        //ActivityParameterNode value
        FoundationalModelLibrary_BasicInputOutput_WriteLine_ActivityParameterNode_value.setName("value");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_ActivityParameterNode_value.setParameter(FoundationalModelLibrary_BasicInputOutput_WriteLine_value);
        FoundationalModelLibrary_BasicInputOutput_WriteLine_ActivityParameterNode_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_BasicInputOutput_WriteLine.addNode(FoundationalModelLibrary_BasicInputOutput_WriteLine_ActivityParameterNode_value);
        //ActivityParameterNode errorStatus
        FoundationalModelLibrary_BasicInputOutput_WriteLine_ActivityParameterNode_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_ActivityParameterNode_errorStatus.setParameter(FoundationalModelLibrary_BasicInputOutput_WriteLine_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_WriteLine_ActivityParameterNode_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_WriteLine.addNode(FoundationalModelLibrary_BasicInputOutput_WriteLine_ActivityParameterNode_errorStatus);
        //ReadExtentAction StandardOutputChannel
        FoundationalModelLibrary_BasicInputOutput_WriteLine_ReadExtentAction_StandardOutputChannel.setName("StandardOutputChannel");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_ReadExtentAction_StandardOutputChannel.setClassifier(FoundationalModelLibrary_BasicInputOutput_StandardOutputChannel);
        //OutputPin result
        FoundationalModelLibrary_BasicInputOutput_WriteLine_ReadExtentAction_StandardOutputChannel_result.setName("result");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_ReadExtentAction_StandardOutputChannel_result.setType(FoundationalModelLibrary_BasicInputOutput_StandardOutputChannel);
        FoundationalModelLibrary_BasicInputOutput_WriteLine_ReadExtentAction_StandardOutputChannel_result.setUpper(-1);
        FoundationalModelLibrary_BasicInputOutput_WriteLine_ReadExtentAction_StandardOutputChannel.setResult(FoundationalModelLibrary_BasicInputOutput_WriteLine_ReadExtentAction_StandardOutputChannel_result);
        FoundationalModelLibrary_BasicInputOutput_WriteLine.addNode(FoundationalModelLibrary_BasicInputOutput_WriteLine_ReadExtentAction_StandardOutputChannel);
        //CallOperationAction writeLine
        FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine.setName("writeLine");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine.setOperation(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel_writeLine);
        //InputPin target
        FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_target.setName("target");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_target.setType(FoundationalModelLibrary_BasicInputOutput_TextOutputChannel);
        FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine.setTarget(FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_target);
        //InputPin value
        FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_value.setName("value");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_value.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine.addArgument(FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_value);
        //OutputPin errorStatus
        FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine.addResult(FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_WriteLine.addNode(FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine);
        //ObjectFlow from value to writeLine_value
        FoundationalModelLibrary_BasicInputOutput_WriteLine_From_value_To_writeLine_value.setName("From_value_To_writeLine_value");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_From_value_To_writeLine_value.setSource(FoundationalModelLibrary_BasicInputOutput_WriteLine_ActivityParameterNode_value);
        FoundationalModelLibrary_BasicInputOutput_WriteLine_From_value_To_writeLine_value.setTarget(FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_value);
        FoundationalModelLibrary_BasicInputOutput_WriteLine.addEdge(FoundationalModelLibrary_BasicInputOutput_WriteLine_From_value_To_writeLine_value);
        //ObjectFlow from StandardOutputChannel_result to writeLine_target
        FoundationalModelLibrary_BasicInputOutput_WriteLine_From_StandardOutputChannel_result_To_writeLine_target.setName("From_StandardOutputChannel_result_To_writeLine_target");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_From_StandardOutputChannel_result_To_writeLine_target.setSource(FoundationalModelLibrary_BasicInputOutput_WriteLine_ReadExtentAction_StandardOutputChannel_result);
        FoundationalModelLibrary_BasicInputOutput_WriteLine_From_StandardOutputChannel_result_To_writeLine_target.setTarget(FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_target);
        FoundationalModelLibrary_BasicInputOutput_WriteLine.addEdge(FoundationalModelLibrary_BasicInputOutput_WriteLine_From_StandardOutputChannel_result_To_writeLine_target);
        //ObjectFlow from writeLine_errorStatus to errorStatus
        FoundationalModelLibrary_BasicInputOutput_WriteLine_From_writeLine_errorStatus_To_errorStatus.setName("From_FoundationalModelLibrary_BasicInputOutput_WriteLine_errorStatus_To_errorStatus");
        FoundationalModelLibrary_BasicInputOutput_WriteLine_From_writeLine_errorStatus_To_errorStatus.setSource(FoundationalModelLibrary_BasicInputOutput_WriteLine_CallOperationAction_writeLine_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_WriteLine_From_writeLine_errorStatus_To_errorStatus.setTarget(FoundationalModelLibrary_BasicInputOutput_WriteLine_ActivityParameterNode_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_WriteLine.addEdge(FoundationalModelLibrary_BasicInputOutput_WriteLine_From_writeLine_errorStatus_To_errorStatus);

        //Class ActiveChannel
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel.setName("ActiveChannel");
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel.setIsAbstract(true);
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel.setIsActive(true);
        //Generalization to Channel
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel_Generalization_Channel.setGeneral(FoundationalModelLibrary_BasicInputOutput_Channel);
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel.addGeneralization(FoundationalModelLibrary_BasicInputOutput_ActiveChannel_Generalization_Channel);
        //Operation register
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel_register.setName("register");
        //Parameter listener
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel_register_listener.setName("listener");
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel_register_listener.setType(FoundationalModelLibrary_Common_Listener);
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel_register.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_ActiveChannel_register_listener);
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_ActiveChannel_register);
        //Operation unregister
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel_unregister.setName("unregister");
        //Parameter listener
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel_unregister_listener.setName("listener");
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel_unregister_listener.setType(FoundationalModelLibrary_Common_Listener);
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel_unregister.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_ActiveChannel_unregister_listener);
        FoundationalModelLibrary_BasicInputOutput_ActiveChannel.addOwnedOperation(FoundationalModelLibrary_BasicInputOutput_ActiveChannel_unregister);

        //Activity ReadLine
        FoundationalModelLibrary_BasicInputOutput_ReadLine.setName("ReadLine");
        FoundationalModelLibrary_BasicInputOutput_ReadLine.isReentrant = false;
        //Parameter result
        FoundationalModelLibrary_BasicInputOutput_ReadLine_result.setName("result");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_BasicInputOutput_ReadLine_result.setDirection(ParameterDirectionKind.return_);
        FoundationalModelLibrary_BasicInputOutput_ReadLine.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_ReadLine_result);
        //Parameter errorStatus
        FoundationalModelLibrary_BasicInputOutput_ReadLine_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_ReadLine_errorStatus.setDirection(ParameterDirectionKind.out);
        FoundationalModelLibrary_BasicInputOutput_ReadLine.addOwnedParameter(FoundationalModelLibrary_BasicInputOutput_ReadLine_errorStatus);
        //ActivityParameterNode result
        FoundationalModelLibrary_BasicInputOutput_ReadLine_ActivityParameterNode_result.setName("result");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_ActivityParameterNode_result.setParameter(FoundationalModelLibrary_BasicInputOutput_ReadLine_result);
        FoundationalModelLibrary_BasicInputOutput_ReadLine_ActivityParameterNode_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_BasicInputOutput_ReadLine.addNode(FoundationalModelLibrary_BasicInputOutput_ReadLine_ActivityParameterNode_result);
        //ActivityParameterNode errorStatus
        FoundationalModelLibrary_BasicInputOutput_ReadLine_ActivityParameterNode_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_ActivityParameterNode_errorStatus.setParameter(FoundationalModelLibrary_BasicInputOutput_ReadLine_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_ReadLine_ActivityParameterNode_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_ReadLine.addNode(FoundationalModelLibrary_BasicInputOutput_ReadLine_ActivityParameterNode_errorStatus);
        //ReadExtentAction StandardInputChannel
        FoundationalModelLibrary_BasicInputOutput_ReadLine_ReadExtentAction_StandardInputChannel.setName("StandardInputChannel");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_ReadExtentAction_StandardInputChannel.setClassifier(FoundationalModelLibrary_BasicInputOutput_StandardInputChannel);
        //OutputPin result
        FoundationalModelLibrary_BasicInputOutput_ReadLine_ReadExtentAction_StandardInputChannel_result.setName("result");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_ReadExtentAction_StandardInputChannel_result.setType(FoundationalModelLibrary_BasicInputOutput_StandardInputChannel);
        FoundationalModelLibrary_BasicInputOutput_ReadLine_ReadExtentAction_StandardInputChannel_result.setUpper(-1);
        FoundationalModelLibrary_BasicInputOutput_ReadLine_ReadExtentAction_StandardInputChannel.setResult(FoundationalModelLibrary_BasicInputOutput_ReadLine_ReadExtentAction_StandardInputChannel_result);
        FoundationalModelLibrary_BasicInputOutput_ReadLine.addNode(FoundationalModelLibrary_BasicInputOutput_ReadLine_ReadExtentAction_StandardInputChannel);
        //CallOperationAction readLine
        FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine.setName("readLine");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine.setOperation(FoundationalModelLibrary_BasicInputOutput_TextInputChannel_readLine);
        //InputPin target
        FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_target.setName("target");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_target.setType(FoundationalModelLibrary_BasicInputOutput_TextInputChannel);
        FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine.setTarget(FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_target);
        //OutputPin result
        FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_result.setName("result");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_result.setType(PrimitiveTypesModel.instance().PrimitiveTypes_String);
        FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine.addResult(FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_result);
        //OutputPin errorStatus
        FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_errorStatus.setName("errorStatus");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_errorStatus.setType(FoundationalModelLibrary_Common_Status);
        FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine.addResult(FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_ReadLine.addNode(FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine);
        //ObjectFlow from StandardInputChannel_result to readLine_target
        FoundationalModelLibrary_BasicInputOutput_ReadLine_From_StandardInputChannel_result_To_readLine_target.setName("From_StandardInputChannel_result_To_readLine_target");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_From_StandardInputChannel_result_To_readLine_target.setSource(FoundationalModelLibrary_BasicInputOutput_ReadLine_ReadExtentAction_StandardInputChannel_result);
        FoundationalModelLibrary_BasicInputOutput_ReadLine_From_StandardInputChannel_result_To_readLine_target.setTarget(FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_target);
        FoundationalModelLibrary_BasicInputOutput_ReadLine.addEdge(FoundationalModelLibrary_BasicInputOutput_ReadLine_From_StandardInputChannel_result_To_readLine_target);
        //ObjectFlow from readLine_result to result
        FoundationalModelLibrary_BasicInputOutput_ReadLine_From_readLine_result_To_result.setName("From_readLine_result_To_result");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_From_readLine_result_To_result.setSource(FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_result);
        FoundationalModelLibrary_BasicInputOutput_ReadLine_From_readLine_result_To_result.setTarget(FoundationalModelLibrary_BasicInputOutput_ReadLine_ActivityParameterNode_result);
        FoundationalModelLibrary_BasicInputOutput_ReadLine.addEdge(FoundationalModelLibrary_BasicInputOutput_ReadLine_From_readLine_result_To_result);
        //ObjectFlow from readLine_errorStatus to errorStatus
        FoundationalModelLibrary_BasicInputOutput_ReadLine_From_readLine_errorStatus_To_errorStatus.setName("From_readline_errorStatus_To_errorStatus");
        FoundationalModelLibrary_BasicInputOutput_ReadLine_From_readLine_errorStatus_To_errorStatus.setSource(FoundationalModelLibrary_BasicInputOutput_ReadLine_CallOperationAction_readLine_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_ReadLine_From_readLine_errorStatus_To_errorStatus.setTarget(FoundationalModelLibrary_BasicInputOutput_ReadLine_ActivityParameterNode_errorStatus);
        FoundationalModelLibrary_BasicInputOutput_ReadLine.addEdge(FoundationalModelLibrary_BasicInputOutput_ReadLine_From_readLine_errorStatus_To_errorStatus);
    }
} // FoundationalModelLibraryModel