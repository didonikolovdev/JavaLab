using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CourseProject4ag
{
	class Program
	{
		private static String[] defaultCities = new String[] {"София","Пловдив","Варна","Бургас","Русе","Стара Загора",
			"Плевен","Добрич","Сливен","Шумен","Перник","Хасково",
			"Ямбол","Пазарджик","Благоевград","Велико Търново","Враца",
			"Габрово","Асеновград","Видин","Казанлък","Кърджали",
			"Кюстендил","Монтана","Димитровград","Търговище","Силистра",
			"Ловеч","Дупница","Разград"}; 

		static void Main(string[] args)
		{
            Console.InputEncoding = Encoding.GetEncoding("Cyrillic");
            Console.OutputEncoding = Encoding.GetEncoding("Cyrillic");
			List<string> cityList = GetCities();
            List<string> filteredList = GetFilteredList(cityList);
            filteredList.ForEach(x => Console.WriteLine(x));
		}

        private static List<string> GetCities()
        {
            List<string> result = new List<string>();
            Console.WriteLine("Enter city or 1 to exit or 2 to use default city list:");
            bool useDefault = false;
            bool exit = false;
            do
            {
                string currentSelection = Console.ReadLine();
                if (currentSelection == "1")
                    exit = true;
                else if (currentSelection == "2")
                    useDefault = exit = true;
                else
                    result.Add(currentSelection);
            } while (!exit);

            if (useDefault)
                result = new List<string>(defaultCities);

            return result;
        }

        private static List<string> GetFilteredList(List<string> inputList)
        {
            List<string> result = new List<string>();
            foreach (string city in inputList)
            {
                int eCount = city.ToUpper().Count(x => x == 'Е');
                int pCount = city.Count(x => x == 'р');
                if ((pCount == 0) && (eCount >= 2 && eCount <= 4))
                    result.Add(city);
            }
            return result;
        }
	}
}
