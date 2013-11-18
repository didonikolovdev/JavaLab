package lab2;

import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB12 extends ExerciseBase
{

	public ExerciseB12(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("Print array with Break");
		printArrayBreak();
	}

	private void printArrayBreak()
	{
		int[] array = new int[] { 1, 5, 7, 12, 33, 8, 9 };

		for (int i = 0; i < array.length; i++)
		{
			if (array[i] >= 30)
				break;
			else
				System.out.println("array[" + i + "]=" +array[i]);
		}
	}
}
