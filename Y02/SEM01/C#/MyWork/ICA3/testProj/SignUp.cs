using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace testProj
{
    public partial class SignUp : Form
    {
        public SignUp()
        {
            InitializeComponent();
        }

        User user = new User();
        Operations operation = new Operations();
        string filepath, filename;
        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            user = new User()
            {
                firstName = textBox1.Text.Trim(),
                lastName = textBox2.Text.Trim(),
                userName = textBox3.Text.Trim(),
                password = textBox4.Text.Trim(),
                subject = comboBox1.Text.Trim(),
                comment = textBox2.Text.Trim(),
            };


            operation.addUser(user);

        }

        private void button1_Click(object sender, EventArgs e)
        {
            openFileDialog1 = new OpenFileDialog();
            openFileDialog1.Filter = "Image Files|*.png;*.jpg;*.jpeg;*.bmp;*.gif";
            openFileDialog1.FileOk += openFileDialog1_FileOk;

            openFileDialog1.ShowDialog();
        }

        private void openFileDialog1_FileOk(object sender, CancelEventArgs e)
        {
            // Get the full path
            string fullPath = openFileDialog1.FileName;

            // Extract only the file name
            string fileName = Path.GetFileName(fullPath); // e.g., "IMG10073435_4366386.jpg"

            // Store only the file name in your user object
            user.imgFilePath = fileName;

            // Also store full path temporarily if you need to copy the file somewhere
            // string tempFullPath = fullPath;

            MessageBox.Show("Selected File Name: " + fileName);
        }

        private void SignUp_Load(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            View view = new View();
            this.Hide();
            view.Show();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            this.Hide();
            LogIn log = new LogIn();
            log.Show();

        }

        private void button5_Click(object sender, EventArgs e)
        {
            this.Enabled = false;
        }
    }
}
