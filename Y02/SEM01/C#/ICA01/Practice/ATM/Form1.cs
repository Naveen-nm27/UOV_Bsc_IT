namespace ATM
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }


        private void button1_Click(object sender, EventArgs e)
        {
            label3.Text = Convert.ToString(Convert.ToInt32(textBox1.Text) + Convert.ToInt32(label3.Text));
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (radioButton1.Checked)
            {
                switch (comboBox1.SelectedIndex)
                {
                    case 0:
                        label2.Text = comboBox1.Text;
                        label3.Text = "7500";
                        break;
                    case 1:
                        label2.Text = comboBox1.Text;
                        label3.Text = "6500";
                        break;
                    case 2:
                        label2.Text = comboBox1.Text;
                        label3.Text = "5000";
                        break;
                    case 3:
                        label2.Text = comboBox1.Text;
                        label3.Text = "2500";
                        break;
                    default:
                        MessageBox.Show("Error");
                        break;
                }
            }

            if (radioButton2.Checked)
            {
                switch (comboBox1.SelectedIndex)
                {
                    case 0:
                        label2.Text = comboBox1.Text;
                        label3.Text = "2500";
                        break;
                    case 1:
                        label2.Text = comboBox1.Text;
                        label3.Text = "8500";
                        break;
                    case 2:
                        label2.Text = comboBox1.Text;
                        label3.Text = "9000";
                        break;
                    case 3:
                        label2.Text = comboBox1.Text;
                        label3.Text = "1500";
                        break;
                    default:
                        MessageBox.Show("Error");
                        break;
                }
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            label3.Text = Convert.ToString(Convert.ToInt32(textBox1.Text) - Convert.ToInt32(label3.Text));
        }
    }
}
