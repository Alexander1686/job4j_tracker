package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private int id;
    private String name;
    public LocalDateTime created;
    //private LocalDateTime created;

    public Item() {
        //this.created = LocalDateTime.now();
    }

    public Item(String name) {
        this.name = name;
       // this.created = LocalDateTime.now();
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
       // this.created = LocalDateTime.now();
    }

    public Item(int id, String name, LocalDateTime created) {
        this.id = id;
        this.name = name;
     //   this.created = LocalDateTime.now();
    }

    public LocalDateTime getCreated() {
        this.created = LocalDateTime.now();
        return created;
    }

    public LocalDateTime getCreated2() {
        this.created = LocalDateTime.now();
        return created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Item item = new Item("Sample Item");
        System.out.println("time and data now " + item.getCreated());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String created = item.created.format(formatter);
        System.out.println("time and data now in right format " + created);
    }
}

