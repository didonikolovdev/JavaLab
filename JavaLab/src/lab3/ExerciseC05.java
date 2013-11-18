package lab3;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseC05 extends ExerciseBase
{

	public ExerciseC05(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("sum of squares > 3");
		printSumSquares();
	}

	private void printSumSquares()
	{
		double[] arr = new double[] {3.2, 2.7, 1.2, 4.1, 5.2};
		
		double sum = 0;
		for(double d: arr)
		{
			if (d > 3)
				sum += Math.pow(d,2);
		}
		
		System.out.println(sum);
	}

}
