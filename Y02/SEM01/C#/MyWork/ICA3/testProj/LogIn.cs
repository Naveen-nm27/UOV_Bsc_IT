namespace testProj
{
    public partial class LogIn : Form
    {
        public LogIn()
        {
            InitializeComponent();
        }


        Operations op = new Operations();
        private void button1_Click(object sender, EventArgs e)
        {
            string user = textBox1.Text.Trim();
            string pass = textBox2.Text.Trim();

            if (op.Login(user, pass)) {
                MessageBox.Show("Hari bn");
            } else
            {
                MessageBox.Show("Invalid");
            }

        }
    }
}
