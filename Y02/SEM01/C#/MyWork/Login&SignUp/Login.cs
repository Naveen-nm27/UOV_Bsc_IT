using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql

namespace Login_SignUp
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

        Operations op = new Operations();
     

        private void Login_Load(object sender, EventArgs e)
        {
            
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Sign sign = new Sign();
            sign.Show();
            this.Hide();
        }
    }
}
