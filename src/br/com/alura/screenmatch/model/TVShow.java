package br.com.alura.screenmatch.model;

public class TVShow extends Tittle {
    private int seasons;
    private boolean active;
    private int episodesSeasons;
    private int minutesEpisodes;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesSeasons() {
        return episodesSeasons;
    }

    public void setEpisodesSeasons(int episodesSeasons) {
        this.episodesSeasons = episodesSeasons;
    }

    public int getMinutesEpisodes() {
        return minutesEpisodes;
    }

    public void setMinutesEpisodes(int minutesEpisodes) {
        this.minutesEpisodes = minutesEpisodes;
    }

    @Override
    public int getLengthMinutes() {
        return seasons * episodesSeasons * minutesEpisodes;
    }
}
