package com.example.cinemas.ui.movie;

public class Movie {
    int idMovie ,imgMovie;
    String nameMove, Time,Type,Describe;

    public Movie() {
    }

    public Movie(int idMovie, String nameMove, int imgMovie) {
        this.idMovie = idMovie;
        this.nameMove = nameMove;
        this.imgMovie = imgMovie;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getNameMove() {
        return nameMove;
    }

    public void setNameMove(String nameMove) {
        this.nameMove = nameMove;
    }

    public int getImgMovie() {
        return imgMovie;
    }

    public void setImgMovie(int imgMovie) {
        this.imgMovie = imgMovie;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        Describe = describe;
    }
}
