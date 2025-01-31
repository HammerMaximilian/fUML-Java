package uml.structuredclassifiers;

import uml.classification.Classifier;
import uml.classification.Property;

public abstract class StructuredClassifier extends Classifier //PSCS-specific
{
    public uml.classification.PropertyList ownedAttribute = new uml.classification.PropertyList();
    public ConnectorList ownedConnector = new ConnectorList();
    public uml.classification.PropertyList part = new uml.classification.PropertyList();

    public void addOwnedAttribute(Property ownedAttribute)
    {
        if (ownedAttribute == null)
        {
            throw new IllegalArgumentException();
        }

        addAttribute(ownedAttribute);
        addOwnedMember(ownedAttribute);
        this.ownedAttribute.add(ownedAttribute);

        if(ownedAttribute.isComposite)
        {
            part.add(ownedAttribute);
        }
    }

    public void AddOwnedConnector(Connector ownedConnector)
    {
        if (ownedConnector == null)
        {
            throw new IllegalArgumentException();
        }

        addFeature(ownedConnector);
        addOwnedMember(ownedConnector);
        this.ownedConnector.add(ownedConnector);
    }
}
