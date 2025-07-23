package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculations.Rate;

public class Movie extends Tittle implements Rate {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRate() {
        return (int) getRatingTotal() / 2;
    }
}