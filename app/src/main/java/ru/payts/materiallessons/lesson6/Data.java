package ru.payts.materiallessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class Data {

    List<String> list;

    public Data() {
        list = new ArrayList<>();
        list.add("Чайка");
        list.add("Орел");
        list.add("Сова");
        list.add("Зимородок");
        list.add("Чайка");
        list.add("Орел");
        list.add("Сова");
        list.add("Зимородок");
        list.add("Чайка");
        list.add("Орел");
        list.add("Сова");
        list.add("Зимородок");
    }

    public List<String> getList() {

        return list;
    }
}
