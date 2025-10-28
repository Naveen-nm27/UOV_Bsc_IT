namespace FormEx01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {


            if (listBox1.SelectedItem != null)
            {
                listBox2.Items.Add(listBox1.SelectedItem);
                listBox1.Items.Remove(listBox1.SelectedItem);
            }

        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            listBox2.Items.Clear();
            listBox1.Items.Clear();
            int item = comboBox1.SelectedIndex;

            switch (item)
            {
                case 0:
                    listBox1.Items.Add("Math");
                    listBox1.Items.Add("Chemistry");
                    listBox1.Items.Add("Physics");
                    listBox1.Items.Add("Biology");
                    break;
                case 1:
                    listBox1.Items.Add("Aaccounting");
                    listBox1.Items.Add("Econ");
                    listBox1.Items.Add("Buss");
                    listBox1.Items.Add("Biology");
                    break;
                case 2:
                    listBox1.Items.Add("Drawing");
                    listBox1.Items.Add("Dancing");
                    listBox1.Items.Add("Geogrphy");
                    listBox1.Items.Add("History");
                    break;
                default:
                    listBox1.Items.Add("Select Items");
                    break;
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            listBox2.Items.AddRange(listBox1.Items);
            listBox1.Items.Clear();
        }

        private void button1_Click(object sender, EventArgs e)
        {

                if (listBox2.SelectedItem != null)
                {
                    listBox1.Items.Add(listBox2.SelectedItem);
                    listBox2.Items.Remove(listBox2.SelectedItem);
                }

        }

        private void button3_Click(object sender, EventArgs e)
        {
            listBox1.Items.AddRange(listBox2.Items);
            listBox2.Items.Clear();
        }
    }
}