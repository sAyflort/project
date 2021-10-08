package ru.geekbrains.lesson6.animals;

public class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int length) {
        if (length <= 500) System.out.println("Dog: "+this.name+" проплыл "+length+"м");
    }

    @Override
    public void swim(int length) {
        if (length <= 10) System.out.println("Dog: "+this.name+" проплыл "+length+"м");
    }
}
