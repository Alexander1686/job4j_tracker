package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item("Sample Item");
        System.out.println("time and data now " + item.getCreated());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String created = item.created.format(formatter);
        System.out.println("time and data now in right format " + created);
        System.out.println(item.getId());
    }
}
