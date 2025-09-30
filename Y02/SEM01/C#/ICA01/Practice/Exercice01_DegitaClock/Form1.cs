namespace Exercice01_DegitaClock
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            label1.Visible = false;
            timer1.Interval = 1000;
            timer1.Enabled = true;
            timer1.Start();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {


        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            label1.Visible = true;
            label1.Text = DateTime.Now.ToString("HH:mm:ss");
        }
    }
}
