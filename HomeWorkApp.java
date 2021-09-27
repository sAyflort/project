package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println();
        checkSumSign();
        System.out.println();
        printColor();
        System.out.println();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a=2, b=-3;
        System.out.println(a+b>=0 ? "Сумма положительная": "Сумма отрицательная");
    }

    public static void  printColor() {
        int value = -1000;
        if (value<0) {
            System.out.println("Красный");
        } else if (value<=100) {
            System.out.println("Желтый");
        } else System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a=2, b=2;
        System.out.println(a>=b ? "a>=b" : "a<b");
    }
}
