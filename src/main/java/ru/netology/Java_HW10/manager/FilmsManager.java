package ru.netology.Java_HW10.manager;

import ru.netology.Java_HW10.item.FilmsItem;
import ru.netology.Java_HW10.repository.FilmsRepository;

public class FilmsManager {
    private FilmsRepository repository;
    private int limit;

    public FilmsManager(FilmsRepository repository){
        this.repository = repository;
        this.limit = 10;
    }

    public FilmsManager(FilmsRepository repository, int limit){
        this.repository = repository;
        this.limit = limit;
    }

    public void addFilm(FilmsItem item){
        repository.save(item);
    }

    public FilmsItem[] findAll(){
        return repository.findAll();
    }

    public FilmsItem[] findLast() {
        FilmsItem[] all = repository.findAll();
        int reversLength;
        if (all.length < limit) {
            reversLength = all.length;
        } else {
            reversLength = limit;
        }

        FilmsItem[] revers = new FilmsItem[reversLength];
        for (int i = 0; i < revers.length; i++) {
            revers[i] = all[all.length - 1 - i];
        }
        return revers;
    }
}
