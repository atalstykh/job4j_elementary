package ru.job4j.condition;

public class AlertDivZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-1);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div to 0.");
        }
        if (number < 0) {
            System.out.println("This is negative number");
        }
    }

}
