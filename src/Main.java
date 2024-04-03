public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.name = "Top Gun: Maverick";
        myMovie.releaseYear = 2022;
        myMovie.include = true;
        myMovie.rating = 0;
        myMovie.totalRatings = 0;
        myMovie.duration = 120;

        myMovie.displaySheet();
        myMovie.rateMovie(8);
        myMovie.rateMovie(5);
        myMovie.rateMovie(10);

        System.out.println(myMovie.totalRatings);
        System.out.println(myMovie.rating);
        System.out.println(myMovie.ratingAverage());
    }
}
