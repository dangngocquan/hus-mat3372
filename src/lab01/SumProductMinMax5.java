package lab01;

import java.util.Scanner;

// Exercise 4.1 1
public class SumProductMinMax5 {
    public static void main(String[] args) {
        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter 2nd integer: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter 3rd integer: ");
        int number3 = scanner.nextInt();
        System.out.print("Enter 4th integer: ");
        int number4 = scanner.nextInt();
        System.out.print("Enter 5th integer: ");
        int number5 = scanner.nextInt();
        scanner.close();
        // print result
        printSumProductMinMax5(number1, number2, number3, number4, number5);
    }

    public static void printSumProductMinMax5(int number1, int number2, int number3, int number4, int number5) {
        System.out.println("The sum is: " + sum5(number1, number2, number3, number4, number5));
        System.out.println("The product is: " + product5(number1, number2, number3, number4, number5));
        System.out.println("The min is: " + min5(number1, number2, number3, number4, number5));
        System.out.println("The max is: " + max5(number1, number2, number3, number4, number5));
    }

    public static int sum5(int number1, int number2, int number3, int number4, int number5) {
        return number1 + number2 + number3 + number4 + number5;
    }

    public static int product5(int number1, int number2, int number3, int number4, int number5) {
        return number1 * number2 * number3 * number4 * number5;
    }

    public static int min5(int number1, int number2, int number3, int number4, int number5) {
        int min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number4 < min) {
            min = number4;
        }
        if (number5 < min) {
            min = number5;
        }
        return min;
    }

    public static int max5(int number1, int number2, int number3, int number4, int number5) {
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number4 > max) {
            max = number4;
        }
        if (number5 > max) {
            max = number5;
        }
        return max;
    }
}
