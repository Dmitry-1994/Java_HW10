package ru.netology.Java_HW10.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FilmManagerAddTest {

    @Test
    public void addFilmsNull() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsOne() {
        FilmManager manager = new FilmManager();


        manager.addFilm("HarryPotter_I");

        String[] expected = {"HarryPotter_I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsMore() {
        FilmManager manager = new FilmManager();

        manager.addFilm("HarryPotter_I");
        manager.addFilm("HarryPotter_II");
        manager.addFilm("HarryPotter_III");
        manager.addFilm("HarryPotter_IV");
        manager.addFilm("HarryPotter_V");

        String[] expected = {"HarryPotter_I", "HarryPotter_II", "HarryPotter_III", "HarryPotter_IV", "HarryPotter_V"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

}
