package ru.otus.java.basic.homeworks;

public class Box {
    private final String size;
    private String color;
    private String item;
    private boolean boxOpen;
    private boolean boxFull;

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
        return boxOpen;
    }
    public void setBoxOpen(boolean boxOpen) {
        this.boxOpen = boxOpen;
    }

    public boolean isBoxFull() {
        return boxFull;
    }
    public void setBoxFull(boolean boxFull) {
        this.boxFull = boxFull;
    }

    public Box(String color, boolean boxOpen, boolean boxFull, String item) {
        this.size = "12x12x12 см";
        this.color = color;
        this.item = item;
        this.boxOpen = boxOpen;
        this.boxFull = boxFull;
    }

    public void info() {
        System.out.println("Коробка размера " + size + ", цвет: " +  color);
        if (boxFull) {
            System.out.println("В коробке " + item + ".");
        } else {
            System.out.println("Коробка пуста.");
        }
    }

    public void open() {
        if (!boxOpen) {
            System.out.println("Коробку открыли.");
            boxOpen = true;
        } else {
            System.out.println("Коробку нельзя открыть, она уже открыта.");
        }
    }

    public void close() {
        if (boxOpen) {
            System.out.println("Коробку закрыли.");
            boxOpen = false;
        } else {
            System.out.println("Коробку нельзя закрыть, она уже закрыта.");
        }
    }

    public void putItem() {
        if (boxOpen) {
            if (!boxFull) {
                boxFull = true;
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
        if (boxOpen) {
            if (boxFull) {
                boxFull = false;
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

