package ru.netology.Java_HW10.manager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FilmsManagerTestFindLastWithParameter {
    @Test
    public void findLastFilmsNullLimit() {
        FilmsManager manager = new FilmsManager(0);

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmsOneNullLimit() {
        FilmsManager manager = new FilmsManager(0);


        manager.addFilm("HarryPotter_I");

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsLimit() {
        FilmsManager manager = new FilmsManager(5);

        manager.addFilm("HarryPotter_I");
        manager.addFilm("HarryPotter_II");
        manager.addFilm("HarryPotter_III");
        manager.addFilm("HarryPotter_IV");
        manager.addFilm("HarryPotter_V");
        manager.addFilm("HarryPotter_VI");
        manager.addFilm("HarryPotter_VII");
        manager.addFilm("HarryPotter_VIII");
        manager.addFilm("HarryPotter_IX");
        manager.addFilm("HarryPotter_X");

        String[] expected = {
                "HarryPotter_X",
                "HarryPotter_IX",
                "HarryPotter_VIII",
                "HarryPotter_VII",
                "HarryPotter_VI",
        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
