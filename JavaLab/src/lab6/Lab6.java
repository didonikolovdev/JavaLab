package lab6;

import lab6b.OperatingSystem;

public class Lab6
{
	public static void main(String[] args)
	{
		// Exercise 1
		System.out.println("Exercise 1 -----------");
		Person ivan = new Person("Petrov", "Ivan", 28);
		ivan.printInfo();
		Student georgi = new Student("Dimitrov", "Georgi", 19, "123456789");
		georgi.printInfo();
		System.out.println();
		
		//Exercise 2
		System.out.println("Exercise 2 -----------");
		lab6a.OperatingSystem os = new lab6a.OperatingSystem("OS(Interface)");
		os.writeToCurrentDevice();
		os.setStorageDevice(new lab6a.DeviceHDD());
		os.readFromCurrentDevice();
		os.writeToCurrentDevice();
		os.setStorageDevice(new lab6a.DeviceUSB());
		os.readFromCurrentDevice();
		os.writeToCurrentDevice();
		System.out.println();
		
		//Exercise 3
		System.out.println("Exercise 3 -----------");
		FibonacciNumbers fibNums = new FibonacciNumbers();
		fibNums.getSequence(10);
		System.out.println();
		
		//Exercise 4
		System.out.println("Exercise 4 -----------");
		lab6b.OperatingSystem osAbs = new OperatingSystem("OS(Abstract)");
		osAbs.writeToCurrentDevice();
		osAbs.setStorageDevice(new lab6b.DeviceSSD());
		osAbs.readFromCurrentDevice();
		osAbs.writeToCurrentDevice();
		osAbs.setStorageDevice(new lab6b.DeviceHDD());
		osAbs.readFromCurrentDevice();
		osAbs.writeToCurrentDevice();
		System.out.println();
		
		System.out.println("Exercise 5 -----------");
		Animal smallLion = new Lion();
		smallLion.introduceYourSelf();
		System.out.println();
	}
}
