package ru.otus.java.basic.homeworks;

public class Bicycle implements Transport {
    private String type;

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Bicycle(String type) {
        this.type = type;
    }

    @Override
    public boolean move(Person person, float distance, Terrain terrain) {
        if (person.getEndurance() < ((distance * 3_000) / 100) && (terrain == Terrain.SWAMPLAND)) {
            System.out.println("Действие невозможно: недостаточно энергии и выбран непроходимый тип местности.");
            return false;
        } else if (person.getEndurance() < ((distance * 3_000) / 100)) {
            System.out.println("Действие невозможно: недостаточно энергии.");
            return false;
        } else if (terrain == Terrain.SWAMPLAND) {
            System.out.println("Действие невозможно: выбран непроходимый тип местности.");
            return false;
        }
        float a = person.getEndurance();
        a -= ((distance * 3_000) / 100);
        person.setEndurance(a);
        System.out.println("Преодолена дистанция: " + distance + " км, остаток энергии: " + a + ".");
        return true;
    }
}
