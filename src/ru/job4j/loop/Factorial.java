package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Factorial.calc(n));
        n = 0;
        System.out.println(Factorial.calc(n));
    }
}
