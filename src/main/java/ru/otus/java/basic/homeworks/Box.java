package ru.otus.java.basic.homeworks;

public class Box {
    private final String size;
    private String color;
    private String item;
    private boolean isBoxOpen;
    private boolean isBoxFull;

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }

    public boolean isBoxOpen() {
        return isBoxOpen;
    }
    public void setBoxOpen(boolean isBoxOpen) {
        this.isBoxOpen = isBoxOpen;
    }

    public boolean isBoxFull() {
        return isBoxFull;
    }
    public void setBoxFull(boolean isBoxFull) {
        this.isBoxFull = isBoxFull;
    }

    public Box(String size, String color, boolean isBoxOpen, boolean isBoxFull, String item) {
        this.size = size;
        this.color = color;
        this.item = item;
        this.isBoxOpen = isBoxOpen;
        this.isBoxFull = isBoxFull;
    }

    public void info() {
        System.out.println("Коробка размера " + size + ", цвет: " +  color);
        if (isBoxFull) {
            System.out.println("В коробке " + item + ".");
        } else {
            System.out.println("Коробка пуста.");
        }
    }

    public void open() {
        if (!isBoxOpen) {
            System.out.println("Коробку открыли.");
            isBoxOpen = true;
        } else {
            System.out.println("Коробку нельзя открыть, она уже открыта.");
        }
    }

    public void close() {
        if (isBoxOpen) {
            System.out.println("Коробку закрыли.");
            isBoxOpen = false;
        } else {
            System.out.println("Коробку нельзя закрыть, она уже закрыта.");
        }
    }

    public void putItem() {
        if (isBoxOpen) {
            if (!isBoxFull) {
                isBoxFull = true;
                System.out.println("В коробку положили предмет: " + item + ".");
            } else {
                System.out.println("Коробка заполнена - нельзя положить предмет: " + item+ ".");
            }
        } else {
            System.out.println("Коробка закрыта - нельзя положить предмет: " + item+ ".");
        }
        info();
    }

    public void removeItem () {
        if (isBoxOpen) {
            if (isBoxFull) {
                isBoxFull = false;
                System.out.println("Из коробки вынули предмет: " + item+ ".");
            } else {
                System.out.println("Коробка пуста - нельзя вынуть предмет: " + item+ ".");
            }
        } else {
            System.out.println("Коробка закрыта - нельзя вынуть предмет: " + item+ ".");
        }
        info();
    }
}

