package ru.job4j.condition;

import org.junit.Test;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int number = Max.max(1, 2);
        assertThat(number, is(2));
    }
    @Test
    public void whenMax1To2Then1() {
        int num = Max.max(2, 1);
        assertThat(num, is(2));
    }
    @Test
    public void whenLeftEqualsRight() {
        int num = Max.max(2, 2);
        assertThat(num, is(2));
    }
    @Test
    public void whenThree() {
        int num = Max.max(3, 4, 7);
        assertThat(num, is(7));
    }
    @Test
    public void whenFour() {
        int num = Max.max(4, 3, 2, 1);
        assertThat(num, is(4));
    }
}