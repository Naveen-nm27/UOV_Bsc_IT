using System.Collections.Generic;
using System.Linq;
using System.Security;
using System.Text;
using System.Threading.Tasks;

namespace C__App
{

    internal class Program
    {
        static void Main(string[] args)
        {
            var person = new Person();
            person.Name = "Jhon";
            person.intro("Mosh");
            person.marks(5,10,15,20);

        }
    }
}
