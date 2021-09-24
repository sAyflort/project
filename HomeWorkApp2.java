package ru.geekbrains.lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(sumLim(10,2) + "\n");
        System.out.println(numberSign(-10) + "\n");
        stringPrint("-Hello there\n-general Kenobi\n", 3);
        System.out.println(leapYear(1700));
    }

    public static boolean sumLim(int a, int b) {
        return a+b>=10 && a+b<=20;
    }

    public static boolean numberSign(int a) {
        System.out.println(a<0 ? "Отрицательное": "Положительное");
        System.out.println();
        return a<0;
    }

    public static void  stringPrint(String word, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }
    public static boolean leapYear(int year) {
        return year%400==0 || (year%100!=0 && year%4==0);
    }
}
