using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ICA_Assignment
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            listBox1.Items.Clear();
            listBox2.Items.Clear();
            int num = comboBox1.SelectedIndex;

            switch (num)
            {
                case 0:
                    listBox1.Items.Add("Math");
                    listBox1.Items.Add("Chemistry");
                    listBox1.Items.Add("Physics");
                    listBox1.Items.Add("Biology");
                    break;
                case 1:
                    listBox1.Items.Add("Aaccounting");
                    listBox1.Items.Add("Econ");
                    listBox1.Items.Add("Bussiness Studies");
                    listBox1.Items.Add("Biology");
                    break;
                case 2:
                    listBox1.Items.Add("Drawing");
                    listBox1.Items.Add("Dancing");
                    listBox1.Items.Add("Geogrphy");
                    listBox1.Items.Add("History");
                    break;
                default:
                    listBox1.Items.Add("Select Items");
                    break;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (listBox1.SelectedItem != null) {
                listBox2.Items.Add(listBox1.SelectedItem);
                listBox1.Items.Remove(listBox1.SelectedItem);
            }

        }

        private void button4_Click(object sender, EventArgs e)
        {
            if (listBox2.SelectedItem != null) {
                listBox1.Items.Add(listBox2.SelectedItem);
                listBox2.Items.Remove(listBox2.SelectedItem);
            }

        }

        private void button3_Click(object sender, EventArgs e)
        {
            listBox2.Items.AddRange(listBox1.Items);
            listBox1.Items.Clear();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            
            listBox1.Items.AddRange(listBox2.Items);
            listBox2.Items.Clear();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            StringBuilder sb = new StringBuilder();

            sb.Append("||||||||||||||||||||Personal details||||||||||||||||||||\n");
            sb.Append($"Name: {textBox1.Text}\n");
            sb.Append($"Registration number: {textBox2.Text}\n");

            if (radioButton1.Checked)
            {
                sb.Append($"Sex: {radioButton1.Text} \n");
            }
            else if (radioButton2.Checked)
            {
                sb.Append($"Sex: {radioButton2.Text}\n");
            }

            sb.Append($"Adddress: ${richTextBox2.Text}\n");

            sb.Append($"||||||||||||||||||||Language Ability in English||||||||||||||||||||\n");

            if (checkBox1.Checked)
            {
                sb.Append($"Read: Can Read\n");
            }
            else {
                sb.Append($"Read: Can't Read\n");
            }

            if (checkBox2.Checked)
            {
                sb.Append($"Write: Can Write\n");
            }
            else
            {
                sb.Append($"Write: Can't Write\n");
            }


            if (checkBox3.Checked)
            {
                sb.Append($"Speak: Can Speak\n");
            }
            else
            {
                sb.Append($"Speak: Can't Speak\n");
            }

            sb.Append($"||||||||||||||||||||Educational Details||||||||||||||||||||\n");

            sb.Append($"Stream: {comboBox1.Text}\n");
            for (int i = 0; i < listBox2.Items.Count; i++) {
                sb.Append($"{listBox2.Items[i]}\n");
            }

            richTextBox1.Text = sb.ToString();
        }
    }
}
