package lab3;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseC01 extends ExerciseBase
{
	
	private String[] inputArgs = null;

	public ExerciseC01(String title, Scanner scanIn, String[] inputArguments)
	{
		super(title, scanIn);
		inputArgs = inputArguments;
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("print input arguments");		
		printArgs();
	}

	private void printArgs()
	{
		for(String str: inputArgs)
		{
			System.out.println(str);
		}
	}

}
