package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = SqArea.square(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + result);
        double result1 = SqArea.square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result1);
        double result2 = SqArea.square(8, 1);
        System.out.println("p = 8, k = 1, s = 1, real = " + result2);
        double result3 = SqArea.square(12, 2);
        System.out.println("p = 12, k = 2, s = 2, real = " + result3);
    }
}
