package ru.otus.java.basic.homeworks;

public class Plate {
    private int maxFoodAmount;
    private int currentFoodAmount;

    public int getMaxFoodAmount() {
        return maxFoodAmount;
    }
    public void setMaxFoodAmount(int maxFoodAmount) {
        this.maxFoodAmount = maxFoodAmount;
    }
    public int getCurrentFoodAmount() {
        return currentFoodAmount;
    }
    public void setCurrentFoodAmount(int currentFoodAmount) {
        this.currentFoodAmount = currentFoodAmount;
    }

    public Plate(int maxFoodAmount, int currentFoodAmount) {
        this.maxFoodAmount = maxFoodAmount;
        this.currentFoodAmount = currentFoodAmount;
    }

    public void increaseFood(FoodBag foodBag) {
        if (currentFoodAmount < maxFoodAmount) {
            int a = (maxFoodAmount - currentFoodAmount);
            currentFoodAmount = (currentFoodAmount + a);
            int b = foodBag.getFoodAmount();
            b -= a;
            foodBag.setFoodAmount(b);
            System.out.println("Количество еды в тарелке увеличено до: " + currentFoodAmount);
            System.out.println("Количество еды в мешке уменьшено до: " + foodBag.getFoodAmount());
        }
    }

    public boolean decreaseFood(int i) {
        if (currentFoodAmount >= i) {
            currentFoodAmount -= i;
            System.out.println("Количество еды в тарелке уменьшено до: " + currentFoodAmount);
            return true;
        } else {
            System.out.println("В тарелке недостаточно еды.");
            return false;
        }
    }

    public void info() {
        System.out.println("Количество еды в тарелке: " + currentFoodAmount);
    }
}
