package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 50;
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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
        float in1 = 140;
        float expected1 = (float) 2.8;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2.8. Test result : " + passed1);

        float pound = Converter.rubleToPoundSterling(140);
        System.out.println("140 rubles are " + pound + " pounds.");
        float in2 = 140;
        float expected2 = (float) 1.4;
        float out2 = Converter.rubleToPoundSterling(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 1.4. Test result : " + passed2);

        float yuan = Converter.rubleToYuan(140);
        System.out.println("140 rubles are " + yuan + " yuan.");
        float in3 = 140;
        float expected3 = 10;
        float out3 = Converter.rubleToYuan(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("140 rubles are 10. Test result : " + passed3);

    }
}
