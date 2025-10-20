using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ICA01
{
    public partial class Form1 : Form
    {
   

        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string regNo = tex;
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

            Student student = new Student(regNo, IndexNo, Name, vp_T, vp_P, vp_cred, cg_T, cg_P, cg_cred, vp_p_cred, vp_t_cred, cg_t_cred, cg_p_cred);
        }
    }
}
