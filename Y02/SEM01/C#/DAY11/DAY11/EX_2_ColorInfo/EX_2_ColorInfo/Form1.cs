using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace EX_2_ColorInfo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            ColorInfo1 color = new ColorInfo1((int)numericUpDown1.Value, (int)numericUpDown2.Value, (int)numericUpDown3.Value);

            button1.BackColor = Color.FromArgb((int)numericUpDown1.Value, (int)numericUpDown2.Value, (int)numericUpDown3.Value);

            label5.Text = color.ToString();


        }


        private void numericUpDown1_ValueChanged(object sender, EventArgs e)
        {
            
        }
    }
}
