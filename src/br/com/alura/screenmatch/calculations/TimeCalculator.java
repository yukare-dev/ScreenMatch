package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.TVShow;
import br.com.alura.screenmatch.model.Tittle;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void includes(Tittle tittle) {
        System.out.println("Adicionando duração em minutos de:" + tittle);
        this.totalTime += tittle.getLengthMinutes();
    }
}
