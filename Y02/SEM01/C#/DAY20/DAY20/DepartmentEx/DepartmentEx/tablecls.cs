using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;

namespace DepartmentEx
{
    internal class tablecls
    {
    
            //getter setter properties
            public int EmployeeID { get; set; }
            public string Name { get; set; }
           
            public string Address { get; set; }
            public string Gender { get; set; }
            public string Email { get; set; }
            public int Phone { get; set; }


        static string myconnstrng = "server=127.0.0.1;user=root;database=departmentdb;password=;";




            public DataTable select()
            {
                MySqlConnection con = new MySqlConnection(myconnstrng);
                DataTable dt = new DataTable();
                try
                {
                    string sql = "select * from employee";
                    MySqlCommand cmd = new MySqlCommand(sql, con);
                    MySqlDataAdapter adp = new MySqlDataAdapter(cmd);
                    con.Open();
                    adp.Fill(dt);

                }
                catch
                {
                }
                finally
                {

                }
                return dt;
            }


            public bool insert(tablecls s)
            {
                bool isSuccess = false;
                MySqlConnection con = new MySqlConnection(myconnstrng);
                try
                {
                    string sql = "insert into employee (Name,Address,Gender,Email,Phone) " +
                        "Values(@Name,@Address,@Gender,@Email,@Phone)";
                    MySqlCommand cmd = new MySqlCommand(sql, con);
                    cmd.Parameters.AddWithValue("@Name", s.Name);
                    cmd.Parameters.AddWithValue("@Address", s.Address);
                    cmd.Parameters.AddWithValue("@Gender", s.Gender);
                    cmd.Parameters.AddWithValue("@Email", s.Email);
                    cmd.Parameters.AddWithValue("@Phone", s.Phone);
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
                    Console.WriteLine(ex.Message);
                }
                finally
                {
                    con.Close();

                }
                return isSuccess;

            }

            public bool Update(tablecls s)
            {
                bool isSuccess = false;
                MySqlConnection con = new MySqlConnection(myconnstrng);
                try
                {
                    string sql = "update employee set Name=@Name" +
                        "Address=@Address,Gender=@Gender,Email=@Email,Phone=@Phone where EmployeeID=@EmployeeID";

                    MySqlCommand cmd = new MySqlCommand(sql, con);
                    cmd.Parameters.AddWithValue("@Name", s.Name);
                    cmd.Parameters.AddWithValue("@Address", s.Address);
                    cmd.Parameters.AddWithValue("@Gender", s.Gender);
                    cmd.Parameters.AddWithValue("@Email", s.Email);
                    cmd.Parameters.AddWithValue("@Phone", s.Phone);
                    cmd.Parameters.AddWithValue("@EmployeeID", s.EmployeeID);

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
                    Console.WriteLine(ex.Message);
                }
                finally
                {
                    con.Close();

                }
                return isSuccess;

            }

            public bool Delete(tablecls s)
            {
                bool isSuccess = false;
                MySqlConnection con = new MySqlConnection(myconnstrng);
                try
                {
                    string sql = "Delete from  employee where EmployeeID=@EmployeeID";

                    MySqlCommand cmd = new MySqlCommand(sql, con);
                    cmd.Parameters.AddWithValue("@EmployeeID", s.EmployeeID);

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
