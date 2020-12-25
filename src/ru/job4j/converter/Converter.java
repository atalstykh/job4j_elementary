package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int expected1 = 2;
        float expected2 = 3;
        int euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(180);
        boolean passedE = expected1 == euro;
        boolean passedD = expected2 == dollar;
        System.out.println("140 rubles are " + euro + " euro." + "Test result : " + passedE);
        System.out.println("180 rubles are " + dollar + " dollars." + "Test result : " + passedD);
    }
}