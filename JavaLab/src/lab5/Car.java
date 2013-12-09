package lab5;

//Exercise 4
public class Car
{
	//fields 
	private String make;
	private int year;	
	
	//Constructor 
	public Car(String make, int year)
	{
		this.make = make;
		this.year = year;
	}
	
	//Overloaded constructor with one parameter
	public Car(String make)
	{
		this(make, 0);
	}
	
	//read-only property - can be initialized only during instantiation
	public String getMake ()
	{
		return make;
	}
	
	//property get for year
	public int getYear()
	{
		return year;
	}
	
	//property set for year 
	public void setYear(int value)
	{
		year = value;
	}
	
	
	//method
	public void startEngine()
	{
		System.out.println("Engine started");
	}
}
