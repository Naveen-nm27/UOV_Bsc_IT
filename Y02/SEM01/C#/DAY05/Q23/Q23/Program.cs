using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Q23
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Dictionary<int,String> books = new Dictionary<int,String>();

            books.Add(0, "Alice in the Wonderland");
            books.Add(1, "World War Z");
            books.Add(2, "Sherlock Holms vs Dracula");
            books.Add(3, "Frankastine");
            books.Add(4, "Gods of Egipt:red Peramid");

            Console.WriteLine(books[4]);

            for (int i = 0; i < books.Count; i++)
            {
                Console.WriteLine(books[i]);
            }
            
        }
    }
}
