import br.com.alura.screenmatch.calculation.RecommendationFilter;
import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Series mySeries = new Series();

        mySeries.setName("Top Gun: Maverick");
        mySeries.setReleaseYear(2022);
        mySeries.setInclude(true);
        mySeries.setSeasons(10);
        mySeries.setEpisodesPerSeason(5);
        mySeries.setMinutesPerEpisode(30);

        mySeries.displaySheet();
        mySeries.rateMovie(8);
        mySeries.rateMovie(5);
        mySeries.rateMovie(10);

        System.out.println("Total Ratings: " + mySeries.getTotalRatings());
        System.out.println(mySeries.ratingAverage());

        Series series = new Series();

        series.setName("Banana");
        series.setSeasons(6);

        System.out.println("Duration: " + mySeries.getDuration());

        Movie myMovie = new Movie();
        myMovie.setName("Minions");
        myMovie.setReleaseYear(2021);
        myMovie.setDuration(120);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(mySeries);
        calculator.include(myMovie);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        System.out.println(mySeries.getClassification());
        filter.filter(mySeries);

        Episode episode = new Episode();

        episode.setNumber(1);
        episode.setSeries(mySeries);
        episode.setTotalViews(250);
        filter.filter(episode);
    }
}
