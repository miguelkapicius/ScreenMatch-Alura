package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Classifiable;

public class Movie extends List implements Classifiable {
    private String director;

    // Constructor
    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) ratingAverage() / 2;
    }

    @Override
    public String toString() {
        return "Title: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}