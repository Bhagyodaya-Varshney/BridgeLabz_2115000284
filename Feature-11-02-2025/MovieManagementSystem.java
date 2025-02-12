class MovieManagementSystem {
    public static void main(String[] args) {
        Movie movie = new Movie("3 Idiots", "RP Singh", 2015, 9);
        movie = movie.addMovieAtBeginning("Dangal", "HK Verma", 2020, 8, movie);
        movie = movie.addMovieAtBeginning("ABCD", "Remo D", 2019, 9, movie);
        movie = movie.addMovieAtEnd("Lagaan", "Kunal Chaudhary", 2001, 8, movie);
        movie = movie.addMovieAtEnd("Sholay", "Bhagyodaya Varshney", 1975, 10, movie);

        movie.displayMoviesForward(movie);
        movie.displayMoviesReverse(movie);
		
        movie.searchMovieByDirector("RP Singh", movie);

        movie.updateMovieRating("Dangal", 9, movie);
        movie.displayMoviesForward(movie);

        movie = movie.removeMovie("Zindagi Na Milegi Dobara", movie);
        movie.displayMoviesForward(movie);
    }
}

class Movie {
    String Title, Director;
    int YearOfRelease, Rating;
    Movie next, prev;

    Movie(String Title, String Director, int YearOfRelease, int Rating) {
        this.Title = Title;
        this.Director = Director;
        this.YearOfRelease = YearOfRelease;
        this.Rating = Rating;
        this.next = null;
        this.prev = null;
    }

    public static Movie addMovieAtBeginning(String title, String director, int year, int rating, Movie movie) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (movie != null) {
            newMovie.next = movie;
            movie.prev = newMovie;
        }
        return newMovie;
    }

    public static Movie addMovieAtEnd(String title, String director, int year, int rating, Movie movie) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (movie == null) 
            return newMovie;

        Movie temp = movie;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newMovie;
        newMovie.prev = temp;
        return movie;
    }

    public static Movie removeMovie(String title, Movie movie) {
        Movie temp = movie;
        while (temp != null && !temp.Title.equals(title))
            temp = temp.next;

        if (temp == null) {
            System.out.println("Movie: " + title + " not found.");
            return movie;
        }

        if (temp.prev != null)
            temp.prev.next = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;

        if (temp == movie)
            movie = temp.next;

        System.out.println("Movie: " + title + " removed successfully.");
        return movie;
    }

    public static void searchMovieByDirector(String director, Movie movie) {
        while (movie != null) {
            if (movie.Director.equals(director)) {
                System.out.println("Movie Found: " + movie.Title + " Year Of Release: " + movie.YearOfRelease);
            }
            movie = movie.next;
        }
    }

    public static void updateMovieRating(String title, int newRating, Movie movie) {
        while (movie != null && !movie.Title.equals(title))
            movie = movie.next;

        if (movie != null) {
            movie.Rating = newRating;
            System.out.println("Movie \"" + title + "\" rating updated to " + newRating);
        } else {
            System.out.println("Movie not found.");
        }
    }

    public static void displayMoviesForward(Movie movie) {
        System.out.println("Movies List (Forward Order):");
        while (movie != null) {
            System.out.println("Movie Title: "+movie.Title);
            System.out.println("Movie Director: " + movie.Director);
            System.out.println("Year Of Release: " + movie.YearOfRelease);
            System.out.println("Movie Rating: " + movie.Rating);
            System.out.println();
            movie = movie.next;
        }
        System.out.println();
    }

    public static void displayMoviesReverse(Movie movie) {
        if (movie == null)
            return;

        while (movie.next != null)
            movie = movie.next;

        System.out.println("Movies List (Reverse Order):");
        while (movie != null) {
            System.out.println("Movie Title: "+movie.Title);
            System.out.println("Movie Director: " + movie.Director);
            System.out.println("Year Of Release: " + movie.YearOfRelease);
            System.out.println("Movie Rating: " + movie.Rating);
            System.out.println();
            movie = movie.prev;
        }
        System.out.println();
    }
}
