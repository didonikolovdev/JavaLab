package courseproject;

import java.util.*;

public class Task2e
{
	static int[] x,y,z;
	static Random rand = new Random();
	 
	static int pRand(int mod) 
	{
	  return Math.abs(rand.nextInt()) % mod + 1;	    
	}
	
	static void randar(int[] array)
	{
	    for(int i = 0; i < array.length; i++)
	      array[i] = pRand(200) - 100;
	}
	
	static void printar(int[] array, char x) 
	{
		System.out.println("length of the array " + x + " = " + array.length);
	    for(int i = 0; i < array.length; i++)
	      System.out.println(x + "[" + i + "] = " + array[i]);
	}  
	
	static double meanGeom(int[] array)
	{
		//1. Calculate product for elements in [6,50] interval
		int product = 1;
		int intervalMembersCount = 0;
		for (int num : array)
		{
			if ((num >= 6) && (num <= 50))
			{
				product *= num;
				intervalMembersCount ++;
			}
		}
		
		//2. Calculate nth root
		if (intervalMembersCount > 0) //no elements in 6-50 range 
		{
			double degree = 1 / (double)intervalMembersCount;
			double root = Math.pow(product, degree);		
			return root;
		}
		else
			return 0;
	}
	
	public static void main(String[] args)
	{	
		//initialize 3 arrays
		x = new int[pRand(20)];
		y = new int[pRand(20)];
		z = new int[pRand(20)];
		
		//fill them with random numbers
		randar(x);
		randar(y);
		randar(z);
		
		//display in console
		printar(x, 'x');
		printar(y, 'y');
		printar(z, 'z');
		
		//Calculate & Display Mean Geometric 
		double mgX = meanGeom(x);
		double mgY = meanGeom(y);
		double mgZ = meanGeom(z);
		System.out.println("Mean Geometric of the array x = " + mgX);
		System.out.println("Mean Geometric of the array y = " + mgY);
		System.out.println("Mean Geometric of the array z = " + mgZ);
		System.out.println("Sum of Mean Geometrics of x,y,z="+ (mgX + mgY + mgZ));		
	}
}
