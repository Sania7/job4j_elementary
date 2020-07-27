package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
        }
        return data;
    }
    public static void main(String[] args) {
        int[] n = {5, 45, 34, 234, 64, 2, -2};
        int[] rsl = SortSelected.sort(n);
        for (int index = 0; index < rsl.length; index++) {
            System.out.print(rsl[index] + " ");
        }
    }
}
