package uml.simpleclassifiers;

import uml.classification.Classifier;
import uml.classification.ClassifierList;
import uml.classification.Operation;
import uml.classification.OperationList;
import uml.classification.Property;
import uml.classification.PropertyList;

public class Interface extends Classifier // PSCS-specific
{
    public ClassifierList nestedClassifier = new ClassifierList();
    public PropertyList ownedAttribute = new PropertyList();
    public OperationList ownedOperation = new OperationList();
    public ReceptionList ownedReception = new ReceptionList();
    public InterfaceList redefinedInterface = new InterfaceList();

    public void addNestedClassifier(
    Classifier nestedClassifier)
    {
        if (nestedClassifier == null)
        {
            throw new IllegalArgumentException();
        }

        addOwnedMember(nestedClassifier);
        this.nestedClassifier.add(nestedClassifier);
    } // addNestedClassifier

    public void addOwnedAttribute(
    Property ownedAttribute)
    {
        if (ownedAttribute == null)
        {
            throw new IllegalArgumentException();
        }

        addAttribute(ownedAttribute);
        addOwnedMember(ownedAttribute);

        this.ownedAttribute.add(ownedAttribute);
        ownedAttribute._setInterface(this);
    } // addOwnedAttribute

    public void addOwnedOperation(
    Operation ownedOperation)
    {
        if (ownedOperation == null)
        {
            throw new IllegalArgumentException();
        }

        addFeature(ownedOperation);
        addOwnedMember(ownedOperation);

        this.ownedOperation.add(ownedOperation);
        ownedOperation._setInterface(this);
    } // addOwnedOperation

    public void addOwnedReception(
    Reception ownedReception)
    {
        if (ownedReception == null)
        {
            throw new IllegalArgumentException();
        }

        addFeature(ownedReception);
        addOwnedMember(ownedReception);

        this.ownedReception.add(ownedReception);
    } // addOwnedReception

    public void addRedefinedInterface(
    Interface redefinedInterface)
    {
        if (redefinedInterface == null)
        {
            throw new IllegalArgumentException();
        }
        this.redefinedInterface.add(redefinedInterface);
    } // addNestedClassifier
} // Interface
