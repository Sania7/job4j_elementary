package ru.job4j.condition;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class SqAreaTest {

    @Test
    public void square() {
        double expected = 1;
        double result = SqArea.square(4, 1);
        assertThat(result, is(expected));
    }
    @Test
    public void whenp6k2s2(){
        int k = 2;
        int p = 6;
        double expected = 2.0;
        double s = SqArea.square(p, k);
        assertThat(s, is(expected));
    }
}