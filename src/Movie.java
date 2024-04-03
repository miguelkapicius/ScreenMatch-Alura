public class Movie {
    String name;
    int releaseYear;
    boolean include;
    double rating;
    int totalRatings;
    int duration;

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