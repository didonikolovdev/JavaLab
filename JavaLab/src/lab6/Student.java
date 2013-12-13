package lab6;

public class Student extends Person
{
	//Fields
	private String facultyNumber;
	
	//Constructor
	public Student(String lastName, String firstName, int age, String facultyNumber)
	{
		super(lastName, firstName, age);
		this.facultyNumber = facultyNumber;
	}
	
	//Properties
	public String getFacultyNumber()
	{
		return facultyNumber;
	}
	
	//Public Methods
	public void printInfo()
	{
		System.out.println("My name is " + getFirstName() + " " + getLastName() + " and I am " + getAge() + " years old. Faculty Number: " + getFacultyNumber());
	}
}
