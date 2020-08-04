package ru.job4j.profession;

public class Builder extends Profession {
    private String specialty;
    private int experience;
    public Builder(String specialty, int experience) {
        this.specialty = specialty;
        this.experience = experience;
    }
    public void build() {

    }
}
