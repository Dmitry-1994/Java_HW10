package ru.netology.Java_HW10.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.Java_HW10.item.FilmsItem;
import ru.netology.Java_HW10.repository.FilmsRepository;

public class FilmsManagerWithLimit {
    FilmsRepository repository = new FilmsRepository();
    FilmsManager manager = new FilmsManager(repository, 6);

    FilmsItem item_1 = new FilmsItem(111, "HarryPotter_I");
    FilmsItem item_2 = new FilmsItem(222, "HarryPotter_II");
    FilmsItem item_3 = new FilmsItem(333, "HarryPotter_III");
    FilmsItem item_4 = new FilmsItem(444, "HarryPotter_IV");
    FilmsItem item_5 = new FilmsItem(555, "HarryPotter_V");
    FilmsItem item_6 = new FilmsItem(666, "HarryPotter_VI");
    FilmsItem item_7 = new FilmsItem(777, "HarryPotter_VII");
    FilmsItem item_8 = new FilmsItem(888, "HarryPotter_VIII");
    FilmsItem item_9 = new FilmsItem(999, "HarryPotter_IX");
    FilmsItem item_10 = new FilmsItem(10, "HarryPotter_X");

    @BeforeEach
    public void setup() {
        manager.addFilm(item_1);
        manager.addFilm(item_2);
        manager.addFilm(item_3);
        manager.addFilm(item_4);
        manager.addFilm(item_5);
        manager.addFilm(item_6);
        manager.addFilm(item_7);
        manager.addFilm(item_8);
        manager.addFilm(item_9);
        manager.addFilm(item_10);
    }

    @Test
    public void findLast() {
        FilmsItem[] expected = {
                item_10,
                item_9,
                item_8,
                item_7,
                item_6,
                item_5,};
        FilmsItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
