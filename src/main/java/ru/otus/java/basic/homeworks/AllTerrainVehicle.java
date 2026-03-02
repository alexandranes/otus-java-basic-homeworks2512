package ru.otus.java.basic.homeworks;

public class AllTerrainVehicle implements Transport {
    private String type;
    private float gasAmount;
    private final int GAS_EXPENDITURE_PER_FIXED_KM_NUMBER = 15;
    private final int FIXED_KM_NUMBER = 100;

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
        float gasExpenditurePerDistance = ((distance * GAS_EXPENDITURE_PER_FIXED_KM_NUMBER) / FIXED_KM_NUMBER);
        if (gasAmount < gasExpenditurePerDistance) {
            System.out.println("Действие невозможно: недостаточно топлива.");
            return false;
        }
        gasAmount -= gasExpenditurePerDistance;
        System.out.println("Преодолена дистанция: " + distance + " км, остаток топлива: " + gasAmount + " л.");
        return true;
    }
}