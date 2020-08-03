package ru.job4j.profession;

public class Surgeon extends Profession {
    String specialty;
    int experience;
    public Surgeon(String specialty, int experience) {
        this.specialty = specialty;
        this.experience = experience;
    }
}
