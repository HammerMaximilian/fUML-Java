package uml.structuredclassifiers;

import uml.classification.Property;
import uml.commonstructure.MultiplicityElement;

public class ConnectorEnd extends MultiplicityElement // PSCS-specific
{
    public Property role = null; // 'role' must be of type Property here since there is no multiple inheritance
    public Property partWithPort = null;

    public void setRole(Property role)
    {
        this.role = role;
        role.connectableElement.end.add(this);
    }

    public void setPartWithPort(Property partWithPort)
    {
        this.partWithPort = partWithPort;
    }

} // ConnectorEnd
