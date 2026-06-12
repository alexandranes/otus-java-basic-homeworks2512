package ru.otus.java.basic.homeworks;

public class Application {
    public static void main(String[] args) {
        String[][] bigStringArrayOfNum = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            System.out.println("Сумма элементов массива: " + convertToIntAndSum(bigStringArrayOfNum));
        } catch (AppArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (AppArrayDataException e) {
            System.out.println(e.getMessage());
        }

        String[][] smallStringArrayOfNum = {{"1", "1", "1"}, {"1", "1", "1"}, {"1", "1", "1"}, {"1", "1", "1"}};
        try {
            convertToIntAndSum(smallStringArrayOfNum);
        } catch (AppArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (AppArrayDataException e) {
            System.out.println(e.getMessage());
        }

        String[][] stringArrayOfNumAndLet = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "a"}};
        try {
            convertToIntAndSum(stringArrayOfNumAndLet);
        } catch (AppArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (AppArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int convertToIntAndSum(String[][] array) {
        if (array.length != 4) {
            throw new AppArraySizeException("Неверный размер данных. Количество строк не равно 4.");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new AppArraySizeException("Неверный размер данных. Количество столбцов в строке " + i + " не равно 4.");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Неверный формат данных в ячейке [" + i + "][" + j + "]: " + array[i][j], e);
                }
            }
        }
        return sum;
    }
}