namespace TrackBar
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            ProgressBar progressbar = new ProgressBar();
            timer1.Interval = 1000;
            timer1.Enabled = true;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            timer1.Start();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            for (int i = 0; i <= 100; i++) { 
                progressBar1.Value += 1;
                progressBar2.Value += 1;
                progressBar3.Value += 1;
            }
            timer1.Stop();
        }
    }
}
