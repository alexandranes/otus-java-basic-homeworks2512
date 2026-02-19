package ru.otus.java.basic.homeworks;

public class Application {
    public static void main(String[] args) {

        Person person = new Person("Боб", 1000.0f);
        Car car = new Car("седан Audi", 60.0f);
        AllTerrainVehicle atv = new AllTerrainVehicle("вездеход Polaris", 40.0f);
        Horse horse = new Horse("арабская гнедая лошадь", 1000.0f);
        Bicycle bicycle = new Bicycle("горный велосипед Cannondale");

        person.getOnTransport(car);
        person.getOnTransport(car);
        person.getOffTransport();
        person.getOffTransport();

        person.getOnTransport(car);
        person.getOnTransport(atv);

        person.move(person, car, 30.0f, Terrain.PLAIN);
        person.getOffTransport();
        person.getOnTransport(atv);
        person.move(person, atv, 30.0f, Terrain.PLAIN);
        person.getOffTransport();
        person.getOnTransport(horse);
        person.move(person, horse, 10.0f, Terrain.PLAIN);
        person.getOffTransport();
        person.getOnTransport(bicycle);
        person.move(person, bicycle, 5.0f, Terrain.PLAIN);
        person.getOffTransport();
        person.move(person, bicycle, 5.0f, Terrain.PLAIN);

        person.getOnTransport(car);
        person.move(person, car, 1000.0f, Terrain.PLAIN);
        person.move(person, car, 30.0f, Terrain.THICK_FOREST);
        person.move(person, car, 1000.0f, Terrain.THICK_FOREST);
        person.getOffTransport();

        person.getOnTransport(bicycle);
        person.move(person, bicycle, 1000.0f, Terrain.PLAIN);
        person.getOffTransport();

        person.getOnTransport(horse);
        person.move(person, horse, 1000.0f, Terrain.PLAIN);
        person.getOffTransport();
    }
}