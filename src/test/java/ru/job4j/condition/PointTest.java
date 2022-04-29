package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void when21to48then11dot2801098() {
        double expected = 7.2801098;
        int x1 = 2;
        int y1 = 1;
        int x2 = 4;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void when32to10then2dot8284271() {
        double expected = 2.8284271;
        int x1 = 3;
        int y1 = 2;
        int x2 = 1;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void when14to17then3() {
        double expected = 3;
        int x1 = 1;
        int y1 = 4;
        int x2 = 1;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}