package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Iroda";
        names[1] = "Andrey";
        names[2] = "Larisa";
        names[3] = "Georgy";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
