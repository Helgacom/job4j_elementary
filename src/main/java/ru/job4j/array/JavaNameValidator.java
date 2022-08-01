package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (name.codePointAt(0) < 97 || name.codePointAt(0) > 122) {
                valid = false;
                break;
            }
            if (code < 48 && code != 36 || code > 122
                    || (code > 57 && code < 65)
                    || (code > 90 && code < 97 && code != 95)) {
                valid = false;
            }
        }
        return valid;
    }

    public static void main(String[] args) {
        System.out.println(isNameValid("fir##st"));
    }
}
