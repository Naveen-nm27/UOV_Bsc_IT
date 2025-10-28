using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CinemaBase
{
    public partial class Form2 : Form
    {
        private List<Movie> movieList;

        public Form2(List<Movie> sharedList)
        {
            InitializeComponent();
            movieList = sharedList;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            movieList.Add(new Movie(
                mvid.Text,
                mvname.Text,
                mvdir.Text,
                mvpro.Text,
                mvemail.Text,
                richTextBox1.Text));

            button2.PerformClick(); // clear fields
        }

        private void button2_Click(object sender, EventArgs e)
        {
            mvemail.Clear();
            mvdir.Clear();
            mvid.Clear();
            mvname.Clear();
            mvpro.Clear();
            richTextBox1.Clear();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
