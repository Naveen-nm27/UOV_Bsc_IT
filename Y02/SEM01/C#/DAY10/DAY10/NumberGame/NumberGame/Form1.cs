using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace NumberGame
{
    public partial class Form1 : Form
    {

        int winNum;
        public Form1()
        {
            InitializeComponent();
            lbl_out.Visible = false;
            label4.Visible = false;
            
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void newGame() 
        {
            Random rand = new Random();
            winNum = rand.Next(1, 101);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            lbl_out.Visible = true;
            label4.Visible = true;



            if (int.TryParse(textBox1.Text, out int num)){


                lbl_out.Text = Convert.ToString(winNum);

                if (num > winNum)
                {
                    label4.Text = "Too High";
                }
                else if (num < winNum)
                {
                    label4.Text = "Too Low";
                }
                else 
                {
                    label4.Text = "WINNER! 🎉 ";
                }
            } else {
                MessageBox.Show("Enter A Valid Number", "Error", MessageBoxButtons.OK);
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            newGame();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            System.Windows.Forms.Application.Exit();
        }
    }
}
