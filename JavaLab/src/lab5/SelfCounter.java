package lab5;

public class SelfCounter
{
	
	private static int instanceCount = 0;

	public SelfCounter()
	{
		instanceCount ++;
	}
	
	public int getInstanceCount() 
	{
		return instanceCount;
	}
}
