package ru.job4j.profession;

public class Dentist extends Profession {
    private String specialty;
    private int experience;
    public Dentist(String specialty, int experience) {
        this.specialty = specialty;
        this.experience = experience;
    }
    public void toTreatTeeth() {

    }
}
