package lab5a;

import lab5b.*;

public class ClassA
{
	private ClassB extClass = null;
	
	public ClassA()
	{
		extClass = new ClassB("Test Class B");
	}
	
	public ClassB getExtClass() 
	{
		return extClass;
	}

}
