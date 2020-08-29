package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {

    }
    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N must not be less than 0.");
        }
        int rsl = 1;
        for (int index = 0; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
