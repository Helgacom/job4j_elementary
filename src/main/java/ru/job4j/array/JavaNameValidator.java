package ru.job4j.array;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean invalid = name.isEmpty()
                || isUpperCase(name.codePointAt(0))
                || isDigit(name.codePointAt(0));
        if (!invalid) {
            for (int i = 0; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (isSpecialSymbol(code)
                        && isUpperLatinLetter(code)
                        && isLowerLatinLetter(code)
                        && isDigit(code)) {
                    invalid = false;
                }
            }
        }
        return !invalid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

    public static void main(String[] args) {
        System.out.println(isNameValid("012"));
    }
}


