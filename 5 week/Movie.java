public class Movie {
    // creating class variables
    private String name;
    private int year;
    private String director;
    private double rating;

    // empty constructor
    public Movie() {
        name = "";
        year = 0;
        director = "";
        rating = -1;
    }

    // constructor
    public Movie(String newName, int newYear, String newDirector, double newRating) {
        name = newName;
        year = newYear;
        director = newDirector;
        rating = newRating;
    }

    public String toString() {
        return name + " hello! " + year;
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        Movie[] movies = new Movie[n];
        // recall how you create an array of integers:
        // int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            String name = StdIn.readString();
            int year = StdIn.readInt();
            String director = StdIn.readString();
            double rating = StdIn.readDouble();
            // creating an object with given variable values
            movies[i] = new Movie(name, year, director, rating);
        }
        // answer variable stores the movie with the highest rating
        Movie answer = new Movie();
        for (int i = 0; i < n; ++i) {
            // compare current movie with our "best" answer movie
            // and if it's better (in rating) then update our answer
            if (movies[i].rating > answer.rating) {
                answer = movies[i];
            }
        }
        System.out.println(answer); // recall toString()
    }
}
