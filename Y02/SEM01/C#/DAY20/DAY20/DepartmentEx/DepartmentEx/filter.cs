using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DepartmentEx
{
    public partial class filter : Form
    {
        public filter()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }
        string conn = "server=127.0.0.1;database=departmentdb;user=root;pwd=;";

        private void t1_TextChanged(object sender, EventArgs e)
        {
            string t = t1.Text;
            MySqlConnection con = new MySqlConnection(conn);
            con.Open();
            string q = "SELECT * FROM employee " +
                  "WHERE Name LIKE @search OR " +
                  "Gender LIKE @search";
            MySqlCommand cmd = new MySqlCommand(q, con);
            cmd.Parameters.AddWithValue("@search", "%" + t + "%");
            MySqlDataAdapter adp = new MySqlDataAdapter(cmd);
            DataTable dt = new DataTable();
            adp.Fill(dt);


        }
        tablecls te = new tablecls();
        private void filter_Load(object sender, EventArgs e)
        {
            DataTable dt = te.select();
            d1.DataSource = dt;
        }
    }
}
