public class Movie {
    String name;
    int releaseYear;
    boolean include;
    private double rating;
    private int totalRatings;
    int duration;

    int getTotalRatings() {
        return totalRatings;
    }

    void displaySheet() {
        System.out.println("Movie Name: " + name);
        System.out.println("Release Year: " + releaseYear);
    }

    void rateMovie(double grade) {
        rating += grade;
        totalRatings++;
    }

    double ratingAverage() {
        return rating / totalRatings;
    }
}