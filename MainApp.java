package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] == 1) {
               arr[i]= 0;
           } else {
               arr[i] = 1;
           }
        }
        System.out.println("1.\n"+Arrays.toString(arr));

        arr = null;
        arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i+1;
        }
        System.out.println("2.\n"+Arrays.toString(arr));

        arr = null;
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]<6) arr1[i]*=2;
        }
        System.out.println("3.\n"+Arrays.toString(arr1));

        arr = null;

        System.out.print("4.\nВведите размер двумерного массива:");
        int n = sc.nextInt();
        int[][] arr2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    arr2[i][j] = 1;
                    arr2[i][n-j-1] = 1;
                }
            }
        }
        print2Array(arr2);

        System.out.print("5.\nВведите длину массива:");
        int len = sc.nextInt();
        System.out.print("Введите значение элементов массива:");
        int initialValue = sc.nextInt();
        System.out.println(Arrays.toString(makeArray(len, initialValue))+"\n6.");

        System.out.println(Arrays.toString(arr1));
        minAndMax(arr1);
        int[] balance = {3, 3, 2, 1, 5, 8};
        System.out.println("7.\n"+Arrays.toString(balance)+"\n"+checkBalance(balance));

        System.out.println("8.\n"+Arrays.toString(shiftArray(balance, -2)));


    }

    public static void print2Array(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int[] makeArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void minAndMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }
        System.out.println("min=" + min);
        System.out.println("max=" + max);
    }

    public static boolean checkBalance(int[] arr) {
        int sumRight=0, sumLeft=0;
        boolean yes = false;
        for (int i = 0; i < arr.length; i++) {
            sumRight += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sumRight -= arr[i];
            sumLeft += arr[i];
            if (sumLeft == sumRight) {
                yes = true;
                break;
            }
        }
        return yes;
    }

    public static int[] shiftArray(int[] arr, int n) {
        if(n>=6) n=n%6;
        if(n<=-6) n=n%6;
        if(n<0) n=arr.length+n;
        for (int j = 0; j < n; j++) {
            int tempSave = arr[0], temp;
            for (int i = 0; i < arr.length; i++) {
                int index = i + 1;
                if (index == arr.length) {
                    index -= arr.length;
                }
                temp = arr[index];
                arr[index] = tempSave;
                tempSave = temp;
            }
        }
        return arr;
    }

}
