package ru.otus.java.basic.homeworks.animals;

public class Cat extends Animal {

    public Cat(String name, float runSpeedPerSecond, int endurance) {
        super();
        this.name = name;
        this.runSpeedPerSecond = runSpeedPerSecond;
        this.endurance = endurance;
    }
    @Override
    public float swim(int distance) {
        System.out.println("Плавание невыполнимо: кот не умеет плавать.");
        info();
        return -1.0f;
    }
}
