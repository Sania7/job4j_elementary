package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value){
        int rsl = value / 70;
        return rsl;
    }
    public static int rubleToDollar(int value){
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollars = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro. ");
        System.out.println("120 rubles are " + dollars + " dollars");
        int in = 120;
        int expected = 2;
        int out = rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
    }
}
