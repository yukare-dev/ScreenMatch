import br.com.alura.screenmatch.calculations.TimeCalculator;
import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.TVShow;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Invocação do Mal");
        myMovie.setReleaseDate(2013);
        myMovie.setLengthMinutes(112);
        System.out.println("Duração do filme: " + myMovie.getLengthMinutes());

        myMovie.displaySheet();
        myMovie.rating(10);
        myMovie.rating(8);
        myMovie.rating(9);
        System.out.println("Total de avaliações: " + myMovie.getRatingTotal());
        System.out.println(myMovie.getAverage());

        TVShow lost = new TVShow();
        lost.setName("Lost");
        lost.setReleaseDate(2000);
        lost.displaySheet();
        lost.setSeasons(6);
        lost.setEpisodesSeasons(22);
        lost.setMinutesEpisodes(45);
        System.out.println("Duração para maratonar Lost: " + lost.getLengthMinutes());


        Movie anotherMovie = new Movie();
        anotherMovie.setName("Lemonade Mouth");
        anotherMovie.setReleaseDate(2011);
        anotherMovie.setLengthMinutes(90);


        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        calculator.includes(anotherMovie);
        System.out.println(calculator.getTotalTime());
    }
}