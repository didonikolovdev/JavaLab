package lab7b;

public class PerimeterCalculator
{
	public static void getPerimeter(GeometicShape shape)
	{
		System.out.print(shape.getLabel());
		System.out.print(" ");
		System.out.println(String.format("Perimeter is %.4f", shape.getPerimeter()));
	}
}
