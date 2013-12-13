package lab6a;

public class DeviceUSB implements IStorageDevice
{
	@Override
	public void read()
	{
		System.out.println("Reading from USB...");
	}

	@Override
	public void write()
	{
		System.out.println("Writing to USB...");
	}

}
