package ru.geekbrains.lesson6;

import ru.geekbrains.lesson6.animals.Animal;
import ru.geekbrains.lesson6.animals.Cat;
import ru.geekbrains.lesson6.animals.Dog;

public class MainApp {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Archi"),
                new Cat("Irbis"),
                new Cat("Magro"),
                new Cat("Milpheya"),
                new Cat("Tseri"),
                new Dog("Bobik"),
                new Dog("Ne3nayuImenaSobak")
        };

        move(animals);

        System.out.println("Количество котов: "+ numberCatOrDog(animals, "cat"));
        System.out.println("Количество cобак: "+ numberCatOrDog(animals, "dog"));
        System.out.println("Количество животных: "+ animals.length);
    }

    public static void move(Animal[] animals) {
        for (Animal animal: animals
             ) {
            animal.run(300);
            animal.swim(10);
        }
    }

    public static int numberCatOrDog(Animal[] animals, String who) {
        int n = 0;
        if(who == "cat") {
            for (Animal animal : animals
            ) {
                if (animal instanceof Cat) n++;
            }
        } else if (who == "dog") {
            for (Animal animal : animals
            ) {
                if (animal instanceof Dog) n++;
            }
        }
        return n;
    }
}
