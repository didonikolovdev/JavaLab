package lab2;

import java.io.IOException;
import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB10 extends ExerciseBase
{
	public ExerciseB10(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("print array");
		printArray();
	}

	private void printArray() throws IOException
	{		
		System.out.println("Enter array size:");
		int arraySize = super.getNextInteger();
		
		double[] arr = new double[arraySize];
		
		for (int i = 0; i < arraySize; i++)
		{
			arr[i] = Math.random();
			System.out.println(arr[i]);
		}		
	}
}
