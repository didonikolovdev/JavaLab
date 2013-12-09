package lab5;

public class Stairway
{
	private int бройСтъпала;
	private String етикет;
	
	public Stairway(String етикет)
	{
		this.етикет = етикет;
	}
	
	public void установиБройСтъпала(int стойност)
	{
		бройСтъпала = стойност;
	}
	
	public int прочетиБройСтъпала()
	{
		return бройСтъпала;		
	}
	
	public void печатИнформация()
	{
		System.out.println("Стълбище '" + етикет + "' има " + бройСтъпала + " стъпала!" );
	}
}
