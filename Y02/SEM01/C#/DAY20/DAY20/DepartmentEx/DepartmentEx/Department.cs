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
    public partial class Department : Form
    {
        public Department()
        {
            InitializeComponent();
        }
        tablede td = new tablede();

        private void Department_Load(object sender, EventArgs e)
        {
            DataTable dt = td.select();
            d1.DataSource= dt;
        }

        private void Filter_Click(object sender, EventArgs e)
        {

        }
       void clear()
        {
            t1.Text = "";
            t2.Text = "";
            t3.Text = "";
            t4.Text = "";

        }

        private void add_Click(object sender, EventArgs e)
        {
            td.Name = t2.Text.Trim();
            td.EmployeeCount = int.Parse(t3.Text);
            td.Head=t4.Text.Trim();

            bool success = td.insert(td);

            if (success)
            {
                MessageBox.Show("department details added successfully!", "Success", MessageBoxButtons.OK, MessageBoxIcon.Information);
                clear();
                DataTable dt = td.select();
                d1.DataSource = dt;


            }
            else
            {
                MessageBox.Show("Failed to add department details. Please check your connection or data.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }

        }

        private void view_Click(object sender, EventArgs e)
        {
            DataTable dt = td.select();
            d1.DataSource = dt;

        }

        private void update_Click(object sender, EventArgs e)
        {
            td.StaffID=int.Parse(t1.Text);
            td.Name = t2.Text.Trim();
            td.EmployeeCount = int.Parse(t3.Text);
            td.Head = t4.Text.Trim();
            bool success = td.Update(td);

            if (success)
            {
                MessageBox.Show("department updated successfully!", "Success", MessageBoxButtons.OK, MessageBoxIcon.Information);
                clear();
                DataTable dt = td.select();
                d1.DataSource = dt;
            }
            else
            {
                MessageBox.Show("Failed to update department. Please check your connection or data.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void d1_RowHeaderMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            int rowindex = e.RowIndex;
            t1.Text = d1.Rows[rowindex].Cells[0].Value.ToString();
            t2.Text = d1.Rows[rowindex].Cells[1].Value.ToString();
            t3.Text = d1.Rows[rowindex].Cells[2].Value.ToString();
            t4.Text = d1.Rows[rowindex].Cells[3].Value.ToString();
        }

        private void Delete_Click(object sender, EventArgs e)
        {
            td.StaffID=int.Parse(t1.Text.Trim());
            bool success = td.Delete(td);

            if (success)
            {
                MessageBox.Show("department details deleted successfully!", "Success", MessageBoxButtons.OK, MessageBoxIcon.Information);
                DataTable dt = td.select();
                d1.DataSource = dt;
            }
            else
            {
                MessageBox.Show("Failed to delete department details. Please check your connection or data.", "Error", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            clear();
        }

        private void Home_Click(object sender, EventArgs e)
        {
            Form1 f1 = new Form1();
            f1.Show();
            this.Close();
        }
    }
}
