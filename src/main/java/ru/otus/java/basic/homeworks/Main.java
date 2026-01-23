package ru.otus.java.basic.homeworks;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        User[] users = {
                new User("Иванов", "Иван","Иванович", 1986, "iii86@gmail.com"),
                new User("Петров", "Петр","Петрович", 1974, "ppp74@gmail.com"),
                new User("Сидоров", "Иван","Иванович", 1995, "sii95@gmail.com"),
                new User("Капустин", "Сергей","Сергеевич", 2001, "kss01@gmail.com"),
                new User("Сергеева", "Ольга","Константиновна", 1983, "sok83@gmail.com"),
                new User("Иванова", "Дарья","Владимировна", 1967, "idv67gmail.com"),
                new User("Кузнецов", "Петр","Владимирович", 1978, "kpv78@gmail.com"),
                new User("Александров", "Александр","Александрович", 1985, "aaa85@gmail.com"),
                new User("Алексеева", "Юлия","Алексеевна", 1986, "aua86@gmail.com"),
                new User("Кузнецова", "София","Дмитриевна", 1981, "ksd81@gmail.com"),
        };

        for (int i = 0; i < users.length; i++) {
            if (users[i].getYearOfBirth() <= 1986) {
                users[i].info();
                }
            }

        // Задача 2
        Box box = new Box("12x12x12 см","белый", true, false, "чашка");
        box.info();
        box.setColor("коричневый");
        box.close();
        box.open();
        box.putItem();
        box.putItem();
        box.removeItem();
        box.removeItem();
        box.putItem();
        box.removeItem();
    }
}
