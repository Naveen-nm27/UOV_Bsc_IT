using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Q20
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter a String 1");
            String str1 = Console.ReadLine();

            Console.WriteLine("String Length");
            Console.WriteLine(str1.Length);
            Console.WriteLine("UpperCase");
            Console.WriteLine(str1.ToUpper());
            Console.WriteLine("Reverse");
            for (int i = str1.Length - 1; i >= 0; i--) { 
                Console.Write(str1[i]);
            }
            Console.WriteLine();

            Console.WriteLine("Reverse 2");
            char[] arr = str1.ToCharArray();
            Array.Reverse(arr);
            Console.WriteLine(arr);
 
        }
    }
}
