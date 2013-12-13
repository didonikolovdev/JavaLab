package lab6;

public class Person
{
	//Fields
	private String lastName;
	private String firstName;
	private int age;
	
	//Constructor
	public Person(String lastName, String firstName, int age)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}
	
	//Properties
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String value)
	{
		lastName = value;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String value)
	{
		firstName = value;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int value)
	{
		age = value;
	}
	
	//Public Methods
	public void printInfo()
	{
		System.out.println("My name is " + getFirstName() + " " + getLastName() + " and I am " + getAge() + " years old.");
	}
}
