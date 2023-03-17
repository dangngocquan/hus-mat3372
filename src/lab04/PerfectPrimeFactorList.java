package lab04;

import java.util.Scanner;

// Exercise 3.3
public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperbound = scanner.nextInt();
        scanner.close();

        printResult(upperbound);
    }

    public static void printResult(int upperbound) {
        int count = 0;
        System.out.println("These numbers are equal to the product of prime factors: ");
        for (int number = 1; number <= upperbound; number++) {
            if (isProductOfPrimeFactors(number)) {
                System.out.println(number);
                count++;
            }
        }
        System.out.printf("[%d primes found (%.2f%%)]",
                count, count * 100.0 / upperbound);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int value = 2; value <= Math.sqrt(n); value++) {
            if (n % value == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProductOfPrimeFactors(int number) {
        int product = 1;
        for (int value = 2; value <= number / 2; value++) {
            if (isPrime(value) && number % value == 0) {
                product *= value;
            }
        }
        return number == product;
    }
}
