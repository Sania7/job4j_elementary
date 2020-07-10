package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c){
        double p1 = (a + b + c) / 2;
        double rsl = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2,2,2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
