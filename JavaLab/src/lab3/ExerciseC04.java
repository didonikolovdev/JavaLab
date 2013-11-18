package lab3;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseC04 extends ExerciseBase
{

	public ExerciseC04(String title, Scanner scanIn)
	{
		super(title, scanIn);		
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("sqrt of sum of squares");
		printSqrtSum();
	}
	
	private void printSqrtSum()
	{
		double[] arr = new double[] {3.2, 4.7, 7.2, 9.1, 6.5};
		
		double sum = 0;
		for(double d: arr)
		{
			sum += Math.pow(d, 2);
		}
		
		double sqrtSum = Math.sqrt(sum);
		
		System.out.println(sqrtSum);
	}
}
