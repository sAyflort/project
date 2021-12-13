/*
Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).

Заметка: Для преобразования строки к числу используйте статический метод класса Integer:
Integer.parseInt(сюда_подать_строку);
Заметка: Если Java не сможет преобразовать входную строку (в строке число криво написано), то будет сгенерировано исключение NumberFormatException.

 */

package ru.geekbrains.lesson2;

import ru.geekbrains.lesson2.Exception.MyArrayDataException;
import ru.geekbrains.lesson2.Exception.MyArraySizeException;

public class MainApp {

    public static void main(String[] args) {
        String[][] strArray = {
                {"1", "1", "1"},
                {"1", "1", ""},
                {"1", "14", "1"}
        };

        try {
            System.out.println(SumArray(strArray));
        }
        catch (MyArraySizeException e) {
            System.out.println("У массива неправильный формат");
        }
        catch (MyArrayDataException e) {
            System.out.printf("Некорректная строка i=%d, j=%d", e.getRow(), e.getColumn());
        }
    }

    public static int SumArray(String[][] s) throws MyArraySizeException, MyArrayDataException {
        for (int i = 0; i < s.length; i++) {
            if (s[i].length != s.length) throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                    try {
                        sum += Integer.parseInt(s[i][j]);
                    }
                    catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
            }
        }
        return sum;
    }
}
