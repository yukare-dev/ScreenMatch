public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.name = "Invocação do Mal";
        firstMovie.releaseDate = 2013;
        firstMovie.lengthMinutes = 112;

        firstMovie.displaySheet();
        firstMovie.rating(10);
        firstMovie.rating(8);
        firstMovie.rating(9);
        System.out.println("Total de avaliações: " + firstMovie.getRatingTotal());
        System.out.println(firstMovie.getAverage());
    }
}