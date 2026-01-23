package ru.otus.java.basic.homeworks.animals;

public class Cat extends Animal {

    public Cat(String name, float runSpeedPerSecond, int endurance) {
        this.name = name;
        this.runSpeedPerSecond = runSpeedPerSecond;
        this.endurance = endurance;
        this.distance = distance;
        this.time = time;
        this.tired = tired;
    }
    @Override
    public float swim(int distance) {
        System.out.println("Плавание невыполнимо: кот не умеет плавать.");
        info();
        return -1.0f;
    }
}
