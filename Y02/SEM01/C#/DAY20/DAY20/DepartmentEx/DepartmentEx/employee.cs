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
    public partial class employee : Form
    {
        public employee()
        {
            InitializeComponent();
        }
        tablecls te=new tablecls();
        private void employee_Load(object sender, EventArgs e)
        {
            DataTable dt=te.select();
            d1.DataSource= dt;
        }
        void clear()
        {
            t1.Text = "";
            t2.Text = "";
            t3.Text = "";
            r1.Checked = false;
            r2.Checked = false;
            t4.Text = "";
            t5.Text = "";

        }

        private void add_Click(object sender, EventArgs e)
        {
            te.Name = t2.Text;
            te.Address = t3.Text;
            te.Email = t4.Text;
            te.Phone = int.Parse(t5.Text);
            te.Gender = "";
            if (r1.Checked)
                te.Gender = "Female";
            else if (r2.Checked)
                te.Gender = "Male";

            bool success = te.insert(te);

            if (success)
            {
                MessageBox.Show("employee details added successfully!", "Success", MessageBoxButtons.OK, MessageBoxIcon.Information);
                clear();
                DataTable dt = te.select();
                d1.DataSource = dt;


            }
            else
            {
                MessageBox.Show("Failed to add employee details. Please check your connection or data.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }

        }

        private void view_Click(object sender, EventArgs e)
        {
            DataTable dt = te.select();
            d1.DataSource = dt;

        }

        private void update_Click(object sender, EventArgs e)
        {
            te.EmployeeID=int.Parse(t1.Text);
            te.Name = t2.Text;
            te.Address = t3.Text;
            te.Email = t4.Text;
            te.Phone = int.Parse(t5.Text);
            te.Gender = "";
            if (r1.Checked)
                te.Gender = "Female";
            else if (r2.Checked)
                te.Gender = "Male";
            bool success = te.Update(te);

            if (success)
            {
                MessageBox.Show("employee details updated successfully!", "Success", MessageBoxButtons.OK, MessageBoxIcon.Information);
                clear();
                DataTable dt = te.select();
                d1.DataSource = dt;
            }
            else
            {
                MessageBox.Show("Failed to update employee details. Please check your connection or data.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void d1_RowHeaderMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            int rowindex = e.RowIndex;
            t1.Text = d1.Rows[rowindex].Cells[0].Value.ToString();
            t2.Text = d1.Rows[rowindex].Cells[1].Value.ToString();
            t3.Text = d1.Rows[rowindex].Cells[2].Value.ToString();
            t4.Text = d1.Rows[rowindex].Cells[4].Value.ToString();
            t5.Text = d1.Rows[rowindex].Cells[5].Value.ToString();
            string Gender = d1.Rows[rowindex].Cells[3].Value.ToString();
            r2.Checked = (Gender == "Male");
            r1.Checked = (Gender == "Female");
        }

        private void Delete_Click(object sender, EventArgs e)

        {
            te.EmployeeID=int.Parse(t1.Text);
            bool success = te.Delete(te);

            if (success)
            {
                MessageBox.Show("employee details deleted successfully!", "Success", MessageBoxButtons.OK, MessageBoxIcon.Information);
                DataTable dt = te.select();
                d1.DataSource = dt;
            }
            else
            {
                MessageBox.Show("Failed to delete employee details. Please check your connection or data.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            clear();
        }

        private void Filter_Click(object sender, EventArgs e)
        {
            filter ft=new filter();
            ft.Show();
        }

        private void Home_Click(object sender, EventArgs e)
        {
            Form1 f1 = new Form1();
            f1.Show();
            this.Close();
        }
    }
}
