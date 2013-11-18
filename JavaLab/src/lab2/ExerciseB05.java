package lab2;

import java.io.IOException;
import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB05 extends ExerciseBase 
{
	public ExerciseB05(String title, Scanner scanIn) 
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception 
	{
		super.printTitle("find max of three numbers");
		findMaxOfThreeNumbers();
	}
	
	private void findMaxOfThreeNumbers() throws IOException
	{
		int a, b, c; 
		System.out.print("Enter first number:");
		a = super.getNextInteger();
		System.out.print("Enter second number:");
		b = super.getNextInteger();
		System.out.print("Enter third number:");
		c = super.getNextInteger();
		int maxofThree = ExerciseB04.findMaxNum(a, b) > c ? ExerciseB04.findMaxNum(a, b) : c;
		
		System.out.println(maxofThree + " is max");
	}

}
