package lab04;

import java.util.Scanner;

// Exercise 3.1
public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperbound = scanner.nextInt();
        scanner.close();

        printResult(upperbound);
    }

    public static void printResult(int upperbound) {
        // Print perfect numbers
        int perfectNumCount = 0;
        System.out.println("These numbers are perfect:");
        for (int number = 1; number <= upperbound; number++) {
            if (isPerfect(number)) {
                perfectNumCount++;
                System.out.print(number + " ");
            }
        }
        System.out.printf("\n[%d perfect numbers found (%.2f%%)]",
                perfectNumCount, perfectNumCount * 100.0 / upperbound);

        // Print numbers are neither perfect nor dificient
        int eitherDeficientNorPerfectCount = 0;
        System.out.println("These numbers are neither deficient nor perfect:");
        for (int number = 1; number <= upperbound; number++) {
            if (!isPerfect(number) && !isDeficient(number)) {
                eitherDeficientNorPerfectCount++;
                System.out.print(number + " ");
            }
        }
        System.out.printf("\n[%d numbers found (%.2f%%)]",
                eitherDeficientNorPerfectCount, eitherDeficientNorPerfectCount * 100.0 / upperbound);
    }

    public static int sumDivisors(int number) {
        int sum = 0;
        for (int value = 1; value < number; value++) {
            if (number % value == 0) {
                sum += value;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int number) {
        return number == sumDivisors(number);
    }

    public static boolean isDeficient(int number) {
        return sumDivisors(number) < number;
    }
}
