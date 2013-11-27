package lab4;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseD04 extends ExerciseBase
{

	private String[] namesToSearch;
	
	public ExerciseD04(String title, Scanner scanIn, String[] names)
	{
		super(title, scanIn);
		namesToSearch = names;
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("Search Array - Capital Letters");		
		searchCapitalLetters();
	}
	
	private void searchCapitalLetters()
	{		
		//print all names
		System.out.print("All Names: ");
		for (String name: namesToSearch)
		{
			System.out.print(name + "; ");
		}
		System.out.println();
		
		// print names starting with
		System.out.print("Names with first capital: ");
		
		for (String name: namesToSearch)
		{			
			if ( Character.isUpperCase(name.charAt(0)))
				System.out.print(name + "; ");
		}
		System.out.println();
		System.out.println();
	}

}
