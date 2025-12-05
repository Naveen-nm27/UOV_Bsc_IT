using System;

namespace C__App
{
    public class Person
    {
        public String Name;

        public void intro(string hello)
        {
            Console.WriteLine("Hi {0} I'm {1}",hello,Name);
        }

        public void marks(params int[] values)
        {
            int num = Convert.ToInt32(Console.ReadLine());
            foreach(int value in values) { Console.WriteLine(value * num); }
        }
    }
}
