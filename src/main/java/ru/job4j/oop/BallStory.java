package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        boolean condition = false;
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        wolf.tryEat(ball);
        hare.tryEat(ball);
        fox.tryEat(ball);
        ball.tryRun(condition);
    }
}
