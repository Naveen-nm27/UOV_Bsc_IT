using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ex_01_MarksApp
{
    public class Student
    {
        public String Name;
        public int Marks;
        public Student(string name, int marks)
        {
            this.Name = name;
            this.Marks = marks;
        }

        public String getGrade()
        {
/*            if (Marks > 75) return "A";
            else if (Marks > 50) return "B";
            else return "Fail";*/

            return Marks > 80 ? "A" : Marks > 50 ? "B" : "Fail";

        }
    }
}
