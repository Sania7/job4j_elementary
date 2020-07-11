package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 170;
        double expected = 80.5;
        double out = Fit.manWeight((short) in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 170;
        double expected = 69.0;
        double out = Fit.womanWeight((short)in);
        Assert.assertEquals(expected, out, 0.01);
    }
}