package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        /* создаем обьект класса Car*/
        Car car = new Car();
        /* делаем приведение к типу родителя Transport*/
        Transport tp = car;
        /*  делаем приведение  к типу родителя Object*/
//        Object obj = car;
        /* приведение типа при создании обьекта*/
//        Object ocar = new Car();
        /* приведние типа за счет повышение по иерархии */
//        Car carFromObject = (Car) ocar;

    }
}
