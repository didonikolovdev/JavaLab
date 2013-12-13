package lab6b;

public abstract class CommonStorageDevice implements IStorageDevice
{
	private String deviceLabel;
	
	
	public CommonStorageDevice(String deviceLabel)
	{
		this.deviceLabel = deviceLabel;
	}
	
	public void read()
	{
		System.out.println("Reading from " + deviceLabel + "...");
	}
	
	public void write()
	{
		System.out.println("Writing to " + deviceLabel + "...");
	}
}
