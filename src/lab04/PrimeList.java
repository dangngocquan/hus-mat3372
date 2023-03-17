package lab04;

import java.util.Scanner;

// Exercise 3.2
public class PrimeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int upperbound = scanner.nextInt();
        scanner.close();

        printResult(upperbound);
    }

    public static void printResult(int upperbound) {
        int primeNumCount = 0;
        for (int number = 1; number <= upperbound; number++) {
            if (isPrime(number)) {
                System.out.println(number);
                primeNumCount++;
            }
        }
        System.out.printf("[%d primes found (%.2f%%)]",
                primeNumCount, primeNumCount * 100.0 / upperbound);
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
}
