package lab2;

import java.io.IOException;
import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB15 extends ExerciseBase
{

	public ExerciseB15(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("Pyramid of letters");
		printPyramid();
	}
	
	private void printPyramid()	throws IOException
	{
		System.out.println("Enter pyramid size:");
		int rowsColumns = super.getNextInteger();
		
		for (int i = 1; i <= rowsColumns; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print('A');
			}
			
			System.out.println();
		}
	}
}
