using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Library
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
            listBox1.DoubleClick += listBox1_DoubleClick;
            listBox2.DoubleClick += listBox2_DoubleClick;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int.TryParse(textBox2.Text, out int number);

            if (number >= 18){
                MessageBox.Show("Loged in", "Approved", MessageBoxButtons.OK,MessageBoxIcon.Information);
            } else
            {
                MessageBox.Show("Error", "Not Approved", MessageBoxButtons.OK,MessageBoxIcon.Warning);
            }
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button4_Click(object sender, EventArgs e)
        {
            String pictureLocation = @"E:/IMG/vadim-sadovski-p45.jpg";
            pictureBox1.Image = Image.FromFile(pictureLocation);
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            pictureBox1.Image = Image.FromFile("E:/IMG/1000061207.png");
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
        
        }

        private void button3_Click(object sender, EventArgs e)
        {
            pictureBox1.Image = Image.FromFile("E:/IMG/alena-aenami-escape-hd.jpg");
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
        }

        private void listBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            switch (listBox1.SelectedIndex) 
            {
                case 0:
                    pictureBox1.Image = Image.FromFile("E:/My Projects/Design/4_INSper/5 Features That Make Me Fall in Love With a Book Cover.jpeg");
                    pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
                    break;
                case 1:
                    pictureBox1.Image = Image.FromFile("E:/My Projects/Design/4_INSper/photo_2024-07-30_22-12-39.jpg");
                    pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
                    break;
                case 2:
                    pictureBox1.Image = Image.FromFile("E:/My Projects/Design/4_INSper/photo_2024-10-14_22-53-49.jpg");
                    pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
                    break;
                case 3:
                    pictureBox1.Image = Image.FromFile("E:/My Projects/Design/4_INSper/photo_2024-07-30_22-12-41.jpg");
                    pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
                    break;
            }
        }

        private void listBox1_DoubleClick(object sender, EventArgs e)
        {
            if (listBox1.SelectedItem != null)
            {
                listBox2.Items.Add(listBox1.SelectedItem);
                listBox1.Items.Remove(listBox1.SelectedItem);
            }
        }

        // Move from listBox2 back to listBox1
        private void listBox2_DoubleClick(object sender, EventArgs e)
        {
            if (listBox2.SelectedItem != null)
            {
                listBox1.Items.Add(listBox2.SelectedItem);
                listBox2.Items.Remove(listBox2.SelectedItem);
            }
        }
    }
}
