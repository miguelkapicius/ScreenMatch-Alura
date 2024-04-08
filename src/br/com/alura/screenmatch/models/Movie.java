package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Classifiable;

public class Movie extends List implements Classifiable {
    private String director;

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
}