package lab7a;

public interface ICar
{	
	public void starEngine();
	public void stopEngine();
	public void gearUp();
	public void gearDown();
	public void accelerate(int kmh);
	public void decelerate(int kmh);
	public void brakeToStop();
	
	public void printInfo();
}
