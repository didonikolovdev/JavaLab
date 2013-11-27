package lab4;

import java.util.*;

import commonLab.ExerciseBase;

public class Lab4
{

	public static void main(String[] args)
	{
		Scanner scanIn = new Scanner(System.in);
		try
		{			
			//shared between several classes
			String[] names = new String[]{"George", "Georganna", "John", "Gery", "james", "Jones", "ned"};
			
			// Add exercises
			Map<String, ExerciseBase> exercises = new HashMap<String, ExerciseBase>();
			
			exercises.put("1", new ExerciseD01("Lab4 - Exercise 1", scanIn, names));
			exercises.put("2", new ExerciseD02("Lab4 - Exercise 2", scanIn, names));
			exercises.put("3", new ExerciseD03("Lab4 - Exercise 3", scanIn, names));
			exercises.put("4", new ExerciseD04("Lab4 - Exercise 4", scanIn, names));
			exercises.put("5", new ExerciseD05("Lab4 - Exercise 5", scanIn));
			exercises.put("6", new ExerciseD06("Lab4 - Exercise 6", scanIn));
			exercises.put("7", new ExerciseD07("Lab4 - Exercise 7", scanIn));

			// Read choice & execute
			String choice = "";
			do
			{
				System.out.println("Fourth Week: Select exercise to run (1 - 7) or X to exit");
				choice = scanIn.nextLine();
				
				if (exercises.containsKey(choice))
					exercises.get(choice).doExercise();
				else if (!choice.equalsIgnoreCase("x"))
					System.out.println("No such exercise! Please, select number from 1 to 7!");
				
			} while (!choice.equalsIgnoreCase("x"));
		} catch (Exception ex)
		{
			System.out.println("Error: " + ex.getMessage());
		} finally
		{
			scanIn.close();
		}
	}
}
