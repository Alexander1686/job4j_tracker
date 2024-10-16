package ru.job4j.oop;

public class Ball {

    public boolean tryRun(boolean condition) {
        if (condition) {
            System.out.println("escape sucsessfull");
            return true;
        } else {
            System.out.println("ball is consumed");
            return false;
        }
    }
}
