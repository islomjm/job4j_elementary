package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return first;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(0, 0, 5, 5);
        System.out.println("result (0, 0) to (5, 5) " + result2);
        double result3 = Point.distance(4, 2, 0, 7);
        System.out.println("result (4, 2) to (0, 7) " + result3);
        double result4 = Point.distance(1, 3, 6, 8);
        System.out.println("result (1, 3) to (6, 8) " + result4);
    }
}
