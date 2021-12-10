package ru.geekbrains.lesson1.member;

public class Robot implements Member{
    private String name;
    private final int MAX_RUN = 2000;
    private final float MAX_JUMP = 0.4F;

    public Robot (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void jump(float height) {
        if (MAX_JUMP > height) {
            System.out.printf("Robot %s jump %f\n", name, height);
        } else {
            System.out.println("Robot can`t jump");
        }
    }

    @Override
    public void run(int length) {
        if (MAX_RUN > length) {
            System.out.printf("Robot %s run %d\n", name, length);
        } else {
            System.out.println("Robot can`t run");
        }
    }

    public int getMAX_RUN() {
        return MAX_RUN;
    }

    public float getMAX_JUMP() {
        return  MAX_JUMP;
    }
}
