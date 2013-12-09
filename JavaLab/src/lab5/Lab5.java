package lab5;

import lab5a.*;
import lab5c.*;

public class Lab5
{
	public static void main(String[] args)
	{
		//Exercise 2
		Person me = new Person();
		me.lastName = "Nikolov";
		me.firstname = "Deyan";
		me.age = 39;
		
		Person ivan = new Person();
		ivan.lastName = "Dimitrov";
		ivan.firstname = "Ivan";
		ivan.age = 25;
		
		Person hristo = new Person();
		hristo.lastName = "Georgiev";
		hristo.firstname = "Hristo";
		hristo.age = 45;
		
		//Exercise 3
		me.introduceYourself();
		ivan.introduceYourself();
		hristo.introduceYourself();
		
		//Exercise 5
		System.out.println(me);
		
		//Exercise 6
		Person phantom = null;
		System.out.println(phantom);
		
		//Exercise 7
		Stairway stairs = new Stairway("Северно");
		stairs.установиБройСтъпала(45);
		stairs.печатИнформация();
		
		//Exercise 8
		ClassA aClass = new ClassA();
		System.out.println( "Get ClassB property through ClassA method. ClassB Label = " +  aClass.getExtClass().getLabel());
		
		//Exercise 9
		FieldPrint fldPrint = new FieldPrint();
		fldPrint.setMyField(10);
		fldPrint.printMyField();
		
		//Exercise 10-11
		FirstClass firstClass = new FirstClass();
		firstClass.setTag("first class tag");
		firstClass.printTag();
		
		//Exercise 12
		SelfCounter counter = new SelfCounter();
		SelfCounter counter1 = new SelfCounter();
		SelfCounter counter2 = new SelfCounter();
		SelfCounter counter3 = new SelfCounter();
		SelfCounter counter4 = new SelfCounter();
		System.out.println("We have '" + counter.getInstanceCount() + "' instances of this class!");
	}	
}
