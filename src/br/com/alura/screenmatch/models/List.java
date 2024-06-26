package br.com.alura.screenmatch.models;

public class List {
    private String name;
    private int releaseYear;
    private boolean include;
    private double rating;
    private int totalRatings;
    private int duration;

    // Constructor
    public List(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setInclude(boolean include) {
        this.include = include;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public String getName() {
        return name;
    }

    public boolean isInclude() {
        return include;
    }

    public int getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void displaySheet() {
        System.out.println("br.com.alura.screenmatch.models.Movie Name: " + name);
        System.out.println("Release Year: " + releaseYear);
    }

    public void rate(double grade) {
        rating += grade;
        totalRatings++;
    }

    public double ratingAverage() {
        return rating / totalRatings;
    }

}