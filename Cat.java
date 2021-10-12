package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isntHungry;
    public Cat() {
        name = "Неизвестно";
        appetite = 0;
        isntHungry = false;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isntHungry = false;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            isntHungry = true;
            System.out.println(name + " поел");
        }
    }

    public void info() {
        System.out.printf("Name: %s, ", name);
        System.out.printf("isn`t hungry: %b", isntHungry);
        System.out.println();
    }
}
