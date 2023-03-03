package lab02;

import java.util.Scanner;

// Exercise 1.5
public class BoxPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();

        drawBoxA(size);
        drawBoxB(size);
        drawBoxC(size);
        drawBoxD(size);
    }

    public static void drawBoxA(int size) {
        System.out.println("Draw box A, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print((column == 0 || column == size - 1)? "# " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawBoxB(int size) {
        System.out.println("Draw box B, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print((column == row)? "# " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawBoxC(int size) {
        System.out.println("Draw box C, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print((column == size - row - 1)? "# " : "  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawBoxD(int size) {
        System.out.println("Draw box D, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print((column == row || column == size - row - 1)? "# " : "  ");
                }
            }
            System.out.println();
        }
    }
}
