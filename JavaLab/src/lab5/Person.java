package lab5;

public class Person
{
	public String lastName;
	public String firstname;
	public int age;
	
	public void introduceYourself(){
		System.out.println("Hello! My Name is " + firstname + " " + lastName + ". I am " + age + " years old." );
	}
}
