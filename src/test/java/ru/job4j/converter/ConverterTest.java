package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert150RblThen3Dlr() {
        float in = 150;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert200RbsThen2Pounds() {
        float in = 200;
        float expected = 2;
        float out = Converter.rubleToPoundSterling(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RbsThan10Yuan() {
        float in = 140;
        float expected = 10;
        float out = Converter.rubleToYuan(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}