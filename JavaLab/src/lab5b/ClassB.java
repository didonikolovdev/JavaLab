package lab5b;

public class ClassB
{
	
	private int count = 0;
	private String label = "";

	public ClassB(String label)
	{
		this.label = label;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount(int value)
	{
		count = value;
	}
	
	public String getLabel ()
	{
		return label;
	}
}
