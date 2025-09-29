namespace Q04
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            BackColor = Color.Red;
            button1.BackColor = Color.Tomato;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            BackColor= Color.Green;
            button2.BackColor = Color.LimeGreen;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            BackColor = Color.Blue;
            button3.BackColor = Color.Cyan;
        }
    }
}