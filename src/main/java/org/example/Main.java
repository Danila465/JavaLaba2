package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        double y = calculateY(x);

        System.out.println("y(x) = " + y);
    }

    public static double calculateY(double x) {
        if (x <= -1.0 / 2) {
            return -Math.pow(x, 5) + Math.log(Math.abs(Math.pow(x, 3) - Math.abs(x)));
        } else if (x > -1.0 / 2 && x < 1.0 / 2) {
            return Math.tan(x / (1 - Math.pow(x, 2)));
        } else {
            return Math.acos(1 / (4 * x));
        }
    }
}
