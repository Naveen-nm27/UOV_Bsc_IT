using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Datetime
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            lbl_date.Visible = false;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            lbl_date.Visible = true;

                DateTime now = DateTime.Now;

                lbl_date.Text = now.ToString("dddd, dd MMMM yyyy HH:ss");
   

        }
    }
}
