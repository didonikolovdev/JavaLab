package lab4;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseD01 extends ExerciseBase
{

	private String[] namesToSearch;
	
	public ExerciseD01(String title, Scanner scanIn, String[] names)
	{
		super(title, scanIn);
		namesToSearch = names;
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("Search Array from start");		
		searchByStartString("Ge");
	}
	
	private void searchByStartString(String startString)
	{		
		//print all names
		System.out.print("All Names: ");
		for (String name: namesToSearch)
		{
			System.out.print(name + "; ");
		}
		System.out.println();
		
		// print names starting with
		System.out.print("Names starting with '" + startString +"': " );
		
		for (String name: namesToSearch)
		{
			if (name.startsWith(startString))
				System.out.print(name + "; ");
		}
		System.out.println();
		System.out.println();
	}
}
