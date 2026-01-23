package ru.otus.java.basic.homeworks;

public class User {
   private String lastName;
   private String firstName;
   private String patronymic;
   private int yearOfBirth;
   private String email;

   public String getLastName() {
       return lastName;
   }
   public String getFirstName() {
       return firstName;
   }
    public String getPatronymic() {
        return patronymic;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public User(String lastName, String firstName, String patronymic, int yearOfBirth, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }

    public void info() {
        System.out.println("ФИО: " + lastName + " " +  firstName + " " + patronymic);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("Email: " + email);
    }
}
