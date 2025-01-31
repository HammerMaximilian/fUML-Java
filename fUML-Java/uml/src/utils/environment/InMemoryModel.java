package utils.environment;

import java.util.HashMap;

public abstract class InMemoryModel {
	
	private HashMap<String, Object> elementRepository = new HashMap<String, Object>();
	
	protected void addToElementRepository(String name, Object object)
	{
		elementRepository.put(name, object);
	}
	
	public Object findElementByName(String name)
	{
		return elementRepository.get(name);
	}
} // InMemoryModel
