/*
1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
 Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
 участники должны выполнять соответствующие действия (бежать или прыгать),
 результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */
package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.member.Cat;
import ru.geekbrains.lesson1.member.Human;
import ru.geekbrains.lesson1.member.Member;
import ru.geekbrains.lesson1.member.Robot;
import ru.geekbrains.lesson1.obstacle.Obstacle;
import ru.geekbrains.lesson1.obstacle.RunRoad;
import ru.geekbrains.lesson1.obstacle.Wall;

public class MainApp {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Wall(0.5F),
                new RunRoad(800)
        };
        Member[] members = {
                new Cat("Nastia", 20),
                new Robot("Genadiy"),
                new Human("Andrey", 120)
        };

        for (Member member:
             members) {
            for (Obstacle obstacle:
                 obstacles) {
                if(!obstacle.cross(member)) break;
            }
        }

    }
}
