package lab01;

import java.util.Scanner;

// Exercise 4.6
public class InputValidation {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a number between 0-10 or 90-100: ");
            number = scanner.nextInt();
        } while (!isValid(number));
    }

    public static boolean isValid(int number) {
        if ((0 <= number && number <= 10)
                || (90 <= number && number <= 100)) {
            System.out.println("You have entered: " + number);
            return true;
        } else {
            System.out.println("Invalid input, try again ...");
            return false;
        }
    }
}
