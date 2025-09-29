using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp4
{

  static class cal
    {
        public static double add(double num1,double num2)
        {
            return num1 + num2;
        }

        public static double sub(double num1, double num2)
        {
            return num1  - num2;
        }

        public static double mul(double num1, double num2)
        {
            return num1 * num2;
        }

        public static double div(double num1, double num2)
        {
            return num1 / num2;
        }


    }
    internal class Program
    {
        static void Main(string[] args)
        {

            Console.WriteLine("Enetr number 1: ");
            double num1  = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Enetr number 1: ");
            double num2 = Convert.ToDouble(Console.ReadLine());



            Console.WriteLine("Add: " + cal.add(num1,num2));
            Console.WriteLine("Sub: " + cal.sub(num1,num2));
            Console.WriteLine("Mul: " + cal.mul(num1,num2));
            Console.WriteLine("Div: " + cal.div(num1,num2));
           
        }
    }
}
