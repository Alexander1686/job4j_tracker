package ru.job4j.oop;

public class Ball {

    public void tryRun(boolean condition) {

        if (condition == true) {
            System.out.println("escape sucsessfull");
        } else if (condition == false) {
            System.out.println("ball is consumed");
        }
    }
}
