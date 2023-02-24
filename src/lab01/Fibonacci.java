package lab01;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonaccisAndAverage(20);
    }

    public static void printFibonaccisAndAverage(int nMax) {
        int n = 3;
        int fn = 2;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int sum = 4;
        double average;

        System.out.printf("The first %d Fibonacci numbers are: \n", nMax);
        System.out.print(fnMinus2 + " " + fnMinus1 + " " + fn);

        n++;
        while (n <= nMax) {
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            fn = fnMinus1 + fnMinus2;
            n++;
            sum += fn;
            System.out.print(" " + fn);
        }

        average = (double) sum / nMax;
        System.out.println("\nThe average is " + average);
    }
}
