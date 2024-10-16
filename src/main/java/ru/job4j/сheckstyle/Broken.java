package ru.job4j.сheckstyle;

public class Broken {
    public static final String NEW_VALUE = "";

    private int sizeOfEmpty = 10;

    private String surname;

    private String name;

    public Broken() {
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        } else {
            System.out.println("Object is null");
        }
    }
}
