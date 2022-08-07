package ru.job4j.array;

public class LengthArrayArrays2 {
    public static void main(String[] args) {
        int[][] numbers = {{8}, {6, 3}, {4, 2, 8}, {1, 9, 5, 3}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен " + numbers[i].length
            );
        }
    }
}
