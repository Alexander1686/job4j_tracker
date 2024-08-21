package ru.job4j.Checkstyle;

public class Broken {
    private int sizeOfEmpty = 10;
    public String surname;
    public static final String NEW_VALUE = "";

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        } else {
            System.out.println("Object is null");
        }
    }

    String name;

    Broken() {
    }
}