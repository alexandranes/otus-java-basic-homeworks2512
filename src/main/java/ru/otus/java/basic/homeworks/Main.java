package ru.otus.java.basic.homeworks;

public class Main {
    public static void main(String[] args) {
        FoodBag foodBag = new FoodBag(2_000);
        Plate plate = new Plate(90, 90);

        Cat[] cats = {
                new Cat("Кузя", 20, true),
                new Cat("Мурзик", 40, true),
                new Cat("Барсик", 30, true),
                new Cat("Дымок", 10, true),
        };

        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.increaseFood(foodBag);
        for (Cat cat : cats) {
            cat.eat(plate);
        }
    }
}