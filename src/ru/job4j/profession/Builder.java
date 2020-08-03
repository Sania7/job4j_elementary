package ru.job4j.profession;

public class Builder extends Profession {
    String specialty;
    int experience;
    public Builder(String specialty, int experience) {
        this.specialty = specialty;
        this.experience = experience;
    }
}
