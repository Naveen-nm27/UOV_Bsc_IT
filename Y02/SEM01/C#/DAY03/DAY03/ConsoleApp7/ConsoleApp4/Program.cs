using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp4
{

    enum Week
    {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
    }
    internal class Program
    {
        static void Main(string[] args)
        {

            Week day = Week.Monday;
            Console.WriteLine(Week.Monday);
        }
    }
}
