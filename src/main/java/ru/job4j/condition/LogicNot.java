package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        int num = -5;
        boolean rst1 = isEven(num);
        System.out.println(rst1);
        boolean rst2 = isPositive(num);
        System.out.println(rst2);
        boolean rst3 = notEven(num);
        System.out.println(rst3);
        boolean rst4 = notPositive(num);
        System.out.println(rst4);
        boolean rst5 = notEvenAndPositive(num);
        System.out.println(rst5);
        boolean rst6 = evenOrNotPositive(num);
        System.out.println(rst6);
    }
}
