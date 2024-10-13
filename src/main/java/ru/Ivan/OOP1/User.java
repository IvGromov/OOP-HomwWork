package ru.Ivan.OOP1;

public class User {
    private String name;
    private String surname;
    private String patronymic;
    private int year;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String name, String surname, String patronymic, int year, String email){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.year = year;
        this.email = email;
    }
    public void info(){
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + year);
        System.out.println("e-mail: " + email);
    }
}
