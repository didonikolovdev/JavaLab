package lab6a;

public class DeviceSSD implements IStorageDevice
{

	@Override
	public void read()
	{
		System.out.println("Reading from SSD...");
	}

	@Override
	public void write()
	{
		System.out.println("Writing to SSD...");
	}
}
