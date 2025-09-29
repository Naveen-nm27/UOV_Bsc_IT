namespace ListRemove
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(listBox1.SelectedItem != null)
            {
                listBox1.Items.Remove(listBox1.SelectedItem);
            } else
            {
                MessageBox.Show("Please Slect an Item to remove","Error",MessageBoxButtons.OK,MessageBoxIcon.Error);
            }
        }
    }
}