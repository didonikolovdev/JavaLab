package lab5c;

public class FirstClass
{
	private String tag = "";
	
	public String getTag()
	{
		return tag;
	}
	
	public void setTag(String value)
	{
		tag = value;		
	}
	
	public void printTag() 
	{
		SecondClass second = new SecondClass();
		second.setTag("second class tag");
		System.out.println("FirstClass tag: " + tag);
		System.out.println("SecondClass tag: " + second.getTag());
	}
}
