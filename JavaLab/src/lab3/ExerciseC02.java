package lab3;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseC02 extends ExerciseBase
{

	public ExerciseC02(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("average");
		printAverage();
	}

	private void printAverage()
	{
		double[] arr = new double[] {2.3, 4.5, 6.2, 8.1, 5.3};
		
		double sum = 0;
		for(double d: arr)
		{
			sum += d;
		}
		
		double average = sum / arr.length;
		
		System.out.println(average);
	}
}
