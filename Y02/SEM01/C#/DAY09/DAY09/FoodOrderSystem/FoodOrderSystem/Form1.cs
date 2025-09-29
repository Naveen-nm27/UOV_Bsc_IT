using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FoodOrderSystem
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            label1.Visible = false;
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

            int tottal = 0;
            if (ch_p.Checked)
            {
                tottal += 500; 
            } 
            
            if (checkBox2.Checked)
            {
                tottal += 750;
            } 
            
            if (checkBox3.Checked)
            {
                tottal += 200;
            }
            label1.Visible = true;
            label1.Text = "Yout total is: Rs " + tottal.ToString();
        }

        private void ch_p_CheckedChanged(object sender, EventArgs e)
        {
            if(ch_p.Checked)
            listBox1.Items.Add("Pitzza");
            else
                listBox1.Items.Remove("Pitzza");
        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox2.Checked)
            listBox1.Items.Add("Burger");
            else
                listBox1.Items.Remove("Burger");
        }

        private void checkBox3_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox3.Checked)
                listBox1.Items.Add("Coke");
            else
                listBox1.Items.Remove("Coke");
        }
    }
}
