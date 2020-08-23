package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        /* создаем объект класса Freshman*/
        Freshman freshman = new Freshman();
        /* создаем объект класса Student */
        Student student = new Student();
        /* делаем приведение к типу Student*/
        Student std = freshman;
        /* делаем приведение к типу Object */
        Object obt = student;
        Object object = freshman;
    }
}
