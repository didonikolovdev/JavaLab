package lab2;

import java.io.IOException;
import java.util.Scanner;
import commonLab.ExerciseBase;

public class ExerciseB08 extends ExerciseBase 
{
	public ExerciseB08(String title, Scanner scanIn) 
	{
		super(title, scanIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doExercise() throws Exception 
	{
		super.printTitle("ATM repeat unitl exit");
		ATM();
		
	}
	
	private void ATM() throws IOException
	{		
		System.out.println("ATM Menu");
		System.out.println("1. Withdrawal");
		System.out.println("2. Change PIN");
		System.out.println("3. Balance");
		System.out.println("4. Settings");
		System.out.println("5. Exit");
		
		int choice = 0;		
		do 
		{
			choice = super.getNextInteger();
			String choiceText = "";
			switch(choice)
			{
				case 1: choiceText = "You selected: 1. Withdrawal"; break; 
				case 2: choiceText = "You selected: 2. Change PIN"; break;
				case 3: choiceText = "You selected: 3. Balance"; break;
				case 4: choiceText = "You selected: 4. Settings"; break;
				case 5: choiceText = "You selected: 5. Exit"; break;
				default: choiceText = "Invalid selection!";
			}
			
			System.out.println(choiceText);
		} while (choice != 5); 
	}
}

