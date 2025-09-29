using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp4
{

    struct Rectangle
    {
        public double width;
        public double height;

        public double area()
        {
            return width * height;
        }
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Rectangle rect = new Rectangle();

            Console.WriteLine("Enter width: ");
            Console.WriteLine("--------------------");
            rect.width = Convert.ToDouble(Console.ReadLine());
            
            Console.WriteLine("Enter height: ");
            Console.WriteLine("--------------------");
            rect.height = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("/////////////////");

            Console.WriteLine("Area: " + rect.area());
            Console.WriteLine("Parameter: " + ((rect.width * 2)+ (2 * rect.height)));
        }
    }
}
