package ru.netology.Java_HW10.manager;

public class FilmsManager {
    private String[] films = new String[0];
    private int limit;

    public FilmsManager() {
        this.limit = 10;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String nameFilm) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = nameFilm;
        films = tmp;


    }

    public String[] findAll() {
        return films;

    }

    public String[] findLast() {
        int reversLength;
        if (films.length < limit) {
            reversLength = films.length;
        } else {
            reversLength = limit;
        }

        String[] revers = new String[reversLength];
        for (int i = 0; i < revers.length; i++) {
            revers[i] = films[films.length - 1 - i];
        }
        return revers;
    }
}
