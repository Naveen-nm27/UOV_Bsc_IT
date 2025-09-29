namespace Q005
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(usr_txt.Text))
            {
                usr_txt.Visible = false;
                button1.Visible = false;

                label1.Text = "Enter a name";
            } else {
                label2.Text = "Hello " + usr_txt.Text + "!";
            }
            
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
}