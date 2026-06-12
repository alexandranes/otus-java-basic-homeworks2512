package ru.otus.java.basic.homeworks;

public class AppArrayDataException extends RuntimeException {
    public AppArrayDataException(String message, NumberFormatException e) {
        super(message, e);
    }
}
