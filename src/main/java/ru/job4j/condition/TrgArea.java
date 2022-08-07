package ru.job4j.condition;

public class TrgArea { public static double area(double a, double b, double c) {
    double first = (a + b + c) / 2;
    double second = Math.sqrt((first - a) * (first - b) * (first - c) * first);
    return second;
}

    public static void main(String[] args) {
        double rsl = TrgArea.area(10, 10, 10);
        System.out.println("area (3, 4, 5) = " + rsl);
    }
}
