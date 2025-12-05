using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WFPrac
{
    
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private Operations _operations = new Operations();
        private void button1_Click(object sender, EventArgs e)
        {
            var user = _operations.GetUser(textBox1.Text.Trim());
            List<User> users = new List<User>();
            users.Add(user);

            dataGridView1.DataSource = users;
        }
    }
}
