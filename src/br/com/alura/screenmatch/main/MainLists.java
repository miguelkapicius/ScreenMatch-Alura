package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.List;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class MainLists {
    public static void main(String[] args) {

        Movie myMovie = new Movie("Minions", 2005);
        myMovie.rate(9);
        Movie myMovie2 = new Movie("Top Gun: Maverick", 2022);
        myMovie2.rate(6);
        Series mySeries = new Series("Breaking Bad", 2008);
        mySeries.rate(10);

        ArrayList<List> watchlist = new ArrayList<>();
        watchlist.add(myMovie);
        watchlist.add(myMovie2);
        watchlist.add(mySeries);

        // watchlist.forEach(item -> System.out.println(item));

        for (List item : watchlist) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println("Rating: " + movie.getClassification());
            }
        }
    }
}
