package lab7b;

public class Rectangle extends GeometicShape
{
	private double side1;
	private double side2;

	public Rectangle(double side1, double side2)
	{		
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public double getPerimeter()
	{
		return 2 * (side1 + side2);
	}

	@Override
	public double getArea()
	{
		return side1 * side2;
	}

	@Override
	public String getLabel()
	{
		return String.format("Rectangle - side1=%.2f, side2 =%.2f", side1, side2);
	}

}
