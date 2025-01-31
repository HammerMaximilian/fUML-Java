package uml.commonstructure;

public class Dependency extends PackageableElement // PSCS-specific
{
	public uml.commonstructure.NamedElementList client = new uml.commonstructure.NamedElementList();
	public uml.commonstructure.NamedElementList supplier = new uml.commonstructure.NamedElementList();

    public void addClient(NamedElement client)
    {
        if (client == null)
        {
            throw new IllegalArgumentException();
        }

        this.client.add(client);
        client.addClientDependency(this);
    }

    public void addSupplier(NamedElement supplier)
    {
        if (supplier == null)
        {
            throw new IllegalArgumentException();
        }

        this.supplier.add(supplier);
    }
	
} // Dependency
