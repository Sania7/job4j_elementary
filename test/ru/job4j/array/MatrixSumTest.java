package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] in = {{10}};
        int expect = 10;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenTwo() {
        int[][] in = {{1, 2}, {1, 2}};
        int expect = 6;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenThree() {
        int[][] in = {{1, 2, 1}, {4, 5, 7}};
        int expect = 20;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
    }
}