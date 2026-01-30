package ru.otus.java.basic.homeworks.animals;

public abstract class Animal {
    protected String name;
    protected float runSpeedPerSecond;
    protected float swimSpeedPerSecond;
    protected int endurance;
    protected int distance;
    protected float time;
    protected boolean tired;

    public float getTime() {
        return time;
    }
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public int getEndurance() {
        return endurance;
    }
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    public float getSwimSpeedPerSecond() {
        return swimSpeedPerSecond;
    }
    public void setSwimSpeedPerSecond(float swimSpeedPerSecond) {
        this.swimSpeedPerSecond = swimSpeedPerSecond;
    }
    public float getRunSpeedPerSecond() {
        return runSpeedPerSecond;
    }
    public void setRunSpeedPerSecond(float runSpeedPerSecond) {
        this.runSpeedPerSecond = runSpeedPerSecond;
    }

    public float run(int distance) {
        if (endurance <= 0 || endurance < distance) {
            tired = true;
        }
        if (!tired) {
            time = distance / runSpeedPerSecond;
            endurance -= distance;
            System.out.println(name + ": бег на дистанцию " + distance + " м, потрачено времени: " + time + " c.");
            info();
            return time;
        } else {
            time = -1.0f;
            System.out.println(name + " не может бежать, недостаточно выносливости для забега на дистанцию: " + distance + " м.");
            info();
            return time;
        }
    }
    public abstract float swim(int distance);

    public void info() {
        if (endurance <= 0) {
            System.out.println(name + " имеет уровень выносливости: 0. Усталость есть.");
        } else {
            System.out.println(name + " имеет уровень выносливости: " + endurance + ". Усталости нет.");
        }
    }
}