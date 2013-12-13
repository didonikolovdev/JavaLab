package lab6a;

public class DeviceHDD implements IStorageDevice
{
	@Override
	public void read()
	{
		System.out.println("Reading from HDD...");
	}

	@Override
	public void write()
	{
		System.out.println("Writing to HDD...");
	}

}
