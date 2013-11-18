package lab3;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseC06 extends ExerciseBase
{

	public ExerciseC06(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("sum of absolutes");
		printSumAbs();
	}
	
	private void printSumAbs()
	{
		double[] arr = new double[] {3.2, -2.7, -1.2, -4.1, 5.2};
		
		double sum = 0;
		for(double d: arr)
		{
			sum += Math.abs(d);
		}
		
		System.out.println(sum);
	}
}
