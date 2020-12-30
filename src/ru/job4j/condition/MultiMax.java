package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        boolean test = first > second;
        if (test) {
            if (first > third) {
                return first;
            }
        } else {
            test = second > third;
            return test ? second : third;
        }
        return third;
    }
}

