using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace E03_DataGrid
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            List<Student> students = new List<Student>()
            {
                new Student(){Id=1,Name="Bob"},
                new Student(){Id=2,Name="Alice"},
                new Student(){Id=3,Name="Hatter"}
            };

            comboBox1.DataSource = students;
            comboBox1.DisplayMember = "Name";
            comboBox1.ValueMember = "Id";

            textBox2.DataBindings.Add("Text", students, "Name");
            dataGridView1.DataSource = students;
            
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
