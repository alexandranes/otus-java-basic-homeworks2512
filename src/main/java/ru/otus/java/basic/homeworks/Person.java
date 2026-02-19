package ru.otus.java.basic.homeworks;

public class Person {
    private String name;
    private boolean isOnTransport;
    private Transport currentTransport;
    private float endurance;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnTransport() {
        return isOnTransport;
    }

    public float getEndurance() {
        return endurance;
    }

    public void setEndurance(float endurance) {
        this.endurance = endurance;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public Person(String name, float endurance) {
        this.name = name;
        this.endurance = endurance;
    }

   public void getOnTransport(Transport transport) {
       if (!isOnTransport) {
           currentTransport = transport;
           System.out.println(name + " использует транспорт: " + currentTransport.getType() + ".");
           isOnTransport = true;
        } else {
           System.out.println("Действие невозможно, " + name + " уже использует транспорт: " + currentTransport.getType() + ".");
        }
   }

    public boolean move(Person person, Transport transport, float distance, Terrain terrain) {
        if (isOnTransport) {
            if (transport.equals(currentTransport)) {
                transport.move(person, distance, terrain);
                return true;
            } else {
                System.out.println("Действие невозможно, " + name + " использует другой транспорт.");
                return false;
            }
        } else {
            if (endurance < ((distance * 1000) / 100)) {
                System.out.println("Преодолеть дистанцию пешком невозможно: недостаточно энергии.");
                return false;
            }
            endurance -= ((distance * 1000) / 100);
            System.out.println("Пешком преодолена дистанция: " + distance + " км, остаток энергии: " + endurance + ".");
            return true;
        }
    }

    public void getOffTransport() {
        if (isOnTransport) {
            System.out.println(name + " покинул транспорт: " + currentTransport.getType() + ".");
            currentTransport = null;
            isOnTransport = false;
        } else {
            System.out.println("Действие невозможно, " + name + " не использует транспорт.");
        }
    }
}
