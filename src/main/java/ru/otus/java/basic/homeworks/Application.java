package ru.otus.java.basic.homeworks;

public class Application {
    public static void main(String[] args) {
        String[][] bigStringArrayOfNum = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            System.out.println("Сумма элементов массива: " + convertToIntAndSum(bigStringArrayOfNum));
        } catch (AppArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (AppArrayDataException e) {
            e.printStackTrace();
        }

        String[][] smallStringArrayOfNum = {{"1", "1", "1"}, {"1", "1", "1"}, {"1", "1", "1"}, {"1", "1", "1"}};
        try {
            convertToIntAndSum(smallStringArrayOfNum);
        } catch (AppArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (AppArrayDataException e) {
            e.printStackTrace();
        }

        String[][] stringArrayOfNumAndLet = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "a"}};
        try {
            convertToIntAndSum(stringArrayOfNumAndLet);
        } catch (AppArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (AppArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int convertToIntAndSum(String[][] array) throws AppArraySizeException, AppArrayDataException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 || array[i].length != 4) {
                    throw new AppArraySizeException("Неверный размер данных. Входной массив не равен 4х4.");
                }
            }
        }
        int sum = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            throw new AppArrayDataException("Неверный формат данных. Массив строк содержит элемент(ы) не типа int: ", e);
        }
        return sum;
    }
}