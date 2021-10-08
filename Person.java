package ru.geekbrains.lesson5;

public class Person {
    private String name, post, email, number;
    private int  salary, age;

    public Person(String name, String post, String email, String number, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.salary = salary;
        this.number = number;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("Name: "+name+" post: "+post+" email: "+email+" number: "+number+" salary: "+salary+" age: "+age);
    }
}
