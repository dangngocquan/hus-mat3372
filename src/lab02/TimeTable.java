package lab02;

import java.util.Scanner;

// Exercise 1.3
public class TimeTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();

        printTimeTable(size);
    }

    public static void printTimeTable(int size) {
        // Print header
        System.out.printf("%5s", "*");
        System.out.print(" |");
        for (int column = 1; column <= size; column++) {
            System.out.printf("%5d", column);
        }
        System.out.println();

        System.out.printf("%5s", "-----");
        System.out.print("--");
        for (int column = 1; column <= size; column++) {
            System.out.printf("%5s", "-----");
        }
        System.out.println();

        // Print body
        for (int row = 1; row <= size; row++) {
            System.out.printf("%5d", row);
            System.out.print(" |");
            for (int column = 1; column <= size; column++) {
                System.out.printf("%5d", (row - 1) * 10 + column);
            }
            System.out.println();
        }
    }
}
