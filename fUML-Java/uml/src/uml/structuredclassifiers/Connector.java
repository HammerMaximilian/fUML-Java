package uml.structuredclassifiers;

import uml.classification.Feature;

public class Connector extends Feature // PSCS-specific
{
    public ConnectorKind kind;
    public ConnectorEndList end = new ConnectorEndList();
    public Association type = null;
    public ConnectorList redefinedConnector = new ConnectorList();

    public void addEnd(ConnectorEnd end)
    {
        if (end == null)
        {
            throw new IllegalArgumentException();
        }

        addOwnedElement(end);
        this.end.add(end);
    }

    public void setType(Association type)
    {
        this.type = type;
    }

    public void addRedefinedConnector(Connector redefinedConnector)
    {
        if (redefinedConnector == null)
        {
            throw new IllegalArgumentException();
        }

        addRedefinedElement(redefinedConnector);
        this.redefinedConnector.add(redefinedConnector);
    }
}
