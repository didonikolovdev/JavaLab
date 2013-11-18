package lab3;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseC07 extends ExerciseBase
{

	public ExerciseC07(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("max real number");
		printMaxReal();
	}
	
	private void printMaxReal()
	{
		double[] arr = new double[] {3.2, 2.7, 1.2, 4.1, 5.2};
		
		double max = arr[0];
		for (double d: arr)
		{
			if (d > max)
				max = d;
		}
		
		System.out.println(max);
	}
}
