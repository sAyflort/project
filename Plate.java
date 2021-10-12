package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        if(food > 0 ) this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food - n >= 0) {
            food -= n;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int n) {
        if (n > 0) food += n;
    }

    public void info() {
        System.out.printf("Food: %d", food);
        System.out.println();
    }

}
