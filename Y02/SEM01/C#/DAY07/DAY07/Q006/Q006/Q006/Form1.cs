namespace Q006
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(Convert.ToInt32(textBox1.Text) >= 40)
            {
                lbl_res_2.Text = "Pass";
            } else
            {
                lbl_res_2.Text = "Fail";
            }
        }
    }
}