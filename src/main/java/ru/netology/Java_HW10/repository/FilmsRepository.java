package ru.netology.Java_HW10.repository;

import ru.netology.Java_HW10.item.FilmsItem;

public class FilmsRepository {
    private FilmsItem[] items = new FilmsItem[0];

    public void save(FilmsItem item){
        FilmsItem[] tmp = new FilmsItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;

    }

    public void removeById(int id){
        FilmsItem[] tmp = new FilmsItem[items.length - 1];
        int copyIndex = 0;
        for (FilmsItem item :items) {
            if (item.getFilmId() != id){
                tmp[copyIndex] = item;
                copyIndex++;
            }
        }
        items = tmp;
    }

    public void removeAll(){
        FilmsItem[] tmp = new FilmsItem[0];
        items = tmp;
    }

    public FilmsItem[] findAll(){
        return items;
    }

    public FilmsItem[] findById(int id){
        FilmsItem[] tmp = new FilmsItem[1];
        FilmsItem[] result = new FilmsItem[0];
        for (FilmsItem item : items){
            if (item.getFilmId() == id) {
                tmp[0] = item;
                return tmp;
            }
        }
        return result;
    }


}
