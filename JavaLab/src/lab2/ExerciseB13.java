package lab2;

import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB13 extends ExerciseBase
{

	public ExerciseB13(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("read array and display index)");
		int[] inputArray = super.readIntArray();
		displayIndex(30, inputArray);
	}

	private void displayIndex(int number, int[] inputArray)
	{
		for (int i = 0; i < inputArray.length; i++)
		{
			if (inputArray[i] >= number)
			{
				System.out.println("Index of " + number + " is " + (i + 1));
			}
		}
	}
}
