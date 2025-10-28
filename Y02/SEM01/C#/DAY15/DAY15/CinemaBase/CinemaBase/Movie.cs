using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CinemaBase
{

    public class Movie
    {
        public string MovieId { get; set; }
        public string MovieTitle { get; set; }
        public string Director { get; set; }
        public string Production { get; set; }
        public string Email { get; set; }
        public string Review { get; set; }

        public Movie(string movieId, string movieTitle, string director, string production, string email, string review)
        {
            MovieId = movieId;
            MovieTitle = movieTitle;
            Director = director;
            Production = production;
            Email = email;
            Review = review;
        }
    }
}
