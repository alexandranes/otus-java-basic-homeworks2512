package ru.otus.java.basic.homeworks.lesson3;

public class App {
    public static void main(String[] args) {
        System.out.println("Homeworks");
        greetings();
        checkSign(1,2,3);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(10, 5, true);
    }
    // Задача 1
    public static void greetings() {
        System.out.println("Hello\nworld\nfrom\nJava");
    }
    // Задача 2
    public static void checkSign(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // Задача 3
    public static void selectColor() {
        int data = 10;
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }
    // Задача 4
    public static void compareNumbers() {
        int d = 5;
        int e = 10;
        if (d >= e) {
            System.out.println("d >= e");
        } else {
            System.out.println("d < e");
        }
    }
    // Задача 5
    public static void addOrSubtractAndPrint(int intValue, int delta, boolean increment) {
        if (increment) {
            intValue += delta;
        }
        if (!increment) {
            intValue -= delta;
        }
        System.out.print(intValue);
    }
}
