namespace Q008
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
                if (string.IsNullOrEmpty(textBox1.Text) || string.IsNullOrEmpty(textBox2.Text))
                {
                    lbl_err.Text = "Error, user name and password cannot be empty";
                    label1.Visible = false;
                    label2.Visible = false;
                    textBox1.Visible = false;
                    textBox2.Visible = false;
                    button1.Visible = false;
                button2.Visible = false;

                //MessageBox.Show("Enter username password", "Error", MessageBoxButtons.OKCancel);



            }
                else if (textBox1.Text == "admin" && textBox2.Text == "123")
                {
                    lbl_err.Text = "Login successful";
                lbl_err.BackColor = Color.LimeGreen;
                label1.Visible = false;
                    label2.Visible = false;
                    textBox1.Visible = false;
                    textBox2.Visible = false;
                    button1.Visible = false;
                button2.Visible = false;
            }

                else
                {
                    lbl_err.Text = "unsuccessful Login";
                
                    label1.Visible = false;
                    label2.Visible = false;
                    textBox1.Visible = false;
                    textBox2.Visible = false;
                    button1.Visible = false;
                button2.Visible = false;
                }

        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = "";
            textBox2.Text = "";
        }
    }
}