package lab01;

import java.util.Scanner;

// Exercise 4.2 2
public class CylinderComputation {
    public static void main(String[] args) {
        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        scanner.close();
        // print result
        printResult(radius, height);
    }

    public static void printResult(double radius, double height) {
        System.out.printf("Base area is: %.2f\n", getBaseArea(radius));
        System.out.printf("Surface area is: %.2f\n", getSurfaceArea(radius));
        System.out.printf("Volume is: %.2f\n", getVolume(radius, height));
    }

    public static double getBaseArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double getSurfaceArea(double radius) {
        return 2.0 * Math.PI * radius + 2.0 * getBaseArea(radius);
    }

    public static double getVolume(double radius, double height) {
        return getBaseArea(radius) * height;
    }
}
