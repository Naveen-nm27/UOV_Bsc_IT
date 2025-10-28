using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CinemaBase
{
    public partial class View : Form
    {

        private List<Movie> movieList;

        public View(List<Movie> sharedList)
        {
            InitializeComponent();
            movieList = sharedList;
            LoadMovies();
        }

        private void LoadMovies()
        {
            comboBox1.Items.Clear();
            foreach (var mv in movieList)
            {
                comboBox1.Items.Add($"{mv.MovieId} - {mv.MovieTitle}");
                
            }

            


        }
    }
}
