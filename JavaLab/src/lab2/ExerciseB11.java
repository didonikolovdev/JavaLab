package lab2;

import java.io.IOException;
import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB11 extends ExerciseBase
{

	public ExerciseB11(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws IOException
	{
		super.printTitle("read and print arrays");
		int[] inputArray = super.readIntArray();
		printArray(inputArray);
		reversePrintArray(inputArray);
	}	
	
	private void printArray(int[] inputArray)
	{
		for (int i = 0; i < inputArray.length; i++)
		{
			System.out.println(inputArray[i]);
		}
	}
	
	private void reversePrintArray(int[] inputArray)
	{
		for (int i = inputArray.length - 1; i >= 0; i--)
		{
			System.out.println(inputArray[i]);
		}
	}
}
