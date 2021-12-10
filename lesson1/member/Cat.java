package ru.geekbrains.lesson1.member;

public class Cat implements Member{
    private String name;
    private int age;
    private final int MAX_RUN = 200;
    private final float MAX_JUMP = 1.0F;

    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public void jump(float height) {
        if (MAX_JUMP > height) {
            System.out.printf("Cat %s jump %f\n", name, height);
        } else {
            System.out.println("Cat can`t jump");
        }
    }

    @Override
    public void run(int length) {
        if (MAX_RUN > length) {
            System.out.printf("Cat %s run %d\n", name, length);
        } else {
            System.out.println("Cat can`t run");
        }
    }

    public int getMAX_RUN() {
        return MAX_RUN;
    }

    public float getMAX_JUMP() {
        return  MAX_JUMP;
    }
}
