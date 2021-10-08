package ru.geekbrains.lesson6.animals;

public class Cat extends Animal{

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int length) {
        if (length <= 200) System.out.println("Cat: "+this.name+" пробежал "+length+"м");
    }

    @Override
    public void swim(int length) {
        System.out.println("Котейки не умеют плавать");
    }
}
