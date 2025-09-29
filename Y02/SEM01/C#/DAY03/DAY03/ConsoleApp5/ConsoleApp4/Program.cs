using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp4
{

    public class Student
    {
        public String name;
        public int age;

        public Student(string name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge()
        {
            return age;
        }

    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Student st01 = new Student("Alice",18);

            Console.WriteLine("Name: " + st01.getName() + "\nAge: " + st01.getAge());
        }
    }
}
