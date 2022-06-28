package ru.job4j.arrey;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int i = 0; i < right.length; i++) {
            if (left[i] == right[i]) {
                return true;
            }
        }
        return false;
    }
}
