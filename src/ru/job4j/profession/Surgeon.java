package ru.job4j.profession;

public class Surgeon extends Profession {
    private String specialty;
    private int experience;
    public Surgeon(String specialty, int experience) {
        this.specialty = specialty;
        this.experience = experience;
    }
    public void operate() {

    }
}
