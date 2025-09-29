using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Q22
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<String> names = new List<String>();

            names.Add("Naveen");
            names.Add("Batman");
            names.Add("Sonal");
            names.Add("Sofei");
            names.Add("Alice");

            for(int i = 0; i < names.Count; i++)
            {
                Console.WriteLine(names[i]);
            }
        }
    }
}
