package ru.job4j.array;

public class Fragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
          if (array[index] == null) {
              for (int i = index + 1; i < array.length; i++) {
                if (array[i] != null) {
                    array[index] = array[i];
                    array[i] = null;
                    break;
                }
              }
          }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I ", null, " wanna ", null, " be ", null, " compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + "");
        }
    }
}
