package lab2;

import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB14 extends ExerciseBase
{

	public ExerciseB14(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle(" sum of all negatives");
		displaySum();
	}
	
	private void displaySum()
	{
		int[] numbers = new int[] {1, -5, -4, 20, 0, 5, -4, 7};
		
		int negSum = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] < 0)
			{
				negSum += numbers[i];
				continue;
			}
			
			System.out.println("numbers[" + i + "]=" + numbers[i]);
		}
		
		System.out.println("Sum of all negatives is " + negSum);
	}
}
