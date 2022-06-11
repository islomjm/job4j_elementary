package ru.job4j.condition;

public class Cinema {
    public static void access(int age) {
        System.out.println("Возраст покупателя : " + age);
        if (age >= 18) {
            System.out.println("Добро пожаловать в кино.");
        } else  {
            System.out.println("Этот фильм не для вас.");
        }
    }

    public static void main(String[] args) {
        Cinema.access(22);
        Cinema.access(16);
    }
}
