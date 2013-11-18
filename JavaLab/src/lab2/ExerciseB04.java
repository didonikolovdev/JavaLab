package lab2;

import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB04 extends ExerciseBase 
{

	public ExerciseB04(String title, Scanner scanIn) 
	{
		super(title, scanIn);	
	}

	@Override
	public void doExercise() 
	{
		super.printTitle("find max number - compare 1 and 3");
		maxNum(1, 3);
		
		super.printTitle("find max number - compare 10 and 5");
		maxNum(10, 5);
		
		super.printTitle("find max number - compare 11 and 11");
		maxNum(11, 11);
	}
	
	private void maxNum(int firstNum, int secondNum)
	{			
		int maxNum = findMaxNum(firstNum, secondNum);
		
		System.out.println(maxNum);
	}

	public static int findMaxNum(int firstNum, int secondNum) 
	{
		int maxNum = firstNum;
		if (secondNum >= maxNum)
			maxNum = secondNum;
		return maxNum;
	}
}
