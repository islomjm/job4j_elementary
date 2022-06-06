package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(2, 5, 0, 3);
        System.out.println("result1 (2, 5) to (0, 3) " + result1);
        double result2 = Point.distance(1, 2, 3, 4);
        System.out.println("result2 (1, 2) to (3, 4) " + result2);
    }

}
