package ru.netology.Java_HW10.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FilmsManagerTestAdd {

    @Test
    public void addFilmsNull() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsOne() {
        FilmsManager manager = new FilmsManager();


        manager.addFilm("HarryPotter_I");

        String[] expected = {"HarryPotter_I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsMore() {
        FilmsManager manager = new FilmsManager();

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
