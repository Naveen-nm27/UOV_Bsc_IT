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
            Console.WriteLine("Enter Number 1");
            int num1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enetr Number 2");
            int num2 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Sum: " + Convert.ToInt32(num1 + num2));
            Console.WriteLine("Dif: " + Convert.ToInt32(num1 - num2));
            Console.WriteLine("mul: " + Convert.ToInt32(num1 * num2));
            Console.WriteLine("div: " + Convert.ToInt32(num1 / num2));

    }
}
