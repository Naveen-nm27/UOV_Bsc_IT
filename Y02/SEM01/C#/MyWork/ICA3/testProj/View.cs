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
    public partial class View : Form
    {
        public View()
        {
            InitializeComponent();
        }

        Operations operations = new Operations();
        private void button2_Click(object sender, EventArgs e)
        {



            string username = Microsoft.VisualBasic.Interaction.InputBox(
                "Enter username to search",
                "Find User",
                ""
            );

            if (string.IsNullOrEmpty(username))
            {
                MessageBox.Show("Username cannot be empty.");
                return;
            }

            User user = operations.viewUserData(username);

            if (user == null)
            {
                MessageBox.Show("User Not Found");
                return;
            }

            fname.Text = user.firstName;
            lname.Text = user.lastName;
            user1.Text = user.userName;
            pass.Text = user.password;
            subject.Text = user.subject;
            richTextBox1.Text = user.comment;
            // pictureBox1.Image = Image.FromFile($"E:\\IMG\\{user.imgFilePath}");



        }

        private void button1_Click(object sender, EventArgs e)
        {
            string username = Microsoft.VisualBasic.Interaction.InputBox(

                "Name to Remove",
                "Remove",
                ""
            );

            operations.deleteUser(username);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            string username = Microsoft.VisualBasic.Interaction.InputBox(
                "Enter Username For Update",
                "Enter username",
                ""
             );

            string newUsername = Microsoft.VisualBasic.Interaction.InputBox(
                "Enter new Username",
                "Enter username",
                ""
             );
            operations.updateUser(username,newUsername);
        }
    }
}
