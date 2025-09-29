using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ProgressBar2
{
    
    public partial class Form1 : Form
        
    {
        private Timer timer = new Timer();
        public Form1()
        {
            InitializeComponent();
            timer.Interval = 50;
            timer.Tick += timer1_Tick;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            progressBar1.Value = 0;
            timer1.Start();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if(progressBar1.Value < 100)
            {
                progressBar1.Value++;
            } else
            {
                timer1.Stop();
                MessageBox.Show("Completed");
            }
        }
    }
}
