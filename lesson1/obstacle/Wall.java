package ru.geekbrains.lesson1.obstacle;

import ru.geekbrains.lesson1.member.Member;

public class Wall implements Obstacle{
    private float height;

    public Wall(float height) {
        this.height = height;
    }


    @Override
    public boolean cross(Member member) {
        member.jump(height);
        if(height < member.getMAX_JUMP()) {
            return true;
        } else {
            return false;
        }
    }
}
