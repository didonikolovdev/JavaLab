package lab4;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseD05 extends ExerciseBase
{

	public ExerciseD05(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("Factorial");		
		
		int number = 10;
		System.out.println(number + "! = ");
		System.out.print("  by cycle: " + factorialByCycle(number));
		System.out.println();
		System.out.println("  by recursion: " + factorialByRecursion(number));
		
	}
	
	private int factorialByCycle(int number)
	{
		int result = 1;
		
		for (int i = 1; i <= number; i++)
		{
			result *= i;
		}
		
		return result;
	}
	
	private int factorialByRecursion(int number)
	{
		if (number >= 2)
			return number * factorialByRecursion(number - 1);
		
		return 1;
	}

}
