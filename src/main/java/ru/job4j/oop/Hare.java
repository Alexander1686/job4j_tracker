package ru.job4j.oop;

public class Hare {
    public void tryEat(Ball ball, boolean escaped) {
        if (!escaped) {
            System.out.println("Hare has eaten the ball.");
        } else {
            System.out.println("Hare couldn't catch the ball.");
        }
    }
}
