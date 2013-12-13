package lab6b;


public class OperatingSystem
{
	
	private String osName; 
	private CommonStorageDevice currentDevice;
	
	public OperatingSystem(String osName)
	{
		this.osName = osName;
	}
	
	public void setStorageDevice(CommonStorageDevice device)
	{
		currentDevice = device;
	}
	
	public void writeToCurrentDevice()
	{
		if (currentDevice == null)
			System.out.println("No storage device assigned!");
		else 
		{
			System.out.print(osName + " message: ");
			currentDevice.write();
		}
	}	
	
	public void readFromCurrentDevice()
	{
		if (currentDevice == null)
			System.out.println("No storage device assigned!");
		else 
		{
			System.out.print(osName + " message: ");
			currentDevice.read();
		}
	}
}