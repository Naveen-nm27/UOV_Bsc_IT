using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Q17
{
    internal class Program
    {
        delegate int Adddelgate(int x, int y);  //declare delegate
        static int Add(int a, int b)
        { return a + b; } //method to match delgate

        static int mul(int a, int b)
        { return (a * b); }

        static int sub(int a,int b)
        { return (a - b); }
        static void Main(string[] args)
        {
            Adddelgate d = Add; //point delegate to add method
            int result = d(10, 20);
            int result2 = mul(10, 20);
            Console.WriteLine("Sub = " + result);
            d += sub;
            Console.WriteLine(result2);
            Console.WriteLine("Sub = " + result);
        }
    }
}
