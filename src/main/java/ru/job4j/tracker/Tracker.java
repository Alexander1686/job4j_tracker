package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[10];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item result = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }

    public Item[] findAll() {
        Item[] items = new Item[10];
        Item[] result = new Item[items.length];
        items[0] = new Item("Item 1");
        items[4] = new Item("Item 4");
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null) {
                result[size] = item;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println(Arrays.toString(result));
        return items;
    }

     public Item[] findByName(String y) {
        Item[] items = new Item[10];
        Item[] result = new Item[items.length];
        items[0] = new Item("Item 1");
        items[4] = new Item("Item 4");
        int size = items.length;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item != null) {
                String x = item.getName();
                if (x.equals(y)) {
                    result[i] = items[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker(); // Создаем экземпляр Tracker
        System.out.println(Arrays.toString(tracker.findAll()));
        System.out.println(Arrays.toString(tracker.findByName("Item 1")));
        System.out.println(tracker.findById(4));

    }
}