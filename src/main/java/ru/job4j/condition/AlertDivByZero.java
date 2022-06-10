package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Число 0 делить нельзя.");
        }
        if (number <= 0) {
            System.out.println("Это  отрицательное число.");
        }
    }
}
