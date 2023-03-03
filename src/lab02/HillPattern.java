package lab02;

import java.util.Scanner;

// Exercise 1.6
public class HillPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();

        drawHillPatternA(size);
        drawHillPatternB(size);
        drawHillPatternC(size);
        drawHillPatternD(size);
    }

    public static void drawHillPatternA(int size) {
        System.out.println("Draw Hill Pattern A, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                int numberCharsNotEmpty = row * 2 + 1;
                int indexStart = size - row - 1;
                int indexEnd = indexStart + numberCharsNotEmpty - 1;
                System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void drawHillPatternB(int size) {
        System.out.println("Draw Hill Pattern B, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                int numberCharsNotEmpty = size * 2 - 1 - row * 2;
                int indexStart = row;
                int indexEnd = indexStart + numberCharsNotEmpty - 1;
                System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
            }
            System.out.println();
        }
    }

    public static void drawHillPatternC(int size) {
        System.out.println("Draw Hill Pattern C, size = " + size + ":");
        for (int row = 0; row < size * 2 - 1; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                if (row <= size-1) {
                    int numberCharsNotEmpty = row * 2 + 1;
                    int indexStart = size - row - 1;
                    int indexEnd = indexStart + numberCharsNotEmpty - 1;
                    System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
                } else {
                    int numberCharsNotEmpty = size * 2 - 1 - (row - size + 1) * 2;
                    int indexStart = row - size + 1;
                    int indexEnd = indexStart + numberCharsNotEmpty - 1;
                    System.out.print((column >= indexStart && column <= indexEnd)? "# " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawHillPatternD(int size) {
        System.out.println("Draw Hill Pattern D, size = " + size + ":");
        for (int row = 0; row < size * 2 - 1; row++) {
            for (int column = 0; column < size * 2 - 1; column++) {
                if (row == 0 || row == size * 2 - 2) {
                    System.out.print("# ");
                } else if (row <= size-1) {
                    int numberCharsEmpty = row * 2 - 1;
                    int indexStart = size - row;
                    int indexEnd = indexStart + numberCharsEmpty - 1;
                    System.out.print((column >= indexStart && column <= indexEnd)? "  " : "# ");
                } else {
                    int numberCharsEmpty = 2 * size - 1 - (row - size + 2) * 2;
                    int indexStart = row - size + 2;
                    int indexEnd = indexStart + numberCharsEmpty - 1;
                    System.out.print((column >= indexStart && column <= indexEnd)? "  " : "# ");
                }
            }
            System.out.println();
        }
    }
}
