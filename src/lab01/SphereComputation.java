package lab01;

import java.util.Scanner;

// Exercise 4.2 1
public class SphereComputation {
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
        System.out.printf("Surface area is: %.2f\n", getSurfaceArea(radius));
        System.out.printf("Volume is: %.2f\n", getVolume(radius));
    }

    public static double getSurfaceArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    public static double getVolume(double radius) {
        return 4.0 / 3.0 * Math.PI * radius * radius * radius;
    }
}
