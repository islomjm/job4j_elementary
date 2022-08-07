package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Kirill Kalakin";
        names[1] = "Andrey Kalakin";
        names[2] = "Larisa Kalakina";
        names[3] = "Georgy Kalakin";
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}
