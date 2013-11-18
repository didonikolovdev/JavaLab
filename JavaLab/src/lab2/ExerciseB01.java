package lab2;

import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB01 extends ExerciseBase
{

	public ExerciseB01(String title, Scanner scanIn) 
	{
		super(title, scanIn);
	}
	
	@Override
	public void doExercise() 
	{
		super.printTitle("for cycle");
		practiceForCycle(1, 10);
		
		super.printTitle("while cycle");
		practiceWhileCycle(1, 10);
		
		super.printTitle("do-while cycle");
		practiceDoWhileCycle(1, 10);		
	}
	
	private void practiceForCycle(int startNumber, int endNumber)
	{		
		for (int i = startNumber; i <= endNumber; i++)
		{
			System.out.println(i);
		}		
	}
		
	private void practiceWhileCycle(int startNumber, int endNumber)
	{			
		int i = startNumber;
		while (i <= endNumber)
		{
			System.out.println(i);
			i++;
		}
	}
	
	private void practiceDoWhileCycle(int startNumber, int endNumber)
	{		
		int i = startNumber;
		
		do
		{
			System.out.println(i);
			i++;
		}
		while (i <= endNumber);		
	}

}
