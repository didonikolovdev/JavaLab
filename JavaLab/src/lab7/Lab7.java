package lab7;

import lab7a.FordMustang;
import lab7a.ToyotaPrius;
import lab7b.AreaCalculator;
import lab7b.Circle;
import lab7b.PerimeterCalculator;
import lab7b.Rectangle;
import lab7b.Triangle;
import lab7c.Property;
import lab7c.PropertyCalculator;

public class Lab7
{
	public static void main(String[] args)
	{
		//Exercise 1
		exercise1();
		
		//Exercise 2
		System.out.println("Exercise 2 -----------");				
		lab7b.Triangle triangle = new Triangle(2.3, 5.5, 5.5, 5.37);
		lab7b.Rectangle rectangle = new Rectangle(5.56, 3.84);
		lab7b.Circle circle = new Circle(2.25);
		
		PerimeterCalculator.getPerimeter(triangle);
		PerimeterCalculator.getPerimeter(rectangle);
		PerimeterCalculator.getPerimeter(circle);
		System.out.println();
		
		//Exercise 3
		System.out.println("Exercise 3 -----------");		
		AreaCalculator.getArea(triangle);
		AreaCalculator.getArea(rectangle);
		AreaCalculator.getArea(circle);		
		System.out.println();
		
		//Exercise 4
		System.out.println("Exercise 4 -----------");
		
		lab7c.Property developed = new Property(120, 38, "Developed");
		lab7c.Property undeveloped = new Property(500, 17, "Undeveloped");
		PropertyCalculator.getTotalPrice(developed, undeveloped);
		System.out.println();
	}

	private static void exercise1()
	{
		System.out.println("Exercise 1 -----------");
		System.out.println("Driving my Mustang");
		lab7a.FordMustang myMustang = new FordMustang(6, 250);
		myMustang.printInfo();
		myMustang.starEngine();
		myMustang.gearUp();
		myMustang.accelerate(20);
		myMustang.gearUp();
		myMustang.accelerate(20);
		myMustang.gearUp();
		myMustang.accelerate(20);
		myMustang.printInfo();
		myMustang.gearDown();
		myMustang.decelerate(20);
		myMustang.gearDown();
		myMustang.decelerate(20);
		myMustang.brakeToStop();
		myMustang.printInfo();
		
		System.out.println();
		System.out.println("Driving my Prius");		
		lab7a.ToyotaPrius myPrius = new ToyotaPrius(6, 180);
		myPrius.printInfo();
		myPrius.starEngine();
		myPrius.gearUp();
		myPrius.accelerate(10);
		myPrius.gearUp();
		myPrius.accelerate(20);
		myPrius.gearUp();
		myPrius.accelerate(10);
		myPrius.printInfo();		
		myPrius.brakeToStop();
		myPrius.printInfo();
		System.out.println();
	}

}
