package ru.otus.java.basic.homeworks;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // Задача 1
        int[][] array2DimOne = {{0, -6, 5, -3, 2, 1}, {-2, 0, 4, 9, 5, -1}};
        sumOfPositiveElements(array2DimOne);

        // Задача 2
        int size = 10;
        printSquareOfAsterisks(size);

        // Задача 3
        int[][] array2DimTwo = new int [10][10];
        assignZeroToDiagonElem(array2DimTwo);

        // Задача 4
        findMax(array2DimOne);

        // Задача 5
        int[][] array2DimThree = {{2, 4, 3, 8, 11, 2, 4, 9}, {5, 4, 5, 6, 1, 3, 9, 8}};
        sumSecondLineElemOfArray(array2DimThree);
    }
    // Задача 1
    public static void sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Сумма положительных чисел равна " + sum + " для массива: " + Arrays.deepToString(array));
    }

    // Задача 2
    public static void printSquareOfAsterisks(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print('*' + "  ");
            for (int j = 0; j < size - 1; j++) {
                System.out.print('*' + "  ");
            }
            System.out.println();
        }
    }
    // Задача 3
    public static void assignZeroToDiagonElem(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i != j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
    // Задача 4
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент равен " + max + " для массива: " + Arrays.deepToString(array));
        return max;
    }
    // Задача 5
    public static int sumSecondLineElemOfArray(int[][] array) {
        int sum = 0;
        if (array.length == 1) {
            return -1;
        }
        for (int i = 0; i < array[0].length; i++) {
            sum += array[1][i];
        }
        System.out.println("Сумма чисел второй строки равна " + sum + " для массива: " + Arrays.deepToString(array));
        return sum;
    }
}
