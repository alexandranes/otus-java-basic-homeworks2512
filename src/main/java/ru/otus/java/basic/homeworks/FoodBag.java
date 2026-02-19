package ru.otus.java.basic.homeworks;

public class FoodBag {
    private int foodAmount;

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public FoodBag(int foodAmount) {
        this.foodAmount = foodAmount;
    }
}