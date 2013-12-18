package courseproject;

import java.util.*;

public class Task4ag
{
	private static String[] defaultCities = new String[] {"София","Пловдив","Варна","Бургас","Русе","Стара Загора",
			"Плевен","Добрич","Сливен","Шумен","Перник","Хасково",
			"Ямбол","Пазарджик","Благоевград","Велико Търново","Враца",
			"Габрово","Асеновград","Видин","Казанлък","Кърджали",
			"Кюстендил","Монтана","Димитровград","Търговище","Силистра",
			"Ловеч","Дупница","Разград"}; 
	
	public static void main(String[] args)
	{
		Scanner scanIn = new Scanner(System.in);
		try
		{		
			//1. Read array elements
			ArrayList<String> cityArray = getCityArray(scanIn);			
			
			//2. Print out names filtered on given condition
			if ((cityArray != null) && (!cityArray.isEmpty()))
			{
				ArrayList<String> filtered = getFilteredList(cityArray);
				printArray(filtered);
			}
			else
				System.out.println("Invalid selection of cities!");
		}
		catch(Exception ex)
		{
			
		}
		finally
		{
			scanIn.close();
		}
	}
	
	private static ArrayList<String> getCityArray (Scanner scanIn)
	{		
		ArrayList<String> result = new ArrayList<>();
		boolean useDefault = false;
		String choice = "";
		do
		{
			System.out.println("Enter city name or 1 to exit or 2 to use default city array:");
			choice = scanIn.nextLine();
			if (choice.equals("2"))
			{
				useDefault = true;
				break;
			}
			else
				result.add(choice);
			
		} while (!choice.equals("1"));
		
		//Check for default choice
		if (useDefault)
			result = new ArrayList<>(Arrays.asList(defaultCities)); 
		
		return result;		
	}
	
	private static ArrayList<String> getFilteredList(ArrayList<String> inputList)
	{
		ArrayList<String> result = new ArrayList<>();
		
		for (int i = 0; i < inputList.size(); i++)
		{
			String currentCity = inputList.get(i);
			int eChars = countChars(currentCity, 'е', 'Е');
			int pChars = countChars(currentCity, 'р');
			if ((pChars == 0) && (eChars >= 2 && eChars <= 4))
				result.add(currentCity);
		}
		
		return result;
	}
	
	private static int countChars (String inputString, char...chars)
	{
		int result = 0;
		for(int i = 0; i < inputString.length(); i++)
		{
			char currChar = inputString.charAt(i);
			for(char c : chars)
			{
				if (currChar == c)
				{
					result ++;
					continue;
				}
			}
		}
		return result;
	}
	
	private static void printArray(ArrayList<String> inputArray)
	{
		for (int i = 0; i < inputArray.size(); i++)
			System.out.println(inputArray.get(i));
	}
}
