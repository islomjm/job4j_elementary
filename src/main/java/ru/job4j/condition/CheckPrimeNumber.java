package ru.job4j.condition;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; number <= -1; i++) {
            if ((number % i) == 0) {
                break;
            }
        }
        return prime;
    }
}
