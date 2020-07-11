package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class SqAreaTest {

    @Test
    public void square() {
        double expected = 2.0;
        double result = SqArea.square(6, 2);
        assertThat(result, is(expected));
    }
}