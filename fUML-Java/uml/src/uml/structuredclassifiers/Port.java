package uml.structuredclassifiers;

import uml.classification.Property;
import uml.simpleclassifiers.Interface;
import uml.simpleclassifiers.InterfaceList;

public class Port extends Property // PSCS-specific
{
    public boolean isBehavior = false;
    public boolean isConjugated = false;
    public boolean isService = false;
    public InterfaceList required = new InterfaceList();
    public InterfaceList provided = new InterfaceList();
    public PortList redefinedPort = new PortList();

    public void AddRequired(Interface required)
    {
        if (required == null)
        {
            throw new IllegalArgumentException();
        }

        this.required.add(required);
    }

    public void AddProvided(Interface provided)
    {
        if (provided == null)
        {
            throw new IllegalArgumentException();
        }

        this.provided.add(provided);
    }

    public void AddRedefinedPort(Port redefinedPort)
    {
        if (redefinedPort == null)
        {
            throw new IllegalArgumentException();
        }

        addRedefinedElement(redefinedPort);
        this.redefinedPort.add(redefinedPort);
    }
} // Port
