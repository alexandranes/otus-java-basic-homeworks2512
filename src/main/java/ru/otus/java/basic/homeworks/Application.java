package ru.otus.java.basic.homeworks;

import ru.otus.java.basic.homeworks.animals.Cat;
import ru.otus.java.basic.homeworks.animals.Dog;
import ru.otus.java.basic.homeworks.animals.Horse;

public class Application {
    public static void main(String[] args) {

        Cat cat = new Cat("Мурзик", 9.0f, 100);
        Dog dog = new Dog("Бобик", 4.0f, 1.0f, 100);
        Horse horse = new Horse("Ветер", 13.0f, 1.0f, 100);

        cat.info();
        dog.info();
        horse.info();

        cat.run(10);
        cat.run(10);
        cat.run(10);
        cat.run(10);
        cat.run(10);

        dog.run(10);
        dog.run(10);
        dog.run(10);
        dog.run(10);
        dog.run(10);

        horse.run(10);
        horse.run(10);
        horse.run(10);

        cat.swim(10);

        dog.swim(10);
        dog.swim(10);
        dog.swim(10);

        horse.swim(10);
        horse.swim(10);
    }
}