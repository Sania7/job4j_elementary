package ru.job4j.array;

public class Matrix  {

     @SuppressWarnings("checkstyle:EmptyLineSeparator")
     public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int k = 0; k < table.length; k++) {
                table[i][k] = (i + 1) * (k + 1);
            }
        }
        return table;
    }
}