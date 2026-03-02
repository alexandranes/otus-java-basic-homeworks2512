package ru.otus.java.basic.homeworks;

public class Person {
    private String name;
    private Transport currentTransport;
    private float endurance;
    private final int ENDURANCE_EXPENDITURE_PER_FIXED_KM_NUMBER = 1000;
    private final int FIXED_KM_NUMBER = 100;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
       if (currentTransport == null) {
           currentTransport = transport;
           System.out.println(name + " использует транспорт: " + currentTransport.getType() + ".");
        } else {
           System.out.println("Действие невозможно, " + name + " уже использует транспорт: " + currentTransport.getType() + ".");
        }
   }

    public boolean move(Person person, float distance, Terrain terrain) {
        float enduranceExpenditurePerDistance = ((distance * ENDURANCE_EXPENDITURE_PER_FIXED_KM_NUMBER) / FIXED_KM_NUMBER);
        if (currentTransport != null) {
            return currentTransport.move(person, distance, terrain);
        } else {
            if (endurance < enduranceExpenditurePerDistance) {
                System.out.println("Преодолеть дистанцию пешком невозможно: недостаточно энергии.");
                return false;
            }
            endurance -= enduranceExpenditurePerDistance;
            System.out.println("Пешком преодолена дистанция: " + distance + " км, остаток энергии: " + endurance + ".");
            return true;
        }
    }

    public void getOffTransport() {
        if (currentTransport != null) {
            System.out.println(name + " покинул транспорт: " + currentTransport.getType() + ".");
            currentTransport = null;
        } else {
            System.out.println("Действие невозможно, " + name + " не использует транспорт.");
        }
    }
}
