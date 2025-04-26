public class Movie {
    String name;
    int releaseDate;
    boolean includedPlan;
    private double addRating;
    private int ratingTotal;
    int lengthMinutes;

    int getRatingTotal(){
        return ratingTotal;
    }

    void displaySheet(){
        System.out.println("Nome do filme:" + name);
        System.out.println("Ano de lançamento: " +releaseDate);
    }

    void rating(double ratingNote) {
        addRating += ratingNote;
        ratingTotal++;
    }

    double getAverage() {
        return addRating / ratingTotal;
    }
}