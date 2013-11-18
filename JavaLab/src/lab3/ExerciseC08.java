package lab3;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseC08 extends ExerciseBase
{

	public ExerciseC08(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("min real number");
		printMinReal();
	}
	
	private void printMinReal()
	{
		double[] arr = new double[] {3.2, 2.7, 1.2, 4.1, 5.2};
		
		double min = arr[0];
		for (double d: arr)
		{
			if (d < min)
				min = d;
		}
		
		System.out.println(min);
	}
}
