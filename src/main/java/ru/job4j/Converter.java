package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float dollar = Converter.rubleToDollar(240);
        System.out.println("240 rubles are " + dollar + " dollars.");
        float in2 = 240;
        float expected2 = 4;
        float out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected == out;
        System.out.println("240 rubles are 4. Test result : " + passed2);
    }
}
