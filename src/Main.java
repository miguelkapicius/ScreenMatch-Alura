import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("Top Gun: Maverick");
        myMovie.setReleaseYear(2022);
        myMovie.setInclude(true);
        myMovie.setDuration(128);

        myMovie.displaySheet();
        myMovie.rateMovie(8);
        myMovie.rateMovie(5);
        myMovie.rateMovie(10);

        System.out.println("Total Ratings: " + myMovie.getTotalRatings());
        System.out.println(myMovie.ratingAverage());
    }
}
