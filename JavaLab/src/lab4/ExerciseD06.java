package lab4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import commonLab.ExerciseBase;

public class ExerciseD06 extends ExerciseBase
{

	public ExerciseD06(String title, Scanner scanIn)
	{
		super(title, scanIn);
	}

	@Override
	public void doExercise() throws Exception
	{
		super.printTitle("Binary search");
		searchArrayBinary(5);		
	}
	
	private void searchArrayBinary(int searchValue)
	{
		int maxNum = 100;
		
		int[] numbers = new int[15];
		Random rnd = new Random();
		
		//fill random values
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = rnd.nextInt(maxNum);
		}		
				
		//sort
		Arrays.sort(numbers);
		
		//print array
		System.out.print("Searching for '" + searchValue + "' in array:");
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + ", ");
		}
		System.out.println();
		
		//search 
		int searchIndex = binarySearch(searchValue, 0, numbers.length-1, numbers);
		
		System.out.println("Index: " + searchIndex);
	}
	
	private int binarySearch(int searchValue, int startIndex, int endIndex, int[] numbers)
	{
		int middle = (startIndex + endIndex) / 2;
		if (numbers[middle] == searchValue) //value found
			return middle;
		else if (startIndex != endIndex) // search again
		{
			if (numbers[middle] > searchValue)
				return binarySearch(searchValue, startIndex, middle -1, numbers);
			else
				return binarySearch(searchValue, middle + 1, endIndex, numbers);
		}
		else // value not found in array
			return -1;			
	}
	
}
