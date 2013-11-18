package lab3;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseC03 extends ExerciseBase
{

	public ExerciseC03(String title, Scanner scanIn)
	{
		super(title, scanIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("sum of positives");
		printSum();
	}
	
	private void printSum()
	{
		double[] arr = new double[] {2.3, -4.5, 6.2, -8.1, 5.3};
		
		double sum = 0;
		for(double d: arr)
		{
			if (d > 0)
				sum += d;
		}
		
		System.out.println(sum);
	}

}
