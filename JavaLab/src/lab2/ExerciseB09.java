package lab2;

import java.io.IOException;
import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB09 extends ExerciseBase 
{
	public ExerciseB09(String title, Scanner scanIn) 
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception 
	{
		super.printTitle("Print month name");
		printMonth();
	}
	
	private void printMonth() throws IOException
	{
		System.out.print("Enter month number (1-12):");
		int selection = super.getNextInteger();
		
		String selectedMonth = "";
		switch(selection)
		{
			case 1: selectedMonth = "January"; break;
			case 2: selectedMonth = "February"; break;
			case 3: selectedMonth = "March"; break;
			case 4: selectedMonth = "April"; break;
			case 5: selectedMonth = "May"; break;
			case 6: selectedMonth = "June"; break;
			case 7: selectedMonth = "July"; break;
			case 8: selectedMonth = "August"; break;
			case 9: selectedMonth = "September"; break;
			case 10: selectedMonth = "October"; break;
			case 11: selectedMonth = "November"; break;
			case 12: selectedMonth = "Decembrer"; break;
			default: selectedMonth = "Invalid selection!";
		}
		
		System.out.println(selectedMonth);
		
	}
}
