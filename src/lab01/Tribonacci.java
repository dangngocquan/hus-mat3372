package lab01;

// Exercise 3.4 1
public class Tribonacci {
    public static void main(String[] args) {
        printTribonaccisAndAverage(20);
    }

    public static void printTribonaccisAndAverage(int nMax) {
        int n = 4;
        int fn = 4;
        int fnMinus1 = 2;
        int fnMinus2 = 1;
        int fnMinus3 = 1;
        int sum = 4;
        double average;

        System.out.printf("The first %d Tribonacci numbers are: \n", nMax);
        System.out.print(fnMinus3 + " " + fnMinus2 + " " + fnMinus1 + " " + fn);

        n++;
        while (n <= nMax) {
            fnMinus3 = fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            n++;
            sum += fn;
            System.out.print(" " + fn);
        }

        average = (double) sum / nMax;
        System.out.println("\nThe average is " + average);
    }
}
