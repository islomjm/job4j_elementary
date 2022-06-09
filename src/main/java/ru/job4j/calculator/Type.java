package ru.job4j.calculator;

public class Type {
    public static void main(String[] args) {
        long l = 129;
        byte b = (byte) l;
        System.out.println("long = " + l);
        System.out.println("byte = " + b);
        System.out.println();
        float f = 12358.7f;
        int i = 45981;

        short rsl = (short) (f + i);
        System.out.println("float = " + f);
        System.out.println("int = " + i);
        System.out.println("short = " + rsl);
        System.out.println();
        char c = 45000;
        System.out.println("char = " + c);
        System.out.println("Флоат = " + (float) c);
        System.out.println();
        double d = 121.19;

        byte b1 = (byte) d;
        System.out.println("double = " + d);
        System.out.println("byte = " + b1);
        System.out.println();
        short s = 1500;
        char c1 = (char) s;

        System.out.println("short = " + s);
        System.out.println("char = " + c1);
        System.out.println("double = " + (double) c1);

    }
}
