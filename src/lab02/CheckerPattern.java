package lab02;

import java.util.Scanner;

// Exercise 1.2
public class CheckerPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        scanner.close();

        drawCheckerPatternUsingForLoop(size);
    }

    public static void drawCheckerPatternUsingForLoop(int size) {
        System.out.println("Draw checker pattern using for-loop, size = " + size + ":");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print(row % 2 == 0? "# " : " #");
            }
            System.out.println();
        }
    }
}
