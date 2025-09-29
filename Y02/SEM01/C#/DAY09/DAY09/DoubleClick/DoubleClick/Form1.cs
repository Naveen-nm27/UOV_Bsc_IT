using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DoubleClick
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            
             /*listBox2.Items.Add(listBox1.SelectedItem.ToString());*/
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(listBox1.SelectedItem != null)
            {
                listBox2.Items.Add(listBox1.SelectedItem.ToString());
            } else
            {
                MessageBox.Show("Select an Item first","No item has ben Selected",MessageBoxButtons.OK,MessageBoxIcon.Warning);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (listBox2.SelectedItem != null)
            {
                listBox2.Items.Remove(listBox2.SelectedItem);
            } else
            {
                MessageBox.Show("Select an Item first", "No item has ben Selected", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
        }
    }
}
