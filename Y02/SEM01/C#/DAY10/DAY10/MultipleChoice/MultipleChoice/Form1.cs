using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MultipleChoice
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            label2.Visible = false;
            label3.Visible = false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label3.Visible = true;
            string selectedAanswer = "";
            if(radioButton1.Checked) selectedAanswer = radioButton1.Text;
            if(radioButton2.Checked) selectedAanswer = radioButton2.Text;
            if(radioButton3.Checked) selectedAanswer = radioButton3.Text;
            if(radioButton4.Checked) selectedAanswer = radioButton4.Text;

            label3.Text = selectedAanswer;

            if (radioButton3.Checked)
            {
                label2.Text = "Correct";
                label2.ForeColor = Color.LightGreen;
            } else
            {
                label2.Text = " False, Correct Answer";
                label2.ForeColor = Color.Tomato;
            }
        }
    }
}
