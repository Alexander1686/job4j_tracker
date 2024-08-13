package ru.job4j.oop;

public class Jukebox {
    public static void music(int position) {
        if (position == 1) {
            System.out.println("let run");
        } else if (position == 2) {
            System.out.println("good night");
        } else {
            System.out.println("song not find");
        }
    }

    public static void main(String[] args) {
        Jukebox.music(1);
        Jukebox.music(2);
        Jukebox.music(3);
    }
}