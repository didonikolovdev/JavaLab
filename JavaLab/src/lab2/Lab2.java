package lab2;

import java.util.*;
import commonLab.ExerciseBase;

public class Lab2
{
	public static void main(String[] args)
	{
		Scanner scanIn = new Scanner(System.in);
		try
		{
			// Add exercises
			Map<String, ExerciseBase> exercises = new HashMap<String, ExerciseBase>();
			exercises.put("1", new ExerciseB01("Lab2 - Exercise 1", scanIn));
			exercises.put("2", new ExerciseB02("Lab2 - Exercise 2", scanIn));
			exercises.put("3", new ExerciseB03("Lab2 - Exercise 3", scanIn));
			exercises.put("4", new ExerciseB04("Lab2 - Exercise 4", scanIn));
			exercises.put("5", new ExerciseB05("Lab2 - Exercise 5", scanIn));
			exercises.put("6", new ExerciseB06("Lab2 - Exercise 6", scanIn));
			exercises.put("7", new ExerciseB07("Lab2 - Exercise 7", scanIn));
			exercises.put("8", new ExerciseB08("Lab2 - Exercise 8", scanIn));
			exercises.put("9", new ExerciseB09("Lab2 - Exercise 9", scanIn));
			exercises.put("10", new ExerciseB10("Lab2 - Exercise 10", scanIn));
			exercises.put("11", new ExerciseB11("Lab2 - Exercise 11", scanIn));
			exercises.put("12", new ExerciseB12("Lab2 - Exercise 12", scanIn));
			exercises.put("13", new ExerciseB13("Lab2 - Exercise 13", scanIn));
			exercises.put("14", new ExerciseB14("Lab2 - Exercise 14", scanIn));
			exercises.put("15", new ExerciseB15("Lab2 - Exercise 15", scanIn));

			// Read choice & execute
			String choice = "";
			do
			{
				System.out.println("Second Week: Select exercise to run (1 - 15) or X to exit");
				choice = scanIn.nextLine();

				if (exercises.containsKey(choice))
					exercises.get(choice).doExercise();
				else if (!choice.equalsIgnoreCase("x"))
					System.out.println("No such exercise! Please, select number from 1 to 15!");
				
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
