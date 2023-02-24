package lab01;

import java.util.Scanner;

// Exercise 4.5
public class ReverseInt {
    public static void main(String[] args) {
        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int number = scanner.nextInt();
        scanner.close();
        // Result
        System.out.println("The reverse is " + reverseNumber(number));
    }

    public static int reverseNumber(int number) {
        int reverseNum = 0;
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            reverseNum = reverseNum * 10 + digit;
        }
        return reverseNum;
    }
}
