package lab2;

import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB02 extends ExerciseBase 
{

	public ExerciseB02(String title, Scanner scanIn) 
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() 
	{
		super.printTitle("reverse for");
		practiceReverseForCycle(20, 1, 2);		
	}
	
	private void practiceReverseForCycle(int startNumber, int endNumber, int decrement)
	{
		for (int i = startNumber; i > endNumber; i -= decrement)
		{
			System.out.println(i);
		}
	}
}
