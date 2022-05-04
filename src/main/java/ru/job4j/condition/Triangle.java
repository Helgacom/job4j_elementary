package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
    }

    public static void main(String[] args) {
        double ab = 3;
        double bc = 4;
        double ac = 5;
        boolean result = exist(ab, ac, bc);
        System.out.println(result);
    }
}
