package ru.otus.java.basic.homeworks.animals;

public class Dog extends Animal {

    float swimSpeedPerSecond;

    public Dog(String name, float runSpeedPerSecond, float swimSpeedPerSecond, int endurance) {
        this.name = name;
        this.runSpeedPerSecond = runSpeedPerSecond;
        this.swimSpeedPerSecond = swimSpeedPerSecond;
        this.endurance = endurance;
        this.distance = distance;
        this.time = time;
        this.tired = tired;
    }
    @Override
    public float swim(int distance) {
        if (endurance <= 0 || endurance < (distance * 2)) {
            tired = true;
        }
        if (!tired) {
            time = distance / swimSpeedPerSecond;
            endurance -= (distance * 2);
            System.out.println(name + ": заплыв на дистанцию " + distance + " м, потрачено времени: " + time + " c.");
            info();
            return time;
        } else {
            time = -1.0f;
            System.out.println(name + " не может плыть, недостаточно выносливости для заплыва на дистанцию: " + distance + " м.");
            info();
            return time;
        }
    }
}
