
package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean test = left > right;
        return test ? left : right;
    }

    public static void main(String[] args) {
        int rsl = Max.max(5, 3);
        System.out.println(rsl);

    }
}