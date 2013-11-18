package lab2;

import java.io.IOException;
import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB06 extends ExerciseBase 
{
	public ExerciseB06(String title, Scanner scanIn) 
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception 
	{
		super.printTitle("print range");
		printRange();
	}
	
	private void printRange() throws IOException
	{
		int a, b; 
		System.out.print("Enter first number:");
		a = super.getNextInteger();
		System.out.print("Enter second number:");
		b = super.getNextInteger();
		
		for (int i = a; i <=b; i++)
		{
			System.out.println(i);
		}
	}

}
