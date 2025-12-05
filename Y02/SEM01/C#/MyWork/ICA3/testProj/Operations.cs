using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace testProj
{
    internal class Operations
    {
        DBConnection _conn = new DBConnection();

        public Operations() { }

        public bool checkConection()
        {
            try
            {
                MySqlConnection connection = _conn.GetConnection();
                connection.Open();
                connection.Close();
                return true;
            } catch (Exception)
            {
                return false;
            }
        }
         
        public bool addUser(User user)
        {
            string sql = $"INSERT INTO user_data (firstname,lastname,username,password,subject,imgpath) VALUES ('{user.firstName}','{user.lastName}','{user.userName}','{user.password}','{user.subject}','{user.imgFilePath}')";

            var conn = _conn.GetConnection();
            conn.Open();

            var cmd = new MySqlCommand(sql, conn);

            if (cmd.ExecuteNonQuery() > 0)
            {
                conn.Dispose();
                cmd.Dispose();
                return true;
            }
            else
            {
                conn.Dispose();
                cmd.Dispose();
                return false;
            }


        }

        public User viewUserData(string username)
        {
            string sql = $"SELECT * FROM user_data WHERE username = '{username}'";
            User user=null;

            using (var con = _conn.GetConnection())
            {
                con.Open();

                using (MySqlCommand cmd = new MySqlCommand(sql, con))
                using (MySqlDataReader reader = cmd.ExecuteReader()) {
                    while (reader.Read()) {
                        user = new User()
                        {
                            UserId = reader.GetInt32("userId"),
                            firstName = reader.GetString("firstname"),
                            lastName = reader.GetString("lastname"),
                            userName = reader.GetString("username"),
                            password = reader.GetString("password"),
                            subject = reader.GetString("subject")
                        };

                    }
                }
            }
            return user;
        }

        public bool deleteUser(string username) 
        {
            var sql = $"DELETE FROM user_data WHERE username = '{username}'";

            using(var con = _conn.GetConnection())
            {
                con.Open();

                using(var cmd = new MySqlCommand(sql, con))
                {
                    int rowsEffected = cmd.ExecuteNonQuery();

                    if (rowsEffected > 0) 
                    {
                        MessageBox.Show($"Deleted {rowsEffected} Records");
                        return true;
                    }
                    else
                    {
                        MessageBox.Show($"No data Removed");
                        return false;
                    }
                }
            }
        }

        public bool updateUser(string username,string newUseName) 
        {
            var sql = $"UPDATE user_data set username = '{newUseName}' WHERE username = '{username}'";
           
            using (var con = _conn.GetConnection())
            {

                con.Open();
                using (var cmd = new MySqlCommand(sql, con))
                {
                    
                    int updated = cmd.ExecuteNonQuery();

                    if(updated != 0)
                    {
                        MessageBox.Show($"Updated {username} to {newUseName}");
                        return true;
                    } 
                    else
                    {
                        MessageBox.Show("User Dosen't Exist");
                        return false;
                    }
                }
            }
        }

        public bool Login(string username, string password)
        {
            string sql = "SELECT COUNT(*) FROM user_data WHERE username = @username AND password = @password";

            using (var con = _conn.GetConnection())
            {
                con.Open();

                using (var cmd = new MySqlCommand(sql, con))
                {
                    cmd.Parameters.AddWithValue("@username", username);
                    cmd.Parameters.AddWithValue("@password", password);

                    int count = Convert.ToInt32(cmd.ExecuteScalar());

                    return count == 1;
                }
            }
        }


    }
}
