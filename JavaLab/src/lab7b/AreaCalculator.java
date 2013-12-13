package lab7b;

public class AreaCalculator
{

	public static void getArea(GeometicShape shape)
	{
		System.out.print(shape.getLabel());
		System.out.print(" ");
		System.out.println(String.format("Area is %.4f", shape.getArea()));
	}

}
