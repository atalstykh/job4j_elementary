package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[0] != data[i + 1] || data[0] == data[i + 1] && data[i] != result) {
                result = false;
                break;
            }
        }
        return result;
    }
}