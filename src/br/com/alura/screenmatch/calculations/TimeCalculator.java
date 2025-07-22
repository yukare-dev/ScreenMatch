package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.model.Movie;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void includes(Movie m) {
        totalTime += m.getLengthMinutes();
    }
}
