package ru.otus.java.basic.homeworks;

public interface Transport {

    String getType();

    boolean move(Person person, float distance, Terrain terrain);

}