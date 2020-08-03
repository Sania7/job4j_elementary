package ru.job4j.profession;

public class Programmer extends Profession {
    String specialty;
    int experience;
    public Programmer(String specialty, int experience) {
        this.specialty = specialty;
        this.experience = experience;
    }
}
