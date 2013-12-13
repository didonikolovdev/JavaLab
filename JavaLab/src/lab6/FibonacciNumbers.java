package lab6;

public class FibonacciNumbers
{
	private int[] numbers;
	
	private void calcFibNumbers(int i)
	{
		numbers = new int[i];
		if (i == 0)
			numbers[0] = 1;
		else if (i == 1)
		{
			numbers[0] = 1;
			numbers[1] = 1;
		}
		else
		{
			numbers[0] = 1;
			numbers[1] = 1;
			int prevNumber = 1;
			int prevPrevNumber = 1; 
			int counter = 1;
			while (counter < i)
			{				
				int currNumber = prevNumber + prevPrevNumber;
				numbers[counter] = currNumber;				
				prevPrevNumber = prevNumber;
				prevNumber = currNumber;
				counter ++;
			}
		}
	}
	
	private void printFibNumbers(int i)
	{		
		System.out.print("First " + i + " Fibonacci Numbers are:");
		for (int intValue : numbers)
		{
			System.out.print(" " + intValue);
		}
		System.out.println();
		
	}
	
	public void getSequence(int i) 
	{
		if (i < 0) 
			System.out.println("Input number must be positive (or zero)!");
		else 
		{		
			calcFibNumbers(i);
			printFibNumbers(i);
		}			 
	}
}
