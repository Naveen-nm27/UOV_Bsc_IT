namespace Q007
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void cmd_ans_Click(object sender, EventArgs e)
        {
            int.TryParse(textBox1.Text, out int marks);
            if (marks % 2 == 0)
            {
                lbl_res.Text = "Even";
            } else
            {
                lbl_res.Text = "Odd";
            }
        }
    }
}