package ru.job4j.calculate;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class X2Test {

    @Test
    public void whenBCZero() {
        int expected = 40;
        int rsl = X2.calc(10,0,0,2);
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenABCXOne() {
        assertThat(X2.calc(1, 1, 1, 1), is(3));
    }

    @Test
    public void whenAZeroBCXOne() {
        assertThat(X2.calc(0, 1, 1, 1), is(2));
    }

    @Test
    public void whenABXOneCZero() {
        assertThat(X2.calc(1, 1, 0, 1), is(2));
    }

    @Test
    public void whenABCOneXZero() {
        assertThat(X2.calc(1, 1, 1, 0), is(1));
    }
}
