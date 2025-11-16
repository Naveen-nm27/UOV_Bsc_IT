using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DepartmentEx
{
    internal class tablede
    {
        public int StaffID { get; set; }
        public string Name { get; set; }
        public int EmployeeCount { get; set; }
        public string Head { get; set; }



        static string myconnstrng = "server=127.0.0.1;user=root;database=departmentdb;password=;";




        public DataTable select()
        {
            MySqlConnection con = new MySqlConnection(myconnstrng);
            DataTable dt = new DataTable();
            try
            {
                string sql = "select * from department";
                MySqlCommand cmd = new MySqlCommand(sql, con);
                MySqlDataAdapter adp = new MySqlDataAdapter(cmd);
                con.Open();
                adp.Fill(dt);

            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {

            }
            return dt;
        }


        public bool insert(tablede s)
        {
            bool isSuccess = false;
            MySqlConnection con = new MySqlConnection(myconnstrng);
            try
            {
                string sql = "insert into department (Name,EmployeeCount,Head) " +
                    "Values(@Name,@EmployeeCount,@Head)";
                MySqlCommand cmd = new MySqlCommand(sql, con);
                cmd.Parameters.AddWithValue("@Name", s.Name);
                cmd.Parameters.AddWithValue("@EmployeeCount",s.EmployeeCount);
                cmd.Parameters.AddWithValue("@Head", s.Head);
                
                con.Open();
                int rows = cmd.ExecuteNonQuery();
                if (rows > 0)
                {
                    isSuccess = true;
                }
                else
                {
                    isSuccess = false;
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                con.Close();

            }
            return isSuccess;

        }

        public bool Update(tablede s)
        {
            bool isSuccess = false;
            MySqlConnection con = new MySqlConnection(myconnstrng);
            try
            {
                string sql = "update employee set Name=@Name" +
                    "EmployeeCount=@EmployeeCount,Head=@Head where StaffID=@StaffID";

                MySqlCommand cmd = new MySqlCommand(sql, con);
                cmd.Parameters.AddWithValue("@Name", s.Name);
                cmd.Parameters.AddWithValue("@EmployeeCount", s.EmployeeCount);
                cmd.Parameters.AddWithValue("@Head", s.Head);
                cmd.Parameters.AddWithValue("@StaffID", s.StaffID);

                con.Open();
                int rows = cmd.ExecuteNonQuery();
                if (rows > 0)
                {
                    isSuccess = true;
                }
                else
                {
                    isSuccess = false;
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                con.Close();

            }
            return isSuccess;

        }

        public bool Delete(tablede s)
        {
            bool isSuccess = false;
            MySqlConnection con = new MySqlConnection(myconnstrng);
            try
            {
                string sql = "Delete from  employee where StaffID=@StaffID";

                MySqlCommand cmd = new MySqlCommand(sql, con);
                cmd.Parameters.AddWithValue("@StaffID", s.StaffID);

                con.Open();
                int rows = cmd.ExecuteNonQuery();
                if (rows > 0)
                {
                    isSuccess = true;
                }
                else
                {
                    isSuccess = false;
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                con.Close();

            }
            return isSuccess;

        }
    }
}
