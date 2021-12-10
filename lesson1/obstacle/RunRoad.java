package ru.geekbrains.lesson1.obstacle;

import ru.geekbrains.lesson1.member.Member;

public class RunRoad implements Obstacle{
    private int lenght;

    public RunRoad(int lenght) {
        this.lenght = lenght;
    }


    @Override
    public boolean cross(Member member) {
        member.run(lenght);
        if(lenght < member.getMAX_RUN()) {
            return true;
        } else {
            return false;
        }
    }
}
