package ru.otus.java.basic.homeworks;

public class Bicycle implements Transport {
    private String type;
    private final int RIDER_ENDURANCE_EXPENDITURE_PER_FIXED_KM_NUMBER = 3_000;
    private final int FIXED_KM_NUMBER = 100;

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
        float riderEnduranceExpenditurePerDistance = ((distance * RIDER_ENDURANCE_EXPENDITURE_PER_FIXED_KM_NUMBER) / FIXED_KM_NUMBER);
        if (person.getEndurance() < riderEnduranceExpenditurePerDistance && (terrain == Terrain.SWAMPLAND)) {
            System.out.println("Действие невозможно: недостаточно энергии и выбран непроходимый тип местности.");
            return false;
        } else if (person.getEndurance() < riderEnduranceExpenditurePerDistance) {
            System.out.println("Действие невозможно: недостаточно энергии.");
            return false;
        } else if (terrain == Terrain.SWAMPLAND) {
            System.out.println("Действие невозможно: выбран непроходимый тип местности.");
            return false;
        }
        float a = person.getEndurance();
        a -= riderEnduranceExpenditurePerDistance;
        person.setEndurance(a);
        System.out.println("Преодолена дистанция: " + distance + " км, остаток энергии: " + a + ".");
        return true;
    }
}
