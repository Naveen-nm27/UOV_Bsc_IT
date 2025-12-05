using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WFPrac
{
    internal class Operations
    {

        private DbConnector _connector = new DbConnector();
        public Operations() { }

        public bool IsDbConnected()
        {
            try
            {
                MySqlConnection connection = _connector.GetConnection();
                connection.Open();
                connection.Close();
                return true;
            }
            catch (Exception)
            {
                return false;
            }
        }

        public bool AddUser(User user)
        {
            string query = $"INSERT INTO users (name, password) VALUES ('{user.Name}', '{user.Password}')";

            using (var conn = _connector.GetConnection() )
            {
                conn.Open();
                using (var cmd = new MySqlCommand(query, conn))
                {
                    return cmd.ExecuteNonQuery() > 0;
                }
            }
        }

        public User GetUser(string name)
        {
            string query = "SELECT * FROM users WHERE name = @name";

            using (var conn = _connector.GetConnection())
            {
                conn.Open();
                using (var cmd = new MySqlCommand(query, conn))
                {
                    cmd.Parameters.AddWithValue("@name", name);

                    using (var reader = cmd.ExecuteReader())
                    {
                        if (reader.HasRows)
                        {
                            while (reader.Read())
                            {
                                var user = new User()
                                {
                                    Name = reader["name"].ToString(),
                                    Password = reader["password"].ToString()
                                };
                                return user;
                            }
                        }
                    }
                }
                return null;
            }
        }
    }
}
