package lab7c;

public class Property
{
	//Fields
	private double area;
	private double pricePerUnit;
	private String label;
	
	//Constructor
	public Property(double area, double pricePerUnit, String label)
	{
		this.setArea(area);
		this.setPricePerUnit(pricePerUnit);
		this.setLabel(label);		
	}
	
	//Properties
	public String getLabel()
	{
		return label;
	}
	
	public void setLabel(String label)
	{
		this.label = label;
	}

	public double getPricePerUnit()
	{
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit)
	{
		this.pricePerUnit = pricePerUnit;
	}

	public double getArea()
	{
		return area;
	}

	public void setArea(double area)	
	{
		this.area = area;
	}	
	
	//Public Methods
	public double getTotalPrice()
	{
		return area * pricePerUnit;
	}
	
}
