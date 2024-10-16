package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int y, int a) {
        return sum(y) + minus(y) + multiply(a) + divide(a);
    }

        public static void main(String[]args) {
            int result = Calculator.sum(10);
            System.out.println(result);
            int result2 = Calculator.minus(10);
            System.out.println(result2);
            Calculator calculator = new Calculator();
            int result3 = calculator.multiply(5);
            System.out.println(result3);
            int result4 = calculator.divide(5);
            System.out.println(result4);
            int result5 = calculator.sumAllOperation(5, 5);
            System.out.println(result5);
        }
    }
