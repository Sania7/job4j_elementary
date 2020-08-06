package ru.job4j.pojo.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alexandr");
        student.setPatronymic("Alexandrovich");
        student.setSurname("Bannikov");
        student.setGroup("7");
        student.setReceipt(new Date());

        System.out.println(student.getSurname() + " " + student.getName() + " " + student.getPatronymic()
                + " student of group number "  + student.getGroup() + " " + student.getReceipt());
    }
}
