package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int max = left > right ? left : right;
        return max;
    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static void main(String[] args) {
        int number = Max.max(1, 2);
        System.out.println(number);
        int num = Max.max(2, 1);
        System.out.println(num);
        num = Max.max(2, 2);
        System.out.println(num);
    }

}
