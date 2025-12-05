using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFPrac
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private Operations _operations = new Operations();

        private void Form1_Load(object sender, EventArgs e)
        {
            if (_operations.IsDbConnected())
            {
                label3.Text = "DB Connected";
            }
            else
            {
                label3.Text = "DB Not Connected";
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            var usr = new User()
            {
                Name = textBox1.Text.Trim(),
                Password = textBox2.Text.Trim(),
            };

            _operations.AddUser(usr);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            new Form2().Show();
        }
    }
}
