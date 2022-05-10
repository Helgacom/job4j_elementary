package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {8, 4, 3, 5, 2};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot10ThenMinus1() {
        int[] data = {6, 12, 0, 4, 3, 5, 2};
        int el = 10;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas3Then4() {
        int[] data = {6, 12, 0, 4, 3, 5, 2};
        int el = 3;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}