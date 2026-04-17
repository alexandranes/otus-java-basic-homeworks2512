package ru.otus.java.basic.homeworks;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // Задача 1
        fillListWithinGivenNumRange(1, 10);
        // Задача 2
        List<Integer> listTwo = new ArrayList<>(List.of(6,3,7,2,9,5,1));
        sumElemBiggerThanFive(listTwo);
        // Задача 3
        List<Integer> listThree = new ArrayList<>(List.of(6,3,7,2,9,5,1));
        replaceElemWithGivenNum(3, listThree);
        // Задача 4
        List<Integer> listFour = new ArrayList<>(List.of(6,3,7,2,9,5,1));
        incrementElemByGivenNum(10, listFour);
        // Задача 5
        List<Employee> listOfEmployees = new ArrayList<>(List.of(
                new Employee("Иванов Иван Иванович",40),
                new Employee("Петров Петр Петрович", 52),
                new Employee("Сидоров Иван Иванович", 31),
                new Employee("Капустин Сергей Сергеевич", 25),
                new Employee("Сергеева Ольга Константиновна", 43),
                new Employee("Иванова Дарья Владимировна", 20),
                new Employee("Кузнецов Петр Владимирович", 48),
                new Employee("Александров Александр Александрович", 35),
                new Employee("Алексеева Юлия Алексеевна", 41),
                new Employee("Кузнецова София Дмитриевна", 22)
                ));
        provideEmployeesNames(listOfEmployees);
        // Задача 6
        provideEmployeesOfGivenAgeOrOlder(listOfEmployees, 25);
        // Задача 7
        ensureThatEmployeesAverageAgeIsGreaterThanGiven(listOfEmployees, 30);
        // Задача 8
        provideYoungestEmployee(listOfEmployees);
    }

    // Задача 1
    public static List<Integer> fillListWithinGivenNumRange(int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    // Задача 2
    public static int sumElemBiggerThanFive(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 5) {
                sum += list.get(i);
            }
        }
        return sum;
    }

    // Задача 3
    public static void replaceElemWithGivenNum(int input, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, input);
        }
        System.out.println(list);
    }

    // Задача 4
    public static void incrementElemByGivenNum(int input, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (list.get(i) + input));
        }
        System.out.println(list);
    }

    // Задача 5
    public static List<String> provideEmployeesNames(List<Employee> list) {
        List<String> employeesNames = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            employeesNames.add(list.get(i).getName());
        }
        return employeesNames;
    }

    // Задача 6
    public static List<Employee> provideEmployeesOfGivenAgeOrOlder(List<Employee> list, int input) {
        List<Employee> employeesOfGivenAgeOrOlder = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() >= input) {
                employeesOfGivenAgeOrOlder.add(list.get(i));
            }
        }
        return employeesOfGivenAgeOrOlder;
    }

    // Задача 7
    public static boolean ensureThatEmployeesAverageAgeIsGreaterThanGiven(List<Employee> list, int input) {
        double a = 0;
        double averageEmployeeAge = 0;
        boolean isEmployeesAverageAgeGreaterThanGiven = false;
        for (int i = 0; i < list.size(); i++) {
            a += list.get(i).getAge();
            averageEmployeeAge = (a / list.size());
        }
        if (averageEmployeeAge > input) {
            isEmployeesAverageAgeGreaterThanGiven = true;
        }
        return isEmployeesAverageAgeGreaterThanGiven;
    }

    // Задача 8
    public static Employee provideYoungestEmployee(List<Employee> list) {
        Employee youngestEmployee = list.getFirst();
        for (int i = 0; i < list.size(); i++) {
            if (youngestEmployee.getAge() > list.get(i).getAge()) {
                youngestEmployee = list.get(i);
            }
        }
        return youngestEmployee;
    }
}