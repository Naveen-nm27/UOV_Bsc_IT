using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DepartmentEx
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Department department = new Department();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            employee em=new employee();
            em.Show();
            this.Hide();
        }

        private void button2_Click_1(object sender, EventArgs e)
        {
            Department department = new Department();
            department.Show();
            this.Hide();

        }
    }
}
