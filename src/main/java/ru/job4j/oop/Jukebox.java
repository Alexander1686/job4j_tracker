package ru.job4j.oop;

public class Jukebox {
    public static void music(int position) {
        if (position == 1) {
            System.out.println("pust begut neukluzhe");
        } else if (position == 2) {
            System.out.println("spokoinoi nochi");
        } else {
            System.out.println("pesnia ne naidena");
        }
    }

    public static void main(String[] args) {
        Jukebox.music(1);
        Jukebox.music(2);
        Jukebox.music(3);
    }
}