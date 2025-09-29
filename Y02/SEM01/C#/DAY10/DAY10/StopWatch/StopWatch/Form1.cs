using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace StopWatch
{
    public partial class Form1 : Form
    {

        int elapsedsecconds = 0;
        public Form1()
        {
            InitializeComponent();
            label1.Text = "00:00:00";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            timer1.Start();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            timer1.Stop();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            timer1.Stop();
            elapsedsecconds = 0;
            label1.Text = "00:00:00";
            
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            elapsedsecconds++;
            TimeSpan ts = TimeSpan.FromSeconds(elapsedsecconds);
            label1.Text = ts.ToString();
        }
    }
}
