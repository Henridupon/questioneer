package org.gg.models;

public class Movie {

    private final String titel;
    private final String summary;

    public Movie(String titel, String summary) {
        this.titel = titel;
        this.summary = summary;
    }

    public String getTitel() {
        return titel;
    }

    public String getSummary() {
        return summary;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "titel='" + titel + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
