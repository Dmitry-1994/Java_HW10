package ru.netology.Java_HW10.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Java_HW10.item.FilmsItem;
import ru.netology.Java_HW10.repository.FilmsRepository;

public class FilmsManagerWithoutParameterTest {
    FilmsRepository repository = new FilmsRepository();
    FilmsManager manager = new FilmsManager(repository);

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
    FilmsItem item_11 = new FilmsItem(11, "HarryPotter_XI");


    @Test
    public void findLastNull() {
        FilmsItem[] expected = {};
        FilmsItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOne() {

        manager.addFilm(item_1);

        FilmsItem[] expected = {item_1};
        FilmsItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMore() {

        manager.addFilm(item_1);
        manager.addFilm(item_2);
        manager.addFilm(item_3);
        manager.addFilm(item_4);
        manager.addFilm(item_5);

        FilmsItem[] expected = {
                item_5,
                item_4,
                item_3,
                item_2,
                item_1};
        FilmsItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastLessLimit() {

        manager.addFilm(item_1);
        manager.addFilm(item_2);
        manager.addFilm(item_3);
        manager.addFilm(item_4);
        manager.addFilm(item_5);
        manager.addFilm(item_6);
        manager.addFilm(item_7);
        manager.addFilm(item_8);
        manager.addFilm(item_9);

        FilmsItem[] expected = {
                item_9,
                item_8,
                item_7,
                item_6,
                item_5,
                item_4,
                item_3,
                item_2,
                item_1};
        FilmsItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastLimit() {

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

        FilmsItem[] expected = {
                item_10,
                item_9,
                item_8,
                item_7,
                item_6,
                item_5,
                item_4,
                item_3,
                item_2,
                item_1};
        FilmsItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoreLimit() {

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
        manager.addFilm(item_11);

        FilmsItem[] expected = {
                item_11,
                item_10,
                item_9,
                item_8,
                item_7,
                item_6,
                item_5,
                item_4,
                item_3,
                item_2};
        FilmsItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
