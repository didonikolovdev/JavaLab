package lab3;

import java.util.*;
import commonLab.ExerciseBase;

public class Lab3
{
	public static void main(String[] args)
	{
		Scanner scanIn = new Scanner(System.in);
		try
		{
			// Add exercises
			Map<String, ExerciseBase> exercises = new HashMap<String, ExerciseBase>();
			
			exercises.put("1", new ExerciseC01("Lab3 - Exercise 1", scanIn, args));
			exercises.put("2", new ExerciseC02("Lab3 - Exercise 2", scanIn));
			exercises.put("3", new ExerciseC03("Lab3 - Exercise 3", scanIn));
			exercises.put("4", new ExerciseC04("Lab3 - Exercise 4", scanIn));
			exercises.put("5", new ExerciseC05("Lab3 - Exercise 5", scanIn));
			exercises.put("6", new ExerciseC06("Lab3 - Exercise 6", scanIn));
			exercises.put("7", new ExerciseC07("Lab3 - Exercise 7", scanIn));
			exercises.put("8", new ExerciseC08("Lab3 - Exercise 8", scanIn));
			exercises.put("9", new ExerciseC09("Lab3 - Exercise 9", scanIn));

			// Read choice & execute
			String choice = "";
			do
			{
				System.out.println("Third Week: Select exercise to run (1 - 9) or X to exit");
				choice = scanIn.nextLine();
				
				if (exercises.containsKey(choice))
					exercises.get(choice).doExercise();
				else if (!choice.equalsIgnoreCase("x"))
					System.out.println("No such exercise! Please, select number from 1 to 9!");
				
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
