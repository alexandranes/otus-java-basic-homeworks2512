package ru.otus.java.basic.homeworks;

public class AllTerrainVehicle implements Transport {
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

    public AllTerrainVehicle(String type, float gasAmount) {
        this.type = type;
        this.gasAmount = gasAmount;
    }

    @Override
    public boolean move(Person person, float distance, Terrain terrain) {
        if (gasAmount < ((distance * 15) / 100)) {
            System.out.println("Действие невозможно: недостаточно топлива.");
            return false;
        }
        gasAmount -= ((distance * 15) / 100);
        System.out.println("Преодолена дистанция: " + distance + " км, остаток топлива: " + gasAmount + " л.");
        return true;
    }
}
