package lab01;

// Exercise 3.1
public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        // 0
        printSumAverageUsingForLoop(LOWERBOUND, UPPERBOUND);
        // 1
        printSumAverageUsingWhileDoLoop(LOWERBOUND, UPPERBOUND);
        // 2
        printSumAverageUsingDoWhileLoop(LOWERBOUND, UPPERBOUND);
        // 3

        // 4
        printSumAverageUsingForLoop(111, 8899);

        // 5
        printSumSquares(LOWERBOUND, UPPERBOUND);
        // 6
        printSumOddEven(LOWERBOUND, UPPERBOUND);
    }

    public static void printSumAverageUsingForLoop(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        for (int value = lowerBound; value <= upperBound; value++) {
            sum += value;
            count++;
        }
        System.out.println("Using for loop: ");
        System.out.printf("The sum of %d to %d is %d\n",
                lowerBound, upperBound, sum);
        System.out.printf("The average is %s\n", (double) sum / count);
    }

    // 1
    public static void printSumAverageUsingWhileDoLoop(int lowerBound, int upperBound) {
        int element = lowerBound;
        int sum = 0;
        int count = 0;
        while (element <= upperBound) {
            sum += element;
            element++;
            count++;
        }
        System.out.println("Using while-do loop: ");
        System.out.printf("The sum of %d to %d is %d\n",
                lowerBound, upperBound, sum);
        System.out.printf("The average is %s\n", (double) sum / count);
    }

    // 2
    public static void printSumAverageUsingDoWhileLoop(int lowerBound, int upperBound) {
        int element = lowerBound;
        int sum = 0;
        int count = 0;
        do {
            sum += element;
            element++;
            count++;
        } while (element <= upperBound);
        System.out.println("Using do-while loop: ");
        System.out.printf("The sum of %d to %d is %d\n",
                lowerBound, upperBound, sum);
        System.out.printf("The average is %s\n", (double) sum / count);
    }

    // 5
    public static void printSumSquares(int lowerBound, int upperBound) {
        int sum = 0;
        int count = 0;
        for (int value = lowerBound; value <= upperBound; value++) {
            sum += value * value;
            count++;
        }
        System.out.printf("The sum of the squares from %d to %d is %d\n",
                lowerBound, upperBound, sum);
    }

    // 6
    public static void printSumOddEven(int lowerBound, int upperBound) {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int value = lowerBound; value <= upperBound; value++) {
            if (value % 2 == 0) {
                sumEven += value;
            } else {
                sumOdd += value;
            }
        }
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }

        System.out.printf("The sum of odd numbers from %d to %d is %d.\n",
                lowerBound, upperBound, sumOdd);
        System.out.printf("The sum of even numbers from %d to %d is %d.\n",
                lowerBound, upperBound, sumEven);
        System.out.println("The Absolute difference between the two sums is " + absDiff);
    }

}
