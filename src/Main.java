import br.com.alura.screenmatch.calculation.RecommendationFilter;
import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var myMovie2 = new Movie("Top Gun: Maverick", 2022);
        myMovie2.setReleaseYear(2022);
        myMovie2.setInclude(true);


        myMovie2.displaySheet();
        myMovie2.rateMovie(8);
        myMovie2.rateMovie(5);
        myMovie2.rateMovie(10);

        System.out.println("Total Ratings: " + myMovie2.getTotalRatings());
        System.out.println(myMovie2.ratingAverage());

        Series series = new Series("Banana", 2019);
        series.setSeasons(6);

        System.out.println("Duration: " + myMovie2.getDuration());

        Movie myMovie = new Movie("Minions", 2005);
        myMovie.setReleaseYear(2021);
        myMovie.setDuration(120);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie2);
        calculator.include(myMovie);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        System.out.println(myMovie2.getClassification());
        filter.filter(myMovie2);

        Episode episode = new Episode();

        episode.setNumber(1);
        episode.setTotalViews(250);
        filter.filter(episode);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(myMovie);
        moviesList.add(myMovie2);

        System.out.println(moviesList.size());
        System.out.println(moviesList.get(0).getName());
        System.out.println(moviesList);
    }
}
