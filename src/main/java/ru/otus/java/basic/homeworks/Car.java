package ru.otus.java.basic.homeworks;

public class Car implements Transport {
    private String type;
    private float gasAmount;

    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(float gasAmount) {
        this.gasAmount = gasAmount;
    }

    public Car(String type, float gasAmount) {
        this.type = type;
        this.gasAmount = gasAmount;
    }

    @Override
    public boolean move(Person person, float distance, Terrain terrain) {
        if (gasAmount < ((distance * 8) / 100) && (terrain == Terrain.THICK_FOREST || terrain == Terrain.SWAMPLAND)) {
            System.out.println("Действие невозможно: недостаточно топлива и выбран непроходимый тип местности.");
            return false;
        } else if (gasAmount < ((distance * 8) / 100)) {
            System.out.println("Действие невозможно: недостаточно топлива.");
            return false;
        } else if (terrain == Terrain.THICK_FOREST || terrain == Terrain.SWAMPLAND) {
            System.out.println("Действие невозможно: выбран непроходимый тип местности.");
            return false;
        }
        gasAmount -= ((distance * 8) / 100);
        System.out.println("Преодолена дистанция: " + distance + " км, остаток топлива: " + gasAmount + " л.");
        return true;
    }
}
