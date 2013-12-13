package lab7b;

public class Triangle extends GeometicShape
{
	private double base;
	private double leg1;
	private double leg2;
	private double height;
	
	public Triangle(double base, double leg1, double leg2, double height)
	{
		this.base = base;
		this.leg1 = leg1;
		this.leg2 = leg2;
		this.height = height;
	}

	@Override
	public double getPerimeter()
	{
		return base + leg1 + leg2;
	}

	@Override
	public double getArea()
	{		
		return (base * height) / 2;
	}
	
	@Override
	public String getLabel()
	{		
		return String.format("Triangle - base=%.2f, leg1=%.2f, leg2=%.2f, height=%.2f", base, leg1, leg2, height); 
	}

}
