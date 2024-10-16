package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public String about() {
        return "My charge: " + load + "%";
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(70);
        Battery second = new Battery(30);
        Battery three = new Battery(30);
        Battery four = new Battery(50);
        Battery five = new Battery(80);
        Battery six = new Battery(20);
        Battery seven = new Battery(95);
        Battery eight = new Battery(0);
        System.out.println("First." + first.about());
        System.out.println("Second." + second.about());
        first.exchange(second);
        System.out.println("now First." + first.about());
        System.out.println("now Second." + second.about());
        three.exchange(four);
        System.out.println("now three." + three.about());
        System.out.println("now four." + four.about());
        five.exchange(six);
        System.out.println("now five." + five.about());
        System.out.println("now six." + six.about());
        seven.exchange(eight);
        System.out.println("now seven." + seven.about());
        System.out.println("now eight." + eight.about());
    }
}

