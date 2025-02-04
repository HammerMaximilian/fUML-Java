package uml.values;


public class OpaqueExpression extends ValueSpecification { // PSCS-specific
	
    public UMLPrimitiveTypes.StringList body = new UMLPrimitiveTypes.StringList();
    public UMLPrimitiveTypes.StringList language = new UMLPrimitiveTypes.StringList();
    public uml.commonbehavior.Behavior behavior = null;

    public void addBody(String body)
    {
        this.body.add(body);
    }

    public void addLanguage(String language)
    {
        this.language.add(language);
    }

    public void setBehavior(uml.commonbehavior.Behavior behavior)
    {
        this.behavior = behavior;
    }
} // OpaqueExpression
