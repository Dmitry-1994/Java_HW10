package ru.netology.Java_HW10.repository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Java_HW10.item.FilmsItem;
import ru.netology.Java_HW10.repository.FilmsRepository;

public class FilmsRepositoryTest {
    FilmsItem item_1 = new FilmsItem(111, "Гарри Поттер");
    FilmsItem item_2 = new FilmsItem(222, "Властелин колец");
    FilmsItem item_3 = new FilmsItem(333, "Хобит");

    @Test
    public void saveItem(){
        FilmsRepository repo = new FilmsRepository();
        repo.save(item_1);
        repo.save(item_2);
        repo.save(item_3);

        FilmsItem[] expected = {item_1, item_2, item_3};
        FilmsItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void removeByIdItem(){
        FilmsRepository repo = new FilmsRepository();
        repo.save(item_1);
        repo.save(item_2);
        repo.save(item_3);
        repo.removeById(111);

        FilmsItem[] expected = {item_2, item_3};
        FilmsItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void removeAllItem(){
        FilmsRepository repo = new FilmsRepository();
        repo.save(item_1);
        repo.save(item_2);
        repo.save(item_3);
        repo.removeAll();

        FilmsItem[] expected = {};
        FilmsItem[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findByIdItems(){
        FilmsRepository repo = new FilmsRepository();
        repo.save(item_1);
        repo.save(item_2);
        repo.save(item_3);

        FilmsItem[] expected = {item_2};
        FilmsItem[] actual = repo.findById(222);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findByIdItemsNull(){
        FilmsRepository repo = new FilmsRepository();
        repo.save(item_1);
        repo.save(item_2);
        repo.save(item_3);

        FilmsItem[] expected = {};
        FilmsItem[] actual = repo.findById(444);

        Assertions.assertArrayEquals(expected, actual);

    }
}
