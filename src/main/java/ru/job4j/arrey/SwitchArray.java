package ru.job4j.arrey;

public class SwitchArray {
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[5];
        array[5] = temp;
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] numbs = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(numbs);
        for (int i : rsl) {
            System.out.println(i);
        }
    }
}
