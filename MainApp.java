package ru.geekbrains.lesson4;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    private static Scanner sc;
    private static Random rd;
    private static final int SIZE = 3;
    private static final char[][] MAP = new char[SIZE][SIZE];
    private static final char MAP_ELEMENT_VOID = '*';
    private static final char MAP_ELEMENT_X = 'X';
    private static final char MAP_ELEMENT_O = 'O';
    private static char[] checkWin = new char[SIZE];
    private static char[][] MAP_COPY = new char[SIZE][SIZE];

    public  static void main(String[] args) {
        sc = new Scanner(System.in);
        rd = new Random();
        initMap();
        printMap();
        while (!gameContinue()) {
            playerTurn();
            printMap();
            if(gameOver(MAP)) {
                System.out.println("Вы победили");
                break;
            }
            aiTurn();
            printMap();
            if(gameOver(MAP)) {
                System.out.println("Вы проиграли");
                break;
            }
        }
    }

    public static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = MAP_ELEMENT_VOID;
            }
        }
    }

    public static void printMap() {
        System.out.print(" ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + (i+1));
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + MAP[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean gameContinue(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == MAP_ELEMENT_VOID ) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void playerTurn() {
        int x, y;

        do {
            System.out.println("Введите (row, col) ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCorrectValue(x, y));
        MAP[x][y] = MAP_ELEMENT_X;
    }

    public static boolean isCorrectValue(int x, int y) {
        if (x<0||x>SIZE-1||y<0||y>SIZE-1) {
            return false;
        }
        if(MAP[x][y]!=MAP_ELEMENT_VOID) {
            return false;
        }
        return true;
    }

    public static void aiTurn() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP_COPY[i][j] = MAP[i][j];
            }
        }

        if (ii(MAP_ELEMENT_O)) return;
        if (ii(MAP_ELEMENT_X)) return;

        int x, y;
        do {
            x = rd.nextInt(SIZE);
            y = rd.nextInt(SIZE);
        } while(!isCorrectValue(x, y));
        MAP[x][y] = MAP_ELEMENT_O;
    }

    public  static boolean ii(char c) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP_COPY[i][j] == MAP_ELEMENT_VOID) {
                    MAP_COPY[i][j] = c;
                    if(gameOver(MAP_COPY)) {
                        MAP[i][j] = MAP_ELEMENT_O;
                        return true;
                    }
                    MAP_COPY[i][j] = MAP_ELEMENT_VOID;
                }
            }
        }
        return false;
    }


    public static boolean gameOver(char[][] arr) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                checkWin[j] = arr[i][j];
            }
            if (isWin()) return true;
            for (int j = 0; j < SIZE; j++) {
                checkWin[j] = arr[j][i];
            }
            if (isWin()) return true;
        }
        for (int j = 0; j < SIZE; j++) {
            checkWin[j] = arr[j][j];
        }
        if (isWin()) return true;
        for (int j = 0; j < SIZE; j++) {
            checkWin[j] = arr[j][SIZE-1-j];
        }
        if (isWin()) return true;
        return false;
    }

    public static boolean isWin() {
        if (SIZE == 3) {
            for (int i = 0; i < SIZE - 1; i++) {
                if (checkWin[i] != checkWin[i + 1]) return false;
            }
        } else if(SIZE == 5) {
            boolean switch1 = true, switch2 = true;
            for (int i = 0; i < SIZE-2; i++) {
                if (checkWin[i] != checkWin[i + 1]) switch1 = false;
                if  (checkWin[i+1] != checkWin[i + 2]) switch2 = false;
            }
            if (!switch1 && !switch2) return false;
        }
        if (checkWin[1] == MAP_ELEMENT_VOID) return false;
        return true;
    }
}