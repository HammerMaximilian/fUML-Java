package utils.primitivetypes;

import utils.environment.InMemoryModel;
import uml.simpleclassifiers.PrimitiveType;

public class PrimitiveTypesModel extends InMemoryModel
{
    private static PrimitiveTypesModel instance;

    public PrimitiveType PrimitiveTypes_Boolean = new PrimitiveType();
    public PrimitiveType PrimitiveTypes_Integer = new PrimitiveType();
    public PrimitiveType PrimitiveTypes_Real = new PrimitiveType();
    public PrimitiveType PrimitiveTypes_String = new PrimitiveType();
    public PrimitiveType PrimitiveTypes_UnlimitedNatural = new PrimitiveType();

    public static PrimitiveTypesModel Instance()
    {
        if (instance == null)
        {
            instance = new PrimitiveTypesModel();
            instance.InitializeInMemoryModel();
        }

        return instance;
    }

    private void InitializeInMemoryModel()
    {
        /*
		 * Create in-memory model elements
		 */

        //PrimitiveType Boolean
        PrimitiveTypes_Boolean.setName("Boolean");

        //PrimitiveType Integer
        PrimitiveTypes_Integer.setName("Integer");

        //PrimitiveType Real
        PrimitiveTypes_Real.setName("Real");

        //PrimitiveType Integer
        PrimitiveTypes_String.setName("String");

        //PrimitiveType Integer
        PrimitiveTypes_UnlimitedNatural.setName("UnlimitedNatural");
    }
} // PrimitiveTypesModel

