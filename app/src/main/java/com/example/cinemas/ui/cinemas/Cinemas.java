package com.example.cinemas.ui.cinemas;

public class Cinemas {
    int idCinemas;
    String nameCinemas, screeningTime,datetimeCinemas,movie,locationCinemas;

    public Cinemas() {
    }

    public Cinemas(int idCinemas, String nameCinemas, String screeningTime, String datetimeCinemas, String movie, String locationCinemas) {
        this.idCinemas = idCinemas;
        this.nameCinemas = nameCinemas;
        this.screeningTime = screeningTime;
        this.datetimeCinemas = datetimeCinemas;
        this.movie = movie;
        this.locationCinemas = locationCinemas;
    }

    public int getIdCinemas() {
        return idCinemas;
    }

    public void setIdCinemas(int idCinemas) {
        this.idCinemas = idCinemas;
    }

    public String getNameCinemas() {
        return nameCinemas;
    }

    public void setNameCinemas(String nameCinemas) {
        this.nameCinemas = nameCinemas;
    }

    public String getScreeningTime() {
        return screeningTime;
    }

    public void setScreeningTime(String screeningTime) {
        this.screeningTime = screeningTime;
    }

    public String getDatetimeCinemas() {
        return datetimeCinemas;
    }

    public void setDatetimeCinemas(String datetimeCinemas) {
        this.datetimeCinemas = datetimeCinemas;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getLocationCinemas() {
        return locationCinemas;
    }

    public void setLocationCinemas(String locationCinemas) {
        this.locationCinemas = locationCinemas;
    }

    @Override
    public String toString() {
        return "Cinemas{" +
                "idCinemas=" + idCinemas +
                ", nameCinemas='" + nameCinemas + '\'' +
                ", screeningTime='" + screeningTime + '\'' +
                ", datetimeCinemas='" + datetimeCinemas + '\'' +
                ", movie='" + movie + '\'' +
                ", locationCinemas='" + locationCinemas + '\'' +
                '}';
    }
}
