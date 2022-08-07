package ru.job4j.condition;

public class Types {
    public static void main(String[] args) {
        long l = 129;
        byte b = (byte) l;
        System.out.println(b);
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(rsl);
        char c = 45000;
        float j = c;
        System.out.println(j);
        double d = 121.19;
        byte v = (byte) d;
        System.out.println(v);
        short s = 1500;
        char g = (char) s;
        double t = (double) g;
        System.out.println(t);
    }
}
