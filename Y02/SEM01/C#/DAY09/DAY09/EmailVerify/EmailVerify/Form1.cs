using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EmailVerify
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            label2.Visible = false;
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            string email = textBox1.Text;
            if(email.Contains("@"))
            {
                label2.Visible = true;
                label2.Text = "Valid Email";
                label2.ForeColor = Color.Lime;
            } else
            {
                label2.Visible = true;
                label2.Text = "Invalid Email";
                label2.ForeColor = Color.Tomato;
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
