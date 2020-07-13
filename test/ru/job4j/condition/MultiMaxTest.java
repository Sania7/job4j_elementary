package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax(){
        int result = MultiMax.max(5, 4, 2);
        assertThat(result, is(5));
    }
    @Test
    public void whenAnyway(){
        int result = MultiMax.max(3, 3, 3);
        assertThat(result, is(3));
    }
}