package lab3;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseC09 extends ExerciseBase
{

	public ExerciseC09(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("sum of elements on even position");
		printEvenSum();
	}
	
	private void printEvenSum()
	{
		double[] arr = new double[] {3.2, 2.7, 1.2, 4.1, 5.2, 6.6, 3.1, 5.4};
		
		double sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (i % 2 == 0)
			{
				sum += arr[i];
				System.out.println(i);
			}
		}
		
		System.out.println(sum);
	}
}
