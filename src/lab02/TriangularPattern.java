package lab02;

import java.util.Scanner;

// Exercise 1.4
public class TriangularPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();

        drawTriangularA(size);
        drawTriangularB(size);
        drawTriangularC(size);
        drawTriangularD(size);
    }

    public static void drawTriangularA(int size) {
        System.out.println("Draw triangular A, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < row + 1; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void drawTriangularB(int size) {
        System.out.println("Draw triangular B, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size - row; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void drawTriangularC(int size) {
        System.out.println("Draw triangular C, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < row; column++) {
                System.out.print("  ");
            }
            for (int column = row; column < size; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void drawTriangularD(int size) {
        System.out.println("Draw triangular D, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size - row - 1; column++) {
                System.out.print("  ");
            }
            for (int column = size - row - 1; column < size; column++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
