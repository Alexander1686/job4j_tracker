package ru.job4j.oop;

public class Fox {
    public void tryEat(Ball ball, boolean escaped) {
        if (!escaped) {
            System.out.println("Fox has eaten the ball.");
        } else {
            System.out.println("Fox couldn't catch the ball.");
        }
    }
}