package lab01;

import java.util.Scanner;

// Exercise 4.2
public class CircleComputation {
    public static void main(String[] args) {
        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        scanner.close();
        // print result
        printResult(radius);
    }

    public static void printResult(double radius) {
        System.out.printf("Diameter is: %.2f\n", getDiameter(radius));
        System.out.printf("Circumference is: %.2f\n", getCircumference(radius));
        System.out.printf("Area is: %.2f\n", getArea(radius));
    }

    public static double getDiameter(double radius) {
        return 2.0 * radius;
    }

    public static double getCircumference(double radius) {
        return 2.0 * Math.PI * radius;
    }

    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }
}
