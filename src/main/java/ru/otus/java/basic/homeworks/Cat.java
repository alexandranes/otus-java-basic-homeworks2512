package ru.otus.java.basic.homeworks;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public boolean isHungry() {
        return isHungry;
    }
    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public Cat(String name, int appetite, boolean isHungry) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = isHungry;
    }

    public boolean eat(Plate plate) {
        if (isHungry) {
            if (plate.decreaseFood(appetite)) {
                isHungry = false;
                System.out.println("Кот " + name + " сыт.");
                return true;
            } else {
                System.out.println("Кот " + name + " не может быть накормлен.");
                return false;
            }
        }
        System.out.println("Кот " + name + " не может быть накормлен - он сыт.");
        return false;
    }
}
