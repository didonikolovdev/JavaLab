package commonLab;

import java.io.IOException;
import java.util.Scanner;

public abstract class ExerciseBase 
{
	private String excerciseTitle = "";
	private Scanner intScanner = null;	
	
	public ExerciseBase(String title, Scanner scanIn)
	{		
		excerciseTitle = title;
		intScanner = scanIn;
	}
	
	public void printTitle(String titleSuffix)
	{
		System.out.println(excerciseTitle + " - " + titleSuffix);	
	}	
	
	public abstract void doExercise() throws Exception;

	public Scanner getScanner() throws IOException
	{
		checkScanner();
		return intScanner;
	}
	
	public int getNextInteger() throws IOException
	{
		checkScanner();
		
		int result = intScanner.nextInt();
		intScanner.nextLine(); // to consume \n
		
		return result;
	}
	
	public void checkScanner() throws IOException 
	{
		if (intScanner == null)
			throw new IOException("Scanner not initalized!");
	}
	
	public int[] readIntArray() throws IOException
	{
		System.out.print("Enter array size:");
		int arraySize = getNextInteger();
		
		int[] result = new int[arraySize];		
		for (int i = 0; i < arraySize; i++)
		{
			result[i] = getNextInteger();
		}
		
		return result;
	}
}
