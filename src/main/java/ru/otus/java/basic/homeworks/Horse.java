package ru.otus.java.basic.homeworks;

public class Horse implements Transport {
    private String type;
    private float endurance;

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getEndurance() {
        return endurance;
    }
    public void setEndurance(float endurance) {
        this.endurance = endurance;
    }

    public Horse(String type, float endurance) {
        this.type = type;
        this.endurance = endurance;
    }

    @Override
    public boolean move(Person person, float distance, Terrain terrain) {
        if (endurance < ((distance * 3_000) / 100) && (terrain == Terrain.SWAMPLAND)) {
            System.out.println("Действие невозможно: недостаточно энергии и выбран непроходимый тип местности.");
            return false;
        } else if (endurance < ((distance * 3_000) / 100)) {
            System.out.println("Действие невозможно: недостаточно энергии.");
            return false;
        } else if (terrain == Terrain.SWAMPLAND) {
            System.out.println("Действие невозможно: выбран непроходимый тип местности.");
            return false;
        }
        endurance -= ((distance * 3_000) / 100);
        System.out.println("Преодолена дистанция: " + distance + " км, остаток энергии: " + endurance + ".");
        return true;
    }
}