using System.Text.RegularExpressions;
namespace Dayabase01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void txt1_Val(object sender, System.ComponentModel.CancelEventArgs e)
        {

            if (string.IsNullOrWhiteSpace(textBox1.Text))
            {
                errorProvider1.SetError(textBox1, "Name cannot be empty");
                e.Cancel = true;
            }
            else if (!Regex.IsMatch(textBox1.Text, @"^[A-Za-z\s]+$"))
            {
                errorProvider1.SetError(textBox1, "name must only contain letters");
                e.Cancel = true;
            } else 
            {
                errorProvider1.SetError(textBox1, "");
            }


        }

        private void txt2_valid(object sender, System.ComponentModel.CancelEventArgs e)
        {
            if(!int.TryParse(textBox2.Text, out int age) || age <= 0)
            {
                errorProvider1.SetError(textBox2, "Enter a Valid Positive number");
                e.Cancel = true;
            }
            else
            {
                errorProvider1.SetError(textBox2, "");
            }
        }
    }
}