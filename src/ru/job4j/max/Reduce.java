package ru.job4j.max;
/**
 * 5.1. Зона видимости переменных [#320247]
 * Исправить ошибку, объяснить почему возникла эта ситуация.
 *
 */
public class Reduce {
    private int[] array;

    public void to(int[] array) {
        array = array;
    }
    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
