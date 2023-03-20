package ru.netology.Java_HW10.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static  org.mockito.Mockito.*;
import org.mockito.Mockito;
import ru.netology.Java_HW10.item.FilmsItem;
import ru.netology.Java_HW10.repository.FilmsRepository;

public class FilmsManagerWithoutParameterTest {
    FilmsRepository repository = Mockito.mock(FilmsRepository.class);
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
        FilmsItem[] items = {};
        doReturn(items).when(repository).findAll();

        FilmsItem[] expected = {};
        FilmsItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOne() {
        FilmsItem[] items = {item_1};
        doReturn(items).when(repository).findAll();

        FilmsItem[] expected = {item_1};
        FilmsItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMore() {
        FilmsItem[] items = {
                item_1,
                item_2,
                item_3,
                item_4,
                item_5};
        doReturn(items).when(repository).findAll();

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

        FilmsItem[] items = {
                item_1,
                item_2,
                item_3,
                item_4,
                item_5,
                item_6,
                item_7,
                item_8,
                item_9};
        doReturn(items).when(repository).findAll();

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

        FilmsItem[] items = {
                item_1,
                item_2,
                item_3,
                item_4,
                item_5,
                item_6,
                item_7,
                item_8,
                item_9,
                item_10};
        doReturn(items).when(repository).findAll();

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

        FilmsItem[] items = {
                item_1,
                item_2,
                item_3,
                item_4,
                item_5,
                item_6,
                item_7,
                item_8,
                item_9,
                item_10,
                item_11};
        doReturn(items).when(repository).findAll();

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
