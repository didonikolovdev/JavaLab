package lab7a;

public abstract class Car implements ICar
{	
	//Fields
	private String label;
	private int gears;
	private int maxSpeed;
	private int currentGear = 0;
	private int currentSpeed = 0;
	private boolean engineRunning = false;

	//Constructor
	public Car(int gears, int maxSpeed, String label)
	{
		this.gears = gears;
		this.maxSpeed = maxSpeed;
		this.label = label;
	}
	
	//Properties
	public int getCurrentGear()
	{
		return currentGear;
	}
	
	public int getCurrentSpeed()
	{
		return currentSpeed;		
	}
	
	public boolean getEngineRunning()
	{
		return engineRunning;
	}	
	
	//ICar methods
	@Override
	public void starEngine()
	{
		if (engineRunning)
			System.out.println("Engine already started");
		else 
		{
			engineRunning = true;
			System.out.println("Engine started");
		}
	}

	@Override
	public void stopEngine()
	{
		if (currentSpeed > 0)
			System.out.println("Cant stop engine while in motion");
		else
		{
			engineRunning = false;
			System.out.println("Engine stopped");
		}
	}

	@Override
	public void gearUp()
	{
		if (currentGear < gears) 
		{
			currentGear ++;
			System.out.println("GearUp to " + currentGear);
		}
		else
			System.out.println("Already at max gear");
			
	}

	@Override
	public void gearDown()
	{
		if (currentGear > 0)
		{
			currentGear --;
			System.out.println("GearDown to " + currentGear);			
		}
		else
			System.out.println("Already at neutral");
	}

	@Override
	public void accelerate(int kmh)
	{
		if (currentSpeed < maxSpeed )
			currentSpeed += kmh;
		System.out.println("Current speed " + currentSpeed + "km/h");
	}

	@Override
	public void decelerate(int kmh)
	{
		if (currentSpeed > 0 )
			currentSpeed -= kmh;
		
		if (currentSpeed < 0)
			currentSpeed = 0;
		
		System.out.println("Current speed " + currentSpeed + "km/h");
	}
	
	@Override
	public void brakeToStop()
	{
		currentGear = 0;
		currentSpeed = 0;
		System.out.println("Hard braking to 0 km/h and stop the engine");
	}
	
	@Override
	public void printInfo()
	{
		System.out.print(label + " - ");
		System.out.print(getEngineRunning() ? "Engine running - " : "Engine stopped - ");
		System.out.println("Current speed is " + getCurrentSpeed() + " km/h, Current gear is " + getCurrentGear());

	}
 

}
