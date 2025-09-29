using System.Text;
namespace MultiplicationTable
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int num = Convert.ToInt32(textBox1.Text);

            listBox1.Items.Clear();
 
          
            for (int i = 1; i < 13; i++)
            {
                int mul = num * i;
               listBox1.Items.Add(num + " x " + i + " = " + mul);
            }

            
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {

            if (int.TryParse(textBox1.Text, out int num)
             {


                StringBuilder str = new StringBuilder();

                for (int i = 1; i < 13; i++)
                {
                    int mul = num * i;
                    str.AppendLine(num + " x " + i + " = " + mul);
                }

                richTextBox1.Text = str.ToString();
            } else { 
            
            }

        }
    }
}