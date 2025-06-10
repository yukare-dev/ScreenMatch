import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.TVShow;

public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.setName("Invocação do Mal");
        firstMovie.setReleaseDate(2013);
        firstMovie.setLengthMinutes(112);

        firstMovie.displaySheet();
        firstMovie.rating(10);
        firstMovie.rating(8);
        firstMovie.rating(9);
        System.out.println("Total de avaliações: " + firstMovie.getRatingTotal());
        System.out.println(firstMovie.getAverage());

        TVShow lost = new TVShow();
        lost.setName("Lost");
        lost.setReleaseDate(2000);
        lost.displaySheet();
        lost.setSeasons(6);
        lost.setEpisodesSeasons(22);
        System.out.println("Duração do filme: " + lost.getLengthMinutes());
    }
}