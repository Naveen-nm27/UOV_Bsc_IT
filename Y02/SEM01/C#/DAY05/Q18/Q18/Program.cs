using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Q18
{
    internal class Program
    {
        delegate int Operation(int a, int b);

        static int Add(int x, int y) => x + y;

        static int Sub(int x, int y) => x * y;

        static int Mul(int x, int y) => x * y;

        static void Execute(Operation op, int a, int p) { 
            Console.WriteLine("Result: " + op(a,p));
        }
            static void Main(string[] args)
        {
            Execute(Add, 5, 3);
            Execute(Mul, 5, 3);

        }   
    }
}
