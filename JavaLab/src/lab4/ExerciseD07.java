package lab4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import commonLab.ExerciseBase;

public class ExerciseD07 extends ExerciseBase
{

	public ExerciseD07(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("Generate arrays & find mean square");
		findMeanSquare();
	}
	
	private void findMeanSquare()
	{
		int[] numbers1 = generateAndSortArray();
		int[] numbers2 = generateAndSortArray();
		int[] numbers3 = generateAndSortArray();
		
		printArray("1", numbers1);
		printArray("2", numbers2);
		printArray("3", numbers3);
		
		double sumQuad1 = findSumQuad(numbers1);
		double sumQuad2 = findSumQuad(numbers2);
		double sumQuad3 = findSumQuad(numbers3);
		
		System.out.println("Array 1 mean quad: " + sumQuad1);
		System.out.println("Array 2 mean quad: " + sumQuad2);
		System.out.println("Array 3 mean quad: " + sumQuad3);

	}
	
	private double findSumQuad(int[] array)
	{
		double result = 0;
		double sum = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++)
		{
			if ((array[i] >= -20) && (array[i] <= 20))
			{
				sum += Math.pow(array[i], 2);
				count ++;
			}
		}
		
		if (count > 0)
			result = sum / count; 
		
		return result;
	}
	
	private int[] generateAndSortArray()
	{
		int[] result = new int[20];
		Random rnd = new Random();
		for (int i = 0; i < 20; i++)
		{
			result[i] = rnd.nextInt(200) - 100;			
		}
		
		Arrays.sort(result);
		
		return result;
	}
	
	private void printArray(String label, int[] array)
	{
		System.out.print("Array '" + label + "': ");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + ",");
		}
		System.out.println();
	}
}
