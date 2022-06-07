package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double diffAndDivision(double first, double second) {
        return diff(first, second)
                + division(first, second);
    }

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double all(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + diff(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + diffAndDivision(200, 20));
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен: " + all(100, 10));
    }

}
