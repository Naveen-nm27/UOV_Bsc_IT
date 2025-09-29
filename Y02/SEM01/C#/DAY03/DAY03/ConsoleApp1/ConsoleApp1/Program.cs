using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double[] marks = { 50, 60, 70, 80, 90 };

            double temp = 0;

            for (int i = 0; i < marks.Length; i++)
            {
                temp = temp + marks[i];
            }
            Console.WriteLine(temp / marks.Length);
        }
    }
}
