using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ComponentModel;

namespace ICA01
{
    internal class Student
    {
        string regNo;
        string IndexNo;
        string Name;
        int vp_T;
        int vp_P;
        int vp_p_cred;
        int vp_cred;
        int vp_t_cred;
        int cg_t_cred;
        int cg_T;
        int cg_P;
        int cg_cred;
        int cg_p_cred;


        public Student(string regNo,string IndexNo, string Name, int vp_T, int vp_P, int vp_cred, int cg_T, int cg_P, int cg_cred, int vp_p_cred, int vp_t_cred, int cg_t_cred, int cg_p_cred)
        {
            this.regNo = regNo;
            this.IndexNo = IndexNo;
            this.Name = Name;
            this.vp_T = vp_T;
            this.vp_t_cred = vp_t_cred;
            this.vp_P = vp_P;
            this.vp_cred = vp_cred;
            this.vp_p_cred = vp_p_cred;
            this.cg_T = cg_T;
            this.cg_cred = cg_cred;
            this.cg_P = cg_P;
            this.cg_p_cred = cg_p_cred;
            this.cg_t_cred = cg_t_cred;

        }

/*        enum grade {
            [DisplayName("A+")] APlus,
        }*/

        public string Result(int vp_T, int cg_T, int vp_p, int cg_p) {
            double result = ((vp_T) * (vp_T)) + ((cg_T) * (cg_P));
            if (result > 80)
            {
                return "A+";
            }
            else if (result > 75)
            {
                return "A";
            }
            else if (result > 70)
            {
                return "A-";
            }
            else if (result > 65)
            {
                return "B+";
            }
            else if (result > 60)
            {
                return "B";
            }
            else if (result > 55)
            {
                return "B-";
            }
            else if (result > 50)
            {
                return "C+";
            }
            else if (result > 45)
            {
                return "C";
            }
            else if (result > 40)
            {
                return "C-";
            }
            else if (result > 35)
            {
                return "D+";
            }
            else if (result > 30)
            {
                return "D-";
            }
            else {
                return "E";
            }
        }

         public double GPA(String res) {
            switch (res)
            {
                case "A+":return 4.0;
                case "A":return 4.0;
                case "A-":return 3.7;
                case "B+":return 3.3;
                case "B":return 3.0;
                case "B-":return 2.7;
                case "C+":return 2.3;
                case "C":return 2.0;
                case "C-":return 1.7;
                case "D+":return 1.3;
                case "D-":return 1.0;
                default: return- 1;
            }

         }
    }
}
