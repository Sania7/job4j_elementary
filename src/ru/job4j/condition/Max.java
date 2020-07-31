package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int max = left > right ? left : right;
        return max;
    }
    public static int max(int first, int second, int third) {
      return max(third, max(first, second));
    }
    public static int max(int first, int second, int third, int fourth) {
        int tmp = max(third, fourth);
        return max(first, second, tmp);
    }
    public static void main(String[] args) {
        int number = Max.max(1, 2);
        System.out.println(number);
        int num = Max.max(2, 1);
        System.out.println(num);
        num = Max.max(2, 2);
        System.out.println(num);
        System.out.println(max(3, 4, 7));
        System.out.println(max(4, 3, 2, 1));
    }

}
