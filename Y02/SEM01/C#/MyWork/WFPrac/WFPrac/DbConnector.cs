using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MySql.Data.MySqlClient;

namespace WFPrac
{
    internal class DbConnector
    {
        private readonly string _connectionString = "Server=Localhost;Database=mydb;Uid=root";

        public MySqlConnection GetConnection()
        {
            return new MySqlConnection(_connectionString);
        }
    }
}
