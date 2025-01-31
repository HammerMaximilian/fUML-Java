package uml.structuredclassifiers;

public class EncapsulatedClassifier extends StructuredClassifier 
{
    public PortList ownedPort = new PortList();

    public void AddOnwedPort(Port ownedPort)
    {
        if (ownedPort == null)
        {
            throw new IllegalArgumentException();
        }

        addOwnedAttribute(ownedPort);
        this.ownedPort.add(ownedPort);
    }
} // EncapsulatedClassifier
