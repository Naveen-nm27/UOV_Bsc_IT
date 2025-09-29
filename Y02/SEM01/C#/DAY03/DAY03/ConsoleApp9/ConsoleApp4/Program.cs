using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp4
{

    struct rect{
        public double length;
        public double x;

        public double area()
        {
            return length;
        }
    }
    
    class car
    {
        String Modle;
        DateTime year;
    }

    //sealed class car
    //{
    //    String Modle;
    //    DateTime year;
    //}

    class volsvagen : car
    {

    }
    internal class Program
    {
        static void Main(string[] args)
        {
            
        }
    }
}
