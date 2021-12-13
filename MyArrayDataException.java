package ru.geekbrains.lesson2.Exception;

public class MyArrayDataException extends  RuntimeException{
    private int row, column;

    public MyArrayDataException(int row, int column) {
        super("Некорректная строка i = " + row + ", j = " + column);
        this.row= row;
        this.column = column;
    }


    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

}
