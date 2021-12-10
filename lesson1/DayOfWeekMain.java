package ru.geekbrains.lesson1;
import ru.geekbrains.lesson1.DayOfWeek;
public class DayOfWeekMain {
    public static void main(String[] args) {
        System.out.print(getWorkingHours(DayOfWeek.SATURDAY));
    }

    private static String getWorkingHours(DayOfWeek day) {
            int hour;
            if(day.getIndex() <= 5) {
                hour = 8*(6-day.getIndex());
                return hour+"";
        } else {
                return "Выходной";
            }
    }


}
