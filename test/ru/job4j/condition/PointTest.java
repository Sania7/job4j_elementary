package ru.job4j.condition;

import org.junit.Test;
import java.awt.Point;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void distance() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist, is(expected));
    }
    @Test
    public void distance3d()
}