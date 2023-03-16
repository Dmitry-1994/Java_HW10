package ru.netology.Java_HW10.item;
public class FilmsItem {
    private int filmId;
    private String filmName;

    public FilmsItem(int filmId, String filmName){
        this.filmId = filmId;
        this.filmName = filmName;
    }

    public int getFilmId(){
        return filmId;
    }
}
