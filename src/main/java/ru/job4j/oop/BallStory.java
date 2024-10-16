package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        boolean escapedFromWolf = ball.tryRun(true);
        wolf.tryEat(ball, escapedFromWolf);
        boolean escapedFromHare = ball.tryRun(true);
        hare.tryEat(ball, escapedFromHare);
        boolean escapedFromFox = ball.tryRun(false);
        fox.tryEat(ball, escapedFromFox);
    }
}
