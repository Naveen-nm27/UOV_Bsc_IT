using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Q19
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {

            List<String> words = new List<string>();

            words.Add("Annie");
            words.Add("Lucy");
            words.Add("Sonal");
            words.Add("naveen");

            Random rng = new Random();
            int a = rng.Next(words.Count);

            lbl1.Text = words[a];
        }

        private void cmd_2_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Hello");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            this.Close();  
        }
    }
}
