package ru.geekbrains.lesson5;

public class MainApp {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Andrey Shihov", "Engineer", "neefe.saratan.life.life@gmail.com", "8977576879", 4100, 20) ,
                new Person("`My childhood`", "Physics", "evDora@gmail.com", "8954387546", 3200, 19),
                new Person("Yagami Light", "Kira", "IwantToSeeLsDie@gmail.com", "82352634673", 30000, 27),
                new Person("Dostoevskii", "Writter", "wrong time", "wrong time", 10000, 67),
                new Person("Thanos", "unemployed", "GiveMeStonesOfInfinity@gmail.com", "8977576879", 1000000, 25000)
        };

        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() > 40) {
                persons[i].info();
            }
        }

    }
}
