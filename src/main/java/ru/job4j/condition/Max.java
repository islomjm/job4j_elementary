package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        int msg = Max.max(200, 500);
        System.out.println(msg);
        int rsl = max(1, 2, 3, 4);
        System.out.println(rsl);
    }
}
