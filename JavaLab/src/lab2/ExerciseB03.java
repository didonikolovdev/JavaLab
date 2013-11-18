package lab2;

import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB03 extends ExerciseBase 
{

	public ExerciseB03(String title, Scanner scanIn) 
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() 
	{
		
		super.printTitle("print a & b - first var");
		practicePrintABFirstVariation();
	
		super.printTitle("print a & b - second var");
		practicePrintABSecondVariation();		
	}
	
	private void practicePrintABFirstVariation()
	{
		
		for (int i= 0; i < 5; i++)
		{
			System.out.print('a');
		}
		
		for (int i= 0; i < 10; i++)
		{
			System.out.print('b');
		}
		System.out.println();
	}
	
	private void practicePrintABSecondVariation()
	{
		for (int i = 0; i < 15; i++)
		{
			if (i < 5)
				System.out.print('a');
			else
				System.out.print('b');
		}
		System.out.println();
	}
}
