package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when21to48then7dot28() {
        double expected = 7.28;
        Point a = new Point(2, 1);
        Point b = new Point(4, 8);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when32to10then2dot82() {
        double expected = 2.82;
        Point a = new Point(3, 2);
        Point b = new Point(1, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when14to17then3() {
        double expected = 3;
        Point a = new Point(1, 4);
        Point b = new Point(1, 7);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when047to248then2dot23() {
        double expected = 2.23;
        Point a = new Point(0, 4, 7);
        Point b = new Point(2, 4, 8);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}