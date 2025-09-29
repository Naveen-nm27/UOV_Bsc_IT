namespace AgeCalculator
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            lbl_age_out.Visible = false;
        }

        private void cmd_age_cal_Click(object sender, EventArgs e)
        {
            try
            {
                

                DateTime dob = DateTime.Parse(textBox1.Text);

                int age = DateTime.Now.Year - dob.Year;

                if (DateTime.Now.DayOfYear < dob.DayOfYear)
                    age--;
                lbl_age_out.Visible = true;
                lbl_age_out.Text = "Your age is: " + age.ToString() + " years";
            }

            catch (FormatException)
            {
                MessageBox.Show("Wrong date Format");
            }

        }
    }
}