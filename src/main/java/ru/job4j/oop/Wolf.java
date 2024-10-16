package ru.job4j.oop;

public class Wolf {
    public void tryEat(Ball ball, boolean escaped) {
        if (!escaped) {
            System.out.println("Wolf has eaten the ball.");
        } else {
            System.out.println("Wolf couldn't catch the ball.");
        }
    }
}
