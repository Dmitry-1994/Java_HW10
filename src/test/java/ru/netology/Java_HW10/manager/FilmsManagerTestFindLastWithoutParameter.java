package ru.netology.Java_HW10.manager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FilmsManagerTestFindLastWithoutParameter {
    @Test
    public void findLastFilmsNull() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmsOne() {
        FilmsManager manager = new FilmsManager();


        manager.addFilm("HarryPotter_I");

        String[] expected = {"HarryPotter_I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsLessLimit() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("HarryPotter_I");
        manager.addFilm("HarryPotter_II");
        manager.addFilm("HarryPotter_III");
        manager.addFilm("HarryPotter_IV");
        manager.addFilm("HarryPotter_V");
        manager.addFilm("HarryPotter_VI");
        manager.addFilm("HarryPotter_VII");
        manager.addFilm("HarryPotter_VIII");
        manager.addFilm("HarryPotter_IX");

        String[] expected = {
                "HarryPotter_IX",
                "HarryPotter_VIII",
                "HarryPotter_VII",
                "HarryPotter_VI",
                "HarryPotter_V",
                "HarryPotter_IV",
                "HarryPotter_III",
                "HarryPotter_II",
                "HarryPotter_I"
        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsLimit() {
        FilmsManager manager = new FilmsManager();

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
                "HarryPotter_V",
                "HarryPotter_IV",
                "HarryPotter_III",
                "HarryPotter_II",
                "HarryPotter_I"
        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmsMoreLimit() {
        FilmsManager manager = new FilmsManager();

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
        manager.addFilm("HarryPotter_XI");

        String[] expected = {
                "HarryPotter_XI",
                "HarryPotter_X",
                "HarryPotter_IX",
                "HarryPotter_VIII",
                "HarryPotter_VII",
                "HarryPotter_VI",
                "HarryPotter_V",
                "HarryPotter_IV",
                "HarryPotter_III",
                "HarryPotter_II",
        };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
