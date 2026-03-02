package ru.otus.java.basic.homeworks;

public class Horse implements Transport {
    private String type;
    private float endurance;
    private final int ENDURANCE_EXPENDITURE_PER_FIXED_KM_NUMBER = 3_000;
    private final int FIXED_KM_NUMBER = 100;

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
        float enduranceExpenditurePerDistance = ((distance * ENDURANCE_EXPENDITURE_PER_FIXED_KM_NUMBER) / FIXED_KM_NUMBER);
        if (endurance < enduranceExpenditurePerDistance && (terrain == Terrain.SWAMPLAND)) {
            System.out.println("Действие невозможно: недостаточно энергии и выбран непроходимый тип местности.");
            return false;
        } else if (endurance < enduranceExpenditurePerDistance) {
            System.out.println("Действие невозможно: недостаточно энергии.");
            return false;
        } else if (terrain == Terrain.SWAMPLAND) {
            System.out.println("Действие невозможно: выбран непроходимый тип местности.");
            return false;
        }
        endurance -= enduranceExpenditurePerDistance;
        System.out.println("Преодолена дистанция: " + distance + " км, остаток энергии: " + endurance + ".");
        return true;
    }
}