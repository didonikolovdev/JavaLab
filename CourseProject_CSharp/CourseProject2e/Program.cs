using System;
using System.Linq;

namespace CourseProject_CSharp
{
    class Program
    {
        private static int[] x, y, z;
        static Random rnd = new Random();

        static void Main(string[] args)
        {
            x = new int[rnd.Next(20)];
            y = new int[rnd.Next(20)];
            z = new int[rnd.Next(20)];

            FillArrayWithRandoms(x);
            FillArrayWithRandoms(y);
            FillArrayWithRandoms(z);

            PrintArray("x", x);
            PrintArray("y", y);
            PrintArray("z", z);

            double meanGeomX = ComputeMeanGeom(x);
            double meanGeomY = ComputeMeanGeom(y);
            double meanGeomZ = ComputeMeanGeom(z);

            Console.WriteLine("Mean Geometric of the array x = " + meanGeomX.ToString());
            Console.WriteLine("Mean Geometric of the array y = " + meanGeomY.ToString());
            Console.WriteLine("Mean Geometric of the array z = " + meanGeomZ.ToString());
        }

        static void PrintArray(string label, int[] inputArray)
        {
            Console.WriteLine(String.Format("Length of array '{0}' is {1}", label, inputArray.Length));
            for (int i = 0; i < inputArray.Length; i++)
                Console.WriteLine(String.Format("{0}[{1}]={2}", label, i, inputArray[i]));
        }

        static double ComputeMeanGeom(int[] inputArray)
        {
            Func<int, bool> filter = (x) => ((x >= 6) && (x <= 50));
            int count = inputArray.Count(filter);
            double sum = inputArray.Where(filter).Sum();
            double degree = 1 / (double)count;
            return Math.Pow(sum, degree);
        }

        static void FillArrayWithRandoms(int[] inputArray)
        {
            for (int i = 0; i < inputArray.Length; i++)
                inputArray[i] = rnd.Next(-100, 100);
        }
    }
}