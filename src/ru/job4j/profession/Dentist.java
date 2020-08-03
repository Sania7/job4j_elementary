package ru.job4j.profession;

public class Dentist extends Profession {
    String specialty;
    int experience;
    public Dentist(String specialty, int experience) {
        this.specialty = specialty;
        this.experience = experience;
    }
}
