package lab03;

import java.util.Scanner;

// Exercise 1.2
public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numberItems = scanner.nextInt();
        System.out.print("Enter the value of all items (separated by space): ");
        int[] array = new int[numberItems];
        for (int index = 0; index < numberItems; index++) {
            array[index] = scanner.nextInt();
        }
        scanner.close();

        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.printf("%d: ", index);
            for (int count = 0; count < array[index]; count++) {
                System.out.print("*");
            }
            System.out.println("(" + array[index] + ")");
        }
    }
}
