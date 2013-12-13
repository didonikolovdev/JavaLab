package lab7b;

public class Circle extends GeometicShape
{
	private double radius;

	public Circle(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double getPerimeter()
	{
		return 2 * radius * Math.PI;
	}

	@Override
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String getLabel()
	{
		return String.format("Circle - radius=%.2f", radius);
	}

}
