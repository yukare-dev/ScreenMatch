package br.com.alura.screenmatch.model;

public class Tittle {
    private String name;
    private int releaseDate;
    private boolean includedPlan;
    private double addRating;
    private int ratingTotal;
    private int lengthMinutes;

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public boolean isIncludedPlan() {
        return includedPlan;
    }

    public int getLengthMinutes() {
        return lengthMinutes;
    }

    public int getRatingTotal(){
        return ratingTotal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setLengthMinutes(int lengthMinutes) {
        this.lengthMinutes = lengthMinutes;
    }

    public void displaySheet(){
        System.out.println("Nome do filme:" + name);
        System.out.println("Ano de lançamento: " +releaseDate);
    }

    public void rating(double ratingNote) {
        addRating += ratingNote;
        ratingTotal++;
    }

    public double getAverage() {
        return addRating / ratingTotal;
    }
}
