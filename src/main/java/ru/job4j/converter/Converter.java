package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float rubleToPoundSterling(float value) {
        float rsl = value / 100;
        return rsl;
    }

    public static float rubleToYuan(float value) {
        float rsl = value / 14;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
        float pound = Converter.rubleToPoundSterling(140);
        System.out.println("140 rubles are " + pound + " pounds.");
        float yuan = Converter.rubleToYuan(140);
        System.out.println("140 rubles are " + yuan + " yuan.");
    }
}
