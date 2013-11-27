package lab4;

import java.util.Scanner;

import commonLab.ExerciseBase;

public class ExerciseD03 extends ExerciseBase
{

	private String[] namesToSearch;
	
	public ExerciseD03(String title, Scanner scanIn, String[] names)
	{
		super(title, scanIn);
		namesToSearch = names;
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("Search Array - ends with");		
		searchByEndingString("s");
	}
	
	private void searchByEndingString(String endString)
	{		
		//print all names
		System.out.print("All Names: ");
		for (String name: namesToSearch)
		{
			System.out.print(name + "; ");
		}
		System.out.println();
		
		// print names starting with
		System.out.print("Names ending with '" + endString +"': " );
		
		for (String name: namesToSearch)
		{
			if (name.toLowerCase().endsWith(endString.toLowerCase()))
				System.out.print(name + "; ");
		}
		System.out.println();
		System.out.println();
	}

}
