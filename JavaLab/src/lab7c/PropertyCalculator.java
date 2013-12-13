package lab7c;

public class PropertyCalculator
{
	public static void getTotalPrice(Property...properties)
	{
		double totalPrice = 0;
		double totalArea = 0;
		
		for (Property prop : properties)
		{
			totalPrice += prop.getTotalPrice();
			totalArea += prop.getArea();
			System.out.println(String.format("%.2f square meters %s property has price %.3f", prop.getArea(), prop.getLabel(), prop.getTotalPrice()) );
		}
		
		System.out.println(String.format("Total price for %.2f square meters is %.3f", totalArea, totalPrice));
	}

}
