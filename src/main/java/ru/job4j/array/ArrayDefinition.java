package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println();
        String[] names = new String[4];
        names[0] = "Иван";
        names[1] = "Виктория";
        names[2] = "Евгений";
        names[3] = "Олег";
        for (String string: names) {
            System.out.println(string);
        }
    }

}
