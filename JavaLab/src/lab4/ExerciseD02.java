package lab4;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseD02 extends ExerciseBase
{

	private String[] namesToSearch;
	
	public ExerciseD02(String title, Scanner scanIn, String[] names)
	{
		super(title, scanIn);
		namesToSearch = names;
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("Search Array - index of");		
		searchUsingIndexOf("n");
	}
	
	private void searchUsingIndexOf(String searchString)
	{		
		//print all names
		System.out.print("All Names: ");
		for (String name: namesToSearch)
		{
			System.out.print(name + "; ");
		}
		System.out.println();
		
		// print names starting with
		System.out.print("Names containing '" + searchString +"': " );
		
		for (String name: namesToSearch)
		{
			if (name.toLowerCase().indexOf(searchString.toLowerCase()) > -1)
				System.out.print(name + "; ");
		}
		System.out.println();
		System.out.println();
	}
}
