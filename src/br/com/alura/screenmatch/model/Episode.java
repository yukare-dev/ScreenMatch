package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculations.Rate;

public class Episode implements Rate {
    private int number;
    private String name;
    private TVShow tvshow;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    private int totalViews;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TVShow getTvshow() {
        return tvshow;
    }

    public void setTVShow(TVShow tvshow) {
        this.tvshow = tvshow;
    }

    @Override
    public int getRate() {
        if (totalViews > 100) {
            return 4;
        } else {
        return 2;
        }
    }
}
