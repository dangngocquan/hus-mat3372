package lab03;

import java.util.Scanner;

// Exercise 1.1
public class PrintArray {
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

        printArray(array);
    }

    public static void printArray(int[] array) {
        String str = "[";
        for (int element : array) {
            str += element + ", ";
        }
        if (str.length() > 1) {
            str = str.substring(0,str.length() - 2);
        }
        str += "]";
        System.out.printf("The values are: %s\n", str);
    }
}
