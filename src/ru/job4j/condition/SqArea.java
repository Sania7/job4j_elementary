package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k){
        int h = p / (2 * (k + 1));
        int W = h * k;
        int s = W * h;
        return s;

    }

    public static void main(String[] args) {
        double result = SqArea.square(4,1);
        System.out.println(" p = 4, k = 1, s = 2, real = " + result);
    }
}
