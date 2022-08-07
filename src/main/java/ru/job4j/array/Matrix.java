package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] row = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
               int mathPow = (i + 1) * (j + 1);
               row[i][j] = mathPow;
            }
        }
        return row;
    }
}
