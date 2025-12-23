package ru.otus.java.basic.homeworks;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        System.out.println("Homeworks");
        // Задача 1
        String StringToPrintNTimes = ("Java");
        printStringNTimes(StringToPrintNTimes, 3);
        // Задача 2
        int[] arrayToSumFives = {2, 5, 8, 5, 4, 3, 5};
        sumAndPrintArrayElemBiggerThanFive(arrayToSumFives);
        // Задача 3
        int[] fillWithArgs = new int[20];
        fillArrayWithArg(fillWithArgs, 10);
        // Задача 4
        int[] incrementedArray = {2, 1, 4, 7, 5, 9};
        incrementEachArrayElemByArg(incrementedArray, 2);
        // Задача 5
        int[] arraySummedHalfByHalf = {2, 4, 3, 8, 11, 2, 4, 9};
        printWhichArrayHalfIsBigger(arraySummedHalfByHalf);
    }
    // Задача 1
    public static void printStringNTimes(String input, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(input);
        }
    }
    // Задача 2
    public static void sumAndPrintArrayElemBiggerThanFive(int[] in) {
        int sumFives = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 5) {
                sumFives += in[i];
            }
        }
        System.out.println("Сумма чисел 5 равна " + sumFives + " для массива: " + Arrays.toString(in));
    }
    // Задача 3
    public static void fillArrayWithArg(int[] in, int value) {
        for (int i = 0; i < in.length; i++) {
            in[i] = value;
        }
        System.out.println(Arrays.toString(in));
    }
    // Задача 4
    public static void incrementEachArrayElemByArg(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            input[i] += value;
        }
        System.out.println(Arrays.toString(input));
    }
    // Задача 5
    public static void printWhichArrayHalfIsBigger(int[] in) {
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        for (int i = 0; i < in.length / 2; i++) {
            sumLeftHalf += in[i];
        }
        for (int i = in.length / 2; i < in.length; i++) {
            sumRightHalf += in[i];
        }
        if (sumLeftHalf > sumRightHalf) {
            System.out.println("Сумма левой половины элементов больше суммы правой для массива: " + Arrays.toString(in));
        } else {
            System.out.println("Сумма правой половины элементов больше суммы левой для массива: " + Arrays.toString(in));
        }
    }
}
