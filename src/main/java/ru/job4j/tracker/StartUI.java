package ru.job4j.tracker;

//import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item("Sample Item");
        //item.created = LocalDateTime.now();
        //LocalDateTime created = LocalDateTime.now();
        System.out.println("time and data now " + item.getCreated());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        //String created = item.created(LocalDateTime.now()).format(formatter);
        String created = item.created.format(formatter);
        String created2 = item.getCreated().format(formatter);
        String created3 = item.getCreated2().format(formatter);
        System.out.println("time and data now in right format " + created);
        System.out.println("time and data now in right format " + created2);
        String created4 = item.getCreated2().format(formatter);
        System.out.println(item.getId());
    }
}
